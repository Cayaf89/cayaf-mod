package com.cayaf.cayafmod.items;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.config.GeneralModConfig;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RingOfVeiner extends Item
{
	public RingOfVeiner()
	{
		super((new Item.Properties()).stacksTo(1).tab(CayafMod.cayaf_mod_group));
	}

	public static final int BREAK_DELAY = 1;

	int ringVeinerCooldown = GeneralModConfig.RING_VEINER_COOLDOWN.get();
	boolean reverseRingVeiner = GeneralModConfig.REVERSE_RING_VEINER.get();
	boolean delayedBreakMode = GeneralModConfig.DELAY_BREAK_MODE_VEINER.get();
	boolean shiftKeyPressed = false;


	public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level world, Player player, @NotNull InteractionHand hand)
	{
		ItemStack stack = player.getItemInHand(hand);
        ItemStack equippedMain = player.getMainHandItem();

        if(equippedMain == stack)   //Only works in the main hand
        {
        	shiftKeyPressed = player.isShiftKeyDown();

        	player.getCooldowns().addCooldown(this, ringVeinerCooldown);

        	if(!world.isClientSide)
			{
				Block block;
				BlockState state;
				List<BlockPos> poslist = new ArrayList<BlockPos>();

				for (int x = -5; x <= 5; x++)
				{
					for (int y = 0; y <= 4; y++)
					{
						for (int z = -5; z <= 5; z++)
						{
							BlockPos pos = player.blockPosition().offset(x, y, z);
							state = world.getBlockState(pos);
							block = state.getBlock();

							if (state.is(BlockTags.COAL_ORES) ||
									state.is(BlockTags.COPPER_ORES) ||
									state.is(BlockTags.DIAMOND_ORES) ||
									state.is(BlockTags.EMERALD_ORES) ||
									state.is(BlockTags.GOLD_ORES) ||
									state.is(BlockTags.IRON_ORES) ||
									state.is(BlockTags.LAPIS_ORES) ||
									state.is(BlockTags.REDSTONE_ORES) ||
									block == Blocks.COAL_BLOCK ||
									block == Blocks.COPPER_BLOCK ||
									block == Blocks.DIAMOND_BLOCK  ||
									block == Blocks.EMERALD_BLOCK  ||
									block == Blocks.GOLD_BLOCK ||
									block == Blocks.IRON_BLOCK ||
									block == Blocks.LAPIS_BLOCK ||
									block == Blocks.REDSTONE_BLOCK)
							{
								poslist.add(player.blockPosition().offset(x, y, z));
							}
						}
					}
				}


				if(delayedBreakMode)
				{
					//Test code for block break delay
					if (!poslist.isEmpty())
					{
						List<BlockPos> reversedPosList = reverseList(poslist);
						MinecraftForge.EVENT_BUS.register(new Object()
			            {
			                int delay = BREAK_DELAY;
			                int i = 0;

			                @SubscribeEvent
			                public void onTick(TickEvent.LevelTickEvent event)
			                {
			                    if (delay-- > 0) return;
			                    delay = BREAK_DELAY;
			                    if (i < reversedPosList.size())
			                    {
			                        BlockPos breakPos = reversedPosList.get(i);
			                    	if(shiftKeyPressed)    //NOTE: shift key needs to be held down through the delayed block breaking to get drops
									{
										world.destroyBlock(breakPos, !reverseRingVeiner);
									}
									else
									{
										world.destroyBlock(breakPos, reverseRingVeiner);
									}

			                        i++;
			                    }
			                    else
			                    {
			                        MinecraftForge.EVENT_BUS.unregister(this);
			                    }
			                }
			            });
					}
				}
				else
				{
					//Traditional method of block break, all at once
					if (!poslist.isEmpty())
					{
						for (int i = 0; i <= poslist.size() - 1; i++)
						{
							BlockPos targetpos = poslist.get(i);
							block = world.getBlockState(targetpos).getBlock();

							if(player.isShiftKeyDown())
							{
								world.destroyBlock(targetpos, !reverseRingVeiner);
							}
							else
							{
								world.destroyBlock(targetpos, reverseRingVeiner);
							}
						}
					}
				}
			}
        }
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, stack);
	}

	public static <T> List<T> reverseList(List<T> list)
	{
	    return IntStream.range(0, list.size())
	                   .mapToObj(i -> list.get(list.size() - 1 - i))
	                   .collect(Collectors.toCollection(ArrayList::new));
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(@NotNull ItemStack stack, @Nullable Level worldIn, @NotNull List<Component> tooltip, @NotNull TooltipFlag flagIn)
	{
		String mode;

		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((Component.translatable("item.cayafmod.ring_of_veiner.line1").withStyle(ChatFormatting.GREEN)));

		if(reverseRingVeiner)
		{
			tooltip.add((Component.translatable("item.cayafmod.ring_of_veiner.line5").withStyle(ChatFormatting.YELLOW)));
			tooltip.add((Component.translatable("item.cayafmod.ring_of_veiner.line6").withStyle(ChatFormatting.YELLOW)));
		}
		else
		{
			tooltip.add((Component.translatable("item.cayafmod.ring_of_veiner.line2").withStyle(ChatFormatting.YELLOW)));
			tooltip.add((Component.translatable("item.cayafmod.ring_of_veiner.line3").withStyle(ChatFormatting.YELLOW)));
		}


		tooltip.add((Component.translatable("item.cayafmod.ring_of_veiner.line4").withStyle(ChatFormatting.LIGHT_PURPLE)));
		tooltip.add((Component.translatable("item.cayafmod.ring_of_veiner.cooldown", ringVeinerCooldown).withStyle(ChatFormatting.LIGHT_PURPLE)));

		if(delayedBreakMode)
		{
			mode = "Delayed";
			tooltip.add((Component.translatable("item.cayafmod.ring_of_veiner.mode", mode).withStyle(ChatFormatting.LIGHT_PURPLE)));
		}
		else
		{
			mode = "Instant";
			tooltip.add((Component.translatable("item.cayafmod.ring_of_veiner.mode", mode).withStyle(ChatFormatting.LIGHT_PURPLE)));
		}
	}
}

package com.cayaf.cayafmod.loot_modifiers;

import com.cayaf.cayafmod.items.resources.Blood;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class DataProvider extends GlobalLootModifierProvider
{
    public DataProvider(DataGenerator gen, String modid)
    {
        super(gen, modid);
    }

    @Override
    protected void start()
    {
        add("blood_from_animals", new BloodFromAnimalsModifier(
                new LootItemCondition[] {
                        LootTableIdCondition.builder(new ResourceLocation("cayafmod", "blood_from_animals")).build()
                }, new ItemStack(Blood::new).getItem())
        );
    }
}
package com.cayaf.cayafmod.blocks;

import com.cayaf.cayafmod.CayafMod;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlocksInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CayafMod.MODID);

    public static final RegistryObject<Block> MITHRIL_ORE = registerBlock("mithril_ore", MithrilOre::new);
    public static final RegistryObject<Block> DEEPSLATE_MITHRIL_ORE = registerBlock("deepslate_mithril_ore", DeepslateMithrilOre::new);
    public static final RegistryObject<Block> MITHRIL_BLOCK = registerBlock("mithril_block", MithrilBlock::new);
    public static final RegistryObject<Block> RAW_MITHRIL_BLOCK = registerBlock("raw_mithril_block", RawMithrilBlock::new);

    public static RegistryObject<Block> registerBlock(String name, final Supplier<? extends Block> block) {
        return BLOCKS.register(name, block);
    }
}

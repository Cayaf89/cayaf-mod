package com.cayaf.cayafmod.blocks;

import com.cayaf.cayafmod.CayafMod;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlocksInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CayafMod.MODID);

    public static final RegistryObject<Block> MITHRIL_ORE = BLOCKS.register("mithril_ore", MithrilOre::new);
    public static final RegistryObject<Block> MITHRIL_BLOCK = BLOCKS.register("mithril_block", MithrilBlock::new);
}

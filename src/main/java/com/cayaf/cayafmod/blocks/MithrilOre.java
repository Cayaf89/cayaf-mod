package com.cayaf.cayafmod.blocks;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.material.Material;

public class MithrilOre extends DropExperienceBlock {

    public MithrilOre() {
        super(
                Block.Properties.of(Material.STONE)
                        .strength( 4.0F, 4.0F)
                        .requiresCorrectToolForDrops(),
                UniformInt.of(5, 10)
        );
    }
}

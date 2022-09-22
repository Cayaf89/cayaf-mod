package com.cayaf.cayafmod.blocks;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class DeepslateMithrilOre extends DropExperienceBlock {
    public DeepslateMithrilOre() {
        super(
                Block.Properties.of(Material.STONE)
                        .strength( 5.0F, 4.0F).sound(SoundType.DEEPSLATE)
                        .requiresCorrectToolForDrops(),
                UniformInt.of(5, 10)
        );
    }
}

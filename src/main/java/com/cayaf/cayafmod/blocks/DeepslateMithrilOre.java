package com.cayaf.cayafmod.blocks;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;

public class DeepslateMithrilOre extends DropExperienceBlock {
    public DeepslateMithrilOre() {
        super(
                BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE),
                UniformInt.of(5, 10)
        );
    }
}

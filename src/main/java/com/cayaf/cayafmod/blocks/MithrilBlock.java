package com.cayaf.cayafmod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class MithrilBlock extends Block {

    public MithrilBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND).requiresCorrectToolForDrops().strength(6.0F, 7.0F).sound(SoundType.METAL));
    }
}

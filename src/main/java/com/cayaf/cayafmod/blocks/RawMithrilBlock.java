package com.cayaf.cayafmod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class RawMithrilBlock extends Block {
    public RawMithrilBlock() {
        super(
                BlockBehaviour.Properties.of(Material.STONE)
                        .requiresCorrectToolForDrops()
                        .strength(4.0F, 4.0F)
        );
    }
}

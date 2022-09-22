package com.cayaf.cayafmod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class MithrilBlock extends Block {

    public MithrilBlock() {
        super(Block.Properties.of(Material.METAL)
                .strength(5.0F, 4.0F).sound(SoundType.METAL)
                .requiresCorrectToolForDrops()
        );
    }
}

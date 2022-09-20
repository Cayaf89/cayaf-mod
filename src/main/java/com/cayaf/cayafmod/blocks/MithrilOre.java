package com.cayaf.cayafmod.blocks;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class MithrilOre extends DropExperienceBlock {

    public MithrilOre() {
        super(
                BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.0F, 4.0F),
                UniformInt.of(5, 10)
        );
    }
}

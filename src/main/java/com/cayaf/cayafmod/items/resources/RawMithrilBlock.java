package com.cayaf.cayafmod.items.resources;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.blocks.BlocksInit;
import net.minecraft.world.item.BlockItem;

public class RawMithrilBlock extends BlockItem {
    public RawMithrilBlock() {
        super(BlocksInit.RAW_MITHRIL_BLOCK.get(), (new Properties()).tab(CayafMod.mithril_group));
    }
}

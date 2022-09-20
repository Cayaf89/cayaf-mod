package com.cayaf.cayafmod.items;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.blocks.BlocksInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class MithrilBlock extends BlockItem {
    public MithrilBlock() {
        super(BlocksInit.MITHRIL_BLOCK.get(), (new Item.Properties()).tab(CayafMod.cayaf_mod_group));
    }
}

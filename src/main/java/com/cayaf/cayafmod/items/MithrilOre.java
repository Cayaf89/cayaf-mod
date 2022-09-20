package com.cayaf.cayafmod.items;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.blocks.BlocksInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class MithrilOre extends BlockItem {
    public MithrilOre() {
        super(BlocksInit.MITHRIL_ORE.get(), (new Item.Properties()).tab(CayafMod.cayaf_mod_group));
    }
}

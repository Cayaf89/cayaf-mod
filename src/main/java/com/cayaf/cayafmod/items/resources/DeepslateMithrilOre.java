package com.cayaf.cayafmod.items.resources;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.blocks.BlocksInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class DeepslateMithrilOre extends BlockItem {
    public DeepslateMithrilOre() {
        super(BlocksInit.DEEPSLATE_MITHRIL_ORE.get(), (new Item.Properties()).tab(CayafMod.mithril_group));
    }
}

package com.cayaf.cayafmod.items.tools;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.items.MithrilTiers;
import net.minecraft.world.item.*;

public class MithrilPickaxe extends PickaxeItem {
    public MithrilPickaxe() {
        super(MithrilTiers.MITHRIL, 1, -2.8F, (new Item.Properties()).tab(CayafMod.mithril_group));
    }
}

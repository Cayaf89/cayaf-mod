package com.cayaf.cayafmod.items.tools;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.items.MithrilTiers;
import net.minecraft.world.item.*;

public class MithrilHoe extends HoeItem {
    public MithrilHoe() {
        super(MithrilTiers.MITHRIL, -2, -1.0F, (new Item.Properties()).tab(CayafMod.mithril_group));
    }
}

package com.cayaf.cayafmod.items.tools;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.items.MithrilTiers;
import net.minecraft.world.item.*;

public class MithrilShovel extends ShovelItem {
    public MithrilShovel() {
        super(MithrilTiers.MITHRIL, 1.5F, -3.0F, (new Item.Properties()).tab(CayafMod.mithril_group));
    }
}

package com.cayaf.cayafmod.items.tools;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.items.MithrilTiers;
import net.minecraft.world.item.*;

public class MithrilAxe extends AxeItem {
    public MithrilAxe() {
        super(MithrilTiers.MITHRIL, 6.0F, -3.1F, (new Item.Properties()).tab(CayafMod.mithril_group));
    }
}

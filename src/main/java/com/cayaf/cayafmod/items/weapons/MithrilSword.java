package com.cayaf.cayafmod.items.weapons;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.items.MithrilTiers;
import net.minecraft.world.item.*;

public class MithrilSword extends SwordItem {

    public MithrilSword() {
        super(MithrilTiers.MITHRIL, 3, -2.4F, (new Item.Properties()).tab(CayafMod.mithril_group));
    }
}

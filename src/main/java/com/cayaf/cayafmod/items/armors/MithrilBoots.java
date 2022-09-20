package com.cayaf.cayafmod.items.armors;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.items.MithrilArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

public class MithrilBoots extends ArmorItem {
    public MithrilBoots() {
        super(MithrilArmorMaterials.MITHRIL, EquipmentSlot.FEET, (new Item.Properties()).tab(CayafMod.mithril_group));
    }
}

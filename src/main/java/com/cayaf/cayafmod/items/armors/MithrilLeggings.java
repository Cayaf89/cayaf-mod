package com.cayaf.cayafmod.items.armors;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.items.MithrilArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

public class MithrilLeggings extends ArmorItem {
    public MithrilLeggings() {
        super(MithrilArmorMaterials.MITHRIL, EquipmentSlot.LEGS, (new Item.Properties()).tab(CayafMod.mithril_group));
    }
}

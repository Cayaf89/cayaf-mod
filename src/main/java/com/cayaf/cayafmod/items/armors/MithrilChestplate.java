package com.cayaf.cayafmod.items.armors;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.items.MithrilArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

public class MithrilChestplate extends ArmorItem {
    public MithrilChestplate() {
        super(MithrilArmorMaterials.MITHRIL, EquipmentSlot.CHEST, (new Item.Properties()).tab(CayafMod.mithril_group));
    }
}

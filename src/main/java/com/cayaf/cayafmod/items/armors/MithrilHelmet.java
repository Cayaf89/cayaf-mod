package com.cayaf.cayafmod.items.armors;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.items.MithrilArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

public class MithrilHelmet extends ArmorItem {
    public MithrilHelmet() {
        super(MithrilArmorMaterials.MITHRIL, EquipmentSlot.HEAD, (new Item.Properties()).tab(CayafMod.mithril_group));
    }
}

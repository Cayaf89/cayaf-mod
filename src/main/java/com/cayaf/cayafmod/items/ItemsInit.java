package com.cayaf.cayafmod.items;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.items.weapons.BloodLustDagger;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CayafMod.MODID);

    public static final RegistryObject<Item> RING_OF_VEINER = ITEMS.register("ring_of_veiner", RingOfVeiner::new);
    public static final RegistryObject<Item> BLOOD_LUST_DAGGER = ITEMS.register("blood_lust_dagger", BloodLustDagger::new);
    public static final RegistryObject<Item> BLOOD = ITEMS.register("blood_item", BloodItem::new);

    public static final RegistryObject<Item> MITHRIL_ORE = ITEMS.register("mithril_ore", MithrilOre::new);
    public static final RegistryObject<Item> MITHRIL_BLOCK = ITEMS.register("mithril_block", MithrilBlock::new);
    public static final RegistryObject<Item> MITHRIL = ITEMS.register("mithril", Mithril::new);
}

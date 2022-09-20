package com.cayaf.cayafmod.items;

import com.cayaf.cayafmod.CayafMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CayafMod.MODID);

    public static final RegistryObject<Item> RING_OF_VEINER = ITEMS.register("ring_of_veiner", RingOfVeiner::new);
    public static final RegistryObject<Item> BLOOD_LUST_REGISTRY_OBJECT = ITEMS.register("blood_lust_dagger", BloodLustDagger::new);
    public static final RegistryObject<Item> BLOOD_REGISTRY_OBJECT = ITEMS.register("blood_item", BloodItem::new);
}

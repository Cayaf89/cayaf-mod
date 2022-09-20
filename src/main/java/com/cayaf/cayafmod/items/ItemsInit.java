package com.cayaf.cayafmod.items;

import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.items.armors.MithrilBoots;
import com.cayaf.cayafmod.items.armors.MithrilChestplate;
import com.cayaf.cayafmod.items.armors.MithrilHelmet;
import com.cayaf.cayafmod.items.armors.MithrilLeggings;
import com.cayaf.cayafmod.items.resources.*;
import com.cayaf.cayafmod.items.tools.*;
import com.cayaf.cayafmod.items.weapons.BloodLustDagger;
import com.cayaf.cayafmod.items.weapons.MithrilSword;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemsInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CayafMod.MODID);

    public static final RegistryObject<Item> RING_OF_VEINER = registerItem("ring_of_veiner", RingOfVeiner::new);
    public static final RegistryObject<Item> BLOOD_LUST_DAGGER = registerItem("blood_lust_dagger", BloodLustDagger::new);
    public static final RegistryObject<Item> BLOOD = registerItem("blood_item", Blood::new);

    public static final RegistryObject<Item> MITHRIL_ORE = registerItem("mithril_ore", MithrilOre::new);
    public static final RegistryObject<Item> DEEPSLATE_MITHRIL_ORE = registerItem("deepslate_mithril_ore", DeepslateMithrilOre::new);
    public static final RegistryObject<Item> MITHRIL_BLOCK = registerItem("mithril_block", MithrilBlock::new);
    public static final RegistryObject<Item> RAW_MITHRIL = registerItem("raw_mithril", RawMithril::new);
    public static final RegistryObject<Item> RAW_MITHRIL_BLOCK = registerItem("raw_mithril_block", RawMithrilBlock::new);
    public static final RegistryObject<Item> MITHRIL_INGOT = registerItem("mithril_ingot", MithrilIngot::new);
    public static final RegistryObject<Item> MITHRIL_SWORD = registerItem("mithril_sword", MithrilSword::new);
    public static final RegistryObject<Item> MITHRIL_SHOVEL = registerItem("mithril_shovel", MithrilShovel::new);
    public static final RegistryObject<Item> MITHRIL_PICKAXE = registerItem("mithril_pickaxe", MithrilPickaxe::new);
    public static final RegistryObject<Item> MITHRIL_AXE = registerItem("mithril_axe", MithrilAxe::new);
    public static final RegistryObject<Item> MITHRIL_HOE = registerItem("mithril_hoe", MithrilHoe::new);
    public static final RegistryObject<Item> MITHRIL_HELMET = registerItem("mithril_helmet", MithrilHelmet::new);
    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = registerItem("mithril_chestplate", MithrilChestplate::new);
    public static final RegistryObject<Item> MITHRIL_LEGGINGS = registerItem("mithril_leggings", MithrilLeggings::new);
    public static final RegistryObject<Item> MITHRIL_BOOTS = registerItem("mithril_boots", MithrilBoots::new);

    public static RegistryObject<Item> registerItem(String name, final Supplier<? extends Item> item) {
        return ITEMS.register(name, item);
    }
}

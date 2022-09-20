package com.cayaf.cayafmod.enchantments;

import com.cayaf.cayafmod.CayafMod;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EnchantmentsInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, CayafMod.MODID);

    public static final RegistryObject<Enchantment> DIVINE_REGENERATION_REGISTRY_OBJECT = ENCHANTMENTS.register("divine_regeneration_enchantment", DivineRegenerationEnchantment::new);

}

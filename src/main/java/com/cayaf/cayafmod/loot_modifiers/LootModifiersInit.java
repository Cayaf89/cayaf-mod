package com.cayaf.cayafmod.loot_modifiers;

import com.cayaf.cayafmod.CayafMod;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LootModifiersInit {

    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> GLM = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, CayafMod.MODID);

    public static final RegistryObject<Codec<BloodFromAnimalsModifier>> BLOOD_FROM_ANIMALS = GLM.register("blood_from_animals", BloodFromAnimalsModifier.CODEC);
}

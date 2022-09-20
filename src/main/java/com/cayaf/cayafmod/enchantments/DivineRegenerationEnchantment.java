package com.cayaf.cayafmod.enchantments;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Set;

public class DivineRegenerationEnchantment extends Enchantment {

    public DivineRegenerationEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentCategory.WEAPON, new EquipmentSlot[] { EquipmentSlot.MAINHAND });
    }
    public int getMinCost(int level) {
        return 10 + 10 * (level - 1);
    }

    public int getMaxCost(int level) {
        return 50;
    }

    public int getMaxLevel() {
        return 5;
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity source, @NotNull Entity target, int damage) {
        super.doPostAttack(source, target, damage);
        ItemStack itemMainHand = source.getItemInHand(InteractionHand.MAIN_HAND);
        Map<Enchantment, Integer> enchantments = EnchantmentHelper.getEnchantments(itemMainHand);
        Set<Enchantment> enchantmentsSet = enchantments.keySet();
        for (Enchantment enchantment: enchantmentsSet) {
            if (enchantment instanceof DivineRegenerationEnchantment) {
                double rand = Math.random();
                if (rand <= 0.1 * enchantments.get(enchantment)) {
                    source.removeEffect(MobEffects.REGENERATION);
                    source.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900));
                }
            }
        }
    }
}

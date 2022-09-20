package com.cayaf.cayafmod.items.weapons;

import com.cayaf.cayafmod.CayafMod;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BloodLustDagger extends SwordItem {

    public int charge = 0;

    public int chargeMax = 30;

    public void emptyCharge() {
        this.charge = 0;
    }

    public BloodLustDagger() {
        super(Tiers.NETHERITE, 3, -2.4F, (new Item.Properties()).tab(CayafMod.cayaf_mod_group).fireResistant());
    }

    @Override
    public float getDestroySpeed(@NotNull ItemStack p_43288_, @NotNull BlockState p_43289_) {
        return 0F;
    }

    @Override
    public void onDestroyed(@NotNull ItemEntity source) {}

    @Override
    public boolean canBeDepleted() {
        return false;
    }

    @Override
    public boolean isBarVisible(@NotNull ItemStack p_150899_) {
        return true;
    }

    @Override
    public int getBarWidth(@NotNull ItemStack p_150900_) {
        return Math.round(this.charge * 13.0F / this.chargeMax);
    }

    @Override
    public int getBarColor(@NotNull ItemStack p_150901_) {
        return Mth.color(255, 0, 0);
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack p_43278_, @NotNull LivingEntity p_43279_, @NotNull LivingEntity p_43280_) {
        super.hurtEnemy(p_43278_, p_43279_, p_43280_);
        if (this.charge < this.chargeMax) {
            this.charge++;
        }
        return true;
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, Player player, @NotNull InteractionHand interactionHand) {
        float healAmount = (float) this.charge / 5F;
        if (player.getHealth() < player.getMaxHealth() && healAmount > 0) {
            player.setHealth(Math.min(player.getHealth() + healAmount, player.getMaxHealth()));
            this.emptyCharge();
        }
        return InteractionResultHolder.pass(player.getItemInHand(interactionHand));
    }

}

package org.snow;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FrostEnchantment extends Enchantment {
    public FrostEnchantment() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 2 * level, level - 1));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 20 * 2 * level, level - 1));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 2 * level, level - 1));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20 * 2 * level, level - 1));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20 * 2 * level, level - 1));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 2 * level, level - 1));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 20 * 2 * level, level - 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20 * 2 * level, level - 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20 * 2 * level, level - 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 2 * level, level - 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 20 * 2 * level, level - 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 20 * 2 * level, level - 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20 * level, level - 1));
        }
        super.onTargetDamaged(user, target, 5);
    }
    public void onUserDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 2 * level, level - 1));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 20 * 2 * level, level - 1));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 2 * level, level - 1));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20 * 2 * level, level - 1));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20 * 2 * level, level - 1));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 2 * level, level - 1));
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 20 * 2 * level, level - 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 2 * level, level - 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20 * 2 * level, level - 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20 * 2 * level, level - 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 2 * level, level - 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 20 * 2 * level, level - 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20 * 2 * level, level - 1));
        }
        super.onTargetDamaged(user, target, 2);
    }
}

package net.piloteric.ericsmodscore.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties MICROPLASTICS = new FoodProperties.Builder()
            .alwaysEat()
            .nutrition(1)
            .saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 600), 0.5f)
            .build();

}

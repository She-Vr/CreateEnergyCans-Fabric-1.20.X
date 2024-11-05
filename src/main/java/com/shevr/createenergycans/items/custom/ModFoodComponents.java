package com.shevr.createenergycans.items.custom;

import net.minecraft.world.food.FoodProperties;

public class ModFoodComponents {
    public static final FoodProperties CAN_FULL = new FoodProperties.Builder().alwaysEat().nutrition(3).saturationMod(0.25f).build();
}

package com.shevr.createenergycans.items.custom;

import com.shevr.createenergycans.CreateEnergyCans;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final Item CAN_FULL = registerItem(new Item(new FabricItemSettings().food(ModFoodComponents.CAN_FULL)), "can-full");

    private static Item registerItem(Item item, String id) {
		Identifier itemID = new Identifier(CreateEnergyCans.MOD_ID, id);

        return Registry.register(Registries.ITEM, itemID, item);
    }

    public static void registerModItems() {
		CreateEnergyCans.LOGGER.info("Registering Mod Items for mod" );
    }


}

package net.piloteric.ericsmodscore.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.piloteric.ericsmodscore.EricsCore;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EricsCore.MOD_ID);

    public static final RegistryObject<Item> MICROPLASTICS = ITEMS.register("microplastics",
            () -> new Item(new Item.Properties().food(ModFoods.MICROPLASTICS)));
    public static final RegistryObject<Item> PLASTIC_BAR = ITEMS.register("plastic_bar",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

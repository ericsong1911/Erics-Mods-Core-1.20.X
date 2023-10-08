package net.piloteric.ericsmodscore.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.piloteric.ericsmodscore.EricsCore;
import net.piloteric.ericsmodscore.block.ModBlocks;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EricsCore.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CORE_TAB = CREATIVE_MODE_TABS.register("erics_core_tab",
            () -> CreativeModeTab
                    .builder()
                    .icon(() -> new ItemStack(ModItems.MICROPLASTICS.get()))
                    .title(Component.translatable("creativetab.core_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MICROPLASTICS.get());
                        pOutput.accept(ModItems.PLASTIC_BAR.get());

                        pOutput.accept(ModBlocks.PLASTIC_BLOCK.get());
                        pOutput.accept(ModBlocks.MICROPLASTICS_BLOCK.get());
                        pOutput.accept(ModBlocks.PLASTIC_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}

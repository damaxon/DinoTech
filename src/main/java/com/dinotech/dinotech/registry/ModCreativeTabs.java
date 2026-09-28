package com.dinotech.dinotech.registry;

import com.dinotech.dinotech.DinoTech;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(net.minecraft.core.registries.Registries.CREATIVE_MODE_TAB, DinoTech.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DINOTECH_TAB =
            CREATIVE_MODE_TABS.register("dinotech_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.dinotech"))
                    .icon(() -> new ItemStack(ModItems.DNA_SAMPLE.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.DNA_SAMPLE.get());
                        output.accept(ModItems.COPPER_WIRE.get());
                        output.accept(ModItems.ASSEMBLY_TABLE_ITEM.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
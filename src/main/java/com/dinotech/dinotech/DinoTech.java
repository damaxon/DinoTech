package com.dinotech.dinotech;

import com.dinotech.dinotech.registry.ModBlocks;
import com.dinotech.dinotech.registry.ModCreativeTabs;
import com.dinotech.dinotech.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(DinoTech.MOD_ID)
public class DinoTech {

    public static final String MOD_ID = "dinotech";

    public DinoTech(IEventBus modEventBus) {
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
    }
}
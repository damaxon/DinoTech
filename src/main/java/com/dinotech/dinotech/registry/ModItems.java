package com.dinotech.dinotech.registry;

import com.dinotech.dinotech.DinoTech;

import net.neoforged.bus.api.IEventBus;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = 
        DeferredRegister.createItems(DinoTech.MOD_ID);

    public static final DeferredItem<Item> DNA_SAMPLE = 
        ITEMS.registerSimpleItem("dna_sample");

    public static final DeferredItem<Item> COPPER_WIRE =
        ITEMS.registerSimpleItem("copper_wire");

    public static final DeferredItem<BlockItem> ASSEMBLY_TABLE_ITEM =
        ITEMS.registerSimpleBlockItem("assembly_table", ModBlocks.ASSEMBLY_TABLE);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
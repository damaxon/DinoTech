package com.dinotech.dinotech.registry;

import com.dinotech.dinotech.DinoTech;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(DinoTech.MOD_ID);

    public static final DeferredBlock<Block> ASSEMBLY_TABLE =
            BLOCKS.registerSimpleBlock(
                    "assembly_table",
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.METAL)
                            .strength(3.0F, 6.0F)
                            .requiresCorrectToolForDrops()
            );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
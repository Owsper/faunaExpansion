package com.faunaexpansion.registry;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.FallingBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class ModBlocks {


    public static final Block WET_SAND = new FallingBlock(
            FabricBlockSettings.copyOf(Blocks.SAND)
    ) {
    };


    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("faunaexpansion", "wet_sand"), WET_SAND);
    }
}

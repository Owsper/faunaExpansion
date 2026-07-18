package com.faunaexpansion;

import net.fabricmc.api.ModInitializer;
import com.faunaexpansion.registry.ModBlocks;
import com.faunaexpansion.registry.ModItems;


public class FaunaExpansion implements ModInitializer {

    public static final String MOD_ID = "fauna-expansion";

    @Override
    public void onInitialize() {

        ModBlocks.registerBlocks();
        ModItems.registerItems();
    }
}

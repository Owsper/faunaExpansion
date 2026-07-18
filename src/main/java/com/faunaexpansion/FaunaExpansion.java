package com.faunaexpansion;

import com.faunaexpansion.registry.ModBlocks;
import com.faunaexpansion.registry.ModItems;
import com.faunaexpansion.registry.ModItemGroups;
import net.fabricmc.api.ModInitializer;

public class FaunaExpansion implements ModInitializer {

    public static final String MOD_ID = "faunaexpansion";

    @Override
    public void onInitialize() {

        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModItemGroups.FAUNA_GROUP.toString();

    }
}
package com.faunaexpansion.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item WET_SAND = new BlockItem(
            ModBlocks.WET_SAND, new Item.Settings());


    public static void registerItems() {

        Registry.register(
                Registry.ITEM,
                new Identifier("faunaexpansion", "wet_sand"),
                WET_SAND
        );

    }
}

package com.faunaexpansion.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup FAUNA_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("faunaexpansion", "fauna_group")
            )
            .icon(() -> new ItemStack(ModItems.WET_SAND))
            .appendItems(items -> {
                items.add(new ItemStack(ModItems.WET_SAND));
            })
            .build();

}
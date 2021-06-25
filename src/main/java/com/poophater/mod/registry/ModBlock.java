package com.poophater.mod.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class ModBlock {
    public static final Block REDDING_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    public static void registerBlock() {

    }
}

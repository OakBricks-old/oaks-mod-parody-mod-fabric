package com.poophater.mod.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlock {
    public static final Block REDDING_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    public static void registerBlock() {
        Registry.register(Registry.BLOCK, new Identifier("poophaters_mod", "redding_ore"), REDDING_ORE);
    }
}

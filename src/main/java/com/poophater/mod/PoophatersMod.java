package com.poophater.mod;

import com.poophater.mod.registry.ModBlock;
import com.poophater.mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class PoophatersMod implements ModInitializer {
	// i intentally made this code as shitty as possible
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier("poophaters_mod", "main"),
			() -> new ItemStack(ModItems.REDDING_PIECE));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerItem();
		ModBlock.registerBlock();
	}
}

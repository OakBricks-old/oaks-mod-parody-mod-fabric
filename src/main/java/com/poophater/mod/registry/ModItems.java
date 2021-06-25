package com.poophater.mod.registry;

import com.poophater.mod.PoophatersMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    /**
    *j
     */
    public static final Item REDDING_PIECE = new Item(new FabricItemSettings().group(PoophatersMod.ITEM_GROUP));


    public static void registerItem() {
        Registry.register(Registry.ITEM, new Identifier("poophaters_mod", "redding_piece"), REDDING_PIECE);
    }
}

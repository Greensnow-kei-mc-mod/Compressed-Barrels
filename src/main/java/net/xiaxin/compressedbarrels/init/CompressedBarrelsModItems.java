
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaxin.compressedbarrels.init;

import net.xiaxin.compressedbarrels.CompressedBarrelsMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class CompressedBarrelsModItems {
	public static Item COMPRESSED_BARRELS;

	public static void load() {
		COMPRESSED_BARRELS = Registry.register(Registry.ITEM, new ResourceLocation(CompressedBarrelsMod.MODID, "compressed_barrels"), new BlockItem(
				CompressedBarrelsModBlocks.COMPRESSED_BARRELS, new Item.Properties().tab(CompressedBarrelsModTabs.TAB_COMPRESSED_BARRELSA_2)));
	}
}

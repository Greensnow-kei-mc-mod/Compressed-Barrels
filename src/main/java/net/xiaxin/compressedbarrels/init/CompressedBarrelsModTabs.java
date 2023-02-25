
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaxin.compressedbarrels.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class CompressedBarrelsModTabs {
	public static CreativeModeTab TAB_COMPRESSED_BARRELSA_2;

	public static void load() {
		TAB_COMPRESSED_BARRELSA_2 = FabricItemGroupBuilder.create(new ResourceLocation("compressed_barrels", "compressed_barrelsa_2"))
				.icon(() -> new ItemStack(CompressedBarrelsModBlocks.COMPRESSED_BARRELS)).build();
	}
}

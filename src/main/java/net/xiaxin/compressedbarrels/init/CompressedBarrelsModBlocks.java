
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaxin.compressedbarrels.init;

import net.xiaxin.compressedbarrels.block.CompressedBarrelsBlock;
import net.xiaxin.compressedbarrels.CompressedBarrelsMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class CompressedBarrelsModBlocks {
	public static Block COMPRESSED_BARRELS;

	public static void load() {
		COMPRESSED_BARRELS = Registry.register(Registry.BLOCK, new ResourceLocation(CompressedBarrelsMod.MODID, "compressed_barrels"),
				new CompressedBarrelsBlock());
	}

	public static void clientLoad() {
		CompressedBarrelsBlock.clientInit();
	}
}

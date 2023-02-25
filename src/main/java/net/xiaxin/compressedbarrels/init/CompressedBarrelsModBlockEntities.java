
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaxin.compressedbarrels.init;

import net.xiaxin.compressedbarrels.block.entity.CompressedBarrelsBlockEntity;
import net.xiaxin.compressedbarrels.CompressedBarrelsMod;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class CompressedBarrelsModBlockEntities {
	public static BlockEntityType<?> COMPRESSED_BARRELS;

	public static void load() {
		COMPRESSED_BARRELS = Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(CompressedBarrelsMod.MODID, "compressed_barrels"),
				FabricBlockEntityTypeBuilder.create(CompressedBarrelsBlockEntity::new, CompressedBarrelsModBlocks.COMPRESSED_BARRELS).build(null));
	}
}

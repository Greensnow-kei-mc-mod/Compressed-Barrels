
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaxin.compressedbarrels.init;

import net.xiaxin.compressedbarrels.world.inventory.CompressedBarrelsa3Menu;
import net.xiaxin.compressedbarrels.client.gui.CompressedBarrelsa3Screen;
import net.xiaxin.compressedbarrels.CompressedBarrelsMod;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;

public class CompressedBarrelsModMenus {
	public static MenuType<CompressedBarrelsa3Menu> COMPRESSED_BARRELSA_3;

	public static void load() {
		COMPRESSED_BARRELSA_3 = ScreenHandlerRegistry.registerExtended(new ResourceLocation(CompressedBarrelsMod.MODID, "compressed_barrelsa_3"),
				CompressedBarrelsa3Menu::new);
		CompressedBarrelsa3Screen.screenInit();
	}
}


/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaxin.compressedbarrels.init;

import net.xiaxin.compressedbarrels.client.gui.CompressedBarrelsa3Screen;

import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class CompressedBarrelsModScreens {
	public static void load() {
		ScreenRegistry.register(CompressedBarrelsModMenus.COMPRESSED_BARRELSA_3, CompressedBarrelsa3Screen::new);
	}
}

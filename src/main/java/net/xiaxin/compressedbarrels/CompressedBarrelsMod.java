/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.xiaxin.compressedbarrels;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.xiaxin.compressedbarrels.init.CompressedBarrelsModTabs;
import net.xiaxin.compressedbarrels.init.CompressedBarrelsModMenus;
import net.xiaxin.compressedbarrels.init.CompressedBarrelsModItems;
import net.xiaxin.compressedbarrels.init.CompressedBarrelsModBlocks;
import net.xiaxin.compressedbarrels.init.CompressedBarrelsModBlockEntities;

import net.fabricmc.api.ModInitializer;

public class CompressedBarrelsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "compressed_barrels";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing CompressedBarrelsMod");
		CompressedBarrelsModTabs.load();

		CompressedBarrelsModBlocks.load();
		CompressedBarrelsModItems.load();
		CompressedBarrelsModBlockEntities.load();

		CompressedBarrelsModMenus.load();

	}
}

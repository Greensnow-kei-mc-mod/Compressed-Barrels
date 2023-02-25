
package net.xiaxin.compressedbarrels.world.inventory;

import net.xiaxin.compressedbarrels.init.CompressedBarrelsModMenus;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.Container;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.HashMap;

public class CompressedBarrelsa3Menu extends AbstractContainerMenu {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private BlockPos pos;
	private final Container inventory;
	private boolean bound = false;

	public CompressedBarrelsa3Menu(int id, Inventory inv, FriendlyByteBuf extraData) {
		this(id, inv, new SimpleContainer(203));
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
	}

	public CompressedBarrelsa3Menu(int id, Inventory inv, Container container) {
		super(CompressedBarrelsModMenus.COMPRESSED_BARRELSA_3, id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.inventory = container;
		this.addSlot(new Slot(inventory, 1, 26, 21) {
		});
		this.addSlot(new Slot(inventory, 2, 8, 21) {
		});
		this.addSlot(new Slot(inventory, 3, 44, 21) {
		});
		this.addSlot(new Slot(inventory, 4, 62, 21) {
		});
		this.addSlot(new Slot(inventory, 5, 80, 21) {
		});
		this.addSlot(new Slot(inventory, 6, 98, 21) {
		});
		this.addSlot(new Slot(inventory, 7, 116, 21) {
		});
		this.addSlot(new Slot(inventory, 8, 134, 21) {
		});
		this.addSlot(new Slot(inventory, 9, 152, 21) {
		});
		this.addSlot(new Slot(inventory, 10, 170, 21) {
		});
		this.addSlot(new Slot(inventory, 11, 188, 21) {
		});
		this.addSlot(new Slot(inventory, 12, 206, 21) {
		});
		this.addSlot(new Slot(inventory, 13, 224, 21) {
		});
		this.addSlot(new Slot(inventory, 14, 242, 21) {
		});
		this.addSlot(new Slot(inventory, 15, 260, 21) {
		});
		this.addSlot(new Slot(inventory, 16, 278, 21) {
		});
		this.addSlot(new Slot(inventory, 17, 296, 21) {
		});
		this.addSlot(new Slot(inventory, 18, 314, 21) {
		});
		this.addSlot(new Slot(inventory, 19, 332, 21) {
		});
		this.addSlot(new Slot(inventory, 20, 350, 21) {
		});
		this.addSlot(new Slot(inventory, 21, 368, 21) {
		});
		this.addSlot(new Slot(inventory, 22, 386, 21) {
		});
		this.addSlot(new Slot(inventory, 23, 404, 21) {
		});
		this.addSlot(new Slot(inventory, 24, 8, 39) {
		});
		this.addSlot(new Slot(inventory, 25, 26, 39) {
		});
		this.addSlot(new Slot(inventory, 26, 44, 39) {
		});
		this.addSlot(new Slot(inventory, 27, 62, 39) {
		});
		this.addSlot(new Slot(inventory, 28, 80, 39) {
		});
		this.addSlot(new Slot(inventory, 29, 98, 39) {
		});
		this.addSlot(new Slot(inventory, 30, 116, 39) {
		});
		this.addSlot(new Slot(inventory, 31, 134, 39) {
		});
		this.addSlot(new Slot(inventory, 32, 152, 39) {
		});
		this.addSlot(new Slot(inventory, 33, 170, 39) {
		});
		this.addSlot(new Slot(inventory, 34, 188, 39) {
		});
		this.addSlot(new Slot(inventory, 35, 206, 39) {
		});
		this.addSlot(new Slot(inventory, 36, 224, 39) {
		});
		this.addSlot(new Slot(inventory, 37, 242, 39) {
		});
		this.addSlot(new Slot(inventory, 38, 260, 39) {
		});
		this.addSlot(new Slot(inventory, 39, 278, 39) {
		});
		this.addSlot(new Slot(inventory, 40, 296, 39) {
		});
		this.addSlot(new Slot(inventory, 41, 314, 39) {
		});
		this.addSlot(new Slot(inventory, 42, 332, 39) {
		});
		this.addSlot(new Slot(inventory, 43, 350, 39) {
		});
		this.addSlot(new Slot(inventory, 44, 368, 39) {
		});
		this.addSlot(new Slot(inventory, 45, 386, 39) {
		});
		this.addSlot(new Slot(inventory, 46, 404, 39) {
		});
		this.addSlot(new Slot(inventory, 47, 8, 57) {
		});
		this.addSlot(new Slot(inventory, 48, 26, 57) {
		});
		this.addSlot(new Slot(inventory, 49, 44, 57) {
		});
		this.addSlot(new Slot(inventory, 50, 62, 57) {
		});
		this.addSlot(new Slot(inventory, 51, 80, 57) {
		});
		this.addSlot(new Slot(inventory, 52, 98, 57) {
		});
		this.addSlot(new Slot(inventory, 53, 116, 57) {
		});
		this.addSlot(new Slot(inventory, 54, 134, 57) {
		});
		this.addSlot(new Slot(inventory, 55, 152, 57) {
		});
		this.addSlot(new Slot(inventory, 56, 170, 57) {
		});
		this.addSlot(new Slot(inventory, 57, 188, 57) {
		});
		this.addSlot(new Slot(inventory, 58, 206, 57) {
		});
		this.addSlot(new Slot(inventory, 59, 224, 57) {
		});
		this.addSlot(new Slot(inventory, 60, 242, 57) {
		});
		this.addSlot(new Slot(inventory, 61, 260, 57) {
		});
		this.addSlot(new Slot(inventory, 62, 278, 57) {
		});
		this.addSlot(new Slot(inventory, 63, 296, 57) {
		});
		this.addSlot(new Slot(inventory, 64, 314, 57) {
		});
		this.addSlot(new Slot(inventory, 65, 332, 57) {
		});
		this.addSlot(new Slot(inventory, 66, 350, 57) {
		});
		this.addSlot(new Slot(inventory, 67, 368, 57) {
		});
		this.addSlot(new Slot(inventory, 68, 386, 57) {
		});
		this.addSlot(new Slot(inventory, 69, 404, 57) {
		});
		this.addSlot(new Slot(inventory, 70, 8, 75) {
		});
		this.addSlot(new Slot(inventory, 71, 26, 75) {
		});
		this.addSlot(new Slot(inventory, 72, 44, 75) {
		});
		this.addSlot(new Slot(inventory, 73, 62, 75) {
		});
		this.addSlot(new Slot(inventory, 74, 80, 75) {
		});
		this.addSlot(new Slot(inventory, 75, 98, 75) {
		});
		this.addSlot(new Slot(inventory, 76, 116, 75) {
		});
		this.addSlot(new Slot(inventory, 77, 134, 75) {
		});
		this.addSlot(new Slot(inventory, 78, 152, 75) {
		});
		this.addSlot(new Slot(inventory, 79, 170, 75) {
		});
		this.addSlot(new Slot(inventory, 80, 188, 75) {
		});
		this.addSlot(new Slot(inventory, 81, 206, 75) {
		});
		this.addSlot(new Slot(inventory, 82, 224, 75) {
		});
		this.addSlot(new Slot(inventory, 83, 242, 75) {
		});
		this.addSlot(new Slot(inventory, 84, 260, 75) {
		});
		this.addSlot(new Slot(inventory, 85, 278, 75) {
		});
		this.addSlot(new Slot(inventory, 86, 296, 75) {
		});
		this.addSlot(new Slot(inventory, 87, 314, 75) {
		});
		this.addSlot(new Slot(inventory, 88, 332, 75) {
		});
		this.addSlot(new Slot(inventory, 89, 350, 75) {
		});
		this.addSlot(new Slot(inventory, 90, 368, 75) {
		});
		this.addSlot(new Slot(inventory, 91, 386, 75) {
		});
		this.addSlot(new Slot(inventory, 92, 404, 75) {
		});
		this.addSlot(new Slot(inventory, 93, 8, 93) {
		});
		this.addSlot(new Slot(inventory, 94, 26, 93) {
		});
		this.addSlot(new Slot(inventory, 95, 44, 93) {
		});
		this.addSlot(new Slot(inventory, 96, 62, 93) {
		});
		this.addSlot(new Slot(inventory, 97, 80, 93) {
		});
		this.addSlot(new Slot(inventory, 98, 98, 93) {
		});
		this.addSlot(new Slot(inventory, 99, 116, 93) {
		});
		this.addSlot(new Slot(inventory, 100, 134, 93) {
		});
		this.addSlot(new Slot(inventory, 101, 152, 93) {
		});
		this.addSlot(new Slot(inventory, 102, 170, 93) {
		});
		this.addSlot(new Slot(inventory, 103, 188, 93) {
		});
		this.addSlot(new Slot(inventory, 104, 206, 93) {
		});
		this.addSlot(new Slot(inventory, 105, 224, 93) {
		});
		this.addSlot(new Slot(inventory, 106, 242, 93) {
		});
		this.addSlot(new Slot(inventory, 107, 260, 93) {
		});
		this.addSlot(new Slot(inventory, 108, 278, 93) {
		});
		this.addSlot(new Slot(inventory, 109, 296, 93) {
		});
		this.addSlot(new Slot(inventory, 110, 314, 93) {
		});
		this.addSlot(new Slot(inventory, 111, 332, 93) {
		});
		this.addSlot(new Slot(inventory, 112, 350, 93) {
		});
		this.addSlot(new Slot(inventory, 113, 368, 93) {
		});
		this.addSlot(new Slot(inventory, 114, 386, 93) {
		});
		this.addSlot(new Slot(inventory, 115, 404, 93) {
		});
		this.addSlot(new Slot(inventory, 116, 8, 111) {
		});
		this.addSlot(new Slot(inventory, 117, 26, 111) {
		});
		this.addSlot(new Slot(inventory, 118, 44, 111) {
		});
		this.addSlot(new Slot(inventory, 119, 62, 111) {
		});
		this.addSlot(new Slot(inventory, 120, 80, 111) {
		});
		this.addSlot(new Slot(inventory, 121, 98, 111) {
		});
		this.addSlot(new Slot(inventory, 122, 116, 111) {
		});
		this.addSlot(new Slot(inventory, 123, 134, 111) {
		});
		this.addSlot(new Slot(inventory, 124, 152, 111) {
		});
		this.addSlot(new Slot(inventory, 125, 170, 111) {
		});
		this.addSlot(new Slot(inventory, 126, 188, 111) {
		});
		this.addSlot(new Slot(inventory, 127, 206, 111) {
		});
		this.addSlot(new Slot(inventory, 128, 224, 111) {
		});
		this.addSlot(new Slot(inventory, 129, 242, 111) {
		});
		this.addSlot(new Slot(inventory, 130, 260, 111) {
		});
		this.addSlot(new Slot(inventory, 131, 278, 111) {
		});
		this.addSlot(new Slot(inventory, 132, 296, 111) {
		});
		this.addSlot(new Slot(inventory, 133, 314, 111) {
		});
		this.addSlot(new Slot(inventory, 134, 332, 111) {
		});
		this.addSlot(new Slot(inventory, 135, 350, 111) {
		});
		this.addSlot(new Slot(inventory, 136, 368, 111) {
		});
		this.addSlot(new Slot(inventory, 137, 386, 111) {
		});
		this.addSlot(new Slot(inventory, 138, 404, 111) {
		});
		this.addSlot(new Slot(inventory, 139, 8, 129) {
		});
		this.addSlot(new Slot(inventory, 140, 26, 129) {
		});
		this.addSlot(new Slot(inventory, 141, 44, 129) {
		});
		this.addSlot(new Slot(inventory, 142, 62, 129) {
		});
		this.addSlot(new Slot(inventory, 143, 80, 129) {
		});
		this.addSlot(new Slot(inventory, 144, 98, 129) {
		});
		this.addSlot(new Slot(inventory, 147, 314, 129) {
		});
		this.addSlot(new Slot(inventory, 148, 332, 129) {
		});
		this.addSlot(new Slot(inventory, 149, 350, 129) {
		});
		this.addSlot(new Slot(inventory, 150, 368, 129) {
		});
		this.addSlot(new Slot(inventory, 151, 386, 129) {
		});
		this.addSlot(new Slot(inventory, 152, 404, 129) {
		});
		this.addSlot(new Slot(inventory, 153, 8, 147) {
		});
		this.addSlot(new Slot(inventory, 154, 26, 147) {
		});
		this.addSlot(new Slot(inventory, 155, 44, 147) {
		});
		this.addSlot(new Slot(inventory, 156, 62, 147) {
		});
		this.addSlot(new Slot(inventory, 157, 80, 147) {
		});
		this.addSlot(new Slot(inventory, 158, 98, 147) {
		});
		this.addSlot(new Slot(inventory, 161, 314, 147) {
		});
		this.addSlot(new Slot(inventory, 162, 332, 147) {
		});
		this.addSlot(new Slot(inventory, 163, 350, 147) {
		});
		this.addSlot(new Slot(inventory, 164, 368, 147) {
		});
		this.addSlot(new Slot(inventory, 165, 386, 147) {
		});
		this.addSlot(new Slot(inventory, 166, 404, 147) {
		});
		this.addSlot(new Slot(inventory, 167, 8, 165) {
		});
		this.addSlot(new Slot(inventory, 168, 26, 165) {
		});
		this.addSlot(new Slot(inventory, 169, 44, 165) {
		});
		this.addSlot(new Slot(inventory, 170, 62, 165) {
		});
		this.addSlot(new Slot(inventory, 171, 80, 165) {
		});
		this.addSlot(new Slot(inventory, 172, 98, 165) {
		});
		this.addSlot(new Slot(inventory, 175, 314, 165) {
		});
		this.addSlot(new Slot(inventory, 176, 332, 165) {
		});
		this.addSlot(new Slot(inventory, 177, 350, 165) {
		});
		this.addSlot(new Slot(inventory, 178, 368, 165) {
		});
		this.addSlot(new Slot(inventory, 179, 386, 165) {
		});
		this.addSlot(new Slot(inventory, 180, 404, 165) {
		});
		this.addSlot(new Slot(inventory, 181, 8, 183) {
		});
		this.addSlot(new Slot(inventory, 182, 26, 183) {
		});
		this.addSlot(new Slot(inventory, 183, 44, 183) {
		});
		this.addSlot(new Slot(inventory, 184, 62, 183) {
		});
		this.addSlot(new Slot(inventory, 185, 80, 183) {
		});
		this.addSlot(new Slot(inventory, 186, 98, 183) {
		});
		this.addSlot(new Slot(inventory, 189, 314, 183) {
		});
		this.addSlot(new Slot(inventory, 190, 332, 183) {
		});
		this.addSlot(new Slot(inventory, 191, 368, 183) {
		});
		this.addSlot(new Slot(inventory, 192, 350, 183) {
		});
		this.addSlot(new Slot(inventory, 193, 386, 183) {
		});
		this.addSlot(new Slot(inventory, 194, 404, 183) {
		});
		this.addSlot(new Slot(inventory, 195, 116, 129) {
		});
		this.addSlot(new Slot(inventory, 196, 116, 147) {
		});
		this.addSlot(new Slot(inventory, 197, 116, 165) {
		});
		this.addSlot(new Slot(inventory, 198, 116, 183) {
		});
		this.addSlot(new Slot(inventory, 199, 296, 129) {
		});
		this.addSlot(new Slot(inventory, 200, 296, 147) {
		});
		this.addSlot(new Slot(inventory, 201, 296, 166) {
		});
		this.addSlot(new Slot(inventory, 202, 296, 183) {
		});
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 127 + 8 + sj * 18, 47 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 127 + 8 + si * 18, 47 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		return this.inventory.stillValid(player);
	}

	@Override
	public ItemStack quickMoveStack(Player player, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 194) {
				if (!this.moveItemStackTo(itemstack1, 194, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 194, false)) {
				if (index < 194 + 27) {
					if (!this.moveItemStackTo(itemstack1, 194 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 194, 194 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.isEmpty())
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(player, itemstack1);
		}
		return itemstack;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
	}
}

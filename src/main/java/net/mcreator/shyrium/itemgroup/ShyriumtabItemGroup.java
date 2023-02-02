
package net.mcreator.shyrium.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.shyrium.item.TestItem;
import net.mcreator.shyrium.ShyriumModElements;

@ShyriumModElements.ModElement.Tag
public class ShyriumtabItemGroup extends ShyriumModElements.ModElement {
	public ShyriumtabItemGroup(ShyriumModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabshyriumtab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TestItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}

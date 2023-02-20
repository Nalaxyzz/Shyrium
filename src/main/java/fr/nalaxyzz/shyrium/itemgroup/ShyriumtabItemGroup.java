
package fr.nalaxyzz.shyrium.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import fr.nalaxyzz.shyrium.item.ShyriumCoreItem;
import fr.nalaxyzz.shyrium.ShyriumModElements;

@ShyriumModElements.ModElement.Tag
public class ShyriumtabItemGroup extends ShyriumModElements.ModElement {
	public ShyriumtabItemGroup(ShyriumModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabshyriumtab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ShyriumCoreItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}

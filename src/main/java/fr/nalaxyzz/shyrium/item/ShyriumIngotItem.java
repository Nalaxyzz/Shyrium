
package fr.nalaxyzz.shyrium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import fr.nalaxyzz.shyrium.itemgroup.ShyriumtabItemGroup;
import fr.nalaxyzz.shyrium.ShyriumModElements;

@ShyriumModElements.ModElement.Tag
public class ShyriumIngotItem extends ShyriumModElements.ModElement {
	@ObjectHolder("shyrium:shyrium_ingot")
	public static final Item block = null;

	public ShyriumIngotItem(ShyriumModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ShyriumtabItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("shyrium_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}

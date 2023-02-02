
package net.mcreator.shyrium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.shyrium.itemgroup.ShyriumtabItemGroup;
import net.mcreator.shyrium.ShyriumModElements;

@ShyriumModElements.ModElement.Tag
public class MalachiteIngotItem extends ShyriumModElements.ModElement {
	@ObjectHolder("shyrium:malachite_ingot")
	public static final Item block = null;

	public MalachiteIngotItem(ShyriumModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ShyriumtabItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("malachite_ingot");
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

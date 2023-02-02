
package net.mcreator.shyrium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.shyrium.itemgroup.ShyriumtabItemGroup;
import net.mcreator.shyrium.ShyriumModElements;

@ShyriumModElements.ModElement.Tag
public class TestItem extends ShyriumModElements.ModElement {
	@ObjectHolder("shyrium:test")
	public static final Item block = null;

	public TestItem(ShyriumModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ShyriumtabItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("test");
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

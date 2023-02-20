
package fr.nalaxyzz.shyrium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import fr.nalaxyzz.shyrium.itemgroup.ShyriumtabItemGroup;
import fr.nalaxyzz.shyrium.ShyriumModElements;

@ShyriumModElements.ModElement.Tag
public class HammerItem extends ShyriumModElements.ModElement {
	@ObjectHolder("shyrium:hammer")
	public static final Item block = null;

	public HammerItem(ShyriumModElements instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ShyriumtabItemGroup.tab).maxDamage(5).rarity(Rarity.COMMON));
			setRegistryName("hammer");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			ItemStack retval = new ItemStack(this);
			retval.setDamage(itemstack.getDamage() + 1);
			if (retval.getDamage() >= retval.getMaxDamage()) {
				return ItemStack.EMPTY;
			}
			return retval;
		}

		@Override
		public boolean isRepairable(ItemStack itemstack) {
			return false;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 50;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0F;
		}

		@Override
		public boolean canHarvestBlock(BlockState state) {
			return true;
		}
	}
}

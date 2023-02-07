
package net.mcreator.shyrium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.shyrium.itemgroup.ShyriumtabItemGroup;
import net.mcreator.shyrium.ShyriumModElements;

@ShyriumModElements.ModElement.Tag
public class Malachite_toolSwordItem extends ShyriumModElements.ModElement {
	@ObjectHolder("shyrium:malachite_tool_sword")
	public static final Item block = null;

	public Malachite_toolSwordItem(ShyriumModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 500;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 5.5f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MalachiteIngotItem.block));
			}
		}, 3, -3f, new Item.Properties().group(ShyriumtabItemGroup.tab)) {
		}.setRegistryName("malachite_tool_sword"));
	}
}

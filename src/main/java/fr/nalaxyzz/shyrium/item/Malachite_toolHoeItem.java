
package fr.nalaxyzz.shyrium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import fr.nalaxyzz.shyrium.itemgroup.ShyriumtabItemGroup;
import fr.nalaxyzz.shyrium.ShyriumModElements;

@ShyriumModElements.ModElement.Tag
public class Malachite_toolHoeItem extends ShyriumModElements.ModElement {
	@ObjectHolder("shyrium:malachite_tool_hoe")
	public static final Item block = null;

	public Malachite_toolHoeItem(ShyriumModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 500;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
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
		}, 0, -3f, new Item.Properties().group(ShyriumtabItemGroup.tab)) {
		}.setRegistryName("malachite_tool_hoe"));
	}
}

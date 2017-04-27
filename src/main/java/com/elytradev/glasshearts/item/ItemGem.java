package com.elytradev.glasshearts.item;

import java.util.List;

import com.elytradev.glasshearts.enums.EnumGem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGem extends Item {

	public static final EnumGem[] VALID_GEMS = {
		EnumGem.AMETHYST,
		EnumGem.RUBY,
		EnumGem.TOPAZ,
		EnumGem.SAPPHIRE,
		EnumGem.OPAL,
		EnumGem.ONYX,
		EnumGem.AMBER,
		EnumGem.AGATE,
	};
	
	public ItemGem() {
		setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item.glasshearts.gem."+VALID_GEMS[stack.getMetadata()%VALID_GEMS.length].getName();
	}
	
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {
		for (int i = 0; i < VALID_GEMS.length; i++) {
			subItems.add(new ItemStack(itemIn, 1, i));
		}
	}
	
}

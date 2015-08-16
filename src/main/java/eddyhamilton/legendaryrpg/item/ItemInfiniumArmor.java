package eddyhamilton.legendaryrpg.item;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemInfiniumArmor extends ItemArmor {
	public ItemInfiniumArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType){
		super(armorMaterial, renderIndex, armorType);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if (this.armorType == 2){
			return "lrpg:textures/models/armor/infinium_armor_2.png";
		}
		
		return "lrpg:textures/models/armor/infinium_armor_1.png";
	
		}

	@Override
	public CreativeTabs[] getCreativeTabs() {
	 return new CreativeTabs[] {CreativeTabs.tabCombat, LRPGMain.tabLegendaryRPG}; 
	}
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == LRPGMain.itemRefinedInfiniumIngot; //Alllows certain items to repair this armor.
	}
}
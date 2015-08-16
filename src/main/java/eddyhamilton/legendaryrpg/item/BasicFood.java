package eddyhamilton.legendaryrpg.item;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class BasicFood extends ItemFood {

	public BasicFood(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
	}

	
	@Override
	public CreativeTabs[] getCreativeTabs() {
	 return new CreativeTabs[] {CreativeTabs.tabFood, LRPGMain.tabLegendaryRPG};
	}
}

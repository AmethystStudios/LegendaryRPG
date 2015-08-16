package eddyhamilton.legendaryrpg.item;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class WeaponSword extends ItemSword {

	public WeaponSword(String string, ToolMaterial Material) {
		super(Material);
        this.setUnlocalizedName(string);
        this.setTextureName(LRPGMain.MODID + ":" + string);
	
	}


	@Override
	public CreativeTabs[] getCreativeTabs() {
	 return new CreativeTabs[] {CreativeTabs.tabCombat, LRPGMain.tabLegendaryRPG};
	}
}

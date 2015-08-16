package eddyhamilton.legendaryrpg.item;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;


public class ToolHoe extends ItemHoe{

	public ToolHoe(String string, ToolMaterial Materials) {
		super(Materials);
        this.setUnlocalizedName(string);
        this.setTextureName(LRPGMain.MODID + ":" + string);
	}
	
	@Override
	public CreativeTabs[] getCreativeTabs() {
	 return new CreativeTabs[] {CreativeTabs.tabTools, LRPGMain.tabLegendaryRPG};
	}

}

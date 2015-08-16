package eddyhamilton.legendaryrpg.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import eddyhamilton.legendaryrpg.LRPGMain;

public class ToolAxe extends ItemAxe{

	public ToolAxe(String string, ToolMaterial Materials) {
		super(Materials);
        this.setUnlocalizedName(string);
        this.setTextureName(LRPGMain.MODID + ":" + string);
	}
	
	@Override
	public CreativeTabs[] getCreativeTabs() {
	 return new CreativeTabs[] {CreativeTabs.tabTools, LRPGMain.tabLegendaryRPG};
	}

}

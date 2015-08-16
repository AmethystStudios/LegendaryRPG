package eddyhamilton.legendaryrpg.item;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade{

	public ToolShovel(String string, ToolMaterial Materials) {
		super(Materials);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setUnlocalizedName(string);
        this.setTextureName(LRPGMain.MODID + ":" + string);
	}
	
	@Override
	public CreativeTabs[] getCreativeTabs() {
	 return new CreativeTabs[] {CreativeTabs.tabTools, LRPGMain.tabLegendaryRPG};
	}

}

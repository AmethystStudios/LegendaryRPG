package eddyhamilton.legendaryrpg.item;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.item.*;
import net.minecraft.creativetab.*;

public class ToolPick extends ItemPickaxe
{
    public ToolPick(String string, final Item.ToolMaterial Material) {
        super(Material);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setUnlocalizedName(string);
        this.setTextureName(LRPGMain.MODID + ":" + string);
    }
    
	@Override
	public CreativeTabs[] getCreativeTabs() {
	 return new CreativeTabs[] {CreativeTabs.tabTools, LRPGMain.tabLegendaryRPG};
	}
}

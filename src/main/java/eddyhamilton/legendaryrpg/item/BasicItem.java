package eddyhamilton.legendaryrpg.item;

import java.util.List;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BasicItem extends Item {
private final String setInfo;
	public BasicItem(String name, String toolTip) {
		super();
		this.setUnlocalizedName(name);
		this.setTextureName(LRPGMain.MODID + ":" + name);
		this.setInfo = toolTip;
	}
	
	   public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean bool) {
			 list.add(setToolTipData());
		   }
		   private String setToolTipData(){
			 return this.setInfo;
		    }



	@Override
	public CreativeTabs[] getCreativeTabs() {
		return new CreativeTabs[] { LRPGMain.tabLegendaryRPG, }; 
	}

}

package eddyhamilton.legendaryrpg.block;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block{

	public BasicBlock(String string, Material material) {
		super(material);
		//LRPGMain.tabLegendaryRPG 
        this.setBlockTextureName(LRPGMain.MODID + ":" + string);	
	}

}

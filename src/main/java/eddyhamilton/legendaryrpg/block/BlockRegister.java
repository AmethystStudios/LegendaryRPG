package eddyhamilton.legendaryrpg.block;

import cpw.mods.fml.common.registry.GameRegistry;
import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRegister {
	
	// Block
	public static Block blockInfiniumBlock;
	public static Block blockInfiniumOre;
	public static Block blockBooger;
	public static Block blockPyroBomb;
	
	 public static void mainRegistry(){
			// Block Initialization
			blockBooger = new BlockBooger(Material.web).setBlockName("BlockBooger");
			blockInfiniumOre = new BlockInfiniumOre("InfiniumOre", Material.sand).setBlockName("InfiniumOre").setCreativeTab(LRPGMain.tabLegendaryRPG);
			blockInfiniumBlock = new BasicBlock("InfiniumBlock", Material.iron).setBlockName("InfiniumBlock").setCreativeTab(LRPGMain.tabLegendaryRPG);
			blockPyroBomb = new BlockPyroBomb().setBlockName("PyroBomb").setCreativeTab(LRPGMain.tabLegendaryRPG);
			
			// Block Registry
			GameRegistry.registerBlock(blockInfiniumOre, "InfiniumOre");
			GameRegistry.registerBlock(blockInfiniumBlock, "InfiniumBlock");
			GameRegistry.registerBlock(blockBooger, "BoogerBlock");
			GameRegistry.registerBlock(blockPyroBomb, "PyroBomb");
		 
		
	}

}

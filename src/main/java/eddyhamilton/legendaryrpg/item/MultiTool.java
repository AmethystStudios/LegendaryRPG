package eddyhamilton.legendaryrpg.item;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import eddyhamilton.legendaryrpg.LRPGMain;

public class MultiTool extends ItemPickaxe {

    public MultiTool(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(LRPGMain.MODID + ":" + unlocalizedName);
        
    }
    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return ImmutableSet.of("pickaxe", "spade", "axe");
}
    private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
    	    Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, 
    	    Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, 
    	    Blocks.soul_sand, Blocks.mycelium, Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, 
    	    Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});
    @Override
    public boolean func_150897_b(Block block) {
        return effectiveAgainst.contains(block) ? true : super.func_150897_b(block);
    }
    @Override
    public float func_150893_a(ItemStack stack, Block block) {
        if (block.getMaterial() == Material.wood || block.getMaterial() == Material.vine || block.getMaterial() == Material.plants)
            return this.efficiencyOnProperMaterial;
        return effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.func_150893_a(stack, block);
    }
	
    @Override
	public CreativeTabs[] getCreativeTabs() {
	 return new CreativeTabs[] {CreativeTabs.tabTools, LRPGMain.tabLegendaryRPG};
	}
}
package eddyhamilton.legendaryrpg;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import eddyhamilton.legendaryrpg.LRPGMain;
import eddyhamilton.legendaryrpg.item.ItemRegister;
import eddyhamilton.legendaryrpg.block.BlockRegister;

public class CraftingRegister {
	public static void mainRegistry(){
		
		// Crafting Recipe Registry
				GameRegistry.addRecipe(new ItemStack(ItemRegister.itemInfiniumPickaxe, 1),
						new Object[] { "RRR", " S ", " S ", 'R', ItemRegister.itemRefinedInfiniumIngot, 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ItemRegister.itemInfiniumAxe, 1),
						new Object[] { "RR ", "RS ", " S ", 'R', ItemRegister.itemRefinedInfiniumIngot, 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ItemRegister.itemInfiniumShovel, 1),
						new Object[] { " R ", " S ", " S ", 'R', ItemRegister.itemRefinedInfiniumIngot, 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ItemRegister.itemInfiniumSword, 1),
						new Object[] { " R ", " R ", " S ", 'R', ItemRegister.itemRefinedInfiniumIngot, 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ItemRegister.itemInfiniumHoe, 1),
						new Object[] { "RR ", " S ", " S ", 'R', ItemRegister.itemRefinedInfiniumIngot, 'S', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ItemRegister.itemInfiniumMultitool, 1), new Object[] { "PSA", " W ", " W ", 'P',
						ItemRegister.itemInfiniumPickaxe, 'S', ItemRegister.itemInfiniumShovel, 'A', ItemRegister.itemInfiniumAxe, 'W', Items.stick });
				GameRegistry.addRecipe(new ItemStack(ItemRegister.itemInfiniumChestplate),
						new Object[] { "R R", "RRR", "RRR", 'R', ItemRegister.itemRefinedInfiniumIngot });
				GameRegistry.addRecipe(new ItemStack(ItemRegister.itemObsidianCarrot, 1),
						new Object[] { "SSS", "SRS", "SSS", 'S', Blocks.obsidian, 'R', Items.golden_carrot });
				GameRegistry.addRecipe(new ItemStack(ItemRegister.itemSuicideVest, 1),
						new Object[] { "SDS", "SRS", "SSS", 'S', Blocks.tnt, 'R', Items.leather_chestplate, 'D', ItemRegister.itemCreeperBrain});
				GameRegistry.addRecipe(new ItemStack(ItemRegister.itemConductiveWiring, 1),
						new Object[] { " S ", " R ", " S ", 'R', Items.redstone, 'S', Items.gold_ingot });
				GameRegistry.addRecipe(new ItemStack(ItemRegister.itemSuicideDetonator, 1),
						new Object[] { "RSR", "RCR", "RGR", 'R', Items.iron_ingot, 'S', Blocks.stone_button, 'C', ItemRegister.itemConductiveWiring, 'G', new ItemStack(Items.dye, 1, 10)});
				GameRegistry.addRecipe(new ItemStack(ItemRegister.itemInfiniumHelmet),
						new Object[] { "RRR", "R R", 'R', ItemRegister.itemRefinedInfiniumIngot });
				GameRegistry.addRecipe(new ItemStack(ItemRegister.itemInfiniumLegs),
						new Object[] { "RRR", "R R", "R R", 'R', ItemRegister.itemRefinedInfiniumIngot });
				GameRegistry.addRecipe(new ItemStack(ItemRegister.itemInfiniumBoots),
						new Object[] { "R R", "R R", 'R', ItemRegister.itemRefinedInfiniumIngot });
				GameRegistry.addRecipe(new ItemStack(BlockRegister.blockInfiniumBlock),
						new Object[] { "RRR", "RRR", "RRR", 'R', ItemRegister.itemRefinedInfiniumIngot });
				GameRegistry.addRecipe(new ItemStack(BlockRegister.blockBooger), new Object[] { "RRR", "RRR", "RRR", 'R', ItemRegister.itemBooger });
				
				//Shapeless Recipes
				GameRegistry.addShapelessRecipe(new ItemStack(ItemRegister.itemBooger, 9), new Object[] { BlockRegister.blockBooger });
				GameRegistry.addShapelessRecipe(new ItemStack(ItemRegister.itemRefinedInfiniumIngot, 9),
						new Object[] { BlockRegister.blockInfiniumBlock });
				GameRegistry.addShapelessRecipe(new ItemStack(ItemRegister.itemRefinedInfiniumIngot, 9),
						new Object[] { BlockRegister.blockInfiniumBlock });
				GameRegistry.addShapelessRecipe(new ItemStack(ItemRegister.itemCheese, 1),
						new Object[] { Items.milk_bucket, ItemRegister.itemRennet });
				GameRegistry.addShapelessRecipe(new ItemStack(ItemRegister.itemCheese, 2),
						new Object[] { Items.milk_bucket, Items.milk_bucket, ItemRegister.itemRennet });
				GameRegistry.addShapelessRecipe(new ItemStack(ItemRegister.itemCheese, 3),
						new Object[] { Items.milk_bucket, Items.milk_bucket, Items.milk_bucket, ItemRegister.itemRennet });
				GameRegistry.addShapelessRecipe(new ItemStack(ItemRegister.itemCheese, 4), new Object[] { Items.milk_bucket,
						Items.milk_bucket, Items.milk_bucket, Items.milk_bucket, ItemRegister.itemRennet });

				// Smelting Recipes
				GameRegistry.addSmelting(BlockRegister.blockInfiniumOre, new ItemStack(ItemRegister.itemInfiniumNugget, 1), 100.0F);
<<<<<<< HEAD
				GameRegistry.addSmelting(BlockRegister.blockBooger, new ItemStack(Items.diamond, 4), 500.0F);

=======
				GameRegistry.addSmelting(ItemRegister.itemStrangeCrystal, new ItemStack(ItemRegister.itemInfiniumSword, 64), 100.0F );
>>>>>>> origin/NonStable
		
	}

}

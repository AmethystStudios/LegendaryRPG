package eddyhamilton.legendaryrpg;
//hi!!!!

//starting to get bigtime irritated
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import eddyhamilton.legendaryrpg.block.BasicBlock;
import eddyhamilton.legendaryrpg.block.BlockBooger;
import eddyhamilton.legendaryrpg.block.BlockInfiniumOre;
import eddyhamilton.legendaryrpg.block.BlockPyroBomb;
import eddyhamilton.legendaryrpg.item.*;
import eddyhamilton.legendaryrpg.worldgen.OreGenerator2;

@Mod(modid = LRPGMain.MODID, name = LRPGMain.NAME, version = LRPGMain.VERSION)
public class LRPGMain {
	@SidedProxy(clientSide = "eddyhamilton.legendaryrpg.ClientProxy", serverSide = "eddyhamilton.legendaryrpg.ServerProxy")
	public static ServerProxy proxy;
// pretending I made Major Changes
	
	// Creative Tabs, fussy things. Use this template if you ever need to make
	// another.
	public static CreativeTabs tabLegendaryRPG = new CreativeTabs("tabLegendaryRPG") {
		public Item getTabIconItem() {
			return itemInfiniumPickaxe;
		}
	};

	public static final String MODID = "lrpg";
	public static final String NAME = "LegendaryRPG";
	public static final String VERSION = "1.0";

	// Items, Tools, Armor
	public static Item itemBooger;
	public static Item itemObsidianCarrot;

	/*
	 * = new AdvancedFood("ItemBooger", 5, 0.8F, false
	 * ).setUnlocalizedName("ItemBooger").setCreativeTab ( tabLegendaryRPG);
	 */
	public static Item itemInfiniumHelmet;
	public static Item itemInfiniumChestplate;
	public static Item itemInfiniumLegs;
	public static Item itemInfiniumBoots;
	public static Item itemInfiniumPickaxe;
	public static Item itemInfiniumAxe;
	public static Item itemInfiniumShovel;
	public static Item itemInfiniumHoe;
	public static Item itemInfiniumSword;
	public static Item itemInfiniumShears;
	public static Item itemInfiniumMultitool;
	public static Item itemInfiniumNugget;
	public static Item itemUnrefinedInfiniumIngot;
	public static Item itemRefinedInfiniumIngot;
	public static Item itemOpSpeedBoots;
	public static Item itemGodArmorHelmet;
	public static Item itemGodArmorChestplate;
	public static Item itemGodArmorLeggings;
	public static Item itemGodArmorBoots;
	public static Item itemRennet;
	public static Item itemCheese;
	public static Item itemSuicideVest;
	public static Item itemSuicideDetonator;
	public static Item itemConductiveWiring;
	public static Item itemCreeperBrain;
	public static Item itemBlazeHeart;
	// Block
	public static BlockChest blockInfiniumChest;
	public static Block blockInfiniumBlock;
	public static Block blockInfiniumOre;
	public static Block blockBooger;
	public static Block blockPyroBomb;
	


	
	/*******************************************************************************
	 * Tool Materials
	 * 
	 * public static ItemTool.ToolMaterial InfiniumTools =
	 * EnumHelper.addToolMaterial("InfiniumTools", harvestLevel, maxUses,
	 * efficiency, damage, enchantability)
	 ******************************************************************************/
	public static ItemTool.ToolMaterial InfiniumMaterial = EnumHelper.addToolMaterial("InfiniumMaterial", 4, 900000000,
			8.0f, 5.0f, 35);
	public static ItemTool.ToolMaterial InfiniumMaterial2 = EnumHelper.addToolMaterial("InfiniumMaterial2", 4,
			1500000000, 8.0f, 5.0f, 35);
	public static ItemTool.ToolMaterial SuicideMaterial2 = EnumHelper.addToolMaterial("SuicideMaterial2", 0,
			50, 0.0f, 0.0f, 1);
	public static ItemArmor.ArmorMaterial SuicideMaterial = EnumHelper.addArmorMaterial("SUICIDEMATERIAL", 1000,
			new int[] { 2, 2, 2, 2 }, 0);
	public static ItemArmor.ArmorMaterial InfiniumArmor = EnumHelper.addArmorMaterial("INFINIUMARMOR", 900000000,
			new int[] { 4, 9, 7, 6 }, 10);
	public static ItemArmor.ArmorMaterial InfiniumArmor2 = EnumHelper.addArmorMaterial("INFINIUMARMOR2", 90000000,
			new int[] { 1, 1, 1, 6 }, 15);
	public static ItemArmor.ArmorMaterial OpSpeedBoots = EnumHelper.addArmorMaterial("OPSPEEDBOOTS", 90,
			new int[] { 0, 0, 0, 0 }, 0);
	public static ItemArmor.ArmorMaterial GodArmor = EnumHelper.addArmorMaterial("GodArmor", 1500000000,
			new int[] { 50, 50, 50, 50 }, 50);
	
	/************************************************************
	 * Generation- Ore and otherwise Currently botched
	 ************************************************************/
	private OreGenerator2 OreManager;

	public LRPGMain() {
		this.OreManager = new OreGenerator2();
	}

	// PreInit. Registers, Recipes, Configs,etc, go here.
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		

		
		// Block Initialization
		blockBooger = new BlockBooger(Material.web).setBlockName("BlockBooger");
		blockInfiniumOre = new BlockInfiniumOre("InfiniumOre", Material.sand).setBlockName("InfiniumOre");
		blockInfiniumBlock = new BasicBlock("InfiniumBlock", Material.iron).setBlockName("InfiniumBlock").setCreativeTab(CreativeTabs.tabBlock);
		blockPyroBomb = new BlockPyroBomb().setBlockName("PyroBomb");

		// Tool/Armor/Item Initialization
		// Still working on this!!
		itemSuicideVest = new ItemSuicideVest(SuicideMaterial, 0, 1).setUnlocalizedName("SuicideVest")
				.setTextureName(MODID + ":SuicideVest").setCreativeTab(CreativeTabs.tabCombat);
		itemInfiniumHelmet = new ItemInfiniumArmor(InfiniumArmor, 0, 0).setUnlocalizedName("InfiniumHelmet")
				.setTextureName("lrpg:InfiniumHelmet").setCreativeTab(CreativeTabs.tabCombat);
		itemInfiniumChestplate = new ItemInfiniumArmor(InfiniumArmor, 0, 1).setUnlocalizedName("InfiniumChest")
				.setTextureName("lrpg:InfiniumChestplate").setCreativeTab(CreativeTabs.tabCombat);
		itemInfiniumLegs = new ItemInfiniumArmor(InfiniumArmor, 0, 2).setUnlocalizedName("InfiniumLegs")
				.setTextureName("lrpg:InfiniumLegs").setCreativeTab(CreativeTabs.tabCombat);
		itemInfiniumBoots = new ItemInfiniumArmor(InfiniumArmor2, 0, 3).setUnlocalizedName("InfiniumBoots")
				.setTextureName("lrpg:InfiniumBoots").setCreativeTab(CreativeTabs.tabCombat);
		itemGodArmorHelmet = new GodArmor(GodArmor, 0, 0).setUnlocalizedName("GodHelmet")
				.setTextureName("lrpg:GodHelmet").setCreativeTab(tabLegendaryRPG);
		itemGodArmorChestplate = new GodArmor(GodArmor, 0, 1).setUnlocalizedName("GodChestplate")
				.setTextureName("lrpg:GodChestplate").setCreativeTab(tabLegendaryRPG);
		itemGodArmorLeggings = new GodArmor(GodArmor, 0, 2).setUnlocalizedName("GodLeggings")
				.setTextureName("lrpg:GodLeggins").setCreativeTab(tabLegendaryRPG);
		itemGodArmorBoots = new GodArmor(GodArmor, 0, 3).setUnlocalizedName("GodBoots").setTextureName("lrpg:GodBoots")
				.setCreativeTab(tabLegendaryRPG);
		itemOpSpeedBoots = new OpSpeedBoots(OpSpeedBoots, 0, 3).setUnlocalizedName("OpSpeedBoots")
				.setTextureName("lrpg:BootsofSwiftness").setCreativeTab(tabLegendaryRPG);
		itemRennet = new BasicItem("Rennet", "I can use this to make cheese!").setMaxStackSize(32).setCreativeTab(CreativeTabs.tabMaterials);
		itemConductiveWiring = new BasicItem("ConductiveWiring", "").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials);
		itemCheese = new AdvancedFood("Cheese", 3, 0.5F, false);
		itemSuicideDetonator = new WeaponSword("SuicideDetonator", SuicideMaterial2).setCreativeTab(CreativeTabs.tabCombat).setTextureName(MODID + ":SuicideDetonator");
		itemCreeperBrain = new BasicItem("CreeperBrain", "").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials);
		itemBlazeHeart = new BasicItem("BlazeHeart", "").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials);
		
		
		// Block Registry
		GameRegistry.registerBlock(blockInfiniumOre, "InfiniumOre");
		GameRegistry.registerBlock(blockInfiniumBlock, "InfiniumBlock");
		GameRegistry.registerBlock(blockBooger, "BoogerBlock");
		GameRegistry.registerBlock(blockPyroBomb, "PyroBomb");
		
		// Generation Registry
		GameRegistry.registerWorldGenerator((IWorldGenerator) this.OreManager, 1);
		
		// Item/Tool/Armor Registry
		GameRegistry.registerItem(itemInfiniumHelmet, itemInfiniumHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemInfiniumChestplate, itemInfiniumChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemInfiniumLegs, itemInfiniumLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemInfiniumBoots, itemInfiniumBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemGodArmorHelmet, itemGodArmorHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemGodArmorChestplate, itemGodArmorChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemGodArmorLeggings, itemGodArmorLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemGodArmorBoots, itemGodArmorBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemOpSpeedBoots, itemOpSpeedBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemInfiniumMultitool = new MultiTool("InfiniumMultitool", InfiniumMaterial2),
				"InfiniumMultitool");
		GameRegistry.registerItem(itemInfiniumPickaxe = new ToolPick("InfiniumPickaxe", InfiniumMaterial),
				"InfiniumPickaxe");
		GameRegistry.registerItem(itemInfiniumAxe = new ToolAxe("InfiniumAxe", InfiniumMaterial), "InfiniumAxe");
		GameRegistry.registerItem(itemInfiniumHoe = new ToolHoe("InfiniumHoe", InfiniumMaterial), "InfiniumHoe");
		GameRegistry.registerItem(itemInfiniumShovel = new ToolShovel("InfiniumShovel", InfiniumMaterial),
				"InfiniumShovel");
		GameRegistry.registerItem(itemInfiniumSword = new WeaponSword("InfiniumSword", InfiniumMaterial),
				"InfiniumSword");
		GameRegistry.registerItem(itemInfiniumNugget = new BasicItem("InfiniumNugget", ""), "InfiniumNugget");
		GameRegistry.registerItem(itemUnrefinedInfiniumIngot = new BasicItem("UnrefinedInfiniumIngot", "Kinda dirty.. Maybe I could refine it?"),
				"UnrefinedInfiniumIngot");
		GameRegistry.registerItem(itemRefinedInfiniumIngot = new BasicItem("RefinedInfiniumIngot",""),
				"RefinedInfiniumIngot");
		GameRegistry.registerItem(itemConductiveWiring, "ConductiveWiring");
		GameRegistry.registerItem(itemCreeperBrain, "CreeperBrain");
		GameRegistry.registerItem(itemBlazeHeart, "BlazeHeart");
		GameRegistry.registerItem(
				itemBooger = new AdvancedFood("Booger", 3, 0.8f, false)
						.addPotionEffect(new PotionEffect(Potion.poison.id, 5 * 20, 1), 1.0F)
						.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20 * 20, 0), 0.75F)
						.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 20 * 20, 0), 0.75F)
						.addPotionEffect(new PotionEffect(Potion.resistance.id, 20 * 20, 0), 1.0F).setAlwaysEdible(),
				"Booger");

		GameRegistry.registerItem(itemObsidianCarrot = new AdvancedFood("ObsidianCarrot", 3, 0.8f, false)
				.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 240 * 20, 0), 1.0F).setAlwaysEdible(),
				"ObsidianCarrot");
		GameRegistry.registerItem(itemRennet, "Rennet");
		GameRegistry.registerItem(itemCheese, "Cheese");
		GameRegistry.registerItem(itemSuicideVest, "SuicideVest");
		GameRegistry.registerItem(itemSuicideDetonator = new WeaponSword("SuicideDetonator", SuicideMaterial2),
				"SuicideDetonator");
		
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// Proxy Tile Entity, Entity, GUI and Packet Register
		MinecraftForge.EVENT_BUS.register(new DropHandler());

		// Crafting Recipe Registry
		GameRegistry.addRecipe(new ItemStack(itemInfiniumPickaxe, 1),
				new Object[] { "RRR", " S ", " S ", 'R', itemRefinedInfiniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(itemInfiniumAxe, 1),
				new Object[] { "RR ", "RS ", " S ", 'R', itemRefinedInfiniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(itemInfiniumShovel, 1),
				new Object[] { " R ", " S ", " S ", 'R', itemRefinedInfiniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(itemInfiniumSword, 1),
				new Object[] { " R ", " R ", " S ", 'R', itemRefinedInfiniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(itemInfiniumHoe, 1),
				new Object[] { "RR ", " S ", " S ", 'R', itemRefinedInfiniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(itemInfiniumMultitool, 1), new Object[] { "PSA", " W ", " W ", 'P',
				itemInfiniumPickaxe, 'S', itemInfiniumShovel, 'A', itemInfiniumAxe, 'W', Items.stick });
		GameRegistry.addRecipe(new ItemStack(itemInfiniumChestplate),
				new Object[] { "R R", "RRR", "RRR", 'R', itemRefinedInfiniumIngot });
		GameRegistry.addRecipe(new ItemStack(itemObsidianCarrot, 1),
				new Object[] { "SSS", "SRS", "SSS", 'S', Blocks.obsidian, 'R', Items.golden_carrot });
		GameRegistry.addRecipe(new ItemStack(itemSuicideVest, 1),
				new Object[] { "SDS", "SRS", "SSS", 'S', Blocks.tnt, 'R', Items.leather_chestplate, 'D', itemCreeperBrain});
		GameRegistry.addRecipe(new ItemStack(itemConductiveWiring, 1),
				new Object[] { " S ", " R ", " S ", 'R', Items.redstone, 'S', Items.gold_ingot });
		GameRegistry.addRecipe(new ItemStack(itemSuicideDetonator, 1),
				new Object[] { "RSR", "RCR", "RGR", 'R', Items.iron_ingot, 'S', Blocks.stone_button, 'C', itemConductiveWiring, 'G', new ItemStack(Items.dye, 1, 10)});
		GameRegistry.addRecipe(new ItemStack(itemInfiniumHelmet),
				new Object[] { "RRR", "R R", 'R', itemRefinedInfiniumIngot });
		GameRegistry.addRecipe(new ItemStack(itemInfiniumLegs),
				new Object[] { "RRR", "R R", "R R", 'R', itemRefinedInfiniumIngot });
		GameRegistry.addRecipe(new ItemStack(itemInfiniumBoots),
				new Object[] { "R R", "R R", 'R', itemRefinedInfiniumIngot });
		GameRegistry.addRecipe(new ItemStack(blockInfiniumBlock),
				new Object[] { "RRR", "RRR", "RRR", 'R', itemRefinedInfiniumIngot });
		GameRegistry.addRecipe(new ItemStack(blockBooger), new Object[] { "RRR", "RRR", "RRR", 'R', itemBooger });
		
		
		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(LRPGMain.itemBooger, 9), new Object[] { LRPGMain.blockBooger });
		GameRegistry.addShapelessRecipe(new ItemStack(LRPGMain.itemRefinedInfiniumIngot, 9),
				new Object[] { LRPGMain.blockInfiniumBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(LRPGMain.itemRefinedInfiniumIngot, 9),
				new Object[] { LRPGMain.blockInfiniumBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(LRPGMain.itemCheese, 1),
				new Object[] { Items.milk_bucket, LRPGMain.itemRennet });
		GameRegistry.addShapelessRecipe(new ItemStack(LRPGMain.itemCheese, 2),
				new Object[] { Items.milk_bucket, Items.milk_bucket, LRPGMain.itemRennet });
		GameRegistry.addShapelessRecipe(new ItemStack(LRPGMain.itemCheese, 3),
				new Object[] { Items.milk_bucket, Items.milk_bucket, Items.milk_bucket, LRPGMain.itemRennet });
		GameRegistry.addShapelessRecipe(new ItemStack(LRPGMain.itemCheese, 4), new Object[] { Items.milk_bucket,
				Items.milk_bucket, Items.milk_bucket, Items.milk_bucket, LRPGMain.itemRennet });

		// Smelting Registry

		GameRegistry.addSmelting(blockInfiniumOre, new ItemStack(itemInfiniumNugget, 1), 100.0F);

		
		
	}

	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		// could get a list of blocks from every mod, as ALL items/blocks have
		// been registered by the time you hit postinit

	}

}
package eddyhamilton.legendaryrpg.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import eddyhamilton.legendaryrpg.*;

public class ItemRegister {

	// Items, Tools, Armor
	public static Item itemBooger;
	public static Item itemObsidianCarrot;
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
	public static Item itemPyroSuicideVest;
	public static Item itemWolfScrollTier1;
	public static Item itemWolfScrollTier2;
	public static Item itemWolfScrollTier3;
	public static Item itemSpawnpointScroll;
	public static Item itemRecallScroll;
	public static Item itemClosedWolfScroll;
	public static Item itemLightningWand;
	public static Item itemStrangeCrystal;
	
	public static void mainRegistry() {
		
		
		


		// Tool/Armor/Item Initialization
		// Still working on this!!
		
		itemPyroSuicideVest = new ItemPyroSuicideVest(LRPGMain.SuicideMaterial, 0, 1).setUnlocalizedName("PyroSuicideVest")
				.setTextureName(LRPGMain.MODID + ":PyroSuicideVest");
		itemSuicideVest = new ItemSuicideVest(LRPGMain.SuicideMaterial, 0, 1).setUnlocalizedName("SuicideVest")
				.setTextureName(LRPGMain.MODID + ":SuicideVest");
		itemInfiniumHelmet = new ItemInfiniumArmor(LRPGMain.InfiniumArmor, 0, 0).setUnlocalizedName("InfiniumHelmet")
				.setTextureName(LRPGMain.MODID + ":InfiniumHelmet").setCreativeTab(CreativeTabs.tabCombat);
		itemInfiniumChestplate = new ItemInfiniumArmor(LRPGMain.InfiniumArmor, 0, 1).setUnlocalizedName("InfiniumChest")
				.setTextureName(LRPGMain.MODID + ":InfiniumChestplate").setCreativeTab(CreativeTabs.tabCombat);
		itemInfiniumLegs = new ItemInfiniumArmor(LRPGMain.InfiniumArmor, 0, 2).setUnlocalizedName("InfiniumLegs")
				.setTextureName(LRPGMain.MODID + ":InfiniumLegs").setCreativeTab(CreativeTabs.tabCombat);
		itemInfiniumBoots = new ItemInfiniumArmor(LRPGMain.InfiniumArmor2, 0, 3).setUnlocalizedName("InfiniumBoots")
				.setTextureName(LRPGMain.MODID + ":InfiniumBoots").setCreativeTab(CreativeTabs.tabCombat);
		itemGodArmorHelmet = new GodArmor(LRPGMain.GodArmor, 0, 0).setUnlocalizedName("GodHelmet")
				.setTextureName(LRPGMain.MODID + ":GodHelmet").setCreativeTab(LRPGMain.tabLegendaryRPG);
		itemGodArmorChestplate = new GodArmor(LRPGMain.GodArmor, 0, 1).setUnlocalizedName("GodChestplate")
				.setTextureName(LRPGMain.MODID + ":GodChestplate").setCreativeTab(LRPGMain.tabLegendaryRPG);
		itemGodArmorLeggings = new GodArmor(LRPGMain.GodArmor, 0, 2).setUnlocalizedName("GodLeggings")
				.setTextureName(LRPGMain.MODID + ":GodLeggins").setCreativeTab(LRPGMain.tabLegendaryRPG);
		itemGodArmorBoots = new GodArmor(LRPGMain.GodArmor, 0, 3).setUnlocalizedName("GodBoots").setTextureName("lrpg:GodBoots")
				.setCreativeTab(LRPGMain.tabLegendaryRPG);
		itemOpSpeedBoots = new OpSpeedBoots(LRPGMain.OpSpeedBoots, 0, 3).setUnlocalizedName("OpSpeedBoots")
				.setTextureName(LRPGMain.MODID + ":BootsofSwiftness").setCreativeTab(LRPGMain.tabLegendaryRPG);
		itemRennet = new BasicItem("Rennet", "I can use this to make cheese!").setMaxStackSize(32).setCreativeTab(CreativeTabs.tabMaterials);
		itemConductiveWiring = new BasicItem("ConductiveWiring", "").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials);
		itemCheese = new AdvancedFood("Cheese", 3, 0.5F, false);
		itemSuicideDetonator = new WeaponSword("SuicideDetonator", LRPGMain.SuicideMaterial2).setCreativeTab(CreativeTabs.tabCombat).setTextureName(LRPGMain.MODID + ":SuicideDetonator");
		itemCreeperBrain = new BasicItem("CreeperBrain", "").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials);
		itemBlazeHeart = new BasicItem("BlazeHeart", "").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials);
		itemWolfScrollTier1 = new WolfScrollTier1("WolfScroll1").setMaxStackSize(1);
		itemWolfScrollTier2 = new WolfScrollTier2("WolfScroll2").setMaxStackSize(1);
		itemWolfScrollTier3 = new WolfScrollTier3("WolfScroll3").setMaxStackSize(1);
		itemSpawnpointScroll = new SpawnpointScroll("SpawnpointScroll", "Introducing Insta-Bed!").setMaxStackSize(1);
		itemRecallScroll = new RecallScroll("RecallScroll", "").setMaxStackSize(1);
		itemClosedWolfScroll = new ClosedWolfScroll("ClosedWolfScroll");
		itemLightningWand = new LightningWand("LightningWand", " Placeholder").setMaxStackSize(1);
		itemStrangeCrystal = new BasicItem("StrangeCrystal", "Crafting material");

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
		GameRegistry.registerItem(itemInfiniumMultitool = new MultiTool("InfiniumMultitool", LRPGMain.InfiniumMaterial2),
				"InfiniumMultitool");
		GameRegistry.registerItem(itemInfiniumPickaxe = new ToolPick("InfiniumPickaxe", LRPGMain.InfiniumMaterial),
				"InfiniumPickaxe");
		GameRegistry.registerItem(itemInfiniumAxe = new ToolAxe("InfiniumAxe", LRPGMain.InfiniumMaterial), "InfiniumAxe");
		GameRegistry.registerItem(itemInfiniumHoe = new ToolHoe("InfiniumHoe", LRPGMain.InfiniumMaterial), "InfiniumHoe");
		GameRegistry.registerItem(itemInfiniumShovel = new ToolShovel("InfiniumShovel", LRPGMain.InfiniumMaterial),
				"InfiniumShovel");
		GameRegistry.registerItem(itemInfiniumSword = new WeaponSword("InfiniumSword", LRPGMain.InfiniumMaterial),
				"InfiniumSword");
		GameRegistry.registerItem(itemInfiniumNugget = new BasicItem("InfiniumNugget", ""), "InfiniumNugget");
		GameRegistry.registerItem(itemUnrefinedInfiniumIngot = new BasicItem("UnrefinedInfiniumIngot",
				"Kinda dirty.. Maybe I could refine it?"), "UnrefinedInfiniumIngot");
		GameRegistry.registerItem(itemRefinedInfiniumIngot = new BasicItem("RefinedInfiniumIngot", ""),
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
		GameRegistry.registerItem(itemPyroSuicideVest, "PyroSuicideVest");
		GameRegistry.registerItem(itemSuicideDetonator = new WeaponSword("SuicideDetonator", LRPGMain.SuicideMaterial2),
				"SuicideDetonator");
		GameRegistry.registerItem(itemWolfScrollTier1, "WolfScroll1");
		GameRegistry.registerItem(itemWolfScrollTier2, "WolfScroll2");
		GameRegistry.registerItem(itemWolfScrollTier3, "WolfScroll3");
		GameRegistry.registerItem(itemSpawnpointScroll, "SpawnpointScroll");
		GameRegistry.registerItem(itemRecallScroll, "RecallScroll");
		GameRegistry.registerItem(itemClosedWolfScroll, "ClosedWolfScroll");
		GameRegistry.registerItem(itemLightningWand, "LightningWand");
		GameRegistry.registerItem(itemStrangeCrystal, "StrangeCrystal");
		
	}

}

package eddyhamilton.legendaryrpg;

import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import java.util.Random;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import eddyhamilton.legendaryrpg.block.BasicBlock;
import eddyhamilton.legendaryrpg.block.BlockBooger;
import eddyhamilton.legendaryrpg.block.BlockInfiniumOre;
import eddyhamilton.legendaryrpg.block.BlockPyroBomb;
import eddyhamilton.legendaryrpg.block.BlockRegister;
import eddyhamilton.legendaryrpg.enchantment.EnchantmentBlazing;
import eddyhamilton.legendaryrpg.enchantment.EnchantmentLifeoftheGreatTree;
import eddyhamilton.legendaryrpg.entity.EntityRegister;
import eddyhamilton.legendaryrpg.item.*;
import eddyhamilton.legendaryrpg.worldgen.*;

@Mod(modid = LRPGMain.MODID, name = LRPGMain.NAME, version = LRPGMain.VERSION)
public class LRPGMain {
	@SidedProxy(clientSide = "eddyhamilton.legendaryrpg.ClientProxy", serverSide = "eddyhamilton.legendaryrpg.ServerProxy")
	public static ServerProxy proxy;
	// Creative Tabs, fussy things. Use this template if you ever need to make
	// another.
	public static CreativeTabs tabLegendaryRPG = new CreativeTabs("tabLegendaryRPG") {
		public Item getTabIconItem() {
			return ItemRegister.itemInfiniumPickaxe;
		}
	};

	public static final String MODID = "lrpg";
	public static final String NAME = "LegendaryRPG";
	public static final String VERSION = "0.8.2.2";

	public static final Enchantment Blazing = new EnchantmentBlazing(84, 1);
	public static final Enchantment LifeoftheGreatTree = new EnchantmentLifeoftheGreatTree(85, 1);

	MainEventHandler handler = new MainEventHandler();

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
	public static ItemTool.ToolMaterial SuicideMaterial2 = EnumHelper.addToolMaterial("SuicideMaterial2", 0, 50, 0.0f,
			0.0f, 1);
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
	private GenerationManager1 GenerationManager;
	private TestStructureGenerator TestStructureGenerator;

	public LRPGMain() {
		this.GenerationManager = new GenerationManager1();
	
	}

	// PreInit. Registers, Recipes, Configs,etc, go here.
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Event Handler Registry
		FMLCommonHandler.instance().bus().register(handler);
		MinecraftForge.EVENT_BUS.register(handler);

		// Registrys
		EntityRegister.mainRegistry();
		BlockRegister.mainRegistry();
		ItemRegister.mainRegistry();

		// Generation Registry
		GameRegistry.registerWorldGenerator((IWorldGenerator) this.GenerationManager, 5);

		proxy.registerRenderThings();

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// Proxy Tile Entity, Entity, GUI and Packet Register
		MinecraftForge.EVENT_BUS.register(new DropHandler());

		CraftingRegister.mainRegistry();

	}

	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {

		// could get a list of blocks from every mod, as ALL items/blocks have
		// been registered by the time you hit postinit

	}

}
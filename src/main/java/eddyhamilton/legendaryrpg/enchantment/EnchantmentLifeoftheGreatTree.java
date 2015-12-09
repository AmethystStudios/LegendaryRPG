package eddyhamilton.legendaryrpg.enchantment;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class EnchantmentLifeoftheGreatTree extends Enchantment {

	public EnchantmentLifeoftheGreatTree(int p_i1937_1_, int p_i1937_2_) {
		super(p_i1937_1_, p_i1937_2_, EnumEnchantmentType.all);
		this.setName("LifeoftheGreatTree");
	}

	public boolean canApplyAtEnchantingTable() {
		return false;
	}

	public static EntityPlayer player;

	public static void EnchantChecker1() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {

				for (int i = 0; i < 9; i++) {
					ItemStack stack = player.inventory.getStackInSlot(i);
					if (stack != null
							&& EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId, stack) > 0) {
						switch (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId, stack)) {
						case 1:
							lotgtLvl1(stack, player);
							break;
						case 2:
							lotgtLvl2(stack, player);
							break;
						case 3:
							lotgtLvl3(stack, player);
							break;
						}

					}
				}
					ItemStack Helmet = player.inventory.armorItemInSlot(0);
					if (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId,
							Helmet) > 0) {
						switch (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId,
								Helmet)) {
						case 1:
							lotgtLvl1(Helmet, player);
							break;
						case 2:
							
							lotgtLvl2(Helmet, player);
							break;
						case 3:
							Helmet = player.inventory.armorItemInSlot(0);
							lotgtLvl3(Helmet, player);
							break;
						}
					}
					ItemStack Chestplate = player.inventory.armorItemInSlot(1);
					if (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId, Chestplate) > 0) {
						switch (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId,
								Chestplate)) {
						case 1:
							lotgtLvl1(Chestplate, player);
							break;
						case 2:
							lotgtLvl2(Chestplate, player);
							break;
						case 3:
							lotgtLvl3(Chestplate, player);
							break;
						}

					}
					ItemStack Leggings = player.getCurrentArmor(2);
					if (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId,
							Leggings) > 0) {
						switch (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId,
								Leggings)) {
						case 1:
							lotgtLvl1(Leggings, player);
							break;
						case 2:
							lotgtLvl2(Leggings, player);
							break;
						case 3:
							lotgtLvl3(Leggings, player);
							break;
						}
					}
					ItemStack Boots = player.getCurrentArmor(3);
					if (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId,
							Boots) > 0) {
						switch (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId,
								Boots)) {
						case 1:
							lotgtLvl1(Boots, player);
							break;
						case 2:
							lotgtLvl2(Boots, player);
							break;
						case 3:
							lotgtLvl3(Boots, player);
							break;
						}

					}

				

			}
		}, 5000, 5000);
	}

	public static void lotgtLvl1(final ItemStack stack, final EntityPlayer player) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				stack.setItemDamage(stack.getItemDamage() - 10000000);
				player.addChatMessage(new ChatComponentText(EnumChatFormatting.ITALIC + "5 second delay?"));
			}
		}, 5000);

	}

	public static void lotgtLvl2(ItemStack stack, EntityPlayer player) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
			}
		}, 5000);

	}

	public static void lotgtLvl3(ItemStack stack, EntityPlayer player) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
			}
		}, 5000);

	}

}

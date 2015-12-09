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
	private ScheduledExecutorService Scheduler;
	void EnchantChecker2(EntityPlayer player, ItemStack stack){
	Scheduler = Executors.newScheduledThreadPool(1);
	
	}

	public static void EnchantChecker1(final EntityPlayer player) {
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
					ItemStack Chestplate = player.inventory.armorItemInSlot(1);
					if (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId,
							player.inventory.armorItemInSlot(0)) > 0) {
						switch (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId,
								player.inventory.armorItemInSlot(0))) {
						case 1:
							stack = player.inventory.armorItemInSlot(0);
							lotgtLvl1(stack, player);
							break;
						case 2:
							stack = player.inventory.armorItemInSlot(0);
							lotgtLvl2(stack, player);
							break;
						case 3:
							stack = player.inventory.armorItemInSlot(0);
							lotgtLvl3(stack, player);
							break;
						}
					}
					if (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId, Chestplate) > 0) {
						switch (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId,
								player.inventory.armorItemInSlot(1))) {
						case 1:
							stack = Chestplate;
							lotgtLvl1(stack, player);
							break;
						case 2:
							stack = player.inventory.armorItemInSlot(1);
							lotgtLvl2(stack, player);
							break;
						case 3:
							stack = player.inventory.armorItemInSlot(1);
							lotgtLvl3(stack, player);
							break;
						}

					}
					if (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId,
							player.inventory.armorItemInSlot(2)) > 0) {
						switch (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId,
								player.inventory.armorItemInSlot(2))) {
						case 1:
							stack = player.inventory.armorItemInSlot(2);
							lotgtLvl1(stack, player);
							break;
						case 2:
							stack = player.inventory.armorItemInSlot(2);
							lotgtLvl2(stack, player);
							break;
						case 3:
							stack = player.inventory.armorItemInSlot(2);
							lotgtLvl3(stack, player);
							break;
						}
					}
					if (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId,
							player.inventory.armorItemInSlot(3)) > 0) {
						switch (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId,
								player.inventory.armorItemInSlot(3))) {
						case 1:
							stack = player.inventory.armorItemInSlot(3);
							lotgtLvl1(stack, player);
							break;
						case 2:
							stack = player.inventory.armorItemInSlot(3);
							lotgtLvl2(stack, player);
							break;
						case 3:
							stack = player.inventory.armorItemInSlot(3);
							lotgtLvl3(stack, player);
							break;
						}

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

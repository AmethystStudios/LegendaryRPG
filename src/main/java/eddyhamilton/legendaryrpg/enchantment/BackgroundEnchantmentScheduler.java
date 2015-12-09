package eddyhamilton.legendaryrpg.enchantment;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class BackgroundEnchantmentScheduler{

	private final static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	public static void EnchantChecker1(final EntityPlayer player) {
		final Runnable CheckInv = new Runnable() {
			public void run() {
				for (int i = 0; i < 9; i++) {
					ItemStack stack = player.inventory.getStackInSlot(i);
					if (stack != null
							&& EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId, stack) > 0) {
						switch (EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId, stack)) {
						case 1:
							stack.setItemDamage(stack.getItemDamage() - 10000000);
							player.addChatMessage(new ChatComponentText(EnumChatFormatting.ITALIC + "5 second delay?"));
							 break;
						case 2:
							// lotgtLvl2(stack, player);
						case 3:
							// lotgtLvl3(stack, player);
						}
						

					}
				}
			}
			
		};
		
		final ScheduledFuture<?> beeperHandle = scheduler.scheduleAtFixedRate(CheckInv, 10, 10, TimeUnit.SECONDS);

	}



}
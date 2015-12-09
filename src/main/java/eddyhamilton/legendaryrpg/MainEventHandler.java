package eddyhamilton.legendaryrpg;

import java.util.Timer;
import java.util.TimerTask;

import com.oracle.jrockit.jfr.TimedEvent;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import eddyhamilton.legendaryrpg.enchantment.BackgroundEnchantmentScheduler;
import eddyhamilton.legendaryrpg.enchantment.EnchantmentLifeoftheGreatTree;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.WorldEvent;

public class MainEventHandler {
	
	@SubscribeEvent
	public void lotgtEnchantmentCheck(PlayerLoggedInEvent event){
		EntityPlayer player = event.player;
		EnchantmentLifeoftheGreatTree.EnchantChecker1(player);
		

	}

}

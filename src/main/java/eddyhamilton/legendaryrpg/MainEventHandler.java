package eddyhamilton.legendaryrpg;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class MainEventHandler {
	
	@SubscribeEvent
	public void lotgtEnchantmentCheck(cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent event){
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		ItemStack stack = player.getHeldItem();
    	player.addChatMessage(
				new ChatComponentText(EnumChatFormatting.ITALIC + "HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII"));
    	if (stack != null && EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId, stack) > 0){
    		player.addPotionEffect(new PotionEffect(Potion.jump.id, 3000000, 3));
    		return;
    	}
	}

}

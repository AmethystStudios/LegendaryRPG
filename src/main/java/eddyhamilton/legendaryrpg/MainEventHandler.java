package eddyhamilton.legendaryrpg;

import java.util.TimerTask;

import com.oracle.jrockit.jfr.TimedEvent;

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

import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.WorldEvent;

public class MainEventHandler {
	
	@SubscribeEvent
	public void lotgtEnchantmentCheck(cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent event){
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;

		for(int i =0;i<9;i++){
			ItemStack stack = player.inventory.getStackInSlot(i);
    	if (stack != null && EnchantmentHelper.getEnchantmentLevel(LRPGMain.LifeoftheGreatTree.effectId, stack) > 0){
    		player.addPotionEffect(new PotionEffect(Potion.jump.id, 3000000, 3));
    		player.addChatMessage(
					new ChatComponentText(EnumChatFormatting.ITALIC + "You can repair your item here.."));
    		int counter =100;
    		counter--;
    		if(counter == 0){
        		stack.setItemDamage(stack.getItemDamage()+100000);
        		player.addChatMessage(
    					new ChatComponentText(EnumChatFormatting.ITALIC + "5 second delay?"));

    		counter=20;
    		}

    	}
		}
	}

}

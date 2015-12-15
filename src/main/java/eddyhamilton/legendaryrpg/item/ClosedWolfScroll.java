package eddyhamilton.legendaryrpg.item;

import java.util.List;
import java.util.Random;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.block.Block;
import net.minecraft.client.particle.EntityReddustFX;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import eddyhamilton.legendaryrpg.item.WolfScrollTier1;;

public class ClosedWolfScroll extends Item {

	public ClosedWolfScroll(String string) {
		super();
		this.setUnlocalizedName(string);
		this.setTextureName(LRPGMain.MODID + ":" + string);

	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		if (!world.isRemote) {

			Random random = new Random();
			int ScrollTier = random.nextInt(11);
			switch (ScrollTier) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				player.addChatMessage(
						new ChatComponentText(EnumChatFormatting.ITALIC + "A pair of faithful companions."));
				ItemStack stack = new ItemStack(ItemRegister.itemWolfScrollTier1); 
				if (!player.inventory.addItemStackToInventory(stack)) {
				 player.dropPlayerItemWithRandomChoice(stack, false);
				}
				Random rand = new Random();
				for (int countparticles = 0; countparticles <= 20; ++countparticles) {
					world.spawnParticle("explode", player.posX + (rand.nextDouble() - 0.5D) * (double) player.width,
							player.posY + rand.nextDouble() * (double) player.height - (double) player.yOffset,
							player.posZ + (rand.nextDouble() - 0.5D) * (double) player.width, 0.0D, 0.0D, 0.0D);
					
				}
				break;
			case 6:
			case 7:
			case 8:
				player.addChatMessage(
						new ChatComponentText(EnumChatFormatting.ITALIC + "If two is good, four is better!"));
				ItemStack stack2 = new ItemStack(ItemRegister.itemWolfScrollTier1); 
				if (!player.inventory.addItemStackToInventory(stack2)) {
				 player.dropPlayerItemWithRandomChoice(stack2, false);
				}
				Random rand1 = new Random();
				for (int countparticles = 0; countparticles <= 20; ++countparticles) {
					world.spawnParticle("happyVillager",
							player.posX + (rand1.nextDouble() - 0.5D) * (double) player.width,
							player.posY + rand1.nextDouble() * (double) player.height - (double) player.yOffset,
							player.posZ + (rand1.nextDouble() - 0.5D) * (double) player.width, 0.0D, 0.0D, 0.0D);
				}
				break;
			case 9:
				player.addChatMessage(new ChatComponentText(
						EnumChatFormatting.ITALIC + "This scroll has the ancient power of an entire wolf pack!"));
				ItemStack stack3 = new ItemStack(ItemRegister.itemWolfScrollTier3); 
				if (!player.inventory.addItemStackToInventory(stack3)) {
				 player.dropPlayerItemWithRandomChoice(stack3, false);

				}
				Random rand2 = new Random();
				for (int countparticles = 0; countparticles <= 20; ++countparticles) {
					world.spawnParticle("portal", player.posX + (rand2.nextDouble() - 0.5D) * (double) player.width,
							player.posY + rand2.nextDouble() * (double) player.height - (double) player.yOffset,
							player.posZ + (rand2.nextDouble() - 0.5D) * (double) player.width, 0.0D, 0.0D, 0.0D);
				}
				break;
			case 10:
			case 11:
				player.addChatMessage(new ChatComponentText(
						EnumChatFormatting.ITALIC + "When you try to open the scroll, it crumbles to dust."));
				Random rand3 = new Random();
				for (int countparticles = 0; countparticles <= 20; ++countparticles) {
					world.spawnParticle("flame", player.posX + (rand3.nextDouble() - 0.5D) * (double) player.width,
							player.posY + rand3.nextDouble() * (double) player.height - (double) player.yOffset,
							player.posZ + (rand3.nextDouble() - 0.5D) * (double) player.width, 0.0D, 0.0D, 0.0D);
				}
				break;
			default:
				break;

			}
			player.inventory.consumeInventoryItem(ItemRegister.itemClosedWolfScroll);


		}
		return itemstack;
	}

	@Override
	public CreativeTabs[] getCreativeTabs() {
		return new CreativeTabs[] { LRPGMain.tabLegendaryRPG, CreativeTabs.tabCombat };
	}
}

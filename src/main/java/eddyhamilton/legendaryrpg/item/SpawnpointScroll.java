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
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class SpawnpointScroll extends Item {

	private final String setInfo;

	public SpawnpointScroll(String string, String string2) {
		super();
		this.setUnlocalizedName(string);
		this.setTextureName(LRPGMain.MODID + ":" + string);
		this.setInfo = string2;
		;

	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		if (!world.isRemote) {
			player.setSpawnChunk(player.playerLocation, true);
			player.destroyCurrentEquippedItem();
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 10));
		}

		Random rand = new Random();
		for (int countparticles = 0; countparticles <= 20; ++countparticles) {
			world.spawnParticle("explode", player.posX + (rand.nextDouble() - 0.5D) * (double) player.width,
					player.posY + rand.nextDouble() * (double) player.height
							- (double) player.yOffset,
					player.posZ + (rand.nextDouble() - 0.5D) * (double) player.width, 0.0D, 0.0D,
					0.0D);
		}
		return itemstack;
	}

	@Override
	public CreativeTabs[] getCreativeTabs() {
		return new CreativeTabs[] { LRPGMain.tabLegendaryRPG, CreativeTabs.tabCombat };
	}
}
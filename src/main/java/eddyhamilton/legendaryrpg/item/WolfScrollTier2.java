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

public class WolfScrollTier2 extends Item {

	
	public WolfScrollTier2(String string) {
		super();
		this.setUnlocalizedName(string);
		this.setTextureName(LRPGMain.MODID + ":" + string);


	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
	list.add("RELEASE THE DOGS! Currently WIP");
	list.add("\u00A74Level 2");
	list.add("\u00A724 Wolves");
	
	}
	
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		if (!world.isRemote) {
			int i = 1;
			while(i < 5){
			Random posXrand = new Random();
			Random posZrand = new Random();
			int posXoffset =  (posXrand.nextInt(5) - 3);
			int posZoffset = (posZrand.nextInt(5) - 3);
			EntityWolf entitywolf = new EntityWolf(player.worldObj);
			entitywolf.func_152115_b(player.getUniqueID().toString());
			entitywolf.setTamed(true);
			entitywolf.setPathToEntity((PathEntity) null);
			entitywolf.setAttackTarget((EntityLivingBase) null);
			entitywolf.setHealth(20.0F);
			entitywolf.worldObj.setEntityState(entitywolf, (byte) 7);
			entitywolf.setCollarColor(10);
			entitywolf.setPositionAndUpdate(player.posX + posXoffset, player.posY, player.posZ + posZoffset);
			player.worldObj.spawnEntityInWorld(entitywolf);
			i++;
			}
			
			player.destroyCurrentEquippedItem();
			world.playSoundAtEntity(player, LRPGMain.MODID + ":wolfscroll", 1, 1);
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

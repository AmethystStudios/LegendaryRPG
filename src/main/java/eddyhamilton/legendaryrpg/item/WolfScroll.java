package eddyhamilton.legendaryrpg.item;

import java.util.List;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;



public class WolfScroll extends ItemSword  {
	
	
	private final String setInfo;
	
	   public WolfScroll(ToolMaterial material, String string, String string2) {
			super(material);
			this.setUnlocalizedName(string);
			this.setTextureName(LRPGMain.MODID + ":" + string);
			this.setInfo = string2;
	   }	   
	   
	   public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	    {
           EntityWolf entitywolf = new EntityWolf(player.worldObj);
           entitywolf.isTamed();
           entitywolf.setLocationAndAngles(player.posX, player.posY, player.posZ, player.rotationYaw, 0.0F);
           player.worldObj.spawnEntityInWorld(entitywolf);
		   return itemstack;
	    }
	@Override
	public CreativeTabs[] getCreativeTabs() {
		return new CreativeTabs[] { LRPGMain.tabLegendaryRPG, }; 
	}
}

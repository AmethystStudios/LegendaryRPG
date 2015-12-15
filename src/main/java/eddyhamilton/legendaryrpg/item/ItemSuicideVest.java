package eddyhamilton.legendaryrpg.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import java.util.List;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.*;

public class ItemSuicideVest extends ItemArmor {
	public ItemSuicideVest(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (this.armorType == 2) {
			return "lrpg:textures/models/armor/infinium_armor_2.png";
		}

		return "lrpg:textures/models/armor/suicide_vest_1.png";

	}
	/******************************************************
	 * Perhaps make a class for detonator and make it 
	 * "Block" without being a sword, for the sake of
	 * animation and Usability
	 ******************************************************/
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
	list.add("What are you doing?! THIS IS A BOMB!");
	}
	
	
	@Override
	public CreativeTabs[] getCreativeTabs() {
		return new CreativeTabs[] { CreativeTabs.tabCombat, LRPGMain.tabLegendaryRPG };
	}
	DamageSource SuicideDamage = (new DamageSource("lrpg.SuicideDamage")).setDamageBypassesArmor().setDamageAllowedInCreativeMode().setDamageIsAbsolute();
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		
			
		if (player.getHeldItem() != null
				&& player.getHeldItem().getItem().equals(ItemRegister.itemSuicideDetonator)
				&& player.getItemInUse() != null) {
			float f = 13.0F;
		    player.setCurrentItemOrArmor(3, null);
		    player.setCurrentItemOrArmor(0, null);
			player.worldObj.createExplosion(player, player.posX, player.posY, player.posZ, f, true);
			player.attackEntityFrom(SuicideDamage, 90000);
		
		
		}


		else return;
		
	}
	


}

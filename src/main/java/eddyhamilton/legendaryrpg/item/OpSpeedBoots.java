package eddyhamilton.legendaryrpg.item;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class OpSpeedBoots extends ItemArmor {
	public OpSpeedBoots(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
	}

	@Override
	public CreativeTabs[] getCreativeTabs() {
	 return new CreativeTabs[] {CreativeTabs.tabCombat, LRPGMain.tabLegendaryRPG}; 
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player,
			ItemStack itemStack) {
		if (player.getCurrentArmor(0) != null)
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 10));
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (this.armorType == 2) {
			return "lrpg:textures/models/armor/opspeedboots_armor_2.png";
		}

		return "lrpg:textures/models/armor/boots_of_swiftness_1.png";

	}

}
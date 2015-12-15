package eddyhamilton.legendaryrpg.item;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHealthBoost;
import net.minecraft.world.World;

public class GodArmor extends ItemArmor {
	public GodArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
	}
	
	@Override
	public CreativeTabs[] getCreativeTabs() {
	 return new CreativeTabs[] {CreativeTabs.tabCombat, LRPGMain.tabLegendaryRPG};
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player,
			ItemStack itemStack) {
		if (player.getCurrentArmor(0) != null
				&& player.getCurrentArmor(0).getItem()
						.equals(ItemRegister.itemOpSpeedBoots))
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 20, 20));
		player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 10, 10));
		player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 10, 10));
		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 10, 10));
		player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 10,
				10));
		player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 10, 10));
		player.addPotionEffect(new PotionEffect(Potion.jump.id, 3, 3));
		player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 10, 10));
		player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 10, 10));

	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (this.armorType == 2) {
			return "lrpg:textures/models/armor/god_armor_2.png";
		}

		return "lrpg:textures/models/armor/god_armor_1.png";

	}

}
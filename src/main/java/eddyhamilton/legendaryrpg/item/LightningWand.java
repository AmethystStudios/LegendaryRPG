package eddyhamilton.legendaryrpg.item;

import java.util.List;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class LightningWand extends Item {
	private final String setInfo;

	public LightningWand(String string, String string2) {
		super();
		this.setUnlocalizedName(string);
		this.setTextureName(LRPGMain.MODID + ":" + string);
		this.setInfo = string2;
	}

	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean bool) {
		list.add(setToolTipData());
	}

	private String setToolTipData() {
		return this.setInfo;
	}

	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {

		return stack;
	}

	@Override
	public CreativeTabs[] getCreativeTabs() {
		return new CreativeTabs[] { LRPGMain.tabLegendaryRPG, };
	}

}
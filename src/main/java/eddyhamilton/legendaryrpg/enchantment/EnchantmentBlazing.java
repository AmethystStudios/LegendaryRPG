package eddyhamilton.legendaryrpg.enchantment;

import java.util.Random;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class EnchantmentBlazing extends Enchantment
{
    private static final String __OBFID = "CL_00000122";

    public EnchantmentBlazing(int ID, int Rarity)
    {
        super(ID, Rarity, EnumEnchantmentType.armor_torso);
        this.setName("Blazing");
    }

    public int getMinEnchantability(int par1)
    {
    	//The first return is the minimum level spent in enchantment table to obtain it.
        return 10 + 20 * (par1 - 1);
    }


    public int getMaxEnchantability(int par1)
    {
        return super.getMinEnchantability(par1) + 50;
    }

  public int getMaxLevel()
    {
        return 3;
    }

    public boolean canApply(ItemStack stack)
    {
        return stack.getItem() instanceof ItemArmor ? true : super.canApply(stack);
    }

    public void func_151367_b(EntityLivingBase p_151367_1_, Entity Attacker, int p_151367_3_)
    {
        Random random = p_151367_1_.getRNG();
        ItemStack itemstack = EnchantmentHelper.func_92099_a(Enchantment.thorns, p_151367_1_);

        if (func_92094_a(p_151367_3_, random))
        {

        	Attacker.setFire(5);
            Attacker.playSound("random.click", 0.5F, 1.0F);

            if (itemstack != null)
            {
                itemstack.damageItem(3, p_151367_1_);
            }
        }
        else if (itemstack != null)
        {
            itemstack.damageItem(1, p_151367_1_);
        }
    }

    public static boolean func_92094_a(int p_92094_0_, Random p_92094_1_)
    {
        return p_92094_0_ <= 0 ? false : p_92094_1_.nextFloat() < 0.15F * (float)p_92094_0_;
    }

    public static int func_92095_b(int p_92095_0_, Random p_92095_1_)
    {
        return p_92095_0_ > 10 ? p_92095_0_ - 10 : 1 + p_92095_1_.nextInt(4);
    }
}
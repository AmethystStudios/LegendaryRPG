package eddyhamilton.legendaryrpg.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public class EnchantmentLifeoftheGreatTree extends Enchantment {

    public EnchantmentLifeoftheGreatTree(int p_i1937_1_, int p_i1937_2_)
    {
        super(p_i1937_1_, p_i1937_2_, EnumEnchantmentType.all);
        this.setName("LifeoftheGreatTree");
    }
    public boolean canApplyAtEnchantingTable()
    {
        return false;
    }   

   	
    }


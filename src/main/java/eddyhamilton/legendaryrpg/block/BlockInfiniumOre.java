package eddyhamilton.legendaryrpg.block;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.world.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;

public class BlockInfiniumOre extends Block
{
    public BlockInfiniumOre(final String string, final Material rock) {
        super(Material.sand);
        this.setHardness(10.0f);
        this.setResistance(1000.0f);
        this.setLightLevel(1.0f);
        this.setHarvestLevel("pickaxe", 3);
        this.setBlockTextureName(LRPGMain.MODID + ":" + string);
    
    
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        float f = 0.125F;
        return AxisAlignedBB.getBoundingBox((double)p_149668_2_, (double)p_149668_3_, (double)p_149668_4_, (double)(p_149668_2_ + 1), (double)((float)(p_149668_3_ + 1) - f), (double)(p_149668_4_ + 1));
    }
    public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_)
    {
        p_149670_5_.motionX *= 0.4D;
        p_149670_5_.motionZ *= 0.4D;
    }
}

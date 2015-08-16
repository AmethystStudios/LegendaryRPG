package eddyhamilton.legendaryrpg.worldgen.feature;

import net.minecraft.world.gen.feature.*;
import net.minecraft.block.*;
import net.minecraft.init.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.util.*;

public class SoulSandNetherGenMinable extends WorldGenerator
{
    private Block field_150519_a;
    private int numberOfBlocks;
    private Block field_150518_c;
    private static final String __OBFID = "CL_00000426";
    private int mineableBlockMeta;
    
    public SoulSandNetherGenMinable(final Block p_i45459_1_, final int p_i45459_2_) {
        this(p_i45459_1_, p_i45459_2_, Blocks.soul_sand);
    }
    
    public SoulSandNetherGenMinable(final Block p_i45460_1_, final int p_i45460_2_, final Block p_i45460_3_) {
        this.field_150519_a = p_i45460_1_;
        this.numberOfBlocks = p_i45460_2_;
        this.field_150518_c = p_i45460_3_;
    }
    
    public SoulSandNetherGenMinable(final Block block, final int meta, final int number, final Block target) {
        this(block, number, target);
        this.mineableBlockMeta = meta;
    }
    
    public boolean generate(final World par1World, final Random par2Random, final int par3, final int par4, final int par5) {
        final float f = par2Random.nextFloat() * 3.1415927f;
        final double d0 = par3 + 8 + MathHelper.sin(f) * this.numberOfBlocks / 8.0f;
        final double d = par3 + 8 - MathHelper.sin(f) * this.numberOfBlocks / 8.0f;
        final double d2 = par5 + 8 + MathHelper.cos(f) * this.numberOfBlocks / 8.0f;
        final double d3 = par5 + 8 - MathHelper.cos(f) * this.numberOfBlocks / 8.0f;
        final double d4 = par4 + par2Random.nextInt(3) - 2;
        final double d5 = par4 + par2Random.nextInt(3) - 2;
        for (int l = 0; l <= this.numberOfBlocks; ++l) {
            final double d6 = d0 + (d - d0) * l / this.numberOfBlocks;
            final double d7 = d4 + (d5 - d4) * l / this.numberOfBlocks;
            final double d8 = d2 + (d3 - d2) * l / this.numberOfBlocks;
            final double d9 = par2Random.nextDouble() * this.numberOfBlocks / 16.0;
            final double d10 = (MathHelper.sin(l * 3.1415927f / this.numberOfBlocks) + 1.0f) * d9 + 1.0;
            final double d11 = (MathHelper.sin(l * 3.1415927f / this.numberOfBlocks) + 1.0f) * d9 + 1.0;
            final int i1 = MathHelper.floor_double(d6 - d10 / 2.0);
            final int j1 = MathHelper.floor_double(d7 - d11 / 2.0);
            final int k1 = MathHelper.floor_double(d8 - d10 / 2.0);
            final int l2 = MathHelper.floor_double(d6 + d10 / 2.0);
            final int i2 = MathHelper.floor_double(d7 + d11 / 2.0);
            final int j2 = MathHelper.floor_double(d8 + d10 / 2.0);
            for (int k2 = i1; k2 <= l2; ++k2) {
                final double d12 = (k2 + 0.5 - d6) / (d10 / 2.0);
                if (d12 * d12 < 1.0) {
                    for (int l3 = j1; l3 <= i2; ++l3) {
                        final double d13 = (l3 + 0.5 - d7) / (d11 / 2.0);
                        if (d12 * d12 + d13 * d13 < 1.0) {
                            for (int i3 = k1; i3 <= j2; ++i3) {
                                final double d14 = (i3 + 0.5 - d8) / (d10 / 2.0);
                                if (d12 * d12 + d13 * d13 + d14 * d14 < 1.0 && par1World.getBlock(k2, l3, i3).isReplaceableOreGen(par1World, k2, l3, i3, this.field_150518_c)) {
                                    par1World.setBlock(k2, l3, i3, this.field_150519_a, this.mineableBlockMeta, 2);
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
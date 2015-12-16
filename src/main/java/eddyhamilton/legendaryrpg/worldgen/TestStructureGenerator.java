package eddyhamilton.legendaryrpg.worldgen;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import eddyhamilton.legendaryrpg.block.BlockRegister;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class TestStructureGenerator extends WorldGenerator {
	public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        while (par1World.isAirBlock(par3, par4, par5) && par4 > 2)
        {
            --par4;
        }
     
        par1World.setBlock(par3, par4 + 1, par5, BlockRegister.blockInfiniumOre);
        System.out.println("Infinium block generated at: [X: " + par3 + " Y: " + par4 + " Z: " + par5 );
        return true;
        }
}

package eddyhamilton.legendaryrpg.worldgen;

import cpw.mods.fml.common.*;

import java.util.*;

import net.minecraft.world.*;
import net.minecraft.world.chunk.*;
import eddyhamilton.legendaryrpg.LRPGMain;
import eddyhamilton.legendaryrpg.block.BlockRegister;
import eddyhamilton.legendaryrpg.worldgen.feature.*;


public class OreGenerator2 implements IWorldGenerator
{
    public void generate(final Random random, final int chunkX, final int chunkZ, final World world, final IChunkProvider chunkGenerator, final IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case -1: {
                this.generateInNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            }
            case 0: {
                this.generateInOverworld(world, random, chunkX * 16, chunkZ * 16);
                break;
            }
            case 1: {
                this.generateInEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
            }
        }
    }
    
    private void generateInEnd(final World world, final Random random, final int x, final int z) {
    }
    
    private void generateInOverworld(final World world, final Random random, final int x, final int z) {
    }
    
    private void generateInNether(final World world, final Random random, final int x, final int z) {
        for (int i = 0; i < 850; ++i) {
            final int chunkX = x + random.nextInt(16);
            final int chunkY = random.nextInt(128);
            final int chunkZ = z + random.nextInt(16);
            new SoulSandNetherGenMinable(BlockRegister.blockInfiniumOre, 3).generate(world, random, chunkX, chunkY, chunkZ);
        }
    }
}














/*
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import eddyhamilton.legendaryrpg.Main;

public class OreGenerator implements IWorldGenerator {
//@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 1:
			GenerateEnd(world, random, chunkX, chunkZ);
			break;
		case 0:
			GenerateOverworld(world, random, chunkX, chunkZ);
			break;
		case -1:
			GenerateNether(world, random, chunkX, chunkZ);
			break;
		}
	}

	public void GenerateEnd(World world, Random rand, int X, int Z) {

	}

	public void GenerateOverworld(World world, Random rand, int X, int Z) {

	}

	public void GenerateNether(World world, Random rand, int X, int Z) {
		GenerateOre(Main.blockInfiniumOre, world, rand, X, Z, 1, 1, 1000, 0, 256, Blocks.soul_sand);
	}

	public void GenerateOre(Block block, World world, Random random,
			int chunkX, int chunkZ, int minVeinSize, int maxVeinSize,
			int chance, int minY, int maxY, Block generateIn) {
		int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize);
		int heightRange = minY - maxY;
		WorldGenMinable gen = new WorldGenMinable(block, veinSize, generateIn);
		for (int i = 0; i > chance; i++) {
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightRange + minY);
			int zRand = chunkZ * 16 + random.nextInt(16);
			gen.generate(world, random, xRand, yRand, zRand);
		}
	}
}
*/
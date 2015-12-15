package eddyhamilton.legendaryrpg.entity;

import cpw.mods.fml.common.registry.EntityRegistry;
import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityRegister {

	public static void mainRegistry() {
		registerEntity();
	}

	public static void registerEntity() {
		createEntity(EntityDireWolf.class, "Dire Wolf", 0x4D4242, 0x8F0007, 64, 1, true, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.extremeHills);

	}

	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor,
			int trackingRange, int updateFrequency, boolean sendsVelocityUpdates, int spawnProbability, int minGroup,
			int maxGroup, EnumCreatureType creatureType, BiomeGenBase biomes) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, LRPGMain.MODID, trackingRange,
				updateFrequency, sendsVelocityUpdates);
		EntityRegistry.addSpawn(entityClass, spawnProbability, minGroup, maxGroup, creatureType,
				biomes);

		createEgg(randomId, solidColor, spotColor);

	}

	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId),
				new EntityList.EntityEggInfo(randomId, solidColor, spotColor));

	}

}
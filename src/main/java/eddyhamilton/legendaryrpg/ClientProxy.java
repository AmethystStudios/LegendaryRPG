package eddyhamilton.legendaryrpg;

import net.minecraft.client.model.ModelSquid;
import net.minecraft.client.renderer.entity.RenderSquid;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import eddyhamilton.legendaryrpg.block.*;
import eddyhamilton.legendaryrpg.entity.EntityDireWolf;

public class ClientProxy extends ServerProxy {

	public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityDireWolf.class, 
			      new RenderSquid(new ModelSquid(), 5.0F));
	
	}
	
}

package eddyhamilton.legendaryrpg;

import net.minecraft.client.model.ModelSquid;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.renderer.entity.RenderSquid;
import net.minecraft.client.renderer.entity.RenderWolf;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import eddyhamilton.legendaryrpg.block.*;
import eddyhamilton.legendaryrpg.entity.EntityDireWolf;
import eddyhamilton.legendaryrpg.entity.ModelDireWolf;
import eddyhamilton.legendaryrpg.entity.RenderDireWolf;

public class ClientProxy extends ServerProxy {


	 
	 
	 
	 public void registerRenderThings(){
	 	//Must Register Entities here
			RenderingRegistry.registerEntityRenderingHandler(EntityDireWolf.class, new RenderDireWolf(new ModelDireWolf(), new ModelDireWolf(), 0f));

		

		 

		 


	
	}
	
}

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
import eddyhamilton.legendaryrpg.entity.TileEntityGiantCake;
import eddyhamilton.legendaryrpg.util.TileEntityRenderer;

public class ClientProxy extends ServerProxy {
	private TileEntitySpecialRenderer renderer = new TileEntityRenderer();
	 private TileEntity tileEntity = new TileEntityGiantCake();


	 
	 
	 
	 public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityDireWolf.class, 
			      new RenderWolf(new ModelWolf(), null, 5.0F));
		
		

		 

		 
		 
		 //TileEntities
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGiantCake.class, renderer);


	
	}
	
}

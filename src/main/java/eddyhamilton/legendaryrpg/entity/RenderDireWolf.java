package eddyhamilton.legendaryrpg.entity;

import eddyhamilton.legendaryrpg.LRPGMain;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderWolf;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderDireWolf extends RenderWolf {
	
	
	private static final ResourceLocation mobTextures = new ResourceLocation(LRPGMain.MODID + ":textures/entity/DireWolf.png");
	public RenderDireWolf(ModelBase ModelBase, ModelBase RenderPassModel, float par1) {
		super(ModelBase, RenderPassModel, par1);
	
	}
	protected ResourceLocation getEntityTexture(EntityDireWolf entity){
		return mobTextures;
	}

	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityDireWolf) entity);
	}
}

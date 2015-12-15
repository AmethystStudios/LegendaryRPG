package eddyhamilton.legendaryrpg.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.MathHelper;

public class ModelDireWolf extends ModelWolf
{
  //fields
    ModelRenderer WolfHead;
    ModelRenderer Body;
    ModelRenderer Mane;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Tail;
    ModelRenderer Ear1;
    ModelRenderer Ear2;
    ModelRenderer Nose;
  
  public ModelDireWolf()
  {
    textureWidth = 256;
    textureHeight = 64;
    
      WolfHead = new ModelRenderer(this, 68, 11);
      WolfHead.addBox(-3F, -3F, -2F, 12, 12, 8);
      WolfHead.setRotationPoint(-3F, 2.5F, -17F);
      WolfHead.setTextureSize(256, 64);
      WolfHead.mirror = true;
      setRotation(WolfHead, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 183, 11);
      Body.addBox(-4F, -2F, -3F, 12, 18, 12);
      Body.setRotationPoint(-2F, 8F, 2F);
      Body.setTextureSize(256, 64);
      Body.mirror = true;
      setRotation(Body, 1.570796F, 0F, 0F);
      Mane = new ModelRenderer(this, 113, 11);
      Mane.addBox(-4F, -3F, -3F, 16, 12, 14);
      Mane.setRotationPoint(-4F, 9F, -9F);
      Mane.setTextureSize(256, 64);
      Mane.mirror = true;
      setRotation(Mane, 1.570796F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 218, 42);
      Leg1.addBox(-1F, 0F, -1F, 4, 16, 4);
      Leg1.setRotationPoint(-4.5F, 8F, 14F);
      Leg1.setTextureSize(256, 64);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 197, 42);
      Leg2.addBox(-1F, 0F, -1F, 4, 16, 4);
      Leg2.setRotationPoint(2.5F, 8F, 14F);
      Leg2.setTextureSize(256, 64);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 164, 42);
      Leg3.addBox(-1F, 0F, -1F, 4, 16, 4);
      Leg3.setRotationPoint(-4.5F, 8F, -9F);
      Leg3.setTextureSize(256, 64);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 142, 41);
      Leg4.addBox(-1F, 0F, -1F, 4, 16, 4);
      Leg4.setRotationPoint(2.5F, 8F, -9F);
      Leg4.setTextureSize(256, 64);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 235, 15);
      Tail.addBox(-1F, 0F, -1F, 4, 16, 4);
      Tail.setRotationPoint(-1F, 2F, 16F);
      Tail.setTextureSize(256, 64);
      Tail.mirror = true;
      setRotation(Tail, 1.130069F, 0F, 0F);
      Ear1 = new ModelRenderer(this, 67, 2);
      Ear1.addBox(-3F, -5F, 0F, 3, 6, 2);
      Ear1.setRotationPoint(-2F, -0.5F, -17F);
      Ear1.setTextureSize(256, 64);
      Ear1.mirror = true;
      setRotation(Ear1, 0F, 0F, 0F);
      Ear2 = new ModelRenderer(this, 79, 2);
      Ear2.addBox(1F, -5F, 0F, 3, 6, 2);
      Ear2.setRotationPoint(1F, -0.5F, -17F);
      Ear2.setTextureSize(256, 64);
      Ear2.mirror = true;
      setRotation(Ear2, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 36, 10);
      Nose.addBox(-2F, 0F, -5F, 6, 6, 8);
      Nose.setRotationPoint(-1.5F, 4.5F, -20.6F);
      Nose.setTextureSize(256, 64);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    WolfHead.render(f5);
    Body.render(f5);
    Mane.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
    Tail.render(f5);
    Ear1.render(f5);
    Ear2.render(f5);
    Nose.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  

  
  public void setRotationAngles(float f1, float f2, float f3, float f4, float f5, float f6, Entity entity)
  {
      super.setRotationAngles(f1, f2, f3, f4, f5, f6, entity);
      this.WolfHead.rotateAngleX = f5 / (180F / (float)Math.PI);
      this.WolfHead.rotateAngleY = f4 / (180F / (float)Math.PI);
      this.Nose.rotateAngleX = f5 / (180F / (float)Math.PI);
      this.Nose.rotateAngleY = f4 / (180F / (float)Math.PI);
      this.Ear1.rotateAngleX = f5 / (180F / (float)Math.PI);
      this.Ear1.rotateAngleY = f4 / (180F / (float)Math.PI);
      this.Ear2.rotateAngleX = f5 / (180F / (float)Math.PI);
      this.Ear2.rotateAngleY = f4 / (180F / (float)Math.PI);
      this.Tail.rotateAngleX = f3;
  }

}

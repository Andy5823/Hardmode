package Hardmode.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEnderForge extends ModelBase
{
	ModelRenderer Base;
    ModelRenderer EdgeBack;
    ModelRenderer EdgeFront;
    ModelRenderer EdgeLeft;
    ModelRenderer EdgeRight;
    ModelRenderer InnerCorner1;
    ModelRenderer InnerCorner2;
    ModelRenderer InnerCorner3;
    ModelRenderer InnerCorner4;
    ModelRenderer Lava;
    ModelRenderer Corner1;
    ModelRenderer Corner2;
    ModelRenderer Corner3;
    ModelRenderer Corner4;
    ModelRenderer CornerIn1;
    ModelRenderer CornerIn2;
    ModelRenderer CornerIn3;
    ModelRenderer CornerIn4;
  
  public ModelEnderForge()
  {
    textureWidth = 256;
    textureHeight = 64;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 14, 8, 14);
      Base.setRotationPoint(-7F, 16F, -7F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      EdgeBack = new ModelRenderer(this, 30, 26);
      EdgeBack.addBox(0F, 0F, 0F, 14, 2, 1);
      EdgeBack.setRotationPoint(-7F, 14F, 6F);
      EdgeBack.setTextureSize(64, 32);
      EdgeBack.mirror = true;
      setRotation(EdgeBack, 0F, 0F, 0F);
      EdgeFront = new ModelRenderer(this, 30, 26);
      EdgeFront.addBox(0F, 0F, 0F, 14, 2, 1);
      EdgeFront.setRotationPoint(-7F, 14F, -7F);
      EdgeFront.setTextureSize(64, 32);
      EdgeFront.mirror = true;
      setRotation(EdgeFront, 0F, 0F, 0F);
      EdgeLeft = new ModelRenderer(this, 0, 25);
      EdgeLeft.addBox(0F, 0F, 0F, 1, 2, 12);
      EdgeLeft.setRotationPoint(6F, 14F, -6F);
      EdgeLeft.setTextureSize(64, 32);
      EdgeLeft.mirror = true;
      setRotation(EdgeLeft, 0F, 0F, 0F);
      EdgeRight = new ModelRenderer(this, 0, 25);
      EdgeRight.addBox(0F, 0F, 0F, 1, 2, 12);
      EdgeRight.setRotationPoint(-7F, 14F, -6F);
      EdgeRight.setTextureSize(64, 32);
      EdgeRight.mirror = true;
      setRotation(EdgeRight, 0F, 0F, 0F);
      InnerCorner1 = new ModelRenderer(this, 0, 40);
      InnerCorner1.addBox(0F, 0F, 0F, 1, 2, 1);
      InnerCorner1.setRotationPoint(5F, 14.5F, -6F);
      InnerCorner1.setTextureSize(64, 32);
      InnerCorner1.mirror = true;
      setRotation(InnerCorner1, 0F, 0F, 0F);
      InnerCorner2 = new ModelRenderer(this, 0, 40);
      InnerCorner2.addBox(0F, 0F, 0F, 1, 2, 1);
      InnerCorner2.setRotationPoint(-6F, 14.5F, -6F);
      InnerCorner2.setTextureSize(64, 32);
      InnerCorner2.mirror = true;
      setRotation(InnerCorner2, 0F, 0F, 0F);
      InnerCorner3 = new ModelRenderer(this, 0, 40);
      InnerCorner3.addBox(0F, 0F, 0F, 1, 2, 1);
      InnerCorner3.setRotationPoint(-6F, 14.5F, 5F);
      InnerCorner3.setTextureSize(64, 32);
      InnerCorner3.mirror = true;
      setRotation(InnerCorner3, 0F, 0F, 0F);
      InnerCorner4 = new ModelRenderer(this, 0, 40);
      InnerCorner4.addBox(0F, 0F, 0F, 1, 2, 1);
      InnerCorner4.setRotationPoint(5F, 14.5F, 5F);
      InnerCorner4.setTextureSize(64, 32);
      InnerCorner4.mirror = true;
      setRotation(InnerCorner4, 0F, 0F, 0F);
      Lava = new ModelRenderer(this, 65, 0);
      Lava.addBox(0F, 0F, 0F, 13, 1, 13);
      Lava.setRotationPoint(-6.5F, 15F, -6.5F);
      Lava.setTextureSize(64, 32);
      Lava.mirror = true;
      setRotation(Lava, 0F, 0F, 0F);
      Corner1 = new ModelRenderer(this, 12, 40);
      Corner1.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
      Corner1.setRotationPoint(-7.5F, 12.5F, -7.5F);
      Corner1.setTextureSize(64, 32);
      Corner1.mirror = true;
      setRotation(Corner1, -0.5235988F, -1.658063F, -0.5235988F);
      Corner2 = new ModelRenderer(this, 12, 40);
      Corner2.addBox(-0.5F, -4F, -0.5F, 1, 4, 1);
      Corner2.setRotationPoint(7.2F, 12.5F, -7.5F);
      Corner2.setTextureSize(64, 32);
      Corner2.mirror = true;
      setRotation(Corner2, -0.5235988F, -1.396263F, 2.617994F);
      Corner3 = new ModelRenderer(this, 12, 40);
      Corner3.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
      Corner3.setRotationPoint(7.5F, 12.5F, 7.5F);
      Corner3.setTextureSize(64, 32);
      Corner3.mirror = true;
      setRotation(Corner3, 0.5235988F, -1.658063F, 0.5235988F);
      Corner4 = new ModelRenderer(this, 12, 40);
      Corner4.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
      Corner4.setRotationPoint(-7.6F, 12.5F, 7.4F);
      Corner4.setTextureSize(64, 32);
      Corner4.mirror = true;
      setRotation(Corner4, -2.617994F, -1.570796F, -2.617994F);
      CornerIn1 = new ModelRenderer(this, 12, 40);
      CornerIn1.addBox(-0.5F, -4F, -0.5F, 1, 3, 1);
      CornerIn1.setRotationPoint(-5.5F, 10F, 5.5F);
      CornerIn1.setTextureSize(64, 32);
      CornerIn1.mirror = true;
      setRotation(CornerIn1, -0.5235988F, -1.570796F, 2.617994F);
      CornerIn2 = new ModelRenderer(this, 12, 40);
      CornerIn2.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      CornerIn2.setRotationPoint(5.7F, 10.5F, -5.7F);
      CornerIn2.setTextureSize(64, 32);
      CornerIn2.mirror = true;
      setRotation(CornerIn2, -2.617994F, -1.396263F, -2.617994F);
      CornerIn3 = new ModelRenderer(this, 12, 40);
      CornerIn3.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      CornerIn3.setRotationPoint(-6F, 10.5F, -6F);
      CornerIn3.setTextureSize(64, 32);
      CornerIn3.mirror = true;
      setRotation(CornerIn3, 0.5235988F, -1.658063F, 0.5235988F);
      CornerIn4 = new ModelRenderer(this, 12, 40);
      CornerIn4.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      CornerIn4.setRotationPoint(6F, 10.5F, 6F);
      CornerIn4.setTextureSize(64, 32);
      CornerIn4.mirror = true;
      setRotation(CornerIn4, -0.5235988F, -1.658063F, -0.5235988F);
  }
  
  public void renderModel(float f1)
  {
	  Base.render(f1);
	  EdgeBack.render(f1);
	  EdgeFront.render(f1);
	  EdgeLeft.render(f1);
	  EdgeRight.render(f1);
	  InnerCorner1.render(f1);
	  InnerCorner2.render(f1);
	  InnerCorner3.render(f1);
	  InnerCorner4.render(f1);
	  Lava.render(f1);
	  Corner1.renderWithRotation(f1);
	  Corner2.renderWithRotation(f1);
	  Corner3.renderWithRotation(f1);
	  Corner4.renderWithRotation(f1);
	  CornerIn1.renderWithRotation(f1);
	  CornerIn2.renderWithRotation(f1);
	  CornerIn3.renderWithRotation(f1);
	  CornerIn4.renderWithRotation(f1);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
	  super.render(entity, f, f1, f2, f3, f4, f5);
	  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	  Base.render(f5);
	  EdgeBack.render(f5);
	  EdgeFront.render(f5);
	  EdgeLeft.render(f5);
	  EdgeRight.render(f5);
	  InnerCorner1.render(f5);
	  InnerCorner2.render(f5);
	  InnerCorner3.render(f5);
	  InnerCorner4.render(f5);
	  Lava.render(f5);
	  Corner1.renderWithRotation(f5);
	  Corner2.renderWithRotation(f5);
	  Corner3.renderWithRotation(f5);
	  Corner4.renderWithRotation(f5);
	  CornerIn1.renderWithRotation(f5);
	  CornerIn2.renderWithRotation(f5);
	  CornerIn3.renderWithRotation(f5);
	  CornerIn4.renderWithRotation(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}

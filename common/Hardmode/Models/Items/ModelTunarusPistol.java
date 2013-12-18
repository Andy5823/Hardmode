package Hardmode.Models.Items;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTunarusPistol extends ModelBase
{
	  //fields
	    ModelRenderer Main_Gun_Body;
	    ModelRenderer Scope_link;
	    ModelRenderer Scope;
	    ModelRenderer Handle;
	  
	  public ModelTunarusPistol()
	  {
	    textureWidth = 512;
	    textureHeight = 512;
	    
	      Main_Gun_Body = new ModelRenderer(this, 41, 24);
	      Main_Gun_Body.addBox(0F, 0F, 0F, 4, 3, 7);
	      Main_Gun_Body.setRotationPoint(-2F, 10F, -4F);
	      Main_Gun_Body.setTextureSize(512, 512);
	      Main_Gun_Body.mirror = true;
	      setRotation(Main_Gun_Body, 0F, 0F, 0F);
	      Scope_link = new ModelRenderer(this, 46, 18);
	      Scope_link.addBox(0F, 0F, 0F, 2, 1, 1);
	      Scope_link.setRotationPoint(-1F, 9F, 0F);
	      Scope_link.setTextureSize(512, 512);
	      Scope_link.mirror = true;
	      setRotation(Scope_link, 0F, 0F, 0F);
	      Scope = new ModelRenderer(this, 43, 4);
	      Scope.addBox(0F, 0F, 0F, 2, 2, 4);
	      Scope.setRotationPoint(-1F, 7F, -2F);
	      Scope.setTextureSize(512, 512);
	      Scope.mirror = true;
	      setRotation(Scope, 0F, 0F, 0F);
	      Handle = new ModelRenderer(this, 31, 40);
	      Handle.addBox(0F, 0F, 0F, 2, 3, 2);
	      Handle.setRotationPoint(-1F, 12F, 2F);
	      Handle.setTextureSize(512, 512);
	      Handle.mirror = true;
	      setRotation(Handle, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Main_Gun_Body.render(f5);
	    Scope_link.render(f5);
	    Scope.render(f5);
	    Handle.render(f5);
	  }
	  
	  /*public void renderModel(float f1)
	  {
		  Main_Gun_Body.render(f1);
		  Scope_link.render(f1);
		  Scope.render(f1);
		  Handle.render(f1);
	  }*/
	  
	  
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
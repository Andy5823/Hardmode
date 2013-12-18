package Hardmode.Client.Renders.Items;

import org.lwjgl.opengl.GL11;

import Hardmode.Models.Items.ModelTunarusPistol;
import Hardmode.Refrences.Textures;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class RenderItemTunarusPistol implements IItemRenderer
{
	protected ModelTunarusPistol itemModel;
	
	public RenderItemTunarusPistol()
	{
		itemModel = new ModelTunarusPistol();
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
		switch(type)
		{
			case EQUIPPED: return true;
			default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
	{
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		switch(type)
		{
			case  EQUIPPED:
			{
				GL11.glPushMatrix();
				
				Minecraft.getMinecraft().renderEngine.bindTexture(Textures.MODEL_TUNARUS_PISTOL);
				
				float scale = 0.9F;
				
				GL11.glScalef(scale, scale, scale);
				
				GL11.glRotatef(180F, 1F, 0F, 0F);
				GL11.glRotatef(-20F, 0F, 1F, 0F);
				GL11.glRotatef(-15F, 0F,  0F, 1F);
				
				itemModel.render((Entity)data[1], 0F, 0F, 0F, 0F, 0F, 0.0625F);
				
				GL11.glPopMatrix();
			}
			case EQUIPPED_FIRST_PERSON:
			{
                GL11.glPushMatrix();
				
				Minecraft.getMinecraft().renderEngine.bindTexture(Textures.MODEL_TUNARUS_PISTOL);
				
				float scale = 0.9F;
				
				GL11.glScalef(scale, scale, scale);
				
				GL11.glRotatef(180F, 1F, 0F, 0F);
				GL11.glRotatef(-20F, 0F, 1F, 0F);
				GL11.glRotatef(-15F, 0F,  0F, 1F);
				
				itemModel.render((Entity)data[1], 0F, 0F, 0F, 0F, 0F, 0.0625F);
				
				GL11.glPopMatrix();
			}
			default:
				break;
		}
	}
	
}

package Hardmode.Client.Renders;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBook;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import Hardmode.Models.ModelSpellBinder;
import Hardmode.Refrences.Textures;
import Hardmode.TileEntities.TileEntitySpellBinder;
import cpw.mods.fml.client.FMLClientHandler;

public class RenderSpellBinder extends TileEntitySpecialRenderer
{
    private ModelSpellBinder aModel;
    private ModelBook enchantmentBook;
    
    public RenderSpellBinder()
    {
        aModel = new ModelSpellBinder();
        enchantmentBook = new ModelBook();
    }
    
    public void renderAModelAt(TileEntitySpellBinder tileentity, double d, double d1, double d2, float f)
    {
        int i;
        if (tileentity.worldObj == null)
        {
                i = 0;
        } 
        else 
        {
                Block block = tileentity.getBlockType();
                i = tileentity.getBlockMetadata();
                if (block != null && i == 0)
                {
                        i = tileentity.getBlockMetadata();
                }
        }
        
        GL11.glPushMatrix();
        GL11.glTranslatef((float) d + 0.5F, (float) d1 + 1.5F, (float) d2 + 0.5F);
        GL11.glRotatef(180, 0F, 0F, 1F);
        int j = 0;
        if(i == 3)
        {
                j = 270;
        }
        if(i == 2)
        {
                j = 180;
        }
        if(i == 1)
        {
                j = 90;
        }
        GL11.glRotatef(j, 0.0F, 1.0F, 0F);
        //FMLClientHandler.instance().getClient().renderEngine.func_110577_a(Textures.MODEL_GREEN_HOUSE);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(Textures.MODEL_SPELL_BINDER);
        GL11.glPushMatrix();
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
        //GL11.glEnable(GL11.GL_CULL_FACE);
        //GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        
        aModel.renderModel(0.0625F);
        
        GL11.glPopAttrib();
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        
        renderBook(tileentity, d, d1, d2, f);
    }
    
    public void renderBook(TileEntitySpellBinder tileentity, double d, double d1, double d2, float f)
    {
    	GL11.glPushMatrix();
        GL11.glTranslatef((float)d + 0.5F, (float)d1 + 0.5F, (float)d2 + 0.5F);
        float f1 = (float)tileentity.tickCount + f;
        GL11.glTranslatef(0.0F, 0.1F + MathHelper.sin(f1 * 0.1F) * 0.01F, 0.0F);
        float f2;

        for (f2 = tileentity.bookRotation2 - tileentity.bookRotationPrev; f2 >= (float)Math.PI; f2 -= ((float)Math.PI * 2F))
        {
            ;
        }

        while (f2 < -(float)Math.PI)
        {
            f2 += ((float)Math.PI * 2F);
        }

        float f3 = tileentity.bookRotationPrev + f2 * f;
        GL11.glRotatef(-f3 * 180.0F / (float)Math.PI, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(80.0F, 0.0F, 0.0F, 1.0F);
        this.bindTexture(Textures.MODEL_SPELL_BINDER_BOOK);
        float f4 = tileentity.pageFlipPrev + (tileentity.pageFlip - tileentity.pageFlipPrev) * f + 0.25F;
        float f5 = tileentity.pageFlipPrev + (tileentity.pageFlip - tileentity.pageFlipPrev) * f + 0.75F;
        f4 = (f4 - (float)MathHelper.truncateDoubleToInt((double)f4)) * 1.6F - 0.3F;
        f5 = (f5 - (float)MathHelper.truncateDoubleToInt((double)f5)) * 1.6F - 0.3F;

        if (f4 < 0.0F)
        {
            f4 = 0.0F;
        }

        if (f5 < 0.0F)
        {
            f5 = 0.0F;
        }

        if (f4 > 1.0F)
        {
            f4 = 1.0F;
        }

        if (f5 > 1.0F)
        {
            f5 = 1.0F;
        }

        float f6 = tileentity.bookSpreadPrev + (tileentity.bookSpread - tileentity.bookSpreadPrev) * f;
        GL11.glEnable(GL11.GL_CULL_FACE);
        this.enchantmentBook.render((Entity)null, f1, f4, f5, f6, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }
    
    
    public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f) 
    {
        renderAModelAt((TileEntitySpellBinder)tileentity, d, d1, d2, f);
    }
}

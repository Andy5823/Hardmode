package Hardmode.Core;

import Hardmode.TileEntities.TileEntityEnderForge;
import Hardmode.TileEntities.TileEntitySpellBinder;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy implements IGuiHandler
{
    public void initRenderingAndTextures()
    {
        
    }
    
    public void registerTileEnities()
    {
    	GameRegistry.registerTileEntity(TileEntityEnderForge.class, "EnderForge");
    	GameRegistry.registerTileEntity(TileEntitySpellBinder.class, "SpellBinder");
    }
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
    	
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }
}

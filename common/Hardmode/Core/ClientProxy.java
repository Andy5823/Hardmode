package Hardmode.Core;

import Hardmode.Client.Renders.RenderEnderForge;
import Hardmode.Client.Renders.Blocks.BlockRenderEnderForge;
import Hardmode.Refrences.BlockIds;
import Hardmode.Refrences.Refrence;
import Hardmode.Refrences.RenderIds;
import Hardmode.TileEntities.TileEntityEnderForge;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    public void initRenderingAndTextures()
    {
        System.out.println("["+Refrence.MOD_NAME+"]: Rendering and Textures");
        RenderIds.ENDER_FORGE_RENDER_ID = RenderingRegistry.getNextAvailableRenderId();
        
        MinecraftForgeClient.registerItemRenderer(BlockIds.ENDER_FORGE_ID, new BlockRenderEnderForge());
    }
    
    public void registerTileEnities()
    {
        super.registerTileEnities();
        
        System.out.println("["+Refrence.MOD_NAME+"]: Registering Tile Entities");
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEnderForge.class, new RenderEnderForge());
    }
}

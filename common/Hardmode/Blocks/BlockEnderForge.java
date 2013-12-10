package Hardmode.Blocks;

import Hardmode.Refrences.Names;
import Hardmode.Refrences.RenderIds;
import Hardmode.TileEntities.TileEntityEnderForge;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockEnderForge extends BaseBlockTile
{
	public BlockEnderForge(int id) 
	{
		super(id, Material.iron);
		this.setLightOpacity(0);
        this.setUnlocalizedName(Names.ENDER_FORGE);
	}
	
	public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public int getRenderType()
    {
        return RenderIds.ENDER_FORGE_RENDER_ID;
    }
    
    public TileEntity createNewTileEntity(World world)
    {
        return new TileEntityEnderForge();
    }
	
}

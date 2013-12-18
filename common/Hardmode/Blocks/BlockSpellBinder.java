package Hardmode.Blocks;

import Hardmode.Refrences.Names;
import Hardmode.Refrences.RenderIds;
import Hardmode.TileEntities.TileEntitySpellBinder;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSpellBinder extends BaseBlockTile
{

	public BlockSpellBinder(int id) 
	{
		super(id, Material.rock);
		this.setUnlocalizedName(Names.SPELL_BINDER);
	}
	
	 public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	 {
		 this.setBlockBounds(0.06F, 0.0F, 0.06F, 0.94F, 0.44F, 0.94F);
	 }
	
	public int getRenderType()
    {
        return RenderIds.SPELL_BINDER_RENDER_ID;
    }
	
	public TileEntity createNewTileEntity(World world) 
	{
		return new TileEntitySpellBinder();
	}
}

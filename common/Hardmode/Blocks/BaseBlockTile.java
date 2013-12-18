package Hardmode.Blocks;

import Hardmode.Refrences.Refrence;
import Hardmode.Hardmode;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseBlockTile extends BlockContainer
{
    public BaseBlockTile(int id, Material material)
    {
        super(id, material);
        this.setCreativeTab(Hardmode.tab);
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(Refrence.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
    
	public TileEntity createNewTileEntity(World world) 
	{
		return null;
	}
}

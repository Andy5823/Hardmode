package Hardmode.Blocks;

import Hardmode.Refrences.Names;
import Hardmode.Refrences.Refrence;
import Hardmode.Hardmode;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLiquidCorruptWater extends BlockFluidClassic
{
    @SideOnly(Side.CLIENT)
    public static Icon[] blockIcon;
    
    public BlockLiquidCorruptWater(int id, Fluid fluid)
    {
        super(id, fluid, Material.water);
        this.setUnlocalizedName(Names.CORRUPTED_WATER);
        this.setCreativeTab(Hardmode.tab);
    }
    
    public Icon getIcon(int side, int meta)
    {
        return side != 0 && side != 1 ? this.blockIcon[1] : this.blockIcon[0];
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) 
    {
        blockIcon = new Icon[]{iconRegister.registerIcon(Refrence.MOD_ID + ":" + "CorruptWater" + "_Still"), iconRegister.registerIcon(Refrence.MOD_ID + ":" + "CorruptWater" + "_Flow")};
    }
    
    public boolean canDisplace(IBlockAccess world, int x, int y, int z) 
    {
        if (world.getBlockMaterial(x,  y,  z).isLiquid())
        {
            return false;
        }
        
        return super.canDisplace(world, x, y, z);
    }
    
    public boolean displaceIfPossible(World world, int x, int y, int z) 
    {
        if (world.getBlockMaterial(x,  y,  z).isLiquid())
        {
            return false;
        }
        
        return super.displaceIfPossible(world, x, y, z);
    }
}


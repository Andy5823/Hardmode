package Hardmode.Blocks;

import Hardmode.Refrences.Refrence;
import Hardmode.Hardmode;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BaseBlock extends Block
{
	public BaseBlock(int id, Material material)
    {
        super(id, material);
        this.setCreativeTab(Hardmode.tab);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(Refrence.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}

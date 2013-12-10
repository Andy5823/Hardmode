package Hardmode.Core;

import Hardmode.Blocks.ModBlocks;
import Hardmode.Items.ModItems;
import Hardmode.Refrences.Refrence;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HardmodeCreativeTab extends CreativeTabs
{
    public HardmodeCreativeTab(String par1String)
    {
        super(par1String);
    }
    
    @SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel()
    {
        return Refrence.MOD_NAME;
    }
    
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return ModItems.EnderHammer;
    }
}

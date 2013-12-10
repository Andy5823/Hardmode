package Hardmode.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import Hardmode.Hardmode;
import Hardmode.Refrences.Refrence;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseItem extends Item
{
	public BaseItem(int Id, String name)
    {
        super(Id);
        maxStackSize = 1;
        this.setCreativeTab(Hardmode.tab);
        setNoRepair();
        this.setUnlocalizedName(name);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(Refrence.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}

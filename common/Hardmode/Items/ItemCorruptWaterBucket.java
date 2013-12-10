package Hardmode.Items;

import Hardmode.Hardmode;
import Hardmode.Refrences.Names;
import Hardmode.Refrences.Refrence;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCorruptWaterBucket extends ItemBucket 
{
    private String iconName;

    public ItemCorruptWaterBucket(int i, int blockId) 
    {
        super(i, blockId);
        this.setCreativeTab(Hardmode.tab);
        this.setContainerItem(Item.bucketEmpty);
        this.setUnlocalizedName(Names.CORRUPT_WATER_BUCKET);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(Refrence.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}

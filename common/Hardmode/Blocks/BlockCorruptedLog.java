package Hardmode.Blocks;

import java.util.Random;

import Hardmode.Refrences.Names;
import Hardmode.Refrences.Refrence;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockCorruptedLog extends BaseBlock
{
	public static final String[] treeTextureTypes = new String[] {"CorruptedWood", "CorruptedWood", "CorruptedWood", "CorruptedWood"};
    @SideOnly(Side.CLIENT)
    private Icon[] iconArray;
    @SideOnly(Side.CLIENT)
    private Icon tree_top;

    public BlockCorruptedLog(int par1)
    {
        super(par1, Material.wood);
        this.setUnlocalizedName(Names.CORRUPTED_LOG);
        this.setTickRandomly(true);
    }
    
    /**
     * The type of render function that is called for this block
     */
    /*public int getRenderType()
    {
        return 31;
    }*/

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID;
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        byte b0 = 4;
        int j1 = b0 + 1;

        if (par1World.checkChunksExist(par2 - j1, par3 - j1, par4 - j1, par2 + j1, par3 + j1, par4 + j1))
        {
            for (int k1 = -b0; k1 <= b0; ++k1)
            {
                for (int l1 = -b0; l1 <= b0; ++l1)
                {
                    for (int i2 = -b0; i2 <= b0; ++i2)
                    {
                        int j2 = par1World.getBlockId(par2 + k1, par3 + l1, par4 + i2);

                        if (Block.blocksList[j2] != null)
                        {
                            Block.blocksList[j2].beginLeavesDecay(par1World, par2 + k1, par3 + l1, par4 + i2);
                        }
                    }
                }
            }
        }
    }

    /**
     * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
     */
    public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
    {
        int j1 = par9 & 3;
        byte b0 = 0;

        switch (par5)
        {
            case 0:
            case 1:
                b0 = 0;
                break;
            case 2:
            case 3:
                b0 = 8;
                break;
            case 4:
            case 5:
                b0 = 4;
        }

        return j1 | b0;
    }

    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        int k = par2 & 12;
        int l = par2 & 3;
        return k == 0 && (par1 == 1 || par1 == 0) ? this.tree_top : (k == 4 && (par1 == 5 || par1 == 4) ? this.tree_top : (k == 8 && (par1 == 2 || par1 == 3) ? this.tree_top : this.iconArray[l]));
    }
    
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
    	if(par5Entity instanceof EntityPlayer)
    	{
    		((EntityPlayer) par5Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 50));
    		((EntityPlayer) par5Entity).addPotionEffect(new PotionEffect(Potion.poison.id, 50, 9999999));
    	}
    }
    
    public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
    	if(par5Entity instanceof EntityPlayer)
    	{
    		((EntityPlayer) par5Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 50));
    		((EntityPlayer) par5Entity).addPotionEffect(new PotionEffect(Potion.poison.id, 50, 9999999));
    	}
    }
    
    public int tickRate(World par1World)
    {
        return 10;
    }
    
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
    	//System.out.println("[Hardmode]: ticking");
        if (!par1World.isRemote)
        {
        	for (int l = 0; l < 4; ++l)
        	{
                    int i1 = par2 + par5Random.nextInt(3) - 1;
                    int j1 = par3 + par5Random.nextInt(5) - 3;
                    int k1 = par4 + par5Random.nextInt(3) - 1;
                    int l1 = par1World.getBlockId(i1, j1 + 1, k1);

                    if (par1World.getBlockId(i1, j1, k1) == Block.wood.blockID)
                    {
                    	altBlockChange(par1World, i1, j1, k1);
                    	//par1World.setBlock(i1, j1, k1, HardmodeBase.CorruptedLog.blockID);
                    	
                        //par1World.func_94575_c(i1, j1, k1, HardmodeBase.CorruptedLog.blockID);
                    }
                    else if(par1World.getBlockId(i1, j1, k1) == Block.dirt.blockID || par1World.getBlockId(i1, j1, k1) == Block.grass.blockID || par1World.getBlockId(i1, j1, k1) == Block.sand.blockID || par1World.getBlockId(i1, j1, k1) == Block.gravel.blockID)
                    {
                       BlockCorrupted.altBlockChange(par1World, i1, j1, k1, "Dirt");
                    }
                    else if(par1World.getBlockId(i1, j1, k1) == Block.stone.blockID || par1World.getBlockId(i1, j1, k1) == Block.cobblestone.blockID || par1World.getBlockId(i1, j1, k1) == Block.cobblestoneMossy.blockID || par1World.getBlockId(i1, j1, k1) == Block.sandStone.blockID)
                    {
                    	BlockCorrupted.altBlockChange(par1World, i1, j1, k1, "Stone");
                    }
                    else if(par1World.getBlockId(i1, j1, k1) == Block.planks.blockID)
                    {
                    	BlockCorrupted.altBlockChange(par1World, i1, j1, k1, "Planks");
                    }
              }
          }
      }
    
    static int par3a;
    static int par3b;
    
    public static void altBlockChange(World par1World, int par2, int par3, int par4)
    {
    	par3a = par3;
    	par3b = par3;
    	//par1World.setBlock(par2, par3, par4, HardmodeBase.CorruptedLog.blockID);
    	
    	while(par1World.getBlockId(par2, par3, par4) == Block.wood.blockID)
    	{
    		par1World.setBlock(par2, par3, par4, ModBlocks.CorruptedLog.blockID);
    		par3 = par3 + 1;
    	}
    	while(par1World.getBlockId(par2, par3a, par4) == Block.wood.blockID)
    	{
    		par1World.setBlock(par2, par3, par4, ModBlocks.CorruptedLog.blockID);
    		par3a = par3 - 1;
    	}
    	checkBlockAdjecent(par1World, par2, par3b, par4);
    }
    
    public static void checkBlockAdjecent(World par1World, int par2, int par3, int par4)
    {
    	if(par1World.getBlockId(par2 + 1, par3, par4) == Block.wood.blockID)
    	{
    		altBlockChange(par1World, par2 + 1, par3, par4);
    	}
    	if(par1World.getBlockId(par2 - 1, par3, par4) == Block.wood.blockID)
    	{
    		altBlockChange(par1World, par2 - 1, par3, par4);
    	}
    	if(par1World.getBlockId(par2, par3, par4 + 1) == Block.wood.blockID)
    	{
    		altBlockChange(par1World, par2, par3, par4 + 1);
    	}
    	if(par1World.getBlockId(par2+1, par3, par4 - 1) == Block.wood.blockID)
    	{
    		altBlockChange(par1World, par2, par3, par4 - 1);
    	}
    }

    public void registerIcons(IconRegister par1IconRegister)
    {
        this.tree_top = par1IconRegister.registerIcon(Refrence.MOD_ID + ":" + "CorruptedWoodTop");
        this.iconArray = new Icon[treeTextureTypes.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon("Hardmode:"+treeTextureTypes[i]);
        }
    }

    @Override
    public boolean isWood(World world, int x, int y, int z)
    {
        return false;
    }
}


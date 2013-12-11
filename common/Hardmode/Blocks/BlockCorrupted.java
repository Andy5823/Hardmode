
package Hardmode.Blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockCorrupted extends BaseBlock
{
    public BlockCorrupted(int id, String name, Material material)
    {
        super(id, material);
        this.setUnlocalizedName(name);
        this.setTickRandomly(true);
    }
    
    public int tickRate(World par1World)
    {
        return 10;
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
    
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
        	for (int l = 0; l < 4; ++l)
        	{
                    int i1 = par2 + par5Random.nextInt(3) - 1;
                    int j1 = par3 + par5Random.nextInt(5) - 3;
                    int k1 = par4 + par5Random.nextInt(3) - 1;
                    int l1 = par1World.getBlockId(i1, j1 + 1, k1);

                    if(par1World.getBlockId(i1, j1, k1) == Block.dirt.blockID || par1World.getBlockId(i1, j1, k1) == Block.grass.blockID || par1World.getBlockId(i1, j1, k1) == Block.sand.blockID || par1World.getBlockId(i1, j1, k1) == Block.gravel.blockID)
                    {
                        par1World.setBlock(i1, j1, k1, ModBlocks.CorruptedDirt.blockID);
                    }
                    else if(par1World.getBlockId(i1, j1, k1) == Block.stone.blockID || par1World.getBlockId(i1, j1, k1) == Block.cobblestone.blockID || par1World.getBlockId(i1, j1, k1) == Block.cobblestoneMossy.blockID || par1World.getBlockId(i1, j1, k1) == Block.sandStone.blockID)
                    {
                        par1World.setBlock(i1, j1, k1, ModBlocks.CorruptedStone.blockID);
                    }
                    else if(par1World.getBlockId(i1, j1, k1) == Block.planks.blockID)
                    {
                    	par1World.setBlock(i1, j1, k1, ModBlocks.CorruptedPlanks.blockID);
                    }
                    else if(par1World.getBlockId(i1, j1, k1) == Block.wood.blockID)
                    {
                    	BlockCorruptedLog.altBlockChange(par1World, i1, j1, k1);
                    }
                    else if(par1World.getBlockId(i1, j1, k1) == Block.waterStill.blockID || par1World.getBlockId(i1, j1, k1) == Block.waterMoving.blockID)
                    {
                    	par1World.setBlock(i1, j1, k1, ModBlocks.CorruptedWater.blockID);
                    }
              }
          }
      }
    
    public static void altBlockChange(World par1World, int par2, int par3, int par4, String BlockName)
    {
    	//System.out.println("[Hardmode]: altBlockChange");
    	if(BlockName == "Stone")
    	{
    		par1World.setBlock(par2, par3, par4, ModBlocks.CorruptedStone.blockID);
    	}
    	else if(BlockName == "Planks")
    	{
    		par1World.setBlock(par2, par3, par4, ModBlocks.CorruptedPlanks.blockID);
    	}
    	else if(BlockName == "Dirt")
    	{
    		par1World.setBlock(par2, par3, par4, ModBlocks.CorruptedDirt.blockID);
    	}
    }
}
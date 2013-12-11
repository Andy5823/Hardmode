package Hardmode.Blocks;

import java.util.Random;

import Hardmode.Items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockNewOre extends BaseBlock
{
	String BlockIcon;
	public BlockNewOre(int id, String name) 
	{
		super(id, Material.rock);
		this.setHardness(3F);
		this.setResistance(5F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName(name);
		BlockIcon = name;
	}
	
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

        if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
        {
            int j1 = 0;
            j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);

            this.dropXpOnBlockBreak(par1World, par2, par3, par4, j1);
        }
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
    	if(BlockIcon == "MoonStoneOre")
    	{
    		return ModItems.MoonStoneShard.itemID;
    	}
    	else if(BlockIcon == "UtaranOre")
    	{
    		return ModItems.UtaranShard.itemID;
    	}
    	else if(BlockIcon == "TunarusOre")
    	{
    		return ModItems.TunarusShard.itemID;
    	}
    	else if(BlockIcon == "ShadowStone")
    	{
    		return ModBlocks.ShadowStone.blockID;
    	}
    	else
    	{
    		System.out.println("[Hardmode]: Block Name Given:"+BlockIcon);
    		System.out.println("[Hardmode]: Failed to get Block Name, Dropping Ender Shard");
    		return ModItems.EnderShard.itemID;
    	}
    }
}

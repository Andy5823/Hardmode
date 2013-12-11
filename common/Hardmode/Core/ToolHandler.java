package Hardmode.Core;

import Hardmode.Blocks.ModBlocks;
import net.minecraftforge.common.MinecraftForge;

public class ToolHandler 
{
	public static void SetToolLevels()
	{
		MinecraftForge.setBlockHarvestLevel(ModBlocks.MoonStoneOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.UtaranOre, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.TunarusOre, "pickaxe", 5);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.CorruptedStone, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(ModBlocks.ShadowStone, "pickaxe", 0);
	}
}

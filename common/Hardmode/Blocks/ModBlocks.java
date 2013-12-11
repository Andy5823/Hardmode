package Hardmode.Blocks;

import Hardmode.Refrences.BlockIds;
import Hardmode.Refrences.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks 
{
	public static Block EnderForge;
	public static Block MoonStoneOre;
	public static Block TunarusOre;
	public static Block UtaranOre;
	public static Block CorruptedStone;
	public static Block CorruptedDirt;
	public static Block CorruptedPlanks;
	public static Block CorruptedLog;
	public static Block ShadowStone;
	public static Block CorruptedWater;
	
	public static void InitializeBlocks()
    {
		EnderForge = (new BlockEnderForge(BlockIds.ENDER_FORGE_ID));
		MoonStoneOre = (new BlockNewOre(BlockIds.MOON_STONE_ORE_ID, Names.MOON_STONE_ORE));
		TunarusOre = (new BlockNewOre(BlockIds.TUNARUS_ORE_ID, Names.TUNARUS_ORE));
		UtaranOre = (new BlockNewOre(BlockIds.UTARAN_ORE_ID, Names.UTARAN_ORE));
		CorruptedStone = (new BlockCorrupted(BlockIds.CORRUPTED_STONE_ID, Names.CORRUPTED_STONE, Material.rock));
		CorruptedDirt = (new BlockCorrupted(BlockIds.CORRUPTED_DIRT_ID, Names.CORRUPTED_DIRT, Material.grass));
		CorruptedPlanks = (new BlockCorrupted(BlockIds.CORRUPTED_PLANKS_ID, Names.CORRUPTED_PLANKS, Material.wood));
		CorruptedLog = (new BlockCorruptedLog(BlockIds.CORRUPTED_LOG_ID));
		ShadowStone = (new BlockNewOre(BlockIds.SHADOW_STONE_ID, Names.SHADOW_STONE));
        
        RegisterBlocks();
    }
    
    public static void RegisterBlocks()
    {
        GameRegistry.registerBlock(EnderForge);
        GameRegistry.registerBlock(MoonStoneOre);
        GameRegistry.registerBlock(TunarusOre);
        GameRegistry.registerBlock(UtaranOre);
        GameRegistry.registerBlock(CorruptedStone);
    	GameRegistry.registerBlock(CorruptedDirt);
    	GameRegistry.registerBlock(CorruptedPlanks);
    	GameRegistry.registerBlock(CorruptedLog);
    	GameRegistry.registerBlock(ShadowStone);
    	
        InitializeNames();
    }
    
    public static void InitializeNames()
    {
    	LanguageRegistry.addName(EnderForge, "Ender Forge");
    	LanguageRegistry.addName(MoonStoneOre, "MoonStone Ore");
    	LanguageRegistry.addName(TunarusOre, "Tunarus Ore");
    	LanguageRegistry.addName(UtaranOre, "Utaran Ore");
    	LanguageRegistry.addName(CorruptedStone, "Corrupt Stone");
    	LanguageRegistry.addName(CorruptedDirt, "Corrupt Dirt");
    	LanguageRegistry.addName(CorruptedPlanks, "Corrupt Planks");
    	LanguageRegistry.addName(CorruptedLog, "Corrupt Log");
    	LanguageRegistry.addName(ShadowStone, "Shadow Stone");
    }
}

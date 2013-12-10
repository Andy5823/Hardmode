package Hardmode.Blocks;

import Hardmode.Refrences.BlockIds;
import Hardmode.Refrences.Names;
import net.minecraft.block.Block;
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
        
        RegisterBlocks();
    }
    
    public static void RegisterBlocks()
    {
        GameRegistry.registerBlock(EnderForge);
        GameRegistry.registerBlock(MoonStoneOre);
        GameRegistry.registerBlock(TunarusOre);
        GameRegistry.registerBlock(UtaranOre);
    	
        InitializeNames();
    }
    
    public static void InitializeNames()
    {
    	LanguageRegistry.addName(EnderForge, "Ender Forge");
    	LanguageRegistry.addName(MoonStoneOre, "MoonStone Ore");
    	LanguageRegistry.addName(TunarusOre, "Tunarus Ore");
    	LanguageRegistry.addName(UtaranOre, "Utaran Ore");
    }
}

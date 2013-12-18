package Hardmode.Core;

import Hardmode.Refrences.BlockIds;
import Hardmode.Refrences.ItemIds;
import net.minecraftforge.common.Configuration;

public class ConfigurationFile 
{
	public static void HandleConfig(Configuration config)
    {
        config.load();
        
        BlockIds.ENDER_FORGE_ID = config.getBlock("Ender Forge Block ID", 800).getInt();
    	BlockIds.MOON_STONE_ORE_ID = config.getBlock("MoonStone Ore Block ID", 801).getInt();
    	BlockIds.TUNARUS_ORE_ID = config.getBlock("Tunarus Ore Block ID", 802).getInt();
    	BlockIds.UTARAN_ORE_ID = config.getBlock("Utaran Ore Block ID", 803).getInt();
    	BlockIds.CORRUPTED_STONE_ID = config.getBlock("Corrupted Stone Block ID", 804).getInt();
    	BlockIds.CORRUPTED_DIRT_ID = config.getBlock("Corrupted Dirt Block ID", 805).getInt();
    	BlockIds.CORRUPTED_PLANKS_ID = config.getBlock("Corrupted Planks Block ID", 806).getInt();
    	BlockIds.CORRUPTED_LOG_ID = config.getBlock("Corrupted Logs ID", 807).getInt();
    	BlockIds.SHADOW_STONE_ID = config.getBlock("Shadow Stone Block ID", 808).getInt();
    	BlockIds.CORRUPTED_WATER_ID = config.getBlock("Corrupted Water Block ID", 809).getInt();
    	BlockIds.SPELL_BINDER_ID = config.getBlock("Spell Binder ID", 810).getInt();
    	BlockIds.MOON_STONE_BLOCK_ID = config.getBlock("MoonStone Block ID", 811).getInt();
    	BlockIds.TUNARUS_BLOCK_ID = config.getBlock("Tunarus Block ID", 812).getInt();
    	BlockIds.UTARAN_BLOCK_ID = config.getBlock("Utaran Block ID", 813).getInt();
    	
    	ItemIds.ENDER_HAMMER = config.getItem("Ender Hammer Item ID", 8000).getInt();
    	ItemIds.ANCIENT_SHARD = config.getItem("Ancient Shard Item ID", 8001).getInt();
    	ItemIds.ENDER_SHARD = config.getItem("Ender Shard Item ID", 8002).getInt();
    	ItemIds.LAVA_SHARD = config.getItem("Lava Shard Item ID", 8003).getInt();
    	ItemIds.MOON_STONE_SHARD = config.getItem("MoonStone Shard Item ID", 8004).getInt();
    	ItemIds.TUNARUS_SHARD = config.getItem("Tunarus Shard Item ID", 8005).getInt();
    	ItemIds.UTARAN_SHARD = config.getItem("Utaran Shard Item ID", 8006).getInt();
    	ItemIds.WRETCHED_SHARD = config.getItem("Wreteched Shard Item ID", 8007).getInt();
    	ItemIds.ANCIENT_CLUSTER = config.getItem("Ancient Cluster Item ID", 8008).getInt();
    	ItemIds.ENDER_CLUSTER = config.getItem("Ender CLuster Item ID", 8009).getInt();
    	ItemIds.LAVA_CLUSTER = config.getItem("Lava Cluster Item ID", 8010).getInt();
    	ItemIds.MOON_STONE_CLUSTER = config.getItem("MoonStone Cluster Item ID", 8011).getInt();
    	ItemIds.TUNARUS_CLUSTER = config.getItem("Tunarus Cluster Item ID", 8012).getInt();
    	ItemIds.UTARAN_CLUSTER = config.getItem("Utaran Cluster Item ID", 8013).getInt();
    	ItemIds.WRETCHED_CLUSTER = config.getItem("Wreteched Cluster Item ID", 8014).getInt();
    	ItemIds.ANCIENT_INGOT = config.getItem("Ancient Ingot Item ID", 8015).getInt();
    	ItemIds.ENDER_INGOT = config.getItem("Ender Ingot Item ID", 8016).getInt();
    	ItemIds.LAVA_INGOT = config.getItem("Lava Ingot Item ID", 8017).getInt();
    	ItemIds.MOON_STONE_INGOT = config.getItem("MoonStone Ingot Item ID", 8018).getInt();
    	ItemIds.TUNARUS_INGOT = config.getItem("Tunarus Ingot Item ID", 8019).getInt();
    	ItemIds.UTARAN_INGOT = config.getItem("Utaran Ingot Item ID", 8020).getInt();
    	ItemIds.WRETCHED_INGOT = config.getItem("Wretched Ingot Item ID", 8021).getInt();
    	ItemIds.INSTABLE_MATTER = config.getItem("Instable Matter Item ID", 8022).getInt();
    	ItemIds.TUANRUS_PISTOL = config.getItem("Tunarus Pistol Item ID", 8023).getInt();
    	ItemIds.ENDER_SWORD = config.getItem("Ener Sword Item ID", 8024).getInt();
        
        config.save();
    }
}

package Hardmode.Items;

import Hardmode.Refrences.ItemIds;
import Hardmode.Refrences.Names;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItems 
{
	public static Item EnderHammer;
	public static Item AncientShard;
	public static Item EnderShard;
	public static Item LavaShard;
	public static Item MoonStoneShard;
	public static Item TunarusShard;
	public static Item UtaranShard;
	public static Item WretechedShard;
	public static Item AncientCluster;
	public static Item EnderCluster;
	public static Item LavaCluster;
	public static Item MoonStoneCluster;
	public static Item TunarusCluster;
	public static Item UtaranCluster;
	public static Item WretechedCluster;
	public static Item AncientIngot;
	public static Item EnderIngot;
	public static Item LavaIngot;
	public static Item MoonStoneIngot;
	public static Item TunarusIngot;
	public static Item UtaranIngot;
	public static Item WretechedIngot;
	public static Item InstableMatter;
	public static Item TunarusPistol;
	public static Item EnderSword;
	public static Item CorruptWaterBucket;
	
    public static void InitializeItems()
    {
        EnderHammer = (new BaseItem(ItemIds.ENDER_HAMMER, Names.ENDER_HAMMER) /*TODO MAKE PROPER ITEM*/);
        AncientShard = (new BaseItem(ItemIds.ANCIENT_SHARD, Names.ANCIENT_SHARD)).setMaxStackSize(64);
    	EnderShard = (new BaseItem(ItemIds.ENDER_SHARD, Names.ENDER_SHARD)).setMaxStackSize(64);
    	LavaShard = (new BaseItem(ItemIds.LAVA_SHARD, Names.LAVA_SHARD)).setMaxStackSize(64);
    	MoonStoneShard = (new BaseItem(ItemIds.MOON_STONE_SHARD, Names.MOON_STONE_SHARD)).setMaxStackSize(64);
    	TunarusShard = (new BaseItem(ItemIds.TUNARUS_SHARD, Names.TUNARUS_SHARD)).setMaxStackSize(64);
    	UtaranShard = (new BaseItem(ItemIds.UTARAN_SHARD, Names.UTARAN_SHARD)).setMaxStackSize(64);
    	WretechedShard = (new BaseItem(ItemIds.WRETCHED_SHARD, Names.WRETCHED_SHARD)).setMaxStackSize(64);
    	AncientCluster = (new BaseItem(ItemIds.ANCIENT_CLUSTER, Names.ANCIENT_CLUSTER)).setMaxStackSize(64);
    	EnderCluster = (new BaseItem(ItemIds.ENDER_CLUSTER, Names.ENDER_CLUSTER)).setMaxStackSize(64);
    	LavaCluster = (new BaseItem(ItemIds.LAVA_CLUSTER, Names.LAVA_CLUSTER)).setMaxStackSize(64);
    	MoonStoneCluster = (new BaseItem(ItemIds.MOON_STONE_CLUSTER, Names.MOON_STONE_CLUSTER)).setMaxStackSize(64);
    	TunarusCluster = (new BaseItem(ItemIds.TUNARUS_CLUSTER, Names.TUNARUS_SHARD)).setMaxStackSize(64);
    	UtaranCluster = (new BaseItem(ItemIds.UTARAN_CLUSTER, Names.UTARAN_CLUSTER)).setMaxStackSize(64);
    	WretechedCluster = (new BaseItem(ItemIds.WRETCHED_CLUSTER, Names.WRETCHED_CLUSTER)).setMaxStackSize(64);
    	AncientIngot = (new BaseItem(ItemIds.ANCIENT_CLUSTER, Names.ANCIENT_CLUSTER)).setMaxStackSize(64);
    	EnderIngot = (new BaseItem(ItemIds.ENDER_INGOT, Names.ENDER_INGOT)).setMaxStackSize(64);
    	LavaIngot = (new BaseItem(ItemIds.LAVA_INGOT, Names.LAVA_INGOT)).setMaxStackSize(64);
    	MoonStoneIngot = (new BaseItem(ItemIds.MOON_STONE_INGOT, Names.MOON_STONE_INGOT)).setMaxStackSize(64);
    	TunarusIngot = (new BaseItem(ItemIds.TUNARUS_INGOT, Names.TUNARUS_INGOT)).setMaxStackSize(64);
    	UtaranIngot = (new BaseItem(ItemIds.UTARAN_INGOT, Names.UTARAN_INGOT)).setMaxStackSize(64);
    	WretechedIngot = (new BaseItem(ItemIds.WRETCHED_INGOT, Names.WRETCHED_INGOT)).setMaxStackSize(64);
    	InstableMatter = (new BaseItem(ItemIds.INSTABLE_MATTER, Names.INSTABLE_MATTER));
    	TunarusPistol = (new BaseItem(ItemIds.TUANRUS_PISTOL, Names.TUANRUS_PISTOL));
    	EnderSword = (new BaseItem(ItemIds.ENDER_SWORD, Names.ENDER_SWORD) /*TODO MAKE PROPER ITEM*/);
        
        InitializeNames();
    }
    
    public static void InitializeNames()
    {
    	LanguageRegistry.addName(EnderHammer, "Ender Hammer");
    	LanguageRegistry.addName(AncientShard, "Ancient Shard");
    	LanguageRegistry.addName(EnderShard, "Ender Shard");
    	LanguageRegistry.addName(LavaShard, "Lava Shard");
    	LanguageRegistry.addName(MoonStoneShard, "Moon Stone Shard");
    	LanguageRegistry.addName(TunarusShard, "Tunarus Shard");
    	LanguageRegistry.addName(UtaranShard, "Utaran Shard");
    	LanguageRegistry.addName(WretechedShard, "Wretched Shard");
    	LanguageRegistry.addName(AncientCluster, "Ancient Cluster");
    	LanguageRegistry.addName(EnderCluster, "Ender Cluster");
    	LanguageRegistry.addName(LavaCluster, "Lava Cluster");
    	LanguageRegistry.addName(MoonStoneCluster, "Moon Stone Cluster");
    	LanguageRegistry.addName(TunarusCluster, "Tunarus Cluster");
    	LanguageRegistry.addName(UtaranCluster, "Utaran Cluster");
    	LanguageRegistry.addName(WretechedCluster, "Wreteched Cluster");
    	LanguageRegistry.addName(AncientIngot, "Ancient Ingot");
    	LanguageRegistry.addName(EnderIngot, "Ender Ingot");
    	LanguageRegistry.addName(LavaIngot, "Lava Ingot");
    	LanguageRegistry.addName(MoonStoneIngot, "Moon Stone Ingot");
    	LanguageRegistry.addName(TunarusIngot, "Tunarus Ingot");
    	LanguageRegistry.addName(UtaranIngot, "Utaran Ingot");
    	LanguageRegistry.addName(WretechedIngot, "Wreteched Ingot");
    	LanguageRegistry.addName(InstableMatter, "Instable Matter");
    	LanguageRegistry.addName(TunarusPistol, "Tunarus Pistol");
    	LanguageRegistry.addName(EnderSword, "Ender Sword");
    }
    
    public static void InitializeHooks()
    {
    	//Forge Hooks
    }
}

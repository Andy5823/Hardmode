package Hardmode;

import Hardmode.Blocks.LiquidHandler;
import Hardmode.Blocks.ModBlocks;
import Hardmode.Core.BucketHandler;
import Hardmode.Core.CommonProxy;
import Hardmode.Core.ConfigurationFile;
import Hardmode.Core.HardmodeCreativeTab;
import Hardmode.Items.ModItems;
import Hardmode.Recipes.BlockItemRecipes;
import Hardmode.Refrences.Refrence;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;

@NetworkMod(clientSideRequired=true, serverSideRequired=false)
@Mod(modid = Refrence.MOD_ID, name = Refrence.MOD_NAME, version = Refrence.VERSION)
public class Hardmode
{
    @Instance(Refrence.MOD_ID)
    public static Hardmode instance;
    
    @SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    public static HardmodeCreativeTab tab = new HardmodeCreativeTab(Refrence.MOD_NAME);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("["+ Refrence.MOD_NAME + "]: Pre-Initialization");
        
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        
        ConfigurationFile.HandleConfig(config);
        
        ModBlocks.InitializeBlocks();
        
        ModItems.InitializeItems();
        
        ModItems.InitializeHooks();
        
        LiquidHandler.registerLiquid();
        
        BucketHandler.INSTANCE.buckets.put(ModBlocks.CorruptedWater, ModItems.CorruptWaterBucket);
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        System.out.println("["+ Refrence.MOD_NAME + "]: Load");
        
        NetworkRegistry.instance().registerGuiHandler(instance, proxy);
        
        proxy.initRenderingAndTextures();
        
        proxy.registerTileEnities();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("["+ Refrence.MOD_NAME + "]: Post-Initialization");
        
        LiquidHandler.CorruptWater.setIcons(ModBlocks.CorruptedWater.getIcon(0, 1), ModBlocks.CorruptedWater.getIcon(1, 1));
        
        BlockItemRecipes.HandleRecipes();
    }
}

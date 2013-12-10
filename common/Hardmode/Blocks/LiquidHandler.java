package Hardmode.Blocks;

import Hardmode.Items.ItemCorruptWaterBucket;
import Hardmode.Items.ModItems;
import Hardmode.Refrences.BlockIds;
import Hardmode.Refrences.ItemIds;
import Hardmode.Refrences.Names;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LiquidHandler
{
    public static Fluid CorruptWater;
    
    public static void registerLiquid()
    {
        CorruptWater = new Fluid(Names.CORRUPTED_WATER);
        FluidRegistry.registerFluid(CorruptWater);
        ModBlocks.CorruptedWater = new BlockLiquidCorruptWater(BlockIds.CORRUPTED_WATER_ID, LiquidHandler.CorruptWater);
        GameRegistry.registerBlock(ModBlocks.CorruptedWater);
        LanguageRegistry.addName(ModBlocks.CorruptedWater, "Corrupt Water");
        CorruptWater.setBlockID(ModBlocks.CorruptedWater);
        ModItems.CorruptWaterBucket = new ItemCorruptWaterBucket(ItemIds.CORRUPT_WATER_BUCKET_ID, ModBlocks.CorruptedWater.blockID);
        LanguageRegistry.addName(ModItems.CorruptWaterBucket, "Corrupt Water Bucket");
        FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack(CorruptWater.getName(), FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(ModItems.CorruptWaterBucket, 1), new ItemStack(Item.bucketEmpty));
    }
}
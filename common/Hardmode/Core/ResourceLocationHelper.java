package Hardmode.Core;

import Hardmode.Refrences.Refrence;
import net.minecraft.util.ResourceLocation;

public class ResourceLocationHelper 
{
    public static ResourceLocation getResourceLocation(String path)
    {
        return new ResourceLocation(Refrence.MOD_ID.toLowerCase(), path);
    }
}
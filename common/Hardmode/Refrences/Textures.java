package Hardmode.Refrences;

import Hardmode.Core.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public class Textures
{
	//Base File Locations
    public static String MODEL_TEXTURE_LOCATION = "textures/models/";
    public static String GUI_TEXTURE_LOCATION = "textures/gui/";
    
    //Model Textures
    public static ResourceLocation MODEL_ENDER_FORGE = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "EnderForge.png");
    public static ResourceLocation MODEL_TUNARUS_PISTOL = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "TunarusPistol.png");
    public static ResourceLocation MODEL_SPELL_BINDER = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "SpellBinder.png");
    public static ResourceLocation MODEL_SPELL_BINDER_BOOK = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "SpellBinder_book.png");
}

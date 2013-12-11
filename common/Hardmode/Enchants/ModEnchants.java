package Hardmode.Enchants;

import net.minecraft.enchantment.Enchantment;

public class ModEnchants 
{
	public static Enchantment EnchancedSharpness;
	public static Enchantment BurntEnchant;
	public static Enchantment DarkEnchant;
	public static Enchantment WretchedEnchant;
	public static Enchantment AncientEnchant;
	
	public static Enchantment CooldownReduction;
	
	public static void RegisterEnchants()
	{
		EnchancedSharpness = new EnchantmentHardDamage(150, 5, 0);
		BurntEnchant = new EnchantmentHardDamage(151, 5, 1);
		DarkEnchant = new EnchantmentHardDamage(152, 5, 2);
		WretchedEnchant = new EnchantmentHardDamage(153, 5, 3);
		AncientEnchant = new EnchantmentHardDamage(154, 5, 4);
		
		CooldownReduction = new EnchantmentCooldown(155, 0, 0);
	}
}

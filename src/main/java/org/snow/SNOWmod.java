package org.snow;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SNOWmod implements ModInitializer {
	public static Enchantment FROST = new FrostEnchantment();

	@Override
	public void onInitialize() {
		Registry.register(Registries.ENCHANTMENT, new Identifier("tutorial", "frost"), FROST);
	}
}
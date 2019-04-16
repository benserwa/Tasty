package com.retrochipradio.tasty.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(Items.EGG, new ItemStack(ModItems.HARD_BOILED_EGG, 1), 1.0f);
	}
	
}

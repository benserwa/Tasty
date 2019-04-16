package com.retrochipradio.tasty.init;


import com.retrochipradio.tasty.items.food.FoodBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item FRIED_EGG = new FoodBase("fried_egg", 6, 1.2f, false);
	public static final Item HARD_BOILED_EGG = new FoodBase("hard_boiled_egg", 6, 1.2f, false);
}

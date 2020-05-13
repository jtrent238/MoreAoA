package com.jtrent238.moreaoa.util;

import java.util.ArrayList;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemRegister {

	private static ArrayList<ItemRegistryWrapper> itemRegistryList = new ArrayList<ItemRegistryWrapper>(750);

	
	protected static void registerItem(IForgeRegistry<Item> registry, Item item, String modelSubfolder, String... oreDictEntries) {
		registry.register(item);

		itemRegistryList.add(new ItemRegistryWrapper(item, modelSubfolder, oreDictEntries));
	}
	
	protected static class ItemRegistryWrapper {
		private final String[] oreDictEntries;
		private final String modelSubfolder;
		private final Item item;

		protected ItemRegistryWrapper(Item item, String modelSubfolder, String... oreDictEntries) {
			this.item = item;
			this.modelSubfolder = modelSubfolder;
			this.oreDictEntries = oreDictEntries == null || oreDictEntries.length == 0 ? null : oreDictEntries;
		}
	}
}

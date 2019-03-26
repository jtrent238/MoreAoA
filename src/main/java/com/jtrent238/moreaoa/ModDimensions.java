package com.jtrent238.moreaoa;

import com.jtrent238.moreaoa.dimension.slimetopia.WorldPoviderSlimetopia;
import com.jtrent238.moreaoa.dimension.slimetopia.WorldTypeSlimetopia;
import com.jtrent238.moreaoa.dimension.slimetopia.biomes.BiomeSlimetopia;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.tslat.aoa3.advent.AdventOfAscension;

public class ModDimensions {
	  
	public static DimensionType dimensionSlimetopia = registerDimensionType("slimetopia", "_slimetopia", Config.slimetopiaDimID, WorldPoviderSlimetopia.class, false);

	public static WorldTypeSlimetopia worldTypeSlimetopia = new WorldTypeSlimetopia();

	public static BiomeSlimetopia biomeSlimetopia = new BiomeSlimetopia();

	@SubscribeEvent
	  public static void registerBiomes(RegistryEvent.Register<Biome> ev) { ev.getRegistry().registerAll(new Biome[] { biomeSlimetopia}); }
	  
	public static void preInit()
	  {
		registerDimension(dimensionSlimetopia.getId(), dimensionSlimetopia);
	  }

	public static void init() {
		biomeSlimetopia.biomeInit();
	  }
	
	private static DimensionType registerDimensionType(String name, String suffix, int id, Class<? extends WorldProvider> clazz, boolean keepLoaded) {
	    if (DimensionManager.isDimensionRegistered(id)) {
	      AdventOfAscension.getLogger().fatal("Dimension \"" + name + "\" with an id of: " + id + " has failed to load due to ID conflict.");
	      
	      return null;
	    }
	    
	    return DimensionType.register(name, suffix, id, clazz, keepLoaded);
	  }
	  
	  private static void registerDimension(int id, DimensionType dimType)
	  {
	    if (dimType != null) {
	      DimensionManager.registerDimension(id, dimType);
	    }
	  }

}

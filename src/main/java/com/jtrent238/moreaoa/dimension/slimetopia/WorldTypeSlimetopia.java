package com.jtrent238.moreaoa.dimension.slimetopia;

import com.jtrent238.moreaoa.ModDimensions;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;

public class WorldTypeSlimetopia extends WorldType
{
	  public WorldTypeSlimetopia()
	  {
	    super("slimetopia");
	  }
	  
	  public BiomeProvider getBiomeProvider(World world)
	  {
	    return new net.minecraft.world.biome.BiomeProviderSingle(ModDimensions.biomeSlimetopia);
	  }
	  
	  public net.minecraft.world.gen.IChunkGenerator getChunkGenerator(World world, String generatorOptions)
	  {
	    return new ChunkGenSlimetopia(world);
	  }
	  
	  public boolean isCustomizable()
	  {
	    return false;
	  }
	  
	  public boolean func_77126_d()
	  {
	    return false;
	  }
	}

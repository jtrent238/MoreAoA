package com.jtrent238.moreaoa.dimension.slimetopia.biomes;

import java.awt.Color;
import java.util.Random;

import com.jtrent238.moreaoa.ModBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.BiomeDictionary;

public class BiomeSlimetopia extends Biome
{
	  private static final Biome.BiomeProperties properties = new Biome.BiomeProperties("Slimetopia");
	  
	  
	  public BiomeSlimetopia() {
	    super(properties);
	    setRegistryName("moreaoa", "slimetopia");
	  }
	  
	  public void biomeInit() {
	    net.minecraftforge.common.BiomeDictionary.addTypes(this, new BiomeDictionary.Type[] { BiomeDictionary.Type.COLD, BiomeDictionary.Type.FOREST });
	  }
	  


	  @net.minecraftforge.fml.relauncher.SideOnly(net.minecraftforge.fml.relauncher.Side.CLIENT)
	  public int func_76731_a(float currentTemperature) { return Color.YELLOW.getRGB(); }
	  
	    
	  
	}
package com.jtrent238.moreaoa.dimension.slimetopia;

import com.jtrent238.moreaoa.ModDimensions;
import com.jtrent238.moreaoa.dimension.slimetopia.biomes.BiomeSlimetopia;
import com.jtrent238.moreaoa.util.RegistryHandler;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;
import net.tslat.aoa3.common.registration.BiomeRegister;

public class WorldTypeSlimetopia extends WorldType {
	public WorldTypeSlimetopia() {
		super("slimetopia");
	}

	@Override
	public BiomeProvider getBiomeProvider(World world) {
		return new BiomeProviderSingle(ModDimensions.biomeSlimetopia);
	}

	@Override
	public IChunkGenerator getChunkGenerator(World world, String generatorOptions) {
		return new ChunkGenSlimetopia(world);
	}

	@Override
	public boolean isCustomizable() {
		return false;
	}

	@Override
	public boolean canBeCreated() {
		return false;
	}
}
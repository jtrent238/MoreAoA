package com.jtrent238.moreaoa.dimension.slimetopia;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

import com.jtrent238.moreaoa.ModBlocks;
import com.jtrent238.moreaoa.ModDimensions;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockPos.MutableBlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.terraingen.InitNoiseGensEvent;
import net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextOverworld;
import net.minecraftforge.event.terraingen.TerrainGen;

public class ChunkGenSlimetopia implements IChunkGenerator
{
	  //private final World world;
	  //private final Random rand;
	  private ChunkPrimer primer;
	  private int curChunkX;
	  private int curChunkZ;
	  private final Biome biome = ModDimensions.biomeSlimetopia;

	  protected ChunkGenSlimetopia(World world) {

		  }
	  
	@Override
	public Chunk generateChunk(int x, int z) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void populate(int x, int z) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean generateStructures(Chunk chunkIn, int x, int z) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position,
			boolean findUnexplored) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void recreateStructures(Chunk chunkIn, int x, int z) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos) {
		// TODO Auto-generated method stub
		return false;
	}

	}
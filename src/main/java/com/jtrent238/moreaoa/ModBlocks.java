package com.jtrent238.moreaoa;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.tslat.aoa3.block.BasicBlock;
import net.tslat.aoa3.block.decoration.BasicDecorationBlock;
import net.tslat.aoa3.block.decoration.fences.FenceBlock;
import net.tslat.aoa3.block.decoration.gates.GateBlock;
import net.tslat.aoa3.block.decoration.glass.GlassBlock;
import net.tslat.aoa3.block.decoration.slabs.SlabBlock;
import net.tslat.aoa3.block.decoration.stairs.StairsBlock;
import net.tslat.aoa3.block.functional.crops.CropBlock;
import net.tslat.aoa3.block.generation.dirt.DirtBlock;
import net.tslat.aoa3.block.generation.grass.GrassBlock;
import net.tslat.aoa3.block.generation.leaves.LeavesBlock;
import net.tslat.aoa3.block.generation.ores.OreBlock;
import net.tslat.aoa3.block.generation.sand.SandBlock;
import net.tslat.aoa3.block.generation.stone.StoneBlock;
import net.tslat.aoa3.block.generation.wood.LogBlock;

@ObjectHolder(Main.MODID)
public class ModBlocks {


	//dirt blocks
	public static final DirtBlock dirtSlime = new DirtBlock("SlimeDirt", "slime_dirt");

	//grass blocks
	public static final GrassBlock grassSlime = new GrassBlock("SlimeGrass", "slime_grass", dirtSlime);

	//stone blocks
	public static final BasicBlock stoneSlime = new StoneBlock("SlimeStone", "slime_stone");

	//ores
	public static final OreBlock oreSlime = new OreBlock("SlimeOre", "slime_ore", 2);

	//bricks
	public static final BasicBlock bricksSlime = new BasicDecorationBlock("SlimeBricks", "slime_bricks", Material.GROUND, 10.0F, 15.0F);

	//leaves
	public static final LeavesBlock leavesSlime = new LeavesBlock("SlimeLeaves", "slime_leaves");

	//logs
	public static final LogBlock logSlime = new LogBlock("SlimeLog", "slime_log");

	//planks
	public static final BasicBlock planksSlime = new BasicDecorationBlock("SlimePlanks", "slime_planks", Material.WOOD);

	//slabs
	//public static final SlabBlock.DoubleSlabBlock slabSlimeBricks = new SlabBlock.DoubleSlabBlock("SlimeBricksSlab", "slime_bricks_slab", Material.GROUND);
	//public static final SlabBlock.DoubleSlabBlock slabSlimePlanks = new SlabBlock.DoubleSlabBlock("SlimePlanksSlab", "slime_planks_slab", Material.WOOD);

	//stairs
	//public static final StairsBlock stairsSlimeBricks = new StairsBlock("SlimeBrocksStairs", "slime_bricks_stairs", bricksSlime);
	//public static final StairsBlock stairsSlimePlanks = new StairsBlock("SlimePlanksStairs", "slime_planks_stairs", planksSlime);

	//fences
	//public static final FenceBlock fenceSlime = new FenceBlock("SlimeFence", "slime_fence");

	//gates
	//public static final GateBlock gateSlime = new GateBlock("SlimeGate", "slime_gate");

	//glass blocks
	public static final GlassBlock glassSlimeCovered = new GlassBlock("SlimeCoveredGlass", "slime_covered_glass");

	//sand blocks
	public static final SandBlock sandSticky = new SandBlock("StickySand", "sticky_sand");

	//crops
	public static final CropBlock cropStickyStuff = new CropBlock("StickyStuffCrop", "sticky_stuff_crop");

}
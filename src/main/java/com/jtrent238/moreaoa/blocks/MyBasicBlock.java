package com.jtrent238.moreaoa.blocks;

import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.block.BasicBlock;

public class MyBasicBlock extends BasicBlock{

	public MyBasicBlock(String name, String registryName, Material material, float hardness, float resistance) {
		super(name, registryName, material, hardness, resistance);
	}

	@SideOnly(Side.CLIENT)
	public StateMap getStateMapper() {
		return (new StateMap.Builder().ignore(BlockSand.VARIANT).build());
	}
}

package com.jtrent238.moreaoa.dimension.slimetopia;

import java.util.HashMap;

import com.jtrent238.moreaoa.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldServer;
import net.tslat.aoa3.block.functional.portal.PortalBlock;
import net.tslat.aoa3.dimension.AoATeleporter;

public class SlimetopiaTeleporter extends AoATeleporter {

	private static final HashMap<Long, BlockPos> cachedPortalMap = new HashMap();
	  
	  public SlimetopiaTeleporter(WorldServer world) {
	    super(world);
	  }
	  
	  public HashMap<Long, BlockPos> getCachedPortalMap()
	  {
	    return cachedPortalMap;
	  }
	  
	  public PortalBlock getPortalBlock()
	  {
	    return ModBlocks.portalSlimetopia;
	  }
	  
	  public Block getBorderBlock()
	  {
	    return ModBlocks.bricksSlime;
	  }
	}
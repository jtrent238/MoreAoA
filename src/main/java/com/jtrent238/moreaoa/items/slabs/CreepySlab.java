package com.jtrent238.moreaoa.items.slabs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.tslat.aoa3.entity.minions.AoAMinion;
import net.tslat.aoa3.entity.minions.EntityPenguin;
import net.tslat.aoa3.item.minionslab.BaseSlab;

public class CreepySlab extends BaseSlab {

	public CreepySlab(String name, String registryName, int lvl, float creationCost, int sacrificeLvl,
			float sacrificeXp) {
		super(name, registryName, lvl, creationCost, sacrificeLvl, sacrificeXp);
	}

	@Override
	public AoAMinion activateSlab(EntityPlayer pl, ItemStack arg1) {
		EntityPenguin penguin = new EntityPenguin(pl.world);
		
		// I need something here
		
	    return penguin;
	}

}

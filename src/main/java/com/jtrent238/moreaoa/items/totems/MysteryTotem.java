package com.jtrent238.moreaoa.items.totems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.entity.misc.EntityLottoIdol;
import net.tslat.aoa3.item.totem.TotemItem;

public class MysteryTotem extends TotemItem {

	public MysteryTotem(String name, String registryName) {
		super(name, registryName);
	}

	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(net.tslat.aoa3.common.registration.WeaponRegister.greatbladeGoofy, world.rand.nextInt(4) + 1));
	
        String get_drops_as_string = drops.toString();
        
        return drops;
    }
        
	protected void summonTotemEntity(World world, EntityPlayer player, BlockPos pos)
	  {
	    EntityLottoIdol idolEntity = new EntityLottoIdol(world);
	    
	    idolEntity.setPosition(pos.getX() + 0.5D, pos.getY() + 1, pos.getZ() + 0.5D);
	    world.spawnEntity(idolEntity);
	  }
}

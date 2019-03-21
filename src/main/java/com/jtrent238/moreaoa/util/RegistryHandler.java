package com.jtrent238.moreaoa.util;

import com.jtrent238.moreaoa.ModItems;
import com.jtrent238.moreaoa.items.bowls.WoodBowl;
import com.jtrent238.moreaoa.items.coins.IronCoin;
import com.jtrent238.moreaoa.items.realmstones.SlimetopiaRealmstone;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.item.misc.Realmstone;
import net.tslat.aoa3.item.misc.SimpleItem;
import net.tslat.aoa3.item.tool.misc.InfusionBowl;

@EventBusSubscriber
public class RegistryHandler {
 
    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
    	
    	final Item[] items = {
    			//new Realmstone("SlimetopiaRealmstone", "slimetopia_realmstone", BlockRegister.portalCandyland, SoundsRegister.musicGyro, "slimetopia"),
    			//new SimpleItem("IronCoin", "iron_coin")
     			ModItems.slimetopia_realmstone, 
     			ModItems.coinIron,
     			ModItems.coinClay,
     			ModItems.coinPlastic,
     			ModItems.coinStone,
     			ModItems.ironBowl,
     			ModItems.goldBowl,
     			ModItems.clayBowl,
     			ModItems.powerStoneBroken,
     			ModItems.infusionStoneBroken
        };
 
        event.getRegistry().registerAll(items);
    }
    
    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                //new BlockModWeb()
        };
 
        event.getRegistry().registerAll(blocks);
    }
}
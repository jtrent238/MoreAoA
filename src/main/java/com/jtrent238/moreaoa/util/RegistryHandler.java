package com.jtrent238.moreaoa.util;

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
import net.tslat.aoa3.item.tool.misc.InfusionBowl;

@EventBusSubscriber
public class RegistryHandler {
 
    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
    	
    	final Item[] items = {
                new Realmstone("SlimeTopiaRealmstone", "slimetopia_realmstone", BlockRegister.portalCandyland, SoundsRegister.musicGyro, "slimetopia"),                new InfusionBowl("WoodBowl", "wood_bowl", 100),
                new InfusionBowl("IronBowl", "iron_bowl", 100),
                new InfusionBowl("GoldBowl", "gold_bowl", 100),
                new InfusionBowl("ClayBowl", "clay_bowl", 100)
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
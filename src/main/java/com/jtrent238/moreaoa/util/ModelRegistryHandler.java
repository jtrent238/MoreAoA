package com.jtrent238.moreaoa.util;

import com.jtrent238.moreaoa.Config;
import com.jtrent238.moreaoa.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {
 
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.slimetopia_realmstone);
        registerModel(ModItems.coinIron);
        registerModel(ModItems.coinClay);
        registerModel(ModItems.coinPlastic);
        registerModel(ModItems.coinStone);
        registerModel(ModItems.ironBowl);
        registerModel(ModItems.goldBowl);
        registerModel(ModItems.clayBowl);
        registerModel(ModItems.powerStoneBroken);
        registerModel(ModItems.infusionStoneBroken);
        
        //registerModel(Item.getItemFromBlock(ModBlocks.BlockModWeb));

    }
 
    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getUnlocalizedName(), "inventory"));
        
	    if(Config.debugMode == true) {
        	System.out.println("Registered Model for: " + item.getUnlocalizedName());
    	}
    }
 
    
}
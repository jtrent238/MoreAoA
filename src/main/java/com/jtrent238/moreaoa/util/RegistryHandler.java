package com.jtrent238.moreaoa.util;

import com.jtrent238.moreaoa.ModBlocks;
import com.jtrent238.moreaoa.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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
     			ModItems.infusionStoneBroken,
     			ModItems.slabCreepy,
     			ModItems.totemMystery,
     			ModItems.seedsStickyStuff,
     			
     			(Item)new ItemBlock(ModBlocks.dirtSlime).setRegistryName(ModBlocks.dirtSlime.getRegistryName()), 
     			(Item)new ItemBlock(ModBlocks.grassSlime).setRegistryName(ModBlocks.grassSlime.getRegistryName()), 
     			(Item)new ItemBlock(ModBlocks.stoneSlime).setRegistryName(ModBlocks.stoneSlime.getRegistryName()), 
     			(Item)new ItemBlock(ModBlocks.oreSlime).setRegistryName(ModBlocks.oreSlime.getRegistryName()), 
     			(Item)new ItemBlock(ModBlocks.bricksSlime).setRegistryName(ModBlocks.bricksSlime.getRegistryName()), 
     			(Item)new ItemBlock(ModBlocks.leavesSlime).setRegistryName(ModBlocks.leavesSlime.getRegistryName()), 
     			(Item)new ItemBlock(ModBlocks.logSlime).setRegistryName(ModBlocks.logSlime.getRegistryName()), 
     			(Item)new ItemBlock(ModBlocks.planksSlime).setRegistryName(ModBlocks.planksSlime.getRegistryName()), 
     			//(Item)new ItemBlock(ModBlocks.slabSlimeBricks).setRegistryName(ModBlocks.slabSlimeBricks.getRegistryName()), 
     			//(Item)new ItemBlock(ModBlocks.slabSlimePlanks).setRegistryName(ModBlocks.slabSlimePlanks.getRegistryName()), 
     			//(Item)new ItemBlock(ModBlocks.stairsSlimeBricks).setRegistryName(ModBlocks.stairsSlimeBricks.getRegistryName()), 
     			//(Item)new ItemBlock(ModBlocks.stairsSlimePlanks).setRegistryName(ModBlocks.stairsSlimePlanks.getRegistryName()), 
     			//(Item)new ItemBlock(ModBlocks.fenceSlime).setRegistryName(ModBlocks.fenceSlime.getRegistryName()), 
     			//(Item)new ItemBlock(ModBlocks.gateSlime).setRegistryName(ModBlocks.gateSlime.getRegistryName()), 
     			(Item)new ItemBlock(ModBlocks.glassSlimeCovered).setRegistryName(ModBlocks.glassSlimeCovered.getRegistryName()), 
     			(Item)new ItemBlock(ModBlocks.sandSticky).setRegistryName(ModBlocks.sandSticky.getRegistryName()), 
     			(Item)new ItemBlock(ModBlocks.cropStickyStuff).setRegistryName(ModBlocks.cropStickyStuff.getRegistryName()),
     			(Item)new ItemBlock(ModBlocks.runeWind).setRegistryName(ModBlocks.runeWind.getRegistryName()),
     			(Item)new ItemBlock(ModBlocks.runeFire).setRegistryName(ModBlocks.runeFire.getRegistryName()),
     			(Item)new ItemBlock(ModBlocks.runeWater).setRegistryName(ModBlocks.runeWater.getRegistryName()),
     			(Item)new ItemBlock(ModBlocks.runePoison).setRegistryName(ModBlocks.runePoison.getRegistryName()),
     			(Item)new ItemBlock(ModBlocks.runeWither).setRegistryName(ModBlocks.runeWither.getRegistryName()),
     			(Item)new ItemBlock(ModBlocks.runeLunar).setRegistryName(ModBlocks.runeLunar.getRegistryName()),
     			(Item)new ItemBlock(ModBlocks.runeEnergy).setRegistryName(ModBlocks.runeEnergy.getRegistryName()),
     			(Item)new ItemBlock(ModBlocks.runeStrike).setRegistryName(ModBlocks.runeStrike.getRegistryName()),
     			(Item)new ItemBlock(ModBlocks.runeStorm).setRegistryName(ModBlocks.runeStorm.getRegistryName()),
     			(Item)new ItemBlock(ModBlocks.runeKinetic).setRegistryName(ModBlocks.runeKinetic.getRegistryName()),
     			(Item)new ItemBlock(ModBlocks.runePower).setRegistryName(ModBlocks.runePower.getRegistryName()),
     			(Item)new ItemBlock(ModBlocks.runeCompass).setRegistryName(ModBlocks.runeCompass.getRegistryName()),
     			(Item)new ItemBlock(ModBlocks.runeDistortion).setRegistryName(ModBlocks.runeDistortion.getRegistryName()),
     			(Item)new ItemBlock(ModBlocks.runeLife).setRegistryName(ModBlocks.runeLife.getRegistryName())
        };
 
        event.getRegistry().registerAll(items);
    }
    
    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        
    	final Block[] blocks = {
        		ModBlocks.dirtSlime,
        		ModBlocks.grassSlime,
        		ModBlocks.stoneSlime,
        		ModBlocks.oreSlime,
        		ModBlocks.bricksSlime,
        		ModBlocks.leavesSlime,
        		ModBlocks.logSlime,
        		ModBlocks.planksSlime,
        		//ModBlocks.slabSlimeBricks,
        		//ModBlocks.slabSlimePlanks,
        		//ModBlocks.stairsSlimeBricks,
        		//ModBlocks.stairsSlimePlanks,
        		//ModBlocks.fenceSlime,
        		//ModBlocks.gateSlime,
        		ModBlocks.glassSlimeCovered,
        		ModBlocks.sandSticky,
        		ModBlocks.cropStickyStuff
        };
        event.getRegistry().registerAll(blocks);

    }
}
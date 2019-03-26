package com.jtrent238.moreaoa.util;

import com.jtrent238.moreaoa.Config;
import com.jtrent238.moreaoa.ModBlocks;
import com.jtrent238.moreaoa.ModItems;
import com.jtrent238.moreaoa.blocks.MyBasicBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.tslat.aoa3.block.generation.sand.SandBlock;

@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {
 
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
    	
    	// ** ITEMS **
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
        registerModel(ModItems.slabCreepy);
        registerModel(ModItems.totemMystery);
        registerModel(ModItems.seedsStickyStuff);
        
        // ** BLOCKS **
        registerModel(Item.getItemFromBlock(ModBlocks.dirtSlime));
        registerModel(Item.getItemFromBlock(ModBlocks.grassSlime));
        registerModel(Item.getItemFromBlock(ModBlocks.stoneSlime));
        registerModel(Item.getItemFromBlock(ModBlocks.oreSlime));
        registerModel(Item.getItemFromBlock(ModBlocks.bricksSlime));
        registerModel(Item.getItemFromBlock(ModBlocks.leavesSlime));
        registerModel(Item.getItemFromBlock(ModBlocks.logSlime));
        registerModel(Item.getItemFromBlock(ModBlocks.planksSlime));
        //registerModel(Item.getItemFromBlock(ModBlocks.slabSlimeBricks));
        //registerModel(Item.getItemFromBlock(ModBlocks.slabSlimePlanks));
        //registerModel(Item.getItemFromBlock(ModBlocks.stairsSlimeBricks));
        //registerModel(Item.getItemFromBlock(ModBlocks.stairsSlimePlanks));
        //registerModel(Item.getItemFromBlock(ModBlocks.fenceSlime));
        //registerModel(Item.getItemFromBlock(ModBlocks.gateSlime));
        registerModel(Item.getItemFromBlock(ModBlocks.glassSlimeCovered));
        registerModel(Item.getItemFromBlock(ModBlocks.sandSticky));
        registerModel(Item.getItemFromBlock(ModBlocks.cropStickyStuff));
        registerModel(Item.getItemFromBlock(ModBlocks.runeWind));
        registerModel(Item.getItemFromBlock(ModBlocks.runeFire));
        registerModel(Item.getItemFromBlock(ModBlocks.runeWater));
        registerModel(Item.getItemFromBlock(ModBlocks.runePoison));
        registerModel(Item.getItemFromBlock(ModBlocks.runeWither));
        registerModel(Item.getItemFromBlock(ModBlocks.runeLunar));
        registerModel(Item.getItemFromBlock(ModBlocks.runeEnergy));
        registerModel(Item.getItemFromBlock(ModBlocks.runeStrike));
        registerModel(Item.getItemFromBlock(ModBlocks.runeStorm));
        registerModel(Item.getItemFromBlock(ModBlocks.runeKinetic));
        registerModel(Item.getItemFromBlock(ModBlocks.runePower));
        registerModel(Item.getItemFromBlock(ModBlocks.runeCompass));
        registerModel(Item.getItemFromBlock(ModBlocks.runeDistortion));
        registerModel(Item.getItemFromBlock(ModBlocks.runeLife));
    }
 
    public static void registerStateMappers() {
    	//ModelLoader.setCustomStateMapper(ModBlocks.dirtSlime, ((MyBasicBlock) ModBlocks.dirtSlime).getStateMapper());
    	//ModelLoader.setCustomStateMapper(ModBlocks.grassSlime, ((MyBasicBlock) ModBlocks.grassSlime).getStateMapper());
    	//ModelLoader.setCustomStateMapper(ModBlocks.stoneSlime, ((MyBasicBlock) ModBlocks.stoneSlime).getStateMapper());
    	//ModelLoader.setCustomStateMapper(ModBlocks.oreSlime, ((MyBasicBlock) ModBlocks.oreSlime).getStateMapper());
    	// ModelLoader.setCustomStateMapper(ModBlocks.bricksSlime, ModBlocks.bricksSlime.getStateMapper());
    	// ModelLoader.setCustomStateMapper(ModBlocks.leavesSlime, ModBlocks.leavesSlime.getStateMapper());
    	// ModelLoader.setCustomStateMapper(ModBlocks.logSlime, ModBlocks.logSlime.getStateMapper());
    	// ModelLoader.setCustomStateMapper(ModBlocks.planksSlime, ModBlocks.planksSlime.getStateMapper());
        //ModelLoader.setCustomStateMapper(ModBlocks.slabSlimeBricks, ModBlocks.slabSlimeBricks.getStateMapper());
        //ModelLoader.setCustomStateMapper(ModBlocks.slabSlimePlanks, ModBlocks.slabSlimePlanks.getStateMapper());
        //ModelLoader.setCustomStateMapper(ModBlocks.stairsSlimeBricks, ModBlocks.stairsSlimeBricks.getStateMapper());
        //ModelLoader.setCustomStateMapper(ModBlocks.stairsSlimePlanks, ModBlocks.stairsSlimePlanks.getStateMapper());
        //ModelLoader.setCustomStateMapper(ModBlocks.fenceSlime, ModBlocks.fenceSlime.getStateMapper());
        //ModelLoader.setCustomStateMapper(ModBlocks.gateSlime, ModBlocks.gateSlime.getStateMapper());
        //ModelLoader.setCustomStateMapper(ModBlocks.glassSlimeCovered, ModBlocks.glassSlimeCovered.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.cropStickyStuff, ModBlocks.cropStickyStuff.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.sandSticky, ModBlocks.sandSticky.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.runeWind, ModBlocks.runeWind.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.runeFire, ModBlocks.runeFire.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.runeWater, ModBlocks.runeWater.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.runePoison, ModBlocks.runePoison.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.runeWither, ModBlocks.runeWither.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.runeLunar, ModBlocks.runeLunar.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.runeEnergy, ModBlocks.runeEnergy.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.runeStrike, ModBlocks.runeStrike.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.runeStorm, ModBlocks.runeStorm.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.runeKinetic, ModBlocks.runeKinetic.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.runePower, ModBlocks.runePower.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.runeCompass, ModBlocks.runeCompass.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.runeDistortion, ModBlocks.runeDistortion.getStateMapper());
     // ModelLoader.setCustomStateMapper(ModBlocks.runeLife, ModBlocks.dirtSlime.getStateMapper());
    }
    
    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getUnlocalizedName(), "inventory"));
        //ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getItemFromBlock(Blocks.ACACIA_FENCE)));
        //ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(new ResourceLocation("aoa3:" + location + item.getRegistryName().getResourcePath()), null));
	    if(Config.debugMode == true) {
        	System.out.println("Registered Model for: " + item.getUnlocalizedName());
    	}
    }
 
    
}
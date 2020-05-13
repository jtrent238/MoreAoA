package com.jtrent238.moreaoa.util;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.entity.boss.corallus.EntityCorallus;
import net.tslat.aoa3.entity.mobs.abyss.EntityBloodsucker;
import net.tslat.aoa3.entity.mobs.abyss.EntitySlimer;
import net.tslat.aoa3.entity.mobs.barathos.EntityEilosapien;
import net.tslat.aoa3.entity.mobs.candyland.EntityCherryBarrager;
import net.tslat.aoa3.entity.mobs.celeve.EntityChocko;
import net.tslat.aoa3.entity.mobs.celeve.EntityJumbo;
import net.tslat.aoa3.entity.mobs.celeve.EntityKoko;
import net.tslat.aoa3.entity.mobs.celeve.EntitySticky;
import net.tslat.aoa3.entity.mobs.creeponia.EntityKingCreeper;
import net.tslat.aoa3.entity.mobs.crystevia.EntityConstructMind;
import net.tslat.aoa3.entity.mobs.deeplands.EntityCaseConstruct;
import net.tslat.aoa3.entity.mobs.deeplands.EntityDoubler;
import net.tslat.aoa3.entity.mobs.deeplands.EntityDweller;
import net.tslat.aoa3.entity.mobs.deeplands.EntityRockCritter;
import net.tslat.aoa3.entity.mobs.dustopia.EntityLostSoul;
import net.tslat.aoa3.entity.mobs.dustopia.EntityStalkerPrime;
import net.tslat.aoa3.entity.mobs.gardencia.EntityFlowerface;
import net.tslat.aoa3.entity.mobs.gardencia.EntityPodPlant;
import net.tslat.aoa3.entity.mobs.gardencia.EntitySquasher;
import net.tslat.aoa3.entity.mobs.gardencia.EntitySunny;
import net.tslat.aoa3.entity.mobs.greckon.EntityGrillface;
import net.tslat.aoa3.entity.mobs.greckon.EntityHunter;
import net.tslat.aoa3.entity.mobs.greckon.EntityShifter;
import net.tslat.aoa3.entity.mobs.haven.EntityAngelica;
import net.tslat.aoa3.entity.mobs.haven.EntitySeeker;
import net.tslat.aoa3.entity.mobs.haven.EntitySurveyor;
import net.tslat.aoa3.entity.mobs.haven.EntityVoliant;
import net.tslat.aoa3.entity.mobs.iromine.EntityMechachron;
import net.tslat.aoa3.entity.mobs.lborean.EntityNeptuno;
import net.tslat.aoa3.entity.mobs.lelyetia.EntityGrobbler;
import net.tslat.aoa3.entity.mobs.lunalus.EntityVisulon;
import net.tslat.aoa3.entity.mobs.mysterium.EntityFungung;
import net.tslat.aoa3.entity.mobs.overworld.EntityBugeye;
import net.tslat.aoa3.entity.mobs.overworld.EntityBushBaby;
import net.tslat.aoa3.entity.mobs.overworld.EntityClown;
import net.tslat.aoa3.entity.mobs.overworld.EntityFacelessRunner;
import net.tslat.aoa3.entity.mobs.overworld.EntityGhost;
import net.tslat.aoa3.entity.mobs.overworld.EntityGoalby;
import net.tslat.aoa3.entity.mobs.overworld.EntityMagicke;
import net.tslat.aoa3.entity.mobs.overworld.EntityShade;
import net.tslat.aoa3.entity.mobs.overworld.EntityStinger;
import net.tslat.aoa3.entity.mobs.overworld.EntityTrickster;
import net.tslat.aoa3.entity.mobs.overworld.bloodhunt.EntityAnemia;
import net.tslat.aoa3.entity.mobs.overworld.bloodhunt.EntityBloodmist;
import net.tslat.aoa3.entity.mobs.overworld.bloodhunt.EntityLinger;
import net.tslat.aoa3.entity.mobs.overworld.creepday.EntityHost;
import net.tslat.aoa3.entity.mobs.overworld.deathday.EntityDeathHunter;
import net.tslat.aoa3.entity.mobs.overworld.lunarinvasion.EntityTerrestrial;
import net.tslat.aoa3.entity.mobs.precasia.EntityDyrehorn;
import net.tslat.aoa3.entity.mobs.precasia.EntityGiantSnail;
import net.tslat.aoa3.entity.mobs.precasia.EntityTerradon;
import net.tslat.aoa3.entity.mobs.runandor.EntityBouncer;
import net.tslat.aoa3.entity.mobs.runandor.EntityPaladin;
import net.tslat.aoa3.entity.mobs.shyrelands.EntityStimulosus;
import net.tslat.aoa3.entity.mobs.voxponds.EntityExoid;

public class MobDropsHandler 
{
	private Item realmstone_haven = ItemRegister.realmstoneHaven;
	private Item realmstone_abyss = ItemRegister.realmstoneAbyss;
	private Item realmstone_precasia = ItemRegister.realmstonePrecasia;
	private Item realmstone_mysterium = ItemRegister.realmstoneMysterium;
	private Item realmstone_iromine = ItemRegister.tokensIromine;
	private Item realmstone_lunalus = ItemRegister.realmstoneLunalus;
	private Item realmstone_deeplands = ItemRegister.realmstoneDeeplands;
	private Item realmstone_gardencia = ItemRegister.realmstoneGardencia;
	private Item realmstone_borean = ItemRegister.realmstoneBorean;
	private Item realmstone_voxponds = ItemRegister.realmstoneVoxPonds;
	private Item realmstone_barathos = ItemRegister.realmstoneBarathos;
	private Item realmstone_dustopia = ItemRegister.realmstoneDustopia;
	private Item realmstone_lelyetia = ItemRegister.realmstoneLelyetia;
	private Item realmstone_ancientcavern = ItemRegister.realmstoneAncientCavern;
	private Item realmstone_celeve = ItemRegister.realmstoneCeleve;
	private Item realmstone_crystevia = ItemRegister.realmstoneCrystevia;
	private Item realmstone_candyland = ItemRegister.realmstoneCandyland;
	private Item realmstone_immortaills = ItemRegister.realmstoneImmortallis;
	private Item realmstone_creeponia = ItemRegister.realmstoneCreeponia;
	private Item realmstone_shyrelands = ItemRegister.realmstoneShyrelands;
	
	@SubscribeEvent
    public void onMobDrops(LivingDropsEvent event)
    {
		
		/*
		 * Haven Realmstone Drops
		 */
		
	    	//Goalby drops Haven Realmstone
	        if (event.getEntity() instanceof EntityGoalby)
	        {
	 
	            ItemStack stack = new ItemStack(realmstone_haven);
	            EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
	            
	            event.getDrops().add(drop);
	        }
	
		
			//Magicke drops Haven Realmstone
		    if (event.getEntity() instanceof EntityMagicke)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_haven);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
	
		    //Voliant drops Haven Realmstone
		    if (event.getEntity() instanceof EntityVoliant)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_haven);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }

	    /*
	     * Abyss Realmstone Drops
	     */
	    
		    //Linger drops Abyss Realmstone
		    if (event.getEntity() instanceof EntityLinger)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_abyss);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
	
		    //Anemia drops Abyss Realmstone
		    if (event.getEntity() instanceof EntityAnemia)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_abyss);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
	
		    //Bloodmist drops Abyss Realmstone
		    if (event.getEntity() instanceof EntityBloodmist)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_abyss);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
	
		    //Trickster drops Abyss Realmstone
		    if (event.getEntity() instanceof EntityTrickster)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_abyss);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
	
		    //Slimer drops Abyss Realmstone
		    if (event.getEntity() instanceof EntitySlimer)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_abyss);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }

	    /*
	     * Precasia Realmstone Drops
	     */
		    
		  //Stinger drops Precasia Realmstone
		    if (event.getEntity() instanceof EntityStinger)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_precasia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //BushBaby drops Precasia Realmstone
		    if (event.getEntity() instanceof EntityBushBaby)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_precasia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Terradon drops Precasia Realmstone
		    if (event.getEntity() instanceof EntityTerradon)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_precasia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
	    /*
	     * Mysterium Realmstone Drops
	     */
		    
		    
		  //Bugeye drops Mysterium Realmstone
		    if (event.getEntity() instanceof EntityBugeye)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_mysterium);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		    
		  //Fungung drops Mysterium Realmstone
		    if (event.getEntity() instanceof EntityFungung)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_mysterium);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
			    
	    /*
	     * Iromine Realmstone Drops
	     */
		    
		  //Dweller drops Iromine Realmstone
		    if (event.getEntity() instanceof EntityDweller)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_iromine);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Mechachron drops Iromine Realmstone
		    if (event.getEntity() instanceof EntityMechachron)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_iromine);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
	    /*
	     * Lunalus Realmstone Drops
	     */
		    
		  //Terrestrial drops Lunalus Realmstone
		    if (event.getEntity() instanceof EntityTerrestrial)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_lunalus);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Visulon drops Lunalus Realmstone
		    if (event.getEntity() instanceof EntityVisulon)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_lunalus);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
	    /*
	     * Deeplands Realmstone Drops
	     */
		    
		  //Clown drops Deeplands Realmstone
		    if (event.getEntity() instanceof EntityClown)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_deeplands);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //FacelessRunner drops Deeplands Realmstone
		    if (event.getEntity() instanceof EntityFacelessRunner)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_deeplands);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		    //Ghost drops Deeplands Realmstone
		    if (event.getEntity() instanceof EntityGhost)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_deeplands);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		    //Shade drops Deeplands Realmstone
		    if (event.getEntity() instanceof EntityShade)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_deeplands);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		    //Trickster drops Deeplands Realmstone
		    if (event.getEntity() instanceof EntityTrickster)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_deeplands);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		    //Doubler drops Deeplands Realmstone
		    if (event.getEntity() instanceof EntityDoubler)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_deeplands);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
	    /*
	     * Gardencia Realmstone Drops
	     */
		    
		    //Dyrehorn drops Deeplands Realmstone
		    if (event.getEntity() instanceof EntityDyrehorn)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_gardencia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		    //GiantSlug drops Deeplands Realmstone
		    if (event.getEntity() instanceof EntityGiantSnail)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_gardencia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		    //Sunny drops Deeplands Realmstone
		    if (event.getEntity() instanceof EntitySunny)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_gardencia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
	    /*
	     * L'Borean Realmstone Drops
	     */
		    
		  //Corallus drops L'Borean Realmstone
		    if (event.getEntity() instanceof EntityCorallus)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_borean);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Neptuno drops L'Borean Realmstone
		    if (event.getEntity() instanceof EntityNeptuno)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_borean);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
	    /*
	     * Vox Ponds Realmstone Drops
	     */
		    
		  //PodPlant drops Vox Ponds Realmstone
		    if (event.getEntity() instanceof EntityPodPlant)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_voxponds);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Flowerface drops Vox Ponds Realmstone
		    if (event.getEntity() instanceof EntityFlowerface)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_voxponds);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
			    
		  //Squasher drops Vox Ponds Realmstone
		    if (event.getEntity() instanceof EntitySquasher)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_voxponds);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Exoid drops Vox Ponds Realmstone
		    if (event.getEntity() instanceof EntityExoid)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_voxponds);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
	    /*
	     * Barathos Realmstone Drops
	     */
		    
		  //Paladin drops Barathos Realmstone
		    if (event.getEntity() instanceof EntityPaladin)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_barathos);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Bouncer drops Barathos Realmstone
		    if (event.getEntity() instanceof EntityBouncer)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_barathos);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Eilosapien drops Barathos Realmstone
		    if (event.getEntity() instanceof EntityEilosapien)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_barathos);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
	    /*
	     * Dustopia Realmstone Drops
	     */
	    
		  //Grillface drops Dustopia Realmstone
		    if (event.getEntity() instanceof EntityGrillface)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_dustopia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Hunter drops Dustopia Realmstone
		    if (event.getEntity() instanceof EntityHunter)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_dustopia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Shifter drops Dustopia Realmstone
		    if (event.getEntity() instanceof EntityShifter)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_dustopia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //StalkerPrime drops Dustopia Realmstone
		    if (event.getEntity() instanceof EntityStalkerPrime)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_dustopia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
	    /*
	     * Lelyetia Realmstone Drops
	     */
	    
		  //Seeker drops Lelyetia Realmstone
		    if (event.getEntity() instanceof EntitySeeker)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_lelyetia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Surveyor drops Lelyetia Realmstone
		    if (event.getEntity() instanceof EntitySurveyor)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_lelyetia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Grobbler drops Lelyetia Realmstone
		    if (event.getEntity() instanceof EntityGrobbler)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_lelyetia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
	    /*
	     * Ancient Cavern Realmstone Drops
	     */
	    
		  //Angelica drops Ancient Cavern Realmstone
		    if (event.getEntity() instanceof EntityAngelica)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_ancientcavern);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Flowerface drops Ancient Cavern Realmstone
		    if (event.getEntity() instanceof EntityFlowerface)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_ancientcavern);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Bloodsucker drops Ancient Cavern Realmstone
		    if (event.getEntity() instanceof EntityBloodsucker)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_ancientcavern);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //RockCritter drops Ancient Cavern Realmstone
		    if (event.getEntity() instanceof EntityRockCritter)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_ancientcavern);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
	    /*
	     * Celeve  Realmstone Drops
	     */
	    
		  //Clown drops Celeve Realmstone
		    if (event.getEntity() instanceof EntityClown)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_celeve);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Jumbo drops Celeve Realmstone
		    if (event.getEntity() instanceof EntityJumbo)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_celeve);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
	    /*
	     * Crystevia  Realmstone Drops
	     */
	    
		  //CaseConstruct drops Crystevia Realmstone
		    if (event.getEntity() instanceof EntityCaseConstruct)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_crystevia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Construct of Mind drops Crystevia Realmstone
		    if (event.getEntity() instanceof EntityConstructMind)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_crystevia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
			    
	    /*
	     * Candyland Realmstone Drops
	     */
	    
		  //Koko drops Candyland Realmstone
		    if (event.getEntity() instanceof EntityKoko)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_candyland);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Chocko drops Candyland Realmstone
		    if (event.getEntity() instanceof EntityChocko)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_candyland);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		    //Sticky drops Candyland Realmstone
		    if (event.getEntity() instanceof EntitySticky)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_candyland);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.getDrops().add(drop);
		    }
		    
		  //Cherry Barrager drops Candyland Realmstone
		    if (event.getEntity() instanceof EntityCherryBarrager)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_candyland);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.
		        getDrops().add(drop);
		    }
		    
	    /*
	     * Immortallis Realmstone Drops
	     */
	    
		  //Death Hunter drops Immortallis Realmstone
		    if (event.getEntity() instanceof EntityDeathHunter)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_immortaills);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.
		        getDrops().add(drop);
		    }
		    
	    /*
	     * Creeponia Realmstone Drops
	     */
	    
		  //Host drops Creeponia Realmstone
		    if (event.getEntity() instanceof EntityHost)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_creeponia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.
		        getDrops().add(drop);
		    }
		    
		  //King Creeper drops Creeponia Realmstone
		    if (event.getEntity() instanceof EntityKingCreeper)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_creeponia);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.
		        getDrops().add(drop);
		    }
		    
	    /*
	     * Shyrelands Realmstone Drops
	     */
		    
		  //Lost Soul drops Shyrelands Realmstone
		    if (event.getEntity() instanceof EntityLostSoul)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_shyrelands);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.
		        getDrops().add(drop);
		    }
		    
		  //Stimulosus drops Shyrelands Realmstone
		    if (event.getEntity() instanceof EntityStimulosus)
		    {
		
		        ItemStack stack = new ItemStack(realmstone_shyrelands);
		        EntityItem drop = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
		        
		        event.
		        getDrops().add(drop);
		    }
    }
}


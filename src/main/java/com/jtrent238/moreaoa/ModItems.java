package com.jtrent238.moreaoa;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.item.misc.InfusionStone;
import net.tslat.aoa3.item.misc.Realmstone;
import net.tslat.aoa3.item.misc.SimpleItem;
import net.tslat.aoa3.item.tool.misc.InfusionBowl;

@ObjectHolder(Main.MODID)
public class ModItems {

	//RealmStones
	public static final Realmstone slimetopia_realmstone = new Realmstone("SlimetopiaRealmstone", "slimetopia_realmstone", BlockRegister.portalCandyland, SoundsRegister.musicKror, "slimetopia");
	
	//coins
	public static final SimpleItem coinIron = new SimpleItem("IronCoin", "iron_coin");
	public static final SimpleItem coinClay = new SimpleItem("ClayCoin", "clay_coin");
	public static final SimpleItem coinPlastic = new SimpleItem("PlasticCoin", "plastic_coin");
	public static final SimpleItem coinStone = new SimpleItem("StoneCoin", "stone_coin");
	
	//bowls
	public static final InfusionBowl ironBowl = new InfusionBowl("IronBowl", "iron_bowl", 100);
	public static final InfusionBowl goldBowl = new InfusionBowl("GoldBowl", "gold_bowl", 100);
	public static final InfusionBowl clayBowl = new InfusionBowl("ClayBowl", "clay_bowl", 100);
	
	//power stones
	public static final SimpleItem powerStoneBroken = new SimpleItem("BrokenPowerStone", "broken_power_stone");

	//infusion stones
	public static final InfusionStone infusionStoneBroken = new InfusionStone("BrokenInfusionStone", "broken_infusion_stone", 0, 0F, powerStoneBroken);
	
}
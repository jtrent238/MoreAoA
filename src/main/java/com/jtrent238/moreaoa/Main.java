package com.jtrent238.moreaoa;

import org.apache.logging.log4j.Logger;

import com.jtrent238.moreaoa.proxy.CommonProxy;
import com.jtrent238.moreaoa.util.MobDropsHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.tslat.aoa3.event.GlobalEvents;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.MODVERSION, dependencies = "required-after:forge@[11.16.0.1865,)", useMetadata = true, acceptedMinecraftVersions="1.12.2", updateJSON=Main.UpdateJSON )
public class Main {

    public static final String MODID = "moreaoa";
	public static final String MODNAME = "jtrent238's More AoA";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MODVERSION = "1.0.0.0-dev";
	public static final String MC = "1.12.2";
	public static final String UpdateJSON = "";
	
    @SidedProxy(clientSide = "com.jtrent238.moreaoa.proxy.ClientProxy", serverSide = "com.jtrent238.moreaoa.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Main instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
	    MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
        proxy.postInit(e);
    }
    
}
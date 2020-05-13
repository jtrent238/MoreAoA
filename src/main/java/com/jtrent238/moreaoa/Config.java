package com.jtrent238.moreaoa;

import org.apache.logging.log4j.Level;

import com.jtrent238.moreaoa.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;

public class Config {

	private static final String CATEGORY_GENERAL = "general";
	private static final String CATEGORY_DEBUG = "debug";
	private static final String CATEGORY_DIMIDS = "dimIDS";
	private static final String CATEGORY_BIOMEIDS = "biomeIDS";
	private static final String CATEGORY_CLASSIC = "classic";
	
	// This values below you can access elsewhere in your mod:

	public static boolean debugMode;
	public static int slimetopiaDimID;
	public static int slimetopiaBiomeID;
	public static boolean classicRealmstones;
	
    // Call this from CommonProxy.preInit(). It will create our config if it doesn't
    // exist yet and read the values if it does exist.
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e1) {
            Main.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        //cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
        // cfg.getBoolean() will get the value in the config if it is already specified there. If not it will create the value.
        debugMode = cfg.getBoolean("debugMode", CATEGORY_DEBUG, debugMode, "Debug Logging");
        classicRealmstones = cfg.getBoolean("classicRealmstone", CATEGORY_CLASSIC, true, "Classic Realmstones");
        slimetopiaDimID = cfg.getInt("slimetopia_dim_id", CATEGORY_DIMIDS, 90, 90, 200,  "Slimetopia ID:");
        slimetopiaBiomeID = cfg.getInt("slimetopia_biome_id", CATEGORY_BIOMEIDS, 150, 150, 300, "Slimetopia Biome ID:");
        
    }
}
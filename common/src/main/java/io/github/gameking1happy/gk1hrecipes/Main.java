package io.github.gameking1happy.gk1hrecipes;

import io.github.gameking1happy.gk1hrecipes.config.ServerConfig;
import io.github.gameking1happy.gk1hrecipes.packs.Packs;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.gameking1happy.gk1hcore.Main.addClass;
import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;

/**
 * The main class for the mod.
 */
@SuppressWarnings("CanBeFinal")
public class Main {
    /**
     * The mod ID.
     */
    public static final String MOD_ID = "gk1hrecipes";
    /**
     * The mod name.
     */
    public static final String MOD_NAME = "GK1H Recipes";
    /**
     * The mod logger.
     */
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
    /**
     * The server configuration for the mod.
     */
    public static ServerConfig serverconfig = ConfigApiJava.registerAndLoadConfig(ServerConfig::new);
    /**
     * Bundle recipe configuration value.
     */
    public static boolean Bundle = serverconfig.Bundle.get();
    /**
     * Chain and chainmail armor recipes configuration value.
     */
    public static boolean Chain = serverconfig.Chain.get();
    /**
     * Enchanted golden apple recipes configuration value.
     */
    public static boolean Gapple = serverconfig.Gapple.get();
    /**
     * Heavy core duplication recipe configuration value.
     */
    public static boolean HeavyCore = serverconfig.HeavyCore.get();
    /**
     * Horse armor &amp; saddle recipes configuration value.
     */
    public static boolean HorseArmorSaddle = serverconfig.HorseArmorSaddle.get();
    /**
     * Better lead recipe configuration value.
     */
    public static boolean Lead = serverconfig.Lead.get();
    /**
     * Better lodestone recipe configuration value.
     */
    public static boolean Lodestone = serverconfig.Lodestone.get();
    /**
     * Netherite recipe configuration value.
     */
    public static boolean Netherite = serverconfig.Netherite.get();
    /**
     * Crafting to smithing recipes configuration value.
     */
    public static boolean Smithing = serverconfig.Smithing.get();
    /**
     * Netherrack &amp; tuff recipes configuration value.
     */
    public static boolean StoneType = serverconfig.StoneType.get();
    /**
     * Totem recipes configuration value.
     */
    public static boolean Totem = serverconfig.Totem.get();

    /**
     * Common method for initializing the mod.
     */
    public static void init() {
        LOG.info("Hello from Common init on {}! we are currently in a {} environment!", PLATFORM.getPlatformName(), PLATFORM.getEnvironmentName());
        addClass(new Packs());
    }
}
package io.github.gameking1happy.gk1hrecipes;

import io.github.gameking1happy.gk1hrecipes.config.ServerConfig;
import io.github.gameking1happy.gk1hrecipes.packs.Packs;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.gameking1happy.gk1hcore.Main.addClass;
import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;

public class Main {
    // Mod constants.
    public static final String MOD_ID = "gk1hrecipes";
    public static final String MOD_NAME = "GK1H Recipes";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
    public static ServerConfig serverconfig = ConfigApiJava.registerAndLoadConfig(ServerConfig::new);
    public static boolean Bundle = serverconfig.Bundle.get();
    public static boolean Chain = serverconfig.Chain.get();
    public static boolean Gapple = serverconfig.Gapple.get();
    public static boolean HeavyCore = serverconfig.HeavyCore.get();
    public static boolean HorseArmorSaddle = serverconfig.HorseArmorSaddle.get();
    public static boolean Lead = serverconfig.Lead.get();
    public static boolean Lodestone = serverconfig.Lodestone.get();
    public static boolean Netherite = serverconfig.Netherite.get();
    public static boolean Smithing = serverconfig.Smithing.get();
    public static boolean StoneType = serverconfig.StoneType.get();
    public static boolean Totem = serverconfig.Totem.get();
    public static void init() {
        // Gives a startup message to the log.
        LOG.info("Hello from Common init on {}! we are currently in a {} environment!", PLATFORM.getPlatformName(), PLATFORM.getEnvironmentName());
        addClass(new Packs());
    }
}
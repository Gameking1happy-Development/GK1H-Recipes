package io.github.gameking1happy.gk1hrecipes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;

public class Main {
    // Mod constants.
    public static final String MOD_ID = "gk1hrecipes";
    public static final String MOD_NAME = "GK1H Recipes";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        // ADDPACKS.addConfigSpec(ServerConfig.SPEC);
        // Gives a startup message to the log.
        LOG.info("Hello from Common init on {}! we are currently in a {} environment!", PLATFORM.getPlatformName(), PLATFORM.getEnvironmentName());
    }
}
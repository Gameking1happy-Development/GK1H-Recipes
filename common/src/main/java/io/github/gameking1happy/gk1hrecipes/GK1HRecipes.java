package io.github.gameking1happy.gk1hrecipes;

import io.github.gameking1happy.gk1hrecipes.config.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;
public class GK1HRecipes {
    public static void init() {
        // Gives a startup message to the log.
        LOG.info("Hello from Common init on {}! we are currently in a {} environment!", PLATFORM.getPlatformName(), PLATFORM.getEnvironmentName());
    }
    public static void initclient() {
        // Gives a startup message to the log.
        LOG.info("Client-side.");
    }
    public static void initserver() {
        // Gives a startup message to the log.
        LOG.info("Server-side.");
    }
    // Mod constants.
    public static final String MOD_ID = "gk1hrecipes";
    public static final String MOD_NAME = "GK1H Recipes";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
}
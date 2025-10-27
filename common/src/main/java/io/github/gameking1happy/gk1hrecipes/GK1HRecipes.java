package io.github.gameking1happy.gk1hrecipes;

import io.github.gameking1happy.gk1hrecipes.config.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;
public class GK1HRecipes {
    public static void init() {
        // Gives a startup message to the log.
        LOG.info("Hello from Common init on {}! we are currently in a {} environment!", PLATFORM.getPlatformName(), PLATFORM.getEnvironmentName());
        // Checks the common configuration option.
        if (Common.ExampleCommon.get()) {
            LOG.info("ExampleCommon is true!");
        }
        else {
            LOG.info("ExampleCommon is false!");
        }
    }
    public static void initclient() {
        // Gives a startup message to the log.
        LOG.info("Client-side.");
        // Checks the client configuration option.
        if (Client.ExampleClient.get()) {
            LOG.info("ExampleClient is true!");
        }
        else {
            LOG.info("ExampleClient is false!");
        }
    }
    public static void initserver() {
        // Gives a startup message to the log.
        LOG.info("Server-side.");
        // Checks the server configuration option.
        if (Server.ExampleServer.get()) {
            LOG.info("ExampleServer is true!");
        }
        else {
            LOG.info("ExampleServer is false!");
        }
    }
    // Mod constants.
    public static final String MOD_ID = "gk1hrecipes";
    public static final String MOD_NAME = "GK1H Recipes";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
}
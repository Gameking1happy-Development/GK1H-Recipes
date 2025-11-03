package io.github.gameking1happy.gk1hrecipes.client;

import fuzs.forgeconfigapiport.fabric.api.neoforge.v4.client.ConfigScreenFactoryRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

public class FabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Client.initclient();
        // Register the config screen.
        ConfigScreenFactoryRegistry.INSTANCE.register(MOD_ID, ConfigurationScreen::new);
    }
}

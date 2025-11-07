package io.github.gameking1happy.gk1hrecipes.client;

import net.fabricmc.api.ClientModInitializer;

public class FabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Client.initclient();
    }
}

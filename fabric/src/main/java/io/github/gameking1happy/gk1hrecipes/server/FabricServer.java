package io.github.gameking1happy.gk1hrecipes.server;

import net.fabricmc.api.DedicatedServerModInitializer;

public class FabricServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        Server.initserver();
    }
}

package io.github.gameking1happy.gk1hrecipes;

import net.fabricmc.api.ModInitializer;

/**
 * Fabric main class for the mod.
 */
@SuppressWarnings("unused")
public class MainFabric implements ModInitializer {
    /**
     * Runs the Fabric mod initializer.
     */
    @Override
    public void onInitialize() {
        Main.init();
    }
}

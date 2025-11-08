package io.github.gameking1happy.gk1hrecipes;

import fuzs.forgeconfigapiport.fabric.api.neoforge.v4.NeoForgeConfigRegistry;
import io.github.gameking1happy.gk1hrecipes.config.ServerConfig;
import net.fabricmc.api.ModInitializer;
import net.neoforged.fml.config.ModConfig;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

public class MainFabric implements ModInitializer {
    public void onInitialize() {
        // Register the configs.
        NeoForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.SERVER, ServerConfig.SPEC);
        // Initialize the mod.
        Main.init();
    }
}

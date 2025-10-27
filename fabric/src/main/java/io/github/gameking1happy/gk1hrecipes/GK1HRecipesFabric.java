package io.github.gameking1happy.gk1hrecipes;

import fuzs.forgeconfigapiport.fabric.api.neoforge.v4.NeoForgeConfigRegistry;
import fuzs.forgeconfigapiport.fabric.api.neoforge.v4.client.ConfigScreenFactoryRegistry;
import io.github.gameking1happy.gk1hrecipes.config.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ModInitializer;
import net.minecraft.network.chat.Component;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;

import static io.github.gameking1happy.gk1hrecipes.GK1HRecipes.MOD_ID;
import static net.fabricmc.loader.api.FabricLoader.getInstance;
public class GK1HRecipesFabric implements ModInitializer {

    public void onInitialize() {
        // Register the configs.
        NeoForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.COMMON, Common.SPEC, MOD_ID + "-common.toml");
        NeoForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.SERVER, Server.SPEC, MOD_ID + "-server.toml");
        // Register the config screen.
        ConfigScreenFactoryRegistry.INSTANCE.register(MOD_ID, ConfigurationScreen::new);
        // Initialize the mod.
        GK1HRecipes.init();
        if (getInstance().getEnvironmentType() == EnvType.CLIENT) {
            initclient();
        }
        if (getInstance().getEnvironmentType() == EnvType.SERVER) {
            initserver();
        }
    }
    public void initclient() {
        NeoForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.CLIENT, Client.SPEC, MOD_ID + "-client.toml");
        GK1HRecipes.initclient();
        ClientPlayConnectionEvents.JOIN.register((handler, sender, client) -> {
            var player = client.player;
            assert player != null;
            player.sendSystemMessage(Component.nullToEmpty("test"));
        });
    }
    public void initserver() {
        GK1HRecipes.initserver();
    }
}

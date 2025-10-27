package io.github.gameking1happy.gk1hrecipes;

import io.github.gameking1happy.gk1hrecipes.config.*;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.common.NeoForge;

import static io.github.gameking1happy.gk1hrecipes.GK1HRecipes.MOD_ID;
import static net.neoforged.fml.loading.FMLEnvironment.dist;
@Mod(MOD_ID)
public class GK1HRecipesNeoForge {

    public GK1HRecipesNeoForge(ModContainer modContainer, IEventBus modBus) {
        modContainer.registerConfig(ModConfig.Type.COMMON, Common.SPEC, MOD_ID + "-common.toml");
        modContainer.registerConfig(ModConfig.Type.SERVER, Server.SPEC, MOD_ID + "-server.toml");
        if (dist == Dist.CLIENT) {
        initclient(modContainer, modBus);
        }
    }

    private static void ConfigLoaded(ModConfigEvent.Loading event) {
        ModConfig config = event.getConfig();
        if (config.getSpec() == Common.SPEC) {
            GK1HRecipes.init();
        }
        else if (config.getSpec() == Client.SPEC) {
            if (dist == Dist.CLIENT) {
                GK1HRecipes.initclient();
            }
        }
        else if (config.getSpec() == Server.SPEC) {
            if (dist == Dist.DEDICATED_SERVER) {
                GK1HRecipes.initserver();
            }
        }
        else {
            throw new IllegalStateException("Unknown ModConfigSpec Loaded.");
        }
    }
    public static void joinedWorld(ClientPlayerNetworkEvent.LoggingIn event) {
        assert Minecraft.getInstance().player != null;
        Minecraft.getInstance().player.sendSystemMessage(Component.nullToEmpty("test"));
    }
    public void initclient(ModContainer modContainer, IEventBus modBus) {
        modContainer.registerConfig(ModConfig.Type.CLIENT, Client.SPEC, MOD_ID + "-client.toml");
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
        modBus.addListener(GK1HRecipesNeoForge::ConfigLoaded);
        NeoForge.EVENT_BUS.addListener(GK1HRecipesNeoForge::joinedWorld);
    }
}
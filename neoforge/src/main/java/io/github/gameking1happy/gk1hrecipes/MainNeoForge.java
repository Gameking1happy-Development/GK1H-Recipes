package io.github.gameking1happy.gk1hrecipes;

import io.github.gameking1happy.gk1hrecipes.client.NeoForgeClient;
import io.github.gameking1happy.gk1hrecipes.config.ServerConfig;
import io.github.gameking1happy.gk1hrecipes.server.NeoForgeServer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;
import static net.neoforged.fml.loading.FMLEnvironment.dist;

@Mod(MOD_ID)
public class MainNeoForge {

    public MainNeoForge(ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.SERVER, ServerConfig.SPEC, MOD_ID + "-server.toml");
        Main.init();
        if (dist == Dist.CLIENT) {
            NeoForgeClient.initclient(modContainer);
        }
        if (dist == Dist.DEDICATED_SERVER) {
            NeoForgeServer.initserver();
        }
    }

}
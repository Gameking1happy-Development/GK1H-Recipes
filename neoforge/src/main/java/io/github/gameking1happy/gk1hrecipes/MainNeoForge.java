package io.github.gameking1happy.gk1hrecipes;

import io.github.gameking1happy.gk1hrecipes.config.ServerConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

@Mod(MOD_ID)
public class MainNeoForge {
    public MainNeoForge(ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.SERVER, ServerConfig.SPEC);
        Main.init();
    }
}
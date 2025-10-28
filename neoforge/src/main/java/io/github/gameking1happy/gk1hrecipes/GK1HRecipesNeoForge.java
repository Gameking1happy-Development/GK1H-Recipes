package io.github.gameking1happy.gk1hrecipes;

import io.github.gameking1happy.gk1hrecipes.config.*;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

import static io.github.gameking1happy.gk1hrecipes.GK1HRecipes.MOD_ID;
import static net.neoforged.fml.loading.FMLEnvironment.dist;
@Mod(MOD_ID)
public class GK1HRecipesNeoForge {

    public GK1HRecipesNeoForge(ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.SERVER, Server.SPEC, MOD_ID + "-server.toml");
        GK1HRecipes.init();
        if (dist == Dist.CLIENT) {
            initclient(modContainer);
        }
        if (dist == Dist.DEDICATED_SERVER) {
            initserver();
        }
    }

    public void initclient(ModContainer modContainer) {
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
        GK1HRecipes.initclient();
    }

    public void initserver() {
        GK1HRecipes.initserver();
    }
}
package io.github.gameking1happy.gk1hrecipes.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

@Mod(value = MOD_ID, dist = Dist.CLIENT)
public class NeoForgeClient {
    public NeoForgeClient(ModContainer modContainer) {
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
        Client.initclient();
    }
}

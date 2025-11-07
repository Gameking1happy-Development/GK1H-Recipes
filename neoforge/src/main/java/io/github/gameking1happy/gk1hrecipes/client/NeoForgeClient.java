package io.github.gameking1happy.gk1hrecipes.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

@Mod(value = MOD_ID, dist = Dist.CLIENT)
public class NeoForgeClient {
    public NeoForgeClient() {
        Client.initclient();
    }
}

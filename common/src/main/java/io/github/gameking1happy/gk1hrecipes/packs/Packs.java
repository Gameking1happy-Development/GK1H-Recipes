package io.github.gameking1happy.gk1hrecipes.packs;

import static io.github.gameking1happy.gk1hcore.platform.Services.ADDPACKS;
import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;
import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

public class Packs {
    public static void addPACKS(Object modContainerOrEvent) {
        ADDPACKS.addCDP(modContainerOrEvent, MOD_ID, "bundle");
        if (PLATFORM.isModLoaded("metalbundles")) {
            ADDPACKS.addCDP(modContainerOrEvent, MOD_ID, "bundlembcompat");
            }
        ADDPACKS.addCDP(modContainerOrEvent, MOD_ID, "chain");
    }
}

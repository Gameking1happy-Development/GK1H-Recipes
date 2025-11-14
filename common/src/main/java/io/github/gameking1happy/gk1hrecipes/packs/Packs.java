package io.github.gameking1happy.gk1hrecipes.packs;

import io.github.gameking1happy.gk1hcore.packs.addPacks;

import static io.github.gameking1happy.gk1hcore.platform.Services.*;
import static io.github.gameking1happy.gk1hrecipes.Main.*;

public class Packs {
    public static void addPACKS(Object modContainerOrEvent) {
        if (Bundle) {
            addPacks.addCDP(modContainerOrEvent, MOD_ID, "bundle");
            if (PLATFORM.isModLoaded("metalbundles")) {
                addPacks.addCDP(modContainerOrEvent, MOD_ID, "bundlembcompat");
            }
        }
        if (Chain) {
            addPacks.addCDP(modContainerOrEvent, MOD_ID, "chain");
        }
    }
}

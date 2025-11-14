package io.github.gameking1happy.gk1hrecipes.packs;

import io.github.gameking1happy.gk1hcore.packs.AddPacks;

import static io.github.gameking1happy.gk1hcore.packs.AddPackPreset.addCDP;
import static io.github.gameking1happy.gk1hcore.platform.Services.*;
import static io.github.gameking1happy.gk1hrecipes.Main.*;

public class Packs implements AddPacks {
    public void addPacks(Object modContainerOrEvent) {
        if (Bundle) {
            if (!PLATFORM.isModLoaded("metalbundles")) {
                addCDP(modContainerOrEvent, getModID(), "bundle");
            }
            if (PLATFORM.isModLoaded("metalbundles")) {
                addCDP(modContainerOrEvent, getModID(), "bundlembcompat");
            }
        }
        if (Chain) {
            addCDP(modContainerOrEvent, getModID(), "chain");
        }
        if (Gapple) {
            addCDP(modContainerOrEvent, getModID(), "gapple");
        }
        if (HeavyCore) {
            addCDP(modContainerOrEvent, getModID(), "heavycore");
        }
        if (HorseArmorSaddle) {
            addCDP(modContainerOrEvent, getModID(), "horsearmorsaddle");
        }
        if (Lead) {
            addCDP(modContainerOrEvent, getModID(), "lead");
        }
        if (Lodestone) {
            addCDP(modContainerOrEvent, getModID(), "lodestone");
            if (PLATFORM.isModLoaded("advancednetherite")) {
                addCDP(modContainerOrEvent, getModID(), "lodestoneancompat");
            }
        }
        if (Netherite) {
            addCDP(modContainerOrEvent, getModID(), "netherite");
        }
        if (Smithing) {
            if (PLATFORM.isModLoaded("metalbundles")) {
                addCDP(modContainerOrEvent, getModID(), "smithingmbcompat");
            }
            if (PLATFORM.isModLoaded("spikyspikes")) {
                addCDP(modContainerOrEvent, getModID(), "smithingsscompat");
            }
        }
        if (StoneType) {
            addCDP(modContainerOrEvent, getModID(), "stonetype");
        }
        if (Totem) {
            addCDP(modContainerOrEvent, getModID(), "totem");
        }
    }

    @Override
    public String getModID() {
        return MOD_ID;
    }
}

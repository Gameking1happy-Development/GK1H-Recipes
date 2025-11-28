package io.github.gameking1happy.gk1hrecipes.packs;

import io.github.gameking1happy.gk1hcore.packs.AddPacks;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.packs.AddPackPreset.addCDP;
import static io.github.gameking1happy.gk1hcore.compat.CompatFlags.*;
import static io.github.gameking1happy.gk1hrecipes.Main.*;

/**
 * Class to add packs.
 */
@SuppressWarnings("unused")
public class Packs implements AddPacks {
    /**
     * @param modContainerOrEvent ModContainer for Fabric, AddPackFindersEvent for NeoForge.
     */
    public void addPacks(@NotNull Object modContainerOrEvent) {
        if (Bundle) {
            if (!MetBun) {
                addCDP(modContainerOrEvent, getModID(), "bundle");
            }
            if (MetBun) {
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
            if (AdvNet) {
                addCDP(modContainerOrEvent, getModID(), "lodestoneancompat");
            }
        }
        if (Netherite) {
            addCDP(modContainerOrEvent, getModID(), "netherite");
        }
        if (Smithing) {
            if (MetBun) {
                addCDP(modContainerOrEvent, getModID(), "smithingmbcompat");
            }
            if (SpiSpi) {
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

    /**
     * @return Returns the mod ID.
     */
    @Override
    public @NotNull String getModID() {
        return MOD_ID;
    }
}

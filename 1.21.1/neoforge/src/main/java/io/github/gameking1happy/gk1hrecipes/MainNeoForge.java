package io.github.gameking1happy.gk1hrecipes;

import net.neoforged.fml.common.Mod;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

/**
 * NeoForge main class for the mod.
 */
@SuppressWarnings("unused")
@Mod(MOD_ID)
public class MainNeoForge {
    /**
     * Runs the NeoForge mod initializer.
     */
    public MainNeoForge() {
        Main.init();
    }
}
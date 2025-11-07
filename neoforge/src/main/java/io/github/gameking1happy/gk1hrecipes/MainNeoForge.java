package io.github.gameking1happy.gk1hrecipes;

import net.neoforged.fml.common.Mod;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

@Mod(MOD_ID)
public class MainNeoForge {
    public MainNeoForge() {
        Main.init();
    }
}
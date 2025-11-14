package io.github.gameking1happy.gk1hrecipes.data.client;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

public class MyLanguageProvider extends LanguageProvider {
    public MyLanguageProvider(PackOutput output) {
        super(
                // Provided by the GatherDataEvent.
                output,
                // Your mod id.
                MOD_ID,
                // The locale to use. You may use multiple language providers for different locales.
                "en_us"
        );
    }
    @Override
    protected void addTranslations() {
        // Adds a translation with the given key and the given value.
        // add("PLACEHOLDER", "PLACEHOLDER");
        add("gk1hrecipes.server_config", "GK1H Recipes Configuration");
        add("gk1hrecipes.server_config.Bundle", "Bundle Recipe");
        add("gk1hrecipes.server_config.Bundle.desc", "Enable bundle recipe.");
        add("gk1hrecipes.server_config.Chain", "Chain Recipes");
        add("gk1hrecipes.server_config.Chain.desc", "Enable chain and chainmail armor recipes.");
    }
}
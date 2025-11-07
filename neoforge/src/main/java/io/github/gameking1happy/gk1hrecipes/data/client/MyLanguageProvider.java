package io.github.gameking1happy.gk1hrecipes.data.client;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

@SuppressWarnings("CommentedOutCode")
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
        // Translations.
    }
}
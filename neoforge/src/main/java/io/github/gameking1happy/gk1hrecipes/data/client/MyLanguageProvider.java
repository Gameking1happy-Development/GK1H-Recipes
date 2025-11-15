package io.github.gameking1happy.gk1hrecipes.data.client;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

/**
 * Language datagen.
 */
public class MyLanguageProvider extends LanguageProvider {
    /**
     * @param output Pack output.
     */
    public MyLanguageProvider(@NotNull PackOutput output) {
        super(output, MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("gk1hrecipes.server_config", "GK1H Recipes Configuration");
        add("gk1hrecipes.server_config.Bundle", "Bundle Recipe");
        add("gk1hrecipes.server_config.Bundle.desc", "Enable bundle recipe.");
        add("gk1hrecipes.server_config.Chain", "Chain Recipes");
        add("gk1hrecipes.server_config.Chain.desc", "Enable chain and chainmail armor recipes.");
        add("gk1hrecipes.server_config.Gapple", "Enchanted Golden Apple Recipes");
        add("gk1hrecipes.server_config.Gapple.desc", "Enable enchanted golden apple recipes.");
        add("gk1hrecipes.server_config.HeavyCore", "Heavy Core Recipe");
        add("gk1hrecipes.server_config.HeavyCore.desc", "Enable heavy core duplication recipe.");
        add("gk1hrecipes.server_config.HorseArmorSaddle", "Horse Armor & Saddle Recipes");
        add("gk1hrecipes.server_config.HorseArmorSaddle.desc", "Enable horse armor & saddle recipes.");
        add("gk1hrecipes.server_config.Lead", "Lead Recipe");
        add("gk1hrecipes.server_config.Lead.desc", "Enable better lead recipe.");
        add("gk1hrecipes.server_config.Lodestone", "Lodestone Recipe");
        add("gk1hrecipes.server_config.Lodestone.desc", "Enable better lodestone recipe.");
        add("gk1hrecipes.server_config.Netherite", "Netherite Recipe");
        add("gk1hrecipes.server_config.Netherite.desc", "Enable netherite recipe.");
        add("gk1hrecipes.server_config.Smithing", "Smithing Recipes");
        add("gk1hrecipes.server_config.Smithing.desc", "Enable crafting to smithing recipes.");
        add("gk1hrecipes.server_config.StoneType", "Stone Type Recipes");
        add("gk1hrecipes.server_config.StoneType.desc", "Enable netherrack & tuff recipes.");
        add("gk1hrecipes.server_config.Totem", "Totem Recipe");
        add("gk1hrecipes.server_config.Totem.desc", "Enable totem recipes.");
    }
}
package io.github.gameking1happy.gk1hrecipes.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.Main.fNAP;
import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

/**
 * Heavy Core datagen.
 */
public class HeavyCoreRecipeProvider extends RecipeProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     */
    public HeavyCoreRecipeProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    public @NotNull String getName() {
        return super.getName() + "-HeavyCore";
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.HEAVY_CORE, 2)
                .pattern("TOT")
                .pattern("OCO")
                .pattern("TOT")
                .define('C', Items.HEAVY_CORE)
                .define('O', Items.OMINOUS_TRIAL_KEY)
                .define('T', Items.TRIAL_KEY)
                .unlockedBy("has_heavy_core", has(Items.HEAVY_CORE))
                .unlockedBy("has_ominous_trial_key", has(Items.OMINOUS_TRIAL_KEY))
                .unlockedBy("has_trial_key", has(Items.TRIAL_KEY))
                .save(output, fNAP(MOD_ID, "heavy_core"));
    }
}
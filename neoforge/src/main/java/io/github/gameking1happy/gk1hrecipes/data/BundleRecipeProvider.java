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

public class BundleRecipeProvider extends RecipeProvider {
    // Get the parameters from GatherDataEvent.
    public BundleRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Bundle";
    }
    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.BUNDLE)
                .pattern("S")
                .pattern("L")
                .define('S', Items.STRING)
                .define('L', Items.LEATHER)
                .unlockedBy("has_string", has(Items.STRING))
                .unlockedBy("has_leather", has(Items.LEATHER))
                .save(output);
    }
}
package io.github.gameking1happy.gk1hrecipes.data;

import fuzs.metalbundles.init.ModRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.Main.fNAP;

public class BundleMBCompatRecipeProvider extends RecipeProvider {
    // Get the parameters from GatherDataEvent.
    public BundleMBCompatRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-BundleMBCompat";
    }
    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModRegistry.LEATHER_BUNDLE_ITEM.value())
                .pattern("S")
                .pattern("L")
                .define('S', Items.STRING)
                .define('L', Items.LEATHER)
                .unlockedBy("has_string", has(Items.STRING))
                .unlockedBy("has_leather", has(Items.LEATHER))
                .save(output, fNAP("metalbundles", "leather_bundle"));
    }
}
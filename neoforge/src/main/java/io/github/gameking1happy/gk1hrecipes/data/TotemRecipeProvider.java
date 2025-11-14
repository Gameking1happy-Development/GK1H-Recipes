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

public class TotemRecipeProvider extends RecipeProvider {
    // Get the parameters from GatherDataEvent.
    public TotemRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Totem";
    }
    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.TOTEM_OF_UNDYING)
                .pattern("BEB")
                .pattern("ESE")
                .pattern("BEB")
                .define('B', Items.GOLD_BLOCK)
                .define('E', Items.OMINOUS_TRIAL_KEY)
                .define('S', Items.NETHER_STAR)
                .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK))
                .unlockedBy("has_emerald", has(Items.EMERALD))
                .unlockedBy("has_nether_star", has(Items.NETHER_STAR))
                .save(output, fNAP(MOD_ID, "gold_block"));
    }
}
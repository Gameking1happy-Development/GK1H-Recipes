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

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;
import static io.github.gameking1happy.gk1hcore.Main.fNAP;

public class HorseArmorSaddleRecipeProvider extends RecipeProvider {
    // Get the parameters from GatherDataEvent.
    public HorseArmorSaddleRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-HorseArmorSaddle";
    }
    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.SADDLE)
                .pattern("LLL")
                .pattern("S S")
                .pattern("I I")
                .define('S', Items.STRING)
                .define('L', Items.LEATHER)
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_string", has(Items.STRING))
                .unlockedBy("has_leather", has(Items.LEATHER))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(output, fNAP(MOD_ID, "saddle"));
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.LEATHER_HORSE_ARMOR)
                .pattern("  L")
                .pattern("LLL")
                .pattern("L L")
                .define('L', Items.LEATHER)
                .unlockedBy("has_leather", has(Items.LEATHER))
                .save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.GOLDEN_HORSE_ARMOR)
                .pattern("  G")
                .pattern("GGG")
                .pattern("G G")
                .define('G', Items.GOLD_INGOT)
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .save(output, fNAP(MOD_ID, "golden_horse_armor"));
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.IRON_HORSE_ARMOR)
                .pattern("  I")
                .pattern("III")
                .pattern("I I")
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(output, fNAP(MOD_ID, "iron_horse_armor"));
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.DIAMOND_HORSE_ARMOR)
                .pattern("  D")
                .pattern("DDD")
                .pattern("D D")
                .define('D', Items.DIAMOND)
                .unlockedBy("has_diamond", has(Items.DIAMOND))
                .save(output, fNAP(MOD_ID, "diamond_horse_armor"));
    }
}
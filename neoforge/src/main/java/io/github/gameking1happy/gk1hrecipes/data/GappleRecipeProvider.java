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

public class GappleRecipeProvider extends RecipeProvider {
    // Get the parameters from GatherDataEvent.
    public GappleRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Gapple";
    }
    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .group("enchanted_golden_apple")
                .define('B', Items.GOLD_BLOCK)
                .define('A', Items.APPLE)
                .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK))
                .save(output,fNAP(MOD_ID,"enchanted_golden_apple"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("IBB")
                .pattern("BAB")
                .pattern("BBB")
                .group("enchanted_golden_apple")
                .define('B', Items.GOLD_BLOCK)
                .define('I', Items.GOLD_INGOT)
                .define('A', Items.GOLDEN_APPLE)
                .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .unlockedBy("has_golden_apple", has(Items.GOLDEN_APPLE))
                .save(output,fNAP(MOD_ID,"golden_apple_enchant_1"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("BIB")
                .pattern("BAB")
                .pattern("BBB")
                .group("enchanted_golden_apple")
                .define('B', Items.GOLD_BLOCK)
                .define('I', Items.GOLD_INGOT)
                .define('A', Items.GOLDEN_APPLE)
                .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .unlockedBy("has_golden_apple", has(Items.GOLDEN_APPLE))
                .save(output,fNAP(MOD_ID,"golden_apple_enchant_2"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("BBI")
                .pattern("BAB")
                .pattern("BBB")
                .group("enchanted_golden_apple")
                .define('B', Items.GOLD_BLOCK)
                .define('I', Items.GOLD_INGOT)
                .define('A', Items.GOLDEN_APPLE)
                .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .unlockedBy("has_golden_apple", has(Items.GOLDEN_APPLE))
                .save(output,fNAP(MOD_ID,"golden_apple_enchant_3"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("BBB")
                .pattern("IAB")
                .pattern("BBB")
                .group("enchanted_golden_apple")
                .define('B', Items.GOLD_BLOCK)
                .define('I', Items.GOLD_INGOT)
                .define('A', Items.GOLDEN_APPLE)
                .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .unlockedBy("has_golden_apple", has(Items.GOLDEN_APPLE))
                .save(output,fNAP(MOD_ID,"golden_apple_enchant_4"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("BBB")
                .pattern("BAI")
                .pattern("BBB")
                .group("enchanted_golden_apple")
                .define('B', Items.GOLD_BLOCK)
                .define('I', Items.GOLD_INGOT)
                .define('A', Items.GOLDEN_APPLE)
                .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .unlockedBy("has_golden_apple", has(Items.GOLDEN_APPLE))
                .save(output,fNAP(MOD_ID,"golden_apple_enchant_5"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("IBB")
                .group("enchanted_golden_apple")
                .define('B', Items.GOLD_BLOCK)
                .define('I', Items.GOLD_INGOT)
                .define('A', Items.GOLDEN_APPLE)
                .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .unlockedBy("has_golden_apple", has(Items.GOLDEN_APPLE))
                .save(output,fNAP(MOD_ID,"golden_apple_enchant_6"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BIB")
                .group("enchanted_golden_apple")
                .define('B', Items.GOLD_BLOCK)
                .define('I', Items.GOLD_INGOT)
                .define('A', Items.GOLDEN_APPLE)
                .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .unlockedBy("has_golden_apple", has(Items.GOLDEN_APPLE))
                .save(output,fNAP(MOD_ID,"golden_apple_enchant_7"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBI")
                .group("enchanted_golden_apple")
                .define('B', Items.GOLD_BLOCK)
                .define('I', Items.GOLD_INGOT)
                .define('A', Items.GOLDEN_APPLE)
                .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .unlockedBy("has_golden_apple", has(Items.GOLDEN_APPLE))
                .save(output,fNAP(MOD_ID,"golden_apple_enchant_8"));
    }
}
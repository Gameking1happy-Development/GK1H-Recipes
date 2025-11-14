package io.github.gameking1happy.gk1hrecipes.data;

import fuzs.metalbundles.init.ModRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.Main.fNAP;

public class SmithingMBCompatRecipeProvider extends RecipeProvider {
    // Get the parameters from GatherDataEvent.
    public SmithingMBCompatRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-SmithingMBCompat";
    }
    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(ModRegistry.DIAMOND_BUNDLE_ITEM.value()), Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.TOOLS, ModRegistry.NETHERITE_BUNDLE_ITEM.value())
                .unlocks("has_diamond_bundle",has(ModRegistry.DIAMOND_BUNDLE_ITEM.value()))
                .unlocks("has_netherite_ingot",has(Items.NETHERITE_INGOT))
                .unlocks("has_netherite_upgrade_smithing_template",has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .save(output, fNAP("metalbundles", "netherite_bundle"));
    }
}
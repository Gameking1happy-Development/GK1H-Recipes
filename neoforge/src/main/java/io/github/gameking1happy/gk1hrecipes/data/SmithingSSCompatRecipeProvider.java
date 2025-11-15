package io.github.gameking1happy.gk1hrecipes.data;

import fuzs.spikyspikes.init.ModRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.Main.fNAP;

/**
 * Smithing Spiky Spikes Compat datagen.
 */
public class SmithingSSCompatRecipeProvider extends RecipeProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     */
    public SmithingSSCompatRecipeProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    public @NotNull String getName() {
        return super.getName() + "-SmithingSSCompat";
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(ModRegistry.DIAMOND_SPIKE_ITEM.value()), Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.TOOLS, ModRegistry.NETHERITE_SPIKE_ITEM.value())
                .unlocks("has_diamond_spike", has(ModRegistry.DIAMOND_SPIKE_ITEM.value()))
                .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .unlocks("has_netherite_upgrade_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .save(output, fNAP("spikyspikes", "netherite_spike"));
    }
}
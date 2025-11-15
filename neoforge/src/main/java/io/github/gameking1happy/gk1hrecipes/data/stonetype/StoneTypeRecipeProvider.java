package io.github.gameking1happy.gk1hrecipes.data.stonetype;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.Main.fNAP;
import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

/**
 * Tuff &amp; Netherrack datagen.
 */
public class StoneTypeRecipeProvider extends RecipeProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     */
    public StoneTypeRecipeProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    public @NotNull String getName() {
        return super.getName() + "-StoneType";
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Items.TUFF, 2)
                .requires(Items.STONE)
                .requires(Items.COBBLESTONE)
                .requires(Items.QUARTZ)
                .unlockedBy("has_stone", has(Items.STONE))
                .unlockedBy("has_cobblestone", has(Items.COBBLESTONE))
                .unlockedBy("has_quartz", has(Items.QUARTZ))
                .save(output, fNAP(MOD_ID, "tuff"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.BLACKSTONE), RecipeCategory.BUILDING_BLOCKS, Items.NETHERRACK, 0.1F, 200)
                .unlockedBy("has_blackstone", has(Items.BLACKSTONE))
                .save(output, fNAP(MOD_ID, "netherrack"));
    }
}
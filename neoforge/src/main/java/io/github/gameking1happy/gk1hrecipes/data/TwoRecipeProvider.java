package io.github.gameking1happy.gk1hrecipes.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

public class TwoRecipeProvider extends RecipeProvider {
    // Get the parameters from GatherDataEvent.
    public TwoRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Two";
    }
    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        // We use a builder pattern, therefore no variable is created. Create a new builder by calling
        // ShapedRecipeBuilder#shaped with the recipe category (found in the RecipeCategory enum)
        // and a result item, a result item and count, or a result item stack.
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.GOLD_INGOT, 2)
                // Create the lines of your pattern. Each call to #pattern adds a new line.
                // Patterns will be validated, i.e. their shape will be checked.
                .pattern(" X ")
                .pattern("XXX")
                .pattern(" X ")
                // Create the keys for the pattern. All non-space characters used in the pattern must be defined.
                // This can either accept Ingredients, TagKey<Item>s or ItemLikes, i.e. items or blocks.
                .define('X', Ingredient.of(Items.STONE, Items.COBBLESTONE))
                // Creates the recipe advancement. While not mandated by the consuming background systems,
                // the recipe builder will crash if you omit this. The first parameter is the advancement name,
                // and the second one is the condition. Normally, you want to use the has() shortcut for the condition.
                // Multiple advancement requirements can be added by calling #unlockedBy multiple times.
                .unlockedBy("has_stone", has(Items.STONE))
                .unlockedBy("has_cobblestone", has(Items.COBBLESTONE))
                // Stores the recipe in the passed RecipeOutput, to be written to disk.
                // If you want to add conditions to the recipe, those can be set on the output.
                .save(output, ResourceLocation.fromNamespaceAndPath(MOD_ID, "test2"));
    }
}
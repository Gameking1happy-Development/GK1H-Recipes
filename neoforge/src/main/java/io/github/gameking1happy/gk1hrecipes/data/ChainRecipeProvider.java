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
 * Chain datagen.
 */
public class ChainRecipeProvider extends RecipeProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     */
    public ChainRecipeProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    public @NotNull String getName() {
        return super.getName() + "-Chain";
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAIN, 4)
                .pattern("N")
                .pattern("I")
                .pattern("N")
                .define('N', Items.IRON_NUGGET)
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.CHAINMAIL_HELMET)
                .pattern("XXX")
                .pattern("X X")
                .define('X', Items.CHAIN)
                .unlockedBy("has_chain", has(Items.CHAIN))
                .save(output, fNAP(MOD_ID, "chainmail_helmet"));
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.CHAINMAIL_CHESTPLATE)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', Items.CHAIN)
                .unlockedBy("has_chain", has(Items.CHAIN))
                .save(output, fNAP(MOD_ID, "chainmail_chestplate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.CHAINMAIL_LEGGINGS)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.CHAIN)
                .unlockedBy("has_chain", has(Items.CHAIN))
                .save(output, fNAP(MOD_ID, "chainmail_leggings"));
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.CHAINMAIL_BOOTS)
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.CHAIN)
                .unlockedBy("has_chain", has(Items.CHAIN))
                .save(output, fNAP(MOD_ID, "chainmail_boots"));
    }
}
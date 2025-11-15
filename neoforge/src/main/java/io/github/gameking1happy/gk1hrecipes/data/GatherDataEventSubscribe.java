package io.github.gameking1happy.gk1hrecipes.data;

import io.github.gameking1happy.gk1hrecipes.data.client.MyLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

/**
 * GatherDataEventSubscribe class for datagen.
 */
@EventBusSubscriber(modid = MOD_ID)
public class GatherDataEventSubscribe {
    /**
     * @param event GatherDataEvent.
     */
    @SubscribeEvent
    public static void gatherData(@NotNull GatherDataEvent event) {
        @NotNull DataGenerator generator = event.getGenerator();
        @NotNull PackOutput output = generator.getPackOutput();
        @NotNull PackOutput BundleOutput = generator.getPackOutput("bundle");
        @NotNull PackOutput BundleMBCompatOutput = generator.getPackOutput("bundlembcompat");
        @NotNull PackOutput ChainOutput = generator.getPackOutput("chain");
        @NotNull PackOutput GappleOutput = generator.getPackOutput("gapple");
        @NotNull PackOutput HeavyCoreOutput = generator.getPackOutput("heavycore");
        @NotNull PackOutput HorseArmorSaddleOutput = generator.getPackOutput("horsearmorsaddle");
        @NotNull PackOutput LeadOutput = generator.getPackOutput("lead");
        @NotNull PackOutput LodestoneOutput = generator.getPackOutput("lodestone");
        @NotNull PackOutput NetheriteOutput = generator.getPackOutput("netherite");
        @NotNull PackOutput SmithingMBCompatOutput = generator.getPackOutput("smithingmbcompat");
        @NotNull PackOutput SmithingSSCompatOutput = generator.getPackOutput("smithingsscompat");
        @NotNull PackOutput StoneTypeOutput = generator.getPackOutput("stonetype");
        @NotNull PackOutput TotemOutput = generator.getPackOutput("totem");
        @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        generator.addProvider(event.includeClient(), new MyLanguageProvider(output));
        generator.addProvider(event.includeServer(), new BundleRecipeProvider(BundleOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new BundleMBCompatRecipeProvider(BundleMBCompatOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ChainRecipeProvider(ChainOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new GappleRecipeProvider(GappleOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new HeavyCoreRecipeProvider(HeavyCoreOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new HorseArmorSaddleRecipeProvider(HorseArmorSaddleOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new LeadRecipeProvider(LeadOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new LodestoneRecipeProvider(LodestoneOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new NetheriteRecipeProvider(NetheriteOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new SmithingMBCompatRecipeProvider(SmithingMBCompatOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new SmithingSSCompatRecipeProvider(SmithingSSCompatOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new StoneTypeRecipeProvider(StoneTypeOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new TotemRecipeProvider(TotemOutput, lookupProvider));
    }
}
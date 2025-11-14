package io.github.gameking1happy.gk1hrecipes.data;

import io.github.gameking1happy.gk1hrecipes.data.client.MyLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

@EventBusSubscriber(modid = MOD_ID)
public class GatherDataEventSubscribe {
    @SubscribeEvent // on the mod event bus
    public static void gatherData(GatherDataEvent event) {
        // Data generators may require some of these as constructor parameters.
        // See below for more details on each of these.
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        PackOutput BundleOutput = generator.getPackOutput("bundle");
        PackOutput BundleMBCompatOutput = generator.getPackOutput("bundlembcompat");
        PackOutput ChainOutput = generator.getPackOutput("chain");
        PackOutput GappleOutput = generator.getPackOutput("gapple");
        PackOutput HeavyCoreOutput = generator.getPackOutput("heavycore");
        PackOutput HorseArmorSaddleOutput = generator.getPackOutput("horsearmorsaddle");
        PackOutput LeadOutput = generator.getPackOutput("lead");
        PackOutput LodestoneOutput = generator.getPackOutput("lodestone");
        PackOutput NetheriteOutput = generator.getPackOutput("netherite");
        PackOutput SmithingMBCompatOutput = generator.getPackOutput("smithingmbcompat");
        PackOutput SmithingSSCompatOutput = generator.getPackOutput("smithingsscompat");
        PackOutput StoneTypeOutput = generator.getPackOutput("stonetype");
        PackOutput TotemOutput = generator.getPackOutput("totem");
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        // Register the provider.
        generator.addProvider(
                event.includeClient(),
                new MyLanguageProvider(output)
        );
        generator.addProvider(
                // A boolean that determines whether the data should actually be generated.
                // The event provides methods that determine this:
                // event.includeClient(), event.includeServer(),
                // event.includeDev() and event.includeReports().
                // Since recipes are server data, we only run them in a server datagen.
                event.includeServer(),
                // Our provider.
                new BundleRecipeProvider(BundleOutput, lookupProvider)
        );
        generator.addProvider(
                event.includeServer(),
                new BundleMBCompatRecipeProvider(BundleMBCompatOutput, lookupProvider)
        );
        generator.addProvider(
                event.includeServer(),
                new ChainRecipeProvider(ChainOutput, lookupProvider)
        );
        generator.addProvider(
                event.includeServer(),
                new GappleRecipeProvider(GappleOutput, lookupProvider)
        );
        generator.addProvider(
                event.includeServer(),
                new HeavyCoreRecipeProvider(HeavyCoreOutput, lookupProvider)
        );
        generator.addProvider(
                event.includeServer(),
                new HorseArmorSaddleRecipeProvider(HorseArmorSaddleOutput, lookupProvider)
        );
        generator.addProvider(
                event.includeServer(),
                new LeadRecipeProvider(LeadOutput, lookupProvider)
        );
        generator.addProvider(
                event.includeServer(),
                new LodestoneRecipeProvider(LodestoneOutput, lookupProvider)
        );
        generator.addProvider(
                event.includeServer(),
                new NetheriteRecipeProvider(NetheriteOutput, lookupProvider)
        );
        generator.addProvider(
                event.includeServer(),
                new SmithingMBCompatRecipeProvider(SmithingMBCompatOutput, lookupProvider)
        );
        generator.addProvider(
                event.includeServer(),
                new SmithingSSCompatRecipeProvider(SmithingSSCompatOutput, lookupProvider)
        );
        generator.addProvider(
                event.includeServer(),
                new StoneTypeRecipeProvider(StoneTypeOutput, lookupProvider)
        );
        generator.addProvider(
                event.includeServer(),
                new TotemRecipeProvider(TotemOutput, lookupProvider)
        );
    }
}
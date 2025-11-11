package io.github.gameking1happy.gk1hrecipes.datapacks;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.AddPackFindersEvent;

import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

public class ModDatapacks {
    @SubscribeEvent
    public static void registerDatapacks(AddPackFindersEvent event) {
        test(event);
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(MOD_ID,"test2"),
                PackType.SERVER_DATA,
                Component.literal("Test 2"),
                PackSource.BUILT_IN,
                true,
                Pack.Position.TOP
        );
    }
    @SuppressWarnings("UnusedReturnValue")
    private static boolean test(AddPackFindersEvent event) {
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(MOD_ID,"test1"),
                PackType.SERVER_DATA,
                Component.literal("Test 1"),
                PackSource.BUILT_IN,
                true,
                Pack.Position.TOP
        );
        return true;
    }
}

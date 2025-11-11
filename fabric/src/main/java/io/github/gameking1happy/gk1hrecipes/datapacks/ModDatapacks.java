package io.github.gameking1happy.gk1hrecipes.datapacks;

import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.fabric.impl.resource.loader.ResourceManagerHelperImpl;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

@SuppressWarnings("UnstableApiUsage")
public class ModDatapacks {
    public void init() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(this::test);
    }
    private void test(ModContainer modContainer) {
        ResourceLocation id1 = ResourceLocation.fromNamespaceAndPath(MOD_ID, "test1");
        ResourceLocation id2 = ResourceLocation.fromNamespaceAndPath(MOD_ID, "test2");
        ResourceManagerHelperImpl.registerBuiltinResourcePack(
                id1,
                id1.getPath(),
                modContainer,
                Component.literal("Test 1"),
                ResourcePackActivationType.ALWAYS_ENABLED
        );
        ResourceManagerHelperImpl.registerBuiltinResourcePack(
                id2,
                id2.getPath(),
                modContainer,
                Component.literal("Test 2"),
                ResourcePackActivationType.ALWAYS_ENABLED
        );
    }
}

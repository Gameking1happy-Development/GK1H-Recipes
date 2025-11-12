package io.github.gameking1happy.gk1hrecipes.mixin;

import io.github.gameking1happy.gk1hcore.packs.addPacks;
import io.github.gameking1happy.gk1hrecipes.packs.Packs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;
import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

@Mixin(addPacks.class)
public interface addPacksMixin {
    @Inject(
            method = "addpacks",
            at = @At("TAIL")
    )
    default void addpacks(Object modContainerOrEvent, String modID, CallbackInfo ci) {
        if (PLATFORM.getPlatformName().equals("NeoForge") || modID.equals(MOD_ID)) {
            Packs.addPACKS(modContainerOrEvent);
        }
    }
}

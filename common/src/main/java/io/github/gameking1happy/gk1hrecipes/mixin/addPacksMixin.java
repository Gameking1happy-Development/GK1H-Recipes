package io.github.gameking1happy.gk1hrecipes.mixin;

import io.github.gameking1happy.gk1hcore.packs.addPacks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static io.github.gameking1happy.gk1hcore.platform.Services.ADDPACKS;
import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;

@Mixin(addPacks.class)
public interface addPacksMixin {
    @Inject(
            method = "addpacks",
            at = @At("TAIL")
    )
    default void addpacks(Object modContainerOrEvent, CallbackInfo ci) {
        ADDPACKS.addCDP(modContainerOrEvent, MOD_ID, "test1");
        ADDPACKS.addCDP(modContainerOrEvent, MOD_ID, "test2");
    }
}

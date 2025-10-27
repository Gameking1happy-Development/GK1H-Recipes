package io.github.gameking1happy.gk1hrecipes.mixin;

import io.github.gameking1happy.gk1hrecipes.GK1HRecipes;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MixinMinecraft {
    
    @Inject(at = @At("TAIL"), method = "<init>")
    private void init(CallbackInfo info) {
        // Logs the Minecraft version type.
        GK1HRecipes.LOG.info("MC Version: {}", Minecraft.getInstance().getVersionType());
    }
}
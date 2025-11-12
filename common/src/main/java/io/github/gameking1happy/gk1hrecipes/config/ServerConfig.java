package io.github.gameking1happy.gk1hrecipes.config;

import net.neoforged.neoforge.common.ModConfigSpec;

import static io.github.gameking1happy.gk1hcore.config.ConfigMaker.makeConfig;
import static net.neoforged.neoforge.common.ModConfigSpec.*;

public class ServerConfig {
    // Server-side configuration options.
    public static final Builder BUILDER = new Builder();
    public static final BooleanValue Bundle = makeConfig(BUILDER.worldRestart(), "bundle", true, "Enable bundle recipe.", null);
    public static final BooleanValue Chain = makeConfig(BUILDER.worldRestart(), "chain", true, "Enable chain and chainmail armor recipes.", null);
    public static final ModConfigSpec SPEC = BUILDER.build();
}
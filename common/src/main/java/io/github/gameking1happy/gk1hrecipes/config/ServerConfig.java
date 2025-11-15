package io.github.gameking1happy.gk1hrecipes.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.RequiresAction;
import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.validation.misc.ValidatedBoolean;

import static io.github.gameking1happy.gk1hcore.Main.fNAP;
import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;
import static me.fzzyhmstrs.fzzy_config.annotations.Action.RESTART;

/**
 * The server configuration for the mod.
 */
@SuppressWarnings("CanBeFinal")
@RequiresAction(action = RESTART)
public class ServerConfig extends Config {
    /**
     * Bundle recipe configuration value.
     */
    @Comment("Enable bundle recipe.")
    public ValidatedBoolean Bundle = new ValidatedBoolean(true);
    /**
     * Chain and chainmail armor recipes configuration value.
     */
    @Comment("Enable chain and chainmail armor recipes.")
    public ValidatedBoolean Chain = new ValidatedBoolean(true);
    /**
     * Enchanted golden apple recipes configuration value.
     */
    @Comment("Enable enchanted golden apple recipes.")
    public ValidatedBoolean Gapple = new ValidatedBoolean(true);
    /**
     * Heavy core duplication recipe configuration value.
     */
    @Comment("Enable heavy core duplication recipe.")
    public ValidatedBoolean HeavyCore = new ValidatedBoolean(true);
    /**
     * Horse armor & saddle recipes configuration value.
     */
    @Comment("Enable horse armor & saddle recipes.")
    public ValidatedBoolean HorseArmorSaddle = new ValidatedBoolean(true);
    /**
     * Better lead recipe configuration value.
     */
    @Comment("Enable better lead recipe.")
    public ValidatedBoolean Lead = new ValidatedBoolean(true);
    /**
     * Better lodestone recipe configuration value.
     */
    @Comment("Enable better lodestone recipe.")
    public ValidatedBoolean Lodestone = new ValidatedBoolean(true);
    /**
     * Netherite recipe configuration value.
     */
    @Comment("Enable netherite recipe.")
    public ValidatedBoolean Netherite = new ValidatedBoolean(true);
    /**
     * Crafting to smithing recipes configuration value.
     */
    @Comment("Enable crafting to smithing recipes.")
    public ValidatedBoolean Smithing = new ValidatedBoolean(true);
    /**
     * Netherrack & tuff recipes configuration value.
     */
    @Comment("Enable netherrack & tuff recipes.")
    public ValidatedBoolean StoneType = new ValidatedBoolean(true);
    /**
     * Totem recipes configuration value.
     */
    @Comment("Enable totem recipes.")
    public ValidatedBoolean Totem = new ValidatedBoolean(true);

    /**
     * The constructor method.
     */
    public ServerConfig() {
        super(fNAP(MOD_ID, "server_config"));
    }
}
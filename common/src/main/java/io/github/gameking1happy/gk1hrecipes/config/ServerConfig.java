package io.github.gameking1happy.gk1hrecipes.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.RequiresAction;
import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.validation.misc.ValidatedBoolean;

import static me.fzzyhmstrs.fzzy_config.annotations.Action.*;
import static io.github.gameking1happy.gk1hrecipes.Main.MOD_ID;
import static io.github.gameking1happy.gk1hcore.Main.fNAP;

@RequiresAction(action = RESTART)
public class ServerConfig extends Config {
    public ServerConfig() {
        super(fNAP(MOD_ID, "server_config"));
    }
    @Comment("Enable bundle recipe.")
    public ValidatedBoolean Bundle = new ValidatedBoolean(true);
    @Comment("Enable chain and chainmail armor recipes.")
    public ValidatedBoolean Chain = new ValidatedBoolean(true);
    @Comment("Enable enchanted golden apple recipes.")
    public ValidatedBoolean Gapple = new ValidatedBoolean(true);
    @Comment("Enable heavy core duplication recipe.")
    public ValidatedBoolean HeavyCore = new ValidatedBoolean(true);
    @Comment("Enable horse armor & saddle recipes.")
    public ValidatedBoolean HorseArmorSaddle = new ValidatedBoolean(true);
    @Comment("Enable better lead recipe.")
    public ValidatedBoolean Lead = new ValidatedBoolean(true);
    @Comment("Enable better lodestone recipe.")
    public ValidatedBoolean Lodestone = new ValidatedBoolean(true);
    @Comment("Enable netherite recipe.")
    public ValidatedBoolean Netherite = new ValidatedBoolean(true);
    @Comment("Enable crafting to smithing recipes.")
    public ValidatedBoolean Smithing = new ValidatedBoolean(true);
    @Comment("Enable netherrack & tuff recipes.")
    public ValidatedBoolean StoneType = new ValidatedBoolean(true);
    @Comment("Enable totem recipes.")
    public ValidatedBoolean Totem = new ValidatedBoolean(true);
}
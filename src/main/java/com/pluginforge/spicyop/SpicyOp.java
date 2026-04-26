package com.pluginforge.spicyop;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpicyOp extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SpicyOp v1.0 enabled.");
        getCommand("ops").setExecutor(new OpsCommand());

    }

    @Override
    public void onDisable() {
        getLogger().info("SpicyOp disabled.");
    }
}

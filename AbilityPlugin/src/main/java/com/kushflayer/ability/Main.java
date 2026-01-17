package com.kushflayer.ability;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("AbilityPlugin enabled!");
        this.getCommand("ability").setExecutor(new AbilityCommand(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("AbilityPlugin disabled!");
    }
}


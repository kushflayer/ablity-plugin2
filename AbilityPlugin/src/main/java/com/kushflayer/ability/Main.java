package com.kushflayer.ability;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("ability").setExecutor(new AbilityCommand(this));
    }

    @Override
    public void onDisable() {
    }
}

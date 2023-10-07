package org.darkshadow.someplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SomePluginplugin extends JavaPlugin {

    CustomInventory customInventory;

    //-----settings------
    public static boolean togglebuild = true;
    public static boolean togglefly = false;
    public static boolean togglefreeze = false;

    @Override
    public void onEnable() {

        this.getServer().getPluginManager().registerEvents(new plugin_listener(), this);

        customInventory = new CustomInventory();

        this.getCommand("togglebuild").setExecutor(new togglebuildCommand());
        this.getCommand("togglefly").setExecutor(new toggleflyCommand());
        this.getCommand("togglefreeze").setExecutor(new togglefreezeCommand());
        this.getCommand("fly").setExecutor(new flyCommand());
        this.getCommand("heal").setExecutor(new healCommand());
        this.getCommand("settings").setExecutor(new settingsCommand());

    }

    @Override
    public void onDisable() {

    }
}

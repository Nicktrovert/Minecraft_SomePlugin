package org.darkshadow.someplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SomePluginplugin extends JavaPlugin {


    //-----settings------
    public static boolean togglebuild = true;
    public static boolean togglefly = false;
    public static boolean togglefreeze = false;

    @Override
    public void onEnable() {

        this.getServer().getPluginManager().registerEvents(new plugin_listener(), this);

        new SettingsMenuInventory();

        this.getCommand("togglebuild").setExecutor(new togglebuildCommand());
        this.getCommand("togglefly").setExecutor(new toggleflyCommand());
        this.getCommand("togglefreeze").setExecutor(new togglefreezeCommand());
        this.getCommand("fly").setExecutor(new flyCommand());
        this.getCommand("heal").setExecutor(new healCommand());
        this.getCommand("settings").setExecutor(new settingsCommand());

        Bukkit.getServer().broadcastMessage("§aSomePlugin Started \n §6 Made by Nick Helmers");

    }

    @Override
    public void onDisable() {
        Bukkit.getServer().broadcastMessage("§cSomePlugin Disabled \n §6Made by Nick Helmers");
    }
}

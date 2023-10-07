package org.darkshadow.someplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class togglebuildCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        SomePluginplugin.togglebuild = !SomePluginplugin.togglebuild;
        SomePluginplugin.config.set("togglebuild", SomePluginplugin.togglebuild);
        commandSender.sendMessage("building = " + SomePluginplugin.togglebuild);
        return false;
    }
}

package org.darkshadow.someplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class togglebuildCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        SomePlugin.togglebuild = !SomePlugin.togglebuild;
        SomePlugin.config.set("togglebuild", SomePlugin.togglebuild);
        commandSender.sendMessage("building = " + SomePlugin.togglebuild);
        return false;
    }
}

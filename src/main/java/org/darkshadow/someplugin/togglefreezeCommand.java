package org.darkshadow.someplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class togglefreezeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        SomePluginplugin.togglefreeze = !SomePluginplugin.togglefreeze;
        SomePluginplugin.config.set("togglefreeze", SomePluginplugin.togglefreeze);
        commandSender.sendMessage("freeze = " + SomePluginplugin.togglefreeze);
        if (SomePluginplugin.togglefreeze){
            commandSender.getServer().broadcastMessage("Everyone was frozen");
        } else{
            commandSender.getServer().broadcastMessage("Everyone was unfrozen");
        }
        return false;
    }
}

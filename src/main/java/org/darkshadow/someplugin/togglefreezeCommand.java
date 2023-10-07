package org.darkshadow.someplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class togglefreezeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        SomePlugin.togglefreeze = !SomePlugin.togglefreeze;
        SomePlugin.config.set("togglefreeze", SomePlugin.togglefreeze);
        commandSender.sendMessage("freeze = " + SomePlugin.togglefreeze);
        if (SomePlugin.togglefreeze){
            commandSender.getServer().broadcastMessage("Everyone was frozen");
        } else{
            commandSender.getServer().broadcastMessage("Everyone was unfrozen");
        }
        return false;
    }
}

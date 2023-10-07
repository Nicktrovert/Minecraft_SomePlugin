package org.darkshadow.someplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class healCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(commandSender instanceof Player){
            ((Player) commandSender).setHealth(20);
            ((Player) commandSender).setFoodLevel(20);
            ((Player) commandSender).setSaturation(20);
        }
        return false;
    }
}

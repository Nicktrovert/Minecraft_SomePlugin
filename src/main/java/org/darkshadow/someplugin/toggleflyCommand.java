package org.darkshadow.someplugin;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class toggleflyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        SomePluginplugin.togglefly = !SomePluginplugin.togglefly;
        commandSender.sendMessage("flying = " + SomePluginplugin.togglefly);
        if (!SomePluginplugin.togglefly){
            for (Player player : commandSender.getServer().getOnlinePlayers()){
                if(player.getGameMode().equals(GameMode.CREATIVE)){
                    continue;
                }
                player.setFlying(false);
            }
        }
        return false;
    }
}

package org.darkshadow.someplugin;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public record plugin_listener() implements Listener {

    @EventHandler
    public void OnPlayerBlockBreak(BlockBreakEvent event){
        if (SomePluginplugin.togglefreeze){
            event.setCancelled(true);
            return;
        }
        if (SomePluginplugin.togglebuild){
            return;
        } else{
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){
        Player player = (Player) e.getWhoClicked();
        ItemStack clickedItem = e.getCurrentItem();
        Inventory clickedInventory = e.getClickedInventory();
        if (clickedInventory.equals(CustomInventory.customInventory)){
            e.setCancelled(true);
            if (clickedItem.getType() == Material.ICE) {
                player.getServer().dispatchCommand(player, "togglefreeze");
                try{
                    Thread.sleep(500);
                } catch (InterruptedException ex) {

                }
                player.closeInventory();
            }
            if (clickedItem.getType() == Material.FEATHER){
                player.getServer().dispatchCommand(player, "togglefly");
                try{
                    Thread.sleep(500);
                } catch (InterruptedException ex) {

                }
                player.closeInventory();
            }
            if (clickedItem.getType() == Material.BRICK){
                player.getServer().dispatchCommand(player, "togglebuild");
                try{
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                }
                player.closeInventory();
            }
        }
        if (e.getInventory().equals(CustomInventory.customInventory)){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void OnEntityDamage(EntityDamageEvent event){
        if (SomePluginplugin.togglefreeze){
            event.setCancelled(true);
            return;
        }
    }

    @EventHandler
    public void OnPlayerBlockPlace(BlockPlaceEvent event) {
        if (SomePluginplugin.togglefreeze){
            event.setCancelled(true);
            return;
        }
        if (SomePluginplugin.togglebuild) {
            return;
        } else {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void OnPlayerMove(PlayerMoveEvent event){
        if (SomePluginplugin.togglefreeze){
            event.setCancelled(true);
            return;
        }
    }

    @EventHandler
    public void OnPlayerJump(PlayerJumpEvent event){
        if (SomePluginplugin.togglefreeze){
            event.setCancelled(true);
            return;
        }
        if(event.getPlayer().getGameMode().equals(GameMode.CREATIVE)){
            return;
        }
        if (SomePluginplugin.togglefly) {
            event.getPlayer().setAllowFlight(true);
        } else {
            event.getPlayer().setAllowFlight(false);
        }
    }

}

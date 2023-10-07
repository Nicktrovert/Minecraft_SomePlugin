package org.darkshadow.someplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CustomInventory {
    public static Inventory customInventory = Bukkit.createInventory(null, 27, "§eMy Custom Inventory");
    static {
        customInventory.setItem(9, new ItemStack(Material.ICE, 1));
        customInventory.setItem(13, new ItemStack(Material.FEATHER, 1));
        customInventory.setItem(17, new ItemStack(Material.BRICK, 1));
    }
}

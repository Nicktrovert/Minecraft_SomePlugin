package org.darkshadow.someplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SettingsMenuInventory {
    public static Inventory SettingsMenuInventory = Bukkit.createInventory(null, 27, "§eSettings Menu");
    static {
        SettingsMenuInventory.setItem(9, CreateItem(Material.ICE, "§bToggle Freeze", 1 ,0));
        SettingsMenuInventory.setItem(13, CreateItem(Material.FEATHER, "§fToggle Fly", 1, 0));
        SettingsMenuInventory.setItem(17, CreateItem(Material.BRICKS, "§4Toggle Build", 1, 0));
    }

    public static ItemStack CreateItem(Material material, String name, int amount , int custommodeldata){
        ItemStack itemStack = new ItemStack(material, amount);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(name);
        itemMeta.addItemFlags(ItemFlag.HIDE_ITEM_SPECIFICS, ItemFlag.HIDE_ATTRIBUTES);
        itemMeta.setCustomModelData(custommodeldata);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}

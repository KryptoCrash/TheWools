package ml.thewools.thewools.Items.MiscCraftables;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftableSaddle extends Armor implements Listener {
    public ItemStack item;
    public CraftableSaddle() {
        this.item = new ItemStack(Material.SADDLE);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(this.generateLore(ChatColor.BLACK + "Crafted Saddle", 0, 0));
        meta.setDisplayName(ChatColor.BLACK + "Crafted Saddle");
        item.setItemMeta(meta);
    }
}

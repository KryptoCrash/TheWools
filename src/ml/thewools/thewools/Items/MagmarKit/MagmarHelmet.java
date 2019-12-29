package ml.thewools.thewools.Items.MagmarKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class MagmarHelmet extends Armor implements Listener {
    public ItemStack item;
    public MagmarHelmet() {
        this.item = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(this.generateLore(ChatColor.BLACK + "Magmar Helmet", 30, 0));
        meta.setDisplayName(ChatColor.BLACK + "Magmar Helmet");
        item.setItemMeta(meta);
    }
}

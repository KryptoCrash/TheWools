package ml.thewools.thewools.Items.EnderKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class EnderHelmet extends Armor implements Listener {
    public ItemStack item;
    public EnderHelmet() {
        this.item = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(item, this.generateLore(ChatColor.PURPLE + "Ender Helmet", 30, 0, 0));
        meta.setDisplayName(ChatColor.PURPLE + "Ender Helmet");
        item.setItemMeta(meta);
    }
}

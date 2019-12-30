package ml.thewools.thewools.Items.BlazeKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class BlazeHelmet extends Armor implements Listener {
    public ItemStack item;
    public BlazeHelmet() {
        this.item = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(this.generateLore(item,ChatColor.GREEN + "Blaze Helmet", 30, 0, 0));
        meta.setDisplayName(ChatColor.GREEN + "Blaze Helmet");
        item.setItemMeta(meta);
    }
}

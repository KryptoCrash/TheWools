package ml.thewools.thewools.Items.EnderKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class EnderChestplate extends Armor implements Listener {
    public ItemStack item;
    public EnderChestplate() {
        this.item = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(item, this.generateLore(ChatColor.DARK_PURPLE + "Ender Chestplate", 30, 0, 0));
        meta.setDisplayName(ChatColor.DARK_PURPLE + "Ender Chestplate");
        item.setItemMeta(meta);
    }
}

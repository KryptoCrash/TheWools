package ml.thewools.thewools.Items.EnderKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class EnderLeggings extends Armor implements Listener {
    public ItemStack item;
    public EnderLeggings() {
        this.item = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(this.generateLore(ChatColor.DARK_PURPLE + "Ender Leggings", 30, 0));
        meta.setDisplayName(ChatColor.DARK_PURPLE + "Ender Leggings");
        item.setItemMeta(meta);
    }
}

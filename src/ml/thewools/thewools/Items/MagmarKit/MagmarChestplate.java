package ml.thewools.thewools.Items.MagmarKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class MagmarChestplate extends Armor implements Listener {
    public ItemStack item;
    public MagmarChestplate() {
        this.item = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(item, this.generateLore(ChatColor.RED + "Magmar Chestplate", 30, 0, 0));
        meta.setDisplayName(ChatColor.RED + "Magmar Chestplate");
        item.setItemMeta(meta);
    }
}

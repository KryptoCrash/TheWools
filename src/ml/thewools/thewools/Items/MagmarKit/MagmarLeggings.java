package ml.thewools.thewools.Items.MagmarKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class MagmarLeggings extends Armor implements Listener {
    public ItemStack item;
    public MagmarLeggings() {
        this.item = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(this.generateLore(ChatColor.RED + "Magmar Leggings", 30, 0));
        meta.setDisplayName(ChatColor.RED + "Magmar Leggings");
        item.setItemMeta(meta);
    }
}

package ml.thewools.thewools.Items.WitherKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class WitherLeggings extends Armor implements Listener {
    public ItemStack item;
    public WitherLeggings() {
        this.item = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(this.generateLore(item,ChatColor.BLACK + "Wither Leggings", 30, 0, 0));
        meta.setDisplayName(ChatColor.BLACK + "Wither Leggings");
        item.setItemMeta(meta);
    }
}

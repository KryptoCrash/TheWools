package ml.thewools.thewools.Items.WitherKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class WitherChestplate extends Armor implements Listener {
    public ItemStack item;
    public WitherChestplate() {
        this.item = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(this.generateLore(item,ChatColor.BLACK + "Wither Chestplate", 30, 0, 0));
        meta.setDisplayName(ChatColor.BLACK + "Wither Chestplate");
        item.setItemMeta(meta);
    }
}

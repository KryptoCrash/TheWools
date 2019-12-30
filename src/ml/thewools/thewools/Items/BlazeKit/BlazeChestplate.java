package ml.thewools.thewools.Items.BlazeKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class BlazeChestplate extends Armor implements Listener {
    public ItemStack item;
    public BlazeChestplate() {
        this.item = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(item, this.generateLore(ChatColor.GREEN + "Blaze Chestplate", 30, 0, 0));
        meta.setDisplayName(ChatColor.GREEN + "Blaze Chestplate");
        item.setItemMeta(meta);
    }
}

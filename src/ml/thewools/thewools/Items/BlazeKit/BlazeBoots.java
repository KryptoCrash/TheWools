package ml.thewools.thewools.Items.BlazeKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class BlazeBoots extends Armor implements Listener {
    public ItemStack item;
    public BlazeBoots() {
        this.item = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(this.generateLore(item, ChatColor.GREEN + "Blaze Boots", 30, 0, 0));
        meta.setDisplayName(ChatColor.GREEN + "Blaze Boots");
        item.setItemMeta(meta);
    }
}

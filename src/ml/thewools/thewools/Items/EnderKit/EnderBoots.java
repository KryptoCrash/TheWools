package ml.thewools.thewools.Items.EnderKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class EnderBoots extends Armor implements Listener {
    public ItemStack item;
    public EnderBoots() {
        this.item = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(this.generateLore(ChatColor.PURPLE + "Ender Boots", 30, 0));
        meta.setDisplayName(ChatColor.PURPLE + "Ender Boots");
        item.setItemMeta(meta);
    }
}

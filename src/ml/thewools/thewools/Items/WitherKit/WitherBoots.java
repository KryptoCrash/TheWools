package ml.thewools.thewools.Items.WitherKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class WitherBoots extends Armor implements Listener {
    public ItemStack item;
    public WitherBoots() {
        this.item = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(this.generateLore(ChatColor.BLACK + "Wither Boots", 30, 0));
        meta.setDisplayName(ChatColor.BLACK + "Wither Boots");
        item.setItemMeta(meta);
    }
}

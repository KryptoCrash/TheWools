package ml.thewools.thewools.Items.MiscCraftables;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class MAKEENCHANTEDGAPPLESCRAFTABLEAGAIN extends Armor implements Listener {
    public ItemStack item;
    public MAKEENCHANTEDGAPPLESCRAFTABLEAGAIN() {
        this.item = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(item, this.generateLore(ChatColor.RED + "Donald J. Trump Gapple", 0, 0, 0));
        meta.setDisplayName(ChatColor.RED + "Donald J. Trump Gapple");
        item.setItemMeta(meta);
    }
}

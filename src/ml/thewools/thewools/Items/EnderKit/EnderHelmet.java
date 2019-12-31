package ml.thewools.thewools.Items.EnderKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class EnderHelmet extends Armor {
    public EnderHelmet() {
        super(new ItemStack(Material.LEATHER_HELMET),ChatColor.DARK_PURPLE + "Ender Helmet", 30, 0, 0);
    }
}

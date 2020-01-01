package ml.thewools.thewools.Items.EnderKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class EnderChestplate extends Armor {
    public EnderChestplate() {
        super(new ItemStack(Material.LEATHER_CHESTPLATE),ChatColor.DARK_PURPLE + "Ender Chestplate", 30, 0, 0);
    }
}

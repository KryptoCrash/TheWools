package ml.thewools.thewools.Items.EnderKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class EnderLeggings extends Armor {
    public EnderLeggings() {
        super(new ItemStack(Material.LEATHER_LEGGINGS),ChatColor.DARK_PURPLE + "Ender Leggings", 30, 0, 0);
    }
}

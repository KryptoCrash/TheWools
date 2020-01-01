package ml.thewools.thewools.Items.MagmarKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class MagmarChestplate extends Armor {
    public MagmarChestplate() {
        super(new ItemStack(Material.LEATHER_CHESTPLATE),ChatColor.RED + "Magmar Chestplate", 30, 0, 0);
    }
}

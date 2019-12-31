package ml.thewools.thewools.Items.MagmarKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class MagmarBoots extends Armor {
    public MagmarBoots() {
        super(new ItemStack(Material.LEATHER_BOOTS),ChatColor.RED + "Magmar Boots", 30, 0, 0);
    }
}

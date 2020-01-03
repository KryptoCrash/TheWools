package ml.thewools.thewools.Items.BlazeKit;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class BlazeChestplate extends Armor {
    public BlazeChestplate() {
        super(new ItemStack(Material.LEATHER_CHESTPLATE),ChatColor.GREEN + "Blaze Chestplate", Color.fromRGB(200, 80, 0), 16, 12, 0);
    }
}

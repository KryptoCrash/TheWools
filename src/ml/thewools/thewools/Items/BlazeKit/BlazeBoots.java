package ml.thewools.thewools.Items.BlazeKit;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class BlazeBoots extends Armor {
    public BlazeBoots() {
        super(new ItemStack(Material.LEATHER_BOOTS),ChatColor.GREEN + "Blaze Boots", Color.fromRGB(200, 80, 0), 6, 5, 0);
    }
}

package ml.thewools.thewools.Items.BlazeKit;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class BlazeLeggings extends Armor {
    public BlazeLeggings() {
        super(new ItemStack(Material.LEATHER_LEGGINGS),ChatColor.GREEN + "Blaze Leggings", Color.fromRGB(200, 80, 0),12, 8, 0);
    }
}

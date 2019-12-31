package ml.thewools.thewools.Items.BlazeKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class BlazeHelmet extends Armor {
    public BlazeHelmet() {
        super(new ItemStack(Material.LEATHER_HELMET),ChatColor.GREEN + "Blaze Helmet", 30, 0, 0);
    }
}

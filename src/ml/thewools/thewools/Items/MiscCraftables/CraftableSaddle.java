package ml.thewools.thewools.Items.MiscCraftables;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftableSaddle extends Armor {
    public CraftableSaddle() {
        super(new ItemStack(Material.SADDLE), ChatColor.BLACK + "Crafted Saddle", 0, 0, 0);
    }
}

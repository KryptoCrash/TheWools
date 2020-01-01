package ml.thewools.thewools.Items.WitherKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class WitherHelmet extends Armor {
    public WitherHelmet() {
        super(new ItemStack(Material.LEATHER_HELMET),
            ChatColor.BLACK + "Wither Helmet",
            30, 0, 0);
    }
}

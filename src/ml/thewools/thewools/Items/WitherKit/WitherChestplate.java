package ml.thewools.thewools.Items.WitherKit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import ml.thewools.thewools.Items.Armor;
import org.bukkit.inventory.meta.ItemMeta;

public class WitherChestplate extends Armor {
    public WitherChestplate() {
        super(new ItemStack(Material.LEATHER_CHESTPLATE),
            ChatColor.BLACK + "Wither Chestplate",
            30, 0, 0);
    }
}

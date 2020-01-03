package ml.thewools.thewools.Items;

import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Weapon implements Listener {
    protected ItemStack item;

    public ItemStack getItem() {
        return item;
    }

    public Weapon(ItemStack item, String name, double damage, double attackSpeed) {
        this.item = item;
        ArrayList<String> lore = new ArrayList<>();

        lore.add(name);
        lore.add(String.valueOf(damage));
        lore.add(String.valueOf(attackSpeed));

        ItemMeta meta = item.getItemMeta();
        meta.setLore(lore);
        meta.setDisplayName(name);
        item.setItemMeta(meta);
    }

    /**
     * @return 0 if no lore or armor null
     */
    public static double getDoubleDataLore(int i, ItemStack weapon) {
        if (weapon == null || !weapon.hasItemMeta()) return 0;
        ItemMeta meta = weapon.getItemMeta();
        if (!meta.hasLore()) return 0;
        return Double.parseDouble(meta.getLore().get(i));
    }
    public static double getDamage(ItemStack weapon) {
        return getDoubleDataLore(1, weapon);
    }
    public static double getAttackSpeed(ItemStack weapon) {
        return getDoubleDataLore(2, weapon);
    }
}

package ml.thewools.thewools.Items;


import org.bukkit.Color;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.*;

public class Armor implements Listener {

    protected ItemStack item;

    public ItemStack getItem() {
        return item;

    }

    public Armor(ItemStack item, String name, double health, double defense, double speed) {
        this.item = item;
        ArrayList<String> lore = new ArrayList<>();

        lore.add(name);
        lore.add(String.valueOf(health));
        lore.add(String.valueOf(defense));
        lore.add(String.valueOf(speed));

        ItemMeta meta = item.getItemMeta();
        meta.setLore(lore);
        meta.setDisplayName(name);
        item.setItemMeta(meta);
    }
    public Armor(ItemStack item, String name, Color color, double health, double defense, double speed) {
        this.item = item;
        ArrayList<String> lore = new ArrayList<>();

        lore.add(name);
        lore.add(String.valueOf(health));
        lore.add(String.valueOf(defense));
        lore.add(String.valueOf(speed));

        LeatherArmorMeta meta = (LeatherArmorMeta)item.getItemMeta();
        meta.setLore(lore);
        meta.setDisplayName(name);
        meta.setColor(color);
        item.setItemMeta(meta);
    }

    /**
     * @return 0 if no lore or armor null
     */
    public static double getDoubleDataLore(int i, ItemStack armor) {
        if (armor == null || !armor.hasItemMeta()) return 0;
        ItemMeta meta = armor.getItemMeta();
        if (!meta.hasLore()) return 0;
        return Double.parseDouble(meta.getLore().get(i));
    }
    public static double getHealth(ItemStack armor) {
        return getDoubleDataLore(1,armor);
    }
    public static double getDefense(ItemStack armor) {
        return getDoubleDataLore(2,armor);
    }
    public static double getSpeed(ItemStack armor) {
        return getDoubleDataLore(3,armor);
    }
}

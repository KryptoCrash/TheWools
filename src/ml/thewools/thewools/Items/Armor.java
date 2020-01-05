package ml.thewools.thewools.Items;


import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.*;

public class Armor implements Listener {
    public enum Type {
        HELMET,CHESTPLATE,LEGGINGS,BOOTS;
    }
    public static interface Kit {
        default ItemStack getBaseItem(Type piece) {
            switch (piece) {
                case HELMET:
                    return new ItemStack(Material.LEATHER_HELMET);
                case CHESTPLATE:
                    return new ItemStack(Material.LEATHER_CHESTPLATE);
                case LEGGINGS:
                    return new ItemStack(Material.LEATHER_LEGGINGS);
                case BOOTS:
                    return new ItemStack(Material.LEATHER_BOOTS);
            }
            throw new IllegalArgumentException("Illegal Type of Armor");
        }
        default String getSuffix(Type piece) {
            switch (piece) {
                case HELMET:
                    return " Helmet";
                case CHESTPLATE:
                    return " Chestplate";
                case LEGGINGS:
                    return " Leggings";
                case BOOTS:
                    return " Boots";
            }
            throw new IllegalArgumentException("Illegal Type of Armor");
        }
        abstract Armor type(Type piece);

        default Armor getArmor(Type piece, String prefixChatColor, double health, double defense, double speed, String name, Color color) {
            return new Armor(new ItemStack(getBaseItem(piece)),
                prefixChatColor + name + getSuffix(piece), color,
                health, defense, speed);
        }
    }

    protected ItemStack item;

    public ItemStack getItem() {
        return item;

    }

    public Armor(ItemStack item, String name, double health, double defense, double speed) {
        this(item,name,null,health,defense,speed);
    }
    public Armor(ItemStack item, String name, Color color, double health, double defense, double speed) {
        this.item = item;
        ArrayList<String> lore = new ArrayList<>();

        lore.add(name);
        lore.add(String.valueOf(health));
        lore.add(String.valueOf(defense));
        lore.add(String.valueOf(speed));

        ItemMeta meta = item.getItemMeta();
        meta.setLore(lore);
        meta.setDisplayName(name);

        if (item instanceof LeatherArmorMeta) {
            ((LeatherArmorMeta)meta).setColor(color);
        } // cannot set color when crafting :(

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

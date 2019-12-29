package ml.thewools.thewools.Items;

import org.bukkit.Color;

import java.util.ArrayList;

public class Weapon {
    double damage;
    double attackSpeed;
    int rarity;
    String name;
    public ArrayList<String> generateLore(String name, double damage, double attackSpeed) {
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(name);
        lore.add(Double.toString(damage));
        lore.add(Double.toString(attackSpeed));
        return lore;
    }
}

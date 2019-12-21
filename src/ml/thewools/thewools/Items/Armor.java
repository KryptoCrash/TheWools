package ml.thewools.thewools.Items;

import org.bukkit.Color;

import java.util.ArrayList;

public class Armor {
    double defense;
    double speed;
    int rarity;
    String name;
    public ArrayList<String> generateLore(String name, double defense, double speed) {
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(name);
        lore.add(Double.toString(defense));
        lore.add(Double.toString(speed));
        return lore;
    }
}

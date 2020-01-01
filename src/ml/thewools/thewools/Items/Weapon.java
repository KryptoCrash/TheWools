package ml.thewools.thewools.Items;

import java.util.ArrayList;

/**
 * Don't use this, it is bad
 */
@Deprecated
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

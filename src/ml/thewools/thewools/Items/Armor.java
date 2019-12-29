package ml.thewools.thewools.Items;

import ml.thewools.thewools.Utils.NBTEdit;
import org.bukkit.Color;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class Armor {
    double defense;
    double speed;
    int rarity;
    String name;
    public ArrayList<String> generateLore(ItemStack armor, String name, double health, double defense, double speed) {
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(name);
        lore.add(Double.toString(health));
        lore.add(Double.toString(defense));
        lore.add(Double.toString(speed));
        NBTEdit.setNBT(armor, NBTEdit.createNBTComp("mainhand", "generic.maxHealth", health));
        return lore;
    }
}

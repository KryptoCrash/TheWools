package ml.thewools.thewools.Items;

import org.bukkit.ChatColor;
import org.bukkit.Color;

public enum ArmorKitAll implements Armor.Kit {
    WITHER(ChatColor.BLACK.toString(),30,0,0,"Wither"),
    MAGMAR(ChatColor.RED.toString(),30,0,0,"Magmar"),
    ENDER(ChatColor.DARK_PURPLE.toString(),30,0,0,"Ender"),
    BLAZE(ChatColor.GREEN.toString(),
        new double[]{6, 16, 12, 6}, new double[]{5, 12, 8, 5}, new double[]{0, 0, 0, 0},
        "Blaze", Color.fromRGB(200, 80, 0));


    String prefixChatColor, name;
    double[] health, defense, speed;
    Color color;

    ArmorKitAll(String prefixChatColor, double health, double defense, double speed, String name) {
        this(prefixChatColor,
            new double[]{health, health, health, health},
            new double[]{defense, defense, defense, defense},
            new double[]{speed,speed,speed,speed},
                name, null);
    }
    ArmorKitAll(String prefixChatColor, double[] health, double[] defense, double[] speed, String name, Color color) {
        this.prefixChatColor = prefixChatColor;
        this.name = name;
        this.health = health;
        this.defense = defense;
        this.speed = speed;
        this.color = color;

    }

    @Override
    public Armor type(Armor.Type piece) {
        int i;
        switch (piece) {
            case HELMET:
                i=0;
                break;
            case CHESTPLATE:
                i=1;
                break;
            case LEGGINGS:
                i=2;
                break;
            case BOOTS:
                i=3;
                break;
            default:
                throw new IllegalStateException("Illegal Type of Armor");
        }
        return getArmor(piece,prefixChatColor,health[i],defense[i],speed[i],name,color);
    }

    /*
     * You could add other functionality but it's probably unnecessary
     * unless you need to change a default method.
     */
}

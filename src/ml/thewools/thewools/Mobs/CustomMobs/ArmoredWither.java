package ml.thewools.thewools.Mobs.CustomMobs;

import ml.thewools.thewools.Items.*;
import org.bukkit.entity.*;
import org.bukkit.event.Listener;

public class ArmoredWither {
    private WitherSkeleton entity;

    public ArmoredWither() {
        entity = new MobBuilder().setArmor(ArmorKitAll.WITHER).setType(EntityType.WITHER_SKELETON);
    }
}

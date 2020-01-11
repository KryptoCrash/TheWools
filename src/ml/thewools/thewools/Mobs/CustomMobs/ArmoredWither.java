package ml.thewools.thewools.Mobs.CustomMobs;

import ml.thewools.thewools.Items.*;
import ml.thewools.thewools.Mobs.MobBuilder;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.*;

public class ArmoredWither {
    private WitherSkeleton entity;

    public ArmoredWither(World world, Location location) {
        entity = (WitherSkeleton) new MobBuilder().setArmor(ArmorKitAll.WITHER).setType(EntityType.WITHER_SKELETON).spawn(world, location);
    }
}

package ml.thewools.thewools.Mobs;

import ml.thewools.thewools.Items.Armor;
import ml.thewools.thewools.Items.ArmorKitAll;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class MobBuilder {
    EntityType type = EntityType.UNKNOWN;

    ItemStack[] armor = new ItemStack[4];

    public MobBuilder setType(EntityType type) {
        this.type = type;
        return this;
    }

    public MobBuilder setArmor(ItemStack[] armor) {
        this.armor = armor;
        return this;
    }

    public MobBuilder setArmor(ArmorKitAll armor) {
        for (Armor.Type type: Armor.Type.values()) {
            setArmorSlot(armor.type(type).getItem(), type);
        }
        return this;
    }

    /**
     * It seems like the armor is boots=0, ..., helmet=3 by testing.
     * However, idk. it is weird. test to see if it works.
     */
    public MobBuilder setArmorSlot(ItemStack armorPiece, Armor.Type type) {
        switch (type) {

            case LEGGINGS:
                this.armor[0] = armorPiece;
            case BOOTS:
                this.armor[1] = armorPiece;
                break;
            case CHESTPLATE:
                this.armor[2] = armorPiece;
                break;
            case HELMET:
                this.armor[3] = armorPiece;
                break;
        }
        return this;
    }

    public LivingEntity spawn(World world, Location location) {
        Entity entity = world.spawnEntity(location, type);
        if (!(entity instanceof LivingEntity)) {
            throw new IllegalStateException("Entity type must be living");
        }
        ((LivingEntity)entity).getEquipment().setArmorContents(armor);
        return (LivingEntity)entity;
    }
}

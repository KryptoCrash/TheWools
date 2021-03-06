package ml.thewools.thewools.CustomEvents;

import ml.thewools.thewools.Items.Armor;
import ml.thewools.thewools.Items.Weapon;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;

public class DamageEvent implements Listener {
    @EventHandler
    public void onTakeDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof LivingEntity) {
            LivingEntity damageTaker = (LivingEntity) e.getEntity();
            ItemStack[] armor = damageTaker.getEquipment().getArmorContents();

            double defense = 0;
            double maxHealth = 0;

            // Calc total defense
            for (ItemStack armorPiece : armor) {
                defense += Armor.getDefense(armorPiece);
                maxHealth += Armor.getHealth(armorPiece);
            }

            double damage;

            /* TODO:
             *   - Implement vanilla armor defense points.
             *   - Fix getDamage so that it works for projectiles.
             *   - Fix fall damage.
             *   - Fix getDamage so that armor works with fall damage, and block damage.
             */


            if (e instanceof EntityDamageByEntityEvent) {
                damage = getDamage((EntityDamageByEntityEvent) e);
            } else {
                damage = e.getDamage();
            }

            double finalDamage = (50.0 / (defense + 50.0)) * (20.0 * damage / Math.max(maxHealth, 20.0));
            damageTaker.setHealth(Math.max(0.0, damageTaker.getHealth() - finalDamage));
            Bukkit.broadcastMessage(damageTaker.getHealth() + " " + finalDamage + " " + defense + " " + maxHealth + " " + damage);
        }
    }

    public double getDamage(EntityDamageByEntityEvent e) {
        // BUG: getDamage assumes the damageGiver is a live mob, not a projectile.
        LivingEntity damageGiver = (LivingEntity) e.getDamager();
        ItemStack weapon = damageGiver.getEquipment().getItemInMainHand();
        double damage = Weapon.getDamage(weapon);
        if(damage != 0) return damage;
        return e.getDamage();
    }
}
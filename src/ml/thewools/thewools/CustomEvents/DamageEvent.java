package ml.thewools.thewools.CustomEvents;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class DamageEvent implements Listener {
    @EventHandler
    public void onTakeDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof LivingEntity) {
            LivingEntity damageTaker = (LivingEntity) e.getEntity();
            ItemStack[] armor = damageTaker.getEquipment().getArmorContents();
            double health = damageTaker.getHealth();
            double defense = 0;
            // Calc total defense
            for(ItemStack armorPiece : armor) {
                if(armorPiece != null) {
                    if(armorPiece.hasItemMeta() && armorPiece.getItemMeta().hasLore()) {
                        defense += Double.parseDouble(armorPiece.getItemMeta().getLore().get(2));
                    } else {
                        // Implement vanilla armor here
                    }
                }
            }
            // Calculate damage and final health
            /* TODO:
             *   - Implement vanilla armor defense points.
             *   - Fix getDamage so that it works for projectiles.
             *   - Fix fall damage.
             *   - Fix getDamage so that armor works with fall damage, and block damage.
             */
            // Makes sure damage isn't dealt twice.
            e.setDamage(0.0D);
            if (e instanceof EntityDamageByEntityEvent) {
                damageTaker.setHealth(calculateFinalHealth(health, defense, getDamage((EntityDamageByEntityEvent) e)));
            } else {
                damageTaker.setHealth(calculateFinalHealth(health, defense, e.getDamage()));
            }
        }
    }



    public double getDamage(EntityDamageByEntityEvent e) {
        // BUG: getDamage assumes the damageGiver is a live mob, not a projectile.
        LivingEntity damageGiver = (LivingEntity) e.getDamager();
        ItemStack weapon = damageGiver.getEquipment().getItemInMainHand();
        if (weapon.hasItemMeta()) {
            return Double.parseDouble(weapon.getItemMeta().getLore().get(1));
        } else {
            //Implement vanilla to custom converter here
            return e.getDamage();
        }
    }



    public double calculateFinalHealth(double health, double defense, double damage) {
        double finalHealth = health - (50 / (defense + 50)) * damage;
        System.out.println(finalHealth);
        Bukkit.broadcastMessage(finalHealth + " " + defense + " " + damage);
        return finalHealth;
    }
}


//
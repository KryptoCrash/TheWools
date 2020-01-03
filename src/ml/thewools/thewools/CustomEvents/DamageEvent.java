package ml.thewools.thewools.CustomEvents;

import ml.thewools.thewools.Items.Armor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class DamageEvent implements Listener {
    @EventHandler
    public void onTakeDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof LivingEntity) {
            LivingEntity damageTaker = (LivingEntity) e.getEntity();
            ItemStack[] armor = damageTaker.getEquipment().getArmorContents();

            double defense = 0;

            // Calc total defense
            for (ItemStack armorPiece : armor) {
                defense += Armor.getDefense(armorPiece);
            }

            double damage;

            /* TODO:
             *   - Implement vanilla armor defense points.
             *   - Fix getDamage so that it works for projectiles.
             *   - Fix getDamage so that armor works with fall damage, and block damage.
             */


            if (e instanceof EntityDamageByEntityEvent) {
                damage = getDamage((EntityDamageByEntityEvent) e);
            } else {
                damage = e.getDamage();
            }

            e.setDamage((50 / (defense + 50)) * damage);
        }
    }

    public double getDamage(EntityDamageByEntityEvent e) {
        // TODO Bug: getDamage assumes the damageGiver is a live mob, not a projectile.

        LivingEntity damageGiver = (LivingEntity) e.getDamager();
        EntityEquipment equip = damageGiver.getEquipment();

        if (equip==null) {
            return e.getDamage();
        }

        ItemStack weapon = equip.getItemInMainHand();

        if (weapon.hasItemMeta() && weapon.getItemMeta().hasLore()) {

            // TODO: Add a weapon lore getter like Armor.getDefense

            return Double.parseDouble(weapon.getItemMeta().getLore().get(1));
        } else {

            // TODO: Implement vanilla to custom converter here
            return e.getDamage();
        }
    }
    /*
    public double calculateFinalHealth(double health, double defense, double damage) {
        double finalHealth = health - (50 / (defense + 50)) * damage;
        System.out.println(finalHealth);
        Bukkit.broadcastMessage(finalHealth + " " + defense + " " + damage);
        return finalHealth;
    }*/
}

/* Process:
 * 1. Find what caused the damage, and get the amount of raw damage
 * 2. Find the DamageTaker, and get all armor bonuses, as well as calculate set bonus.
 * 3. Find how much reduction in damage the armor does, and how much damage would be applied.
 * 4. Reduce the realHealth by the amount of damage, and store it in the entity.
 * 5. Scale the entity's health so that it fits in 5 rows of hearts. (100 HP)
 * 6. (Stretch Goal) Allow an additional 5 rows of hearts be represented by absorption hearts, and scale accordingly.
 *              (This would allow 200 HP to be represented in a clear, concise manner.)
 */
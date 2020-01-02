package ml.thewools.thewools.CustomEvents;

import ml.thewools.thewools.Items.Armor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;

public class DamageEvent implements Listener {
    @EventHandler
    public void onTakeDamage(EntityDamageEvent e) {


        if(e.getEntity() instanceof LivingEntity) {
            LivingEntity damageTaker = (LivingEntity) e.getEntity();
            ItemStack[] armor = damageTaker.getEquipment().getArmorContents();

            double defense = 0;

            // Calc total defense
            for (ItemStack armorPiece : armor) {
                defense += Armor.getDefense(armorPiece);
            }

            double damage;

            if (e instanceof EntityDamageByEntityEvent) {
                damage = getDamage((EntityDamageByEntityEvent) e);
            } else {
                damage = e.getDamage();
            }

            e.setDamage((50 / (defense + 50)) * damage);
        }
    }

    public double getDamage(EntityDamageByEntityEvent e) {
        return e.getDamage();

        // Weapons not used yet
        /*
        LivingEntity damageGiver = (LivingEntity) e.getDamager();
        ItemStack weapon = damageGiver.getEquipment().getItemInMainHand();

        if (weapon.hasItemMeta()) {
            return Double.parseDouble(weapon.getItemMeta().getLore().get(1));
        } else {
            //Implement vanilla to custom converter here
            return e.getDamage();
        }
        */
    }
}

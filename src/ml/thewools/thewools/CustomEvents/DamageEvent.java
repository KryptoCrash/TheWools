package ml.thewools.thewools.CustomEvents;

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
        if(e.getEntity() instanceof LivingEntity) {
            LivingEntity damagee = (LivingEntity) e.getEntity();
            ItemStack[] armor = damagee.getEquipment().getArmorContents();
            double health = damagee.getHealth();
            double defense = 0;
            //Calc total defense
            for(ItemStack armorPiece : armor) {
                if(armorPiece != null) {
                    if(armorPiece.getItemMeta().hasLore()) {
                        defense += Double.parseDouble(armorPiece.getItemMeta().getLore().get(2));
                    } else {
                        //Implement vanilla armor here
                    }
                }
            }
            //Calc damage and final health
            if(e instanceof EntityDamageByEntityEvent) {
                e.setDamage(calculateFinalHealth(health, defense, getDamage((LivingEntity) ((EntityDamageByEntityEvent) e).getDamager())));
            } else {
                e.setDamage(calculateFinalHealth(health, defense, e.getDamage()));
            }
        }
    }
    public double getDamage(LivingEntity damager) {
        ItemStack weapon = damager.getEquipment().getItemInMainHand();
        if(weapon.getItemMeta().hasLore()) {
            return Double.parseDouble(weapon.getItemMeta().getLore().get(1));
        } else {
            //Implement vanilla swords here
            return 0;
        }
    }
    public double calculateFinalHealth(double health, double defense, double damage) {
        return health - (10 / (defense + 10)) * damage;
    }
}

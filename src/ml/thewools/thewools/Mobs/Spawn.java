package ml.thewools.thewools.Mobs;

import ml.thewools.thewools.Items.Armor;
import ml.thewools.thewools.Items.ArmorKitAll;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.inventory.ItemStack;

public class Spawn implements Listener {

    @EventHandler
    public void example(PlayerEggThrowEvent e) {
        new MobBuilder().setArmor(ArmorKitAll.WITHER).setType(EntityType.WITHER_SKELETON).spawn(e.getEgg().getWorld(),e.getEgg().getLocation());
    }
}

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
    public void onSpawn(PlayerEggThrowEvent e) {
        LivingEntity witherskel = (LivingEntity)e.getEgg().getWorld().spawnEntity(e.getEgg().getLocation(), EntityType.WITHER_SKELETON);

        ItemStack[] armor = new ItemStack[4];
        for (int i = 0; i < 4; i++) {
            armor[i]=ArmorKitAll.WITHER.getItem(Armor.Type.values()[i]);
        }
        witherskel.getEquipment().setArmorContents(armor);
    }
}

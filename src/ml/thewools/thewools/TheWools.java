package ml.thewools.thewools;

import ml.thewools.thewools.CustomEvents.CraftingEvent;
import ml.thewools.thewools.CustomEvents.DamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class TheWools extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CraftingEvent(), this);
        getServer().getPluginManager().registerEvents(new DamageEvent(), this);
        getServer().getPluginManager().registerEvents(new SpawnEvent(), this);
    }

    @Override
    public void onDisable() {

    }

}

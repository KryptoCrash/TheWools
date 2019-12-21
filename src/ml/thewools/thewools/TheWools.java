package ml.thewools.thewools;

import ml.thewools.thewools.CustomEvents.CraftingEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class TheWools extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CraftingEvent(), this);
    }

    @Override
    public void onDisable() {

    }

}

package ml.thewools.thewools.Commands;

import org.bukkit.plugin.java.JavaPlugin;

public class Bomb extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("bomb").setExecutor(new CommandBOMB());
    }
}

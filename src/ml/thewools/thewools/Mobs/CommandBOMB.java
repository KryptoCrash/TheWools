package  ml.thewools.thewools.Mobs;

import org.bukkit.Location;
import org.bukkit.command.*;
import org.bukkit.entity.*;

public class CommandBOMB implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[]args) {
        if(sender instanceof Player) {
            Player player = (Player)sender;
            Location loc = player.getLocation();
            player.getWorld().spawnEntity(loc, EntityType.CREEPER);
            player.sendMessage("ALLAH AKBARRRR!!!");
        }
        return true;
    }
}

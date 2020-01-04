package  ml.thewools.thewools.Mobs;

import org.nukkit.command.Command;

public class CommandBOMB implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender, Command cmd, String label, String[]args) {
        if(sender instanceof Player) {
            Player player = (Player)seender;
            Location loc = player.getLocation();
            player.getWorld().spawnEntity(loc, EntityType.CREEPER);
            player.sendMessage("ALLAH AKBARRRR!!!");
        }
        return true;
    }
}

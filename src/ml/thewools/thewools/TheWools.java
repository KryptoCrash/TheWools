package ml.thewools.thewools;

import ml.thewools.thewools.CustomEvents.CraftingEvent;
import ml.thewools.thewools.CustomEvents.DamageEvent;
import ml.thewools.thewools.Mobs.CommandBOMB;
import ml.thewools.thewools.Mobs.Spawn;
import org.bukkit.plugin.java.JavaPlugin;

public class TheWools extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CraftingEvent(), this);
        getServer().getPluginManager().registerEvents(new DamageEvent(), this);
        getServer().getPluginManager().registerEvents(new Spawn(), this);

        this.getCommand("bomb").setExecutor(new CommandBOMB());
    }

    @Override
    public void onDisable() {

    }



    //copied and doesn't work
    /*

    // this is where we store our custom entity type (for use with spawning, etc)
    public static EntityTypes CUSTOM_ZOMBIE;

    @Override
    public void onLoad() {
        // register the custom entity in the server
        // it is recommended to do this when the server is loading
        // but since we're not replacing vanilla entities it can be
        // done later if wanted
        CUSTOM_ZOMBIE = injectNewEntity("custom_zombie", "zombie", CustomZombie.class, CustomZombie::new);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This is a player only command!");
            return true;
        }

        // spawn CustomZombie where player is standing
        Entity spawnedEntity = spawnEntity(CUSTOM_ZOMBIE, ((Player) sender).getLocation());

        if (spawnedEntity == null) {
            sender.sendMessage("Could not spawn entity!");
        } else {
            sender.sendMessage("Custom zombie spawned!");
        }
        return true;
    }

    /**
     * Spawns entity at specified Location
     *
     * @param entityTypes Type of entity to spawn
     * @param loc Location to spawn at
     * @return Reference to the spawned bukkit Entity

    public Entity spawnEntity(EntityTypes entityTypes, Location loc, net.minecraft.server.v1_14_R1.World world) {
        net.minecraft.server.v1_14_R1.Entity nmsEntity = entityTypes.spawnCreature(
            world, // reference to the NMS worl
            null, // EntityTag NBT compound
            null,
            null, // player reference. used to know if player is OP to apply EntityTag NBT compound
            new BlockPosition(loc.getBlockX(), loc.getBlockY(), loc.getBlockZ()), // the BlockPosition to spawn at
            EnumMobSpawn.SPAWNER,
            false,// not sure. alters the Y position. this is only ever true when using spawn egg and clicked face is UP
            true ); // not sure. idk

        // feel free to further modify your entity here if wanted
        // it's already been added to the world at this point

        return nmsEntity == null ? null : nmsEntity.getBukkitEntity(); // convert to a Bukkit entity
    }

    private EntityTypes injectNewEntity(String name, String extend_from, Class<? extends net.minecraft.server.v1_14_R1.Entity> clazz, Function<? super World, ? extends net.minecraft.server.v1_14_R1.Entity> function) {
        // get the server's datatypes (also referred to as "data fixers")
        Map<Object, Type<?>> dataTypes = (Map<Object, Type<?>>) DataConverterRegistry.a().getSchema(DataFixUtils.makeKey(SharedConstants.a().getWorldVersion())).findChoiceType(DataConverterTypes.n).types();
        // inject the new custom entity (this registers the
        // name/id with the server so you can use it in things
        // like the vanilla /summon command)
        dataTypes.put("minecraft:" + name, dataTypes.get("minecraft:" + extend_from));
        // create and return an EntityTypes for the custom entity
        // store this somewhere so you can reference it later (like for spawning)
        return EntityTypes.a(name, EntityTypes.a.a(clazz, function));
    }

    /**
     * The custom zombie

    public static class CustomZombie extends EntityZombie {
        public CustomZombie(net.minecraft.server.v1_14_R1.World world) {
            super(world);

        }
    }*/
}

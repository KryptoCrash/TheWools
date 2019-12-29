package ml.thewools.thewools.Utils;

import java.lang.reflect.*;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;

public class NBTEdit {

    private static final NBTEdit nbt;
    private static final String SERVER_VERSION;
    private static Constructor<?> NBTTAGCOMPOUND_CONSTRUCTOR, NBTTAGLIST_CONSTRUCTOR;
    private static Class<?> NBTTAGCOMPOUND_CLASS, NBTTAGLIST_CLASS, CRAFTITEM_CLASS, ITEMSTACK_CLASS, NBTBASE_CLASS;
    private static Method ASNMSCOPY_METHOD, HASTAG_METHOD, GETTAG_METHOD, SETSTRING_METHOD, SETDOUBLE_METHOD,
            SETINT_METHOD, ADD_METHOD, SET_METHOD, SETTAG_METHOD, ASBUKKITCOPY_METHOD;

    static {
        String name = Bukkit.getServer().getClass().getName();
        name = name.substring(name.indexOf("craftbukkit.") + "craftbukkit.".length());
        SERVER_VERSION = name.substring(0, name.indexOf("."));
        nbt = new NBTEdit();
        try {
            CRAFTITEM_CLASS = Class.forName("org.bukkit.craftbukkit." + SERVER_VERSION + ".inventory.CraftItemStack");
            ITEMSTACK_CLASS = Class.forName("net.minecraft.server." + SERVER_VERSION + ".ItemStack");
            NBTTAGCOMPOUND_CLASS = Class.forName("net.minecraft.server." + SERVER_VERSION + ".NBTTagCompound");
            NBTTAGLIST_CLASS = Class.forName("net.minecraft.server." + SERVER_VERSION + ".NBTTagList");
            NBTBASE_CLASS = Class.forName("net.minecraft.server." + SERVER_VERSION + ".NBTBase");
            NBTTAGCOMPOUND_CONSTRUCTOR = NBTTAGCOMPOUND_CLASS.getConstructor();
            NBTTAGLIST_CONSTRUCTOR = NBTTAGLIST_CLASS.getConstructor();
            ASNMSCOPY_METHOD = CRAFTITEM_CLASS.getMethod("asNMSCopy", ItemStack.class);
            HASTAG_METHOD = ITEMSTACK_CLASS.getMethod("hasTag");
            GETTAG_METHOD = ITEMSTACK_CLASS.getMethod("getTag");
            SETSTRING_METHOD = NBTTAGCOMPOUND_CLASS.getMethod("setString", String.class, String.class);
            SETDOUBLE_METHOD = NBTTAGCOMPOUND_CLASS.getMethod("setDouble", String.class, double.class);
            SETINT_METHOD = NBTTAGCOMPOUND_CLASS.getMethod("setInt", String.class, int.class);
            ADD_METHOD = NBTTAGLIST_CLASS.getMethod("add", NBTBASE_CLASS);
            SET_METHOD = NBTTAGCOMPOUND_CLASS.getMethod("set", String.class, NBTBASE_CLASS);
            SETTAG_METHOD = ITEMSTACK_CLASS.getMethod("setTag", NBTTAGCOMPOUND_CLASS);
            ASBUKKITCOPY_METHOD = CRAFTITEM_CLASS.getMethod("asBukkitCopy", ITEMSTACK_CLASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ItemStack setNBT(ItemStack item, NBTComp... comps) {
        try {
            Object nmsItem = ASNMSCOPY_METHOD.invoke(null, item);
            Object compound = (boolean) HASTAG_METHOD.invoke(nmsItem) ? GETTAG_METHOD.invoke(nmsItem)
                    : NBTTAGCOMPOUND_CONSTRUCTOR.newInstance();
            Object modifiers = NBTTAGLIST_CONSTRUCTOR.newInstance();

            UUID uuid = UUID.randomUUID();
            for (NBTComp newNBT : comps) {
                Object comp = NBTTAGCOMPOUND_CONSTRUCTOR.newInstance();
                SETSTRING_METHOD.invoke(comp, "AttributeName", newNBT.type);
                SETSTRING_METHOD.invoke(comp, "Name", newNBT.type);
                SETDOUBLE_METHOD.invoke(comp, "Amount", newNBT.level);
                SETINT_METHOD.invoke(comp, "Operation", 0);
                SETINT_METHOD.invoke(comp, "UUIDLeast", (int) uuid.getMostSignificantBits());
                SETINT_METHOD.invoke(comp, "UUIDMost", (int) uuid.getMostSignificantBits());
                SETSTRING_METHOD.invoke(comp, "Slot", newNBT.slot);
                ADD_METHOD.invoke(modifiers, comp);
            }
            SET_METHOD.invoke(compound, "AttributeModifiers", modifiers);
            SETTAG_METHOD.invoke(nmsItem, compound);
            item = (ItemStack) ASBUKKITCOPY_METHOD.invoke(null, nmsItem);
            return item;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return item;
    }

    public static NBTComp createNBTComp(String slot, String type, double level) {
        return nbt.new NBTComp(slot, type, level);
    }

    public class NBTComp {

        String slot, type;
        double level;

        public NBTComp(String slot, String type, double level) {
            this.slot = slot;
            this.type = type;
            this.level = level;
        }
    }
}
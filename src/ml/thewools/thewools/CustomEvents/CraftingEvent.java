package ml.thewools.thewools.CustomEvents;

import ml.thewools.thewools.Items.Armor;
import ml.thewools.thewools.Items.ArmorKitAll;

import ml.thewools.thewools.Items.MiscCraftables.CraftableSaddle;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class CraftingEvent implements Listener {
    @EventHandler
    public void onPlayerCraftItem(PrepareItemCraftEvent e) {
        CraftingInventory inv = e.getInventory();
        if(inv.getMatrix().length < 9) return;
        // Blaze Kit
        register(ArmorKitAll.BLAZE,new ItemStack(Material.BLAZE_ROD), inv);
        register(ArmorKitAll.WITHER,new ItemStack(Material.WITHER_SKELETON_SKULL), inv);
        register(ArmorKitAll.MAGMAR,new ItemStack(Material.MAGMA_CREAM), inv);
        register(ArmorKitAll.ENDER,new ItemStack(Material.ENDER_PEARL), inv);

        // Misc Items
        checkCraft(new CraftableSaddle().getItem(), inv, new HashMap<>() {{
            put(0, new ItemStack(Material.LEATHER));
            put(1, new ItemStack(Material.LEATHER));
            put(2, new ItemStack(Material.LEATHER));
            put(3, new ItemStack(Material.IRON_INGOT));
            put(4, new ItemStack(Material.DIAMOND));
            put(5, new ItemStack(Material.IRON_INGOT));
            put(6, new ItemStack(Material.LEATHER));
            put(7, new ItemStack(Material.LEATHER));
            put(8, new ItemStack(Material.LEATHER));
        }});
    }
    
    public void register(ArmorKitAll kitAll, ItemStack material, CraftingInventory inv) {

        checkCraft(kitAll.getItem(Armor.Type.HELMET), inv, new HashMap<>() {{
            put(0, material);
            put(1, material);
            put(2, material);
            put(3, material);
            put(5, material);
        }});
        checkCraft(kitAll.getItem(Armor.Type.CHESTPLATE), inv, new HashMap<>() {{
            put(0, material);
            put(2, material);
            put(3, material);
            put(4, material);
            put(5, material);
            put(6, material);
            put(7, material);
            put(8, material);
        }});
        checkCraft(kitAll.getItem(Armor.Type.LEGGINGS), inv, new HashMap<>() {{
            put(0, material);
            put(1, material);
            put(2, material);
            put(3, material);
            put(5, material);
            put(6, material);
            put(8, material);
        }});
        checkCraft(kitAll.getItem(Armor.Type.BOOTS), inv, new HashMap<>() {{
            put(0, material);
            put(2, material);
            put(3, material);
            put(5, material);
        }});
    }
    public void checkCraft(ItemStack result, CraftingInventory inv, HashMap<Integer,ItemStack> ingredients) {
        ItemStack[] matrix = inv.getMatrix();
        for(int i = 0; i < 9; i++) {
            if(ingredients.containsKey(i)) {
                if(matrix[i] == null || !matrix[i].equals(ingredients.get(i))) return;
            } else {
                if(matrix[i] != null) return;
            }
        }
        inv.setResult(result);
    }
}

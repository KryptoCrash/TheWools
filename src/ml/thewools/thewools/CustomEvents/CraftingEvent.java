package ml.thewools.thewools.CustomEvents;

import ml.thewools.thewools.Items.BlazeKit.BlazeHelmet;
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
        ItemStack[] inv = e.getInventory().getMatrix();
        if(inv.length < 9) return;
        checkCraft(new BlazeHelmet().item, e.getInventory(), new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.BLAZE_ROD));
            put(1, new ItemStack(Material.BLAZE_ROD));
            put(2, new ItemStack(Material.BLAZE_ROD));
            put(3, new ItemStack(Material.BLAZE_ROD));
            put(5, new ItemStack(Material.BLAZE_ROD));
        }});
        checkCraft(new BlazeChestplate().item, e.getInventory(), new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.BLAZE_ROD));
            put(2, new ItemStack(Material.BLAZE_ROD));
            put(3, new ItemStack(Material.BLAZE_ROD));
            put(4, new ItemStack(Material.BLAZE_ROD));
            put(5, new ItemStack(Material.BLAZE_ROD));
            put(6, new ItemStack(Material.BLAZE_ROD));
            put(7, new ItemStack(Material.BLAZE_ROD));
            put(8, new ItemStack(Material.BLAZE_ROD));
        }});
        checkCraft(new BlazeLeggings().item, e.getInventory(), new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.BLAZE_ROD));
            put(1, new ItemStack(Material.BLAZE_ROD));
            put(2, new ItemStack(Material.BLAZE_ROD));
            put(3, new ItemStack(Material.BLAZE_ROD));
            put(5, new ItemStack(Material.BLAZE_ROD));
            put(6, new ItemStack(Material.BLAZE_ROD));
            put(8, new ItemStack(Material.BLAZE_ROD));
        }});
        checkCraft(new BlazeBoots().item, e.getInventory(), new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.BLAZE_ROD));
            put(2, new ItemStack(Material.BLAZE_ROD));
            put(3, new ItemStack(Material.BLAZE_ROD));
            put(5, new ItemStack(Material.BLAZE_ROD));
        }});
        checkCraft(new BlazeHelmet().item, e.getInventory(), new HashMap<Integer, ItemStack>() {{
            put(3, new ItemStack(Material.BLAZE_ROD));
            put(4, new ItemStack(Material.BLAZE_ROD));
            put(5, new ItemStack(Material.BLAZE_ROD));
            put(6, new ItemStack(Material.BLAZE_ROD));
            put(8, new ItemStack(Material.BLAZE_ROD));
        }});
        checkCraft(new BlazeBoots().item, e.getInventory(), new HashMap<Integer, ItemStack>() {{
            put(3, new ItemStack(Material.BLAZE_ROD));
            put(5, new ItemStack(Material.BLAZE_ROD));
            put(6, new ItemStack(Material.BLAZE_ROD));
            put(8, new ItemStack(Material.BLAZE_ROD));
        }});
    }
    public void checkCraft(ItemStack result, CraftingInventory inv, HashMap<Integer, ItemStack> ingredients) {
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

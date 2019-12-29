package ml.thewools.thewools.CustomEvents;

import ml.thewools.thewools.Items.BlazeKit.BlazeHelmet;
import ml.thewools.thewools.Items.BlazeKit.BlazeChestplate;
import ml.thewools.thewools.Items.BlazeKit.BlazeLeggings;
import ml.thewools.thewools.Items.BlazeKit.BlazeBoots;

import ml.thewools.thewools.Items.WitherKit.WitherHelmet;
import ml.thewools.thewools.Items.WitherKit.WitherChestplate;
import ml.thewools.thewools.Items.WitherKit.WitherLeggings;
import ml.thewools.thewools.Items.WitherKit.WitherBoots;

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
        //Blaze Kit
        checkCraft(new BlazeHelmet().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.BLAZE_ROD));
            put(1, new ItemStack(Material.BLAZE_ROD));
            put(2, new ItemStack(Material.BLAZE_ROD));
            put(3, new ItemStack(Material.BLAZE_ROD));
            put(5, new ItemStack(Material.BLAZE_ROD));
        }});
        checkCraft(new BlazeChestplate().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.BLAZE_ROD));
            put(2, new ItemStack(Material.BLAZE_ROD));
            put(3, new ItemStack(Material.BLAZE_ROD));
            put(4, new ItemStack(Material.BLAZE_ROD));
            put(5, new ItemStack(Material.BLAZE_ROD));
            put(6, new ItemStack(Material.BLAZE_ROD));
            put(7, new ItemStack(Material.BLAZE_ROD));
            put(8, new ItemStack(Material.BLAZE_ROD));
        }});
        checkCraft(new BlazeLeggings().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.BLAZE_ROD));
            put(1, new ItemStack(Material.BLAZE_ROD));
            put(2, new ItemStack(Material.BLAZE_ROD));
            put(3, new ItemStack(Material.BLAZE_ROD));
            put(5, new ItemStack(Material.BLAZE_ROD));
            put(6, new ItemStack(Material.BLAZE_ROD));
            put(8, new ItemStack(Material.BLAZE_ROD));
        }});
        checkCraft(new BlazeBoots().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.BLAZE_ROD));
            put(2, new ItemStack(Material.BLAZE_ROD));
            put(3, new ItemStack(Material.BLAZE_ROD));
            put(5, new ItemStack(Material.BLAZE_ROD));
        }});
        checkCraft(new BlazeHelmet().item, inv, new HashMap<Integer, ItemStack>() {{
            put(3, new ItemStack(Material.BLAZE_ROD));
            put(4, new ItemStack(Material.BLAZE_ROD));
            put(5, new ItemStack(Material.BLAZE_ROD));
            put(6, new ItemStack(Material.BLAZE_ROD));
            put(8, new ItemStack(Material.BLAZE_ROD));
        }});
        checkCraft(new BlazeBoots().item, inv, new HashMap<Integer, ItemStack>() {{
            put(3, new ItemStack(Material.BLAZE_ROD));
            put(5, new ItemStack(Material.BLAZE_ROD));
            put(6, new ItemStack(Material.BLAZE_ROD));
            put(8, new ItemStack(Material.BLAZE_ROD));
        }});
        checkCraft(new WitherHelmet().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.SKULL));
            put(1, new ItemStack(Material.SKULL));
            put(2, new ItemStack(Material.SKULL));
            put(3, new ItemStack(Material.SKULL));
            put(5, new ItemStack(Material.SKULL));
        }});
        //Wither Armor
        checkCraft(new WitherChestplate().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.SKULL));
            put(2, new ItemStack(Material.SKULL));
            put(3, new ItemStack(Material.SKULL));
            put(4, new ItemStack(Material.SKULL));
            put(5, new ItemStack(Material.SKULL));
            put(6, new ItemStack(Material.SKULL));
            put(7, new ItemStack(Material.SKULL));
            put(8, new ItemStack(Material.SKULL));
        }});
        checkCraft(new WitherLeggings().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.SKULL));
            put(1, new ItemStack(Material.SKULL));
            put(2, new ItemStack(Material.SKULL));
            put(3, new ItemStack(Material.SKULL));
            put(5, new ItemStack(Material.SKULL));
            put(6, new ItemStack(Material.SKULL));
            put(8, new ItemStack(Material.SKULL));
        }});
        checkCraft(new WitherBoots().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.SKULL));
            put(2, new ItemStack(Material.SKULL));
            put(3, new ItemStack(Material.SKULL));
            put(5, new ItemStack(Material.SKULL));
        }});
        checkCraft(new WitherHelmet().item, inv, new HashMap<Integer, ItemStack>() {{
            put(3, new ItemStack(Material.SKULL));
            put(4, new ItemStack(Material.SKULL));
            put(5, new ItemStack(Material.SKULL));
            put(6, new ItemStack(Material.SKULL));
            put(8, new ItemStack(Material.SKULL));
        }});
        checkCraft(new WitherBoots().item, inv, new HashMap<Integer, ItemStack>() {{
            put(3, new ItemStack(Material.SKULL));
            put(5, new ItemStack(Material.SKULL));
            put(6, new ItemStack(Material.SKULL));
            put(8, new ItemStack(Material.SKULL));
        }});
        //Misc Items
        checkCraft(new CraftableSaddle().item, inv, new HashMap<Integer, ItemStack>() {{
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

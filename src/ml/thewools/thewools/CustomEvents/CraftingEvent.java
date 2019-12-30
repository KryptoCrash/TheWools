package ml.thewools.thewools.CustomEvents;

import ml.thewools.thewools.Items.BlazeKit.BlazeHelmet;
import ml.thewools.thewools.Items.BlazeKit.BlazeChestplate;
import ml.thewools.thewools.Items.BlazeKit.BlazeLeggings;
import ml.thewools.thewools.Items.BlazeKit.BlazeBoots;

import ml.thewools.thewools.Items.WitherKit.WitherHelmet;
import ml.thewools.thewools.Items.WitherKit.WitherChestplate;
import ml.thewools.thewools.Items.WitherKit.WitherLeggings;
import ml.thewools.thewools.Items.WitherKit.WitherBoots;

import ml.thewools.thewools.Items.MagmarKit.MagmarHelmet;
import ml.thewools.thewools.Items.MagmarKit.MagmarChestplate;
import ml.thewools.thewools.Items.MagmarKit.MagmarLeggings;
import ml.thewools.thewools.Items.MagmarKit.MagmarBoots;

import ml.thewools.thewools.Items.EnderKit.EnderHelmet;
import ml.thewools.thewools.Items.EnderKit.EnderChestplate;
import ml.thewools.thewools.Items.EnderKit.EnderLeggings;
import ml.thewools.thewools.Items.EnderKit.EnderBoots;

import ml.thewools.thewools.Items.MiscCraftables.CraftableSaddle;
import ml.thewools.thewools.Items.MiscCraftables.MAKEENCHANTEDGAPPLESCRAFTABLEAGAIN;

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
        //Wither Armor
        checkCraft(new WitherHelmet().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(1, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(2, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(3, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(5, new ItemStack(Material.WITHER_SKELETON_SKULL));
        }});
        checkCraft(new WitherChestplate().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(2, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(3, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(4, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(5, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(6, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(7, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(8, new ItemStack(Material.WITHER_SKELETON_SKULL));
        }});
        checkCraft(new WitherLeggings().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(1, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(2, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(3, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(5, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(6, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(8, new ItemStack(Material.WITHER_SKELETON_SKULL));
        }});
        checkCraft(new WitherBoots().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(2, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(3, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(5, new ItemStack(Material.WITHER_SKELETON_SKULL));
        }});
        checkCraft(new WitherHelmet().item, inv, new HashMap<Integer, ItemStack>() {{
            put(3, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(4, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(5, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(6, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(8, new ItemStack(Material.WITHER_SKELETON_SKULL));
        }});
        checkCraft(new WitherBoots().item, inv, new HashMap<Integer, ItemStack>() {{
            put(3, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(5, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(6, new ItemStack(Material.WITHER_SKELETON_SKULL));
            put(8, new ItemStack(Material.WITHER_SKELETON_SKULL));
        }});
        //Magmar Armor
        checkCraft(new MagmarHelmet().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.MAGMA_CREAM));
            put(1, new ItemStack(Material.MAGMA_CREAM));
            put(2, new ItemStack(Material.MAGMA_CREAM));
            put(3, new ItemStack(Material.MAGMA_CREAM));
            put(5, new ItemStack(Material.MAGMA_CREAM));
        }});
        checkCraft(new MagmarChestplate().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.MAGMA_CREAM));
            put(2, new ItemStack(Material.MAGMA_CREAM));
            put(3, new ItemStack(Material.MAGMA_CREAM));
            put(4, new ItemStack(Material.MAGMA_CREAM));
            put(5, new ItemStack(Material.MAGMA_CREAM));
            put(6, new ItemStack(Material.MAGMA_CREAM));
            put(7, new ItemStack(Material.MAGMA_CREAM));
            put(8, new ItemStack(Material.MAGMA_CREAM));
        }});
        checkCraft(new MagmarLeggings().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.MAGMA_CREAM));
            put(1, new ItemStack(Material.MAGMA_CREAM));
            put(2, new ItemStack(Material.MAGMA_CREAM));
            put(3, new ItemStack(Material.MAGMA_CREAM));
            put(5, new ItemStack(Material.MAGMA_CREAM));
            put(6, new ItemStack(Material.MAGMA_CREAM));
            put(8, new ItemStack(Material.MAGMA_CREAM));
        }});
        checkCraft(new MagmarBoots().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.MAGMA_CREAM));
            put(2, new ItemStack(Material.MAGMA_CREAM));
            put(3, new ItemStack(Material.MAGMA_CREAM));
            put(5, new ItemStack(Material.MAGMA_CREAM));
        }});
        checkCraft(new MagmarHelmet().item, inv, new HashMap<Integer, ItemStack>() {{
            put(3, new ItemStack(Material.MAGMA_CREAM));
            put(4, new ItemStack(Material.MAGMA_CREAM));
            put(5, new ItemStack(Material.MAGMA_CREAM));
            put(6, new ItemStack(Material.MAGMA_CREAM));
            put(8, new ItemStack(Material.MAGMA_CREAM));
        }});
        checkCraft(new MagmarBoots().item, inv, new HashMap<Integer, ItemStack>() {{
            put(3, new ItemStack(Material.MAGMA_CREAM));
            put(5, new ItemStack(Material.MAGMA_CREAM));
            put(6, new ItemStack(Material.MAGMA_CREAM));
            put(8, new ItemStack(Material.MAGMA_CREAM));
        }});
        //Ender Armor
        checkCraft(new EnderHelmet().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.ENDER_PEARL));
            put(1, new ItemStack(Material.ENDER_PEARL));
            put(2, new ItemStack(Material.ENDER_PEARL));
            put(3, new ItemStack(Material.ENDER_PEARL));
            put(5, new ItemStack(Material.ENDER_PEARL));
        }});
        checkCraft(new EnderChestplate().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.ENDER_PEARL));
            put(2, new ItemStack(Material.ENDER_PEARL));
            put(3, new ItemStack(Material.ENDER_PEARL));
            put(4, new ItemStack(Material.ENDER_CHEST));
            put(5, new ItemStack(Material.ENDER_PEARL));
            put(6, new ItemStack(Material.ENDER_PEARL));
            put(7, new ItemStack(Material.ENDER_PEARL));
            put(8, new ItemStack(Material.ENDER_PEARL));
        }});
        checkCraft(new EnderLeggings().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.ENDER_PEARL));
            put(1, new ItemStack(Material.ENDER_PEARL));
            put(2, new ItemStack(Material.ENDER_PEARL));
            put(3, new ItemStack(Material.ENDER_PEARL));
            put(5, new ItemStack(Material.ENDER_PEARL));
            put(6, new ItemStack(Material.ENDER_PEARL));
            put(8, new ItemStack(Material.ENDER_PEARL));
        }});
        checkCraft(new EnderBoots().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.ENDER_PEARL));
            put(2, new ItemStack(Material.ENDER_PEARL));
            put(3, new ItemStack(Material.ENDER_PEARL));
            put(5, new ItemStack(Material.ENDER_PEARL));
        }});
        checkCraft(new EnderHelmet().item, inv, new HashMap<Integer, ItemStack>() {{
            put(3, new ItemStack(Material.ENDER_PEARL));
            put(4, new ItemStack(Material.ENDER_PEARL));
            put(5, new ItemStack(Material.ENDER_PEARL));
            put(6, new ItemStack(Material.ENDER_PEARL));
            put(8, new ItemStack(Material.ENDER_PEARL));
        }});
        checkCraft(new EnderBoots().item, inv, new HashMap<Integer, ItemStack>() {{
            put(3, new ItemStack(Material.ENDER_PEARL));
            put(5, new ItemStack(Material.ENDER_PEARL));
            put(6, new ItemStack(Material.ENDER_PEARL));
            put(8, new ItemStack(Material.ENDER_PEARL));
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
        checkCraft(new CraftableSaddle().item, inv, new HashMap<Integer, ItemStack>() {{
            put(0, new ItemStack(Material.GOLD_BLOCK));
            put(1, new ItemStack(Material.GOLD_BLOCK));
            put(2, new ItemStack(Material.GOLD_BLOCK));
            put(3, new ItemStack(Material.GOLD_BLOCK));
            put(4, new ItemStack(Material.APPLE));
            put(5, new ItemStack(Material.GOLD_BLOCK));
            put(6, new ItemStack(Material.GOLD_BLOCK));
            put(7, new ItemStack(Material.GOLD_BLOCK));
            put(8, new ItemStack(Material.GOLD_BLOCK));
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

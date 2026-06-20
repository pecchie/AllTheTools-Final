package com.pecchie.allthetools.data;

import com.pecchie.allthetools.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredItem;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        // OAK
        addToolAndArmorRecipes(pRecipeOutput, Items.OAK_PLANKS, Items.STICK, ModItems.OAK_WOOD_SWORD, ModItems.OAK_WOOD_PICKAXE, ModItems.OAK_WOOD_AXE, ModItems.OAK_WOOD_SHOVEL, ModItems.OAK_WOOD_HOE, ModItems.OAK_WOOD_HELMET, ModItems.OAK_WOOD_CHESTPLATE, ModItems.OAK_WOOD_LEGGINGS, ModItems.OAK_WOOD_BOOTS, ModItems.OAK_WOOD_SHIELD, ModItems.OAK_WOOD_SPEAR, "oak_wood");
        // SPRUCE
        addToolAndArmorRecipes(pRecipeOutput, Items.SPRUCE_PLANKS, Items.STICK, ModItems.SPRUCE_WOOD_SWORD, ModItems.SPRUCE_WOOD_PICKAXE, ModItems.SPRUCE_WOOD_AXE, ModItems.SPRUCE_WOOD_SHOVEL, ModItems.SPRUCE_WOOD_HOE, ModItems.SPRUCE_WOOD_HELMET, ModItems.SPRUCE_WOOD_CHESTPLATE, ModItems.SPRUCE_WOOD_LEGGINGS, ModItems.SPRUCE_WOOD_BOOTS, ModItems.SPRUCE_WOOD_SHIELD, ModItems.SPRUCE_WOOD_SPEAR, "spruce_wood");
        // BIRCH
        addToolAndArmorRecipes(pRecipeOutput, Items.BIRCH_PLANKS, Items.STICK, ModItems.BIRCH_WOOD_SWORD, ModItems.BIRCH_WOOD_PICKAXE, ModItems.BIRCH_WOOD_AXE, ModItems.BIRCH_WOOD_SHOVEL, ModItems.BIRCH_WOOD_HOE, ModItems.BIRCH_WOOD_HELMET, ModItems.BIRCH_WOOD_CHESTPLATE, ModItems.BIRCH_WOOD_LEGGINGS, ModItems.BIRCH_WOOD_BOOTS, ModItems.BIRCH_WOOD_SHIELD, ModItems.BIRCH_WOOD_SPEAR, "birch_wood");
        // JUNGLE
        addToolAndArmorRecipes(pRecipeOutput, Items.JUNGLE_PLANKS, Items.STICK, ModItems.JUNGLE_WOOD_SWORD, ModItems.JUNGLE_WOOD_PICKAXE, ModItems.JUNGLE_WOOD_AXE, ModItems.JUNGLE_WOOD_SHOVEL, ModItems.JUNGLE_WOOD_HOE, ModItems.JUNGLE_WOOD_HELMET, ModItems.JUNGLE_WOOD_CHESTPLATE, ModItems.JUNGLE_WOOD_LEGGINGS, ModItems.JUNGLE_WOOD_BOOTS, ModItems.JUNGLE_WOOD_SHIELD, ModItems.JUNGLE_WOOD_SPEAR, "jungle_wood");
        // ACACIA
        addToolAndArmorRecipes(pRecipeOutput, Items.ACACIA_PLANKS, Items.STICK, ModItems.ACACIA_WOOD_SWORD, ModItems.ACACIA_WOOD_PICKAXE, ModItems.ACACIA_WOOD_AXE, ModItems.ACACIA_WOOD_SHOVEL, ModItems.ACACIA_WOOD_HOE, ModItems.ACACIA_WOOD_HELMET, ModItems.ACACIA_WOOD_CHESTPLATE, ModItems.ACACIA_WOOD_LEGGINGS, ModItems.ACACIA_WOOD_BOOTS, ModItems.ACACIA_WOOD_SHIELD, ModItems.ACACIA_WOOD_SPEAR, "acacia_wood");
        // DARK OAK
        addToolAndArmorRecipes(pRecipeOutput, Items.DARK_OAK_PLANKS, Items.STICK, ModItems.DARK_OAK_WOOD_SWORD, ModItems.DARK_OAK_WOOD_PICKAXE, ModItems.DARK_OAK_WOOD_AXE, ModItems.DARK_OAK_WOOD_SHOVEL, ModItems.DARK_OAK_WOOD_HOE, ModItems.DARK_OAK_WOOD_HELMET, ModItems.DARK_OAK_WOOD_CHESTPLATE, ModItems.DARK_OAK_WOOD_LEGGINGS, ModItems.DARK_OAK_WOOD_BOOTS, ModItems.DARK_OAK_WOOD_SHIELD, ModItems.DARK_OAK_WOOD_SPEAR, "dark_oak_wood");
        // MANGROVE
        addToolAndArmorRecipes(pRecipeOutput, Items.MANGROVE_PLANKS, Items.STICK, ModItems.MANGROVE_WOOD_SWORD, ModItems.MANGROVE_WOOD_PICKAXE, ModItems.MANGROVE_WOOD_AXE, ModItems.MANGROVE_WOOD_SHOVEL, ModItems.MANGROVE_WOOD_HOE, ModItems.MANGROVE_WOOD_HELMET, ModItems.MANGROVE_WOOD_CHESTPLATE, ModItems.MANGROVE_WOOD_LEGGINGS, ModItems.MANGROVE_WOOD_BOOTS, ModItems.MANGROVE_WOOD_SHIELD, ModItems.MANGROVE_WOOD_SPEAR, "mangrove_wood");
        // CHERRY
        addToolAndArmorRecipes(pRecipeOutput, Items.CHERRY_PLANKS, Items.STICK, ModItems.CHERRY_WOOD_SWORD, ModItems.CHERRY_WOOD_PICKAXE, ModItems.CHERRY_WOOD_AXE, ModItems.CHERRY_WOOD_SHOVEL, ModItems.CHERRY_WOOD_HOE, ModItems.CHERRY_WOOD_HELMET, ModItems.CHERRY_WOOD_CHESTPLATE, ModItems.CHERRY_WOOD_LEGGINGS, ModItems.CHERRY_WOOD_BOOTS, ModItems.CHERRY_WOOD_SHIELD, ModItems.CHERRY_WOOD_SPEAR, "cherry_wood");
        // BAMBOO
        addToolAndArmorRecipes(pRecipeOutput, Items.BAMBOO_PLANKS, Items.STICK, ModItems.BAMBOO_WOOD_SWORD, ModItems.BAMBOO_WOOD_PICKAXE, ModItems.BAMBOO_WOOD_AXE, ModItems.BAMBOO_WOOD_SHOVEL, ModItems.BAMBOO_WOOD_HOE, ModItems.BAMBOO_WOOD_HELMET, ModItems.BAMBOO_WOOD_CHESTPLATE, ModItems.BAMBOO_WOOD_LEGGINGS, ModItems.BAMBOO_WOOD_BOOTS, ModItems.BAMBOO_WOOD_SHIELD, ModItems.BAMBOO_WOOD_SPEAR, "bamboo_wood");
        // CRIMSON
        addToolAndArmorRecipes(pRecipeOutput, Items.CRIMSON_PLANKS, Items.STICK, ModItems.CRIMSON_WOOD_SWORD, ModItems.CRIMSON_WOOD_PICKAXE, ModItems.CRIMSON_WOOD_AXE, ModItems.CRIMSON_WOOD_SHOVEL, ModItems.CRIMSON_WOOD_HOE, ModItems.CRIMSON_WOOD_HELMET, ModItems.CRIMSON_WOOD_CHESTPLATE, ModItems.CRIMSON_WOOD_LEGGINGS, ModItems.CRIMSON_WOOD_BOOTS, ModItems.CRIMSON_WOOD_SHIELD, ModItems.CRIMSON_WOOD_SPEAR, "crimson_wood");
        // WARPED
        addToolAndArmorRecipes(pRecipeOutput, Items.WARPED_PLANKS, Items.STICK, ModItems.WARPED_WOOD_SWORD, ModItems.WARPED_WOOD_PICKAXE, ModItems.WARPED_WOOD_AXE, ModItems.WARPED_WOOD_SHOVEL, ModItems.WARPED_WOOD_HOE, ModItems.WARPED_WOOD_HELMET, ModItems.WARPED_WOOD_CHESTPLATE, ModItems.WARPED_WOOD_LEGGINGS, ModItems.WARPED_WOOD_BOOTS, ModItems.WARPED_WOOD_SHIELD, ModItems.WARPED_WOOD_SPEAR, "warped_wood");

        // FLINT
        addToolAndArmorRecipes(pRecipeOutput, Items.FLINT, Items.STICK, ModItems.FLINT_SWORD, ModItems.FLINT_PICKAXE, ModItems.FLINT_AXE, ModItems.FLINT_SHOVEL, ModItems.FLINT_HOE, ModItems.FLINT_HELMET, ModItems.FLINT_CHESTPLATE, ModItems.FLINT_LEGGINGS, ModItems.FLINT_BOOTS, null, ModItems.FLINT_SPEAR, "flint");
        // STONE
        addToolAndArmorRecipes(pRecipeOutput, Items.COBBLESTONE, Items.STICK, ModItems.STONE_SWORD, ModItems.STONE_PICKAXE, ModItems.STONE_AXE, ModItems.STONE_SHOVEL, ModItems.STONE_HOE, ModItems.STONE_HELMET, ModItems.STONE_CHESTPLATE, ModItems.STONE_LEGGINGS, ModItems.STONE_BOOTS, null, ModItems.STONE_SPEAR, "stone");
        // LEATHER
        addToolAndArmorRecipes(pRecipeOutput, Items.LEATHER, Items.STICK, ModItems.LEATHER_SWORD, ModItems.LEATHER_PICKAXE, ModItems.LEATHER_AXE, ModItems.LEATHER_SHOVEL, ModItems.LEATHER_HOE, ModItems.LEATHER_HELMET, ModItems.LEATHER_CHESTPLATE, ModItems.LEATHER_LEGGINGS, ModItems.LEATHER_BOOTS, null, ModItems.LEATHER_SPEAR, "leather");
        // CHAIN
        addToolAndArmorRecipes(pRecipeOutput, Items.CHAIN, Items.STICK, ModItems.CHAIN_SWORD, ModItems.CHAIN_PICKAXE, ModItems.CHAIN_AXE, ModItems.CHAIN_SHOVEL, ModItems.CHAIN_HOE, ModItems.CHAIN_HELMET, ModItems.CHAIN_CHESTPLATE, ModItems.CHAIN_LEGGINGS, ModItems.CHAIN_BOOTS, null, ModItems.CHAIN_SPEAR, "chain");
        // COPPER
        addToolAndArmorRecipes(pRecipeOutput, Items.COPPER_INGOT, Items.STICK, ModItems.COPPER_SWORD, ModItems.COPPER_PICKAXE, ModItems.COPPER_AXE, ModItems.COPPER_SHOVEL, ModItems.COPPER_HOE, ModItems.COPPER_HELMET, ModItems.COPPER_CHESTPLATE, ModItems.COPPER_LEGGINGS, ModItems.COPPER_BOOTS, null, ModItems.COPPER_SPEAR, "copper");
        // DEEPSLATE
        addToolAndArmorRecipes(pRecipeOutput, Items.COBBLED_DEEPSLATE, Items.STICK, ModItems.DEEPSLATE_SWORD, ModItems.DEEPSLATE_PICKAXE, ModItems.DEEPSLATE_AXE, ModItems.DEEPSLATE_SHOVEL, ModItems.DEEPSLATE_HOE, ModItems.DEEPSLATE_HELMET, ModItems.DEEPSLATE_CHESTPLATE, ModItems.DEEPSLATE_LEGGINGS, ModItems.DEEPSLATE_BOOTS, null, ModItems.DEEPSLATE_SPEAR, "deepslate");
        // OBSIDIAN
        addToolAndArmorRecipes(pRecipeOutput, Items.OBSIDIAN, Items.STICK, ModItems.OBSIDIAN_SWORD, ModItems.OBSIDIAN_PICKAXE, ModItems.OBSIDIAN_AXE, ModItems.OBSIDIAN_SHOVEL, ModItems.OBSIDIAN_HOE, ModItems.OBSIDIAN_HELMET, ModItems.OBSIDIAN_CHESTPLATE, ModItems.OBSIDIAN_LEGGINGS, ModItems.OBSIDIAN_BOOTS, null, ModItems.OBSIDIAN_SPEAR, "obsidian");
        // REDSTONE
        addToolAndArmorRecipes(pRecipeOutput, Items.REDSTONE, Items.STICK, ModItems.REDSTONE_SWORD, ModItems.REDSTONE_PICKAXE, ModItems.REDSTONE_AXE, ModItems.REDSTONE_SHOVEL, ModItems.REDSTONE_HOE, ModItems.REDSTONE_HELMET, ModItems.REDSTONE_CHESTPLATE, ModItems.REDSTONE_LEGGINGS, ModItems.REDSTONE_BOOTS, null, ModItems.REDSTONE_SPEAR, "redstone");
        // LAPIS
        addToolAndArmorRecipes(pRecipeOutput, Items.LAPIS_LAZULI, Items.STICK, ModItems.LAPIS_SWORD, ModItems.LAPIS_PICKAXE, ModItems.LAPIS_AXE, ModItems.LAPIS_SHOVEL, ModItems.LAPIS_HOE, ModItems.LAPIS_HELMET, ModItems.LAPIS_CHESTPLATE, ModItems.LAPIS_LEGGINGS, ModItems.LAPIS_BOOTS, null, ModItems.LAPIS_SPEAR, "lapis");
        // QUARTZ
        addToolAndArmorRecipes(pRecipeOutput, Items.QUARTZ, Items.STICK, ModItems.QUARTZ_SWORD, ModItems.QUARTZ_PICKAXE, ModItems.QUARTZ_AXE, ModItems.QUARTZ_SHOVEL, ModItems.QUARTZ_HOE, ModItems.QUARTZ_HELMET, ModItems.QUARTZ_CHESTPLATE, ModItems.QUARTZ_LEGGINGS, ModItems.QUARTZ_BOOTS, null, ModItems.QUARTZ_SPEAR, "quartz");
        // CARBON FIBER
        addToolAndArmorRecipes(pRecipeOutput, ModItems.CARBON_FIBER_INGOT.get(), Items.STICK, ModItems.CARBON_FIBER_SWORD, ModItems.CARBON_FIBER_PICKAXE, ModItems.CARBON_FIBER_AXE, ModItems.CARBON_FIBER_SHOVEL, ModItems.CARBON_FIBER_HOE, ModItems.CARBON_FIBER_HELMET, ModItems.CARBON_FIBER_CHESTPLATE, ModItems.CARBON_FIBER_LEGGINGS, ModItems.CARBON_FIBER_BOOTS, null, ModItems.CARBON_FIBER_SPEAR, "carbon_fiber");
        // AMETHYST
        addToolAndArmorRecipes(pRecipeOutput, Items.AMETHYST_SHARD, Items.STICK, ModItems.AMETHYST_SWORD, ModItems.AMETHYST_PICKAXE, ModItems.AMETHYST_AXE, ModItems.AMETHYST_SHOVEL, ModItems.AMETHYST_HOE, ModItems.AMETHYST_HELMET, ModItems.AMETHYST_CHESTPLATE, ModItems.AMETHYST_LEGGINGS, ModItems.AMETHYST_BOOTS, null, ModItems.AMETHYST_SPEAR, "amethyst");
        // EMERALD
        addToolAndArmorRecipes(pRecipeOutput, Items.EMERALD, Items.STICK, ModItems.EMERALD_SWORD, ModItems.EMERALD_PICKAXE, ModItems.EMERALD_AXE, ModItems.EMERALD_SHOVEL, ModItems.EMERALD_HOE, ModItems.EMERALD_HELMET, ModItems.EMERALD_CHESTPLATE, ModItems.EMERALD_LEGGINGS, ModItems.EMERALD_BOOTS, null, ModItems.EMERALD_SPEAR, "emerald");
        // ECHO
        addToolAndArmorRecipes(pRecipeOutput, Items.ECHO_SHARD, Items.STICK, ModItems.ECHO_SWORD, ModItems.ECHO_PICKAXE, ModItems.ECHO_AXE, ModItems.ECHO_SHOVEL, ModItems.ECHO_HOE, ModItems.ECHO_HELMET, ModItems.ECHO_CHESTPLATE, ModItems.ECHO_LEGGINGS, ModItems.ECHO_BOOTS, null, ModItems.ECHO_SPEAR, "echo");

        // SPEARS (VANILLA MATERIALS)
        addSpearRecipe(pRecipeOutput, Items.IRON_INGOT, Items.STICK, ModItems.IRON_SPEAR, "iron");
        addSpearRecipe(pRecipeOutput, Items.GOLD_INGOT, Items.STICK, ModItems.GOLD_SPEAR, "gold");
        addSpearRecipe(pRecipeOutput, Items.DIAMOND, Items.STICK, ModItems.DIAMOND_SPEAR, "diamond");
        addSpearRecipe(pRecipeOutput, Items.NETHERITE_INGOT, Items.STICK, ModItems.NETHERITE_SPEAR, "netherite");

        // SPECIAL RECIPES
        // Carbon Fiber Ingot (Cook Coal)
        oreSmelting(pRecipeOutput, java.util.List.of(Items.COAL), RecipeCategory.MISC, ModItems.CARBON_FIBER_INGOT.get(), 0.7f, 200, "carbon_fiber");
        
        // Echo Template Duplication (7 Diamonds + 1 Sculk Block + 1 Template)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get(), 2)
                .pattern("DSD")
                .pattern("DTD")
                .pattern("DDD")
                .define('D', Items.DIAMOND)
                .define('S', Items.SCULK)
                .define('T', ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get())
                .unlockedBy("has_template", has(ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get()))
                .save(pRecipeOutput);
    }

    private void addToolAndArmorRecipes(RecipeOutput output, Item material, Item stick, DeferredItem<Item> sword, DeferredItem<Item> pickaxe, DeferredItem<Item> axe, DeferredItem<Item> shovel, DeferredItem<Item> hoe, DeferredItem<Item> helmet, DeferredItem<Item> chestplate, DeferredItem<Item> leggings, DeferredItem<Item> boots, @Nullable DeferredItem<Item> shield, DeferredItem<Item> spear, String name) {
        // SWORD
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, sword.get())
                .pattern("M")
                .pattern("M")
                .pattern("S")
                .define('M', material)
                .define('S', stick)
                .unlockedBy("has_material", has(material))
                .save(output);
        // PICKAXE
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pickaxe.get())
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', material)
                .define('S', stick)
                .unlockedBy("has_material", has(material))
                .save(output);
        // AXE
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, axe.get())
                .pattern("MM")
                .pattern("MS")
                .pattern(" S")
                .define('M', material)
                .define('S', stick)
                .unlockedBy("has_material", has(material))
                .save(output);
        // SHOVEL
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, shovel.get())
                .pattern("M")
                .pattern("S")
                .pattern("S")
                .define('M', material)
                .define('S', stick)
                .unlockedBy("has_material", has(material))
                .save(output);
        // HOE
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, hoe.get())
                .pattern("MM")
                .pattern(" S")
                .pattern(" S")
                .define('M', material)
                .define('S', stick)
                .unlockedBy("has_material", has(material))
                .save(output);
        // HELMET
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, helmet.get())
                .pattern("MMM")
                .pattern("M M")
                .define('M', material)
                .unlockedBy("has_material", has(material))
                .save(output);
        // CHESTPLATE
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, chestplate.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', material)
                .unlockedBy("has_material", has(material))
                .save(output);
        // LEGGINGS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, leggings.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', material)
                .unlockedBy("has_material", has(material))
                .save(output);
        // BOOTS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, boots.get())
                .pattern("M M")
                .pattern("M M")
                .define('M', material)
                .unlockedBy("has_material", has(material))
                .save(output);
        // SHIELD
        if (shield != null) {
            ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, shield.get())
                    .pattern("MIM")
                    .pattern("MMM")
                    .pattern(" M ")
                    .define('M', material)
                    .define('I', Items.IRON_INGOT)
                    .unlockedBy("has_material", has(material))
                    .save(output);
        }
        // SPEAR
        if (spear != null) {
            addSpearRecipe(output, material, stick, spear, name);
        }
    }

    private void addSpearRecipe(RecipeOutput output, Item material, Item stick, DeferredItem<Item> spear, String name) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, spear.get())
                .pattern("M")
                .pattern("S")
                .pattern("S")
                .define('M', material)
                .define('S', stick)
                .unlockedBy("has_material", has(material))
                .save(output, AllTheTools.MODID + ":" + name + "_spear_recipe");
    }
}

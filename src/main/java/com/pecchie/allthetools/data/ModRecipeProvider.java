package com.pecchie.allthetools.data;

import com.pecchie.allthetools.config.ModConfig;
import com.pecchie.allthetools.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.core.HolderLookup;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends net.minecraft.data.recipes.RecipeProvider {

    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        // Ricette per strumenti e armature di legno (quercia)
        addToolAndArmorRecipes(pRecipeOutput, Items.OAK_PLANKS, Items.STICK, ModItems.OAK_WOOD_SWORD.get(), ModItems.OAK_WOOD_PICKAXE.get(), ModItems.OAK_WOOD_AXE.get(), ModItems.OAK_WOOD_SHOVEL.get(), ModItems.OAK_WOOD_HOE.get(), ModItems.OAK_WOOD_HELMET.get(), ModItems.OAK_WOOD_CHESTPLATE.get(), ModItems.OAK_WOOD_LEGGINGS.get(), ModItems.OAK_WOOD_BOOTS.get(), ModItems.OAK_WOOD_SHIELD.get(), ModItems.OAK_WOOD_SPEAR.get(), "oak_wood");

        // Ricette per tutti gli altri tipi di legno
        if (ModConfig.ENABLE_WOOD_GEAR_VARIANTS.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.SPRUCE_PLANKS, Items.STICK, ModItems.SPRUCE_WOOD_SWORD.get(), ModItems.SPRUCE_WOOD_PICKAXE.get(), ModItems.SPRUCE_WOOD_AXE.get(), ModItems.SPRUCE_WOOD_SHOVEL.get(), ModItems.SPRUCE_WOOD_HOE.get(), ModItems.SPRUCE_WOOD_HELMET.get(), ModItems.SPRUCE_WOOD_CHESTPLATE.get(), ModItems.SPRUCE_WOOD_LEGGINGS.get(), ModItems.SPRUCE_WOOD_BOOTS.get(), ModItems.SPRUCE_WOOD_SHIELD.get(), ModItems.SPRUCE_WOOD_SPEAR.get(), "spruce_wood");
            addToolAndArmorRecipes(pRecipeOutput, Items.BIRCH_PLANKS, Items.STICK, ModItems.BIRCH_WOOD_SWORD.get(), ModItems.BIRCH_WOOD_PICKAXE.get(), ModItems.BIRCH_WOOD_AXE.get(), ModItems.BIRCH_WOOD_SHOVEL.get(), ModItems.BIRCH_WOOD_HOE.get(), ModItems.BIRCH_WOOD_HELMET.get(), ModItems.BIRCH_WOOD_CHESTPLATE.get(), ModItems.BIRCH_WOOD_LEGGINGS.get(), ModItems.BIRCH_WOOD_BOOTS.get(), ModItems.BIRCH_WOOD_SHIELD.get(), ModItems.BIRCH_WOOD_SPEAR.get(), "birch_wood");
            addToolAndArmorRecipes(pRecipeOutput, Items.JUNGLE_PLANKS, Items.STICK, ModItems.JUNGLE_WOOD_SWORD.get(), ModItems.JUNGLE_WOOD_PICKAXE.get(), ModItems.JUNGLE_WOOD_AXE.get(), ModItems.JUNGLE_WOOD_SHOVEL.get(), ModItems.JUNGLE_WOOD_HOE.get(), ModItems.JUNGLE_WOOD_HELMET.get(), ModItems.JUNGLE_WOOD_CHESTPLATE.get(), ModItems.JUNGLE_WOOD_LEGGINGS.get(), ModItems.JUNGLE_WOOD_BOOTS.get(), ModItems.JUNGLE_WOOD_SHIELD.get(), ModItems.JUNGLE_WOOD_SPEAR.get(), "jungle_wood");
            addToolAndArmorRecipes(pRecipeOutput, Items.ACACIA_PLANKS, Items.STICK, ModItems.ACACIA_WOOD_SWORD.get(), ModItems.ACACIA_WOOD_PICKAXE.get(), ModItems.ACACIA_WOOD_AXE.get(), ModItems.ACACIA_WOOD_SHOVEL.get(), ModItems.ACACIA_WOOD_HOE.get(), ModItems.ACACIA_WOOD_HELMET.get(), ModItems.ACACIA_WOOD_CHESTPLATE.get(), ModItems.ACACIA_WOOD_LEGGINGS.get(), ModItems.ACACIA_WOOD_BOOTS.get(), ModItems.ACACIA_WOOD_SHIELD.get(), ModItems.ACACIA_WOOD_SPEAR.get(), "acacia_wood");
            addToolAndArmorRecipes(pRecipeOutput, Items.DARK_OAK_PLANKS, Items.STICK, ModItems.DARK_OAK_WOOD_SWORD.get(), ModItems.DARK_OAK_WOOD_PICKAXE.get(), ModItems.DARK_OAK_WOOD_AXE.get(), ModItems.DARK_OAK_WOOD_SHOVEL.get(), ModItems.DARK_OAK_WOOD_HOE.get(), ModItems.DARK_OAK_WOOD_HELMET.get(), ModItems.DARK_OAK_WOOD_CHESTPLATE.get(), ModItems.DARK_OAK_WOOD_LEGGINGS.get(), ModItems.DARK_OAK_WOOD_BOOTS.get(), ModItems.DARK_OAK_WOOD_SHIELD.get(), ModItems.DARK_OAK_WOOD_SPEAR.get(), "dark_oak_wood");
            addToolAndArmorRecipes(pRecipeOutput, Items.MANGROVE_PLANKS, Items.STICK, ModItems.MANGROVE_WOOD_SWORD.get(), ModItems.MANGROVE_WOOD_PICKAXE.get(), ModItems.MANGROVE_WOOD_AXE.get(), ModItems.MANGROVE_WOOD_SHOVEL.get(), ModItems.MANGROVE_WOOD_HOE.get(), ModItems.MANGROVE_WOOD_HELMET.get(), ModItems.MANGROVE_WOOD_CHESTPLATE.get(), ModItems.MANGROVE_WOOD_LEGGINGS.get(), ModItems.MANGROVE_WOOD_BOOTS.get(), ModItems.MANGROVE_WOOD_SHIELD.get(), ModItems.MANGROVE_WOOD_SPEAR.get(), "mangrove_wood");
            addToolAndArmorRecipes(pRecipeOutput, Items.CHERRY_PLANKS, Items.STICK, ModItems.CHERRY_WOOD_SWORD.get(), ModItems.CHERRY_WOOD_PICKAXE.get(), ModItems.CHERRY_WOOD_AXE.get(), ModItems.CHERRY_WOOD_SHOVEL.get(), ModItems.CHERRY_WOOD_HOE.get(), ModItems.CHERRY_WOOD_HELMET.get(), ModItems.CHERRY_WOOD_CHESTPLATE.get(), ModItems.CHERRY_WOOD_LEGGINGS.get(), ModItems.CHERRY_WOOD_BOOTS.get(), ModItems.CHERRY_WOOD_SHIELD.get(), ModItems.CHERRY_WOOD_SPEAR.get(), "cherry_wood");
            addToolAndArmorRecipes(pRecipeOutput, Items.BAMBOO_PLANKS, Items.STICK, ModItems.BAMBOO_WOOD_SWORD.get(), ModItems.BAMBOO_WOOD_PICKAXE.get(), ModItems.BAMBOO_WOOD_AXE.get(), ModItems.BAMBOO_WOOD_SHOVEL.get(), ModItems.BAMBOO_WOOD_HOE.get(), ModItems.BAMBOO_WOOD_HELMET.get(), ModItems.BAMBOO_WOOD_CHESTPLATE.get(), ModItems.BAMBOO_WOOD_LEGGINGS.get(), ModItems.BAMBOO_WOOD_BOOTS.get(), ModItems.BAMBOO_WOOD_SHIELD.get(), ModItems.BAMBOO_WOOD_SPEAR.get(), "bamboo_wood");
            addToolAndArmorRecipes(pRecipeOutput, Items.CRIMSON_PLANKS, Items.STICK, ModItems.CRIMSON_WOOD_SWORD.get(), ModItems.CRIMSON_WOOD_PICKAXE.get(), ModItems.CRIMSON_WOOD_AXE.get(), ModItems.CRIMSON_WOOD_SHOVEL.get(), ModItems.CRIMSON_WOOD_HOE.get(), ModItems.CRIMSON_WOOD_HELMET.get(), ModItems.CRIMSON_WOOD_CHESTPLATE.get(), ModItems.CRIMSON_WOOD_LEGGINGS.get(), ModItems.CRIMSON_WOOD_BOOTS.get(), ModItems.CRIMSON_WOOD_SHIELD.get(), ModItems.CRIMSON_WOOD_SPEAR.get(), "crimson_wood");
            addToolAndArmorRecipes(pRecipeOutput, Items.WARPED_PLANKS, Items.STICK, ModItems.WARPED_WOOD_SWORD.get(), ModItems.WARPED_WOOD_PICKAXE.get(), ModItems.WARPED_WOOD_AXE.get(), ModItems.WARPED_WOOD_SHOVEL.get(), ModItems.WARPED_WOOD_HOE.get(), ModItems.WARPED_WOOD_HELMET.get(), ModItems.WARPED_WOOD_CHESTPLATE.get(), ModItems.WARPED_WOOD_LEGGINGS.get(), ModItems.WARPED_WOOD_BOOTS.get(), ModItems.WARPED_WOOD_SHIELD.get(), ModItems.WARPED_WOOD_SPEAR.get(), "warped_wood");
        }

        if (ModConfig.ENABLE_FLINT_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.FLINT, Items.STICK, ModItems.FLINT_SWORD.get(), ModItems.FLINT_PICKAXE.get(), ModItems.FLINT_AXE.get(), ModItems.FLINT_SHOVEL.get(), ModItems.FLINT_HOE.get(), ModItems.FLINT_HELMET.get(), ModItems.FLINT_CHESTPLATE.get(), ModItems.FLINT_LEGGINGS.get(), ModItems.FLINT_BOOTS.get(), null, ModItems.FLINT_SPEAR.get(), "flint");
        }

        if (ModConfig.ENABLE_STONE_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.COBBLESTONE, Items.STICK, ModItems.STONE_SWORD.get(), ModItems.STONE_PICKAXE.get(), ModItems.STONE_AXE.get(), ModItems.STONE_SHOVEL.get(), ModItems.STONE_HOE.get(), ModItems.STONE_HELMET.get(), ModItems.STONE_CHESTPLATE.get(), ModItems.STONE_LEGGINGS.get(), ModItems.STONE_BOOTS.get(), null, ModItems.STONE_SPEAR.get(), "stone");
        }

        if (ModConfig.ENABLE_DEEPSLATE_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.COBBLED_DEEPSLATE, Items.STICK, ModItems.DEEPSLATE_SWORD.get(), ModItems.DEEPSLATE_PICKAXE.get(), ModItems.DEEPSLATE_AXE.get(), ModItems.DEEPSLATE_SHOVEL.get(), ModItems.DEEPSLATE_HOE.get(), ModItems.DEEPSLATE_HELMET.get(), ModItems.DEEPSLATE_CHESTPLATE.get(), ModItems.DEEPSLATE_LEGGINGS.get(), ModItems.DEEPSLATE_BOOTS.get(), null, ModItems.DEEPSLATE_SPEAR.get(), "deepslate");
        }

        if (ModConfig.ENABLE_OBSIDIAN_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.OBSIDIAN, Items.STICK, ModItems.OBSIDIAN_SWORD.get(), ModItems.OBSIDIAN_PICKAXE.get(), ModItems.OBSIDIAN_AXE.get(), ModItems.OBSIDIAN_SHOVEL.get(), ModItems.OBSIDIAN_HOE.get(), ModItems.OBSIDIAN_HELMET.get(), ModItems.OBSIDIAN_CHESTPLATE.get(), ModItems.OBSIDIAN_LEGGINGS.get(), ModItems.OBSIDIAN_BOOTS.get(), null, ModItems.OBSIDIAN_SPEAR.get(), "obsidian");
        }

        if (ModConfig.ENABLE_LEATHER_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.LEATHER, Items.STICK, ModItems.LEATHER_SWORD.get(), ModItems.LEATHER_PICKAXE.get(), ModItems.LEATHER_AXE.get(), ModItems.LEATHER_SHOVEL.get(), ModItems.LEATHER_HOE.get(), ModItems.LEATHER_HELMET.get(), ModItems.LEATHER_CHESTPLATE.get(), ModItems.LEATHER_LEGGINGS.get(), ModItems.LEATHER_BOOTS.get(), null, ModItems.LEATHER_SPEAR.get(), "leather");
        }

        if (ModConfig.ENABLE_CHAIN_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.IRON_INGOT, Items.STICK, ModItems.CHAIN_SWORD.get(), ModItems.CHAIN_PICKAXE.get(), ModItems.CHAIN_AXE.get(), ModItems.CHAIN_SHOVEL.get(), ModItems.CHAIN_HOE.get(), ModItems.CHAIN_HELMET.get(), ModItems.CHAIN_CHESTPLATE.get(), ModItems.CHAIN_LEGGINGS.get(), ModItems.CHAIN_BOOTS.get(), null, ModItems.CHAIN_SPEAR.get(), "chain");
        }

        if (ModConfig.ENABLE_REDSTONE_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.REDSTONE, Items.STICK, ModItems.REDSTONE_SWORD.get(), ModItems.REDSTONE_PICKAXE.get(), ModItems.REDSTONE_AXE.get(), ModItems.REDSTONE_SHOVEL.get(), ModItems.REDSTONE_HOE.get(), ModItems.REDSTONE_HELMET.get(), ModItems.REDSTONE_CHESTPLATE.get(), ModItems.REDSTONE_LEGGINGS.get(), ModItems.REDSTONE_BOOTS.get(), null, ModItems.REDSTONE_SPEAR.get(), "redstone");
        }

        if (ModConfig.ENABLE_LAPIS_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.LAPIS_LAZULI, Items.STICK, ModItems.LAPIS_SWORD.get(), ModItems.LAPIS_PICKAXE.get(), ModItems.LAPIS_AXE.get(), ModItems.LAPIS_SHOVEL.get(), ModItems.LAPIS_HOE.get(), ModItems.LAPIS_HELMET.get(), ModItems.LAPIS_CHESTPLATE.get(), ModItems.LAPIS_LEGGINGS.get(), ModItems.LAPIS_BOOTS.get(), null, ModItems.LAPIS_SPEAR.get(), "lapis");
        }

        if (ModConfig.ENABLE_GOLD_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.GOLD_INGOT, Items.STICK, ModItems.GOLD_SWORD.get(), ModItems.GOLD_PICKAXE.get(), ModItems.GOLD_AXE.get(), ModItems.GOLD_SHOVEL.get(), ModItems.GOLD_HOE.get(), ModItems.GOLD_HELMET.get(), ModItems.GOLD_CHESTPLATE.get(), ModItems.GOLD_LEGGINGS.get(), ModItems.GOLD_BOOTS.get(), null, ModItems.GOLD_SPEAR.get(), "gold");
        }

        if (ModConfig.ENABLE_COPPER_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.COPPER_INGOT, Items.STICK, ModItems.COPPER_SWORD.get(), ModItems.COPPER_PICKAXE.get(), ModItems.COPPER_AXE.get(), ModItems.COPPER_SHOVEL.get(), ModItems.COPPER_HOE.get(), ModItems.COPPER_HELMET.get(), ModItems.COPPER_CHESTPLATE.get(), ModItems.COPPER_LEGGINGS.get(), ModItems.COPPER_BOOTS.get(), null, ModItems.COPPER_SPEAR.get(), "copper");
        }

        if (ModConfig.ENABLE_QUARTZ_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.QUARTZ, Items.STICK, ModItems.QUARTZ_SWORD.get(), ModItems.QUARTZ_PICKAXE.get(), ModItems.QUARTZ_AXE.get(), ModItems.QUARTZ_SHOVEL.get(), ModItems.QUARTZ_HOE.get(), ModItems.QUARTZ_HELMET.get(), ModItems.QUARTZ_CHESTPLATE.get(), ModItems.QUARTZ_LEGGINGS.get(), ModItems.QUARTZ_BOOTS.get(), null, ModItems.QUARTZ_SPEAR.get(), "quartz");
        }

        if (ModConfig.ENABLE_CARBON_FIBER_GEAR.get()) {
            SingleItemRecipeBuilder.smelting(Ingredient.of(Items.COAL), RecipeCategory.MISC, ModItems.CARBON_FIBER_INGOT.get(), 0.7F, 200)
                    .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                    .save(pRecipeOutput, "carbon_fiber_ingot_from_smelting_coal");
            addToolAndArmorRecipes(pRecipeOutput, ModItems.CARBON_FIBER_INGOT.get(), Items.STICK, ModItems.CARBON_FIBER_SWORD.get(), ModItems.CARBON_FIBER_PICKAXE.get(), ModItems.CARBON_FIBER_AXE.get(), ModItems.CARBON_FIBER_SHOVEL.get(), ModItems.CARBON_FIBER_HOE.get(), ModItems.CARBON_FIBER_HELMET.get(), ModItems.CARBON_FIBER_CHESTPLATE.get(), ModItems.CARBON_FIBER_LEGGINGS.get(), ModItems.CARBON_FIBER_BOOTS.get(), null, ModItems.CARBON_FIBER_SPEAR.get(), "carbon_fiber");
        }

        if (ModConfig.ENABLE_IRON_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.IRON_INGOT, Items.STICK, ModItems.IRON_SWORD.get(), ModItems.IRON_PICKAXE.get(), ModItems.IRON_AXE.get(), ModItems.IRON_SHOVEL.get(), ModItems.IRON_HOE.get(), ModItems.IRON_HELMET.get(), ModItems.IRON_CHESTPLATE.get(), ModItems.IRON_LEGGINGS.get(), ModItems.IRON_BOOTS.get(), null, ModItems.IRON_SPEAR.get(), "iron");
        }

        if (ModConfig.ENABLE_AMETHYST_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.AMETHYST_SHARD, Items.STICK, ModItems.AMETHYST_SWORD.get(), ModItems.AMETHYST_PICKAXE.get(), ModItems.AMETHYST_AXE.get(), ModItems.AMETHYST_SHOVEL.get(), ModItems.AMETHYST_HOE.get(), ModItems.AMETHYST_HELMET.get(), ModItems.AMETHYST_CHESTPLATE.get(), ModItems.AMETHYST_LEGGINGS.get(), ModItems.AMETHYST_BOOTS.get(), null, ModItems.AMETHYST_SPEAR.get(), "amethyst");
        }

        if (ModConfig.ENABLE_EMERALD_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.EMERALD, Items.STICK, ModItems.EMERALD_SWORD.get(), ModItems.EMERALD_PICKAXE.get(), ModItems.EMERALD_AXE.get(), ModItems.EMERALD_SHOVEL.get(), ModItems.EMERALD_HOE.get(), ModItems.EMERALD_HELMET.get(), ModItems.EMERALD_CHESTPLATE.get(), ModItems.EMERALD_LEGGINGS.get(), ModItems.EMERALD_BOOTS.get(), null, ModItems.EMERALD_SPEAR.get(), "emerald");
        }

        if (ModConfig.ENABLE_DIAMOND_GEAR.get()) {
            addToolAndArmorRecipes(pRecipeOutput, Items.DIAMOND, Items.STICK, ModItems.DIAMOND_SWORD.get(), ModItems.DIAMOND_PICKAXE.get(), ModItems.DIAMOND_AXE.get(), ModItems.DIAMOND_SHOVEL.get(), ModItems.DIAMOND_HOE.get(), ModItems.DIAMOND_HELMET.get(), ModItems.DIAMOND_CHESTPLATE.get(), ModItems.DIAMOND_LEGGINGS.get(), ModItems.DIAMOND_BOOTS.get(), null, ModItems.DIAMOND_SPEAR.get(), "diamond");
        }

        if (ModConfig.ENABLE_ECHO_GEAR.get()) {
            // Smithing Template Duplication
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get(), 2)
                    .pattern("SDS")
                    .pattern("STS")
                    .pattern("SSS")
                    .define('S', Items.SCULK_BLOCK)
                    .define('D', Items.DIAMOND)
                    .define('T', ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get())
                    .unlockedBy("has_template", has(ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get()))
                    .save(pRecipeOutput);

            smithingEcho(pRecipeOutput, Items.NETHERITE_SWORD, ModItems.ECHO_SWORD.get());
            smithingEcho(pRecipeOutput, Items.NETHERITE_PICKAXE, ModItems.ECHO_PICKAXE.get());
            smithingEcho(pRecipeOutput, Items.NETHERITE_AXE, ModItems.ECHO_AXE.get());
            smithingEcho(pRecipeOutput, Items.NETHERITE_SHOVEL, ModItems.ECHO_SHOVEL.get());
            smithingEcho(pRecipeOutput, Items.NETHERITE_HOE, ModItems.ECHO_HOE.get());
            smithingEcho(pRecipeOutput, Items.NETHERITE_HELMET, ModItems.ECHO_HELMET.get());
            smithingEcho(pRecipeOutput, Items.NETHERITE_CHESTPLATE, ModItems.ECHO_CHESTPLATE.get());
            smithingEcho(pRecipeOutput, Items.NETHERITE_LEGGINGS, ModItems.ECHO_LEGGINGS.get());
            smithingEcho(pRecipeOutput, Items.NETHERITE_BOOTS, ModItems.ECHO_BOOTS.get());
            smithingEcho(pRecipeOutput, ModItems.NETHERITE_SPEAR.get(), ModItems.ECHO_SPEAR.get());
        }

        if (ModConfig.ENABLE_NETHERITE_GEAR.get()) {
            smithingNetherite(pRecipeOutput, ModItems.DIAMOND_SWORD.get(), ModItems.NETHERITE_SWORD.get());
            smithingNetherite(pRecipeOutput, ModItems.DIAMOND_PICKAXE.get(), ModItems.NETHERITE_PICKAXE.get());
            smithingNetherite(pRecipeOutput, ModItems.DIAMOND_AXE.get(), ModItems.NETHERITE_AXE.get());
            smithingNetherite(pRecipeOutput, ModItems.DIAMOND_SHOVEL.get(), ModItems.NETHERITE_SHOVEL.get());
            smithingNetherite(pRecipeOutput, ModItems.DIAMOND_HOE.get(), ModItems.NETHERITE_HOE.get());
            smithingNetherite(pRecipeOutput, ModItems.DIAMOND_HELMET.get(), ModItems.NETHERITE_HELMET.get());
            smithingNetherite(pRecipeOutput, ModItems.DIAMOND_CHESTPLATE.get(), ModItems.NETHERITE_CHESTPLATE.get());
            smithingNetherite(pRecipeOutput, ModItems.DIAMOND_LEGGINGS.get(), ModItems.NETHERITE_LEGGINGS.get());
            smithingNetherite(pRecipeOutput, ModItems.DIAMOND_BOOTS.get(), ModItems.NETHERITE_BOOTS.get());
            smithingNetherite(pRecipeOutput, ModItems.DIAMOND_SPEAR.get(), ModItems.NETHERITE_SPEAR.get());
        }
    }

    private void addToolAndArmorRecipes(RecipeOutput pRecipeOutput, ItemLike material, ItemLike handle, ItemLike sword, ItemLike pickaxe, ItemLike axe, ItemLike shovel, ItemLike hoe, @Nullable ItemLike helmet, @Nullable ItemLike chestplate, @Nullable ItemLike leggings, @Nullable ItemLike boots, @Nullable ItemLike shield, @Nullable ItemLike spear, String name) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, sword).pattern("M").pattern("M").pattern("S").define('M', material).define('S', handle).unlockedBy(getHasName(material), has(material)).save(pRecipeOutput, name + "_sword");
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pickaxe).pattern("MMM").pattern(" S ").pattern(" S ").define('M', material).define('S', handle).unlockedBy(getHasName(material), has(material)).save(pRecipeOutput, name + "_pickaxe");
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, axe).pattern("MM").pattern("MS").pattern(" S").define('M', material).define('S', handle).unlockedBy(getHasName(material), has(material)).save(pRecipeOutput, name + "_axe");
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, shovel).pattern("M").pattern("S").pattern("S").define('M', material).define('S', handle).unlockedBy(getHasName(material), has(material)).save(pRecipeOutput, name + "_shovel");
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, hoe).pattern("MM").pattern(" S").pattern(" S").define('M', material).define('S', handle).unlockedBy(getHasName(material), has(material)).save(pRecipeOutput, name + "_hoe");

        if (helmet != null) ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, helmet).pattern("MMM").pattern("M M").define('M', material).unlockedBy(getHasName(material), has(material)).save(pRecipeOutput, name + "_helmet");
        if (chestplate != null) ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, chestplate).pattern("M M").pattern("MMM").pattern("MMM").define('M', material).unlockedBy(getHasName(material), has(material)).save(pRecipeOutput, name + "_chestplate");
        if (leggings != null) ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, leggings).pattern("MMM").pattern("M M").pattern("M M").define('M', material).unlockedBy(getHasName(material), has(material)).save(pRecipeOutput, name + "_leggings");
        if (boots != null) ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, boots).pattern("M M").pattern("M M").define('M', material).unlockedBy(getHasName(material), has(material)).save(pRecipeOutput, name + "_boots");
        if (shield != null) ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, shield).pattern("MWM").pattern("WWW").pattern(" W ").define('M', material).define('W', Items.OAK_PLANKS).unlockedBy(getHasName(material), has(material)).save(pRecipeOutput, name + "_shield");
        if (spear != null) ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, spear).pattern(" M ").pattern(" S ").pattern(" S ").define('M', material).define('S', handle).unlockedBy(getHasName(material), has(material)).save(pRecipeOutput, name + "_spear");
    }

    private void smithingEcho(RecipeOutput pRecipeOutput, ItemLike base, ItemLike result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get()), Ingredient.of(base), Ingredient.of(Items.ECHO_SHARD), RecipeCategory.COMBAT, (net.minecraft.world.item.Item) result)
                .unlocks("has_echo_shard", has(Items.ECHO_SHARD))
                .save(pRecipeOutput, AllTheTools.MODID + ":" + getItemName(result) + "_smithing");
    }

    private void smithingNetherite(RecipeOutput pRecipeOutput, ItemLike base, ItemLike result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(base), Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, (net.minecraft.world.item.Item) result)
                .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .save(pRecipeOutput, AllTheTools.MODID + ":" + getItemName(result) + "_smithing");
    }
}

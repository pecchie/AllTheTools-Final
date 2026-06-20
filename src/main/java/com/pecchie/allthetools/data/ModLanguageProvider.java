package com.pecchie.allthetools.data;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, AllTheTools.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        if (getName().endsWith("en_us")) {
            addEnUs();
        } else if (getName().endsWith("it_it")) {
            addItIt();
        }
    }

    private void addEnUs() {
        add("itemGroup.allthetools_tab", "AllTheTools");
        add(ModItems.CARBON_FIBER_INGOT.get(), "Carbon Fiber Ingot");
        add(ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get(), "Echo Smithing Template");

        // Wood (Oak)
        add(ModItems.OAK_WOOD_SWORD.get(), "Oak Wood Sword");
        add(ModItems.OAK_WOOD_PICKAXE.get(), "Oak Wood Pickaxe");
        add(ModItems.OAK_WOOD_AXE.get(), "Oak Wood Axe");
        add(ModItems.OAK_WOOD_SHOVEL.get(), "Oak Wood Shovel");
        add(ModItems.OAK_WOOD_HOE.get(), "Oak Wood Hoe");
        add(ModItems.OAK_WOOD_HELMET.get(), "Oak Wood Helmet");
        add(ModItems.OAK_WOOD_CHESTPLATE.get(), "Oak Wood Chestplate");
        add(ModItems.OAK_WOOD_LEGGINGS.get(), "Oak Wood Leggings");
        add(ModItems.OAK_WOOD_BOOTS.get(), "Oak Wood Boots");
        add(ModItems.OAK_WOOD_SHIELD.get(), "Oak Wood Shield");
        add(ModItems.OAK_WOOD_SPEAR.get(), "Oak Wood Spear");

        // Altri legni
        addWoodEn(ModItems.SPRUCE_WOOD_SWORD.get(), ModItems.SPRUCE_WOOD_PICKAXE.get(), ModItems.SPRUCE_WOOD_AXE.get(), ModItems.SPRUCE_WOOD_SHOVEL.get(), ModItems.SPRUCE_WOOD_HOE.get(), ModItems.SPRUCE_WOOD_HELMET.get(), ModItems.SPRUCE_WOOD_CHESTPLATE.get(), ModItems.SPRUCE_WOOD_LEGGINGS.get(), ModItems.SPRUCE_WOOD_BOOTS.get(), ModItems.SPRUCE_WOOD_SHIELD.get(), ModItems.SPRUCE_WOOD_SPEAR.get(), "Spruce");
        addWoodEn(ModItems.BIRCH_WOOD_SWORD.get(), ModItems.BIRCH_WOOD_PICKAXE.get(), ModItems.BIRCH_WOOD_AXE.get(), ModItems.BIRCH_WOOD_SHOVEL.get(), ModItems.BIRCH_WOOD_HOE.get(), ModItems.BIRCH_WOOD_HELMET.get(), ModItems.BIRCH_WOOD_CHESTPLATE.get(), ModItems.BIRCH_WOOD_LEGGINGS.get(), ModItems.BIRCH_WOOD_BOOTS.get(), ModItems.BIRCH_WOOD_SHIELD.get(), ModItems.BIRCH_WOOD_SPEAR.get(), "Birch");
        addWoodEn(ModItems.JUNGLE_WOOD_SWORD.get(), ModItems.JUNGLE_WOOD_PICKAXE.get(), ModItems.JUNGLE_WOOD_AXE.get(), ModItems.JUNGLE_WOOD_SHOVEL.get(), ModItems.JUNGLE_WOOD_HOE.get(), ModItems.JUNGLE_WOOD_HELMET.get(), ModItems.JUNGLE_WOOD_CHESTPLATE.get(), ModItems.JUNGLE_WOOD_LEGGINGS.get(), ModItems.JUNGLE_WOOD_BOOTS.get(), ModItems.JUNGLE_WOOD_SHIELD.get(), ModItems.JUNGLE_WOOD_SPEAR.get(), "Jungle");
        addWoodEn(ModItems.ACACIA_WOOD_SWORD.get(), ModItems.ACACIA_WOOD_PICKAXE.get(), ModItems.ACACIA_WOOD_AXE.get(), ModItems.ACACIA_WOOD_SHOVEL.get(), ModItems.ACACIA_WOOD_HOE.get(), ModItems.ACACIA_WOOD_HELMET.get(), ModItems.ACACIA_WOOD_CHESTPLATE.get(), ModItems.ACACIA_WOOD_LEGGINGS.get(), ModItems.ACACIA_WOOD_BOOTS.get(), ModItems.ACACIA_WOOD_SHIELD.get(), ModItems.ACACIA_WOOD_SPEAR.get(), "Acacia");
        addWoodEn(ModItems.DARK_OAK_WOOD_SWORD.get(), ModItems.DARK_OAK_WOOD_PICKAXE.get(), ModItems.DARK_OAK_WOOD_AXE.get(), ModItems.DARK_OAK_WOOD_SHOVEL.get(), ModItems.DARK_OAK_WOOD_HOE.get(), ModItems.DARK_OAK_WOOD_HELMET.get(), ModItems.DARK_OAK_WOOD_CHESTPLATE.get(), ModItems.DARK_OAK_WOOD_LEGGINGS.get(), ModItems.DARK_OAK_WOOD_BOOTS.get(), ModItems.DARK_OAK_WOOD_SHIELD.get(), ModItems.DARK_OAK_WOOD_SPEAR.get(), "Dark Oak");
        addWoodEn(ModItems.MANGROVE_WOOD_SWORD.get(), ModItems.MANGROVE_WOOD_PICKAXE.get(), ModItems.MANGROVE_WOOD_AXE.get(), ModItems.MANGROVE_WOOD_SHOVEL.get(), ModItems.MANGROVE_WOOD_HOE.get(), ModItems.MANGROVE_WOOD_HELMET.get(), ModItems.MANGROVE_WOOD_CHESTPLATE.get(), ModItems.MANGROVE_WOOD_LEGGINGS.get(), ModItems.MANGROVE_WOOD_BOOTS.get(), ModItems.MANGROVE_WOOD_SHIELD.get(), ModItems.MANGROVE_WOOD_SPEAR.get(), "Mangrove");
        addWoodEn(ModItems.CHERRY_WOOD_SWORD.get(), ModItems.CHERRY_WOOD_PICKAXE.get(), ModItems.CHERRY_WOOD_AXE.get(), ModItems.CHERRY_WOOD_SHOVEL.get(), ModItems.CHERRY_WOOD_HOE.get(), ModItems.CHERRY_WOOD_HELMET.get(), ModItems.CHERRY_WOOD_CHESTPLATE.get(), ModItems.CHERRY_WOOD_LEGGINGS.get(), ModItems.CHERRY_WOOD_BOOTS.get(), ModItems.CHERRY_WOOD_SHIELD.get(), ModItems.CHERRY_WOOD_SPEAR.get(), "Cherry");
        addWoodEn(ModItems.BAMBOO_WOOD_SWORD.get(), ModItems.BAMBOO_WOOD_PICKAXE.get(), ModItems.BAMBOO_WOOD_AXE.get(), ModItems.BAMBOO_WOOD_SHOVEL.get(), ModItems.BAMBOO_WOOD_HOE.get(), ModItems.BAMBOO_WOOD_HELMET.get(), ModItems.BAMBOO_WOOD_CHESTPLATE.get(), ModItems.BAMBOO_WOOD_LEGGINGS.get(), ModItems.BAMBOO_WOOD_BOOTS.get(), ModItems.BAMBOO_WOOD_SHIELD.get(), ModItems.BAMBOO_WOOD_SPEAR.get(), "Bamboo");
        addWoodEn(ModItems.CRIMSON_WOOD_SWORD.get(), ModItems.CRIMSON_WOOD_PICKAXE.get(), ModItems.CRIMSON_WOOD_AXE.get(), ModItems.CRIMSON_WOOD_SHOVEL.get(), ModItems.CRIMSON_WOOD_HOE.get(), ModItems.CRIMSON_WOOD_HELMET.get(), ModItems.CRIMSON_WOOD_CHESTPLATE.get(), ModItems.CRIMSON_WOOD_LEGGINGS.get(), ModItems.CRIMSON_WOOD_BOOTS.get(), ModItems.CRIMSON_WOOD_SHIELD.get(), ModItems.CRIMSON_WOOD_SPEAR.get(), "Crimson");
        addWoodEn(ModItems.WARPED_WOOD_SWORD.get(), ModItems.WARPED_WOOD_PICKAXE.get(), ModItems.WARPED_WOOD_AXE.get(), ModItems.WARPED_WOOD_SHOVEL.get(), ModItems.WARPED_WOOD_HOE.get(), ModItems.WARPED_WOOD_HELMET.get(), ModItems.WARPED_WOOD_CHESTPLATE.get(), ModItems.WARPED_WOOD_LEGGINGS.get(), ModItems.WARPED_WOOD_BOOTS.get(), ModItems.WARPED_WOOD_SHIELD.get(), ModItems.WARPED_WOOD_SPEAR.get(), "Warped");

        addSetEn(ModItems.FLINT_SWORD.get(), ModItems.FLINT_PICKAXE.get(), ModItems.FLINT_AXE.get(), ModItems.FLINT_SHOVEL.get(), ModItems.FLINT_HOE.get(), ModItems.FLINT_HELMET.get(), ModItems.FLINT_CHESTPLATE.get(), ModItems.FLINT_LEGGINGS.get(), ModItems.FLINT_BOOTS.get(), ModItems.FLINT_SPEAR.get(), "Flint");
        addSetEn(ModItems.STONE_SWORD.get(), ModItems.STONE_PICKAXE.get(), ModItems.STONE_AXE.get(), ModItems.STONE_SHOVEL.get(), ModItems.STONE_HOE.get(), ModItems.STONE_HELMET.get(), ModItems.STONE_CHESTPLATE.get(), ModItems.STONE_LEGGINGS.get(), ModItems.STONE_BOOTS.get(), ModItems.STONE_SPEAR.get(), "Stone");
        addSetEn(ModItems.LEATHER_SWORD.get(), ModItems.LEATHER_PICKAXE.get(), ModItems.LEATHER_AXE.get(), ModItems.LEATHER_SHOVEL.get(), ModItems.LEATHER_HOE.get(), ModItems.LEATHER_HELMET.get(), ModItems.LEATHER_CHESTPLATE.get(), ModItems.LEATHER_LEGGINGS.get(), ModItems.LEATHER_BOOTS.get(), ModItems.LEATHER_SPEAR.get(), "Leather");
        addSetEn(ModItems.CHAIN_SWORD.get(), ModItems.CHAIN_PICKAXE.get(), ModItems.CHAIN_AXE.get(), ModItems.CHAIN_SHOVEL.get(), ModItems.CHAIN_HOE.get(), ModItems.CHAIN_HELMET.get(), ModItems.CHAIN_CHESTPLATE.get(), ModItems.CHAIN_LEGGINGS.get(), ModItems.CHAIN_BOOTS.get(), ModItems.CHAIN_SPEAR.get(), "Chainmail");
        addSetEn(ModItems.COPPER_SWORD.get(), ModItems.COPPER_PICKAXE.get(), ModItems.COPPER_AXE.get(), ModItems.COPPER_SHOVEL.get(), ModItems.COPPER_HOE.get(), ModItems.COPPER_HELMET.get(), ModItems.COPPER_CHESTPLATE.get(), ModItems.COPPER_LEGGINGS.get(), ModItems.COPPER_BOOTS.get(), ModItems.COPPER_SPEAR.get(), "Copper");
        addSetEn(ModItems.DEEPSLATE_SWORD.get(), ModItems.DEEPSLATE_PICKAXE.get(), ModItems.DEEPSLATE_AXE.get(), ModItems.DEEPSLATE_SHOVEL.get(), ModItems.DEEPSLATE_HOE.get(), ModItems.DEEPSLATE_HELMET.get(), ModItems.DEEPSLATE_CHESTPLATE.get(), ModItems.DEEPSLATE_LEGGINGS.get(), ModItems.DEEPSLATE_BOOTS.get(), ModItems.DEEPSLATE_SPEAR.get(), "Deepslate");
        addSetEn(ModItems.OBSIDIAN_SWORD.get(), ModItems.OBSIDIAN_PICKAXE.get(), ModItems.OBSIDIAN_AXE.get(), ModItems.OBSIDIAN_SHOVEL.get(), ModItems.OBSIDIAN_HOE.get(), ModItems.OBSIDIAN_HELMET.get(), ModItems.OBSIDIAN_CHESTPLATE.get(), ModItems.OBSIDIAN_LEGGINGS.get(), ModItems.OBSIDIAN_BOOTS.get(), ModItems.OBSIDIAN_SPEAR.get(), "Obsidian");
        addSetEn(ModItems.REDSTONE_SWORD.get(), ModItems.REDSTONE_PICKAXE.get(), ModItems.REDSTONE_AXE.get(), ModItems.REDSTONE_SHOVEL.get(), ModItems.REDSTONE_HOE.get(), ModItems.REDSTONE_HELMET.get(), ModItems.REDSTONE_CHESTPLATE.get(), ModItems.REDSTONE_LEGGINGS.get(), ModItems.REDSTONE_BOOTS.get(), ModItems.REDSTONE_SPEAR.get(), "Redstone");
        addSetEn(ModItems.LAPIS_SWORD.get(), ModItems.LAPIS_PICKAXE.get(), ModItems.LAPIS_AXE.get(), ModItems.LAPIS_SHOVEL.get(), ModItems.LAPIS_HOE.get(), ModItems.LAPIS_HELMET.get(), ModItems.LAPIS_CHESTPLATE.get(), ModItems.LAPIS_LEGGINGS.get(), ModItems.LAPIS_BOOTS.get(), ModItems.LAPIS_SPEAR.get(), "Lapis");
        addSetEn(ModItems.QUARTZ_SWORD.get(), ModItems.QUARTZ_PICKAXE.get(), ModItems.QUARTZ_AXE.get(), ModItems.QUARTZ_SHOVEL.get(), ModItems.QUARTZ_HOE.get(), ModItems.QUARTZ_HELMET.get(), ModItems.QUARTZ_CHESTPLATE.get(), ModItems.QUARTZ_LEGGINGS.get(), ModItems.QUARTZ_BOOTS.get(), ModItems.QUARTZ_SPEAR.get(), "Quartz");
        addSetEn(ModItems.CARBON_FIBER_SWORD.get(), ModItems.CARBON_FIBER_PICKAXE.get(), ModItems.CARBON_FIBER_AXE.get(), ModItems.CARBON_FIBER_SHOVEL.get(), ModItems.CARBON_FIBER_HOE.get(), ModItems.CARBON_FIBER_HELMET.get(), ModItems.CARBON_FIBER_CHESTPLATE.get(), ModItems.CARBON_FIBER_LEGGINGS.get(), ModItems.CARBON_FIBER_BOOTS.get(), ModItems.CARBON_FIBER_SPEAR.get(), "Carbon Fiber");
        addSetEn(ModItems.AMETHYST_SWORD.get(), ModItems.AMETHYST_PICKAXE.get(), ModItems.AMETHYST_AXE.get(), ModItems.AMETHYST_SHOVEL.get(), ModItems.AMETHYST_HOE.get(), ModItems.AMETHYST_HELMET.get(), ModItems.AMETHYST_CHESTPLATE.get(), ModItems.AMETHYST_LEGGINGS.get(), ModItems.AMETHYST_BOOTS.get(), ModItems.AMETHYST_SPEAR.get(), "Amethyst");
        addSetEn(ModItems.EMERALD_SWORD.get(), ModItems.EMERALD_PICKAXE.get(), ModItems.EMERALD_AXE.get(), ModItems.EMERALD_SHOVEL.get(), ModItems.EMERALD_HOE.get(), ModItems.EMERALD_HELMET.get(), ModItems.EMERALD_CHESTPLATE.get(), ModItems.EMERALD_LEGGINGS.get(), ModItems.EMERALD_BOOTS.get(), ModItems.EMERALD_SPEAR.get(), "Emerald");
        addSetEn(ModItems.ECHO_SWORD.get(), ModItems.ECHO_PICKAXE.get(), ModItems.ECHO_AXE.get(), ModItems.ECHO_SHOVEL.get(), ModItems.ECHO_HOE.get(), ModItems.ECHO_HELMET.get(), ModItems.ECHO_CHESTPLATE.get(), ModItems.ECHO_LEGGINGS.get(), ModItems.ECHO_BOOTS.get(), ModItems.ECHO_SPEAR.get(), "Echo");

        add(ModItems.IRON_SPEAR.get(), "Iron Spear");
        add(ModItems.GOLD_SPEAR.get(), "Gold Spear");
        add(ModItems.DIAMOND_SPEAR.get(), "Diamond Spear");
        add(ModItems.NETHERITE_SPEAR.get(), "Netherite Spear");
    }

    private void addItIt() {
        add("itemGroup.allthetools_tab", "AllTheTools");
        add(ModItems.CARBON_FIBER_INGOT.get(), "Lingotto di Fibra di Carbone");
        add(ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get(), "Template da Forgiatura Echo");

        // Legno (Quercia)
        add(ModItems.OAK_WOOD_SWORD.get(), "Spada di Legno di Quercia");
        add(ModItems.OAK_WOOD_PICKAXE.get(), "Piccone di Legno di Quercia");
        add(ModItems.OAK_WOOD_AXE.get(), "Ascia di Legno di Quercia");
        add(ModItems.OAK_WOOD_SHOVEL.get(), "Pala di Legno di Quercia");
        add(ModItems.OAK_WOOD_HOE.get(), "Zappa di Legno di Quercia");
        add(ModItems.OAK_WOOD_HELMET.get(), "Elmo di Legno di Quercia");
        add(ModItems.OAK_WOOD_CHESTPLATE.get(), "Corazza di Legno di Quercia");
        add(ModItems.OAK_WOOD_LEGGINGS.get(), "Gambali di Legno di Quercia");
        add(ModItems.OAK_WOOD_BOOTS.get(), "Stivali di Legno di Quercia");
        add(ModItems.OAK_WOOD_SHIELD.get(), "Scudo di Legno di Quercia");
        add(ModItems.OAK_WOOD_SPEAR.get(), "Lancia di Legno di Quercia");

        // Altri legni
        addWoodIt(ModItems.SPRUCE_WOOD_SWORD.get(), ModItems.SPRUCE_WOOD_PICKAXE.get(), ModItems.SPRUCE_WOOD_AXE.get(), ModItems.SPRUCE_WOOD_SHOVEL.get(), ModItems.SPRUCE_WOOD_HOE.get(), ModItems.SPRUCE_WOOD_HELMET.get(), ModItems.SPRUCE_WOOD_CHESTPLATE.get(), ModItems.SPRUCE_WOOD_LEGGINGS.get(), ModItems.SPRUCE_WOOD_BOOTS.get(), ModItems.SPRUCE_WOOD_SHIELD.get(), ModItems.SPRUCE_WOOD_SPEAR.get(), "Abete");
        addWoodIt(ModItems.BIRCH_WOOD_SWORD.get(), ModItems.BIRCH_WOOD_PICKAXE.get(), ModItems.BIRCH_WOOD_AXE.get(), ModItems.BIRCH_WOOD_SHOVEL.get(), ModItems.BIRCH_WOOD_HOE.get(), ModItems.BIRCH_WOOD_HELMET.get(), ModItems.BIRCH_WOOD_CHESTPLATE.get(), ModItems.BIRCH_WOOD_LEGGINGS.get(), ModItems.BIRCH_WOOD_BOOTS.get(), ModItems.BIRCH_WOOD_SHIELD.get(), ModItems.BIRCH_WOOD_SPEAR.get(), "Betulla");
        addWoodIt(ModItems.JUNGLE_WOOD_SWORD.get(), ModItems.JUNGLE_WOOD_PICKAXE.get(), ModItems.JUNGLE_WOOD_AXE.get(), ModItems.JUNGLE_WOOD_SHOVEL.get(), ModItems.JUNGLE_WOOD_HOE.get(), ModItems.JUNGLE_WOOD_HELMET.get(), ModItems.JUNGLE_WOOD_CHESTPLATE.get(), ModItems.JUNGLE_WOOD_LEGGINGS.get(), ModItems.JUNGLE_WOOD_BOOTS.get(), ModItems.JUNGLE_WOOD_SHIELD.get(), ModItems.JUNGLE_WOOD_SPEAR.get(), "Giungla");
        addWoodIt(ModItems.ACACIA_WOOD_SWORD.get(), ModItems.ACACIA_WOOD_PICKAXE.get(), ModItems.ACACIA_WOOD_AXE.get(), ModItems.ACACIA_WOOD_SHOVEL.get(), ModItems.ACACIA_WOOD_HOE.get(), ModItems.ACACIA_WOOD_HELMET.get(), ModItems.ACACIA_WOOD_CHESTPLATE.get(), ModItems.ACACIA_WOOD_LEGGINGS.get(), ModItems.ACACIA_WOOD_BOOTS.get(), ModItems.ACACIA_WOOD_SHIELD.get(), ModItems.ACACIA_WOOD_SPEAR.get(), "Acacia");
        addWoodIt(ModItems.DARK_OAK_WOOD_SWORD.get(), ModItems.DARK_OAK_WOOD_PICKAXE.get(), ModItems.DARK_OAK_WOOD_AXE.get(), ModItems.DARK_OAK_WOOD_SHOVEL.get(), ModItems.DARK_OAK_WOOD_HOE.get(), ModItems.DARK_OAK_WOOD_HELMET.get(), ModItems.DARK_OAK_WOOD_CHESTPLATE.get(), ModItems.DARK_OAK_WOOD_LEGGINGS.get(), ModItems.DARK_OAK_WOOD_BOOTS.get(), ModItems.DARK_OAK_WOOD_SHIELD.get(), ModItems.DARK_OAK_WOOD_SPEAR.get(), "Quercia Scura");
        addWoodIt(ModItems.MANGROVE_WOOD_SWORD.get(), ModItems.MANGROVE_WOOD_PICKAXE.get(), ModItems.MANGROVE_WOOD_AXE.get(), ModItems.MANGROVE_WOOD_SHOVEL.get(), ModItems.MANGROVE_WOOD_HOE.get(), ModItems.MANGROVE_WOOD_HELMET.get(), ModItems.MANGROVE_WOOD_CHESTPLATE.get(), ModItems.MANGROVE_WOOD_LEGGINGS.get(), ModItems.MANGROVE_WOOD_BOOTS.get(), ModItems.MANGROVE_WOOD_SHIELD.get(), ModItems.MANGROVE_WOOD_SPEAR.get(), "Mangrovia");
        addWoodIt(ModItems.CHERRY_WOOD_SWORD.get(), ModItems.CHERRY_WOOD_PICKAXE.get(), ModItems.CHERRY_WOOD_AXE.get(), ModItems.CHERRY_WOOD_SHOVEL.get(), ModItems.CHERRY_WOOD_HOE.get(), ModItems.CHERRY_WOOD_HELMET.get(), ModItems.CHERRY_WOOD_CHESTPLATE.get(), ModItems.CHERRY_WOOD_LEGGINGS.get(), ModItems.CHERRY_WOOD_BOOTS.get(), ModItems.CHERRY_WOOD_SHIELD.get(), ModItems.CHERRY_WOOD_SPEAR.get(), "Ciliegio");
        addWoodIt(ModItems.BAMBOO_WOOD_SWORD.get(), ModItems.BAMBOO_WOOD_PICKAXE.get(), ModItems.BAMBOO_WOOD_AXE.get(), ModItems.BAMBOO_WOOD_SHOVEL.get(), ModItems.BAMBOO_WOOD_HOE.get(), ModItems.BAMBOO_WOOD_HELMET.get(), ModItems.BAMBOO_WOOD_CHESTPLATE.get(), ModItems.BAMBOO_WOOD_LEGGINGS.get(), ModItems.BAMBOO_WOOD_BOOTS.get(), ModItems.BAMBOO_WOOD_SHIELD.get(), ModItems.BAMBOO_WOOD_SPEAR.get(), "Bambù");
        addWoodIt(ModItems.CRIMSON_WOOD_SWORD.get(), ModItems.CRIMSON_WOOD_PICKAXE.get(), ModItems.CRIMSON_WOOD_AXE.get(), ModItems.CRIMSON_WOOD_SHOVEL.get(), ModItems.CRIMSON_WOOD_HOE.get(), ModItems.CRIMSON_WOOD_HELMET.get(), ModItems.CRIMSON_WOOD_CHESTPLATE.get(), ModItems.CRIMSON_WOOD_LEGGINGS.get(), ModItems.CRIMSON_WOOD_BOOTS.get(), ModItems.CRIMSON_WOOD_SHIELD.get(), ModItems.CRIMSON_WOOD_SPEAR.get(), "Cremisi");
        addWoodIt(ModItems.WARPED_WOOD_SWORD.get(), ModItems.WARPED_WOOD_PICKAXE.get(), ModItems.WARPED_WOOD_AXE.get(), ModItems.WARPED_WOOD_SHOVEL.get(), ModItems.WARPED_WOOD_HOE.get(), ModItems.WARPED_WOOD_HELMET.get(), ModItems.WARPED_WOOD_CHESTPLATE.get(), ModItems.WARPED_WOOD_LEGGINGS.get(), ModItems.WARPED_WOOD_BOOTS.get(), ModItems.WARPED_WOOD_SHIELD.get(), ModItems.WARPED_WOOD_SPEAR.get(), "Deformato");

        addSetIt(ModItems.FLINT_SWORD.get(), ModItems.FLINT_PICKAXE.get(), ModItems.FLINT_AXE.get(), ModItems.FLINT_SHOVEL.get(), ModItems.FLINT_HOE.get(), ModItems.FLINT_HELMET.get(), ModItems.FLINT_CHESTPLATE.get(), ModItems.FLINT_LEGGINGS.get(), ModItems.FLINT_BOOTS.get(), ModItems.FLINT_SPEAR.get(), "Selce");
        addSetIt(ModItems.STONE_SWORD.get(), ModItems.STONE_PICKAXE.get(), ModItems.STONE_AXE.get(), ModItems.STONE_SHOVEL.get(), ModItems.STONE_HOE.get(), ModItems.STONE_HELMET.get(), ModItems.STONE_CHESTPLATE.get(), ModItems.STONE_LEGGINGS.get(), ModItems.STONE_BOOTS.get(), ModItems.STONE_SPEAR.get(), "Pietra");
        addSetIt(ModItems.LEATHER_SWORD.get(), ModItems.LEATHER_PICKAXE.get(), ModItems.LEATHER_AXE.get(), ModItems.LEATHER_SHOVEL.get(), ModItems.LEATHER_HOE.get(), ModItems.LEATHER_HELMET.get(), ModItems.LEATHER_CHESTPLATE.get(), ModItems.LEATHER_LEGGINGS.get(), ModItems.LEATHER_BOOTS.get(), ModItems.LEATHER_SPEAR.get(), "Cuoio");
        addSetIt(ModItems.CHAIN_SWORD.get(), ModItems.CHAIN_PICKAXE.get(), ModItems.CHAIN_AXE.get(), ModItems.CHAIN_SHOVEL.get(), ModItems.CHAIN_HOE.get(), ModItems.CHAIN_HELMET.get(), ModItems.CHAIN_CHESTPLATE.get(), ModItems.CHAIN_LEGGINGS.get(), ModItems.CHAIN_BOOTS.get(), ModItems.CHAIN_SPEAR.get(), "Maglia");
        addSetIt(ModItems.COPPER_SWORD.get(), ModItems.COPPER_PICKAXE.get(), ModItems.COPPER_AXE.get(), ModItems.COPPER_SHOVEL.get(), ModItems.COPPER_HOE.get(), ModItems.COPPER_HELMET.get(), ModItems.COPPER_CHESTPLATE.get(), ModItems.COPPER_LEGGINGS.get(), ModItems.COPPER_BOOTS.get(), ModItems.COPPER_SPEAR.get(), "Rame");
        addSetIt(ModItems.DEEPSLATE_SWORD.get(), ModItems.DEEPSLATE_PICKAXE.get(), ModItems.DEEPSLATE_AXE.get(), ModItems.DEEPSLATE_SHOVEL.get(), ModItems.DEEPSLATE_HOE.get(), ModItems.DEEPSLATE_HELMET.get(), ModItems.DEEPSLATE_CHESTPLATE.get(), ModItems.DEEPSLATE_LEGGINGS.get(), ModItems.DEEPSLATE_BOOTS.get(), ModItems.DEEPSLATE_SPEAR.get(), "Ardesia Profonda");
        addSetIt(ModItems.OBSIDIAN_SWORD.get(), ModItems.OBSIDIAN_PICKAXE.get(), ModItems.OBSIDIAN_AXE.get(), ModItems.OBSIDIAN_SHOVEL.get(), ModItems.OBSIDIAN_HOE.get(), ModItems.OBSIDIAN_HELMET.get(), ModItems.OBSIDIAN_CHESTPLATE.get(), ModItems.OBSIDIAN_LEGGINGS.get(), ModItems.OBSIDIAN_BOOTS.get(), ModItems.OBSIDIAN_SPEAR.get(), "Ossidiana");
        addSetIt(ModItems.REDSTONE_SWORD.get(), ModItems.REDSTONE_PICKAXE.get(), ModItems.REDSTONE_AXE.get(), ModItems.REDSTONE_SHOVEL.get(), ModItems.REDSTONE_HOE.get(), ModItems.REDSTONE_HELMET.get(), ModItems.REDSTONE_CHESTPLATE.get(), ModItems.REDSTONE_LEGGINGS.get(), ModItems.REDSTONE_BOOTS.get(), ModItems.REDSTONE_SPEAR.get(), "Redstone");
        addSetIt(ModItems.LAPIS_SWORD.get(), ModItems.LAPIS_PICKAXE.get(), ModItems.LAPIS_AXE.get(), ModItems.LAPIS_SHOVEL.get(), ModItems.LAPIS_HOE.get(), ModItems.LAPIS_HELMET.get(), ModItems.LAPIS_CHESTPLATE.get(), ModItems.LAPIS_LEGGINGS.get(), ModItems.LAPIS_BOOTS.get(), ModItems.LAPIS_SPEAR.get(), "Lapislazzuli");
        addSetIt(ModItems.QUARTZ_SWORD.get(), ModItems.QUARTZ_PICKAXE.get(), ModItems.QUARTZ_AXE.get(), ModItems.QUARTZ_SHOVEL.get(), ModItems.QUARTZ_HOE.get(), ModItems.QUARTZ_HELMET.get(), ModItems.QUARTZ_CHESTPLATE.get(), ModItems.QUARTZ_LEGGINGS.get(), ModItems.QUARTZ_BOOTS.get(), ModItems.QUARTZ_SPEAR.get(), "Quarzo");
        addSetIt(ModItems.CARBON_FIBER_SWORD.get(), ModItems.CARBON_FIBER_PICKAXE.get(), ModItems.CARBON_FIBER_AXE.get(), ModItems.CARBON_FIBER_SHOVEL.get(), ModItems.CARBON_FIBER_HOE.get(), ModItems.CARBON_FIBER_HELMET.get(), ModItems.CARBON_FIBER_CHESTPLATE.get(), ModItems.CARBON_FIBER_LEGGINGS.get(), ModItems.CARBON_FIBER_BOOTS.get(), ModItems.CARBON_FIBER_SPEAR.get(), "Fibra di Carbone");
        addSetIt(ModItems.AMETHYST_SWORD.get(), ModItems.AMETHYST_PICKAXE.get(), ModItems.AMETHYST_AXE.get(), ModItems.AMETHYST_SHOVEL.get(), ModItems.AMETHYST_HOE.get(), ModItems.AMETHYST_HELMET.get(), ModItems.AMETHYST_CHESTPLATE.get(), ModItems.AMETHYST_LEGGINGS.get(), ModItems.AMETHYST_BOOTS.get(), ModItems.AMETHYST_SPEAR.get(), "Ametista");
        addSetIt(ModItems.EMERALD_SWORD.get(), ModItems.EMERALD_PICKAXE.get(), ModItems.EMERALD_AXE.get(), ModItems.EMERALD_SHOVEL.get(), ModItems.EMERALD_HOE.get(), ModItems.EMERALD_HELMET.get(), ModItems.EMERALD_CHESTPLATE.get(), ModItems.EMERALD_LEGGINGS.get(), ModItems.EMERALD_BOOTS.get(), ModItems.EMERALD_SPEAR.get(), "Smeraldo");
        addSetIt(ModItems.ECHO_SWORD.get(), ModItems.ECHO_PICKAXE.get(), ModItems.ECHO_AXE.get(), ModItems.ECHO_SHOVEL.get(), ModItems.ECHO_HOE.get(), ModItems.ECHO_HELMET.get(), ModItems.ECHO_CHESTPLATE.get(), ModItems.ECHO_LEGGINGS.get(), ModItems.ECHO_BOOTS.get(), ModItems.ECHO_SPEAR.get(), "Echo");

        add(ModItems.IRON_SPEAR.get(), "Lancia di Ferro");
        add(ModItems.GOLD_SPEAR.get(), "Lancia d'Oro");
        add(ModItems.DIAMOND_SPEAR.get(), "Lancia di Diamante");
        add(ModItems.NETHERITE_SPEAR.get(), "Lancia di Netherite");
    }

    private void addWoodEn(net.minecraft.world.item.Item sword, net.minecraft.world.item.Item pickaxe, net.minecraft.world.item.Item axe, net.minecraft.world.item.Item shovel, net.minecraft.world.item.Item hoe, net.minecraft.world.item.Item helmet, net.minecraft.world.item.Item chestplate, net.minecraft.world.item.Item leggings, net.minecraft.world.item.Item boots, net.minecraft.world.item.Item shield, net.minecraft.world.item.Item spear, String name) {
        add(sword, name + " Wood Sword");
        add(pickaxe, name + " Wood Pickaxe");
        add(axe, name + " Wood Axe");
        add(shovel, name + " Wood Shovel");
        add(hoe, name + " Wood Hoe");
        add(helmet, name + " Wood Helmet");
        add(chestplate, name + " Wood Chestplate");
        add(leggings, name + " Wood Leggings");
        add(boots, name + " Wood Boots");
        add(shield, name + " Wood Shield");
        add(spear, name + " Wood Spear");
    }

    private void addSetEn(net.minecraft.world.item.Item sword, net.minecraft.world.item.Item pickaxe, net.minecraft.world.item.Item axe, net.minecraft.world.item.Item shovel, net.minecraft.world.item.Item hoe, net.minecraft.world.item.Item helmet, net.minecraft.world.item.Item chestplate, net.minecraft.world.item.Item leggings, net.minecraft.world.item.Item boots, net.minecraft.world.item.Item spear, String name) {
        add(sword, name + " Sword");
        add(pickaxe, name + " Pickaxe");
        add(axe, name + " Axe");
        add(shovel, name + " Shovel");
        add(hoe, name + " Hoe");
        add(helmet, name + " Helmet");
        add(chestplate, name + " Chestplate");
        add(leggings, name + " Leggings");
        add(boots, name + " Boots");
        add(spear, name + " Spear");
    }

    private void addWoodIt(net.minecraft.world.item.Item sword, net.minecraft.world.item.Item pickaxe, net.minecraft.world.item.Item axe, net.minecraft.world.item.Item shovel, net.minecraft.world.item.Item hoe, net.minecraft.world.item.Item helmet, net.minecraft.world.item.Item chestplate, net.minecraft.world.item.Item leggings, net.minecraft.world.item.Item boots, net.minecraft.world.item.Item shield, net.minecraft.world.item.Item spear, String name) {
        add(sword, "Spada di Legno di " + name);
        add(pickaxe, "Piccone di Legno di " + name);
        add(axe, "Ascia di Legno di " + name);
        add(shovel, "Pala di Legno di " + name);
        add(hoe, "Zappa di Legno di " + name);
        add(helmet, "Elmo di Legno di " + name);
        add(chestplate, "Corazza di Legno di " + name);
        add(leggings, "Gambali di Legno di " + name);
        add(boots, "Stivali di Legno di " + name);
        add(shield, "Scudo di Legno di " + name);
        add(spear, "Lancia di Legno di " + name);
    }

    private void addSetIt(net.minecraft.world.item.Item sword, net.minecraft.world.item.Item pickaxe, net.minecraft.world.item.Item axe, net.minecraft.world.item.Item shovel, net.minecraft.world.item.Item hoe, net.minecraft.world.item.Item helmet, net.minecraft.world.item.Item chestplate, net.minecraft.world.item.Item leggings, net.minecraft.world.item.Item boots, net.minecraft.world.item.Item spear, String name) {
        add(sword, "Spada di " + name);
        add(pickaxe, "Piccone di " + name);
        add(axe, "Ascia di " + name);
        add(shovel, "Pala di " + name);
        add(hoe, "Zappa di " + name);
        add(helmet, "Elmo di " + name);
        add(chestplate, "Corazza di " + name);
        add(leggings, "Gambali di " + name);
        add(boots, "Stivali di " + name);
        add(spear, "Lancia di " + name);
    }
}

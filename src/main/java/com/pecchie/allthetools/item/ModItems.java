package com.pecchie.allthetools.item;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.item.armor.CustomEchoArmorItem;
import com.pecchie.allthetools.item.armor.CustomEmeraldArmorItem;
import com.pecchie.allthetools.item.armor.CustomLapisArmorItem;
import com.pecchie.allthetools.item.armor.CustomObsidianArmorItem;
import com.pecchie.allthetools.item.armor.CustomRedstoneArmorItem;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AllTheTools.MODID);

    // === WOOD TOOLS (OAK) ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OAK_WOOD_SWORD = ITEMS.register("oak_wood_sword",
            () -> new SwordItem(ModToolTiers.WOOD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OAK_WOOD_PICKAXE = ITEMS.register("oak_wood_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WOOD, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OAK_WOOD_AXE = ITEMS.register("oak_wood_axe",
            () -> new AxeItem(ModToolTiers.WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OAK_WOOD_SHOVEL = ITEMS.register("oak_wood_shovel",
            () -> new ShovelItem(ModToolTiers.WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OAK_WOOD_HOE = ITEMS.register("oak_wood_hoe",
            () -> new HoeItem(ModToolTiers.WOOD, -2, -1.0F, new Item.Properties()));

    // === SPRUCE WOOD TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> SPRUCE_WOOD_SWORD = ITEMS.register("spruce_wood_sword",
            () -> new SwordItem(ModToolTiers.SPRUCE_WOOD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> SPRUCE_WOOD_PICKAXE = ITEMS.register("spruce_wood_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SPRUCE_WOOD, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> SPRUCE_WOOD_AXE = ITEMS.register("spruce_wood_axe",
            () -> new AxeItem(ModToolTiers.SPRUCE_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> SPRUCE_WOOD_SHOVEL = ITEMS.register("spruce_wood_shovel",
            () -> new ShovelItem(ModToolTiers.SPRUCE_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> SPRUCE_WOOD_HOE = ITEMS.register("spruce_wood_hoe",
            () -> new HoeItem(ModToolTiers.SPRUCE_WOOD, -2, -1.0F, new Item.Properties()));

    // === BIRCH WOOD TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BIRCH_WOOD_SWORD = ITEMS.register("birch_wood_sword",
            () -> new SwordItem(ModToolTiers.BIRCH_WOOD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BIRCH_WOOD_PICKAXE = ITEMS.register("birch_wood_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BIRCH_WOOD, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BIRCH_WOOD_AXE = ITEMS.register("birch_wood_axe",
            () -> new AxeItem(ModToolTiers.BIRCH_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BIRCH_WOOD_SHOVEL = ITEMS.register("birch_wood_shovel",
            () -> new ShovelItem(ModToolTiers.BIRCH_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BIRCH_WOOD_HOE = ITEMS.register("birch_wood_hoe",
            () -> new HoeItem(ModToolTiers.BIRCH_WOOD, -2, -1.0F, new Item.Properties()));

    // === JUNGLE WOOD TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> JUNGLE_WOOD_SWORD = ITEMS.register("jungle_wood_sword",
            () -> new SwordItem(ModToolTiers.JUNGLE_WOOD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> JUNGLE_WOOD_PICKAXE = ITEMS.register("jungle_wood_pickaxe",
            () -> new PickaxeItem(ModToolTiers.JUNGLE_WOOD, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> JUNGLE_WOOD_AXE = ITEMS.register("jungle_wood_axe",
            () -> new AxeItem(ModToolTiers.JUNGLE_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> JUNGLE_WOOD_SHOVEL = ITEMS.register("jungle_wood_shovel",
            () -> new ShovelItem(ModToolTiers.JUNGLE_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> JUNGLE_WOOD_HOE = ITEMS.register("jungle_wood_hoe",
            () -> new HoeItem(ModToolTiers.JUNGLE_WOOD, -2, -1.0F, new Item.Properties()));

    // === ACACIA WOOD TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ACACIA_WOOD_SWORD = ITEMS.register("acacia_wood_sword",
            () -> new SwordItem(ModToolTiers.ACACIA_WOOD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ACACIA_WOOD_PICKAXE = ITEMS.register("acacia_wood_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ACACIA_WOOD, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ACACIA_WOOD_AXE = ITEMS.register("acacia_wood_axe",
            () -> new AxeItem(ModToolTiers.ACACIA_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ACACIA_WOOD_SHOVEL = ITEMS.register("acacia_wood_shovel",
            () -> new ShovelItem(ModToolTiers.ACACIA_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ACACIA_WOOD_HOE = ITEMS.register("acacia_wood_hoe",
            () -> new HoeItem(ModToolTiers.ACACIA_WOOD, -2, -1.0F, new Item.Properties()));

    // === DARK OAK WOOD TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DARK_OAK_WOOD_SWORD = ITEMS.register("dark_oak_wood_sword",
            () -> new SwordItem(ModToolTiers.DARK_OAK_WOOD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DARK_OAK_WOOD_PICKAXE = ITEMS.register("dark_oak_wood_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DARK_OAK_WOOD, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DARK_OAK_WOOD_AXE = ITEMS.register("dark_oak_wood_axe",
            () -> new AxeItem(ModToolTiers.DARK_OAK_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DARK_OAK_WOOD_SHOVEL = ITEMS.register("dark_oak_wood_shovel",
            () -> new ShovelItem(ModToolTiers.DARK_OAK_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DARK_OAK_WOOD_HOE = ITEMS.register("dark_oak_wood_hoe",
            () -> new HoeItem(ModToolTiers.DARK_OAK_WOOD, -2, -1.0F, new Item.Properties()));

    // === MANGROVE WOOD TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> MANGROVE_WOOD_SWORD = ITEMS.register("mangrove_wood_sword",
            () -> new SwordItem(ModToolTiers.MANGROVE_WOOD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> MANGROVE_WOOD_PICKAXE = ITEMS.register("mangrove_wood_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MANGROVE_WOOD, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> MANGROVE_WOOD_AXE = ITEMS.register("mangrove_wood_axe",
            () -> new AxeItem(ModToolTiers.MANGROVE_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> MANGROVE_WOOD_SHOVEL = ITEMS.register("mangrove_wood_shovel",
            () -> new ShovelItem(ModToolTiers.MANGROVE_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> MANGROVE_WOOD_HOE = ITEMS.register("mangrove_wood_hoe",
            () -> new HoeItem(ModToolTiers.MANGROVE_WOOD, -2, -1.0F, new Item.Properties()));

    // === CHERRY WOOD TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHERRY_WOOD_SWORD = ITEMS.register("cherry_wood_sword",
            () -> new SwordItem(ModToolTiers.CHERRY_WOOD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHERRY_WOOD_PICKAXE = ITEMS.register("cherry_wood_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHERRY_WOOD, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHERRY_WOOD_AXE = ITEMS.register("cherry_wood_axe",
            () -> new AxeItem(ModToolTiers.CHERRY_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHERRY_WOOD_SHOVEL = ITEMS.register("cherry_wood_shovel",
            () -> new ShovelItem(ModToolTiers.CHERRY_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHERRY_WOOD_HOE = ITEMS.register("cherry_wood_hoe",
            () -> new HoeItem(ModToolTiers.CHERRY_WOOD, -2, -1.0F, new Item.Properties()));

    // === BAMBOO WOOD TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BAMBOO_WOOD_SWORD = ITEMS.register("bamboo_wood_sword",
            () -> new SwordItem(ModToolTiers.BAMBOO_WOOD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BAMBOO_WOOD_PICKAXE = ITEMS.register("bamboo_wood_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BAMBOO_WOOD, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BAMBOO_WOOD_AXE = ITEMS.register("bamboo_wood_axe",
            () -> new AxeItem(ModToolTiers.BAMBOO_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BAMBOO_WOOD_SHOVEL = ITEMS.register("bamboo_wood_shovel",
            () -> new ShovelItem(ModToolTiers.BAMBOO_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BAMBOO_WOOD_HOE = ITEMS.register("bamboo_wood_hoe",
            () -> new HoeItem(ModToolTiers.BAMBOO_WOOD, -2, -1.0F, new Item.Properties()));

    // === CRIMSON WOOD TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CRIMSON_WOOD_SWORD = ITEMS.register("crimson_wood_sword",
            () -> new SwordItem(ModToolTiers.CRIMSON_WOOD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CRIMSON_WOOD_PICKAXE = ITEMS.register("crimson_wood_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CRIMSON_WOOD, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CRIMSON_WOOD_AXE = ITEMS.register("crimson_wood_axe",
            () -> new AxeItem(ModToolTiers.CRIMSON_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CRIMSON_WOOD_SHOVEL = ITEMS.register("crimson_wood_shovel",
            () -> new ShovelItem(ModToolTiers.CRIMSON_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CRIMSON_WOOD_HOE = ITEMS.register("crimson_wood_hoe",
            () -> new HoeItem(ModToolTiers.CRIMSON_WOOD, -2, -1.0F, new Item.Properties()));

    // === CARBON FIBER INGOT ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CARBON_FIBER_INGOT = ITEMS.register("carbon_fiber_ingot",
            () -> new Item(new Item.Properties()));

    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ECHO_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("echo_armor_trim_smithing_template",
            () -> new Item(new Item.Properties()));

    // === WARPED WOOD TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> WARPED_WOOD_SWORD = ITEMS.register("warped_wood_sword",
            () -> new SwordItem(ModToolTiers.WARPED_WOOD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> WARPED_WOOD_PICKAXE = ITEMS.register("warped_wood_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WARPED_WOOD, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> WARPED_WOOD_AXE = ITEMS.register("warped_wood_axe",
            () -> new AxeItem(ModToolTiers.WARPED_WOOD, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> WARPED_WOOD_SHOVEL = ITEMS.register("warped_wood_shovel",
            () -> new ShovelItem(ModToolTiers.WARPED_WOOD, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> WARPED_WOOD_HOE = ITEMS.register("warped_wood_hoe",
            () -> new HoeItem(ModToolTiers.WARPED_WOOD, -2, -1.0F, new Item.Properties()));

    // === FLINT TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> FLINT_SWORD = ITEMS.register("flint_sword",
            () -> new SwordItem(ModToolTiers.FLINT, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> FLINT_PICKAXE = ITEMS.register("flint_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FLINT, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> FLINT_AXE = ITEMS.register("flint_axe",
            () -> new AxeItem(ModToolTiers.FLINT, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> FLINT_SHOVEL = ITEMS.register("flint_shovel",
            () -> new ShovelItem(ModToolTiers.FLINT, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> FLINT_HOE = ITEMS.register("flint_hoe",
            () -> new HoeItem(ModToolTiers.FLINT, -2, -1.0F, new Item.Properties()));

    // === STONE TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> STONE_SWORD = ITEMS.register("stone_sword",
            () -> new SwordItem(ModToolTiers.STONE, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> STONE_PICKAXE = ITEMS.register("stone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STONE, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> STONE_AXE = ITEMS.register("stone_axe",
            () -> new AxeItem(ModToolTiers.STONE, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> STONE_SHOVEL = ITEMS.register("stone_shovel",
            () -> new ShovelItem(ModToolTiers.STONE, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> STONE_HOE = ITEMS.register("stone_hoe",
            () -> new HoeItem(ModToolTiers.STONE, -2, -1.0F, new Item.Properties()));

    // === DEEPSLATE TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DEEPSLATE_SWORD = ITEMS.register("deepslate_sword",
            () -> new SwordItem(ModToolTiers.DEEPSLATE, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DEEPSLATE_PICKAXE = ITEMS.register("deepslate_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DEEPSLATE, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DEEPSLATE_AXE = ITEMS.register("deepslate_axe",
            () -> new AxeItem(ModToolTiers.DEEPSLATE, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DEEPSLATE_SHOVEL = ITEMS.register("deepslate_shovel",
            () -> new ShovelItem(ModToolTiers.DEEPSLATE, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DEEPSLATE_HOE = ITEMS.register("deepslate_hoe",
            () -> new HoeItem(ModToolTiers.DEEPSLATE, -2, -1.0F, new Item.Properties()));

    // === OBSIDIAN TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new SwordItem(ModToolTiers.OBSIDIAN, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OBSIDIAN, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe",
            () -> new AxeItem(ModToolTiers.OBSIDIAN, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel",
            () -> new ShovelItem(ModToolTiers.OBSIDIAN, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe",
            () -> new HoeItem(ModToolTiers.OBSIDIAN, -2, -1.0F, new Item.Properties()));

    // === LEATHER TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LEATHER_SWORD = ITEMS.register("leather_sword",
            () -> new CustomLeatherToolItem(ModToolTiers.LEATHER, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LEATHER_PICKAXE = ITEMS.register("leather_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LEATHER, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LEATHER_AXE = ITEMS.register("leather_axe",
            () -> new AxeItem(ModToolTiers.LEATHER, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LEATHER_SHOVEL = ITEMS.register("leather_shovel",
            () -> new ShovelItem(ModToolTiers.LEATHER, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LEATHER_HOE = ITEMS.register("leather_hoe",
            () -> new HoeItem(ModToolTiers.LEATHER, -2, -1.0F, new Item.Properties()));

    // === CHAIN TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHAIN_SWORD = ITEMS.register("chain_sword",
            () -> new SwordItem(ModToolTiers.CHAIN, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHAIN_PICKAXE = ITEMS.register("chain_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHAIN, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHAIN_AXE = ITEMS.register("chain_axe",
            () -> new AxeItem(ModToolTiers.CHAIN, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHAIN_SHOVEL = ITEMS.register("chain_shovel",
            () -> new ShovelItem(ModToolTiers.CHAIN, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHAIN_HOE = ITEMS.register("chain_hoe",
            () -> new HoeItem(ModToolTiers.CHAIN, -2, -1.0F, new Item.Properties()));

    // === REDSTONE TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword",
            () -> new SwordItem(ModToolTiers.REDSTONE, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.REDSTONE, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> REDSTONE_AXE = ITEMS.register("redstone_axe",
            () -> new AxeItem(ModToolTiers.REDSTONE, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel",
            () -> new ShovelItem(ModToolTiers.REDSTONE, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe",
            () -> new HoeItem(ModToolTiers.REDSTONE, -2, -1.0F, new Item.Properties()));

    // === LAPIS TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LAPIS_SWORD = ITEMS.register("lapis_sword",
            () -> new SwordItem(ModToolTiers.LAPIS, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LAPIS, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LAPIS_AXE = ITEMS.register("lapis_axe",
            () -> new AxeItem(ModToolTiers.LAPIS, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LAPIS_SHOVEL = ITEMS.register("lapis_shovel",
            () -> new ShovelItem(ModToolTiers.LAPIS, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LAPIS_HOE = ITEMS.register("lapis_hoe",
            () -> new HoeItem(ModToolTiers.LAPIS, -2, -1.0F, new Item.Properties()));

    // === GOLD TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> GOLD_SWORD = ITEMS.register("gold_sword",
            () -> new SwordItem(ModToolTiers.GOLD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> GOLD_PICKAXE = ITEMS.register("gold_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GOLD, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> GOLD_AXE = ITEMS.register("gold_axe",
            () -> new AxeItem(ModToolTiers.GOLD, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> GOLD_SHOVEL = ITEMS.register("gold_shovel",
            () -> new ShovelItem(ModToolTiers.GOLD, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> GOLD_HOE = ITEMS.register("gold_hoe",
            () -> new HoeItem(ModToolTiers.GOLD, -2, -1.0F, new Item.Properties()));

    // === COPPER TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModToolTiers.COPPER, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER, -2, -1.0F, new Item.Properties()));

    // === QUARTZ TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> QUARTZ_SWORD = ITEMS.register("quartz_sword",
            () -> new SwordItem(ModToolTiers.QUARTZ, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe",
            () -> new PickaxeItem(ModToolTiers.QUARTZ, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> QUARTZ_AXE = ITEMS.register("quartz_axe",
            () -> new AxeItem(ModToolTiers.QUARTZ, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel",
            () -> new ShovelItem(ModToolTiers.QUARTZ, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> QUARTZ_HOE = ITEMS.register("quartz_hoe",
            () -> new HoeItem(ModToolTiers.QUARTZ, -2, -1.0F, new Item.Properties()));

    // === CARBON FIBER TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CARBON_FIBER_SWORD = ITEMS.register("carbon_fiber_sword",
            () -> new SwordItem(ModToolTiers.CARBON_FIBER, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CARBON_FIBER_PICKAXE = ITEMS.register("carbon_fiber_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CARBON_FIBER, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CARBON_FIBER_AXE = ITEMS.register("carbon_fiber_axe",
            () -> new AxeItem(ModToolTiers.CARBON_FIBER, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CARBON_FIBER_SHOVEL = ITEMS.register("carbon_fiber_shovel",
            () -> new ShovelItem(ModToolTiers.CARBON_FIBER, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CARBON_FIBER_HOE = ITEMS.register("carbon_fiber_hoe",
            () -> new HoeItem(ModToolTiers.CARBON_FIBER, -2, -1.0F, new Item.Properties()));

    // === IRON TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> IRON_SWORD = ITEMS.register("iron_sword",
            () -> new SwordItem(ModToolTiers.IRON, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> IRON_PICKAXE = ITEMS.register("iron_pickaxe",
            () -> new PickaxeItem(ModToolTiers.IRON, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> IRON_AXE = ITEMS.register("iron_axe",
            () -> new AxeItem(ModToolTiers.IRON, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> IRON_SHOVEL = ITEMS.register("iron_shovel",
            () -> new ShovelItem(ModToolTiers.IRON, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> IRON_HOE = ITEMS.register("iron_hoe",
            () -> new HoeItem(ModToolTiers.IRON, -2, -1.0F, new Item.Properties()));

    // === AMETHYST TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModToolTiers.AMETHYST, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMETHYST, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModToolTiers.AMETHYST, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModToolTiers.AMETHYST, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModToolTiers.AMETHYST, -2, -1.0F, new Item.Properties()));

    // === EMERALD TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModToolTiers.EMERALD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EMERALD, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModToolTiers.EMERALD, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModToolTiers.EMERALD, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModToolTiers.EMERALD, -2, -1.0F, new Item.Properties()));

    // === DIAMOND TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DIAMOND_SWORD = ITEMS.register("diamond_sword",
            () -> new SwordItem(ModToolTiers.DIAMOND, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DIAMOND_PICKAXE = ITEMS.register("diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DIAMOND, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DIAMOND_AXE = ITEMS.register("diamond_axe",
            () -> new AxeItem(ModToolTiers.DIAMOND, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DIAMOND_SHOVEL = ITEMS.register("diamond_shovel",
            () -> new ShovelItem(ModToolTiers.DIAMOND, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DIAMOND_HOE = ITEMS.register("diamond_hoe",
            () -> new HoeItem(ModToolTiers.DIAMOND, -2, -1.0F, new Item.Properties()));

    // === ECHO TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ECHO_SWORD = ITEMS.register("echo_sword",
            () -> new CustomEchoToolItem(ModToolTiers.ECHO, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ECHO_PICKAXE = ITEMS.register("echo_pickaxe",
            () -> new CustomEchoToolItem(ModToolTiers.ECHO, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ECHO_AXE = ITEMS.register("echo_axe",
            () -> new CustomEchoToolItem(ModToolTiers.ECHO, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ECHO_SHOVEL = ITEMS.register("echo_shovel",
            () -> new CustomEchoToolItem(ModToolTiers.ECHO, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ECHO_HOE = ITEMS.register("echo_hoe",
            () -> new CustomEchoToolItem(ModToolTiers.ECHO, -2, -1.0F, new Item.Properties()));

    // === NETHERITE TOOLS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> NETHERITE_SWORD = ITEMS.register("netherite_sword",
            () -> new SwordItem(ModToolTiers.NETHERITE, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> NETHERITE_PICKAXE = ITEMS.register("netherite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NETHERITE, 1, -2.8F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> NETHERITE_AXE = ITEMS.register("netherite_axe",
            () -> new AxeItem(ModToolTiers.NETHERITE, 6.0F, -3.2F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> NETHERITE_SHOVEL = ITEMS.register("netherite_shovel",
            () -> new ShovelItem(ModToolTiers.NETHERITE, 1.5F, -3.0F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> NETHERITE_HOE = ITEMS.register("netherite_hoe",
            () -> new HoeItem(ModToolTiers.NETHERITE, -2, -1.0F, new Item.Properties()));

    // === ARMORS ===
    // WOOD ARMORS (OAK)
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OAK_WOOD_HELMET = ITEMS.register("oak_wood_helmet",
            () -> new ArmorItem(ModArmorMaterials.WOOD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OAK_WOOD_CHESTPLATE = ITEMS.register("oak_wood_chestplate",
            () -> new ArmorItem(ModArmorMaterials.WOOD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OAK_WOOD_LEGGINGS = ITEMS.register("oak_wood_leggings",
            () -> new ArmorItem(ModArmorMaterials.WOOD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OAK_WOOD_BOOTS = ITEMS.register("oak_wood_boots",
            () -> new ArmorItem(ModArmorMaterials.WOOD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // SPRUCE WOOD ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> SPRUCE_WOOD_HELMET = ITEMS.register("spruce_wood_helmet",
            () -> new ArmorItem(ModArmorMaterials.SPRUCE_WOOD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> SPRUCE_WOOD_CHESTPLATE = ITEMS.register("spruce_wood_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SPRUCE_WOOD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> SPRUCE_WOOD_LEGGINGS = ITEMS.register("spruce_wood_leggings",
            () -> new ArmorItem(ModArmorMaterials.SPRUCE_WOOD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> SPRUCE_WOOD_BOOTS = ITEMS.register("spruce_wood_boots",
            () -> new ArmorItem(ModArmorMaterials.SPRUCE_WOOD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // BIRCH WOOD ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BIRCH_WOOD_HELMET = ITEMS.register("birch_wood_helmet",
            () -> new ArmorItem(ModArmorMaterials.BIRCH_WOOD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BIRCH_WOOD_CHESTPLATE = ITEMS.register("birch_wood_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BIRCH_WOOD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BIRCH_WOOD_LEGGINGS = ITEMS.register("birch_wood_leggings",
            () -> new ArmorItem(ModArmorMaterials.BIRCH_WOOD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BIRCH_WOOD_BOOTS = ITEMS.register("birch_wood_boots",
            () -> new ArmorItem(ModArmorMaterials.BIRCH_WOOD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // JUNGLE WOOD ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> JUNGLE_WOOD_HELMET = ITEMS.register("jungle_wood_helmet",
            () -> new ArmorItem(ModArmorMaterials.JUNGLE_WOOD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> JUNGLE_WOOD_CHESTPLATE = ITEMS.register("jungle_wood_chestplate",
            () -> new ArmorItem(ModArmorMaterials.JUNGLE_WOOD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> JUNGLE_WOOD_LEGGINGS = ITEMS.register("jungle_wood_leggings",
            () -> new ArmorItem(ModArmorMaterials.JUNGLE_WOOD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> JUNGLE_WOOD_BOOTS = ITEMS.register("jungle_wood_boots",
            () -> new ArmorItem(ModArmorMaterials.JUNGLE_WOOD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // ACACIA WOOD ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ACACIA_WOOD_HELMET = ITEMS.register("acacia_wood_helmet",
            () -> new ArmorItem(ModArmorMaterials.ACACIA_WOOD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ACACIA_WOOD_CHESTPLATE = ITEMS.register("acacia_wood_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ACACIA_WOOD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ACACIA_WOOD_LEGGINGS = ITEMS.register("acacia_wood_leggings",
            () -> new ArmorItem(ModArmorMaterials.ACACIA_WOOD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ACACIA_WOOD_BOOTS = ITEMS.register("acacia_wood_boots",
            () -> new ArmorItem(ModArmorMaterials.ACACIA_WOOD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // DARK OAK WOOD ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DARK_OAK_WOOD_HELMET = ITEMS.register("dark_oak_wood_helmet",
            () -> new ArmorItem(ModArmorMaterials.DARK_OAK_WOOD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DARK_OAK_WOOD_CHESTPLATE = ITEMS.register("dark_oak_wood_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DARK_OAK_WOOD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DARK_OAK_WOOD_LEGGINGS = ITEMS.register("dark_oak_wood_leggings",
            () -> new ArmorItem(ModArmorMaterials.DARK_OAK_WOOD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DARK_OAK_WOOD_BOOTS = ITEMS.register("dark_oak_wood_boots",
            () -> new ArmorItem(ModArmorMaterials.DARK_OAK_WOOD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // MANGROVE WOOD ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> MANGROVE_WOOD_HELMET = ITEMS.register("mangrove_wood_helmet",
            () -> new ArmorItem(ModArmorMaterials.MANGROVE_WOOD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> MANGROVE_WOOD_CHESTPLATE = ITEMS.register("mangrove_wood_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MANGROVE_WOOD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> MANGROVE_WOOD_LEGGINGS = ITEMS.register("mangrove_wood_leggings",
            () -> new ArmorItem(ModArmorMaterials.MANGROVE_WOOD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> MANGROVE_WOOD_BOOTS = ITEMS.register("mangrove_wood_boots",
            () -> new ArmorItem(ModArmorMaterials.MANGROVE_WOOD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // CHERRY WOOD ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHERRY_WOOD_HELMET = ITEMS.register("cherry_wood_helmet",
            () -> new ArmorItem(ModArmorMaterials.CHERRY_WOOD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHERRY_WOOD_CHESTPLATE = ITEMS.register("cherry_wood_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CHERRY_WOOD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHERRY_WOOD_LEGGINGS = ITEMS.register("cherry_wood_leggings",
            () -> new ArmorItem(ModArmorMaterials.CHERRY_WOOD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHERRY_WOOD_BOOTS = ITEMS.register("cherry_wood_boots",
            () -> new ArmorItem(ModArmorMaterials.CHERRY_WOOD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // BAMBOO WOOD ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BAMBOO_WOOD_HELMET = ITEMS.register("bamboo_wood_helmet",
            () -> new ArmorItem(ModArmorMaterials.BAMBOO_WOOD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BAMBOO_WOOD_CHESTPLATE = ITEMS.register("bamboo_wood_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BAMBOO_WOOD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BAMBOO_WOOD_LEGGINGS = ITEMS.register("bamboo_wood_leggings",
            () -> new ArmorItem(ModArmorMaterials.BAMBOO_WOOD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BAMBOO_WOOD_BOOTS = ITEMS.register("bamboo_wood_boots",
            () -> new ArmorItem(ModArmorMaterials.BAMBOO_WOOD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // CRIMSON WOOD ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CRIMSON_WOOD_HELMET = ITEMS.register("crimson_wood_helmet",
            () -> new ArmorItem(ModArmorMaterials.CRIMSON_WOOD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CRIMSON_WOOD_CHESTPLATE = ITEMS.register("crimson_wood_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CRIMSON_WOOD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CRIMSON_WOOD_LEGGINGS = ITEMS.register("crimson_wood_leggings",
            () -> new ArmorItem(ModArmorMaterials.CRIMSON_WOOD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CRIMSON_WOOD_BOOTS = ITEMS.register("crimson_wood_boots",
            () -> new ArmorItem(ModArmorMaterials.CRIMSON_WOOD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // WARPED WOOD ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> WARPED_WOOD_HELMET = ITEMS.register("warped_wood_helmet",
            () -> new ArmorItem(ModArmorMaterials.WARPED_WOOD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> WARPED_WOOD_CHESTPLATE = ITEMS.register("warped_wood_chestplate",
            () -> new ArmorItem(ModArmorMaterials.WARPED_WOOD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> WARPED_WOOD_LEGGINGS = ITEMS.register("warped_wood_leggings",
            () -> new ArmorItem(ModArmorMaterials.WARPED_WOOD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> WARPED_WOOD_BOOTS = ITEMS.register("warped_wood_boots",
            () -> new ArmorItem(ModArmorMaterials.WARPED_WOOD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // FLINT ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> FLINT_HELMET = ITEMS.register("flint_helmet",
            () -> new CustomFlintArmorItem(ModArmorMaterials.FLINT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> FLINT_CHESTPLATE = ITEMS.register("flint_chestplate",
            () -> new CustomFlintArmorItem(ModArmorMaterials.FLINT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> FLINT_LEGGINGS = ITEMS.register("flint_leggings",
            () -> new CustomFlintArmorItem(ModArmorMaterials.FLINT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> FLINT_BOOTS = ITEMS.register("flint_boots",
            () -> new CustomFlintArmorItem(ModArmorMaterials.FLINT, ArmorItem.Type.BOOTS, new Item.Properties()));

    // STONE ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> STONE_HELMET = ITEMS.register("stone_helmet",
            () -> new ArmorItem(ModArmorMaterials.STONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> STONE_CHESTPLATE = ITEMS.register("stone_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> STONE_LEGGINGS = ITEMS.register("stone_leggings",
            () -> new ArmorItem(ModArmorMaterials.STONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> STONE_BOOTS = ITEMS.register("stone_boots",
            () -> new ArmorItem(ModArmorMaterials.STONE, ArmorItem.Type.BOOTS, new Item.Properties()));

    // DEEPSLATE ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DEEPSLATE_HELMET = ITEMS.register("deepslate_helmet",
            () -> new ArmorItem(ModArmorMaterials.DEEPSLATE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DEEPSLATE_CHESTPLATE = ITEMS.register("deepslate_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DEEPSLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DEEPSLATE_LEGGINGS = ITEMS.register("deepslate_leggings",
            () -> new ArmorItem(ModArmorMaterials.DEEPSLATE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DEEPSLATE_BOOTS = ITEMS.register("deepslate_boots",
            () -> new ArmorItem(ModArmorMaterials.DEEPSLATE, ArmorItem.Type.BOOTS, new Item.Properties()));

    // OBSIDIAN ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",
            () -> new CustomObsidianArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate",
            () -> new CustomObsidianArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings",
            () -> new CustomObsidianArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots",
            () -> new CustomObsidianArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS, new Item.Properties()));

    // LEATHER ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LEATHER_HELMET = ITEMS.register("leather_helmet",
            () -> new ArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LEATHER_CHESTPLATE = ITEMS.register("leather_chestplate",
            () -> new ArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LEATHER_LEGGINGS = ITEMS.register("leather_leggings",
            () -> new ArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LEATHER_BOOTS = ITEMS.register("leather_boots",
            () -> new ArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()));

    // CHAIN ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHAIN_HELMET = ITEMS.register("chain_helmet",
            () -> new ArmorItem(ModArmorMaterials.CHAIN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHAIN_CHESTPLATE = ITEMS.register("chain_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CHAIN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHAIN_LEGGINGS = ITEMS.register("chain_leggings",
            () -> new ArmorItem(ModArmorMaterials.CHAIN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHAIN_BOOTS = ITEMS.register("chain_boots",
            () -> new ArmorItem(ModArmorMaterials.CHAIN, ArmorItem.Type.BOOTS, new Item.Properties()));

    // REDSTONE ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> REDSTONE_HELMET = ITEMS.register("redstone_helmet",
            () -> new CustomRedstoneArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> REDSTONE_CHESTPLATE = ITEMS.register("redstone_chestplate",
            () -> new CustomRedstoneArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> REDSTONE_LEGGINGS = ITEMS.register("redstone_leggings",
            () -> new CustomRedstoneArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> REDSTONE_BOOTS = ITEMS.register("redstone_boots",
            () -> new CustomRedstoneArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.BOOTS, new Item.Properties()));

    // LAPIS ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LAPIS_HELMET = ITEMS.register("lapis_helmet",
            () -> new CustomLapisArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LAPIS_CHESTPLATE = ITEMS.register("lapis_chestplate",
            () -> new CustomLapisArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LAPIS_LEGGINGS = ITEMS.register("lapis_leggings",
            () -> new CustomLapisArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LAPIS_BOOTS = ITEMS.register("lapis_boots",
            () -> new CustomLapisArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.BOOTS, new Item.Properties()));

    // GOLD ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> GOLD_HELMET = ITEMS.register("gold_helmet",
            () -> new ArmorItem(ModArmorMaterials.GOLD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> GOLD_CHESTPLATE = ITEMS.register("gold_chestplate",
            () -> new ArmorItem(ModArmorMaterials.GOLD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> GOLD_LEGGINGS = ITEMS.register("gold_leggings",
            () -> new ArmorItem(ModArmorMaterials.GOLD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> GOLD_BOOTS = ITEMS.register("gold_boots",
            () -> new ArmorItem(ModArmorMaterials.GOLD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // COPPER ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));

    // QUARTZ ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> QUARTZ_HELMET = ITEMS.register("quartz_helmet",
            () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> QUARTZ_CHESTPLATE = ITEMS.register("quartz_chestplate",
            () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> QUARTZ_LEGGINGS = ITEMS.register("quartz_leggings",
            () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> QUARTZ_BOOTS = ITEMS.register("quartz_boots",
            () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.BOOTS, new Item.Properties()));

    // CARBON FIBER ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CARBON_FIBER_HELMET = ITEMS.register("carbon_fiber_helmet",
            () -> new ArmorItem(ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CARBON_FIBER_CHESTPLATE = ITEMS.register("carbon_fiber_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CARBON_FIBER_LEGGINGS = ITEMS.register("carbon_fiber_leggings",
            () -> new ArmorItem(ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CARBON_FIBER_BOOTS = ITEMS.register("carbon_fiber_boots",
            () -> new ArmorItem(ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.BOOTS, new Item.Properties()));

    // IRON ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> IRON_HELMET = ITEMS.register("iron_helmet",
            () -> new ArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> IRON_CHESTPLATE = ITEMS.register("iron_chestplate",
            () -> new ArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> IRON_LEGGINGS = ITEMS.register("iron_leggings",
            () -> new ArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> IRON_BOOTS = ITEMS.register("iron_boots",
            () -> new ArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.BOOTS, new Item.Properties()));

    // AMETHYST ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots",
            () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Properties()));

    // EMERALD ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new CustomEmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new CustomEmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new CustomEmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new CustomEmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // DIAMOND ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DIAMOND_HELMET = ITEMS.register("diamond_helmet",
            () -> new ArmorItem(ModArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DIAMOND_CHESTPLATE = ITEMS.register("diamond_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DIAMOND_LEGGINGS = ITEMS.register("diamond_leggings",
            () -> new ArmorItem(ModArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DIAMOND_BOOTS = ITEMS.register("diamond_boots",
            () -> new ArmorItem(ModArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties()));

    // ECHO ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ECHO_HELMET = ITEMS.register("echo_helmet",
            () -> new CustomEchoArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ECHO_CHESTPLATE = ITEMS.register("echo_chestplate",
            () -> new CustomEchoArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ECHO_LEGGINGS = ITEMS.register("echo_leggings",
            () -> new CustomEchoArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ECHO_BOOTS = ITEMS.register("echo_boots",
            () -> new CustomEchoArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.BOOTS, new Item.Properties()));

    // NETHERITE ARMORS
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> NETHERITE_HELMET = ITEMS.register("netherite_helmet",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> NETHERITE_CHESTPLATE = ITEMS.register("netherite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> NETHERITE_LEGGINGS = ITEMS.register("netherite_leggings",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> NETHERITE_BOOTS = ITEMS.register("netherite_boots",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    // === WOODEN SHIELDS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OAK_WOOD_SHIELD = ITEMS.register("oak_wood_shield",
            () -> new ShieldItem(new Item.Properties().durability(ModToolTiers.WOOD.getUses())));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> SPRUCE_WOOD_SHIELD = ITEMS.register("spruce_wood_shield",
            () -> new ShieldItem(new Item.Properties().durability(ModToolTiers.SPRUCE_WOOD.getUses())));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BIRCH_WOOD_SHIELD = ITEMS.register("birch_wood_shield",
            () -> new ShieldItem(new Item.Properties().durability(ModToolTiers.BIRCH_WOOD.getUses())));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> JUNGLE_WOOD_SHIELD = ITEMS.register("jungle_wood_shield",
            () -> new ShieldItem(new Item.Properties().durability(ModToolTiers.JUNGLE_WOOD.getUses())));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ACACIA_WOOD_SHIELD = ITEMS.register("acacia_wood_shield",
            () -> new ShieldItem(new Item.Properties().durability(ModToolTiers.ACACIA_WOOD.getUses())));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DARK_OAK_WOOD_SHIELD = ITEMS.register("dark_oak_wood_shield",
            () -> new ShieldItem(new Item.Properties().durability(ModToolTiers.DARK_OAK_WOOD.getUses())));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> MANGROVE_WOOD_SHIELD = ITEMS.register("mangrove_wood_shield",
            () -> new ShieldItem(new Item.Properties().durability(ModToolTiers.MANGROVE_WOOD.getUses())));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHERRY_WOOD_SHIELD = ITEMS.register("cherry_wood_shield",
            () -> new ShieldItem(new Item.Properties().durability(ModToolTiers.CHERRY_WOOD.getUses())));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> BAMBOO_WOOD_SHIELD = ITEMS.register("bamboo_wood_shield",
            () -> new ShieldItem(new Item.Properties().durability(ModToolTiers.BAMBOO_WOOD.getUses())));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CRIMSON_WOOD_SHIELD = ITEMS.register("crimson_wood_shield",
            () -> new ShieldItem(new Item.Properties().durability(ModToolTiers.CRIMSON_WOOD.getUses())));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> WARPED_WOOD_SHIELD = ITEMS.register("warped_wood_shield",
            () -> new ShieldItem(new Item.Properties().durability(ModToolTiers.WARPED_WOOD.getUses())));

    // === SPEARS ===
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> WOOD_SPEAR = ITEMS.register("wood_spear",
            () -> new CustomSpearItem(ModToolTiers.WOOD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> FLINT_SPEAR = ITEMS.register("flint_spear",
            () -> new CustomSpearItem(ModToolTiers.FLINT, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> STONE_SPEAR = ITEMS.register("stone_spear",
            () -> new CustomSpearItem(ModToolTiers.STONE, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DEEPSLATE_SPEAR = ITEMS.register("deepslate_spear",
            () -> new CustomSpearItem(ModToolTiers.DEEPSLATE, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> OBSIDIAN_SPEAR = ITEMS.register("obsidian_spear",
            () -> new CustomSpearItem(ModToolTiers.OBSIDIAN, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LEATHER_SPEAR = ITEMS.register("leather_spear",
            () -> new CustomSpearItem(ModToolTiers.LEATHER, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CHAIN_SPEAR = ITEMS.register("chain_spear",
            () -> new CustomSpearItem(ModToolTiers.CHAIN, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> REDSTONE_SPEAR = ITEMS.register("redstone_spear",
            () -> new CustomSpearItem(ModToolTiers.REDSTONE, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> LAPIS_SPEAR = ITEMS.register("lapis_spear",
            () -> new CustomSpearItem(ModToolTiers.LAPIS, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> GOLD_SPEAR = ITEMS.register("gold_spear",
            () -> new CustomSpearItem(ModToolTiers.GOLD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> COPPER_SPEAR = ITEMS.register("copper_spear",
            () -> new CustomSpearItem(ModToolTiers.COPPER, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> QUARTZ_SPEAR = ITEMS.register("quartz_spear",
            () -> new CustomSpearItem(ModToolTiers.QUARTZ, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> CARBON_FIBER_SPEAR = ITEMS.register("carbon_fiber_spear",
            () -> new CustomSpearItem(ModToolTiers.CARBON_FIBER, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> IRON_SPEAR = ITEMS.register("iron_spear",
            () -> new CustomSpearItem(ModToolTiers.IRON, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> AMETHYST_SPEAR = ITEMS.register("amethyst_spear",
            () -> new CustomSpearItem(ModToolTiers.AMETHYST, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> EMERALD_SPEAR = ITEMS.register("emerald_spear",
            () -> new CustomSpearItem(ModToolTiers.EMERALD, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> DIAMOND_SPEAR = ITEMS.register("diamond_spear",
            () -> new CustomSpearItem(ModToolTiers.DIAMOND, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> ECHO_SPEAR = ITEMS.register("echo_spear",
            () -> new CustomSpearItem(ModToolTiers.ECHO, 3, -2.4F, new Item.Properties()));
    public static final net.neoforged.neoforge.registries.RegistryObject<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear",
            () -> new CustomSpearItem(ModToolTiers.NETHERITE, 3, -2.4F, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        // La registrazione condizionale basata sulla configurazione in NeoForge
        // è complessa perché la configurazione viene caricata dopo la registrazione degli oggetti.
        // Un approccio comune è registrare tutto e poi nascondere gli oggetti disabilitati
        // dai menu creativi e dalle ricette, oppure usare un sistema di registrazione condizionale
        // più avanzato se supportato dalla versione specifica di NeoForge.
        // Per semplicità e robustezza in questa fase, registriamo tutto.
        // La logica di abilitazione/disabilitazione verrà gestita nei Creative Tabs e nelle ricette.
        ITEMS.register(eventBus);
    }
}

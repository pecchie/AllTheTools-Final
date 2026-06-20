package com.pecchie.allthetools.item;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.item.armor.*;
import com.pecchie.allthetools.item.tool.*;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AllTheTools.MODID);

    // === MATERIALI ===
    public static final DeferredItem<Item> CARBON_FIBER_INGOT = ITEMS.register("carbon_fiber_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECHO_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("echo_armor_trim_smithing_template", () -> new Item(new Item.Properties()));

    // === OAK ===
    public static final DeferredItem<Item> OAK_WOOD_SWORD = ITEMS.register("oak_wood_sword", () -> new SwordItem(ModToolTiers.OAK, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.OAK, 3, -2.4f))));
    public static final DeferredItem<Item> OAK_WOOD_PICKAXE = ITEMS.register("oak_wood_pickaxe", () -> new PickaxeItem(ModToolTiers.OAK, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.OAK, 1, -2.8f))));
    public static final DeferredItem<Item> OAK_WOOD_AXE = ITEMS.register("oak_wood_axe", () -> new AxeItem(ModToolTiers.OAK, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.OAK, 6, -3.2f))));
    public static final DeferredItem<Item> OAK_WOOD_SHOVEL = ITEMS.register("oak_wood_shovel", () -> new ShovelItem(ModToolTiers.OAK, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.OAK, 1.5f, -3.0f))));
    public static final DeferredItem<Item> OAK_WOOD_HOE = ITEMS.register("oak_wood_hoe", () -> new HoeItem(ModToolTiers.OAK, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.OAK, 0, -3.0f))));
    public static final DeferredItem<Item> OAK_WOOD_HELMET = ITEMS.register("oak_wood_helmet", () -> new ArmorItem(ModArmorMaterials.OAK, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> OAK_WOOD_CHESTPLATE = ITEMS.register("oak_wood_chestplate", () -> new ArmorItem(ModArmorMaterials.OAK, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> OAK_WOOD_LEGGINGS = ITEMS.register("oak_wood_leggings", () -> new ArmorItem(ModArmorMaterials.OAK, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> OAK_WOOD_BOOTS = ITEMS.register("oak_wood_boots", () -> new ArmorItem(ModArmorMaterials.OAK, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));
    public static final DeferredItem<Item> OAK_WOOD_SHIELD = ITEMS.register("oak_wood_shield", () -> new ShieldItem(new Item.Properties().durability(168)));
    public static final DeferredItem<Item> OAK_WOOD_SPEAR = ITEMS.register("oak_wood_spear", () -> new CustomSpearItem(ModToolTiers.OAK, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.OAK, 3, -2.4f))));

    // === SPRUCE ===
    public static final DeferredItem<Item> SPRUCE_WOOD_SWORD = ITEMS.register("spruce_wood_sword", () -> new SwordItem(ModToolTiers.SPRUCE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.SPRUCE, 3, -2.4f))));
    public static final DeferredItem<Item> SPRUCE_WOOD_PICKAXE = ITEMS.register("spruce_wood_pickaxe", () -> new PickaxeItem(ModToolTiers.SPRUCE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.SPRUCE, 1, -2.8f))));
    public static final DeferredItem<Item> SPRUCE_WOOD_AXE = ITEMS.register("spruce_wood_axe", () -> new AxeItem(ModToolTiers.SPRUCE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.SPRUCE, 6, -3.2f))));
    public static final DeferredItem<Item> SPRUCE_WOOD_SHOVEL = ITEMS.register("spruce_wood_shovel", () -> new ShovelItem(ModToolTiers.SPRUCE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.SPRUCE, 1.5f, -3.0f))));
    public static final DeferredItem<Item> SPRUCE_WOOD_HOE = ITEMS.register("spruce_wood_hoe", () -> new HoeItem(ModToolTiers.SPRUCE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.SPRUCE, 0, -3.0f))));
    public static final DeferredItem<Item> SPRUCE_WOOD_HELMET = ITEMS.register("spruce_wood_helmet", () -> new ArmorItem(ModArmorMaterials.SPRUCE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> SPRUCE_WOOD_CHESTPLATE = ITEMS.register("spruce_wood_chestplate", () -> new ArmorItem(ModArmorMaterials.SPRUCE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> SPRUCE_WOOD_LEGGINGS = ITEMS.register("spruce_wood_leggings", () -> new ArmorItem(ModArmorMaterials.SPRUCE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> SPRUCE_WOOD_BOOTS = ITEMS.register("spruce_wood_boots", () -> new ArmorItem(ModArmorMaterials.SPRUCE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));
    public static final DeferredItem<Item> SPRUCE_WOOD_SHIELD = ITEMS.register("spruce_wood_shield", () -> new ShieldItem(new Item.Properties().durability(168)));
    public static final DeferredItem<Item> SPRUCE_WOOD_SPEAR = ITEMS.register("spruce_wood_spear", () -> new CustomSpearItem(ModToolTiers.SPRUCE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.SPRUCE, 3, -2.4f))));

    // === BIRCH ===
    public static final DeferredItem<Item> BIRCH_WOOD_SWORD = ITEMS.register("birch_wood_sword", () -> new SwordItem(ModToolTiers.BIRCH, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BIRCH, 3, -2.4f))));
    public static final DeferredItem<Item> BIRCH_WOOD_PICKAXE = ITEMS.register("birch_wood_pickaxe", () -> new PickaxeItem(ModToolTiers.BIRCH, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BIRCH, 1, -2.8f))));
    public static final DeferredItem<Item> BIRCH_WOOD_AXE = ITEMS.register("birch_wood_axe", () -> new AxeItem(ModToolTiers.BIRCH, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BIRCH, 6, -3.2f))));
    public static final DeferredItem<Item> BIRCH_WOOD_SHOVEL = ITEMS.register("birch_wood_shovel", () -> new ShovelItem(ModToolTiers.BIRCH, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BIRCH, 1.5f, -3.0f))));
    public static final DeferredItem<Item> BIRCH_WOOD_HOE = ITEMS.register("birch_wood_hoe", () -> new HoeItem(ModToolTiers.BIRCH, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BIRCH, 0, -3.0f))));
    public static final DeferredItem<Item> BIRCH_WOOD_HELMET = ITEMS.register("birch_wood_helmet", () -> new ArmorItem(ModArmorMaterials.BIRCH, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> BIRCH_WOOD_CHESTPLATE = ITEMS.register("birch_wood_chestplate", () -> new ArmorItem(ModArmorMaterials.BIRCH, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> BIRCH_WOOD_LEGGINGS = ITEMS.register("birch_wood_leggings", () -> new ArmorItem(ModArmorMaterials.BIRCH, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> BIRCH_WOOD_BOOTS = ITEMS.register("birch_wood_boots", () -> new ArmorItem(ModArmorMaterials.BIRCH, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));
    public static final DeferredItem<Item> BIRCH_WOOD_SHIELD = ITEMS.register("birch_wood_shield", () -> new ShieldItem(new Item.Properties().durability(168)));
    public static final DeferredItem<Item> BIRCH_WOOD_SPEAR = ITEMS.register("birch_wood_spear", () -> new CustomSpearItem(ModToolTiers.BIRCH, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BIRCH, 3, -2.4f))));

    // === JUNGLE ===
    public static final DeferredItem<Item> JUNGLE_WOOD_SWORD = ITEMS.register("jungle_wood_sword", () -> new SwordItem(ModToolTiers.JUNGLE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.JUNGLE, 3, -2.4f))));
    public static final DeferredItem<Item> JUNGLE_WOOD_PICKAXE = ITEMS.register("jungle_wood_pickaxe", () -> new PickaxeItem(ModToolTiers.JUNGLE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.JUNGLE, 1, -2.8f))));
    public static final DeferredItem<Item> JUNGLE_WOOD_AXE = ITEMS.register("jungle_wood_axe", () -> new AxeItem(ModToolTiers.JUNGLE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.JUNGLE, 6, -3.2f))));
    public static final DeferredItem<Item> JUNGLE_WOOD_SHOVEL = ITEMS.register("jungle_wood_shovel", () -> new ShovelItem(ModToolTiers.JUNGLE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.JUNGLE, 1.5f, -3.0f))));
    public static final DeferredItem<Item> JUNGLE_WOOD_HOE = ITEMS.register("jungle_wood_hoe", () -> new HoeItem(ModToolTiers.JUNGLE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.JUNGLE, 0, -3.0f))));
    public static final DeferredItem<Item> JUNGLE_WOOD_HELMET = ITEMS.register("jungle_wood_helmet", () -> new ArmorItem(ModArmorMaterials.JUNGLE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> JUNGLE_WOOD_CHESTPLATE = ITEMS.register("jungle_wood_chestplate", () -> new ArmorItem(ModArmorMaterials.JUNGLE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> JUNGLE_WOOD_LEGGINGS = ITEMS.register("jungle_wood_leggings", () -> new ArmorItem(ModArmorMaterials.JUNGLE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> JUNGLE_WOOD_BOOTS = ITEMS.register("jungle_wood_boots", () -> new ArmorItem(ModArmorMaterials.JUNGLE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));
    public static final DeferredItem<Item> JUNGLE_WOOD_SHIELD = ITEMS.register("jungle_wood_shield", () -> new ShieldItem(new Item.Properties().durability(168)));
    public static final DeferredItem<Item> JUNGLE_WOOD_SPEAR = ITEMS.register("jungle_wood_spear", () -> new CustomSpearItem(ModToolTiers.JUNGLE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.JUNGLE, 3, -2.4f))));

    // === ACACIA ===
    public static final DeferredItem<Item> ACACIA_WOOD_SWORD = ITEMS.register("acacia_wood_sword", () -> new SwordItem(ModToolTiers.ACACIA, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ACACIA, 3, -2.4f))));
    public static final DeferredItem<Item> ACACIA_WOOD_PICKAXE = ITEMS.register("acacia_wood_pickaxe", () -> new PickaxeItem(ModToolTiers.ACACIA, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.ACACIA, 1, -2.8f))));
    public static final DeferredItem<Item> ACACIA_WOOD_AXE = ITEMS.register("acacia_wood_axe", () -> new AxeItem(ModToolTiers.ACACIA, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.ACACIA, 6, -3.2f))));
    public static final DeferredItem<Item> ACACIA_WOOD_SHOVEL = ITEMS.register("acacia_wood_shovel", () -> new ShovelItem(ModToolTiers.ACACIA, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.ACACIA, 1.5f, -3.0f))));
    public static final DeferredItem<Item> ACACIA_WOOD_HOE = ITEMS.register("acacia_wood_hoe", () -> new HoeItem(ModToolTiers.ACACIA, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.ACACIA, 0, -3.0f))));
    public static final DeferredItem<Item> ACACIA_WOOD_HELMET = ITEMS.register("acacia_wood_helmet", () -> new ArmorItem(ModArmorMaterials.ACACIA, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> ACACIA_WOOD_CHESTPLATE = ITEMS.register("acacia_wood_chestplate", () -> new ArmorItem(ModArmorMaterials.ACACIA, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> ACACIA_WOOD_LEGGINGS = ITEMS.register("acacia_wood_leggings", () -> new ArmorItem(ModArmorMaterials.ACACIA, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> ACACIA_WOOD_BOOTS = ITEMS.register("acacia_wood_boots", () -> new ArmorItem(ModArmorMaterials.ACACIA, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));
    public static final DeferredItem<Item> ACACIA_WOOD_SHIELD = ITEMS.register("acacia_wood_shield", () -> new ShieldItem(new Item.Properties().durability(168)));
    public static final DeferredItem<Item> ACACIA_WOOD_SPEAR = ITEMS.register("acacia_wood_spear", () -> new CustomSpearItem(ModToolTiers.ACACIA, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ACACIA, 3, -2.4f))));

    // === DARK OAK ===
    public static final DeferredItem<Item> DARK_OAK_WOOD_SWORD = ITEMS.register("dark_oak_wood_sword", () -> new SwordItem(ModToolTiers.DARK_OAK, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.DARK_OAK, 3, -2.4f))));
    public static final DeferredItem<Item> DARK_OAK_WOOD_PICKAXE = ITEMS.register("dark_oak_wood_pickaxe", () -> new PickaxeItem(ModToolTiers.DARK_OAK, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.DARK_OAK, 1, -2.8f))));
    public static final DeferredItem<Item> DARK_OAK_WOOD_AXE = ITEMS.register("dark_oak_wood_axe", () -> new AxeItem(ModToolTiers.DARK_OAK, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.DARK_OAK, 6, -3.2f))));
    public static final DeferredItem<Item> DARK_OAK_WOOD_SHOVEL = ITEMS.register("dark_oak_wood_shovel", () -> new ShovelItem(ModToolTiers.DARK_OAK, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.DARK_OAK, 1.5f, -3.0f))));
    public static final DeferredItem<Item> DARK_OAK_WOOD_HOE = ITEMS.register("dark_oak_wood_hoe", () -> new HoeItem(ModToolTiers.DARK_OAK, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.DARK_OAK, 0, -3.0f))));
    public static final DeferredItem<Item> DARK_OAK_WOOD_HELMET = ITEMS.register("dark_oak_wood_helmet", () -> new ArmorItem(ModArmorMaterials.DARK_OAK, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> DARK_OAK_WOOD_CHESTPLATE = ITEMS.register("dark_oak_wood_chestplate", () -> new ArmorItem(ModArmorMaterials.DARK_OAK, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> DARK_OAK_WOOD_LEGGINGS = ITEMS.register("dark_oak_wood_leggings", () -> new ArmorItem(ModArmorMaterials.DARK_OAK, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> DARK_OAK_WOOD_BOOTS = ITEMS.register("dark_oak_wood_boots", () -> new ArmorItem(ModArmorMaterials.DARK_OAK, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));
    public static final DeferredItem<Item> DARK_OAK_WOOD_SHIELD = ITEMS.register("dark_oak_wood_shield", () -> new ShieldItem(new Item.Properties().durability(168)));
    public static final DeferredItem<Item> DARK_OAK_WOOD_SPEAR = ITEMS.register("dark_oak_wood_spear", () -> new CustomSpearItem(ModToolTiers.DARK_OAK, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.DARK_OAK, 3, -2.4f))));

    // === MANGROVE ===
    public static final DeferredItem<Item> MANGROVE_WOOD_SWORD = ITEMS.register("mangrove_wood_sword", () -> new SwordItem(ModToolTiers.MANGROVE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.MANGROVE, 3, -2.4f))));
    public static final DeferredItem<Item> MANGROVE_WOOD_PICKAXE = ITEMS.register("mangrove_wood_pickaxe", () -> new PickaxeItem(ModToolTiers.MANGROVE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.MANGROVE, 1, -2.8f))));
    public static final DeferredItem<Item> MANGROVE_WOOD_AXE = ITEMS.register("mangrove_wood_axe", () -> new AxeItem(ModToolTiers.MANGROVE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.MANGROVE, 6, -3.2f))));
    public static final DeferredItem<Item> MANGROVE_WOOD_SHOVEL = ITEMS.register("mangrove_wood_shovel", () -> new ShovelItem(ModToolTiers.MANGROVE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.MANGROVE, 1.5f, -3.0f))));
    public static final DeferredItem<Item> MANGROVE_WOOD_HOE = ITEMS.register("mangrove_wood_hoe", () -> new HoeItem(ModToolTiers.MANGROVE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.MANGROVE, 0, -3.0f))));
    public static final DeferredItem<Item> MANGROVE_WOOD_HELMET = ITEMS.register("mangrove_wood_helmet", () -> new ArmorItem(ModArmorMaterials.MANGROVE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> MANGROVE_WOOD_CHESTPLATE = ITEMS.register("mangrove_wood_chestplate", () -> new ArmorItem(ModArmorMaterials.MANGROVE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> MANGROVE_WOOD_LEGGINGS = ITEMS.register("mangrove_wood_leggings", () -> new ArmorItem(ModArmorMaterials.MANGROVE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> MANGROVE_WOOD_BOOTS = ITEMS.register("mangrove_wood_boots", () -> new ArmorItem(ModArmorMaterials.MANGROVE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));
    public static final DeferredItem<Item> MANGROVE_WOOD_SHIELD = ITEMS.register("mangrove_wood_shield", () -> new ShieldItem(new Item.Properties().durability(168)));
    public static final DeferredItem<Item> MANGROVE_WOOD_SPEAR = ITEMS.register("mangrove_wood_spear", () -> new CustomSpearItem(ModToolTiers.MANGROVE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.MANGROVE, 3, -2.4f))));

    // === CHERRY ===
    public static final DeferredItem<Item> CHERRY_WOOD_SWORD = ITEMS.register("cherry_wood_sword", () -> new SwordItem(ModToolTiers.CHERRY, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CHERRY, 3, -2.4f))));
    public static final DeferredItem<Item> CHERRY_WOOD_PICKAXE = ITEMS.register("cherry_wood_pickaxe", () -> new PickaxeItem(ModToolTiers.CHERRY, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.CHERRY, 1, -2.8f))));
    public static final DeferredItem<Item> CHERRY_WOOD_AXE = ITEMS.register("cherry_wood_axe", () -> new AxeItem(ModToolTiers.CHERRY, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.CHERRY, 6, -3.2f))));
    public static final DeferredItem<Item> CHERRY_WOOD_SHOVEL = ITEMS.register("cherry_wood_shovel", () -> new ShovelItem(ModToolTiers.CHERRY, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.CHERRY, 1.5f, -3.0f))));
    public static final DeferredItem<Item> CHERRY_WOOD_HOE = ITEMS.register("cherry_wood_hoe", () -> new HoeItem(ModToolTiers.CHERRY, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.CHERRY, 0, -3.0f))));
    public static final DeferredItem<Item> CHERRY_WOOD_HELMET = ITEMS.register("cherry_wood_helmet", () -> new ArmorItem(ModArmorMaterials.CHERRY, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> CHERRY_WOOD_CHESTPLATE = ITEMS.register("cherry_wood_chestplate", () -> new ArmorItem(ModArmorMaterials.CHERRY, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> CHERRY_WOOD_LEGGINGS = ITEMS.register("cherry_wood_leggings", () -> new ArmorItem(ModArmorMaterials.CHERRY, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> CHERRY_WOOD_BOOTS = ITEMS.register("cherry_wood_boots", () -> new ArmorItem(ModArmorMaterials.CHERRY, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));
    public static final DeferredItem<Item> CHERRY_WOOD_SHIELD = ITEMS.register("cherry_wood_shield", () -> new ShieldItem(new Item.Properties().durability(168)));
    public static final DeferredItem<Item> CHERRY_WOOD_SPEAR = ITEMS.register("cherry_wood_spear", () -> new CustomSpearItem(ModToolTiers.CHERRY, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CHERRY, 3, -2.4f))));

    // === BAMBOO ===
    public static final DeferredItem<Item> BAMBOO_WOOD_SWORD = ITEMS.register("bamboo_wood_sword", () -> new SwordItem(ModToolTiers.BAMBOO, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BAMBOO, 3, -2.4f))));
    public static final DeferredItem<Item> BAMBOO_WOOD_PICKAXE = ITEMS.register("bamboo_wood_pickaxe", () -> new PickaxeItem(ModToolTiers.BAMBOO, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BAMBOO, 1, -2.8f))));
    public static final DeferredItem<Item> BAMBOO_WOOD_AXE = ITEMS.register("bamboo_wood_axe", () -> new AxeItem(ModToolTiers.BAMBOO, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BAMBOO, 6, -3.2f))));
    public static final DeferredItem<Item> BAMBOO_WOOD_SHOVEL = ITEMS.register("bamboo_wood_shovel", () -> new ShovelItem(ModToolTiers.BAMBOO, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BAMBOO, 1.5f, -3.0f))));
    public static final DeferredItem<Item> BAMBOO_WOOD_HOE = ITEMS.register("bamboo_wood_hoe", () -> new HoeItem(ModToolTiers.BAMBOO, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BAMBOO, 0, -3.0f))));
    public static final DeferredItem<Item> BAMBOO_WOOD_HELMET = ITEMS.register("bamboo_wood_helmet", () -> new ArmorItem(ModArmorMaterials.BAMBOO, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> BAMBOO_WOOD_CHESTPLATE = ITEMS.register("bamboo_wood_chestplate", () -> new ArmorItem(ModArmorMaterials.BAMBOO, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> BAMBOO_WOOD_LEGGINGS = ITEMS.register("bamboo_wood_leggings", () -> new ArmorItem(ModArmorMaterials.BAMBOO, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> BAMBOO_WOOD_BOOTS = ITEMS.register("bamboo_wood_boots", () -> new ArmorItem(ModArmorMaterials.BAMBOO, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));
    public static final DeferredItem<Item> BAMBOO_WOOD_SHIELD = ITEMS.register("bamboo_wood_shield", () -> new ShieldItem(new Item.Properties().durability(168)));
    public static final DeferredItem<Item> BAMBOO_WOOD_SPEAR = ITEMS.register("bamboo_wood_spear", () -> new CustomSpearItem(ModToolTiers.BAMBOO, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BAMBOO, 3, -2.4f))));

    // === CRIMSON ===
    public static final DeferredItem<Item> CRIMSON_WOOD_SWORD = ITEMS.register("crimson_wood_sword", () -> new SwordItem(ModToolTiers.CRIMSON, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CRIMSON, 3, -2.4f))));
    public static final DeferredItem<Item> CRIMSON_WOOD_PICKAXE = ITEMS.register("crimson_wood_pickaxe", () -> new PickaxeItem(ModToolTiers.CRIMSON, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.CRIMSON, 1, -2.8f))));
    public static final DeferredItem<Item> CRIMSON_WOOD_AXE = ITEMS.register("crimson_wood_axe", () -> new AxeItem(ModToolTiers.CRIMSON, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.CRIMSON, 6, -3.2f))));
    public static final DeferredItem<Item> CRIMSON_WOOD_SHOVEL = ITEMS.register("crimson_wood_shovel", () -> new ShovelItem(ModToolTiers.CRIMSON, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.CRIMSON, 1.5f, -3.0f))));
    public static final DeferredItem<Item> CRIMSON_WOOD_HOE = ITEMS.register("crimson_wood_hoe", () -> new HoeItem(ModToolTiers.CRIMSON, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.CRIMSON, 0, -3.0f))));
    public static final DeferredItem<Item> CRIMSON_WOOD_HELMET = ITEMS.register("crimson_wood_helmet", () -> new ArmorItem(ModArmorMaterials.CRIMSON, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> CRIMSON_WOOD_CHESTPLATE = ITEMS.register("crimson_wood_chestplate", () -> new ArmorItem(ModArmorMaterials.CRIMSON, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> CRIMSON_WOOD_LEGGINGS = ITEMS.register("crimson_wood_leggings", () -> new ArmorItem(ModArmorMaterials.CRIMSON, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> CRIMSON_WOOD_BOOTS = ITEMS.register("crimson_wood_boots", () -> new ArmorItem(ModArmorMaterials.CRIMSON, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));
    public static final DeferredItem<Item> CRIMSON_WOOD_SHIELD = ITEMS.register("crimson_wood_shield", () -> new ShieldItem(new Item.Properties().durability(168)));
    public static final DeferredItem<Item> CRIMSON_WOOD_SPEAR = ITEMS.register("crimson_wood_spear", () -> new CustomSpearItem(ModToolTiers.CRIMSON, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CRIMSON, 3, -2.4f))));

    // === WARPED ===
    public static final DeferredItem<Item> WARPED_WOOD_SWORD = ITEMS.register("warped_wood_sword", () -> new SwordItem(ModToolTiers.WARPED, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.WARPED, 3, -2.4f))));
    public static final DeferredItem<Item> WARPED_WOOD_PICKAXE = ITEMS.register("warped_wood_pickaxe", () -> new PickaxeItem(ModToolTiers.WARPED, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.WARPED, 1, -2.8f))));
    public static final DeferredItem<Item> WARPED_WOOD_AXE = ITEMS.register("warped_wood_axe", () -> new AxeItem(ModToolTiers.WARPED, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.WARPED, 6, -3.2f))));
    public static final DeferredItem<Item> WARPED_WOOD_SHOVEL = ITEMS.register("warped_wood_shovel", () -> new ShovelItem(ModToolTiers.WARPED, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.WARPED, 1.5f, -3.0f))));
    public static final DeferredItem<Item> WARPED_WOOD_HOE = ITEMS.register("warped_wood_hoe", () -> new HoeItem(ModToolTiers.WARPED, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.WARPED, 0, -3.0f))));
    public static final DeferredItem<Item> WARPED_WOOD_HELMET = ITEMS.register("warped_wood_helmet", () -> new ArmorItem(ModArmorMaterials.WARPED, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> WARPED_WOOD_CHESTPLATE = ITEMS.register("warped_wood_chestplate", () -> new ArmorItem(ModArmorMaterials.WARPED, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> WARPED_WOOD_LEGGINGS = ITEMS.register("warped_wood_leggings", () -> new ArmorItem(ModArmorMaterials.WARPED, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> WARPED_WOOD_BOOTS = ITEMS.register("warped_wood_boots", () -> new ArmorItem(ModArmorMaterials.WARPED, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));
    public static final DeferredItem<Item> WARPED_WOOD_SHIELD = ITEMS.register("warped_wood_shield", () -> new ShieldItem(new Item.Properties().durability(168)));
    public static final DeferredItem<Item> WARPED_WOOD_SPEAR = ITEMS.register("warped_wood_spear", () -> new CustomSpearItem(ModToolTiers.WARPED, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.WARPED, 3, -2.4f))));

    // === FLINT ===
    public static final DeferredItem<Item> FLINT_SWORD = ITEMS.register("flint_sword", () -> new SwordItem(ModToolTiers.FLINT, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.FLINT, 3, -2.4f))));
    public static final DeferredItem<Item> FLINT_PICKAXE = ITEMS.register("flint_pickaxe", () -> new PickaxeItem(ModToolTiers.FLINT, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.FLINT, 1, -2.8f))));
    public static final DeferredItem<Item> FLINT_AXE = ITEMS.register("flint_axe", () -> new AxeItem(ModToolTiers.FLINT, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.FLINT, 6, -3.2f))));
    public static final DeferredItem<Item> FLINT_SHOVEL = ITEMS.register("flint_shovel", () -> new ShovelItem(ModToolTiers.FLINT, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.FLINT, 1.5f, -3.0f))));
    public static final DeferredItem<Item> FLINT_HOE = ITEMS.register("flint_hoe", () -> new HoeItem(ModToolTiers.FLINT, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.FLINT, 0, -3.0f))));
    public static final DeferredItem<Item> FLINT_HELMET = ITEMS.register("flint_helmet", () -> new CustomFlintArmorItem(ModArmorMaterials.FLINT, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(7))));
    public static final DeferredItem<Item> FLINT_CHESTPLATE = ITEMS.register("flint_chestplate", () -> new CustomFlintArmorItem(ModArmorMaterials.FLINT, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(7))));
    public static final DeferredItem<Item> FLINT_LEGGINGS = ITEMS.register("flint_leggings", () -> new CustomFlintArmorItem(ModArmorMaterials.FLINT, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(7))));
    public static final DeferredItem<Item> FLINT_BOOTS = ITEMS.register("flint_boots", () -> new CustomFlintArmorItem(ModArmorMaterials.FLINT, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(7))));
    public static final DeferredItem<Item> FLINT_SPEAR = ITEMS.register("flint_spear", () -> new CustomSpearItem(ModToolTiers.FLINT, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.FLINT, 3, -2.4f))));

    // === STONE ===
    public static final DeferredItem<Item> STONE_SWORD = ITEMS.register("stone_sword", () -> new SwordItem(ModToolTiers.STONE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.STONE, 3, -2.4f))));
    public static final DeferredItem<Item> STONE_PICKAXE = ITEMS.register("stone_pickaxe", () -> new PickaxeItem(ModToolTiers.STONE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.STONE, 1, -2.8f))));
    public static final DeferredItem<Item> STONE_AXE = ITEMS.register("stone_axe", () -> new AxeItem(ModToolTiers.STONE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.STONE, 6, -3.2f))));
    public static final DeferredItem<Item> STONE_SHOVEL = ITEMS.register("stone_shovel", () -> new ShovelItem(ModToolTiers.STONE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.STONE, 1.5f, -3.0f))));
    public static final DeferredItem<Item> STONE_HOE = ITEMS.register("stone_hoe", () -> new HoeItem(ModToolTiers.STONE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.STONE, 0, -3.0f))));
    public static final DeferredItem<Item> STONE_HELMET = ITEMS.register("stone_helmet", () -> new ArmorItem(ModArmorMaterials.STONE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(7))));
    public static final DeferredItem<Item> STONE_CHESTPLATE = ITEMS.register("stone_chestplate", () -> new ArmorItem(ModArmorMaterials.STONE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(7))));
    public static final DeferredItem<Item> STONE_LEGGINGS = ITEMS.register("stone_leggings", () -> new ArmorItem(ModArmorMaterials.STONE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(7))));
    public static final DeferredItem<Item> STONE_BOOTS = ITEMS.register("stone_boots", () -> new ArmorItem(ModArmorMaterials.STONE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(7))));
    public static final DeferredItem<Item> STONE_SPEAR = ITEMS.register("stone_spear", () -> new CustomSpearItem(ModToolTiers.STONE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.STONE, 3, -2.4f))));

    // === LEATHER ===
    public static final DeferredItem<Item> LEATHER_SWORD = ITEMS.register("leather_sword", () -> new CustomLeatherToolItem(ModToolTiers.LEATHER, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.LEATHER, 3, -2.4f))));
    public static final DeferredItem<Item> LEATHER_PICKAXE = ITEMS.register("leather_pickaxe", () -> new CustomLeatherToolItem(ModToolTiers.LEATHER, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.LEATHER, 1, -2.8f))));
    public static final DeferredItem<Item> LEATHER_AXE = ITEMS.register("leather_axe", () -> new CustomLeatherToolItem(ModToolTiers.LEATHER, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.LEATHER, 6, -3.2f))));
    public static final DeferredItem<Item> LEATHER_SHOVEL = ITEMS.register("leather_shovel", () -> new CustomLeatherToolItem(ModToolTiers.LEATHER, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.LEATHER, 1.5f, -3.0f))));
    public static final DeferredItem<Item> LEATHER_HOE = ITEMS.register("leather_hoe", () -> new CustomLeatherToolItem(ModToolTiers.LEATHER, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.LEATHER, 0, -3.0f))));
    public static final DeferredItem<Item> LEATHER_HELMET = ITEMS.register("leather_helmet", () -> new ArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> LEATHER_CHESTPLATE = ITEMS.register("leather_chestplate", () -> new ArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> LEATHER_LEGGINGS = ITEMS.register("leather_leggings", () -> new ArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> LEATHER_BOOTS = ITEMS.register("leather_boots", () -> new ArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));
    public static final DeferredItem<Item> LEATHER_SPEAR = ITEMS.register("leather_spear", () -> new CustomSpearItem(ModToolTiers.LEATHER, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.LEATHER, 3, -2.4f))));

    // === CHAIN ===
    public static final DeferredItem<Item> CHAIN_SWORD = ITEMS.register("chain_sword", () -> new SwordItem(ModToolTiers.CHAIN, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CHAIN, 3, -2.4f))));
    public static final DeferredItem<Item> CHAIN_PICKAXE = ITEMS.register("chain_pickaxe", () -> new PickaxeItem(ModToolTiers.CHAIN, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.CHAIN, 1, -2.8f))));
    public static final DeferredItem<Item> CHAIN_AXE = ITEMS.register("chain_axe", () -> new AxeItem(ModToolTiers.CHAIN, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.CHAIN, 6, -3.2f))));
    public static final DeferredItem<Item> CHAIN_SHOVEL = ITEMS.register("chain_shovel", () -> new ShovelItem(ModToolTiers.CHAIN, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.CHAIN, 1.5f, -3.0f))));
    public static final DeferredItem<Item> CHAIN_HOE = ITEMS.register("chain_hoe", () -> new HoeItem(ModToolTiers.CHAIN, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.CHAIN, 0, -3.0f))));
    public static final DeferredItem<Item> CHAIN_HELMET = ITEMS.register("chain_helmet", () -> new ArmorItem(ModArmorMaterials.CHAIN, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<Item> CHAIN_CHESTPLATE = ITEMS.register("chain_chestplate", () -> new ArmorItem(ModArmorMaterials.CHAIN, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<Item> CHAIN_LEGGINGS = ITEMS.register("chain_leggings", () -> new ArmorItem(ModArmorMaterials.CHAIN, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<Item> CHAIN_BOOTS = ITEMS.register("chain_boots", () -> new ArmorItem(ModArmorMaterials.CHAIN, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));
    public static final DeferredItem<Item> CHAIN_SPEAR = ITEMS.register("chain_spear", () -> new CustomSpearItem(ModToolTiers.CHAIN, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CHAIN, 3, -2.4f))));

    // === COPPER ===
    public static final DeferredItem<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ModToolTiers.COPPER, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.COPPER, 3, -2.4f))));
    public static final DeferredItem<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ModToolTiers.COPPER, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.COPPER, 1, -2.8f))));
    public static final DeferredItem<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ModToolTiers.COPPER, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.COPPER, 6, -3.2f))));
    public static final DeferredItem<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ModToolTiers.COPPER, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.COPPER, 1.5f, -3.0f))));
    public static final DeferredItem<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ModToolTiers.COPPER, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.COPPER, 0, -3.0f))));
    public static final DeferredItem<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));
    public static final DeferredItem<Item> COPPER_SPEAR = ITEMS.register("copper_spear", () -> new CustomSpearItem(ModToolTiers.COPPER, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.COPPER, 3, -2.4f))));

    // === DEEPSLATE ===
    public static final DeferredItem<Item> DEEPSLATE_SWORD = ITEMS.register("deepslate_sword", () -> new SwordItem(ModToolTiers.DEEPSLATE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.DEEPSLATE, 3, -2.4f))));
    public static final DeferredItem<Item> DEEPSLATE_PICKAXE = ITEMS.register("deepslate_pickaxe", () -> new PickaxeItem(ModToolTiers.DEEPSLATE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.DEEPSLATE, 1, -2.8f))));
    public static final DeferredItem<Item> DEEPSLATE_AXE = ITEMS.register("deepslate_axe", () -> new AxeItem(ModToolTiers.DEEPSLATE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.DEEPSLATE, 6, -3.2f))));
    public static final DeferredItem<Item> DEEPSLATE_SHOVEL = ITEMS.register("deepslate_shovel", () -> new ShovelItem(ModToolTiers.DEEPSLATE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.DEEPSLATE, 1.5f, -3.0f))));
    public static final DeferredItem<Item> DEEPSLATE_HOE = ITEMS.register("deepslate_hoe", () -> new HoeItem(ModToolTiers.DEEPSLATE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.DEEPSLATE, 0, -3.0f))));
    public static final DeferredItem<Item> DEEPSLATE_HELMET = ITEMS.register("deepslate_helmet", () -> new ArmorItem(ModArmorMaterials.DEEPSLATE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(10))));
    public static final DeferredItem<Item> DEEPSLATE_CHESTPLATE = ITEMS.register("deepslate_chestplate", () -> new ArmorItem(ModArmorMaterials.DEEPSLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(10))));
    public static final DeferredItem<Item> DEEPSLATE_LEGGINGS = ITEMS.register("deepslate_leggings", () -> new ArmorItem(ModArmorMaterials.DEEPSLATE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(10))));
    public static final DeferredItem<Item> DEEPSLATE_BOOTS = ITEMS.register("deepslate_boots", () -> new ArmorItem(ModArmorMaterials.DEEPSLATE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(10))));
    public static final DeferredItem<Item> DEEPSLATE_SPEAR = ITEMS.register("deepslate_spear", () -> new CustomSpearItem(ModToolTiers.DEEPSLATE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.DEEPSLATE, 3, -2.4f))));

    // === OBSIDIAN ===
    public static final DeferredItem<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new SwordItem(ModToolTiers.OBSIDIAN, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.OBSIDIAN, 3, -2.4f))));
    public static final DeferredItem<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new PickaxeItem(ModToolTiers.OBSIDIAN, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.OBSIDIAN, 1, -2.8f))));
    public static final DeferredItem<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new AxeItem(ModToolTiers.OBSIDIAN, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.OBSIDIAN, 6, -3.2f))));
    public static final DeferredItem<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ShovelItem(ModToolTiers.OBSIDIAN, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.OBSIDIAN, 1.5f, -3.0f))));
    public static final DeferredItem<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new HoeItem(ModToolTiers.OBSIDIAN, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.OBSIDIAN, 0, -3.0f))));
    public static final DeferredItem<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new CustomObsidianArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(37))));
    public static final DeferredItem<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", () -> new CustomObsidianArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(37))));
    public static final DeferredItem<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", () -> new CustomObsidianArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(37))));
    public static final DeferredItem<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", () -> new CustomObsidianArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(37))));
    public static final DeferredItem<Item> OBSIDIAN_SPEAR = ITEMS.register("obsidian_spear", () -> new CustomSpearItem(ModToolTiers.OBSIDIAN, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.OBSIDIAN, 3, -2.4f))));

    // === REDSTONE ===
    public static final DeferredItem<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword", () -> new SwordItem(ModToolTiers.REDSTONE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.REDSTONE, 3, -2.4f))));
    public static final DeferredItem<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", () -> new PickaxeItem(ModToolTiers.REDSTONE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.REDSTONE, 1, -2.8f))));
    public static final DeferredItem<Item> REDSTONE_AXE = ITEMS.register("redstone_axe", () -> new AxeItem(ModToolTiers.REDSTONE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.REDSTONE, 6, -3.2f))));
    public static final DeferredItem<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel", () -> new ShovelItem(ModToolTiers.REDSTONE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.REDSTONE, 1.5f, -3.0f))));
    public static final DeferredItem<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe", () -> new HoeItem(ModToolTiers.REDSTONE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.REDSTONE, 0, -3.0f))));
    public static final DeferredItem<Item> REDSTONE_HELMET = ITEMS.register("redstone_helmet", () -> new CustomRedstoneArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<Item> REDSTONE_CHESTPLATE = ITEMS.register("redstone_chestplate", () -> new CustomRedstoneArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<Item> REDSTONE_LEGGINGS = ITEMS.register("redstone_leggings", () -> new CustomRedstoneArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<Item> REDSTONE_BOOTS = ITEMS.register("redstone_boots", () -> new CustomRedstoneArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));
    public static final DeferredItem<Item> REDSTONE_SPEAR = ITEMS.register("redstone_spear", () -> new CustomSpearItem(ModToolTiers.REDSTONE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.REDSTONE, 3, -2.4f))));

    // === LAPIS ===
    public static final DeferredItem<Item> LAPIS_SWORD = ITEMS.register("lapis_sword", () -> new SwordItem(ModToolTiers.LAPIS, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.LAPIS, 3, -2.4f))));
    public static final DeferredItem<Item> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe", () -> new PickaxeItem(ModToolTiers.LAPIS, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.LAPIS, 1, -2.8f))));
    public static final DeferredItem<Item> LAPIS_AXE = ITEMS.register("lapis_axe", () -> new AxeItem(ModToolTiers.LAPIS, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.LAPIS, 6, -3.2f))));
    public static final DeferredItem<Item> LAPIS_SHOVEL = ITEMS.register("lapis_shovel", () -> new ShovelItem(ModToolTiers.LAPIS, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.LAPIS, 1.5f, -3.0f))));
    public static final DeferredItem<Item> LAPIS_HOE = ITEMS.register("lapis_hoe", () -> new HoeItem(ModToolTiers.LAPIS, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.LAPIS, 0, -3.0f))));
    public static final DeferredItem<Item> LAPIS_HELMET = ITEMS.register("lapis_helmet", () -> new CustomLapisArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<Item> LAPIS_CHESTPLATE = ITEMS.register("lapis_chestplate", () -> new CustomLapisArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<Item> LAPIS_LEGGINGS = ITEMS.register("lapis_leggings", () -> new CustomLapisArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<Item> LAPIS_BOOTS = ITEMS.register("lapis_boots", () -> new CustomLapisArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));
    public static final DeferredItem<Item> LAPIS_SPEAR = ITEMS.register("lapis_spear", () -> new CustomSpearItem(ModToolTiers.LAPIS, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.LAPIS, 3, -2.4f))));

    // === QUARTZ ===
    public static final DeferredItem<Item> QUARTZ_SWORD = ITEMS.register("quartz_sword", () -> new SwordItem(ModToolTiers.QUARTZ, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.QUARTZ, 3, -2.4f))));
    public static final DeferredItem<Item> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe", () -> new PickaxeItem(ModToolTiers.QUARTZ, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.QUARTZ, 1, -2.8f))));
    public static final DeferredItem<Item> QUARTZ_AXE = ITEMS.register("quartz_axe", () -> new AxeItem(ModToolTiers.QUARTZ, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.QUARTZ, 6, -3.2f))));
    public static final DeferredItem<Item> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel", () -> new ShovelItem(ModToolTiers.QUARTZ, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.QUARTZ, 1.5f, -3.0f))));
    public static final DeferredItem<Item> QUARTZ_HOE = ITEMS.register("quartz_hoe", () -> new HoeItem(ModToolTiers.QUARTZ, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.QUARTZ, 0, -3.0f))));
    public static final DeferredItem<Item> QUARTZ_HELMET = ITEMS.register("quartz_helmet", () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<Item> QUARTZ_CHESTPLATE = ITEMS.register("quartz_chestplate", () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<Item> QUARTZ_LEGGINGS = ITEMS.register("quartz_leggings", () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<Item> QUARTZ_BOOTS = ITEMS.register("quartz_boots", () -> new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));
    public static final DeferredItem<Item> QUARTZ_SPEAR = ITEMS.register("quartz_spear", () -> new CustomSpearItem(ModToolTiers.QUARTZ, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.QUARTZ, 3, -2.4f))));

    // === CARBON FIBER ===
    public static final DeferredItem<Item> CARBON_FIBER_SWORD = ITEMS.register("carbon_fiber_sword", () -> new SwordItem(ModToolTiers.CARBON_FIBER, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CARBON_FIBER, 3, -2.4f))));
    public static final DeferredItem<Item> CARBON_FIBER_PICKAXE = ITEMS.register("carbon_fiber_pickaxe", () -> new PickaxeItem(ModToolTiers.CARBON_FIBER, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.CARBON_FIBER, 1, -2.8f))));
    public static final DeferredItem<Item> CARBON_FIBER_AXE = ITEMS.register("carbon_fiber_axe", () -> new AxeItem(ModToolTiers.CARBON_FIBER, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.CARBON_FIBER, 6, -3.2f))));
    public static final DeferredItem<Item> CARBON_FIBER_SHOVEL = ITEMS.register("carbon_fiber_shovel", () -> new ShovelItem(ModToolTiers.CARBON_FIBER, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.CARBON_FIBER, 1.5f, -3.0f))));
    public static final DeferredItem<Item> CARBON_FIBER_HOE = ITEMS.register("carbon_fiber_hoe", () -> new HoeItem(ModToolTiers.CARBON_FIBER, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.CARBON_FIBER, 0, -3.0f))));
    public static final DeferredItem<Item> CARBON_FIBER_HELMET = ITEMS.register("carbon_fiber_helmet", () -> new ArmorItem(ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(20))));
    public static final DeferredItem<Item> CARBON_FIBER_CHESTPLATE = ITEMS.register("carbon_fiber_chestplate", () -> new ArmorItem(ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(20))));
    public static final DeferredItem<Item> CARBON_FIBER_LEGGINGS = ITEMS.register("carbon_fiber_leggings", () -> new ArmorItem(ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(20))));
    public static final DeferredItem<Item> CARBON_FIBER_BOOTS = ITEMS.register("carbon_fiber_boots", () -> new ArmorItem(ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(20))));
    public static final DeferredItem<Item> CARBON_FIBER_SPEAR = ITEMS.register("carbon_fiber_spear", () -> new CustomSpearItem(ModToolTiers.CARBON_FIBER, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CARBON_FIBER, 3, -2.4f))));

    // === AMETHYST ===
    public static final DeferredItem<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.AMETHYST, 3, -2.4f))));
    public static final DeferredItem<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.AMETHYST, 1, -2.8f))));
    public static final DeferredItem<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.AMETHYST, 6, -3.2f))));
    public static final DeferredItem<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.AMETHYST, 1.5f, -3.0f))));
    public static final DeferredItem<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.AMETHYST, 0, -3.0f))));
    public static final DeferredItem<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(25))));
    public static final DeferredItem<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(25))));
    public static final DeferredItem<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(25))));
    public static final DeferredItem<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(25))));
    public static final DeferredItem<Item> AMETHYST_SPEAR = ITEMS.register("amethyst_spear", () -> new CustomSpearItem(ModToolTiers.AMETHYST, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.AMETHYST, 3, -2.4f))));

    // === EMERALD ===
    public static final DeferredItem<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ModToolTiers.EMERALD, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.EMERALD, 3, -2.4f))));
    public static final DeferredItem<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModToolTiers.EMERALD, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.EMERALD, 1, -2.8f))));
    public static final DeferredItem<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ModToolTiers.EMERALD, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.EMERALD, 6, -3.2f))));
    public static final DeferredItem<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ModToolTiers.EMERALD, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.EMERALD, 1.5f, -3.0f))));
    public static final DeferredItem<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ModToolTiers.EMERALD, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.EMERALD, 0, -3.0f))));
    public static final DeferredItem<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new CustomEmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(25))));
    public static final DeferredItem<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new CustomEmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(25))));
    public static final DeferredItem<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new CustomEmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(25))));
    public static final DeferredItem<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new CustomEmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(25))));
    public static final DeferredItem<Item> EMERALD_SPEAR = ITEMS.register("emerald_spear", () -> new CustomSpearItem(ModToolTiers.EMERALD, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.EMERALD, 3, -2.4f))));

    // === ECHO ===
    public static final DeferredItem<Item> ECHO_SWORD = ITEMS.register("echo_sword", () -> new CustomEchoToolItem(ModToolTiers.ECHO, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ECHO, 3, -2.4f))));
    public static final DeferredItem<Item> ECHO_PICKAXE = ITEMS.register("echo_pickaxe", () -> new CustomEchoToolItem(ModToolTiers.ECHO, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.ECHO, 1, -2.8f))));
    public static final DeferredItem<Item> ECHO_AXE = ITEMS.register("echo_axe", () -> new CustomEchoToolItem(ModToolTiers.ECHO, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.ECHO, 6, -3.2f))));
    public static final DeferredItem<Item> ECHO_SHOVEL = ITEMS.register("echo_shovel", () -> new CustomEchoToolItem(ModToolTiers.ECHO, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.ECHO, 1.5f, -3.0f))));
    public static final DeferredItem<Item> ECHO_HOE = ITEMS.register("echo_hoe", () -> new CustomEchoToolItem(ModToolTiers.ECHO, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.ECHO, 0, -3.0f))));
    public static final DeferredItem<Item> ECHO_HELMET = ITEMS.register("echo_helmet", () -> new CustomEchoArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(37))));
    public static final DeferredItem<Item> ECHO_CHESTPLATE = ITEMS.register("echo_chestplate", () -> new CustomEchoArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(37))));
    public static final DeferredItem<Item> ECHO_LEGGINGS = ITEMS.register("echo_leggings", () -> new CustomEchoArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(37))));
    public static final DeferredItem<Item> ECHO_BOOTS = ITEMS.register("echo_boots", () -> new CustomEchoArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(37))));
    public static final DeferredItem<Item> ECHO_SPEAR = ITEMS.register("echo_spear", () -> new CustomSpearItem(ModToolTiers.ECHO, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ECHO, 3, -2.4f))));

    // === EXTRA SPEARS ===
    public static final DeferredItem<Item> IRON_SPEAR = ITEMS.register("iron_spear", () -> new CustomSpearItem(Tiers.IRON, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.IRON, 3, -2.4f))));
    public static final DeferredItem<Item> GOLD_SPEAR = ITEMS.register("gold_spear", () -> new CustomSpearItem(Tiers.GOLD, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.GOLD, 3, -2.4f))));
    public static final DeferredItem<Item> DIAMOND_SPEAR = ITEMS.register("diamond_spear", () -> new CustomSpearItem(Tiers.DIAMOND, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.DIAMOND, 3, -2.4f))));
    public static final DeferredItem<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear", () -> new CustomSpearItem(Tiers.NETHERITE, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.NETHERITE, 3, -2.4f))));

    // === BASE TOOLS (FOR COMPLETENESS) ===
    public static final DeferredItem<Item> IRON_SWORD = ITEMS.register("iron_sword_alt", () -> new SwordItem(Tiers.IRON, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.IRON, 3, -2.4f))));
    public static final DeferredItem<Item> IRON_PICKAXE = ITEMS.register("iron_pickaxe_alt", () -> new PickaxeItem(Tiers.IRON, new Item.Properties().attributes(PickaxeItem.createAttributes(Tiers.IRON, 1, -2.8f))));
    public static final DeferredItem<Item> IRON_AXE = ITEMS.register("iron_axe_alt", () -> new AxeItem(Tiers.IRON, new Item.Properties().attributes(AxeItem.createAttributes(Tiers.IRON, 6, -3.2f))));
    public static final DeferredItem<Item> IRON_SHOVEL = ITEMS.register("iron_shovel_alt", () -> new ShovelItem(Tiers.IRON, new Item.Properties().attributes(ShovelItem.createAttributes(Tiers.IRON, 1.5f, -3.0f))));
    public static final DeferredItem<Item> IRON_HOE = ITEMS.register("iron_hoe_alt", () -> new HoeItem(Tiers.IRON, new Item.Properties().attributes(HoeItem.createAttributes(Tiers.IRON, 0, -3.0f))));
    public static final DeferredItem<Item> IRON_HELMET = ITEMS.register("iron_helmet_alt", () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<Item> IRON_CHESTPLATE = ITEMS.register("iron_chestplate_alt", () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<Item> IRON_LEGGINGS = ITEMS.register("iron_leggings_alt", () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<Item> IRON_BOOTS = ITEMS.register("iron_boots_alt", () -> new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));

    public static final DeferredItem<Item> GOLD_SWORD = ITEMS.register("gold_sword_alt", () -> new SwordItem(Tiers.GOLD, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.GOLD, 3, -2.4f))));
    public static final DeferredItem<Item> GOLD_PICKAXE = ITEMS.register("gold_pickaxe_alt", () -> new PickaxeItem(Tiers.GOLD, new Item.Properties().attributes(PickaxeItem.createAttributes(Tiers.GOLD, 1, -2.8f))));
    public static final DeferredItem<Item> GOLD_AXE = ITEMS.register("gold_axe_alt", () -> new AxeItem(Tiers.GOLD, new Item.Properties().attributes(AxeItem.createAttributes(Tiers.GOLD, 6, -3.2f))));
    public static final DeferredItem<Item> GOLD_SHOVEL = ITEMS.register("gold_shovel_alt", () -> new ShovelItem(Tiers.GOLD, new Item.Properties().attributes(ShovelItem.createAttributes(Tiers.GOLD, 1.5f, -3.0f))));
    public static final DeferredItem<Item> GOLD_HOE = ITEMS.register("gold_hoe_alt", () -> new HoeItem(Tiers.GOLD, new Item.Properties().attributes(HoeItem.createAttributes(Tiers.GOLD, 0, -3.0f))));
    public static final DeferredItem<Item> GOLD_HELMET = ITEMS.register("gold_helmet_alt", () -> new ArmorItem(ArmorMaterials.GOLD, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(7))));
    public static final DeferredItem<Item> GOLD_CHESTPLATE = ITEMS.register("gold_chestplate_alt", () -> new ArmorItem(ArmorMaterials.GOLD, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(7))));
    public static final DeferredItem<Item> GOLD_LEGGINGS = ITEMS.register("gold_leggings_alt", () -> new ArmorItem(ArmorMaterials.GOLD, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(7))));
    public static final DeferredItem<Item> GOLD_BOOTS = ITEMS.register("gold_boots_alt", () -> new ArmorItem(ArmorMaterials.GOLD, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(7))));

    public static final DeferredItem<Item> DIAMOND_SWORD = ITEMS.register("diamond_sword_alt", () -> new SwordItem(Tiers.DIAMOND, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.DIAMOND, 3, -2.4f))));
    public static final DeferredItem<Item> DIAMOND_PICKAXE = ITEMS.register("diamond_pickaxe_alt", () -> new PickaxeItem(Tiers.DIAMOND, new Item.Properties().attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 1, -2.8f))));
    public static final DeferredItem<Item> DIAMOND_AXE = ITEMS.register("diamond_axe_alt", () -> new AxeItem(Tiers.DIAMOND, new Item.Properties().attributes(AxeItem.createAttributes(Tiers.DIAMOND, 6, -3.2f))));
    public static final DeferredItem<Item> DIAMOND_SHOVEL = ITEMS.register("diamond_shovel_alt", () -> new ShovelItem(Tiers.DIAMOND, new Item.Properties().attributes(ShovelItem.createAttributes(Tiers.DIAMOND, 1.5f, -3.0f))));
    public static final DeferredItem<Item> DIAMOND_HOE = ITEMS.register("diamond_hoe_alt", () -> new HoeItem(Tiers.DIAMOND, new Item.Properties().attributes(HoeItem.createAttributes(Tiers.DIAMOND, 0, -3.0f))));
    public static final DeferredItem<Item> DIAMOND_HELMET = ITEMS.register("diamond_helmet_alt", () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(33))));
    public static final DeferredItem<Item> DIAMOND_CHESTPLATE = ITEMS.register("diamond_chestplate_alt", () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(33))));
    public static final DeferredItem<Item> DIAMOND_LEGGINGS = ITEMS.register("diamond_leggings_alt", () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(33))));
    public static final DeferredItem<Item> DIAMOND_BOOTS = ITEMS.register("diamond_boots_alt", () -> new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(33))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

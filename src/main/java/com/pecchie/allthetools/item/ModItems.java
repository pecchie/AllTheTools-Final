package com.pecchie.allthetools.item;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.item.armor.*;
import com.pecchie.allthetools.item.tool.CustomEchoToolItem;
import com.pecchie.allthetools.item.tool.CustomLeatherToolItem;
import com.pecchie.allthetools.item.tool.CustomSpearItem;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AllTheTools.MODID);

    // MATERIALI
    public static final DeferredItem<Item> CARBON_FIBER_INGOT = ITEMS.register("carbon_fiber_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECHO_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("echo_armor_trim_smithing_template", () -> new Item(new Item.Properties()));

    // OAK
    public static final DeferredItem<Item> OAK_WOOD_SWORD = registerSword("oak_wood_sword", ModToolTiers.OAK);
    public static final DeferredItem<Item> OAK_WOOD_PICKAXE = registerPickaxe("oak_wood_pickaxe", ModToolTiers.OAK);
    public static final DeferredItem<Item> OAK_WOOD_AXE = registerAxe("oak_wood_axe", ModToolTiers.OAK);
    public static final DeferredItem<Item> OAK_WOOD_SHOVEL = registerShovel("oak_wood_shovel", ModToolTiers.OAK);
    public static final DeferredItem<Item> OAK_WOOD_HOE = registerHoe("oak_wood_hoe", ModToolTiers.OAK);
    public static final DeferredItem<Item> OAK_WOOD_HELMET = registerArmor("oak_wood_helmet", ModArmorMaterials.OAK, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> OAK_WOOD_CHESTPLATE = registerArmor("oak_wood_chestplate", ModArmorMaterials.OAK, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> OAK_WOOD_LEGGINGS = registerArmor("oak_wood_leggings", ModArmorMaterials.OAK, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> OAK_WOOD_BOOTS = registerArmor("oak_wood_boots", ModArmorMaterials.OAK, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> OAK_WOOD_SHIELD = ITEMS.register("oak_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> OAK_WOOD_SPEAR = registerSpear("oak_wood_spear", ModToolTiers.OAK);

    // Altri legni registrati allo stesso modo...
    public static final DeferredItem<Item> SPRUCE_WOOD_SWORD = registerSword("spruce_wood_sword", ModToolTiers.SPRUCE);
    public static final DeferredItem<Item> SPRUCE_WOOD_PICKAXE = registerPickaxe("spruce_wood_pickaxe", ModToolTiers.SPRUCE);
    public static final DeferredItem<Item> SPRUCE_WOOD_AXE = registerAxe("spruce_wood_axe", ModToolTiers.SPRUCE);
    public static final DeferredItem<Item> SPRUCE_WOOD_SHOVEL = registerShovel("spruce_wood_shovel", ModToolTiers.SPRUCE);
    public static final DeferredItem<Item> SPRUCE_WOOD_HOE = registerHoe("spruce_wood_hoe", ModToolTiers.SPRUCE);
    public static final DeferredItem<Item> SPRUCE_WOOD_HELMET = registerArmor("spruce_wood_helmet", ModArmorMaterials.SPRUCE, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> SPRUCE_WOOD_CHESTPLATE = registerArmor("spruce_wood_chestplate", ModArmorMaterials.SPRUCE, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> SPRUCE_WOOD_LEGGINGS = registerArmor("spruce_wood_leggings", ModArmorMaterials.SPRUCE, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> SPRUCE_WOOD_BOOTS = registerArmor("spruce_wood_boots", ModArmorMaterials.SPRUCE, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> SPRUCE_WOOD_SHIELD = ITEMS.register("spruce_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> SPRUCE_WOOD_SPEAR = registerSpear("spruce_wood_spear", ModToolTiers.SPRUCE);

    public static final DeferredItem<Item> BIRCH_WOOD_SWORD = registerSword("birch_wood_sword", ModToolTiers.BIRCH);
    public static final DeferredItem<Item> BIRCH_WOOD_PICKAXE = registerPickaxe("birch_wood_pickaxe", ModToolTiers.BIRCH);
    public static final DeferredItem<Item> BIRCH_WOOD_AXE = registerAxe("birch_wood_axe", ModToolTiers.BIRCH);
    public static final DeferredItem<Item> BIRCH_WOOD_SHOVEL = registerShovel("birch_wood_shovel", ModToolTiers.BIRCH);
    public static final DeferredItem<Item> BIRCH_WOOD_HOE = registerHoe("birch_wood_hoe", ModToolTiers.BIRCH);
    public static final DeferredItem<Item> BIRCH_WOOD_HELMET = registerArmor("birch_wood_helmet", ModArmorMaterials.BIRCH, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> BIRCH_WOOD_CHESTPLATE = registerArmor("birch_wood_chestplate", ModArmorMaterials.BIRCH, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> BIRCH_WOOD_LEGGINGS = registerArmor("birch_wood_leggings", ModArmorMaterials.BIRCH, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> BIRCH_WOOD_BOOTS = registerArmor("birch_wood_boots", ModArmorMaterials.BIRCH, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> BIRCH_WOOD_SHIELD = ITEMS.register("birch_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> BIRCH_WOOD_SPEAR = registerSpear("birch_wood_spear", ModToolTiers.BIRCH);

    public static final DeferredItem<Item> JUNGLE_WOOD_SWORD = registerSword("jungle_wood_sword", ModToolTiers.JUNGLE);
    public static final DeferredItem<Item> JUNGLE_WOOD_PICKAXE = registerPickaxe("jungle_wood_pickaxe", ModToolTiers.JUNGLE);
    public static final DeferredItem<Item> JUNGLE_WOOD_AXE = registerAxe("jungle_wood_axe", ModToolTiers.JUNGLE);
    public static final DeferredItem<Item> JUNGLE_WOOD_SHOVEL = registerShovel("jungle_wood_shovel", ModToolTiers.JUNGLE);
    public static final DeferredItem<Item> JUNGLE_WOOD_HOE = registerHoe("jungle_wood_hoe", ModToolTiers.JUNGLE);
    public static final DeferredItem<Item> JUNGLE_WOOD_HELMET = registerArmor("jungle_wood_helmet", ModArmorMaterials.JUNGLE, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> JUNGLE_WOOD_CHESTPLATE = registerArmor("jungle_wood_chestplate", ModArmorMaterials.JUNGLE, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> JUNGLE_WOOD_LEGGINGS = registerArmor("jungle_wood_leggings", ModArmorMaterials.JUNGLE, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> JUNGLE_WOOD_BOOTS = registerArmor("jungle_wood_boots", ModArmorMaterials.JUNGLE, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> JUNGLE_WOOD_SHIELD = ITEMS.register("jungle_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> JUNGLE_WOOD_SPEAR = registerSpear("jungle_wood_spear", ModToolTiers.JUNGLE);

    public static final DeferredItem<Item> ACACIA_WOOD_SWORD = registerSword("acacia_wood_sword", ModToolTiers.ACACIA);
    public static final DeferredItem<Item> ACACIA_WOOD_PICKAXE = registerPickaxe("acacia_wood_pickaxe", ModToolTiers.ACACIA);
    public static final DeferredItem<Item> ACACIA_WOOD_AXE = registerAxe("acacia_wood_axe", ModToolTiers.ACACIA);
    public static final DeferredItem<Item> ACACIA_WOOD_SHOVEL = registerShovel("acacia_wood_shovel", ModToolTiers.ACACIA);
    public static final DeferredItem<Item> ACACIA_WOOD_HOE = registerHoe("acacia_wood_hoe", ModToolTiers.ACACIA);
    public static final DeferredItem<Item> ACACIA_WOOD_HELMET = registerArmor("acacia_wood_helmet", ModArmorMaterials.ACACIA, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> ACACIA_WOOD_CHESTPLATE = registerArmor("acacia_wood_chestplate", ModArmorMaterials.ACACIA, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> ACACIA_WOOD_LEGGINGS = registerArmor("acacia_wood_leggings", ModArmorMaterials.ACACIA, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> ACACIA_WOOD_BOOTS = registerArmor("acacia_wood_boots", ModArmorMaterials.ACACIA, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> ACACIA_WOOD_SHIELD = ITEMS.register("acacia_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> ACACIA_WOOD_SPEAR = registerSpear("acacia_wood_spear", ModToolTiers.ACACIA);

    public static final DeferredItem<Item> DARK_OAK_WOOD_SWORD = registerSword("dark_oak_wood_sword", ModToolTiers.DARK_OAK);
    public static final DeferredItem<Item> DARK_OAK_WOOD_PICKAXE = registerPickaxe("dark_oak_wood_pickaxe", ModToolTiers.DARK_OAK);
    public static final DeferredItem<Item> DARK_OAK_WOOD_AXE = registerAxe("dark_oak_wood_axe", ModToolTiers.DARK_OAK);
    public static final DeferredItem<Item> DARK_OAK_WOOD_SHOVEL = registerShovel("dark_oak_wood_shovel", ModToolTiers.DARK_OAK);
    public static final DeferredItem<Item> DARK_OAK_WOOD_HOE = registerHoe("dark_oak_wood_hoe", ModToolTiers.DARK_OAK);
    public static final DeferredItem<Item> DARK_OAK_WOOD_HELMET = registerArmor("dark_oak_wood_helmet", ModArmorMaterials.DARK_OAK, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> DARK_OAK_WOOD_CHESTPLATE = registerArmor("dark_oak_wood_chestplate", ModArmorMaterials.DARK_OAK, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> DARK_OAK_WOOD_LEGGINGS = registerArmor("dark_oak_wood_leggings", ModArmorMaterials.DARK_OAK, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> DARK_OAK_WOOD_BOOTS = registerArmor("dark_oak_wood_boots", ModArmorMaterials.DARK_OAK, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> DARK_OAK_WOOD_SHIELD = ITEMS.register("dark_oak_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> DARK_OAK_WOOD_SPEAR = registerSpear("dark_oak_wood_spear", ModToolTiers.DARK_OAK);

    public static final DeferredItem<Item> MANGROVE_WOOD_SWORD = registerSword("mangrove_wood_sword", ModToolTiers.MANGROVE);
    public static final DeferredItem<Item> MANGROVE_WOOD_PICKAXE = registerPickaxe("mangrove_wood_pickaxe", ModToolTiers.MANGROVE);
    public static final DeferredItem<Item> MANGROVE_WOOD_AXE = registerAxe("mangrove_wood_axe", ModToolTiers.MANGROVE);
    public static final DeferredItem<Item> MANGROVE_WOOD_SHOVEL = registerShovel("mangrove_wood_shovel", ModToolTiers.MANGROVE);
    public static final DeferredItem<Item> MANGROVE_WOOD_HOE = registerHoe("mangrove_wood_hoe", ModToolTiers.MANGROVE);
    public static final DeferredItem<Item> MANGROVE_WOOD_HELMET = registerArmor("mangrove_wood_helmet", ModArmorMaterials.MANGROVE, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> MANGROVE_WOOD_CHESTPLATE = registerArmor("mangrove_wood_chestplate", ModArmorMaterials.MANGROVE, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> MANGROVE_WOOD_LEGGINGS = registerArmor("mangrove_wood_leggings", ModArmorMaterials.MANGROVE, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> MANGROVE_WOOD_BOOTS = registerArmor("mangrove_wood_boots", ModArmorMaterials.MANGROVE, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> MANGROVE_WOOD_SHIELD = ITEMS.register("mangrove_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> MANGROVE_WOOD_SPEAR = registerSpear("mangrove_wood_spear", ModToolTiers.MANGROVE);

    public static final DeferredItem<Item> CHERRY_WOOD_SWORD = registerSword("cherry_wood_sword", ModToolTiers.CHERRY);
    public static final DeferredItem<Item> CHERRY_WOOD_PICKAXE = registerPickaxe("cherry_wood_pickaxe", ModToolTiers.CHERRY);
    public static final DeferredItem<Item> CHERRY_WOOD_AXE = registerAxe("cherry_wood_axe", ModToolTiers.CHERRY);
    public static final DeferredItem<Item> CHERRY_WOOD_SHOVEL = registerShovel("cherry_wood_shovel", ModToolTiers.CHERRY);
    public static final DeferredItem<Item> CHERRY_WOOD_HOE = registerHoe("cherry_wood_hoe", ModToolTiers.CHERRY);
    public static final DeferredItem<Item> CHERRY_WOOD_HELMET = registerArmor("cherry_wood_helmet", ModArmorMaterials.CHERRY, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> CHERRY_WOOD_CHESTPLATE = registerArmor("cherry_wood_chestplate", ModArmorMaterials.CHERRY, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> CHERRY_WOOD_LEGGINGS = registerArmor("cherry_wood_leggings", ModArmorMaterials.CHERRY, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> CHERRY_WOOD_BOOTS = registerArmor("cherry_wood_boots", ModArmorMaterials.CHERRY, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> CHERRY_WOOD_SHIELD = ITEMS.register("cherry_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> CHERRY_WOOD_SPEAR = registerSpear("cherry_wood_spear", ModToolTiers.CHERRY);

    public static final DeferredItem<Item> BAMBOO_WOOD_SWORD = registerSword("bamboo_wood_sword", ModToolTiers.BAMBOO);
    public static final DeferredItem<Item> BAMBOO_WOOD_PICKAXE = registerPickaxe("bamboo_wood_pickaxe", ModToolTiers.BAMBOO);
    public static final DeferredItem<Item> BAMBOO_WOOD_AXE = registerAxe("bamboo_wood_axe", ModToolTiers.BAMBOO);
    public static final DeferredItem<Item> BAMBOO_WOOD_SHOVEL = registerShovel("bamboo_wood_shovel", ModToolTiers.BAMBOO);
    public static final DeferredItem<Item> BAMBOO_WOOD_HOE = registerHoe("bamboo_wood_hoe", ModToolTiers.BAMBOO);
    public static final DeferredItem<Item> BAMBOO_WOOD_HELMET = registerArmor("bamboo_wood_helmet", ModArmorMaterials.BAMBOO, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> BAMBOO_WOOD_CHESTPLATE = registerArmor("bamboo_wood_chestplate", ModArmorMaterials.BAMBOO, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> BAMBOO_WOOD_LEGGINGS = registerArmor("bamboo_wood_leggings", ModArmorMaterials.BAMBOO, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> BAMBOO_WOOD_BOOTS = registerArmor("bamboo_wood_boots", ModArmorMaterials.BAMBOO, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> BAMBOO_WOOD_SHIELD = ITEMS.register("bamboo_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> BAMBOO_WOOD_SPEAR = registerSpear("bamboo_wood_spear", ModToolTiers.BAMBOO);

    public static final DeferredItem<Item> CRIMSON_WOOD_SWORD = registerSword("crimson_wood_sword", ModToolTiers.CRIMSON);
    public static final DeferredItem<Item> CRIMSON_WOOD_PICKAXE = registerPickaxe("crimson_wood_pickaxe", ModToolTiers.CRIMSON);
    public static final DeferredItem<Item> CRIMSON_WOOD_AXE = registerAxe("crimson_wood_axe", ModToolTiers.CRIMSON);
    public static final DeferredItem<Item> CRIMSON_WOOD_SHOVEL = registerShovel("crimson_wood_shovel", ModToolTiers.CRIMSON);
    public static final DeferredItem<Item> CRIMSON_WOOD_HOE = registerHoe("crimson_wood_hoe", ModToolTiers.CRIMSON);
    public static final DeferredItem<Item> CRIMSON_WOOD_HELMET = registerArmor("crimson_wood_helmet", ModArmorMaterials.CRIMSON, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> CRIMSON_WOOD_CHESTPLATE = registerArmor("crimson_wood_chestplate", ModArmorMaterials.CRIMSON, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> CRIMSON_WOOD_LEGGINGS = registerArmor("crimson_wood_leggings", ModArmorMaterials.CRIMSON, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> CRIMSON_WOOD_BOOTS = registerArmor("crimson_wood_boots", ModArmorMaterials.CRIMSON, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> CRIMSON_WOOD_SHIELD = ITEMS.register("crimson_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> CRIMSON_WOOD_SPEAR = registerSpear("crimson_wood_spear", ModToolTiers.CRIMSON);

    public static final DeferredItem<Item> WARPED_WOOD_SWORD = registerSword("warped_wood_sword", ModToolTiers.WARPED);
    public static final DeferredItem<Item> WARPED_WOOD_PICKAXE = registerPickaxe("warped_wood_pickaxe", ModToolTiers.WARPED);
    public static final DeferredItem<Item> WARPED_WOOD_AXE = registerAxe("warped_wood_axe", ModToolTiers.WARPED);
    public static final DeferredItem<Item> WARPED_WOOD_SHOVEL = registerShovel("warped_wood_shovel", ModToolTiers.WARPED);
    public static final DeferredItem<Item> WARPED_WOOD_HOE = registerHoe("warped_wood_hoe", ModToolTiers.WARPED);
    public static final DeferredItem<Item> WARPED_WOOD_HELMET = registerArmor("warped_wood_helmet", ModArmorMaterials.WARPED, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> WARPED_WOOD_CHESTPLATE = registerArmor("warped_wood_chestplate", ModArmorMaterials.WARPED, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> WARPED_WOOD_LEGGINGS = registerArmor("warped_wood_leggings", ModArmorMaterials.WARPED, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> WARPED_WOOD_BOOTS = registerArmor("warped_wood_boots", ModArmorMaterials.WARPED, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> WARPED_WOOD_SHIELD = ITEMS.register("warped_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> WARPED_WOOD_SPEAR = registerSpear("warped_wood_spear", ModToolTiers.WARPED);

    // FLINT
    public static final DeferredItem<Item> FLINT_SWORD = registerSword("flint_sword", ModToolTiers.FLINT);
    public static final DeferredItem<Item> FLINT_PICKAXE = registerPickaxe("flint_pickaxe", ModToolTiers.FLINT);
    public static final DeferredItem<Item> FLINT_AXE = registerAxe("flint_axe", ModToolTiers.FLINT);
    public static final DeferredItem<Item> FLINT_SHOVEL = registerShovel("flint_shovel", ModToolTiers.FLINT);
    public static final DeferredItem<Item> FLINT_HOE = registerHoe("flint_hoe", ModToolTiers.FLINT);
    public static final DeferredItem<Item> FLINT_HELMET = ITEMS.register("flint_helmet", () -> new CustomFlintArmorItem(ModArmorMaterials.FLINT, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(8))));
    public static final DeferredItem<Item> FLINT_CHESTPLATE = ITEMS.register("flint_chestplate", () -> new CustomFlintArmorItem(ModArmorMaterials.FLINT, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(8))));
    public static final DeferredItem<Item> FLINT_LEGGINGS = ITEMS.register("flint_leggings", () -> new CustomFlintArmorItem(ModArmorMaterials.FLINT, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(8))));
    public static final DeferredItem<Item> FLINT_BOOTS = ITEMS.register("flint_boots", () -> new CustomFlintArmorItem(ModArmorMaterials.FLINT, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(8))));
    public static final DeferredItem<Item> FLINT_SPEAR = registerSpear("flint_spear", ModToolTiers.FLINT);

    // STONE
    public static final DeferredItem<Item> STONE_SWORD = registerSword("stone_sword", ModToolTiers.STONE);
    public static final DeferredItem<Item> STONE_PICKAXE = registerPickaxe("stone_pickaxe", ModToolTiers.STONE);
    public static final DeferredItem<Item> STONE_AXE = registerAxe("stone_axe", ModToolTiers.STONE);
    public static final DeferredItem<Item> STONE_SHOVEL = registerShovel("stone_shovel", ModToolTiers.STONE);
    public static final DeferredItem<Item> STONE_HOE = registerHoe("stone_hoe", ModToolTiers.STONE);
    public static final DeferredItem<Item> STONE_HELMET = registerArmor("stone_helmet", ModArmorMaterials.STONE, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> STONE_CHESTPLATE = registerArmor("stone_chestplate", ModArmorMaterials.STONE, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> STONE_LEGGINGS = registerArmor("stone_leggings", ModArmorMaterials.STONE, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> STONE_BOOTS = registerArmor("stone_boots", ModArmorMaterials.STONE, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> STONE_SPEAR = registerSpear("stone_spear", ModToolTiers.STONE);

    // LEATHER
    public static final DeferredItem<Item> LEATHER_SWORD = ITEMS.register("leather_sword", () -> new CustomLeatherToolItem(ModToolTiers.LEATHER, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.LEATHER, 3, -2.4f))));
    public static final DeferredItem<Item> LEATHER_PICKAXE = ITEMS.register("leather_pickaxe", () -> new CustomLeatherToolItem(ModToolTiers.LEATHER, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.LEATHER, 1, -2.8f))));
    public static final DeferredItem<Item> LEATHER_AXE = ITEMS.register("leather_axe", () -> new CustomLeatherToolItem(ModToolTiers.LEATHER, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.LEATHER, 6, -3.2f))));
    public static final DeferredItem<Item> LEATHER_SHOVEL = ITEMS.register("leather_shovel", () -> new CustomLeatherToolItem(ModToolTiers.LEATHER, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.LEATHER, 1.5f, -3.0f))));
    public static final DeferredItem<Item> LEATHER_HOE = ITEMS.register("leather_hoe", () -> new CustomLeatherToolItem(ModToolTiers.LEATHER, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.LEATHER, 0, -3.0f))));
    public static final DeferredItem<Item> LEATHER_HELMET = registerArmor("leather_helmet", ModArmorMaterials.LEATHER, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> LEATHER_CHESTPLATE = registerArmor("leather_chestplate", ModArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> LEATHER_LEGGINGS = registerArmor("leather_leggings", ModArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> LEATHER_BOOTS = registerArmor("leather_boots", ModArmorMaterials.LEATHER, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> LEATHER_SPEAR = registerSpear("leather_spear", ModToolTiers.LEATHER);

    // CHAIN
    public static final DeferredItem<Item> CHAIN_SWORD = registerSword("chain_sword", ModToolTiers.CHAIN);
    public static final DeferredItem<Item> CHAIN_PICKAXE = registerPickaxe("chain_pickaxe", ModToolTiers.CHAIN);
    public static final DeferredItem<Item> CHAIN_AXE = registerAxe("chain_axe", ModToolTiers.CHAIN);
    public static final DeferredItem<Item> CHAIN_SHOVEL = registerShovel("chain_shovel", ModToolTiers.CHAIN);
    public static final DeferredItem<Item> CHAIN_HOE = registerHoe("chain_hoe", ModToolTiers.CHAIN);
    public static final DeferredItem<Item> CHAIN_HELMET = registerArmor("chain_helmet", ModArmorMaterials.CHAIN, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> CHAIN_CHESTPLATE = registerArmor("chain_chestplate", ModArmorMaterials.CHAIN, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> CHAIN_LEGGINGS = registerArmor("chain_leggings", ModArmorMaterials.CHAIN, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> CHAIN_BOOTS = registerArmor("chain_boots", ModArmorMaterials.CHAIN, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> CHAIN_SPEAR = registerSpear("chain_spear", ModToolTiers.CHAIN);

    // COPPER
    public static final DeferredItem<Item> COPPER_SWORD = registerSword("copper_sword", ModToolTiers.COPPER);
    public static final DeferredItem<Item> COPPER_PICKAXE = registerPickaxe("copper_pickaxe", ModToolTiers.COPPER);
    public static final DeferredItem<Item> COPPER_AXE = registerAxe("copper_axe", ModToolTiers.COPPER);
    public static final DeferredItem<Item> COPPER_SHOVEL = registerShovel("copper_shovel", ModToolTiers.COPPER);
    public static final DeferredItem<Item> COPPER_HOE = registerHoe("copper_hoe", ModToolTiers.COPPER);
    public static final DeferredItem<Item> COPPER_HELMET = registerArmor("copper_helmet", ModArmorMaterials.COPPER, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> COPPER_CHESTPLATE = registerArmor("copper_chestplate", ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> COPPER_LEGGINGS = registerArmor("copper_leggings", ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> COPPER_BOOTS = registerArmor("copper_boots", ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> COPPER_SPEAR = registerSpear("copper_spear", ModToolTiers.COPPER);

    // DEEPSLATE
    public static final DeferredItem<Item> DEEPSLATE_SWORD = registerSword("deepslate_sword", ModToolTiers.DEEPSLATE);
    public static final DeferredItem<Item> DEEPSLATE_PICKAXE = registerPickaxe("deepslate_pickaxe", ModToolTiers.DEEPSLATE);
    public static final DeferredItem<Item> DEEPSLATE_AXE = registerAxe("deepslate_axe", ModToolTiers.DEEPSLATE);
    public static final DeferredItem<Item> DEEPSLATE_SHOVEL = registerShovel("deepslate_shovel", ModToolTiers.DEEPSLATE);
    public static final DeferredItem<Item> DEEPSLATE_HOE = registerHoe("deepslate_hoe", ModToolTiers.DEEPSLATE);
    public static final DeferredItem<Item> DEEPSLATE_HELMET = registerArmor("deepslate_helmet", ModArmorMaterials.DEEPSLATE, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> DEEPSLATE_CHESTPLATE = registerArmor("deepslate_chestplate", ModArmorMaterials.DEEPSLATE, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> DEEPSLATE_LEGGINGS = registerArmor("deepslate_leggings", ModArmorMaterials.DEEPSLATE, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> DEEPSLATE_BOOTS = registerArmor("deepslate_boots", ModArmorMaterials.DEEPSLATE, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> DEEPSLATE_SPEAR = registerSpear("deepslate_spear", ModToolTiers.DEEPSLATE);

    // OBSIDIAN
    public static final DeferredItem<Item> OBSIDIAN_SWORD = registerSword("obsidian_sword", ModToolTiers.OBSIDIAN);
    public static final DeferredItem<Item> OBSIDIAN_PICKAXE = registerPickaxe("obsidian_pickaxe", ModToolTiers.OBSIDIAN);
    public static final DeferredItem<Item> OBSIDIAN_AXE = registerAxe("obsidian_axe", ModToolTiers.OBSIDIAN);
    public static final DeferredItem<Item> OBSIDIAN_SHOVEL = registerShovel("obsidian_shovel", ModToolTiers.OBSIDIAN);
    public static final DeferredItem<Item> OBSIDIAN_HOE = registerHoe("obsidian_hoe", ModToolTiers.OBSIDIAN);
    public static final DeferredItem<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new CustomObsidianArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(40))));
    public static final DeferredItem<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", () -> new CustomObsidianArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(40))));
    public static final DeferredItem<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", () -> new CustomObsidianArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(40))));
    public static final DeferredItem<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", () -> new CustomObsidianArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(40))));
    public static final DeferredItem<Item> OBSIDIAN_SPEAR = registerSpear("obsidian_spear", ModToolTiers.OBSIDIAN);

    // REDSTONE
    public static final DeferredItem<Item> REDSTONE_SWORD = registerSword("redstone_sword", ModToolTiers.REDSTONE);
    public static final DeferredItem<Item> REDSTONE_PICKAXE = registerPickaxe("redstone_pickaxe", ModToolTiers.REDSTONE);
    public static final DeferredItem<Item> REDSTONE_AXE = registerAxe("redstone_axe", ModToolTiers.REDSTONE);
    public static final DeferredItem<Item> REDSTONE_SHOVEL = registerShovel("redstone_shovel", ModToolTiers.REDSTONE);
    public static final DeferredItem<Item> REDSTONE_HOE = registerHoe("redstone_hoe", ModToolTiers.REDSTONE);
    public static final DeferredItem<Item> REDSTONE_HELMET = ITEMS.register("redstone_helmet", () -> new CustomRedstoneArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
    public static final DeferredItem<Item> REDSTONE_CHESTPLATE = ITEMS.register("redstone_chestplate", () -> new CustomRedstoneArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
    public static final DeferredItem<Item> REDSTONE_LEGGINGS = ITEMS.register("redstone_leggings", () -> new CustomRedstoneArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
    public static final DeferredItem<Item> REDSTONE_BOOTS = ITEMS.register("redstone_boots", () -> new CustomRedstoneArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));
    public static final DeferredItem<Item> REDSTONE_SPEAR = registerSpear("redstone_spear", ModToolTiers.REDSTONE);

    // LAPIS
    public static final DeferredItem<Item> LAPIS_SWORD = registerSword("lapis_sword", ModToolTiers.LAPIS);
    public static final DeferredItem<Item> LAPIS_PICKAXE = registerPickaxe("lapis_pickaxe", ModToolTiers.LAPIS);
    public static final DeferredItem<Item> LAPIS_AXE = registerAxe("lapis_axe", ModToolTiers.LAPIS);
    public static final DeferredItem<Item> LAPIS_SHOVEL = registerShovel("lapis_shovel", ModToolTiers.LAPIS);
    public static final DeferredItem<Item> LAPIS_HOE = registerHoe("lapis_hoe", ModToolTiers.LAPIS);
    public static final DeferredItem<Item> LAPIS_HELMET = ITEMS.register("lapis_helmet", () -> new CustomLapisArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(20))));
    public static final DeferredItem<Item> LAPIS_CHESTPLATE = ITEMS.register("lapis_chestplate", () -> new CustomLapisArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(20))));
    public static final DeferredItem<Item> LAPIS_LEGGINGS = ITEMS.register("lapis_leggings", () -> new CustomLapisArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(20))));
    public static final DeferredItem<Item> LAPIS_BOOTS = ITEMS.register("lapis_boots", () -> new CustomLapisArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(20))));
    public static final DeferredItem<Item> LAPIS_SPEAR = registerSpear("lapis_spear", ModToolTiers.LAPIS);

    // QUARTZ
    public static final DeferredItem<Item> QUARTZ_SWORD = registerSword("quartz_sword", ModToolTiers.QUARTZ);
    public static final DeferredItem<Item> QUARTZ_PICKAXE = registerPickaxe("quartz_pickaxe", ModToolTiers.QUARTZ);
    public static final DeferredItem<Item> QUARTZ_AXE = registerAxe("quartz_axe", ModToolTiers.QUARTZ);
    public static final DeferredItem<Item> QUARTZ_SHOVEL = registerShovel("quartz_shovel", ModToolTiers.QUARTZ);
    public static final DeferredItem<Item> QUARTZ_HOE = registerHoe("quartz_hoe", ModToolTiers.QUARTZ);
    public static final DeferredItem<Item> QUARTZ_HELMET = registerArmor("quartz_helmet", ModArmorMaterials.QUARTZ, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> QUARTZ_CHESTPLATE = registerArmor("quartz_chestplate", ModArmorMaterials.QUARTZ, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> QUARTZ_LEGGINGS = registerArmor("quartz_leggings", ModArmorMaterials.QUARTZ, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> QUARTZ_BOOTS = registerArmor("quartz_boots", ModArmorMaterials.QUARTZ, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> QUARTZ_SPEAR = registerSpear("quartz_spear", ModToolTiers.QUARTZ);

    // CARBON FIBER
    public static final DeferredItem<Item> CARBON_FIBER_SWORD = registerSword("carbon_fiber_sword", ModToolTiers.CARBON_FIBER);
    public static final DeferredItem<Item> CARBON_FIBER_PICKAXE = registerPickaxe("carbon_fiber_pickaxe", ModToolTiers.CARBON_FIBER);
    public static final DeferredItem<Item> CARBON_FIBER_AXE = registerAxe("carbon_fiber_axe", ModToolTiers.CARBON_FIBER);
    public static final DeferredItem<Item> CARBON_FIBER_SHOVEL = registerShovel("carbon_fiber_shovel", ModToolTiers.CARBON_FIBER);
    public static final DeferredItem<Item> CARBON_FIBER_HOE = registerHoe("carbon_fiber_hoe", ModToolTiers.CARBON_FIBER);
    public static final DeferredItem<Item> CARBON_FIBER_HELMET = registerArmor("carbon_fiber_helmet", ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> CARBON_FIBER_CHESTPLATE = registerArmor("carbon_fiber_chestplate", ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> CARBON_FIBER_LEGGINGS = registerArmor("carbon_fiber_leggings", ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> CARBON_FIBER_BOOTS = registerArmor("carbon_fiber_boots", ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> CARBON_FIBER_SPEAR = registerSpear("carbon_fiber_spear", ModToolTiers.CARBON_FIBER);

    // AMETHYST
    public static final DeferredItem<Item> AMETHYST_SWORD = registerSword("amethyst_sword", ModToolTiers.AMETHYST);
    public static final DeferredItem<Item> AMETHYST_PICKAXE = registerPickaxe("amethyst_pickaxe", ModToolTiers.AMETHYST);
    public static final DeferredItem<Item> AMETHYST_AXE = registerAxe("amethyst_axe", ModToolTiers.AMETHYST);
    public static final DeferredItem<Item> AMETHYST_SHOVEL = registerShovel("amethyst_shovel", ModToolTiers.AMETHYST);
    public static final DeferredItem<Item> AMETHYST_HOE = registerHoe("amethyst_hoe", ModToolTiers.AMETHYST);
    public static final DeferredItem<Item> AMETHYST_HELMET = registerArmor("amethyst_helmet", ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET);
    public static final DeferredItem<Item> AMETHYST_CHESTPLATE = registerArmor("amethyst_chestplate", ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<Item> AMETHYST_LEGGINGS = registerArmor("amethyst_leggings", ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<Item> AMETHYST_BOOTS = registerArmor("amethyst_boots", ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> AMETHYST_SPEAR = registerSpear("amethyst_spear", ModToolTiers.AMETHYST);

    // EMERALD
    public static final DeferredItem<Item> EMERALD_SWORD = registerSword("emerald_sword", ModToolTiers.EMERALD);
    public static final DeferredItem<Item> EMERALD_PICKAXE = registerPickaxe("emerald_pickaxe", ModToolTiers.EMERALD);
    public static final DeferredItem<Item> EMERALD_AXE = registerAxe("emerald_axe", ModToolTiers.EMERALD);
    public static final DeferredItem<Item> EMERALD_SHOVEL = registerShovel("emerald_shovel", ModToolTiers.EMERALD);
    public static final DeferredItem<Item> EMERALD_HOE = registerHoe("emerald_hoe", ModToolTiers.EMERALD);
    public static final DeferredItem<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new CustomEmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35))));
    public static final DeferredItem<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new CustomEmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));
    public static final DeferredItem<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new CustomEmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35))));
    public static final DeferredItem<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new CustomEmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35))));
    public static final DeferredItem<Item> EMERALD_SPEAR = registerSpear("emerald_spear", ModToolTiers.EMERALD);

    // ECHO
    public static final DeferredItem<Item> ECHO_SWORD = ITEMS.register("echo_sword", () -> new CustomEchoToolItem(ModToolTiers.ECHO, new Item.Properties()));
    public static final DeferredItem<Item> ECHO_PICKAXE = ITEMS.register("echo_pickaxe", () -> new CustomEchoToolItem(ModToolTiers.ECHO, new Item.Properties()));
    public static final DeferredItem<Item> ECHO_AXE = ITEMS.register("echo_axe", () -> new CustomEchoToolItem(ModToolTiers.ECHO, new Item.Properties()));
    public static final DeferredItem<Item> ECHO_SHOVEL = ITEMS.register("echo_shovel", () -> new CustomEchoToolItem(ModToolTiers.ECHO, new Item.Properties()));
    public static final DeferredItem<Item> ECHO_HOE = ITEMS.register("echo_hoe", () -> new CustomEchoToolItem(ModToolTiers.ECHO, new Item.Properties()));
    public static final DeferredItem<Item> ECHO_HELMET = ITEMS.register("echo_helmet", () -> new CustomEchoArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(45))));
    public static final DeferredItem<Item> ECHO_CHESTPLATE = ITEMS.register("echo_chestplate", () -> new CustomEchoArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(45))));
    public static final DeferredItem<Item> ECHO_LEGGINGS = ITEMS.register("echo_leggings", () -> new CustomEchoArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(45))));
    public static final DeferredItem<Item> ECHO_BOOTS = ITEMS.register("echo_boots", () -> new CustomEchoArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(45))));
    public static final DeferredItem<Item> ECHO_SPEAR = registerSpear("echo_spear", ModToolTiers.ECHO);

    // VANILLA SPEARS
    public static final DeferredItem<Item> IRON_SPEAR = registerSpear("iron_spear", Tiers.IRON);
    public static final DeferredItem<Item> GOLD_SPEAR = registerSpear("gold_spear", Tiers.GOLD);
    public static final DeferredItem<Item> DIAMOND_SPEAR = registerSpear("diamond_spear", Tiers.DIAMOND);
    public static final DeferredItem<Item> NETHERITE_SPEAR = registerSpear("netherite_spear", Tiers.NETHERITE);

    // HELPER METHODS
    private static DeferredItem<Item> registerSword(String name, Tier tier) {
        return ITEMS.register(name, () -> new SwordItem(tier, new Item.Properties()));
    }
    private static DeferredItem<Item> registerPickaxe(String name, Tier tier) {
        return ITEMS.register(name, () -> new PickaxeItem(tier, new Item.Properties()));
    }
    private static DeferredItem<Item> registerAxe(String name, Tier tier) {
        return ITEMS.register(name, () -> new AxeItem(tier, new Item.Properties()));
    }
    private static DeferredItem<Item> registerShovel(String name, Tier tier) {
        return ITEMS.register(name, () -> new ShovelItem(tier, new Item.Properties()));
    }
    private static DeferredItem<Item> registerHoe(String name, Tier tier) {
        return ITEMS.register(name, () -> new HoeItem(tier, new Item.Properties()));
    }
    private static DeferredItem<Item> registerArmor(String name, net.minecraft.core.Holder<ArmorMaterial> material, ArmorItem.Type type) {
        return ITEMS.register(name, () -> new ArmorItem(material, type, new Item.Properties().durability(type.getDurability(15))));
    }
    private static DeferredItem<Item> registerSpear(String name, Tier tier) {
        return ITEMS.register(name, () -> new CustomSpearItem(tier, new Item.Properties()));
    }
}

package com.pecchie.allthetools.item;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.item.armor.*;
import com.pecchie.allthetools.item.tool.CustomEchoToolItem;
import com.pecchie.allthetools.item.tool.CustomLeatherToolItem;
import com.pecchie.allthetools.item.tool.CustomSpearItem;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AllTheTools.MODID);

    private static DeferredItem<Item> registerTool(String name, Tier tier, float damage, float speed, String type) {
        return ITEMS.register(name, () -> {
            return switch (type) {
                case "sword" -> new SwordItem(tier, new Item.Properties().attributes(SwordItem.createAttributes(tier, (int)damage, speed)));
                case "pickaxe" -> new PickaxeItem(tier, new Item.Properties().attributes(PickaxeItem.createAttributes(tier, damage, speed)));
                case "axe" -> new AxeItem(tier, new Item.Properties().attributes(AxeItem.createAttributes(tier, damage, speed)));
                case "shovel" -> new ShovelItem(tier, new Item.Properties().attributes(ShovelItem.createAttributes(tier, damage, speed)));
                case "hoe" -> new HoeItem(tier, new Item.Properties().attributes(HoeItem.createAttributes(tier, (int)damage, speed)));
                default -> new Item(new Item.Properties());
            };
        });
    }

    private static DeferredItem<ArmorItem> registerArmor(String name, net.minecraft.core.Holder<ArmorMaterial> material, ArmorItem.Type type) {
        return ITEMS.register(name + "_" + type.getName(), () -> {
            if (name.contains("redstone")) return new CustomRedstoneArmorItem(material, type, new Item.Properties());
            if (name.contains("lapis")) return new CustomLapisArmorItem(material, type, new Item.Properties());
            if (name.contains("emerald")) return new CustomEmeraldArmorItem(material, type, new Item.Properties());
            if (name.contains("obsidian")) return new CustomObsidianArmorItem(material, type, new Item.Properties());
            if (name.contains("echo")) return new CustomEchoArmorItem(material, type, new Item.Properties());
            if (name.contains("flint")) return new CustomFlintArmorItem(material, type, new Item.Properties());
            return new ArmorItem(material, type, new Item.Properties());
        });
    }

    // === OAK ===
    public static final DeferredItem<Item> OAK_WOOD_SWORD = registerTool("oak_wood_sword", ModToolTiers.WOOD, 3, -2.4F, "sword");
    public static final DeferredItem<Item> OAK_WOOD_PICKAXE = registerTool("oak_wood_pickaxe", ModToolTiers.WOOD, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> OAK_WOOD_AXE = registerTool("oak_wood_axe", ModToolTiers.WOOD, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> OAK_WOOD_SHOVEL = registerTool("oak_wood_shovel", ModToolTiers.WOOD, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> OAK_WOOD_HOE = registerTool("oak_wood_hoe", ModToolTiers.WOOD, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> OAK_WOOD_HELMET = registerArmor("oak_wood", ModArmorMaterials.WOOD, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> OAK_WOOD_CHESTPLATE = registerArmor("oak_wood", ModArmorMaterials.WOOD, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> OAK_WOOD_LEGGINGS = registerArmor("oak_wood", ModArmorMaterials.WOOD, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> OAK_WOOD_BOOTS = registerArmor("oak_wood", ModArmorMaterials.WOOD, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> OAK_WOOD_SHIELD = ITEMS.register("oak_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> OAK_WOOD_SPEAR = ITEMS.register("oak_wood_spear", () -> new CustomSpearItem(ModToolTiers.WOOD, new Item.Properties()));

    // === SPRUCE ===
    public static final DeferredItem<Item> SPRUCE_WOOD_SWORD = registerTool("spruce_wood_sword", ModToolTiers.WOOD, 3, -2.4F, "sword");
    public static final DeferredItem<Item> SPRUCE_WOOD_PICKAXE = registerTool("spruce_wood_pickaxe", ModToolTiers.WOOD, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> SPRUCE_WOOD_AXE = registerTool("spruce_wood_axe", ModToolTiers.WOOD, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> SPRUCE_WOOD_SHOVEL = registerTool("spruce_wood_shovel", ModToolTiers.WOOD, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> SPRUCE_WOOD_HOE = registerTool("spruce_wood_hoe", ModToolTiers.WOOD, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> SPRUCE_WOOD_HELMET = registerArmor("spruce_wood", ModArmorMaterials.WOOD, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> SPRUCE_WOOD_CHESTPLATE = registerArmor("spruce_wood", ModArmorMaterials.WOOD, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> SPRUCE_WOOD_LEGGINGS = registerArmor("spruce_wood", ModArmorMaterials.WOOD, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> SPRUCE_WOOD_BOOTS = registerArmor("spruce_wood", ModArmorMaterials.WOOD, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> SPRUCE_WOOD_SHIELD = ITEMS.register("spruce_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> SPRUCE_WOOD_SPEAR = ITEMS.register("spruce_wood_spear", () -> new CustomSpearItem(ModToolTiers.WOOD, new Item.Properties()));

    // === BIRCH ===
    public static final DeferredItem<Item> BIRCH_WOOD_SWORD = registerTool("birch_wood_sword", ModToolTiers.WOOD, 3, -2.4F, "sword");
    public static final DeferredItem<Item> BIRCH_WOOD_PICKAXE = registerTool("birch_wood_pickaxe", ModToolTiers.WOOD, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> BIRCH_WOOD_AXE = registerTool("birch_wood_axe", ModToolTiers.WOOD, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> BIRCH_WOOD_SHOVEL = registerTool("birch_wood_shovel", ModToolTiers.WOOD, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> BIRCH_WOOD_HOE = registerTool("birch_wood_hoe", ModToolTiers.WOOD, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> BIRCH_WOOD_HELMET = registerArmor("birch_wood", ModArmorMaterials.WOOD, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> BIRCH_WOOD_CHESTPLATE = registerArmor("birch_wood", ModArmorMaterials.WOOD, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> BIRCH_WOOD_LEGGINGS = registerArmor("birch_wood", ModArmorMaterials.WOOD, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> BIRCH_WOOD_BOOTS = registerArmor("birch_wood", ModArmorMaterials.WOOD, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> BIRCH_WOOD_SHIELD = ITEMS.register("birch_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> BIRCH_WOOD_SPEAR = ITEMS.register("birch_wood_spear", () -> new CustomSpearItem(ModToolTiers.WOOD, new Item.Properties()));

    // === JUNGLE ===
    public static final DeferredItem<Item> JUNGLE_WOOD_SWORD = registerTool("jungle_wood_sword", ModToolTiers.WOOD, 3, -2.4F, "sword");
    public static final DeferredItem<Item> JUNGLE_WOOD_PICKAXE = registerTool("jungle_wood_pickaxe", ModToolTiers.WOOD, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> JUNGLE_WOOD_AXE = registerTool("jungle_wood_axe", ModToolTiers.WOOD, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> JUNGLE_WOOD_SHOVEL = registerTool("jungle_wood_shovel", ModToolTiers.WOOD, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> JUNGLE_WOOD_HOE = registerTool("jungle_wood_hoe", ModToolTiers.WOOD, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> JUNGLE_WOOD_HELMET = registerArmor("jungle_wood", ModArmorMaterials.WOOD, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> JUNGLE_WOOD_CHESTPLATE = registerArmor("jungle_wood", ModArmorMaterials.WOOD, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> JUNGLE_WOOD_LEGGINGS = registerArmor("jungle_wood", ModArmorMaterials.WOOD, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> JUNGLE_WOOD_BOOTS = registerArmor("jungle_wood", ModArmorMaterials.WOOD, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> JUNGLE_WOOD_SHIELD = ITEMS.register("jungle_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> JUNGLE_WOOD_SPEAR = ITEMS.register("jungle_wood_spear", () -> new CustomSpearItem(ModToolTiers.WOOD, new Item.Properties()));

    // === ACACIA ===
    public static final DeferredItem<Item> ACACIA_WOOD_SWORD = registerTool("acacia_wood_sword", ModToolTiers.WOOD, 3, -2.4F, "sword");
    public static final DeferredItem<Item> ACACIA_WOOD_PICKAXE = registerTool("acacia_wood_pickaxe", ModToolTiers.WOOD, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> ACACIA_WOOD_AXE = registerTool("acacia_wood_axe", ModToolTiers.WOOD, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> ACACIA_WOOD_SHOVEL = registerTool("acacia_wood_shovel", ModToolTiers.WOOD, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> ACACIA_WOOD_HOE = registerTool("acacia_wood_hoe", ModToolTiers.WOOD, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> ACACIA_WOOD_HELMET = registerArmor("acacia_wood", ModArmorMaterials.WOOD, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> ACACIA_WOOD_CHESTPLATE = registerArmor("acacia_wood", ModArmorMaterials.WOOD, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> ACACIA_WOOD_LEGGINGS = registerArmor("acacia_wood", ModArmorMaterials.WOOD, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> ACACIA_WOOD_BOOTS = registerArmor("acacia_wood", ModArmorMaterials.WOOD, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> ACACIA_WOOD_SHIELD = ITEMS.register("acacia_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> ACACIA_WOOD_SPEAR = ITEMS.register("acacia_wood_spear", () -> new CustomSpearItem(ModToolTiers.WOOD, new Item.Properties()));

    // === DARK OAK ===
    public static final DeferredItem<Item> DARK_OAK_WOOD_SWORD = registerTool("dark_oak_wood_sword", ModToolTiers.WOOD, 3, -2.4F, "sword");
    public static final DeferredItem<Item> DARK_OAK_WOOD_PICKAXE = registerTool("dark_oak_wood_pickaxe", ModToolTiers.WOOD, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> DARK_OAK_WOOD_AXE = registerTool("dark_oak_wood_axe", ModToolTiers.WOOD, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> DARK_OAK_WOOD_SHOVEL = registerTool("dark_oak_wood_shovel", ModToolTiers.WOOD, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> DARK_OAK_WOOD_HOE = registerTool("dark_oak_wood_hoe", ModToolTiers.WOOD, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> DARK_OAK_WOOD_HELMET = registerArmor("dark_oak_wood", ModArmorMaterials.WOOD, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> DARK_OAK_WOOD_CHESTPLATE = registerArmor("dark_oak_wood", ModArmorMaterials.WOOD, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> DARK_OAK_WOOD_LEGGINGS = registerArmor("dark_oak_wood", ModArmorMaterials.WOOD, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> DARK_OAK_WOOD_BOOTS = registerArmor("dark_oak_wood", ModArmorMaterials.WOOD, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> DARK_OAK_WOOD_SHIELD = ITEMS.register("dark_oak_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> DARK_OAK_WOOD_SPEAR = ITEMS.register("dark_oak_wood_spear", () -> new CustomSpearItem(ModToolTiers.WOOD, new Item.Properties()));

    // === MANGROVE ===
    public static final DeferredItem<Item> MANGROVE_WOOD_SWORD = registerTool("mangrove_wood_sword", ModToolTiers.WOOD, 3, -2.4F, "sword");
    public static final DeferredItem<Item> MANGROVE_WOOD_PICKAXE = registerTool("mangrove_wood_pickaxe", ModToolTiers.WOOD, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> MANGROVE_WOOD_AXE = registerTool("mangrove_wood_axe", ModToolTiers.WOOD, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> MANGROVE_WOOD_SHOVEL = registerTool("mangrove_wood_shovel", ModToolTiers.WOOD, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> MANGROVE_WOOD_HOE = registerTool("mangrove_wood_hoe", ModToolTiers.WOOD, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> MANGROVE_WOOD_HELMET = registerArmor("mangrove_wood", ModArmorMaterials.WOOD, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> MANGROVE_WOOD_CHESTPLATE = registerArmor("mangrove_wood", ModArmorMaterials.WOOD, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> MANGROVE_WOOD_LEGGINGS = registerArmor("mangrove_wood", ModArmorMaterials.WOOD, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> MANGROVE_WOOD_BOOTS = registerArmor("mangrove_wood", ModArmorMaterials.WOOD, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> MANGROVE_WOOD_SHIELD = ITEMS.register("mangrove_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> MANGROVE_WOOD_SPEAR = ITEMS.register("mangrove_wood_spear", () -> new CustomSpearItem(ModToolTiers.WOOD, new Item.Properties()));

    // === CHERRY ===
    public static final DeferredItem<Item> CHERRY_WOOD_SWORD = registerTool("cherry_wood_sword", ModToolTiers.WOOD, 3, -2.4F, "sword");
    public static final DeferredItem<Item> CHERRY_WOOD_PICKAXE = registerTool("cherry_wood_pickaxe", ModToolTiers.WOOD, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> CHERRY_WOOD_AXE = registerTool("cherry_wood_axe", ModToolTiers.WOOD, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> CHERRY_WOOD_SHOVEL = registerTool("cherry_wood_shovel", ModToolTiers.WOOD, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> CHERRY_WOOD_HOE = registerTool("cherry_wood_hoe", ModToolTiers.WOOD, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> CHERRY_WOOD_HELMET = registerArmor("cherry_wood", ModArmorMaterials.WOOD, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> CHERRY_WOOD_CHESTPLATE = registerArmor("cherry_wood", ModArmorMaterials.WOOD, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> CHERRY_WOOD_LEGGINGS = registerArmor("cherry_wood", ModArmorMaterials.WOOD, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> CHERRY_WOOD_BOOTS = registerArmor("cherry_wood", ModArmorMaterials.WOOD, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> CHERRY_WOOD_SHIELD = ITEMS.register("cherry_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> CHERRY_WOOD_SPEAR = ITEMS.register("cherry_wood_spear", () -> new CustomSpearItem(ModToolTiers.WOOD, new Item.Properties()));

    // === BAMBOO ===
    public static final DeferredItem<Item> BAMBOO_WOOD_SWORD = registerTool("bamboo_wood_sword", ModToolTiers.WOOD, 3, -2.4F, "sword");
    public static final DeferredItem<Item> BAMBOO_WOOD_PICKAXE = registerTool("bamboo_wood_pickaxe", ModToolTiers.WOOD, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> BAMBOO_WOOD_AXE = registerTool("bamboo_wood_axe", ModToolTiers.WOOD, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> BAMBOO_WOOD_SHOVEL = registerTool("bamboo_wood_shovel", ModToolTiers.WOOD, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> BAMBOO_WOOD_HOE = registerTool("bamboo_wood_hoe", ModToolTiers.WOOD, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> BAMBOO_WOOD_HELMET = registerArmor("bamboo_wood", ModArmorMaterials.WOOD, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> BAMBOO_WOOD_CHESTPLATE = registerArmor("bamboo_wood", ModArmorMaterials.WOOD, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> BAMBOO_WOOD_LEGGINGS = registerArmor("bamboo_wood", ModArmorMaterials.WOOD, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> BAMBOO_WOOD_BOOTS = registerArmor("bamboo_wood", ModArmorMaterials.WOOD, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> BAMBOO_WOOD_SHIELD = ITEMS.register("bamboo_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> BAMBOO_WOOD_SPEAR = ITEMS.register("bamboo_wood_spear", () -> new CustomSpearItem(ModToolTiers.WOOD, new Item.Properties()));

    // === CRIMSON ===
    public static final DeferredItem<Item> CRIMSON_WOOD_SWORD = registerTool("crimson_wood_sword", ModToolTiers.WOOD, 3, -2.4F, "sword");
    public static final DeferredItem<Item> CRIMSON_WOOD_PICKAXE = registerTool("crimson_wood_pickaxe", ModToolTiers.WOOD, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> CRIMSON_WOOD_AXE = registerTool("crimson_wood_axe", ModToolTiers.WOOD, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> CRIMSON_WOOD_SHOVEL = registerTool("crimson_wood_shovel", ModToolTiers.WOOD, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> CRIMSON_WOOD_HOE = registerTool("crimson_wood_hoe", ModToolTiers.WOOD, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> CRIMSON_WOOD_HELMET = registerArmor("crimson_wood", ModArmorMaterials.WOOD, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> CRIMSON_WOOD_CHESTPLATE = registerArmor("crimson_wood", ModArmorMaterials.WOOD, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> CRIMSON_WOOD_LEGGINGS = registerArmor("crimson_wood", ModArmorMaterials.WOOD, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> CRIMSON_WOOD_BOOTS = registerArmor("crimson_wood", ModArmorMaterials.WOOD, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> CRIMSON_WOOD_SHIELD = ITEMS.register("crimson_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> CRIMSON_WOOD_SPEAR = ITEMS.register("crimson_wood_spear", () -> new CustomSpearItem(ModToolTiers.WOOD, new Item.Properties()));

    // === WARPED ===
    public static final DeferredItem<Item> WARPED_WOOD_SWORD = registerTool("warped_wood_sword", ModToolTiers.WOOD, 3, -2.4F, "sword");
    public static final DeferredItem<Item> WARPED_WOOD_PICKAXE = registerTool("warped_wood_pickaxe", ModToolTiers.WOOD, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> WARPED_WOOD_AXE = registerTool("warped_wood_axe", ModToolTiers.WOOD, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> WARPED_WOOD_SHOVEL = registerTool("warped_wood_shovel", ModToolTiers.WOOD, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> WARPED_WOOD_HOE = registerTool("warped_wood_hoe", ModToolTiers.WOOD, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> WARPED_WOOD_HELMET = registerArmor("warped_wood", ModArmorMaterials.WOOD, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> WARPED_WOOD_CHESTPLATE = registerArmor("warped_wood", ModArmorMaterials.WOOD, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> WARPED_WOOD_LEGGINGS = registerArmor("warped_wood", ModArmorMaterials.WOOD, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> WARPED_WOOD_BOOTS = registerArmor("warped_wood", ModArmorMaterials.WOOD, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> WARPED_WOOD_SHIELD = ITEMS.register("warped_wood_shield", () -> new ShieldItem(new Item.Properties().durability(336)));
    public static final DeferredItem<Item> WARPED_WOOD_SPEAR = ITEMS.register("warped_wood_spear", () -> new CustomSpearItem(ModToolTiers.WOOD, new Item.Properties()));

    // === FLINT ===
    public static final DeferredItem<Item> FLINT_SWORD = registerTool("flint_sword", ModToolTiers.FLINT, 3, -2.4F, "sword");
    public static final DeferredItem<Item> FLINT_PICKAXE = registerTool("flint_pickaxe", ModToolTiers.FLINT, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> FLINT_AXE = registerTool("flint_axe", ModToolTiers.FLINT, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> FLINT_SHOVEL = registerTool("flint_shovel", ModToolTiers.FLINT, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> FLINT_HOE = registerTool("flint_hoe", ModToolTiers.FLINT, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> FLINT_HELMET = registerArmor("flint", ModArmorMaterials.FLINT, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> FLINT_CHESTPLATE = registerArmor("flint", ModArmorMaterials.FLINT, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> FLINT_LEGGINGS = registerArmor("flint", ModArmorMaterials.FLINT, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> FLINT_BOOTS = registerArmor("flint", ModArmorMaterials.FLINT, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> FLINT_SPEAR = ITEMS.register("flint_spear", () -> new CustomSpearItem(ModToolTiers.FLINT, new Item.Properties()));

    // === STONE ===
    public static final DeferredItem<ArmorItem> STONE_HELMET = registerArmor("stone", ModArmorMaterials.STONE, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> STONE_CHESTPLATE = registerArmor("stone", ModArmorMaterials.STONE, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> STONE_LEGGINGS = registerArmor("stone", ModArmorMaterials.STONE, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> STONE_BOOTS = registerArmor("stone", ModArmorMaterials.STONE, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> STONE_SPEAR = ITEMS.register("stone_spear", () -> new CustomSpearItem(ModToolTiers.STONE, new Item.Properties()));

    // === DEEPSLATE ===
    public static final DeferredItem<Item> DEEPSLATE_SWORD = registerTool("deepslate_sword", ModToolTiers.DEEPSLATE, 3, -2.4F, "sword");
    public static final DeferredItem<Item> DEEPSLATE_PICKAXE = registerTool("deepslate_pickaxe", ModToolTiers.DEEPSLATE, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> DEEPSLATE_AXE = registerTool("deepslate_axe", ModToolTiers.DEEPSLATE, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> DEEPSLATE_SHOVEL = registerTool("deepslate_shovel", ModToolTiers.DEEPSLATE, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> DEEPSLATE_HOE = registerTool("deepslate_hoe", ModToolTiers.DEEPSLATE, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> DEEPSLATE_HELMET = registerArmor("deepslate", ModArmorMaterials.DEEPSLATE, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> DEEPSLATE_CHESTPLATE = registerArmor("deepslate", ModArmorMaterials.DEEPSLATE, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> DEEPSLATE_LEGGINGS = registerArmor("deepslate", ModArmorMaterials.DEEPSLATE, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> DEEPSLATE_BOOTS = registerArmor("deepslate", ModArmorMaterials.DEEPSLATE, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> DEEPSLATE_SPEAR = ITEMS.register("deepslate_spear", () -> new CustomSpearItem(ModToolTiers.DEEPSLATE, new Item.Properties()));

    // === OBSIDIAN ===
    public static final DeferredItem<Item> OBSIDIAN_SWORD = registerTool("obsidian_sword", ModToolTiers.OBSIDIAN, 3, -2.4F, "sword");
    public static final DeferredItem<Item> OBSIDIAN_PICKAXE = registerTool("obsidian_pickaxe", ModToolTiers.OBSIDIAN, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> OBSIDIAN_AXE = registerTool("obsidian_axe", ModToolTiers.OBSIDIAN, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> OBSIDIAN_SHOVEL = registerTool("obsidian_shovel", ModToolTiers.OBSIDIAN, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> OBSIDIAN_HOE = registerTool("obsidian_hoe", ModToolTiers.OBSIDIAN, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> OBSIDIAN_HELMET = registerArmor("obsidian", ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> OBSIDIAN_CHESTPLATE = registerArmor("obsidian", ModArmorMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> OBSIDIAN_LEGGINGS = registerArmor("obsidian", ModArmorMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> OBSIDIAN_BOOTS = registerArmor("obsidian", ModArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> OBSIDIAN_SPEAR = ITEMS.register("obsidian_spear", () -> new CustomSpearItem(ModToolTiers.OBSIDIAN, new Item.Properties()));

    // === REDSTONE ===
    public static final DeferredItem<Item> REDSTONE_SWORD = registerTool("redstone_sword", ModToolTiers.REDSTONE, 3, -2.4F, "sword");
    public static final DeferredItem<Item> REDSTONE_PICKAXE = registerTool("redstone_pickaxe", ModToolTiers.REDSTONE, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> REDSTONE_AXE = registerTool("redstone_axe", ModToolTiers.REDSTONE, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> REDSTONE_SHOVEL = registerTool("redstone_shovel", ModToolTiers.REDSTONE, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> REDSTONE_HOE = registerTool("redstone_hoe", ModToolTiers.REDSTONE, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> REDSTONE_HELMET = registerArmor("redstone", ModArmorMaterials.REDSTONE, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> REDSTONE_CHESTPLATE = registerArmor("redstone", ModArmorMaterials.REDSTONE, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> REDSTONE_LEGGINGS = registerArmor("redstone", ModArmorMaterials.REDSTONE, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> REDSTONE_BOOTS = registerArmor("redstone", ModArmorMaterials.REDSTONE, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> REDSTONE_SPEAR = ITEMS.register("redstone_spear", () -> new CustomSpearItem(ModToolTiers.REDSTONE, new Item.Properties()));

    // === LAPIS ===
    public static final DeferredItem<Item> LAPIS_SWORD = registerTool("lapis_sword", ModToolTiers.LAPIS, 3, -2.4F, "sword");
    public static final DeferredItem<Item> LAPIS_PICKAXE = registerTool("lapis_pickaxe", ModToolTiers.LAPIS, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> LAPIS_AXE = registerTool("lapis_axe", ModToolTiers.LAPIS, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> LAPIS_SHOVEL = registerTool("lapis_shovel", ModToolTiers.LAPIS, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> LAPIS_HOE = registerTool("lapis_hoe", ModToolTiers.LAPIS, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> LAPIS_HELMET = registerArmor("lapis", ModArmorMaterials.LAPIS, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> LAPIS_CHESTPLATE = registerArmor("lapis", ModArmorMaterials.LAPIS, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> LAPIS_LEGGINGS = registerArmor("lapis", ModArmorMaterials.LAPIS, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> LAPIS_BOOTS = registerArmor("lapis", ModArmorMaterials.LAPIS, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> LAPIS_SPEAR = ITEMS.register("lapis_spear", () -> new CustomSpearItem(ModToolTiers.LAPIS, new Item.Properties()));

    // === QUARTZ ===
    public static final DeferredItem<Item> QUARTZ_SWORD = registerTool("quartz_sword", ModToolTiers.QUARTZ, 3, -2.4F, "sword");
    public static final DeferredItem<Item> QUARTZ_PICKAXE = registerTool("quartz_pickaxe", ModToolTiers.QUARTZ, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> QUARTZ_AXE = registerTool("quartz_axe", ModToolTiers.QUARTZ, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> QUARTZ_SHOVEL = registerTool("quartz_shovel", ModToolTiers.QUARTZ, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> QUARTZ_HOE = registerTool("quartz_hoe", ModToolTiers.QUARTZ, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> QUARTZ_HELMET = registerArmor("quartz", ModArmorMaterials.QUARTZ, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> QUARTZ_CHESTPLATE = registerArmor("quartz", ModArmorMaterials.QUARTZ, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> QUARTZ_LEGGINGS = registerArmor("quartz", ModArmorMaterials.QUARTZ, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> QUARTZ_BOOTS = registerArmor("quartz", ModArmorMaterials.QUARTZ, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> QUARTZ_SPEAR = ITEMS.register("quartz_spear", () -> new CustomSpearItem(ModToolTiers.QUARTZ, new Item.Properties()));

    // === CARBON FIBER ===
    public static final DeferredItem<Item> CARBON_FIBER_SWORD = registerTool("carbon_fiber_sword", ModToolTiers.CARBON_FIBER, 3, -2.4F, "sword");
    public static final DeferredItem<Item> CARBON_FIBER_PICKAXE = registerTool("carbon_fiber_pickaxe", ModToolTiers.CARBON_FIBER, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> CARBON_FIBER_AXE = registerTool("carbon_fiber_axe", ModToolTiers.CARBON_FIBER, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> CARBON_FIBER_SHOVEL = registerTool("carbon_fiber_shovel", ModToolTiers.CARBON_FIBER, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> CARBON_FIBER_HOE = registerTool("carbon_fiber_hoe", ModToolTiers.CARBON_FIBER, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> CARBON_FIBER_HELMET = registerArmor("carbon_fiber", ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> CARBON_FIBER_CHESTPLATE = registerArmor("carbon_fiber", ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> CARBON_FIBER_LEGGINGS = registerArmor("carbon_fiber", ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> CARBON_FIBER_BOOTS = registerArmor("carbon_fiber", ModArmorMaterials.CARBON_FIBER, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> CARBON_FIBER_SPEAR = ITEMS.register("carbon_fiber_spear", () -> new CustomSpearItem(ModToolTiers.CARBON_FIBER, new Item.Properties()));

    // === AMETHYST ===
    public static final DeferredItem<Item> AMETHYST_SWORD = registerTool("amethyst_sword", ModToolTiers.AMETHYST, 3, -2.4F, "sword");
    public static final DeferredItem<Item> AMETHYST_PICKAXE = registerTool("amethyst_pickaxe", ModToolTiers.AMETHYST, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> AMETHYST_AXE = registerTool("amethyst_axe", ModToolTiers.AMETHYST, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> AMETHYST_SHOVEL = registerTool("amethyst_shovel", ModToolTiers.AMETHYST, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> AMETHYST_HOE = registerTool("amethyst_hoe", ModToolTiers.AMETHYST, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> AMETHYST_HELMET = registerArmor("amethyst", ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> AMETHYST_CHESTPLATE = registerArmor("amethyst", ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> AMETHYST_LEGGINGS = registerArmor("amethyst", ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> AMETHYST_BOOTS = registerArmor("amethyst", ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> AMETHYST_SPEAR = ITEMS.register("amethyst_spear", () -> new CustomSpearItem(ModToolTiers.AMETHYST, new Item.Properties()));

    // === EMERALD ===
    public static final DeferredItem<Item> EMERALD_SWORD = registerTool("emerald_sword", ModToolTiers.EMERALD, 3, -2.4F, "sword");
    public static final DeferredItem<Item> EMERALD_PICKAXE = registerTool("emerald_pickaxe", ModToolTiers.EMERALD, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> EMERALD_AXE = registerTool("emerald_axe", ModToolTiers.EMERALD, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> EMERALD_SHOVEL = registerTool("emerald_shovel", ModToolTiers.EMERALD, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> EMERALD_HOE = registerTool("emerald_hoe", ModToolTiers.EMERALD, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> EMERALD_HELMET = registerArmor("emerald", ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> EMERALD_CHESTPLATE = registerArmor("emerald", ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> EMERALD_LEGGINGS = registerArmor("emerald", ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> EMERALD_BOOTS = registerArmor("emerald", ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> EMERALD_SPEAR = ITEMS.register("emerald_spear", () -> new CustomSpearItem(ModToolTiers.EMERALD, new Item.Properties()));

    // === ECHO ===
    public static final DeferredItem<Item> ECHO_SWORD = registerTool("echo_sword", ModToolTiers.ECHO, 3, -2.4F, "sword");
    public static final DeferredItem<Item> ECHO_PICKAXE = registerTool("echo_pickaxe", ModToolTiers.ECHO, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> ECHO_AXE = registerTool("echo_axe", ModToolTiers.ECHO, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> ECHO_SHOVEL = registerTool("echo_shovel", ModToolTiers.ECHO, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> ECHO_HOE = registerTool("echo_hoe", ModToolTiers.ECHO, -2, -1.0F, "hoe");
    public static final DeferredItem<ArmorItem> ECHO_HELMET = registerArmor("echo", ModArmorMaterials.ECHO, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> ECHO_CHESTPLATE = registerArmor("echo", ModArmorMaterials.ECHO, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> ECHO_LEGGINGS = registerArmor("echo", ModArmorMaterials.ECHO, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> ECHO_BOOTS = registerArmor("echo", ModArmorMaterials.ECHO, ArmorItem.Type.BOOTS);
    public static final DeferredItem<Item> ECHO_SPEAR = ITEMS.register("echo_spear", () -> new CustomSpearItem(ModToolTiers.ECHO, new Item.Properties()));

    // === SPEARS ===
    public static final DeferredItem<Item> WOOD_SPEAR = OAK_WOOD_SPEAR; // Alias per compatibilità
    public static final DeferredItem<Item> LEATHER_SPEAR = ITEMS.register("leather_spear", () -> new CustomSpearItem(ModToolTiers.LEATHER, new Item.Properties()));
    public static final DeferredItem<Item> CHAIN_SPEAR = ITEMS.register("chain_spear", () -> new CustomSpearItem(ModToolTiers.CHAIN, new Item.Properties()));
    public static final DeferredItem<Item> COPPER_SPEAR = ITEMS.register("copper_spear", () -> new CustomSpearItem(ModToolTiers.COPPER, new Item.Properties()));
    public static final DeferredItem<Item> IRON_SPEAR = ITEMS.register("iron_spear", () -> new CustomSpearItem(Tiers.IRON, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SPEAR = ITEMS.register("gold_spear", () -> new CustomSpearItem(Tiers.GOLD, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SPEAR = ITEMS.register("diamond_spear", () -> new CustomSpearItem(Tiers.DIAMOND, new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear", () -> new CustomSpearItem(Tiers.NETHERITE, new Item.Properties()));

    // === MISC ===
    public static final DeferredItem<Item> CARBON_FIBER_INGOT = ITEMS.register("carbon_fiber_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECHO_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("echo_armor_trim_smithing_template", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHAIN_SWORD = registerTool("chain_sword", ModToolTiers.CHAIN, 3, -2.4F, "sword");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

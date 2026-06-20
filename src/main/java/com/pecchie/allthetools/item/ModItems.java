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

    // === OAK WOOD ===
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

    // === SPRUCE WOOD ===
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

    // === BIRCH WOOD ===
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

    // === MATERIALS & OTHERS ===
    public static final DeferredItem<Item> CARBON_FIBER_INGOT = ITEMS.register("carbon_fiber_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECHO_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("echo_armor_trim_smithing_template", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHAIN_SWORD = registerTool("chain_sword", ModToolTiers.CHAIN, 3, -2.4F, "sword");
    
    // Altri oggetti per compatibilità con RecipeProvider (ne aggiungerò altri nel push finale)
    public static final DeferredItem<Item> LEATHER_SPEAR = ITEMS.register("leather_spear", () -> new CustomSpearItem(ModToolTiers.LEATHER, new Item.Properties()));
    public static final DeferredItem<Item> CHAIN_SPEAR = ITEMS.register("chain_spear", () -> new CustomSpearItem(ModToolTiers.CHAIN, new Item.Properties()));
    public static final DeferredItem<Item> COPPER_SPEAR = ITEMS.register("copper_spear", () -> new CustomSpearItem(ModToolTiers.COPPER, new Item.Properties()));
    public static final DeferredItem<Item> IRON_SPEAR = ITEMS.register("iron_spear", () -> new CustomSpearItem(Tiers.IRON, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SPEAR = ITEMS.register("gold_spear", () -> new CustomSpearItem(Tiers.GOLD, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SPEAR = ITEMS.register("diamond_spear", () -> new CustomSpearItem(Tiers.DIAMOND, new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear", () -> new CustomSpearItem(Tiers.NETHERITE, new Item.Properties()));
    public static final DeferredItem<Item> STONE_SPEAR = ITEMS.register("stone_spear", () -> new CustomSpearItem(ModToolTiers.STONE, new Item.Properties()));
    public static final DeferredItem<Item> DEEPSLATE_SPEAR = ITEMS.register("deepslate_spear", () -> new CustomSpearItem(ModToolTiers.DEEPSLATE, new Item.Properties()));
    public static final DeferredItem<Item> OBSIDIAN_SPEAR = ITEMS.register("obsidian_spear", () -> new CustomSpearItem(ModToolTiers.OBSIDIAN, new Item.Properties()));
    public static final DeferredItem<Item> REDSTONE_SPEAR = ITEMS.register("redstone_spear", () -> new CustomSpearItem(ModToolTiers.REDSTONE, new Item.Properties()));
    public static final DeferredItem<Item> LAPIS_SPEAR = ITEMS.register("lapis_spear", () -> new CustomSpearItem(ModToolTiers.LAPIS, new Item.Properties()));
    public static final DeferredItem<Item> QUARTZ_SPEAR = ITEMS.register("quartz_spear", () -> new CustomSpearItem(ModToolTiers.QUARTZ, new Item.Properties()));
    public static final DeferredItem<Item> CARBON_FIBER_SPEAR = ITEMS.register("carbon_fiber_spear", () -> new CustomSpearItem(ModToolTiers.CARBON_FIBER, new Item.Properties()));
    public static final DeferredItem<Item> AMETHYST_SPEAR = ITEMS.register("amethyst_spear", () -> new CustomSpearItem(ModToolTiers.AMETHYST, new Item.Properties()));
    public static final DeferredItem<Item> EMERALD_SPEAR = ITEMS.register("emerald_spear", () -> new CustomSpearItem(ModToolTiers.EMERALD, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

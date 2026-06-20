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

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AllTheTools.MODID);

    // === UTILS ===
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

    // === OAK WOOD ===
    public static final DeferredItem<Item> OAK_WOOD_SWORD = registerTool("oak_wood_sword", ModToolTiers.WOOD, 3, -2.4F, "sword");
    public static final DeferredItem<Item> OAK_WOOD_PICKAXE = registerTool("oak_wood_pickaxe", ModToolTiers.WOOD, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> OAK_WOOD_AXE = registerTool("oak_wood_axe", ModToolTiers.WOOD, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> OAK_WOOD_SHOVEL = registerTool("oak_wood_shovel", ModToolTiers.WOOD, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> OAK_WOOD_HOE = registerTool("oak_wood_hoe", ModToolTiers.WOOD, -2, -1.0F, "hoe");

    // === FLINT ===
    public static final DeferredItem<Item> FLINT_SWORD = registerTool("flint_sword", ModToolTiers.FLINT, 3, -2.4F, "sword");
    public static final DeferredItem<Item> FLINT_PICKAXE = registerTool("flint_pickaxe", ModToolTiers.FLINT, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> FLINT_AXE = registerTool("flint_axe", ModToolTiers.FLINT, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> FLINT_SHOVEL = registerTool("flint_shovel", ModToolTiers.FLINT, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> FLINT_HOE = registerTool("flint_hoe", ModToolTiers.FLINT, -2, -1.0F, "hoe");

    // === STONE ===
    public static final DeferredItem<Item> STONE_SWORD = registerTool("stone_sword", ModToolTiers.STONE, 3, -2.4F, "sword");
    public static final DeferredItem<Item> STONE_PICKAXE = registerTool("stone_pickaxe", ModToolTiers.STONE, 1, -2.8F, "pickaxe");
    public static final DeferredItem<Item> STONE_AXE = registerTool("stone_axe", ModToolTiers.STONE, 6.0F, -3.2F, "axe");
    public static final DeferredItem<Item> STONE_SHOVEL = registerTool("stone_shovel", ModToolTiers.STONE, 1.5F, -3.0F, "shovel");
    public static final DeferredItem<Item> STONE_HOE = registerTool("stone_hoe", ModToolTiers.STONE, -2, -1.0F, "hoe");

    // === SPEARS ===
    public static final DeferredItem<Item> WOOD_SPEAR = ITEMS.register("wood_spear", () -> new CustomSpearItem(ModToolTiers.WOOD, new Item.Properties()));
    public static final DeferredItem<Item> FLINT_SPEAR = ITEMS.register("flint_spear", () -> new CustomSpearItem(ModToolTiers.FLINT, new Item.Properties()));
    public static final DeferredItem<Item> STONE_SPEAR = ITEMS.register("stone_spear", () -> new CustomSpearItem(ModToolTiers.STONE, new Item.Properties()));
    public static final DeferredItem<Item> DEEPSLATE_SPEAR = ITEMS.register("deepslate_spear", () -> new CustomSpearItem(ModToolTiers.DEEPSLATE, new Item.Properties()));
    public static final DeferredItem<Item> OBSIDIAN_SPEAR = ITEMS.register("obsidian_spear", () -> new CustomSpearItem(ModToolTiers.OBSIDIAN, new Item.Properties()));
    public static final DeferredItem<Item> LEATHER_SPEAR = ITEMS.register("leather_spear", () -> new CustomSpearItem(ModToolTiers.LEATHER, new Item.Properties()));
    public static final DeferredItem<Item> CHAIN_SPEAR = ITEMS.register("chain_spear", () -> new CustomSpearItem(ModToolTiers.CHAIN, new Item.Properties()));
    public static final DeferredItem<Item> REDSTONE_SPEAR = ITEMS.register("redstone_spear", () -> new CustomSpearItem(ModToolTiers.REDSTONE, new Item.Properties()));
    public static final DeferredItem<Item> LAPIS_SPEAR = ITEMS.register("lapis_spear", () -> new CustomSpearItem(ModToolTiers.LAPIS, new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SPEAR = ITEMS.register("gold_spear", () -> new CustomSpearItem(Tiers.GOLD, new Item.Properties()));
    public static final DeferredItem<Item> COPPER_SPEAR = ITEMS.register("copper_spear", () -> new CustomSpearItem(ModToolTiers.COPPER, new Item.Properties()));
    public static final DeferredItem<Item> QUARTZ_SPEAR = ITEMS.register("quartz_spear", () -> new CustomSpearItem(ModToolTiers.QUARTZ, new Item.Properties()));
    public static final DeferredItem<Item> CARBON_FIBER_SPEAR = ITEMS.register("carbon_fiber_spear", () -> new CustomSpearItem(ModToolTiers.CARBON_FIBER, new Item.Properties()));
    public static final DeferredItem<Item> IRON_SPEAR = ITEMS.register("iron_spear", () -> new CustomSpearItem(Tiers.IRON, new Item.Properties()));
    public static final DeferredItem<Item> AMETHYST_SPEAR = ITEMS.register("amethyst_spear", () -> new CustomSpearItem(ModToolTiers.AMETHYST, new Item.Properties()));
    public static final DeferredItem<Item> EMERALD_SPEAR = ITEMS.register("emerald_spear", () -> new CustomSpearItem(ModToolTiers.EMERALD, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SPEAR = ITEMS.register("diamond_spear", () -> new CustomSpearItem(Tiers.DIAMOND, new Item.Properties()));
    public static final DeferredItem<Item> ECHO_SPEAR = ITEMS.register("echo_spear", () -> new CustomSpearItem(ModToolTiers.ECHO, new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear", () -> new CustomSpearItem(Tiers.NETHERITE, new Item.Properties()));

    // === INGOTS & TEMPLATES ===
    public static final DeferredItem<Item> CARBON_FIBER_INGOT = ITEMS.register("carbon_fiber_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECHO_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("echo_armor_trim_smithing_template", () -> new Item(new Item.Properties()));

    // === ARMOR ===
    public static final DeferredItem<ArmorItem> REDSTONE_HELMET = ITEMS.register("redstone_helmet", () -> new CustomRedstoneArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> LAPIS_HELMET = ITEMS.register("lapis_helmet", () -> new CustomLapisArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new CustomEmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new CustomObsidianArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> ECHO_HELMET = ITEMS.register("echo_helmet", () -> new CustomEchoArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.HELMET, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

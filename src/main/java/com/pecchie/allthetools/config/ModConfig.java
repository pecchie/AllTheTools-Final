package com.pecchie.allthetools.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ModConfig {

    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;

    public static ModConfigSpec.BooleanValue ENABLE_COPPER_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_WOOD_GEAR_VARIANTS;
    public static ModConfigSpec.BooleanValue ENABLE_FLINT_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_STONE_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_DEEPSLATE_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_OBSIDIAN_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_LEATHER_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_CHAIN_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_REDSTONE_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_LAPIS_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_GOLD_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_QUARTZ_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_CARBON_FIBER_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_IRON_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_AMETHYST_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_EMERALD_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_DIAMOND_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_ECHO_GEAR;
    public static ModConfigSpec.BooleanValue ENABLE_NETHERITE_GEAR;

    public static ModConfigSpec.BooleanValue ENABLE_REDSTONE_ARMOR_EFFECT;
    public static ModConfigSpec.BooleanValue ENABLE_LAPIS_ARMOR_EFFECT;
    public static ModConfigSpec.BooleanValue ENABLE_EMERALD_ARMOR_EFFECT;
    public static ModConfigSpec.BooleanValue ENABLE_OBSIDIAN_ARMOR_EFFECT;
    public static ModConfigSpec.BooleanValue ENABLE_ECHO_ARMOR_EFFECT;
    public static ModConfigSpec.BooleanValue ENABLE_ECHO_TOOL_EFFECT;
    public static ModConfigSpec.BooleanValue ENABLE_IRON_SWORD_FLINT_ARMOR_EFFECT;

    static {
        BUILDER.push("General");

        ENABLE_COPPER_GEAR = BUILDER.comment("Enable Copper tools and armor").define("enableCopperGear", true);
        ENABLE_WOOD_GEAR_VARIANTS = BUILDER.comment("Enable wood tool and armor variants (Spruce, Birch, Jungle, Acacia, Dark Oak, Mangrove, Cherry, Bamboo, Crimson, Warped)").define("enableWoodGearVariants", true);
        ENABLE_FLINT_GEAR = BUILDER.comment("Enable Flint tools and armor").define("enableFlintGear", true);
        ENABLE_STONE_GEAR = BUILDER.comment("Enable Stone tools and armor").define("enableStoneGear", true);
        ENABLE_DEEPSLATE_GEAR = BUILDER.comment("Enable Deepslate tools and armor").define("enableDeepslateGear", true);
        ENABLE_OBSIDIAN_GEAR = BUILDER.comment("Enable Obsidian tools and armor").define("enableObsidianGear", true);
        ENABLE_LEATHER_GEAR = BUILDER.comment("Enable Leather tools and armor").define("enableLeatherGear", true);
        ENABLE_CHAIN_GEAR = BUILDER.comment("Enable Chain tools and armor").define("enableChainGear", true);
        ENABLE_REDSTONE_GEAR = BUILDER.comment("Enable Redstone tools and armor").define("enableRedstoneGear", true);
        ENABLE_LAPIS_GEAR = BUILDER.comment("Enable Lapis tools and armor").define("enableLapisGear", true);
        ENABLE_GOLD_GEAR = BUILDER.comment("Enable Gold tools and armor").define("enableGoldGear", true);
        ENABLE_QUARTZ_GEAR = BUILDER.comment("Enable Quartz tools and armor").define("enableQuartzGear", true);
        ENABLE_CARBON_FIBER_GEAR = BUILDER.comment("Enable Carbon Fiber tools and armor").define("enableCarbonFiberGear", true);
        ENABLE_IRON_GEAR = BUILDER.comment("Enable Iron tools and armor").define("enableIronGear", true);
        ENABLE_AMETHYST_GEAR = BUILDER.comment("Enable Amethyst tools and armor").define("enableAmethystGear", true);
        ENABLE_EMERALD_GEAR = BUILDER.comment("Enable Emerald tools and armor").define("enableEmeraldGear", true);
        ENABLE_DIAMOND_GEAR = BUILDER.comment("Enable Diamond tools and armor").define("enableDiamondGear", true);
        ENABLE_ECHO_GEAR = BUILDER.comment("Enable Echo tools and armor").define("enableEchoGear", true);
        ENABLE_NETHERITE_GEAR = BUILDER.comment("Enable Netherite tools and armor").define("enableNetheriteGear", true);

        BUILDER.pop();
        BUILDER.push("Armor Effects");

        ENABLE_REDSTONE_ARMOR_EFFECT = BUILDER.comment("Enable Redstone armor effect (glowing nearby entities)").define("enableRedstoneArmorEffect", true);
        ENABLE_LAPIS_ARMOR_EFFECT = BUILDER.comment("Enable Lapis armor effect (halved anvil XP cost and enchantment cost)").define("enableLapisArmorEffect", true);
        ENABLE_EMERALD_ARMOR_EFFECT = BUILDER.comment("Enable Emerald armor effect (halved villager prices)").define("enableEmeraldArmorEffect", true);
        ENABLE_OBSIDIAN_ARMOR_EFFECT = BUILDER.comment("Enable Obsidian armor effect (Fire Protection I)").define("enableObsidianArmorEffect", true);
        ENABLE_ECHO_ARMOR_EFFECT = BUILDER.comment("Enable Echo armor effect (Warden and sculk sensors don't hear you)").define("enableEchoArmorEffect", true);
        ENABLE_ECHO_TOOL_EFFECT = BUILDER.comment("Enable Echo tool effect (tools don\'t emit sound when held)").define("enableEchoToolEffect", true);
        ENABLE_IRON_SWORD_FLINT_ARMOR_EFFECT = BUILDER.comment("Enable Iron Sword burning Flint armor effect").define("enableIronSwordFlintArmorEffect", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}

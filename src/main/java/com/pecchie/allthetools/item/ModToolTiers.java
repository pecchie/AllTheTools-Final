package com.pecchie.allthetools.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier OAK = Tiers.WOOD;
    public static final Tier SPRUCE = Tiers.WOOD;
    public static final Tier BIRCH = Tiers.WOOD;
    public static final Tier JUNGLE = Tiers.WOOD;
    public static final Tier ACACIA = Tiers.WOOD;
    public static final Tier DARK_OAK = Tiers.WOOD;
    public static final Tier MANGROVE = Tiers.WOOD;
    public static final Tier CHERRY = Tiers.WOOD;
    public static final Tier BAMBOO = Tiers.WOOD;
    public static final Tier CRIMSON = Tiers.WOOD;
    public static final Tier WARPED = Tiers.WOOD;

    public static final Tier FLINT = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL, 200, 4.0F, 1.0F, 10, () -> Ingredient.of(Items.FLINT));
    public static final Tier STONE = Tiers.STONE;
    public static final Tier DEEPSLATE = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 4.5F, 1.5F, 12, () -> Ingredient.of(Items.COBBLED_DEEPSLATE));
    public static final Tier OBSIDIAN = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2000, 5.0F, 2.0F, 5, () -> Ingredient.of(Items.OBSIDIAN));
    public static final Tier LEATHER = new SimpleTier(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 100, 2.0F, 0.0F, 5, () -> Ingredient.of(Items.LEATHER));
    public static final Tier CHAIN = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 5.0F, 1.5F, 12, () -> Ingredient.of(Items.CHAIN));
    public static final Tier COPPER = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL, 200, 5.0F, 1.5F, 12, () -> Ingredient.of(Items.COPPER_INGOT));
    public static final Tier REDSTONE = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 300, 5.0F, 2.0F, 14, () -> Ingredient.of(Items.REDSTONE));
    public static final Tier LAPIS = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 350, 5.5F, 2.2F, 20, () -> Ingredient.of(Items.LAPIS_LAZULI));
    public static final Tier QUARTZ = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 400, 6.0F, 2.5F, 15, () -> Ingredient.of(Items.QUARTZ));
    public static final Tier CARBON_FIBER = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 600, 7.0F, 3.0F, 15, () -> Ingredient.of(Items.COAL));
    public static final Tier AMETHYST = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 800, 7.5F, 3.5F, 20, () -> Ingredient.of(Items.AMETHYST_SHARD));
    public static final Tier EMERALD = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1100, 8.0F, 4.0F, 25, () -> Ingredient.of(Items.EMERALD));
    public static final Tier ECHO = new SimpleTier(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2500, 9.0F, 5.0F, 15, () -> Ingredient.of(Items.ECHO_SHARD));
}

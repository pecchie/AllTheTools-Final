package com.pecchie.allthetools.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    // Ordine di potenza: Legno<flint<pietra<deepslate<ossidiana<cuoio<redstone<lapis<oro<rame<quarzo<maglia<carbon fiber<ferro<ametista<smeraldo<diamante<eco<netherite

    public static final Tier WOOD = Tiers.WOOD; // Oak wood is the base

    public static final Tier SPRUCE_WOOD = TierSortingRegistry.registerTier(
            new Tier.Impl(Tiers.WOOD.getUses(), Tiers.WOOD.getSpeed(), Tiers.WOOD.getAttackDamageBonus(), Tiers.WOOD.getHarvestLevel(), Tiers.WOOD.getEnchantmentValue(), () -> Ingredient.of(net.minecraft.world.item.Items.SPRUCE_LOG)),
            new ResourceLocation("allthetools", "spruce_wood"), List.of(ModToolTiers.WOOD), List.of());

    public static final Tier BIRCH_WOOD = TierSortingRegistry.registerTier(
            new Tier.Impl(Tiers.WOOD.getUses(), Tiers.WOOD.getSpeed(), Tiers.WOOD.getAttackDamageBonus(), Tiers.WOOD.getHarvestLevel(), Tiers.WOOD.getEnchantmentValue(), () -> Ingredient.of(net.minecraft.world.item.Items.BIRCH_LOG)),
            new ResourceLocation("allthetools", "birch_wood"), List.of(ModToolTiers.WOOD), List.of());

    public static final Tier JUNGLE_WOOD = TierSortingRegistry.registerTier(
            new Tier.Impl(Tiers.WOOD.getUses(), Tiers.WOOD.getSpeed(), Tiers.WOOD.getAttackDamageBonus(), Tiers.WOOD.getHarvestLevel(), Tiers.WOOD.getEnchantmentValue(), () -> Ingredient.of(net.minecraft.world.item.Items.JUNGLE_LOG)),
            new ResourceLocation("allthetools", "jungle_wood"), List.of(ModToolTiers.WOOD), List.of());

    public static final Tier ACACIA_WOOD = TierSortingRegistry.registerTier(
            new Tier.Impl(Tiers.WOOD.getUses(), Tiers.WOOD.getSpeed(), Tiers.WOOD.getAttackDamageBonus(), Tiers.WOOD.getHarvestLevel(), Tiers.WOOD.getEnchantmentValue(), () -> Ingredient.of(net.minecraft.world.item.Items.ACACIA_LOG)),
            new ResourceLocation("allthetools", "acacia_wood"), List.of(ModToolTiers.WOOD), List.of());

    public static final Tier DARK_OAK_WOOD = TierSortingRegistry.registerTier(
            new Tier.Impl(Tiers.WOOD.getUses(), Tiers.WOOD.getSpeed(), Tiers.WOOD.getAttackDamageBonus(), Tiers.WOOD.getHarvestLevel(), Tiers.WOOD.getEnchantmentValue(), () -> Ingredient.of(net.minecraft.world.item.Items.DARK_OAK_LOG)),
            new ResourceLocation("allthetools", "dark_oak_wood"), List.of(ModToolTiers.WOOD), List.of());

    public static final Tier MANGROVE_WOOD = TierSortingRegistry.registerTier(
            new Tier.Impl(Tiers.WOOD.getUses(), Tiers.WOOD.getSpeed(), Tiers.WOOD.getAttackDamageBonus(), Tiers.WOOD.getHarvestLevel(), Tiers.WOOD.getEnchantmentValue(), () -> Ingredient.of(net.minecraft.world.item.Items.MANGROVE_LOG)),
            new ResourceLocation("allthetools", "mangrove_wood"), List.of(ModToolTiers.WOOD), List.of());

    public static final Tier CHERRY_WOOD = TierSortingRegistry.registerTier(
            new Tier.Impl(Tiers.WOOD.getUses(), Tiers.WOOD.getSpeed(), Tiers.WOOD.getAttackDamageBonus(), Tiers.WOOD.getHarvestLevel(), Tiers.WOOD.getEnchantmentValue(), () -> Ingredient.of(net.minecraft.world.item.Items.CHERRY_LOG)),
            new ResourceLocation("allthetools", "cherry_wood"), List.of(ModToolTiers.WOOD), List.of());

    public static final Tier BAMBOO_WOOD = TierSortingRegistry.registerTier(
            new Tier.Impl(Tiers.WOOD.getUses(), Tiers.WOOD.getSpeed(), Tiers.WOOD.getAttackDamageBonus(), Tiers.WOOD.getHarvestLevel(), Tiers.WOOD.getEnchantmentValue(), () -> Ingredient.of(net.minecraft.world.item.Items.BAMBOO_BLOCK)),
            new ResourceLocation("allthetools", "bamboo_wood"), List.of(ModToolTiers.WOOD), List.of());

    public static final Tier CRIMSON_WOOD = TierSortingRegistry.registerTier(
            new Tier.Impl(Tiers.WOOD.getUses(), Tiers.WOOD.getSpeed(), Tiers.WOOD.getAttackDamageBonus(), Tiers.WOOD.getHarvestLevel(), Tiers.WOOD.getEnchantmentValue(), () -> Ingredient.of(net.minecraft.world.item.Items.CRIMSON_STEM)),
            new ResourceLocation("allthetools", "crimson_wood"), List.of(ModToolTiers.WOOD), List.of());

    public static final Tier WARPED_WOOD = TierSortingRegistry.registerTier(
            new Tier.Impl(Tiers.WOOD.getUses(), Tiers.WOOD.getSpeed(), Tiers.WOOD.getAttackDamageBonus(), Tiers.WOOD.getHarvestLevel(), Tiers.WOOD.getEnchantmentValue(), () -> Ingredient.of(net.minecraft.world.item.Items.WARPED_STEM)),
            new ResourceLocation("allthetools", "warped_wood"), List.of(ModToolTiers.WOOD), List.of());

    public static final Tier FLINT = TierSortingRegistry.registerTier(
            new Tier.Impl(
                    200, // Durability
                    4.0F, // Efficiency
                    1.0F, // Attack Damage Bonus
                    1, // Harvest Level (corrisponde a Iron)
                    10, // Enchantability
                    () -> Ingredient.of(net.minecraft.world.item.Items.FLINT)
            ),
            new ResourceLocation("allthetools", "flint"), List.of(ModToolTiers.WOOD), List.of());

    public static final Tier STONE = TierSortingRegistry.registerTier(
            Tiers.STONE, new ResourceLocation("minecraft", "stone"), List.of(ModToolTiers.FLINT), List.of());

    public static final Tier DEEPSLATE = TierSortingRegistry.registerTier(
            new Tier.Impl(
                    250, // Durability (tra Stone e Iron)
                    4.5F, // Efficiency (tra Stone e Iron)
                    1.5F, // Attack Damage Bonus
                    1, // Harvest Level (come Stone)
                    12, // Enchantability
                    () -> Ingredient.of(net.minecraft.world.item.Items.COBBLED_DEEPSLATE)
            ),
            new ResourceLocation("allthetools", "deepslate"), List.of(ModToolTiers.STONE), List.of());

    public static final Tier OBSIDIAN = TierSortingRegistry.registerTier(
            new Tier.Impl(
                    2000, // Durability (molto alta)
                    5.0F, // Efficiency (come Iron)
                    2.0F, // Attack Damage Bonus
                    2, // Harvest Level (come Diamond)
                    5, // Enchantability (bassa)
                    () -> Ingredient.of(net.minecraft.world.item.Items.OBSIDIAN)
            ),
            new ResourceLocation("allthetools", "obsidian"), List.of(ModToolTiers.DEEPSLATE), List.of());

    // Cuoio e Maglia non rispettano la scala ma stanno sotto il legno
    public static final Tier LEATHER = TierSortingRegistry.registerTier(
            new Tier.Impl(
                    60, // Durability (molto bassa)
                    1.0F, // Efficiency (molto bassa)
                    0.5F, // Attack Damage Bonus
                    0, // Harvest Level (nessuno)
                    15, // Enchantability
                    () -> Ingredient.of(net.minecraft.world.item.Items.LEATHER)
            ),
            new ResourceLocation("allthetools", "leather"), List.of(ModToolTiers.WOOD), List.of());

    public static final Tier CHAIN = TierSortingRegistry.registerTier(
            new Tier.Impl(
                    120, // Durability (bassa)
                    2.0F, // Efficiency (bassa)
                    0.7F, // Attack Damage Bonus
                    0, // Harvest Level (nessuno)
                    12, // Enchantability
                    () -> Ingredient.of(net.minecraft.world.item.Items.IRON_NUGGET)
            ),
            new ResourceLocation("allthetools", "chain"), List.of(ModToolTiers.LEATHER), List.of());

    public static final Tier REDSTONE = TierSortingRegistry.registerTier(
            new Tier.Impl(
                    300, // Durability
                    5.0F, // Efficiency
                    2.0F, // Attack Damage Bonus
                    2, // Harvest Level (come Diamond)
                    14, // Enchantability
                    () -> Ingredient.of(net.minecraft.world.item.Items.REDSTONE)
            ),
            new ResourceLocation("allthetools", "redstone"), List.of(ModToolTiers.OBSIDIAN), List.of());

    public static final Tier LAPIS = TierSortingRegistry.registerTier(
            new Tier.Impl(
                    350, // Durability
                    5.5F, // Efficiency
                    2.2F, // Attack Damage Bonus
                    2, // Harvest Level (come Diamond)
                    20, // Enchantability (alta)
                    () -> Ingredient.of(net.minecraft.world.item.Items.LAPIS_LAZULI)
            ),
            new ResourceLocation("allthetools", "lapis"), List.of(ModToolTiers.REDSTONE), List.of());

    public static final Tier GOLD = Tiers.GOLD;

    public static final Tier COPPER = TierSortingRegistry.registerTier(
            new Tier.Impl(
                    180, // Durability (tra Wood e Stone)
                    6.0F, // Efficiency (come Gold)
                    1.0F, // Attack Damage Bonus
                    1, // Harvest Level (come Stone)
                    18, // Enchantability
                    () -> Ingredient.of(net.minecraft.world.item.Items.COPPER_INGOT)
            ),
            new ResourceLocation("allthetools", "copper"), List.of(ModToolTiers.GOLD), List.of());

    public static final Tier QUARTZ = TierSortingRegistry.registerTier(
            new Tier.Impl(
                    280, // Durability (tra Stone e Iron)
                    6.5F, // Efficiency
                    2.5F, // Attack Damage Bonus
                    2, // Harvest Level (come Diamond)
                    16, // Enchantability
                    () -> Ingredient.of(net.minecraft.world.item.Items.QUARTZ)
            ),
            new ResourceLocation("allthetools", "quartz"), List.of(ModToolTiers.COPPER), List.of());

    public static final Tier CARBON_FIBER = TierSortingRegistry.registerTier(
            new Tier.Impl(
                    700, // Durability (tra Iron e Diamond)
                    7.0F, // Efficiency
                    3.0F, // Attack Damage Bonus
                    3, // Harvest Level (come Diamond)
                    10, // Enchantability
                    () -> Ingredient.of(net.minecraft.world.item.Items.COAL)
            ),
            new ResourceLocation("allthetools", "carbon_fiber"), List.of(ModToolTiers.QUARTZ), List.of());

    public static final Tier IRON = Tiers.IRON;

    public static final Tier AMETHYST = TierSortingRegistry.registerTier(
            new Tier.Impl(
                    900, // Durability (tra Iron e Diamond)
                    7.5F, // Efficiency
                    3.5F, // Attack Damage Bonus
                    3, // Harvest Level (come Diamond)
                    22, // Enchantability (alta)
                    () -> Ingredient.of(net.minecraft.world.item.Items.AMETHYST_SHARD)
            ),
            new ResourceLocation("allthetools", "amethyst"), List.of(ModToolTiers.IRON), List.of());

    public static final Tier EMERALD = TierSortingRegistry.registerTier(
            new Tier.Impl(
                    1100, // Durability (tra Diamond e Netherite)
                    8.0F, // Efficiency
                    4.0F, // Attack Damage Bonus
                    3, // Harvest Level (come Diamond)
                    25, // Enchantability (molto alta)
                    () -> Ingredient.of(net.minecraft.world.item.Items.EMERALD)
            ),
            new ResourceLocation("allthetools", "emerald"), List.of(ModToolTiers.AMETHYST), List.of());

    public static final Tier DIAMOND = Tiers.DIAMOND;

    public static final Tier ECHO = TierSortingRegistry.registerTier(
            new Tier.Impl(
                    2500, // Durability (tra Diamond e Netherite)
                    9.0F, // Efficiency
                    5.0F, // Attack Damage Bonus
                    4, // Harvest Level (come Netherite)
                    15, // Enchantability
                    () -> Ingredient.of(net.minecraft.world.item.Items.ECHO_SHARD)
            ),
            new ResourceLocation("allthetools", "echo"), List.of(ModToolTiers.DIAMOND), List.of());

    public static final Tier NETHERITE = Tiers.NETHERITE;
}

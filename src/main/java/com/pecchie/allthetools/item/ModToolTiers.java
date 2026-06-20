package com.pecchie.allthetools.item;

import com.pecchie.allthetools.AllTheTools;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier WOOD = Tiers.WOOD;

    public static final Tier FLINT = new SimpleTier(
            BlockTags.INCORRECT_FOR_IRON_TOOL, // Usiamo un tag esistente per semplicità
            200, 4.0F, 1.0F, 10,
            () -> Ingredient.of(net.minecraft.world.item.Items.FLINT)
    );

    public static final Tier STONE = Tiers.STONE;

    public static final Tier DEEPSLATE = new SimpleTier(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            250, 4.5F, 1.5F, 12,
            () -> Ingredient.of(net.minecraft.world.item.Items.COBBLED_DEEPSLATE)
    );

    public static final Tier OBSIDIAN = new SimpleTier(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            2000, 5.0F, 2.0F, 5,
            () -> Ingredient.of(net.minecraft.world.item.Items.OBSIDIAN)
    );

    public static final Tier REDSTONE = new SimpleTier(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            300, 5.0F, 2.0F, 14,
            () -> Ingredient.of(net.minecraft.world.item.Items.REDSTONE)
    );

    public static final Tier LAPIS = new SimpleTier(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            350, 5.5F, 2.2F, 20,
            () -> Ingredient.of(net.minecraft.world.item.Items.LAPIS_LAZULI)
    );

    public static final Tier ECHO = new SimpleTier(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2500, 9.0F, 5.0F, 15,
            () -> Ingredient.of(net.minecraft.world.item.Items.ECHO_SHARD)
    );

    public static final Tier EMERALD = new SimpleTier(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1100, 8.0F, 4.0F, 25,
            () -> Ingredient.of(net.minecraft.world.item.Items.EMERALD)
    );
    
    // Altri tier...
}

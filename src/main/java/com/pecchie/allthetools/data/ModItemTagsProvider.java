package com.pecchie.allthetools.data;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public static final TagKey<Item> SPEARS = ItemTags.create(ResourceLocation.fromNamespaceAndPath("backported-spears", "spears"));

    public ModItemTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, AllTheTools.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(SPEARS)
                .add(ModItems.OAK_WOOD_SPEAR.get())
                .add(ModItems.SPRUCE_WOOD_SPEAR.get())
                .add(ModItems.BIRCH_WOOD_SPEAR.get())
                .add(ModItems.JUNGLE_WOOD_SPEAR.get())
                .add(ModItems.ACACIA_WOOD_SPEAR.get())
                .add(ModItems.DARK_OAK_WOOD_SPEAR.get())
                .add(ModItems.MANGROVE_WOOD_SPEAR.get())
                .add(ModItems.CHERRY_WOOD_SPEAR.get())
                .add(ModItems.BAMBOO_WOOD_SPEAR.get())
                .add(ModItems.CRIMSON_WOOD_SPEAR.get())
                .add(ModItems.WARPED_WOOD_SPEAR.get())
                .add(ModItems.FLINT_SPEAR.get())
                .add(ModItems.STONE_SPEAR.get())
                .add(ModItems.DEEPSLATE_SPEAR.get())
                .add(ModItems.OBSIDIAN_SPEAR.get())
                .add(ModItems.LEATHER_SPEAR.get())
                .add(ModItems.CHAIN_SPEAR.get())
                .add(ModItems.COPPER_SPEAR.get())
                .add(ModItems.REDSTONE_SPEAR.get())
                .add(ModItems.LAPIS_SPEAR.get())
                .add(ModItems.QUARTZ_SPEAR.get())
                .add(ModItems.CARBON_FIBER_SPEAR.get())
                .add(ModItems.AMETHYST_SPEAR.get())
                .add(ModItems.EMERALD_SPEAR.get())
                .add(ModItems.ECHO_SPEAR.get())
                .add(ModItems.IRON_SPEAR.get())
                .add(ModItems.GOLD_SPEAR.get())
                .add(ModItems.DIAMOND_SPEAR.get())
                .add(ModItems.NETHERITE_SPEAR.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.OAK_WOOD_SWORD.get())
                .add(ModItems.FLINT_SWORD.get())
                .add(ModItems.STONE_SWORD.get())
                .add(ModItems.DEEPSLATE_SWORD.get())
                .add(ModItems.OBSIDIAN_SWORD.get())
                .add(ModItems.LEATHER_SWORD.get())
                .add(ModItems.CHAIN_SWORD.get())
                .add(ModItems.COPPER_SWORD.get())
                .add(ModItems.REDSTONE_SWORD.get())
                .add(ModItems.LAPIS_SWORD.get())
                .add(ModItems.QUARTZ_SWORD.get())
                .add(ModItems.CARBON_FIBER_SWORD.get())
                .add(ModItems.AMETHYST_SWORD.get())
                .add(ModItems.EMERALD_SWORD.get())
                .add(ModItems.ECHO_SWORD.get());
    }
}

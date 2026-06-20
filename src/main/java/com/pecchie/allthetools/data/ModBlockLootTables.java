package com.pecchie.allthetools.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables(HolderLookup.Provider registries) {
        super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        // Aggiungi qui i drop dei blocchi se aggiungi blocchi alla mod
        // Esempio: dropSelf(ModBlocks.ENDERITE_ORE.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        // Ritorna i blocchi conosciuti della mod
        return Collections.emptyList();
    }
}

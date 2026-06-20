package com.pecchie.allthetools.data;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.item.ModItems;
import com.pecchie.allthetools.loot.ModLootModifiers;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, AllTheTools.MODID);
    }

    @Override
    protected void start() {
        // Aggiungi il template Echo alle casse delle Ancient Cities
        add("echo_armor_trim_template_in_ancient_city", new ModLootModifiers.AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("chests/ancient_city")).build()
        }, ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get().getDefaultInstance()));

        // Aggiungi strumenti di maglia alle casse dei dungeon o villaggi
        add("chain_gear_in_dungeons", new ModLootModifiers.AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("chests/simple_dungeon")).build()
        }, ModItems.CHAIN_SWORD.get().getDefaultInstance()));
    }
}

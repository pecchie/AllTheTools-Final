package com.pecchie.allthetools.data;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.TagLookup;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTagProvider, AllTheTools.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // Aggiungi i nostri CustomSpearItem al tag 'spears' di Backported Spears
        // Il tag 'spears' è definito da Backported Spears, quindi lo referenziamo direttamente.
        this.tag(ItemTags.create(new net.minecraft.resources.ResourceLocation("spears", "spears")))
                .add(ModItems.WOOD_SPEAR.get())
                .add(ModItems.FLINT_SPEAR.get())
                .add(ModItems.STONE_SPEAR.get())
                .add(ModItems.DEEPSLATE_SPEAR.get())
                .add(ModItems.OBSIDIAN_SPEAR.get())
                .add(ModItems.LEATHER_SPEAR.get())
                .add(ModItems.CHAIN_SPEAR.get())
                .add(ModItems.REDSTONE_SPEAR.get())
                .add(ModItems.LAPIS_SPEAR.get())
                .add(ModItems.GOLD_SPEAR.get())
                .add(ModItems.COPPER_SPEAR.get())
                .add(ModItems.QUARTZ_SPEAR.get())
                .add(ModItems.CARBON_FIBER_SPEAR.get())
                .add(ModItems.IRON_SPEAR.get())
                .add(ModItems.AMETHYST_SPEAR.get())
                .add(ModItems.EMERALD_SPEAR.get())
                .add(ModItems.DIAMOND_SPEAR.get())
                .add(ModItems.ECHO_SPEAR.get())
                .add(ModItems.NETHERITE_SPEAR.get());

        // Aggiungi i tools di ferro al tag 'swords' per l'interazione con l'armatura di flint
        this.tag(ItemTags.SWORDS)
                .add(ModItems.IRON_SWORD.get());
    }
}

package com.pecchie.allthetools.data;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, ExistingFileHelper existingFileHelper) {
        super(output, AllTheTools.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Genera modelli per tutti gli oggetti registrati
        // Nota: Questo è un esempio semplificato. In una mod reale, 
        // itereremmo su ModItems.ITEMS.getEntries() e useremmo helper diversi per strumenti/armature.
        
        // Esempio per un oggetto base
        // simpleItem(ModItems.CARBON_FIBER_INGOT);
        
        // Esempio per uno strumento
        // handheldItem(ModItems.OAK_WOOD_SWORD);
    }

    private void simpleItem(DeferredItem<? extends Item> item) {
        withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AllTheTools.MODID, "item/" + item.getId().getPath()));
    }

    private void handheldItem(DeferredItem<? extends Item> item) {
        withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AllTheTools.MODID, "item/" + item.getId().getPath()));
    }
}

package com.pecchie.allthetools.data;

import com.pecchie.allthetools.AllTheTools;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, AllTheTools.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Logica per generare i modelli JSON
    }
}

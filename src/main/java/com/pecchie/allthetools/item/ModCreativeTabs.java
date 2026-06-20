package com.pecchie.allthetools.item;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.config.ModConfig;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AllTheTools.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ALL_THE_TOOLS_TAB = CREATIVE_MODE_TABS.register("allthetools_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get()))
            .title(Component.translatable("itemGroup.allthetools_tab"))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.OAK_WOOD_SWORD.get());
                output.accept(ModItems.OAK_WOOD_PICKAXE.get());
                output.accept(ModItems.OAK_WOOD_AXE.get());
                output.accept(ModItems.OAK_WOOD_SHOVEL.get());
                output.accept(ModItems.OAK_WOOD_HOE.get());
                
                output.accept(ModItems.CARBON_FIBER_INGOT.get());
                output.accept(ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get());
                
                output.accept(ModItems.REDSTONE_HELMET.get());
                output.accept(ModItems.LAPIS_HELMET.get());
                output.accept(ModItems.EMERALD_HELMET.get());
                output.accept(ModItems.OBSIDIAN_HELMET.get());
                output.accept(ModItems.ECHO_HELMET.get());
            }).build());
}

package com.pecchie.allthetools.item;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.config.ModConfig;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AllTheTools.MODID);

    public static final net.neoforged.neoforge.registries.RegistryObject<CreativeModeTab> ALL_THE_TOOLS_TAB = CREATIVE_MODE_TABS.register("allthetools_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get()))
            .title(Component.translatable("itemGroup.allthetools_tab"))
            .displayItems((parameters, output) -> {
                // === WOOD TOOLS (OAK) ===
                output.accept(ModItems.OAK_WOOD_SWORD.get());
                output.accept(ModItems.OAK_WOOD_PICKAXE.get());
                output.accept(ModItems.OAK_WOOD_AXE.get());
                output.accept(ModItems.OAK_WOOD_SHOVEL.get());
                output.accept(ModItems.OAK_WOOD_HOE.get());
                output.accept(ModItems.OAK_WOOD_HELMET.get());
                output.accept(ModItems.OAK_WOOD_CHESTPLATE.get());
                output.accept(ModItems.OAK_WOOD_LEGGINGS.get());
                output.accept(ModItems.OAK_WOOD_BOOTS.get());
                output.accept(ModItems.OAK_WOOD_SHIELD.get());

                if (ModConfig.ENABLE_WOOD_GEAR_VARIANTS.get()) {
                    // === SPRUCE WOOD TOOLS ===
                    output.accept(ModItems.SPRUCE_WOOD_SWORD.get());
                    output.accept(ModItems.SPRUCE_WOOD_PICKAXE.get());
                    output.accept(ModItems.SPRUCE_WOOD_AXE.get());
                    output.accept(ModItems.SPRUCE_WOOD_SHOVEL.get());
                    output.accept(ModItems.SPRUCE_WOOD_HOE.get());
                    output.accept(ModItems.SPRUCE_WOOD_HELMET.get());
                    output.accept(ModItems.SPRUCE_WOOD_CHESTPLATE.get());
                    output.accept(ModItems.SPRUCE_WOOD_LEGGINGS.get());
                    output.accept(ModItems.SPRUCE_WOOD_BOOTS.get());
                    output.accept(ModItems.SPRUCE_WOOD_SHIELD.get());

                    // === BIRCH WOOD TOOLS ===
                    output.accept(ModItems.BIRCH_WOOD_SWORD.get());
                    output.accept(ModItems.BIRCH_WOOD_PICKAXE.get());
                    output.accept(ModItems.BIRCH_WOOD_AXE.get());
                    output.accept(ModItems.BIRCH_WOOD_SHOVEL.get());
                    output.accept(ModItems.BIRCH_WOOD_HOE.get());
                    output.accept(ModItems.BIRCH_WOOD_HELMET.get());
                    output.accept(ModItems.BIRCH_WOOD_CHESTPLATE.get());
                    output.accept(ModItems.BIRCH_WOOD_LEGGINGS.get());
                    output.accept(ModItems.BIRCH_WOOD_BOOTS.get());
                    output.accept(ModItems.BIRCH_WOOD_SHIELD.get());

                    // === JUNGLE WOOD TOOLS ===
                    output.accept(ModItems.JUNGLE_WOOD_SWORD.get());
                    output.accept(ModItems.JUNGLE_WOOD_PICKAXE.get());
                    output.accept(ModItems.JUNGLE_WOOD_AXE.get());
                    output.accept(ModItems.JUNGLE_WOOD_SHOVEL.get());
                    output.accept(ModItems.JUNGLE_WOOD_HOE.get());
                    output.accept(ModItems.JUNGLE_WOOD_HELMET.get());
                    output.accept(ModItems.JUNGLE_WOOD_CHESTPLATE.get());
                    output.accept(ModItems.JUNGLE_WOOD_LEGGINGS.get());
                    output.accept(ModItems.JUNGLE_WOOD_BOOTS.get());
                    output.accept(ModItems.JUNGLE_WOOD_SHIELD.get());

                    // === ACACIA WOOD TOOLS ===
                    output.accept(ModItems.ACACIA_WOOD_SWORD.get());
                    output.accept(ModItems.ACACIA_WOOD_PICKAXE.get());
                    output.accept(ModItems.ACACIA_WOOD_AXE.get());
                    output.accept(ModItems.ACACIA_WOOD_SHOVEL.get());
                    output.accept(ModItems.ACACIA_WOOD_HOE.get());
                    output.accept(ModItems.ACACIA_WOOD_HELMET.get());
                    output.accept(ModItems.ACACIA_WOOD_CHESTPLATE.get());
                    output.accept(ModItems.ACACIA_WOOD_LEGGINGS.get());
                    output.accept(ModItems.ACACIA_WOOD_BOOTS.get());
                    output.accept(ModItems.ACACIA_WOOD_SHIELD.get());

                    // === DARK OAK WOOD TOOLS ===
                    output.accept(ModItems.DARK_OAK_WOOD_SWORD.get());
                    output.accept(ModItems.DARK_OAK_WOOD_PICKAXE.get());
                    output.accept(ModItems.DARK_OAK_WOOD_AXE.get());
                    output.accept(ModItems.DARK_OAK_WOOD_SHOVEL.get());
                    output.accept(ModItems.DARK_OAK_WOOD_HOE.get());
                    output.accept(ModItems.DARK_OAK_WOOD_HELMET.get());
                    output.accept(ModItems.DARK_OAK_WOOD_CHESTPLATE.get());
                    output.accept(ModItems.DARK_OAK_WOOD_LEGGINGS.get());
                    output.accept(ModItems.DARK_OAK_WOOD_BOOTS.get());
                    output.accept(ModItems.DARK_OAK_WOOD_SHIELD.get());

                    // === MANGROVE WOOD TOOLS ===
                    output.accept(ModItems.MANGROVE_WOOD_SWORD.get());
                    output.accept(ModItems.MANGROVE_WOOD_PICKAXE.get());
                    output.accept(ModItems.MANGROVE_WOOD_AXE.get());
                    output.accept(ModItems.MANGROVE_WOOD_SHOVEL.get());
                    output.accept(ModItems.MANGROVE_WOOD_HOE.get());
                    output.accept(ModItems.MANGROVE_WOOD_HELMET.get());
                    output.accept(ModItems.MANGROVE_WOOD_CHESTPLATE.get());
                    output.accept(ModItems.MANGROVE_WOOD_LEGGINGS.get());
                    output.accept(ModItems.MANGROVE_WOOD_BOOTS.get());
                    output.accept(ModItems.MANGROVE_WOOD_SHIELD.get());

                    // === CHERRY WOOD TOOLS ===
                    output.accept(ModItems.CHERRY_WOOD_SWORD.get());
                    output.accept(ModItems.CHERRY_WOOD_PICKAXE.get());
                    output.accept(ModItems.CHERRY_WOOD_AXE.get());
                    output.accept(ModItems.CHERRY_WOOD_SHOVEL.get());
                    output.accept(ModItems.CHERRY_WOOD_HOE.get());
                    output.accept(ModItems.CHERRY_WOOD_HELMET.get());
                    output.accept(ModItems.CHERRY_WOOD_CHESTPLATE.get());
                    output.accept(ModItems.CHERRY_WOOD_LEGGINGS.get());
                    output.accept(ModItems.CHERRY_WOOD_BOOTS.get());
                    output.accept(ModItems.CHERRY_WOOD_SHIELD.get());

                    // === BAMBOO WOOD TOOLS ===
                    output.accept(ModItems.BAMBOO_WOOD_SWORD.get());
                    output.accept(ModItems.BAMBOO_WOOD_PICKAXE.get());
                    output.accept(ModItems.BAMBOO_WOOD_AXE.get());
                    output.accept(ModItems.BAMBOO_WOOD_SHOVEL.get());
                    output.accept(ModItems.BAMBOO_WOOD_HOE.get());
                    output.accept(ModItems.BAMBOO_WOOD_HELMET.get());
                    output.accept(ModItems.BAMBOO_WOOD_CHESTPLATE.get());
                    output.accept(ModItems.BAMBOO_WOOD_LEGGINGS.get());
                    output.accept(ModItems.BAMBOO_WOOD_BOOTS.get());
                    output.accept(ModItems.BAMBOO_WOOD_SHIELD.get());

                    // === CRIMSON WOOD TOOLS ===
                    output.accept(ModItems.CRIMSON_WOOD_SWORD.get());
                    output.accept(ModItems.CRIMSON_WOOD_PICKAXE.get());
                    output.accept(ModItems.CRIMSON_WOOD_AXE.get());
                    output.accept(ModItems.CRIMSON_WOOD_SHOVEL.get());
                    output.accept(ModItems.CRIMSON_WOOD_HOE.get());
                    output.accept(ModItems.CRIMSON_WOOD_HELMET.get());
                    output.accept(ModItems.CRIMSON_WOOD_CHESTPLATE.get());
                    output.accept(ModItems.CRIMSON_WOOD_LEGGINGS.get());
                    output.accept(ModItems.CRIMSON_WOOD_BOOTS.get());
                    output.accept(ModItems.CRIMSON_WOOD_SHIELD.get());

                    // === WARPED WOOD TOOLS ===
                    output.accept(ModItems.WARPED_WOOD_SWORD.get());
                    output.accept(ModItems.WARPED_WOOD_PICKAXE.get());
                    output.accept(ModItems.WARPED_WOOD_AXE.get());
                    output.accept(ModItems.WARPED_WOOD_SHOVEL.get());
                    output.accept(ModItems.WARPED_WOOD_HOE.get());
                    output.accept(ModItems.WARPED_WOOD_HELMET.get());
                    output.accept(ModItems.WARPED_WOOD_CHESTPLATE.get());
                    output.accept(ModItems.WARPED_WOOD_LEGGINGS.get());
                    output.accept(ModItems.WARPED_WOOD_BOOTS.get());
                    output.accept(ModItems.WARPED_WOOD_SHIELD.get());
                }

                if (ModConfig.ENABLE_FLINT_GEAR.get()) {
                    // === FLINT TOOLS ===
                    output.accept(ModItems.FLINT_SWORD.get());
                    output.accept(ModItems.FLINT_PICKAXE.get());
                    output.accept(ModItems.FLINT_AXE.get());
                    output.accept(ModItems.FLINT_SHOVEL.get());
                    output.accept(ModItems.FLINT_HOE.get());
                    output.accept(ModItems.FLINT_HELMET.get());
                    output.accept(ModItems.FLINT_CHESTPLATE.get());
                    output.accept(ModItems.FLINT_LEGGINGS.get());
                    output.accept(ModItems.FLINT_BOOTS.get());
                    output.accept(ModItems.FLINT_SPEAR.get());
                }

                if (ModConfig.ENABLE_STONE_GEAR.get()) {
                    // === STONE TOOLS ===
                    output.accept(ModItems.STONE_SWORD.get());
                    output.accept(ModItems.STONE_PICKAXE.get());
                    output.accept(ModItems.STONE_AXE.get());
                    output.accept(ModItems.STONE_SHOVEL.get());
                    output.accept(ModItems.STONE_HOE.get());
                    output.accept(ModItems.STONE_HELMET.get());
                    output.accept(ModItems.STONE_CHESTPLATE.get());
                    output.accept(ModItems.STONE_LEGGINGS.get());
                    output.accept(ModItems.STONE_BOOTS.get());
                    output.accept(ModItems.STONE_SPEAR.get());
                }

                if (ModConfig.ENABLE_DEEPSLATE_GEAR.get()) {
                    // === DEEPSLATE TOOLS ===
                    output.accept(ModItems.DEEPSLATE_SWORD.get());
                    output.accept(ModItems.DEEPSLATE_PICKAXE.get());
                    output.accept(ModItems.DEEPSLATE_AXE.get());
                    output.accept(ModItems.DEEPSLATE_SHOVEL.get());
                    output.accept(ModItems.DEEPSLATE_HOE.get());
                    output.accept(ModItems.DEEPSLATE_HELMET.get());
                    output.accept(ModItems.DEEPSLATE_CHESTPLATE.get());
                    output.accept(ModItems.DEEPSLATE_LEGGINGS.get());
                    output.accept(ModItems.DEEPSLATE_BOOTS.get());
                    output.accept(ModItems.DEEPSLATE_SPEAR.get());
                }

                if (ModConfig.ENABLE_OBSIDIAN_GEAR.get()) {
                    // === OBSIDIAN TOOLS ===
                    output.accept(ModItems.OBSIDIAN_SWORD.get());
                    output.accept(ModItems.OBSIDIAN_PICKAXE.get());
                    output.accept(ModItems.OBSIDIAN_AXE.get());
                    output.accept(ModItems.OBSIDIAN_SHOVEL.get());
                    output.accept(ModItems.OBSIDIAN_HOE.get());
                    output.accept(ModItems.OBSIDIAN_HELMET.get());
                    output.accept(ModItems.OBSIDIAN_CHESTPLATE.get());
                    output.accept(ModItems.OBSIDIAN_LEGGINGS.get());
                    output.accept(ModItems.OBSIDIAN_BOOTS.get());
                    output.accept(ModItems.OBSIDIAN_SPEAR.get());
                }

                if (ModConfig.ENABLE_LEATHER_GEAR.get()) {
                    // === LEATHER TOOLS ===
                    output.accept(ModItems.LEATHER_SWORD.get());
                    output.accept(ModItems.LEATHER_PICKAXE.get());
                    output.accept(ModItems.LEATHER_AXE.get());
                    output.accept(ModItems.LEATHER_SHOVEL.get());
                    output.accept(ModItems.LEATHER_HOE.get());
                    output.accept(ModItems.LEATHER_HELMET.get());
                    output.accept(ModItems.LEATHER_CHESTPLATE.get());
                    output.accept(ModItems.LEATHER_LEGGINGS.get());
                    output.accept(ModItems.LEATHER_BOOTS.get());
                    output.accept(ModItems.LEATHER_SPEAR.get());
                }

                if (ModConfig.ENABLE_CHAIN_GEAR.get()) {
                    // === CHAIN TOOLS ===
                    output.accept(ModItems.CHAIN_SWORD.get());
                    output.accept(ModItems.CHAIN_PICKAXE.get());
                    output.accept(ModItems.CHAIN_AXE.get());
                    output.accept(ModItems.CHAIN_SHOVEL.get());
                    output.accept(ModItems.CHAIN_HOE.get());
                    output.accept(ModItems.CHAIN_HELMET.get());
                    output.accept(ModItems.CHAIN_CHESTPLATE.get());
                    output.accept(ModItems.CHAIN_LEGGINGS.get());
                    output.accept(ModItems.CHAIN_BOOTS.get());
                    output.accept(ModItems.CHAIN_SPEAR.get());
                }

                if (ModConfig.ENABLE_REDSTONE_GEAR.get()) {
                    // === REDSTONE TOOLS ===
                    output.accept(ModItems.REDSTONE_SWORD.get());
                    output.accept(ModItems.REDSTONE_PICKAXE.get());
                    output.accept(ModItems.REDSTONE_AXE.get());
                    output.accept(ModItems.REDSTONE_SHOVEL.get());
                    output.accept(ModItems.REDSTONE_HOE.get());
                    output.accept(ModItems.REDSTONE_HELMET.get());
                    output.accept(ModItems.REDSTONE_CHESTPLATE.get());
                    output.accept(ModItems.REDSTONE_LEGGINGS.get());
                    output.accept(ModItems.REDSTONE_BOOTS.get());
                    output.accept(ModItems.REDSTONE_SPEAR.get());
                }

                if (ModConfig.ENABLE_LAPIS_GEAR.get()) {
                    // === LAPIS TOOLS ===
                    output.accept(ModItems.LAPIS_SWORD.get());
                    output.accept(ModItems.LAPIS_PICKAXE.get());
                    output.accept(ModItems.LAPIS_AXE.get());
                    output.accept(ModItems.LAPIS_SHOVEL.get());
                    output.accept(ModItems.LAPIS_HOE.get());
                    output.accept(ModItems.LAPIS_HELMET.get());
                    output.accept(ModItems.LAPIS_CHESTPLATE.get());
                    output.accept(ModItems.LAPIS_LEGGINGS.get());
                    output.accept(ModItems.LAPIS_BOOTS.get());
                    output.accept(ModItems.LAPIS_SPEAR.get());
                }

                if (ModConfig.ENABLE_GOLD_GEAR.get()) {
                    // === GOLD TOOLS ===
                    output.accept(ModItems.GOLD_SWORD.get());
                    output.accept(ModItems.GOLD_PICKAXE.get());
                    output.accept(ModItems.GOLD_AXE.get());
                    output.accept(ModItems.GOLD_SHOVEL.get());
                    output.accept(ModItems.GOLD_HOE.get());
                    output.accept(ModItems.GOLD_HELMET.get());
                    output.accept(ModItems.GOLD_CHESTPLATE.get());
                    output.accept(ModItems.GOLD_LEGGINGS.get());
                    output.accept(ModItems.GOLD_BOOTS.get());
                    output.accept(ModItems.GOLD_SPEAR.get());
                }

                if (ModConfig.ENABLE_COPPER_GEAR.get()) {
                    // === COPPER TOOLS ===
                    output.accept(ModItems.COPPER_SWORD.get());
                    output.accept(ModItems.COPPER_PICKAXE.get());
                    output.accept(ModItems.COPPER_AXE.get());
                    output.accept(ModItems.COPPER_SHOVEL.get());
                    output.accept(ModItems.COPPER_HOE.get());
                    output.accept(ModItems.COPPER_HELMET.get());
                    output.accept(ModItems.COPPER_CHESTPLATE.get());
                    output.accept(ModItems.COPPER_LEGGINGS.get());
                    output.accept(ModItems.COPPER_BOOTS.get());
                    output.accept(ModItems.COPPER_SPEAR.get());
                }

                if (ModConfig.ENABLE_QUARTZ_GEAR.get()) {
                    // === QUARTZ TOOLS ===
                    output.accept(ModItems.QUARTZ_SWORD.get());
                    output.accept(ModItems.QUARTZ_PICKAXE.get());
                    output.accept(ModItems.QUARTZ_AXE.get());
                    output.accept(ModItems.QUARTZ_SHOVEL.get());
                    output.accept(ModItems.QUARTZ_HOE.get());
                    output.accept(ModItems.QUARTZ_HELMET.get());
                    output.accept(ModItems.QUARTZ_CHESTPLATE.get());
                    output.accept(ModItems.QUARTZ_LEGGINGS.get());
                    output.accept(ModItems.QUARTZ_BOOTS.get());
                    output.accept(ModItems.QUARTZ_SPEAR.get());
                }

                if (ModConfig.ENABLE_CARBON_FIBER_GEAR.get()) {
                    // === CARBON FIBER TOOLS ===
                    output.accept(ModItems.CARBON_FIBER_SWORD.get());
                    output.accept(ModItems.CARBON_FIBER_PICKAXE.get());
                    output.accept(ModItems.CARBON_FIBER_AXE.get());
                    output.accept(ModItems.CARBON_FIBER_SHOVEL.get());
                    output.accept(ModItems.CARBON_FIBER_HOE.get());
                    output.accept(ModItems.CARBON_FIBER_HELMET.get());
                    output.accept(ModItems.CARBON_FIBER_CHESTPLATE.get());
                    output.accept(ModItems.CARBON_FIBER_LEGGINGS.get());
                    output.accept(ModItems.CARBON_FIBER_BOOTS.get());
                    output.accept(ModItems.CARBON_FIBER_SPEAR.get());
                }

                if (ModConfig.ENABLE_IRON_GEAR.get()) {
                    // === IRON TOOLS ===
                    output.accept(ModItems.IRON_SWORD.get());
                    output.accept(ModItems.IRON_PICKAXE.get());
                    output.accept(ModItems.IRON_AXE.get());
                    output.accept(ModItems.IRON_SHOVEL.get());
                    output.accept(ModItems.IRON_HOE.get());
                    output.accept(ModItems.IRON_HELMET.get());
                    output.accept(ModItems.IRON_CHESTPLATE.get());
                    output.accept(ModItems.IRON_LEGGINGS.get());
                    output.accept(ModItems.IRON_BOOTS.get());
                    output.accept(ModItems.IRON_SPEAR.get());
                }

                if (ModConfig.ENABLE_AMETHYST_GEAR.get()) {
                    // === AMETHYST TOOLS ===
                    output.accept(ModItems.AMETHYST_SWORD.get());
                    output.accept(ModItems.AMETHYST_PICKAXE.get());
                    output.accept(ModItems.AMETHYST_AXE.get());
                    output.accept(ModItems.AMETHYST_SHOVEL.get());
                    output.accept(ModItems.AMETHYST_HOE.get());
                    output.accept(ModItems.AMETHYST_HELMET.get());
                    output.accept(ModItems.AMETHYST_CHESTPLATE.get());
                    output.accept(ModItems.AMETHYST_LEGGINGS.get());
                    output.accept(ModItems.AMETHYST_BOOTS.get());
                    output.accept(ModItems.AMETHYST_SPEAR.get());
                }

                if (ModConfig.ENABLE_EMERALD_GEAR.get()) {
                    // === EMERALD TOOLS ===
                    output.accept(ModItems.EMERALD_SWORD.get());
                    output.accept(ModItems.EMERALD_PICKAXE.get());
                    output.accept(ModItems.EMERALD_AXE.get());
                    output.accept(ModItems.EMERALD_SHOVEL.get());
                    output.accept(ModItems.EMERALD_HOE.get());
                    output.accept(ModItems.EMERALD_HELMET.get());
                    output.accept(ModItems.EMERALD_CHESTPLATE.get());
                    output.accept(ModItems.EMERALD_LEGGINGS.get());
                    output.accept(ModItems.EMERALD_BOOTS.get());
                    output.accept(ModItems.EMERALD_SPEAR.get());
                }

                if (ModConfig.ENABLE_DIAMOND_GEAR.get()) {
                    // === DIAMOND TOOLS ===
                    output.accept(ModItems.DIAMOND_SWORD.get());
                    output.accept(ModItems.DIAMOND_PICKAXE.get());
                    output.accept(ModItems.DIAMOND_AXE.get());
                    output.accept(ModItems.DIAMOND_SHOVEL.get());
                    output.accept(ModItems.DIAMOND_HOE.get());
                    output.accept(ModItems.DIAMOND_HELMET.get());
                    output.accept(ModItems.DIAMOND_CHESTPLATE.get());
                    output.accept(ModItems.DIAMOND_LEGGINGS.get());
                    output.accept(ModItems.DIAMOND_BOOTS.get());
                    output.accept(ModItems.DIAMOND_SPEAR.get());
                }

                if (ModConfig.ENABLE_ECHO_GEAR.get()) {
                    // === ECHO TOOLS ===
                    output.accept(ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get());
                    output.accept(ModItems.ECHO_SWORD.get());
                    output.accept(ModItems.ECHO_PICKAXE.get());
                    output.accept(ModItems.ECHO_AXE.get());
                    output.accept(ModItems.ECHO_SHOVEL.get());
                    output.accept(ModItems.ECHO_HOE.get());
                    output.accept(ModItems.ECHO_HELMET.get());
                    output.accept(ModItems.ECHO_CHESTPLATE.get());
                    output.accept(ModItems.ECHO_LEGGINGS.get());
                    output.accept(ModItems.ECHO_BOOTS.get());
                    output.accept(ModItems.ECHO_SPEAR.get());
                }

                if (ModConfig.ENABLE_NETHERITE_GEAR.get()) {
                    // === NETHERITE TOOLS ===
                    output.accept(ModItems.NETHERITE_SWORD.get());
                    output.accept(ModItems.NETHERITE_PICKAXE.get());
                    output.accept(ModItems.NETHERITE_AXE.get());
                    output.accept(ModItems.NETHERITE_SHOVEL.get());
                    output.accept(ModItems.NETHERITE_HOE.get());
                    output.accept(ModItems.NETHERITE_HELMET.get());
                    output.accept(ModItems.NETHERITE_CHESTPLATE.get());
                    output.accept(ModItems.NETHERITE_LEGGINGS.get());
                    output.accept(ModItems.NETHERITE_BOOTS.get());
                    output.accept(ModItems.NETHERITE_SPEAR.get());
                }
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

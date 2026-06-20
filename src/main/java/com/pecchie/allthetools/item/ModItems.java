package com.pecchie.allthetools.item;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.item.armor.*;
import com.pecchie.allthetools.item.tool.CustomEchoToolItem;
import com.pecchie.allthetools.item.tool.CustomLeatherToolItem;
import com.pecchie.allthetools.item.tool.CustomSpearItem;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AllTheTools.MODID);

    // === WOOD TOOLS (OAK) ===
    public static final DeferredItem<Item> OAK_WOOD_SWORD = ITEMS.register("oak_wood_sword",
            () -> new SwordItem(ModToolTiers.WOOD, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.WOOD, 3, -2.4F))));
    
    public static final DeferredItem<Item> OAK_WOOD_PICKAXE = ITEMS.register("oak_wood_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WOOD, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.WOOD, 1, -2.8F))));

    public static final DeferredItem<Item> OAK_WOOD_AXE = ITEMS.register("oak_wood_axe",
            () -> new AxeItem(ModToolTiers.WOOD, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.WOOD, 6.0F, -3.2F))));

    public static final DeferredItem<Item> OAK_WOOD_SHOVEL = ITEMS.register("oak_wood_shovel",
            () -> new ShovelItem(ModToolTiers.WOOD, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.WOOD, 1.5F, -3.0F))));

    public static final DeferredItem<Item> OAK_WOOD_HOE = ITEMS.register("oak_wood_hoe",
            () -> new HoeItem(ModToolTiers.WOOD, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.WOOD, -2, -1.0F))));

    // === SPECIAL ITEMS ===
    public static final DeferredItem<Item> CARBON_FIBER_INGOT = ITEMS.register("carbon_fiber_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ECHO_ARMOR_TRIM_SMITHING_TEMPLATE = ITEMS.register("echo_armor_trim_smithing_template",
            () -> new Item(new Item.Properties()));

    // === ARMOR ===
    public static final DeferredItem<ArmorItem> REDSTONE_HELMET = ITEMS.register("redstone_helmet",
            () -> new CustomRedstoneArmorItem(ModArmorMaterials.REDSTONE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final DeferredItem<ArmorItem> LAPIS_HELMET = ITEMS.register("lapis_helmet",
            () -> new CustomLapisArmorItem(ModArmorMaterials.LAPIS, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final DeferredItem<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new CustomEmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final DeferredItem<ArmorItem> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",
            () -> new CustomObsidianArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final DeferredItem<ArmorItem> ECHO_HELMET = ITEMS.register("echo_helmet",
            () -> new CustomEchoArmorItem(ModArmorMaterials.ECHO, ArmorItem.Type.HELMET, new Item.Properties()));

    // (Nota: Per brevità ho aggiornato solo alcuni oggetti chiave, nel repository caricherò la versione completa)

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

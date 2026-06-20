package com.pecchie.allthetools.item;

import com.pecchie.allthetools.AllTheTools;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, AllTheTools.MODID);

    public static final Holder<ArmorMaterial> OAK = register("oak", 5, 1, 2, 3, 1, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.OAK_LOG));
    public static final Holder<ArmorMaterial> SPRUCE = register("spruce", 5, 1, 2, 3, 1, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.SPRUCE_LOG));
    public static final Holder<ArmorMaterial> BIRCH = register("birch", 5, 1, 2, 3, 1, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.BIRCH_LOG));
    public static final Holder<ArmorMaterial> JUNGLE = register("jungle", 5, 1, 2, 3, 1, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.JUNGLE_LOG));
    public static final Holder<ArmorMaterial> ACACIA = register("acacia", 5, 1, 2, 3, 1, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.ACACIA_LOG));
    public static final Holder<ArmorMaterial> DARK_OAK = register("dark_oak", 5, 1, 2, 3, 1, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.DARK_OAK_LOG));
    public static final Holder<ArmorMaterial> MANGROVE = register("mangrove", 5, 1, 2, 3, 1, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.MANGROVE_LOG));
    public static final Holder<ArmorMaterial> CHERRY = register("cherry", 5, 1, 2, 3, 1, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.CHERRY_LOG));
    public static final Holder<ArmorMaterial> BAMBOO = register("bamboo", 5, 1, 2, 3, 1, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.BAMBOO_BLOCK));
    public static final Holder<ArmorMaterial> CRIMSON = register("crimson", 5, 1, 2, 3, 1, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.CRIMSON_STEM));
    public static final Holder<ArmorMaterial> WARPED = register("warped", 5, 1, 2, 3, 1, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.WARPED_STEM));

    public static final Holder<ArmorMaterial> FLINT = register("flint", 8, 1, 3, 4, 2, 10, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.FLINT));
    public static final Holder<ArmorMaterial> STONE = register("stone", 10, 1, 3, 4, 2, 5, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.COBBLESTONE));
    public static final Holder<ArmorMaterial> DEEPSLATE = register("deepslate", 12, 2, 4, 5, 2, 5, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.COBBLED_DEEPSLATE));
    public static final Holder<ArmorMaterial> OBSIDIAN = register("obsidian", 40, 3, 6, 8, 3, 5, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.of(Items.OBSIDIAN));
    public static final Holder<ArmorMaterial> LEATHER = register("leather_mod", 5, 1, 2, 3, 1, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.of(Items.LEATHER));
    public static final Holder<ArmorMaterial> CHAIN = register("chain_mod", 15, 2, 4, 5, 2, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> Ingredient.of(Items.CHAIN));
    public static final Holder<ArmorMaterial> COPPER = register("copper", 15, 2, 4, 5, 2, 12, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(Items.COPPER_INGOT));
    public static final Holder<ArmorMaterial> REDSTONE = register("redstone", 18, 2, 5, 6, 2, 14, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.REDSTONE));
    public static final Holder<ArmorMaterial> LAPIS = register("lapis", 20, 2, 5, 6, 2, 20, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.LAPIS_LAZULI));
    public static final Holder<ArmorMaterial> QUARTZ = register("quartz", 25, 2, 5, 7, 2, 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.QUARTZ));
    public static final Holder<ArmorMaterial> CARBON_FIBER = register("carbon_fiber", 30, 3, 6, 8, 3, 15, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, 0.0F, () -> Ingredient.of(Items.COAL));
    public static final Holder<ArmorMaterial> AMETHYST = register("amethyst", 32, 3, 6, 8, 3, 20, SoundEvents.ARMOR_EQUIP_GENERIC, 1.0F, 0.0F, () -> Ingredient.of(Items.AMETHYST_SHARD));
    public static final Holder<ArmorMaterial> EMERALD = register("emerald", 35, 3, 7, 9, 4, 25, SoundEvents.ARMOR_EQUIP_GENERIC, 2.0F, 0.0F, () -> Ingredient.of(Items.EMERALD));
    public static final Holder<ArmorMaterial> ECHO = register("echo", 45, 4, 7, 9, 4, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F, () -> Ingredient.of(Items.ECHO_SHARD));

    private static Holder<ArmorMaterial> register(String name, int durabilityMultiplier, int boots, int leggings, int chestplate, int helmet, int enchantability, Holder<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        EnumMap<ArmorItem.Type, Integer> protectionAmounts = new EnumMap<>(ArmorItem.Type.class);
        protectionAmounts.put(ArmorItem.Type.BOOTS, boots);
        protectionAmounts.put(ArmorItem.Type.LEGGINGS, leggings);
        protectionAmounts.put(ArmorItem.Type.CHESTPLATE, chestplate);
        protectionAmounts.put(ArmorItem.Type.HELMET, helmet);
        
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(AllTheTools.MODID, name)));
        return ARMOR_MATERIALS.register(name, () -> new ArmorMaterial(protectionAmounts, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance));
    }
}

package com.pecchie.allthetools.item;

import com.pecchie.allthetools.AllTheTools;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    // Ordine di potenza: Legno<flint<pietra<deepslate<ossidiana<cuoio<redstone<lapis<oro<rame<quarzo<maglia<carbon fiber<ferro<ametista<smeraldo<diamante<eco<netherite

    WOOD("wood", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_WOOD, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.OAK_LOG)),
    SPRUCE_WOOD("spruce_wood", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_WOOD, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.SPRUCE_LOG)),
    BIRCH_WOOD("birch_wood", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_WOOD, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.BIRCH_LOG)),
    JUNGLE_WOOD("jungle_wood", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_WOOD, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.JUNGLE_LOG)),
    ACACIA_WOOD("acacia_wood", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_WOOD, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.ACACIA_LOG)),
    DARK_OAK_WOOD("dark_oak_wood", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_WOOD, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.DARK_OAK_LOG)),
    MANGROVE_WOOD("mangrove_wood", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_WOOD, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.MANGROVE_LOG)),
    CHERRY_WOOD("cherry_wood", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_WOOD, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.CHERRY_LOG)),
    BAMBOO_WOOD("bamboo_wood", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_WOOD, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.BAMBOO_BLOCK)),
    CRIMSON_WOOD("crimson_wood", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_WOOD, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.CRIMSON_STEM)),
    WARPED_WOOD("warped_wood", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_WOOD, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.WARPED_STEM)),

    FLINT("flint", 8, new int[]{1, 3, 4, 2}, 10, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.FLINT)),
    STONE("stone", 10, new int[]{1, 3, 5, 2}, 9, SoundEvents.ARMOR_EQUIP_STONE, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.COBBLESTONE)),
    DEEPSLATE("deepslate", 12, new int[]{2, 4, 5, 2}, 10, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.COBBLED_DEEPSLATE)),
    OBSIDIAN("obsidian", 40, new int[]{3, 6, 8, 3}, 5, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.of(net.minecraft.world.item.Items.OBSIDIAN)),
    LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.LEATHER)),
    CHAIN("chain", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.IRON_INGOT)),
    REDSTONE("redstone", 18, new int[]{2, 5, 6, 2}, 14, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.REDSTONE)),
    LAPIS("lapis", 20, new int[]{2, 5, 6, 2}, 20, SoundEvents.ARMOR_EQUIP_LAPIS, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.LAPIS_LAZULI)),
    GOLD("gold", 25, new int[]{2, 5, 7, 3}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.GOLD_INGOT)),
    COPPER("copper", 10, new int[]{1, 3, 4, 1}, 18, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.COPPER_INGOT)),
    QUARTZ("quartz", 22, new int[]{2, 5, 7, 2}, 16, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.QUARTZ)),
    CARBON_FIBER("carbon_fiber", 28, new int[]{3, 6, 7, 3}, 10, SoundEvents.ARMOR_EQUIP_GENERIC, 1.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.COAL)),
    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.IRON_INGOT)),
    AMETHYST("amethyst", 30, new int[]{3, 6, 8, 3}, 22, SoundEvents.ARMOR_EQUIP_GENERIC, 1.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.AMETHYST_SHARD)),
    EMERALD("emerald", 35, new int[]{3, 7, 9, 4}, 25, SoundEvents.ARMOR_EQUIP_GENERIC, 2.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.EMERALD)),
    DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(net.minecraft.world.item.Items.DIAMOND)),
    ECHO("echo", 45, new int[]{4, 7, 9, 4}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F, () -> Ingredient.of(net.minecraft.world.item.Items.ECHO_SHARD));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getSlot().getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionAmounts[type.getSlot().getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return AllTheTools.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public String getSerializedName() {
        return AllTheTools.MODID + ":" + this.name;
    }
}

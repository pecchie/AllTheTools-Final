package com.pecchie.allthetools.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.Level;
import com.pecchie.allthetools.config.ModConfig;

public class CustomObsidianArmorItem extends ArmorItem {
    public CustomObsidianArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, net.minecraft.world.entity.Player player) {
        if (ModConfig.ENABLE_OBSIDIAN_ARMOR_EFFECT.get() && !level.isClientSide()) {
            if (player.getItemBySlot(Type.HELMET.getSlot()).getItem() == this &&
                player.getItemBySlot(Type.CHESTPLATE.getSlot()).getItem() == this &&
                player.getItemBySlot(Type.LEGGINGS.getSlot()).getItem() == this &&
                player.getItemBySlot(Type.BOOTS.getSlot()).getItem() == this) {
                // Full Obsidian Armor: Fire Protection 1 integrated
                // This is a simplified representation. Actual Fire Protection is handled by attributes or events.
                // For demonstration, we can apply a temporary fire resistance effect.
                // A proper implementation would involve overriding getDamageProtection or handling damage events.
                if (player.isOnFire()) {
                    player.extinguishFire();
                }
            }
        }
    }
}

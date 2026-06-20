package com.pecchie.allthetools.item.armor;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import java.util.List;
import com.pecchie.allthetools.config.ModConfig;

public class CustomRedstoneArmorItem extends ArmorItem {
    public CustomRedstoneArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    public static boolean hasFullSuit(LivingEntity entity) {
        ItemStack helmet = entity.getInventory().getArmor(3);
        ItemStack chestplate = entity.getInventory().getArmor(2);
        ItemStack leggings = entity.getInventory().getArmor(1);
        ItemStack boots = entity.getInventory().getArmor(0);

        return helmet.getItem() instanceof CustomRedstoneArmorItem &&
               chestplate.getItem() instanceof CustomRedstoneArmorItem &&
               leggings.getItem() instanceof CustomRedstoneArmorItem &&
               boots.getItem() instanceof CustomRedstoneArmorItem;
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, net.minecraft.world.entity.Player player) {
        if (ModConfig.ENABLE_REDSTONE_ARMOR_EFFECT.get() && !level.isClientSide() && hasFullSuit(player)) {
            // Applica un effetto luminoso alle entità vicine
            double radius = 5.0; // Raggio dell'effetto
            AABB boundingBox = player.getBoundingBox().inflate(radius);
            List<LivingEntity> nearbyEntities = level.getEntitiesOfClass(LivingEntity.class, boundingBox, (entity) -> entity != player);

            for (LivingEntity entity : nearbyEntities) {
                if (!entity.hasEffect(MobEffects.GLOWING)) {
                    entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 40, 0, false, false)); // 2 secondi di glowing
                }
            }
        }
    }
}

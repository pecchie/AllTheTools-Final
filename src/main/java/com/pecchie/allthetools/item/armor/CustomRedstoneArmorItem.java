package com.pecchie.allthetools.item.armor;

import com.pecchie.allthetools.config.ModConfig;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class CustomRedstoneArmorItem extends ArmorItem {
    public CustomRedstoneArmorItem(Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (!level.isClientSide && entity instanceof Player player) {
            if (ModConfig.ENABLE_REDSTONE_ARMOR_EFFECT.get() && hasFullSuit(player)) {
                AABB area = player.getBoundingBox().inflate(5.0D);
                List<LivingEntity> entities = level.getEntitiesOfClass(LivingEntity.class, area);
                for (LivingEntity target : entities) {
                    if (target != player) {
                        target.addEffect(new MobEffectInstance(MobEffects.GLOWING, 20, 0, false, false));
                    }
                }
            }
        }
    }

    public static boolean hasFullSuit(Player player) {
        for (ItemStack armorStack : player.getArmorSlots()) {
            if (!(armorStack.getItem() instanceof CustomRedstoneArmorItem)) {
                return false;
            }
        }
        return true;
    }
}

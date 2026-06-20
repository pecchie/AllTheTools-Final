package com.pecchie.allthetools.item.armor;

import com.pecchie.allthetools.config.ModConfig;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CustomObsidianArmorItem extends ArmorItem {
    public CustomObsidianArmorItem(Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (!level.isClientSide && entity instanceof Player player) {
            if (ModConfig.ENABLE_OBSIDIAN_ARMOR_EFFECT.get() && hasFullSuit(player)) {
                if (player.isOnFire()) {
                    player.extinguishFire();
                }
            }
        }
    }

    public static boolean hasFullSuit(Player player) {
        for (ItemStack armorStack : player.getArmorSlots()) {
            if (!(armorStack.getItem() instanceof CustomObsidianArmorItem)) {
                return false;
            }
        }
        return true;
    }
}

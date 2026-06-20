package com.pecchie.allthetools.item.armor;

import com.pecchie.allthetools.config.ModConfig;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CustomEchoArmorItem extends ArmorItem {
    public CustomEchoArmorItem(Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (!level.isClientSide && entity instanceof Player player) {
            if (ModConfig.ENABLE_ECHO_ARMOR_EFFECT.get() && hasFullSuit(player)) {
                // Logica aggiuntiva se necessaria
            }
        }
    }

    public static boolean hasFullSuit(Player player) {
        for (ItemStack armorStack : player.getArmorSlots()) {
            if (!(armorStack.getItem() instanceof CustomEchoArmorItem)) {
                return false;
            }
        }
        return true;
    }
}

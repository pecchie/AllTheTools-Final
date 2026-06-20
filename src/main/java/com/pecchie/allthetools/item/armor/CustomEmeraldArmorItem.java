package com.pecchie.allthetools.item.armor;

import net.minecraft.core.Holder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CustomEmeraldArmorItem extends ArmorItem {
    public CustomEmeraldArmorItem(Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (!level.isClientSide && entity instanceof Player player) {
            if (hasFullSuit(player)) {
                // Logica aggiuntiva gestita da EventHandler
            }
        }
    }

    public static boolean hasFullSuit(Player player) {
        for (ItemStack armorStack : player.getArmorSlots()) {
            if (!(armorStack.getItem() instanceof CustomEmeraldArmorItem)) {
                return false;
            }
        }
        return true;
    }
}

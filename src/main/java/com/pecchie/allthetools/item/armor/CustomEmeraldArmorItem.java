package com.pecchie.allthetools.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class CustomEmeraldArmorItem extends ArmorItem {
    public CustomEmeraldArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    public static boolean hasFullSuit(Player player) {
        ItemStack helmet = player.getInventory().getArmor(3);
        ItemStack chestplate = player.getInventory().getArmor(2);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack boots = player.getInventory().getArmor(0);

        return helmet.getItem() instanceof CustomEmeraldArmorItem &&
               chestplate.getItem() instanceof CustomEmeraldArmorItem &&
               leggings.getItem() instanceof CustomEmeraldArmorItem &&
               boots.getItem() instanceof CustomEmeraldArmorItem;
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, net.minecraft.world.entity.Player player) {
        if (!level.isClientSide()) {
            if (hasFullSuit(player)) {
                // L'effetto di riduzione del prezzo dei villager sarà gestito tramite un EventHandler
                // che intercetta gli scambi con i villager.
            }
        }
    }
}

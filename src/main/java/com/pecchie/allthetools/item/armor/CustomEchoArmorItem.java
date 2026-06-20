package com.pecchie.allthetools.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import com.pecchie.allthetools.config.ModConfig;

public class CustomEchoArmorItem extends ArmorItem {
    public CustomEchoArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    public static boolean hasFullSuit(Player player) {
        ItemStack helmet = player.getInventory().getArmor(3);
        ItemStack chestplate = player.getInventory().getArmor(2);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack boots = player.getInventory().getArmor(0);

        return helmet.getItem() instanceof CustomEchoArmorItem &&
               chestplate.getItem() instanceof CustomEchoArmorItem &&
               leggings.getItem() instanceof CustomEchoArmorItem &&
               boots.getItem() instanceof CustomEchoArmorItem;
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, net.minecraft.world.entity.Player player) {
        if (ModConfig.ENABLE_ECHO_ARMOR_EFFECT.get() && !level.isClientSide()) {
            if (hasFullSuit(player)) {
                // L'effetto di silenzio per Warden e sensori Sculk sarà gestito tramite un EventHandler
                // che intercetta gli eventi di suono o di rilevamento.
                // Questa classe ArmorItem si occupa solo di definire l'oggetto.
            }
        }
    }
}

package com.pecchie.allthetools.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.event.AnvilRepairEvent;
import net.neoforged.neoforge.event.entity.player.PlayerContainerEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import com.pecchie.allthetools.AllTheTools;

@Mod.EventBusSubscriber(modid = AllTheTools.MODID)
public class CustomLapisArmorItem extends ArmorItem {
    public CustomLapisArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    public static boolean hasFullSuit(Player player) {
        ItemStack helmet = player.getInventory().getArmor(3);
        ItemStack chestplate = player.getInventory().getArmor(2);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack boots = player.getInventory().getArmor(0);

        return helmet.getItem() instanceof CustomLapisArmorItem &&
               chestplate.getItem() instanceof CustomLapisArmorItem &&
               leggings.getItem() instanceof CustomLapisArmorItem &&
               boots.getItem() instanceof CustomLapisArmorItem;
    }

    // L'implementazione per dimezzare l'XP richiesto per gli incantesimi e il costo dell'incudine
    // richiede l'intercettazione di eventi specifici, che verranno gestiti in una classe EventHandlers.
    // Questa classe ArmorItem si occupa solo di definire l'oggetto.
}

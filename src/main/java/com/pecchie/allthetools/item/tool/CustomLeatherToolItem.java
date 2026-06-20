package com.pecchie.allthetools.item.tool;

import net.minecraft.world.item.DyeableLeatherItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;

public class CustomLeatherToolItem extends SwordItem implements DyeableLeatherItem {

    public CustomLeatherToolItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Item.Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    // Implementazione di DyeableLeatherItem per rendere lo strumento colorabile
    // Il colore predefinito è bianco (0xFFFFFF) se non specificato
    // La logica di colorazione sarà gestita da Minecraft stesso per gli oggetti DyeableLeatherItem
}

package com.pecchie.allthetools.item.tool;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class CustomEchoToolItem extends PickaxeItem {
    public CustomEchoToolItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Item.Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    // Questa classe servirà come marcatore per gli strumenti Echo.
    // La logica per il silenziamento del rumore sarà gestita in un EventHandler.
}

package com.pecchie.allthetools.item.tool;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.tags.BlockTags;

public class CustomSpearItem extends SwordItem {

    public CustomSpearItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Item.Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public float getDestroySpeed(ItemStack pStack, BlockState pState) {
        // Le lance non sono strumenti primari per la rottura dei blocchi, ma possono rompere alcuni blocchi.
        // Ad esempio, ragnatele o foglie.
        if (pState.is(Blocks.COBWEB)) {
            return 15.0F; // Velocità elevata per le ragnatele
        } else if (pState.is(BlockTags.LEAVES) || pState.is(BlockTags.WOOL)) {
            return 5.0F; // Velocità moderata per foglie e lana
        } else {
            return super.getDestroySpeed(pStack, pState); // Velocità predefinita per gli altri blocchi
        }
    }

    @Override
    public boolean isCorrectToolForDrops(ItemStack stack, BlockState state) {
        // Le lance non sono lo strumento corretto per la maggior parte dei blocchi, ma possono essere usate per alcuni.
        return state.is(Blocks.COBWEB) || super.isCorrectToolForDrops(stack, state);
    }
}

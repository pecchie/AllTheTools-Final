package com.pecchie.allthetools.loot;

import com.pecchie.allthetools.AllTheTools;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModLootModifiers {
    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, AllTheTools.MODID);

    public static class AddItemModifier extends LootModifier {
        public static final MapCodec<AddItemModifier> CODEC = RecordCodecBuilder.mapCodec(inst ->
                LootModifier.codecStart(inst).and(ItemStack.CODEC.fieldOf("item").forGetter(m -> m.item))
                        .apply(inst, AddItemModifier::new));

        private final ItemStack item;

        public AddItemModifier(LootItemCondition[] conditionsIn, ItemStack item) {
            super(conditionsIn);
            this.item = item;
        }

        @Override
        protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
            generatedLoot.add(item.copy());
            return generatedLoot;
        }

        @Override
        public MapCodec<? extends IGlobalLootModifier> codec() {
            return CODEC;
        }
    }
}

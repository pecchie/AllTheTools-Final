package com.pecchie.allthetools;

import com.mojang.logging.LogUtils;
import com.pecchie.allthetools.item.ModCreativeTabs;
import com.pecchie.allthetools.item.ModItems;
import com.pecchie.allthetools.loot.ModLootModifiers;
import net.neoforged.bus.api.IEventBus;
import com.pecchie.allthetools.config.ModConfig;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig.Type;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;

@Mod(AllTheTools.MODID)
public class AllTheTools {
    public static final String MODID = "allthetools";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AllTheTools(IEventBus modEventBus) {
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
        ModLootModifiers.LOOT_MODIFIER_SERIALIZERS.register(modEventBus);

        ModLoadingContext.get().registerConfig(Type.COMMON, ModConfig.SPEC, "allthetools-common.toml");

        LOGGER.info("AllTheTools inizializzato!");

        NeoForge.EVENT_BUS.register(this);
    }
}

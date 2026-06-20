package com.pecchie.allthetools;

import com.mojang.logging.LogUtils;
import com.pecchie.allthetools.config.ModConfig;
import com.pecchie.allthetools.item.ModCreativeTabs;
import com.pecchie.allthetools.item.ModItems;
import com.pecchie.allthetools.item.ModArmorMaterials;
import com.pecchie.allthetools.loot.ModLootModifiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig.Type;
import org.slf4j.Logger;

@Mod(AllTheTools.MODID)
public class AllTheTools {
    public static final String MODID = "allthetools";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AllTheTools(IEventBus modEventBus, ModContainer container) {
        ModItems.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);
        ModArmorMaterials.ARMOR_MATERIALS.register(modEventBus);
        ModLootModifiers.LOOT_MODIFIER_SERIALIZERS.register(modEventBus);

        container.registerConfig(Type.COMMON, ModConfig.SPEC, "allthetools-common.toml");

        LOGGER.info("AllTheTools inizializzato!");
    }
}

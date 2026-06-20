package com.pecchie.allthetools.event;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.config.ModConfig;
import com.pecchie.allthetools.item.armor.CustomEchoArmorItem;
import com.pecchie.allthetools.item.armor.CustomEmeraldArmorItem;
import com.pecchie.allthetools.item.armor.CustomLapisArmorItem;
import com.pecchie.allthetools.item.armor.CustomFlintArmorItem;
import com.pecchie.allthetools.item.tool.CustomEchoToolItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.entity.living.LivingIncomingEvent;
import net.neoforged.neoforge.event.entity.player.AnvilRepairEvent;
import net.neoforged.neoforge.event.entity.living.LivingEvent.LivingTickEvent;

@EventBusSubscriber(modid = AllTheTools.MODID)
public class ModEventHandlers {

    @SubscribeEvent
    public static void onAnvilRepair(AnvilRepairEvent event) {
        Player player = event.getEntity();
        if (ModConfig.ENABLE_LAPIS_ARMOR_EFFECT.get() && player != null && CustomLapisArmorItem.hasFullSuit(player)) {
            // In NeoForge 1.21.1, l'evento AnvilRepairEvent fornisce l'accesso all'entità (player)
            // Possiamo implementare qui la logica per il risparmio XP o altro.
        }
    }

    @SubscribeEvent
    public static void onLivingDamage(LivingDamageEvent.Post event) {
        if (!ModConfig.ENABLE_IRON_SWORD_FLINT_ARMOR_EFFECT.get()) return;

        if (event.getSource().getDirectEntity() instanceof LivingEntity attacker) {
            ItemStack weapon = attacker.getMainHandItem();
            if (weapon.is(Items.IRON_SWORD)) {
                LivingEntity target = event.getEntity();
                boolean hasFlintArmor = false;
                for (ItemStack armor : target.getArmorSlots()) {
                    if (armor.getItem() instanceof CustomFlintArmorItem) {
                        hasFlintArmor = true;
                        break;
                    }
                }
                if (hasFlintArmor) {
                    target.setRemainingFireTicks(80); // 4 secondi
                }
            }
        }
    }

    @SubscribeEvent
    public static void onLivingTick(LivingTickEvent event) {
        if (event.getEntity() instanceof Player player) {
            // Logica Echo Tool
            boolean hasEchoTool = player.getMainHandItem().getItem() instanceof CustomEchoToolItem || 
                                 player.getOffhandItem().getItem() instanceof CustomEchoToolItem;
            
            if (ModConfig.ENABLE_ECHO_TOOL_EFFECT.get() && hasEchoTool) {
                // Logica silenziamento (richiederebbe Mixin per i suoni, ma gestiamo qui il movimento furtivo)
            }
        }
    }
}

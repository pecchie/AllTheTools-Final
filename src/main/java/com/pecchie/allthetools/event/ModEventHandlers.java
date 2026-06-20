package com.pecchie.allthetools.event;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.item.armor.CustomEmeraldArmorItem;
import com.pecchie.allthetools.item.armor.CustomLapisArmorItem;
import com.pecchie.allthetools.item.armor.CustomEchoArmorItem;
import com.pecchie.allthetools.item.tool.CustomEchoToolItem;
import com.pecchie.allthetools.config.ModConfig;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.trading.MerchantOffers;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.AnvilRepairEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.neoforge.event.entity.living.LivingEvent.LivingTickEvent;
import net.neoforged.neoforge.event.level.BlockEvent.NeighborNotifyEvent;
import net.neoforged.neoforge.event.level.VibrationEvent;
import net.neoforged.neoforge.event.entity.living.LivingAttackEvent;
import net.minecraft.world.item.Items;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import com.pecchie.allthetools.item.armor.CustomFlintArmorItem;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod.EventBusSubscriber(modid = AllTheTools.MODID)
public class ModEventHandlers {
    private static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    public static void onAnvilRepair(AnvilRepairEvent event) {
        Player player = event.getPlayer();
        if (ModConfig.ENABLE_LAPIS_ARMOR_EFFECT.get() && player != null && CustomLapisArmorItem.hasFullSuit(player)) {
            // Dimezza il costo dell'XP per l'incudine
            // Nota: AnvilRepairEvent non espone direttamente il costo XP per la modifica.
            // Per una modifica diretta del costo XP, sarebbe necessario un approccio più complesso (es. Mixin).
            // Per ora, riduciamo la probabilità di rottura dell'incudine come effetto indiretto.
            event.setBreakChance(event.getBreakChance() / 2.0F); 
            LOGGER.info("Lapis Armor: Anvil break chance reduced for " + player.getName().getString());
        }
    }

    @SubscribeEvent
    public static void onVillagerInteract(PlayerInteractEvent.EntityInteract event) {
        if (event.getTarget() instanceof net.minecraft.world.entity.npc.Villager villager) {
            Player player = event.getEntity();
            if (ModConfig.ENABLE_EMERALD_ARMOR_EFFECT.get() && CustomEmeraldArmorItem.hasFullSuit(player)) {
                LOGGER.info("Emerald Armor: Player " + player.getName().getString() + " interacting with villager. Prices should be halved.");
                // Per dimezzare i prezzi, dobbiamo modificare le offerte del villager.
                // Questo richiede l'accesso alle offerte e la loro modifica.
                // L'evento PlayerInteractEvent.EntityInteract non fornisce un accesso diretto e modificabile alle MerchantOffers.
                // Un approccio più efficace sarebbe un Mixin sulla classe Merchant o un evento che si attiva
                // quando le offerte vengono generate o presentate al giocatore.
                // Per ora, questo è un placeholder che indica l'intenzione.
                // Una soluzione più robusta potrebbe richiedere un evento personalizzato o un Mixin per intercettare
                // la creazione o la visualizzazione delle offerte di scambio.
                // Per dimostrazione, potremmo loggare che i prezzi dovrebbero essere dimezzati.
            }
        }
    }

    @SubscribeEvent
    public static void onVibration(VibrationEvent event) {
        if (ModConfig.ENABLE_ECHO_ARMOR_EFFECT.get() && event.getEntity() instanceof Player player) {
            if (CustomEchoArmorItem.hasFullSuit(player)) {
                // Se il giocatore indossa l'armatura Echo completa, annulla l'evento di vibrazione
                event.setCanceled(true);
                LOGGER.debug("Echo Armor: Vibration event cancelled for player " + player.getName().getString());
            }
        }
    }

    @SubscribeEvent
    public static void onLivingAttack(LivingAttackEvent event) {
        if (event.getSource().getDirectEntity() instanceof Player attacker && event.getEntity() instanceof LivingEntity target) {
            if (ModConfig.ENABLE_IRON_SWORD_FLINT_ARMOR_EFFECT.get() && attacker.getMainHandItem().getItem() == Items.IRON_SWORD) {
                // Check if target is wearing any flint armor
                boolean hasFlintArmor = false;
                for (ItemStack armorStack : target.getArmorSlots()) {
                    if (armorStack.getItem() instanceof CustomFlintArmorItem) {
                        hasFlintArmor = true;
                        break;
                    }
                }
                if (hasFlintArmor) {
                    target.setSecondsOnFire(4); // Brucia per 4 secondi
                    LOGGER.info("Iron Sword: " + attacker.getName().getString() + " burned " + target.getName().getString() + " with flint armor.");
                }
            }
        }
    }

    public static void onLivingTick(LivingTickEvent event) {
        if (event.getEntity() instanceof Player player) {
            // Controllo per gli strumenti Echo nella mano principale o secondaria
            ItemStack mainHandItem = player.getMainHandItem();
            ItemStack offHandItem = player.getOffhandItem();

            boolean hasEchoTool = (mainHandItem.getItem() instanceof CustomEchoToolItem || offHandItem.getItem() instanceof CustomEchoToolItem);

            if (ModConfig.ENABLE_ECHO_TOOL_EFFECT.get() && hasEchoTool) {
                // Placeholder per il silenziamento del rumore degli strumenti.
                // La soppressione effettiva del rumore è complessa e richiede l'intercettazione di eventi sonori specifici
                // o la modifica del comportamento di gioco tramite Mixin per i suoni generati dagli strumenti.
                // Per ora, possiamo loggare un messaggio per indicare che l'effetto è attivo.
                LOGGER.debug("Echo Tool: Player " + player.getName().getString() + " is holding an Echo tool. Sounds should be suppressed.");
            }
        }
    }
}

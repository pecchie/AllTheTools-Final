package com.pecchie.allthetools.data;

import com.pecchie.allthetools.AllTheTools;
import com.pecchie.allthetools.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, AllTheTools.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        if (getName().endsWith("en_us")) {
            addEnUs();
        } else if (getName().endsWith("it_it")) {
            addItIt();
        }
    }

    private void addEnUs() {
        add("itemGroup.allthetools_tab", "AllTheTools");
        add(ModItems.CARBON_FIBER_INGOT.get(), "Carbon Fiber Ingot");
        add(ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get(), "Echo Smithing Template");

        // Wood (Oak)
        add(ModItems.OAK_WOOD_SWORD.get(), "Oak Wood Sword");
        add(ModItems.OAK_WOOD_PICKAXE.get(), "Oak Wood Pickaxe");
        add(ModItems.OAK_WOOD_AXE.get(), "Oak Wood Axe");
        add(ModItems.OAK_WOOD_SHOVEL.get(), "Oak Wood Shovel");
        add(ModItems.OAK_WOOD_HOE.get(), "Oak Wood Hoe");
        add(ModItems.OAK_WOOD_HELMET.get(), "Oak Wood Helmet");
        add(ModItems.OAK_WOOD_CHESTPLATE.get(), "Oak Wood Chestplate");
        add(ModItems.OAK_WOOD_LEGGINGS.get(), "Oak Wood Leggings");
        add(ModItems.OAK_WOOD_BOOTS.get(), "Oak Wood Boots");
        add(ModItems.OAK_WOOD_SHIELD.get(), "Oak Wood Shield");
        add(ModItems.WOOD_SPEAR.get(), "Wooden Spear");

        // Flint
        add(ModItems.FLINT_SWORD.get(), "Flint Sword");
        add(ModItems.FLINT_PICKAXE.get(), "Flint Pickaxe");
        add(ModItems.FLINT_AXE.get(), "Flint Axe");
        add(ModItems.FLINT_SHOVEL.get(), "Flint Shovel");
        add(ModItems.FLINT_HOE.get(), "Flint Hoe");
        add(ModItems.FLINT_HELMET.get(), "Flint Helmet");
        add(ModItems.FLINT_CHESTPLATE.get(), "Flint Chestplate");
        add(ModItems.FLINT_LEGGINGS.get(), "Flint Leggings");
        add(ModItems.FLINT_BOOTS.get(), "Flint Boots");
        add(ModItems.FLINT_SPEAR.get(), "Flint Spear");

        // Echo
        add(ModItems.ECHO_SWORD.get(), "Echo Sword");
        add(ModItems.ECHO_PICKAXE.get(), "Echo Pickaxe");
        add(ModItems.ECHO_AXE.get(), "Echo Axe");
        add(ModItems.ECHO_SHOVEL.get(), "Echo Shovel");
        add(ModItems.ECHO_HOE.get(), "Echo Hoe");
        add(ModItems.ECHO_HELMET.get(), "Echo Helmet");
        add(ModItems.ECHO_CHESTPLATE.get(), "Echo Chestplate");
        add(ModItems.ECHO_LEGGINGS.get(), "Echo Leggings");
        add(ModItems.ECHO_BOOTS.get(), "Echo Boots");
        add(ModItems.ECHO_SPEAR.get(), "Echo Spear");

        // Aggiungi qui gli altri materiali in modo simile...
    }

    private void addItIt() {
        add("itemGroup.allthetools_tab", "AllTheTools");
        add(ModItems.CARBON_FIBER_INGOT.get(), "Lingotto di Fibra di Carbone");
        add(ModItems.ECHO_ARMOR_TRIM_SMITHING_TEMPLATE.get(), "Template da Forgiatura Echo");

        // Legno (Quercia)
        add(ModItems.OAK_WOOD_SWORD.get(), "Spada di Legno di Quercia");
        add(ModItems.OAK_WOOD_PICKAXE.get(), "Piccone di Legno di Quercia");
        add(ModItems.OAK_WOOD_AXE.get(), "Ascia di Legno di Quercia");
        add(ModItems.OAK_WOOD_SHOVEL.get(), "Pala di Legno di Quercia");
        add(ModItems.OAK_WOOD_HOE.get(), "Zappa di Legno di Quercia");
        add(ModItems.OAK_WOOD_HELMET.get(), "Elmo di Legno di Quercia");
        add(ModItems.OAK_WOOD_CHESTPLATE.get(), "Corazza di Legno di Quercia");
        add(ModItems.OAK_WOOD_LEGGINGS.get(), "Gambali di Legno di Quercia");
        add(ModItems.OAK_WOOD_BOOTS.get(), "Stivali di Legno di Quercia");
        add(ModItems.OAK_WOOD_SHIELD.get(), "Scudo di Legno di Quercia");
        add(ModItems.WOOD_SPEAR.get(), "Lancia di Legno");

        // Flint (Selce)
        add(ModItems.FLINT_SWORD.get(), "Spada di Selce");
        add(ModItems.FLINT_PICKAXE.get(), "Piccone di Selce");
        add(ModItems.FLINT_AXE.get(), "Ascia di Selce");
        add(ModItems.FLINT_SHOVEL.get(), "Pala di Selce");
        add(ModItems.FLINT_HOE.get(), "Zappa di Selce");
        add(ModItems.FLINT_HELMET.get(), "Elmo di Selce");
        add(ModItems.FLINT_CHESTPLATE.get(), "Corazza di Selce");
        add(ModItems.FLINT_LEGGINGS.get(), "Gambali di Selce");
        add(ModItems.FLINT_BOOTS.get(), "Stivali di Selce");
        add(ModItems.FLINT_SPEAR.get(), "Lancia di Selce");

        // Echo
        add(ModItems.ECHO_SWORD.get(), "Spada dell'Eco");
        add(ModItems.ECHO_PICKAXE.get(), "Piccone dell'Eco");
        add(ModItems.ECHO_AXE.get(), "Ascia dell'Eco");
        add(ModItems.ECHO_SHOVEL.get(), "Pala dell'Eco");
        add(ModItems.ECHO_HOE.get(), "Zappa dell'Eco");
        add(ModItems.ECHO_HELMET.get(), "Elmo dell'Eco");
        add(ModItems.ECHO_CHESTPLATE.get(), "Corazza dell'Eco");
        add(ModItems.ECHO_LEGGINGS.get(), "Gambali dell'Eco");
        add(ModItems.ECHO_BOOTS.get(), "Stivali dell'Eco");
        add(ModItems.ECHO_SPEAR.get(), "Lancia dell'Eco");
    }
}

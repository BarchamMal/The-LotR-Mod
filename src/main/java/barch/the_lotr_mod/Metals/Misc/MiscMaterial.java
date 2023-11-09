package barch.the_lotr_mod.Metals.Misc;

import barch.the_lotr_mod.Glue.ItemGrouped;
import barch.the_lotr_mod.Glue.ItemGrouper;
import barch.the_lotr_mod.Metals.EffectArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.the_lotr_mod.LotrStatusEffects.LotrStatusEffects.HIGH_SPIRITS;
import static barch.the_lotr_mod.Metals.ElvenSteel.ElvenSteelMaterial.ELVEN_STEEL_HOE;
import static barch.the_lotr_mod.TheLotRMod.NAMESPACE;
import static net.minecraft.entity.effect.StatusEffects.INVISIBILITY;

public class MiscMaterial {

    
    public static final CelebrilToolMaterial CELEBRIL_TOOL_MATERIAL = new CelebrilToolMaterial();
    public static final WoolArmorMaterial WOOL_ARMOR_MATERIAL = new WoolArmorMaterial();
    public static final HithlainArmorMaterial HITHLAIN_ARMOR_MATERIAL = new HithlainArmorMaterial();


    public static final Item CELEBRIL_INGOT = new Item(new FabricItemSettings());
    public static final Item CELEBRIL_NUGGET = new Item(new FabricItemSettings());

    public static final Item HITHLAIN_CLOTH = new Item(new FabricItemSettings());
    public static final Item HITHLAIN_FIBER = new Item(new FabricItemSettings());

    public static final ToolItem CELEBRIL_HOE = new HoeItem( CELEBRIL_TOOL_MATERIAL, 0, 0, new FabricItemSettings());

    public static final Item WOOL_HELMET = new EffectArmorItem(WOOL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new FabricItemSettings(), HIGH_SPIRITS, 1);
    public static final Item WOOL_CHESTPLATE = new EffectArmorItem(WOOL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), HIGH_SPIRITS, 1);
    public static final Item WOOL_LEGGINGS = new EffectArmorItem(WOOL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings(), HIGH_SPIRITS, 1);
    public static final Item WOOL_HORSE_ARMOR = new HorseArmorItem(11, "wool", new FabricItemSettings().maxCount(1));


    public static final Item HITHLAIN_HOOD = new EffectArmorItem(HITHLAIN_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new FabricItemSettings(), INVISIBILITY, 1);
    public static final Item HITHLAIN_CLOAK = new EffectArmorItem(HITHLAIN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), INVISIBILITY, 1);
    public static final Item HITHLAIN_HORSE_ARMOR = new HorseArmorItem(11, "hithlain", new FabricItemSettings().maxCount(1));


    public static void RegisterAll() {
        RegisterItems();
        RegisterBlocks();
        RegisterBlockItems();
        GroupAll();
    }

    public static void RegisterItems() {

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "celebril_ingot"), CELEBRIL_INGOT);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "celebril_nugget"), CELEBRIL_NUGGET);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "hithlain_cloth"), HITHLAIN_CLOTH);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "hithlain_fiber"), HITHLAIN_FIBER);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "celebril_hoe"), CELEBRIL_HOE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "wool_helmet"), WOOL_HELMET);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "wool_chestplate"), WOOL_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "wool_leggings"), WOOL_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "wool_horse_armor"), WOOL_HORSE_ARMOR);


        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "hithlain_hood"), HITHLAIN_HOOD);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "hithlain_cloak"), HITHLAIN_CLOAK);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "hithlain_horse_armor"), HITHLAIN_HORSE_ARMOR);

    }

    public static void RegisterBlocks() {

    }

    public static void RegisterBlockItems() {

    }

    public static void GroupAll() {

        ItemGrouper.GroupItem(CELEBRIL_INGOT, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.GOLD_INGOT)});
        ItemGrouper.GroupItem(CELEBRIL_NUGGET, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.GOLD_NUGGET)});

        ItemGrouper.GroupItem(HITHLAIN_CLOTH, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, CELEBRIL_INGOT)});
        ItemGrouper.GroupItem(HITHLAIN_FIBER, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, CELEBRIL_NUGGET)});

        ItemGrouper.GroupItem(CELEBRIL_HOE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, ELVEN_STEEL_HOE)});

        ItemGrouper.GroupItem(WOOL_HELMET, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_BOOTS)});
        ItemGrouper.GroupItem(WOOL_CHESTPLATE, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, WOOL_HELMET)});
        ItemGrouper.GroupItem(WOOL_LEGGINGS, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, WOOL_CHESTPLATE)});
        ItemGrouper.GroupItem(WOOL_HORSE_ARMOR, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_HORSE_ARMOR)});

        ItemGrouper.GroupItem(HITHLAIN_HOOD, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_BOOTS)});
        ItemGrouper.GroupItem(HITHLAIN_CLOAK, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, HITHLAIN_HOOD)});
        ItemGrouper.GroupItem(HITHLAIN_HORSE_ARMOR, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_HORSE_ARMOR)});


    }

}

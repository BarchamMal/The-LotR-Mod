package barch.the_lotr_mod.Metals.ElvenSteel;

import barch.the_lotr_mod.Glue.ItemGrouped;
import barch.the_lotr_mod.Glue.ItemGrouper;
import barch.the_lotr_mod.Metals.EffectArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.the_lotr_mod.LotrStatusEffects.LotrStatusEffects.HIGH_SPIRITS;
import static barch.the_lotr_mod.TheLotRMod.NAMESPACE;

public class ElvenSteelMaterial {

    
    public static final ElvenSteelToolMaterial ELVEN_STEEL_TOOL_MATERIAL = new ElvenSteelToolMaterial();
    public static final ElvenSteelArmorMaterial ELVEN_STEEL_ARMOR_MATERIAL =   new ElvenSteelArmorMaterial();


    public static final Item ELVEN_STEEL_INGOT = new Item(new FabricItemSettings());
    public static final Item ELVEN_STEEL_NUGGET = new Item(new FabricItemSettings());


    public static final ToolItem ELVEN_STEEL_SWORD = new SwordItem(ELVEN_STEEL_TOOL_MATERIAL, 8, -2.2f, new FabricItemSettings());
    public static final ToolItem ELVEN_STEEL_AXE = new AxeItem(ELVEN_STEEL_TOOL_MATERIAL, 10, -3, new FabricItemSettings());
    public static final ToolItem ELVEN_STEEL_HOE = new HoeItem(ELVEN_STEEL_TOOL_MATERIAL, 0, 0, new FabricItemSettings());
    public static final ToolItem ELVEN_STEEL_SHOVEL = new ShovelItem(ELVEN_STEEL_TOOL_MATERIAL, 3f, -1, new FabricItemSettings());
    public static final ToolItem ELVEN_STEEL_PICKAXE = new PickaxeItem(ELVEN_STEEL_TOOL_MATERIAL, 5, -2.4f, new FabricItemSettings());


    public static final EffectArmorItem ELVEN_STEEL_HELMET = new EffectArmorItem(ELVEN_STEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new FabricItemSettings(), HIGH_SPIRITS, 0);
    public static final EffectArmorItem ELVEN_STEEL_CHESTPLATE = new EffectArmorItem(ELVEN_STEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), HIGH_SPIRITS, 0);
    public static final EffectArmorItem ELVEN_STEEL_LEGGINGS = new EffectArmorItem(ELVEN_STEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings(), HIGH_SPIRITS, 0);
    public static final EffectArmorItem ELVEN_STEEL_BOOTS = new EffectArmorItem(ELVEN_STEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new FabricItemSettings(), HIGH_SPIRITS, 0);
    public static final Item ELVEN_STEEL_HORSE_ARMOR = new HorseArmorItem(11, "elven_steel", new FabricItemSettings().maxCount(1));


    public static void RegisterAll() {
        RegisterItems();
        RegisterBlocks();
        RegisterBlockItems();
        GroupAll();
    }

    public static void RegisterItems() {

        ELVEN_STEEL_ARMOR_MATERIAL.setFullSet(new ArmorItem[] {ELVEN_STEEL_BOOTS, ELVEN_STEEL_LEGGINGS, ELVEN_STEEL_CHESTPLATE, ELVEN_STEEL_HELMET});

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "elven_steel_ingot"), ELVEN_STEEL_INGOT);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "elven_steel_nugget"), ELVEN_STEEL_NUGGET);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "elven_steel_sword"), ELVEN_STEEL_SWORD);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "elven_steel_axe"), ELVEN_STEEL_AXE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "elven_steel_hoe"), ELVEN_STEEL_HOE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "elven_steel_shovel"), ELVEN_STEEL_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "elven_steel_pickaxe"), ELVEN_STEEL_PICKAXE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "elven_steel_helmet"), ELVEN_STEEL_HELMET);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "elven_steel_chestplate"), ELVEN_STEEL_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "elven_steel_leggings"), ELVEN_STEEL_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "elven_steel_boots"), ELVEN_STEEL_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "elven_steel_horse_armor"), ELVEN_STEEL_HORSE_ARMOR);

    }

    public static void RegisterBlocks() {

    }

    public static void RegisterBlockItems() {

    }

    public static void GroupAll() {

        ItemGrouper.GroupItem(ELVEN_STEEL_INGOT, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.GOLD_INGOT)});
        ItemGrouper.GroupItem(ELVEN_STEEL_NUGGET, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.GOLD_NUGGET)});

        ItemGrouper.GroupItem(ELVEN_STEEL_SWORD, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_SWORD)});
        ItemGrouper.GroupItem(ELVEN_STEEL_SHOVEL, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, Items.GOLDEN_HOE)});
        ItemGrouper.GroupItem(ELVEN_STEEL_PICKAXE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, ELVEN_STEEL_SHOVEL)});
        ItemGrouper.GroupItem(ELVEN_STEEL_AXE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, ELVEN_STEEL_PICKAXE), new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_AXE)});
        ItemGrouper.GroupItem(ELVEN_STEEL_HOE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, ELVEN_STEEL_AXE)});

        ItemGrouper.GroupItem(ELVEN_STEEL_HELMET, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_BOOTS)});
        ItemGrouper.GroupItem(ELVEN_STEEL_CHESTPLATE, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, ELVEN_STEEL_HELMET)});
        ItemGrouper.GroupItem(ELVEN_STEEL_LEGGINGS, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, ELVEN_STEEL_CHESTPLATE)});
        ItemGrouper.GroupItem(ELVEN_STEEL_BOOTS, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, ELVEN_STEEL_LEGGINGS)});
        ItemGrouper.GroupItem(ELVEN_STEEL_HORSE_ARMOR, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_HORSE_ARMOR)});


    }

}

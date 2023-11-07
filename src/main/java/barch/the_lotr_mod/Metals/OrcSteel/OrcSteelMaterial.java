package barch.the_lotr_mod.Metals.OrcSteel;

import barch.the_lotr_mod.Glue.ItemGrouped;
import barch.the_lotr_mod.Glue.ItemGrouper;
import barch.the_lotr_mod.LotrStatusEffects.LotrStatusEffects;
import barch.the_lotr_mod.Metals.LotrTools.EffectMaceItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.the_lotr_mod.TheLotRMod.NAMESPACE;

public class OrcSteelMaterial {

    
    public static final OrcSteelToolMaterial ORC_STEEL_TOOL_MATERIAL = new OrcSteelToolMaterial();
    public static final OrcSteelArmorMaterial ORC_STEEL_ARMOR_MATERIAL =   new OrcSteelArmorMaterial();


    public static final Item ORC_STEEL_INGOT = new Item(new FabricItemSettings());
    public static final Item ORC_STEEL_NUGGET = new Item(new FabricItemSettings());


    public static final ToolItem ORC_STEEL_SWORD = new SwordItem(ORC_STEEL_TOOL_MATERIAL, 8, -2.2f, new FabricItemSettings());
    public static final ToolItem ORC_STEEL_AXE = new AxeItem(ORC_STEEL_TOOL_MATERIAL, 10, -3, new FabricItemSettings());
    public static final ToolItem ORC_STEEL_HOE = new HoeItem(ORC_STEEL_TOOL_MATERIAL, 0, 0, new FabricItemSettings());
    public static final ToolItem ORC_STEEL_SHOVEL = new ShovelItem(ORC_STEEL_TOOL_MATERIAL, 3f, -1, new FabricItemSettings());
    public static final ToolItem ORC_STEEL_PICKAXE = new PickaxeItem(ORC_STEEL_TOOL_MATERIAL, 5, -2.4f, new FabricItemSettings());
    public static final ToolItem ORC_STEEL_MACE = new EffectMaceItem(ORC_STEEL_TOOL_MATERIAL, 17, -3.25f, LotrStatusEffects.CORRUPTION, 1, new FabricItemSettings());


    public static final Item ORC_STEEL_HELMET = new ArmorItem(ORC_STEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final Item ORC_STEEL_CHESTPLATE = new ArmorItem(ORC_STEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
    public static final Item ORC_STEEL_LEGGINGS = new ArmorItem(ORC_STEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
    public static final Item ORC_STEEL_BOOTS = new ArmorItem(ORC_STEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new FabricItemSettings());
    public static final Item ORC_STEEL_HORSE_ARMOR = new HorseArmorItem(11, "orc_steel", new FabricItemSettings().maxCount(1));


    public static void RegisterAll() {
        RegisterItems();
        RegisterBlocks();
        RegisterBlockItems();
        GroupAll();
    }

    public static void RegisterItems() {

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "orc_steel_ingot"), ORC_STEEL_INGOT);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "orc_steel_nugget"), ORC_STEEL_NUGGET);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "orc_steel_sword"), ORC_STEEL_SWORD);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "orc_steel_axe"), ORC_STEEL_AXE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "orc_steel_hoe"), ORC_STEEL_HOE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "orc_steel_shovel"), ORC_STEEL_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "orc_steel_pickaxe"), ORC_STEEL_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "orc_steel_mace"), ORC_STEEL_MACE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "orc_steel_helmet"), ORC_STEEL_HELMET);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "orc_steel_chestplate"), ORC_STEEL_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "orc_steel_leggings"), ORC_STEEL_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "orc_steel_boots"), ORC_STEEL_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "orc_steel_horse_armor"), ORC_STEEL_HORSE_ARMOR);

    }

    public static void RegisterBlocks() {

    }

    public static void RegisterBlockItems() {

    }

    public static void GroupAll() {

        ItemGrouper.GroupItem(ORC_STEEL_INGOT, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.GOLD_INGOT)});
        ItemGrouper.GroupItem(ORC_STEEL_NUGGET, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.GOLD_NUGGET)});

        ItemGrouper.GroupItem(ORC_STEEL_SWORD, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_SWORD)});
        ItemGrouper.GroupItem(ORC_STEEL_SHOVEL, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, Items.GOLDEN_HOE)});
        ItemGrouper.GroupItem(ORC_STEEL_PICKAXE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, ORC_STEEL_SHOVEL)});
        ItemGrouper.GroupItem(ORC_STEEL_AXE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, ORC_STEEL_PICKAXE), new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_AXE)});
        ItemGrouper.GroupItem(ORC_STEEL_HOE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, ORC_STEEL_AXE)});
        ItemGrouper.GroupItem(ORC_STEEL_MACE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, ORC_STEEL_AXE), new ItemGrouped(ItemGroups.COMBAT, ORC_STEEL_AXE)});

        ItemGrouper.GroupItem(ORC_STEEL_HELMET, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_BOOTS)});
        ItemGrouper.GroupItem(ORC_STEEL_CHESTPLATE, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, ORC_STEEL_HELMET)});
        ItemGrouper.GroupItem(ORC_STEEL_LEGGINGS, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, ORC_STEEL_CHESTPLATE)});
        ItemGrouper.GroupItem(ORC_STEEL_BOOTS, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, ORC_STEEL_LEGGINGS)});
        ItemGrouper.GroupItem(ORC_STEEL_HORSE_ARMOR, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_HORSE_ARMOR)});


    }

}

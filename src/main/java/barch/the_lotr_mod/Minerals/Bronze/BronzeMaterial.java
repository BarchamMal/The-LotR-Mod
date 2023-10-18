package barch.the_lotr_mod.Minerals.Bronze;

import barch.the_lotr_mod.Glue.ItemGrouped;
import barch.the_lotr_mod.Glue.ItemGrouper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.the_lotr_mod.TheLotRMod.NAMESPACE;

public class BronzeMaterial {

    
    public static final BronzeToolMaterial BRONZE_TOOL_MATERIAL = new BronzeToolMaterial();
    public static final BronzeArmorMaterial BRONZE_ARMOR_MATERIAL =   new BronzeArmorMaterial();


    public static final Item BRONZE_INGOT = new Item(new FabricItemSettings());
    public static final Item BRONZE_NUGGET = new Item(new FabricItemSettings());


    public static final ToolItem BRONZE_SWORD = new SwordItem(BRONZE_TOOL_MATERIAL, 8, -2.6f, new FabricItemSettings());
    public static final ToolItem BRONZE_AXE = new AxeItem(BRONZE_TOOL_MATERIAL, 9, -3, new FabricItemSettings());
    public static final ToolItem BRONZE_HOE = new HoeItem(BRONZE_TOOL_MATERIAL, 0, 0, new FabricItemSettings());
    public static final ToolItem BRONZE_SHOVEL = new ShovelItem(BRONZE_TOOL_MATERIAL, 3f, -1, new FabricItemSettings());
    public static final ToolItem BRONZE_PICKAXE = new PickaxeItem(BRONZE_TOOL_MATERIAL, 5, -2.4f, new FabricItemSettings());


    public static final Item BRONZE_HELMET = new ArmorItem(BRONZE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final Item BRONZE_CHESTPLATE = new ArmorItem(BRONZE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
    public static final Item BRONZE_LEGGINGS = new ArmorItem(BRONZE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
    public static final Item BRONZE_BOOTS = new ArmorItem(BRONZE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new FabricItemSettings());
    public static final Item BRONZE_HORSE_ARMOR = new HorseArmorItem(11, "bronze", new FabricItemSettings().maxCount(1));


    public static void RegisterAll() {
        RegisterItems();
        RegisterBlocks();
        RegisterBlockItems();
        GroupAll();
    }

    public static void RegisterItems() {

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bronze_ingot"), BRONZE_INGOT);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bronze_nugget"), BRONZE_NUGGET);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bronze_sword"), BRONZE_SWORD);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bronze_axe"), BRONZE_AXE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bronze_hoe"), BRONZE_HOE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bronze_shovel"), BRONZE_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bronze_pickaxe"), BRONZE_PICKAXE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bronze_helmet"), BRONZE_HELMET);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bronze_chestplate"), BRONZE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bronze_leggings"), BRONZE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bronze_boots"), BRONZE_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "bronze_horse_armor"), BRONZE_HORSE_ARMOR);

    }

    public static void RegisterBlocks() {

    }

    public static void RegisterBlockItems() {

    }

    public static void GroupAll() {

        ItemGrouper.GroupItem(BRONZE_INGOT, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.GOLD_INGOT)});
        ItemGrouper.GroupItem(BRONZE_NUGGET, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.GOLD_NUGGET)});

        ItemGrouper.GroupItem(BRONZE_SWORD, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_SWORD)});
        ItemGrouper.GroupItem(BRONZE_SHOVEL, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, Items.GOLDEN_HOE)});
        ItemGrouper.GroupItem(BRONZE_PICKAXE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, BRONZE_SHOVEL)});
        ItemGrouper.GroupItem(BRONZE_AXE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, BRONZE_PICKAXE), new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_AXE)});
        ItemGrouper.GroupItem(BRONZE_HOE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, BRONZE_AXE)});

        ItemGrouper.GroupItem(BRONZE_HELMET, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_BOOTS)});
        ItemGrouper.GroupItem(BRONZE_CHESTPLATE, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, BRONZE_HELMET)});
        ItemGrouper.GroupItem(BRONZE_LEGGINGS, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, BRONZE_CHESTPLATE)});
        ItemGrouper.GroupItem(BRONZE_BOOTS, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, BRONZE_LEGGINGS)});
        ItemGrouper.GroupItem(BRONZE_HORSE_ARMOR, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_HORSE_ARMOR)});


    }

}

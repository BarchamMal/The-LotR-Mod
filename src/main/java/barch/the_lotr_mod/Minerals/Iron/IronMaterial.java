package barch.the_lotr_mod.Minerals.Iron;

import barch.the_lotr_mod.Glue.ItemGrouped;
import barch.the_lotr_mod.Glue.ItemGrouper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.the_lotr_mod.TheLotRMod.NAMESPACE;

public class IronMaterial {

    
    public static final IronToolMaterial IRON_TOOL_MATERIAL = new IronToolMaterial();
    public static final IronArmorMaterial IRON_ARMOR_MATERIAL =   new IronArmorMaterial();


    public static final Item IRON_INGOT = new Item(new FabricItemSettings());
    public static final Item IRON_NUGGET = new Item(new FabricItemSettings());


    public static final ToolItem IRON_SWORD = new SwordItem(IRON_TOOL_MATERIAL, 8, -2.6f, new FabricItemSettings());
    public static final ToolItem IRON_AXE = new AxeItem(IRON_TOOL_MATERIAL, 9, -3, new FabricItemSettings());
    public static final ToolItem IRON_HOE = new HoeItem(IRON_TOOL_MATERIAL, 0, 0, new FabricItemSettings());
    public static final ToolItem IRON_SHOVEL = new ShovelItem(IRON_TOOL_MATERIAL, 3f, -1, new FabricItemSettings());
    public static final ToolItem IRON_PICKAXE = new PickaxeItem(IRON_TOOL_MATERIAL, 5, -2.4f, new FabricItemSettings());


    public static final Item IRON_HELMET = new ArmorItem(IRON_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final Item IRON_CHESTPLATE = new ArmorItem(IRON_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
    public static final Item IRON_LEGGINGS = new ArmorItem(IRON_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
    public static final Item IRON_BOOTS = new ArmorItem(IRON_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new FabricItemSettings());
    public static final Item IRON_HORSE_ARMOR = new HorseArmorItem(11, "iron", new FabricItemSettings().maxCount(1));


    public static void RegisterAll() {
        RegisterItems();
        RegisterBlocks();
        RegisterBlockItems();
        GroupAll();
    }

    public static void RegisterItems() {

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "iron_ingot"), IRON_INGOT);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "iron_nugget"), IRON_NUGGET);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "iron_sword"), IRON_SWORD);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "iron_axe"), IRON_AXE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "iron_hoe"), IRON_HOE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "iron_shovel"), IRON_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "iron_pickaxe"), IRON_PICKAXE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "iron_helmet"), IRON_HELMET);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "iron_chestplate"), IRON_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "iron_leggings"), IRON_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "iron_boots"), IRON_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "iron_horse_armor"), IRON_HORSE_ARMOR);

    }

    public static void RegisterBlocks() {

    }

    public static void RegisterBlockItems() {

    }

    public static void GroupAll() {

        ItemGrouper.GroupItem(IRON_INGOT, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.GOLD_INGOT)});
        ItemGrouper.GroupItem(IRON_NUGGET, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.GOLD_NUGGET)});

        ItemGrouper.GroupItem(IRON_SWORD, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_SWORD)});
        ItemGrouper.GroupItem(IRON_SHOVEL, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, Items.GOLDEN_HOE)});
        ItemGrouper.GroupItem(IRON_PICKAXE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, IRON_SHOVEL)});
        ItemGrouper.GroupItem(IRON_AXE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, IRON_PICKAXE), new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_AXE)});
        ItemGrouper.GroupItem(IRON_HOE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, IRON_AXE)});

        ItemGrouper.GroupItem(IRON_HELMET, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_BOOTS)});
        ItemGrouper.GroupItem(IRON_CHESTPLATE, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, IRON_HELMET)});
        ItemGrouper.GroupItem(IRON_LEGGINGS, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, IRON_CHESTPLATE)});
        ItemGrouper.GroupItem(IRON_BOOTS, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, IRON_LEGGINGS)});
        ItemGrouper.GroupItem(IRON_HORSE_ARMOR, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_HORSE_ARMOR)});


    }

}

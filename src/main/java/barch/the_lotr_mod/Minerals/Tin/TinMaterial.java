package barch.the_lotr_mod.Minerals.Tin;

import barch.the_lotr_mod.Glue.ItemGrouped;
import barch.the_lotr_mod.Glue.ItemGrouper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.the_lotr_mod.TheLotRMod.NAMESPACE;

public class TinMaterial {
    
    public static final TinToolMaterial TIN_TOOL_MATERIAL = new TinToolMaterial();
    public static final TinArmorMaterial TIN_ARMOR_MATERIAL =   new TinArmorMaterial();


    public static final Item TIN_INGOT = new Item(new FabricItemSettings());
    public static final Item TIN_NUGGET = new Item(new FabricItemSettings());


    public static final ToolItem TIN_SWORD = new SwordItem(TIN_TOOL_MATERIAL, 6, -2.4f, new FabricItemSettings());
    public static final ToolItem TIN_AXE = new AxeItem(TIN_TOOL_MATERIAL, 8, -3, new FabricItemSettings());
    public static final ToolItem TIN_HOE = new HoeItem(TIN_TOOL_MATERIAL, 0, 0, new FabricItemSettings());
    public static final ToolItem TIN_SHOVEL = new ShovelItem(TIN_TOOL_MATERIAL, 4.5f, -3, new FabricItemSettings());
    public static final ToolItem TIN_PICKAXE = new PickaxeItem(TIN_TOOL_MATERIAL, 4, -2.2f, new FabricItemSettings());


    public static final Item TIN_HELMET = new ArmorItem(TIN_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final Item TIN_CHESTPLATE = new ArmorItem(TIN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
    public static final Item TIN_LEGGINGS = new ArmorItem(TIN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
    public static final Item TIN_BOOTS = new ArmorItem(TIN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new FabricItemSettings());
    public static final Item TIN_HORSE_ARMOR = new HorseArmorItem(11, "tin", new FabricItemSettings().maxCount(1));


    public static void RegisterAll() {
        RegisterItems();
        RegisterBlocks();
        RegisterBlockItems();
        GroupAll();
    }

    public static void RegisterItems() {

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tin_ingot"), TIN_INGOT);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tin_nugget"), TIN_NUGGET);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tin_sword"), TIN_SWORD);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tin_axe"), TIN_AXE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tin_hoe"), TIN_HOE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tin_shovel"), TIN_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tin_pickaxe"), TIN_PICKAXE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tin_helmet"), TIN_HELMET);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tin_chestplate"), TIN_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tin_leggings"), TIN_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tin_boots"), TIN_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "tin_horse_armor"), TIN_HORSE_ARMOR);

    }

    public static void RegisterBlocks() {

    }

    public static void RegisterBlockItems() {

    }

    public static void GroupAll() {

        ItemGrouper.GroupItem(TIN_INGOT, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.GOLD_INGOT)});
        ItemGrouper.GroupItem(TIN_NUGGET, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.GOLD_NUGGET)});

        ItemGrouper.GroupItem(TIN_SWORD, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_SWORD)});
        ItemGrouper.GroupItem(TIN_SHOVEL, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, Items.GOLDEN_HOE)});
        ItemGrouper.GroupItem(TIN_PICKAXE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, TIN_SHOVEL)});
        ItemGrouper.GroupItem(TIN_AXE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, TIN_PICKAXE), new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_AXE)});
        ItemGrouper.GroupItem(TIN_HOE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, TIN_AXE)});

        ItemGrouper.GroupItem(TIN_HELMET, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_BOOTS)});
        ItemGrouper.GroupItem(TIN_CHESTPLATE, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, TIN_HELMET)});
        ItemGrouper.GroupItem(TIN_LEGGINGS, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, TIN_CHESTPLATE)});
        ItemGrouper.GroupItem(TIN_BOOTS, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, TIN_LEGGINGS)});
        ItemGrouper.GroupItem(TIN_HORSE_ARMOR, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_HORSE_ARMOR)});


    }

}

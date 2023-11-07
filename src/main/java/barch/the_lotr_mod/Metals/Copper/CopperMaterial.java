package barch.the_lotr_mod.Metals.Copper;

import barch.the_lotr_mod.Glue.ItemGrouped;
import barch.the_lotr_mod.Glue.ItemGrouper;
import barch.the_lotr_mod.Metals.RingItem;
import barch.the_lotr_mod.Metals.RingMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.the_lotr_mod.Metals.Gems.*;
import static barch.the_lotr_mod.TheLotRMod.NAMESPACE;

public class CopperMaterial {

    public static final RingMaterial COPPER_RING_MATERIAL = new RingMaterial("copper", 0);

    public static final RingItem COPPER_RUBY_RING = new RingItem(new FabricItemSettings().maxCount(1), COPPER_RING_MATERIAL, RUBY_GEM);
    public static final RingItem COPPER_SAPPHIRE_RING = new RingItem(new FabricItemSettings().maxCount(1), COPPER_RING_MATERIAL, SAPPHIRE_GEM);
    public static final RingItem COPPER_DIAMOND_RING = new RingItem(new FabricItemSettings().maxCount(1), COPPER_RING_MATERIAL, DIAMOND_GEM);
    
    public static final CopperToolMaterial COPPER_TOOL_MATERIAL = new CopperToolMaterial();
    public static final CopperArmorMaterial COPPER_ARMOR_MATERIAL =   new CopperArmorMaterial();


    public static final Item COPPER_INGOT = new Item(new FabricItemSettings());
    public static final Item COPPER_NUGGET = new Item(new FabricItemSettings());


    public static final ToolItem COPPER_SWORD = new SwordItem(COPPER_TOOL_MATERIAL, 6, -2.4f, new FabricItemSettings());
    public static final ToolItem COPPER_AXE = new AxeItem(COPPER_TOOL_MATERIAL, 8, -3, new FabricItemSettings());
    public static final ToolItem COPPER_HOE = new HoeItem(COPPER_TOOL_MATERIAL, 0, 0, new FabricItemSettings());
    public static final ToolItem COPPER_SHOVEL = new ShovelItem(COPPER_TOOL_MATERIAL, 4.5f, -3, new FabricItemSettings());
    public static final ToolItem COPPER_PICKAXE = new PickaxeItem(COPPER_TOOL_MATERIAL, 4, -2.2f, new FabricItemSettings());


    public static final Item COPPER_HELMET = new ArmorItem(COPPER_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final Item COPPER_CHESTPLATE = new ArmorItem(COPPER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
    public static final Item COPPER_LEGGINGS = new ArmorItem(COPPER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
    public static final Item COPPER_BOOTS = new ArmorItem(COPPER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new FabricItemSettings());
    public static final Item COPPER_HORSE_ARMOR = new HorseArmorItem(11, "copper", new FabricItemSettings().maxCount(1));


    public static void RegisterAll() {
        RegisterItems();
        RegisterBlocks();
        RegisterBlockItems();
        GroupAll();
    }

    public static void RegisterItems() {

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_ruby_ring"), COPPER_RUBY_RING);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_sapphire_ring"), COPPER_SAPPHIRE_RING);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_diamond_ring"), COPPER_DIAMOND_RING);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_ingot"), COPPER_INGOT);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_nugget"), COPPER_NUGGET);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_sword"), COPPER_SWORD);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_axe"), COPPER_AXE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_hoe"), COPPER_HOE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_shovel"), COPPER_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_pickaxe"), COPPER_PICKAXE);

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_helmet"), COPPER_HELMET);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_chestplate"), COPPER_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_leggings"), COPPER_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_boots"), COPPER_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "copper_horse_armor"), COPPER_HORSE_ARMOR);

    }

    public static void RegisterBlocks() {

    }

    public static void RegisterBlockItems() {

    }

    public static void GroupAll() {

        ItemGrouper.GroupItem(COPPER_RUBY_RING, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, Items.FLINT_AND_STEEL)});
        ItemGrouper.GroupItem(COPPER_SAPPHIRE_RING, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, COPPER_RUBY_RING)});
        ItemGrouper.GroupItem(COPPER_DIAMOND_RING, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, COPPER_SAPPHIRE_RING)});

        ItemGrouper.GroupItem(COPPER_INGOT, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.GOLD_INGOT)});
        ItemGrouper.GroupItem(COPPER_NUGGET, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, Items.GOLD_NUGGET)});

        ItemGrouper.GroupItem(COPPER_SWORD, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_SWORD)});
        ItemGrouper.GroupItem(COPPER_SHOVEL, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, Items.GOLDEN_HOE)});
        ItemGrouper.GroupItem(COPPER_PICKAXE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, COPPER_SHOVEL)});
        ItemGrouper.GroupItem(COPPER_AXE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, COPPER_PICKAXE), new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_AXE)});
        ItemGrouper.GroupItem(COPPER_HOE, new ItemGrouped[]{new ItemGrouped(ItemGroups.TOOLS, COPPER_AXE)});

        ItemGrouper.GroupItem(COPPER_HELMET, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_BOOTS)});
        ItemGrouper.GroupItem(COPPER_CHESTPLATE, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, COPPER_HELMET)});
        ItemGrouper.GroupItem(COPPER_LEGGINGS, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, COPPER_CHESTPLATE)});
        ItemGrouper.GroupItem(COPPER_BOOTS, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, COPPER_LEGGINGS)});
        ItemGrouper.GroupItem(COPPER_HORSE_ARMOR, new ItemGrouped[]{new ItemGrouped(ItemGroups.COMBAT, Items.GOLDEN_HORSE_ARMOR)});


    }

}

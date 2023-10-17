package barch.the_lotr_mod.Minerals;

import barch.the_lotr_mod.Glue.ItemGrouped;
import barch.the_lotr_mod.Glue.ItemGrouper;
import barch.the_lotr_mod.Minerals.Copper.CopperArmorMaterial;
import barch.the_lotr_mod.Minerals.Copper.CopperToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.the_lotr_mod.Minerals.Iron.IronMaterial.IRON_INGOT;
import static barch.the_lotr_mod.TheLotRMod.NAMESPACE;

public class Gems {

    public static final GemMaterial RUBY_GEM = new GemMaterial("ruby", new Item[] {Items.FLINT_AND_STEEL, Items.MAGMA_BLOCK, Items.LAVA_BUCKET}, StatusEffects.FIRE_RESISTANCE);
    public static final GemMaterial SAPPHIRE_GEM = new GemMaterial("sapphire", new Item[] {Items.WATER_BUCKET, Items.ICE, Items.PACKED_ICE}, StatusEffects.WATER_BREATHING);
    public static final GemMaterial DIAMOND_GEM = new GemMaterial("diamond", new Item[] {Items.GLASS, Items.AMETHYST_BLOCK, Items.OBSIDIAN}, StatusEffects.NIGHT_VISION);

    public static final Item RUBY = new Item(new FabricItemSettings());
    public static final Item SAPPHIRE = new Item(new FabricItemSettings());
    public static final Item DIAMOND = new Item(new FabricItemSettings());
    
    public static void RegisterAll() {
        RegisterItems();
        RegisterBlocks();
        RegisterBlockItems();
        GroupAll();
    }

    public static void RegisterItems() {

        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "ruby"), RUBY);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "sapphire"), SAPPHIRE);
        Registry.register(Registries.ITEM, new Identifier(NAMESPACE, "diamond"), DIAMOND);

    }

    public static void RegisterBlocks() {

    }

    public static void RegisterBlockItems() {

    }

    public static void GroupAll() {

        ItemGrouper.GroupItem(RUBY, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, IRON_INGOT)});
        ItemGrouper.GroupItem(SAPPHIRE, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, RUBY)});
        ItemGrouper.GroupItem(DIAMOND, new ItemGrouped[]{new ItemGrouped(ItemGroups.INGREDIENTS, SAPPHIRE)});
        
    }

}

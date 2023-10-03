package barch.the_lotr_mod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

import static barch.the_lotr_mod.TheLotRMod.NAMESPACE;

public class Tags {

    public static final TagKey<Item> KNIVES = ofItem(NAMESPACE,"knives");


    private static TagKey<Biome> ofBiome(String namespace, String path) {
        return TagKey.of(RegistryKeys.BIOME, new Identifier(namespace, path));
    }
    private static TagKey<Block> ofBlock(String namespace, String path) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(namespace, path));
    }
    private static TagKey<Item> ofItem(String namespace, String path) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(namespace, path));
    }

}

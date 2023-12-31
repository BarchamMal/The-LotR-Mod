package barch.the_lotr_mod.Glue;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import static barch.the_lotr_mod.TheLotRMod.LOTR_GROUP;

public class ItemGrouper {

    public static void GroupItem(Item item, ItemGrouped[] groups) {

        ItemGroupEvents.modifyEntriesEvent(LOTR_GROUP).register(content -> {
            content.add(item);
        });

        for (ItemGrouped group: groups) {

            ItemGroupEvents.modifyEntriesEvent(group.group).register(content -> {
                content.addAfter(group.getItem(), item);
            });
        }

    }

    public static void GroupItem(Block item, ItemGrouped[] groups) {

        ItemGroupEvents.modifyEntriesEvent(LOTR_GROUP).register(content -> {
            content.add(item);
        });

        for (ItemGrouped group: groups) {

            ItemGroupEvents.modifyEntriesEvent(group.group).register(content -> {
                content.addAfter(group.getItem(), item);
            });
        }

    }

}

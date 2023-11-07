package barch.the_lotr_mod.Metals;

import net.minecraft.item.Item;
import net.minecraft.entity.effect.StatusEffect;


public class GemMaterial {

    private String name;
    private Item[] items;
    private StatusEffect effect;

    public GemMaterial(String name, Item[] items, StatusEffect effect) {
        this.name = name;
        this.items = items;
        this.effect = effect;
    }

    public Item[] getItems() {
        return items;
    }

    public Item getItem(int level) {
        if (level > items.length) {
            return items[items.length-1];
        }
        return items[level];
    }

    public StatusEffect getEffect() {
        return effect;
    }

    public String getName() {
        return name;
    }
}

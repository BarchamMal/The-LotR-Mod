 package barch.the_lotr_mod.Metals.Misc;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import static barch.the_lotr_mod.Metals.Misc.MiscMaterial.HITHLAIN_FIBER;


 public class HithlainArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {25,25,25,25};
    private static final int[] PROTECTION_VALUES = new int[] {5, 5, 5, 5};


    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()] * 100;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_VALUES[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.BLOCK_WOOL_PLACE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(HITHLAIN_FIBER);
    }

    @Override
    public String getName() {
        return "hithlain";
    }

    @Override
    public float getToughness() {
        return 4;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }

}

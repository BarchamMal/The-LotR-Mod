package barch.the_lotr_mod.Metals.ElvenSteel;

import barch.the_lotr_mod.Metals.EffectArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import static barch.the_lotr_mod.Metals.ElvenSteel.ElvenSteelMaterial.ELVEN_STEEL_NUGGET;

public class ElvenSteelArmorMaterial extends EffectArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {17,18,19,17};
    private static final int[] PROTECTION_VALUES = new int[] {7, 8, 10, 12};


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
        return 20;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ELVEN_STEEL_NUGGET);
    }

    @Override
    public String getName() {
        return "elven_steel";
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

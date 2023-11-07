package barch.the_lotr_mod.Metals.Bronze;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import static barch.the_lotr_mod.Metals.Bronze.BronzeMaterial.BRONZE_NUGGET;

public class BronzeArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {12,13,14,12};
    private static final int[] PROTECTION_VALUES = new int[] {6, 7, 8, 10};

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
        return 10;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(BRONZE_NUGGET);
    }

    @Override
    public String getName() {
        return "bronze";
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

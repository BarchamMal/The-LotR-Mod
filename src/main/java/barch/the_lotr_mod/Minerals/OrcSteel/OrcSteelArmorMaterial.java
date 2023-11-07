package barch.the_lotr_mod.Minerals.OrcSteel;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import static barch.the_lotr_mod.Minerals.OrcSteel.OrcSteelMaterial.ORC_STEEL_NUGGET;

public class OrcSteelArmorMaterial implements ArmorMaterial {
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
        return 5;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ORC_STEEL_NUGGET);
    }

    @Override
    public String getName() {
        return "orc_steel";
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

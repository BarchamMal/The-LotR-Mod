package barch.the_lotr_mod.Metals.ElvenSteel;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static barch.the_lotr_mod.Metals.ElvenSteel.ElvenSteelMaterial.ELVEN_STEEL_NUGGET;

public class ElvenSteelToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 2000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ELVEN_STEEL_NUGGET);
    }
}

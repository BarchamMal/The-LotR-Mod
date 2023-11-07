package barch.the_lotr_mod.Metals.Copper;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static barch.the_lotr_mod.Metals.Copper.CopperMaterial.COPPER_NUGGET;

public class CopperToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(COPPER_NUGGET);
    }
}

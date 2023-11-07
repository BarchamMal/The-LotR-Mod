package barch.the_lotr_mod.Metals.Iron;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static barch.the_lotr_mod.Metals.Iron.IronMaterial.IRON_NUGGET;

public class IronToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(IRON_NUGGET);
    }
}

package barch.the_lotr_mod.Metals;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EffectArmorItem extends ArmorItem {

    public StatusEffect effect;
    public int strength;


    public EffectArmorItem(EffectArmorMaterial material, Type type, Settings settings, StatusEffect effect, int strength) {
        super(material, type, settings);

        this.effect = effect;
        this.strength = strength;


    }


    public boolean hasFullSet(LivingEntity armorWearer) {

        for (ArmorItem piece : ((EffectArmorMaterial)this.material).getFullSet()) {

            if (!(armorWearer.getEquippedStack(piece.getSlotType()).getItem() == piece)) {
                return false;
            }

        }

        return true;

    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if (!(entity instanceof LivingEntity)) {
            return;
        }

        if (!hasFullSet((LivingEntity)entity)) {
            return;
        }

        ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(this.effect, 20*10, this.strength, true, false));

    }
}

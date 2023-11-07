package barch.the_lotr_mod.LotrStatusEffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.math.random.Random;

import static barch.the_lotr_mod.LotrStatusEffects.LotrStatusEffects.CORRUPTION;


public class HighSpiritsStatusEffect extends StatusEffect {

    Random random = Random.create();

    protected HighSpiritsStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x37DD73);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (amplifier < 1) {
            if ((entity.getStatusEffect(CORRUPTION) != null) && (entity.getStatusEffect(CORRUPTION).getAmplifier() >= 1)) {

                int time = entity.getStatusEffect(CORRUPTION).getDuration();
                entity.removeStatusEffect(CORRUPTION);
                entity.addStatusEffect(new StatusEffectInstance(CORRUPTION,time,0));

            }
        } else if (amplifier > 0) {
            if ((entity.getStatusEffect(CORRUPTION) != null)) {

                entity.removeStatusEffect(CORRUPTION);

            }
        }
    }
}

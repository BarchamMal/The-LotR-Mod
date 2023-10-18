package barch.the_lotr_mod.LotrStatusEffects;

import barch.the_lotr_mod.LotrRegistryKeys;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.random.Random;

import static com.mojang.text2speech.Narrator.LOGGER;


public class CorruptionStatusEffect extends StatusEffect {

    Random random = Random.create();

    protected CorruptionStatusEffect() {
        super(StatusEffectCategory.HARMFUL, 0x221100);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int r = random.nextBetween(0,256)+amplifier;
        if (r <= 255) {
            return false;
        }
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.damage(LotrRegistryKeys.of(entity.getWorld(),LotrRegistryKeys.MORGUL_WEAPON_DAMAGE_TYPE), 1);
    }
}

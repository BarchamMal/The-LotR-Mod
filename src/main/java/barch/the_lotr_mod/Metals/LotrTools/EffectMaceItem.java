package barch.the_lotr_mod.Metals.LotrTools;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;


/**
    A {@link MaceItem} that deals an effect to during the {@link EffectMaceItem#postHit(ItemStack, LivingEntity, LivingEntity)} method.
    If the target already has that effect, it is re-applied with its amplifier + 1.
 */

public class EffectMaceItem extends MaceItem {

    public StatusEffect statusEffect;
    public int effectTime;

    /**
     *
     * @param toolMaterial A {@link ToolMaterial} to be used for the {@link ToolItem}'s stats.
     * @param attackDamage The amount of damage the {@link ToolItem} does on a fully charged, non-critical hit, to a target with 0 armor points.
     * @param attackSpeed The {@link ToolItem}'s attack speed: the higher, the faster it recharges.
     * @param statusEffect The effect to be applied on hit.
     * @param effectTime The duration of the effect in minutes.
     * @param settings The {@link Settings}.
     */
    public EffectMaceItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, StatusEffect statusEffect, int effectTime, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.statusEffect = statusEffect;
        this.effectTime = effectTime;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        StatusEffectInstance status = new StatusEffectInstance(statusEffect, 1, 0,true, false);
        if (!(target.getStatusEffect(statusEffect) == null)) {
            status = target.getStatusEffect(statusEffect);
        }
        target.addStatusEffect(new StatusEffectInstance(statusEffect, 20*60*this.effectTime, status.getAmplifier()+1,true, false), attacker);
        return super.postHit(stack, target, attacker);
    }
}

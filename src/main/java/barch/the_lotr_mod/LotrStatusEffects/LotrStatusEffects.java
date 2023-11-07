package barch.the_lotr_mod.LotrStatusEffects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.the_lotr_mod.TheLotRMod.NAMESPACE;

public class LotrStatusEffects {

    public static final StatusEffect CORRUPTION = new CorruptionStatusEffect();
    public static final StatusEffect HIGH_SPIRITS = new HighSpiritsStatusEffect();

    public static void RegisterStatusEffects() {

        Registry.register(Registries.STATUS_EFFECT, new Identifier(NAMESPACE, "morgul_weapon"), CORRUPTION);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(NAMESPACE, "high_spirits"), HIGH_SPIRITS);

    }

}

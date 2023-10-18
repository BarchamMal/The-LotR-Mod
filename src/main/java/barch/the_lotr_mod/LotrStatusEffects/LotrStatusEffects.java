package barch.the_lotr_mod.LotrStatusEffects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static barch.the_lotr_mod.TheLotRMod.NAMESPACE;

public class LotrStatusEffects {

    public static final StatusEffect CORRUPTION = new CorruptionStatusEffect();

    public static void RegisterStatusEffects() {

        Registry.register(Registries.STATUS_EFFECT, new Identifier(NAMESPACE, "morgul_weapon"), CORRUPTION);

    }

}

package barch.the_lotr_mod.mixin;

import net.minecraft.entity.*;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static barch.the_lotr_mod.Tags.DISABLE_SHIELDS;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity implements Attackable {


    @Shadow public abstract ItemStack getMainHandStack();

    protected LivingEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "disablesShield", at = @At("RETURN"), cancellable = true)
    public void injected(CallbackInfoReturnable<Boolean> cir) {
         cir.setReturnValue(
                 this.getMainHandStack().isIn(DISABLE_SHIELDS)
         );
    }

}

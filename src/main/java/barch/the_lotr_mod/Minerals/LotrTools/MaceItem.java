package barch.the_lotr_mod.Minerals.LotrTools;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;

import static barch.the_lotr_mod.Tags.MACE_MINEABLE;

public class MaceItem extends MiningToolItem {

    public MaceItem(ToolMaterial material,float attackDamage, float attackSpeed, Settings settings) {
        super(attackDamage, attackSpeed, material, MACE_MINEABLE, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        return super.postHit(stack, target, attacker);
    }
}

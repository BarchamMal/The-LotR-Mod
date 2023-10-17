package barch.the_lotr_mod.Minerals;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import static net.minecraft.item.Items.WATER_BUCKET;

public class RingItem extends Item {

    private RingMaterial material;
    private GemMaterial gem;

    public RingItem(Settings settings, RingMaterial material, GemMaterial gem) {
        super(settings);
        this.material = material;
        this.gem = gem;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if (entity.isLiving()) {
            ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(gem.getEffect(), 20, material.getLevel()), entity);
        }
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        super.useOnBlock(context);
        if (gem.getItems()[material.getLevel()] instanceof BucketItem)
        {
            BucketItem item = ((BucketItem)gem.getItems()[material.getLevel()]);
            if (
                    item.use(context.getWorld(),context.getPlayer(),context.getHand()) == TypedActionResult.success(BucketItem.getEmptiedStack(WATER_BUCKET.getDefaultStack(), context.getPlayer()), context.getWorld().isClient())
            )
            {
                context.getPlayer().swingHand(context.getHand());
                return ActionResult.SUCCESS;
            }
        }

        if (gem.getItems()[material.getLevel()].useOnBlock(context) == ActionResult.PASS)
        {

            context.getPlayer().swingHand(context.getHand());
            return ActionResult.SUCCESS;
        }

        return ActionResult.FAIL;

    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        super.useOnEntity(stack, user, entity, hand);
        if (
                entity.addStatusEffect(new StatusEffectInstance(gem.getEffect(), (20*120)*(material.getLevel()+1), material.getLevel()), entity)
        ) {
            user.swingHand(hand);
            return ActionResult.SUCCESS;
        }
        return ActionResult.FAIL;
    }
}

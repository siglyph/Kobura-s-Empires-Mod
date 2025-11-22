package net.kobura.koburasempires.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.raid.RaiderEntity;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class BanditEntity extends PathAwareEntity {
    public BanditEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createBanditAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1);
    }


    @Override
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(8, new WanderAroundGoal(this, 0.6));
        this.goalSelector.add(9, new LookAtEntityGoal(this, PlayerEntity.class,15.0F, 1.0F));
        this.goalSelector.add(10, new LookAtEntityGoal(this, MobEntity.class, 15.0F));

        this.goalSelector.add(1, new MeleeAttackGoal(this, 1.0, true));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, HostileEntity.class, true));
    }
    @Override
    public void tick() {
        super.tick();
        if (!this.getWorld().isClient) {
            if (this.getTarget() != null) {
                // super jank debug, but useful
                this.getWorld().getPlayers().forEach(p ->
                        p.sendMessage(Text.literal("Bandit targeting: " + this.getTarget().getName().getString()), true)
                );
            }
        }
    }


}

package krazyminer001.bettersniffer.entities.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.RideableInventory;
import net.minecraft.entity.Saddleable;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.SnifferEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BetterSnifferEntity extends SnifferEntity implements Saddleable, RideableInventory {
    private static boolean saddled;
    public BetterSnifferEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
        this.saddled = false;
    }

    @Override
    public boolean canBeSaddled() {
        return !this.saddled;
    }

    @Override
    public void saddle(@Nullable SoundCategory sound) {
        this.saddled = true;
    }

    @Override
    public boolean isSaddled() {
        return this.saddled;
    }

    @Override
    public void openInventory(PlayerEntity player) {

    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        if (this.isSaddled()) {
            putPlayerOnBack(player);
            return ActionResult.SUCCESS;
        }
        return super.interactMob(player, hand);
    }

    protected void putPlayerOnBack(PlayerEntity player) {
        if (!this.getWorld().isClient) {
            player.setYaw(this.getYaw());
            player.setPitch(this.getPitch());
            player.startRiding(this);
        }

    }

    @Override
    protected void tickControlled(PlayerEntity controllingPlayer, Vec3d movementInput) {
        super.tickControlled(controllingPlayer, movementInput);
        Vec2f vec2f = this.getControlledRotation(controllingPlayer);
        this.setRotation(vec2f.y, vec2f.x);
        this.prevYaw = this.bodyYaw = this.headYaw = this.getYaw();
    }

    protected Vec2f getControlledRotation(LivingEntity controllingPassenger) {
        return new Vec2f(controllingPassenger.getPitch() * 0.5F, controllingPassenger.getYaw());
    }
}

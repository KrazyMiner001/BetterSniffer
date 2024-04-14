package krazyminer001.bettersniffer.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.UUID;

@Mixin(Entity.class)
public interface EntityAccessor {
    @Accessor("world")
    World getWorld();

    @Accessor("blockPos")
    BlockPos getPos();

    @Accessor("uuid")
    UUID getUUID();
}

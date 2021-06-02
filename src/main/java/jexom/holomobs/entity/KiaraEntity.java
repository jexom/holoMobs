package jexom.holomobs.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;

import java.util.Random;

public class KiaraEntity extends ChickenEntity {
    public KiaraEntity(EntityType<? extends KiaraEntity> entity, World world) {
        super(entity, world);
    }

    public static boolean canSpawnNaturally(EntityType entityType, IServerWorld iServerWorld, SpawnReason spawnReason, BlockPos blockPos, Random random) {
        return true;
    }
}

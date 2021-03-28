package jexom.holomobs.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;

import java.util.Random;

public class KoroneEntity extends WolfEntity {

    public KoroneEntity(EntityType<? extends KoroneEntity> entityType, World world) {
        super(entityType, world);
    }

    public static boolean canSpawnNaturally(EntityType entityType, IServerWorld iServerWorld, SpawnReason spawnReason, BlockPos blockPos, Random random) {
        return true;
    }
}

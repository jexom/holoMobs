package jexom.holomobs.entity;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public class OkayuEntity extends CatEntity {

    public OkayuEntity(EntityType<? extends OkayuEntity> entityType, World world) {
        super(entityType, world);
    }

    public static boolean canSpawnNaturally(EntityType entityType, IWorld world, SpawnReason reason, BlockPos pos, Random random) {
        return world.getBlockState(pos.below()).is(Blocks.GRASS_BLOCK) && world.getMaxLocalRawBrightness(pos, 0) > 8 && world.canSeeSky(pos);
    }

}

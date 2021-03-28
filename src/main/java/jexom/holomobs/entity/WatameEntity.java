package jexom.holomobs.entity;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WatameEntity extends SheepEntity {

    public WatameEntity(EntityType<? extends WatameEntity> entity, World world) {
        super(entity, world);
    }

    public static boolean canSpawnNaturally(EntityType entityType, IWorld world, SpawnReason reason, BlockPos pos, Random random) {
        return world.getBlockState(pos.below()).is(Blocks.GRASS_BLOCK) && world.getMaxLocalRawBrightness(pos, 0) > 8 && world.canSeeSky(pos);
    }

    @Override
    public ActionResultType mobInteract(PlayerEntity p_230254_1_, Hand p_230254_2_) {
        return super.mobInteract(p_230254_1_, p_230254_2_);
    }

    @Override
    public boolean readyForShearing() {
        return true;
    }

    @Override
    public boolean canFallInLove() {
        return false;
    }

    @javax.annotation.Nonnull
    @Override
    public List<ItemStack> onSheared(@Nullable PlayerEntity player, @javax.annotation.Nonnull ItemStack item, World world, BlockPos pos, int fortune) {
        //TODO: play deny sound
        return Collections.emptyList();
    }


}

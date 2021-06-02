package jexom.holomobs.client.renderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import jexom.holomobs.HoloMobs;
import jexom.holomobs.client.model.OkayuModel;
import jexom.holomobs.entity.OkayuEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

import javax.annotation.Nonnull;


public class OkayuRenderer extends MobRenderer<OkayuEntity, OkayuModel<OkayuEntity>> {

    public OkayuRenderer(EntityRendererManager renderManager) {
        super(renderManager, new OkayuModel<>(), 0.6F);
    }

    @Override
    @Nonnull
    public ResourceLocation getTextureLocation(@Nonnull OkayuEntity okayu) {
        return new ResourceLocation(HoloMobs.MOD_ID, "textures/entity/okayu.png");
    }

    protected void scale(OkayuEntity p_225620_1_, MatrixStack p_225620_2_, float p_225620_3_) {
        super.scale(p_225620_1_, p_225620_2_, p_225620_3_);
        p_225620_2_.scale(0.8F, 0.8F, 0.8F);
    }

    protected void setupRotations(OkayuEntity p_225621_1_, MatrixStack p_225621_2_, float p_225621_3_, float p_225621_4_, float p_225621_5_) {
        super.setupRotations(p_225621_1_, p_225621_2_, p_225621_3_, p_225621_4_, p_225621_5_);
        float f = p_225621_1_.getLieDownAmount(p_225621_5_);
        if (f > 0.0F) {
            p_225621_2_.translate((double)(0.4F * f), (double)(0.15F * f), (double)(0.1F * f));
            p_225621_2_.mulPose(Vector3f.ZP.rotationDegrees(MathHelper.rotLerp(f, 0.0F, 90.0F)));
            BlockPos blockpos = p_225621_1_.blockPosition();

            for(PlayerEntity playerentity : p_225621_1_.level.getEntitiesOfClass(PlayerEntity.class, (new AxisAlignedBB(blockpos)).inflate(2.0D, 2.0D, 2.0D))) {
                if (playerentity.isSleeping()) {
                    p_225621_2_.translate((double)(0.15F * f), 0.0D, 0.0D);
                    break;
                }
            }
        }

    }
}

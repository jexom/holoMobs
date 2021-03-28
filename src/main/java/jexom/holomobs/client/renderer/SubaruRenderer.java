package jexom.holomobs.client.renderer;

import jexom.holomobs.HoloAnimals;
import jexom.holomobs.client.model.SubaruModel;
import jexom.holomobs.entity.SubaruEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nonnull;


public class SubaruRenderer extends MobRenderer<SubaruEntity, SubaruModel<SubaruEntity>> {

    public SubaruRenderer(EntityRendererManager renderManager) {
        super(renderManager, new SubaruModel<>(), 0.5F);
    }

    @Override
    @Nonnull
    public ResourceLocation getTextureLocation(@Nonnull SubaruEntity subaru) {
        return new ResourceLocation(HoloAnimals.MOD_ID, "textures/entity/subaru/subaru.png");
    }

    protected float getBob(SubaruEntity subaruEntity, float partialTick) {
        float f = MathHelper.lerp(partialTick, subaruEntity.oFlap, subaruEntity.flap);
        float f1 = MathHelper.lerp(partialTick, subaruEntity.oFlapSpeed, subaruEntity.flapSpeed);
        return (MathHelper.sin(f) + 1.0F) * f1;
    }
}

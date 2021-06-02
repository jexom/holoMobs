package jexom.holomobs.client.renderer;

import jexom.holomobs.HoloMobs;
import jexom.holomobs.client.model.KiaraModel;
import jexom.holomobs.entity.KiaraEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nonnull;

public class KiaraRenderer extends MobRenderer<KiaraEntity, KiaraModel<KiaraEntity>> {

    public KiaraRenderer(EntityRendererManager renderManager) {
        super(renderManager, new KiaraModel<>(), 0.5F);
    }

    @Override
    @Nonnull
    public ResourceLocation getTextureLocation(@Nonnull KiaraEntity kiara) {
        return new ResourceLocation(HoloMobs.MOD_ID, "textures/entity/kiara.png");
    }

    protected float getBob(KiaraEntity kiaraEntity, float partialTick) {
        float f = MathHelper.lerp(partialTick, kiaraEntity.oFlap, kiaraEntity.flap);
        float f1 = MathHelper.lerp(partialTick, kiaraEntity.oFlapSpeed, kiaraEntity.flapSpeed);
        return (MathHelper.sin(f) + 1.0F) * f1;
    }
}

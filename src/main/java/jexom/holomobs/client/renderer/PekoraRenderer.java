package jexom.holomobs.client.renderer;

import jexom.holomobs.HoloMobs;
import jexom.holomobs.client.model.PekoraModel;
import jexom.holomobs.entity.PekoraEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class PekoraRenderer extends MobRenderer<PekoraEntity, PekoraModel<PekoraEntity>> {

    public PekoraRenderer(EntityRendererManager renderManager) {
        super(renderManager, new PekoraModel<>(), 0.5F);
    }

    @Override
    @Nonnull
    public ResourceLocation getTextureLocation(@Nonnull PekoraEntity Pekora) {
        return new ResourceLocation(HoloMobs.MOD_ID, "textures/entity/pekora.png");
    }
}

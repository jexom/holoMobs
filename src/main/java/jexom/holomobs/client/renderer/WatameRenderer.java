package jexom.holomobs.client.renderer;

import jexom.holomobs.HoloAnimals;
import jexom.holomobs.client.model.WatameModel;
import jexom.holomobs.entity.WatameEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;


public class WatameRenderer extends MobRenderer<WatameEntity, WatameModel<WatameEntity>> {

    public WatameRenderer(EntityRendererManager renderManager) {
        super(renderManager, new WatameModel<>(), 0.8F);
    }

    @Override
    @Nonnull
    public ResourceLocation getTextureLocation(@Nonnull WatameEntity watame) {
        return new ResourceLocation(HoloAnimals.MOD_ID, "textures/entity/watame/watame.png");
    }
}

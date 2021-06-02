package jexom.holomobs.client.renderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import jexom.holomobs.HoloMobs;
import jexom.holomobs.client.model.KoroneModel;
import jexom.holomobs.entity.KoroneEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class KoroneRenderer extends MobRenderer<KoroneEntity, KoroneModel<KoroneEntity>> {
    public KoroneRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new KoroneModel<>(), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(KoroneEntity p_110775_1_) {
        return new ResourceLocation(HoloMobs.MOD_ID, "textures/entity/korone.png");
    }

    protected float getBob(KoroneEntity p_77044_1_, float p_77044_2_) {
        return p_77044_1_.getTailAngle();
    }

    public void render(KoroneEntity p_225623_1_, float p_225623_2_, float p_225623_3_, MatrixStack p_225623_4_, IRenderTypeBuffer p_225623_5_, int p_225623_6_) {
        if (p_225623_1_.isWet()) {
            float f = p_225623_1_.getWetShade(p_225623_3_);
            this.model.setColor(f, f, f);
        }

        super.render(p_225623_1_, p_225623_2_, p_225623_3_, p_225623_4_, p_225623_5_, p_225623_6_);
        if (p_225623_1_.isWet()) {
            this.model.setColor(1.0F, 1.0F, 1.0F);
        }

    }
}

package jexom.holomobs.client.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import jexom.holomobs.entity.PekoraEntity;
import net.minecraft.client.renderer.entity.model.RabbitModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class PekoraModel<T extends PekoraEntity> extends RabbitModel<T> {
    private final ModelRenderer rearFootLeft = new ModelRenderer(this, 26, 24);
    private final ModelRenderer rearFootRight;
    private final ModelRenderer haunchLeft;
    private final ModelRenderer haunchRight;
    private final ModelRenderer body;
    private final ModelRenderer frontLegLeft;
    private final ModelRenderer frontLegRight;
    private final ModelRenderer head;
    private final ModelRenderer earRight;
    private final ModelRenderer earLeft;
    private final ModelRenderer tail;
    private final ModelRenderer nose;

    private final ModelRenderer hairR;
    private final ModelRenderer hairL;
    private final ModelRenderer head_sub_2;

    private float jumpRotation;

    public PekoraModel() {
        rearFootLeft.setPos(-3.0F, 14.5F, 4.2F);
        rearFootLeft.texOffs(26, 24).addBox(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F, 0.0F, false);

        rearFootRight = new ModelRenderer(this);
        rearFootRight.setPos(3.0F, 14.5F, 4.2F);
        rearFootRight.texOffs(8, 24).addBox(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F, 0.0F, false);

        haunchLeft = new ModelRenderer(this);
        haunchLeft.setPos(-3.0F, 16.0F, 2.5F);
        haunchLeft.texOffs(16, 15).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);

        haunchRight = new ModelRenderer(this);
        haunchRight.setPos(3.0F, 16.0F, 2.5F);
        haunchRight.texOffs(30, 15).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 16.0F, 7.0F);
        body.texOffs(0, 0).addBox(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F, 0.0F, false);

        frontLegLeft = new ModelRenderer(this);
        frontLegLeft.setPos(-3.0F, 17.0F, -3.0F);
        frontLegLeft.texOffs(8, 15).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        frontLegRight = new ModelRenderer(this);
        frontLegRight.setPos(3.0F, 17.0F, -3.0F);
        frontLegRight.texOffs(0, 15).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, 16.5F, -3.0F);
        head.texOffs(32, 0).addBox(-2.5F, -4.0F, -5.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);
        head.texOffs(0, 0).addBox(-0.5F, 0.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        head.texOffs(0, 0).addBox(-0.5F, 1.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        head.texOffs(0, 0).addBox(-1.5F, 2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        head.texOffs(0, 0).addBox(-1.5F, 0.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        head.texOffs(0, 0).addBox(-1.5F, 0.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        head.texOffs(0, 0).addBox(0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        hairR = new ModelRenderer(this);
        hairR.setPos(5.5F, 0.0F, -1.0F);
        head.addChild(hairR);
        hairR.texOffs(52, 11).addBox(-3.0F, -3.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        hairR.texOffs(48, 9).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        hairR.texOffs(52, 13).addBox(-4.0F, -3.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        hairR.texOffs(52, 26).addBox(-3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        hairR.texOffs(52, 15).addBox(-2.0F, -2.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        hairR.texOffs(52, 18).addBox(-1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        hairR.texOffs(52, 21).addBox(0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        hairR.texOffs(52, 24).addBox(0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        hairL = new ModelRenderer(this);
        hairL.setPos(-6.5F, -2.0F, -1.0F);
        head.addChild(hairL);


        head_sub_2 = new ModelRenderer(this);
        head_sub_2.setPos(0.0F, 0.0F, 0.0F);
        hairL.addChild(head_sub_2);
        head_sub_2.texOffs(58, 11).addBox(3.0F, -1.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        head_sub_2.texOffs(58, 13).addBox(2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        head_sub_2.texOffs(58, 15).addBox(2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        head_sub_2.texOffs(58, 18).addBox(1.0F, 1.0F, 1.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
        head_sub_2.texOffs(60, 24).addBox(0.0F, 3.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        head_sub_2.texOffs(48, 11).addBox(2.0F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        head_sub_2.texOffs(60, 22).addBox(0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        head_sub_2.texOffs(48, 9).addBox(-1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        earRight = new ModelRenderer(this);
        earRight.setPos(0.0F, 16.5F, -3.0F);
        earRight.texOffs(52, 0).addBox(-2.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);

        earLeft = new ModelRenderer(this);
        earLeft.setPos(0.0F, 16.5F, -3.0F);
        earLeft.texOffs(58, 0).addBox(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 17.25F, 6.5F);
        tail.texOffs(52, 6).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

        nose = new ModelRenderer(this);
        nose.setPos(0.0F, 16.5F, -3.0F);
        nose.texOffs(32, 9).addBox(-0.5F, -1.25F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder vertexBuilder, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
            matrixStack.pushPose();
            matrixStack.scale(0.6F, 0.6F, 0.6F);
            matrixStack.translate(0.0D, 1.0D, 0.0D);
            ImmutableList.of(this.rearFootLeft, this.rearFootRight, this.haunchLeft, this.haunchRight, this.body, this.frontLegLeft, this.frontLegRight, this.head, this.earRight, this.earLeft, this.tail, this.nose).forEach((p_228290_8_) -> {
                p_228290_8_.render(matrixStack, vertexBuilder, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
            });
            matrixStack.popPose();
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {
        float f = p_225597_4_ - (float)p_225597_1_.tickCount;
        this.nose.xRot = p_225597_6_ * ((float)Math.PI / 180F);
        this.head.xRot = p_225597_6_ * ((float)Math.PI / 180F);
        this.earRight.xRot = p_225597_6_ * ((float)Math.PI / 180F);
        this.earLeft.xRot = p_225597_6_ * ((float)Math.PI / 180F);
        this.nose.yRot = p_225597_5_ * ((float)Math.PI / 180F);
        this.head.yRot = p_225597_5_ * ((float)Math.PI / 180F);
        this.earRight.yRot = this.nose.yRot - 0.2617994F;
        this.earLeft.yRot = this.nose.yRot + 0.2617994F;
        this.jumpRotation = MathHelper.sin(p_225597_1_.getJumpCompletion(f) * (float)Math.PI);
        this.haunchLeft.xRot = (this.jumpRotation * 50.0F - 21.0F) * ((float)Math.PI / 180F);
        this.haunchRight.xRot = (this.jumpRotation * 50.0F - 21.0F) * ((float)Math.PI / 180F);
        this.rearFootLeft.xRot = this.jumpRotation * 50.0F * ((float)Math.PI / 180F);
        this.rearFootRight.xRot = this.jumpRotation * 50.0F * ((float)Math.PI / 180F);
        this.frontLegLeft.xRot = (this.jumpRotation * -40.0F - 11.0F) * ((float)Math.PI / 180F);
        this.frontLegRight.xRot = (this.jumpRotation * -40.0F - 11.0F) * ((float)Math.PI / 180F);
    }

    @Override
    public void prepareMobModel(T p_212843_1_, float p_212843_2_, float p_212843_3_, float p_212843_4_) {
        super.prepareMobModel(p_212843_1_, p_212843_2_, p_212843_3_, p_212843_4_);
        this.jumpRotation = MathHelper.sin(p_212843_1_.getJumpCompletion(p_212843_4_) * (float)Math.PI);
    }
}
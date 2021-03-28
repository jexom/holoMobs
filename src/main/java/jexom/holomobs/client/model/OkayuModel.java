package jexom.holomobs.client.model;

import com.google.common.collect.ImmutableList;
import jexom.holomobs.entity.OkayuEntity;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.entity.model.ModelUtils;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class OkayuModel<T extends OkayuEntity> extends AgeableModel<T> {
    private final ModelRenderer backLegL;
    private final ModelRenderer backLegR;
    private final ModelRenderer frontLegL;
    private final ModelRenderer frontLegR;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer head;
    private final ModelRenderer body;
    private final ModelRenderer hair;
    private final ModelRenderer rotation_r1;
    private float lieDownAmount;
    private float lieDownAmountTail;
    private float relaxStateOneAmount;
    protected int state = 1;

    public OkayuModel() {

        backLegL = new ModelRenderer(this);
        backLegL.setPos(-1.1F, 18.0F, 5.0F);
        backLegL.texOffs(8, 17).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

        backLegR = new ModelRenderer(this);
        backLegR.setPos(1.1F, 18.0F, 5.0F);
        backLegR.texOffs(14, 24).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

        frontLegL = new ModelRenderer(this);
        frontLegL.setPos(-1.2F, 14.0F, -5.0F);
        frontLegL.texOffs(40, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);

        frontLegR = new ModelRenderer(this);
        frontLegR.setPos(1.2F, 14.0F, -5.0F);
        frontLegR.texOffs(40, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);

        tail1 = new ModelRenderer(this);
        tail1.setPos(0.0F, 14.5F, 9.0F);
        tail1.texOffs(0, 19).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

        tail2 = new ModelRenderer(this);
        tail2.setPos(0.0F, 22.5F, 9.0F);
        tail2.texOffs(4, 19).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, 15.0F, -9.0F);
        head.texOffs(0, 0).addBox(-2.5F, -4.0F, -3.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
        head.texOffs(0, 28).addBox(-1.5F, -0.02F, -4.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
        head.texOffs(0, 14).addBox(-2.75F, -6.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        head.texOffs(6, 14).addBox(0.75F, -6.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        hair = new ModelRenderer(this);
        hair.setPos(0.0F, 0.0F, 0.0F);
        head.addChild(hair);
        hair.texOffs(60, 24).addBox(2.0F, -3.5F, -3.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
        hair.texOffs(60, 24).addBox(-3.0F, -3.5F, -3.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
        hair.texOffs(52, 21).addBox(-3.5F, -3.5F, -3.0F, 1.0F, 6.0F, 5.0F, 0.0F, false);
        hair.texOffs(42, 26).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
        hair.texOffs(50, 25).addBox(-3.0F, -3.5F, 1.5F, 6.0F, 6.0F, 1.0F, 0.0F, false);
        hair.texOffs(52, 21).addBox(2.5F, -3.5F, -3.0F, 1.0F, 6.0F, 5.0F, 0.0F, false);
        hair.texOffs(58, 30).addBox(0.0F, -3.5F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        hair.texOffs(60, 30).addBox(0.0F, -2.5F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        hair.texOffs(58, 30).addBox(-2.0F, -3.5F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        hair.texOffs(60, 28).addBox(-1.0F, -2.5F, -3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 6.0F, 6.1F);


        rotation_r1 = new ModelRenderer(this);
        rotation_r1.setPos(0.0F, 11.0F, -5.1F);
        body.addChild(rotation_r1);
        rotation_r1.texOffs(20, 0).addBox(-2.0F, -8.0F, -2.9F, 4.0F, 16.0F, 6.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {
        this.head.xRot = p_225597_6_ * ((float) Math.PI / 180F);
        this.head.yRot = p_225597_5_ * ((float) Math.PI / 180F);
        if (this.state != 3) {
            this.body.xRot = ((float) Math.PI / 2F);
            if (this.state == 2) {
                this.backLegL.xRot = MathHelper.cos(p_225597_2_ * 0.6662F) * p_225597_3_;
                this.backLegR.xRot = MathHelper.cos(p_225597_2_ * 0.6662F + 0.3F) * p_225597_3_;
                this.frontLegL.xRot = MathHelper.cos(p_225597_2_ * 0.6662F + (float) Math.PI + 0.3F) * p_225597_3_;
                this.frontLegR.xRot = MathHelper.cos(p_225597_2_ * 0.6662F + (float) Math.PI) * p_225597_3_;
                this.tail2.xRot = 1.7278761F + ((float) Math.PI / 10F) * MathHelper.cos(p_225597_2_) * p_225597_3_;
            } else {
                this.backLegL.xRot = MathHelper.cos(p_225597_2_ * 0.6662F) * p_225597_3_;
                this.backLegR.xRot = MathHelper.cos(p_225597_2_ * 0.6662F + (float) Math.PI) * p_225597_3_;
                this.frontLegL.xRot = MathHelper.cos(p_225597_2_ * 0.6662F + (float) Math.PI) * p_225597_3_;
                this.frontLegR.xRot = MathHelper.cos(p_225597_2_ * 0.6662F) * p_225597_3_;
                if (this.state == 1) {
                    this.tail2.xRot = 1.7278761F + ((float) Math.PI / 4F) * MathHelper.cos(p_225597_2_) * p_225597_3_;
                } else {
                    this.tail2.xRot = 1.7278761F + 0.47123894F * MathHelper.cos(p_225597_2_) * p_225597_3_;
                }
            }
        }

        if (this.lieDownAmount > 0.0F) {
            this.head.zRot = ModelUtils.rotlerpRad(this.head.zRot, -1.2707963F, this.lieDownAmount);
            this.head.yRot = ModelUtils.rotlerpRad(this.head.yRot, 1.2707963F, this.lieDownAmount);
            this.frontLegL.xRot = -1.2707963F;
            this.frontLegR.xRot = -0.47079635F;
            this.frontLegR.zRot = -0.2F;
            this.frontLegR.x = -0.2F;
            this.backLegL.xRot = -0.4F;
            this.backLegR.xRot = 0.5F;
            this.backLegR.zRot = -0.5F;
            this.backLegR.x = -0.3F;
            this.backLegR.y = 20.0F;
            this.tail1.xRot = ModelUtils.rotlerpRad(this.tail1.xRot, 0.8F, this.lieDownAmountTail);
            this.tail2.xRot = ModelUtils.rotlerpRad(this.tail2.xRot, -0.4F, this.lieDownAmountTail);
        } else {
            this.frontLegR.x = 1.2F;
            this.backLegR.x = 1.2F;
        }

        if (this.relaxStateOneAmount > 0.0F) {
            this.head.xRot = ModelUtils.rotlerpRad(this.head.xRot, -0.58177644F, this.relaxStateOneAmount);
        }
    }

    protected Iterable<ModelRenderer> headParts() {
        return ImmutableList.of(this.head);
    }

    protected Iterable<ModelRenderer> bodyParts() {
        return ImmutableList.of(this.body, this.backLegL, this.backLegR, this.frontLegL, this.frontLegR, this.tail1, this.tail2);
    }

    public void prepareMobModel(T p_212843_1_, float p_212843_2_, float p_212843_3_, float p_212843_4_) {
        this.lieDownAmount = p_212843_1_.getLieDownAmount(p_212843_4_);
        this.lieDownAmountTail = p_212843_1_.getLieDownAmountTail(p_212843_4_);
        this.relaxStateOneAmount = p_212843_1_.getRelaxStateOneAmount(p_212843_4_);
        if (this.lieDownAmount <= 0.0F) {
            this.head.xRot = 0.0F;
            this.head.zRot = 0.0F;
            this.frontLegL.xRot = 0.0F;
            this.frontLegL.zRot = 0.0F;
            this.frontLegR.xRot = 0.0F;
            this.frontLegR.zRot = 0.0F;
            this.backLegL.xRot = 0.0F;
            this.backLegR.xRot = 0.0F;
            this.backLegR.zRot = 0.0F;
        }

        this.body.y = 12.0F;
        this.body.z = -10.0F;
        this.head.y = 15.0F;
        this.head.z = -9.0F;
        this.tail1.y = 15.0F;
        this.tail1.z = 8.0F;
        this.tail2.y = 20.0F;
        this.tail2.z = 14.0F;
        this.frontLegL.y = 14.1F;
        this.frontLegL.z = -5.0F;
        this.frontLegR.y = 14.1F;
        this.frontLegR.z = -5.0F;
        this.backLegL.y = 18.0F;
        this.backLegL.z = 5.0F;
        this.backLegR.y = 18.0F;
        this.backLegR.z = 5.0F;
        this.tail1.xRot = 0.9F;
        if (p_212843_1_.isCrouching()) {
            ++this.body.y;
            this.head.y += 2.0F;
            ++this.tail1.y;
            this.tail2.y += -4.0F;
            this.tail2.z += 2.0F;
            this.tail1.xRot = ((float) Math.PI / 2F);
            this.tail2.xRot = ((float) Math.PI / 2F);
            this.state = 0;
        } else if (p_212843_1_.isSprinting()) {
            this.tail2.y = this.tail1.y;
            this.tail2.z += 2.0F;
            this.tail1.xRot = ((float) Math.PI / 2F);
            this.tail2.xRot = ((float) Math.PI / 2F);
            this.state = 2;
        } else {
            this.state = 1;
        }

        if (p_212843_1_.isInSittingPose()) {
            this.body.xRot = ((float) Math.PI / 4F);
            this.body.y += -4.0F;
            this.body.z += 5.0F;
            this.head.y += -3.3F;
            ++this.head.z;
            this.tail1.y += 8.0F;
            this.tail1.z += -2.0F;
            this.tail2.y += 2.0F;
            this.tail2.z += -0.8F;
            this.tail1.xRot = 1.7278761F;
            this.tail2.xRot = 2.670354F;
            this.frontLegL.xRot = -0.15707964F;
            this.frontLegL.y = 16.1F;
            this.frontLegL.z = -7.0F;
            this.frontLegR.xRot = -0.15707964F;
            this.frontLegR.y = 16.1F;
            this.frontLegR.z = -7.0F;
            this.backLegL.xRot = (-(float) Math.PI / 2F);
            this.backLegL.y = 21.0F;
            this.backLegL.z = 1.0F;
            this.backLegR.xRot = (-(float) Math.PI / 2F);
            this.backLegR.y = 21.0F;
            this.backLegR.z = 1.0F;
            this.state = 3;
        }
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}

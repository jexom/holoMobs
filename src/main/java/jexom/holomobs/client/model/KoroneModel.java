package jexom.holomobs.client.model;

import com.google.common.collect.ImmutableList;
import jexom.holomobs.entity.KoroneEntity;
import net.minecraft.client.renderer.entity.model.TintedAgeableModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class KoroneModel<T extends KoroneEntity> extends TintedAgeableModel<T> {

    private final ModelRenderer head;
    private final ModelRenderer head_r1;
    private final ModelRenderer head_r2;
    private final ModelRenderer hair;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hairLeft;
    private final ModelRenderer braidLeft;
    private final ModelRenderer hairRight;
    private final ModelRenderer braidRight;
    private final ModelRenderer body;
    private final ModelRenderer body_rotation;
    private final ModelRenderer body_sub_1;
    private final ModelRenderer upperBody;
    private final ModelRenderer upperBody_rotation;
    private final ModelRenderer upperBody_sub_1;
    private final ModelRenderer leg0;
    private final ModelRenderer leg1;
    private final ModelRenderer leg2;
    private final ModelRenderer leg3;
    private final ModelRenderer tail;

    public KoroneModel() {
        texWidth = 64;
        texHeight = 64;

        head = new ModelRenderer(this);
        head.setPos(1.0F, 13.5F, -7.0F);
        head.texOffs(0, 0).addBox(-4.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
        head.texOffs(0, 10).addBox(-2.5F, -0.02F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

        head_r1 = new ModelRenderer(this);
        head_r1.setPos(-5.0F, -2.0F, -0.5F);
        head.addChild(head_r1);
        setRotationAngle(head_r1, -0.3927F, 1.5708F, 0.0F);
        head_r1.texOffs(16, 14).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);

        head_r2 = new ModelRenderer(this);
        head_r2.setPos(3.0F, -2.0F, -0.5F);
        head.addChild(head_r2);
        setRotationAngle(head_r2, -0.3927F, -1.5708F, 0.0F);
        head_r2.texOffs(16, 14).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        hair = new ModelRenderer(this);
        hair.setPos(-1.0F, 0.5F, 0.0F);
        head.addChild(hair);
        hair.texOffs(59, 41).addBox(-0.5F, -2.5F, -2.25F, 1.0F, 1.0F, 1.0F, 0.01F, false);
        hair.texOffs(58, 41).addBox(-1.0F, -3.5F, -2.5F, 2.0F, 1.0F, 1.0F, 0.01F, false);
        hair.texOffs(24, 62).addBox(0.75F, -4.85F, -3.0F, 1.5F, 1.0F, 1.0F, -0.3F, false);
        hair.texOffs(24, 62).addBox(0.75F, -4.15F, -3.0F, 1.5F, 1.0F, 1.0F, -0.3F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, -3.5F, 2.5F);
        hair.addChild(cube_r1);
        setRotationAngle(cube_r1, -3.1416F, 0.0F, 0.0F);
        cube_r1.texOffs(50, 36).addBox(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, 0.01F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, -4.0F, 0.0F);
        hair.addChild(cube_r2);
        setRotationAngle(cube_r2, -1.5708F, 0.0F, 0.0F);
        cube_r2.texOffs(50, 37).addBox(-3.0F, -2.5F, -0.5F, 6.0F, 5.0F, 1.0F, 0.01F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, -3.5F, 2.5F);
        hair.addChild(cube_r3);
        setRotationAngle(cube_r3, -1.5708F, 0.0F, 0.0F);
        cube_r3.texOffs(58, 41).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.01F, false);
        cube_r3.texOffs(59, 41).addBox(-0.5F, 1.0F, 0.25F, 1.0F, 1.0F, 1.0F, 0.01F, false);

        hairLeft = new ModelRenderer(this);
        hairLeft.setPos(2.0F, -2.5F, -2.5F);
        hair.addChild(hairLeft);
        hairLeft.texOffs(59, 41).addBox(0.0F, 3.0F, 0.25F, 1.0F, 1.0F, 1.0F, 0.01F, false);
        hairLeft.texOffs(59, 38).addBox(1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.01F, false);
        hairLeft.texOffs(54, 33).addBox(1.0F, -1.0F, 1.0F, 1.0F, 6.0F, 4.0F, 0.01F, false);
        hairLeft.texOffs(59, 40).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.01F, false);

        braidLeft = new ModelRenderer(this);
        braidLeft.setPos(2.0F, 4.0F, 3.0F);
        hairLeft.addChild(braidLeft);
        braidLeft.texOffs(54, 31).addBox(-1.0F, 2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        braidLeft.texOffs(57, 38).addBox(-1.0F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        hairRight = new ModelRenderer(this);
        hairRight.setPos(-2.0F, -2.5F, -2.5F);
        hair.addChild(hairRight);
        hairRight.texOffs(59, 41).addBox(-1.0F, 3.0F, 0.25F, 1.0F, 1.0F, 1.0F, 0.01F, true);
        hairRight.texOffs(59, 38).addBox(-2.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.01F, true);
        hairRight.texOffs(54, 33).addBox(-2.0F, -1.0F, 1.0F, 1.0F, 6.0F, 4.0F, 0.01F, true);
        hairRight.texOffs(59, 40).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.01F, true);

        braidRight = new ModelRenderer(this);
        braidRight.setPos(-2.0F, 4.0F, 3.0F);
        hairRight.addChild(braidRight);
        braidRight.texOffs(54, 31).addBox(0.0F, 2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, true);
        braidRight.texOffs(57, 38).addBox(0.0F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, true);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 14.0F, 2.0F);


        body_rotation = new ModelRenderer(this);
        body_rotation.setPos(0.0F, 0.0F, 0.0F);
        body.addChild(body_rotation);
        setRotationAngle(body_rotation, 1.5708F, 0.0F, 0.0F);


        body_sub_1 = new ModelRenderer(this);
        body_sub_1.setPos(0.0F, 0.0F, 0.0F);
        body_rotation.addChild(body_sub_1);
        body_sub_1.texOffs(0, 44).addBox(-3.0F, -7.0F, -3.0F, 6.0F, 14.0F, 6.0F, 0.0F, false);

        upperBody = new ModelRenderer(this);
        upperBody.setPos(1.0F, 14.0F, 2.0F);
        body.addChild(upperBody);

        upperBody_rotation = new ModelRenderer(this);
        upperBody_rotation.setPos(-1.0F, 2.5F, -2.5F);
        upperBody.addChild(upperBody_rotation);
        setRotationAngle(upperBody_rotation, 1.5708F, 0.0F, 0.0F);

        upperBody_sub_1 = new ModelRenderer(this);
        upperBody_sub_1.setPos(0.0F, 0.0F, 0.0F);
        upperBody_rotation.addChild(upperBody_sub_1);
        upperBody_sub_1.texOffs(32, 45).addBox(-4.0F, -5.5F, -1.5F, 8.0F, 11.0F, 8.0F, -0.7F, false);

        leg0 = new ModelRenderer(this);
        leg0.setPos(2.5F, 16.0F, 7.0F);
        leg0.texOffs(0, 18).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

        leg1 = new ModelRenderer(this);
        leg1.setPos(-0.5F, 16.0F, 7.0F);
        leg1.texOffs(0, 18).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setPos(2.5F, 16.0F, -4.0F);
        leg2.texOffs(0, 18).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        leg2.texOffs(0, 28).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.2F, false);

        leg3 = new ModelRenderer(this);
        leg3.setPos(-0.5F, 16.0F, -4.0F);
        leg3.texOffs(0, 18).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        leg3.texOffs(0, 28).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.2F, false);

        tail = new ModelRenderer(this);
        tail.setPos(1.0F, 12.0F, 10.0F);
        tail.texOffs(9, 18).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    protected Iterable<ModelRenderer> headParts() {
        return ImmutableList.of(head);
    }

    @Override
    protected Iterable<ModelRenderer> bodyParts() {
        return ImmutableList.of(this.body, this.leg0, this.leg1, this.leg2, this.leg3, this.tail);
    }

    public void prepareMobModel(T p_212843_1_, float p_212843_2_, float p_212843_3_, float p_212843_4_) {
        this.tail.yRot = MathHelper.cos(p_212843_2_ * 0.6662F) * 1.4F * p_212843_3_;
        upperBody.setPos(1.0F, 0.0F, 0.0F);

        if (p_212843_1_.isInSittingPose()) {
            this.body.setPos(0.0F, 18.0F, 0.0F);
            this.body.xRot = -((float) Math.PI / 4F);
            this.tail.setPos(1F, 21.0F, 6.0F);
            this.leg0.setPos(-0.5F, 22.7F, 2.0F);
            this.leg0.xRot = ((float) Math.PI * 1.5F);
            this.leg1.setPos(2.5F, 22.7F, 2.0F);
            this.leg1.xRot = ((float) Math.PI * 1.5F);
            this.leg2.xRot = 5.811947F;
            this.leg2.setPos(-0.5F, 17.0F, -4.0F);
            this.leg3.xRot = 5.811947F;
            this.leg3.setPos(2.5F, 17.0F, -4.0F);
            this.head.y = 12f;
        } else {
            this.body.setPos(0.0F, 14.0F, 2.0F);
            this.body.xRot = 0;
            this.tail.setPos(1F, 12.0F, 8.0F);
            this.leg0.setPos(-0.5F, 16.0F, 7.0F);
            this.leg1.setPos(2.5F, 16.0F, 7.0F);
            this.leg2.setPos(-0.5F, 16.0F, -4.0F);
            this.leg3.setPos(2.5F, 16.0F, -4.0F);
            this.leg0.xRot = MathHelper.cos(p_212843_2_ * 0.6662F) * 1.4F * p_212843_3_;
            this.leg1.xRot = MathHelper.cos(p_212843_2_ * 0.6662F + (float) Math.PI) * 1.4F * p_212843_3_;
            this.leg2.xRot = MathHelper.cos(p_212843_2_ * 0.6662F + (float) Math.PI) * 1.4F * p_212843_3_;
            this.leg3.xRot = MathHelper.cos(p_212843_2_ * 0.6662F) * 1.4F * p_212843_3_;
            this.head.y = 13.5f;
        }

        this.head.zRot = p_212843_1_.getHeadRollAngle(p_212843_4_) + p_212843_1_.getBodyRollAngle(p_212843_4_, 0.0F);
        this.braidLeft.zRot = -head.zRot;
        this.braidRight.zRot = -head.zRot;
        this.upperBody.zRot = p_212843_1_.getBodyRollAngle(p_212843_4_, -0.08F);
        this.body.zRot = p_212843_1_.getBodyRollAngle(p_212843_4_, -0.16F);
        this.tail.zRot = p_212843_1_.getBodyRollAngle(p_212843_4_, -0.2F);
    }

    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {
        this.head.xRot = p_225597_6_ * ((float) Math.PI / 180F);
        this.head.yRot = p_225597_5_ * ((float) Math.PI / 180F);
        this.tail.xRot = p_225597_4_;
        this.braidLeft.xRot = -head.xRot;
        this.braidRight.xRot = -head.xRot;
    }
}

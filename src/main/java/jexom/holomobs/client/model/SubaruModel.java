package jexom.holomobs.client.model;

import com.google.common.collect.ImmutableList;
import jexom.holomobs.entity.SubaruEntity;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SubaruModel<T extends SubaruEntity> extends AgeableModel<T> {

    private final ModelRenderer head;
    private final ModelRenderer body;
    private final ModelRenderer body_r1;
    private final ModelRenderer tail;
    private final ModelRenderer legRight;
    private final ModelRenderer legLeft;
    private final ModelRenderer wingRight;
    private final ModelRenderer wingLeft;

    public SubaruModel() {

        body = new ModelRenderer(this);
        body.setPos(0, 12, 2);

        body_r1 = new ModelRenderer(this);
        body_r1.setPos(0.0F, 6.0F, -1.0F);
        body.addChild(body_r1);
        setRotationAngle(body_r1, 1.5708F, 0.0F, 0.0F);
        body_r1.texOffs(2, 10).addBox(-3.0F, -5.0F, -2.0F, 6.0F, 10.0F, 4.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, 15.0F, -4.0F);
        head.texOffs(0, 0).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        head.texOffs(16, 6).addBox(-2.0F, -3.0F, 2.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
        head.texOffs(28, 9).addBox(-1.5F, -0.5F, -4.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(-0.5F, 23.5F, 0.5F);
        tail.texOffs(12, 19).addBox(-1.0F, -7.5F, 4.5F, 3.0F, 2.0F, 3.0F, -0.1F, false);

        legRight = new ModelRenderer(this);
        legRight.setPos(2.0F, 20.0F, 1.0F);
        legRight.texOffs(26, 0).addBox(-2.0F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

        legLeft = new ModelRenderer(this);
        legLeft.setPos(-1.0F, 20.0F, 1.0F);
        legLeft.texOffs(26, 0).addBox(-2.0F, 0.0F, -3.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

        wingRight = new ModelRenderer(this);
        wingRight.setPos(4, 16, 0);
        wingRight.texOffs(24, 13).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        wingLeft = new ModelRenderer(this);
        wingLeft.setPos(-4, 16, 0);
        wingLeft.texOffs(24, 13).addBox(0.0F, 0.0F, -2.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);
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
        return ImmutableList.of(body, tail, legRight, legLeft, wingRight, wingLeft);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.xRot = headPitch * ((float) Math.PI / 180F);
        this.head.yRot = netHeadYaw * ((float) Math.PI / 180F);
        if (!entity.isInWater()) {
            this.legLeft.xRot = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            this.legRight.xRot = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        } else {
            this.legLeft.xRot = MathHelper.cos(limbSwing * 3) * 2 * limbSwingAmount + (float) Math.PI / 3f;
            this.legRight.xRot = MathHelper.cos(limbSwing * 3 + (float) Math.PI) * 2 * limbSwingAmount + (float) Math.PI / 3f;
        }
        this.wingLeft.zRot = ageInTicks;
        this.wingRight.zRot = -ageInTicks;
        this.tail.yRot = 0;
    }

    @Override
    public void prepareMobModel(T entity, float limbSwing, float limbSwingAmount, float partialTick) {
    }
}

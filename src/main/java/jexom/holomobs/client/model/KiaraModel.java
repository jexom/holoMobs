package jexom.holomobs.client.model;

import com.google.common.collect.ImmutableList;
import jexom.holomobs.entity.KiaraEntity;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class KiaraModel<T extends KiaraEntity> extends AgeableModel<T> {

    private final ModelRenderer head;
    private final ModelRenderer hat_r1;
    private final ModelRenderer cook;
    private final ModelRenderer body;
    private final ModelRenderer rotation;
    private final ModelRenderer legRight;
    private final ModelRenderer legLeft;
    private final ModelRenderer wingRight;
    private final ModelRenderer wingLeft;
    private final ModelRenderer bill;
    private final ModelRenderer chin;

    public KiaraModel() {
        texWidth = 64;
        texHeight = 32;

        head = new ModelRenderer(this);
        head.setPos(0.0F, 15.0F, -4.0F);
        head.texOffs(0, 0).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);

        hat_r1 = new ModelRenderer(this);
        hat_r1.setPos(-1.0F, -5.5F, -0.25F);
        head.addChild(hat_r1);
        setRotationAngle(hat_r1, -0.3054F, 0.0F, -0.5236F);
        hat_r1.texOffs(38, 18).addBox(-1.45F, -1.35F, -1.5F, 3.0F, 2.0F, 3.0F, -0.1F, false);

        cook = new ModelRenderer(this);
        cook.setPos(1.5F, -5.5F, -0.5F);
        head.addChild(cook);
        setRotationAngle(cook, 0.0F, 0.0F, 0.7854F);
        cook.texOffs(50, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cook.texOffs(50, 18).addBox(-1.5F, -2.75F, -1.5F, 3.0F, 2.0F, 3.0F, -0.75F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 16.0F, 0.0F);


        rotation = new ModelRenderer(this);
        rotation.setPos(0.0F, 0.0F, 0.0F);
        body.addChild(rotation);
        setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);
        rotation.texOffs(0, 9).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);

        legRight = new ModelRenderer(this);
        legRight.setPos(2.0F, 19.0F, 1.0F);
        legRight.texOffs(26, 0).addBox(-2.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

        legLeft = new ModelRenderer(this);
        legLeft.setPos(-1.0F, 19.0F, 1.0F);
        legLeft.texOffs(26, 0).addBox(-2.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

        wingRight = new ModelRenderer(this);
        wingRight.setPos(-3.0F, 13.0F, -1.0F);
        wingRight.texOffs(24, 13).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        wingLeft = new ModelRenderer(this);
        wingLeft.setPos(3.0F, 13.0F, -1.0F);
        wingLeft.texOffs(24, 13).addBox(0.0F, 0.0F, -2.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);

        bill = new ModelRenderer(this);
        bill.setPos(0.0F, 15.0F, -4.0F);
        bill.texOffs(14, 0).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);

        chin = new ModelRenderer(this);
        chin.setPos(0.0F, 15.0F, -4.0F);
        chin.texOffs(14, 4).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        head.addChild(bill);
        head.addChild(chin);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    protected Iterable<ModelRenderer> headParts() {
        return ImmutableList.of(head, bill, chin);
    }

    @Override
    protected Iterable<ModelRenderer> bodyParts() {
        return ImmutableList.of(body, legRight, legLeft, wingRight, wingLeft);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.xRot = headPitch * ((float) Math.PI / 180F);
        this.head.yRot = netHeadYaw * ((float) Math.PI / 180F);

        this.legLeft.xRot = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.legRight.xRot = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;

        this.wingRight.setPos(-3.0F, 13.0F, -1.0F);
        this.wingLeft.setPos(3.0F, 13.0F, -1.0F);
        this.wingLeft.zRot = -0;
        this.wingRight.zRot = 0;
    }

    @Override
    public void prepareMobModel(T entity, float limbSwing, float limbSwingAmount, float partialTick) {
    }
}

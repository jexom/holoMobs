package jexom.holomobs.client.model;

import jexom.holomobs.entity.WatameEntity;
import net.minecraft.client.renderer.entity.model.SheepModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class WatameModel<T extends WatameEntity> extends SheepModel<T> {
    private final ModelRenderer hair;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer sideHairRight;
    private final ModelRenderer sideHairLeft;
    private final ModelRenderer lashes;
    private final ModelRenderer rightLash;
    private final ModelRenderer leftLash;
    private final ModelRenderer horns;
    private final ModelRenderer hornRight;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer hornLeft;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;

    public WatameModel() {
        super();
        texWidth = 64;
        texHeight = 64;

        body = new ModelRenderer(this);
        body.setPos(0.0F, 5.0F, 2.0F);
        body.texOffs(36, 10).addBox(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, 1.5F, false);
        head = new ModelRenderer(this);
        head.setPos(0.0F, 6.0F, -8.0F);
        head.texOffs(0, 1).addBox(-4.0F, -5.0F, -6.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);

        hair = new ModelRenderer(this);
        hair.setPos(0.0F, 18.0F, 8.0F);
        head.addChild(hair);
        hair.texOffs(4, 35).addBox(-3.5F, -24.5F, -13.5F, 7.0F, 1.0F, 7.0F, 0.0F, false);
        hair.texOffs(2, 34).addBox(-4.0F, -24.0F, -14.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
        hair.texOffs(0, 33).addBox(-4.5F, -23.5F, -14.5F, 9.0F, 1.0F, 9.0F, 0.0F, false);
        hair.texOffs(9, 34).addBox(-4.0F, -23.0F, -6.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
        hair.texOffs(9, 34).addBox(4.0F, -23.0F, -14.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        hair.texOffs(9, 34).addBox(-5.0F, -23.0F, -14.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        hair.texOffs(7, 41).addBox(-4.0F, -23.0F, -15.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
        hair.texOffs(8, 41).addBox(-1.0F, -21.0F, -14.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        hair.texOffs(0, 40).addBox(2.05F, -23.8F, -14.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        hair.texOffs(8, 41).addBox(-1.0F, -22.0F, -14.75F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(-5.0F, -18.0F, -9.0F);
        hair.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        cube_r1.texOffs(11, 40).addBox(-2.0F, 0.5F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(5.0F, -18.0F, -9.0F);
        hair.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        cube_r2.texOffs(11, 40).addBox(1.0F, 0.5F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-5.25F, -18.5F, -9.0F);
        hair.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        cube_r3.texOffs(11, 40).addBox(-2.0F, 0.5F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(5.25F, -18.5F, -9.0F);
        hair.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, 1.5708F);
        cube_r4.texOffs(11, 40).addBox(1.0F, 0.5F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(-5.0F, -18.5F, -7.0F);
        hair.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, -1.5708F);
        cube_r5.texOffs(11, 40).addBox(-2.0F, 0.5F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(5.0F, -18.5F, -7.0F);
        hair.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, 1.5708F);
        cube_r6.texOffs(11, 40).addBox(1.0F, 0.5F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(-5.5F, -19.5F, -7.5F);
        hair.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, -1.5708F);
        cube_r7.texOffs(6, 35).addBox(-2.0F, 0.5F, -5.0F, 5.0F, 1.0F, 7.0F, 0.0F, true);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(-1.5F, -19.0F, -4.0F);
        hair.addChild(cube_r8);
        setRotationAngle(cube_r8, -1.5708F, 0.0F, 1.5708F);
        cube_r8.texOffs(7, 35).addBox(-3.0F, 0.5F, -5.0F, 5.0F, 1.0F, 7.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(-1.5F, -19.5F, -4.5F);
        hair.addChild(cube_r9);
        setRotationAngle(cube_r9, -1.5708F, 0.0F, 1.5708F);
        cube_r9.texOffs(4, 33).addBox(-3.0F, 0.5F, -6.0F, 5.0F, 1.0F, 9.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(5.5F, -19.5F, -7.5F);
        hair.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, 1.5708F);
        cube_r10.texOffs(6, 35).addBox(-3.0F, 0.5F, -5.0F, 5.0F, 1.0F, 7.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(-6.0F, -19.5F, -9.0F);
        hair.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0F, -1.5708F);
        cube_r11.texOffs(11, 40).addBox(-2.0F, 0.5F, -5.0F, 5.0F, 1.0F, 2.0F, 0.0F, true);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(6.0F, -19.5F, -9.0F);
        hair.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0F, 1.5708F);
        cube_r12.texOffs(11, 40).addBox(-3.0F, 0.5F, -5.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);

        sideHairRight = new ModelRenderer(this);
        sideHairRight.setPos(-1.0F, -21.5F, -14.25F);
        hair.addChild(sideHairRight);
        sideHairRight.texOffs(8, 41).addBox(-3.0F, -0.5F, -0.25F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        sideHairRight.texOffs(8, 41).addBox(-3.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        sideHairRight.texOffs(8, 34).addBox(-3.0F, 3.5F, -0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        sideHairRight.texOffs(8, 34).addBox(-4.0F, -1.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        sideHairLeft = new ModelRenderer(this);
        sideHairLeft.setPos(1.0F, -21.5F, -14.25F);
        hair.addChild(sideHairLeft);
        sideHairLeft.texOffs(8, 41).addBox(1.0F, -0.5F, -0.25F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        sideHairLeft.texOffs(8, 41).addBox(2.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        sideHairLeft.texOffs(8, 34).addBox(2.0F, 3.5F, -0.25F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        sideHairLeft.texOffs(8, 34).addBox(3.0F, -1.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

        lashes = new ModelRenderer(this);
        lashes.setPos(0.0F, 18.0F, 8.0F);
        head.addChild(lashes);


        rightLash = new ModelRenderer(this);
        rightLash.setPos(0.0F, 0.0F, 0.0F);
        lashes.addChild(rightLash);
        rightLash.texOffs(17, 30).addBox(-4.0F, -20.0F, -14.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        rightLash.texOffs(17, 30).addBox(-3.0F, -21.0F, -14.25F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        leftLash = new ModelRenderer(this);
        leftLash.setPos(5.0F, 0.0F, 0.0F);
        lashes.addChild(leftLash);
        leftLash.texOffs(17, 30).addBox(-2.0F, -20.0F, -14.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        leftLash.texOffs(17, 30).addBox(-4.0F, -21.0F, -14.25F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        horns = new ModelRenderer(this);
        horns.setPos(0.0F, 21.5F, 2.0F);
        head.addChild(horns);
        setRotationAngle(horns, -0.3491F, 0.0F, 0.0F);


        hornRight = new ModelRenderer(this);
        hornRight.setPos(-6.08F, -21.496F, -14.0367F);
        horns.addChild(hornRight);
        setRotationAngle(hornRight, 0.0F, 0.1745F, 0.0F);


        cube_r13 = new ModelRenderer(this);
        cube_r13.setPos(-0.32F, 0.796F, -0.1133F);
        hornRight.addChild(cube_r13);
        setRotationAngle(cube_r13, 2.0944F, 0.0F, -0.48F);
        cube_r13.texOffs(26, 30).addBox(-1.0F, -1.85F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setPos(-0.22F, 0.796F, -0.1133F);
        hornRight.addChild(cube_r14);
        setRotationAngle(cube_r14, 2.618F, 0.0F, -0.4363F);
        cube_r14.texOffs(26, 30).addBox(-1.0F, -1.85F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setPos(-0.12F, 0.796F, -0.1133F);
        hornRight.addChild(cube_r15);
        setRotationAngle(cube_r15, 3.1416F, 0.0F, -0.3927F);
        cube_r15.texOffs(26, 29).addBox(-1.0F, -1.85F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setPos(-0.02F, 0.796F, -0.1133F);
        hornRight.addChild(cube_r16);
        setRotationAngle(cube_r16, -2.618F, 0.0F, -0.3491F);
        cube_r16.texOffs(26, 29).addBox(-1.0F, -1.85F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setPos(0.08F, 0.796F, -0.1133F);
        hornRight.addChild(cube_r17);
        setRotationAngle(cube_r17, -2.0944F, 0.0F, -0.3491F);
        cube_r17.texOffs(26, 29).addBox(-1.0F, -1.85F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setPos(0.18F, 0.796F, -0.1133F);
        hornRight.addChild(cube_r18);
        setRotationAngle(cube_r18, -1.5708F, 0.0F, -0.3054F);
        cube_r18.texOffs(26, 29).addBox(-1.0F, -1.85F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setPos(0.28F, 0.796F, -0.1133F);
        hornRight.addChild(cube_r19);
        setRotationAngle(cube_r19, -1.0472F, 0.0F, -0.2618F);
        cube_r19.texOffs(25, 29).addBox(-1.0F, -1.85F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setPos(0.08F, 0.876F, 0.8867F);
        hornRight.addChild(cube_r20);
        setRotationAngle(cube_r20, -0.3491F, 0.1745F, -1.0036F);
        cube_r20.texOffs(26, 30).addBox(-0.4F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setPos(0.28F, 0.846F, 0.6867F);
        hornRight.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.6545F, 0.1745F, -1.0908F);
        cube_r21.texOffs(25, 30).addBox(-1.0F, -0.47F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setPos(0.38F, 0.796F, -0.1133F);
        hornRight.addChild(cube_r22);
        setRotationAngle(cube_r22, -0.5236F, 0.0F, -0.1745F);
        cube_r22.texOffs(25, 29).addBox(-1.0F, -1.85F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setPos(0.48F, 0.796F, -0.1133F);
        hornRight.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 0.0F, -0.0873F);
        cube_r23.texOffs(25, 29).addBox(-1.0F, -1.85F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setPos(1.58F, 0.796F, -0.1133F);
        hornRight.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.5236F, -0.7854F, 0.0F);
        cube_r24.texOffs(25, 29).addBox(-1.6048F, -1.3283F, -0.5758F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setPos(1.58F, 0.796F, -0.1133F);
        hornRight.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.5236F, -0.3927F, 0.0F);
        cube_r25.texOffs(25, 29).addBox(-1.9441F, -1.6229F, -0.4531F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setPos(0.58F, 0.796F, -0.1133F);
        hornRight.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.5236F, 0.0F, 0.0F);
        cube_r26.texOffs(25, 29).addBox(-1.0F, -1.85F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setPos(-0.32F, 0.796F, -0.1133F);
        hornRight.addChild(cube_r27);
        setRotationAngle(cube_r27, 1.5708F, 0.0F, -0.5236F);
        cube_r27.texOffs(26, 30).addBox(-1.0F, -1.85F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        hornLeft = new ModelRenderer(this);
        hornLeft.setPos(6.08F, -21.496F, -14.0367F);
        horns.addChild(hornLeft);
        setRotationAngle(hornLeft, 0.0F, -0.1745F, 0.0F);


        cube_r28 = new ModelRenderer(this);
        cube_r28.setPos(0.32F, 0.796F, -0.1133F);
        hornLeft.addChild(cube_r28);
        setRotationAngle(cube_r28, 2.0944F, 0.0F, 0.48F);
        cube_r28.texOffs(26, 30).addBox(0.0F, -1.85F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setPos(0.22F, 0.796F, -0.1133F);
        hornLeft.addChild(cube_r29);
        setRotationAngle(cube_r29, 2.618F, 0.0F, 0.4363F);
        cube_r29.texOffs(26, 30).addBox(0.0F, -1.85F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setPos(0.12F, 0.796F, -0.1133F);
        hornLeft.addChild(cube_r30);
        setRotationAngle(cube_r30, 3.1416F, 0.0F, 0.3927F);
        cube_r30.texOffs(26, 29).addBox(0.0F, -1.85F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setPos(0.02F, 0.796F, -0.1133F);
        hornLeft.addChild(cube_r31);
        setRotationAngle(cube_r31, -2.618F, 0.0F, 0.3491F);
        cube_r31.texOffs(26, 29).addBox(0.0F, -1.85F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setPos(-0.08F, 0.796F, -0.1133F);
        hornLeft.addChild(cube_r32);
        setRotationAngle(cube_r32, -2.0944F, 0.0F, 0.3491F);
        cube_r32.texOffs(26, 29).addBox(0.0F, -1.85F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setPos(-0.18F, 0.796F, -0.1133F);
        hornLeft.addChild(cube_r33);
        setRotationAngle(cube_r33, -1.5708F, 0.0F, 0.3054F);
        cube_r33.texOffs(26, 29).addBox(0.0F, -1.85F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setPos(-0.28F, 0.796F, -0.1133F);
        hornLeft.addChild(cube_r34);
        setRotationAngle(cube_r34, -1.0472F, 0.0F, 0.2618F);
        cube_r34.texOffs(25, 29).addBox(-1.0F, -1.85F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setPos(-0.08F, 0.876F, 0.8867F);
        hornLeft.addChild(cube_r35);
        setRotationAngle(cube_r35, -0.3491F, -0.1745F, 1.0036F);
        cube_r35.texOffs(26, 30).addBox(-0.6F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setPos(-0.28F, 0.846F, 0.6867F);
        hornLeft.addChild(cube_r36);
        setRotationAngle(cube_r36, 0.6545F, -0.1745F, 1.0908F);
        cube_r36.texOffs(25, 30).addBox(-1.0F, -0.47F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setPos(-0.38F, 0.796F, -0.1133F);
        hornLeft.addChild(cube_r37);
        setRotationAngle(cube_r37, -0.5236F, 0.0F, 0.1745F);
        cube_r37.texOffs(25, 29).addBox(-1.0F, -1.85F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setPos(-0.48F, 0.796F, -0.1133F);
        hornLeft.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.0F, 0.0F, 0.0873F);
        cube_r38.texOffs(25, 29).addBox(-1.0F, -1.85F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setPos(-1.58F, 0.796F, -0.1133F);
        hornLeft.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.5236F, 0.7854F, 0.0F);
        cube_r39.texOffs(25, 29).addBox(-0.3952F, -1.3283F, -0.5758F, 2.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setPos(-1.58F, 0.796F, -0.1133F);
        hornLeft.addChild(cube_r40);
        setRotationAngle(cube_r40, 0.5236F, 0.3927F, 0.0F);
        cube_r40.texOffs(25, 29).addBox(-0.0559F, -1.6229F, -0.4531F, 2.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setPos(-0.58F, 0.796F, -0.1133F);
        hornLeft.addChild(cube_r41);
        setRotationAngle(cube_r41, 0.5236F, 0.0F, 0.0F);
        cube_r41.texOffs(25, 29).addBox(-1.0F, -1.85F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setPos(0.32F, 0.796F, -0.1133F);
        hornLeft.addChild(cube_r42);
        setRotationAngle(cube_r42, 1.5708F, 0.0F, 0.5236F);
        cube_r42.texOffs(26, 30).addBox(0.0F, -1.85F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        leg0 = new ModelRenderer(this);
        leg0.setPos(3.0F, 12.0F, 7.0F);
        leg0.texOffs(0, 16).addBox(-8.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        leg0.texOffs(42, 21).addBox(-8.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.4F, false);

        leg1 = new ModelRenderer(this);
        leg1.setPos(-3.0F, 12.0F, 7.0F);
        leg1.texOffs(0, 16).addBox(4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        leg1.texOffs(42, 21).addBox(4.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.4F, false);

        leg2 = new ModelRenderer(this);
        leg2.setPos(3.0F, 12.0F, -5.0F);
        leg2.texOffs(0, 16).addBox(-8.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        leg2.texOffs(42, 21).addBox(-8.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.4F, false);

        leg3 = new ModelRenderer(this);
        leg3.setPos(-3.0F, 12.0F, -5.0F);
        leg3.texOffs(0, 16).addBox(4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        leg3.texOffs(42, 21).addBox(4.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.5F, false);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
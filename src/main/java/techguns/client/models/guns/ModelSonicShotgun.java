package techguns.client.models.guns;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;
import techguns.client.models.ModelMultipart;
import techguns.client.render.TGRenderHelper;

public class ModelSonicShotgun extends ModelMultipart {
    public ModelRenderer shape79;
    public ModelRenderer shape79_1;
    public ModelRenderer shape79_2;
    public ModelRenderer M1;
    public ModelRenderer Shape13;
    public ModelRenderer Shape13_1;
    public ModelRenderer B6;
    public ModelRenderer B3;
    public ModelRenderer B4;
    public ModelRenderer B1;
    public ModelRenderer B5;
    public ModelRenderer B8;
    public ModelRenderer B9;
    public ModelRenderer B2;
    public ModelRenderer B7;
    public ModelRenderer Shape13_2;
    public ModelRenderer Shape13_3;
    public ModelRenderer Shape13_4;
    public ModelRenderer Shape13_5;
    public ModelRenderer Shape13_6;
    public ModelRenderer Shape13_7;
    public ModelRenderer Shape13_8;
    public ModelRenderer Shape13_9;
    public ModelRenderer Shape30;
    public ModelRenderer Shape26;
    public ModelRenderer shape79_3;
    public ModelRenderer Shape26_1;
    public ModelRenderer Shape26_2;
    public ModelRenderer Shape26_3;
    public ModelRenderer Shape26_4;
    public ModelRenderer Shape26_5;
    public ModelRenderer Shape26_6;
    public ModelRenderer Shape26_7;
    public ModelRenderer Shape26_8;
    public ModelRenderer Shape26_9;
    public ModelRenderer Shape26_10;
    public ModelRenderer Shape26_11;
    public ModelRenderer Shape30_1;
    public ModelRenderer Shape13_10;
    public ModelRenderer Shape13_11;
    public ModelRenderer Shape13_12;
    public ModelRenderer Shape13_13;
    public ModelRenderer GLOW01;
    public ModelRenderer Shape30_2;
    public ModelRenderer Shape30_3;
    public ModelRenderer Shape30_4;
    public ModelRenderer Shape30_5;
    public ModelRenderer Shape30_6;
    public ModelRenderer Shape30_7;
    public ModelRenderer Shape29;
    public ModelRenderer Shape29_1;
    public ModelRenderer Shape30_8;
    public ModelRenderer Shape30_9;
    public ModelRenderer Shape30_10;
    public ModelRenderer Shape30_11;
    public ModelRenderer Shape30_12;
    public ModelRenderer Shape6;
    public ModelRenderer Shape4;
    public ModelRenderer Shape7;
    public ModelRenderer Shape13_14;
    public ModelRenderer Shape13_15;
    public ModelRenderer Shape13_16;
    public ModelRenderer Shape13_17;
    public ModelRenderer Shape6_1;
    public ModelRenderer Shape26_12;

    public ModelSonicShotgun() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Shape13_9 = new ModelRenderer(this, 0, 50);
        this.Shape13_9.setRotationPoint(11.0F, -4.0F, -1.5F);
        this.Shape13_9.addBox(0.0F, 0.0F, 0.0F, 16, 2, 5, 0.0F);
        this.Shape13_1 = new ModelRenderer(this, 44, 30);
        this.Shape13_1.setRotationPoint(2.0F, -3.0F, -2.5F);
        this.Shape13_1.addBox(0.0F, 0.0F, 0.0F, 8, 4, 7, 0.0F);
        this.B1 = new ModelRenderer(this, 0, 9);
        this.B1.setRotationPoint(28.0F, -4.5F, 3.0F);
        this.B1.addBox(0.0F, 0.0F, -1.0F, 7, 3, 1, 0.0F);
        this.setRotation(B1, 0.20943951023931953F, 0.0F, 0.0F);
        this.Shape13_4 = new ModelRenderer(this, 0, 27);
        this.Shape13_4.setRotationPoint(11.0F, -2.0F, -1.5F);
        this.Shape13_4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.Shape26_3 = new ModelRenderer(this, 71, 3);
        this.Shape26_3.setRotationPoint(-0.5F, -8.0F, 2.0F);
        this.Shape26_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F);
        this.Shape26_12 = new ModelRenderer(this, 84, 44);
        this.Shape26_12.setRotationPoint(-22.0F, -4.0F, 0.0F);
        this.Shape26_12.addBox(0.0F, 0.0F, 0.0F, 20, 1, 2, 0.0F);
        this.Shape13_5 = new ModelRenderer(this, 0, 44);
        this.Shape13_5.setRotationPoint(11.0F, 1.5F, -0.5F);
        this.Shape13_5.addBox(0.0F, 0.0F, 0.0F, 16, 3, 3, 0.0F);
        this.M1 = new ModelRenderer(this, 64, 44);
        this.M1.setRotationPoint(2.0F, 4.0F, -1.0F);
        this.M1.addBox(0.0F, 0.0F, 0.0F, 8, 7, 4, 0.0F);
        this.Shape13_6 = new ModelRenderer(this, 0, 38);
        this.Shape13_6.setRotationPoint(14.0F, 3.0F, -1.0F);
        this.Shape13_6.addBox(0.0F, 0.0F, 0.0F, 10, 2, 4, 0.0F);
        this.Shape13_2 = new ModelRenderer(this, 0, 27);
        this.Shape13_2.setRotationPoint(25.0F, -2.0F, -1.5F);
        this.Shape13_2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.Shape26_5 = new ModelRenderer(this, 70, 4);
        this.Shape26_5.setRotationPoint(-0.4F, -7.5F, 0.5F);
        this.Shape26_5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Shape30_2 = new ModelRenderer(this, 51, 11);
        this.Shape30_2.setRotationPoint(10.0F, -4.0F, -1.0F);
        this.Shape30_2.addBox(0.0F, 0.0F, 0.0F, 1, 9, 4, 0.0F);
        this.Shape30_5 = new ModelRenderer(this, 61, 14);
        this.Shape30_5.setRotationPoint(-2.0F, -4.0F, -1.0F);
        this.Shape30_5.addBox(0.0F, 0.0F, 0.0F, 4, 5, 4, 0.0F);
        this.Shape26_8 = new ModelRenderer(this, 70, 4);
        this.Shape26_8.setRotationPoint(16.5F, -7.5F, 0.5F);
        this.Shape26_8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.B2 = new ModelRenderer(this, 0, 4);
        this.B2.setRotationPoint(28.0F, -4.5F, -1.0F);
        this.B2.addBox(0.0F, 0.0F, 0.0F, 7, 1, 4, 0.0F);
        this.Shape13_3 = new ModelRenderer(this, 0, 27);
        this.Shape13_3.setRotationPoint(18.0F, -2.0F, -1.5F);
        this.Shape13_3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
        this.Shape6_1 = new ModelRenderer(this, 99, 19);
        this.Shape6_1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Shape6_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.Shape30_1 = new ModelRenderer(this, 57, 11);
        this.Shape30_1.setRotationPoint(1.0F, 5.0F, -0.5F);
        this.Shape30_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.shape79_1 = new ModelRenderer(this, 0, 0);
        this.shape79_1.setRotationPoint(13.0F, -1.0F, -0.4F);
        this.shape79_1.addBox(0.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F);
        this.setRotation(shape79_1, 0.7853981633974483F, 0.0F, 0.0F);
        this.shape79 = new ModelRenderer(this, 0, 0);
        this.shape79.setRotationPoint(20.0F, -1.0F, 2.4F);
        this.shape79.addBox(0.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F);
        this.setRotation(shape79, 0.7853981633974483F, 0.0F, 0.0F);
        this.Shape13_12 = new ModelRenderer(this, 60, 23);
        this.Shape13_12.setRotationPoint(2.0F, 1.0F, -2.0F);
        this.Shape13_12.addBox(0.0F, 0.0F, 0.0F, 8, 1, 6, 0.0F);
        this.Shape13_15 = new ModelRenderer(this, 107, 16);
        this.Shape13_15.setRotationPoint(-12.0F, 2.0F, 0.0F);
        this.Shape13_15.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotation(Shape13_15, 0.0F, 0.0F, 2.416582882311349F);
        this.B8 = new ModelRenderer(this, 0, 14);
        this.B8.setRotationPoint(28.0F, -4.0F, -0.5F);
        this.B8.addBox(0.0F, 0.0F, 0.0F, 5, 1, 3, 0.0F);
        this.B4 = new ModelRenderer(this, 0, 9);
        this.B4.setRotationPoint(28.0F, 2.5F, -1.0F);
        this.B4.addBox(0.0F, -3.0F, 0.0F, 7, 3, 1, 0.0F);
        this.setRotation(B4, 0.20943951023931953F, 0.0F, 0.0F);
        this.Shape13_14 = new ModelRenderer(this, 93, 29);
        this.Shape13_14.setRotationPoint(-8.0F, 2.0F, 0.0F);
        this.Shape13_14.addBox(0.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F);
        this.setRotation(Shape13_14, 0.0F, 0.0F, 0.48328166987722987F);
        this.B9 = new ModelRenderer(this, 0, 14);
        this.B9.setRotationPoint(28.0F, 1.0F, -0.5F);
        this.B9.addBox(0.0F, 0.0F, 0.0F, 5, 1, 3, 0.0F);
        this.Shape26_6 = new ModelRenderer(this, 54, 3);
        this.Shape26_6.setRotationPoint(17.5F, -7.0F, 0.0F);
        this.Shape26_6.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
        this.setRotation(Shape26_6, 0.0F, -0.0F, 0.7853981633974483F);
        this.Shape30_6 = new ModelRenderer(this, 95, 23);
        this.Shape30_6.setRotationPoint(-6.0F, 1.0F, 0.0F);
        this.Shape30_6.addBox(0.0F, 0.0F, 0.0F, 3, 4, 2, 0.0F);
        this.Shape13 = new ModelRenderer(this, 0, 18);
        this.Shape13.setRotationPoint(11.0F, -4.5F, -0.5F);
        this.Shape13.addBox(0.0F, 0.0F, 0.0F, 16, 1, 3, 0.0F);
        this.Shape30_8 = new ModelRenderer(this, 106, 0);
        this.Shape30_8.setRotationPoint(-22.0F, -3.0F, -0.5F);
        this.Shape30_8.addBox(0.0F, 0.0F, 0.0F, 8, 8, 3, 0.0F);
        this.Shape26 = new ModelRenderer(this, 9, 28);
        this.Shape26.setRotationPoint(27.0F, -5.0F, -0.5F);
        this.Shape26.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Shape13_17 = new ModelRenderer(this, 95, 15);
        this.Shape13_17.setRotationPoint(-3.0F, 1.0F, 0.0F);
        this.Shape13_17.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        this.B3 = new ModelRenderer(this, 0, 9);
        this.B3.setRotationPoint(28.0F, -4.5F, -1.0F);
        this.B3.addBox(0.0F, 0.0F, 0.0F, 7, 3, 1, 0.0F);
        this.setRotation(B3, -0.20943951023931953F, 0.0F, 0.0F);
        this.Shape30_9 = new ModelRenderer(this, 78, 4);
        this.Shape30_9.setRotationPoint(-18.0F, -4.5F, -1.0F);
        this.Shape30_9.addBox(0.0F, 0.0F, 0.0F, 10, 4, 4, 0.0F);
        this.Shape26_10 = new ModelRenderer(this, 67, 10);
        this.Shape26_10.setRotationPoint(-2.0F, -5.0F, -0.5F);
        this.Shape26_10.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
        this.Shape6 = new ModelRenderer(this, 105, 19);
        this.Shape6.setRotationPoint(-22.0F, 2.0F, 0.0F);
        this.Shape6.addBox(0.0F, 0.0F, 0.0F, 9, 6, 2, 0.0F);
        this.Shape4 = new ModelRenderer(this, 113, 27);
        this.Shape4.setRotationPoint(-14.0F, 8.0F, 0.0F);
        this.Shape4.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotation(Shape4, 0.0F, 0.0F, -1.1548843660446477F);
        this.Shape30_10 = new ModelRenderer(this, 83, 32);
        this.Shape30_10.setRotationPoint(-14.0F, 1.0F, 0.0F);
        this.Shape30_10.addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
        this.Shape26_7 = new ModelRenderer(this, 23, 0);
        this.Shape26_7.setRotationPoint(19.0F, -5.0F, 0.0F);
        this.Shape26_7.addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
        this.Shape26_11 = new ModelRenderer(this, 74, 4);
        this.Shape26_11.setRotationPoint(10.0F, -5.0F, -0.5F);
        this.Shape26_11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.B6 = new ModelRenderer(this, 0, 4);
        this.B6.setRotationPoint(28.0F, 1.5F, -1.0F);
        this.B6.addBox(0.0F, 0.0F, 0.0F, 7, 1, 4, 0.0F);
        this.Shape26_2 = new ModelRenderer(this, 43, 0);
        this.Shape26_2.setRotationPoint(-0.5F, -7.0F, 0.0F);
        this.Shape26_2.addBox(0.0F, 0.0F, 0.0F, 18, 1, 2, 0.0F);
        this.Shape30_7 = new ModelRenderer(this, 83, 16);
        this.Shape30_7.setRotationPoint(-24.0F, -1.0F, -1.0F);
        this.Shape30_7.addBox(0.0F, 0.0F, 0.0F, 2, 7, 4, 0.0F);
        this.Shape30 = new ModelRenderer(this, 24, 30);
        this.Shape30.setRotationPoint(27.0F, -4.0F, -1.0F);
        this.Shape30.addBox(0.0F, 0.0F, 0.0F, 1, 8, 4, 0.0F);
        this.Shape13_16 = new ModelRenderer(this, 93, 19);
        this.Shape13_16.setRotationPoint(-3.0F, 5.0F, 0.0F);
        this.Shape13_16.addBox(0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F);
        this.Shape13_8 = new ModelRenderer(this, 0, 57);
        this.Shape13_8.setRotationPoint(11.0F, 0.0F, -1.5F);
        this.Shape13_8.addBox(0.0F, 0.0F, 0.0F, 16, 2, 5, 0.0F);
        this.shape79_3 = new ModelRenderer(this, 0, 0);
        this.shape79_3.setRotationPoint(20.0F, -1.0F, -0.4F);
        this.shape79_3.addBox(0.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F);
        this.setRotation(shape79_3, 0.7853981633974483F, 0.0F, 0.0F);
        this.Shape13_13 = new ModelRenderer(this, 69, 37);
        this.Shape13_13.setRotationPoint(2.0F, 2.0F, -1.5F);
        this.Shape13_13.addBox(0.0F, 0.0F, 0.0F, 8, 2, 5, 0.0F);
        this.GLOW01 = new ModelRenderer(this, 100, 54);
        this.GLOW01.setRotationPoint(2.5F, -2.5F, -2.0F);
        this.GLOW01.addBox(0.0F, 0.0F, 0.0F, 7, 3, 6, 0.0F);
        this.Shape7 = new ModelRenderer(this, 103, 27);
        this.Shape7.setRotationPoint(-6.0F, 3.0F, 0.0F);
        this.Shape7.addBox(0.0F, 0.0F, 0.0F, 3, 8, 2, 0.0F);
        this.setRotation(Shape7, 0.0F, 0.0F, 0.3141592653589793F);
        this.Shape26_1 = new ModelRenderer(this, 79, 12);
        this.Shape26_1.setRotationPoint(-1.0F, -6.0F, 0.0F);
        this.Shape26_1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.Shape13_11 = new ModelRenderer(this, 60, 23);
        this.Shape13_11.setRotationPoint(2.0F, -4.0F, -2.0F);
        this.Shape13_11.addBox(0.0F, 0.0F, 0.0F, 8, 1, 6, 0.0F);
        this.B5 = new ModelRenderer(this, 0, 9);
        this.B5.setRotationPoint(28.0F, 2.5F, 3.0F);
        this.B5.addBox(0.0F, -3.0F, -1.0F, 7, 3, 1, 0.0F);
        this.setRotation(B5, -0.20943951023931953F, 0.0F, 0.0F);
        this.Shape13_10 = new ModelRenderer(this, 42, 24);
        this.Shape13_10.setRotationPoint(2.0F, -4.5F, -1.0F);
        this.Shape13_10.addBox(0.0F, 0.0F, 0.0F, 8, 1, 4, 0.0F);
        this.Shape30_3 = new ModelRenderer(this, 57, 11);
        this.Shape30_3.setRotationPoint(10.0F, 5.0F, -0.5F);
        this.Shape30_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Shape29 = new ModelRenderer(this, 77, 15);
        this.Shape29.setRotationPoint(-24.0F, -4.0F, -0.5F);
        this.Shape29.addBox(0.0F, 1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.Shape30_4 = new ModelRenderer(this, 60, 3);
        this.Shape30_4.setRotationPoint(1.0F, 1.0F, -1.0F);
        this.Shape30_4.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
        this.Shape26_4 = new ModelRenderer(this, 71, 3);
        this.Shape26_4.setRotationPoint(-0.5F, -8.0F, 0.0F);
        this.Shape26_4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F);
        this.Shape30_11 = new ModelRenderer(this, 80, 0);
        this.Shape30_11.setRotationPoint(-18.0F, -5.0F, -0.5F);
        this.Shape30_11.addBox(0.0F, 0.0F, 0.0F, 10, 1, 3, 0.0F);
        this.B7 = new ModelRenderer(this, 22, 3);
        this.B7.setRotationPoint(28.0F, -3.0F, -1.0F);
        this.B7.addBox(0.0F, 0.0F, 0.0F, 5, 4, 4, 0.0F);
        this.Shape26_9 = new ModelRenderer(this, 74, 15);
        this.Shape26_9.setRotationPoint(10.0F, -6.0F, 0.0F);
        this.Shape26_9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.Shape29_1 = new ModelRenderer(this, 77, 15);
        this.Shape29_1.setRotationPoint(-24.0F, 5.0F, -0.5F);
        this.Shape29_1.addBox(0.0F, 1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.Shape13_7 = new ModelRenderer(this, 0, 34);
        this.Shape13_7.setRotationPoint(14.5F, 4.5F, -0.5F);
        this.Shape13_7.addBox(0.0F, 0.0F, 0.0F, 9, 1, 3, 0.0F);
        this.Shape30_12 = new ModelRenderer(this, 96, 37);
        this.Shape30_12.setRotationPoint(-14.0F, -3.0F, -0.5F);
        this.Shape30_12.addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
        this.shape79_2 = new ModelRenderer(this, 0, 0);
        this.shape79_2.setRotationPoint(13.0F, -1.0F, 2.4F);
        this.shape79_2.addBox(0.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F);
        this.setRotation(shape79_2, 0.7853981633974483F, 0.0F, 0.0F);
    }

		
	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, int ammoLeft,
			float reloadProgress, TransformType transformType, int part, float fireProgress) {
		
	    this.Shape13_9.render(scale);
        this.Shape13_1.render(scale);
        this.B1.render(scale);
        this.Shape13_4.render(scale);
        this.Shape26_3.render(scale);
        this.Shape26_12.render(scale);
        this.Shape13_5.render(scale);
        this.M1.render(scale);
        this.Shape13_6.render(scale);
        this.Shape13_2.render(scale);
        this.Shape26_5.render(scale);
        this.Shape30_2.render(scale);
        this.Shape30_5.render(scale);
        this.Shape26_8.render(scale);
        this.B2.render(scale);
        this.Shape13_3.render(scale);
        this.Shape6_1.render(scale);
        this.Shape30_1.render(scale);
        this.shape79_1.render(scale);
        this.shape79.render(scale);
        this.Shape13_12.render(scale);
        this.Shape13_15.render(scale);
        this.B8.render(scale);
        this.B4.render(scale);
        this.Shape13_14.render(scale);
        this.B9.render(scale);
        this.Shape26_6.render(scale);
        this.Shape30_6.render(scale);
        this.Shape13.render(scale);
        this.Shape30_8.render(scale);
        this.Shape26.render(scale);
        this.Shape13_17.render(scale);
        this.B3.render(scale);
        this.Shape30_9.render(scale);
        this.Shape26_10.render(scale);
        this.Shape6.render(scale);
        this.Shape4.render(scale);
        this.Shape30_10.render(scale);
        this.Shape26_7.render(scale);
        this.Shape26_11.render(scale);
        this.B6.render(scale);
        this.Shape26_2.render(scale);
        this.Shape30_7.render(scale);
        this.Shape30.render(scale);
        this.Shape13_16.render(scale);
        this.Shape13_8.render(scale);
        this.shape79_3.render(scale);
        this.Shape13_13.render(scale);
        this.Shape7.render(scale);
        this.Shape26_1.render(scale);
        this.Shape13_11.render(scale);
        this.B5.render(scale);
        this.Shape13_10.render(scale);
        this.Shape30_3.render(scale);
        this.Shape29.render(scale);
        this.Shape30_4.render(scale);
        this.Shape26_4.render(scale);
        this.Shape30_11.render(scale);
        this.B7.render(scale);
        this.Shape26_9.render(scale);
        this.Shape29_1.render(scale);
        this.Shape13_7.render(scale);
        this.Shape30_12.render(scale);
        this.shape79_2.render(scale);

        TGRenderHelper.enableFXLighting();
        this.GLOW01.render(scale);
        TGRenderHelper.disableFXLighting();
	}
}
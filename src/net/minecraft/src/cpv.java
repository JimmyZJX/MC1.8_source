package net.minecraft.src;
/*  1:   */ public class cpv
/*  2:   */   extends cpu<EntityExperienceOrb>
/*  3:   */ {
/*  4:11 */   private static final oa a = new oa("textures/entity/experience_orb.png");
/*  5:   */   
/*  6:   */   public cpv(cpt paramcpt)
/*  7:   */   {
/*  8:14 */     super(paramcpt);
/*  9:15 */     this.c = 0.15F;
/* 10:16 */     this.d = 0.75F;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(EntityExperienceOrb paramxk, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 14:   */   {
/* 15:21 */     cjm.glPushMatrix();
/* 16:22 */     cjm.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 17:   */     
/* 18:24 */     c(paramxk);
/* 19:   */     
/* 20:26 */     int i = paramxk.l();
/* 21:27 */     float f1 = (i % 4 * 16 + 0) / 64.0F;
/* 22:28 */     float f2 = (i % 4 * 16 + 16) / 64.0F;
/* 23:29 */     float f3 = (i / 4 * 16 + 0) / 64.0F;
/* 24:30 */     float f4 = (i / 4 * 16 + 16) / 64.0F;
/* 25:   */     
/* 26:32 */     float f5 = 1.0F;
/* 27:33 */     float f6 = 0.5F;
/* 28:34 */     float f7 = 0.25F;
/* 29:   */     
/* 30:   */ 
/* 31:37 */     int j = paramxk.b(paramFloat2);
/* 32:38 */     int k = j % 65536;
/* 33:39 */     int m = j / 65536;
/* 34:40 */     dax.glMultiTexCoord2f(dax.q, k / 1.0F, m / 1.0F);
/* 35:41 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 36:   */     
/* 37:   */ 
/* 38:44 */     float f8 = 255.0F;
/* 39:45 */     float f9 = (paramxk.a + paramFloat2) / 2.0F;
/* 40:46 */     m = (int)((MathUtils.sin(f9 + 0.0F) + 1.0F) * 0.5F * f8);
/* 41:47 */     int n = (int)f8;
/* 42:48 */     int i1 = (int)((MathUtils.sin(f9 + 4.18879F) + 1.0F) * 0.1F * f8);
/* 43:49 */     int i2 = m << 16 | n << 8 | i1;
/* 44:50 */     cjm.glRotatef(180.0F - this.b.e, 0.0F, 1.0F, 0.0F);
/* 45:51 */     cjm.glRotatef(-this.b.f, 1.0F, 0.0F, 0.0F);
/* 46:52 */     float f10 = 0.3F;
/* 47:53 */     cjm.glScalef(f10, f10, f10);
/* 48:54 */     ckx localckx = ckx.getInstance();
/* 49:55 */     VertexBuffer localciv = localckx.getBuffer();
/* 50:56 */     localciv.begin();
/* 51:57 */     localciv.setColor(i2, 128);
/* 52:58 */     localciv.d(0.0F, 1.0F, 0.0F);
/* 53:59 */     localciv.addVertexWithUV(0.0F - f6, 0.0F - f7, 0.0D, f1, f4);
/* 54:60 */     localciv.addVertexWithUV(f5 - f6, 0.0F - f7, 0.0D, f2, f4);
/* 55:61 */     localciv.addVertexWithUV(f5 - f6, 1.0F - f7, 0.0D, f2, f3);
/* 56:62 */     localciv.addVertexWithUV(0.0F - f6, 1.0F - f7, 0.0D, f1, f3);
/* 57:63 */     localckx.draw();
/* 58:   */     
/* 59:65 */     cjm.disableBlend();
/* 60:66 */     cjm.C();
/* 61:67 */     cjm.glPopMatrix();
/* 62:   */     
/* 63:69 */     super.a(paramxk, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 64:   */   }
/* 65:   */   
/* 66:   */   protected oa a(EntityExperienceOrb paramxk)
/* 67:   */   {
/* 68:74 */     return a;
/* 69:   */   }
/* 70:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cpv
 * JD-Core Version:    0.7.0.1
 */
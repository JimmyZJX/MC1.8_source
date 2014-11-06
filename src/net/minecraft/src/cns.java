package net.minecraft.src;
/*  1:   */ public class cns
/*  2:   */   extends cnp<bda>
/*  3:   */ {
/*  4:11 */   private static final oa c = new oa("textures/entity/chest/ender.png");
/*  5:12 */   private ccb d = new ccb();
/*  6:   */   
/*  7:   */   public void a(bda parambda, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, int paramInt)
/*  8:   */   {
/*  9:16 */     int i = 0;
/* 10:18 */     if (parambda.t()) {
/* 11:19 */       i = parambda.u();
/* 12:   */     }
/* 13:22 */     if (paramInt >= 0)
/* 14:   */     {
/* 15:23 */       a(a[paramInt]);
/* 16:24 */       cjm.glMatrixMode(5890);
/* 17:25 */       cjm.glPushMatrix();
/* 18:26 */       cjm.glScalef(4.0F, 4.0F, 1.0F);
/* 19:27 */       cjm.glTranslatef(0.0625F, 0.0625F, 0.0625F);
/* 20:28 */       cjm.glMatrixMode(5888);
/* 21:   */     }
/* 22:   */     else
/* 23:   */     {
/* 24:30 */       a(c);
/* 25:   */     }
/* 26:33 */     cjm.glPushMatrix();
/* 27:34 */     cjm.B();
/* 28:35 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 29:36 */     cjm.glTranslatef((float)paramDouble1, (float)paramDouble2 + 1.0F, (float)paramDouble3 + 1.0F);
/* 30:37 */     cjm.glScalef(1.0F, -1.0F, -1.0F);
/* 31:   */     
/* 32:39 */     cjm.glTranslatef(0.5F, 0.5F, 0.5F);
/* 33:40 */     int j = 0;
/* 34:41 */     if (i == 2) {
/* 35:42 */       j = 180;
/* 36:   */     }
/* 37:44 */     if (i == 3) {
/* 38:45 */       j = 0;
/* 39:   */     }
/* 40:47 */     if (i == 4) {
/* 41:48 */       j = 90;
/* 42:   */     }
/* 43:50 */     if (i == 5) {
/* 44:51 */       j = -90;
/* 45:   */     }
/* 46:54 */     cjm.glRotatef(j, 0.0F, 1.0F, 0.0F);
/* 47:55 */     cjm.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 48:   */     
/* 49:57 */     float f = parambda.f + (parambda.a - parambda.f) * paramFloat;
/* 50:58 */     f = 1.0F - f;
/* 51:59 */     f = 1.0F - f * f * f;
/* 52:   */     
/* 53:61 */     this.d.a.f = (-(f * 3.141593F / 2.0F));
/* 54:62 */     this.d.a();
/* 55:63 */     cjm.C();
/* 56:64 */     cjm.glPopMatrix();
/* 57:65 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 58:67 */     if (paramInt >= 0)
/* 59:   */     {
/* 60:68 */       cjm.glMatrixMode(5890);
/* 61:69 */       cjm.glPopMatrix();
/* 62:70 */       cjm.glMatrixMode(5888);
/* 63:   */     }
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cns
 * JD-Core Version:    0.7.0.1
 */
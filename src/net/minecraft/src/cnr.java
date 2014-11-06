package net.minecraft.src;
/*  1:   */ public class cnr
/*  2:   */   extends cnp<bcz>
/*  3:   */ {
/*  4:10 */   private static final oa c = new oa("textures/entity/enchanting_table_book.png");
/*  5:11 */   private cca d = new cca();
/*  6:   */   
/*  7:   */   public void a(bcz parambcz, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, int paramInt)
/*  8:   */   {
/*  9:15 */     cjm.glPushMatrix();
/* 10:16 */     cjm.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2 + 0.75F, (float)paramDouble3 + 0.5F);
/* 11:   */     
/* 12:18 */     float f1 = parambcz.a + paramFloat;
/* 13:   */     
/* 14:20 */     cjm.glTranslatef(0.0F, 0.1F + MathUtils.sin(f1 * 0.1F) * 0.01F, 0.0F);
/* 15:21 */     float f2 = parambcz.l - parambcz.m;
/* 16:22 */     while (f2 >= 3.141593F) {
/* 17:23 */       f2 -= 6.283186F;
/* 18:   */     }
/* 19:25 */     while (f2 < -3.141593F) {
/* 20:26 */       f2 += 6.283186F;
/* 21:   */     }
/* 22:29 */     float f3 = parambcz.m + f2 * paramFloat;
/* 23:   */     
/* 24:31 */     cjm.glRotatef(-f3 * 180.0F / 3.141593F, 0.0F, 1.0F, 0.0F);
/* 25:32 */     cjm.glRotatef(80.0F, 0.0F, 0.0F, 1.0F);
/* 26:33 */     a(c);
/* 27:   */     
/* 28:35 */     float f4 = parambcz.g + (parambcz.f - parambcz.g) * paramFloat + 0.25F;
/* 29:36 */     float f5 = parambcz.g + (parambcz.f - parambcz.g) * paramFloat + 0.75F;
/* 30:37 */     f4 = (f4 - MathUtils.cos(f4)) * 1.6F - 0.3F;
/* 31:38 */     f5 = (f5 - MathUtils.cos(f5)) * 1.6F - 0.3F;
/* 32:40 */     if (f4 < 0.0F) {
/* 33:41 */       f4 = 0.0F;
/* 34:   */     }
/* 35:43 */     if (f5 < 0.0F) {
/* 36:44 */       f5 = 0.0F;
/* 37:   */     }
/* 38:46 */     if (f4 > 1.0F) {
/* 39:47 */       f4 = 1.0F;
/* 40:   */     }
/* 41:49 */     if (f5 > 1.0F) {
/* 42:50 */       f5 = 1.0F;
/* 43:   */     }
/* 44:53 */     float f6 = parambcz.k + (parambcz.j - parambcz.k) * paramFloat;
/* 45:54 */     cjm.o();
/* 46:55 */     this.d.a(null, f1, f4, f5, f6, 0.0F, 0.0625F);
/* 47:56 */     cjm.glPopMatrix();
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cnr
 * JD-Core Version:    0.7.0.1
 */
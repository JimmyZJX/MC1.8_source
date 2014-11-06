package net.minecraft.src;
/*  1:   */ public class csu
/*  2:   */   implements csq<EntitySpider>
/*  3:   */ {
/*  4:12 */   private static final oa a = new oa("textures/entity/spider_eyes.png");
/*  5:   */   private final crn b;
/*  6:   */   
/*  7:   */   public csu(crn paramcrn)
/*  8:   */   {
/*  9:17 */     this.b = paramcrn;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public void a(EntitySpider paramage, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 13:   */   {
/* 14:22 */     this.b.a(a);
/* 15:   */     
/* 16:24 */     cjm.enableBlend();
/* 17:25 */     cjm.disableAlphaTest();
/* 18:26 */     cjm.glBlendFunc(1, 1);
/* 19:27 */     if (paramage.ay()) {
/* 20:28 */       cjm.a(false);
/* 21:   */     } else {
/* 22:30 */       cjm.a(true);
/* 23:   */     }
/* 24:32 */     int i = 61680;
/* 25:33 */     int j = i % 65536;
/* 26:34 */     int k = i / 65536;
/* 27:   */     
/* 28:36 */     dax.glMultiTexCoord2f(dax.q, j / 1.0F, k / 1.0F);
/* 29:37 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 30:   */     
/* 31:39 */     this.b.b().a(paramage, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
/* 32:   */     
/* 33:41 */     i = paramage.b(paramFloat3);
/* 34:42 */     j = i % 65536;
/* 35:43 */     k = i / 65536;
/* 36:44 */     dax.glMultiTexCoord2f(dax.q, j / 1.0F, k / 1.0F);
/* 37:   */     
/* 38:46 */     this.b.a(paramage, paramFloat3);
/* 39:   */     
/* 40:48 */     cjm.disableBlend();
/* 41:49 */     cjm.enableAlphaTest();
/* 42:   */   }
/* 43:   */   
/* 44:   */   public boolean b()
/* 45:   */   {
/* 46:54 */     return false;
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     csu
 * JD-Core Version:    0.7.0.1
 */
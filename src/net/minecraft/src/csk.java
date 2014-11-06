package net.minecraft.src;
/*  1:   */ public class csk
/*  2:   */   implements csq<EntityEnderDragon>
/*  3:   */ {
/*  4:11 */   private static final oa a = new oa("textures/entity/enderdragon/dragon_eyes.png");
/*  5:   */   private final cpq b;
/*  6:   */   
/*  7:   */   public csk(cpq paramcpq)
/*  8:   */   {
/*  9:16 */     this.b = paramcpq;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public void a(EntityEnderDragon paramadb, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 13:   */   {
/* 14:21 */     this.b.a(a);
/* 15:22 */     cjm.enableBlend();
/* 16:23 */     cjm.disableAlphaTest();
/* 17:24 */     cjm.glBlendFunc(1, 1);
/* 18:25 */     cjm.disableLighting();
/* 19:26 */     cjm.c(514);
/* 20:   */     
/* 21:28 */     int i = 61680;
/* 22:29 */     int j = i % 65536;
/* 23:30 */     int k = i / 65536;
/* 24:   */     
/* 25:32 */     dax.glMultiTexCoord2f(dax.q, j / 1.0F, k / 1.0F);
/* 26:   */     
/* 27:34 */     cjm.enableLighting();
/* 28:35 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 29:   */     
/* 30:37 */     this.b.b().a(paramadb, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
/* 31:   */     
/* 32:39 */     this.b.a(paramadb, paramFloat3);
/* 33:   */     
/* 34:41 */     cjm.disableBlend();
/* 35:42 */     cjm.enableAlphaTest();
/* 36:43 */     cjm.c(515);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public boolean b()
/* 40:   */   {
/* 41:48 */     return false;
/* 42:   */   }
/* 43:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     csk
 * JD-Core Version:    0.7.0.1
 */
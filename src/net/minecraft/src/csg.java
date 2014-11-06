package net.minecraft.src;
/*  1:   */ public class csg
/*  2:   */   implements csq<EntityCreeper>
/*  3:   */ {
/*  4:12 */   private static final oa a = new oa("textures/entity/creeper/creeper_armor.png");
/*  5:   */   private final cpn b;
/*  6:15 */   private final cce c = new cce(2.0F);
/*  7:   */   
/*  8:   */   public csg(cpn paramcpn)
/*  9:   */   {
/* 10:18 */     this.b = paramcpn;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(EntityCreeper paramaep, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 14:   */   {
/* 15:23 */     if (!paramaep.n()) {
/* 16:24 */       return;
/* 17:   */     }
/* 18:27 */     cjm.a(!paramaep.ay());
/* 19:   */     
/* 20:29 */     this.b.a(a);
/* 21:   */     
/* 22:31 */     cjm.glMatrixMode(5890);
/* 23:32 */     cjm.glLoadIdentity();
/* 24:   */     
/* 25:34 */     float f1 = paramaep.W + paramFloat3;
/* 26:35 */     cjm.glTranslatef(f1 * 0.01F, f1 * 0.01F, 0.0F);
/* 27:   */     
/* 28:37 */     cjm.glMatrixMode(5888);
/* 29:38 */     cjm.enableBlend();
/* 30:39 */     float f2 = 0.5F;
/* 31:40 */     cjm.c(f2, f2, f2, 1.0F);
/* 32:41 */     cjm.disableLighting();
/* 33:42 */     cjm.glBlendFunc(1, 1);
/* 34:   */     
/* 35:44 */     this.c.a(this.b.b());
/* 36:45 */     this.c.a(paramaep, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
/* 37:   */     
/* 38:47 */     cjm.glMatrixMode(5890);
/* 39:48 */     cjm.glLoadIdentity();
/* 40:49 */     cjm.glMatrixMode(5888);
/* 41:50 */     cjm.enableLighting();
/* 42:51 */     cjm.disableBlend();
/* 43:   */   }
/* 44:   */   
/* 45:   */   public boolean b()
/* 46:   */   {
/* 47:56 */     return false;
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     csg
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*  1:   */ public class crw
/*  2:   */   extends cqz<EntityWither>
/*  3:   */ {
/*  4:12 */   private static final oa a = new oa("textures/entity/wither/wither_invulnerable.png");
/*  5:13 */   private static final oa e = new oa("textures/entity/wither/wither.png");
/*  6:   */   
/*  7:   */   public crw(cpt paramcpt)
/*  8:   */   {
/*  9:16 */     super(paramcpt, new cdn(0.0F), 1.0F);
/* 10:   */     
/* 11:18 */     a(new csy(this));
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void a(EntityWither paramadf, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 15:   */   {
/* 16:23 */     ciu.a(paramadf, true);
/* 17:   */     
/* 18:25 */     super.a(paramadf, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 19:   */   }
/* 20:   */   
/* 21:   */   protected oa a(EntityWither paramadf)
/* 22:   */   {
/* 23:30 */     int i = paramadf.cj();
/* 24:31 */     if ((i <= 0) || ((i <= 80) && (i / 5 % 2 == 1))) {
/* 25:32 */       return e;
/* 26:   */     }
/* 27:34 */     return a;
/* 28:   */   }
/* 29:   */   
/* 30:   */   protected void a(EntityWither paramadf, float paramFloat)
/* 31:   */   {
/* 32:39 */     float f = 2.0F;
/* 33:   */     
/* 34:41 */     int i = paramadf.cj();
/* 35:42 */     if (i > 0) {
/* 36:43 */       f -= (i - paramFloat) / 220.0F * 0.5F;
/* 37:   */     }
/* 38:46 */     cjm.glScalef(f, f, f);
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     crw
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*  1:   */ public class csp
/*  2:   */   implements csq<EntityPig>
/*  3:   */ {
/*  4: 9 */   private static final oa a = new oa("textures/entity/pig/pig_saddle.png");
/*  5:   */   private final crd b;
/*  6:12 */   private final ccs c = new ccs(0.5F);
/*  7:   */   
/*  8:   */   public csp(crd paramcrd)
/*  9:   */   {
/* 10:15 */     this.b = paramcrd;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(EntityPig paramaca, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 14:   */   {
/* 15:20 */     if (!paramaca.cj()) {
/* 16:21 */       return;
/* 17:   */     }
/* 18:24 */     this.b.a(a);
/* 19:25 */     this.c.a(this.b.b());
/* 20:26 */     this.c.a(paramaca, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public boolean b()
/* 24:   */   {
/* 25:31 */     return false;
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     csp
 * JD-Core Version:    0.7.0.1
 */
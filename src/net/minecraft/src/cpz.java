package net.minecraft.src;
/*  1:   */ public class cpz
/*  2:   */   extends cqz<EntityGhast>
/*  3:   */ {
/*  4: 9 */   private static final oa a = new oa("textures/entity/ghast/ghast.png");
/*  5:10 */   private static final oa e = new oa("textures/entity/ghast/ghast_shooting.png");
/*  6:   */   
/*  7:   */   public cpz(cpt paramcpt)
/*  8:   */   {
/*  9:13 */     super(paramcpt, new cch(), 0.5F);
/* 10:   */   }
/* 11:   */   
/* 12:   */   protected oa a(EntityGhast paramafa)
/* 13:   */   {
/* 14:18 */     if (paramafa.n()) {
/* 15:19 */       return e;
/* 16:   */     }
/* 17:22 */     return a;
/* 18:   */   }
/* 19:   */   
/* 20:   */   protected void a(EntityGhast paramafa, float paramFloat)
/* 21:   */   {
/* 22:27 */     float f1 = 1.0F;
/* 23:28 */     float f2 = (8.0F + f1) / 2.0F;
/* 24:29 */     float f3 = (8.0F + 1.0F / f1) / 2.0F;
/* 25:30 */     cjm.glScalef(f3, f2, f3);
/* 26:31 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cpz
 * JD-Core Version:    0.7.0.1
 */
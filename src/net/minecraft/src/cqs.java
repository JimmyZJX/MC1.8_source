package net.minecraft.src;
/*  1:   */ public class cqs
/*  2:   */   extends cqz<EntityLavaSlime>
/*  3:   */ {
/*  4: 9 */   private static final oa a = new oa("textures/entity/slime/magmacube.png");
/*  5:   */   
/*  6:   */   public cqs(cpt paramcpt)
/*  7:   */   {
/*  8:12 */     super(paramcpt, new ccn(), 0.25F);
/*  9:   */   }
/* 10:   */   
/* 11:   */   protected oa a(EntityLavaSlime paramafl)
/* 12:   */   {
/* 13:17 */     return a;
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected void a(EntityLavaSlime paramafl, float paramFloat)
/* 17:   */   {
/* 18:22 */     int i = paramafl.ck();
/* 19:23 */     float f1 = (paramafl.c + (paramafl.b - paramafl.c) * paramFloat) / (i * 0.5F + 1.0F);
/* 20:24 */     float f2 = 1.0F / (f1 + 1.0F);
/* 21:25 */     float f3 = i;
/* 22:26 */     cjm.glScalef(f2 * f3, 1.0F / f2 * f3, f2 * f3);
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cqs
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*  1:   */ public class cpn
/*  2:   */   extends cqz<EntityCreeper>
/*  3:   */ {
/*  4:11 */   private static final oa a = new oa("textures/entity/creeper/creeper.png");
/*  5:   */   
/*  6:   */   public cpn(cpt paramcpt)
/*  7:   */   {
/*  8:14 */     super(paramcpt, new cce(), 0.5F);
/*  9:   */     
/* 10:16 */     a(new csg(this));
/* 11:   */   }
/* 12:   */   
/* 13:   */   protected void a(EntityCreeper paramaep, float paramFloat)
/* 14:   */   {
/* 15:21 */     float f1 = paramaep.a(paramFloat);
/* 16:   */     
/* 17:23 */     float f2 = 1.0F + MathUtils.sin(f1 * 100.0F) * f1 * 0.01F;
/* 18:24 */     f1 = MathUtils.clamp(f1, 0.0F, 1.0F);
/* 19:25 */     f1 *= f1;
/* 20:26 */     f1 *= f1;
/* 21:27 */     float f3 = (1.0F + f1 * 0.4F) * f2;
/* 22:28 */     float f4 = (1.0F + f1 * 0.1F) / f2;
/* 23:29 */     cjm.glScalef(f3, f4, f3);
/* 24:   */   }
/* 25:   */   
/* 26:   */   protected int a(EntityCreeper paramaep, float paramFloat1, float paramFloat2)
/* 27:   */   {
/* 28:34 */     float f = paramaep.a(paramFloat2);
/* 29:36 */     if ((int)(f * 10.0F) % 2 == 0) {
/* 30:37 */       return 0;
/* 31:   */     }
/* 32:40 */     int i = (int)(f * 0.2F * 255.0F);
/* 33:41 */     i = MathUtils.clamp(i, 0, 255);
/* 34:   */     
/* 35:43 */     return i << 24 | 0xFFFFFF;
/* 36:   */   }
/* 37:   */   
/* 38:   */   protected oa a(EntityCreeper paramaep)
/* 39:   */   {
/* 40:48 */     return a;
/* 41:   */   }
/* 42:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cpn
 * JD-Core Version:    0.7.0.1
 */
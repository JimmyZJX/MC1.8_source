package net.minecraft.src;
/*  1:   */ public class cpp
/*  2:   */   extends cpu<ada>
/*  3:   */ {
/*  4:11 */   private static final oa a = new oa("textures/entity/endercrystal/endercrystal.png");
/*  5:14 */   private ccq e = new cdr(0.0F, true);
/*  6:   */   
/*  7:   */   public cpp(cpt paramcpt)
/*  8:   */   {
/*  9:17 */     super(paramcpt);
/* 10:18 */     this.c = 0.5F;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(ada paramada, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 14:   */   {
/* 15:23 */     float f1 = paramada.a + paramFloat2;
/* 16:24 */     cjm.glPushMatrix();
/* 17:25 */     cjm.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 18:   */     
/* 19:27 */     a(a);
/* 20:28 */     float f2 = MathUtils.sin(f1 * 0.2F) / 2.0F + 0.5F;
/* 21:29 */     f2 = f2 * f2 + f2;
/* 22:30 */     this.e.a(paramada, 0.0F, f1 * 3.0F, f2 * 0.2F, 0.0F, 0.0F, 0.0625F);
/* 23:31 */     cjm.glPopMatrix();
/* 24:   */     
/* 25:33 */     super.a(paramada, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 26:   */   }
/* 27:   */   
/* 28:   */   protected oa a(ada paramada)
/* 29:   */   {
/* 30:38 */     return a;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cpp
 * JD-Core Version:    0.7.0.1
 */
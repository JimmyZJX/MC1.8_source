package net.minecraft.src;
/*  1:   */ public class cpl
/*  2:   */   extends cqz<EntityChicken>
/*  3:   */ {
/*  4: 9 */   private static final oa a = new oa("textures/entity/chicken.png");
/*  5:   */   
/*  6:   */   public cpl(cpt paramcpt, ccq paramccq, float paramFloat)
/*  7:   */   {
/*  8:12 */     super(paramcpt, paramccq, paramFloat);
/*  9:   */   }
/* 10:   */   
/* 11:   */   protected oa a(EntityChicken paramabr)
/* 12:   */   {
/* 13:17 */     return a;
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected float b(EntityChicken paramabr, float paramFloat)
/* 17:   */   {
/* 18:22 */     float f1 = paramabr.bo + (paramabr.bk - paramabr.bo) * paramFloat;
/* 19:23 */     float f2 = paramabr.bn + (paramabr.bm - paramabr.bn) * paramFloat;
/* 20:   */     
/* 21:25 */     return (MathUtils.sin(f1) + 1.0F) * f2;
/* 22:   */   }
/* 23:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cpl
 * JD-Core Version:    0.7.0.1
 */
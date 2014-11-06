package net.minecraft.src;
/*  1:   */ public class cro
/*  2:   */   extends cqz<EntitySquid>
/*  3:   */ {
/*  4: 9 */   private static final oa a = new oa("textures/entity/squid.png");
/*  5:   */   
/*  6:   */   public cro(cpt paramcpt, ccq paramccq, float paramFloat)
/*  7:   */   {
/*  8:12 */     super(paramcpt, paramccq, paramFloat);
/*  9:   */   }
/* 10:   */   
/* 11:   */   protected oa a(EntitySquid paramaco)
/* 12:   */   {
/* 13:17 */     return a;
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected void a(EntitySquid paramaco, float paramFloat1, float paramFloat2, float paramFloat3)
/* 17:   */   {
/* 18:22 */     float f1 = paramaco.b + (paramaco.a - paramaco.b) * paramFloat3;
/* 19:23 */     float f2 = paramaco.bi + (paramaco.c - paramaco.bi) * paramFloat3;
/* 20:   */     
/* 21:25 */     cjm.glTranslatef(0.0F, 0.5F, 0.0F);
/* 22:26 */     cjm.glRotatef(180.0F - paramFloat2, 0.0F, 1.0F, 0.0F);
/* 23:27 */     cjm.glRotatef(f1, 1.0F, 0.0F, 0.0F);
/* 24:28 */     cjm.glRotatef(f2, 0.0F, 1.0F, 0.0F);
/* 25:29 */     cjm.glTranslatef(0.0F, -1.2F, 0.0F);
/* 26:   */   }
/* 27:   */   
/* 28:   */   protected float b(EntitySquid paramaco, float paramFloat)
/* 29:   */   {
/* 30:34 */     return paramaco.bm + (paramaco.bl - paramaco.bm) * paramFloat;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cro
 * JD-Core Version:    0.7.0.1
 */
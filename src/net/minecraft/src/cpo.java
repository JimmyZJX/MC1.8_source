package net.minecraft.src;
/*  1:   */ public class cpo
/*  2:   */   extends cpu<Entity>
/*  3:   */ {
/*  4:   */   public cpo(cpt paramcpt)
/*  5:   */   {
/*  6: 9 */     super(paramcpt);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public void a(Entity paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 10:   */   {
/* 11:14 */     cjm.glPushMatrix();
/* 12:15 */     a(paramwv.getAABB(), paramDouble1 - paramwv.P, paramDouble2 - paramwv.Q, paramDouble3 - paramwv.R);
/* 13:16 */     cjm.glPopMatrix();
/* 14:   */     
/* 15:18 */     super.a(paramwv, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 16:   */   }
/* 17:   */   
/* 18:   */   protected oa a(Entity paramwv)
/* 19:   */   {
/* 20:23 */     return null;
/* 21:   */   }
/* 22:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cpo
 * JD-Core Version:    0.7.0.1
 */
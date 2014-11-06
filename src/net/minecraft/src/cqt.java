package net.minecraft.src;
/*  1:   */ public class cqt
/*  2:   */   extends cpu<adl>
/*  3:   */ {
/*  4: 9 */   private static final oa a = new oa("textures/entity/lead_knot.png");
/*  5:11 */   private cco e = new cco();
/*  6:   */   
/*  7:   */   public cqt(cpt paramcpt)
/*  8:   */   {
/*  9:14 */     super(paramcpt);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public void a(adl paramadl, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 13:   */   {
/* 14:19 */     cjm.glPushMatrix();
/* 15:20 */     cjm.p();
/* 16:   */     
/* 17:22 */     cjm.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 18:   */     
/* 19:24 */     float f = 0.0625F;
/* 20:25 */     cjm.B();
/* 21:26 */     cjm.glScalef(-1.0F, -1.0F, 1.0F);
/* 22:   */     
/* 23:28 */     cjm.enableAlphaTest();
/* 24:   */     
/* 25:30 */     c(paramadl);
/* 26:31 */     this.e.a(paramadl, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, f);
/* 27:   */     
/* 28:33 */     cjm.glPopMatrix();
/* 29:   */     
/* 30:35 */     super.a(paramadl, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 31:   */   }
/* 32:   */   
/* 33:   */   protected oa a(adl paramadl)
/* 34:   */   {
/* 35:40 */     return a;
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cqt
 * JD-Core Version:    0.7.0.1
 */
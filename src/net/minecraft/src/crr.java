package net.minecraft.src;
/*  1:   */ public class crr
/*  2:   */   extends cqx<aej>
/*  3:   */ {
/*  4:   */   public crr(cpt paramcpt)
/*  5:   */   {
/*  6:16 */     super(paramcpt);
/*  7:   */   }
/*  8:   */   
/*  9:   */   protected void a(aej paramaej, float paramFloat, Block parambec)
/* 10:   */   {
/* 11:21 */     int i = paramaej.l();
/* 12:23 */     if ((i > -1) && 
/* 13:24 */       (i - paramFloat + 1.0F < 10.0F))
/* 14:   */     {
/* 15:25 */       float f1 = 1.0F - (i - paramFloat + 1.0F) / 10.0F;
/* 16:26 */       f1 = MathUtils.clamp(f1, 0.0F, 1.0F);
/* 17:27 */       f1 *= f1;
/* 18:28 */       f1 *= f1;
/* 19:29 */       float f2 = 1.0F + f1 * 0.3F;
/* 20:30 */       cjm.glScalef(f2, f2, f2);
/* 21:   */     }
/* 22:34 */     super.a(paramaej, paramFloat, parambec);
/* 23:36 */     if ((i > -1) && (i / 5 % 2 == 0))
/* 24:   */     {
/* 25:37 */       cll localcll = bsu.z().ab();
/* 26:   */       
/* 27:39 */       cjm.x();
/* 28:40 */       cjm.disableLighting();
/* 29:41 */       cjm.enableBlend();
/* 30:42 */       cjm.glBlendFunc(770, 772);
/* 31:43 */       cjm.c(1.0F, 1.0F, 1.0F, (1.0F - (i - paramFloat + 1.0F) / 100.0F) * 0.8F);
/* 32:   */       
/* 33:45 */       cjm.glPushMatrix();
/* 34:46 */       localcll.a(BlockList.W.instance(), 1.0F);
/* 35:47 */       cjm.glPopMatrix();
/* 36:   */       
/* 37:49 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 38:50 */       cjm.disableBlend();
/* 39:51 */       cjm.enableLighting();
/* 40:52 */       cjm.w();
/* 41:   */     }
/* 42:   */   }
/* 43:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     crr
 * JD-Core Version:    0.7.0.1
 */
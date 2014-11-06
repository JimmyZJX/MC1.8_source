package net.minecraft.src;
/*  1:   */ public class bam
/*  2:   */   extends awt
/*  3:   */ {
/*  4:   */   public bam()
/*  5:   */   {
/*  6:12 */     super(Material.B, false);
/*  7:13 */     setCreativeTab(CreativeTabs.tabDeco);
/*  8:14 */     this.K = 0.8F;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public aql k()
/* 12:   */   {
/* 13:19 */     return aql.d;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(World paramaqu, BlockPosition paramdt, Entity paramwv, float paramFloat)
/* 17:   */   {
/* 18:24 */     if (paramwv.aw()) {
/* 19:25 */       super.a(paramaqu, paramdt, paramwv, paramFloat);
/* 20:   */     } else {
/* 21:27 */       paramwv.e(paramFloat, 0.0F);
/* 22:   */     }
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void a(World paramaqu, Entity paramwv)
/* 26:   */   {
/* 27:33 */     if (paramwv.aw()) {
/* 28:34 */       super.a(paramaqu, paramwv);
/* 29:36 */     } else if (paramwv.yVelocity < 0.0D) {
/* 30:37 */       paramwv.yVelocity = (-paramwv.yVelocity);
/* 31:   */     }
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void a(World paramaqu, BlockPosition paramdt, Entity paramwv)
/* 35:   */   {
/* 36:44 */     if ((Math.abs(paramwv.yVelocity) < 0.1D) && (!paramwv.aw()))
/* 37:   */     {
/* 38:45 */       double d = 0.4D + Math.abs(paramwv.yVelocity) * 0.2D;
/* 39:46 */       paramwv.xVelocity *= d;
/* 40:47 */       paramwv.zVelocity *= d;
/* 41:   */     }
/* 42:49 */     super.a(paramaqu, paramdt, paramwv);
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bam
 * JD-Core Version:    0.7.0.1
 */
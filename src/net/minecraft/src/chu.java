package net.minecraft.src;
/*  1:   */ public class chu
/*  2:   */   extends cii
/*  3:   */ {
/*  4:   */   protected chu(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  5:   */   {
/*  6: 7 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  7: 8 */     this.i = 0.04F;
/*  8: 9 */     k();
/*  9:10 */     if ((paramDouble5 == 0.0D) && ((paramDouble4 != 0.0D) || (paramDouble6 != 0.0D)))
/* 10:   */     {
/* 11:11 */       this.xVelocity = paramDouble4;
/* 12:12 */       this.yVelocity = (paramDouble5 + 0.1D);
/* 13:13 */       this.zVelocity = paramDouble6;
/* 14:   */     }
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     chu
 * JD-Core Version:    0.7.0.1
 */
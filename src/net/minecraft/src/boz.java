package net.minecraft.src;
/*  1:   */ public class boz
/*  2:   */   extends bpa
/*  3:   */ {
/*  4:   */   public boz(long paramLong)
/*  5:   */   {
/*  6: 5 */     super(paramLong);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 10:   */   {
/* 11:10 */     int[] arrayOfInt = boy.a(paramInt3 * paramInt4);
/* 12:11 */     for (int i = 0; i < paramInt4; i++) {
/* 13:12 */       for (int j = 0; j < paramInt3; j++)
/* 14:   */       {
/* 15:13 */         a(paramInt1 + j, paramInt2 + i);
/* 16:14 */         arrayOfInt[(j + i * paramInt3)] = (a(10) == 0 ? 1 : 0);
/* 17:   */       }
/* 18:   */     }
/* 19:18 */     if ((paramInt1 > -paramInt3) && (paramInt1 <= 0) && (paramInt2 > -paramInt4) && (paramInt2 <= 0)) {
/* 20:19 */       arrayOfInt[(-paramInt1 + -paramInt2 * paramInt3)] = 1;
/* 21:   */     }
/* 22:21 */     return arrayOfInt;
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     boz
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*  1:   */ public class bpg
/*  2:   */   extends bpa
/*  3:   */ {
/*  4:   */   public bpg(long paramLong, bpa parambpa)
/*  5:   */   {
/*  6: 5 */     super(paramLong);
/*  7: 6 */     this.a = parambpa;
/*  8:   */   }
/*  9:   */   
/* 10:   */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 11:   */   {
/* 12:11 */     int[] arrayOfInt1 = this.a.a(paramInt1, paramInt2, paramInt3, paramInt4);
/* 13:   */     
/* 14:13 */     int[] arrayOfInt2 = boy.a(paramInt3 * paramInt4);
/* 15:14 */     for (int i = 0; i < paramInt4; i++) {
/* 16:15 */       for (int j = 0; j < paramInt3; j++)
/* 17:   */       {
/* 18:16 */         a(j + paramInt1, i + paramInt2);
/* 19:17 */         arrayOfInt2[(j + i * paramInt3)] = (arrayOfInt1[(j + i * paramInt3)] > 0 ? a(299999) + 2 : 0);
/* 20:   */       }
/* 21:   */     }
/* 22:21 */     return arrayOfInt2;
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpg
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*  1:   */ public class bph
/*  2:   */   extends bpa
/*  3:   */ {
/*  4:   */   public bph(long paramLong, bpa parambpa)
/*  5:   */   {
/*  6: 7 */     super(paramLong);
/*  7: 8 */     this.a = parambpa;
/*  8:   */   }
/*  9:   */   
/* 10:   */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 11:   */   {
/* 12:13 */     int i = paramInt1 - 1;
/* 13:14 */     int j = paramInt2 - 1;
/* 14:15 */     int k = paramInt3 + 2;
/* 15:16 */     int m = paramInt4 + 2;
/* 16:17 */     int[] arrayOfInt1 = this.a.a(i, j, k, m);
/* 17:   */     
/* 18:19 */     int[] arrayOfInt2 = boy.a(paramInt3 * paramInt4);
/* 19:20 */     for (int n = 0; n < paramInt4; n++) {
/* 20:21 */       for (int i1 = 0; i1 < paramInt3; i1++)
/* 21:   */       {
/* 22:22 */         int i2 = c(arrayOfInt1[(i1 + 0 + (n + 1) * k)]);
/* 23:23 */         int i3 = c(arrayOfInt1[(i1 + 2 + (n + 1) * k)]);
/* 24:24 */         int i4 = c(arrayOfInt1[(i1 + 1 + (n + 0) * k)]);
/* 25:25 */         int i5 = c(arrayOfInt1[(i1 + 1 + (n + 2) * k)]);
/* 26:26 */         int i6 = c(arrayOfInt1[(i1 + 1 + (n + 1) * k)]);
/* 27:27 */         if ((i6 != i2) || (i6 != i4) || (i6 != i3) || (i6 != i5)) {
/* 28:28 */           arrayOfInt2[(i1 + n * paramInt3)] = arm.w.az;
/* 29:   */         } else {
/* 30:30 */           arrayOfInt2[(i1 + n * paramInt3)] = -1;
/* 31:   */         }
/* 32:   */       }
/* 33:   */     }
/* 34:35 */     return arrayOfInt2;
/* 35:   */   }
/* 36:   */   
/* 37:   */   private int c(int paramInt)
/* 38:   */   {
/* 39:39 */     if (paramInt >= 2) {
/* 40:40 */       return 2 + (paramInt & 0x1);
/* 41:   */     }
/* 42:42 */     return paramInt;
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bph
 * JD-Core Version:    0.7.0.1
 */
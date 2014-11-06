package net.minecraft.src;
/*  1:   */ public class bop
/*  2:   */   extends bpa
/*  3:   */ {
/*  4:   */   public bop(long paramLong, bpa parambpa)
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
/* 22:22 */         int i2 = arrayOfInt1[(i1 + 0 + (n + 0) * k)];
/* 23:23 */         int i3 = arrayOfInt1[(i1 + 2 + (n + 0) * k)];
/* 24:24 */         int i4 = arrayOfInt1[(i1 + 0 + (n + 2) * k)];
/* 25:25 */         int i5 = arrayOfInt1[(i1 + 2 + (n + 2) * k)];
/* 26:26 */         int i6 = arrayOfInt1[(i1 + 1 + (n + 1) * k)];
/* 27:27 */         a(i1 + paramInt1, n + paramInt2);
/* 28:28 */         if ((i6 == 0) && (i2 == 0) && (i3 == 0) && (i4 == 0) && (i5 == 0) && (a(100) == 0)) {
/* 29:29 */           arrayOfInt2[(i1 + n * paramInt3)] = arm.D.az;
/* 30:   */         } else {
/* 31:31 */           arrayOfInt2[(i1 + n * paramInt3)] = i6;
/* 32:   */         }
/* 33:   */       }
/* 34:   */     }
/* 35:35 */     return arrayOfInt2;
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bop
 * JD-Core Version:    0.7.0.1
 */
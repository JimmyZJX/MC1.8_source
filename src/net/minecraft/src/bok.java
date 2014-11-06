package net.minecraft.src;
/*  1:   */ public class bok
/*  2:   */   extends bpa
/*  3:   */ {
/*  4:   */   public bok(long paramLong, bpa parambpa)
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
/* 22:22 */         int i2 = arrayOfInt1[(i1 + 1 + (n + 1 - 1) * (paramInt3 + 2))];
/* 23:23 */         int i3 = arrayOfInt1[(i1 + 1 + 1 + (n + 1) * (paramInt3 + 2))];
/* 24:24 */         int i4 = arrayOfInt1[(i1 + 1 - 1 + (n + 1) * (paramInt3 + 2))];
/* 25:25 */         int i5 = arrayOfInt1[(i1 + 1 + (n + 1 + 1) * (paramInt3 + 2))];
/* 26:   */         
/* 27:27 */         int i6 = arrayOfInt1[(i1 + 1 + (n + 1) * k)];
/* 28:28 */         int i7 = 0;
/* 29:29 */         if (i2 == 0) {
/* 30:30 */           i7++;
/* 31:   */         }
/* 32:32 */         if (i3 == 0) {
/* 33:33 */           i7++;
/* 34:   */         }
/* 35:35 */         if (i4 == 0) {
/* 36:36 */           i7++;
/* 37:   */         }
/* 38:38 */         if (i5 == 0) {
/* 39:39 */           i7++;
/* 40:   */         }
/* 41:42 */         if ((i6 == 0) && (i7 > 3)) {
/* 42:43 */           arrayOfInt2[(i1 + n * paramInt3)] = arm.N.az;
/* 43:   */         } else {
/* 44:45 */           arrayOfInt2[(i1 + n * paramInt3)] = i6;
/* 45:   */         }
/* 46:   */       }
/* 47:   */     }
/* 48:49 */     return arrayOfInt2;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bok
 * JD-Core Version:    0.7.0.1
 */
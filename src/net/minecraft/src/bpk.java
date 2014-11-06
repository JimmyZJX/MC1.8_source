package net.minecraft.src;
/*  1:   */ public class bpk
/*  2:   */   extends bpa
/*  3:   */ {
/*  4:   */   public bpk(long paramLong, bpa parambpa)
/*  5:   */   {
/*  6: 5 */     super(paramLong);
/*  7: 6 */     this.a = parambpa;
/*  8:   */   }
/*  9:   */   
/* 10:   */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 11:   */   {
/* 12:11 */     int i = paramInt1 - 1;
/* 13:12 */     int j = paramInt2 - 1;
/* 14:13 */     int k = paramInt3 + 2;
/* 15:14 */     int m = paramInt4 + 2;
/* 16:15 */     int[] arrayOfInt1 = this.a.a(i, j, k, m);
/* 17:   */     
/* 18:17 */     int[] arrayOfInt2 = boy.a(paramInt3 * paramInt4);
/* 19:18 */     for (int n = 0; n < paramInt4; n++) {
/* 20:19 */       for (int i1 = 0; i1 < paramInt3; i1++)
/* 21:   */       {
/* 22:20 */         int i2 = arrayOfInt1[(i1 + 0 + (n + 1) * k)];
/* 23:21 */         int i3 = arrayOfInt1[(i1 + 2 + (n + 1) * k)];
/* 24:22 */         int i4 = arrayOfInt1[(i1 + 1 + (n + 0) * k)];
/* 25:23 */         int i5 = arrayOfInt1[(i1 + 1 + (n + 2) * k)];
/* 26:24 */         int i6 = arrayOfInt1[(i1 + 1 + (n + 1) * k)];
/* 27:25 */         if ((i2 == i3) && (i4 == i5))
/* 28:   */         {
/* 29:26 */           a(i1 + paramInt1, n + paramInt2);
/* 30:27 */           if (a(2) == 0) {
/* 31:28 */             i6 = i2;
/* 32:   */           } else {
/* 33:30 */             i6 = i4;
/* 34:   */           }
/* 35:   */         }
/* 36:   */         else
/* 37:   */         {
/* 38:33 */           if (i2 == i3) {
/* 39:34 */             i6 = i2;
/* 40:   */           }
/* 41:36 */           if (i4 == i5) {
/* 42:37 */             i6 = i4;
/* 43:   */           }
/* 44:   */         }
/* 45:40 */         arrayOfInt2[(i1 + n * paramInt3)] = i6;
/* 46:   */       }
/* 47:   */     }
/* 48:44 */     return arrayOfInt2;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpk
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*  1:   */ public class boq
/*  2:   */   extends bpa
/*  3:   */ {
/*  4:   */   public boq(long paramLong, bpa parambpa)
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
/* 22:20 */         int i2 = arrayOfInt1[(i1 + 1 + (n + 1) * k)];
/* 23:21 */         a(i1 + paramInt1, n + paramInt2);
/* 24:22 */         if (i2 == 0)
/* 25:   */         {
/* 26:23 */           arrayOfInt2[(i1 + n * paramInt3)] = 0;
/* 27:   */         }
/* 28:   */         else
/* 29:   */         {
/* 30:25 */           int i3 = a(6);
/* 31:26 */           if (i3 == 0) {
/* 32:27 */             i3 = 4;
/* 33:28 */           } else if (i3 <= 1) {
/* 34:29 */             i3 = 3;
/* 35:   */           } else {
/* 36:31 */             i3 = 1;
/* 37:   */           }
/* 38:33 */           arrayOfInt2[(i1 + n * paramInt3)] = i3;
/* 39:   */         }
/* 40:   */       }
/* 41:   */     }
/* 42:37 */     return arrayOfInt2;
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     boq
 * JD-Core Version:    0.7.0.1
 */
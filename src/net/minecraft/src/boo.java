package net.minecraft.src;
/*  1:   */ public class boo
/*  2:   */   extends bpa
/*  3:   */ {
/*  4:   */   public boo(long paramLong, bpa parambpa)
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
/* 22:20 */         int i2 = arrayOfInt1[(i1 + 0 + (n + 0) * k)];
/* 23:21 */         int i3 = arrayOfInt1[(i1 + 2 + (n + 0) * k)];
/* 24:22 */         int i4 = arrayOfInt1[(i1 + 0 + (n + 2) * k)];
/* 25:23 */         int i5 = arrayOfInt1[(i1 + 2 + (n + 2) * k)];
/* 26:24 */         int i6 = arrayOfInt1[(i1 + 1 + (n + 1) * k)];
/* 27:25 */         a(i1 + paramInt1, n + paramInt2);
/* 28:26 */         if ((i6 == 0) && ((i2 != 0) || (i3 != 0) || (i4 != 0) || (i5 != 0)))
/* 29:   */         {
/* 30:27 */           int i7 = 1;
/* 31:28 */           int i8 = 1;
/* 32:29 */           if ((i2 != 0) && (a(i7++) == 0)) {
/* 33:30 */             i8 = i2;
/* 34:   */           }
/* 35:32 */           if ((i3 != 0) && (a(i7++) == 0)) {
/* 36:33 */             i8 = i3;
/* 37:   */           }
/* 38:35 */           if ((i4 != 0) && (a(i7++) == 0)) {
/* 39:36 */             i8 = i4;
/* 40:   */           }
/* 41:38 */           if ((i5 != 0) && (a(i7++) == 0)) {
/* 42:39 */             i8 = i5;
/* 43:   */           }
/* 44:41 */           if (a(3) == 0) {
/* 45:42 */             arrayOfInt2[(i1 + n * paramInt3)] = i8;
/* 46:44 */           } else if (i8 == 4) {
/* 47:45 */             arrayOfInt2[(i1 + n * paramInt3)] = 4;
/* 48:   */           } else {
/* 49:47 */             arrayOfInt2[(i1 + n * paramInt3)] = 0;
/* 50:   */           }
/* 51:   */         }
/* 52:50 */         else if ((i6 > 0) && ((i2 == 0) || (i3 == 0) || (i4 == 0) || (i5 == 0)))
/* 53:   */         {
/* 54:51 */           if (a(5) == 0)
/* 55:   */           {
/* 56:52 */             if (i6 == 4) {
/* 57:53 */               arrayOfInt2[(i1 + n * paramInt3)] = 4;
/* 58:   */             } else {
/* 59:55 */               arrayOfInt2[(i1 + n * paramInt3)] = 0;
/* 60:   */             }
/* 61:   */           }
/* 62:   */           else {
/* 63:58 */             arrayOfInt2[(i1 + n * paramInt3)] = i6;
/* 64:   */           }
/* 65:   */         }
/* 66:   */         else
/* 67:   */         {
/* 68:61 */           arrayOfInt2[(i1 + n * paramInt3)] = i6;
/* 69:   */         }
/* 70:   */       }
/* 71:   */     }
/* 72:65 */     return arrayOfInt2;
/* 73:   */   }
/* 74:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     boo
 * JD-Core Version:    0.7.0.1
 */
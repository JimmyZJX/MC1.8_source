package net.minecraft.src;
/*  1:   */ public class bpp
/*  2:   */   extends bpa
/*  3:   */ {
/*  4:   */   public bpp(long paramLong, bpa parambpa)
/*  5:   */   {
/*  6: 9 */     super(paramLong);
/*  7:10 */     this.a = parambpa;
/*  8:   */   }
/*  9:   */   
/* 10:   */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 11:   */   {
/* 12:15 */     int i = paramInt1 >> 1;
/* 13:16 */     int j = paramInt2 >> 1;
/* 14:17 */     int k = (paramInt3 >> 1) + 2;
/* 15:18 */     int m = (paramInt4 >> 1) + 2;
/* 16:19 */     int[] arrayOfInt1 = this.a.a(i, j, k, m);
/* 17:   */     
/* 18:21 */     int n = k - 1 << 1;
/* 19:22 */     int i1 = m - 1 << 1;
/* 20:   */     
/* 21:24 */     int[] arrayOfInt2 = boy.a(n * i1);
/* 22:26 */     for (int i2 = 0; i2 < m - 1; i2++)
/* 23:   */     {
/* 24:27 */       int i3 = (i2 << 1) * n;
/* 25:   */       
/* 26:29 */       int i4 = 0;
/* 27:30 */       int i5 = arrayOfInt1[(i4 + 0 + (i2 + 0) * k)];
/* 28:31 */       int i6 = arrayOfInt1[(i4 + 0 + (i2 + 1) * k)];
/* 29:32 */       for (; i4 < k - 1; i4++)
/* 30:   */       {
/* 31:33 */         a(i4 + i << 1, i2 + j << 1);
/* 32:   */         
/* 33:35 */         int i7 = arrayOfInt1[(i4 + 1 + (i2 + 0) * k)];
/* 34:36 */         int i8 = arrayOfInt1[(i4 + 1 + (i2 + 1) * k)];
/* 35:   */         
/* 36:38 */         arrayOfInt2[i3] = i5;
/* 37:39 */         arrayOfInt2[(i3++ + n)] = a(new int[] { i5, i6 });
/* 38:40 */         arrayOfInt2[i3] = a(new int[] { i5, i7 });
/* 39:41 */         arrayOfInt2[(i3++ + n)] = b(i5, i7, i6, i8);
/* 40:   */         
/* 41:43 */         i5 = i7;
/* 42:44 */         i6 = i8;
/* 43:   */       }
/* 44:   */     }
/* 45:48 */     int[] arrayOfInt3 = boy.a(paramInt3 * paramInt4);
/* 46:49 */     for (int i3 = 0; i3 < paramInt4; i3++) {
/* 47:50 */       System.arraycopy(arrayOfInt2, (i3 + (paramInt2 & 0x1)) * n + (paramInt1 & 0x1), arrayOfInt3, i3 * paramInt3, paramInt3);
/* 48:   */     }
/* 49:52 */     return arrayOfInt3;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public static bpa b(long paramLong, bpa parambpa, int paramInt)
/* 53:   */   {
/* 54:56 */     bpa localObject = parambpa;
/* 55:57 */     for (int i = 0; i < paramInt; i++) {
/* 56:58 */       localObject = new bpp(paramLong + i, (bpa)localObject);
/* 57:   */     }
/* 58:60 */     return localObject;
/* 59:   */   }
/* 60:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpp
 * JD-Core Version:    0.7.0.1
 */
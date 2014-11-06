package net.minecraft.src;
/*  1:   */ public class bpo
/*  2:   */   extends bpa
/*  3:   */ {
/*  4:   */   public bpo(long paramLong, bpa parambpa)
/*  5:   */   {
/*  6:10 */     super(paramLong);
/*  7:11 */     this.a = parambpa;
/*  8:   */   }
/*  9:   */   
/* 10:   */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 11:   */   {
/* 12:16 */     paramInt1 -= 2;
/* 13:17 */     paramInt2 -= 2;
/* 14:18 */     int i = paramInt1 >> 2;
/* 15:19 */     int j = paramInt2 >> 2;
/* 16:20 */     int k = (paramInt3 >> 2) + 2;
/* 17:21 */     int m = (paramInt4 >> 2) + 2;
/* 18:22 */     int[] arrayOfInt1 = this.a.a(i, j, k, m);
/* 19:   */     
/* 20:24 */     int n = k - 1 << 2;
/* 21:25 */     int i1 = m - 1 << 2;
/* 22:   */     
/* 23:27 */     int[] arrayOfInt2 = boy.a(n * i1);
/* 24:28 */     for (int i2 = 0; i2 < m - 1; i2++)
/* 25:   */     {
/* 26:29 */       int i3 = 0;
/* 27:30 */       int i4 = arrayOfInt1[(i3 + 0 + (i2 + 0) * k)];
/* 28:31 */       int i5 = arrayOfInt1[(i3 + 0 + (i2 + 1) * k)];
/* 29:32 */       for (; i3 < k - 1; i3++)
/* 30:   */       {
/* 31:33 */         double d1 = 3.6D;
/* 32:34 */         a((long)i3 + i << 2, i2 + j << 2);
/* 33:35 */         double d2 = (a(1024) / 1024.0D - 0.5D) * 3.6D;
/* 34:36 */         double d3 = (a(1024) / 1024.0D - 0.5D) * 3.6D;
/* 35:   */         
/* 36:38 */         a((long)i3 + i + 1 << 2, i2 + j << 2);
/* 37:39 */         double d4 = (a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/* 38:40 */         double d5 = (a(1024) / 1024.0D - 0.5D) * 3.6D;
/* 39:   */         
/* 40:42 */         a((long)i3 + i << 2, i2 + j + 1 << 2);
/* 41:43 */         double d6 = (a(1024) / 1024.0D - 0.5D) * 3.6D;
/* 42:44 */         double d7 = (a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/* 43:   */         
/* 44:46 */         a((long)i3 + i + 1 << 2, i2 + j + 1 << 2);
/* 45:47 */         double d8 = (a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/* 46:48 */         double d9 = (a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/* 47:   */         
/* 48:50 */         int i6 = arrayOfInt1[(i3 + 1 + (i2 + 0) * k)] & 0xFF;
/* 49:51 */         int i7 = arrayOfInt1[(i3 + 1 + (i2 + 1) * k)] & 0xFF;
/* 50:53 */         for (int i8 = 0; i8 < 4; i8++)
/* 51:   */         {
/* 52:54 */           int i9 = ((i2 << 2) + i8) * n + (i3 << 2);
/* 53:55 */           for (int i10 = 0; i10 < 4; i10++)
/* 54:   */           {
/* 55:56 */             double d10 = (i8 - d3) * (i8 - d3) + (i10 - d2) * (i10 - d2);
/* 56:57 */             double d11 = (i8 - d5) * (i8 - d5) + (i10 - d4) * (i10 - d4);
/* 57:58 */             double d12 = (i8 - d7) * (i8 - d7) + (i10 - d6) * (i10 - d6);
/* 58:59 */             double d13 = (i8 - d9) * (i8 - d9) + (i10 - d8) * (i10 - d8);
/* 59:61 */             if ((d10 < d11) && (d10 < d12) && (d10 < d13)) {
/* 60:62 */               arrayOfInt2[(i9++)] = i4;
/* 61:63 */             } else if ((d11 < d10) && (d11 < d12) && (d11 < d13)) {
/* 62:64 */               arrayOfInt2[(i9++)] = i6;
/* 63:65 */             } else if ((d12 < d10) && (d12 < d11) && (d12 < d13)) {
/* 64:66 */               arrayOfInt2[(i9++)] = i5;
/* 65:   */             } else {
/* 66:68 */               arrayOfInt2[(i9++)] = i7;
/* 67:   */             }
/* 68:   */           }
/* 69:   */         }
/* 70:73 */         i4 = i6;
/* 71:74 */         i5 = i7;
/* 72:   */       }
/* 73:   */     }
/* 74:78 */     int[] arrayOfInt3 = boy.a(paramInt3 * paramInt4);
/* 75:79 */     for (int i3 = 0; i3 < paramInt4; i3++) {
/* 76:80 */       System.arraycopy(arrayOfInt2, (i3 + (paramInt2 & 0x3)) * n + (paramInt1 & 0x3), arrayOfInt3, i3 * paramInt3, paramInt3);
/* 77:   */     }
/* 78:82 */     return arrayOfInt3;
/* 79:   */   }
/* 80:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpo
 * JD-Core Version:    0.7.0.1
 */
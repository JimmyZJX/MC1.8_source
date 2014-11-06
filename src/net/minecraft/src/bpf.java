package net.minecraft.src;
/*  1:   */ public class bpf
/*  2:   */   extends bpa
/*  3:   */ {
/*  4:   */   public bpf(long paramLong, bpa parambpa)
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
/* 22:20 */         int i2 = arrayOfInt1[(i1 + 1 + (n + 1 - 1) * (paramInt3 + 2))];
/* 23:21 */         int i3 = arrayOfInt1[(i1 + 1 + 1 + (n + 1) * (paramInt3 + 2))];
/* 24:22 */         int i4 = arrayOfInt1[(i1 + 1 - 1 + (n + 1) * (paramInt3 + 2))];
/* 25:23 */         int i5 = arrayOfInt1[(i1 + 1 + (n + 1 + 1) * (paramInt3 + 2))];
/* 26:   */         
/* 27:25 */         int i6 = arrayOfInt1[(i1 + 1 + (n + 1) * k)];
/* 28:26 */         arrayOfInt2[(i1 + n * paramInt3)] = i6;
/* 29:27 */         a(i1 + paramInt1, n + paramInt2);
/* 30:28 */         if ((i6 == 0) && (i2 == 0) && (i3 == 0) && (i4 == 0) && (i5 == 0) && (a(2) == 0)) {
/* 31:29 */           arrayOfInt2[(i1 + n * paramInt3)] = 1;
/* 32:   */         }
/* 33:   */       }
/* 34:   */     }
/* 35:33 */     return arrayOfInt2;
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpf
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*  1:   */ public class bpd
/*  2:   */   extends bpa
/*  3:   */ {
/*  4:   */   public bpd(long paramLong, bpa parambpa)
/*  5:   */   {
/*  6: 7 */     super(paramLong);
/*  7: 8 */     this.a = parambpa;
/*  8:   */   }
/*  9:   */   
/* 10:   */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 11:   */   {
/* 12:13 */     int[] arrayOfInt1 = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2);
/* 13:   */     
/* 14:15 */     int[] arrayOfInt2 = boy.a(paramInt3 * paramInt4);
/* 15:16 */     for (int i = 0; i < paramInt4; i++) {
/* 16:17 */       for (int j = 0; j < paramInt3; j++)
/* 17:   */       {
/* 18:18 */         a(j + paramInt1, i + paramInt2);
/* 19:19 */         int k = arrayOfInt1[(j + 1 + (i + 1) * (paramInt3 + 2))];
/* 20:20 */         if (a(57) == 0)
/* 21:   */         {
/* 22:21 */           if (k == arm.q.az) {
/* 23:22 */             arrayOfInt2[(j + i * paramInt3)] = (arm.q.az + 128);
/* 24:   */           } else {
/* 25:24 */             arrayOfInt2[(j + i * paramInt3)] = k;
/* 26:   */           }
/* 27:   */         }
/* 28:   */         else {
/* 29:27 */           arrayOfInt2[(j + i * paramInt3)] = k;
/* 30:   */         }
/* 31:   */       }
/* 32:   */     }
/* 33:32 */     return arrayOfInt2;
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpd
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*  1:   */ public class bpi
/*  2:   */   extends bpa
/*  3:   */ {
/*  4:   */   private bpa c;
/*  5:   */   private bpa d;
/*  6:   */   
/*  7:   */   public bpi(long paramLong, bpa parambpa1, bpa parambpa2)
/*  8:   */   {
/*  9:10 */     super(paramLong);
/* 10:11 */     this.c = parambpa1;
/* 11:12 */     this.d = parambpa2;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void a(long paramLong)
/* 15:   */   {
/* 16:17 */     this.c.a(paramLong);
/* 17:18 */     this.d.a(paramLong);
/* 18:19 */     super.a(paramLong);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 22:   */   {
/* 23:24 */     int[] arrayOfInt1 = this.c.a(paramInt1, paramInt2, paramInt3, paramInt4);
/* 24:25 */     int[] arrayOfInt2 = this.d.a(paramInt1, paramInt2, paramInt3, paramInt4);
/* 25:   */     
/* 26:27 */     int[] arrayOfInt3 = boy.a(paramInt3 * paramInt4);
/* 27:28 */     for (int i = 0; i < paramInt3 * paramInt4; i++) {
/* 28:29 */       if ((arrayOfInt1[i] == arm.p.az) || (arrayOfInt1[i] == arm.N.az)) {
/* 29:30 */         arrayOfInt3[i] = arrayOfInt1[i];
/* 30:32 */       } else if (arrayOfInt2[i] == arm.w.az)
/* 31:   */       {
/* 32:33 */         if (arrayOfInt1[i] == arm.B.az) {
/* 33:34 */           arrayOfInt3[i] = arm.A.az;
/* 34:35 */         } else if ((arrayOfInt1[i] == arm.D.az) || (arrayOfInt1[i] == arm.E.az)) {
/* 35:36 */           arrayOfInt3[i] = arm.E.az;
/* 36:   */         } else {
/* 37:38 */           arrayOfInt2[i] &= 0xFF;
/* 38:   */         }
/* 39:   */       }
/* 40:   */       else {
/* 41:41 */         arrayOfInt3[i] = arrayOfInt1[i];
/* 42:   */       }
/* 43:   */     }
/* 44:46 */     return arrayOfInt3;
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpi
 * JD-Core Version:    0.7.0.1
 */
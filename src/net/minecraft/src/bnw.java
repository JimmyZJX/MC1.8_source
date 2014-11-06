package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bnw
/*  4:   */   extends boa
/*  5:   */ {
/*  6:   */   private bnz[] a;
/*  7:   */   private int b;
/*  8:   */   
/*  9:   */   public bnw(Random paramRandom, int paramInt)
/* 10:   */   {
/* 11:14 */     this.b = paramInt;
/* 12:15 */     this.a = new bnz[paramInt];
/* 13:16 */     for (int i = 0; i < paramInt; i++) {
/* 14:17 */       this.a[i] = new bnz(paramRandom);
/* 15:   */     }
/* 16:   */   }
/* 17:   */   
/* 18:   */   public double a(double paramDouble1, double paramDouble2)
/* 19:   */   {
/* 20:23 */     double d1 = 0.0D;
/* 21:24 */     double d2 = 1.0D;
/* 22:26 */     for (int i = 0; i < this.b; i++)
/* 23:   */     {
/* 24:27 */       d1 += this.a[i].a(paramDouble1 * d2, paramDouble2 * d2) / d2;
/* 25:28 */       d2 /= 2.0D;
/* 26:   */     }
/* 27:31 */     return d1;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public double[] a(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3, double paramDouble4, double paramDouble5)
/* 31:   */   {
/* 32:47 */     return a(paramArrayOfDouble, paramDouble1, paramDouble2, paramInt1, paramInt2, paramDouble3, paramDouble4, paramDouble5, 0.5D);
/* 33:   */   }
/* 34:   */   
/* 35:   */   public double[] a(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/* 36:   */   {
/* 37:51 */     if ((paramArrayOfDouble == null) || (paramArrayOfDouble.length < paramInt1 * paramInt2)) {
/* 38:52 */       paramArrayOfDouble = new double[paramInt1 * paramInt2];
/* 39:   */     } else {
/* 40:54 */       for (int i = 0; i < paramArrayOfDouble.length; i++) {
/* 41:55 */         paramArrayOfDouble[i] = 0.0D;
/* 42:   */       }
/* 43:   */     }
/* 44:59 */     double d1 = 1.0D;
/* 45:60 */     double d2 = 1.0D;
/* 46:61 */     for (int j = 0; j < this.b; j++)
/* 47:   */     {
/* 48:62 */       this.a[j].a(paramArrayOfDouble, paramDouble1, paramDouble2, paramInt1, paramInt2, paramDouble3 * d2 * d1, paramDouble4 * d2 * d1, 0.55D / d1);
/* 49:63 */       d2 *= paramDouble5;
/* 50:64 */       d1 *= paramDouble6;
/* 51:   */     }
/* 52:67 */     return paramArrayOfDouble;
/* 53:   */   }
/* 54:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bnw
 * JD-Core Version:    0.7.0.1
 */
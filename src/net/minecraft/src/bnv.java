package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bnv
/*  4:   */   extends boa
/*  5:   */ {
/*  6:   */   private bnu[] a;
/*  7:   */   private int b;
/*  8:   */   
/*  9:   */   public bnv(Random paramRandom, int paramInt)
/* 10:   */   {
/* 11:16 */     this.b = paramInt;
/* 12:17 */     this.a = new bnu[paramInt];
/* 13:18 */     for (int i = 0; i < paramInt; i++) {
/* 14:19 */       this.a[i] = new bnu(paramRandom);
/* 15:   */     }
/* 16:   */   }
/* 17:   */   
/* 18:   */   public double[] a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble1, double paramDouble2, double paramDouble3)
/* 19:   */   {
/* 20:49 */     if (paramArrayOfDouble == null) {
/* 21:50 */       paramArrayOfDouble = new double[paramInt4 * paramInt5 * paramInt6];
/* 22:   */     } else {
/* 23:52 */       for (int i = 0; i < paramArrayOfDouble.length; i++) {
/* 24:53 */         paramArrayOfDouble[i] = 0.0D;
/* 25:   */       }
/* 26:   */     }
/* 27:57 */     double d1 = 1.0D;
/* 28:59 */     for (int j = 0; j < this.b; j++)
/* 29:   */     {
/* 30:60 */       double d2 = paramInt1 * d1 * paramDouble1;
/* 31:61 */       double d3 = paramInt2 * d1 * paramDouble2;
/* 32:62 */       double d4 = paramInt3 * d1 * paramDouble3;
/* 33:63 */       long l1 = MathUtils.lfloor(d2);
/* 34:64 */       long l2 = MathUtils.lfloor(d4);
/* 35:65 */       d2 -= l1;
/* 36:66 */       d4 -= l2;
/* 37:67 */       l1 %= 16777216L;
/* 38:68 */       l2 %= 16777216L;
/* 39:69 */       d2 += l1;
/* 40:70 */       d4 += l2;
/* 41:71 */       this.a[j].a(paramArrayOfDouble, d2, d3, d4, paramInt4, paramInt5, paramInt6, paramDouble1 * d1, paramDouble2 * d1, paramDouble3 * d1, d1);
/* 42:72 */       d1 /= 2.0D;
/* 43:   */     }
/* 44:75 */     return paramArrayOfDouble;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public double[] a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2, double paramDouble3)
/* 48:   */   {
/* 49:79 */     return a(paramArrayOfDouble, paramInt1, 10, paramInt2, paramInt3, 1, paramInt4, paramDouble1, 1.0D, paramDouble2);
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bnv
 * JD-Core Version:    0.7.0.1
 */
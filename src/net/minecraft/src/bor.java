package net.minecraft.src;
/*   1:    */ public class bor
/*   2:    */   extends bpa
/*   3:    */ {
/*   4:    */   public bor(long paramLong, bpa parambpa)
/*   5:    */   {
/*   6:  8 */     super(paramLong);
/*   7:  9 */     this.a = parambpa;
/*   8:    */   }
/*   9:    */   
/*  10:    */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  11:    */   {
/*  12: 14 */     int[] arrayOfInt1 = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2);
/*  13:    */     
/*  14: 16 */     int[] arrayOfInt2 = boy.a(paramInt3 * paramInt4);
/*  15: 17 */     for (int i = 0; i < paramInt4; i++) {
/*  16: 18 */       for (int j = 0; j < paramInt3; j++)
/*  17:    */       {
/*  18: 19 */         a(j + paramInt1, i + paramInt2);
/*  19: 20 */         int k = arrayOfInt1[(j + 1 + (i + 1) * (paramInt3 + 2))];
/*  20: 21 */         if ((!a(arrayOfInt1, arrayOfInt2, j, i, paramInt3, k, arm.s.az, arm.J.az)) && 
/*  21: 22 */           (!b(arrayOfInt1, arrayOfInt2, j, i, paramInt3, k, arm.ab.az, arm.aa.az)) && 
/*  22: 23 */           (!b(arrayOfInt1, arrayOfInt2, j, i, paramInt3, k, arm.ac.az, arm.aa.az)) && 
/*  23: 24 */           (!b(arrayOfInt1, arrayOfInt2, j, i, paramInt3, k, arm.V.az, arm.u.az)))
/*  24:    */         {
/*  25:    */           int m;
/*  26:    */           int n;
/*  27:    */           int i1;
/*  28:    */           int i2;
/*  29: 25 */           if (k == arm.r.az)
/*  30:    */           {
/*  31: 26 */             m = arrayOfInt1[(j + 1 + (i + 1 - 1) * (paramInt3 + 2))];
/*  32: 27 */             n = arrayOfInt1[(j + 1 + 1 + (i + 1) * (paramInt3 + 2))];
/*  33: 28 */             i1 = arrayOfInt1[(j + 1 - 1 + (i + 1) * (paramInt3 + 2))];
/*  34: 29 */             i2 = arrayOfInt1[(j + 1 + (i + 1 + 1) * (paramInt3 + 2))];
/*  35: 30 */             if ((m == arm.B.az) || (n == arm.B.az) || (i1 == arm.B.az) || (i2 == arm.B.az)) {
/*  36: 31 */               arrayOfInt2[(j + i * paramInt3)] = arm.X.az;
/*  37:    */             } else {
/*  38: 33 */               arrayOfInt2[(j + i * paramInt3)] = k;
/*  39:    */             }
/*  40:    */           }
/*  41: 35 */           else if (k == arm.v.az)
/*  42:    */           {
/*  43: 37 */             m = arrayOfInt1[(j + 1 + (i + 1 - 1) * (paramInt3 + 2))];
/*  44: 38 */             n = arrayOfInt1[(j + 1 + 1 + (i + 1) * (paramInt3 + 2))];
/*  45: 39 */             i1 = arrayOfInt1[(j + 1 - 1 + (i + 1) * (paramInt3 + 2))];
/*  46: 40 */             i2 = arrayOfInt1[(j + 1 + (i + 1 + 1) * (paramInt3 + 2))];
/*  47: 41 */             if ((m == arm.r.az) || (n == arm.r.az) || (i1 == arm.r.az) || (i2 == arm.r.az) || (m == arm.T.az) || (n == arm.T.az) || (i1 == arm.T.az) || (i2 == arm.T.az) || (m == arm.B.az) || (n == arm.B.az) || (i1 == arm.B.az) || (i2 == arm.B.az)) {
/*  48: 42 */               arrayOfInt2[(j + i * paramInt3)] = arm.q.az;
/*  49: 43 */             } else if ((m == arm.K.az) || (i2 == arm.K.az) || (n == arm.K.az) || (i1 == arm.K.az)) {
/*  50: 44 */               arrayOfInt2[(j + i * paramInt3)] = arm.M.az;
/*  51:    */             } else {
/*  52: 46 */               arrayOfInt2[(j + i * paramInt3)] = k;
/*  53:    */             }
/*  54:    */           }
/*  55:    */           else
/*  56:    */           {
/*  57: 49 */             arrayOfInt2[(j + i * paramInt3)] = k;
/*  58:    */           }
/*  59:    */         }
/*  60:    */       }
/*  61:    */     }
/*  62: 54 */     return arrayOfInt2;
/*  63:    */   }
/*  64:    */   
/*  65:    */   private boolean a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  66:    */   {
/*  67: 58 */     if (a(paramInt4, paramInt5))
/*  68:    */     {
/*  69: 59 */       int i = paramArrayOfInt1[(paramInt1 + 1 + (paramInt2 + 1 - 1) * (paramInt3 + 2))];
/*  70: 60 */       int j = paramArrayOfInt1[(paramInt1 + 1 + 1 + (paramInt2 + 1) * (paramInt3 + 2))];
/*  71: 61 */       int k = paramArrayOfInt1[(paramInt1 + 1 - 1 + (paramInt2 + 1) * (paramInt3 + 2))];
/*  72: 62 */       int m = paramArrayOfInt1[(paramInt1 + 1 + (paramInt2 + 1 + 1) * (paramInt3 + 2))];
/*  73: 63 */       if ((!b(i, paramInt5)) || (!b(j, paramInt5)) || (!b(k, paramInt5)) || (!b(m, paramInt5))) {
/*  74: 64 */         paramArrayOfInt2[(paramInt1 + paramInt2 * paramInt3)] = paramInt6;
/*  75:    */       } else {
/*  76: 66 */         paramArrayOfInt2[(paramInt1 + paramInt2 * paramInt3)] = paramInt4;
/*  77:    */       }
/*  78: 68 */       return true;
/*  79:    */     }
/*  80: 70 */     return false;
/*  81:    */   }
/*  82:    */   
/*  83:    */   private boolean b(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  84:    */   {
/*  85: 74 */     if (paramInt4 == paramInt5)
/*  86:    */     {
/*  87: 75 */       int i = paramArrayOfInt1[(paramInt1 + 1 + (paramInt2 + 1 - 1) * (paramInt3 + 2))];
/*  88: 76 */       int j = paramArrayOfInt1[(paramInt1 + 1 + 1 + (paramInt2 + 1) * (paramInt3 + 2))];
/*  89: 77 */       int k = paramArrayOfInt1[(paramInt1 + 1 - 1 + (paramInt2 + 1) * (paramInt3 + 2))];
/*  90: 78 */       int m = paramArrayOfInt1[(paramInt1 + 1 + (paramInt2 + 1 + 1) * (paramInt3 + 2))];
/*  91: 79 */       if ((!a(i, paramInt5)) || (!a(j, paramInt5)) || (!a(k, paramInt5)) || (!a(m, paramInt5))) {
/*  92: 80 */         paramArrayOfInt2[(paramInt1 + paramInt2 * paramInt3)] = paramInt6;
/*  93:    */       } else {
/*  94: 82 */         paramArrayOfInt2[(paramInt1 + paramInt2 * paramInt3)] = paramInt4;
/*  95:    */       }
/*  96: 84 */       return true;
/*  97:    */     }
/*  98: 86 */     return false;
/*  99:    */   }
/* 100:    */   
/* 101:    */   private boolean b(int paramInt1, int paramInt2)
/* 102:    */   {
/* 103: 90 */     if (a(paramInt1, paramInt2)) {
/* 104: 91 */       return true;
/* 105:    */     }
/* 106: 93 */     arm localarm1 = arm.e(paramInt1);
/* 107: 94 */     arm localarm2 = arm.e(paramInt2);
/* 108: 95 */     if ((localarm1 != null) && (localarm2 != null))
/* 109:    */     {
/* 110: 96 */       arp localarp1 = localarm1.m();
/* 111: 97 */       arp localarp2 = localarm2.m();
/* 112: 98 */       return (localarp1 == localarp2) || (localarp1 == arp.c) || (localarp2 == arp.c);
/* 113:    */     }
/* 114:100 */     return false;
/* 115:    */   }
/* 116:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bor
 * JD-Core Version:    0.7.0.1
 */
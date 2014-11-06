package net.minecraft.src;
/*   1:    */ public class bpj
/*   2:    */   extends bpa
/*   3:    */ {
/*   4:    */   public bpj(long paramLong, bpa parambpa)
/*   5:    */   {
/*   6:  9 */     super(paramLong);
/*   7: 10 */     this.a = parambpa;
/*   8:    */   }
/*   9:    */   
/*  10:    */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  11:    */   {
/*  12: 15 */     int[] arrayOfInt1 = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2);
/*  13:    */     
/*  14: 17 */     int[] arrayOfInt2 = boy.a(paramInt3 * paramInt4);
/*  15: 18 */     for (int i = 0; i < paramInt4; i++) {
/*  16: 19 */       for (int j = 0; j < paramInt3; j++)
/*  17:    */       {
/*  18: 20 */         a(j + paramInt1, i + paramInt2);
/*  19: 21 */         int k = arrayOfInt1[(j + 1 + (i + 1) * (paramInt3 + 2))];
/*  20: 22 */         arm localarm = arm.e(k);
/*  21:    */         int m;
/*  22:    */         int n;
/*  23:    */         int i1;
/*  24:    */         int i2;
/*  25: 23 */         if (k == arm.D.az)
/*  26:    */         {
/*  27: 24 */           m = arrayOfInt1[(j + 1 + (i + 1 - 1) * (paramInt3 + 2))];
/*  28: 25 */           n = arrayOfInt1[(j + 1 + 1 + (i + 1) * (paramInt3 + 2))];
/*  29: 26 */           i1 = arrayOfInt1[(j + 1 - 1 + (i + 1) * (paramInt3 + 2))];
/*  30: 27 */           i2 = arrayOfInt1[(j + 1 + (i + 1 + 1) * (paramInt3 + 2))];
/*  31: 28 */           if ((m == arm.p.az) || (n == arm.p.az) || (i1 == arm.p.az) || (i2 == arm.p.az)) {
/*  32: 29 */             arrayOfInt2[(j + i * paramInt3)] = arm.E.az;
/*  33:    */           } else {
/*  34: 31 */             arrayOfInt2[(j + i * paramInt3)] = k;
/*  35:    */           }
/*  36:    */         }
/*  37: 33 */         else if ((localarm != null) && (localarm.l() == asi.class))
/*  38:    */         {
/*  39: 34 */           m = arrayOfInt1[(j + 1 + (i + 1 - 1) * (paramInt3 + 2))];
/*  40: 35 */           n = arrayOfInt1[(j + 1 + 1 + (i + 1) * (paramInt3 + 2))];
/*  41: 36 */           i1 = arrayOfInt1[(j + 1 - 1 + (i + 1) * (paramInt3 + 2))];
/*  42: 37 */           i2 = arrayOfInt1[(j + 1 + (i + 1 + 1) * (paramInt3 + 2))];
/*  43: 38 */           if ((!c(m)) || (!c(n)) || (!c(i1)) || (!c(i2))) {
/*  44: 39 */             arrayOfInt2[(j + i * paramInt3)] = arm.M.az;
/*  45: 40 */           } else if ((b(m)) || (b(n)) || (b(i1)) || (b(i2))) {
/*  46: 41 */             arrayOfInt2[(j + i * paramInt3)] = arm.F.az;
/*  47:    */           } else {
/*  48: 43 */             arrayOfInt2[(j + i * paramInt3)] = k;
/*  49:    */           }
/*  50:    */         }
/*  51: 45 */         else if ((k == arm.s.az) || (k == arm.X.az) || (k == arm.J.az))
/*  52:    */         {
/*  53: 46 */           a(arrayOfInt1, arrayOfInt2, j, i, paramInt3, k, arm.O.az);
/*  54:    */         }
/*  55: 47 */         else if ((localarm != null) && (localarm.j()))
/*  56:    */         {
/*  57: 48 */           a(arrayOfInt1, arrayOfInt2, j, i, paramInt3, k, arm.P.az);
/*  58:    */         }
/*  59: 49 */         else if ((k == arm.aa.az) || (k == arm.ab.az))
/*  60:    */         {
/*  61: 50 */           m = arrayOfInt1[(j + 1 + (i + 1 - 1) * (paramInt3 + 2))];
/*  62: 51 */           n = arrayOfInt1[(j + 1 + 1 + (i + 1) * (paramInt3 + 2))];
/*  63: 52 */           i1 = arrayOfInt1[(j + 1 - 1 + (i + 1) * (paramInt3 + 2))];
/*  64: 53 */           i2 = arrayOfInt1[(j + 1 + (i + 1 + 1) * (paramInt3 + 2))];
/*  65: 54 */           if ((b(m)) || (b(n)) || (b(i1)) || (b(i2))) {
/*  66: 55 */             arrayOfInt2[(j + i * paramInt3)] = k;
/*  67: 56 */           } else if ((!d(m)) || (!d(n)) || (!d(i1)) || (!d(i2))) {
/*  68: 57 */             arrayOfInt2[(j + i * paramInt3)] = arm.r.az;
/*  69:    */           } else {
/*  70: 59 */             arrayOfInt2[(j + i * paramInt3)] = k;
/*  71:    */           }
/*  72:    */         }
/*  73: 61 */         else if ((k != arm.p.az) && (k != arm.N.az) && (k != arm.w.az) && (k != arm.v.az))
/*  74:    */         {
/*  75: 62 */           m = arrayOfInt1[(j + 1 + (i + 1 - 1) * (paramInt3 + 2))];
/*  76: 63 */           n = arrayOfInt1[(j + 1 + 1 + (i + 1) * (paramInt3 + 2))];
/*  77: 64 */           i1 = arrayOfInt1[(j + 1 - 1 + (i + 1) * (paramInt3 + 2))];
/*  78: 65 */           i2 = arrayOfInt1[(j + 1 + (i + 1 + 1) * (paramInt3 + 2))];
/*  79: 66 */           if ((b(m)) || (b(n)) || (b(i1)) || (b(i2))) {
/*  80: 67 */             arrayOfInt2[(j + i * paramInt3)] = arm.F.az;
/*  81:    */           } else {
/*  82: 69 */             arrayOfInt2[(j + i * paramInt3)] = k;
/*  83:    */           }
/*  84:    */         }
/*  85:    */         else
/*  86:    */         {
/*  87: 72 */           arrayOfInt2[(j + i * paramInt3)] = k;
/*  88:    */         }
/*  89:    */       }
/*  90:    */     }
/*  91: 77 */     return arrayOfInt2;
/*  92:    */   }
/*  93:    */   
/*  94:    */   private void a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*  95:    */   {
/*  96: 81 */     if (b(paramInt4))
/*  97:    */     {
/*  98: 82 */       paramArrayOfInt2[(paramInt1 + paramInt2 * paramInt3)] = paramInt4;
/*  99: 83 */       return;
/* 100:    */     }
/* 101: 85 */     int i = paramArrayOfInt1[(paramInt1 + 1 + (paramInt2 + 1 - 1) * (paramInt3 + 2))];
/* 102: 86 */     int j = paramArrayOfInt1[(paramInt1 + 1 + 1 + (paramInt2 + 1) * (paramInt3 + 2))];
/* 103: 87 */     int k = paramArrayOfInt1[(paramInt1 + 1 - 1 + (paramInt2 + 1) * (paramInt3 + 2))];
/* 104: 88 */     int m = paramArrayOfInt1[(paramInt1 + 1 + (paramInt2 + 1 + 1) * (paramInt3 + 2))];
/* 105: 89 */     if ((b(i)) || (b(j)) || (b(k)) || (b(m))) {
/* 106: 90 */       paramArrayOfInt2[(paramInt1 + paramInt2 * paramInt3)] = paramInt5;
/* 107:    */     } else {
/* 108: 92 */       paramArrayOfInt2[(paramInt1 + paramInt2 * paramInt3)] = paramInt4;
/* 109:    */     }
/* 110:    */   }
/* 111:    */   
/* 112:    */   private boolean c(int paramInt)
/* 113:    */   {
/* 114: 97 */     if ((arm.e(paramInt) != null) && (arm.e(paramInt).l() == asi.class)) {
/* 115: 98 */       return true;
/* 116:    */     }
/* 117:101 */     return (paramInt == arm.M.az) || (paramInt == arm.K.az) || (paramInt == arm.L.az) || (paramInt == arm.t.az) || (paramInt == arm.u.az) || (b(paramInt));
/* 118:    */   }
/* 119:    */   
/* 120:    */   private boolean d(int paramInt)
/* 121:    */   {
/* 122:105 */     return arm.e(paramInt) instanceof asj;
/* 123:    */   }
/* 124:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpj
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*   1:    */ import org.apache.logging.log4j.LogManager;
/*   2:    */ import org.apache.logging.log4j.Logger;
/*   3:    */ 
/*   4:    */ public class bpe
/*   5:    */   extends bpa
/*   6:    */ {
/*   7:  8 */   private static final Logger c = LogManager.getLogger();
/*   8:    */   private bpa d;
/*   9:    */   
/*  10:    */   public bpe(long paramLong, bpa parambpa1, bpa parambpa2)
/*  11:    */   {
/*  12: 12 */     super(paramLong);
/*  13: 13 */     this.a = parambpa1;
/*  14: 14 */     this.d = parambpa2;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  18:    */   {
/*  19: 19 */     int[] arrayOfInt1 = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2);
/*  20: 20 */     int[] arrayOfInt2 = this.d.a(paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2);
/*  21:    */     
/*  22: 22 */     int[] arrayOfInt3 = boy.a(paramInt3 * paramInt4);
/*  23: 23 */     for (int i = 0; i < paramInt4; i++) {
/*  24: 24 */       for (int j = 0; j < paramInt3; j++)
/*  25:    */       {
/*  26: 25 */         a(j + paramInt1, i + paramInt2);
/*  27: 26 */         int k = arrayOfInt1[(j + 1 + (i + 1) * (paramInt3 + 2))];
/*  28: 27 */         int m = arrayOfInt2[(j + 1 + (i + 1) * (paramInt3 + 2))];
/*  29: 28 */         int n = (m - 2) % 29 == 0 ? 1 : 0;
/*  30: 29 */         if (k > 255) {
/*  31: 30 */           c.debug("old! " + k);
/*  32:    */         }
/*  33: 32 */         if ((k != 0) && (m >= 2) && ((m - 2) % 29 == 1) && (k < 128))
/*  34:    */         {
/*  35: 33 */           if (arm.e(k + 128) != null) {
/*  36: 34 */             arrayOfInt3[(j + i * paramInt3)] = (k + 128);
/*  37:    */           } else {
/*  38: 36 */             arrayOfInt3[(j + i * paramInt3)] = k;
/*  39:    */           }
/*  40:    */         }
/*  41: 38 */         else if ((a(3) == 0) || (n != 0))
/*  42:    */         {
/*  43: 39 */           int i1 = k;
/*  44:    */           int i2;
/*  45: 40 */           if (k == arm.r.az)
/*  46:    */           {
/*  47: 41 */             i1 = arm.G.az;
/*  48:    */           }
/*  49: 42 */           else if (k == arm.t.az)
/*  50:    */           {
/*  51: 43 */             i1 = arm.H.az;
/*  52:    */           }
/*  53: 44 */           else if (k == arm.Q.az)
/*  54:    */           {
/*  55: 45 */             i1 = arm.R.az;
/*  56:    */           }
/*  57: 46 */           else if (k == arm.S.az)
/*  58:    */           {
/*  59: 47 */             i1 = arm.q.az;
/*  60:    */           }
/*  61: 48 */           else if (k == arm.u.az)
/*  62:    */           {
/*  63: 49 */             i1 = arm.I.az;
/*  64:    */           }
/*  65: 50 */           else if (k == arm.V.az)
/*  66:    */           {
/*  67: 51 */             i1 = arm.W.az;
/*  68:    */           }
/*  69: 52 */           else if (k == arm.T.az)
/*  70:    */           {
/*  71: 53 */             i1 = arm.U.az;
/*  72:    */           }
/*  73: 54 */           else if (k == arm.q.az)
/*  74:    */           {
/*  75: 55 */             if (a(3) == 0) {
/*  76: 56 */               i1 = arm.H.az;
/*  77:    */             } else {
/*  78: 58 */               i1 = arm.t.az;
/*  79:    */             }
/*  80:    */           }
/*  81: 60 */           else if (k == arm.B.az)
/*  82:    */           {
/*  83: 61 */             i1 = arm.C.az;
/*  84:    */           }
/*  85: 62 */           else if (k == arm.K.az)
/*  86:    */           {
/*  87: 63 */             i1 = arm.L.az;
/*  88:    */           }
/*  89: 64 */           else if (k == arm.p.az)
/*  90:    */           {
/*  91: 65 */             i1 = arm.N.az;
/*  92:    */           }
/*  93: 66 */           else if (k == arm.s.az)
/*  94:    */           {
/*  95: 67 */             i1 = arm.X.az;
/*  96:    */           }
/*  97: 68 */           else if (k == arm.Y.az)
/*  98:    */           {
/*  99: 69 */             i1 = arm.Z.az;
/* 100:    */           }
/* 101: 70 */           else if (a(k, arm.ab.az))
/* 102:    */           {
/* 103: 71 */             i1 = arm.aa.az;
/* 104:    */           }
/* 105: 72 */           else if ((k == arm.N.az) && 
/* 106: 73 */             (a(3) == 0))
/* 107:    */           {
/* 108: 74 */             i2 = a(2);
/* 109: 75 */             if (i2 == 0) {
/* 110: 76 */               i1 = arm.q.az;
/* 111:    */             } else {
/* 112: 78 */               i1 = arm.t.az;
/* 113:    */             }
/* 114:    */           }
/* 115: 82 */           if ((n != 0) && (i1 != k)) {
/* 116: 83 */             if (arm.e(i1 + 128) != null) {
/* 117: 84 */               i1 += 128;
/* 118:    */             } else {
/* 119: 86 */               i1 = k;
/* 120:    */             }
/* 121:    */           }
/* 122: 89 */           if (i1 == k)
/* 123:    */           {
/* 124: 90 */             arrayOfInt3[(j + i * paramInt3)] = k;
/* 125:    */           }
/* 126:    */           else
/* 127:    */           {
/* 128: 92 */             i2 = arrayOfInt1[(j + 1 + (i + 1 - 1) * (paramInt3 + 2))];
/* 129: 93 */             int i3 = arrayOfInt1[(j + 1 + 1 + (i + 1) * (paramInt3 + 2))];
/* 130: 94 */             int i4 = arrayOfInt1[(j + 1 - 1 + (i + 1) * (paramInt3 + 2))];
/* 131: 95 */             int i5 = arrayOfInt1[(j + 1 + (i + 1 + 1) * (paramInt3 + 2))];
/* 132: 96 */             int i6 = 0;
/* 133: 97 */             if (a(i2, k)) {
/* 134: 98 */               i6++;
/* 135:    */             }
/* 136:100 */             if (a(i3, k)) {
/* 137:101 */               i6++;
/* 138:    */             }
/* 139:103 */             if (a(i4, k)) {
/* 140:104 */               i6++;
/* 141:    */             }
/* 142:106 */             if (a(i5, k)) {
/* 143:107 */               i6++;
/* 144:    */             }
/* 145:109 */             if (i6 >= 3) {
/* 146:110 */               arrayOfInt3[(j + i * paramInt3)] = i1;
/* 147:    */             } else {
/* 148:112 */               arrayOfInt3[(j + i * paramInt3)] = k;
/* 149:    */             }
/* 150:    */           }
/* 151:    */         }
/* 152:    */         else
/* 153:    */         {
/* 154:116 */           arrayOfInt3[(j + i * paramInt3)] = k;
/* 155:    */         }
/* 156:    */       }
/* 157:    */     }
/* 158:121 */     return arrayOfInt3;
/* 159:    */   }
/* 160:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpe
 * JD-Core Version:    0.7.0.1
 */
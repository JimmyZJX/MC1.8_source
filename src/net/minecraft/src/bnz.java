package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bnz
/*   4:    */ {
/*   5:  6 */   private static int[][] e = { { 1, 1, 0 }, { -1, 1, 0 }, { 1, -1, 0 }, { -1, -1, 0 }, { 1, 0, 1 }, { -1, 0, 1 }, { 1, 0, -1 }, { -1, 0, -1 }, { 0, 1, 1 }, { 0, -1, 1 }, { 0, 1, -1 }, { 0, -1, -1 } };
/*   6: 20 */   public static final double a = Math.sqrt(3.0D);
/*   7: 22 */   private int[] f = new int[512];
/*   8:    */   public double b;
/*   9:    */   public double c;
/*  10:    */   public double d;
/*  11:    */   
/*  12:    */   public bnz()
/*  13:    */   {
/*  14: 28 */     this(new Random());
/*  15:    */   }
/*  16:    */   
/*  17:    */   public bnz(Random paramRandom)
/*  18:    */   {
/*  19: 32 */     this.b = (paramRandom.nextDouble() * 256.0D);
/*  20: 33 */     this.c = (paramRandom.nextDouble() * 256.0D);
/*  21: 34 */     this.d = (paramRandom.nextDouble() * 256.0D);
/*  22: 35 */     for (int i = 0; i < 256; i++) {
/*  23: 36 */       this.f[i] = i;
/*  24:    */     }
/*  25: 39 */     for (int i = 0; i < 256; i++)
/*  26:    */     {
/*  27: 40 */       int j = paramRandom.nextInt(256 - i) + i;
/*  28: 41 */       int k = this.f[i];
/*  29: 42 */       this.f[i] = this.f[j];
/*  30: 43 */       this.f[j] = k;
/*  31:    */       
/*  32: 45 */       this.f[(i + 256)] = this.f[i];
/*  33:    */     }
/*  34:    */   }
/*  35:    */   
/*  36:    */   private static int a(double paramDouble)
/*  37:    */   {
/*  38: 51 */     return paramDouble > 0.0D ? (int)paramDouble : (int)paramDouble - 1;
/*  39:    */   }
/*  40:    */   
/*  41:    */   private static double a(int[] paramArrayOfInt, double paramDouble1, double paramDouble2)
/*  42:    */   {
/*  43: 55 */     return paramArrayOfInt[0] * paramDouble1 + paramArrayOfInt[1] * paramDouble2;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public double a(double paramDouble1, double paramDouble2)
/*  47:    */   {
/*  48: 66 */     double d4 = 0.5D * (a - 1.0D);
/*  49: 67 */     double d5 = (paramDouble1 + paramDouble2) * d4;
/*  50: 68 */     int i = a(paramDouble1 + d5);
/*  51: 69 */     int j = a(paramDouble2 + d5);
/*  52: 70 */     double d6 = (3.0D - a) / 6.0D;
/*  53: 71 */     double d7 = (i + j) * d6;
/*  54: 72 */     double d8 = i - d7;
/*  55: 73 */     double d9 = j - d7;
/*  56: 74 */     double d10 = paramDouble1 - d8;
/*  57: 75 */     double d11 = paramDouble2 - d9;
/*  58:    */     int k;
/*  59:    */     int m;
/*  60: 79 */     if (d10 > d11)
/*  61:    */     {
/*  62: 80 */       k = 1;
/*  63: 81 */       m = 0;
/*  64:    */     }
/*  65:    */     else
/*  66:    */     {
/*  67: 84 */       k = 0;
/*  68: 85 */       m = 1;
/*  69:    */     }
/*  70: 90 */     double d12 = d10 - k + d6;
/*  71: 91 */     double d13 = d11 - m + d6;
/*  72: 92 */     double d14 = d10 - 1.0D + 2.0D * d6;
/*  73: 93 */     double d15 = d11 - 1.0D + 2.0D * d6;
/*  74:    */     
/*  75: 95 */     int n = i & 0xFF;
/*  76: 96 */     int i1 = j & 0xFF;
/*  77: 97 */     int i2 = this.f[(n + this.f[i1])] % 12;
/*  78: 98 */     int i3 = this.f[(n + k + this.f[(i1 + m)])] % 12;
/*  79: 99 */     int i4 = this.f[(n + 1 + this.f[(i1 + 1)])] % 12;
/*  80:    */     
/*  81:101 */     double d16 = 0.5D - d10 * d10 - d11 * d11;
/*  82:    */     double d1;
/*  83:102 */     if (d16 < 0.0D)
/*  84:    */     {
/*  85:103 */       d1 = 0.0D;
/*  86:    */     }
/*  87:    */     else
/*  88:    */     {
/*  89:105 */       d16 *= d16;
/*  90:106 */       d1 = d16 * d16 * a(e[i2], d10, d11);
/*  91:    */     }
/*  92:108 */     double d17 = 0.5D - d12 * d12 - d13 * d13;
/*  93:    */     double d2;
/*  94:109 */     if (d17 < 0.0D)
/*  95:    */     {
/*  96:110 */       d2 = 0.0D;
/*  97:    */     }
/*  98:    */     else
/*  99:    */     {
/* 100:112 */       d17 *= d17;
/* 101:113 */       d2 = d17 * d17 * a(e[i3], d12, d13);
/* 102:    */     }
/* 103:115 */     double d18 = 0.5D - d14 * d14 - d15 * d15;
/* 104:    */     double d3;
/* 105:116 */     if (d18 < 0.0D)
/* 106:    */     {
/* 107:117 */       d3 = 0.0D;
/* 108:    */     }
/* 109:    */     else
/* 110:    */     {
/* 111:119 */       d18 *= d18;
/* 112:120 */       d3 = d18 * d18 * a(e[i4], d14, d15);
/* 113:    */     }
/* 114:124 */     return 70.0D * (d1 + d2 + d3);
/* 115:    */   }
/* 116:    */   
/* 117:252 */   private static final double g = 0.5D * (a - 1.0D);
/* 118:253 */   private static final double h = (3.0D - a) / 6.0D;
/* 119:    */   
/* 120:    */   public void a(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3, double paramDouble4, double paramDouble5)
/* 121:    */   {
/* 122:256 */     int i = 0;
/* 123:257 */     for (int j = 0; j < paramInt2; j++)
/* 124:    */     {
/* 125:258 */       double d1 = (paramDouble2 + j) * paramDouble4 + this.c;
/* 126:259 */       for (int k = 0; k < paramInt1; k++)
/* 127:    */       {
/* 128:260 */         double d2 = (paramDouble1 + k) * paramDouble3 + this.b;
/* 129:    */         
/* 130:    */ 
/* 131:263 */         double d6 = (d2 + d1) * g;
/* 132:264 */         int m = a(d2 + d6);
/* 133:265 */         int n = a(d1 + d6);
/* 134:266 */         double d7 = (m + n) * h;
/* 135:267 */         double d8 = m - d7;
/* 136:268 */         double d9 = n - d7;
/* 137:269 */         double d10 = d2 - d8;
/* 138:270 */         double d11 = d1 - d9;
/* 139:    */         int i1;
/* 140:    */         int i2;
/* 141:274 */         if (d10 > d11)
/* 142:    */         {
/* 143:275 */           i1 = 1;
/* 144:276 */           i2 = 0;
/* 145:    */         }
/* 146:    */         else
/* 147:    */         {
/* 148:279 */           i1 = 0;
/* 149:280 */           i2 = 1;
/* 150:    */         }
/* 151:285 */         double d12 = d10 - i1 + h;
/* 152:286 */         double d13 = d11 - i2 + h;
/* 153:287 */         double d14 = d10 - 1.0D + 2.0D * h;
/* 154:288 */         double d15 = d11 - 1.0D + 2.0D * h;
/* 155:    */         
/* 156:290 */         int i3 = m & 0xFF;
/* 157:291 */         int i4 = n & 0xFF;
/* 158:292 */         int i5 = this.f[(i3 + this.f[i4])] % 12;
/* 159:293 */         int i6 = this.f[(i3 + i1 + this.f[(i4 + i2)])] % 12;
/* 160:294 */         int i7 = this.f[(i3 + 1 + this.f[(i4 + 1)])] % 12;
/* 161:    */         
/* 162:296 */         double d16 = 0.5D - d10 * d10 - d11 * d11;
/* 163:    */         double d3;
/* 164:297 */         if (d16 < 0.0D)
/* 165:    */         {
/* 166:298 */           d3 = 0.0D;
/* 167:    */         }
/* 168:    */         else
/* 169:    */         {
/* 170:300 */           d16 *= d16;
/* 171:301 */           d3 = d16 * d16 * a(e[i5], d10, d11);
/* 172:    */         }
/* 173:303 */         double d17 = 0.5D - d12 * d12 - d13 * d13;
/* 174:    */         double d4;
/* 175:304 */         if (d17 < 0.0D)
/* 176:    */         {
/* 177:305 */           d4 = 0.0D;
/* 178:    */         }
/* 179:    */         else
/* 180:    */         {
/* 181:307 */           d17 *= d17;
/* 182:308 */           d4 = d17 * d17 * a(e[i6], d12, d13);
/* 183:    */         }
/* 184:310 */         double d18 = 0.5D - d14 * d14 - d15 * d15;
/* 185:    */         double d5;
/* 186:311 */         if (d18 < 0.0D)
/* 187:    */         {
/* 188:312 */           d5 = 0.0D;
/* 189:    */         }
/* 190:    */         else
/* 191:    */         {
/* 192:314 */           d18 *= d18;
/* 193:315 */           d5 = d18 * d18 * a(e[i7], d14, d15);
/* 194:    */         }
/* 195:319 */         paramArrayOfDouble[(i++)] += 70.0D * (d3 + d4 + d5) * paramDouble5;
/* 196:    */       }
/* 197:    */     }
/* 198:    */   }
/* 199:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bnz
 * JD-Core Version:    0.7.0.1
 */
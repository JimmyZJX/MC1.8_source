package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bnu
/*   4:    */   extends boa
/*   5:    */ {
/*   6:  6 */   private int[] d = new int[512];
/*   7:    */   public double a;
/*   8:    */   public double b;
/*   9:    */   public double c;
/*  10:    */   
/*  11:    */   public bnu()
/*  12:    */   {
/*  13: 12 */     this(new Random());
/*  14:    */   }
/*  15:    */   
/*  16:    */   public bnu(Random paramRandom)
/*  17:    */   {
/*  18: 16 */     this.a = (paramRandom.nextDouble() * 256.0D);
/*  19: 17 */     this.b = (paramRandom.nextDouble() * 256.0D);
/*  20: 18 */     this.c = (paramRandom.nextDouble() * 256.0D);
/*  21: 19 */     for (int j = 0; j < 256; j++) {
/*  22: 20 */       this.d[j] = j;
/*  23:    */     }
/*  24: 23 */     for (int j = 0; j < 256; j++)
/*  25:    */     {
/*  26: 24 */       int k = paramRandom.nextInt(256 - j) + j;
/*  27: 25 */       int m = this.d[j];
/*  28: 26 */       this.d[j] = this.d[k];
/*  29: 27 */       this.d[k] = m;
/*  30:    */       
/*  31: 29 */       this.d[(j + 256)] = this.d[j];
/*  32:    */     }
/*  33:    */   }
/*  34:    */   
/*  35:    */   public final double b(double paramDouble1, double paramDouble2, double paramDouble3)
/*  36:    */   {
/*  37: 84 */     return paramDouble2 + paramDouble1 * (paramDouble3 - paramDouble2);
/*  38:    */   }
/*  39:    */   
/*  40: 87 */   private static final double[] e = { 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, -1.0D, 0.0D };
/*  41: 88 */   private static final double[] f = { 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D };
/*  42: 89 */   private static final double[] g = { 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D, -1.0D, -1.0D, 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 1.0D, 0.0D, -1.0D };
/*  43: 90 */   private static final double[] h = { 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, -1.0D, 0.0D };
/*  44: 91 */   private static final double[] i = { 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D, -1.0D, -1.0D, 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 1.0D, 0.0D, -1.0D };
/*  45:    */   
/*  46:    */   public final double a(int paramInt, double paramDouble1, double paramDouble2)
/*  47:    */   {
/*  48: 94 */     int j = paramInt & 0xF;
/*  49: 95 */     return h[j] * paramDouble1 + i[j] * paramDouble2;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public final double a(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
/*  53:    */   {
/*  54: 99 */     int j = paramInt & 0xF;
/*  55:100 */     return e[j] * paramDouble1 + f[j] * paramDouble2 + g[j] * paramDouble3;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void a(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, int paramInt3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7)
/*  59:    */   {
/*  60:    */     double d9;
/*  61:    */     int i11;
/*  62:    */     int i12;
/*  63:    */     double d10;
/*  64:113 */     if (paramInt2 == 1)
/*  65:    */     {
/*  66:114 */       int j = 0;int k = 0;int m = 0;int n = 0;
/*  67:115 */       double d2 = 0.0D;double d3 = 0.0D;
/*  68:116 */       int i5 = 0;
/*  69:117 */       double d4 = 1.0D / paramDouble7;
/*  70:118 */       for (int i7 = 0; i7 < paramInt1; i7++)
/*  71:    */       {
/*  72:119 */         double d6 = paramDouble1 + i7 * paramDouble4 + this.a;
/*  73:120 */         int i8 = (int)d6;
/*  74:121 */         if (d6 < i8) {
/*  75:122 */           i8--;
/*  76:    */         }
/*  77:124 */         int i9 = i8 & 0xFF;
/*  78:125 */         d6 -= i8;
/*  79:126 */         double d8 = d6 * d6 * d6 * (d6 * (d6 * 6.0D - 15.0D) + 10.0D);
/*  80:128 */         for (int i10 = 0; i10 < paramInt3; i10++)
/*  81:    */         {
/*  82:129 */           d9 = paramDouble3 + i10 * paramDouble6 + this.c;
/*  83:130 */           i11 = (int)d9;
/*  84:131 */           if (d9 < i11) {
/*  85:132 */             i11--;
/*  86:    */           }
/*  87:134 */           i12 = i11 & 0xFF;
/*  88:135 */           d9 -= i11;
/*  89:136 */           d10 = d9 * d9 * d9 * (d9 * (d9 * 6.0D - 15.0D) + 10.0D);
/*  90:    */           
/*  91:138 */           j = this.d[i9] + 0;
/*  92:139 */           k = this.d[j] + i12;
/*  93:140 */           m = this.d[(i9 + 1)] + 0;
/*  94:141 */           n = this.d[m] + i12;
/*  95:142 */           d2 = b(d8, a(this.d[k], d6, d9), a(this.d[n], d6 - 1.0D, 0.0D, d9));
/*  96:143 */           d3 = b(d8, a(this.d[(k + 1)], d6, 0.0D, d9 - 1.0D), a(this.d[(n + 1)], d6 - 1.0D, 0.0D, d9 - 1.0D));
/*  97:    */           
/*  98:145 */           double d11 = b(d10, d2, d3);
/*  99:    */           
/* 100:147 */           paramArrayOfDouble[(i5++)] += d11 * d4;
/* 101:    */         }
/* 102:    */       }
/* 103:150 */       return;
/* 104:    */     }
/* 105:152 */     int j = 0;
/* 106:153 */     double d1 = 1.0D / paramDouble7;
/* 107:154 */     int n = -1;
/* 108:155 */     int i1 = 0;int i2 = 0;int i3 = 0;int i4 = 0;int i5 = 0;int i6 = 0;
/* 109:156 */     double d5 = 0.0D;double d6 = 0.0D;double d7 = 0.0D;double d8 = 0.0D;
/* 110:158 */     for (int i10 = 0; i10 < paramInt1; i10++)
/* 111:    */     {
/* 112:159 */       d9 = paramDouble1 + i10 * paramDouble4 + this.a;
/* 113:160 */       i11 = (int)d9;
/* 114:161 */       if (d9 < i11) {
/* 115:162 */         i11--;
/* 116:    */       }
/* 117:164 */       i12 = i11 & 0xFF;
/* 118:165 */       d9 -= i11;
/* 119:166 */       d10 = d9 * d9 * d9 * (d9 * (d9 * 6.0D - 15.0D) + 10.0D);
/* 120:168 */       for (int i13 = 0; i13 < paramInt3; i13++)
/* 121:    */       {
/* 122:169 */         double d12 = paramDouble3 + i13 * paramDouble6 + this.c;
/* 123:170 */         int i14 = (int)d12;
/* 124:171 */         if (d12 < i14) {
/* 125:172 */           i14--;
/* 126:    */         }
/* 127:174 */         int i15 = i14 & 0xFF;
/* 128:175 */         d12 -= i14;
/* 129:176 */         double d13 = d12 * d12 * d12 * (d12 * (d12 * 6.0D - 15.0D) + 10.0D);
/* 130:178 */         for (int i16 = 0; i16 < paramInt2; i16++)
/* 131:    */         {
/* 132:179 */           double d14 = paramDouble2 + i16 * paramDouble5 + this.b;
/* 133:180 */           int i17 = (int)d14;
/* 134:181 */           if (d14 < i17) {
/* 135:182 */             i17--;
/* 136:    */           }
/* 137:184 */           int i18 = i17 & 0xFF;
/* 138:185 */           d14 -= i17;
/* 139:186 */           double d15 = d14 * d14 * d14 * (d14 * (d14 * 6.0D - 15.0D) + 10.0D);
/* 140:188 */           if ((i16 == 0) || (i18 != n))
/* 141:    */           {
/* 142:189 */             n = i18;
/* 143:190 */             i1 = this.d[i12] + i18;
/* 144:191 */             i2 = this.d[i1] + i15;
/* 145:192 */             i3 = this.d[(i1 + 1)] + i15;
/* 146:193 */             i4 = this.d[(i12 + 1)] + i18;
/* 147:194 */             i5 = this.d[i4] + i15;
/* 148:195 */             i6 = this.d[(i4 + 1)] + i15;
/* 149:196 */             d5 = b(d10, a(this.d[i2], d9, d14, d12), a(this.d[i5], d9 - 1.0D, d14, d12));
/* 150:197 */             d6 = b(d10, a(this.d[i3], d9, d14 - 1.0D, d12), a(this.d[i6], d9 - 1.0D, d14 - 1.0D, d12));
/* 151:198 */             d7 = b(d10, a(this.d[(i2 + 1)], d9, d14, d12 - 1.0D), a(this.d[(i5 + 1)], d9 - 1.0D, d14, d12 - 1.0D));
/* 152:199 */             d8 = b(d10, a(this.d[(i3 + 1)], d9, d14 - 1.0D, d12 - 1.0D), a(this.d[(i6 + 1)], d9 - 1.0D, d14 - 1.0D, d12 - 1.0D));
/* 153:    */           }
/* 154:202 */           double d16 = b(d15, d5, d6);
/* 155:203 */           double d17 = b(d15, d7, d8);
/* 156:204 */           double d18 = b(d13, d16, d17);
/* 157:    */           
/* 158:206 */           paramArrayOfDouble[(j++)] += d18 * d1;
/* 159:    */         }
/* 160:    */       }
/* 161:    */     }
/* 162:    */   }
/* 163:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bnu
 * JD-Core Version:    0.7.0.1
 */
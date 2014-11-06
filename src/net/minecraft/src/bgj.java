package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bgj
/*   4:    */   extends bgt
/*   5:    */ {
/*   6: 12 */   private float[] d = new float[1024];
/*   7:    */   
/*   8:    */   protected void a(long paramLong, int paramInt1, int paramInt2, bgk parambgk, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3, int paramInt4, double paramDouble4)
/*   9:    */   {
/*  10: 15 */     Random localRandom = new Random(paramLong);
/*  11:    */     
/*  12: 17 */     double d1 = paramInt1 * 16 + 8;
/*  13: 18 */     double d2 = paramInt2 * 16 + 8;
/*  14:    */     
/*  15: 20 */     float f1 = 0.0F;
/*  16: 21 */     float f2 = 0.0F;
/*  17: 23 */     if (paramInt4 <= 0)
/*  18:    */     {
/*  19: 24 */       int i = this.a * 16 - 16;
/*  20: 25 */       paramInt4 = i - localRandom.nextInt(i / 4);
/*  21:    */     }
/*  22: 27 */     int i = 0;
/*  23: 29 */     if (paramInt3 == -1)
/*  24:    */     {
/*  25: 30 */       paramInt3 = paramInt4 / 2;
/*  26: 31 */       i = 1;
/*  27:    */     }
/*  28: 34 */     float f3 = 1.0F;
/*  29: 35 */     for (int j = 0; j < 256; j++)
/*  30:    */     {
/*  31: 36 */       if ((j == 0) || (localRandom.nextInt(3) == 0)) {
/*  32: 37 */         f3 = 1.0F + localRandom.nextFloat() * localRandom.nextFloat() * 1.0F;
/*  33:    */       }
/*  34: 39 */       this.d[j] = (f3 * f3);
/*  35:    */     }
/*  36: 42 */     for (; paramInt3 < paramInt4; paramInt3++)
/*  37:    */     {
/*  38: 43 */       double d3 = 1.5D + MathUtils.sin(paramInt3 * 3.141593F / paramInt4) * paramFloat1 * 1.0F;
/*  39: 44 */       double d4 = d3 * paramDouble4;
/*  40:    */       
/*  41: 46 */       d3 *= (localRandom.nextFloat() * 0.25D + 0.75D);
/*  42: 47 */       d4 *= (localRandom.nextFloat() * 0.25D + 0.75D);
/*  43:    */       
/*  44: 49 */       float f4 = MathUtils.cos(paramFloat3);
/*  45: 50 */       float f5 = MathUtils.sin(paramFloat3);
/*  46: 51 */       paramDouble1 += MathUtils.cos(paramFloat2) * f4;
/*  47: 52 */       paramDouble2 += f5;
/*  48: 53 */       paramDouble3 += MathUtils.sin(paramFloat2) * f4;
/*  49:    */       
/*  50: 55 */       paramFloat3 *= 0.7F;
/*  51:    */       
/*  52: 57 */       paramFloat3 += f2 * 0.05F;
/*  53: 58 */       paramFloat2 += f1 * 0.05F;
/*  54:    */       
/*  55: 60 */       f2 *= 0.8F;
/*  56: 61 */       f1 *= 0.5F;
/*  57: 62 */       f2 += (localRandom.nextFloat() - localRandom.nextFloat()) * localRandom.nextFloat() * 2.0F;
/*  58: 63 */       f1 += (localRandom.nextFloat() - localRandom.nextFloat()) * localRandom.nextFloat() * 4.0F;
/*  59: 65 */       if ((i != 0) || (localRandom.nextInt(4) != 0))
/*  60:    */       {
/*  61: 70 */         double d5 = paramDouble1 - d1;
/*  62: 71 */         double d6 = paramDouble3 - d2;
/*  63: 72 */         double d7 = paramInt4 - paramInt3;
/*  64: 73 */         double d8 = paramFloat1 + 2.0F + 16.0F;
/*  65: 74 */         if (d5 * d5 + d6 * d6 - d7 * d7 > d8 * d8) {
/*  66: 75 */           return;
/*  67:    */         }
/*  68: 79 */         if ((paramDouble1 >= d1 - 16.0D - d3 * 2.0D) && (paramDouble3 >= d2 - 16.0D - d3 * 2.0D) && (paramDouble1 <= d1 + 16.0D + d3 * 2.0D) && (paramDouble3 <= d2 + 16.0D + d3 * 2.0D))
/*  69:    */         {
/*  70: 83 */           int k = MathUtils.floor(paramDouble1 - d3) - paramInt1 * 16 - 1;
/*  71: 84 */           int m = MathUtils.floor(paramDouble1 + d3) - paramInt1 * 16 + 1;
/*  72:    */           
/*  73: 86 */           int n = MathUtils.floor(paramDouble2 - d4) - 1;
/*  74: 87 */           int i1 = MathUtils.floor(paramDouble2 + d4) + 1;
/*  75:    */           
/*  76: 89 */           int localbec1 = MathUtils.floor(paramDouble3 - d3) - paramInt2 * 16 - 1;
/*  77: 90 */           int localbec2 = MathUtils.floor(paramDouble3 + d3) - paramInt2 * 16 + 1;
/*  78: 92 */           if (k < 0) {
/*  79: 93 */             k = 0;
/*  80:    */           }
/*  81: 95 */           if (m > 16) {
/*  82: 96 */             m = 16;
/*  83:    */           }
/*  84: 99 */           if (n < 1) {
/*  85:100 */             n = 1;
/*  86:    */           }
/*  87:102 */           if (i1 > 248) {
/*  88:103 */             i1 = 248;
/*  89:    */           }
/*  90:106 */           if (localbec1 < 0) {
/*  91:107 */             localbec1 = 0;
/*  92:    */           }
/*  93:109 */           if (localbec2 > 16) {
/*  94:110 */             localbec2 = 16;
/*  95:    */           }
/*  96:113 */           int i2 = 0;
/*  97:    */           Block localbec3;
/*  98:114 */           for (int i3 = k; (i2 == 0) && (i3 < m); i3++) {
/*  99:115 */             for (int i4 = localbec1; (i2 == 0) && (i4 < localbec2); i4++) {
/* 100:116 */               for (int i5 = i1 + 1; (i2 == 0) && (i5 >= n - 1); i5--) {
/* 101:117 */                 if ((i5 >= 0) && (i5 < 256))
/* 102:    */                 {
/* 103:121 */                   localbec3 = parambgk.a(i3, i5, i4);
/* 104:122 */                   if ((localbec3.getProto() == BlockList.i) || (localbec3.getProto() == BlockList.j)) {
/* 105:123 */                     i2 = 1;
/* 106:    */                   }
/* 107:125 */                   if ((i5 != n - 1) && (i3 != k) && (i3 != m - 1) && (i4 != localbec1) && (i4 != localbec2 - 1)) {
/* 108:126 */                     i5 = n;
/* 109:    */                   }
/* 110:    */                 }
/* 111:    */               }
/* 112:    */             }
/* 113:    */           }
/* 114:131 */           if (i2 == 0)
/* 115:    */           {
/* 116:135 */             for (int i3 = k; i3 < m; i3++)
/* 117:    */             {
/* 118:136 */               double d9 = (i3 + paramInt1 * 16 + 0.5D - paramDouble1) / d3;
/* 119:137 */               for (int localbec31 = localbec1; localbec31 < localbec2; localbec31++)
/* 120:    */               {
/* 121:138 */                 double d10 = (localbec31 + paramInt2 * 16 + 0.5D - paramDouble3) / d3;
/* 122:139 */                 int i6 = 0;
/* 123:140 */                 if (d9 * d9 + d10 * d10 < 1.0D) {
/* 124:141 */                   for (int i7 = i1; i7 > n; i7--)
/* 125:    */                   {
/* 126:142 */                     double d11 = (i7 - 1 + 0.5D - paramDouble2) / d4;
/* 127:143 */                     if ((d9 * d9 + d10 * d10) * this.d[(i7 - 1)] + d11 * d11 / 6.0D < 1.0D)
/* 128:    */                     {
/* 129:144 */                       Block localbec4 = parambgk.a(i3, i7, localbec31);
/* 130:145 */                       if (localbec4.getProto() == BlockList.grass) {
/* 131:146 */                         i6 = 1;
/* 132:    */                       }
/* 133:148 */                       if ((localbec4.getProto() == BlockList.stone) || (localbec4.getProto() == BlockList.dirt) || (localbec4.getProto() == BlockList.grass)) {
/* 134:149 */                         if (i7 - 1 < 10)
/* 135:    */                         {
/* 136:150 */                           parambgk.a(i3, i7, localbec31, BlockList.k.instance());
/* 137:    */                         }
/* 138:    */                         else
/* 139:    */                         {
/* 140:152 */                           parambgk.a(i3, i7, localbec31, BlockList.air.instance());
/* 141:153 */                           if ((i6 != 0) && (parambgk.a(i3, i7 - 1, localbec31).getProto() == BlockList.dirt)) {
/* 142:154 */                             parambgk.a(i3, i7 - 1, localbec31, this.c.b(new BlockPosition(i3 + paramInt1 * 16, 0, localbec31 + paramInt2 * 16)).ak);
/* 143:    */                           }
/* 144:    */                         }
/* 145:    */                       }
/* 146:    */                     }
/* 147:    */                   }
/* 148:    */                 }
/* 149:    */               }
/* 150:    */             }
/* 151:163 */             if (i != 0) {
/* 152:    */               break;
/* 153:    */             }
/* 154:    */           }
/* 155:    */         }
/* 156:    */       }
/* 157:    */     }
/* 158:    */   }
/* 159:    */   
/* 160:    */   protected void a(World paramaqu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, bgk parambgk)
/* 161:    */   {
/* 162:171 */     if (this.b.nextInt(50) != 0) {
/* 163:172 */       return;
/* 164:    */     }
/* 165:174 */     double d1 = paramInt1 * 16 + this.b.nextInt(16);
/* 166:175 */     double d2 = this.b.nextInt(this.b.nextInt(40) + 8) + 20;
/* 167:176 */     double d3 = paramInt2 * 16 + this.b.nextInt(16);
/* 168:    */     
/* 169:178 */     int i = 1;
/* 170:180 */     for (int j = 0; j < i; j++)
/* 171:    */     {
/* 172:181 */       float f1 = this.b.nextFloat() * 3.141593F * 2.0F;
/* 173:182 */       float f2 = (this.b.nextFloat() - 0.5F) * 2.0F / 8.0F;
/* 174:183 */       float f3 = (this.b.nextFloat() * 2.0F + this.b.nextFloat()) * 2.0F;
/* 175:    */       
/* 176:185 */       a(this.b.nextLong(), paramInt3, paramInt4, parambgk, d1, d2, d3, f3, f1, f2, 0, 0, 3.0D);
/* 177:    */     }
/* 178:    */   }
/* 179:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bgj
 * JD-Core Version:    0.7.0.1
 */
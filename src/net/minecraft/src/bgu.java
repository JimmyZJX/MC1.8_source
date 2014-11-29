package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bgu
/*   4:    */   extends bgt
/*   5:    */ {
/*   6:    */   protected void a(long paramLong, int paramInt1, int paramInt2, bgk parambgk, double paramDouble1, double paramDouble2, double paramDouble3)
/*   7:    */   {
/*   8: 12 */     a(paramLong, paramInt1, paramInt2, parambgk, paramDouble1, paramDouble2, paramDouble3, 1.0F + this.b.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D);
/*   9:    */   }
/*  10:    */   
/*  11:    */   protected void a(long paramLong, int paramInt1, int paramInt2, bgk parambgk, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3, int paramInt4, double paramDouble4)
/*  12:    */   {
/*  13: 16 */     double d1 = paramInt1 * 16 + 8;
/*  14: 17 */     double d2 = paramInt2 * 16 + 8;
/*  15:    */     
/*  16: 19 */     float f1 = 0.0F;
/*  17: 20 */     float f2 = 0.0F;
/*  18: 21 */     Random localRandom = new Random(paramLong);
/*  19: 23 */     if (paramInt4 <= 0)
/*  20:    */     {
/*  21: 24 */       int i = this.a * 16 - 16;
/*  22: 25 */       paramInt4 = i - localRandom.nextInt(i / 4);
/*  23:    */     }
/*  24: 27 */     int i = 0;
/*  25: 29 */     if (paramInt3 == -1)
/*  26:    */     {
/*  27: 30 */       paramInt3 = paramInt4 / 2;
/*  28: 31 */       i = 1;
/*  29:    */     }
/*  30: 34 */     int j = localRandom.nextInt(paramInt4 / 2) + paramInt4 / 4;
/*  31: 35 */     int k = localRandom.nextInt(6) == 0 ? 1 : 0;
/*  32: 37 */     for (; paramInt3 < paramInt4; paramInt3++)
/*  33:    */     {
/*  34: 38 */       double d3 = 1.5D + MathUtils.sin(paramInt3 * 3.141593F / paramInt4) * paramFloat1 * 1.0F;
/*  35: 39 */       double d4 = d3 * paramDouble4;
/*  36:    */       
/*  37: 41 */       float f3 = MathUtils.cos(paramFloat3);
/*  38: 42 */       float f4 = MathUtils.sin(paramFloat3);
/*  39: 43 */       paramDouble1 += MathUtils.cos(paramFloat2) * f3;
/*  40: 44 */       paramDouble2 += f4;
/*  41: 45 */       paramDouble3 += MathUtils.sin(paramFloat2) * f3;
/*  42: 47 */       if (k != 0) {
/*  43: 48 */         paramFloat3 *= 0.92F;
/*  44:    */       } else {
/*  45: 50 */         paramFloat3 *= 0.7F;
/*  46:    */       }
/*  47: 52 */       paramFloat3 += f2 * 0.1F;
/*  48: 53 */       paramFloat2 += f1 * 0.1F;
/*  49:    */       
/*  50: 55 */       f2 *= 0.9F;
/*  51: 56 */       f1 *= 0.75F;
/*  52: 57 */       f2 += (localRandom.nextFloat() - localRandom.nextFloat()) * localRandom.nextFloat() * 2.0F;
/*  53: 58 */       f1 += (localRandom.nextFloat() - localRandom.nextFloat()) * localRandom.nextFloat() * 4.0F;
/*  54: 60 */       if ((i == 0) && (paramInt3 == j) && (paramFloat1 > 1.0F))
/*  55:    */       {
/*  56: 61 */         a(localRandom.nextLong(), paramInt1, paramInt2, parambgk, paramDouble1, paramDouble2, paramDouble3, localRandom.nextFloat() * 0.5F + 0.5F, paramFloat2 - 1.570796F, paramFloat3 / 3.0F, paramInt3, paramInt4, 1.0D);
/*  57: 62 */         a(localRandom.nextLong(), paramInt1, paramInt2, parambgk, paramDouble1, paramDouble2, paramDouble3, localRandom.nextFloat() * 0.5F + 0.5F, paramFloat2 + 1.570796F, paramFloat3 / 3.0F, paramInt3, paramInt4, 1.0D);
/*  58: 63 */         return;
/*  59:    */       }
/*  60: 65 */       if ((i != 0) || (localRandom.nextInt(4) != 0))
/*  61:    */       {
/*  62: 70 */         double d5 = paramDouble1 - d1;
/*  63: 71 */         double d6 = paramDouble3 - d2;
/*  64: 72 */         double d7 = paramInt4 - paramInt3;
/*  65: 73 */         double d8 = paramFloat1 + 2.0F + 16.0F;
/*  66: 74 */         if (d5 * d5 + d6 * d6 - d7 * d7 > d8 * d8) {
/*  67: 75 */           return;
/*  68:    */         }
/*  69: 79 */         if ((paramDouble1 >= d1 - 16.0D - d3 * 2.0D) && (paramDouble3 >= d2 - 16.0D - d3 * 2.0D) && (paramDouble1 <= d1 + 16.0D + d3 * 2.0D) && (paramDouble3 <= d2 + 16.0D + d3 * 2.0D))
/*  70:    */         {
/*  71: 83 */           int m = MathUtils.floor(paramDouble1 - d3) - paramInt1 * 16 - 1;
/*  72: 84 */           int n = MathUtils.floor(paramDouble1 + d3) - paramInt1 * 16 + 1;
/*  73:    */           
/*  74: 86 */           int i1 = MathUtils.floor(paramDouble2 - d4) - 1;
/*  75: 87 */           int i2 = MathUtils.floor(paramDouble2 + d4) + 1;
/*  76:    */           
/*  77: 89 */           int localbec1 = MathUtils.floor(paramDouble3 - d3) - paramInt2 * 16 - 1;
/*  78: 90 */           int localbec2 = MathUtils.floor(paramDouble3 + d3) - paramInt2 * 16 + 1;
/*  79: 92 */           if (m < 0) {
/*  80: 93 */             m = 0;
/*  81:    */           }
/*  82: 95 */           if (n > 16) {
/*  83: 96 */             n = 16;
/*  84:    */           }
/*  85: 99 */           if (i1 < 1) {
/*  86:100 */             i1 = 1;
/*  87:    */           }
/*  88:102 */           if (i2 > 120) {
/*  89:103 */             i2 = 120;
/*  90:    */           }
/*  91:106 */           if (localbec1 < 0) {
/*  92:107 */             localbec1 = 0;
/*  93:    */           }
/*  94:109 */           if (localbec2 > 16) {
/*  95:110 */             localbec2 = 16;
/*  96:    */           }
/*  97:113 */           int i3 = 0;
/*  98:    */           Block localbec3;
/*  99:114 */           for (int i4 = m; (i3 == 0) && (i4 < n); i4++) {
/* 100:115 */             for (int i5 = localbec1; (i3 == 0) && (i5 < localbec2); i5++) {
/* 101:116 */               for (int i6 = i2 + 1; (i3 == 0) && (i6 >= i1 - 1); i6--) {
/* 102:117 */                 if ((i6 >= 0) && (i6 < 128))
/* 103:    */                 {
/* 104:121 */                   localbec3 = parambgk.a(i4, i6, i5);
/* 105:122 */                   if ((localbec3.getType() == BlockList.flowingLava) || (localbec3.getType() == BlockList.lava)) {
/* 106:123 */                     i3 = 1;
/* 107:    */                   }
/* 108:125 */                   if ((i6 != i1 - 1) && (i4 != m) && (i4 != n - 1) && (i5 != localbec1) && (i5 != localbec2 - 1)) {
/* 109:126 */                     i6 = i1;
/* 110:    */                   }
/* 111:    */                 }
/* 112:    */               }
/* 113:    */             }
/* 114:    */           }
/* 115:131 */           if (i3 == 0)
/* 116:    */           {
/* 117:135 */             for (int i4 = m; i4 < n; i4++)
/* 118:    */             {
/* 119:136 */               double d9 = (i4 + paramInt1 * 16 + 0.5D - paramDouble1) / d3;
/* 120:137 */               for (int localbec31 = localbec1; localbec31 < localbec2; localbec31++)
/* 121:    */               {
/* 122:138 */                 double d10 = (localbec31 + paramInt2 * 16 + 0.5D - paramDouble3) / d3;
/* 123:139 */                 for (int i7 = i2; i7 > i1; i7--)
/* 124:    */                 {
/* 125:140 */                   double d11 = (i7 - 1 + 0.5D - paramDouble2) / d4;
/* 126:141 */                   if ((d11 > -0.7D) && (d9 * d9 + d11 * d11 + d10 * d10 < 1.0D))
/* 127:    */                   {
/* 128:142 */                     Block localbec4 = parambgk.a(i4, i7, localbec31);
/* 129:143 */                     if ((localbec4.getType() == BlockList.netherrack) || (localbec4.getType() == BlockList.dirt) || (localbec4.getType() == BlockList.grass)) {
/* 130:144 */                       parambgk.a(i4, i7, localbec31, BlockList.air.instance());
/* 131:    */                     }
/* 132:    */                   }
/* 133:    */                 }
/* 134:    */               }
/* 135:    */             }
/* 136:150 */             if (i != 0) {
/* 137:    */               break;
/* 138:    */             }
/* 139:    */           }
/* 140:    */         }
/* 141:    */       }
/* 142:    */     }
/* 143:    */   }
/* 144:    */   
/* 145:    */   protected void a(World paramaqu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, bgk parambgk)
/* 146:    */   {
/* 147:158 */     int i = this.b.nextInt(this.b.nextInt(this.b.nextInt(10) + 1) + 1);
/* 148:159 */     if (this.b.nextInt(5) != 0) {
/* 149:160 */       i = 0;
/* 150:    */     }
/* 151:163 */     for (int j = 0; j < i; j++)
/* 152:    */     {
/* 153:164 */       double d1 = paramInt1 * 16 + this.b.nextInt(16);
/* 154:165 */       double d2 = this.b.nextInt(128);
/* 155:166 */       double d3 = paramInt2 * 16 + this.b.nextInt(16);
/* 156:    */       
/* 157:168 */       int k = 1;
/* 158:169 */       if (this.b.nextInt(4) == 0)
/* 159:    */       {
/* 160:170 */         a(this.b.nextLong(), paramInt3, paramInt4, parambgk, d1, d2, d3);
/* 161:171 */         k += this.b.nextInt(4);
/* 162:    */       }
/* 163:174 */       for (int m = 0; m < k; m++)
/* 164:    */       {
/* 165:175 */         float f1 = this.b.nextFloat() * 3.141593F * 2.0F;
/* 166:176 */         float f2 = (this.b.nextFloat() - 0.5F) * 2.0F / 8.0F;
/* 167:177 */         float f3 = this.b.nextFloat() * 2.0F + this.b.nextFloat();
/* 168:    */         
/* 169:179 */         a(this.b.nextLong(), paramInt3, paramInt4, parambgk, d1, d2, d3, f3 * 2.0F, f1, f2, 0, 0, 0.5D);
/* 170:    */       }
/* 171:    */     }
/* 172:    */   }
/* 173:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bgu
 * JD-Core Version:    0.7.0.1
 */
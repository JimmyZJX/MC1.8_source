package net.minecraft.src;
/*   1:    */ import com.google.common.base.Objects;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bgs
/*   5:    */   extends bgt
/*   6:    */ {
/*   7:    */   protected void a(long paramLong, int paramInt1, int paramInt2, bgk parambgk, double paramDouble1, double paramDouble2, double paramDouble3)
/*   8:    */   {
/*   9: 16 */     a(paramLong, paramInt1, paramInt2, parambgk, paramDouble1, paramDouble2, paramDouble3, 1.0F + this.b.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D);
/*  10:    */   }
/*  11:    */   
/*  12:    */   protected void a(long paramLong, int paramInt1, int paramInt2, bgk parambgk, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3, int paramInt4, double paramDouble4)
/*  13:    */   {
/*  14: 20 */     double d1 = paramInt1 * 16 + 8;
/*  15: 21 */     double d2 = paramInt2 * 16 + 8;
/*  16:    */     
/*  17: 23 */     float f1 = 0.0F;
/*  18: 24 */     float f2 = 0.0F;
/*  19: 25 */     Random localRandom = new Random(paramLong);
/*  20: 27 */     if (paramInt4 <= 0)
/*  21:    */     {
/*  22: 28 */       int i = this.a * 16 - 16;
/*  23: 29 */       paramInt4 = i - localRandom.nextInt(i / 4);
/*  24:    */     }
/*  25: 31 */     int i = 0;
/*  26: 33 */     if (paramInt3 == -1)
/*  27:    */     {
/*  28: 34 */       paramInt3 = paramInt4 / 2;
/*  29: 35 */       i = 1;
/*  30:    */     }
/*  31: 38 */     int j = localRandom.nextInt(paramInt4 / 2) + paramInt4 / 4;
/*  32: 39 */     int k = localRandom.nextInt(6) == 0 ? 1 : 0;
/*  33: 41 */     for (; paramInt3 < paramInt4; paramInt3++)
/*  34:    */     {
/*  35: 42 */       double d3 = 1.5D + MathUtils.sin(paramInt3 * 3.141593F / paramInt4) * paramFloat1 * 1.0F;
/*  36: 43 */       double d4 = d3 * paramDouble4;
/*  37:    */       
/*  38: 45 */       float f3 = MathUtils.cos(paramFloat3);
/*  39: 46 */       float f4 = MathUtils.sin(paramFloat3);
/*  40: 47 */       paramDouble1 += MathUtils.cos(paramFloat2) * f3;
/*  41: 48 */       paramDouble2 += f4;
/*  42: 49 */       paramDouble3 += MathUtils.sin(paramFloat2) * f3;
/*  43: 51 */       if (k != 0) {
/*  44: 52 */         paramFloat3 *= 0.92F;
/*  45:    */       } else {
/*  46: 54 */         paramFloat3 *= 0.7F;
/*  47:    */       }
/*  48: 56 */       paramFloat3 += f2 * 0.1F;
/*  49: 57 */       paramFloat2 += f1 * 0.1F;
/*  50:    */       
/*  51: 59 */       f2 *= 0.9F;
/*  52: 60 */       f1 *= 0.75F;
/*  53: 61 */       f2 += (localRandom.nextFloat() - localRandom.nextFloat()) * localRandom.nextFloat() * 2.0F;
/*  54: 62 */       f1 += (localRandom.nextFloat() - localRandom.nextFloat()) * localRandom.nextFloat() * 4.0F;
/*  55: 64 */       if ((i == 0) && (paramInt3 == j) && (paramFloat1 > 1.0F) && (paramInt4 > 0))
/*  56:    */       {
/*  57: 65 */         a(localRandom.nextLong(), paramInt1, paramInt2, parambgk, paramDouble1, paramDouble2, paramDouble3, localRandom.nextFloat() * 0.5F + 0.5F, paramFloat2 - 1.570796F, paramFloat3 / 3.0F, paramInt3, paramInt4, 1.0D);
/*  58: 66 */         a(localRandom.nextLong(), paramInt1, paramInt2, parambgk, paramDouble1, paramDouble2, paramDouble3, localRandom.nextFloat() * 0.5F + 0.5F, paramFloat2 + 1.570796F, paramFloat3 / 3.0F, paramInt3, paramInt4, 1.0D);
/*  59: 67 */         return;
/*  60:    */       }
/*  61: 69 */       if ((i != 0) || (localRandom.nextInt(4) != 0))
/*  62:    */       {
/*  63: 74 */         double d5 = paramDouble1 - d1;
/*  64: 75 */         double d6 = paramDouble3 - d2;
/*  65: 76 */         double d7 = paramInt4 - paramInt3;
/*  66: 77 */         double d8 = paramFloat1 + 2.0F + 16.0F;
/*  67: 78 */         if (d5 * d5 + d6 * d6 - d7 * d7 > d8 * d8) {
/*  68: 79 */           return;
/*  69:    */         }
/*  70: 83 */         if ((paramDouble1 >= d1 - 16.0D - d3 * 2.0D) && (paramDouble3 >= d2 - 16.0D - d3 * 2.0D) && (paramDouble1 <= d1 + 16.0D + d3 * 2.0D) && (paramDouble3 <= d2 + 16.0D + d3 * 2.0D))
/*  71:    */         {
/*  72: 87 */           int m = MathUtils.floor(paramDouble1 - d3) - paramInt1 * 16 - 1;
/*  73: 88 */           int n = MathUtils.floor(paramDouble1 + d3) - paramInt1 * 16 + 1;
/*  74:    */           
/*  75: 90 */           int i1 = MathUtils.floor(paramDouble2 - d4) - 1;
/*  76: 91 */           int i2 = MathUtils.floor(paramDouble2 + d4) + 1;
/*  77:    */           
/*  78: 93 */           int localbec1 = MathUtils.floor(paramDouble3 - d3) - paramInt2 * 16 - 1;
/*  79: 94 */           int localbec2 = MathUtils.floor(paramDouble3 + d3) - paramInt2 * 16 + 1;
/*  80: 96 */           if (m < 0) {
/*  81: 97 */             m = 0;
/*  82:    */           }
/*  83: 99 */           if (n > 16) {
/*  84:100 */             n = 16;
/*  85:    */           }
/*  86:103 */           if (i1 < 1) {
/*  87:104 */             i1 = 1;
/*  88:    */           }
/*  89:106 */           if (i2 > 248) {
/*  90:107 */             i2 = 248;
/*  91:    */           }
/*  92:110 */           if (localbec1 < 0) {
/*  93:111 */             localbec1 = 0;
/*  94:    */           }
/*  95:113 */           if (localbec2 > 16) {
/*  96:114 */             localbec2 = 16;
/*  97:    */           }
/*  98:117 */           int i3 = 0;
/*  99:    */           Block localbec3;
/* 100:118 */           for (int i4 = m; (i3 == 0) && (i4 < n); i4++) {
/* 101:119 */             for (int i5 = localbec1; (i3 == 0) && (i5 < localbec2); i5++) {
/* 102:120 */               for (int i6 = i2 + 1; (i3 == 0) && (i6 >= i1 - 1); i6--) {
/* 103:121 */                 if ((i6 >= 0) && (i6 < 256))
/* 104:    */                 {
/* 105:124 */                   localbec3 = parambgk.a(i4, i6, i5);
/* 106:125 */                   if ((localbec3.getProto() == BlockList.flowingWater) || (localbec3.getProto() == BlockList.water)) {
/* 107:126 */                     i3 = 1;
/* 108:    */                   }
/* 109:128 */                   if ((i6 != i1 - 1) && (i4 != m) && (i4 != n - 1) && (i5 != localbec1) && (i5 != localbec2 - 1)) {
/* 110:129 */                     i6 = i1;
/* 111:    */                   }
/* 112:    */                 }
/* 113:    */               }
/* 114:    */             }
/* 115:    */           }
/* 116:134 */           if (i3 == 0)
/* 117:    */           {
/* 118:138 */             for (int i4 = m; i4 < n; i4++)
/* 119:    */             {
/* 120:139 */               double d9 = (i4 + paramInt1 * 16 + 0.5D - paramDouble1) / d3;
/* 121:140 */               for (int localbec31 = localbec1; localbec31 < localbec2; localbec31++)
/* 122:    */               {
/* 123:141 */                 double d10 = (localbec31 + paramInt2 * 16 + 0.5D - paramDouble3) / d3;
/* 124:142 */                 int i7 = 0;
/* 125:143 */                 if (d9 * d9 + d10 * d10 < 1.0D) {
/* 126:144 */                   for (int i8 = i2; i8 > i1; i8--)
/* 127:    */                   {
/* 128:145 */                     double d11 = (i8 - 1 + 0.5D - paramDouble2) / d4;
/* 129:146 */                     if ((d11 > -0.7D) && (d9 * d9 + d11 * d11 + d10 * d10 < 1.0D))
/* 130:    */                     {
/* 131:147 */                       Block localbec4 = parambgk.a(i4, i8, localbec31);
/* 132:148 */                       Block localbec5 = (Block)Objects.firstNonNull(parambgk.a(i4, i8 + 1, localbec31), BlockList.air.instance());
/* 133:149 */                       if ((localbec4.getProto() == BlockList.grass) || (localbec4.getProto() == BlockList.bw)) {
/* 134:150 */                         i7 = 1;
/* 135:    */                       }
/* 136:152 */                       if (a(localbec4, localbec5)) {
/* 137:153 */                         if (i8 - 1 < 10)
/* 138:    */                         {
/* 139:154 */                           parambgk.a(i4, i8, localbec31, BlockList.lava.instance());
/* 140:    */                         }
/* 141:    */                         else
/* 142:    */                         {
/* 143:156 */                           parambgk.a(i4, i8, localbec31, BlockList.air.instance());
/* 144:157 */                           if (localbec5.getProto() == BlockList.sand) {
/* 145:158 */                             parambgk.a(i4, i8 + 1, localbec31, localbec5.getProperty(BlockSand.a) == bac.b ? BlockList.cM.instance() : BlockList.A.instance());
/* 146:    */                           }
/* 147:160 */                           if ((i7 != 0) && (parambgk.a(i4, i8 - 1, localbec31).getProto() == BlockList.dirt)) {
/* 148:161 */                             parambgk.a(i4, i8 - 1, localbec31, this.c.b(new BlockPosition(i4 + paramInt1 * 16, 0, localbec31 + paramInt2 * 16)).ak.getProto().instance());
/* 149:    */                           }
/* 150:    */                         }
/* 151:    */                       }
/* 152:    */                     }
/* 153:    */                   }
/* 154:    */                 }
/* 155:    */               }
/* 156:    */             }
/* 157:170 */             if (i != 0) {
/* 158:    */               break;
/* 159:    */             }
/* 160:    */           }
/* 161:    */         }
/* 162:    */       }
/* 163:    */     }
/* 164:    */   }
/* 165:    */   
/* 166:    */   protected boolean a(Block parambec1, Block parambec2)
/* 167:    */   {
/* 168:177 */     if (parambec1.getProto() == BlockList.stone) {
/* 169:178 */       return true;
/* 170:    */     }
/* 171:180 */     if (parambec1.getProto() == BlockList.dirt) {
/* 172:181 */       return true;
/* 173:    */     }
/* 174:183 */     if (parambec1.getProto() == BlockList.grass) {
/* 175:184 */       return true;
/* 176:    */     }
/* 177:186 */     if (parambec1.getProto() == BlockList.cz) {
/* 178:187 */       return true;
/* 179:    */     }
/* 180:189 */     if (parambec1.getProto() == BlockList.cu) {
/* 181:190 */       return true;
/* 182:    */     }
/* 183:192 */     if (parambec1.getProto() == BlockList.A) {
/* 184:193 */       return true;
/* 185:    */     }
/* 186:195 */     if (parambec1.getProto() == BlockList.cM) {
/* 187:196 */       return true;
/* 188:    */     }
/* 189:198 */     if (parambec1.getProto() == BlockList.bw) {
/* 190:199 */       return true;
/* 191:    */     }
/* 192:201 */     if (parambec1.getProto() == BlockList.aH) {
/* 193:202 */       return true;
/* 194:    */     }
/* 195:204 */     if (((parambec1.getProto() == BlockList.sand) || (parambec1.getProto() == BlockList.gravel)) && (parambec2.getProto().getMaterial() != Material.water)) {
/* 196:205 */       return true;
/* 197:    */     }
/* 198:208 */     return false;
/* 199:    */   }
/* 200:    */   
/* 201:    */   protected void a(World paramaqu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, bgk parambgk)
/* 202:    */   {
/* 203:213 */     int i = this.b.nextInt(this.b.nextInt(this.b.nextInt(15) + 1) + 1);
/* 204:214 */     if (this.b.nextInt(7) != 0) {
/* 205:215 */       i = 0;
/* 206:    */     }
/* 207:218 */     for (int j = 0; j < i; j++)
/* 208:    */     {
/* 209:219 */       double d1 = paramInt1 * 16 + this.b.nextInt(16);
/* 210:220 */       double d2 = this.b.nextInt(this.b.nextInt(120) + 8);
/* 211:221 */       double d3 = paramInt2 * 16 + this.b.nextInt(16);
/* 212:    */       
/* 213:223 */       int k = 1;
/* 214:224 */       if (this.b.nextInt(4) == 0)
/* 215:    */       {
/* 216:225 */         a(this.b.nextLong(), paramInt3, paramInt4, parambgk, d1, d2, d3);
/* 217:226 */         k += this.b.nextInt(4);
/* 218:    */       }
/* 219:229 */       for (int m = 0; m < k; m++)
/* 220:    */       {
/* 221:230 */         float f1 = this.b.nextFloat() * 3.141593F * 2.0F;
/* 222:231 */         float f2 = (this.b.nextFloat() - 0.5F) * 2.0F / 8.0F;
/* 223:232 */         float f3 = this.b.nextFloat() * 2.0F + this.b.nextFloat();
/* 224:233 */         if (this.b.nextInt(10) == 0) {
/* 225:234 */           f3 *= (this.b.nextFloat() * this.b.nextFloat() * 3.0F + 1.0F);
/* 226:    */         }
/* 227:237 */         a(this.b.nextLong(), paramInt3, paramInt4, parambgk, d1, d2, d3, f3, f1, f2, 0, 0, 1.0D);
/* 228:    */       }
/* 229:    */     }
/* 230:    */   }
/* 231:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bgs
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class EndChunkProvider
/*   5:    */   implements IChunkProvider
/*   6:    */ {
/*   7:    */   private Random h;
/*   8:    */   private bnv i;
/*   9:    */   private bnv j;
/*  10:    */   private bnv k;
/*  11:    */   public bnv a;
/*  12:    */   public bnv b;
/*  13:    */   private World l;
/*  14:    */   private double[] m;
/*  15:    */   private arm[] n;
/*  16:    */   double[] c;
/*  17:    */   double[] d;
/*  18:    */   double[] e;
/*  19:    */   double[] f;
/*  20:    */   double[] g;
/*  21:    */   
/*  22:    */   public EndChunkProvider(World paramaqu, long paramLong)
/*  23:    */   {
/*  24: 35 */     this.l = paramaqu;
/*  25:    */     
/*  26: 37 */     this.h = new Random(paramLong);
/*  27: 38 */     this.i = new bnv(this.h, 16);
/*  28: 39 */     this.j = new bnv(this.h, 16);
/*  29: 40 */     this.k = new bnv(this.h, 8);
/*  30:    */     
/*  31: 42 */     this.a = new bnv(this.h, 10);
/*  32: 43 */     this.b = new bnv(this.h, 16);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void a(int paramInt1, int paramInt2, bgk parambgk)
/*  36:    */   {
/*  37: 49 */     int i1 = 2;
/*  38:    */     
/*  39: 51 */     int i2 = i1 + 1;
/*  40: 52 */     int i3 = 33;
/*  41: 53 */     int i4 = i1 + 1;
/*  42: 54 */     this.m = a(this.m, paramInt1 * i1, 0, paramInt2 * i1, i2, i3, i4);
/*  43: 56 */     for (int i5 = 0; i5 < i1; i5++) {
/*  44: 57 */       for (int i6 = 0; i6 < i1; i6++) {
/*  45: 58 */         for (int i7 = 0; i7 < 32; i7++)
/*  46:    */         {
/*  47: 59 */           double d1 = 0.25D;
/*  48: 60 */           double d2 = this.m[(((i5 + 0) * i4 + i6 + 0) * i3 + i7 + 0)];
/*  49: 61 */           double d3 = this.m[(((i5 + 0) * i4 + i6 + 1) * i3 + i7 + 0)];
/*  50: 62 */           double d4 = this.m[(((i5 + 1) * i4 + i6 + 0) * i3 + i7 + 0)];
/*  51: 63 */           double d5 = this.m[(((i5 + 1) * i4 + i6 + 1) * i3 + i7 + 0)];
/*  52:    */           
/*  53: 65 */           double d6 = (this.m[(((i5 + 0) * i4 + i6 + 0) * i3 + i7 + 1)] - d2) * d1;
/*  54: 66 */           double d7 = (this.m[(((i5 + 0) * i4 + i6 + 1) * i3 + i7 + 1)] - d3) * d1;
/*  55: 67 */           double d8 = (this.m[(((i5 + 1) * i4 + i6 + 0) * i3 + i7 + 1)] - d4) * d1;
/*  56: 68 */           double d9 = (this.m[(((i5 + 1) * i4 + i6 + 1) * i3 + i7 + 1)] - d5) * d1;
/*  57: 70 */           for (int i8 = 0; i8 < 4; i8++)
/*  58:    */           {
/*  59: 71 */             double d10 = 0.125D;
/*  60:    */             
/*  61: 73 */             double d11 = d2;
/*  62: 74 */             double d12 = d3;
/*  63: 75 */             double d13 = (d4 - d2) * d10;
/*  64: 76 */             double d14 = (d5 - d3) * d10;
/*  65: 78 */             for (int i9 = 0; i9 < 8; i9++)
/*  66:    */             {
/*  67: 79 */               double d15 = 0.125D;
/*  68:    */               
/*  69: 81 */               double d16 = d11;
/*  70: 82 */               double d17 = (d12 - d11) * d15;
/*  71: 83 */               for (int i10 = 0; i10 < 8; i10++)
/*  72:    */               {
/*  73: 84 */                 Block localbec = null;
/*  74: 85 */                 if (d16 > 0.0D) {
/*  75: 86 */                   localbec = BlockList.endStone.instance();
/*  76:    */                 }
/*  77: 89 */                 int i11 = i9 + i5 * 8;
/*  78: 90 */                 int i12 = i8 + i7 * 4;
/*  79: 91 */                 int i13 = i10 + i6 * 8;
/*  80: 92 */                 parambgk.a(i11, i12, i13, localbec);
/*  81: 93 */                 d16 += d17;
/*  82:    */               }
/*  83: 95 */               d11 += d13;
/*  84: 96 */               d12 += d14;
/*  85:    */             }
/*  86: 99 */             d2 += d6;
/*  87:100 */             d3 += d7;
/*  88:101 */             d4 += d8;
/*  89:102 */             d5 += d9;
/*  90:    */           }
/*  91:    */         }
/*  92:    */       }
/*  93:    */     }
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void a(bgk parambgk)
/*  97:    */   {
/*  98:110 */     for (int i1 = 0; i1 < 16; i1++) {
/*  99:111 */       for (int i2 = 0; i2 < 16; i2++)
/* 100:    */       {
/* 101:112 */         int i3 = 1;
/* 102:113 */         int i4 = -1;
/* 103:    */         
/* 104:115 */         Block localbec1 = BlockList.endStone.instance();
/* 105:116 */         Block localbec2 = BlockList.endStone.instance();
/* 106:118 */         for (int i5 = 127; i5 >= 0; i5--)
/* 107:    */         {
/* 108:119 */           Block localbec3 = parambgk.a(i1, i5, i2);
/* 109:120 */           if (localbec3.getProto().getMaterial() == Material.air) {
/* 110:121 */             i4 = -1;
/* 111:122 */           } else if (localbec3.getProto() == BlockList.stone) {
/* 112:123 */             if (i4 == -1)
/* 113:    */             {
/* 114:124 */               if (i3 <= 0)
/* 115:    */               {
/* 116:125 */                 localbec1 = BlockList.air.instance();
/* 117:126 */                 localbec2 = BlockList.endStone.instance();
/* 118:    */               }
/* 119:129 */               i4 = i3;
/* 120:130 */               if (i5 >= 0) {
/* 121:131 */                 parambgk.a(i1, i5, i2, localbec1);
/* 122:    */               } else {
/* 123:133 */                 parambgk.a(i1, i5, i2, localbec2);
/* 124:    */               }
/* 125:    */             }
/* 126:135 */             else if (i4 > 0)
/* 127:    */             {
/* 128:136 */               i4--;
/* 129:137 */               parambgk.a(i1, i5, i2, localbec2);
/* 130:    */             }
/* 131:    */           }
/* 132:    */         }
/* 133:    */       }
/* 134:    */     }
/* 135:    */   }
/* 136:    */   
/* 137:    */   public Chunk getChunk(int paramInt1, int paramInt2)
/* 138:    */   {
/* 139:154 */     this.h.setSeed(paramInt1 * 341873128712L + paramInt2 * 132897987541L);
/* 140:    */     
/* 141:156 */     bgk localbgk = new bgk();
/* 142:157 */     this.n = this.l.v().b(this.n, paramInt1 * 16, paramInt2 * 16, 16, 16);
/* 143:    */     
/* 144:159 */     a(paramInt1, paramInt2, localbgk);
/* 145:160 */     a(localbgk);
/* 146:    */     
/* 147:162 */     Chunk localbfh = new Chunk(this.l, localbgk, paramInt1, paramInt2);
/* 148:163 */     byte[] arrayOfByte = localbfh.k();
/* 149:165 */     for (int i1 = 0; i1 < arrayOfByte.length; i1++) {
/* 150:166 */       arrayOfByte[i1] = ((byte)this.n[i1].az);
/* 151:    */     }
/* 152:169 */     localbfh.generateSkylightMap();
/* 153:    */     
/* 154:171 */     return localbfh;
/* 155:    */   }
/* 156:    */   
/* 157:    */   private double[] a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 158:    */   {
/* 159:177 */     if (paramArrayOfDouble == null) {
/* 160:178 */       paramArrayOfDouble = new double[paramInt4 * paramInt5 * paramInt6];
/* 161:    */     }
/* 162:181 */     double d1 = 684.41200000000003D;
/* 163:182 */     double d2 = 684.41200000000003D;
/* 164:    */     
/* 165:184 */     this.f = this.a.a(this.f, paramInt1, paramInt3, paramInt4, paramInt6, 1.121D, 1.121D, 0.5D);
/* 166:185 */     this.g = this.b.a(this.g, paramInt1, paramInt3, paramInt4, paramInt6, 200.0D, 200.0D, 0.5D);
/* 167:    */     
/* 168:187 */     d1 *= 2.0D;
/* 169:    */     
/* 170:189 */     this.c = this.k.a(this.c, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1 / 80.0D, d2 / 160.0D, d1 / 80.0D);
/* 171:190 */     this.d = this.i.a(this.d, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
/* 172:191 */     this.e = this.j.a(this.e, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
/* 173:    */     
/* 174:193 */     int i1 = 0;
/* 175:195 */     for (int i2 = 0; i2 < paramInt4; i2++) {
/* 176:196 */       for (int i3 = 0; i3 < paramInt6; i3++)
/* 177:    */       {
/* 178:197 */         float f1 = (i2 + paramInt1) / 1.0F;
/* 179:198 */         float f2 = (i3 + paramInt3) / 1.0F;
/* 180:199 */         float f3 = 100.0F - MathUtils.sqrt(f1 * f1 + f2 * f2) * 8.0F;
/* 181:200 */         if (f3 > 80.0F) {
/* 182:201 */           f3 = 80.0F;
/* 183:    */         }
/* 184:203 */         if (f3 < -100.0F) {
/* 185:204 */           f3 = -100.0F;
/* 186:    */         }
/* 187:207 */         for (int i4 = 0; i4 < paramInt5; i4++)
/* 188:    */         {
/* 189:208 */           double d3 = 0.0D;
/* 190:209 */           double d4 = this.d[i1] / 512.0D;
/* 191:210 */           double d5 = this.e[i1] / 512.0D;
/* 192:    */           
/* 193:212 */           double d6 = (this.c[i1] / 10.0D + 1.0D) / 2.0D;
/* 194:213 */           if (d6 < 0.0D) {
/* 195:214 */             d3 = d4;
/* 196:215 */           } else if (d6 > 1.0D) {
/* 197:216 */             d3 = d5;
/* 198:    */           } else {
/* 199:218 */             d3 = d4 + (d5 - d4) * d6;
/* 200:    */           }
/* 201:220 */           d3 -= 8.0D;
/* 202:    */           
/* 203:222 */           d3 += f3;
/* 204:    */           
/* 205:224 */           int i5 = 2;
/* 206:    */           double d7;
/* 207:225 */           if (i4 > paramInt5 / 2 - i5)
/* 208:    */           {
/* 209:226 */             d7 = (i4 - (paramInt5 / 2 - i5)) / 64.0F;
/* 210:227 */             d7 = MathUtils.clamp(d7, 0.0D, 1.0D);
/* 211:228 */             d3 = d3 * (1.0D - d7) + -3000.0D * d7;
/* 212:    */           }
/* 213:230 */           i5 = 8;
/* 214:231 */           if (i4 < i5)
/* 215:    */           {
/* 216:232 */             d7 = (i5 - i4) / (i5 - 1.0F);
/* 217:233 */             d3 = d3 * (1.0D - d7) + -30.0D * d7;
/* 218:    */           }
/* 219:236 */           paramArrayOfDouble[i1] = d3;
/* 220:237 */           i1++;
/* 221:    */         }
/* 222:    */       }
/* 223:    */     }
/* 224:241 */     return paramArrayOfDouble;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public boolean a(int paramInt1, int paramInt2)
/* 228:    */   {
/* 229:246 */     return true;
/* 230:    */   }
/* 231:    */   
/* 232:    */   public void a(IChunkProvider parambfe, int paramInt1, int paramInt2)
/* 233:    */   {
/* 234:251 */     avt.M = true;
/* 235:    */     
/* 236:253 */     BlockPosition localdt = new BlockPosition(paramInt1 * 16, 0, paramInt2 * 16);
/* 237:254 */     this.l.b(localdt.offset(16, 0, 16)).a(this.l, this.l.rng, localdt);
/* 238:    */     
/* 239:256 */     avt.M = false;
/* 240:    */   }
/* 241:    */   
/* 242:    */   public boolean a(IChunkProvider parambfe, Chunk parambfh, int paramInt1, int paramInt2)
/* 243:    */   {
/* 244:261 */     return false;
/* 245:    */   }
/* 246:    */   
/* 247:    */   public boolean a(boolean paramBoolean, uy paramuy)
/* 248:    */   {
/* 249:266 */     return true;
/* 250:    */   }
/* 251:    */   
/* 252:    */   public void c() {}
/* 253:    */   
/* 254:    */   public boolean d()
/* 255:    */   {
/* 256:275 */     return false;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public boolean e()
/* 260:    */   {
/* 261:280 */     return true;
/* 262:    */   }
/* 263:    */   
/* 264:    */   public String getName()
/* 265:    */   {
/* 266:285 */     return "RandomLevelSource";
/* 267:    */   }
/* 268:    */   
/* 269:    */   public List<SpawnListEntry> getSpawnList(EnumCreatureType paramxp, BlockPosition paramdt)
/* 270:    */   {
/* 271:290 */     return this.l.b(paramdt).a(paramxp);
/* 272:    */   }
/* 273:    */   
/* 274:    */   public BlockPosition a(World paramaqu, String paramString, BlockPosition paramdt)
/* 275:    */   {
/* 276:295 */     return null;
/* 277:    */   }
/* 278:    */   
/* 279:    */   public int g()
/* 280:    */   {
/* 281:300 */     return 0;
/* 282:    */   }
/* 283:    */   
/* 284:    */   public void a(Chunk parambfh, int paramInt1, int paramInt2) {}
/* 285:    */   
/* 286:    */   public Chunk a(BlockPosition paramdt)
/* 287:    */   {
/* 288:309 */     return getChunk(paramdt.getX() >> 4, paramdt.getZ() >> 4);
/* 289:    */   }
/* 290:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bgw
 * JD-Core Version:    0.7.0.1
 */
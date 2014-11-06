package net.minecraft.src;
/*   1:    */ import java.util.Arrays;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class asj
/*   6:    */   extends arm
/*   7:    */ {
/*   8:    */   private Block[] aD;
/*   9:    */   private long aE;
/*  10:    */   private bnw aF;
/*  11:    */   private bnw aG;
/*  12:    */   private bnw aH;
/*  13:    */   private boolean aI;
/*  14:    */   private boolean aJ;
/*  15:    */   
/*  16:    */   public asj(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
/*  17:    */   {
/*  18: 29 */     super(paramInt);
/*  19: 30 */     this.aI = paramBoolean1;
/*  20: 31 */     this.aJ = paramBoolean2;
/*  21:    */     
/*  22: 33 */     b();
/*  23: 34 */     a(2.0F, 0.0F);
/*  24:    */     
/*  25:    */ 
/*  26: 37 */     this.au.clear();
/*  27: 38 */     this.ak = BlockList.sand.instance().a(BlockSand.a, bac.b);
/*  28: 39 */     this.al = BlockList.cu.instance();
/*  29:    */     
/*  30: 41 */     this.as.A = -999;
/*  31: 42 */     this.as.D = 20;
/*  32: 43 */     this.as.F = 3;
/*  33: 44 */     this.as.G = 5;
/*  34: 45 */     this.as.B = 0;
/*  35:    */     
/*  36: 47 */     this.au.clear();
/*  37: 49 */     if (paramBoolean2) {
/*  38: 50 */       this.as.A = 5;
/*  39:    */     }
/*  40:    */   }
/*  41:    */   
/*  42:    */   public bhc a(Random paramRandom)
/*  43:    */   {
/*  44: 56 */     return this.aA;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public int c(BlockPosition paramdt)
/*  48:    */   {
/*  49: 61 */     return 10387789;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public int b(BlockPosition paramdt)
/*  53:    */   {
/*  54: 66 */     return 9470285;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void a(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  58:    */   {
/*  59: 71 */     super.a(paramaqu, paramRandom, paramdt);
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void a(World paramaqu, Random paramRandom, bgk parambgk, int paramInt1, int paramInt2, double paramDouble)
/*  63:    */   {
/*  64: 76 */     if ((this.aD == null) || (this.aE != paramaqu.J())) {
/*  65: 77 */       a(paramaqu.J());
/*  66:    */     }
/*  67: 79 */     if ((this.aF == null) || (this.aG == null) || (this.aE != paramaqu.J()))
/*  68:    */     {
/*  69: 80 */       Random localRandom = new Random(this.aE);
/*  70: 81 */       this.aF = new bnw(localRandom, 4);
/*  71: 82 */       this.aG = new bnw(localRandom, 1);
/*  72:    */     }
/*  73: 84 */     this.aE = paramaqu.J();
/*  74:    */     
/*  75: 86 */     double d1 = 0.0D;
/*  76: 87 */     if (this.aI)
/*  77:    */     {
/*  78: 88 */       int i = (paramInt1 & 0xFFFFFFF0) + (paramInt2 & 0xF);
/*  79: 89 */       int j = (paramInt2 & 0xFFFFFFF0) + (paramInt1 & 0xF);
/*  80:    */       
/*  81: 91 */       double d2 = Math.min(Math.abs(paramDouble), this.aF.a(i * 0.25D, j * 0.25D));
/*  82: 92 */       if (d2 > 0.0D)
/*  83:    */       {
/*  84: 93 */         double d3 = 0.001953125D;
/*  85: 94 */         double d4 = Math.abs(this.aG.a(i * d3, j * d3));
/*  86: 95 */         d1 = d2 * d2 * 2.5D;
/*  87: 96 */         double d5 = Math.ceil(d4 * 50.0D) + 14.0D;
/*  88: 97 */         if (d1 > d5) {
/*  89: 98 */           d1 = d5;
/*  90:    */         }
/*  91:100 */         d1 += 64.0D;
/*  92:    */       }
/*  93:    */     }
/*  94:104 */     int i = paramInt1 & 0xF;
/*  95:105 */     int j = paramInt2 & 0xF;
/*  96:    */     
/*  97:107 */     int k = 63;
/*  98:    */     
/*  99:109 */     Block localbec1 = BlockList.cu.instance();
/* 100:110 */     Block localbec2 = this.al;
/* 101:    */     
/* 102:112 */     int m = (int)(paramDouble / 3.0D + 3.0D + paramRandom.nextDouble() * 0.25D);
/* 103:113 */     int n = Math.cos(paramDouble / 3.0D * 3.141592653589793D) > 0.0D ? 1 : 0;
/* 104:114 */     int i1 = -1;
/* 105:115 */     int i2 = 0;
/* 106:117 */     for (int i3 = 255; i3 >= 0; i3--)
/* 107:    */     {
/* 108:118 */       if ((parambgk.a(j, i3, i).getProto().getMaterial() == Material.air) && (i3 < (int)d1)) {
/* 109:119 */         parambgk.a(j, i3, i, BlockList.stone.instance());
/* 110:    */       }
/* 111:122 */       if (i3 <= paramRandom.nextInt(5))
/* 112:    */       {
/* 113:123 */         parambgk.a(j, i3, i, BlockList.bedrock.instance());
/* 114:    */       }
/* 115:    */       else
/* 116:    */       {
/* 117:125 */         Block localbec3 = parambgk.a(j, i3, i);
/* 118:127 */         if (localbec3.getProto().getMaterial() == Material.air)
/* 119:    */         {
/* 120:128 */           i1 = -1;
/* 121:    */         }
/* 122:129 */         else if (localbec3.getProto() == BlockList.stone)
/* 123:    */         {
/* 124:    */           Block localbec4;
/* 125:130 */           if (i1 == -1)
/* 126:    */           {
/* 127:131 */             i2 = 0;
/* 128:132 */             if (m <= 0)
/* 129:    */             {
/* 130:133 */               localbec1 = null;
/* 131:134 */               localbec2 = BlockList.stone.instance();
/* 132:    */             }
/* 133:135 */             else if ((i3 >= 59) && (i3 <= 64))
/* 134:    */             {
/* 135:136 */               localbec1 = BlockList.cu.instance();
/* 136:137 */               localbec2 = this.al;
/* 137:    */             }
/* 138:140 */             if ((i3 < 63) && ((localbec1 == null) || (localbec1.getProto().getMaterial() == Material.air))) {
/* 139:141 */               localbec1 = BlockList.j.instance();
/* 140:    */             }
/* 141:144 */             i1 = m + Math.max(0, i3 - 63);
/* 142:145 */             if (i3 >= 62)
/* 143:    */             {
/* 144:146 */               if ((this.aJ) && (i3 > 86 + m * 2))
/* 145:    */               {
/* 146:147 */                 if (n != 0) {
/* 147:148 */                   parambgk.a(j, i3, i, BlockList.dirt.instance().a(BlockDirt.a, avd.b));
/* 148:    */                 } else {
/* 149:150 */                   parambgk.a(j, i3, i, BlockList.grass.instance());
/* 150:    */                 }
/* 151:    */               }
/* 152:152 */               else if (i3 > 66 + m)
/* 153:    */               {
/* 154:154 */                 if ((i3 < 64) || (i3 > 127)) {
/* 155:155 */                   localbec4 = BlockList.cu.instance().a(aun.a, EnumDyeColor.ORANGE);
/* 156:156 */                 } else if (n != 0) {
/* 157:157 */                   localbec4 = BlockList.cz.instance();
/* 158:    */                 } else {
/* 159:159 */                   localbec4 = a(paramInt1, i3, paramInt2);
/* 160:    */                 }
/* 161:161 */                 parambgk.a(j, i3, i, localbec4);
/* 162:    */               }
/* 163:    */               else
/* 164:    */               {
/* 165:163 */                 parambgk.a(j, i3, i, this.ak);
/* 166:164 */                 i2 = 1;
/* 167:    */               }
/* 168:    */             }
/* 169:    */             else
/* 170:    */             {
/* 171:167 */               parambgk.a(j, i3, i, localbec2);
/* 172:168 */               if (localbec2.getProto() == BlockList.cu) {
/* 173:169 */                 parambgk.a(j, i3, i, localbec2.getProto().instance().a(aun.a, EnumDyeColor.ORANGE));
/* 174:    */               }
/* 175:    */             }
/* 176:    */           }
/* 177:172 */           else if (i1 > 0)
/* 178:    */           {
/* 179:173 */             i1--;
/* 180:175 */             if (i2 != 0)
/* 181:    */             {
/* 182:176 */               parambgk.a(j, i3, i, BlockList.cu.instance().a(aun.a, EnumDyeColor.ORANGE));
/* 183:    */             }
/* 184:    */             else
/* 185:    */             {
/* 186:178 */               localbec4 = a(paramInt1, i3, paramInt2);
/* 187:179 */               parambgk.a(j, i3, i, localbec4);
/* 188:    */             }
/* 189:    */           }
/* 190:    */         }
/* 191:    */       }
/* 192:    */     }
/* 193:    */   }
/* 194:    */   
/* 195:    */   private void a(long paramLong)
/* 196:    */   {
/* 197:188 */     this.aD = new Block[64];
/* 198:189 */     Arrays.fill(this.aD, BlockList.cz.instance());
/* 199:    */     
/* 200:191 */     Random localRandom = new Random(paramLong);
/* 201:192 */     this.aH = new bnw(localRandom, 1);
				  int i;
				  int j;
				  int k;
				  int m;
				  int n;
				  int i1;
/* 228:    */     int i2;
/* 202:194 */     for (i = 0; i < 64; i++)
/* 203:    */     {
/* 204:195 */       i += localRandom.nextInt(5) + 1;
/* 205:196 */       if (i < 64) {
/* 206:197 */         this.aD[i] = BlockList.cu.instance().a(aun.a, EnumDyeColor.ORANGE);
/* 207:    */       }
/* 208:    */     }
/* 209:201 */     i = localRandom.nextInt(4) + 2;
/* 210:202 */     for (j = 0; j < i; j++)
/* 211:    */     {
/* 212:203 */       k = localRandom.nextInt(3) + 1;
/* 213:204 */       m = localRandom.nextInt(64);
/* 214:206 */       for (n = 0; (m + n < 64) && (n < k); n++) {
/* 215:207 */         this.aD[(m + n)] = BlockList.cu.instance().a(aun.a, EnumDyeColor.YELLOW);
/* 216:    */       }
/* 217:    */     }
/* 218:210 */     j = localRandom.nextInt(4) + 2;
/* 219:211 */     for (k = 0; k < j; k++)
/* 220:    */     {
/* 221:212 */       m = localRandom.nextInt(3) + 2;
/* 222:213 */       n = localRandom.nextInt(64);
/* 223:215 */       for (i1 = 0; (n + i1 < 64) && (i1 < m); i1++) {
/* 224:216 */         this.aD[(n + i1)] = BlockList.cu.instance().a(aun.a, EnumDyeColor.BROWN);
/* 225:    */       }
/* 226:    */     }
/* 227:219 */     k = localRandom.nextInt(4) + 2;
/* 229:220 */     for (m = 0; m < k; m++)
/* 230:    */     {
/* 231:221 */       n = localRandom.nextInt(3) + 1;
/* 232:222 */       i1 = localRandom.nextInt(64);
/* 233:224 */       for (i2 = 0; (i1 + i2 < 64) && (i2 < n); i2++) {
/* 234:225 */         this.aD[(i1 + i2)] = BlockList.cu.instance().a(aun.a, EnumDyeColor.RED);
/* 235:    */       }
/* 236:    */     }
/* 237:228 */     m = localRandom.nextInt(3) + 3;
/* 238:229 */     n = 0;
/* 239:230 */     for (i1 = 0; i1 < m; i1++)
/* 240:    */     {
/* 241:231 */       i2 = 1;
/* 242:232 */       n += localRandom.nextInt(16) + 4;
/* 243:234 */       for (int i3 = 0; (n + i3 < 64) && (i3 < i2); i3++)
/* 244:    */       {
/* 245:235 */         this.aD[(n + i3)] = BlockList.cu.instance().a(aun.a, EnumDyeColor.WHITE);
/* 246:236 */         if ((n + i3 > 1) && (localRandom.nextBoolean())) {
/* 247:237 */           this.aD[(n + i3 - 1)] = BlockList.cu.instance().a(aun.a, EnumDyeColor.SILVER);
/* 248:    */         }
/* 249:239 */         if ((n + i3 < 63) && (localRandom.nextBoolean())) {
/* 250:240 */           this.aD[(n + i3 + 1)] = BlockList.cu.instance().a(aun.a, EnumDyeColor.SILVER);
/* 251:    */         }
/* 252:    */       }
/* 253:    */     }
/* 254:    */   }
/* 255:    */   
/* 256:    */   private Block a(int paramInt1, int paramInt2, int paramInt3)
/* 257:    */   {
/* 258:247 */     int i = (int)Math.round(this.aH.a(paramInt1 * 1.0D / 512.0D, paramInt1 * 1.0D / 512.0D) * 2.0D);
/* 259:248 */     return this.aD[((paramInt2 + i + 64) % 64)];
/* 260:    */   }
/* 261:    */   
/* 262:    */   protected arm d(int paramInt)
/* 263:    */   {
/* 264:253 */     boolean bool = this.az == arm.aa.az;
/* 265:    */     
/* 266:255 */     asj localasj = new asj(paramInt, bool, this.aJ);
/* 267:257 */     if (!bool)
/* 268:    */     {
/* 269:258 */       localasj.a(g);
/* 270:259 */       localasj.a(this.ah + " M");
/* 271:    */     }
/* 272:    */     else
/* 273:    */     {
/* 274:261 */       localasj.a(this.ah + " (Bryce)");
/* 275:    */     }
/* 276:263 */     localasj.a(this.ai, true);
/* 277:    */     
/* 278:265 */     return localasj;
/* 279:    */   }
/* 280:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     asj
 * JD-Core Version:    0.7.0.1
 */
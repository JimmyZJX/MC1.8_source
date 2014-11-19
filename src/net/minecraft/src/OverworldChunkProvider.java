package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class OverworldChunkProvider
/*   5:    */   implements IChunkProvider
/*   6:    */ {
/*   7:    */   private Random h;
/*   8:    */   private bnv i;
/*   9:    */   private bnv j;
/*  10:    */   private bnv k;
/*  11:    */   private bnw l;
/*  12:    */   public bnv a;
/*  13:    */   public bnv b;
/*  14:    */   public bnv c;
/*  15:    */   private World m;
/*  16:    */   private final boolean n;
/*  17:    */   private WorldType o;
/*  18:    */   private final double[] p;
/*  19:    */   private final float[] q;
/*  20:    */   private bgl r;
/*  21: 64 */   private ProtoBlock s = BlockList.water;
/*  22:    */   
/*  23:    */   public OverworldChunkProvider(World paramaqu, long paramLong, boolean paramBoolean, String paramString)
/*  24:    */   {
/*  25: 67 */     this.m = paramaqu;
/*  26: 68 */     this.n = paramBoolean;
/*  27: 69 */     this.o = paramaqu.getWorldInfo().u();
/*  28:    */     
/*  29: 71 */     this.h = new Random(paramLong);
/*  30: 72 */     this.i = new bnv(this.h, 16);
/*  31: 73 */     this.j = new bnv(this.h, 16);
/*  32: 74 */     this.k = new bnv(this.h, 8);
/*  33: 75 */     this.l = new bnw(this.h, 4);
/*  34:    */     
/*  35: 77 */     this.a = new bnv(this.h, 10);
/*  36: 78 */     this.b = new bnv(this.h, 16);
/*  37:    */     
/*  38:    */ 
/*  39:    */ 
/*  40:    */ 
/*  41:    */ 
/*  42:    */ 
/*  43: 85 */     this.c = new bnv(this.h, 8);
/*  44:    */     
/*  45: 87 */     this.p = new double[825];
/*  46:    */     
/*  47: 89 */     this.q = new float[25];
/*  48: 90 */     for (int i1 = -2; i1 <= 2; i1++) {
/*  49: 91 */       for (int i2 = -2; i2 <= 2; i2++)
/*  50:    */       {
/*  51: 92 */         float f1 = 10.0F / MathUtils.sqrt(i1 * i1 + i2 * i2 + 0.2F);
/*  52: 93 */         this.q[(i1 + 2 + (i2 + 2) * 5)] = f1;
/*  53:    */       }
/*  54:    */     }
/*  55: 97 */     if (paramString != null)
/*  56:    */     {
/*  57: 98 */       this.r = bgn.a(paramString).b();
/*  58: 99 */       this.s = (this.r.E ? BlockList.lava : BlockList.water);
/*  59:    */     }
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void a(int paramInt1, int paramInt2, bgk parambgk)
/*  63:    */   {
/*  64:108 */     this.B = this.m.v().a(this.B, paramInt1 * 4 - 2, paramInt2 * 4 - 2, 10, 10);
/*  65:109 */     a(paramInt1 * 4, 0, paramInt2 * 4);
/*  66:111 */     for (int i1 = 0; i1 < 4; i1++)
/*  67:    */     {
/*  68:112 */       int i2 = i1 * 5;
/*  69:113 */       int i3 = (i1 + 1) * 5;
/*  70:114 */       for (int i4 = 0; i4 < 4; i4++)
/*  71:    */       {
/*  72:115 */         int i5 = (i2 + i4) * 33;
/*  73:116 */         int i6 = (i2 + i4 + 1) * 33;
/*  74:117 */         int i7 = (i3 + i4) * 33;
/*  75:118 */         int i8 = (i3 + i4 + 1) * 33;
/*  76:119 */         for (int i9 = 0; i9 < 32; i9++)
/*  77:    */         {
/*  78:120 */           double d1 = 0.125D;
/*  79:121 */           double d2 = this.p[(i5 + i9)];
/*  80:122 */           double d3 = this.p[(i6 + i9)];
/*  81:123 */           double d4 = this.p[(i7 + i9)];
/*  82:124 */           double d5 = this.p[(i8 + i9)];
/*  83:    */           
/*  84:126 */           double d6 = (this.p[(i5 + i9 + 1)] - d2) * d1;
/*  85:127 */           double d7 = (this.p[(i6 + i9 + 1)] - d3) * d1;
/*  86:128 */           double d8 = (this.p[(i7 + i9 + 1)] - d4) * d1;
/*  87:129 */           double d9 = (this.p[(i8 + i9 + 1)] - d5) * d1;
/*  88:131 */           for (int i10 = 0; i10 < 8; i10++)
/*  89:    */           {
/*  90:132 */             double d10 = 0.25D;
/*  91:    */             
/*  92:134 */             double d11 = d2;
/*  93:135 */             double d12 = d3;
/*  94:136 */             double d13 = (d4 - d2) * d10;
/*  95:137 */             double d14 = (d5 - d3) * d10;
/*  96:139 */             for (int i11 = 0; i11 < 4; i11++)
/*  97:    */             {
/*  98:140 */               double d15 = 0.25D;
/*  99:    */               
/* 100:142 */               double d16 = d11;
/* 101:143 */               double d17 = (d12 - d11) * d15;
/* 102:144 */               d16 -= d17;
/* 103:145 */               for (int i12 = 0; i12 < 4; i12++) {
/* 104:146 */                 if ((d16 += d17) > 0.0D) {
/* 105:147 */                   parambgk.a(i1 * 4 + i11, i9 * 8 + i10, i4 * 4 + i12, BlockList.stone.instance());
/* 106:148 */                 } else if (i9 * 8 + i10 < this.r.q) {
/* 107:149 */                   parambgk.a(i1 * 4 + i11, i9 * 8 + i10, i4 * 4 + i12, this.s.instance());
/* 108:    */                 }
/* 109:    */               }
/* 110:152 */               d11 += d13;
/* 111:153 */               d12 += d14;
/* 112:    */             }
/* 113:156 */             d2 += d6;
/* 114:157 */             d3 += d7;
/* 115:158 */             d4 += d8;
/* 116:159 */             d5 += d9;
/* 117:    */           }
/* 118:    */         }
/* 119:    */       }
/* 120:    */     }
/* 121:    */   }
/* 122:    */   
/* 123:166 */   private double[] t = new double[256];
/* 124:    */   
/* 125:    */   public void a(int paramInt1, int paramInt2, bgk parambgk, arm[] paramArrayOfarm)
/* 126:    */   {
/* 127:169 */     double d1 = 0.03125D;
/* 128:170 */     this.t = this.l.a(this.t, paramInt1 * 16, paramInt2 * 16, 16, 16, d1 * 2.0D, d1 * 2.0D, 1.0D);
/* 129:172 */     for (int i1 = 0; i1 < 16; i1++) {
/* 130:173 */       for (int i2 = 0; i2 < 16; i2++)
/* 131:    */       {
/* 132:174 */         arm localarm = paramArrayOfarm[(i2 + i1 * 16)];
/* 133:175 */         localarm.a(this.m, this.h, parambgk, paramInt1 * 16 + i1, paramInt2 * 16 + i2, this.t[(i2 + i1 * 16)]);
/* 134:    */       }
/* 135:    */     }
/* 136:    */   }
/* 137:    */   
/* 138:180 */   private bgt u = new bgs();
/* 139:181 */   private blp v = new blp();
/* 140:182 */   private bmw w = new bmw();
/* 141:183 */   private bjd x = new bjd();
/* 142:184 */   private blg y = new blg();
/* 143:185 */   private bgt z = new bgj();
/* 144:186 */   private bkg A = new bkg();
/* 145:    */   private arm[] B;
/* 146:    */   double[] d;
/* 147:    */   double[] e;
/* 148:    */   double[] f;
/* 149:    */   double[] g;
/* 150:    */   
/* 151:    */   public Chunk getChunk(int paramInt1, int paramInt2)
/* 152:    */   {
/* 153:197 */     this.h.setSeed(paramInt1 * 341873128712L + paramInt2 * 132897987541L);
/* 154:    */     
/* 155:199 */     bgk localbgk = new bgk();
/* 156:    */     
/* 157:201 */     a(paramInt1, paramInt2, localbgk);
/* 158:202 */     this.B = this.m.v().b(this.B, paramInt1 * 16, paramInt2 * 16, 16, 16);
/* 159:203 */     a(paramInt1, paramInt2, localbgk, this.B);
/* 160:205 */     if (this.r.r) {
/* 161:206 */       this.u.a(this, this.m, paramInt1, paramInt2, localbgk);
/* 162:    */     }
/* 163:208 */     if (this.r.z) {
/* 164:209 */       this.z.a(this, this.m, paramInt1, paramInt2, localbgk);
/* 165:    */     }
/* 166:211 */     if ((this.r.w) && (this.n)) {
/* 167:212 */       this.x.a(this, this.m, paramInt1, paramInt2, localbgk);
/* 168:    */     }
/* 169:214 */     if ((this.r.v) && (this.n)) {
/* 170:215 */       this.w.a(this, this.m, paramInt1, paramInt2, localbgk);
/* 171:    */     }
/* 172:217 */     if ((this.r.u) && (this.n)) {
/* 173:218 */       this.v.a(this, this.m, paramInt1, paramInt2, localbgk);
/* 174:    */     }
/* 175:220 */     if ((this.r.x) && (this.n)) {
/* 176:221 */       this.y.a(this, this.m, paramInt1, paramInt2, localbgk);
/* 177:    */     }
/* 178:223 */     if ((this.r.y) && (this.n)) {
/* 179:224 */       this.A.a(this, this.m, paramInt1, paramInt2, localbgk);
/* 180:    */     }
/* 181:227 */     Chunk localbfh = new Chunk(this.m, localbgk, paramInt1, paramInt2);
/* 182:228 */     byte[] arrayOfByte = localbfh.k();
/* 183:230 */     for (int i1 = 0; i1 < arrayOfByte.length; i1++) {
/* 184:231 */       arrayOfByte[i1] = ((byte)this.B[i1].az);
/* 185:    */     }
/* 186:234 */     localbfh.generateSkylightMap();
/* 187:    */     
/* 188:236 */     return localbfh;
/* 189:    */   }
/* 190:    */   
/* 191:    */   private void a(int paramInt1, int paramInt2, int paramInt3)
/* 192:    */   {
/* 193:247 */     this.g = this.b.a(this.g, paramInt1, paramInt3, 5, 5, this.r.e, this.r.f, this.r.g);
/* 194:    */     
/* 195:249 */     float f1 = this.r.a;
/* 196:250 */     float f2 = this.r.b;
/* 197:251 */     this.d = this.k.a(this.d, paramInt1, paramInt2, paramInt3, 5, 33, 5, f1 / this.r.h, f2 / this.r.i, f1 / this.r.j);
/* 198:252 */     this.e = this.i.a(this.e, paramInt1, paramInt2, paramInt3, 5, 33, 5, f1, f2, f1);
/* 199:253 */     this.f = this.j.a(this.f, paramInt1, paramInt2, paramInt3, 5, 33, 5, f1, f2, f1);
/* 200:254 */     paramInt1 = paramInt3 = 0;
/* 201:    */     
/* 202:256 */     int i1 = 0;
/* 203:257 */     int i2 = 0;
/* 204:259 */     for (int i3 = 0; i3 < 5; i3++) {
/* 205:260 */       for (int i4 = 0; i4 < 5; i4++)
/* 206:    */       {
/* 207:261 */         float f3 = 0.0F;
/* 208:262 */         float f4 = 0.0F;
/* 209:263 */         float f5 = 0.0F;
/* 210:    */         
/* 211:265 */         int i5 = 2;
/* 212:    */         
/* 213:    */ 
/* 214:    */ 
/* 215:269 */         arm localarm1 = this.B[(i3 + 2 + (i4 + 2) * 10)];
/* 216:270 */         for (int i6 = -i5; i6 <= i5; i6++) {
/* 217:271 */           for (int i7 = -i5; i7 <= i5; i7++)
/* 218:    */           {
/* 219:272 */             arm localarm2 = this.B[(i3 + i6 + 2 + (i4 + i7 + 2) * 10)];
/* 220:273 */             float f6 = this.r.n + localarm2.an * this.r.m;
/* 221:274 */             float f7 = this.r.p + localarm2.ao * this.r.o;
/* 222:275 */             if ((this.o == WorldType.e) && (f6 > 0.0F))
/* 223:    */             {
/* 224:276 */               f6 = 1.0F + f6 * 2.0F;
/* 225:277 */               f7 = 1.0F + f7 * 4.0F;
/* 226:    */             }
/* 227:279 */             float f8 = this.q[(i6 + 2 + (i7 + 2) * 5)] / (f6 + 2.0F);
/* 228:280 */             if (localarm2.an > localarm1.an) {
/* 229:281 */               f8 /= 2.0F;
/* 230:    */             }
/* 231:283 */             f3 += f7 * f8;
/* 232:284 */             f4 += f6 * f8;
/* 233:285 */             f5 += f8;
/* 234:    */           }
/* 235:    */         }
/* 236:288 */         f3 /= f5;
/* 237:289 */         f4 /= f5;
/* 238:    */         
/* 239:291 */         f3 = f3 * 0.9F + 0.1F;
/* 240:292 */         f4 = (f4 * 4.0F - 1.0F) / 8.0F;
/* 241:    */         
/* 242:294 */         double d1 = this.g[i2] / 8000.0D;
/* 243:295 */         if (d1 < 0.0D) {
/* 244:296 */           d1 = -d1 * 0.3D;
/* 245:    */         }
/* 246:298 */         d1 = d1 * 3.0D - 2.0D;
/* 247:300 */         if (d1 < 0.0D)
/* 248:    */         {
/* 249:301 */           d1 /= 2.0D;
/* 250:302 */           if (d1 < -1.0D) {
/* 251:303 */             d1 = -1.0D;
/* 252:    */           }
/* 253:305 */           d1 /= 1.4D;
/* 254:306 */           d1 /= 2.0D;
/* 255:    */         }
/* 256:    */         else
/* 257:    */         {
/* 258:308 */           if (d1 > 1.0D) {
/* 259:309 */             d1 = 1.0D;
/* 260:    */           }
/* 261:311 */           d1 /= 8.0D;
/* 262:    */         }
/* 263:314 */         i2++;
/* 264:    */         
/* 265:316 */         double d2 = f4;
/* 266:317 */         double d3 = f3;
/* 267:318 */         d2 += d1 * 0.2D;
/* 268:319 */         d2 = d2 * this.r.k / 8.0D;
/* 269:    */         
/* 270:321 */         double d4 = this.r.k + d2 * 4.0D;
/* 271:323 */         for (int i8 = 0; i8 < 33; i8++)
/* 272:    */         {
/* 273:324 */           double d5 = (i8 - d4) * this.r.l * 128.0D / 256.0D / d3;
/* 274:326 */           if (d5 < 0.0D) {
/* 275:327 */             d5 *= 4.0D;
/* 276:    */           }
/* 277:330 */           double d6 = this.e[i1] / this.r.d;
/* 278:331 */           double d7 = this.f[i1] / this.r.c;
/* 279:    */           
/* 280:333 */           double d8 = (this.d[i1] / 10.0D + 1.0D) / 2.0D;
/* 281:334 */           double d9 = MathUtils.clampedLerp(d6, d7, d8) - d5;
/* 282:338 */           if (i8 > 29)
/* 283:    */           {
/* 284:339 */             double d10 = (i8 - 29) / 3.0F;
/* 285:340 */             d9 = d9 * (1.0D - d10) + -10.0D * d10;
/* 286:    */           }
/* 287:343 */           this.p[i1] = d9;
/* 288:344 */           i1++;
/* 289:    */         }
/* 290:    */       }
/* 291:    */     }
/* 292:    */   }
/* 293:    */   
/* 294:    */   public boolean chunkLoaded(int paramInt1, int paramInt2)
/* 295:    */   {
/* 296:352 */     return true;
/* 297:    */   }
/* 298:    */   
/* 299:    */   public void a(IChunkProvider parambfe, int paramInt1, int paramInt2)
/* 300:    */   {
/* 301:410 */     avt.M = true;
/* 302:411 */     int i1 = paramInt1 * 16;
/* 303:412 */     int i2 = paramInt2 * 16;
/* 304:413 */     BlockPosition localdt1 = new BlockPosition(i1, 0, i2);
/* 305:414 */     arm localarm = this.m.b(localdt1.offset(16, 0, 16));
/* 306:    */     
/* 307:    */ 
/* 308:    */ 
/* 309:    */ 
/* 310:    */ 
/* 311:420 */     this.h.setSeed(this.m.J());
/* 312:421 */     long l1 = this.h.nextLong() / 2L * 2L + 1L;
/* 313:422 */     long l2 = this.h.nextLong() / 2L * 2L + 1L;
/* 314:423 */     this.h.setSeed(paramInt1 * l1 + paramInt2 * l2 ^ this.m.J());
/* 315:    */     
/* 316:425 */     boolean bool = false;
/* 317:    */     
/* 318:427 */     ChunkID localaqm = new ChunkID(paramInt1, paramInt2);
/* 319:429 */     if ((this.r.w) && (this.n)) {
/* 320:430 */       this.x.a(this.m, this.h, localaqm);
/* 321:    */     }
/* 322:432 */     if ((this.r.v) && (this.n)) {
/* 323:433 */       bool = this.w.a(this.m, this.h, localaqm);
/* 324:    */     }
/* 325:435 */     if ((this.r.u) && (this.n)) {
/* 326:436 */       this.v.a(this.m, this.h, localaqm);
/* 327:    */     }
/* 328:438 */     if ((this.r.x) && (this.n)) {
/* 329:439 */       this.y.a(this.m, this.h, localaqm);
/* 330:    */     }
/* 331:441 */     if ((this.r.y) && (this.n)) {
/* 332:442 */       this.A.a(this.m, this.h, localaqm);
/* 333:    */     }
/* 334:    */     int i4;
/* 335:    */     int i5;
/* 336:445 */     if ((localarm != arm.r) && (localarm != arm.G) && (this.r.A) && 
/* 337:446 */       (!bool) && (this.h.nextInt(this.r.B) == 0))
/* 338:    */     {
/* 339:447 */       int i3 = this.h.nextInt(16) + 8;
/* 340:448 */       i4 = this.h.nextInt(256);
/* 341:449 */       i5 = this.h.nextInt(16) + 8;
/* 342:450 */       new bhy(BlockList.water).generate(this.m, this.h, localdt1.offset(i3, i4, i5));
/* 343:    */     }
/* 344:454 */     if ((!bool) && (this.h.nextInt(this.r.D / 10) == 0) && (this.r.C))
/* 345:    */     {
/* 346:455 */       int i3 = this.h.nextInt(16) + 8;
/* 347:456 */       i4 = this.h.nextInt(this.h.nextInt(248) + 8);
/* 348:457 */       i5 = this.h.nextInt(16) + 8;
/* 349:458 */       if ((i4 < 63) || (this.h.nextInt(this.r.D / 8) == 0)) {
/* 350:459 */         new bhy(BlockList.lava).generate(this.m, this.h, localdt1.offset(i3, i4, i5));
/* 351:    */       }
/* 352:    */     }
/* 353:463 */     if (this.r.s) {
/* 354:464 */       for (int i3 = 0; i3 < this.r.t; i3++)
/* 355:    */       {
/* 356:465 */         i4 = this.h.nextInt(16) + 8;
/* 357:466 */         i5 = this.h.nextInt(256);
/* 358:467 */         int i6 = this.h.nextInt(16) + 8;
/* 359:468 */         new bie().generate(this.m, this.h, localdt1.offset(i4, i5, i6));
/* 360:    */       }
/* 361:    */     }
/* 362:472 */     localarm.a(this.m, this.h, new BlockPosition(i1, 0, i2));
/* 363:    */     
/* 364:474 */     MobSpawner.a(this.m, localarm, i1 + 8, i2 + 8, 16, 16, this.h);
/* 365:    */     
/* 366:476 */     localdt1 = localdt1.offset(8, 0, 8);
/* 367:477 */     for (int i3 = 0; i3 < 16; i3++) {
/* 368:478 */       for (i4 = 0; i4 < 16; i4++)
/* 369:    */       {
/* 370:479 */         BlockPosition localdt2 = this.m.q(localdt1.offset(i3, 0, i4));
/* 371:480 */         BlockPosition localdt3 = localdt2.down();
/* 372:482 */         if (this.m.v(localdt3)) {
/* 373:483 */           this.m.setBlock(localdt3, BlockList.aI.instance(), 2);
/* 374:    */         }
/* 375:485 */         if (this.m.f(localdt2, true)) {
/* 376:486 */           this.m.setBlock(localdt2, BlockList.aH.instance(), 2);
/* 377:    */         }
/* 378:    */       }
/* 379:    */     }
/* 380:491 */     avt.M = false;
/* 381:    */   }
/* 382:    */   
/* 383:    */   public boolean a(IChunkProvider parambfe, Chunk parambfh, int paramInt1, int paramInt2)
/* 384:    */   {
/* 385:496 */     boolean bool = false;
/* 386:497 */     if ((this.r.y) && (this.n)) {
/* 387:499 */       if (parambfh.w() < 3600L) {
/* 388:501 */         bool |= this.A.a(this.m, this.h, new ChunkID(paramInt1, paramInt2));
/* 389:    */       }
/* 390:    */     }
/* 391:505 */     return bool;
/* 392:    */   }
/* 393:    */   
/* 394:    */   public boolean a(boolean paramBoolean, uy paramuy)
/* 395:    */   {
/* 396:510 */     return true;
/* 397:    */   }
/* 398:    */   
/* 399:    */   public void c() {}
/* 400:    */   
/* 401:    */   public boolean d()
/* 402:    */   {
/* 403:519 */     return false;
/* 404:    */   }
/* 405:    */   
/* 406:    */   public boolean e()
/* 407:    */   {
/* 408:524 */     return true;
/* 409:    */   }
/* 410:    */   
/* 411:    */   public String getName()
/* 412:    */   {
/* 413:529 */     return "RandomLevelSource";
/* 414:    */   }
/* 415:    */   
/* 416:    */   public List<SpawnListEntry> getSpawnList(EnumCreatureType paramxp, BlockPosition paramdt)
/* 417:    */   {
/* 418:534 */     arm localarm = this.m.b(paramdt);
/* 419:535 */     if (this.n)
/* 420:    */     {
/* 421:536 */       if ((paramxp == EnumCreatureType.MONSTER) && (this.y.a(paramdt))) {
/* 422:537 */         return this.y.b();
/* 423:    */       }
/* 424:538 */       if ((paramxp == EnumCreatureType.MONSTER) && (this.r.y) && (this.A.a(this.m, paramdt))) {
/* 425:539 */         return this.A.b();
/* 426:    */       }
/* 427:    */     }
/* 428:542 */     return localarm.a(paramxp);
/* 429:    */   }
/* 430:    */   
/* 431:    */   public BlockPosition a(World paramaqu, String paramString, BlockPosition paramdt)
/* 432:    */   {
/* 433:547 */     if (("Stronghold".equals(paramString)) && (this.v != null)) {
/* 434:548 */       return this.v.b(paramaqu, paramdt);
/* 435:    */     }
/* 436:550 */     return null;
/* 437:    */   }
/* 438:    */   
/* 439:    */   public int g()
/* 440:    */   {
/* 441:555 */     return 0;
/* 442:    */   }
/* 443:    */   
/* 444:    */   public void a(Chunk parambfh, int paramInt1, int paramInt2)
/* 445:    */   {
/* 446:560 */     if ((this.r.w) && (this.n)) {
/* 447:561 */       this.x.a(this, this.m, paramInt1, paramInt2, null);
/* 448:    */     }
/* 449:563 */     if ((this.r.v) && (this.n)) {
/* 450:564 */       this.w.a(this, this.m, paramInt1, paramInt2, null);
/* 451:    */     }
/* 452:566 */     if ((this.r.u) && (this.n)) {
/* 453:567 */       this.v.a(this, this.m, paramInt1, paramInt2, null);
/* 454:    */     }
/* 455:569 */     if ((this.r.x) && (this.n)) {
/* 456:570 */       this.y.a(this, this.m, paramInt1, paramInt2, null);
/* 457:    */     }
/* 458:572 */     if ((this.r.y) && (this.n)) {
/* 459:573 */       this.A.a(this, this.m, paramInt1, paramInt2, null);
/* 460:    */     }
/* 461:    */   }
/* 462:    */   
/* 463:    */   public Chunk getChunk(BlockPosition paramdt)
/* 464:    */   {
/* 465:579 */     return getChunk(paramdt.getX() >> 4, paramdt.getZ() >> 4);
/* 466:    */   }
/* 467:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bgv
 * JD-Core Version:    0.7.0.1
 */
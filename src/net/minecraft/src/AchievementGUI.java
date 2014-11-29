package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ import org.lwjgl.input.Mouse;
/*   4:    */ 
/*   5:    */ public class AchievementGUI
/*   6:    */   extends bxf
/*   7:    */   implements byd
/*   8:    */ {
/*   9: 41 */   private static final int y = AchievementList.a * 24 - 112;
/*  10: 42 */   private static final int z = AchievementList.b * 24 - 112;
/*  11: 43 */   private static final int A = AchievementList.c * 24 - 77;
/*  12: 44 */   private static final int B = AchievementList.d * 24 - 77;
/*  13: 47 */   private static final oa C = new oa("textures/gui/achievement/achievement_background.png");
/*  14:    */   protected bxf a;
/*  15: 52 */   protected int f = 256;
/*  16: 53 */   protected int g = 202;
/*  17:    */   protected int h;
/*  18:    */   protected int i;
/*  19: 56 */   protected float r = 1.0F;
/*  20:    */   protected double s;
/*  21:    */   protected double t;
/*  22:    */   protected double u;
/*  23:    */   protected double v;
/*  24:    */   protected double w;
/*  25:    */   protected double x;
/*  26:    */   private int D;
/*  27:    */   private tz E;
/*  28: 65 */   private boolean F = true;
/*  29:    */   
/*  30:    */   public AchievementGUI(bxf parambxf, tz paramtz)
/*  31:    */   {
/*  32: 68 */     this.a = parambxf;
/*  33: 69 */     this.E = paramtz;
/*  34: 70 */     int j = 141;
/*  35: 71 */     int k = 141;
/*  36:    */     
/*  37: 73 */     this.s = (this.u = this.w = AchievementList.f.a * 24 - j / 2 - 12);
/*  38: 74 */     this.t = (this.v = this.x = AchievementList.f.b * 24 - k / 2);
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void b()
/*  42:    */   {
/*  43: 79 */     this.j.t().a(new lv(lw.REQUEST_STATS));
/*  44: 80 */     this.n.clear();
/*  45: 81 */     this.n.add(new buw(1, this.l / 2 + 24, this.m / 2 + 74, 80, 20, cwc.a("gui.done", new Object[0])));
/*  46:    */   }
/*  47:    */   
/*  48:    */   protected void a(bug parambug)
/*  49:    */   {
/*  50: 86 */     if (this.F) {
/*  51: 87 */       return;
/*  52:    */     }
/*  53: 89 */     if (parambug.k == 1) {
/*  54: 90 */       this.j.a(this.a);
/*  55:    */     }
/*  56:    */   }
/*  57:    */   
/*  58:    */   protected void a(char paramChar, int paramInt)
/*  59:    */   {
/*  60: 96 */     if (paramInt == this.j.t.aa.i())
/*  61:    */     {
/*  62: 97 */       this.j.a((bxf)null);
/*  63: 98 */       this.j.n();
/*  64:    */     }
/*  65:    */     else
/*  66:    */     {
/*  67:100 */       super.a(paramChar, paramInt);
/*  68:    */     }
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*  72:    */   {
/*  73:106 */     if (this.F)
/*  74:    */     {
/*  75:107 */       c();
/*  76:108 */       a(this.q, cwc.a("multiplayer.downloadingStats", new Object[0]), this.l / 2, this.m / 2, 16777215);
/*  77:109 */       a(this.q, c_[((int)(bsu.I() / 150L % c_.length))], this.l / 2, this.m / 2 + this.q.a * 2, 16777215);
/*  78:    */     }
/*  79:    */     else
/*  80:    */     {
/*  81:111 */       if (Mouse.isButtonDown(0))
/*  82:    */       {
/*  83:112 */         int j = (this.l - this.f) / 2;
/*  84:113 */         int k = (this.m - this.g) / 2;
/*  85:    */         
/*  86:115 */         int m = j + 8;
/*  87:116 */         int n = k + 17;
/*  88:118 */         if (((this.D == 0) || (this.D == 1)) && 
/*  89:119 */           (paramInt1 >= m) && (paramInt1 < m + 224) && (paramInt2 >= n) && (paramInt2 < n + 155))
/*  90:    */         {
/*  91:120 */           if (this.D == 0)
/*  92:    */           {
/*  93:121 */             this.D = 1;
/*  94:    */           }
/*  95:    */           else
/*  96:    */           {
/*  97:123 */             this.u -= (paramInt1 - this.h) * this.r;
/*  98:124 */             this.v -= (paramInt2 - this.i) * this.r;
/*  99:125 */             this.w = (this.s = this.u);
/* 100:126 */             this.x = (this.t = this.v);
/* 101:    */           }
/* 102:128 */           this.h = paramInt1;
/* 103:129 */           this.i = paramInt2;
/* 104:    */         }
/* 105:    */       }
/* 106:    */       else
/* 107:    */       {
/* 108:133 */         this.D = 0;
/* 109:    */       }
/* 110:136 */       int j = Mouse.getDWheel();
/* 111:137 */       float f1 = this.r;
/* 112:138 */       if (j < 0) {
/* 113:139 */         this.r += 0.25F;
/* 114:140 */       } else if (j > 0) {
/* 115:141 */         this.r -= 0.25F;
/* 116:    */       }
/* 117:144 */       this.r = MathUtils.clamp(this.r, 1.0F, 2.0F);
/* 118:146 */       if (this.r != f1)
/* 119:    */       {
/* 120:147 */         float f2 = f1 - this.r;
/* 121:148 */         float f3 = f1 * this.f;
/* 122:149 */         float f4 = f1 * this.g;
/* 123:150 */         float f5 = this.r * this.f;
/* 124:151 */         float f6 = this.r * this.g;
/* 125:152 */         this.u -= (f5 - f3) * 0.5F;
/* 126:153 */         this.v -= (f6 - f4) * 0.5F;
/* 127:154 */         this.w = (this.s = this.u);
/* 128:155 */         this.x = (this.t = this.v);
/* 129:    */       }
/* 130:159 */       if (this.w < y) {
/* 131:160 */         this.w = y;
/* 132:    */       }
/* 133:162 */       if (this.x < z) {
/* 134:163 */         this.x = z;
/* 135:    */       }
/* 136:165 */       if (this.w >= A) {
/* 137:166 */         this.w = (A - 1);
/* 138:    */       }
/* 139:168 */       if (this.x >= B) {
/* 140:169 */         this.x = (B - 1);
/* 141:    */       }
/* 142:172 */       c();
/* 143:173 */       b(paramInt1, paramInt2, paramFloat);
/* 144:    */       
/* 145:175 */       cjm.disableLighting();
/* 146:176 */       cjm.i();
/* 147:    */       
/* 148:178 */       f();
/* 149:    */       
/* 150:180 */       cjm.enableLighting();
/* 151:181 */       cjm.j();
/* 152:    */     }
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void a()
/* 156:    */   {
/* 157:187 */     if (this.F) {
/* 158:188 */       this.F = false;
/* 159:    */     }
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void e()
/* 163:    */   {
/* 164:194 */     if (this.F) {
/* 165:195 */       return;
/* 166:    */     }
/* 167:197 */     this.s = this.u;
/* 168:198 */     this.t = this.v;
/* 169:    */     
/* 170:200 */     double d1 = this.w - this.u;
/* 171:201 */     double d2 = this.x - this.v;
/* 172:202 */     if (d1 * d1 + d2 * d2 < 4.0D)
/* 173:    */     {
/* 174:203 */       this.u += d1;
/* 175:204 */       this.v += d2;
/* 176:    */     }
/* 177:    */     else
/* 178:    */     {
/* 179:206 */       this.u += d1 * 0.85D;
/* 180:207 */       this.v += d2 * 0.85D;
/* 181:    */     }
/* 182:    */   }
/* 183:    */   
/* 184:    */   protected void f()
/* 185:    */   {
/* 186:212 */     int j = (this.l - this.f) / 2;
/* 187:213 */     int k = (this.m - this.g) / 2;
/* 188:214 */     this.q.a(cwc.a("gui.achievements", new Object[0]), j + 15, k + 5, 4210752);
/* 189:    */   }
/* 190:    */   
/* 191:    */   protected void b(int paramInt1, int paramInt2, float paramFloat)
/* 192:    */   {
/* 193:218 */     int j = MathUtils.floor(this.s + (this.u - this.s) * paramFloat);
/* 194:219 */     int k = MathUtils.floor(this.t + (this.v - this.t) * paramFloat);
/* 195:221 */     if (j < y) {
/* 196:222 */       j = y;
/* 197:    */     }
/* 198:224 */     if (k < z) {
/* 199:225 */       k = z;
/* 200:    */     }
/* 201:227 */     if (j >= A) {
/* 202:228 */       j = A - 1;
/* 203:    */     }
/* 204:230 */     if (k >= B) {
/* 205:231 */       k = B - 1;
/* 206:    */     }
/* 207:234 */     int m = (this.l - this.f) / 2;
/* 208:235 */     int n = (this.m - this.g) / 2;
/* 209:    */     
/* 210:237 */     int i1 = m + 16;
/* 211:238 */     int i2 = n + 17;
/* 212:    */     
/* 213:240 */     this.e = 0.0F;
/* 214:241 */     cjm.c(518);
/* 215:242 */     cjm.glPushMatrix();
/* 216:243 */     cjm.glTranslatef(i1, i2, -200.0F);
/* 217:244 */     cjm.glScalef(1.0F / this.r, 1.0F / this.r, 0.0F);
/* 218:    */     
/* 219:246 */     cjm.w();
/* 220:247 */     cjm.disableLighting();
/* 221:248 */     cjm.B();
/* 222:249 */     cjm.g();
/* 223:    */     
/* 224:251 */     int i3 = j + 288 >> 4;
/* 225:252 */     int i4 = k + 288 >> 4;
/* 226:253 */     int i5 = (j + 288) % 16;
/* 227:254 */     int i6 = (k + 288) % 16;
/* 228:    */     
/* 229:256 */     //int i7 = 4;
/* 230:257 */     //int i8 = 8;
/* 231:258 */     //int i9 = 10;
/* 232:259 */     //int i10 = 22;
/* 233:260 */     //int i11 = 37;
/* 234:    */     
/* 235:262 */     Random random = new Random();
/* 236:263 */     float f1 = 16.0F / this.r;
/* 237:264 */     float f2 = 16.0F / this.r;
/* 238:    */     int i13;
/* 239:266 */     for (int i12 = 0; i12 * f1 - i6 < 155.0F; i12++)
/* 240:    */     {
/* 241:267 */       float f3 = 0.6F - (i4 + i12) / 25.0F * 0.3F;
/* 242:268 */       cjm.c(f3, f3, f3, 1.0F);
/* 243:270 */       for (i13 = 0; i13 * f2 - i5 < 224.0F; i13++)
/* 244:    */       {
/* 245:271 */         random.setSeed(this.j.K().b().hashCode() + (i3 + i13) + (i4 + i12) * 16);
/* 246:272 */         int i14 = random.nextInt(1 + i4 + i12) + (i4 + i12) / 2;
/* 247:273 */         cue localcue = a(BlockList.sand);
/* 248:275 */         if ((i14 > 37) || (i4 + i12 == 35))
/* 249:    */         {
/* 250:276 */           BlockType localatr = BlockList.bedrock;
/* 251:277 */           localcue = a(localatr);
/* 252:    */         }
/* 253:278 */         else if (i14 == 22)
/* 254:    */         {
/* 255:279 */           if (random.nextInt(2) == 0) {
/* 256:280 */             localcue = a(BlockList.diamondOre);
/* 257:    */           } else {
/* 258:282 */             localcue = a(BlockList.redstoneOre);
/* 259:    */           }
/* 260:    */         }
/* 261:284 */         else if (i14 == 10)
/* 262:    */         {
/* 263:285 */           localcue = a(BlockList.ironOre);
/* 264:    */         }
/* 265:286 */         else if (i14 == 8)
/* 266:    */         {
/* 267:287 */           localcue = a(BlockList.coalOre);
/* 268:    */         }
/* 269:288 */         else if (i14 > 4)
/* 270:    */         {
/* 271:289 */           localcue = a(BlockList.stone);
/* 272:    */         }
/* 273:290 */         else if (i14 > 0)
/* 274:    */         {
/* 275:291 */           localcue = a(BlockList.dirt);
/* 276:    */         }
/* 277:294 */         this.j.N().a(cua.g);
/* 278:    */         
/* 279:296 */         a(i13 * 16 - i5, i12 * 16 - i6, localcue, 16, 16);
/* 280:    */       }
/* 281:    */     }
/* 282:300 */     cjm.j();
/* 283:301 */     cjm.c(515);
/* 284:302 */     this.j.N().a(C);
/* 285:    */     int i16;
/* 286:    */     int i21;
/* 287:304 */     for (int i12 = 0; i12 < AchievementList.e.size(); i12++)
/* 288:    */     {
/* 289:305 */       tk localtk = (tk)AchievementList.e.get(i12);
/* 290:306 */       if (localtk.c != null)
/* 291:    */       {
/* 292:310 */         i13 = localtk.a * 24 - j + 11;
/* 293:311 */         int i14 = localtk.b * 24 - k + 11;
/* 294:    */         
/* 295:313 */         int i15 = localtk.c.a * 24 - j + 11;
/* 296:314 */         i16 = localtk.c.b * 24 - k + 11;
/* 297:    */         
/* 298:316 */         boolean bool1 = this.E.a(localtk);
/* 299:317 */         boolean bool2 = this.E.b(localtk);
/* 300:318 */         int i19 = this.E.c(localtk);
/* 301:320 */         if (i19 <= 4)
/* 302:    */         {
/* 303:324 */           i21 = -16777216;
/* 304:325 */           if (bool1) {
/* 305:326 */             i21 = -6250336;
/* 306:327 */           } else if (bool2) {
/* 307:328 */             i21 = -16711936;
/* 308:    */           }
/* 309:337 */           a(i13, i15, i14, i21);
/* 310:338 */           b(i15, i14, i16, i21);
/* 311:340 */           if (i13 > i15) {
/* 312:342 */             b(i13 - 11 - 7, i14 - 5, 114, 234, 7, 11);
/* 313:343 */           } else if (i13 < i15) {
/* 314:345 */             b(i13 + 11, i14 - 5, 107, 234, 7, 11);
/* 315:346 */           } else if (i14 > i16) {
/* 316:348 */             b(i13 - 5, i14 - 11 - 7, 96, 234, 11, 7);
/* 317:349 */           } else if (i14 < i16) {
/* 318:351 */             b(i13 - 5, i14 + 11, 96, 241, 11, 7);
/* 319:    */           }
/* 320:    */         }
/* 321:    */       }
/* 322:    */     }
/* 323:355 */     tk localObject1 = null;
/* 324:356 */     float f4 = (paramInt1 - i1) * this.r;
/* 325:357 */     float f5 = (paramInt2 - i2) * this.r;
/* 326:    */     
/* 327:359 */     bss.c();
/* 328:360 */     cjm.disableLighting();
/* 329:361 */     cjm.B();
/* 330:362 */     cjm.g();
/* 331:    */     tk localObject2;
/* 332:    */     int i17;
/* 333:    */     int i18;
/* 334:364 */     for (int i14 = 0; i14 < AchievementList.e.size(); i14++)
/* 335:    */     {
/* 336:365 */       localObject2 = (tk)AchievementList.e.get(i14);
/* 337:    */       
/* 338:367 */       i16 = ((tk)localObject2).a * 24 - j;
/* 339:368 */       i17 = ((tk)localObject2).b * 24 - k;
/* 340:370 */       if ((i16 >= -24) && (i17 >= -24) && (i16 <= 224.0F * this.r) && (i17 <= 155.0F * this.r))
/* 341:    */       {
/* 342:371 */         i18 = this.E.c((tk)localObject2);
/* 343:    */         float f6;
/* 344:373 */         if (this.E.a((tk)localObject2))
/* 345:    */         {
/* 346:374 */           f6 = 0.75F;
/* 347:375 */           cjm.c(f6, f6, f6, 1.0F);
/* 348:    */         }
/* 349:376 */         else if (this.E.b((tk)localObject2))
/* 350:    */         {
/* 351:377 */           f6 = 1.0F;
/* 352:378 */           cjm.c(f6, f6, f6, 1.0F);
/* 353:    */         }
/* 354:379 */         else if (i18 < 3)
/* 355:    */         {
/* 356:380 */           f6 = 0.3F;
/* 357:381 */           cjm.c(f6, f6, f6, 1.0F);
/* 358:    */         }
/* 359:382 */         else if (i18 == 3)
/* 360:    */         {
/* 361:383 */           f6 = 0.2F;
/* 362:384 */           cjm.c(f6, f6, f6, 1.0F);
/* 363:    */         }
/* 364:    */         else
/* 365:    */         {
/* 366:385 */           if (i18 != 4) {
/* 367:    */             continue;
/* 368:    */           }
/* 369:386 */           f6 = 0.1F;
/* 370:387 */           cjm.c(f6, f6, f6, 1.0F);
/* 371:    */         }
/* 372:398 */         this.j.N().a(C);
/* 373:400 */         if (((tk)localObject2).g()) {
/* 374:401 */           b(i16 - 2, i17 - 2, 26, 202, 26, 26);
/* 375:    */         } else {
/* 376:403 */           b(i16 - 2, i17 - 2, 0, 202, 26, 26);
/* 377:    */         }
/* 378:406 */         if (!this.E.b((tk)localObject2))
/* 379:    */         {
/* 380:407 */           f6 = 0.1F;
/* 381:408 */           cjm.c(f6, f6, f6, 1.0F);
/* 382:409 */           this.k.a(false);
/* 383:    */         }
/* 384:418 */         cjm.enableLighting();
/* 385:419 */         cjm.o();
/* 386:420 */         this.k.b(((tk)localObject2).d, i16 + 3, i17 + 3);
/* 387:421 */         cjm.glBlendFunc(770, 771);
/* 388:422 */         cjm.disableLighting();
/* 389:423 */         if (!this.E.b((tk)localObject2)) {
/* 390:424 */           this.k.a(true);
/* 391:    */         }
/* 392:426 */         cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 393:428 */         if ((f4 >= i16) && (f4 <= i16 + 22) && (f5 >= i17) && (f5 <= i17 + 22)) {
/* 394:429 */           localObject1 = localObject2;
/* 395:    */         }
/* 396:    */       }
/* 397:    */     }
/* 398:434 */     cjm.i();
/* 399:435 */     cjm.enableBlend();
/* 400:    */     
/* 401:437 */     cjm.glPopMatrix();
/* 402:438 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 403:439 */     this.j.N().a(C);
/* 404:440 */     b(m, n, 0, 0, this.f, this.g);
/* 405:    */     
/* 406:442 */     this.e = 0.0F;
/* 407:443 */     cjm.c(515);
/* 408:    */     
/* 409:445 */     cjm.i();
/* 410:446 */     cjm.w();
/* 411:447 */     super.a(paramInt1, paramInt2, paramFloat);
/* 412:453 */     if (localObject1 != null)
/* 413:    */     {
/* 414:454 */       String str1 = localObject1.e().c();
/* 415:455 */       String localObject21 = localObject1.f();
/* 416:    */       
/* 417:457 */       i16 = paramInt1 + 12;
/* 418:458 */       i17 = paramInt2 - 4;
/* 419:459 */       i18 = this.E.c(localObject1);
/* 420:    */       int i20;
/* 421:461 */       if (this.E.b(localObject1))
/* 422:    */       {
/* 423:462 */         i20 = Math.max(this.q.a(str1), 120);
/* 424:463 */         i21 = this.q.b((String)localObject21, i20);
/* 425:464 */         if (this.E.a(localObject1)) {
/* 426:465 */           i21 += 12;
/* 427:    */         }
/* 428:467 */         a(i16 - 3, i17 - 3, i16 + i20 + 3, i17 + i21 + 3 + 12, -1073741824, -1073741824);
/* 429:    */         
/* 430:469 */         this.q.a((String)localObject21, i16, i17 + 12, i20, -6250336);
/* 431:470 */         if (this.E.a(localObject1)) {
/* 432:471 */           this.q.a(cwc.a("achievement.taken", new Object[0]), i16, i17 + i21 + 4, -7302913);
/* 433:    */         }
/* 434:    */       }
/* 435:    */       else
/* 436:    */       {
/* 437:    */         String str2;
/* 438:    */         int i22;
/* 439:473 */         if (i18 == 3)
/* 440:    */         {
/* 441:474 */           str1 = cwc.a("achievement.unknown", new Object[0]);
/* 442:475 */           i20 = Math.max(this.q.a(str1), 120);
/* 443:476 */           str2 = new hz("achievement.requires", new Object[] { localObject1.c.e() }).c();
/* 444:477 */           i22 = this.q.b(str2, i20);
/* 445:478 */           a(i16 - 3, i17 - 3, i16 + i20 + 3, i17 + i22 + 12 + 3, -1073741824, -1073741824);
/* 446:479 */           this.q.a(str2, i16, i17 + 12, i20, -9416624);
/* 447:    */         }
/* 448:480 */         else if (i18 < 3)
/* 449:    */         {
/* 450:481 */           i20 = Math.max(this.q.a(str1), 120);
/* 451:482 */           str2 = new hz("achievement.requires", new Object[] { localObject1.c.e() }).c();
/* 452:483 */           i22 = this.q.b(str2, i20);
/* 453:484 */           a(i16 - 3, i17 - 3, i16 + i20 + 3, i17 + i22 + 12 + 3, -1073741824, -1073741824);
/* 454:485 */           this.q.a(str2, i16, i17 + 12, i20, -9416624);
/* 455:    */         }
/* 456:    */         else
/* 457:    */         {
/* 458:487 */           str1 = null;
/* 459:    */         }
/* 460:    */       }
/* 461:490 */       if (str1 != null) {
/* 462:491 */         this.q.a(str1, i16, i17, localObject1.g() ? -8355776 : this.E.b(localObject1) ? -1 : localObject1.g() ? -128 : -8355712);
/* 463:    */       }
/* 464:    */     }
/* 465:496 */     cjm.j();
/* 466:497 */     cjm.enableLighting();
/* 467:498 */     bss.a();
/* 468:    */   }
/* 469:    */   
/* 470:    */   private cue a(BlockType paramatr)
/* 471:    */   {
/* 472:502 */     return bsu.z().ab().a().a(paramatr.instance());
/* 473:    */   }
/* 474:    */   
/* 475:    */   public boolean d()
/* 476:    */   {
/* 477:507 */     return !this.F;
/* 478:    */   }
/* 479:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxu
 * JD-Core Version:    0.7.0.1
 */
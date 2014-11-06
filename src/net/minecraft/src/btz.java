package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Iterables;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import java.awt.Color;
/*   4:    */ import java.util.ArrayList;
/*   5:    */ import java.util.Collection;
/*   6:    */ import java.util.List;
/*   7:    */ import java.util.Random;
/*   8:    */ 
/*   9:    */ public class btz
/*  10:    */   extends bub
/*  11:    */ {
/*  12: 56 */   private static final oa f = new oa("textures/misc/vignette.png");
/*  13: 57 */   private static final oa g = new oa("textures/gui/widgets.png");
/*  14: 58 */   private static final oa h = new oa("textures/misc/pumpkinblur.png");
/*  15: 63 */   private final Random i = new Random();
/*  16:    */   private final bsu j;
/*  17:    */   private final cqh k;
/*  18:    */   private final buh l;
/*  19:    */   private final bvm m;
/*  20:    */   private int n;
/*  21: 70 */   private String o = "";
/*  22:    */   private int p;
/*  23:    */   private boolean q;
/*  24: 73 */   public float a = 1.0F;
/*  25:    */   private int r;
/*  26:    */   private ItemStack s;
/*  27:    */   private final buj t;
/*  28:    */   private final bvo u;
/*  29:    */   private final bvh v;
/*  30:    */   private int w;
/*  31: 82 */   private String x = "";
/*  32: 83 */   private String y = "";
/*  33:    */   private int z;
/*  34:    */   private int A;
/*  35:    */   private int B;
/*  36: 87 */   private int C = 0;
/*  37: 88 */   private int D = 0;
/*  38: 89 */   private long E = 0L;
/*  39: 90 */   private long F = 0L;
/*  40:    */   
/*  41:    */   public btz(bsu parambsu)
/*  42:    */   {
/*  43: 93 */     this.j = parambsu;
/*  44: 94 */     this.k = parambsu.af();
/*  45: 95 */     this.t = new buj(parambsu);
/*  46: 96 */     this.u = new bvo(parambsu);
/*  47: 97 */     this.l = new buh(parambsu);
/*  48: 98 */     this.m = new bvm(parambsu);
/*  49: 99 */     this.v = new bvh(parambsu, this);
/*  50:    */     
/*  51:101 */     a();
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void a()
/*  55:    */   {
/*  56:105 */     this.z = 10;
/*  57:106 */     this.A = 70;
/*  58:107 */     this.B = 20;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void a(float paramFloat)
/*  62:    */   {
/*  63:111 */     buf localbuf = new buf(this.j, this.j.d, this.j.e);
/*  64:112 */     int i1 = localbuf.a();
/*  65:113 */     int i2 = localbuf.b();
/*  66:    */     
/*  67:115 */     this.j.o.j();
/*  68:    */     
/*  69:117 */     cjm.enableBlend();
/*  70:119 */     if (bsu.v()) {
/*  71:120 */       a(this.j.h.c(paramFloat), localbuf);
/*  72:    */     } else {
/*  73:123 */       cjm.glBlendFuncSeparate(770, 771, 1, 0);
/*  74:    */     }
/*  75:127 */     ItemStack localamj = this.j.h.bg.e(3);
/*  76:128 */     if ((this.j.t.ax == 0) && (localamj != null) && (localamj.getItem() == Item.fromProtoBlock(BlockList.pumpkin))) {
/*  77:129 */       e(localbuf);
/*  78:    */     }
/*  79:132 */     if (!this.j.h.a(Potion.k))
/*  80:    */     {
/*  81:133 */       float f1 = this.j.h.bG + (this.j.h.bF - this.j.h.bG) * paramFloat;
/*  82:134 */       if (f1 > 0.0F) {
/*  83:135 */         b(f1, localbuf);
/*  84:    */       }
/*  85:    */     }
/*  86:139 */     if (this.j.c.a()) {
/*  87:140 */       this.u.a(localbuf, paramFloat);
/*  88:    */     } else {
/*  89:142 */       a(localbuf, paramFloat);
/*  90:    */     }
/*  91:145 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  92:146 */     this.j.N().a(d);
/*  93:147 */     cjm.enableBlend();
/*  94:149 */     if (b())
/*  95:    */     {
/*  96:151 */       cjm.glBlendFuncSeparate(775, 769, 1, 0);
/*  97:152 */       cjm.enableAlphaTest();
/*  98:153 */       b(i1 / 2 - 7, i2 / 2 - 7, 0, 0, 16, 16);
/*  99:    */     }
/* 100:156 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 101:157 */     this.j.y.a("bossHealth");
/* 102:158 */     i();
/* 103:159 */     this.j.y.b();
/* 104:161 */     if (this.j.c.b()) {
/* 105:162 */       d(localbuf);
/* 106:    */     }
/* 107:165 */     cjm.disableBlend();
/* 108:    */     float f2;
/* 109:    */     int i4;
/* 110:168 */     if (this.j.h.cf() > 0)
/* 111:    */     {
/* 112:169 */       this.j.y.a("sleep");
/* 113:170 */       cjm.i();
/* 114:171 */       cjm.disableAlphaTest();
/* 115:    */       
/* 116:173 */       int i3 = this.j.h.cf();
/* 117:174 */       f2 = i3 / 100.0F;
/* 118:175 */       if (f2 > 1.0F) {
/* 119:177 */         f2 = 1.0F - (i3 - 100) / 10.0F;
/* 120:    */       }
/* 121:180 */       i4 = (int)(220.0F * f2) << 24 | 0x101020;
/* 122:181 */       a(0, 0, i1, i2, i4);
/* 123:182 */       cjm.enableAlphaTest();
/* 124:183 */       cjm.j();
/* 125:184 */       this.j.y.b();
/* 126:    */     }
/* 127:187 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 128:188 */     int i3 = i1 / 2 - 91;
/* 129:190 */     if (this.j.h.y()) {
/* 130:191 */       a(localbuf, i3);
/* 131:193 */     } else if (this.j.c.f()) {
/* 132:195 */       b(localbuf, i3);
/* 133:    */     }
/* 134:198 */     if ((this.j.t.C) && (!this.j.c.a())) {
/* 135:199 */       a(localbuf);
/* 136:200 */     } else if (this.j.h.v()) {
/* 137:201 */       this.u.a(localbuf);
/* 138:    */     }
/* 139:204 */     if (this.j.s()) {
/* 140:205 */       b(localbuf);
/* 141:    */     }
/* 142:208 */     if (this.j.t.ay) {
/* 143:209 */       this.t.a(localbuf);
/* 144:    */     }
/* 145:212 */     if (this.p > 0)
/* 146:    */     {
/* 147:213 */       this.j.y.a("overlayMessage");
/* 148:214 */       f2 = this.p - paramFloat;
/* 149:215 */       i4 = (int)(f2 * 255.0F / 20.0F);
/* 150:216 */       if (i4 > 255) {
/* 151:217 */         i4 = 255;
/* 152:    */       }
/* 153:219 */       if (i4 > 8)
/* 154:    */       {
/* 155:220 */         cjm.glPushMatrix();
/* 156:221 */         cjm.glTranslatef(i1 / 2, i2 - 68, 0.0F);
/* 157:222 */         cjm.enableBlend();
/* 158:223 */         cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 159:    */         
/* 160:225 */         int i5 = 16777215;
/* 161:226 */         if (this.q) {
/* 162:227 */           i5 = Color.HSBtoRGB(f2 / 50.0F, 0.7F, 0.6F) & 0xFFFFFF;
/* 163:    */         }
/* 164:229 */         f().a(this.o, -f().a(this.o) / 2, -4, i5 + (i4 << 24 & 0xFF000000));
/* 165:230 */         cjm.disableBlend();
/* 166:231 */         cjm.glPopMatrix();
/* 167:    */       }
/* 168:233 */       this.j.y.b();
/* 169:    */     }
/* 170:236 */     if (this.w > 0)
/* 171:    */     {
/* 172:237 */       this.j.y.a("titleAndSubtitle");
/* 173:238 */       f2 = this.w - paramFloat;
/* 174:239 */       i4 = 255;
/* 175:    */       float f3;
/* 176:240 */       if (this.w > this.B + this.A)
/* 177:    */       {
/* 178:241 */         f3 = this.z + this.A + this.B - f2;
/* 179:242 */         i4 = (int)(f3 * 255.0F / this.z);
/* 180:    */       }
/* 181:244 */       if (this.w <= this.B)
/* 182:    */       {
/* 183:245 */         f3 = f2;
/* 184:246 */         i4 = (int)(f3 * 255.0F / this.B);
/* 185:    */       }
/* 186:248 */       i4 = MathUtils.clamp(i4, 0, 255);
/* 187:249 */       if (i4 > 8)
/* 188:    */       {
/* 189:250 */         cjm.glPushMatrix();
/* 190:251 */         cjm.glTranslatef(i1 / 2, i2 / 2, 0.0F);
/* 191:252 */         cjm.enableBlend();
/* 192:253 */         cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 193:    */         
/* 194:255 */         cjm.glPushMatrix();
/* 195:256 */         cjm.glScalef(4.0F, 4.0F, 4.0F);
/* 196:257 */         int i6 = i4 << 24 & 0xFF000000;
/* 197:258 */         f().a(this.x, -f().a(this.x) / 2, -10.0F, 0xFFFFFF | i6, true);
/* 198:259 */         cjm.glPopMatrix();
/* 199:260 */         cjm.glPushMatrix();
/* 200:261 */         cjm.glScalef(2.0F, 2.0F, 2.0F);
/* 201:262 */         f().a(this.y, -f().a(this.y) / 2, 5.0F, 0xFFFFFF | i6, true);
/* 202:263 */         cjm.glPopMatrix();
/* 203:264 */         cjm.disableBlend();
/* 204:265 */         cjm.glPopMatrix();
/* 205:    */       }
/* 206:267 */       this.j.y.b();
/* 207:    */     }
/* 208:270 */     bsd localbsd = this.j.f.Z();
/* 209:271 */     bry localbry1 = null;
/* 210:272 */     brz localbrz = localbsd.h(this.j.h.getName());
/* 211:273 */     if (localbrz != null)
/* 212:    */     {
/* 213:274 */       int i7 = localbrz.l().b();
/* 214:275 */       if (i7 >= 0) {
/* 215:276 */         localbry1 = localbsd.a(3 + i7);
/* 216:    */       }
/* 217:    */     }
/* 218:279 */     bry localbry2 = localbry1 != null ? localbry1 : localbsd.a(1);
/* 219:280 */     if (localbry2 != null) {
/* 220:281 */       a(localbry2, localbuf);
/* 221:    */     }
/* 222:284 */     cjm.enableBlend();
/* 223:285 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 224:286 */     cjm.disableAlphaTest();
/* 225:    */     
/* 226:288 */     cjm.glPushMatrix();
/* 227:289 */     cjm.glTranslatef(0.0F, i2 - 48, 0.0F);
/* 228:    */     
/* 229:291 */     this.j.y.a("chat");
/* 230:292 */     this.l.a(this.n);
/* 231:293 */     this.j.y.b();
/* 232:    */     
/* 233:295 */     cjm.glPopMatrix();
/* 234:    */     
/* 235:297 */     localbry2 = localbsd.a(0);
/* 236:298 */     if ((this.j.t.ah.d()) && ((!this.j.D()) || (this.j.h.a.d().size() > 1) || (localbry2 != null)))
/* 237:    */     {
/* 238:299 */       this.v.a(true);
/* 239:300 */       this.v.a(i1, localbsd, localbry2);
/* 240:    */     }
/* 241:    */     else
/* 242:    */     {
/* 243:302 */       this.v.a(false);
/* 244:    */     }
/* 245:305 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 246:306 */     cjm.disableLighting();
/* 247:307 */     cjm.enableAlphaTest();
/* 248:    */   }
/* 249:    */   
/* 250:    */   protected void a(buf parambuf, float paramFloat)
/* 251:    */   {
/* 252:311 */     if (!(this.j.aa() instanceof EntityPlayer)) {
/* 253:312 */       return;
/* 254:    */     }
/* 255:315 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 256:316 */     this.j.N().a(g);
/* 257:    */     
/* 258:318 */     EntityPlayer localahd = (EntityPlayer)this.j.aa();
/* 259:319 */     int i1 = parambuf.a() / 2;
/* 260:320 */     float f1 = this.e;
/* 261:321 */     this.e = -90.0F;
/* 262:322 */     b(i1 - 91, parambuf.b() - 22, 0, 0, 182, 22);
/* 263:323 */     b(i1 - 91 - 1 + localahd.bg.c * 20, parambuf.b() - 22 - 1, 0, 22, 24, 22);
/* 264:324 */     this.e = f1;
/* 265:    */     
/* 266:326 */     cjm.B();
/* 267:327 */     cjm.enableBlend();
/* 268:328 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 269:329 */     bss.c();
/* 270:331 */     for (int i2 = 0; i2 < 9; i2++)
/* 271:    */     {
/* 272:332 */       int i3 = parambuf.a() / 2 - 90 + i2 * 20 + 2;
/* 273:333 */       int i4 = parambuf.b() - 16 - 3;
/* 274:334 */       a(i2, i3, i4, paramFloat, localahd);
/* 275:    */     }
/* 276:337 */     bss.a();
/* 277:338 */     cjm.C();
/* 278:339 */     cjm.disableBlend();
/* 279:    */   }
/* 280:    */   
/* 281:    */   public void a(buf parambuf, int paramInt)
/* 282:    */   {
/* 283:344 */     this.j.y.a("jumpBar");
/* 284:345 */     this.j.N().a(bub.d);
/* 285:346 */     float f1 = this.j.h.z();
/* 286:347 */     int i1 = 182;
/* 287:    */     
/* 288:349 */     int i2 = (int)(f1 * (i1 + 1));
/* 289:    */     
/* 290:351 */     int i3 = parambuf.b() - 32 + 3;
/* 291:352 */     b(paramInt, i3, 0, 84, i1, 5);
/* 292:353 */     if (i2 > 0) {
/* 293:354 */       b(paramInt, i3, 0, 89, i2, 5);
/* 294:    */     }
/* 295:356 */     this.j.y.b();
/* 296:    */   }
/* 297:    */   
/* 298:    */   public void b(buf parambuf, int paramInt)
/* 299:    */   {
/* 300:360 */     this.j.y.a("expBar");
/* 301:361 */     this.j.N().a(bub.d);
/* 302:362 */     int i1 = this.j.h.cj();
/* 303:    */     int i2;
/* 304:    */     int i4;
/* 305:363 */     if (i1 > 0)
/* 306:    */     {
/* 307:364 */       i2 = 182;
/* 308:    */       
/* 309:366 */       int i3 = (int)(this.j.h.bB * (i2 + 1));
/* 310:    */       
/* 311:368 */       i4 = parambuf.b() - 32 + 3;
/* 312:369 */       b(paramInt, i4, 0, 64, i2, 5);
/* 313:370 */       if (i3 > 0) {
/* 314:371 */         b(paramInt, i4, 0, 69, i3, 5);
/* 315:    */       }
/* 316:    */     }
/* 317:374 */     this.j.y.b();
/* 318:376 */     if (this.j.h.bz > 0)
/* 319:    */     {
/* 320:377 */       this.j.y.a("expLevel");
/* 321:378 */       i2 = 8453920;
/* 322:    */       
/* 323:380 */       String str = "" + this.j.h.bz;
/* 324:381 */       i4 = (parambuf.a() - f().a(str)) / 2;
/* 325:382 */       int i5 = parambuf.b() - 31 - 4;
/* 326:    */       
/* 327:384 */       int i6 = 0;
/* 328:385 */       f().a(str, i4 + 1, i5, 0);
/* 329:386 */       f().a(str, i4 - 1, i5, 0);
/* 330:387 */       f().a(str, i4, i5 + 1, 0);
/* 331:388 */       f().a(str, i4, i5 - 1, 0);
/* 332:389 */       f().a(str, i4, i5, i2);
/* 333:390 */       this.j.y.b();
/* 334:    */     }
/* 335:    */   }
/* 336:    */   
/* 337:    */   public void a(buf parambuf)
/* 338:    */   {
/* 339:395 */     this.j.y.a("toolHighlight");
/* 340:397 */     if ((this.r > 0) && (this.s != null))
/* 341:    */     {
/* 342:398 */       String str = this.s.q();
/* 343:399 */       if (this.s.s()) {
/* 344:400 */         str = net.minecraft.src.a.u + str;
/* 345:    */       }
/* 346:403 */       int i1 = (parambuf.a() - f().a(str)) / 2;
/* 347:404 */       int i2 = parambuf.b() - 59;
/* 348:405 */       if (!this.j.c.b()) {
/* 349:407 */         i2 += 14;
/* 350:    */       }
/* 351:410 */       int i3 = (int)(this.r * 256.0F / 10.0F);
/* 352:411 */       if (i3 > 255) {
/* 353:412 */         i3 = 255;
/* 354:    */       }
/* 355:414 */       if (i3 > 0)
/* 356:    */       {
/* 357:415 */         cjm.glPushMatrix();
/* 358:416 */         cjm.enableBlend();
/* 359:417 */         cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 360:418 */         f().a(str, i1, i2, 16777215 + (i3 << 24));
/* 361:419 */         cjm.disableBlend();
/* 362:420 */         cjm.glPopMatrix();
/* 363:    */       }
/* 364:    */     }
/* 365:424 */     this.j.y.b();
/* 366:    */   }
/* 367:    */   
/* 368:    */   public void b(buf parambuf)
/* 369:    */   {
/* 370:428 */     this.j.y.a("demo");
/* 371:429 */     String str = "";
/* 372:431 */     if (this.j.f.K() >= 120500L) {
/* 373:432 */       str = cwc.a("demo.demoExpired", new Object[0]);
/* 374:    */     } else {
/* 375:434 */       str = cwc.a("demo.remainingTime", new Object[] { vb.a((int)(120500L - this.j.f.K())) });
/* 376:    */     }
/* 377:437 */     int i1 = f().a(str);
/* 378:438 */     f().a(str, parambuf.a() - i1 - 10, 5.0F, 16777215);
/* 379:439 */     this.j.y.b();
/* 380:    */   }
/* 381:    */   
/* 382:    */   protected boolean b()
/* 383:    */   {
/* 384:443 */     if ((this.j.t.ay) && (!this.j.h.cp()) && (!this.j.t.v)) {
/* 385:444 */       return false;
/* 386:    */     }
/* 387:447 */     if (this.j.c.a())
/* 388:    */     {
/* 389:448 */       if (this.j.i != null) {
/* 390:449 */         return true;
/* 391:    */       }
/* 392:450 */       if ((this.j.s != null) && (this.j.s.a == brv.BLOCK))
/* 393:    */       {
/* 394:451 */         BlockPosition localdt = this.j.s.a();
/* 395:452 */         if ((this.j.f.s(localdt) instanceof vq)) {
/* 396:453 */           return true;
/* 397:    */         }
/* 398:    */       }
/* 399:457 */       return false;
/* 400:    */     }
/* 401:460 */     return true;
/* 402:    */   }
/* 403:    */   
/* 404:    */   public void c(buf parambuf)
/* 405:    */   {
/* 406:464 */     this.m.a(parambuf.a() - 10, 10);
/* 407:    */   }
/* 408:    */   
/* 409:    */   private void a(bry parambry, buf parambuf)
/* 410:    */   {
/* 411:468 */     bsd localbsd = parambry.a();
/* 412:469 */     Collection<bsa> localObject = localbsd.i(parambry);
/* 413:470 */     ArrayList localArrayList = Lists.newArrayList(Iterables.filter((Iterable)localObject, new bua(this)));
/* 414:476 */     if (localArrayList.size() > 15) {
/* 415:477 */       localObject = Lists.newArrayList(Iterables.skip(localArrayList, ((Collection)localObject).size() - 15));
/* 416:    */     } else {
/* 417:479 */       localObject = localArrayList;
/* 418:    */     }
/* 419:482 */     int i1 = f().a(parambry.d());
/* 420:483 */     for (bsa localbsa1 : localObject)
/* 421:    */     {
/* 422:484 */       brz localbrz1 = localbsd.h(localbsa1.e());
/* 423:485 */       String str1 = brz.a(localbrz1, localbsa1.e()) + ": " + net.minecraft.src.a.m + localbsa1.c();
/* 424:486 */       i1 = Math.max(i1, f().a(str1));
/* 425:    */     }
/* 426:489 */     int i2 = ((Collection)localObject).size() * f().a;
/* 427:490 */     int i3 = parambuf.b() / 2 + i2 / 3;
/* 428:491 */     int i4 = 3;
/* 429:492 */     int i5 = parambuf.a() - i1 - i4;
/* 430:493 */     int i6 = 0;
/* 431:495 */     for (bsa localbsa2 : localObject)
/* 432:    */     {
/* 433:496 */       i6++;
/* 434:497 */       brz localbrz2 = localbsd.h(localbsa2.e());
/* 435:498 */       String str2 = brz.a(localbrz2, localbsa2.e());
/* 436:499 */       String str3 = net.minecraft.src.a.m + "" + localbsa2.c();
/* 437:500 */       int i7 = i5;
/* 438:501 */       int i8 = i3 - i6 * f().a;
/* 439:502 */       int i9 = parambuf.a() - i4 + 2;
/* 440:    */       
/* 441:504 */       a(i7 - 2, i8, i9, i8 + f().a, 1342177280);
/* 442:505 */       f().a(str2, i7, i8, 553648127);
/* 443:506 */       f().a(str3, i9 - f().a(str3), i8, 553648127);
/* 444:508 */       if (i6 == ((Collection)localObject).size())
/* 445:    */       {
/* 446:509 */         String str4 = parambry.d();
/* 447:510 */         a(i7 - 2, i8 - f().a - 1, i9, i8 - 1, 1610612736);
/* 448:511 */         a(i7 - 2, i8 - 1, i9, i8, 1342177280);
/* 449:512 */         f().a(str4, i7 + i1 / 2 - f().a(str4) / 2, i8 - f().a, 553648127);
/* 450:    */       }
/* 451:    */     }
/* 452:    */   }
/* 453:    */   
/* 454:    */   private void d(buf parambuf)
/* 455:    */   {
/* 456:518 */     if (!(this.j.aa() instanceof EntityPlayer)) {
/* 457:519 */       return;
/* 458:    */     }
/* 459:522 */     EntityPlayer localahd = (EntityPlayer)this.j.aa();
/* 460:523 */     int i1 = MathUtils.ceil(localahd.getHealth());
/* 461:    */     
/* 462:525 */     int i2 = (this.F > this.n) && ((this.F - this.n) / 3L % 2L == 1L) ? 1 : 0;
/* 463:526 */     if ((i1 < this.C) && (localahd.Z > 0))
/* 464:    */     {
/* 465:527 */       this.E = bsu.I();
/* 466:528 */       this.F = (this.n + 20);
/* 467:    */     }
/* 468:529 */     else if ((i1 > this.C) && (localahd.Z > 0))
/* 469:    */     {
/* 470:530 */       this.E = bsu.I();
/* 471:531 */       this.F = (this.n + 10);
/* 472:    */     }
/* 473:533 */     if (bsu.I() - this.E > 1000L)
/* 474:    */     {
/* 475:534 */       this.C = i1;
/* 476:535 */       this.D = i1;
/* 477:536 */       this.E = bsu.I();
/* 478:    */     }
/* 479:538 */     this.C = i1;
/* 480:539 */     int i3 = this.D;
/* 481:540 */     this.i.setSeed(this.n * 312871);
/* 482:    */     
/* 483:542 */     int i4 = 0;
/* 484:543 */     ahz localahz = localahd.ck();
/* 485:544 */     int i5 = localahz.a();
/* 486:545 */     int i6 = localahz.b();
/* 487:546 */     xz localxz = localahd.a(afs.a);
/* 488:    */     
/* 489:548 */     int i7 = parambuf.a() / 2 - 91;
/* 490:549 */     int i8 = parambuf.a() / 2 + 91;
/* 491:    */     
/* 492:551 */     int i9 = parambuf.b() - 39;
/* 493:552 */     float f1 = (float)localxz.e();
/* 494:553 */     float f2 = localahd.bM();
/* 495:554 */     int i10 = MathUtils.ceil((f1 + f2) / 2.0F / 10.0F);
/* 496:555 */     int i11 = Math.max(10 - (i10 - 2), 3);
/* 497:556 */     int i12 = i9 - (i10 - 1) * i11 - 10;
/* 498:557 */     float f3 = f2;
/* 499:    */     
/* 500:559 */     int i13 = localahd.bq();
/* 501:560 */     int i14 = -1;
/* 502:561 */     if (localahd.a(Potion.l)) {
/* 503:562 */       i14 = this.n % MathUtils.ceil(f1 + 5.0F);
/* 504:    */     }
/* 505:566 */     this.j.y.a("armor");
/* 506:    */     int i16;
/* 507:567 */     for (int i15 = 0; i15 < 10; i15++) {
/* 508:568 */       if (i13 > 0)
/* 509:    */       {
/* 510:569 */         i16 = i7 + i15 * 8;
/* 511:570 */         if (i15 * 2 + 1 < i13) {
/* 512:571 */           b(i16, i12, 34, 9, 9, 9);
/* 513:    */         }
/* 514:573 */         if (i15 * 2 + 1 == i13) {
/* 515:574 */           b(i16, i12, 25, 9, 9, 9);
/* 516:    */         }
/* 517:576 */         if (i15 * 2 + 1 > i13) {
/* 518:577 */           b(i16, i12, 16, 9, 9, 9);
/* 519:    */         }
/* 520:    */       }
/* 521:    */     }
/* 522:581 */     this.j.y.c("health");
/* 523:    */     int i18;
/* 524:    */     int i19;
/* 525:    */     int i21;
/* 526:    */     int i22;
/* 527:    */     int i23;
/* 528:582 */     for (int i15 = MathUtils.ceil((f1 + f2) / 2.0F) - 1; i15 >= 0; i15--)
/* 529:    */     {
/* 530:583 */       i16 = 16;
/* 531:584 */       if (localahd.a(Potion.u)) {
/* 532:585 */         i16 += 36;
/* 533:586 */       } else if (localahd.a(Potion.v)) {
/* 534:587 */         i16 += 72;
/* 535:    */       }
/* 536:590 */       i18 = 0;
/* 537:591 */       if (i2 != 0) {
/* 538:592 */         i18 = 1;
/* 539:    */       }
/* 540:594 */       i19 = MathUtils.ceil((i15 + 1) / 10.0F) - 1;
/* 541:595 */       i21 = i7 + i15 % 10 * 8;
/* 542:596 */       i22 = i9 - i19 * i11;
/* 543:597 */       if (i1 <= 4) {
/* 544:598 */         i22 += this.i.nextInt(2);
/* 545:    */       }
/* 546:601 */       if (i15 == i14) {
/* 547:602 */         i22 -= 2;
/* 548:    */       }
/* 549:605 */       i23 = 0;
/* 550:606 */       if (localahd.world.getWorldInfo().isHardcore()) {
/* 551:607 */         i23 = 5;
/* 552:    */       }
/* 553:610 */       b(i21, i22, 16 + i18 * 9, 9 * i23, 9, 9);
/* 554:611 */       if (i2 != 0)
/* 555:    */       {
/* 556:612 */         if (i15 * 2 + 1 < i3) {
/* 557:613 */           b(i21, i22, i16 + 54, 9 * i23, 9, 9);
/* 558:    */         }
/* 559:615 */         if (i15 * 2 + 1 == i3) {
/* 560:616 */           b(i21, i22, i16 + 63, 9 * i23, 9, 9);
/* 561:    */         }
/* 562:    */       }
/* 563:620 */       if (f3 > 0.0F)
/* 564:    */       {
/* 565:621 */         if ((f3 == f2) && (f2 % 2.0F == 1.0F)) {
/* 566:622 */           b(i21, i22, i16 + 153, 9 * i23, 9, 9);
/* 567:    */         } else {
/* 568:624 */           b(i21, i22, i16 + 144, 9 * i23, 9, 9);
/* 569:    */         }
/* 570:626 */         f3 -= 2.0F;
/* 571:    */       }
/* 572:    */       else
/* 573:    */       {
/* 574:628 */         if (i15 * 2 + 1 < i1) {
/* 575:629 */           b(i21, i22, i16 + 36, 9 * i23, 9, 9);
/* 576:    */         }
/* 577:631 */         if (i15 * 2 + 1 == i1) {
/* 578:632 */           b(i21, i22, i16 + 45, 9 * i23, 9, 9);
/* 579:    */         }
/* 580:    */       }
/* 581:    */     }
/* 582:637 */     Entity localwv = localahd.vehicle;
/* 583:638 */     if (localwv == null)
/* 584:    */     {
/* 585:640 */       this.j.y.c("food");
/* 586:641 */       for (i16 = 0; i16 < 10; i16++)
/* 587:    */       {
/* 588:642 */         i18 = i9;
/* 589:    */         
/* 590:644 */         i19 = 16;
/* 591:645 */         i21 = 0;
/* 592:646 */         if (localahd.a(Potion.s))
/* 593:    */         {
/* 594:647 */           i19 += 36;
/* 595:648 */           i21 = 13;
/* 596:    */         }
/* 597:651 */         if ((localahd.ck().e() <= 0.0F) && 
/* 598:652 */           (this.n % (i5 * 3 + 1) == 0)) {
/* 599:653 */           i18 += this.i.nextInt(3) - 1;
/* 600:    */         }
/* 601:657 */         if (i4 != 0) {
/* 602:658 */           i21 = 1;
/* 603:    */         }
/* 604:660 */         i22 = i8 - i16 * 8 - 9;
/* 605:661 */         b(i22, i18, 16 + i21 * 9, 27, 9, 9);
/* 606:662 */         if (i4 != 0)
/* 607:    */         {
/* 608:663 */           if (i16 * 2 + 1 < i6) {
/* 609:664 */             b(i22, i18, i19 + 54, 27, 9, 9);
/* 610:    */           }
/* 611:666 */           if (i16 * 2 + 1 == i6) {
/* 612:667 */             b(i22, i18, i19 + 63, 27, 9, 9);
/* 613:    */           }
/* 614:    */         }
/* 615:670 */         if (i16 * 2 + 1 < i5) {
/* 616:671 */           b(i22, i18, i19 + 36, 27, 9, 9);
/* 617:    */         }
/* 618:673 */         if (i16 * 2 + 1 == i5) {
/* 619:674 */           b(i22, i18, i19 + 45, 27, 9, 9);
/* 620:    */         }
/* 621:    */       }
/* 622:    */     }
/* 623:677 */     else if ((localwv instanceof EntityLiving))
/* 624:    */     {
/* 625:679 */       this.j.y.c("mountHealth");
/* 626:    */       
/* 627:681 */       EntityLiving localxm = (EntityLiving)localwv;
/* 628:682 */       i18 = (int)Math.ceil(localxm.getHealth());
/* 629:683 */       float f4 = localxm.bt();
/* 630:684 */       i21 = (int)(f4 + 0.5F) / 2;
/* 631:685 */       if (i21 > 30) {
/* 632:686 */         i21 = 30;
/* 633:    */       }
/* 634:689 */       i22 = i9;
/* 635:690 */       i23 = 0;
/* 636:692 */       while (i21 > 0)
/* 637:    */       {
/* 638:693 */         int i24 = Math.min(i21, 10);
/* 639:694 */         i21 -= i24;
/* 640:696 */         for (int i25 = 0; i25 < i24; i25++)
/* 641:    */         {
/* 642:697 */           int i26 = 52;
/* 643:698 */           int i27 = 0;
/* 644:700 */           if (i4 != 0) {
/* 645:701 */             i27 = 1;
/* 646:    */           }
/* 647:703 */           int i28 = i8 - i25 * 8 - 9;
/* 648:704 */           b(i28, i22, i26 + i27 * 9, 9, 9, 9);
/* 649:705 */           if (i25 * 2 + 1 + i23 < i18) {
/* 650:706 */             b(i28, i22, i26 + 36, 9, 9, 9);
/* 651:    */           }
/* 652:708 */           if (i25 * 2 + 1 + i23 == i18) {
/* 653:709 */             b(i28, i22, i26 + 45, 9, 9, 9);
/* 654:    */           }
/* 655:    */         }
/* 656:712 */         i22 -= 10;
/* 657:713 */         i23 += 20;
/* 658:    */       }
/* 659:    */     }
/* 660:718 */     this.j.y.c("air");
/* 661:719 */     if (localahd.a(Material.water))
/* 662:    */     {
/* 663:720 */       int i17 = this.j.h.aA();
/* 664:    */       
/* 665:722 */       i18 = MathUtils.ceil((i17 - 2) * 10.0D / 300.0D);
/* 666:723 */       int i20 = MathUtils.ceil(i17 * 10.0D / 300.0D) - i18;
/* 667:725 */       for (i21 = 0; i21 < i18 + i20; i21++) {
/* 668:726 */         if (i21 < i18) {
/* 669:727 */           b(i8 - i21 * 8 - 9, i12, 16, 18, 9, 9);
/* 670:    */         } else {
/* 671:729 */           b(i8 - i21 * 8 - 9, i12, 25, 18, 9, 9);
/* 672:    */         }
/* 673:    */       }
/* 674:    */     }
/* 675:734 */     this.j.y.b();
/* 676:    */   }
/* 677:    */   
/* 678:    */   private void i()
/* 679:    */   {
/* 680:738 */     if ((ciu.c == null) || (ciu.b <= 0)) {
/* 681:739 */       return;
/* 682:    */     }
/* 683:741 */     ciu.b -= 1;
/* 684:    */     
/* 685:743 */     bty localbty = this.j.k;
/* 686:    */     
/* 687:745 */     buf localbuf = new buf(this.j, this.j.d, this.j.e);
/* 688:746 */     int i1 = localbuf.a();
/* 689:    */     
/* 690:748 */     int i2 = 182;
/* 691:749 */     int i3 = i1 / 2 - i2 / 2;
/* 692:    */     
/* 693:751 */     int i4 = (int)(ciu.a * (i2 + 1));
/* 694:    */     
/* 695:753 */     int i5 = 12;
/* 696:754 */     b(i3, i5, 0, 74, i2, 5);
/* 697:755 */     b(i3, i5, 0, 74, i2, 5);
/* 698:756 */     if (i4 > 0) {
/* 699:757 */       b(i3, i5, 0, 79, i4, 5);
/* 700:    */     }
/* 701:759 */     String str = ciu.c;
/* 702:760 */     f().a(str, i1 / 2 - f().a(str) / 2, i5 - 10, 16777215);
/* 703:761 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 704:762 */     this.j.N().a(d);
/* 705:    */   }
/* 706:    */   
/* 707:    */   private void e(buf parambuf)
/* 708:    */   {
/* 709:766 */     cjm.i();
/* 710:767 */     cjm.a(false);
/* 711:768 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 712:769 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 713:770 */     cjm.disableAlphaTest();
/* 714:    */     
/* 715:772 */     this.j.N().a(h);
/* 716:773 */     ckx localckx = ckx.getInstance();
/* 717:774 */     VertexBuffer localciv = localckx.getBuffer();
/* 718:775 */     localciv.begin();
/* 719:776 */     localciv.addVertexWithUV(0.0D, parambuf.b(), -90.0D, 0.0D, 1.0D);
/* 720:777 */     localciv.addVertexWithUV(parambuf.a(), parambuf.b(), -90.0D, 1.0D, 1.0D);
/* 721:778 */     localciv.addVertexWithUV(parambuf.a(), 0.0D, -90.0D, 1.0D, 0.0D);
/* 722:779 */     localciv.addVertexWithUV(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
/* 723:780 */     localckx.draw();
/* 724:781 */     cjm.a(true);
/* 725:782 */     cjm.j();
/* 726:783 */     cjm.enableAlphaTest();
/* 727:784 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 728:    */   }
/* 729:    */   
/* 730:    */   private void a(float paramFloat, buf parambuf)
/* 731:    */   {
/* 732:788 */     paramFloat = 1.0F - paramFloat;
/* 733:789 */     paramFloat = MathUtils.clamp(paramFloat, 0.0F, 1.0F);
/* 734:    */     
/* 735:791 */     bfb localbfb = this.j.f.af();
/* 736:792 */     float f1 = (float)localbfb.a(this.j.h);
/* 737:793 */     double d1 = Math.min(localbfb.o() * localbfb.p() * 1000.0D, Math.abs(localbfb.j() - localbfb.h()));
/* 738:794 */     double d2 = Math.max(localbfb.q(), d1);
/* 739:796 */     if (f1 < d2) {
/* 740:797 */       f1 = 1.0F - (float)(f1 / d2);
/* 741:    */     } else {
/* 742:799 */       f1 = 0.0F;
/* 743:    */     }
/* 744:802 */     this.a = ((float)(this.a + (paramFloat - this.a) * 0.01D));
/* 745:    */     
/* 746:804 */     cjm.i();
/* 747:805 */     cjm.a(false);
/* 748:806 */     cjm.glBlendFuncSeparate(0, 769, 1, 0);
/* 749:808 */     if (f1 > 0.0F) {
/* 750:809 */       cjm.c(0.0F, f1, f1, 1.0F);
/* 751:    */     } else {
/* 752:811 */       cjm.c(this.a, this.a, this.a, 1.0F);
/* 753:    */     }
/* 754:814 */     this.j.N().a(f);
/* 755:815 */     ckx localckx = ckx.getInstance();
/* 756:816 */     VertexBuffer localciv = localckx.getBuffer();
/* 757:817 */     localciv.begin();
/* 758:818 */     localciv.addVertexWithUV(0.0D, parambuf.b(), -90.0D, 0.0D, 1.0D);
/* 759:819 */     localciv.addVertexWithUV(parambuf.a(), parambuf.b(), -90.0D, 1.0D, 1.0D);
/* 760:820 */     localciv.addVertexWithUV(parambuf.a(), 0.0D, -90.0D, 1.0D, 0.0D);
/* 761:821 */     localciv.addVertexWithUV(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
/* 762:822 */     localckx.draw();
/* 763:823 */     cjm.a(true);
/* 764:824 */     cjm.j();
/* 765:825 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 766:826 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 767:    */   }
/* 768:    */   
/* 769:    */   private void b(float paramFloat, buf parambuf)
/* 770:    */   {
/* 771:830 */     if (paramFloat < 1.0F)
/* 772:    */     {
/* 773:831 */       paramFloat *= paramFloat;
/* 774:832 */       paramFloat *= paramFloat;
/* 775:833 */       paramFloat = paramFloat * 0.8F + 0.2F;
/* 776:    */     }
/* 777:836 */     cjm.disableAlphaTest();
/* 778:837 */     cjm.i();
/* 779:838 */     cjm.a(false);
/* 780:839 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 781:840 */     cjm.c(1.0F, 1.0F, 1.0F, paramFloat);
/* 782:    */     
/* 783:842 */     this.j.N().a(cua.g);
/* 784:843 */     cue localcue = this.j.ab().a().a(BlockList.aY.instance());
/* 785:    */     
/* 786:845 */     float f1 = localcue.e();
/* 787:846 */     float f2 = localcue.g();
/* 788:847 */     float f3 = localcue.f();
/* 789:848 */     float f4 = localcue.h();
/* 790:849 */     ckx localckx = ckx.getInstance();
/* 791:850 */     VertexBuffer localciv = localckx.getBuffer();
/* 792:851 */     localciv.begin();
/* 793:852 */     localciv.addVertexWithUV(0.0D, parambuf.b(), -90.0D, f1, f4);
/* 794:853 */     localciv.addVertexWithUV(parambuf.a(), parambuf.b(), -90.0D, f3, f4);
/* 795:854 */     localciv.addVertexWithUV(parambuf.a(), 0.0D, -90.0D, f3, f2);
/* 796:855 */     localciv.addVertexWithUV(0.0D, 0.0D, -90.0D, f1, f2);
/* 797:856 */     localckx.draw();
/* 798:857 */     cjm.a(true);
/* 799:858 */     cjm.j();
/* 800:859 */     cjm.enableAlphaTest();
/* 801:860 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 802:    */   }
/* 803:    */   
/* 804:    */   private void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat, EntityPlayer paramahd)
/* 805:    */   {
/* 806:864 */     ItemStack localamj = paramahd.bg.a[paramInt1];
/* 807:865 */     if (localamj == null) {
/* 808:866 */       return;
/* 809:    */     }
/* 810:869 */     float f1 = localamj.c - paramFloat;
/* 811:870 */     if (f1 > 0.0F)
/* 812:    */     {
/* 813:871 */       cjm.glPushMatrix();
/* 814:872 */       float f2 = 1.0F + f1 / 5.0F;
/* 815:873 */       cjm.glTranslatef(paramInt2 + 8, paramInt3 + 12, 0.0F);
/* 816:874 */       cjm.glScalef(1.0F / f2, (f2 + 1.0F) / 2.0F, 1.0F);
/* 817:875 */       cjm.glTranslatef(-(paramInt2 + 8), -(paramInt3 + 12), 0.0F);
/* 818:    */     }
/* 819:878 */     this.k.b(localamj, paramInt2, paramInt3);
/* 820:880 */     if (f1 > 0.0F) {
/* 821:881 */       cjm.glPopMatrix();
/* 822:    */     }
/* 823:884 */     this.k.a(this.j.k, localamj, paramInt2, paramInt3);
/* 824:    */   }
/* 825:    */   
/* 826:    */   public void c()
/* 827:    */   {
/* 828:888 */     if (this.p > 0) {
/* 829:889 */       this.p -= 1;
/* 830:    */     }
/* 831:891 */     if (this.w > 0)
/* 832:    */     {
/* 833:892 */       this.w -= 1;
/* 834:893 */       if (this.w <= 0)
/* 835:    */       {
/* 836:894 */         this.x = "";
/* 837:895 */         this.y = "";
/* 838:    */       }
/* 839:    */     }
/* 840:898 */     this.n += 1;
/* 841:    */     
/* 842:900 */     this.m.a();
/* 843:902 */     if (this.j.h != null)
/* 844:    */     {
/* 845:903 */       ItemStack localamj = this.j.h.bg.h();
/* 846:905 */       if (localamj == null) {
/* 847:906 */         this.r = 0;
/* 848:907 */       } else if ((this.s == null) || (localamj.getItem() != this.s.getItem()) || (!ItemStack.a(localamj, this.s)) || ((!localamj.e()) && (localamj.i() != this.s.i()))) {
/* 849:908 */         this.r = 40;
/* 850:909 */       } else if (this.r > 0) {
/* 851:910 */         this.r -= 1;
/* 852:    */       }
/* 853:912 */       this.s = localamj;
/* 854:    */     }
/* 855:    */   }
/* 856:    */   
/* 857:    */   public void a(String paramString)
/* 858:    */   {
/* 859:917 */     a(cwc.a("record.nowPlaying", new Object[] { paramString }), true);
/* 860:    */   }
/* 861:    */   
/* 862:    */   public void a(String paramString, boolean paramBoolean)
/* 863:    */   {
/* 864:921 */     this.o = paramString;
/* 865:922 */     this.p = 60;
/* 866:923 */     this.q = paramBoolean;
/* 867:    */   }
/* 868:    */   
/* 869:    */   public void a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
/* 870:    */   {
/* 871:927 */     if ((paramString1 == null) && (paramString2 == null) && (paramInt1 < 0) && (paramInt2 < 0) && (paramInt3 < 0))
/* 872:    */     {
/* 873:928 */       this.x = "";
/* 874:929 */       this.y = "";
/* 875:930 */       this.w = 0;
/* 876:931 */       return;
/* 877:    */     }
/* 878:934 */     if (paramString1 != null)
/* 879:    */     {
/* 880:935 */       this.x = paramString1;
/* 881:936 */       this.w = (this.z + this.A + this.B);
/* 882:937 */       return;
/* 883:    */     }
/* 884:939 */     if (paramString2 != null)
/* 885:    */     {
/* 886:940 */       this.y = paramString2;
/* 887:941 */       return;
/* 888:    */     }
/* 889:944 */     if (paramInt1 >= 0) {
/* 890:945 */       this.z = paramInt1;
/* 891:    */     }
/* 892:947 */     if (paramInt2 >= 0) {
/* 893:948 */       this.A = paramInt2;
/* 894:    */     }
/* 895:950 */     if (paramInt3 >= 0) {
/* 896:951 */       this.B = paramInt3;
/* 897:    */     }
/* 898:953 */     if (this.w > 0) {
/* 899:954 */       this.w = (this.z + this.A + this.B);
/* 900:    */     }
/* 901:    */   }
/* 902:    */   
/* 903:    */   public void a(ho paramho, boolean paramBoolean)
/* 904:    */   {
/* 905:959 */     a(paramho.c(), paramBoolean);
/* 906:    */   }
/* 907:    */   
/* 908:    */   public buh d()
/* 909:    */   {
/* 910:963 */     return this.l;
/* 911:    */   }
/* 912:    */   
/* 913:    */   public int e()
/* 914:    */   {
/* 915:967 */     return this.n;
/* 916:    */   }
/* 917:    */   
/* 918:    */   public bty f()
/* 919:    */   {
/* 920:971 */     return this.j.k;
/* 921:    */   }
/* 922:    */   
/* 923:    */   public bvo g()
/* 924:    */   {
/* 925:975 */     return this.u;
/* 926:    */   }
/* 927:    */   
/* 928:    */   public bvh h()
/* 929:    */   {
/* 930:979 */     return this.v;
/* 931:    */   }
/* 932:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     btz
 * JD-Core Version:    0.7.0.1
 */
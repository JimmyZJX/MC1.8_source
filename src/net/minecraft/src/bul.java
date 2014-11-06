package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import com.google.common.base.Predicates;
/*   3:    */ 
/*   4:    */ public class bul
/*   5:    */   extends bub
/*   6:    */ {
/*   7:    */   private final int g;
/*   8:    */   private final bty h;
/*   9:    */   public int a;
/*  10:    */   public int f;
/*  11:    */   private final int i;
/*  12:    */   private final int j;
/*  13: 30 */   private String k = "";
/*  14: 31 */   private int l = 32;
/*  15:    */   private int m;
/*  16: 33 */   private boolean n = true;
/*  17: 34 */   private boolean o = true;
/*  18:    */   private boolean p;
/*  19: 36 */   private boolean q = true;
/*  20:    */   private int r;
/*  21:    */   private int s;
/*  22:    */   private int t;
/*  23: 40 */   private int u = 14737632;
/*  24: 41 */   private int v = 7368816;
/*  25: 42 */   private boolean w = true;
/*  26:    */   private bvb x;
/*  27: 44 */   private Predicate<String> y = Predicates.alwaysTrue();
/*  28:    */   
/*  29:    */   public bul(int paramInt1, bty parambty, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*  30:    */   {
/*  31: 47 */     this.g = paramInt1;
/*  32: 48 */     this.h = parambty;
/*  33: 49 */     this.a = paramInt2;
/*  34: 50 */     this.f = paramInt3;
/*  35: 51 */     this.i = paramInt4;
/*  36: 52 */     this.j = paramInt5;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void a(bvb parambvb)
/*  40:    */   {
/*  41: 56 */     this.x = parambvb;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void a()
/*  45:    */   {
/*  46: 60 */     this.m += 1;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void a(String paramString)
/*  50:    */   {
/*  51: 64 */     if (!this.y.apply(paramString)) {
/*  52: 65 */       return;
/*  53:    */     }
/*  54: 68 */     if (paramString.length() > this.l) {
/*  55: 69 */       this.k = paramString.substring(0, this.l);
/*  56:    */     } else {
/*  57: 71 */       this.k = paramString;
/*  58:    */     }
/*  59: 74 */     f();
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String b()
/*  63:    */   {
/*  64: 78 */     return this.k;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String c()
/*  68:    */   {
/*  69: 82 */     int i1 = this.s < this.t ? this.s : this.t;
/*  70: 83 */     int i2 = this.s < this.t ? this.t : this.s;
/*  71:    */     
/*  72: 85 */     return this.k.substring(i1, i2);
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void a(Predicate<String> paramPredicate)
/*  76:    */   {
/*  77: 89 */     this.y = paramPredicate;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void b(String paramString)
/*  81:    */   {
/*  82: 93 */     String str1 = "";
/*  83: 94 */     String str2 = net.minecraft.src.v.a(paramString);
/*  84: 95 */     int i1 = this.s < this.t ? this.s : this.t;
/*  85: 96 */     int i2 = this.s < this.t ? this.t : this.s;
/*  86: 97 */     int i3 = this.l - this.k.length() - (i1 - i2);
/*  87: 98 */     int i4 = 0;
/*  88:100 */     if (this.k.length() > 0) {
/*  89:101 */       str1 = str1 + this.k.substring(0, i1);
/*  90:    */     }
/*  91:104 */     if (i3 < str2.length())
/*  92:    */     {
/*  93:105 */       str1 = str1 + str2.substring(0, i3);
/*  94:106 */       i4 = i3;
/*  95:    */     }
/*  96:    */     else
/*  97:    */     {
/*  98:108 */       str1 = str1 + str2;
/*  99:109 */       i4 = str2.length();
/* 100:    */     }
/* 101:112 */     if ((this.k.length() > 0) && (i2 < this.k.length())) {
/* 102:113 */       str1 = str1 + this.k.substring(i2);
/* 103:    */     }
/* 104:116 */     if (!this.y.apply(str1)) {
/* 105:117 */       return;
/* 106:    */     }
/* 107:120 */     this.k = str1;
/* 108:121 */     d(i1 - this.t + i4);
/* 109:123 */     if (this.x != null) {
/* 110:124 */       this.x.a(this.g, this.k);
/* 111:    */     }
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void a(int paramInt)
/* 115:    */   {
/* 116:129 */     if (this.k.length() == 0) {
/* 117:130 */       return;
/* 118:    */     }
/* 119:133 */     if (this.t != this.s)
/* 120:    */     {
/* 121:134 */       b("");
/* 122:135 */       return;
/* 123:    */     }
/* 124:138 */     b(c(paramInt) - this.s);
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void b(int paramInt)
/* 128:    */   {
/* 129:142 */     if (this.k.length() == 0) {
/* 130:143 */       return;
/* 131:    */     }
/* 132:146 */     if (this.t != this.s)
/* 133:    */     {
/* 134:147 */       b("");
/* 135:148 */       return;
/* 136:    */     }
/* 137:151 */     int i1 = paramInt < 0 ? 1 : 0;
/* 138:152 */     int i2 = i1 != 0 ? this.s + paramInt : this.s;
/* 139:153 */     int i3 = i1 != 0 ? this.s : this.s + paramInt;
/* 140:154 */     String str = "";
/* 141:156 */     if (i2 >= 0) {
/* 142:157 */       str = this.k.substring(0, i2);
/* 143:    */     }
/* 144:160 */     if (i3 < this.k.length()) {
/* 145:161 */       str = str + this.k.substring(i3);
/* 146:    */     }
/* 147:164 */     this.k = str;
/* 148:165 */     if (i1 != 0) {
/* 149:166 */       d(paramInt);
/* 150:    */     }
/* 151:169 */     if (this.x != null) {
/* 152:170 */       this.x.a(this.g, this.k);
/* 153:    */     }
/* 154:    */   }
/* 155:    */   
/* 156:    */   public int d()
/* 157:    */   {
/* 158:175 */     return this.g;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public int c(int paramInt)
/* 162:    */   {
/* 163:179 */     return a(paramInt, i());
/* 164:    */   }
/* 165:    */   
/* 166:    */   public int a(int paramInt1, int paramInt2)
/* 167:    */   {
/* 168:183 */     return a(paramInt1, paramInt2, true);
/* 169:    */   }
/* 170:    */   
/* 171:    */   public int a(int paramInt1, int paramInt2, boolean paramBoolean)
/* 172:    */   {
/* 173:187 */     int i1 = paramInt2;
/* 174:188 */     int i2 = paramInt1 < 0 ? 1 : 0;
/* 175:189 */     int i3 = Math.abs(paramInt1);
/* 176:191 */     for (int i4 = 0; i4 < i3; i4++)
/* 177:    */     {
/* 178:192 */       if (i2 != 0)
/* 179:    */       {
/* 180:193 */         while ((paramBoolean) && (i1 > 0) && (this.k.charAt(i1 - 1) == ' ')) {
/* 181:194 */           i1--;
/* 182:    */         }
/* 183:196 */         while ((i1 > 0) && (this.k.charAt(i1 - 1) != ' ')) {
/* 184:197 */           i1--;
/* 185:    */         }
/* 186:    */       }
/* 187:200 */       int i5 = this.k.length();
/* 188:    */       
/* 189:202 */       i1 = this.k.indexOf(' ', i1);
/* 190:203 */       if (i1 == -1) {
/* 191:204 */         i1 = i5;
/* 192:    */       } else {
/* 193:206 */         while ((paramBoolean) && (i1 < i5) && (this.k.charAt(i1) == ' ')) {
/* 194:207 */           i1++;
/* 195:    */         }
/* 196:    */       }
/* 197:    */     }
/* 198:213 */     return i1;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public void d(int paramInt)
/* 202:    */   {
/* 203:217 */     e(this.t + paramInt);
/* 204:    */   }
/* 205:    */   
/* 206:    */   public void e(int paramInt)
/* 207:    */   {
/* 208:221 */     this.s = paramInt;
/* 209:    */     
/* 210:223 */     int i1 = this.k.length();
/* 211:224 */     this.s = MathUtils.clamp(this.s, 0, i1);
/* 212:    */     
/* 213:226 */     i(this.s);
/* 214:    */   }
/* 215:    */   
/* 216:    */   public void e()
/* 217:    */   {
/* 218:230 */     e(0);
/* 219:    */   }
/* 220:    */   
/* 221:    */   public void f()
/* 222:    */   {
/* 223:234 */     e(this.k.length());
/* 224:    */   }
/* 225:    */   
/* 226:    */   public boolean a(char paramChar, int paramInt)
/* 227:    */   {
/* 228:238 */     if (!this.p) {
/* 229:239 */       return false;
/* 230:    */     }
/* 231:242 */     if (bxf.g(paramInt))
/* 232:    */     {
/* 233:243 */       f();
/* 234:244 */       i(0);
/* 235:245 */       return true;
/* 236:    */     }
/* 237:246 */     if (bxf.f(paramInt))
/* 238:    */     {
/* 239:247 */       bxf.e(c());
/* 240:248 */       return true;
/* 241:    */     }
/* 242:249 */     if (bxf.e(paramInt))
/* 243:    */     {
/* 244:250 */       if (this.q) {
/* 245:251 */         b(bxf.o());
/* 246:    */       }
/* 247:253 */       return true;
/* 248:    */     }
/* 249:254 */     if (bxf.d(paramInt))
/* 250:    */     {
/* 251:255 */       bxf.e(c());
/* 252:256 */       if (this.q) {
/* 253:257 */         b("");
/* 254:    */       }
/* 255:259 */       return true;
/* 256:    */     }
/* 257:262 */     switch (paramInt)
/* 258:    */     {
/* 259:    */     case 203: 
/* 260:264 */       if (bxf.r())
/* 261:    */       {
/* 262:265 */         if (bxf.q()) {
/* 263:266 */           i(a(-1, o()));
/* 264:    */         } else {
/* 265:268 */           i(o() - 1);
/* 266:    */         }
/* 267:    */       }
/* 268:271 */       else if (bxf.q()) {
/* 269:272 */         e(c(-1));
/* 270:    */       } else {
/* 271:274 */         d(-1);
/* 272:    */       }
/* 273:278 */       return true;
/* 274:    */     case 205: 
/* 275:280 */       if (bxf.r())
/* 276:    */       {
/* 277:281 */         if (bxf.q()) {
/* 278:282 */           i(a(1, o()));
/* 279:    */         } else {
/* 280:284 */           i(o() + 1);
/* 281:    */         }
/* 282:    */       }
/* 283:287 */       else if (bxf.q()) {
/* 284:288 */         e(c(1));
/* 285:    */       } else {
/* 286:290 */         d(1);
/* 287:    */       }
/* 288:294 */       return true;
/* 289:    */     case 14: 
/* 290:296 */       if (bxf.q())
/* 291:    */       {
/* 292:297 */         if (this.q) {
/* 293:298 */           a(-1);
/* 294:    */         }
/* 295:    */       }
/* 296:301 */       else if (this.q) {
/* 297:302 */         b(-1);
/* 298:    */       }
/* 299:306 */       return true;
/* 300:    */     case 211: 
/* 301:309 */       if (bxf.q())
/* 302:    */       {
/* 303:310 */         if (this.q) {
/* 304:311 */           a(1);
/* 305:    */         }
/* 306:    */       }
/* 307:314 */       else if (this.q) {
/* 308:315 */         b(1);
/* 309:    */       }
/* 310:319 */       return true;
/* 311:    */     case 199: 
/* 312:322 */       if (bxf.r()) {
/* 313:323 */         i(0);
/* 314:    */       } else {
/* 315:325 */         e();
/* 316:    */       }
/* 317:328 */       return true;
/* 318:    */     case 207: 
/* 319:331 */       if (bxf.r()) {
/* 320:332 */         i(this.k.length());
/* 321:    */       } else {
/* 322:334 */         f();
/* 323:    */       }
/* 324:337 */       return true;
/* 325:    */     }
/* 326:340 */     if (net.minecraft.src.v.a(paramChar))
/* 327:    */     {
/* 328:341 */       if (this.q) {
/* 329:342 */         b(Character.toString(paramChar));
/* 330:    */       }
/* 331:345 */       return true;
/* 332:    */     }
/* 333:348 */     return false;
/* 334:    */   }
/* 335:    */   
/* 336:    */   public void a(int paramInt1, int paramInt2, int paramInt3)
/* 337:    */   {
/* 338:352 */     boolean bool = (paramInt1 >= this.a) && (paramInt1 < this.a + this.i) && (paramInt2 >= this.f) && (paramInt2 < this.f + this.j);
/* 339:354 */     if (this.o) {
/* 340:355 */       b(bool);
/* 341:    */     }
/* 342:358 */     if ((this.p) && (bool) && (paramInt3 == 0))
/* 343:    */     {
/* 344:359 */       int i1 = paramInt1 - this.a;
/* 345:361 */       if (this.n) {
/* 346:362 */         i1 -= 4;
/* 347:    */       }
/* 348:365 */       String str = this.h.a(this.k.substring(this.r), p());
/* 349:366 */       e(this.h.a(str, i1).length() + this.r);
/* 350:    */     }
/* 351:    */   }
/* 352:    */   
/* 353:    */   public void g()
/* 354:    */   {
/* 355:371 */     if (!r()) {
/* 356:372 */       return;
/* 357:    */     }
/* 358:375 */     if (j())
/* 359:    */     {
/* 360:376 */       a(this.a - 1, this.f - 1, this.a + this.i + 1, this.f + this.j + 1, -6250336);
/* 361:377 */       a(this.a, this.f, this.a + this.i, this.f + this.j, -16777216);
/* 362:    */     }
/* 363:380 */     int i1 = this.q ? this.u : this.v;
/* 364:381 */     int i2 = this.s - this.r;
/* 365:382 */     int i3 = this.t - this.r;
/* 366:383 */     String str1 = this.h.a(this.k.substring(this.r), p());
/* 367:384 */     int i4 = (i2 >= 0) && (i2 <= str1.length()) ? 1 : 0;
/* 368:385 */     int i5 = (this.p) && (this.m / 6 % 2 == 0) && (i4 != 0) ? 1 : 0;
/* 369:386 */     int i6 = this.n ? this.a + 4 : this.a;
/* 370:387 */     int i7 = this.n ? this.f + (this.j - 8) / 2 : this.f;
/* 371:388 */     int i8 = i6;
/* 372:390 */     if (i3 > str1.length()) {
/* 373:391 */       i3 = str1.length();
/* 374:    */     }
/* 375:394 */     if (str1.length() > 0)
/* 376:    */     {
/* 377:395 */       String str2 = i4 != 0 ? str1.substring(0, i2) : str1;
/* 378:396 */       i8 = this.h.a(str2, i8, i7, i1);
/* 379:    */     }
/* 380:399 */     int i9 = (this.s < this.k.length()) || (this.k.length() >= h()) ? 1 : 0;
/* 381:400 */     int i10 = i8;
/* 382:402 */     if (i4 == 0)
/* 383:    */     {
/* 384:403 */       i10 = i2 > 0 ? i6 + this.i : i6;
/* 385:    */     }
/* 386:404 */     else if (i9 != 0)
/* 387:    */     {
/* 388:405 */       i10--;
/* 389:406 */       i8--;
/* 390:    */     }
/* 391:409 */     if ((str1.length() > 0) && (i4 != 0) && (i2 < str1.length())) {
/* 392:410 */       i8 = this.h.a(str1.substring(i2), i8, i7, i1);
/* 393:    */     }
/* 394:413 */     if (i5 != 0) {
/* 395:414 */       if (i9 != 0) {
/* 396:415 */         bub.a(i10, i7 - 1, i10 + 1, i7 + 1 + this.h.a, -3092272);
/* 397:    */       } else {
/* 398:417 */         this.h.a("_", i10, i7, i1);
/* 399:    */       }
/* 400:    */     }
/* 401:421 */     if (i3 != i2)
/* 402:    */     {
/* 403:422 */       int i11 = i6 + this.h.a(str1.substring(0, i3));
/* 404:423 */       c(i10, i7 - 1, i11 - 1, i7 + 1 + this.h.a);
/* 405:    */     }
/* 406:    */   }
/* 407:    */   
/* 408:    */   private void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 409:    */   {
/* 410:    */     int i1;
/* 411:428 */     if (paramInt1 < paramInt3)
/* 412:    */     {
/* 413:429 */       i1 = paramInt1;
/* 414:430 */       paramInt1 = paramInt3;
/* 415:431 */       paramInt3 = i1;
/* 416:    */     }
/* 417:433 */     if (paramInt2 < paramInt4)
/* 418:    */     {
/* 419:434 */       i1 = paramInt2;
/* 420:435 */       paramInt2 = paramInt4;
/* 421:436 */       paramInt4 = i1;
/* 422:    */     }
/* 423:439 */     if (paramInt3 > this.a + this.i) {
/* 424:440 */       paramInt3 = this.a + this.i;
/* 425:    */     }
/* 426:442 */     if (paramInt1 > this.a + this.i) {
/* 427:443 */       paramInt1 = this.a + this.i;
/* 428:    */     }
/* 429:446 */     ckx localckx = ckx.getInstance();
/* 430:447 */     VertexBuffer localciv = localckx.getBuffer();
/* 431:    */     
/* 432:449 */     cjm.c(0.0F, 0.0F, 255.0F, 255.0F);
/* 433:450 */     cjm.x();
/* 434:451 */     cjm.u();
/* 435:452 */     cjm.f(5387);
/* 436:    */     
/* 437:454 */     localciv.begin();
/* 438:455 */     localciv.addVertex(paramInt1, paramInt4, 0.0D);
/* 439:456 */     localciv.addVertex(paramInt3, paramInt4, 0.0D);
/* 440:457 */     localciv.addVertex(paramInt3, paramInt2, 0.0D);
/* 441:458 */     localciv.addVertex(paramInt1, paramInt2, 0.0D);
/* 442:459 */     localckx.draw();
/* 443:    */     
/* 444:461 */     cjm.v();
/* 445:462 */     cjm.w();
/* 446:    */   }
/* 447:    */   
/* 448:    */   public void f(int paramInt)
/* 449:    */   {
/* 450:466 */     this.l = paramInt;
/* 451:468 */     if (this.k.length() > paramInt) {
/* 452:469 */       this.k = this.k.substring(0, paramInt);
/* 453:    */     }
/* 454:    */   }
/* 455:    */   
/* 456:    */   public int h()
/* 457:    */   {
/* 458:474 */     return this.l;
/* 459:    */   }
/* 460:    */   
/* 461:    */   public int i()
/* 462:    */   {
/* 463:478 */     return this.s;
/* 464:    */   }
/* 465:    */   
/* 466:    */   public boolean j()
/* 467:    */   {
/* 468:482 */     return this.n;
/* 469:    */   }
/* 470:    */   
/* 471:    */   public void a(boolean paramBoolean)
/* 472:    */   {
/* 473:486 */     this.n = paramBoolean;
/* 474:    */   }
/* 475:    */   
/* 476:    */   public void g(int paramInt)
/* 477:    */   {
/* 478:494 */     this.u = paramInt;
/* 479:    */   }
/* 480:    */   
/* 481:    */   public void h(int paramInt)
/* 482:    */   {
/* 483:502 */     this.v = paramInt;
/* 484:    */   }
/* 485:    */   
/* 486:    */   public void b(boolean paramBoolean)
/* 487:    */   {
/* 488:506 */     if ((paramBoolean) && (!this.p)) {
/* 489:508 */       this.m = 0;
/* 490:    */     }
/* 491:510 */     this.p = paramBoolean;
/* 492:    */   }
/* 493:    */   
/* 494:    */   public boolean m()
/* 495:    */   {
/* 496:514 */     return this.p;
/* 497:    */   }
/* 498:    */   
/* 499:    */   public void c(boolean paramBoolean)
/* 500:    */   {
/* 501:522 */     this.q = paramBoolean;
/* 502:    */   }
/* 503:    */   
/* 504:    */   public int o()
/* 505:    */   {
/* 506:526 */     return this.t;
/* 507:    */   }
/* 508:    */   
/* 509:    */   public int p()
/* 510:    */   {
/* 511:530 */     return j() ? this.i - 8 : this.i;
/* 512:    */   }
/* 513:    */   
/* 514:    */   public void i(int paramInt)
/* 515:    */   {
/* 516:534 */     int i1 = this.k.length();
/* 517:536 */     if (paramInt > i1) {
/* 518:537 */       paramInt = i1;
/* 519:    */     }
/* 520:539 */     if (paramInt < 0) {
/* 521:540 */       paramInt = 0;
/* 522:    */     }
/* 523:543 */     this.t = paramInt;
/* 524:545 */     if (this.h != null)
/* 525:    */     {
/* 526:546 */       if (this.r > i1) {
/* 527:547 */         this.r = i1;
/* 528:    */       }
/* 529:549 */       int i2 = p();
/* 530:550 */       String str = this.h.a(this.k.substring(this.r), i2);
/* 531:551 */       int i3 = str.length() + this.r;
/* 532:553 */       if (paramInt == this.r) {
/* 533:554 */         this.r -= this.h.a(this.k, i2, true).length();
/* 534:    */       }
/* 535:556 */       if (paramInt > i3) {
/* 536:557 */         this.r += paramInt - i3;
/* 537:558 */       } else if (paramInt <= this.r) {
/* 538:559 */         this.r -= this.r - paramInt;
/* 539:    */       }
/* 540:562 */       this.r = MathUtils.clamp(this.r, 0, i1);
/* 541:    */     }
/* 542:    */   }
/* 543:    */   
/* 544:    */   public void d(boolean paramBoolean)
/* 545:    */   {
/* 546:571 */     this.o = paramBoolean;
/* 547:    */   }
/* 548:    */   
/* 549:    */   public boolean r()
/* 550:    */   {
/* 551:575 */     return this.w;
/* 552:    */   }
/* 553:    */   
/* 554:    */   public void e(boolean paramBoolean)
/* 555:    */   {
/* 556:579 */     this.w = paramBoolean;
/* 557:    */   }
/* 558:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bul
 * JD-Core Version:    0.7.0.1
 */
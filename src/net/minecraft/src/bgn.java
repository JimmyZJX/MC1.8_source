package net.minecraft.src;
/*   1:    */ import com.google.gson.Gson;
/*   2:    */ import com.google.gson.GsonBuilder;
/*   3:    */ 
/*   4:    */ public class bgn
/*   5:    */ {
/*   6:217 */   static final Gson a = new GsonBuilder().registerTypeAdapter(bgn.class, new bgo()).create();
/*   7:    */   
/*   8:    */   public static bgn a(String paramString)
/*   9:    */   {
/*  10:220 */     if (paramString.length() == 0) {
/*  11:221 */       return new bgn();
/*  12:    */     }
/*  13:    */     try
/*  14:    */     {
/*  15:224 */       return (bgn)a.fromJson(paramString, bgn.class);
/*  16:    */     }
/*  17:    */     catch (Exception localException) {}
/*  18:227 */     return new bgn();
/*  19:    */   }
/*  20:    */   
/*  21:    */   public String toString()
/*  22:    */   {
/*  23:232 */     return a.toJson(this);
/*  24:    */   }
/*  25:    */   
/*  26:236 */   public float b = 684.41199F;
/*  27:237 */   public float c = 684.41199F;
/*  28:238 */   public float d = 512.0F;
/*  29:239 */   public float e = 512.0F;
/*  30:240 */   public float f = 200.0F;
/*  31:241 */   public float g = 200.0F;
/*  32:242 */   public float h = 0.5F;
/*  33:243 */   public float i = 80.0F;
/*  34:244 */   public float j = 160.0F;
/*  35:245 */   public float k = 80.0F;
/*  36:246 */   public float l = 8.5F;
/*  37:247 */   public float m = 12.0F;
/*  38:248 */   public float n = 1.0F;
/*  39:249 */   public float o = 0.0F;
/*  40:250 */   public float p = 1.0F;
/*  41:251 */   public float q = 0.0F;
/*  42:252 */   public int r = 63;
/*  43:255 */   public boolean s = true;
/*  44:256 */   public boolean t = true;
/*  45:257 */   public int u = 8;
/*  46:258 */   public boolean v = true;
/*  47:259 */   public boolean w = true;
/*  48:260 */   public boolean x = true;
/*  49:261 */   public boolean y = true;
/*  50:262 */   public boolean z = true;
/*  51:263 */   public boolean A = true;
/*  52:264 */   public boolean B = true;
/*  53:265 */   public int C = 4;
/*  54:266 */   public boolean D = true;
/*  55:267 */   public int E = 80;
/*  56:268 */   public boolean F = false;
/*  57:271 */   public int G = -1;
/*  58:272 */   public int H = 4;
/*  59:273 */   public int I = 4;
/*  60:276 */   public int dirtRadius = 33;
/*  61:277 */   public int dirtPerChunk = 10;
/*  62:278 */   public int L = 0;
/*  63:279 */   public int M = 256;
/*  64:280 */   public int N = 33;
/*  65:281 */   public int O = 8;
/*  66:282 */   public int P = 0;
/*  67:283 */   public int Q = 256;
/*  68:284 */   public int R = 33;
/*  69:285 */   public int S = 10;
/*  70:286 */   public int T = 0;
/*  71:287 */   public int U = 80;
/*  72:288 */   public int V = 33;
/*  73:289 */   public int W = 10;
/*  74:290 */   public int X = 0;
/*  75:291 */   public int Y = 80;
/*  76:292 */   public int Z = 33;
/*  77:293 */   public int aa = 10;
/*  78:294 */   public int ab = 0;
/*  79:295 */   public int ac = 80;
/*  80:296 */   public int ad = 17;
/*  81:297 */   public int ae = 20;
/*  82:298 */   public int af = 0;
/*  83:299 */   public int ag = 128;
/*  84:300 */   public int ah = 9;
/*  85:301 */   public int ai = 20;
/*  86:302 */   public int aj = 0;
/*  87:303 */   public int ak = 64;
/*  88:304 */   public int al = 9;
/*  89:305 */   public int am = 2;
/*  90:306 */   public int an = 0;
/*  91:307 */   public int ao = 32;
/*  92:308 */   public int redStoneRadius = 8;
/*  93:309 */   public int redstonePerChunk = 8;
/*  94:310 */   public int redstoneY1 = 0;
/*  95:311 */   public int redstoneY2 = 16;
/*  96:312 */   public int diamondRadius = 8;
/*  97:313 */   public int diamondPerChunk = 1;
/*  98:314 */   public int diamondY1 = 0;
/*  99:315 */   public int diamondY2 = 16;
/* 100:316 */   public int lapisRadius = 7;
/* 101:317 */   public int lapisPerChunk = 1;
/* 102:318 */   public int az = 16;
/* 103:319 */   public int aA = 16;
/* 104:    */   
/* 105:    */   public bgn()
/* 106:    */   {
/* 107:322 */     a();
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void a()
/* 111:    */   {
/* 112:326 */     this.b = 684.41199F;
/* 113:327 */     this.c = 684.41199F;
/* 114:328 */     this.d = 512.0F;
/* 115:329 */     this.e = 512.0F;
/* 116:330 */     this.f = 200.0F;
/* 117:331 */     this.g = 200.0F;
/* 118:332 */     this.h = 0.5F;
/* 119:333 */     this.i = 80.0F;
/* 120:334 */     this.j = 160.0F;
/* 121:335 */     this.k = 80.0F;
/* 122:336 */     this.l = 8.5F;
/* 123:337 */     this.m = 12.0F;
/* 124:338 */     this.n = 1.0F;
/* 125:339 */     this.o = 0.0F;
/* 126:340 */     this.p = 1.0F;
/* 127:341 */     this.q = 0.0F;
/* 128:342 */     this.r = 63;
/* 129:    */     
/* 130:344 */     this.s = true;
/* 131:345 */     this.t = true;
/* 132:346 */     this.u = 8;
/* 133:347 */     this.v = true;
/* 134:348 */     this.w = true;
/* 135:349 */     this.x = true;
/* 136:350 */     this.y = true;
/* 137:351 */     this.z = true;
/* 138:352 */     this.A = true;
/* 139:353 */     this.B = true;
/* 140:354 */     this.C = 4;
/* 141:355 */     this.D = true;
/* 142:356 */     this.E = 80;
/* 143:357 */     this.F = false;
/* 144:    */     
/* 145:359 */     this.G = -1;
/* 146:360 */     this.H = 4;
/* 147:361 */     this.I = 4;
/* 148:    */     
/* 149:363 */     this.dirtRadius = 33;
/* 150:364 */     this.dirtPerChunk = 10;
/* 151:365 */     this.L = 0;
/* 152:366 */     this.M = 256;
/* 153:367 */     this.N = 33;
/* 154:368 */     this.O = 8;
/* 155:369 */     this.P = 0;
/* 156:370 */     this.Q = 256;
/* 157:371 */     this.R = 33;
/* 158:372 */     this.S = 10;
/* 159:373 */     this.T = 0;
/* 160:374 */     this.U = 80;
/* 161:375 */     this.V = 33;
/* 162:376 */     this.W = 10;
/* 163:377 */     this.X = 0;
/* 164:378 */     this.Y = 80;
/* 165:379 */     this.Z = 33;
/* 166:380 */     this.aa = 10;
/* 167:381 */     this.ab = 0;
/* 168:382 */     this.ac = 80;
/* 169:383 */     this.ad = 17;
/* 170:384 */     this.ae = 20;
/* 171:385 */     this.af = 0;
/* 172:386 */     this.ag = 128;
/* 173:387 */     this.ah = 9;
/* 174:388 */     this.ai = 20;
/* 175:389 */     this.aj = 0;
/* 176:390 */     this.ak = 64;
/* 177:391 */     this.al = 9;
/* 178:392 */     this.am = 2;
/* 179:393 */     this.an = 0;
/* 180:394 */     this.ao = 32;
/* 181:395 */     this.redStoneRadius = 8;
/* 182:396 */     this.redstonePerChunk = 8;
/* 183:397 */     this.redstoneY1 = 0;
/* 184:398 */     this.redstoneY2 = 16;
/* 185:399 */     this.diamondRadius = 8;
/* 186:400 */     this.diamondPerChunk = 1;
/* 187:401 */     this.diamondY1 = 0;
/* 188:402 */     this.diamondY2 = 16;
/* 189:403 */     this.lapisRadius = 7;
/* 190:404 */     this.lapisPerChunk = 1;
/* 191:405 */     this.az = 16;
/* 192:406 */     this.aA = 16;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public boolean equals(Object paramObject)
/* 196:    */   {
/* 197:411 */     if (this == paramObject) {
/* 198:412 */       return true;
/* 199:    */     }
/* 200:414 */     if ((paramObject == null) || (getClass() != paramObject.getClass())) {
/* 201:415 */       return false;
/* 202:    */     }
/* 203:418 */     bgn localbgn = (bgn)paramObject;
/* 204:420 */     if (this.aa != localbgn.aa) {
/* 205:421 */       return false;
/* 206:    */     }
/* 207:423 */     if (this.ac != localbgn.ac) {
/* 208:424 */       return false;
/* 209:    */     }
/* 210:426 */     if (this.ab != localbgn.ab) {
/* 211:427 */       return false;
/* 212:    */     }
/* 213:429 */     if (this.Z != localbgn.Z) {
/* 214:430 */       return false;
/* 215:    */     }
/* 216:432 */     if (Float.compare(localbgn.l, this.l) != 0) {
/* 217:433 */       return false;
/* 218:    */     }
/* 219:435 */     if (Float.compare(localbgn.o, this.o) != 0) {
/* 220:436 */       return false;
/* 221:    */     }
/* 222:438 */     if (Float.compare(localbgn.n, this.n) != 0) {
/* 223:439 */       return false;
/* 224:    */     }
/* 225:441 */     if (Float.compare(localbgn.q, this.q) != 0) {
/* 226:442 */       return false;
/* 227:    */     }
/* 228:444 */     if (Float.compare(localbgn.p, this.p) != 0) {
/* 229:445 */       return false;
/* 230:    */     }
/* 231:447 */     if (this.H != localbgn.H) {
/* 232:448 */       return false;
/* 233:    */     }
/* 234:450 */     if (this.ae != localbgn.ae) {
/* 235:451 */       return false;
/* 236:    */     }
/* 237:453 */     if (this.ag != localbgn.ag) {
/* 238:454 */       return false;
/* 239:    */     }
/* 240:456 */     if (this.af != localbgn.af) {
/* 241:457 */       return false;
/* 242:    */     }
/* 243:459 */     if (this.ad != localbgn.ad) {
/* 244:460 */       return false;
/* 245:    */     }
/* 246:462 */     if (Float.compare(localbgn.b, this.b) != 0) {
/* 247:463 */       return false;
/* 248:    */     }
/* 249:465 */     if (Float.compare(localbgn.h, this.h) != 0) {
/* 250:466 */       return false;
/* 251:    */     }
/* 252:468 */     if (Float.compare(localbgn.f, this.f) != 0) {
/* 253:469 */       return false;
/* 254:    */     }
/* 255:471 */     if (Float.compare(localbgn.g, this.g) != 0) {
/* 256:472 */       return false;
/* 257:    */     }
/* 258:474 */     if (this.diamondPerChunk != localbgn.diamondPerChunk) {
/* 259:475 */       return false;
/* 260:    */     }
/* 261:477 */     if (this.diamondY2 != localbgn.diamondY2) {
/* 262:478 */       return false;
/* 263:    */     }
/* 264:480 */     if (this.diamondY1 != localbgn.diamondY1) {
/* 265:481 */       return false;
/* 266:    */     }
/* 267:483 */     if (this.diamondRadius != localbgn.diamondRadius) {
/* 268:484 */       return false;
/* 269:    */     }
/* 270:486 */     if (this.W != localbgn.W) {
/* 271:487 */       return false;
/* 272:    */     }
/* 273:489 */     if (this.Y != localbgn.Y) {
/* 274:490 */       return false;
/* 275:    */     }
/* 276:492 */     if (this.X != localbgn.X) {
/* 277:493 */       return false;
/* 278:    */     }
/* 279:495 */     if (this.V != localbgn.V) {
/* 280:496 */       return false;
/* 281:    */     }
/* 282:498 */     if (this.dirtPerChunk != localbgn.dirtPerChunk) {
/* 283:499 */       return false;
/* 284:    */     }
/* 285:501 */     if (this.M != localbgn.M) {
/* 286:502 */       return false;
/* 287:    */     }
/* 288:504 */     if (this.L != localbgn.L) {
/* 289:505 */       return false;
/* 290:    */     }
/* 291:507 */     if (this.dirtRadius != localbgn.dirtRadius) {
/* 292:508 */       return false;
/* 293:    */     }
/* 294:510 */     if (this.u != localbgn.u) {
/* 295:511 */       return false;
/* 296:    */     }
/* 297:513 */     if (this.G != localbgn.G) {
/* 298:514 */       return false;
/* 299:    */     }
/* 300:516 */     if (this.am != localbgn.am) {
/* 301:517 */       return false;
/* 302:    */     }
/* 303:519 */     if (this.ao != localbgn.ao) {
/* 304:520 */       return false;
/* 305:    */     }
/* 306:522 */     if (this.an != localbgn.an) {
/* 307:523 */       return false;
/* 308:    */     }
/* 309:525 */     if (this.al != localbgn.al) {
/* 310:526 */       return false;
/* 311:    */     }
/* 312:528 */     if (this.S != localbgn.S) {
/* 313:529 */       return false;
/* 314:    */     }
/* 315:531 */     if (this.U != localbgn.U) {
/* 316:532 */       return false;
/* 317:    */     }
/* 318:534 */     if (this.T != localbgn.T) {
/* 319:535 */       return false;
/* 320:    */     }
/* 321:537 */     if (this.R != localbgn.R) {
/* 322:538 */       return false;
/* 323:    */     }
/* 324:540 */     if (this.O != localbgn.O) {
/* 325:541 */       return false;
/* 326:    */     }
/* 327:543 */     if (this.Q != localbgn.Q) {
/* 328:544 */       return false;
/* 329:    */     }
/* 330:546 */     if (this.P != localbgn.P) {
/* 331:547 */       return false;
/* 332:    */     }
/* 333:549 */     if (this.N != localbgn.N) {
/* 334:550 */       return false;
/* 335:    */     }
/* 336:552 */     if (Float.compare(localbgn.c, this.c) != 0) {
/* 337:553 */       return false;
/* 338:    */     }
/* 339:555 */     if (this.ai != localbgn.ai) {
/* 340:556 */       return false;
/* 341:    */     }
/* 342:558 */     if (this.ak != localbgn.ak) {
/* 343:559 */       return false;
/* 344:    */     }
/* 345:561 */     if (this.aj != localbgn.aj) {
/* 346:562 */       return false;
/* 347:    */     }
/* 348:564 */     if (this.ah != localbgn.ah) {
/* 349:565 */       return false;
/* 350:    */     }
/* 351:567 */     if (this.az != localbgn.az) {
/* 352:568 */       return false;
/* 353:    */     }
/* 354:570 */     if (this.lapisPerChunk != localbgn.lapisPerChunk) {
/* 355:571 */       return false;
/* 356:    */     }
/* 357:573 */     if (this.lapisRadius != localbgn.lapisRadius) {
/* 358:574 */       return false;
/* 359:    */     }
/* 360:576 */     if (this.aA != localbgn.aA) {
/* 361:577 */       return false;
/* 362:    */     }
/* 363:579 */     if (this.E != localbgn.E) {
/* 364:580 */       return false;
/* 365:    */     }
/* 366:582 */     if (Float.compare(localbgn.e, this.e) != 0) {
/* 367:583 */       return false;
/* 368:    */     }
/* 369:585 */     if (Float.compare(localbgn.i, this.i) != 0) {
/* 370:586 */       return false;
/* 371:    */     }
/* 372:588 */     if (Float.compare(localbgn.j, this.j) != 0) {
/* 373:589 */       return false;
/* 374:    */     }
/* 375:591 */     if (Float.compare(localbgn.k, this.k) != 0) {
/* 376:592 */       return false;
/* 377:    */     }
/* 378:594 */     if (this.redstonePerChunk != localbgn.redstonePerChunk) {
/* 379:595 */       return false;
/* 380:    */     }
/* 381:597 */     if (this.redstoneY2 != localbgn.redstoneY2) {
/* 382:598 */       return false;
/* 383:    */     }
/* 384:600 */     if (this.redstoneY1 != localbgn.redstoneY1) {
/* 385:601 */       return false;
/* 386:    */     }
/* 387:603 */     if (this.redStoneRadius != localbgn.redStoneRadius) {
/* 388:604 */       return false;
/* 389:    */     }
/* 390:606 */     if (this.I != localbgn.I) {
/* 391:607 */       return false;
/* 392:    */     }
/* 393:609 */     if (this.r != localbgn.r) {
/* 394:610 */       return false;
/* 395:    */     }
/* 396:612 */     if (Float.compare(localbgn.m, this.m) != 0) {
/* 397:613 */       return false;
/* 398:    */     }
/* 399:615 */     if (Float.compare(localbgn.d, this.d) != 0) {
/* 400:616 */       return false;
/* 401:    */     }
/* 402:618 */     if (this.s != localbgn.s) {
/* 403:619 */       return false;
/* 404:    */     }
/* 405:621 */     if (this.t != localbgn.t) {
/* 406:622 */       return false;
/* 407:    */     }
/* 408:624 */     if (this.D != localbgn.D) {
/* 409:625 */       return false;
/* 410:    */     }
/* 411:627 */     if (this.F != localbgn.F) {
/* 412:628 */       return false;
/* 413:    */     }
/* 414:630 */     if (this.x != localbgn.x) {
/* 415:631 */       return false;
/* 416:    */     }
/* 417:633 */     if (this.A != localbgn.A) {
/* 418:634 */       return false;
/* 419:    */     }
/* 420:636 */     if (this.v != localbgn.v) {
/* 421:637 */       return false;
/* 422:    */     }
/* 423:639 */     if (this.y != localbgn.y) {
/* 424:640 */       return false;
/* 425:    */     }
/* 426:642 */     if (this.z != localbgn.z) {
/* 427:643 */       return false;
/* 428:    */     }
/* 429:645 */     if (this.w != localbgn.w) {
/* 430:646 */       return false;
/* 431:    */     }
/* 432:648 */     if (this.B != localbgn.B) {
/* 433:649 */       return false;
/* 434:    */     }
/* 435:651 */     if (this.C != localbgn.C) {
/* 436:652 */       return false;
/* 437:    */     }
/* 438:655 */     return true;
/* 439:    */   }
/* 440:    */   
/* 441:    */   public int hashCode()
/* 442:    */   {
/* 443:660 */     int i1 = this.b != 0.0F ? Float.floatToIntBits(this.b) : 0;
/* 444:661 */     i1 = 31 * i1 + (this.c != 0.0F ? Float.floatToIntBits(this.c) : 0);
/* 445:662 */     i1 = 31 * i1 + (this.d != 0.0F ? Float.floatToIntBits(this.d) : 0);
/* 446:663 */     i1 = 31 * i1 + (this.e != 0.0F ? Float.floatToIntBits(this.e) : 0);
/* 447:664 */     i1 = 31 * i1 + (this.f != 0.0F ? Float.floatToIntBits(this.f) : 0);
/* 448:665 */     i1 = 31 * i1 + (this.g != 0.0F ? Float.floatToIntBits(this.g) : 0);
/* 449:666 */     i1 = 31 * i1 + (this.h != 0.0F ? Float.floatToIntBits(this.h) : 0);
/* 450:667 */     i1 = 31 * i1 + (this.i != 0.0F ? Float.floatToIntBits(this.i) : 0);
/* 451:668 */     i1 = 31 * i1 + (this.j != 0.0F ? Float.floatToIntBits(this.j) : 0);
/* 452:669 */     i1 = 31 * i1 + (this.k != 0.0F ? Float.floatToIntBits(this.k) : 0);
/* 453:670 */     i1 = 31 * i1 + (this.l != 0.0F ? Float.floatToIntBits(this.l) : 0);
/* 454:671 */     i1 = 31 * i1 + (this.m != 0.0F ? Float.floatToIntBits(this.m) : 0);
/* 455:672 */     i1 = 31 * i1 + (this.n != 0.0F ? Float.floatToIntBits(this.n) : 0);
/* 456:673 */     i1 = 31 * i1 + (this.o != 0.0F ? Float.floatToIntBits(this.o) : 0);
/* 457:674 */     i1 = 31 * i1 + (this.p != 0.0F ? Float.floatToIntBits(this.p) : 0);
/* 458:675 */     i1 = 31 * i1 + (this.q != 0.0F ? Float.floatToIntBits(this.q) : 0);
/* 459:676 */     i1 = 31 * i1 + this.r;
/* 460:677 */     i1 = 31 * i1 + (this.s ? 1 : 0);
/* 461:678 */     i1 = 31 * i1 + (this.t ? 1 : 0);
/* 462:679 */     i1 = 31 * i1 + this.u;
/* 463:680 */     i1 = 31 * i1 + (this.v ? 1 : 0);
/* 464:681 */     i1 = 31 * i1 + (this.w ? 1 : 0);
/* 465:682 */     i1 = 31 * i1 + (this.x ? 1 : 0);
/* 466:683 */     i1 = 31 * i1 + (this.y ? 1 : 0);
/* 467:684 */     i1 = 31 * i1 + (this.z ? 1 : 0);
/* 468:685 */     i1 = 31 * i1 + (this.A ? 1 : 0);
/* 469:686 */     i1 = 31 * i1 + (this.B ? 1 : 0);
/* 470:687 */     i1 = 31 * i1 + this.C;
/* 471:688 */     i1 = 31 * i1 + (this.D ? 1 : 0);
/* 472:689 */     i1 = 31 * i1 + this.E;
/* 473:690 */     i1 = 31 * i1 + (this.F ? 1 : 0);
/* 474:691 */     i1 = 31 * i1 + this.G;
/* 475:692 */     i1 = 31 * i1 + this.H;
/* 476:693 */     i1 = 31 * i1 + this.I;
/* 477:694 */     i1 = 31 * i1 + this.dirtRadius;
/* 478:695 */     i1 = 31 * i1 + this.dirtPerChunk;
/* 479:696 */     i1 = 31 * i1 + this.L;
/* 480:697 */     i1 = 31 * i1 + this.M;
/* 481:698 */     i1 = 31 * i1 + this.N;
/* 482:699 */     i1 = 31 * i1 + this.O;
/* 483:700 */     i1 = 31 * i1 + this.P;
/* 484:701 */     i1 = 31 * i1 + this.Q;
/* 485:702 */     i1 = 31 * i1 + this.R;
/* 486:703 */     i1 = 31 * i1 + this.S;
/* 487:704 */     i1 = 31 * i1 + this.T;
/* 488:705 */     i1 = 31 * i1 + this.U;
/* 489:706 */     i1 = 31 * i1 + this.V;
/* 490:707 */     i1 = 31 * i1 + this.W;
/* 491:708 */     i1 = 31 * i1 + this.X;
/* 492:709 */     i1 = 31 * i1 + this.Y;
/* 493:710 */     i1 = 31 * i1 + this.Z;
/* 494:711 */     i1 = 31 * i1 + this.aa;
/* 495:712 */     i1 = 31 * i1 + this.ab;
/* 496:713 */     i1 = 31 * i1 + this.ac;
/* 497:714 */     i1 = 31 * i1 + this.ad;
/* 498:715 */     i1 = 31 * i1 + this.ae;
/* 499:716 */     i1 = 31 * i1 + this.af;
/* 500:717 */     i1 = 31 * i1 + this.ag;
/* 501:718 */     i1 = 31 * i1 + this.ah;
/* 502:719 */     i1 = 31 * i1 + this.ai;
/* 503:720 */     i1 = 31 * i1 + this.aj;
/* 504:721 */     i1 = 31 * i1 + this.ak;
/* 505:722 */     i1 = 31 * i1 + this.al;
/* 506:723 */     i1 = 31 * i1 + this.am;
/* 507:724 */     i1 = 31 * i1 + this.an;
/* 508:725 */     i1 = 31 * i1 + this.ao;
/* 509:726 */     i1 = 31 * i1 + this.redStoneRadius;
/* 510:727 */     i1 = 31 * i1 + this.redstonePerChunk;
/* 511:728 */     i1 = 31 * i1 + this.redstoneY1;
/* 512:729 */     i1 = 31 * i1 + this.redstoneY2;
/* 513:730 */     i1 = 31 * i1 + this.diamondRadius;
/* 514:731 */     i1 = 31 * i1 + this.diamondPerChunk;
/* 515:732 */     i1 = 31 * i1 + this.diamondY1;
/* 516:733 */     i1 = 31 * i1 + this.diamondY2;
/* 517:734 */     i1 = 31 * i1 + this.lapisRadius;
/* 518:735 */     i1 = 31 * i1 + this.lapisPerChunk;
/* 519:736 */     i1 = 31 * i1 + this.az;
/* 520:737 */     i1 = 31 * i1 + this.aA;
/* 521:738 */     return i1;
/* 522:    */   }
/* 523:    */   
/* 524:    */   public bgl b()
/* 525:    */   {
/* 526:742 */     return new bgl(this, null);
/* 527:    */   }
/* 528:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bgn
 * JD-Core Version:    0.7.0.1
 */
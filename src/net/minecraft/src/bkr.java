package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.Collections;
/*   4:    */ import java.util.Iterator;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Random;
/*   7:    */ 
/*   8:    */ public class bkr
/*   9:    */   extends blb
/*  10:    */ {
/*  11:    */   private blf o;
/*  12:    */   private blf p;
/*  13:216 */   private List<blb> q = Lists.newArrayList();
/*  14:    */   
/*  15:    */   public bkr() {}
/*  16:    */   
/*  17:    */   public bkr(Random paramRandom, int paramInt1, int paramInt2, EnumDirection paramej)
/*  18:    */   {
/*  19:224 */     super(0);
/*  20:    */     
/*  21:226 */     this.m = paramej;
/*  22:228 */     switch (bkj.a[this.m.ordinal()])
/*  23:    */     {
/*  24:    */     case 1: 
/*  25:    */     case 2: 
/*  26:231 */       this.l = new bjb(paramInt1, 39, paramInt2, paramInt1 + 58 - 1, 61, paramInt2 + 58 - 1);
/*  27:232 */       break;
/*  28:    */     default: 
/*  29:234 */       this.l = new bjb(paramInt1, 39, paramInt2, paramInt1 + 58 - 1, 61, paramInt2 + 58 - 1);
/*  30:    */     }
/*  31:238 */     List<blf> localList = a(paramRandom);
/*  32:    */     
/*  33:240 */     this.o.d = true;
/*  34:241 */     this.q.add(new bkz(this.m, this.o));
/*  35:242 */     this.q.add(new bkt(this.m, this.p, paramRandom));
/*  36:    */     
/*  37:244 */     ArrayList<bks> localArrayList = Lists.newArrayList();
/*  38:245 */     localArrayList.add(new bkl(null));
/*  39:246 */     localArrayList.add(new bkn(null));
/*  40:247 */     localArrayList.add(new bko(null));
/*  41:248 */     localArrayList.add(new bkk(null));
/*  42:249 */     localArrayList.add(new bkm(null));
/*  43:250 */     localArrayList.add(new bkq(null));
/*  44:251 */     localArrayList.add(new bkp(null));
/*  45:253 */     for (Iterator<blf> localIterator1 = localList.iterator(); localIterator1.hasNext();)
/*  46:    */     {
/*  47:253 */       blf localblf = (blf)localIterator1.next();
/*  48:254 */       if ((!localblf.d) && (!localblf.b())) {
/*  49:256 */         for (Iterator<bks> localIterator2 = localArrayList.iterator(); localIterator2.hasNext();)
/*  50:    */         {
/*  51:256 */           bks localObject1 = (bks)localIterator2.next();
/*  52:257 */           if (((bks)localObject1).a(localblf))
/*  53:    */           {
/*  54:258 */             this.q.add(((bks)localObject1).a(this.m, localblf, paramRandom));
/*  55:259 */             break;
/*  56:    */           }
/*  57:    */         }
/*  58:    */       }
/*  59:    */     }
/*  60:    */     blf localblf;
/*  61:    */     
/*  62:266 */     int i = this.l.b;
/*  63:267 */     int j = a(9, 22);
/*  64:268 */     int k = b(9, 22);
/*  65:269 */     for (Iterator<blb> localObject1 = this.q.iterator(); localObject1.hasNext();)
/*  66:    */     {
/*  67:269 */       blb localObject2 = localObject1.next();
/*  68:270 */       ((blb)localObject2).c().a(j, i, k);
/*  69:    */     }
/*  70:275 */     bjb localObject1 = bjb.a(a(1, 1), d(1), b(1, 1), a(23, 21), d(8), b(23, 21));
/*  71:276 */     bjb localObject2 = bjb.a(a(34, 1), d(1), b(34, 1), a(56, 21), d(8), b(56, 21));
/*  72:277 */     bjb localbjb = bjb.a(a(22, 22), d(13), b(22, 22), a(35, 35), d(17), b(35, 35));
/*  73:    */     
/*  74:    */ 
/*  75:280 */     int m = paramRandom.nextInt();
/*  76:281 */     this.q.add(new ble(this.m, (bjb)localObject1, m++));
/*  77:282 */     this.q.add(new ble(this.m, (bjb)localObject2, m++));
/*  78:    */     
/*  79:284 */     this.q.add(new bla(this.m, localbjb));
/*  80:    */   }
/*  81:    */   
/*  82:    */   private List<blf> a(Random paramRandom)
/*  83:    */   {
/*  84:289 */     blf[] arrayOfblf = new blf[75];
/*  85:    */     int j;
/*  86:    */     int k;
/*  87:    */     int m;
/*  88:291 */     for (int i = 0; i < 5; i++) {
/*  89:292 */       for (j = 0; j < 4; j++)
/*  90:    */       {
/*  91:293 */         k = 0;
/*  92:294 */         m = a(i, k, j);
/*  93:295 */         arrayOfblf[m] = new blf(m);
/*  94:    */       }
/*  95:    */     }
/*  96:298 */     for (int i = 0; i < 5; i++) {
/*  97:299 */       for (j = 0; j < 4; j++)
/*  98:    */       {
/*  99:300 */         k = 1;
/* 100:301 */         m = a(i, k, j);
/* 101:302 */         arrayOfblf[m] = new blf(m);
/* 102:    */       }
/* 103:    */     }
/* 104:305 */     for (int i = 1; i < 4; i++) {
/* 105:306 */       for (j = 0; j < 2; j++)
/* 106:    */       {
/* 107:307 */         k = 2;
/* 108:308 */         m = a(i, k, j);
/* 109:309 */         arrayOfblf[m] = new blf(m);
/* 110:    */       }
/* 111:    */     }
/* 112:313 */     this.o = arrayOfblf[g];
/* 113:    */     
/* 114:    */     int i4;
/* 115:    */     int i5;
/* 116:    */     int i6;
/* 117:315 */     for (int i = 0; i < 5; i++) {
/* 118:316 */       for (j = 0; j < 5; j++) {
/* 119:317 */         for (k = 0; k < 3; k++)
/* 120:    */         {
/* 121:318 */           m = a(i, k, j);
/* 122:319 */           if (arrayOfblf[m] != null) {
/* 123:322 */             for (EnumDirection localej : EnumDirection.values())
/* 124:    */             {
/* 125:323 */               i4 = i + localej.g();
/* 126:324 */               i5 = k + localej.h();
/* 127:325 */               i6 = j + localej.i();
/* 128:326 */               if ((i4 >= 0) && (i4 < 5) && (i6 >= 0) && (i6 < 5) && (i5 >= 0) && (i5 < 3))
/* 129:    */               {
/* 130:327 */                 int i7 = a(i4, i5, i6);
/* 131:328 */                 if (arrayOfblf[i7] != null) {
/* 132:331 */                   if (i6 != j) {
/* 133:332 */                     arrayOfblf[m].a(localej.opposite(), arrayOfblf[i7]);
/* 134:    */                   } else {
/* 135:334 */                     arrayOfblf[m].a(localej, arrayOfblf[i7]);
/* 136:    */                   }
/* 137:    */                 }
/* 138:    */               }
/* 139:    */             }
/* 140:    */           }
/* 141:    */         }
/* 142:    */       }
/* 143:    */     }
/* 144:    */     blf localblf1;
/* 145:343 */     arrayOfblf[h].a(EnumDirection.UP, localblf1 = new blf(1003));
/* 146:    */     blf localblf2;
/* 147:344 */     arrayOfblf[i].a(EnumDirection.SOUTH, localblf2 = new blf(1001));
/* 148:    */     blf localblf3;
/* 149:345 */     arrayOfblf[bkr.j].a(EnumDirection.SOUTH, localblf3 = new blf(1002));
/* 150:346 */     localblf1.d = true;
/* 151:347 */     localblf2.d = true;
/* 152:348 */     localblf3.d = true;
/* 153:349 */     this.o.e = true;
/* 154:    */     
/* 155:    */ 
/* 156:352 */     this.p = arrayOfblf[a(paramRandom.nextInt(4), 0, 2)];
/* 157:353 */     this.p.d = true;
/* 158:354 */     this.p.b[EnumDirection.EAST.a()].d = true;
/* 159:355 */     this.p.b[EnumDirection.NORTH.a()].d = true;
/* 160:356 */     this.p.b[EnumDirection.EAST.a()].b[EnumDirection.NORTH.a()].d = true;
/* 161:357 */     this.p.b[EnumDirection.UP.a()].d = true;
/* 162:358 */     this.p.b[EnumDirection.EAST.a()].b[EnumDirection.UP.a()].d = true;
/* 163:359 */     this.p.b[EnumDirection.NORTH.a()].b[EnumDirection.UP.a()].d = true;
/* 164:360 */     this.p.b[EnumDirection.EAST.a()].b[EnumDirection.NORTH.a()].b[EnumDirection.UP.a()].d = true;
/* 165:    */     
/* 166:362 */     ArrayList<blf> localArrayList = Lists.newArrayList();
/* 167:363 */     for (blf localblf : arrayOfblf) {
/* 168:364 */       if (localblf != null)
/* 169:    */       {
/* 170:365 */         localblf.a();
/* 171:366 */         localArrayList.add(localblf);
/* 172:    */       }
/* 173:    */     }
/* 174:369 */     localblf1.a();
/* 175:    */     
/* 176:371 */     Collections.shuffle(localArrayList, paramRandom);
/* 177:372 */     int n = 1;
/* 178:373 */     for (blf localblf4 : localArrayList)
/* 179:    */     {
/* 180:375 */       int i3 = 0;
/* 181:376 */       i4 = 0;
/* 182:377 */       while ((i3 < 2) && (i4 < 5))
/* 183:    */       {
/* 184:378 */         i4++;
/* 185:    */         
/* 186:380 */         i5 = paramRandom.nextInt(6);
/* 187:381 */         if (localblf4.c[i5])
/* 188:    */         {
/* 189:382 */           i6 = EnumDirection.a(i5).opposite().a();
/* 190:    */           
/* 191:    */ 
/* 192:385 */           localblf4.c[i5] = false;
/* 193:386 */           localblf4.b[i5].c[i6] = false;
/* 194:388 */           if ((localblf4.a(n++)) && (localblf4.b[i5].a(n++)))
/* 195:    */           {
/* 196:389 */             i3++;
/* 197:    */           }
/* 198:    */           else
/* 199:    */           {
/* 200:392 */             localblf4.c[i5] = true;
/* 201:393 */             localblf4.b[i5].c[i6] = true;
/* 202:    */           }
/* 203:    */         }
/* 204:    */       }
/* 205:    */     }
/* 206:398 */     localArrayList.add(localblf1);
/* 207:399 */     localArrayList.add(localblf2);
/* 208:400 */     localArrayList.add(localblf3);
/* 209:    */     
/* 210:402 */     return localArrayList;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/* 214:    */   {
/* 215:413 */     a(false, 0, paramaqu, paramRandom, parambjb);
/* 216:    */     
/* 217:    */ 
/* 218:416 */     a(true, 33, paramaqu, paramRandom, parambjb);
/* 219:    */     
/* 220:    */ 
/* 221:419 */     b(paramaqu, paramRandom, parambjb);
/* 222:    */     
/* 223:421 */     c(paramaqu, paramRandom, parambjb);
/* 224:422 */     d(paramaqu, paramRandom, parambjb);
/* 225:    */     
/* 226:424 */     e(paramaqu, paramRandom, parambjb);
/* 227:425 */     f(paramaqu, paramRandom, parambjb);
/* 228:426 */     g(paramaqu, paramRandom, parambjb);
/* 229:    */     int j;
/* 230:429 */     for (int i = 0; i < 7; i++) {
/* 231:430 */       for (j = 0; j < 7;)
/* 232:    */       {
/* 233:431 */         if ((j == 0) && (i == 3)) {
/* 234:433 */           j = 6;
/* 235:    */         }
/* 236:436 */         int k = i * 9;
/* 237:437 */         int m = j * 9;
/* 238:438 */         for (int n = 0; n < 4; n++) {
/* 239:439 */           for (int i1 = 0; i1 < 4; i1++)
/* 240:    */           {
/* 241:440 */             a(paramaqu, b, k + n, 0, m + i1, parambjb);
/* 242:441 */             b(paramaqu, b, k + n, -1, m + i1, parambjb);
/* 243:    */           }
/* 244:    */         }
/* 245:445 */         if ((i == 0) || (i == 6)) {
/* 246:446 */           j++;
/* 247:    */         } else {
/* 248:448 */           j += 6;
/* 249:    */         }
/* 250:    */       }
/* 251:    */     }
/* 252:454 */     for (int i = 0; i < 5; i++)
/* 253:    */     {
/* 254:455 */       a(paramaqu, parambjb, -1 - i, 0 + i * 2, -1 - i, -1 - i, 23, 58 + i, f, f, false);
/* 255:456 */       a(paramaqu, parambjb, 58 + i, 0 + i * 2, -1 - i, 58 + i, 23, 58 + i, f, f, false);
/* 256:457 */       a(paramaqu, parambjb, 0 - i, 0 + i * 2, -1 - i, 57 + i, 23, -1 - i, f, f, false);
/* 257:458 */       a(paramaqu, parambjb, 0 - i, 0 + i * 2, 58 + i, 57 + i, 23, 58 + i, f, f, false);
/* 258:    */     }
/* 259:461 */     for (blb localblb : this.q) {
/* 260:462 */       if (localblb.c().a(parambjb)) {
/* 261:463 */         localblb.a(paramaqu, paramRandom, parambjb);
/* 262:    */       }
/* 263:    */     }
/* 264:467 */     return true;
/* 265:    */   }
/* 266:    */   
/* 267:    */   private void a(boolean paramBoolean, int paramInt, World paramaqu, Random paramRandom, bjb parambjb)
/* 268:    */   {
/* 269:472 */     int i = 24;
/* 270:473 */     if (a(parambjb, paramInt, 0, paramInt + 23, 20))
/* 271:    */     {
/* 272:474 */       a(paramaqu, parambjb, paramInt + 0, 0, 0, paramInt + 24, 0, 20, a, a, false);
/* 273:    */       
/* 274:476 */       a(paramaqu, parambjb, paramInt + 0, 1, 0, paramInt + 24, 10, 20, f, f, false);
/* 275:478 */       for (int j = 0; j < 4; j++)
/* 276:    */       {
/* 277:479 */         a(paramaqu, parambjb, paramInt + j, j + 1, j, paramInt + j, j + 1, 20, b, b, false);
/* 278:480 */         a(paramaqu, parambjb, paramInt + j + 7, j + 5, j + 7, paramInt + j + 7, j + 5, 20, b, b, false);
/* 279:481 */         a(paramaqu, parambjb, paramInt + 17 - j, j + 5, j + 7, paramInt + 17 - j, j + 5, 20, b, b, false);
/* 280:482 */         a(paramaqu, parambjb, paramInt + 24 - j, j + 1, j, paramInt + 24 - j, j + 1, 20, b, b, false);
/* 281:    */         
/* 282:484 */         a(paramaqu, parambjb, paramInt + j + 1, j + 1, j, paramInt + 23 - j, j + 1, j, b, b, false);
/* 283:485 */         a(paramaqu, parambjb, paramInt + j + 8, j + 5, j + 7, paramInt + 16 - j, j + 5, j + 7, b, b, false);
/* 284:    */       }
/* 285:487 */       a(paramaqu, parambjb, paramInt + 4, 4, 4, paramInt + 6, 4, 20, a, a, false);
/* 286:488 */       a(paramaqu, parambjb, paramInt + 7, 4, 4, paramInt + 17, 4, 6, a, a, false);
/* 287:489 */       a(paramaqu, parambjb, paramInt + 18, 4, 4, paramInt + 20, 4, 20, a, a, false);
/* 288:490 */       a(paramaqu, parambjb, paramInt + 11, 8, 11, paramInt + 13, 8, 20, a, a, false);
/* 289:491 */       a(paramaqu, d, paramInt + 12, 9, 12, parambjb);
/* 290:492 */       a(paramaqu, d, paramInt + 12, 9, 15, parambjb);
/* 291:493 */       a(paramaqu, d, paramInt + 12, 9, 18, parambjb);
/* 292:    */       
/* 293:495 */       int j = paramBoolean ? paramInt + 19 : paramInt + 5;
/* 294:496 */       int k = paramBoolean ? paramInt + 5 : paramInt + 19;
/* 295:497 */       for (int m = 20; m >= 5; m -= 3) {
/* 296:498 */         a(paramaqu, d, j, 5, m, parambjb);
/* 297:    */       }
/* 298:500 */       for (int m = 19; m >= 7; m -= 3) {
/* 299:501 */         a(paramaqu, d, k, 5, m, parambjb);
/* 300:    */       }
/* 301:503 */       for (int m = 0; m < 4; m++)
/* 302:    */       {
/* 303:504 */         int n = paramBoolean ? paramInt + (24 - (17 - m * 3)) : paramInt + 17 - m * 3;
/* 304:505 */         a(paramaqu, d, n, 5, 5, parambjb);
/* 305:    */       }
/* 306:507 */       a(paramaqu, d, k, 5, 5, parambjb);
/* 307:    */       
/* 308:    */ 
/* 309:510 */       a(paramaqu, parambjb, paramInt + 11, 1, 12, paramInt + 13, 7, 12, a, a, false);
/* 310:511 */       a(paramaqu, parambjb, paramInt + 12, 1, 11, paramInt + 12, 7, 13, a, a, false);
/* 311:    */     }
/* 312:    */   }
/* 313:    */   
/* 314:    */   private void b(World paramaqu, Random paramRandom, bjb parambjb)
/* 315:    */   {
/* 316:517 */     if (a(parambjb, 22, 5, 35, 17))
/* 317:    */     {
/* 318:519 */       a(paramaqu, parambjb, 25, 0, 0, 32, 8, 20, f, f, false);
/* 319:522 */       for (int i = 0; i < 4; i++)
/* 320:    */       {
/* 321:523 */         a(paramaqu, parambjb, 24, 2, 5 + i * 4, 24, 4, 5 + i * 4, b, b, false);
/* 322:524 */         a(paramaqu, parambjb, 22, 4, 5 + i * 4, 23, 4, 5 + i * 4, b, b, false);
/* 323:525 */         a(paramaqu, b, 25, 5, 5 + i * 4, parambjb);
/* 324:526 */         a(paramaqu, b, 26, 6, 5 + i * 4, parambjb);
/* 325:527 */         a(paramaqu, e, 26, 5, 5 + i * 4, parambjb);
/* 326:    */         
/* 327:529 */         a(paramaqu, parambjb, 33, 2, 5 + i * 4, 33, 4, 5 + i * 4, b, b, false);
/* 328:530 */         a(paramaqu, parambjb, 34, 4, 5 + i * 4, 35, 4, 5 + i * 4, b, b, false);
/* 329:531 */         a(paramaqu, b, 32, 5, 5 + i * 4, parambjb);
/* 330:532 */         a(paramaqu, b, 31, 6, 5 + i * 4, parambjb);
/* 331:533 */         a(paramaqu, e, 31, 5, 5 + i * 4, parambjb);
/* 332:    */         
/* 333:535 */         a(paramaqu, parambjb, 27, 6, 5 + i * 4, 30, 6, 5 + i * 4, a, a, false);
/* 334:    */       }
/* 335:    */     }
/* 336:    */   }
/* 337:    */   
/* 338:    */   private void c(World paramaqu, Random paramRandom, bjb parambjb)
/* 339:    */   {
/* 340:543 */     if (a(parambjb, 15, 20, 42, 21))
/* 341:    */     {
/* 342:544 */       a(paramaqu, parambjb, 15, 0, 21, 42, 0, 21, a, a, false);
/* 343:    */       
/* 344:546 */       a(paramaqu, parambjb, 26, 1, 21, 31, 3, 21, f, f, false);
/* 345:    */       
/* 346:    */ 
/* 347:    */ 
/* 348:550 */       a(paramaqu, parambjb, 21, 12, 21, 36, 12, 21, a, a, false);
/* 349:551 */       a(paramaqu, parambjb, 17, 11, 21, 40, 11, 21, a, a, false);
/* 350:552 */       a(paramaqu, parambjb, 16, 10, 21, 41, 10, 21, a, a, false);
/* 351:553 */       a(paramaqu, parambjb, 15, 7, 21, 42, 9, 21, a, a, false);
/* 352:554 */       a(paramaqu, parambjb, 16, 6, 21, 41, 6, 21, a, a, false);
/* 353:555 */       a(paramaqu, parambjb, 17, 5, 21, 40, 5, 21, a, a, false);
/* 354:556 */       a(paramaqu, parambjb, 21, 4, 21, 36, 4, 21, a, a, false);
/* 355:557 */       a(paramaqu, parambjb, 22, 3, 21, 26, 3, 21, a, a, false);
/* 356:558 */       a(paramaqu, parambjb, 31, 3, 21, 35, 3, 21, a, a, false);
/* 357:559 */       a(paramaqu, parambjb, 23, 2, 21, 25, 2, 21, a, a, false);
/* 358:560 */       a(paramaqu, parambjb, 32, 2, 21, 34, 2, 21, a, a, false);
/* 359:    */       
/* 360:    */ 
/* 361:563 */       a(paramaqu, parambjb, 28, 4, 20, 29, 4, 21, b, b, false);
/* 362:564 */       a(paramaqu, b, 27, 3, 21, parambjb);
/* 363:565 */       a(paramaqu, b, 30, 3, 21, parambjb);
/* 364:566 */       a(paramaqu, b, 26, 2, 21, parambjb);
/* 365:567 */       a(paramaqu, b, 31, 2, 21, parambjb);
/* 366:568 */       a(paramaqu, b, 25, 1, 21, parambjb);
/* 367:569 */       a(paramaqu, b, 32, 1, 21, parambjb);
/* 368:570 */       for (int i = 0; i < 7; i++)
/* 369:    */       {
/* 370:571 */         a(paramaqu, c, 28 - i, 6 + i, 21, parambjb);
/* 371:572 */         a(paramaqu, c, 29 + i, 6 + i, 21, parambjb);
/* 372:    */       }
/* 373:574 */       for (int i = 0; i < 4; i++)
/* 374:    */       {
/* 375:575 */         a(paramaqu, c, 28 - i, 9 + i, 21, parambjb);
/* 376:576 */         a(paramaqu, c, 29 + i, 9 + i, 21, parambjb);
/* 377:    */       }
/* 378:578 */       a(paramaqu, c, 28, 12, 21, parambjb);
/* 379:579 */       a(paramaqu, c, 29, 12, 21, parambjb);
/* 380:580 */       for (int i = 0; i < 3; i++)
/* 381:    */       {
/* 382:581 */         a(paramaqu, c, 22 - i * 2, 8, 21, parambjb);
/* 383:582 */         a(paramaqu, c, 22 - i * 2, 9, 21, parambjb);
/* 384:    */         
/* 385:584 */         a(paramaqu, c, 35 + i * 2, 8, 21, parambjb);
/* 386:585 */         a(paramaqu, c, 35 + i * 2, 9, 21, parambjb);
/* 387:    */       }
/* 388:590 */       a(paramaqu, parambjb, 15, 13, 21, 42, 15, 21, f, f, false);
/* 389:591 */       a(paramaqu, parambjb, 15, 1, 21, 15, 6, 21, f, f, false);
/* 390:592 */       a(paramaqu, parambjb, 16, 1, 21, 16, 5, 21, f, f, false);
/* 391:593 */       a(paramaqu, parambjb, 17, 1, 21, 20, 4, 21, f, f, false);
/* 392:594 */       a(paramaqu, parambjb, 21, 1, 21, 21, 3, 21, f, f, false);
/* 393:595 */       a(paramaqu, parambjb, 22, 1, 21, 22, 2, 21, f, f, false);
/* 394:596 */       a(paramaqu, parambjb, 23, 1, 21, 24, 1, 21, f, f, false);
/* 395:597 */       a(paramaqu, parambjb, 42, 1, 21, 42, 6, 21, f, f, false);
/* 396:598 */       a(paramaqu, parambjb, 41, 1, 21, 41, 5, 21, f, f, false);
/* 397:599 */       a(paramaqu, parambjb, 37, 1, 21, 40, 4, 21, f, f, false);
/* 398:600 */       a(paramaqu, parambjb, 36, 1, 21, 36, 3, 21, f, f, false);
/* 399:601 */       a(paramaqu, parambjb, 35, 1, 21, 35, 2, 21, f, f, false);
/* 400:602 */       a(paramaqu, parambjb, 33, 1, 21, 34, 1, 21, f, f, false);
/* 401:    */     }
/* 402:    */   }
/* 403:    */   
/* 404:    */   private void d(World paramaqu, Random paramRandom, bjb parambjb)
/* 405:    */   {
/* 406:610 */     if (a(parambjb, 21, 21, 36, 36))
/* 407:    */     {
/* 408:611 */       a(paramaqu, parambjb, 21, 0, 22, 36, 0, 36, a, a, false);
/* 409:    */       
/* 410:    */ 
/* 411:    */ 
/* 412:615 */       a(paramaqu, parambjb, 21, 1, 22, 36, 23, 36, f, f, false);
/* 413:624 */       for (int i = 0; i < 4; i++)
/* 414:    */       {
/* 415:625 */         a(paramaqu, parambjb, 21 + i, 13 + i, 21 + i, 36 - i, 13 + i, 21 + i, b, b, false);
/* 416:626 */         a(paramaqu, parambjb, 21 + i, 13 + i, 36 - i, 36 - i, 13 + i, 36 - i, b, b, false);
/* 417:627 */         a(paramaqu, parambjb, 21 + i, 13 + i, 22 + i, 21 + i, 13 + i, 35 - i, b, b, false);
/* 418:628 */         a(paramaqu, parambjb, 36 - i, 13 + i, 22 + i, 36 - i, 13 + i, 35 - i, b, b, false);
/* 419:    */       }
/* 420:630 */       a(paramaqu, parambjb, 25, 16, 25, 32, 16, 32, a, a, false);
/* 421:631 */       a(paramaqu, parambjb, 25, 17, 25, 25, 19, 25, b, b, false);
/* 422:632 */       a(paramaqu, parambjb, 32, 17, 25, 32, 19, 25, b, b, false);
/* 423:633 */       a(paramaqu, parambjb, 25, 17, 32, 25, 19, 32, b, b, false);
/* 424:634 */       a(paramaqu, parambjb, 32, 17, 32, 32, 19, 32, b, b, false);
/* 425:    */       
/* 426:636 */       a(paramaqu, b, 26, 20, 26, parambjb);
/* 427:637 */       a(paramaqu, b, 27, 21, 27, parambjb);
/* 428:638 */       a(paramaqu, e, 27, 20, 27, parambjb);
/* 429:639 */       a(paramaqu, b, 26, 20, 31, parambjb);
/* 430:640 */       a(paramaqu, b, 27, 21, 30, parambjb);
/* 431:641 */       a(paramaqu, e, 27, 20, 30, parambjb);
/* 432:642 */       a(paramaqu, b, 31, 20, 31, parambjb);
/* 433:643 */       a(paramaqu, b, 30, 21, 30, parambjb);
/* 434:644 */       a(paramaqu, e, 30, 20, 30, parambjb);
/* 435:645 */       a(paramaqu, b, 31, 20, 26, parambjb);
/* 436:646 */       a(paramaqu, b, 30, 21, 27, parambjb);
/* 437:647 */       a(paramaqu, e, 30, 20, 27, parambjb);
/* 438:    */       
/* 439:649 */       a(paramaqu, parambjb, 28, 21, 27, 29, 21, 27, a, a, false);
/* 440:650 */       a(paramaqu, parambjb, 27, 21, 28, 27, 21, 29, a, a, false);
/* 441:651 */       a(paramaqu, parambjb, 28, 21, 30, 29, 21, 30, a, a, false);
/* 442:652 */       a(paramaqu, parambjb, 30, 21, 28, 30, 21, 29, a, a, false);
/* 443:    */     }
/* 444:    */   }
/* 445:    */   
/* 446:    */   private void e(World paramaqu, Random paramRandom, bjb parambjb)
/* 447:    */   {
/* 448:    */     int i;
/* 449:659 */     if (a(parambjb, 0, 21, 6, 58))
/* 450:    */     {
/* 451:660 */       a(paramaqu, parambjb, 0, 0, 21, 6, 0, 57, a, a, false);
/* 452:    */       
/* 453:662 */       a(paramaqu, parambjb, 0, 1, 21, 6, 7, 57, f, f, false);
/* 454:    */       
/* 455:    */ 
/* 456:665 */       a(paramaqu, parambjb, 4, 4, 21, 6, 4, 53, a, a, false);
/* 457:666 */       for (i = 0; i < 4; i++) {
/* 458:667 */         a(paramaqu, parambjb, i, i + 1, 21, i, i + 1, 57 - i, b, b, false);
/* 459:    */       }
/* 460:669 */       for (i = 23; i < 53; i += 3) {
/* 461:670 */         a(paramaqu, d, 5, 5, i, parambjb);
/* 462:    */       }
/* 463:672 */       a(paramaqu, d, 5, 5, 52, parambjb);
/* 464:674 */       for (i = 0; i < 4; i++) {
/* 465:675 */         a(paramaqu, parambjb, i, i + 1, 21, i, i + 1, 57 - i, b, b, false);
/* 466:    */       }
/* 467:678 */       a(paramaqu, parambjb, 4, 1, 52, 6, 3, 52, a, a, false);
/* 468:679 */       a(paramaqu, parambjb, 5, 1, 51, 5, 3, 53, a, a, false);
/* 469:    */     }
/* 470:684 */     if (a(parambjb, 51, 21, 58, 58))
/* 471:    */     {
/* 472:685 */       a(paramaqu, parambjb, 51, 0, 21, 57, 0, 57, a, a, false);
/* 473:    */       
/* 474:687 */       a(paramaqu, parambjb, 51, 1, 21, 57, 7, 57, f, f, false);
/* 475:    */       
/* 476:    */ 
/* 477:690 */       a(paramaqu, parambjb, 51, 4, 21, 53, 4, 53, a, a, false);
/* 478:691 */       for (i = 0; i < 4; i++) {
/* 479:692 */         a(paramaqu, parambjb, 57 - i, i + 1, 21, 57 - i, i + 1, 57 - i, b, b, false);
/* 480:    */       }
/* 481:694 */       for (i = 23; i < 53; i += 3) {
/* 482:695 */         a(paramaqu, d, 52, 5, i, parambjb);
/* 483:    */       }
/* 484:697 */       a(paramaqu, d, 52, 5, 52, parambjb);
/* 485:    */       
/* 486:    */ 
/* 487:700 */       a(paramaqu, parambjb, 51, 1, 52, 53, 3, 52, a, a, false);
/* 488:701 */       a(paramaqu, parambjb, 52, 1, 51, 52, 3, 53, a, a, false);
/* 489:    */     }
/* 490:706 */     if (a(parambjb, 0, 51, 57, 57))
/* 491:    */     {
/* 492:707 */       a(paramaqu, parambjb, 7, 0, 51, 50, 0, 57, a, a, false);
/* 493:    */       
/* 494:709 */       a(paramaqu, parambjb, 7, 1, 51, 50, 10, 57, f, f, false);
/* 495:712 */       for (i = 0; i < 4; i++) {
/* 496:713 */         a(paramaqu, parambjb, i + 1, i + 1, 57 - i, 56 - i, i + 1, 57 - i, b, b, false);
/* 497:    */       }
/* 498:    */     }
/* 499:    */   }
/* 500:    */   
/* 501:    */   private void f(World paramaqu, Random paramRandom, bjb parambjb)
/* 502:    */   {
/* 503:    */     int i;
/* 504:721 */     if (a(parambjb, 7, 21, 13, 50))
/* 505:    */     {
/* 506:722 */       a(paramaqu, parambjb, 7, 0, 21, 13, 0, 50, a, a, false);
/* 507:    */       
/* 508:724 */       a(paramaqu, parambjb, 7, 1, 21, 13, 10, 50, f, f, false);
/* 509:    */       
/* 510:    */ 
/* 511:727 */       a(paramaqu, parambjb, 11, 8, 21, 13, 8, 53, a, a, false);
/* 512:728 */       for (i = 0; i < 4; i++) {
/* 513:729 */         a(paramaqu, parambjb, i + 7, i + 5, 21, i + 7, i + 5, 54, b, b, false);
/* 514:    */       }
/* 515:731 */       for (i = 21; i <= 45; i += 3) {
/* 516:732 */         a(paramaqu, d, 12, 9, i, parambjb);
/* 517:    */       }
/* 518:    */     }
/* 519:738 */     if (a(parambjb, 44, 21, 50, 54))
/* 520:    */     {
/* 521:739 */       a(paramaqu, parambjb, 44, 0, 21, 50, 0, 50, a, a, false);
/* 522:    */       
/* 523:741 */       a(paramaqu, parambjb, 44, 1, 21, 50, 10, 50, f, f, false);
/* 524:    */       
/* 525:    */ 
/* 526:744 */       a(paramaqu, parambjb, 44, 8, 21, 46, 8, 53, a, a, false);
/* 527:745 */       for (i = 0; i < 4; i++) {
/* 528:746 */         a(paramaqu, parambjb, 50 - i, i + 5, 21, 50 - i, i + 5, 54, b, b, false);
/* 529:    */       }
/* 530:748 */       for (i = 21; i <= 45; i += 3) {
/* 531:749 */         a(paramaqu, d, 45, 9, i, parambjb);
/* 532:    */       }
/* 533:    */     }
/* 534:755 */     if (a(parambjb, 8, 44, 49, 54))
/* 535:    */     {
/* 536:756 */       a(paramaqu, parambjb, 14, 0, 44, 43, 0, 50, a, a, false);
/* 537:    */       
/* 538:758 */       a(paramaqu, parambjb, 14, 1, 44, 43, 10, 50, f, f, false);
/* 539:763 */       for (i = 12; i <= 45; i += 3)
/* 540:    */       {
/* 541:764 */         a(paramaqu, d, i, 9, 45, parambjb);
/* 542:765 */         a(paramaqu, d, i, 9, 52, parambjb);
/* 543:766 */         if ((i == 12) || (i == 18) || (i == 24) || (i == 33) || (i == 39) || (i == 45))
/* 544:    */         {
/* 545:767 */           a(paramaqu, d, i, 9, 47, parambjb);
/* 546:768 */           a(paramaqu, d, i, 9, 50, parambjb);
/* 547:769 */           a(paramaqu, d, i, 10, 45, parambjb);
/* 548:770 */           a(paramaqu, d, i, 10, 46, parambjb);
/* 549:771 */           a(paramaqu, d, i, 10, 51, parambjb);
/* 550:772 */           a(paramaqu, d, i, 10, 52, parambjb);
/* 551:773 */           a(paramaqu, d, i, 11, 47, parambjb);
/* 552:774 */           a(paramaqu, d, i, 11, 50, parambjb);
/* 553:775 */           a(paramaqu, d, i, 12, 48, parambjb);
/* 554:776 */           a(paramaqu, d, i, 12, 49, parambjb);
/* 555:    */         }
/* 556:    */       }
/* 557:781 */       for (i = 0; i < 3; i++) {
/* 558:782 */         a(paramaqu, parambjb, 8 + i, 5 + i, 54, 49 - i, 5 + i, 54, a, a, false);
/* 559:    */       }
/* 560:784 */       a(paramaqu, parambjb, 11, 8, 54, 46, 8, 54, b, b, false);
/* 561:785 */       a(paramaqu, parambjb, 14, 8, 44, 43, 8, 53, a, a, false);
/* 562:    */     }
/* 563:    */   }
/* 564:    */   
/* 565:    */   private void g(World paramaqu, Random paramRandom, bjb parambjb)
/* 566:    */   {
/* 567:    */     int i;
/* 568:792 */     if (a(parambjb, 14, 21, 20, 43))
/* 569:    */     {
/* 570:793 */       a(paramaqu, parambjb, 14, 0, 21, 20, 0, 43, a, a, false);
/* 571:    */       
/* 572:795 */       a(paramaqu, parambjb, 14, 1, 22, 20, 14, 43, f, f, false);
/* 573:    */       
/* 574:    */ 
/* 575:798 */       a(paramaqu, parambjb, 18, 12, 22, 20, 12, 39, a, a, false);
/* 576:799 */       a(paramaqu, parambjb, 18, 12, 21, 20, 12, 21, b, b, false);
/* 577:800 */       for (i = 0; i < 4; i++) {
/* 578:801 */         a(paramaqu, parambjb, i + 14, i + 9, 21, i + 14, i + 9, 43 - i, b, b, false);
/* 579:    */       }
/* 580:803 */       for (i = 23; i <= 39; i += 3) {
/* 581:804 */         a(paramaqu, d, 19, 13, i, parambjb);
/* 582:    */       }
/* 583:    */     }
/* 584:810 */     if (a(parambjb, 37, 21, 43, 43))
/* 585:    */     {
/* 586:811 */       a(paramaqu, parambjb, 37, 0, 21, 43, 0, 43, a, a, false);
/* 587:    */       
/* 588:813 */       a(paramaqu, parambjb, 37, 1, 22, 43, 14, 43, f, f, false);
/* 589:    */       
/* 590:    */ 
/* 591:816 */       a(paramaqu, parambjb, 37, 12, 22, 39, 12, 39, a, a, false);
/* 592:817 */       a(paramaqu, parambjb, 37, 12, 21, 39, 12, 21, b, b, false);
/* 593:818 */       for (i = 0; i < 4; i++) {
/* 594:819 */         a(paramaqu, parambjb, 43 - i, i + 9, 21, 43 - i, i + 9, 43 - i, b, b, false);
/* 595:    */       }
/* 596:821 */       for (i = 23; i <= 39; i += 3) {
/* 597:822 */         a(paramaqu, d, 38, 13, i, parambjb);
/* 598:    */       }
/* 599:    */     }
/* 600:828 */     if (a(parambjb, 15, 37, 42, 43))
/* 601:    */     {
/* 602:829 */       a(paramaqu, parambjb, 21, 0, 37, 36, 0, 43, a, a, false);
/* 603:    */       
/* 604:831 */       a(paramaqu, parambjb, 21, 1, 37, 36, 14, 43, f, f, false);
/* 605:    */       
/* 606:    */ 
/* 607:834 */       a(paramaqu, parambjb, 21, 12, 37, 36, 12, 39, a, a, false);
/* 608:835 */       for (i = 0; i < 4; i++) {
/* 609:836 */         a(paramaqu, parambjb, 15 + i, i + 9, 43 - i, 42 - i, i + 9, 43 - i, b, b, false);
/* 610:    */       }
/* 611:838 */       for (i = 21; i <= 36; i += 3) {
/* 612:839 */         a(paramaqu, d, i, 13, 38, parambjb);
/* 613:    */       }
/* 614:    */     }
/* 615:    */   }
/* 616:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkr
 * JD-Core Version:    0.7.0.1
 */
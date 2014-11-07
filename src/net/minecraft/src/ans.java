package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.Collection;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class ans
/*   9:    */ {
/*  10: 54 */   private static final Map o = null; //BROKEN
/*  11: 55 */   private static final Map p = Maps.newHashMap();
/*  12:    */   
/*  13:    */   static
/*  14:    */   {
/*  15: 59 */     a = null;
/*  16:    */     
/*  17:    */ 
/*  18:    */ 
/*  19:    */ 
/*  20:    */ 
/*  21:    */ 
/*  22:    */ 
/*  23:    */ 
/*  24:    */ 
/*  25:    */ 
/*  26:    */ 
/*  27:    */ 
/*  28:    */ 
/*  29:    */ 
/*  30:    */ 
/*  31:    */ 
/*  32:    */ 
/*  33:    */ 
/*  34:    */ 
/*  35:    */ 
/*  36:    */ 
/*  37: 81 */     c = "+0-1-2-3&4-4+13";
/*  38: 82 */     o.put(Integer.valueOf(Potion.l.d()), "0 & !1 & !2 & !3 & 0+6");
/*  39:    */     
/*  40: 84 */     b = "-0+1-2-3&4-4+13";
/*  41: 85 */     o.put(Integer.valueOf(Potion.c.d()), "!0 & 1 & !2 & !3 & 1+6");
/*  42:    */     
/*  43: 87 */     h = "+0+1-2-3&4-4+13";
/*  44: 88 */     o.put(Integer.valueOf(Potion.n.d()), "0 & 1 & !2 & !3 & 0+6");
/*  45:    */     
/*  46: 90 */     f = "+0-1+2-3&4-4+13";
/*  47: 91 */     o.put(Integer.valueOf(Potion.h.d()), "0 & !1 & 2 & !3");
/*  48:    */     
/*  49: 93 */     d = "-0-1+2-3&4-4+13";
/*  50: 94 */     o.put(Integer.valueOf(Potion.u.d()), "!0 & !1 & 2 & !3 & 2+6");
/*  51:    */     
/*  52: 96 */     e = "-0+3-4+13";
/*  53: 97 */     o.put(Integer.valueOf(Potion.t.d()), "!0 & !1 & !2 & 3 & 3+6");
/*  54: 98 */     o.put(Integer.valueOf(Potion.i.d()), "!0 & !1 & 2 & 3");
/*  55: 99 */     o.put(Integer.valueOf(Potion.d.d()), "!0 & 1 & !2 & 3 & 3+6");
/*  56:    */     
/*  57:101 */     g = "+0-1-2+3&4-4+13";
/*  58:102 */     o.put(Integer.valueOf(Potion.g.d()), "0 & !1 & !2 & 3 & 3+6");
/*  59:    */     
/*  60:104 */     l = "-0+1+2-3+13&4-4";
/*  61:105 */     o.put(Integer.valueOf(Potion.r.d()), "!0 & 1 & 2 & !3 & 2+6");
/*  62:    */     
/*  63:    */ 
/*  64:108 */     o.put(Integer.valueOf(Potion.p.d()), "!0 & 1 & 2 & 3 & 2+6");
/*  65:    */     
/*  66:110 */     m = "+0-1+2+3+13&4-4";
/*  67:111 */     o.put(Integer.valueOf(Potion.o.d()), "0 & !1 & 2 & 3 & 2+6");
/*  68:    */     
/*  69:113 */     n = "+0+1-2+3&4-4+13";
/*  70:114 */     o.put(Integer.valueOf(Potion.j.d()), "0 & 1 & !2 & 3");
/*  71:    */     
/*  72:    */ 
/*  73:117 */     j = "+5-6-7";
/*  74:118 */     p.put(Integer.valueOf(Potion.c.d()), "5");
/*  75:119 */     p.put(Integer.valueOf(Potion.e.d()), "5");
/*  76:120 */     p.put(Integer.valueOf(Potion.g.d()), "5");
/*  77:121 */     p.put(Integer.valueOf(Potion.l.d()), "5");
/*  78:122 */     p.put(Integer.valueOf(Potion.i.d()), "5");
/*  79:123 */     p.put(Integer.valueOf(Potion.h.d()), "5");
/*  80:124 */     p.put(Integer.valueOf(Potion.m.d()), "5");
/*  81:125 */     p.put(Integer.valueOf(Potion.u.d()), "5");
/*  82:126 */     p.put(Integer.valueOf(Potion.j.d()), "5");
/*  83:    */   }
/*  84:    */   
/*  85:129 */   public static final String i = "-5+6-7";
/*  86:133 */   public static final String k = "+14&13-13";
/*  87:    */   
/*  88:    */   public static boolean a(int paramInt1, int paramInt2)
/*  89:    */   {
/*  90:185 */     return (paramInt1 & 1 << paramInt2) != 0;
/*  91:    */   }
/*  92:    */   
/*  93:    */   private static int c(int paramInt1, int paramInt2)
/*  94:    */   {
/*  95:189 */     return a(paramInt1, paramInt2) ? 1 : 0;
/*  96:    */   }
/*  97:    */   
/*  98:    */   private static int d(int paramInt1, int paramInt2)
/*  99:    */   {
/* 100:193 */     return a(paramInt1, paramInt2) ? 0 : 1;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public static int a(int paramInt)
/* 104:    */   {
/* 105:197 */     return a(paramInt, 5, 4, 3, 2, 1);
/* 106:    */   }
/* 107:    */   
/* 108:    */   public static int a(Collection<wq> paramCollection)
/* 109:    */   {
/* 110:201 */     int i1 = 3694022;
/* 111:203 */     if ((paramCollection == null) || (paramCollection.isEmpty())) {
/* 112:204 */       return i1;
/* 113:    */     }
/* 114:207 */     float f1 = 0.0F;
/* 115:208 */     float f2 = 0.0F;
/* 116:209 */     float f3 = 0.0F;
/* 117:210 */     float f4 = 0.0F;
/* 118:212 */     for (wq localwq : paramCollection) {
/* 119:213 */       if (localwq.getShowParticles())
/* 120:    */       {
/* 121:216 */         int i2 = Potion.potionList[localwq.getID()].k();
/* 122:218 */         for (int i3 = 0; i3 <= localwq.getAmplifier(); i3++)
/* 123:    */         {
/* 124:219 */           f1 += (i2 >> 16 & 0xFF) / 255.0F;
/* 125:220 */           f2 += (i2 >> 8 & 0xFF) / 255.0F;
/* 126:221 */           f3 += (i2 >> 0 & 0xFF) / 255.0F;
/* 127:222 */           f4 += 1.0F;
/* 128:    */         }
/* 129:    */       }
/* 130:    */     }
/* 131:226 */     if (f4 == 0.0F) {
/* 132:227 */       return 0;
/* 133:    */     }
/* 134:230 */     f1 = f1 / f4 * 255.0F;
/* 135:231 */     f2 = f2 / f4 * 255.0F;
/* 136:232 */     f3 = f3 / f4 * 255.0F;
/* 137:    */     
/* 138:234 */     return (int)f1 << 16 | (int)f2 << 8 | (int)f3;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public static boolean b(Collection<wq> paramCollection)
/* 142:    */   {
/* 143:238 */     for (wq localwq : paramCollection) {
/* 144:239 */       if (!localwq.getAmbient()) {
/* 145:240 */         return false;
/* 146:    */       }
/* 147:    */     }
/* 148:244 */     return true;
/* 149:    */   }
/* 150:    */   
/* 151:247 */   private static final Map q = Maps.newHashMap();
/* 152:    */   
/* 153:    */   public static int a(int paramInt, boolean paramBoolean)
/* 154:    */   {
/* 155:250 */     if (!paramBoolean)
/* 156:    */     {
/* 157:251 */       if (q.containsKey(Integer.valueOf(paramInt))) {
/* 158:252 */         return ((Integer)q.get(Integer.valueOf(paramInt))).intValue();
/* 159:    */       }
/* 160:254 */       int i1 = a(b(paramInt, false));
/* 161:255 */       q.put(Integer.valueOf(paramInt), Integer.valueOf(i1));
/* 162:256 */       return i1;
/* 163:    */     }
/* 164:259 */     return a(b(paramInt, true));
/* 165:    */   }
/* 166:    */   
/* 167:267 */   private static final String[] r = { "potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", "potion.prefix.gross", "potion.prefix.stinky" };
/* 168:    */   public static final String a;
/* 169:    */   public static final String b;
/* 170:    */   public static final String c;
/* 171:    */   public static final String d;
/* 172:    */   public static final String e;
/* 173:    */   public static final String f;
/* 174:    */   public static final String g;
/* 175:    */   public static final String h;
/* 176:    */   public static final String j;
/* 177:    */   public static final String l;
/* 178:    */   public static final String m;
/* 179:    */   public static final String n;
/* 180:    */   
/* 181:    */   public static String c(int paramInt)
/* 182:    */   {
/* 183:304 */     int i1 = a(paramInt);
/* 184:305 */     return r[i1];
/* 185:    */   }
/* 186:    */   
/* 187:    */   private static int a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 188:    */   {
/* 189:314 */     int i1 = 0;
/* 190:315 */     if (paramBoolean1) {
/* 191:316 */       i1 = d(paramInt4, paramInt2);
/* 192:317 */     } else if (paramInt1 != -1)
/* 193:    */     {
/* 194:318 */       if ((paramInt1 == 0) && (h(paramInt4) == paramInt2)) {
/* 195:319 */         i1 = 1;
/* 196:320 */       } else if ((paramInt1 == 1) && (h(paramInt4) > paramInt2)) {
/* 197:321 */         i1 = 1;
/* 198:322 */       } else if ((paramInt1 == 2) && (h(paramInt4) < paramInt2)) {
/* 199:323 */         i1 = 1;
/* 200:    */       }
/* 201:    */     }
/* 202:    */     else {
/* 203:326 */       i1 = c(paramInt4, paramInt2);
/* 204:    */     }
/* 205:328 */     if (paramBoolean2) {
/* 206:329 */       i1 *= paramInt3;
/* 207:    */     }
/* 208:331 */     if (paramBoolean3) {
/* 209:332 */       i1 *= -1;
/* 210:    */     }
/* 211:334 */     return i1;
/* 212:    */   }
/* 213:    */   
/* 214:    */   private static int h(int paramInt)
/* 215:    */   {
				  int i1;
/* 216:338 */     for (i1 = 0; paramInt > 0; i1++) {
/* 217:340 */       paramInt &= paramInt - 1;
/* 218:    */     }
/* 219:342 */     return i1;
/* 220:    */   }
/* 221:    */   
/* 222:    */   private static int a(String paramString, int paramInt1, int paramInt2, int paramInt3)
/* 223:    */   {
/* 224:346 */     if ((paramInt1 >= paramString.length()) || (paramInt2 < 0) || (paramInt1 >= paramInt2)) {
/* 225:347 */       return 0;
/* 226:    */     }
/* 227:351 */     int i1 = paramString.indexOf('|', paramInt1);
/* 228:352 */     if ((i1 >= 0) && (i1 < paramInt2))
/* 229:    */     {
/* 230:353 */       int i2 = a(paramString, paramInt1, i1 - 1, paramInt3);
/* 231:354 */       if (i2 > 0) {
/* 232:355 */         return i2;
/* 233:    */       }
/* 234:358 */       int i3 = a(paramString, i1 + 1, paramInt2, paramInt3);
/* 235:359 */       if (i3 > 0) {
/* 236:360 */         return i3;
/* 237:    */       }
/* 238:362 */       return 0;
/* 239:    */     }
/* 240:365 */     int i2 = paramString.indexOf('&', paramInt1);
/* 241:366 */     if ((i2 >= 0) && (i2 < paramInt2))
/* 242:    */     {
/* 243:367 */       int i3 = a(paramString, paramInt1, i2 - 1, paramInt3);
/* 244:368 */       if (i3 <= 0) {
/* 245:369 */         return 0;
/* 246:    */       }
/* 247:372 */       int i4 = a(paramString, i2 + 1, paramInt2, paramInt3);
/* 248:373 */       if (i4 <= 0) {
/* 249:374 */         return 0;
/* 250:    */       }
/* 251:377 */       if (i3 > i4) {
/* 252:378 */         return i3;
/* 253:    */       }
/* 254:380 */       return i4;
/* 255:    */     }
/* 256:383 */     int i3 = 0;
/* 257:384 */     boolean i4 = false;
/* 258:385 */     int i5 = 0;
/* 259:386 */     boolean bool2 = false;
/* 260:387 */     boolean bool3 = false;
/* 261:388 */     int i6 = -1;
/* 262:389 */     int i7 = 0;
/* 263:390 */     int i8 = 0;
/* 264:391 */     int i9 = 0;
/* 265:    */     boolean bool1;
/* 266:392 */     for (int i10 = paramInt1; i10 < paramInt2; i10++)
/* 267:    */     {
/* 268:393 */       int i11 = paramString.charAt(i10);
/* 269:394 */       if ((i11 >= 48) && (i11 <= 57))
/* 270:    */       {
/* 271:395 */         if (i3 != 0)
/* 272:    */         {
/* 273:396 */           i8 = i11 - 48;
/* 274:397 */           i4 = true;
/* 275:    */         }
/* 276:    */         else
/* 277:    */         {
/* 278:399 */           i7 *= 10;
/* 279:400 */           i7 += i11 - 48;
/* 280:401 */           i5 = 1;
/* 281:    */         }
/* 282:    */       }
/* 283:403 */       else if (i11 == 42)
/* 284:    */       {
/* 285:404 */         i3 = 1;
/* 286:    */       }
/* 287:405 */       else if (i11 == 33)
/* 288:    */       {
/* 289:406 */         if (i5 != 0)
/* 290:    */         {
/* 291:407 */           i9 += a(bool2, i4, bool3, i6, i7, i8, paramInt3);
/* 292:408 */           //i5 = bool1 = i3 = bool3 = bool2 = 0;
						i5 = i3 = 0;
						bool1 = bool3 = bool2 = false;
/* 293:409 */           i7 = i8 = 0;
/* 294:410 */           i6 = -1;
/* 295:    */         }
/* 296:413 */         bool2 = true;
/* 297:    */       }
/* 298:414 */       else if (i11 == 45)
/* 299:    */       {
/* 300:415 */         if (i5 != 0)
/* 301:    */         {
/* 302:416 */           i9 += a(bool2, bool1, bool3, i6, i7, i8, paramInt3);
/* 303:417 */           //i5 = bool1 = i3 = bool3 = bool2 = 0;
						i5 = i3 = 0;
						bool1 = bool3 = bool2 = false;
/* 304:418 */           i7 = i8 = 0;
/* 305:419 */           i6 = -1;
/* 306:    */         }
/* 307:422 */         bool3 = true;
/* 308:    */       }
/* 309:423 */       else if ((i11 == 61) || (i11 == 60) || (i11 == 62))
/* 310:    */       {
/* 311:424 */         if (i5 != 0)
/* 312:    */         {
/* 313:425 */           i9 += a(bool2, bool1, bool3, i6, i7, i8, paramInt3);
/* 314:426 */           //i5 = bool1 = i3 = bool3 = bool2 = 0;
						i5 = i3 = 0;
						bool1 = bool3 = bool2 = false;
/* 315:427 */           i7 = i8 = 0;
/* 316:428 */           i6 = -1;
/* 317:    */         }
/* 318:431 */         if (i11 == 61) {
/* 319:432 */           i6 = 0;
/* 320:433 */         } else if (i11 == 60) {
/* 321:434 */           i6 = 2;
/* 322:435 */         } else if (i11 == 62) {
/* 323:436 */           i6 = 1;
/* 324:    */         }
/* 325:    */       }
/* 326:438 */       else if ((i11 == 43) && 
/* 327:439 */         (i5 != 0))
/* 328:    */       {
/* 329:440 */         i9 += a(bool2, bool1, bool3, i6, i7, i8, paramInt3);
/* 330:441 */         //i5 = bool1 = i3 = bool3 = bool2 = 0;
					  i5 = i3 = 0;
					  bool1 = bool3 = bool2 = false;
/* 331:442 */         i7 = i8 = 0;
/* 332:443 */         i6 = -1;
/* 333:    */       }
/* 334:    */     }
/* 335:447 */     if (i5 != 0) {
/* 336:448 */       i9 += a(bool2, bool1, bool3, i6, i7, i8, paramInt3);
/* 337:    */     }
/* 338:451 */     return i9;
/* 339:    */   }
/* 340:    */   
/* 341:    */   public static List<wq> b(int paramInt, boolean paramBoolean)
/* 342:    */   {
/* 343:455 */     ArrayList<wq> localArrayList = null;
/* 344:457 */     for (Potion localwp : Potion.potionList) {
/* 345:458 */       if ((localwp != null) && ((!localwp.j()) || (paramBoolean)))
/* 346:    */       {
/* 347:461 */         String str1 = (String)o.get(Integer.valueOf(localwp.d()));
/* 348:462 */         if (str1 != null)
/* 349:    */         {
/* 350:466 */           int i3 = a(str1, 0, str1.length(), paramInt);
/* 351:467 */           if (i3 > 0)
/* 352:    */           {
/* 353:468 */             int i4 = 0;
/* 354:469 */             String str2 = (String)p.get(Integer.valueOf(localwp.d()));
/* 355:470 */             if (str2 != null)
/* 356:    */             {
/* 357:471 */               i4 = a(str2, 0, str2.length(), paramInt);
/* 358:472 */               if (i4 < 0) {
/* 359:473 */                 i4 = 0;
/* 360:    */               }
/* 361:    */             }
/* 362:477 */             if (localwp.b())
/* 363:    */             {
/* 364:478 */               i3 = 1;
/* 365:    */             }
/* 366:    */             else
/* 367:    */             {
/* 368:481 */               i3 = 1200 * (i3 * 3 + (i3 - 1) * 2);
/* 369:482 */               i3 >>= i4;
/* 370:483 */               i3 = (int)Math.round(i3 * localwp.h());
/* 371:485 */               if ((paramInt & 0x4000) != 0) {
/* 372:486 */                 i3 = (int)Math.round(i3 * 0.75D + 0.5D);
/* 373:    */               }
/* 374:    */             }
/* 375:490 */             if (localArrayList == null) {
/* 376:491 */               localArrayList = Lists.newArrayList();
/* 377:    */             }
/* 378:493 */             wq localwq = new wq(localwp.d(), i3, i4);
/* 379:494 */             if ((paramInt & 0x4000) != 0) {
/* 380:495 */               localwq.a(true);
/* 381:    */             }
/* 382:497 */             localArrayList.add(localwq);
/* 383:    */           }
/* 384:    */         }
/* 385:    */       }
/* 386:    */     }
/* 387:501 */     return localArrayList;
/* 388:    */   }
/* 389:    */   
/* 390:    */   private static int a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/* 391:    */   {
/* 392:584 */     if (paramBoolean3)
/* 393:    */     {
/* 394:585 */       if (!a(paramInt1, paramInt2)) {
/* 395:586 */         return 0;
/* 396:    */       }
/* 397:    */     }
/* 398:588 */     else if (paramBoolean1) {
/* 399:589 */       paramInt1 &= (1 << paramInt2 ^ 0xFFFFFFFF);
/* 400:590 */     } else if (paramBoolean2)
/* 401:    */     {
/* 402:591 */       if ((paramInt1 & 1 << paramInt2) == 0) {
/* 403:592 */         paramInt1 |= 1 << paramInt2;
/* 404:    */       } else {
/* 405:594 */         paramInt1 &= (1 << paramInt2 ^ 0xFFFFFFFF);
/* 406:    */       }
/* 407:    */     }
/* 408:    */     else {
/* 409:597 */       paramInt1 |= 1 << paramInt2;
/* 410:    */     }
/* 411:599 */     return paramInt1;
/* 412:    */   }
/* 413:    */   
/* 414:    */   public static int a(int paramInt, String paramString)
/* 415:    */   {
/* 416:603 */     int i1 = 0;
/* 417:604 */     int i2 = paramString.length();
/* 418:    */     
/* 419:606 */     int i3 = 0;
/* 420:607 */     boolean bool1 = false;
/* 421:608 */     boolean bool2 = false;
/* 422:609 */     boolean bool3 = false;
/* 423:610 */     int i4 = 0;
/* 424:611 */     for (int i5 = i1; i5 < i2; i5++)
/* 425:    */     {
/* 426:612 */       int i6 = paramString.charAt(i5);
/* 427:613 */       if ((i6 >= 48) && (i6 <= 57))
/* 428:    */       {
/* 429:614 */         i4 *= 10;
/* 430:615 */         i4 += i6 - 48;
/* 431:616 */         i3 = 1;
/* 432:    */       }
/* 433:617 */       else if (i6 == 33)
/* 434:    */       {
/* 435:618 */         if (i3 != 0)
/* 436:    */         {
/* 437:619 */           paramInt = a(paramInt, i4, bool2, bool1, bool3);
/* 438:620 */           //i3 = bool2 = bool1 = bool3 = 0;
						i3 = 0;
						bool2 = bool1 = bool3 = false;
/* 439:621 */           i4 = 0;
/* 440:    */         }
/* 441:624 */         bool1 = true;
/* 442:    */       }
/* 443:625 */       else if (i6 == 45)
/* 444:    */       {
/* 445:626 */         if (i3 != 0)
/* 446:    */         {
/* 447:627 */           paramInt = a(paramInt, i4, bool2, bool1, bool3);
/* 448:628 */           //i3 = bool2 = bool1 = bool3 = 0;
						i3 = 0;
						bool2 = bool1 = bool3 = false;
/* 449:629 */           i4 = 0;
/* 450:    */         }
/* 451:632 */         bool2 = true;
/* 452:    */       }
/* 453:633 */       else if (i6 == 43)
/* 454:    */       {
/* 455:634 */         if (i3 != 0)
/* 456:    */         {
/* 457:635 */           paramInt = a(paramInt, i4, bool2, bool1, bool3);
/* 458:636 */           //i3 = bool2 = bool1 = bool3 = 0;
						i3 = 0;
						bool2 = bool1 = bool3 = false;
/* 459:637 */           i4 = 0;
/* 460:    */         }
/* 461:    */       }
/* 462:639 */       else if (i6 == 38)
/* 463:    */       {
/* 464:640 */         if (i3 != 0)
/* 465:    */         {
/* 466:641 */           paramInt = a(paramInt, i4, bool2, bool1, bool3);
/* 467:642 */           //i3 = bool2 = bool1 = bool3 = 0;
						i3 = 0;
						bool2 = bool1 = bool3 = false;
/* 468:643 */           i4 = 0;
/* 469:    */         }
/* 470:645 */         bool3 = true;
/* 471:    */       }
/* 472:    */     }
/* 473:648 */     if (i3 != 0) {
/* 474:649 */       paramInt = a(paramInt, i4, bool2, bool1, bool3);
/* 475:    */     }
/* 476:652 */     return paramInt & 0x7FFF;
/* 477:    */   }
/* 478:    */   
/* 479:    */   public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 480:    */   {
/* 481:667 */     return (a(paramInt1, paramInt2) ? 16 : 0) | (a(paramInt1, paramInt3) ? 8 : 0) | (a(paramInt1, paramInt4) ? 4 : 0) | (a(paramInt1, paramInt5) ? 2 : 0) | (a(paramInt1, paramInt6) ? 1 : 0);
/* 482:    */   }
/* 483:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ans
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Map;
/*   5:    */ import java.util.Set;
/*   6:    */ import org.lwjgl.input.Keyboard;
/*   7:    */ import org.lwjgl.input.Mouse;
/*   8:    */ 
/*   9:    */ public class byz
/*  10:    */   extends bzd
/*  11:    */ {
/*  12: 37 */   private static final oa u = new oa("textures/gui/container/creative_inventory/tabs.png");
/*  13: 47 */   private static wa v = new wa("tmp", true, 45);
/*  14: 48 */   private static int w = CreativeTabs.tabBlock.a();
/*  15:    */   private float x;
/*  16:    */   private boolean y;
/*  17:    */   private boolean z;
/*  18:    */   private bul A;
/*  19:    */   private List B;
/*  20:    */   private ajk C;
/*  21:    */   private boolean D;
/*  22:    */   private byy E;
/*  23:    */   
/*  24:    */   public byz(EntityPlayer paramahd)
/*  25:    */   {
/*  26:141 */     super(new bza(paramahd));
/*  27:142 */     paramahd.bi = this.h;
/*  28:143 */     this.p = true;
/*  29:144 */     this.g = 136;
/*  30:145 */     this.f = 195;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void e()
/*  34:    */   {
/*  35:150 */     if (!this.j.c.h()) {
/*  36:151 */       this.j.a(new bzj(this.j.h));
/*  37:    */     }
/*  38:153 */     g();
/*  39:    */   }
/*  40:    */   
/*  41:    */   protected void a(ajk paramajk, int paramInt1, int paramInt2, int paramInt3)
/*  42:    */   {
/*  43:158 */     this.D = true;
/*  44:159 */     int i = paramInt3 == 1 ? 1 : 0;
/*  45:160 */     paramInt3 = (paramInt1 == -999) && (paramInt3 == 0) ? 4 : paramInt3;
/*  46:    */     ItemStack localamj1;
/*  47:    */     Object localObject2;
/*  48:162 */     if ((paramajk != null) || (w == CreativeTabs.tabInventory.a()) || (paramInt3 == 5))
/*  49:    */     {
/*  50:163 */       if ((paramajk == this.C) && (i != 0))
/*  51:    */       {
/*  52:164 */         for (int j = 0; j < this.j.h.bh.a().size(); j++) {
/*  53:165 */           this.j.c.a(null, j);
/*  54:    */         }
/*  55:    */       }
/*  56:    */       else
/*  57:    */       {
/*  58:    */         Object localObject1;
/*  59:167 */         if (w == CreativeTabs.tabInventory.a())
/*  60:    */         {
/*  61:169 */           if (paramajk == this.C)
/*  62:    */           {
/*  63:170 */             this.j.h.bg.b((ItemStack)null);
/*  64:    */           }
/*  65:171 */           else if ((paramInt3 == 4) && (paramajk != null) && (paramajk.e()))
/*  66:    */           {
/*  67:172 */             localObject1 = paramajk.a(paramInt2 == 0 ? 1 : paramajk.d().getMaxStackSize());
/*  68:173 */             this.j.h.a((ItemStack)localObject1, true);
/*  69:174 */             this.j.c.a((ItemStack)localObject1);
/*  70:    */           }
/*  71:175 */           else if ((paramInt3 == 4) && (this.j.h.bg.p() != null))
/*  72:    */           {
/*  73:176 */             this.j.h.a(this.j.h.bg.p(), true);
/*  74:177 */             this.j.c.a(this.j.h.bg.p());
/*  75:178 */             this.j.h.bg.b((ItemStack)null);
/*  76:    */           }
/*  77:    */           else
/*  78:    */           {
/*  79:180 */             this.j.h.bh.a(paramajk == null ? paramInt1 : bzb.a((bzb)paramajk).e, paramInt2, paramInt3, this.j.h);
/*  80:181 */             this.j.h.bh.b();
/*  81:    */           }
/*  82:    */         }
/*  83:184 */         else if ((paramInt3 != 5) && (paramajk.d == v))
/*  84:    */         {
/*  85:186 */           localObject1 = this.j.h.bg;
/*  86:187 */           localamj1 = ((ahb)localObject1).p();
/*  87:188 */           ItemStack localamj2 = paramajk.d();
/*  88:    */           ItemStack localamj3;
/*  89:190 */           if (paramInt3 == 2)
/*  90:    */           {
/*  91:191 */             if ((localamj2 != null) && (paramInt2 >= 0) && (paramInt2 < 9))
/*  92:    */             {
/*  93:192 */               localamj3 = localamj2.k();
/*  94:193 */               localamj3.stackSize = localamj3.getMaxStackSize();
/*  95:194 */               this.j.h.bg.a(paramInt2, localamj3);
/*  96:195 */               this.j.h.bh.b();
/*  97:    */             }
/*  98:198 */             return;
/*  99:    */           }
/* 100:199 */           if (paramInt3 == 3)
/* 101:    */           {
/* 102:200 */             if ((((ahb)localObject1).p() == null) && (paramajk.e()))
/* 103:    */             {
/* 104:201 */               localamj3 = paramajk.d().k();
/* 105:202 */               localamj3.stackSize = localamj3.getMaxStackSize();
/* 106:203 */               ((ahb)localObject1).b(localamj3);
/* 107:    */             }
/* 108:206 */             return;
/* 109:    */           }
/* 110:207 */           if (paramInt3 == 4)
/* 111:    */           {
/* 112:208 */             if (localamj2 != null)
/* 113:    */             {
/* 114:209 */               localamj3 = localamj2.k();
/* 115:210 */               localamj3.stackSize = (paramInt2 == 0 ? 1 : localamj3.getMaxStackSize());
/* 116:211 */               this.j.h.a(localamj3, true);
/* 117:212 */               this.j.c.a(localamj3);
/* 118:    */             }
/* 119:215 */             return;
/* 120:    */           }
/* 121:218 */           if ((localamj1 != null) && (localamj2 != null) && (localamj1.a(localamj2)))
/* 122:    */           {
/* 123:220 */             if (paramInt2 == 0)
/* 124:    */             {
/* 125:221 */               if (i != 0) {
/* 126:222 */                 localamj1.stackSize = localamj1.getMaxStackSize();
/* 127:224 */               } else if (localamj1.stackSize < localamj1.getMaxStackSize()) {
/* 128:225 */                 localamj1.stackSize += 1;
/* 129:    */               }
/* 130:    */             }
/* 131:229 */             else if (localamj1.stackSize <= 1) {
/* 132:230 */               ((ahb)localObject1).b((ItemStack)null);
/* 133:    */             } else {
/* 134:232 */               localamj1.stackSize -= 1;
/* 135:    */             }
/* 136:    */           }
/* 137:235 */           else if ((localamj2 == null) || (localamj1 != null))
/* 138:    */           {
/* 139:237 */             ((ahb)localObject1).b((ItemStack)null);
/* 140:    */           }
/* 141:    */           else
/* 142:    */           {
/* 143:240 */             ((ahb)localObject1).b(ItemStack.b(localamj2));
/* 144:241 */             localamj1 = ((ahb)localObject1).p();
/* 145:242 */             if (i != 0) {
/* 146:243 */               localamj1.stackSize = localamj1.getMaxStackSize();
/* 147:    */             }
/* 148:    */           }
/* 149:    */         }
/* 150:    */         else
/* 151:    */         {
/* 152:247 */           this.h.a(paramajk == null ? paramInt1 : paramajk.e, paramInt2, paramInt3, this.j.h);
/* 153:249 */           if (aib.c(paramInt2) == 2)
/* 154:    */           {
/* 155:250 */             for (int k = 0; k < 9; k++) {
/* 156:251 */               this.j.c.a(this.h.a(45 + k).d(), 36 + k);
/* 157:    */             }
/* 158:    */           }
/* 159:253 */           else if (paramajk != null)
/* 160:    */           {
/* 161:254 */             localObject2 = this.h.a(paramajk.e).d();
/* 162:255 */             this.j.c.a((ItemStack)localObject2, paramajk.e - this.h.c.size() + 9 + 36);
/* 163:    */           }
/* 164:    */         }
/* 165:    */       }
/* 166:    */     }
/* 167:    */     else
/* 168:    */     {
/* 169:260 */       localObject2 = this.j.h.bg;
/* 170:261 */       if (((ahb)localObject2).p() != null)
/* 171:    */       {
/* 172:262 */         if (paramInt2 == 0)
/* 173:    */         {
/* 174:263 */           this.j.h.a(((ahb)localObject2).p(), true);
/* 175:264 */           this.j.c.a(((ahb)localObject2).p());
/* 176:265 */           ((ahb)localObject2).b((ItemStack)null);
/* 177:    */         }
/* 178:267 */         if (paramInt2 == 1)
/* 179:    */         {
/* 180:268 */           localamj1 = ((ahb)localObject2).p().split(1);
/* 181:269 */           this.j.h.a(localamj1, true);
/* 182:270 */           this.j.c.a(localamj1);
/* 183:271 */           if (((ahb)localObject2).p().stackSize == 0) {
/* 184:272 */             ((ahb)localObject2).b((ItemStack)null);
/* 185:    */           }
/* 186:    */         }
/* 187:    */       }
/* 188:    */     }
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void b()
/* 192:    */   {
/* 193:281 */     if (this.j.c.h())
/* 194:    */     {
/* 195:282 */       super.b();
/* 196:283 */       this.n.clear();
/* 197:    */       
/* 198:285 */       Keyboard.enableRepeatEvents(true);
/* 199:    */       
/* 200:287 */       this.A = new bul(0, this.q, this.i + 82, this.r + 6, 89, this.q.a);
/* 201:288 */       this.A.f(15);
/* 202:289 */       this.A.a(false);
/* 203:290 */       this.A.e(false);
/* 204:291 */       this.A.g(16777215);
/* 205:    */       
/* 206:293 */       int i = w;
/* 207:294 */       w = -1;
/* 208:295 */       b(CreativeTabs.a[i]);
/* 209:    */       
/* 210:297 */       this.E = new byy(this.j);
/* 211:298 */       this.j.h.bh.a(this.E);
/* 212:    */     }
/* 213:    */     else
/* 214:    */     {
/* 215:300 */       this.j.a(new bzj(this.j.h));
/* 216:    */     }
/* 217:    */   }
/* 218:    */   
/* 219:    */   public void m()
/* 220:    */   {
/* 221:306 */     super.m();
/* 222:308 */     if ((this.j.h != null) && (this.j.h.bg != null)) {
/* 223:309 */       this.j.h.bh.b(this.E);
/* 224:    */     }
/* 225:312 */     Keyboard.enableRepeatEvents(false);
/* 226:    */   }
/* 227:    */   
/* 228:    */   protected void a(char paramChar, int paramInt)
/* 229:    */   {
/* 230:317 */     if (w != CreativeTabs.tabAllSearch.a())
/* 231:    */     {
/* 232:318 */       if (bto.a(this.j.t.ag)) {
/* 233:319 */         b(CreativeTabs.tabAllSearch);
/* 234:    */       } else {
/* 235:321 */         super.a(paramChar, paramInt);
/* 236:    */       }
/* 237:323 */       return;
/* 238:    */     }
/* 239:326 */     if (this.D)
/* 240:    */     {
/* 241:327 */       this.D = false;
/* 242:328 */       this.A.a("");
/* 243:    */     }
/* 244:331 */     if (b(paramInt)) {
/* 245:332 */       return;
/* 246:    */     }
/* 247:335 */     if (this.A.a(paramChar, paramInt)) {
/* 248:336 */       h();
/* 249:    */     } else {
/* 250:338 */       super.a(paramChar, paramInt);
/* 251:    */     }
/* 252:    */   }
/* 253:    */   
/* 254:    */   private void h()
/* 255:    */   {
/* 256:343 */     bza localbza = (bza)this.h;
/* 257:344 */     localbza.a.clear();
/* 258:346 */     for (Iterator<Item> localObject = Item.e.iterator(); localObject.hasNext();)
/* 259:    */     {
/* 260:346 */       Item localalq = localObject.next();
/* 261:347 */       if (localalq != null) {
/* 262:351 */         if (localalq.getCreativeTab() != null) {
/* 263:352 */           localalq.a(localalq, null, localbza.a);
/* 264:    */         }
/* 265:    */       }
/* 266:    */     }
/* 267:356 */     for (Enchantment localapf : Enchantment.b) {
/* 268:357 */       if ((localapf != null) && (localapf.C != null)) {
/* 269:361 */         ItemList.cd.a(localapf, localbza.a);
/* 270:    */       }
/* 271:    */     }
/* 272:364 */     Iterator<ItemStack> localObject = localbza.a.iterator();
/* 273:365 */     String str1 = this.A.b().toLowerCase();
/* 274:367 */     while (localObject.hasNext())
/* 275:    */     {
/* 276:368 */       ItemStack localamj = localObject.next();
/* 277:369 */       int k = 0;
/* 278:371 */       for (String str2 : localamj.a(this.j.h, this.j.t.x)) {
/* 279:372 */         if (net.minecraft.src.a.a(str2).toLowerCase().contains(str1))
/* 280:    */         {
/* 281:373 */           k = 1;
/* 282:374 */           break;
/* 283:    */         }
/* 284:    */       }
/* 285:378 */       if (k == 0) {
/* 286:379 */         localObject.remove();
/* 287:    */       }
/* 288:    */     }
/* 289:383 */     this.x = 0.0F;
/* 290:384 */     localbza.a(0.0F);
/* 291:    */   }
/* 292:    */   
/* 293:    */   protected void b(int paramInt1, int paramInt2)
/* 294:    */   {
/* 295:389 */     CreativeTabs localakf = CreativeTabs.a[w];
/* 296:391 */     if (localakf.h())
/* 297:    */     {
/* 298:392 */       cjm.disableBlend();
/* 299:393 */       this.q.a(cwc.a(localakf.c(), new Object[0]), 8, 6, 4210752);
/* 300:    */     }
/* 301:    */   }
/* 302:    */   
/* 303:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 304:    */   {
/* 305:399 */     if (paramInt3 == 0)
/* 306:    */     {
/* 307:400 */       int i = paramInt1 - this.i;
/* 308:401 */       int j = paramInt2 - this.r;
/* 309:403 */       for (CreativeTabs localakf : CreativeTabs.a) {
/* 310:404 */         if (a(localakf, i, j)) {
/* 311:405 */           return;
/* 312:    */         }
/* 313:    */       }
/* 314:    */     }
/* 315:410 */     super.a(paramInt1, paramInt2, paramInt3);
/* 316:    */   }
/* 317:    */   
/* 318:    */   protected void b(int paramInt1, int paramInt2, int paramInt3)
/* 319:    */   {
/* 320:415 */     if (paramInt3 == 0)
/* 321:    */     {
/* 322:416 */       int i = paramInt1 - this.i;
/* 323:417 */       int j = paramInt2 - this.r;
/* 324:419 */       for (CreativeTabs localakf : CreativeTabs.a) {
/* 325:420 */         if (a(localakf, i, j))
/* 326:    */         {
/* 327:421 */           b(localakf);
/* 328:422 */           return;
/* 329:    */         }
/* 330:    */       }
/* 331:    */     }
/* 332:427 */     super.b(paramInt1, paramInt2, paramInt3);
/* 333:    */   }
/* 334:    */   
/* 335:    */   private boolean i()
/* 336:    */   {
/* 337:431 */     return (w != CreativeTabs.tabInventory.a()) && (CreativeTabs.a[w].j()) && (((bza)this.h).e());
/* 338:    */   }
/* 339:    */   
/* 340:    */   private void b(CreativeTabs paramakf)
/* 341:    */   {
/* 342:435 */     int i = w;
/* 343:436 */     w = paramakf.a();
/* 344:437 */     bza localbza = (bza)this.h;
/* 345:    */     
/* 346:439 */     this.s.clear();
/* 347:440 */     localbza.a.clear();
/* 348:441 */     paramakf.a(localbza.a);
/* 349:443 */     if (paramakf == CreativeTabs.tabInventory)
/* 350:    */     {
/* 351:444 */       aib localaib = this.j.h.bh;
/* 352:446 */       if (this.B == null) {
/* 353:447 */         this.B = localbza.c;
/* 354:    */       }
/* 355:449 */       localbza.c = Lists.newArrayList();
/* 356:450 */       for (int j = 0; j < localaib.c.size(); j++)
/* 357:    */       {
/* 358:451 */         bzb localbzb = new bzb(this, (ajk)localaib.c.get(j), j);
/* 359:452 */         localbza.c.add(localbzb);
/* 360:    */         int k;
/* 361:    */         int m;
/* 362:    */         int n;
/* 363:454 */         if ((j >= 5) && (j < 9))
/* 364:    */         {
/* 365:455 */           k = j - 5;
/* 366:456 */           m = k / 2;
/* 367:457 */           n = k % 2;
/* 368:    */           
/* 369:459 */           localbzb.f = (9 + m * 54);
/* 370:460 */           localbzb.g = (6 + n * 27);
/* 371:    */         }
/* 372:461 */         else if ((j >= 0) && (j < 5))
/* 373:    */         {
/* 374:462 */           localbzb.g = -2000;
/* 375:463 */           localbzb.f = -2000;
/* 376:    */         }
/* 377:464 */         else if (j < localaib.c.size())
/* 378:    */         {
/* 379:465 */           k = j - 9;
/* 380:466 */           m = k % 9;
/* 381:467 */           n = k / 9;
/* 382:    */           
/* 383:469 */           localbzb.f = (9 + m * 18);
/* 384:471 */           if (j >= 36) {
/* 385:472 */             localbzb.g = 112;
/* 386:    */           } else {
/* 387:474 */             localbzb.g = (54 + n * 18);
/* 388:    */           }
/* 389:    */         }
/* 390:    */       }
/* 391:479 */       this.C = new ajk(v, 0, 173, 112);
/* 392:480 */       localbza.c.add(this.C);
/* 393:    */     }
/* 394:481 */     else if (i == CreativeTabs.tabInventory.a())
/* 395:    */     {
/* 396:482 */       localbza.c = this.B;
/* 397:483 */       this.B = null;
/* 398:    */     }
/* 399:486 */     if (this.A != null) {
/* 400:487 */       if (paramakf == CreativeTabs.tabAllSearch)
/* 401:    */       {
/* 402:488 */         this.A.e(true);
/* 403:489 */         this.A.d(false);
/* 404:490 */         this.A.b(true);
/* 405:491 */         this.A.a("");
/* 406:492 */         h();
/* 407:    */       }
/* 408:    */       else
/* 409:    */       {
/* 410:494 */         this.A.e(false);
/* 411:495 */         this.A.d(true);
/* 412:496 */         this.A.b(false);
/* 413:    */       }
/* 414:    */     }
/* 415:500 */     this.x = 0.0F;
/* 416:501 */     localbza.a(0.0F);
/* 417:    */   }
/* 418:    */   
/* 419:    */   public void k()
/* 420:    */   {
/* 421:506 */     super.k();
/* 422:    */     
/* 423:508 */     int i = Mouse.getEventDWheel();
/* 424:509 */     if ((i != 0) && (i()))
/* 425:    */     {
/* 426:510 */       int j = ((bza)this.h).a.size() / 9 - 5 + 1;
/* 427:511 */       if (i > 0) {
/* 428:512 */         i = 1;
/* 429:    */       }
/* 430:514 */       if (i < 0) {
/* 431:515 */         i = -1;
/* 432:    */       }
/* 433:517 */       this.x = ((float)(this.x - i / j));
/* 434:518 */       this.x = MathUtils.clamp(this.x, 0.0F, 1.0F);
/* 435:519 */       ((bza)this.h).a(this.x);
/* 436:    */     }
/* 437:    */   }
/* 438:    */   
/* 439:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 440:    */   {
/* 441:525 */     boolean bool = Mouse.isButtonDown(0);
/* 442:526 */     int i = this.i;
/* 443:527 */     int j = this.r;
/* 444:    */     
/* 445:529 */     int k = i + 175;
/* 446:530 */     int m = j + 18;
/* 447:531 */     int n = k + 14;
/* 448:532 */     int i1 = m + 112;
/* 449:533 */     if ((!this.z) && (bool) && 
/* 450:534 */       (paramInt1 >= k) && (paramInt2 >= m) && (paramInt1 < n) && (paramInt2 < i1)) {
/* 451:535 */       this.y = i();
/* 452:    */     }
/* 453:538 */     if (!bool) {
/* 454:539 */       this.y = false;
/* 455:    */     }
/* 456:541 */     this.z = bool;
/* 457:543 */     if (this.y)
/* 458:    */     {
/* 459:544 */       this.x = ((paramInt2 - m - 7.5F) / (i1 - m - 15.0F));
/* 460:545 */       this.x = MathUtils.clamp(this.x, 0.0F, 1.0F);
/* 461:546 */       ((bza)this.h).a(this.x);
/* 462:    */     }
/* 463:549 */     super.a(paramInt1, paramInt2, paramFloat);
/* 464:551 */     for (CreativeTabs localakf : CreativeTabs.a) {
/* 465:552 */       if (b(localakf, paramInt1, paramInt2)) {
/* 466:    */         break;
/* 467:    */       }
/* 468:    */     }
/* 469:557 */     if ((this.C != null) && (w == CreativeTabs.tabInventory.a()) && (c(this.C.f, this.C.g, 16, 16, paramInt1, paramInt2))) {
/* 470:558 */       a(cwc.a("inventory.binSlot", new Object[0]), paramInt1, paramInt2);
/* 471:    */     }
/* 472:561 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 473:562 */     cjm.disableLighting();
/* 474:    */   }
/* 475:    */   
/* 476:    */   protected void a(ItemStack paramamj, int paramInt1, int paramInt2)
/* 477:    */   {
/* 478:567 */     if (w == CreativeTabs.tabAllSearch.a())
/* 479:    */     {
/* 480:568 */       List<String> localList = paramamj.a(this.j.h, this.j.t.x);
/* 481:    */       
/* 482:570 */       Object localObject = paramamj.getItem().getCreativeTab();
/* 483:572 */       if ((localObject == null) && (paramamj.getItem() == ItemList.cd))
/* 484:    */       {
/* 485:573 */         Map localMap = aph.a(paramamj);
/* 486:575 */         if (localMap.size() == 1)
/* 487:    */         {
/* 488:576 */           Enchantment localapf = Enchantment.c(((Integer)localMap.keySet().iterator().next()).intValue());
/* 489:578 */           for (CreativeTabs localakf : CreativeTabs.a) {
/* 490:579 */             if (localakf.a(localapf.C))
/* 491:    */             {
/* 492:580 */               localObject = localakf;
/* 493:581 */               break;
/* 494:    */             }
/* 495:    */           }
/* 496:    */         }
/* 497:    */       }
/* 498:587 */       if (localObject != null) {
/* 499:588 */         localList.add(1, "" + net.minecraft.src.a.r + net.minecraft.src.a.j + cwc.a(((CreativeTabs)localObject).c(), new Object[0]));
/* 500:    */       }
/* 501:591 */       for (int i = 0; i < localList.size(); i++) {
/* 502:592 */         if (i == 0) {
/* 503:593 */           localList.set(i, paramamj.u().e + (String)localList.get(i));
/* 504:    */         } else {
/* 505:595 */           localList.set(i, net.minecraft.src.a.h + (String)localList.get(i));
/* 506:    */         }
/* 507:    */       }
/* 508:599 */       a(localList, paramInt1, paramInt2);
/* 509:    */     }
/* 510:    */     else
/* 511:    */     {
/* 512:601 */       super.a(paramamj, paramInt1, paramInt2);
/* 513:    */     }
/* 514:    */   }
/* 515:    */   
/* 516:    */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/* 517:    */   {
/* 518:607 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 519:608 */     bss.c();
/* 520:609 */     CreativeTabs localakf1 = CreativeTabs.a[w];
/* 521:611 */     for (CreativeTabs localakf2 : CreativeTabs.a)
/* 522:    */     {
/* 523:612 */       this.j.N().a(u);
/* 524:613 */       if (localakf2.a() != w) {
/* 525:614 */         a(localakf2);
/* 526:    */       }
/* 527:    */     }
/* 528:618 */     this.j.N().a(new oa("textures/gui/container/creative_inventory/tab_" + localakf1.g()));
/* 529:619 */     b(this.i, this.r, 0, 0, this.f, this.g);
/* 530:    */     
/* 531:621 */     this.A.g();
/* 532:622 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 533:    */     
/* 534:624 */     int i = this.i + 175;
/* 535:625 */     int unknown6 = this.r + 18;
/* 536:626 */     int unknown7 = unknown6 + 112;
/* 537:627 */     this.j.N().a(u);
/* 538:629 */     if (localakf1.j()) {
/* 539:630 */       b(i, unknown6 + (int)((unknown7 - unknown6 - 17) * this.x), 232 + (i() ? 0 : 12), 0, 12, 15); // 'è'
/* 540:    */     }
/* 541:633 */     a(localakf1);
/* 542:635 */     if (localakf1 == CreativeTabs.tabInventory) {
/* 543:636 */       bzj.a(this.i + 43, this.r + 45, 20, this.i + 43 - paramInt1, this.r + 45 - 30 - paramInt2, this.j.h);
/* 544:    */     }
/* 545:    */   }
/* 546:    */   
/* 547:    */   protected boolean a(CreativeTabs paramakf, int paramInt1, int paramInt2)
/* 548:    */   {
/* 549:641 */     int i = paramakf.l();
/* 550:642 */     int j = 28 * i;
/* 551:643 */     int k = 0;
/* 552:645 */     if (i == 5) {
/* 553:646 */       j = this.f - 28 + 2;
/* 554:647 */     } else if (i > 0) {
/* 555:648 */       j += i;
/* 556:    */     }
/* 557:651 */     if (paramakf.m()) {
/* 558:652 */       k -= 32;
/* 559:    */     } else {
/* 560:654 */       k += this.g;
/* 561:    */     }
/* 562:657 */     return (paramInt1 >= j) && (paramInt1 <= j + 28) && (paramInt2 >= k) && (paramInt2 <= k + 32);
/* 563:    */   }
/* 564:    */   
/* 565:    */   protected boolean b(CreativeTabs paramakf, int paramInt1, int paramInt2)
/* 566:    */   {
/* 567:661 */     int i = paramakf.l();
/* 568:662 */     int j = 28 * i;
/* 569:663 */     int k = 0;
/* 570:665 */     if (i == 5) {
/* 571:666 */       j = this.f - 28 + 2;
/* 572:667 */     } else if (i > 0) {
/* 573:668 */       j += i;
/* 574:    */     }
/* 575:671 */     if (paramakf.m()) {
/* 576:672 */       k -= 32;
/* 577:    */     } else {
/* 578:674 */       k += this.g;
/* 579:    */     }
/* 580:677 */     if (c(j + 3, k + 3, 23, 27, paramInt1, paramInt2))
/* 581:    */     {
/* 582:678 */       a(cwc.a(paramakf.c(), new Object[0]), paramInt1, paramInt2);
/* 583:679 */       return true;
/* 584:    */     }
/* 585:682 */     return false;
/* 586:    */   }
/* 587:    */   
/* 588:    */   protected void a(CreativeTabs paramakf)
/* 589:    */   {
/* 590:686 */     int i = paramakf.a() == w ? 1 : 0;
/* 591:687 */     boolean bool = paramakf.m();
/* 592:688 */     int j = paramakf.l();
/* 593:689 */     int k = j * 28;
/* 594:690 */     int m = 0;
/* 595:691 */     int n = this.i + 28 * j;
/* 596:692 */     int i1 = this.r;
/* 597:693 */     int i2 = 32;
/* 598:695 */     if (i != 0) {
/* 599:696 */       m += 32;
/* 600:    */     }
/* 601:699 */     if (j == 5) {
/* 602:700 */       n = this.i + this.f - 28;
/* 603:701 */     } else if (j > 0) {
/* 604:702 */       n += j;
/* 605:    */     }
/* 606:705 */     if (bool)
/* 607:    */     {
/* 608:706 */       i1 -= 28;
/* 609:    */     }
/* 610:    */     else
/* 611:    */     {
/* 612:708 */       m += 64;
/* 613:709 */       i1 += this.g - 4;
/* 614:    */     }
/* 615:712 */     cjm.disableLighting();
/* 616:713 */     b(n, i1, k, m, 28, i2);
/* 617:    */     
/* 618:715 */     this.e = 100.0F;
/* 619:716 */     this.k.a = 100.0F;
/* 620:717 */     n += 6;
/* 621:718 */     i1 += 8 + (bool ? 1 : -1);
/* 622:    */     
/* 623:720 */     cjm.enableLighting();
/* 624:721 */     cjm.B();
/* 625:722 */     ItemStack localamj = paramakf.d();
/* 626:723 */     this.k.b(localamj, n, i1);
/* 627:724 */     this.k.a(this.q, localamj, n, i1);
/* 628:725 */     cjm.disableLighting();
/* 629:    */     
/* 630:727 */     this.k.a = 0.0F;
/* 631:728 */     this.e = 0.0F;
/* 632:    */   }
/* 633:    */   
/* 634:    */   protected void a(bug parambug)
/* 635:    */   {
/* 636:733 */     if (parambug.k == 0) {
/* 637:734 */       this.j.a(new AchievementGUI(this, this.j.h.x()));
/* 638:    */     }
/* 639:736 */     if (parambug.k == 1) {
/* 640:737 */       this.j.a(new bxv(this, this.j.h.x()));
/* 641:    */     }
/* 642:    */   }
/* 643:    */   
/* 644:    */   public int a()
/* 645:    */   {
/* 646:742 */     return w;
/* 647:    */   }
				static wa f() {return v;}
/* 648:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byz
 * JD-Core Version:    0.7.0.1
 */
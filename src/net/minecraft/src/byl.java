package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Sets;
/*   2:    */ import java.util.Iterator;
/*   4:    */ import java.util.Set;
/*   5:    */ import org.lwjgl.input.Keyboard;
/*   6:    */ 
/*   7:    */ public abstract class byl
/*   8:    */   extends bxf
/*   9:    */ {
/*  10: 25 */   protected static final oa a = new oa("textures/gui/container/inventory.png");
/*  11: 31 */   protected int f = 176;
/*  12: 32 */   protected int g = 166;
/*  13:    */   public aib h;
/*  14:    */   protected int i;
/*  15:    */   protected int r;
/*  16:    */   private ajk u;
/*  17:    */   private ajk v;
/*  18:    */   private boolean w;
/*  19:    */   private ItemStack x;
/*  20:    */   private int y;
/*  21:    */   private int z;
/*  22:    */   private ajk A;
/*  23:    */   private long B;
/*  24:    */   private ItemStack C;
/*  25:    */   private ajk D;
/*  26:    */   private long E;
/*  27: 48 */   protected final Set<ajk> s = Sets.newHashSet();
/*  28:    */   protected boolean t;
/*  29:    */   private int F;
/*  30:    */   private int G;
/*  31:    */   private boolean H;
/*  32:    */   private int I;
/*  33:    */   private long J;
/*  34:    */   private ajk K;
/*  35:    */   private int L;
/*  36:    */   private boolean M;
/*  37:    */   private ItemStack N;
/*  38:    */   
/*  39:    */   public byl(aib paramaib)
/*  40:    */   {
/*  41: 61 */     this.h = paramaib;
/*  42: 62 */     this.H = true;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void b()
/*  46:    */   {
/*  47: 67 */     super.b();
/*  48: 68 */     this.j.h.bi = this.h;
/*  49:    */     
/*  50: 70 */     this.i = ((this.l - this.f) / 2);
/*  51: 71 */     this.r = ((this.m - this.g) / 2);
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*  55:    */   {
/*  56: 76 */     c();
/*  57: 77 */     int j = this.i;
/*  58: 78 */     int k = this.r;
/*  59:    */     
/*  60: 80 */     a(paramFloat, paramInt1, paramInt2);
/*  61:    */     
/*  62: 82 */     cjm.C();
/*  63: 83 */     bss.a();
/*  64: 84 */     cjm.disableLighting();
/*  65: 85 */     cjm.i();
/*  66:    */     
/*  67: 87 */     super.a(paramInt1, paramInt2, paramFloat);
/*  68:    */     
/*  69: 89 */     bss.c();
/*  70:    */     
/*  71: 91 */     cjm.glPushMatrix();
/*  72: 92 */     cjm.glTranslatef(j, k, 0.0F);
/*  73:    */     
/*  74: 94 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  75: 95 */     cjm.B();
/*  76:    */     
/*  77: 97 */     this.u = null;
/*  78:    */     
/*  79: 99 */     int m = 240;
/*  80:100 */     int n = 240;
/*  81:101 */     dax.glMultiTexCoord2f(dax.q, m / 1.0F, n / 1.0F);
/*  82:102 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  83:    */     int i2;
/*  84:    */     int i3;
/*  85:104 */     for (int i1 = 0; i1 < this.h.c.size(); i1++)
/*  86:    */     {
/*  87:105 */       ajk localObject = (ajk)this.h.c.get(i1);
/*  88:    */       
/*  89:107 */       a((ajk)localObject);
/*  90:109 */       if ((a((ajk)localObject, paramInt1, paramInt2)) && (((ajk)localObject).b()))
/*  91:    */       {
/*  92:110 */         this.u = ((ajk)localObject);
/*  93:    */         
/*  94:112 */         cjm.disableLighting();
/*  95:113 */         cjm.i();
/*  96:    */         
/*  97:115 */         i2 = ((ajk)localObject).f;
/*  98:116 */         i3 = ((ajk)localObject).g;
/*  99:117 */         cjm.a(true, true, true, false);
/* 100:118 */         a(i2, i3, i2 + 16, i3 + 16, -2130706433, -2130706433);
/* 101:119 */         cjm.a(true, true, true, true);
/* 102:120 */         cjm.enableLighting();
/* 103:121 */         cjm.j();
/* 104:    */       }
/* 105:    */     }
/* 106:125 */     bss.a();
/* 107:126 */     b(paramInt1, paramInt2);
/* 108:127 */     bss.c();
/* 109:    */     
/* 110:129 */     Inventory localahb = this.j.h.inventory;
/* 111:130 */     Object localObject = this.x == null ? localahb.p() : this.x;
/* 112:132 */     if (localObject != null)
/* 113:    */     {
/* 114:133 */       i2 = 8;
/* 115:134 */       i3 = this.x == null ? 8 : 16;
/* 116:135 */       String str = null;
/* 117:137 */       if ((this.x != null) && (this.w))
/* 118:    */       {
/* 119:138 */         localObject = ((ItemStack)localObject).k();
/* 120:139 */         ((ItemStack)localObject).stackSize = MathUtils.ceil(((ItemStack)localObject).stackSize / 2.0F);
/* 121:    */       }
/* 122:140 */       else if ((this.t) && (this.s.size() > 1))
/* 123:    */       {
/* 124:141 */         localObject = ((ItemStack)localObject).k();
/* 125:142 */         ((ItemStack)localObject).stackSize = this.I;
/* 126:143 */         if (((ItemStack)localObject).stackSize == 0) {
/* 127:144 */           str = "" + net.minecraft.src.a.o + "0";
/* 128:    */         }
/* 129:    */       }
/* 130:147 */       a((ItemStack)localObject, paramInt1 - j - i2, paramInt2 - k - i3, str);
/* 131:    */     }
/* 132:150 */     if (this.C != null)
/* 133:    */     {
/* 134:151 */       float f1 = (float)(bsu.I() - this.B) / 100.0F;
/* 135:153 */       if (f1 >= 1.0F)
/* 136:    */       {
/* 137:154 */         f1 = 1.0F;
/* 138:155 */         this.C = null;
/* 139:    */       }
/* 140:158 */       i3 = this.A.f - this.y;
/* 141:159 */       int i4 = this.A.g - this.z;
/* 142:160 */       int i5 = this.y + (int)(i3 * f1);
/* 143:161 */       int i6 = this.z + (int)(i4 * f1);
/* 144:    */       
/* 145:163 */       a(this.C, i5, i6, null);
/* 146:    */     }
/* 147:166 */     cjm.glPopMatrix();
/* 148:168 */     if ((localahb.p() == null) && (this.u != null) && (this.u.e()))
/* 149:    */     {
/* 150:169 */       ItemStack localamj = this.u.d();
/* 151:170 */       a(localamj, paramInt1, paramInt2);
/* 152:    */     }
/* 153:173 */     cjm.enableLighting();
/* 154:174 */     cjm.j();
/* 155:175 */     bss.b();
/* 156:    */   }
/* 157:    */   
/* 158:    */   private void a(ItemStack paramamj, int paramInt1, int paramInt2, String paramString)
/* 159:    */   {
/* 160:179 */     cjm.glTranslatef(0.0F, 0.0F, 32.0F);
/* 161:180 */     this.e = 200.0F;
/* 162:181 */     this.k.a = 200.0F;
/* 163:    */     
/* 164:183 */     this.k.b(paramamj, paramInt1, paramInt2);
/* 165:184 */     this.k.a(this.q, paramamj, paramInt1, paramInt2 - (this.x == null ? 0 : 8), paramString);
/* 166:185 */     this.e = 0.0F;
/* 167:186 */     this.k.a = 0.0F;
/* 168:    */   }
/* 169:    */   
/* 170:    */   protected void b(int paramInt1, int paramInt2) {}
/* 171:    */   
/* 172:    */   protected abstract void a(float paramFloat, int paramInt1, int paramInt2);
/* 173:    */   
/* 174:    */   private void a(ajk paramajk)
/* 175:    */   {
/* 176:195 */     int j = paramajk.f;
/* 177:196 */     int k = paramajk.g;
/* 178:197 */     ItemStack localamj1 = paramajk.d();
/* 179:198 */     int m = 0;
/* 180:199 */     int n = (paramajk == this.v) && (this.x != null) && (!this.w) ? 1 : 0;
/* 181:200 */     ItemStack localamj2 = this.j.h.inventory.p();
/* 182:201 */     String str1 = null;
/* 183:203 */     if ((paramajk == this.v) && (this.x != null) && (this.w) && (localamj1 != null))
/* 184:    */     {
/* 185:204 */       localamj1 = localamj1.k();
/* 186:205 */       localamj1.stackSize /= 2;
/* 187:    */     }
/* 188:206 */     else if ((this.t) && (this.s.contains(paramajk)) && (localamj2 != null))
/* 189:    */     {
/* 190:207 */       if (this.s.size() == 1) {
/* 191:208 */         return;
/* 192:    */       }
/* 193:210 */       if ((aib.a(paramajk, localamj2, true)) && (this.h.b(paramajk)))
/* 194:    */       {
/* 195:211 */         localamj1 = localamj2.k();
/* 196:212 */         m = 1;
/* 197:    */         
/* 198:214 */         aib.a(this.s, this.F, localamj1, paramajk.d() == null ? 0 : paramajk.d().stackSize);
/* 199:216 */         if (localamj1.stackSize > localamj1.getMaxStackSize())
/* 200:    */         {
/* 201:217 */           str1 = net.minecraft.src.a.o + "" + localamj1.getMaxStackSize();
/* 202:218 */           localamj1.stackSize = localamj1.getMaxStackSize();
/* 203:    */         }
/* 204:220 */         if (localamj1.stackSize > paramajk.b(localamj1))
/* 205:    */         {
/* 206:221 */           str1 = net.minecraft.src.a.o + "" + paramajk.b(localamj1);
/* 207:222 */           localamj1.stackSize = paramajk.b(localamj1);
/* 208:    */         }
/* 209:    */       }
/* 210:    */       else
/* 211:    */       {
/* 212:225 */         this.s.remove(paramajk);
/* 213:226 */         a();
/* 214:    */       }
/* 215:    */     }
/* 216:230 */     this.e = 100.0F;
/* 217:231 */     this.k.a = 100.0F;
/* 218:232 */     if (localamj1 == null)
/* 219:    */     {
/* 220:233 */       String str2 = paramajk.c();
/* 221:234 */       if (str2 != null)
/* 222:    */       {
/* 223:235 */         cue localcue = this.j.R().a(str2);
/* 224:236 */         cjm.disableLighting();
/* 225:237 */         this.j.N().a(cua.g);
/* 226:238 */         a(j, k, localcue, 16, 16);
/* 227:239 */         cjm.enableLighting();
/* 228:240 */         n = 1;
/* 229:    */       }
/* 230:    */     }
/* 231:244 */     if (n == 0)
/* 232:    */     {
/* 233:245 */       if (m != 0) {
/* 234:246 */         a(j, k, j + 16, k + 16, -2130706433);
/* 235:    */       }
/* 236:248 */       cjm.j();
/* 237:249 */       this.k.b(localamj1, j, k);
/* 238:250 */       this.k.a(this.q, localamj1, j, k, str1);
/* 239:    */     }
/* 240:252 */     this.k.a = 0.0F;
/* 241:253 */     this.e = 0.0F;
/* 242:    */   }
/* 243:    */   
/* 244:    */   private void a()
/* 245:    */   {
/* 246:257 */     ItemStack localamj1 = this.j.h.inventory.p();
/* 247:258 */     if ((localamj1 == null) || (!this.t)) {
/* 248:259 */       return;
/* 249:    */     }
/* 250:261 */     this.I = localamj1.stackSize;
/* 251:263 */     for (ajk localajk : this.s)
/* 252:    */     {
/* 253:264 */       ItemStack localamj2 = localamj1.k();
/* 254:265 */       int j = localajk.d() == null ? 0 : localajk.d().stackSize;
/* 255:266 */       aib.a(this.s, this.F, localamj2, j);
/* 256:267 */       if (localamj2.stackSize > localamj2.getMaxStackSize()) {
/* 257:268 */         localamj2.stackSize = localamj2.getMaxStackSize();
/* 258:    */       }
/* 259:270 */       if (localamj2.stackSize > localajk.b(localamj2)) {
/* 260:271 */         localamj2.stackSize = localajk.b(localamj2);
/* 261:    */       }
/* 262:273 */       this.I -= localamj2.stackSize - j;
/* 263:    */     }
/* 264:    */   }
/* 265:    */   
/* 266:    */   private ajk c(int paramInt1, int paramInt2)
/* 267:    */   {
/* 268:278 */     for (int j = 0; j < this.h.c.size(); j++)
/* 269:    */     {
/* 270:279 */       ajk localajk = (ajk)this.h.c.get(j);
/* 271:280 */       if (a(localajk, paramInt1, paramInt2)) {
/* 272:281 */         return localajk;
/* 273:    */       }
/* 274:    */     }
/* 275:284 */     return null;
/* 276:    */   }
/* 277:    */   
/* 278:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 279:    */   {
/* 280:289 */     super.a(paramInt1, paramInt2, paramInt3);
/* 281:290 */     int j = paramInt3 == this.j.t.ae.i() + 100 ? 1 : 0;
/* 282:291 */     ajk localajk = c(paramInt1, paramInt2);
/* 283:292 */     long l = bsu.I();
/* 284:293 */     this.M = ((this.K == localajk) && (l - this.J < 250L) && (this.L == paramInt3));
/* 285:294 */     this.H = false;
/* 286:296 */     if ((paramInt3 == 0) || (paramInt3 == 1) || (j != 0))
/* 287:    */     {
/* 288:297 */       int k = this.i;
/* 289:298 */       int m = this.r;
/* 290:299 */       int n = (paramInt1 < k) || (paramInt2 < m) || (paramInt1 >= k + this.f) || (paramInt2 >= m + this.g) ? 1 : 0;
/* 291:    */       
/* 292:301 */       int i1 = -1;
/* 293:302 */       if (localajk != null) {
/* 294:303 */         i1 = localajk.e;
/* 295:    */       }
/* 296:306 */       if (n != 0) {
/* 297:307 */         i1 = -999;
/* 298:    */       }
/* 299:310 */       if ((this.j.t.z) && (n != 0) && (this.j.h.inventory.p() == null))
/* 300:    */       {
/* 301:311 */         this.j.a((bxf)null);
/* 302:312 */         return;
/* 303:    */       }
/* 304:315 */       if (i1 != -1) {
/* 305:316 */         if (this.j.t.z)
/* 306:    */         {
/* 307:317 */           if ((localajk != null) && (localajk.e()))
/* 308:    */           {
/* 309:318 */             this.v = localajk;
/* 310:319 */             this.x = null;
/* 311:320 */             this.w = (paramInt3 == 1);
/* 312:    */           }
/* 313:    */           else
/* 314:    */           {
/* 315:322 */             this.v = null;
/* 316:    */           }
/* 317:    */         }
/* 318:324 */         else if (!this.t) {
/* 319:325 */           if (this.j.h.inventory.p() == null)
/* 320:    */           {
/* 321:326 */             if (paramInt3 == this.j.t.ae.i() + 100)
/* 322:    */             {
/* 323:327 */               a(localajk, i1, paramInt3, 3);
/* 324:    */             }
/* 325:    */             else
/* 326:    */             {
/* 327:329 */               int i2 = (i1 != -999) && ((Keyboard.isKeyDown(42)) || (Keyboard.isKeyDown(54))) ? 1 : 0;
/* 328:330 */               int i3 = 0;
/* 329:331 */               if (i2 != 0)
/* 330:    */               {
/* 331:332 */                 this.N = ((localajk != null) && (localajk.e()) ? localajk.d() : null);
/* 332:333 */                 i3 = 1;
/* 333:    */               }
/* 334:334 */               else if (i1 == -999)
/* 335:    */               {
/* 336:335 */                 i3 = 4;
/* 337:    */               }
/* 338:337 */               a(localajk, i1, paramInt3, i3);
/* 339:    */             }
/* 340:339 */             this.H = true;
/* 341:    */           }
/* 342:    */           else
/* 343:    */           {
/* 344:341 */             this.t = true;
/* 345:342 */             this.G = paramInt3;
/* 346:343 */             this.s.clear();
/* 347:345 */             if (paramInt3 == 0) {
/* 348:346 */               this.F = 0;
/* 349:347 */             } else if (paramInt3 == 1) {
/* 350:348 */               this.F = 1;
/* 351:349 */             } else if (paramInt3 == this.j.t.ae.i() + 100) {
/* 352:350 */               this.F = 2;
/* 353:    */             }
/* 354:    */           }
/* 355:    */         }
/* 356:    */       }
/* 357:    */     }
/* 358:357 */     this.K = localajk;
/* 359:358 */     this.J = l;
/* 360:359 */     this.L = paramInt3;
/* 361:    */   }
/* 362:    */   
/* 363:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, long paramLong)
/* 364:    */   {
/* 365:364 */     ajk localajk = c(paramInt1, paramInt2);
/* 366:365 */     ItemStack localamj = this.j.h.inventory.p();
/* 367:367 */     if ((this.v != null) && (this.j.t.z))
/* 368:    */     {
/* 369:368 */       if ((paramInt3 == 0) || (paramInt3 == 1)) {
/* 370:369 */         if (this.x == null)
/* 371:    */         {
/* 372:370 */           if (localajk != this.v) {
/* 373:371 */             this.x = this.v.d().k();
/* 374:    */           }
/* 375:    */         }
/* 376:373 */         else if ((this.x.stackSize > 1) && (localajk != null) && (aib.a(localajk, this.x, false)))
/* 377:    */         {
/* 378:374 */           long l = bsu.I();
/* 379:376 */           if (this.D == localajk)
/* 380:    */           {
/* 381:377 */             if (l - this.E > 500L)
/* 382:    */             {
/* 383:378 */               a(this.v, this.v.e, 0, 0);
/* 384:379 */               a(localajk, localajk.e, 1, 0);
/* 385:380 */               a(this.v, this.v.e, 0, 0);
/* 386:381 */               this.E = (l + 750L);
/* 387:382 */               this.x.stackSize -= 1;
/* 388:    */             }
/* 389:    */           }
/* 390:    */           else
/* 391:    */           {
/* 392:385 */             this.D = localajk;
/* 393:386 */             this.E = l;
/* 394:    */           }
/* 395:    */         }
/* 396:    */       }
/* 397:    */     }
/* 398:390 */     else if ((this.t) && (localajk != null) && (localamj != null) && (localamj.stackSize > this.s.size()) && (aib.a(localajk, localamj, true)) && (localajk.a(localamj)) && (this.h.b(localajk)))
/* 399:    */     {
/* 400:391 */       this.s.add(localajk);
/* 401:392 */       a();
/* 402:    */     }
/* 403:    */   }
/* 404:    */   
/* 405:    */   protected void b(int paramInt1, int paramInt2, int paramInt3)
/* 406:    */   {
/* 407:398 */     ajk localajk1 = c(paramInt1, paramInt2);
/* 408:399 */     int j = this.i;
/* 409:400 */     int k = this.r;
/* 410:401 */     int m = (paramInt1 < j) || (paramInt2 < k) || (paramInt1 >= j + this.f) || (paramInt2 >= k + this.g) ? 1 : 0;
/* 411:    */     
/* 412:403 */     int n = -1;
/* 413:404 */     if (localajk1 != null) {
/* 414:405 */       n = localajk1.e;
/* 415:    */     }
/* 416:408 */     if (m != 0) {
/* 417:409 */       n = -999;
/* 418:    */     }
/* 419:    */     ajk localajk2;
/* 420:412 */     if ((this.M) && (localajk1 != null) && (paramInt3 == 0) && (this.h.a(null, localajk1)))
/* 421:    */     {
/* 422:    */       Iterator<ajk> localIterator1;
/* 423:413 */       if (r())
/* 424:    */       {
/* 425:414 */         if ((localajk1 != null) && (localajk1.d != null) && (this.N != null)) {
/* 426:415 */           for (localIterator1 = this.h.c.iterator(); localIterator1.hasNext();)
/* 427:    */           {
/* 428:415 */             localajk2 = (ajk)localIterator1.next();
/* 429:416 */             if ((localajk2 != null) && (localajk2.a(this.j.h)) && (localajk2.e()) && (localajk2.d == localajk1.d) && (aib.a(localajk2, this.N, true))) {
/* 430:417 */               a(localajk2, localajk2.e, paramInt3, 1);
/* 431:    */             }
/* 432:    */           }
/* 433:    */         }
/* 434:    */       }
/* 435:    */       else {
/* 436:422 */         a(localajk1, n, paramInt3, 6);
/* 437:    */       }
/* 438:424 */       this.M = false;
/* 439:425 */       this.J = 0L;
/* 440:    */     }
/* 441:    */     else
/* 442:    */     {
/* 443:427 */       if ((this.t) && (this.G != paramInt3))
/* 444:    */       {
/* 445:428 */         this.t = false;
/* 446:429 */         this.s.clear();
/* 447:430 */         this.H = true;
/* 448:431 */         return;
/* 449:    */       }
/* 450:432 */       if (this.H)
/* 451:    */       {
/* 452:433 */         this.H = false;
/* 453:434 */         return;
/* 454:    */       }
/* 455:437 */       if ((this.v != null) && (this.j.t.z))
/* 456:    */       {
/* 457:438 */         if ((paramInt3 == 0) || (paramInt3 == 1))
/* 458:    */         {
/* 459:439 */           if ((this.x == null) && (localajk1 != this.v)) {
/* 460:440 */             this.x = this.v.d();
/* 461:    */           }
/* 462:443 */           boolean bool = aib.a(localajk1, this.x, false);
/* 463:445 */           if ((n != -1) && (this.x != null) && (bool))
/* 464:    */           {
/* 465:446 */             a(this.v, this.v.e, paramInt3, 0);
/* 466:447 */             a(localajk1, n, 0, 0);
/* 467:449 */             if (this.j.h.inventory.p() != null)
/* 468:    */             {
/* 469:450 */               a(this.v, this.v.e, paramInt3, 0);
/* 470:451 */               this.y = (paramInt1 - j);
/* 471:452 */               this.z = (paramInt2 - k);
/* 472:453 */               this.A = this.v;
/* 473:454 */               this.C = this.x;
/* 474:455 */               this.B = bsu.I();
/* 475:    */             }
/* 476:    */             else
/* 477:    */             {
/* 478:457 */               this.C = null;
/* 479:    */             }
/* 480:    */           }
/* 481:459 */           else if (this.x != null)
/* 482:    */           {
/* 483:460 */             this.y = (paramInt1 - j);
/* 484:461 */             this.z = (paramInt2 - k);
/* 485:462 */             this.A = this.v;
/* 486:463 */             this.C = this.x;
/* 487:464 */             this.B = bsu.I();
/* 488:    */           }
/* 489:467 */           this.x = null;
/* 490:468 */           this.v = null;
/* 491:    */         }
/* 492:    */       }
/* 493:470 */       else if ((this.t) && (!this.s.isEmpty()))
/* 494:    */       {
/* 495:471 */         a(null, -999, aib.d(0, this.F), 5);
/* 496:473 */         for (Iterator<ajk> localIterator2 = this.s.iterator(); localIterator2.hasNext();)
/* 497:    */         {
/* 498:473 */           localajk2 = (ajk)localIterator2.next();
/* 499:474 */           a(localajk2, localajk2.e, aib.d(1, this.F), 5);
/* 500:    */         }
/* 501:477 */         a(null, -999, aib.d(2, this.F), 5);
/* 502:    */       }
/* 503:478 */       else if (this.j.h.inventory.p() != null)
/* 504:    */       {
/* 505:479 */         if (paramInt3 == this.j.t.ae.i() + 100)
/* 506:    */         {
/* 507:480 */           a(localajk1, n, paramInt3, 3);
/* 508:    */         }
/* 509:    */         else
/* 510:    */         {
/* 511:482 */           int i1 = (n != -999) && ((Keyboard.isKeyDown(42)) || (Keyboard.isKeyDown(54))) ? 1 : 0;
/* 512:483 */           if (i1 != 0) {
/* 513:484 */             this.N = ((localajk1 != null) && (localajk1.e()) ? localajk1.d() : null);
/* 514:    */           }
/* 515:486 */           a(localajk1, n, paramInt3, i1 != 0 ? 1 : 0);
/* 516:    */         }
/* 517:    */       }
/* 518:    */     }
/* 519:491 */     if (this.j.h.inventory.p() == null) {
/* 520:492 */       this.J = 0L;
/* 521:    */     }
/* 522:495 */     this.t = false;
/* 523:    */   }
/* 524:    */   
/* 525:    */   private boolean a(ajk paramajk, int paramInt1, int paramInt2)
/* 526:    */   {
/* 527:499 */     return c(paramajk.f, paramajk.g, 16, 16, paramInt1, paramInt2);
/* 528:    */   }
/* 529:    */   
/* 530:    */   protected boolean c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 531:    */   {
/* 532:503 */     int j = this.i;
/* 533:504 */     int k = this.r;
/* 534:505 */     paramInt5 -= j;
/* 535:506 */     paramInt6 -= k;
/* 536:    */     
/* 537:508 */     return (paramInt5 >= paramInt1 - 1) && (paramInt5 < paramInt1 + paramInt3 + 1) && (paramInt6 >= paramInt2 - 1) && (paramInt6 < paramInt2 + paramInt4 + 1);
/* 538:    */   }
/* 539:    */   
/* 540:    */   protected void a(ajk paramajk, int paramInt1, int paramInt2, int paramInt3)
/* 541:    */   {
/* 542:512 */     if (paramajk != null) {
/* 543:513 */       paramInt1 = paramajk.e;
/* 544:    */     }
/* 545:515 */     this.j.c.a(this.h.d, paramInt1, paramInt2, paramInt3, this.j.h);
/* 546:    */   }
/* 547:    */   
/* 548:    */   protected void a(char paramChar, int paramInt)
/* 549:    */   {
/* 550:520 */     if ((paramInt == 1) || (paramInt == this.j.t.aa.i())) {
/* 551:521 */       this.j.h.n();
/* 552:    */     }
/* 553:524 */     b(paramInt);
/* 554:526 */     if ((this.u != null) && (this.u.e())) {
/* 555:527 */       if (paramInt == this.j.t.ae.i()) {
/* 556:528 */         a(this.u, this.u.e, 0, 3);
/* 557:529 */       } else if (paramInt == this.j.t.ac.i()) {
/* 558:530 */         a(this.u, this.u.e, q() ? 1 : 0, 4);
/* 559:    */       }
/* 560:    */     }
/* 561:    */   }
/* 562:    */   
/* 563:    */   protected boolean b(int paramInt)
/* 564:    */   {
/* 565:536 */     if ((this.j.h.inventory.p() == null) && (this.u != null)) {
/* 566:537 */       for (int j = 0; j < 9; j++) {
/* 567:538 */         if (paramInt == this.j.t.as[j].i())
/* 568:    */         {
/* 569:539 */           a(this.u, this.u.e, j, 2);
/* 570:540 */           return true;
/* 571:    */         }
/* 572:    */       }
/* 573:    */     }
/* 574:545 */     return false;
/* 575:    */   }
/* 576:    */   
/* 577:    */   public void m()
/* 578:    */   {
/* 579:550 */     if (this.j.h == null) {
/* 580:551 */       return;
/* 581:    */     }
/* 582:553 */     this.h.b(this.j.h);
/* 583:    */   }
/* 584:    */   
/* 585:    */   public boolean d()
/* 586:    */   {
/* 587:558 */     return false;
/* 588:    */   }
/* 589:    */   
/* 590:    */   public void e()
/* 591:    */   {
/* 592:563 */     super.e();
/* 593:564 */     if ((!this.j.h.ai()) || (this.j.h.isDead)) {
/* 594:565 */       this.j.h.n();
/* 595:    */     }
/* 596:    */   }
/* 597:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byl
 * JD-Core Version:    0.7.0.1
 */
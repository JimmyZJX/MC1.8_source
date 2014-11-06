package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Sets;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.Iterator;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Set;
/*   7:    */ 
/*   8:    */ public abstract class aib
/*   9:    */ {
/*  10: 36 */   public List b = Lists.newArrayList();
/*  11: 37 */   public List<ajk> c = Lists.newArrayList();
/*  12:    */   public int d;
/*  13:    */   private short a;
/*  14: 41 */   private int f = -1;
/*  15:    */   private int g;
/*  16: 43 */   private final Set h = Sets.newHashSet();
/*  17: 45 */   protected List e = Lists.newArrayList();
/*  18:    */   
/*  19:    */   protected ajk a(ajk paramajk)
/*  20:    */   {
/*  21: 48 */     paramajk.e = this.c.size();
/*  22: 49 */     this.c.add(paramajk);
/*  23: 50 */     this.b.add(null);
/*  24: 51 */     return paramajk;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void a(ail paramail)
/*  28:    */   {
/*  29: 55 */     if (this.e.contains(paramail)) {
/*  30: 56 */       throw new IllegalArgumentException("Listener already listening");
/*  31:    */     }
/*  32: 58 */     this.e.add(paramail);
/*  33:    */     
/*  34: 60 */     paramail.a(this, a());
/*  35: 61 */     b();
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void b(ail paramail)
/*  39:    */   {
/*  40: 65 */     this.e.remove(paramail);
/*  41:    */   }
/*  42:    */   
/*  43:    */   public List a()
/*  44:    */   {
/*  45: 69 */     ArrayList localArrayList = Lists.newArrayList();
/*  46: 70 */     for (int j = 0; j < this.c.size(); j++) {
/*  47: 71 */       localArrayList.add(((ajk)this.c.get(j)).d());
/*  48:    */     }
/*  49: 73 */     return localArrayList;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void b()
/*  53:    */   {
/*  54: 83 */     for (int j = 0; j < this.c.size(); j++)
/*  55:    */     {
/*  56: 84 */       ItemStack localamj1 = ((ajk)this.c.get(j)).d();
/*  57: 85 */       ItemStack localamj2 = (ItemStack)this.b.get(j);
/*  58: 86 */       if (!ItemStack.b(localamj2, localamj1))
/*  59:    */       {
/*  60: 87 */         localamj2 = localamj1 == null ? null : localamj1.k();
/*  61: 88 */         this.b.set(j, localamj2);
/*  62: 89 */         for (int k = 0; k < this.e.size(); k++) {
/*  63: 90 */           ((ail)this.e.get(k)).a(this, j, localamj2);
/*  64:    */         }
/*  65:    */       }
/*  66:    */     }
/*  67:    */   }
/*  68:    */   
/*  69:    */   public boolean a(EntityPlayer paramahd, int paramInt)
/*  70:    */   {
/*  71: 97 */     return false;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public ajk a(vq paramvq, int paramInt)
/*  75:    */   {
/*  76:102 */     for (int j = 0; j < this.c.size(); j++)
/*  77:    */     {
/*  78:103 */       ajk localajk = (ajk)this.c.get(j);
/*  79:104 */       if (localajk.a(paramvq, paramInt)) {
/*  80:105 */         return localajk;
/*  81:    */       }
/*  82:    */     }
/*  83:108 */     return null;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public ajk a(int paramInt)
/*  87:    */   {
/*  88:112 */     return (ajk)this.c.get(paramInt);
/*  89:    */   }
/*  90:    */   
/*  91:    */   public ItemStack b(EntityPlayer paramahd, int paramInt)
/*  92:    */   {
/*  93:117 */     ajk localajk = (ajk)this.c.get(paramInt);
/*  94:118 */     if (localajk != null) {
/*  95:119 */       return localajk.d();
/*  96:    */     }
/*  97:121 */     return null;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public ItemStack a(int paramInt1, int paramInt2, int paramInt3, EntityPlayer paramahd)
/* 101:    */   {
/* 102:126 */     ItemStack localamj1 = null;
/* 103:127 */     ahb localahb = paramahd.bg;
/* 104:    */     
/* 105:    */     Object localObject3;
/* 106:    */     ItemStack localamj4;
/* 107:129 */     if (paramInt3 == 5)
/* 108:    */     {
/* 109:130 */       int j = this.g;
/* 110:131 */       this.g = c(paramInt2);
/* 111:133 */       if (((j != 1) || (this.g != 2)) && (j != this.g))
/* 112:    */       {
/* 113:134 */         d();
/* 114:    */       }
/* 115:135 */       else if (localahb.p() == null)
/* 116:    */       {
/* 117:136 */         d();
/* 118:    */       }
/* 119:137 */       else if (this.g == 0)
/* 120:    */       {
/* 121:138 */         this.f = b(paramInt2);
/* 122:140 */         if (a(this.f, paramahd))
/* 123:    */         {
/* 124:141 */           this.g = 1;
/* 125:142 */           this.h.clear();
/* 126:    */         }
/* 127:    */         else
/* 128:    */         {
/* 129:144 */           d();
/* 130:    */         }
/* 131:    */       }
/* 132:146 */       else if (this.g == 1)
/* 133:    */       {
/* 134:147 */         ajk localObject11 = (ajk)this.c.get(paramInt1);
/* 135:149 */         if ((localObject11 != null) && (a((ajk)localObject11, localahb.p(), true)) && (((ajk)localObject11).a(localahb.p())) && (localahb.p().stackSize > this.h.size()) && (b((ajk)localObject11))) {
/* 136:150 */           this.h.add(localObject11);
/* 137:    */         }
/* 138:    */       }
/* 139:152 */       else if (this.g == 2)
/* 140:    */       {
/* 141:153 */         if (!this.h.isEmpty())
/* 142:    */         {
/* 143:154 */           ItemStack localObject1 = localahb.p().k();
/* 144:155 */           int k = localahb.p().stackSize;
/* 145:157 */           for (Iterator localIterator = this.h.iterator(); localIterator.hasNext();)
/* 146:    */           {
/* 147:157 */             localObject3 = (ajk)localIterator.next();
/* 148:158 */             if ((localObject3 != null) && (a((ajk)localObject3, localahb.p(), true)) && (((ajk)localObject3).a(localahb.p())) && (localahb.p().stackSize >= this.h.size()) && (b((ajk)localObject3)))
/* 149:    */             {
/* 150:159 */               localamj4 = ((ItemStack)localObject1).k();
/* 151:160 */               int i1 = ((ajk)localObject3).e() ? ((ajk)localObject3).d().stackSize : 0;
/* 152:161 */               a(this.h, this.f, localamj4, i1);
/* 153:163 */               if (localamj4.stackSize > localamj4.getMaxStackSize()) {
/* 154:164 */                 localamj4.stackSize = localamj4.getMaxStackSize();
/* 155:    */               }
/* 156:166 */               if (localamj4.stackSize > ((ajk)localObject3).b(localamj4)) {
/* 157:167 */                 localamj4.stackSize = ((ajk)localObject3).b(localamj4);
/* 158:    */               }
/* 159:170 */               k -= localamj4.stackSize - i1;
/* 160:171 */               ((ajk)localObject3).d(localamj4);
/* 161:    */             }
/* 162:    */           }
/* 163:175 */           ((ItemStack)localObject1).stackSize = k;
/* 164:176 */           if (((ItemStack)localObject1).stackSize <= 0) {
/* 165:177 */             localObject1 = null;
/* 166:    */           }
/* 167:179 */           localahb.b((ItemStack)localObject1);
/* 168:    */         }
/* 169:182 */         d();
/* 170:    */       }
/* 171:    */       else
/* 172:    */       {
/* 173:184 */         d();
/* 174:    */       }
/* 175:    */     }
/* 176:186 */     else if (this.g != 0)
/* 177:    */     {
/* 178:187 */       d();
/* 179:    */     }
/* 180:    */     else
/* 181:    */     {
/* 182:    */       ajk localajk1;
/* 183:    */       ItemStack localamj3;
/* 184:188 */       if (((paramInt3 == 0) || (paramInt3 == 1)) && ((paramInt2 == 0) || (paramInt2 == 1)))
/* 185:    */       {
/* 186:189 */         if (paramInt1 == -999)
/* 187:    */         {
/* 188:190 */           if (localahb.p() != null)
/* 189:    */           {
/* 190:191 */             if (paramInt2 == 0)
/* 191:    */             {
/* 192:192 */               paramahd.a(localahb.p(), true);
/* 193:193 */               localahb.b((ItemStack)null);
/* 194:    */             }
/* 195:195 */             if (paramInt2 == 1)
/* 196:    */             {
/* 197:196 */               paramahd.a(localahb.p().split(1), true);
/* 198:197 */               if (localahb.p().stackSize == 0) {
/* 199:198 */                 localahb.b((ItemStack)null);
/* 200:    */               }
/* 201:    */             }
/* 202:    */           }
/* 203:    */         }
/* 204:    */         else
/* 205:    */         {
/* 206:    */           
/* 207:202 */           if (paramInt3 == 1)
/* 208:    */           {
/* 209:203 */             if (paramInt1 < 0) {
/* 210:204 */               return null;
/* 211:    */             }
/* 212:206 */             localajk1 = (ajk)this.c.get(paramInt1);
/* 213:207 */             if ((localajk1 != null) && (localajk1.a(paramahd)))
/* 214:    */             {
/* 215:208 */               ItemStack localObject1 = b(paramahd, paramInt1);
/* 216:209 */               if (localObject1 != null)
/* 217:    */               {
/* 218:210 */                 Item localObject2 = ((ItemStack)localObject1).getItem();
/* 219:211 */                 localamj1 = ((ItemStack)localObject1).k();
/* 220:213 */                 if ((localajk1.d() != null) && (localajk1.d().getItem() == localObject2)) {
/* 221:214 */                   a(paramInt1, paramInt2, true, paramahd);
/* 222:    */                 }
/* 223:    */               }
/* 224:    */             }
/* 225:    */           }
/* 226:    */           else
/* 227:    */           {
/* 228:219 */             if (paramInt1 < 0) {
/* 229:220 */               return null;
/* 230:    */             }
/* 231:223 */             localajk1 = (ajk)this.c.get(paramInt1);
/* 232:224 */             if (localajk1 != null)
/* 233:    */             {
/* 234:225 */               ItemStack localObject1 = localajk1.d();
/* 235:226 */               ItemStack localObject2 = localahb.p();
/* 236:228 */               if (localObject1 != null) {
/* 237:229 */                 localamj1 = ((ItemStack)localObject1).k();
/* 238:    */               }
/* 239:232 */               if (localObject1 == null)
/* 240:    */               {
/* 241:233 */                 if ((localObject2 != null) && (localajk1.a((ItemStack)localObject2)))
/* 242:    */                 {
/* 243:234 */                   int localamj31 = paramInt2 == 0 ? ((ItemStack)localObject2).stackSize : 1;
/* 244:235 */                   if (localamj31 > localajk1.b((ItemStack)localObject2)) {
/* 245:236 */                     localamj31 = localajk1.b((ItemStack)localObject2);
/* 246:    */                   }
/* 247:238 */                   if (((ItemStack)localObject2).stackSize >= localamj31) {
/* 248:239 */                     localajk1.d(((ItemStack)localObject2).split(localamj31));
/* 249:    */                   }
/* 250:241 */                   if (((ItemStack)localObject2).stackSize == 0) {
/* 251:242 */                     localahb.b((ItemStack)null);
/* 252:    */                   }
/* 253:    */                 }
/* 254:    */               }
/* 255:245 */               else if (localajk1.a(paramahd)) {
/* 256:246 */                 if (localObject2 == null)
/* 257:    */                 {
/* 258:248 */                   int localamj31 = paramInt2 == 0 ? ((ItemStack)localObject1).stackSize : (((ItemStack)localObject1).stackSize + 1) / 2;
/* 259:249 */                   localObject3 = localajk1.a(localamj31);
/* 260:    */                   
/* 261:251 */                   localahb.b((ItemStack)localObject3);
/* 262:252 */                   if (((ItemStack)localObject1).stackSize == 0) {
/* 263:253 */                     localajk1.d(null);
/* 264:    */                   }
/* 265:255 */                   localajk1.a(paramahd, localahb.p());
/* 266:    */                 }
/* 267:256 */                 else if (localajk1.a((ItemStack)localObject2))
/* 268:    */                 {
/* 269:258 */                   if ((((ItemStack)localObject1).getItem() != ((ItemStack)localObject2).getItem()) || (((ItemStack)localObject1).i() != ((ItemStack)localObject2).i()) || (!ItemStack.a((ItemStack)localObject1, (ItemStack)localObject2)))
/* 270:    */                   {
/* 271:260 */                     if (((ItemStack)localObject2).stackSize <= localajk1.b((ItemStack)localObject2))
/* 272:    */                     {
/* 273:261 */                       localajk1.d((ItemStack)localObject2);
/* 274:262 */                       localahb.b((ItemStack)localObject1);
/* 275:    */                     }
/* 276:    */                   }
/* 277:    */                   else
/* 278:    */                   {
/* 279:266 */                     int localamj31 = paramInt2 == 0 ? ((ItemStack)localObject2).stackSize : 1;
/* 280:267 */                     if (localamj31 > localajk1.b((ItemStack)localObject2) - ((ItemStack)localObject1).stackSize) {
/* 281:268 */                       localamj31 = localajk1.b((ItemStack)localObject2) - ((ItemStack)localObject1).stackSize;
/* 282:    */                     }
/* 283:270 */                     if (localamj31 > ((ItemStack)localObject2).getMaxStackSize() - ((ItemStack)localObject1).stackSize) {
/* 284:271 */                       localamj31 = ((ItemStack)localObject2).getMaxStackSize() - ((ItemStack)localObject1).stackSize;
/* 285:    */                     }
/* 286:273 */                     ((ItemStack)localObject2).split(localamj31);
/* 287:274 */                     if (((ItemStack)localObject2).stackSize == 0) {
/* 288:275 */                       localahb.b((ItemStack)null);
/* 289:    */                     }
/* 290:277 */                     localObject1.stackSize += localamj31;
/* 291:    */                   }
/* 292:    */                 }
/* 293:281 */                 else if ((((ItemStack)localObject1).getItem() == ((ItemStack)localObject2).getItem()) && (((ItemStack)localObject2).getMaxStackSize() > 1) && ((!((ItemStack)localObject1).f()) || (((ItemStack)localObject1).i() == ((ItemStack)localObject2).i())) && (ItemStack.a((ItemStack)localObject1, (ItemStack)localObject2)))
/* 294:    */                 {
/* 295:282 */                   int localamj31 = ((ItemStack)localObject1).stackSize;
/* 296:283 */                   if ((localamj31 > 0) && (localamj31 + ((ItemStack)localObject2).stackSize <= ((ItemStack)localObject2).getMaxStackSize()))
/* 297:    */                   {
/* 298:284 */                     localObject2.stackSize += localamj31;
/* 299:285 */                     localObject1 = localajk1.a(localamj31);
/* 300:286 */                     if (((ItemStack)localObject1).stackSize == 0) {
/* 301:287 */                       localajk1.d(null);
/* 302:    */                     }
/* 303:289 */                     localajk1.a(paramahd, localahb.p());
/* 304:    */                   }
/* 305:    */                 }
/* 306:    */               }
/* 307:294 */               localajk1.f();
/* 308:    */             }
/* 309:    */           }
/* 310:    */         }
/* 311:    */       }
/* 312:    */       else
/* 313:    */       {
/* 314:    */         ItemStack localamj2;
/* 315:297 */         if ((paramInt3 == 2) && (paramInt2 >= 0) && (paramInt2 < 9))
/* 316:    */         {
/* 317:298 */           localajk1 = (ajk)this.c.get(paramInt1);
/* 318:299 */           if (localajk1.a(paramahd))
/* 319:    */           {
/* 320:300 */             ItemStack localObject1 = localahb.a(paramInt2);
/* 321:301 */             int localamj21 = (localObject1 == null) || ((localajk1.d == localahb) && (localajk1.a((ItemStack)localObject1))) ? 1 : 0;
/* 322:302 */             int localamj31 = -1;
/* 323:304 */             if (localamj21 == 0)
/* 324:    */             {
/* 325:305 */               localamj31 = localahb.j();
/* 326:306 */               localamj21 |= (localamj31 > -1 ? 1 : 0);
/* 327:    */             }
/* 328:309 */             if ((localajk1.e()) && (localamj21 != 0))
/* 329:    */             {
/* 330:310 */               localObject3 = localajk1.d();
/* 331:    */               
/* 332:312 */               localahb.a(paramInt2, ((ItemStack)localObject3).k());
/* 333:314 */               if (((localajk1.d == localahb) && (localajk1.a((ItemStack)localObject1))) || (localObject1 == null))
/* 334:    */               {
/* 335:315 */                 localajk1.a(((ItemStack)localObject3).stackSize);
/* 336:316 */                 localajk1.d((ItemStack)localObject1);
/* 337:317 */                 localajk1.a(paramahd, (ItemStack)localObject3);
/* 338:    */               }
/* 339:318 */               else if (localamj31 > -1)
/* 340:    */               {
/* 341:319 */                 localahb.a((ItemStack)localObject1);
/* 342:320 */                 localajk1.a(((ItemStack)localObject3).stackSize);
/* 343:321 */                 localajk1.d(null);
/* 344:322 */                 localajk1.a(paramahd, (ItemStack)localObject3);
/* 345:    */               }
/* 346:    */             }
/* 347:324 */             else if ((!localajk1.e()) && (localObject1 != null) && (localajk1.a((ItemStack)localObject1)))
/* 348:    */             {
/* 349:325 */               localahb.a(paramInt2, null);
/* 350:326 */               localajk1.d((ItemStack)localObject1);
/* 351:    */             }
/* 352:    */           }
/* 353:    */         }
/* 354:329 */         else if ((paramInt3 == 3) && (paramahd.by.d) && (localahb.p() == null) && (paramInt1 >= 0))
/* 355:    */         {
/* 356:330 */           localajk1 = (ajk)this.c.get(paramInt1);
/* 357:331 */           if ((localajk1 != null) && (localajk1.e()))
/* 358:    */           {
/* 359:332 */             ItemStack localObject1 = localajk1.d().k();
/* 360:333 */             ((ItemStack)localObject1).stackSize = ((ItemStack)localObject1).getMaxStackSize();
/* 361:334 */             localahb.b((ItemStack)localObject1);
/* 362:    */           }
/* 363:    */         }
/* 364:336 */         else if ((paramInt3 == 4) && (localahb.p() == null) && (paramInt1 >= 0))
/* 365:    */         {
/* 366:337 */           localajk1 = (ajk)this.c.get(paramInt1);
/* 367:338 */           if ((localajk1 != null) && (localajk1.e()) && (localajk1.a(paramahd)))
/* 368:    */           {
/* 369:339 */             ItemStack localObject1 = localajk1.a(paramInt2 == 0 ? 1 : localajk1.d().stackSize);
/* 370:340 */             localajk1.a(paramahd, (ItemStack)localObject1);
/* 371:341 */             paramahd.a((ItemStack)localObject1, true);
/* 372:    */           }
/* 373:    */         }
/* 374:343 */         else if ((paramInt3 == 6) && (paramInt1 >= 0))
/* 375:    */         {
/* 376:344 */           localajk1 = (ajk)this.c.get(paramInt1);
/* 377:345 */           ItemStack localObject11 = localahb.p();
/* 378:347 */           if ((localObject11 != null) && ((localajk1 == null) || (!localajk1.e()) || (!localajk1.a(paramahd))))
/* 379:    */           {
/* 380:348 */             int localamj21 = paramInt2 == 0 ? 0 : this.c.size() - 1;
/* 381:349 */             int localamj31 = paramInt2 == 0 ? 1 : -1;
/* 382:351 */             for (int m = 0; m < 2; m++)
/* 383:    */             {
/* 384:    */               int n;
/* 385:353 */               for (int localamj41 = localamj21; (localamj41 >= 0) && (localamj41 < this.c.size()) && (((ItemStack)localObject11).stackSize < ((ItemStack)localObject11).getMaxStackSize()); localamj41 += localamj31)
/* 386:    */               {
/* 387:354 */                 ajk localajk2 = (ajk)this.c.get(localamj41);
/* 388:356 */                 if ((localajk2.e()) && (a(localajk2, localObject11, true)) && (localajk2.a(paramahd)) && (a(localObject11, localajk2)) && (
/* 389:357 */                   (m != 0) || (localajk2.d().stackSize != localajk2.d().getMaxStackSize())))
/* 390:    */                 {
/* 391:360 */                   int i2 = Math.min(localObject11.getMaxStackSize() - localObject11.stackSize, localajk2.d().stackSize);
/* 392:361 */                   ItemStack localamj5 = localajk2.a(i2);
/* 393:362 */                   localObject11.stackSize += i2;
/* 394:364 */                   if (localamj5.stackSize <= 0) {
/* 395:365 */                     localajk2.d(null);
/* 396:    */                   }
/* 397:367 */                   localajk2.a(paramahd, localamj5);
/* 398:    */                 }
/* 399:    */               }
/* 400:    */             }
/* 401:    */           }
/* 402:373 */           b();
/* 403:    */         }
/* 404:    */       }
/* 405:    */     }
/* 406:376 */     return localamj1;
/* 407:    */   }
/* 408:    */   
/* 409:    */   public boolean a(ItemStack paramamj, ajk paramajk)
/* 410:    */   {
/* 411:380 */     return true;
/* 412:    */   }
/* 413:    */   
/* 414:    */   protected void a(int paramInt1, int paramInt2, boolean paramBoolean, EntityPlayer paramahd)
/* 415:    */   {
/* 416:384 */     a(paramInt1, paramInt2, 1, paramahd);
/* 417:    */   }
/* 418:    */   
/* 419:    */   public void b(EntityPlayer paramahd)
/* 420:    */   {
/* 421:388 */     ahb localahb = paramahd.bg;
/* 422:389 */     if (localahb.p() != null)
/* 423:    */     {
/* 424:390 */       paramahd.a(localahb.p(), false);
/* 425:391 */       localahb.b((ItemStack)null);
/* 426:    */     }
/* 427:    */   }
/* 428:    */   
/* 429:    */   public void a(vq paramvq)
/* 430:    */   {
/* 431:396 */     b();
/* 432:    */   }
/* 433:    */   
/* 434:    */   public void a(int paramInt, ItemStack paramamj)
/* 435:    */   {
/* 436:404 */     a(paramInt).d(paramamj);
/* 437:    */   }
/* 438:    */   
/* 439:    */   public void a(ItemStack[] paramArrayOfamj)
/* 440:    */   {
/* 441:408 */     for (int j = 0; j < paramArrayOfamj.length; j++) {
/* 442:409 */       a(j).d(paramArrayOfamj[j]);
/* 443:    */     }
/* 444:    */   }
/* 445:    */   
/* 446:    */   public void b(int paramInt1, int paramInt2) {}
/* 447:    */   
/* 448:    */   public short a(ahb paramahb)
/* 449:    */   {
/* 450:417 */     this.a = ((short)(this.a + 1));
/* 451:418 */     return this.a;
/* 452:    */   }
/* 453:    */   
/* 454:421 */   private Set i = Sets.newHashSet();
/* 455:    */   
/* 456:    */   public boolean c(EntityPlayer paramahd)
/* 457:    */   {
/* 458:424 */     return !this.i.contains(paramahd);
/* 459:    */   }
/* 460:    */   
/* 461:    */   public void a(EntityPlayer paramahd, boolean paramBoolean)
/* 462:    */   {
/* 463:428 */     if (paramBoolean) {
/* 464:429 */       this.i.remove(paramahd);
/* 465:    */     } else {
/* 466:431 */       this.i.add(paramahd);
/* 467:    */     }
/* 468:    */   }
/* 469:    */   
/* 470:    */   public abstract boolean a(EntityPlayer paramahd);
/* 471:    */   
/* 472:    */   protected boolean a(ItemStack paramamj, int paramInt1, int paramInt2, boolean paramBoolean)
/* 473:    */   {
/* 474:438 */     boolean bool = false;
/* 475:    */     
/* 476:440 */     int j = paramInt1;
/* 477:441 */     if (paramBoolean) {
/* 478:442 */       j = paramInt2 - 1;
/* 479:    */     }
/* 480:    */     ajk localajk;
/* 481:    */     ItemStack localamj;
/* 482:446 */     if (paramamj.isStackable()) {
/* 483:447 */       while ((paramamj.stackSize > 0) && (((!paramBoolean) && (j < paramInt2)) || ((paramBoolean) && (j >= paramInt1))))
/* 484:    */       {
/* 485:448 */         localajk = (ajk)this.c.get(j);
/* 486:449 */         localamj = localajk.d();
/* 487:450 */         if ((localamj != null) && (localamj.getItem() == paramamj.getItem()) && ((!paramamj.f()) || (paramamj.i() == localamj.i())) && (ItemStack.a(paramamj, localamj)))
/* 488:    */         {
/* 489:451 */           int k = localamj.stackSize + paramamj.stackSize;
/* 490:452 */           if (k <= paramamj.getMaxStackSize())
/* 491:    */           {
/* 492:453 */             paramamj.stackSize = 0;
/* 493:454 */             localamj.stackSize = k;
/* 494:455 */             localajk.f();
/* 495:456 */             bool = true;
/* 496:    */           }
/* 497:457 */           else if (localamj.stackSize < paramamj.getMaxStackSize())
/* 498:    */           {
/* 499:458 */             paramamj.stackSize -= paramamj.getMaxStackSize() - localamj.stackSize;
/* 500:459 */             localamj.stackSize = paramamj.getMaxStackSize();
/* 501:460 */             localajk.f();
/* 502:461 */             bool = true;
/* 503:    */           }
/* 504:    */         }
/* 505:465 */         if (paramBoolean) {
/* 506:466 */           j--;
/* 507:    */         } else {
/* 508:468 */           j++;
/* 509:    */         }
/* 510:    */       }
/* 511:    */     }
/* 512:474 */     if (paramamj.stackSize > 0)
/* 513:    */     {
/* 514:475 */       if (paramBoolean) {
/* 515:476 */         j = paramInt2 - 1;
/* 516:    */       } else {
/* 517:478 */         j = paramInt1;
/* 518:    */       }
/* 519:480 */       while (((!paramBoolean) && (j < paramInt2)) || ((paramBoolean) && (j >= paramInt1)))
/* 520:    */       {
/* 521:481 */         localajk = (ajk)this.c.get(j);
/* 522:482 */         localamj = localajk.d();
/* 523:484 */         if (localamj == null)
/* 524:    */         {
/* 525:485 */           localajk.d(paramamj.k());
/* 526:486 */           localajk.f();
/* 527:487 */           paramamj.stackSize = 0;
/* 528:488 */           bool = true;
/* 529:489 */           break;
/* 530:    */         }
/* 531:492 */         if (paramBoolean) {
/* 532:493 */           j--;
/* 533:    */         } else {
/* 534:495 */           j++;
/* 535:    */         }
/* 536:    */       }
/* 537:    */     }
/* 538:500 */     return bool;
/* 539:    */   }
/* 540:    */   
/* 541:    */   public static int b(int paramInt)
/* 542:    */   {
/* 543:508 */     return paramInt >> 2 & 0x3;
/* 544:    */   }
/* 545:    */   
/* 546:    */   public static int c(int paramInt)
/* 547:    */   {
/* 548:512 */     return paramInt & 0x3;
/* 549:    */   }
/* 550:    */   
/* 551:    */   public static int d(int paramInt1, int paramInt2)
/* 552:    */   {
/* 553:516 */     return paramInt1 & 0x3 | (paramInt2 & 0x3) << 2;
/* 554:    */   }
/* 555:    */   
/* 556:    */   public static boolean a(int paramInt, EntityPlayer paramahd)
/* 557:    */   {
/* 558:520 */     if (paramInt == 0) {
/* 559:521 */       return true;
/* 560:    */     }
/* 561:523 */     if (paramInt == 1) {
/* 562:524 */       return true;
/* 563:    */     }
/* 564:526 */     if ((paramInt == 2) && (paramahd.by.d)) {
/* 565:527 */       return true;
/* 566:    */     }
/* 567:529 */     return false;
/* 568:    */   }
/* 569:    */   
/* 570:    */   protected void d()
/* 571:    */   {
/* 572:533 */     this.g = 0;
/* 573:534 */     this.h.clear();
/* 574:    */   }
/* 575:    */   
/* 576:    */   public static boolean a(ajk paramajk, ItemStack paramamj, boolean paramBoolean)
/* 577:    */   {
/* 578:538 */     boolean bool = (paramajk == null) || (!paramajk.e());
/* 579:540 */     if ((paramajk != null) && (paramajk.e()) && (paramamj != null) && (paramamj.a(paramajk.d())) && (ItemStack.a(paramajk.d(), paramamj))) {
/* 580:541 */       bool |= paramajk.d().stackSize + (paramBoolean ? 0 : paramamj.stackSize) <= paramamj.getMaxStackSize();
/* 581:    */     }
/* 582:544 */     return bool;
/* 583:    */   }
/* 584:    */   
/* 585:    */   public static void a(Set paramSet, int paramInt1, ItemStack paramamj, int paramInt2)
/* 586:    */   {
/* 587:548 */     switch (paramInt1)
/* 588:    */     {
/* 589:    */     case 0: 
/* 590:550 */       paramamj.stackSize = MathUtils.floor(paramamj.stackSize / paramSet.size());
/* 591:551 */       break;
/* 592:    */     case 1: 
/* 593:553 */       paramamj.stackSize = 1;
/* 594:554 */       break;
/* 595:    */     case 2: 
/* 596:556 */       paramamj.stackSize = paramamj.getItem().getItemStackLimit();
/* 597:    */     }
/* 598:560 */     paramamj.stackSize += paramInt2;
/* 599:    */   }
/* 600:    */   
/* 601:    */   public boolean b(ajk paramajk)
/* 602:    */   {
/* 603:564 */     return true;
/* 604:    */   }
/* 605:    */   
/* 606:    */   public static int a(bcm parambcm)
/* 607:    */   {
/* 608:568 */     if ((parambcm instanceof vq)) {
/* 609:569 */       return b((vq)parambcm);
/* 610:    */     }
/* 611:572 */     return 0;
/* 612:    */   }
/* 613:    */   
/* 614:    */   public static int b(vq paramvq)
/* 615:    */   {
/* 616:576 */     if (paramvq == null) {
/* 617:577 */       return 0;
/* 618:    */     }
/* 619:579 */     int j = 0;
/* 620:580 */     float f1 = 0.0F;
/* 621:582 */     for (int k = 0; k < paramvq.n_(); k++)
/* 622:    */     {
/* 623:583 */       ItemStack localamj = paramvq.a(k);
/* 624:585 */       if (localamj != null)
/* 625:    */       {
/* 626:586 */         f1 += localamj.stackSize / Math.min(paramvq.p_(), localamj.getMaxStackSize());
/* 627:587 */         j++;
/* 628:    */       }
/* 629:    */     }
/* 630:591 */     f1 /= paramvq.n_();
/* 631:592 */     return MathUtils.floor(f1 * 14.0F) + (j > 0 ? 1 : 0);
/* 632:    */   }
/* 633:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aib
 * JD-Core Version:    0.7.0.1
 */
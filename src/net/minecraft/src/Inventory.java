package net.minecraft.src;
/*   1:    */ public class Inventory
/*   2:    */   implements vq
/*   3:    */ {
/*   4: 27 */   public ItemStack[] items = new ItemStack[36];
/*   5: 28 */   public ItemStack[] armors = new ItemStack[4];
/*   6:    */   public int c;
/*   7:    */   public EntityPlayer d;
/*   8:    */   private ItemStack f;
/*   9:    */   public boolean e;
/*  10:    */   
/*  11:    */   public Inventory(EntityPlayer paramahd)
/*  12:    */   {
/*  13: 36 */     this.d = paramahd;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public ItemStack h()
/*  17:    */   {
/*  18: 41 */     if ((this.c < 9) && (this.c >= 0)) {
/*  19: 42 */       return this.items[this.c];
/*  20:    */     }
/*  21: 44 */     return null;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public static int i()
/*  25:    */   {
/*  26: 48 */     return 9;
/*  27:    */   }
/*  28:    */   
/*  29:    */   private int c(Item paramalq)
/*  30:    */   {
/*  31: 52 */     for (int i = 0; i < this.items.length; i++) {
/*  32: 53 */       if ((this.items[i] != null) && (this.items[i].getItem() == paramalq)) {
/*  33: 54 */         return i;
/*  34:    */       }
/*  35:    */     }
/*  36: 57 */     return -1;
/*  37:    */   }
/*  38:    */   
/*  39:    */   private int a(Item paramalq, int paramInt)
/*  40:    */   {
/*  41: 61 */     for (int i = 0; i < this.items.length; i++) {
/*  42: 62 */       if ((this.items[i] != null) && (this.items[i].getItem() == paramalq) && (this.items[i].getDamage2() == paramInt)) {
/*  43: 63 */         return i;
/*  44:    */       }
/*  45:    */     }
/*  46: 66 */     return -1;
/*  47:    */   }
/*  48:    */   
/*  49:    */   private int d(ItemStack paramamj)
/*  50:    */   {
/*  51: 70 */     for (int i = 0; i < this.items.length; i++) {
/*  52: 71 */       if ((this.items[i] != null) && (this.items[i].getItem() == paramamj.getItem()) && (this.items[i].isStackable()) && (this.items[i].stackSize < this.items[i].getMaxStackSize()) && (this.items[i].stackSize < p_()) && ((!this.items[i].f()) || (this.items[i].getDamage2() == paramamj.getDamage2())) && (ItemStack.a(this.items[i], paramamj))) {
/*  53: 72 */         return i;
/*  54:    */       }
/*  55:    */     }
/*  56: 75 */     return -1;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public int j()
/*  60:    */   {
/*  61: 79 */     for (int i = 0; i < this.items.length; i++) {
/*  62: 80 */       if (this.items[i] == null) {
/*  63: 81 */         return i;
/*  64:    */       }
/*  65:    */     }
/*  66: 84 */     return -1;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void a(Item paramalq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
/*  70:    */   {
/*  71: 88 */     ItemStack localamj = h();
/*  72: 89 */     int i = paramBoolean1 ? a(paramalq, paramInt) : c(paramalq);
/*  73: 90 */     if ((i >= 0) && (i < 9))
/*  74:    */     {
/*  75: 91 */       this.c = i;
/*  76: 92 */       return;
/*  77:    */     }
/*  78: 95 */     if ((!paramBoolean2) || (paramalq == null)) {
/*  79: 96 */       return;
/*  80:    */     }
/*  81: 99 */     int j = j();
/*  82:100 */     if ((j >= 0) && (j < 9)) {
/*  83:101 */       this.c = j;
/*  84:    */     }
/*  85:105 */     if ((localamj == null) || (!localamj.v()) || (a(localamj.getItem(), localamj.getDamage()) != this.c))
/*  86:    */     {
/*  87:106 */       int k = a(paramalq, paramInt);
/*  88:    */       int m;
/*  89:108 */       if (k >= 0)
/*  90:    */       {
/*  91:109 */         m = this.items[k].stackSize;
/*  92:110 */         this.items[k] = this.items[this.c];
/*  93:    */       }
/*  94:    */       else
/*  95:    */       {
/*  96:112 */         m = 1;
/*  97:    */       }
/*  98:114 */       this.items[this.c] = new ItemStack(paramalq, m, paramInt);
/*  99:    */     }
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void d(int paramInt)
/* 103:    */   {
/* 104:119 */     if (paramInt > 0) {
/* 105:120 */       paramInt = 1;
/* 106:    */     }
/* 107:122 */     if (paramInt < 0) {
/* 108:123 */       paramInt = -1;
/* 109:    */     }
/* 110:126 */     this.c -= paramInt;
/* 111:128 */     while (this.c < 0) {
/* 112:129 */       this.c += 9;
/* 113:    */     }
/* 114:131 */     while (this.c >= 9) {
/* 115:132 */       this.c -= 9;
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   public int a(Item paramalq, int paramInt1, int paramInt2, NBTTagCompound paramfn)
/* 120:    */   {
/* 121:137 */     int i = 0;
/* 122:    */     ItemStack localamj;
/* 123:    */     int k;
/* 124:138 */     for (int j = 0; j < this.items.length; j++)
/* 125:    */     {
/* 126:139 */       localamj = this.items[j];
/* 127:140 */       if (localamj != null) {
/* 128:143 */         if ((paramalq == null) || (localamj.getItem() == paramalq)) {
/* 129:146 */           if ((paramInt1 <= -1) || (localamj.getDamage2() == paramInt1)) {
/* 130:149 */             if ((paramfn == null) || (cy.a(paramfn, localamj.getTagCompound(), true)))
/* 131:    */             {
/* 132:153 */               k = paramInt2 <= 0 ? localamj.stackSize : Math.min(paramInt2 - i, localamj.stackSize);
/* 133:154 */               i += k;
/* 134:155 */               if (paramInt2 != 0)
/* 135:    */               {
/* 136:156 */                 this.items[j].stackSize -= k;
/* 137:157 */                 if (this.items[j].stackSize == 0) {
/* 138:158 */                   this.items[j] = null;
/* 139:    */                 }
/* 140:160 */                 if ((paramInt2 > 0) && (i >= paramInt2)) {
/* 141:161 */                   return i;
/* 142:    */                 }
/* 143:    */               }
/* 144:    */             }
/* 145:    */           }
/* 146:    */         }
/* 147:    */       }
/* 148:    */     }
/* 149:165 */     for (int j = 0; j < this.armors.length; j++)
/* 150:    */     {
/* 151:166 */       localamj = this.armors[j];
/* 152:167 */       if (localamj != null) {
/* 153:170 */         if ((paramalq == null) || (localamj.getItem() == paramalq)) {
/* 154:173 */           if ((paramInt1 <= -1) || (localamj.getDamage2() == paramInt1)) {
/* 155:176 */             if ((paramfn == null) || (cy.a(paramfn, localamj.getTagCompound(), false)))
/* 156:    */             {
/* 157:180 */               k = paramInt2 <= 0 ? localamj.stackSize : Math.min(paramInt2 - i, localamj.stackSize);
/* 158:181 */               i += k;
/* 159:182 */               if (paramInt2 != 0)
/* 160:    */               {
/* 161:183 */                 this.armors[j].stackSize -= k;
/* 162:184 */                 if (this.armors[j].stackSize == 0) {
/* 163:185 */                   this.armors[j] = null;
/* 164:    */                 }
/* 165:187 */                 if ((paramInt2 > 0) && (i >= paramInt2)) {
/* 166:188 */                   return i;
/* 167:    */                 }
/* 168:    */               }
/* 169:    */             }
/* 170:    */           }
/* 171:    */         }
/* 172:    */       }
/* 173:    */     }
/* 174:193 */     if (this.f != null)
/* 175:    */     {
/* 176:194 */       if ((paramalq != null) && (this.f.getItem() != paramalq)) {
/* 177:195 */         return i;
/* 178:    */       }
/* 179:197 */       if ((paramInt1 > -1) && (this.f.getDamage2() != paramInt1)) {
/* 180:198 */         return i;
/* 181:    */       }
/* 182:200 */       if ((paramfn != null) && (!cy.a(paramfn, this.f.getTagCompound(), false))) {
/* 183:201 */         return i;
/* 184:    */       }
/* 185:204 */       int j = paramInt2 <= 0 ? this.f.stackSize : Math.min(paramInt2 - i, this.f.stackSize);
/* 186:205 */       i += j;
/* 187:206 */       if (paramInt2 != 0)
/* 188:    */       {
/* 189:207 */         this.f.stackSize -= j;
/* 190:208 */         if (this.f.stackSize == 0) {
/* 191:209 */           this.f = null;
/* 192:    */         }
/* 193:211 */         if ((paramInt2 > 0) && (i >= paramInt2)) {
/* 194:212 */           return i;
/* 195:    */         }
/* 196:    */       }
/* 197:    */     }
/* 198:217 */     return i;
/* 199:    */   }
/* 200:    */   
/* 201:    */   private int e(ItemStack paramamj)
/* 202:    */   {
/* 203:221 */     Item localalq = paramamj.getItem();
/* 204:222 */     int i = paramamj.stackSize;
/* 205:    */     
/* 206:224 */     int j = d(paramamj);
/* 207:225 */     if (j < 0) {
/* 208:226 */       j = j();
/* 209:    */     }
/* 210:228 */     if (j < 0) {
/* 211:229 */       return i;
/* 212:    */     }
/* 213:231 */     if (this.items[j] == null)
/* 214:    */     {
/* 215:232 */       this.items[j] = new ItemStack(localalq, 0, paramamj.getDamage2());
/* 216:233 */       if (paramamj.hasTagCompound()) {
/* 217:234 */         this.items[j].setTagCompound((NBTTagCompound)paramamj.getTagCompound().b());
/* 218:    */       }
/* 219:    */     }
/* 220:238 */     int k = i;
/* 221:239 */     if (k > this.items[j].getMaxStackSize() - this.items[j].stackSize) {
/* 222:240 */       k = this.items[j].getMaxStackSize() - this.items[j].stackSize;
/* 223:    */     }
/* 224:242 */     if (k > p_() - this.items[j].stackSize) {
/* 225:243 */       k = p_() - this.items[j].stackSize;
/* 226:    */     }
/* 227:246 */     if (k == 0) {
/* 228:247 */       return i;
/* 229:    */     }
/* 230:250 */     i -= k;
/* 231:251 */     this.items[j].stackSize += k;
/* 232:252 */     this.items[j].c = 5;
/* 233:    */     
/* 234:254 */     return i;
/* 235:    */   }
/* 236:    */   
/* 237:    */   public void k()
/* 238:    */   {
/* 239:258 */     for (int i = 0; i < this.items.length; i++) {
/* 240:259 */       if (this.items[i] != null) {
/* 241:260 */         this.items[i].a(this.d.world, this.d, i, this.c == i);
/* 242:    */       }
/* 243:    */     }
/* 244:    */   }
/* 245:    */   
/* 246:    */   public boolean a(Item paramalq)
/* 247:    */   {
/* 248:266 */     int i = c(paramalq);
/* 249:267 */     if (i < 0) {
/* 250:268 */       return false;
/* 251:    */     }
/* 252:270 */     if (--this.items[i].stackSize <= 0) {
/* 253:271 */       this.items[i] = null;
/* 254:    */     }
/* 255:274 */     return true;
/* 256:    */   }
/* 257:    */   
/* 258:    */   public boolean b(Item paramalq)
/* 259:    */   {
/* 260:278 */     int i = c(paramalq);
/* 261:279 */     if (i < 0) {
/* 262:280 */       return false;
/* 263:    */     }
/* 264:283 */     return true;
/* 265:    */   }
/* 266:    */   
/* 267:    */   public boolean a(ItemStack paramamj)
/* 268:    */   {
/* 269:293 */     if ((paramamj == null) || (paramamj.stackSize == 0) || (paramamj.getItem() == null)) {
/* 270:294 */       return false;
/* 271:    */     }
/* 272:    */     try
/* 273:    */     {
					int i;
/* 274:298 */       if (!paramamj.g())
/* 275:    */       {
/* 276:    */         do
/* 277:    */         {
/* 278:301 */           i = paramamj.stackSize;
/* 279:302 */           paramamj.stackSize = e(paramamj);
/* 280:303 */         } while ((paramamj.stackSize > 0) && (paramamj.stackSize < i));
/* 281:304 */         if ((paramamj.stackSize == i) && (this.d.abilities.instabuild))
/* 282:    */         {
/* 283:306 */           paramamj.stackSize = 0;
/* 284:307 */           return true;
/* 285:    */         }
/* 286:309 */         return paramamj.stackSize < i;
/* 287:    */       }
/* 288:312 */       i = j();
/* 289:313 */       if (i >= 0)
/* 290:    */       {
/* 291:314 */         this.items[i] = ItemStack.b(paramamj);
/* 292:315 */         this.items[i].c = 5;
/* 293:316 */         paramamj.stackSize = 0;
/* 294:317 */         return true;
/* 295:    */       }
/* 296:318 */       if (this.d.abilities.instabuild)
/* 297:    */       {
/* 298:320 */         paramamj.stackSize = 0;
/* 299:321 */         return true;
/* 300:    */       }
/* 301:323 */       return false;
/* 302:    */     }
/* 303:    */     catch (Throwable localThrowable)
/* 304:    */     {
/* 305:325 */       b localb = net.minecraft.src.b.a(localThrowable, "Adding item to inventory");
/* 306:326 */       j localj = localb.a("Item being added");
/* 307:    */       
/* 308:328 */       localj.a("Item ID", Integer.valueOf(Item.b(paramamj.getItem())));
/* 309:329 */       localj.a("Item data", Integer.valueOf(paramamj.getDamage2()));
/* 310:330 */       localj.a("Item name", new ahc(this, paramamj));
/* 311:    */       
/* 312:    */ 
/* 313:    */ 
/* 314:    */ 
/* 315:    */ 
/* 316:    */ 
/* 317:337 */       throw new u(localb);
/* 318:    */     }
/* 319:    */   }
/* 320:    */   
/* 321:    */   public ItemStack removeItems(int paramInt1, int paramInt2)
/* 322:    */   {
/* 323:344 */     ItemStack[] arrayOfamj = this.items;
/* 324:345 */     if (paramInt1 >= this.items.length)
/* 325:    */     {
/* 326:346 */       arrayOfamj = this.armors;
/* 327:347 */       paramInt1 -= this.items.length;
/* 328:    */     }
/* 329:350 */     if (arrayOfamj[paramInt1] != null)
/* 330:    */     {
/* 331:351 */       if (arrayOfamj[paramInt1].stackSize <= paramInt2)
/* 332:    */       {
/* 333:352 */         ItemStack localamj = arrayOfamj[paramInt1];
/* 334:353 */         arrayOfamj[paramInt1] = null;
/* 335:354 */         return localamj;
/* 336:    */       }
/* 337:356 */       ItemStack localamj = arrayOfamj[paramInt1].split(paramInt2);
/* 338:357 */       if (arrayOfamj[paramInt1].stackSize == 0) {
/* 339:358 */         arrayOfamj[paramInt1] = null;
/* 340:    */       }
/* 341:360 */       return localamj;
/* 342:    */     }
/* 343:363 */     return null;
/* 344:    */   }
/* 345:    */   
/* 346:    */   public ItemStack b(int paramInt)
/* 347:    */   {
/* 348:369 */     ItemStack[] arrayOfamj = this.items;
/* 349:370 */     if (paramInt >= this.items.length)
/* 350:    */     {
/* 351:371 */       arrayOfamj = this.armors;
/* 352:372 */       paramInt -= this.items.length;
/* 353:    */     }
/* 354:375 */     if (arrayOfamj[paramInt] != null)
/* 355:    */     {
/* 356:376 */       ItemStack localamj = arrayOfamj[paramInt];
/* 357:377 */       arrayOfamj[paramInt] = null;
/* 358:378 */       return localamj;
/* 359:    */     }
/* 360:380 */     return null;
/* 361:    */   }
/* 362:    */   
/* 363:    */   public void a(int paramInt, ItemStack paramamj)
/* 364:    */   {
/* 365:385 */     ItemStack[] arrayOfamj = this.items;
/* 366:386 */     if (paramInt >= arrayOfamj.length)
/* 367:    */     {
/* 368:387 */       paramInt -= arrayOfamj.length;
/* 369:388 */       arrayOfamj = this.armors;
/* 370:    */     }
/* 371:391 */     arrayOfamj[paramInt] = paramamj;
/* 372:    */   }
/* 373:    */   
/* 374:    */   public float a(ProtoBlock paramatr)
/* 375:    */   {
/* 376:395 */     float f1 = 1.0F;
/* 377:396 */     if (this.items[this.c] != null) {
/* 378:397 */       f1 *= this.items[this.c].a(paramatr);
/* 379:    */     }
/* 380:399 */     return f1;
/* 381:    */   }
/* 382:    */   
/* 383:    */   public fv a(fv paramfv)
/* 384:    */   {
/* 385:    */     NBTTagCompound localfn;
/* 386:403 */     for (int i = 0; i < this.items.length; i++) {
/* 387:404 */       if (this.items[i] != null)
/* 388:    */       {
/* 389:405 */         localfn = new NBTTagCompound();
/* 390:406 */         localfn.setByte("Slot", (byte)i);
/* 391:407 */         this.items[i].writeToNBT(localfn);
/* 392:408 */         paramfv.a(localfn);
/* 393:    */       }
/* 394:    */     }
/* 395:411 */     for (int i = 0; i < this.armors.length; i++) {
/* 396:412 */       if (this.armors[i] != null)
/* 397:    */       {
/* 398:413 */         localfn = new NBTTagCompound();
/* 399:414 */         localfn.setByte("Slot", (byte)(i + 100));
/* 400:415 */         this.armors[i].writeToNBT(localfn);
/* 401:416 */         paramfv.a(localfn);
/* 402:    */       }
/* 403:    */     }
/* 404:419 */     return paramfv;
/* 405:    */   }
/* 406:    */   
/* 407:    */   public void b(fv paramfv)
/* 408:    */   {
/* 409:423 */     this.items = new ItemStack[36];
/* 410:424 */     this.armors = new ItemStack[4];
/* 411:425 */     for (int i = 0; i < paramfv.c(); i++)
/* 412:    */     {
/* 413:426 */       NBTTagCompound localfn = paramfv.b(i);
/* 414:427 */       int j = localfn.d("Slot") & 0xFF;
/* 415:428 */       ItemStack localamj = ItemStack.loadItemStackFromNBT(localfn);
/* 416:429 */       if (localamj != null)
/* 417:    */       {
/* 418:430 */         if ((j >= 0) && (j < this.items.length)) {
/* 419:431 */           this.items[j] = localamj;
/* 420:    */         }
/* 421:433 */         if ((j >= 100) && (j < this.armors.length + 100)) {
/* 422:434 */           this.armors[(j - 100)] = localamj;
/* 423:    */         }
/* 424:    */       }
/* 425:    */     }
/* 426:    */   }
/* 427:    */   
/* 428:    */   public int getSize()
/* 429:    */   {
/* 430:442 */     return this.items.length + 4;
/* 431:    */   }
/* 432:    */   
/* 433:    */   public ItemStack get(int paramInt)
/* 434:    */   {
/* 435:448 */     ItemStack[] arrayOfamj = this.items;
/* 436:449 */     if (paramInt >= arrayOfamj.length)
/* 437:    */     {
/* 438:450 */       paramInt -= arrayOfamj.length;
/* 439:451 */       arrayOfamj = this.armors;
/* 440:    */     }
/* 441:454 */     return arrayOfamj[paramInt];
/* 442:    */   }
/* 443:    */   
/* 444:    */   public String getName()
/* 445:    */   {
/* 446:459 */     return "container.inventory";
/* 447:    */   }
/* 448:    */   
/* 449:    */   public boolean k_()
/* 450:    */   {
/* 451:464 */     return false;
/* 452:    */   }
/* 453:    */   
/* 454:    */   public ho e_()
/* 455:    */   {
/* 456:469 */     if (k_()) {
/* 457:470 */       return new hy(getName());
/* 458:    */     }
/* 459:472 */     return new hz(getName(), new Object[0]);
/* 460:    */   }
/* 461:    */   
/* 462:    */   public int p_()
/* 463:    */   {
/* 464:477 */     return 64;
/* 465:    */   }
/* 466:    */   
/* 467:    */   public boolean canHarvestBlock(ProtoBlock paramatr)
/* 468:    */   {
/* 469:481 */     if (paramatr.getMaterial().l()) {
/* 470:482 */       return true;
/* 471:    */     }
/* 472:485 */     ItemStack tool = get(this.c);
/* 473:486 */     if (tool != null) {
/* 474:487 */       return tool.canHarvestBlock(paramatr);
/* 475:    */     }
/* 476:489 */     return false;
/* 477:    */   }
/* 478:    */   
/* 479:    */   public ItemStack e(int paramInt)
/* 480:    */   {
/* 481:493 */     return this.armors[paramInt];
/* 482:    */   }
/* 483:    */   
/* 484:    */   public int m()
/* 485:    */   {
/* 486:497 */     int i = 0;
/* 487:498 */     for (int j = 0; j < this.armors.length; j++) {
/* 488:499 */       if ((this.armors[j] != null) && ((this.armors[j].getItem() instanceof ItemArmor)))
/* 489:    */       {
/* 490:500 */         int k = ((ItemArmor)this.armors[j].getItem()).c;
/* 491:501 */         i += k;
/* 492:    */       }
/* 493:    */     }
/* 494:504 */     return i;
/* 495:    */   }
/* 496:    */   
/* 497:    */   public void a(float paramFloat)
/* 498:    */   {
/* 499:508 */     paramFloat /= 4.0F;
/* 500:509 */     if (paramFloat < 1.0F) {
/* 501:510 */       paramFloat = 1.0F;
/* 502:    */     }
/* 503:512 */     for (int i = 0; i < this.armors.length; i++) {
/* 504:513 */       if ((this.armors[i] != null) && ((this.armors[i].getItem() instanceof ItemArmor)))
/* 505:    */       {
/* 506:514 */         this.armors[i].a((int)paramFloat, this.d);
/* 507:515 */         if (this.armors[i].stackSize == 0) {
/* 508:516 */           this.armors[i] = null;
/* 509:    */         }
/* 510:    */       }
/* 511:    */     }
/* 512:    */   }
/* 513:    */   
/* 514:    */   public void n()
/* 515:    */   {
/* 516:523 */     for (int i = 0; i < this.items.length; i++) {
/* 517:524 */       if (this.items[i] != null)
/* 518:    */       {
/* 519:525 */         this.d.a(this.items[i], true, false);
/* 520:526 */         this.items[i] = null;
/* 521:    */       }
/* 522:    */     }
/* 523:529 */     for (int i = 0; i < this.armors.length; i++) {
/* 524:530 */       if (this.armors[i] != null)
/* 525:    */       {
/* 526:531 */         this.d.a(this.armors[i], true, false);
/* 527:532 */         this.armors[i] = null;
/* 528:    */       }
/* 529:    */     }
/* 530:    */   }
/* 531:    */   
/* 532:    */   public void o_()
/* 533:    */   {
/* 534:539 */     this.e = true;
/* 535:    */   }
/* 536:    */   
/* 537:    */   public void b(ItemStack paramamj)
/* 538:    */   {
/* 539:579 */     this.f = paramamj;
/* 540:    */   }
/* 541:    */   
/* 542:    */   public ItemStack p()
/* 543:    */   {
/* 544:583 */     return this.f;
/* 545:    */   }
/* 546:    */   
/* 547:    */   public boolean a(EntityPlayer paramahd)
/* 548:    */   {
/* 549:588 */     if (this.d.isDead) {
/* 550:589 */       return false;
/* 551:    */     }
/* 552:591 */     if (paramahd.h(this.d) > 64.0D) {
/* 553:592 */       return false;
/* 554:    */     }
/* 555:594 */     return true;
/* 556:    */   }
/* 557:    */   
/* 558:    */   public boolean c(ItemStack paramamj)
/* 559:    */   {
/* 560:598 */     for (int i = 0; i < this.armors.length; i++) {
/* 561:599 */       if ((this.armors[i] != null) && (this.armors[i].a(paramamj))) {
/* 562:600 */         return true;
/* 563:    */       }
/* 564:    */     }
/* 565:603 */     for (int i = 0; i < this.items.length; i++) {
/* 566:604 */       if ((this.items[i] != null) && (this.items[i].a(paramamj))) {
/* 567:605 */         return true;
/* 568:    */       }
/* 569:    */     }
/* 570:608 */     return false;
/* 571:    */   }
/* 572:    */   
/* 573:    */   public void b(EntityPlayer paramahd) {}
/* 574:    */   
/* 575:    */   public void c(EntityPlayer paramahd) {}
/* 576:    */   
/* 577:    */   public boolean b(int paramInt, ItemStack paramamj)
/* 578:    */   {
/* 579:621 */     return true;
/* 580:    */   }
/* 581:    */   
/* 582:    */   public void b(Inventory paramahb)
/* 583:    */   {
/* 584:625 */     for (int i = 0; i < this.items.length; i++) {
/* 585:626 */       this.items[i] = ItemStack.b(paramahb.items[i]);
/* 586:    */     }
/* 587:628 */     for (int i = 0; i < this.armors.length; i++) {
/* 588:629 */       this.armors[i] = ItemStack.b(paramahb.armors[i]);
/* 589:    */     }
/* 590:631 */     this.c = paramahb.c;
/* 591:    */   }
/* 592:    */   
/* 593:    */   public int a_(int paramInt)
/* 594:    */   {
/* 595:636 */     return 0;
/* 596:    */   }
/* 597:    */   
/* 598:    */   public void b(int paramInt1, int paramInt2) {}
/* 599:    */   
/* 600:    */   public int g()
/* 601:    */   {
/* 602:645 */     return 0;
/* 603:    */   }
/* 604:    */   
/* 605:    */   public void l()
/* 606:    */   {
/* 607:650 */     for (int i = 0; i < this.items.length; i++) {
/* 608:651 */       this.items[i] = null;
/* 609:    */     }
/* 610:653 */     for (int i = 0; i < this.armors.length; i++) {
/* 611:654 */       this.armors[i] = null;
/* 612:    */     }
/* 613:    */   }
/* 614:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahb
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class bde
/*   5:    */   extends bdf
/*   6:    */   implements bdd, pm
/*   7:    */ {
/*   8: 34 */   private ItemStack[] a = new ItemStack[5];
/*   9:    */   private String f;
/*  10: 36 */   private int g = -1;
/*  11:    */   
/*  12:    */   public void readFromNBT(NBTTagCompound paramfn)
/*  13:    */   {
/*  14: 40 */     super.readFromNBT(paramfn);
/*  15:    */     
/*  16:    */ 
/*  17: 43 */     fv localfv = paramfn.c("Items", 10);
/*  18: 44 */     this.a = new ItemStack[getSize()];
/*  19: 45 */     if (paramfn.hasKey("CustomName", 8)) {
/*  20: 46 */       this.f = paramfn.getString("CustomName");
/*  21:    */     }
/*  22: 48 */     this.g = paramfn.getInteger("TransferCooldown");
/*  23: 49 */     for (int i = 0; i < localfv.c(); i++)
/*  24:    */     {
/*  25: 50 */       NBTTagCompound localfn = localfv.b(i);
/*  26: 51 */       int j = localfn.d("Slot");
/*  27: 52 */       if ((j >= 0) && (j < this.a.length)) {
/*  28: 53 */         this.a[j] = ItemStack.loadItemStackFromNBT(localfn);
/*  29:    */       }
/*  30:    */     }
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void writeToNBT(NBTTagCompound paramfn)
/*  34:    */   {
/*  35: 60 */     super.writeToNBT(paramfn);
/*  36: 61 */     fv localfv = new fv();
/*  37: 63 */     for (int i = 0; i < this.a.length; i++) {
/*  38: 64 */       if (this.a[i] != null)
/*  39:    */       {
/*  40: 65 */         NBTTagCompound localfn = new NBTTagCompound();
/*  41: 66 */         localfn.setByte("Slot", (byte)i);
/*  42: 67 */         this.a[i].writeToNBT(localfn);
/*  43: 68 */         localfv.a(localfn);
/*  44:    */       }
/*  45:    */     }
/*  46: 71 */     paramfn.setNBT("Items", localfv);
/*  47: 72 */     paramfn.setInt("TransferCooldown", this.g);
/*  48: 73 */     if (k_()) {
/*  49: 74 */       paramfn.setString("CustomName", this.f);
/*  50:    */     }
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void o_()
/*  54:    */   {
/*  55: 80 */     super.o_();
/*  56:    */   }
/*  57:    */   
/*  58:    */   public int getSize()
/*  59:    */   {
/*  60: 85 */     return this.a.length;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public ItemStack get(int paramInt)
/*  64:    */   {
/*  65: 91 */     return this.a[paramInt];
/*  66:    */   }
/*  67:    */   
/*  68:    */   public ItemStack removeItems(int paramInt1, int paramInt2)
/*  69:    */   {
/*  70: 97 */     if (this.a[paramInt1] != null)
/*  71:    */     {
/*  72: 98 */       if (this.a[paramInt1].stackSize <= paramInt2)
/*  73:    */       {
/*  74: 99 */         ItemStack localamj = this.a[paramInt1];
/*  75:100 */         this.a[paramInt1] = null;
/*  76:101 */         return localamj;
/*  77:    */       }
/*  78:103 */       ItemStack localamj = this.a[paramInt1].split(paramInt2);
/*  79:104 */       if (this.a[paramInt1].stackSize == 0) {
/*  80:105 */         this.a[paramInt1] = null;
/*  81:    */       }
/*  82:107 */       return localamj;
/*  83:    */     }
/*  84:110 */     return null;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public ItemStack b(int paramInt)
/*  88:    */   {
/*  89:116 */     if (this.a[paramInt] != null)
/*  90:    */     {
/*  91:117 */       ItemStack localamj = this.a[paramInt];
/*  92:118 */       this.a[paramInt] = null;
/*  93:119 */       return localamj;
/*  94:    */     }
/*  95:121 */     return null;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void a(int paramInt, ItemStack paramamj)
/*  99:    */   {
/* 100:126 */     this.a[paramInt] = paramamj;
/* 101:127 */     if ((paramamj != null) && (paramamj.stackSize > p_())) {
/* 102:128 */       paramamj.stackSize = p_();
/* 103:    */     }
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getName()
/* 107:    */   {
/* 108:134 */     return k_() ? this.f : "container.hopper";
/* 109:    */   }
/* 110:    */   
/* 111:    */   public boolean k_()
/* 112:    */   {
/* 113:139 */     return (this.f != null) && (this.f.length() > 0);
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void a(String paramString)
/* 117:    */   {
/* 118:143 */     this.f = paramString;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public int p_()
/* 122:    */   {
/* 123:148 */     return 64;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public boolean a(EntityPlayer paramahd)
/* 127:    */   {
/* 128:153 */     if (this.world.s(this.pos) != this) {
/* 129:154 */       return false;
/* 130:    */     }
/* 131:156 */     if (paramahd.dist2(this.pos.getX() + 0.5D, this.pos.getY() + 0.5D, this.pos.getZ() + 0.5D) > 64.0D) {
/* 132:157 */       return false;
/* 133:    */     }
/* 134:159 */     return true;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void b(EntityPlayer paramahd) {}
/* 138:    */   
/* 139:    */   public void c(EntityPlayer paramahd) {}
/* 140:    */   
/* 141:    */   public boolean b(int paramInt, ItemStack paramamj)
/* 142:    */   {
/* 143:172 */     return true;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void c()
/* 147:    */   {
/* 148:177 */     if ((this.world == null) || (this.world.isClient)) {
/* 149:178 */       return;
/* 150:    */     }
/* 151:181 */     this.g -= 1;
/* 152:183 */     if (!n())
/* 153:    */     {
/* 154:184 */       d(0);
/* 155:185 */       m();
/* 156:    */     }
/* 157:    */   }
/* 158:    */   
/* 159:    */   public boolean m()
/* 160:    */   {
/* 161:190 */     if ((this.world == null) || (this.world.isClient)) {
/* 162:191 */       return false;
/* 163:    */     }
/* 164:194 */     if ((!n()) && (BlockHopper.f(getData())))
/* 165:    */     {
/* 166:195 */       boolean bool = false;
/* 167:197 */       if (!p()) {
/* 168:198 */         bool = r();
/* 169:    */       }
/* 170:200 */       if (!q()) {
/* 171:201 */         bool = (a(this)) || (bool);
/* 172:    */       }
/* 173:204 */       if (bool)
/* 174:    */       {
/* 175:205 */         d(8);
/* 176:206 */         o_();
/* 177:207 */         return true;
/* 178:    */       }
/* 179:    */     }
/* 180:211 */     return false;
/* 181:    */   }
/* 182:    */   
/* 183:    */   private boolean p()
/* 184:    */   {
/* 185:215 */     for (ItemStack localamj : this.a) {
/* 186:216 */       if (localamj != null) {
/* 187:217 */         return false;
/* 188:    */       }
/* 189:    */     }
/* 190:221 */     return true;
/* 191:    */   }
/* 192:    */   
/* 193:    */   private boolean q()
/* 194:    */   {
/* 195:225 */     for (ItemStack localamj : this.a) {
/* 196:226 */       if ((localamj == null) || (localamj.stackSize != localamj.getMaxStackSize())) {
/* 197:227 */         return false;
/* 198:    */       }
/* 199:    */     }
/* 200:231 */     return true;
/* 201:    */   }
/* 202:    */   
/* 203:    */   private boolean r()
/* 204:    */   {
/* 205:235 */     vq localvq = G();
/* 206:236 */     if (localvq == null) {
/* 207:237 */       return false;
/* 208:    */     }
/* 209:240 */     EnumDirection localej = BlockHopper.b(getData()).d();
/* 210:241 */     if (a(localvq, localej)) {
/* 211:242 */       return false;
/* 212:    */     }
/* 213:245 */     for (int i = 0; i < getSize(); i++) {
/* 214:246 */       if (get(i) != null)
/* 215:    */       {
/* 216:250 */         ItemStack localamj1 = get(i).k();
/* 217:251 */         ItemStack localamj2 = a(localvq, removeItems(i, 1), localej);
/* 218:253 */         if ((localamj2 == null) || (localamj2.stackSize == 0))
/* 219:    */         {
/* 220:254 */           localvq.o_();
/* 221:255 */           return true;
/* 222:    */         }
/* 223:257 */         a(i, localamj1);
/* 224:    */       }
/* 225:    */     }
/* 226:261 */     return false;
/* 227:    */   }
/* 228:    */   
/* 229:    */   private boolean a(vq paramvq, EnumDirection paramej)
/* 230:    */   {
/* 231:265 */     if ((paramvq instanceof we))
/* 232:    */     {
/* 233:266 */       we localwe = (we)paramvq;
/* 234:267 */       int[] arrayOfInt = localwe.a(paramej);
/* 235:269 */       for (int k = 0; k < arrayOfInt.length; k++)
/* 236:    */       {
/* 237:270 */         ItemStack localamj2 = localwe.get(arrayOfInt[k]);
/* 238:271 */         if ((localamj2 == null) || (localamj2.stackSize != localamj2.getMaxStackSize())) {
/* 239:272 */           return false;
/* 240:    */         }
/* 241:    */       }
/* 242:    */     }
/* 243:    */     else
/* 244:    */     {
/* 245:276 */       int i = paramvq.getSize();
/* 246:277 */       for (int j = 0; j < i; j++)
/* 247:    */       {
/* 248:278 */         ItemStack localamj1 = paramvq.get(j);
/* 249:279 */         if ((localamj1 == null) || (localamj1.stackSize != localamj1.getMaxStackSize())) {
/* 250:280 */           return false;
/* 251:    */         }
/* 252:    */       }
/* 253:    */     }
/* 254:285 */     return true;
/* 255:    */   }
/* 256:    */   
/* 257:    */   private static boolean b(vq paramvq, EnumDirection paramej)
/* 258:    */   {
/* 259:289 */     if ((paramvq instanceof we))
/* 260:    */     {
/* 261:290 */       we localwe = (we)paramvq;
/* 262:291 */       int[] arrayOfInt = localwe.a(paramej);
/* 263:293 */       for (int k = 0; k < arrayOfInt.length; k++) {
/* 264:294 */         if (localwe.get(arrayOfInt[k]) != null) {
/* 265:295 */           return false;
/* 266:    */         }
/* 267:    */       }
/* 268:    */     }
/* 269:    */     else
/* 270:    */     {
/* 271:299 */       int i = paramvq.getSize();
/* 272:300 */       for (int j = 0; j < i; j++) {
/* 273:301 */         if (paramvq.get(j) != null) {
/* 274:302 */           return false;
/* 275:    */         }
/* 276:    */       }
/* 277:    */     }
/* 278:306 */     return true;
/* 279:    */   }
/* 280:    */   
/* 281:    */   public static boolean a(bdd parambdd)
/* 282:    */   {
/* 283:310 */     vq localvq = b(parambdd);
/* 284:    */     Object localObject;
/* 285:312 */     if (localvq != null)
/* 286:    */     {
/* 287:313 */       localObject = EnumDirection.DOWN;
/* 288:314 */       if (b(localvq, (EnumDirection)localObject)) {
/* 289:315 */         return false;
/* 290:    */       }
/* 291:318 */       if ((localvq instanceof we))
/* 292:    */       {
/* 293:319 */         we localwe = (we)localvq;
/* 294:320 */         int[] arrayOfInt = localwe.a((EnumDirection)localObject);
/* 295:322 */         for (int k = 0; k < arrayOfInt.length; k++) {
/* 296:323 */           if (a(parambdd, localvq, arrayOfInt[k], (EnumDirection)localObject)) {
/* 297:324 */             return true;
/* 298:    */           }
/* 299:    */         }
/* 300:    */       }
/* 301:    */       else
/* 302:    */       {
/* 303:328 */         int i = localvq.getSize();
/* 304:329 */         for (int j = 0; j < i; j++) {
/* 305:330 */           if (a(parambdd, localvq, j, (EnumDirection)localObject)) {
/* 306:331 */             return true;
/* 307:    */           }
/* 308:    */         }
/* 309:    */       }
/* 310:    */     }
/* 311:    */     else
/* 312:    */     {
/* 313:336 */       localObject = a(parambdd.getWorld(), parambdd.getX(), parambdd.getY() + 1.0D, parambdd.getZ());
/* 314:338 */       if (localObject != null) {
/* 315:339 */         return a(parambdd, (EntityItem)localObject);
/* 316:    */       }
/* 317:    */     }
/* 318:343 */     return false;
/* 319:    */   }
/* 320:    */   
/* 321:    */   private static boolean a(bdd parambdd, vq paramvq, int paramInt, EnumDirection paramej)
/* 322:    */   {
/* 323:347 */     ItemStack localamj1 = paramvq.get(paramInt);
/* 324:349 */     if ((localamj1 != null) && (b(paramvq, localamj1, paramInt, paramej)))
/* 325:    */     {
/* 326:350 */       ItemStack localamj2 = localamj1.k();
/* 327:351 */       ItemStack localamj3 = a(parambdd, paramvq.removeItems(paramInt, 1), null);
/* 328:353 */       if ((localamj3 == null) || (localamj3.stackSize == 0))
/* 329:    */       {
/* 330:354 */         paramvq.o_();
/* 331:355 */         return true;
/* 332:    */       }
/* 333:357 */       paramvq.a(paramInt, localamj2);
/* 334:    */     }
/* 335:361 */     return false;
/* 336:    */   }
/* 337:    */   
/* 338:    */   public static boolean a(vq paramvq, EntityItem paramadw)
/* 339:    */   {
/* 340:365 */     boolean bool = false;
/* 341:366 */     if (paramadw == null) {
/* 342:367 */       return false;
/* 343:    */     }
/* 344:370 */     ItemStack localamj1 = paramadw.getItemStack().k();
/* 345:371 */     ItemStack localamj2 = a(paramvq, localamj1, null);
/* 346:373 */     if ((localamj2 == null) || (localamj2.stackSize == 0))
/* 347:    */     {
/* 348:374 */       bool = true;
/* 349:    */       
/* 350:376 */       paramadw.setDead();
/* 351:    */     }
/* 352:    */     else
/* 353:    */     {
/* 354:378 */       paramadw.a(localamj2);
/* 355:    */     }
/* 356:381 */     return bool;
/* 357:    */   }
/* 358:    */   
/* 359:    */   public static ItemStack a(vq paramvq, ItemStack paramamj, EnumDirection paramej)
/* 360:    */   {
/* 361:385 */     if (((paramvq instanceof we)) && (paramej != null))
/* 362:    */     {
/* 363:386 */       we localwe = (we)paramvq;
/* 364:387 */       int[] arrayOfInt = localwe.a(paramej);
/* 365:389 */       for (int k = 0; (k < arrayOfInt.length) && (paramamj != null) && (paramamj.stackSize > 0); k++) {
/* 366:390 */         paramamj = c(paramvq, paramamj, arrayOfInt[k], paramej);
/* 367:    */       }
/* 368:    */     }
/* 369:    */     else
/* 370:    */     {
/* 371:393 */       int i = paramvq.getSize();
/* 372:394 */       for (int j = 0; (j < i) && (paramamj != null) && (paramamj.stackSize > 0); j++) {
/* 373:395 */         paramamj = c(paramvq, paramamj, j, paramej);
/* 374:    */       }
/* 375:    */     }
/* 376:399 */     if ((paramamj != null) && (paramamj.stackSize == 0)) {
/* 377:400 */       paramamj = null;
/* 378:    */     }
/* 379:403 */     return paramamj;
/* 380:    */   }
/* 381:    */   
/* 382:    */   private static boolean a(vq paramvq, ItemStack paramamj, int paramInt, EnumDirection paramej)
/* 383:    */   {
/* 384:407 */     if (!paramvq.b(paramInt, paramamj)) {
/* 385:408 */       return false;
/* 386:    */     }
/* 387:410 */     if (((paramvq instanceof we)) && (!((we)paramvq).a(paramInt, paramamj, paramej))) {
/* 388:411 */       return false;
/* 389:    */     }
/* 390:413 */     return true;
/* 391:    */   }
/* 392:    */   
/* 393:    */   private static boolean b(vq paramvq, ItemStack paramamj, int paramInt, EnumDirection paramej)
/* 394:    */   {
/* 395:417 */     if (((paramvq instanceof we)) && (!((we)paramvq).b(paramInt, paramamj, paramej))) {
/* 396:418 */       return false;
/* 397:    */     }
/* 398:420 */     return true;
/* 399:    */   }
/* 400:    */   
/* 401:    */   private static ItemStack c(vq paramvq, ItemStack paramamj, int paramInt, EnumDirection paramej)
/* 402:    */   {
/* 403:424 */     ItemStack localamj = paramvq.get(paramInt);
/* 404:426 */     if (a(paramvq, paramamj, paramInt, paramej))
/* 405:    */     {
/* 406:427 */       int i = 0;
/* 407:428 */       if (localamj == null)
/* 408:    */       {
/* 409:429 */         paramvq.a(paramInt, paramamj);
/* 410:430 */         paramamj = null;
/* 411:431 */         i = 1;
/* 412:    */       }
/* 413:432 */       else if (a(localamj, paramamj))
/* 414:    */       {
/* 415:433 */         int j = paramamj.getMaxStackSize() - localamj.stackSize;
/* 416:434 */         int k = Math.min(paramamj.stackSize, j);
/* 417:    */         
/* 418:436 */         paramamj.stackSize -= k;
/* 419:437 */         localamj.stackSize += k;
/* 420:438 */         i = k > 0 ? 1 : 0;
/* 421:    */       }
/* 422:440 */       if (i != 0)
/* 423:    */       {
/* 424:441 */         if ((paramvq instanceof bde))
/* 425:    */         {
/* 426:442 */           bde localbde = (bde)paramvq;
/* 427:443 */           if (localbde.o()) {
/* 428:444 */             localbde.d(8);
/* 429:    */           }
/* 430:446 */           paramvq.o_();
/* 431:    */         }
/* 432:448 */         paramvq.o_();
/* 433:    */       }
/* 434:    */     }
/* 435:451 */     return paramamj;
/* 436:    */   }
/* 437:    */   
/* 438:    */   private vq G()
/* 439:    */   {
/* 440:455 */     EnumDirection localej = BlockHopper.b(getData());
/* 441:456 */     return b(getWorld(), this.pos.getX() + localej.g(), this.pos.getY() + localej.h(), this.pos.getZ() + localej.i());
/* 442:    */   }
/* 443:    */   
/* 444:    */   public static vq b(bdd parambdd)
/* 445:    */   {
/* 446:460 */     return b(parambdd.getWorld(), parambdd.getX(), parambdd.getY() + 1.0D, parambdd.getZ());
/* 447:    */   }
/* 448:    */   
/* 449:    */   public static EntityItem a(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 450:    */   {
/* 451:464 */     List<EntityItem> localList = paramaqu.a(EntityItem.class, new AABB(paramDouble1, paramDouble2, paramDouble3, paramDouble1 + 1.0D, paramDouble2 + 1.0D, paramDouble3 + 1.0D), xe.a);
/* 452:466 */     if (localList.size() > 0) {
/* 453:467 */       return (EntityItem)localList.get(0);
/* 454:    */     }
/* 455:469 */     return null;
/* 456:    */   }
/* 457:    */   
/* 458:    */   public static vq b(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 459:    */   {
/* 460:474 */     vq localObject1 = null;
/* 461:475 */     int i = MathUtils.floor(paramDouble1);
/* 462:476 */     int j = MathUtils.floor(paramDouble2);
/* 463:477 */     int k = MathUtils.floor(paramDouble3);
/* 464:478 */     BlockPosition localdt = new BlockPosition(i, j, k);
/* 465:    */     
/* 466:480 */     bcm localbcm = paramaqu.s(new BlockPosition(i, j, k));
/* 467:    */     
/* 468:482 */     if ((localbcm instanceof vq))
/* 469:    */     {
/* 470:483 */       localObject1 = (vq)localbcm;
/* 471:485 */       if ((localObject1 instanceof bcr))
/* 472:    */       {
/* 473:486 */         ProtoBlock localObject2 = paramaqu.getBlock(new BlockPosition(i, j, k)).getProto();
/* 474:488 */         if ((localObject2 instanceof BlockChest)) {
/* 475:489 */           localObject1 = ((BlockChest)localObject2).d(paramaqu, localdt);
/* 476:    */         }
/* 477:    */       }
/* 478:    */     }
/* 479:494 */     if (localObject1 == null)
/* 480:    */     {
/* 481:495 */       List<Entity> localObject2 = paramaqu.a((Entity)null, new AABB(paramDouble1, paramDouble2, paramDouble3, paramDouble1 + 1.0D, paramDouble2 + 1.0D, paramDouble3 + 1.0D), xe.c);
/* 482:497 */       if (localObject2.size() > 0) {
/* 483:498 */         localObject1 = (vq)localObject2.get(paramaqu.rng.nextInt(localObject2.size()));
/* 484:    */       }
/* 485:    */     }
/* 486:502 */     return localObject1;
/* 487:    */   }
/* 488:    */   
/* 489:    */   private static boolean a(ItemStack paramamj1, ItemStack paramamj2)
/* 490:    */   {
/* 491:506 */     if (paramamj1.getItem() != paramamj2.getItem()) {
/* 492:507 */       return false;
/* 493:    */     }
/* 494:509 */     if (paramamj1.getDamage2() != paramamj2.getDamage2()) {
/* 495:510 */       return false;
/* 496:    */     }
/* 497:512 */     if (paramamj1.stackSize > paramamj1.getMaxStackSize()) {
/* 498:513 */       return false;
/* 499:    */     }
/* 500:515 */     if (!ItemStack.a(paramamj1, paramamj2)) {
/* 501:516 */       return false;
/* 502:    */     }
/* 503:518 */     return true;
/* 504:    */   }
/* 505:    */   
/* 506:    */   public double getX()
/* 507:    */   {
/* 508:523 */     return this.pos.getX();
/* 509:    */   }
/* 510:    */   
/* 511:    */   public double getY()
/* 512:    */   {
/* 513:528 */     return this.pos.getY();
/* 514:    */   }
/* 515:    */   
/* 516:    */   public double getZ()
/* 517:    */   {
/* 518:533 */     return this.pos.getZ();
/* 519:    */   }
/* 520:    */   
/* 521:    */   public void d(int paramInt)
/* 522:    */   {
/* 523:537 */     this.g = paramInt;
/* 524:    */   }
/* 525:    */   
/* 526:    */   public boolean n()
/* 527:    */   {
/* 528:541 */     return this.g > 0;
/* 529:    */   }
/* 530:    */   
/* 531:    */   public boolean o()
/* 532:    */   {
/* 533:545 */     return this.g <= 1;
/* 534:    */   }
/* 535:    */   
/* 536:    */   public String k()
/* 537:    */   {
/* 538:550 */     return "minecraft:hopper";
/* 539:    */   }
/* 540:    */   
/* 541:    */   public aib a(ahb paramahb, EntityPlayer paramahd)
/* 542:    */   {
/* 543:555 */     return new aix(paramahb, this, paramahd);
/* 544:    */   }
/* 545:    */   
/* 546:    */   public int a_(int paramInt)
/* 547:    */   {
/* 548:560 */     return 0;
/* 549:    */   }
/* 550:    */   
/* 551:    */   public void b(int paramInt1, int paramInt2) {}
/* 552:    */   
/* 553:    */   public int g()
/* 554:    */   {
/* 555:569 */     return 0;
/* 556:    */   }
/* 557:    */   
/* 558:    */   public void l()
/* 559:    */   {
/* 560:574 */     for (int i = 0; i < this.a.length; i++) {
/* 561:575 */       this.a[i] = null;
/* 562:    */     }
/* 563:    */   }
/* 564:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bde
 * JD-Core Version:    0.7.0.1
 */
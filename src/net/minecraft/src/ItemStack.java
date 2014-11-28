package net.minecraft.src;
/*   1:    */ import com.google.common.collect.HashMultimap;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import com.google.common.collect.Multimap;

/*   4:    */ import java.text.DecimalFormat;
/*   5:    */ import java.util.ArrayList;
/*   7:    */ import java.util.Iterator;
/*   8:    */ import java.util.List;
			  import java.util.Map;
/*  10:    */ import java.util.Random;
/*  13:    */ 
/*  14:    */ public final class ItemStack
/*  15:    */ {
/*  16: 39 */   public static final DecimalFormat format = new DecimalFormat("#.###");
/*  17:    */   public int stackSize;
/*  18:    */   public int c;
/*  19:    */   private Item item;
/*  20:    */   private NBTTagCompound stackTagCompound;
/*  21:    */   private int itemDamage;
/*  22:    */   private EntityItemFrame g;
/*  23:    */   
/*  24:    */   public ItemStack(ProtoBlock paramatr)
/*  25:    */   {
/*  26: 76 */     this(paramatr, 1);
/*  27:    */   }
/*  28:    */   
/*  29:    */   public ItemStack(ProtoBlock paramatr, int paramInt)
/*  30:    */   {
/*  31: 80 */     this(paramatr, paramInt, 0);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public ItemStack(ProtoBlock paramatr, int paramInt1, int paramInt2)
/*  35:    */   {
/*  36: 84 */     this(Item.fromProtoBlock(paramatr), paramInt1, paramInt2);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public ItemStack(Item item)
/*  40:    */   {
/*  41: 88 */     this(item, 1);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public ItemStack(Item item, int count)
/*  45:    */   {
/*  46: 92 */     this(item, count, 0);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public ItemStack(Item item, int count, int damage)
/*  50:    */   {
/*  51: 96 */     this.item = item;
/*  52: 97 */     this.stackSize = count;
/*  53: 98 */     this.itemDamage = damage;
/*  54: 99 */     if (this.itemDamage < 0) {
/*  55:100 */       this.itemDamage = 0;
/*  56:    */     }
/*  57:    */   }
/*  58:    */   
/*  59:    */   public static ItemStack loadItemStackFromNBT(NBTTagCompound paramfn)
/*  60:    */   {
/*  61:105 */     ItemStack itemStack = new ItemStack();
/*  62:106 */     itemStack.readFromNBT(paramfn);
/*  63:107 */     return itemStack.getItem() != null ? itemStack : null;
/*  64:    */   }
/*  65:    */   
/*  66:    */   private ItemStack() {}
/*  67:    */   
/*  68:    */   public ItemStack split(int num)
/*  69:    */   {
/*  70:114 */     ItemStack result = new ItemStack(this.item, num, this.itemDamage);
/*  71:115 */     if (this.stackTagCompound != null) {
/*  72:116 */       result.stackTagCompound = ((NBTTagCompound)this.stackTagCompound.b());
/*  73:    */     }
/*  74:118 */     this.stackSize -= num;
/*  75:119 */     return result;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public Item getItem()
/*  79:    */   {
/*  80:123 */     return this.item;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public boolean a(EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  84:    */   {
/*  85:127 */     boolean bool = getItem().a(this, paramahd, paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3);
/*  86:128 */     if (bool) {
/*  87:129 */       paramahd.increaseStat(StatList.J[Item.b(this.item)]);
/*  88:    */     }
/*  89:131 */     return bool;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public float a(ProtoBlock paramatr)
/*  93:    */   {
/*  94:135 */     return getItem().getStrVsBlock(this, paramatr);
/*  95:    */   }
/*  96:    */   
/*  97:    */   public ItemStack a(World paramaqu, EntityPlayer paramahd)
/*  98:    */   {
/*  99:139 */     return getItem().a(this, paramaqu, paramahd);
/* 100:    */   }
/* 101:    */   
/* 102:    */   public ItemStack b(World paramaqu, EntityPlayer paramahd)
/* 103:    */   {
/* 104:143 */     return getItem().b(this, paramaqu, paramahd);
/* 105:    */   }
/* 106:    */   
/* 107:    */   public NBTTagCompound writeToNBT(NBTTagCompound tag)
/* 108:    */   {
/* 109:147 */     oa localoa = (oa)Item.e.c(this.item);
/* 110:148 */     tag.setString("id", localoa == null ? "minecraft:air" : localoa.toString());
/* 111:149 */     tag.setByte("Count", (byte)this.stackSize);
/* 112:150 */     tag.setShort("Damage", (short)this.itemDamage);
/* 113:151 */     if (this.stackTagCompound != null) {
/* 114:152 */       tag.setNBT("tag", this.stackTagCompound);
/* 115:    */     }
/* 116:154 */     return tag;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void readFromNBT(NBTTagCompound tag)
/* 120:    */   {
/* 121:158 */     if (tag.hasKey("id", 8)) {
/* 122:159 */       this.item = Item.d(tag.getString("id"));
/* 123:    */     } else {
/* 124:161 */       this.item = Item.b(tag.e("id"));
/* 125:    */     }
/* 126:163 */     this.stackSize = tag.d("Count");
/* 127:164 */     this.itemDamage = tag.e("Damage");
/* 128:165 */     if (this.itemDamage < 0) {
/* 129:166 */       this.itemDamage = 0;
/* 130:    */     }
/* 131:168 */     if (tag.hasKey("tag", 10))
/* 132:    */     {
/* 133:169 */       this.stackTagCompound = tag.getCompoundTag("tag");
/* 134:170 */       if (this.item != null) {
/* 135:171 */         this.item.a(this.stackTagCompound);
/* 136:    */       }
/* 137:    */     }
/* 138:    */   }
/* 139:    */   
/* 140:    */   public int getMaxStackSize()
/* 141:    */   {
/* 142:177 */     return getItem().getItemStackLimit();
/* 143:    */   }
/* 144:    */   
/* 145:    */   public boolean isStackable()
/* 146:    */   {
/* 147:181 */     return (getMaxStackSize() > 1) && ((!e()) || (!g()));
/* 148:    */   }
/* 149:    */   
/* 150:    */   public boolean e()
/* 151:    */   {
/* 152:185 */     if (this.item == null) {
/* 153:186 */       return false;
/* 154:    */     }
/* 155:188 */     if (this.item.l() <= 0) {
/* 156:189 */       return false;
/* 157:    */     }
/* 158:191 */     if ((hasTagCompound()) && (getTagCompound().getBoolean("Unbreakable"))) {
/* 159:192 */       return false;
/* 160:    */     }
/* 161:194 */     return true;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public boolean f()
/* 165:    */   {
/* 166:204 */     return this.item.k();
/* 167:    */   }
/* 168:    */   
/* 169:    */   public boolean g()
/* 170:    */   {
/* 171:208 */     return (e()) && (this.itemDamage > 0);
/* 172:    */   }
/* 173:    */   
/* 174:    */   public int getDamage()
/* 175:    */   {
/* 176:212 */     return this.itemDamage;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public int getDamage2()
/* 180:    */   {
/* 181:216 */     return this.itemDamage;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void b(int paramInt)
/* 185:    */   {
/* 186:220 */     this.itemDamage = paramInt;
/* 187:221 */     if (this.itemDamage < 0) {
/* 188:222 */       this.itemDamage = 0;
/* 189:    */     }
/* 190:    */   }
/* 191:    */   
/* 192:    */   public int j()
/* 193:    */   {
/* 194:227 */     return this.item.l();
/* 195:    */   }
/* 196:    */   
/* 197:    */   public boolean a(int paramInt, Random paramRandom)
/* 198:    */   {
/* 199:231 */     if (!e()) {
/* 200:232 */       return false;
/* 201:    */     }
/* 202:235 */     if (paramInt > 0)
/* 203:    */     {
/* 204:236 */       int m = aph.a(Enchantment.t.id, this);
/* 205:    */       
/* 206:238 */       int n = 0;
/* 207:239 */       for (int i1 = 0; (m > 0) && (i1 < paramInt); i1++) {
/* 208:240 */         if (EnchantmentDurability.a(this, m, paramRandom)) {
/* 209:241 */           n++;
/* 210:    */         }
/* 211:    */       }
/* 212:244 */       paramInt -= n;
/* 213:246 */       if (paramInt <= 0) {
/* 214:247 */         return false;
/* 215:    */       }
/* 216:    */     }
/* 217:251 */     this.itemDamage += paramInt;
/* 218:    */     
/* 219:253 */     return this.itemDamage > j();
/* 220:    */   }
/* 221:    */   
/* 222:    */   public void a(int paramInt, EntityLiving paramxm)
/* 223:    */   {
/* 224:257 */     if (((paramxm instanceof EntityPlayer)) && (((EntityPlayer)paramxm).abilities.instabuild)) {
/* 225:258 */       return;
/* 226:    */     }
/* 227:260 */     if (!e()) {
/* 228:261 */       return;
/* 229:    */     }
/* 230:264 */     if (a(paramInt, paramxm.getRNG()))
/* 231:    */     {
/* 232:265 */       paramxm.b(this);
/* 233:    */       
/* 234:267 */       this.stackSize -= 1;
/* 235:268 */       if ((paramxm instanceof EntityPlayer))
/* 236:    */       {
/* 237:269 */         EntityPlayer localahd = (EntityPlayer)paramxm;
/* 238:270 */         localahd.increaseStat(StatList.K[Item.b(this.item)]);
/* 239:271 */         if ((this.stackSize == 0) && ((getItem() instanceof ItemBow))) {
/* 240:272 */           localahd.bZ();
/* 241:    */         }
/* 242:    */       }
/* 243:275 */       if (this.stackSize < 0) {
/* 244:276 */         this.stackSize = 0;
/* 245:    */       }
/* 246:278 */       this.itemDamage = 0;
/* 247:    */     }
/* 248:    */   }
/* 249:    */   
/* 250:    */   public void a(EntityLiving paramxm, EntityPlayer paramahd)
/* 251:    */   {
/* 252:283 */     boolean bool = this.item.a(this, paramxm, paramahd);
/* 253:284 */     if (bool) {
/* 254:285 */       paramahd.increaseStat(StatList.J[Item.b(this.item)]);
/* 255:    */     }
/* 256:    */   }
/* 257:    */   
/* 258:    */   public void a(World paramaqu, ProtoBlock paramatr, BlockPosition paramdt, EntityPlayer paramahd)
/* 259:    */   {
/* 260:290 */     boolean bool = this.item.a(this, paramaqu, paramatr, paramdt, paramahd);
/* 261:291 */     if (bool) {
/* 262:292 */       paramahd.increaseStat(StatList.J[Item.b(this.item)]);
/* 263:    */     }
/* 264:    */   }
/* 265:    */   
/* 266:    */   public boolean canHarvestBlock(ProtoBlock paramatr)
/* 267:    */   {
/* 268:297 */     return this.item.canHarvestBlock(paramatr);
/* 269:    */   }
/* 270:    */   
/* 271:    */   public boolean a(EntityPlayer paramahd, EntityLiving paramxm)
/* 272:    */   {
/* 273:301 */     return this.item.a(this, paramahd, paramxm);
/* 274:    */   }
/* 275:    */   
/* 276:    */   public ItemStack k()
/* 277:    */   {
/* 278:305 */     ItemStack localamj = new ItemStack(this.item, this.stackSize, this.itemDamage);
/* 279:306 */     if (this.stackTagCompound != null) {
/* 280:307 */       localamj.stackTagCompound = ((NBTTagCompound)this.stackTagCompound.b());
/* 281:    */     }
/* 282:309 */     return localamj;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public static boolean a(ItemStack stack1, ItemStack stack2)
/* 286:    */   {
/* 287:313 */     if ((stack1 == null) && (stack2 == null)) {
/* 288:314 */       return true;
/* 289:    */     }
/* 290:316 */     if ((stack1 == null) || (stack2 == null)) {
/* 291:317 */       return false;
/* 292:    */     }
/* 293:320 */     if ((stack1.stackTagCompound == null) && (stack2.stackTagCompound != null)) {
/* 294:321 */       return false;
/* 295:    */     }
/* 296:323 */     if ((stack1.stackTagCompound != null) && (!stack1.stackTagCompound.equals(stack2.stackTagCompound))) {
/* 297:324 */       return false;
/* 298:    */     }
/* 299:326 */     return true;
/* 300:    */   }
/* 301:    */   
/* 302:    */   public static boolean b(ItemStack paramamj1, ItemStack paramamj2)
/* 303:    */   {
/* 304:330 */     if ((paramamj1 == null) && (paramamj2 == null)) {
/* 305:331 */       return true;
/* 306:    */     }
/* 307:333 */     if ((paramamj1 == null) || (paramamj2 == null)) {
/* 308:334 */       return false;
/* 309:    */     }
/* 310:336 */     return paramamj1.d(paramamj2);
/* 311:    */   }
/* 312:    */   
/* 313:    */   private boolean d(ItemStack paramamj)
/* 314:    */   {
/* 315:340 */     if (this.stackSize != paramamj.stackSize) {
/* 316:341 */       return false;
/* 317:    */     }
/* 318:343 */     if (this.item != paramamj.item) {
/* 319:344 */       return false;
/* 320:    */     }
/* 321:346 */     if (this.itemDamage != paramamj.itemDamage) {
/* 322:347 */       return false;
/* 323:    */     }
/* 324:349 */     if ((this.stackTagCompound == null) && (paramamj.stackTagCompound != null)) {
/* 325:350 */       return false;
/* 326:    */     }
/* 327:352 */     if ((this.stackTagCompound != null) && (!this.stackTagCompound.equals(paramamj.stackTagCompound))) {
/* 328:353 */       return false;
/* 329:    */     }
/* 330:355 */     return true;
/* 331:    */   }
/* 332:    */   
/* 333:    */   public static boolean c(ItemStack paramamj1, ItemStack paramamj2)
/* 334:    */   {
/* 335:359 */     if ((paramamj1 == null) && (paramamj2 == null)) {
/* 336:360 */       return true;
/* 337:    */     }
/* 338:362 */     if ((paramamj1 != null) && (paramamj2 != null)) {
/* 339:363 */       return paramamj1.a(paramamj2);
/* 340:    */     }
/* 341:365 */     return false;
/* 342:    */   }
/* 343:    */   
/* 344:    */   public boolean a(ItemStack paramamj)
/* 345:    */   {
/* 346:376 */     return (paramamj != null) && (this.item == paramamj.item) && (this.itemDamage == paramamj.itemDamage);
/* 347:    */   }
/* 348:    */   
/* 349:    */   public String a()
/* 350:    */   {
/* 351:381 */     return this.item.e_(this);
/* 352:    */   }
/* 353:    */   
/* 354:    */   public static ItemStack b(ItemStack paramamj)
/* 355:    */   {
/* 356:390 */     return paramamj == null ? null : paramamj.k();
/* 357:    */   }
/* 358:    */   
/* 359:    */   public String toString()
/* 360:    */   {
/* 361:395 */     return this.stackSize + "x" + this.item.a() + "@" + this.itemDamage;
/* 362:    */   }
/* 363:    */   
/* 364:    */   public void a(World paramaqu, Entity paramwv, int paramInt, boolean paramBoolean)
/* 365:    */   {
/* 366:399 */     if (this.c > 0) {
/* 367:400 */       this.c -= 1;
/* 368:    */     }
/* 369:402 */     this.item.a(this, paramaqu, paramwv, paramInt, paramBoolean);
/* 370:    */   }
/* 371:    */   
/* 372:    */   public void a(World paramaqu, EntityPlayer paramahd, int paramInt)
/* 373:    */   {
/* 374:406 */     paramahd.increaseStat(StatList.I[Item.b(this.item)], paramInt);
/* 375:407 */     this.item.d(this, paramaqu, paramahd);
/* 376:    */   }
/* 377:    */   
/* 378:    */   public boolean c(ItemStack paramamj)
/* 379:    */   {
/* 380:411 */     return d(paramamj);
/* 381:    */   }
/* 382:    */   
/* 383:    */   public int l()
/* 384:    */   {
/* 385:415 */     return getItem().d(this);
/* 386:    */   }
/* 387:    */   
/* 388:    */   public ano m()
/* 389:    */   {
/* 390:419 */     return getItem().e(this);
/* 391:    */   }
/* 392:    */   
/* 393:    */   public void b(World paramaqu, EntityPlayer paramahd, int paramInt)
/* 394:    */   {
/* 395:423 */     getItem().a(this, paramaqu, paramahd, paramInt);
/* 396:    */   }
/* 397:    */   
/* 398:    */   public boolean hasTagCompound()
/* 399:    */   {
/* 400:427 */     return this.stackTagCompound != null;
/* 401:    */   }
/* 402:    */   
/* 403:    */   public NBTTagCompound getTagCompound()
/* 404:    */   {
/* 405:431 */     return this.stackTagCompound;
/* 406:    */   }
/* 407:    */   
/* 408:    */   public NBTTagCompound a(String paramString, boolean paramBoolean)
/* 409:    */   {
/* 410:435 */     if ((this.stackTagCompound == null) || (!this.stackTagCompound.hasKey(paramString, 10)))
/* 411:    */     {
/* 412:436 */       if (paramBoolean)
/* 413:    */       {
/* 414:437 */         NBTTagCompound localfn = new NBTTagCompound();
/* 415:438 */         a(paramString, localfn);
/* 416:439 */         return localfn;
/* 417:    */       }
/* 418:441 */       return null;
/* 419:    */     }
/* 420:443 */     return this.stackTagCompound.getCompoundTag(paramString);
/* 421:    */   }
/* 422:    */   
/* 423:    */   public fv p()
/* 424:    */   {
/* 425:447 */     if (this.stackTagCompound == null) {
/* 426:448 */       return null;
/* 427:    */     }
/* 428:450 */     return this.stackTagCompound.c("ench", 10);
/* 429:    */   }
/* 430:    */   
/* 431:    */   public void setTagCompound(NBTTagCompound paramfn)
/* 432:    */   {
/* 433:454 */     this.stackTagCompound = paramfn;
/* 434:    */   }
/* 435:    */   
/* 436:    */   public String q()
/* 437:    */   {
/* 438:458 */     String str = getItem().a(this);
/* 439:460 */     if ((this.stackTagCompound != null) && (this.stackTagCompound.hasKey("display", 10)))
/* 440:    */     {
/* 441:461 */       NBTTagCompound localfn = this.stackTagCompound.getCompoundTag("display");
/* 442:463 */       if (localfn.hasKey("Name", 8)) {
/* 443:464 */         str = localfn.getString("Name");
/* 444:    */       }
/* 445:    */     }
/* 446:468 */     return str;
/* 447:    */   }
/* 448:    */   
/* 449:    */   public ItemStack c(String paramString)
/* 450:    */   {
/* 451:472 */     if (this.stackTagCompound == null) {
/* 452:473 */       this.stackTagCompound = new NBTTagCompound();
/* 453:    */     }
/* 454:475 */     if (!this.stackTagCompound.hasKey("display", 10)) {
/* 455:476 */       this.stackTagCompound.setNBT("display", new NBTTagCompound());
/* 456:    */     }
/* 457:478 */     this.stackTagCompound.getCompoundTag("display").setString("Name", paramString);
/* 458:479 */     return this;
/* 459:    */   }
/* 460:    */   
/* 461:    */   public void r()
/* 462:    */   {
/* 463:483 */     if (this.stackTagCompound == null) {
/* 464:484 */       return;
/* 465:    */     }
/* 466:486 */     if (!this.stackTagCompound.hasKey("display", 10)) {
/* 467:487 */       return;
/* 468:    */     }
/* 469:489 */     NBTTagCompound localfn = this.stackTagCompound.getCompoundTag("display");
/* 470:490 */     localfn.o("Name");
/* 471:492 */     if (localfn.c_())
/* 472:    */     {
/* 473:493 */       this.stackTagCompound.o("display");
/* 474:495 */       if (this.stackTagCompound.c_()) {
/* 475:496 */         setTagCompound(null);
/* 476:    */       }
/* 477:    */     }
/* 478:    */   }
/* 479:    */   
/* 480:    */   public boolean s()
/* 481:    */   {
/* 482:502 */     if (this.stackTagCompound == null) {
/* 483:503 */       return false;
/* 484:    */     }
/* 485:505 */     if (!this.stackTagCompound.hasKey("display", 10)) {
/* 486:506 */       return false;
/* 487:    */     }
/* 488:508 */     return this.stackTagCompound.getCompoundTag("display").hasKey("Name", 8);
/* 489:    */   }
/* 490:    */   
/* 491:    */   public List<String> a(EntityPlayer paramahd, boolean paramBoolean)
/* 492:    */   {
/* 493:512 */     ArrayList<String> localArrayList = Lists.newArrayList();
/* 494:    */     
/* 495:514 */     String str1 = q();
/* 496:515 */     if (s()) {
/* 497:516 */       str1 = a.u + str1;
/* 498:    */     }
/* 499:518 */     str1 = str1 + a.v;
/* 500:520 */     if (paramBoolean)
/* 501:    */     {
/* 502:521 */       String str2 = "";
/* 503:523 */       if (str1.length() > 0)
/* 504:    */       {
/* 505:524 */         str1 = str1 + " (";
/* 506:525 */         str2 = ")";
/* 507:    */       }
/* 508:528 */       int n = Item.b(this.item);
/* 509:529 */       if (f()) {
/* 510:530 */         str1 = str1 + String.format("#%04d/%d%s", new Object[] { Integer.valueOf(n), Integer.valueOf(this.itemDamage), str2 });
/* 511:    */       } else {
/* 512:532 */         str1 = str1 + String.format("#%04d%s", new Object[] { Integer.valueOf(n), str2 });
/* 513:    */       }
/* 514:    */     }
/* 515:534 */     else if ((!s()) && 
/* 516:535 */       (this.item == ItemList.filledMap))
/* 517:    */     {
/* 518:536 */       str1 = str1 + " #" + this.itemDamage;
/* 519:    */     }
/* 520:539 */     localArrayList.add(str1);
/* 521:    */     
/* 522:541 */     int m = 0;
/* 523:542 */     if ((hasTagCompound()) && 
/* 524:543 */       (this.stackTagCompound.hasKey("HideFlags", 99))) {
/* 525:544 */       m = this.stackTagCompound.getInteger("HideFlags");
/* 526:    */     }
/* 527:548 */     if ((m & 0x20) == 0) {
/* 528:549 */       this.item.a(this, paramahd, localArrayList, paramBoolean);
/* 529:    */     }
/* 530:    */     fv localfv;
/* 531:552 */     if (hasTagCompound())
/* 532:    */     {
/* 533:    */       int i2;
/* 534:553 */       if ((m & 0x1) == 0)
/* 535:    */       {
/* 536:554 */         fv localObject1 = p();
/* 537:555 */         if (localObject1 != null) {
/* 538:556 */           for (int i1 = 0; i1 < localObject1.c(); i1++)
/* 539:    */           {
/* 540:557 */             i2 = localObject1.b(i1).e("id");
/* 541:558 */             int i4 = localObject1.b(i1).e("lvl");
/* 542:560 */             if (Enchantment.c(i2) != null) {
/* 543:561 */               localArrayList.add(Enchantment.c(i2).d(i4));
/* 544:    */             }
/* 545:    */           }
/* 546:    */         }
/* 547:    */       }
/* 548:567 */       if (this.stackTagCompound.hasKey("display", 10))
/* 549:    */       {
/* 550:568 */         NBTTagCompound localObject1 = this.stackTagCompound.getCompoundTag("display");
/* 551:570 */         if (localObject1.hasKey("color", 3)) {
/* 552:571 */           if (paramBoolean) {
/* 553:572 */             localArrayList.add("Color: #" + Integer.toHexString(localObject1.getInteger("color")).toUpperCase());
/* 554:    */           } else {
/* 555:574 */             localArrayList.add(a.u + fi.a("item.dyed"));
/* 556:    */           }
/* 557:    */         }
/* 558:578 */         if (localObject1.b("Lore") == 9)
/* 559:    */         {
/* 560:579 */           localfv = localObject1.c("Lore", 8);
/* 561:580 */           if (localfv.c() > 0) {
/* 562:581 */             for (i2 = 0; i2 < localfv.c(); i2++) {
/* 563:582 */               localArrayList.add(a.f + "" + a.u + localfv.f(i2));
/* 564:    */             }
/* 565:    */           }
/* 566:    */         }
/* 567:    */       }
/* 568:    */     }
/* 569:589 */     Multimap<String,ya> localObject1 = B();
/* 598:    */     ya localObject3;
/* 570:591 */     if ((!localObject1.isEmpty()) && ((m & 0x2) == 0))
/* 571:    */     {
/* 572:592 */       localArrayList.add("");
/* 573:593 */       for (Iterator<Map.Entry<String,ya>> localObject2 = localObject1.entries().iterator(); localObject2.hasNext();)
/* 574:    */       {
/* 575:593 */         Map.Entry<String,ya> localEntry = localObject2.next();
/* 576:594 */         localObject3 = localEntry.getValue();
/* 577:595 */         double d1 = localObject3.d();
/* 578:598 */         if (localObject3.a() == Item.f) {
/* 579:599 */           d1 += aph.a(this, xs.a);
/* 580:    */         }
/* 581:    */         double d2;
/* 582:602 */         if ((localObject3.c() == 1) || (localObject3.c() == 2)) {
/* 583:603 */           d2 = d1 * 100.0D;
/* 584:    */         } else {
/* 585:605 */           d2 = d1;
/* 586:    */         }
/* 587:608 */         if (d1 > 0.0D)
/* 588:    */         {
/* 589:609 */           localArrayList.add(a.j + fi.a(new StringBuilder().append("attribute.modifier.plus.").append(((ya)localObject3).c()).toString(), new Object[] { format.format(d2), fi.a("attribute.name." + (String)localEntry.getKey()) }));
/* 590:    */         }
/* 591:610 */         else if (d1 < 0.0D)
/* 592:    */         {
/* 593:611 */           d2 *= -1.0D;
/* 594:612 */           localArrayList.add(a.m + fi.a(new StringBuilder().append("attribute.modifier.take.").append(((ya)localObject3).c()).toString(), new Object[] { format.format(d2), fi.a("attribute.name." + (String)localEntry.getKey()) }));
/* 595:    */         }
/* 596:    */       }
/* 597:    */     }
/* 599:616 */     if ((hasTagCompound()) && (getTagCompound().getBoolean("Unbreakable")) && ((m & 0x4) == 0)) {
/* 600:617 */       localArrayList.add(a.j + fi.a("item.unbreakable"));
/* 601:    */     }
/* 602:    */     int i3;
/* 603:620 */     if ((hasTagCompound()) && (this.stackTagCompound.hasKey("CanDestroy", 9)) && ((m & 0x8) == 0))
/* 604:    */     {
/* 605:621 */       localfv = this.stackTagCompound.c("CanDestroy", 8);
/* 606:622 */       if (localfv.c() > 0)
/* 607:    */       {
/* 608:623 */         localArrayList.add("");
/* 609:624 */         localArrayList.add(a.h + fi.a("item.canBreak"));
/* 610:625 */         for (i3 = 0; i3 < localfv.c(); i3++)
/* 611:    */         {
/* 612:626 */           ProtoBlock localatr = ProtoBlock.b(localfv.f(i3));
/* 613:627 */           if (localatr != null) {
/* 614:628 */             localArrayList.add(a.i + localatr.H());
/* 615:    */           } else {
/* 616:630 */             localArrayList.add(a.i + "missingno");
/* 617:    */           }
/* 618:    */         }
/* 619:    */       }
/* 620:    */     }
/* 621:636 */     if ((hasTagCompound()) && (this.stackTagCompound.hasKey("CanPlaceOn", 9)) && ((m & 0x10) == 0))
/* 622:    */     {
/* 623:637 */       localfv = this.stackTagCompound.c("CanPlaceOn", 8);
/* 624:638 */       if (localfv.c() > 0)
/* 625:    */       {
/* 626:639 */         localArrayList.add("");
/* 627:640 */         localArrayList.add(a.h + fi.a("item.canPlace"));
/* 628:641 */         for (i3 = 0; i3 < localfv.c(); i3++)
/* 629:    */         {
/* 630:642 */           ProtoBlock localatr = ProtoBlock.b(localfv.f(i3));
/* 631:643 */           if (localatr != null) {
/* 632:644 */             localArrayList.add(a.i + localatr.H());
/* 633:    */           } else {
/* 634:646 */             localArrayList.add(a.i + "missingno");
/* 635:    */           }
/* 636:    */         }
/* 637:    */       }
/* 638:    */     }
/* 639:652 */     if (paramBoolean)
/* 640:    */     {
/* 641:653 */       if (g()) {
/* 642:654 */         localArrayList.add("Durability: " + (j() - getDamage()) + " / " + j());
/* 643:    */       }
/* 644:656 */       localArrayList.add(a.i + ((oa)Item.e.c(this.item)).toString());
/* 645:657 */       if (hasTagCompound()) {
/* 646:658 */         localArrayList.add(a.i + "NBT: " + getTagCompound().c().size() + " tag(s)");
/* 647:    */       }
/* 648:    */     }
/* 649:662 */     return localArrayList;
/* 650:    */   }
/* 651:    */   
/* 652:    */   public boolean t()
/* 653:    */   {
/* 654:666 */     return getItem().f(this);
/* 655:    */   }
/* 656:    */   
/* 657:    */   public EnumRarity u()
/* 658:    */   {
/* 659:670 */     return getItem().getRarity(this);
/* 660:    */   }
/* 661:    */   
/* 662:    */   public boolean v()
/* 663:    */   {
/* 664:674 */     if (!getItem().f_(this)) {
/* 665:675 */       return false;
/* 666:    */     }
/* 667:677 */     if (hasEnchantment()) {
/* 668:678 */       return false;
/* 669:    */     }
/* 670:680 */     return true;
/* 671:    */   }
/* 672:    */   
/* 673:    */   public void a(Enchantment paramapf, int paramInt)
/* 674:    */   {
/* 675:684 */     if (this.stackTagCompound == null) {
/* 676:685 */       setTagCompound(new NBTTagCompound());
/* 677:    */     }
/* 678:687 */     if (!this.stackTagCompound.hasKey("ench", 9)) {
/* 679:688 */       this.stackTagCompound.setNBT("ench", new fv());
/* 680:    */     }
/* 681:690 */     fv localfv = this.stackTagCompound.c("ench", 10);
/* 682:691 */     NBTTagCompound localfn = new NBTTagCompound();
/* 683:692 */     localfn.setShort("id", (short)paramapf.id);
/* 684:693 */     localfn.setShort("lvl", (short)(byte)paramInt);
/* 685:694 */     localfv.a(localfn);
/* 686:    */   }
/* 687:    */   
/* 688:    */   public boolean hasEnchantment()
/* 689:    */   {
/* 690:698 */     if ((this.stackTagCompound != null) && (this.stackTagCompound.hasKey("ench", 9))) {
/* 691:699 */       return true;
/* 692:    */     }
/* 693:701 */     return false;
/* 694:    */   }
/* 695:    */   
/* 696:    */   public void a(String paramString, NBTBase paramgd)
/* 697:    */   {
/* 698:705 */     if (this.stackTagCompound == null) {
/* 699:706 */       setTagCompound(new NBTTagCompound());
/* 700:    */     }
/* 701:708 */     this.stackTagCompound.setNBT(paramString, paramgd);
/* 702:    */   }
/* 703:    */   
/* 704:    */   public boolean x()
/* 705:    */   {
/* 706:712 */     return getItem().s();
/* 707:    */   }
/* 708:    */   
/* 709:    */   public boolean y()
/* 710:    */   {
/* 711:716 */     return this.g != null;
/* 712:    */   }
/* 713:    */   
/* 714:    */   public void a(EntityItemFrame paramadk)
/* 715:    */   {
/* 716:720 */     this.g = paramadk;
/* 717:    */   }
/* 718:    */   
/* 719:    */   public EntityItemFrame z()
/* 720:    */   {
/* 721:724 */     return this.g;
/* 722:    */   }
/* 723:    */   
/* 724:    */   public int getRepairCost()
/* 725:    */   {
/* 726:728 */     if ((hasTagCompound()) && (this.stackTagCompound.hasKey("RepairCost", 3))) {
/* 727:729 */       return this.stackTagCompound.getInteger("RepairCost");
/* 728:    */     }
/* 729:731 */     return 0;
/* 730:    */   }
/* 731:    */   
/* 732:    */   public void c(int paramInt)
/* 733:    */   {
/* 734:736 */     if (!hasTagCompound()) {
/* 735:737 */       this.stackTagCompound = new NBTTagCompound();
/* 736:    */     }
/* 737:739 */     this.stackTagCompound.setInt("RepairCost", paramInt);
/* 738:    */   }
/* 739:    */   
/* 740:    */   public Multimap<String,ya> B()
/* 741:    */   {
/* 742:    */     Multimap<String,ya> localObject;
/* 743:745 */     if ((hasTagCompound()) && (this.stackTagCompound.hasKey("AttributeModifiers", 9)))
/* 744:    */     {
/* 745:746 */       localObject = HashMultimap.create();
/* 746:747 */       fv localfv = this.stackTagCompound.c("AttributeModifiers", 10);
/* 747:749 */       for (int m = 0; m < localfv.c(); m++)
/* 748:    */       {
/* 749:750 */         NBTTagCompound localfn = localfv.b(m);
/* 750:751 */         ya localya = MobAttribute.a(localfn);
/* 751:752 */         if (localya != null) {
/* 752:756 */           if ((localya.a().getLeastSignificantBits() != 0L) && (localya.a().getMostSignificantBits() != 0L)) {
/* 753:757 */             localObject.put(localfn.getString("AttributeName"), localya);
/* 754:    */           }
/* 755:    */         }
/* 756:    */       }
/* 757:    */     }
/* 758:    */     else
/* 759:    */     {
/* 760:761 */       localObject = getItem().i();
/* 761:    */     }
/* 762:764 */     return localObject;
/* 763:    */   }
/* 764:    */   
/* 765:    */   public void a(Item paramalq)
/* 766:    */   {
/* 767:770 */     this.item = paramalq;
/* 768:    */   }
/* 769:    */   
/* 770:    */   public ho C()
/* 771:    */   {
/* 772:774 */     hy localhy = new hy(q());
/* 773:775 */     if (s()) {
/* 774:776 */       localhy.b().b(Boolean.valueOf(true));
/* 775:    */     }
/* 776:779 */     ho localho = new hy("[").a(localhy).a("]");
/* 777:781 */     if (this.item != null)
/* 778:    */     {
/* 779:782 */       NBTTagCompound localfn = new NBTTagCompound();
/* 780:783 */       writeToNBT(localfn);
/* 781:    */       
/* 782:785 */       localho.b().a(new hr(hs.c, new hy(localfn.toString())));
/* 783:786 */       localho.b().a(u().e);
/* 784:    */     }
/* 785:789 */     return localho;
/* 786:    */   }
/* 787:    */   
/* 788:793 */   private ProtoBlock h = null;
/* 789:794 */   private boolean i = false;
/* 790:    */   
/* 791:    */   public boolean c(ProtoBlock paramatr)
/* 792:    */   {
/* 793:797 */     if (paramatr == this.h) {
/* 794:798 */       return this.i;
/* 795:    */     }
/* 796:801 */     this.h = paramatr;
/* 797:803 */     if ((hasTagCompound()) && (this.stackTagCompound.hasKey("CanDestroy", 9)))
/* 798:    */     {
/* 799:804 */       fv localfv = this.stackTagCompound.c("CanDestroy", 8);
/* 800:805 */       for (int m = 0; m < localfv.c(); m++)
/* 801:    */       {
/* 802:806 */         ProtoBlock localatr = ProtoBlock.b(localfv.f(m));
/* 803:807 */         if (localatr == paramatr)
/* 804:    */         {
/* 805:808 */           this.i = true;
/* 806:809 */           return true;
/* 807:    */         }
/* 808:    */       }
/* 809:    */     }
/* 810:813 */     this.i = false;
/* 811:814 */     return false;
/* 812:    */   }
/* 813:    */   
/* 814:818 */   private ProtoBlock j = null;
/* 815:819 */   private boolean k = false;
/* 816:    */   
/* 817:    */   public boolean d(ProtoBlock paramatr)
/* 818:    */   {
/* 819:822 */     if (paramatr == this.j) {
/* 820:823 */       return this.k;
/* 821:    */     }
/* 822:826 */     this.j = paramatr;
/* 823:828 */     if ((hasTagCompound()) && (this.stackTagCompound.hasKey("CanPlaceOn", 9)))
/* 824:    */     {
/* 825:829 */       fv localfv = this.stackTagCompound.c("CanPlaceOn", 8);
/* 826:830 */       for (int m = 0; m < localfv.c(); m++)
/* 827:    */       {
/* 828:831 */         ProtoBlock localatr = ProtoBlock.b(localfv.f(m));
/* 829:832 */         if (localatr == paramatr)
/* 830:    */         {
/* 831:833 */           this.k = true;
/* 832:834 */           return true;
/* 833:    */         }
/* 834:    */       }
/* 835:    */     }
/* 836:838 */     this.k = false;
/* 837:839 */     return false;
/* 838:    */   }
/* 839:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     amj
 * JD-Core Version:    0.7.0.1
 */
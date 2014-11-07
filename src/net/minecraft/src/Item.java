package net.minecraft.src;
/*   1:    */ import com.google.common.collect.HashMultimap;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import com.google.common.collect.Multimap;

/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Map;
/*   6:    */ import java.util.Random;
/*   7:    */ import java.util.UUID;
/*   8:    */ 
/*   9:    */ public class Item
/*  10:    */ {
/*  11: 38 */   public static final ev<oa,Item> e = new ev<oa,Item>();
/*  12: 39 */   private static final Map<ProtoBlock, Item> a = Maps.newHashMap();
/*  13: 41 */   protected static final UUID f = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
/*  14:    */   private CreativeTabs creativeTab;
/*  15:    */   
/*  16:    */   public static int b(Item paramalq)
/*  17:    */   {
/*  18: 52 */     return paramalq == null ? 0 : e.b(paramalq);
/*  19:    */   }
/*  20:    */   
/*  21:    */   public static Item b(int paramInt)
/*  22:    */   {
/*  23: 56 */     return (Item)e.a(paramInt);
/*  24:    */   }
/*  25:    */   
/*  26:    */   public static Item fromProtoBlock(ProtoBlock paramatr)
/*  27:    */   {
/*  28: 60 */     return a.get(paramatr);
/*  29:    */   }
/*  30:    */   
/*  31:    */   public static Item d(String paramString)
/*  32:    */   {
/*  33: 64 */     Item localalq = (Item)e.a(new oa(paramString));
/*  34: 65 */     if (localalq == null) {
/*  35:    */       try
/*  36:    */       {
/*  37: 67 */         return b(Integer.parseInt(paramString));
/*  38:    */       }
/*  39:    */       catch (NumberFormatException localNumberFormatException) {}
/*  40:    */     }
/*  41: 71 */     return localalq;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean a(NBTTagCompound paramfn)
/*  45:    */   {
/*  46: 75 */     return false;
/*  47:    */   }
/*  48:    */   
/*  49:135 */   protected static Random random = new Random();
/*  50:138 */   protected int maxStackSize = 64;
/*  51:    */   private int c;
/*  52:    */   protected boolean i;
/*  53:    */   protected boolean j;
/*  54:    */   private Item d;
/*  55:    */   private String k;
/*  56:    */   private String id;
/*  57:    */   
/*  58:    */   public Item setStackLimit(int limit)
/*  59:    */   {
/*  60:150 */     this.maxStackSize = limit;
/*  61:151 */     return this;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  65:    */   {
/*  66:155 */     return false;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public float getStrVsBlock(ItemStack paramamj, ProtoBlock paramatr)
/*  70:    */   {
/*  71:159 */     return 1.0F;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/*  75:    */   {
/*  76:163 */     return paramamj;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public ItemStack b(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/*  80:    */   {
/*  81:167 */     return paramamj;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public int getItemStackLimit()
/*  85:    */   {
/*  86:171 */     return this.maxStackSize;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public int a(int paramInt)
/*  90:    */   {
/*  91:175 */     return 0;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public boolean k()
/*  95:    */   {
/*  96:179 */     return this.j;
/*  97:    */   }
/*  98:    */   
/*  99:    */   protected Item a(boolean paramBoolean)
/* 100:    */   {
/* 101:183 */     this.j = paramBoolean;
/* 102:184 */     return this;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public int l()
/* 106:    */   {
/* 107:188 */     return this.c;
/* 108:    */   }
/* 109:    */   
/* 110:    */   protected Item setMaxDamage(int paramInt)
/* 111:    */   {
/* 112:192 */     this.c = paramInt;
/* 113:193 */     return this;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public boolean m()
/* 117:    */   {
/* 118:197 */     return (this.c > 0) && (!this.j);
/* 119:    */   }
/* 120:    */   
/* 121:    */   public boolean a(ItemStack paramamj, EntityLiving paramxm1, EntityLiving paramxm2)
/* 122:    */   {
/* 123:204 */     return false;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public boolean a(ItemStack paramamj, World paramaqu, ProtoBlock paramatr, BlockPosition paramdt, EntityLiving paramxm)
/* 127:    */   {
/* 128:211 */     return false;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public boolean canHarvestBlock(ProtoBlock paramatr)
/* 132:    */   {
/* 133:215 */     return false;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, EntityLiving paramxm)
/* 137:    */   {
/* 138:219 */     return false;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public Item n()
/* 142:    */   {
/* 143:223 */     this.i = true;
/* 144:224 */     return this;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public boolean v_()
/* 148:    */   {
/* 149:228 */     return this.i;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public boolean e()
/* 153:    */   {
/* 154:232 */     return false;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public Item setID(String id)
/* 158:    */   {
/* 159:237 */     this.id = id;
/* 160:238 */     return this;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public String k(ItemStack paramamj)
/* 164:    */   {
/* 165:246 */     String str = e_(paramamj);
/* 166:247 */     if (str == null) {
/* 167:248 */       return "";
/* 168:    */     }
/* 169:250 */     return fi.a(str);
/* 170:    */   }
/* 171:    */   
/* 172:    */   public String a()
/* 173:    */   {
/* 174:255 */     return "item." + this.id;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public String e_(ItemStack paramamj)
/* 178:    */   {
/* 179:259 */     return "item." + this.id;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public Item c(Item paramalq)
/* 183:    */   {
/* 184:263 */     this.d = paramalq;
/* 185:264 */     return this;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public boolean p()
/* 189:    */   {
/* 190:268 */     return true;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public Item q()
/* 194:    */   {
/* 195:272 */     return this.d;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public boolean r()
/* 199:    */   {
/* 200:276 */     return this.d != null;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public int a(ItemStack paramamj, int paramInt)
/* 204:    */   {
/* 205:280 */     return 16777215;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public void a(ItemStack paramamj, World paramaqu, Entity paramwv, int paramInt, boolean paramBoolean) {}
/* 209:    */   
/* 210:    */   public void d(ItemStack paramamj, World paramaqu, EntityPlayer paramahd) {}
/* 211:    */   
/* 212:    */   public boolean f()
/* 213:    */   {
/* 214:290 */     return false;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public ano e(ItemStack paramamj)
/* 218:    */   {
/* 219:294 */     return ano.a;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public int d(ItemStack paramamj)
/* 223:    */   {
/* 224:298 */     return 0;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public void a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd, int paramInt) {}
/* 228:    */   
/* 229:    */   protected Item e(String paramString)
/* 230:    */   {
/* 231:305 */     this.k = paramString;
/* 232:306 */     return this;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public String j(ItemStack paramamj)
/* 236:    */   {
/* 237:310 */     return this.k;
/* 238:    */   }
/* 239:    */   
/* 240:    */   public boolean l(ItemStack paramamj)
/* 241:    */   {
/* 242:314 */     return j(paramamj) != null;
/* 243:    */   }
/* 244:    */   
/* 245:    */   public void a(ItemStack paramamj, EntityPlayer paramahd, List<String> paramList, boolean paramBoolean) {}
/* 246:    */   
/* 247:    */   public String a(ItemStack paramamj)
/* 248:    */   {
/* 249:321 */     return ("" + fi.a(new StringBuilder().append(k(paramamj)).append(".name").toString())).trim();
/* 250:    */   }
/* 251:    */   
/* 252:    */   public boolean f(ItemStack paramamj)
/* 253:    */   {
/* 254:325 */     if (paramamj.hasEnchantment()) {
/* 255:326 */       return true;
/* 256:    */     }
/* 257:328 */     return false;
/* 258:    */   }
/* 259:    */   
/* 260:    */   public amx g(ItemStack paramamj)
/* 261:    */   {
/* 262:332 */     if (paramamj.hasEnchantment()) {
/* 263:333 */       return amx.c;
/* 264:    */     }
/* 265:335 */     return amx.a;
/* 266:    */   }
/* 267:    */   
/* 268:    */   public boolean f_(ItemStack paramamj)
/* 269:    */   {
/* 270:339 */     return (getItemStackLimit() == 1) && (m());
/* 271:    */   }
/* 272:    */   
/* 273:    */   protected HitResult a(World paramaqu, EntityPlayer paramahd, boolean paramBoolean)
/* 274:    */   {
/* 275:343 */     float f1 = paramahd.lastPitch + (paramahd.pitch - paramahd.lastPitch);
/* 276:344 */     float f2 = paramahd.lastYaw + (paramahd.yaw - paramahd.lastYaw);
/* 277:    */     
/* 278:346 */     double d1 = paramahd.lastX + (paramahd.xPos - paramahd.lastX);
/* 279:347 */     double d2 = paramahd.lastY + (paramahd.yPos - paramahd.lastY) + paramahd.aR();
/* 280:348 */     double d3 = paramahd.lastZ + (paramahd.zPos - paramahd.lastZ);
/* 281:    */     
/* 282:350 */     Vec3 localbrw1 = new Vec3(d1, d2, d3);
/* 283:    */     
/* 284:352 */     float f3 = MathUtils.cos(-f2 * 0.01745329F - 3.141593F);
/* 285:353 */     float f4 = MathUtils.sin(-f2 * 0.01745329F - 3.141593F);
/* 286:354 */     float f5 = -MathUtils.cos(-f1 * 0.01745329F);
/* 287:355 */     float f6 = MathUtils.sin(-f1 * 0.01745329F);
/* 288:    */     
/* 289:357 */     float f7 = f4 * f5;
/* 290:358 */     float f8 = f6;
/* 291:359 */     float f9 = f3 * f5;
/* 292:    */     
/* 293:361 */     double d4 = 5.0D;
/* 294:362 */     Vec3 localbrw2 = localbrw1.b(f7 * d4, f8 * d4, f9 * d4);
/* 295:    */     
/* 296:364 */     return paramaqu.a(localbrw1, localbrw2, paramBoolean, !paramBoolean, false);
/* 297:    */   }
/* 298:    */   
/* 299:    */   public int getItemEnchantability()
/* 300:    */   {
/* 301:368 */     return 0;
/* 302:    */   }
/* 303:    */   
/* 304:    */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 305:    */   {
/* 306:372 */     paramList.add(new ItemStack(paramalq, 1, 0));
/* 307:    */   }
/* 308:    */   
/* 309:    */   public CreativeTabs getCreativeTab()
/* 310:    */   {
/* 311:376 */     return this.creativeTab;
/* 312:    */   }
/* 313:    */   
/* 314:    */   public Item setTabToDisplayOn(CreativeTabs paramakf)
/* 315:    */   {
/* 316:380 */     this.creativeTab = paramakf;
/* 317:381 */     return this;
/* 318:    */   }
/* 319:    */   
/* 320:    */   public boolean s()
/* 321:    */   {
/* 322:385 */     return false;
/* 323:    */   }
/* 324:    */   
/* 325:    */   public boolean a(ItemStack paramamj1, ItemStack paramamj2)
/* 326:    */   {
/* 327:389 */     return false;
/* 328:    */   }
/* 329:    */   
/* 330:    */   public Multimap<String,ya> i()
/* 331:    */   {
/* 332:393 */     return HashMultimap.create();
/* 333:    */   }
/* 334:    */   
/* 335:    */   public static void t()
/* 336:    */   {
/* 337:399 */     a(BlockList.stone, new amr(BlockList.stone, BlockList.stone, new alr()).b("stone"));
/* 338:    */     
/* 339:    */ 
/* 340:    */ 
/* 341:    */ 
/* 342:    */ 
/* 343:    */ 
/* 344:406 */     a(BlockList.grass, new ann(BlockList.grass, false));
/* 345:407 */     a(BlockList.dirt, new amr(BlockList.dirt, BlockList.dirt, new ama()).b("dirt"));
/* 346:    */     
/* 347:    */ 
/* 348:    */ 
/* 349:    */ 
/* 350:    */ 
/* 351:    */ 
/* 352:414 */     c(BlockList.cobblestone);
/* 353:415 */     a(BlockList.planks, new amr(BlockList.planks, BlockList.planks, new amb()).b("wood"));
/* 354:    */     
/* 355:    */ 
/* 356:    */ 
/* 357:    */ 
/* 358:    */ 
/* 359:    */ 
/* 360:422 */     a(BlockList.sapling, new amr(BlockList.sapling, BlockList.sapling, new amc()).b("sapling"));
/* 361:    */     
/* 362:    */ 
/* 363:    */ 
/* 364:    */ 
/* 365:    */ 
/* 366:    */ 
/* 367:429 */     c(BlockList.bedrock);
/* 368:430 */     a(BlockList.sand, new amr(BlockList.sand, BlockList.sand, new amd()).b("sand"));
/* 369:    */     
/* 370:    */ 
/* 371:    */ 
/* 372:    */ 
/* 373:    */ 
/* 374:    */ 
/* 375:437 */     c(BlockList.gravel);
/* 376:438 */     c(BlockList.goldOre);
/* 377:439 */     c(BlockList.ironOre);
/* 378:440 */     c(BlockList.coalOre);
/* 379:441 */     a(BlockList.log, new amr(BlockList.log, BlockList.log, new ame()).b("log"));
/* 380:    */     
/* 381:    */ 
/* 382:    */ 
/* 383:    */ 
/* 384:    */ 
/* 385:    */ 
/* 386:448 */     a(BlockList.log2, new amr(BlockList.log2, BlockList.log2, new amf()).b("log"));
/* 387:    */     
/* 388:    */ 
/* 389:    */ 
/* 390:    */ 
/* 391:    */ 
/* 392:    */ 
/* 393:455 */     a(BlockList.leaves, new amm(BlockList.leaves).b("leaves"));
/* 394:456 */     a(BlockList.leaves2, new amm(BlockList.leaves2).b("leaves"));
/* 395:457 */     a(BlockList.v, new amr(BlockList.v, BlockList.v, new amg()).b("sponge"));
/* 396:    */     
/* 397:    */ 
/* 398:    */ 
/* 399:    */ 
/* 400:    */ 
/* 401:    */ 
/* 402:464 */     c(BlockList.w);
/* 403:465 */     c(BlockList.lapisOre);
/* 404:466 */     c(BlockList.y);
/* 405:467 */     c(BlockList.z);
/* 406:468 */     a(BlockList.A, new amr(BlockList.A, BlockList.A, new amh()).b("sandStone"));
/* 407:    */     
/* 408:    */ 
/* 409:    */ 
/* 410:    */ 
/* 411:    */ 
/* 412:    */ 
/* 413:475 */     c(BlockList.B);
/* 414:476 */     c(BlockList.D);
/* 415:477 */     c(BlockList.detector_rail);
/* 416:478 */     a(BlockList.F, new amv(BlockList.F));
/* 417:479 */     c(BlockList.web);
/* 418:480 */     a(BlockList.tallgrass, new ann(BlockList.tallgrass, true).a(new String[] { "shrub", "grass", "fern" }));
/* 419:481 */     c(BlockList.deadbush);
/* 420:482 */     a(BlockList.J, new amv(BlockList.J));
/* 421:483 */     a(BlockList.wool, new akx(BlockList.wool).b("cloth"));
/* 422:484 */     a(BlockList.yellowFlower, new amr(BlockList.yellowFlower, BlockList.yellowFlower, new als()).b("flower"));
/* 423:    */     
/* 424:    */ 
/* 425:    */ 
/* 426:    */ 
/* 427:    */ 
/* 428:    */ 
/* 429:491 */     a(BlockList.redFlower, new amr(BlockList.redFlower, BlockList.redFlower, new alt()).b("rose"));
/* 430:    */     
/* 431:    */ 
/* 432:    */ 
/* 433:    */ 
/* 434:    */ 
/* 435:    */ 
/* 436:498 */     c(BlockList.brownMushroom);
/* 437:499 */     c(BlockList.redMushroom);
/* 438:500 */     c(BlockList.R);
/* 439:501 */     c(BlockList.S);
/* 440:502 */     a(BlockList.U, new ani(BlockList.U, BlockList.U, BlockList.T).b("stoneSlab"));
/* 441:503 */     c(BlockList.V);
/* 442:504 */     c(BlockList.W);
/* 443:505 */     c(BlockList.bookshelf);
/* 444:506 */     c(BlockList.Y);
/* 445:507 */     c(BlockList.obsidian);
/* 446:508 */     c(BlockList.torch);
/* 447:509 */     c(BlockList.mobSpawner);
/* 448:510 */     c(BlockList.ad);
/* 449:511 */     c(BlockList.ae);
/* 450:512 */     c(BlockList.diamondOre);
/* 451:513 */     c(BlockList.diamondBlock);
/* 452:514 */     c(BlockList.ai);
/* 453:515 */     c(BlockList.ak);
/* 454:516 */     c(BlockList.al);
/* 455:517 */     c(BlockList.am);
/* 456:518 */     c(BlockList.au);
/* 457:519 */     c(BlockList.av);
/* 458:520 */     c(BlockList.aw);
/* 459:521 */     c(BlockList.ay);
/* 460:522 */     c(BlockList.az);
/* 461:523 */     c(BlockList.aB);
/* 462:524 */     c(BlockList.redstoneOre);
/* 463:525 */     c(BlockList.aF);
/* 464:526 */     c(BlockList.aG);
/* 465:527 */     a(BlockList.aH, new anj(BlockList.aH));
/* 466:528 */     c(BlockList.aI);
/* 467:529 */     c(BlockList.aJ);
/* 468:530 */     c(BlockList.cactus);
/* 469:531 */     c(BlockList.aL);
/* 470:532 */     c(BlockList.aN);
/* 471:533 */     c(BlockList.fence);
/* 472:534 */     c(BlockList.aP);
/* 473:535 */     c(BlockList.aQ);
/* 474:536 */     c(BlockList.aR);
/* 475:537 */     c(BlockList.darkOakFence);
/* 476:538 */     c(BlockList.aT);
/* 477:539 */     c(BlockList.pumpkin);
/* 478:540 */     c(BlockList.netherrack);
/* 479:541 */     c(BlockList.aW);
/* 480:542 */     c(BlockList.aX);
/* 481:543 */     c(BlockList.aZ);
/* 482:544 */     c(BlockList.bd);
/* 483:545 */     a(BlockList.monsterEgg, new amr(BlockList.monsterEgg, BlockList.monsterEgg, new alu()).b("monsterStoneEgg"));
/* 484:    */     
/* 485:    */ 
/* 486:    */ 
/* 487:    */ 
/* 488:    */ 
/* 489:    */ 
/* 490:552 */     a(BlockList.bf, new amr(BlockList.bf, BlockList.bf, new alv()).b("stonebricksmooth"));
/* 491:    */     
/* 492:    */ 
/* 493:    */ 
/* 494:    */ 
/* 495:    */ 
/* 496:    */ 
/* 497:559 */     c(BlockList.bg);
/* 498:560 */     c(BlockList.bh);
/* 499:561 */     c(BlockList.bi);
/* 500:562 */     c(BlockList.bj);
/* 501:563 */     c(BlockList.bk);
/* 502:564 */     a(BlockList.vine, new ann(BlockList.vine, false));
/* 503:565 */     c(BlockList.bo);
/* 504:566 */     c(BlockList.bp);
/* 505:567 */     c(BlockList.bq);
/* 506:568 */     c(BlockList.br);
/* 507:569 */     c(BlockList.bs);
/* 508:570 */     c(BlockList.bt);
/* 509:571 */     c(BlockList.bu);
/* 510:572 */     c(BlockList.bv);
/* 511:573 */     c(BlockList.bw);
/* 512:574 */     a(BlockList.waterLily, new anp(BlockList.waterLily));
/* 513:575 */     c(BlockList.by);
/* 514:576 */     c(BlockList.bz);
/* 515:577 */     c(BlockList.bA);
/* 516:578 */     c(BlockList.bC);
/* 517:579 */     c(BlockList.endPortalFrame);
/* 518:580 */     c(BlockList.bH);
/* 519:581 */     c(BlockList.dragonEgg);
/* 520:582 */     c(BlockList.bJ);
/* 521:583 */     a(BlockList.bM, new ani(BlockList.bM, BlockList.bM, BlockList.bL).b("woodSlab"));
/* 522:584 */     c(BlockList.bO);
/* 523:585 */     c(BlockList.bP);
/* 524:586 */     c(BlockList.bQ);
/* 525:587 */     c(BlockList.bR);
/* 526:588 */     c(BlockList.emeraldBlock);
/* 527:589 */     c(BlockList.bU);
/* 528:590 */     c(BlockList.bV);
/* 529:591 */     c(BlockList.bW);
/* 530:592 */     c(BlockList.bX);
/* 531:593 */     c(BlockList.bY);
/* 532:594 */     a(BlockList.bZ, new amr(BlockList.bZ, BlockList.bZ, new alw()).b("cobbleWall"));
/* 533:    */     
/* 534:    */ 
/* 535:    */ 
/* 536:    */ 
/* 537:    */ 
/* 538:    */ 
/* 539:601 */     c(BlockList.cd);
/* 540:602 */     a(BlockList.cf, new ajm(BlockList.cf).b("anvil"));
/* 541:603 */     c(BlockList.cg);
/* 542:604 */     c(BlockList.ch);
/* 543:605 */     c(BlockList.ci);
/* 544:606 */     c(BlockList.cl);
/* 545:607 */     c(BlockList.cn);
/* 546:608 */     c(BlockList.quartzOre);
/* 547:609 */     c(BlockList.cp);
/* 548:610 */     a(BlockList.cq, new amr(BlockList.cq, BlockList.cq, new String[] { "default", "chiseled", "lines" }).b("quartzBlock"));
/* 549:611 */     c(BlockList.cr);
/* 550:612 */     c(BlockList.activatorRail);
/* 551:613 */     c(BlockList.ct);
/* 552:614 */     a(BlockList.cu, new akx(BlockList.cu).b("clayHardenedStained"));
/* 553:615 */     c(BlockList.barrier);
/* 554:616 */     c(BlockList.cw);
/* 555:617 */     c(BlockList.cx);
/* 556:618 */     a(BlockList.cy, new akx(BlockList.cy).b("woolCarpet"));
/* 557:619 */     c(BlockList.cz);
/* 558:620 */     c(BlockList.cA);
/* 559:621 */     c(BlockList.cB);
/* 560:622 */     c(BlockList.cC);
/* 561:623 */     c(BlockList.cD);
/* 562:624 */     c(BlockList.cE);
/* 563:625 */     a(BlockList.cF, new aku(BlockList.cF, BlockList.cF, new alx()).b("doublePlant"));
/* 564:    */     
/* 565:    */ 
/* 566:    */ 
/* 567:    */ 
/* 568:    */ 
/* 569:    */ 
/* 570:632 */     a(BlockList.cG, new akx(BlockList.cG).b("stainedGlass"));
/* 571:633 */     a(BlockList.stained_glass_pane, new akx(BlockList.stained_glass_pane).b("stainedGlassPane"));
/* 572:634 */     a(BlockList.cI, new amr(BlockList.cI, BlockList.cI, new aly()).b("prismarine"));
/* 573:    */     
/* 574:    */ 
/* 575:    */ 
/* 576:    */ 
/* 577:    */ 
/* 578:    */ 
/* 579:641 */     c(BlockList.cJ);
/* 580:642 */     a(BlockList.cM, new amr(BlockList.cM, BlockList.cM, new alz()).b("redSandStone"));
/* 581:    */     
/* 582:    */ 
/* 583:    */ 
/* 584:    */ 
/* 585:    */ 
/* 586:    */ 
/* 587:649 */     c(BlockList.cN);
/* 588:650 */     a(BlockList.cP, new ani(BlockList.cP, BlockList.cP, BlockList.cO).b("stoneSlab2"));
/* 589:    */     
/* 590:    */ 
/* 591:653 */     a(256, "iron_shovel", new ItemShovel(EnumToolMaterial.IRON).setID("shovelIron"));
/* 592:654 */     a(257, "iron_pickaxe", new ItemPickaxe(EnumToolMaterial.IRON).setID("pickaxeIron"));
/* 593:655 */     a(258, "iron_axe", new ItemAxe(EnumToolMaterial.IRON).setID("hatchetIron"));
/* 594:656 */     a(259, "flint_and_steel", new alk().setID("flintAndSteel"));
/* 595:657 */     a(260, "apple", new all(4, 0.3F, false).setID("apple"));
/* 596:658 */     a(261, "bow", new ajz().setID("bow"));
/* 597:659 */     a(262, "arrow", new Item().setID("arrow").setTabToDisplayOn(CreativeTabs.tabCombat));
/* 598:660 */     a(263, "coal", new akd().setID("coal"));
/* 599:661 */     a(264, "diamond", new Item().setID("diamond").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 600:662 */     a(265, "iron_ingot", new Item().setID("ingotIron").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 601:663 */     a(266, "gold_ingot", new Item().setID("ingotGold").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 602:664 */     a(267, "iron_sword", new ItemSword(EnumToolMaterial.IRON).setID("swordIron"));
/* 603:665 */     a(268, "wooden_sword", new ItemSword(EnumToolMaterial.WOOD).setID("swordWood"));
/* 604:666 */     a(269, "wooden_shovel", new ItemShovel(EnumToolMaterial.WOOD).setID("shovelWood"));
/* 605:667 */     a(270, "wooden_pickaxe", new ItemPickaxe(EnumToolMaterial.WOOD).setID("pickaxeWood"));
/* 606:668 */     a(271, "wooden_axe", new ItemAxe(EnumToolMaterial.WOOD).setID("hatchetWood"));
/* 607:669 */     a(272, "stone_sword", new ItemSword(EnumToolMaterial.STONE).setID("swordStone"));
/* 608:670 */     a(273, "stone_shovel", new ItemShovel(EnumToolMaterial.STONE).setID("shovelStone"));
/* 609:671 */     a(274, "stone_pickaxe", new ItemPickaxe(EnumToolMaterial.STONE).setID("pickaxeStone"));
/* 610:672 */     a(275, "stone_axe", new ItemAxe(EnumToolMaterial.STONE).setID("hatchetStone"));
/* 611:673 */     a(276, "diamond_sword", new ItemSword(EnumToolMaterial.DIAMOND).setID("swordDiamond"));
/* 612:674 */     a(277, "diamond_shovel", new ItemShovel(EnumToolMaterial.DIAMOND).setID("shovelDiamond"));
/* 613:675 */     a(278, "diamond_pickaxe", new ItemPickaxe(EnumToolMaterial.DIAMOND).setID("pickaxeDiamond"));
/* 614:676 */     a(279, "diamond_axe", new ItemAxe(EnumToolMaterial.DIAMOND).setID("hatchetDiamond"));
/* 615:677 */     a(280, "stick", new Item().n().setID("stick").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 616:678 */     a(281, "bowl", new Item().setID("bowl").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 617:679 */     a(282, "mushroom_stew", new aka(6).setID("mushroomStew"));
/* 618:680 */     a(283, "golden_sword", new ItemSword(EnumToolMaterial.GOLD).setID("swordGold"));
/* 619:681 */     a(284, "golden_shovel", new ItemShovel(EnumToolMaterial.GOLD).setID("shovelGold"));
/* 620:682 */     a(285, "golden_pickaxe", new ItemPickaxe(EnumToolMaterial.GOLD).setID("pickaxeGold"));
/* 621:683 */     a(286, "golden_axe", new ItemAxe(EnumToolMaterial.GOLD).setID("hatchetGold"));
/* 622:684 */     a(287, "string", new ajv(BlockList.tripwire).setID("string").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 623:685 */     a(288, "feather", new Item().setID("feather").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 624:686 */     a(289, "gunpowder", new Item().setID("sulphur").e(ans.k).setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 625:687 */     a(290, "wooden_hoe", new alo(EnumToolMaterial.WOOD).setID("hoeWood"));
/* 626:688 */     a(291, "stone_hoe", new alo(EnumToolMaterial.STONE).setID("hoeStone"));
/* 627:689 */     a(292, "iron_hoe", new alo(EnumToolMaterial.IRON).setID("hoeIron"));
/* 628:690 */     a(293, "diamond_hoe", new alo(EnumToolMaterial.DIAMOND).setID("hoeDiamond"));
/* 629:691 */     a(294, "golden_hoe", new alo(EnumToolMaterial.GOLD).setID("hoeGold"));
/* 630:692 */     a(295, "wheat_seeds", new anc(BlockList.aj, BlockList.ak).setID("seeds"));
/* 631:693 */     a(296, "wheat", new Item().setID("wheat").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 632:694 */     a(297, "bread", new all(5, 0.6F, false).setID("bread"));
/* 633:695 */     a(298, "leather_helmet", new ajn(EnumArmorMaterial.LEATHER, 0, 0).setID("helmetCloth"));
/* 634:696 */     a(299, "leather_chestplate", new ajn(EnumArmorMaterial.LEATHER, 0, 1).setID("chestplateCloth"));
/* 635:697 */     a(300, "leather_leggings", new ajn(EnumArmorMaterial.LEATHER, 0, 2).setID("leggingsCloth"));
/* 636:698 */     a(301, "leather_boots", new ajn(EnumArmorMaterial.LEATHER, 0, 3).setID("bootsCloth"));
/* 637:699 */     a(302, "chainmail_helmet", new ajn(EnumArmorMaterial.CHAIN, 1, 0).setID("helmetChain"));
/* 638:700 */     a(303, "chainmail_chestplate", new ajn(EnumArmorMaterial.CHAIN, 1, 1).setID("chestplateChain"));
/* 639:701 */     a(304, "chainmail_leggings", new ajn(EnumArmorMaterial.CHAIN, 1, 2).setID("leggingsChain"));
/* 640:702 */     a(305, "chainmail_boots", new ajn(EnumArmorMaterial.CHAIN, 1, 3).setID("bootsChain"));
/* 641:703 */     a(306, "iron_helmet", new ajn(EnumArmorMaterial.IRON, 2, 0).setID("helmetIron"));
/* 642:704 */     a(307, "iron_chestplate", new ajn(EnumArmorMaterial.IRON, 2, 1).setID("chestplateIron"));
/* 643:705 */     a(308, "iron_leggings", new ajn(EnumArmorMaterial.IRON, 2, 2).setID("leggingsIron"));
/* 644:706 */     a(309, "iron_boots", new ajn(EnumArmorMaterial.IRON, 2, 3).setID("bootsIron"));
/* 645:707 */     a(310, "diamond_helmet", new ajn(EnumArmorMaterial.e, 3, 0).setID("helmetDiamond"));
/* 646:708 */     a(311, "diamond_chestplate", new ajn(EnumArmorMaterial.e, 3, 1).setID("chestplateDiamond"));
/* 647:709 */     a(312, "diamond_leggings", new ajn(EnumArmorMaterial.e, 3, 2).setID("leggingsDiamond"));
/* 648:710 */     a(313, "diamond_boots", new ajn(EnumArmorMaterial.e, 3, 3).setID("bootsDiamond"));
/* 649:711 */     a(314, "golden_helmet", new ajn(EnumArmorMaterial.d, 4, 0).setID("helmetGold"));
/* 650:712 */     a(315, "golden_chestplate", new ajn(EnumArmorMaterial.d, 4, 1).setID("chestplateGold"));
/* 651:713 */     a(316, "golden_leggings", new ajn(EnumArmorMaterial.d, 4, 2).setID("leggingsGold"));
/* 652:714 */     a(317, "golden_boots", new ajn(EnumArmorMaterial.d, 4, 3).setID("bootsGold"));
/* 653:715 */     a(318, "flint", new Item().setID("flint").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 654:716 */     a(319, "porkchop", new all(3, 0.3F, true).setID("porkchopRaw"));
/* 655:717 */     a(320, "cooked_porkchop", new all(8, 0.8F, true).setID("porkchopCooked"));
/* 656:718 */     a(321, "painting", new ItemFrame(adm.class).setID("painting"));
/* 657:719 */     a(322, "golden_apple", new alm(4, 1.2F, false).h().a(Potion.l.id, 5, 1, 1.0F).setID("appleGold"));
/* 658:720 */     a(323, "sign", new anf().setID("sign"));
/* 659:721 */     a(324, "wooden_door", new akt(BlockList.ao).setID("doorOak"));
/* 660:722 */     Item localalq = new akb(BlockList.air).setID("bucket").setStackLimit(16);
/* 661:723 */     a(325, "bucket", localalq);
/* 662:724 */     a(326, "water_bucket", new akb(BlockList.i).setID("bucketWater").c(localalq));
/* 663:725 */     a(327, "lava_bucket", new akb(BlockList.k).setID("bucketLava").c(localalq));
/* 664:726 */     a(328, "minecart", new amp(EnumMinecartVariant.a).setID("minecart"));
/* 665:727 */     a(329, "saddle", new ana().setID("saddle"));
/* 666:728 */     a(330, "iron_door", new akt(BlockList.aA).setID("doorIron"));
/* 667:729 */     a(331, "redstone", new amz().setID("redstone").e(ans.i));
/* 668:730 */     a(332, "snowball", new ank().setID("snowball"));
/* 669:731 */     a(333, "boat", new ajw().setID("boat"));
/* 670:732 */     a(334, "leather", new Item().setID("leather").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 671:733 */     a(335, "milk_bucket", new amo().setID("milk").c(localalq));
/* 672:734 */     a(336, "brick", new Item().setID("brick").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 673:735 */     a(337, "clay_ball", new Item().setID("clay").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 674:736 */     a(338, "reeds", new ajv(BlockList.reeds).setID("reeds").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 675:737 */     a(339, "paper", new Item().setID("paper").setTabToDisplayOn(CreativeTabs.tabMisc));
/* 676:738 */     a(340, "book", new ajx().setID("book").setTabToDisplayOn(CreativeTabs.tabMisc));
/* 677:739 */     a(341, "slime_ball", new Item().setID("slimeball").setTabToDisplayOn(CreativeTabs.tabMisc));
/* 678:740 */     a(342, "chest_minecart", new amp(EnumMinecartVariant.b).setID("minecartChest"));
/* 679:741 */     a(343, "furnace_minecart", new amp(EnumMinecartVariant.c).setID("minecartFurnace"));
/* 680:742 */     a(344, "egg", new aky().setID("egg"));
/* 681:743 */     a(345, "compass", new Item().setID("compass").setTabToDisplayOn(CreativeTabs.tabTools));
/* 682:744 */     a(346, "fishing_rod", new ItemFishingRod().setID("fishingRod"));
/* 683:745 */     a(347, "clock", new Item().setID("clock").setTabToDisplayOn(CreativeTabs.tabTools));
/* 684:746 */     a(348, "glowstone_dust", new Item().setID("yellowDust").e(ans.j).setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 685:747 */     a(349, "fish", new alh(false).setID("fish").a(true));
/* 686:748 */     a(350, "cooked_fish", new alh(true).setID("fish").a(true));
/* 687:749 */     a(351, "dye", new akw().setID("dyePowder"));
/* 688:750 */     a(352, "bone", new Item().setID("bone").n().setTabToDisplayOn(CreativeTabs.tabMisc));
/* 689:751 */     a(353, "sugar", new Item().setID("sugar").e(ans.b).setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 690:752 */     a(354, "cake", new ajv(BlockList.ba).setStackLimit(1).setID("cake").setTabToDisplayOn(CreativeTabs.tabFood));
/* 691:753 */     a(355, "bed", new ajt().setStackLimit(1).setID("bed"));
/* 692:754 */     a(356, "repeater", new ajv(BlockList.bb).setID("diode").setTabToDisplayOn(CreativeTabs.tabRedstone));
/* 693:755 */     a(357, "cookie", new all(2, 0.1F, false).setID("cookie"));
/* 694:756 */     a(358, "filled_map", new ItemFilledMap().setID("map"));
/* 695:757 */     a(359, "shears", new and().setID("shears"));
/* 696:758 */     a(360, "melon", new all(2, 0.3F, false).setID("melon"));
/* 697:759 */     a(361, "pumpkin_seeds", new anc(BlockList.bl, BlockList.ak).setID("seeds_pumpkin"));
/* 698:760 */     a(362, "melon_seeds", new anc(BlockList.bm, BlockList.ak).setID("seeds_melon"));
/* 699:761 */     a(363, "beef", new all(3, 0.3F, true).setID("beefRaw"));
/* 700:762 */     a(364, "cooked_beef", new all(8, 0.8F, true).setID("beefCooked"));
/* 701:763 */     a(365, "chicken", new all(2, 0.3F, true).a(Potion.s.id, 30, 0, 0.3F).setID("chickenRaw"));
/* 702:764 */     a(366, "cooked_chicken", new all(6, 0.6F, true).setID("chickenCooked"));
/* 703:765 */     a(367, "rotten_flesh", new all(4, 0.1F, true).a(Potion.s.id, 30, 0, 0.8F).setID("rottenFlesh"));
/* 704:766 */     a(368, "ender_pearl", new alc().setID("enderPearl"));
/* 705:767 */     a(369, "blaze_rod", new Item().setID("blazeRod").setTabToDisplayOn(CreativeTabs.tabMaterials).n());
/* 706:768 */     a(370, "ghast_tear", new Item().setID("ghastTear").e(ans.c).setTabToDisplayOn(CreativeTabs.tabBrewing));
/* 707:769 */     a(371, "gold_nugget", new Item().setID("goldNugget").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 708:770 */     a(372, "nether_wart", new anc(BlockList.bB, BlockList.aW).setID("netherStalkSeeds").e("+4"));
/* 709:771 */     a(373, "potion", new ItemPotion().setID("potion"));
/* 710:772 */     a(374, "glass_bottle", new ajy().setID("glassBottle"));
/* 711:773 */     a(375, "spider_eye", new all(2, 0.8F, false).a(Potion.u.id, 5, 0, 1.0F).setID("spiderEye").e(ans.d));
/* 712:774 */     a(376, "fermented_spider_eye", new Item().setID("fermentedSpiderEye").e(ans.e).setTabToDisplayOn(CreativeTabs.tabBrewing));
/* 713:775 */     a(377, "blaze_powder", new Item().setID("blazePowder").e(ans.g).setTabToDisplayOn(CreativeTabs.tabBrewing));
/* 714:776 */     a(378, "magma_cream", new Item().setID("magmaCream").e(ans.h).setTabToDisplayOn(CreativeTabs.tabBrewing));
/* 715:777 */     a(379, "brewing_stand", new ajv(BlockList.bD).setID("brewingStand").setTabToDisplayOn(CreativeTabs.tabBrewing));
/* 716:778 */     a(380, "cauldron", new ajv(BlockList.bE).setID("cauldron").setTabToDisplayOn(CreativeTabs.tabBrewing));
/* 717:779 */     a(381, "ender_eye", new ItemEnderEye().setID("eyeOfEnder"));
/* 718:780 */     a(382, "speckled_melon", new Item().setID("speckledMelon").e(ans.f).setTabToDisplayOn(CreativeTabs.tabBrewing));
/* 719:781 */     a(383, "spawn_egg", new anl().setID("monsterPlacer"));
/* 720:782 */     a(384, "experience_bottle", new ald().setID("expBottle"));
/* 721:783 */     a(385, "fire_charge", new ale().setID("fireball"));
/* 722:784 */     a(386, "writable_book", new anq().setID("writingBook").setTabToDisplayOn(CreativeTabs.tabMisc));
/* 723:785 */     a(387, "written_book", new anr().setID("writtenBook").setStackLimit(16));
/* 724:786 */     a(388, "emerald", new Item().setID("emerald").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 725:787 */     a(389, "item_frame", new ItemFrame(EntityItemFrame.class).setID("frame"));
/* 726:788 */     a(390, "flower_pot", new ajv(BlockList.ca).setID("flowerPot").setTabToDisplayOn(CreativeTabs.tabDeco));
/* 727:789 */     a(391, "carrot", new anb(3, 0.6F, BlockList.cb, BlockList.ak).setID("carrots"));
/* 728:790 */     a(392, "potato", new anb(1, 0.3F, BlockList.cc, BlockList.ak).setID("potato"));
/* 729:791 */     a(393, "baked_potato", new all(5, 0.6F, false).setID("potatoBaked"));
/* 730:792 */     a(394, "poisonous_potato", new all(2, 0.3F, false).a(Potion.u.id, 5, 0, 0.6F).setID("potatoPoisonous"));
/* 731:793 */     a(395, "map", new akz().setID("emptyMap"));
/* 732:794 */     a(396, "golden_carrot", new all(6, 1.2F, false).setID("carrotGolden").e(ans.l).setTabToDisplayOn(CreativeTabs.tabBrewing));
/* 733:795 */     a(397, "skull", new anh().setID("skull"));
/* 734:796 */     a(398, "carrot_on_a_stick", new akc().setID("carrotOnAStick"));
/* 735:797 */     a(399, "nether_star", new ang().setID("netherStar").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 736:798 */     a(400, "pumpkin_pie", new all(8, 0.3F, false).setID("pumpkinPie").setTabToDisplayOn(CreativeTabs.tabFood));
/* 737:799 */     a(401, "fireworks", new alg().setID("fireworks"));
/* 738:800 */     a(402, "firework_charge", new alf().setID("fireworksCharge").setTabToDisplayOn(CreativeTabs.tabMisc));
/* 739:801 */     a(403, "enchanted_book", new ala().setStackLimit(1).setID("enchantedBook"));
/* 740:802 */     a(404, "comparator", new ajv(BlockList.cj).setID("comparator").setTabToDisplayOn(CreativeTabs.tabRedstone));
/* 741:803 */     a(405, "netherbrick", new Item().setID("netherbrick").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 742:804 */     a(406, "quartz", new Item().setID("netherquartz").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 743:805 */     a(407, "tnt_minecart", new amp(EnumMinecartVariant.d).setID("minecartTnt"));
/* 744:806 */     a(408, "hopper_minecart", new amp(EnumMinecartVariant.f).setID("minecartHopper"));
/* 745:807 */     a(409, "prismarine_shard", new Item().setID("prismarineShard").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 746:808 */     a(410, "prismarine_crystals", new Item().setID("prismarineCrystals").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 747:809 */     a(411, "rabbit", new all(3, 0.3F, true).setID("rabbitRaw"));
/* 748:810 */     a(412, "cooked_rabbit", new all(5, 0.6F, true).setID("rabbitCooked"));
/* 749:811 */     a(413, "rabbit_stew", new aka(10).setID("rabbitStew"));
/* 750:812 */     a(414, "rabbit_foot", new Item().setID("rabbitFoot").e(ans.n).setTabToDisplayOn(CreativeTabs.tabBrewing));
/* 751:813 */     a(415, "rabbit_hide", new Item().setID("rabbitHide").setTabToDisplayOn(CreativeTabs.tabMaterials));
/* 752:814 */     a(416, "armor_stand", new ajq().setID("armorStand").setStackLimit(16));
/* 753:815 */     a(417, "iron_horse_armor", new Item().setID("horsearmormetal").setStackLimit(1).setTabToDisplayOn(CreativeTabs.tabMisc));
/* 754:816 */     a(418, "golden_horse_armor", new Item().setID("horsearmorgold").setStackLimit(1).setTabToDisplayOn(CreativeTabs.tabMisc));
/* 755:817 */     a(419, "diamond_horse_armor", new Item().setID("horsearmordiamond").setStackLimit(1).setTabToDisplayOn(CreativeTabs.tabMisc));
/* 756:818 */     a(420, "lead", new aml().setID("leash"));
/* 757:819 */     a(421, "name_tag", new amt().setID("nameTag"));
/* 758:820 */     a(422, "command_block_minecart", new amp(EnumMinecartVariant.g).setID("minecartCommandBlock").setTabToDisplayOn(null));
/* 759:821 */     a(423, "mutton", new all(2, 0.3F, true).setID("muttonRaw"));
/* 760:822 */     a(424, "cooked_mutton", new all(6, 0.8F, true).setID("muttonCooked"));
/* 761:823 */     a(425, "banner", new ajs().b("banner"));
/* 762:824 */     a(427, "spruce_door", new akt(BlockList.ap).setID("doorSpruce"));
/* 763:825 */     a(428, "birch_door", new akt(BlockList.aq).setID("doorBirch"));
/* 764:826 */     a(429, "jungle_door", new akt(BlockList.ar).setID("doorJungle"));
/* 765:827 */     a(430, "acacia_door", new akt(BlockList.as).setID("doorAcacia"));
/* 766:828 */     a(431, "dark_oak_door", new akt(BlockList.at).setID("doorDarkOak"));
/* 767:    */     
/* 768:    */ 
/* 769:831 */     a(2256, "record_13", new amy("13").setID("record"));
/* 770:832 */     a(2257, "record_cat", new amy("cat").setID("record"));
/* 771:833 */     a(2258, "record_blocks", new amy("blocks").setID("record"));
/* 772:834 */     a(2259, "record_chirp", new amy("chirp").setID("record"));
/* 773:835 */     a(2260, "record_far", new amy("far").setID("record"));
/* 774:836 */     a(2261, "record_mall", new amy("mall").setID("record"));
/* 775:837 */     a(2262, "record_mellohi", new amy("mellohi").setID("record"));
/* 776:838 */     a(2263, "record_stal", new amy("stal").setID("record"));
/* 777:839 */     a(2264, "record_strad", new amy("strad").setID("record"));
/* 778:840 */     a(2265, "record_ward", new amy("ward").setID("record"));
/* 779:841 */     a(2266, "record_11", new amy("11").setID("record"));
/* 780:842 */     a(2267, "record_wait", new amy("wait").setID("record"));
/* 781:    */   }
/* 782:    */   
/* 783:    */   private static void c(ProtoBlock paramatr)
/* 784:    */   {
/* 785:846 */     a(paramatr, new aju(paramatr));
/* 786:    */   }
/* 787:    */   
/* 788:    */   protected static void a(ProtoBlock paramatr, Item paramalq)
/* 789:    */   {
/* 790:850 */     a(ProtoBlock.a(paramatr), (oa)ProtoBlock.c.c(paramatr), paramalq);
/* 791:851 */     a.put(paramatr, paramalq);
/* 792:    */   }
/* 793:    */   
/* 794:    */   private static void a(int paramInt, String paramString, Item paramalq)
/* 795:    */   {
/* 796:855 */     a(paramInt, new oa(paramString), paramalq);
/* 797:    */   }
/* 798:    */   
/* 799:    */   private static void a(int paramInt, oa paramoa, Item paramalq)
/* 800:    */   {
/* 801:859 */     e.a(paramInt, paramoa, paramalq);
/* 802:    */   }
/* 803:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     alq
 * JD-Core Version:    0.7.0.1
 */
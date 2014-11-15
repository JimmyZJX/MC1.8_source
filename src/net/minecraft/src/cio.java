package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class cio
/*   4:    */   extends cil
/*   5:    */ {
/*   6:    */   public final cee a;
/*   7:    */   private final tz bH;
/*   8:    */   private double bI;
/*   9:    */   private double bJ;
/*  10:    */   private double bK;
/*  11:    */   private float bL;
/*  12:    */   private float bM;
/*  13:    */   private boolean bN;
/*  14:    */   private boolean bO;
/*  15:    */   private int bP;
/*  16:    */   private boolean bQ;
/*  17:    */   private String bR;
/*  18:    */   public cim b;
/*  19:    */   protected bsu c;
/*  20:    */   protected int d;
/*  21:    */   public int e;
/*  22:    */   public float f;
/*  23:    */   public float g;
/*  24:    */   public float h;
/*  25:    */   public float i;
/*  26:    */   private int bS;
/*  27:    */   private float bT;
/*  28:    */   public float bF;
/*  29:    */   public float bG;
/*  30:    */   
/*  31:    */   public cio(bsu parambsu, World paramaqu, cee paramcee, tz paramtz)
/*  32:    */   {
/*  33: 74 */     super(paramaqu, paramcee.e());
/*  34: 75 */     this.a = paramcee;
/*  35: 76 */     this.bH = paramtz;
/*  36: 77 */     this.c = parambsu;
/*  37: 78 */     this.dimension = 0;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public boolean a(DamageSource paramwh, float paramFloat)
/*  41:    */   {
/*  42: 83 */     return false;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void g(float paramFloat) {}
/*  46:    */   
/*  47:    */   public void mount(Entity paramwv)
/*  48:    */   {
/*  49: 93 */     super.mount(paramwv);
/*  50: 95 */     if ((paramwv instanceof adx)) {
/*  51: 96 */       this.c.U().a(new cxx(this, (adx)paramwv));
/*  52:    */     }
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void onUpdate()
/*  56:    */   {
/*  57:102 */     if (!this.world.e(new BlockPosition(this.xPos, 0.0D, this.zPos))) {
/*  58:103 */       return;
/*  59:    */     }
/*  60:105 */     super.onUpdate();
/*  61:107 */     if (av())
/*  62:    */     {
/*  63:108 */       this.a.a(new mj(this.yaw, this.pitch, this.C));
/*  64:109 */       this.a.a(new mp(this.aX, this.aY, this.b.c, this.b.d));
/*  65:    */     }
/*  66:    */     else
/*  67:    */     {
/*  68:111 */       p();
/*  69:    */     }
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void p()
/*  73:    */   {
/*  74:116 */     boolean bool1 = ax();
/*  75:117 */     if (bool1 != this.bO)
/*  76:    */     {
/*  77:118 */       if (bool1) {
/*  78:119 */         this.a.a(new mn(this, mo.d));
/*  79:    */       } else {
/*  80:121 */         this.a.a(new mn(this, mo.e));
/*  81:    */       }
/*  82:124 */       this.bO = bool1;
/*  83:    */     }
/*  84:127 */     boolean bool2 = aw();
/*  85:128 */     if (bool2 != this.bN)
/*  86:    */     {
/*  87:129 */       if (bool2) {
/*  88:130 */         this.a.a(new mn(this, mo.a));
/*  89:    */       } else {
/*  90:132 */         this.a.a(new mn(this, mo.b));
/*  91:    */       }
/*  92:135 */       this.bN = bool2;
/*  93:    */     }
/*  94:138 */     if (A())
/*  95:    */     {
/*  96:139 */       double d1 = this.xPos - this.bI;
/*  97:140 */       double d2 = getAABB().minY - this.bJ;
/*  98:141 */       double d3 = this.zPos - this.bK;
/*  99:    */       
/* 100:143 */       double d4 = this.yaw - this.bL;
/* 101:144 */       double d5 = this.pitch - this.bM;
/* 102:    */       
/* 103:146 */       int j = (d1 * d1 + d2 * d2 + d3 * d3 > 0.0009D) || (this.bP >= 20) ? 1 : 0;
/* 104:147 */       int k = (d4 != 0.0D) || (d5 != 0.0D) ? 1 : 0;
/* 105:149 */       if (this.vehicle == null)
/* 106:    */       {
/* 107:150 */         if ((j != 0) && (k != 0)) {
/* 108:151 */           this.a.a(new mi(this.xPos, getAABB().minY, this.zPos, this.yaw, this.pitch, this.C));
/* 109:152 */         } else if (j != 0) {
/* 110:153 */           this.a.a(new mh(this.xPos, getAABB().minY, this.zPos, this.C));
/* 111:154 */         } else if (k != 0) {
/* 112:155 */           this.a.a(new mj(this.yaw, this.pitch, this.C));
/* 113:    */         } else {
/* 114:157 */           this.a.a(new mg(this.C));
/* 115:    */         }
/* 116:    */       }
/* 117:    */       else
/* 118:    */       {
/* 119:160 */         this.a.a(new mi(this.xVelocity, -999.0D, this.zVelocity, this.yaw, this.pitch, this.C));
/* 120:161 */         j = 0;
/* 121:    */       }
/* 122:164 */       this.bP += 1;
/* 123:166 */       if (j != 0)
/* 124:    */       {
/* 125:167 */         this.bI = this.xPos;
/* 126:168 */         this.bJ = getAABB().minY;
/* 127:169 */         this.bK = this.zPos;
/* 128:170 */         this.bP = 0;
/* 129:    */       }
/* 130:172 */       if (k != 0)
/* 131:    */       {
/* 132:173 */         this.bL = this.yaw;
/* 133:174 */         this.bM = this.pitch;
/* 134:    */       }
/* 135:    */     }
/* 136:    */   }
/* 137:    */   
/* 138:    */   public EntityItem a(boolean paramBoolean)
/* 139:    */   {
/* 140:182 */     mm localmm = paramBoolean ? mm.d : mm.e;
/* 141:183 */     this.a.a(new ml(localmm, BlockPosition.a, EnumDirection.DOWN));
/* 142:184 */     return null;
/* 143:    */   }
/* 144:    */   
/* 145:    */   protected void a(EntityItem paramadw) {}
/* 146:    */   
/* 147:    */   public void e(String paramString)
/* 148:    */   {
/* 149:192 */     this.a.a(new lu(paramString));
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void bv()
/* 153:    */   {
/* 154:197 */     super.bv();
/* 155:198 */     this.a.a(new mv());
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void ca()
/* 159:    */   {
/* 160:203 */     this.a.a(new lv(lw.PERFORM_RESPAWN));
/* 161:    */   }
/* 162:    */   
/* 163:    */   protected void d(DamageSource paramwh, float paramFloat)
/* 164:    */   {
/* 165:208 */     if (b(paramwh)) {
/* 166:209 */       return;
/* 167:    */     }
/* 168:211 */     h(getHealth() - paramFloat);
/* 169:    */   }
/* 170:    */   
/* 171:    */   public void n()
/* 172:    */   {
/* 173:216 */     this.a.a(new mb(this.bi.d));
/* 174:217 */     q();
/* 175:    */   }
/* 176:    */   
/* 177:    */   public void q()
/* 178:    */   {
/* 179:222 */     this.bg.b((ItemStack)null);
/* 180:223 */     super.n();
/* 181:224 */     this.c.a((bxf)null);
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void m(float paramFloat)
/* 185:    */   {
/* 186:228 */     if (this.bQ)
/* 187:    */     {
/* 188:229 */       float f1 = getHealth() - paramFloat;
/* 189:230 */       if (f1 <= 0.0F)
/* 190:    */       {
/* 191:231 */         h(paramFloat);
/* 192:232 */         if (f1 < 0.0F) {
/* 193:233 */           this.Z = (this.aB / 2);
/* 194:    */         }
/* 195:    */       }
/* 196:    */       else
/* 197:    */       {
/* 198:236 */         this.aV = f1;
/* 199:237 */         h(getHealth());
/* 200:238 */         this.Z = this.aB;
/* 201:239 */         d(DamageSource.k, f1);
/* 202:240 */         this.hurtTime = (this.at = 10);
/* 203:    */       }
/* 204:    */     }
/* 205:    */     else
/* 206:    */     {
/* 207:243 */       h(paramFloat);
/* 208:244 */       this.bQ = true;
/* 209:    */     }
/* 210:    */   }
/* 211:    */   
/* 212:    */   public void a(tq paramtq, int paramInt)
/* 213:    */   {
/* 214:250 */     if (paramtq == null) {
/* 215:251 */       return;
/* 216:    */     }
/* 217:254 */     if (paramtq.f) {
/* 218:255 */       super.a(paramtq, paramInt);
/* 219:    */     }
/* 220:    */   }
/* 221:    */   
/* 222:    */   public void t()
/* 223:    */   {
/* 224:271 */     this.a.a(new mk(this.by));
/* 225:    */   }
/* 226:    */   
/* 227:    */   public boolean cb()
/* 228:    */   {
/* 229:276 */     return true;
/* 230:    */   }
/* 231:    */   
/* 232:    */   protected void r()
/* 233:    */   {
/* 234:280 */     this.a.a(new mn(this, mo.f, (int)(z() * 100.0F)));
/* 235:    */   }
/* 236:    */   
/* 237:    */   public void u()
/* 238:    */   {
/* 239:284 */     this.a.a(new mn(this, mo.g));
/* 240:    */   }
/* 241:    */   
/* 242:    */   public void f(String paramString)
/* 243:    */   {
/* 244:288 */     this.bR = paramString;
/* 245:    */   }
/* 246:    */   
/* 247:    */   public String w()
/* 248:    */   {
/* 249:292 */     return this.bR;
/* 250:    */   }
/* 251:    */   
/* 252:    */   public tz x()
/* 253:    */   {
/* 254:296 */     return this.bH;
/* 255:    */   }
/* 256:    */   
/* 257:    */   public void b(ho paramho)
/* 258:    */   {
/* 259:301 */     this.c.q.d().a(paramho);
/* 260:    */   }
/* 261:    */   
/* 262:    */   protected boolean j(double paramDouble1, double paramDouble2, double paramDouble3)
/* 263:    */   {
/* 264:306 */     if (this.T) {
/* 265:307 */       return false;
/* 266:    */     }
/* 267:310 */     BlockPosition localdt = new BlockPosition(paramDouble1, paramDouble2, paramDouble3);
/* 268:    */     
/* 269:312 */     double d1 = paramDouble1 - localdt.getX();
/* 270:313 */     double d2 = paramDouble3 - localdt.getZ();
/* 271:315 */     if (!d(localdt))
/* 272:    */     {
/* 273:316 */       int j = -1;
/* 274:317 */       double d3 = 9999.0D;
/* 275:318 */       if ((d(localdt.west())) && (d1 < d3))
/* 276:    */       {
/* 277:319 */         d3 = d1;
/* 278:320 */         j = 0;
/* 279:    */       }
/* 280:322 */       if ((d(localdt.east())) && (1.0D - d1 < d3))
/* 281:    */       {
/* 282:323 */         d3 = 1.0D - d1;
/* 283:324 */         j = 1;
/* 284:    */       }
/* 285:326 */       if ((d(localdt.north())) && (d2 < d3))
/* 286:    */       {
/* 287:327 */         d3 = d2;
/* 288:328 */         j = 4;
/* 289:    */       }
/* 290:330 */       if ((d(localdt.south())) && (1.0D - d2 < d3))
/* 291:    */       {
/* 292:331 */         d3 = 1.0D - d2;
/* 293:332 */         j = 5;
/* 294:    */       }
/* 295:335 */       float f1 = 0.1F;
/* 296:336 */       if (j == 0) {
/* 297:337 */         this.xVelocity = (-f1);
/* 298:    */       }
/* 299:339 */       if (j == 1) {
/* 300:340 */         this.xVelocity = f1;
/* 301:    */       }
/* 302:342 */       if (j == 4) {
/* 303:343 */         this.zVelocity = (-f1);
/* 304:    */       }
/* 305:345 */       if (j == 5) {
/* 306:346 */         this.zVelocity = f1;
/* 307:    */       }
/* 308:    */     }
/* 309:350 */     return false;
/* 310:    */   }
/* 311:    */   
/* 312:    */   private boolean d(BlockPosition paramdt)
/* 313:    */   {
/* 314:354 */     return (!this.world.getBlock(paramdt).getProto().blocksMovement()) && (!this.world.getBlock(paramdt.up()).getProto().blocksMovement());
/* 315:    */   }
/* 316:    */   
/* 317:    */   public void d(boolean paramBoolean)
/* 318:    */   {
/* 319:359 */     super.d(paramBoolean);
/* 320:360 */     this.e = (paramBoolean ? 600 : 0);
/* 321:    */   }
/* 322:    */   
/* 323:    */   public void a(float paramFloat, int paramInt1, int paramInt2)
/* 324:    */   {
/* 325:364 */     this.bB = paramFloat;
/* 326:365 */     this.bA = paramInt1;
/* 327:366 */     this.bz = paramInt2;
/* 328:    */   }
/* 329:    */   
/* 330:    */   public void a(ho paramho)
/* 331:    */   {
/* 332:371 */     this.c.q.d().a(paramho);
/* 333:    */   }
/* 334:    */   
/* 335:    */   public boolean a(int paramInt, String paramString)
/* 336:    */   {
/* 337:376 */     return paramInt <= 0;
/* 338:    */   }
/* 339:    */   
/* 340:    */   public BlockPosition c()
/* 341:    */   {
/* 342:381 */     return new BlockPosition(this.xPos + 0.5D, this.yPos + 0.5D, this.zPos + 0.5D);
/* 343:    */   }
/* 344:    */   
/* 345:    */   public void a(String paramString, float paramFloat1, float paramFloat2)
/* 346:    */   {
/* 347:386 */     this.world.a(this.xPos, this.yPos, this.zPos, paramString, paramFloat1, paramFloat2, false);
/* 348:    */   }
/* 349:    */   
/* 350:    */   public boolean bL()
/* 351:    */   {
/* 352:391 */     return true;
/* 353:    */   }
/* 354:    */   
/* 355:    */   public boolean y()
/* 356:    */   {
/* 357:395 */     return (this.vehicle != null) && ((this.vehicle instanceof EntityHorse)) && (((EntityHorse)this.vehicle).cE());
/* 358:    */   }
/* 359:    */   
/* 360:    */   public float z()
/* 361:    */   {
/* 362:399 */     return this.bT;
/* 363:    */   }
/* 364:    */   
/* 365:    */   public void a(bdj parambdj)
/* 366:    */   {
/* 367:404 */     this.c.a(new bzm(parambdj));
/* 368:    */   }
/* 369:    */   
/* 370:    */   public void a(aqf paramaqf)
/* 371:    */   {
/* 372:409 */     this.c.a(new byv(paramaqf));
/* 373:    */   }
/* 374:    */   
/* 375:    */   public void a(ItemStack paramamj)
/* 376:    */   {
/* 377:414 */     Item localalq = paramamj.getItem();
/* 378:416 */     if (localalq == ItemList.bM) {
/* 379:417 */       this.c.a(new bys(this, paramamj, true));
/* 380:    */     }
/* 381:    */   }
/* 382:    */   
/* 383:    */   public void a(vq paramvq)
/* 384:    */   {
/* 385:423 */     String str = (paramvq instanceof vv) ? ((vv)paramvq).k() : "minecraft:container";
/* 386:424 */     if ("minecraft:chest".equals(str)) {
/* 387:425 */       this.c.a(new byw(this.bg, paramvq));
/* 388:426 */     } else if ("minecraft:hopper".equals(str)) {
/* 389:427 */       this.c.a(new bzh(this.bg, paramvq));
/* 390:428 */     } else if ("minecraft:furnace".equals(str)) {
/* 391:429 */       this.c.a(new bzg(this.bg, paramvq));
/* 392:430 */     } else if ("minecraft:brewing_stand".equals(str)) {
/* 393:431 */       this.c.a(new byu(this.bg, paramvq));
/* 394:432 */     } else if ("minecraft:beacon".equals(str)) {
/* 395:433 */       this.c.a(new byn(this.bg, paramvq));
/* 396:434 */     } else if (("minecraft:dispenser".equals(str)) || ("minecraft:dropper".equals(str))) {
/* 397:435 */       this.c.a(new bzc(this.bg, paramvq));
/* 398:    */     } else {
/* 399:437 */       this.c.a(new byw(this.bg, paramvq));
/* 400:    */     }
/* 401:    */   }
/* 402:    */   
/* 403:    */   public void a(EntityHorse paramabt, vq paramvq)
/* 404:    */   {
/* 405:443 */     this.c.a(new bzi(this.bg, paramvq, paramabt));
/* 406:    */   }
/* 407:    */   
/* 408:    */   public void a(vv paramvv)
/* 409:    */   {
/* 410:448 */     String str = paramvv.k();
/* 411:449 */     if ("minecraft:crafting_table".equals(str)) {
/* 412:450 */       this.c.a(new byx(this.bg, this.world));
/* 413:451 */     } else if ("minecraft:enchanting_table".equals(str)) {
/* 414:452 */       this.c.a(new bzf(this.bg, this.world, paramvv));
/* 415:453 */     } else if ("minecraft:anvil".equals(str)) {
/* 416:454 */       this.c.a(new bym(this.bg, this.world));
/* 417:    */     }
/* 418:    */   }
/* 419:    */   
/* 420:    */   public void a(aqb paramaqb)
/* 421:    */   {
/* 422:460 */     this.c.a(new bzk(this.bg, paramaqb, this.world));
/* 423:    */   }
/* 424:    */   
/* 425:    */   public void b(Entity paramwv)
/* 426:    */   {
/* 427:465 */     this.c.j.a(paramwv, ew.j);
/* 428:    */   }
/* 429:    */   
/* 430:    */   public void c(Entity paramwv)
/* 431:    */   {
/* 432:470 */     this.c.j.a(paramwv, ew.k);
/* 433:    */   }
/* 434:    */   
/* 435:    */   public boolean aw()
/* 436:    */   {
/* 437:475 */     boolean j = this.b != null ? this.b.d : false;
/* 438:476 */     return j && (!this.bu);
/* 439:    */   }
/* 440:    */   
/* 441:    */   public void bJ()
/* 442:    */   {
/* 443:481 */     super.bJ();
/* 444:483 */     if (A())
/* 445:    */     {
/* 446:484 */       this.aX = this.b.a;
/* 447:485 */       this.aY = this.b.b;
/* 448:486 */       this.aW = this.b.c;
/* 449:487 */       this.h = this.f;
/* 450:488 */       this.i = this.g;
/* 451:489 */       this.g = ((float)(this.g + (this.pitch - this.g) * 0.5D));
/* 452:490 */       this.f = ((float)(this.f + (this.yaw - this.f) * 0.5D));
/* 453:    */     }
/* 454:    */   }
/* 455:    */   
/* 456:    */   protected boolean A()
/* 457:    */   {
/* 458:495 */     return this.c.aa() == this;
/* 459:    */   }
/* 460:    */   
/* 461:    */   public void m()
/* 462:    */   {
/* 463:500 */     if (this.e > 0)
/* 464:    */     {
/* 465:501 */       this.e -= 1;
/* 466:502 */       if (this.e == 0) {
/* 467:503 */         d(false);
/* 468:    */       }
/* 469:    */     }
/* 470:507 */     if (this.d > 0) {
/* 471:508 */       this.d -= 1;
/* 472:    */     }
/* 473:511 */     this.bG = this.bF;
/* 474:513 */     if (this.ak)
/* 475:    */     {
/* 476:514 */       if ((this.c.m != null) && (!this.c.m.d())) {
/* 477:515 */         this.c.a((bxf)null);
/* 478:    */       }
/* 479:518 */       if (this.bF == 0.0F) {
/* 480:519 */         this.c.U().a(cxy.a(new oa("portal.trigger"), this.random.nextFloat() * 0.4F + 0.8F));
/* 481:    */       }
/* 482:521 */       this.bF += 0.0125F;
/* 483:522 */       if (this.bF >= 1.0F) {
/* 484:523 */         this.bF = 1.0F;
/* 485:    */       }
/* 486:525 */       this.ak = false;
/* 487:    */     }
/* 488:526 */     else if ((a(Potion.nausea)) && (b(Potion.nausea).getDuration() > 60))
/* 489:    */     {
/* 490:527 */       this.bF += 0.006666667F;
/* 491:528 */       if (this.bF > 1.0F) {
/* 492:529 */         this.bF = 1.0F;
/* 493:    */       }
/* 494:    */     }
/* 495:    */     else
/* 496:    */     {
/* 497:532 */       if (this.bF > 0.0F) {
/* 498:533 */         this.bF -= 0.05F;
/* 499:    */       }
/* 500:535 */       if (this.bF < 0.0F) {
/* 501:536 */         this.bF = 0.0F;
/* 502:    */       }
/* 503:    */     }
/* 504:540 */     if (this.aj > 0) {
/* 505:541 */       this.aj -= 1;
/* 506:    */     }
/* 507:543 */     boolean bool1 = this.b.c;
/* 508:544 */     boolean bool2 = this.b.d;
/* 509:545 */     float f1 = 0.8F;
/* 510:546 */     int j = this.b.b >= f1 ? 1 : 0;
/* 511:    */     
/* 512:548 */     this.b.a();
/* 513:549 */     if ((bR()) && (!av()))
/* 514:    */     {
/* 515:550 */       this.b.a *= 0.2F;
/* 516:551 */       this.b.b *= 0.2F;
/* 517:552 */       this.d = 0;
/* 518:    */     }
/* 519:555 */     j(this.xPos - this.J * 0.35D, getAABB().minY + 0.5D, this.zPos + this.J * 0.35D);
/* 520:556 */     j(this.xPos - this.J * 0.35D, getAABB().minY + 0.5D, this.zPos - this.J * 0.35D);
/* 521:557 */     j(this.xPos + this.J * 0.35D, getAABB().minY + 0.5D, this.zPos - this.J * 0.35D);
/* 522:558 */     j(this.xPos + this.J * 0.35D, getAABB().minY + 0.5D, this.zPos + this.J * 0.35D);
/* 523:    */     
/* 524:560 */     int k = (ck().a() > 6.0F) || (this.by.c) ? 1 : 0;
/* 525:561 */     if ((this.C) && (!bool2) && (j == 0) && (this.b.b >= f1) && (!ax()) && (k != 0) && (!bR()) && (!a(Potion.blindness))) {
/* 526:562 */       if ((this.d > 0) || (this.c.t.af.d())) {
/* 527:563 */         d(true);
/* 528:    */       } else {
/* 529:565 */         this.d = 7;
/* 530:    */       }
/* 531:    */     }
/* 532:568 */     if ((!ax()) && (this.b.b >= f1) && (k != 0) && (!bR()) && (!a(Potion.blindness)) && (this.c.t.af.d())) {
/* 533:569 */       d(true);
/* 534:    */     }
/* 535:571 */     if ((ax()) && ((this.b.b < f1) || (this.D) || (k == 0))) {
/* 536:572 */       d(false);
/* 537:    */     }
/* 538:575 */     if (this.by.c) {
/* 539:576 */       if (this.c.c.k())
/* 540:    */       {
/* 541:577 */         if (!this.by.b)
/* 542:    */         {
/* 543:578 */           this.by.b = true;
/* 544:579 */           t();
/* 545:    */         }
/* 546:    */       }
/* 547:582 */       else if ((!bool1) && (this.b.c)) {
/* 548:583 */         if (this.bk == 0)
/* 549:    */         {
/* 550:584 */           this.bk = 7;
/* 551:    */         }
/* 552:    */         else
/* 553:    */         {
/* 554:586 */           this.by.b = (!this.by.b);
/* 555:587 */           t();
/* 556:588 */           this.bk = 0;
/* 557:    */         }
/* 558:    */       }
/* 559:    */     }
/* 560:594 */     if ((this.by.b) && (A()))
/* 561:    */     {
/* 562:595 */       if (this.b.d) {
/* 563:596 */         this.yVelocity -= this.by.a() * 3.0F;
/* 564:    */       }
/* 565:598 */       if (this.b.c) {
/* 566:599 */         this.yVelocity += this.by.a() * 3.0F;
/* 567:    */       }
/* 568:    */     }
/* 569:603 */     if (y())
/* 570:    */     {
/* 571:604 */       if (this.bS < 0)
/* 572:    */       {
/* 573:605 */         this.bS += 1;
/* 574:606 */         if (this.bS == 0) {
/* 575:608 */           this.bT = 0.0F;
/* 576:    */         }
/* 577:    */       }
/* 578:611 */       if ((bool1) && (!this.b.c))
/* 579:    */       {
/* 580:613 */         this.bS = -10;
/* 581:614 */         r();
/* 582:    */       }
/* 583:615 */       else if ((!bool1) && (this.b.c))
/* 584:    */       {
/* 585:617 */         this.bS = 0;
/* 586:618 */         this.bT = 0.0F;
/* 587:    */       }
/* 588:619 */       else if (bool1)
/* 589:    */       {
/* 590:621 */         this.bS += 1;
/* 591:622 */         if (this.bS < 10) {
/* 592:623 */           this.bT = (this.bS * 0.1F);
/* 593:    */         } else {
/* 594:625 */           this.bT = (0.8F + 2.0F / (this.bS - 9) * 0.1F);
/* 595:    */         }
/* 596:    */       }
/* 597:    */     }
/* 598:    */     else
/* 599:    */     {
/* 600:629 */       this.bT = 0.0F;
/* 601:    */     }
/* 602:632 */     super.m();
/* 603:633 */     if ((this.C) && (this.by.b) && (!this.c.c.k()))
/* 604:    */     {
/* 605:634 */       this.by.b = false;
/* 606:635 */       t();
/* 607:    */     }
/* 608:    */   }
/* 609:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cio
 * JD-Core Version:    0.7.0.1
 */
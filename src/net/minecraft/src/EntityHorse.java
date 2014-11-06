package net.minecraft.src;
/*    1:     */ import com.google.common.base.Predicate;
/*    2:     */ import java.util.List;
/*    5:     */ 
/*    6:     */ public class EntityHorse
/*    7:     */   extends EntityAnimal
/*    8:     */   implements vr
/*    9:     */ {
/*   10:  47 */   private static final Predicate<Entity> bq = new abu();
/*   11:  54 */   private static final xy br = new yg(null, "horse.jumpStrength", 0.7D, 0.0D, 2.0D).a("Jump Strength").a(true);
/*   12:  80 */   private static final String[] bs = { null, "textures/entity/horse/armor/horse_armor_iron.png", "textures/entity/horse/armor/horse_armor_gold.png", "textures/entity/horse/armor/horse_armor_diamond.png" };
/*   13:  83 */   private static final String[] bt = { "", "meo", "goo", "dio" };
/*   14:  86 */   private static final int[] bu = { 0, 5, 7, 11 };
/*   15: 104 */   private static final String[] bv = { "textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png" };
/*   16: 113 */   private static final String[] bw = { "hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb" };
/*   17: 123 */   private static final String[] bx = { null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png" };
/*   18: 130 */   private static final String[] by = { "", "wo_", "wmo", "wdo", "bdo" };
/*   19:     */   private int bz;
/*   20:     */   private int bA;
/*   21:     */   private int bB;
/*   22:     */   public int bk;
/*   23:     */   public int bm;
/*   24:     */   protected boolean bn;
/*   25:     */   private aic bC;
/*   26:     */   private boolean bD;
/*   27:     */   protected int bo;
/*   28:     */   protected float bp;
/*   29:     */   private boolean bE;
/*   30:     */   private float bF;
/*   31:     */   private float bG;
/*   32:     */   private float bH;
/*   33:     */   private float bI;
/*   34:     */   private float bJ;
/*   35:     */   private float bK;
/*   36:     */   private int bL;
/*   37:     */   private String bM;
/*   38:     */   
/*   39:     */   public EntityHorse(World paramaqu)
/*   40:     */   {
/*   41: 152 */     super(paramaqu);
/*   42: 153 */     a(1.4F, 1.6F);
/*   43: 154 */     this.ab = false;
/*   44: 155 */     o(false);
/*   45:     */     
/*   46: 157 */     ((aay)s()).a(true);
/*   47: 158 */     this.i.a(0, new yy(this));
/*   48: 159 */     this.i.a(1, new zu(this, 1.2D));
/*   49: 160 */     this.i.a(1, new aac(this, 1.2D));
/*   50: 161 */     this.i.a(2, new yt(this, 1.0D));
/*   51: 162 */     this.i.a(4, new za(this, 1.0D));
/*   52: 163 */     this.i.a(6, new zy(this, 0.7D));
/*   53: 164 */     this.i.a(7, new zh(this, EntityPlayer.class, 6.0F));
/*   54: 165 */     this.i.a(8, new zx(this));
/*   55:     */     
/*   56: 167 */     cY();
/*   57:     */   }
/*   58:     */   
/*   59:     */   protected void h()
/*   60:     */   {
/*   61: 172 */     super.h();
/*   62: 173 */     this.ac.a(16, Integer.valueOf(0));
/*   63: 174 */     this.ac.a(19, Byte.valueOf((byte)0));
/*   64: 175 */     this.ac.a(20, Integer.valueOf(0));
/*   65: 176 */     this.ac.a(21, String.valueOf(""));
/*   66: 177 */     this.ac.a(22, Integer.valueOf(0));
/*   67:     */   }
/*   68:     */   
/*   69:     */   public void r(int paramInt)
/*   70:     */   {
/*   71: 181 */     this.ac.b(19, Byte.valueOf((byte)paramInt));
/*   72: 182 */     da();
/*   73:     */   }
/*   74:     */   
/*   75:     */   public int cj()
/*   76:     */   {
/*   77: 186 */     return this.ac.a(19);
/*   78:     */   }
/*   79:     */   
/*   80:     */   public void s(int paramInt)
/*   81:     */   {
/*   82: 190 */     this.ac.b(20, Integer.valueOf(paramInt));
/*   83: 191 */     da();
/*   84:     */   }
/*   85:     */   
/*   86:     */   public int ck()
/*   87:     */   {
/*   88: 195 */     return this.ac.c(20);
/*   89:     */   }
/*   90:     */   
/*   91:     */   public String getName()
/*   92:     */   {
/*   93: 201 */     if (k_()) {
/*   94: 202 */       return aL();
/*   95:     */     }
/*   96: 204 */     int i = cj();
/*   97: 205 */     switch (i)
/*   98:     */     {
/*   99:     */     case 0: 
/*  100:     */     default: 
/*  101: 208 */       return fi.a("entity.horse.name");
/*  102:     */     case 1: 
/*  103: 210 */       return fi.a("entity.donkey.name");
/*  104:     */     case 2: 
/*  105: 212 */       return fi.a("entity.mule.name");
/*  106:     */     case 4: 
/*  107: 214 */       return fi.a("entity.skeletonhorse.name");
/*  108:     */     }
/*  109: 216 */     //return fi.a("entity.zombiehorse.name");
/*  110:     */   }
/*  111:     */   
/*  112:     */   private boolean w(int paramInt)
/*  113:     */   {
/*  114: 221 */     return (this.ac.c(16) & paramInt) != 0;
/*  115:     */   }
/*  116:     */   
/*  117:     */   private void c(int paramInt, boolean paramBoolean)
/*  118:     */   {
/*  119: 225 */     int i = this.ac.c(16);
/*  120: 226 */     if (paramBoolean) {
/*  121: 227 */       this.ac.b(16, Integer.valueOf(i | paramInt));
/*  122:     */     } else {
/*  123: 229 */       this.ac.b(16, Integer.valueOf(i & (paramInt ^ 0xFFFFFFFF)));
/*  124:     */     }
/*  125:     */   }
/*  126:     */   
/*  127:     */   public boolean cl()
/*  128:     */   {
/*  129: 234 */     return !i_();
/*  130:     */   }
/*  131:     */   
/*  132:     */   public boolean cm()
/*  133:     */   {
/*  134: 238 */     return w(2);
/*  135:     */   }
/*  136:     */   
/*  137:     */   public boolean cn()
/*  138:     */   {
/*  139: 242 */     return cl();
/*  140:     */   }
/*  141:     */   
/*  142:     */   public String cr()
/*  143:     */   {
/*  144: 246 */     return this.ac.e(21);
/*  145:     */   }
/*  146:     */   
/*  147:     */   public void b(String paramString)
/*  148:     */   {
/*  149: 250 */     this.ac.b(21, paramString);
/*  150:     */   }
/*  151:     */   
/*  152:     */   public float cs()
/*  153:     */   {
/*  154: 254 */     int i = l();
/*  155: 255 */     if (i >= 0) {
/*  156: 256 */       return 1.0F;
/*  157:     */     }
/*  158: 258 */     return 0.5F + (-24000 - i) / -24000.0F * 0.5F;
/*  159:     */   }
/*  160:     */   
/*  161:     */   public void a(boolean paramBoolean)
/*  162:     */   {
/*  163: 263 */     if (paramBoolean) {
/*  164: 264 */       a(cs());
/*  165:     */     } else {
/*  166: 266 */       a(1.0F);
/*  167:     */     }
/*  168:     */   }
/*  169:     */   
/*  170:     */   public boolean ct()
/*  171:     */   {
/*  172: 271 */     return this.bn;
/*  173:     */   }
/*  174:     */   
/*  175:     */   public void l(boolean paramBoolean)
/*  176:     */   {
/*  177: 275 */     c(2, paramBoolean);
/*  178:     */   }
/*  179:     */   
/*  180:     */   public void m(boolean paramBoolean)
/*  181:     */   {
/*  182: 279 */     this.bn = paramBoolean;
/*  183:     */   }
/*  184:     */   
/*  185:     */   public boolean ca()
/*  186:     */   {
/*  187: 284 */     return (!cP()) && (super.ca());
/*  188:     */   }
/*  189:     */   
/*  190:     */   protected void n(float paramFloat)
/*  191:     */   {
/*  192: 289 */     if ((paramFloat > 6.0F) && (cw())) {
/*  193: 290 */       r(false);
/*  194:     */     }
/*  195:     */   }
/*  196:     */   
/*  197:     */   public boolean cu()
/*  198:     */   {
/*  199: 295 */     return w(8);
/*  200:     */   }
/*  201:     */   
/*  202:     */   public int cv()
/*  203:     */   {
/*  204: 299 */     return this.ac.c(22);
/*  205:     */   }
/*  206:     */   
/*  207:     */   private int f(ItemStack paramamj)
/*  208:     */   {
/*  209: 303 */     if (paramamj == null) {
/*  210: 304 */       return 0;
/*  211:     */     }
/*  212: 306 */     Item localalq = paramamj.getItem();
/*  213: 307 */     if (localalq == ItemList.ck) {
/*  214: 308 */       return 1;
/*  215:     */     }
/*  216: 309 */     if (localalq == ItemList.cl) {
/*  217: 310 */       return 2;
/*  218:     */     }
/*  219: 311 */     if (localalq == ItemList.cm) {
/*  220: 312 */       return 3;
/*  221:     */     }
/*  222: 314 */     return 0;
/*  223:     */   }
/*  224:     */   
/*  225:     */   public boolean cw()
/*  226:     */   {
/*  227: 318 */     return w(32);
/*  228:     */   }
/*  229:     */   
/*  230:     */   public boolean cx()
/*  231:     */   {
/*  232: 322 */     return w(64);
/*  233:     */   }
/*  234:     */   
/*  235:     */   public boolean cy()
/*  236:     */   {
/*  237: 326 */     return w(16);
/*  238:     */   }
/*  239:     */   
/*  240:     */   public boolean cz()
/*  241:     */   {
/*  242: 330 */     return this.bD;
/*  243:     */   }
/*  244:     */   
/*  245:     */   public void e(ItemStack paramamj)
/*  246:     */   {
/*  247: 334 */     this.ac.b(22, Integer.valueOf(f(paramamj)));
/*  248: 335 */     da();
/*  249:     */   }
/*  250:     */   
/*  251:     */   public void n(boolean paramBoolean)
/*  252:     */   {
/*  253: 339 */     c(16, paramBoolean);
/*  254:     */   }
/*  255:     */   
/*  256:     */   public void o(boolean paramBoolean)
/*  257:     */   {
/*  258: 343 */     c(8, paramBoolean);
/*  259:     */   }
/*  260:     */   
/*  261:     */   public void p(boolean paramBoolean)
/*  262:     */   {
/*  263: 347 */     this.bD = paramBoolean;
/*  264:     */   }
/*  265:     */   
/*  266:     */   public void q(boolean paramBoolean)
/*  267:     */   {
/*  268: 351 */     c(4, paramBoolean);
/*  269:     */   }
/*  270:     */   
/*  271:     */   public int cA()
/*  272:     */   {
/*  273: 355 */     return this.bo;
/*  274:     */   }
/*  275:     */   
/*  276:     */   public void t(int paramInt)
/*  277:     */   {
/*  278: 359 */     this.bo = paramInt;
/*  279:     */   }
/*  280:     */   
/*  281:     */   public int u(int paramInt)
/*  282:     */   {
/*  283: 363 */     int i = MathUtils.clamp(cA() + paramInt, 0, cG());
/*  284:     */     
/*  285: 365 */     t(i);
/*  286: 366 */     return i;
/*  287:     */   }
/*  288:     */   
/*  289:     */   public boolean a(wh paramwh, float paramFloat)
/*  290:     */   {
/*  291: 371 */     Entity localwv = paramwh.j();
/*  292: 372 */     if ((this.rider != null) && (this.rider.equals(localwv))) {
/*  293: 373 */       return false;
/*  294:     */     }
/*  295: 376 */     return super.a(paramwh, paramFloat);
/*  296:     */   }
/*  297:     */   
/*  298:     */   public int bq()
/*  299:     */   {
/*  300: 381 */     return bu[cv()];
/*  301:     */   }
/*  302:     */   
/*  303:     */   public boolean ae()
/*  304:     */   {
/*  305: 386 */     return this.rider == null;
/*  306:     */   }
/*  307:     */   
/*  308:     */   public boolean cB()
/*  309:     */   {
/*  310: 391 */     int i = MathUtils.floor(this.xPos);
/*  311: 392 */     int j = MathUtils.floor(this.zPos);
/*  312:     */     
/*  313: 394 */     this.world.b(new BlockPosition(i, 0, j));
/*  314: 395 */     return true;
/*  315:     */   }
/*  316:     */   
/*  317:     */   public void cC()
/*  318:     */   {
/*  319: 402 */     if ((this.world.isClient) || (!cu())) {
/*  320: 403 */       return;
/*  321:     */     }
/*  322: 406 */     a(Item.fromProtoBlock(BlockList.ae), 1);
/*  323: 407 */     o(false);
/*  324:     */   }
/*  325:     */   
/*  326:     */   private void cW()
/*  327:     */   {
/*  328: 411 */     dd();
/*  329: 412 */     if (!R()) {
/*  330: 413 */       this.world.a(this, "eating", 1.0F, 1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F);
/*  331:     */     }
/*  332:     */   }
/*  333:     */   
/*  334:     */   public void e(float paramFloat1, float paramFloat2)
/*  335:     */   {
/*  336: 422 */     if (paramFloat1 > 1.0F) {
/*  337: 423 */       a("mob.horse.land", 0.4F, 1.0F);
/*  338:     */     }
/*  339: 426 */     int i = MathUtils.ceil((paramFloat1 * 0.5F - 3.0F) * paramFloat2);
/*  340: 427 */     if (i <= 0) {
/*  341: 428 */       return;
/*  342:     */     }
/*  343: 431 */     a(wh.i, i);
/*  344: 433 */     if (this.rider != null) {
/*  345: 434 */       this.rider.a(wh.i, i);
/*  346:     */     }
/*  347: 437 */     ProtoBlock localatr = this.world.getBlock(new BlockPosition(this.xPos, this.yPos - 0.2D - this.lastYaw, this.zPos)).getProto();
/*  348: 438 */     if ((localatr.getMaterial() != Material.air) && (!R()))
/*  349:     */     {
/*  350: 439 */       atx localatx = localatr.H;
/*  351: 440 */       this.world.a(this, localatx.c(), localatx.d() * 0.5F, localatx.e() * 0.75F);
/*  352:     */     }
/*  353:     */   }
/*  354:     */   
/*  355:     */   private int cX()
/*  356:     */   {
/*  357: 450 */     int i = cj();
/*  358: 451 */     if ((cu()) && ((i == 1) || (i == 2))) {
/*  359: 452 */       return 17;
/*  360:     */     }
/*  361: 454 */     return 2;
/*  362:     */   }
/*  363:     */   
/*  364:     */   private void cY()
/*  365:     */   {
/*  366: 458 */     aic localaic = this.bC;
/*  367:     */     
/*  368: 460 */     this.bC = new aic("HorseChest", cX());
/*  369: 461 */     this.bC.a(getName());
/*  370: 462 */     if (localaic != null)
/*  371:     */     {
/*  372: 463 */       localaic.b(this);
/*  373:     */       
/*  374: 465 */       int i = Math.min(localaic.n_(), this.bC.n_());
/*  375: 466 */       for (int j = 0; j < i; j++)
/*  376:     */       {
/*  377: 467 */         ItemStack localamj = localaic.a(j);
/*  378: 468 */         if (localamj != null) {
/*  379: 469 */           this.bC.a(j, localamj.k());
/*  380:     */         }
/*  381:     */       }
/*  382:     */     }
/*  383: 473 */     this.bC.a(this);
/*  384: 474 */     cZ();
/*  385:     */   }
/*  386:     */   
/*  387:     */   private void cZ()
/*  388:     */   {
/*  389: 478 */     if (!this.world.isClient)
/*  390:     */     {
/*  391: 479 */       q(this.bC.a(0) != null);
/*  392: 480 */       if (cM()) {
/*  393: 481 */         e(this.bC.a(1));
/*  394:     */       }
/*  395:     */     }
/*  396:     */   }
/*  397:     */   
/*  398:     */   public void a(wa paramwa)
/*  399:     */   {
/*  400: 488 */     int i = cv();
/*  401: 489 */     boolean bool = cE();
/*  402: 490 */     cZ();
/*  403: 491 */     if (this.W > 20)
/*  404:     */     {
/*  405: 492 */       if ((i == 0) && (i != cv())) {
/*  406: 493 */         a("mob.horse.armor", 0.5F, 1.0F);
/*  407: 494 */       } else if (i != cv()) {
/*  408: 495 */         a("mob.horse.armor", 0.5F, 1.0F);
/*  409:     */       }
/*  410: 497 */       if ((!bool) && (cE())) {
/*  411: 498 */         a("mob.horse.leather", 0.5F, 1.0F);
/*  412:     */       }
/*  413:     */     }
/*  414:     */   }
/*  415:     */   
/*  416:     */   public boolean canSpawn()
/*  417:     */   {
/*  418: 505 */     cB();
/*  419: 506 */     return super.canSpawn();
/*  420:     */   }
/*  421:     */   
/*  422:     */   protected EntityHorse a(Entity paramwv, double paramDouble)
/*  423:     */   {
/*  424: 510 */     double d1 = 1.7976931348623157E+308D;
/*  425:     */     
/*  426: 512 */     Object localObject = null;
/*  427: 513 */     List<Entity> localList = this.world.a(paramwv, paramwv.getAABB().addCoord(paramDouble, paramDouble, paramDouble), bq);
/*  428: 515 */     for (Entity localwv : localList)
/*  429:     */     {
/*  430: 516 */       double d2 = localwv.e(paramwv.xPos, paramwv.yPos, paramwv.zPos);
/*  431: 518 */       if (d2 < d1)
/*  432:     */       {
/*  433: 519 */         localObject = localwv;
/*  434: 520 */         d1 = d2;
/*  435:     */       }
/*  436:     */     }
/*  437: 524 */     return (EntityHorse)localObject;
/*  438:     */   }
/*  439:     */   
/*  440:     */   public double cD()
/*  441:     */   {
/*  442: 528 */     return a(br).e();
/*  443:     */   }
/*  444:     */   
/*  445:     */   protected String bo()
/*  446:     */   {
/*  447: 533 */     dd();
/*  448: 534 */     int i = cj();
/*  449: 535 */     if (i == 3) {
/*  450: 536 */       return "mob.horse.zombie.death";
/*  451:     */     }
/*  452: 538 */     if (i == 4) {
/*  453: 539 */       return "mob.horse.skeleton.death";
/*  454:     */     }
/*  455: 541 */     if ((i == 1) || (i == 2)) {
/*  456: 542 */       return "mob.horse.donkey.death";
/*  457:     */     }
/*  458: 544 */     return "mob.horse.death";
/*  459:     */   }
/*  460:     */   
/*  461:     */   protected Item A()
/*  462:     */   {
/*  463: 549 */     int i = this.random.nextInt(4) == 0 ? 1 : 0;
/*  464:     */     
/*  465: 551 */     int j = cj();
/*  466: 552 */     if (j == 4) {
/*  467: 553 */       return ItemList.bone;
/*  468:     */     }
/*  469: 555 */     if (j == 3)
/*  470:     */     {
/*  471: 556 */       if (i != 0) {
/*  472: 557 */         return null;
/*  473:     */       }
/*  474: 559 */       return ItemList.bt;
/*  475:     */     }
/*  476: 562 */     return ItemList.leather;
/*  477:     */   }
/*  478:     */   
/*  479:     */   protected String bn()
/*  480:     */   {
/*  481: 567 */     dd();
/*  482: 569 */     if (this.random.nextInt(3) == 0) {
/*  483: 570 */       df();
/*  484:     */     }
/*  485: 573 */     int i = cj();
/*  486: 574 */     if (i == 3) {
/*  487: 575 */       return "mob.horse.zombie.hit";
/*  488:     */     }
/*  489: 577 */     if (i == 4) {
/*  490: 578 */       return "mob.horse.skeleton.hit";
/*  491:     */     }
/*  492: 580 */     if ((i == 1) || (i == 2)) {
/*  493: 581 */       return "mob.horse.donkey.hit";
/*  494:     */     }
/*  495: 583 */     return "mob.horse.hit";
/*  496:     */   }
/*  497:     */   
/*  498:     */   public boolean cE()
/*  499:     */   {
/*  500: 587 */     return w(4);
/*  501:     */   }
/*  502:     */   
/*  503:     */   protected String z()
/*  504:     */   {
/*  505: 592 */     dd();
/*  506: 593 */     if ((this.random.nextInt(10) == 0) && (!bC())) {
/*  507: 594 */       df();
/*  508:     */     }
/*  509: 596 */     int i = cj();
/*  510: 597 */     if (i == 3) {
/*  511: 598 */       return "mob.horse.zombie.idle";
/*  512:     */     }
/*  513: 600 */     if (i == 4) {
/*  514: 601 */       return "mob.horse.skeleton.idle";
/*  515:     */     }
/*  516: 603 */     if ((i == 1) || (i == 2)) {
/*  517: 604 */       return "mob.horse.donkey.idle";
/*  518:     */     }
/*  519: 606 */     return "mob.horse.idle";
/*  520:     */   }
/*  521:     */   
/*  522:     */   protected String cF()
/*  523:     */   {
/*  524: 613 */     dd();
/*  525: 614 */     df();
/*  526: 615 */     int i = cj();
/*  527: 616 */     if ((i == 3) || (i == 4)) {
/*  528: 617 */       return null;
/*  529:     */     }
/*  530: 619 */     if ((i == 1) || (i == 2)) {
/*  531: 620 */       return "mob.horse.donkey.angry";
/*  532:     */     }
/*  533: 622 */     return "mob.horse.angry";
/*  534:     */   }
/*  535:     */   
/*  536:     */   protected void a(BlockPosition paramdt, ProtoBlock paramatr)
/*  537:     */   {
/*  538: 629 */     atx localatx = paramatr.H;
/*  539: 630 */     if (this.world.getBlock(paramdt.up()).getProto() == BlockList.aH) {
/*  540: 631 */       localatx = BlockList.aH.H;
/*  541:     */     }
/*  542: 633 */     if (!paramatr.getMaterial().isLiquid())
/*  543:     */     {
/*  544: 634 */       int i = cj();
/*  545: 635 */       if ((this.rider != null) && (i != 1) && (i != 2))
/*  546:     */       {
/*  547: 636 */         this.bL += 1;
/*  548: 637 */         if ((this.bL > 5) && (this.bL % 3 == 0))
/*  549:     */         {
/*  550: 638 */           a("mob.horse.gallop", localatx.d() * 0.15F, localatx.e());
/*  551: 639 */           if ((i == 0) && (this.random.nextInt(10) == 0)) {
/*  552: 640 */             a("mob.horse.breathe", localatx.d() * 0.6F, localatx.e());
/*  553:     */           }
/*  554:     */         }
/*  555: 642 */         else if (this.bL <= 5)
/*  556:     */         {
/*  557: 643 */           a("mob.horse.wood", localatx.d() * 0.15F, localatx.e());
/*  558:     */         }
/*  559:     */       }
/*  560: 645 */       else if (localatx == ProtoBlock.f)
/*  561:     */       {
/*  562: 646 */         a("mob.horse.wood", localatx.d() * 0.15F, localatx.e());
/*  563:     */       }
/*  564:     */       else
/*  565:     */       {
/*  566: 648 */         a("mob.horse.soft", localatx.d() * 0.15F, localatx.e());
/*  567:     */       }
/*  568:     */     }
/*  569:     */   }
/*  570:     */   
/*  571:     */   protected void aW()
/*  572:     */   {
/*  573: 655 */     super.aW();
/*  574:     */     
/*  575: 657 */     bx().b(br);
/*  576:     */     
/*  577: 659 */     a(afs.a).a(53.0D);
/*  578: 660 */     a(afs.d).a(0.2249999940395355D);
/*  579:     */   }
/*  580:     */   
/*  581:     */   public int getMaxSpawnedInChunk()
/*  582:     */   {
/*  583: 665 */     return 6;
/*  584:     */   }
/*  585:     */   
/*  586:     */   public int cG()
/*  587:     */   {
/*  588: 673 */     return 100;
/*  589:     */   }
/*  590:     */   
/*  591:     */   protected float bA()
/*  592:     */   {
/*  593: 678 */     return 0.8F;
/*  594:     */   }
/*  595:     */   
/*  596:     */   public int w()
/*  597:     */   {
/*  598: 683 */     return 400;
/*  599:     */   }
/*  600:     */   
/*  601:     */   public boolean cH()
/*  602:     */   {
/*  603: 687 */     return (cj() == 0) || (cv() > 0);
/*  604:     */   }
/*  605:     */   
/*  606: 691 */   private String[] bN = new String[3];
/*  607: 692 */   private boolean bO = false;
/*  608:     */   
/*  609:     */   private void da()
/*  610:     */   {
/*  611: 695 */     this.bM = null;
/*  612:     */   }
/*  613:     */   
/*  614:     */   public boolean cI()
/*  615:     */   {
/*  616: 699 */     return this.bO;
/*  617:     */   }
/*  618:     */   
/*  619:     */   private void db()
/*  620:     */   {
/*  621: 703 */     this.bM = "horse/";
/*  622: 704 */     this.bN[0] = null;
/*  623: 705 */     this.bN[1] = null;
/*  624: 706 */     this.bN[2] = null;
/*  625:     */     
/*  626: 708 */     int i = cj();
/*  627: 709 */     int j = ck();
/*  628: 711 */     if (i == 0)
/*  629:     */     {
/*  630: 712 */       int k = j & 0xFF;
/*  631: 713 */       int m = (j & 0xFF00) >> 8;
/*  632: 714 */       if (k >= bv.length)
/*  633:     */       {
/*  634: 715 */         this.bO = false;
/*  635: 716 */         return;
/*  636:     */       }
/*  637: 718 */       this.bN[0] = bv[k];
/*  638: 719 */       this.bM += bw[k];
/*  639: 720 */       if (m >= bx.length)
/*  640:     */       {
/*  641: 721 */         this.bO = false;
/*  642: 722 */         return;
/*  643:     */       }
/*  644: 724 */       this.bN[1] = bx[m];
/*  645: 725 */       this.bM += by[m];
/*  646:     */     }
/*  647:     */     else
/*  648:     */     {
/*  649: 727 */       this.bN[0] = "";
/*  650: 728 */       this.bM = (this.bM + "_" + i + "_");
/*  651:     */     }
/*  652: 731 */     int k = cv();
/*  653: 732 */     if (k >= bs.length)
/*  654:     */     {
/*  655: 733 */       this.bO = false;
/*  656: 734 */       return;
/*  657:     */     }
/*  658: 736 */     this.bN[2] = bs[k];
/*  659: 737 */     this.bM += bt[k];
/*  660: 738 */     this.bO = true;
/*  661:     */   }
/*  662:     */   
/*  663:     */   public String cJ()
/*  664:     */   {
/*  665: 742 */     if (this.bM == null) {
/*  666: 743 */       db();
/*  667:     */     }
/*  668: 745 */     return this.bM;
/*  669:     */   }
/*  670:     */   
/*  671:     */   public String[] cK()
/*  672:     */   {
/*  673: 749 */     if (this.bM == null) {
/*  674: 750 */       db();
/*  675:     */     }
/*  676: 752 */     return this.bN;
/*  677:     */   }
/*  678:     */   
/*  679:     */   public void g(EntityPlayer paramahd)
/*  680:     */   {
/*  681: 756 */     if ((!this.world.isClient) && ((this.rider == null) || (this.rider == paramahd)) && (cm()))
/*  682:     */     {
/*  683: 757 */       this.bC.a(getName());
/*  684: 758 */       paramahd.a(this, this.bC);
/*  685:     */     }
/*  686:     */   }
/*  687:     */   
/*  688:     */   public boolean a(EntityPlayer paramahd)
/*  689:     */   {
/*  690: 764 */     ItemStack localamj = paramahd.bg.h();
/*  691: 766 */     if ((localamj != null) && (localamj.getItem() == ItemList.bJ)) {
/*  692: 767 */       return super.a(paramahd);
/*  693:     */     }
/*  694: 770 */     if ((!cm()) && 
/*  695: 771 */       (cP())) {
/*  696: 772 */       return false;
/*  697:     */     }
/*  698: 776 */     if ((cm()) && (cl()) && (paramahd.aw()))
/*  699:     */     {
/*  700: 777 */       g(paramahd);
/*  701: 778 */       return true;
/*  702:     */     }
/*  703: 781 */     if ((cn()) && (this.rider != null)) {
/*  704: 782 */       return super.a(paramahd);
/*  705:     */     }
/*  706: 786 */     if (localamj != null)
/*  707:     */     {
/*  708: 787 */       int i = 0;
/*  709: 789 */       if (cM())
/*  710:     */       {
/*  711: 790 */         int j = -1;
/*  712: 792 */         if (localamj.getItem() == ItemList.ck) {
/*  713: 793 */           j = 1;
/*  714: 794 */         } else if (localamj.getItem() == ItemList.cl) {
/*  715: 795 */           j = 2;
/*  716: 796 */         } else if (localamj.getItem() == ItemList.cm) {
/*  717: 797 */           j = 3;
/*  718:     */         }
/*  719: 800 */         if (j >= 0)
/*  720:     */         {
/*  721: 801 */           if (!cm())
/*  722:     */           {
/*  723: 802 */             cU();
/*  724: 803 */             return true;
/*  725:     */           }
/*  726: 805 */           g(paramahd);
/*  727: 806 */           return true;
/*  728:     */         }
/*  729:     */       }
/*  730: 810 */       if ((i == 0) && (!cP()))
/*  731:     */       {
/*  732: 811 */         float f = 0.0F;
/*  733: 812 */         int k = 0;
/*  734: 813 */         int m = 0;
/*  735: 815 */         if (localamj.getItem() == ItemList.O)
/*  736:     */         {
/*  737: 816 */           f = 2.0F;
/*  738: 817 */           k = 20;
/*  739: 818 */           m = 3;
/*  740:     */         }
/*  741: 819 */         else if (localamj.getItem() == ItemList.aY)
/*  742:     */         {
/*  743: 820 */           f = 1.0F;
/*  744: 821 */           k = 30;
/*  745: 822 */           m = 3;
/*  746:     */         }
/*  747: 823 */         else if (ProtoBlock.a(localamj.getItem()) == BlockList.cx)
/*  748:     */         {
/*  749: 824 */           f = 20.0F;
/*  750: 825 */           k = 180;
/*  751:     */         }
/*  752: 826 */         else if (localamj.getItem() == ItemList.apple)
/*  753:     */         {
/*  754: 827 */           f = 3.0F;
/*  755: 828 */           k = 60;
/*  756: 829 */           m = 3;
/*  757:     */         }
/*  758: 830 */         else if (localamj.getItem() == ItemList.bW)
/*  759:     */         {
/*  760: 831 */           f = 4.0F;
/*  761: 832 */           k = 60;
/*  762: 833 */           m = 5;
/*  763: 834 */           if ((cm()) && (l() == 0))
/*  764:     */           {
/*  765: 835 */             i = 1;
/*  766: 836 */             c(paramahd);
/*  767:     */           }
/*  768:     */         }
/*  769: 838 */         else if (localamj.getItem() == ItemList.ao)
/*  770:     */         {
/*  771: 839 */           f = 10.0F;
/*  772: 840 */           k = 240;
/*  773: 841 */           m = 10;
/*  774: 842 */           if ((cm()) && (l() == 0))
/*  775:     */           {
/*  776: 843 */             i = 1;
/*  777: 844 */             c(paramahd);
/*  778:     */           }
/*  779:     */         }
/*  780: 847 */         if ((getHealth() < bt()) && (f > 0.0F))
/*  781:     */         {
/*  782: 848 */           g(f);
/*  783: 849 */           i = 1;
/*  784:     */         }
/*  785: 851 */         if ((!cl()) && (k > 0))
/*  786:     */         {
/*  787: 852 */           a(k);
/*  788: 853 */           i = 1;
/*  789:     */         }
/*  790: 855 */         if ((m > 0) && ((i != 0) || (!cm())) && (m < cG()))
/*  791:     */         {
/*  792: 856 */           i = 1;
/*  793: 857 */           u(m);
/*  794:     */         }
/*  795: 859 */         if (i != 0) {
/*  796: 860 */           cW();
/*  797:     */         }
/*  798:     */       }
/*  799: 864 */       if ((!cm()) && (i == 0))
/*  800:     */       {
/*  801: 865 */         if ((localamj != null) && (localamj.a(paramahd, this))) {
/*  802: 866 */           return true;
/*  803:     */         }
/*  804: 868 */         cU();
/*  805: 869 */         return true;
/*  806:     */       }
/*  807: 872 */       if ((i == 0) && (cN()) && (!cu()) && 
/*  808: 873 */         (localamj.getItem() == Item.fromProtoBlock(BlockList.ae)))
/*  809:     */       {
/*  810: 874 */         o(true);
/*  811: 875 */         a("mob.chickenplop", 1.0F, (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
/*  812: 876 */         i = 1;
/*  813: 877 */         cY();
/*  814:     */       }
/*  815: 881 */       if ((i == 0) && (cn()) && (!cE()) && 
/*  816: 882 */         (localamj.getItem() == ItemList.saddle))
/*  817:     */       {
/*  818: 883 */         g(paramahd);
/*  819: 884 */         return true;
/*  820:     */       }
/*  821: 888 */       if (i != 0)
/*  822:     */       {
/*  823: 889 */         if (!paramahd.by.d) {
/*  824: 890 */           if (--localamj.stackSize == 0) {
/*  825: 891 */             paramahd.bg.a(paramahd.bg.c, null);
/*  826:     */           }
/*  827:     */         }
/*  828: 894 */         return true;
/*  829:     */       }
/*  830:     */     }
/*  831: 898 */     if ((cn()) && (this.rider == null))
/*  832:     */     {
/*  833: 901 */       if ((localamj != null) && (localamj.a(paramahd, this))) {
/*  834: 902 */         return true;
/*  835:     */       }
/*  836: 904 */       i(paramahd);
/*  837: 905 */       return true;
/*  838:     */     }
/*  839: 907 */     return super.a(paramahd);
/*  840:     */   }
/*  841:     */   
/*  842:     */   private void i(EntityPlayer paramahd)
/*  843:     */   {
/*  844: 912 */     paramahd.yaw = this.yaw;
/*  845: 913 */     paramahd.pitch = this.pitch;
/*  846: 914 */     r(false);
/*  847: 915 */     s(false);
/*  848: 916 */     if (!this.world.isClient) {
/*  849: 917 */       paramahd.a(this);
/*  850:     */     }
/*  851:     */   }
/*  852:     */   
/*  853:     */   public boolean cM()
/*  854:     */   {
/*  855: 932 */     return cj() == 0;
/*  856:     */   }
/*  857:     */   
/*  858:     */   public boolean cN()
/*  859:     */   {
/*  860: 941 */     int i = cj();
/*  861: 942 */     return (i == 2) || (i == 1);
/*  862:     */   }
/*  863:     */   
/*  864:     */   protected boolean bC()
/*  865:     */   {
/*  866: 947 */     if ((this.rider != null) && (cE())) {
/*  867: 948 */       return true;
/*  868:     */     }
/*  869: 950 */     return (cw()) || (cx());
/*  870:     */   }
/*  871:     */   
/*  872:     */   public boolean cP()
/*  873:     */   {
/*  874: 967 */     int i = cj();
/*  875: 968 */     return (i == 3) || (i == 4);
/*  876:     */   }
/*  877:     */   
/*  878:     */   public boolean cQ()
/*  879:     */   {
/*  880: 972 */     return (cP()) || (cj() == 2);
/*  881:     */   }
/*  882:     */   
/*  883:     */   public boolean d(ItemStack paramamj)
/*  884:     */   {
/*  885: 978 */     return false;
/*  886:     */   }
/*  887:     */   
/*  888:     */   private void dc()
/*  889:     */   {
/*  890: 982 */     this.bk = 1;
/*  891:     */   }
/*  892:     */   
/*  893:     */   public void a(wh paramwh)
/*  894:     */   {
/*  895: 995 */     super.a(paramwh);
/*  896: 996 */     if (!this.world.isClient) {
/*  897: 997 */       cV();
/*  898:     */     }
/*  899:     */   }
/*  900:     */   
/*  901:     */   public void m()
/*  902:     */   {
/*  903:1003 */     if (this.random.nextInt(200) == 0) {
/*  904:1004 */       dc();
/*  905:     */     }
/*  906:1007 */     super.m();
/*  907:1009 */     if (!this.world.isClient)
/*  908:     */     {
/*  909:1010 */       if ((this.random.nextInt(900) == 0) && (this.deathTime == 0)) {
/*  910:1011 */         g(1.0F);
/*  911:     */       }
/*  912:1014 */       if ((!cw()) && (this.rider == null) && (this.random.nextInt(300) == 0) && 
/*  913:1015 */         (this.world.getBlock(new BlockPosition(MathUtils.floor(this.xPos), MathUtils.floor(this.yPos) - 1, MathUtils.floor(this.zPos))).getProto() == BlockList.grass)) {
/*  914:1016 */         r(true);
/*  915:     */       }
/*  916:1020 */       if ((cw()) && (++this.bz > 50))
/*  917:     */       {
/*  918:1021 */         this.bz = 0;
/*  919:1022 */         r(false);
/*  920:     */       }
/*  921:1025 */       if ((cy()) && (!cl()) && (!cw()))
/*  922:     */       {
/*  923:1026 */         EntityHorse localabt = a(this, 16.0D);
/*  924:1027 */         if ((localabt != null) && (h(localabt) > 4.0D)) {
/*  925:1028 */           this.h.a(localabt);
/*  926:     */         }
/*  927:     */       }
/*  928:     */     }
/*  929:     */   }
/*  930:     */   
/*  931:     */   public void onUpdate()
/*  932:     */   {
/*  933:1036 */     super.onUpdate();
/*  934:1039 */     if ((this.world.isClient) && (this.ac.a()))
/*  935:     */     {
/*  936:1040 */       this.ac.e();
/*  937:1041 */       da();
/*  938:     */     }
/*  939:1044 */     if ((this.bA > 0) && (++this.bA > 30))
/*  940:     */     {
/*  941:1045 */       this.bA = 0;
/*  942:1046 */       c(128, false);
/*  943:     */     }
/*  944:1049 */     if ((!this.world.isClient) && 
/*  945:1050 */       (this.bB > 0) && (++this.bB > 20))
/*  946:     */     {
/*  947:1051 */       this.bB = 0;
/*  948:1052 */       s(false);
/*  949:     */     }
/*  950:1056 */     if ((this.bk > 0) && (++this.bk > 8)) {
/*  951:1057 */       this.bk = 0;
/*  952:     */     }
/*  953:1060 */     if (this.bm > 0)
/*  954:     */     {
/*  955:1061 */       this.bm += 1;
/*  956:1063 */       if (this.bm > 300) {
/*  957:1064 */         this.bm = 0;
/*  958:     */       }
/*  959:     */     }
/*  960:1068 */     this.bG = this.bF;
/*  961:1069 */     if (cw())
/*  962:     */     {
/*  963:1070 */       this.bF += (1.0F - this.bF) * 0.4F + 0.05F;
/*  964:1071 */       if (this.bF > 1.0F) {
/*  965:1072 */         this.bF = 1.0F;
/*  966:     */       }
/*  967:     */     }
/*  968:     */     else
/*  969:     */     {
/*  970:1075 */       this.bF += (0.0F - this.bF) * 0.4F - 0.05F;
/*  971:1076 */       if (this.bF < 0.0F) {
/*  972:1077 */         this.bF = 0.0F;
/*  973:     */       }
/*  974:     */     }
/*  975:1080 */     this.bI = this.bH;
/*  976:1081 */     if (cx())
/*  977:     */     {
/*  978:1083 */       this.bG = (this.bF = 0.0F);
/*  979:1084 */       this.bH += (1.0F - this.bH) * 0.4F + 0.05F;
/*  980:1085 */       if (this.bH > 1.0F) {
/*  981:1086 */         this.bH = 1.0F;
/*  982:     */       }
/*  983:     */     }
/*  984:     */     else
/*  985:     */     {
/*  986:1089 */       this.bE = false;
/*  987:     */       
/*  988:1091 */       this.bH += (0.8F * this.bH * this.bH * this.bH - this.bH) * 0.6F - 0.05F;
/*  989:1092 */       if (this.bH < 0.0F) {
/*  990:1093 */         this.bH = 0.0F;
/*  991:     */       }
/*  992:     */     }
/*  993:1096 */     this.bK = this.bJ;
/*  994:1097 */     if (w(128))
/*  995:     */     {
/*  996:1098 */       this.bJ += (1.0F - this.bJ) * 0.7F + 0.05F;
/*  997:1099 */       if (this.bJ > 1.0F) {
/*  998:1100 */         this.bJ = 1.0F;
/*  999:     */       }
/* 1000:     */     }
/* 1001:     */     else
/* 1002:     */     {
/* 1003:1103 */       this.bJ += (0.0F - this.bJ) * 0.7F - 0.05F;
/* 1004:1104 */       if (this.bJ < 0.0F) {
/* 1005:1105 */         this.bJ = 0.0F;
/* 1006:     */       }
/* 1007:     */     }
/* 1008:     */   }
/* 1009:     */   
/* 1010:     */   private void dd()
/* 1011:     */   {
/* 1012:1111 */     if (!this.world.isClient)
/* 1013:     */     {
/* 1014:1112 */       this.bA = 1;
/* 1015:1113 */       c(128, true);
/* 1016:     */     }
/* 1017:     */   }
/* 1018:     */   
/* 1019:     */   private boolean de()
/* 1020:     */   {
/* 1021:1118 */     return (this.rider == null) && (this.vehicle == null) && (cm()) && (cl()) && (!cQ()) && (getHealth() >= bt()) && (cp());
/* 1022:     */   }
/* 1023:     */   
/* 1024:     */   public void f(boolean paramBoolean)
/* 1025:     */   {
/* 1026:1131 */     c(32, paramBoolean);
/* 1027:     */   }
/* 1028:     */   
/* 1029:     */   public void r(boolean paramBoolean)
/* 1030:     */   {
/* 1031:1135 */     f(paramBoolean);
/* 1032:     */   }
/* 1033:     */   
/* 1034:     */   public void s(boolean paramBoolean)
/* 1035:     */   {
/* 1036:1139 */     if (paramBoolean) {
/* 1037:1140 */       r(false);
/* 1038:     */     }
/* 1039:1142 */     c(64, paramBoolean);
/* 1040:     */   }
/* 1041:     */   
/* 1042:     */   private void df()
/* 1043:     */   {
/* 1044:1146 */     if (!this.world.isClient)
/* 1045:     */     {
/* 1046:1147 */       this.bB = 1;
/* 1047:1148 */       s(true);
/* 1048:     */     }
/* 1049:     */   }
/* 1050:     */   
/* 1051:     */   public void cU()
/* 1052:     */   {
/* 1053:1153 */     df();
/* 1054:1154 */     String str = cF();
/* 1055:1155 */     if (str != null) {
/* 1056:1156 */       a(str, bA(), bB());
/* 1057:     */     }
/* 1058:     */   }
/* 1059:     */   
/* 1060:     */   public void cV()
/* 1061:     */   {
/* 1062:1161 */     a(this, this.bC);
/* 1063:1162 */     cC();
/* 1064:     */   }
/* 1065:     */   
/* 1066:     */   private void a(Entity paramwv, aic paramaic)
/* 1067:     */   {
/* 1068:1166 */     if ((paramaic == null) || (this.world.isClient)) {
/* 1069:1167 */       return;
/* 1070:     */     }
/* 1071:1170 */     for (int i = 0; i < paramaic.n_(); i++)
/* 1072:     */     {
/* 1073:1171 */       ItemStack localamj = paramaic.a(i);
/* 1074:1172 */       if (localamj != null) {
/* 1075:1175 */         a(localamj, 0.0F);
/* 1076:     */       }
/* 1077:     */     }
/* 1078:     */   }
/* 1079:     */   
/* 1080:     */   public boolean h(EntityPlayer paramahd)
/* 1081:     */   {
/* 1082:1180 */     b(paramahd.getUUID().toString());
/* 1083:1181 */     l(true);
/* 1084:1182 */     return true;
/* 1085:     */   }
/* 1086:     */   
/* 1087:     */   public void g(float paramFloat1, float paramFloat2)
/* 1088:     */   {
/* 1089:1193 */     if ((this.rider == null) || (!(this.rider instanceof EntityLiving)) || (!cE()))
/* 1090:     */     {
/* 1091:1194 */       this.S = 0.5F;
/* 1092:1195 */       this.aK = 0.02F;
/* 1093:1196 */       super.g(paramFloat1, paramFloat2);
/* 1094:1197 */       return;
/* 1095:     */     }
/* 1096:1200 */     this.lastYaw = (this.yaw = this.rider.yaw);
/* 1097:1201 */     this.pitch = (this.rider.pitch * 0.5F);
/* 1098:1202 */     b(this.yaw, this.pitch);
/* 1099:1203 */     this.aI = (this.aG = this.yaw);
/* 1100:     */     
/* 1101:1205 */     paramFloat1 = ((EntityLiving)this.rider).aX * 0.5F;
/* 1102:1206 */     paramFloat2 = ((EntityLiving)this.rider).aY;
/* 1103:1209 */     if (paramFloat2 <= 0.0F)
/* 1104:     */     {
/* 1105:1210 */       paramFloat2 *= 0.25F;
/* 1106:1211 */       this.bL = 0;
/* 1107:     */     }
/* 1108:1214 */     if ((this.C) && (this.bp == 0.0F) && (cx()) && (!this.bE))
/* 1109:     */     {
/* 1110:1215 */       paramFloat1 = 0.0F;
/* 1111:1216 */       paramFloat2 = 0.0F;
/* 1112:     */     }
/* 1113:1219 */     if ((this.bp > 0.0F) && (!ct()) && (this.C))
/* 1114:     */     {
/* 1115:1220 */       this.yVelocity = (cD() * this.bp);
/* 1116:1221 */       if (a(Potion.j)) {
/* 1117:1222 */         this.yVelocity += (b(Potion.j).c() + 1) * 0.1F;
/* 1118:     */       }
/* 1119:1225 */       m(true);
/* 1120:1226 */       this.ai = true;
/* 1121:1228 */       if (paramFloat2 > 0.0F)
/* 1122:     */       {
/* 1123:1229 */         float f1 = MathUtils.sin(this.yaw * 3.141593F / 180.0F);
/* 1124:1230 */         float f2 = MathUtils.cos(this.yaw * 3.141593F / 180.0F);
/* 1125:     */         
/* 1126:1232 */         this.xVelocity += -0.4F * f1 * this.bp;
/* 1127:1233 */         this.zVelocity += 0.4F * f2 * this.bp;
/* 1128:     */         
/* 1129:1235 */         a("mob.horse.jump", 0.4F, 1.0F);
/* 1130:     */       }
/* 1131:1237 */       this.bp = 0.0F;
/* 1132:     */     }
/* 1133:1240 */     this.S = 1.0F;
/* 1134:1241 */     this.aK = (bH() * 0.1F);
/* 1135:1242 */     if (!this.world.isClient)
/* 1136:     */     {
/* 1137:1243 */       j((float)a(afs.d).e());
/* 1138:1244 */       super.g(paramFloat1, paramFloat2);
/* 1139:     */     }
/* 1140:1247 */     if (this.C)
/* 1141:     */     {
/* 1142:1249 */       this.bp = 0.0F;
/* 1143:1250 */       m(false);
/* 1144:     */     }
/* 1145:1252 */     this.ay = this.az;
/* 1146:1253 */     double d1 = this.xPos - this.lastX;
/* 1147:1254 */     double d2 = this.zPos - this.lastZ;
/* 1148:1255 */     float f3 = MathUtils.a(d1 * d1 + d2 * d2) * 4.0F;
/* 1149:1256 */     if (f3 > 1.0F) {
/* 1150:1257 */       f3 = 1.0F;
/* 1151:     */     }
/* 1152:1260 */     this.az += (f3 - this.az) * 0.4F;
/* 1153:1261 */     this.aA += this.az;
/* 1154:     */   }
/* 1155:     */   
/* 1156:     */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 1157:     */   {
/* 1158:1266 */     super.writeEntityToNBT(paramfn);
/* 1159:     */     
/* 1160:1268 */     paramfn.setBoolean("EatingHaystack", cw());
/* 1161:1269 */     paramfn.setBoolean("ChestedHorse", cu());
/* 1162:1270 */     paramfn.setBoolean("HasReproduced", cz());
/* 1163:1271 */     paramfn.setBoolean("Bred", cy());
/* 1164:1272 */     paramfn.setInt("Type", cj());
/* 1165:1273 */     paramfn.setInt("Variant", ck());
/* 1166:1274 */     paramfn.setInt("Temper", cA());
/* 1167:1275 */     paramfn.setBoolean("Tame", cm());
/* 1168:1276 */     paramfn.setString("OwnerUUID", cr());
/* 1169:1278 */     if (cu())
/* 1170:     */     {
/* 1171:1279 */       fv localfv = new fv();
/* 1172:1281 */       for (int i = 2; i < this.bC.n_(); i++)
/* 1173:     */       {
/* 1174:1282 */         ItemStack localamj = this.bC.a(i);
/* 1175:1284 */         if (localamj != null)
/* 1176:     */         {
/* 1177:1285 */           NBTTagCompound localfn = new NBTTagCompound();
/* 1178:     */           
/* 1179:1287 */           localfn.setByte("Slot", (byte)i);
/* 1180:     */           
/* 1181:1289 */           localamj.writeToNBT(localfn);
/* 1182:1290 */           localfv.a(localfn);
/* 1183:     */         }
/* 1184:     */       }
/* 1185:1293 */       paramfn.setNBT("Items", localfv);
/* 1186:     */     }
/* 1187:1296 */     if (this.bC.a(1) != null) {
/* 1188:1297 */       paramfn.setNBT("ArmorItem", this.bC.a(1).writeToNBT(new NBTTagCompound()));
/* 1189:     */     }
/* 1190:1299 */     if (this.bC.a(0) != null) {
/* 1191:1300 */       paramfn.setNBT("SaddleItem", this.bC.a(0).writeToNBT(new NBTTagCompound()));
/* 1192:     */     }
/* 1193:     */   }
/* 1194:     */   
/* 1195:     */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 1196:     */   {
/* 1197:1306 */     super.readEntityFromNBT(paramfn);
/* 1198:1307 */     r(paramfn.getBoolean("EatingHaystack"));
/* 1199:1308 */     n(paramfn.getBoolean("Bred"));
/* 1200:1309 */     o(paramfn.getBoolean("ChestedHorse"));
/* 1201:1310 */     p(paramfn.getBoolean("HasReproduced"));
/* 1202:1311 */     r(paramfn.getInteger("Type"));
/* 1203:1312 */     s(paramfn.getInteger("Variant"));
/* 1204:1313 */     t(paramfn.getInteger("Temper"));
/* 1205:1314 */     l(paramfn.getBoolean("Tame"));
/* 1206:1315 */     String str = "";
/* 1207:1316 */     if (paramfn.hasKey("OwnerUUID", 8))
/* 1208:     */     {
/* 1209:1317 */       str = paramfn.getString("OwnerUUID");
/* 1210:     */     }
/* 1211:     */     else
/* 1212:     */     {
/* 1213:1319 */       String localObject1 = paramfn.getString("Owner");
/* 1214:1320 */       str = sf.a((String)localObject1);
/* 1215:     */     }
/* 1216:1322 */     if (str.length() > 0) {
/* 1217:1323 */       b(str);
/* 1218:     */     }
/* 1219:1326 */     Object localObject1 = bx().a("Speed");
/* 1220:1328 */     if (localObject1 != null) {
/* 1221:1329 */       a(afs.d).a(((xz)localObject1).b() * 0.25D);
/* 1222:     */     }
/* 1223:     */     Object localObject2;
/* 1224:1332 */     if (cu())
/* 1225:     */     {
/* 1226:1333 */       localObject2 = paramfn.c("Items", 10);
/* 1227:1334 */       cY();
/* 1228:1336 */       for (int i = 0; i < ((fv)localObject2).c(); i++)
/* 1229:     */       {
/* 1230:1337 */         NBTTagCompound localfn = ((fv)localObject2).b(i);
/* 1231:1338 */         int j = localfn.d("Slot") & 0xFF;
/* 1232:1340 */         if ((j >= 2) && (j < this.bC.n_())) {
/* 1233:1341 */           this.bC.a(j, ItemStack.loadItemStackFromNBT(localfn));
/* 1234:     */         }
/* 1235:     */       }
/* 1236:     */     }
/* 1237:1346 */     if (paramfn.hasKey("ArmorItem", 10))
/* 1238:     */     {
/* 1239:1347 */       localObject2 = ItemStack.loadItemStackFromNBT(paramfn.getCompoundTag("ArmorItem"));
/* 1240:1348 */       if ((localObject2 != null) && (a(((ItemStack)localObject2).getItem()))) {
/* 1241:1349 */         this.bC.a(1, (ItemStack)localObject2);
/* 1242:     */       }
/* 1243:     */     }
/* 1244:1353 */     if (paramfn.hasKey("SaddleItem", 10))
/* 1245:     */     {
/* 1246:1354 */       localObject2 = ItemStack.loadItemStackFromNBT(paramfn.getCompoundTag("SaddleItem"));
/* 1247:1355 */       if ((localObject2 != null) && (((ItemStack)localObject2).getItem() == ItemList.saddle)) {
/* 1248:1356 */         this.bC.a(0, (ItemStack)localObject2);
/* 1249:     */       }
/* 1250:     */     }
/* 1251:1358 */     else if (paramfn.getBoolean("Saddle"))
/* 1252:     */     {
/* 1253:1359 */       this.bC.a(0, new ItemStack(ItemList.saddle));
/* 1254:     */     }
/* 1255:1361 */     cZ();
/* 1256:     */   }
/* 1257:     */   
/* 1258:     */   public boolean a(EntityAnimal paramabq)
/* 1259:     */   {
/* 1260:1366 */     if (paramabq == this) {
/* 1261:1367 */       return false;
/* 1262:     */     }
/* 1263:1369 */     if (paramabq.getClass() != getClass()) {
/* 1264:1370 */       return false;
/* 1265:     */     }
/* 1266:1373 */     EntityHorse localabt = (EntityHorse)paramabq;
/* 1267:1375 */     if ((!de()) || (!localabt.de())) {
/* 1268:1376 */       return false;
/* 1269:     */     }
/* 1270:1378 */     int i = cj();
/* 1271:1379 */     int j = localabt.cj();
/* 1272:     */     
/* 1273:1381 */     return (i == j) || ((i == 0) && (j == 1)) || ((i == 1) && (j == 0));
/* 1274:     */   }
/* 1275:     */   
/* 1276:     */   public EntityPassiveMob a(EntityPassiveMob paramws)
/* 1277:     */   {
/* 1278:1386 */     EntityHorse localabt1 = (EntityHorse)paramws;
/* 1279:1387 */     EntityHorse localabt2 = new EntityHorse(this.world);
/* 1280:     */     
/* 1281:1389 */     int i = cj();
/* 1282:1390 */     int j = localabt1.cj();
/* 1283:1391 */     int k = 0;
/* 1284:1393 */     if (i == j) {
/* 1285:1394 */       k = i;
/* 1286:1395 */     } else if (((i == 0) && (j == 1)) || ((i == 1) && (j == 0))) {
/* 1287:1396 */       k = 2;
/* 1288:     */     }
/* 1289:1400 */     if (k == 0)
/* 1290:     */     {
/* 1291:1402 */       int n = this.random.nextInt(9);
/* 1292:     */       int m;
/* 1293:1403 */       if (n < 4) {
/* 1294:1404 */         m = ck() & 0xFF;
/* 1295:1405 */       } else if (n < 8) {
/* 1296:1406 */         m = localabt1.ck() & 0xFF;
/* 1297:     */       } else {
/* 1298:1408 */         m = this.random.nextInt(7);
/* 1299:     */       }
/* 1300:1411 */       int i1 = this.random.nextInt(5);
/* 1301:1412 */       if (i1 < 2) {
/* 1302:1413 */         m |= ck() & 0xFF00;
/* 1303:1414 */       } else if (i1 < 4) {
/* 1304:1415 */         m |= localabt1.ck() & 0xFF00;
/* 1305:     */       } else {
/* 1306:1417 */         m |= this.random.nextInt(5) << 8 & 0xFF00;
/* 1307:     */       }
/* 1308:1419 */       localabt2.s(m);
/* 1309:     */     }
/* 1310:1422 */     localabt2.r(k);
/* 1311:     */     
/* 1312:     */ 
/* 1313:1425 */     double d1 = a(afs.a).b() + paramws.a(afs.a).b() + dg();
/* 1314:1426 */     localabt2.a(afs.a).a(d1 / 3.0D);
/* 1315:     */     
/* 1316:1428 */     double d2 = a(br).b() + paramws.a(br).b() + dh();
/* 1317:1429 */     localabt2.a(br).a(d2 / 3.0D);
/* 1318:     */     
/* 1319:1431 */     double d3 = a(afs.d).b() + paramws.a(afs.d).b() + di();
/* 1320:1432 */     localabt2.a(afs.d).a(d3 / 3.0D);
/* 1321:     */     
/* 1322:1434 */     return localabt2;
/* 1323:     */   }
/* 1324:     */   
/* 1325:     */   public xq beforeSpawn(vu paramvu, xq paramxq)
/* 1326:     */   {
/* 1327:1440 */     paramxq = super.beforeSpawn(paramvu, paramxq);
/* 1328:     */     
/* 1329:1442 */     int i = 0;
/* 1330:1443 */     int j = 0;
/* 1331:1445 */     if ((paramxq instanceof abv))
/* 1332:     */     {
/* 1333:1446 */       i = ((abv)paramxq).a;
/* 1334:1447 */       j = ((abv)paramxq).b & 0xFF | this.random.nextInt(5) << 8;
/* 1335:     */     }
/* 1336:     */     else
/* 1337:     */     {
/* 1338:1449 */       if (this.random.nextInt(10) == 0)
/* 1339:     */       {
/* 1340:1450 */         i = 1;
/* 1341:     */       }
/* 1342:     */       else
/* 1343:     */       {
/* 1344:1452 */         int k = this.random.nextInt(7);
/* 1345:1453 */         int m = this.random.nextInt(5);
/* 1346:1454 */         i = 0;
/* 1347:1455 */         j = k | m << 8;
/* 1348:     */       }
/* 1349:1457 */       paramxq = new abv(i, j);
/* 1350:     */     }
/* 1351:1460 */     r(i);
/* 1352:1461 */     s(j);
/* 1353:1463 */     if (this.random.nextInt(5) == 0) {
/* 1354:1464 */       b(-24000);
/* 1355:     */     }
/* 1356:1467 */     if ((i == 4) || (i == 3))
/* 1357:     */     {
/* 1358:1468 */       a(afs.a).a(15.0D);
/* 1359:1469 */       a(afs.d).a(0.2000000029802322D);
/* 1360:     */     }
/* 1361:     */     else
/* 1362:     */     {
/* 1363:1471 */       a(afs.a).a(dg());
/* 1364:1472 */       if (i == 0) {
/* 1365:1473 */         a(afs.d).a(di());
/* 1366:     */       } else {
/* 1367:1475 */         a(afs.d).a(0.1749999970197678D);
/* 1368:     */       }
/* 1369:     */     }
/* 1370:1478 */     if ((i == 2) || (i == 1)) {
/* 1371:1479 */       a(br).a(0.5D);
/* 1372:     */     } else {
/* 1373:1481 */       a(br).a(dh());
/* 1374:     */     }
/* 1375:1483 */     h(bt());
/* 1376:     */     
/* 1377:1485 */     return paramxq;
/* 1378:     */   }
/* 1379:     */   
/* 1380:     */   public float o(float paramFloat)
/* 1381:     */   {
/* 1382:1489 */     return this.bG + (this.bF - this.bG) * paramFloat;
/* 1383:     */   }
/* 1384:     */   
/* 1385:     */   public float p(float paramFloat)
/* 1386:     */   {
/* 1387:1493 */     return this.bI + (this.bH - this.bI) * paramFloat;
/* 1388:     */   }
/* 1389:     */   
/* 1390:     */   public float q(float paramFloat)
/* 1391:     */   {
/* 1392:1497 */     return this.bK + (this.bJ - this.bK) * paramFloat;
/* 1393:     */   }
/* 1394:     */   
/* 1395:     */   public void v(int paramInt)
/* 1396:     */   {
/* 1397:1501 */     if (cE())
/* 1398:     */     {
/* 1399:1502 */       if (paramInt < 0)
/* 1400:     */       {
/* 1401:1503 */         paramInt = 0;
/* 1402:     */       }
/* 1403:     */       else
/* 1404:     */       {
/* 1405:1505 */         this.bE = true;
/* 1406:1506 */         df();
/* 1407:     */       }
/* 1408:1509 */       if (paramInt >= 90) {
/* 1409:1510 */         this.bp = 1.0F;
/* 1410:     */       } else {
/* 1411:1512 */         this.bp = (0.4F + 0.4F * paramInt / 90.0F);
/* 1412:     */       }
/* 1413:     */     }
/* 1414:     */   }
/* 1415:     */   
/* 1416:     */   protected void t(boolean paramBoolean)
/* 1417:     */   {
/* 1418:1518 */     ew localew = paramBoolean ? ew.I : ew.l;
/* 1419:1520 */     for (int i = 0; i < 7; i++)
/* 1420:     */     {
/* 1421:1521 */       double d1 = this.random.nextGaussian() * 0.02D;
/* 1422:1522 */       double d2 = this.random.nextGaussian() * 0.02D;
/* 1423:1523 */       double d3 = this.random.nextGaussian() * 0.02D;
/* 1424:1524 */       this.world.a(localew, this.xPos + this.random.nextFloat() * this.J * 2.0F - this.J, this.yPos + 0.5D + this.random.nextFloat() * this.K, this.zPos + this.random.nextFloat() * this.J * 2.0F - this.J, d1, d2, d3, new int[0]);
/* 1425:     */     }
/* 1426:     */   }
/* 1427:     */   
/* 1428:     */   public void a(byte paramByte)
/* 1429:     */   {
/* 1430:1530 */     if (paramByte == 7) {
/* 1431:1531 */       t(true);
/* 1432:1532 */     } else if (paramByte == 6) {
/* 1433:1533 */       t(false);
/* 1434:     */     } else {
/* 1435:1535 */       super.a(paramByte);
/* 1436:     */     }
/* 1437:     */   }
/* 1438:     */   
/* 1439:     */   public void al()
/* 1440:     */   {
/* 1441:1541 */     super.al();
/* 1442:1543 */     if (this.bI > 0.0F)
/* 1443:     */     {
/* 1444:1544 */       float f1 = MathUtils.sin(this.aG * 3.141593F / 180.0F);
/* 1445:1545 */       float f2 = MathUtils.cos(this.aG * 3.141593F / 180.0F);
/* 1446:1546 */       float f3 = 0.7F * this.bI;
/* 1447:1547 */       float f4 = 0.15F * this.bI;
/* 1448:     */       
/* 1449:1549 */       this.rider.b(this.xPos + f3 * f1, this.yPos + an() + this.rider.am() + f4, this.zPos - f3 * f2);
/* 1450:1550 */       if ((this.rider instanceof EntityLiving)) {
/* 1451:1551 */         ((EntityLiving)this.rider).aG = this.aG;
/* 1452:     */       }
/* 1453:     */     }
/* 1454:     */   }
/* 1455:     */   
/* 1456:     */   private float dg()
/* 1457:     */   {
/* 1458:1558 */     return 15.0F + this.random.nextInt(8) + this.random.nextInt(9);
/* 1459:     */   }
/* 1460:     */   
/* 1461:     */   private double dh()
/* 1462:     */   {
/* 1463:1562 */     return 0.4000000059604645D + this.random.nextDouble() * 0.2D + this.random.nextDouble() * 0.2D + this.random.nextDouble() * 0.2D;
/* 1464:     */   }
/* 1465:     */   
/* 1466:     */   private double di()
/* 1467:     */   {
/* 1468:1566 */     return (0.449999988079071D + this.random.nextDouble() * 0.3D + this.random.nextDouble() * 0.3D + this.random.nextDouble() * 0.3D) * 0.25D;
/* 1469:     */   }
/* 1470:     */   
/* 1471:     */   public static boolean a(Item paramalq)
/* 1472:     */   {
/* 1473:1580 */     return (paramalq == ItemList.ck) || (paramalq == ItemList.cl) || (paramalq == ItemList.cm);
/* 1474:     */   }
/* 1475:     */   
/* 1476:     */   public boolean j_()
/* 1477:     */   {
/* 1478:1586 */     return false;
/* 1479:     */   }
/* 1480:     */   
/* 1481:     */   public float aR()
/* 1482:     */   {
/* 1483:1591 */     return this.K;
/* 1484:     */   }
/* 1485:     */   
/* 1486:     */   public boolean d(int paramInt, ItemStack paramamj)
/* 1487:     */   {
/* 1488:1596 */     if ((paramInt == 499) && (cN()))
/* 1489:     */     {
/* 1490:1597 */       if ((paramamj == null) && (cu()))
/* 1491:     */       {
/* 1492:1598 */         o(false);
/* 1493:1599 */         cY();
/* 1494:1600 */         return true;
/* 1495:     */       }
/* 1496:1601 */       if ((paramamj != null) && (paramamj.getItem() == Item.fromProtoBlock(BlockList.ae)) && (!cu()))
/* 1497:     */       {
/* 1498:1602 */         o(true);
/* 1499:1603 */         cY();
/* 1500:1604 */         return true;
/* 1501:     */       }
/* 1502:     */     }
/* 1503:1607 */     int i = paramInt - 400;
/* 1504:1608 */     if ((i >= 0) && (i < 2) && (i < this.bC.n_()))
/* 1505:     */     {
/* 1506:1609 */       if ((i == 0) && (paramamj != null) && (paramamj.getItem() != ItemList.saddle)) {
/* 1507:1610 */         return false;
/* 1508:     */       }
/* 1509:1611 */       if ((i == 1) && (((paramamj != null) && (!a(paramamj.getItem()))) || (!cM()))) {
/* 1510:1612 */         return false;
/* 1511:     */       }
/* 1512:1614 */       this.bC.a(i, paramamj);
/* 1513:1615 */       cZ();
/* 1514:1616 */       return true;
/* 1515:     */     }
/* 1516:1618 */     int j = paramInt - 500 + 2;
/* 1517:1619 */     if ((j >= 2) && (j < this.bC.n_()))
/* 1518:     */     {
/* 1519:1620 */       this.bC.a(j, paramamj);
/* 1520:1621 */       return true;
/* 1521:     */     }
/* 1522:1623 */     return false;
/* 1523:     */   }
/* 1524:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abt
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*    1:     */ import com.google.common.base.Charsets;
/*    2:     */ import com.google.common.collect.Lists;
/*    3:     */ import com.mojang.authlib.GameProfile;
/*    4:     */ import java.util.Collection;
/*    5:     */ import java.util.List;
/*    6:     */ import java.util.Map;
/*    7:     */ import java.util.Random;
/*    8:     */ import java.util.UUID;
/*    9:     */ 
/*   10:     */ public abstract class EntityPlayer
/*   11:     */   extends EntityLiving
/*   12:     */ {
/*   13: 119 */   public ahb bg = new ahb(this);
/*   14: 120 */   private ajh a = new ajh();
/*   15:     */   public aib bh;
/*   16:     */   public aib bi;
/*   17: 124 */   protected ahz bj = new ahz();
/*   18:     */   protected int bk;
/*   19:     */   public float bl;
/*   20:     */   public float bm;
/*   21:     */   public int bn;
/*   22:     */   public double bo;
/*   23:     */   public double bp;
/*   24:     */   public double bq;
/*   25:     */   public double br;
/*   26:     */   public double bs;
/*   27:     */   public double bt;
/*   28:     */   protected boolean bu;
/*   29:     */   public BlockPosition bv;
/*   30:     */   private int b;
/*   31:     */   public float bw;
/*   32:     */   public float bX;
/*   33:     */   public float bx;
/*   34:     */   private BlockPosition c;
/*   35:     */   private boolean d;
/*   36:     */   private BlockPosition e;
/*   37: 146 */   public aha by = new aha();
/*   38:     */   public int bz;
/*   39:     */   public int bA;
/*   40:     */   public float bB;
/*   41:     */   private int f;
/*   42:     */   private ItemStack g;
/*   43:     */   private int h;
/*   44: 154 */   protected float bC = 0.1F;
/*   45: 155 */   protected float bD = 0.02F;
/*   46:     */   private int i;
/*   47:     */   private final GameProfile bF;
/*   48: 158 */   private boolean bG = false;
/*   49:     */   public EntityFishHook bE;
/*   50:     */   
/*   51:     */   public EntityPlayer(World paramaqu, GameProfile paramGameProfile)
/*   52:     */   {
/*   53: 161 */     super(paramaqu);
/*   54: 162 */     this.uuid = a(paramGameProfile);
/*   55:     */     
/*   56: 164 */     this.bF = paramGameProfile;
/*   57:     */     
/*   58: 166 */     this.bh = new ajb(this.bg, !paramaqu.isClient, this);
/*   59: 167 */     this.bi = this.bh;
/*   60:     */     
/*   61: 169 */     BlockPosition localdt = paramaqu.getWorldSpawn();
/*   62: 170 */     setPositionAndAngles(localdt.getX() + 0.5D, localdt.getY() + 1, localdt.getZ() + 0.5D, 0.0F, 0.0F);
/*   63:     */     
/*   64: 172 */     this.aT = 180.0F;
/*   65: 173 */     this.X = 20;
/*   66:     */   }
/*   67:     */   
/*   68:     */   protected void aW()
/*   69:     */   {
/*   70: 178 */     super.aW();
/*   71:     */     
/*   72: 180 */     bx().b(afs.e).a(1.0D);
/*   73: 181 */     a(afs.d).a(0.1000000014901161D);
/*   74:     */   }
/*   75:     */   
/*   76:     */   protected void h()
/*   77:     */   {
/*   78: 186 */     super.h();
/*   79:     */     
/*   80: 188 */     this.ac.a(16, Byte.valueOf((byte)0));
/*   81: 189 */     this.ac.a(17, Float.valueOf(0.0F));
/*   82: 190 */     this.ac.a(18, Integer.valueOf(0));
/*   83: 191 */     this.ac.a(10, Byte.valueOf((byte)0));
/*   84:     */   }
/*   85:     */   
/*   86:     */   public ItemStack bP()
/*   87:     */   {
/*   88: 195 */     return this.g;
/*   89:     */   }
/*   90:     */   
/*   91:     */   public int bQ()
/*   92:     */   {
/*   93: 199 */     return this.h;
/*   94:     */   }
/*   95:     */   
/*   96:     */   public boolean bR()
/*   97:     */   {
/*   98: 203 */     return this.g != null;
/*   99:     */   }
/*  100:     */   
/*  101:     */   public int bS()
/*  102:     */   {
/*  103: 207 */     if (bR()) {
/*  104: 208 */       return this.g.l() - this.h;
/*  105:     */     }
/*  106: 210 */     return 0;
/*  107:     */   }
/*  108:     */   
/*  109:     */   public void bT()
/*  110:     */   {
/*  111: 214 */     if (this.g != null) {
/*  112: 215 */       this.g.b(this.world, this, this.h);
/*  113:     */     }
/*  114: 217 */     bU();
/*  115:     */   }
/*  116:     */   
/*  117:     */   public void bU()
/*  118:     */   {
/*  119: 221 */     this.g = null;
/*  120: 222 */     this.h = 0;
/*  121: 223 */     if (!this.world.isClient) {
/*  122: 224 */       f(false);
/*  123:     */     }
/*  124:     */   }
/*  125:     */   
/*  126:     */   public boolean bV()
/*  127:     */   {
/*  128: 229 */     return (bR()) && (this.g.getItem().e(this.g) == ano.d);
/*  129:     */   }
/*  130:     */   
/*  131:     */   public void onUpdate()
/*  132:     */   {
/*  133: 234 */     this.T = v();
/*  134: 235 */     if (v()) {
/*  135: 236 */       this.C = false;
/*  136:     */     }
/*  137: 238 */     if (this.g != null)
/*  138:     */     {
/*  139: 239 */       ItemStack localamj = this.bg.h();
/*  140: 240 */       if (localamj == this.g)
/*  141:     */       {
/*  142: 241 */         if ((this.h <= 25) && (this.h % 4 == 0)) {
/*  143: 242 */           b(localamj, 5);
/*  144:     */         }
/*  145: 244 */         if ((--this.h == 0) && 
/*  146: 245 */           (!this.world.isClient)) {
/*  147: 246 */           s();
/*  148:     */         }
/*  149:     */       }
/*  150:     */       else
/*  151:     */       {
/*  152: 250 */         bU();
/*  153:     */       }
/*  154:     */     }
/*  155: 254 */     if (this.bn > 0) {
/*  156: 255 */       this.bn -= 1;
/*  157:     */     }
/*  158: 257 */     if (bI())
/*  159:     */     {
/*  160: 258 */       this.b += 1;
/*  161: 259 */       if (this.b > 100) {
/*  162: 260 */         this.b = 100;
/*  163:     */       }
/*  164: 263 */       if (!this.world.isClient) {
/*  165: 264 */         if (!p()) {
/*  166: 265 */           a(true, true, false);
/*  167: 266 */         } else if (this.world.w()) {
/*  168: 267 */           a(false, true, true);
/*  169:     */         }
/*  170:     */       }
/*  171:     */     }
/*  172: 270 */     else if (this.b > 0)
/*  173:     */     {
/*  174: 271 */       this.b += 1;
/*  175: 272 */       if (this.b >= 110) {
/*  176: 273 */         this.b = 0;
/*  177:     */       }
/*  178:     */     }
/*  179: 277 */     super.onUpdate();
/*  180: 279 */     if ((!this.world.isClient) && 
/*  181: 280 */       (this.bi != null) && (!this.bi.a(this)))
/*  182:     */     {
/*  183: 281 */       n();
/*  184: 282 */       this.bi = this.bh;
/*  185:     */     }
/*  186: 286 */     if ((au()) && (this.by.a)) {
/*  187: 287 */       N();
/*  188:     */     }
/*  189: 290 */     this.bo = this.br;
/*  190: 291 */     this.bp = this.bs;
/*  191: 292 */     this.bq = this.bt;
/*  192:     */     
/*  193: 294 */     double d1 = this.xPos - this.br;
/*  194: 295 */     double d2 = this.yPos - this.bs;
/*  195: 296 */     double d3 = this.zPos - this.bt;
/*  196:     */     
/*  197: 298 */     double d4 = 10.0D;
/*  198: 299 */     if (d1 > d4) {
/*  199: 300 */       this.bo = (this.br = this.xPos);
/*  200:     */     }
/*  201: 302 */     if (d3 > d4) {
/*  202: 303 */       this.bq = (this.bt = this.zPos);
/*  203:     */     }
/*  204: 305 */     if (d2 > d4) {
/*  205: 306 */       this.bp = (this.bs = this.yPos);
/*  206:     */     }
/*  207: 308 */     if (d1 < -d4) {
/*  208: 309 */       this.bo = (this.br = this.xPos);
/*  209:     */     }
/*  210: 311 */     if (d3 < -d4) {
/*  211: 312 */       this.bq = (this.bt = this.zPos);
/*  212:     */     }
/*  213: 314 */     if (d2 < -d4) {
/*  214: 315 */       this.bp = (this.bs = this.yPos);
/*  215:     */     }
/*  216: 318 */     this.br += d1 * 0.25D;
/*  217: 319 */     this.bt += d3 * 0.25D;
/*  218: 320 */     this.bs += d2 * 0.25D;
/*  219: 322 */     if (this.vehicle == null) {
/*  220: 323 */       this.e = null;
/*  221:     */     }
/*  222: 326 */     if (!this.world.isClient)
/*  223:     */     {
/*  224: 327 */       this.bj.a(this);
/*  225: 328 */       b(StatList.g);
/*  226: 329 */       if (ai()) {
/*  227: 330 */         b(StatList.h);
/*  228:     */       }
/*  229:     */     }
/*  230: 334 */     int j = 29999999;
/*  231: 335 */     double d5 = MathUtils.clamp(this.xPos, -29999999.0D, 29999999.0D);
/*  232: 336 */     double d6 = MathUtils.clamp(this.zPos, -29999999.0D, 29999999.0D);
/*  233: 337 */     if ((d5 != this.xPos) || (d6 != this.zPos)) {
/*  234: 338 */       b(d5, this.yPos, d6);
/*  235:     */     }
/*  236:     */   }
/*  237:     */   
/*  238:     */   public int L()
/*  239:     */   {
/*  240: 344 */     return this.by.a ? 0 : 80;
/*  241:     */   }
/*  242:     */   
/*  243:     */   protected String P()
/*  244:     */   {
/*  245: 349 */     return "game.player.swim";
/*  246:     */   }
/*  247:     */   
/*  248:     */   protected String aa()
/*  249:     */   {
/*  250: 354 */     return "game.player.swim.splash";
/*  251:     */   }
/*  252:     */   
/*  253:     */   public int ar()
/*  254:     */   {
/*  255: 359 */     return 10;
/*  256:     */   }
/*  257:     */   
/*  258:     */   public void a(String paramString, float paramFloat1, float paramFloat2)
/*  259:     */   {
/*  260: 366 */     this.world.a(this, paramString, paramFloat1, paramFloat2);
/*  261:     */   }
/*  262:     */   
/*  263:     */   protected void b(ItemStack paramamj, int paramInt)
/*  264:     */   {
/*  265: 370 */     if (paramamj.m() == ano.c) {
/*  266: 371 */       a("random.drink", 0.5F, this.world.rng.nextFloat() * 0.1F + 0.9F);
/*  267:     */     }
/*  268: 373 */     if (paramamj.m() == ano.b)
/*  269:     */     {
/*  270: 374 */       for (int j = 0; j < paramInt; j++)
/*  271:     */       {
/*  272: 375 */         Vec3 localbrw1 = new Vec3((this.random.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
/*  273: 376 */         localbrw1 = localbrw1.a(-this.pitch * 3.141593F / 180.0F);
/*  274: 377 */         localbrw1 = localbrw1.b(-this.yaw * 3.141593F / 180.0F);
/*  275:     */         
/*  276: 379 */         double d1 = -this.random.nextFloat() * 0.6D - 0.3D;
/*  277: 380 */         Vec3 localbrw2 = new Vec3((this.random.nextFloat() - 0.5D) * 0.3D, d1, 0.6D);
/*  278: 381 */         localbrw2 = localbrw2.a(-this.pitch * 3.141593F / 180.0F);
/*  279: 382 */         localbrw2 = localbrw2.b(-this.yaw * 3.141593F / 180.0F);
/*  280: 383 */         localbrw2 = localbrw2.b(this.xPos, this.yPos + aR(), this.zPos);
/*  281: 384 */         if (paramamj.f()) {
/*  282: 385 */           this.world.a(ew.K, localbrw2.x, localbrw2.y, localbrw2.z, localbrw1.x, localbrw1.y + 0.05D, localbrw1.z, new int[] { Item.b(paramamj.getItem()), paramamj.i() });
/*  283:     */         } else {
/*  284: 387 */           this.world.a(ew.K, localbrw2.x, localbrw2.y, localbrw2.z, localbrw1.x, localbrw1.y + 0.05D, localbrw1.z, new int[] { Item.b(paramamj.getItem()) });
/*  285:     */         }
/*  286:     */       }
/*  287: 390 */       a("random.eat", 0.5F + 0.5F * this.random.nextInt(2), (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
/*  288:     */     }
/*  289:     */   }
/*  290:     */   
/*  291:     */   protected void s()
/*  292:     */   {
/*  293: 395 */     if (this.g != null)
/*  294:     */     {
/*  295: 396 */       b(this.g, 16);
/*  296:     */       
/*  297: 398 */       int j = this.g.stackSize;
/*  298: 399 */       ItemStack localamj = this.g.b(this.world, this);
/*  299: 400 */       if ((localamj != this.g) || ((localamj != null) && (localamj.stackSize != j)))
/*  300:     */       {
/*  301: 401 */         this.bg.a[this.bg.c] = localamj;
/*  302: 402 */         if (localamj.stackSize == 0) {
/*  303: 403 */           this.bg.a[this.bg.c] = null;
/*  304:     */         }
/*  305:     */       }
/*  306: 406 */       bU();
/*  307:     */     }
/*  308:     */   }
/*  309:     */   
/*  310:     */   public void a(byte paramByte)
/*  311:     */   {
/*  312: 412 */     if (paramByte == 9) {
/*  313: 413 */       s();
/*  314: 414 */     } else if (paramByte == 23) {
/*  315: 415 */       this.bG = false;
/*  316: 416 */     } else if (paramByte == 22) {
/*  317: 417 */       this.bG = true;
/*  318:     */     } else {
/*  319: 419 */       super.a(paramByte);
/*  320:     */     }
/*  321:     */   }
/*  322:     */   
/*  323:     */   protected boolean bC()
/*  324:     */   {
/*  325: 425 */     return (getHealth() <= 0.0F) || (bI());
/*  326:     */   }
/*  327:     */   
/*  328:     */   protected void n()
/*  329:     */   {
/*  330: 429 */     this.bi = this.bh;
/*  331:     */   }
/*  332:     */   
/*  333:     */   public void updateVehicle()
/*  334:     */   {
/*  335: 434 */     if ((!this.world.isClient) && (aw()))
/*  336:     */     {
/*  337: 435 */       mount((Entity)null);
/*  338: 436 */       c(false);
/*  339: 437 */       return;
/*  340:     */     }
/*  341: 440 */     double d1 = this.xPos;double d2 = this.yPos;double d3 = this.zPos;
/*  342: 441 */     float f1 = this.yaw;float f2 = this.pitch;
/*  343:     */     
/*  344: 443 */     super.updateVehicle();
/*  345: 444 */     this.bl = this.bm;
/*  346: 445 */     this.bm = 0.0F;
/*  347:     */     
/*  348: 447 */     l(this.xPos - d1, this.yPos - d2, this.zPos - d3);
/*  349: 449 */     if ((this.vehicle instanceof EntityPig))
/*  350:     */     {
/*  351: 450 */       this.pitch = f2;
/*  352: 451 */       this.yaw = f1;
/*  353: 452 */       this.aG = ((EntityPig)this.vehicle).aG;
/*  354:     */     }
/*  355:     */   }
/*  356:     */   
/*  357:     */   public void prepareForSpawn()
/*  358:     */   {
/*  359: 458 */     a(0.6F, 1.8F);
/*  360: 459 */     super.prepareForSpawn();
/*  361: 460 */     h(bt());
/*  362: 461 */     this.deathTime = 0;
/*  363:     */   }
/*  364:     */   
/*  365:     */   protected void bJ()
/*  366:     */   {
/*  367: 466 */     super.bJ();
/*  368: 467 */     bw();
/*  369:     */     
/*  370: 469 */     this.aI = this.yaw;
/*  371:     */   }
/*  372:     */   
/*  373:     */   public void m()
/*  374:     */   {
/*  375: 474 */     if (this.bk > 0) {
/*  376: 475 */       this.bk -= 1;
/*  377:     */     }
/*  378: 478 */     if ((this.world.getDifficulty() == EnumDifficulty.PEACEFUL) && (this.world.getGameRules().getBoolean("naturalRegeneration")))
/*  379:     */     {
/*  380: 479 */       if ((getHealth() < bt()) && 
/*  381: 480 */         (this.W % 20 == 0)) {
/*  382: 481 */         g(1.0F);
/*  383:     */       }
/*  384: 484 */       if ((this.bj.c()) && 
/*  385: 485 */         (this.W % 10 == 0)) {
/*  386: 486 */         this.bj.a(this.bj.a() + 1);
/*  387:     */       }
/*  388:     */     }
/*  389: 490 */     this.bg.k();
/*  390: 491 */     this.bl = this.bm;
/*  391:     */     
/*  392: 493 */     super.m();
/*  393:     */     
/*  394: 495 */     xz localxz = a(afs.d);
/*  395: 496 */     if (!this.world.isClient) {
/*  396: 497 */       localxz.a(this.by.b());
/*  397:     */     }
/*  398: 499 */     this.aK = this.bD;
/*  399: 500 */     if (ax()) {
/*  400: 501 */       this.aK = ((float)(this.aK + this.bD * 0.3D));
/*  401:     */     }
/*  402: 504 */     j((float)localxz.e());
/*  403:     */     
/*  404: 506 */     float f1 = MathUtils.a(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/*  405: 507 */     float f2 = (float)(Math.atan(-this.yVelocity * 0.2000000029802322D) * 15.0D);
/*  406: 508 */     if (f1 > 0.1F) {
/*  407: 509 */       f1 = 0.1F;
/*  408:     */     }
/*  409: 511 */     if ((!this.C) || (getHealth() <= 0.0F)) {
/*  410: 512 */       f1 = 0.0F;
/*  411:     */     }
/*  412: 514 */     if ((this.C) || (getHealth() <= 0.0F)) {
/*  413: 515 */       f2 = 0.0F;
/*  414:     */     }
/*  415: 517 */     this.bm += (f1 - this.bm) * 0.4F;
/*  416: 518 */     this.aD += (f2 - this.aD) * 0.8F;
/*  417: 520 */     if ((getHealth() > 0.0F) && (!v()))
/*  418:     */     {
/*  419: 521 */       AABB localbrt = null;
/*  420: 522 */       if ((this.vehicle != null) && (!this.vehicle.isDead)) {
/*  421: 525 */         localbrt = getAABB().a(this.vehicle.getAABB()).expand(1.0D, 0.0D, 1.0D);
/*  422:     */       } else {
/*  423: 527 */         localbrt = getAABB().expand(1.0D, 0.5D, 1.0D);
/*  424:     */       }
/*  425: 530 */       List<Entity> localList = this.world.b(this, localbrt);
/*  426: 531 */       for (int j = 0; j < localList.size(); j++)
/*  427:     */       {
/*  428: 532 */         Entity localwv = localList.get(j);
/*  429: 533 */         if (!localwv.isDead) {
/*  430: 534 */           d(localwv);
/*  431:     */         }
/*  432:     */       }
/*  433:     */     }
/*  434:     */   }
/*  435:     */   
/*  436:     */   private void d(Entity paramwv)
/*  437:     */   {
/*  438: 541 */     paramwv.d(this);
/*  439:     */   }
/*  440:     */   
/*  441:     */   public int bW()
/*  442:     */   {
/*  443: 545 */     return this.ac.c(18);
/*  444:     */   }
/*  445:     */   
/*  446:     */   public void r(int paramInt)
/*  447:     */   {
/*  448: 549 */     this.ac.b(18, Integer.valueOf(paramInt));
/*  449:     */   }
/*  450:     */   
/*  451:     */   public void s(int paramInt)
/*  452:     */   {
/*  453: 553 */     int j = bW();
/*  454: 554 */     this.ac.b(18, Integer.valueOf(j + paramInt));
/*  455:     */   }
/*  456:     */   
/*  457:     */   public void a(wh paramwh)
/*  458:     */   {
/*  459: 559 */     super.a(paramwh);
/*  460: 560 */     a(0.2F, 0.2F);
/*  461: 561 */     b(this.xPos, this.yPos, this.zPos);
/*  462: 562 */     this.yVelocity = 0.1000000014901161D;
/*  463: 564 */     if (getName().equals("Notch")) {
/*  464: 565 */       a(new ItemStack(ItemList.apple, 1), true, false);
/*  465:     */     }
/*  466: 567 */     if (!this.world.getGameRules().getBoolean("keepInventory")) {
/*  467: 568 */       this.bg.n();
/*  468:     */     }
/*  469: 571 */     if (paramwh != null)
/*  470:     */     {
/*  471: 572 */       this.xVelocity = (-MathUtils.cos((this.au + this.yaw) * 3.141593F / 180.0F) * 0.1F);
/*  472: 573 */       this.zVelocity = (-MathUtils.sin((this.au + this.yaw) * 3.141593F / 180.0F) * 0.1F);
/*  473:     */     }
/*  474:     */     else
/*  475:     */     {
/*  476: 575 */       this.xVelocity = (this.zVelocity = 0.0D);
/*  477:     */     }
/*  478: 578 */     b(StatList.y);
/*  479: 579 */     a(StatList.h);
/*  480:     */   }
/*  481:     */   
/*  482:     */   protected String bn()
/*  483:     */   {
/*  484: 584 */     return "game.player.hurt";
/*  485:     */   }
/*  486:     */   
/*  487:     */   protected String bo()
/*  488:     */   {
/*  489: 589 */     return "game.player.die";
/*  490:     */   }
/*  491:     */   
/*  492:     */   public void b(Entity paramwv, int paramInt)
/*  493:     */   {
/*  494: 594 */     s(paramInt);
/*  495: 595 */     Collection<bry> localCollection = co().a(bsk.f);
/*  496: 597 */     if ((paramwv instanceof EntityPlayer))
/*  497:     */     {
/*  498: 598 */       b(StatList.B);
/*  499: 599 */       localCollection.addAll(co().a(bsk.e));
/*  500: 600 */       localCollection.addAll(e(paramwv));
/*  501:     */     }
/*  502:     */     else
/*  503:     */     {
/*  504: 602 */       b(StatList.z);
/*  505:     */     }
/*  506: 605 */     for (bry localbry : localCollection)
/*  507:     */     {
/*  508: 606 */       bsa localbsa = co().c(getName(), localbry);
/*  509: 607 */       localbsa.a();
/*  510:     */     }
/*  511:     */   }
/*  512:     */   
/*  513:     */   private Collection<bry> e(Entity paramwv)
/*  514:     */   {
/*  515: 612 */     brz localbrz1 = co().h(getName());
/*  516: 613 */     if (localbrz1 != null)
/*  517:     */     {
/*  518: 614 */       int j = localbrz1.l().b();
/*  519: 615 */       if ((j >= 0) && (j < bsk.i.length)) {
/*  520: 616 */         for (bry localbry : co().a(bsk.i[j]))
/*  521:     */         {
/*  522: 617 */           bsa localbsa = co().c(paramwv.getName(), localbry);
/*  523: 618 */           localbsa.a();
/*  524:     */         }
/*  525:     */       }
/*  526:     */     }
/*  527: 623 */     brz localbrz2 = co().h(paramwv.getName());
/*  528: 624 */     if (localbrz2 != null)
/*  529:     */     {
/*  530: 625 */       int k = localbrz2.l().b();
/*  531: 626 */       if ((k >= 0) && (k < bsk.h.length)) {
/*  532: 627 */         return co().a(bsk.h[k]);
/*  533:     */       }
/*  534:     */     }
/*  535: 630 */     return Lists.newArrayList();
/*  536:     */   }
/*  537:     */   
/*  538:     */   public EntityItem a(boolean paramBoolean)
/*  539:     */   {
/*  540: 639 */     return a(this.bg.a(this.bg.c, (paramBoolean) && (this.bg.h() != null) ? this.bg.h().stackSize : 1), false, true);
/*  541:     */   }
/*  542:     */   
/*  543:     */   public EntityItem a(ItemStack paramamj, boolean paramBoolean)
/*  544:     */   {
/*  545: 644 */     return a(paramamj, false, false);
/*  546:     */   }
/*  547:     */   
/*  548:     */   public EntityItem a(ItemStack paramamj, boolean paramBoolean1, boolean paramBoolean2)
/*  549:     */   {
/*  550: 649 */     if (paramamj == null) {
/*  551: 650 */       return null;
/*  552:     */     }
/*  553: 652 */     if (paramamj.stackSize == 0) {
/*  554: 653 */       return null;
/*  555:     */     }
/*  556: 656 */     double d1 = this.yPos - 0.300000011920929D + aR();
/*  557: 657 */     EntityItem localadw = new EntityItem(this.world, this.xPos, d1, this.zPos, paramamj);
/*  558: 658 */     localadw.a(40);
/*  559: 660 */     if (paramBoolean2) {
/*  560: 661 */       localadw.setThrower(getName());
/*  561:     */     }
/*  562:     */     float f1;
/*  563:     */     float f2;
/*  564: 664 */     if (paramBoolean1)
/*  565:     */     {
/*  566: 665 */       f1 = this.random.nextFloat() * 0.5F;
/*  567: 666 */       f2 = this.random.nextFloat() * 3.141593F * 2.0F;
/*  568: 667 */       localadw.xVelocity = (-MathUtils.sin(f2) * f1);
/*  569: 668 */       localadw.zVelocity = (MathUtils.cos(f2) * f1);
/*  570: 669 */       localadw.yVelocity = 0.2000000029802322D;
/*  571:     */     }
/*  572:     */     else
/*  573:     */     {
/*  574: 672 */       f1 = 0.3F;
/*  575: 673 */       localadw.xVelocity = (-MathUtils.sin(this.yaw / 180.0F * 3.141593F) * MathUtils.cos(this.pitch / 180.0F * 3.141593F) * f1);
/*  576: 674 */       localadw.zVelocity = (MathUtils.cos(this.yaw / 180.0F * 3.141593F) * MathUtils.cos(this.pitch / 180.0F * 3.141593F) * f1);
/*  577: 675 */       localadw.yVelocity = (-MathUtils.sin(this.pitch / 180.0F * 3.141593F) * f1 + 0.1F);
/*  578:     */       
/*  579: 677 */       f2 = this.random.nextFloat() * 3.141593F * 2.0F;
/*  580: 678 */       f1 = 0.02F * this.random.nextFloat();
/*  581: 679 */       localadw.xVelocity += Math.cos(f2) * f1;
/*  582: 680 */       localadw.yVelocity += (this.random.nextFloat() - this.random.nextFloat()) * 0.1F;
/*  583: 681 */       localadw.zVelocity += Math.sin(f2) * f1;
/*  584:     */     }
/*  585: 684 */     a(localadw);
/*  586: 685 */     if (paramBoolean2) {
/*  587: 686 */       b(StatList.v);
/*  588:     */     }
/*  589: 689 */     return localadw;
/*  590:     */   }
/*  591:     */   
/*  592:     */   protected void a(EntityItem paramadw)
/*  593:     */   {
/*  594: 693 */     this.world.spawnEntity(paramadw);
/*  595:     */   }
/*  596:     */   
/*  597:     */   public float a(ProtoBlock paramatr)
/*  598:     */   {
/*  599: 697 */     float f1 = this.bg.a(paramatr);
/*  600: 698 */     if (f1 > 1.0F)
/*  601:     */     {
/*  602: 699 */       int j = aph.c(this);
/*  603: 700 */       ItemStack localamj = this.bg.h();
/*  604: 702 */       if ((j > 0) && (localamj != null)) {
/*  605: 703 */         f1 += j * j + 1;
/*  606:     */       }
/*  607:     */     }
/*  608: 707 */     if (a(Potion.e)) {
/*  609: 708 */       f1 *= (1.0F + (b(Potion.e).c() + 1) * 0.2F);
/*  610:     */     }
/*  611: 710 */     if (a(Potion.f))
/*  612:     */     {
/*  613: 713 */       float f2 = 1.0F;
/*  614: 714 */       switch (b(Potion.f).c())
/*  615:     */       {
/*  616:     */       case 0: 
/*  617: 716 */         f2 = 0.3F;
/*  618: 717 */         break;
/*  619:     */       case 1: 
/*  620: 719 */         f2 = 0.09F;
/*  621: 720 */         break;
/*  622:     */       case 2: 
/*  623: 722 */         f2 = 0.0027F;
/*  624: 723 */         break;
/*  625:     */       case 3: 
/*  626:     */       default: 
/*  627: 726 */         f2 = 0.00081F;
/*  628:     */       }
/*  629: 729 */       f1 *= f2;
/*  630:     */     }
/*  631: 732 */     if ((a(Material.water)) && (!aph.j(this))) {
/*  632: 733 */       f1 /= 5.0F;
/*  633:     */     }
/*  634: 735 */     if (!this.C) {
/*  635: 736 */       f1 /= 5.0F;
/*  636:     */     }
/*  637: 739 */     return f1;
/*  638:     */   }
/*  639:     */   
/*  640:     */   public boolean canHarvestBlock(ProtoBlock paramatr)
/*  641:     */   {
/*  642: 743 */     return this.bg.canHarvestBlock(paramatr);
/*  643:     */   }
/*  644:     */   
/*  645:     */   public void readEntityFromNBT(NBTTagCompound paramfn)
/*  646:     */   {
/*  647: 749 */     super.readEntityFromNBT(paramfn);
/*  648: 750 */     this.uuid = a(this.bF);
/*  649: 751 */     fv localfv1 = paramfn.c("Inventory", 10);
/*  650: 752 */     this.bg.b(localfv1);
/*  651: 753 */     this.bg.c = paramfn.getInteger("SelectedItemSlot");
/*  652: 754 */     this.bu = paramfn.getBoolean("Sleeping");
/*  653: 755 */     this.b = paramfn.e("SleepTimer");
/*  654:     */     
/*  655: 757 */     this.bB = paramfn.getFloat("XpP");
/*  656: 758 */     this.bz = paramfn.getInteger("XpLevel");
/*  657: 759 */     this.bA = paramfn.getInteger("XpTotal");
/*  658: 760 */     this.f = paramfn.getInteger("XpSeed");
/*  659: 761 */     if (this.f == 0) {
/*  660: 762 */       this.f = this.random.nextInt();
/*  661:     */     }
/*  662: 764 */     r(paramfn.getInteger("Score"));
/*  663: 766 */     if (this.bu)
/*  664:     */     {
/*  665: 767 */       this.bv = new BlockPosition(this);
/*  666: 768 */       a(true, true, false);
/*  667:     */     }
/*  668: 771 */     if ((paramfn.hasKey("SpawnX", 99)) && (paramfn.hasKey("SpawnY", 99)) && (paramfn.hasKey("SpawnZ", 99)))
/*  669:     */     {
/*  670: 772 */       this.c = new BlockPosition(paramfn.getInteger("SpawnX"), paramfn.getInteger("SpawnY"), paramfn.getInteger("SpawnZ"));
/*  671: 773 */       this.d = paramfn.getBoolean("SpawnForced");
/*  672:     */     }
/*  673: 776 */     this.bj.a(paramfn);
/*  674: 777 */     this.by.b(paramfn);
/*  675: 779 */     if (paramfn.hasKey("EnderItems", 9))
/*  676:     */     {
/*  677: 780 */       fv localfv2 = paramfn.c("EnderItems", 10);
/*  678: 781 */       this.a.a(localfv2);
/*  679:     */     }
/*  680:     */   }
/*  681:     */   
/*  682:     */   public void writeEntityToNBT(NBTTagCompound paramfn)
/*  683:     */   {
/*  684: 787 */     super.writeEntityToNBT(paramfn);
/*  685: 788 */     paramfn.setNBT("Inventory", this.bg.a(new fv()));
/*  686: 789 */     paramfn.setInt("SelectedItemSlot", this.bg.c);
/*  687: 790 */     paramfn.setBoolean("Sleeping", this.bu);
/*  688: 791 */     paramfn.setShort("SleepTimer", (short)this.b);
/*  689: 792 */     paramfn.setFloat("XpP", this.bB);
/*  690: 793 */     paramfn.setInt("XpLevel", this.bz);
/*  691: 794 */     paramfn.setInt("XpTotal", this.bA);
/*  692: 795 */     paramfn.setInt("XpSeed", this.f);
/*  693: 796 */     paramfn.setInt("Score", bW());
/*  694: 798 */     if (this.c != null)
/*  695:     */     {
/*  696: 799 */       paramfn.setInt("SpawnX", this.c.getX());
/*  697: 800 */       paramfn.setInt("SpawnY", this.c.getY());
/*  698: 801 */       paramfn.setInt("SpawnZ", this.c.getZ());
/*  699: 802 */       paramfn.setBoolean("SpawnForced", this.d);
/*  700:     */     }
/*  701: 805 */     this.bj.b(paramfn);
/*  702: 806 */     this.by.a(paramfn);
/*  703: 807 */     paramfn.setNBT("EnderItems", this.a.h());
/*  704:     */     
/*  705: 809 */     ItemStack localamj = this.bg.h();
/*  706: 810 */     if ((localamj != null) && (localamj.getItem() != null)) {
/*  707: 811 */       paramfn.setNBT("SelectedItem", localamj.writeToNBT(new NBTTagCompound()));
/*  708:     */     }
/*  709:     */   }
/*  710:     */   
/*  711:     */   public boolean a(wh paramwh, float paramFloat)
/*  712:     */   {
/*  713: 819 */     if (b(paramwh)) {
/*  714: 820 */       return false;
/*  715:     */     }
/*  716: 822 */     if ((this.by.a) && (!paramwh.g())) {
/*  717: 823 */       return false;
/*  718:     */     }
/*  719: 826 */     this.aO = 0;
/*  720: 827 */     if (getHealth() <= 0.0F) {
/*  721: 828 */       return false;
/*  722:     */     }
/*  723: 831 */     if ((bI()) && (!this.world.isClient)) {
/*  724: 832 */       a(true, true, false);
/*  725:     */     }
/*  726: 835 */     if (paramwh.r())
/*  727:     */     {
/*  728: 836 */       if (this.world.getDifficulty() == EnumDifficulty.PEACEFUL) {
/*  729: 837 */         paramFloat = 0.0F;
/*  730:     */       }
/*  731: 839 */       if (this.world.getDifficulty() == EnumDifficulty.EASY) {
/*  732: 840 */         paramFloat = paramFloat / 2.0F + 1.0F;
/*  733:     */       }
/*  734: 842 */       if (this.world.getDifficulty() == EnumDifficulty.HARD) {
/*  735: 843 */         paramFloat = paramFloat * 3.0F / 2.0F;
/*  736:     */       }
/*  737:     */     }
/*  738: 847 */     if (paramFloat == 0.0F) {
/*  739: 848 */       return false;
/*  740:     */     }
/*  741: 851 */     Entity localwv = paramwh.j();
/*  742: 852 */     if (((localwv instanceof ahj)) && 
/*  743: 853 */       (((ahj)localwv).c != null)) {
/*  744: 854 */       localwv = ((ahj)localwv).c;
/*  745:     */     }
/*  746: 858 */     return super.a(paramwh, paramFloat);
/*  747:     */   }
/*  748:     */   
/*  749:     */   public boolean a(EntityPlayer paramahd)
/*  750:     */   {
/*  751: 862 */     bsf localbsf1 = bN();
/*  752: 863 */     bsf localbsf2 = paramahd.bN();
/*  753: 865 */     if (localbsf1 == null) {
/*  754: 866 */       return true;
/*  755:     */     }
/*  756: 868 */     if (!localbsf1.a(localbsf2)) {
/*  757: 869 */       return true;
/*  758:     */     }
/*  759: 871 */     return localbsf1.g();
/*  760:     */   }
/*  761:     */   
/*  762:     */   protected void i(float paramFloat)
/*  763:     */   {
/*  764: 876 */     this.bg.a(paramFloat);
/*  765:     */   }
/*  766:     */   
/*  767:     */   public int bq()
/*  768:     */   {
/*  769: 881 */     return this.bg.m();
/*  770:     */   }
/*  771:     */   
/*  772:     */   public float bX()
/*  773:     */   {
/*  774: 885 */     int j = 0;
/*  775: 886 */     for (ItemStack localamj : this.bg.b) {
/*  776: 887 */       if (localamj != null) {
/*  777: 888 */         j++;
/*  778:     */       }
/*  779:     */     }
/*  780: 891 */     return j / this.bg.b.length;
/*  781:     */   }
/*  782:     */   
/*  783:     */   protected void d(wh paramwh, float paramFloat)
/*  784:     */   {
/*  785: 896 */     if (b(paramwh)) {
/*  786: 897 */       return;
/*  787:     */     }
/*  788: 899 */     if ((!paramwh.e()) && (bV()) && (paramFloat > 0.0F)) {
/*  789: 900 */       paramFloat = (1.0F + paramFloat) * 0.5F;
/*  790:     */     }
/*  791: 902 */     paramFloat = b(paramwh, paramFloat);
/*  792: 903 */     paramFloat = c(paramwh, paramFloat);
/*  793:     */     
/*  794: 905 */     float f1 = paramFloat;
/*  795: 906 */     paramFloat = Math.max(paramFloat - bM(), 0.0F);
/*  796: 907 */     l(bM() - (f1 - paramFloat));
/*  797: 908 */     if (paramFloat == 0.0F) {
/*  798: 909 */       return;
/*  799:     */     }
/*  800: 912 */     a(paramwh.f());
/*  801: 913 */     float f2 = getHealth();
/*  802: 914 */     h(getHealth() - paramFloat);
/*  803: 915 */     br().a(paramwh, f2, paramFloat);
/*  804: 916 */     if (paramFloat < 3.402824E+037F) {
/*  805: 917 */       a(StatList.x, Math.round(paramFloat * 10.0F));
/*  806:     */     }
/*  807:     */   }
/*  808:     */   
/*  809:     */   public void a(bdj parambdj) {}
/*  810:     */   
/*  811:     */   public void a(aqf paramaqf) {}
/*  812:     */   
/*  813:     */   public void a(aqb paramaqb) {}
/*  814:     */   
/*  815:     */   public void a(vq paramvq) {}
/*  816:     */   
/*  817:     */   public void a(EntityHorse paramabt, vq paramvq) {}
/*  818:     */   
/*  819:     */   public void a(vv paramvv) {}
/*  820:     */   
/*  821:     */   public void a(ItemStack paramamj) {}
/*  822:     */   
/*  823:     */   public boolean u(Entity paramwv)
/*  824:     */   {
/*  825: 948 */     if (v())
/*  826:     */     {
/*  827: 949 */       if ((paramwv instanceof vq)) {
/*  828: 950 */         a((vq)paramwv);
/*  829:     */       }
/*  830: 952 */       return false;
/*  831:     */     }
/*  832: 955 */     Object localObject1 = bY();
/*  833: 956 */     ItemStack localObject2 = localObject1 != null ? ((ItemStack)localObject1).k() : null;
/*  834: 957 */     if (paramwv.e(this))
/*  835:     */     {
/*  836: 961 */       if ((localObject1 != null) && (localObject1 == bY())) {
/*  837: 962 */         if ((((ItemStack)localObject1).stackSize <= 0) && (!this.by.d)) {
/*  838: 963 */           bZ();
/*  839: 964 */         } else if ((((ItemStack)localObject1).stackSize < localObject2.stackSize) && (this.by.d)) {
/*  840: 965 */           ((ItemStack)localObject1).stackSize = localObject2.stackSize;
/*  841:     */         }
/*  842:     */       }
/*  843: 968 */       return true;
/*  844:     */     }
/*  845: 971 */     if ((localObject1 != null) && ((paramwv instanceof EntityLiving)))
/*  846:     */     {
/*  847: 974 */       if (this.by.d) {
/*  848: 975 */         localObject1 = localObject2;
/*  849:     */       }
/*  850: 977 */       if (((ItemStack)localObject1).a(this, (EntityLiving)paramwv))
/*  851:     */       {
/*  852: 980 */         if ((((ItemStack)localObject1).stackSize <= 0) && (!this.by.d)) {
/*  853: 981 */           bZ();
/*  854:     */         }
/*  855: 983 */         return true;
/*  856:     */       }
/*  857:     */     }
/*  858: 986 */     return false;
/*  859:     */   }
/*  860:     */   
/*  861:     */   public ItemStack bY()
/*  862:     */   {
/*  863: 990 */     return this.bg.h();
/*  864:     */   }
/*  865:     */   
/*  866:     */   public void bZ()
/*  867:     */   {
/*  868: 994 */     this.bg.a(this.bg.c, null);
/*  869:     */   }
/*  870:     */   
/*  871:     */   public double am()
/*  872:     */   {
/*  873: 999 */     return -0.35D;
/*  874:     */   }
/*  875:     */   
/*  876:     */   public void f(Entity paramwv)
/*  877:     */   {
/*  878:1003 */     if (!paramwv.aE()) {
/*  879:1004 */       return;
/*  880:     */     }
/*  881:1006 */     if (paramwv.l(this)) {
/*  882:1007 */       return;
/*  883:     */     }
/*  884:1010 */     float f1 = (float)a(afs.e).e();
/*  885:     */     
/*  886:1012 */     int j = 0;
/*  887:1013 */     float f2 = 0.0F;
/*  888:1014 */     if ((paramwv instanceof EntityLiving)) {
/*  889:1015 */       f2 = aph.a(bz(), ((EntityLiving)paramwv).by());
/*  890:     */     } else {
/*  891:1017 */       f2 = aph.a(bz(), xs.a);
/*  892:     */     }
/*  893:1019 */     j += aph.a(this);
/*  894:1021 */     if (ax()) {
/*  895:1022 */       j++;
/*  896:     */     }
/*  897:1025 */     if ((f1 > 0.0F) || (f2 > 0.0F))
/*  898:     */     {
/*  899:1026 */       int k = (this.O > 0.0F) && (!this.C) && (!j_()) && (!V()) && (!a(Potion.q)) && (this.vehicle == null) && ((paramwv instanceof EntityLiving)) ? 1 : 0;
/*  900:1027 */       if ((k != 0) && (f1 > 0.0F)) {
/*  901:1028 */         f1 *= 1.5F;
/*  902:     */       }
/*  903:1030 */       f1 += f2;
/*  904:     */       
/*  905:     */ 
/*  906:     */ 
/*  907:1034 */       int m = 0;
/*  908:1035 */       int n = aph.b(this);
/*  909:1036 */       if (((paramwv instanceof EntityLiving)) && (n > 0) && (!paramwv.au()))
/*  910:     */       {
/*  911:1037 */         m = 1;
/*  912:1038 */         paramwv.e(1);
/*  913:     */       }
/*  914:1041 */       double d1 = paramwv.xVelocity;
/*  915:1042 */       double d2 = paramwv.yVelocity;
/*  916:1043 */       double d3 = paramwv.zVelocity;
/*  917:     */       
/*  918:1045 */       boolean bool = paramwv.a(wh.a(this), f1);
/*  919:1046 */       if (bool)
/*  920:     */       {
/*  921:1047 */         if (j > 0)
/*  922:     */         {
/*  923:1048 */           paramwv.g(-MathUtils.sin(this.yaw * 3.141593F / 180.0F) * j * 0.5F, 0.1D, MathUtils.cos(this.yaw * 3.141593F / 180.0F) * j * 0.5F);
/*  924:1049 */           this.xVelocity *= 0.6D;
/*  925:1050 */           this.zVelocity *= 0.6D;
/*  926:1051 */           d(false);
/*  927:     */         }
/*  928:1054 */         if (((paramwv instanceof qw)) && (paramwv.G))
/*  929:     */         {
/*  930:1055 */           ((qw)paramwv).a.a(new kz(paramwv));
/*  931:1056 */           paramwv.G = false;
/*  932:1057 */           paramwv.xVelocity = d1;
/*  933:1058 */           paramwv.yVelocity = d2;
/*  934:1059 */           paramwv.zVelocity = d3;
/*  935:     */         }
/*  936:1062 */         if (k != 0) {
/*  937:1063 */           b(paramwv);
/*  938:     */         }
/*  939:1065 */         if (f2 > 0.0F) {
/*  940:1066 */           c(paramwv);
/*  941:     */         }
/*  942:1069 */         if (f1 >= 18.0F) {
/*  943:1070 */           b(AchievementList.F);
/*  944:     */         }
/*  945:1072 */         p(paramwv);
/*  946:1074 */         if ((paramwv instanceof EntityLiving)) {
/*  947:1075 */           aph.a((EntityLiving)paramwv, this);
/*  948:     */         }
/*  949:1077 */         aph.b(this, paramwv);
/*  950:     */         
/*  951:1079 */         ItemStack localamj = bY();
/*  952:1080 */         Object localObject = paramwv;
/*  953:1081 */         if ((paramwv instanceof acz))
/*  954:     */         {
/*  955:1082 */           acy localacy = ((acz)paramwv).a;
/*  956:1083 */           if ((localacy instanceof EntityLiving)) {
/*  957:1084 */             localObject = (EntityLiving)localacy;
/*  958:     */           }
/*  959:     */         }
/*  960:1087 */         if ((localamj != null) && ((localObject instanceof EntityLiving)))
/*  961:     */         {
/*  962:1088 */           localamj.a((EntityLiving)localObject, this);
/*  963:1089 */           if (localamj.stackSize <= 0) {
/*  964:1090 */             bZ();
/*  965:     */           }
/*  966:     */         }
/*  967:1093 */         if ((paramwv instanceof EntityLiving))
/*  968:     */         {
/*  969:1094 */           a(StatList.w, Math.round(f1 * 10.0F));
/*  970:1096 */           if (n > 0) {
/*  971:1097 */             paramwv.e(n * 4);
/*  972:     */           }
/*  973:     */         }
/*  974:1101 */         a(0.3F);
/*  975:     */       }
/*  976:1106 */       else if (m != 0)
/*  977:     */       {
/*  978:1107 */         paramwv.N();
/*  979:     */       }
/*  980:     */     }
/*  981:     */   }
/*  982:     */   
/*  983:     */   public void b(Entity paramwv) {}
/*  984:     */   
/*  985:     */   public void c(Entity paramwv) {}
/*  986:     */   
/*  987:     */   public void ca() {}
/*  988:     */   
/*  989:     */   public void setDead()
/*  990:     */   {
/*  991:1123 */     super.setDead();
/*  992:1124 */     this.bh.b(this);
/*  993:1125 */     if (this.bi != null) {
/*  994:1126 */       this.bi.b(this);
/*  995:     */     }
/*  996:     */   }
/*  997:     */   
/*  998:     */   public boolean aj()
/*  999:     */   {
/* 1000:1132 */     return (!this.bu) && (super.aj());
/* 1001:     */   }
/* 1002:     */   
/* 1003:     */   public boolean cb()
/* 1004:     */   {
/* 1005:1136 */     return false;
/* 1006:     */   }
/* 1007:     */   
/* 1008:     */   public GameProfile cc()
/* 1009:     */   {
/* 1010:1140 */     return this.bF;
/* 1011:     */   }
/* 1012:     */   
/* 1013:     */   public ahf a(BlockPosition paramdt)
/* 1014:     */   {
/* 1015:1153 */     if (!this.world.isClient)
/* 1016:     */     {
/* 1017:1154 */       if ((bI()) || (!ai())) {
/* 1018:1155 */         return ahf.e;
/* 1019:     */       }
/* 1020:1158 */       if (!this.world.t.d()) {
/* 1021:1160 */         return ahf.b;
/* 1022:     */       }
/* 1023:1162 */       if (this.world.w()) {
/* 1024:1164 */         return ahf.c;
/* 1025:     */       }
/* 1026:1166 */       if ((Math.abs(this.xPos - paramdt.getX()) > 3.0D) || (Math.abs(this.yPos - paramdt.getY()) > 2.0D) || (Math.abs(this.zPos - paramdt.getZ()) > 3.0D)) {
/* 1027:1168 */         return ahf.d;
/* 1028:     */       }
/* 1029:1171 */       double d1 = 8.0D;
/* 1030:1172 */       double d2 = 5.0D;
/* 1031:1173 */       List<EntityHostileMob> localList = this.world.a(EntityHostileMob.class, new AABB(paramdt.getX() - d1, paramdt.getY() - d2, paramdt.getZ() - d1, paramdt.getX() + d1, paramdt.getY() + d2, paramdt.getZ() + d1));
/* 1032:1174 */       if (!localList.isEmpty()) {
/* 1033:1175 */         return ahf.f;
/* 1034:     */       }
/* 1035:     */     }
/* 1036:1179 */     if (av()) {
/* 1037:1180 */       mount((Entity)null);
/* 1038:     */     }
/* 1039:1183 */     a(0.2F, 0.2F);
/* 1040:1184 */     if (this.world.e(paramdt))
/* 1041:     */     {
/* 1042:1185 */       EnumDirection localej = (EnumDirection)this.world.getBlock(paramdt).getProperty(avb.N);
/* 1043:1186 */       float f1 = 0.5F;float f2 = 0.5F;
/* 1044:1188 */       switch (ahe.a[localej.ordinal()])
/* 1045:     */       {
/* 1046:     */       case 1: 
/* 1047:1190 */         f2 = 0.9F;
/* 1048:1191 */         break;
/* 1049:     */       case 2: 
/* 1050:1193 */         f2 = 0.1F;
/* 1051:1194 */         break;
/* 1052:     */       case 3: 
/* 1053:1196 */         f1 = 0.1F;
/* 1054:1197 */         break;
/* 1055:     */       case 4: 
/* 1056:1199 */         f1 = 0.9F;
/* 1057:     */       }
/* 1058:1202 */       a(localej);
/* 1059:1203 */       b(paramdt.getX() + f1, paramdt.getY() + 0.6875F, paramdt.getZ() + f2);
/* 1060:     */     }
/* 1061:     */     else
/* 1062:     */     {
/* 1063:1205 */       b(paramdt.getX() + 0.5F, paramdt.getY() + 0.6875F, paramdt.getZ() + 0.5F);
/* 1064:     */     }
/* 1065:1207 */     this.bu = true;
/* 1066:1208 */     this.b = 0;
/* 1067:1209 */     this.bv = paramdt;
/* 1068:1210 */     this.xVelocity = (this.zVelocity = this.yVelocity = 0.0D);
/* 1069:1212 */     if (!this.world.isClient) {
/* 1070:1213 */       this.world.updateAllPlayersSleepingFlag();
/* 1071:     */     }
/* 1072:1216 */     return ahf.a;
/* 1073:     */   }
/* 1074:     */   
/* 1075:     */   private void a(EnumDirection paramej)
/* 1076:     */   {
/* 1077:1221 */     this.bw = 0.0F;
/* 1078:1222 */     this.bx = 0.0F;
/* 1079:1224 */     switch (ahe.a[paramej.ordinal()])
/* 1080:     */     {
/* 1081:     */     case 1: 
/* 1082:1226 */       this.bx = -1.8F;
/* 1083:1227 */       break;
/* 1084:     */     case 2: 
/* 1085:1229 */       this.bx = 1.8F;
/* 1086:1230 */       break;
/* 1087:     */     case 3: 
/* 1088:1232 */       this.bw = 1.8F;
/* 1089:1233 */       break;
/* 1090:     */     case 4: 
/* 1091:1235 */       this.bw = -1.8F;
/* 1092:     */     }
/* 1093:     */   }
/* 1094:     */   
/* 1095:     */   public void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/* 1096:     */   {
/* 1097:1252 */     a(0.6F, 1.8F);
/* 1098:     */     
/* 1099:1254 */     Block localbec = this.world.getBlock(this.bv);
/* 1100:1257 */     if ((this.bv != null) && (localbec.getProto() == BlockList.C))
/* 1101:     */     {
/* 1102:1258 */       this.world.setBlock(this.bv, localbec.a(atp.b, Boolean.valueOf(false)), 4);
/* 1103:     */       
/* 1104:1260 */       BlockPosition localdt = atp.a(this.world, this.bv, 0);
/* 1105:1261 */       if (localdt == null) {
/* 1106:1262 */         localdt = this.bv.up();
/* 1107:     */       }
/* 1108:1264 */       b(localdt.getX() + 0.5F, localdt.getY() + 0.1F, localdt.getZ() + 0.5F);
/* 1109:     */     }
/* 1110:1267 */     this.bu = false;
/* 1111:1268 */     if ((!this.world.isClient) && (paramBoolean2)) {
/* 1112:1269 */       this.world.updateAllPlayersSleepingFlag();
/* 1113:     */     }
/* 1114:1272 */     this.b = (paramBoolean1 ? 0 : 100);
/* 1115:1274 */     if (paramBoolean3) {
/* 1116:1275 */       a(this.bv, false);
/* 1117:     */     }
/* 1118:     */   }
/* 1119:     */   
/* 1120:     */   private boolean p()
/* 1121:     */   {
/* 1122:1280 */     return this.world.getBlock(this.bv).getProto() == BlockList.C;
/* 1123:     */   }
/* 1124:     */   
/* 1125:     */   public static BlockPosition a(World paramaqu, BlockPosition paramdt, boolean paramBoolean)
/* 1126:     */   {
/* 1127:1286 */     if (paramaqu.getBlock(paramdt).getProto() != BlockList.C)
/* 1128:     */     {
/* 1129:1287 */       if (!paramBoolean) {
/* 1130:1288 */         return null;
/* 1131:     */       }
/* 1132:1291 */       Material localbof1 = paramaqu.getBlock(paramdt).getProto().getMaterial();
/* 1133:1292 */       Material localbof2 = paramaqu.getBlock(paramdt.up()).getProto().getMaterial();
/* 1134:1293 */       int j = (!localbof1.a()) && (!localbof1.isLiquid()) ? 1 : 0;
/* 1135:1294 */       int k = (!localbof2.a()) && (!localbof2.isLiquid()) ? 1 : 0;
/* 1136:1296 */       if ((j != 0) && (k != 0)) {
/* 1137:1297 */         return paramdt;
/* 1138:     */       }
/* 1139:1300 */       return null;
/* 1140:     */     }
/* 1141:1304 */     return atp.a(paramaqu, paramdt, 0);
/* 1142:     */   }
/* 1143:     */   
/* 1144:     */   public float cd()
/* 1145:     */   {
/* 1146:1308 */     if (this.bv != null)
/* 1147:     */     {
/* 1148:1309 */       EnumDirection localej = (EnumDirection)this.world.getBlock(this.bv).getProperty(avb.N);
/* 1149:1310 */       switch (ahe.a[localej.ordinal()])
/* 1150:     */       {
/* 1151:     */       case 1: 
/* 1152:1312 */         return 90.0F;
/* 1153:     */       case 3: 
/* 1154:1314 */         return 0.0F;
/* 1155:     */       case 2: 
/* 1156:1316 */         return 270.0F;
/* 1157:     */       case 4: 
/* 1158:1318 */         return 180.0F;
/* 1159:     */       }
/* 1160:     */     }
/* 1161:1321 */     return 0.0F;
/* 1162:     */   }
/* 1163:     */   
/* 1164:     */   public boolean bI()
/* 1165:     */   {
/* 1166:1326 */     return this.bu;
/* 1167:     */   }
/* 1168:     */   
/* 1169:     */   public boolean ce()
/* 1170:     */   {
/* 1171:1330 */     return (this.bu) && (this.b >= 100);
/* 1172:     */   }
/* 1173:     */   
/* 1174:     */   public int cf()
/* 1175:     */   {
/* 1176:1334 */     return this.b;
/* 1177:     */   }
/* 1178:     */   
/* 1179:     */   public void b(ho paramho) {}
/* 1180:     */   
/* 1181:     */   public BlockPosition cg()
/* 1182:     */   {
/* 1183:1361 */     return this.c;
/* 1184:     */   }
/* 1185:     */   
/* 1186:     */   public boolean ch()
/* 1187:     */   {
/* 1188:1365 */     return this.d;
/* 1189:     */   }
/* 1190:     */   
/* 1191:     */   public void a(BlockPosition paramdt, boolean paramBoolean)
/* 1192:     */   {
/* 1193:1369 */     if (paramdt != null)
/* 1194:     */     {
/* 1195:1370 */       this.c = paramdt;
/* 1196:1371 */       this.d = paramBoolean;
/* 1197:     */     }
/* 1198:     */     else
/* 1199:     */     {
/* 1200:1373 */       this.c = null;
/* 1201:1374 */       this.d = false;
/* 1202:     */     }
/* 1203:     */   }
/* 1204:     */   
/* 1205:     */   public void b(tq paramtq)
/* 1206:     */   {
/* 1207:1379 */     a(paramtq, 1);
/* 1208:     */   }
/* 1209:     */   
/* 1210:     */   public void a(tq paramtq, int paramInt) {}
/* 1211:     */   
/* 1212:     */   public void a(tq paramtq) {}
/* 1213:     */   
/* 1214:     */   public void bE()
/* 1215:     */   {
/* 1216:1390 */     super.bE();
/* 1217:     */     
/* 1218:1392 */     b(StatList.u);
/* 1219:1393 */     if (ax()) {
/* 1220:1394 */       a(0.8F);
/* 1221:     */     } else {
/* 1222:1396 */       a(0.2F);
/* 1223:     */     }
/* 1224:     */   }
/* 1225:     */   
/* 1226:     */   public void g(float paramFloat1, float paramFloat2)
/* 1227:     */   {
/* 1228:1402 */     double d1 = this.xPos;double d2 = this.yPos;double d3 = this.zPos;
/* 1229:1404 */     if ((this.by.b) && (this.vehicle == null))
/* 1230:     */     {
/* 1231:1405 */       double d4 = this.yVelocity;
/* 1232:1406 */       float f1 = this.aK;
/* 1233:1407 */       this.aK = (this.by.a() * (ax() ? 2 : 1));
/* 1234:1408 */       super.g(paramFloat1, paramFloat2);
/* 1235:1409 */       this.yVelocity = (d4 * 0.6D);
/* 1236:1410 */       this.aK = f1;
/* 1237:     */     }
/* 1238:     */     else
/* 1239:     */     {
/* 1240:1412 */       super.g(paramFloat1, paramFloat2);
/* 1241:     */     }
/* 1242:1415 */     k(this.xPos - d1, this.yPos - d2, this.zPos - d3);
/* 1243:     */   }
/* 1244:     */   
/* 1245:     */   public float bH()
/* 1246:     */   {
/* 1247:1420 */     return (float)a(afs.d).e();
/* 1248:     */   }
/* 1249:     */   
/* 1250:     */   public void k(double paramDouble1, double paramDouble2, double paramDouble3)
/* 1251:     */   {
/* 1252:1424 */     if (this.vehicle != null) {
/* 1253:     */       return;
/* 1254:     */     }
/* 1255:     */     int j;
/* 1256:1427 */     if (a(Material.water))
/* 1257:     */     {
/* 1258:1428 */       j = Math.round(MathUtils.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3) * 100.0F);
/* 1259:1429 */       if (j > 0)
/* 1260:     */       {
/* 1261:1430 */         a(StatList.p, j);
/* 1262:1431 */         a(0.015F * j * 0.01F);
/* 1263:     */       }
/* 1264:     */     }
/* 1265:1433 */     else if (V())
/* 1266:     */     {
/* 1267:1434 */       j = Math.round(MathUtils.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3) * 100.0F);
/* 1268:1435 */       if (j > 0)
/* 1269:     */       {
/* 1270:1436 */         a(StatList.l, j);
/* 1271:1437 */         a(0.015F * j * 0.01F);
/* 1272:     */       }
/* 1273:     */     }
/* 1274:1439 */     else if (j_())
/* 1275:     */     {
/* 1276:1440 */       if (paramDouble2 > 0.0D) {
/* 1277:1441 */         a(StatList.n, (int)Math.round(paramDouble2 * 100.0D));
/* 1278:     */       }
/* 1279:     */     }
/* 1280:1443 */     else if (this.C)
/* 1281:     */     {
/* 1282:1444 */       j = Math.round(MathUtils.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3) * 100.0F);
/* 1283:1445 */       if (j > 0)
/* 1284:     */       {
/* 1285:1446 */         a(StatList.i, j);
/* 1286:1447 */         if (ax())
/* 1287:     */         {
/* 1288:1448 */           a(StatList.k, j);
/* 1289:1449 */           a(0.09999999F * j * 0.01F);
/* 1290:     */         }
/* 1291:     */         else
/* 1292:     */         {
/* 1293:1451 */           if (aw()) {
/* 1294:1452 */             a(StatList.j, j);
/* 1295:     */           }
/* 1296:1454 */           a(0.01F * j * 0.01F);
/* 1297:     */         }
/* 1298:     */       }
/* 1299:     */     }
/* 1300:     */     else
/* 1301:     */     {
/* 1302:1458 */       j = Math.round(MathUtils.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3) * 100.0F);
/* 1303:1459 */       if (j > 25) {
/* 1304:1460 */         a(StatList.o, j);
/* 1305:     */       }
/* 1306:     */     }
/* 1307:     */   }
/* 1308:     */   
/* 1309:     */   private void l(double paramDouble1, double paramDouble2, double paramDouble3)
/* 1310:     */   {
/* 1311:1466 */     if (this.vehicle != null)
/* 1312:     */     {
/* 1313:1467 */       int j = Math.round(MathUtils.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3) * 100.0F);
/* 1314:1468 */       if (j > 0) {
/* 1315:1469 */         if ((this.vehicle instanceof adx))
/* 1316:     */         {
/* 1317:1470 */           a(StatList.q, j);
/* 1318:1472 */           if (this.e == null) {
/* 1319:1473 */             this.e = new BlockPosition(this);
/* 1320:1474 */           } else if (this.e.dist2(MathUtils.floor(this.xPos), MathUtils.floor(this.yPos), MathUtils.floor(this.zPos)) >= 1000000.0D) {
/* 1321:1475 */             b(AchievementList.q);
/* 1322:     */           }
/* 1323:     */         }
/* 1324:1477 */         else if ((this.vehicle instanceof adu))
/* 1325:     */         {
/* 1326:1478 */           a(StatList.r, j);
/* 1327:     */         }
/* 1328:1479 */         else if ((this.vehicle instanceof EntityPig))
/* 1329:     */         {
/* 1330:1480 */           a(StatList.s, j);
/* 1331:     */         }
/* 1332:1481 */         else if ((this.vehicle instanceof EntityHorse))
/* 1333:     */         {
/* 1334:1482 */           a(StatList.t, j);
/* 1335:     */         }
/* 1336:     */       }
/* 1337:     */     }
/* 1338:     */   }
/* 1339:     */   
/* 1340:     */   public void e(float paramFloat1, float paramFloat2)
/* 1341:     */   {
/* 1342:1490 */     if (this.by.c) {
/* 1343:1491 */       return;
/* 1344:     */     }
/* 1345:1494 */     if (paramFloat1 >= 2.0F) {
/* 1346:1495 */       a(StatList.m, (int)Math.round(paramFloat1 * 100.0D));
/* 1347:     */     }
/* 1348:1497 */     super.e(paramFloat1, paramFloat2);
/* 1349:     */   }
/* 1350:     */   
/* 1351:     */   protected void X()
/* 1352:     */   {
/* 1353:1502 */     if (!v()) {
/* 1354:1503 */       super.X();
/* 1355:     */     }
/* 1356:     */   }
/* 1357:     */   
/* 1358:     */   protected String n(int paramInt)
/* 1359:     */   {
/* 1360:1509 */     if (paramInt > 4) {
/* 1361:1510 */       return "game.player.hurt.fall.big";
/* 1362:     */     }
/* 1363:1512 */     return "game.player.hurt.fall.small";
/* 1364:     */   }
/* 1365:     */   
/* 1366:     */   public void a(EntityLiving paramxm)
/* 1367:     */   {
/* 1368:1518 */     if ((paramxm instanceof aex)) {
/* 1369:1519 */       b(AchievementList.s);
/* 1370:     */     }
/* 1371:1522 */     xc localxc = (xc)EntityList.entityEggs.get(Integer.valueOf(EntityList.a(paramxm)));
/* 1372:1523 */     if (localxc != null) {
/* 1373:1524 */       b(localxc.d);
/* 1374:     */     }
/* 1375:     */   }
/* 1376:     */   
/* 1377:     */   public void aB()
/* 1378:     */   {
/* 1379:1530 */     if (!this.by.b) {
/* 1380:1531 */       super.aB();
/* 1381:     */     }
/* 1382:     */   }
/* 1383:     */   
/* 1384:     */   public ItemStack q(int paramInt)
/* 1385:     */   {
/* 1386:1537 */     return this.bg.e(paramInt);
/* 1387:     */   }
/* 1388:     */   
/* 1389:     */   public void u(int paramInt)
/* 1390:     */   {
/* 1391:1541 */     s(paramInt);
/* 1392:1542 */     int j = 2147483647 - this.bA;
/* 1393:1543 */     if (paramInt > j) {
/* 1394:1544 */       paramInt = j;
/* 1395:     */     }
/* 1396:1547 */     this.bB += paramInt / cj();
/* 1397:1548 */     this.bA += paramInt;
/* 1398:1549 */     while (this.bB >= 1.0F)
/* 1399:     */     {
/* 1400:1550 */       this.bB = ((this.bB - 1.0F) * cj());
/* 1401:1551 */       a(1);
/* 1402:1552 */       this.bB /= cj();
/* 1403:     */     }
/* 1404:     */   }
/* 1405:     */   
/* 1406:     */   public int ci()
/* 1407:     */   {
/* 1408:1557 */     return this.f;
/* 1409:     */   }
/* 1410:     */   
/* 1411:     */   public void b(int paramInt)
/* 1412:     */   {
/* 1413:1561 */     this.bz -= paramInt;
/* 1414:1562 */     if (this.bz < 0)
/* 1415:     */     {
/* 1416:1563 */       this.bz = 0;
/* 1417:1564 */       this.bB = 0.0F;
/* 1418:1565 */       this.bA = 0;
/* 1419:     */     }
/* 1420:1567 */     this.f = this.random.nextInt();
/* 1421:     */   }
/* 1422:     */   
/* 1423:     */   public void a(int paramInt)
/* 1424:     */   {
/* 1425:1571 */     this.bz += paramInt;
/* 1426:1572 */     if (this.bz < 0)
/* 1427:     */     {
/* 1428:1573 */       this.bz = 0;
/* 1429:1574 */       this.bB = 0.0F;
/* 1430:1575 */       this.bA = 0;
/* 1431:     */     }
/* 1432:1578 */     if ((paramInt > 0) && (this.bz % 5 == 0) && (this.i < this.W - 100.0F))
/* 1433:     */     {
/* 1434:1579 */       float f1 = this.bz > 30 ? 1.0F : this.bz / 30.0F;
/* 1435:1580 */       this.world.a(this, "random.levelup", f1 * 0.75F, 1.0F);
/* 1436:1581 */       this.i = this.W;
/* 1437:     */     }
/* 1438:     */   }
/* 1439:     */   
/* 1440:     */   public int cj()
/* 1441:     */   {
/* 1442:1586 */     if (this.bz >= 30) {
/* 1443:1587 */       return 112 + (this.bz - 30) * 9;
/* 1444:     */     }
/* 1445:1589 */     if (this.bz >= 15) {
/* 1446:1590 */       return 37 + (this.bz - 15) * 5;
/* 1447:     */     }
/* 1448:1592 */     return 7 + this.bz * 2;
/* 1449:     */   }
/* 1450:     */   
/* 1451:     */   public void a(float paramFloat)
/* 1452:     */   {
/* 1453:1605 */     if (this.by.a) {
/* 1454:1606 */       return;
/* 1455:     */     }
/* 1456:1609 */     if (!this.world.isClient) {
/* 1457:1610 */       this.bj.a(paramFloat);
/* 1458:     */     }
/* 1459:     */   }
/* 1460:     */   
/* 1461:     */   public ahz ck()
/* 1462:     */   {
/* 1463:1615 */     return this.bj;
/* 1464:     */   }
/* 1465:     */   
/* 1466:     */   public boolean j(boolean paramBoolean)
/* 1467:     */   {
/* 1468:1619 */     return ((paramBoolean) || (this.bj.c())) && (!this.by.a);
/* 1469:     */   }
/* 1470:     */   
/* 1471:     */   public boolean cl()
/* 1472:     */   {
/* 1473:1623 */     return (getHealth() > 0.0F) && (getHealth() < bt());
/* 1474:     */   }
/* 1475:     */   
/* 1476:     */   public void a(ItemStack paramamj, int paramInt)
/* 1477:     */   {
/* 1478:1627 */     if (paramamj == this.g) {
/* 1479:1628 */       return;
/* 1480:     */     }
/* 1481:1630 */     this.g = paramamj;
/* 1482:1631 */     this.h = paramInt;
/* 1483:1632 */     if (!this.world.isClient) {
/* 1484:1633 */       f(true);
/* 1485:     */     }
/* 1486:     */   }
/* 1487:     */   
/* 1488:     */   public boolean cm()
/* 1489:     */   {
/* 1490:1638 */     return this.by.e;
/* 1491:     */   }
/* 1492:     */   
/* 1493:     */   public boolean a(BlockPosition paramdt, EnumDirection paramej, ItemStack paramamj)
/* 1494:     */   {
/* 1495:1642 */     if (this.by.e) {
/* 1496:1643 */       return true;
/* 1497:     */     }
/* 1498:1645 */     if (paramamj == null) {
/* 1499:1646 */       return false;
/* 1500:     */     }
/* 1501:1649 */     BlockPosition localdt = paramdt.a(paramej.d());
/* 1502:1650 */     ProtoBlock localatr = this.world.getBlock(localdt).getProto();
/* 1503:     */     
/* 1504:1652 */     return (paramamj.d(localatr)) || (paramamj.x());
/* 1505:     */   }
/* 1506:     */   
/* 1507:     */   protected int b(EntityPlayer paramahd)
/* 1508:     */   {
/* 1509:1657 */     if (this.world.getGameRules().getBoolean("keepInventory")) {
/* 1510:1658 */       return 0;
/* 1511:     */     }
/* 1512:1661 */     int j = this.bz * 7;
/* 1513:1662 */     if (j > 100) {
/* 1514:1663 */       return 100;
/* 1515:     */     }
/* 1516:1665 */     return j;
/* 1517:     */   }
/* 1518:     */   
/* 1519:     */   protected boolean ba()
/* 1520:     */   {
/* 1521:1671 */     return true;
/* 1522:     */   }
/* 1523:     */   
/* 1524:     */   public boolean aN()
/* 1525:     */   {
/* 1526:1676 */     return true;
/* 1527:     */   }
/* 1528:     */   
/* 1529:     */   public void a(EntityPlayer paramahd, boolean paramBoolean)
/* 1530:     */   {
/* 1531:1680 */     if (paramBoolean)
/* 1532:     */     {
/* 1533:1681 */       this.bg.b(paramahd.bg);
/* 1534:     */       
/* 1535:1683 */       h(paramahd.getHealth());
/* 1536:1684 */       this.bj = paramahd.bj;
/* 1537:     */       
/* 1538:1686 */       this.bz = paramahd.bz;
/* 1539:1687 */       this.bA = paramahd.bA;
/* 1540:1688 */       this.bB = paramahd.bB;
/* 1541:     */       
/* 1542:1690 */       r(paramahd.bW());
/* 1543:1691 */       this.an = paramahd.an;
/* 1544:     */     }
/* 1545:1692 */     else if (this.world.getGameRules().getBoolean("keepInventory"))
/* 1546:     */     {
/* 1547:1693 */       this.bg.b(paramahd.bg);
/* 1548:     */       
/* 1549:1695 */       this.bz = paramahd.bz;
/* 1550:1696 */       this.bA = paramahd.bA;
/* 1551:1697 */       this.bB = paramahd.bB;
/* 1552:1698 */       r(paramahd.bW());
/* 1553:     */     }
/* 1554:1700 */     this.a = paramahd.a;
/* 1555:1701 */     H().b(10, Byte.valueOf(paramahd.H().a(10)));
/* 1556:     */   }
/* 1557:     */   
/* 1558:     */   protected boolean r_()
/* 1559:     */   {
/* 1560:1706 */     return !this.by.b;
/* 1561:     */   }
/* 1562:     */   
/* 1563:     */   public void t() {}
/* 1564:     */   
/* 1565:     */   public void a(EnumGameType paramarc) {}
/* 1566:     */   
/* 1567:     */   public String getName()
/* 1568:     */   {
/* 1569:1717 */     return this.bF.getName();
/* 1570:     */   }
/* 1571:     */   
/* 1572:     */   public ajh cn()
/* 1573:     */   {
/* 1574:1721 */     return this.a;
/* 1575:     */   }
/* 1576:     */   
/* 1577:     */   public ItemStack p(int paramInt)
/* 1578:     */   {
/* 1579:1726 */     if (paramInt == 0) {
/* 1580:1727 */       return this.bg.h();
/* 1581:     */     }
/* 1582:1729 */     return this.bg.b[(paramInt - 1)];
/* 1583:     */   }
/* 1584:     */   
/* 1585:     */   public ItemStack bz()
/* 1586:     */   {
/* 1587:1734 */     return this.bg.h();
/* 1588:     */   }
/* 1589:     */   
/* 1590:     */   public void c(int paramInt, ItemStack paramamj)
/* 1591:     */   {
/* 1592:1739 */     this.bg.b[paramInt] = paramamj;
/* 1593:     */   }
/* 1594:     */   
/* 1595:     */   public boolean f(EntityPlayer paramahd)
/* 1596:     */   {
/* 1597:1744 */     if (!ay()) {
/* 1598:1745 */       return false;
/* 1599:     */     }
/* 1600:1747 */     if (paramahd.v()) {
/* 1601:1748 */       return false;
/* 1602:     */     }
/* 1603:1750 */     bsf localbsf = bN();
/* 1604:1752 */     if ((localbsf != null) && (paramahd != null) && (paramahd.bN() == localbsf) && (localbsf.h())) {
/* 1605:1753 */       return false;
/* 1606:     */     }
/* 1607:1756 */     return true;
/* 1608:     */   }
/* 1609:     */   
/* 1610:     */   public abstract boolean v();
/* 1611:     */   
/* 1612:     */   public ItemStack[] at()
/* 1613:     */   {
/* 1614:1763 */     return this.bg.b;
/* 1615:     */   }
/* 1616:     */   
/* 1617:     */   public boolean aK()
/* 1618:     */   {
/* 1619:1768 */     return !this.by.b;
/* 1620:     */   }
/* 1621:     */   
/* 1622:     */   public bsd co()
/* 1623:     */   {
/* 1624:1773 */     return this.world.Z();
/* 1625:     */   }
/* 1626:     */   
/* 1627:     */   public bsf bN()
/* 1628:     */   {
/* 1629:1778 */     return co().h(getName());
/* 1630:     */   }
/* 1631:     */   
/* 1632:     */   public ho e_()
/* 1633:     */   {
/* 1634:1783 */     hy localhy = new hy(brz.a(bN(), getName()));
/* 1635:1784 */     localhy.b().a(new hm(hn.e, "/msg " + getName() + " "));
/* 1636:1785 */     localhy.b().a(aP());
/* 1637:1786 */     localhy.b().a(getName());
/* 1638:1787 */     return localhy;
/* 1639:     */   }
/* 1640:     */   
/* 1641:     */   public float aR()
/* 1642:     */   {
/* 1643:1792 */     float f1 = 1.62F;
/* 1644:1793 */     if (bI()) {
/* 1645:1794 */       f1 = 0.2F;
/* 1646:     */     }
/* 1647:1796 */     if (aw()) {
/* 1648:1798 */       f1 -= 0.08F;
/* 1649:     */     }
/* 1650:1800 */     return f1;
/* 1651:     */   }
/* 1652:     */   
/* 1653:     */   public void l(float paramFloat)
/* 1654:     */   {
/* 1655:1805 */     if (paramFloat < 0.0F) {
/* 1656:1806 */       paramFloat = 0.0F;
/* 1657:     */     }
/* 1658:1808 */     H().b(17, Float.valueOf(paramFloat));
/* 1659:     */   }
/* 1660:     */   
/* 1661:     */   public float bM()
/* 1662:     */   {
/* 1663:1813 */     return H().d(17);
/* 1664:     */   }
/* 1665:     */   
/* 1666:     */   public static UUID a(GameProfile paramGameProfile)
/* 1667:     */   {
/* 1668:1817 */     UUID localUUID = paramGameProfile.getId();
/* 1669:1818 */     if (localUUID == null) {
/* 1670:1819 */       localUUID = b(paramGameProfile.getName());
/* 1671:     */     }
/* 1672:1821 */     return localUUID;
/* 1673:     */   }
/* 1674:     */   
/* 1675:     */   public static UUID b(String paramString)
/* 1676:     */   {
/* 1677:1825 */     return UUID.nameUUIDFromBytes(("OfflinePlayer:" + paramString).getBytes(Charsets.UTF_8));
/* 1678:     */   }
/* 1679:     */   
/* 1680:     */   public boolean a(vx paramvx)
/* 1681:     */   {
/* 1682:1830 */     if (paramvx.a()) {
/* 1683:1831 */       return true;
/* 1684:     */     }
/* 1685:1833 */     ItemStack localamj = bY();
/* 1686:1834 */     if ((localamj != null) && (localamj.s())) {
/* 1687:1835 */       return localamj.q().equals(paramvx.b());
/* 1688:     */     }
/* 1689:1837 */     return false;
/* 1690:     */   }
/* 1691:     */   
/* 1692:     */   public boolean a(ahh paramahh)
/* 1693:     */   {
/* 1694:1841 */     return (H().a(10) & paramahh.a()) == paramahh.a();
/* 1695:     */   }
/* 1696:     */   
/* 1697:     */   public boolean t_()
/* 1698:     */   {
/* 1699:1846 */     return net.minecraft.server.MinecraftServer.M().c[0].getGameRules().getBoolean("sendCommandFeedback");
/* 1700:     */   }
/* 1701:     */   
/* 1702:     */   public boolean d(int paramInt, ItemStack paramamj)
/* 1703:     */   {
/* 1704:1851 */     if ((paramInt >= 0) && (paramInt < this.bg.a.length))
/* 1705:     */     {
/* 1706:1852 */       this.bg.a(paramInt, paramamj);
/* 1707:1853 */       return true;
/* 1708:     */     }
/* 1709:1855 */     int j = paramInt - 100;
/* 1710:1856 */     if ((j >= 0) && (j < this.bg.b.length))
/* 1711:     */     {
/* 1712:1857 */       int k = j + 1;
/* 1713:1858 */       if ((paramamj != null) && (paramamj.getItem() != null)) {
/* 1714:1859 */         if ((paramamj.getItem() instanceof ajn))
/* 1715:     */         {
/* 1716:1860 */           if (EntityMob.c(paramamj) != k) {
/* 1717:1861 */             return false;
/* 1718:     */           }
/* 1719:     */         }
/* 1720:1863 */         else if ((k != 4) || ((paramamj.getItem() != ItemList.bX) && (!(paramamj.getItem() instanceof aju)))) {
/* 1721:1864 */           return false;
/* 1722:     */         }
/* 1723:     */       }
/* 1724:1867 */       this.bg.a(j + this.bg.a.length, paramamj);
/* 1725:1868 */       return true;
/* 1726:     */     }
/* 1727:1870 */     int k = paramInt - 200;
/* 1728:1871 */     if ((k >= 0) && (k < this.a.n_()))
/* 1729:     */     {
/* 1730:1872 */       this.a.a(k, paramamj);
/* 1731:1873 */       return true;
/* 1732:     */     }
/* 1733:1875 */     return false;
/* 1734:     */   }
/* 1735:     */   
/* 1736:     */   public boolean cp()
/* 1737:     */   {
/* 1738:1879 */     return this.bG;
/* 1739:     */   }
/* 1740:     */   
/* 1741:     */   public void k(boolean paramBoolean)
/* 1742:     */   {
/* 1743:1883 */     this.bG = paramBoolean;
/* 1744:     */   }
/* 1745:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahd
 * JD-Core Version:    0.7.0.1
 */
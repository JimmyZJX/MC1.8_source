package net.minecraft.src;
/*    1:     */ import com.google.common.collect.ImmutableSet;
/*    2:     */ import com.google.common.collect.Lists;
/*    3:     */ import com.google.common.collect.Maps;
/*    4:     */ import com.google.common.collect.Sets;
/*    5:     */ import com.google.gson.Gson;
/*    6:     */ import java.io.BufferedReader;
/*    7:     */ import java.io.File;
/*    8:     */ import java.io.FileReader;
/*    9:     */ import java.io.FileWriter;
/*   10:     */ import java.io.PrintWriter;
/*   11:     */ import java.lang.reflect.ParameterizedType;
/*   12:     */ import java.util.List;
/*   13:     */ import java.util.Map;
/*   14:     */ import java.util.Set;
/*   15:     */ import org.apache.commons.lang3.ArrayUtils;
/*   16:     */ import org.apache.logging.log4j.LogManager;
/*   17:     */ import org.apache.logging.log4j.Logger;
/*   18:     */ import org.lwjgl.input.Keyboard;
/*   19:     */ import org.lwjgl.input.Mouse;
/*   20:     */ import org.lwjgl.opengl.Display;
/*   21:     */ 
/*   22:     */ public class bto
/*   23:     */ {
/*   24:  35 */   private static final Logger aK = LogManager.getLogger();
/*   25:  36 */   private static final Gson aL = new Gson();
/*   26:  37 */   private static final ParameterizedType aM = new btp();
/*   27: 216 */   private static final String[] aN = { "options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large" };
/*   28: 219 */   private static final String[] aO = { "options.particles.all", "options.particles.decreased", "options.particles.minimal" };
/*   29: 222 */   private static final String[] aP = { "options.ao.off", "options.ao.min", "options.ao.max" };
/*   30: 225 */   private static final String[] aQ = { "options.stream.compression.low", "options.stream.compression.medium", "options.stream.compression.high" };
/*   31: 228 */   private static final String[] aR = { "options.stream.chat.enabled.streaming", "options.stream.chat.enabled.always", "options.stream.chat.enabled.never" };
/*   32: 231 */   private static final String[] aS = { "options.stream.chat.userFilter.all", "options.stream.chat.userFilter.subs", "options.stream.chat.userFilter.mods" };
/*   33: 234 */   private static final String[] aT = { "options.stream.mic_toggle.mute", "options.stream.mic_toggle.talk" };
/*   34: 238 */   public float a = 0.5F;
/*   35:     */   public boolean b;
/*   36: 240 */   public int c = -1;
/*   37: 241 */   public boolean d = true;
/*   38:     */   public boolean e;
/*   39: 243 */   public boolean f = true;
/*   40: 244 */   public int g = 120;
/*   41: 245 */   public boolean h = true;
/*   42: 246 */   public boolean i = true;
/*   43: 247 */   public int j = 2;
/*   44: 248 */   public List k = Lists.newArrayList();
/*   45: 249 */   public ahg l = ahg.FULL;
/*   46: 250 */   public boolean m = true;
/*   47: 251 */   public boolean n = true;
/*   48: 252 */   public boolean o = true;
/*   49: 253 */   public float p = 1.0F;
/*   50: 254 */   public boolean q = true;
/*   51:     */   public boolean r;
/*   52: 256 */   public boolean s = true;
/*   53: 257 */   public boolean t = false;
/*   54: 258 */   public boolean u = true;
/*   55: 259 */   public boolean v = false;
/*   56:     */   public boolean w;
/*   57:     */   public boolean x;
/*   58: 262 */   public boolean y = true;
/*   59: 263 */   private final Set<ahh> aU = Sets.newHashSet(ahh.values());
/*   60:     */   public boolean z;
/*   61:     */   public int A;
/*   62:     */   public int B;
/*   63: 267 */   public boolean C = true;
/*   64: 268 */   public float D = 1.0F;
/*   65: 269 */   public float E = 1.0F;
/*   66: 270 */   public float F = 0.443662F;
/*   67: 271 */   public float G = 1.0F;
/*   68: 272 */   public boolean H = true;
/*   69: 273 */   public int I = 4;
/*   70: 274 */   private Map<cxz,Float> aV = Maps.newEnumMap(cxz.class);
/*   71: 275 */   public float J = 0.5F;
/*   72: 276 */   public float K = 1.0F;
/*   73: 277 */   public float L = 1.0F;
/*   74: 278 */   public float M = 0.5412844F;
/*   75: 279 */   public float N = 0.3169014F;
/*   76: 280 */   public int O = 1;
/*   77: 281 */   public boolean P = true;
/*   78: 282 */   public String Q = "";
/*   79: 283 */   public int R = 0;
/*   80: 284 */   public int S = 0;
/*   81: 285 */   public int T = 0;
/*   82: 287 */   public bsr U = new bsr("key.forward", 17, "key.categories.movement");
/*   83: 288 */   public bsr V = new bsr("key.left", 30, "key.categories.movement");
/*   84: 289 */   public bsr W = new bsr("key.back", 31, "key.categories.movement");
/*   85: 290 */   public bsr X = new bsr("key.right", 32, "key.categories.movement");
/*   86: 291 */   public bsr Y = new bsr("key.jump", 57, "key.categories.movement");
/*   87: 292 */   public bsr Z = new bsr("key.sneak", 42, "key.categories.movement");
/*   88: 294 */   public bsr aa = new bsr("key.inventory", 18, "key.categories.inventory");
/*   89: 295 */   public bsr ab = new bsr("key.use", -99, "key.categories.gameplay");
/*   90: 296 */   public bsr ac = new bsr("key.drop", 16, "key.categories.gameplay");
/*   91: 297 */   public bsr ad = new bsr("key.attack", -100, "key.categories.gameplay");
/*   92: 298 */   public bsr ae = new bsr("key.pickItem", -98, "key.categories.gameplay");
/*   93: 299 */   public bsr af = new bsr("key.sprint", 29, "key.categories.gameplay");
/*   94: 301 */   public bsr ag = new bsr("key.chat", 20, "key.categories.multiplayer");
/*   95: 302 */   public bsr ah = new bsr("key.playerlist", 15, "key.categories.multiplayer");
/*   96: 303 */   public bsr ai = new bsr("key.command", 53, "key.categories.multiplayer");
/*   97: 305 */   public bsr aj = new bsr("key.screenshot", 60, "key.categories.misc");
/*   98: 306 */   public bsr ak = new bsr("key.togglePerspective", 63, "key.categories.misc");
/*   99: 307 */   public bsr al = new bsr("key.smoothCamera", 0, "key.categories.misc");
/*  100: 308 */   public bsr am = new bsr("key.fullscreen", 87, "key.categories.misc");
/*  101: 309 */   public bsr an = new bsr("key.spectatorOutlines", 0, "key.categories.misc");
/*  102: 311 */   public bsr ao = new bsr("key.streamStartStop", 64, "key.categories.stream");
/*  103: 312 */   public bsr ap = new bsr("key.streamPauseUnpause", 65, "key.categories.stream");
/*  104: 313 */   public bsr aq = new bsr("key.streamCommercial", 0, "key.categories.stream");
/*  105: 314 */   public bsr ar = new bsr("key.streamToggleMic", 0, "key.categories.stream");
/*  106: 316 */   public bsr[] as = { new bsr("key.hotbar.1", 2, "key.categories.inventory"), new bsr("key.hotbar.2", 3, "key.categories.inventory"), new bsr("key.hotbar.3", 4, "key.categories.inventory"), new bsr("key.hotbar.4", 5, "key.categories.inventory"), new bsr("key.hotbar.5", 6, "key.categories.inventory"), new bsr("key.hotbar.6", 7, "key.categories.inventory"), new bsr("key.hotbar.7", 8, "key.categories.inventory"), new bsr("key.hotbar.8", 9, "key.categories.inventory"), new bsr("key.hotbar.9", 10, "key.categories.inventory") };
/*  107: 328 */   public bsr[] at = (bsr[])ArrayUtils.addAll(new bsr[] { this.ad, this.ab, this.U, this.V, this.W, this.X, this.Y, this.Z, this.ac, this.aa, this.ag, this.ah, this.ae, this.ai, this.aj, this.ak, this.al, this.af, this.ao, this.ap, this.aq, this.ar, this.am, this.an }, this.as);
/*  108:     */   protected bsu au;
/*  109:     */   private File aW;
/*  110: 341 */   public EnumDifficulty av = EnumDifficulty.NORMAL;
/*  111:     */   public boolean aw;
/*  112:     */   public int ax;
/*  113:     */   public boolean ay;
/*  114:     */   public boolean az;
/*  115: 346 */   public String aA = "";
/*  116:     */   public boolean aB;
/*  117:     */   public boolean aC;
/*  118: 350 */   public float aD = 70.0F;
/*  119:     */   public float aE;
/*  120:     */   public float aF;
/*  121:     */   public int aG;
/*  122:     */   public int aH;
/*  123: 355 */   public String aI = "en_US";
/*  124: 356 */   public boolean aJ = false;
/*  125:     */   
/*  126:     */   public bto(bsu parambsu, File paramFile)
/*  127:     */   {
/*  128: 359 */     this.au = parambsu;
/*  129: 360 */     this.aW = new File(paramFile, "options.txt");
/*  130: 362 */     if ((parambsu.S()) && (Runtime.getRuntime().maxMemory() >= 1000000000L)) {
/*  131: 363 */       btr.f.a(32.0F);
/*  132:     */     } else {
/*  133: 365 */       btr.f.a(16.0F);
/*  134:     */     }
/*  135: 367 */     this.c = (parambsu.S() ? 12 : 8);
/*  136:     */     
/*  137: 369 */     a();
/*  138:     */   }
/*  139:     */   
/*  140:     */   public bto() {}
/*  141:     */   
/*  142:     */   public static String c(int paramInt)
/*  143:     */   {
/*  144: 385 */     if (paramInt < 0) {
/*  145: 386 */       return cwc.a("key.mouseButton", new Object[] { Integer.valueOf(paramInt + 101) });
/*  146:     */     }
/*  147: 388 */     if (paramInt < 256) {
/*  148: 389 */       return Keyboard.getKeyName(paramInt);
/*  149:     */     }
/*  150: 391 */     return String.format("%c", new Object[] { Character.valueOf((char)(paramInt - 256)) }).toUpperCase();
/*  151:     */   }
/*  152:     */   
/*  153:     */   public static boolean a(bsr parambsr)
/*  154:     */   {
/*  155: 401 */     if (parambsr.i() == 0) {
/*  156: 402 */       return false;
/*  157:     */     }
/*  158: 404 */     if (parambsr.i() < 0) {
/*  159: 405 */       return Mouse.isButtonDown(parambsr.i() + 100);
/*  160:     */     }
/*  161: 407 */     return Keyboard.isKeyDown(parambsr.i());
/*  162:     */   }
/*  163:     */   
/*  164:     */   public void a(bsr parambsr, int paramInt)
/*  165:     */   {
/*  166: 412 */     parambsr.b(paramInt);
/*  167: 413 */     b();
/*  168:     */   }
/*  169:     */   
/*  170:     */   public void a(btr parambtr, float paramFloat)
/*  171:     */   {
/*  172: 417 */     if (parambtr == btr.b) {
/*  173: 418 */       this.a = paramFloat;
/*  174:     */     }
/*  175: 420 */     if (parambtr == btr.c) {
/*  176: 421 */       this.aD = paramFloat;
/*  177:     */     }
/*  178: 423 */     if (parambtr == btr.d) {
/*  179: 424 */       this.aE = paramFloat;
/*  180:     */     }
/*  181: 426 */     if (parambtr == btr.i) {
/*  182: 427 */       this.g = ((int)paramFloat);
/*  183:     */     }
/*  184: 429 */     if (parambtr == btr.s)
/*  185:     */     {
/*  186: 430 */       this.p = paramFloat;
/*  187: 431 */       this.au.q.d().b();
/*  188:     */     }
/*  189: 433 */     if (parambtr == btr.B)
/*  190:     */     {
/*  191: 434 */       this.G = paramFloat;
/*  192: 435 */       this.au.q.d().b();
/*  193:     */     }
/*  194: 437 */     if (parambtr == btr.C)
/*  195:     */     {
/*  196: 438 */       this.F = paramFloat;
/*  197: 439 */       this.au.q.d().b();
/*  198:     */     }
/*  199: 441 */     if (parambtr == btr.A)
/*  200:     */     {
/*  201: 442 */       this.E = paramFloat;
/*  202: 443 */       this.au.q.d().b();
/*  203:     */     }
/*  204: 445 */     if (parambtr == btr.z)
/*  205:     */     {
/*  206: 446 */       this.D = paramFloat;
/*  207: 447 */       this.au.q.d().b();
/*  208:     */     }
/*  209: 449 */     if (parambtr == btr.D)
/*  210:     */     {
/*  211: 450 */       int i1 = this.I;
/*  212: 451 */       this.I = ((int)paramFloat);
/*  213: 452 */       if (i1 != paramFloat)
/*  214:     */       {
/*  215: 453 */         this.au.R().a(this.I);
/*  216: 454 */         this.au.N().a(cua.g);
/*  217: 455 */         this.au.R().a(false, this.I > 0);
/*  218: 456 */         this.au.A();
/*  219:     */       }
/*  220:     */     }
/*  221: 459 */     if (parambtr == btr.P)
/*  222:     */     {
/*  223: 460 */       this.u = (!this.u);
/*  224: 461 */       this.au.g.a();
/*  225:     */     }
/*  226: 463 */     if (parambtr == btr.f)
/*  227:     */     {
/*  228: 464 */       this.c = ((int)paramFloat);
/*  229: 465 */       this.au.g.m();
/*  230:     */     }
/*  231: 467 */     if (parambtr == btr.F) {
/*  232: 468 */       this.J = paramFloat;
/*  233:     */     }
/*  234: 470 */     if (parambtr == btr.G)
/*  235:     */     {
/*  236: 471 */       this.K = paramFloat;
/*  237: 472 */       this.au.W().p();
/*  238:     */     }
/*  239: 474 */     if (parambtr == btr.H)
/*  240:     */     {
/*  241: 475 */       this.L = paramFloat;
/*  242: 476 */       this.au.W().p();
/*  243:     */     }
/*  244: 478 */     if (parambtr == btr.I) {
/*  245: 479 */       this.M = paramFloat;
/*  246:     */     }
/*  247: 481 */     if (parambtr == btr.J) {
/*  248: 482 */       this.N = paramFloat;
/*  249:     */     }
/*  250:     */   }
/*  251:     */   
/*  252:     */   public void a(btr parambtr, int paramInt)
/*  253:     */   {
/*  254: 487 */     if (parambtr == btr.a) {
/*  255: 488 */       this.b = (!this.b);
/*  256:     */     }
/*  257: 490 */     if (parambtr == btr.n) {
/*  258: 491 */       this.aG = (this.aG + paramInt & 0x3);
/*  259:     */     }
/*  260: 493 */     if (parambtr == btr.o) {
/*  261: 494 */       this.aH = ((this.aH + paramInt) % 3);
/*  262:     */     }
/*  263: 496 */     if (parambtr == btr.g) {
/*  264: 497 */       this.d = (!this.d);
/*  265:     */     }
/*  266: 499 */     if (parambtr == btr.k) {
/*  267: 500 */       this.h = (!this.h);
/*  268:     */     }
/*  269: 502 */     if (parambtr == btr.E)
/*  270:     */     {
/*  271: 503 */       this.aJ = (!this.aJ);
/*  272: 504 */       this.au.k.a((this.au.Q().a()) || (this.aJ));
/*  273:     */     }
/*  274: 506 */     if (parambtr == btr.j) {
/*  275: 507 */       this.f = (!this.f);
/*  276:     */     }
/*  277: 509 */     if (parambtr == btr.h)
/*  278:     */     {
/*  279: 510 */       this.e = (!this.e);
/*  280: 511 */       this.au.e();
/*  281:     */     }
/*  282: 513 */     if (parambtr == btr.l)
/*  283:     */     {
/*  284: 514 */       this.i = (!this.i);
/*  285: 515 */       this.au.g.a();
/*  286:     */     }
/*  287: 517 */     if (parambtr == btr.m)
/*  288:     */     {
/*  289: 518 */       this.j = ((this.j + paramInt) % 3);
/*  290: 519 */       this.au.g.a();
/*  291:     */     }
/*  292: 521 */     if (parambtr == btr.p) {
/*  293: 522 */       this.l = ahg.a((this.l.a() + paramInt) % 3);
/*  294:     */     }
/*  295: 524 */     if (parambtr == btr.K) {
/*  296: 525 */       this.O = ((this.O + paramInt) % 3);
/*  297:     */     }
/*  298: 527 */     if (parambtr == btr.L) {
/*  299: 528 */       this.P = (!this.P);
/*  300:     */     }
/*  301: 530 */     if (parambtr == btr.M) {
/*  302: 531 */       this.R = ((this.R + paramInt) % 3);
/*  303:     */     }
/*  304: 533 */     if (parambtr == btr.N) {
/*  305: 534 */       this.S = ((this.S + paramInt) % 3);
/*  306:     */     }
/*  307: 536 */     if (parambtr == btr.O) {
/*  308: 537 */       this.T = ((this.T + paramInt) % 2);
/*  309:     */     }
/*  310: 539 */     if (parambtr == btr.q) {
/*  311: 540 */       this.m = (!this.m);
/*  312:     */     }
/*  313: 542 */     if (parambtr == btr.r) {
/*  314: 543 */       this.n = (!this.n);
/*  315:     */     }
/*  316: 545 */     if (parambtr == btr.t) {
/*  317: 546 */       this.o = (!this.o);
/*  318:     */     }
/*  319: 548 */     if (parambtr == btr.u) {
/*  320: 549 */       this.q = (!this.q);
/*  321:     */     }
/*  322: 551 */     if (parambtr == btr.y) {
/*  323: 552 */       this.z = (!this.z);
/*  324:     */     }
/*  325: 554 */     if (parambtr == btr.v)
/*  326:     */     {
/*  327: 555 */       this.r = (!this.r);
/*  328: 556 */       if (this.au.J() != this.r) {
/*  329: 557 */         this.au.q();
/*  330:     */       }
/*  331:     */     }
/*  332: 560 */     if (parambtr == btr.w)
/*  333:     */     {
/*  334: 561 */       this.s = (!this.s);
/*  335: 562 */       Display.setVSyncEnabled(this.s);
/*  336:     */     }
/*  337: 564 */     if (parambtr == btr.x)
/*  338:     */     {
/*  339: 565 */       this.t = (!this.t);
/*  340: 566 */       this.au.g.a();
/*  341:     */     }
/*  342: 568 */     if (parambtr == btr.P)
/*  343:     */     {
/*  344: 569 */       this.u = (!this.u);
/*  345: 570 */       this.au.g.a();
/*  346:     */     }
/*  347: 572 */     if (parambtr == btr.Q) {
/*  348: 573 */       this.v = (!this.v);
/*  349:     */     }
/*  350: 575 */     b();
/*  351:     */   }
/*  352:     */   
/*  353:     */   public float a(btr parambtr)
/*  354:     */   {
/*  355: 579 */     if (parambtr == btr.c) {
/*  356: 580 */       return this.aD;
/*  357:     */     }
/*  358: 582 */     if (parambtr == btr.d) {
/*  359: 583 */       return this.aE;
/*  360:     */     }
/*  361: 585 */     if (parambtr == btr.e) {
/*  362: 586 */       return this.aF;
/*  363:     */     }
/*  364: 588 */     if (parambtr == btr.b) {
/*  365: 589 */       return this.a;
/*  366:     */     }
/*  367: 591 */     if (parambtr == btr.s) {
/*  368: 592 */       return this.p;
/*  369:     */     }
/*  370: 594 */     if (parambtr == btr.B) {
/*  371: 595 */       return this.G;
/*  372:     */     }
/*  373: 597 */     if (parambtr == btr.C) {
/*  374: 598 */       return this.F;
/*  375:     */     }
/*  376: 600 */     if (parambtr == btr.z) {
/*  377: 601 */       return this.D;
/*  378:     */     }
/*  379: 603 */     if (parambtr == btr.A) {
/*  380: 604 */       return this.E;
/*  381:     */     }
/*  382: 606 */     if (parambtr == btr.i) {
/*  383: 607 */       return this.g;
/*  384:     */     }
/*  385: 609 */     if (parambtr == btr.D) {
/*  386: 610 */       return this.I;
/*  387:     */     }
/*  388: 612 */     if (parambtr == btr.f) {
/*  389: 613 */       return this.c;
/*  390:     */     }
/*  391: 615 */     if (parambtr == btr.F) {
/*  392: 616 */       return this.J;
/*  393:     */     }
/*  394: 618 */     if (parambtr == btr.G) {
/*  395: 619 */       return this.K;
/*  396:     */     }
/*  397: 621 */     if (parambtr == btr.H) {
/*  398: 622 */       return this.L;
/*  399:     */     }
/*  400: 624 */     if (parambtr == btr.I) {
/*  401: 625 */       return this.M;
/*  402:     */     }
/*  403: 627 */     if (parambtr == btr.J) {
/*  404: 628 */       return this.N;
/*  405:     */     }
/*  406: 630 */     return 0.0F;
/*  407:     */   }
/*  408:     */   
/*  409:     */   public boolean b(btr parambtr)
/*  410:     */   {
/*  411: 634 */     switch (btq.a[parambtr.ordinal()])
/*  412:     */     {
/*  413:     */     case 1: 
/*  414: 636 */       return this.b;
/*  415:     */     case 2: 
/*  416: 638 */       return this.d;
/*  417:     */     case 3: 
/*  418: 640 */       return this.e;
/*  419:     */     case 4: 
/*  420: 642 */       return this.f;
/*  421:     */     case 5: 
/*  422: 644 */       return this.h;
/*  423:     */     case 6: 
/*  424: 646 */       return this.m;
/*  425:     */     case 7: 
/*  426: 648 */       return this.n;
/*  427:     */     case 8: 
/*  428: 650 */       return this.o;
/*  429:     */     case 9: 
/*  430: 652 */       return this.q;
/*  431:     */     case 10: 
/*  432: 654 */       return this.r;
/*  433:     */     case 11: 
/*  434: 656 */       return this.s;
/*  435:     */     case 12: 
/*  436: 658 */       return this.t;
/*  437:     */     case 13: 
/*  438: 660 */       return this.z;
/*  439:     */     case 14: 
/*  440: 662 */       return this.P;
/*  441:     */     case 15: 
/*  442: 664 */       return this.aJ;
/*  443:     */     case 16: 
/*  444: 666 */       return this.u;
/*  445:     */     case 17: 
/*  446: 668 */       return this.v;
/*  447:     */     }
/*  448: 670 */     return false;
/*  449:     */   }
/*  450:     */   
/*  451:     */   private static String a(String[] paramArrayOfString, int paramInt)
/*  452:     */   {
/*  453: 683 */     if ((paramInt < 0) || (paramInt >= paramArrayOfString.length)) {
/*  454: 684 */       paramInt = 0;
/*  455:     */     }
/*  456: 687 */     return cwc.a(paramArrayOfString[paramInt], new Object[0]);
/*  457:     */   }
/*  458:     */   
/*  459:     */   public String c(btr parambtr)
/*  460:     */   {
/*  461: 691 */     String str1 = cwc.a(parambtr.d(), new Object[0]) + ": ";
/*  462: 693 */     if (parambtr.a())
/*  463:     */     {
/*  464: 694 */       float f1 = a(parambtr);
/*  465: 695 */       float f2 = parambtr.c(f1);
/*  466: 697 */       if (parambtr == btr.b)
/*  467:     */       {
/*  468: 698 */         if (f2 == 0.0F) {
/*  469: 699 */           return str1 + cwc.a("options.sensitivity.min", new Object[0]);
/*  470:     */         }
/*  471: 701 */         if (f2 == 1.0F) {
/*  472: 702 */           return str1 + cwc.a("options.sensitivity.max", new Object[0]);
/*  473:     */         }
/*  474: 704 */         return str1 + (int)(f2 * 200.0F) + "%";
/*  475:     */       }
/*  476: 705 */       if (parambtr == btr.c)
/*  477:     */       {
/*  478: 706 */         if (f1 == 70.0F) {
/*  479: 707 */           return str1 + cwc.a("options.fov.min", new Object[0]);
/*  480:     */         }
/*  481: 709 */         if (f1 == 110.0F) {
/*  482: 710 */           return str1 + cwc.a("options.fov.max", new Object[0]);
/*  483:     */         }
/*  484: 712 */         return str1 + (int)f1;
/*  485:     */       }
/*  486: 713 */       if (parambtr == btr.i)
/*  487:     */       {
/*  488: 714 */         if (f1 == btr.a(parambtr)) {
/*  489: 715 */           return str1 + cwc.a("options.framerateLimit.max", new Object[0]);
/*  490:     */         }
/*  491: 717 */         return str1 + (int)f1 + " fps";
/*  492:     */       }
/*  493: 719 */       if (parambtr == btr.k)
/*  494:     */       {
/*  495: 720 */         if (f1 == btr.b(parambtr)) {
/*  496: 721 */           return str1 + cwc.a("options.cloudHeight.min", new Object[0]);
/*  497:     */         }
/*  498: 723 */         return str1 + ((int)f1 + 128);
/*  499:     */       }
/*  500: 725 */       if (parambtr == btr.d)
/*  501:     */       {
/*  502: 726 */         if (f2 == 0.0F) {
/*  503: 727 */           return str1 + cwc.a("options.gamma.min", new Object[0]);
/*  504:     */         }
/*  505: 729 */         if (f2 == 1.0F) {
/*  506: 730 */           return str1 + cwc.a("options.gamma.max", new Object[0]);
/*  507:     */         }
/*  508: 732 */         return str1 + "+" + (int)(f2 * 100.0F) + "%";
/*  509:     */       }
/*  510: 733 */       if (parambtr == btr.e) {
/*  511: 734 */         return str1 + (int)(f2 * 400.0F) + "%";
/*  512:     */       }
/*  513: 735 */       if (parambtr == btr.s) {
/*  514: 736 */         return str1 + (int)(f2 * 90.0F + 10.0F) + "%";
/*  515:     */       }
/*  516: 737 */       if (parambtr == btr.C) {
/*  517: 738 */         return str1 + buh.b(f2) + "px";
/*  518:     */       }
/*  519: 739 */       if (parambtr == btr.B) {
/*  520: 740 */         return str1 + buh.b(f2) + "px";
/*  521:     */       }
/*  522: 741 */       if (parambtr == btr.A) {
/*  523: 742 */         return str1 + buh.a(f2) + "px";
/*  524:     */       }
/*  525: 743 */       if (parambtr == btr.f) {
/*  526: 744 */         return str1 + (int)f1 + " chunks";
/*  527:     */       }
/*  528: 745 */       if (parambtr == btr.D)
/*  529:     */       {
/*  530: 746 */         if (f1 == 0.0F) {
/*  531: 747 */           return str1 + cwc.a("options.off", new Object[0]);
/*  532:     */         }
/*  533: 749 */         return str1 + (int)f1;
/*  534:     */       }
/*  535: 750 */       if (parambtr == btr.J) {
/*  536: 751 */         return str1 + daq.a(f2) + " fps";
/*  537:     */       }
/*  538: 752 */       if (parambtr == btr.I) {
/*  539: 753 */         return str1 + daq.b(f2) + " Kbps";
/*  540:     */       }
/*  541: 754 */       if (parambtr == btr.F) {
/*  542: 755 */         return str1 + String.format("%.3f bpp", new Object[] { Float.valueOf(daq.c(f2)) });
/*  543:     */       }
/*  544: 757 */       if (f2 == 0.0F) {
/*  545: 758 */         return str1 + cwc.a("options.off", new Object[0]);
/*  546:     */       }
/*  547: 760 */       return str1 + (int)(f2 * 100.0F) + "%";
/*  548:     */     }
/*  549: 762 */     if (parambtr.b())
/*  550:     */     {
/*  551: 763 */       boolean bool = b(parambtr);
/*  552: 764 */       if (bool) {
/*  553: 765 */         return str1 + cwc.a("options.on", new Object[0]);
/*  554:     */       }
/*  555: 767 */       return str1 + cwc.a("options.off", new Object[0]);
/*  556:     */     }
/*  557: 768 */     if (parambtr == btr.n) {
/*  558: 769 */       return str1 + a(aN, this.aG);
/*  559:     */     }
/*  560: 770 */     if (parambtr == btr.p) {
/*  561: 771 */       return str1 + cwc.a(this.l.b(), new Object[0]);
/*  562:     */     }
/*  563: 772 */     if (parambtr == btr.o) {
/*  564: 773 */       return str1 + a(aO, this.aH);
/*  565:     */     }
/*  566: 774 */     if (parambtr == btr.m) {
/*  567: 775 */       return str1 + a(aP, this.j);
/*  568:     */     }
/*  569: 776 */     if (parambtr == btr.K) {
/*  570: 777 */       return str1 + a(aQ, this.O);
/*  571:     */     }
/*  572: 778 */     if (parambtr == btr.M) {
/*  573: 779 */       return str1 + a(aR, this.R);
/*  574:     */     }
/*  575: 780 */     if (parambtr == btr.N) {
/*  576: 781 */       return str1 + a(aS, this.S);
/*  577:     */     }
/*  578: 782 */     if (parambtr == btr.O) {
/*  579: 783 */       return str1 + a(aT, this.T);
/*  580:     */     }
/*  581: 784 */     if (parambtr == btr.l)
/*  582:     */     {
/*  583: 785 */       if (this.i) {
/*  584: 786 */         return str1 + cwc.a("options.graphics.fancy", new Object[0]);
/*  585:     */       }
/*  586: 788 */       String str2 = "options.graphics.fast";
/*  587: 789 */       return str1 + cwc.a("options.graphics.fast", new Object[0]);
/*  588:     */     }
/*  589: 792 */     return str1;
/*  590:     */   }
/*  591:     */   
/*  592:     */   public void a()
/*  593:     */   {
/*  594:     */     try
/*  595:     */     {
/*  596: 797 */       if (!this.aW.exists()) {
/*  597: 798 */         return;
/*  598:     */       }
/*  599: 800 */       BufferedReader localBufferedReader = new BufferedReader(new FileReader(this.aW));
/*  600: 801 */       String str = "";
/*  601: 802 */       this.aV.clear();
/*  602: 803 */       while ((str = localBufferedReader.readLine()) != null) {
/*  603:     */         try
/*  604:     */         {
/*  605: 805 */           String[] arrayOfString = str.split(":");
/*  606: 806 */           if (arrayOfString[0].equals("mouseSensitivity")) {
/*  607: 807 */             this.a = a(arrayOfString[1]);
/*  608:     */           }
/*  609: 809 */           if (arrayOfString[0].equals("fov")) {
/*  610: 810 */             this.aD = (a(arrayOfString[1]) * 40.0F + 70.0F);
/*  611:     */           }
/*  612: 812 */           if (arrayOfString[0].equals("gamma")) {
/*  613: 813 */             this.aE = a(arrayOfString[1]);
/*  614:     */           }
/*  615: 815 */           if (arrayOfString[0].equals("saturation")) {
/*  616: 816 */             this.aF = a(arrayOfString[1]);
/*  617:     */           }
/*  618: 818 */           if (arrayOfString[0].equals("invertYMouse")) {
/*  619: 819 */             this.b = arrayOfString[1].equals("true");
/*  620:     */           }
/*  621: 821 */           if (arrayOfString[0].equals("renderDistance")) {
/*  622: 822 */             this.c = Integer.parseInt(arrayOfString[1]);
/*  623:     */           }
/*  624: 824 */           if (arrayOfString[0].equals("guiScale")) {
/*  625: 825 */             this.aG = Integer.parseInt(arrayOfString[1]);
/*  626:     */           }
/*  627: 827 */           if (arrayOfString[0].equals("particles")) {
/*  628: 828 */             this.aH = Integer.parseInt(arrayOfString[1]);
/*  629:     */           }
/*  630: 830 */           if (arrayOfString[0].equals("bobView")) {
/*  631: 831 */             this.d = arrayOfString[1].equals("true");
/*  632:     */           }
/*  633: 833 */           if (arrayOfString[0].equals("anaglyph3d")) {
/*  634: 834 */             this.e = arrayOfString[1].equals("true");
/*  635:     */           }
/*  636: 836 */           if (arrayOfString[0].equals("maxFps")) {
/*  637: 837 */             this.g = Integer.parseInt(arrayOfString[1]);
/*  638:     */           }
/*  639: 839 */           if (arrayOfString[0].equals("fboEnable")) {
/*  640: 840 */             this.f = arrayOfString[1].equals("true");
/*  641:     */           }
/*  642: 842 */           if (arrayOfString[0].equals("difficulty")) {
/*  643: 843 */             this.av = EnumDifficulty.a(Integer.parseInt(arrayOfString[1]));
/*  644:     */           }
/*  645: 845 */           if (arrayOfString[0].equals("fancyGraphics")) {
/*  646: 846 */             this.i = arrayOfString[1].equals("true");
/*  647:     */           }
/*  648: 848 */           if (arrayOfString[0].equals("ao")) {
/*  649: 849 */             if (arrayOfString[1].equals("true")) {
/*  650: 850 */               this.j = 2;
/*  651: 851 */             } else if (arrayOfString[1].equals("false")) {
/*  652: 852 */               this.j = 0;
/*  653:     */             } else {
/*  654: 854 */               this.j = Integer.parseInt(arrayOfString[1]);
/*  655:     */             }
/*  656:     */           }
/*  657: 857 */           if (arrayOfString[0].equals("renderClouds")) {
/*  658: 858 */             this.h = arrayOfString[1].equals("true");
/*  659:     */           }
/*  660: 860 */           if (arrayOfString[0].equals("resourcePacks"))
/*  661:     */           {
/*  662: 861 */             this.k = ((List)aL.fromJson(str.substring(str.indexOf(':') + 1), aM));
/*  663: 862 */             if (this.k == null) {
/*  664: 863 */               this.k = Lists.newArrayList();
/*  665:     */             }
/*  666:     */           }
/*  667: 866 */           if ((arrayOfString[0].equals("lastServer")) && (arrayOfString.length >= 2)) {
/*  668: 867 */             this.aA = str.substring(str.indexOf(':') + 1);
/*  669:     */           }
/*  670: 869 */           if ((arrayOfString[0].equals("lang")) && (arrayOfString.length >= 2)) {
/*  671: 870 */             this.aI = arrayOfString[1];
/*  672:     */           }
/*  673: 872 */           if (arrayOfString[0].equals("chatVisibility")) {
/*  674: 873 */             this.l = ahg.a(Integer.parseInt(arrayOfString[1]));
/*  675:     */           }
/*  676: 875 */           if (arrayOfString[0].equals("chatColors")) {
/*  677: 876 */             this.m = arrayOfString[1].equals("true");
/*  678:     */           }
/*  679: 878 */           if (arrayOfString[0].equals("chatLinks")) {
/*  680: 879 */             this.n = arrayOfString[1].equals("true");
/*  681:     */           }
/*  682: 881 */           if (arrayOfString[0].equals("chatLinksPrompt")) {
/*  683: 882 */             this.o = arrayOfString[1].equals("true");
/*  684:     */           }
/*  685: 884 */           if (arrayOfString[0].equals("chatOpacity")) {
/*  686: 885 */             this.p = a(arrayOfString[1]);
/*  687:     */           }
/*  688: 887 */           if (arrayOfString[0].equals("snooperEnabled")) {
/*  689: 888 */             this.q = arrayOfString[1].equals("true");
/*  690:     */           }
/*  691: 890 */           if (arrayOfString[0].equals("fullscreen")) {
/*  692: 891 */             this.r = arrayOfString[1].equals("true");
/*  693:     */           }
/*  694: 893 */           if (arrayOfString[0].equals("enableVsync")) {
/*  695: 894 */             this.s = arrayOfString[1].equals("true");
/*  696:     */           }
/*  697: 896 */           if (arrayOfString[0].equals("useVbo")) {
/*  698: 897 */             this.t = arrayOfString[1].equals("true");
/*  699:     */           }
/*  700: 899 */           if (arrayOfString[0].equals("hideServerAddress")) {
/*  701: 900 */             this.w = arrayOfString[1].equals("true");
/*  702:     */           }
/*  703: 902 */           if (arrayOfString[0].equals("advancedItemTooltips")) {
/*  704: 903 */             this.x = arrayOfString[1].equals("true");
/*  705:     */           }
/*  706: 905 */           if (arrayOfString[0].equals("pauseOnLostFocus")) {
/*  707: 906 */             this.y = arrayOfString[1].equals("true");
/*  708:     */           }
/*  709: 908 */           if (arrayOfString[0].equals("touchscreen")) {
/*  710: 909 */             this.z = arrayOfString[1].equals("true");
/*  711:     */           }
/*  712: 911 */           if (arrayOfString[0].equals("overrideHeight")) {
/*  713: 912 */             this.B = Integer.parseInt(arrayOfString[1]);
/*  714:     */           }
/*  715: 914 */           if (arrayOfString[0].equals("overrideWidth")) {
/*  716: 915 */             this.A = Integer.parseInt(arrayOfString[1]);
/*  717:     */           }
/*  718: 917 */           if (arrayOfString[0].equals("heldItemTooltips")) {
/*  719: 918 */             this.C = arrayOfString[1].equals("true");
/*  720:     */           }
/*  721: 920 */           if (arrayOfString[0].equals("chatHeightFocused")) {
/*  722: 921 */             this.G = a(arrayOfString[1]);
/*  723:     */           }
/*  724: 923 */           if (arrayOfString[0].equals("chatHeightUnfocused")) {
/*  725: 924 */             this.F = a(arrayOfString[1]);
/*  726:     */           }
/*  727: 926 */           if (arrayOfString[0].equals("chatScale")) {
/*  728: 927 */             this.D = a(arrayOfString[1]);
/*  729:     */           }
/*  730: 929 */           if (arrayOfString[0].equals("chatWidth")) {
/*  731: 930 */             this.E = a(arrayOfString[1]);
/*  732:     */           }
/*  733: 932 */           if (arrayOfString[0].equals("showInventoryAchievementHint")) {
/*  734: 933 */             this.H = arrayOfString[1].equals("true");
/*  735:     */           }
/*  736: 935 */           if (arrayOfString[0].equals("mipmapLevels")) {
/*  737: 936 */             this.I = Integer.parseInt(arrayOfString[1]);
/*  738:     */           }
/*  739: 938 */           if (arrayOfString[0].equals("streamBytesPerPixel")) {
/*  740: 939 */             this.J = a(arrayOfString[1]);
/*  741:     */           }
/*  742: 941 */           if (arrayOfString[0].equals("streamMicVolume")) {
/*  743: 942 */             this.K = a(arrayOfString[1]);
/*  744:     */           }
/*  745: 944 */           if (arrayOfString[0].equals("streamSystemVolume")) {
/*  746: 945 */             this.L = a(arrayOfString[1]);
/*  747:     */           }
/*  748: 947 */           if (arrayOfString[0].equals("streamKbps")) {
/*  749: 948 */             this.M = a(arrayOfString[1]);
/*  750:     */           }
/*  751: 950 */           if (arrayOfString[0].equals("streamFps")) {
/*  752: 951 */             this.N = a(arrayOfString[1]);
/*  753:     */           }
/*  754: 953 */           if (arrayOfString[0].equals("streamCompression")) {
/*  755: 954 */             this.O = Integer.parseInt(arrayOfString[1]);
/*  756:     */           }
/*  757: 956 */           if (arrayOfString[0].equals("streamSendMetadata")) {
/*  758: 957 */             this.P = arrayOfString[1].equals("true");
/*  759:     */           }
/*  760: 959 */           if ((arrayOfString[0].equals("streamPreferredServer")) && (arrayOfString.length >= 2)) {
/*  761: 960 */             this.Q = str.substring(str.indexOf(':') + 1);
/*  762:     */           }
/*  763: 962 */           if (arrayOfString[0].equals("streamChatEnabled")) {
/*  764: 963 */             this.R = Integer.parseInt(arrayOfString[1]);
/*  765:     */           }
/*  766: 965 */           if (arrayOfString[0].equals("streamChatUserFilter")) {
/*  767: 966 */             this.S = Integer.parseInt(arrayOfString[1]);
/*  768:     */           }
/*  769: 968 */           if (arrayOfString[0].equals("streamMicToggleBehavior")) {
/*  770: 969 */             this.T = Integer.parseInt(arrayOfString[1]);
/*  771:     */           }
/*  772: 971 */           if (arrayOfString[0].equals("forceUnicodeFont")) {
/*  773: 972 */             this.aJ = arrayOfString[1].equals("true");
/*  774:     */           }
/*  775: 974 */           if (arrayOfString[0].equals("allowBlockAlternatives")) {
/*  776: 975 */             this.u = arrayOfString[1].equals("true");
/*  777:     */           }
/*  778: 977 */           if (arrayOfString[0].equals("reducedDebugInfo")) {
/*  779: 978 */             this.v = arrayOfString[1].equals("true");
/*  780:     */           }
/*  781:     */           
/*  782: 981 */           for (bsr localObject2 : this.at) {
/*  783: 982 */             if (arrayOfString[0].equals("key_" + localObject2.g())) {
/*  784: 983 */               localObject2.b(Integer.parseInt(arrayOfString[1]));
/*  785:     */             }
/*  786:     */           }
/*  787: 987 */           for (cxz localObject2 : cxz.values()) {
/*  788: 988 */             if (arrayOfString[0].equals("soundCategory_" + localObject2.a())) {
/*  789: 989 */               this.aV.put(localObject2, Float.valueOf(a(arrayOfString[1])));
/*  790:     */             }
/*  791:     */           }
/*  792: 993 */           for (ahh localObject2 : ahh.values()) {
/*  793: 994 */             if (arrayOfString[0].equals("modelPart_" + localObject2.c())) {
/*  794: 995 */               a(localObject2, arrayOfString[1].equals("true"));
/*  795:     */             }
/*  796:     */           }
/*  797:     */         }
/*  798:     */         catch (Exception localException2)
/*  799:     */         {
/*  800: 999 */           aK.warn("Skipping bad option: " + str);
/*  801:     */         }
/*  802:     */       }
/*  803:1002 */       bsr.b();
/*  804:1003 */       localBufferedReader.close();
/*  805:     */     }
/*  806:     */     catch (Exception localException1)
/*  807:     */     {
/*  808:1005 */       aK.error("Failed to load options", localException1);
/*  809:     */     }
/*  810:     */   }
/*  811:     */   
/*  812:     */   private float a(String paramString)
/*  813:     */   {
/*  814:1010 */     if (paramString.equals("true")) {
/*  815:1011 */       return 1.0F;
/*  816:     */     }
/*  817:1013 */     if (paramString.equals("false")) {
/*  818:1014 */       return 0.0F;
/*  819:     */     }
/*  820:1016 */     return Float.parseFloat(paramString);
/*  821:     */   }
/*  822:     */   
/*  823:     */   public void b()
/*  824:     */   {
/*  825:     */     try
/*  826:     */     {
/*  827:1021 */       PrintWriter localPrintWriter = new PrintWriter(new FileWriter(this.aW));
/*  828:     */       
/*  829:1023 */       localPrintWriter.println("invertYMouse:" + this.b);
/*  830:1024 */       localPrintWriter.println("mouseSensitivity:" + this.a);
/*  831:1025 */       localPrintWriter.println("fov:" + (this.aD - 70.0F) / 40.0F);
/*  832:1026 */       localPrintWriter.println("gamma:" + this.aE);
/*  833:1027 */       localPrintWriter.println("saturation:" + this.aF);
/*  834:1028 */       localPrintWriter.println("renderDistance:" + this.c);
/*  835:1029 */       localPrintWriter.println("guiScale:" + this.aG);
/*  836:1030 */       localPrintWriter.println("particles:" + this.aH);
/*  837:1031 */       localPrintWriter.println("bobView:" + this.d);
/*  838:1032 */       localPrintWriter.println("anaglyph3d:" + this.e);
/*  839:1033 */       localPrintWriter.println("maxFps:" + this.g);
/*  840:1034 */       localPrintWriter.println("fboEnable:" + this.f);
/*  841:1035 */       localPrintWriter.println("difficulty:" + this.av.a());
/*  842:1036 */       localPrintWriter.println("fancyGraphics:" + this.i);
/*  843:1037 */       localPrintWriter.println("ao:" + this.j);
/*  844:1038 */       localPrintWriter.println("renderClouds:" + this.h);
/*  845:1039 */       localPrintWriter.println("resourcePacks:" + aL.toJson(this.k));
/*  846:1040 */       localPrintWriter.println("lastServer:" + this.aA);
/*  847:1041 */       localPrintWriter.println("lang:" + this.aI);
/*  848:1042 */       localPrintWriter.println("chatVisibility:" + this.l.a());
/*  849:1043 */       localPrintWriter.println("chatColors:" + this.m);
/*  850:1044 */       localPrintWriter.println("chatLinks:" + this.n);
/*  851:1045 */       localPrintWriter.println("chatLinksPrompt:" + this.o);
/*  852:1046 */       localPrintWriter.println("chatOpacity:" + this.p);
/*  853:1047 */       localPrintWriter.println("snooperEnabled:" + this.q);
/*  854:1048 */       localPrintWriter.println("fullscreen:" + this.r);
/*  855:1049 */       localPrintWriter.println("enableVsync:" + this.s);
/*  856:1050 */       localPrintWriter.println("useVbo:" + this.t);
/*  857:1051 */       localPrintWriter.println("hideServerAddress:" + this.w);
/*  858:1052 */       localPrintWriter.println("advancedItemTooltips:" + this.x);
/*  859:1053 */       localPrintWriter.println("pauseOnLostFocus:" + this.y);
/*  860:1054 */       localPrintWriter.println("touchscreen:" + this.z);
/*  861:1055 */       localPrintWriter.println("overrideWidth:" + this.A);
/*  862:1056 */       localPrintWriter.println("overrideHeight:" + this.B);
/*  863:1057 */       localPrintWriter.println("heldItemTooltips:" + this.C);
/*  864:1058 */       localPrintWriter.println("chatHeightFocused:" + this.G);
/*  865:1059 */       localPrintWriter.println("chatHeightUnfocused:" + this.F);
/*  866:1060 */       localPrintWriter.println("chatScale:" + this.D);
/*  867:1061 */       localPrintWriter.println("chatWidth:" + this.E);
/*  868:1062 */       localPrintWriter.println("showInventoryAchievementHint:" + this.H);
/*  869:1063 */       localPrintWriter.println("mipmapLevels:" + this.I);
/*  870:1064 */       localPrintWriter.println("streamBytesPerPixel:" + this.J);
/*  871:1065 */       localPrintWriter.println("streamMicVolume:" + this.K);
/*  872:1066 */       localPrintWriter.println("streamSystemVolume:" + this.L);
/*  873:1067 */       localPrintWriter.println("streamKbps:" + this.M);
/*  874:1068 */       localPrintWriter.println("streamFps:" + this.N);
/*  875:1069 */       localPrintWriter.println("streamCompression:" + this.O);
/*  876:1070 */       localPrintWriter.println("streamSendMetadata:" + this.P);
/*  877:1071 */       localPrintWriter.println("streamPreferredServer:" + this.Q);
/*  878:1072 */       localPrintWriter.println("streamChatEnabled:" + this.R);
/*  879:1073 */       localPrintWriter.println("streamChatUserFilter:" + this.S);
/*  880:1074 */       localPrintWriter.println("streamMicToggleBehavior:" + this.T);
/*  881:1075 */       localPrintWriter.println("forceUnicodeFont:" + this.aJ);
/*  882:1076 */       localPrintWriter.println("allowBlockAlternatives:" + this.u);
/*  883:1077 */       localPrintWriter.println("reducedDebugInfo:" + this.v);
/*  884:     */       
/*  885:1079 */       for (bsr localbsr : this.at) {
/*  886:1080 */         localPrintWriter.println("key_" + localbsr.g() + ":" + localbsr.i());
/*  887:     */       }
/*  888:1083 */       for (cxz localcxz : cxz.values()) {
/*  889:1084 */         localPrintWriter.println("soundCategory_" + localcxz.a() + ":" + a(localcxz));
/*  890:     */       }
/*  891:1087 */       for (ahh localahh : ahh.values()) {
/*  892:1088 */         localPrintWriter.println("modelPart_" + localahh.c() + ":" + this.aU.contains(localahh));
/*  893:     */       }
/*  894:1091 */       localPrintWriter.close();
/*  895:     */     }
/*  896:     */     catch (Exception localException)
/*  897:     */     {
/*  898:1093 */       aK.error("Failed to save options", localException);
/*  899:     */     }
/*  900:1096 */     c();
/*  901:     */   }
/*  902:     */   
/*  903:     */   public float a(cxz paramcxz)
/*  904:     */   {
/*  905:1100 */     if (this.aV.containsKey(paramcxz)) {
/*  906:1101 */       return ((Float)this.aV.get(paramcxz)).floatValue();
/*  907:     */     }
/*  908:1104 */     return 1.0F;
/*  909:     */   }
/*  910:     */   
/*  911:     */   public void a(cxz paramcxz, float paramFloat)
/*  912:     */   {
/*  913:1108 */     this.au.U().a(paramcxz, paramFloat);
/*  914:1109 */     this.aV.put(paramcxz, Float.valueOf(paramFloat));
/*  915:     */   }
/*  916:     */   
/*  917:     */   public void c()
/*  918:     */   {
/*  919:1113 */     if (this.au.h != null)
/*  920:     */     {
/*  921:1114 */       int i1 = 0;
/*  922:1115 */       for (ahh localahh : this.aU) {
/*  923:1116 */         i1 |= localahh.a();
/*  924:     */       }
/*  925:1118 */       this.au.h.a.a(new lx(this.aI, this.c, this.l, this.m, i1));
/*  926:     */     }
/*  927:     */   }
/*  928:     */   
/*  929:     */   public Set<ahh> d()
/*  930:     */   {
/*  931:1123 */     return ImmutableSet.copyOf(this.aU);
/*  932:     */   }
/*  933:     */   
/*  934:     */   public void a(ahh paramahh, boolean paramBoolean)
/*  935:     */   {
/*  936:1127 */     if (paramBoolean) {
/*  937:1128 */       this.aU.add(paramahh);
/*  938:     */     } else {
/*  939:1130 */       this.aU.remove(paramahh);
/*  940:     */     }
/*  941:1132 */     c();
/*  942:     */   }
/*  943:     */   
/*  944:     */   public void a(ahh paramahh)
/*  945:     */   {
/*  946:1136 */     if (!d().contains(paramahh)) {
/*  947:1137 */       this.aU.add(paramahh);
/*  948:     */     } else {
/*  949:1139 */       this.aU.remove(paramahh);
/*  950:     */     }
/*  951:1141 */     c();
/*  952:     */   }
/*  953:     */   
/*  954:     */   public boolean e()
/*  955:     */   {
/*  956:1145 */     return (this.c >= 4) && (this.h);
/*  957:     */   }
/*  958:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bto
 * JD-Core Version:    0.7.0.1
 */
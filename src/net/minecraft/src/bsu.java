package net.minecraft.src;
/*    1:     */ import com.google.common.collect.Iterables;
/*    2:     */ import com.google.common.collect.Lists;
/*    3:     */ import com.google.common.collect.Maps;
/*    4:     */ import com.google.common.collect.Queues;
/*    5:     */ import com.google.common.collect.Sets;
/*    6:     */ import com.google.common.util.concurrent.Futures;
/*    7:     */ import com.google.common.util.concurrent.ListenableFuture;
/*    8:     */ import com.google.common.util.concurrent.ListenableFutureTask;
/*    9:     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*   10:     */ import com.mojang.authlib.properties.Property;
/*   11:     */ import com.mojang.authlib.properties.PropertyMap;
/*   12:     */ import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
/*   13:     */ import java.awt.image.BufferedImage;
/*   14:     */ import java.io.File;
/*   15:     */ import java.io.IOException;
/*   16:     */ import java.io.InputStream;
/*   17:     */ import java.net.Proxy;
/*   18:     */ import java.net.SocketAddress;
/*   19:     */ import java.nio.ByteBuffer;
/*   20:     */ import java.nio.ByteOrder;
/*   21:     */ import java.text.DecimalFormat;
/*   22:     */ import java.text.SimpleDateFormat;
/*   23:     */ import java.util.ArrayList;
/*   24:     */ import java.util.Collections;
/*   25:     */ import java.util.Date;
/*   26:     */ import java.util.HashMap;
/*   27:     */ import java.util.HashSet;
/*   28:     */ import java.util.Iterator;
/*   29:     */ import java.util.List;
/*   30:     */ import java.util.Map;
/*   31:     */ import java.util.Queue;
/*   32:     */ import java.util.Set;
/*   33:     */ import java.util.UUID;
/*   34:     */ import java.util.concurrent.Callable;
/*   35:     */ import java.util.concurrent.Executors;
/*   36:     */ import java.util.concurrent.FutureTask;
/*   37:     */ import javax.imageio.ImageIO;
/*   38:     */ import net.minecraft.client.ClientBrandRetriever;
/*   39:     */ import net.minecraft.server.MinecraftServer;
/*   40:     */ import org.apache.commons.io.IOUtils;
/*   41:     */ import org.apache.commons.lang3.Validate;
/*   42:     */ import org.apache.logging.log4j.LogManager;
/*   43:     */ import org.apache.logging.log4j.Logger;
/*   44:     */ import org.lwjgl.LWJGLException;
/*   45:     */ import org.lwjgl.Sys;
/*   46:     */ import org.lwjgl.input.Keyboard;
/*   47:     */ import org.lwjgl.input.Mouse;
/*   48:     */ import org.lwjgl.opengl.ContextCapabilities;
/*   49:     */ import org.lwjgl.opengl.Display;
/*   50:     */ import org.lwjgl.opengl.DisplayMode;
/*   51:     */ import org.lwjgl.opengl.GL11;
/*   52:     */ import org.lwjgl.opengl.GLContext;
/*   53:     */ import org.lwjgl.opengl.OpenGLException;
/*   54:     */ import org.lwjgl.opengl.PixelFormat;
/*   55:     */ import org.lwjgl.util.glu.GLU;
/*   56:     */ 
/*   57:     */ public class bsu
/*   58:     */   implements vn, wd
/*   59:     */ {
/*   60: 141 */   private static final Logger I = LogManager.getLogger();
/*   61: 142 */   private static final oa J = new oa("textures/gui/title/mojang.png");
/*   62: 143 */   public static final boolean a = net.minecraft.src.w.a() == net.minecraft.src.x.d;
/*   63: 148 */   public static byte[] b = new byte[10485760];
/*   64: 149 */   private static final List K = Lists.newArrayList(new DisplayMode[] { new DisplayMode(2560, 1600), new DisplayMode(2880, 1800) });
/*   65:     */   private final File L;
/*   66:     */   private final PropertyMap M;
/*   67:     */   private cew N;
/*   68:     */   private cug O;
/*   69:     */   private static bsu P;
/*   70:     */   public cem c;
/*   71:     */   private boolean Q;
/*   72: 162 */   private boolean R = true;
/*   73:     */   private boolean S;
/*   74:     */   private b T;
/*   75:     */   public int d;
/*   76:     */   public int e;
/*   77: 167 */   private btv U = new btv(20.0F);
/*   78: 168 */   private wb V = new wb("client", this, MinecraftServer.ax());
/*   79:     */   public cen f;
/*   80:     */   public ckn g;
/*   81:     */   private cpt W;
/*   82:     */   private cqh X;
/*   83:     */   private cki Y;
/*   84:     */   public cio h;
/*   85:     */   private Entity Z;
/*   86:     */   public Entity i;
/*   87:     */   public cgx j;
/*   88:     */   private final btw aa;
/*   89:     */   private boolean ab;
/*   90:     */   public bty k;
/*   91:     */   public bty l;
/*   92:     */   public bxf m;
/*   93:     */   public bts n;
/*   94:     */   public cji o;
/*   95:     */   private int ac;
/*   96:     */   private int ad;
/*   97:     */   private int ae;
/*   98:     */   private cyk af;
/*   99:     */   public bxt p;
/*  100:     */   public btz q;
/*  101:     */   public boolean r;
/*  102:     */   public HitResult s;
/*  103:     */   public bto t;
/*  104:     */   public btm u;
/*  105:     */   public final File v;
/*  106:     */   private final File ag;
/*  107:     */   private final String ah;
/*  108:     */   private final Proxy ai;
/*  109:     */   private bra aj;
/*  110:     */   private static int ak;
/*  111:     */   private int al;
/*  112:     */   private String am;
/*  113:     */   private int an;
/*  114:     */   public boolean w;
/*  115: 216 */   long x = I();
/*  116:     */   private int ao;
/*  117:     */   private final boolean ap;
/*  118:     */   private final boolean aq;
/*  119:     */   private gr ar;
/*  120:     */   private boolean as;
/*  121: 223 */   public final Profiler y = new Profiler();
/*  122: 224 */   private long at = -1L;
/*  123:     */   private cvi au;
/*  124: 226 */   private final cwk av = new cwk();
/*  125: 227 */   private final List aw = Lists.newArrayList();
/*  126:     */   private final cvb ax;
/*  127:     */   private cvo ay;
/*  128:     */   private cwe az;
/*  129:     */   private dao aA;
/*  130:     */   private ckw aB;
/*  131:     */   private cua aC;
/*  132:     */   private czh aD;
/*  133:     */   private cyx aE;
/*  134:     */   private oa aF;
/*  135:     */   private final MinecraftSessionService aG;
/*  136:     */   private cvw aH;
/*  137: 241 */   private final Queue aI = Queues.newArrayDeque();
/*  138: 242 */   private long aJ = 0L;
/*  139: 243 */   private final Thread aK = Thread.currentThread();
/*  140:     */   private cxk aL;
/*  141:     */   private cll aM;
/*  142: 247 */   volatile boolean z = true;
/*  143: 248 */   public String A = "";
/*  144: 249 */   public boolean B = false;
/*  145: 250 */   public boolean C = false;
/*  146: 251 */   public boolean D = false;
/*  147: 252 */   public boolean E = true;
/*  148: 254 */   long F = I();
/*  149:     */   int G;
/*  150:     */   
/*  151:     */   public bsu(cbf paramcbf)
/*  152:     */   {
/*  153: 258 */     P = this;
/*  154:     */     
/*  155: 260 */     this.v = paramcbf.c.a;
/*  156: 261 */     this.ag = paramcbf.c.c;
/*  157: 262 */     this.L = paramcbf.c.b;
/*  158: 263 */     this.ah = paramcbf.d.b;
/*  159: 264 */     this.M = paramcbf.a.b;
/*  160: 265 */     this.ax = new cvb(new cuz(paramcbf.c.c, paramcbf.c.d).a());
/*  161: 266 */     this.ai = (paramcbf.a.c == null ? Proxy.NO_PROXY : paramcbf.a.c);
/*  162: 267 */     this.aG = new YggdrasilAuthenticationService(paramcbf.a.c, UUID.randomUUID().toString()).createMinecraftSessionService();
/*  163:     */     
/*  164: 269 */     this.aa = paramcbf.a.a;
/*  165:     */     
/*  166: 271 */     I.info("Setting user: " + this.aa.c());
/*  167: 272 */     I.info("(Session ID is " + this.aa.a() + ")");
/*  168:     */     
/*  169: 274 */     this.aq = paramcbf.d.a;
/*  170: 275 */     this.d = (paramcbf.b.a > 0 ? paramcbf.b.a : 1);
/*  171: 276 */     this.e = (paramcbf.b.b > 0 ? paramcbf.b.b : 1);
/*  172: 277 */     this.ad = paramcbf.b.a;
/*  173: 278 */     this.ae = paramcbf.b.b;
/*  174: 279 */     this.Q = paramcbf.b.c;
/*  175:     */     
/*  176: 281 */     this.ap = ap();
/*  177: 282 */     this.af = new cyk(this);
/*  178: 285 */     if (paramcbf.e.a != null)
/*  179:     */     {
/*  180: 286 */       this.am = paramcbf.e.a;
/*  181: 287 */       this.an = paramcbf.e.b;
/*  182:     */     }
/*  183: 291 */     ImageIO.setUseCache(false);
/*  184:     */     
/*  185: 293 */     od.c();
/*  186:     */   }
/*  187:     */   
/*  188:     */   public void a()
/*  189:     */   {
/*  190: 297 */     this.z = true;
/*  191:     */     b localb;
/*  192:     */     try
/*  193:     */     {
/*  194: 299 */       aj();
/*  195:     */     }
/*  196:     */     catch (Throwable localThrowable1)
/*  197:     */     {
/*  198: 301 */       localb = net.minecraft.src.b.a(localThrowable1, "Initializing game");
/*  199: 302 */       localb.a("Initialization");
/*  200: 303 */       c(b(localb));
/*  201: 304 */       return;
/*  202:     */     }
/*  203:     */     try
/*  204:     */     {
/*  205: 307 */       while (this.z)
/*  206:     */       {
/*  207: 308 */         if ((this.S) && (this.T != null))
/*  208:     */         {
/*  209: 309 */           c(this.T); return;
/*  210:     */         }
/*  211:     */         try
/*  212:     */         {
/*  213: 314 */           as();
/*  214:     */         }
/*  215:     */         catch (OutOfMemoryError localOutOfMemoryError)
/*  216:     */         {
/*  217: 316 */           l();
/*  218: 317 */           a(new bwx());
/*  219: 318 */           System.gc();
/*  220:     */         }
/*  221:     */       }
/*  222:     */     }
/*  223:     */     catch (btu localbtu) {}catch (u localu)
/*  224:     */     {
/*  225: 323 */       b(localu.a());
/*  226: 324 */       l();
/*  227: 325 */       I.fatal("Reported exception thrown!", localu);
/*  228: 326 */       c(localu.a());
/*  229:     */     }
/*  230:     */     catch (Throwable localThrowable2)
/*  231:     */     {
/*  232: 328 */       localb = b(new b("Unexpected error", localThrowable2));
/*  233: 329 */       l();
/*  234: 330 */       I.fatal("Unreported exception thrown!", localThrowable2);
/*  235: 331 */       c(localb);
/*  236:     */     }
/*  237:     */     finally
/*  238:     */     {
/*  239: 333 */       g();
/*  240:     */     }
/*  241:     */   }
/*  242:     */   
/*  243:     */   private void aj() throws LWJGLException
/*  244:     */   {
/*  245: 338 */     this.t = new bto(this, this.v);
/*  246:     */     
/*  247: 340 */     this.aw.add(this.ax);
/*  248:     */     
/*  249: 342 */     aq();
/*  250: 344 */     if ((this.t.B > 0) && (this.t.A > 0))
/*  251:     */     {
/*  252: 345 */       this.d = this.t.A;
/*  253: 346 */       this.e = this.t.B;
/*  254:     */     }
/*  255: 349 */     I.info("LWJGL Version: " + Sys.getVersion());
/*  256: 350 */     ao();
/*  257: 351 */     an();
/*  258: 352 */     am();
/*  259:     */     
/*  260:     */ 
/*  261: 355 */     dax.a();
/*  262:     */     
/*  263: 357 */     this.aB = new ckw(this.d, this.e, true);
/*  264: 358 */     this.aB.a(0.0F, 0.0F, 0.0F, 0.0F);
/*  265:     */     
/*  266: 360 */     ak();
/*  267:     */     
/*  268: 362 */     this.ay = new cvo(this.L, new File(this.v, "server-resource-packs"), this.ax, this.av, this.t);
/*  269: 363 */     this.au = new cvt(this.av);
/*  270:     */     
/*  271: 365 */     this.az = new cwe(this.av, this.t.aI);
/*  272: 366 */     this.au.a(this.az);
/*  273:     */     
/*  274: 368 */     e();
/*  275:     */     
/*  276: 370 */     this.O = new cug(this.au);
/*  277: 371 */     this.au.a(this.O);
/*  278:     */     
/*  279: 373 */     a(this.O);
/*  280:     */     
/*  281: 375 */     al();
/*  282:     */     
/*  283: 377 */     this.aH = new cvw(this.O, new File(this.ag, "skins"), this.aG);
/*  284:     */     
/*  285: 379 */     this.aj = new bqj(new File(this.v, "saves"));
/*  286:     */     
/*  287: 381 */     this.aD = new czh(this.au, this.t);
/*  288: 382 */     this.au.a(this.aD);
/*  289:     */     
/*  290: 384 */     this.aE = new cyx(this);
/*  291:     */     
/*  292:     */ 
/*  293: 387 */     this.k = new bty(this.t, new oa("textures/font/ascii.png"), this.O, false);
/*  294: 388 */     if (this.t.aI != null)
/*  295:     */     {
/*  296: 389 */       this.k.a(d());
/*  297: 390 */       this.k.b(this.az.b());
/*  298:     */     }
/*  299: 393 */     this.l = new bty(this.t, new oa("textures/font/ascii_sga.png"), this.O, false);
/*  300:     */     
/*  301: 395 */     this.au.a(this.k);
/*  302: 396 */     this.au.a(this.l);
/*  303:     */     
/*  304: 398 */     this.au.a(new cvh());
/*  305: 399 */     this.au.a(new cvg());
/*  306:     */     
/*  307: 401 */     AchievementList.f.a(new bsv(this));
/*  308:     */     
/*  309:     */ 
/*  310:     */ 
/*  311:     */ 
/*  312:     */ 
/*  313:     */ 
/*  314:     */ 
/*  315:     */ 
/*  316:     */ 
/*  317:     */ 
/*  318: 412 */     this.u = new btm();
/*  319:     */     
/*  320: 414 */     b("Pre startup");
/*  321:     */     
/*  322: 416 */     cjm.w();
/*  323: 417 */     cjm.j(7425);
/*  324: 418 */     cjm.a(1.0D);
/*  325: 419 */     cjm.j();
/*  326: 420 */     cjm.c(515);
/*  327: 421 */     cjm.enableAlphaTest();
/*  328: 422 */     cjm.glAlphaFunc(516, 0.1F);
/*  329: 423 */     cjm.e(1029);
/*  330:     */     
/*  331: 425 */     cjm.glMatrixMode(5889);
/*  332: 426 */     cjm.glLoadIdentity();
/*  333: 427 */     cjm.glMatrixMode(5888);
/*  334: 428 */     b("Startup");
/*  335:     */     
/*  336: 430 */     this.aC = new cua("textures");
/*  337: 431 */     this.aC.a(this.t.I);
/*  338: 432 */     this.O.a(cua.g, this.aC);
/*  339: 433 */     this.O.a(cua.g);
/*  340: 434 */     this.aC.a(false, this.t.I > 0);
/*  341:     */     
/*  342: 436 */     this.aL = new cxk(this.aC);
/*  343: 437 */     this.au.a(this.aL);
/*  344:     */     
/*  345: 439 */     this.X = new cqh(this.O, this.aL);
/*  346: 440 */     this.W = new cpt(this.O, this.X);
/*  347: 441 */     this.Y = new cki(this);
/*  348: 442 */     this.au.a(this.X);
/*  349:     */     
/*  350: 444 */     this.o = new cji(this, this.au);
/*  351: 445 */     this.au.a(this.o);
/*  352:     */     
/*  353: 447 */     this.aM = new cll(this.aL.c(), this.t);
/*  354: 448 */     this.au.a(this.aM);
/*  355:     */     
/*  356: 450 */     this.g = new ckn(this);
/*  357: 451 */     this.au.a(this.g);
/*  358:     */     
/*  359: 453 */     this.p = new bxt(this);
/*  360:     */     
/*  361: 455 */     cjm.b(0, 0, this.d, this.e);
/*  362:     */     
/*  363: 457 */     this.j = new cgx(this.f, this.O);
/*  364:     */     
/*  365: 459 */     b("Post startup");
/*  366: 460 */     this.q = new btz(this);
/*  367: 462 */     if (this.am != null) {
/*  368: 463 */       a(new bwb(new bxq(), this, this.am, this.an));
/*  369:     */     } else {
/*  370: 465 */       a(new bxq());
/*  371:     */     }
/*  372: 469 */     this.O.c(this.aF);
/*  373: 470 */     this.aF = null;
/*  374:     */     
/*  375: 472 */     this.n = new bts(this);
/*  376: 474 */     if ((this.t.r) && (!this.Q)) {
/*  377: 475 */       q();
/*  378:     */     }
/*  379:     */     try
/*  380:     */     {
/*  381: 478 */       Display.setVSyncEnabled(this.t.s);
/*  382:     */     }
/*  383:     */     catch (OpenGLException localOpenGLException)
/*  384:     */     {
/*  385: 480 */       this.t.s = false;
/*  386: 481 */       this.t.b();
/*  387:     */     }
/*  388: 484 */     this.g.b();
/*  389:     */   }
/*  390:     */   
/*  391:     */   private void ak()
/*  392:     */   {
/*  393: 488 */     this.av.a(new cxc(), cxb.class);
/*  394: 489 */     this.av.a(new cws(), cwr.class);
/*  395: 490 */     this.av.a(new cwp(), cwo.class);
/*  396: 491 */     this.av.a(new cwy(), cwx.class);
/*  397: 492 */     this.av.a(new cwv(), cwu.class);
/*  398:     */   }
/*  399:     */   
/*  400:     */   private void al()
/*  401:     */   {
/*  402:     */     try
/*  403:     */     {
/*  404: 497 */       this.aA = new daq(this, (Property)Iterables.getFirst(this.M.get("twitch_access_token"), null));
/*  405:     */     }
/*  406:     */     catch (Throwable localThrowable)
/*  407:     */     {
/*  408: 499 */       this.aA = new dat(localThrowable);
/*  409: 500 */       I.error("Couldn't initialize twitch stream");
/*  410:     */     }
/*  411:     */   }
/*  412:     */   
/*  413:     */   private void am() throws LWJGLException
/*  414:     */   {
/*  415: 505 */     Display.setResizable(true);
/*  416: 506 */     Display.setTitle("Minecraft 1.8");
/*  417:     */     try
/*  418:     */     {
/*  419: 510 */       Display.create(new PixelFormat().withDepthBits(24));
/*  420:     */     }
/*  421:     */     catch (LWJGLException localLWJGLException)
/*  422:     */     {
/*  423: 513 */       I.error("Couldn't set pixel format", localLWJGLException);
/*  424:     */       try
/*  425:     */       {
/*  426: 515 */         Thread.sleep(1000L);
/*  427:     */       }
/*  428:     */       catch (InterruptedException localInterruptedException) {}
/*  429: 519 */       if (this.Q) {
/*  430: 520 */         ar();
/*  431:     */       }
/*  432: 523 */       Display.create();
/*  433:     */     }
/*  434:     */   }
/*  435:     */   
/*  436:     */   private void an() throws LWJGLException
/*  437:     */   {
/*  438: 528 */     if (this.Q)
/*  439:     */     {
/*  440: 529 */       Display.setFullscreen(true);
/*  441: 530 */       DisplayMode localDisplayMode = Display.getDisplayMode();
/*  442: 531 */       this.d = Math.max(1, localDisplayMode.getWidth());
/*  443: 532 */       this.e = Math.max(1, localDisplayMode.getHeight());
/*  444:     */     }
/*  445:     */     else
/*  446:     */     {
/*  447: 534 */       Display.setDisplayMode(new DisplayMode(this.d, this.e));
/*  448:     */     }
/*  449:     */   }
/*  450:     */   
/*  451:     */   private void ao()
/*  452:     */   {
/*  453: 540 */     x localx = net.minecraft.src.w.a();
/*  454: 541 */     if (localx != net.minecraft.src.x.d)
/*  455:     */     {
/*  456: 542 */       InputStream localInputStream1 = null;
/*  457: 543 */       InputStream localInputStream2 = null;
/*  458:     */       try
/*  459:     */       {
/*  460: 545 */         localInputStream1 = this.ax.c(new oa("icons/icon_16x16.png"));
/*  461: 546 */         localInputStream2 = this.ax.c(new oa("icons/icon_32x32.png"));
/*  462: 548 */         if ((localInputStream1 != null) && (localInputStream2 != null)) {
/*  463: 549 */           Display.setIcon(new ByteBuffer[] { a(localInputStream1), a(localInputStream2) });
/*  464:     */         }
/*  465:     */       }
/*  466:     */       catch (IOException localIOException)
/*  467:     */       {
/*  468: 554 */         I.error("Couldn't set icon", localIOException);
/*  469:     */       }
/*  470:     */       finally
/*  471:     */       {
/*  472: 556 */         IOUtils.closeQuietly(localInputStream1);
/*  473: 557 */         IOUtils.closeQuietly(localInputStream2);
/*  474:     */       }
/*  475:     */     }
/*  476:     */   }
/*  477:     */   
/*  478:     */   private static boolean ap()
/*  479:     */   {
/*  480: 563 */     String[] arrayOfString1 = { "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch" };
/*  481: 565 */     for (String str1 : arrayOfString1)
/*  482:     */     {
/*  483: 566 */       String str2 = System.getProperty(str1);
/*  484: 567 */       if ((str2 != null) && 
/*  485: 568 */         (str2.contains("64"))) {
/*  486: 569 */         return true;
/*  487:     */       }
/*  488:     */     }
/*  489: 574 */     return false;
/*  490:     */   }
/*  491:     */   
/*  492:     */   public ckw b()
/*  493:     */   {
/*  494: 578 */     return this.aB;
/*  495:     */   }
/*  496:     */   
/*  497:     */   public String c()
/*  498:     */   {
/*  499: 582 */     return this.ah;
/*  500:     */   }
/*  501:     */   
/*  502:     */   private void aq()
/*  503:     */   {
/*  504: 587 */     bte localbte = new bte(this, "Timer hack thread");
/*  505:     */     
/*  506:     */ 
/*  507:     */ 
/*  508:     */ 
/*  509:     */ 
/*  510:     */ 
/*  511:     */ 
/*  512:     */ 
/*  513:     */ 
/*  514:     */ 
/*  515: 598 */     localbte.setDaemon(true);
/*  516: 599 */     localbte.start();
/*  517:     */   }
/*  518:     */   
/*  519:     */   public void a(b paramb)
/*  520:     */   {
/*  521: 603 */     this.S = true;
/*  522: 604 */     this.T = paramb;
/*  523:     */   }
/*  524:     */   
/*  525:     */   public void c(b paramb)
/*  526:     */   {
/*  527: 608 */     File localFile1 = new File(z().v, "crash-reports");
/*  528: 609 */     File localFile2 = new File(localFile1, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
/*  529:     */     
/*  530:     */ 
/*  531: 612 */     od.a(paramb.e());
/*  532: 613 */     if (paramb.f() != null)
/*  533:     */     {
/*  534: 614 */       od.a("#@!@# Game crashed! Crash report saved to: #@!@# " + paramb.f());
/*  535: 615 */       System.exit(-1);
/*  536:     */     }
/*  537: 616 */     else if (paramb.a(localFile2))
/*  538:     */     {
/*  539: 617 */       od.a("#@!@# Game crashed! Crash report saved to: #@!@# " + localFile2.getAbsolutePath());
/*  540: 618 */       System.exit(-1);
/*  541:     */     }
/*  542:     */     else
/*  543:     */     {
/*  544: 620 */       od.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
/*  545: 621 */       System.exit(-2);
/*  546:     */     }
/*  547:     */   }
/*  548:     */   
/*  549:     */   public boolean d()
/*  550:     */   {
/*  551: 626 */     return (this.az.a()) || (this.t.aJ);
/*  552:     */   }
/*  553:     */   
/*  554:     */   public void e()
/*  555:     */   {
/*  556: 630 */     ArrayList localArrayList = Lists.newArrayList(this.aw);
/*  557: 632 */     for (cvs localcvs : this.ay.c()) {
/*  558: 633 */       localArrayList.add(localcvs.c());
/*  559:     */     }
/*  560: 636 */     if (this.ay.e() != null) {
/*  561: 637 */       localArrayList.add(this.ay.e());
/*  562:     */     }
/*  563:     */     try
/*  564:     */     {
/*  565: 641 */       this.au.a(localArrayList);
/*  566:     */     }
/*  567:     */     catch (RuntimeException localRuntimeException)
/*  568:     */     {
/*  569: 643 */       I.info("Caught error stitching, removing all assigned resourcepacks", localRuntimeException);
/*  570:     */       
/*  571: 645 */       localArrayList.clear();
/*  572: 646 */       localArrayList.addAll(this.aw);
/*  573: 647 */       this.ay.a(Collections.emptyList());
/*  574:     */       
/*  575: 649 */       this.au.a(localArrayList);
/*  576:     */       
/*  577: 651 */       this.t.k.clear();
/*  578: 652 */       this.t.b();
/*  579:     */     }
/*  580: 654 */     this.az.a(localArrayList);
/*  581: 656 */     if (this.g != null) {
/*  582: 657 */       this.g.a();
/*  583:     */     }
/*  584:     */   }
/*  585:     */   
/*  586:     */   private ByteBuffer a(InputStream paramInputStream) throws IOException
/*  587:     */   {
/*  588: 662 */     BufferedImage localBufferedImage = ImageIO.read(paramInputStream);
/*  589: 663 */     int[] arrayOfInt1 = localBufferedImage.getRGB(0, 0, localBufferedImage.getWidth(), localBufferedImage.getHeight(), null, 0, localBufferedImage.getWidth());
/*  590:     */     
/*  591: 665 */     ByteBuffer localByteBuffer = ByteBuffer.allocate(4 * arrayOfInt1.length);
/*  592: 666 */     for (int i3 : arrayOfInt1) {
/*  593: 667 */       localByteBuffer.putInt(i3 << 8 | i3 >> 24 & 0xFF);
/*  594:     */     }
/*  595: 669 */     localByteBuffer.flip();
/*  596: 670 */     return localByteBuffer;
/*  597:     */   }
/*  598:     */   
/*  599:     */   private void ar() throws LWJGLException
/*  600:     */   {
/*  601: 674 */     HashSet localHashSet = Sets.newHashSet();
/*  602: 675 */     Collections.addAll(localHashSet, Display.getAvailableDisplayModes());
/*  603:     */     
/*  604: 677 */     Object localObject = Display.getDesktopDisplayMode();
/*  605:     */     
/*  606: 678 */     if (!localHashSet.contains(localObject)) {
/*  607: 680 */       if (net.minecraft.src.w.a() == net.minecraft.src.x.d) {
/*  608: 681 */         for (Iterator<DisplayMode> localIterator1 = K.iterator(); localIterator1.hasNext();)
/*  609:     */         {
/*  610: 681 */           DisplayMode localDisplayMode1 = (DisplayMode)localIterator1.next();
/*  611:     */           
/*  612: 683 */           int i1 = 1;
/*  613: 684 */           for (Iterator<DisplayMode> localIterator2 = localHashSet.iterator(); localIterator2.hasNext();)
/*  614:     */           {
/*  615: 684 */             DisplayMode localDisplayMode2 = (DisplayMode)localIterator2.next();
/*  616: 685 */             if ((localDisplayMode2.getBitsPerPixel() == 32) && (localDisplayMode2.getWidth() == localDisplayMode1.getWidth()) && (localDisplayMode2.getHeight() == localDisplayMode1.getHeight()))
/*  617:     */             {
/*  618: 686 */               i1 = 0;
/*  619: 687 */               break;
/*  620:     */             }
/*  621:     */           }
/*  622: 691 */           if (i1 == 0) {
/*  623: 696 */             for (Iterator<DisplayMode> localIterator2 = localHashSet.iterator(); localIterator2.hasNext();)
/*  624:     */             {
/*  625: 696 */               DisplayMode localDisplayMode2 = (DisplayMode)localIterator2.next();
/*  626: 697 */               if ((localDisplayMode2.getBitsPerPixel() == 32) && (localDisplayMode2.getWidth() == localDisplayMode1.getWidth() / 2) && (localDisplayMode2.getHeight() == localDisplayMode1.getHeight() / 2))
/*  627:     */               {
/*  628: 698 */                 localObject = localDisplayMode2;
/*  629: 699 */                 break;
/*  630:     */               }
/*  631:     */             }
/*  632:     */           }
/*  633:     */         }
/*  634:     */       }
/*  635:     */     }
/*  636:     */     DisplayMode localDisplayMode1;
/*  637:     */     Iterator localIterator2;
/*  638:     */     DisplayMode localDisplayMode2;
/*  639: 706 */     Display.setDisplayMode((DisplayMode)localObject);
/*  640: 707 */     this.d = ((DisplayMode)localObject).getWidth();
/*  641: 708 */     this.e = ((DisplayMode)localObject).getHeight();
/*  642:     */   }
/*  643:     */   
/*  644:     */   private void a(cug paramcug)
/*  645:     */   {
/*  646: 712 */     buf localbuf = new buf(this, this.d, this.e);
/*  647: 713 */     int i1 = localbuf.e();
/*  648: 714 */     ckw localckw = new ckw(localbuf.a() * i1, localbuf.b() * i1, true);
/*  649: 715 */     localckw.a(false);
/*  650:     */     
/*  651: 717 */     cjm.glMatrixMode(5889);
/*  652: 718 */     cjm.glLoadIdentity();
/*  653: 719 */     cjm.glOrtho(0.0D, localbuf.a(), localbuf.b(), 0.0D, 1000.0D, 3000.0D);
/*  654: 720 */     cjm.glMatrixMode(5888);
/*  655: 721 */     cjm.glLoadIdentity();
/*  656: 722 */     cjm.glTranslatef(0.0F, 0.0F, -2000.0F);
/*  657:     */     
/*  658: 724 */     cjm.disableLighting();
/*  659: 725 */     cjm.n();
/*  660: 726 */     cjm.i();
/*  661:     */     
/*  662: 728 */     cjm.w();
/*  663:     */     
/*  664: 730 */     InputStream localInputStream = null;
/*  665:     */     try
/*  666:     */     {
/*  667: 732 */       localInputStream = this.ax.a(J);
/*  668: 733 */       this.aF = paramcug.a("logo", new ctp(ImageIO.read(localInputStream)));
/*  669: 734 */       paramcug.a(this.aF);
/*  670:     */     }
/*  671:     */     catch (IOException localIOException)
/*  672:     */     {
/*  673: 736 */       I.error("Unable to load logo: " + J, localIOException);
/*  674:     */     }
/*  675:     */     finally
/*  676:     */     {
/*  677: 738 */       IOUtils.closeQuietly(localInputStream);
/*  678:     */     }
/*  679: 741 */     ckx localckx = ckx.getInstance();
/*  680: 742 */     VertexBuffer localciv = localckx.getBuffer();
/*  681: 743 */     localciv.begin();
/*  682: 744 */     localciv.setColor(16777215);
/*  683: 745 */     localciv.addVertexWithUV(0.0D, this.e, 0.0D, 0.0D, 0.0D);
/*  684: 746 */     localciv.addVertexWithUV(this.d, this.e, 0.0D, 0.0D, 0.0D);
/*  685: 747 */     localciv.addVertexWithUV(this.d, 0.0D, 0.0D, 0.0D, 0.0D);
/*  686: 748 */     localciv.addVertexWithUV(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/*  687: 749 */     localckx.draw();
/*  688:     */     
/*  689: 751 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  690: 752 */     localciv.setColor(16777215);
/*  691:     */     
/*  692: 754 */     int i2 = 256;
/*  693: 755 */     int i3 = 256;
/*  694: 756 */     a((localbuf.a() - i2) / 2, (localbuf.b() - i3) / 2, 0, 0, i2, i3);
/*  695:     */     
/*  696: 758 */     cjm.disableLighting();
/*  697: 759 */     cjm.n();
/*  698:     */     
/*  699: 761 */     localckw.e();
/*  700: 762 */     localckw.c(localbuf.a() * i1, localbuf.b() * i1);
/*  701:     */     
/*  702: 764 */     cjm.enableAlphaTest();
/*  703: 765 */     cjm.glAlphaFunc(516, 0.1F);
/*  704:     */     
/*  705: 767 */     h();
/*  706:     */   }
/*  707:     */   
/*  708:     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  709:     */   {
/*  710: 771 */     float f1 = 0.0039063F;
/*  711: 772 */     float f2 = 0.0039063F;
/*  712: 773 */     VertexBuffer localciv = ckx.getInstance().getBuffer();
/*  713: 774 */     localciv.begin();
/*  714: 775 */     localciv.addVertexWithUV(paramInt1 + 0, paramInt2 + paramInt6, 0.0D, (paramInt3 + 0) * f1, (paramInt4 + paramInt6) * f2);
/*  715: 776 */     localciv.addVertexWithUV(paramInt1 + paramInt5, paramInt2 + paramInt6, 0.0D, (paramInt3 + paramInt5) * f1, (paramInt4 + paramInt6) * f2);
/*  716: 777 */     localciv.addVertexWithUV(paramInt1 + paramInt5, paramInt2 + 0, 0.0D, (paramInt3 + paramInt5) * f1, (paramInt4 + 0) * f2);
/*  717: 778 */     localciv.addVertexWithUV(paramInt1 + 0, paramInt2 + 0, 0.0D, (paramInt3 + 0) * f1, (paramInt4 + 0) * f2);
/*  718: 779 */     ckx.getInstance().draw();
/*  719:     */   }
/*  720:     */   
/*  721:     */   public bra f()
/*  722:     */   {
/*  723: 783 */     return this.aj;
/*  724:     */   }
/*  725:     */   
/*  726:     */   public void a(bxf parambxf)
/*  727:     */   {
/*  728: 787 */     if (this.m != null) {
/*  729: 788 */       this.m.m();
/*  730:     */     }
/*  731: 791 */     if ((parambxf == null) && (this.f == null)) {
/*  732: 792 */       parambxf = new bxq();
/*  733: 793 */     } else if ((parambxf == null) && (this.h.getHealth() <= 0.0F)) {
/*  734: 794 */       parambxf = new bwl();
/*  735:     */     }
/*  736: 797 */     if ((parambxf instanceof bxq))
/*  737:     */     {
/*  738: 798 */       this.t.ay = false;
/*  739: 799 */       this.q.d().a();
/*  740:     */     }
/*  741: 802 */     this.m = parambxf;
/*  742: 804 */     if (parambxf != null)
/*  743:     */     {
/*  744: 805 */       o();
/*  745: 806 */       buf localbuf = new buf(this, this.d, this.e);
/*  746: 807 */       int i1 = localbuf.a();
/*  747: 808 */       int i2 = localbuf.b();
/*  748: 809 */       parambxf.a(this, i1, i2);
/*  749: 810 */       this.r = false;
/*  750:     */     }
/*  751:     */     else
/*  752:     */     {
/*  753: 812 */       this.aD.e();
/*  754: 813 */       n();
/*  755:     */     }
/*  756:     */   }
/*  757:     */   
/*  758:     */   private void b(String paramString)
/*  759:     */   {
/*  760: 818 */     if (!this.R) {
/*  761: 819 */       return;
/*  762:     */     }
/*  763: 822 */     int i1 = GL11.glGetError();
/*  764: 823 */     if (i1 != 0)
/*  765:     */     {
/*  766: 824 */       String str = GLU.gluErrorString(i1);
/*  767: 825 */       I.error("########## GL ERROR ##########");
/*  768: 826 */       I.error("@ " + paramString);
/*  769: 827 */       I.error(i1 + ": " + str);
/*  770:     */     }
/*  771:     */   }
/*  772:     */   
/*  773:     */   public void g()
/*  774:     */   {
/*  775:     */     try
/*  776:     */     {
/*  777: 833 */       this.aA.f();
/*  778:     */       
/*  779: 835 */       I.info("Stopping!");
/*  780:     */       try
/*  781:     */       {
/*  782: 837 */         a((cen)null);
/*  783:     */       }
/*  784:     */       catch (Throwable localThrowable) {}
/*  785: 841 */       this.aD.d();
/*  786:     */     }
/*  787:     */     finally
/*  788:     */     {
/*  789: 843 */       Display.destroy();
/*  790: 844 */       if (!this.S) {
/*  791: 845 */         System.exit(0);
/*  792:     */       }
/*  793:     */     }
/*  794: 848 */     System.gc();
/*  795:     */   }
/*  796:     */   
/*  797:     */   private void as()
/*  798:     */   {
/*  799: 852 */     this.y.a("root");
/*  800: 853 */     if ((Display.isCreated()) && (Display.isCloseRequested())) {
/*  801: 854 */       m();
/*  802:     */     }
/*  803: 858 */     if ((this.ab) && (this.f != null))
/*  804:     */     {
/*  805: 859 */       float f1 = this.U.c;
/*  806: 860 */       this.U.a();
/*  807: 861 */       this.U.c = f1;
/*  808:     */     }
/*  809:     */     else
/*  810:     */     {
/*  811: 863 */       this.U.a();
/*  812:     */     }
/*  813: 866 */     this.y.a("scheduledExecutables");
/*  814: 867 */     synchronized (this.aI)
/*  815:     */     {
/*  816: 868 */       while (!this.aI.isEmpty()) {
/*  817: 869 */         ((FutureTask)this.aI.poll()).run();
/*  818:     */       }
/*  819:     */     }
/*  820: 872 */     this.y.b();
/*  821:     */     
/*  822: 874 */     long l1 = System.nanoTime();
/*  823: 875 */     this.y.a("tick");
/*  824: 876 */     for (int i1 = 0; i1 < this.U.b; i1++) {
/*  825: 877 */       r();
/*  826:     */     }
/*  827: 880 */     this.y.c("preRenderErrors");
/*  828: 881 */     long l2 = System.nanoTime() - l1;
/*  829: 882 */     b("Pre render");
/*  830:     */     
/*  831: 884 */     this.y.c("sound");
/*  832: 885 */     this.aD.a(this.h, this.U.c);
/*  833: 886 */     this.y.b();
/*  834:     */     
/*  835: 888 */     this.y.a("render");
/*  836:     */     
/*  837: 890 */     cjm.glPushMatrix();
/*  838: 891 */     cjm.glClear(16640);
/*  839: 892 */     this.aB.a(true);
/*  840:     */     
/*  841: 894 */     this.y.a("display");
/*  842: 895 */     cjm.w();
/*  843: 897 */     if ((this.h != null) && (this.h.aj())) {
/*  844: 898 */       this.t.ax = 0;
/*  845:     */     }
/*  846: 900 */     this.y.b();
/*  847: 901 */     if (!this.r)
/*  848:     */     {
/*  849: 902 */       this.y.c("gameRenderer");
/*  850: 903 */       this.o.b(this.U.c);
/*  851: 904 */       this.y.b();
/*  852:     */     }
/*  853: 907 */     this.y.b();
/*  854: 909 */     if ((this.t.ay) && (this.t.az) && (!this.t.aw))
/*  855:     */     {
/*  856: 910 */       if (!this.y.a) {
/*  857: 911 */         this.y.a();
/*  858:     */       }
/*  859: 913 */       this.y.a = true;
/*  860: 914 */       a(l2);
/*  861:     */     }
/*  862:     */     else
/*  863:     */     {
/*  864: 916 */       this.y.a = false;
/*  865: 917 */       this.H = System.nanoTime();
/*  866:     */     }
/*  867: 920 */     this.p.a();
/*  868:     */     
/*  869: 922 */     this.aB.e();
/*  870: 923 */     cjm.glPopMatrix();
/*  871: 924 */     cjm.glPushMatrix();
/*  872: 925 */     this.aB.c(this.d, this.e);
/*  873: 926 */     cjm.glPopMatrix();
/*  874: 927 */     cjm.glPushMatrix();
/*  875: 928 */     this.o.c(this.U.c);
/*  876: 929 */     cjm.glPopMatrix();
/*  877: 930 */     this.y.a("root");
/*  878:     */     
/*  879: 932 */     h();
/*  880:     */     
/*  881: 934 */     Thread.yield();
/*  882:     */     
/*  883: 936 */     this.y.a("stream");
/*  884: 937 */     this.y.a("update");
/*  885: 938 */     this.aA.g();
/*  886: 939 */     this.y.c("submit");
/*  887: 940 */     this.aA.h();
/*  888: 941 */     this.y.b();
/*  889: 942 */     this.y.b();
/*  890:     */     
/*  891: 944 */     b("Post render");
/*  892: 945 */     this.G += 1;
/*  893: 946 */     this.ab = ((E()) && (this.m != null) && (this.m.d()) && (!this.af.b()));
/*  894: 948 */     while (I() >= this.F + 1000L)
/*  895:     */     {
/*  896: 949 */       ak = this.G;
/*  897: 950 */       this.A = String.format("%d fps (%d chunk update%s) T: %s%s%s%s%s", new Object[] { Integer.valueOf(ak), Integer.valueOf(cop.a), cop.a != 1 ? "s" : "", this.t.g == btr.i.f() ? "inf" : Integer.valueOf(this.t.g), this.t.s ? " vsync" : "", this.t.i ? "" : " fast", this.t.h ? " clouds" : "", dax.f() ? " vbo" : "" });
/*  898:     */       
/*  899:     */ 
/*  900:     */ 
/*  901:     */ 
/*  902:     */ 
/*  903:     */ 
/*  904:     */ 
/*  905:     */ 
/*  906:     */ 
/*  907: 960 */       cop.a = 0;
/*  908: 961 */       this.F += 1000L;
/*  909: 962 */       this.G = 0;
/*  910: 963 */       this.V.b();
/*  911: 965 */       if (!this.V.d()) {
/*  912: 966 */         this.V.a();
/*  913:     */       }
/*  914:     */     }
/*  915: 969 */     if (k())
/*  916:     */     {
/*  917: 970 */       this.y.a("fpslimit_wait");
/*  918: 971 */       Display.sync(j());
/*  919: 972 */       this.y.b();
/*  920:     */     }
/*  921: 974 */     this.y.b();
/*  922:     */   }
/*  923:     */   
/*  924:     */   public void h()
/*  925:     */   {
/*  926: 978 */     this.y.a("display_update");
/*  927: 979 */     Display.update();
/*  928: 980 */     this.y.b();
/*  929: 981 */     i();
/*  930:     */   }
/*  931:     */   
/*  932:     */   protected void i()
/*  933:     */   {
/*  934: 985 */     if ((!this.Q) && (Display.wasResized()))
/*  935:     */     {
/*  936: 986 */       int i1 = this.d;
/*  937: 987 */       int i2 = this.e;
/*  938: 988 */       this.d = Display.getWidth();
/*  939: 989 */       this.e = Display.getHeight();
/*  940: 990 */       if ((this.d != i1) || (this.e != i2))
/*  941:     */       {
/*  942: 991 */         if (this.d <= 0) {
/*  943: 992 */           this.d = 1;
/*  944:     */         }
/*  945: 994 */         if (this.e <= 0) {
/*  946: 995 */           this.e = 1;
/*  947:     */         }
/*  948: 998 */         a(this.d, this.e);
/*  949:     */       }
/*  950:     */     }
/*  951:     */   }
/*  952:     */   
/*  953:     */   public int j()
/*  954:     */   {
/*  955:1004 */     if ((this.f == null) && (this.m != null)) {
/*  956:1005 */       return 30;
/*  957:     */     }
/*  958:1007 */     return this.t.g;
/*  959:     */   }
/*  960:     */   
/*  961:     */   public boolean k()
/*  962:     */   {
/*  963:1012 */     return j() < btr.i.f();
/*  964:     */   }
/*  965:     */   
/*  966:     */   public void l()
/*  967:     */   {
/*  968:     */     try
/*  969:     */     {
/*  970:1017 */       b = new byte[0];
/*  971:1018 */       this.g.k();
/*  972:     */     }
/*  973:     */     catch (Throwable localThrowable1) {}
/*  974:     */     try
/*  975:     */     {
/*  976:1022 */       System.gc();
/*  977:1023 */       a((cen)null);
/*  978:     */     }
/*  979:     */     catch (Throwable localThrowable2) {}
/*  980:1026 */     System.gc();
/*  981:     */   }
/*  982:     */   
/*  983:1106 */   long H = -1L;
/*  984:1108 */   private String aN = "root";
/*  985:     */   
/*  986:     */   private void b(int paramInt)
/*  987:     */   {
/*  988:1111 */     List<ux> localList = this.y.b(this.aN);
/*  989:1112 */     if ((localList == null) || (localList.isEmpty())) {
/*  990:1113 */       return;
/*  991:     */     }
/*  992:1116 */     ux localux = localList.remove(0);
/*  993:1117 */     if (paramInt == 0)
/*  994:     */     {
/*  995:1118 */       if (localux.c.length() > 0)
/*  996:     */       {
/*  997:1119 */         int i1 = this.aN.lastIndexOf(".");
/*  998:1120 */         if (i1 >= 0) {
/*  999:1121 */           this.aN = this.aN.substring(0, i1);
/* 1000:     */         }
/* 1001:     */       }
/* 1002:     */     }
/* 1003:     */     else
/* 1004:     */     {
/* 1005:1125 */       paramInt--;
/* 1006:1126 */       if ((paramInt < localList.size()) && (!((ux)localList.get(paramInt)).c.equals("unspecified")))
/* 1007:     */       {
/* 1008:1127 */         if (this.aN.length() > 0) {
/* 1009:1128 */           this.aN += ".";
/* 1010:     */         }
/* 1011:1130 */         this.aN += ((ux)localList.get(paramInt)).c;
/* 1012:     */       }
/* 1013:     */     }
/* 1014:     */   }
/* 1015:     */   
/* 1016:     */   private void a(long paramLong)
/* 1017:     */   {
/* 1018:1136 */     if (!this.y.a) {
/* 1019:1137 */       return;
/* 1020:     */     }
/* 1021:1139 */     List<ux> localList = this.y.b(this.aN);
/* 1022:1140 */     ux localux1 = (ux)localList.remove(0);
/* 1023:     */     
/* 1024:1142 */     cjm.glClear(256);
/* 1025:1143 */     cjm.glMatrixMode(5889);
/* 1026:1144 */     cjm.g();
/* 1027:1145 */     cjm.glLoadIdentity();
/* 1028:1146 */     cjm.glOrtho(0.0D, this.d, this.e, 0.0D, 1000.0D, 3000.0D);
/* 1029:1147 */     cjm.glMatrixMode(5888);
/* 1030:1148 */     cjm.glLoadIdentity();
/* 1031:1149 */     cjm.glTranslatef(0.0F, 0.0F, -2000.0F);
/* 1032:     */     
/* 1033:1151 */     GL11.glLineWidth(1.0F);
/* 1034:1152 */     cjm.x();
/* 1035:1153 */     ckx localckx = ckx.getInstance();
/* 1036:1154 */     VertexBuffer localciv = localckx.getBuffer();
/* 1037:     */     
/* 1038:1156 */     int i1 = 160;
/* 1039:1157 */     int i2 = this.d - i1 - 10;
/* 1040:1158 */     int i3 = this.e - i1 * 2;
/* 1041:1159 */     cjm.enableBlend();
/* 1042:1160 */     localciv.begin();
/* 1043:1161 */     localciv.setColor(0, 200);
/* 1044:1162 */     localciv.addVertex(i2 - i1 * 1.1F, i3 - i1 * 0.6F - 16.0F, 0.0D);
/* 1045:1163 */     localciv.addVertex(i2 - i1 * 1.1F, i3 + i1 * 2, 0.0D);
/* 1046:1164 */     localciv.addVertex(i2 + i1 * 1.1F, i3 + i1 * 2, 0.0D);
/* 1047:1165 */     localciv.addVertex(i2 + i1 * 1.1F, i3 - i1 * 0.6F - 16.0F, 0.0D);
/* 1048:1166 */     localckx.draw();
/* 1049:1167 */     cjm.disableBlend();
/* 1050:     */     
/* 1051:1169 */     double d1 = 0.0D;
/* 1052:1170 */     for (int i4 = 0; i4 < localList.size(); i4++)
/* 1053:     */     {
/* 1054:1171 */       ux localObject = (ux)localList.get(i4);
/* 1055:     */       
/* 1056:1173 */       int i6 = MathUtils.floor(((ux)localObject).a / 4.0D) + 1;
/* 1057:     */       
/* 1058:1175 */       localciv.a(6);
/* 1059:1176 */       localciv.setColor(((ux)localObject).a());
/* 1060:1177 */       localciv.addVertex(i2, i3, 0.0D);
/* 1061:     */       float f1;
/* 1062:     */       float f2;
/* 1063:     */       float f3;
/* 1064:1178 */       for (int i7 = i6; i7 >= 0; i7--)
/* 1065:     */       {
/* 1066:1179 */         f1 = (float)((d1 + ((ux)localObject).a * i7 / i6) * 3.141592741012573D * 2.0D / 100.0D);
/* 1067:1180 */         f2 = MathUtils.sin(f1) * i1;
/* 1068:1181 */         f3 = MathUtils.cos(f1) * i1 * 0.5F;
/* 1069:1182 */         localciv.addVertex(i2 + f2, i3 - f3, 0.0D);
/* 1070:     */       }
/* 1071:1184 */       localckx.draw();
/* 1072:     */       
/* 1073:1186 */       localciv.a(5);
/* 1074:1187 */       localciv.setColor((((ux)localObject).a() & 0xFEFEFE) >> 1);
/* 1075:1188 */       for (int i7 = i6; i7 >= 0; i7--)
/* 1076:     */       {
/* 1077:1189 */         f1 = (float)((d1 + ((ux)localObject).a * i7 / i6) * 3.141592741012573D * 2.0D / 100.0D);
/* 1078:1190 */         f2 = MathUtils.sin(f1) * i1;
/* 1079:1191 */         f3 = MathUtils.cos(f1) * i1 * 0.5F;
/* 1080:1192 */         localciv.addVertex(i2 + f2, i3 - f3, 0.0D);
/* 1081:1193 */         localciv.addVertex(i2 + f2, i3 - f3 + 10.0F, 0.0D);
/* 1082:     */       }
/* 1083:1195 */       localckx.draw();
/* 1084:     */       
/* 1085:1197 */       d1 += ((ux)localObject).a;
/* 1086:     */     }
/* 1087:1199 */     DecimalFormat localDecimalFormat = new DecimalFormat("##0.00");
/* 1088:     */     
/* 1089:1201 */     cjm.w();
/* 1090:     */     
/* 1091:     */ 
/* 1092:1204 */     String localObject = "";
/* 1093:1205 */     if (!localux1.c.equals("unspecified")) {
/* 1094:1206 */       localObject = (String)localObject + "[0] ";
/* 1095:     */     }
/* 1096:1208 */     if (localux1.c.length() == 0) {
/* 1097:1209 */       localObject = (String)localObject + "ROOT ";
/* 1098:     */     } else {
/* 1099:1211 */       localObject = (String)localObject + localux1.c + " ";
/* 1100:     */     }
/* 1101:1213 */     int i6 = 16777215;
/* 1102:1214 */     this.k.a((String)localObject, i2 - i1, i3 - i1 / 2 - 16, i6);
/* 1103:1215 */     this.k.a(localObject = localDecimalFormat.format(localux1.b) + "%", i2 + i1 - this.k.a((String)localObject), i3 - i1 / 2 - 16, i6);
/* 1104:1218 */     for (int i5 = 0; i5 < localList.size(); i5++)
/* 1105:     */     {
/* 1106:1219 */       ux localux2 = (ux)localList.get(i5);
/* 1107:1220 */       String str = "";
/* 1108:1221 */       if (localux2.c.equals("unspecified")) {
/* 1109:1222 */         str = str + "[?] ";
/* 1110:     */       } else {
/* 1111:1224 */         str = str + "[" + (i5 + 1) + "] ";
/* 1112:     */       }
/* 1113:1227 */       str = str + localux2.c;
/* 1114:1228 */       this.k.a(str, i2 - i1, i3 + i1 / 2 + i5 * 8 + 20, localux2.a());
/* 1115:1229 */       this.k.a(str = localDecimalFormat.format(localux2.a) + "%", i2 + i1 - 50 - this.k.a(str), i3 + i1 / 2 + i5 * 8 + 20, localux2.a());
/* 1116:1230 */       this.k.a(str = localDecimalFormat.format(localux2.b) + "%", i2 + i1 - this.k.a(str), i3 + i1 / 2 + i5 * 8 + 20, localux2.a());
/* 1117:     */     }
/* 1118:     */   }
/* 1119:     */   
/* 1120:     */   public void m()
/* 1121:     */   {
/* 1122:1235 */     this.z = false;
/* 1123:     */   }
/* 1124:     */   
/* 1125:     */   public void n()
/* 1126:     */   {
/* 1127:1239 */     if (!Display.isActive()) {
/* 1128:1240 */       return;
/* 1129:     */     }
/* 1130:1242 */     if (this.w) {
/* 1131:1243 */       return;
/* 1132:     */     }
/* 1133:1245 */     this.w = true;
/* 1134:1246 */     this.u.a();
/* 1135:1247 */     a((bxf)null);
/* 1136:1248 */     this.ac = 10000;
/* 1137:     */   }
/* 1138:     */   
/* 1139:     */   public void o()
/* 1140:     */   {
/* 1141:1252 */     if (!this.w) {
/* 1142:1253 */       return;
/* 1143:     */     }
/* 1144:1255 */     bsr.a();
/* 1145:1256 */     this.w = false;
/* 1146:1257 */     this.u.b();
/* 1147:     */   }
/* 1148:     */   
/* 1149:     */   public void p()
/* 1150:     */   {
/* 1151:1261 */     if (this.m != null) {
/* 1152:1262 */       return;
/* 1153:     */     }
/* 1154:1265 */     a(new bwy());
/* 1155:1266 */     if ((E()) && (!this.af.b())) {
/* 1156:1267 */       this.aD.a();
/* 1157:     */     }
/* 1158:     */   }
/* 1159:     */   
/* 1160:     */   private void a(boolean paramBoolean)
/* 1161:     */   {
/* 1162:1272 */     if (!paramBoolean) {
/* 1163:1273 */       this.ac = 0;
/* 1164:     */     }
/* 1165:1275 */     if ((this.ac > 0) || (this.h.bR())) {
/* 1166:1276 */       return;
/* 1167:     */     }
/* 1168:1279 */     if ((paramBoolean) && (this.s != null) && (this.s.a == brv.BLOCK))
/* 1169:     */     {
/* 1170:1280 */       BlockPosition localdt = this.s.a();
/* 1171:1282 */       if ((this.f.getBlock(localdt).getProto().getMaterial() != Material.air) && 
/* 1172:1283 */         (this.c.c(localdt, this.s.b)))
/* 1173:     */       {
/* 1174:1284 */         this.j.a(localdt, this.s.b);
/* 1175:1285 */         this.h.bv();
/* 1176:     */       }
/* 1177:1288 */       return;
/* 1178:     */     }
/* 1179:1291 */     this.c.c();
/* 1180:     */   }
/* 1181:     */   
/* 1182:     */   private void at()
/* 1183:     */   {
/* 1184:1295 */     if (this.ac > 0) {
/* 1185:1296 */       return;
/* 1186:     */     }
/* 1187:1298 */     this.h.bv();
/* 1188:1300 */     if (this.s == null)
/* 1189:     */     {
/* 1190:1301 */       I.error("Null returned as 'hitResult', this shouldn't happen!");
/* 1191:1302 */       if (this.c.g()) {
/* 1192:1303 */         this.ac = 10;
/* 1193:     */       }
/* 1194:1305 */       return;
/* 1195:     */     }
/* 1196:1308 */     switch (btd.a[this.s.a.ordinal()])
/* 1197:     */     {
/* 1198:     */     case 1: 
/* 1199:1310 */       this.c.a(this.h, this.s.d);
/* 1200:1311 */       break;
/* 1201:     */     case 2: 
/* 1202:1313 */       BlockPosition localdt = this.s.a();
/* 1203:1315 */       if (this.f.getBlock(localdt).getProto().getMaterial() != Material.air) {
/* 1204:1316 */         this.c.b(localdt, this.s.b);
/* 1205:     */       }
/* 1206:1317 */       break;
/* 1207:     */     }
/* 1208:1322 */     if (this.c.g()) {
/* 1209:1323 */       this.ac = 10;
/* 1210:     */     }
/* 1211:     */   }
/* 1212:     */   
/* 1213:     */   private void au()
/* 1214:     */   {
/* 1215:1329 */     this.al = 4;
/* 1216:1330 */     int i1 = 1;
/* 1217:     */     
/* 1218:1332 */     ItemStack localamj = this.h.bg.h();
/* 1219:     */     Object localObject;
/* 1220:1333 */     if (this.s == null) {
/* 1221:1334 */       I.warn("Null returned as 'hitResult', this shouldn't happen!");
/* 1222:     */     } else {
/* 1223:1336 */       switch (btd.a[this.s.a.ordinal()])
/* 1224:     */       {
/* 1225:     */       case 1: 
/* 1226:1338 */         if (this.c.a(this.h, this.s.d, this.s)) {
/* 1227:1339 */           i1 = 0;
/* 1228:1342 */         } else if (this.c.b(this.h, this.s.d)) {
/* 1229:1343 */           i1 = 0;
/* 1230:     */         }
/* 1231:     */         break;
/* 1232:     */       case 2: 
/* 1233:1347 */         localObject = this.s.a();
/* 1234:1349 */         if (this.f.getBlock((BlockPosition)localObject).getProto().getMaterial() != Material.air)
/* 1235:     */         {
/* 1236:1350 */           int i2 = localamj != null ? localamj.stackSize : 0;
/* 1237:1351 */           if (this.c.a(this.h, this.f, localamj, (BlockPosition)localObject, this.s.b, this.s.c))
/* 1238:     */           {
/* 1239:1352 */             i1 = 0;
/* 1240:1353 */             this.h.bv();
/* 1241:     */           }
/* 1242:1355 */           if (localamj == null) {
/* 1243:1356 */             return;
/* 1244:     */           }
/* 1245:1359 */           if (localamj.stackSize == 0) {
/* 1246:1360 */             this.h.bg.a[this.h.bg.c] = null;
/* 1247:1361 */           } else if ((localamj.stackSize != i2) || (this.c.h())) {
/* 1248:1362 */             this.o.c.b();
/* 1249:     */           }
/* 1250:     */         }
/* 1251:     */         break;
/* 1252:     */       }
/* 1253:     */     }
/* 1254:1369 */     if (i1 != 0)
/* 1255:     */     {
/* 1256:1370 */       localObject = this.h.bg.h();
/* 1257:1371 */       if ((localObject != null) && 
/* 1258:1372 */         (this.c.a(this.h, this.f, (ItemStack)localObject))) {
/* 1259:1373 */         this.o.c.c();
/* 1260:     */       }
/* 1261:     */     }
/* 1262:     */   }
/* 1263:     */   
/* 1264:     */   public void q()
/* 1265:     */   {
/* 1266:     */     try
/* 1267:     */     {
/* 1268:1381 */       this.Q = (!this.Q);
/* 1269:1382 */       this.t.r = this.Q;
/* 1270:1383 */       if (this.Q)
/* 1271:     */       {
/* 1272:1384 */         ar();
/* 1273:1385 */         this.d = Display.getDisplayMode().getWidth();
/* 1274:1386 */         this.e = Display.getDisplayMode().getHeight();
/* 1275:1387 */         if (this.d <= 0) {
/* 1276:1388 */           this.d = 1;
/* 1277:     */         }
/* 1278:1390 */         if (this.e <= 0) {
/* 1279:1391 */           this.e = 1;
/* 1280:     */         }
/* 1281:     */       }
/* 1282:     */       else
/* 1283:     */       {
/* 1284:1394 */         Display.setDisplayMode(new DisplayMode(this.ad, this.ae));
/* 1285:1395 */         this.d = this.ad;
/* 1286:1396 */         this.e = this.ae;
/* 1287:1397 */         if (this.d <= 0) {
/* 1288:1398 */           this.d = 1;
/* 1289:     */         }
/* 1290:1400 */         if (this.e <= 0) {
/* 1291:1401 */           this.e = 1;
/* 1292:     */         }
/* 1293:     */       }
/* 1294:1404 */       if (this.m != null) {
/* 1295:1405 */         a(this.d, this.e);
/* 1296:     */       } else {
/* 1297:1407 */         av();
/* 1298:     */       }
/* 1299:1409 */       Display.setFullscreen(this.Q);
/* 1300:1410 */       Display.setVSyncEnabled(this.t.s);
/* 1301:1411 */       h();
/* 1302:     */     }
/* 1303:     */     catch (Exception localException)
/* 1304:     */     {
/* 1305:1413 */       I.error("Couldn't toggle fullscreen", localException);
/* 1306:     */     }
/* 1307:     */   }
/* 1308:     */   
/* 1309:     */   private void a(int paramInt1, int paramInt2)
/* 1310:     */   {
/* 1311:1418 */     this.d = Math.max(1, paramInt1);
/* 1312:1419 */     this.e = Math.max(1, paramInt2);
/* 1313:1421 */     if (this.m != null)
/* 1314:     */     {
/* 1315:1422 */       buf localbuf = new buf(this, paramInt1, paramInt2);
/* 1316:1423 */       this.m.b(this, localbuf.a(), localbuf.b());
/* 1317:     */     }
/* 1318:1425 */     this.n = new bts(this);
/* 1319:1426 */     av();
/* 1320:     */   }
/* 1321:     */   
/* 1322:     */   private void av()
/* 1323:     */   {
/* 1324:1430 */     this.aB.a(this.d, this.e);
/* 1325:1431 */     if (this.o != null) {
/* 1326:1432 */       this.o.a(this.d, this.e);
/* 1327:     */     }
/* 1328:     */   }
/* 1329:     */   
/* 1330:     */   public void r()
/* 1331:     */   {
/* 1332:1437 */     if (this.al > 0) {
/* 1333:1438 */       this.al -= 1;
/* 1334:     */     }
/* 1335:1441 */     this.y.a("gui");
/* 1336:1442 */     if (!this.ab) {
/* 1337:1443 */       this.q.c();
/* 1338:     */     }
/* 1339:1445 */     this.y.b();
/* 1340:1446 */     this.o.a(1.0F);
/* 1341:     */     
/* 1342:1448 */     this.y.a("gameMode");
/* 1343:1449 */     if ((!this.ab) && (this.f != null)) {
/* 1344:1450 */       this.c.e();
/* 1345:     */     }
/* 1346:1452 */     this.y.c("textures");
/* 1347:1453 */     if (!this.ab) {
/* 1348:1454 */       this.O.e();
/* 1349:     */     }
/* 1350:1457 */     if ((this.m == null) && (this.h != null))
/* 1351:     */     {
/* 1352:1458 */       if (this.h.getHealth() <= 0.0F) {
/* 1353:1459 */         a((bxf)null);
/* 1354:1460 */       } else if ((this.h.bI()) && (this.f != null)) {
/* 1355:1461 */         a(new bwr());
/* 1356:     */       }
/* 1357:     */     }
/* 1358:1463 */     else if ((this.m != null) && ((this.m instanceof bwr)) && (!this.h.bI())) {
/* 1359:1464 */       a((bxf)null);
/* 1360:     */     }
/* 1361:1467 */     if (this.m != null) {
/* 1362:1468 */       this.ac = 10000;
/* 1363:     */     }
/* 1364:     */     j localj;
/* 1365:1471 */     if (this.m != null)
/* 1366:     */     {
/* 1367:     */       b localb1;
/* 1368:     */       try
/* 1369:     */       {
/* 1370:1473 */         this.m.p();
/* 1371:     */       }
/* 1372:     */       catch (Throwable localThrowable1)
/* 1373:     */       {
/* 1374:1475 */         localb1 = net.minecraft.src.b.a(localThrowable1, "Updating screen events");
/* 1375:1476 */         localj = localb1.a("Affected screen");
/* 1376:1477 */         localj.a("Screen name", new btf(this));
/* 1377:     */         
/* 1378:     */ 
/* 1379:     */ 
/* 1380:     */ 
/* 1381:     */ 
/* 1382:1483 */         throw new u(localb1);
/* 1383:     */       }
/* 1384:1486 */       if (this.m != null) {
/* 1385:     */         try
/* 1386:     */         {
/* 1387:1488 */           this.m.e();
/* 1388:     */         }
/* 1389:     */         catch (Throwable localThrowable2)
/* 1390:     */         {
/* 1391:1490 */           localb1 = net.minecraft.src.b.a(localThrowable2, "Ticking screen");
/* 1392:1491 */           localj = localb1.a("Affected screen");
/* 1393:1492 */           localj.a("Screen name", new btg(this));
/* 1394:     */           
/* 1395:     */ 
/* 1396:     */ 
/* 1397:     */ 
/* 1398:     */ 
/* 1399:1498 */           throw new u(localb1);
/* 1400:     */         }
/* 1401:     */       }
/* 1402:     */     }
/* 1403:1503 */     if ((this.m == null) || (this.m.p))
/* 1404:     */     {
/* 1405:1504 */       this.y.c("mouse");
/* 1406:1506 */       while (Mouse.next())
/* 1407:     */       {
/* 1408:1507 */         int i1 = Mouse.getEventButton();
/* 1409:     */         
/* 1410:1509 */         bsr.a(i1 - 100, Mouse.getEventButtonState());
/* 1411:1510 */         if (Mouse.getEventButtonState()) {
/* 1412:1511 */           if ((this.h.v()) && (i1 == 2)) {
/* 1413:1512 */             this.q.g().b();
/* 1414:     */           } else {
/* 1415:1514 */             bsr.a(i1 - 100);
/* 1416:     */           }
/* 1417:     */         }
/* 1418:1518 */         long l1 = I() - this.x;
/* 1419:1519 */         if (l1 <= 200L)
/* 1420:     */         {
/* 1421:1523 */           int i2 = Mouse.getEventDWheel();
/* 1422:1524 */           if (i2 != 0) {
/* 1423:1525 */             if (this.h.v())
/* 1424:     */             {
/* 1425:1526 */               i2 = i2 < 0 ? -1 : 1;
/* 1426:1528 */               if (this.q.g().a())
/* 1427:     */               {
/* 1428:1529 */                 this.q.g().b(-i2);
/* 1429:     */               }
/* 1430:     */               else
/* 1431:     */               {
/* 1432:1531 */                 float f1 = MathUtils.clamp(this.h.by.a() + i2 * 0.005F, 0.0F, 0.2F);
/* 1433:1532 */                 this.h.by.a(f1);
/* 1434:     */               }
/* 1435:     */             }
/* 1436:     */             else
/* 1437:     */             {
/* 1438:1535 */               this.h.bg.d(i2);
/* 1439:     */             }
/* 1440:     */           }
/* 1441:1539 */           if (this.m == null)
/* 1442:     */           {
/* 1443:1540 */             if ((!this.w) && (Mouse.getEventButtonState())) {
/* 1444:1541 */               n();
/* 1445:     */             }
/* 1446:     */           }
/* 1447:1543 */           else if (this.m != null) {
/* 1448:1544 */             this.m.k();
/* 1449:     */           }
/* 1450:     */         }
/* 1451:     */       }
/* 1452:1548 */       if (this.ac > 0) {
/* 1453:1549 */         this.ac -= 1;
/* 1454:     */       }
/* 1455:1552 */       this.y.c("keyboard");
/* 1456:1553 */       while (Keyboard.next())
/* 1457:     */       {
/* 1458:1554 */         int i1 = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() + 'Ā' : Keyboard.getEventKey();
/* 1459:1555 */         bsr.a(i1, Keyboard.getEventKeyState());
/* 1460:1557 */         if (Keyboard.getEventKeyState()) {
/* 1461:1558 */           bsr.a(i1);
/* 1462:     */         }
/* 1463:1561 */         if (this.at > 0L)
/* 1464:     */         {
/* 1465:1562 */           if (I() - this.at >= 6000L) {
/* 1466:1563 */             throw new u(new b("Manually triggered debug crash", new Throwable()));
/* 1467:     */           }
/* 1468:1566 */           if ((!Keyboard.isKeyDown(46)) || (!Keyboard.isKeyDown(61))) {
/* 1469:1567 */             this.at = -1L;
/* 1470:     */           }
/* 1471:     */         }
/* 1472:1569 */         else if ((Keyboard.isKeyDown(46)) && (Keyboard.isKeyDown(61)))
/* 1473:     */         {
/* 1474:1570 */           this.at = I();
/* 1475:     */         }
/* 1476:1573 */         X();
/* 1477:1575 */         if (Keyboard.getEventKeyState())
/* 1478:     */         {
/* 1479:1576 */           if ((i1 == 62) && 
/* 1480:1577 */             (this.o != null)) {
/* 1481:1578 */             this.o.c();
/* 1482:     */           }
/* 1483:     */           boolean bool;
/* 1484:1647 */           if (this.m != null)
/* 1485:     */           {
/* 1486:1648 */             this.m.l();
/* 1487:     */           }
/* 1488:     */           else
/* 1489:     */           {
/* 1490:1650 */             if (i1 == 1) {
/* 1491:1651 */               p();
/* 1492:     */             }
/* 1493:1654 */             if ((i1 == 32) && (Keyboard.isKeyDown(61)) && 
/* 1494:1655 */               (this.q != null)) {
/* 1495:1656 */               this.q.d().a();
/* 1496:     */             }
/* 1497:1659 */             if ((i1 == 31) && (Keyboard.isKeyDown(61))) {
/* 1498:1660 */               e();
/* 1499:     */             }
/* 1500:1662 */             if (((i1 != 17) || (!Keyboard.isKeyDown(61))) || (
/* 1501:     */             
/* 1502:     */ 
/* 1503:1665 */               ((i1 != 18) || (!Keyboard.isKeyDown(61))) || (
/* 1504:     */               
/* 1505:     */ 
/* 1506:1668 */               ((i1 != 47) || (!Keyboard.isKeyDown(61))) || (
/* 1507:     */               
/* 1508:     */ 
/* 1509:1671 */               ((i1 != 38) || (!Keyboard.isKeyDown(61))) || (
/* 1510:     */               
/* 1511:     */ 
/* 1512:1674 */               ((i1 != 22) || (!Keyboard.isKeyDown(61))) || (
/* 1513:     */               
/* 1514:     */ 
/* 1515:     */ 
/* 1516:     */ 
/* 1517:     */ 
/* 1518:     */ 
/* 1519:     */ 
/* 1520:1682 */               (i1 == 20) && (Keyboard.isKeyDown(61)))))))) {
/* 1521:1683 */               e();
/* 1522:     */             }
/* 1523:1685 */             if ((i1 == 33) && (Keyboard.isKeyDown(61)))
/* 1524:     */             {
/* 1525:1686 */               bool = Keyboard.isKeyDown(42) | Keyboard.isKeyDown(54);
/* 1526:1687 */               this.t.a(btr.f, bool ? -1 : 1);
/* 1527:     */             }
/* 1528:1689 */             if ((i1 == 30) && (Keyboard.isKeyDown(61))) {
/* 1529:1690 */               this.g.a();
/* 1530:     */             }
/* 1531:1692 */             if ((i1 == 35) && (Keyboard.isKeyDown(61)))
/* 1532:     */             {
/* 1533:1693 */               this.t.x = (!this.t.x);
/* 1534:1694 */               this.t.b();
/* 1535:     */             }
/* 1536:1696 */             if ((i1 == 48) && (Keyboard.isKeyDown(61))) {
/* 1537:1697 */               this.W.b(!this.W.b());
/* 1538:     */             }
/* 1539:1699 */             if ((i1 == 25) && (Keyboard.isKeyDown(61)))
/* 1540:     */             {
/* 1541:1700 */               this.t.y = (!this.t.y);
/* 1542:1701 */               this.t.b();
/* 1543:     */             }
/* 1544:1703 */             if (i1 == 59) {
/* 1545:1704 */               this.t.aw = (!this.t.aw);
/* 1546:     */             }
/* 1547:1706 */             if (i1 == 61)
/* 1548:     */             {
/* 1549:1707 */               this.t.ay = (!this.t.ay);
/* 1550:1708 */               this.t.az = bxf.r();
/* 1551:     */             }
/* 1552:1710 */             if (this.t.ak.f())
/* 1553:     */             {
/* 1554:1711 */               this.t.ax += 1;
/* 1555:1712 */               if (this.t.ax > 2) {
/* 1556:1713 */                 this.t.ax = 0;
/* 1557:     */               }
/* 1558:1715 */               if (this.t.ax == 0) {
/* 1559:1716 */                 this.o.a(aa());
/* 1560:1717 */               } else if (this.t.ax == 1) {
/* 1561:1718 */                 this.o.a((Entity)null);
/* 1562:     */               }
/* 1563:     */             }
/* 1564:1721 */             if (this.t.al.f()) {
/* 1565:1722 */               this.t.aB = (!this.t.aB);
/* 1566:     */             }
/* 1567:     */           }
/* 1568:1726 */           if ((this.t.ay) && (this.t.az))
/* 1569:     */           {
/* 1570:1727 */             if (i1 == 11) {
/* 1571:1728 */               b(0);
/* 1572:     */             }
/* 1573:1730 */             for (int i2 = 0; i2 < 9; i2++) {
/* 1574:1731 */               if (i1 == 2 + i2) {
/* 1575:1732 */                 b(i2 + 1);
/* 1576:     */               }
/* 1577:     */             }
/* 1578:     */           }
/* 1579:     */         }
/* 1580:     */       }
/* 1581:1739 */       for (int i1 = 0; i1 < 9; i1++) {
/* 1582:1740 */         if (this.t.as[i1].f()) {
/* 1583:1741 */           if (this.h.v()) {
/* 1584:1742 */             this.q.g().a(i1);
/* 1585:     */           } else {
/* 1586:1744 */             this.h.bg.c = i1;
/* 1587:     */           }
/* 1588:     */         }
/* 1589:     */       }
/* 1590:1749 */       int i1 = this.t.l != ahg.HIDDEN ? 1 : 0;
/* 1591:1751 */       while (this.t.aa.f()) {
/* 1592:1752 */         if (this.c.j())
/* 1593:     */         {
/* 1594:1753 */           this.h.u();
/* 1595:     */         }
/* 1596:     */         else
/* 1597:     */         {
/* 1598:1755 */           t().a(new lv(lw.OPEN_INVENTORY_ACHIEVEMENT));
/* 1599:1756 */           a(new bzj(this.h));
/* 1600:     */         }
/* 1601:     */       }
/* 1602:1759 */       while (this.t.ac.f()) {
/* 1603:1760 */         if (!this.h.v()) {
/* 1604:1761 */           this.h.a(bxf.q());
/* 1605:     */         }
/* 1606:     */       }
/* 1607:1764 */       while ((this.t.ag.f()) && (i1 != 0)) {
/* 1608:1765 */         a(new bvx());
/* 1609:     */       }
/* 1610:1767 */       if ((this.m == null) && (this.t.ai.f()) && (i1 != 0)) {
/* 1611:1768 */         a(new bvx("/"));
/* 1612:     */       }
/* 1613:1771 */       if (this.h.bR())
/* 1614:     */       {
/* 1615:1772 */         if (!this.t.ab.d()) {
/* 1616:1773 */           this.c.c(this.h);
/* 1617:     */         }
/* 1618:1776 */         while (this.t.ad.f()) {}
/* 1619:1778 */         while (this.t.ab.f()) {}
/* 1620:1780 */         while (this.t.ae.f()) {}
/* 1621:     */       }
/* 1622:1783 */       while (this.t.ad.f()) {
/* 1623:1784 */         at();
/* 1624:     */       }
/* 1625:1786 */       while (this.t.ab.f()) {
/* 1626:1787 */         au();
/* 1627:     */       }
/* 1628:1789 */       while (this.t.ae.f()) {
/* 1629:1790 */         aw();
/* 1630:     */       }
/* 1631:1794 */       if ((this.t.ab.d()) && (this.al == 0) && (!this.h.bR())) {
/* 1632:1795 */         au();
/* 1633:     */       }
/* 1634:1798 */       a((this.m == null) && (this.t.ad.d()) && (this.w));
/* 1635:     */     }
/* 1636:1801 */     if (this.f != null)
/* 1637:     */     {
/* 1638:1802 */       if (this.h != null)
/* 1639:     */       {
/* 1640:1803 */         this.ao += 1;
/* 1641:1804 */         if (this.ao == 30)
/* 1642:     */         {
/* 1643:1805 */           this.ao = 0;
/* 1644:1806 */           this.f.h(this.h);
/* 1645:     */         }
/* 1646:     */       }
/* 1647:1810 */       this.y.c("gameRenderer");
/* 1648:1811 */       if (!this.ab) {
/* 1649:1812 */         this.o.e();
/* 1650:     */       }
/* 1651:1814 */       this.y.c("levelRenderer");
/* 1652:1815 */       if (!this.ab) {
/* 1653:1816 */         this.g.j();
/* 1654:     */       }
/* 1655:1818 */       this.y.c("level");
/* 1656:1819 */       if (!this.ab)
/* 1657:     */       {
/* 1658:1821 */         if (this.f.ac() > 0) {
/* 1659:1822 */           this.f.c(this.f.ac() - 1);
/* 1660:     */         }
/* 1661:1824 */         this.f.updateEntities();
/* 1662:     */       }
/* 1663:     */     }
/* 1664:1829 */     if (!this.ab)
/* 1665:     */     {
/* 1666:1830 */       this.aE.c();
/* 1667:1831 */       this.aD.c();
/* 1668:     */     }
/* 1669:1834 */     if (this.f != null)
/* 1670:     */     {
/* 1671:1835 */       if (!this.ab)
/* 1672:     */       {
/* 1673:1836 */         this.f.a(this.f.getDifficulty() != EnumDifficulty.PEACEFUL, true);
/* 1674:     */         try
/* 1675:     */         {
/* 1676:1839 */           this.f.tick();
/* 1677:     */         }
/* 1678:     */         catch (Throwable localThrowable3)
/* 1679:     */         {
/* 1680:1841 */           b localb2 = net.minecraft.src.b.a(localThrowable3, "Exception in world tick");
/* 1681:1842 */           if (this.f == null)
/* 1682:     */           {
/* 1683:1843 */             localj = localb2.a("Affected level");
/* 1684:1844 */             localj.a("Problem", "Level is null!");
/* 1685:     */           }
/* 1686:     */           else
/* 1687:     */           {
/* 1688:1846 */             this.f.a(localb2);
/* 1689:     */           }
/* 1690:1848 */           throw new u(localb2);
/* 1691:     */         }
/* 1692:     */       }
/* 1693:1851 */       this.y.c("animateTick");
/* 1694:1852 */       if ((!this.ab) && (this.f != null)) {
/* 1695:1853 */         this.f.b(MathUtils.floor(this.h.xPos), MathUtils.floor(this.h.yPos), MathUtils.floor(this.h.zPos));
/* 1696:     */       }
/* 1697:1855 */       this.y.c("particles");
/* 1698:1856 */       if (!this.ab) {
/* 1699:1857 */         this.j.a();
/* 1700:     */       }
/* 1701:     */     }
/* 1702:1859 */     else if (this.ar != null)
/* 1703:     */     {
/* 1704:1860 */       this.y.c("pendingConnection");
/* 1705:1861 */       this.ar.a();
/* 1706:     */     }
/* 1707:1864 */     this.y.b();
/* 1708:     */     
/* 1709:1866 */     this.x = I();
/* 1710:     */   }
/* 1711:     */   
/* 1712:     */   public void a(String paramString1, String paramString2, WorldSettings paramarb)
/* 1713:     */   {
/* 1714:1870 */     a((cen)null);
/* 1715:1871 */     System.gc();
/* 1716:     */     
/* 1717:1873 */     bqy localbqy = this.aj.a(paramString1, false);
/* 1718:1874 */     WorldInfo localbqo = localbqy.d();
/* 1719:1876 */     if ((localbqo == null) && (paramarb != null))
/* 1720:     */     {
/* 1721:1877 */       localbqo = new WorldInfo(paramarb, paramString1);
/* 1722:1878 */       localbqy.a(localbqo);
/* 1723:     */     }
/* 1724:1881 */     if (paramarb == null) {
/* 1725:1882 */       paramarb = new WorldSettings(localbqo);
/* 1726:     */     }
/* 1727:     */     try
/* 1728:     */     {
/* 1729:1886 */       this.af = new cyk(this, paramString1, paramString2, paramarb);
/* 1730:1887 */       this.af.B();
/* 1731:1888 */       this.as = true;
/* 1732:     */     }
/* 1733:     */     catch (Throwable localThrowable)
/* 1734:     */     {
/* 1735:1890 */       b localb = net.minecraft.src.b.a(localThrowable, "Starting integrated server");
/* 1736:1891 */       j localj = localb.a("Starting integrated server");
/* 1737:     */       
/* 1738:1893 */       localj.a("Level ID", paramString1);
/* 1739:1894 */       localj.a("Level Name", paramString2);
/* 1740:     */       
/* 1741:1896 */       throw new u(localb);
/* 1742:     */     }
/* 1743:1899 */     this.n.a(cwc.a("menu.loadingLevel", new Object[0]));
/* 1744:1900 */     while (!this.af.ap())
/* 1745:     */     {
/* 1746:1901 */       String localObject = this.af.j();
/* 1747:1902 */       if (localObject != null) {
/* 1748:1903 */         this.n.c(cwc.a((String)localObject, new Object[0]));
/* 1749:     */       } else {
/* 1750:1905 */         this.n.c("");
/* 1751:     */       }
/* 1752:     */       try
/* 1753:     */       {
/* 1754:1908 */         Thread.sleep(200L);
/* 1755:     */       }
/* 1756:     */       catch (InterruptedException localInterruptedException) {}
/* 1757:     */     }
/* 1758:1912 */     a((bxf)null);
/* 1759:     */     
/* 1760:1914 */     Object localObject = this.af.ao().a();
/* 1761:1915 */     gr localgr = gr.a((SocketAddress)localObject);
/* 1762:1916 */     localgr.a(new cec(localgr, this, null));
/* 1763:1917 */     localgr.a(new mz(47, localObject.toString(), 0, gy.d));
/* 1764:1918 */     localgr.a(new ni(K().e()));
/* 1765:1919 */     this.ar = localgr;
/* 1766:     */   }
/* 1767:     */   
/* 1768:     */   public void a(cen paramcen)
/* 1769:     */   {
/* 1770:1928 */     a(paramcen, "");
/* 1771:     */   }
/* 1772:     */   
/* 1773:     */   public void a(cen paramcen, String paramString)
/* 1774:     */   {
/* 1775:1932 */     if (paramcen == null)
/* 1776:     */     {
/* 1777:1934 */       cee localcee = t();
/* 1778:1935 */       if (localcee != null) {
/* 1779:1936 */         localcee.b();
/* 1780:     */       }
/* 1781:1939 */       if ((this.af != null) && (this.af.N()))
/* 1782:     */       {
/* 1783:1940 */         this.af.u();
/* 1784:1941 */         this.af.a();
/* 1785:     */       }
/* 1786:1943 */       this.af = null;
/* 1787:1944 */       this.p.b();
/* 1788:     */       
/* 1789:1946 */       this.o.k().a();
/* 1790:     */     }
/* 1791:1949 */     this.Z = null;
/* 1792:1950 */     this.ar = null;
/* 1793:1952 */     if (this.n != null)
/* 1794:     */     {
/* 1795:1953 */       this.n.b(paramString);
/* 1796:1954 */       this.n.c("");
/* 1797:     */     }
/* 1798:1957 */     if ((paramcen == null) && (this.f != null))
/* 1799:     */     {
/* 1800:1958 */       if (this.ay.e() != null)
/* 1801:     */       {
/* 1802:1959 */         this.ay.f();
/* 1803:1960 */         A();
/* 1804:     */       }
/* 1805:1962 */       a((cew)null);
/* 1806:1963 */       this.as = false;
/* 1807:     */     }
/* 1808:1966 */     this.aD.b();
/* 1809:     */     
/* 1810:1968 */     this.f = paramcen;
/* 1811:1970 */     if (paramcen != null)
/* 1812:     */     {
/* 1813:1971 */       if (this.g != null) {
/* 1814:1972 */         this.g.a(paramcen);
/* 1815:     */       }
/* 1816:1974 */       if (this.j != null) {
/* 1817:1975 */         this.j.a(paramcen);
/* 1818:     */       }
/* 1819:1978 */       if (this.h == null)
/* 1820:     */       {
/* 1821:1979 */         this.h = this.c.a(paramcen, new tz());
/* 1822:1980 */         this.c.b(this.h);
/* 1823:     */       }
/* 1824:1983 */       this.h.prepareForSpawn();
/* 1825:1984 */       paramcen.spawnEntity(this.h);
/* 1826:     */       
/* 1827:1986 */       this.h.b = new cin(this.t);
/* 1828:     */       
/* 1829:1988 */       this.c.a(this.h);
/* 1830:1989 */       this.Z = this.h;
/* 1831:     */     }
/* 1832:     */     else
/* 1833:     */     {
/* 1834:1991 */       this.aj.d();
/* 1835:1992 */       this.h = null;
/* 1836:     */     }
/* 1837:1995 */     System.gc();
/* 1838:1996 */     this.x = 0L;
/* 1839:     */   }
/* 1840:     */   
/* 1841:     */   public void a(int paramInt)
/* 1842:     */   {
/* 1843:2000 */     this.f.g();
/* 1844:2001 */     this.f.a();
/* 1845:     */     
/* 1846:2003 */     int i1 = 0;
/* 1847:2004 */     String str = null;
/* 1848:2005 */     if (this.h != null)
/* 1849:     */     {
/* 1850:2006 */       i1 = this.h.getID();
/* 1851:2007 */       this.f.setEntityDead(this.h);
/* 1852:2008 */       str = this.h.w();
/* 1853:     */     }
/* 1854:2011 */     this.Z = null;
/* 1855:2012 */     cio localcio = this.h;
/* 1856:2013 */     this.h = this.c.a(this.f, this.h == null ? new tz() : this.h.x());
/* 1857:2014 */     this.h.H().a(localcio.H().c());
/* 1858:2015 */     this.h.dimension = paramInt;
/* 1859:2016 */     this.Z = this.h;
/* 1860:2017 */     this.h.prepareForSpawn();
/* 1861:2018 */     this.h.f(str);
/* 1862:2019 */     this.f.spawnEntity(this.h);
/* 1863:2020 */     this.c.b(this.h);
/* 1864:     */     
/* 1865:2022 */     this.h.b = new cin(this.t);
/* 1866:2023 */     this.h.setID(i1);
/* 1867:2024 */     this.c.a(this.h);
/* 1868:2025 */     this.h.k(localcio.cp());
/* 1869:2027 */     if ((this.m instanceof bwl)) {
/* 1870:2028 */       a((bxf)null);
/* 1871:     */     }
/* 1872:     */   }
/* 1873:     */   
/* 1874:     */   public final boolean s()
/* 1875:     */   {
/* 1876:2033 */     return this.aq;
/* 1877:     */   }
/* 1878:     */   
/* 1879:     */   public cee t()
/* 1880:     */   {
/* 1881:2037 */     if (this.h != null) {
/* 1882:2038 */       return this.h.a;
/* 1883:     */     }
/* 1884:2040 */     return null;
/* 1885:     */   }
/* 1886:     */   
/* 1887:     */   public static boolean u()
/* 1888:     */   {
/* 1889:2044 */     return (P == null) || (!P.t.aw);
/* 1890:     */   }
/* 1891:     */   
/* 1892:     */   public static boolean v()
/* 1893:     */   {
/* 1894:2048 */     return (P != null) && (P.t.i);
/* 1895:     */   }
/* 1896:     */   
/* 1897:     */   public static boolean w()
/* 1898:     */   {
/* 1899:2052 */     return (P != null) && (P.t.j != 0);
/* 1900:     */   }
/* 1901:     */   
/* 1902:     */   private void aw()
/* 1903:     */   {
/* 1904:2064 */     if (this.s == null) {
/* 1905:2065 */       return;
/* 1906:     */     }
/* 1907:2068 */     boolean bool1 = this.h.by.d;
/* 1908:     */     
/* 1909:2070 */     int i1 = 0;
/* 1910:2071 */     boolean bool2 = false;
/* 1911:2072 */     bcm localbcm = null;
/* 1912:     */     Object localObject3;
/* 1913:     */     Object localObject1;
/* 1914:     */     Object localObject4;
/* 1915:2074 */     if (this.s.a == brv.BLOCK)
/* 1916:     */     {
/* 1917:2075 */       BlockPosition localObject2 = this.s.a();
/* 1918:     */       
/* 1919:2077 */       localObject3 = this.f.getBlock((BlockPosition)localObject2).getProto();
/* 1920:2079 */       if (((ProtoBlock)localObject3).getMaterial() == Material.air) {
/* 1921:2080 */         return;
/* 1922:     */       }
/* 1923:2083 */       localObject1 = ((ProtoBlock)localObject3).b(this.f, (BlockPosition)localObject2);
/* 1924:2084 */       if (localObject1 == null) {
/* 1925:2085 */         return;
/* 1926:     */       }
/* 1927:2088 */       if ((bool1) && (bxf.q())) {
/* 1928:2089 */         localbcm = this.f.s((BlockPosition)localObject2);
/* 1929:     */       }
/* 1930:2092 */       localObject4 = ((localObject1 instanceof aju)) && (!((ProtoBlock)localObject3).L()) ? ProtoBlock.a((Item)localObject1) : localObject3;
/* 1931:2093 */       i1 = ((ProtoBlock)localObject4).j(this.f, (BlockPosition)localObject2);
/* 1932:2094 */       bool2 = ((Item)localObject1).k();
/* 1933:     */     }
/* 1934:2095 */     else if ((this.s.a == brv.ENTITY) && (this.s.d != null) && (bool1))
/* 1935:     */     {
/* 1936:2096 */       if ((this.s.d instanceof adm))
/* 1937:     */       {
/* 1938:2097 */         localObject1 = ItemList.an;
/* 1939:     */       }
/* 1940:2098 */       else if ((this.s.d instanceof adl))
/* 1941:     */       {
/* 1942:2099 */         localObject1 = ItemList.cn;
/* 1943:     */       }
/* 1944:2100 */       else if ((this.s.d instanceof EntityItemFrame))
/* 1945:     */       {
/* 1946:2101 */         EntityItemFrame localObject2 = (EntityItemFrame)this.s.d;
/* 1947:2102 */         localObject3 = localObject2.getItem();
/* 1948:2103 */         if (localObject3 == null)
/* 1949:     */         {
/* 1950:2104 */           localObject1 = ItemList.itemFrame;
/* 1951:     */         }
/* 1952:     */         else
/* 1953:     */         {
/* 1954:2106 */           localObject1 = ((ItemStack)localObject3).getItem();
/* 1955:2107 */           i1 = ((ItemStack)localObject3).getDamage2();
/* 1956:2108 */           bool2 = true;
/* 1957:     */         }
/* 1958:     */       }
/* 1959:2110 */       else if ((this.s.d instanceof adx))
/* 1960:     */       {
/* 1961:2111 */         adx localObject2 = (adx)this.s.d;
/* 1962:2113 */         switch (btd.b[localObject2.s().ordinal()])
/* 1963:     */         {
/* 1964:     */         case 1: 
/* 1965:2115 */           localObject1 = ItemList.aO;
/* 1966:2116 */           break;
/* 1967:     */         case 2: 
/* 1968:2118 */           localObject1 = ItemList.aN;
/* 1969:2119 */           break;
/* 1970:     */         case 3: 
/* 1971:2121 */           localObject1 = ItemList.ch;
/* 1972:2122 */           break;
/* 1973:     */         case 4: 
/* 1974:2124 */           localObject1 = ItemList.ci;
/* 1975:2125 */           break;
/* 1976:     */         case 5: 
/* 1977:2127 */           localObject1 = ItemList.cp;
/* 1978:2128 */           break;
/* 1979:     */         default: 
/* 1980:2130 */           localObject1 = ItemList.az;
/* 1981:     */         }
/* 1982:     */       }
/* 1983:2133 */       else if ((this.s.d instanceof adu))
/* 1984:     */       {
/* 1985:2134 */         localObject1 = ItemList.aE;
/* 1986:     */       }
/* 1987:2135 */       else if ((this.s.d instanceof EntityArmorStand))
/* 1988:     */       {
/* 1989:2136 */         localObject1 = ItemList.armorStand;
/* 1990:     */       }
/* 1991:     */       else
/* 1992:     */       {
/* 1993:2138 */         localObject1 = ItemList.spawnEgg;
/* 1994:2139 */         i1 = EntityList.a(this.s.d);
/* 1995:2140 */         bool2 = true;
/* 1996:2142 */         if (EntityList.entityEggs.containsKey(Integer.valueOf(i1))) {}
/* 1997:     */       }
/* 1998:     */     }
/* 1999:     */     else
/* 2000:     */     {
/* 2001:2147 */       return;
/* 2002:     */     }
/* 2003:2150 */     Object localObject2 = this.h.bg;
/* 2004:2151 */     if (localbcm == null)
/* 2005:     */     {
/* 2006:2152 */       ((ahb)localObject2).a((Item)localObject1, i1, bool2, bool1);
/* 2007:     */     }
/* 2008:     */     else
/* 2009:     */     {
/* 2010:2154 */       localObject3 = new NBTTagCompound();
/* 2011:2155 */       localbcm.writeToNBT((NBTTagCompound)localObject3);
/* 2012:2156 */       localObject4 = new ItemStack((Item)localObject1, 1, i1);
/* 2013:2157 */       ((ItemStack)localObject4).a("BlockEntityTag", (NBTBase)localObject3);
/* 2014:2158 */       NBTTagCompound localfn = new NBTTagCompound();
/* 2015:2159 */       fv localfv = new fv();
/* 2016:2160 */       localfv.a(new gc("(+NBT)"));
/* 2017:2161 */       localfn.setNBT("Lore", localfv);
/* 2018:2162 */       ((ItemStack)localObject4).a("display", localfn);
/* 2019:2163 */       ((ahb)localObject2).a(((ahb)localObject2).c, (ItemStack)localObject4);
/* 2020:     */     }
/* 2021:2166 */     if (bool1)
/* 2022:     */     {
/* 2023:2167 */       int i2 = this.h.bh.c.size() - 9 + ((ahb)localObject2).c;
/* 2024:2168 */       this.c.a(((ahb)localObject2).get(((ahb)localObject2).c), i2);
/* 2025:     */     }
/* 2026:     */   }
/* 2027:     */   
/* 2028:     */   public b b(b paramb)
/* 2029:     */   {
/* 2030:2174 */     paramb.g().a("Launched Version", new bth(this));
/* 2031:     */     
/* 2032:     */ 
/* 2033:     */ 
/* 2034:     */ 
/* 2035:     */ 
/* 2036:     */ 
/* 2037:2181 */     paramb.g().a("LWJGL", new bti(this));
/* 2038:     */     
/* 2039:     */ 
/* 2040:     */ 
/* 2041:     */ 
/* 2042:     */ 
/* 2043:     */ 
/* 2044:2188 */     paramb.g().a("OpenGL", new btj(this));
/* 2045:     */     
/* 2046:     */ 
/* 2047:     */ 
/* 2048:     */ 
/* 2049:     */ 
/* 2050:     */ 
/* 2051:2195 */     paramb.g().a("GL Caps", new btk(this));
/* 2052:     */     
/* 2053:     */ 
/* 2054:     */ 
/* 2055:     */ 
/* 2056:     */ 
/* 2057:     */ 
/* 2058:2202 */     paramb.g().a("Using VBOs", new btl(this));
/* 2059:     */     
/* 2060:     */ 
/* 2061:     */ 
/* 2062:     */ 
/* 2063:     */ 
/* 2064:     */ 
/* 2065:2209 */     paramb.g().a("Is Modded", new bsw(this));
/* 2066:     */     
/* 2067:     */ 
/* 2068:     */ 
/* 2069:     */ 
/* 2070:     */ 
/* 2071:     */ 
/* 2072:     */ 
/* 2073:     */ 
/* 2074:     */ 
/* 2075:     */ 
/* 2076:     */ 
/* 2077:     */ 
/* 2078:     */ 
/* 2079:2223 */     paramb.g().a("Type", new bsx(this));
/* 2080:     */     
/* 2081:     */ 
/* 2082:     */ 
/* 2083:     */ 
/* 2084:     */ 
/* 2085:     */ 
/* 2086:2230 */     paramb.g().a("Resource Packs", new bsy(this));
/* 2087:     */     
/* 2088:     */ 
/* 2089:     */ 
/* 2090:     */ 
/* 2091:     */ 
/* 2092:     */ 
/* 2093:2237 */     paramb.g().a("Current Language", new bsz(this));
/* 2094:     */     
/* 2095:     */ 
/* 2096:     */ 
/* 2097:     */ 
/* 2098:     */ 
/* 2099:     */ 
/* 2100:2244 */     paramb.g().a("Profiler Position", new bta(this));
/* 2101:2251 */     if (this.f != null) {
/* 2102:2252 */       this.f.a(paramb);
/* 2103:     */     }
/* 2104:2255 */     return paramb;
/* 2105:     */   }
/* 2106:     */   
/* 2107:     */   public static bsu z()
/* 2108:     */   {
/* 2109:2259 */     return P;
/* 2110:     */   }
/* 2111:     */   
/* 2112:     */   public ListenableFuture A()
/* 2113:     */   {
/* 2114:2263 */     return a(new btb(this));
/* 2115:     */   }
/* 2116:     */   
/* 2117:     */   public void a(wb paramwb)
/* 2118:     */   {
/* 2119:2273 */     paramwb.a("fps", Integer.valueOf(ak));
/* 2120:2274 */     paramwb.a("vsync_enabled", Boolean.valueOf(this.t.s));
/* 2121:2275 */     paramwb.a("display_frequency", Integer.valueOf(Display.getDisplayMode().getFrequency()));
/* 2122:2276 */     paramwb.a("display_type", this.Q ? "fullscreen" : "windowed");
/* 2123:2277 */     paramwb.a("run_time", Long.valueOf((MinecraftServer.ax() - paramwb.g()) / 60L * 1000L));
/* 2124:     */     
/* 2125:2279 */     String str = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "little" : "big";
/* 2126:2280 */     paramwb.a("endianness", str);
/* 2127:     */     
/* 2128:2282 */     paramwb.a("resource_packs", Integer.valueOf(this.ay.c().size()));
/* 2129:2283 */     int i1 = 0;
/* 2130:2284 */     for (cvs localcvs : this.ay.c()) {
/* 2131:2285 */       paramwb.a("resource_pack[" + i1++ + "]", localcvs.d());
/* 2132:     */     }
/* 2133:2288 */     if ((this.af != null) && (this.af.at() != null)) {
/* 2134:2289 */       paramwb.a("snooper_partner", this.af.at().f());
/* 2135:     */     }
/* 2136:     */   }
/* 2137:     */   
/* 2138:     */   public void b(wb paramwb)
/* 2139:     */   {
/* 2140:2295 */     paramwb.b("opengl_version", GL11.glGetString(7938));
/* 2141:2296 */     paramwb.b("opengl_vendor", GL11.glGetString(7936));
/* 2142:2297 */     paramwb.b("client_brand", ClientBrandRetriever.getClientModName());
/* 2143:2298 */     paramwb.b("launched_version", this.ah);
/* 2144:     */     
/* 2145:2300 */     ContextCapabilities localContextCapabilities = GLContext.getCapabilities();
/* 2146:2301 */     paramwb.b("gl_caps[ARB_arrays_of_arrays]", Boolean.valueOf(localContextCapabilities.GL_ARB_arrays_of_arrays));
/* 2147:2302 */     paramwb.b("gl_caps[ARB_base_instance]", Boolean.valueOf(localContextCapabilities.GL_ARB_base_instance));
/* 2148:2303 */     paramwb.b("gl_caps[ARB_blend_func_extended]", Boolean.valueOf(localContextCapabilities.GL_ARB_blend_func_extended));
/* 2149:2304 */     paramwb.b("gl_caps[ARB_clear_buffer_object]", Boolean.valueOf(localContextCapabilities.GL_ARB_clear_buffer_object));
/* 2150:2305 */     paramwb.b("gl_caps[ARB_color_buffer_float]", Boolean.valueOf(localContextCapabilities.GL_ARB_color_buffer_float));
/* 2151:2306 */     paramwb.b("gl_caps[ARB_compatibility]", Boolean.valueOf(localContextCapabilities.GL_ARB_compatibility));
/* 2152:2307 */     paramwb.b("gl_caps[ARB_compressed_texture_pixel_storage]", Boolean.valueOf(localContextCapabilities.GL_ARB_compressed_texture_pixel_storage));
/* 2153:2308 */     paramwb.b("gl_caps[ARB_compute_shader]", Boolean.valueOf(localContextCapabilities.GL_ARB_compute_shader));
/* 2154:2309 */     paramwb.b("gl_caps[ARB_copy_buffer]", Boolean.valueOf(localContextCapabilities.GL_ARB_copy_buffer));
/* 2155:2310 */     paramwb.b("gl_caps[ARB_copy_image]", Boolean.valueOf(localContextCapabilities.GL_ARB_copy_image));
/* 2156:2311 */     paramwb.b("gl_caps[ARB_depth_buffer_float]", Boolean.valueOf(localContextCapabilities.GL_ARB_depth_buffer_float));
/* 2157:2312 */     paramwb.b("gl_caps[ARB_compute_shader]", Boolean.valueOf(localContextCapabilities.GL_ARB_compute_shader));
/* 2158:2313 */     paramwb.b("gl_caps[ARB_copy_buffer]", Boolean.valueOf(localContextCapabilities.GL_ARB_copy_buffer));
/* 2159:2314 */     paramwb.b("gl_caps[ARB_copy_image]", Boolean.valueOf(localContextCapabilities.GL_ARB_copy_image));
/* 2160:2315 */     paramwb.b("gl_caps[ARB_depth_buffer_float]", Boolean.valueOf(localContextCapabilities.GL_ARB_depth_buffer_float));
/* 2161:2316 */     paramwb.b("gl_caps[ARB_depth_clamp]", Boolean.valueOf(localContextCapabilities.GL_ARB_depth_clamp));
/* 2162:2317 */     paramwb.b("gl_caps[ARB_depth_texture]", Boolean.valueOf(localContextCapabilities.GL_ARB_depth_texture));
/* 2163:2318 */     paramwb.b("gl_caps[ARB_draw_buffers]", Boolean.valueOf(localContextCapabilities.GL_ARB_draw_buffers));
/* 2164:2319 */     paramwb.b("gl_caps[ARB_draw_buffers_blend]", Boolean.valueOf(localContextCapabilities.GL_ARB_draw_buffers_blend));
/* 2165:2320 */     paramwb.b("gl_caps[ARB_draw_elements_base_vertex]", Boolean.valueOf(localContextCapabilities.GL_ARB_draw_elements_base_vertex));
/* 2166:2321 */     paramwb.b("gl_caps[ARB_draw_indirect]", Boolean.valueOf(localContextCapabilities.GL_ARB_draw_indirect));
/* 2167:2322 */     paramwb.b("gl_caps[ARB_draw_instanced]", Boolean.valueOf(localContextCapabilities.GL_ARB_draw_instanced));
/* 2168:2323 */     paramwb.b("gl_caps[ARB_explicit_attrib_location]", Boolean.valueOf(localContextCapabilities.GL_ARB_explicit_attrib_location));
/* 2169:2324 */     paramwb.b("gl_caps[ARB_explicit_uniform_location]", Boolean.valueOf(localContextCapabilities.GL_ARB_explicit_uniform_location));
/* 2170:2325 */     paramwb.b("gl_caps[ARB_fragment_layer_viewport]", Boolean.valueOf(localContextCapabilities.GL_ARB_fragment_layer_viewport));
/* 2171:2326 */     paramwb.b("gl_caps[ARB_fragment_program]", Boolean.valueOf(localContextCapabilities.GL_ARB_fragment_program));
/* 2172:2327 */     paramwb.b("gl_caps[ARB_fragment_shader]", Boolean.valueOf(localContextCapabilities.GL_ARB_fragment_shader));
/* 2173:2328 */     paramwb.b("gl_caps[ARB_fragment_program_shadow]", Boolean.valueOf(localContextCapabilities.GL_ARB_fragment_program_shadow));
/* 2174:2329 */     paramwb.b("gl_caps[ARB_framebuffer_object]", Boolean.valueOf(localContextCapabilities.GL_ARB_framebuffer_object));
/* 2175:2330 */     paramwb.b("gl_caps[ARB_framebuffer_sRGB]", Boolean.valueOf(localContextCapabilities.GL_ARB_framebuffer_sRGB));
/* 2176:2331 */     paramwb.b("gl_caps[ARB_geometry_shader4]", Boolean.valueOf(localContextCapabilities.GL_ARB_geometry_shader4));
/* 2177:2332 */     paramwb.b("gl_caps[ARB_gpu_shader5]", Boolean.valueOf(localContextCapabilities.GL_ARB_gpu_shader5));
/* 2178:2333 */     paramwb.b("gl_caps[ARB_half_float_pixel]", Boolean.valueOf(localContextCapabilities.GL_ARB_half_float_pixel));
/* 2179:2334 */     paramwb.b("gl_caps[ARB_half_float_vertex]", Boolean.valueOf(localContextCapabilities.GL_ARB_half_float_vertex));
/* 2180:2335 */     paramwb.b("gl_caps[ARB_instanced_arrays]", Boolean.valueOf(localContextCapabilities.GL_ARB_instanced_arrays));
/* 2181:2336 */     paramwb.b("gl_caps[ARB_map_buffer_alignment]", Boolean.valueOf(localContextCapabilities.GL_ARB_map_buffer_alignment));
/* 2182:2337 */     paramwb.b("gl_caps[ARB_map_buffer_range]", Boolean.valueOf(localContextCapabilities.GL_ARB_map_buffer_range));
/* 2183:2338 */     paramwb.b("gl_caps[ARB_multisample]", Boolean.valueOf(localContextCapabilities.GL_ARB_multisample));
/* 2184:2339 */     paramwb.b("gl_caps[ARB_multitexture]", Boolean.valueOf(localContextCapabilities.GL_ARB_multitexture));
/* 2185:2340 */     paramwb.b("gl_caps[ARB_occlusion_query2]", Boolean.valueOf(localContextCapabilities.GL_ARB_occlusion_query2));
/* 2186:2341 */     paramwb.b("gl_caps[ARB_pixel_buffer_object]", Boolean.valueOf(localContextCapabilities.GL_ARB_pixel_buffer_object));
/* 2187:2342 */     paramwb.b("gl_caps[ARB_seamless_cube_map]", Boolean.valueOf(localContextCapabilities.GL_ARB_seamless_cube_map));
/* 2188:2343 */     paramwb.b("gl_caps[ARB_shader_objects]", Boolean.valueOf(localContextCapabilities.GL_ARB_shader_objects));
/* 2189:2344 */     paramwb.b("gl_caps[ARB_shader_stencil_export]", Boolean.valueOf(localContextCapabilities.GL_ARB_shader_stencil_export));
/* 2190:2345 */     paramwb.b("gl_caps[ARB_shader_texture_lod]", Boolean.valueOf(localContextCapabilities.GL_ARB_shader_texture_lod));
/* 2191:2346 */     paramwb.b("gl_caps[ARB_shadow]", Boolean.valueOf(localContextCapabilities.GL_ARB_shadow));
/* 2192:2347 */     paramwb.b("gl_caps[ARB_shadow_ambient]", Boolean.valueOf(localContextCapabilities.GL_ARB_shadow_ambient));
/* 2193:2348 */     paramwb.b("gl_caps[ARB_stencil_texturing]", Boolean.valueOf(localContextCapabilities.GL_ARB_stencil_texturing));
/* 2194:2349 */     paramwb.b("gl_caps[ARB_sync]", Boolean.valueOf(localContextCapabilities.GL_ARB_sync));
/* 2195:2350 */     paramwb.b("gl_caps[ARB_tessellation_shader]", Boolean.valueOf(localContextCapabilities.GL_ARB_tessellation_shader));
/* 2196:2351 */     paramwb.b("gl_caps[ARB_texture_border_clamp]", Boolean.valueOf(localContextCapabilities.GL_ARB_texture_border_clamp));
/* 2197:2352 */     paramwb.b("gl_caps[ARB_texture_buffer_object]", Boolean.valueOf(localContextCapabilities.GL_ARB_texture_buffer_object));
/* 2198:2353 */     paramwb.b("gl_caps[ARB_texture_cube_map]", Boolean.valueOf(localContextCapabilities.GL_ARB_texture_cube_map));
/* 2199:2354 */     paramwb.b("gl_caps[ARB_texture_cube_map_array]", Boolean.valueOf(localContextCapabilities.GL_ARB_texture_cube_map_array));
/* 2200:2355 */     paramwb.b("gl_caps[ARB_texture_non_power_of_two]", Boolean.valueOf(localContextCapabilities.GL_ARB_texture_non_power_of_two));
/* 2201:2356 */     paramwb.b("gl_caps[ARB_uniform_buffer_object]", Boolean.valueOf(localContextCapabilities.GL_ARB_uniform_buffer_object));
/* 2202:2357 */     paramwb.b("gl_caps[ARB_vertex_blend]", Boolean.valueOf(localContextCapabilities.GL_ARB_vertex_blend));
/* 2203:2358 */     paramwb.b("gl_caps[ARB_vertex_buffer_object]", Boolean.valueOf(localContextCapabilities.GL_ARB_vertex_buffer_object));
/* 2204:2359 */     paramwb.b("gl_caps[ARB_vertex_program]", Boolean.valueOf(localContextCapabilities.GL_ARB_vertex_program));
/* 2205:2360 */     paramwb.b("gl_caps[ARB_vertex_shader]", Boolean.valueOf(localContextCapabilities.GL_ARB_vertex_shader));
/* 2206:     */     
/* 2207:2362 */     paramwb.b("gl_caps[EXT_bindable_uniform]", Boolean.valueOf(localContextCapabilities.GL_EXT_bindable_uniform));
/* 2208:2363 */     paramwb.b("gl_caps[EXT_blend_equation_separate]", Boolean.valueOf(localContextCapabilities.GL_EXT_blend_equation_separate));
/* 2209:2364 */     paramwb.b("gl_caps[EXT_blend_func_separate]", Boolean.valueOf(localContextCapabilities.GL_EXT_blend_func_separate));
/* 2210:2365 */     paramwb.b("gl_caps[EXT_blend_minmax]", Boolean.valueOf(localContextCapabilities.GL_EXT_blend_minmax));
/* 2211:2366 */     paramwb.b("gl_caps[EXT_blend_subtract]", Boolean.valueOf(localContextCapabilities.GL_EXT_blend_subtract));
/* 2212:2367 */     paramwb.b("gl_caps[EXT_draw_instanced]", Boolean.valueOf(localContextCapabilities.GL_EXT_draw_instanced));
/* 2213:2368 */     paramwb.b("gl_caps[EXT_framebuffer_multisample]", Boolean.valueOf(localContextCapabilities.GL_EXT_framebuffer_multisample));
/* 2214:2369 */     paramwb.b("gl_caps[EXT_framebuffer_object]", Boolean.valueOf(localContextCapabilities.GL_EXT_framebuffer_object));
/* 2215:2370 */     paramwb.b("gl_caps[EXT_framebuffer_sRGB]", Boolean.valueOf(localContextCapabilities.GL_EXT_framebuffer_sRGB));
/* 2216:2371 */     paramwb.b("gl_caps[EXT_geometry_shader4]", Boolean.valueOf(localContextCapabilities.GL_EXT_geometry_shader4));
/* 2217:2372 */     paramwb.b("gl_caps[EXT_gpu_program_parameters]", Boolean.valueOf(localContextCapabilities.GL_EXT_gpu_program_parameters));
/* 2218:2373 */     paramwb.b("gl_caps[EXT_gpu_shader4]", Boolean.valueOf(localContextCapabilities.GL_EXT_gpu_shader4));
/* 2219:2374 */     paramwb.b("gl_caps[EXT_multi_draw_arrays]", Boolean.valueOf(localContextCapabilities.GL_EXT_multi_draw_arrays));
/* 2220:2375 */     paramwb.b("gl_caps[EXT_packed_depth_stencil]", Boolean.valueOf(localContextCapabilities.GL_EXT_packed_depth_stencil));
/* 2221:2376 */     paramwb.b("gl_caps[EXT_paletted_texture]", Boolean.valueOf(localContextCapabilities.GL_EXT_paletted_texture));
/* 2222:2377 */     paramwb.b("gl_caps[EXT_rescale_normal]", Boolean.valueOf(localContextCapabilities.GL_EXT_rescale_normal));
/* 2223:2378 */     paramwb.b("gl_caps[EXT_separate_shader_objects]", Boolean.valueOf(localContextCapabilities.GL_EXT_separate_shader_objects));
/* 2224:2379 */     paramwb.b("gl_caps[EXT_shader_image_load_store]", Boolean.valueOf(localContextCapabilities.GL_EXT_shader_image_load_store));
/* 2225:2380 */     paramwb.b("gl_caps[EXT_shadow_funcs]", Boolean.valueOf(localContextCapabilities.GL_EXT_shadow_funcs));
/* 2226:2381 */     paramwb.b("gl_caps[EXT_shared_texture_palette]", Boolean.valueOf(localContextCapabilities.GL_EXT_shared_texture_palette));
/* 2227:2382 */     paramwb.b("gl_caps[EXT_stencil_clear_tag]", Boolean.valueOf(localContextCapabilities.GL_EXT_stencil_clear_tag));
/* 2228:2383 */     paramwb.b("gl_caps[EXT_stencil_two_side]", Boolean.valueOf(localContextCapabilities.GL_EXT_stencil_two_side));
/* 2229:2384 */     paramwb.b("gl_caps[EXT_stencil_wrap]", Boolean.valueOf(localContextCapabilities.GL_EXT_stencil_wrap));
/* 2230:2385 */     paramwb.b("gl_caps[EXT_texture_3d]", Boolean.valueOf(localContextCapabilities.GL_EXT_texture_3d));
/* 2231:2386 */     paramwb.b("gl_caps[EXT_texture_array]", Boolean.valueOf(localContextCapabilities.GL_EXT_texture_array));
/* 2232:2387 */     paramwb.b("gl_caps[EXT_texture_buffer_object]", Boolean.valueOf(localContextCapabilities.GL_EXT_texture_buffer_object));
/* 2233:2388 */     paramwb.b("gl_caps[EXT_texture_integer]", Boolean.valueOf(localContextCapabilities.GL_EXT_texture_integer));
/* 2234:2389 */     paramwb.b("gl_caps[EXT_texture_lod_bias]", Boolean.valueOf(localContextCapabilities.GL_EXT_texture_lod_bias));
/* 2235:2390 */     paramwb.b("gl_caps[EXT_texture_sRGB]", Boolean.valueOf(localContextCapabilities.GL_EXT_texture_sRGB));
/* 2236:2391 */     paramwb.b("gl_caps[EXT_vertex_shader]", Boolean.valueOf(localContextCapabilities.GL_EXT_vertex_shader));
/* 2237:2392 */     paramwb.b("gl_caps[EXT_vertex_weighting]", Boolean.valueOf(localContextCapabilities.GL_EXT_vertex_weighting));
/* 2238:     */     
/* 2239:2394 */     paramwb.b("gl_caps[gl_max_vertex_uniforms]", Integer.valueOf(GL11.glGetInteger(35658)));
/* 2240:2395 */     GL11.glGetError();
/* 2241:2396 */     paramwb.b("gl_caps[gl_max_fragment_uniforms]", Integer.valueOf(GL11.glGetInteger(35657)));
/* 2242:2397 */     GL11.glGetError();
/* 2243:2398 */     paramwb.b("gl_caps[gl_max_vertex_attribs]", Integer.valueOf(GL11.glGetInteger(34921)));
/* 2244:2399 */     GL11.glGetError();
/* 2245:2400 */     paramwb.b("gl_caps[gl_max_vertex_texture_image_units]", Integer.valueOf(GL11.glGetInteger(35660)));
/* 2246:2401 */     GL11.glGetError();
/* 2247:2402 */     paramwb.b("gl_caps[gl_max_texture_image_units]", Integer.valueOf(GL11.glGetInteger(34930)));
/* 2248:2403 */     GL11.glGetError();
/* 2249:2404 */     paramwb.b("gl_caps[gl_max_texture_image_units]", Integer.valueOf(GL11.glGetInteger(35071)));
/* 2250:2405 */     GL11.glGetError();
/* 2251:     */     
/* 2252:2407 */     paramwb.b("gl_max_texture_size", Integer.valueOf(B()));
/* 2253:     */   }
/* 2254:     */   
/* 2255:     */   public static int B()
/* 2256:     */   {
/* 2257:2411 */     for (int i1 = 16384; i1 > 0; i1 >>= 1)
/* 2258:     */     {
/* 2259:2412 */       GL11.glTexImage2D(32868, 0, 6408, i1, i1, 0, 6408, 5121, (ByteBuffer)null);
/* 2260:2413 */       int i2 = GL11.glGetTexLevelParameteri(32868, 0, 4096);
/* 2261:2414 */       if (i2 != 0) {
/* 2262:2415 */         return i1;
/* 2263:     */       }
/* 2264:     */     }
/* 2265:2418 */     return -1;
/* 2266:     */   }
/* 2267:     */   
/* 2268:     */   public boolean ac()
/* 2269:     */   {
/* 2270:2423 */     return this.t.q;
/* 2271:     */   }
/* 2272:     */   
/* 2273:     */   public void a(cew paramcew)
/* 2274:     */   {
/* 2275:2427 */     this.N = paramcew;
/* 2276:     */   }
/* 2277:     */   
/* 2278:     */   public cew C()
/* 2279:     */   {
/* 2280:2431 */     return this.N;
/* 2281:     */   }
/* 2282:     */   
/* 2283:     */   public boolean D()
/* 2284:     */   {
/* 2285:2435 */     return this.as;
/* 2286:     */   }
/* 2287:     */   
/* 2288:     */   public boolean E()
/* 2289:     */   {
/* 2290:2439 */     return (this.as) && (this.af != null);
/* 2291:     */   }
/* 2292:     */   
/* 2293:     */   public cyk F()
/* 2294:     */   {
/* 2295:2443 */     return this.af;
/* 2296:     */   }
/* 2297:     */   
/* 2298:     */   public static void G()
/* 2299:     */   {
/* 2300:2447 */     if (P == null) {
/* 2301:2448 */       return;
/* 2302:     */     }
/* 2303:2451 */     cyk localcyk = P.F();
/* 2304:2452 */     if (localcyk != null) {
/* 2305:2453 */       localcyk.r();
/* 2306:     */     }
/* 2307:     */   }
/* 2308:     */   
/* 2309:     */   public wb H()
/* 2310:     */   {
/* 2311:2458 */     return this.V;
/* 2312:     */   }
/* 2313:     */   
/* 2314:     */   public static long I()
/* 2315:     */   {
/* 2316:2462 */     return Sys.getTime() * 1000L / Sys.getTimerResolution();
/* 2317:     */   }
/* 2318:     */   
/* 2319:     */   public boolean J()
/* 2320:     */   {
/* 2321:2466 */     return this.Q;
/* 2322:     */   }
/* 2323:     */   
/* 2324:     */   public btw K()
/* 2325:     */   {
/* 2326:2470 */     return this.aa;
/* 2327:     */   }
/* 2328:     */   
/* 2329:     */   public PropertyMap L()
/* 2330:     */   {
/* 2331:2474 */     return this.M;
/* 2332:     */   }
/* 2333:     */   
/* 2334:     */   public Proxy M()
/* 2335:     */   {
/* 2336:2478 */     return this.ai;
/* 2337:     */   }
/* 2338:     */   
/* 2339:     */   public cug N()
/* 2340:     */   {
/* 2341:2482 */     return this.O;
/* 2342:     */   }
/* 2343:     */   
/* 2344:     */   public cvk O()
/* 2345:     */   {
/* 2346:2486 */     return this.au;
/* 2347:     */   }
/* 2348:     */   
/* 2349:     */   public cvo P()
/* 2350:     */   {
/* 2351:2490 */     return this.ay;
/* 2352:     */   }
/* 2353:     */   
/* 2354:     */   public cwe Q()
/* 2355:     */   {
/* 2356:2494 */     return this.az;
/* 2357:     */   }
/* 2358:     */   
/* 2359:     */   public cua R()
/* 2360:     */   {
/* 2361:2498 */     return this.aC;
/* 2362:     */   }
/* 2363:     */   
/* 2364:     */   public boolean S()
/* 2365:     */   {
/* 2366:2502 */     return this.ap;
/* 2367:     */   }
/* 2368:     */   
/* 2369:     */   public boolean T()
/* 2370:     */   {
/* 2371:2506 */     return this.ab;
/* 2372:     */   }
/* 2373:     */   
/* 2374:     */   public czh U()
/* 2375:     */   {
/* 2376:2510 */     return this.aD;
/* 2377:     */   }
/* 2378:     */   
/* 2379:     */   public EnumMusic V()
/* 2380:     */   {
/* 2381:2514 */     if ((this.m instanceof bxs)) {
/* 2382:2515 */       return EnumMusic.d;
/* 2383:     */     }
/* 2384:2518 */     if (this.h != null)
/* 2385:     */     {
/* 2386:2519 */       if ((this.h.world.t instanceof bge)) {
/* 2387:2520 */         return EnumMusic.e;
/* 2388:     */       }
/* 2389:2521 */       if ((this.h.world.t instanceof bgh))
/* 2390:     */       {
/* 2391:2522 */         if ((ciu.c != null) && (ciu.b > 0)) {
/* 2392:2523 */           return EnumMusic.f;
/* 2393:     */         }
/* 2394:2525 */         return EnumMusic.g;
/* 2395:     */       }
/* 2396:2529 */       if ((this.h.by.d) && (this.h.by.c)) {
/* 2397:2530 */         return EnumMusic.c;
/* 2398:     */       }
/* 2399:2533 */       return EnumMusic.b;
/* 2400:     */     }
/* 2401:2536 */     return EnumMusic.a;
/* 2402:     */   }
/* 2403:     */   
/* 2404:     */   public dao W()
/* 2405:     */   {
/* 2406:2540 */     return this.aA;
/* 2407:     */   }
/* 2408:     */   
/* 2409:     */   public void X()
/* 2410:     */   {
/* 2411:2544 */     int i1 = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() : Keyboard.getEventKey();
/* 2412:2545 */     if ((i1 == 0) || (Keyboard.isRepeatEvent())) {
/* 2413:2546 */       return;
/* 2414:     */     }
/* 2415:2549 */     if (((this.m instanceof byj)) && (((byj)this.m).g > I() - 20L)) {
/* 2416:2550 */       return;
/* 2417:     */     }
/* 2418:2553 */     if (Keyboard.getEventKeyState())
/* 2419:     */     {
/* 2420:2554 */       if (i1 == this.t.ao.i())
/* 2421:     */       {
/* 2422:2555 */         if (W().k()) {
/* 2423:2556 */           W().r();
/* 2424:2557 */         } else if (W().j()) {
/* 2425:2558 */           a(new bwa(new btc(this), cwc.a("stream.confirm_start", new Object[0]), "", 0));
/* 2426:2567 */         } else if ((!W().A()) || (!W().i())) {
/* 2427:2568 */           cak.a(this.m);
/* 2428:2569 */         } else if (this.f != null) {
/* 2429:2570 */           this.q.d().a(new hy("Not ready to start streaming yet!"));
/* 2430:     */         }
/* 2431:     */       }
/* 2432:2572 */       else if (i1 == this.t.ap.i())
/* 2433:     */       {
/* 2434:2573 */         if (W().k()) {
/* 2435:2574 */           if (W().l()) {
/* 2436:2575 */             W().o();
/* 2437:     */           } else {
/* 2438:2577 */             W().n();
/* 2439:     */           }
/* 2440:     */         }
/* 2441:     */       }
/* 2442:2580 */       else if (i1 == this.t.aq.i())
/* 2443:     */       {
/* 2444:2581 */         if (W().k()) {
/* 2445:2582 */           W().m();
/* 2446:     */         }
/* 2447:     */       }
/* 2448:2584 */       else if (i1 == this.t.ar.i()) {
/* 2449:2585 */         this.aA.a(true);
/* 2450:2586 */       } else if (i1 == this.t.am.i()) {
/* 2451:2587 */         q();
/* 2452:2588 */       } else if (i1 == this.t.aj.i()) {
/* 2453:2589 */         this.q.d().a(btt.a(this.v, this.d, this.e, this.aB));
/* 2454:     */       }
/* 2455:     */     }
/* 2456:2592 */     else if (i1 == this.t.ar.i()) {
/* 2457:2593 */       this.aA.a(false);
/* 2458:     */     }
/* 2459:     */   }
/* 2460:     */   
/* 2461:     */   public MinecraftSessionService Y()
/* 2462:     */   {
/* 2463:2599 */     return this.aG;
/* 2464:     */   }
/* 2465:     */   
/* 2466:     */   public cvw Z()
/* 2467:     */   {
/* 2468:2603 */     return this.aH;
/* 2469:     */   }
/* 2470:     */   
/* 2471:     */   public Entity aa()
/* 2472:     */   {
/* 2473:2607 */     return this.Z;
/* 2474:     */   }
/* 2475:     */   
/* 2476:     */   public void a(Entity paramwv)
/* 2477:     */   {
/* 2478:2611 */     this.Z = paramwv;
/* 2479:2612 */     this.o.a(paramwv);
/* 2480:     */   }
/* 2481:     */   
/* 2482:     */   public ListenableFuture a(Callable paramCallable)
/* 2483:     */   {
/* 2484:2617 */     Validate.notNull(paramCallable);
/* 2485:2619 */     if (!aH())
/* 2486:     */     {
/* 2487:2620 */       ListenableFutureTask localListenableFutureTask = ListenableFutureTask.create(paramCallable);
/* 2488:2621 */       synchronized (this.aI)
/* 2489:     */       {
/* 2490:2622 */         this.aI.add(localListenableFutureTask);
/* 2491:     */       }
/* 2492:2624 */       return localListenableFutureTask;
/* 2493:     */     }
/* 2494:     */     try
/* 2495:     */     {
/* 2496:2627 */       return Futures.immediateFuture(paramCallable.call());
/* 2497:     */     }
/* 2498:     */     catch (Exception localException)
/* 2499:     */     {
/* 2500:2629 */       return Futures.immediateFailedCheckedFuture(localException);
/* 2501:     */     }
/* 2502:     */   }
/* 2503:     */   
/* 2504:     */   public ListenableFuture a(Runnable paramRunnable)
/* 2505:     */   {
/* 2506:2636 */     Validate.notNull(paramRunnable);
/* 2507:     */     
/* 2508:2638 */     return a(Executors.callable(paramRunnable));
/* 2509:     */   }
/* 2510:     */   
/* 2511:     */   public boolean aH()
/* 2512:     */   {
/* 2513:2643 */     return Thread.currentThread() == this.aK;
/* 2514:     */   }
/* 2515:     */   
/* 2516:     */   public cll ab()
/* 2517:     */   {
/* 2518:2647 */     return this.aM;
/* 2519:     */   }
/* 2520:     */   
/* 2521:     */   public cpt ae()
/* 2522:     */   {
/* 2523:2655 */     return this.W;
/* 2524:     */   }
/* 2525:     */   
/* 2526:     */   public cqh af()
/* 2527:     */   {
/* 2528:2659 */     return this.X;
/* 2529:     */   }
/* 2530:     */   
/* 2531:     */   public cki ag()
/* 2532:     */   {
/* 2533:2663 */     return this.Y;
/* 2534:     */   }
/* 2535:     */   
/* 2536:     */   public static int ah()
/* 2537:     */   {
/* 2538:2667 */     return ak;
/* 2539:     */   }
/* 2540:     */   
/* 2541:     */   public static Map ai()
/* 2542:     */   {
/* 2543:2671 */     HashMap localHashMap = Maps.newHashMap();
/* 2544:2672 */     localHashMap.put("X-Minecraft-Username", z().K().c());
/* 2545:2673 */     localHashMap.put("X-Minecraft-UUID", z().K().b());
/* 2546:2674 */     localHashMap.put("X-Minecraft-Version", "1.8");
/* 2547:2675 */     return localHashMap;
/* 2548:     */   }
				  static String a(bsu arg0) {return arg0.ah;}
				  static cwe b(bsu arg0) {return arg0.az;}
/* 2549:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsu
 * JD-Core Version:    0.7.0.1
 */
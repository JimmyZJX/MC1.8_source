/*    1:     */ package net.minecraft.server;
/*    2:     */ 
/*    3:     */ /*   22:     */ import com.google.common.base.Charsets;
/*   23:     */ import com.google.common.collect.Lists;
/*   24:     */ import com.google.common.collect.Queues;
/*   25:     */ import com.google.common.util.concurrent.Futures;
/*   26:     */ import com.google.common.util.concurrent.ListenableFuture;
/*   27:     */ import com.google.common.util.concurrent.ListenableFutureTask;
/*   28:     */ import com.mojang.authlib.GameProfile;
/*   29:     */ import com.mojang.authlib.GameProfileRepository;
/*   30:     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*   31:     */ import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;

/*   35:     */ import io.netty.buffer.ByteBuf;
/*   36:     */ import io.netty.buffer.ByteBufOutputStream;
/*   37:     */ import io.netty.buffer.Unpooled;
/*   38:     */ import io.netty.handler.codec.base64.Base64;

/*   40:     */ import java.awt.GraphicsEnvironment;
/*   41:     */ import java.awt.image.BufferedImage;
/*   42:     */ import java.io.File;
/*   43:     */ import java.net.Proxy;
/*   44:     */ import java.security.KeyPair;
/*   45:     */ import java.text.SimpleDateFormat;
/*   46:     */ import java.util.ArrayList;
/*   47:     */ import java.util.Arrays;
/*   48:     */ import java.util.Collections;
/*   49:     */ import java.util.Date;
/*   50:     */ import java.util.Iterator;
/*   51:     */ import java.util.List;
/*   52:     */ import java.util.Queue;
/*   53:     */ import java.util.Random;
/*   54:     */ import java.util.UUID;
/*   55:     */ import java.util.concurrent.Callable;
/*   56:     */ import java.util.concurrent.Executors;
/*   57:     */ import java.util.concurrent.FutureTask;

/*   58:     */ import javax.imageio.ImageIO;

import net.minecraft.src.ad;
import net.minecraft.src.ICommandSender;
import net.minecraft.src.ag;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import net.minecraft.src.aqz;
import net.minecraft.src.WorldSettings;
import net.minecraft.src.EnumGameType;
import net.minecraft.src.WorldType;
import net.minecraft.src.b;
import net.minecraft.src.bqj;
import net.minecraft.src.WorldInfo;
import net.minecraft.src.bqy;
import net.minecraft.src.bra;
import net.minecraft.src.Vec3;
import net.minecraft.src.cl;
import net.minecraft.src.BlockPosition;
import net.minecraft.src.ho;
import net.minecraft.src.hy;
import net.minecraft.src.li;
import net.minecraft.src.np;
import net.minecraft.src.nq;
import net.minecraft.src.nt;
import net.minecraft.src.pd;
import net.minecraft.src.pf;
import net.minecraft.src.pg;
import net.minecraft.src.pm;
import net.minecraft.src.qj;
import net.minecraft.src.ql;
import net.minecraft.src.qp;
import net.minecraft.src.WorldServer;
import net.minecraft.src.qw;
import net.minecraft.src.rc;
import net.minecraft.src.ry;
import net.minecraft.src.sn;
import net.minecraft.src.u;
import net.minecraft.src.MathUtils;
import net.minecraft.src.Profiler;
import net.minecraft.src.vn;
import net.minecraft.src.EnumDifficulty;
import net.minecraft.src.wb;
import net.minecraft.src.wd;
import net.minecraft.src.Entity;
/*   63:     */ import org.apache.commons.lang3.Validate;
/*   64:     */ import org.apache.logging.log4j.LogManager;
/*   65:     */ import org.apache.logging.log4j.Logger;
/*   89:     */ 
/*   90:     */ public abstract class MinecraftServer
/*   91:     */   implements ICommandSender, Runnable, vn, wd
/*   92:     */ {
/*   93:  77 */   private static final Logger j = LogManager.getLogger();
/*   94:  88 */   public static final File a = new File("usercache.json");
/*   95:     */   private static MinecraftServer k;
/*   96:     */   private final bra l;
/*   97:  94 */   private final wb m = new wb("server", this, ax());
/*   98:     */   private final File n;
/*   99:  97 */   private final List o = Lists.newArrayList();
/*  100:     */   private final ad p;
/*  101:  99 */   public final Profiler b = new Profiler();
/*  102:     */   private final rc q;
/*  103: 101 */   private final np r = new np();
/*  104: 102 */   private final Random s = new Random();
/*  105: 105 */   private int u = -1;
/*  106:     */   public WorldServer[] c;
/*  107:     */   private sn v;
/*  108: 108 */   private boolean w = true;
/*  109:     */   private boolean x;
/*  110:     */   private int y;
/*  111:     */   protected final Proxy d;
/*  112:     */   public String e;
/*  113:     */   public int f;
/*  114:     */   private boolean z;
/*  115:     */   private boolean A;
/*  116:     */   private boolean B;
/*  117:     */   private boolean C;
/*  118:     */   private boolean D;
/*  119:     */   private String E;
/*  120:     */   private int F;
/*  121: 123 */   private int G = 0;
/*  122: 124 */   public final long[] g = new long[100];
/*  123:     */   public long[][] h;
/*  124:     */   private KeyPair H;
/*  125:     */   private String I;
/*  126:     */   private String J;
/*  127:     */   private String K;
/*  128:     */   private boolean L;
/*  129:     */   private boolean M;
/*  130:     */   private boolean N;
/*  131: 134 */   private String O = "";
/*  132: 135 */   private String P = "";
/*  133:     */   private boolean Q;
/*  134:     */   private long R;
/*  135:     */   private String S;
/*  136:     */   private boolean T;
/*  137:     */   private boolean U;
/*  138:     */   private final YggdrasilAuthenticationService V;
/*  139:     */   private final MinecraftSessionService W;
/*  140: 143 */   private long X = 0L;
/*  141:     */   private final GameProfileRepository Y;
/*  142:     */   private final ry Z;
/*  143: 146 */   protected final Queue i = Queues.newArrayDeque();
/*  144:     */   private Thread aa;
/*  145: 148 */   private long ab = ax();
/*  146:     */   
/*  147:     */   public MinecraftServer(Proxy paramProxy, File paramFile)
/*  148:     */   {
/*  149: 151 */     this.d = paramProxy;
/*  150: 152 */     k = this;
/*  151: 153 */     this.n = null;
/*  152: 154 */     this.q = null;
/*  153: 155 */     this.Z = new ry(this, paramFile);
/*  154: 156 */     this.p = null;
/*  155: 157 */     this.l = null;
/*  156: 158 */     this.V = new YggdrasilAuthenticationService(paramProxy, UUID.randomUUID().toString());
/*  157: 159 */     this.W = this.V.createMinecraftSessionService();
/*  158: 160 */     this.Y = this.V.createProfileRepository();
/*  159:     */   }
/*  160:     */   
/*  161:     */   public MinecraftServer(File paramFile1, Proxy paramProxy, File paramFile2)
/*  162:     */   {
/*  163: 164 */     this.d = paramProxy;
/*  164: 165 */     k = this;
/*  165: 166 */     this.n = paramFile1;
/*  166: 167 */     this.q = new rc(this);
/*  167: 168 */     this.Z = new ry(this, paramFile2);
/*  168: 169 */     this.p = h();
/*  169: 170 */     this.l = new bqj(paramFile1);
/*  170: 171 */     this.V = new YggdrasilAuthenticationService(paramProxy, UUID.randomUUID().toString());
/*  171: 172 */     this.W = this.V.createMinecraftSessionService();
/*  172: 173 */     this.Y = this.V.createProfileRepository();
/*  173:     */   }
/*  174:     */   
/*  175:     */   protected cl h()
/*  176:     */   {
/*  177: 177 */     return new cl();
/*  178:     */   }
/*  179:     */   
/*  180:     */   protected abstract boolean i();
/*  181:     */   
/*  182:     */   protected void a(String paramString)
/*  183:     */   {
/*  184: 183 */     if (X().b(paramString))
/*  185:     */     {
/*  186: 184 */       j.info("Converting map!");
/*  187: 185 */       b("menu.convertingLevel");
/*  188: 186 */       X().a(paramString, new pd(this));
/*  189:     */     }
/*  190:     */   }
/*  191:     */   
/*  192:     */   protected synchronized void b(String paramString)
/*  193:     */   {
/*  194: 217 */     this.S = paramString;
/*  195:     */   }
/*  196:     */   
/*  197:     */   public synchronized String j()
/*  198:     */   {
/*  199: 221 */     return this.S;
/*  200:     */   }
/*  201:     */   
/*  202:     */   protected void a(String paramString1, String paramString2, long paramLong, WorldType paramare, String paramString3)
/*  203:     */   {
/*  204: 225 */     a(paramString1);
/*  205: 226 */     b("menu.loadingLevel");
/*  206:     */     
/*  207: 228 */     this.c = new WorldServer[3];
/*  208: 229 */     this.h = new long[this.c.length][100];
/*  209:     */     
/*  210: 231 */     bqy localbqy = this.l.a(paramString1, true);
/*  211: 232 */     a(T(), localbqy);
/*  212:     */     
/*  213:     */ 
/*  214: 235 */     WorldInfo localbqo = localbqy.d();
/*  215:     */     WorldSettings localarb;
/*  216: 236 */     if (localbqo == null)
/*  217:     */     {
/*  218: 237 */       if (W())
/*  219:     */       {
/*  220: 238 */         localarb = qj.a;
/*  221:     */       }
/*  222:     */       else
/*  223:     */       {
/*  224: 240 */         localarb = new WorldSettings(paramLong, m(), l(), o(), paramare);
/*  225: 241 */         localarb.a(paramString3);
/*  226: 242 */         if (this.M) {
/*  227: 243 */           localarb.a();
/*  228:     */         }
/*  229:     */       }
/*  230: 247 */       localbqo = new WorldInfo(localarb, paramString2);
/*  231:     */     }
/*  232:     */     else
/*  233:     */     {
/*  234: 249 */       localbqo.a(paramString2);
/*  235: 250 */       localarb = new WorldSettings(localbqo);
/*  236:     */     }
/*  237: 253 */     for (int i1 = 0; i1 < this.c.length; i1++)
/*  238:     */     {
/*  239: 256 */       int i2 = 0;
/*  240: 257 */       if (i1 == 1) {
/*  241: 258 */         i2 = -1;
/*  242:     */       }
/*  243: 260 */       if (i1 == 2) {
/*  244: 261 */         i2 = 1;
/*  245:     */       }
/*  246: 264 */       if (i1 == 0)
/*  247:     */       {
/*  248: 265 */         if (W()) {
/*  249: 266 */           this.c[i1] = ((WorldServer)new qj(this, localbqy, localbqo, i2, this.b).getSelf());
/*  250:     */         } else {
/*  251: 268 */           this.c[i1] = ((WorldServer)new WorldServer(this, localbqy, localbqo, i2, this.b).getSelf());
/*  252:     */         }
/*  253: 270 */         this.c[i1].a(localarb);
/*  254:     */       }
/*  255:     */       else
/*  256:     */       {
/*  257: 272 */         this.c[i1] = ((WorldServer)new ql(this, localbqy, i2, this.c[0], this.b).getSelf());
/*  258:     */       }
/*  259: 275 */       this.c[i1].addWorldAccess(new qp(this, this.c[i1]));
/*  260: 277 */       if (!S()) {
/*  261: 278 */         this.c[i1].getWorldInfo().a(m());
/*  262:     */       }
/*  263:     */     }
/*  264: 282 */     this.v.a(this.c);
/*  265:     */     
/*  266: 284 */     a(n());
/*  267:     */     
/*  268: 286 */     k();
/*  269:     */   }
/*  270:     */   
/*  271:     */   protected void k()
/*  272:     */   {
/*  273: 291 */     int i1 = 16;
/*  274: 292 */     int i2 = 4;
/*  275:     */     
/*  276: 294 */     int i3 = 192;
/*  277: 295 */     int i4 = 625;
/*  278: 296 */     int i5 = 0;
/*  279:     */     
/*  280: 298 */     b("menu.generatingTerrain");
/*  281:     */     
/*  282: 300 */     int i6 = 0;
/*  283: 301 */     j.info("Preparing start region for level " + i6);
/*  284: 302 */     WorldServer localqt = this.c[i6];
/*  285: 303 */     BlockPosition localdt = localqt.getWorldSpawn();
/*  286:     */     
/*  287: 305 */     long l1 = ax();
/*  288: 306 */     for (int i7 = -192; (i7 <= 192) && (t()); i7 += 16) {
/*  289: 307 */       for (int i8 = -192; (i8 <= 192) && (t()); i8 += 16)
/*  290:     */       {
/*  291: 308 */         long l2 = ax();
/*  292: 309 */         if (l2 - l1 > 1000L)
/*  293:     */         {
/*  294: 310 */           a_("Preparing spawn area", i5 * 100 / 625);
/*  295: 311 */           l1 = l2;
/*  296:     */         }
/*  297: 313 */         i5++;
/*  298:     */         
/*  299: 315 */         localqt.b.c(localdt.getX() + i7 >> 4, localdt.getZ() + i8 >> 4);
/*  300:     */       }
/*  301:     */     }
/*  302: 319 */     q();
/*  303:     */   }
/*  304:     */   
/*  305:     */   protected void a(String paramString, bqy parambqy)
/*  306:     */   {
/*  307: 323 */     File localFile = new File(parambqy.b(), "resources.zip");
/*  308: 324 */     if (localFile.isFile()) {
/*  309: 325 */       a_("level://" + paramString + "/" + localFile.getName(), "");
/*  310:     */     }
/*  311:     */   }
/*  312:     */   
/*  313:     */   public abstract boolean l();
/*  314:     */   
/*  315:     */   public abstract EnumGameType m();
/*  316:     */   
/*  317:     */   public abstract EnumDifficulty n();
/*  318:     */   
/*  319:     */   public abstract boolean o();
/*  320:     */   
/*  321:     */   public abstract int p();
/*  322:     */   
/*  323:     */   protected void a_(String paramString, int paramInt)
/*  324:     */   {
/*  325: 340 */     this.e = paramString;
/*  326: 341 */     this.f = paramInt;
/*  327: 342 */     j.info(paramString + ": " + paramInt + "%");
/*  328:     */   }
/*  329:     */   
/*  330:     */   protected void q()
/*  331:     */   {
/*  332: 346 */     this.e = null;
/*  333: 347 */     this.f = 0;
/*  334:     */   }
/*  335:     */   
/*  336:     */   protected void a(boolean paramBoolean)
/*  337:     */   {
/*  338: 351 */     if (this.N) {
/*  339: 352 */       return;
/*  340:     */     }
/*  341: 354 */     for (WorldServer localqt : this.c) {
/*  342: 355 */       if (localqt != null)
/*  343:     */       {
/*  344: 356 */         if (!paramBoolean) {
/*  345: 357 */           j.info("Saving chunks for level '" + localqt.getWorldInfo().k() + "'/" + localqt.t.k());
/*  346:     */         }
/*  347:     */         try
/*  348:     */         {
/*  349: 360 */           localqt.a(true, null);
/*  350:     */         }
/*  351:     */         catch (aqz localaqz)
/*  352:     */         {
/*  353: 362 */           j.warn(localaqz.getMessage());
/*  354:     */         }
/*  355:     */       }
/*  356:     */     }
/*  357:     */   }
/*  358:     */   
/*  359:     */   public void r()
/*  360:     */   {
/*  361: 369 */     if (this.N) {
/*  362: 370 */       return;
/*  363:     */     }
/*  364: 372 */     j.info("Stopping server");
/*  365: 373 */     if (ao() != null) {
/*  366: 374 */       ao().b();
/*  367:     */     }
/*  368: 376 */     if (this.v != null)
/*  369:     */     {
/*  370: 377 */       j.info("Saving players");
/*  371: 378 */       this.v.k();
/*  372: 379 */       this.v.v();
/*  373:     */     }
/*  374: 381 */     if (this.c != null)
/*  375:     */     {
/*  376: 382 */       j.info("Saving worlds");
/*  377: 383 */       a(false);
/*  378: 384 */       for (int i1 = 0; i1 < this.c.length; i1++)
/*  379:     */       {
/*  380: 385 */         WorldServer localqt = this.c[i1];
/*  381: 386 */         localqt.o();
/*  382:     */       }
/*  383:     */     }
/*  384: 389 */     if (this.m.d()) {
/*  385: 390 */       this.m.e();
/*  386:     */     }
/*  387:     */   }
/*  388:     */   
/*  389:     */   public boolean t()
/*  390:     */   {
/*  391: 403 */     return this.w;
/*  392:     */   }
/*  393:     */   
/*  394:     */   public void u()
/*  395:     */   {
/*  396: 407 */     this.w = false;
/*  397:     */   }
/*  398:     */   
/*  399:     */   protected void v()
/*  400:     */   {
/*  401: 411 */     k = this;
/*  402:     */   }
/*  403:     */   
/*  404:     */   public void run()
/*  405:     */   {
/*  406:     */     try
/*  407:     */     {
/*  408: 417 */       if (i())
/*  409:     */       {
/*  410: 418 */         this.ab = ax();
/*  411: 419 */         long l1 = 0L;
/*  412:     */         
/*  413: 421 */         this.r.a(new hy(this.E));
/*  414: 422 */         this.r.a(new nt("1.8", 47));
/*  415:     */         
/*  416: 424 */         a(this.r);
/*  417: 426 */         while (this.w)
/*  418:     */         {
/*  419: 427 */           long l2 = ax();
/*  420: 428 */           long l3 = l2 - this.ab;
/*  421: 429 */           if ((l3 > 2000L) && (this.ab - this.R >= 15000L))
/*  422:     */           {
/*  423: 430 */             j.warn("Can't keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)", new Object[] { Long.valueOf(l3), Long.valueOf(l3 / 50L) });
/*  424: 431 */             l3 = 2000L;
/*  425: 432 */             this.R = this.ab;
/*  426:     */           }
/*  427: 434 */           if (l3 < 0L)
/*  428:     */           {
/*  429: 435 */             j.warn("Time ran backwards! Did the system time change?");
/*  430: 436 */             l3 = 0L;
/*  431:     */           }
/*  432: 438 */           l1 += l3;
/*  433: 439 */           this.ab = l2;
/*  434: 441 */           if (this.c[0].areAllPlayersAsleep())
/*  435:     */           {
/*  436: 442 */             y();
/*  437: 443 */             l1 = 0L;
/*  438:     */           }
/*  439:     */           else
/*  440:     */           {
/*  441: 445 */             while (l1 > 50L)
/*  442:     */             {
/*  443: 446 */               l1 -= 50L;
/*  444: 447 */               y();
/*  445:     */             }
/*  446:     */           }
/*  447: 451 */           Thread.sleep(Math.max(1L, 50L - l1));
/*  448: 452 */           this.Q = true;
/*  449:     */         }
/*  450:     */       }
/*  451:     */       else
/*  452:     */       {
/*  453: 455 */         a((b)null);
/*  454:     */       }
/*  455:     */     }
/*  456:     */     catch (Throwable localThrowable2)
/*  457:     */     {
/*  458: 458 */       j.error("Encountered an unexpected exception", localThrowable2);
/*  459:     */       
/*  460: 460 */       b localb = null;
/*  461: 462 */       if ((localThrowable2 instanceof u)) {
/*  462: 463 */         localb = b(((u)localThrowable2).a());
/*  463:     */       } else {
/*  464: 465 */         localb = b(new b("Exception in server tick loop", localThrowable2));
/*  465:     */       }
/*  466: 468 */       File localFile = new File(new File(w(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
/*  467: 470 */       if (localb.a(localFile)) {
/*  468: 471 */         j.error("This crash report has been saved to: " + localFile.getAbsolutePath());
/*  469:     */       } else {
/*  470: 473 */         j.error("We were unable to save this crash report to disk.");
/*  471:     */       }
/*  472: 476 */       a(localb);
/*  473:     */     }
/*  474:     */     finally
/*  475:     */     {
/*  476:     */       try
/*  477:     */       {
/*  478: 479 */         r();
/*  479: 480 */         this.x = true;
/*  480:     */       }
/*  481:     */       catch (Throwable localThrowable4)
/*  482:     */       {
/*  483: 482 */         j.error("Exception stopping the server", localThrowable4);
/*  484:     */       }
/*  485:     */       finally
/*  486:     */       {
/*  487: 484 */         x();
/*  488:     */       }
/*  489:     */     }
/*  490:     */   }
/*  491:     */   
/*  492:     */   private void a(np paramnp)
/*  493:     */   {
/*  494: 490 */     File localFile = d("server-icon.png");
/*  495: 491 */     if (localFile.isFile())
/*  496:     */     {
/*  497: 492 */       ByteBuf localByteBuf1 = Unpooled.buffer();
/*  498:     */       try
/*  499:     */       {
/*  500: 495 */         BufferedImage localBufferedImage = ImageIO.read(localFile);
/*  501: 496 */         Validate.validState(localBufferedImage.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
/*  502: 497 */         Validate.validState(localBufferedImage.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
/*  503: 498 */         ImageIO.write(localBufferedImage, "PNG", new ByteBufOutputStream(localByteBuf1));
/*  504: 499 */         ByteBuf localByteBuf2 = Base64.encode(localByteBuf1);
/*  505: 500 */         paramnp.a("data:image/png;base64," + localByteBuf2.toString(Charsets.UTF_8));
/*  506:     */       }
/*  507:     */       catch (Exception localException)
/*  508:     */       {
/*  509: 502 */         j.error("Couldn't load server icon", localException);
/*  510:     */       }
/*  511:     */       finally
/*  512:     */       {
/*  513: 504 */         localByteBuf1.release();
/*  514:     */       }
/*  515:     */     }
/*  516:     */   }
/*  517:     */   
/*  518:     */   public File w()
/*  519:     */   {
/*  520: 510 */     return new File(".");
/*  521:     */   }
/*  522:     */   
/*  523:     */   protected void a(b paramb) {}
/*  524:     */   
/*  525:     */   protected void x() {}
/*  526:     */   
/*  527:     */   public void y()
/*  528:     */   {
/*  529: 520 */     long l1 = System.nanoTime();
/*  530:     */     
/*  531: 522 */     this.y += 1;
/*  532: 524 */     if (this.T)
/*  533:     */     {
/*  534: 525 */       this.T = false;
/*  535: 526 */       this.b.a = true;
/*  536: 527 */       this.b.a();
/*  537:     */     }
/*  538: 530 */     this.b.a("root");
/*  539: 531 */     z();
/*  540: 533 */     if (l1 - this.X >= 5000000000L)
/*  541:     */     {
/*  542: 534 */       this.X = l1;
/*  543: 535 */       this.r.a(new nq(H(), G()));
/*  544:     */       
/*  545: 537 */       GameProfile[] arrayOfGameProfile = new GameProfile[Math.min(G(), 12)];
/*  546: 538 */       int i1 = MathUtils.nextInt(this.s, 0, G() - arrayOfGameProfile.length);
/*  547: 539 */       for (int i2 = 0; i2 < arrayOfGameProfile.length; i2++) {
/*  548: 540 */         arrayOfGameProfile[i2] = ((qw)this.v.e.get(i1 + i2)).cc();
/*  549:     */       }
/*  550: 542 */       Collections.shuffle(Arrays.asList(arrayOfGameProfile));
/*  551: 543 */       this.r.b().a(arrayOfGameProfile);
/*  552:     */     }
/*  553: 546 */     if (this.y % 900 == 0)
/*  554:     */     {
/*  555: 547 */       this.b.a("save");
/*  556: 548 */       this.v.k();
/*  557: 549 */       a(true);
/*  558: 550 */       this.b.b();
/*  559:     */     }
/*  560: 553 */     this.b.a("tallying");
/*  561: 554 */     this.g[(this.y % 100)] = (System.nanoTime() - l1);
/*  562:     */     
/*  563: 556 */     this.b.b();
/*  564:     */     
/*  565: 558 */     this.b.a("snooper");
/*  566: 559 */     if ((!this.m.d()) && (this.y > 100)) {
/*  567: 560 */       this.m.a();
/*  568:     */     }
/*  569: 563 */     if (this.y % 6000 == 0) {
/*  570: 564 */       this.m.b();
/*  571:     */     }
/*  572: 566 */     this.b.b();
/*  573:     */     
/*  574: 568 */     this.b.b();
/*  575:     */   }
/*  576:     */   
/*  577:     */   public void z()
/*  578:     */   {
/*  579: 572 */     this.b.a("jobs");
/*  580: 573 */     synchronized (this.i)
/*  581:     */     {
/*  582: 574 */       while (!this.i.isEmpty()) {
/*  583:     */         try
/*  584:     */         {
/*  585: 576 */           ((FutureTask)this.i.poll()).run();
/*  586:     */         }
/*  587:     */         catch (Throwable localThrowable1)
/*  588:     */         {
/*  589: 578 */           j.fatal(localThrowable1);
/*  590:     */         }
/*  591:     */       }
/*  592:     */     }
/*  593: 583 */     this.b.c("levels");
/*  594: 584 */     for (int i1 = 0; i1 < this.c.length; i1++)
/*  595:     */     {
/*  596: 585 */       long l1 = System.nanoTime();
/*  597: 587 */       if ((i1 == 0) || (A()))
/*  598:     */       {
/*  599: 588 */         WorldServer localqt = this.c[i1];
/*  600: 589 */         this.b.a(localqt.getWorldInfo().k());
/*  601: 591 */         if (this.y % 20 == 0)
/*  602:     */         {
/*  603: 592 */           this.b.a("timeSync");
/*  604: 593 */           this.v.a(new li(localqt.K(), localqt.L(), localqt.getGameRules().getBoolean("doDaylightCycle")), localqt.t.q());
/*  605: 594 */           this.b.b();
/*  606:     */         }
/*  607: 597 */         this.b.a("tick");
/*  608:     */         b localb;
/*  609:     */         try
/*  610:     */         {
/*  611: 599 */           localqt.tick();
/*  612:     */         }
/*  613:     */         catch (Throwable localThrowable2)
/*  614:     */         {
/*  615: 601 */           localb = net.minecraft.src.b.a(localThrowable2, "Exception ticking world");
/*  616: 602 */           localqt.a(localb);
/*  617: 603 */           throw new u(localb);
/*  618:     */         }
/*  619:     */         try
/*  620:     */         {
/*  621: 607 */           localqt.updateEntities();
/*  622:     */         }
/*  623:     */         catch (Throwable localThrowable3)
/*  624:     */         {
/*  625: 609 */           localb = net.minecraft.src.b.a(localThrowable3, "Exception ticking world entities");
/*  626: 610 */           localqt.a(localb);
/*  627: 611 */           throw new u(localb);
/*  628:     */         }
/*  629: 613 */         this.b.b();
/*  630: 614 */         this.b.a("tracker");
/*  631: 615 */         localqt.s().a();
/*  632: 616 */         this.b.b();
/*  633:     */         
/*  634: 618 */         this.b.b();
/*  635:     */       }
/*  636: 621 */       this.h[i1][(this.y % 100)] = (System.nanoTime() - l1);
/*  637:     */     }
/*  638: 624 */     this.b.c("connection");
/*  639: 625 */     ao().c();
/*  640: 626 */     this.b.c("players");
/*  641: 627 */     this.v.e();
/*  642:     */     
/*  643: 629 */     this.b.c("tickables");
/*  644: 630 */     for (int i1 = 0; i1 < this.o.size(); i1++) {
/*  645: 631 */       ((pm)this.o.get(i1)).c();
/*  646:     */     }
/*  647: 633 */     this.b.b();
/*  648:     */   }
/*  649:     */   
/*  650:     */   public boolean A()
/*  651:     */   {
/*  652: 637 */     return true;
/*  653:     */   }
/*  654:     */   
/*  655:     */   public void B()
/*  656:     */   {
/*  657: 724 */     this.aa = new Thread(this, "Server thread");
/*  658: 725 */     this.aa.start();
/*  659:     */   }
/*  660:     */   
/*  661:     */   public File d(String paramString)
/*  662:     */   {
/*  663: 729 */     return new File(w(), paramString);
/*  664:     */   }
/*  665:     */   
/*  666:     */   public void f(String paramString)
/*  667:     */   {
/*  668: 737 */     j.warn(paramString);
/*  669:     */   }
/*  670:     */   
/*  671:     */   public WorldServer a(int paramInt)
/*  672:     */   {
/*  673: 741 */     if (paramInt == -1) {
/*  674: 742 */       return this.c[1];
/*  675:     */     }
/*  676: 744 */     if (paramInt == 1) {
/*  677: 745 */       return this.c[2];
/*  678:     */     }
/*  679: 747 */     return this.c[0];
/*  680:     */   }
/*  681:     */   
/*  682:     */   public String F()
/*  683:     */   {
/*  684: 764 */     return "1.8";
/*  685:     */   }
/*  686:     */   
/*  687:     */   public int G()
/*  688:     */   {
/*  689: 768 */     return this.v.p();
/*  690:     */   }
/*  691:     */   
/*  692:     */   public int H()
/*  693:     */   {
/*  694: 772 */     return this.v.q();
/*  695:     */   }
/*  696:     */   
/*  697:     */   public String[] I()
/*  698:     */   {
/*  699: 776 */     return this.v.g();
/*  700:     */   }
/*  701:     */   
/*  702:     */   public GameProfile[] J()
/*  703:     */   {
/*  704: 780 */     return this.v.h();
/*  705:     */   }
/*  706:     */   
/*  707:     */   public String getServerModName()
/*  708:     */   {
/*  709: 808 */     return "vanilla";
/*  710:     */   }
/*  711:     */   
/*  712:     */   public b b(b paramb)
/*  713:     */   {
/*  714: 813 */     paramb.g().a("Profiler Position", new pf(this));
/*  715: 820 */     if (this.v != null) {
/*  716: 821 */       paramb.g().a("Player Count", new pg(this));
/*  717:     */     }
/*  718: 829 */     return paramb;
/*  719:     */   }
/*  720:     */   
/*  721:     */   public List<String> a(ICommandSender paramae, String paramString, BlockPosition paramdt)
/*  722:     */   {
/*  723: 833 */     ArrayList<String> localArrayList = Lists.newArrayList();
/*  724:     */     Iterator<String> localObject2;
/*  725: 835 */     if (paramString.startsWith("/"))
/*  726:     */     {
/*  727: 836 */       paramString = paramString.substring(1);
/*  728: 837 */       int i1 = !paramString.contains(" ") ? 1 : 0;
/*  729:     */       
/*  730: 839 */       List<String> localObject1 = this.p.a(paramae, paramString, paramdt);
/*  731: 841 */       if (localObject1 != null) {
/*  732: 842 */         for (localObject2 = (localObject1).iterator(); (localObject2).hasNext();)
/*  733:     */         {
/*  734: 842 */           String str1 = (String)(localObject2).next();
/*  735: 843 */           if (i1 != 0) {
/*  736: 844 */             localArrayList.add("/" + str1);
/*  737:     */           } else {
/*  738: 846 */             localArrayList.add(str1);
/*  739:     */           }
/*  740:     */         }
/*  741:     */       }
/*  742: 851 */       return localArrayList;
/*  743:     */     }
/*  744: 853 */     String[] arrayOfString = paramString.split(" ", -1);
/*  745: 854 */     Object localObject1 = arrayOfString[(arrayOfString.length - 1)];
/*  746: 856 */     for (String str2 : this.v.g()) {
/*  747: 857 */       if (net.minecraft.src.CommandBase.a((String)localObject1, str2)) {
/*  748: 858 */         localArrayList.add(str2);
/*  749:     */       }
/*  750:     */     }
/*  751: 863 */     return localArrayList;
/*  752:     */   }
/*  753:     */   
/*  754:     */   public static MinecraftServer M()
/*  755:     */   {
/*  756: 867 */     return k;
/*  757:     */   }
/*  758:     */   
/*  759:     */   public boolean N()
/*  760:     */   {
/*  761: 871 */     return this.n != null;
/*  762:     */   }
/*  763:     */   
/*  764:     */   public String getName()
/*  765:     */   {
/*  766: 876 */     return "Server";
/*  767:     */   }
/*  768:     */   
/*  769:     */   public void a(ho paramho)
/*  770:     */   {
/*  771: 881 */     j.info(paramho.c());
/*  772:     */   }
/*  773:     */   
/*  774:     */   public boolean a(int paramInt, String paramString)
/*  775:     */   {
/*  776: 886 */     return true;
/*  777:     */   }
/*  778:     */   
/*  779:     */   public ad O()
/*  780:     */   {
/*  781: 890 */     return this.p;
/*  782:     */   }
/*  783:     */   
/*  784:     */   public KeyPair P()
/*  785:     */   {
/*  786: 894 */     return this.H;
/*  787:     */   }
/*  788:     */   
/*  789:     */   public String R()
/*  790:     */   {
/*  791: 906 */     return this.I;
/*  792:     */   }
/*  793:     */   
/*  794:     */   public void j(String paramString)
/*  795:     */   {
/*  796: 910 */     this.I = paramString;
/*  797:     */   }
/*  798:     */   
/*  799:     */   public boolean S()
/*  800:     */   {
/*  801: 914 */     return this.I != null;
/*  802:     */   }
/*  803:     */   
/*  804:     */   public String T()
/*  805:     */   {
/*  806: 918 */     return this.J;
/*  807:     */   }
/*  808:     */   
/*  809:     */   public void k(String paramString)
/*  810:     */   {
/*  811: 922 */     this.J = paramString;
/*  812:     */   }
/*  813:     */   
/*  814:     */   public void l(String paramString)
/*  815:     */   {
/*  816: 926 */     this.K = paramString;
/*  817:     */   }
/*  818:     */   
/*  819:     */   public String U()
/*  820:     */   {
/*  821: 930 */     return this.K;
/*  822:     */   }
/*  823:     */   
/*  824:     */   public void a(KeyPair paramKeyPair)
/*  825:     */   {
/*  826: 934 */     this.H = paramKeyPair;
/*  827:     */   }
/*  828:     */   
/*  829:     */   public void a(EnumDifficulty paramvt)
/*  830:     */   {
/*  831: 938 */     for (int i1 = 0; i1 < this.c.length; i1++)
/*  832:     */     {
/*  833: 939 */       WorldServer localqt = this.c[i1];
/*  834: 941 */       if (localqt != null) {
/*  835: 942 */         if (localqt.getWorldInfo().isHardcore())
/*  836:     */         {
/*  837: 943 */           localqt.getWorldInfo().setDifficulty(EnumDifficulty.HARD);
/*  838: 944 */           localqt.a(true, true);
/*  839:     */         }
/*  840: 945 */         else if (S())
/*  841:     */         {
/*  842: 946 */           localqt.getWorldInfo().setDifficulty(paramvt);
/*  843: 947 */           localqt.a(localqt.getDifficulty() != EnumDifficulty.PEACEFUL, true);
/*  844:     */         }
/*  845:     */         else
/*  846:     */         {
/*  847: 949 */           localqt.getWorldInfo().setDifficulty(paramvt);
/*  848: 950 */           localqt.a(V(), this.A);
/*  849:     */         }
/*  850:     */       }
/*  851:     */     }
/*  852:     */   }
/*  853:     */   
/*  854:     */   protected boolean V()
/*  855:     */   {
/*  856: 957 */     return true;
/*  857:     */   }
/*  858:     */   
/*  859:     */   public boolean W()
/*  860:     */   {
/*  861: 961 */     return this.L;
/*  862:     */   }
/*  863:     */   
/*  864:     */   public void b(boolean paramBoolean)
/*  865:     */   {
/*  866: 965 */     this.L = paramBoolean;
/*  867:     */   }
/*  868:     */   
/*  869:     */   public void c(boolean paramBoolean)
/*  870:     */   {
/*  871: 969 */     this.M = paramBoolean;
/*  872:     */   }
/*  873:     */   
/*  874:     */   public bra X()
/*  875:     */   {
/*  876: 973 */     return this.l;
/*  877:     */   }
/*  878:     */   
/*  879:     */   public void Z()
/*  880:     */   {
/*  881: 981 */     this.N = true;
/*  882:     */     
/*  883: 983 */     X().d();
/*  884: 985 */     for (int i1 = 0; i1 < this.c.length; i1++)
/*  885:     */     {
/*  886: 986 */       WorldServer localqt = this.c[i1];
/*  887: 988 */       if (localqt != null) {
/*  888: 989 */         localqt.o();
/*  889:     */       }
/*  890:     */     }
/*  891: 993 */     X().e(this.c[0].O().g());
/*  892: 994 */     u();
/*  893:     */   }
/*  894:     */   
/*  895:     */   public String aa()
/*  896:     */   {
/*  897: 998 */     return this.O;
/*  898:     */   }
/*  899:     */   
/*  900:     */   public String ab()
/*  901:     */   {
/*  902:1002 */     return this.P;
/*  903:     */   }
/*  904:     */   
/*  905:     */   public void a_(String paramString1, String paramString2)
/*  906:     */   {
/*  907:1006 */     this.O = paramString1;
/*  908:1007 */     this.P = paramString2;
/*  909:     */   }
/*  910:     */   
/*  911:     */   public void a(wb paramwb)
/*  912:     */   {
/*  913:1012 */     paramwb.a("whitelist_enabled", Boolean.valueOf(false));
/*  914:1013 */     paramwb.a("whitelist_count", Integer.valueOf(0));
/*  915:1014 */     if (this.v != null)
/*  916:     */     {
/*  917:1015 */       paramwb.a("players_current", Integer.valueOf(G()));
/*  918:1016 */       paramwb.a("players_max", Integer.valueOf(H()));
/*  919:1017 */       paramwb.a("players_seen", Integer.valueOf(this.v.r().length));
/*  920:     */     }
/*  921:1019 */     paramwb.a("uses_auth", Boolean.valueOf(this.z));
/*  922:1020 */     paramwb.a("gui_state", aq() ? "enabled" : "disabled");
/*  923:1021 */     paramwb.a("run_time", Long.valueOf((ax() - paramwb.g()) / 60L * 1000L));
/*  924:     */     
/*  925:1023 */     paramwb.a("avg_tick_ms", Integer.valueOf((int)(MathUtils.average(this.g) * 1.0E-006D)));
/*  926:     */     
/*  927:1025 */     int i1 = 0;
/*  928:1026 */     if (this.c != null) {
/*  929:1027 */       for (int i2 = 0; i2 < this.c.length; i2++) {
/*  930:1028 */         if (this.c[i2] != null)
/*  931:     */         {
/*  932:1029 */           WorldServer localqt = this.c[i2];
/*  933:1030 */           WorldInfo localbqo = localqt.getWorldInfo();
/*  934:     */           
/*  935:1032 */           paramwb.a("world[" + i1 + "][dimension]", Integer.valueOf(localqt.t.q()));
/*  936:1033 */           paramwb.a("world[" + i1 + "][mode]", localbqo.r());
/*  937:1034 */           paramwb.a("world[" + i1 + "][difficulty]", localqt.getDifficulty());
/*  938:1035 */           paramwb.a("world[" + i1 + "][hardcore]", Boolean.valueOf(localbqo.isHardcore()));
/*  939:1036 */           paramwb.a("world[" + i1 + "][generator_name]", localbqo.u().a());
/*  940:1037 */           paramwb.a("world[" + i1 + "][generator_version]", Integer.valueOf(localbqo.u().d()));
/*  941:1038 */           paramwb.a("world[" + i1 + "][height]", Integer.valueOf(this.F));
/*  942:1039 */           paramwb.a("world[" + i1 + "][chunks_loaded]", Integer.valueOf(localqt.N().g()));
/*  943:     */           
/*  944:1041 */           i1++;
/*  945:     */         }
/*  946:     */       }
/*  947:     */     }
/*  948:1046 */     paramwb.a("worlds", Integer.valueOf(i1));
/*  949:     */   }
/*  950:     */   
/*  951:     */   public void b(wb paramwb)
/*  952:     */   {
/*  953:1051 */     paramwb.b("singleplayer", Boolean.valueOf(S()));
/*  954:1052 */     paramwb.b("server_brand", getServerModName());
/*  955:1053 */     paramwb.b("gui_supported", GraphicsEnvironment.isHeadless() ? "headless" : "supported");
/*  956:1054 */     paramwb.b("dedicated", Boolean.valueOf(ad()));
/*  957:     */   }
/*  958:     */   
/*  959:     */   public boolean ac()
/*  960:     */   {
/*  961:1059 */     return true;
/*  962:     */   }
/*  963:     */   
/*  964:     */   public abstract boolean ad();
/*  965:     */   
/*  966:     */   public boolean ae()
/*  967:     */   {
/*  968:1065 */     return this.z;
/*  969:     */   }
/*  970:     */   
/*  971:     */   public void d(boolean paramBoolean)
/*  972:     */   {
/*  973:1069 */     this.z = paramBoolean;
/*  974:     */   }
/*  975:     */   
/*  976:     */   public boolean af()
/*  977:     */   {
/*  978:1073 */     return this.A;
/*  979:     */   }
/*  980:     */   
/*  981:     */   public void e(boolean paramBoolean)
/*  982:     */   {
/*  983:1077 */     this.A = paramBoolean;
/*  984:     */   }
/*  985:     */   
/*  986:     */   public boolean ag()
/*  987:     */   {
/*  988:1081 */     return this.B;
/*  989:     */   }
/*  990:     */   
/*  991:     */   public void f(boolean paramBoolean)
/*  992:     */   {
/*  993:1085 */     this.B = paramBoolean;
/*  994:     */   }
/*  995:     */   
/*  996:     */   public boolean ah()
/*  997:     */   {
/*  998:1089 */     return this.C;
/*  999:     */   }
/* 1000:     */   
/* 1001:     */   public void g(boolean paramBoolean)
/* 1002:     */   {
/* 1003:1093 */     this.C = paramBoolean;
/* 1004:     */   }
/* 1005:     */   
/* 1006:     */   public boolean ai()
/* 1007:     */   {
/* 1008:1097 */     return this.D;
/* 1009:     */   }
/* 1010:     */   
/* 1011:     */   public void h(boolean paramBoolean)
/* 1012:     */   {
/* 1013:1101 */     this.D = paramBoolean;
/* 1014:     */   }
/* 1015:     */   
/* 1016:     */   public abstract boolean aj();
/* 1017:     */   
/* 1018:     */   public String ak()
/* 1019:     */   {
/* 1020:1107 */     return this.E;
/* 1021:     */   }
/* 1022:     */   
/* 1023:     */   public void m(String paramString)
/* 1024:     */   {
/* 1025:1111 */     this.E = paramString;
/* 1026:     */   }
/* 1027:     */   
/* 1028:     */   public int al()
/* 1029:     */   {
/* 1030:1115 */     return this.F;
/* 1031:     */   }
/* 1032:     */   
/* 1033:     */   public void c(int paramInt)
/* 1034:     */   {
/* 1035:1119 */     this.F = paramInt;
/* 1036:     */   }
/* 1037:     */   
/* 1038:     */   public sn an()
/* 1039:     */   {
/* 1040:1127 */     return this.v;
/* 1041:     */   }
/* 1042:     */   
/* 1043:     */   public void a(sn paramsn)
/* 1044:     */   {
/* 1045:1131 */     this.v = paramsn;
/* 1046:     */   }
/* 1047:     */   
/* 1048:     */   public void a(EnumGameType paramarc)
/* 1049:     */   {
/* 1050:1135 */     for (int i1 = 0; i1 < this.c.length; i1++) {
/* 1051:1136 */       M().c[i1].getWorldInfo().a(paramarc);
/* 1052:     */     }
/* 1053:     */   }
/* 1054:     */   
/* 1055:     */   public rc ao()
/* 1056:     */   {
/* 1057:1141 */     return this.q;
/* 1058:     */   }
/* 1059:     */   
/* 1060:     */   public boolean ap()
/* 1061:     */   {
/* 1062:1145 */     return this.Q;
/* 1063:     */   }
/* 1064:     */   
/* 1065:     */   public boolean aq()
/* 1066:     */   {
/* 1067:1149 */     return false;
/* 1068:     */   }
/* 1069:     */   
/* 1070:     */   public abstract String a(EnumGameType paramarc, boolean paramBoolean);
/* 1071:     */   
/* 1072:     */   public int ar()
/* 1073:     */   {
/* 1074:1155 */     return this.y;
/* 1075:     */   }
/* 1076:     */   
/* 1077:     */   public void as()
/* 1078:     */   {
/* 1079:1159 */     this.T = true;
/* 1080:     */   }
/* 1081:     */   
/* 1082:     */   public wb at()
/* 1083:     */   {
/* 1084:1163 */     return this.m;
/* 1085:     */   }
/* 1086:     */   
/* 1087:     */   public BlockPosition c()
/* 1088:     */   {
/* 1089:1168 */     return BlockPosition.zero;
/* 1090:     */   }
/* 1091:     */   
/* 1092:     */   public Vec3 d()
/* 1093:     */   {
/* 1094:1173 */     return new Vec3(0.0D, 0.0D, 0.0D);
/* 1095:     */   }
/* 1096:     */   
/* 1097:     */   public World e()
/* 1098:     */   {
/* 1099:1178 */     return this.c[0];
/* 1100:     */   }
/* 1101:     */   
/* 1102:     */   public Entity f()
/* 1103:     */   {
/* 1104:1183 */     return null;
/* 1105:     */   }
/* 1106:     */   
/* 1107:     */   public int au()
/* 1108:     */   {
/* 1109:1187 */     return 16;
/* 1110:     */   }
/* 1111:     */   
/* 1112:     */   public boolean a(World paramaqu, BlockPosition paramdt, EntityPlayer paramahd)
/* 1113:     */   {
/* 1114:1191 */     return false;
/* 1115:     */   }
/* 1116:     */   
/* 1117:     */   public boolean av()
/* 1118:     */   {
/* 1119:1199 */     return this.U;
/* 1120:     */   }
/* 1121:     */   
/* 1122:     */   public Proxy aw()
/* 1123:     */   {
/* 1124:1203 */     return this.d;
/* 1125:     */   }
/* 1126:     */   
/* 1127:     */   public static long ax()
/* 1128:     */   {
/* 1129:1207 */     return System.currentTimeMillis();
/* 1130:     */   }
/* 1131:     */   
/* 1132:     */   public int ay()
/* 1133:     */   {
/* 1134:1211 */     return this.G;
/* 1135:     */   }
/* 1136:     */   
/* 1137:     */   public void d(int paramInt)
/* 1138:     */   {
/* 1139:1215 */     this.G = paramInt;
/* 1140:     */   }
/* 1141:     */   
/* 1142:     */   public ho e_()
/* 1143:     */   {
/* 1144:1220 */     return new hy(getName());
/* 1145:     */   }
/* 1146:     */   
/* 1147:     */   public boolean az()
/* 1148:     */   {
/* 1149:1224 */     return true;
/* 1150:     */   }
/* 1151:     */   
/* 1152:     */   public MinecraftSessionService aB()
/* 1153:     */   {
/* 1154:1232 */     return this.W;
/* 1155:     */   }
/* 1156:     */   
/* 1157:     */   public GameProfileRepository aC()
/* 1158:     */   {
/* 1159:1236 */     return this.Y;
/* 1160:     */   }
/* 1161:     */   
/* 1162:     */   public ry aD()
/* 1163:     */   {
/* 1164:1240 */     return this.Z;
/* 1165:     */   }
/* 1166:     */   
/* 1167:     */   public np aE()
/* 1168:     */   {
/* 1169:1244 */     return this.r;
/* 1170:     */   }
/* 1171:     */   
/* 1172:     */   public void aF()
/* 1173:     */   {
/* 1174:1248 */     this.X = 0L;
/* 1175:     */   }
/* 1176:     */   
/* 1177:     */   public Entity a(UUID paramUUID)
/* 1178:     */   {
/* 1179:1253 */     for (WorldServer localqt : this.c) {
/* 1180:1254 */       if (localqt != null)
/* 1181:     */       {
/* 1182:1255 */         Entity localwv = localqt.a(paramUUID);
/* 1183:1256 */         if (localwv != null) {
/* 1184:1257 */           return localwv;
/* 1185:     */         }
/* 1186:     */       }
/* 1187:     */     }
/* 1188:1261 */     return null;
/* 1189:     */   }
/* 1190:     */   
/* 1191:     */   public boolean t_()
/* 1192:     */   {
/* 1193:1266 */     return M().c[0].getGameRules().getBoolean("sendCommandFeedback");
/* 1194:     */   }
/* 1195:     */   
/* 1196:     */   public void a(ag paramag, int paramInt) {}
/* 1197:     */   
/* 1198:     */   public int aG()
/* 1199:     */   {
/* 1200:1273 */     return 29999984;
/* 1201:     */   }
/* 1202:     */   
/* 1203:     */   public ListenableFuture a(Callable paramCallable)
/* 1204:     */   {
/* 1205:1278 */     Validate.notNull(paramCallable);
/* 1206:1280 */     if (!aH())
/* 1207:     */     {
/* 1208:1281 */       ListenableFutureTask localListenableFutureTask = ListenableFutureTask.create(paramCallable);
/* 1209:1282 */       synchronized (this.i)
/* 1210:     */       {
/* 1211:1283 */         this.i.add(localListenableFutureTask);
/* 1212:     */       }
/* 1213:1285 */       return localListenableFutureTask;
/* 1214:     */     }
/* 1215:     */     try
/* 1216:     */     {
/* 1217:1288 */       return Futures.immediateFuture(paramCallable.call());
/* 1218:     */     }
/* 1219:     */     catch (Exception localException)
/* 1220:     */     {
/* 1221:1290 */       return Futures.immediateFailedCheckedFuture(localException);
/* 1222:     */     }
/* 1223:     */   }
/* 1224:     */   
/* 1225:     */   public ListenableFuture a(Runnable paramRunnable)
/* 1226:     */   {
/* 1227:1297 */     Validate.notNull(paramRunnable);
/* 1228:     */     
/* 1229:1299 */     return a(Executors.callable(paramRunnable));
/* 1230:     */   }
/* 1231:     */   
/* 1232:     */   public boolean aH()
/* 1233:     */   {
/* 1234:1304 */     return Thread.currentThread() == this.aa;
/* 1235:     */   }
/* 1236:     */   
/* 1237:     */   public int aI()
/* 1238:     */   {
/* 1239:1308 */     return 256;
/* 1240:     */   }
				  public static Logger aL() {return j;}
				  public static sn a(MinecraftServer arg0) {return arg0.v;}
/* 1241:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.server.MinecraftServer
 * JD-Core Version:    0.7.0.1
 */
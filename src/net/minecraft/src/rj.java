package net.minecraft.src;
/*    1:     */ import com.google.common.collect.Lists;
/*    2:     */ import com.google.common.util.concurrent.Futures;

/*    3:     */ import io.netty.buffer.Unpooled;
/*    4:     */ import io.netty.util.concurrent.GenericFutureListener;

/*    5:     */ import java.io.IOException;
/*    6:     */ import java.util.ArrayList;
/*    7:     */ import java.util.Collections;
/*    8:     */ import java.util.List;
/*    9:     */ import java.util.Set;

/*   10:     */ import net.minecraft.server.MinecraftServer;

/*   11:     */ import org.apache.commons.lang3.StringUtils;
/*   12:     */ import org.apache.logging.log4j.LogManager;
/*   13:     */ import org.apache.logging.log4j.Logger;
/*   14:     */ 
/*   15:     */ public class rj
/*   16:     */   implements ls, pm
/*   17:     */ {
/*   18:  61 */   private static final Logger c = LogManager.getLogger();
/*   19:     */   public final gr a;
/*   20:     */   private final MinecraftServer d;
/*   21:     */   public qw b;
/*   22:     */   private int e;
/*   23:     */   private int f;
/*   24:     */   private int g;
/*   25:     */   private boolean h;
/*   26:     */   private int i;
/*   27:     */   private long j;
/*   28:     */   private long k;
/*   29:     */   private int l;
/*   30:     */   private int m;
/*   31:  79 */   private um n = new um();
/*   32:     */   private double o;
/*   33:     */   private double p;
/*   34:     */   private double q;
/*   35:     */   
/*   36:     */   public rj(MinecraftServer paramMinecraftServer, gr paramgr, qw paramqw)
/*   37:     */   {
/*   38:  82 */     this.d = paramMinecraftServer;
/*   39:  83 */     this.a = paramgr;
/*   40:  84 */     paramgr.a(this);
/*   41:  85 */     this.b = paramqw;
/*   42:  86 */     paramqw.a = this;
/*   43:     */   }
/*   44:     */   
/*   45:     */   public void c()
/*   46:     */   {
/*   47:  91 */     this.h = false;
/*   48:  92 */     this.e += 1;
/*   49:     */     
/*   50:  94 */     this.d.b.a("keepAlive");
/*   51:  95 */     if (this.e - this.k > 40L)
/*   52:     */     {
/*   53:  96 */       this.k = this.e;
/*   54:  97 */       this.j = d();
/*   55:  98 */       this.i = ((int)this.j);
/*   56:  99 */       a(new jp(this.i));
/*   57:     */     }
/*   58: 101 */     this.d.b.b();
/*   59: 103 */     if (this.l > 0) {
/*   60: 104 */       this.l -= 1;
/*   61:     */     }
/*   62: 106 */     if (this.m > 0) {
/*   63: 107 */       this.m -= 1;
/*   64:     */     }
/*   65: 110 */     if ((this.b.D() > 0L) && (this.d.ay() > 0) && (MinecraftServer.ax() - this.b.D() > this.d.ay() * 1000 * 60)) {
/*   66: 111 */       c("You have been idle for too long!");
/*   67:     */     }
/*   68:     */   }
/*   69:     */   
/*   70:     */   public gr a()
/*   71:     */   {
/*   72: 117 */     return this.a;
/*   73:     */   }
/*   74:     */   
/*   75:     */   public void c(String paramString)
/*   76:     */   {
/*   77: 121 */     hy localhy = new hy(paramString);
/*   78: 122 */     this.a.a(new jj(localhy), new rk(this, localhy), new GenericFutureListener[0]);
/*   79:     */     
/*   80:     */ 
/*   81:     */ 
/*   82:     */ 
/*   83:     */ 
/*   84: 128 */     this.a.k();
/*   85: 129 */     Futures.getUnchecked(this.d.a(new rl(this)));
/*   86:     */   }
/*   87:     */   
/*   88: 138 */   private boolean r = true;
/*   89:     */   
/*   90:     */   public void a(mp parammp)
/*   91:     */   {
/*   92: 142 */     ig.a(parammp, this, this.b.u());
/*   93: 143 */     this.b.a(parammp.a(), parammp.b(), parammp.c(), parammp.d());
/*   94:     */   }
/*   95:     */   
/*   96:     */   public void a(mg parammg)
/*   97:     */   {
/*   98: 148 */     ig.a(parammg, this, this.b.u());
/*   99: 149 */     WorldServer localqt = this.d.a(this.b.dimension);
/*  100:     */     
/*  101: 151 */     this.h = true;
/*  102: 153 */     if (this.b.i) {
/*  103: 154 */       return;
/*  104:     */     }
/*  105: 157 */     double d1 = this.b.xPos;
/*  106: 158 */     double d2 = this.b.yPos;
/*  107: 159 */     double d3 = this.b.zPos;
/*  108: 160 */     double d4 = 0.0D;
/*  109:     */     
/*  110: 162 */     double d5 = parammg.a() - this.o;
/*  111: 163 */     double d6 = parammg.b() - this.p;
/*  112: 164 */     double d7 = parammg.c() - this.q;
/*  113: 165 */     if (parammg.g())
/*  114:     */     {
/*  115: 166 */       d4 = d5 * d5 + d6 * d6 + d7 * d7;
/*  116: 167 */       if ((!this.r) && 
/*  117: 168 */         (d4 < 0.25D)) {
/*  118: 169 */         this.r = true;
/*  119:     */       }
/*  120:     */     }
/*  121: 174 */     if (this.r)
/*  122:     */     {
/*  123: 175 */       this.f = this.e;
/*  124: 176 */       if (this.b.vehicle != null)
/*  125:     */       {
/*  126: 177 */         float f1 = this.b.yaw;
/*  127: 178 */         float f2 = this.b.pitch;
/*  128: 179 */         this.b.vehicle.al();
/*  129: 180 */         double d9 = this.b.xPos;
/*  130: 181 */         double d10 = this.b.yPos;
/*  131: 182 */         double d11 = this.b.zPos;
/*  132: 184 */         if (parammg.h())
/*  133:     */         {
/*  134: 185 */           f1 = parammg.d();
/*  135: 186 */           f2 = parammg.e();
/*  136:     */         }
/*  137: 189 */         this.b.C = parammg.f();
/*  138: 190 */         this.b.l();
/*  139: 191 */         this.b.a(d9, d10, d11, f1, f2);
/*  140: 192 */         if (this.b.vehicle != null) {
/*  141: 193 */           this.b.vehicle.al();
/*  142:     */         }
/*  143: 195 */         this.d.an().d(this.b);
/*  144: 198 */         if (this.b.vehicle != null)
/*  145:     */         {
/*  146: 199 */           if (d4 > 4.0D)
/*  147:     */           {
/*  148: 200 */             Entity localwv = this.b.vehicle;
/*  149: 201 */             this.b.a.a(new lo(localwv));
/*  150: 202 */             a(this.b.xPos, this.b.yPos, this.b.zPos, this.b.yaw, this.b.pitch);
/*  151:     */           }
/*  152: 204 */           this.b.vehicle.ai = true;
/*  153:     */         }
/*  154: 208 */         if (this.r)
/*  155:     */         {
/*  156: 209 */           this.o = this.b.xPos;
/*  157: 210 */           this.p = this.b.yPos;
/*  158: 211 */           this.q = this.b.zPos;
/*  159:     */         }
/*  160: 213 */         localqt.g(this.b);
/*  161: 214 */         return;
/*  162:     */       }
/*  163: 217 */       if (this.b.bI())
/*  164:     */       {
/*  165: 218 */         this.b.l();
/*  166: 219 */         this.b.a(this.o, this.p, this.q, this.b.yaw, this.b.pitch);
/*  167: 220 */         localqt.g(this.b);
/*  168: 221 */         return;
/*  169:     */       }
/*  170: 224 */       double d8 = this.b.yPos;
/*  171: 225 */       this.o = this.b.xPos;
/*  172: 226 */       this.p = this.b.yPos;
/*  173: 227 */       this.q = this.b.zPos;
/*  174:     */       
/*  175: 229 */       double d9 = this.b.xPos;
/*  176: 230 */       double d10 = this.b.yPos;
/*  177: 231 */       double d11 = this.b.zPos;
/*  178:     */       
/*  179: 233 */       float f3 = this.b.yaw;
/*  180: 234 */       float f4 = this.b.pitch;
/*  181: 236 */       if ((parammg.g()) && (parammg.b() == -999.0D)) {
/*  182: 238 */         parammg.a(false);
/*  183:     */       }
/*  184: 241 */       if (parammg.g())
/*  185:     */       {
/*  186: 242 */         d9 = parammg.a();
/*  187: 243 */         d10 = parammg.b();
/*  188: 244 */         d11 = parammg.c();
/*  189: 245 */         if ((Math.abs(parammg.a()) > 30000000.0D) || (Math.abs(parammg.c()) > 30000000.0D))
/*  190:     */         {
/*  191: 246 */           c("Illegal position");
/*  192: 247 */           return;
/*  193:     */         }
/*  194:     */       }
/*  195: 250 */       if (parammg.h())
/*  196:     */       {
/*  197: 251 */         f3 = parammg.d();
/*  198: 252 */         f4 = parammg.e();
/*  199:     */       }
/*  200: 255 */       this.b.l();
/*  201: 256 */       this.b.a(this.o, this.p, this.q, f3, f4);
/*  202: 257 */       if (!this.r) {
/*  203: 258 */         return;
/*  204:     */       }
/*  205: 261 */       double d12 = d9 - this.b.xPos;
/*  206: 262 */       double d13 = d10 - this.b.yPos;
/*  207: 263 */       double d14 = d11 - this.b.zPos;
/*  208:     */       
/*  209: 265 */       double d15 = Math.min(Math.abs(d12), Math.abs(this.b.xVelocity));
/*  210: 266 */       double d16 = Math.min(Math.abs(d13), Math.abs(this.b.yVelocity));
/*  211: 267 */       double d17 = Math.min(Math.abs(d14), Math.abs(this.b.zVelocity));
/*  212:     */       
/*  213: 269 */       double d18 = d15 * d15 + d16 * d16 + d17 * d17;
/*  214: 270 */       if ((d18 > 100.0D) && ((!this.d.S()) || (!this.d.R().equals(this.b.getName()))))
/*  215:     */       {
/*  216: 271 */         c.warn(this.b.getName() + " moved too quickly! " + d12 + "," + d13 + "," + d14 + " (" + d15 + ", " + d16 + ", " + d17 + ")");
/*  217: 272 */         a(this.o, this.p, this.q, this.b.yaw, this.b.pitch);
/*  218: 273 */         return;
/*  219:     */       }
/*  220: 276 */       float f5 = 0.0625F;
/*  221: 277 */       boolean bool1 = localqt.getCollidingAABBs(this.b, this.b.getAABB().d(f5, f5, f5)).isEmpty();
/*  222: 279 */       if ((this.b.C) && (!parammg.f()) && (d13 > 0.0D)) {
/*  223: 281 */         this.b.bE();
/*  224:     */       }
/*  225: 284 */       this.b.d(d12, d13, d14);
/*  226: 285 */       this.b.C = parammg.f();
/*  227:     */       
/*  228: 287 */       double d19 = d13;
/*  229:     */       
/*  230: 289 */       d12 = d9 - this.b.xPos;
/*  231: 290 */       d13 = d10 - this.b.yPos;
/*  232: 291 */       if ((d13 > -0.5D) || (d13 < 0.5D)) {
/*  233: 292 */         d13 = 0.0D;
/*  234:     */       }
/*  235: 294 */       d14 = d11 - this.b.zPos;
/*  236: 295 */       d18 = d12 * d12 + d13 * d13 + d14 * d14;
/*  237: 296 */       int i1 = 0;
/*  238: 297 */       if ((d18 > 0.0625D) && (!this.b.bI()) && (!this.b.c.d()))
/*  239:     */       {
/*  240: 298 */         i1 = 1;
/*  241: 299 */         c.warn(this.b.getName() + " moved wrongly!");
/*  242:     */       }
/*  243: 301 */       this.b.a(d9, d10, d11, f3, f4);
/*  244:     */       
/*  245:     */ 
/*  246: 304 */       this.b.k(this.b.xPos - d1, this.b.yPos - d2, this.b.zPos - d3);
/*  247: 306 */       if (!this.b.T)
/*  248:     */       {
/*  249: 307 */         boolean bool2 = localqt.getCollidingAABBs(this.b, this.b.getAABB().d(f5, f5, f5)).isEmpty();
/*  250: 308 */         if ((bool1) && ((i1 != 0) || (!bool2)) && (!this.b.bI()))
/*  251:     */         {
/*  252: 309 */           a(this.o, this.p, this.q, f3, f4);
/*  253: 310 */           return;
/*  254:     */         }
/*  255:     */       }
/*  256: 314 */       AABB localbrt = this.b.getAABB().expand(f5, f5, f5).addCoord(0.0D, -0.55D, 0.0D);
/*  257: 315 */       if ((!this.d.ai()) && (!this.b.by.c) && (!localqt.c(localbrt)))
/*  258:     */       {
/*  259: 316 */         if (d19 >= -0.03125D)
/*  260:     */         {
/*  261: 317 */           this.g += 1;
/*  262: 318 */           if (this.g > 80)
/*  263:     */           {
/*  264: 319 */             c.warn(this.b.getName() + " was kicked for floating too long!");
/*  265: 320 */             c("Flying is not enabled on this server");
/*  266:     */           }
/*  267:     */         }
/*  268:     */       }
/*  269:     */       else {
/*  270: 325 */         this.g = 0;
/*  271:     */       }
/*  272: 328 */       this.b.C = parammg.f();
/*  273: 329 */       this.d.an().d(this.b);
/*  274: 330 */       this.b.a(this.b.yPos - d8, parammg.f());
/*  275:     */     }
/*  276: 331 */     else if (this.e - this.f > 20)
/*  277:     */     {
/*  278: 332 */       a(this.o, this.p, this.q, this.b.yaw, this.b.pitch);
/*  279:     */     }
/*  280:     */   }
/*  281:     */   
/*  282:     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  283:     */   {
/*  284: 337 */     a(paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2, Collections.emptySet());
/*  285:     */   }
/*  286:     */   
/*  287:     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, Set paramSet)
/*  288:     */   {
/*  289: 341 */     this.r = false;
/*  290: 342 */     this.o = paramDouble1;
/*  291: 343 */     this.p = paramDouble2;
/*  292: 344 */     this.q = paramDouble3;
/*  293: 346 */     if (paramSet.contains(ij.a)) {
/*  294: 347 */       this.o += this.b.xPos;
/*  295:     */     }
/*  296: 350 */     if (paramSet.contains(ij.b)) {
/*  297: 351 */       this.p += this.b.yPos;
/*  298:     */     }
/*  299: 354 */     if (paramSet.contains(ij.c)) {
/*  300: 355 */       this.q += this.b.zPos;
/*  301:     */     }
/*  302: 358 */     float f1 = paramFloat1;
/*  303: 359 */     float f2 = paramFloat2;
/*  304: 361 */     if (paramSet.contains(ij.d)) {
/*  305: 362 */       f1 += this.b.yaw;
/*  306:     */     }
/*  307: 365 */     if (paramSet.contains(ij.e)) {
/*  308: 366 */       f2 += this.b.pitch;
/*  309:     */     }
/*  310: 369 */     this.b.a(this.o, this.p, this.q, f1, f2);
/*  311: 370 */     this.b.a.a(new ii(paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2, paramSet));
/*  312:     */   }
/*  313:     */   
/*  314:     */   public void a(ml paramml)
/*  315:     */   {
/*  316: 375 */     ig.a(paramml, this, this.b.u());
/*  317: 376 */     WorldServer localqt = this.d.a(this.b.dimension);
/*  318: 377 */     BlockPosition localdt = paramml.a();
/*  319: 378 */     this.b.z();
/*  320: 380 */     switch (rn.a[paramml.c().ordinal()])
/*  321:     */     {
/*  322:     */     case 1: 
/*  323: 382 */       if (!this.b.v()) {
/*  324: 383 */         this.b.a(false);
/*  325:     */       }
/*  326: 385 */       return;
/*  327:     */     case 2: 
/*  328: 387 */       if (!this.b.v()) {
/*  329: 388 */         this.b.a(true);
/*  330:     */       }
/*  331: 390 */       return;
/*  332:     */     case 3: 
/*  333: 392 */       this.b.bT();
/*  334: 393 */       return;
/*  335:     */     case 4: 
/*  336:     */     case 5: 
/*  337:     */     case 6: 
/*  338: 398 */       double d1 = this.b.xPos - (localdt.getX() + 0.5D);
/*  339:     */       
/*  340:     */ 
/*  341: 401 */       double d2 = this.b.yPos - (localdt.getY() + 0.5D) + 1.5D;
/*  342: 402 */       double d3 = this.b.zPos - (localdt.getZ() + 0.5D);
/*  343: 403 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*  344: 404 */       if (d4 > 36.0D) {
/*  345: 405 */         return;
/*  346:     */       }
/*  347: 407 */       if (localdt.getY() >= this.d.al()) {
/*  348:     */         return;
/*  349:     */       }
/*  350:     */       break;
/*  351:     */     default: 
/*  352: 412 */       throw new IllegalArgumentException("Invalid player action");
/*  353:     */     }
/*  354: 415 */     if (paramml.c() == mm.a)
/*  355:     */     {
/*  356: 416 */       if ((!this.d.a(localqt, localdt, this.b)) && (localqt.af().a(localdt))) {
/*  357: 417 */         this.b.c.a(localdt, paramml.b());
/*  358:     */       } else {
/*  359: 419 */         this.b.a.a(new iw(localqt, localdt));
/*  360:     */       }
/*  361:     */     }
/*  362:     */     else
/*  363:     */     {
/*  364: 422 */       if (paramml.c() == mm.c) {
/*  365: 423 */         this.b.c.a(localdt);
/*  366: 424 */       } else if (paramml.c() == mm.b) {
/*  367: 425 */         this.b.c.e();
/*  368:     */       }
/*  369: 428 */       if (localqt.getBlock(localdt).getProto().getMaterial() != Material.air) {
/*  370: 429 */         this.b.a.a(new iw(localqt, localdt));
/*  371:     */       }
/*  372:     */     }
/*  373:     */   }
/*  374:     */   
/*  375:     */   public void a(mx parammx)
/*  376:     */   {
/*  377: 436 */     ig.a(parammx, this, this.b.u());
/*  378: 437 */     WorldServer localqt = this.d.a(this.b.dimension);
/*  379: 438 */     ItemStack localamj = this.b.bg.h();
/*  380: 439 */     int i1 = 0;
/*  381: 440 */     BlockPosition localdt = parammx.a();
/*  382: 441 */     EnumDirection localej = EnumDirection.a(parammx.b());
/*  383: 442 */     this.b.z();
/*  384:     */     Object localObject;
/*  385: 444 */     if (parammx.b() == 255)
/*  386:     */     {
/*  387: 445 */       if (localamj == null) {
/*  388: 446 */         return;
/*  389:     */       }
/*  390: 448 */       this.b.c.a(this.b, localqt, localamj);
/*  391:     */     }
/*  392: 449 */     else if ((localdt.getY() < this.d.al() - 1) || ((localej != EnumDirection.UP) && (localdt.getY() < this.d.al())))
/*  393:     */     {
/*  394: 450 */       if ((this.r) && (this.b.e(localdt.getX() + 0.5D, localdt.getY() + 0.5D, localdt.getZ() + 0.5D) < 64.0D) && 
/*  395: 451 */         (!this.d.a(localqt, localdt, this.b)) && (localqt.af().a(localdt))) {
/*  396: 452 */         this.b.c.a(this.b, localqt, localamj, localdt, localej, parammx.d(), parammx.e(), parammx.f());
/*  397:     */       }
/*  398: 456 */       i1 = 1;
/*  399:     */     }
/*  400:     */     else
/*  401:     */     {
/*  402: 458 */       localObject = new hz("build.tooHigh", new Object[] { Integer.valueOf(this.d.al()) });
/*  403: 459 */       ((hz)localObject).b().a(net.minecraft.src.a.m);
/*  404: 460 */       this.b.a.a(new iz((ho)localObject));
/*  405: 461 */       i1 = 1;
/*  406:     */     }
/*  407: 464 */     if (i1 != 0)
/*  408:     */     {
/*  409: 465 */       this.b.a.a(new iw(localqt, localdt));
/*  410: 466 */       this.b.a.a(new iw(localqt, localdt.a(localej)));
/*  411:     */     }
/*  412: 469 */     localamj = this.b.bg.h();
/*  413: 470 */     if ((localamj != null) && (localamj.stackSize == 0))
/*  414:     */     {
/*  415: 471 */       this.b.bg.a[this.b.bg.c] = null;
/*  416: 472 */       localamj = null;
/*  417:     */     }
/*  418: 475 */     if ((localamj == null) || (localamj.l() == 0))
/*  419:     */     {
/*  420: 476 */       this.b.g = true;
/*  421: 477 */       this.b.bg.a[this.b.bg.c] = ItemStack.b(this.b.bg.a[this.b.bg.c]);
/*  422: 478 */       localObject = this.b.bi.a(this.b.bg, this.b.bg.c);
/*  423: 479 */       this.b.bi.b();
/*  424: 480 */       this.b.g = false;
/*  425: 482 */       if (!ItemStack.b(this.b.bg.h(), parammx.c())) {
/*  426: 483 */         a(new jh(this.b.bi.d, ((ajk)localObject).e, this.b.bg.h()));
/*  427:     */       }
/*  428:     */     }
/*  429:     */   }
/*  430:     */   
/*  431:     */   public void a(mw parammw)
/*  432:     */   {
/*  433: 490 */     ig.a(parammw, this, this.b.u());
/*  434: 491 */     if (this.b.v())
/*  435:     */     {
/*  436: 492 */       Entity localwv = null;
/*  437: 494 */       for (WorldServer localqt2 : this.d.c) {
/*  438: 495 */         if (localqt2 != null)
/*  439:     */         {
/*  440: 496 */           localwv = parammw.a(localqt2);
/*  441: 498 */           if (localwv != null) {
/*  442:     */             break;
/*  443:     */           }
/*  444:     */         }
/*  445:     */       }
/*  446: 504 */       if (localwv != null)
/*  447:     */       {
/*  448: 505 */         this.b.e(this.b);
/*  449: 506 */         this.b.mount((Entity)null);
/*  450: 508 */         if (localwv.world != this.b.world)
/*  451:     */         {
/*  452: 509 */           WorldServer localqt2 = this.b.u();
/*  453: 510 */           WorldServer localqt1 = (WorldServer)localwv.world;
/*  454:     */           
/*  455: 512 */           this.b.dimension = localwv.dimension;
/*  456: 513 */           a(new kp(this.b.dimension, localqt2.getDifficulty(), localqt2.getWorldInfo().u(), this.b.c.b()));
/*  457:     */           
/*  458: 515 */           localqt2.removeEntity(this.b);
/*  459: 516 */           this.b.isDead = false;
/*  460:     */           
/*  461: 518 */           this.b.setPositionAndAngles(localwv.xPos, localwv.yPos, localwv.zPos, localwv.yaw, localwv.pitch);
/*  462: 519 */           if (this.b.ai())
/*  463:     */           {
/*  464: 520 */             localqt2.a(this.b, false);
/*  465: 521 */             localqt1.spawnEntity(this.b);
/*  466: 522 */             localqt1.a(this.b, false);
/*  467:     */           }
/*  468: 525 */           this.b.a(localqt1);
/*  469:     */           
/*  470: 527 */           this.d.an().a(this.b, localqt2);
/*  471:     */           
/*  472: 529 */           this.b.setPosition(localwv.xPos, localwv.yPos, localwv.zPos);
/*  473: 530 */           this.b.c.a(localqt1);
/*  474: 531 */           this.d.an().b(this.b, localqt1);
/*  475: 532 */           this.d.an().f(this.b);
/*  476:     */         }
/*  477:     */         else
/*  478:     */         {
/*  479: 534 */           this.b.setPosition(localwv.xPos, localwv.yPos, localwv.zPos);
/*  480:     */         }
/*  481:     */       }
/*  482:     */     }
/*  483:     */   }
/*  484:     */   
/*  485:     */   public void a(mq parammq) {}
/*  486:     */   
/*  487:     */   public void a(ho paramho)
/*  488:     */   {
/*  489: 546 */     c.info(this.b.getName() + " lost connection: " + paramho);
/*  490: 547 */     this.d.aF();
/*  491: 548 */     hz localhz = new hz("multiplayer.player.left", new Object[] { this.b.e_() });
/*  492: 549 */     localhz.b().a(net.minecraft.src.a.o);
/*  493: 550 */     this.d.an().a(localhz);
/*  494: 551 */     this.b.q();
/*  495: 552 */     this.d.an().e(this.b);
/*  496: 554 */     if ((this.d.S()) && (this.b.getName().equals(this.d.R())))
/*  497:     */     {
/*  498: 555 */       c.info("Stopping singleplayer server as player logged out");
/*  499: 556 */       this.d.u();
/*  500:     */     }
/*  501:     */   }
/*  502:     */   
/*  503:     */   public void a(id paramid)
/*  504:     */   {
/*  505:     */     Object localObject;
/*  506: 561 */     if ((paramid instanceof iz))
/*  507:     */     {
/*  508: 562 */       iz localiz = (iz)paramid;
/*  509: 563 */       localObject = this.b.y();
/*  510: 565 */       if (localObject == ahg.HIDDEN) {
/*  511: 566 */         return;
/*  512:     */       }
/*  513: 568 */       if ((localObject == ahg.SYSTEM) && (!localiz.b())) {
/*  514: 569 */         return;
/*  515:     */       }
/*  516:     */     }
/*  517:     */     try
/*  518:     */     {
/*  519: 574 */       this.a.a(paramid);
/*  520:     */     }
/*  521:     */     catch (Throwable localThrowable)
/*  522:     */     {
/*  523: 576 */       localObject = net.minecraft.src.b.a(localThrowable, "Sending packet");
/*  524: 577 */       j localj = ((b)localObject).a("Packet being sent");
/*  525:     */       
/*  526: 579 */       localj.a("Packet class", new rm(this, paramid));
/*  527:     */       
/*  528:     */ 
/*  529:     */ 
/*  530:     */ 
/*  531:     */ 
/*  532:     */ 
/*  533: 586 */       throw new u((b)localObject);
/*  534:     */     }
/*  535:     */   }
/*  536:     */   
/*  537:     */   public void a(ms paramms)
/*  538:     */   {
/*  539: 592 */     ig.a(paramms, this, this.b.u());
/*  540: 593 */     if ((paramms.a() < 0) || (paramms.a() >= ahb.i()))
/*  541:     */     {
/*  542: 594 */       c.warn(this.b.getName() + " tried to set an invalid carried item");
/*  543: 595 */       return;
/*  544:     */     }
/*  545: 597 */     this.b.bg.c = paramms.a();
/*  546: 598 */     this.b.z();
/*  547:     */   }
/*  548:     */   
/*  549:     */   public void a(lu paramlu)
/*  550:     */   {
/*  551: 603 */     ig.a(paramlu, this, this.b.u());
/*  552: 604 */     if (this.b.y() == ahg.HIDDEN)
/*  553:     */     {
/*  554: 605 */       hz localObject = new hz("chat.cannotSend", new Object[0]);
/*  555: 606 */       ((hz)localObject).b().a(net.minecraft.src.a.m);
/*  556: 607 */       a(new iz((ho)localObject));
/*  557: 608 */       return;
/*  558:     */     }
/*  559: 610 */     this.b.z();
/*  560:     */     
/*  561: 612 */     Object localObject = paramlu.a();
/*  562: 613 */     localObject = StringUtils.normalizeSpace((String)localObject);
/*  563: 614 */     for (int i1 = 0; i1 < ((String)localObject).length(); i1++) {
/*  564: 615 */       if (!v.a(((String)localObject).charAt(i1)))
/*  565:     */       {
/*  566: 616 */         c("Illegal characters in chat");
/*  567: 617 */         return;
/*  568:     */       }
/*  569:     */     }
/*  570: 621 */     if (((String)localObject).startsWith("/"))
/*  571:     */     {
/*  572: 622 */       d((String)localObject);
/*  573:     */     }
/*  574:     */     else
/*  575:     */     {
/*  576: 624 */       hz localhz = new hz("chat.type.text", new Object[] { this.b.e_(), localObject });
/*  577: 625 */       this.d.an().a(localhz, false);
/*  578:     */     }
/*  579: 628 */     this.l += 20;
/*  580: 629 */     if ((this.l > 200) && (!this.d.an().g(this.b.cc()))) {
/*  581: 630 */       c("disconnect.spam");
/*  582:     */     }
/*  583:     */   }
/*  584:     */   
/*  585:     */   private void d(String paramString)
/*  586:     */   {
/*  587: 635 */     this.d.O().a(this.b, paramString);
/*  588:     */   }
/*  589:     */   
/*  590:     */   public void a(mv parammv)
/*  591:     */   {
/*  592: 640 */     ig.a(parammv, this, this.b.u());
/*  593: 641 */     this.b.z();
/*  594: 642 */     this.b.bv();
/*  595:     */   }
/*  596:     */   
/*  597:     */   public void a(mn parammn)
/*  598:     */   {
/*  599: 647 */     ig.a(parammn, this, this.b.u());
/*  600: 648 */     this.b.z();
/*  601: 649 */     switch (rn.b[parammn.b().ordinal()])
/*  602:     */     {
/*  603:     */     case 1: 
/*  604: 651 */       this.b.c(true);
/*  605: 652 */       break;
/*  606:     */     case 2: 
/*  607: 654 */       this.b.c(false);
/*  608: 655 */       break;
/*  609:     */     case 3: 
/*  610: 657 */       this.b.d(true);
/*  611: 658 */       break;
/*  612:     */     case 4: 
/*  613: 660 */       this.b.d(false);
/*  614: 661 */       break;
/*  615:     */     case 5: 
/*  616: 663 */       this.b.a(false, true, true);
/*  617: 664 */       this.r = false;
/*  618: 665 */       break;
/*  619:     */     case 6: 
/*  620: 668 */       if ((this.b.vehicle instanceof EntityHorse)) {
/*  621: 669 */         ((EntityHorse)this.b.vehicle).v(parammn.c());
/*  622:     */       }
/*  623:     */       break;
/*  624:     */     case 7: 
/*  625: 674 */       if ((this.b.vehicle instanceof EntityHorse)) {
/*  626: 675 */         ((EntityHorse)this.b.vehicle).g(this.b);
/*  627:     */       }
/*  628:     */       break;
/*  629:     */     default: 
/*  630: 679 */       throw new IllegalArgumentException("Invalid client command!");
/*  631:     */     }
/*  632:     */   }
/*  633:     */   
/*  634:     */   public void a(md parammd)
/*  635:     */   {
/*  636: 704 */     ig.a(parammd, this, this.b.u());
/*  637: 705 */     WorldServer localqt = this.d.a(this.b.dimension);
/*  638: 706 */     Entity localwv = parammd.a(localqt);
/*  639: 707 */     this.b.z();
/*  640: 709 */     if (localwv != null)
/*  641:     */     {
/*  642: 710 */       boolean bool = this.b.t(localwv);
/*  643: 711 */       double d1 = 36.0D;
/*  644: 712 */       if (!bool) {
/*  645: 713 */         d1 = 9.0D;
/*  646:     */       }
/*  647: 716 */       if (this.b.h(localwv) < d1) {
/*  648: 717 */         if (parammd.a() == me.a)
/*  649:     */         {
/*  650: 718 */           this.b.u(localwv);
/*  651:     */         }
/*  652: 719 */         else if (parammd.a() == me.c)
/*  653:     */         {
/*  654: 720 */           localwv.a(this.b, parammd.b());
/*  655:     */         }
/*  656: 721 */         else if (parammd.a() == me.b)
/*  657:     */         {
/*  658: 722 */           if (((localwv instanceof EntityItem)) || ((localwv instanceof EntityExperienceOrb)) || ((localwv instanceof ahj)) || (localwv == this.b))
/*  659:     */           {
/*  660: 723 */             c("Attempting to attack an invalid entity");
/*  661: 724 */             this.d.f("Player " + this.b.getName() + " tried to attack an invalid entity");
/*  662: 725 */             return;
/*  663:     */           }
/*  664: 728 */           this.b.f(localwv);
/*  665:     */         }
/*  666:     */       }
/*  667:     */     }
/*  668:     */   }
/*  669:     */   
/*  670:     */   public void a(lv paramlv)
/*  671:     */   {
/*  672: 736 */     ig.a(paramlv, this, this.b.u());
/*  673: 737 */     this.b.z();
/*  674: 738 */     lw locallw = paramlv.a();
/*  675: 739 */     switch (rn.c[locallw.ordinal()])
/*  676:     */     {
/*  677:     */     case 1: 
/*  678: 741 */       if (this.b.i)
/*  679:     */       {
/*  680: 742 */         this.b = this.d.an().a(this.b, 0, true);
/*  681:     */       }
/*  682: 743 */       else if (this.b.u().getWorldInfo().isHardcore())
/*  683:     */       {
/*  684: 744 */         if ((this.d.S()) && (this.b.getName().equals(this.d.R())))
/*  685:     */         {
/*  686: 745 */           this.b.a.c("You have died. Game over, man, it's game over!");
/*  687: 746 */           this.d.Z();
/*  688:     */         }
/*  689:     */         else
/*  690:     */         {
/*  691: 748 */           sw localsw = new sw(this.b.cc(), null, "(You just lost the game)", null, "Death in Hardcore");
/*  692:     */           
/*  693: 750 */           this.d.an().i().a(localsw);
/*  694: 751 */           this.b.a.c("You have died. Game over, man, it's game over!");
/*  695:     */         }
/*  696:     */       }
/*  697:     */       else
/*  698:     */       {
/*  699: 754 */         if (this.b.getHealth() > 0.0F) {
/*  700: 755 */           return;
/*  701:     */         }
/*  702: 757 */         this.b = this.d.an().a(this.b, 0, false);
/*  703:     */       }
/*  704: 759 */       break;
/*  705:     */     case 2: 
/*  706: 761 */       this.b.A().a(this.b);
/*  707: 762 */       break;
/*  708:     */     case 3: 
/*  709: 764 */       this.b.b(AchievementList.f);
/*  710:     */     }
/*  711:     */   }
/*  712:     */   
/*  713:     */   public void a(mb parammb)
/*  714:     */   {
/*  715: 771 */     ig.a(parammb, this, this.b.u());
/*  716: 772 */     this.b.p();
/*  717:     */   }
/*  718:     */   
/*  719:     */   public void a(ma paramma)
/*  720:     */   {
/*  721: 777 */     ig.a(paramma, this, this.b.u());
/*  722: 778 */     this.b.z();
/*  723: 779 */     if ((this.b.bi.d == paramma.a()) && (this.b.bi.c(this.b)))
/*  724:     */     {
/*  725:     */       
/*  726: 780 */       if (this.b.v())
/*  727:     */       {
/*  728: 781 */         List<ItemStack>localObject = Lists.newArrayList();
/*  729: 782 */         for (int i1 = 0; i1 < this.b.bi.c.size(); i1++) {
/*  730: 783 */           localObject.add(this.b.bi.c.get(i1).d());
/*  731:     */         }
/*  732: 785 */         this.b.a(this.b.bi, localObject);
/*  733:     */       }
/*  734:     */       else
/*  735:     */       {
/*  736: 787 */         ItemStack localObject = this.b.bi.a(paramma.b(), paramma.c(), paramma.f(), this.b);
/*  737: 789 */         if (ItemStack.b(paramma.e(), localObject))
/*  738:     */         {
/*  739: 791 */           this.b.a.a(new jc(paramma.a(), paramma.d(), true));
/*  740: 792 */           this.b.g = true;
/*  741: 793 */           this.b.bi.b();
/*  742: 794 */           this.b.o();
/*  743: 795 */           this.b.g = false;
/*  744:     */         }
/*  745:     */         else
/*  746:     */         {
/*  747: 798 */           this.n.a(this.b.bi.d, Short.valueOf(paramma.d()));
/*  748: 799 */           this.b.a.a(new jc(paramma.a(), paramma.d(), false));
/*  749: 800 */           this.b.bi.a(this.b, false);
/*  750:     */           
/*  751: 802 */           ArrayList localArrayList = Lists.newArrayList();
/*  752: 803 */           for (int i2 = 0; i2 < this.b.bi.c.size(); i2++) {
/*  753: 804 */             localArrayList.add(((ajk)this.b.bi.c.get(i2)).d());
/*  754:     */           }
/*  755: 806 */           this.b.a(this.b.bi, localArrayList);
/*  756:     */         }
/*  757:     */       }
/*  758:     */     }
/*  759:     */   }
/*  760:     */   
/*  761:     */   public void a(lz paramlz)
/*  762:     */   {
/*  763: 814 */     ig.a(paramlz, this, this.b.u());
/*  764: 815 */     this.b.z();
/*  765: 816 */     if ((this.b.bi.d == paramlz.a()) && (this.b.bi.c(this.b)) && (!this.b.v()))
/*  766:     */     {
/*  767: 817 */       this.b.bi.a(this.b, paramlz.b());
/*  768: 818 */       this.b.bi.b();
/*  769:     */     }
/*  770:     */   }
/*  771:     */   
/*  772:     */   public void a(mt parammt)
/*  773:     */   {
/*  774: 824 */     ig.a(parammt, this, this.b.u());
/*  775: 825 */     if (this.b.c.d())
/*  776:     */     {
/*  777: 826 */       int i1 = parammt.a() < 0 ? 1 : 0;
/*  778: 827 */       ItemStack localamj = parammt.b();
/*  779:     */       Object localObject;
/*  780: 829 */       if ((localamj != null) && (localamj.hasTagCompound()) && (localamj.getTagCompound().hasKey("BlockEntityTag", 10)))
/*  781:     */       {
/*  782: 830 */         NBTTagCompound localfn = localamj.getTagCompound().getCompoundTag("BlockEntityTag");
/*  783: 831 */         if ((localfn.c("x")) && (localfn.c("y")) && (localfn.c("z")))
/*  784:     */         {
/*  785: 832 */           BlockPosition localdt = new BlockPosition(localfn.getInteger("x"), localfn.getInteger("y"), localfn.getInteger("z"));
/*  786: 833 */           bcm localbcm = this.b.world.s(localdt);
/*  787: 834 */           if (localbcm != null)
/*  788:     */           {
/*  789: 835 */             localObject = new NBTTagCompound();
/*  790: 836 */             localbcm.writeToNBT((NBTTagCompound)localObject);
/*  791: 837 */             ((NBTTagCompound)localObject).o("x");
/*  792: 838 */             ((NBTTagCompound)localObject).o("y");
/*  793: 839 */             ((NBTTagCompound)localObject).o("z");
/*  794: 840 */             localamj.a("BlockEntityTag", (NBTBase)localObject);
/*  795:     */           }
/*  796:     */         }
/*  797:     */       }
/*  798: 845 */       int i2 = (parammt.a() >= 1) && (parammt.a() < 36 + ahb.i()) ? 1 : 0;
/*  799: 846 */       int i3 = (localamj == null) || (localamj.getItem() != null) ? 1 : 0;
/*  800: 847 */       int i4 = (localamj == null) || ((localamj.getDamage2() >= 0) && (localamj.stackSize <= 64) && (localamj.stackSize > 0)) ? 1 : 0;
/*  801: 849 */       if ((i2 != 0) && (i3 != 0) && (i4 != 0))
/*  802:     */       {
/*  803: 850 */         if (localamj == null) {
/*  804: 851 */           this.b.bh.a(parammt.a(), (ItemStack)null);
/*  805:     */         } else {
/*  806: 853 */           this.b.bh.a(parammt.a(), localamj);
/*  807:     */         }
/*  808: 855 */         this.b.bh.a(this.b, true);
/*  809:     */       }
/*  810: 856 */       else if ((i1 != 0) && (i3 != 0) && (i4 != 0) && 
/*  811: 857 */         (this.m < 200))
/*  812:     */       {
/*  813: 858 */         this.m += 20;
/*  814:     */         
/*  815: 860 */         localObject = this.b.a(localamj, true);
/*  816: 861 */         if (localObject != null) {
/*  817: 862 */           ((EntityItem)localObject).j();
/*  818:     */         }
/*  819:     */       }
/*  820:     */     }
/*  821:     */   }
/*  822:     */   
/*  823:     */   public void a(ly paramly)
/*  824:     */   {
/*  825: 871 */     ig.a(paramly, this, this.b.u());
/*  826: 872 */     Short localShort = (Short)this.n.a(this.b.bi.d);
/*  827: 873 */     if ((localShort != null) && (paramly.b() == localShort.shortValue()) && (this.b.bi.d == paramly.a()) && (!this.b.bi.c(this.b)) && (!this.b.v())) {
/*  828: 874 */       this.b.bi.a(this.b, true);
/*  829:     */     }
/*  830:     */   }
/*  831:     */   
/*  832:     */   public void a(mu parammu)
/*  833:     */   {
/*  834: 880 */     ig.a(parammu, this, this.b.u());
/*  835: 881 */     this.b.z();
/*  836: 882 */     WorldServer localqt = this.d.a(this.b.dimension);
/*  837: 883 */     BlockPosition localdt = parammu.a();
/*  838: 884 */     if (localqt.e(localdt))
/*  839:     */     {
/*  840: 885 */       bcm localbcm = localqt.s(localdt);
/*  841: 887 */       if (!(localbcm instanceof bdj)) {
/*  842: 888 */         return;
/*  843:     */       }
/*  844: 891 */       bdj localbdj = (bdj)localbcm;
/*  845: 892 */       if ((!localbdj.b()) || (localbdj.c() != this.b))
/*  846:     */       {
/*  847: 893 */         this.d.f("Player " + this.b.getName() + " just tried to change non-editable sign");
/*  848: 894 */         return;
/*  849:     */       }
/*  850: 897 */       System.arraycopy(parammu.b(), 0, localbdj.a, 0, 4);
/*  851: 898 */       localbdj.o_();
/*  852: 899 */       localqt.h(localdt);
/*  853:     */     }
/*  854:     */   }
/*  855:     */   
/*  856:     */   public void a(mf parammf)
/*  857:     */   {
/*  858: 905 */     if (parammf.a() == this.i)
/*  859:     */     {
/*  860: 906 */       int i1 = (int)(d() - this.j);
/*  861: 907 */       this.b.h = ((this.b.h * 3 + i1) / 4);
/*  862:     */     }
/*  863:     */   }
/*  864:     */   
/*  865:     */   private long d()
/*  866:     */   {
/*  867: 912 */     return System.nanoTime() / 1000000L;
/*  868:     */   }
/*  869:     */   
/*  870:     */   public void a(mk parammk)
/*  871:     */   {
/*  872: 917 */     ig.a(parammk, this, this.b.u());
/*  873: 918 */     this.b.by.b = ((parammk.b()) && (this.b.by.c));
/*  874:     */   }
/*  875:     */   
/*  876:     */   public void a(lt paramlt)
/*  877:     */   {
/*  878: 923 */     ig.a(paramlt, this, this.b.u());
/*  879: 924 */     ArrayList<String> localArrayList = Lists.newArrayList();
/*  880: 926 */     for (String str : this.d.a(this.b, paramlt.a(), paramlt.b())) {
/*  881: 927 */       localArrayList.add(str);
/*  882:     */     }
/*  883: 930 */     this.b.a.a(new iy((String[])localArrayList.toArray(new String[localArrayList.size()])));
/*  884:     */   }
/*  885:     */   
/*  886:     */   public void a(lx paramlx)
/*  887:     */   {
/*  888: 935 */     ig.a(paramlx, this, this.b.u());
/*  889: 936 */     this.b.a(paramlx);
/*  890:     */   }
/*  891:     */   
/*  892:     */   public void a(mc parammc)
/*  893:     */   {
/*  894: 941 */     ig.a(parammc, this, this.b.u());
/*  895:     */     ByteBufWrapper localhd1;
/*  896:     */     Object localObject1;
/*  897: 942 */     if ("MC|BEdit".equals(parammc.a()))
/*  898:     */     {
/*  899: 943 */       localhd1 = new ByteBufWrapper(Unpooled.wrappedBuffer(parammc.b()));
/*  900:     */       try
/*  901:     */       {
/*  902: 945 */         ItemStack localamj1 = localhd1.i();
/*  903: 946 */         if (localamj1 == null) {
/*  904:     */           return;
/*  905:     */         }
/*  906: 950 */         if (!anq.b(localamj1.getTagCompound())) {
/*  907: 951 */           throw new IOException("Invalid book tag!");
/*  908:     */         }
/*  909: 955 */         localObject1 = this.b.bg.h();
/*  910: 956 */         if (localObject1 == null) {
/*  911:     */           return;
/*  912:     */         }
/*  913: 959 */         if ((localamj1.getItem() == ItemList.bM) && (localamj1.getItem() == ((ItemStack)localObject1).getItem())) {
/*  914: 960 */           ((ItemStack)localObject1).a("pages", localamj1.getTagCompound().c("pages", 8));
/*  915:     */         }
/*  916:     */       }
/*  917:     */       catch (Exception localException3)
/*  918:     */       {
/*  919: 963 */         c.error("Couldn't handle book info", localException3);
/*  920:     */       }
/*  921:     */       finally
/*  922:     */       {
/*  923: 965 */         localhd1.release();
/*  924:     */       }
/*  925:     */     }
/*  926: 967 */     else if ("MC|BSign".equals(parammc.a()))
/*  927:     */     {
/*  928: 968 */       localhd1 = new ByteBufWrapper(Unpooled.wrappedBuffer(parammc.b()));
/*  929:     */       try
/*  930:     */       {
/*  931: 970 */         ItemStack localamj2 = localhd1.i();
/*  932: 971 */         if (localamj2 == null) {
/*  933:     */           return;
/*  934:     */         }
/*  935: 975 */         if (!anr.b(localamj2.getTagCompound())) {
/*  936: 976 */           throw new IOException("Invalid book tag!");
/*  937:     */         }
/*  938: 980 */         localObject1 = this.b.bg.h();
/*  939: 981 */         if (localObject1 == null) {
/*  940:     */           return;
/*  941:     */         }
/*  942: 984 */         if ((localamj2.getItem() == ItemList.bN) && (((ItemStack)localObject1).getItem() == ItemList.bM))
/*  943:     */         {
/*  944: 985 */           ((ItemStack)localObject1).a("author", new gc(this.b.getName()));
/*  945: 986 */           ((ItemStack)localObject1).a("title", new gc(localamj2.getTagCompound().getString("title")));
/*  946: 987 */           ((ItemStack)localObject1).a("pages", localamj2.getTagCompound().c("pages", 8));
/*  947: 988 */           ((ItemStack)localObject1).a(ItemList.bN);
/*  948:     */         }
/*  949:     */       }
/*  950:     */       catch (Exception localException4)
/*  951:     */       {
/*  952: 991 */         c.error("Couldn't sign book", localException4);
/*  953:     */       }
/*  954:     */       finally
/*  955:     */       {
/*  956: 993 */         localhd1.release();
/*  957:     */       }
/*  958:     */     }
/*  959: 995 */     else if ("MC|TrSel".equals(parammc.a()))
/*  960:     */     {
/*  961:     */       try
/*  962:     */       {
/*  963: 997 */         int i1 = parammc.b().readInt();
/*  964: 998 */         aib localaib = this.b.bi;
/*  965: 999 */         if ((localaib instanceof ajf)) {
/*  966:1000 */           ((ajf)localaib).d(i1);
/*  967:     */         }
/*  968:     */       }
/*  969:     */       catch (Exception localException1)
/*  970:     */       {
/*  971:1003 */         c.error("Couldn't select trade", localException1);
/*  972:     */       }
/*  973:     */     }
/*  974:     */     else
/*  975:     */     {
/*  976:     */       ByteBufWrapper localhd2;
/*  977:     */       Object localObject3;
/*  978:1005 */       if ("MC|AdvCdm".equals(parammc.a()))
/*  979:     */       {
/*  980:1006 */         if (!this.d.aj())
/*  981:     */         {
/*  982:1007 */           this.b.a(new hz("advMode.notEnabled", new Object[0]));
/*  983:     */         }
/*  984:1008 */         else if ((this.b.a(2, "")) && (this.b.by.d))
/*  985:     */         {
/*  986:1009 */           localhd2 = parammc.b();
/*  987:     */           try
/*  988:     */           {
/*  989:1011 */             int i2 = localhd2.readByte();
/*  990:1012 */             localObject1 = null;
/*  991:1014 */             if (i2 == 0)
/*  992:     */             {
/*  993:1015 */               localObject3 = this.b.world.s(new BlockPosition(localhd2.readInt(), localhd2.readInt(), localhd2.readInt()));
/*  994:1016 */               if ((localObject3 instanceof bct)) {
/*  995:1017 */                 localObject1 = ((bct)localObject3).b();
/*  996:     */               }
/*  997:     */             }
/*  998:1019 */             else if (i2 == 1)
/*  999:     */             {
/* 1000:1020 */               localObject3 = this.b.world.a(localhd2.readInt());
/* 1001:1022 */               if ((localObject3 instanceof aeb)) {
/* 1002:1023 */                 localObject1 = ((aeb)localObject3).j();
/* 1003:     */               }
/* 1004:     */             }
/* 1005:1027 */             localObject3 = localhd2.c(localhd2.readableBytes());
/* 1006:1028 */             boolean bool = localhd2.readBoolean();
/* 1007:1030 */             if (localObject1 != null)
/* 1008:     */             {
/* 1009:1031 */               ((aqf)localObject1).a((String)localObject3);
/* 1010:1032 */               ((aqf)localObject1).a(bool);
/* 1011:1033 */               if (!bool) {
/* 1012:1034 */                 ((aqf)localObject1).b((ho)null);
/* 1013:     */               }
/* 1014:1036 */               ((aqf)localObject1).h();
/* 1015:1037 */               this.b.a(new hz("advMode.setCommand.success", new Object[] { localObject3 }));
/* 1016:     */             }
/* 1017:     */           }
/* 1018:     */           catch (Exception localException5)
/* 1019:     */           {
/* 1020:1040 */             c.error("Couldn't set command block", localException5);
/* 1021:     */           }
/* 1022:     */           finally
/* 1023:     */           {
/* 1024:1042 */             localhd2.release();
/* 1025:     */           }
/* 1026:     */         }
/* 1027:     */         else
/* 1028:     */         {
/* 1029:1045 */           this.b.a(new hz("advMode.notAllowed", new Object[0]));
/* 1030:     */         }
/* 1031:     */       }
/* 1032:1047 */       else if ("MC|Beacon".equals(parammc.a()))
/* 1033:     */       {
/* 1034:1048 */         if ((this.b.bi instanceof aig)) {
/* 1035:     */           try
/* 1036:     */           {
/* 1037:1050 */             localhd2 = parammc.b();
/* 1038:1051 */             int i3 = localhd2.readInt();
/* 1039:1052 */             int i4 = localhd2.readInt();
/* 1040:     */             
/* 1041:1054 */             localObject3 = (aig)this.b.bi;
/* 1042:1055 */             ajk localajk = ((aig)localObject3).a(0);
/* 1043:1056 */             if (localajk.e())
/* 1044:     */             {
/* 1045:1057 */               localajk.a(1);
/* 1046:1058 */               vq localvq = ((aig)localObject3).e();
/* 1047:1059 */               localvq.b(1, i3);
/* 1048:1060 */               localvq.b(2, i4);
/* 1049:1061 */               localvq.o_();
/* 1050:     */             }
/* 1051:     */           }
/* 1052:     */           catch (Exception localException2)
/* 1053:     */           {
/* 1054:1064 */             c.error("Couldn't set beacon", localException2);
/* 1055:     */           }
/* 1056:     */         }
/* 1057:     */       }
/* 1058:1067 */       else if (("MC|ItemName".equals(parammc.a())) && 
/* 1059:1068 */         ((this.b.bi instanceof aid)))
/* 1060:     */       {
/* 1061:1069 */         aid localaid = (aid)this.b.bi;
/* 1062:1071 */         if ((parammc.b() == null) || (parammc.b().readableBytes() < 1))
/* 1063:     */         {
/* 1064:1072 */           localaid.a("");
/* 1065:     */         }
/* 1066:     */         else
/* 1067:     */         {
/* 1068:1074 */           String str = v.a(parammc.b().c(32767));
/* 1069:1075 */           if (str.length() <= 30) {
/* 1070:1076 */             localaid.a(str);
/* 1071:     */           }
/* 1072:     */         }
/* 1073:     */       }
/* 1074:     */     }
/* 1075:     */   }
/* 1076:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     rj
 * JD-Core Version:    0.7.0.1
 */
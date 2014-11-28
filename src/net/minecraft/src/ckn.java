package net.minecraft.src;
/*    1:     */ import com.google.common.collect.Lists;
/*    2:     */ import com.google.common.collect.Maps;
/*    3:     */ import com.google.common.collect.Sets;
/*    4:     */ import com.google.gson.JsonSyntaxException;
/*    5:     */ import java.io.IOException;
/*    6:     */ import java.util.Collection;
/*    7:     */ import java.util.Iterator;
/*    8:     */ import java.util.List;
/*    9:     */ import java.util.Map;
/*   10:     */ import java.util.Queue;
/*   11:     */ import java.util.Random;
/*   12:     */ import java.util.Set;
/*   13:     */ import javax.vecmath.Matrix4f;
/*   14:     */ import javax.vecmath.Vector3d;
/*   15:     */ import javax.vecmath.Vector3f;
/*   16:     */ import javax.vecmath.Vector4f;
/*   17:     */ import org.apache.logging.log4j.LogManager;
/*   18:     */ import org.apache.logging.log4j.Logger;
/*   19:     */ import org.lwjgl.opengl.GL11;
/*   20:     */ 
/*   21:     */ public class ckn
/*   22:     */   implements IWorldAccess, cvl
/*   23:     */ {
/*   24:  86 */   private static final Logger b = LogManager.getLogger();
/*   25:  97 */   private static final oa c = new oa("textures/environment/moon_phases.png");
/*   26:  98 */   private static final oa d = new oa("textures/environment/sun.png");
/*   27:  99 */   private static final oa e = new oa("textures/environment/clouds.png");
/*   28: 100 */   private static final oa f = new oa("textures/environment/end_sky.png");
/*   29: 101 */   private static final oa g = new oa("textures/misc/forcefield.png");
/*   30:     */   private final bsu h;
/*   31:     */   private final cug i;
/*   32:     */   private final cpt j;
/*   33:     */   private cen k;
/*   34: 112 */   private Set l = Sets.newLinkedHashSet();
/*   35: 113 */   private List<ckq> m = Lists.newArrayListWithCapacity(69696);
/*   36:     */   private cla n;
/*   37: 117 */   private int o = -1;
/*   38: 118 */   private int p = -1;
/*   39: 119 */   private int q = -1;
/*   40:     */   private VertexFormat r;
/*   41:     */   private cur s;
/*   42:     */   private cur t;
/*   43:     */   private cur u;
/*   44:     */   private int v;
/*   45: 127 */   private final Map w = Maps.newHashMap();
/*   46: 128 */   private final Map x = Maps.newHashMap();
/*   47: 129 */   private final cue[] y = new cue[10];
/*   48:     */   private ckw z;
/*   49:     */   private ctg A;
/*   50: 134 */   private double B = 4.9E-324D;
/*   51: 135 */   private double C = 4.9E-324D;
/*   52: 136 */   private double D = 4.9E-324D;
/*   53: 138 */   private int E = -2147483648;
/*   54: 139 */   private int F = -2147483648;
/*   55: 140 */   private int G = -2147483648;
/*   56: 142 */   private double H = 4.9E-324D;
/*   57: 143 */   private double I = 4.9E-324D;
/*   58: 144 */   private double J = 4.9E-324D;
/*   59: 145 */   private double K = 4.9E-324D;
/*   60: 146 */   private double L = 4.9E-324D;
/*   61: 148 */   private final cod M = new cod();
/*   62:     */   private cjc N;
/*   63: 152 */   private int O = -1;
/*   64: 154 */   private int P = 2;
/*   65:     */   private int Q;
/*   66:     */   private int R;
/*   67:     */   private int S;
/*   68: 160 */   private boolean T = false;
/*   69:     */   private cpa U;
/*   70: 162 */   private final Vector4f[] V = new Vector4f[8];
/*   71: 163 */   private final Vector3d W = new Vector3d();
/*   72: 165 */   private boolean X = false;
/*   73:     */   coq a;
/*   74:     */   private double Y;
/*   75:     */   private double Z;
/*   76:     */   private double aa;
/*   77: 172 */   private boolean ab = true;
/*   78:     */   
/*   79:     */   public ckn(bsu parambsu)
/*   80:     */   {
/*   81: 175 */     this.h = parambsu;
/*   82: 176 */     this.j = parambsu.ae();
/*   83:     */     
/*   84: 178 */     this.i = parambsu.N();
/*   85:     */     
/*   86: 180 */     this.i.a(g);
/*   87: 181 */     GL11.glTexParameteri(3553, 10242, 10497);
/*   88: 182 */     GL11.glTexParameteri(3553, 10243, 10497);
/*   89: 183 */     cjm.i(0);
/*   90:     */     
/*   91: 185 */     n();
/*   92:     */     
/*   93: 187 */     this.X = dax.f();
/*   94: 188 */     if (this.X)
/*   95:     */     {
/*   96: 189 */       this.N = new cky();
/*   97: 190 */       this.a = new cor();
/*   98:     */     }
/*   99:     */     else
/*  100:     */     {
/*  101: 192 */       this.N = new cks();
/*  102: 193 */       this.a = new com();
/*  103:     */     }
/*  104: 196 */     this.r = new VertexFormat();
/*  105: 197 */     this.r.addElement(new VertexElement(0, cuv.FLOAT, EnumVertexElementType.POSITION, 3));
/*  106:     */     
/*  107: 199 */     q();
/*  108: 200 */     p();
/*  109: 201 */     o();
/*  110:     */   }
/*  111:     */   
/*  112:     */   public void a(cvk paramcvk)
/*  113:     */   {
/*  114: 206 */     n();
/*  115:     */   }
/*  116:     */   
/*  117:     */   private void n()
/*  118:     */   {
/*  119: 210 */     cua localcua = this.h.R();
/*  120: 211 */     for (int i1 = 0; i1 < this.y.length; i1++) {
/*  121: 212 */       this.y[i1] = localcua.a("minecraft:blocks/destroy_stage_" + i1);
/*  122:     */     }
/*  123:     */   }
/*  124:     */   
/*  125:     */   public void b()
/*  126:     */   {
/*  127: 217 */     if (dax.N)
/*  128:     */     {
/*  129: 218 */       if (ctk.b() == null) {
/*  130: 219 */         ctk.a();
/*  131:     */       }
/*  132: 221 */       oa localoa = new oa("shaders/post/entity_outline.json");
/*  133:     */       try
/*  134:     */       {
/*  135: 223 */         this.A = new ctg(this.h.N(), this.h.O(), this.h.b(), localoa);
/*  136: 224 */         this.A.a(this.h.d, this.h.e);
/*  137: 225 */         this.z = this.A.a("final");
/*  138:     */       }
/*  139:     */       catch (IOException localIOException)
/*  140:     */       {
/*  141: 227 */         b.warn("Failed to load shader: " + localoa, localIOException);
/*  142: 228 */         this.A = null;
/*  143: 229 */         this.z = null;
/*  144:     */       }
/*  145:     */       catch (JsonSyntaxException localJsonSyntaxException)
/*  146:     */       {
/*  147: 231 */         b.warn("Failed to load shader: " + localoa, localJsonSyntaxException);
/*  148: 232 */         this.A = null;
/*  149: 233 */         this.z = null;
/*  150:     */       }
/*  151:     */     }
/*  152:     */     else
/*  153:     */     {
/*  154: 236 */       this.A = null;
/*  155: 237 */       this.z = null;
/*  156:     */     }
/*  157:     */   }
/*  158:     */   
/*  159:     */   public void c()
/*  160:     */   {
/*  161: 242 */     if (d())
/*  162:     */     {
/*  163: 243 */       cjm.enableBlend();
/*  164: 244 */       cjm.glBlendFuncSeparate(770, 771, 0, 1);
/*  165: 245 */       this.z.a(this.h.d, this.h.e, false);
/*  166: 246 */       cjm.disableBlend();
/*  167:     */     }
/*  168:     */   }
/*  169:     */   
/*  170:     */   protected boolean d()
/*  171:     */   {
/*  172: 251 */     return (this.z != null) && (this.A != null) && (this.h.h != null) && (this.h.h.v()) && (this.h.t.an.d());
/*  173:     */   }
/*  174:     */   
/*  175:     */   private void o()
/*  176:     */   {
/*  177: 255 */     ckx localckx = ckx.getInstance();
/*  178: 256 */     VertexBuffer localciv = localckx.getBuffer();
/*  179: 258 */     if (this.u != null) {
/*  180: 259 */       this.u.c();
/*  181:     */     }
/*  182: 261 */     if (this.q >= 0)
/*  183:     */     {
/*  184: 262 */       bst.b(this.q);
/*  185: 263 */       this.q = -1;
/*  186:     */     }
/*  187: 266 */     if (this.X)
/*  188:     */     {
/*  189: 267 */       this.u = new cur(this.r);
/*  190: 268 */       a(localciv, -16.0F, true);
/*  191: 269 */       localciv.d();
/*  192: 270 */       localciv.clear();
/*  193: 271 */       this.u.a(localciv.f(), localciv.e());
/*  194:     */     }
/*  195:     */     else
/*  196:     */     {
/*  197: 273 */       this.q = bst.a(1);
/*  198: 274 */       GL11.glNewList(this.q, 4864);
/*  199: 275 */       a(localciv, -16.0F, true);
/*  200: 276 */       localckx.draw();
/*  201: 277 */       GL11.glEndList();
/*  202:     */     }
/*  203:     */   }
/*  204:     */   
/*  205:     */   private void p()
/*  206:     */   {
/*  207: 282 */     ckx localckx = ckx.getInstance();
/*  208: 283 */     VertexBuffer localciv = localckx.getBuffer();
/*  209: 285 */     if (this.t != null) {
/*  210: 286 */       this.t.c();
/*  211:     */     }
/*  212: 288 */     if (this.p >= 0)
/*  213:     */     {
/*  214: 289 */       bst.b(this.p);
/*  215: 290 */       this.p = -1;
/*  216:     */     }
/*  217: 293 */     if (this.X)
/*  218:     */     {
/*  219: 294 */       this.t = new cur(this.r);
/*  220: 295 */       a(localciv, 16.0F, false);
/*  221: 296 */       localciv.d();
/*  222: 297 */       localciv.clear();
/*  223: 298 */       this.t.a(localciv.f(), localciv.e());
/*  224:     */     }
/*  225:     */     else
/*  226:     */     {
/*  227: 300 */       this.p = bst.a(1);
/*  228: 301 */       GL11.glNewList(this.p, 4864);
/*  229: 302 */       a(localciv, 16.0F, false);
/*  230: 303 */       localckx.draw();
/*  231: 304 */       GL11.glEndList();
/*  232:     */     }
/*  233:     */   }
/*  234:     */   
/*  235:     */   private void a(VertexBuffer paramciv, float paramFloat, boolean paramBoolean)
/*  236:     */   {
/*  237: 309 */     int i1 = 64;
/*  238: 310 */     int i2 = 6;
/*  239: 311 */     paramciv.begin();
/*  240: 312 */     for (int i3 = -384; i3 <= 384; i3 += 64) {
/*  241: 313 */       for (int i4 = -384; i4 <= 384; i4 += 64)
/*  242:     */       {
/*  243: 314 */         float f1 = i3;
/*  244: 315 */         float f2 = i3 + 64;
/*  245: 316 */         if (paramBoolean)
/*  246:     */         {
/*  247: 317 */           f2 = i3;
/*  248: 318 */           f1 = i3 + 64;
/*  249:     */         }
/*  250: 320 */         paramciv.setColor(f1, paramFloat, i4);
/*  251: 321 */         paramciv.setColor(f2, paramFloat, i4);
/*  252: 322 */         paramciv.setColor(f2, paramFloat, i4 + 64);
/*  253: 323 */         paramciv.setColor(f1, paramFloat, i4 + 64);
/*  254:     */       }
/*  255:     */     }
/*  256:     */   }
/*  257:     */   
/*  258:     */   private void q()
/*  259:     */   {
/*  260: 329 */     ckx localckx = ckx.getInstance();
/*  261: 330 */     VertexBuffer localciv = localckx.getBuffer();
/*  262: 332 */     if (this.s != null) {
/*  263: 333 */       this.s.c();
/*  264:     */     }
/*  265: 335 */     if (this.o >= 0)
/*  266:     */     {
/*  267: 336 */       bst.b(this.o);
/*  268: 337 */       this.o = -1;
/*  269:     */     }
/*  270: 340 */     if (this.X)
/*  271:     */     {
/*  272: 341 */       this.s = new cur(this.r);
/*  273: 342 */       a(localciv);
/*  274: 343 */       localciv.d();
/*  275: 344 */       localciv.clear();
/*  276: 345 */       this.s.a(localciv.f(), localciv.e());
/*  277:     */     }
/*  278:     */     else
/*  279:     */     {
/*  280: 347 */       this.o = bst.a(1);
/*  281:     */       
/*  282: 349 */       cjm.glPushMatrix();
/*  283: 350 */       GL11.glNewList(this.o, 4864);
/*  284:     */       
/*  285: 352 */       a(localciv);
/*  286: 353 */       localckx.draw();
/*  287:     */       
/*  288: 355 */       GL11.glEndList();
/*  289: 356 */       cjm.glPopMatrix();
/*  290:     */     }
/*  291:     */   }
/*  292:     */   
/*  293:     */   private void a(VertexBuffer paramciv)
/*  294:     */   {
/*  295: 361 */     Random localRandom = new Random(10842L);
/*  296:     */     
/*  297: 363 */     paramciv.begin();
/*  298: 364 */     for (int i1 = 0; i1 < 1500; i1++)
/*  299:     */     {
/*  300: 365 */       double d1 = localRandom.nextFloat() * 2.0F - 1.0F;
/*  301: 366 */       double d2 = localRandom.nextFloat() * 2.0F - 1.0F;
/*  302: 367 */       double d3 = localRandom.nextFloat() * 2.0F - 1.0F;
/*  303: 368 */       double d4 = 0.15F + localRandom.nextFloat() * 0.1F;
/*  304: 369 */       double d5 = d1 * d1 + d2 * d2 + d3 * d3;
/*  305: 370 */       if ((d5 < 1.0D) && (d5 > 0.01D))
/*  306:     */       {
/*  307: 371 */         d5 = 1.0D / Math.sqrt(d5);
/*  308: 372 */         d1 *= d5;
/*  309: 373 */         d2 *= d5;
/*  310: 374 */         d3 *= d5;
/*  311: 375 */         double d6 = d1 * 100.0D;
/*  312: 376 */         double d7 = d2 * 100.0D;
/*  313: 377 */         double d8 = d3 * 100.0D;
/*  314:     */         
/*  315: 379 */         double d9 = Math.atan2(d1, d3);
/*  316: 380 */         double d10 = Math.sin(d9);
/*  317: 381 */         double d11 = Math.cos(d9);
/*  318:     */         
/*  319: 383 */         double d12 = Math.atan2(Math.sqrt(d1 * d1 + d3 * d3), d2);
/*  320: 384 */         double d13 = Math.sin(d12);
/*  321: 385 */         double d14 = Math.cos(d12);
/*  322:     */         
/*  323: 387 */         double d15 = localRandom.nextDouble() * 3.141592653589793D * 2.0D;
/*  324: 388 */         double d16 = Math.sin(d15);
/*  325: 389 */         double d17 = Math.cos(d15);
/*  326: 391 */         for (int i2 = 0; i2 < 4; i2++)
/*  327:     */         {
/*  328: 392 */           double d18 = 0.0D;
/*  329: 393 */           double d19 = ((i2 & 0x2) - 1) * d4;
/*  330: 394 */           double d20 = ((i2 + 1 & 0x2) - 1) * d4;
/*  331:     */           
/*  332: 396 */           double d21 = 0.0D;
/*  333: 397 */           double d22 = d19 * d17 - d20 * d16;
/*  334: 398 */           double d23 = d20 * d17 + d19 * d16;
/*  335:     */           
/*  336: 400 */           double d24 = d23;
/*  337: 401 */           double d25 = d22 * d13 + 0.0D * d14;
/*  338: 402 */           double d26 = 0.0D * d13 - d22 * d14;
/*  339:     */           
/*  340: 404 */           double d27 = d26 * d10 - d24 * d11;
/*  341: 405 */           double d28 = d25;
/*  342: 406 */           double d29 = d24 * d10 + d26 * d11;
/*  343:     */           
/*  344: 408 */           paramciv.addVertex(d6 + d27, d7 + d28, d8 + d29);
/*  345:     */         }
/*  346:     */       }
/*  347:     */     }
/*  348:     */   }
/*  349:     */   
/*  350:     */   public void a(cen paramcen)
/*  351:     */   {
/*  352: 415 */     if (this.k != null) {
/*  353: 416 */       this.k.removeWorldAccess(this);
/*  354:     */     }
/*  355: 419 */     this.B = 4.9E-324D;
/*  356: 420 */     this.C = 4.9E-324D;
/*  357: 421 */     this.D = 4.9E-324D;
/*  358: 422 */     this.E = -2147483648;
/*  359: 423 */     this.F = -2147483648;
/*  360: 424 */     this.G = -2147483648;
/*  361:     */     
/*  362: 426 */     this.j.a(paramcen);
/*  363: 427 */     this.k = paramcen;
/*  364: 428 */     if (paramcen != null)
/*  365:     */     {
/*  366: 429 */       paramcen.addWorldAccess(this);
/*  367: 430 */       a();
/*  368:     */     }
/*  369:     */   }
/*  370:     */   
/*  371:     */   public void a()
/*  372:     */   {
/*  373: 436 */     if (this.k == null) {
/*  374: 437 */       return;
/*  375:     */     }
/*  376: 440 */     this.ab = true;
/*  377:     */     
/*  378: 442 */     BlockList.leaves.b(this.h.t.i);
/*  379: 443 */     BlockList.leaves2.b(this.h.t.i);
/*  380:     */     
/*  381: 445 */     this.O = this.h.t.c;
/*  382:     */     
/*  383: 447 */     boolean bool = this.X;
/*  384: 448 */     this.X = dax.f();
/*  385: 450 */     if ((bool) && (!this.X))
/*  386:     */     {
/*  387: 451 */       this.N = new cks();
/*  388: 452 */       this.a = new com();
/*  389:     */     }
/*  390: 453 */     else if ((!bool) && (this.X))
/*  391:     */     {
/*  392: 454 */       this.N = new cky();
/*  393: 455 */       this.a = new cor();
/*  394:     */     }
/*  395: 458 */     if (bool != this.X)
/*  396:     */     {
/*  397: 459 */       q();
/*  398: 460 */       p();
/*  399: 461 */       o();
/*  400:     */     }
/*  401: 464 */     if (this.n != null) {
/*  402: 465 */       this.n.a();
/*  403:     */     }
/*  404: 468 */     e();
/*  405:     */     
/*  406: 470 */     this.n = new cla(this.k, this.h.t.c, this, this.a);
/*  407: 472 */     if (this.k != null)
/*  408:     */     {
/*  409: 473 */       Entity localwv = this.h.aa();
/*  410: 474 */       if (localwv != null) {
/*  411: 475 */         this.n.a(localwv.xPos, localwv.zPos);
/*  412:     */       }
/*  413:     */     }
/*  414: 478 */     this.P = 2;
/*  415:     */   }
/*  416:     */   
/*  417:     */   protected void e()
/*  418:     */   {
/*  419: 482 */     this.l.clear();
/*  420: 483 */     this.M.b();
/*  421:     */   }
/*  422:     */   
/*  423:     */   public void a(int paramInt1, int paramInt2)
/*  424:     */   {
/*  425: 487 */     if (!dax.N) {
/*  426: 488 */       return;
/*  427:     */     }
/*  428: 491 */     if (this.A != null) {
/*  429: 492 */       this.A.a(paramInt1, paramInt2);
/*  430:     */     }
/*  431:     */   }
/*  432:     */   
/*  433:     */   public void a(Entity paramwv, cox paramcox, float paramFloat)
/*  434:     */   {
/*  435: 497 */     if (this.P > 0)
/*  436:     */     {
/*  437: 498 */       this.P -= 1;
/*  438: 499 */       return;
/*  439:     */     }
/*  440: 502 */     double d1 = paramwv.lastX + (paramwv.xPos - paramwv.lastX) * paramFloat;
/*  441: 503 */     double d2 = paramwv.lastY + (paramwv.yPos - paramwv.lastY) * paramFloat;
/*  442: 504 */     double d3 = paramwv.lastZ + (paramwv.zPos - paramwv.lastZ) * paramFloat;
/*  443:     */     
/*  444: 506 */     this.k.profiler.a("prepare");
/*  445: 507 */     cno.a.a(this.k, this.h.N(), this.h.k, this.h.aa(), paramFloat);
/*  446: 508 */     this.j.a(this.k, this.h.k, this.h.aa(), this.h.i, this.h.t, paramFloat);
/*  447:     */     
/*  448: 510 */     this.Q = 0;
/*  449: 511 */     this.R = 0;
/*  450: 512 */     this.S = 0;
/*  451:     */     
/*  452: 514 */     Entity localwv = this.h.aa();
/*  453: 515 */     double d4 = localwv.P + (localwv.xPos - localwv.P) * paramFloat;
/*  454: 516 */     double d5 = localwv.Q + (localwv.yPos - localwv.Q) * paramFloat;
/*  455: 517 */     double d6 = localwv.R + (localwv.zPos - localwv.R) * paramFloat;
/*  456: 518 */     cno.b = d4;
/*  457: 519 */     cno.c = d5;
/*  458: 520 */     cno.d = d6;
/*  459:     */     
/*  460: 522 */     this.j.a(d4, d5, d6);
/*  461:     */     
/*  462: 524 */     this.h.o.i();
/*  463:     */     
/*  464: 526 */     this.k.profiler.c("global");
/*  465: 527 */     List localList = this.k.getEntityList();
/*  466: 528 */     this.Q = localList.size();
/*  467:     */     Object localObject1;
/*  468: 529 */     for (int i1 = 0; i1 < this.k.k.size(); i1++)
/*  469:     */     {
/*  470: 530 */       localObject1 = (Entity)this.k.k.get(i1);
/*  471: 531 */       this.R += 1;
/*  472: 532 */       if (((Entity)localObject1).h(d1, d2, d3)) {
/*  473: 533 */         this.j.a((Entity)localObject1, paramFloat);
/*  474:     */       }
/*  475:     */     }
/*  476: 537 */     if (d())
/*  477:     */     {
/*  478: 538 */       cjm.c(519);
/*  479: 539 */       cjm.n();
/*  480: 540 */       this.z.f();
/*  481: 541 */       this.z.a(false);
/*  482: 542 */       this.k.profiler.c("entityOutlines");
/*  483: 543 */       bss.a();
/*  484: 544 */       this.j.c(true);
/*  485: 545 */       for (int i1 = 0; i1 < localList.size(); i1++)
/*  486:     */       {
/*  487: 546 */         localObject1 = (Entity)localList.get(i1);
/*  488: 547 */         int i2 = ((this.h.aa() instanceof EntityLiving)) && (((EntityLiving)this.h.aa()).bI()) ? 1 : 0;
/*  489: 548 */         int i3 = (((Entity)localObject1).h(d1, d2, d3)) && ((((Entity)localObject1).ah) || (paramcox.a(((Entity)localObject1).getAABB())) || (((Entity)localObject1).rider == this.h.h)) && ((localObject1 instanceof EntityPlayer)) ? 1 : 0;
/*  490: 549 */         if ((localObject1 != this.h.aa()) || (this.h.t.ax != 0) || (i2 != 0)) {
/*  491: 552 */           if (i3 != 0) {
/*  492: 553 */             this.j.a((Entity)localObject1, paramFloat);
/*  493:     */           }
/*  494:     */         }
/*  495:     */       }
/*  496: 556 */       this.j.c(false);
/*  497: 557 */       bss.b();
/*  498: 558 */       cjm.a(false);
/*  499: 559 */       this.A.a(paramFloat);
/*  500: 560 */       cjm.a(true);
/*  501: 561 */       this.h.b().a(false);
/*  502: 562 */       cjm.m();
/*  503: 563 */       cjm.c(515);
/*  504: 564 */       cjm.j();
/*  505: 565 */       cjm.enableAlphaTest();
/*  506:     */     }
/*  507: 568 */     this.k.profiler.c("entities");
/*  508: 569 */     for (Iterator localIterator = this.m.iterator(); localIterator.hasNext();)
/*  509:     */     {
/*  510: 569 */       ckq localObject11 = (ckq)localIterator.next();
/*  511: 570 */       Chunk localObject2 = this.k.getChunk(((ckq)localObject11).a.j());
/*  512: 571 */       for (Iterator<Entity> localObject3 = localObject2.s()[(localObject11.a.j().getY() / 16)].iterator(); localObject3.hasNext();)
/*  513:     */       {
/*  514: 571 */         Entity localObject4 = (Entity)(localObject3).next();
/*  515: 572 */         int i4 = (this.j.a((Entity)localObject4, paramcox, d1, d2, d3)) || (((Entity)localObject4).rider == this.h.h) ? 1 : 0;
/*  516: 574 */         if (i4 != 0)
/*  517:     */         {
/*  518: 575 */           boolean i5 = (this.h.aa() instanceof EntityLiving) ? ((EntityLiving)this.h.aa()).bI() : false;
/*  519: 576 */           if (((localObject4 != this.h.aa()) || (this.h.t.ax != 0) || i5) && (
/*  520:     */           
/*  521:     */ 
/*  522: 579 */             (((Entity)localObject4).yPos < 0.0D) || (((Entity)localObject4).yPos >= 256.0D) || (this.k.e(new BlockPosition((Entity)localObject4)))))
/*  523:     */           {
/*  524: 582 */             this.R += 1;
/*  525: 583 */             this.j.a((Entity)localObject4, paramFloat);
/*  526:     */           }
/*  527:     */         }
/*  528: 587 */         else if ((i4 == 0) && ((localObject4 instanceof ahw)))
/*  529:     */         {
/*  530: 588 */           this.h.ae().b((Entity)localObject4, paramFloat);
/*  531:     */         }
/*  532:     */       }
/*  533:     */     }
/*  534:     */     Object localObject2;
/*  535:     */     Object localObject3;
/*  536:     */     Object localObject4;
/*  537: 593 */     this.k.profiler.c("blockentities");
/*  538: 594 */     bss.b();
/*  539: 595 */     for (Iterator<ckq> localIterator = this.m.iterator(); localIterator.hasNext();)
/*  540:     */     {
/*  541: 595 */       localObject1 = (ckq)localIterator.next();
/*  542: 596 */       for (localObject2 = ((ckq)localObject1).a.g().b().iterator(); ((Iterator)localObject2).hasNext();)
/*  543:     */       {
/*  544: 596 */         localObject3 = (bcm)((Iterator)localObject2).next();
/*  545: 597 */         cno.a.a((bcm)localObject3, paramFloat, -1);
/*  546:     */       }
/*  547:     */     }
/*  548: 601 */     s();
/*  549: 602 */     Iterator<qi> localIterator = this.w.values().iterator();
/*  550: 603 */     while (localIterator.hasNext())
/*  551:     */     {
/*  552: 604 */       localObject1 = (qi)localIterator.next();
/*  553: 605 */       localObject2 = ((qi)localObject1).b();
/*  554: 606 */       localObject3 = this.k.s((BlockPosition)localObject2);
/*  555: 607 */       if ((localObject3 instanceof bcr))
/*  556:     */       {
/*  557: 608 */         localObject4 = (bcr)localObject3;
/*  558: 609 */         if (((bcr)localObject4).h != null)
/*  559:     */         {
/*  560: 610 */           localObject2 = ((BlockPosition)localObject2).offset(EnumDirection.WEST);
/*  561: 611 */           localObject3 = this.k.s((BlockPosition)localObject2);
/*  562:     */         }
/*  563: 612 */         else if (((bcr)localObject4).f != null)
/*  564:     */         {
/*  565: 613 */           localObject2 = ((BlockPosition)localObject2).offset(EnumDirection.NORTH);
/*  566: 614 */           localObject3 = this.k.s((BlockPosition)localObject2);
/*  567:     */         }
/*  568:     */       }
/*  569: 617 */       localObject4 = this.k.getBlock((BlockPosition)localObject2).getProto();
/*  570: 618 */       if ((localObject3 != null) && (((localObject4 instanceof BlockChest)) || ((localObject4 instanceof avr)) || ((localObject4 instanceof bai)) || ((localObject4 instanceof baj)))) {
/*  571: 619 */         cno.a.a((bcm)localObject3, paramFloat, ((qi)localObject1).c());
/*  572:     */       }
/*  573:     */     }
/*  574: 622 */     t();
/*  575:     */     
/*  576: 624 */     this.h.o.h();
/*  577:     */     
/*  578: 626 */     this.h.y.b();
/*  579:     */   }
/*  580:     */   
/*  581:     */   public String f()
/*  582:     */   {
/*  583: 630 */     int i1 = this.n.f.length;
/*  584: 631 */     int i2 = 0;
/*  585: 634 */     for (ckq localckq : this.m)
/*  586:     */     {
/*  587: 635 */       cok localcok = localckq.a.b;
/*  588: 636 */       if ((localcok != cok.a) && (!localcok.a())) {
/*  589: 637 */         i2++;
/*  590:     */       }
/*  591:     */     }
/*  592: 641 */     return String.format("C: %d/%d %sD: %d, %s", new Object[] { Integer.valueOf(i2), Integer.valueOf(i1), this.h.E ? "(s) " : "", Integer.valueOf(this.O), this.M.a() });
/*  593:     */   }
/*  594:     */   
/*  595:     */   public String g()
/*  596:     */   {
/*  597: 651 */     return "E: " + this.R + "/" + this.Q + ", B: " + this.S + ", I: " + (this.Q - this.S - this.R);
/*  598:     */   }
/*  599:     */   
/*  600:     */   public void a(Entity paramwv, double paramDouble, cox paramcox, int paramInt, boolean paramBoolean)
/*  601:     */   {
/*  602: 655 */     if (this.h.t.c != this.O) {
/*  603: 656 */       a();
/*  604:     */     }
/*  605: 659 */     this.k.profiler.a("camera");
/*  606: 660 */     double d1 = paramwv.xPos - this.B;
/*  607: 661 */     double d2 = paramwv.yPos - this.C;
/*  608: 662 */     double d3 = paramwv.zPos - this.D;
/*  609: 663 */     if ((this.E != paramwv.ae) || (this.F != paramwv.af) || (this.G != paramwv.ag) || (d1 * d1 + d2 * d2 + d3 * d3 > 16.0D))
/*  610:     */     {
/*  611: 664 */       this.B = paramwv.xPos;
/*  612: 665 */       this.C = paramwv.yPos;
/*  613: 666 */       this.D = paramwv.zPos;
/*  614: 667 */       this.E = paramwv.ae;
/*  615: 668 */       this.F = paramwv.af;
/*  616: 669 */       this.G = paramwv.ag;
/*  617:     */       
/*  618: 671 */       this.n.a(paramwv.xPos, paramwv.zPos);
/*  619:     */     }
/*  620: 674 */     this.k.profiler.c("renderlistcamera");
/*  621:     */     
/*  622: 676 */     double d4 = paramwv.P + (paramwv.xPos - paramwv.P) * paramDouble;
/*  623: 677 */     double d5 = paramwv.Q + (paramwv.yPos - paramwv.Q) * paramDouble;
/*  624: 678 */     double d6 = paramwv.R + (paramwv.zPos - paramwv.R) * paramDouble;
/*  625: 679 */     this.N.a(d4, d5, d6);
/*  626:     */     
/*  627: 681 */     this.k.profiler.c("cull");
/*  628: 683 */     if (this.U != null)
/*  629:     */     {
/*  630: 684 */       coz localObject1 = new coz(this.U);
/*  631: 685 */       ((coz)localObject1).a(this.W.x, this.W.y, this.W.z);
/*  632: 686 */       paramcox = (cox)localObject1;
/*  633:     */     }
/*  634: 689 */     this.h.y.c("culling");
/*  635:     */     
/*  636:     */ 
/*  637: 692 */     Object localObject1 = new BlockPosition(d4, d5 + paramwv.getEyeHeight(), d6);
/*  638: 693 */     cop localcop1 = this.n.a((BlockPosition)localObject1);
/*  639: 694 */     BlockPosition localdt = new BlockPosition(MathUtils.floor(d4) / 16 * 16, MathUtils.floor(d5) / 16 * 16, MathUtils.floor(d6) / 16 * 16);
/*  640:     */     
/*  641:     */ 
/*  642:     */ 
/*  643:     */ 
/*  644:     */ 
/*  645:     */ 
/*  646: 701 */     this.ab = ((this.ab) || (!this.l.isEmpty()) || (paramwv.xPos != this.H) || (paramwv.yPos != this.I) || (paramwv.zPos != this.J) || (paramwv.pitch != this.K) || (paramwv.yaw != this.L));
/*  647:     */     
/*  648: 703 */     this.H = paramwv.xPos;
/*  649: 704 */     this.I = paramwv.yPos;
/*  650: 705 */     this.J = paramwv.zPos;
/*  651: 706 */     this.K = paramwv.pitch;
/*  652: 707 */     this.L = paramwv.yaw;
/*  653:     */     
/*  654: 709 */     int i1 = this.U != null ? 1 : 0;
/*  655:     */     Object localObject3;
/*  656:     */     ckq localckq1;
/*  657: 710 */     if ((i1 == 0) && (this.ab))
/*  658:     */     {
/*  659: 711 */       this.ab = false;
/*  660: 712 */       this.m = Lists.newArrayList();
/*  661:     */       
/*  662: 714 */       Queue localObject2 = Lists.newLinkedList();
/*  663:     */       
/*  664: 716 */       boolean bool = this.h.E;
/*  665:     */       int i2;
/*  666:     */       Object localObject5;
/*  667:     */       Object localObject4;
/*  668:     */       Object localObject6;
/*  669: 719 */       if (localcop1 == null)
/*  670:     */       {
/*  671: 721 */         i2 = ((BlockPosition)localObject1).getY() > 0 ? 248 : 8;
/*  672: 723 */         for (int i3 = -this.O; i3 <= this.O; i3++) {
/*  673: 724 */           for (int i4 = -this.O; i4 <= this.O; i4++)
/*  674:     */           {
/*  675: 725 */             localObject5 = this.n.a(new BlockPosition((i3 << 4) + 8, i2, (i4 << 4) + 8));
/*  676: 726 */             if ((localObject5 != null) && (paramcox.a(((cop)localObject5).c)))
/*  677:     */             {
/*  678: 727 */               ((cop)localObject5).a(paramInt);
/*  679: 728 */               ((Queue<ckq>)localObject2).add(new ckq(this, (cop)localObject5, null, 0, null));
/*  680:     */             }
/*  681:     */           }
/*  682:     */         }
/*  683:     */       }
/*  684:     */       else
/*  685:     */       {
/*  686: 733 */         i2 = 0;
/*  687: 734 */         ckq localObject31 = new ckq(this, localcop1, null, 0, null);
/*  688:     */         
/*  689:     */ 
/*  690: 737 */         localObject4 = c((BlockPosition)localObject1);
/*  691: 740 */         if ((!((Set)localObject4).isEmpty()) && (((Set)localObject4).size() == 1))
/*  692:     */         {
/*  693: 743 */           localObject5 = a(paramwv, paramDouble);
/*  694: 744 */           localObject6 = EnumDirection.fromVector(((Vector3f)localObject5).x, ((Vector3f)localObject5).y, ((Vector3f)localObject5).z).opposite();
/*  695: 745 */           ((Set)localObject4).remove(localObject6);
/*  696:     */         }
/*  697: 748 */         if (((Set)localObject4).isEmpty()) {
/*  698: 749 */           i2 = 1;
/*  699:     */         }
/*  700: 752 */         if ((i2 == 0) || (paramBoolean))
/*  701:     */         {
/*  702: 753 */           if ((paramBoolean) && (this.k.getBlock((BlockPosition)localObject1).getProto().c())) {
/*  703: 754 */             bool = false;
/*  704:     */           }
/*  705: 757 */           localcop1.a(paramInt);
/*  706: 758 */           ((Queue)localObject2).add(localObject31);
/*  707:     */         }
/*  708:     */         else
/*  709:     */         {
/*  710: 760 */           this.m.add(localObject31);
/*  711:     */         }
/*  712:     */       }
/*  713: 764 */       while (!((Queue)localObject2).isEmpty())
/*  714:     */       {
/*  715: 765 */         localckq1 = (ckq)((Queue)localObject2).poll();
/*  716: 766 */         localObject3 = localckq1.a;
/*  717: 767 */         localObject4 = localckq1.b;
/*  718: 768 */         localObject5 = ((cop)localObject3).j();
/*  719:     */         
/*  720: 770 */         this.m.add(localckq1);
/*  721: 772 */         for (EnumDirection localej : EnumDirection.values())
/*  722:     */         {
/*  723: 773 */           cop localcop2 = a((BlockPosition)localObject1, (BlockPosition)localObject5, localej);
/*  724: 774 */           if ((!bool) || (!localckq1.c.contains(localej.opposite()))) {
/*  725: 778 */             if ((!bool) || (localObject4 == null) || (((cop)localObject3).g().a(((EnumDirection)localObject4).opposite(), localej))) {
/*  726: 782 */               if (localcop2 != null) {
/*  727: 786 */                 if (localcop2.a(paramInt)) {
/*  728: 790 */                   if (paramcox.a(localcop2.c))
/*  729:     */                   {
/*  730: 794 */                     ckq localckq2 = new ckq(this, localcop2, localej, localckq1.d + 1, null);
/*  731: 795 */                     localckq2.c.addAll(localckq1.c);
/*  732: 796 */                     localckq2.c.add(localej);
/*  733:     */                     
/*  734: 798 */                     ((Queue)localObject2).add(localckq2);
/*  735:     */                   }
/*  736:     */                 }
/*  737:     */               }
/*  738:     */             }
/*  739:     */           }
/*  740:     */         }
/*  741:     */       }
/*  742:     */     }
/*  743: 803 */     if (this.T)
/*  744:     */     {
/*  745: 804 */       a(d4, d5, d6);
/*  746:     */       
/*  747: 806 */       this.T = false;
/*  748:     */     }
/*  749: 809 */     this.M.e();
/*  750: 810 */     Object localObject2 = this.l;
/*  751: 811 */     this.l = Sets.newLinkedHashSet();
/*  752: 812 */     for (Iterator localIterator = this.m.iterator(); localIterator.hasNext();)
/*  753:     */     {
/*  754: 812 */       localckq1 = (ckq)localIterator.next();
/*  755: 813 */       localObject3 = localckq1.a;
/*  756: 814 */       if ((((cop)localObject3).m()) || (((cop)localObject3).l()) || (((Set)localObject2).contains(localObject3)))
/*  757:     */       {
/*  758: 815 */         this.ab = true;
/*  759: 817 */         if (a(localdt, localckq1.a))
/*  760:     */         {
/*  761: 818 */           this.h.y.a("build near");
/*  762: 819 */           this.M.b((cop)localObject3);
/*  763: 820 */           ((cop)localObject3).a(false);
/*  764: 821 */           this.h.y.b();
/*  765:     */         }
/*  766:     */         else
/*  767:     */         {
/*  768: 823 */           this.l.add(localObject3);
/*  769:     */         }
/*  770:     */       }
/*  771:     */     }
/*  772: 827 */     this.l.addAll((Collection)localObject2);
/*  773:     */     
/*  774: 829 */     this.h.y.b();
/*  775:     */   }
/*  776:     */   
/*  777:     */   private boolean a(BlockPosition paramdt, cop paramcop)
/*  778:     */   {
/*  779: 833 */     BlockPosition localdt = paramcop.j();
/*  780: 834 */     if (MathUtils.abs(paramdt.getX() - localdt.getX()) > 16) {
/*  781: 835 */       return false;
/*  782:     */     }
/*  783: 837 */     if (MathUtils.abs(paramdt.getY() - localdt.getY()) > 16) {
/*  784: 838 */       return false;
/*  785:     */     }
/*  786: 840 */     if (MathUtils.abs(paramdt.getZ() - localdt.getZ()) > 16) {
/*  787: 841 */       return false;
/*  788:     */     }
/*  789: 844 */     return true;
/*  790:     */   }
/*  791:     */   
/*  792:     */   private Set c(BlockPosition paramdt)
/*  793:     */   {
/*  794: 848 */     cos localcos = new cos();
/*  795: 849 */     BlockPosition localdt = new BlockPosition(paramdt.getX() >> 4 << 4, paramdt.getY() >> 4 << 4, paramdt.getZ() >> 4 << 4);
/*  796:     */     
/*  797:     */ 
/*  798:     */ 
/*  799:     */ 
/*  800: 854 */     Chunk localbfh = this.k.getChunk(localdt);
/*  801: 856 */     for (dy localdy : BlockPosition.b(localdt, localdt.offset(15, 15, 15))) {
/*  802: 857 */       if (localbfh.getBlock(localdy).c()) {
/*  803: 858 */         localcos.a(localdy);
/*  804:     */       }
/*  805:     */     }
/*  806: 862 */     return localcos.b(paramdt);
/*  807:     */   }
/*  808:     */   
/*  809:     */   private cop a(BlockPosition paramdt1, BlockPosition paramdt2, EnumDirection paramej)
/*  810:     */   {
/*  811: 867 */     BlockPosition localdt = paramdt2.offset(paramej, 16);
/*  812: 870 */     if (MathUtils.abs(paramdt1.getX() - localdt.getX()) > this.O * 16) {
/*  813: 871 */       return null;
/*  814:     */     }
/*  815: 873 */     if ((localdt.getY() < 0) || (localdt.getY() >= 256)) {
/*  816: 874 */       return null;
/*  817:     */     }
/*  818: 876 */     if (MathUtils.abs(paramdt1.getZ() - localdt.getZ()) > this.O * 16) {
/*  819: 877 */       return null;
/*  820:     */     }
/*  821: 881 */     return this.n.a(localdt);
/*  822:     */   }
/*  823:     */   
/*  824:     */   private void a(double paramDouble1, double paramDouble2, double paramDouble3)
/*  825:     */   {
/*  826: 885 */     this.U = new coy();
/*  827: 886 */     ((coy)this.U).b();
/*  828: 887 */     Matrix4f localMatrix4f1 = new Matrix4f(this.U.c);
/*  829: 888 */     localMatrix4f1.transpose();
/*  830:     */     
/*  831: 890 */     Matrix4f localMatrix4f2 = new Matrix4f(this.U.b);
/*  832: 891 */     localMatrix4f2.transpose();
/*  833:     */     
/*  834: 893 */     Matrix4f localMatrix4f3 = new Matrix4f();
/*  835: 894 */     localMatrix4f3.mul(localMatrix4f2, localMatrix4f1);
/*  836: 895 */     localMatrix4f3.invert();
/*  837:     */     
/*  838: 897 */     this.W.x = paramDouble1;
/*  839: 898 */     this.W.y = paramDouble2;
/*  840: 899 */     this.W.z = paramDouble3;
/*  841:     */     
/*  842:     */ 
/*  843: 902 */     this.V[0] = new Vector4f(-1.0F, -1.0F, -1.0F, 1.0F);
/*  844: 903 */     this.V[1] = new Vector4f(1.0F, -1.0F, -1.0F, 1.0F);
/*  845: 904 */     this.V[2] = new Vector4f(1.0F, 1.0F, -1.0F, 1.0F);
/*  846: 905 */     this.V[3] = new Vector4f(-1.0F, 1.0F, -1.0F, 1.0F);
/*  847:     */     
/*  848:     */ 
/*  849: 908 */     this.V[4] = new Vector4f(-1.0F, -1.0F, 1.0F, 1.0F);
/*  850: 909 */     this.V[5] = new Vector4f(1.0F, -1.0F, 1.0F, 1.0F);
/*  851: 910 */     this.V[6] = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  852: 911 */     this.V[7] = new Vector4f(-1.0F, 1.0F, 1.0F, 1.0F);
/*  853: 913 */     for (int i1 = 0; i1 < 8; i1++)
/*  854:     */     {
/*  855: 914 */       localMatrix4f3.transform(this.V[i1]);
/*  856: 915 */       this.V[i1].x /= this.V[i1].w;
/*  857: 916 */       this.V[i1].y /= this.V[i1].w;
/*  858: 917 */       this.V[i1].z /= this.V[i1].w;
/*  859: 918 */       this.V[i1].w = 1.0F;
/*  860:     */     }
/*  861:     */   }
/*  862:     */   
/*  863:     */   protected Vector3f a(Entity paramwv, double paramDouble)
/*  864:     */   {
/*  865: 923 */     float f1 = (float)(paramwv.lastPitch + (paramwv.pitch - paramwv.lastPitch) * paramDouble);
/*  866: 924 */     float f2 = (float)(paramwv.lastYaw + (paramwv.yaw - paramwv.lastYaw) * paramDouble);
/*  867: 925 */     if (bsu.z().t.ax == 2) {
/*  868: 926 */       f1 += 180.0F;
/*  869:     */     }
/*  870: 928 */     float f3 = MathUtils.cos(-f2 * 0.01745329F - 3.141593F);
/*  871: 929 */     float f4 = MathUtils.sin(-f2 * 0.01745329F - 3.141593F);
/*  872: 930 */     float f5 = -MathUtils.cos(-f1 * 0.01745329F);
/*  873: 931 */     float f6 = MathUtils.sin(-f1 * 0.01745329F);
/*  874:     */     
/*  875: 933 */     return new Vector3f(f4 * f5, f6, f3 * f5);
/*  876:     */   }
/*  877:     */   
/*  878:     */   public int a(aql paramaql, double paramDouble, int paramInt, Entity paramwv)
/*  879:     */   {
/*  880:     */     
/*  881: 957 */     if (paramaql == aql.d)
/*  882:     */     {
/*  883: 958 */       this.h.y.a("translucent_sort");
/*  884:     */       
/*  885: 960 */       double d1 = paramwv.xPos - this.Y;
/*  886: 961 */       double d2 = paramwv.yPos - this.Z;
/*  887: 962 */       double d3 = paramwv.zPos - this.aa;
/*  888:     */       int i7;
/*  889: 963 */       if (d1 * d1 + d2 * d2 + d3 * d3 > 1.0D)
/*  890:     */       {
/*  891: 964 */         this.Y = paramwv.xPos;
/*  892: 965 */         this.Z = paramwv.yPos;
/*  893: 966 */         this.aa = paramwv.zPos;
/*  894:     */         
/*  895: 968 */         i7 = 0;
/*  896: 969 */         for (ckq localckq : this.m) {
/*  897: 970 */           if ((localckq.a.b.d(paramaql)) && (i7++ < 15)) {
/*  898: 971 */             this.M.c(localckq.a);
/*  899:     */           }
/*  900:     */         }
/*  901:     */       }
/*  902: 975 */       this.h.y.b();
/*  903:     */     }
/*  904: 978 */     this.h.y.a("filterempty");
/*  905:     */     
/*  906: 980 */     int i1 = 0;
/*  907:     */     
/*  908: 982 */     int i2 = paramaql == aql.d ? 1 : 0;
/*  909: 983 */     int i3 = i2 != 0 ? this.m.size() - 1 : 0;
/*  910: 984 */     int i4 = i2 != 0 ? -1 : this.m.size();
/*  911: 985 */     int i5 = i2 != 0 ? -1 : 1;
/*  912: 986 */     for (int i6 = i3; i6 != i4; i6 += i5)
/*  913:     */     {
/*  914: 987 */       cop localcop = ((ckq)this.m.get(i6)).a;
/*  915: 989 */       if (!localcop.g().b(paramaql))
/*  916:     */       {
/*  917: 993 */         i1++;
/*  918:     */         
/*  919: 995 */         this.N.a(localcop, paramaql);
/*  920:     */       }
/*  921:     */     }
/*  922: 998 */     this.h.y.c("render_" + paramaql);
/*  923: 999 */     a(paramaql);
/*  924:     */     
/*  925:     */ 
/*  926:     */ 
/*  927:     */ 
/*  928:     */ 
/*  929:1005 */     this.h.y.b();
/*  930:1006 */     return i1;
/*  931:     */   }
/*  932:     */   
/*  933:     */   private void a(aql paramaql)
/*  934:     */   {
/*  935:1263 */     this.h.o.i();
/*  936:1265 */     if (dax.f())
/*  937:     */     {
/*  938:1266 */       GL11.glEnableClientState(32884);
/*  939:1267 */       dax.l(dax.p);
/*  940:1268 */       GL11.glEnableClientState(32888);
/*  941:1269 */       dax.l(dax.q);
/*  942:1270 */       GL11.glEnableClientState(32888);
/*  943:1271 */       dax.l(dax.p);
/*  944:1272 */       GL11.glEnableClientState(32886);
/*  945:     */     }
/*  946:1283 */     this.N.a(paramaql);
/*  947:1285 */     if (dax.f())
/*  948:     */     {
/*  949:1286 */       List<VertexElement> localList = cuq.a.getElements();
/*  950:1287 */       for (VertexElement localcuu : localList)
/*  951:     */       {
/*  952:1288 */         EnumVertexElementType localcuw = localcuu.getType();
/*  953:1289 */         int i1 = localcuu.e();
/*  954:1290 */         switch (ckp.a[localcuw.ordinal()])
/*  955:     */         {
/*  956:     */         case 1: 
/*  957:1292 */           GL11.glDisableClientState(32884);
/*  958:1293 */           break;
/*  959:     */         case 2: 
/*  960:1295 */           dax.l(dax.p + i1);
/*  961:1296 */           GL11.glDisableClientState(32888);
/*  962:1297 */           dax.l(dax.p);
/*  963:1298 */           break;
/*  964:     */         case 3: 
/*  965:1300 */           GL11.glDisableClientState(32886);
/*  966:1301 */           cjm.G();
/*  967:     */         }
/*  968:     */       }
/*  969:     */     }
/*  970:1311 */     this.h.o.h();
/*  971:     */   }
/*  972:     */   
/*  973:     */   private void a(Iterator paramIterator)
/*  974:     */   {
/*  975:1315 */     while (paramIterator.hasNext())
/*  976:     */     {
/*  977:1316 */       qi localqi = (qi)paramIterator.next();
/*  978:     */       
/*  979:1318 */       int i1 = localqi.d();
/*  980:1320 */       if (this.v - i1 > 400) {
/*  981:1321 */         paramIterator.remove();
/*  982:     */       }
/*  983:     */     }
/*  984:     */   }
/*  985:     */   
/*  986:     */   public void j()
/*  987:     */   {
/*  988:1327 */     this.v += 1;
/*  989:1329 */     if (this.v % 20 == 0) {
/*  990:1330 */       a(this.w.values().iterator());
/*  991:     */     }
/*  992:     */   }
/*  993:     */   
/*  994:     */   private void r()
/*  995:     */   {
/*  996:1335 */     cjm.n();
/*  997:1336 */     cjm.disableAlphaTest();
/*  998:1337 */     cjm.enableBlend();
/*  999:1338 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 1000:1339 */     bss.a();
/* 1001:     */     
/* 1002:1341 */     cjm.a(false);
/* 1003:1342 */     this.i.a(f);
/* 1004:1343 */     ckx localckx = ckx.getInstance();
/* 1005:1344 */     VertexBuffer localciv = localckx.getBuffer();
/* 1006:1345 */     for (int i1 = 0; i1 < 6; i1++)
/* 1007:     */     {
/* 1008:1346 */       cjm.glPushMatrix();
/* 1009:1347 */       if (i1 == 1) {
/* 1010:1348 */         cjm.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/* 1011:     */       }
/* 1012:1350 */       if (i1 == 2) {
/* 1013:1351 */         cjm.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/* 1014:     */       }
/* 1015:1353 */       if (i1 == 3) {
/* 1016:1354 */         cjm.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
/* 1017:     */       }
/* 1018:1356 */       if (i1 == 4) {
/* 1019:1357 */         cjm.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
/* 1020:     */       }
/* 1021:1359 */       if (i1 == 5) {
/* 1022:1360 */         cjm.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
/* 1023:     */       }
/* 1024:1362 */       localciv.begin();
/* 1025:1363 */       localciv.setColor(2631720);
/* 1026:1364 */       localciv.addVertexWithUV(-100.0D, -100.0D, -100.0D, 0.0D, 0.0D);
/* 1027:1365 */       localciv.addVertexWithUV(-100.0D, -100.0D, 100.0D, 0.0D, 16.0D);
/* 1028:1366 */       localciv.addVertexWithUV(100.0D, -100.0D, 100.0D, 16.0D, 16.0D);
/* 1029:1367 */       localciv.addVertexWithUV(100.0D, -100.0D, -100.0D, 16.0D, 0.0D);
/* 1030:1368 */       localckx.draw();
/* 1031:1369 */       cjm.glPopMatrix();
/* 1032:     */     }
/* 1033:1371 */     cjm.a(true);
/* 1034:1372 */     cjm.w();
/* 1035:1373 */     cjm.enableAlphaTest();
/* 1036:     */   }
/* 1037:     */   
/* 1038:     */   public void a(float paramFloat, int paramInt)
/* 1039:     */   {
/* 1040:1377 */     if (this.h.f.t.q() == 1)
/* 1041:     */     {
/* 1042:1378 */       r();
/* 1043:1379 */       return;
/* 1044:     */     }
/* 1045:1381 */     if (!this.h.f.t.d()) {
/* 1046:1382 */       return;
/* 1047:     */     }
/* 1048:1385 */     cjm.x();
/* 1049:     */     
/* 1050:1387 */     Vec3 localbrw = this.k.a(this.h.aa(), paramFloat);
/* 1051:1388 */     float f1 = (float)localbrw.x;
/* 1052:1389 */     float f2 = (float)localbrw.y;
/* 1053:1390 */     float f3 = (float)localbrw.z;
/* 1054:1392 */     if (paramInt != 2)
/* 1055:     */     {
/* 1056:1393 */       float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/* 1057:1394 */       float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/* 1058:1395 */       float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/* 1059:     */       
/* 1060:1397 */       f1 = f4;
/* 1061:1398 */       f2 = f5;
/* 1062:1399 */       f3 = f6;
/* 1063:     */     }
/* 1064:1401 */     cjm.c(f1, f2, f3);
/* 1065:     */     
/* 1066:1403 */     ckx localckx = ckx.getInstance();
/* 1067:1404 */     VertexBuffer localciv = localckx.getBuffer();
/* 1068:     */     
/* 1069:1406 */     cjm.a(false);
/* 1070:     */     
/* 1071:1408 */     cjm.m();
/* 1072:1409 */     cjm.c(f1, f2, f3);
/* 1073:1410 */     if (this.X)
/* 1074:     */     {
/* 1075:1411 */       this.t.a();
/* 1076:1412 */       GL11.glEnableClientState(32884);
/* 1077:1413 */       GL11.glVertexPointer(3, 5126, 12, 0L);
/* 1078:1414 */       this.t.a(7);
/* 1079:1415 */       this.t.b();
/* 1080:1416 */       GL11.glDisableClientState(32884);
/* 1081:     */     }
/* 1082:     */     else
/* 1083:     */     {
/* 1084:1418 */       cjm.o(this.p);
/* 1085:     */     }
/* 1086:1421 */     cjm.n();
/* 1087:1422 */     cjm.disableAlphaTest();
/* 1088:1423 */     cjm.enableBlend();
/* 1089:1424 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 1090:1425 */     bss.a();
/* 1091:     */     
/* 1092:1427 */     float[] arrayOfFloat = this.k.t.a(this.k.c(paramFloat), paramFloat);
/* 1093:1428 */     if (arrayOfFloat != null)
/* 1094:     */     {
/* 1095:1429 */       cjm.x();
/* 1096:1430 */       cjm.j(7425);
/* 1097:     */       
/* 1098:1432 */       cjm.glPushMatrix();
/* 1099:     */       
/* 1100:1434 */       cjm.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/* 1101:1435 */       cjm.glRotatef(MathUtils.sin(this.k.d(paramFloat)) < 0.0F ? 180.0F : 0.0F, 0.0F, 0.0F, 1.0F);
/* 1102:1436 */       cjm.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
/* 1103:     */       
/* 1104:1438 */       float f7 = arrayOfFloat[0];
/* 1105:1439 */       float f8 = arrayOfFloat[1];
/* 1106:1440 */       float f9 = arrayOfFloat[2];
/* 1107:     */       float f14;
/* 1108:1441 */       if (paramInt != 2)
/* 1109:     */       {
/* 1110:1442 */         float f10 = (f7 * 30.0F + f8 * 59.0F + f9 * 11.0F) / 100.0F;
/* 1111:1443 */         float f12 = (f7 * 30.0F + f8 * 70.0F) / 100.0F;
/* 1112:1444 */         f14 = (f7 * 30.0F + f9 * 70.0F) / 100.0F;
/* 1113:     */         
/* 1114:1446 */         f7 = f10;
/* 1115:1447 */         f8 = f12;
/* 1116:1448 */         f9 = f14;
/* 1117:     */       }
/* 1118:1451 */       localciv.a(6);
/* 1119:1452 */       localciv.setColor(f7, f8, f9, arrayOfFloat[3]);
/* 1120:     */       
/* 1121:1454 */       localciv.addVertex(0.0D, 100.0D, 0.0D);
/* 1122:1455 */       int i1 = 16;
/* 1123:1456 */       localciv.setColor(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], 0.0F);
/* 1124:1457 */       for (int i2 = 0; i2 <= 16; i2++)
/* 1125:     */       {
/* 1126:1458 */         f14 = i2 * 3.141593F * 2.0F / 16.0F;
/* 1127:1459 */         float f16 = MathUtils.sin(f14);
/* 1128:1460 */         float f17 = MathUtils.cos(f14);
/* 1129:1461 */         localciv.setColor(f16 * 120.0F, f17 * 120.0F, -f17 * 40.0F * arrayOfFloat[3]);
/* 1130:     */       }
/* 1131:1463 */       localckx.draw();
/* 1132:     */       
/* 1133:1465 */       cjm.glPopMatrix();
/* 1134:1466 */       cjm.j(7424);
/* 1135:     */     }
/* 1136:1469 */     cjm.w();
/* 1137:1470 */     cjm.glBlendFuncSeparate(770, 1, 1, 0);
/* 1138:1471 */     cjm.glPushMatrix();
/* 1139:     */     
/* 1140:1473 */     float f7 = 1.0F - this.k.j(paramFloat);
/* 1141:1474 */     float f8 = 0.0F;
/* 1142:1475 */     float f9 = 0.0F;
/* 1143:1476 */     float f11 = 0.0F;
/* 1144:1477 */     cjm.c(1.0F, 1.0F, 1.0F, f7);
/* 1145:1478 */     cjm.glTranslatef(0.0F, 0.0F, 0.0F);
/* 1146:1479 */     cjm.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
/* 1147:1480 */     cjm.glRotatef(this.k.c(paramFloat) * 360.0F, 1.0F, 0.0F, 0.0F);
/* 1148:1481 */     float f13 = 30.0F;
/* 1149:     */     
/* 1150:1483 */     this.i.a(d);
/* 1151:1484 */     localciv.begin();
/* 1152:1485 */     localciv.addVertexWithUV(-f13, 100.0D, -f13, 0.0D, 0.0D);
/* 1153:1486 */     localciv.addVertexWithUV(f13, 100.0D, -f13, 1.0D, 0.0D);
/* 1154:1487 */     localciv.addVertexWithUV(f13, 100.0D, f13, 1.0D, 1.0D);
/* 1155:1488 */     localciv.addVertexWithUV(-f13, 100.0D, f13, 0.0D, 1.0D);
/* 1156:1489 */     localckx.draw();
/* 1157:1490 */     f13 = 20.0F;
/* 1158:1491 */     this.i.a(c);
/* 1159:1492 */     int i3 = this.k.x();
/* 1160:1493 */     int i4 = i3 % 4;
/* 1161:1494 */     int i5 = i3 / 4 % 2;
/* 1162:1495 */     float f18 = (i4 + 0) / 4.0F;
/* 1163:1496 */     float f19 = (i5 + 0) / 2.0F;
/* 1164:1497 */     float f20 = (i4 + 1) / 4.0F;
/* 1165:1498 */     float f21 = (i5 + 1) / 2.0F;
/* 1166:1499 */     localciv.begin();
/* 1167:1500 */     localciv.addVertexWithUV(-f13, -100.0D, f13, f20, f21);
/* 1168:1501 */     localciv.addVertexWithUV(f13, -100.0D, f13, f18, f21);
/* 1169:1502 */     localciv.addVertexWithUV(f13, -100.0D, -f13, f18, f19);
/* 1170:1503 */     localciv.addVertexWithUV(-f13, -100.0D, -f13, f20, f19);
/* 1171:1504 */     localckx.draw();
/* 1172:     */     
/* 1173:1506 */     cjm.x();
/* 1174:1507 */     float f22 = this.k.g(paramFloat) * f7;
/* 1175:1508 */     if (f22 > 0.0F)
/* 1176:     */     {
/* 1177:1509 */       cjm.c(f22, f22, f22, f22);
/* 1178:1510 */       if (this.X)
/* 1179:     */       {
/* 1180:1511 */         this.s.a();
/* 1181:1512 */         GL11.glEnableClientState(32884);
/* 1182:1513 */         GL11.glVertexPointer(3, 5126, 12, 0L);
/* 1183:1514 */         this.s.a(7);
/* 1184:1515 */         this.s.b();
/* 1185:1516 */         GL11.glDisableClientState(32884);
/* 1186:     */       }
/* 1187:     */       else
/* 1188:     */       {
/* 1189:1518 */         cjm.o(this.o);
/* 1190:     */       }
/* 1191:     */     }
/* 1192:1521 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 1193:     */     
/* 1194:1523 */     cjm.disableBlend();
/* 1195:1524 */     cjm.enableAlphaTest();
/* 1196:1525 */     cjm.m();
/* 1197:     */     
/* 1198:1527 */     cjm.glPopMatrix();
/* 1199:1528 */     cjm.x();
/* 1200:1529 */     cjm.c(0.0F, 0.0F, 0.0F);
/* 1201:     */     
/* 1202:1531 */     double d1 = this.h.h.e(paramFloat).y - this.k.X();
/* 1203:1532 */     if (d1 < 0.0D)
/* 1204:     */     {
/* 1205:1533 */       cjm.glPushMatrix();
/* 1206:1534 */       cjm.glTranslatef(0.0F, 12.0F, 0.0F);
/* 1207:1535 */       if (this.X)
/* 1208:     */       {
/* 1209:1536 */         this.u.a();
/* 1210:1537 */         GL11.glEnableClientState(32884);
/* 1211:1538 */         GL11.glVertexPointer(3, 5126, 12, 0L);
/* 1212:1539 */         this.u.a(7);
/* 1213:1540 */         this.u.b();
/* 1214:1541 */         GL11.glDisableClientState(32884);
/* 1215:     */       }
/* 1216:     */       else
/* 1217:     */       {
/* 1218:1543 */         cjm.o(this.q);
/* 1219:     */       }
/* 1220:1545 */       cjm.glPopMatrix();
/* 1221:     */       
/* 1222:1547 */       f9 = 1.0F;
/* 1223:1548 */       f11 = -(float)(d1 + 65.0D);
/* 1224:1549 */       f13 = -1.0F;
/* 1225:1550 */       float f15 = f11;
/* 1226:     */       
/* 1227:1552 */       localciv.begin();
/* 1228:1553 */       localciv.setColor(0, 255);
/* 1229:1554 */       localciv.addVertex(-1.0D, f15, 1.0D);
/* 1230:1555 */       localciv.addVertex(1.0D, f15, 1.0D);
/* 1231:1556 */       localciv.addVertex(1.0D, -1.0D, 1.0D);
/* 1232:1557 */       localciv.addVertex(-1.0D, -1.0D, 1.0D);
/* 1233:     */       
/* 1234:1559 */       localciv.addVertex(-1.0D, -1.0D, -1.0D);
/* 1235:1560 */       localciv.addVertex(1.0D, -1.0D, -1.0D);
/* 1236:1561 */       localciv.addVertex(1.0D, f15, -1.0D);
/* 1237:1562 */       localciv.addVertex(-1.0D, f15, -1.0D);
/* 1238:     */       
/* 1239:1564 */       localciv.addVertex(1.0D, -1.0D, -1.0D);
/* 1240:1565 */       localciv.addVertex(1.0D, -1.0D, 1.0D);
/* 1241:1566 */       localciv.addVertex(1.0D, f15, 1.0D);
/* 1242:1567 */       localciv.addVertex(1.0D, f15, -1.0D);
/* 1243:     */       
/* 1244:1569 */       localciv.addVertex(-1.0D, f15, -1.0D);
/* 1245:1570 */       localciv.addVertex(-1.0D, f15, 1.0D);
/* 1246:1571 */       localciv.addVertex(-1.0D, -1.0D, 1.0D);
/* 1247:1572 */       localciv.addVertex(-1.0D, -1.0D, -1.0D);
/* 1248:     */       
/* 1249:1574 */       localciv.addVertex(-1.0D, -1.0D, -1.0D);
/* 1250:1575 */       localciv.addVertex(-1.0D, -1.0D, 1.0D);
/* 1251:1576 */       localciv.addVertex(1.0D, -1.0D, 1.0D);
/* 1252:1577 */       localciv.addVertex(1.0D, -1.0D, -1.0D);
/* 1253:1578 */       localckx.draw();
/* 1254:     */     }
/* 1255:1581 */     if (this.k.t.g()) {
/* 1256:1582 */       cjm.c(f1 * 0.2F + 0.04F, f2 * 0.2F + 0.04F, f3 * 0.6F + 0.1F);
/* 1257:     */     } else {
/* 1258:1584 */       cjm.c(f1, f2, f3);
/* 1259:     */     }
/* 1260:1586 */     cjm.glPushMatrix();
/* 1261:1587 */     cjm.glTranslatef(0.0F, -(float)(d1 - 16.0D), 0.0F);
/* 1262:1588 */     cjm.o(this.q);
/* 1263:1589 */     cjm.glPopMatrix();
/* 1264:1590 */     cjm.w();
/* 1265:     */     
/* 1266:1592 */     cjm.a(true);
/* 1267:     */   }
/* 1268:     */   
/* 1269:     */   public void b(float paramFloat, int paramInt)
/* 1270:     */   {
/* 1271:1596 */     if (!this.h.f.t.d()) {
/* 1272:1597 */       return;
/* 1273:     */     }
/* 1274:1600 */     if (this.h.t.i)
/* 1275:     */     {
/* 1276:1601 */       c(paramFloat, paramInt);
/* 1277:1602 */       return;
/* 1278:     */     }
/* 1279:1604 */     cjm.p();
/* 1280:1605 */     float f1 = (float)(this.h.aa().Q + (this.h.aa().yPos - this.h.aa().Q) * paramFloat);
/* 1281:1606 */     int i1 = 32;
/* 1282:1607 */     int i2 = 8;
/* 1283:1608 */     ckx localckx = ckx.getInstance();
/* 1284:1609 */     VertexBuffer localciv = localckx.getBuffer();
/* 1285:     */     
/* 1286:1611 */     this.i.a(e);
/* 1287:1612 */     cjm.enableBlend();
/* 1288:1613 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 1289:     */     
/* 1290:1615 */     Vec3 localbrw = this.k.e(paramFloat);
/* 1291:1616 */     float f2 = (float)localbrw.x;
/* 1292:1617 */     float f3 = (float)localbrw.y;
/* 1293:1618 */     float f4 = (float)localbrw.z;
/* 1294:1620 */     if (paramInt != 2)
/* 1295:     */     {
/* 1296:1621 */       float f5 = (f2 * 30.0F + f3 * 59.0F + f4 * 11.0F) / 100.0F;
/* 1297:1622 */       float f6 = (f2 * 30.0F + f3 * 70.0F) / 100.0F;
/* 1298:1623 */       float f7 = (f2 * 30.0F + f4 * 70.0F) / 100.0F;
/* 1299:     */       
/* 1300:1625 */       f2 = f5;
/* 1301:1626 */       f3 = f6;
/* 1302:1627 */       f4 = f7;
/* 1303:     */     }
/* 1304:1630 */     float f5 = 0.0004882813F;
/* 1305:     */     
/* 1306:1632 */     double d1 = this.v + paramFloat;
/* 1307:1633 */     double d2 = this.h.aa().lastX + (this.h.aa().xPos - this.h.aa().lastX) * paramFloat + d1 * 0.02999999932944775D;
/* 1308:1634 */     double d3 = this.h.aa().lastZ + (this.h.aa().zPos - this.h.aa().lastZ) * paramFloat;
/* 1309:1635 */     int i3 = MathUtils.floor(d2 / 2048.0D);
/* 1310:1636 */     int i4 = MathUtils.floor(d3 / 2048.0D);
/* 1311:1637 */     d2 -= i3 * 2048;
/* 1312:1638 */     d3 -= i4 * 2048;
/* 1313:     */     
/* 1314:1640 */     float f8 = this.k.t.f() - f1 + 0.33F;
/* 1315:1641 */     float f9 = (float)(d2 * 0.00048828125D);
/* 1316:1642 */     float f10 = (float)(d3 * 0.00048828125D);
/* 1317:1643 */     localciv.begin();
/* 1318:     */     
/* 1319:1645 */     localciv.setColor(f2, f3, f4, 0.8F);
/* 1320:1646 */     for (int i5 = -256; i5 < 256; i5 += 32) {
/* 1321:1647 */       for (int i6 = -256; i6 < 256; i6 += 32)
/* 1322:     */       {
/* 1323:1648 */         localciv.addVertexWithUV(i5 + 0, f8, i6 + 32, (i5 + 0) * 0.0004882813F + f9, (i6 + 32) * 0.0004882813F + f10);
/* 1324:1649 */         localciv.addVertexWithUV(i5 + 32, f8, i6 + 32, (i5 + 32) * 0.0004882813F + f9, (i6 + 32) * 0.0004882813F + f10);
/* 1325:1650 */         localciv.addVertexWithUV(i5 + 32, f8, i6 + 0, (i5 + 32) * 0.0004882813F + f9, (i6 + 0) * 0.0004882813F + f10);
/* 1326:1651 */         localciv.addVertexWithUV(i5 + 0, f8, i6 + 0, (i5 + 0) * 0.0004882813F + f9, (i6 + 0) * 0.0004882813F + f10);
/* 1327:     */       }
/* 1328:     */     }
/* 1329:1654 */     localckx.draw();
/* 1330:1655 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 1331:1656 */     cjm.disableBlend();
/* 1332:1657 */     cjm.o();
/* 1333:     */   }
/* 1334:     */   
/* 1335:     */   public boolean a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/* 1336:     */   {
/* 1337:1661 */     return false;
/* 1338:     */   }
/* 1339:     */   
/* 1340:     */   private void c(float paramFloat, int paramInt)
/* 1341:     */   {
/* 1342:1665 */     cjm.p();
/* 1343:1666 */     float f1 = (float)(this.h.aa().Q + (this.h.aa().yPos - this.h.aa().Q) * paramFloat);
/* 1344:1667 */     ckx localckx = ckx.getInstance();
/* 1345:1668 */     VertexBuffer localciv = localckx.getBuffer();
/* 1346:     */     
/* 1347:1670 */     float f2 = 12.0F;
/* 1348:1671 */     float f3 = 4.0F;
/* 1349:     */     
/* 1350:1673 */     double d1 = this.v + paramFloat;
/* 1351:1674 */     double d2 = (this.h.aa().lastX + (this.h.aa().xPos - this.h.aa().lastX) * paramFloat + d1 * 0.02999999932944775D) / 12.0D;
/* 1352:1675 */     double d3 = (this.h.aa().lastZ + (this.h.aa().zPos - this.h.aa().lastZ) * paramFloat) / 12.0D + 0.3300000131130219D;
/* 1353:1676 */     float f4 = this.k.t.f() - f1 + 0.33F;
/* 1354:1677 */     int i1 = MathUtils.floor(d2 / 2048.0D);
/* 1355:1678 */     int i2 = MathUtils.floor(d3 / 2048.0D);
/* 1356:1679 */     d2 -= i1 * 2048;
/* 1357:1680 */     d3 -= i2 * 2048;
/* 1358:     */     
/* 1359:1682 */     this.i.a(e);
/* 1360:1683 */     cjm.enableBlend();
/* 1361:1684 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 1362:     */     
/* 1363:1686 */     Vec3 localbrw = this.k.e(paramFloat);
/* 1364:1687 */     float f5 = (float)localbrw.x;
/* 1365:1688 */     float f6 = (float)localbrw.y;
/* 1366:1689 */     float f7 = (float)localbrw.z;
/* 1367:1691 */     if (paramInt != 2)
/* 1368:     */     {
/* 1369:1692 */       float f8 = (f5 * 30.0F + f6 * 59.0F + f7 * 11.0F) / 100.0F;
/* 1370:1693 */       float f9 = (f5 * 30.0F + f6 * 70.0F) / 100.0F;
/* 1371:1694 */       float f10 = (f5 * 30.0F + f7 * 70.0F) / 100.0F;
/* 1372:     */       
/* 1373:1696 */       f5 = f8;
/* 1374:1697 */       f6 = f9;
/* 1375:1698 */       f7 = f10;
/* 1376:     */     }
/* 1377:1701 */     float f8 = 0.0039063F;
/* 1378:     */     
/* 1379:1703 */     float f9 = MathUtils.floor(d2) * 0.0039063F;
/* 1380:1704 */     float f10 = MathUtils.floor(d3) * 0.0039063F;
/* 1381:1705 */     float f11 = (float)(d2 - MathUtils.floor(d2));
/* 1382:1706 */     float f12 = (float)(d3 - MathUtils.floor(d3));
/* 1383:     */     
/* 1384:1708 */     int i3 = 8;
/* 1385:     */     
/* 1386:1710 */     int i4 = 4;
/* 1387:1711 */     float f13 = 0.000976563F;
/* 1388:1712 */     cjm.glScalef(12.0F, 1.0F, 12.0F);
/* 1389:1713 */     for (int i5 = 0; i5 < 2; i5++)
/* 1390:     */     {
/* 1391:1714 */       if (i5 == 0) {
/* 1392:1715 */         cjm.a(false, false, false, false);
/* 1393:     */       } else {
/* 1394:1717 */         switch (paramInt)
/* 1395:     */         {
/* 1396:     */         case 0: 
/* 1397:1719 */           cjm.a(false, true, true, true);
/* 1398:1720 */           break;
/* 1399:     */         case 1: 
/* 1400:1722 */           cjm.a(true, false, false, true);
/* 1401:1723 */           break;
/* 1402:     */         case 2: 
/* 1403:1725 */           cjm.a(true, true, true, true);
/* 1404:     */         }
/* 1405:     */       }
/* 1406:1729 */       for (int i6 = -3; i6 <= 4; i6++) {
/* 1407:1730 */         for (int i7 = -3; i7 <= 4; i7++)
/* 1408:     */         {
/* 1409:1731 */           localciv.begin();
/* 1410:     */           
/* 1411:1733 */           float f14 = i6 * 8;
/* 1412:1734 */           float f15 = i7 * 8;
/* 1413:1735 */           float f16 = f14 - f11;
/* 1414:1736 */           float f17 = f15 - f12;
/* 1415:1738 */           if (f4 > -5.0F)
/* 1416:     */           {
/* 1417:1739 */             localciv.setColor(f5 * 0.7F, f6 * 0.7F, f7 * 0.7F, 0.8F);
/* 1418:1740 */             localciv.d(0.0F, -1.0F, 0.0F);
/* 1419:1741 */             localciv.addVertexWithUV(f16 + 0.0F, f4 + 0.0F, f17 + 8.0F, (f14 + 0.0F) * 0.0039063F + f9, (f15 + 8.0F) * 0.0039063F + f10);
/* 1420:1742 */             localciv.addVertexWithUV(f16 + 8.0F, f4 + 0.0F, f17 + 8.0F, (f14 + 8.0F) * 0.0039063F + f9, (f15 + 8.0F) * 0.0039063F + f10);
/* 1421:1743 */             localciv.addVertexWithUV(f16 + 8.0F, f4 + 0.0F, f17 + 0.0F, (f14 + 8.0F) * 0.0039063F + f9, (f15 + 0.0F) * 0.0039063F + f10);
/* 1422:1744 */             localciv.addVertexWithUV(f16 + 0.0F, f4 + 0.0F, f17 + 0.0F, (f14 + 0.0F) * 0.0039063F + f9, (f15 + 0.0F) * 0.0039063F + f10);
/* 1423:     */           }
/* 1424:1747 */           if (f4 <= 5.0F)
/* 1425:     */           {
/* 1426:1748 */             localciv.setColor(f5, f6, f7, 0.8F);
/* 1427:1749 */             localciv.d(0.0F, 1.0F, 0.0F);
/* 1428:1750 */             localciv.addVertexWithUV(f16 + 0.0F, f4 + 4.0F - 0.000976563F, f17 + 8.0F, (f14 + 0.0F) * 0.0039063F + f9, (f15 + 8.0F) * 0.0039063F + f10);
/* 1429:1751 */             localciv.addVertexWithUV(f16 + 8.0F, f4 + 4.0F - 0.000976563F, f17 + 8.0F, (f14 + 8.0F) * 0.0039063F + f9, (f15 + 8.0F) * 0.0039063F + f10);
/* 1430:1752 */             localciv.addVertexWithUV(f16 + 8.0F, f4 + 4.0F - 0.000976563F, f17 + 0.0F, (f14 + 8.0F) * 0.0039063F + f9, (f15 + 0.0F) * 0.0039063F + f10);
/* 1431:1753 */             localciv.addVertexWithUV(f16 + 0.0F, f4 + 4.0F - 0.000976563F, f17 + 0.0F, (f14 + 0.0F) * 0.0039063F + f9, (f15 + 0.0F) * 0.0039063F + f10);
/* 1432:     */           }
/* 1433:1756 */           localciv.setColor(f5 * 0.9F, f6 * 0.9F, f7 * 0.9F, 0.8F);
/* 1434:     */           int i8;
/* 1435:1757 */           if (i6 > -1)
/* 1436:     */           {
/* 1437:1758 */             localciv.d(-1.0F, 0.0F, 0.0F);
/* 1438:1759 */             for (i8 = 0; i8 < 8; i8++)
/* 1439:     */             {
/* 1440:1760 */               localciv.addVertexWithUV(f16 + i8 + 0.0F, f4 + 0.0F, f17 + 8.0F, (f14 + i8 + 0.5F) * 0.0039063F + f9, (f15 + 8.0F) * 0.0039063F + f10);
/* 1441:1761 */               localciv.addVertexWithUV(f16 + i8 + 0.0F, f4 + 4.0F, f17 + 8.0F, (f14 + i8 + 0.5F) * 0.0039063F + f9, (f15 + 8.0F) * 0.0039063F + f10);
/* 1442:1762 */               localciv.addVertexWithUV(f16 + i8 + 0.0F, f4 + 4.0F, f17 + 0.0F, (f14 + i8 + 0.5F) * 0.0039063F + f9, (f15 + 0.0F) * 0.0039063F + f10);
/* 1443:1763 */               localciv.addVertexWithUV(f16 + i8 + 0.0F, f4 + 0.0F, f17 + 0.0F, (f14 + i8 + 0.5F) * 0.0039063F + f9, (f15 + 0.0F) * 0.0039063F + f10);
/* 1444:     */             }
/* 1445:     */           }
/* 1446:1767 */           if (i6 <= 1)
/* 1447:     */           {
/* 1448:1768 */             localciv.d(1.0F, 0.0F, 0.0F);
/* 1449:1769 */             for (i8 = 0; i8 < 8; i8++)
/* 1450:     */             {
/* 1451:1770 */               localciv.addVertexWithUV(f16 + i8 + 1.0F - 0.000976563F, f4 + 0.0F, f17 + 8.0F, (f14 + i8 + 0.5F) * 0.0039063F + f9, (f15 + 8.0F) * 0.0039063F + f10);
/* 1452:1771 */               localciv.addVertexWithUV(f16 + i8 + 1.0F - 0.000976563F, f4 + 4.0F, f17 + 8.0F, (f14 + i8 + 0.5F) * 0.0039063F + f9, (f15 + 8.0F) * 0.0039063F + f10);
/* 1453:1772 */               localciv.addVertexWithUV(f16 + i8 + 1.0F - 0.000976563F, f4 + 4.0F, f17 + 0.0F, (f14 + i8 + 0.5F) * 0.0039063F + f9, (f15 + 0.0F) * 0.0039063F + f10);
/* 1454:1773 */               localciv.addVertexWithUV(f16 + i8 + 1.0F - 0.000976563F, f4 + 0.0F, f17 + 0.0F, (f14 + i8 + 0.5F) * 0.0039063F + f9, (f15 + 0.0F) * 0.0039063F + f10);
/* 1455:     */             }
/* 1456:     */           }
/* 1457:1777 */           localciv.setColor(f5 * 0.8F, f6 * 0.8F, f7 * 0.8F, 0.8F);
/* 1458:1778 */           if (i7 > -1)
/* 1459:     */           {
/* 1460:1779 */             localciv.d(0.0F, 0.0F, -1.0F);
/* 1461:1780 */             for (i8 = 0; i8 < 8; i8++)
/* 1462:     */             {
/* 1463:1781 */               localciv.addVertexWithUV(f16 + 0.0F, f4 + 4.0F, f17 + i8 + 0.0F, (f14 + 0.0F) * 0.0039063F + f9, (f15 + i8 + 0.5F) * 0.0039063F + f10);
/* 1464:1782 */               localciv.addVertexWithUV(f16 + 8.0F, f4 + 4.0F, f17 + i8 + 0.0F, (f14 + 8.0F) * 0.0039063F + f9, (f15 + i8 + 0.5F) * 0.0039063F + f10);
/* 1465:1783 */               localciv.addVertexWithUV(f16 + 8.0F, f4 + 0.0F, f17 + i8 + 0.0F, (f14 + 8.0F) * 0.0039063F + f9, (f15 + i8 + 0.5F) * 0.0039063F + f10);
/* 1466:1784 */               localciv.addVertexWithUV(f16 + 0.0F, f4 + 0.0F, f17 + i8 + 0.0F, (f14 + 0.0F) * 0.0039063F + f9, (f15 + i8 + 0.5F) * 0.0039063F + f10);
/* 1467:     */             }
/* 1468:     */           }
/* 1469:1788 */           if (i7 <= 1)
/* 1470:     */           {
/* 1471:1789 */             localciv.d(0.0F, 0.0F, 1.0F);
/* 1472:1790 */             for (i8 = 0; i8 < 8; i8++)
/* 1473:     */             {
/* 1474:1791 */               localciv.addVertexWithUV(f16 + 0.0F, f4 + 4.0F, f17 + i8 + 1.0F - 0.000976563F, (f14 + 0.0F) * 0.0039063F + f9, (f15 + i8 + 0.5F) * 0.0039063F + f10);
/* 1475:1792 */               localciv.addVertexWithUV(f16 + 8.0F, f4 + 4.0F, f17 + i8 + 1.0F - 0.000976563F, (f14 + 8.0F) * 0.0039063F + f9, (f15 + i8 + 0.5F) * 0.0039063F + f10);
/* 1476:1793 */               localciv.addVertexWithUV(f16 + 8.0F, f4 + 0.0F, f17 + i8 + 1.0F - 0.000976563F, (f14 + 8.0F) * 0.0039063F + f9, (f15 + i8 + 0.5F) * 0.0039063F + f10);
/* 1477:1794 */               localciv.addVertexWithUV(f16 + 0.0F, f4 + 0.0F, f17 + i8 + 1.0F - 0.000976563F, (f14 + 0.0F) * 0.0039063F + f9, (f15 + i8 + 0.5F) * 0.0039063F + f10);
/* 1478:     */             }
/* 1479:     */           }
/* 1480:1797 */           localckx.draw();
/* 1481:     */         }
/* 1482:     */       }
/* 1483:     */     }
/* 1484:1801 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 1485:1802 */     cjm.disableBlend();
/* 1486:1803 */     cjm.o();
/* 1487:     */   }
/* 1488:     */   
/* 1489:     */   public void a(long paramLong)
/* 1490:     */   {
/* 1491:1807 */     this.ab |= this.M.a(paramLong);
/* 1492:1809 */     for (Iterator localIterator = this.l.iterator(); localIterator.hasNext();)
/* 1493:     */     {
/* 1494:1810 */       cop localcop = (cop)localIterator.next();
/* 1495:1812 */       if (!this.M.a(localcop)) {
/* 1496:     */         break;
/* 1497:     */       }
/* 1498:1815 */       localcop.a(false);
/* 1499:     */       
/* 1500:1817 */       localIterator.remove();
/* 1501:     */     }
/* 1502:     */   }
/* 1503:     */   
/* 1504:     */   public void a(Entity paramwv, float paramFloat)
/* 1505:     */   {
/* 1506:1822 */     ckx localckx = ckx.getInstance();
/* 1507:1823 */     VertexBuffer localciv = localckx.getBuffer();
/* 1508:     */     
/* 1509:1825 */     bfb localbfb = this.k.af();
/* 1510:     */     
/* 1511:1827 */     double d1 = this.h.t.c * 16;
/* 1512:1829 */     if ((paramwv.xPos < localbfb.d() - d1) && (paramwv.xPos > localbfb.b() + d1) && (paramwv.zPos < localbfb.e() - d1) && (paramwv.zPos > localbfb.c() + d1)) {
/* 1513:1830 */       return;
/* 1514:     */     }
/* 1515:1833 */     double d2 = 1.0D - localbfb.a(paramwv) / d1;
/* 1516:1834 */     d2 = Math.pow(d2, 4.0D);
/* 1517:     */     
/* 1518:1836 */     double d3 = paramwv.P + (paramwv.xPos - paramwv.P) * paramFloat;
/* 1519:1837 */     double d4 = paramwv.Q + (paramwv.yPos - paramwv.Q) * paramFloat;
/* 1520:1838 */     double d5 = paramwv.R + (paramwv.zPos - paramwv.R) * paramFloat;
/* 1521:     */     
/* 1522:1840 */     cjm.enableBlend();
/* 1523:1841 */     cjm.glBlendFuncSeparate(770, 1, 1, 0);
/* 1524:1842 */     this.i.a(g);
/* 1525:     */     
/* 1526:1844 */     cjm.a(false);
/* 1527:1845 */     cjm.glPushMatrix();
/* 1528:     */     
/* 1529:1847 */     int i1 = localbfb.a().a();
/* 1530:1848 */     float f1 = (i1 >> 16 & 0xFF) / 255.0F;
/* 1531:1849 */     float f2 = (i1 >> 8 & 0xFF) / 255.0F;
/* 1532:1850 */     float f3 = (i1 & 0xFF) / 255.0F;
/* 1533:1851 */     cjm.c(f1, f2, f3, (float)d2);
/* 1534:1852 */     cjm.a(-3.0F, -3.0F);
/* 1535:1853 */     cjm.q();
/* 1536:1854 */     cjm.glAlphaFunc(516, 0.1F);
/* 1537:1855 */     cjm.enableAlphaTest();
/* 1538:1856 */     cjm.p();
/* 1539:     */     
/* 1540:1858 */     float f4 = (float)(bsu.I() % 3000L) / 3000.0F;
/* 1541:1859 */     float f5 = 0.0F;
/* 1542:1860 */     float f6 = 0.0F;
/* 1543:1861 */     float f7 = 128.0F;
/* 1544:1862 */     localciv.begin();
/* 1545:1863 */     localciv.c(-d3, -d4, -d5);
/* 1546:1864 */     localciv.c();
/* 1547:     */     
/* 1548:1866 */     double d6 = Math.max(MathUtils.floor(d5 - d1), localbfb.c());
/* 1549:1867 */     double d7 = Math.min(MathUtils.ceil(d5 + d1), localbfb.e());
/* 1550:     */     float f8;
/* 1551:     */     double d8;
/* 1552:     */     double d9;
/* 1553:     */     float f9;
/* 1554:1868 */     if (d3 > localbfb.d() - d1)
/* 1555:     */     {
/* 1556:1869 */       f8 = 0.0F;
/* 1557:1870 */       for (d8 = d6; d8 < d7; f8 += 0.5F)
/* 1558:     */       {
/* 1559:1871 */         d9 = Math.min(1.0D, d7 - d8);
/* 1560:1872 */         f9 = (float)d9 * 0.5F;
/* 1561:1873 */         localciv.addVertexWithUV(localbfb.d(), 256.0D, d8, f4 + f8, f4 + 0.0F);
/* 1562:1874 */         localciv.addVertexWithUV(localbfb.d(), 256.0D, d8 + d9, f4 + f9 + f8, f4 + 0.0F);
/* 1563:1875 */         localciv.addVertexWithUV(localbfb.d(), 0.0D, d8 + d9, f4 + f9 + f8, f4 + 128.0F);
/* 1564:1876 */         localciv.addVertexWithUV(localbfb.d(), 0.0D, d8, f4 + f8, f4 + 128.0F);d8 += 1.0D;
/* 1565:     */       }
/* 1566:     */     }
/* 1567:1879 */     if (d3 < localbfb.b() + d1)
/* 1568:     */     {
/* 1569:1880 */       f8 = 0.0F;
/* 1570:1881 */       for (d8 = d6; d8 < d7; f8 += 0.5F)
/* 1571:     */       {
/* 1572:1882 */         d9 = Math.min(1.0D, d7 - d8);
/* 1573:1883 */         f9 = (float)d9 * 0.5F;
/* 1574:1884 */         localciv.addVertexWithUV(localbfb.b(), 256.0D, d8, f4 + f8, f4 + 0.0F);
/* 1575:1885 */         localciv.addVertexWithUV(localbfb.b(), 256.0D, d8 + d9, f4 + f9 + f8, f4 + 0.0F);
/* 1576:1886 */         localciv.addVertexWithUV(localbfb.b(), 0.0D, d8 + d9, f4 + f9 + f8, f4 + 128.0F);
/* 1577:1887 */         localciv.addVertexWithUV(localbfb.b(), 0.0D, d8, f4 + f8, f4 + 128.0F);d8 += 1.0D;
/* 1578:     */       }
/* 1579:     */     }
/* 1580:1891 */     d6 = Math.max(MathUtils.floor(d3 - d1), localbfb.b());
/* 1581:1892 */     d7 = Math.min(MathUtils.ceil(d3 + d1), localbfb.d());
/* 1582:1893 */     if (d5 > localbfb.e() - d1)
/* 1583:     */     {
/* 1584:1894 */       f8 = 0.0F;
/* 1585:1895 */       for (d8 = d6; d8 < d7; f8 += 0.5F)
/* 1586:     */       {
/* 1587:1896 */         d9 = Math.min(1.0D, d7 - d8);
/* 1588:1897 */         f9 = (float)d9 * 0.5F;
/* 1589:1898 */         localciv.addVertexWithUV(d8, 256.0D, localbfb.e(), f4 + f8, f4 + 0.0F);
/* 1590:1899 */         localciv.addVertexWithUV(d8 + d9, 256.0D, localbfb.e(), f4 + f9 + f8, f4 + 0.0F);
/* 1591:1900 */         localciv.addVertexWithUV(d8 + d9, 0.0D, localbfb.e(), f4 + f9 + f8, f4 + 128.0F);
/* 1592:1901 */         localciv.addVertexWithUV(d8, 0.0D, localbfb.e(), f4 + f8, f4 + 128.0F);d8 += 1.0D;
/* 1593:     */       }
/* 1594:     */     }
/* 1595:1904 */     if (d5 < localbfb.c() + d1)
/* 1596:     */     {
/* 1597:1905 */       f8 = 0.0F;
/* 1598:1906 */       for (d8 = d6; d8 < d7; f8 += 0.5F)
/* 1599:     */       {
/* 1600:1907 */         d9 = Math.min(1.0D, d7 - d8);
/* 1601:1908 */         f9 = (float)d9 * 0.5F;
/* 1602:1909 */         localciv.addVertexWithUV(d8, 256.0D, localbfb.c(), f4 + f8, f4 + 0.0F);
/* 1603:1910 */         localciv.addVertexWithUV(d8 + d9, 256.0D, localbfb.c(), f4 + f9 + f8, f4 + 0.0F);
/* 1604:1911 */         localciv.addVertexWithUV(d8 + d9, 0.0D, localbfb.c(), f4 + f9 + f8, f4 + 128.0F);
/* 1605:1912 */         localciv.addVertexWithUV(d8, 0.0D, localbfb.c(), f4 + f8, f4 + 128.0F);d8 += 1.0D;
/* 1606:     */       }
/* 1607:     */     }
/* 1608:1916 */     localckx.draw();
/* 1609:1917 */     localciv.c(0.0D, 0.0D, 0.0D);
/* 1610:     */     
/* 1611:1919 */     cjm.o();
/* 1612:1920 */     cjm.disableAlphaTest();
/* 1613:1921 */     cjm.a(0.0F, 0.0F);
/* 1614:1922 */     cjm.r();
/* 1615:1923 */     cjm.enableAlphaTest();
/* 1616:1924 */     cjm.disableBlend();
/* 1617:     */     
/* 1618:1926 */     cjm.glPopMatrix();
/* 1619:1927 */     cjm.a(true);
/* 1620:     */   }
/* 1621:     */   
/* 1622:     */   private void s()
/* 1623:     */   {
/* 1624:1931 */     cjm.glBlendFuncSeparate(774, 768, 1, 0);
/* 1625:1932 */     cjm.enableBlend();
/* 1626:     */     
/* 1627:1934 */     cjm.c(1.0F, 1.0F, 1.0F, 0.5F);
/* 1628:1935 */     cjm.a(-3.0F, -3.0F);
/* 1629:1936 */     cjm.q();
/* 1630:1937 */     cjm.glAlphaFunc(516, 0.1F);
/* 1631:1938 */     cjm.enableAlphaTest();
/* 1632:     */     
/* 1633:1940 */     cjm.glPushMatrix();
/* 1634:     */   }
/* 1635:     */   
/* 1636:     */   private void t()
/* 1637:     */   {
/* 1638:1944 */     cjm.disableAlphaTest();
/* 1639:1945 */     cjm.a(0.0F, 0.0F);
/* 1640:1946 */     cjm.r();
/* 1641:1947 */     cjm.enableAlphaTest();
/* 1642:     */     
/* 1643:1949 */     cjm.a(true);
/* 1644:1950 */     cjm.glPopMatrix();
/* 1645:     */   }
/* 1646:     */   
/* 1647:     */   public void a(ckx paramckx, VertexBuffer paramciv, Entity paramwv, float paramFloat)
/* 1648:     */   {
/* 1649:1954 */     double d1 = paramwv.P + (paramwv.xPos - paramwv.P) * paramFloat;
/* 1650:1955 */     double d2 = paramwv.Q + (paramwv.yPos - paramwv.Q) * paramFloat;
/* 1651:1956 */     double d3 = paramwv.R + (paramwv.zPos - paramwv.R) * paramFloat;
/* 1652:1958 */     if (!this.w.isEmpty())
/* 1653:     */     {
/* 1654:1959 */       this.i.a(cua.g);
/* 1655:1960 */       s();
/* 1656:     */       
/* 1657:1962 */       paramciv.begin();
/* 1658:1963 */       paramciv.setFormat(cuq.a);
/* 1659:1964 */       paramciv.c(-d1, -d2, -d3);
/* 1660:1965 */       paramciv.c();
/* 1661:     */       
/* 1662:1967 */       Iterator localIterator = this.w.values().iterator();
/* 1663:1968 */       while (localIterator.hasNext())
/* 1664:     */       {
/* 1665:1969 */         qi localqi = (qi)localIterator.next();
/* 1666:1970 */         BlockPosition localdt = localqi.b();
/* 1667:1971 */         double d4 = localdt.getX() - d1;
/* 1668:1972 */         double d5 = localdt.getY() - d2;
/* 1669:1973 */         double d6 = localdt.getZ() - d3;
/* 1670:1974 */         ProtoBlock localatr = this.k.getBlock(localdt).getProto();
/* 1671:1975 */         if ((!(localatr instanceof BlockChest)) && (!(localatr instanceof avr)) && (!(localatr instanceof bai)) && (!(localatr instanceof baj))) {
/* 1672:1978 */           if (d4 * d4 + d5 * d5 + d6 * d6 > 1024.0D)
/* 1673:     */           {
/* 1674:1980 */             localIterator.remove();
/* 1675:     */           }
/* 1676:     */           else
/* 1677:     */           {
/* 1678:1982 */             Block localbec = this.k.getBlock(localdt);
/* 1679:1983 */             if (localbec.getProto().getMaterial() != Material.air)
/* 1680:     */             {
/* 1681:1985 */               int i1 = localqi.c();
/* 1682:1986 */               cue localcue = this.y[i1];
/* 1683:1987 */               cll localcll = this.h.ab();
/* 1684:1988 */               localcll.a(localbec, localdt, localcue, this.k);
/* 1685:     */             }
/* 1686:     */           }
/* 1687:     */         }
/* 1688:     */       }
/* 1689:1993 */       paramckx.draw();
/* 1690:1994 */       paramciv.c(0.0D, 0.0D, 0.0D);
/* 1691:1995 */       t();
/* 1692:     */     }
/* 1693:     */   }
/* 1694:     */   
/* 1695:     */   public void a(EntityPlayer paramahd, HitResult parambru, int paramInt, float paramFloat)
/* 1696:     */   {
/* 1697:2000 */     if ((paramInt == 0) && (parambru.a == brv.BLOCK))
/* 1698:     */     {
/* 1699:2001 */       cjm.enableBlend();
/* 1700:2002 */       cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 1701:2003 */       cjm.c(0.0F, 0.0F, 0.0F, 0.4F);
/* 1702:2004 */       GL11.glLineWidth(2.0F);
/* 1703:2005 */       cjm.x();
/* 1704:2006 */       cjm.a(false);
/* 1705:2007 */       float f1 = 0.002F;
/* 1706:     */       
/* 1707:2009 */       BlockPosition localdt = parambru.a();
/* 1708:2010 */       ProtoBlock localatr = this.k.getBlock(localdt).getProto();
/* 1709:2011 */       if ((localatr.getMaterial() != Material.air) && (this.k.af().a(localdt)))
/* 1710:     */       {
/* 1711:2012 */         localatr.a(this.k, localdt);
/* 1712:2013 */         double d1 = paramahd.P + (paramahd.xPos - paramahd.P) * paramFloat;
/* 1713:2014 */         double d2 = paramahd.Q + (paramahd.yPos - paramahd.Q) * paramFloat;
/* 1714:2015 */         double d3 = paramahd.R + (paramahd.zPos - paramahd.R) * paramFloat;
/* 1715:2016 */         a(localatr.a(this.k, localdt).expand(0.002000000094994903D, 0.002000000094994903D, 0.002000000094994903D).offset(-d1, -d2, -d3), -1);
/* 1716:     */       }
/* 1717:2018 */       cjm.a(true);
/* 1718:2019 */       cjm.w();
/* 1719:2020 */       cjm.disableBlend();
/* 1720:     */     }
/* 1721:     */   }
/* 1722:     */   
/* 1723:     */   public static void a(AABB parambrt, int paramInt)
/* 1724:     */   {
/* 1725:2025 */     ckx localckx = ckx.getInstance();
/* 1726:2026 */     VertexBuffer localciv = localckx.getBuffer();
/* 1727:     */     
/* 1728:2028 */     localciv.a(3);
/* 1729:2029 */     if (paramInt != -1) {
/* 1730:2030 */       localciv.setColor(paramInt);
/* 1731:     */     }
/* 1732:2032 */     localciv.addVertex(parambrt.minX, parambrt.minY, parambrt.minZ);
/* 1733:2033 */     localciv.addVertex(parambrt.maxX, parambrt.minY, parambrt.minZ);
/* 1734:2034 */     localciv.addVertex(parambrt.maxX, parambrt.minY, parambrt.maxZ);
/* 1735:2035 */     localciv.addVertex(parambrt.minX, parambrt.minY, parambrt.maxZ);
/* 1736:2036 */     localciv.addVertex(parambrt.minX, parambrt.minY, parambrt.minZ);
/* 1737:2037 */     localckx.draw();
/* 1738:     */     
/* 1739:2039 */     localciv.a(3);
/* 1740:2040 */     if (paramInt != -1) {
/* 1741:2041 */       localciv.setColor(paramInt);
/* 1742:     */     }
/* 1743:2043 */     localciv.addVertex(parambrt.minX, parambrt.maxY, parambrt.minZ);
/* 1744:2044 */     localciv.addVertex(parambrt.maxX, parambrt.maxY, parambrt.minZ);
/* 1745:2045 */     localciv.addVertex(parambrt.maxX, parambrt.maxY, parambrt.maxZ);
/* 1746:2046 */     localciv.addVertex(parambrt.minX, parambrt.maxY, parambrt.maxZ);
/* 1747:2047 */     localciv.addVertex(parambrt.minX, parambrt.maxY, parambrt.minZ);
/* 1748:2048 */     localckx.draw();
/* 1749:     */     
/* 1750:2050 */     localciv.a(1);
/* 1751:2051 */     if (paramInt != -1) {
/* 1752:2052 */       localciv.setColor(paramInt);
/* 1753:     */     }
/* 1754:2054 */     localciv.addVertex(parambrt.minX, parambrt.minY, parambrt.minZ);
/* 1755:2055 */     localciv.addVertex(parambrt.minX, parambrt.maxY, parambrt.minZ);
/* 1756:2056 */     localciv.addVertex(parambrt.maxX, parambrt.minY, parambrt.minZ);
/* 1757:2057 */     localciv.addVertex(parambrt.maxX, parambrt.maxY, parambrt.minZ);
/* 1758:2058 */     localciv.addVertex(parambrt.maxX, parambrt.minY, parambrt.maxZ);
/* 1759:2059 */     localciv.addVertex(parambrt.maxX, parambrt.maxY, parambrt.maxZ);
/* 1760:2060 */     localciv.addVertex(parambrt.minX, parambrt.minY, parambrt.maxZ);
/* 1761:2061 */     localciv.addVertex(parambrt.minX, parambrt.maxY, parambrt.maxZ);
/* 1762:2062 */     localckx.draw();
/* 1763:     */   }
/* 1764:     */   
/* 1765:     */   private void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 1766:     */   {
/* 1767:2066 */     this.n.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/* 1768:     */   }
/* 1769:     */   
/* 1770:     */   public void a(BlockPosition paramdt)
/* 1771:     */   {
/* 1772:2071 */     int i1 = paramdt.getX();
/* 1773:2072 */     int i2 = paramdt.getY();
/* 1774:2073 */     int i3 = paramdt.getZ();
/* 1775:2074 */     b(i1 - 1, i2 - 1, i3 - 1, i1 + 1, i2 + 1, i3 + 1);
/* 1776:     */   }
/* 1777:     */   
/* 1778:     */   public void b(BlockPosition paramdt)
/* 1779:     */   {
/* 1780:2079 */     int i1 = paramdt.getX();
/* 1781:2080 */     int i2 = paramdt.getY();
/* 1782:2081 */     int i3 = paramdt.getZ();
/* 1783:2082 */     b(i1 - 1, i2 - 1, i3 - 1, i1 + 1, i2 + 1, i3 + 1);
/* 1784:     */   }
/* 1785:     */   
/* 1786:     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 1787:     */   {
/* 1788:2087 */     b(paramInt1 - 1, paramInt2 - 1, paramInt3 - 1, paramInt4 + 1, paramInt5 + 1, paramInt6 + 1);
/* 1789:     */   }
/* 1790:     */   
/* 1791:     */   public void a(String paramString, BlockPosition paramdt)
/* 1792:     */   {
/* 1793:2092 */     Object localObject = (cye)this.x.get(paramdt);
/* 1794:2094 */     if (localObject != null)
/* 1795:     */     {
/* 1796:2095 */       this.h.U().b((cye)localObject);
/* 1797:2096 */       this.x.remove(paramdt);
/* 1798:     */     }
/* 1799:2099 */     if (paramString != null)
/* 1800:     */     {
/* 1801:2100 */       ItemDisc localamy = ItemDisc.b(paramString);
/* 1802:2101 */       if (localamy != null) {
/* 1803:2102 */         this.h.q.a(localamy.g());
/* 1804:     */       }
/* 1805:2104 */       localObject = cxy.a(new oa(paramString), paramdt.getX(), paramdt.getY(), paramdt.getZ());
/* 1806:2105 */       this.x.put(paramdt, localObject);
/* 1807:2106 */       this.h.U().a((cye)localObject);
/* 1808:     */     }
/* 1809:     */   }
/* 1810:     */   
/* 1811:     */   public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {}
/* 1812:     */   
/* 1813:     */   public void a(EntityPlayer paramahd, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {}
/* 1814:     */   
/* 1815:     */   public void a(int paramInt, boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int... paramVarArgs)
/* 1816:     */   {
/* 1817:     */     try
/* 1818:     */     {
/* 1819:2121 */       b(paramInt, paramBoolean, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramVarArgs);
/* 1820:     */     }
/* 1821:     */     catch (Throwable localThrowable)
/* 1822:     */     {
/* 1823:2123 */       b localb = net.minecraft.src.b.a(localThrowable, "Exception while adding particle");
/* 1824:2124 */       j localj = localb.a("Particle being added");
/* 1825:     */       
/* 1826:2126 */       localj.a("ID", Integer.valueOf(paramInt));
/* 1827:2127 */       if (paramVarArgs != null) {
/* 1828:2128 */         localj.a("Parameters", paramVarArgs);
/* 1829:     */       }
/* 1830:2130 */       localj.a("Position", new cko(this, paramDouble1, paramDouble2, paramDouble3));
/* 1831:     */       
/* 1832:     */ 
/* 1833:     */ 
/* 1834:     */ 
/* 1835:     */ 
/* 1836:     */ 
/* 1837:2137 */       throw new u(localb);
/* 1838:     */     }
/* 1839:     */   }
/* 1840:     */   
/* 1841:     */   private void a(EnumParticleEffect paramew, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int... paramVarArgs)
/* 1842:     */   {
/* 1843:2142 */     a(paramew.c(), paramew.e(), paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramVarArgs);
/* 1844:     */   }
/* 1845:     */   
/* 1846:     */   private cgw b(int paramInt, boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int... paramVarArgs)
/* 1847:     */   {
/* 1848:2147 */     if ((this.h == null) || (this.h.aa() == null) || (this.h.j == null)) {
/* 1849:2148 */       return null;
/* 1850:     */     }
/* 1851:2151 */     int i1 = this.h.t.aH;
/* 1852:2153 */     if (i1 == 1) {
/* 1853:2155 */       if (this.k.rng.nextInt(3) == 0) {
/* 1854:2156 */         i1 = 2;
/* 1855:     */       }
/* 1856:     */     }
/* 1857:2160 */     double d1 = this.h.aa().xPos - paramDouble1;
/* 1858:2161 */     double d2 = this.h.aa().yPos - paramDouble2;
/* 1859:2162 */     double d3 = this.h.aa().zPos - paramDouble3;
/* 1860:2164 */     if (paramBoolean) {
/* 1861:2165 */       return this.h.j.a(paramInt, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramVarArgs);
/* 1862:     */     }
/* 1863:2168 */     double d4 = 16.0D;
/* 1864:2169 */     if (d1 * d1 + d2 * d2 + d3 * d3 > 256.0D) {
/* 1865:2170 */       return null;
/* 1866:     */     }
/* 1867:2173 */     if (i1 > 1) {
/* 1868:2175 */       return null;
/* 1869:     */     }
/* 1870:2178 */     return this.h.j.a(paramInt, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramVarArgs);
/* 1871:     */   }
/* 1872:     */   
/* 1873:     */   public void obtainEntitySkin(Entity paramwv) {}
/* 1874:     */   
/* 1875:     */   public void releaseEntitySkin(Entity paramwv) {}
/* 1876:     */   
/* 1877:     */   public void k() {}
/* 1878:     */   
/* 1879:     */   public void a(int paramInt1, BlockPosition paramdt, int paramInt2)
/* 1880:     */   {
/* 1881:2194 */     switch (paramInt1)
/* 1882:     */     {
/* 1883:     */     case 1013: 
/* 1884:     */     case 1018: 
/* 1885:2197 */       if (this.h.aa() != null)
/* 1886:     */       {
/* 1887:2199 */         double d1 = paramdt.getX() - this.h.aa().xPos;
/* 1888:2200 */         double d2 = paramdt.getY() - this.h.aa().yPos;
/* 1889:2201 */         double d3 = paramdt.getZ() - this.h.aa().zPos;
/* 1890:     */         
/* 1891:2203 */         double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
/* 1892:2204 */         double d5 = this.h.aa().xPos;
/* 1893:2205 */         double d6 = this.h.aa().yPos;
/* 1894:2206 */         double d7 = this.h.aa().zPos;
/* 1895:2208 */         if (d4 > 0.0D)
/* 1896:     */         {
/* 1897:2209 */           d5 += d1 / d4 * 2.0D;
/* 1898:2210 */           d6 += d2 / d4 * 2.0D;
/* 1899:2211 */           d7 += d3 / d4 * 2.0D;
/* 1900:     */         }
/* 1901:2213 */         if (paramInt1 == 1013) {
/* 1902:2214 */           this.k.a(d5, d6, d7, "mob.wither.spawn", 1.0F, 1.0F, false);
/* 1903:     */         } else {
/* 1904:2216 */           this.k.a(d5, d6, d7, "mob.enderdragon.end", 5.0F, 1.0F, false);
/* 1905:     */         }
/* 1906:     */       }
/* 1907:     */       break;
/* 1908:     */     }
/* 1909:     */   }
/* 1910:     */   
/* 1911:     */   public void playLevelEvent(EntityPlayer paramahd, int paramInt1, BlockPosition paramdt, int paramInt2)
/* 1912:     */   {
/* 1913:2225 */     Random localRandom = this.k.rng;
/* 1914:     */     double d2;
/* 1915:     */     double d3;
/* 1916:     */     double d1;
/* 1917:     */     int i6;
/* 1918:     */     double d8;
/* 1919:     */     double d10;
/* 1920:     */     double d12;
/* 1921:2227 */     switch (paramInt1)
/* 1922:     */     {
/* 1923:     */     case 1001: 
/* 1924:2229 */       this.k.a(paramdt, "random.click", 1.0F, 1.2F, false);
/* 1925:2230 */       break;
/* 1926:     */     case 1000: 
/* 1927:2232 */       this.k.a(paramdt, "random.click", 1.0F, 1.0F, false);
/* 1928:2233 */       break;
/* 1929:     */     case 1002: 
/* 1930:2235 */       this.k.a(paramdt, "random.bow", 1.0F, 1.2F, false);
/* 1931:2236 */       break;
/* 1932:     */     case 2000: 
/* 1933:2238 */       int i1 = paramInt2 % 3 - 1;
/* 1934:2239 */       int i2 = paramInt2 / 3 % 3 - 1;
/* 1935:2240 */       d2 = paramdt.getX() + i1 * 0.6D + 0.5D;
/* 1936:2241 */       d3 = paramdt.getY() + 0.5D;
/* 1937:2242 */       double d4 = paramdt.getZ() + i2 * 0.6D + 0.5D;
/* 1938:2243 */       for (int i5 = 0; i5 < 10; i5++)
/* 1939:     */       {
/* 1940:2244 */         double d6 = localRandom.nextDouble() * 0.2D + 0.01D;
/* 1941:2245 */         double d7 = d2 + i1 * 0.01D + (localRandom.nextDouble() - 0.5D) * i2 * 0.5D;
/* 1942:2246 */         double d9 = d3 + (localRandom.nextDouble() - 0.5D) * 0.5D;
/* 1943:2247 */         double d11 = d4 + i2 * 0.01D + (localRandom.nextDouble() - 0.5D) * i1 * 0.5D;
/* 1944:2248 */         double d13 = i1 * d6 + localRandom.nextGaussian() * 0.01D;
/* 1945:2249 */         double d15 = -0.03D + localRandom.nextGaussian() * 0.01D;
/* 1946:2250 */         double d17 = i2 * d6 + localRandom.nextGaussian() * 0.01D;
/* 1947:2251 */         a(EnumParticleEffect.l, d7, d9, d11, d13, d15, d17, new int[0]);
/* 1948:     */       }
/* 1949:2254 */       break;
/* 1950:     */     case 2003: 
/* 1951:2256 */       d1 = paramdt.getX() + 0.5D;
/* 1952:2257 */       d2 = paramdt.getY();
/* 1953:2258 */       d3 = paramdt.getZ() + 0.5D;
/* 1954:2260 */       for (int i3 = 0; i3 < 8; i3++) {
/* 1955:2261 */         a(EnumParticleEffect.K, d1, d2, d3, localRandom.nextGaussian() * 0.15D, localRandom.nextDouble() * 0.2D, localRandom.nextGaussian() * 0.15D, new int[] { Item.b(ItemList.enderEye) });
/* 1956:     */       }
/* 1957:2263 */       for (double d5 = 0.0D; d5 < 6.283185307179586D; d5 += 0.1570796326794897D)
/* 1958:     */       {
/* 1959:2264 */         a(EnumParticleEffect.y, d1 + Math.cos(d5) * 5.0D, d2 - 0.4D, d3 + Math.sin(d5) * 5.0D, Math.cos(d5) * -5.0D, 0.0D, Math.sin(d5) * -5.0D, new int[0]);
/* 1960:2265 */         a(EnumParticleEffect.y, d1 + Math.cos(d5) * 5.0D, d2 - 0.4D, d3 + Math.sin(d5) * 5.0D, Math.cos(d5) * -7.0D, 0.0D, Math.sin(d5) * -7.0D, new int[0]);
/* 1961:     */       }
/* 1962:2268 */       break;
/* 1963:     */     case 2002: 
/* 1964:2270 */       d1 = paramdt.getX();
/* 1965:2271 */       d2 = paramdt.getY();
/* 1966:2272 */       d3 = paramdt.getZ();
/* 1967:2274 */       for (int i4 = 0; i4 < 8; i4++) {
/* 1968:2275 */         a(EnumParticleEffect.K, d1, d2, d3, localRandom.nextGaussian() * 0.15D, localRandom.nextDouble() * 0.2D, localRandom.nextGaussian() * 0.15D, new int[] { Item.b(ItemList.potion), paramInt2 });
/* 1969:     */       }
/* 1970:2278 */       int i4 = ItemList.potion.g(paramInt2);
/* 1971:     */       
/* 1972:2280 */       float f1 = (i4 >> 16 & 0xFF) / 255.0F;
/* 1973:2281 */       float f2 = (i4 >> 8 & 0xFF) / 255.0F;
/* 1974:2282 */       float f3 = (i4 >> 0 & 0xFF) / 255.0F;
/* 1975:     */       
/* 1976:2284 */       EnumParticleEffect localew = EnumParticleEffect.n;
/* 1977:2285 */       if (ItemList.potion.h(paramInt2)) {
/* 1978:2286 */         localew = EnumParticleEffect.o;
/* 1979:     */       }
/* 1980:2289 */       for (i6 = 0; i6 < 100; i6++)
/* 1981:     */       {
/* 1982:2290 */         d8 = localRandom.nextDouble() * 4.0D;
/* 1983:2291 */         d10 = localRandom.nextDouble() * 3.141592653589793D * 2.0D;
/* 1984:2292 */         d12 = Math.cos(d10) * d8;
/* 1985:2293 */         double d14 = 0.01D + localRandom.nextDouble() * 0.5D;
/* 1986:2294 */         double d16 = Math.sin(d10) * d8;
/* 1987:     */         
/* 1988:2296 */         cgw localcgw = b(localew.c(), localew.e(), d1 + d12 * 0.1D, d2 + 0.3D, d3 + d16 * 0.1D, d12, d14, d16, new int[0]);
/* 1989:2297 */         if (localcgw != null)
/* 1990:     */         {
/* 1991:2298 */           float f4 = 0.75F + localRandom.nextFloat() * 0.25F;
/* 1992:2299 */           localcgw.b(f1 * f4, f2 * f4, f3 * f4);
/* 1993:2300 */           localcgw.a((float)d8);
/* 1994:     */         }
/* 1995:     */       }
/* 1996:2303 */       this.k.a(paramdt, "game.potion.smash", 1.0F, this.k.rng.nextFloat() * 0.1F + 0.9F, false);
/* 1997:2304 */       break;
/* 1998:     */     case 2001: 
/* 1999:2306 */       ProtoBlock localatr = ProtoBlock.c(paramInt2 & 0xFFF);
/* 2000:2307 */       if (localatr.getMaterial() != Material.air) {
/* 2001:2308 */         this.h.U().a(new cxy(new oa(localatr.H.a()), (localatr.H.d() + 1.0F) / 2.0F, localatr.H.e() * 0.8F, paramdt.getX() + 0.5F, paramdt.getY() + 0.5F, paramdt.getZ() + 0.5F));
/* 2002:     */       }
/* 2003:2310 */       this.h.j.a(paramdt, localatr.instance(paramInt2 >> 12 & 0xFF));
/* 2004:2311 */       break;
/* 2005:     */     case 2004: 
/* 2006:2313 */       for (i6 = 0; i6 < 20; i6++)
/* 2007:     */       {
/* 2008:2314 */         d8 = paramdt.getX() + 0.5D + (this.k.rng.nextFloat() - 0.5D) * 2.0D;
/* 2009:2315 */         d10 = paramdt.getY() + 0.5D + (this.k.rng.nextFloat() - 0.5D) * 2.0D;
/* 2010:2316 */         d12 = paramdt.getZ() + 0.5D + (this.k.rng.nextFloat() - 0.5D) * 2.0D;
/* 2011:     */         
/* 2012:2318 */         this.k.a(EnumParticleEffect.l, d8, d10, d12, 0.0D, 0.0D, 0.0D, new int[0]);
/* 2013:2319 */         this.k.a(EnumParticleEffect.A, d8, d10, d12, 0.0D, 0.0D, 0.0D, new int[0]);
/* 2014:     */       }
/* 2015:2321 */       break;
/* 2016:     */     case 2005: 
/* 2017:2323 */       akw.a(this.k, paramdt, paramInt2);
/* 2018:2324 */       break;
/* 2019:     */     case 1006: 
/* 2020:2326 */       this.k.a(paramdt, "random.door_close", 1.0F, this.k.rng.nextFloat() * 0.1F + 0.9F, false);
/* 2021:2327 */       break;
/* 2022:     */     case 1003: 
/* 2023:2329 */       this.k.a(paramdt, "random.door_open", 1.0F, this.k.rng.nextFloat() * 0.1F + 0.9F, false);
/* 2024:2330 */       break;
/* 2025:     */     case 1004: 
/* 2026:2332 */       this.k.a(paramdt, "random.fizz", 0.5F, 2.6F + (localRandom.nextFloat() - localRandom.nextFloat()) * 0.8F, false);
/* 2027:2333 */       break;
/* 2028:     */     case 1020: 
/* 2029:2335 */       this.k.a(paramdt, "random.anvil_break", 1.0F, this.k.rng.nextFloat() * 0.1F + 0.9F, false);
/* 2030:2336 */       break;
/* 2031:     */     case 1021: 
/* 2032:2338 */       this.k.a(paramdt, "random.anvil_use", 1.0F, this.k.rng.nextFloat() * 0.1F + 0.9F, false);
/* 2033:2339 */       break;
/* 2034:     */     case 1022: 
/* 2035:2341 */       this.k.a(paramdt, "random.anvil_land", 0.3F, this.k.rng.nextFloat() * 0.1F + 0.9F, false);
/* 2036:2342 */       break;
/* 2037:     */     case 1005: 
/* 2038:2344 */       if ((Item.b(paramInt2) instanceof ItemDisc)) {
/* 2039:2345 */         this.k.a(paramdt, "records." + ((ItemDisc)Item.b(paramInt2)).a);
/* 2040:     */       } else {
/* 2041:2347 */         this.k.a(paramdt, (String)null);
/* 2042:     */       }
/* 2043:2349 */       break;
/* 2044:     */     case 1007: 
/* 2045:2351 */       this.k.a(paramdt, "mob.ghast.charge", 10.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 2046:2352 */       break;
/* 2047:     */     case 1008: 
/* 2048:2354 */       this.k.a(paramdt, "mob.ghast.fireball", 10.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 2049:2355 */       break;
/* 2050:     */     case 1010: 
/* 2051:2357 */       this.k.a(paramdt, "mob.zombie.wood", 2.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 2052:2358 */       break;
/* 2053:     */     case 1012: 
/* 2054:2360 */       this.k.a(paramdt, "mob.zombie.woodbreak", 2.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 2055:2361 */       break;
/* 2056:     */     case 1011: 
/* 2057:2363 */       this.k.a(paramdt, "mob.zombie.metal", 2.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 2058:2364 */       break;
/* 2059:     */     case 1009: 
/* 2060:2366 */       this.k.a(paramdt, "mob.ghast.fireball", 2.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 2061:2367 */       break;
/* 2062:     */     case 1014: 
/* 2063:2369 */       this.k.a(paramdt, "mob.wither.shoot", 2.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 2064:2370 */       break;
/* 2065:     */     case 1016: 
/* 2066:2372 */       this.k.a(paramdt, "mob.zombie.infect", 2.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 2067:2373 */       break;
/* 2068:     */     case 1017: 
/* 2069:2375 */       this.k.a(paramdt, "mob.zombie.unfect", 2.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 2070:2376 */       break;
/* 2071:     */     case 1015: 
/* 2072:2378 */       this.k.a(paramdt, "mob.bat.takeoff", 0.05F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 2073:     */     }
/* 2074:     */   }
/* 2075:     */   
/* 2076:     */   public void b(int paramInt1, BlockPosition paramdt, int paramInt2)
/* 2077:     */   {
/* 2078:2385 */     if ((paramInt2 < 0) || (paramInt2 >= 10))
/* 2079:     */     {
/* 2080:2386 */       this.w.remove(Integer.valueOf(paramInt1));
/* 2081:     */     }
/* 2082:     */     else
/* 2083:     */     {
/* 2084:2388 */       qi localqi = (qi)this.w.get(Integer.valueOf(paramInt1));
/* 2085:2390 */       if ((localqi == null) || (localqi.b().getX() != paramdt.getX()) || (localqi.b().getY() != paramdt.getY()) || (localqi.b().getZ() != paramdt.getZ()))
/* 2086:     */       {
/* 2087:2391 */         localqi = new qi(paramInt1, paramdt);
/* 2088:2392 */         this.w.put(Integer.valueOf(paramInt1), localqi);
/* 2089:     */       }
/* 2090:2395 */       localqi.a(paramInt2);
/* 2091:2396 */       localqi.b(this.v);
/* 2092:     */     }
/* 2093:     */   }
/* 2094:     */   
/* 2095:     */   public void m()
/* 2096:     */   {
/* 2097:2419 */     this.ab = true;
/* 2098:     */   }
/* 2099:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ckn
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*    1:     */ import com.google.gson.JsonSyntaxException;
/*    2:     */ import java.io.IOException;
/*    3:     */ import java.nio.FloatBuffer;
/*    4:     */ import java.util.List;
/*    5:     */ import java.util.Random;
/*    6:     */ import org.apache.logging.log4j.LogManager;
/*    7:     */ import org.apache.logging.log4j.Logger;
/*    8:     */ import org.lwjgl.input.Mouse;
/*    9:     */ import org.lwjgl.opengl.ContextCapabilities;
/*   10:     */ import org.lwjgl.opengl.Display;
/*   11:     */ import org.lwjgl.opengl.GL11;
/*   12:     */ import org.lwjgl.opengl.GLContext;
/*   13:     */ import org.lwjgl.util.glu.Project;
/*   14:     */ 
/*   15:     */ public class cji
/*   16:     */   implements cvl
/*   17:     */ {
/*   18:  69 */   private static final Logger e = LogManager.getLogger();
/*   19:  70 */   private static final oa f = new oa("textures/environment/rain.png");
/*   20:  71 */   private static final oa g = new oa("textures/environment/snow.png");
/*   21:     */   public static boolean a;
/*   22:     */   public static int b;
/*   23:     */   private bsu h;
/*   24:     */   private final cvk i;
/*   25:  85 */   private Random j = new Random();
/*   26:     */   private float k;
/*   27:     */   public final cki c;
/*   28:     */   private final buc l;
/*   29:     */   private int m;
/*   30:     */   private Entity n;
/*   31:  94 */   private uz o = new uz();
/*   32:  95 */   private uz p = new uz();
/*   33:  98 */   private float q = 4.0F;
/*   34:  99 */   private float r = 4.0F;
/*   35:     */   private float s;
/*   36:     */   private float t;
/*   37:     */   private float u;
/*   38:     */   private float v;
/*   39:     */   private float w;
/*   40:     */   private float x;
/*   41:     */   private float y;
/*   42:     */   private float z;
/*   43:     */   private float A;
/*   44:     */   private boolean B;
/*   45: 112 */   private boolean C = true;
/*   46: 113 */   private boolean D = true;
/*   47: 116 */   private long E = bsu.I();
/*   48:     */   private long F;
/*   49:     */   private final ctp G;
/*   50:     */   private final int[] H;
/*   51:     */   private final oa I;
/*   52:     */   private boolean J;
/*   53:     */   private float K;
/*   54:     */   private float L;
/*   55:     */   private int M;
/*   56: 129 */   private float[] N = new float[1024];
/*   57: 130 */   private float[] O = new float[1024];
/*   58: 133 */   private FloatBuffer P = bst.h(16);
/*   59:     */   private float Q;
/*   60:     */   private float R;
/*   61:     */   private float S;
/*   62:     */   private float T;
/*   63:     */   private float U;
/*   64: 140 */   private int V = 0;
/*   65: 141 */   private boolean W = false;
/*   66: 144 */   private double X = 1.0D;
/*   67:     */   private double Y;
/*   68:     */   private double Z;
/*   69:     */   private ctg aa;
/*   70: 150 */   private static final oa[] ab = { new oa("shaders/post/notch.json"), new oa("shaders/post/fxaa.json"), new oa("shaders/post/art.json"), new oa("shaders/post/bumpy.json"), new oa("shaders/post/blobs2.json"), new oa("shaders/post/pencil.json"), new oa("shaders/post/color_convolve.json"), new oa("shaders/post/deconverge.json"), new oa("shaders/post/flip.json"), new oa("shaders/post/invert.json"), new oa("shaders/post/ntsc.json"), new oa("shaders/post/outline.json"), new oa("shaders/post/phosphor.json"), new oa("shaders/post/scan_pincushion.json"), new oa("shaders/post/sobel.json"), new oa("shaders/post/bits.json"), new oa("shaders/post/desaturate.json"), new oa("shaders/post/green.json"), new oa("shaders/post/blur.json"), new oa("shaders/post/wobble.json"), new oa("shaders/post/blobs.json"), new oa("shaders/post/antialias.json"), new oa("shaders/post/creeper.json"), new oa("shaders/post/spider.json") };
/*   71: 176 */   public static final int d = ab.length;
/*   72: 177 */   private int ac = d;
/*   73: 178 */   private boolean ad = false;
/*   74: 179 */   private int ae = 0;
/*   75:     */   
/*   76:     */   public cji(bsu parambsu, cvk paramcvk)
/*   77:     */   {
/*   78: 182 */     this.h = parambsu;
/*   79: 183 */     this.i = paramcvk;
/*   80: 184 */     this.c = parambsu.ag();
/*   81: 185 */     this.l = new buc(parambsu.N());
/*   82:     */     
/*   83: 187 */     this.G = new ctp(16, 16);
/*   84: 188 */     this.I = parambsu.N().a("lightMap", this.G);
/*   85: 189 */     this.H = this.G.e();
/*   86:     */     
/*   87: 191 */     this.aa = null;
/*   88: 193 */     for (int i1 = 0; i1 < 32; i1++) {
/*   89: 194 */       for (int i2 = 0; i2 < 32; i2++)
/*   90:     */       {
/*   91: 195 */         float f1 = i2 - 16;
/*   92: 196 */         float f2 = i1 - 16;
/*   93: 197 */         float f3 = MathUtils.sqrt(f1 * f1 + f2 * f2);
/*   94: 198 */         this.N[(i1 << 5 | i2)] = (-f2 / f3);
/*   95: 199 */         this.O[(i1 << 5 | i2)] = (f1 / f3);
/*   96:     */       }
/*   97:     */     }
/*   98:     */   }
/*   99:     */   
/*  100:     */   public boolean a()
/*  101:     */   {
/*  102: 221 */     return (dax.N) && (this.aa != null);
/*  103:     */   }
/*  104:     */   
/*  105:     */   public void c()
/*  106:     */   {
/*  107: 233 */     this.ad = (!this.ad);
/*  108:     */   }
/*  109:     */   
/*  110:     */   public void a(Entity paramwv)
/*  111:     */   {
/*  112: 237 */     if (!dax.N) {
/*  113: 238 */       return;
/*  114:     */     }
/*  115: 241 */     if (this.aa != null) {
/*  116: 242 */       this.aa.a();
/*  117:     */     }
/*  118: 244 */     this.aa = null;
/*  119: 246 */     if ((paramwv instanceof EntityCreeper)) {
/*  120: 247 */       a(new oa("shaders/post/creeper.json"));
/*  121: 248 */     } else if ((paramwv instanceof EntitySpider)) {
/*  122: 249 */       a(new oa("shaders/post/spider.json"));
/*  123: 250 */     } else if ((paramwv instanceof EntityEnderman)) {
/*  124: 251 */       a(new oa("shaders/post/invert.json"));
/*  125:     */     }
/*  126:     */   }
/*  127:     */   
/*  128:     */   public void d()
/*  129:     */   {
/*  130: 256 */     if (!dax.N) {
/*  131: 257 */       return;
/*  132:     */     }
/*  133: 260 */     if (!(this.h.aa() instanceof EntityPlayer)) {
/*  134: 261 */       return;
/*  135:     */     }
/*  136: 264 */     if (this.aa != null) {
/*  137: 265 */       this.aa.a();
/*  138:     */     }
/*  139: 269 */     this.ac = ((this.ac + 1) % (ab.length + 1));
/*  140: 270 */     if (this.ac != d) {
/*  141: 271 */       a(ab[this.ac]);
/*  142:     */     } else {
/*  143: 273 */       this.aa = null;
/*  144:     */     }
/*  145:     */   }
/*  146:     */   
/*  147:     */   private void a(oa paramoa)
/*  148:     */   {
/*  149:     */     try
/*  150:     */     {
/*  151: 279 */       this.aa = new ctg(this.h.N(), this.i, this.h.b(), paramoa);
/*  152: 280 */       this.aa.a(this.h.d, this.h.e);
/*  153: 281 */       this.ad = true;
/*  154:     */     }
/*  155:     */     catch (IOException localIOException)
/*  156:     */     {
/*  157: 283 */       e.warn("Failed to load shader: " + paramoa, localIOException);
/*  158: 284 */       this.ac = d;
/*  159: 285 */       this.ad = false;
/*  160:     */     }
/*  161:     */     catch (JsonSyntaxException localJsonSyntaxException)
/*  162:     */     {
/*  163: 287 */       e.warn("Failed to load shader: " + paramoa, localJsonSyntaxException);
/*  164: 288 */       this.ac = d;
/*  165: 289 */       this.ad = false;
/*  166:     */     }
/*  167:     */   }
/*  168:     */   
/*  169:     */   public void a(cvk paramcvk)
/*  170:     */   {
/*  171: 295 */     if (this.aa != null) {
/*  172: 296 */       this.aa.a();
/*  173:     */     }
/*  174: 298 */     this.aa = null;
/*  175: 299 */     if (this.ac != d) {
/*  176: 300 */       a(ab[this.ac]);
/*  177:     */     } else {
/*  178: 302 */       a(this.h.aa());
/*  179:     */     }
/*  180:     */   }
/*  181:     */   
/*  182:     */   public void e()
/*  183:     */   {
/*  184: 307 */     if ((dax.N) && (ctk.b() == null)) {
/*  185: 308 */       ctk.a();
/*  186:     */     }
/*  187: 311 */     l();
/*  188: 312 */     m();
/*  189: 313 */     this.T = this.U;
/*  190: 314 */     this.r = this.q;
/*  191: 316 */     if (this.h.t.aB)
/*  192:     */     {
/*  193: 319 */       float f1 = this.h.t.a * 0.6F + 0.2F;
/*  194: 320 */       float f2 = f1 * f1 * f1 * 8.0F;
/*  195: 321 */       this.u = this.o.a(this.s, 0.05F * f2);
/*  196: 322 */       this.v = this.p.a(this.t, 0.05F * f2);
/*  197: 323 */       this.w = 0.0F;
/*  198:     */       
/*  199: 325 */       this.s = 0.0F;
/*  200: 326 */       this.t = 0.0F;
/*  201:     */     }
/*  202:     */     else
/*  203:     */     {
/*  204: 328 */       this.u = 0.0F;
/*  205: 329 */       this.v = 0.0F;
/*  206: 330 */       this.o.a();
/*  207: 331 */       this.p.a();
/*  208:     */     }
/*  209: 334 */     if (this.h.aa() == null) {
/*  210: 335 */       this.h.a(this.h.h);
/*  211:     */     }
/*  212: 338 */     float f1 = this.h.f.o(new BlockPosition(this.h.aa()));
/*  213: 339 */     float f2 = this.h.t.c / 32.0F;
/*  214: 340 */     float f3 = f1 * (1.0F - f2) + f2;
/*  215: 341 */     this.U += (f3 - this.U) * 0.1F;
/*  216:     */     
/*  217: 343 */     this.m += 1;
/*  218:     */     
/*  219: 345 */     this.c.a();
/*  220: 346 */     o();
/*  221:     */     
/*  222: 348 */     this.A = this.z;
/*  223: 349 */     if (ciu.d)
/*  224:     */     {
/*  225: 350 */       this.z += 0.05F;
/*  226: 351 */       if (this.z > 1.0F) {
/*  227: 352 */         this.z = 1.0F;
/*  228:     */       }
/*  229: 354 */       ciu.d = false;
/*  230:     */     }
/*  231: 355 */     else if (this.z > 0.0F)
/*  232:     */     {
/*  233: 356 */       this.z -= 0.0125F;
/*  234:     */     }
/*  235:     */   }
/*  236:     */   
/*  237:     */   public ctg f()
/*  238:     */   {
/*  239: 361 */     return this.aa;
/*  240:     */   }
/*  241:     */   
/*  242:     */   public void a(int paramInt1, int paramInt2)
/*  243:     */   {
/*  244: 365 */     if (!dax.N) {
/*  245: 366 */       return;
/*  246:     */     }
/*  247: 369 */     if (this.aa != null) {
/*  248: 370 */       this.aa.a(paramInt1, paramInt2);
/*  249:     */     }
/*  250: 373 */     this.h.g.a(paramInt1, paramInt2);
/*  251:     */   }
/*  252:     */   
/*  253:     */   public void a(float paramFloat)
/*  254:     */   {
/*  255: 377 */     Entity localwv1 = this.h.aa();
/*  256: 378 */     if (localwv1 == null) {
/*  257: 379 */       return;
/*  258:     */     }
/*  259: 381 */     if (this.h.f == null) {
/*  260: 382 */       return;
/*  261:     */     }
/*  262: 385 */     this.h.y.a("pick");
/*  263:     */     
/*  264: 387 */     this.h.i = null;
/*  265:     */     
/*  266: 389 */     double d1 = this.h.c.d();
/*  267: 390 */     this.h.s = localwv1.a(d1, paramFloat);
/*  268:     */     
/*  269: 392 */     double d2 = d1;
/*  270: 393 */     Vec3 localbrw1 = localwv1.e(paramFloat);
/*  271: 395 */     if (this.h.c.i())
/*  272:     */     {
/*  273: 396 */       d2 = d1 = 6.0D;
/*  274:     */     }
/*  275:     */     else
/*  276:     */     {
/*  277: 398 */       if (d2 > 3.0D) {
/*  278: 399 */         d2 = 3.0D;
/*  279:     */       }
/*  280: 401 */       d1 = d2;
/*  281:     */     }
/*  282: 404 */     if (this.h.s != null) {
/*  283: 405 */       d2 = this.h.s.c.f(localbrw1);
/*  284:     */     }
/*  285: 408 */     Vec3 localbrw2 = localwv1.d(paramFloat);
/*  286: 409 */     Vec3 localbrw3 = localbrw1.b(localbrw2.x * d1, localbrw2.y * d1, localbrw2.z * d1);
/*  287: 410 */     this.n = null;
/*  288: 411 */     Vec3 localbrw4 = null;
/*  289: 412 */     float f1 = 1.0F;
/*  290:     */     
/*  291: 414 */     List localList = this.h.f.b(localwv1, localwv1.getAABB().addCoord(localbrw2.x * d1, localbrw2.y * d1, localbrw2.z * d1).expand(f1, f1, f1));
/*  292: 415 */     double d3 = d2;
/*  293: 416 */     for (int i1 = 0; i1 < localList.size(); i1++)
/*  294:     */     {
/*  295: 417 */       Entity localwv2 = (Entity)localList.get(i1);
/*  296: 418 */       if (localwv2.ad())
/*  297:     */       {
/*  298: 422 */         float f2 = localwv2.ao();
/*  299: 423 */         AABB localbrt = localwv2.getAABB().expand(f2, f2, f2);
/*  300: 424 */         HitResult localbru = localbrt.a(localbrw1, localbrw3);
/*  301: 425 */         if (localbrt.a(localbrw1))
/*  302:     */         {
/*  303: 426 */           if ((0.0D < d3) || (d3 == 0.0D))
/*  304:     */           {
/*  305: 427 */             this.n = localwv2;
/*  306: 428 */             localbrw4 = localbru == null ? localbrw1 : localbru.c;
/*  307: 429 */             d3 = 0.0D;
/*  308:     */           }
/*  309:     */         }
/*  310: 431 */         else if (localbru != null)
/*  311:     */         {
/*  312: 432 */           double d4 = localbrw1.f(localbru.c);
/*  313: 433 */           if ((d4 < d3) || (d3 == 0.0D)) {
/*  314: 434 */             if (localwv2 == localwv1.vehicle)
/*  315:     */             {
/*  316: 435 */               if (d3 == 0.0D)
/*  317:     */               {
/*  318: 436 */                 this.n = localwv2;
/*  319: 437 */                 localbrw4 = localbru.c;
/*  320:     */               }
/*  321:     */             }
/*  322:     */             else
/*  323:     */             {
/*  324: 440 */               this.n = localwv2;
/*  325: 441 */               localbrw4 = localbru.c;
/*  326: 442 */               d3 = d4;
/*  327:     */             }
/*  328:     */           }
/*  329:     */         }
/*  330:     */       }
/*  331:     */     }
/*  332: 448 */     if ((this.n != null) && (
/*  333: 449 */       (d3 < d2) || (this.h.s == null)))
/*  334:     */     {
/*  335: 450 */       this.h.s = new HitResult(this.n, localbrw4);
/*  336: 451 */       if (((this.n instanceof EntityLiving)) || ((this.n instanceof EntityItemFrame))) {
/*  337: 452 */         this.h.i = this.n;
/*  338:     */       }
/*  339:     */     }
/*  340: 456 */     this.h.y.b();
/*  341:     */   }
/*  342:     */   
/*  343:     */   private void l()
/*  344:     */   {
/*  345: 460 */     float f1 = 1.0F;
/*  346: 461 */     if ((this.h.aa() instanceof cil))
/*  347:     */     {
/*  348: 462 */       cil localcil = (cil)this.h.aa();
/*  349:     */       
/*  350: 464 */       f1 = localcil.o();
/*  351:     */     }
/*  352: 467 */     this.y = this.x;
/*  353: 468 */     this.x += (f1 - this.x) * 0.5F;
/*  354: 470 */     if (this.x > 1.5F) {
/*  355: 471 */       this.x = 1.5F;
/*  356:     */     }
/*  357: 473 */     if (this.x < 0.1F) {
/*  358: 474 */       this.x = 0.1F;
/*  359:     */     }
/*  360:     */   }
/*  361:     */   
/*  362:     */   private float a(float paramFloat, boolean paramBoolean)
/*  363:     */   {
/*  364: 479 */     if (this.W) {
/*  365: 480 */       return 90.0F;
/*  366:     */     }
/*  367: 483 */     Entity localwv = this.h.aa();
/*  368: 484 */     float f1 = 70.0F;
/*  369: 485 */     if (paramBoolean)
/*  370:     */     {
/*  371: 486 */       f1 = this.h.t.aD;
/*  372: 487 */       f1 *= (this.y + (this.x - this.y) * paramFloat);
/*  373:     */     }
/*  374: 489 */     if (((localwv instanceof EntityLiving)) && (((EntityLiving)localwv).getHealth() <= 0.0F))
/*  375:     */     {
/*  376: 490 */       float f2 = ((EntityLiving)localwv).deathTime + paramFloat;
/*  377:     */       
/*  378: 492 */       f1 /= ((1.0F - 500.0F / (f2 + 500.0F)) * 2.0F + 1.0F);
/*  379:     */     }
/*  380: 495 */     ProtoBlock localatr = bsp.a(this.h.f, localwv, paramFloat);
/*  381: 496 */     if (localatr.getMaterial() == Material.water) {
/*  382: 497 */       f1 = f1 * 60.0F / 70.0F;
/*  383:     */     }
/*  384: 500 */     return f1;
/*  385:     */   }
/*  386:     */   
/*  387:     */   private void e(float paramFloat)
/*  388:     */   {
/*  389: 504 */     if ((this.h.aa() instanceof EntityLiving))
/*  390:     */     {
/*  391: 505 */       EntityLiving localxm = (EntityLiving)this.h.aa();
/*  392:     */       
/*  393: 507 */       float f1 = localxm.hurtTime - paramFloat;
/*  394: 509 */       if (localxm.getHealth() <= 0.0F)
/*  395:     */       {
/*  396: 510 */         float f2 = localxm.deathTime + paramFloat;
/*  397:     */         
/*  398: 512 */         cjm.glRotatef(40.0F - 8000.0F / (f2 + 200.0F), 0.0F, 0.0F, 1.0F);
/*  399:     */       }
/*  400: 515 */       if (f1 < 0.0F) {
/*  401: 516 */         return;
/*  402:     */       }
/*  403: 518 */       f1 /= localxm.at;
/*  404: 519 */       f1 = MathUtils.sin(f1 * f1 * f1 * f1 * 3.141593F);
/*  405:     */       
/*  406: 521 */       float f2 = localxm.au;
/*  407:     */       
/*  408: 523 */       cjm.glRotatef(-f2, 0.0F, 1.0F, 0.0F);
/*  409: 524 */       cjm.glRotatef(-f1 * 14.0F, 0.0F, 0.0F, 1.0F);
/*  410: 525 */       cjm.glRotatef(f2, 0.0F, 1.0F, 0.0F);
/*  411:     */     }
/*  412:     */   }
/*  413:     */   
/*  414:     */   private void f(float paramFloat)
/*  415:     */   {
/*  416: 530 */     if (!(this.h.aa() instanceof EntityPlayer)) {
/*  417: 531 */       return;
/*  418:     */     }
/*  419: 533 */     EntityPlayer localahd = (EntityPlayer)this.h.aa();
/*  420:     */     
/*  421: 535 */     float f1 = localahd.M - localahd.L;
/*  422: 536 */     float f2 = -(localahd.M + f1 * paramFloat);
/*  423: 537 */     float f3 = localahd.bl + (localahd.bm - localahd.bl) * paramFloat;
/*  424: 538 */     float f4 = localahd.aC + (localahd.aD - localahd.aC) * paramFloat;
/*  425: 539 */     cjm.glTranslatef(MathUtils.sin(f2 * 3.141593F) * f3 * 0.5F, -Math.abs(MathUtils.cos(f2 * 3.141593F) * f3), 0.0F);
/*  426: 540 */     cjm.glRotatef(MathUtils.sin(f2 * 3.141593F) * f3 * 3.0F, 0.0F, 0.0F, 1.0F);
/*  427: 541 */     cjm.glRotatef(Math.abs(MathUtils.cos(f2 * 3.141593F - 0.2F) * f3) * 5.0F, 1.0F, 0.0F, 0.0F);
/*  428: 542 */     cjm.glRotatef(f4, 1.0F, 0.0F, 0.0F);
/*  429:     */   }
/*  430:     */   
/*  431:     */   private void g(float paramFloat)
/*  432:     */   {
/*  433: 546 */     Entity localwv = this.h.aa();
/*  434: 547 */     float f1 = localwv.aR();
/*  435:     */     
/*  436: 549 */     double d1 = localwv.lastX + (localwv.xPos - localwv.lastX) * paramFloat;
/*  437: 550 */     double d2 = localwv.lastY + (localwv.yPos - localwv.lastY) * paramFloat + f1;
/*  438: 551 */     double d3 = localwv.lastZ + (localwv.zPos - localwv.lastZ) * paramFloat;
/*  439: 553 */     if (((localwv instanceof EntityLiving)) && (((EntityLiving)localwv).bI()))
/*  440:     */     {
/*  441: 554 */       f1 = (float)(f1 + 1.0D);
/*  442: 555 */       cjm.glTranslatef(0.0F, 0.3F, 0.0F);
/*  443: 556 */       if (!this.h.t.aC)
/*  444:     */       {
/*  445: 557 */         BlockPosition localdt = new BlockPosition(localwv);
/*  446: 558 */         Block localbec = this.h.f.getBlock(localdt);
/*  447: 559 */         ProtoBlock localatr = localbec.getProto();
/*  448: 560 */         if (localatr == BlockList.C)
/*  449:     */         {
/*  450: 561 */           int i1 = ((EnumDirection)localbec.getProperty(atp.N)).b();
/*  451: 562 */           cjm.glRotatef(i1 * 90, 0.0F, 1.0F, 0.0F);
/*  452:     */         }
/*  453: 564 */         cjm.glRotatef(localwv.lastYaw + (localwv.yaw - localwv.lastYaw) * paramFloat + 180.0F, 0.0F, -1.0F, 0.0F);
/*  454: 565 */         cjm.glRotatef(localwv.lastPitch + (localwv.pitch - localwv.lastPitch) * paramFloat, -1.0F, 0.0F, 0.0F);
/*  455:     */       }
/*  456:     */     }
/*  457: 567 */     else if (this.h.t.ax > 0)
/*  458:     */     {
/*  459: 568 */       double d4 = this.r + (this.q - this.r) * paramFloat;
/*  460: 570 */       if (this.h.t.aC)
/*  461:     */       {
/*  462: 571 */         cjm.glTranslatef(0.0F, 0.0F, (float)-d4);
/*  463:     */       }
/*  464:     */       else
/*  465:     */       {
/*  466: 573 */         float f2 = localwv.yaw;
/*  467: 574 */         float f3 = localwv.pitch;
/*  468: 576 */         if (this.h.t.ax == 2) {
/*  469: 577 */           f3 += 180.0F;
/*  470:     */         }
/*  471: 580 */         double d5 = -MathUtils.sin(f2 / 180.0F * 3.141593F) * MathUtils.cos(f3 / 180.0F * 3.141593F) * d4;
/*  472: 581 */         double d6 = MathUtils.cos(f2 / 180.0F * 3.141593F) * MathUtils.cos(f3 / 180.0F * 3.141593F) * d4;
/*  473: 582 */         double d7 = -MathUtils.sin(f3 / 180.0F * 3.141593F) * d4;
/*  474: 584 */         for (int i2 = 0; i2 < 8; i2++)
/*  475:     */         {
/*  476: 585 */           float f4 = (i2 & 0x1) * 2 - 1;
/*  477: 586 */           float f5 = (i2 >> 1 & 0x1) * 2 - 1;
/*  478: 587 */           float f6 = (i2 >> 2 & 0x1) * 2 - 1;
/*  479:     */           
/*  480: 589 */           f4 *= 0.1F;
/*  481: 590 */           f5 *= 0.1F;
/*  482: 591 */           f6 *= 0.1F;
/*  483:     */           
/*  484: 593 */           HitResult localbru = this.h.f.a(new Vec3(d1 + f4, d2 + f5, d3 + f6), new Vec3(d1 - d5 + f4 + f6, d2 - d7 + f5, d3 - d6 + f6));
/*  485: 594 */           if (localbru != null)
/*  486:     */           {
/*  487: 595 */             double d8 = localbru.c.f(new Vec3(d1, d2, d3));
/*  488: 596 */             if (d8 < d4) {
/*  489: 597 */               d4 = d8;
/*  490:     */             }
/*  491:     */           }
/*  492:     */         }
/*  493: 602 */         if (this.h.t.ax == 2) {
/*  494: 603 */           cjm.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/*  495:     */         }
/*  496: 606 */         cjm.glRotatef(localwv.pitch - f3, 1.0F, 0.0F, 0.0F);
/*  497: 607 */         cjm.glRotatef(localwv.yaw - f2, 0.0F, 1.0F, 0.0F);
/*  498: 608 */         cjm.glTranslatef(0.0F, 0.0F, (float)-d4);
/*  499: 609 */         cjm.glRotatef(f2 - localwv.yaw, 0.0F, 1.0F, 0.0F);
/*  500: 610 */         cjm.glRotatef(f3 - localwv.pitch, 1.0F, 0.0F, 0.0F);
/*  501:     */       }
/*  502:     */     }
/*  503:     */     else
/*  504:     */     {
/*  505: 613 */       cjm.glTranslatef(0.0F, 0.0F, -0.1F);
/*  506:     */     }
/*  507: 616 */     if (!this.h.t.aC)
/*  508:     */     {
/*  509: 617 */       cjm.glRotatef(localwv.lastPitch + (localwv.pitch - localwv.lastPitch) * paramFloat, 1.0F, 0.0F, 0.0F);
/*  510: 619 */       if ((localwv instanceof EntityAnimal))
/*  511:     */       {
/*  512: 620 */         EntityAnimal localabq = (EntityAnimal)localwv;
/*  513:     */         
/*  514: 622 */         cjm.glRotatef(localabq.aJ + (localabq.aI - localabq.aJ) * paramFloat + 180.0F, 0.0F, 1.0F, 0.0F);
/*  515:     */       }
/*  516:     */       else
/*  517:     */       {
/*  518: 624 */         cjm.glRotatef(localwv.lastYaw + (localwv.yaw - localwv.lastYaw) * paramFloat + 180.0F, 0.0F, 1.0F, 0.0F);
/*  519:     */       }
/*  520:     */     }
/*  521: 628 */     cjm.glTranslatef(0.0F, -f1, 0.0F);
/*  522:     */     
/*  523: 630 */     d1 = localwv.lastX + (localwv.xPos - localwv.lastX) * paramFloat;
/*  524: 631 */     d2 = localwv.lastY + (localwv.yPos - localwv.lastY) * paramFloat + f1;
/*  525: 632 */     d3 = localwv.lastZ + (localwv.zPos - localwv.lastZ) * paramFloat;
/*  526:     */     
/*  527: 634 */     this.B = this.h.g.a(d1, d2, d3, paramFloat);
/*  528:     */   }
/*  529:     */   
/*  530:     */   private void a(float paramFloat, int paramInt)
/*  531:     */   {
/*  532: 648 */     this.k = (this.h.t.c * 16);
/*  533: 649 */     cjm.glMatrixMode(5889);
/*  534: 650 */     cjm.glLoadIdentity();
/*  535:     */     
/*  536: 652 */     float f1 = 0.07F;
/*  537: 653 */     if (this.h.t.e) {
/*  538: 654 */       cjm.glTranslatef(-(paramInt * 2 - 1) * f1, 0.0F, 0.0F);
/*  539:     */     }
/*  540: 656 */     if (this.X != 1.0D)
/*  541:     */     {
/*  542: 657 */       cjm.glTranslatef((float)this.Y, (float)-this.Z, 0.0F);
/*  543: 658 */       cjm.glScaled(this.X, this.X, 1.0D);
/*  544:     */     }
/*  545: 661 */     Project.gluPerspective(a(paramFloat, true), this.h.d / this.h.e, 0.05F, this.k * MathUtils.a);
/*  546:     */     
/*  547: 663 */     cjm.glMatrixMode(5888);
/*  548: 664 */     cjm.glLoadIdentity();
/*  549: 665 */     if (this.h.t.e) {
/*  550: 666 */       cjm.glTranslatef((paramInt * 2 - 1) * 0.1F, 0.0F, 0.0F);
/*  551:     */     }
/*  552: 669 */     e(paramFloat);
/*  553: 670 */     if (this.h.t.d) {
/*  554: 671 */       f(paramFloat);
/*  555:     */     }
/*  556: 673 */     float f2 = this.h.h.bG + (this.h.h.bF - this.h.h.bG) * paramFloat;
/*  557: 674 */     if (f2 > 0.0F)
/*  558:     */     {
/*  559: 675 */       int i1 = 20;
/*  560: 676 */       if (this.h.h.a(Potion.nausea)) {
/*  561: 677 */         i1 = 7;
/*  562:     */       }
/*  563: 680 */       float f3 = 5.0F / (f2 * f2 + 5.0F) - f2 * 0.04F;
/*  564: 681 */       f3 *= f3;
/*  565: 682 */       cjm.glRotatef((this.m + paramFloat) * i1, 0.0F, 1.0F, 1.0F);
/*  566: 683 */       cjm.glScalef(1.0F / f3, 1.0F, 1.0F);
/*  567: 684 */       cjm.glRotatef(-(this.m + paramFloat) * i1, 0.0F, 1.0F, 1.0F);
/*  568:     */     }
/*  569: 687 */     g(paramFloat);
/*  570: 689 */     if (this.W) {
/*  571: 690 */       switch (this.V)
/*  572:     */       {
/*  573:     */       case 0: 
/*  574: 692 */         cjm.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/*  575: 693 */         break;
/*  576:     */       case 1: 
/*  577: 695 */         cjm.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/*  578: 696 */         break;
/*  579:     */       case 2: 
/*  580: 698 */         cjm.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
/*  581: 699 */         break;
/*  582:     */       case 3: 
/*  583: 701 */         cjm.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/*  584: 702 */         break;
/*  585:     */       case 4: 
/*  586: 704 */         cjm.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/*  587:     */       }
/*  588:     */     }
/*  589:     */   }
/*  590:     */   
/*  591:     */   private void b(float paramFloat, int paramInt)
/*  592:     */   {
/*  593: 711 */     if (this.W) {
/*  594: 712 */       return;
/*  595:     */     }
/*  596: 715 */     cjm.glMatrixMode(5889);
/*  597: 716 */     cjm.glLoadIdentity();
/*  598:     */     
/*  599: 718 */     float f1 = 0.07F;
/*  600: 719 */     if (this.h.t.e) {
/*  601: 720 */       cjm.glTranslatef(-(paramInt * 2 - 1) * f1, 0.0F, 0.0F);
/*  602:     */     }
/*  603: 723 */     Project.gluPerspective(a(paramFloat, false), this.h.d / this.h.e, 0.05F, this.k * 2.0F);
/*  604:     */     
/*  605: 725 */     cjm.glMatrixMode(5888);
/*  606: 726 */     cjm.glLoadIdentity();
/*  607: 728 */     if (this.h.t.e) {
/*  608: 729 */       cjm.glTranslatef((paramInt * 2 - 1) * 0.1F, 0.0F, 0.0F);
/*  609:     */     }
/*  610: 732 */     cjm.glPushMatrix();
/*  611: 733 */     e(paramFloat);
/*  612: 734 */     if (this.h.t.d) {
/*  613: 735 */       f(paramFloat);
/*  614:     */     }
/*  615: 738 */     int i1 = ((this.h.aa() instanceof EntityLiving)) && (((EntityLiving)this.h.aa()).bI()) ? 1 : 0;
/*  616: 740 */     if ((this.h.t.ax == 0) && (i1 == 0) && 
/*  617: 741 */       (!this.h.t.aw) && (!this.h.c.a()))
/*  618:     */     {
/*  619: 742 */       i();
/*  620: 743 */       this.c.a(paramFloat);
/*  621: 744 */       h();
/*  622:     */     }
/*  623: 747 */     cjm.glPopMatrix();
/*  624: 748 */     if ((this.h.t.ax == 0) && (i1 == 0))
/*  625:     */     {
/*  626: 749 */       this.c.b(paramFloat);
/*  627: 750 */       e(paramFloat);
/*  628:     */     }
/*  629: 752 */     if (this.h.t.d) {
/*  630: 753 */       f(paramFloat);
/*  631:     */     }
/*  632:     */   }
/*  633:     */   
/*  634:     */   public void h()
/*  635:     */   {
/*  636: 758 */     cjm.g(dax.q);
/*  637: 759 */     cjm.x();
/*  638: 760 */     cjm.g(dax.p);
/*  639:     */   }
/*  640:     */   
/*  641:     */   public void i()
/*  642:     */   {
/*  643: 764 */     cjm.g(dax.q);
/*  644: 765 */     cjm.glMatrixMode(5890);
/*  645: 766 */     cjm.glLoadIdentity();
/*  646: 767 */     float f1 = 0.0039063F;
/*  647: 768 */     cjm.glScalef(f1, f1, f1);
/*  648: 769 */     cjm.glTranslatef(8.0F, 8.0F, 8.0F);
/*  649: 770 */     cjm.glMatrixMode(5888);
/*  650:     */     
/*  651: 772 */     this.h.N().a(this.I);
/*  652: 773 */     GL11.glTexParameteri(3553, 10241, 9729);
/*  653: 774 */     GL11.glTexParameteri(3553, 10240, 9729);
/*  654: 775 */     GL11.glTexParameteri(3553, 10242, 10496);
/*  655: 776 */     GL11.glTexParameteri(3553, 10243, 10496);
/*  656: 777 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  657: 778 */     cjm.w();
/*  658: 779 */     cjm.g(dax.p);
/*  659:     */   }
/*  660:     */   
/*  661:     */   private void m()
/*  662:     */   {
/*  663: 783 */     this.L = ((float)(this.L + (Math.random() - Math.random()) * Math.random() * Math.random()));
/*  664: 784 */     this.L = ((float)(this.L * 0.9D));
/*  665: 785 */     this.K += (this.L - this.K) * 1.0F;
/*  666: 786 */     this.J = true;
/*  667:     */   }
/*  668:     */   
/*  669:     */   private void h(float paramFloat)
/*  670:     */   {
/*  671: 790 */     if (!this.J) {
/*  672: 791 */       return;
/*  673:     */     }
/*  674: 793 */     this.h.y.a("lightTex");
/*  675: 794 */     cen localcen = this.h.f;
/*  676: 795 */     if (localcen == null) {
/*  677: 796 */       return;
/*  678:     */     }
/*  679: 798 */     for (int i1 = 0; i1 < 256; i1++)
/*  680:     */     {
/*  681: 799 */       float f1 = localcen.b(1.0F) * 0.95F + 0.05F;
/*  682: 800 */       float f2 = localcen.t.p()[(i1 / 16)] * f1;
/*  683: 801 */       float f3 = localcen.t.p()[(i1 % 16)] * (this.K * 0.1F + 1.5F);
/*  684: 803 */       if (localcen.ac() > 0) {
/*  685: 804 */         f2 = localcen.t.p()[(i1 / 16)];
/*  686:     */       }
/*  687: 807 */       float f4 = f2 * (localcen.b(1.0F) * 0.65F + 0.35F);
/*  688: 808 */       float f5 = f2 * (localcen.b(1.0F) * 0.65F + 0.35F);
/*  689: 809 */       float f6 = f2;
/*  690: 810 */       float f7 = f3;
/*  691: 811 */       float f8 = f3 * ((f3 * 0.6F + 0.4F) * 0.6F + 0.4F);
/*  692: 812 */       float f9 = f3 * (f3 * f3 * 0.6F + 0.4F);
/*  693:     */       
/*  694: 814 */       float f10 = f4 + f7;
/*  695: 815 */       float f11 = f5 + f8;
/*  696: 816 */       float f12 = f6 + f9;
/*  697:     */       
/*  698: 818 */       f10 = f10 * 0.96F + 0.03F;
/*  699: 819 */       f11 = f11 * 0.96F + 0.03F;
/*  700: 820 */       f12 = f12 * 0.96F + 0.03F;
/*  701: 822 */       if (this.z > 0.0F)
/*  702:     */       {
/*  703: 823 */         float f13 = this.A + (this.z - this.A) * paramFloat;
/*  704: 824 */         f10 = f10 * (1.0F - f13) + f10 * 0.7F * f13;
/*  705: 825 */         f11 = f11 * (1.0F - f13) + f11 * 0.6F * f13;
/*  706: 826 */         f12 = f12 * (1.0F - f13) + f12 * 0.6F * f13;
/*  707:     */       }
/*  708: 829 */       if (localcen.t.q() == 1)
/*  709:     */       {
/*  710: 830 */         f10 = 0.22F + f7 * 0.75F;
/*  711: 831 */         f11 = 0.28F + f8 * 0.75F;
/*  712: 832 */         f12 = 0.25F + f9 * 0.75F;
/*  713:     */       }
/*  714: 835 */       if (this.h.h.a(Potion.nightVision))
/*  715:     */       {
/*  716: 836 */         float f13 = a(this.h.h, paramFloat);
/*  717:     */         
/*  718: 838 */         float f14 = 1.0F / f10;
/*  719: 839 */         if (f14 > 1.0F / f11) {
/*  720: 840 */           f14 = 1.0F / f11;
/*  721:     */         }
/*  722: 842 */         if (f14 > 1.0F / f12) {
/*  723: 843 */           f14 = 1.0F / f12;
/*  724:     */         }
/*  725: 845 */         f10 = f10 * (1.0F - f13) + f10 * f14 * f13;
/*  726: 846 */         f11 = f11 * (1.0F - f13) + f11 * f14 * f13;
/*  727: 847 */         f12 = f12 * (1.0F - f13) + f12 * f14 * f13;
/*  728:     */       }
/*  729: 851 */       if (f10 > 1.0F) {
/*  730: 852 */         f10 = 1.0F;
/*  731:     */       }
/*  732: 854 */       if (f11 > 1.0F) {
/*  733: 855 */         f11 = 1.0F;
/*  734:     */       }
/*  735: 857 */       if (f12 > 1.0F) {
/*  736: 858 */         f12 = 1.0F;
/*  737:     */       }
/*  738: 861 */       float f13 = this.h.t.aE;
/*  739:     */       
/*  740: 863 */       float f14 = 1.0F - f10;
/*  741: 864 */       float f15 = 1.0F - f11;
/*  742: 865 */       float f16 = 1.0F - f12;
/*  743: 866 */       f14 = 1.0F - f14 * f14 * f14 * f14;
/*  744: 867 */       f15 = 1.0F - f15 * f15 * f15 * f15;
/*  745: 868 */       f16 = 1.0F - f16 * f16 * f16 * f16;
/*  746: 869 */       f10 = f10 * (1.0F - f13) + f14 * f13;
/*  747: 870 */       f11 = f11 * (1.0F - f13) + f15 * f13;
/*  748: 871 */       f12 = f12 * (1.0F - f13) + f16 * f13;
/*  749:     */       
/*  750: 873 */       f10 = f10 * 0.96F + 0.03F;
/*  751: 874 */       f11 = f11 * 0.96F + 0.03F;
/*  752: 875 */       f12 = f12 * 0.96F + 0.03F;
/*  753: 877 */       if (f10 > 1.0F) {
/*  754: 878 */         f10 = 1.0F;
/*  755:     */       }
/*  756: 880 */       if (f11 > 1.0F) {
/*  757: 881 */         f11 = 1.0F;
/*  758:     */       }
/*  759: 883 */       if (f12 > 1.0F) {
/*  760: 884 */         f12 = 1.0F;
/*  761:     */       }
/*  762: 886 */       if (f10 < 0.0F) {
/*  763: 887 */         f10 = 0.0F;
/*  764:     */       }
/*  765: 889 */       if (f11 < 0.0F) {
/*  766: 890 */         f11 = 0.0F;
/*  767:     */       }
/*  768: 892 */       if (f12 < 0.0F) {
/*  769: 893 */         f12 = 0.0F;
/*  770:     */       }
/*  771: 896 */       int i2 = 255;
/*  772: 897 */       int i3 = (int)(f10 * 255.0F);
/*  773: 898 */       int i4 = (int)(f11 * 255.0F);
/*  774: 899 */       int i5 = (int)(f12 * 255.0F);
/*  775:     */       
/*  776: 901 */       this.H[i1] = (i2 << 24 | i3 << 16 | i4 << 8 | i5);
/*  777:     */     }
/*  778: 903 */     this.G.d();
/*  779: 904 */     this.J = false;
/*  780: 905 */     this.h.y.b();
/*  781:     */   }
/*  782:     */   
/*  783:     */   private float a(EntityLiving paramxm, float paramFloat)
/*  784:     */   {
/*  785: 909 */     int i1 = paramxm.b(Potion.nightVision).getDuration();
/*  786: 910 */     if (i1 > 200) {
/*  787: 911 */       return 1.0F;
/*  788:     */     }
/*  789: 913 */     return 0.7F + MathUtils.sin((i1 - paramFloat) * 3.141593F * 0.2F) * 0.3F;
/*  790:     */   }
/*  791:     */   
/*  792:     */   public void b(float paramFloat)
/*  793:     */   {
/*  794: 918 */     boolean bool = Display.isActive();
/*  795: 920 */     if ((bool) || (!this.h.t.y) || ((this.h.t.z) && (Mouse.isButtonDown(1)))) {
/*  796: 921 */       this.E = bsu.I();
/*  797: 923 */     } else if (bsu.I() - this.E > 500L) {
/*  798: 924 */       this.h.p();
/*  799:     */     }
/*  800: 928 */     this.h.y.a("mouse");
/*  801: 929 */     if ((bool) && (bsu.a) && (this.h.w) && (!Mouse.isInsideWindow()))
/*  802:     */     {
/*  803: 930 */       Mouse.setGrabbed(false);
/*  804: 931 */       Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
/*  805: 932 */       Mouse.setGrabbed(true);
/*  806:     */     }
/*  807: 935 */     if ((this.h.w) && (bool))
/*  808:     */     {
/*  809: 936 */       this.h.u.c();
/*  810:     */       
/*  811: 938 */       float f1 = this.h.t.a * 0.6F + 0.2F;
/*  812: 939 */       float f2 = f1 * f1 * f1 * 8.0F;
/*  813: 940 */       float f3 = this.h.u.a * f2;
/*  814: 941 */       float f4 = this.h.u.b * f2;
/*  815:     */       
/*  816: 943 */       int i4 = 1;
/*  817: 944 */       if (this.h.t.b) {
/*  818: 945 */         i4 = -1;
/*  819:     */       }
/*  820: 948 */       if (this.h.t.aB)
/*  821:     */       {
/*  822: 949 */         this.s += f3;
/*  823: 950 */         this.t += f4;
/*  824:     */         
/*  825: 952 */         float f5 = paramFloat - this.w;
/*  826: 953 */         this.w = paramFloat;
/*  827:     */         
/*  828: 955 */         f3 = this.u * f5;
/*  829: 956 */         f4 = this.v * f5;
/*  830:     */         
/*  831: 958 */         this.h.h.c(f3, f4 * i4);
/*  832:     */       }
/*  833:     */       else
/*  834:     */       {
/*  835: 960 */         this.s = 0.0F;
/*  836: 961 */         this.t = 0.0F;
/*  837: 962 */         this.h.h.c(f3, f4 * i4);
/*  838:     */       }
/*  839:     */     }
/*  840: 966 */     this.h.y.b();
/*  841: 967 */     if (this.h.r) {
/*  842: 968 */       return;
/*  843:     */     }
/*  844: 970 */     a = this.h.t.e;
/*  845:     */     
/*  846: 972 */     buf localbuf = new buf(this.h, this.h.d, this.h.e);
/*  847: 973 */     int i1 = localbuf.a();
/*  848: 974 */     int i2 = localbuf.b();
/*  849: 975 */     int i3 = Mouse.getX() * i1 / this.h.d;
/*  850: 976 */     int i4 = i2 - Mouse.getY() * i2 / this.h.e - 1;
/*  851:     */     
/*  852: 978 */     int i5 = this.h.t.g;
/*  853: 980 */     if (this.h.f != null)
/*  854:     */     {
/*  855: 981 */       this.h.y.a("level");
/*  856: 982 */       int i6 = Math.max(bsu.ah(), 30);
/*  857: 983 */       a(paramFloat, this.F + 1000000000 / i6);
/*  858: 985 */       if (dax.N)
/*  859:     */       {
/*  860: 986 */         this.h.g.c();
/*  861: 988 */         if ((this.aa != null) && (this.ad))
/*  862:     */         {
/*  863: 989 */           cjm.glMatrixMode(5890);
/*  864: 990 */           cjm.glPushMatrix();
/*  865: 991 */           cjm.glLoadIdentity();
/*  866: 992 */           this.aa.a(paramFloat);
/*  867: 993 */           cjm.glPopMatrix();
/*  868:     */         }
/*  869: 995 */         this.h.b().a(true);
/*  870:     */       }
/*  871: 998 */       this.F = System.nanoTime();
/*  872: 999 */       this.h.y.c("gui");
/*  873:1000 */       if ((!this.h.t.aw) || (this.h.m != null))
/*  874:     */       {
/*  875:1001 */         cjm.glAlphaFunc(516, 0.1F);
/*  876:1002 */         this.h.q.a(paramFloat);
/*  877:     */       }
/*  878:1004 */       this.h.y.b();
/*  879:     */     }
/*  880:     */     else
/*  881:     */     {
/*  882:1006 */       cjm.b(0, 0, this.h.d, this.h.e);
/*  883:1007 */       cjm.glMatrixMode(5889);
/*  884:1008 */       cjm.glLoadIdentity();
/*  885:1009 */       cjm.glMatrixMode(5888);
/*  886:1010 */       cjm.glLoadIdentity();
/*  887:1011 */       j();
/*  888:     */       
/*  889:1013 */       this.F = System.nanoTime();
/*  890:     */     }
/*  891:1016 */     if (this.h.m != null)
/*  892:     */     {
/*  893:1017 */       cjm.glClear(256);
/*  894:     */       try
/*  895:     */       {
/*  896:1020 */         this.h.m.a(i3, i4, paramFloat);
/*  897:     */       }
/*  898:     */       catch (Throwable localThrowable)
/*  899:     */       {
/*  900:1022 */         b localb = net.minecraft.src.b.a(localThrowable, "Rendering screen");
/*  901:1023 */         j localj = localb.a("Screen render details");
/*  902:     */         
/*  903:1025 */         localj.a("Screen name", new cjj(this));
/*  904:     */         
/*  905:     */ 
/*  906:     */ 
/*  907:     */ 
/*  908:     */ 
/*  909:     */ 
/*  910:1032 */         localj.a("Mouse location", new cjk(this, i3, i4));
/*  911:     */         
/*  912:     */ 
/*  913:     */ 
/*  914:     */ 
/*  915:     */ 
/*  916:     */ 
/*  917:1039 */         localj.a("Screen size", new cjl(this, localbuf));
/*  918:     */         
/*  919:     */ 
/*  920:     */ 
/*  921:     */ 
/*  922:     */ 
/*  923:     */ 
/*  924:1046 */         throw new u(localb);
/*  925:     */       }
/*  926:     */     }
/*  927:     */   }
/*  928:     */   
/*  929:     */   public void c(float paramFloat)
/*  930:     */   {
/*  931:1052 */     j();
/*  932:1053 */     this.h.q.c(new buf(this.h, this.h.d, this.h.e));
/*  933:     */   }
/*  934:     */   
/*  935:     */   private boolean n()
/*  936:     */   {
/*  937:1057 */     if (!this.D) {
/*  938:1058 */       return false;
/*  939:     */     }
/*  940:1061 */     Entity localwv = this.h.aa();
/*  941:1062 */     boolean bool = ((localwv instanceof EntityPlayer)) && (!this.h.t.aw);
/*  942:1063 */     if ((bool) && (!((EntityPlayer)localwv).by.e))
/*  943:     */     {
/*  944:1065 */       ItemStack localamj = ((EntityPlayer)localwv).bY();
/*  945:1066 */       if ((this.h.s != null) && (this.h.s.a == brv.BLOCK))
/*  946:     */       {
/*  947:1067 */         BlockPosition localdt = this.h.s.a();
/*  948:1068 */         ProtoBlock localatr = this.h.f.getBlock(localdt).getProto();
/*  949:1069 */         if (this.h.c.l() == EnumGameType.e) {
/*  950:1070 */           bool = (localatr.x()) && ((this.h.f.s(localdt) instanceof vq));
/*  951:     */         } else {
/*  952:1072 */           bool = (localamj != null) && ((localamj.c(localatr)) || (localamj.d(localatr)));
/*  953:     */         }
/*  954:     */       }
/*  955:     */     }
/*  956:1076 */     return bool;
/*  957:     */   }
/*  958:     */   
/*  959:     */   private void i(float paramFloat)
/*  960:     */   {
/*  961:1080 */     if ((this.h.t.ay) && (!this.h.t.aw) && (!this.h.h.cp()) && (!this.h.t.v))
/*  962:     */     {
/*  963:1081 */       Entity localwv = this.h.aa();
/*  964:     */       
/*  965:     */ 
/*  966:1084 */       cjm.enableBlend();
/*  967:1085 */       cjm.glBlendFuncSeparate(770, 771, 1, 0);
/*  968:1086 */       GL11.glLineWidth(1.0F);
/*  969:1087 */       cjm.x();
/*  970:1088 */       cjm.a(false);
/*  971:     */       
/*  972:1090 */       cjm.glPushMatrix();
/*  973:1091 */       cjm.glMatrixMode(5888);
/*  974:1092 */       cjm.glLoadIdentity();
/*  975:1093 */       g(paramFloat);
/*  976:1094 */       cjm.glTranslatef(0.0F, localwv.aR(), 0.0F);
/*  977:1095 */       ckn.a(new AABB(0.0D, 0.0D, 0.0D, 0.005D, 0.0001D, 0.0001D), -65536);
/*  978:1096 */       ckn.a(new AABB(0.0D, 0.0D, 0.0D, 0.0001D, 0.0001D, 0.005D), -16776961);
/*  979:1097 */       ckn.a(new AABB(0.0D, 0.0D, 0.0D, 0.0001D, 0.0033D, 0.0001D), -16711936);
/*  980:1098 */       cjm.glPopMatrix();
/*  981:     */       
/*  982:1100 */       cjm.a(true);
/*  983:1101 */       cjm.w();
/*  984:1102 */       cjm.disableBlend();
/*  985:     */     }
/*  986:     */   }
/*  987:     */   
/*  988:     */   public void a(float paramFloat, long paramLong)
/*  989:     */   {
/*  990:1107 */     h(paramFloat);
/*  991:1108 */     if (this.h.aa() == null) {
/*  992:1109 */       this.h.a(this.h.h);
/*  993:     */     }
/*  994:1112 */     a(paramFloat);
/*  995:     */     
/*  996:1114 */     cjm.j();
/*  997:1115 */     cjm.enableAlphaTest();
/*  998:1116 */     cjm.glAlphaFunc(516, 0.5F);
/*  999:     */     
/* 1000:1118 */     this.h.y.a("center");
/* 1001:1119 */     if (this.h.t.e)
/* 1002:     */     {
/* 1003:1120 */       b = 0;
/* 1004:1121 */       cjm.a(false, true, true, false);
/* 1005:1122 */       a(0, paramFloat, paramLong);
/* 1006:     */       
/* 1007:1124 */       b = 1;
/* 1008:1125 */       cjm.a(true, false, false, false);
/* 1009:1126 */       a(1, paramFloat, paramLong);
/* 1010:     */       
/* 1011:1128 */       cjm.a(true, true, true, false);
/* 1012:     */     }
/* 1013:     */     else
/* 1014:     */     {
/* 1015:1130 */       a(2, paramFloat, paramLong);
/* 1016:     */     }
/* 1017:1132 */     this.h.y.b();
/* 1018:     */   }
/* 1019:     */   
/* 1020:     */   private void a(int paramInt, float paramFloat, long paramLong)
/* 1021:     */   {
/* 1022:1136 */     ckn localckn = this.h.g;
/* 1023:1137 */     cgx localcgx = this.h.j;
/* 1024:     */     
/* 1025:1139 */     boolean bool = n();
/* 1026:     */     
/* 1027:1141 */     cjm.o();
/* 1028:     */     
/* 1029:1143 */     this.h.y.c("clear");
/* 1030:1144 */     cjm.b(0, 0, this.h.d, this.h.e);
/* 1031:1145 */     j(paramFloat);
/* 1032:1146 */     cjm.glClear(16640);
/* 1033:     */     
/* 1034:1148 */     this.h.y.c("camera");
/* 1035:1149 */     a(paramFloat, paramInt);
/* 1036:1150 */     bsp.a(this.h.h, this.h.t.ax == 2);
/* 1037:     */     
/* 1038:1152 */     this.h.y.c("frustum");
/* 1039:1153 */     coy.a();
/* 1040:     */     
/* 1041:1155 */     this.h.y.c("culling");
/* 1042:1156 */     coz localcoz = new coz();
/* 1043:1157 */     Entity localwv = this.h.aa();
/* 1044:1158 */     double d1 = localwv.P + (localwv.xPos - localwv.P) * paramFloat;
/* 1045:1159 */     double d2 = localwv.Q + (localwv.yPos - localwv.Q) * paramFloat;
/* 1046:1160 */     double d3 = localwv.R + (localwv.zPos - localwv.R) * paramFloat;
/* 1047:1161 */     localcoz.a(d1, d2, d3);
/* 1048:1163 */     if (this.h.t.c >= 4)
/* 1049:     */     {
/* 1050:1164 */       a(-1, paramFloat);
/* 1051:1165 */       this.h.y.c("sky");
/* 1052:     */       
/* 1053:1167 */       cjm.glMatrixMode(5889);
/* 1054:1168 */       cjm.glLoadIdentity();
/* 1055:1169 */       Project.gluPerspective(a(paramFloat, true), this.h.d / this.h.e, 0.05F, this.k * 2.0F);
/* 1056:     */       
/* 1057:1171 */       cjm.glMatrixMode(5888);
/* 1058:     */       
/* 1059:1173 */       localckn.a(paramFloat, paramInt);
/* 1060:     */       
/* 1061:1175 */       cjm.glMatrixMode(5889);
/* 1062:1176 */       cjm.glLoadIdentity();
/* 1063:1177 */       Project.gluPerspective(a(paramFloat, true), this.h.d / this.h.e, 0.05F, this.k * MathUtils.a);
/* 1064:     */       
/* 1065:1179 */       cjm.glMatrixMode(5888);
/* 1066:     */     }
/* 1067:1181 */     a(0, paramFloat);
/* 1068:     */     
/* 1069:1183 */     cjm.j(7425);
/* 1070:1185 */     if (localwv.yPos + localwv.aR() < 128.0D) {
/* 1071:1186 */       a(localckn, paramFloat, paramInt);
/* 1072:     */     }
/* 1073:1189 */     this.h.y.c("prepareterrain");
/* 1074:     */     
/* 1075:1191 */     a(0, paramFloat);
/* 1076:1192 */     this.h.N().a(cua.g);
/* 1077:1193 */     bss.a();
/* 1078:1194 */     this.h.y.c("terrain_setup");
/* 1079:     */     
/* 1080:1196 */     localckn.a(localwv, paramFloat, localcoz, this.ae++, this.h.h.v());
/* 1081:1198 */     if ((paramInt == 0) || (paramInt == 2))
/* 1082:     */     {
/* 1083:1199 */       this.h.y.c("updatechunks");
/* 1084:1200 */       this.h.g.a(paramLong);
/* 1085:     */     }
/* 1086:1203 */     this.h.y.c("terrain");
/* 1087:1204 */     cjm.glMatrixMode(5888);
/* 1088:1205 */     cjm.glPushMatrix();
/* 1089:1206 */     cjm.disableAlphaTest();
/* 1090:1207 */     localckn.a(aql.a, paramFloat, paramInt, localwv);
/* 1091:     */     
/* 1092:1209 */     cjm.enableAlphaTest();
/* 1093:1210 */     localckn.a(aql.b, paramFloat, paramInt, localwv);
/* 1094:     */     
/* 1095:1212 */     this.h.N().b(cua.g).b(false, false);
/* 1096:1213 */     localckn.a(aql.c, paramFloat, paramInt, localwv);
/* 1097:1214 */     this.h.N().b(cua.g).a();
/* 1098:     */     
/* 1099:1216 */     cjm.j(7424);
/* 1100:     */     
/* 1101:1218 */     cjm.glAlphaFunc(516, 0.1F);
/* 1102:     */     EntityPlayer localahd;
/* 1103:1219 */     if (!this.W)
/* 1104:     */     {
/* 1105:1220 */       cjm.glMatrixMode(5888);
/* 1106:1221 */       cjm.glPopMatrix();
/* 1107:1222 */       cjm.glPushMatrix();
/* 1108:1223 */       bss.b();
/* 1109:1224 */       this.h.y.c("entities");
/* 1110:1225 */       localckn.a(localwv, localcoz, paramFloat);
/* 1111:1226 */       bss.a();
/* 1112:1227 */       h();
/* 1113:     */       
/* 1114:1229 */       cjm.glMatrixMode(5888);
/* 1115:1230 */       cjm.glPopMatrix();
/* 1116:1231 */       cjm.glPushMatrix();
/* 1117:1232 */       if ((this.h.s != null) && (localwv.a(Material.water)) && (bool))
/* 1118:     */       {
/* 1119:1233 */         localahd = (EntityPlayer)localwv;
/* 1120:1234 */         cjm.disableAlphaTest();
/* 1121:1235 */         this.h.y.c("outline");
/* 1122:1236 */         localckn.a(localahd, this.h.s, 0, paramFloat);
/* 1123:1237 */         cjm.enableAlphaTest();
/* 1124:     */       }
/* 1125:     */     }
/* 1126:1241 */     cjm.glMatrixMode(5888);
/* 1127:1242 */     cjm.glPopMatrix();
/* 1128:1244 */     if ((bool) && 
/* 1129:1245 */       (this.h.s != null) && (!localwv.a(Material.water)))
/* 1130:     */     {
/* 1131:1246 */       localahd = (EntityPlayer)localwv;
/* 1132:1247 */       cjm.disableAlphaTest();
/* 1133:     */       
/* 1134:1249 */       this.h.y.c("outline");
/* 1135:1250 */       localckn.a(localahd, this.h.s, 0, paramFloat);
/* 1136:1251 */       cjm.enableAlphaTest();
/* 1137:     */     }
/* 1138:1255 */     this.h.y.c("destroyProgress");
/* 1139:1256 */     cjm.enableBlend();
/* 1140:1257 */     cjm.glBlendFuncSeparate(770, 1, 1, 0);
/* 1141:1258 */     localckn.a(ckx.getInstance(), ckx.getInstance().getBuffer(), localwv, paramFloat);
/* 1142:1259 */     cjm.disableBlend();
/* 1143:1261 */     if (!this.W)
/* 1144:     */     {
/* 1145:1262 */       i();
/* 1146:1263 */       this.h.y.c("litParticles");
/* 1147:1264 */       localcgx.b(localwv, paramFloat);
/* 1148:1265 */       bss.a();
/* 1149:1266 */       a(0, paramFloat);
/* 1150:1267 */       this.h.y.c("particles");
/* 1151:1268 */       localcgx.a(localwv, paramFloat);
/* 1152:1269 */       h();
/* 1153:     */     }
/* 1154:1272 */     cjm.a(false);
/* 1155:1273 */     cjm.o();
/* 1156:1274 */     this.h.y.c("weather");
/* 1157:1275 */     d(paramFloat);
/* 1158:1276 */     cjm.a(true);
/* 1159:     */     
/* 1160:1278 */     localckn.a(localwv, paramFloat);
/* 1161:     */     
/* 1162:1280 */     cjm.disableBlend();
/* 1163:1281 */     cjm.o();
/* 1164:1282 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 1165:1283 */     cjm.glAlphaFunc(516, 0.1F);
/* 1166:1284 */     a(0, paramFloat);
/* 1167:1285 */     cjm.enableBlend();
/* 1168:1286 */     cjm.a(false);
/* 1169:1287 */     this.h.N().a(cua.g);
/* 1170:1288 */     cjm.j(7425);
/* 1171:1289 */     if (this.h.t.i)
/* 1172:     */     {
/* 1173:1290 */       this.h.y.c("translucent");
/* 1174:     */       
/* 1175:     */ 
/* 1176:1293 */       cjm.enableBlend();
/* 1177:1294 */       cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 1178:1295 */       localckn.a(aql.d, paramFloat, paramInt, localwv);
/* 1179:1296 */       cjm.disableBlend();
/* 1180:     */     }
/* 1181:     */     else
/* 1182:     */     {
/* 1183:1299 */       this.h.y.c("translucent");
/* 1184:1300 */       localckn.a(aql.d, paramFloat, paramInt, localwv);
/* 1185:     */     }
/* 1186:1302 */     cjm.j(7424);
/* 1187:     */     
/* 1188:1304 */     cjm.a(true);
/* 1189:1305 */     cjm.o();
/* 1190:1306 */     cjm.disableBlend();
/* 1191:1307 */     cjm.n();
/* 1192:1309 */     if (localwv.yPos + localwv.aR() >= 128.0D)
/* 1193:     */     {
/* 1194:1310 */       this.h.y.c("aboveClouds");
/* 1195:1311 */       a(localckn, paramFloat, paramInt);
/* 1196:     */     }
/* 1197:1314 */     this.h.y.c("hand");
/* 1198:1315 */     if (this.C)
/* 1199:     */     {
/* 1200:1316 */       cjm.glClear(256);
/* 1201:1317 */       b(paramFloat, paramInt);
/* 1202:     */       
/* 1203:1319 */       i(paramFloat);
/* 1204:     */     }
/* 1205:     */   }
/* 1206:     */   
/* 1207:     */   private void a(ckn paramckn, float paramFloat, int paramInt)
/* 1208:     */   {
/* 1209:1324 */     if (this.h.t.e())
/* 1210:     */     {
/* 1211:1325 */       this.h.y.c("clouds");
/* 1212:     */       
/* 1213:1327 */       cjm.glMatrixMode(5889);
/* 1214:1328 */       cjm.glLoadIdentity();
/* 1215:1329 */       Project.gluPerspective(a(paramFloat, true), this.h.d / this.h.e, 0.05F, this.k * 4.0F);
/* 1216:     */       
/* 1217:1331 */       cjm.glMatrixMode(5888);
/* 1218:1332 */       cjm.glPushMatrix();
/* 1219:     */       
/* 1220:1334 */       a(0, paramFloat);
/* 1221:     */       
/* 1222:1336 */       paramckn.b(paramFloat, paramInt);
/* 1223:     */       
/* 1224:1338 */       cjm.n();
/* 1225:1339 */       cjm.glPopMatrix();
/* 1226:     */       
/* 1227:1341 */       cjm.glMatrixMode(5889);
/* 1228:1342 */       cjm.glLoadIdentity();
/* 1229:1343 */       Project.gluPerspective(a(paramFloat, true), this.h.d / this.h.e, 0.05F, this.k * MathUtils.a);
/* 1230:1344 */       cjm.glMatrixMode(5888);
/* 1231:     */     }
/* 1232:     */   }
/* 1233:     */   
/* 1234:     */   private void o()
/* 1235:     */   {
/* 1236:1349 */     float f1 = this.h.f.j(1.0F);
/* 1237:1350 */     if (!this.h.t.i) {
/* 1238:1351 */       f1 /= 2.0F;
/* 1239:     */     }
/* 1240:1353 */     if (f1 == 0.0F) {
/* 1241:1354 */       return;
/* 1242:     */     }
/* 1243:1357 */     this.j.setSeed(this.m * 312987231L);
/* 1244:1358 */     Entity localwv = this.h.aa();
/* 1245:1359 */     cen localcen = this.h.f;
/* 1246:     */     
/* 1247:1361 */     BlockPosition localdt1 = new BlockPosition(localwv);
/* 1248:     */     
/* 1249:1363 */     int i1 = 10;
/* 1250:     */     
/* 1251:1365 */     double d1 = 0.0D;
/* 1252:1366 */     double d2 = 0.0D;
/* 1253:1367 */     double d3 = 0.0D;
/* 1254:1368 */     int i2 = 0;
/* 1255:1369 */     int i3 = (int)(100.0F * f1 * f1);
/* 1256:1370 */     if (this.h.t.aH == 1) {
/* 1257:1371 */       i3 >>= 1;
/* 1258:1372 */     } else if (this.h.t.aH == 2) {
/* 1259:1373 */       i3 = 0;
/* 1260:     */     }
/* 1261:1375 */     for (int i4 = 0; i4 < i3; i4++)
/* 1262:     */     {
/* 1263:1376 */       BlockPosition localdt2 = localcen.q(localdt1.offset(this.j.nextInt(i1) - this.j.nextInt(i1), 0, this.j.nextInt(i1) - this.j.nextInt(i1)));
/* 1264:     */       
/* 1265:1378 */       arm localarm = localcen.b(localdt2);
/* 1266:1379 */       BlockPosition localdt3 = localdt2.down();
/* 1267:1380 */       ProtoBlock localatr = localcen.getBlock(localdt3).getProto();
/* 1268:1382 */       if ((localdt2.getY() <= localdt1.getY() + i1) && (localdt2.getY() >= localdt1.getY() - i1) && (localarm.e()) && (localarm.a(localdt2) >= 0.15F))
/* 1269:     */       {
/* 1270:1383 */         float f2 = this.j.nextFloat();
/* 1271:1384 */         float f3 = this.j.nextFloat();
/* 1272:1385 */         if (localatr.getMaterial() == Material.lava)
/* 1273:     */         {
/* 1274:1386 */           this.h.f.a(ew.l, localdt2.getX() + f2, localdt2.getY() + 0.1F - localatr.B(), localdt2.getZ() + f3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 1275:     */         }
/* 1276:1387 */         else if (localatr.getMaterial() != Material.air)
/* 1277:     */         {
/* 1278:1388 */           localatr.a(localcen, localdt3);
/* 1279:1389 */           if (this.j.nextInt(++i2) == 0)
/* 1280:     */           {
/* 1281:1390 */             d1 = localdt3.getX() + f2;
/* 1282:1391 */             d2 = localdt3.getY() + 0.1F + localatr.C() - 1.0D;
/* 1283:1392 */             d3 = localdt3.getZ() + f3;
/* 1284:     */           }
/* 1285:1394 */           this.h.f.a(ew.N, localdt3.getX() + f2, localdt3.getY() + 0.1F + localatr.C(), localdt3.getZ() + f3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 1286:     */         }
/* 1287:     */       }
/* 1288:     */     }
/* 1289:1399 */     if ((i2 > 0) && (this.j.nextInt(3) < this.M++))
/* 1290:     */     {
/* 1291:1400 */       this.M = 0;
/* 1292:1401 */       if ((d2 > localdt1.getY() + 1) && (localcen.q(localdt1).getY() > MathUtils.floor(localdt1.getY()))) {
/* 1293:1402 */         this.h.f.a(d1, d2, d3, "ambient.weather.rain", 0.1F, 0.5F, false);
/* 1294:     */       } else {
/* 1295:1404 */         this.h.f.a(d1, d2, d3, "ambient.weather.rain", 0.2F, 1.0F, false);
/* 1296:     */       }
/* 1297:     */     }
/* 1298:     */   }
/* 1299:     */   
/* 1300:     */   protected void d(float paramFloat)
/* 1301:     */   {
/* 1302:1410 */     float f1 = this.h.f.j(paramFloat);
/* 1303:1411 */     if (f1 <= 0.0F) {
/* 1304:1412 */       return;
/* 1305:     */     }
/* 1306:1414 */     i();
/* 1307:     */     
/* 1308:1416 */     Entity localwv = this.h.aa();
/* 1309:1417 */     cen localcen = this.h.f;
/* 1310:     */     
/* 1311:1419 */     int i1 = MathUtils.floor(localwv.xPos);
/* 1312:1420 */     int i2 = MathUtils.floor(localwv.yPos);
/* 1313:1421 */     int i3 = MathUtils.floor(localwv.zPos);
/* 1314:     */     
/* 1315:1423 */     ckx localckx = ckx.getInstance();
/* 1316:1424 */     VertexBuffer localciv = localckx.getBuffer();
/* 1317:1425 */     cjm.p();
/* 1318:1426 */     GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/* 1319:1427 */     cjm.enableBlend();
/* 1320:1428 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 1321:1429 */     cjm.glAlphaFunc(516, 0.1F);
/* 1322:     */     
/* 1323:1431 */     double d1 = localwv.P + (localwv.xPos - localwv.P) * paramFloat;
/* 1324:1432 */     double d2 = localwv.Q + (localwv.yPos - localwv.Q) * paramFloat;
/* 1325:1433 */     double d3 = localwv.R + (localwv.zPos - localwv.R) * paramFloat;
/* 1326:     */     
/* 1327:1435 */     int i4 = MathUtils.floor(d2);
/* 1328:     */     
/* 1329:1437 */     int i5 = 5;
/* 1330:1438 */     if (this.h.t.i) {
/* 1331:1439 */       i5 = 10;
/* 1332:     */     }
/* 1333:1442 */     int i6 = -1;
/* 1334:1443 */     float f2 = this.m + paramFloat;
/* 1335:1445 */     if (this.h.t.i) {
/* 1336:1446 */       i5 = 10;
/* 1337:     */     }
/* 1338:1448 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 1339:1449 */     for (int i7 = i3 - i5; i7 <= i3 + i5; i7++) {
/* 1340:1450 */       for (int i8 = i1 - i5; i8 <= i1 + i5; i8++)
/* 1341:     */       {
/* 1342:1451 */         int i9 = (i7 - i3 + 16) * 32 + (i8 - i1 + 16);
/* 1343:1452 */         float f3 = this.N[i9] * 0.5F;
/* 1344:1453 */         float f4 = this.O[i9] * 0.5F;
/* 1345:1454 */         BlockPosition localdt = new BlockPosition(i8, 0, i7);
/* 1346:1455 */         arm localarm = localcen.b(localdt);
/* 1347:1456 */         if ((localarm.e()) || (localarm.d()))
/* 1348:     */         {
/* 1349:1460 */           int i10 = localcen.q(localdt).getY();
/* 1350:     */           
/* 1351:1462 */           int i11 = i2 - i5;
/* 1352:1463 */           int i12 = i2 + i5;
/* 1353:1465 */           if (i11 < i10) {
/* 1354:1466 */             i11 = i10;
/* 1355:     */           }
/* 1356:1468 */           if (i12 < i10) {
/* 1357:1469 */             i12 = i10;
/* 1358:     */           }
/* 1359:1471 */           float f5 = 1.0F;
/* 1360:     */           
/* 1361:1473 */           int i13 = i10;
/* 1362:1474 */           if (i13 < i4) {
/* 1363:1475 */             i13 = i4;
/* 1364:     */           }
/* 1365:1478 */           if (i11 != i12)
/* 1366:     */           {
/* 1367:1479 */             this.j.setSeed(i8 * i8 * 3121 + i8 * 45238971 ^ i7 * i7 * 418711 + i7 * 13761);
/* 1368:     */             
/* 1369:1481 */             float f6 = localarm.a(new BlockPosition(i8, i11, i7));
/* 1370:     */             float f7;
/* 1371:     */             double d5;
/* 1372:1483 */             if (localcen.v().a(f6, i10) >= 0.15F)
/* 1373:     */             {
/* 1374:1484 */               if (i6 != 0)
/* 1375:     */               {
/* 1376:1485 */                 if (i6 >= 0) {
/* 1377:1486 */                   localckx.draw();
/* 1378:     */                 }
/* 1379:1488 */                 i6 = 0;
/* 1380:1489 */                 this.h.N().a(f);
/* 1381:1490 */                 localciv.begin();
/* 1382:     */               }
/* 1383:1493 */               f7 = ((this.m + i8 * i8 * 3121 + i8 * 45238971 + i7 * i7 * 418711 + i7 * 13761 & 0x1F) + paramFloat) / 32.0F * (3.0F + this.j.nextFloat());
/* 1384:     */               
/* 1385:1495 */               double d4 = i8 + 0.5F - localwv.xPos;
/* 1386:1496 */               d5 = i7 + 0.5F - localwv.zPos;
/* 1387:1497 */               float f10 = MathUtils.a(d4 * d4 + d5 * d5) / i5;
/* 1388:     */               
/* 1389:1499 */               float f11 = 1.0F;
/* 1390:1500 */               localciv.b(localcen.b(new BlockPosition(i8, i13, i7), 0));
/* 1391:1501 */               localciv.setColor(f11, f11, f11, ((1.0F - f10 * f10) * 0.5F + 0.5F) * f1);
/* 1392:1502 */               localciv.c(-d1 * 1.0D, -d2 * 1.0D, -d3 * 1.0D);
/* 1393:1503 */               localciv.addVertexWithUV(i8 - f3 + 0.5D, i11, i7 - f4 + 0.5D, 0.0F * f5, i11 * f5 / 4.0F + f7 * f5);
/* 1394:1504 */               localciv.addVertexWithUV(i8 + f3 + 0.5D, i11, i7 + f4 + 0.5D, 1.0F * f5, i11 * f5 / 4.0F + f7 * f5);
/* 1395:1505 */               localciv.addVertexWithUV(i8 + f3 + 0.5D, i12, i7 + f4 + 0.5D, 1.0F * f5, i12 * f5 / 4.0F + f7 * f5);
/* 1396:1506 */               localciv.addVertexWithUV(i8 - f3 + 0.5D, i12, i7 - f4 + 0.5D, 0.0F * f5, i12 * f5 / 4.0F + f7 * f5);
/* 1397:     */               
/* 1398:1508 */               localciv.c(0.0D, 0.0D, 0.0D);
/* 1399:     */             }
/* 1400:     */             else
/* 1401:     */             {
/* 1402:1510 */               if (i6 != 1)
/* 1403:     */               {
/* 1404:1511 */                 if (i6 >= 0) {
/* 1405:1512 */                   localckx.draw();
/* 1406:     */                 }
/* 1407:1514 */                 i6 = 1;
/* 1408:1515 */                 this.h.N().a(g);
/* 1409:     */                 
/* 1410:1517 */                 localciv.begin();
/* 1411:     */               }
/* 1412:1519 */               f7 = ((this.m & 0x1FF) + paramFloat) / 512.0F;
/* 1413:1520 */               float f8 = this.j.nextFloat() + f2 * 0.01F * (float)this.j.nextGaussian();
/* 1414:1521 */               float f9 = this.j.nextFloat() + f2 * (float)this.j.nextGaussian() * 0.001F;
/* 1415:1522 */               d5 = i8 + 0.5F - localwv.xPos;
/* 1416:1523 */               double d6 = i7 + 0.5F - localwv.zPos;
/* 1417:1524 */               float f12 = MathUtils.a(d5 * d5 + d6 * d6) / i5;
/* 1418:1525 */               float f13 = 1.0F;
/* 1419:1526 */               localciv.b((localcen.b(new BlockPosition(i8, i13, i7), 0) * 3 + 15728880) / 4);
/* 1420:1527 */               localciv.setColor(f13, f13, f13, ((1.0F - f12 * f12) * 0.3F + 0.5F) * f1);
/* 1421:1528 */               localciv.c(-d1 * 1.0D, -d2 * 1.0D, -d3 * 1.0D);
/* 1422:1529 */               localciv.addVertexWithUV(i8 - f3 + 0.5D, i11, i7 - f4 + 0.5D, 0.0F * f5 + f8, i11 * f5 / 4.0F + f7 * f5 + f9);
/* 1423:1530 */               localciv.addVertexWithUV(i8 + f3 + 0.5D, i11, i7 + f4 + 0.5D, 1.0F * f5 + f8, i11 * f5 / 4.0F + f7 * f5 + f9);
/* 1424:1531 */               localciv.addVertexWithUV(i8 + f3 + 0.5D, i12, i7 + f4 + 0.5D, 1.0F * f5 + f8, i12 * f5 / 4.0F + f7 * f5 + f9);
/* 1425:1532 */               localciv.addVertexWithUV(i8 - f3 + 0.5D, i12, i7 - f4 + 0.5D, 0.0F * f5 + f8, i12 * f5 / 4.0F + f7 * f5 + f9);
/* 1426:1533 */               localciv.c(0.0D, 0.0D, 0.0D);
/* 1427:     */             }
/* 1428:     */           }
/* 1429:     */         }
/* 1430:     */       }
/* 1431:     */     }
/* 1432:1538 */     if (i6 >= 0) {
/* 1433:1539 */       localckx.draw();
/* 1434:     */     }
/* 1435:1541 */     cjm.o();
/* 1436:1542 */     cjm.disableBlend();
/* 1437:1543 */     cjm.glAlphaFunc(516, 0.1F);
/* 1438:1544 */     h();
/* 1439:     */   }
/* 1440:     */   
/* 1441:     */   public void j()
/* 1442:     */   {
/* 1443:1548 */     buf localbuf = new buf(this.h, this.h.d, this.h.e);
/* 1444:     */     
/* 1445:1550 */     cjm.glClear(256);
/* 1446:1551 */     cjm.glMatrixMode(5889);
/* 1447:1552 */     cjm.glLoadIdentity();
/* 1448:1553 */     cjm.glOrtho(0.0D, localbuf.c(), localbuf.d(), 0.0D, 1000.0D, 3000.0D);
/* 1449:1554 */     cjm.glMatrixMode(5888);
/* 1450:1555 */     cjm.glLoadIdentity();
/* 1451:1556 */     cjm.glTranslatef(0.0F, 0.0F, -2000.0F);
/* 1452:     */   }
/* 1453:     */   
/* 1454:     */   private void j(float paramFloat)
/* 1455:     */   {
/* 1456:1560 */     cen localcen = this.h.f;
/* 1457:1561 */     Entity localwv = this.h.aa();
/* 1458:     */     
/* 1459:1563 */     float f1 = 0.25F + 0.75F * this.h.t.c / 32.0F;
/* 1460:1564 */     f1 = 1.0F - (float)Math.pow(f1, 0.25D);
/* 1461:     */     
/* 1462:1566 */     Vec3 localbrw1 = localcen.a(this.h.aa(), paramFloat);
/* 1463:1567 */     float f2 = (float)localbrw1.x;
/* 1464:1568 */     float f3 = (float)localbrw1.y;
/* 1465:1569 */     float f4 = (float)localbrw1.z;
/* 1466:     */     
/* 1467:1571 */     Vec3 localbrw2 = localcen.f(paramFloat);
/* 1468:1572 */     this.Q = ((float)localbrw2.x);
/* 1469:1573 */     this.R = ((float)localbrw2.y);
/* 1470:1574 */     this.S = ((float)localbrw2.z);
/* 1471:1576 */     if (this.h.t.c >= 4)
/* 1472:     */     {
/* 1473:1577 */       double d1 = -1.0D;
/* 1474:1578 */       Vec3 localbrw3 = MathUtils.sin(localcen.d(paramFloat)) > 0.0F ? new Vec3(d1, 0.0D, 0.0D) : new Vec3(1.0D, 0.0D, 0.0D);
/* 1475:1579 */       float f8 = (float)localwv.d(paramFloat).dot(localbrw3);
/* 1476:1580 */       if (f8 < 0.0F) {
/* 1477:1581 */         f8 = 0.0F;
/* 1478:     */       }
/* 1479:1583 */       if (f8 > 0.0F)
/* 1480:     */       {
/* 1481:1584 */         float[] arrayOfFloat = localcen.t.a(localcen.c(paramFloat), paramFloat);
/* 1482:1585 */         if (arrayOfFloat != null)
/* 1483:     */         {
/* 1484:1586 */           f8 *= arrayOfFloat[3];
/* 1485:1587 */           this.Q = (this.Q * (1.0F - f8) + arrayOfFloat[0] * f8);
/* 1486:1588 */           this.R = (this.R * (1.0F - f8) + arrayOfFloat[1] * f8);
/* 1487:1589 */           this.S = (this.S * (1.0F - f8) + arrayOfFloat[2] * f8);
/* 1488:     */         }
/* 1489:     */       }
/* 1490:     */     }
/* 1491:1594 */     this.Q += (f2 - this.Q) * f1;
/* 1492:1595 */     this.R += (f3 - this.R) * f1;
/* 1493:1596 */     this.S += (f4 - this.S) * f1;
/* 1494:     */     
/* 1495:1598 */     float f5 = localcen.j(paramFloat);
/* 1496:     */     float f7;
/* 1497:1599 */     if (f5 > 0.0F)
/* 1498:     */     {
/* 1499:1600 */       float f6 = 1.0F - f5 * 0.5F;
/* 1500:1601 */       f7 = 1.0F - f5 * 0.4F;
/* 1501:1602 */       this.Q *= f6;
/* 1502:1603 */       this.R *= f6;
/* 1503:1604 */       this.S *= f7;
/* 1504:     */     }
/* 1505:1606 */     float f6 = localcen.h(paramFloat);
/* 1506:1607 */     if (f6 > 0.0F)
/* 1507:     */     {
/* 1508:1608 */       f7 = 1.0F - f6 * 0.5F;
/* 1509:1609 */       this.Q *= f7;
/* 1510:1610 */       this.R *= f7;
/* 1511:1611 */       this.S *= f7;
/* 1512:     */     }
/* 1513:1614 */     ProtoBlock localatr = bsp.a(this.h.f, localwv, paramFloat);
/* 1514:1615 */     if (this.B)
/* 1515:     */     {
/* 1516:1616 */       Vec3 localbrw4 = localcen.e(paramFloat);
/* 1517:1617 */       this.Q = ((float)localbrw4.x);
/* 1518:1618 */       this.R = ((float)localbrw4.y);
/* 1519:1619 */       this.S = ((float)localbrw4.z);
/* 1520:     */     }
/* 1521:1620 */     else if (localatr.getMaterial() == Material.water)
/* 1522:     */     {
/* 1523:1621 */       float f9 = aph.a(localwv) * 0.2F;
/* 1524:1622 */       if (((localwv instanceof EntityLiving)) && (((EntityLiving)localwv).a(Potion.waterBreathing))) {
/* 1525:1624 */         f9 = f9 * 0.3F + 0.6F;
/* 1526:     */       }
/* 1527:1627 */       this.Q = (0.02F + f9);
/* 1528:1628 */       this.R = (0.02F + f9);
/* 1529:1629 */       this.S = (0.2F + f9);
/* 1530:     */     }
/* 1531:1630 */     else if (localatr.getMaterial() == Material.lava)
/* 1532:     */     {
/* 1533:1631 */       this.Q = 0.6F;
/* 1534:1632 */       this.R = 0.1F;
/* 1535:1633 */       this.S = 0.0F;
/* 1536:     */     }
/* 1537:1636 */     float f9 = this.T + (this.U - this.T) * paramFloat;
/* 1538:1637 */     this.Q *= f9;
/* 1539:1638 */     this.R *= f9;
/* 1540:1639 */     this.S *= f9;
/* 1541:     */     
/* 1542:1641 */     double d2 = (localwv.Q + (localwv.yPos - localwv.Q) * paramFloat) * localcen.t.j();
/* 1543:1642 */     if (((localwv instanceof EntityLiving)) && (((EntityLiving)localwv).a(Potion.blindness)))
/* 1544:     */     {
/* 1545:1643 */       int i1 = ((EntityLiving)localwv).b(Potion.blindness).getDuration();
/* 1546:1644 */       if (i1 < 20) {
/* 1547:1645 */         d2 *= (1.0F - i1 / 20.0F);
/* 1548:     */       } else {
/* 1549:1647 */         d2 = 0.0D;
/* 1550:     */       }
/* 1551:     */     }
/* 1552:1650 */     if (d2 < 1.0D)
/* 1553:     */     {
/* 1554:1651 */       if (d2 < 0.0D) {
/* 1555:1652 */         d2 = 0.0D;
/* 1556:     */       }
/* 1557:1654 */       d2 *= d2;
/* 1558:1655 */       this.Q = ((float)(this.Q * d2));
/* 1559:1656 */       this.R = ((float)(this.R * d2));
/* 1560:1657 */       this.S = ((float)(this.S * d2));
/* 1561:     */     }
/* 1562:     */     float f10;
/* 1563:1660 */     if (this.z > 0.0F)
/* 1564:     */     {
/* 1565:1661 */       f10 = this.A + (this.z - this.A) * paramFloat;
/* 1566:1662 */       this.Q = (this.Q * (1.0F - f10) + this.Q * 0.7F * f10);
/* 1567:1663 */       this.R = (this.R * (1.0F - f10) + this.R * 0.6F * f10);
/* 1568:1664 */       this.S = (this.S * (1.0F - f10) + this.S * 0.6F * f10);
/* 1569:     */     }
/* 1570:     */     float f11;
/* 1571:1667 */     if (((localwv instanceof EntityLiving)) && (((EntityLiving)localwv).a(Potion.nightVision)))
/* 1572:     */     {
/* 1573:1668 */       f10 = a((EntityLiving)localwv, paramFloat);
/* 1574:     */       
/* 1575:1670 */       f11 = 1.0F / this.Q;
/* 1576:1671 */       if (f11 > 1.0F / this.R) {
/* 1577:1672 */         f11 = 1.0F / this.R;
/* 1578:     */       }
/* 1579:1674 */       if (f11 > 1.0F / this.S) {
/* 1580:1675 */         f11 = 1.0F / this.S;
/* 1581:     */       }
/* 1582:1677 */       this.Q = (this.Q * (1.0F - f10) + this.Q * f11 * f10);
/* 1583:1678 */       this.R = (this.R * (1.0F - f10) + this.R * f11 * f10);
/* 1584:1679 */       this.S = (this.S * (1.0F - f10) + this.S * f11 * f10);
/* 1585:     */     }
/* 1586:1683 */     if (this.h.t.e)
/* 1587:     */     {
/* 1588:1684 */       f10 = (this.Q * 30.0F + this.R * 59.0F + this.S * 11.0F) / 100.0F;
/* 1589:1685 */       f11 = (this.Q * 30.0F + this.R * 70.0F) / 100.0F;
/* 1590:1686 */       float f12 = (this.Q * 30.0F + this.S * 70.0F) / 100.0F;
/* 1591:     */       
/* 1592:1688 */       this.Q = f10;
/* 1593:1689 */       this.R = f11;
/* 1594:1690 */       this.S = f12;
/* 1595:     */     }
/* 1596:1693 */     cjm.a(this.Q, this.R, this.S, 0.0F);
/* 1597:     */   }
/* 1598:     */   
/* 1599:     */   private void a(int paramInt, float paramFloat)
/* 1600:     */   {
/* 1601:1697 */     Entity localwv = this.h.aa();
/* 1602:     */     
/* 1603:1699 */     boolean bool = false;
/* 1604:1700 */     if ((localwv instanceof EntityPlayer)) {
/* 1605:1701 */       bool = ((EntityPlayer)localwv).by.d;
/* 1606:     */     }
/* 1607:1704 */     GL11.glFog(2918, a(this.Q, this.R, this.S, 1.0F));
/* 1608:1705 */     GL11.glNormal3f(0.0F, -1.0F, 0.0F);
/* 1609:1706 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 1610:     */     
/* 1611:1708 */     ProtoBlock localatr = bsp.a(this.h.f, localwv, paramFloat);
/* 1612:     */     float f1;
/* 1613:1710 */     if (((localwv instanceof EntityLiving)) && (((EntityLiving)localwv).a(Potion.blindness)))
/* 1614:     */     {
/* 1615:1711 */       f1 = 5.0F;
/* 1616:1712 */       int i1 = ((EntityLiving)localwv).b(Potion.blindness).getDuration();
/* 1617:1713 */       if (i1 < 20) {
/* 1618:1714 */         f1 = 5.0F + (this.k - 5.0F) * (1.0F - i1 / 20.0F);
/* 1619:     */       }
/* 1620:1717 */       cjm.d(9729);
/* 1621:1718 */       if (paramInt == -1)
/* 1622:     */       {
/* 1623:1719 */         cjm.b(0.0F);
/* 1624:1720 */         cjm.c(f1 * 0.8F);
/* 1625:     */       }
/* 1626:     */       else
/* 1627:     */       {
/* 1628:1722 */         cjm.b(f1 * 0.25F);
/* 1629:1723 */         cjm.c(f1);
/* 1630:     */       }
/* 1631:1725 */       if (GLContext.getCapabilities().GL_NV_fog_distance) {
/* 1632:1726 */         GL11.glFogi(34138, 34139);
/* 1633:     */       }
/* 1634:     */     }
/* 1635:1728 */     else if (this.B)
/* 1636:     */     {
/* 1637:1729 */       cjm.d(2048);
/* 1638:1730 */       cjm.a(0.1F);
/* 1639:     */     }
/* 1640:1731 */     else if (localatr.getMaterial() == Material.water)
/* 1641:     */     {
/* 1642:1732 */       cjm.d(2048);
/* 1643:1733 */       if (((localwv instanceof EntityLiving)) && (((EntityLiving)localwv).a(Potion.waterBreathing))) {
/* 1644:1735 */         cjm.a(0.01F);
/* 1645:     */       } else {
/* 1646:1737 */         cjm.a(0.1F - aph.a(localwv) * 0.03F);
/* 1647:     */       }
/* 1648:     */     }
/* 1649:1739 */     else if (localatr.getMaterial() == Material.lava)
/* 1650:     */     {
/* 1651:1740 */       cjm.d(2048);
/* 1652:1741 */       cjm.a(2.0F);
/* 1653:     */     }
/* 1654:     */     else
/* 1655:     */     {
/* 1656:1743 */       f1 = this.k;
/* 1657:     */       
/* 1658:1745 */       cjm.d(9729);
/* 1659:1746 */       if (paramInt == -1)
/* 1660:     */       {
/* 1661:1747 */         cjm.b(0.0F);
/* 1662:1748 */         cjm.c(f1);
/* 1663:     */       }
/* 1664:     */       else
/* 1665:     */       {
/* 1666:1750 */         cjm.b(f1 * 0.75F);
/* 1667:1751 */         cjm.c(f1);
/* 1668:     */       }
/* 1669:1753 */       if (GLContext.getCapabilities().GL_NV_fog_distance) {
/* 1670:1754 */         GL11.glFogi(34138, 34139);
/* 1671:     */       }
/* 1672:1757 */       if (this.h.f.t.b((int)localwv.xPos, (int)localwv.zPos))
/* 1673:     */       {
/* 1674:1758 */         cjm.b(f1 * 0.05F);
/* 1675:1759 */         cjm.c(Math.min(f1, 192.0F) * 0.5F);
/* 1676:     */       }
/* 1677:     */     }
/* 1678:1763 */     cjm.g();
/* 1679:1764 */     cjm.m();
/* 1680:1765 */     cjm.a(1028, 4608);
/* 1681:     */   }
/* 1682:     */   
/* 1683:     */   private FloatBuffer a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/* 1684:     */   {
/* 1685:1769 */     this.P.clear();
/* 1686:1770 */     this.P.put(paramFloat1).put(paramFloat2).put(paramFloat3).put(paramFloat4);
/* 1687:1771 */     this.P.flip();
/* 1688:1772 */     return this.P;
/* 1689:     */   }
/* 1690:     */   
/* 1691:     */   public buc k()
/* 1692:     */   {
/* 1693:1776 */     return this.l;
/* 1694:     */   }
				  static bsu a(cji arg0) {return arg0.h;}
/* 1695:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cji
 * JD-Core Version:    0.7.0.1
 */
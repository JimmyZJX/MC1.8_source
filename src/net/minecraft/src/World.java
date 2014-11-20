package net.minecraft.src;
/*    1:     */ import com.google.common.base.Predicate;
/*    2:     */ import com.google.common.collect.Lists;
/*    3:     */ import com.google.common.collect.Sets;

/*    4:     */ import java.util.ArrayList;
/*    5:     */ import java.util.Calendar;
/*    6:     */ import java.util.Collection;
/*    7:     */ import java.util.Iterator;
/*    8:     */ import java.util.List;
/*    9:     */ import java.util.Random;
/*   10:     */ import java.util.Set;
/*   11:     */ import java.util.UUID;

import net.minecraft.server.MinecraftServer;
/*   13:     */ 
/*   14:     */ public abstract class World
/*   15:     */   implements IBlockAccess
/*   16:     */ {
/*   17:     */   protected boolean e;
/*   18:  77 */   public final List<Entity> entityList = Lists.newArrayList();
/*   19:  78 */   protected final List<Entity> unloadingEntityList = Lists.newArrayList();
/*   20:  79 */   public final List<bcm> h = Lists.newArrayList();
/*   21:  80 */   public final List<bcm> i = Lists.newArrayList();
/*   22:  81 */   private final List<bcm> a = Lists.newArrayList();
/*   23:  82 */   private final List<bcm> b = Lists.newArrayList();
/*   24:  84 */   public final List<EntityPlayer> playerList = Lists.newArrayList();
/*   25:  85 */   public final List<Entity> k = Lists.newArrayList();
/*   26:  86 */   protected final um l = new um();
/*   27:  88 */   private long c = 16777215L;
/*   28:     */   private int d;
/*   29:  92 */   protected int m = new Random().nextInt();
/*   30:  93 */   protected final int n = 1013904223;
/*   31:     */   protected float o;
/*   32:     */   protected float p;
/*   33:     */   protected float q;
/*   34:     */   protected float r;
/*   35:     */   private int I;
/*   36:  98 */   public final Random rng = new Random();
/*   37:     */   public final bgd t;
/*   38: 101 */   protected List<IWorldAccess> worldAccesses = Lists.newArrayList();
/*   39:     */   protected IChunkProvider chunkProvider;
/*   40:     */   protected final bqy w;
/*   41:     */   protected WorldInfo worldInfo;
/*   42:     */   protected boolean y;
/*   43:     */   protected brn z;
/*   44:     */   protected VillageManager villageManager;
/*   45:     */   public final Profiler profiler;
/*   46: 115 */   private final Calendar J = Calendar.getInstance();
/*   47: 116 */   protected bsd C = new bsd();
/*   48:     */   public final boolean isClient;
/*   49: 119 */   protected Set<ChunkID> E = Sets.newHashSet();
/*   50: 120 */   private int K = this.rng.nextInt(12000);
/*   51: 123 */   protected boolean spawnMonster = true;
/*   52: 124 */   protected boolean spawnPeaceful = true;
/*   53:     */   private boolean L;
/*   54:     */   private final bfb M;
/*   55:     */   
/*   56:     */   protected World(bqy parambqy, WorldInfo parambqo, bgd parambgd, Profiler paramuw, boolean paramBoolean)
/*   57:     */   {
/*   58: 129 */     this.w = parambqy;
/*   59: 130 */     this.profiler = paramuw;
/*   60: 131 */     this.worldInfo = parambqo;
/*   61: 132 */     this.t = parambgd;
/*   62: 133 */     this.isClient = paramBoolean;
/*   63: 134 */     this.M = parambgd.r();
/*   64:     */   }
/*   65:     */   
/*   66:     */   public World getSelf()
/*   67:     */   {
/*   68: 153 */     return this;
/*   69:     */   }
/*   70:     */   
/*   71:     */   public arm b(BlockPosition pos)
/*   72:     */   {
/*   73: 158 */     if (e(pos))
/*   74:     */     {
/*   75: 159 */       Chunk chunk = getChunk(pos);
/*   76:     */       try
/*   77:     */       {
/*   78: 161 */         return chunk.a(pos, this.t.m());
/*   79:     */       }
/*   80:     */       catch (Throwable localThrowable)
/*   81:     */       {
/*   82: 163 */         b localb = net.minecraft.src.b.a(localThrowable, "Getting biome");
/*   83: 164 */         j localj = localb.a("Coordinates of biome request");
/*   84:     */         
/*   85: 166 */         localj.a("Location", new aqv(this, pos));
/*   86:     */         
/*   87:     */ 
/*   88:     */ 
/*   89:     */ 
/*   90:     */ 
/*   91:     */ 
/*   92: 173 */         throw new u(localb);
/*   93:     */       }
/*   94:     */     }
/*   95: 176 */     return this.t.m().a(pos, arm.q);
/*   96:     */   }
/*   97:     */   
/*   98:     */   public arz v()
/*   99:     */   {
/*  100: 181 */     return this.t.m();
/*  101:     */   }
/*  102:     */   
/*  103:     */   protected abstract IChunkProvider k();
/*  104:     */   
/*  105:     */   public void a(WorldSettings paramarb)
/*  106:     */   {
/*  107: 187 */     this.worldInfo.d(true);
/*  108:     */   }
/*  109:     */   
/*  110:     */   public void g()
/*  111:     */   {
/*  112: 191 */     B(new BlockPosition(8, 64, 8));
/*  113:     */   }
/*  114:     */   
/*  115:     */   public ProtoBlock c(BlockPosition paramdt)
/*  116:     */   {
/*  117: 195 */     BlockPosition localdt = new BlockPosition(paramdt.getX(), 63, paramdt.getZ());
/*  118: 196 */     while (!isEmpty(localdt.up())) {
/*  119: 197 */       localdt = localdt.up();
/*  120:     */     }
/*  121: 199 */     return getBlock(localdt).getProto();
/*  122:     */   }
/*  123:     */   
/*  124:     */   private boolean isInBound(BlockPosition paramdt)
/*  125:     */   {
/*  126: 203 */     return (paramdt.getX() >= -30000000) && (paramdt.getZ() >= -30000000) && (paramdt.getX() < 30000000) && (paramdt.getZ() < 30000000) && (paramdt.getY() >= 0) && (paramdt.getY() < 256);
/*  127:     */   }
/*  128:     */   
/*  129:     */   public boolean isEmpty(BlockPosition paramdt)
/*  130:     */   {
/*  131: 208 */     return getBlock(paramdt).getProto().getMaterial() == Material.air;
/*  132:     */   }
/*  133:     */   
/*  134:     */   public boolean e(BlockPosition paramdt)
/*  135:     */   {
/*  136: 212 */     return a(paramdt, true);
/*  137:     */   }
/*  138:     */   
/*  139:     */   public boolean a(BlockPosition paramdt, boolean paramBoolean)
/*  140:     */   {
/*  141: 216 */     if (!isInBound(paramdt)) {
/*  142: 217 */       return false;
/*  143:     */     }
/*  144: 219 */     return a(paramdt.getX() >> 4, paramdt.getZ() >> 4, paramBoolean);
/*  145:     */   }
/*  146:     */   
/*  147:     */   public boolean a(BlockPosition paramdt, int paramInt)
/*  148:     */   {
/*  149: 223 */     return a(paramdt, paramInt, true);
/*  150:     */   }
/*  151:     */   
/*  152:     */   public boolean a(BlockPosition paramdt, int paramInt, boolean paramBoolean)
/*  153:     */   {
/*  154: 227 */     return a(paramdt.getX() - paramInt, paramdt.getY() - paramInt, paramdt.getZ() - paramInt, paramdt.getX() + paramInt, paramdt.getY() + paramInt, paramdt.getZ() + paramInt, paramBoolean);
/*  155:     */   }
/*  156:     */   
/*  157:     */   public boolean a(BlockPosition paramdt1, BlockPosition paramdt2)
/*  158:     */   {
/*  159: 231 */     return a(paramdt1, paramdt2, true);
/*  160:     */   }
/*  161:     */   
/*  162:     */   public boolean a(BlockPosition paramdt1, BlockPosition paramdt2, boolean paramBoolean)
/*  163:     */   {
/*  164: 235 */     return a(paramdt1.getX(), paramdt1.getY(), paramdt1.getZ(), paramdt2.getX(), paramdt2.getY(), paramdt2.getZ(), paramBoolean);
/*  165:     */   }
/*  166:     */   
/*  167:     */   public boolean a(bjb parambjb)
/*  168:     */   {
/*  169: 239 */     return b(parambjb, true);
/*  170:     */   }
/*  171:     */   
/*  172:     */   public boolean b(bjb parambjb, boolean paramBoolean)
/*  173:     */   {
/*  174: 243 */     return a(parambjb.a, parambjb.b, parambjb.c, parambjb.d, parambjb.e, parambjb.f, paramBoolean);
/*  175:     */   }
/*  176:     */   
/*  177:     */   private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
/*  178:     */   {
/*  179: 247 */     if ((paramInt5 < 0) || (paramInt2 >= 256)) {
/*  180: 248 */       return false;
/*  181:     */     }
/*  182: 251 */     paramInt1 >>= 4;
/*  183: 252 */     paramInt3 >>= 4;
/*  184: 253 */     paramInt4 >>= 4;
/*  185: 254 */     paramInt6 >>= 4;
/*  186: 256 */     for (int i1 = paramInt1; i1 <= paramInt4; i1++) {
/*  187: 257 */       for (int i2 = paramInt3; i2 <= paramInt6; i2++) {
/*  188: 258 */         if (!a(i1, i2, paramBoolean)) {
/*  189: 259 */           return false;
/*  190:     */         }
/*  191:     */       }
/*  192:     */     }
/*  193: 264 */     return true;
/*  194:     */   }
/*  195:     */   
/*  196:     */   protected boolean a(int paramInt1, int paramInt2, boolean paramBoolean)
/*  197:     */   {
/*  198: 268 */     return (this.chunkProvider.chunkLoaded(paramInt1, paramInt2)) && ((paramBoolean) || (!this.chunkProvider.getChunk(paramInt1, paramInt2).loaded()));
/*  199:     */   }
/*  200:     */   
/*  201:     */   public Chunk getChunk(BlockPosition pos)
/*  202:     */   {
/*  203: 272 */     return getChunk(pos.getX() >> 4, pos.getZ() >> 4);
/*  204:     */   }
/*  205:     */   
/*  206:     */   public Chunk getChunk(int x, int z)
/*  207:     */   {
/*  208: 276 */     return this.chunkProvider.getChunk(x, z);
/*  209:     */   }
/*  210:     */   
/*  211:     */   public boolean setBlock(BlockPosition paramdt, Block parambec, int paramInt)
/*  212:     */   {
/*  213: 280 */     if (!isInBound(paramdt)) {
/*  214: 281 */       return false;
/*  215:     */     }
/*  216: 284 */     if ((!this.isClient) && (this.worldInfo.u() == WorldType.DEBUG_ALL_BLOCK_STATES)) {
/*  217: 285 */       return false;
/*  218:     */     }
/*  219: 288 */     Chunk localbfh = getChunk(paramdt);
/*  220: 289 */     ProtoBlock block = parambec.getProto();
/*  221: 290 */     Block localbec = localbfh.a(paramdt, parambec);
/*  222: 292 */     if (localbec != null)
/*  223:     */     {
/*  224: 293 */       ProtoBlock localatr2 = localbec.getProto();
/*  225: 295 */       if ((block.getLightOpacity() != localatr2.getLightOpacity()) || (block.p() != localatr2.p()))
/*  226:     */       {
/*  227: 296 */         this.profiler.a("checkLight");
/*  228: 297 */         x(paramdt);
/*  229: 298 */         this.profiler.b();
/*  230:     */       }
/*  231: 301 */       if (((paramInt & 0x2) != 0) && ((!this.isClient) || ((paramInt & 0x4) == 0)) && (localbfh.i())) {
/*  232: 302 */         h(paramdt);
/*  233:     */       }
/*  234: 305 */       if ((!this.isClient) && ((paramInt & 0x1) != 0))
/*  235:     */       {
/*  236: 306 */         b(paramdt, localbec.getProto());
/*  237: 307 */         if (block.N()) {
/*  238: 308 */           e(paramdt, block);
/*  239:     */         }
/*  240:     */       }
/*  241: 312 */       return true;
/*  242:     */     }
/*  243: 315 */     return false;
/*  244:     */   }
/*  245:     */   
/*  246:     */   public boolean g(BlockPosition paramdt)
/*  247:     */   {
/*  248: 325 */     return setBlock(paramdt, BlockList.air.instance(), 3);
/*  249:     */   }
/*  250:     */   
/*  251:     */   public boolean b(BlockPosition paramdt, boolean paramBoolean)
/*  252:     */   {
/*  253: 337 */     Block localbec = getBlock(paramdt);
/*  254: 338 */     ProtoBlock localatr = localbec.getProto();
/*  255: 339 */     if (localatr.getMaterial() == Material.air) {
/*  256: 340 */       return false;
/*  257:     */     }
/*  258: 343 */     playLevelEvent(2001, paramdt, ProtoBlock.f(localbec));
/*  259: 344 */     if (paramBoolean) {
/*  260: 345 */       localatr.b(this, paramdt, localbec, 0);
/*  261:     */     }
/*  262: 347 */     return setBlock(paramdt, BlockList.air.instance(), 3);
/*  263:     */   }
/*  264:     */   
/*  265:     */   public boolean setBlock(BlockPosition paramdt, Block parambec)
/*  266:     */   {
/*  267: 351 */     return setBlock(paramdt, parambec, 3);
/*  268:     */   }
/*  269:     */   
/*  270:     */   public void h(BlockPosition paramdt)
/*  271:     */   {
/*  272: 355 */     for (int i1 = 0; i1 < this.worldAccesses.size(); i1++) {
/*  273: 356 */       this.worldAccesses.get(i1).a(paramdt);
/*  274:     */     }
/*  275:     */   }
/*  276:     */   
/*  277:     */   public void b(BlockPosition paramdt, ProtoBlock paramatr)
/*  278:     */   {
/*  279: 361 */     if (this.worldInfo.u() != WorldType.DEBUG_ALL_BLOCK_STATES) {
/*  280: 362 */       c(paramdt, paramatr);
/*  281:     */     }
/*  282:     */   }
/*  283:     */   
/*  284:     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  285:     */   {
/*  286:     */     int i1;
/*  287: 367 */     if (paramInt3 > paramInt4)
/*  288:     */     {
/*  289: 368 */       i1 = paramInt4;
/*  290: 369 */       paramInt4 = paramInt3;
/*  291: 370 */       paramInt3 = i1;
/*  292:     */     }
/*  293: 372 */     if (!this.t.o()) {
/*  294: 373 */       for (i1 = paramInt3; i1 <= paramInt4; i1++) {
/*  295: 374 */         c(EnumSkyBlock.SKY, new BlockPosition(paramInt1, i1, paramInt2));
/*  296:     */       }
/*  297:     */     }
/*  298: 377 */     b(paramInt1, paramInt3, paramInt2, paramInt1, paramInt4, paramInt2);
/*  299:     */   }
/*  300:     */   
/*  301:     */   public void b(BlockPosition paramdt1, BlockPosition paramdt2)
/*  302:     */   {
/*  303: 381 */     b(paramdt1.getX(), paramdt1.getY(), paramdt1.getZ(), paramdt2.getX(), paramdt2.getY(), paramdt2.getZ());
/*  304:     */   }
/*  305:     */   
/*  306:     */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  307:     */   {
/*  308: 385 */     for (int i1 = 0; i1 < this.worldAccesses.size(); i1++) {
/*  309: 386 */       this.worldAccesses.get(i1).a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  310:     */     }
/*  311:     */   }
/*  312:     */   
/*  313:     */   public void c(BlockPosition paramdt, ProtoBlock paramatr)
/*  314:     */   {
/*  315: 391 */     d(paramdt.west(), paramatr);
/*  316: 392 */     d(paramdt.east(), paramatr);
/*  317: 393 */     d(paramdt.down(), paramatr);
/*  318: 394 */     d(paramdt.up(), paramatr);
/*  319: 395 */     d(paramdt.north(), paramatr);
/*  320: 396 */     d(paramdt.south(), paramatr);
/*  321:     */   }
/*  322:     */   
/*  323:     */   public void a(BlockPosition paramdt, ProtoBlock paramatr, EnumDirection paramej)
/*  324:     */   {
/*  325: 400 */     if (paramej != EnumDirection.WEST) {
/*  326: 401 */       d(paramdt.west(), paramatr);
/*  327:     */     }
/*  328: 403 */     if (paramej != EnumDirection.EAST) {
/*  329: 404 */       d(paramdt.east(), paramatr);
/*  330:     */     }
/*  331: 406 */     if (paramej != EnumDirection.DOWN) {
/*  332: 407 */       d(paramdt.down(), paramatr);
/*  333:     */     }
/*  334: 409 */     if (paramej != EnumDirection.UP) {
/*  335: 410 */       d(paramdt.up(), paramatr);
/*  336:     */     }
/*  337: 412 */     if (paramej != EnumDirection.NORTH) {
/*  338: 413 */       d(paramdt.north(), paramatr);
/*  339:     */     }
/*  340: 415 */     if (paramej != EnumDirection.SOUTH) {
/*  341: 416 */       d(paramdt.south(), paramatr);
/*  342:     */     }
/*  343:     */   }
/*  344:     */   
/*  345:     */   public void d(BlockPosition paramdt, ProtoBlock paramatr)
/*  346:     */   {
/*  347: 421 */     if (this.isClient) {
/*  348: 422 */       return;
/*  349:     */     }
/*  350: 424 */     Block localbec = getBlock(paramdt);
/*  351:     */     try
/*  352:     */     {
/*  353: 427 */       localbec.getProto().a(this, paramdt, localbec, paramatr);
/*  354:     */     }
/*  355:     */     catch (Throwable localThrowable)
/*  356:     */     {
/*  357: 429 */       b localb = net.minecraft.src.b.a(localThrowable, "Exception while updating neighbours");
/*  358: 430 */       j localj = localb.a("Block being updated");
/*  359:     */       
/*  360: 432 */       localj.a("Source block type", new aqw(this, paramatr));
/*  361:     */       
/*  362:     */ 
/*  363:     */ 
/*  364:     */ 
/*  365:     */ 
/*  366:     */ 
/*  367:     */ 
/*  368:     */ 
/*  369:     */ 
/*  370:     */ 
/*  371: 443 */       net.minecraft.src.j.a(localj, paramdt, localbec);
/*  372:     */       
/*  373: 445 */       throw new u(localb);
/*  374:     */     }
/*  375:     */   }
/*  376:     */   
/*  377:     */   public boolean a(BlockPosition paramdt, ProtoBlock paramatr)
/*  378:     */   {
/*  379: 450 */     return false;
/*  380:     */   }
/*  381:     */   
/*  382:     */   public boolean i(BlockPosition paramdt)
/*  383:     */   {
/*  384: 454 */     return getChunk(paramdt).d(paramdt);
/*  385:     */   }
/*  386:     */   
/*  387:     */   public boolean j(BlockPosition paramdt)
/*  388:     */   {
/*  389: 458 */     if (paramdt.getY() >= 63) {
/*  390: 459 */       return i(paramdt);
/*  391:     */     }
/*  392: 461 */     BlockPosition localdt = new BlockPosition(paramdt.getX(), 63, paramdt.getZ());
/*  393: 462 */     if (!i(localdt)) {
/*  394: 463 */       return false;
/*  395:     */     }
/*  396: 465 */     localdt = localdt.down();
/*  397: 466 */     while (localdt.getY() > paramdt.getY())
/*  398:     */     {
/*  399: 467 */       ProtoBlock localatr = getBlock(localdt).getProto();
/*  400: 468 */       if ((localatr.getLightOpacity() > 0) && (!localatr.getMaterial().isLiquid())) {
/*  401: 469 */         return false;
/*  402:     */       }
/*  403: 471 */       localdt = localdt.down();
/*  404:     */     }
/*  405: 473 */     return true;
/*  406:     */   }
/*  407:     */   
/*  408:     */   public int k(BlockPosition paramdt)
/*  409:     */   {
/*  410: 477 */     if (paramdt.getY() < 0) {
/*  411: 478 */       return 0;
/*  412:     */     }
/*  413: 480 */     if (paramdt.getY() >= 256) {
/*  414: 481 */       paramdt = new BlockPosition(paramdt.getX(), 255, paramdt.getZ());
/*  415:     */     }
/*  416: 483 */     return getChunk(paramdt).a(paramdt, 0);
/*  417:     */   }
/*  418:     */   
/*  419:     */   public int l(BlockPosition paramdt)
/*  420:     */   {
/*  421: 487 */     return c(paramdt, true);
/*  422:     */   }
/*  423:     */   
/*  424:     */   public int c(BlockPosition paramdt, boolean paramBoolean)
/*  425:     */   {
/*  426: 491 */     if ((paramdt.getX() < -30000000) || (paramdt.getZ() < -30000000) || (paramdt.getX() >= 30000000) || (paramdt.getZ() >= 30000000)) {
/*  427: 492 */       return 15;
/*  428:     */     }
/*  429: 495 */     if ((paramBoolean) && 
/*  430: 496 */       (getBlock(paramdt).getProto().q()))
/*  431:     */     {
/*  432: 497 */       int i1 = c(paramdt.up(), false);
/*  433: 498 */       int i2 = c(paramdt.east(), false);
/*  434: 499 */       int i3 = c(paramdt.west(), false);
/*  435: 500 */       int i4 = c(paramdt.south(), false);
/*  436: 501 */       int i5 = c(paramdt.north(), false);
/*  437: 502 */       if (i2 > i1) {
/*  438: 503 */         i1 = i2;
/*  439:     */       }
/*  440: 505 */       if (i3 > i1) {
/*  441: 506 */         i1 = i3;
/*  442:     */       }
/*  443: 508 */       if (i4 > i1) {
/*  444: 509 */         i1 = i4;
/*  445:     */       }
/*  446: 511 */       if (i5 > i1) {
/*  447: 512 */         i1 = i5;
/*  448:     */       }
/*  449: 514 */       return i1;
/*  450:     */     }
/*  451: 518 */     if (paramdt.getY() < 0) {
/*  452: 519 */       return 0;
/*  453:     */     }
/*  454: 521 */     if (paramdt.getY() >= 256) {
/*  455: 522 */       paramdt = new BlockPosition(paramdt.getX(), 255, paramdt.getZ());
/*  456:     */     }
/*  457: 525 */     Chunk localbfh = getChunk(paramdt);
/*  458: 526 */     return localbfh.a(paramdt, this.d);
/*  459:     */   }
/*  460:     */   
/*  461:     */   public BlockPosition m(BlockPosition paramdt)
/*  462:     */   {
/*  463:     */     int i1;
/*  464: 531 */     if ((paramdt.getX() < -30000000) || (paramdt.getZ() < -30000000) || (paramdt.getX() >= 30000000) || (paramdt.getZ() >= 30000000)) {
/*  465: 532 */       i1 = 64;
/*  466: 533 */     } else if (a(paramdt.getX() >> 4, paramdt.getZ() >> 4, true)) {
/*  467: 534 */       i1 = getChunk(paramdt.getX() >> 4, paramdt.getZ() >> 4).getHeight(paramdt.getX() & 0xF, paramdt.getZ() & 0xF);
/*  468:     */     } else {
/*  469: 536 */       i1 = 0;
/*  470:     */     }
/*  471: 539 */     return new BlockPosition(paramdt.getX(), i1, paramdt.getZ());
/*  472:     */   }
/*  473:     */   
/*  474:     */   public int b(int paramInt1, int paramInt2)
/*  475:     */   {
/*  476: 544 */     if ((paramInt1 < -30000000) || (paramInt2 < -30000000) || (paramInt1 >= 30000000) || (paramInt2 >= 30000000)) {
/*  477: 545 */       return 64;
/*  478:     */     }
/*  479: 547 */     if (!a(paramInt1 >> 4, paramInt2 >> 4, true)) {
/*  480: 548 */       return 0;
/*  481:     */     }
/*  482: 551 */     Chunk localbfh = getChunk(paramInt1 >> 4, paramInt2 >> 4);
/*  483: 552 */     return localbfh.v();
/*  484:     */   }
/*  485:     */   
/*  486:     */   public int a(EnumSkyBlock paramarf, BlockPosition paramdt)
/*  487:     */   {
/*  488: 556 */     if ((this.t.o()) && (paramarf == EnumSkyBlock.SKY)) {
/*  489: 557 */       return 0;
/*  490:     */     }
/*  491: 560 */     if (paramdt.getY() < 0) {
/*  492: 561 */       paramdt = new BlockPosition(paramdt.getX(), 0, paramdt.getZ());
/*  493:     */     }
/*  494: 563 */     if (!isInBound(paramdt)) {
/*  495: 564 */       return paramarf.c;
/*  496:     */     }
/*  497: 566 */     if (!e(paramdt)) {
/*  498: 567 */       return paramarf.c;
/*  499:     */     }
/*  500: 570 */     if (getBlock(paramdt).getProto().q())
/*  501:     */     {
/*  502: 571 */       int i1 = getLightLevel(paramarf, paramdt.up());
/*  503: 572 */       int i2 = getLightLevel(paramarf, paramdt.east());
/*  504: 573 */       int i3 = getLightLevel(paramarf, paramdt.west());
/*  505: 574 */       int i4 = getLightLevel(paramarf, paramdt.south());
/*  506: 575 */       int i5 = getLightLevel(paramarf, paramdt.north());
/*  507: 576 */       if (i2 > i1) {
/*  508: 577 */         i1 = i2;
/*  509:     */       }
/*  510: 579 */       if (i3 > i1) {
/*  511: 580 */         i1 = i3;
/*  512:     */       }
/*  513: 582 */       if (i4 > i1) {
/*  514: 583 */         i1 = i4;
/*  515:     */       }
/*  516: 585 */       if (i5 > i1) {
/*  517: 586 */         i1 = i5;
/*  518:     */       }
/*  519: 588 */       return i1;
/*  520:     */     }
/*  521: 591 */     Chunk localbfh = getChunk(paramdt);
/*  522: 592 */     return localbfh.a(paramarf, paramdt);
/*  523:     */   }
/*  524:     */   
/*  525:     */   public int getLightLevel(EnumSkyBlock paramarf, BlockPosition paramdt)
/*  526:     */   {
/*  527: 597 */     if (paramdt.getY() < 0) {
/*  528: 598 */       paramdt = new BlockPosition(paramdt.getX(), 0, paramdt.getZ());
/*  529:     */     }
/*  530: 600 */     if (!isInBound(paramdt)) {
/*  531: 601 */       return paramarf.c;
/*  532:     */     }
/*  533: 603 */     if (!e(paramdt)) {
/*  534: 604 */       return paramarf.c;
/*  535:     */     }
/*  536: 606 */     Chunk localbfh = getChunk(paramdt);
/*  537: 607 */     return localbfh.a(paramarf, paramdt);
/*  538:     */   }
/*  539:     */   
/*  540:     */   public void a(EnumSkyBlock paramarf, BlockPosition paramdt, int paramInt)
/*  541:     */   {
/*  542: 611 */     if (!isInBound(paramdt)) {
/*  543: 612 */       return;
/*  544:     */     }
/*  545: 614 */     if (!e(paramdt)) {
/*  546: 615 */       return;
/*  547:     */     }
/*  548: 617 */     Chunk localbfh = getChunk(paramdt);
/*  549: 618 */     localbfh.a(paramarf, paramdt, paramInt);
/*  550: 619 */     n(paramdt);
/*  551:     */   }
/*  552:     */   
/*  553:     */   public void n(BlockPosition paramdt)
/*  554:     */   {
/*  555: 623 */     for (int i1 = 0; i1 < this.worldAccesses.size(); i1++) {
/*  556: 624 */       this.worldAccesses.get(i1).b(paramdt);
/*  557:     */     }
/*  558:     */   }
/*  559:     */   
/*  560:     */   public int b(BlockPosition paramdt, int paramInt)
/*  561:     */   {
/*  562: 630 */     int i1 = a(EnumSkyBlock.SKY, paramdt);
/*  563: 631 */     int i2 = a(EnumSkyBlock.BLOCK, paramdt);
/*  564: 632 */     if (i2 < paramInt) {
/*  565: 633 */       i2 = paramInt;
/*  566:     */     }
/*  567: 635 */     return i1 << 20 | i2 << 4;
/*  568:     */   }
/*  569:     */   
/*  570:     */   public float o(BlockPosition paramdt)
/*  571:     */   {
/*  572: 649 */     return this.t.p()[l(paramdt)];
/*  573:     */   }
/*  574:     */   
/*  575:     */   public Block getBlock(BlockPosition pos)
/*  576:     */   {
/*  577: 654 */     if (!isInBound(pos)) {
/*  578: 655 */       return BlockList.air.instance();
/*  579:     */     }
/*  580: 657 */     Chunk localbfh = getChunk(pos);
/*  581: 658 */     return localbfh.g(pos);
/*  582:     */   }
/*  583:     */   
/*  584:     */   public boolean w()
/*  585:     */   {
/*  586: 662 */     return this.d < 4;
/*  587:     */   }
/*  588:     */   
/*  589:     */   public HitResult a(Vec3 parambrw1, Vec3 parambrw2)
/*  590:     */   {
/*  591: 667 */     return a(parambrw1, parambrw2, false, false, false);
/*  592:     */   }
/*  593:     */   
/*  594:     */   public HitResult a(Vec3 parambrw1, Vec3 parambrw2, boolean paramBoolean)
/*  595:     */   {
/*  596: 672 */     return a(parambrw1, parambrw2, paramBoolean, false, false);
/*  597:     */   }
/*  598:     */   
/*  599:     */   public HitResult a(Vec3 parambrw1, Vec3 parambrw2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/*  600:     */   {
/*  601: 677 */     if ((Double.isNaN(parambrw1.x)) || (Double.isNaN(parambrw1.y)) || (Double.isNaN(parambrw1.z))) {
/*  602: 678 */       return null;
/*  603:     */     }
/*  604: 680 */     if ((Double.isNaN(parambrw2.x)) || (Double.isNaN(parambrw2.y)) || (Double.isNaN(parambrw2.z))) {
/*  605: 681 */       return null;
/*  606:     */     }
/*  607: 684 */     int i1 = MathUtils.floor(parambrw2.x);
/*  608: 685 */     int i2 = MathUtils.floor(parambrw2.y);
/*  609: 686 */     int i3 = MathUtils.floor(parambrw2.z);
/*  610:     */     
/*  611: 688 */     int i4 = MathUtils.floor(parambrw1.x);
/*  612: 689 */     int i5 = MathUtils.floor(parambrw1.y);
/*  613: 690 */     int i6 = MathUtils.floor(parambrw1.z);
/*  614:     */     
/*  615: 692 */     BlockPosition localdt1 = new BlockPosition(i4, i5, i6);
/*  616: 693 */     BlockPosition localdt2 = new BlockPosition(i1, i2, i3);
/*  617:     */     
/*  618:     */ 
/*  619: 696 */     Object localObject = getBlock(localdt1);
/*  620: 697 */     ProtoBlock localatr1 = ((Block)localObject).getProto();
/*  621: 698 */     if ((!paramBoolean2) || (localatr1.a(this, localdt1, (Block)localObject) != null)) {
/*  622: 700 */       if (localatr1.a((Block)localObject, paramBoolean1))
/*  623:     */       {
/*  624: 701 */         HitResult localbru1 = localatr1.a(this, localdt1, parambrw1, parambrw2);
/*  625: 702 */         if (localbru1 != null) {
/*  626: 703 */           return localbru1;
/*  627:     */         }
/*  628:     */       }
/*  629:     */     }
/*  630: 708 */     HitResult localObject1 = null;
/*  631:     */     
/*  632: 710 */     int i7 = 200;
/*  633: 711 */     while (i7-- >= 0)
/*  634:     */     {
/*  635: 712 */       if ((Double.isNaN(parambrw1.x)) || (Double.isNaN(parambrw1.y)) || (Double.isNaN(parambrw1.z))) {
/*  636: 713 */         return null;
/*  637:     */       }
/*  638: 715 */       if ((i4 == i1) && (i5 == i2) && (i6 == i3)) {
/*  639: 716 */         return paramBoolean3 ? localObject1 : null;
/*  640:     */       }
/*  641: 719 */       int i8 = 1;
/*  642: 720 */       int i9 = 1;
/*  643: 721 */       int i10 = 1;
/*  644:     */       
/*  645: 723 */       double d1 = 999.0D;
/*  646: 724 */       double d2 = 999.0D;
/*  647: 725 */       double d3 = 999.0D;
/*  648: 727 */       if (i1 > i4) {
/*  649: 728 */         d1 = i4 + 1.0D;
/*  650: 729 */       } else if (i1 < i4) {
/*  651: 730 */         d1 = i4 + 0.0D;
/*  652:     */       } else {
/*  653: 732 */         i8 = 0;
/*  654:     */       }
/*  655: 735 */       if (i2 > i5) {
/*  656: 736 */         d2 = i5 + 1.0D;
/*  657: 737 */       } else if (i2 < i5) {
/*  658: 738 */         d2 = i5 + 0.0D;
/*  659:     */       } else {
/*  660: 740 */         i9 = 0;
/*  661:     */       }
/*  662: 743 */       if (i3 > i6) {
/*  663: 744 */         d3 = i6 + 1.0D;
/*  664: 745 */       } else if (i3 < i6) {
/*  665: 746 */         d3 = i6 + 0.0D;
/*  666:     */       } else {
/*  667: 748 */         i10 = 0;
/*  668:     */       }
/*  669: 751 */       double d4 = 999.0D;
/*  670: 752 */       double d5 = 999.0D;
/*  671: 753 */       double d6 = 999.0D;
/*  672:     */       
/*  673: 755 */       double d7 = parambrw2.x - parambrw1.x;
/*  674: 756 */       double d8 = parambrw2.y - parambrw1.y;
/*  675: 757 */       double d9 = parambrw2.z - parambrw1.z;
/*  676: 759 */       if (i8 != 0) {
/*  677: 760 */         d4 = (d1 - parambrw1.x) / d7;
/*  678:     */       }
/*  679: 762 */       if (i9 != 0) {
/*  680: 763 */         d5 = (d2 - parambrw1.y) / d8;
/*  681:     */       }
/*  682: 765 */       if (i10 != 0) {
/*  683: 766 */         d6 = (d3 - parambrw1.z) / d9;
/*  684:     */       }
/*  685: 770 */       if (d4 == -0.0D) {
/*  686: 771 */         d4 = -0.0001D;
/*  687:     */       }
/*  688: 773 */       if (d5 == -0.0D) {
/*  689: 774 */         d5 = -0.0001D;
/*  690:     */       }
/*  691: 776 */       if (d6 == -0.0D) {
/*  692: 777 */         d6 = -0.0001D;
/*  693:     */       }
/*  694:     */       EnumDirection localej;
/*  695: 781 */       if ((d4 < d5) && (d4 < d6))
/*  696:     */       {
/*  697: 782 */         localej = i1 > i4 ? EnumDirection.WEST : EnumDirection.EAST;
/*  698: 783 */         parambrw1 = new Vec3(d1, parambrw1.y + d8 * d4, parambrw1.z + d9 * d4);
/*  699:     */       }
/*  700: 784 */       else if (d5 < d6)
/*  701:     */       {
/*  702: 785 */         localej = i2 > i5 ? EnumDirection.DOWN : EnumDirection.UP;
/*  703: 786 */         parambrw1 = new Vec3(parambrw1.x + d7 * d5, d2, parambrw1.z + d9 * d5);
/*  704:     */       }
/*  705:     */       else
/*  706:     */       {
/*  707: 788 */         localej = i3 > i6 ? EnumDirection.NORTH : EnumDirection.SOUTH;
/*  708: 789 */         parambrw1 = new Vec3(parambrw1.x + d7 * d6, parambrw1.y + d8 * d6, d3);
/*  709:     */       }
/*  710: 792 */       i4 = MathUtils.floor(parambrw1.x) - (localej == EnumDirection.EAST ? 1 : 0);
/*  711: 793 */       i5 = MathUtils.floor(parambrw1.y) - (localej == EnumDirection.UP ? 1 : 0);
/*  712: 794 */       i6 = MathUtils.floor(parambrw1.z) - (localej == EnumDirection.SOUTH ? 1 : 0);
/*  713:     */       
/*  714: 796 */       localdt1 = new BlockPosition(i4, i5, i6);
/*  715: 797 */       Block localbec = getBlock(localdt1);
/*  716: 798 */       ProtoBlock localatr2 = localbec.getProto();
/*  717: 799 */       if ((!paramBoolean2) || (localatr2.a(this, localdt1, localbec) != null)) {
/*  718: 801 */         if (localatr2.a(localbec, paramBoolean1))
/*  719:     */         {
/*  720: 802 */           HitResult localbru2 = localatr2.a(this, localdt1, parambrw1, parambrw2);
/*  721: 803 */           if (localbru2 != null) {
/*  722: 804 */             return localbru2;
/*  723:     */           }
/*  724:     */         }
/*  725:     */         else
/*  726:     */         {
/*  727: 807 */           localObject1 = new HitResult(brv.MISS, parambrw1, localej, localdt1);
/*  728:     */         }
/*  729:     */       }
/*  730:     */     }
/*  731: 810 */     return paramBoolean3 ? localObject1 : null;
/*  732:     */   }
/*  733:     */   
/*  734:     */   public void a(Entity paramwv, String paramString, float paramFloat1, float paramFloat2)
/*  735:     */   {
/*  736: 814 */     for (int i1 = 0; i1 < this.worldAccesses.size(); i1++) {
/*  737: 815 */       this.worldAccesses.get(i1).a(paramString, paramwv.xPos, paramwv.yPos, paramwv.zPos, paramFloat1, paramFloat2);
/*  738:     */     }
/*  739:     */   }
/*  740:     */   
/*  741:     */   public void a(EntityPlayer paramahd, String paramString, float paramFloat1, float paramFloat2)
/*  742:     */   {
/*  743: 820 */     for (int i1 = 0; i1 < this.worldAccesses.size(); i1++) {
/*  744: 821 */       this.worldAccesses.get(i1).a(paramahd, paramString, paramahd.xPos, paramahd.yPos, paramahd.zPos, paramFloat1, paramFloat2);
/*  745:     */     }
/*  746:     */   }
/*  747:     */   
/*  748:     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat1, float paramFloat2)
/*  749:     */   {
/*  750: 826 */     for (int i1 = 0; i1 < this.worldAccesses.size(); i1++) {
/*  751: 827 */       this.worldAccesses.get(i1).a(paramString, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*  752:     */     }
/*  753:     */   }
/*  754:     */   
/*  755:     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat1, float paramFloat2, boolean paramBoolean) {}
/*  756:     */   
/*  757:     */   public void a(BlockPosition paramdt, String paramString)
/*  758:     */   {
/*  759: 835 */     for (int i1 = 0; i1 < this.worldAccesses.size(); i1++) {
/*  760: 836 */       this.worldAccesses.get(i1).a(paramString, paramdt);
/*  761:     */     }
/*  762:     */   }
/*  763:     */   
/*  764:     */   public void a(EnumParticleEffect paramew, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int... paramVarArgs)
/*  765:     */   {
/*  766: 841 */     a(paramew.c(), paramew.e(), paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramVarArgs);
/*  767:     */   }
/*  768:     */   
/*  769:     */   public void a(EnumParticleEffect paramew, boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int... paramVarArgs)
/*  770:     */   {
/*  771: 845 */     a(paramew.c(), paramew.e() | paramBoolean, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramVarArgs);
/*  772:     */   }
/*  773:     */   
/*  774:     */   private void a(int paramInt, boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int... paramVarArgs)
/*  775:     */   {
/*  776: 849 */     for (int i1 = 0; i1 < this.worldAccesses.size(); i1++) {
/*  777: 850 */       this.worldAccesses.get(i1).a(paramInt, paramBoolean, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramVarArgs);
/*  778:     */     }
/*  779:     */   }
/*  780:     */   
/*  781:     */   public boolean c(Entity paramwv)
/*  782:     */   {
/*  783: 855 */     this.k.add(paramwv);
/*  784: 856 */     return true;
/*  785:     */   }
/*  786:     */   
/*  787:     */   public boolean spawnEntity(Entity entity)
/*  788:     */   {
/*  789: 860 */     int chunkX = MathUtils.floor(entity.xPos / 16.0D);
/*  790: 861 */     int chunkZ = MathUtils.floor(entity.zPos / 16.0D);
/*  791:     */     
/*  792: 863 */     boolean flag = entity.n;
/*  793: 864 */     if ((entity instanceof EntityPlayer)) {
/*  794: 865 */       flag = true;
/*  795:     */     }
/*  796: 868 */     if ((flag) || (a(chunkX, chunkZ, true)))
/*  797:     */     {
/*  798: 869 */       if ((entity instanceof EntityPlayer))
/*  799:     */       {
/*  800: 870 */         EntityPlayer player = (EntityPlayer)entity;
/*  801: 871 */         this.playerList.add(player);
/*  802: 872 */         updateAllPlayersSleepingFlag();
/*  803:     */       }
/*  804: 874 */       getChunk(chunkX, chunkZ).addEntity(entity);
/*  805: 875 */       this.entityList.add(entity);
/*  806: 876 */       obtainEntitySkin(entity);
/*  807: 877 */       return true;
/*  808:     */     }
/*  809: 879 */     return false;
/*  810:     */   }
/*  811:     */   
/*  812:     */   protected void obtainEntitySkin(Entity paramwv)
/*  813:     */   {
/*  814: 883 */     for (int i1 = 0; i1 < this.worldAccesses.size(); i1++) {
/*  815: 884 */       this.worldAccesses.get(i1).obtainEntitySkin(paramwv);
/*  816:     */     }
/*  817:     */   }
/*  818:     */   
/*  819:     */   protected void releaseEntitySkin(Entity paramwv)
/*  820:     */   {
/*  821: 889 */     for (int i1 = 0; i1 < this.worldAccesses.size(); i1++) {
/*  822: 890 */       this.worldAccesses.get(i1).releaseEntitySkin(paramwv);
/*  823:     */     }
/*  824:     */   }
/*  825:     */   
/*  826:     */   public void setEntityDead(Entity paramwv)
/*  827:     */   {
/*  828: 895 */     if (paramwv.rider != null) {
/*  829: 896 */       paramwv.rider.mount((Entity)null);
/*  830:     */     }
/*  831: 898 */     if (paramwv.vehicle != null) {
/*  832: 899 */       paramwv.mount((Entity)null);
/*  833:     */     }
/*  834: 901 */     paramwv.setDead();
/*  835: 902 */     if ((paramwv instanceof EntityPlayer))
/*  836:     */     {
/*  837: 903 */       this.playerList.remove(paramwv);
/*  838: 904 */       updateAllPlayersSleepingFlag();
/*  839: 905 */       releaseEntitySkin(paramwv);
/*  840:     */     }
/*  841:     */   }
/*  842:     */   
/*  843:     */   public void removeEntity(Entity paramwv)
/*  844:     */   {
/*  845: 910 */     paramwv.setDead();
/*  846: 912 */     if ((paramwv instanceof EntityPlayer))
/*  847:     */     {
/*  848: 913 */       this.playerList.remove(paramwv);
/*  849: 914 */       updateAllPlayersSleepingFlag();
/*  850:     */     }
/*  851: 917 */     int i1 = paramwv.ae;
/*  852: 918 */     int i2 = paramwv.ag;
/*  853: 919 */     if ((paramwv.ad) && (a(i1, i2, true))) {
/*  854: 920 */       getChunk(i1, i2).b(paramwv);
/*  855:     */     }
/*  856: 923 */     this.entityList.remove(paramwv);
/*  857: 924 */     releaseEntitySkin(paramwv);
/*  858:     */   }
/*  859:     */   
/*  860:     */   public void addWorldAccess(IWorldAccess paramara)
/*  861:     */   {
/*  862: 928 */     this.worldAccesses.add(paramara);
/*  863:     */   }
/*  864:     */   
/*  865:     */   public void removeWorldAccess(IWorldAccess paramara)
/*  866:     */   {
/*  867: 932 */     this.worldAccesses.remove(paramara);
/*  868:     */   }
/*  869:     */   
/*  870:     */   public List<AABB> getCollidingAABBs(Entity paramwv, AABB parambrt)
/*  871:     */   {
/*  872: 936 */     ArrayList<AABB> localArrayList = Lists.newArrayList();
/*  873: 937 */     int i1 = MathUtils.floor(parambrt.minX);
/*  874: 938 */     int i2 = MathUtils.floor(parambrt.maxX + 1.0D);
/*  875: 939 */     int i3 = MathUtils.floor(parambrt.minY);
/*  876: 940 */     int i4 = MathUtils.floor(parambrt.maxY + 1.0D);
/*  877: 941 */     int i5 = MathUtils.floor(parambrt.minZ);
/*  878: 942 */     int i6 = MathUtils.floor(parambrt.maxZ + 1.0D);
/*  879: 944 */     for (int i7 = i1; i7 < i2; i7++) {
/*  880: 945 */       for (int i8 = i5; i8 < i6; i8++) {
/*  881: 946 */         if (e(new BlockPosition(i7, 64, i8))) {
/*  882: 947 */           for (int i9 = i3 - 1; i9 < i4; i9++)
/*  883:     */           {
/*  884: 949 */             BlockPosition localdt = new BlockPosition(i7, i9, i8);
/*  885:     */             
/*  886: 951 */             boolean bool1 = paramwv.aS();
/*  887: 952 */             boolean bool2 = a(af(), paramwv);
/*  888: 954 */             if ((bool1) && (bool2)) {
/*  889: 955 */               paramwv.h(false);
/*  890: 956 */             } else if ((!bool1) && (!bool2)) {
/*  891: 957 */               paramwv.h(true);
/*  892:     */             }
/*  893:     */             Block localbec;
/*  894: 961 */             if ((af().a(localdt)) || (!bool2)) {
/*  895: 962 */               localbec = getBlock(localdt);
/*  896:     */             } else {
/*  897: 964 */               localbec = BlockList.stone.instance();
/*  898:     */             }
/*  899: 966 */             localbec.getProto().a(this, localdt, localbec, parambrt, localArrayList, paramwv);
/*  900:     */           }
/*  901:     */         }
/*  902:     */       }
/*  903:     */     }
/*  904: 972 */     double d1 = 0.25D;
/*  905: 973 */     List<Entity> localList = b(paramwv, parambrt.expand(d1, d1, d1));
/*  906: 974 */     for (int i10 = 0; i10 < localList.size(); i10++) {
/*  907: 975 */       if ((paramwv.rider != localList) && (paramwv.vehicle != localList))
/*  908:     */       {
/*  909: 978 */         AABB localbrt = localList.get(i10).S();
/*  910: 979 */         if ((localbrt != null) && (localbrt.intersectsWith(parambrt))) {
/*  911: 980 */           localArrayList.add(localbrt);
/*  912:     */         }
/*  913: 983 */         localbrt = paramwv.j(localList.get(i10));
/*  914: 984 */         if ((localbrt != null) && (localbrt.intersectsWith(parambrt))) {
/*  915: 985 */           localArrayList.add(localbrt);
/*  916:     */         }
/*  917:     */       }
/*  918:     */     }
/*  919: 989 */     return localArrayList;
/*  920:     */   }
/*  921:     */   
/*  922:     */   public boolean a(bfb parambfb, Entity paramwv)
/*  923:     */   {
/*  924: 993 */     double d1 = parambfb.b();
/*  925: 994 */     double d2 = parambfb.c();
/*  926: 995 */     double d3 = parambfb.d();
/*  927: 996 */     double d4 = parambfb.e();
/*  928: 998 */     if (paramwv.aS())
/*  929:     */     {
/*  930: 999 */       d1 += 1.0D;
/*  931:1000 */       d2 += 1.0D;
/*  932:1001 */       d3 -= 1.0D;
/*  933:1002 */       d4 -= 1.0D;
/*  934:     */     }
/*  935:     */     else
/*  936:     */     {
/*  937:1004 */       d1 -= 1.0D;
/*  938:1005 */       d2 -= 1.0D;
/*  939:1006 */       d3 += 1.0D;
/*  940:1007 */       d4 += 1.0D;
/*  941:     */     }
/*  942:1010 */     return (paramwv.xPos > d1) && (paramwv.xPos < d3) && (paramwv.zPos > d2) && (paramwv.zPos < d4);
/*  943:     */   }
/*  944:     */   
/*  945:     */   public List<AABB> getCollidingAABBs(AABB parambrt)
/*  946:     */   {
/*  947:1014 */     ArrayList<AABB> localArrayList = Lists.newArrayList();
/*  948:1015 */     int i1 = MathUtils.floor(parambrt.minX);
/*  949:1016 */     int i2 = MathUtils.floor(parambrt.maxX + 1.0D);
/*  950:1017 */     int i3 = MathUtils.floor(parambrt.minY);
/*  951:1018 */     int i4 = MathUtils.floor(parambrt.maxY + 1.0D);
/*  952:1019 */     int i5 = MathUtils.floor(parambrt.minZ);
/*  953:1020 */     int i6 = MathUtils.floor(parambrt.maxZ + 1.0D);
/*  954:1022 */     for (int i7 = i1; i7 < i2; i7++) {
/*  955:1023 */       for (int i8 = i5; i8 < i6; i8++) {
/*  956:1024 */         if (e(new BlockPosition(i7, 64, i8))) {
/*  957:1025 */           for (int i9 = i3 - 1; i9 < i4; i9++)
/*  958:     */           {
/*  959:1027 */             BlockPosition localdt = new BlockPosition(i7, i9, i8);
/*  960:     */             Block localbec;
/*  961:1028 */             if ((i7 < -30000000) || (i7 >= 30000000) || (i8 < -30000000) || (i8 >= 30000000)) {
/*  962:1029 */               localbec = BlockList.bedrock.instance();
/*  963:     */             } else {
/*  964:1031 */               localbec = getBlock(localdt);
/*  965:     */             }
/*  966:1033 */             localbec.getProto().a(this, localdt, localbec, parambrt, localArrayList, null);
/*  967:     */           }
/*  968:     */         }
/*  969:     */       }
/*  970:     */     }
/*  971:1039 */     return localArrayList;
/*  972:     */   }
/*  973:     */   
/*  974:     */   public int calculateSkylightSubtracted(float paramFloat)
/*  975:     */   {
/*  976:1043 */     float f1 = c(paramFloat);
/*  977:1044 */     float f2 = 1.0F - (MathUtils.cos(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F);
/*  978:1045 */     f2 = MathUtils.clamp(f2, 0.0F, 1.0F);
/*  979:1046 */     f2 = 1.0F - f2;
/*  980:1047 */     f2 = (float)(f2 * (1.0D - j(paramFloat) * 5.0F / 16.0D));
/*  981:1048 */     f2 = (float)(f2 * (1.0D - h(paramFloat) * 5.0F / 16.0D));
/*  982:1049 */     f2 = 1.0F - f2;
/*  983:1050 */     return (int)(f2 * 11.0F);
/*  984:     */   }
/*  985:     */   
/*  986:     */   public float b(float paramFloat)
/*  987:     */   {
/*  988:1054 */     float f1 = c(paramFloat);
/*  989:     */     
/*  990:1056 */     float f2 = 1.0F - (MathUtils.cos(f1 * 3.141593F * 2.0F) * 2.0F + 0.2F);
/*  991:1057 */     f2 = MathUtils.clamp(f2, 0.0F, 1.0F);
/*  992:     */     
/*  993:1059 */     f2 = 1.0F - f2;
/*  994:     */     
/*  995:1061 */     f2 = (float)(f2 * (1.0D - j(paramFloat) * 5.0F / 16.0D));
/*  996:1062 */     f2 = (float)(f2 * (1.0D - h(paramFloat) * 5.0F / 16.0D));
/*  997:     */     
/*  998:1064 */     return f2 * 0.8F + 0.2F;
/*  999:     */   }
/* 1000:     */   
/* 1001:     */   public Vec3 a(Entity paramwv, float paramFloat)
/* 1002:     */   {
/* 1003:1068 */     float f1 = c(paramFloat);
/* 1004:     */     
/* 1005:1070 */     float f2 = MathUtils.cos(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
/* 1006:1071 */     f2 = MathUtils.clamp(f2, 0.0F, 1.0F);
/* 1007:     */     
/* 1008:1073 */     int i1 = MathUtils.floor(paramwv.xPos);
/* 1009:1074 */     int i2 = MathUtils.floor(paramwv.yPos);
/* 1010:1075 */     int i3 = MathUtils.floor(paramwv.zPos);
/* 1011:1076 */     BlockPosition localdt = new BlockPosition(i1, i2, i3);
/* 1012:1077 */     arm localarm = b(localdt);
/* 1013:1078 */     float f3 = localarm.a(localdt);
/* 1014:1079 */     int i4 = localarm.a(f3);
/* 1015:     */     
/* 1016:1081 */     float f4 = (i4 >> 16 & 0xFF) / 255.0F;
/* 1017:1082 */     float f5 = (i4 >> 8 & 0xFF) / 255.0F;
/* 1018:1083 */     float f6 = (i4 & 0xFF) / 255.0F;
/* 1019:1084 */     f4 *= f2;
/* 1020:1085 */     f5 *= f2;
/* 1021:1086 */     f6 *= f2;
/* 1022:     */     
/* 1023:1088 */     float f7 = j(paramFloat);
/* 1024:     */     float f9;
/* 1025:1089 */     if (f7 > 0.0F)
/* 1026:     */     {
/* 1027:1090 */       float f8 = (f4 * 0.3F + f5 * 0.59F + f6 * 0.11F) * 0.6F;
/* 1028:     */       
/* 1029:1092 */       f9 = 1.0F - f7 * 0.75F;
/* 1030:1093 */       f4 = f4 * f9 + f8 * (1.0F - f9);
/* 1031:1094 */       f5 = f5 * f9 + f8 * (1.0F - f9);
/* 1032:1095 */       f6 = f6 * f9 + f8 * (1.0F - f9);
/* 1033:     */     }
/* 1034:1097 */     float f8 = h(paramFloat);
/* 1035:1098 */     if (f8 > 0.0F)
/* 1036:     */     {
/* 1037:1099 */       f9 = (f4 * 0.3F + f5 * 0.59F + f6 * 0.11F) * 0.2F;
/* 1038:     */       
/* 1039:1101 */       float f10 = 1.0F - f8 * 0.75F;
/* 1040:1102 */       f4 = f4 * f10 + f9 * (1.0F - f10);
/* 1041:1103 */       f5 = f5 * f10 + f9 * (1.0F - f10);
/* 1042:1104 */       f6 = f6 * f10 + f9 * (1.0F - f10);
/* 1043:     */     }
/* 1044:1107 */     if (this.I > 0)
/* 1045:     */     {
/* 1046:1108 */       f9 = this.I - paramFloat;
/* 1047:1109 */       if (f9 > 1.0F) {
/* 1048:1110 */         f9 = 1.0F;
/* 1049:     */       }
/* 1050:1112 */       f9 *= 0.45F;
/* 1051:1113 */       f4 = f4 * (1.0F - f9) + 0.8F * f9;
/* 1052:1114 */       f5 = f5 * (1.0F - f9) + 0.8F * f9;
/* 1053:1115 */       f6 = f6 * (1.0F - f9) + 1.0F * f9;
/* 1054:     */     }
/* 1055:1118 */     return new Vec3(f4, f5, f6);
/* 1056:     */   }
/* 1057:     */   
/* 1058:     */   public float c(float paramFloat)
/* 1059:     */   {
/* 1060:1122 */     return this.t.a(this.worldInfo.getTime(), paramFloat);
/* 1061:     */   }
/* 1062:     */   
/* 1063:     */   public int x()
/* 1064:     */   {
/* 1065:1126 */     return this.t.a(this.worldInfo.getTime());
/* 1066:     */   }
/* 1067:     */   
/* 1068:     */   public float y()
/* 1069:     */   {
/* 1070:1130 */     return bgd.a[this.t.a(this.worldInfo.getTime())];
/* 1071:     */   }
/* 1072:     */   
/* 1073:     */   public float d(float paramFloat)
/* 1074:     */   {
/* 1075:1134 */     float f1 = c(paramFloat);
/* 1076:1135 */     return f1 * 3.141593F * 2.0F;
/* 1077:     */   }
/* 1078:     */   
/* 1079:     */   public Vec3 e(float paramFloat)
/* 1080:     */   {
/* 1081:1139 */     float f1 = c(paramFloat);
/* 1082:     */     
/* 1083:1141 */     float f2 = MathUtils.cos(f1 * 3.141593F * 2.0F) * 2.0F + 0.5F;
/* 1084:1142 */     f2 = MathUtils.clamp(f2, 0.0F, 1.0F);
/* 1085:     */     
/* 1086:1144 */     float f3 = (float)(this.c >> 16 & 0xFF) / 255.0F;
/* 1087:1145 */     float f4 = (float)(this.c >> 8 & 0xFF) / 255.0F;
/* 1088:1146 */     float f5 = (float)(this.c & 0xFF) / 255.0F;
/* 1089:     */     
/* 1090:1148 */     float f6 = j(paramFloat);
/* 1091:     */     float f8;
/* 1092:1149 */     if (f6 > 0.0F)
/* 1093:     */     {
/* 1094:1150 */       float f7 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.6F;
/* 1095:     */       
/* 1096:1152 */       f8 = 1.0F - f6 * 0.95F;
/* 1097:1153 */       f3 = f3 * f8 + f7 * (1.0F - f8);
/* 1098:1154 */       f4 = f4 * f8 + f7 * (1.0F - f8);
/* 1099:1155 */       f5 = f5 * f8 + f7 * (1.0F - f8);
/* 1100:     */     }
/* 1101:1158 */     f3 *= (f2 * 0.9F + 0.1F);
/* 1102:1159 */     f4 *= (f2 * 0.9F + 0.1F);
/* 1103:1160 */     f5 *= (f2 * 0.85F + 0.15F);
/* 1104:     */     
/* 1105:1162 */     float f7 = h(paramFloat);
/* 1106:1163 */     if (f7 > 0.0F)
/* 1107:     */     {
/* 1108:1164 */       f8 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.2F;
/* 1109:     */       
/* 1110:1166 */       float f9 = 1.0F - f7 * 0.95F;
/* 1111:1167 */       f3 = f3 * f9 + f8 * (1.0F - f9);
/* 1112:1168 */       f4 = f4 * f9 + f8 * (1.0F - f9);
/* 1113:1169 */       f5 = f5 * f9 + f8 * (1.0F - f9);
/* 1114:     */     }
/* 1115:1172 */     return new Vec3(f3, f4, f5);
/* 1116:     */   }
/* 1117:     */   
/* 1118:     */   public Vec3 f(float paramFloat)
/* 1119:     */   {
/* 1120:1176 */     float f1 = c(paramFloat);
/* 1121:1177 */     return this.t.b(f1, paramFloat);
/* 1122:     */   }
/* 1123:     */   
/* 1124:     */   public BlockPosition q(BlockPosition paramdt)
/* 1125:     */   {
/* 1126:1181 */     return getChunk(paramdt).h(paramdt);
/* 1127:     */   }
/* 1128:     */   
/* 1129:     */   public BlockPosition r(BlockPosition pos)
/* 1130:     */   {
/* 1131:1185 */     Chunk localbfh = getChunk(pos);
/* 1132:     */     
/* 1133:1187 */     BlockPosition curPos = new BlockPosition(pos.getX(), localbfh.getTopFilledSegment() + 16, pos.getZ());
/* 1134:1188 */     while (curPos.getY() >= 0)
/* 1135:     */     {
/* 1136:1189 */       BlockPosition nextPos = curPos.down();
/* 1137:1190 */       Material localbof = localbfh.getBlock(nextPos).getMaterial();
/* 1138:1191 */       if ((localbof.c()) && (localbof != Material.leaves)) {
/* 1139:     */         break;
/* 1140:     */       }
/* 1141:1195 */       curPos = nextPos;
/* 1142:     */     }
/* 1143:1198 */     return curPos;
/* 1144:     */   }
/* 1145:     */   
/* 1146:     */   public float g(float paramFloat)
/* 1147:     */   {
/* 1148:1202 */     float f1 = c(paramFloat);
/* 1149:     */     
/* 1150:1204 */     float f2 = 1.0F - (MathUtils.cos(f1 * 3.141593F * 2.0F) * 2.0F + 0.25F);
/* 1151:1205 */     f2 = MathUtils.clamp(f2, 0.0F, 1.0F);
/* 1152:     */     
/* 1153:1207 */     return f2 * f2 * 0.5F;
/* 1154:     */   }
/* 1155:     */   
/* 1156:     */   public void a(BlockPosition paramdt, ProtoBlock paramatr, int paramInt) {}
/* 1157:     */   
/* 1158:     */   public void a(BlockPosition paramdt, ProtoBlock paramatr, int paramInt1, int paramInt2) {}
/* 1159:     */   
/* 1160:     */   public void b(BlockPosition paramdt, ProtoBlock paramatr, int paramInt1, int paramInt2) {}
/* 1161:     */   
/* 1162:     */   public void updateEntities()
/* 1163:     */   {
/* 1164:1220 */     this.profiler.a("entities");
/* 1165:1221 */     this.profiler.a("global");
/* 1166:     */     
/* 1167:     */     Object localObject3;
/* 1168:1223 */     for (int i1 = 0; i1 < this.k.size(); i1++)
/* 1169:     */     {
/* 1170:1224 */       Entity localwv = this.k.get(i1);
/* 1171:     */       try
/* 1172:     */       {
/* 1173:1226 */         localwv.W += 1;
/* 1174:1227 */         localwv.onUpdate();
/* 1175:     */       }
/* 1176:     */       catch (Throwable localThrowable1)
/* 1177:     */       {
/* 1178:1229 */         b localb1 = net.minecraft.src.b.a(localThrowable1, "Ticking entity");
/* 1179:1230 */         localObject3 = localb1.a("Entity being ticked");
/* 1180:1232 */         if (localwv == null) {
/* 1181:1233 */           ((j)localObject3).a("Entity", "~~NULL~~");
/* 1182:     */         } else {
/* 1183:1235 */           localwv.a((j)localObject3);
/* 1184:     */         }
/* 1185:1238 */         throw new u(localb1);
/* 1186:     */       }
/* 1187:1241 */       if (localwv.isDead) {
/* 1188:1242 */         this.k.remove(i1--);
/* 1189:     */       }
/* 1190:     */     }
/* 1191:1246 */     this.profiler.c("remove");
/* 1192:1247 */     this.entityList.removeAll(this.unloadingEntityList);
/* 1193:1248 */     for (int i1 = 0; i1 < this.unloadingEntityList.size(); i1++)
/* 1194:     */     {
/* 1195:1249 */       Entity entity = this.unloadingEntityList.get(i1);
/* 1196:1250 */       int i3 = entity.ae;
/* 1197:1251 */       int i5 = entity.ag;
/* 1198:1252 */       if ((entity.ad) && (a(i3, i5, true))) {
/* 1199:1253 */         getChunk(i3, i5).b(entity);
/* 1200:     */       }
/* 1201:     */     }
/* 1202:1256 */     for (int i1 = 0; i1 < this.unloadingEntityList.size(); i1++) {
/* 1203:1257 */       releaseEntitySkin(this.unloadingEntityList.get(i1));
/* 1204:     */     }
/* 1205:1259 */     this.unloadingEntityList.clear();
/* 1206:     */     
/* 1207:1261 */     this.profiler.c("regular");
/* 1208:1262 */     for (int i1 = 0; i1 < this.entityList.size(); i1++)
/* 1209:     */     {
/* 1210:1263 */       Entity localwv = this.entityList.get(i1);
/* 1211:1265 */       if (localwv.vehicle != null)
/* 1212:     */       {
/* 1213:1266 */         if ((localwv.vehicle.isDead) || (localwv.vehicle.rider != localwv))
/* 1214:     */         {
/* 1215:1267 */           localwv.vehicle.rider = null;
/* 1216:1268 */           localwv.vehicle = null;
/* 1217:     */         }
/* 1218:     */       }
/* 1219:     */       else
/* 1220:     */       {
/* 1221:1274 */         this.profiler.a("tick");
/* 1222:1275 */         if (!((Entity)localwv).isDead) {
/* 1223:     */           try
/* 1224:     */           {
/* 1225:1277 */             g((Entity)localwv);
/* 1226:     */           }
/* 1227:     */           catch (Throwable localThrowable2)
/* 1228:     */           {
/* 1229:1279 */             b localb2 = net.minecraft.src.b.a(localThrowable2, "Ticking entity");
/* 1230:1280 */             localObject3 = localb2.a("Entity being ticked");
/* 1231:     */             
/* 1232:1282 */             ((Entity)localwv).a((j)localObject3);
/* 1233:     */             
/* 1234:1284 */             throw new u(localb2);
/* 1235:     */           }
/* 1236:     */         }
/* 1237:1287 */         this.profiler.b();
/* 1238:     */         
/* 1239:1289 */         this.profiler.a("remove");
/* 1240:1290 */         if (((Entity)localwv).isDead)
/* 1241:     */         {
/* 1242:1291 */           int i4 = ((Entity)localwv).ae;
/* 1243:1292 */           int i6 = ((Entity)localwv).ag;
/* 1244:1293 */           if ((((Entity)localwv).ad) && (a(i4, i6, true))) {
/* 1245:1294 */             getChunk(i4, i6).b((Entity)localwv);
/* 1246:     */           }
/* 1247:1296 */           this.entityList.remove(i1--);
/* 1248:1297 */           releaseEntitySkin((Entity)localwv);
/* 1249:     */         }
/* 1250:1299 */         this.profiler.b();
/* 1251:     */       }
/* 1252:     */     }
/* 1253:1302 */     this.profiler.c("blockEntities");
/* 1254:1303 */     this.L = true;
/* 1255:1304 */     Iterator<bcm> localIterator = this.i.iterator();
/* 1256:     */     Object localObject2;
/* 1257:1305 */     while (localIterator.hasNext())
/* 1258:     */     {
/* 1259:1306 */       bcm localObject1 = localIterator.next();
/* 1260:1307 */       if ((!((bcm)localObject1).x()) && (((bcm)localObject1).t()))
/* 1261:     */       {
/* 1262:1308 */         localObject2 = ((bcm)localObject1).v();
/* 1263:1309 */         if ((e((BlockPosition)localObject2)) && (this.M.a((BlockPosition)localObject2))) {
/* 1264:     */           try
/* 1265:     */           {
/* 1266:1311 */             ((pm)localObject1).c();
/* 1267:     */           }
/* 1268:     */           catch (Throwable localThrowable3)
/* 1269:     */           {
/* 1270:1313 */             localObject3 = net.minecraft.src.b.a(localThrowable3, "Ticking block entity");
/* 1271:1314 */             j localj = ((b)localObject3).a("Block entity being ticked");
/* 1272:     */             
/* 1273:1316 */             ((bcm)localObject1).a(localj);
/* 1274:     */             
/* 1275:1318 */             throw new u((b)localObject3);
/* 1276:     */           }
/* 1277:     */         }
/* 1278:     */       }
/* 1279:1323 */       if (((bcm)localObject1).x())
/* 1280:     */       {
/* 1281:1324 */         localIterator.remove();
/* 1282:1325 */         this.h.remove(localObject1);
/* 1283:1327 */         if (e(((bcm)localObject1).v())) {
/* 1284:1328 */           getChunk(((bcm)localObject1).v()).e(((bcm)localObject1).v());
/* 1285:     */         }
/* 1286:     */       }
/* 1287:     */     }
/* 1288:1332 */     this.L = false;
/* 1289:1334 */     if (!this.b.isEmpty())
/* 1290:     */     {
/* 1291:1335 */       this.i.removeAll(this.b);
/* 1292:1336 */       this.h.removeAll(this.b);
/* 1293:1337 */       this.b.clear();
/* 1294:     */     }
/* 1295:1340 */     this.profiler.c("pendingBlockEntities");
/* 1296:1341 */     if (!this.a.isEmpty())
/* 1297:     */     {
/* 1298:1342 */       for (int i2 = 0; i2 < this.a.size(); i2++)
/* 1299:     */       {
/* 1300:1343 */         localObject2 = this.a.get(i2);
/* 1301:1344 */         if (!((bcm)localObject2).x())
/* 1302:     */         {
/* 1303:1345 */           if (!this.h.contains(localObject2)) {
/* 1304:1346 */             a((bcm)localObject2);
/* 1305:     */           }
/* 1306:1349 */           if (e(((bcm)localObject2).v())) {
/* 1307:1350 */             getChunk(((bcm)localObject2).v()).a(((bcm)localObject2).v(), (bcm)localObject2);
/* 1308:     */           }
/* 1309:1353 */           h(((bcm)localObject2).v());
/* 1310:     */         }
/* 1311:     */       }
/* 1312:1356 */       this.a.clear();
/* 1313:     */     }
/* 1314:1358 */     this.profiler.b();
/* 1315:1359 */     this.profiler.b();
/* 1316:     */   }
/* 1317:     */   
/* 1318:     */   public boolean a(bcm parambcm)
/* 1319:     */   {
/* 1320:1363 */     boolean bool = this.h.add(parambcm);
/* 1321:1364 */     if ((bool) && ((parambcm instanceof pm))) {
/* 1322:1365 */       this.i.add(parambcm);
/* 1323:     */     }
/* 1324:1367 */     return bool;
/* 1325:     */   }
/* 1326:     */   
/* 1327:     */   public void a(Collection<bcm> paramCollection)
/* 1328:     */   {
/* 1329:1371 */     if (this.L) {
/* 1330:1372 */       this.a.addAll(paramCollection);
/* 1331:     */     } else {
/* 1332:1374 */       for (bcm localbcm : paramCollection)
/* 1333:     */       {
/* 1334:1375 */         this.h.add(localbcm);
/* 1335:1376 */         if ((localbcm instanceof pm)) {
/* 1336:1377 */           this.i.add(localbcm);
/* 1337:     */         }
/* 1338:     */       }
/* 1339:     */     }
/* 1340:     */   }
/* 1341:     */   
/* 1342:     */   public void g(Entity paramwv)
/* 1343:     */   {
/* 1344:1384 */     a(paramwv, true);
/* 1345:     */   }
/* 1346:     */   
/* 1347:     */   public void a(Entity paramwv, boolean paramBoolean)
/* 1348:     */   {
/* 1349:1388 */     int i1 = MathUtils.floor(paramwv.xPos);
/* 1350:1389 */     int i2 = MathUtils.floor(paramwv.zPos);
/* 1351:1390 */     int i3 = 32;
/* 1352:1391 */     if ((paramBoolean) && (!a(i1 - i3, 0, i2 - i3, i1 + i3, 0, i2 + i3, true))) {
/* 1353:1392 */       return;
/* 1354:     */     }
/* 1355:1395 */     paramwv.P = paramwv.xPos;
/* 1356:1396 */     paramwv.Q = paramwv.yPos;
/* 1357:1397 */     paramwv.R = paramwv.zPos;
/* 1358:1398 */     paramwv.lastYaw = paramwv.yaw;
/* 1359:1399 */     paramwv.lastPitch = paramwv.pitch;
/* 1360:1401 */     if ((paramBoolean) && (paramwv.ad))
/* 1361:     */     {
/* 1362:1402 */       paramwv.W += 1;
/* 1363:1403 */       if (paramwv.vehicle != null) {
/* 1364:1404 */         paramwv.updateVehicle();
/* 1365:     */       } else {
/* 1366:1406 */         paramwv.onUpdate();
/* 1367:     */       }
/* 1368:     */     }
/* 1369:1410 */     this.profiler.a("chunkCheck");
/* 1370:1412 */     if ((Double.isNaN(paramwv.xPos)) || (Double.isInfinite(paramwv.xPos))) {
/* 1371:1413 */       paramwv.xPos = paramwv.P;
/* 1372:     */     }
/* 1373:1415 */     if ((Double.isNaN(paramwv.yPos)) || (Double.isInfinite(paramwv.yPos))) {
/* 1374:1416 */       paramwv.yPos = paramwv.Q;
/* 1375:     */     }
/* 1376:1418 */     if ((Double.isNaN(paramwv.zPos)) || (Double.isInfinite(paramwv.zPos))) {
/* 1377:1419 */       paramwv.zPos = paramwv.R;
/* 1378:     */     }
/* 1379:1421 */     if ((Double.isNaN(paramwv.pitch)) || (Double.isInfinite(paramwv.pitch))) {
/* 1380:1422 */       paramwv.pitch = paramwv.lastPitch;
/* 1381:     */     }
/* 1382:1424 */     if ((Double.isNaN(paramwv.yaw)) || (Double.isInfinite(paramwv.yaw))) {
/* 1383:1425 */       paramwv.yaw = paramwv.lastYaw;
/* 1384:     */     }
/* 1385:1428 */     int i4 = MathUtils.floor(paramwv.xPos / 16.0D);
/* 1386:1429 */     int i5 = MathUtils.floor(paramwv.yPos / 16.0D);
/* 1387:1430 */     int i6 = MathUtils.floor(paramwv.zPos / 16.0D);
/* 1388:1432 */     if ((!paramwv.ad) || (paramwv.ae != i4) || (paramwv.af != i5) || (paramwv.ag != i6))
/* 1389:     */     {
/* 1390:1433 */       if ((paramwv.ad) && (a(paramwv.ae, paramwv.ag, true))) {
/* 1391:1434 */         getChunk(paramwv.ae, paramwv.ag).a(paramwv, paramwv.af);
/* 1392:     */       }
/* 1393:1437 */       if (a(i4, i6, true))
/* 1394:     */       {
/* 1395:1438 */         paramwv.ad = true;
/* 1396:1439 */         getChunk(i4, i6).addEntity(paramwv);
/* 1397:     */       }
/* 1398:     */       else
/* 1399:     */       {
/* 1400:1441 */         paramwv.ad = false;
/* 1401:     */       }
/* 1402:     */     }
/* 1403:1444 */     this.profiler.b();
/* 1404:1446 */     if ((paramBoolean) && (paramwv.ad) && 
/* 1405:1447 */       (paramwv.rider != null)) {
/* 1406:1448 */       if ((paramwv.rider.isDead) || (paramwv.rider.vehicle != paramwv))
/* 1407:     */       {
/* 1408:1449 */         paramwv.rider.vehicle = null;
/* 1409:1450 */         paramwv.rider = null;
/* 1410:     */       }
/* 1411:     */       else
/* 1412:     */       {
/* 1413:1452 */         g(paramwv.rider);
/* 1414:     */       }
/* 1415:     */     }
/* 1416:     */   }
/* 1417:     */   
/* 1418:     */   public boolean isCollisionFree(AABB parambrt)
/* 1419:     */   {
/* 1420:1459 */     return isCollisionFree(parambrt, (Entity)null);
/* 1421:     */   }
/* 1422:     */   
/* 1423:     */   public boolean isCollisionFree(AABB parambrt, Entity paramwv)
/* 1424:     */   {
/* 1425:1463 */     List<Entity> localList = b(null, parambrt);
/* 1426:1464 */     for (int i1 = 0; i1 < localList.size(); i1++)
/* 1427:     */     {
/* 1428:1465 */       Entity localwv = (Entity)localList.get(i1);
/* 1429:1466 */       if ((!localwv.isDead) && (localwv.k) && (localwv != paramwv) && ((paramwv == null) || ((paramwv.vehicle != localwv) && (paramwv.rider != localwv)))) {
/* 1430:1467 */         return false;
/* 1431:     */       }
/* 1432:     */     }
/* 1433:1470 */     return true;
/* 1434:     */   }
/* 1435:     */   
/* 1436:     */   public boolean c(AABB parambrt)
/* 1437:     */   {
/* 1438:1474 */     int i1 = MathUtils.floor(parambrt.minX);
/* 1439:1475 */     int i2 = MathUtils.floor(parambrt.maxX);
/* 1440:1476 */     int i3 = MathUtils.floor(parambrt.minY);
/* 1441:1477 */     int i4 = MathUtils.floor(parambrt.maxY);
/* 1442:1478 */     int i5 = MathUtils.floor(parambrt.minZ);
/* 1443:1479 */     int i6 = MathUtils.floor(parambrt.maxZ);
/* 1444:1481 */     for (int i7 = i1; i7 <= i2; i7++) {
/* 1445:1482 */       for (int i8 = i3; i8 <= i4; i8++) {
/* 1446:1483 */         for (int i9 = i5; i9 <= i6; i9++)
/* 1447:     */         {
/* 1448:1484 */           ProtoBlock localatr = getBlock(new BlockPosition(i7, i8, i9)).getProto();
/* 1449:1485 */           if (localatr.getMaterial() != Material.air) {
/* 1450:1486 */             return true;
/* 1451:     */           }
/* 1452:     */         }
/* 1453:     */       }
/* 1454:     */     }
/* 1455:1491 */     return false;
/* 1456:     */   }
/* 1457:     */   
/* 1458:     */   public boolean isInLiquid(AABB parambrt)
/* 1459:     */   {
/* 1460:1495 */     int i1 = MathUtils.floor(parambrt.minX);
/* 1461:1496 */     int i2 = MathUtils.floor(parambrt.maxX);
/* 1462:1497 */     int i3 = MathUtils.floor(parambrt.minY);
/* 1463:1498 */     int i4 = MathUtils.floor(parambrt.maxY);
/* 1464:1499 */     int i5 = MathUtils.floor(parambrt.minZ);
/* 1465:1500 */     int i6 = MathUtils.floor(parambrt.maxZ);
/* 1466:1502 */     for (int i7 = i1; i7 <= i2; i7++) {
/* 1467:1503 */       for (int i8 = i3; i8 <= i4; i8++) {
/* 1468:1504 */         for (int i9 = i5; i9 <= i6; i9++)
/* 1469:     */         {
/* 1470:1505 */           ProtoBlock localatr = getBlock(new BlockPosition(i7, i8, i9)).getProto();
/* 1471:1506 */           if (localatr.getMaterial().isLiquid()) {
/* 1472:1507 */             return true;
/* 1473:     */           }
/* 1474:     */         }
/* 1475:     */       }
/* 1476:     */     }
/* 1477:1512 */     return false;
/* 1478:     */   }
/* 1479:     */   
/* 1480:     */   public boolean e(AABB parambrt)
/* 1481:     */   {
/* 1482:1516 */     int i1 = MathUtils.floor(parambrt.minX);
/* 1483:1517 */     int i2 = MathUtils.floor(parambrt.maxX + 1.0D);
/* 1484:1518 */     int i3 = MathUtils.floor(parambrt.minY);
/* 1485:1519 */     int i4 = MathUtils.floor(parambrt.maxY + 1.0D);
/* 1486:1520 */     int i5 = MathUtils.floor(parambrt.minZ);
/* 1487:1521 */     int i6 = MathUtils.floor(parambrt.maxZ + 1.0D);
/* 1488:1523 */     if (a(i1, i3, i5, i2, i4, i6, true)) {
/* 1489:1524 */       for (int i7 = i1; i7 < i2; i7++) {
/* 1490:1525 */         for (int i8 = i3; i8 < i4; i8++) {
/* 1491:1526 */           for (int i9 = i5; i9 < i6; i9++)
/* 1492:     */           {
/* 1493:1527 */             ProtoBlock localatr = getBlock(new BlockPosition(i7, i8, i9)).getProto();
/* 1494:1528 */             if ((localatr == BlockList.fire) || (localatr == BlockList.flowingLava) || (localatr == BlockList.lava)) {
/* 1495:1529 */               return true;
/* 1496:     */             }
/* 1497:     */           }
/* 1498:     */         }
/* 1499:     */       }
/* 1500:     */     }
/* 1501:1535 */     return false;
/* 1502:     */   }
/* 1503:     */   
/* 1504:     */   public boolean a(AABB parambrt, Material parambof, Entity paramwv)
/* 1505:     */   {
/* 1506:1539 */     int i1 = MathUtils.floor(parambrt.minX);
/* 1507:1540 */     int i2 = MathUtils.floor(parambrt.maxX + 1.0D);
/* 1508:     */     
/* 1509:1542 */     int i3 = MathUtils.floor(parambrt.minY);
/* 1510:1543 */     int i4 = MathUtils.floor(parambrt.maxY + 1.0D);
/* 1511:     */     
/* 1512:1545 */     int i5 = MathUtils.floor(parambrt.minZ);
/* 1513:1546 */     int i6 = MathUtils.floor(parambrt.maxZ + 1.0D);
/* 1514:1548 */     if (!a(i1, i3, i5, i2, i4, i6, true)) {
/* 1515:1549 */       return false;
/* 1516:     */     }
/* 1517:1552 */     boolean bool = false;
/* 1518:1553 */     Vec3 localbrw = new Vec3(0.0D, 0.0D, 0.0D);
/* 1519:1554 */     for (int i7 = i1; i7 < i2; i7++) {
/* 1520:1555 */       for (int i8 = i3; i8 < i4; i8++) {
/* 1521:1556 */         for (int i9 = i5; i9 < i6; i9++)
/* 1522:     */         {
/* 1523:1557 */           BlockPosition localdt = new BlockPosition(i7, i8, i9);
/* 1524:1558 */           Block localbec = getBlock(localdt);
/* 1525:1559 */           ProtoBlock localatr = localbec.getProto();
/* 1526:1560 */           if (localatr.getMaterial() == parambof)
/* 1527:     */           {
/* 1528:1561 */             double d2 = i8 + 1 - BlockLiquid.b(((Integer)localbec.getProperty(BlockLiquid.level)).intValue());
/* 1529:1562 */             if (i4 >= d2)
/* 1530:     */             {
/* 1531:1563 */               bool = true;
/* 1532:1564 */               localbrw = localatr.a(this, localdt, paramwv, localbrw);
/* 1533:     */             }
/* 1534:     */           }
/* 1535:     */         }
/* 1536:     */       }
/* 1537:     */     }
/* 1538:1570 */     if ((localbrw.b() > 0.0D) && (paramwv.aK()))
/* 1539:     */     {
/* 1540:1571 */       localbrw = localbrw.normalize();
/* 1541:1572 */       double d1 = 0.014D;
/* 1542:1573 */       paramwv.xVelocity += localbrw.x * d1;
/* 1543:1574 */       paramwv.yVelocity += localbrw.y * d1;
/* 1544:1575 */       paramwv.zVelocity += localbrw.z * d1;
/* 1545:     */     }
/* 1546:1577 */     return bool;
/* 1547:     */   }
/* 1548:     */   
/* 1549:     */   public boolean a(AABB parambrt, Material parambof)
/* 1550:     */   {
/* 1551:1581 */     int i1 = MathUtils.floor(parambrt.minX);
/* 1552:1582 */     int i2 = MathUtils.floor(parambrt.maxX + 1.0D);
/* 1553:1583 */     int i3 = MathUtils.floor(parambrt.minY);
/* 1554:1584 */     int i4 = MathUtils.floor(parambrt.maxY + 1.0D);
/* 1555:1585 */     int i5 = MathUtils.floor(parambrt.minZ);
/* 1556:1586 */     int i6 = MathUtils.floor(parambrt.maxZ + 1.0D);
/* 1557:1588 */     for (int i7 = i1; i7 < i2; i7++) {
/* 1558:1589 */       for (int i8 = i3; i8 < i4; i8++) {
/* 1559:1590 */         for (int i9 = i5; i9 < i6; i9++) {
/* 1560:1591 */           if (getBlock(new BlockPosition(i7, i8, i9)).getProto().getMaterial() == parambof) {
/* 1561:1592 */             return true;
/* 1562:     */           }
/* 1563:     */         }
/* 1564:     */       }
/* 1565:     */     }
/* 1566:1597 */     return false;
/* 1567:     */   }
/* 1568:     */   
/* 1569:     */   public boolean b(AABB parambrt, Material parambof)
/* 1570:     */   {
/* 1571:1601 */     int i1 = MathUtils.floor(parambrt.minX);
/* 1572:1602 */     int i2 = MathUtils.floor(parambrt.maxX + 1.0D);
/* 1573:1603 */     int i3 = MathUtils.floor(parambrt.minY);
/* 1574:1604 */     int i4 = MathUtils.floor(parambrt.maxY + 1.0D);
/* 1575:1605 */     int i5 = MathUtils.floor(parambrt.minZ);
/* 1576:1606 */     int i6 = MathUtils.floor(parambrt.maxZ + 1.0D);
/* 1577:1608 */     for (int i7 = i1; i7 < i2; i7++) {
/* 1578:1609 */       for (int i8 = i3; i8 < i4; i8++) {
/* 1579:1610 */         for (int i9 = i5; i9 < i6; i9++)
/* 1580:     */         {
/* 1581:1611 */           BlockPosition localdt = new BlockPosition(i7, i8, i9);
/* 1582:1612 */           Block localbec = getBlock(localdt);
/* 1583:1613 */           ProtoBlock localatr = localbec.getProto();
/* 1584:1614 */           if (localatr.getMaterial() == parambof)
/* 1585:     */           {
/* 1586:1615 */             int i10 = ((Integer)localbec.getProperty(BlockLiquid.level)).intValue();
/* 1587:1616 */             double d1 = i8 + 1;
/* 1588:1617 */             if (i10 < 8) {
/* 1589:1618 */               d1 = i8 + 1 - i10 / 8.0D;
/* 1590:     */             }
/* 1591:1620 */             if (d1 >= parambrt.minY) {
/* 1592:1621 */               return true;
/* 1593:     */             }
/* 1594:     */           }
/* 1595:     */         }
/* 1596:     */       }
/* 1597:     */     }
/* 1598:1627 */     return false;
/* 1599:     */   }
/* 1600:     */   
/* 1601:     */   public aqo a(Entity paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, boolean paramBoolean)
/* 1602:     */   {
/* 1603:1631 */     return a(paramwv, paramDouble1, paramDouble2, paramDouble3, paramFloat, false, paramBoolean);
/* 1604:     */   }
/* 1605:     */   
/* 1606:     */   public aqo a(Entity paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
/* 1607:     */   {
/* 1608:1635 */     aqo localaqo = new aqo(this, paramwv, paramDouble1, paramDouble2, paramDouble3, paramFloat, paramBoolean1, paramBoolean2);
/* 1609:1636 */     localaqo.a();
/* 1610:1637 */     localaqo.a(true);
/* 1611:1638 */     return localaqo;
/* 1612:     */   }
/* 1613:     */   
/* 1614:     */   public float a(Vec3 parambrw, AABB parambrt)
/* 1615:     */   {
/* 1616:1642 */     double d1 = 1.0D / ((parambrt.maxX - parambrt.minX) * 2.0D + 1.0D);
/* 1617:1643 */     double d2 = 1.0D / ((parambrt.maxY - parambrt.minY) * 2.0D + 1.0D);
/* 1618:1644 */     double d3 = 1.0D / ((parambrt.maxZ - parambrt.minZ) * 2.0D + 1.0D);
/* 1619:1645 */     if ((d1 < 0.0D) || (d2 < 0.0D) || (d3 < 0.0D)) {
/* 1620:1646 */       return 0.0F;
/* 1621:     */     }
/* 1622:1648 */     int i1 = 0;
/* 1623:1649 */     int i2 = 0;
/* 1624:1650 */     for (float f1 = 0.0F; f1 <= 1.0F; f1 = (float)(f1 + d1)) {
/* 1625:1651 */       for (float f2 = 0.0F; f2 <= 1.0F; f2 = (float)(f2 + d2)) {
/* 1626:1652 */         for (float f3 = 0.0F; f3 <= 1.0F; f3 = (float)(f3 + d3))
/* 1627:     */         {
/* 1628:1653 */           double d4 = parambrt.minX + (parambrt.maxX - parambrt.minX) * f1;
/* 1629:1654 */           double d5 = parambrt.minY + (parambrt.maxY - parambrt.minY) * f2;
/* 1630:1655 */           double d6 = parambrt.minZ + (parambrt.maxZ - parambrt.minZ) * f3;
/* 1631:1656 */           if (a(new Vec3(d4, d5, d6), parambrw) == null) {
/* 1632:1657 */             i1++;
/* 1633:     */           }
/* 1634:1659 */           i2++;
/* 1635:     */         }
/* 1636:     */       }
/* 1637:     */     }
/* 1638:1664 */     return i1 / i2;
/* 1639:     */   }
/* 1640:     */   
/* 1641:     */   public boolean a(EntityPlayer paramahd, BlockPosition paramdt, EnumDirection paramej)
/* 1642:     */   {
/* 1643:1668 */     paramdt = paramdt.a(paramej);
/* 1644:1670 */     if (getBlock(paramdt).getProto() == BlockList.fire)
/* 1645:     */     {
/* 1646:1671 */       playLevelEvent(paramahd, 1004, paramdt, 0);
/* 1647:1672 */       g(paramdt);
/* 1648:1673 */       return true;
/* 1649:     */     }
/* 1650:1675 */     return false;
/* 1651:     */   }
/* 1652:     */   
/* 1653:     */   public String z()
/* 1654:     */   {
/* 1655:1679 */     return "All: " + this.entityList.size();
/* 1656:     */   }
/* 1657:     */   
/* 1658:     */   public String A()
/* 1659:     */   {
/* 1660:1683 */     return this.chunkProvider.getName();
/* 1661:     */   }
/* 1662:     */   
/* 1663:     */   public bcm s(BlockPosition paramdt)
/* 1664:     */   {
/* 1665:1689 */     if (!isInBound(paramdt)) {
/* 1666:1690 */       return null;
/* 1667:     */     }
/* 1668:1692 */     bcm localObject = null;
/* 1669:     */     int i1;
/* 1670:     */     bcm localbcm;
/* 1671:1694 */     if (this.L) {
/* 1672:1695 */       for (i1 = 0; i1 < this.a.size(); i1++)
/* 1673:     */       {
/* 1674:1696 */         localbcm = this.a.get(i1);
/* 1675:1697 */         if ((!localbcm.x()) && (localbcm.v().equals(paramdt)))
/* 1676:     */         {
/* 1677:1698 */           localObject = localbcm;
/* 1678:1699 */           break;
/* 1679:     */         }
/* 1680:     */       }
/* 1681:     */     }
/* 1682:1704 */     if (localObject == null) {
/* 1683:1705 */       localObject = getChunk(paramdt).a(paramdt, bfl.a);
/* 1684:     */     }
/* 1685:1708 */     if (localObject == null) {
/* 1686:1709 */       for (i1 = 0; i1 < this.a.size(); i1++)
/* 1687:     */       {
/* 1688:1710 */         localbcm = this.a.get(i1);
/* 1689:1711 */         if ((!localbcm.x()) && (localbcm.v().equals(paramdt)))
/* 1690:     */         {
/* 1691:1712 */           localObject = localbcm;
/* 1692:1713 */           break;
/* 1693:     */         }
/* 1694:     */       }
/* 1695:     */     }
/* 1696:1717 */     return localObject;
/* 1697:     */   }
/* 1698:     */   
/* 1699:     */   public void a(BlockPosition paramdt, bcm parambcm)
/* 1700:     */   {
/* 1701:1721 */     if ((parambcm != null) && (!parambcm.x())) {
/* 1702:1722 */       if (this.L)
/* 1703:     */       {
/* 1704:1723 */         parambcm.setPos(paramdt);
/* 1705:     */         
/* 1706:     */ 
/* 1707:1726 */         Iterator<bcm> localIterator = this.a.iterator();
/* 1708:1727 */         while (localIterator.hasNext())
/* 1709:     */         {
/* 1710:1728 */           bcm localbcm = localIterator.next();
/* 1711:1729 */           if (localbcm.v().equals(paramdt))
/* 1712:     */           {
/* 1713:1730 */             localbcm.y();
/* 1714:1731 */             localIterator.remove();
/* 1715:     */           }
/* 1716:     */         }
/* 1717:1735 */         this.a.add(parambcm);
/* 1718:     */       }
/* 1719:     */       else
/* 1720:     */       {
/* 1721:1737 */         a(parambcm);
/* 1722:     */         
/* 1723:1739 */         getChunk(paramdt).a(paramdt, parambcm);
/* 1724:     */       }
/* 1725:     */     }
/* 1726:     */   }
/* 1727:     */   
/* 1728:     */   public void t(BlockPosition paramdt)
/* 1729:     */   {
/* 1730:1745 */     bcm localbcm = s(paramdt);
/* 1731:1746 */     if ((localbcm != null) && (this.L))
/* 1732:     */     {
/* 1733:1747 */       localbcm.y();
/* 1734:1748 */       this.a.remove(localbcm);
/* 1735:     */     }
/* 1736:     */     else
/* 1737:     */     {
/* 1738:1750 */       if (localbcm != null)
/* 1739:     */       {
/* 1740:1751 */         this.a.remove(localbcm);
/* 1741:1752 */         this.h.remove(localbcm);
/* 1742:1753 */         this.i.remove(localbcm);
/* 1743:     */       }
/* 1744:1756 */       getChunk(paramdt).e(paramdt);
/* 1745:     */     }
/* 1746:     */   }
/* 1747:     */   
/* 1748:     */   public void b(bcm parambcm)
/* 1749:     */   {
/* 1750:1761 */     this.b.add(parambcm);
/* 1751:     */   }
/* 1752:     */   
/* 1753:     */   public boolean u(BlockPosition paramdt)
/* 1754:     */   {
/* 1755:1765 */     Block localbec = getBlock(paramdt);
/* 1756:1766 */     AABB localbrt = localbec.getProto().a(this, paramdt, localbec);
/* 1757:1767 */     return (localbrt != null) && (localbrt.a() >= 1.0D);
/* 1758:     */   }
/* 1759:     */   
/* 1760:     */   public static boolean isFlatSurface(IBlockAccess paramard, BlockPosition pos)
/* 1761:     */   {
/* 1762:1772 */     Block block = paramard.getBlock(pos);
/* 1763:1773 */     ProtoBlock protoBlock = block.getProto();
/* 1764:1774 */     if ((protoBlock.getMaterial().isOpaque()) && (protoBlock.isOpaqueCube())) {
/* 1765:1775 */       return true;
/* 1766:     */     }
/* 1767:1777 */     if ((protoBlock instanceof BlockStairs)) {
/* 1768:1778 */       return block.getProperty(BlockStairs.half) == EnumStairsHalf.TOP;
/* 1769:     */     }
/* 1770:1780 */     if ((protoBlock instanceof BlockSlab)) {
/* 1771:1781 */       return block.getProperty(BlockSlab.half) == EnumSlabHalf.TOP;
/* 1772:     */     }
/* 1773:1783 */     if ((protoBlock instanceof BlockHopper)) {
/* 1774:1784 */       return true;
/* 1775:     */     }
/* 1776:1786 */     if ((protoBlock instanceof BlockSnowLayer)) {
/* 1777:1787 */       return ((Integer)block.getProperty(BlockSnowLayer.a)).intValue() == 7;
/* 1778:     */     }
/* 1779:1789 */     return false;
/* 1780:     */   }
/* 1781:     */   
/* 1782:     */   public boolean d(BlockPosition paramdt, boolean paramBoolean)
/* 1783:     */   {
/* 1784:1804 */     if (!isInBound(paramdt)) {
/* 1785:1805 */       return paramBoolean;
/* 1786:     */     }
/* 1787:1807 */     Chunk localbfh = this.chunkProvider.getChunk(paramdt);
/* 1788:1808 */     if (localbfh.loaded()) {
/* 1789:1809 */       return paramBoolean;
/* 1790:     */     }
/* 1791:1812 */     ProtoBlock localatr = getBlock(paramdt).getProto();
/* 1792:1813 */     return (localatr.getMaterial().isOpaque()) && (localatr.isOpaqueCube());
/* 1793:     */   }
/* 1794:     */   
/* 1795:     */   public void B()
/* 1796:     */   {
/* 1797:1817 */     int i1 = calculateSkylightSubtracted(1.0F);
/* 1798:1818 */     if (i1 != this.d) {
/* 1799:1819 */       this.d = i1;
/* 1800:     */     }
/* 1801:     */   }
/* 1802:     */   
/* 1803:     */   public void a(boolean paramBoolean1, boolean paramBoolean2)
/* 1804:     */   {
/* 1805:1824 */     this.spawnMonster = paramBoolean1;
/* 1806:1825 */     this.spawnPeaceful = paramBoolean2;
/* 1807:     */   }
/* 1808:     */   
/* 1809:     */   public void tick()
/* 1810:     */   {
/* 1811:1829 */     p();
/* 1812:     */   }
/* 1813:     */   
/* 1814:     */   protected void C()
/* 1815:     */   {
/* 1816:1833 */     if (this.worldInfo.p())
/* 1817:     */     {
/* 1818:1834 */       this.p = 1.0F;
/* 1819:1835 */       if (this.worldInfo.n()) {
/* 1820:1836 */         this.r = 1.0F;
/* 1821:     */       }
/* 1822:     */     }
/* 1823:     */   }
/* 1824:     */   
/* 1825:     */   protected void p()
/* 1826:     */   {
/* 1827:1842 */     if (this.t.o()) {
/* 1828:1843 */       return;
/* 1829:     */     }
/* 1830:1845 */     if (this.isClient) {
/* 1831:1846 */       return;
/* 1832:     */     }
/* 1833:1850 */     int i1 = this.worldInfo.A();
/* 1834:1851 */     if (i1 > 0)
/* 1835:     */     {
/* 1836:1852 */       i1--;
/* 1837:1853 */       this.worldInfo.i(i1);
/* 1838:1854 */       this.worldInfo.f(this.worldInfo.n() ? 1 : 2);
/* 1839:1855 */       this.worldInfo.g(this.worldInfo.p() ? 1 : 2);
/* 1840:     */     }
/* 1841:1859 */     int i2 = this.worldInfo.o();
/* 1842:1860 */     if (i2 <= 0)
/* 1843:     */     {
/* 1844:1861 */       if (this.worldInfo.n()) {
/* 1845:1862 */         this.worldInfo.f(this.rng.nextInt(12000) + 3600);
/* 1846:     */       } else {
/* 1847:1864 */         this.worldInfo.f(this.rng.nextInt(168000) + 12000);
/* 1848:     */       }
/* 1849:     */     }
/* 1850:     */     else
/* 1851:     */     {
/* 1852:1867 */       i2--;
/* 1853:1868 */       this.worldInfo.f(i2);
/* 1854:1869 */       if (i2 <= 0) {
/* 1855:1870 */         this.worldInfo.a(!this.worldInfo.n());
/* 1856:     */       }
/* 1857:     */     }
/* 1858:1874 */     this.q = this.r;
/* 1859:1875 */     if (this.worldInfo.n()) {
/* 1860:1876 */       this.r = ((float)(this.r + 0.01D));
/* 1861:     */     } else {
/* 1862:1878 */       this.r = ((float)(this.r - 0.01D));
/* 1863:     */     }
/* 1864:1880 */     this.r = MathUtils.clamp(this.r, 0.0F, 1.0F);
/* 1865:     */     
/* 1866:     */ 
/* 1867:1883 */     int i3 = this.worldInfo.q();
/* 1868:1884 */     if (i3 <= 0)
/* 1869:     */     {
/* 1870:1885 */       if (this.worldInfo.p()) {
/* 1871:1886 */         this.worldInfo.g(this.rng.nextInt(12000) + 12000);
/* 1872:     */       } else {
/* 1873:1888 */         this.worldInfo.g(this.rng.nextInt(168000) + 12000);
/* 1874:     */       }
/* 1875:     */     }
/* 1876:     */     else
/* 1877:     */     {
/* 1878:1891 */       i3--;
/* 1879:1892 */       this.worldInfo.g(i3);
/* 1880:1893 */       if (i3 <= 0) {
/* 1881:1894 */         this.worldInfo.b(!this.worldInfo.p());
/* 1882:     */       }
/* 1883:     */     }
/* 1884:1898 */     this.o = this.p;
/* 1885:1899 */     if (this.worldInfo.p()) {
/* 1886:1900 */       this.p = ((float)(this.p + 0.01D));
/* 1887:     */     } else {
/* 1888:1902 */       this.p = ((float)(this.p - 0.01D));
/* 1889:     */     }
/* 1890:1904 */     this.p = MathUtils.clamp(this.p, 0.0F, 1.0F);
/* 1891:     */   }
/* 1892:     */   
/* 1893:     */   protected void D()
/* 1894:     */   {
/* 1895:1908 */     this.E.clear();
/* 1896:     */     
/* 1897:1910 */     this.profiler.a("buildList");
/* 1898:     */     EntityPlayer localahd;
/* 1899:     */     int i2;
/* 1900:     */     int i3;
/* 1901:     */     int i4;
/* 1902:1911 */     for (int i1 = 0; i1 < this.playerList.size(); i1++)
/* 1903:     */     {
/* 1904:1912 */       localahd = this.playerList.get(i1);
/* 1905:1913 */       i2 = MathUtils.floor(localahd.xPos / 16.0D);
/* 1906:1914 */       i3 = MathUtils.floor(localahd.zPos / 16.0D);
/* 1907:     */       
/* 1908:1916 */       i4 = q();
/* 1909:1917 */       for (int i5 = -i4; i5 <= i4; i5++) {
/* 1910:1918 */         for (int i6 = -i4; i6 <= i4; i6++) {
/* 1911:1919 */           this.E.add(new ChunkID(i5 + i2, i6 + i3));
/* 1912:     */         }
/* 1913:     */       }
/* 1914:     */     }
/* 1915:1923 */     this.profiler.b();
/* 1916:1925 */     if (this.K > 0) {
/* 1917:1926 */       this.K -= 1;
/* 1918:     */     }
/* 1919:1929 */     this.profiler.a("playerCheckLight");
/* 1920:1931 */     if (!this.playerList.isEmpty())
/* 1921:     */     {
/* 1922:1932 */       int i1 = this.rng.nextInt(this.playerList.size());
/* 1923:1933 */       localahd = this.playerList.get(i1);
/* 1924:1934 */       i2 = MathUtils.floor(localahd.xPos) + this.rng.nextInt(11) - 5;
/* 1925:1935 */       i3 = MathUtils.floor(localahd.yPos) + this.rng.nextInt(11) - 5;
/* 1926:1936 */       i4 = MathUtils.floor(localahd.zPos) + this.rng.nextInt(11) - 5;
/* 1927:1937 */       x(new BlockPosition(i2, i3, i4));
/* 1928:     */     }
/* 1929:1939 */     this.profiler.b();
/* 1930:     */   }
/* 1931:     */   
/* 1932:     */   protected abstract int q();
/* 1933:     */   
/* 1934:     */   protected void a(int paramInt1, int paramInt2, Chunk parambfh)
/* 1935:     */   {
/* 1936:1945 */     this.profiler.c("moodSound");
/* 1937:1946 */     if ((this.K == 0) && (!this.isClient))
/* 1938:     */     {
/* 1939:1947 */       this.m = (this.m * 3 + 1013904223);
/* 1940:1948 */       int i1 = this.m >> 2;
/* 1941:1949 */       int i2 = i1 & 0xF;
/* 1942:1950 */       int i3 = i1 >> 8 & 0xF;
/* 1943:1951 */       int i4 = i1 >> 16 & 0xFF;
/* 1944:1952 */       BlockPosition localdt = new BlockPosition(i2, i4, i3);
/* 1945:     */       
/* 1946:1954 */       ProtoBlock localatr = parambfh.getBlock(localdt);
/* 1947:1955 */       i2 += paramInt1;
/* 1948:1956 */       i3 += paramInt2;
/* 1949:1957 */       if ((localatr.getMaterial() == Material.air) && (k(localdt) <= this.rng.nextInt(8)) && (getLightLevel(EnumSkyBlock.SKY, localdt) <= 0))
/* 1950:     */       {
/* 1951:1958 */         EntityPlayer localahd = a(i2 + 0.5D, i4 + 0.5D, i3 + 0.5D, 8.0D);
/* 1952:1959 */         if ((localahd != null) && (localahd.e(i2 + 0.5D, i4 + 0.5D, i3 + 0.5D) > 4.0D))
/* 1953:     */         {
/* 1954:1960 */           a(i2 + 0.5D, i4 + 0.5D, i3 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.rng.nextFloat() * 0.2F);
/* 1955:1961 */           this.K = (this.rng.nextInt(12000) + 6000);
/* 1956:     */         }
/* 1957:     */       }
/* 1958:     */     }
/* 1959:1966 */     this.profiler.c("checkLight");
/* 1960:1967 */     parambfh.m();
/* 1961:     */   }
/* 1962:     */   
/* 1963:     */   protected void h()
/* 1964:     */   {
/* 1965:1971 */     D();
/* 1966:     */   }
/* 1967:     */   
/* 1968:     */   public void a(ProtoBlock paramatr, BlockPosition paramdt, Random paramRandom)
/* 1969:     */   {
/* 1970:1975 */     this.e = true;
/* 1971:1976 */     paramatr.b(this, paramdt, getBlock(paramdt), paramRandom);
/* 1972:1977 */     this.e = false;
/* 1973:     */   }
/* 1974:     */   
/* 1975:     */   public boolean v(BlockPosition paramdt)
/* 1976:     */   {
/* 1977:1981 */     return e(paramdt, false);
/* 1978:     */   }
/* 1979:     */   
/* 1980:     */   public boolean w(BlockPosition paramdt)
/* 1981:     */   {
/* 1982:1985 */     return e(paramdt, true);
/* 1983:     */   }
/* 1984:     */   
/* 1985:     */   public boolean e(BlockPosition paramdt, boolean paramBoolean)
/* 1986:     */   {
/* 1987:1989 */     arm localarm = b(paramdt);
/* 1988:1990 */     float f1 = localarm.a(paramdt);
/* 1989:1991 */     if (f1 > 0.15F) {
/* 1990:1992 */       return false;
/* 1991:     */     }
/* 1992:1995 */     if ((paramdt.getY() >= 0) && (paramdt.getY() < 256) && (getLightLevel(EnumSkyBlock.BLOCK, paramdt) < 10))
/* 1993:     */     {
/* 1994:1996 */       Block localbec = getBlock(paramdt);
/* 1995:1997 */       ProtoBlock localatr = localbec.getProto();
/* 1996:1998 */       if (((localatr == BlockList.water) || (localatr == BlockList.flowingWater)) && (((Integer)localbec.getProperty(BlockLiquid.level)).intValue() == 0))
/* 1997:     */       {
/* 1998:1999 */         if (!paramBoolean) {
/* 1999:2000 */           return true;
/* 2000:     */         }
/* 2001:2003 */         int i1 = (F(paramdt.west())) && (F(paramdt.east())) && (F(paramdt.north())) && (F(paramdt.south())) ? 1 : 0;
/* 2002:2004 */         if (i1 == 0) {
/* 2003:2005 */           return true;
/* 2004:     */         }
/* 2005:     */       }
/* 2006:     */     }
/* 2007:2009 */     return false;
/* 2008:     */   }
/* 2009:     */   
/* 2010:     */   private boolean F(BlockPosition paramdt)
/* 2011:     */   {
/* 2012:2013 */     return getBlock(paramdt).getProto().getMaterial() == Material.water;
/* 2013:     */   }
/* 2014:     */   
/* 2015:     */   public boolean f(BlockPosition paramdt, boolean paramBoolean)
/* 2016:     */   {
/* 2017:2017 */     arm localarm = b(paramdt);
/* 2018:2018 */     float f1 = localarm.a(paramdt);
/* 2019:2019 */     if (f1 > 0.15F) {
/* 2020:2020 */       return false;
/* 2021:     */     }
/* 2022:2021 */     if (!paramBoolean) {
/* 2023:2022 */       return true;
/* 2024:     */     }
/* 2025:2025 */     if ((paramdt.getY() >= 0) && (paramdt.getY() < 256) && (getLightLevel(EnumSkyBlock.BLOCK, paramdt) < 10))
/* 2026:     */     {
/* 2027:2026 */       ProtoBlock localatr = getBlock(paramdt).getProto();
/* 2028:2029 */       if ((localatr.getMaterial() == Material.air) && (BlockList.aH.c(this, paramdt))) {
/* 2029:2030 */         return true;
/* 2030:     */       }
/* 2031:     */     }
/* 2032:2034 */     return false;
/* 2033:     */   }
/* 2034:     */   
/* 2035:     */   public boolean x(BlockPosition paramdt)
/* 2036:     */   {
/* 2037:2038 */     boolean bool = false;
/* 2038:2039 */     if (!this.t.o()) {
/* 2039:2040 */       bool |= c(EnumSkyBlock.SKY, paramdt);
/* 2040:     */     }
/* 2041:2042 */     bool |= c(EnumSkyBlock.BLOCK, paramdt);
/* 2042:2043 */     return bool;
/* 2043:     */   }
/* 2044:     */   
/* 2045:2047 */   int[] H = new int[32768];
/* 2046:     */   
/* 2047:     */   private int a(BlockPosition paramdt, EnumSkyBlock paramarf)
/* 2048:     */   {
/* 2049:2050 */     if ((paramarf == EnumSkyBlock.SKY) && (i(paramdt))) {
/* 2050:2051 */       return 15;
/* 2051:     */     }
/* 2052:2053 */     ProtoBlock localatr = getBlock(paramdt).getProto();
/* 2053:2054 */     int i1 = paramarf == EnumSkyBlock.SKY ? 0 : localatr.p();
/* 2054:2055 */     int i2 = localatr.getLightOpacity();
/* 2055:2056 */     if ((i2 >= 15) && (localatr.p() > 0)) {
/* 2056:2057 */       i2 = 1;
/* 2057:     */     }
/* 2058:2059 */     if (i2 < 1) {
/* 2059:2060 */       i2 = 1;
/* 2060:     */     }
/* 2061:2062 */     if (i2 >= 15) {
/* 2062:2063 */       return 0;
/* 2063:     */     }
/* 2064:2066 */     if (i1 >= 14) {
/* 2065:2067 */       return i1;
/* 2066:     */     }
/* 2067:2070 */     for (EnumDirection localej : EnumDirection.values())
/* 2068:     */     {
/* 2069:2071 */       BlockPosition localdt = paramdt.a(localej);
/* 2070:2072 */       int i5 = getLightLevel(paramarf, localdt) - i2;
/* 2071:2074 */       if (i5 > i1) {
/* 2072:2075 */         i1 = i5;
/* 2073:     */       }
/* 2074:2077 */       if (i1 >= 14) {
/* 2075:2078 */         return i1;
/* 2076:     */       }
/* 2077:     */     }
/* 2078:2082 */     return i1;
/* 2079:     */   }
/* 2080:     */   
/* 2081:     */   public boolean c(EnumSkyBlock paramarf, BlockPosition paramdt)
/* 2082:     */   {
/* 2083:2086 */     if (!a(paramdt, 17, false)) {
/* 2084:2087 */       return false;
/* 2085:     */     }
/* 2086:2090 */     int i1 = 0;
/* 2087:2091 */     int i2 = 0;
/* 2088:     */     
/* 2089:2093 */     this.profiler.a("getBrightness");
/* 2090:2094 */     int i3 = getLightLevel(paramarf, paramdt);
/* 2091:2095 */     int i4 = a(paramdt, paramarf);
/* 2092:2096 */     int i5 = paramdt.getX();
/* 2093:2097 */     int i6 = paramdt.getY();
/* 2094:2098 */     int i7 = paramdt.getZ();
/* 2095:     */     int i8;
/* 2096:     */     int i9;
/* 2097:     */     int i10;
/* 2098:     */     int i11;
/* 2099:     */     int i14;
/* 2100:     */     int i15;
/* 2101:     */     int i16;
/* 2102:     */     int i17;
/* 2103:2100 */     if (i4 > i3)
/* 2104:     */     {
/* 2105:2101 */       this.H[(i2++)] = 133152;
/* 2106:     */     }
/* 2107:2102 */     else if (i4 < i3)
/* 2108:     */     {
/* 2109:2103 */       this.H[(i2++)] = (0x20820 | i3 << 18);
/* 2110:2106 */       while (i1 < i2)
/* 2111:     */       {
/* 2112:2107 */         i8 = this.H[(i1++)];
/* 2113:2108 */         i9 = (i8 & 0x3F) - 32 + i5;
/* 2114:2109 */         i10 = (i8 >> 6 & 0x3F) - 32 + i6;
/* 2115:2110 */         i11 = (i8 >> 12 & 0x3F) - 32 + i7;
/* 2116:2111 */         int i12 = i8 >> 18 & 0xF;
/* 2117:2112 */         BlockPosition localdt2 = new BlockPosition(i9, i10, i11);
/* 2118:2113 */         i14 = getLightLevel(paramarf, localdt2);
/* 2119:2115 */         if (i14 == i12)
/* 2120:     */         {
/* 2121:2116 */           a(paramarf, localdt2, 0);
/* 2122:2118 */           if (i12 > 0)
/* 2123:     */           {
/* 2124:2119 */             i15 = MathUtils.abs(i9 - i5);
/* 2125:2120 */             i16 = MathUtils.abs(i10 - i6);
/* 2126:2121 */             i17 = MathUtils.abs(i11 - i7);
/* 2127:2123 */             if (i15 + i16 + i17 < 17) {
/* 2128:2124 */               for (EnumDirection localej : EnumDirection.values())
/* 2129:     */               {
/* 2130:2125 */                 int i21 = i9 + localej.g();
/* 2131:2126 */                 int i22 = i10 + localej.h();
/* 2132:2127 */                 int i23 = i11 + localej.i();
/* 2133:2128 */                 BlockPosition localdt3 = new BlockPosition(i21, i22, i23);
/* 2134:2129 */                 int i24 = Math.max(1, getBlock(localdt3).getProto().getLightOpacity());
/* 2135:     */                 
/* 2136:2131 */                 i14 = getLightLevel(paramarf, localdt3);
/* 2137:2133 */                 if ((i14 == i12 - i24) && (i2 < this.H.length)) {
/* 2138:2134 */                   this.H[(i2++)] = (i21 - i5 + 32 | i22 - i6 + 32 << 6 | i23 - i7 + 32 << 12 | i12 - i24 << 18);
/* 2139:     */                 }
/* 2140:     */               }
/* 2141:     */             }
/* 2142:     */           }
/* 2143:     */         }
/* 2144:     */       }
/* 2145:2141 */       i1 = 0;
/* 2146:     */     }
/* 2147:2143 */     this.profiler.b();
/* 2148:     */     
/* 2149:2145 */     this.profiler.a("checkedPosition < toCheckCount");
/* 2150:2146 */     while (i1 < i2)
/* 2151:     */     {
/* 2152:2147 */       i8 = this.H[(i1++)];
/* 2153:2148 */       i9 = (i8 & 0x3F) - 32 + i5;
/* 2154:2149 */       i10 = (i8 >> 6 & 0x3F) - 32 + i6;
/* 2155:2150 */       i11 = (i8 >> 12 & 0x3F) - 32 + i7;
/* 2156:2151 */       BlockPosition localdt1 = new BlockPosition(i9, i10, i11);
/* 2157:     */       
/* 2158:2153 */       int i13 = getLightLevel(paramarf, localdt1);
/* 2159:2154 */       i14 = a(localdt1, paramarf);
/* 2160:2156 */       if (i14 != i13)
/* 2161:     */       {
/* 2162:2157 */         a(paramarf, localdt1, i14);
/* 2163:2159 */         if (i14 > i13)
/* 2164:     */         {
/* 2165:2160 */           i15 = Math.abs(i9 - i5);
/* 2166:2161 */           i16 = Math.abs(i10 - i6);
/* 2167:2162 */           i17 = Math.abs(i11 - i7);
/* 2168:2163 */           int i18 = i2 < this.H.length - 6 ? 1 : 0;
/* 2169:2165 */           if ((i15 + i16 + i17 < 17) && (i18 != 0))
/* 2170:     */           {
/* 2171:2166 */             if (getLightLevel(paramarf, localdt1.west()) < i14) {
/* 2172:2167 */               this.H[(i2++)] = (i9 - 1 - i5 + 32 + (i10 - i6 + 32 << 6) + (i11 - i7 + 32 << 12));
/* 2173:     */             }
/* 2174:2169 */             if (getLightLevel(paramarf, localdt1.east()) < i14) {
/* 2175:2170 */               this.H[(i2++)] = (i9 + 1 - i5 + 32 + (i10 - i6 + 32 << 6) + (i11 - i7 + 32 << 12));
/* 2176:     */             }
/* 2177:2172 */             if (getLightLevel(paramarf, localdt1.down()) < i14) {
/* 2178:2173 */               this.H[(i2++)] = (i9 - i5 + 32 + (i10 - 1 - i6 + 32 << 6) + (i11 - i7 + 32 << 12));
/* 2179:     */             }
/* 2180:2175 */             if (getLightLevel(paramarf, localdt1.up()) < i14) {
/* 2181:2176 */               this.H[(i2++)] = (i9 - i5 + 32 + (i10 + 1 - i6 + 32 << 6) + (i11 - i7 + 32 << 12));
/* 2182:     */             }
/* 2183:2178 */             if (getLightLevel(paramarf, localdt1.north()) < i14) {
/* 2184:2179 */               this.H[(i2++)] = (i9 - i5 + 32 + (i10 - i6 + 32 << 6) + (i11 - 1 - i7 + 32 << 12));
/* 2185:     */             }
/* 2186:2181 */             if (getLightLevel(paramarf, localdt1.south()) < i14) {
/* 2187:2182 */               this.H[(i2++)] = (i9 - i5 + 32 + (i10 - i6 + 32 << 6) + (i11 + 1 - i7 + 32 << 12));
/* 2188:     */             }
/* 2189:     */           }
/* 2190:     */         }
/* 2191:     */       }
/* 2192:     */     }
/* 2193:2188 */     this.profiler.b();
/* 2194:     */     
/* 2195:2190 */     return true;
/* 2196:     */   }
/* 2197:     */   
/* 2198:     */   public boolean tickUpdates(boolean paramBoolean)
/* 2199:     */   {
/* 2200:2194 */     return false;
/* 2201:     */   }
/* 2202:     */   
/* 2203:     */   public List<TickListener> a(Chunk parambfh, boolean paramBoolean)
/* 2204:     */   {
/* 2205:2199 */     return null;
/* 2206:     */   }
/* 2207:     */   
/* 2208:     */   public List<TickListener> a(bjb parambjb, boolean paramBoolean)
/* 2209:     */   {
/* 2210:2204 */     return null;
/* 2211:     */   }
/* 2212:     */   
/* 2213:     */   public List<Entity> b(Entity paramwv, AABB parambrt)
/* 2214:     */   {
/* 2215:2208 */     return a(paramwv, parambrt, xe.d);
/* 2216:     */   }
/* 2217:     */   
/* 2218:     */   public List<Entity> a(Entity paramwv, AABB parambrt, Predicate<Entity> paramPredicate)
/* 2219:     */   {
/* 2220:2212 */     ArrayList<Entity> localArrayList = Lists.newArrayList();
/* 2221:2213 */     int i1 = MathUtils.floor((parambrt.minX - 2.0D) / 16.0D);
/* 2222:2214 */     int i2 = MathUtils.floor((parambrt.maxX + 2.0D) / 16.0D);
/* 2223:2215 */     int i3 = MathUtils.floor((parambrt.minZ - 2.0D) / 16.0D);
/* 2224:2216 */     int i4 = MathUtils.floor((parambrt.maxZ + 2.0D) / 16.0D);
/* 2225:2217 */     for (int i5 = i1; i5 <= i2; i5++) {
/* 2226:2218 */       for (int i6 = i3; i6 <= i4; i6++) {
/* 2227:2219 */         if (a(i5, i6, true)) {
/* 2228:2220 */           getChunk(i5, i6).a(paramwv, parambrt, localArrayList, paramPredicate);
/* 2229:     */         }
/* 2230:     */       }
/* 2231:     */     }
/* 2232:2224 */     return localArrayList;
/* 2233:     */   }
/* 2234:     */   
/* 2235:     */   public <E extends Entity> List<Entity> a(Class<E> paramClass, Predicate<Entity> paramPredicate)
/* 2236:     */   {
/* 2237:2229 */     ArrayList<Entity> localArrayList = Lists.newArrayList();
/* 2238:2230 */     for (Entity localwv : this.entityList) {
/* 2239:2231 */       if ((paramClass.isAssignableFrom(localwv.getClass())) && (paramPredicate.apply(localwv))) {
/* 2240:2232 */         localArrayList.add(localwv);
/* 2241:     */       }
/* 2242:     */     }
/* 2243:2235 */     return localArrayList;
/* 2244:     */   }
/* 2245:     */   
/* 2246:     */   public <E extends Entity> List<E> b(Class<E> paramClass, Predicate<? super E> paramPredicate)
/* 2247:     */   {
/* 2248:2240 */     ArrayList<E> localArrayList = Lists.newArrayList();
/* 2249:2241 */     for (Entity localwv : this.playerList) {
/* 2250:2242 */       if ((paramClass.isAssignableFrom(localwv.getClass())) && (paramPredicate.apply((E)localwv))) {
/* 2251:2243 */         localArrayList.add((E)localwv);
/* 2252:     */       }
/* 2253:     */     }
/* 2254:2246 */     return localArrayList;
/* 2255:     */   }
/* 2256:     */   
/* 2257:     */   public <E extends Entity> List<E> a(Class<E> paramClass, AABB parambrt)
/* 2258:     */   {
/* 2259:2250 */     return a(paramClass, parambrt, xe.d);
/* 2260:     */   }
/* 2261:     */   
/* 2262:     */   public <E extends Entity> List<E> a(Class<E> paramClass, AABB parambrt, Predicate<? super E> paramPredicate)
/* 2263:     */   {
/* 2264:2254 */     int i1 = MathUtils.floor((parambrt.minX - 2.0D) / 16.0D);
/* 2265:2255 */     int i2 = MathUtils.floor((parambrt.maxX + 2.0D) / 16.0D);
/* 2266:2256 */     int i3 = MathUtils.floor((parambrt.minZ - 2.0D) / 16.0D);
/* 2267:2257 */     int i4 = MathUtils.floor((parambrt.maxZ + 2.0D) / 16.0D);
/* 2268:2258 */     ArrayList<E> localArrayList = Lists.newArrayList();
/* 2269:2260 */     for (int i5 = i1; i5 <= i2; i5++) {
/* 2270:2261 */       for (int i6 = i3; i6 <= i4; i6++) {
/* 2271:2262 */         if (a(i5, i6, true)) {
/* 2272:2263 */           getChunk(i5, i6).a(paramClass, parambrt, localArrayList, paramPredicate);
/* 2273:     */         }
/* 2274:     */       }
/* 2275:     */     }
/* 2276:2268 */     return localArrayList;
/* 2277:     */   }
/* 2278:     */   
/* 2279:     */   public <E extends Entity> E getNearestEntity(Class<E> paramClass, AABB parambrt, Entity paramwv)
/* 2280:     */   {
/* 2281:2273 */     List<E> localList = a(paramClass, parambrt);
/* 2282:2274 */     E localObject = null;
/* 2283:2275 */     double d1 = 1.7976931348623157E+308D;
/* 2284:2276 */     for (int i1 = 0; i1 < localList.size(); i1++)
/* 2285:     */     {
/* 2286:2277 */       E localwv = localList.get(i1);
/* 2287:2278 */       if (localwv != paramwv) {
/* 2288:2281 */         if (xe.d.apply(localwv))
/* 2289:     */         {
/* 2290:2284 */           double d2 = paramwv.h(localwv);
/* 2291:2285 */           if (d2 <= d1)
/* 2292:     */           {
/* 2293:2288 */             localObject = localwv;
/* 2294:2289 */             d1 = d2;
/* 2295:     */           }
/* 2296:     */         }
/* 2297:     */       }
/* 2298:     */     }
/* 2299:2291 */     return localObject;
/* 2300:     */   }
/* 2301:     */   
/* 2302:     */   public Entity a(int paramInt)
/* 2303:     */   {
/* 2304:2296 */     return (Entity)this.l.a(paramInt);
/* 2305:     */   }
/* 2306:     */   
/* 2307:     */   public List<Entity> getEntityList()
/* 2308:     */   {
/* 2309:2300 */     return this.entityList;
/* 2310:     */   }
/* 2311:     */   
/* 2312:     */   public void b(BlockPosition pos, bcm parambcm)
/* 2313:     */   {
/* 2314:2304 */     if (e(pos)) {
/* 2315:2305 */       getChunk(pos).onModify();
/* 2316:     */     }
/* 2317:     */   }
/* 2318:     */   
/* 2319:     */   public <T> int countEntity(Class<T> paramClass)
/* 2320:     */   {
/* 2321:2311 */     int i1 = 0;
/* 2322:2312 */     for (Entity localwv : this.entityList) {
/* 2323:2313 */       if ((!(localwv instanceof EntityMob)) || (!((EntityMob)localwv).bY())) {
/* 2324:2316 */         if (paramClass.isAssignableFrom(localwv.getClass())) {
/* 2325:2317 */           i1++;
/* 2326:     */         }
/* 2327:     */       }
/* 2328:     */     }
/* 2329:2320 */     return i1;
/* 2330:     */   }
/* 2331:     */   
/* 2332:     */   public void addEntities(Collection<Entity> paramCollection)
/* 2333:     */   {
/* 2334:2324 */     this.entityList.addAll(paramCollection);
/* 2335:2325 */     for (Entity localwv : paramCollection) {
/* 2336:2326 */       obtainEntitySkin(localwv);
/* 2337:     */     }
/* 2338:     */   }
/* 2339:     */   
/* 2340:     */   public void markEntitiesForRemove(Collection<Entity> paramCollection)
/* 2341:     */   {
/* 2342:2331 */     this.unloadingEntityList.addAll(paramCollection);
/* 2343:     */   }
/* 2344:     */   
/* 2345:     */   public boolean a(ProtoBlock paramatr, BlockPosition paramdt, boolean paramBoolean, EnumDirection paramej, Entity paramwv, ItemStack paramamj)
/* 2346:     */   {
/* 2347:2335 */     ProtoBlock localatr = getBlock(paramdt).getProto();
/* 2348:     */     
/* 2349:2337 */     AABB localbrt = paramBoolean ? null : paramatr.a(this, paramdt, paramatr.instance());
/* 2350:2338 */     if ((localbrt != null) && (!isCollisionFree(localbrt, paramwv))) {
/* 2351:2339 */       return false;
/* 2352:     */     }
/* 2353:2343 */     if ((localatr.getMaterial() == Material.q) && (paramatr == BlockList.cf)) {
/* 2354:2344 */       return true;
/* 2355:     */     }
/* 2356:2347 */     return (localatr.getMaterial().j()) && (paramatr.a(this, paramdt, paramej, paramamj));
/* 2357:     */   }
/* 2358:     */   
/* 2359:     */   public int a(BlockPosition paramdt, EnumDirection paramej)
/* 2360:     */   {
/* 2361:2356 */     Block localbec = getBlock(paramdt);
/* 2362:2357 */     return localbec.getProto().b(this, paramdt, localbec, paramej);
/* 2363:     */   }
/* 2364:     */   
/* 2365:     */   public WorldType G()
/* 2366:     */   {
/* 2367:2362 */     return this.worldInfo.u();
/* 2368:     */   }
/* 2369:     */   
/* 2370:     */   public int y(BlockPosition paramdt)
/* 2371:     */   {
/* 2372:2366 */     int i1 = 0;
/* 2373:2367 */     i1 = Math.max(i1, a(paramdt.down(), EnumDirection.DOWN));
/* 2374:2368 */     if (i1 >= 15) {
/* 2375:2369 */       return i1;
/* 2376:     */     }
/* 2377:2371 */     i1 = Math.max(i1, a(paramdt.up(), EnumDirection.UP));
/* 2378:2372 */     if (i1 >= 15) {
/* 2379:2373 */       return i1;
/* 2380:     */     }
/* 2381:2375 */     i1 = Math.max(i1, a(paramdt.north(), EnumDirection.NORTH));
/* 2382:2376 */     if (i1 >= 15) {
/* 2383:2377 */       return i1;
/* 2384:     */     }
/* 2385:2379 */     i1 = Math.max(i1, a(paramdt.south(), EnumDirection.SOUTH));
/* 2386:2380 */     if (i1 >= 15) {
/* 2387:2381 */       return i1;
/* 2388:     */     }
/* 2389:2383 */     i1 = Math.max(i1, a(paramdt.west(), EnumDirection.WEST));
/* 2390:2384 */     if (i1 >= 15) {
/* 2391:2385 */       return i1;
/* 2392:     */     }
/* 2393:2387 */     i1 = Math.max(i1, a(paramdt.east(), EnumDirection.EAST));
/* 2394:2388 */     if (i1 >= 15) {
/* 2395:2389 */       return i1;
/* 2396:     */     }
/* 2397:2391 */     return i1;
/* 2398:     */   }
/* 2399:     */   
/* 2400:     */   public boolean b(BlockPosition paramdt, EnumDirection paramej)
/* 2401:     */   {
/* 2402:2395 */     return c(paramdt, paramej) > 0;
/* 2403:     */   }
/* 2404:     */   
/* 2405:     */   public int c(BlockPosition paramdt, EnumDirection paramej)
/* 2406:     */   {
/* 2407:2399 */     Block localbec = getBlock(paramdt);
/* 2408:2400 */     ProtoBlock localatr = localbec.getProto();
/* 2409:2402 */     if (localatr.blocksMovement()) {
/* 2410:2403 */       return y(paramdt);
/* 2411:     */     }
/* 2412:2405 */     return localatr.a(this, paramdt, localbec, paramej);
/* 2413:     */   }
/* 2414:     */   
/* 2415:     */   public boolean z(BlockPosition paramdt)
/* 2416:     */   {
/* 2417:2409 */     if (c(paramdt.down(), EnumDirection.DOWN) > 0) {
/* 2418:2410 */       return true;
/* 2419:     */     }
/* 2420:2412 */     if (c(paramdt.up(), EnumDirection.UP) > 0) {
/* 2421:2413 */       return true;
/* 2422:     */     }
/* 2423:2415 */     if (c(paramdt.north(), EnumDirection.NORTH) > 0) {
/* 2424:2416 */       return true;
/* 2425:     */     }
/* 2426:2418 */     if (c(paramdt.south(), EnumDirection.SOUTH) > 0) {
/* 2427:2419 */       return true;
/* 2428:     */     }
/* 2429:2421 */     if (c(paramdt.west(), EnumDirection.WEST) > 0) {
/* 2430:2422 */       return true;
/* 2431:     */     }
/* 2432:2424 */     if (c(paramdt.east(), EnumDirection.EAST) > 0) {
/* 2433:2425 */       return true;
/* 2434:     */     }
/* 2435:2427 */     return false;
/* 2436:     */   }
/* 2437:     */   
/* 2438:     */   public int A(BlockPosition paramdt)
/* 2439:     */   {
/* 2440:2431 */     int i1 = 0;
/* 2441:2433 */     for (EnumDirection localej : EnumDirection.values())
/* 2442:     */     {
/* 2443:2434 */       int i4 = c(paramdt.a(localej), localej);
/* 2444:2436 */       if (i4 >= 15) {
/* 2445:2437 */         return 15;
/* 2446:     */       }
/* 2447:2439 */       if (i4 > i1) {
/* 2448:2440 */         i1 = i4;
/* 2449:     */       }
/* 2450:     */     }
/* 2451:2444 */     return i1;
/* 2452:     */   }
/* 2453:     */   
/* 2454:     */   public EntityPlayer a(Entity paramwv, double paramDouble)
/* 2455:     */   {
/* 2456:2449 */     return a(paramwv.xPos, paramwv.yPos, paramwv.zPos, paramDouble);
/* 2457:     */   }
/* 2458:     */   
/* 2459:     */   public EntityPlayer a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/* 2460:     */   {
/* 2461:2454 */     double d1 = -1.0D;
/* 2462:2455 */     EntityPlayer localObject = null;
/* 2463:2456 */     for (int i1 = 0; i1 < this.playerList.size(); i1++)
/* 2464:     */     {
/* 2465:2457 */       EntityPlayer localahd = this.playerList.get(i1);
/* 2466:2458 */       if (xe.d.apply(localahd))
/* 2467:     */       {
/* 2468:2461 */         double d2 = localahd.e(paramDouble1, paramDouble2, paramDouble3);
/* 2469:2462 */         if (((paramDouble4 < 0.0D) || (d2 < paramDouble4 * paramDouble4)) && ((d1 == -1.0D) || (d2 < d1)))
/* 2470:     */         {
/* 2471:2463 */           d1 = d2;
/* 2472:2464 */           localObject = localahd;
/* 2473:     */         }
/* 2474:     */       }
/* 2475:     */     }
/* 2476:2467 */     return localObject;
/* 2477:     */   }
/* 2478:     */   
/* 2479:     */   public boolean isWithinRangeOfAnyPlayer(double x, double y, double z, double range)
/* 2480:     */   {
/* 2481:2471 */     for (int i1 = 0; i1 < this.playerList.size(); i1++)
/* 2482:     */     {
/* 2483:2472 */       EntityPlayer localahd = this.playerList.get(i1);
/* 2484:2473 */       if (xe.d.apply(localahd))
/* 2485:     */       {
/* 2486:2476 */         double d1 = localahd.e(x, y, z);
/* 2487:2477 */         if ((range < 0.0D) || (d1 < range * range)) {
/* 2488:2478 */           return true;
/* 2489:     */         }
/* 2490:     */       }
/* 2491:     */     }
/* 2492:2481 */     return false;
/* 2493:     */   }
/* 2494:     */   
/* 2495:     */   public EntityPlayer a(String paramString)
/* 2496:     */   {
/* 2497:2539 */     for (int i1 = 0; i1 < this.playerList.size(); i1++)
/* 2498:     */     {
/* 2499:2540 */       EntityPlayer localahd = this.playerList.get(i1);
/* 2500:2541 */       if (paramString.equals(localahd.getName())) {
/* 2501:2542 */         return localahd;
/* 2502:     */       }
/* 2503:     */     }
/* 2504:2545 */     return null;
/* 2505:     */   }
/* 2506:     */   
/* 2507:     */   public EntityPlayer b(UUID paramUUID)
/* 2508:     */   {
/* 2509:2550 */     for (int i1 = 0; i1 < this.playerList.size(); i1++)
/* 2510:     */     {
/* 2511:2551 */       EntityPlayer localahd = this.playerList.get(i1);
/* 2512:2552 */       if (paramUUID.equals(localahd.getUUID())) {
/* 2513:2553 */         return localahd;
/* 2514:     */       }
/* 2515:     */     }
/* 2516:2556 */     return null;
/* 2517:     */   }
/* 2518:     */   
/* 2519:     */   public void H() {}
/* 2520:     */   
/* 2521:     */   public void I() throws aqz
/* 2522:     */   {
/* 2523:2563 */     this.w.c();
/* 2524:     */   }
/* 2525:     */   
/* 2526:     */   public void a(long paramLong)
/* 2527:     */   {
/* 2528:2567 */     this.worldInfo.setRealTime(paramLong);
/* 2529:     */   }
/* 2530:     */   
/* 2531:     */   public long J()
/* 2532:     */   {
/* 2533:2571 */     return this.worldInfo.b();
/* 2534:     */   }
/* 2535:     */   
/* 2536:     */   public long K()
/* 2537:     */   {
/* 2538:2575 */     return this.worldInfo.getRealTime();
/* 2539:     */   }
/* 2540:     */   
/* 2541:     */   public long L()
/* 2542:     */   {
/* 2543:2579 */     return this.worldInfo.getTime();
/* 2544:     */   }
/* 2545:     */   
/* 2546:     */   public void b(long paramLong)
/* 2547:     */   {
/* 2548:2583 */     this.worldInfo.setTime(paramLong);
/* 2549:     */   }
/* 2550:     */   
/* 2551:     */   public BlockPosition getWorldSpawn()
/* 2552:     */   {
/* 2553:2587 */     BlockPosition localdt = new BlockPosition(this.worldInfo.c(), this.worldInfo.d(), this.worldInfo.e());
/* 2554:2588 */     if (!af().a(localdt)) {
/* 2555:2589 */       localdt = m(new BlockPosition(af().f(), 0.0D, af().g()));
/* 2556:     */     }
/* 2557:2591 */     return localdt;
/* 2558:     */   }
/* 2559:     */   
/* 2560:     */   public void B(BlockPosition paramdt)
/* 2561:     */   {
/* 2562:2595 */     this.worldInfo.a(paramdt);
/* 2563:     */   }
/* 2564:     */   
/* 2565:     */   public void h(Entity paramwv)
/* 2566:     */   {
/* 2567:2599 */     int i1 = MathUtils.floor(paramwv.xPos / 16.0D);
/* 2568:2600 */     int i2 = MathUtils.floor(paramwv.zPos / 16.0D);
/* 2569:2601 */     int i3 = 2;
/* 2570:2602 */     for (int i4 = i1 - i3; i4 <= i1 + i3; i4++) {
/* 2571:2603 */       for (int i5 = i2 - i3; i5 <= i2 + i3; i5++) {
/* 2572:2604 */         getChunk(i4, i5);
/* 2573:     */       }
/* 2574:     */     }
/* 2575:2608 */     if (!this.entityList.contains(paramwv)) {
/* 2576:2609 */       this.entityList.add(paramwv);
/* 2577:     */     }
/* 2578:     */   }
/* 2579:     */   
/* 2580:     */   public boolean a(EntityPlayer paramahd, BlockPosition paramdt)
/* 2581:     */   {
/* 2582:2614 */     return true;
/* 2583:     */   }
/* 2584:     */   
/* 2585:     */   public void sendSignal(Entity paramwv, byte paramByte) {}
/* 2586:     */   
/* 2587:     */   public IChunkProvider N()
/* 2588:     */   {
/* 2589:2621 */     return this.chunkProvider;
/* 2590:     */   }
/* 2591:     */   
/* 2592:     */   public void c(BlockPosition paramdt, ProtoBlock paramatr, int paramInt1, int paramInt2)
/* 2593:     */   {
/* 2594:2625 */     paramatr.a(this, paramdt, getBlock(paramdt), paramInt1, paramInt2);
/* 2595:     */   }
/* 2596:     */   
/* 2597:     */   public bqy O()
/* 2598:     */   {
/* 2599:2629 */     return this.w;
/* 2600:     */   }
/* 2601:     */   
/* 2602:     */   public WorldInfo getWorldInfo()
/* 2603:     */   {
/* 2604:2633 */     return this.worldInfo;
/* 2605:     */   }
/* 2606:     */   
/* 2607:     */   public GameRules getGameRules()
/* 2608:     */   {
/* 2609:2637 */     return this.worldInfo.getGameRules();
/* 2610:     */   }
/* 2611:     */   
/* 2612:     */   public void updateAllPlayersSleepingFlag() {}
/* 2613:     */   
/* 2614:     */   public float h(float paramFloat)
/* 2615:     */   {
/* 2616:2644 */     return (this.q + (this.r - this.q) * paramFloat) * j(paramFloat);
/* 2617:     */   }
/* 2618:     */   
/* 2619:     */   public void i(float paramFloat)
/* 2620:     */   {
/* 2621:2648 */     this.q = paramFloat;
/* 2622:2649 */     this.r = paramFloat;
/* 2623:     */   }
/* 2624:     */   
/* 2625:     */   public float j(float paramFloat)
/* 2626:     */   {
/* 2627:2653 */     return this.o + (this.p - this.o) * paramFloat;
/* 2628:     */   }
/* 2629:     */   
/* 2630:     */   public void k(float paramFloat)
/* 2631:     */   {
/* 2632:2657 */     this.o = paramFloat;
/* 2633:2658 */     this.p = paramFloat;
/* 2634:     */   }
/* 2635:     */   
/* 2636:     */   public boolean R()
/* 2637:     */   {
/* 2638:2662 */     return h(1.0F) > 0.9D;
/* 2639:     */   }
/* 2640:     */   
/* 2641:     */   public boolean S()
/* 2642:     */   {
/* 2643:2666 */     return j(1.0F) > 0.2D;
/* 2644:     */   }
/* 2645:     */   
/* 2646:     */   public boolean C(BlockPosition paramdt)
/* 2647:     */   {
/* 2648:2670 */     if (!S()) {
/* 2649:2671 */       return false;
/* 2650:     */     }
/* 2651:2673 */     if (!i(paramdt)) {
/* 2652:2674 */       return false;
/* 2653:     */     }
/* 2654:2676 */     if (q(paramdt).getY() > paramdt.getY()) {
/* 2655:2677 */       return false;
/* 2656:     */     }
/* 2657:2680 */     arm localarm = b(paramdt);
/* 2658:2681 */     if (localarm.d()) {
/* 2659:2682 */       return false;
/* 2660:     */     }
/* 2661:2684 */     if (f(paramdt, false)) {
/* 2662:2685 */       return false;
/* 2663:     */     }
/* 2664:2687 */     return localarm.e();
/* 2665:     */   }
/* 2666:     */   
/* 2667:     */   public boolean D(BlockPosition paramdt)
/* 2668:     */   {
/* 2669:2691 */     arm localarm = b(paramdt);
/* 2670:2692 */     return localarm.f();
/* 2671:     */   }
/* 2672:     */   
/* 2673:     */   public brn T()
/* 2674:     */   {
/* 2675:2697 */     return this.z;
/* 2676:     */   }
/* 2677:     */   
/* 2678:     */   public void a(String paramString, bqc parambqc)
/* 2679:     */   {
/* 2680:2701 */     this.z.a(paramString, parambqc);
/* 2681:     */   }
/* 2682:     */   
/* 2683:     */   public <T> bqc a(Class<T> paramClass, String paramString)
/* 2684:     */   {
/* 2685:2706 */     return this.z.a(paramClass, paramString);
/* 2686:     */   }
/* 2687:     */   
/* 2688:     */   public int b(String paramString)
/* 2689:     */   {
/* 2690:2710 */     return this.z.a(paramString);
/* 2691:     */   }
/* 2692:     */   
/* 2693:     */   public void a(int paramInt1, BlockPosition paramdt, int paramInt2)
/* 2694:     */   {
/* 2695:2714 */     for (int i1 = 0; i1 < this.worldAccesses.size(); i1++) {
/* 2696:2715 */       this.worldAccesses.get(i1).a(paramInt1, paramdt, paramInt2);
/* 2697:     */     }
/* 2698:     */   }
/* 2699:     */   
/* 2700:     */   public void playLevelEvent(int paramInt1, BlockPosition paramdt, int paramInt2)
/* 2701:     */   {
/* 2702:2720 */     playLevelEvent(null, paramInt1, paramdt, paramInt2);
/* 2703:     */   }
/* 2704:     */   
/* 2705:     */   public void playLevelEvent(EntityPlayer paramahd, int paramInt1, BlockPosition paramdt, int paramInt2)
/* 2706:     */   {
/* 2707:     */     try
/* 2708:     */     {
/* 2709:2725 */       for (int i1 = 0; i1 < this.worldAccesses.size(); i1++) {
/* 2710:2726 */         this.worldAccesses.get(i1).playLevelEvent(paramahd, paramInt1, paramdt, paramInt2);
/* 2711:     */       }
/* 2712:     */     }
/* 2713:     */     catch (Throwable localThrowable)
/* 2714:     */     {
/* 2715:2729 */       b localb = net.minecraft.src.b.a(localThrowable, "Playing level event");
/* 2716:2730 */       j localj = localb.a("Level event being played");
/* 2717:     */       
/* 2718:2732 */       localj.a("Block coordinates", net.minecraft.src.j.a(paramdt));
/* 2719:2733 */       localj.a("Event source", paramahd);
/* 2720:2734 */       localj.a("Event type", Integer.valueOf(paramInt1));
/* 2721:2735 */       localj.a("Event data", Integer.valueOf(paramInt2));
/* 2722:     */       
/* 2723:2737 */       throw new u(localb);
/* 2724:     */     }
/* 2725:     */   }
/* 2726:     */   
/* 2727:     */   public int U()
/* 2728:     */   {
/* 2729:2743 */     return 256;
/* 2730:     */   }
/* 2731:     */   
/* 2732:     */   public int V()
/* 2733:     */   {
/* 2734:2747 */     return this.t.o() ? 128 : 256;
/* 2735:     */   }
/* 2736:     */   
/* 2737:     */   public Random a(int paramInt1, int paramInt2, int paramInt3)
/* 2738:     */   {
/* 2739:2751 */     long l1 = paramInt1 * 341873128712L + paramInt2 * 132897987541L + getWorldInfo().b() + paramInt3;
/* 2740:2752 */     this.rng.setSeed(l1);
/* 2741:2753 */     return this.rng;
/* 2742:     */   }
/* 2743:     */   
/* 2744:     */   public BlockPosition a(String paramString, BlockPosition paramdt)
/* 2745:     */   {
/* 2746:2758 */     return N().a(this, paramString, paramdt);
/* 2747:     */   }
/* 2748:     */   
/* 2749:     */   public boolean W()
/* 2750:     */   {
/* 2751:2763 */     return false;
/* 2752:     */   }
/* 2753:     */   
/* 2754:     */   public double X()
/* 2755:     */   {
/* 2756:2767 */     if (this.worldInfo.u() == WorldType.FLAT) {
/* 2757:2768 */       return 0.0D;
/* 2758:     */     }
/* 2759:2770 */     return 63.0D;
/* 2760:     */   }
/* 2761:     */   
/* 2762:     */   public j a(b paramb)
/* 2763:     */   {
/* 2764:2774 */     j localj = paramb.a("Affected level", 1);
/* 2765:     */     
/* 2766:2776 */     localj.a("Level name", this.worldInfo == null ? "????" : this.worldInfo.k());
/* 2767:     */     
/* 2768:2778 */     localj.a("All players", new aqx(this));
/* 2769:     */     
/* 2770:     */ 
/* 2771:     */ 
/* 2772:     */ 
/* 2773:     */ 
/* 2774:     */ 
/* 2775:2785 */     localj.a("Chunk stats", new aqy(this));
/* 2776:     */     try
/* 2777:     */     {
/* 2778:2793 */       this.worldInfo.a(localj);
/* 2779:     */     }
/* 2780:     */     catch (Throwable localThrowable)
/* 2781:     */     {
/* 2782:2795 */       localj.a("Level Data Unobtainable", localThrowable);
/* 2783:     */     }
/* 2784:2798 */     return localj;
/* 2785:     */   }
/* 2786:     */   
/* 2787:     */   public void c(int paramInt1, BlockPosition paramdt, int paramInt2)
/* 2788:     */   {
/* 2789:2802 */     for (int i1 = 0; i1 < this.worldAccesses.size(); i1++)
/* 2790:     */     {
/* 2791:2803 */       IWorldAccess localara = this.worldAccesses.get(i1);
/* 2792:2804 */       localara.b(paramInt1, paramdt, paramInt2);
/* 2793:     */     }
/* 2794:     */   }
/* 2795:     */   
/* 2796:     */   public Calendar Y()
/* 2797:     */   {
/* 2798:2809 */     if (K() % 600L == 0L) {
/* 2799:2810 */       this.J.setTimeInMillis(MinecraftServer.ax());
/* 2800:     */     }
/* 2801:2812 */     return this.J;
/* 2802:     */   }
/* 2803:     */   
/* 2804:     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, NBTTagCompound paramfn) {}
/* 2805:     */   
/* 2806:     */   public bsd Z()
/* 2807:     */   {
/* 2808:2819 */     return this.C;
/* 2809:     */   }
/* 2810:     */   
/* 2811:     */   public void e(BlockPosition paramdt, ProtoBlock paramatr)
/* 2812:     */   {
/* 2813:2823 */     for (EnumDirection localej : en.HORIZONTAL)
/* 2814:     */     {
/* 2815:2824 */       BlockPosition localdt = paramdt.a(localej);
/* 2816:2826 */       if (e(localdt))
/* 2817:     */       {
/* 2818:2827 */         Block localbec = getBlock(localdt);
/* 2819:2828 */         if (BlockList.cj.e(localbec.getProto()))
/* 2820:     */         {
/* 2821:2829 */           localbec.getProto().a(this, localdt, localbec, paramatr);
/* 2822:     */         }
/* 2823:2830 */         else if (localbec.getProto().blocksMovement())
/* 2824:     */         {
/* 2825:2831 */           localdt = localdt.a(localej);
/* 2826:2832 */           localbec = getBlock(localdt);
/* 2827:2834 */           if (BlockList.cj.e(localbec.getProto())) {
/* 2828:2835 */             localbec.getProto().a(this, localdt, localbec, paramatr);
/* 2829:     */           }
/* 2830:     */         }
/* 2831:     */       }
/* 2832:     */     }
/* 2833:     */   }
/* 2834:     */   
/* 2835:     */   public vu E(BlockPosition paramdt)
/* 2836:     */   {
/* 2837:2843 */     long l1 = 0L;
/* 2838:2844 */     float f1 = 0.0F;
/* 2839:2845 */     if (e(paramdt))
/* 2840:     */     {
/* 2841:2846 */       f1 = y();
/* 2842:2847 */       l1 = getChunk(paramdt).w();
/* 2843:     */     }
/* 2844:2850 */     return new vu(getDifficulty(), L(), l1, f1);
/* 2845:     */   }
/* 2846:     */   
/* 2847:     */   public EnumDifficulty getDifficulty()
/* 2848:     */   {
/* 2849:2854 */     return getWorldInfo().y();
/* 2850:     */   }
/* 2851:     */   
/* 2852:     */   public int ab()
/* 2853:     */   {
/* 2854:2858 */     return this.d;
/* 2855:     */   }
/* 2856:     */   
/* 2857:     */   public void b(int paramInt)
/* 2858:     */   {
/* 2859:2862 */     this.d = paramInt;
/* 2860:     */   }
/* 2861:     */   
/* 2862:     */   public int ac()
/* 2863:     */   {
/* 2864:2866 */     return this.I;
/* 2865:     */   }
/* 2866:     */   
/* 2867:     */   public void c(int paramInt)
/* 2868:     */   {
/* 2869:2870 */     this.I = paramInt;
/* 2870:     */   }
/* 2871:     */   
/* 2872:     */   public boolean ad()
/* 2873:     */   {
/* 2874:2874 */     return this.y;
/* 2875:     */   }
/* 2876:     */   
/* 2877:     */   public VillageManager getVillageManager()
/* 2878:     */   {
/* 2879:2878 */     return this.villageManager;
/* 2880:     */   }
/* 2881:     */   
/* 2882:     */   public bfb af()
/* 2883:     */   {
/* 2884:2882 */     return this.M;
/* 2885:     */   }
/* 2886:     */   
/* 2887:     */   public boolean c(int paramInt1, int paramInt2)
/* 2888:     */   {
/* 2889:2890 */     BlockPosition localdt = getWorldSpawn();
/* 2890:2891 */     int i1 = paramInt1 * 16 + 8 - localdt.getX();
/* 2891:2892 */     int i2 = paramInt2 * 16 + 8 - localdt.getZ();
/* 2892:2893 */     int i3 = 128;
/* 2893:2894 */     return (i1 >= -i3) && (i1 <= i3) && (i2 >= -i3) && (i2 <= i3);
/* 2894:     */   }
/* 2895:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqu
 * JD-Core Version:    0.7.0.1
 */
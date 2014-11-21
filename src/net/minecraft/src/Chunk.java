package net.minecraft.src;
/*    1:     */ import com.google.common.base.Predicate;
/*    2:     */ import com.google.common.collect.Maps;
/*    3:     */ import com.google.common.collect.Queues;

/*    4:     */ import java.util.Arrays;
/*    6:     */ import java.util.Iterator;
/*    7:     */ import java.util.List;
/*    8:     */ import java.util.Map;
/*    9:     */ import java.util.Random;
/*   10:     */ import java.util.concurrent.ConcurrentLinkedQueue;

/*   11:     */ import org.apache.logging.log4j.LogManager;
/*   12:     */ import org.apache.logging.log4j.Logger;
/*   13:     */ 
/*   14:     */ public class Chunk
/*   15:     */ {
/*   16:  42 */   private static final Logger c = LogManager.getLogger();
/*   17:  46 */   private final ExtendedBlockStorage[] storageArrays = new ExtendedBlockStorage[16];
/*   18:  47 */   private final byte[] blockBiomeArray = new byte[256];
/*   19:  48 */   private final int[] precipationHeightMap = new int[256];
/*   20:  49 */   private final boolean[] updateSkylightColumns = new boolean[256];
/*   21:     */   private boolean h;
/*   22:     */   private final World world;
/*   23:     */   private final int[] heightMap;
/*   24:     */   public final int x;
/*   25:     */   public final int z;
/*   26:     */   private boolean isGapLightingUpdated;
/*   27:  56 */   private final Map<BlockPosition,bcm> l = Maps.newHashMap();
/*   28:     */   private final MyList<Entity>[] EntityLists;
/*   29:     */   private boolean n;
/*   30:     */   private boolean o;
/*   31:     */   private boolean p;
/*   32:     */   private boolean isModified;
/*   33:     */   private boolean r;
/*   34:     */   private long s;
/*   35:     */   private int minHeight;
/*   36:     */   private long u;
/*   37:  69 */   private int v = 4096;
/*   38:  71 */   private ConcurrentLinkedQueue<BlockPosition> w = Queues.newConcurrentLinkedQueue();
/*   39:     */   
/*   40:     */   @SuppressWarnings("unchecked")
				  public Chunk(World world, int x, int z)
/*   41:     */   {
/*   42:  74 */     this.EntityLists = ((MyList<Entity>[])new MyList<?>[16]);
/*   43:  75 */     this.world = world;
/*   44:  76 */     this.x = x;
/*   45:  77 */     this.z = z;
/*   46:  78 */     this.heightMap = new int[256];
/*   47:  79 */     for (int i1 = 0; i1 < this.EntityLists.length; i1++) {
/*   48:  80 */       this.EntityLists[i1] = new MyList<Entity>(Entity.class);
/*   49:     */     }
/*   50:  82 */     Arrays.fill(this.precipationHeightMap, -999);
/*   51:  83 */     Arrays.fill(this.blockBiomeArray, (byte)-1);
/*   52:     */   }
/*   53:     */   
/*   54:     */   public Chunk(World paramaqu, bgk parambgk, int paramInt1, int paramInt2)
/*   55:     */   {
/*   56:  87 */     this(paramaqu, paramInt1, paramInt2);
/*   57:     */     
/*   58:  89 */     int i1 = 256;
/*   59:  90 */     boolean bool = !paramaqu.t.o();
/*   60:  91 */     for (int i2 = 0; i2 < 16; i2++) {
/*   61:  92 */       for (int i3 = 0; i3 < 16; i3++) {
/*   62:  93 */         for (int i4 = 0; i4 < i1; i4++)
/*   63:     */         {
/*   64:  94 */           int i5 = i2 * i1 * 16 | i3 * i1 | i4;
/*   65:  95 */           Block localbec = parambgk.a(i5);
/*   66:  97 */           if (localbec.getProto().getMaterial() != Material.air)
/*   67:     */           {
/*   68: 101 */             int i6 = i4 >> 4;
/*   69: 102 */             if (this.storageArrays[i6] == null) {
/*   70: 103 */               this.storageArrays[i6] = new ExtendedBlockStorage(i6 << 4, bool);
/*   71:     */             }
/*   72: 105 */             this.storageArrays[i6].a(i2, i4 & 0xF, i3, localbec);
/*   73:     */           }
/*   74:     */         }
/*   75:     */       }
/*   76:     */     }
/*   77:     */   }
/*   78:     */   
/*   79:     */   public boolean isAtLocation(int paramInt1, int paramInt2)
/*   80:     */   {
/*   81: 112 */     return (paramInt1 == this.x) && (paramInt2 == this.z);
/*   82:     */   }
/*   83:     */   
/*   84:     */   public int getHeight(BlockPosition paramdt)
/*   85:     */   {
/*   86: 116 */     return getHeight(paramdt.getX() & 0xF, paramdt.getZ() & 0xF);
/*   87:     */   }
/*   88:     */   
/*   89:     */   public int getHeight(int paramInt1, int paramInt2)
/*   90:     */   {
/*   91: 120 */     return this.heightMap[(paramInt2 << 4 | paramInt1)];
/*   92:     */   }
/*   93:     */   
/*   94:     */   public int getTopFilledSegment()
/*   95:     */   {
/*   96: 135 */     for (int i1 = this.storageArrays.length - 1; i1 >= 0; i1--) {
/*   97: 136 */       if (this.storageArrays[i1] != null) {
/*   98: 137 */         return this.storageArrays[i1].getY();
/*   99:     */       }
/*  100:     */     }
/*  101: 140 */     return 0;
/*  102:     */   }
/*  103:     */   
/*  104:     */   public ExtendedBlockStorage[] getBlockStorageArray()
/*  105:     */   {
/*  106: 144 */     return this.storageArrays;
/*  107:     */   }
/*  108:     */   
/*  109:     */   protected void generateHeightMap()
/*  110:     */   {
/*  111: 148 */     int top = getTopFilledSegment();
/*  112: 149 */     this.minHeight = 2147483647;
/*  113: 151 */     for (int x = 0; x < 16; x++) {
/*  114: 152 */       for (int z = 0; z < 16; z++)
/*  115:     */       {
/*  116: 153 */         this.precipationHeightMap[(x + (z << 4))] = -999;
/*  117: 155 */         for (int y = top + 16; y > 0; y--)
/*  118:     */         {
/*  119: 156 */           ProtoBlock block = getBlock(x, y - 1, z);
/*  120: 157 */           if (block.getLightOpacity() != 0)
/*  121:     */           {
/*  122: 158 */             this.heightMap[(z << 4 | x)] = y;
/*  123: 159 */             if (y >= this.minHeight) {
/*  124:     */               break;
/*  125:     */             }
/*  126: 160 */             this.minHeight = y; break;
/*  127:     */           }
/*  128:     */         }
/*  129:     */       }
/*  130:     */     }
/*  131: 168 */     this.isModified = true;
/*  132:     */   }
/*  133:     */   
/*  134:     */   public void generateSkylightMap()
/*  135:     */   {
/*  136: 172 */     int top = getTopFilledSegment();
/*  137: 173 */     this.minHeight = 2147483647;
/*  138: 175 */     for (int x = 0; x < 16; x++) {
/*  139: 176 */       for (int z = 0; z < 16; z++)
/*  140:     */       {
/*  141: 177 */         this.precipationHeightMap[(x + (z << 4))] = -999;
/*  142: 179 */         for (int y = top + 16; y > 0; y--) {
/*  143: 180 */           if (getBlockLightOpacity(x, y - 1, z) != 0)
/*  144:     */           {
/*  145: 181 */             this.heightMap[(z << 4 | x)] = y;
/*  146: 182 */             if (y >= this.minHeight) {
/*  147:     */               break;
/*  148:     */             }
/*  149: 183 */             this.minHeight = y; break;
/*  150:     */           }
/*  151:     */         }
/*  152: 189 */         if (!this.world.t.o())
/*  153:     */         {
/*  154: 190 */           int i4 = 15;
/*  155: 191 */           int i5 = top + 16 - 1;
/*  156:     */           do
/*  157:     */           {
/*  158: 193 */             int i6 = getBlockLightOpacity(x, i5, z);
/*  159: 194 */             if ((i6 == 0) && (i4 != 15)) {
/*  160: 195 */               i6 = 1;
/*  161:     */             }
/*  162: 197 */             i4 -= i6;
/*  163: 199 */             if (i4 > 0)
/*  164:     */             {
/*  165: 200 */               ExtendedBlockStorage localbfm = this.storageArrays[(i5 >> 4)];
/*  166: 201 */               if (localbfm != null)
/*  167:     */               {
/*  168: 202 */                 localbfm.a(x, i5 & 0xF, z, i4);
/*  169: 203 */                 this.world.n(new BlockPosition((this.x << 4) + x, i5, (this.z << 4) + z));
/*  170:     */               }
/*  171:     */             }
/*  172: 206 */             i5--;
/*  173: 207 */           } while ((i5 > 0) && (i4 > 0));
/*  174:     */         }
/*  175:     */       }
/*  176:     */     }
/*  177: 212 */     this.isModified = true;
/*  178:     */   }
/*  179:     */   
/*  180:     */   private void propagateSkylightOcclusion(int paramInt1, int paramInt2)
/*  181:     */   {
/*  182: 216 */     this.updateSkylightColumns[(paramInt1 + paramInt2 * 16)] = true;
/*  183: 217 */     this.isGapLightingUpdated = true;
/*  184:     */   }
/*  185:     */   
/*  186:     */   private void updateSkylight_do(boolean paramBoolean)
/*  187:     */   {
/*  188: 223 */     this.world.profiler.a("recheckGaps");
/*  189: 224 */     if (this.world.a(new BlockPosition(this.x * 16 + 8, 0, this.z * 16 + 8), 16))
/*  190:     */     {
/*  191: 225 */       for (int i1 = 0; i1 < 16; i1++) {
/*  192: 226 */         for (int i2 = 0; i2 < 16; i2++) {
/*  193: 227 */           if (this.updateSkylightColumns[(i1 + i2 * 16)] != false) // != 0
/*  194:     */           {
/*  195: 228 */             this.updateSkylightColumns[(i1 + i2 * 16)] = false;
/*  196: 229 */             int i3 = getHeight(i1, i2);
/*  197: 230 */             int i4 = this.x * 16 + i1;
/*  198: 231 */             int i5 = this.z * 16 + i2;
/*  199:     */             
/*  200: 233 */             int i6 = 2147483647;
/*  206:     */             EnumDirection localej;
/*  201: 234 */             for (Iterator<EnumDirection> localIterator = en.HORIZONTAL.iterator(); localIterator.hasNext();)
/*  202:     */             {
/*  203: 234 */               localej = localIterator.next();
/*  204: 235 */               i6 = Math.min(i6, this.world.b(i4 + localej.g(), i5 + localej.i()));
/*  205:     */             }
/*  207: 238 */             checkSkylightNeighborHeight(i4, i5, i6);
/*  208: 239 */             for (Iterator<EnumDirection> localIterator = en.HORIZONTAL.iterator(); localIterator.hasNext();)
/*  209:     */             {
/*  210: 239 */               localej = localIterator.next();
/*  211: 240 */               checkSkylightNeighborHeight(i4 + localej.g(), i5 + localej.i(), i3);
/*  212:     */             }
/*  213: 243 */             if (paramBoolean)
/*  214:     */             {
/*  215: 244 */               this.world.profiler.b();
/*  216: 245 */               return;
/*  217:     */             }
/*  218:     */           }
/*  219:     */         }
/*  220:     */       }
/*  221: 250 */       this.isGapLightingUpdated = false;
/*  222:     */     }
/*  223: 252 */     this.world.profiler.b();
/*  224:     */   }
/*  225:     */   
/*  226:     */   private void checkSkylightNeighborHeight(int paramInt1, int paramInt2, int paramInt3)
/*  227:     */   {
/*  228: 256 */     int i1 = this.world.m(new BlockPosition(paramInt1, 0, paramInt2)).getY();
/*  229: 258 */     if (i1 > paramInt3) {
/*  230: 259 */       updateSkylightNeighborHeight(paramInt1, paramInt2, paramInt3, i1 + 1);
/*  231: 260 */     } else if (i1 < paramInt3) {
/*  232: 261 */       updateSkylightNeighborHeight(paramInt1, paramInt2, i1, paramInt3 + 1);
/*  233:     */     }
/*  234:     */   }
/*  235:     */   
/*  236:     */   private void updateSkylightNeighborHeight(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  237:     */   {
/*  238: 266 */     if ((paramInt4 > paramInt3) && 
/*  239: 267 */       (this.world.a(new BlockPosition(paramInt1, 0, paramInt2), 16)))
/*  240:     */     {
/*  241: 268 */       for (int i1 = paramInt3; i1 < paramInt4; i1++) {
/*  242: 269 */         this.world.c(EnumSkyBlock.SKY, new BlockPosition(paramInt1, i1, paramInt2));
/*  243:     */       }
/*  244: 271 */       this.isModified = true;
/*  245:     */     }
/*  246:     */   }
/*  247:     */   
/*  248:     */   private void relightBlock(int paramInt1, int paramInt2, int paramInt3)
/*  249:     */   {
/*  250: 277 */     int i1 = this.heightMap[(paramInt3 << 4 | paramInt1)] & 0xFF;
/*  251: 278 */     int i2 = i1;
/*  252: 279 */     if (paramInt2 > i1) {
/*  253: 280 */       i2 = paramInt2;
/*  254:     */     }
/*  255: 283 */     while ((i2 > 0) && (getBlockLightOpacity(paramInt1, i2 - 1, paramInt3) == 0)) {
/*  256: 284 */       i2--;
/*  257:     */     }
/*  258: 286 */     if (i2 == i1) {
/*  259: 287 */       return;
/*  260:     */     }
/*  261: 290 */     this.world.a(paramInt1 + this.x * 16, paramInt3 + this.z * 16, i2, i1);
/*  262: 291 */     this.heightMap[(paramInt3 << 4 | paramInt1)] = i2;
/*  263:     */     
/*  264: 293 */     int i3 = this.x * 16 + paramInt1;
/*  265: 294 */     int i4 = this.z * 16 + paramInt3;
				    int i5;
				    int i6;
/*  266: 295 */     if (!this.world.t.o())
/*  267:     */     {
/*  268:     */       ExtendedBlockStorage localbfm1;
/*  269: 296 */       if (i2 < i1) {
/*  270: 297 */         for (i5 = i2; i5 < i1; i5++)
/*  271:     */         {
/*  272: 298 */           localbfm1 = this.storageArrays[(i5 >> 4)];
/*  273: 299 */           if (localbfm1 != null)
/*  274:     */           {
/*  275: 300 */             localbfm1.a(paramInt1, i5 & 0xF, paramInt3, 15);
/*  276: 301 */             this.world.n(new BlockPosition((this.x << 4) + paramInt1, i5, (this.z << 4) + paramInt3));
/*  277:     */           }
/*  278:     */         }
/*  279:     */       } else {
/*  280: 305 */         for (i5 = i1; i5 < i2; i5++)
/*  281:     */         {
/*  282: 306 */           localbfm1 = this.storageArrays[(i5 >> 4)];
/*  283: 307 */           if (localbfm1 != null)
/*  284:     */           {
/*  285: 308 */             localbfm1.a(paramInt1, i5 & 0xF, paramInt3, 0);
/*  286: 309 */             this.world.n(new BlockPosition((this.x << 4) + paramInt1, i5, (this.z << 4) + paramInt3));
/*  287:     */           }
/*  288:     */         }
/*  289:     */       }
/*  290: 314 */       i5 = 15;
/*  291: 315 */       while ((i2 > 0) && (i5 > 0))
/*  292:     */       {
/*  293: 316 */         i2--;
/*  294: 317 */         i6 = getBlockLightOpacity(paramInt1, i2, paramInt3);
/*  295: 318 */         if (i6 == 0) {
/*  296: 319 */           i6 = 1;
/*  297:     */         }
/*  298: 321 */         i5 -= i6;
/*  299: 322 */         if (i5 < 0) {
/*  300: 323 */           i5 = 0;
/*  301:     */         }
/*  302: 326 */         ExtendedBlockStorage localbfm2 = this.storageArrays[(i2 >> 4)];
/*  303: 327 */         if (localbfm2 != null) {
/*  304: 328 */           localbfm2.a(paramInt1, i2 & 0xF, paramInt3, i5);
/*  305:     */         }
/*  306:     */       }
/*  307:     */     }
/*  308: 332 */     i5 = this.heightMap[(paramInt3 << 4 | paramInt1)];
/*  309: 333 */     i6 = i1;
/*  310: 334 */     int i7 = i5;
/*  311: 335 */     if (i7 < i6)
/*  312:     */     {
/*  313: 336 */       int i8 = i6;
/*  314: 337 */       i6 = i7;
/*  315: 338 */       i7 = i8;
/*  316:     */     }
/*  317: 340 */     if (i5 < this.minHeight) {
/*  318: 341 */       this.minHeight = i5;
/*  319:     */     }
/*  320: 343 */     if (!this.world.t.o())
/*  321:     */     {
/*  322: 344 */       for (EnumDirection localej : en.HORIZONTAL) {
/*  323: 345 */         updateSkylightNeighborHeight(i3 + localej.g(), i4 + localej.i(), i6, i7);
/*  324:     */       }
/*  325: 347 */       updateSkylightNeighborHeight(i3, i4, i6, i7);
/*  326:     */     }
/*  327: 350 */     this.isModified = true;
/*  328:     */   }
/*  329:     */   
/*  330:     */   public int b(BlockPosition paramdt)
/*  331:     */   {
/*  332: 361 */     return getBlock(paramdt).getLightOpacity();
/*  333:     */   }
/*  334:     */   
/*  335:     */   private int getBlockLightOpacity(int paramInt1, int paramInt2, int paramInt3)
/*  336:     */   {
/*  337: 365 */     return getBlock(paramInt1, paramInt2, paramInt3).getLightOpacity();
/*  338:     */   }
/*  339:     */   
/*  340:     */   private ProtoBlock getBlock(int paramInt1, int paramInt2, int paramInt3)
/*  341:     */   {
/*  342: 369 */     ProtoBlock localatr = BlockList.air;
/*  343: 370 */     if ((paramInt2 >= 0) && (paramInt2 >> 4 < this.storageArrays.length))
/*  344:     */     {
/*  345: 371 */       ExtendedBlockStorage localbfm = this.storageArrays[(paramInt2 >> 4)];
/*  346: 372 */       if (localbfm != null) {
/*  347:     */         try
/*  348:     */         {
/*  349: 374 */           localatr = localbfm.b(paramInt1, paramInt2 & 0xF, paramInt3);
/*  350:     */         }
/*  351:     */         catch (Throwable localThrowable)
/*  352:     */         {
/*  353: 376 */           b localb = net.minecraft.src.b.a(localThrowable, "Getting block");
/*  354:     */           
/*  355: 378 */           throw new u(localb);
/*  356:     */         }
/*  357:     */       }
/*  358:     */     }
/*  359: 382 */     return localatr;
/*  360:     */   }
/*  361:     */   
/*  362:     */   public ProtoBlock getBlockAtWorldCoord(int paramInt1, int paramInt2, int paramInt3)
/*  363:     */   {
/*  364:     */     try
/*  365:     */     {
/*  366: 387 */       return getBlock(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*  367:     */     }
/*  368:     */     catch (u localu)
/*  369:     */     {
/*  370: 389 */       j localj = localu.a().a("Block being got");
/*  371: 390 */       localj.a("Location", new bfi(this, paramInt1, paramInt2, paramInt3));
/*  372:     */       
/*  373:     */ 
/*  374:     */ 
/*  375:     */ 
/*  376:     */ 
/*  377: 396 */       throw localu;
/*  378:     */     }
/*  379:     */   }
/*  380:     */   
/*  381:     */   public ProtoBlock getBlock(BlockPosition paramdt)
/*  382:     */   {
/*  383:     */     try
/*  384:     */     {
/*  385: 402 */       return getBlock(paramdt.getX() & 0xF, paramdt.getY(), paramdt.getZ() & 0xF);
/*  386:     */     }
/*  387:     */     catch (u localu)
/*  388:     */     {
/*  389: 404 */       j localj = localu.a().a("Block being got");
/*  390: 405 */       localj.a("Location", new bfj(this, paramdt));
/*  391:     */       
/*  392:     */ 
/*  393:     */ 
/*  394:     */ 
/*  395:     */ 
/*  396: 411 */       throw localu;
/*  397:     */     }
/*  398:     */   }
/*  399:     */   
/*  400:     */   public Block g(BlockPosition paramdt)
/*  401:     */   {
/*  402:     */     
/*  403: 416 */     if (this.world.G() == WorldType.DEBUG_ALL_BLOCK_STATES)
/*  404:     */     {
/*  405: 417 */       Block localObject = null;
/*  406: 418 */       if (paramdt.getY() == 60) {
/*  407: 419 */         localObject = BlockList.barrier.instance();
/*  408:     */       }
/*  409: 421 */       if (paramdt.getY() == 70) {
/*  410: 422 */         localObject = DebugChunkProvider.b(paramdt.getX(), paramdt.getZ());
/*  411:     */       }
/*  412: 424 */       return localObject == null ? BlockList.air.instance() : localObject;
/*  413:     */     }
/*  414:     */     try
/*  415:     */     {
/*  416: 428 */       if ((paramdt.getY() >= 0) && (paramdt.getY() >> 4 < this.storageArrays.length))
/*  417:     */       {
/*  418: 429 */         ExtendedBlockStorage localObject = this.storageArrays[(paramdt.getY() >> 4)];
/*  419: 430 */         if (localObject != null)
/*  420:     */         {
/*  421: 431 */           int i1 = paramdt.getX() & 0xF;
/*  422: 432 */           int i2 = paramdt.getY() & 0xF;
/*  423: 433 */           int i3 = paramdt.getZ() & 0xF;
/*  424: 434 */           return localObject.a(i1, i2, i3);
/*  425:     */         }
/*  426:     */       }
/*  427: 437 */       return BlockList.air.instance();
/*  428:     */     }
/*  429:     */     catch (Throwable localThrowable)
/*  430:     */     {
/*  431: 439 */       b localb = net.minecraft.src.b.a(localThrowable, "Getting block state");
/*  432: 440 */       j localj = localb.a("Block being got");
/*  433: 441 */       localj.a("Location", new bfk(this, paramdt));
/*  434:     */       
/*  435:     */ 
/*  436:     */ 
/*  437:     */ 
/*  438:     */ 
/*  439: 447 */       throw new u(localb);
/*  440:     */     }
/*  441:     */   }
/*  442:     */   
/*  443:     */   private int g(int paramInt1, int paramInt2, int paramInt3)
/*  444:     */   {
/*  445: 452 */     if (paramInt2 >> 4 >= this.storageArrays.length) {
/*  446: 453 */       return 0;
/*  447:     */     }
/*  448: 455 */     ExtendedBlockStorage localbfm = this.storageArrays[(paramInt2 >> 4)];
/*  449: 456 */     if (localbfm != null) {
/*  450: 457 */       return localbfm.c(paramInt1, paramInt2 & 0xF, paramInt3);
/*  451:     */     }
/*  452: 459 */     return 0;
/*  453:     */   }
/*  454:     */   
/*  455:     */   public int c(BlockPosition paramdt)
/*  456:     */   {
/*  457: 467 */     return g(paramdt.getX() & 0xF, paramdt.getY(), paramdt.getZ() & 0xF);
/*  458:     */   }
/*  459:     */   
/*  460:     */   public Block a(BlockPosition paramdt, Block parambec)
/*  461:     */   {
/*  462: 472 */     int i1 = paramdt.getX() & 0xF;
/*  463: 473 */     int i2 = paramdt.getY();
/*  464: 474 */     int i3 = paramdt.getZ() & 0xF;
/*  465:     */     
/*  466: 476 */     int i4 = i3 << 4 | i1;
/*  467: 478 */     if (i2 >= this.precipationHeightMap[i4] - 1) {
/*  468: 479 */       this.precipationHeightMap[i4] = -999;
/*  469:     */     }
/*  470: 482 */     int i5 = this.heightMap[i4];
/*  471:     */     
/*  472: 484 */     Block localbec = g(paramdt);
/*  473: 486 */     if (localbec == parambec) {
/*  474: 487 */       return null;
/*  475:     */     }
/*  476: 490 */     ProtoBlock localatr1 = parambec.getProto();
/*  477: 491 */     ProtoBlock localatr2 = localbec.getProto();
/*  478:     */     
/*  479: 493 */     ExtendedBlockStorage localbfm = this.storageArrays[(i2 >> 4)];
/*  480: 494 */     int i6 = 0;
/*  481: 495 */     if (localbfm == null)
/*  482:     */     {
/*  483: 497 */       if (localatr1 == BlockList.air) {
/*  484: 498 */         return null;
/*  485:     */       }
/*  486: 501 */       localbfm = this.storageArrays[(i2 >> 4)] = new ExtendedBlockStorage(i2 >> 4 << 4, !this.world.t.o()); // TODO: BROKEN
/*  487: 502 */       i6 = i2 >= i5 ? 1 : 0;
/*  488:     */     }
/*  489: 505 */     localbfm.a(i1, i2 & 0xF, i3, parambec);
/*  490: 507 */     if (localatr2 != localatr1) {
/*  491: 508 */       if (!this.world.isClient) {
/*  492: 509 */         localatr2.b(this.world, paramdt, localbec);
/*  493: 510 */       } else if ((localatr2 instanceof avs)) {
/*  494: 511 */         this.world.t(paramdt);
/*  495:     */       }
/*  496:     */     }
/*  497: 515 */     if (localbfm.b(i1, i2 & 0xF, i3) != localatr1) {
/*  498: 516 */       return null;
/*  499:     */     }
/*  500: 519 */     if (i6 != 0)
/*  501:     */     {
/*  502: 520 */       generateSkylightMap();
/*  503:     */     }
/*  504:     */     else
/*  505:     */     {
/*  506: 522 */       int i7 = localatr1.getLightOpacity();
/*  507: 523 */       int i8 = localatr2.getLightOpacity();
/*  508: 525 */       if (i7 > 0)
/*  509:     */       {
/*  510: 526 */         if (i2 >= i5) {
/*  511: 527 */           relightBlock(i1, i2 + 1, i3);
/*  512:     */         }
/*  513:     */       }
/*  514: 530 */       else if (i2 == i5 - 1) {
/*  515: 531 */         relightBlock(i1, i2, i3);
/*  516:     */       }
/*  517: 535 */       if (i7 != i8) {
/*  518: 537 */         if ((i7 < i8) || (a(EnumSkyBlock.SKY, paramdt) > 0) || (a(EnumSkyBlock.BLOCK, paramdt) > 0)) {
/*  519: 538 */           propagateSkylightOcclusion(i1, i3);
/*  520:     */         }
/*  521:     */       }
/*  522:     */     }
/*  523:     */     bcm localbcm;
/*  524: 543 */     if ((localatr2 instanceof avs))
/*  525:     */     {
/*  526: 544 */       localbcm = a(paramdt, bfl.c);
/*  527: 545 */       if (localbcm != null) {
/*  528: 546 */         localbcm.E();
/*  529:     */       }
/*  530:     */     }
/*  531: 550 */     if ((!this.world.isClient) && (localatr2 != localatr1)) {
/*  532: 551 */       localatr1.c(this.world, paramdt, parambec);
/*  533:     */     }
/*  534: 553 */     if ((localatr1 instanceof avs))
/*  535:     */     {
/*  536: 554 */       localbcm = a(paramdt, bfl.c);
/*  537: 555 */       if (localbcm == null)
/*  538:     */       {
/*  539: 556 */         localbcm = ((avs)localatr1).a(this.world, localatr1.c(parambec));
/*  540: 557 */         this.world.a(paramdt, localbcm);
/*  541:     */       }
/*  542: 560 */       if (localbcm != null) {
/*  543: 561 */         localbcm.E();
/*  544:     */       }
/*  545:     */     }
/*  546: 565 */     this.isModified = true;
/*  547: 566 */     return localbec;
/*  548:     */   }
/*  549:     */   
/*  550:     */   public int a(EnumSkyBlock paramarf, BlockPosition paramdt)
/*  551:     */   {
/*  552: 570 */     int i1 = paramdt.getX() & 0xF;
/*  553: 571 */     int i2 = paramdt.getY();
/*  554: 572 */     int i3 = paramdt.getZ() & 0xF;
/*  555:     */     
/*  556: 574 */     ExtendedBlockStorage localbfm = this.storageArrays[(i2 >> 4)];
/*  557: 575 */     if (localbfm == null)
/*  558:     */     {
/*  559: 576 */       if (hasDaylight(paramdt)) {
/*  560: 577 */         return paramarf.c;
/*  561:     */       }
/*  562: 579 */       return 0;
/*  563:     */     }
/*  564: 583 */     if (paramarf == EnumSkyBlock.SKY)
/*  565:     */     {
/*  566: 584 */       if (this.world.t.o()) {
/*  567: 585 */         return 0;
/*  568:     */       }
/*  569: 587 */       return localbfm.d(i1, i2 & 0xF, i3);
/*  570:     */     }
/*  571: 588 */     if (paramarf == EnumSkyBlock.BLOCK) {
/*  572: 589 */       return localbfm.e(i1, i2 & 0xF, i3);
/*  573:     */     }
/*  574: 591 */     return paramarf.c;
/*  575:     */   }
/*  576:     */   
/*  577:     */   public void a(EnumSkyBlock paramarf, BlockPosition paramdt, int paramInt)
/*  578:     */   {
/*  579: 596 */     int i1 = paramdt.getX() & 0xF;
/*  580: 597 */     int i2 = paramdt.getY();
/*  581: 598 */     int i3 = paramdt.getZ() & 0xF;
/*  582:     */     
/*  583: 600 */     ExtendedBlockStorage localbfm = this.storageArrays[(i2 >> 4)];
/*  584: 601 */     if (localbfm == null)
/*  585:     */     {
/*  586: 602 */       localbfm = this.storageArrays[(i2 >> 4)] = new ExtendedBlockStorage(i2 >> 4 << 4, !this.world.t.o()); // TODO: BROKEN
/*  587: 603 */       generateSkylightMap();
/*  588:     */     }
/*  589: 606 */     this.isModified = true;
/*  590: 607 */     if (paramarf == EnumSkyBlock.SKY)
/*  591:     */     {
/*  592: 608 */       if (!this.world.t.o()) {
/*  593: 609 */         localbfm.a(i1, i2 & 0xF, i3, paramInt);
/*  594:     */       }
/*  595:     */     }
/*  596: 611 */     else if (paramarf == EnumSkyBlock.BLOCK) {
/*  597: 612 */       localbfm.b(i1, i2 & 0xF, i3, paramInt);
/*  598:     */     }
/*  599:     */   }
/*  600:     */   
/*  601:     */   public int a(BlockPosition paramdt, int paramInt)
/*  602:     */   {
/*  603: 617 */     int i1 = paramdt.getX() & 0xF;
/*  604: 618 */     int i2 = paramdt.getY();
/*  605: 619 */     int i3 = paramdt.getZ() & 0xF;
/*  606: 620 */     ExtendedBlockStorage localbfm = this.storageArrays[(i2 >> 4)];
/*  607: 621 */     if (localbfm == null)
/*  608:     */     {
/*  609: 622 */       if ((!this.world.t.o()) && (paramInt < EnumSkyBlock.SKY.c)) {
/*  610: 623 */         return EnumSkyBlock.SKY.c - paramInt;
/*  611:     */       }
/*  612: 625 */       return 0;
/*  613:     */     }
/*  614: 628 */     int i4 = this.world.t.o() ? 0 : localbfm.d(i1, i2 & 0xF, i3);
/*  615: 629 */     i4 -= paramInt;
/*  616: 630 */     int i5 = localbfm.e(i1, i2 & 0xF, i3);
/*  617: 631 */     if (i5 > i4) {
/*  618: 632 */       i4 = i5;
/*  619:     */     }
/*  620: 635 */     return i4;
/*  621:     */   }
/*  622:     */   
/*  623:     */   public void addEntity(Entity paramwv)
/*  624:     */   {
/*  625: 639 */     this.r = true;
/*  626:     */     
/*  627: 641 */     int i1 = MathUtils.floor(paramwv.xPos / 16.0D);
/*  628: 642 */     int i2 = MathUtils.floor(paramwv.zPos / 16.0D);
/*  629: 643 */     if ((i1 != this.x) || (i2 != this.z))
/*  630:     */     {
/*  631: 644 */       c.warn("Wrong location! (" + i1 + ", " + i2 + ") should be (" + this.x + ", " + this.z + "), " + paramwv, new Object[] { paramwv });
/*  632:     */       
/*  633: 646 */       paramwv.setDead();
/*  634:     */     }
/*  635: 648 */     int i3 = MathUtils.floor(paramwv.yPos / 16.0D);
/*  636: 649 */     if (i3 < 0) {
/*  637: 650 */       i3 = 0;
/*  638:     */     }
/*  639: 652 */     if (i3 >= this.EntityLists.length) {
/*  640: 653 */       i3 = this.EntityLists.length - 1;
/*  641:     */     }
/*  642: 655 */     paramwv.ad = true;
/*  643: 656 */     paramwv.ae = this.x;
/*  644: 657 */     paramwv.af = i3;
/*  645: 658 */     paramwv.ag = this.z;
/*  646: 659 */     this.EntityLists[i3].add(paramwv);
/*  647:     */   }
/*  648:     */   
/*  649:     */   public void b(Entity paramwv)
/*  650:     */   {
/*  651: 663 */     a(paramwv, paramwv.af);
/*  652:     */   }
/*  653:     */   
/*  654:     */   public void a(Entity paramwv, int paramInt)
/*  655:     */   {
/*  656: 667 */     if (paramInt < 0) {
/*  657: 668 */       paramInt = 0;
/*  658:     */     }
/*  659: 670 */     if (paramInt >= this.EntityLists.length) {
/*  660: 671 */       paramInt = this.EntityLists.length - 1;
/*  661:     */     }
/*  662: 673 */     this.EntityLists[paramInt].remove(paramwv);
/*  663:     */   }
/*  664:     */   
/*  665:     */   public boolean hasDaylight(BlockPosition paramdt)
/*  666:     */   {
/*  667: 677 */     int i1 = paramdt.getX() & 0xF;
/*  668: 678 */     int i2 = paramdt.getY();
/*  669: 679 */     int i3 = paramdt.getZ() & 0xF;
/*  670: 680 */     return i2 >= this.heightMap[(i3 << 4 | i1)];
/*  671:     */   }
/*  672:     */   
/*  673:     */   private bcm i(BlockPosition paramdt)
/*  674:     */   {
/*  675: 685 */     ProtoBlock localatr = getBlock(paramdt);
/*  676: 686 */     if (!localatr.x()) {
/*  677: 687 */       return null;
/*  678:     */     }
/*  679: 690 */     return ((avs)localatr).a(this.world, c(paramdt));
/*  680:     */   }
/*  681:     */   
/*  682:     */   public bcm a(BlockPosition paramdt, bfl parambfl)
/*  683:     */   {
/*  684: 695 */     bcm localbcm = this.l.get(paramdt);
/*  685: 696 */     if (localbcm == null)
/*  686:     */     {
/*  687: 697 */       if (parambfl == bfl.a)
/*  688:     */       {
/*  689: 698 */         localbcm = i(paramdt);
/*  690: 699 */         this.world.a(paramdt, localbcm);
/*  691:     */       }
/*  692: 700 */       else if (parambfl == bfl.b)
/*  693:     */       {
/*  694: 701 */         this.w.add(paramdt);
/*  695:     */       }
/*  696:     */     }
/*  697: 703 */     else if (localbcm.x())
/*  698:     */     {
/*  699: 704 */       this.l.remove(paramdt);
/*  700: 705 */       return null;
/*  701:     */     }
/*  702: 708 */     return localbcm;
/*  703:     */   }
/*  704:     */   
/*  705:     */   public void a(bcm parambcm)
/*  706:     */   {
/*  707: 712 */     a(parambcm.v(), parambcm);
/*  708: 713 */     if (this.h) {
/*  709: 714 */       this.world.a(parambcm);
/*  710:     */     }
/*  711:     */   }
/*  712:     */   
/*  713:     */   public void a(BlockPosition paramdt, bcm parambcm)
/*  714:     */   {
/*  715: 719 */     parambcm.a(this.world);
/*  716: 720 */     parambcm.setPos(paramdt);
/*  717: 722 */     if (!(getBlock(paramdt) instanceof avs)) {
/*  718: 723 */       return;
/*  719:     */     }
/*  720: 725 */     if (this.l.containsKey(paramdt)) {
/*  721: 726 */       ((bcm)this.l.get(paramdt)).y();
/*  722:     */     }
/*  723: 729 */     parambcm.D();
/*  724: 730 */     this.l.put(paramdt, parambcm);
/*  725:     */   }
/*  726:     */   
/*  727:     */   public void e(BlockPosition paramdt)
/*  728:     */   {
/*  729: 734 */     if (this.h)
/*  730:     */     {
/*  731: 735 */       bcm localbcm = (bcm)this.l.remove(paramdt);
/*  732: 736 */       if (localbcm != null) {
/*  733: 737 */         localbcm.y();
/*  734:     */       }
/*  735:     */     }
/*  736:     */   }
/*  737:     */   
/*  738:     */   public void c()
/*  739:     */   {
/*  740: 743 */     this.h = true;
/*  741: 744 */     this.world.a(this.l.values());
/*  742: 745 */     for (int i1 = 0; i1 < this.EntityLists.length; i1++)
/*  743:     */     {
/*  744: 746 */       for (Entity localwv : this.EntityLists[i1]) {
/*  745: 747 */         localwv.ah();
/*  746:     */       }
/*  747: 749 */       this.world.addEntities(this.EntityLists[i1]);
/*  748:     */     }
/*  749:     */   }
/*  750:     */   
/*  751:     */   public void d()
/*  752:     */   {
/*  753: 754 */     this.h = false;
/*  754: 755 */     for (bcm localbcm : this.l.values()) {
/*  755: 756 */       this.world.b(localbcm);
/*  756:     */     }
/*  757: 758 */     for (int i1 = 0; i1 < this.EntityLists.length; i1++) {
/*  758: 759 */       this.world.markEntitiesForRemove(this.EntityLists[i1]);
/*  759:     */     }
/*  760:     */   }
/*  761:     */   
/*  762:     */   public void onModify()
/*  763:     */   {
/*  764: 764 */     this.isModified = true;
/*  765:     */   }
/*  766:     */   
/*  767:     */   public void a(Entity paramwv, AABB parambrt, List<Entity> paramList, Predicate<Entity> paramPredicate)
/*  768:     */   {
/*  769: 768 */     int i1 = MathUtils.floor((parambrt.minY - 2.0D) / 16.0D);
/*  770: 769 */     int i2 = MathUtils.floor((parambrt.maxY + 2.0D) / 16.0D);
/*  771: 770 */     i1 = MathUtils.clamp(i1, 0, this.EntityLists.length - 1);
/*  772: 771 */     i2 = MathUtils.clamp(i2, 0, this.EntityLists.length - 1);
/*  773: 773 */     for (int i3 = i1; i3 <= i2; i3++) {
/*  774: 774 */       for (Entity localwv : this.EntityLists[i3]) {
/*  775: 775 */         if ((localwv != paramwv) && (localwv.getAABB().intersectsWith(parambrt)) && ((paramPredicate == null) || (paramPredicate.apply(localwv))))
/*  776:     */         {
/*  777: 776 */           paramList.add(localwv);
/*  778:     */           
/*  779: 778 */           Entity[] arrayOfwv = localwv.aC();
/*  780: 779 */           if (arrayOfwv != null) {
/*  781: 780 */             for (int i4 = 0; i4 < arrayOfwv.length; i4++)
/*  782:     */             {
/*  783: 781 */               localwv = arrayOfwv[i4];
/*  784: 782 */               if ((localwv != paramwv) && (localwv.getAABB().intersectsWith(parambrt)) && ((paramPredicate == null) || (paramPredicate.apply(localwv)))) {
/*  785: 783 */                 paramList.add(localwv);
/*  786:     */               }
/*  787:     */             }
/*  788:     */           }
/*  789:     */         }
/*  790:     */       }
/*  791:     */     }
/*  792:     */   }
/*  793:     */   
/*  794:     */   public <E extends Entity> void a(Class<E> paramClass, AABB parambrt, List<E> paramList, Predicate<? super E> paramPredicate)
/*  795:     */   {
/*  796: 793 */     int i1 = MathUtils.floor((parambrt.minY - 2.0D) / 16.0D);
/*  797: 794 */     int i2 = MathUtils.floor((parambrt.maxY + 2.0D) / 16.0D);
/*  798: 795 */     i1 = MathUtils.clamp(i1, 0, this.EntityLists.length - 1);
/*  799: 796 */     i2 = MathUtils.clamp(i2, 0, this.EntityLists.length - 1);
/*  800: 798 */     for (int i3 = i1; i3 <= i2; i3++) {
/*  801: 799 */       for (E localwv : this.EntityLists[i3].b(paramClass)) {
/*  802: 800 */         if ((localwv.getAABB().intersectsWith(parambrt)) && (
/*  803: 801 */           (paramPredicate == null) || (paramPredicate.apply(localwv)))) {
/*  804: 802 */           paramList.add(localwv);
/*  805:     */         }
/*  806:     */       }
/*  807:     */     }
/*  808:     */   }
/*  809:     */   
/*  810:     */   public boolean a(boolean paramBoolean)
/*  811:     */   {
/*  812: 810 */     if (paramBoolean)
/*  813:     */     {
/*  814: 811 */       if (((this.r) && (this.world.K() != this.s)) || (this.isModified)) {
/*  815: 812 */         return true;
/*  816:     */       }
/*  817:     */     }
/*  818: 815 */     else if ((this.r) && (this.world.K() >= this.s + 600L)) {
/*  819: 816 */       return true;
/*  820:     */     }
/*  821: 820 */     return this.isModified;
/*  822:     */   }
/*  823:     */   
/*  824:     */   public Random a(long paramLong)
/*  825:     */   {
/*  826: 824 */     return new Random(this.world.J() + this.x * this.x * 4987142 + this.x * 5947611 + this.z * this.z * 4392871L + this.z * 389711 ^ paramLong);
/*  827:     */   }
/*  828:     */   
/*  829:     */   public boolean loaded()
/*  830:     */   {
/*  831: 828 */     return false;
/*  832:     */   }
/*  833:     */   
/*  834:     */   public void a(IChunkProvider parambfe1, IChunkProvider parambfe2, int paramInt1, int paramInt2)
/*  835:     */   {
/*  836: 832 */     boolean bool1 = parambfe1.chunkLoaded(paramInt1, paramInt2 - 1);
/*  837: 833 */     boolean bool2 = parambfe1.chunkLoaded(paramInt1 + 1, paramInt2);
/*  838: 834 */     boolean bool3 = parambfe1.chunkLoaded(paramInt1, paramInt2 + 1);
/*  839: 835 */     boolean bool4 = parambfe1.chunkLoaded(paramInt1 - 1, paramInt2);
/*  840: 836 */     boolean bool5 = parambfe1.chunkLoaded(paramInt1 - 1, paramInt2 - 1);
/*  841: 837 */     boolean bool6 = parambfe1.chunkLoaded(paramInt1 + 1, paramInt2 + 1);
/*  842: 838 */     boolean bool7 = parambfe1.chunkLoaded(paramInt1 - 1, paramInt2 + 1);
/*  843: 839 */     boolean bool8 = parambfe1.chunkLoaded(paramInt1 + 1, paramInt2 - 1);
/*  844: 841 */     if ((bool2) && (bool3) && (bool6)) {
/*  845: 842 */       if (!this.n) {
/*  846: 843 */         parambfe1.a(parambfe2, paramInt1, paramInt2);
/*  847:     */       } else {
/*  848: 845 */         parambfe1.a(parambfe2, this, paramInt1, paramInt2);
/*  849:     */       }
/*  850:     */     }
/*  851:     */     Chunk localbfh;
/*  852: 849 */     if ((bool4) && (bool3) && (bool7))
/*  853:     */     {
/*  854: 850 */       localbfh = parambfe1.getChunk(paramInt1 - 1, paramInt2);
/*  855: 851 */       if (!localbfh.n) {
/*  856: 852 */         parambfe1.a(parambfe2, paramInt1 - 1, paramInt2);
/*  857:     */       } else {
/*  858: 854 */         parambfe1.a(parambfe2, localbfh, paramInt1 - 1, paramInt2);
/*  859:     */       }
/*  860:     */     }
/*  861: 858 */     if ((bool1) && (bool2) && (bool8))
/*  862:     */     {
/*  863: 859 */       localbfh = parambfe1.getChunk(paramInt1, paramInt2 - 1);
/*  864: 860 */       if (!localbfh.n) {
/*  865: 861 */         parambfe1.a(parambfe2, paramInt1, paramInt2 - 1);
/*  866:     */       } else {
/*  867: 863 */         parambfe1.a(parambfe2, localbfh, paramInt1, paramInt2 - 1);
/*  868:     */       }
/*  869:     */     }
/*  870: 867 */     if ((bool5) && (bool1) && (bool4))
/*  871:     */     {
/*  872: 868 */       localbfh = parambfe1.getChunk(paramInt1 - 1, paramInt2 - 1);
/*  873: 869 */       if (!localbfh.n) {
/*  874: 870 */         parambfe1.a(parambfe2, paramInt1 - 1, paramInt2 - 1);
/*  875:     */       } else {
/*  876: 872 */         parambfe1.a(parambfe2, localbfh, paramInt1 - 1, paramInt2 - 1);
/*  877:     */       }
/*  878:     */     }
/*  879:     */   }
/*  880:     */   
/*  881:     */   public BlockPosition h(BlockPosition paramdt)
/*  882:     */   {
/*  883: 878 */     int i1 = paramdt.getX() & 0xF;
/*  884: 879 */     int i2 = paramdt.getZ() & 0xF;
/*  885: 880 */     int i3 = i1 | i2 << 4;
/*  886:     */     
/*  887: 882 */     BlockPosition localdt = new BlockPosition(paramdt.getX(), this.precipationHeightMap[i3], paramdt.getZ());
/*  888: 884 */     if (localdt.getY() == -999)
/*  889:     */     {
/*  890: 885 */       int i4 = getTopFilledSegment() + 15;
/*  891: 886 */       localdt = new BlockPosition(paramdt.getX(), i4, paramdt.getZ());
/*  892:     */       
/*  893: 888 */       int i5 = -1;
/*  894: 889 */       while ((localdt.getY() > 0) && (i5 == -1))
/*  895:     */       {
/*  896: 890 */         ProtoBlock localatr = getBlock(localdt);
/*  897: 891 */         Material localbof = localatr.getMaterial();
/*  898: 892 */         if ((!localbof.c()) && (!localbof.isLiquid())) {
/*  899: 893 */           localdt = localdt.down();
/*  900:     */         } else {
/*  901: 895 */           i5 = localdt.getY() + 1;
/*  902:     */         }
/*  903:     */       }
/*  904: 898 */       this.precipationHeightMap[i3] = i5;
/*  905:     */     }
/*  906: 901 */     return new BlockPosition(paramdt.getX(), this.precipationHeightMap[i3], paramdt.getZ());
/*  907:     */   }
/*  908:     */   
/*  909:     */   public void b(boolean paramBoolean)
/*  910:     */   {
/*  911: 905 */     if ((this.isGapLightingUpdated) && (!this.world.t.o()) && (!paramBoolean)) {
/*  912: 906 */       updateSkylight_do(this.world.isClient);
/*  913:     */     }
/*  914: 908 */     this.p = true;
/*  915: 910 */     if ((!this.o) && (this.n)) {
/*  916: 911 */       n();
/*  917:     */     }
/*  918: 914 */     while (!this.w.isEmpty())
/*  919:     */     {
/*  920: 915 */       BlockPosition localdt = (BlockPosition)this.w.poll();
/*  921: 916 */       if ((a(localdt, bfl.c) == null) && (getBlock(localdt).x()))
/*  922:     */       {
/*  923: 917 */         bcm localbcm = i(localdt);
/*  924: 918 */         this.world.a(localdt, localbcm);
/*  925: 919 */         this.world.b(localdt, localdt);
/*  926:     */       }
/*  927:     */     }
/*  928:     */   }
/*  929:     */   
/*  930:     */   public boolean i()
/*  931:     */   {
/*  932: 925 */     return (this.p) && (this.n) && (this.o);
/*  933:     */   }
/*  934:     */   
/*  935:     */   public ChunkID j()
/*  936:     */   {
/*  937: 929 */     return new ChunkID(this.x, this.z);
/*  938:     */   }
/*  939:     */   
/*  940:     */   public boolean c(int paramInt1, int paramInt2)
/*  941:     */   {
/*  942: 933 */     if (paramInt1 < 0) {
/*  943: 934 */       paramInt1 = 0;
/*  944:     */     }
/*  945: 936 */     if (paramInt2 >= 256) {
/*  946: 937 */       paramInt2 = 255;
/*  947:     */     }
/*  948: 939 */     for (int i1 = paramInt1; i1 <= paramInt2; i1 += 16)
/*  949:     */     {
/*  950: 940 */       ExtendedBlockStorage localbfm = this.storageArrays[(i1 >> 4)];
/*  951: 941 */       if ((localbfm != null) && (!localbfm.a())) {
/*  952: 942 */         return false;
/*  953:     */       }
/*  954:     */     }
/*  955: 945 */     return true;
/*  956:     */   }
/*  957:     */   
/*  958:     */   public void a(ExtendedBlockStorage[] paramArrayOfbfm)
/*  959:     */   {
/*  960: 949 */     if (this.storageArrays.length != paramArrayOfbfm.length)
/*  961:     */     {
/*  962: 950 */       c.warn("Could not set level chunk sections, array length is " + paramArrayOfbfm.length + " instead of " + this.storageArrays.length);
/*  963: 951 */       return;
/*  964:     */     }
/*  965: 954 */     for (int i1 = 0; i1 < this.storageArrays.length; i1++) {
/*  966: 955 */       this.storageArrays[i1] = paramArrayOfbfm[i1];
/*  967:     */     }
/*  968:     */   }
/*  969:     */   
/*  970:     */   public void a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
/*  971:     */   {
/*  972: 960 */     int i1 = 0;
/*  973:     */     
/*  974: 962 */     boolean bool = !this.world.t.o();
/*  975:     */     
/*  976: 964 */     for (int i2 = 0; i2 < this.storageArrays.length; i2++) {
/*  977: 965 */       if ((paramInt & 1 << i2) != 0)
/*  978:     */       {
/*  979: 966 */         if (this.storageArrays[i2] == null) {
/*  980: 967 */           this.storageArrays[i2] = new ExtendedBlockStorage(i2 << 4, bool);
/*  981:     */         }
/*  982: 969 */         char[] localObject = this.storageArrays[i2].g();
/*  983: 970 */         for (int i3 = 0; i3 < localObject.length; i3++)
/*  984:     */         {
/*  985: 971 */           localObject[i3] = ((char)((paramArrayOfByte[(i1 + 1)] & 0xFF) << 8 | paramArrayOfByte[i1] & 0xFF));
/*  986: 972 */           i1 += 2;
/*  987:     */         }
/*  988:     */       }
/*  989: 975 */       else if ((paramBoolean) && (this.storageArrays[i2] != null))
/*  990:     */       {
/*  991: 976 */         this.storageArrays[i2] = null;
/*  992:     */       }
/*  993:     */     }
/*  994: 979 */     for (int i2 = 0; i2 < this.storageArrays.length; i2++) {
/*  995: 980 */       if (((paramInt & 1 << i2) != 0) && (this.storageArrays[i2] != null))
/*  996:     */       {
/*  997: 981 */         bff localObject = this.storageArrays[i2].h();
/*  998: 982 */         System.arraycopy(paramArrayOfByte, i1, ((bff)localObject).a(), 0, ((bff)localObject).a().length);
/*  999: 983 */         i1 += ((bff)localObject).a().length;
/* 1000:     */       }
/* 1001:     */     }
/* 1002: 986 */     if (bool) {
/* 1003: 987 */       for (int i2 = 0; i2 < this.storageArrays.length; i2++) {
/* 1004: 988 */         if (((paramInt & 1 << i2) != 0) && (this.storageArrays[i2] != null))
/* 1005:     */         {
/* 1006: 989 */           bff localObject = this.storageArrays[i2].i();
/* 1007: 990 */           System.arraycopy(paramArrayOfByte, i1, ((bff)localObject).a(), 0, ((bff)localObject).a().length);
/* 1008: 991 */           i1 += ((bff)localObject).a().length;
/* 1009:     */         }
/* 1010:     */       }
/* 1011:     */     }
/* 1012: 995 */     if (paramBoolean)
/* 1013:     */     {
/* 1014: 996 */       System.arraycopy(paramArrayOfByte, i1, this.blockBiomeArray, 0, this.blockBiomeArray.length);
/* 1015: 997 */       i1 += this.blockBiomeArray.length;
/* 1016:     */     }
/* 1017:1000 */     for (int i2 = 0; i2 < this.storageArrays.length; i2++) {
/* 1018:1001 */       if ((this.storageArrays[i2] != null) && ((paramInt & 1 << i2) != 0)) {
/* 1019:1002 */         this.storageArrays[i2].e();
/* 1020:     */       }
/* 1021:     */     }
/* 1022:1006 */     this.o = true;
/* 1023:1007 */     this.n = true;
/* 1024:1008 */     generateHeightMap();
/* 1025:1009 */     for (Iterator<bcm> localIterator = this.l.values().iterator(); localIterator.hasNext();)
/* 1026:     */     {
/* 1027:1009 */       bcm localObject = localIterator.next();
/* 1028:1010 */       localObject.E();
/* 1029:     */     }
/* 1030:     */   }
/* 1031:     */   
/* 1032:     */   public arm a(BlockPosition paramdt, arz paramarz)
/* 1033:     */   {
/* 1034:1015 */     int i1 = paramdt.getX() & 0xF;
/* 1035:1016 */     int i2 = paramdt.getZ() & 0xF;
/* 1036:     */     
/* 1037:1018 */     int i3 = this.blockBiomeArray[(i2 << 4 | i1)] & 0xFF;
/* 1038:1019 */     if (i3 == 255)
/* 1039:     */     {
/* 1040:1020 */       arm localarm = paramarz.a(paramdt, arm.q);
/* 1041:1021 */       i3 = localarm.az;
/* 1042:1022 */       this.blockBiomeArray[(i2 << 4 | i1)] = ((byte)(i3 & 0xFF));
/* 1043:     */     }
/* 1044:1024 */     arm localarm = arm.e(i3);
/* 1045:1025 */     if (localarm == null) {
/* 1046:1026 */       return arm.q;
/* 1047:     */     }
/* 1048:1028 */     return localarm;
/* 1049:     */   }
/* 1050:     */   
/* 1051:     */   public byte[] k()
/* 1052:     */   {
/* 1053:1032 */     return this.blockBiomeArray;
/* 1054:     */   }
/* 1055:     */   
/* 1056:     */   public void a(byte[] paramArrayOfByte)
/* 1057:     */   {
/* 1058:1036 */     if (this.blockBiomeArray.length != paramArrayOfByte.length)
/* 1059:     */     {
/* 1060:1037 */       c.warn("Could not set level chunk biomes, array length is " + paramArrayOfByte.length + " instead of " + this.blockBiomeArray.length);
/* 1061:1038 */       return;
/* 1062:     */     }
/* 1063:1041 */     for (int i1 = 0; i1 < this.blockBiomeArray.length; i1++) {
/* 1064:1042 */       this.blockBiomeArray[i1] = paramArrayOfByte[i1];
/* 1065:     */     }
/* 1066:     */   }
/* 1067:     */   
/* 1068:     */   public void l()
/* 1069:     */   {
/* 1070:1047 */     this.v = 0;
/* 1071:     */   }
/* 1072:     */   
/* 1073:     */   public void m()
/* 1074:     */   {
/* 1075:1051 */     BlockPosition localdt1 = new BlockPosition(this.x << 4, 0, this.z << 4);
/* 1076:1052 */     for (int i1 = 0; i1 < 8; i1++)
/* 1077:     */     {
/* 1078:1053 */       if (this.v >= 4096) {
/* 1079:1054 */         return;
/* 1080:     */       }
/* 1081:1057 */       int i2 = this.v % 16;
/* 1082:1058 */       int i3 = this.v / 16 % 16;
/* 1083:1059 */       int i4 = this.v / 256;
/* 1084:1060 */       this.v += 1;
/* 1085:1062 */       for (int i5 = 0; i5 < 16; i5++)
/* 1086:     */       {
/* 1087:1063 */         BlockPosition localdt2 = localdt1.offset(i3, (i2 << 4) + i5, i4);
/* 1088:1064 */         int i6 = (i5 == 0) || (i5 == 15) || (i3 == 0) || (i3 == 15) || (i4 == 0) || (i4 == 15) ? 1 : 0;
/* 1089:1066 */         if (((this.storageArrays[i2] == null) && (i6 != 0)) || ((this.storageArrays[i2] != null) && (this.storageArrays[i2].b(i3, i5, i4).getMaterial() == Material.air)))
/* 1090:     */         {
/* 1091:1067 */           for (EnumDirection localej : EnumDirection.values())
/* 1092:     */           {
/* 1093:1068 */             BlockPosition localdt3 = localdt2.a(localej);
/* 1094:1069 */             if (this.world.getBlock(localdt3).getProto().p() > 0) {
/* 1095:1070 */               this.world.x(localdt3);
/* 1096:     */             }
/* 1097:     */           }
/* 1098:1073 */           this.world.x(localdt2);
/* 1099:     */         }
/* 1100:     */       }
/* 1101:     */     }
/* 1102:     */   }
/* 1103:     */   
/* 1104:     */   public void n()
/* 1105:     */   {
/* 1106:1080 */     this.n = true;
/* 1107:1081 */     this.o = true;
/* 1108:     */     
/* 1109:1083 */     BlockPosition localdt = new BlockPosition(this.x << 4, 0, this.z << 4);
/* 1110:1085 */     if (!this.world.t.o()) {
/* 1111:1086 */       if (this.world.a(localdt.offset(-1, 0, -1), localdt.offset(16, 63, 16)))
/* 1112:     */       {
/* 1113:1087 */         label116:
						for (int i1 = 0; i1 < 16; i1++) {
/* 1114:1088 */           for (int i2 = 0; i2 < 16; i2++) {
/* 1115:1089 */             if (!e(i1, i2))
/* 1116:     */             {
/* 1117:1090 */               this.o = false;
/* 1118:     */               break label116;
/* 1119:     */             }
/* 1120:     */           }
/* 1121:     */         }
/* 1122:     */         
/* 1123:1095 */         if (this.o)
/* 1124:     */         {
/* 1125:1096 */           for (EnumDirection localej : en.HORIZONTAL)
/* 1126:     */           {
/* 1127:1097 */             int i3 = localej.c() == em.a ? 16 : 1;
/* 1128:1098 */             this.world.getChunk(localdt.offset(localej, i3)).a(localej.d());
/* 1129:     */           }
/* 1130:1100 */           y();
/* 1131:     */         }
/* 1132:     */       }
/* 1133:     */       else
/* 1134:     */       {
/* 1135:1103 */         this.o = false;
/* 1136:     */       }
/* 1137:     */     }
/* 1138:     */   }
/* 1139:     */   
/* 1140:     */   private void y()
/* 1141:     */   {
/* 1142:1109 */     for (int i1 = 0; i1 < this.updateSkylightColumns.length; i1++) {
/* 1143:1110 */       this.updateSkylightColumns[i1] = true;
/* 1144:     */     }
/* 1145:1112 */     updateSkylight_do(false);
/* 1146:     */   }
/* 1147:     */   
/* 1148:     */   private void a(EnumDirection paramej)
/* 1149:     */   {
/* 1150:1116 */     if (!this.n) {
/* 1151:     */       return;
/* 1152:     */     }
/* 1153:     */     int i1;
/* 1154:1120 */     if (paramej == EnumDirection.EAST) {
/* 1155:1121 */       for (i1 = 0; i1 < 16; i1++) {
/* 1156:1122 */         e(15, i1);
/* 1157:     */       }
/* 1158:1124 */     } else if (paramej == EnumDirection.WEST) {
/* 1159:1125 */       for (i1 = 0; i1 < 16; i1++) {
/* 1160:1126 */         e(0, i1);
/* 1161:     */       }
/* 1162:1128 */     } else if (paramej == EnumDirection.SOUTH) {
/* 1163:1129 */       for (i1 = 0; i1 < 16; i1++) {
/* 1164:1130 */         e(i1, 15);
/* 1165:     */       }
/* 1166:1132 */     } else if (paramej == EnumDirection.NORTH) {
/* 1167:1133 */       for (i1 = 0; i1 < 16; i1++) {
/* 1168:1134 */         e(i1, 0);
/* 1169:     */       }
/* 1170:     */     }
/* 1171:     */   }
/* 1172:     */   
/* 1173:     */   private boolean e(int paramInt1, int paramInt2)
/* 1174:     */   {
/* 1175:1140 */     BlockPosition localdt1 = new BlockPosition(this.x << 4, 0, this.z << 4);
/* 1176:1141 */     int i1 = getTopFilledSegment();
/* 1177:     */     
/* 1178:1143 */     int i2 = 0;
/* 1179:1144 */     int i3 = 0;
					int i4;
/* 1180:     */     BlockPosition localdt2;
/* 1181:1146 */     for (i4 = i1 + 16 - 1; (i4 > 63) || ((i4 > 0) && (i3 == 0)); i4--)
/* 1182:     */     {
/* 1183:1147 */       localdt2 = localdt1.offset(paramInt1, i4, paramInt2);
/* 1184:1148 */       int i5 = b(localdt2);
/* 1185:1150 */       if ((i5 == 255) && (i4 < 63)) {
/* 1186:1151 */         i3 = 1;
/* 1187:     */       }
/* 1188:1154 */       if ((i2 == 0) && (i5 > 0)) {
/* 1189:1155 */         i2 = 1;
/* 1190:1156 */       } else if ((i2 != 0) && (i5 == 0)) {
/* 1191:1158 */         if (!this.world.x(localdt2)) {
/* 1192:1159 */           return false;
/* 1193:     */         }
/* 1194:     */       }
/* 1195:     */     }
/* 1196:1165 */     for (; i4 > 0; i4--)
/* 1197:     */     {
/* 1198:1166 */       localdt2 = localdt1.offset(paramInt1, i4, paramInt2);
/* 1199:1167 */       if (getBlock(localdt2).p() > 0) {
/* 1200:1168 */         this.world.x(localdt2);
/* 1201:     */       }
/* 1202:     */     }
/* 1203:1171 */     return true;
/* 1204:     */   }
/* 1205:     */   
/* 1206:     */   public boolean o()
/* 1207:     */   {
/* 1208:1175 */     return this.h;
/* 1209:     */   }
/* 1210:     */   
/* 1211:     */   public void c(boolean paramBoolean)
/* 1212:     */   {
/* 1213:1179 */     this.h = paramBoolean;
/* 1214:     */   }
/* 1215:     */   
/* 1216:     */   public World p()
/* 1217:     */   {
/* 1218:1183 */     return this.world;
/* 1219:     */   }
/* 1220:     */   
/* 1221:     */   public int[] q()
/* 1222:     */   {
/* 1223:1187 */     return this.heightMap;
/* 1224:     */   }
/* 1225:     */   
/* 1226:     */   public void a(int[] paramArrayOfInt)
/* 1227:     */   {
/* 1228:1191 */     if (this.heightMap.length != paramArrayOfInt.length)
/* 1229:     */     {
/* 1230:1192 */       c.warn("Could not set level chunk heightmap, array length is " + paramArrayOfInt.length + " instead of " + this.heightMap.length);
/* 1231:1193 */       return;
/* 1232:     */     }
/* 1233:1196 */     for (int i1 = 0; i1 < this.heightMap.length; i1++) {
/* 1234:1197 */       this.heightMap[i1] = paramArrayOfInt[i1];
/* 1235:     */     }
/* 1236:     */   }
/* 1237:     */   
/* 1238:     */   public Map<BlockPosition,bcm> r()
/* 1239:     */   {
/* 1240:1202 */     return this.l;
/* 1241:     */   }
/* 1242:     */   
/* 1243:     */   public MyList<Entity>[] s()
/* 1244:     */   {
/* 1245:1206 */     return this.EntityLists;
/* 1246:     */   }
/* 1247:     */   
/* 1248:     */   public boolean t()
/* 1249:     */   {
/* 1250:1210 */     return this.n;
/* 1251:     */   }
/* 1252:     */   
/* 1253:     */   public void d(boolean paramBoolean)
/* 1254:     */   {
/* 1255:1214 */     this.n = paramBoolean;
/* 1256:     */   }
/* 1257:     */   
/* 1258:     */   public boolean u()
/* 1259:     */   {
/* 1260:1218 */     return this.o;
/* 1261:     */   }
/* 1262:     */   
/* 1263:     */   public void e(boolean paramBoolean)
/* 1264:     */   {
/* 1265:1222 */     this.o = paramBoolean;
/* 1266:     */   }
/* 1267:     */   
/* 1268:     */   public void f(boolean paramBoolean)
/* 1269:     */   {
/* 1270:1226 */     this.isModified = paramBoolean;
/* 1271:     */   }
/* 1272:     */   
/* 1273:     */   public void g(boolean paramBoolean)
/* 1274:     */   {
/* 1275:1230 */     this.r = paramBoolean;
/* 1276:     */   }
/* 1277:     */   
/* 1278:     */   public void b(long paramLong)
/* 1279:     */   {
/* 1280:1234 */     this.s = paramLong;
/* 1281:     */   }
/* 1282:     */   
/* 1283:     */   public int v()
/* 1284:     */   {
/* 1285:1238 */     return this.minHeight;
/* 1286:     */   }
/* 1287:     */   
/* 1288:     */   public long w()
/* 1289:     */   {
/* 1290:1242 */     return this.u;
/* 1291:     */   }
/* 1292:     */   
/* 1293:     */   public void c(long paramLong)
/* 1294:     */   {
/* 1295:1246 */     this.u = paramLong;
/* 1296:     */   }
/* 1297:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bfh
 * JD-Core Version:    0.7.0.1
 */
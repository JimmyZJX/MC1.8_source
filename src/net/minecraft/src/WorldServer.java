package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import com.google.common.collect.Sets;
/*   4:    */ import com.google.common.util.concurrent.ListenableFuture;

/*   5:    */ import java.util.ArrayList;
/*   6:    */ import java.util.Iterator;
/*   7:    */ import java.util.List;
/*   8:    */ import java.util.Map;
/*   9:    */ import java.util.Random;
/*  10:    */ import java.util.Set;
/*  11:    */ import java.util.TreeSet;
/*  12:    */ import java.util.UUID;

/*  13:    */ import net.minecraft.server.MinecraftServer;

/*  14:    */ import org.apache.logging.log4j.LogManager;
/*  15:    */ import org.apache.logging.log4j.Logger;
/*  16:    */ 
/*  17:    */ public class WorldServer
/*  18:    */   extends World
/*  19:    */   implements vn
/*  20:    */ {
/*  21: 64 */   private static final Logger a = LogManager.getLogger();
/*  22:    */   private final MinecraftServer I;
/*  23:    */   private final qn J;
/*  24:    */   private final qq K;
/*  25: 70 */   private final Set<TickListener> L = Sets.newHashSet();
/*  26: 71 */   private final TreeSet<TickListener> pendingList = new TreeSet<TickListener>();
/*  27: 72 */   private final Map<UUID,Entity> N = Maps.newHashMap();
/*  28:    */   public ServerChunkCache b;
/*  29:    */   public boolean c;
/*  30:    */   private boolean O;
/*  31:    */   private int P;
/*  32:    */   private final arh Q;
/*  33: 78 */   private final MobSpawner spawner = new MobSpawner();
/*  34: 80 */   protected final abk d = new abk(this);
/*  35: 87 */   private qv[] S = { new qv(null), new qv(null) };
/*  36:    */   private int T;
/*  37: 92 */   private static final List<vl> U = Lists.newArrayList(new vl[] { new vl(ItemList.stick, 0, 1, 3, 10), new vl(Item.fromProtoBlock(BlockList.planks), 0, 1, 3, 10), new vl(Item.fromProtoBlock(BlockList.log), 0, 1, 3, 10), new vl(ItemList.t, 0, 1, 1, 3), new vl(ItemList.p, 0, 1, 1, 5), new vl(ItemList.s, 0, 1, 1, 3), new vl(ItemList.o, 0, 1, 1, 5), new vl(ItemList.apple, 0, 2, 3, 5), new vl(ItemList.bread, 0, 2, 3, 3), new vl(Item.fromProtoBlock(BlockList.log2), 0, 1, 3, 10) });
/*  38:    */   
/*  39:    */   public WorldServer(MinecraftServer paramMinecraftServer, bqy parambqy, WorldInfo parambqo, int paramInt, Profiler paramuw)
/*  40:    */   {
/*  41:106 */     super(parambqy, parambqo, bgd.a(paramInt), paramuw, false);
/*  42:107 */     this.I = paramMinecraftServer;
/*  43:108 */     this.J = new qn(this);
/*  44:109 */     this.K = new qq(this);
/*  45:    */     
/*  46:111 */     this.t.a(this);
/*  47:112 */     this.chunkProvider = k();
/*  48:    */     
/*  49:114 */     this.Q = new arh(this);
/*  50:    */     
/*  51:116 */     B();
/*  52:117 */     C();
/*  53:    */     
/*  54:119 */     af().a(paramMinecraftServer.aG());
/*  55:    */   }
/*  56:    */   
/*  57:    */   public World getSelf()
/*  58:    */   {
/*  59:124 */     this.z = new brn(this.w);
/*  60:    */     
/*  61:126 */     String str = VillageManager.a(this.t);
/*  62:127 */     VillageManager localabl = (VillageManager)this.z.a(VillageManager.class, str);
/*  63:128 */     if (localabl == null)
/*  64:    */     {
/*  65:129 */       this.villageManager = new VillageManager(this);
/*  66:130 */       this.z.a(str, this.villageManager);
/*  67:    */     }
/*  68:    */     else
/*  69:    */     {
/*  70:132 */       this.villageManager = localabl;
/*  71:133 */       this.villageManager.setWorld(this);
/*  72:    */     }
/*  73:136 */     this.C = new pk(this.I);
/*  74:    */     
/*  75:138 */     bse localbse = (bse)this.z.a(bse.class, "scoreboard");
/*  76:139 */     if (localbse == null)
/*  77:    */     {
/*  78:140 */       localbse = new bse();
/*  79:141 */       this.z.a("scoreboard", localbse);
/*  80:    */     }
/*  81:143 */     localbse.a(this.C);
/*  82:144 */     ((pk)this.C).a(localbse);
/*  83:    */     
/*  84:146 */     af().c(this.worldInfo.C(), this.worldInfo.D());
/*  85:147 */     af().c(this.worldInfo.I());
/*  86:148 */     af().b(this.worldInfo.H());
/*  87:149 */     af().c(this.worldInfo.J());
/*  88:150 */     af().b(this.worldInfo.K());
/*  89:152 */     if (this.worldInfo.F() > 0L) {
/*  90:153 */       af().a(this.worldInfo.E(), this.worldInfo.G(), this.worldInfo.F());
/*  91:    */     } else {
/*  92:155 */       af().a(this.worldInfo.E());
/*  93:    */     }
/*  94:158 */     return this;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void tick()
/*  98:    */   {
/*  99:163 */     super.tick();
/* 100:164 */     if ((getWorldInfo().isHardcore()) && (getDifficulty() != EnumDifficulty.HARD)) {
/* 101:165 */       getWorldInfo().setDifficulty(EnumDifficulty.HARD);
/* 102:    */     }
/* 103:167 */     this.t.m().b();
/* 104:169 */     if (areAllPlayersAsleep())
/* 105:    */     {
/* 106:170 */       if (getGameRules().getBoolean("doDaylightCycle"))
/* 107:    */       {
/* 108:172 */         long l = this.worldInfo.getTime() + 24000L;
/* 109:173 */         this.worldInfo.setTime(l - l % 24000L);
/* 110:    */       }
/* 111:176 */       wakeAllPlayers();
/* 112:    */     }
/* 113:179 */     this.profiler.a("mobSpawner");
/* 114:180 */     if ((getGameRules().getBoolean("doMobSpawning")) && (this.worldInfo.u() != WorldType.DEBUG_ALL_BLOCK_STATES)) {
/* 115:182 */       this.spawner.work(this, this.spawnMonster, this.spawnPeaceful, this.worldInfo.getRealTime() % 400L == 0L);
/* 116:    */     }
/* 117:184 */     this.profiler.c("chunkSource");
/* 118:185 */     this.chunkProvider.d();
/* 119:186 */     int i = calculateSkylightSubtracted(1.0F);
/* 120:188 */     if (i != ab()) {
/* 121:189 */       b(i);
/* 122:    */     }
/* 123:193 */     this.worldInfo.setRealTime(this.worldInfo.getRealTime() + 1L);
/* 124:194 */     if (getGameRules().getBoolean("doDaylightCycle")) {
/* 125:195 */       this.worldInfo.setTime(this.worldInfo.getTime() + 1L);
/* 126:    */     }
/* 127:198 */     this.profiler.c("tickPending");
/* 128:199 */     tickUpdates(false);
/* 129:    */     
/* 130:201 */     this.profiler.c("tickBlocks");
/* 131:202 */     h();
/* 132:    */     
/* 133:204 */     this.profiler.c("chunkMap");
/* 134:205 */     this.K.b();
/* 135:    */     
/* 136:207 */     this.profiler.c("village");
/* 137:208 */     this.villageManager.tick();
/* 138:209 */     this.d.a();
/* 139:    */     
/* 140:211 */     this.profiler.c("portalForcer");
/* 141:212 */     this.Q.a(K());
/* 142:    */     
/* 143:214 */     this.profiler.b();
/* 144:    */     
/* 145:    */ 
/* 146:217 */     ak();
/* 147:    */   }
/* 148:    */   
/* 149:    */   public SpawnListEntry getSpawnEntry(EnumCreatureType paramxp, BlockPosition paramdt)
/* 150:    */   {
/* 151:222 */     List<SpawnListEntry> localList = N().getSpawnList(paramxp, paramdt);
/* 152:223 */     if ((localList == null) || (localList.isEmpty())) {
/* 153:224 */       return null;
/* 154:    */     }
/* 155:227 */     return WeightedRandom.getRandomItem(this.rng, localList);
/* 156:    */   }
/* 157:    */   
/* 158:    */   public boolean a(EnumCreatureType paramxp, SpawnListEntry paramarq, BlockPosition paramdt)
/* 159:    */   {
/* 160:231 */     List<SpawnListEntry> localList = N().getSpawnList(paramxp, paramdt);
/* 161:232 */     if ((localList == null) || (localList.isEmpty())) {
/* 162:233 */       return false;
/* 163:    */     }
/* 164:235 */     return localList.contains(paramarq);
/* 165:    */   }
/* 166:    */   
/* 167:    */   public void updateAllPlayersSleepingFlag()
/* 168:    */   {
/* 169:240 */     this.O = false;
/* 170:242 */     if (!this.playerList.isEmpty())
/* 171:    */     {
/* 172:243 */       int i = 0;
/* 173:244 */       int j = 0;
/* 174:246 */       for (EntityPlayer localahd : this.playerList) {
/* 175:247 */         if (localahd.v()) {
/* 176:248 */           i++;
/* 177:249 */         } else if (localahd.bI()) {
/* 178:250 */           j++;
/* 179:    */         }
/* 180:    */       }
/* 181:254 */       this.O = ((j > 0) && (j >= this.playerList.size() - i));
/* 182:    */     }
/* 183:    */   }
/* 184:    */   
/* 185:    */   protected void wakeAllPlayers()
/* 186:    */   {
/* 187:259 */     this.O = false;
/* 188:261 */     for (EntityPlayer localahd : this.playerList) {
/* 189:262 */       if (localahd.bI()) {
/* 190:263 */         localahd.a(false, false, true);
/* 191:    */       }
/* 192:    */     }
/* 193:267 */     ag();
/* 194:    */   }
/* 195:    */   
/* 196:    */   private void ag()
/* 197:    */   {
/* 198:271 */     this.worldInfo.g(0);
/* 199:272 */     this.worldInfo.b(false);
/* 200:273 */     this.worldInfo.f(0);
/* 201:274 */     this.worldInfo.a(false);
/* 202:    */   }
/* 203:    */   
/* 204:    */   public boolean areAllPlayersAsleep()
/* 205:    */   {
/* 206:278 */     if ((this.O) && (!this.isClient))
/* 207:    */     {
/* 208:280 */       for (EntityPlayer localahd : this.playerList) {
/* 209:281 */         if ((localahd.v()) || (!localahd.ce())) {
/* 210:282 */           return false;
/* 211:    */         }
/* 212:    */       }
/* 213:285 */       return true;
/* 214:    */     }
/* 215:287 */     return false;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public void g()
/* 219:    */   {
/* 220:292 */     if (this.worldInfo.d() <= 0) {
/* 221:293 */       this.worldInfo.b(64);
/* 222:    */     }
/* 223:295 */     int i = this.worldInfo.c();
/* 224:296 */     int j = this.worldInfo.e();
/* 225:297 */     int k = 0;
/* 226:298 */     while (c(new BlockPosition(i, 0, j)).getMaterial() == Material.air)
/* 227:    */     {
/* 228:299 */       i += this.rng.nextInt(8) - this.rng.nextInt(8);
/* 229:300 */       j += this.rng.nextInt(8) - this.rng.nextInt(8);
/* 230:301 */       k++;
/* 231:301 */       if (k == 10000) {
/* 232:    */         break;
/* 233:    */       }
/* 234:    */     }
/* 235:305 */     this.worldInfo.a(i);
/* 236:306 */     this.worldInfo.c(j);
/* 237:    */   }
/* 238:    */   
/* 239:    */   protected void h()
/* 240:    */   {
/* 241:311 */     super.h();
/* 242:313 */     if (this.worldInfo.u() == WorldType.DEBUG_ALL_BLOCK_STATES)
/* 243:    */     {
/* 244:314 */       for (ChunkID localaqm1 : this.E) {
/* 245:315 */         getChunk(localaqm1.x, localaqm1.z).b(false);
/* 246:    */       }
/* 247:317 */       return;
/* 248:    */     }
/* 249:320 */     int i = 0;
/* 250:321 */     int j = 0;
/* 251:322 */     for (ChunkID localaqm2 : this.E)
/* 252:    */     {
/* 253:323 */       int k = localaqm2.x * 16;
/* 254:324 */       int m = localaqm2.z * 16;
/* 255:    */       
/* 256:326 */       this.profiler.a("getChunk");
/* 257:327 */       Chunk localbfh = getChunk(localaqm2.x, localaqm2.z);
/* 258:    */       
/* 259:329 */       a(k, m, localbfh);
/* 260:    */       
/* 261:331 */       this.profiler.c("tickChunk");
/* 262:332 */       localbfh.b(false);
/* 263:    */       
/* 264:334 */       this.profiler.c("thunder");
/* 265:    */       Object localObject1;
/* 266:335 */       if ((this.rng.nextInt(100000) == 0) && (S()) && (R()))
/* 267:    */       {
/* 268:336 */         this.m = (this.m * 3 + 1013904223);
/* 269:337 */         int n = this.m >> 2;
/* 270:    */         
/* 271:339 */         localObject1 = a(new BlockPosition(k + (n & 0xF), 0, m + (n >> 8 & 0xF)));
/* 272:340 */         if (C((BlockPosition)localObject1)) {
/* 273:341 */           c(new ads(this, ((BlockPosition)localObject1).getX(), ((BlockPosition)localObject1).getY(), ((BlockPosition)localObject1).getZ()));
/* 274:    */         }
/* 275:    */       }
/* 276:345 */       this.profiler.c("iceandsnow");
/* 277:346 */       if (this.rng.nextInt(16) == 0)
/* 278:    */       {
/* 279:347 */         this.m = (this.m * 3 + 1013904223);
/* 280:348 */         int n = this.m >> 2;
/* 281:    */         
/* 282:350 */         localObject1 = q(new BlockPosition(k + (n & 0xF), 0, m + (n >> 8 & 0xF)));
/* 283:351 */         BlockPosition localdt1 = ((BlockPosition)localObject1).down();
/* 284:352 */         if (w(localdt1)) {
/* 285:353 */           setBlock(localdt1, BlockList.aI.instance());
/* 286:    */         }
/* 287:356 */         if ((S()) && (f((BlockPosition)localObject1, true))) {
/* 288:357 */           setBlock((BlockPosition)localObject1, BlockList.aH.instance());
/* 289:    */         }
/* 290:359 */         if ((S()) && 
/* 291:360 */           (b(localdt1).e())) {
/* 292:361 */           getBlock(localdt1).getProto().k(this, localdt1);
/* 293:    */         }
/* 294:    */       }
/* 295:366 */       this.profiler.c("tickBlocks");
/* 296:367 */       int n = getGameRules().c("randomTickSpeed");
/* 297:368 */       if (n > 0) {
/* 298:369 */         for (ExtendedBlockStorage localObject2 : localbfh.getBlockStorageArray()) {
/* 299:370 */           if ((localObject2 != null) && (localObject2.b())) {
/* 300:371 */             for (int i3 = 0; i3 < n; i3++)
/* 301:    */             {
/* 302:372 */               this.m = (this.m * 3 + 1013904223);
/* 303:373 */               int i4 = this.m >> 2;
/* 304:374 */               int i5 = i4 & 0xF;
/* 305:375 */               int i6 = i4 >> 8 & 0xF;
/* 306:376 */               int i7 = i4 >> 16 & 0xF;
/* 307:    */               
/* 308:378 */               j++;
/* 309:379 */               BlockPosition localdt2 = new BlockPosition(i5 + k, i7 + localObject2.getY(), i6 + m);
/* 310:380 */               Block localbec = localObject2.a(i5, i7, i6);
/* 311:381 */               ProtoBlock localatr = localbec.getProto();
/* 312:382 */               if (localatr.w())
/* 313:    */               {
/* 314:383 */                 i++;
/* 315:384 */                 localatr.a(this, localdt2, localbec, this.rng);
/* 316:    */               }
/* 317:    */             }
/* 318:    */           }
/* 319:    */         }
/* 320:    */       }
/* 321:390 */       this.profiler.b();
/* 322:    */     }
/* 323:    */   }
/* 324:    */   
/* 325:    */   protected BlockPosition a(BlockPosition paramdt)
/* 326:    */   {
/* 327:395 */     BlockPosition localdt = q(paramdt);
/* 328:396 */     AABB localbrt = new AABB(localdt, new BlockPosition(localdt.getX(), U(), localdt.getZ())).expand(3.0D, 3.0D, 3.0D);
/* 329:    */     
/* 330:398 */     List localList = a(EntityLiving.class, localbrt, new qu(this));
/* 331:405 */     if (!localList.isEmpty()) {
/* 332:406 */       return ((EntityLiving)localList.get(this.rng.nextInt(localList.size()))).c();
/* 333:    */     }
/* 334:409 */     return localdt;
/* 335:    */   }
/* 336:    */   
/* 337:    */   public boolean a(BlockPosition paramdt, ProtoBlock paramatr)
/* 338:    */   {
/* 339:414 */     TickListener localark = new TickListener(paramdt, paramatr);
/* 340:415 */     return this.tickingList.contains(localark);
/* 341:    */   }
/* 342:    */   
/* 343:    */   public void a(BlockPosition paramdt, ProtoBlock paramatr, int paramInt)
/* 344:    */   {
/* 345:420 */     a(paramdt, paramatr, paramInt, 0);
/* 346:    */   }
/* 347:    */   
/* 348:    */   public void a(BlockPosition paramdt, ProtoBlock paramatr, int paramInt1, int paramInt2)
/* 349:    */   {
/* 350:425 */     TickListener localark = new TickListener(paramdt, paramatr);
/* 351:426 */     int i = 0;
/* 352:427 */     if ((this.e) && (paramatr.getMaterial() != Material.air))
/* 353:    */     {
/* 354:428 */       if (paramatr.M())
/* 355:    */       {
/* 356:429 */         i = 8;
/* 357:430 */         if (a(localark.a.offset(-i, -i, -i), localark.a.offset(i, i, i)))
/* 358:    */         {
/* 359:431 */           Block localbec = getBlock(localark.a);
/* 360:433 */           if ((localbec.getProto().getMaterial() != Material.air) && (localbec.getProto() == localark.a())) {
/* 361:434 */             localbec.getProto().b(this, localark.a, localbec, this.rng);
/* 362:    */           }
/* 363:    */         }
/* 364:437 */         return;
/* 365:    */       }
/* 366:439 */       paramInt1 = 1;
/* 367:    */     }
/* 368:443 */     if (a(paramdt.offset(-i, -i, -i), paramdt.offset(i, i, i)))
/* 369:    */     {
/* 370:444 */       if (paramatr.getMaterial() != Material.air)
/* 371:    */       {
/* 372:445 */         localark.a(paramInt1 + this.worldInfo.getRealTime());
/* 373:446 */         localark.a(paramInt2);
/* 374:    */       }
/* 375:448 */       if (!this.L.contains(localark))
/* 376:    */       {
/* 377:449 */         this.L.add(localark);
/* 378:450 */         this.pendingList.add(localark);
/* 379:    */       }
/* 380:    */     }
/* 381:    */   }
/* 382:    */   
/* 383:    */   public void b(BlockPosition paramdt, ProtoBlock paramatr, int paramInt1, int paramInt2)
/* 384:    */   {
/* 385:457 */     TickListener localark = new TickListener(paramdt, paramatr);
/* 386:458 */     localark.a(paramInt2);
/* 387:460 */     if (paramatr.getMaterial() != Material.air) {
/* 388:461 */       localark.a(paramInt1 + this.worldInfo.getRealTime());
/* 389:    */     }
/* 390:463 */     if (!this.L.contains(localark))
/* 391:    */     {
/* 392:464 */       this.L.add(localark);
/* 393:465 */       this.pendingList.add(localark);
/* 394:    */     }
/* 395:    */   }
/* 396:    */   
/* 397:    */   public void updateEntities()
/* 398:    */   {
/* 399:471 */     if (this.playerList.isEmpty())
/* 400:    */     {
/* 401:472 */       if (this.P++ < 1200) {}
/* 402:    */     }
/* 403:    */     else {
/* 404:476 */       j();
/* 405:    */     }
/* 406:479 */     super.updateEntities();
/* 407:    */   }
/* 408:    */   
/* 409:    */   public void j()
/* 410:    */   {
/* 411:483 */     this.P = 0;
/* 412:    */   }
/* 413:    */   
/* 414:486 */   private List<TickListener> tickingList = Lists.newArrayList();
/* 415:    */   
/* 416:    */   public boolean tickUpdates(boolean paramBoolean)
/* 417:    */   {
/* 418:490 */     if (this.worldInfo.u() == WorldType.DEBUG_ALL_BLOCK_STATES) {
/* 419:491 */       return false;
/* 420:    */     }
/* 421:494 */     int i = this.pendingList.size();
/* 422:495 */     if (i != this.L.size()) {
/* 423:496 */       throw new IllegalStateException("TickNextTick list out of synch");
/* 424:    */     }
/* 425:498 */     if (i > 1000) {
/* 426:499 */       i = 1000;
/* 427:    */     }
/* 428:502 */     this.profiler.a("cleaning");
/* 429:    */     TickListener listener;
/* 430:503 */     for (int j = 0; j < i; j++)
/* 431:    */     {
/* 432:504 */       listener = this.pendingList.first();
/* 433:505 */       if ((!paramBoolean) && (listener.time > this.worldInfo.getRealTime())) {
/* 434:    */         break;
/* 435:    */       }
/* 436:509 */       this.pendingList.remove(listener);
/* 437:510 */       this.L.remove(listener);
/* 438:511 */       this.tickingList.add(listener);
/* 439:    */     }
/* 440:513 */     this.profiler.b();
/* 441:    */     
/* 442:515 */     this.profiler.a("ticking");
/* 443:516 */     Iterator<TickListener> localIterator = this.tickingList.iterator();
/* 444:517 */     while (localIterator.hasNext())
/* 445:    */     {
/* 446:518 */       listener = localIterator.next();
/* 447:519 */       localIterator.remove();
/* 448:    */       
/* 449:521 */       int k = 0;
/* 450:523 */       if (a(listener.a.offset(-k, -k, -k), listener.a.offset(k, k, k)))
/* 451:    */       {
/* 452:524 */         Block block = getBlock(listener.a);
/* 453:525 */         if ((block.getProto().getMaterial() != Material.air) && (ProtoBlock.a(block.getProto(), listener.a()))) {
/* 454:    */           try
/* 455:    */           {
/* 456:527 */             block.getProto().b(this, listener.a, block, this.rng);
/* 457:    */           }
/* 458:    */           catch (Throwable localThrowable)
/* 459:    */           {
/* 460:529 */             b localb = net.minecraft.src.b.a(localThrowable, "Exception while ticking a block");
/* 461:530 */             j localj = localb.a("Block being ticked");
/* 462:531 */             net.minecraft.src.j.a(localj, listener.a, block);
/* 463:532 */             throw new u(localb);
/* 464:    */           }
/* 465:    */         }
/* 466:    */       }
/* 467:    */       else
/* 468:    */       {
/* 469:536 */         a(listener.a, listener.a(), 0);
/* 470:    */       }
/* 471:    */     }
/* 472:539 */     this.profiler.b();
/* 473:    */     
/* 474:541 */     this.tickingList.clear();
/* 475:    */     
/* 476:543 */     return !this.pendingList.isEmpty();
/* 477:    */   }
/* 478:    */   
/* 479:    */   public List a(Chunk parambfh, boolean paramBoolean)
/* 480:    */   {
/* 481:549 */     ChunkID localaqm = parambfh.j();
/* 482:550 */     int i = (localaqm.x << 4) - 2;
/* 483:551 */     int j = i + 16 + 2;
/* 484:552 */     int k = (localaqm.z << 4) - 2;
/* 485:553 */     int m = k + 16 + 2;
/* 486:    */     
/* 487:555 */     return a(new bjb(i, 0, k, j, 256, m), paramBoolean);
/* 488:    */   }
/* 489:    */   
/* 490:    */   public List<TickListener> a(bjb parambjb, boolean paramBoolean)
/* 491:    */   {
/* 492:561 */     ArrayList<TickListener> localArrayList = null;
/* 493:563 */     for (int i = 0; i < 2; i++)
/* 494:    */     {
/* 495:    */       Iterator<TickListener> localIterator;
/* 496:565 */       if (i == 0)
/* 497:    */       {
/* 498:566 */         localIterator = this.pendingList.iterator();
/* 499:    */       }
/* 500:    */       else
/* 501:    */       {
/* 502:568 */         localIterator = this.tickingList.iterator();
/* 503:569 */         if (!this.tickingList.isEmpty()) {
/* 504:570 */           a.debug("toBeTicked = " + this.tickingList.size());
/* 505:    */         }
/* 506:    */       }
/* 507:574 */       while (localIterator.hasNext())
/* 508:    */       {
/* 509:575 */         TickListener localark = (TickListener)localIterator.next();
/* 510:576 */         BlockPosition localdt = localark.a;
/* 511:577 */         if ((localdt.getX() >= parambjb.a) && (localdt.getX() < parambjb.d) && (localdt.getZ() >= parambjb.c) && (localdt.getZ() < parambjb.f))
/* 512:    */         {
/* 513:578 */           if (paramBoolean)
/* 514:    */           {
/* 515:579 */             this.L.remove(localark);
/* 516:580 */             localIterator.remove();
/* 517:    */           }
/* 518:582 */           if (localArrayList == null) {
/* 519:583 */             localArrayList = Lists.newArrayList();
/* 520:    */           }
/* 521:585 */           localArrayList.add(localark);
/* 522:    */         }
/* 523:    */       }
/* 524:    */     }
/* 525:590 */     return localArrayList;
/* 526:    */   }
/* 527:    */   
/* 528:    */   public void a(Entity paramwv, boolean paramBoolean)
/* 529:    */   {
/* 530:595 */     if ((!ai()) && (((paramwv instanceof EntityAnimal)) || ((paramwv instanceof EntityWaterMob)))) {
/* 531:596 */       paramwv.setDead();
/* 532:    */     }
/* 533:598 */     if ((!ah()) && ((paramwv instanceof ago))) {
/* 534:599 */       paramwv.setDead();
/* 535:    */     }
/* 536:601 */     super.a(paramwv, paramBoolean);
/* 537:    */   }
/* 538:    */   
/* 539:    */   private boolean ah()
/* 540:    */   {
/* 541:605 */     return this.I.ag();
/* 542:    */   }
/* 543:    */   
/* 544:    */   private boolean ai()
/* 545:    */   {
/* 546:609 */     return this.I.af();
/* 547:    */   }
/* 548:    */   
/* 549:    */   protected IChunkProvider k()
/* 550:    */   {
/* 551:627 */     bfq localbfq = this.w.a(this.t);
/* 552:628 */     this.b = new ServerChunkCache(this, localbfq, this.t.c());
/* 553:629 */     return this.b;
/* 554:    */   }
/* 555:    */   
/* 556:    */   public List<bcm> a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 557:    */   {
/* 558:633 */     ArrayList<bcm> localArrayList = Lists.newArrayList();
/* 559:634 */     for (int i = 0; i < this.h.size(); i++)
/* 560:    */     {
/* 561:635 */       bcm localbcm = (bcm)this.h.get(i);
/* 562:636 */       BlockPosition localdt = localbcm.v();
/* 563:638 */       if ((localdt.getX() >= paramInt1) && (localdt.getY() >= paramInt2) && (localdt.getZ() >= paramInt3) && (localdt.getX() < paramInt4) && (localdt.getY() < paramInt5) && (localdt.getZ() < paramInt6)) {
/* 564:639 */         localArrayList.add(localbcm);
/* 565:    */       }
/* 566:    */     }
/* 567:643 */     return localArrayList;
/* 568:    */   }
/* 569:    */   
/* 570:    */   public boolean a(EntityPlayer paramahd, BlockPosition paramdt)
/* 571:    */   {
/* 572:648 */     return (!this.I.a(this, paramdt, paramahd)) && (af().a(paramdt));
/* 573:    */   }
/* 574:    */   
/* 575:    */   public void a(WorldSettings paramarb)
/* 576:    */   {
/* 577:653 */     if (!this.worldInfo.w())
/* 578:    */     {
/* 579:    */       try
/* 580:    */       {
/* 581:655 */         b(paramarb);
/* 582:656 */         if (this.worldInfo.u() == WorldType.DEBUG_ALL_BLOCK_STATES) {
/* 583:657 */           aj();
/* 584:    */         }
/* 585:659 */         super.a(paramarb);
/* 586:    */       }
/* 587:    */       catch (Throwable localThrowable1)
/* 588:    */       {
/* 589:661 */         b localb = net.minecraft.src.b.a(localThrowable1, "Exception initializing level");
/* 590:    */         try
/* 591:    */         {
/* 592:664 */           a(localb);
/* 593:    */         }
/* 594:    */         catch (Throwable localThrowable2) {}
/* 595:668 */         throw new u(localb);
/* 596:    */       }
/* 597:670 */       this.worldInfo.d(true);
/* 598:    */     }
/* 599:    */   }
/* 600:    */   
/* 601:    */   private void aj()
/* 602:    */   {
/* 603:675 */     this.worldInfo.f(false);
/* 604:676 */     this.worldInfo.c(true);
/* 605:677 */     this.worldInfo.b(false);
/* 606:678 */     this.worldInfo.a(false);
/* 607:679 */     this.worldInfo.i(1000000000);
/* 608:680 */     this.worldInfo.setTime(6000L);
/* 609:681 */     this.worldInfo.a(EnumGameType.e);
/* 610:682 */     this.worldInfo.g(false);
/* 611:683 */     this.worldInfo.setDifficulty(EnumDifficulty.PEACEFUL);
/* 612:684 */     this.worldInfo.e(true);
/* 613:685 */     getGameRules().a("doDaylightCycle", "false");
/* 614:    */   }
/* 615:    */   
/* 616:    */   private void b(WorldSettings paramarb)
/* 617:    */   {
/* 618:689 */     if (!this.t.e())
/* 619:    */     {
/* 620:690 */       this.worldInfo.a(BlockPosition.zero.up(this.t.i()));
/* 621:691 */       return;
/* 622:    */     }
/* 623:694 */     if (this.worldInfo.u() == WorldType.DEBUG_ALL_BLOCK_STATES)
/* 624:    */     {
/* 625:695 */       this.worldInfo.a(BlockPosition.zero.up());
/* 626:696 */       return;
/* 627:    */     }
/* 628:699 */     this.y = true;
/* 629:    */     
/* 630:701 */     arz localarz = this.t.m();
/* 631:702 */     List localList = localarz.a();
/* 632:703 */     Random localRandom = new Random(J());
/* 633:    */     
/* 634:705 */     BlockPosition localdt = localarz.a(0, 0, 256, localList, localRandom);
/* 635:    */     
/* 636:707 */     int i = 0;
/* 637:708 */     int j = this.t.i();
/* 638:709 */     int k = 0;
/* 639:711 */     if (localdt != null)
/* 640:    */     {
/* 641:712 */       i = localdt.getX();
/* 642:713 */       k = localdt.getZ();
/* 643:    */     }
/* 644:    */     else
/* 645:    */     {
/* 646:715 */       a.warn("Unable to find spawn biome");
/* 647:    */     }
/* 648:718 */     int m = 0;
/* 649:719 */     while (!this.t.a(i, k))
/* 650:    */     {
/* 651:720 */       i += localRandom.nextInt(64) - localRandom.nextInt(64);
/* 652:721 */       k += localRandom.nextInt(64) - localRandom.nextInt(64);
/* 653:722 */       m++;
/* 654:722 */       if (m == 1000) {
/* 655:    */         break;
/* 656:    */       }
/* 657:    */     }
/* 658:726 */     this.worldInfo.a(new BlockPosition(i, j, k));
/* 659:727 */     this.y = false;
/* 660:729 */     if (paramarb.c()) {
/* 661:730 */       l();
/* 662:    */     }
/* 663:    */   }
/* 664:    */   
/* 665:    */   protected void l()
/* 666:    */   {
/* 667:737 */     bhh localbhh = new bhh(U, 10);
/* 668:738 */     for (int i = 0; i < 10; i++)
/* 669:    */     {
/* 670:739 */       int j = this.worldInfo.c() + this.rng.nextInt(6) - this.rng.nextInt(6);
/* 671:740 */       int k = this.worldInfo.e() + this.rng.nextInt(6) - this.rng.nextInt(6);
/* 672:    */       
/* 673:742 */       BlockPosition localdt = r(new BlockPosition(j, 0, k)).up();
/* 674:744 */       if (localbhh.generate(this, this.rng, localdt)) {
/* 675:    */         break;
/* 676:    */       }
/* 677:    */     }
/* 678:    */   }
/* 679:    */   
/* 680:    */   public BlockPosition m()
/* 681:    */   {
/* 682:751 */     return this.t.h();
/* 683:    */   }
/* 684:    */   
/* 685:    */   public void a(boolean paramBoolean, uy paramuy) throws aqz
/* 686:    */   {
/* 687:755 */     if (!this.chunkProvider.e()) {
/* 688:756 */       return;
/* 689:    */     }
/* 690:759 */     if (paramuy != null) {
/* 691:760 */       paramuy.a("Saving level");
/* 692:    */     }
/* 693:762 */     a();
/* 694:764 */     if (paramuy != null) {
/* 695:765 */       paramuy.c("Saving chunks");
/* 696:    */     }
/* 697:767 */     this.chunkProvider.a(paramBoolean, paramuy);
/* 698:    */     
/* 699:    */ 
/* 700:770 */     List<Chunk> localList = this.b.a();
/* 701:771 */     for (Chunk localbfh : localList) {
/* 702:772 */       if (!this.K.a(localbfh.x, localbfh.z)) {
/* 703:773 */         this.b.b(localbfh.x, localbfh.z);
/* 704:    */       }
/* 705:    */     }
/* 706:    */   }
/* 707:    */   
/* 708:    */   public void n()
/* 709:    */   {
/* 710:779 */     if (!this.chunkProvider.e()) {
/* 711:780 */       return;
/* 712:    */     }
/* 713:782 */     this.chunkProvider.c();
/* 714:    */   }
/* 715:    */   
/* 716:    */   protected void a() throws aqz
/* 717:    */   {
/* 718:786 */     I();
/* 719:    */     
/* 720:788 */     this.worldInfo.a(af().h());
/* 721:789 */     this.worldInfo.d(af().f());
/* 722:790 */     this.worldInfo.c(af().g());
/* 723:791 */     this.worldInfo.e(af().m());
/* 724:792 */     this.worldInfo.f(af().n());
/* 725:793 */     this.worldInfo.j(af().q());
/* 726:794 */     this.worldInfo.k(af().p());
/* 727:    */     
/* 728:796 */     this.worldInfo.b(af().j());
/* 729:797 */     this.worldInfo.e(af().i());
/* 730:    */     
/* 731:799 */     this.w.a(this.worldInfo, this.I.an().u());
/* 732:800 */     this.z.a();
/* 733:    */   }
/* 734:    */   
/* 735:    */   protected void obtainEntitySkin(Entity paramwv)
/* 736:    */   {
/* 737:805 */     super.obtainEntitySkin(paramwv);
/* 738:806 */     this.l.a(paramwv.getID(), paramwv);
/* 739:807 */     this.N.put(paramwv.getUUID(), paramwv);
/* 740:808 */     Entity[] arrayOfwv = paramwv.aC();
/* 741:809 */     if (arrayOfwv != null) {
/* 742:810 */       for (int i = 0; i < arrayOfwv.length; i++) {
/* 743:811 */         this.l.a(arrayOfwv[i].getID(), arrayOfwv[i]);
/* 744:    */       }
/* 745:    */     }
/* 746:    */   }
/* 747:    */   
/* 748:    */   protected void releaseEntitySkin(Entity paramwv)
/* 749:    */   {
/* 750:818 */     super.releaseEntitySkin(paramwv);
/* 751:819 */     this.l.d(paramwv.getID());
/* 752:820 */     this.N.remove(paramwv.getUUID());
/* 753:821 */     Entity[] arrayOfwv = paramwv.aC();
/* 754:822 */     if (arrayOfwv != null) {
/* 755:823 */       for (int i = 0; i < arrayOfwv.length; i++) {
/* 756:824 */         this.l.d(arrayOfwv[i].getID());
/* 757:    */       }
/* 758:    */     }
/* 759:    */   }
/* 760:    */   
/* 761:    */   public boolean c(Entity paramwv)
/* 762:    */   {
/* 763:831 */     if (super.c(paramwv))
/* 764:    */     {
/* 765:832 */       this.I.an().a(paramwv.xPos, paramwv.yPos, paramwv.zPos, 512.0D, this.t.q(), new in(paramwv));
/* 766:833 */       return true;
/* 767:    */     }
/* 768:835 */     return false;
/* 769:    */   }
/* 770:    */   
/* 771:    */   public void sendSignal(Entity paramwv, byte paramByte)
/* 772:    */   {
/* 773:840 */     s().b(paramwv, new jk(paramwv, paramByte));
/* 774:    */   }
/* 775:    */   
/* 776:    */   public aqo a(Entity paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
/* 777:    */   {
/* 778:847 */     aqo localaqo = new aqo(this, paramwv, paramDouble1, paramDouble2, paramDouble3, paramFloat, paramBoolean1, paramBoolean2);
/* 779:848 */     localaqo.a();
/* 780:849 */     localaqo.a(false);
/* 781:851 */     if (!paramBoolean2) {
/* 782:852 */       localaqo.d();
/* 783:    */     }
/* 784:855 */     for (EntityPlayer localahd : this.playerList) {
/* 785:856 */       if (localahd.dist2(paramDouble1, paramDouble2, paramDouble3) < 4096.0D) {
/* 786:857 */         ((qw)localahd).a.a(new jm(paramDouble1, paramDouble2, paramDouble3, paramFloat, localaqo.e(), (Vec3)localaqo.b().get(localahd)));
/* 787:    */       }
/* 788:    */     }
/* 789:861 */     return localaqo;
/* 790:    */   }
/* 791:    */   
/* 792:    */   public void c(BlockPosition paramdt, ProtoBlock paramatr, int paramInt1, int paramInt2)
/* 793:    */   {
/* 794:866 */     aqk localaqk1 = new aqk(paramdt, paramatr, paramInt1, paramInt2);
/* 795:867 */     for (aqk localaqk2 : this.S[this.T]) {
/* 796:868 */       if (localaqk2.equals(localaqk1)) {
/* 797:869 */         return;
/* 798:    */       }
/* 799:    */     }
/* 800:872 */     this.S[this.T].add(localaqk1);
/* 801:    */   }
/* 802:    */   
/* 803:    */   private void ak()
/* 804:    */   {
/* 805:877 */     while (!this.S[this.T].isEmpty())
/* 806:    */     {
/* 807:878 */       int i = this.T;
/* 808:879 */       this.T ^= 0x1;
/* 809:881 */       for (aqk localaqk : this.S[i]) {
/* 810:882 */         if (a(localaqk)) {
/* 811:883 */           this.I.an().a(localaqk.a().getX(), localaqk.a().getY(), localaqk.a().getZ(), 64.0D, this.t.q(), new iv(localaqk.a(), localaqk.d(), localaqk.b(), localaqk.c()));
/* 812:    */         }
/* 813:    */       }
/* 814:886 */       this.S[i].clear();
/* 815:    */     }
/* 816:    */   }
/* 817:    */   
/* 818:    */   private boolean a(aqk paramaqk)
/* 819:    */   {
/* 820:891 */     Block localbec = getBlock(paramaqk.a());
/* 821:892 */     if (localbec.getProto() == paramaqk.d()) {
/* 822:893 */       return localbec.getProto().a(this, paramaqk.a(), localbec, paramaqk.b(), paramaqk.c());
/* 823:    */     }
/* 824:895 */     return false;
/* 825:    */   }
/* 826:    */   
/* 827:    */   public void o()
/* 828:    */   {
/* 829:899 */     this.w.a();
/* 830:    */   }
/* 831:    */   
/* 832:    */   protected void p()
/* 833:    */   {
/* 834:904 */     boolean bool = S();
/* 835:905 */     super.p();
/* 836:907 */     if (this.o != this.p) {
/* 837:908 */       this.I.an().a(new jo(7, this.p), this.t.q());
/* 838:    */     }
/* 839:910 */     if (this.q != this.r) {
/* 840:911 */       this.I.an().a(new jo(8, this.r), this.t.q());
/* 841:    */     }
/* 842:914 */     if (bool != S())
/* 843:    */     {
/* 844:915 */       if (bool) {
/* 845:916 */         this.I.an().a(new jo(2, 0.0F));
/* 846:    */       } else {
/* 847:918 */         this.I.an().a(new jo(1, 0.0F));
/* 848:    */       }
/* 849:920 */       this.I.an().a(new jo(7, this.p));
/* 850:921 */       this.I.an().a(new jo(8, this.r));
/* 851:    */     }
/* 852:    */   }
/* 853:    */   
/* 854:    */   protected int q()
/* 855:    */   {
/* 856:927 */     return this.I.an().t();
/* 857:    */   }
/* 858:    */   
/* 859:    */   public MinecraftServer r()
/* 860:    */   {
/* 861:931 */     return this.I;
/* 862:    */   }
/* 863:    */   
/* 864:    */   public qn s()
/* 865:    */   {
/* 866:935 */     return this.J;
/* 867:    */   }
/* 868:    */   
/* 869:    */   public qq t()
/* 870:    */   {
/* 871:939 */     return this.K;
/* 872:    */   }
/* 873:    */   
/* 874:    */   public arh u()
/* 875:    */   {
/* 876:943 */     return this.Q;
/* 877:    */   }
/* 878:    */   
/* 879:    */   public void a(EnumParticleEffect paramew, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, int... paramVarArgs)
/* 880:    */   {
/* 881:947 */     a(paramew, false, paramDouble1, paramDouble2, paramDouble3, paramInt, paramDouble4, paramDouble5, paramDouble6, paramDouble7, paramVarArgs);
/* 882:    */   }
/* 883:    */   
/* 884:    */   public void a(EnumParticleEffect paramew, boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, int... paramVarArgs)
/* 885:    */   {
/* 886:951 */     ju localju = new ju(paramew, paramBoolean, (float)paramDouble1, (float)paramDouble2, (float)paramDouble3, (float)paramDouble4, (float)paramDouble5, (float)paramDouble6, (float)paramDouble7, paramInt, paramVarArgs);
/* 887:953 */     for (int i = 0; i < this.playerList.size(); i++)
/* 888:    */     {
/* 889:954 */       qw localqw = (qw)this.playerList.get(i);
/* 890:955 */       BlockPosition localdt = localqw.c();
/* 891:956 */       double d1 = localdt.dist2(paramDouble1, paramDouble2, paramDouble3);
/* 892:958 */       if ((d1 <= 256.0D) || ((paramBoolean) && (d1 <= 65536.0D))) {
/* 893:959 */         localqw.a.a(localju);
/* 894:    */       }
/* 895:    */     }
/* 896:    */   }
/* 897:    */   
/* 898:    */   public Entity a(UUID paramUUID)
/* 899:    */   {
/* 900:966 */     return (Entity)this.N.get(paramUUID);
/* 901:    */   }
/* 902:    */   
/* 903:    */   public ListenableFuture a(Runnable paramRunnable)
/* 904:    */   {
/* 905:976 */     return this.I.a(paramRunnable);
/* 906:    */   }
/* 907:    */   
/* 908:    */   public boolean aH()
/* 909:    */   {
/* 910:981 */     return this.I.aH();
/* 911:    */   }
/* 912:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     qt
 * JD-Core Version:    0.7.0.1
 */
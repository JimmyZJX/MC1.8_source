package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Sets;
/*   3:    */ import com.mojang.authlib.GameProfile;
/*   4:    */ import io.netty.buffer.Unpooled;
/*   5:    */ import java.util.Arrays;
/*   6:    */ import java.util.Collection;
/*   7:    */ import java.util.HashSet;
/*   8:    */ import java.util.Iterator;
/*   9:    */ import java.util.List;
/*  10:    */ import java.util.Map;
/*  11:    */ import java.util.Random;
/*  12:    */ import java.util.Set;
/*  13:    */ import net.minecraft.server.MinecraftServer;
/*  14:    */ import org.apache.logging.log4j.LogManager;
/*  15:    */ import org.apache.logging.log4j.Logger;
/*  16:    */ 
/*  17:    */ public class qw
/*  18:    */   extends EntityPlayer
/*  19:    */   implements ail
/*  20:    */ {
/*  21: 65 */   private static final Logger bF = LogManager.getLogger();
/*  22: 66 */   private String bG = "en_US";
/*  23:    */   public rj a;
/*  24:    */   public final MinecraftServer b;
/*  25:    */   public final qx c;
/*  26:    */   public double d;
/*  27:    */   public double e;
/*  28: 71 */   public final List f = Lists.newLinkedList();
/*  29: 72 */   private final List bH = Lists.newLinkedList();
/*  30:    */   private final tp bI;
/*  31: 74 */   private float bJ = 1.4E-45F;
/*  32: 75 */   private float bK = -1.0E+008F;
/*  33: 76 */   private int bL = -99999999;
/*  34: 77 */   private boolean bM = true;
/*  35: 78 */   private int bN = -99999999;
/*  36: 79 */   private int bO = 60;
/*  37:    */   private ahg bP;
/*  38: 81 */   private boolean bQ = true;
/*  39: 82 */   private long bR = System.currentTimeMillis();
/*  40: 83 */   private Entity bS = null;
/*  41:    */   private int bT;
/*  42:    */   public boolean g;
/*  43:    */   public int h;
/*  44:    */   public boolean i;
/*  45:    */   
/*  46:    */   public qw(MinecraftServer paramMinecraftServer, WorldServer paramqt, GameProfile paramGameProfile, qx paramqx)
/*  47:    */   {
/*  48: 86 */     super(paramqt, paramGameProfile);
/*  49: 87 */     paramqx.b = this;
/*  50: 88 */     this.c = paramqx;
/*  51:    */     
/*  52: 90 */     BlockPosition localdt = paramqt.getWorldSpawn();
/*  53: 92 */     if ((!paramqt.t.o()) && (paramqt.getWorldInfo().r() != EnumGameType.d))
/*  54:    */     {
/*  55: 93 */       int j = Math.max(5, paramMinecraftServer.au() - 6);
/*  56: 94 */       int k = MathUtils.floor(paramqt.af().b(localdt.getX(), localdt.getZ()));
/*  57: 95 */       if (k < j) {
/*  58: 96 */         j = k;
/*  59:    */       }
/*  60: 98 */       if (k <= 1) {
/*  61: 99 */         j = 1;
/*  62:    */       }
/*  63:101 */       localdt = paramqt.r(localdt.offset(this.random.nextInt(j * 2) - j, 0, this.random.nextInt(j * 2) - j));
/*  64:    */     }
/*  65:104 */     this.b = paramMinecraftServer;
/*  66:105 */     this.bI = paramMinecraftServer.an().a((EntityPlayer)this);
/*  67:106 */     this.S = 0.0F;
/*  68:    */     
/*  69:108 */     setPositionAndAngles(localdt, 0.0F, 0.0F);
/*  70:109 */     while ((!paramqt.getCollidingAABBs(this, getAABB()).isEmpty()) && (this.yPos < 255.0D)) {
/*  71:110 */       b(this.xPos, this.yPos + 1.0D, this.zPos);
/*  72:    */     }
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/*  76:    */   {
/*  77:116 */     super.readEntityFromNBT(paramfn);
/*  78:118 */     if (paramfn.hasKey("playerGameType", 99)) {
/*  79:119 */       if (MinecraftServer.M().av()) {
/*  80:120 */         this.c.a(MinecraftServer.M().m());
/*  81:    */       } else {
/*  82:122 */         this.c.a(EnumGameType.a(paramfn.getInteger("playerGameType")));
/*  83:    */       }
/*  84:    */     }
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/*  88:    */   {
/*  89:129 */     super.writeEntityToNBT(paramfn);
/*  90:    */     
/*  91:131 */     paramfn.setInt("playerGameType", this.c.b().a());
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void a(int paramInt)
/*  95:    */   {
/*  96:136 */     super.a(paramInt);
/*  97:137 */     this.bN = -1;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void b(int paramInt)
/* 101:    */   {
/* 102:142 */     super.b(paramInt);
/* 103:143 */     this.bN = -1;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void f_()
/* 107:    */   {
/* 108:147 */     this.bi.a((ail)this);
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void g_()
/* 112:    */   {
/* 113:152 */     super.g_();
/* 114:    */     
/* 115:154 */     this.a.a(new ke(br(), kg.a));
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void j()
/* 119:    */   {
/* 120:159 */     super.j();
/* 121:    */     
/* 122:161 */     this.a.a(new ke(br(), kg.b));
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void onUpdate()
/* 126:    */   {
/* 127:166 */     this.c.a();
/* 128:    */     
/* 129:168 */     this.bO -= 1;
/* 130:169 */     if (this.Z > 0) {
/* 131:170 */       this.Z -= 1;
/* 132:    */     }
/* 133:172 */     this.bi.b();
/* 134:174 */     if ((!this.world.isClient) && 
/* 135:175 */       (!this.bi.a((EntityPlayer)this)))
/* 136:    */     {
/* 137:176 */       n();
/* 138:177 */       this.bi = this.bh;
/* 139:    */     }
/* 140:    */     
/* 141:    */     Object localObject3;
/* 142:181 */     while (!this.bH.isEmpty())
/* 143:    */     {
/* 144:182 */       int j = Math.min(this.bH.size(), 2147483647);
/* 145:183 */       int[] localObject2 = new int[j];
/* 146:184 */       localObject3 = this.bH.iterator();
/* 147:185 */       int k = 0;
/* 148:187 */       while ((((Iterator)localObject3).hasNext()) && (k < j))
/* 149:    */       {
/* 150:188 */         localObject2[(k++)] = ((Integer)((Iterator)localObject3).next()).intValue();
/* 151:189 */         ((Iterator)localObject3).remove();
/* 152:    */       }
/* 153:192 */       this.a.a(new km((int[])localObject2));
/* 154:    */     }
/* 155:    */     Object localObject4;
/* 156:    */     Object localObject5;
/* 157:195 */     if (!this.f.isEmpty())
/* 158:    */     {
/* 159:196 */       List localObject1 = Lists.newArrayList();
/* 160:197 */       Iterator<ChunkID> localObject2 = this.f.iterator();
/* 161:198 */       localObject3 = Lists.newArrayList();
/* 162:200 */       while ((localObject2.hasNext()) && (((List)localObject1).size() < 10))
/* 163:    */       {
/* 164:201 */         localObject4 = localObject2.next();
/* 165:203 */         if (localObject4 != null)
/* 166:    */         {
/* 167:204 */           if (this.world.e(new BlockPosition(((ChunkID)localObject4).x << 4, 0, ((ChunkID)localObject4).z << 4)))
/* 168:    */           {
/* 169:205 */             localObject5 = this.world.getChunk(((ChunkID)localObject4).x, ((ChunkID)localObject4).z);
/* 170:206 */             if (((Chunk)localObject5).i())
/* 171:    */             {
/* 172:207 */               ((List)localObject1).add(localObject5);
/* 173:208 */               ((List)localObject3).addAll(((WorldServer)this.world).a(((ChunkID)localObject4).x * 16, 0, ((ChunkID)localObject4).z * 16, ((ChunkID)localObject4).x * 16 + 16, 256, ((ChunkID)localObject4).z * 16 + 16));
/* 174:209 */               ((Iterator)localObject2).remove();
/* 175:    */             }
/* 176:    */           }
/* 177:    */         }
/* 178:    */         else {
/* 179:213 */           ((Iterator)localObject2).remove();
/* 180:    */         }
/* 181:    */       }
/* 182:217 */       if (!((List)localObject1).isEmpty())
/* 183:    */       {
/* 184:218 */         if (((List)localObject1).size() == 1) {
/* 185:219 */           this.a.a(new jq((Chunk)((List)localObject1).get(0), true, 65535));
/* 186:    */         } else {
/* 187:221 */           this.a.a(new js((List)localObject1));
/* 188:    */         }
/* 189:224 */         for (localObject4 = ((List)localObject3).iterator(); ((Iterator)localObject4).hasNext();)
/* 190:    */         {
/* 191:224 */           localObject5 = (bcm)((Iterator)localObject4).next();
/* 192:225 */           a((bcm)localObject5);
/* 193:    */         }
/* 194:228 */         for (localObject4 = ((List)localObject1).iterator(); ((Iterator)localObject4).hasNext();)
/* 195:    */         {
/* 196:228 */           localObject5 = (Chunk)((Iterator)localObject4).next();
/* 197:229 */           u().s().a(this, (Chunk)localObject5);
/* 198:    */         }
/* 199:    */       }
/* 200:    */     }
/* 201:234 */     Object localObject1 = C();
/* 202:235 */     if (localObject1 != this) {
/* 203:236 */       if (!((Entity)localObject1).ai())
/* 204:    */       {
/* 205:237 */         e(this);
/* 206:    */       }
/* 207:    */       else
/* 208:    */       {
/* 209:239 */         a(((Entity)localObject1).xPos, ((Entity)localObject1).yPos, ((Entity)localObject1).zPos, ((Entity)localObject1).yaw, ((Entity)localObject1).pitch);
/* 210:240 */         this.b.an().d(this);
/* 211:241 */         if (aw()) {
/* 212:242 */           e(this);
/* 213:    */         }
/* 214:    */       }
/* 215:    */     }
/* 216:    */   }
/* 217:    */   
/* 218:    */   public void l()
/* 219:    */   {
/* 220:    */     try
/* 221:    */     {
/* 222:250 */       super.onUpdate();
/* 223:252 */       for (int j = 0; j < this.bg.n_(); j++)
/* 224:    */       {
/* 225:253 */         ItemStack localObject1 = this.bg.a(j);
/* 226:254 */         if ((localObject1 != null) && 
/* 227:255 */           (localObject1.getItem().f()))
/* 228:    */         {
/* 229:256 */           id localObject2 = ((ake)(localObject1.getItem())).c((ItemStack)localObject1, this.world, this);
/* 230:257 */           if (localObject2 != null) {
/* 231:258 */             this.a.a(localObject2);
/* 232:    */           }
/* 233:    */         }
/* 234:    */       }
/* 235:264 */       if ((getHealth() == this.bK) && (this.bL == this.bj.a()))
/* 236:    */       {
/* 237:264 */         if ((this.bj.e() == 0.0F) == this.bM) {}
/* 238:    */       }
/* 239:    */       else
/* 240:    */       {
/* 241:265 */         this.a.a(new lc(getHealth(), this.bj.a(), this.bj.e()));
/* 242:266 */         this.bK = getHealth();
/* 243:267 */         this.bL = this.bj.a();
/* 244:268 */         this.bM = (this.bj.e() == 0.0F);
/* 245:    */       }
/* 246:271 */       if (getHealth() + bM() != this.bJ)
/* 247:    */       {
/* 248:272 */         this.bJ = (getHealth() + bM());
/* 249:    */         
/* 250:274 */         Collection<bry> localCollection = co().a(bsk.g);
/* 251:275 */         for (Iterator<bry> localObject1 = localCollection.iterator(); ((Iterator)localObject1).hasNext();)
/* 252:    */         {
/* 253:275 */           bry localObject2 = (bry)((Iterator)localObject1).next();
/* 254:276 */           co().c(getName(), (bry)localObject2).a(Arrays.asList(new EntityPlayer[] { this }));
/* 255:    */         }
/* 256:    */       }
/* 257:280 */       if (this.bA != this.bN)
/* 258:    */       {
/* 259:281 */         this.bN = this.bA;
/* 260:282 */         this.a.a(new lb(this.bB, this.bA, this.bz));
/* 261:    */       }
/* 262:285 */       if ((this.W % 20 * 5 == 0) && (!A().a(AchievementList.L))) {
/* 263:286 */         h_();
/* 264:    */       }
/* 265:    */     }
/* 266:    */     catch (Throwable localThrowable)
/* 267:    */     {
/* 268:289 */       Object localObject1 = net.minecraft.src.b.a(localThrowable, "Ticking player");
/* 269:290 */       Object localObject2 = ((b)localObject1).a("Player being ticked");
/* 270:    */       
/* 271:292 */       a((j)localObject2);
/* 272:    */       
/* 273:294 */       throw new u((b)localObject1);
/* 274:    */     }
/* 275:    */   }
/* 276:    */   
/* 277:    */   protected void h_()
/* 278:    */   {
/* 279:299 */     arm localarm1 = this.world.b(new BlockPosition(MathUtils.floor(this.xPos), 0, MathUtils.floor(this.zPos)));
/* 280:300 */     String str1 = localarm1.ah;
/* 281:301 */     ua localua = (ua)A().b((tq)AchievementList.L);
/* 282:303 */     if (localua == null) {
/* 283:304 */       localua = (ua)A().a(AchievementList.L, new ua());
/* 284:    */     }
/* 285:306 */     localua.add(str1);
/* 286:308 */     if ((A().b(AchievementList.L)) && (localua.size() >= arm.n.size()))
/* 287:    */     {
/* 288:309 */       HashSet localHashSet = Sets.newHashSet(arm.n);
/* 289:310 */       for (String str2 : localua)
/* 290:    */       {
/* 291:311 */         Iterator localIterator2 = localHashSet.iterator();
/* 292:313 */         while (localIterator2.hasNext())
/* 293:    */         {
/* 294:314 */           arm localarm2 = (arm)localIterator2.next();
/* 295:316 */           if (localarm2.ah.equals(str2)) {
/* 296:317 */             localIterator2.remove();
/* 297:    */           }
/* 298:    */         }
/* 299:321 */         if (localHashSet.isEmpty()) {
/* 300:    */           break;
/* 301:    */         }
/* 302:    */       }
/* 303:326 */       if (localHashSet.isEmpty()) {
/* 304:327 */         b(AchievementList.L);
/* 305:    */       }
/* 306:    */     }
/* 307:    */   }
/* 308:    */   
/* 309:    */   public void a(DamageSource paramwh)
/* 310:    */   {
/* 311:334 */     if (this.world.getGameRules().getBoolean("showDeathMessages"))
/* 312:    */     {
/* 313:335 */       bsf localObject1 = bN();
/* 314:336 */       if ((localObject1 == null) || (((bsf)localObject1).j() == bsg.ALWAYS)) {
/* 315:337 */         this.b.an().a(br().b());
/* 316:338 */       } else if (((bsf)localObject1).j() == bsg.HIDE_FOR_OTHER_TEAMS) {
/* 317:339 */         this.b.an().a(this, br().b());
/* 318:340 */       } else if (((bsf)localObject1).j() == bsg.HIDE_FOR_OWN_TEAM) {
/* 319:341 */         this.b.an().b(this, br().b());
/* 320:    */       }
/* 321:    */     }
/* 322:344 */     if (!this.world.getGameRules().getBoolean("keepInventory")) {
/* 323:345 */       this.bg.n();
/* 324:    */     }
/* 325:348 */     Object localObject1 = this.world.Z().a(bsk.d);
/* 326:350 */     for (Object localObject2 = ((Collection)localObject1).iterator(); ((Iterator)localObject2).hasNext();)
/* 327:    */     {
/* 328:350 */       bry localObject3 = (bry)((Iterator)localObject2).next();
/* 329:351 */       bsa localbsa = co().c(getName(), (bry)localObject3);
/* 330:352 */       localbsa.a();
/* 331:    */     }
/* 332:    */     Object localObject3;
/* 333:355 */     EntityLiving localObject2 = bs();
/* 334:356 */     if (localObject2 != null)
/* 335:    */     {
/* 336:357 */       localObject3 = (xc)EntityList.entityEggs.get(Integer.valueOf(EntityList.a((Entity)localObject2)));
/* 337:358 */       if (localObject3 != null) {
/* 338:359 */         b(((xc)localObject3).e);
/* 339:    */       }
/* 340:361 */       ((EntityLiving)localObject2).b(this, this.aU);
/* 341:    */     }
/* 342:363 */     b(StatList.y);
/* 343:364 */     a(StatList.h);
/* 344:    */     
/* 345:366 */     br().g();
/* 346:    */   }
/* 347:    */   
/* 348:    */   public boolean a(DamageSource paramwh, float paramFloat)
/* 349:    */   {
/* 350:371 */     if (b(paramwh)) {
/* 351:372 */       return false;
/* 352:    */     }
/* 353:375 */     int j = (this.b.ad()) && (cq()) && ("fall".equals(paramwh.p)) ? 1 : 0;
/* 354:376 */     if ((j == 0) && (this.bO > 0) && (paramwh != DamageSource.j)) {
/* 355:377 */       return false;
/* 356:    */     }
/* 357:380 */     if ((paramwh instanceof wi))
/* 358:    */     {
/* 359:381 */       Entity localwv = paramwh.j();
/* 360:383 */       if (((localwv instanceof EntityPlayer)) && (!a((EntityPlayer)localwv))) {
/* 361:384 */         return false;
/* 362:    */       }
/* 363:386 */       if ((localwv instanceof ahj))
/* 364:    */       {
/* 365:387 */         ahj localahj = (ahj)localwv;
/* 366:388 */         if (((localahj.c instanceof EntityPlayer)) && (!a((EntityPlayer)localahj.c))) {
/* 367:389 */           return false;
/* 368:    */         }
/* 369:    */       }
/* 370:    */     }
/* 371:393 */     return super.a(paramwh, paramFloat);
/* 372:    */   }
/* 373:    */   
/* 374:    */   public boolean a(EntityPlayer paramahd)
/* 375:    */   {
/* 376:398 */     if (!cq()) {
/* 377:399 */       return false;
/* 378:    */     }
/* 379:401 */     return super.a(paramahd);
/* 380:    */   }
/* 381:    */   
/* 382:    */   private boolean cq()
/* 383:    */   {
/* 384:405 */     return this.b.ah();
/* 385:    */   }
/* 386:    */   
/* 387:    */   public void c(int paramInt)
/* 388:    */   {
/* 389:410 */     if ((this.dimension == 1) && (paramInt == 1))
/* 390:    */     {
/* 391:411 */       b(AchievementList.D);
/* 392:412 */       this.world.setEntityDead(this);
/* 393:413 */       this.i = true;
/* 394:414 */       this.a.a(new jo(4, 0.0F));
/* 395:    */     }
/* 396:    */     else
/* 397:    */     {
/* 398:416 */       if ((this.dimension == 0) && (paramInt == 1))
/* 399:    */       {
/* 400:417 */         b(AchievementList.C);
/* 401:418 */         BlockPosition localdt = this.b.a(paramInt).m();
/* 402:419 */         if (localdt != null) {
/* 403:420 */           this.a.a(localdt.getX(), localdt.getY(), localdt.getZ(), 0.0F, 0.0F);
/* 404:    */         }
/* 405:423 */         paramInt = 1;
/* 406:    */       }
/* 407:    */       else
/* 408:    */       {
/* 409:425 */         b(AchievementList.y);
/* 410:    */       }
/* 411:428 */       this.b.an().a(this, paramInt);
/* 412:429 */       this.bN = -1;
/* 413:430 */       this.bK = -1.0F;
/* 414:431 */       this.bL = -1;
/* 415:    */     }
/* 416:    */   }
/* 417:    */   
/* 418:    */   public boolean a(qw paramqw)
/* 419:    */   {
/* 420:437 */     if (paramqw.v()) {
/* 421:438 */       return C() == this;
/* 422:    */     }
/* 423:441 */     if (v()) {
/* 424:442 */       return false;
/* 425:    */     }
/* 426:445 */     return super.a(paramqw);
/* 427:    */   }
/* 428:    */   
/* 429:    */   private void a(bcm parambcm)
/* 430:    */   {
/* 431:449 */     if (parambcm != null)
/* 432:    */     {
/* 433:450 */       id localid = parambcm.x_();
/* 434:451 */       if (localid != null) {
/* 435:452 */         this.a.a(localid);
/* 436:    */       }
/* 437:    */     }
/* 438:    */   }
/* 439:    */   
/* 440:    */   public void a(Entity paramwv, int paramInt)
/* 441:    */   {
/* 442:459 */     super.a(paramwv, paramInt);
/* 443:460 */     this.bi.b();
/* 444:    */   }
/* 445:    */   
/* 446:    */   public ahf a(BlockPosition paramdt)
/* 447:    */   {
/* 448:465 */     ahf localahf = super.a(paramdt);
/* 449:466 */     if (localahf == ahf.a)
/* 450:    */     {
/* 451:467 */       kl localkl = new kl(this, paramdt);
/* 452:468 */       u().s().a(this, localkl);
/* 453:469 */       this.a.a(this.xPos, this.yPos, this.zPos, this.yaw, this.pitch);
/* 454:470 */       this.a.a(localkl);
/* 455:    */     }
/* 456:472 */     return localahf;
/* 457:    */   }
/* 458:    */   
/* 459:    */   public void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/* 460:    */   {
/* 461:477 */     if (bI()) {
/* 462:478 */       u().s().b(this, new ir(this, 2));
/* 463:    */     }
/* 464:480 */     super.a(paramBoolean1, paramBoolean2, paramBoolean3);
/* 465:481 */     if (this.a != null) {
/* 466:482 */       this.a.a(this.xPos, this.yPos, this.zPos, this.yaw, this.pitch);
/* 467:    */     }
/* 468:    */   }
/* 469:    */   
/* 470:    */   public void mount(Entity paramwv)
/* 471:    */   {
/* 472:488 */     Entity localwv = this.vehicle;
/* 473:489 */     super.mount(paramwv);
/* 474:490 */     if (paramwv != localwv)
/* 475:    */     {
/* 476:491 */       this.a.a(new ky(0, this, this.vehicle));
/* 477:492 */       this.a.a(this.xPos, this.yPos, this.zPos, this.yaw, this.pitch);
/* 478:    */     }
/* 479:    */   }
/* 480:    */   
/* 481:    */   protected void a(double paramDouble, boolean paramBoolean, ProtoBlock paramatr, BlockPosition paramdt) {}
/* 482:    */   
/* 483:    */   public void a(double paramDouble, boolean paramBoolean)
/* 484:    */   {
/* 485:501 */     int j = MathUtils.floor(this.xPos);
/* 486:502 */     int k = MathUtils.floor(this.yPos - 0.2000000029802322D);
/* 487:503 */     int m = MathUtils.floor(this.zPos);
/* 488:    */     
/* 489:    */ 
/* 490:506 */     BlockPosition localdt = new BlockPosition(j, k, m);
/* 491:507 */     ProtoBlock localatr1 = this.world.getBlock(localdt).getProto();
/* 492:508 */     if (localatr1.getMaterial() == Material.air)
/* 493:    */     {
/* 494:509 */       ProtoBlock localatr2 = this.world.getBlock(localdt.down()).getProto();
/* 495:510 */       if (((localatr2 instanceof avv)) || ((localatr2 instanceof bbx)) || ((localatr2 instanceof avw)))
/* 496:    */       {
/* 497:511 */         localdt = localdt.down();
/* 498:512 */         localatr1 = this.world.getBlock(localdt).getProto();
/* 499:    */       }
/* 500:    */     }
/* 501:516 */     super.a(paramDouble, paramBoolean, localatr1, localdt);
/* 502:    */   }
/* 503:    */   
/* 504:    */   public void a(bdj parambdj)
/* 505:    */   {
/* 506:521 */     parambdj.a(this);
/* 507:522 */     this.a.a(new kc(parambdj.v()));
/* 508:    */   }
/* 509:    */   
/* 510:    */   private void cr()
/* 511:    */   {
/* 512:531 */     this.bT = (this.bT % 100 + 1);
/* 513:    */   }
/* 514:    */   
/* 515:    */   public void a(vv paramvv)
/* 516:    */   {
/* 517:536 */     cr();
/* 518:537 */     this.a.a(new je(this.bT, paramvv.k(), paramvv.e_()));
/* 519:538 */     this.bi = paramvv.a(this.bg, this);
/* 520:539 */     this.bi.d = this.bT;
/* 521:540 */     this.bi.a((ail)this);
/* 522:    */   }
/* 523:    */   
/* 524:    */   public void a(vq paramvq)
/* 525:    */   {
/* 526:545 */     if (this.bi != this.bh) {
/* 527:546 */       n();
/* 528:    */     }
/* 529:549 */     if ((paramvq instanceof vy))
/* 530:    */     {
/* 531:550 */       vy localvy = (vy)paramvq;
/* 532:552 */       if ((localvy.q_()) && (!a(localvy.i())) && (!v()))
/* 533:    */       {
/* 534:553 */         this.a.a(new iz(new hz("container.isLocked", new Object[] { paramvq.e_() }), (byte)2));
/* 535:554 */         this.a.a(new jv("random.door_close", this.xPos, this.yPos, this.zPos, 1.0F, 1.0F));
/* 536:555 */         return;
/* 537:    */       }
/* 538:    */     }
/* 539:559 */     cr();
/* 540:561 */     if ((paramvq instanceof vv))
/* 541:    */     {
/* 542:562 */       this.a.a(new je(this.bT, ((vv)paramvq).k(), paramvq.e_(), paramvq.n_()));
/* 543:563 */       this.bi = ((vv)paramvq).a(this.bg, this);
/* 544:    */     }
/* 545:    */     else
/* 546:    */     {
/* 547:565 */       this.a.a(new je(this.bT, "minecraft:container", paramvq.e_(), paramvq.n_()));
/* 548:566 */       this.bi = new aim(this.bg, paramvq, this);
/* 549:    */     }
/* 550:569 */     this.bi.d = this.bT;
/* 551:570 */     this.bi.a((ail)this);
/* 552:    */   }
/* 553:    */   
/* 554:    */   public void a(aqb paramaqb)
/* 555:    */   {
/* 556:575 */     cr();
/* 557:576 */     this.bi = new ajf(this.bg, paramaqb, this.world);
/* 558:577 */     this.bi.d = this.bT;
/* 559:578 */     this.bi.a((ail)this);
/* 560:579 */     aje localaje = ((ajf)this.bi).e();
/* 561:    */     
/* 562:581 */     ho localho = paramaqb.e_();
/* 563:582 */     this.a.a(new je(this.bT, "minecraft:villager", localho, localaje.n_()));
/* 564:    */     
/* 565:584 */     aqd localaqd = paramaqb.b_(this);
/* 566:585 */     if (localaqd != null)
/* 567:    */     {
/* 568:586 */       ByteBufWrapper localhd = new ByteBufWrapper(Unpooled.buffer());
/* 569:    */       
/* 570:588 */       localhd.writeInt(this.bT);
/* 571:589 */       localaqd.a(localhd);
/* 572:    */       
/* 573:591 */       this.a.a(new ji("MC|TrList", localhd));
/* 574:    */     }
/* 575:    */   }
/* 576:    */   
/* 577:    */   public void a(EntityHorse paramabt, vq paramvq)
/* 578:    */   {
/* 579:597 */     if (this.bi != this.bh) {
/* 580:598 */       n();
/* 581:    */     }
/* 582:600 */     cr();
/* 583:601 */     this.a.a(new je(this.bT, "EntityHorse", paramvq.e_(), paramvq.n_(), paramabt.getID()));
/* 584:602 */     this.bi = new aiy(this.bg, paramvq, paramabt, this);
/* 585:603 */     this.bi.d = this.bT;
/* 586:604 */     this.bi.a((ail)this);
/* 587:    */   }
/* 588:    */   
/* 589:    */   public void a(ItemStack paramamj)
/* 590:    */   {
/* 591:609 */     Item localalq = paramamj.getItem();
/* 592:611 */     if (localalq == ItemList.bN) {
/* 593:612 */       this.a.a(new ji("MC|BOpen", new ByteBufWrapper(Unpooled.buffer())));
/* 594:    */     }
/* 595:    */   }
/* 596:    */   
/* 597:    */   public void a(aib paramaib, int paramInt, ItemStack paramamj)
/* 598:    */   {
/* 599:618 */     if ((paramaib.a(paramInt) instanceof ajj)) {
/* 600:619 */       return;
/* 601:    */     }
/* 602:622 */     if (this.g) {
/* 603:627 */       return;
/* 604:    */     }
/* 605:630 */     this.a.a(new jh(paramaib.d, paramInt, paramamj));
/* 606:    */   }
/* 607:    */   
/* 608:    */   public void a(aib paramaib)
/* 609:    */   {
/* 610:634 */     a(paramaib, paramaib.a());
/* 611:    */   }
/* 612:    */   
/* 613:    */   public void a(aib paramaib, List paramList)
/* 614:    */   {
/* 615:639 */     this.a.a(new jf(paramaib.d, paramList));
/* 616:640 */     this.a.a(new jh(-1, -1, this.bg.p()));
/* 617:    */   }
/* 618:    */   
/* 619:    */   public void a(aib paramaib, int paramInt1, int paramInt2)
/* 620:    */   {
/* 621:645 */     this.a.a(new jg(paramaib.d, paramInt1, paramInt2));
/* 622:    */   }
/* 623:    */   
/* 624:    */   public void a(aib paramaib, vq paramvq)
/* 625:    */   {
/* 626:650 */     for (int j = 0; j < paramvq.g(); j++) {
/* 627:651 */       this.a.a(new jg(paramaib.d, j, paramvq.a_(j)));
/* 628:    */     }
/* 629:    */   }
/* 630:    */   
/* 631:    */   public void n()
/* 632:    */   {
/* 633:657 */     this.a.a(new jd(this.bi.d));
/* 634:658 */     p();
/* 635:    */   }
/* 636:    */   
/* 637:    */   public void o()
/* 638:    */   {
/* 639:662 */     if (this.g) {
/* 640:667 */       return;
/* 641:    */     }
/* 642:669 */     this.a.a(new jh(-1, -1, this.bg.p()));
/* 643:    */   }
/* 644:    */   
/* 645:    */   public void p()
/* 646:    */   {
/* 647:673 */     this.bi.b((EntityPlayer)this);
/* 648:674 */     this.bi = this.bh;
/* 649:    */   }
/* 650:    */   
/* 651:    */   public void a(float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
/* 652:    */   {
/* 653:678 */     if (this.vehicle != null)
/* 654:    */     {
/* 655:679 */       if ((paramFloat1 >= -1.0F) && (paramFloat1 <= 1.0F)) {
/* 656:680 */         this.aX = paramFloat1;
/* 657:    */       }
/* 658:682 */       if ((paramFloat2 >= -1.0F) && (paramFloat2 <= 1.0F)) {
/* 659:683 */         this.aY = paramFloat2;
/* 660:    */       }
/* 661:685 */       this.aW = paramBoolean1;
/* 662:686 */       c(paramBoolean2);
/* 663:    */     }
/* 664:    */   }
/* 665:    */   
/* 666:    */   public void a(tq paramtq, int paramInt)
/* 667:    */   {
/* 668:692 */     if (paramtq == null) {
/* 669:693 */       return;
/* 670:    */     }
/* 671:696 */     this.bI.b(this, paramtq, paramInt);
/* 672:698 */     for (bry localbry : co().a(paramtq.k())) {
/* 673:699 */       co().c(getName(), localbry).a(paramInt);
/* 674:    */     }
/* 675:702 */     if (this.bI.e()) {
/* 676:703 */       this.bI.a(this);
/* 677:    */     }
/* 678:    */   }
/* 679:    */   
/* 680:    */   public void a(tq paramtq)
/* 681:    */   {
/* 682:709 */     if (paramtq == null) {
/* 683:710 */       return;
/* 684:    */     }
/* 685:713 */     this.bI.a(this, paramtq, 0);
/* 686:715 */     for (bry localbry : co().a(paramtq.k())) {
/* 687:716 */       co().c(getName(), localbry).c(0);
/* 688:    */     }
/* 689:719 */     if (this.bI.e()) {
/* 690:720 */       this.bI.a(this);
/* 691:    */     }
/* 692:    */   }
/* 693:    */   
/* 694:    */   public void q()
/* 695:    */   {
/* 696:725 */     if (this.rider != null) {
/* 697:726 */       this.rider.a(this);
/* 698:    */     }
/* 699:728 */     if (this.bu) {
/* 700:729 */       a(true, false, false);
/* 701:    */     }
/* 702:    */   }
/* 703:    */   
/* 704:    */   public void r()
/* 705:    */   {
/* 706:734 */     this.bK = -1.0E+008F;
/* 707:    */   }
/* 708:    */   
/* 709:    */   public void b(ho paramho)
/* 710:    */   {
/* 711:739 */     this.a.a(new iz(paramho));
/* 712:    */   }
/* 713:    */   
/* 714:    */   protected void s()
/* 715:    */   {
/* 716:744 */     this.a.a(new jk(this, (byte)9));
/* 717:745 */     super.s();
/* 718:    */   }
/* 719:    */   
/* 720:    */   public void a(ItemStack paramamj, int paramInt)
/* 721:    */   {
/* 722:750 */     super.a(paramamj, paramInt);
/* 723:752 */     if ((paramamj != null) && (paramamj.getItem() != null) && (paramamj.getItem().e(paramamj) == ano.b)) {
/* 724:753 */       u().s().b(this, new ir(this, 3));
/* 725:    */     }
/* 726:    */   }
/* 727:    */   
/* 728:    */   public void a(EntityPlayer paramahd, boolean paramBoolean)
/* 729:    */   {
/* 730:759 */     super.a(paramahd, paramBoolean);
/* 731:760 */     this.bN = -1;
/* 732:761 */     this.bK = -1.0F;
/* 733:762 */     this.bL = -1;
/* 734:763 */     this.bH.addAll(((qw)paramahd).bH);
/* 735:    */   }
/* 736:    */   
/* 737:    */   protected void a(PotionEffect paramwq)
/* 738:    */   {
/* 739:768 */     super.a(paramwq);
/* 740:769 */     this.a.a(new lr(getID(), paramwq));
/* 741:    */   }
/* 742:    */   
/* 743:    */   protected void a(PotionEffect paramwq, boolean paramBoolean)
/* 744:    */   {
/* 745:774 */     super.a(paramwq, paramBoolean);
/* 746:775 */     this.a.a(new lr(getID(), paramwq));
/* 747:    */   }
/* 748:    */   
/* 749:    */   protected void b(PotionEffect paramwq)
/* 750:    */   {
/* 751:780 */     super.b(paramwq);
/* 752:781 */     this.a.a(new kn(getID(), paramwq));
/* 753:    */   }
/* 754:    */   
/* 755:    */   public void setPosition(double paramDouble1, double paramDouble2, double paramDouble3)
/* 756:    */   {
/* 757:786 */     this.a.a(paramDouble1, paramDouble2, paramDouble3, this.yaw, this.pitch);
/* 758:    */   }
/* 759:    */   
/* 760:    */   public void b(Entity paramwv)
/* 761:    */   {
/* 762:791 */     u().s().b(this, new ir(paramwv, 4));
/* 763:    */   }
/* 764:    */   
/* 765:    */   public void c(Entity paramwv)
/* 766:    */   {
/* 767:796 */     u().s().b(this, new ir(paramwv, 5));
/* 768:    */   }
/* 769:    */   
/* 770:    */   public void t()
/* 771:    */   {
/* 772:801 */     if (this.a == null) {
/* 773:802 */       return;
/* 774:    */     }
/* 775:804 */     this.a.a(new kd(this.by));
/* 776:805 */     B();
/* 777:    */   }
/* 778:    */   
/* 779:    */   public WorldServer u()
/* 780:    */   {
/* 781:809 */     return (WorldServer)this.world;
/* 782:    */   }
/* 783:    */   
/* 784:    */   public void a(EnumGameType paramarc)
/* 785:    */   {
/* 786:814 */     this.c.a(paramarc);
/* 787:815 */     this.a.a(new jo(3, paramarc.a()));
/* 788:817 */     if (paramarc == EnumGameType.e) {
/* 789:818 */       mount((Entity)null);
/* 790:    */     } else {
/* 791:820 */       e(this);
/* 792:    */     }
/* 793:823 */     t();
/* 794:824 */     bO();
/* 795:    */   }
/* 796:    */   
/* 797:    */   public boolean v()
/* 798:    */   {
/* 799:829 */     return this.c.b() == EnumGameType.e;
/* 800:    */   }
/* 801:    */   
/* 802:    */   public void a(ho paramho)
/* 803:    */   {
/* 804:834 */     this.a.a(new iz(paramho));
/* 805:    */   }
/* 806:    */   
/* 807:    */   public boolean a(int paramInt, String paramString)
/* 808:    */   {
/* 809:839 */     if (("seed".equals(paramString)) && (!this.b.ad())) {
/* 810:840 */       return true;
/* 811:    */     }
/* 812:842 */     if (("tell".equals(paramString)) || ("help".equals(paramString)) || ("me".equals(paramString)) || ("trigger".equals(paramString))) {
/* 813:843 */       return true;
/* 814:    */     }
/* 815:845 */     if (this.b.an().g(cc()))
/* 816:    */     {
/* 817:846 */       sq localsq = (sq)this.b.an().n().b((Object)cc());
/* 818:847 */       if (localsq != null) {
/* 819:848 */         return localsq.a() >= paramInt;
/* 820:    */       }
/* 821:850 */       return this.b.p() >= paramInt;
/* 822:    */     }
/* 823:852 */     return false;
/* 824:    */   }
/* 825:    */   
/* 826:    */   public String w()
/* 827:    */   {
/* 828:856 */     String str = this.a.a.b().toString();
/* 829:857 */     str = str.substring(str.indexOf("/") + 1);
/* 830:858 */     str = str.substring(0, str.indexOf(":"));
/* 831:859 */     return str;
/* 832:    */   }
/* 833:    */   
/* 834:    */   public void a(lx paramlx)
/* 835:    */   {
/* 836:863 */     this.bG = paramlx.a();
/* 837:    */     
/* 838:865 */     this.bP = paramlx.c();
/* 839:866 */     this.bQ = paramlx.d();
/* 840:    */     
/* 841:868 */     H().b(10, Byte.valueOf((byte)paramlx.e()));
/* 842:    */   }
/* 843:    */   
/* 844:    */   public ahg y()
/* 845:    */   {
/* 846:876 */     return this.bP;
/* 847:    */   }
/* 848:    */   
/* 849:    */   public void a(String paramString1, String paramString2)
/* 850:    */   {
/* 851:880 */     this.a.a(new ko(paramString1, paramString2));
/* 852:    */   }
/* 853:    */   
/* 854:    */   public BlockPosition c()
/* 855:    */   {
/* 856:885 */     return new BlockPosition(this.xPos, this.yPos + 0.5D, this.zPos);
/* 857:    */   }
/* 858:    */   
/* 859:    */   public void z()
/* 860:    */   {
/* 861:889 */     this.bR = MinecraftServer.ax();
/* 862:    */   }
/* 863:    */   
/* 864:    */   public tp A()
/* 865:    */   {
/* 866:893 */     return this.bI;
/* 867:    */   }
/* 868:    */   
/* 869:    */   public void d(Entity paramwv)
/* 870:    */   {
/* 871:897 */     if ((paramwv instanceof EntityPlayer)) {
/* 872:898 */       this.a.a(new km(new int[] { paramwv.getID() }));
/* 873:    */     } else {
/* 874:900 */       this.bH.add(Integer.valueOf(paramwv.getID()));
/* 875:    */     }
/* 876:    */   }
/* 877:    */   
/* 878:    */   protected void B()
/* 879:    */   {
/* 880:906 */     if (v())
/* 881:    */     {
/* 882:907 */       bi();
/* 883:908 */       e(true);
/* 884:    */     }
/* 885:    */     else
/* 886:    */     {
/* 887:910 */       super.B();
/* 888:    */     }
/* 889:913 */     u().s().a(this);
/* 890:    */   }
/* 891:    */   
/* 892:    */   public Entity C()
/* 893:    */   {
/* 894:917 */     return this.bS == null ? this : this.bS;
/* 895:    */   }
/* 896:    */   
/* 897:    */   public void e(Entity paramwv)
/* 898:    */   {
/* 899:921 */     Entity localwv = C();
/* 900:922 */     this.bS = (paramwv == null ? this : paramwv);
/* 901:924 */     if (localwv != this.bS)
/* 902:    */     {
/* 903:925 */       this.a.a(new ku(this.bS));
/* 904:926 */       setPosition(this.bS.xPos, this.bS.yPos, this.bS.zPos);
/* 905:    */     }
/* 906:    */   }
/* 907:    */   
/* 908:    */   public void f(Entity paramwv)
/* 909:    */   {
/* 910:932 */     if (this.c.b() == EnumGameType.e) {
/* 911:933 */       e(paramwv);
/* 912:    */     } else {
/* 913:935 */       super.f(paramwv);
/* 914:    */     }
/* 915:    */   }
/* 916:    */   
/* 917:    */   public long D()
/* 918:    */   {
/* 919:940 */     return this.bR;
/* 920:    */   }
/* 921:    */   
/* 922:    */   public ho E()
/* 923:    */   {
/* 924:945 */     return null;
/* 925:    */   }
/* 926:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     qw
 * JD-Core Version:    0.7.0.1
 */
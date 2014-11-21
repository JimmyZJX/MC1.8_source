package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   3:    */ import java.util.UUID;
/*   4:    */ 
/*   5:    */ public abstract class EntityMob
/*   6:    */   extends EntityLiving
/*   7:    */ {
/*   8:    */   public int a_;
/*   9:    */   protected int b_;
/*  10:    */   private ym a;
/*  11:    */   protected yn f;
/*  12:    */   protected yl g;
/*  13:    */   private yj b;
/*  14:    */   protected aaz h;
/*  15:    */   protected final zc i;
/*  16:    */   protected final zc bg;
/*  17:    */   private EntityLiving c;
/*  18:    */   private abd bi;
/*  19: 69 */   private ItemStack[] bj = new ItemStack[5];
/*  20: 70 */   protected float[] bh = new float[5];
/*  21:    */   private boolean bk;
/*  22:    */   private boolean bl;
/*  23:    */   private boolean bm;
/*  24:    */   private Entity bn;
/*  25:    */   private NBTTagCompound bo;
/*  26:    */   
/*  27:    */   public EntityMob(World paramaqu)
/*  28:    */   {
/*  29: 75 */     super(paramaqu);
/*  30:    */     
/*  31: 77 */     this.i = new zc((paramaqu == null) || (paramaqu.profiler == null) ? null : paramaqu.profiler);
/*  32: 78 */     this.bg = new zc((paramaqu == null) || (paramaqu.profiler == null) ? null : paramaqu.profiler);
/*  33: 79 */     this.a = new ym(this);
/*  34: 80 */     this.f = new yn(this);
/*  35: 81 */     this.g = new yl(this);
/*  36: 82 */     this.b = new yj(this);
/*  37: 83 */     this.h = b(paramaqu);
/*  38: 84 */     this.bi = new abd(this);
/*  39: 86 */     for (int j = 0; j < this.bh.length; j++) {
/*  40: 87 */       this.bh[j] = 0.085F;
/*  41:    */     }
/*  42:    */   }
/*  43:    */   
/*  44:    */   protected void aW()
/*  45:    */   {
/*  46: 93 */     super.aW();
/*  47:    */     
/*  48: 95 */     bx().b(afs.b).a(16.0D);
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected aaz b(World paramaqu)
/*  52:    */   {
/*  53: 99 */     return new aay(this, paramaqu);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public ym p()
/*  57:    */   {
/*  58:103 */     return this.a;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public yn q()
/*  62:    */   {
/*  63:107 */     return this.f;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public yl r()
/*  67:    */   {
/*  68:111 */     return this.g;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public aaz s()
/*  72:    */   {
/*  73:115 */     return this.h;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public abd t()
/*  77:    */   {
/*  78:119 */     return this.bi;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public EntityLiving u()
/*  82:    */   {
/*  83:123 */     return this.c;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void d(EntityLiving paramxm)
/*  87:    */   {
/*  88:127 */     this.c = paramxm;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public boolean a(Class<? extends EntityLiving> paramClass)
/*  92:    */   {
/*  93:131 */     return paramClass != EntityGhast.class;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void v() {}
/*  97:    */   
/*  98:    */   protected void h()
/*  99:    */   {
/* 100:140 */     super.h();
/* 101:141 */     this.ac.a(15, Byte.valueOf((byte)0));
/* 102:    */   }
/* 103:    */   
/* 104:    */   public int w()
/* 105:    */   {
/* 106:145 */     return 80;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void x()
/* 110:    */   {
/* 111:149 */     String str = z();
/* 112:150 */     if (str != null) {
/* 113:151 */       a(str, bA(), bB());
/* 114:    */     }
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void onEntityUpdate()
/* 118:    */   {
/* 119:157 */     super.onEntityUpdate();
/* 120:    */     
/* 121:159 */     this.world.profiler.a("mobBaseTick");
/* 122:160 */     if ((ai()) && (this.rng.nextInt(1000) < this.a_++))
/* 123:    */     {
/* 124:161 */       this.a_ = (-w());
/* 125:162 */       x();
/* 126:    */     }
/* 127:164 */     this.world.profiler.b();
/* 128:    */   }
/* 129:    */   
/* 130:    */   protected int b(EntityPlayer paramahd)
/* 131:    */   {
/* 132:169 */     if (this.b_ > 0)
/* 133:    */     {
/* 134:170 */       int j = this.b_;
/* 135:    */       
/* 136:172 */       ItemStack[] arrayOfamj = at();
/* 137:173 */       for (int k = 0; k < arrayOfamj.length; k++) {
/* 138:174 */         if ((arrayOfamj[k] != null) && (this.bh[k] <= 1.0F)) {
/* 139:175 */           j += 1 + this.rng.nextInt(3);
/* 140:    */         }
/* 141:    */       }
/* 142:179 */       return j;
/* 143:    */     }
/* 144:181 */     return this.b_;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void y()
/* 148:    */   {
/* 149:186 */     if (this.world.isClient) {
/* 150:187 */       for (int j = 0; j < 20; j++)
/* 151:    */       {
/* 152:188 */         double d1 = this.rng.nextGaussian() * 0.02D;
/* 153:189 */         double d2 = this.rng.nextGaussian() * 0.02D;
/* 154:190 */         double d3 = this.rng.nextGaussian() * 0.02D;
/* 155:191 */         double d4 = 10.0D;
/* 156:192 */         this.world.a(EnumParticleEffect.EXPLOSION_NORMAL, this.xPos + this.rng.nextFloat() * this.width * 2.0F - this.width - d1 * d4, this.yPos + this.rng.nextFloat() * this.height - d2 * d4, this.zPos + this.rng.nextFloat() * this.width * 2.0F - this.width - d3 * d4, d1, d2, d3, new int[0]);
/* 157:    */       }
/* 158:    */     } else {
/* 159:196 */       this.world.sendSignal(this, (byte)20);
/* 160:    */     }
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void onSignal(byte paramByte)
/* 164:    */   {
/* 165:202 */     if (paramByte == 20) {
/* 166:203 */       y();
/* 167:    */     } else {
/* 168:205 */       super.onSignal(paramByte);
/* 169:    */     }
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void onUpdate()
/* 173:    */   {
/* 174:211 */     super.onUpdate();
/* 175:213 */     if (!this.world.isClient) {
/* 176:214 */       bZ();
/* 177:    */     }
/* 178:    */   }
/* 179:    */   
/* 180:    */   protected float h(float paramFloat1, float paramFloat2)
/* 181:    */   {
/* 182:220 */     this.b.a();
/* 183:221 */     return paramFloat2;
/* 184:    */   }
/* 185:    */   
/* 186:    */   protected String z()
/* 187:    */   {
/* 188:226 */     return null;
/* 189:    */   }
/* 190:    */   
/* 191:    */   protected Item A()
/* 192:    */   {
/* 193:230 */     return null;
/* 194:    */   }
/* 195:    */   
/* 196:    */   protected void b(boolean paramBoolean, int paramInt)
/* 197:    */   {
/* 198:235 */     Item localalq = A();
/* 199:236 */     if (localalq != null)
/* 200:    */     {
/* 201:237 */       int j = this.rng.nextInt(3);
/* 202:238 */       if (paramInt > 0) {
/* 203:239 */         j += this.rng.nextInt(paramInt + 1);
/* 204:    */       }
/* 205:241 */       for (int k = 0; k < j; k++) {
/* 206:242 */         a(localalq, 1);
/* 207:    */       }
/* 208:    */     }
/* 209:    */   }
/* 210:    */   
/* 211:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 212:    */   {
/* 213:249 */     super.writeEntityToNBT(paramfn);
/* 214:250 */     paramfn.setBoolean("CanPickUpLoot", bX());
/* 215:251 */     paramfn.setBoolean("PersistenceRequired", this.bl);
/* 216:    */     
/* 217:253 */     fv localfv1 = new fv();
/* 218:254 */     for (int j = 0; j < this.bj.length; j++)
/* 219:    */     {
/* 220:255 */       NBTTagCompound localfn1 = new NBTTagCompound();
/* 221:256 */       if (this.bj[j] != null) {
/* 222:257 */         this.bj[j].writeToNBT(localfn1);
/* 223:    */       }
/* 224:259 */       localfv1.a(localfn1);
/* 225:    */     }
/* 226:261 */     paramfn.setNBT("Equipment", localfv1);
/* 227:    */     
/* 228:263 */     fv localfv2 = new fv();
/* 229:264 */     for (int k = 0; k < this.bh.length; k++) {
/* 230:265 */       localfv2.a(new fs(this.bh[k]));
/* 231:    */     }
/* 232:267 */     paramfn.setNBT("DropChances", localfv2);
/* 233:    */     
/* 234:    */ 
/* 235:270 */     paramfn.setBoolean("Leashed", this.bm);
/* 236:271 */     if (this.bn != null)
/* 237:    */     {
/* 238:272 */       NBTTagCompound localfn2 = new NBTTagCompound();
/* 239:273 */       if ((this.bn instanceof EntityLiving))
/* 240:    */       {
/* 241:275 */         localfn2.a("UUIDMost", this.bn.getUUID().getMostSignificantBits());
/* 242:276 */         localfn2.a("UUIDLeast", this.bn.getUUID().getLeastSignificantBits());
/* 243:    */       }
/* 244:277 */       else if ((this.bn instanceof EntityFrame))
/* 245:    */       {
/* 246:279 */         BlockPosition localdt = ((EntityFrame)this.bn).n();
/* 247:280 */         localfn2.setInt("X", localdt.getX());
/* 248:281 */         localfn2.setInt("Y", localdt.getY());
/* 249:282 */         localfn2.setInt("Z", localdt.getZ());
/* 250:    */       }
/* 251:284 */       paramfn.setNBT("Leash", localfn2);
/* 252:    */     }
/* 253:287 */     if (cd()) {
/* 254:288 */       paramfn.setBoolean("NoAI", cd());
/* 255:    */     }
/* 256:    */   }
/* 257:    */   
/* 258:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 259:    */   {
/* 260:295 */     super.readEntityFromNBT(paramfn);
/* 261:297 */     if (paramfn.hasKey("CanPickUpLoot", 1)) {
/* 262:298 */       j(paramfn.getBoolean("CanPickUpLoot"));
/* 263:    */     }
/* 264:300 */     this.bl = paramfn.getBoolean("PersistenceRequired");
/* 265:    */     fv localfv;
/* 266:    */     int j;
/* 267:302 */     if (paramfn.hasKey("Equipment", 9))
/* 268:    */     {
/* 269:303 */       localfv = paramfn.c("Equipment", 10);
/* 270:305 */       for (j = 0; j < this.bj.length; j++) {
/* 271:306 */         this.bj[j] = ItemStack.loadItemStackFromNBT(localfv.b(j));
/* 272:    */       }
/* 273:    */     }
/* 274:310 */     if (paramfn.hasKey("DropChances", 9))
/* 275:    */     {
/* 276:311 */       localfv = paramfn.c("DropChances", 5);
/* 277:312 */       for (j = 0; j < localfv.c(); j++) {
/* 278:313 */         this.bh[j] = localfv.e(j);
/* 279:    */       }
/* 280:    */     }
/* 281:317 */     this.bm = paramfn.getBoolean("Leashed");
/* 282:318 */     if ((this.bm) && (paramfn.hasKey("Leash", 10))) {
/* 283:319 */       this.bo = paramfn.getCompoundTag("Leash");
/* 284:    */     }
/* 285:322 */     k(paramfn.getBoolean("NoAI"));
/* 286:    */   }
/* 287:    */   
/* 288:    */   public void m(float paramFloat)
/* 289:    */   {
/* 290:328 */     this.aY = paramFloat;
/* 291:    */   }
/* 292:    */   
/* 293:    */   public void j(float paramFloat)
/* 294:    */   {
/* 295:333 */     super.j(paramFloat);
/* 296:334 */     m(paramFloat);
/* 297:    */   }
/* 298:    */   
/* 299:    */   public void m()
/* 300:    */   {
/* 301:339 */     super.m();
/* 302:    */     
/* 303:341 */     this.world.profiler.a("looting");
/* 304:342 */     if ((!this.world.isClient) && (bX()) && (!this.aN) && (this.world.getGameRules().getBoolean("mobGriefing")))
/* 305:    */     {
/* 306:343 */       List<EntityItem> localList = this.world.getEntityList(EntityItem.class, getAABB().expand(1.0D, 0.0D, 1.0D));
/* 307:344 */       for (EntityItem localadw : localList) {
/* 308:345 */         if ((!localadw.isDead) && (localadw.getItemStack() != null) && (!localadw.s())) {
/* 309:348 */           onPickup(localadw);
/* 310:    */         }
/* 311:    */       }
/* 312:    */     }
/* 313:351 */     this.world.profiler.b();
/* 314:    */   }
/* 315:    */   
/* 316:    */   protected void onPickup(EntityItem paramadw)
/* 317:    */   {
/* 318:355 */     ItemStack localamj1 = paramadw.getItemStack();
/* 319:356 */     int j = c(localamj1);
/* 320:358 */     if (j > -1)
/* 321:    */     {
/* 322:359 */       int k = 1;
/* 323:360 */       ItemStack localamj2 = p(j);
/* 324:    */       Object localObject1;
/* 325:362 */       if (localamj2 != null)
/* 326:    */       {
/* 327:    */         Object localObject2;
/* 328:363 */         if (j == 0)
/* 329:    */         {
/* 330:364 */           if (((localamj1.getItem() instanceof ItemSword)) && (!(localamj2.getItem() instanceof ItemSword)))
/* 331:    */           {
/* 332:365 */             k = 1;
/* 333:    */           }
/* 334:366 */           else if (((localamj1.getItem() instanceof ItemSword)) && ((localamj2.getItem() instanceof ItemSword)))
/* 335:    */           {
/* 336:367 */             localObject1 = (ItemSword)localamj1.getItem();
/* 337:368 */             localObject2 = (ItemSword)localamj2.getItem();
/* 338:370 */             if (((ItemSword)localObject1).g() == ((ItemSword)localObject2).g()) {
/* 339:371 */               k = (localamj1.getDamage2() > localamj2.getDamage2()) || ((localamj1.hasTagCompound()) && (!localamj2.hasTagCompound())) ? 1 : 0;
/* 340:    */             } else {
/* 341:373 */               k = ((ItemSword)localObject1).g() > ((ItemSword)localObject2).g() ? 1 : 0;
/* 342:    */             }
/* 343:    */           }
/* 344:375 */           else if (((localamj1.getItem() instanceof ajz)) && ((localamj2.getItem() instanceof ajz)))
/* 345:    */           {
/* 346:376 */             k = (localamj1.hasTagCompound()) && (!localamj2.hasTagCompound()) ? 1 : 0;
/* 347:    */           }
/* 348:    */           else
/* 349:    */           {
/* 350:378 */             k = 0;
/* 351:    */           }
/* 352:    */         }
/* 353:381 */         else if (((localamj1.getItem() instanceof ajn)) && (!(localamj2.getItem() instanceof ajn)))
/* 354:    */         {
/* 355:382 */           k = 1;
/* 356:    */         }
/* 357:383 */         else if (((localamj1.getItem() instanceof ajn)) && ((localamj2.getItem() instanceof ajn)))
/* 358:    */         {
/* 359:384 */           localObject1 = (ajn)localamj1.getItem();
/* 360:385 */           localObject2 = (ajn)localamj2.getItem();
/* 361:387 */           if (((ajn)localObject1).c == ((ajn)localObject2).c) {
/* 362:388 */             k = (localamj1.getDamage2() > localamj2.getDamage2()) || ((localamj1.hasTagCompound()) && (!localamj2.hasTagCompound())) ? 1 : 0;
/* 363:    */           } else {
/* 364:390 */             k = ((ajn)localObject1).c > ((ajn)localObject2).c ? 1 : 0;
/* 365:    */           }
/* 366:    */         }
/* 367:    */         else
/* 368:    */         {
/* 369:393 */           k = 0;
/* 370:    */         }
/* 371:    */       }
/* 372:398 */       if ((k != 0) && (a(localamj1)))
/* 373:    */       {
/* 374:399 */         if ((localamj2 != null) && (this.rng.nextFloat() - 0.1F < this.bh[j])) {
/* 375:400 */           a(localamj2, 0.0F);
/* 376:    */         }
/* 377:403 */         if ((localamj1.getItem() == ItemList.diamond) && (paramadw.getThrower() != null))
/* 378:    */         {
/* 379:404 */           localObject1 = this.world.a(paramadw.getThrower());
/* 380:405 */           if (localObject1 != null) {
/* 381:406 */             ((EntityPlayer)localObject1).b(AchievementList.x);
/* 382:    */           }
/* 383:    */         }
/* 384:410 */         c(j, localamj1);
/* 385:411 */         this.bh[j] = 2.0F;
/* 386:412 */         this.bl = true;
/* 387:413 */         a(paramadw, 1);
/* 388:414 */         paramadw.setDead();
/* 389:    */       }
/* 390:    */     }
/* 391:    */   }
/* 392:    */   
/* 393:    */   protected boolean a(ItemStack paramamj)
/* 394:    */   {
/* 395:420 */     return true;
/* 396:    */   }
/* 397:    */   
/* 398:    */   protected boolean C()
/* 399:    */   {
/* 400:424 */     return true;
/* 401:    */   }
/* 402:    */   
/* 403:    */   protected void D()
/* 404:    */   {
/* 405:428 */     if (this.bl)
/* 406:    */     {
/* 407:429 */       this.aO = 0;
/* 408:430 */       return;
/* 409:    */     }
/* 410:433 */     EntityPlayer localahd = this.world.a(this, -1.0D);
/* 411:434 */     if (localahd != null)
/* 412:    */     {
/* 413:435 */       double d1 = localahd.xPos - this.xPos;
/* 414:436 */       double d2 = localahd.yPos - this.yPos;
/* 415:437 */       double d3 = localahd.zPos - this.zPos;
/* 416:438 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 417:440 */       if ((C()) && (d4 > 16384.0D)) {
/* 418:441 */         setDead();
/* 419:    */       }
/* 420:444 */       if ((this.aO > 600) && (this.rng.nextInt(800) == 0) && (d4 > 1024.0D) && (C())) {
/* 421:445 */         setDead();
/* 422:446 */       } else if (d4 < 1024.0D) {
/* 423:447 */         this.aO = 0;
/* 424:    */       }
/* 425:    */     }
/* 426:    */   }
/* 427:    */   
/* 428:    */   protected final void bJ()
/* 429:    */   {
/* 430:455 */     this.aO += 1;
/* 431:456 */     this.world.profiler.a("checkDespawn");
/* 432:457 */     D();
/* 433:458 */     this.world.profiler.b();
/* 434:    */     
/* 435:460 */     this.world.profiler.a("sensing");
/* 436:461 */     this.bi.a();
/* 437:462 */     this.world.profiler.b();
/* 438:    */     
/* 439:464 */     this.world.profiler.a("targetSelector");
/* 440:465 */     this.bg.a();
/* 441:466 */     this.world.profiler.b();
/* 442:    */     
/* 443:468 */     this.world.profiler.a("goalSelector");
/* 444:469 */     this.i.a();
/* 445:470 */     this.world.profiler.b();
/* 446:    */     
/* 447:472 */     this.world.profiler.a("navigation");
/* 448:473 */     this.h.k();
/* 449:474 */     this.world.profiler.b();
/* 450:    */     
/* 451:476 */     this.world.profiler.a("mob tick");
/* 452:477 */     E();
/* 453:478 */     this.world.profiler.b();
/* 454:    */     
/* 455:480 */     this.world.profiler.a("controls");
/* 456:481 */     this.world.profiler.a("move");
/* 457:482 */     this.f.c();
/* 458:483 */     this.world.profiler.c("look");
/* 459:484 */     this.a.a();
/* 460:485 */     this.world.profiler.c("jump");
/* 461:486 */     this.g.b();
/* 462:487 */     this.world.profiler.b();
/* 463:488 */     this.world.profiler.b();
/* 464:    */   }
/* 465:    */   
/* 466:    */   protected void E() {}
/* 467:    */   
/* 468:    */   public int bP()
/* 469:    */   {
/* 470:495 */     return 40;
/* 471:    */   }
/* 472:    */   
/* 473:    */   public void a(Entity paramwv, float paramFloat1, float paramFloat2)
/* 474:    */   {
/* 475:499 */     double d1 = paramwv.xPos - this.xPos;
/* 476:    */     
/* 477:501 */     double d3 = paramwv.zPos - this.zPos;
/* 478:    */     double d2;
/* 479:503 */     if ((paramwv instanceof EntityLiving))
/* 480:    */     {
/* 481:504 */       EntityLiving localxm = (EntityLiving)paramwv;
/* 482:505 */       d2 = localxm.yPos + localxm.aR() - (this.yPos + aR());
/* 483:    */     }
/* 484:    */     else
/* 485:    */     {
/* 486:507 */       d2 = (paramwv.getAABB().minY + paramwv.getAABB().maxY) / 2.0D - (this.yPos + aR());
/* 487:    */     }
/* 488:510 */     double d4 = MathUtils.a(d1 * d1 + d3 * d3);
/* 489:    */     
/* 490:512 */     float f1 = (float)(Math.atan2(d3, d1) * 180.0D / 3.141592741012573D) - 90.0F;
/* 491:513 */     float f2 = (float)-(Math.atan2(d2, d4) * 180.0D / 3.141592741012573D);
/* 492:514 */     this.pitch = b(this.pitch, f2, paramFloat2);
/* 493:515 */     this.yaw = b(this.yaw, f1, paramFloat1);
/* 494:    */   }
/* 495:    */   
/* 496:    */   private float b(float paramFloat1, float paramFloat2, float paramFloat3)
/* 497:    */   {
/* 498:519 */     float f1 = MathUtils.wrapDegrees(paramFloat2 - paramFloat1);
/* 499:520 */     if (f1 > paramFloat3) {
/* 500:521 */       f1 = paramFloat3;
/* 501:    */     }
/* 502:523 */     if (f1 < -paramFloat3) {
/* 503:524 */       f1 = -paramFloat3;
/* 504:    */     }
/* 505:526 */     return paramFloat1 + f1;
/* 506:    */   }
/* 507:    */   
/* 508:    */   public boolean canSpawn()
/* 509:    */   {
/* 510:530 */     return true;
/* 511:    */   }
/* 512:    */   
/* 513:    */   public boolean spawnAABBCheck()
/* 514:    */   {
/* 515:534 */     return (this.world.isCollisionFree(getAABB(), this)) && (this.world.getCollidingAABBs(this, getAABB()).isEmpty()) && (!this.world.isInLiquid(getAABB()));
/* 516:    */   }
/* 517:    */   
/* 518:    */   public float bS()
/* 519:    */   {
/* 520:539 */     return 1.0F;
/* 521:    */   }
/* 522:    */   
/* 523:    */   public int getMaxSpawnedInChunk()
/* 524:    */   {
/* 525:547 */     return 4;
/* 526:    */   }
/* 527:    */   
/* 528:    */   public int aF()
/* 529:    */   {
/* 530:552 */     if (u() == null) {
/* 531:553 */       return 3;
/* 532:    */     }
/* 533:555 */     int j = (int)(getHealth() - bt() * 0.33F);
/* 534:556 */     j -= (3 - this.world.getDifficulty().a()) * 4;
/* 535:557 */     if (j < 0) {
/* 536:558 */       j = 0;
/* 537:    */     }
/* 538:560 */     return j + 3;
/* 539:    */   }
/* 540:    */   
/* 541:    */   public ItemStack bz()
/* 542:    */   {
/* 543:565 */     return this.bj[0];
/* 544:    */   }
/* 545:    */   
/* 546:    */   public ItemStack p(int paramInt)
/* 547:    */   {
/* 548:570 */     return this.bj[paramInt];
/* 549:    */   }
/* 550:    */   
/* 551:    */   public ItemStack q(int paramInt)
/* 552:    */   {
/* 553:575 */     return this.bj[(paramInt + 1)];
/* 554:    */   }
/* 555:    */   
/* 556:    */   public void c(int paramInt, ItemStack paramamj)
/* 557:    */   {
/* 558:580 */     this.bj[paramInt] = paramamj;
/* 559:    */   }
/* 560:    */   
/* 561:    */   public ItemStack[] at()
/* 562:    */   {
/* 563:585 */     return this.bj;
/* 564:    */   }
/* 565:    */   
/* 566:    */   protected void a(boolean paramBoolean, int paramInt)
/* 567:    */   {
/* 568:590 */     for (int j = 0; j < at().length; j++)
/* 569:    */     {
/* 570:591 */       ItemStack localamj = p(j);
/* 571:592 */       int k = this.bh[j] > 1.0F ? 1 : 0;
/* 572:594 */       if ((localamj != null) && ((paramBoolean) || (k != 0)) && (this.rng.nextFloat() - paramInt * 0.01F < this.bh[j]))
/* 573:    */       {
/* 574:595 */         if ((k == 0) && (localamj.e()))
/* 575:    */         {
/* 576:596 */           int m = Math.max(localamj.j() - 25, 1);
/* 577:597 */           int n = localamj.j() - this.rng.nextInt(this.rng.nextInt(m) + 1);
/* 578:598 */           if (n > m) {
/* 579:599 */             n = m;
/* 580:    */           }
/* 581:601 */           if (n < 1) {
/* 582:602 */             n = 1;
/* 583:    */           }
/* 584:604 */           localamj.b(n);
/* 585:    */         }
/* 586:606 */         a(localamj, 0.0F);
/* 587:    */       }
/* 588:    */     }
/* 589:    */   }
/* 590:    */   
/* 591:    */   protected void a(vu paramvu)
/* 592:    */   {
/* 593:612 */     if (this.rng.nextFloat() < 0.15F * paramvu.c())
/* 594:    */     {
/* 595:613 */       int j = this.rng.nextInt(2);
/* 596:614 */       float f1 = this.world.getDifficulty() == EnumDifficulty.HARD ? 0.1F : 0.25F;
/* 597:615 */       if (this.rng.nextFloat() < 0.095F) {
/* 598:616 */         j++;
/* 599:    */       }
/* 600:618 */       if (this.rng.nextFloat() < 0.095F) {
/* 601:619 */         j++;
/* 602:    */       }
/* 603:621 */       if (this.rng.nextFloat() < 0.095F) {
/* 604:622 */         j++;
/* 605:    */       }
/* 606:625 */       for (int k = 3; k >= 0; k--)
/* 607:    */       {
/* 608:626 */         ItemStack localamj = q(k);
/* 609:627 */         if ((k < 3) && (this.rng.nextFloat() < f1)) {
/* 610:    */           break;
/* 611:    */         }
/* 612:630 */         if (localamj == null)
/* 613:    */         {
/* 614:631 */           Item localalq = a(k + 1, j);
/* 615:632 */           if (localalq != null) {
/* 616:633 */             c(k + 1, new ItemStack(localalq));
/* 617:    */           }
/* 618:    */         }
/* 619:    */       }
/* 620:    */     }
/* 621:    */   }
/* 622:    */   
/* 623:    */   public static int c(ItemStack paramamj)
/* 624:    */   {
/* 625:641 */     if ((paramamj.getItem() == Item.fromProtoBlock(BlockList.pumpkin)) || (paramamj.getItem() == ItemList.bX)) {
/* 626:642 */       return 4;
/* 627:    */     }
/* 628:645 */     if ((paramamj.getItem() instanceof ajn)) {
/* 629:646 */       switch (((ajn)paramamj.getItem()).b)
/* 630:    */       {
/* 631:    */       case 3: 
/* 632:648 */         return 1;
/* 633:    */       case 2: 
/* 634:650 */         return 2;
/* 635:    */       case 1: 
/* 636:652 */         return 3;
/* 637:    */       case 0: 
/* 638:654 */         return 4;
/* 639:    */       }
/* 640:    */     }
/* 641:658 */     return 0;
/* 642:    */   }
/* 643:    */   
/* 644:    */   public static Item a(int paramInt1, int paramInt2)
/* 645:    */   {
/* 646:662 */     switch (paramInt1)
/* 647:    */     {
/* 648:    */     case 4: 
/* 649:664 */       if (paramInt2 == 0) {
/* 650:665 */         return ItemList.Q;
/* 651:    */       }
/* 652:667 */       if (paramInt2 == 1) {
/* 653:668 */         return ItemList.ag;
/* 654:    */       }
/* 655:670 */       if (paramInt2 == 2) {
/* 656:671 */         return ItemList.U;
/* 657:    */       }
/* 658:673 */       if (paramInt2 == 3) {
/* 659:674 */         return ItemList.Y;
/* 660:    */       }
/* 661:676 */       if (paramInt2 == 4) {
/* 662:677 */         return ItemList.ac;
/* 663:    */       }
/* 664:    */     case 3: 
/* 665:680 */       if (paramInt2 == 0) {
/* 666:681 */         return ItemList.R;
/* 667:    */       }
/* 668:683 */       if (paramInt2 == 1) {
/* 669:684 */         return ItemList.ah;
/* 670:    */       }
/* 671:686 */       if (paramInt2 == 2) {
/* 672:687 */         return ItemList.V;
/* 673:    */       }
/* 674:689 */       if (paramInt2 == 3) {
/* 675:690 */         return ItemList.Z;
/* 676:    */       }
/* 677:692 */       if (paramInt2 == 4) {
/* 678:693 */         return ItemList.ad;
/* 679:    */       }
/* 680:    */     case 2: 
/* 681:696 */       if (paramInt2 == 0) {
/* 682:697 */         return ItemList.S;
/* 683:    */       }
/* 684:699 */       if (paramInt2 == 1) {
/* 685:700 */         return ItemList.ai;
/* 686:    */       }
/* 687:702 */       if (paramInt2 == 2) {
/* 688:703 */         return ItemList.W;
/* 689:    */       }
/* 690:705 */       if (paramInt2 == 3) {
/* 691:706 */         return ItemList.aa;
/* 692:    */       }
/* 693:708 */       if (paramInt2 == 4) {
/* 694:709 */         return ItemList.ae;
/* 695:    */       }
/* 696:    */     case 1: 
/* 697:712 */       if (paramInt2 == 0) {
/* 698:713 */         return ItemList.leatherBoots;
/* 699:    */       }
/* 700:715 */       if (paramInt2 == 1) {
/* 701:716 */         return ItemList.aj;
/* 702:    */       }
/* 703:718 */       if (paramInt2 == 2) {
/* 704:719 */         return ItemList.X;
/* 705:    */       }
/* 706:721 */       if (paramInt2 == 3) {
/* 707:722 */         return ItemList.ab;
/* 708:    */       }
/* 709:724 */       if (paramInt2 == 4) {
/* 710:725 */         return ItemList.af;
/* 711:    */       }
/* 712:    */       break;
/* 713:    */     }
/* 714:729 */     return null;
/* 715:    */   }
/* 716:    */   
/* 717:    */   protected void b(vu paramvu)
/* 718:    */   {
/* 719:733 */     float f1 = paramvu.c();
/* 720:735 */     if ((bz() != null) && (this.rng.nextFloat() < 0.25F * f1)) {
/* 721:736 */       aph.a(this.rng, bz(), (int)(5.0F + f1 * this.rng.nextInt(18)));
/* 722:    */     }
/* 723:739 */     for (int j = 0; j < 4; j++)
/* 724:    */     {
/* 725:740 */       ItemStack localamj = q(j);
/* 726:741 */       if ((localamj != null) && (this.rng.nextFloat() < 0.5F * f1)) {
/* 727:742 */         aph.a(this.rng, localamj, (int)(5.0F + f1 * this.rng.nextInt(18)));
/* 728:    */       }
/* 729:    */     }
/* 730:    */   }
/* 731:    */   
/* 732:    */   public xq beforeSpawn(vu paramvu, xq paramxq)
/* 733:    */   {
/* 734:760 */     a(afs.b).b(new ya("Random spawn bonus", this.rng.nextGaussian() * 0.05D, 1));
/* 735:    */     
/* 736:762 */     return paramxq;
/* 737:    */   }
/* 738:    */   
/* 739:    */   public boolean bV()
/* 740:    */   {
/* 741:766 */     return false;
/* 742:    */   }
/* 743:    */   
/* 744:    */   public void bW()
/* 745:    */   {
/* 746:770 */     this.bl = true;
/* 747:    */   }
/* 748:    */   
/* 749:    */   public void a(int paramInt, float paramFloat)
/* 750:    */   {
/* 751:774 */     this.bh[paramInt] = paramFloat;
/* 752:    */   }
/* 753:    */   
/* 754:    */   public boolean bX()
/* 755:    */   {
/* 756:778 */     return this.bk;
/* 757:    */   }
/* 758:    */   
/* 759:    */   public void j(boolean paramBoolean)
/* 760:    */   {
/* 761:782 */     this.bk = paramBoolean;
/* 762:    */   }
/* 763:    */   
/* 764:    */   public boolean bY()
/* 765:    */   {
/* 766:786 */     return this.bl;
/* 767:    */   }
/* 768:    */   
/* 769:    */   public final boolean e(EntityPlayer paramahd)
/* 770:    */   {
/* 771:791 */     if ((cb()) && (cc() == paramahd))
/* 772:    */     {
/* 773:792 */       a(true, !paramahd.by.d);
/* 774:793 */       return true;
/* 775:    */     }
/* 776:796 */     ItemStack localamj = paramahd.bg.h();
/* 777:797 */     if (localamj != null) {
/* 778:801 */       if ((localamj.getItem() == ItemList.cn) && 
/* 779:802 */         (ca())) {
/* 780:803 */         if (((this instanceof EntityPet)) && (((EntityPet)this).cj()))
/* 781:    */         {
/* 782:804 */           if (((EntityPet)this).e(paramahd))
/* 783:    */           {
/* 784:805 */             a(paramahd, true);
/* 785:806 */             localamj.stackSize -= 1;
/* 786:807 */             return true;
/* 787:    */           }
/* 788:    */         }
/* 789:    */         else
/* 790:    */         {
/* 791:810 */           a(paramahd, true);
/* 792:811 */           localamj.stackSize -= 1;
/* 793:812 */           return true;
/* 794:    */         }
/* 795:    */       }
/* 796:    */     }
/* 797:818 */     if (onRightClick(paramahd)) {
/* 798:819 */       return true;
/* 799:    */     }
/* 800:822 */     return super.e(paramahd);
/* 801:    */   }
/* 802:    */   
/* 803:    */   protected boolean onRightClick(EntityPlayer paramahd)
/* 804:    */   {
/* 805:826 */     return false;
/* 806:    */   }
/* 807:    */   
/* 808:    */   protected void bZ()
/* 809:    */   {
/* 810:836 */     if (this.bo != null) {
/* 811:837 */       n();
/* 812:    */     }
/* 813:839 */     if (!this.bm) {
/* 814:840 */       return;
/* 815:    */     }
/* 816:842 */     if (!ai()) {
/* 817:843 */       a(true, true);
/* 818:    */     }
/* 819:846 */     if ((this.bn == null) || (this.bn.isDead))
/* 820:    */     {
/* 821:847 */       a(true, true);
/* 822:848 */       return;
/* 823:    */     }
/* 824:    */   }
/* 825:    */   
/* 826:    */   public void a(boolean paramBoolean1, boolean paramBoolean2)
/* 827:    */   {
/* 828:853 */     if (this.bm)
/* 829:    */     {
/* 830:854 */       this.bm = false;
/* 831:855 */       this.bn = null;
/* 832:856 */       if ((!this.world.isClient) && (paramBoolean2)) {
/* 833:857 */         a(ItemList.cn, 1);
/* 834:    */       }
/* 835:860 */       if ((!this.world.isClient) && (paramBoolean1) && ((this.world instanceof WorldServer))) {
/* 836:861 */         ((WorldServer)this.world).s().a(this, new ky(1, this, null));
/* 837:    */       }
/* 838:    */     }
/* 839:    */   }
/* 840:    */   
/* 841:    */   public boolean ca()
/* 842:    */   {
/* 843:867 */     return (!cb()) && (!(this instanceof aex));
/* 844:    */   }
/* 845:    */   
/* 846:    */   public boolean cb()
/* 847:    */   {
/* 848:871 */     return this.bm;
/* 849:    */   }
/* 850:    */   
/* 851:    */   public Entity cc()
/* 852:    */   {
/* 853:875 */     return this.bn;
/* 854:    */   }
/* 855:    */   
/* 856:    */   public void a(Entity paramwv, boolean paramBoolean)
/* 857:    */   {
/* 858:879 */     this.bm = true;
/* 859:880 */     this.bn = paramwv;
/* 860:882 */     if ((!this.world.isClient) && (paramBoolean) && ((this.world instanceof WorldServer))) {
/* 861:883 */       ((WorldServer)this.world).s().a(this, new ky(1, this, this.bn));
/* 862:    */     }
/* 863:    */   }
/* 864:    */   
/* 865:    */   private void n()
/* 866:    */   {
/* 867:889 */     if ((this.bm) && (this.bo != null))
/* 868:    */     {
/* 869:    */       
/* 870:    */       
/* 871:890 */       if ((this.bo.hasKey("UUIDMost", 4)) && (this.bo.hasKey("UUIDLeast", 4)))
/* 872:    */       {
/* 873:891 */         UUID localObject1 = new UUID(this.bo.getLong("UUIDMost"), this.bo.getLong("UUIDLeast"));
/* 874:892 */         List<EntityLiving> localObject2 = this.world.getEntityList(EntityLiving.class, getAABB().expand(10.0D, 10.0D, 10.0D));
/* 875:893 */         for (EntityLiving localxm : localObject2) {
/* 876:894 */           if (localxm.getUUID().equals(localObject1))
/* 877:    */           {
/* 878:895 */             this.bn = localxm;
/* 879:896 */             break;
/* 880:    */           }
/* 881:    */         }
/* 882:    */       }
/* 883:899 */       else if ((this.bo.hasKey("X", 99)) && (this.bo.hasKey("Y", 99)) && (this.bo.hasKey("Z", 99)))
/* 884:    */       {
/* 885:900 */         BlockPosition localObject1 = new BlockPosition(this.bo.getInteger("X"), this.bo.getInteger("Y"), this.bo.getInteger("Z"));
/* 886:    */         
/* 887:902 */         adl localObject2 = adl.b(this.world, (BlockPosition)localObject1);
/* 888:903 */         if (localObject2 == null) {
/* 889:904 */           localObject2 = adl.a(this.world, (BlockPosition)localObject1);
/* 890:    */         }
/* 891:906 */         this.bn = ((Entity)localObject2);
/* 892:    */       }
/* 893:    */       else
/* 894:    */       {
/* 895:909 */         a(false, true);
/* 896:    */       }
/* 897:    */     }
/* 898:912 */     this.bo = null;
/* 899:    */   }
/* 900:    */   
/* 901:    */   public boolean d(int paramInt, ItemStack paramamj)
/* 902:    */   {
/* 903:    */     int j;
/* 904:918 */     if (paramInt == 99)
/* 905:    */     {
/* 906:919 */       j = 0;
/* 907:    */     }
/* 908:    */     else
/* 909:    */     {
/* 910:921 */       j = paramInt - 100 + 1;
/* 911:922 */       if ((j < 0) || (j >= this.bj.length)) {
/* 912:923 */         return false;
/* 913:    */       }
/* 914:    */     }
/* 915:926 */     if ((paramamj == null) || (c(paramamj) == j) || ((j == 4) && ((paramamj.getItem() instanceof aju))))
/* 916:    */     {
/* 917:927 */       c(j, paramamj);
/* 918:928 */       return true;
/* 919:    */     }
/* 920:930 */     return false;
/* 921:    */   }
/* 922:    */   
/* 923:    */   public boolean bL()
/* 924:    */   {
/* 925:935 */     return (super.bL()) && (!cd());
/* 926:    */   }
/* 927:    */   
/* 928:    */   protected void k(boolean paramBoolean)
/* 929:    */   {
/* 930:939 */     this.ac.b(15, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/* 931:    */   }
/* 932:    */   
/* 933:    */   private boolean cd()
/* 934:    */   {
/* 935:943 */     return this.ac.a(15) != 0;
/* 936:    */   }
/* 937:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     xn
 * JD-Core Version:    0.7.0.1
 */
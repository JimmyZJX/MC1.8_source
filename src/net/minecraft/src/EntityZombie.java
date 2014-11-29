package net.minecraft.src;
/*   1:    */ import java.util.Calendar;
/*   2:    */ import java.util.List;
/*   4:    */ import java.util.UUID;
/*   5:    */ 
/*   6:    */ public class EntityZombie
/*   7:    */   extends EntityHostileMob
/*   8:    */ {
/*   9: 43 */   protected static final xy b = new yg(null, "zombie.spawnReinforcements", 0.0D, 0.0D, 1.0D).a("Spawn Reinforcements Chance");
/*  10: 44 */   private static final UUID c = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
/*  11: 45 */   private static final ya bk = new ya(c, "Baby speed boost", 0.5D, 1);
/*  12: 58 */   private final ys bl = new ys(this);
/*  13:    */   private int bm;
/*  14: 60 */   private boolean bn = false;
/*  15:    */   
/*  16:    */   public EntityZombie(World paramaqu)
/*  17:    */   {
/*  18: 63 */     super(paramaqu);
/*  19:    */     
/*  20: 65 */     ((aay)getNavigator()).b(true);
/*  21: 66 */     this.goalSelector.addGoal(0, new GoalSwim(this));
/*  22: 67 */     this.goalSelector.addGoal(2, new zk(this, EntityPlayer.class, 1.0D, false));
/*  23: 68 */     this.goalSelector.addGoal(2, this.a);
/*  24: 69 */     this.goalSelector.addGoal(5, new zo(this, 1.0D));
/*  25: 70 */     this.goalSelector.addGoal(7, new zy(this, 1.0D));
/*  26: 71 */     this.goalSelector.addGoal(8, new zh(this, EntityPlayer.class, 8.0F));
/*  27: 72 */     this.goalSelector.addGoal(8, new zx(this));
/*  28:    */     
/*  29: 74 */     n();
/*  30:    */     
/*  31: 76 */     a(0.6F, 1.95F);
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected void n()
/*  35:    */   {
/*  36: 83 */     this.goalSelector.addGoal(4, new zk(this, EntityVillager.class, 1.0D, true));
/*  37: 84 */     this.goalSelector.addGoal(4, new zk(this, EntityIronGolem.class, 1.0D, true));
/*  38: 85 */     this.goalSelector.addGoal(6, new zm(this, 1.0D, false));
/*  39:    */     
/*  40: 87 */     this.targetSelector.addGoal(1, new aal(this, true, new Class[] { EntityZombiePigman.class }));
/*  41: 88 */     this.targetSelector.addGoal(2, new aaq(this, EntityPlayer.class, true));
/*  42: 89 */     this.targetSelector.addGoal(2, new aaq(this, EntityVillager.class, false));
/*  43: 90 */     this.targetSelector.addGoal(2, new aaq(this, EntityIronGolem.class, true));
/*  44:    */   }
/*  45:    */   
/*  46:    */   protected void aW()
/*  47:    */   {
/*  48: 95 */     super.aW();
/*  49:    */     
/*  50: 97 */     getAttribute(MobAttribute.followRange).a(35.0D);
/*  51: 98 */     getAttribute(MobAttribute.movementSpeed).a(0.2300000041723251D);
/*  52: 99 */     getAttribute(MobAttribute.attackDamage).a(3.0D);
/*  53:    */     
/*  54:101 */     bx().b(b).a(this.rng.nextDouble() * 0.1000000014901161D);
/*  55:    */   }
/*  56:    */   
/*  57:    */   protected void h()
/*  58:    */   {
/*  59:106 */     super.h();
/*  60:    */     
/*  61:108 */     H().addData(12, Byte.valueOf((byte)0));
/*  62:109 */     H().addData(13, Byte.valueOf((byte)0));
/*  63:110 */     H().addData(14, Byte.valueOf((byte)0));
/*  64:    */   }
/*  65:    */   
/*  66:    */   public int getArmorValue()
/*  67:    */   {
/*  68:115 */     int i = super.getArmorValue() + 2;
/*  69:116 */     if (i > 20) {
/*  70:117 */       i = 20;
/*  71:    */     }
/*  72:119 */     return i;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean cl()
/*  76:    */   {
/*  77:123 */     return this.bn;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void a(boolean paramBoolean)
/*  81:    */   {
/*  82:127 */     if (this.bn != paramBoolean)
/*  83:    */     {
/*  84:128 */       this.bn = paramBoolean;
/*  85:130 */       if (paramBoolean) {
/*  86:131 */         this.goalSelector.addGoal(1, this.bl);
/*  87:    */       } else {
/*  88:133 */         this.goalSelector.removeGoal(this.bl);
/*  89:    */       }
/*  90:    */     }
/*  91:    */   }
/*  92:    */   
/*  93:    */   public boolean i_()
/*  94:    */   {
/*  95:140 */     return H().getByte(12) == 1;
/*  96:    */   }
/*  97:    */   
/*  98:    */   protected int b(EntityPlayer paramahd)
/*  99:    */   {
/* 100:145 */     if (i_()) {
/* 101:146 */       this.b_ = ((int)(this.b_ * 2.5F));
/* 102:    */     }
/* 103:149 */     return super.b(paramahd);
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void l(boolean paramBoolean)
/* 107:    */   {
/* 108:153 */     H().b(12, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/* 109:155 */     if ((this.world != null) && (!this.world.isClient))
/* 110:    */     {
/* 111:156 */       xz localxz = getAttribute(MobAttribute.movementSpeed);
/* 112:157 */       localxz.c(bk);
/* 113:158 */       if (paramBoolean) {
/* 114:159 */         localxz.b(bk);
/* 115:    */       }
/* 116:    */     }
/* 117:163 */     n(paramBoolean);
/* 118:    */   }
/* 119:    */   
/* 120:    */   public boolean cm()
/* 121:    */   {
/* 122:167 */     return H().getByte(13) == 1;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void m(boolean paramBoolean)
/* 126:    */   {
/* 127:171 */     H().b(13, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void m()
/* 131:    */   {
/* 132:176 */     if ((this.world.w()) && (!this.world.isClient) && (!i_()))
/* 133:    */     {
/* 134:177 */       float f = c(1.0F);
/* 135:178 */       BlockPosition localdt = new BlockPosition(this.xPos, Math.round(this.yPos), this.zPos);
/* 136:179 */       if ((f > 0.5F) && (this.rng.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) && (this.world.hasDaylight(localdt)))
/* 137:    */       {
/* 138:180 */         int i = 1;
/* 139:    */         
/* 140:182 */         ItemStack localamj = getItemStack(4);
/* 141:183 */         if (localamj != null)
/* 142:    */         {
/* 143:184 */           if (localamj.e())
/* 144:    */           {
/* 145:185 */             localamj.b(localamj.getDamage() + this.rng.nextInt(2));
/* 146:186 */             if (localamj.getDamage() >= localamj.j())
/* 147:    */             {
/* 148:187 */               b(localamj);
/* 149:188 */               setItemStack(4, null);
/* 150:    */             }
/* 151:    */           }
/* 152:192 */           i = 0;
/* 153:    */         }
/* 154:195 */         if (i != 0) {
/* 155:196 */           e(8);
/* 156:    */         }
/* 157:    */       }
/* 158:    */     }
/* 159:200 */     if ((av()) && (u() != null) && ((this.vehicle instanceof EntityChicken))) {
/* 160:201 */       ((EntityMob)this.vehicle).getNavigator().a(getNavigator().j(), 1.5D);
/* 161:    */     }
/* 162:203 */     super.m();
/* 163:    */   }
/* 164:    */   
/* 165:    */   public boolean receiveDamage(DamageSource paramwh, float paramFloat)
/* 166:    */   {
/* 167:208 */     if (super.receiveDamage(paramwh, paramFloat))
/* 168:    */     {
/* 169:209 */       EntityLiving localxm = u();
/* 170:210 */       if ((localxm == null) && ((paramwh.getAttacker() instanceof EntityLiving))) {
/* 171:211 */         localxm = (EntityLiving)paramwh.getAttacker();
/* 172:    */       }
/* 173:214 */       if ((localxm != null) && (this.world.getDifficulty() == EnumDifficulty.HARD) && (this.rng.nextFloat() < getAttribute(b).e()))
/* 174:    */       {
/* 175:215 */         int i = MathUtils.floor(this.xPos);
/* 176:216 */         int j = MathUtils.floor(this.yPos);
/* 177:217 */         int k = MathUtils.floor(this.zPos);
/* 178:218 */         EntityZombie localagj = new EntityZombie(this.world);
/* 179:220 */         for (int m = 0; m < 50; m++)
/* 180:    */         {
/* 181:221 */           int n = i + MathUtils.nextInt(this.rng, 7, 40) * MathUtils.nextInt(this.rng, -1, 1);
/* 182:222 */           int i1 = j + MathUtils.nextInt(this.rng, 7, 40) * MathUtils.nextInt(this.rng, -1, 1);
/* 183:223 */           int i2 = k + MathUtils.nextInt(this.rng, 7, 40) * MathUtils.nextInt(this.rng, -1, 1);
/* 184:225 */           if ((World.isFlatSurface(this.world, new BlockPosition(n, i1 - 1, i2))) && (this.world.l(new BlockPosition(n, i1, i2)) < 10))
/* 185:    */           {
/* 186:226 */             localagj.setPos(n, i1, i2);
/* 187:228 */             if ((!this.world.isWithinRangeOfAnyPlayer(n, i1, i2, 7.0D)) && (this.world.isCollisionFree(localagj.getAABB(), localagj)) && (this.world.getCollidingAABBs(localagj, localagj.getAABB()).isEmpty()) && (!this.world.isInLiquid(localagj.getAABB())))
/* 188:    */             {
/* 189:229 */               this.world.spawnEntity(localagj);
/* 190:230 */               localagj.d(localxm);
/* 191:231 */               localagj.beforeSpawn(this.world.E(new BlockPosition(localagj)), null);
/* 192:    */               
/* 193:233 */               getAttribute(b).b(new ya("Zombie reinforcement caller charge", -0.0500000007450581D, 0));
/* 194:234 */               localagj.getAttribute(b).b(new ya("Zombie reinforcement callee charge", -0.0500000007450581D, 0));
/* 195:235 */               break;
/* 196:    */             }
/* 197:    */           }
/* 198:    */         }
/* 199:    */       }
/* 200:241 */       return true;
/* 201:    */     }
/* 202:244 */     return false;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void onUpdate()
/* 206:    */   {
/* 207:249 */     if ((!this.world.isClient) && (cn()))
/* 208:    */     {
/* 209:250 */       int i = cp();
/* 210:    */       
/* 211:252 */       this.bm -= i;
/* 212:254 */       if (this.bm <= 0) {
/* 213:255 */         cure();
/* 214:    */       }
/* 215:    */     }
/* 216:259 */     super.onUpdate();
/* 217:    */   }
/* 218:    */   
/* 219:    */   public boolean r(Entity paramwv)
/* 220:    */   {
/* 221:264 */     boolean bool = super.r(paramwv);
/* 222:266 */     if (bool)
/* 223:    */     {
/* 224:267 */       int i = this.world.getDifficulty().a();
/* 225:268 */       if ((getHeldItemStack() == null) && (au()) && (this.rng.nextFloat() < i * 0.3F)) {
/* 226:269 */         paramwv.e(2 * i);
/* 227:    */       }
/* 228:    */     }
/* 229:273 */     return bool;
/* 230:    */   }
/* 231:    */   
/* 232:    */   protected String z()
/* 233:    */   {
/* 234:278 */     return "mob.zombie.say";
/* 235:    */   }
/* 236:    */   
/* 237:    */   protected String bn()
/* 238:    */   {
/* 239:283 */     return "mob.zombie.hurt";
/* 240:    */   }
/* 241:    */   
/* 242:    */   protected String bo()
/* 243:    */   {
/* 244:288 */     return "mob.zombie.death";
/* 245:    */   }
/* 246:    */   
/* 247:    */   protected void a(BlockPosition paramdt, BlockType paramatr)
/* 248:    */   {
/* 249:293 */     a("mob.zombie.step", 0.15F, 1.0F);
/* 250:    */   }
/* 251:    */   
/* 252:    */   protected Item A()
/* 253:    */   {
/* 254:298 */     return ItemList.rottenFlesh;
/* 255:    */   }
/* 256:    */   
/* 257:    */   public xs by()
/* 258:    */   {
/* 259:303 */     return xs.b;
/* 260:    */   }
/* 261:    */   
/* 262:    */   protected void bp()
/* 263:    */   {
/* 264:308 */     switch (this.rng.nextInt(3))
/* 265:    */     {
/* 266:    */     case 0: 
/* 267:310 */       a(ItemList.ironIngot, 1);
/* 268:311 */       break;
/* 269:    */     case 1: 
/* 270:313 */       a(ItemList.carrot, 1);
/* 271:314 */       break;
/* 272:    */     case 2: 
/* 273:316 */       a(ItemList.potato, 1);
/* 274:    */     }
/* 275:    */   }
/* 276:    */   
/* 277:    */   protected void a(vu paramvu)
/* 278:    */   {
/* 279:323 */     super.a(paramvu);
/* 280:325 */     if (this.rng.nextFloat() < (this.world.getDifficulty() == EnumDifficulty.HARD ? 0.05F : 0.01F))
/* 281:    */     {
/* 282:326 */       int i = this.rng.nextInt(3);
/* 283:327 */       if (i == 0) {
/* 284:328 */         setItemStack(0, new ItemStack(ItemList.ironSword));
/* 285:    */       } else {
/* 286:330 */         setItemStack(0, new ItemStack(ItemList.ironShovel));
/* 287:    */       }
/* 288:    */     }
/* 289:    */   }
/* 290:    */   
/* 291:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 292:    */   {
/* 293:337 */     super.writeEntityToNBT(paramfn);
/* 294:339 */     if (i_()) {
/* 295:340 */       paramfn.setBoolean("IsBaby", true);
/* 296:    */     }
/* 297:342 */     if (cm()) {
/* 298:343 */       paramfn.setBoolean("IsVillager", true);
/* 299:    */     }
/* 300:345 */     paramfn.setInt("ConversionTime", cn() ? this.bm : -1);
/* 301:346 */     paramfn.setBoolean("CanBreakDoors", cl());
/* 302:    */   }
/* 303:    */   
/* 304:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 305:    */   {
/* 306:351 */     super.readEntityFromNBT(paramfn);
/* 307:353 */     if (paramfn.getBoolean("IsBaby")) {
/* 308:354 */       l(true);
/* 309:    */     }
/* 310:356 */     if (paramfn.getBoolean("IsVillager")) {
/* 311:357 */       m(true);
/* 312:    */     }
/* 313:359 */     if ((paramfn.hasKey("ConversionTime", 99)) && (paramfn.getInteger("ConversionTime") > -1)) {
/* 314:360 */       a(paramfn.getInteger("ConversionTime"));
/* 315:    */     }
/* 316:362 */     a(paramfn.getBoolean("CanBreakDoors"));
/* 317:    */   }
/* 318:    */   
/* 319:    */   public void a(EntityLiving paramxm)
/* 320:    */   {
/* 321:367 */     super.a(paramxm);
/* 322:369 */     if (((this.world.getDifficulty() == EnumDifficulty.NORMAL) || (this.world.getDifficulty() == EnumDifficulty.HARD)) && ((paramxm instanceof EntityVillager)))
/* 323:    */     {
/* 324:370 */       if ((this.world.getDifficulty() != EnumDifficulty.HARD) && (this.rng.nextBoolean())) {
/* 325:371 */         return;
/* 326:    */       }
/* 327:374 */       EntityZombie localagj = new EntityZombie(this.world);
/* 328:375 */       localagj.setPositionAndAngles(paramxm);
/* 329:376 */       this.world.setEntityDead(paramxm);
/* 330:377 */       localagj.beforeSpawn(this.world.E(new BlockPosition(localagj)), null);
/* 331:378 */       localagj.m(true);
/* 332:379 */       if (paramxm.i_()) {
/* 333:380 */         localagj.l(true);
/* 334:    */       }
/* 335:382 */       this.world.spawnEntity(localagj);
/* 336:    */       
/* 337:384 */       this.world.playLevelEvent(null, 1016, new BlockPosition((int)this.xPos, (int)this.yPos, (int)this.zPos), 0);
/* 338:    */     }
/* 339:    */   }
/* 340:    */   
/* 341:    */   public float getEyeHeight()
/* 342:    */   {
/* 343:390 */     float f = 1.74F;
/* 344:391 */     if (i_()) {
/* 345:392 */       f = (float)(f - 0.8100000000000001D);
/* 346:    */     }
/* 347:394 */     return f;
/* 348:    */   }
/* 349:    */   
/* 350:    */   protected boolean a(ItemStack paramamj)
/* 351:    */   {
/* 352:399 */     if ((paramamj.getItem() == ItemList.aP) && (i_()) && (av())) {
/* 353:400 */       return false;
/* 354:    */     }
/* 355:402 */     return super.a(paramamj);
/* 356:    */   }
/* 357:    */   
/* 358:    */   public xq beforeSpawn(vu paramvu, xq paramxq)
/* 359:    */   {
/* 360:408 */     paramxq = super.beforeSpawn(paramvu, paramxq);
/* 361:409 */     float f = paramvu.c();
/* 362:    */     
/* 363:411 */     setCanPickUpLoot(this.rng.nextFloat() < 0.55F * f);
/* 364:413 */     if (paramxq == null) {
/* 365:414 */       paramxq = new agl(this, this.world.rng.nextFloat() < 0.05F, this.world.rng.nextFloat() < 0.05F, null);
/* 366:    */     }
/* 367:    */     Object localObject1;
/* 368:417 */     if ((paramxq instanceof agl))
/* 369:    */     {
/* 370:418 */       localObject1 = (agl)paramxq;
/* 371:420 */       if (((agl)localObject1).b) {
/* 372:421 */         m(true);
/* 373:    */       }
/* 374:424 */       if (((agl)localObject1).a)
/* 375:    */       {
/* 376:425 */         l(true);
/* 377:    */         
/* 378:427 */         if (this.world.rng.nextFloat() < 0.05D)
/* 379:    */         {
/* 380:428 */           List<EntityChicken> list = this.world.a(EntityChicken.class, getAABB().expand(5.0D, 3.0D, 5.0D), xe.b);
/* 381:430 */           if (!list.isEmpty())
/* 382:    */           {
/* 383:431 */             EntityChicken localabr = list.get(0);
/* 384:432 */             localabr.l(true);
/* 385:433 */             a(localabr);
/* 386:    */           }
/* 387:    */         }
/* 388:435 */         else if (this.world.rng.nextFloat() < 0.05D)
/* 389:    */         {
/* 390:436 */           EntityChicken localObject2 = new EntityChicken(this.world);
/* 391:437 */           ((EntityChicken)localObject2).setPositionAndAngles(this.xPos, this.yPos, this.zPos, this.yaw, 0.0F);
/* 392:438 */           ((EntityChicken)localObject2).beforeSpawn(paramvu, null);
/* 393:439 */           ((EntityChicken)localObject2).l(true);
/* 394:440 */           this.world.spawnEntity((Entity)localObject2);
/* 395:441 */           mount((Entity)localObject2);
/* 396:    */         }
/* 397:    */       }
/* 398:    */     }
/* 399:446 */     a(this.rng.nextFloat() < f * 0.1F);
/* 400:    */     
/* 401:448 */     a(paramvu);
/* 402:449 */     b(paramvu);
/* 403:451 */     if (getItemStack(4) == null)
/* 404:    */     {
/* 405:452 */       localObject1 = this.world.Y();
/* 406:455 */       if ((((Calendar)localObject1).get(2) + 1 == 10) && (((Calendar)localObject1).get(5) == 31) && (this.rng.nextFloat() < 0.25F))
/* 407:    */       {
/* 408:457 */         setItemStack(4, new ItemStack(this.rng.nextFloat() < 0.1F ? BlockList.aZ : BlockList.pumpkin));
/* 409:458 */         this.dropChances[4] = 0.0F;
/* 410:    */       }
/* 411:    */     }
/* 412:462 */     getAttribute(MobAttribute.knockbackResistance).b(new ya("Random spawn bonus", this.rng.nextDouble() * 0.0500000007450581D, 0));
/* 413:463 */     double d = this.rng.nextDouble() * 1.5D * f;
/* 414:464 */     if (d > 1.0D) {
/* 415:465 */       getAttribute(MobAttribute.followRange).b(new ya("Random zombie-spawn bonus", d, 2));
/* 416:    */     }
/* 417:468 */     if (this.rng.nextFloat() < f * 0.05F)
/* 418:    */     {
/* 419:469 */       getAttribute(b).b(new ya("Leader zombie bonus", this.rng.nextDouble() * 0.25D + 0.5D, 0));
/* 420:470 */       getAttribute(MobAttribute.maxHealth).b(new ya("Leader zombie bonus", this.rng.nextDouble() * 3.0D + 1.0D, 2));
/* 421:471 */       a(true);
/* 422:    */     }
/* 423:474 */     return paramxq;
/* 424:    */   }
/* 425:    */   
/* 426:    */   public boolean onRightClickMob(EntityPlayer paramahd)
/* 427:    */   {
/* 428:479 */     ItemStack localamj = paramahd.bY();
/* 429:481 */     if ((localamj != null) && (localamj.getItem() == ItemList.ao) && (localamj.getDamage2() == 0) && (cm()) && (a(Potion.weakness)))
/* 430:    */     {
/* 431:482 */       if (!paramahd.abilities.instabuild) {
/* 432:483 */         localamj.stackSize -= 1;
/* 433:    */       }
/* 434:485 */       if (localamj.stackSize <= 0) {
/* 435:486 */         paramahd.inventory.a(paramahd.inventory.c, null);
/* 436:    */       }
/* 437:489 */       if (!this.world.isClient) {
/* 438:490 */         a(this.rng.nextInt(2401) + 3600);
/* 439:    */       }
/* 440:493 */       return true;
/* 441:    */     }
/* 442:496 */     return false;
/* 443:    */   }
/* 444:    */   
/* 445:    */   protected void a(int paramInt)
/* 446:    */   {
/* 447:500 */     this.bm = paramInt;
/* 448:501 */     H().b(14, Byte.valueOf((byte)1));
/* 449:    */     
/* 450:503 */     m(Potion.weakness.id);
/* 451:504 */     c(new PotionEffect(Potion.strength.id, paramInt, Math.min(this.world.getDifficulty().a() - 1, 0)));
/* 452:    */     
/* 453:506 */     this.world.sendSignal(this, (byte)16);
/* 454:    */   }
/* 455:    */   
/* 456:    */   public void onSignal(byte paramByte)
/* 457:    */   {
/* 458:511 */     if (paramByte == 16)
/* 459:    */     {
/* 460:512 */       if (!R()) {
/* 461:513 */         this.world.a(this.xPos + 0.5D, this.yPos + 0.5D, this.zPos + 0.5D, "mob.zombie.remedy", 1.0F + this.rng.nextFloat(), this.rng.nextFloat() * 0.7F + 0.3F, false);
/* 462:    */       }
/* 463:    */     }
/* 464:    */     else {
/* 465:516 */       super.onSignal(paramByte);
/* 466:    */     }
/* 467:    */   }
/* 468:    */   
/* 469:    */   protected boolean canDespawn()
/* 470:    */   {
/* 471:522 */     return !cn();
/* 472:    */   }
/* 473:    */   
/* 474:    */   public boolean cn()
/* 475:    */   {
/* 476:526 */     return H().getByte(14) == 1;
/* 477:    */   }
/* 478:    */   
/* 479:    */   protected void cure()
/* 480:    */   {
/* 481:530 */     EntityVillager villager = new EntityVillager(this.world);
/* 482:531 */     villager.setPositionAndAngles(this);
/* 483:532 */     villager.beforeSpawn(this.world.E(new BlockPosition(villager)), null);
/* 484:533 */     villager.cn();
/* 485:534 */     if (i_()) {
/* 486:535 */       villager.setAge(-24000);
/* 487:    */     }
/* 488:537 */     this.world.setEntityDead(this);
/* 489:538 */     this.world.spawnEntity(villager);
/* 490:    */     
/* 491:540 */     villager.c(new PotionEffect(Potion.nausea.id, 200, 0));
/* 492:541 */     this.world.playLevelEvent(null, 1017, new BlockPosition((int)this.xPos, (int)this.yPos, (int)this.zPos), 0);
/* 493:    */   }
/* 494:    */   
/* 495:    */   protected int cp()
/* 496:    */   {
/* 497:545 */     int i = 1;
/* 498:547 */     if (this.rng.nextFloat() < 0.01F)
/* 499:    */     {
/* 500:548 */       int j = 0;
/* 501:550 */       for (int k = (int)this.xPos - 4; (k < (int)this.xPos + 4) && (j < 14); k++) {
/* 502:551 */         for (int m = (int)this.yPos - 4; (m < (int)this.yPos + 4) && (j < 14); m++) {
/* 503:552 */           for (int n = (int)this.zPos - 4; (n < (int)this.zPos + 4) && (j < 14); n++)
/* 504:    */           {
/* 505:553 */             BlockType localatr = this.world.getBlock(new BlockPosition(k, m, n)).getType();
/* 506:554 */             if ((localatr == BlockList.ironBars) || (localatr == BlockList.C))
/* 507:    */             {
/* 508:555 */               if (this.rng.nextFloat() < 0.3F) {
/* 509:556 */                 i++;
/* 510:    */               }
/* 511:558 */               j++;
/* 512:    */             }
/* 513:    */           }
/* 514:    */         }
/* 515:    */       }
/* 516:    */     }
/* 517:564 */     return i;
/* 518:    */   }
/* 519:    */   
/* 520:    */   public void n(boolean paramBoolean)
/* 521:    */   {
/* 522:579 */     a(paramBoolean ? 0.5F : 1.0F);
/* 523:    */   }
/* 524:    */   
/* 525:582 */   private float bo = -1.0F;
/* 526:    */   private float bp;
/* 527:    */   
/* 528:    */   protected final void a(float paramFloat1, float paramFloat2)
/* 529:    */   {
/* 530:587 */     int i = (this.bo > 0.0F) && (this.bp > 0.0F) ? 1 : 0;
/* 531:    */     
/* 532:589 */     this.bo = paramFloat1;
/* 533:590 */     this.bp = paramFloat2;
/* 534:592 */     if (i == 0) {
/* 535:593 */       a(1.0F);
/* 536:    */     }
/* 537:    */   }
/* 538:    */   
/* 539:    */   protected final void a(float paramFloat)
/* 540:    */   {
/* 541:598 */     super.a(this.bo * paramFloat, this.bp * paramFloat);
/* 542:    */   }
/* 543:    */   
/* 544:    */   public double am()
/* 545:    */   {
/* 546:603 */     return super.am() - 0.5D;
/* 547:    */   }
/* 548:    */   
/* 549:    */   public void a(DamageSource paramwh)
/* 550:    */   {
/* 551:608 */     super.a(paramwh);
/* 552:610 */     if (((paramwh.getAttacker() instanceof EntityCreeper)) && (!(this instanceof EntityZombiePigman)) && 
/* 553:611 */       (((EntityCreeper)paramwh.getAttacker()).n()) && (((EntityCreeper)paramwh.getAttacker()).cn()))
/* 554:    */     {
/* 555:612 */       ((EntityCreeper)paramwh.getAttacker()).co();
/* 556:613 */       throwItem(new ItemStack(ItemList.skull, 1, 2), 0.0F);
/* 557:    */     }
/* 558:    */   }
/* 559:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agj
 * JD-Core Version:    0.7.0.1
 */
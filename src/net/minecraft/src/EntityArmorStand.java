package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class EntityArmorStand
/*   4:    */   extends EntityLiving
/*   5:    */ {
/*   6: 29 */   private static final fa a = new fa(0.0F, 0.0F, 0.0F);
/*   7: 30 */   private static final fa b = new fa(0.0F, 0.0F, 0.0F);
/*   8: 31 */   private static final fa c = new fa(-10.0F, 0.0F, -10.0F);
/*   9: 32 */   private static final fa d = new fa(-15.0F, 0.0F, 10.0F);
/*  10: 33 */   private static final fa e = new fa(-1.0F, 0.0F, -1.0F);
/*  11: 34 */   private static final fa f = new fa(1.0F, 0.0F, 1.0F);
/*  12: 57 */   private final ItemStack[] g = new ItemStack[5];
/*  13:    */   private boolean h;
/*  14:    */   private long i;
/*  15:    */   private int bg;
/*  16: 62 */   private fa bh = a;
/*  17: 63 */   private fa bi = b;
/*  18: 64 */   private fa bj = c;
/*  19: 65 */   private fa bk = d;
/*  20: 66 */   private fa bl = e;
/*  21: 67 */   private fa bm = f;
/*  22:    */   
/*  23:    */   public EntityArmorStand(World paramaqu)
/*  24:    */   {
/*  25: 70 */     super(paramaqu);
/*  26: 71 */     b(true);
/*  27: 72 */     this.T = p();
/*  28: 73 */     a(0.5F, 1.975F);
/*  29:    */   }
/*  30:    */   
/*  31:    */   public EntityArmorStand(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  32:    */   {
/*  33: 77 */     this(paramaqu);
/*  34: 78 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  35:    */   }
/*  36:    */   
/*  37:    */   public boolean bL()
/*  38:    */   {
/*  39: 83 */     return (super.bL()) && (!p());
/*  40:    */   }
/*  41:    */   
/*  42:    */   protected void h()
/*  43:    */   {
/*  44: 88 */     super.h();
/*  45: 89 */     this.ac.a(10, Byte.valueOf((byte)0));
/*  46: 90 */     this.ac.a(11, a);
/*  47: 91 */     this.ac.a(12, b);
/*  48: 92 */     this.ac.a(13, c);
/*  49: 93 */     this.ac.a(14, d);
/*  50: 94 */     this.ac.a(15, e);
/*  51: 95 */     this.ac.a(16, f);
/*  52:    */   }
/*  53:    */   
/*  54:    */   public ItemStack bz()
/*  55:    */   {
/*  56:100 */     return this.g[0];
/*  57:    */   }
/*  58:    */   
/*  59:    */   public ItemStack p(int paramInt)
/*  60:    */   {
/*  61:105 */     return this.g[paramInt];
/*  62:    */   }
/*  63:    */   
/*  64:    */   public ItemStack q(int paramInt)
/*  65:    */   {
/*  66:110 */     return this.g[(paramInt + 1)];
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void c(int paramInt, ItemStack paramamj)
/*  70:    */   {
/*  71:115 */     this.g[paramInt] = paramamj;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public ItemStack[] at()
/*  75:    */   {
/*  76:120 */     return this.g;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public boolean d(int paramInt, ItemStack paramamj)
/*  80:    */   {
/*  81:    */     int j;
/*  82:126 */     if (paramInt == 99)
/*  83:    */     {
/*  84:127 */       j = 0;
/*  85:    */     }
/*  86:    */     else
/*  87:    */     {
/*  88:129 */       j = paramInt - 100 + 1;
/*  89:130 */       if ((j < 0) || (j >= this.g.length)) {
/*  90:131 */         return false;
/*  91:    */       }
/*  92:    */     }
/*  93:134 */     if ((paramamj == null) || (EntityMob.c(paramamj) == j) || ((j == 4) && ((paramamj.getItem() instanceof aju))))
/*  94:    */     {
/*  95:135 */       c(j, paramamj);
/*  96:136 */       return true;
/*  97:    */     }
/*  98:138 */     return false;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 102:    */   {
/* 103:143 */     super.writeEntityToNBT(paramfn);
/* 104:    */     
/* 105:145 */     fv localfv = new fv();
/* 106:146 */     for (int j = 0; j < this.g.length; j++)
/* 107:    */     {
/* 108:147 */       NBTTagCompound localfn = new NBTTagCompound();
/* 109:148 */       if (this.g[j] != null) {
/* 110:149 */         this.g[j].writeToNBT(localfn);
/* 111:    */       }
/* 112:151 */       localfv.a(localfn);
/* 113:    */     }
/* 114:153 */     paramfn.setNBT("Equipment", localfv);
/* 115:155 */     if ((aM()) && ((aL() == null) || (aL().length() == 0))) {
/* 116:156 */       paramfn.setBoolean("CustomNameVisible", aM());
/* 117:    */     }
/* 118:159 */     paramfn.setBoolean("Invisible", ay());
/* 119:160 */     paramfn.setBoolean("Small", n());
/* 120:    */     
/* 121:162 */     paramfn.setBoolean("ShowArms", q());
/* 122:    */     
/* 123:164 */     paramfn.setInt("DisabledSlots", this.bg);
/* 124:165 */     paramfn.setBoolean("NoGravity", p());
/* 125:166 */     paramfn.setBoolean("NoBasePlate", r());
/* 126:167 */     paramfn.setNBT("Pose", y());
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 130:    */   {
/* 131:172 */     super.readEntityFromNBT(paramfn);
/* 132:174 */     if (paramfn.hasKey("Equipment", 9))
/* 133:    */     {
/* 134:175 */       fv localfv = paramfn.c("Equipment", 10);
/* 135:177 */       for (int j = 0; j < this.g.length; j++) {
/* 136:178 */         this.g[j] = ItemStack.loadItemStackFromNBT(localfv.b(j));
/* 137:    */       }
/* 138:    */     }
/* 139:182 */     e(paramfn.getBoolean("Invisible"));
/* 140:    */     
/* 141:184 */     a(paramfn.getBoolean("Small"));
/* 142:    */     
/* 143:186 */     k(paramfn.getBoolean("ShowArms"));
/* 144:    */     
/* 145:188 */     this.bg = paramfn.getInteger("DisabledSlots");
/* 146:189 */     j(paramfn.getBoolean("NoGravity"));
/* 147:190 */     l(paramfn.getBoolean("NoBasePlate"));
/* 148:191 */     this.T = p();
/* 149:192 */     Object localObject = paramfn.getCompoundTag("Pose");
/* 150:193 */     h((NBTTagCompound)localObject);
/* 151:    */   }
/* 152:    */   
/* 153:    */   private void h(NBTTagCompound paramfn)
/* 154:    */   {
/* 155:197 */     fv localfv1 = paramfn.c("Head", 5);
/* 156:198 */     if (localfv1.c() > 0) {
/* 157:199 */       a(new fa(localfv1));
/* 158:    */     } else {
/* 159:201 */       a(a);
/* 160:    */     }
/* 161:203 */     fv localfv2 = paramfn.c("Body", 5);
/* 162:204 */     if (localfv2.c() > 0) {
/* 163:205 */       b(new fa(localfv2));
/* 164:    */     } else {
/* 165:207 */       b(b);
/* 166:    */     }
/* 167:209 */     fv localfv3 = paramfn.c("LeftArm", 5);
/* 168:210 */     if (localfv3.c() > 0) {
/* 169:211 */       c(new fa(localfv3));
/* 170:    */     } else {
/* 171:213 */       c(c);
/* 172:    */     }
/* 173:215 */     fv localfv4 = paramfn.c("RightArm", 5);
/* 174:216 */     if (localfv4.c() > 0) {
/* 175:217 */       d(new fa(localfv4));
/* 176:    */     } else {
/* 177:219 */       d(d);
/* 178:    */     }
/* 179:221 */     fv localfv5 = paramfn.c("LeftLeg", 5);
/* 180:222 */     if (localfv5.c() > 0) {
/* 181:223 */       e(new fa(localfv5));
/* 182:    */     } else {
/* 183:225 */       e(e);
/* 184:    */     }
/* 185:227 */     fv localfv6 = paramfn.c("RightLeg", 5);
/* 186:228 */     if (localfv6.c() > 0) {
/* 187:229 */       f(new fa(localfv6));
/* 188:    */     } else {
/* 189:231 */       f(f);
/* 190:    */     }
/* 191:    */   }
/* 192:    */   
/* 193:    */   private NBTTagCompound y()
/* 194:    */   {
/* 195:236 */     NBTTagCompound localfn = new NBTTagCompound();
/* 196:237 */     if (!a.equals(this.bh)) {
/* 197:238 */       localfn.setNBT("Head", this.bh.a());
/* 198:    */     }
/* 199:240 */     if (!b.equals(this.bi)) {
/* 200:241 */       localfn.setNBT("Body", this.bi.a());
/* 201:    */     }
/* 202:243 */     if (!c.equals(this.bj)) {
/* 203:244 */       localfn.setNBT("LeftArm", this.bj.a());
/* 204:    */     }
/* 205:246 */     if (!d.equals(this.bk)) {
/* 206:247 */       localfn.setNBT("RightArm", this.bk.a());
/* 207:    */     }
/* 208:249 */     if (!e.equals(this.bl)) {
/* 209:250 */       localfn.setNBT("LeftLeg", this.bl.a());
/* 210:    */     }
/* 211:252 */     if (!f.equals(this.bm)) {
/* 212:253 */       localfn.setNBT("RightLeg", this.bm.a());
/* 213:    */     }
/* 214:255 */     return localfn;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public boolean ae()
/* 218:    */   {
/* 219:261 */     return false;
/* 220:    */   }
/* 221:    */   
/* 222:    */   protected void s(Entity paramwv) {}
/* 223:    */   
/* 224:    */   protected void bK()
/* 225:    */   {
/* 226:272 */     List localList = this.world.b(this, getAABB());
/* 227:273 */     if ((localList != null) && (!localList.isEmpty())) {
/* 228:274 */       for (int j = 0; j < localList.size(); j++)
/* 229:    */       {
/* 230:275 */         Entity localwv = (Entity)localList.get(j);
/* 231:276 */         if (((localwv instanceof adx)) && (((adx)localwv).s() == EnumMinecartVariant.a) && 
/* 232:277 */           (h(localwv) <= 0.2D)) {
/* 233:278 */           localwv.i(this);
/* 234:    */         }
/* 235:    */       }
/* 236:    */     }
/* 237:    */   }
/* 238:    */   
/* 239:    */   public boolean a(EntityPlayer paramahd, Vec3 parambrw)
/* 240:    */   {
/* 241:287 */     if ((this.world.isClient) || (paramahd.v())) {
/* 242:288 */       return true;
/* 243:    */     }
/* 244:291 */     int j = 0;
/* 245:292 */     ItemStack localamj = paramahd.bY();
/* 246:293 */     int k = localamj != null ? 1 : 0;
/* 247:294 */     if ((k != 0) && ((localamj.getItem() instanceof ajn)))
/* 248:    */     {
/* 249:295 */       ajn localajn = (ajn)localamj.getItem();
/* 250:296 */       if (localajn.b == 3) {
/* 251:297 */         j = 1;
/* 252:298 */       } else if (localajn.b == 2) {
/* 253:299 */         j = 2;
/* 254:300 */       } else if (localajn.b == 1) {
/* 255:301 */         j = 3;
/* 256:302 */       } else if (localajn.b == 0) {
/* 257:303 */         j = 4;
/* 258:    */       }
/* 259:    */     }
/* 260:306 */     if ((k != 0) && ((localamj.getItem() == ItemList.bX) || (localamj.getItem() == Item.fromProtoBlock(BlockList.pumpkin)))) {
/* 261:307 */       j = 4;
/* 262:    */     }
/* 263:310 */     double d1 = 0.1D;
/* 264:311 */     double d2 = 0.9D;
/* 265:312 */     double d3 = 0.4D;
/* 266:313 */     double d4 = 1.6D;
/* 267:    */     
/* 268:315 */     int m = 0;
/* 269:316 */     boolean bool = n();
/* 270:317 */     double d5 = bool ? parambrw.y * 2.0D : parambrw.y;
				  boolean flag = true;
/* 271:318 */     if (d5 >= 0.1D) {
/* 272:318 */       if ((d5 < 0.1D + (bool ? 0.8D : 0.45D)) && (this.g[1] != null))
/* 273:    */       {
/* 274:319 */         m = 1;
/* 275:    */         flag = false;
/* 276:    */       }
/* 277:    */     }
/* 278:320 */     if (flag && d5 >= 0.9D + (bool ? 0.3D : 0.0D)) {
/* 279:320 */       if ((d5 < 0.9D + (bool ? 1.0D : 0.7D)) && (this.g[3] != null))
/* 280:    */       {
/* 281:321 */         m = 3;
/* 275:    */         flag = false;
/* 283:    */       }
/* 284:    */     }
/* 285:322 */     if (flag && d5 >= 0.4D) {
/* 286:322 */       if ((d5 < 0.4D + (bool ? 1.0D : 0.8D)) && (this.g[2] != null))
/* 287:    */       {
/* 288:323 */         m = 2;
/* 275:    */         flag = false;
/* 290:    */       }
/* 291:    */     }
/* 292:324 */     if (flag && (d5 >= 1.6D) && (this.g[4] != null)) {
/* 293:325 */       m = 4;
/* 294:    */     }
/* 296:327 */     int n = this.g[m] != null ? 1 : 0;
/* 297:329 */     if (((this.bg & 1 << m) != 0) || ((this.bg & 1 << j) != 0))
/* 298:    */     {
/* 299:330 */       m = j;
/* 300:331 */       if ((this.bg & 1 << m) != 0)
/* 301:    */       {
/* 302:332 */         if ((this.bg & 0x1) != 0) {
/* 303:333 */           return true;
/* 304:    */         }
/* 305:335 */         m = 0;
/* 306:    */       }
/* 307:    */     }
/* 308:340 */     if ((k != 0) && (j == 0) && (!q())) {
/* 309:341 */       return true;
/* 310:    */     }
/* 311:344 */     if (k != 0) {
/* 312:345 */       a(paramahd, j);
/* 313:346 */     } else if (n != 0) {
/* 314:347 */       a(paramahd, m);
/* 315:    */     }
/* 316:350 */     return true;
/* 317:    */   }
/* 318:    */   
/* 319:    */   private void a(EntityPlayer paramahd, int paramInt)
/* 320:    */   {
/* 321:354 */     ItemStack localamj1 = this.g[paramInt];
/* 322:355 */     if ((localamj1 != null) && ((this.bg & 1 << paramInt + 8) != 0)) {
/* 323:357 */       return;
/* 324:    */     }
/* 325:359 */     if ((localamj1 == null) && ((this.bg & 1 << paramInt + 16) != 0)) {
/* 326:361 */       return;
/* 327:    */     }
/* 328:364 */     int j = paramahd.bg.c;
/* 329:365 */     ItemStack localamj2 = paramahd.bg.a(j);
/* 330:    */     ItemStack localamj3;
/* 331:366 */     if ((paramahd.by.d) && ((localamj1 == null) || (localamj1.getItem() == Item.fromProtoBlock(BlockList.air))) && (localamj2 != null))
/* 332:    */     {
/* 333:367 */       localamj3 = localamj2.k();
/* 334:368 */       localamj3.stackSize = 1;
/* 335:369 */       c(paramInt, localamj3);
/* 336:370 */       return;
/* 337:    */     }
/* 338:372 */     if ((localamj2 != null) && (localamj2.stackSize > 1))
/* 339:    */     {
/* 340:373 */       if (localamj1 != null) {
/* 341:374 */         return;
/* 342:    */       }
/* 343:376 */       localamj3 = localamj2.k();
/* 344:377 */       localamj3.stackSize = 1;
/* 345:378 */       c(paramInt, localamj3);
/* 346:379 */       localamj2.stackSize -= 1;
/* 347:380 */       return;
/* 348:    */     }
/* 349:382 */     c(paramInt, localamj2);
/* 350:383 */     paramahd.bg.a(j, localamj1);
/* 351:    */   }
/* 352:    */   
/* 353:    */   public boolean a(DamageSource paramwh, float paramFloat)
/* 354:    */   {
/* 355:388 */     if ((this.world.isClient) || (this.h)) {
/* 356:389 */       return false;
/* 357:    */     }
/* 358:392 */     if (DamageSource.j.equals(paramwh))
/* 359:    */     {
/* 360:393 */       setDead();
/* 361:394 */       return false;
/* 362:    */     }
/* 363:396 */     if (b(paramwh)) {
/* 364:397 */       return false;
/* 365:    */     }
/* 366:399 */     if (paramwh.c())
/* 367:    */     {
/* 368:400 */       C();
/* 369:401 */       setDead();
/* 370:402 */       return false;
/* 371:    */     }
/* 372:404 */     if (DamageSource.a.equals(paramwh))
/* 373:    */     {
/* 374:405 */       if (!au()) {
/* 375:406 */         e(5);
/* 376:    */       } else {
/* 377:408 */         a(0.15F);
/* 378:    */       }
/* 379:410 */       return false;
/* 380:    */     }
/* 381:412 */     if ((DamageSource.c.equals(paramwh)) && (getHealth() > 0.5F))
/* 382:    */     {
/* 383:413 */       a(4.0F);
/* 384:414 */       return false;
/* 385:    */     }
/* 386:417 */     boolean bool1 = "arrow".equals(paramwh.p());
/* 387:418 */     boolean bool2 = "player".equals(paramwh.p());
/* 388:419 */     if ((!bool2) && (!bool1)) {
/* 389:420 */       return false;
/* 390:    */     }
/* 391:422 */     if ((paramwh.i() instanceof ahj)) {
/* 392:423 */       paramwh.i().setDead();
/* 393:    */     }
/* 394:425 */     if (((paramwh.j() instanceof EntityPlayer)) && (!((EntityPlayer)paramwh.j()).by.e)) {
/* 395:426 */       return false;
/* 396:    */     }
/* 397:428 */     if (paramwh.u())
/* 398:    */     {
/* 399:429 */       z();
/* 400:430 */       setDead();
/* 401:431 */       return false;
/* 402:    */     }
/* 403:434 */     long l = this.world.K();
/* 404:435 */     if ((l - this.i <= 5L) || (bool1))
/* 405:    */     {
/* 406:436 */       A();
/* 407:437 */       z();
/* 408:438 */       setDead();
/* 409:    */     }
/* 410:    */     else
/* 411:    */     {
/* 412:440 */       this.i = l;
/* 413:    */     }
/* 414:442 */     return false;
/* 415:    */   }
/* 416:    */   
/* 417:    */   private void z()
/* 418:    */   {
/* 419:446 */     if ((this.world instanceof WorldServer)) {
/* 420:447 */       ((WorldServer)this.world).a(ew.M, this.xPos, this.yPos + this.K / 1.5D, this.zPos, 10, this.J / 4.0F, this.K / 4.0F, this.J / 4.0F, 0.05D, new int[] { ProtoBlock.f(BlockList.planks.instance()) });
/* 421:    */     }
/* 422:    */   }
/* 423:    */   
/* 424:    */   private void a(float paramFloat)
/* 425:    */   {
/* 426:452 */     float f1 = getHealth();
/* 427:453 */     f1 -= paramFloat;
/* 428:454 */     if (f1 <= 0.5F)
/* 429:    */     {
/* 430:455 */       C();
/* 431:456 */       setDead();
/* 432:    */     }
/* 433:    */     else
/* 434:    */     {
/* 435:458 */       h(f1);
/* 436:    */     }
/* 437:    */   }
/* 438:    */   
/* 439:    */   private void A()
/* 440:    */   {
/* 441:463 */     ProtoBlock.a(this.world, new BlockPosition(this), new ItemStack(ItemList.armorStand));
/* 442:464 */     C();
/* 443:    */   }
/* 444:    */   
/* 445:    */   private void C()
/* 446:    */   {
/* 447:468 */     for (int j = 0; j < this.g.length; j++) {
/* 448:469 */       if ((this.g[j] != null) && (this.g[j].stackSize > 0))
/* 449:    */       {
/* 450:470 */         if (this.g[j] != null) {
/* 451:471 */           ProtoBlock.a(this.world, new BlockPosition(this).up(), this.g[j]);
/* 452:    */         }
/* 453:473 */         this.g[j] = null;
/* 454:    */       }
/* 455:    */     }
/* 456:    */   }
/* 457:    */   
/* 458:    */   protected float h(float paramFloat1, float paramFloat2)
/* 459:    */   {
/* 460:480 */     this.aH = this.lastYaw;
/* 461:481 */     this.aG = this.yaw;
/* 462:482 */     return 0.0F;
/* 463:    */   }
/* 464:    */   
/* 465:    */   public float aR()
/* 466:    */   {
/* 467:487 */     return i_() ? this.K * 0.5F : this.K * 0.9F;
/* 468:    */   }
/* 469:    */   
/* 470:    */   public void g(float paramFloat1, float paramFloat2)
/* 471:    */   {
/* 472:492 */     if (p()) {
/* 473:493 */       return;
/* 474:    */     }
/* 475:495 */     super.g(paramFloat1, paramFloat2);
/* 476:    */   }
/* 477:    */   
/* 478:    */   public void onUpdate()
/* 479:    */   {
/* 480:500 */     super.onUpdate();
/* 481:    */     
/* 482:502 */     fa localfa1 = this.ac.h(11);
/* 483:503 */     if (!this.bh.equals(localfa1)) {
/* 484:504 */       a(localfa1);
/* 485:    */     }
/* 486:506 */     fa localfa2 = this.ac.h(12);
/* 487:507 */     if (!this.bi.equals(localfa2)) {
/* 488:508 */       b(localfa2);
/* 489:    */     }
/* 490:510 */     fa localfa3 = this.ac.h(13);
/* 491:511 */     if (!this.bj.equals(localfa3)) {
/* 492:512 */       c(localfa3);
/* 493:    */     }
/* 494:514 */     fa localfa4 = this.ac.h(14);
/* 495:515 */     if (!this.bk.equals(localfa4)) {
/* 496:516 */       d(localfa4);
/* 497:    */     }
/* 498:518 */     fa localfa5 = this.ac.h(15);
/* 499:519 */     if (!this.bl.equals(localfa5)) {
/* 500:520 */       e(localfa5);
/* 501:    */     }
/* 502:522 */     fa localfa6 = this.ac.h(16);
/* 503:523 */     if (!this.bm.equals(localfa6)) {
/* 504:524 */       f(localfa6);
/* 505:    */     }
/* 506:    */   }
/* 507:    */   
/* 508:    */   protected void B()
/* 509:    */   {
/* 510:530 */     e(this.h);
/* 511:    */   }
/* 512:    */   
/* 513:    */   public void e(boolean paramBoolean)
/* 514:    */   {
/* 515:535 */     this.h = paramBoolean;
/* 516:536 */     super.e(paramBoolean);
/* 517:    */   }
/* 518:    */   
/* 519:    */   public boolean i_()
/* 520:    */   {
/* 521:541 */     return n();
/* 522:    */   }
/* 523:    */   
/* 524:    */   public void G()
/* 525:    */   {
/* 526:546 */     setDead();
/* 527:    */   }
/* 528:    */   
/* 529:    */   public boolean aV()
/* 530:    */   {
/* 531:551 */     return ay();
/* 532:    */   }
/* 533:    */   
/* 534:    */   private void a(boolean paramBoolean)
/* 535:    */   {
/* 536:555 */     byte b1 = this.ac.a(10);
/* 537:556 */     if (paramBoolean) {
/* 538:557 */       b1 = (byte)(b1 | 0x1);
/* 539:    */     } else {
/* 540:559 */       b1 = (byte)(b1 & 0xFFFFFFFE);
/* 541:    */     }
/* 542:561 */     this.ac.b(10, Byte.valueOf(b1));
/* 543:    */   }
/* 544:    */   
/* 545:    */   public boolean n()
/* 546:    */   {
/* 547:565 */     return (this.ac.a(10) & 0x1) != 0;
/* 548:    */   }
/* 549:    */   
/* 550:    */   private void j(boolean paramBoolean)
/* 551:    */   {
/* 552:569 */     byte b1 = this.ac.a(10);
/* 553:570 */     if (paramBoolean) {
/* 554:571 */       b1 = (byte)(b1 | 0x2);
/* 555:    */     } else {
/* 556:573 */       b1 = (byte)(b1 & 0xFFFFFFFD);
/* 557:    */     }
/* 558:575 */     this.ac.b(10, Byte.valueOf(b1));
/* 559:    */   }
/* 560:    */   
/* 561:    */   public boolean p()
/* 562:    */   {
/* 563:579 */     return (this.ac.a(10) & 0x2) != 0;
/* 564:    */   }
/* 565:    */   
/* 566:    */   private void k(boolean paramBoolean)
/* 567:    */   {
/* 568:583 */     byte b1 = this.ac.a(10);
/* 569:584 */     if (paramBoolean) {
/* 570:585 */       b1 = (byte)(b1 | 0x4);
/* 571:    */     } else {
/* 572:587 */       b1 = (byte)(b1 & 0xFFFFFFFB);
/* 573:    */     }
/* 574:589 */     this.ac.b(10, Byte.valueOf(b1));
/* 575:    */   }
/* 576:    */   
/* 577:    */   public boolean q()
/* 578:    */   {
/* 579:593 */     return (this.ac.a(10) & 0x4) != 0;
/* 580:    */   }
/* 581:    */   
/* 582:    */   private void l(boolean paramBoolean)
/* 583:    */   {
/* 584:597 */     byte b1 = this.ac.a(10);
/* 585:598 */     if (paramBoolean) {
/* 586:599 */       b1 = (byte)(b1 | 0x8);
/* 587:    */     } else {
/* 588:601 */       b1 = (byte)(b1 & 0xFFFFFFF7);
/* 589:    */     }
/* 590:603 */     this.ac.b(10, Byte.valueOf(b1));
/* 591:    */   }
/* 592:    */   
/* 593:    */   public boolean r()
/* 594:    */   {
/* 595:607 */     return (this.ac.a(10) & 0x8) != 0;
/* 596:    */   }
/* 597:    */   
/* 598:    */   public void a(fa paramfa)
/* 599:    */   {
/* 600:611 */     this.bh = paramfa;
/* 601:612 */     this.ac.b(11, paramfa);
/* 602:    */   }
/* 603:    */   
/* 604:    */   public void b(fa paramfa)
/* 605:    */   {
/* 606:616 */     this.bi = paramfa;
/* 607:617 */     this.ac.b(12, paramfa);
/* 608:    */   }
/* 609:    */   
/* 610:    */   public void c(fa paramfa)
/* 611:    */   {
/* 612:621 */     this.bj = paramfa;
/* 613:622 */     this.ac.b(13, paramfa);
/* 614:    */   }
/* 615:    */   
/* 616:    */   public void d(fa paramfa)
/* 617:    */   {
/* 618:626 */     this.bk = paramfa;
/* 619:627 */     this.ac.b(14, paramfa);
/* 620:    */   }
/* 621:    */   
/* 622:    */   public void e(fa paramfa)
/* 623:    */   {
/* 624:631 */     this.bl = paramfa;
/* 625:632 */     this.ac.b(15, paramfa);
/* 626:    */   }
/* 627:    */   
/* 628:    */   public void f(fa paramfa)
/* 629:    */   {
/* 630:636 */     this.bm = paramfa;
/* 631:637 */     this.ac.b(16, paramfa);
/* 632:    */   }
/* 633:    */   
/* 634:    */   public fa s()
/* 635:    */   {
/* 636:641 */     return this.bh;
/* 637:    */   }
/* 638:    */   
/* 639:    */   public fa t()
/* 640:    */   {
/* 641:645 */     return this.bi;
/* 642:    */   }
/* 643:    */   
/* 644:    */   public fa u()
/* 645:    */   {
/* 646:649 */     return this.bj;
/* 647:    */   }
/* 648:    */   
/* 649:    */   public fa v()
/* 650:    */   {
/* 651:653 */     return this.bk;
/* 652:    */   }
/* 653:    */   
/* 654:    */   public fa w()
/* 655:    */   {
/* 656:657 */     return this.bl;
/* 657:    */   }
/* 658:    */   
/* 659:    */   public fa x()
/* 660:    */   {
/* 661:661 */     return this.bm;
/* 662:    */   }
/* 663:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     adi
 * JD-Core Version:    0.7.0.1
 */
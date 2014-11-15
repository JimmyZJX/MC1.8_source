package net.minecraft.src;
/*   3:    */ 
/*   4:    */ public class EntityWolf
/*   5:    */   extends EntityPet
/*   6:    */ {
/*   7:    */   private float bm;
/*   8:    */   private float bn;
/*   9:    */   private boolean bo;
/*  10:    */   private boolean bp;
/*  11:    */   private float bq;
/*  12:    */   private float br;
/*  13:    */   
/*  14:    */   public EntityWolf(World paramaqu)
/*  15:    */   {
/*  16: 42 */     super(paramaqu);
/*  17: 43 */     a(0.6F, 0.8F);
/*  18:    */     
/*  19: 45 */     ((aay)s()).a(true);
/*  20: 46 */     this.i.a(1, new yy(this));
/*  21: 47 */     this.i.a(2, this.bk);
/*  22: 48 */     this.i.a(3, new zg(this, 0.4F));
/*  23: 49 */     this.i.a(4, new zk(this, 1.0D, true));
/*  24: 50 */     this.i.a(5, new yz(this, 1.0D, 10.0F, 2.0F));
/*  25: 51 */     this.i.a(6, new yt(this, 1.0D));
/*  26: 52 */     this.i.a(7, new zy(this, 1.0D));
/*  27: 53 */     this.i.a(8, new yr(this, 8.0F));
/*  28: 54 */     this.i.a(9, new zh(this, EntityPlayer.class, 8.0F));
/*  29: 55 */     this.i.a(9, new zx(this));
/*  30:    */     
/*  31: 57 */     this.bg.a(1, new aau(this));
/*  32: 58 */     this.bg.a(2, new aav(this));
/*  33: 59 */     this.bg.a(3, new aal(this, true, new Class[0]));
/*  34: 60 */     this.bg.a(4, new aat(this, EntityAnimal.class, false, new acv(this)));
/*  35:    */     
/*  36:    */ 
/*  37:    */ 
/*  38:    */ 
/*  39:    */ 
/*  40: 66 */     this.bg.a(5, new aaq(this, EntitySkeleton.class, false));
/*  41:    */     
/*  42: 68 */     m(false);
/*  43:    */   }
/*  44:    */   
/*  45:    */   protected void aW()
/*  46:    */   {
/*  47: 73 */     super.aW();
/*  48:    */     
/*  49: 75 */     a(afs.d).a(0.300000011920929D);
/*  50: 77 */     if (cj()) {
/*  51: 78 */       a(afs.a).a(20.0D);
/*  52:    */     } else {
/*  53: 80 */       a(afs.a).a(8.0D);
/*  54:    */     }
/*  55: 83 */     bx().b(afs.e);
/*  56: 84 */     a(afs.e).a(2.0D);
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void d(EntityLiving paramxm)
/*  60:    */   {
/*  61: 89 */     super.d(paramxm);
/*  62: 90 */     if (paramxm == null) {
/*  63: 91 */       o(false);
/*  64: 92 */     } else if (!cj()) {
/*  65: 93 */       o(true);
/*  66:    */     }
/*  67:    */   }
/*  68:    */   
/*  69:    */   protected void E()
/*  70:    */   {
/*  71: 99 */     this.ac.b(18, Float.valueOf(getHealth()));
/*  72:    */   }
/*  73:    */   
/*  74:    */   protected void h()
/*  75:    */   {
/*  76:104 */     super.h();
/*  77:105 */     this.ac.a(18, new Float(getHealth()));
/*  78:106 */     this.ac.a(19, new Byte((byte)0));
/*  79:107 */     this.ac.a(20, new Byte((byte)EnumDyeColor.RED.a()));
/*  80:    */   }
/*  81:    */   
/*  82:    */   protected void a(BlockPosition paramdt, ProtoBlock paramatr)
/*  83:    */   {
/*  84:112 */     a("mob.wolf.step", 0.15F, 1.0F);
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/*  88:    */   {
/*  89:117 */     super.writeEntityToNBT(paramfn);
/*  90:    */     
/*  91:119 */     paramfn.setBoolean("Angry", ct());
/*  92:120 */     paramfn.setByte("CollarColor", (byte)cu().b());
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/*  96:    */   {
/*  97:125 */     super.readEntityFromNBT(paramfn);
/*  98:    */     
/*  99:127 */     o(paramfn.getBoolean("Angry"));
/* 100:128 */     if (paramfn.hasKey("CollarColor", 99)) {
/* 101:129 */       a(EnumDyeColor.fromIndex(paramfn.d("CollarColor")));
/* 102:    */     }
/* 103:    */   }
/* 104:    */   
/* 105:    */   protected String z()
/* 106:    */   {
/* 107:135 */     if (ct()) {
/* 108:136 */       return "mob.wolf.growl";
/* 109:    */     }
/* 110:138 */     if (this.random.nextInt(3) == 0)
/* 111:    */     {
/* 112:139 */       if ((cj()) && (this.ac.d(18) < 10.0F)) {
/* 113:140 */         return "mob.wolf.whine";
/* 114:    */       }
/* 115:142 */       return "mob.wolf.panting";
/* 116:    */     }
/* 117:144 */     return "mob.wolf.bark";
/* 118:    */   }
/* 119:    */   
/* 120:    */   protected String bn()
/* 121:    */   {
/* 122:149 */     return "mob.wolf.hurt";
/* 123:    */   }
/* 124:    */   
/* 125:    */   protected String bo()
/* 126:    */   {
/* 127:154 */     return "mob.wolf.death";
/* 128:    */   }
/* 129:    */   
/* 130:    */   protected float bA()
/* 131:    */   {
/* 132:159 */     return 0.4F;
/* 133:    */   }
/* 134:    */   
/* 135:    */   protected Item A()
/* 136:    */   {
/* 137:164 */     return Item.b(-1);
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void m()
/* 141:    */   {
/* 142:169 */     super.m();
/* 143:171 */     if ((!this.world.isClient) && (this.bo) && (!this.bp) && (!cd()) && (this.C))
/* 144:    */     {
/* 145:172 */       this.bp = true;
/* 146:173 */       this.bq = 0.0F;
/* 147:174 */       this.br = 0.0F;
/* 148:175 */       this.world.a(this, (byte)8);
/* 149:    */     }
/* 150:177 */     if ((!this.world.isClient) && (u() == null) && (ct())) {
/* 151:178 */       o(false);
/* 152:    */     }
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void onUpdate()
/* 156:    */   {
/* 157:184 */     super.onUpdate();
/* 158:    */     
/* 159:186 */     this.bn = this.bm;
/* 160:187 */     if (cv()) {
/* 161:188 */       this.bm += (1.0F - this.bm) * 0.4F;
/* 162:    */     } else {
/* 163:190 */       this.bm += (0.0F - this.bm) * 0.4F;
/* 164:    */     }
/* 165:193 */     if (U())
/* 166:    */     {
/* 167:194 */       this.bo = true;
/* 168:195 */       this.bp = false;
/* 169:196 */       this.bq = 0.0F;
/* 170:197 */       this.br = 0.0F;
/* 171:    */     }
/* 172:198 */     else if (((this.bo) || (this.bp)) && 
/* 173:199 */       (this.bp))
/* 174:    */     {
/* 175:200 */       if (this.bq == 0.0F) {
/* 176:201 */         a("mob.wolf.shake", bA(), (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
/* 177:    */       }
/* 178:204 */       this.br = this.bq;
/* 179:205 */       this.bq += 0.05F;
/* 180:207 */       if (this.br >= 2.0F)
/* 181:    */       {
/* 182:208 */         this.bo = false;
/* 183:209 */         this.bp = false;
/* 184:210 */         this.br = 0.0F;
/* 185:211 */         this.bq = 0.0F;
/* 186:    */       }
/* 187:214 */       if (this.bq > 0.4F)
/* 188:    */       {
/* 189:215 */         float f1 = (float)getAABB().minY;
/* 190:216 */         int i = (int)(MathUtils.sin((this.bq - 0.4F) * 3.141593F) * 7.0F);
/* 191:217 */         for (int j = 0; j < i; j++)
/* 192:    */         {
/* 193:218 */           float f2 = (this.random.nextFloat() * 2.0F - 1.0F) * this.J * 0.5F;
/* 194:219 */           float f3 = (this.random.nextFloat() * 2.0F - 1.0F) * this.J * 0.5F;
/* 195:220 */           this.world.a(ew.f, this.xPos + f2, f1 + 0.8F, this.zPos + f3, this.xVelocity, this.yVelocity, this.zVelocity, new int[0]);
/* 196:    */         }
/* 197:    */       }
/* 198:    */     }
/* 199:    */   }
/* 200:    */   
/* 201:    */   public boolean cr()
/* 202:    */   {
/* 203:228 */     return this.bo;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public float o(float paramFloat)
/* 207:    */   {
/* 208:232 */     return 0.75F + (this.br + (this.bq - this.br) * paramFloat) / 2.0F * 0.25F;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public float i(float paramFloat1, float paramFloat2)
/* 212:    */   {
/* 213:236 */     float f = (this.br + (this.bq - this.br) * paramFloat1 + paramFloat2) / 1.8F;
/* 214:237 */     if (f < 0.0F) {
/* 215:238 */       f = 0.0F;
/* 216:239 */     } else if (f > 1.0F) {
/* 217:240 */       f = 1.0F;
/* 218:    */     }
/* 219:242 */     return MathUtils.sin(f * 3.141593F) * MathUtils.sin(f * 3.141593F * 11.0F) * 0.15F * 3.141593F;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public float p(float paramFloat)
/* 223:    */   {
/* 224:246 */     return (this.bn + (this.bm - this.bn) * paramFloat) * 0.15F * 3.141593F;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public float aR()
/* 228:    */   {
/* 229:251 */     return this.K * 0.8F;
/* 230:    */   }
/* 231:    */   
/* 232:    */   public int bP()
/* 233:    */   {
/* 234:256 */     if (cl()) {
/* 235:257 */       return 20;
/* 236:    */     }
/* 237:259 */     return super.bP();
/* 238:    */   }
/* 239:    */   
/* 240:    */   public boolean a(DamageSource paramwh, float paramFloat)
/* 241:    */   {
/* 242:264 */     if (b(paramwh)) {
/* 243:265 */       return false;
/* 244:    */     }
/* 245:267 */     Entity localwv = paramwh.j();
/* 246:268 */     this.bk.a(false);
/* 247:270 */     if ((localwv != null) && (!(localwv instanceof EntityPlayer)) && (!(localwv instanceof ahj))) {
/* 248:272 */       paramFloat = (paramFloat + 1.0F) / 2.0F;
/* 249:    */     }
/* 250:274 */     return super.a(paramwh, paramFloat);
/* 251:    */   }
/* 252:    */   
/* 253:    */   public boolean r(Entity paramwv)
/* 254:    */   {
/* 255:279 */     boolean bool = paramwv.a(DamageSource.a(this), (int)a(afs.e).e());
/* 256:280 */     if (bool) {
/* 257:281 */       a(this, paramwv);
/* 258:    */     }
/* 259:283 */     return bool;
/* 260:    */   }
/* 261:    */   
/* 262:    */   public void m(boolean paramBoolean)
/* 263:    */   {
/* 264:288 */     super.m(paramBoolean);
/* 265:290 */     if (paramBoolean) {
/* 266:291 */       a(afs.a).a(20.0D);
/* 267:    */     } else {
/* 268:293 */       a(afs.a).a(8.0D);
/* 269:    */     }
/* 270:296 */     a(afs.e).a(4.0D);
/* 271:    */   }
/* 272:    */   
/* 273:    */   public boolean a(EntityPlayer paramahd)
/* 274:    */   {
/* 275:301 */     ItemStack localamj = paramahd.bg.h();
/* 276:303 */     if (cj())
/* 277:    */     {
/* 278:304 */       if (localamj != null)
/* 279:    */       {
/* 280:    */         Object localObject;
/* 281:305 */         if ((localamj.getItem() instanceof all))
/* 282:    */         {
/* 283:306 */           localObject = (all)localamj.getItem();
/* 284:308 */           if ((((all)localObject).g()) && (this.ac.d(18) < 20.0F))
/* 285:    */           {
/* 286:309 */             if (!paramahd.by.d) {
/* 287:310 */               localamj.stackSize -= 1;
/* 288:    */             }
/* 289:312 */             g(((all)localObject).h(localamj));
/* 290:313 */             if (localamj.stackSize <= 0) {
/* 291:314 */               paramahd.bg.a(paramahd.bg.c, null);
/* 292:    */             }
/* 293:316 */             return true;
/* 294:    */           }
/* 295:    */         }
/* 296:318 */         else if (localamj.getItem() == ItemList.dye)
/* 297:    */         {
/* 298:319 */           localObject = EnumDyeColor.fromIndex(localamj.getDamage2());
/* 299:320 */           if (localObject != cu())
/* 300:    */           {
/* 301:321 */             a((EnumDyeColor)localObject);
/* 302:323 */             if (!paramahd.by.d) {
/* 303:323 */               if (--localamj.stackSize <= 0) {
/* 304:324 */                 paramahd.bg.a(paramahd.bg.c, null);
/* 305:    */               }
/* 306:    */             }
/* 307:327 */             return true;
/* 308:    */           }
/* 309:    */         }
/* 310:    */       }
/* 311:331 */       if ((e(paramahd)) && 
/* 312:332 */         (!this.world.isClient) && (!d(localamj)))
/* 313:    */       {
/* 314:333 */         this.bk.a(!cl());
/* 315:334 */         this.aW = false;
/* 316:335 */         this.h.n();
/* 317:336 */         d((EntityLiving)null);
/* 318:    */       }
/* 319:    */     }
/* 320:340 */     else if ((localamj != null) && (localamj.getItem() == ItemList.bone) && (!ct()))
/* 321:    */     {
/* 322:341 */       if (!paramahd.by.d) {
/* 323:342 */         localamj.stackSize -= 1;
/* 324:    */       }
/* 325:344 */       if (localamj.stackSize <= 0) {
/* 326:345 */         paramahd.bg.a(paramahd.bg.c, null);
/* 327:    */       }
/* 328:347 */       if (!this.world.isClient) {
/* 329:348 */         if (this.random.nextInt(3) == 0)
/* 330:    */         {
/* 331:349 */           m(true);
/* 332:350 */           this.h.n();
/* 333:351 */           d((EntityLiving)null);
/* 334:352 */           this.bk.a(true);
/* 335:353 */           h(20.0F);
/* 336:354 */           b(paramahd.getUUID().toString());
/* 337:355 */           l(true);
/* 338:356 */           this.world.a(this, (byte)7);
/* 339:    */         }
/* 340:    */         else
/* 341:    */         {
/* 342:358 */           l(false);
/* 343:359 */           this.world.a(this, (byte)6);
/* 344:    */         }
/* 345:    */       }
/* 346:363 */       return true;
/* 347:    */     }
/* 348:366 */     return super.a(paramahd);
/* 349:    */   }
/* 350:    */   
/* 351:    */   public void a(byte paramByte)
/* 352:    */   {
/* 353:371 */     if (paramByte == 8)
/* 354:    */     {
/* 355:372 */       this.bp = true;
/* 356:373 */       this.bq = 0.0F;
/* 357:374 */       this.br = 0.0F;
/* 358:    */     }
/* 359:    */     else
/* 360:    */     {
/* 361:376 */       super.a(paramByte);
/* 362:    */     }
/* 363:    */   }
/* 364:    */   
/* 365:    */   public float cs()
/* 366:    */   {
/* 367:381 */     if (ct()) {
/* 368:382 */       return 1.53938F;
/* 369:    */     }
/* 370:383 */     if (cj()) {
/* 371:384 */       return (0.55F - (20.0F - this.ac.d(18)) * 0.02F) * 3.141593F;
/* 372:    */     }
/* 373:386 */     return 0.6283186F;
/* 374:    */   }
/* 375:    */   
/* 376:    */   public boolean d(ItemStack paramamj)
/* 377:    */   {
/* 378:391 */     if (paramamj == null) {
/* 379:392 */       return false;
/* 380:    */     }
/* 381:394 */     if (!(paramamj.getItem() instanceof all)) {
/* 382:395 */       return false;
/* 383:    */     }
/* 384:397 */     return ((all)paramamj.getItem()).g();
/* 385:    */   }
/* 386:    */   
/* 387:    */   public int getMaxSpawnedInChunk()
/* 388:    */   {
/* 389:402 */     return 8;
/* 390:    */   }
/* 391:    */   
/* 392:    */   public boolean ct()
/* 393:    */   {
/* 394:406 */     return (this.ac.a(16) & 0x2) != 0;
/* 395:    */   }
/* 396:    */   
/* 397:    */   public void o(boolean paramBoolean)
/* 398:    */   {
/* 399:410 */     int i = this.ac.a(16);
/* 400:411 */     if (paramBoolean) {
/* 401:412 */       this.ac.b(16, Byte.valueOf((byte)(i | 0x2)));
/* 402:    */     } else {
/* 403:414 */       this.ac.b(16, Byte.valueOf((byte)(i & 0xFFFFFFFD)));
/* 404:    */     }
/* 405:    */   }
/* 406:    */   
/* 407:    */   public EnumDyeColor cu()
/* 408:    */   {
/* 409:419 */     return EnumDyeColor.fromIndex(this.ac.a(20) & 0xF);
/* 410:    */   }
/* 411:    */   
/* 412:    */   public void a(EnumDyeColor paramakv)
/* 413:    */   {
/* 414:423 */     this.ac.b(20, Byte.valueOf((byte)(paramakv.b() & 0xF)));
/* 415:    */   }
/* 416:    */   
/* 417:    */   public EntityWolf b(EntityPassiveMob paramws)
/* 418:    */   {
/* 419:428 */     EntityWolf localacu = new EntityWolf(this.world);
/* 420:429 */     String str = b();
/* 421:430 */     if ((str != null) && (str.trim().length() > 0))
/* 422:    */     {
/* 423:431 */       localacu.b(str);
/* 424:432 */       localacu.m(true);
/* 425:    */     }
/* 426:434 */     return localacu;
/* 427:    */   }
/* 428:    */   
/* 429:    */   public void p(boolean paramBoolean)
/* 430:    */   {
/* 431:438 */     if (paramBoolean) {
/* 432:439 */       this.ac.b(19, Byte.valueOf((byte)1));
/* 433:    */     } else {
/* 434:441 */       this.ac.b(19, Byte.valueOf((byte)0));
/* 435:    */     }
/* 436:    */   }
/* 437:    */   
/* 438:    */   public boolean a(EntityAnimal paramabq)
/* 439:    */   {
/* 440:447 */     if (paramabq == this) {
/* 441:448 */       return false;
/* 442:    */     }
/* 443:450 */     if (!cj()) {
/* 444:451 */       return false;
/* 445:    */     }
/* 446:453 */     if (!(paramabq instanceof EntityWolf)) {
/* 447:454 */       return false;
/* 448:    */     }
/* 449:457 */     EntityWolf localacu = (EntityWolf)paramabq;
/* 450:458 */     if (!localacu.cj()) {
/* 451:459 */       return false;
/* 452:    */     }
/* 453:461 */     if (localacu.cl()) {
/* 454:462 */       return false;
/* 455:    */     }
/* 456:465 */     return (cp()) && (localacu.cp());
/* 457:    */   }
/* 458:    */   
/* 459:    */   public boolean cv()
/* 460:    */   {
/* 461:469 */     return this.ac.a(19) == 1;
/* 462:    */   }
/* 463:    */   
/* 464:    */   protected boolean C()
/* 465:    */   {
/* 466:474 */     return (!cj()) && (this.W > 2400);
/* 467:    */   }
/* 468:    */   
/* 469:    */   public boolean a(EntityLiving paramxm1, EntityLiving paramxm2)
/* 470:    */   {
/* 471:480 */     if (((paramxm1 instanceof EntityCreeper)) || ((paramxm1 instanceof EntityGhast))) {
/* 472:481 */       return false;
/* 473:    */     }
/* 474:484 */     if ((paramxm1 instanceof EntityWolf))
/* 475:    */     {
/* 476:485 */       EntityWolf localacu = (EntityWolf)paramxm1;
/* 477:486 */       if ((localacu.cj()) && (localacu.l_() == paramxm2)) {
/* 478:487 */         return false;
/* 479:    */       }
/* 480:    */     }
/* 481:490 */     if (((paramxm1 instanceof EntityPlayer)) && ((paramxm2 instanceof EntityPlayer)) && (!((EntityPlayer)paramxm2).a((EntityPlayer)paramxm1))) {
/* 482:492 */       return false;
/* 483:    */     }
/* 484:495 */     if (((paramxm1 instanceof EntityHorse)) && (((EntityHorse)paramxm1).cm())) {
/* 485:496 */       return false;
/* 486:    */     }
/* 487:498 */     return true;
/* 488:    */   }
/* 489:    */   
/* 490:    */   public boolean ca()
/* 491:    */   {
/* 492:503 */     return (!ct()) && (super.ca());
/* 493:    */   }
				public EntityPassiveMob a(EntityPassiveMob arg0) {return b(arg0);}
/* 494:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     acu
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*   1:    */ import java.util.UUID;
/*   2:    */ import net.minecraft.server.MinecraftServer;
/*   3:    */ 
/*   4:    */ public abstract class adx
/*   5:    */   extends Entity
/*   6:    */   implements vz
/*   7:    */ {
/*   8:    */   private boolean a;
/*   9:    */   private String b;
/*  10:    */   
/*  11:    */   public adx(World paramaqu)
/*  12:    */   {
/*  13: 86 */     super(paramaqu);
/*  14: 87 */     this.k = true;
/*  15: 88 */     a(0.98F, 0.7F);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public static adx a(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, EnumMinecartVariant paramadz)
/*  19:    */   {
/*  20: 92 */     switch (ady.a[paramadz.ordinal()])
/*  21:    */     {
/*  22:    */     case 1: 
/*  23: 94 */       return new aea(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  24:    */     case 2: 
/*  25: 96 */       return new aee(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  26:    */     case 3: 
/*  27: 98 */       return new aej(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  28:    */     case 4: 
/*  29:100 */       return new aeh(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  30:    */     case 5: 
/*  31:102 */       return new aef(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  32:    */     case 6: 
/*  33:104 */       return new aeb(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  34:    */     }
/*  35:106 */     return new aeg(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  36:    */   }
/*  37:    */   
/*  38:    */   protected boolean r_()
/*  39:    */   {
/*  40:112 */     return false;
/*  41:    */   }
/*  42:    */   
/*  43:    */   protected void h()
/*  44:    */   {
/*  45:117 */     this.ac.a(17, new Integer(0));
/*  46:118 */     this.ac.a(18, new Integer(1));
/*  47:119 */     this.ac.a(19, new Float(0.0F));
/*  48:120 */     this.ac.a(20, new Integer(0));
/*  49:121 */     this.ac.a(21, new Integer(6));
/*  50:122 */     this.ac.a(22, Byte.valueOf((byte)0));
/*  51:    */   }
/*  52:    */   
/*  53:    */   public AABB j(Entity paramwv)
/*  54:    */   {
/*  55:127 */     if (paramwv.ae()) {
/*  56:128 */       return paramwv.getAABB();
/*  57:    */     }
/*  58:130 */     return null;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public AABB S()
/*  62:    */   {
/*  63:135 */     return null;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public boolean ae()
/*  67:    */   {
/*  68:140 */     return true;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public adx(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  72:    */   {
/*  73:144 */     this(paramaqu);
/*  74:145 */     setPos(paramDouble1, paramDouble2, paramDouble3);
/*  75:    */     
/*  76:147 */     this.xVelocity = 0.0D;
/*  77:148 */     this.yVelocity = 0.0D;
/*  78:149 */     this.zVelocity = 0.0D;
/*  79:    */     
/*  80:151 */     this.lastX = paramDouble1;
/*  81:152 */     this.lastY = paramDouble2;
/*  82:153 */     this.lastZ = paramDouble3;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public double an()
/*  86:    */   {
/*  87:158 */     return this.height * 0.5D - 0.2000000029802322D;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public boolean a(DamageSource paramwh, float paramFloat)
/*  91:    */   {
/*  92:163 */     if ((this.world.isClient) || (this.isDead)) {
/*  93:164 */       return true;
/*  94:    */     }
/*  95:166 */     if (b(paramwh)) {
/*  96:167 */       return false;
/*  97:    */     }
/*  98:169 */     k(-r());
/*  99:170 */     j(10);
/* 100:171 */     ac();
/* 101:172 */     a(p() + paramFloat * 10.0F);
/* 102:173 */     int j = ((paramwh.j() instanceof EntityPlayer)) && (((EntityPlayer)paramwh.j()).by.d) ? 1 : 0;
/* 103:175 */     if ((j != 0) || (p() > 40.0F))
/* 104:    */     {
/* 105:176 */       if (this.rider != null) {
/* 106:177 */         this.rider.mount((Entity)null);
/* 107:    */       }
/* 108:180 */       if ((j == 0) || (k_())) {
/* 109:181 */         a(paramwh);
/* 110:    */       } else {
/* 111:183 */         setDead();
/* 112:    */       }
/* 113:    */     }
/* 114:186 */     return true;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void a(DamageSource paramwh)
/* 118:    */   {
/* 119:190 */     setDead();
/* 120:191 */     ItemStack localamj = new ItemStack(ItemList.az, 1);
/* 121:192 */     if (this.b != null) {
/* 122:193 */       localamj.c(this.b);
/* 123:    */     }
/* 124:195 */     a(localamj, 0.0F);
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void as()
/* 128:    */   {
/* 129:200 */     k(-r());
/* 130:201 */     j(10);
/* 131:202 */     a(p() + p() * 10.0F);
/* 132:    */   }
/* 133:    */   
/* 134:    */   public boolean ad()
/* 135:    */   {
/* 136:207 */     return !this.isDead;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setDead()
/* 140:    */   {
/* 141:212 */     super.setDead();
/* 142:    */   }
/* 143:    */   
/* 144:216 */   private static final int[][][] c = { { { 0, 0, -1 }, { 0, 0, 1 } }, { { -1, 0, 0 }, { 1, 0, 0 } }, { { -1, -1, 0 }, { 1, 0, 0 } }, { { -1, 0, 0 }, { 1, -1, 0 } }, { { 0, 0, -1 }, { 0, -1, 1 } }, { { 0, -1, -1 }, { 0, 0, 1 } }, { { 0, 0, 1 }, { 1, 0, 0 } }, { { 0, 0, 1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { 1, 0, 0 } } };
/* 145:    */   private int d;
/* 146:    */   private double e;
/* 147:    */   private double f;
/* 148:    */   private double g;
/* 149:    */   private double h;
/* 150:    */   private double i;
/* 151:    */   private double ap;
/* 152:    */   private double aq;
/* 153:    */   private double ar;
/* 154:    */   
/* 155:    */   public void onUpdate()
/* 156:    */   {
/* 157:232 */     if (q() > 0) {
/* 158:233 */       j(q() - 1);
/* 159:    */     }
/* 160:235 */     if (p() > 0.0F) {
/* 161:236 */       a(p() - 1.0F);
/* 162:    */     }
/* 163:238 */     if (this.yPos < -64.0D) {
/* 164:239 */       O();
/* 165:    */     }
/* 166:242 */     if ((!this.world.isClient) && ((this.world instanceof WorldServer)))
/* 167:    */     {
/* 168:243 */       this.world.profiler.a("portal");
/* 169:244 */       MinecraftServer localMinecraftServer = ((WorldServer)this.world).r();
/* 170:245 */       int k = L();
/* 171:247 */       if (this.ak)
/* 172:    */       {
/* 173:248 */         if (localMinecraftServer.A())
/* 174:    */         {
/* 175:249 */           if ((this.vehicle == null) && 
/* 176:250 */             (this.al++ >= k))
/* 177:    */           {
/* 178:251 */             this.al = k;
/* 179:252 */             this.aj = ar();
/* 180:    */             int m;
/* 181:256 */             if (this.world.t.q() == -1) {
/* 182:257 */               m = 0;
/* 183:    */             } else {
/* 184:259 */               m = -1;
/* 185:    */             }
/* 186:262 */             c(m);
/* 187:    */           }
/* 188:265 */           this.ak = false;
/* 189:    */         }
/* 190:    */       }
/* 191:    */       else
/* 192:    */       {
/* 193:268 */         if (this.al > 0) {
/* 194:269 */           this.al -= 4;
/* 195:    */         }
/* 196:271 */         if (this.al < 0) {
/* 197:272 */           this.al = 0;
/* 198:    */         }
/* 199:    */       }
/* 200:275 */       if (this.aj > 0) {
/* 201:276 */         this.aj -= 1;
/* 202:    */       }
/* 203:278 */       this.world.profiler.b();
/* 204:    */     }
/* 205:281 */     if (this.world.isClient)
/* 206:    */     {
/* 207:282 */       if (this.d > 0)
/* 208:    */       {
/* 209:283 */         double d1 = this.xPos + (this.e - this.xPos) / this.d;
/* 210:284 */         double d2 = this.yPos + (this.f - this.yPos) / this.d;
/* 211:285 */         double d3 = this.zPos + (this.g - this.zPos) / this.d;
/* 212:    */         
/* 213:287 */         double d5 = MathUtils.wrapDegrees(this.h - this.yaw);
/* 214:    */         
/* 215:289 */         this.yaw = ((float)(this.yaw + d5 / this.d));
/* 216:290 */         this.pitch = ((float)(this.pitch + (this.i - this.pitch) / this.d));
/* 217:    */         
/* 218:292 */         this.d -= 1;
/* 219:293 */         setPos(d1, d2, d3);
/* 220:294 */         b(this.yaw, this.pitch);
/* 221:    */       }
/* 222:    */       else
/* 223:    */       {
/* 224:296 */         setPos(this.xPos, this.yPos, this.zPos);
/* 225:297 */         b(this.yaw, this.pitch);
/* 226:    */       }
/* 227:300 */       return;
/* 228:    */     }
/* 229:302 */     this.lastX = this.xPos;
/* 230:303 */     this.lastY = this.yPos;
/* 231:304 */     this.lastZ = this.zPos;
/* 232:    */     
/* 233:306 */     this.yVelocity -= 0.03999999910593033D;
/* 234:    */     
/* 235:308 */     int j = MathUtils.floor(this.xPos);
/* 236:309 */     int k = MathUtils.floor(this.yPos);
/* 237:310 */     int n = MathUtils.floor(this.zPos);
/* 238:311 */     if (ati.d(this.world, new BlockPosition(j, k - 1, n))) {
/* 239:312 */       k--;
/* 240:    */     }
/* 241:315 */     BlockPosition localdt = new BlockPosition(j, k, n);
/* 242:316 */     Block localbec = this.world.getBlock(localdt);
/* 243:317 */     if (ati.d(localbec))
/* 244:    */     {
/* 245:318 */       a(localdt, localbec);
/* 246:320 */       if (localbec.getProto() == BlockList.activatorRail) {
/* 247:321 */         a(j, k, n, ((Boolean)localbec.getProperty(azc.M)).booleanValue());
/* 248:    */       }
/* 249:    */     }
/* 250:    */     else
/* 251:    */     {
/* 252:324 */       n();
/* 253:    */     }
/* 254:327 */     Q();
/* 255:    */     
/* 256:329 */     this.pitch = 0.0F;
/* 257:330 */     double d4 = this.lastX - this.xPos;
/* 258:331 */     double d6 = this.lastZ - this.zPos;
/* 259:332 */     if (d4 * d4 + d6 * d6 > 0.001D)
/* 260:    */     {
/* 261:333 */       this.yaw = ((float)(Math.atan2(d6, d4) * 180.0D / 3.141592653589793D));
/* 262:334 */       if (this.a) {
/* 263:335 */         this.yaw += 180.0F;
/* 264:    */       }
/* 265:    */     }
/* 266:339 */     double d7 = MathUtils.wrapDegrees(this.yaw - this.lastYaw);
/* 267:340 */     if ((d7 < -170.0D) || (d7 >= 170.0D))
/* 268:    */     {
/* 269:341 */       this.yaw += 180.0F;
/* 270:342 */       this.a = (!this.a);
/* 271:    */     }
/* 272:344 */     b(this.yaw, this.pitch);
/* 273:346 */     for (Entity localwv : this.world.b(this, getAABB().expand(0.2000000029802322D, 0.0D, 0.2000000029802322D))) {
/* 274:347 */       if ((localwv != this.rider) && (localwv.ae()) && ((localwv instanceof adx))) {
/* 275:348 */         localwv.i(this);
/* 276:    */       }
/* 277:    */     }
/* 278:352 */     if ((this.rider != null) && 
/* 279:353 */       (this.rider.isDead))
/* 280:    */     {
/* 281:354 */       if (this.rider.vehicle == this) {
/* 282:355 */         this.rider.vehicle = null;
/* 283:    */       }
/* 284:357 */       this.rider = null;
/* 285:    */     }
/* 286:361 */     W();
/* 287:    */   }
/* 288:    */   
/* 289:    */   protected double m()
/* 290:    */   {
/* 291:365 */     return 0.4D;
/* 292:    */   }
/* 293:    */   
/* 294:    */   public void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {}
/* 295:    */   
/* 296:    */   protected void n()
/* 297:    */   {
/* 298:372 */     double d1 = m();
/* 299:373 */     this.xVelocity = MathUtils.clamp(this.xVelocity, -d1, d1);
/* 300:374 */     this.zVelocity = MathUtils.clamp(this.zVelocity, -d1, d1);
/* 301:375 */     if (this.C)
/* 302:    */     {
/* 303:376 */       this.xVelocity *= 0.5D;
/* 304:377 */       this.yVelocity *= 0.5D;
/* 305:378 */       this.zVelocity *= 0.5D;
/* 306:    */     }
/* 307:380 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/* 308:382 */     if (!this.C)
/* 309:    */     {
/* 310:383 */       this.xVelocity *= 0.949999988079071D;
/* 311:384 */       this.yVelocity *= 0.949999988079071D;
/* 312:385 */       this.zVelocity *= 0.949999988079071D;
/* 313:    */     }
/* 314:    */   }
/* 315:    */   
/* 316:    */   protected void a(BlockPosition paramdt, Block parambec)
/* 317:    */   {
/* 318:390 */     this.O = 0.0F;
/* 319:    */     
/* 320:392 */     Vec3 localbrw1 = k(this.xPos, this.yPos, this.zPos);
/* 321:393 */     this.yPos = paramdt.getY();
/* 322:    */     
/* 323:395 */     boolean bool = false;
/* 324:396 */     int j = 0;
/* 325:397 */     ati localati = (ati)parambec.getProto();
/* 326:399 */     if (localati == BlockList.D)
/* 327:    */     {
/* 328:400 */       bool = ((Boolean)parambec.getProperty(azc.M)).booleanValue();
/* 329:401 */       j = !bool ? 1 : 0;
/* 330:    */     }
/* 331:404 */     double d1 = 0.0078125D;
/* 332:405 */     EnumRailState localatl = (EnumRailState)parambec.getProperty(localati.l());
/* 333:406 */     switch (ady.b[localatl.ordinal()])
/* 334:    */     {
/* 335:    */     case 1: 
/* 336:408 */       this.xVelocity -= 0.0078125D;
/* 337:409 */       this.yPos += 1.0D;
/* 338:410 */       break;
/* 339:    */     case 2: 
/* 340:412 */       this.xVelocity += 0.0078125D;
/* 341:413 */       this.yPos += 1.0D;
/* 342:414 */       break;
/* 343:    */     case 3: 
/* 344:416 */       this.zVelocity += 0.0078125D;
/* 345:417 */       this.yPos += 1.0D;
/* 346:418 */       break;
/* 347:    */     case 4: 
/* 348:420 */       this.zVelocity -= 0.0078125D;
/* 349:421 */       this.yPos += 1.0D;
/* 350:    */     }
/* 351:425 */     int[][] arrayOfInt = c[localatl.a()];
/* 352:    */     
/* 353:427 */     double d2 = arrayOfInt[1][0] - arrayOfInt[0][0];
/* 354:428 */     double d3 = arrayOfInt[1][2] - arrayOfInt[0][2];
/* 355:429 */     double d4 = Math.sqrt(d2 * d2 + d3 * d3);
/* 356:    */     
/* 357:431 */     double d5 = this.xVelocity * d2 + this.zVelocity * d3;
/* 358:432 */     if (d5 < 0.0D)
/* 359:    */     {
/* 360:433 */       d2 = -d2;
/* 361:434 */       d3 = -d3;
/* 362:    */     }
/* 363:437 */     double d6 = Math.sqrt(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/* 364:438 */     if (d6 > 2.0D) {
/* 365:439 */       d6 = 2.0D;
/* 366:    */     }
/* 367:442 */     this.xVelocity = (d6 * d2 / d4);
/* 368:443 */     this.zVelocity = (d6 * d3 / d4);
/* 369:445 */     if ((this.rider instanceof EntityLiving))
/* 370:    */     {
/* 371:446 */       double d7 = ((EntityLiving)this.rider).aY;
/* 372:448 */       if (d7 > 0.0D)
/* 373:    */       {
/* 374:449 */         double d8 = -Math.sin(this.rider.yaw * 3.141593F / 180.0F);
/* 375:450 */         double d9 = Math.cos(this.rider.yaw * 3.141593F / 180.0F);
/* 376:    */         
/* 377:452 */         double d10 = this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity;
/* 378:454 */         if (d10 < 0.01D)
/* 379:    */         {
/* 380:455 */           this.xVelocity += d8 * 0.1D;
/* 381:456 */           this.zVelocity += d9 * 0.1D;
/* 382:    */           
/* 383:458 */           j = 0;
/* 384:    */         }
/* 385:    */       }
/* 386:    */     }
/* 387:464 */     if (j != 0)
/* 388:    */     {
/* 389:465 */       double d7 = Math.sqrt(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/* 390:466 */       if (d7 < 0.03D)
/* 391:    */       {
/* 392:467 */         this.xVelocity *= 0.0D;
/* 393:468 */         this.yVelocity *= 0.0D;
/* 394:469 */         this.zVelocity *= 0.0D;
/* 395:    */       }
/* 396:    */       else
/* 397:    */       {
/* 398:471 */         this.xVelocity *= 0.5D;
/* 399:472 */         this.yVelocity *= 0.0D;
/* 400:473 */         this.zVelocity *= 0.5D;
/* 401:    */       }
/* 402:    */     }
/* 403:477 */     double d7 = 0.0D;
/* 404:478 */     double d8 = paramdt.getX() + 0.5D + arrayOfInt[0][0] * 0.5D;
/* 405:479 */     double d9 = paramdt.getZ() + 0.5D + arrayOfInt[0][2] * 0.5D;
/* 406:480 */     double d10 = paramdt.getX() + 0.5D + arrayOfInt[1][0] * 0.5D;
/* 407:481 */     double d11 = paramdt.getZ() + 0.5D + arrayOfInt[1][2] * 0.5D;
/* 408:    */     
/* 409:483 */     d2 = d10 - d8;
/* 410:484 */     d3 = d11 - d9;
/* 411:486 */     if (d2 == 0.0D)
/* 412:    */     {
/* 413:487 */       this.xPos = (paramdt.getX() + 0.5D);
/* 414:488 */       d7 = this.zPos - paramdt.getZ();
/* 415:    */     }
/* 416:489 */     else if (d3 == 0.0D)
/* 417:    */     {
/* 418:490 */       this.zPos = (paramdt.getZ() + 0.5D);
/* 419:491 */       d7 = this.xPos - paramdt.getX();
/* 420:    */     }
/* 421:    */     else
/* 422:    */     {
/* 423:493 */       double d12 = this.xPos - d8;
/* 424:494 */       double d13 = this.zPos - d9;
/* 425:    */       
/* 426:496 */       d7 = (d12 * d2 + d13 * d3) * 2.0D;
/* 427:    */     }
/* 428:499 */     this.xPos = (d8 + d2 * d7);
/* 429:500 */     this.zPos = (d9 + d3 * d7);
/* 430:    */     
/* 431:502 */     setPos(this.xPos, this.yPos, this.zPos);
/* 432:    */     
/* 433:504 */     double d12 = this.xVelocity;
/* 434:505 */     double d13 = this.zVelocity;
/* 435:506 */     if (this.rider != null)
/* 436:    */     {
/* 437:507 */       d12 *= 0.75D;
/* 438:508 */       d13 *= 0.75D;
/* 439:    */     }
/* 440:511 */     double d14 = m();
/* 441:512 */     d12 = MathUtils.clamp(d12, -d14, d14);
/* 442:513 */     d13 = MathUtils.clamp(d13, -d14, d14);
/* 443:    */     
/* 444:515 */     d(d12, 0.0D, d13);
/* 445:517 */     if ((arrayOfInt[0][1] != 0) && (MathUtils.floor(this.xPos) - paramdt.getX() == arrayOfInt[0][0]) && (MathUtils.floor(this.zPos) - paramdt.getZ() == arrayOfInt[0][2])) {
/* 446:518 */       setPos(this.xPos, this.yPos + arrayOfInt[0][1], this.zPos);
/* 447:519 */     } else if ((arrayOfInt[1][1] != 0) && (MathUtils.floor(this.xPos) - paramdt.getX() == arrayOfInt[1][0]) && (MathUtils.floor(this.zPos) - paramdt.getZ() == arrayOfInt[1][2])) {
/* 448:520 */       setPos(this.xPos, this.yPos + arrayOfInt[1][1], this.zPos);
/* 449:    */     }
/* 450:523 */     o();
/* 451:    */     
/* 452:525 */     Vec3 localbrw2 = k(this.xPos, this.yPos, this.zPos);
/* 453:526 */     if ((localbrw2 != null) && (localbrw1 != null))
/* 454:    */     {
/* 455:527 */       double d15 = (localbrw1.y - localbrw2.y) * 0.05D;
/* 456:    */       
/* 457:529 */       d6 = Math.sqrt(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/* 458:530 */       if (d6 > 0.0D)
/* 459:    */       {
/* 460:531 */         this.xVelocity = (this.xVelocity / d6 * (d6 + d15));
/* 461:532 */         this.zVelocity = (this.zVelocity / d6 * (d6 + d15));
/* 462:    */       }
/* 463:534 */       setPos(this.xPos, localbrw2.y, this.zPos);
/* 464:    */     }
/* 465:537 */     int k = MathUtils.floor(this.xPos);
/* 466:538 */     int m = MathUtils.floor(this.zPos);
/* 467:539 */     if ((k != paramdt.getX()) || (m != paramdt.getZ()))
/* 468:    */     {
/* 469:540 */       d6 = Math.sqrt(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/* 470:    */       
/* 471:542 */       this.xVelocity = (d6 * (k - paramdt.getX()));
/* 472:543 */       this.zVelocity = (d6 * (m - paramdt.getZ()));
/* 473:    */     }
/* 474:547 */     if (bool)
/* 475:    */     {
/* 476:548 */       double d16 = Math.sqrt(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/* 477:549 */       if (d16 > 0.01D)
/* 478:    */       {
/* 479:550 */         double d17 = 0.06D;
/* 480:551 */         this.xVelocity += this.xVelocity / d16 * d17;
/* 481:552 */         this.zVelocity += this.zVelocity / d16 * d17;
/* 482:    */       }
/* 483:556 */       else if (localatl == EnumRailState.b)
/* 484:    */       {
/* 485:557 */         if (this.world.getBlock(paramdt.west()).getProto().blocksMovement()) {
/* 486:558 */           this.xVelocity = 0.02D;
/* 487:559 */         } else if (this.world.getBlock(paramdt.east()).getProto().blocksMovement()) {
/* 488:560 */           this.xVelocity = -0.02D;
/* 489:    */         }
/* 490:    */       }
/* 491:562 */       else if (localatl == EnumRailState.a)
/* 492:    */       {
/* 493:563 */         if (this.world.getBlock(paramdt.north()).getProto().blocksMovement()) {
/* 494:564 */           this.zVelocity = 0.02D;
/* 495:565 */         } else if (this.world.getBlock(paramdt.south()).getProto().blocksMovement()) {
/* 496:566 */           this.zVelocity = -0.02D;
/* 497:    */         }
/* 498:    */       }
/* 499:    */     }
/* 500:    */   }
/* 501:    */   
/* 502:    */   protected void o()
/* 503:    */   {
/* 504:574 */     if (this.rider != null)
/* 505:    */     {
/* 506:575 */       this.xVelocity *= 0.996999979019165D;
/* 507:576 */       this.yVelocity *= 0.0D;
/* 508:577 */       this.zVelocity *= 0.996999979019165D;
/* 509:    */     }
/* 510:    */     else
/* 511:    */     {
/* 512:579 */       this.xVelocity *= 0.9599999785423279D;
/* 513:580 */       this.yVelocity *= 0.0D;
/* 514:581 */       this.zVelocity *= 0.9599999785423279D;
/* 515:    */     }
/* 516:    */   }
/* 517:    */   
/* 518:    */   public void setPos(double paramDouble1, double paramDouble2, double paramDouble3)
/* 519:    */   {
/* 520:587 */     this.xPos = paramDouble1;
/* 521:588 */     this.yPos = paramDouble2;
/* 522:589 */     this.zPos = paramDouble3;
/* 523:590 */     float f1 = this.width / 2.0F;
/* 524:591 */     float f2 = this.height;
/* 525:592 */     setAABB(new AABB(paramDouble1 - f1, paramDouble2, paramDouble3 - f1, paramDouble1 + f1, paramDouble2 + f2, paramDouble3 + f1));
/* 526:    */   }
/* 527:    */   
/* 528:    */   public Vec3 a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/* 529:    */   {
/* 530:596 */     int j = MathUtils.floor(paramDouble1);
/* 531:597 */     int k = MathUtils.floor(paramDouble2);
/* 532:598 */     int m = MathUtils.floor(paramDouble3);
/* 533:599 */     if (ati.d(this.world, new BlockPosition(j, k - 1, m))) {
/* 534:600 */       k--;
/* 535:    */     }
/* 536:603 */     Block localbec = this.world.getBlock(new BlockPosition(j, k, m));
/* 537:604 */     if (ati.d(localbec))
/* 538:    */     {
/* 539:605 */       EnumRailState localatl = (EnumRailState)localbec.getProperty(((ati)localbec.getProto()).l());
/* 540:606 */       paramDouble2 = k;
/* 541:607 */       if (localatl.c()) {
/* 542:608 */         paramDouble2 = k + 1;
/* 543:    */       }
/* 544:611 */       int[][] arrayOfInt = c[localatl.a()];
/* 545:    */       
/* 546:613 */       double d1 = arrayOfInt[1][0] - arrayOfInt[0][0];
/* 547:614 */       double d2 = arrayOfInt[1][2] - arrayOfInt[0][2];
/* 548:615 */       double d3 = Math.sqrt(d1 * d1 + d2 * d2);
/* 549:616 */       d1 /= d3;
/* 550:617 */       d2 /= d3;
/* 551:    */       
/* 552:619 */       paramDouble1 += d1 * paramDouble4;
/* 553:620 */       paramDouble3 += d2 * paramDouble4;
/* 554:622 */       if ((arrayOfInt[0][1] != 0) && (MathUtils.floor(paramDouble1) - j == arrayOfInt[0][0]) && (MathUtils.floor(paramDouble3) - m == arrayOfInt[0][2])) {
/* 555:623 */         paramDouble2 += arrayOfInt[0][1];
/* 556:624 */       } else if ((arrayOfInt[1][1] != 0) && (MathUtils.floor(paramDouble1) - j == arrayOfInt[1][0]) && (MathUtils.floor(paramDouble3) - m == arrayOfInt[1][2])) {
/* 557:625 */         paramDouble2 += arrayOfInt[1][1];
/* 558:    */       }
/* 559:628 */       return k(paramDouble1, paramDouble2, paramDouble3);
/* 560:    */     }
/* 561:630 */     return null;
/* 562:    */   }
/* 563:    */   
/* 564:    */   public Vec3 k(double paramDouble1, double paramDouble2, double paramDouble3)
/* 565:    */   {
/* 566:634 */     int j = MathUtils.floor(paramDouble1);
/* 567:635 */     int k = MathUtils.floor(paramDouble2);
/* 568:636 */     int m = MathUtils.floor(paramDouble3);
/* 569:637 */     if (ati.d(this.world, new BlockPosition(j, k - 1, m))) {
/* 570:638 */       k--;
/* 571:    */     }
/* 572:641 */     Block localbec = this.world.getBlock(new BlockPosition(j, k, m));
/* 573:642 */     if (ati.d(localbec))
/* 574:    */     {
/* 575:643 */       EnumRailState localatl = (EnumRailState)localbec.getProperty(((ati)localbec.getProto()).l());
/* 576:644 */       int[][] arrayOfInt = c[localatl.a()];
/* 577:    */       
/* 578:646 */       double d1 = 0.0D;
/* 579:647 */       double d2 = j + 0.5D + arrayOfInt[0][0] * 0.5D;
/* 580:648 */       double d3 = k + 0.0625D + arrayOfInt[0][1] * 0.5D;
/* 581:649 */       double d4 = m + 0.5D + arrayOfInt[0][2] * 0.5D;
/* 582:650 */       double d5 = j + 0.5D + arrayOfInt[1][0] * 0.5D;
/* 583:651 */       double d6 = k + 0.0625D + arrayOfInt[1][1] * 0.5D;
/* 584:652 */       double d7 = m + 0.5D + arrayOfInt[1][2] * 0.5D;
/* 585:    */       
/* 586:654 */       double d8 = d5 - d2;
/* 587:655 */       double d9 = (d6 - d3) * 2.0D;
/* 588:656 */       double d10 = d7 - d4;
/* 589:658 */       if (d8 == 0.0D)
/* 590:    */       {
/* 591:659 */         paramDouble1 = j + 0.5D;
/* 592:660 */         d1 = paramDouble3 - m;
/* 593:    */       }
/* 594:661 */       else if (d10 == 0.0D)
/* 595:    */       {
/* 596:662 */         paramDouble3 = m + 0.5D;
/* 597:663 */         d1 = paramDouble1 - j;
/* 598:    */       }
/* 599:    */       else
/* 600:    */       {
/* 601:665 */         double d11 = paramDouble1 - d2;
/* 602:666 */         double d12 = paramDouble3 - d4;
/* 603:    */         
/* 604:668 */         d1 = (d11 * d8 + d12 * d10) * 2.0D;
/* 605:    */       }
/* 606:671 */       paramDouble1 = d2 + d8 * d1;
/* 607:672 */       paramDouble2 = d3 + d9 * d1;
/* 608:673 */       paramDouble3 = d4 + d10 * d1;
/* 609:674 */       if (d9 < 0.0D) {
/* 610:675 */         paramDouble2 += 1.0D;
/* 611:    */       }
/* 612:677 */       if (d9 > 0.0D) {
/* 613:678 */         paramDouble2 += 0.5D;
/* 614:    */       }
/* 615:680 */       return new Vec3(paramDouble1, paramDouble2, paramDouble3);
/* 616:    */     }
/* 617:682 */     return null;
/* 618:    */   }
/* 619:    */   
/* 620:    */   protected void readEntityFromNBT(NBTTagCompound paramfn)
/* 621:    */   {
/* 622:687 */     if (paramfn.getBoolean("CustomDisplayTile"))
/* 623:    */     {
/* 624:688 */       int j = paramfn.getInteger("DisplayData");
/* 625:    */       ProtoBlock localatr;
/* 626:689 */       if (paramfn.hasKey("DisplayTile", 8))
/* 627:    */       {
/* 628:690 */         localatr = ProtoBlock.b(paramfn.getString("DisplayTile"));
/* 629:691 */         if (localatr == null) {
/* 630:692 */           a(BlockList.air.instance());
/* 631:    */         } else {
/* 632:694 */           a(localatr.a(j));
/* 633:    */         }
/* 634:    */       }
/* 635:    */       else
/* 636:    */       {
/* 637:697 */         localatr = ProtoBlock.c(paramfn.getInteger("DisplayTile"));
/* 638:698 */         if (localatr == null) {
/* 639:699 */           a(BlockList.air.instance());
/* 640:    */         } else {
/* 641:701 */           a(localatr.a(j));
/* 642:    */         }
/* 643:    */       }
/* 644:704 */       l(paramfn.getInteger("DisplayOffset"));
/* 645:    */     }
/* 646:707 */     if ((paramfn.hasKey("CustomName", 8)) && (paramfn.getString("CustomName").length() > 0)) {
/* 647:708 */       this.b = paramfn.getString("CustomName");
/* 648:    */     }
/* 649:    */   }
/* 650:    */   
/* 651:    */   protected void writeEntityToNBT(NBTTagCompound paramfn)
/* 652:    */   {
/* 653:714 */     if (x())
/* 654:    */     {
/* 655:715 */       paramfn.setBoolean("CustomDisplayTile", true);
/* 656:716 */       Block localbec = t();
/* 657:717 */       oa localoa = (oa)ProtoBlock.c.c(localbec.getProto());
/* 658:718 */       paramfn.setString("DisplayTile", localoa == null ? "" : localoa.toString());
/* 659:719 */       paramfn.setInt("DisplayData", localbec.getProto().c(localbec));
/* 660:720 */       paramfn.setInt("DisplayOffset", v());
/* 661:    */     }
/* 662:723 */     if ((this.b != null) && (this.b.length() > 0)) {
/* 663:724 */       paramfn.setString("CustomName", this.b);
/* 664:    */     }
/* 665:    */   }
/* 666:    */   
/* 667:    */   public void i(Entity paramwv)
/* 668:    */   {
/* 669:730 */     if (this.world.isClient) {
/* 670:731 */       return;
/* 671:    */     }
/* 672:733 */     if ((paramwv.T) || (this.T)) {
/* 673:734 */       return;
/* 674:    */     }
/* 675:737 */     if (paramwv == this.rider) {
/* 676:738 */       return;
/* 677:    */     }
/* 678:740 */     if (((paramwv instanceof EntityLiving)) && (!(paramwv instanceof EntityPlayer)) && (!(paramwv instanceof EntityIronGolem)) && (s() == EnumMinecartVariant.a) && (this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity > 0.01D) && 
/* 679:741 */       (this.rider == null) && (paramwv.vehicle == null)) {
/* 680:742 */       paramwv.mount(this);
/* 681:    */     }
/* 682:746 */     double d1 = paramwv.xPos - this.xPos;
/* 683:747 */     double d2 = paramwv.zPos - this.zPos;
/* 684:    */     
/* 685:749 */     double d3 = d1 * d1 + d2 * d2;
/* 686:750 */     if (d3 >= 9.999999747378752E-005D)
/* 687:    */     {
/* 688:751 */       d3 = MathUtils.a(d3);
/* 689:752 */       d1 /= d3;
/* 690:753 */       d2 /= d3;
/* 691:754 */       double d4 = 1.0D / d3;
/* 692:755 */       if (d4 > 1.0D) {
/* 693:756 */         d4 = 1.0D;
/* 694:    */       }
/* 695:758 */       d1 *= d4;
/* 696:759 */       d2 *= d4;
/* 697:760 */       d1 *= 0.1000000014901161D;
/* 698:761 */       d2 *= 0.1000000014901161D;
/* 699:    */       
/* 700:763 */       d1 *= (1.0F - this.U);
/* 701:764 */       d2 *= (1.0F - this.U);
/* 702:765 */       d1 *= 0.5D;
/* 703:766 */       d2 *= 0.5D;
/* 704:768 */       if ((paramwv instanceof adx))
/* 705:    */       {
/* 706:769 */         double d5 = paramwv.xPos - this.xPos;
/* 707:770 */         double d6 = paramwv.zPos - this.zPos;
/* 708:    */         
/* 709:772 */         Vec3 localbrw1 = new Vec3(d5, 0.0D, d6).normalize();
/* 710:773 */         Vec3 localbrw2 = new Vec3(MathUtils.cos(this.yaw * 3.141593F / 180.0F), 0.0D, MathUtils.sin(this.yaw * 3.141593F / 180.0F)).normalize();
/* 711:    */         
/* 712:775 */         double d7 = Math.abs(localbrw1.dot(localbrw2));
/* 713:777 */         if (d7 < 0.800000011920929D) {
/* 714:778 */           return;
/* 715:    */         }
/* 716:781 */         double d8 = paramwv.xVelocity + this.xVelocity;
/* 717:782 */         double d9 = paramwv.zVelocity + this.zVelocity;
/* 718:784 */         if ((((adx)paramwv).s() == EnumMinecartVariant.c) && (s() != EnumMinecartVariant.c))
/* 719:    */         {
/* 720:785 */           this.xVelocity *= 0.2000000029802322D;
/* 721:786 */           this.zVelocity *= 0.2000000029802322D;
/* 722:787 */           g(paramwv.xVelocity - d1, 0.0D, paramwv.zVelocity - d2);
/* 723:788 */           paramwv.xVelocity *= 0.949999988079071D;
/* 724:789 */           paramwv.zVelocity *= 0.949999988079071D;
/* 725:    */         }
/* 726:790 */         else if ((((adx)paramwv).s() != EnumMinecartVariant.c) && (s() == EnumMinecartVariant.c))
/* 727:    */         {
/* 728:791 */           paramwv.xVelocity *= 0.2000000029802322D;
/* 729:792 */           paramwv.zVelocity *= 0.2000000029802322D;
/* 730:793 */           paramwv.g(this.xVelocity + d1, 0.0D, this.zVelocity + d2);
/* 731:794 */           this.xVelocity *= 0.949999988079071D;
/* 732:795 */           this.zVelocity *= 0.949999988079071D;
/* 733:    */         }
/* 734:    */         else
/* 735:    */         {
/* 736:797 */           d8 /= 2.0D;
/* 737:798 */           d9 /= 2.0D;
/* 738:799 */           this.xVelocity *= 0.2000000029802322D;
/* 739:800 */           this.zVelocity *= 0.2000000029802322D;
/* 740:801 */           g(d8 - d1, 0.0D, d9 - d2);
/* 741:802 */           paramwv.xVelocity *= 0.2000000029802322D;
/* 742:803 */           paramwv.zVelocity *= 0.2000000029802322D;
/* 743:804 */           paramwv.g(d8 + d1, 0.0D, d9 + d2);
/* 744:    */         }
/* 745:    */       }
/* 746:    */       else
/* 747:    */       {
/* 748:807 */         g(-d1, 0.0D, -d2);
/* 749:808 */         paramwv.g(d1 / 4.0D, 0.0D, d2 / 4.0D);
/* 750:    */       }
/* 751:    */     }
/* 752:    */   }
/* 753:    */   
/* 754:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
/* 755:    */   {
/* 756:819 */     this.e = paramDouble1;
/* 757:820 */     this.f = paramDouble2;
/* 758:821 */     this.g = paramDouble3;
/* 759:822 */     this.h = paramFloat1;
/* 760:823 */     this.i = paramFloat2;
/* 761:    */     
/* 762:825 */     this.d = (paramInt + 2);
/* 763:    */     
/* 764:827 */     this.xVelocity = this.ap;
/* 765:828 */     this.yVelocity = this.aq;
/* 766:829 */     this.zVelocity = this.ar;
/* 767:    */   }
/* 768:    */   
/* 769:    */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/* 770:    */   {
/* 771:834 */     this.ap = (this.xVelocity = paramDouble1);
/* 772:835 */     this.aq = (this.yVelocity = paramDouble2);
/* 773:836 */     this.ar = (this.zVelocity = paramDouble3);
/* 774:    */   }
/* 775:    */   
/* 776:    */   public void a(float paramFloat)
/* 777:    */   {
/* 778:840 */     this.ac.b(19, Float.valueOf(paramFloat));
/* 779:    */   }
/* 780:    */   
/* 781:    */   public float p()
/* 782:    */   {
/* 783:844 */     return this.ac.d(19);
/* 784:    */   }
/* 785:    */   
/* 786:    */   public void j(int paramInt)
/* 787:    */   {
/* 788:848 */     this.ac.b(17, Integer.valueOf(paramInt));
/* 789:    */   }
/* 790:    */   
/* 791:    */   public int q()
/* 792:    */   {
/* 793:852 */     return this.ac.c(17);
/* 794:    */   }
/* 795:    */   
/* 796:    */   public void k(int paramInt)
/* 797:    */   {
/* 798:856 */     this.ac.b(18, Integer.valueOf(paramInt));
/* 799:    */   }
/* 800:    */   
/* 801:    */   public int r()
/* 802:    */   {
/* 803:860 */     return this.ac.c(18);
/* 804:    */   }
/* 805:    */   
/* 806:    */   public abstract EnumMinecartVariant s();
/* 807:    */   
/* 808:    */   public Block t()
/* 809:    */   {
/* 810:866 */     if (!x()) {
/* 811:867 */       return u();
/* 812:    */     }
/* 813:869 */     return ProtoBlock.d(H().c(20));
/* 814:    */   }
/* 815:    */   
/* 816:    */   public Block u()
/* 817:    */   {
/* 818:873 */     return BlockList.air.instance();
/* 819:    */   }
/* 820:    */   
/* 821:    */   public int v()
/* 822:    */   {
/* 823:877 */     if (!x()) {
/* 824:878 */       return w();
/* 825:    */     }
/* 826:880 */     return H().c(21);
/* 827:    */   }
/* 828:    */   
/* 829:    */   public int w()
/* 830:    */   {
/* 831:884 */     return 6;
/* 832:    */   }
/* 833:    */   
/* 834:    */   public void a(Block parambec)
/* 835:    */   {
/* 836:888 */     H().b(20, Integer.valueOf(ProtoBlock.f(parambec)));
/* 837:889 */     a(true);
/* 838:    */   }
/* 839:    */   
/* 840:    */   public void l(int paramInt)
/* 841:    */   {
/* 842:893 */     H().b(21, Integer.valueOf(paramInt));
/* 843:894 */     a(true);
/* 844:    */   }
/* 845:    */   
/* 846:    */   public boolean x()
/* 847:    */   {
/* 848:898 */     return H().a(22) == 1;
/* 849:    */   }
/* 850:    */   
/* 851:    */   public void a(boolean paramBoolean)
/* 852:    */   {
/* 853:902 */     H().b(22, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/* 854:    */   }
/* 855:    */   
/* 856:    */   public void a(String paramString)
/* 857:    */   {
/* 858:907 */     this.b = paramString;
/* 859:    */   }
/* 860:    */   
/* 861:    */   public String getName()
/* 862:    */   {
/* 863:912 */     if (this.b != null) {
/* 864:913 */       return this.b;
/* 865:    */     }
/* 866:915 */     return super.getName();
/* 867:    */   }
/* 868:    */   
/* 869:    */   public boolean k_()
/* 870:    */   {
/* 871:920 */     return this.b != null;
/* 872:    */   }
/* 873:    */   
/* 874:    */   public String aL()
/* 875:    */   {
/* 876:925 */     return this.b;
/* 877:    */   }
/* 878:    */   
/* 879:    */   public ho e_()
/* 880:    */   {
/* 881:930 */     if (k_())
/* 882:    */     {
/* 883:931 */       hy localObject = new hy(this.b);
/* 884:932 */       ((hy)localObject).b().a(aP());
/* 885:933 */       ((hy)localObject).b().a(getUUID().toString());
/* 886:934 */       return localObject;
/* 887:    */     }
/* 888:938 */     hz localObject = new hz(getName(), new Object[0]);
/* 889:939 */     ((hz)localObject).b().a(aP());
/* 890:940 */     ((hz)localObject).b().a(getUUID().toString());
/* 891:941 */     return localObject;
/* 892:    */   }
/* 893:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     adx
 * JD-Core Version:    0.7.0.1
 */
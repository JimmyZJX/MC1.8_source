package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class adu
/*   5:    */   extends Entity
/*   6:    */ {
/*   7: 33 */   private boolean a = true;
/*   8: 34 */   private double b = 0.07000000000000001D;
/*   9:    */   private int c;
/*  10:    */   private double d;
/*  11:    */   private double e;
/*  12:    */   private double f;
/*  13:    */   private double g;
/*  14:    */   private double h;
/*  15:    */   private double i;
/*  16:    */   private double ap;
/*  17:    */   private double aq;
/*  18:    */   
/*  19:    */   public adu(World paramaqu)
/*  20:    */   {
/*  21: 37 */     super(paramaqu);
/*  22: 38 */     this.k = true;
/*  23: 39 */     a(1.5F, 0.6F);
/*  24:    */   }
/*  25:    */   
/*  26:    */   protected boolean r_()
/*  27:    */   {
/*  28: 44 */     return false;
/*  29:    */   }
/*  30:    */   
/*  31:    */   protected void h()
/*  32:    */   {
/*  33: 49 */     this.ac.a(17, new Integer(0));
/*  34: 50 */     this.ac.a(18, new Integer(1));
/*  35: 51 */     this.ac.a(19, new Float(0.0F));
/*  36:    */   }
/*  37:    */   
/*  38:    */   public AABB j(Entity paramwv)
/*  39:    */   {
/*  40: 56 */     return paramwv.getAABB();
/*  41:    */   }
/*  42:    */   
/*  43:    */   public AABB S()
/*  44:    */   {
/*  45: 61 */     return getAABB();
/*  46:    */   }
/*  47:    */   
/*  48:    */   public boolean ae()
/*  49:    */   {
/*  50: 66 */     return true;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public adu(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  54:    */   {
/*  55: 70 */     this(paramaqu);
/*  56: 71 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  57:    */     
/*  58: 73 */     this.xVelocity = 0.0D;
/*  59: 74 */     this.yVelocity = 0.0D;
/*  60: 75 */     this.zVelocity = 0.0D;
/*  61:    */     
/*  62: 77 */     this.lastX = paramDouble1;
/*  63: 78 */     this.lastY = paramDouble2;
/*  64: 79 */     this.lastZ = paramDouble3;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public double an()
/*  68:    */   {
/*  69: 84 */     return this.K * 0.0D - 0.300000011920929D;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public boolean a(DamageSource paramwh, float paramFloat)
/*  73:    */   {
/*  74: 89 */     if (b(paramwh)) {
/*  75: 90 */       return false;
/*  76:    */     }
/*  77: 92 */     if ((this.world.isClient) || (this.isDead)) {
/*  78: 93 */       return true;
/*  79:    */     }
/*  80: 95 */     if ((this.rider != null) && (this.rider == paramwh.j()) && ((paramwh instanceof wj))) {
/*  81: 96 */       return false;
/*  82:    */     }
/*  83: 98 */     b(-m());
/*  84: 99 */     a(10);
/*  85:100 */     a(j() + paramFloat * 10.0F);
/*  86:101 */     ac();
/*  87:102 */     int j = ((paramwh.j() instanceof EntityPlayer)) && (((EntityPlayer)paramwh.j()).by.d) ? 1 : 0;
/*  88:103 */     if ((j != 0) || (j() > 40.0F))
/*  89:    */     {
/*  90:104 */       if (this.rider != null) {
/*  91:105 */         this.rider.mount(this);
/*  92:    */       }
/*  93:107 */       if (j == 0) {
/*  94:108 */         a(ItemList.aE, 1, 0.0F);
/*  95:    */       }
/*  96:110 */       setDead();
/*  97:    */     }
/*  98:112 */     return true;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void as()
/* 102:    */   {
/* 103:117 */     b(-m());
/* 104:118 */     a(10);
/* 105:119 */     a(j() * 11.0F);
/* 106:    */   }
/* 107:    */   
/* 108:    */   public boolean ad()
/* 109:    */   {
/* 110:124 */     return !this.isDead;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
/* 114:    */   {
/* 115:133 */     if ((paramBoolean) && (this.rider != null))
/* 116:    */     {
/* 117:135 */       this.lastX = (this.xPos = paramDouble1);
/* 118:136 */       this.lastY = (this.yPos = paramDouble2);
/* 119:137 */       this.lastZ = (this.zPos = paramDouble3);
/* 120:138 */       this.yaw = paramFloat1;
/* 121:139 */       this.pitch = paramFloat2;
/* 122:140 */       this.c = 0;
/* 123:141 */       b(paramDouble1, paramDouble2, paramDouble3);
/* 124:    */       
/* 125:143 */       this.xVelocity = (this.i = 0.0D);
/* 126:144 */       this.yVelocity = (this.ap = 0.0D);
/* 127:145 */       this.zVelocity = (this.aq = 0.0D);
/* 128:    */       
/* 129:147 */       return;
/* 130:    */     }
/* 131:148 */     if (this.a)
/* 132:    */     {
/* 133:149 */       this.c = (paramInt + 5);
/* 134:    */     }
/* 135:    */     else
/* 136:    */     {
/* 137:151 */       double d1 = paramDouble1 - this.xPos;
/* 138:152 */       double d2 = paramDouble2 - this.yPos;
/* 139:153 */       double d3 = paramDouble3 - this.zPos;
/* 140:154 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 141:156 */       if (d4 > 1.0D) {
/* 142:157 */         this.c = 3;
/* 143:    */       } else {
/* 144:159 */         return;
/* 145:    */       }
/* 146:    */     }
/* 147:163 */     this.d = paramDouble1;
/* 148:164 */     this.e = paramDouble2;
/* 149:165 */     this.f = paramDouble3;
/* 150:166 */     this.g = paramFloat1;
/* 151:167 */     this.h = paramFloat2;
/* 152:    */     
/* 153:169 */     this.xVelocity = this.i;
/* 154:170 */     this.yVelocity = this.ap;
/* 155:171 */     this.zVelocity = this.aq;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/* 159:    */   {
/* 160:176 */     this.i = (this.xVelocity = paramDouble1);
/* 161:177 */     this.ap = (this.yVelocity = paramDouble2);
/* 162:178 */     this.aq = (this.zVelocity = paramDouble3);
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void onUpdate()
/* 166:    */   {
/* 167:183 */     super.onUpdate();
/* 168:184 */     if (l() > 0) {
/* 169:185 */       a(l() - 1);
/* 170:    */     }
/* 171:187 */     if (j() > 0.0F) {
/* 172:188 */       a(j() - 1.0F);
/* 173:    */     }
/* 174:190 */     this.lastX = this.xPos;
/* 175:191 */     this.lastY = this.yPos;
/* 176:192 */     this.lastZ = this.zPos;
/* 177:    */     
/* 178:194 */     int j = 5;
/* 179:195 */     double d1 = 0.0D;
/* 180:196 */     for (int k = 0; k < j; k++)
/* 181:    */     {
/* 182:197 */       double d3 = getAABB().minY + (getAABB().maxY - getAABB().minY) * (k + 0) / j - 0.125D;
/* 183:198 */       double d6 = getAABB().minY + (getAABB().maxY - getAABB().minY) * (k + 1) / j - 0.125D;
/* 184:199 */       AABB localbrt = new AABB(getAABB().minX, d3, getAABB().minZ, getAABB().maxX, d6, getAABB().maxZ);
/* 185:200 */       if (this.world.b(localbrt, Material.water)) {
/* 186:201 */         d1 += 1.0D / j;
/* 187:    */       }
/* 188:    */     }
/* 189:205 */     double d2 = Math.sqrt(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/* 190:    */     double d4;
/* 191:    */     double d7;
/* 192:207 */     if (d2 > 0.2975D)
/* 193:    */     {
/* 194:208 */       d4 = Math.cos(this.yaw * 3.141592653589793D / 180.0D);
/* 195:209 */       d7 = Math.sin(this.yaw * 3.141592653589793D / 180.0D);
/* 196:211 */       for (int i1 = 0; i1 < 1.0D + d2 * 60.0D; i1++)
/* 197:    */       {
/* 198:212 */         double d11 = this.random.nextFloat() * 2.0F - 1.0F;
/* 199:    */         
/* 200:214 */         double d14 = (this.random.nextInt(2) * 2 - 1) * 0.7D;
/* 201:    */         double d16;
/* 202:    */         double d17;
/* 203:215 */         if (this.random.nextBoolean())
/* 204:    */         {
/* 205:216 */           d16 = this.xPos - d4 * d11 * 0.8D + d7 * d14;
/* 206:217 */           d17 = this.zPos - d7 * d11 * 0.8D - d4 * d14;
/* 207:218 */           this.world.a(ew.f, d16, this.yPos - 0.125D, d17, this.xVelocity, this.yVelocity, this.zVelocity, new int[0]);
/* 208:    */         }
/* 209:    */         else
/* 210:    */         {
/* 211:220 */           d16 = this.xPos + d4 + d7 * d11 * 0.7D;
/* 212:221 */           d17 = this.zPos + d7 - d4 * d11 * 0.7D;
/* 213:222 */           this.world.a(ew.f, d16, this.yPos - 0.125D, d17, this.xVelocity, this.yVelocity, this.zVelocity, new int[0]);
/* 214:    */         }
/* 215:    */       }
/* 216:    */     }
/* 217:227 */     if ((this.world.isClient) && (this.a))
/* 218:    */     {
/* 219:    */       double d9;
/* 220:228 */       if (this.c > 0)
/* 221:    */       {
/* 222:229 */         d4 = this.xPos + (this.d - this.xPos) / this.c;
/* 223:230 */         d7 = this.yPos + (this.e - this.yPos) / this.c;
/* 224:231 */         d9 = this.zPos + (this.f - this.zPos) / this.c;
/* 225:    */         
/* 226:233 */         double d12 = MathUtils.wrapDegrees(this.g - this.yaw);
/* 227:    */         
/* 228:235 */         this.yaw = ((float)(this.yaw + d12 / this.c));
/* 229:236 */         this.pitch = ((float)(this.pitch + (this.h - this.pitch) / this.c));
/* 230:    */         
/* 231:238 */         this.c -= 1;
/* 232:239 */         b(d4, d7, d9);
/* 233:240 */         b(this.yaw, this.pitch);
/* 234:    */       }
/* 235:    */       else
/* 236:    */       {
/* 237:242 */         d4 = this.xPos + this.xVelocity;
/* 238:243 */         d7 = this.yPos + this.yVelocity;
/* 239:244 */         d9 = this.zPos + this.zVelocity;
/* 240:245 */         b(d4, d7, d9);
/* 241:246 */         if (this.C)
/* 242:    */         {
/* 243:247 */           this.xVelocity *= 0.5D;
/* 244:248 */           this.yVelocity *= 0.5D;
/* 245:249 */           this.zVelocity *= 0.5D;
/* 246:    */         }
/* 247:251 */         this.xVelocity *= 0.9900000095367432D;
/* 248:252 */         this.yVelocity *= 0.949999988079071D;
/* 249:253 */         this.zVelocity *= 0.9900000095367432D;
/* 250:    */       }
/* 251:256 */       return;
/* 252:    */     }
/* 253:259 */     if (d1 < 1.0D)
/* 254:    */     {
/* 255:260 */       d4 = d1 * 2.0D - 1.0D;
/* 256:261 */       this.yVelocity += 0.03999999910593033D * d4;
/* 257:    */     }
/* 258:    */     else
/* 259:    */     {
/* 260:263 */       if (this.yVelocity < 0.0D) {
/* 261:264 */         this.yVelocity /= 2.0D;
/* 262:    */       }
/* 263:266 */       this.yVelocity += 0.007000000216066837D;
/* 264:    */     }
/* 265:269 */     if ((this.rider instanceof EntityLiving))
/* 266:    */     {
/* 267:270 */       EntityLiving localxm = (EntityLiving)this.rider;
/* 268:271 */       float f1 = this.rider.yaw + -localxm.aX * 90.0F;
/* 269:272 */       this.xVelocity += -Math.sin(f1 * 3.141593F / 180.0F) * this.b * localxm.aY * 0.0500000007450581D;
/* 270:273 */       this.zVelocity += Math.cos(f1 * 3.141593F / 180.0F) * this.b * localxm.aY * 0.0500000007450581D;
/* 271:    */     }
/* 272:276 */     double d5 = Math.sqrt(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/* 273:278 */     if (d5 > 0.35D)
/* 274:    */     {
/* 275:279 */       d7 = 0.35D / d5;
/* 276:    */       
/* 277:281 */       this.xVelocity *= d7;
/* 278:282 */       this.zVelocity *= d7;
/* 279:283 */       d5 = 0.35D;
/* 280:    */     }
/* 281:286 */     if ((d5 > d2) && (this.b < 0.35D))
/* 282:    */     {
/* 283:287 */       this.b += (0.35D - this.b) / 35.0D;
/* 284:288 */       if (this.b > 0.35D) {
/* 285:289 */         this.b = 0.35D;
/* 286:    */       }
/* 287:    */     }
/* 288:    */     else
/* 289:    */     {
/* 290:292 */       this.b -= (this.b - 0.07000000000000001D) / 35.0D;
/* 291:293 */       if (this.b < 0.07000000000000001D) {
/* 292:294 */         this.b = 0.07000000000000001D;
/* 293:    */       }
/* 294:    */     }
/* 295:298 */     for (int m = 0; m < 4; m++)
/* 296:    */     {
/* 297:299 */       int n = MathUtils.floor(this.xPos + (m % 2 - 0.5D) * 0.8D);
/* 298:300 */       int i2 = MathUtils.floor(this.zPos + (m / 2 - 0.5D) * 0.8D);
/* 299:302 */       for (int i3 = 0; i3 < 2; i3++)
/* 300:    */       {
/* 301:303 */         int i4 = MathUtils.floor(this.yPos) + i3;
/* 302:    */         
/* 303:305 */         BlockPosition localdt = new BlockPosition(n, i4, i2);
/* 304:306 */         ProtoBlock localatr = this.world.getBlock(localdt).getProto();
/* 305:307 */         if (localatr == BlockList.aH)
/* 306:    */         {
/* 307:308 */           this.world.g(localdt);
/* 308:309 */           this.D = false;
/* 309:    */         }
/* 310:310 */         else if (localatr == BlockList.waterLily)
/* 311:    */         {
/* 312:311 */           this.world.b(localdt, true);
/* 313:312 */           this.D = false;
/* 314:    */         }
/* 315:    */       }
/* 316:    */     }
/* 317:317 */     if (this.C)
/* 318:    */     {
/* 319:318 */       this.xVelocity *= 0.5D;
/* 320:319 */       this.yVelocity *= 0.5D;
/* 321:320 */       this.zVelocity *= 0.5D;
/* 322:    */     }
/* 323:322 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/* 324:324 */     if ((this.D) && (d2 > 0.2D))
/* 325:    */     {
/* 326:325 */       if ((!this.world.isClient) && (!this.isDead))
/* 327:    */       {
/* 328:326 */         setDead();
/* 329:327 */         for (int m = 0; m < 3; m++) {
/* 330:328 */           a(Item.fromProtoBlock(BlockList.planks), 1, 0.0F);
/* 331:    */         }
/* 332:330 */         for (int m = 0; m < 2; m++) {
/* 333:331 */           a(ItemList.stick, 1, 0.0F);
/* 334:    */         }
/* 335:    */       }
/* 336:    */     }
/* 337:    */     else
/* 338:    */     {
/* 339:335 */       this.xVelocity *= 0.9900000095367432D;
/* 340:336 */       this.yVelocity *= 0.949999988079071D;
/* 341:337 */       this.zVelocity *= 0.9900000095367432D;
/* 342:    */     }
/* 343:340 */     this.pitch = 0.0F;
/* 344:341 */     double d8 = this.yaw;
/* 345:342 */     double d10 = this.lastX - this.xPos;
/* 346:343 */     double d13 = this.lastZ - this.zPos;
/* 347:344 */     if (d10 * d10 + d13 * d13 > 0.001D) {
/* 348:345 */       d8 = (float)(Math.atan2(d13, d10) * 180.0D / 3.141592653589793D);
/* 349:    */     }
/* 350:348 */     double d15 = MathUtils.wrapDegrees(d8 - this.yaw);
/* 351:350 */     if (d15 > 20.0D) {
/* 352:351 */       d15 = 20.0D;
/* 353:    */     }
/* 354:353 */     if (d15 < -20.0D) {
/* 355:354 */       d15 = -20.0D;
/* 356:    */     }
/* 357:357 */     this.yaw = ((float)(this.yaw + d15));
/* 358:358 */     b(this.yaw, this.pitch);
/* 359:360 */     if (this.world.isClient) {
/* 360:361 */       return;
/* 361:    */     }
/* 362:364 */     List localList = this.world.b(this, getAABB().expand(0.2000000029802322D, 0.0D, 0.2000000029802322D));
/* 363:365 */     if ((localList != null) && (!localList.isEmpty())) {
/* 364:366 */       for (int i5 = 0; i5 < localList.size(); i5++)
/* 365:    */       {
/* 366:367 */         Entity localwv = (Entity)localList.get(i5);
/* 367:368 */         if ((localwv != this.rider) && (localwv.ae()) && ((localwv instanceof adu))) {
/* 368:369 */           localwv.i(this);
/* 369:    */         }
/* 370:    */       }
/* 371:    */     }
/* 372:374 */     if ((this.rider != null) && 
/* 373:375 */       (this.rider.isDead)) {
/* 374:376 */       this.rider = null;
/* 375:    */     }
/* 376:    */   }
/* 377:    */   
/* 378:    */   public void al()
/* 379:    */   {
/* 380:383 */     if (this.rider == null) {
/* 381:384 */       return;
/* 382:    */     }
/* 383:387 */     double d1 = Math.cos(this.yaw * 3.141592653589793D / 180.0D) * 0.4D;
/* 384:388 */     double d2 = Math.sin(this.yaw * 3.141592653589793D / 180.0D) * 0.4D;
/* 385:389 */     this.rider.b(this.xPos + d1, this.yPos + an() + this.rider.am(), this.zPos + d2);
/* 386:    */   }
/* 387:    */   
/* 388:    */   protected void writeEntityToNBT(NBTTagCompound paramfn) {}
/* 389:    */   
/* 390:    */   protected void readEntityFromNBT(NBTTagCompound paramfn) {}
/* 391:    */   
/* 392:    */   public boolean e(EntityPlayer paramahd)
/* 393:    */   {
/* 394:402 */     if ((this.rider != null) && ((this.rider instanceof EntityPlayer)) && (this.rider != paramahd)) {
/* 395:403 */       return true;
/* 396:    */     }
/* 397:405 */     if (!this.world.isClient) {
/* 398:406 */       paramahd.mount(this);
/* 399:    */     }
/* 400:408 */     return true;
/* 401:    */   }
/* 402:    */   
/* 403:    */   protected void a(double paramDouble, boolean paramBoolean, ProtoBlock paramatr, BlockPosition paramdt)
/* 404:    */   {
/* 405:413 */     if (paramBoolean)
/* 406:    */     {
/* 407:414 */       if (this.O > 3.0F)
/* 408:    */       {
/* 409:415 */         e(this.O, 1.0F);
/* 410:416 */         if ((!this.world.isClient) && (!this.isDead))
/* 411:    */         {
/* 412:417 */           setDead();
/* 413:418 */           for (int j = 0; j < 3; j++) {
/* 414:419 */             a(Item.fromProtoBlock(BlockList.planks), 1, 0.0F);
/* 415:    */           }
/* 416:421 */           for (j = 0; j < 2; j++) {
/* 417:422 */             a(ItemList.stick, 1, 0.0F);
/* 418:    */           }
/* 419:    */         }
/* 420:425 */         this.O = 0.0F;
/* 421:    */       }
/* 422:    */     }
/* 423:427 */     else if ((this.world.getBlock(new BlockPosition(this).down()).getProto().getMaterial() != Material.water) && 
/* 424:428 */       (paramDouble < 0.0D)) {
/* 425:429 */       this.O = ((float)(this.O - paramDouble));
/* 426:    */     }
/* 427:    */   }
/* 428:    */   
/* 429:    */   public void a(float paramFloat)
/* 430:    */   {
/* 431:435 */     this.ac.b(19, Float.valueOf(paramFloat));
/* 432:    */   }
/* 433:    */   
/* 434:    */   public float j()
/* 435:    */   {
/* 436:439 */     return this.ac.d(19);
/* 437:    */   }
/* 438:    */   
/* 439:    */   public void a(int paramInt)
/* 440:    */   {
/* 441:443 */     this.ac.b(17, Integer.valueOf(paramInt));
/* 442:    */   }
/* 443:    */   
/* 444:    */   public int l()
/* 445:    */   {
/* 446:447 */     return this.ac.c(17);
/* 447:    */   }
/* 448:    */   
/* 449:    */   public void b(int paramInt)
/* 450:    */   {
/* 451:451 */     this.ac.b(18, Integer.valueOf(paramInt));
/* 452:    */   }
/* 453:    */   
/* 454:    */   public int m()
/* 455:    */   {
/* 456:455 */     return this.ac.c(18);
/* 457:    */   }
/* 458:    */   
/* 459:    */   public void a(boolean paramBoolean)
/* 460:    */   {
/* 461:463 */     this.a = paramBoolean;
/* 462:    */   }
/* 463:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     adu
 * JD-Core Version:    0.7.0.1
 */
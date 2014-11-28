package net.minecraft.src;
/*   1:    */ import java.util.Arrays;
/*   2:    */ import java.util.List;
/*   4:    */ 
/*   5:    */ public class EntityFishHook
/*   6:    */   extends Entity
/*   7:    */ {
/*   8: 36 */   private static final List<adp> junks = Arrays.asList(new adp[] { new adp(new ItemStack(ItemList.leatherBoots), 10).a(0.9F), new adp(new ItemStack(ItemList.leather), 10), new adp(new ItemStack(ItemList.bone), 10), new adp(new ItemStack(ItemList.potion), 10), new adp(new ItemStack(ItemList.string), 5), new adp(new ItemStack(ItemList.fishingRod), 2).a(0.9F), new adp(new ItemStack(ItemList.z), 10), new adp(new ItemStack(ItemList.stick), 5), new adp(new ItemStack(ItemList.dye, 10, EnumDyeColor.BLACK.b()), 1), new adp(new ItemStack(BlockList.bR), 10), new adp(new ItemStack(ItemList.rottenFlesh), 10) });
/*   9: 49 */   private static final List<adp> treasures = Arrays.asList(new adp[] { new adp(new ItemStack(BlockList.waterLily), 1), new adp(new ItemStack(ItemList.nameTag), 1), new adp(new ItemStack(ItemList.saddle), 1), new adp(new ItemStack(ItemList.bow), 1).a(0.25F).a(), new adp(new ItemStack(ItemList.fishingRod), 1).a(0.25F).a(), new adp(new ItemStack(ItemList.book), 1).a() });
/*  10: 57 */   private static final List<adp> fishes = Arrays.asList(new adp[] { new adp(new ItemStack(ItemList.fish, 1, ali.a.a()), 60), new adp(new ItemStack(ItemList.fish, 1, ali.b.a()), 25), new adp(new ItemStack(ItemList.fish, 1, ali.c.a()), 2), new adp(new ItemStack(ItemList.fish, 1, ali.d.a()), 13) });
/*  11:    */   
/*  12:    */   public static List<adp> getFishes()
/*  13:    */   {
/*  14: 66 */     return fishes;
/*  15:    */   }
/*  16:    */   
/*  17: 69 */   private int g = -1;
/*  18: 70 */   private int h = -1;
/*  19: 71 */   private int i = -1;
/*  20:    */   private ProtoBlock ap;
/*  21:    */   private boolean aq;
/*  22:    */   public int a;
/*  23:    */   public EntityPlayer b;
/*  24:    */   private int ar;
/*  25:    */   private int as;
/*  26:    */   private int at;
/*  27:    */   private int au;
/*  28:    */   private int av;
/*  29:    */   private float aw;
/*  30:    */   public Entity c;
/*  31:    */   private int ax;
/*  32:    */   private double ay;
/*  33:    */   private double az;
/*  34:    */   private double aA;
/*  35:    */   private double aB;
/*  36:    */   private double aC;
/*  37:    */   private double aD;
/*  38:    */   private double aE;
/*  39:    */   private double aF;
/*  40:    */   
/*  41:    */   public EntityFishHook(World paramaqu)
/*  42:    */   {
/*  43: 85 */     super(paramaqu);
/*  44: 86 */     a(0.25F, 0.25F);
/*  45: 87 */     this.ah = true;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public EntityFishHook(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, EntityPlayer paramahd)
/*  49:    */   {
/*  50: 91 */     this(paramaqu);
/*  51: 92 */     setPos(paramDouble1, paramDouble2, paramDouble3);
/*  52: 93 */     this.ah = true;
/*  53: 94 */     this.b = paramahd;
/*  54: 95 */     paramahd.bE = this;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public EntityFishHook(World paramaqu, EntityPlayer paramahd)
/*  58:    */   {
/*  59: 99 */     super(paramaqu);
/*  60:100 */     this.ah = true;
/*  61:101 */     this.b = paramahd;
/*  62:102 */     this.b.bE = this;
/*  63:    */     
/*  64:104 */     a(0.25F, 0.25F);
/*  65:    */     
/*  66:106 */     setPositionAndAngles(paramahd.xPos, paramahd.yPos + paramahd.getEyeHeight(), paramahd.zPos, paramahd.yaw, paramahd.pitch);
/*  67:    */     
/*  68:108 */     this.xPos -= MathUtils.cos(this.yaw / 180.0F * 3.141593F) * 0.16F;
/*  69:109 */     this.yPos -= 0.1000000014901161D;
/*  70:110 */     this.zPos -= MathUtils.sin(this.yaw / 180.0F * 3.141593F) * 0.16F;
/*  71:111 */     setPos(this.xPos, this.yPos, this.zPos);
/*  72:    */     
/*  73:113 */     float f1 = 0.4F;
/*  74:114 */     this.xVelocity = (-MathUtils.sin(this.yaw / 180.0F * 3.141593F) * MathUtils.cos(this.pitch / 180.0F * 3.141593F) * f1);
/*  75:115 */     this.zVelocity = (MathUtils.cos(this.yaw / 180.0F * 3.141593F) * MathUtils.cos(this.pitch / 180.0F * 3.141593F) * f1);
/*  76:116 */     this.yVelocity = (-MathUtils.sin(this.pitch / 180.0F * 3.141593F) * f1);
/*  77:    */     
/*  78:118 */     c(this.xVelocity, this.yVelocity, this.zVelocity, 1.5F, 1.0F);
/*  79:    */   }
/*  80:    */   
/*  81:    */   protected void h() {}
/*  82:    */   
/*  83:    */   public boolean a(double paramDouble)
/*  84:    */   {
/*  85:127 */     double d1 = getAABB().a() * 4.0D;
/*  86:128 */     d1 *= 64.0D;
/*  87:129 */     return paramDouble < d1 * d1;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void c(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  91:    */   {
/*  92:133 */     float f1 = MathUtils.sqrt(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*  93:    */     
/*  94:135 */     paramDouble1 /= f1;
/*  95:136 */     paramDouble2 /= f1;
/*  96:137 */     paramDouble3 /= f1;
/*  97:    */     
/*  98:139 */     paramDouble1 += this.rng.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  99:140 */     paramDouble2 += this.rng.nextGaussian() * 0.007499999832361937D * paramFloat2;
/* 100:141 */     paramDouble3 += this.rng.nextGaussian() * 0.007499999832361937D * paramFloat2;
/* 101:    */     
/* 102:143 */     paramDouble1 *= paramFloat1;
/* 103:144 */     paramDouble2 *= paramFloat1;
/* 104:145 */     paramDouble3 *= paramFloat1;
/* 105:    */     
/* 106:147 */     this.xVelocity = paramDouble1;
/* 107:148 */     this.yVelocity = paramDouble2;
/* 108:149 */     this.zVelocity = paramDouble3;
/* 109:    */     
/* 110:151 */     float f2 = MathUtils.sqrt(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/* 111:    */     
/* 112:153 */     this.lastYaw = (this.yaw = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.141592741012573D));
/* 113:154 */     this.lastPitch = (this.pitch = (float)(Math.atan2(paramDouble2, f2) * 180.0D / 3.141592741012573D));
/* 114:155 */     this.ar = 0;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
/* 118:    */   {
/* 119:164 */     this.ay = paramDouble1;
/* 120:165 */     this.az = paramDouble2;
/* 121:166 */     this.aA = paramDouble3;
/* 122:167 */     this.aB = paramFloat1;
/* 123:168 */     this.aC = paramFloat2;
/* 124:    */     
/* 125:170 */     this.ax = paramInt;
/* 126:    */     
/* 127:172 */     this.xVelocity = this.aD;
/* 128:173 */     this.yVelocity = this.aE;
/* 129:174 */     this.zVelocity = this.aF;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/* 133:    */   {
/* 134:179 */     this.aD = (this.xVelocity = paramDouble1);
/* 135:180 */     this.aE = (this.yVelocity = paramDouble2);
/* 136:181 */     this.aF = (this.zVelocity = paramDouble3);
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void onUpdate()
/* 140:    */   {
/* 141:186 */     super.onUpdate();
/* 142:188 */     if (this.ax > 0)
/* 143:    */     {
/* 144:189 */       double d1 = this.xPos + (this.ay - this.xPos) / this.ax;
/* 145:190 */       double d2 = this.yPos + (this.az - this.yPos) / this.ax;
/* 146:191 */       double d3 = this.zPos + (this.aA - this.zPos) / this.ax;
/* 147:    */       
/* 148:193 */       double d5 = MathUtils.wrapDegrees(this.aB - this.yaw);
/* 149:    */       
/* 150:195 */       this.yaw = ((float)(this.yaw + d5 / this.ax));
/* 151:196 */       this.pitch = ((float)(this.pitch + (this.aC - this.pitch) / this.ax));
/* 152:    */       
/* 153:198 */       this.ax -= 1;
/* 154:199 */       setPos(d1, d2, d3);
/* 155:200 */       b(this.yaw, this.pitch);
/* 156:201 */       return;
/* 157:    */     }
/* 158:204 */     if (!this.world.isClient)
/* 159:    */     {
/* 160:205 */       ItemStack localObject1 = this.b.bY();
/* 161:206 */       if ((this.b.isDead) || (!this.b.ai()) || (localObject1 == null) || (((ItemStack)localObject1).getItem() != ItemList.fishingRod) || (h(this.b) > 1024.0D))
/* 162:    */       {
/* 163:207 */         setDead();
/* 164:208 */         this.b.bE = null;
/* 165:209 */         return;
/* 166:    */       }
/* 167:212 */       if (this.c != null) {
/* 168:213 */         if (this.c.isDead)
/* 169:    */         {
/* 170:214 */           this.c = null;
/* 171:    */         }
/* 172:    */         else
/* 173:    */         {
/* 174:216 */           this.xPos = this.c.xPos;
/* 175:217 */           this.yPos = (this.c.getAABB().minY + this.c.height * 0.8D);
/* 176:218 */           this.zPos = this.c.zPos;
/* 177:219 */           return;
/* 178:    */         }
/* 179:    */       }
/* 180:    */     }
/* 181:224 */     if (this.a > 0) {
/* 182:225 */       this.a -= 1;
/* 183:    */     }
/* 184:228 */     if (this.aq)
/* 185:    */     {
/* 186:229 */       if (this.world.getBlock(new BlockPosition(this.g, this.h, this.i)).getProto() == this.ap)
/* 187:    */       {
/* 188:230 */         this.ar += 1;
/* 189:231 */         if (this.ar == 1200) {
/* 190:232 */           setDead();
/* 191:    */         }
/* 192:234 */         return;
/* 193:    */       }
/* 194:236 */       this.aq = false;
/* 195:    */       
/* 196:238 */       this.xVelocity *= this.rng.nextFloat() * 0.2F;
/* 197:239 */       this.yVelocity *= this.rng.nextFloat() * 0.2F;
/* 198:240 */       this.zVelocity *= this.rng.nextFloat() * 0.2F;
/* 199:241 */       this.ar = 0;
/* 200:242 */       this.as = 0;
/* 201:    */     }
/* 202:    */     else
/* 203:    */     {
/* 204:245 */       this.as += 1;
/* 205:    */     }
/* 206:248 */     Object localObject1 = new Vec3(this.xPos, this.yPos, this.zPos);
/* 207:249 */     Vec3 localbrw = new Vec3(this.xPos + this.xVelocity, this.yPos + this.yVelocity, this.zPos + this.zVelocity);
/* 208:250 */     HitResult localbru1 = this.world.a((Vec3)localObject1, localbrw);
/* 209:    */     
/* 210:252 */     localObject1 = new Vec3(this.xPos, this.yPos, this.zPos);
/* 211:253 */     localbrw = new Vec3(this.xPos + this.xVelocity, this.yPos + this.yVelocity, this.zPos + this.zVelocity);
/* 212:254 */     if (localbru1 != null) {
/* 213:255 */       localbrw = new Vec3(localbru1.c.x, localbru1.c.y, localbru1.c.z);
/* 214:    */     }
/* 215:257 */     Entity localObject2 = null;
/* 216:258 */     List localList = this.world.b(this, getAABB().addCoord(this.xVelocity, this.yVelocity, this.zVelocity).expand(1.0D, 1.0D, 1.0D));
/* 217:259 */     double d4 = 0.0D;
/* 218:260 */     for (int j = 0; j < localList.size(); j++)
/* 219:    */     {
/* 220:261 */       Entity localwv = (Entity)localList.get(j);
/* 221:262 */       if ((localwv.ad()) && ((localwv != this.b) || (this.as >= 5)))
/* 222:    */       {
/* 223:266 */         float f3 = 0.3F;
/* 224:267 */         AABB localbrt1 = localwv.getAABB().expand(f3, f3, f3);
/* 225:268 */         HitResult localbru2 = localbrt1.a((Vec3)localObject1, localbrw);
/* 226:269 */         if (localbru2 != null)
/* 227:    */         {
/* 228:270 */           double d7 = ((Vec3)localObject1).dist(localbru2.c);
/* 229:271 */           if ((d7 < d4) || (d4 == 0.0D))
/* 230:    */           {
/* 231:272 */             localObject2 = localwv;
/* 232:273 */             d4 = d7;
/* 233:    */           }
/* 234:    */         }
/* 235:    */       }
/* 236:    */     }
/* 237:278 */     if (localObject2 != null) {
/* 238:279 */       localbru1 = new HitResult(localObject2);
/* 239:    */     }
/* 240:282 */     if (localbru1 != null) {
/* 241:283 */       if (localbru1.d != null)
/* 242:    */       {
/* 243:284 */         if (localbru1.d.a(DamageSource.a(this, this.b), 0.0F)) {
/* 244:285 */           this.c = localbru1.d;
/* 245:    */         }
/* 246:    */       }
/* 247:    */       else {
/* 248:288 */         this.aq = true;
/* 249:    */       }
/* 250:    */     }
/* 251:292 */     if (this.aq) {
/* 252:293 */       return;
/* 253:    */     }
/* 254:296 */     move(this.xVelocity, this.yVelocity, this.zVelocity);
/* 255:    */     
/* 256:298 */     float f1 = MathUtils.sqrt(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/* 257:299 */     this.yaw = ((float)(Math.atan2(this.xVelocity, this.zVelocity) * 180.0D / 3.141592741012573D));
/* 258:300 */     this.pitch = ((float)(Math.atan2(this.yVelocity, f1) * 180.0D / 3.141592741012573D));
/* 259:302 */     while (this.pitch - this.lastPitch < -180.0F) {
/* 260:303 */       this.lastPitch -= 360.0F;
/* 261:    */     }
/* 262:305 */     while (this.pitch - this.lastPitch >= 180.0F) {
/* 263:306 */       this.lastPitch += 360.0F;
/* 264:    */     }
/* 265:309 */     while (this.yaw - this.lastYaw < -180.0F) {
/* 266:310 */       this.lastYaw -= 360.0F;
/* 267:    */     }
/* 268:312 */     while (this.yaw - this.lastYaw >= 180.0F) {
/* 269:313 */       this.lastYaw += 360.0F;
/* 270:    */     }
/* 271:316 */     this.pitch = (this.lastPitch + (this.pitch - this.lastPitch) * 0.2F);
/* 272:317 */     this.yaw = (this.lastYaw + (this.yaw - this.lastYaw) * 0.2F);
/* 273:    */     
/* 274:319 */     float f2 = 0.92F;
/* 275:321 */     if ((this.C) || (this.D)) {
/* 276:322 */       f2 = 0.5F;
/* 277:    */     }
/* 278:325 */     int k = 5;
/* 279:326 */     double d6 = 0.0D;
/* 280:    */     double d11;
/* 281:327 */     for (int m = 0; m < k; m++)
/* 282:    */     {
/* 283:328 */       AABB localbrt2 = getAABB();
/* 284:329 */       double d9 = localbrt2.maxY - localbrt2.minY;
/* 285:330 */       double d10 = localbrt2.minY + d9 * m / k;
/* 286:331 */       d11 = localbrt2.minY + d9 * (m + 1) / k;
/* 287:332 */       AABB localbrt3 = new AABB(localbrt2.minX, d10, localbrt2.minZ, localbrt2.maxX, d11, localbrt2.maxZ);
/* 288:333 */       if (this.world.b(localbrt3, Material.water)) {
/* 289:334 */         d6 += 1.0D / k;
/* 290:    */       }
/* 291:    */     }
/* 292:338 */     if ((!this.world.isClient) && (d6 > 0.0D))
/* 293:    */     {
/* 294:339 */       WorldServer localqt = (WorldServer)this.world;
/* 295:    */       
/* 296:341 */       int n = 1;
/* 297:342 */       BlockPosition localdt = new BlockPosition(this).up();
/* 298:343 */       if ((this.rng.nextFloat() < 0.25F) && (this.world.C(localdt))) {
/* 299:344 */         n = 2;
/* 300:    */       }
/* 301:346 */       if ((this.rng.nextFloat() < 0.5F) && (!this.world.hasDaylight(localdt))) {
/* 302:347 */         n--;
/* 303:    */       }
/* 304:350 */       if (this.at > 0)
/* 305:    */       {
/* 306:351 */         this.at -= 1;
/* 307:353 */         if (this.at <= 0)
/* 308:    */         {
/* 309:354 */           this.au = 0;
/* 310:355 */           this.av = 0;
/* 311:    */         }
/* 312:    */       }
/* 313:    */       else
/* 314:    */       {
/* 315:    */         float f4;
/* 316:    */         float f5;
/* 317:    */         float f6;
/* 318:    */         double d12;
/* 319:    */         double d13;
/* 320:357 */         if (this.av > 0)
/* 321:    */         {
/* 322:358 */           this.av -= n;
/* 323:360 */           if (this.av <= 0)
/* 324:    */           {
/* 325:361 */             this.yVelocity -= 0.2000000029802322D;
/* 326:362 */             a("random.splash", 0.25F, 1.0F + (this.rng.nextFloat() - this.rng.nextFloat()) * 0.4F);
/* 327:363 */             f4 = MathUtils.floor(getAABB().minY);
/* 328:364 */             localqt.a(EnumParticleEffect.e, this.xPos, f4 + 1.0F, this.zPos, (int)(1.0F + this.width * 20.0F), this.width, 0.0D, this.width, 0.2000000029802322D, new int[0]);
/* 329:365 */             localqt.a(EnumParticleEffect.g, this.xPos, f4 + 1.0F, this.zPos, (int)(1.0F + this.width * 20.0F), this.width, 0.0D, this.width, 0.2000000029802322D, new int[0]);
/* 330:    */             
/* 331:367 */             this.at = MathUtils.nextInt(this.rng, 10, 30);
/* 332:    */           }
/* 333:    */           else
/* 334:    */           {
/* 335:369 */             this.aw = ((float)(this.aw + this.rng.nextGaussian() * 4.0D));
/* 336:    */             
/* 337:371 */             f4 = this.aw * 0.01745329F;
/* 338:372 */             f5 = MathUtils.sin(f4);
/* 339:373 */             f6 = MathUtils.cos(f4);
/* 340:374 */             d11 = this.xPos + f5 * this.av * 0.1F;
/* 341:375 */             d12 = MathUtils.floor(getAABB().minY) + 1.0F;
/* 342:376 */             d13 = this.zPos + f6 * this.av * 0.1F;
/* 343:378 */             if (this.rng.nextFloat() < 0.15F) {
/* 344:379 */               localqt.a(EnumParticleEffect.e, d11, d12 - 0.1000000014901161D, d13, 1, f5, 0.1D, f6, 0.0D, new int[0]);
/* 345:    */             }
/* 346:382 */             float f7 = f5 * 0.04F;
/* 347:383 */             float f8 = f6 * 0.04F;
/* 348:    */             
/* 349:385 */             localqt.a(EnumParticleEffect.g, d11, d12, d13, 0, f8, 0.01D, -f7, 1.0D, new int[0]);
/* 350:386 */             localqt.a(EnumParticleEffect.g, d11, d12, d13, 0, -f8, 0.01D, f7, 1.0D, new int[0]);
/* 351:    */           }
/* 352:    */         }
/* 353:388 */         else if (this.au > 0)
/* 354:    */         {
/* 355:389 */           this.au -= n;
/* 356:    */           
/* 357:391 */           f4 = 0.15F;
/* 358:393 */           if (this.au < 20) {
/* 359:394 */             f4 = (float)(f4 + (20 - this.au) * 0.05D);
/* 360:395 */           } else if (this.au < 40) {
/* 361:396 */             f4 = (float)(f4 + (40 - this.au) * 0.02D);
/* 362:397 */           } else if (this.au < 60) {
/* 363:398 */             f4 = (float)(f4 + (60 - this.au) * 0.01D);
/* 364:    */           }
/* 365:401 */           if (this.rng.nextFloat() < f4)
/* 366:    */           {
/* 367:402 */             f5 = MathUtils.nextFloat(this.rng, 0.0F, 360.0F) * 0.01745329F;
/* 368:403 */             f6 = MathUtils.nextFloat(this.rng, 25.0F, 60.0F);
/* 369:404 */             d11 = this.xPos + MathUtils.sin(f5) * f6 * 0.1F;
/* 370:405 */             d12 = MathUtils.floor(getAABB().minY) + 1.0F;
/* 371:406 */             d13 = this.zPos + MathUtils.cos(f5) * f6 * 0.1F;
/* 372:    */             
/* 373:408 */             localqt.a(EnumParticleEffect.f, d11, d12, d13, 2 + this.rng.nextInt(2), 0.1000000014901161D, 0.0D, 0.1000000014901161D, 0.0D, new int[0]);
/* 374:    */           }
/* 375:411 */           if (this.au <= 0)
/* 376:    */           {
/* 377:412 */             this.aw = MathUtils.nextFloat(this.rng, 0.0F, 360.0F);
/* 378:413 */             this.av = MathUtils.nextInt(this.rng, 20, 80);
/* 379:    */           }
/* 380:    */         }
/* 381:    */         else
/* 382:    */         {
/* 383:416 */           this.au = MathUtils.nextInt(this.rng, 100, 900);
/* 384:417 */           this.au -= aph.lureLevel(this.b) * 20 * 5;
/* 385:    */         }
/* 386:    */       }
/* 387:420 */       if (this.at > 0) {
/* 388:421 */         this.yVelocity -= this.rng.nextFloat() * this.rng.nextFloat() * this.rng.nextFloat() * 0.2D;
/* 389:    */       }
/* 390:    */     }
/* 391:425 */     double d8 = d6 * 2.0D - 1.0D;
/* 392:426 */     this.yVelocity += 0.03999999910593033D * d8;
/* 393:427 */     if (d6 > 0.0D)
/* 394:    */     {
/* 395:428 */       f2 = (float)(f2 * 0.9D);
/* 396:429 */       this.yVelocity *= 0.8D;
/* 397:    */     }
/* 398:432 */     this.xVelocity *= f2;
/* 399:433 */     this.yVelocity *= f2;
/* 400:434 */     this.zVelocity *= f2;
/* 401:    */     
/* 402:436 */     setPos(this.xPos, this.yPos, this.zPos);
/* 403:    */   }
/* 404:    */   
/* 405:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 406:    */   {
/* 407:441 */     paramfn.setShort("xTile", (short)this.g);
/* 408:442 */     paramfn.setShort("yTile", (short)this.h);
/* 409:443 */     paramfn.setShort("zTile", (short)this.i);
/* 410:444 */     oa localoa = (oa)ProtoBlock.c.c(this.ap);
/* 411:445 */     paramfn.setString("inTile", localoa == null ? "" : localoa.toString());
/* 412:446 */     paramfn.setByte("shake", (byte)this.a);
/* 413:447 */     paramfn.setByte("inGround", (byte)(this.aq ? 1 : 0));
/* 414:    */   }
/* 415:    */   
/* 416:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 417:    */   {
/* 418:452 */     this.g = paramfn.e("xTile");
/* 419:453 */     this.h = paramfn.e("yTile");
/* 420:454 */     this.i = paramfn.e("zTile");
/* 421:455 */     if (paramfn.hasKey("inTile", 8)) {
/* 422:456 */       this.ap = ProtoBlock.b(paramfn.getString("inTile"));
/* 423:    */     } else {
/* 424:458 */       this.ap = ProtoBlock.c(paramfn.d("inTile") & 0xFF);
/* 425:    */     }
/* 426:460 */     this.a = (paramfn.d("shake") & 0xFF);
/* 427:461 */     this.aq = (paramfn.d("inGround") == 1);
/* 428:    */   }
/* 429:    */   
/* 430:    */   public int l()
/* 431:    */   {
/* 432:465 */     if (this.world.isClient) {
/* 433:466 */       return 0;
/* 434:    */     }
/* 435:469 */     int j = 0;
/* 436:470 */     if (this.c != null)
/* 437:    */     {
/* 438:471 */       double d1 = this.b.xPos - this.xPos;
/* 439:472 */       double d3 = this.b.yPos - this.yPos;
/* 440:473 */       double d5 = this.b.zPos - this.zPos;
/* 441:    */       
/* 442:475 */       double d7 = MathUtils.sqrt(d1 * d1 + d3 * d3 + d5 * d5);
/* 443:476 */       double d9 = 0.1D;
/* 444:477 */       this.c.xVelocity += d1 * d9;
/* 445:478 */       this.c.yVelocity += d3 * d9 + MathUtils.sqrt(d7) * 0.08D;
/* 446:479 */       this.c.zVelocity += d5 * d9;
/* 447:480 */       j = 3;
/* 448:    */     }
/* 449:481 */     else if (this.at > 0)
/* 450:    */     {
/* 451:482 */       EntityItem localadw = new EntityItem(this.world, this.xPos, this.yPos, this.zPos, getHookedItem());
/* 452:483 */       double d2 = this.b.xPos - this.xPos;
/* 453:484 */       double d4 = this.b.yPos - this.yPos;
/* 454:485 */       double d6 = this.b.zPos - this.zPos;
/* 455:    */       
/* 456:487 */       double d8 = MathUtils.sqrt(d2 * d2 + d4 * d4 + d6 * d6);
/* 457:488 */       double d10 = 0.1D;
/* 458:489 */       localadw.xVelocity = (d2 * d10);
/* 459:490 */       localadw.yVelocity = (d4 * d10 + MathUtils.sqrt(d8) * 0.08D);
/* 460:491 */       localadw.zVelocity = (d6 * d10);
/* 461:492 */       this.world.spawnEntity(localadw);
/* 462:493 */       this.b.world.spawnEntity(new EntityExperienceOrb(this.b.world, this.b.xPos, this.b.yPos + 0.5D, this.b.zPos + 0.5D, this.rng.nextInt(6) + 1));
/* 463:494 */       j = 1;
/* 464:    */     }
/* 465:496 */     if (this.aq) {
/* 466:497 */       j = 2;
/* 467:    */     }
/* 468:500 */     setDead();
/* 469:501 */     this.b.bE = null;
/* 470:502 */     return j;
/* 471:    */   }
/* 472:    */   
/* 473:    */   private ItemStack getHookedItem()
/* 474:    */   {
/* 475:506 */     float f1 = this.world.rng.nextFloat();
/* 476:507 */     int j = aph.luckOfTheSeaLevel(this.b);
/* 477:508 */     int k = aph.lureLevel(this.b);
/* 478:509 */     float probJunk = 0.1F - j * 0.025F - k * 0.01F;
/* 479:510 */     float probTreasure = 0.05F + j * 0.01F - k * 0.01F;
/* 480:    */     
/* 481:512 */     probJunk = MathUtils.clamp(probJunk, 0.0F, 1.0F);
/* 482:513 */     probTreasure = MathUtils.clamp(probTreasure, 0.0F, 1.0F);
/* 483:515 */     if (f1 < probJunk)
/* 484:    */     {
/* 485:516 */       this.b.increaseStat(StatList.junkFished);
/* 486:517 */       return ((adp)WeightedRandom.getRandomItem(this.rng, junks)).a(this.rng);
/* 487:    */     }
/* 488:519 */     f1 -= probJunk;
/* 489:521 */     if (f1 < probTreasure)
/* 490:    */     {
/* 491:522 */       this.b.increaseStat(StatList.treasureFished);
/* 492:523 */       return ((adp)WeightedRandom.getRandomItem(this.rng, treasures)).a(this.rng);
/* 493:    */     }
/* 494:525 */     f1 -= probTreasure;
/* 495:    */     
/* 496:527 */     this.b.increaseStat(StatList.fishCaught);
/* 497:528 */     return ((adp)WeightedRandom.getRandomItem(this.rng, fishes)).a(this.rng);
/* 498:    */   }
/* 499:    */   
/* 500:    */   public void setDead()
/* 501:    */   {
/* 502:533 */     super.setDead();
/* 503:534 */     if (this.b != null) {
/* 504:535 */       this.b.bE = null;
/* 505:    */     }
/* 506:    */   }
/* 507:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ado
 * JD-Core Version:    0.7.0.1
 */
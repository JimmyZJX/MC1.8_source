package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class EntityArrow
/*   5:    */   extends Entity
/*   6:    */   implements aho
/*   7:    */ {
/*   8: 41 */   private int d = -1;
/*   9: 42 */   private int e = -1;
/*  10: 43 */   private int f = -1;
/*  11:    */   private BlockType g;
/*  12:    */   private int h;
/*  13:    */   private boolean i;
/*  14:    */   public int a;
/*  15:    */   public int b;
/*  16:    */   public Entity c;
/*  17:    */   private int ap;
/*  18:    */   private int aq;
/*  19: 52 */   private double ar = 2.0D;
/*  20:    */   private int as;
/*  21:    */   
/*  22:    */   public EntityArrow(World paramaqu)
/*  23:    */   {
/*  24: 57 */     super(paramaqu);
/*  25: 58 */     this.j = 10.0D;
/*  26: 59 */     a(0.5F, 0.5F);
/*  27:    */   }
/*  28:    */   
/*  29:    */   public EntityArrow(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  30:    */   {
/*  31: 63 */     super(paramaqu);
/*  32: 64 */     this.j = 10.0D;
/*  33:    */     
/*  34: 66 */     a(0.5F, 0.5F);
/*  35:    */     
/*  36: 68 */     setPos(paramDouble1, paramDouble2, paramDouble3);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public EntityArrow(World paramaqu, EntityLiving paramxm1, EntityLiving paramxm2, float paramFloat1, float paramFloat2)
/*  40:    */   {
/*  41: 72 */     super(paramaqu);
/*  42: 73 */     this.j = 10.0D;
/*  43: 74 */     this.c = paramxm1;
/*  44: 75 */     if ((paramxm1 instanceof EntityPlayer)) {
/*  45: 76 */       this.a = 1;
/*  46:    */     }
/*  47: 79 */     this.yPos = (paramxm1.yPos + paramxm1.getEyeHeight() - 0.1000000014901161D);
/*  48:    */     
/*  49: 81 */     double d1 = paramxm2.xPos - paramxm1.xPos;
/*  50: 82 */     double d2 = paramxm2.getAABB().minY + paramxm2.height / 3.0F - this.yPos;
/*  51: 83 */     double d3 = paramxm2.zPos - paramxm1.zPos;
/*  52: 84 */     double d4 = MathUtils.sqrt(d1 * d1 + d3 * d3);
/*  53: 85 */     if (d4 < 1.0E-007D) {
/*  54: 86 */       return;
/*  55:    */     }
/*  56: 89 */     float f1 = (float)(Math.atan2(d3, d1) * 180.0D / 3.141592741012573D) - 90.0F;
/*  57: 90 */     float f2 = (float)-(Math.atan2(d2, d4) * 180.0D / 3.141592741012573D);
/*  58:    */     
/*  59: 92 */     double d5 = d1 / d4;
/*  60: 93 */     double d6 = d3 / d4;
/*  61: 94 */     setPositionAndAngles(paramxm1.xPos + d5, this.yPos, paramxm1.zPos + d6, f1, f2);
/*  62:    */     
/*  63: 96 */     float f3 = (float)(d4 * 0.2000000029802322D);
/*  64: 97 */     c(d1, d2 + f3, d3, paramFloat1, paramFloat2);
/*  65:    */   }
/*  66:    */   
/*  67:    */   public EntityArrow(World paramaqu, EntityLiving paramxm, float paramFloat)
/*  68:    */   {
/*  69:101 */     super(paramaqu);
/*  70:102 */     this.j = 10.0D;
/*  71:103 */     this.c = paramxm;
/*  72:104 */     if ((paramxm instanceof EntityPlayer)) {
/*  73:105 */       this.a = 1;
/*  74:    */     }
/*  75:108 */     a(0.5F, 0.5F);
/*  76:    */     
/*  77:110 */     setPositionAndAngles(paramxm.xPos, paramxm.yPos + paramxm.getEyeHeight(), paramxm.zPos, paramxm.yaw, paramxm.pitch);
/*  78:    */     
/*  79:112 */     this.xPos -= MathUtils.cos(this.yaw / 180.0F * 3.141593F) * 0.16F;
/*  80:113 */     this.yPos -= 0.1000000014901161D;
/*  81:114 */     this.zPos -= MathUtils.sin(this.yaw / 180.0F * 3.141593F) * 0.16F;
/*  82:115 */     setPos(this.xPos, this.yPos, this.zPos);
/*  83:    */     
/*  84:117 */     this.xVelocity = (-MathUtils.sin(this.yaw / 180.0F * 3.141593F) * MathUtils.cos(this.pitch / 180.0F * 3.141593F));
/*  85:118 */     this.zVelocity = (MathUtils.cos(this.yaw / 180.0F * 3.141593F) * MathUtils.cos(this.pitch / 180.0F * 3.141593F));
/*  86:119 */     this.yVelocity = (-MathUtils.sin(this.pitch / 180.0F * 3.141593F));
/*  87:    */     
/*  88:121 */     c(this.xVelocity, this.yVelocity, this.zVelocity, paramFloat * 1.5F, 1.0F);
/*  89:    */   }
/*  90:    */   
/*  91:    */   protected void h()
/*  92:    */   {
/*  93:126 */     this.data.addData(16, Byte.valueOf((byte)0));
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void c(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  97:    */   {
/*  98:131 */     float f1 = MathUtils.sqrt(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*  99:    */     
/* 100:133 */     paramDouble1 /= f1;
/* 101:134 */     paramDouble2 /= f1;
/* 102:135 */     paramDouble3 /= f1;
/* 103:    */     
/* 104:137 */     paramDouble1 += this.rng.nextGaussian() * (this.rng.nextBoolean() ? -1 : 1) * 0.007499999832361937D * paramFloat2;
/* 105:138 */     paramDouble2 += this.rng.nextGaussian() * (this.rng.nextBoolean() ? -1 : 1) * 0.007499999832361937D * paramFloat2;
/* 106:139 */     paramDouble3 += this.rng.nextGaussian() * (this.rng.nextBoolean() ? -1 : 1) * 0.007499999832361937D * paramFloat2;
/* 107:    */     
/* 108:141 */     paramDouble1 *= paramFloat1;
/* 109:142 */     paramDouble2 *= paramFloat1;
/* 110:143 */     paramDouble3 *= paramFloat1;
/* 111:    */     
/* 112:145 */     this.xVelocity = paramDouble1;
/* 113:146 */     this.yVelocity = paramDouble2;
/* 114:147 */     this.zVelocity = paramDouble3;
/* 115:    */     
/* 116:149 */     float f2 = MathUtils.sqrt(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/* 117:    */     
/* 118:151 */     this.lastYaw = (this.yaw = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.141592741012573D));
/* 119:152 */     this.lastPitch = (this.pitch = (float)(Math.atan2(paramDouble2, f2) * 180.0D / 3.141592741012573D));
/* 120:153 */     this.ap = 0;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
/* 124:    */   {
/* 125:158 */     setPos(paramDouble1, paramDouble2, paramDouble3);
/* 126:159 */     b(paramFloat1, paramFloat2);
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/* 130:    */   {
/* 131:164 */     this.xVelocity = paramDouble1;
/* 132:165 */     this.yVelocity = paramDouble2;
/* 133:166 */     this.zVelocity = paramDouble3;
/* 134:167 */     if ((this.lastPitch == 0.0F) && (this.lastYaw == 0.0F))
/* 135:    */     {
/* 136:168 */       float f1 = MathUtils.sqrt(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/* 137:169 */       this.lastYaw = (this.yaw = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.141592741012573D));
/* 138:170 */       this.lastPitch = (this.pitch = (float)(Math.atan2(paramDouble2, f1) * 180.0D / 3.141592741012573D));
/* 139:171 */       this.lastPitch = this.pitch;
/* 140:172 */       this.lastYaw = this.yaw;
/* 141:173 */       setPositionAndAngles(this.xPos, this.yPos, this.zPos, this.yaw, this.pitch);
/* 142:174 */       this.ap = 0;
/* 143:    */     }
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void onUpdate()
/* 147:    */   {
/* 148:180 */     super.onUpdate();
/* 149:182 */     if ((this.lastPitch == 0.0F) && (this.lastYaw == 0.0F))
/* 150:    */     {
/* 151:183 */       float f1 = MathUtils.sqrt(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/* 152:184 */       this.lastYaw = (this.yaw = (float)(Math.atan2(this.xVelocity, this.zVelocity) * 180.0D / 3.141592741012573D));
/* 153:185 */       this.lastPitch = (this.pitch = (float)(Math.atan2(this.yVelocity, f1) * 180.0D / 3.141592741012573D));
/* 154:    */     }
/* 155:188 */     BlockPosition localdt1 = new BlockPosition(this.d, this.e, this.f);
/* 156:189 */     Block localbec = this.world.getBlock(localdt1);
/* 157:190 */     BlockType localatr = localbec.getType();
/* 158:191 */     if (localatr.getMaterial() != Material.air)
/* 159:    */     {
/* 160:192 */       localatr.a(this.world, localdt1);
/* 161:193 */       AABB localbrt = localatr.a(this.world, localdt1, localbec);
/* 162:194 */       if ((localbrt != null) && (localbrt.a(new Vec3(this.xPos, this.yPos, this.zPos)))) {
/* 163:195 */         this.i = true;
/* 164:    */       }
/* 165:    */     }
/* 166:199 */     if (this.b > 0) {
/* 167:200 */       this.b -= 1;
/* 168:    */     }
/* 169:203 */     if (this.i)
/* 170:    */     {
/* 171:204 */       int j = localatr.c(localbec);
/* 172:205 */       if ((localatr != this.g) || (j != this.h))
/* 173:    */       {
/* 174:206 */         this.i = false;
/* 175:    */         
/* 176:208 */         this.xVelocity *= this.rng.nextFloat() * 0.2F;
/* 177:209 */         this.yVelocity *= this.rng.nextFloat() * 0.2F;
/* 178:210 */         this.zVelocity *= this.rng.nextFloat() * 0.2F;
/* 179:211 */         this.ap = 0;
/* 180:212 */         this.aq = 0;
/* 181:213 */         return;
/* 182:    */       }
/* 183:215 */       this.ap += 1;
/* 184:216 */       if (this.ap >= 1200) {
/* 185:217 */         setDead();
/* 186:    */       }
/* 187:219 */       return;
/* 188:    */     }
/* 189:222 */     this.aq += 1;
/* 190:    */     
/* 191:    */ 
/* 192:225 */     Vec3 localbrw1 = new Vec3(this.xPos, this.yPos, this.zPos);
/* 193:226 */     Vec3 localbrw2 = new Vec3(this.xPos + this.xVelocity, this.yPos + this.yVelocity, this.zPos + this.zVelocity);
/* 194:227 */     HitResult localbru1 = this.world.a(localbrw1, localbrw2, false, true, false);
/* 195:    */     
/* 196:229 */     localbrw1 = new Vec3(this.xPos, this.yPos, this.zPos);
/* 197:230 */     localbrw2 = new Vec3(this.xPos + this.xVelocity, this.yPos + this.yVelocity, this.zPos + this.zVelocity);
/* 198:231 */     if (localbru1 != null) {
/* 199:232 */       localbrw2 = new Vec3(localbru1.c.x, localbru1.c.y, localbru1.c.z);
/* 200:    */     }
/* 201:234 */     Entity localObject1 = null;
/* 202:235 */     List<Entity> localList = this.world.b(this, getAABB().addCoord(this.xVelocity, this.yVelocity, this.zVelocity).expand(1.0D, 1.0D, 1.0D));
/* 203:236 */     double d1 = 0.0D;
/* 204:    */     Object localObject2;
/* 205:237 */     for (int k = 0; k < localList.size(); k++)
/* 206:    */     {
/* 207:238 */       Entity localwv = (Entity)localList.get(k);
/* 208:239 */       if ((localwv.ad()) && ((localwv != this.c) || (this.aq >= 5)))
/* 209:    */       {
/* 210:243 */         float f5 = 0.3F;
/* 211:244 */         localObject2 = localwv.getAABB().expand(f5, f5, f5);
/* 212:245 */         HitResult localbru2 = ((AABB)localObject2).a(localbrw1, localbrw2);
/* 213:246 */         if (localbru2 != null)
/* 214:    */         {
/* 215:247 */           double d2 = localbrw1.dist(localbru2.c);
/* 216:248 */           if ((d2 < d1) || (d1 == 0.0D))
/* 217:    */           {
/* 218:249 */             localObject1 = localwv;
/* 219:250 */             d1 = d2;
/* 220:    */           }
/* 221:    */         }
/* 222:    */       }
/* 223:    */     }
/* 224:255 */     if (localObject1 != null) {
/* 225:256 */       localbru1 = new HitResult(localObject1);
/* 226:    */     }
/* 227:259 */     if ((localbru1 != null) && (localbru1.d != null) && ((localbru1.d instanceof EntityPlayer)))
/* 228:    */     {
/* 229:260 */       EntityPlayer localahd = (EntityPlayer)localbru1.d;
/* 230:261 */       if ((localahd.abilities.invulnerable) || (((this.c instanceof EntityPlayer)) && (!((EntityPlayer)this.c).a(localahd)))) {
/* 231:262 */         localbru1 = null;
/* 232:    */       }
/* 233:    */     }
/* 234:    */     float f7;
/* 235:266 */     if (localbru1 != null) {
/* 236:267 */       if (localbru1.d != null)
/* 237:    */       {
/* 238:268 */         float f2 = MathUtils.sqrt(this.xVelocity * this.xVelocity + this.yVelocity * this.yVelocity + this.zVelocity * this.zVelocity);
/* 239:269 */         int n = MathUtils.ceil(f2 * this.ar);
/* 240:271 */         if (l()) {
/* 241:272 */           n += this.rng.nextInt(n / 2 + 2);
/* 242:    */         }
/* 243:    */         DamageSource localwh;
/* 244:276 */         if (this.c == null) {
/* 245:277 */           localwh = DamageSource.fromArrow(this, this);
/* 246:    */         } else {
/* 247:279 */           localwh = DamageSource.fromArrow(this, this.c);
/* 248:    */         }
/* 249:284 */         if ((au()) && (!(localbru1.d instanceof EntityEnderman))) {
/* 250:285 */           localbru1.d.e(5);
/* 251:    */         }
/* 252:287 */         if (localbru1.d.receiveDamage(localwh, n))
/* 253:    */         {
/* 254:288 */           if ((localbru1.d instanceof EntityLiving))
/* 255:    */           {
/* 256:289 */             localObject2 = (EntityLiving)localbru1.d;
/* 257:291 */             if (!this.world.isClient) {
/* 258:292 */               ((EntityLiving)localObject2).o(((EntityLiving)localObject2).bu() + 1);
/* 259:    */             }
/* 260:295 */             if (this.as > 0)
/* 261:    */             {
/* 262:296 */               f7 = MathUtils.sqrt(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/* 263:297 */               if (f7 > 0.0F) {
/* 264:298 */                 localbru1.d.g(this.xVelocity * this.as * 0.6000000238418579D / f7, 0.1D, this.zVelocity * this.as * 0.6000000238418579D / f7);
/* 265:    */               }
/* 266:    */             }
/* 267:302 */             if ((this.c instanceof EntityLiving))
/* 268:    */             {
/* 269:303 */               aph.a((EntityLiving)localObject2, this.c);
/* 270:304 */               aph.b((EntityLiving)this.c, (Entity)localObject2);
/* 271:    */             }
/* 272:307 */             if ((this.c != null) && (localbru1.d != this.c) && ((localbru1.d instanceof EntityPlayer)) && ((this.c instanceof qw))) {
/* 273:308 */               ((qw)this.c).a.a(new jo(6, 0.0F));
/* 274:    */             }
/* 275:    */           }
/* 276:311 */           a("random.bowhit", 1.0F, 1.2F / (this.rng.nextFloat() * 0.2F + 0.9F));
/* 277:312 */           if (!(localbru1.d instanceof EntityEnderman)) {
/* 278:313 */             setDead();
/* 279:    */           }
/* 280:    */         }
/* 281:    */         else
/* 282:    */         {
/* 283:316 */           this.xVelocity *= -0.1000000014901161D;
/* 284:317 */           this.yVelocity *= -0.1000000014901161D;
/* 285:318 */           this.zVelocity *= -0.1000000014901161D;
/* 286:319 */           this.yaw += 180.0F;
/* 287:320 */           this.lastYaw += 180.0F;
/* 288:321 */           this.aq = 0;
/* 289:    */         }
/* 290:    */       }
/* 291:    */       else
/* 292:    */       {
/* 293:324 */         BlockPosition localdt2 = localbru1.a();
/* 294:325 */         this.d = localdt2.getX();
/* 295:326 */         this.e = localdt2.getY();
/* 296:327 */         this.f = localdt2.getZ();
/* 297:328 */         localbec = this.world.getBlock(localdt2);
/* 298:329 */         this.g = localbec.getType();
/* 299:330 */         this.h = this.g.c(localbec);
/* 300:331 */         this.xVelocity = ((float)(localbru1.c.x - this.xPos));
/* 301:332 */         this.yVelocity = ((float)(localbru1.c.y - this.yPos));
/* 302:333 */         this.zVelocity = ((float)(localbru1.c.z - this.zPos));
/* 303:334 */         float f4 = MathUtils.sqrt(this.xVelocity * this.xVelocity + this.yVelocity * this.yVelocity + this.zVelocity * this.zVelocity);
/* 304:335 */         this.xPos -= this.xVelocity / f4 * 0.0500000007450581D;
/* 305:336 */         this.yPos -= this.yVelocity / f4 * 0.0500000007450581D;
/* 306:337 */         this.zPos -= this.zVelocity / f4 * 0.0500000007450581D;
/* 307:    */         
/* 308:339 */         a("random.bowhit", 1.0F, 1.2F / (this.rng.nextFloat() * 0.2F + 0.9F));
/* 309:340 */         this.i = true;
/* 310:341 */         this.b = 7;
/* 311:342 */         a(false);
/* 312:344 */         if (this.g.getMaterial() != Material.air) {
/* 313:345 */           this.g.a(this.world, localdt2, localbec, this);
/* 314:    */         }
/* 315:    */       }
/* 316:    */     }
/* 317:350 */     if (l()) {
/* 318:351 */       for (int m = 0; m < 4; m++) {
/* 319:352 */         this.world.a(EnumParticleEffect.j, this.xPos + this.xVelocity * m / 4.0D, this.yPos + this.yVelocity * m / 4.0D, this.zPos + this.zVelocity * m / 4.0D, -this.xVelocity, -this.yVelocity + 0.2D, -this.zVelocity, new int[0]);
/* 320:    */       }
/* 321:    */     }
/* 322:356 */     this.xPos += this.xVelocity;
/* 323:357 */     this.yPos += this.yVelocity;
/* 324:358 */     this.zPos += this.zVelocity;
/* 325:    */     
/* 326:360 */     float f3 = MathUtils.sqrt(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/* 327:361 */     this.yaw = ((float)(Math.atan2(this.xVelocity, this.zVelocity) * 180.0D / 3.141592741012573D));
/* 328:362 */     this.pitch = ((float)(Math.atan2(this.yVelocity, f3) * 180.0D / 3.141592741012573D));
/* 329:364 */     while (this.pitch - this.lastPitch < -180.0F) {
/* 330:365 */       this.lastPitch -= 360.0F;
/* 331:    */     }
/* 332:367 */     while (this.pitch - this.lastPitch >= 180.0F) {
/* 333:368 */       this.lastPitch += 360.0F;
/* 334:    */     }
/* 335:371 */     while (this.yaw - this.lastYaw < -180.0F) {
/* 336:372 */       this.lastYaw -= 360.0F;
/* 337:    */     }
/* 338:374 */     while (this.yaw - this.lastYaw >= 180.0F) {
/* 339:375 */       this.lastYaw += 360.0F;
/* 340:    */     }
/* 341:378 */     this.pitch = (this.lastPitch + (this.pitch - this.lastPitch) * 0.2F);
/* 342:379 */     this.yaw = (this.lastYaw + (this.yaw - this.lastYaw) * 0.2F);
/* 343:    */     
/* 344:381 */     float f4 = 0.99F;
/* 345:382 */     float f6 = 0.05F;
/* 346:384 */     if (isInWater())
/* 347:    */     {
/* 348:385 */       for (int i1 = 0; i1 < 4; i1++)
/* 349:    */       {
/* 350:386 */         f7 = 0.25F;
/* 351:387 */         this.world.a(EnumParticleEffect.e, this.xPos - this.xVelocity * f7, this.yPos - this.yVelocity * f7, this.zPos - this.zVelocity * f7, this.xVelocity, this.yVelocity, this.zVelocity, new int[0]);
/* 352:    */       }
/* 353:389 */       f4 = 0.6F;
/* 354:    */     }
/* 355:392 */     if (U()) {
/* 356:393 */       N();
/* 357:    */     }
/* 358:396 */     this.xVelocity *= f4;
/* 359:397 */     this.yVelocity *= f4;
/* 360:398 */     this.zVelocity *= f4;
/* 361:399 */     this.yVelocity -= f6;
/* 362:    */     
/* 363:401 */     setPos(this.xPos, this.yPos, this.zPos);
/* 364:    */     
/* 365:403 */     Q();
/* 366:    */   }
/* 367:    */   
/* 368:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 369:    */   {
/* 370:408 */     paramfn.setShort("xTile", (short)this.d);
/* 371:409 */     paramfn.setShort("yTile", (short)this.e);
/* 372:410 */     paramfn.setShort("zTile", (short)this.f);
/* 373:411 */     paramfn.setShort("life", (short)this.ap);
/* 374:412 */     oa localoa = (oa)BlockType.c.c(this.g);
/* 375:413 */     paramfn.setString("inTile", localoa == null ? "" : localoa.toString());
/* 376:414 */     paramfn.setByte("inData", (byte)this.h);
/* 377:415 */     paramfn.setByte("shake", (byte)this.b);
/* 378:416 */     paramfn.setByte("inGround", (byte)(this.i ? 1 : 0));
/* 379:417 */     paramfn.setByte("pickup", (byte)this.a);
/* 380:418 */     paramfn.setDouble("damage", this.ar);
/* 381:    */   }
/* 382:    */   
/* 383:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 384:    */   {
/* 385:423 */     this.d = paramfn.e("xTile");
/* 386:424 */     this.e = paramfn.e("yTile");
/* 387:425 */     this.f = paramfn.e("zTile");
/* 388:426 */     this.ap = paramfn.e("life");
/* 389:427 */     if (paramfn.hasKey("inTile", 8)) {
/* 390:428 */       this.g = BlockType.b(paramfn.getString("inTile"));
/* 391:    */     } else {
/* 392:430 */       this.g = BlockType.c(paramfn.d("inTile") & 0xFF);
/* 393:    */     }
/* 394:432 */     this.h = (paramfn.d("inData") & 0xFF);
/* 395:433 */     this.b = (paramfn.d("shake") & 0xFF);
/* 396:434 */     this.i = (paramfn.d("inGround") == 1);
/* 397:435 */     if (paramfn.hasKey("damage", 99)) {
/* 398:436 */       this.ar = paramfn.i("damage");
/* 399:    */     }
/* 400:439 */     if (paramfn.hasKey("pickup", 99)) {
/* 401:440 */       this.a = paramfn.d("pickup");
/* 402:441 */     } else if (paramfn.hasKey("player", 99)) {
/* 403:442 */       this.a = (paramfn.getBoolean("player") ? 1 : 0);
/* 404:    */     }
/* 405:    */   }
/* 406:    */   
/* 407:    */   public void onPickedUp(EntityPlayer paramahd)
/* 408:    */   {
/* 409:448 */     if ((this.world.isClient) || (!this.i) || (this.b > 0)) {
/* 410:449 */       return;
/* 411:    */     }
/* 412:452 */     int j = (this.a == 1) || ((this.a == 2) && (paramahd.abilities.instabuild)) ? 1 : 0;
/* 413:454 */     if ((this.a == 1) && 
/* 414:455 */       (!paramahd.inventory.a(new ItemStack(ItemList.arrow, 1)))) {
/* 415:456 */       j = 0;
/* 416:    */     }
/* 417:460 */     if (j != 0)
/* 418:    */     {
/* 419:461 */       a("random.pop", 0.2F, ((this.rng.nextFloat() - this.rng.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 420:462 */       paramahd.a(this, 1);
/* 421:463 */       setDead();
/* 422:    */     }
/* 423:    */   }
/* 424:    */   
/* 425:    */   protected boolean r_()
/* 426:    */   {
/* 427:469 */     return false;
/* 428:    */   }
/* 429:    */   
/* 430:    */   public void b(double paramDouble)
/* 431:    */   {
/* 432:473 */     this.ar = paramDouble;
/* 433:    */   }
/* 434:    */   
/* 435:    */   public double j()
/* 436:    */   {
/* 437:477 */     return this.ar;
/* 438:    */   }
/* 439:    */   
/* 440:    */   public void a(int paramInt)
/* 441:    */   {
/* 442:481 */     this.as = paramInt;
/* 443:    */   }
/* 444:    */   
/* 445:    */   public boolean aE()
/* 446:    */   {
/* 447:486 */     return false;
/* 448:    */   }
/* 449:    */   
/* 450:    */   public void a(boolean paramBoolean)
/* 451:    */   {
/* 452:490 */     int j = this.data.getByte(16);
/* 453:491 */     if (paramBoolean) {
/* 454:492 */       this.data.b(16, Byte.valueOf((byte)(j | 0x1)));
/* 455:    */     } else {
/* 456:494 */       this.data.b(16, Byte.valueOf((byte)(j & 0xFFFFFFFE)));
/* 457:    */     }
/* 458:    */   }
/* 459:    */   
/* 460:    */   public boolean l()
/* 461:    */   {
/* 462:499 */     int j = this.data.getByte(16);
/* 463:500 */     return (j & 0x1) != 0;
/* 464:    */   }
/* 465:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahj
 * JD-Core Version:    0.7.0.1
 */
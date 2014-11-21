package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Random;
/*   6:    */ 
/*   7:    */ public class EntityEnderDragon
/*   8:    */   extends EntityMob
/*   9:    */   implements acx, acy, aex
/*  10:    */ {
/*  11:    */   public double a;
/*  12:    */   public double b;
/*  13:    */   public double c;
/*  14: 36 */   public double[][] bi = new double[64][3];
/*  15: 37 */   public int bj = -1;
/*  16:    */   public acz[] bk;
/*  17:    */   public acz bl;
/*  18:    */   public acz bm;
/*  19:    */   public acz bn;
/*  20:    */   public acz bo;
/*  21:    */   public acz bp;
/*  22:    */   public acz bq;
/*  23:    */   public acz br;
/*  24:    */   public float bs;
/*  25:    */   public float bt;
/*  26:    */   public boolean bu;
/*  27:    */   public boolean bv;
/*  28:    */   private Entity by;
/*  29:    */   public int bw;
/*  30:    */   public ada bx;
/*  31:    */   
/*  32:    */   public EntityEnderDragon(World paramaqu)
/*  33:    */   {
/*  34: 58 */     super(paramaqu); acz[] 
/*  35:    */     
/*  36: 60 */       tmp27_24 = new acz[7]; acz tmp44_41 = new acz(this, "head", 6.0F, 6.0F);this.bl = tmp44_41;tmp27_24[0] = tmp44_41; acz[] tmp49_27 = tmp27_24; acz tmp66_63 = new acz(this, "body", 8.0F, 8.0F);this.bm = tmp66_63;tmp49_27[1] = tmp66_63; acz[] tmp71_49 = tmp49_27; acz tmp88_85 = new acz(this, "tail", 4.0F, 4.0F);this.bn = tmp88_85;tmp71_49[2] = tmp88_85; acz[] tmp93_71 = tmp71_49; acz tmp110_107 = new acz(this, "tail", 4.0F, 4.0F);this.bo = tmp110_107;tmp93_71[3] = tmp110_107; acz[] tmp115_93 = tmp93_71; acz tmp132_129 = new acz(this, "tail", 4.0F, 4.0F);this.bp = tmp132_129;tmp115_93[4] = tmp132_129; acz[] tmp137_115 = tmp115_93; acz tmp154_151 = new acz(this, "wing", 4.0F, 4.0F);this.bq = tmp154_151;tmp137_115[5] = tmp154_151; acz[] tmp159_137 = tmp137_115; acz tmp177_174 = new acz(this, "wing", 4.0F, 4.0F);this.br = tmp177_174;tmp159_137[6] = tmp177_174;this.bk = tmp159_137;
/*  37:    */     
/*  38:    */ 
/*  39:    */ 
/*  40:    */ 
/*  41:    */ 
/*  42:    */ 
/*  43:    */ 
/*  44:    */ 
/*  45:    */ 
/*  46: 70 */     h(bt());
/*  47:    */     
/*  48: 72 */     a(16.0F, 8.0F);
/*  49:    */     
/*  50: 74 */     this.T = true;
/*  51: 75 */     this.ab = true;
/*  52:    */     
/*  53: 77 */     this.b = 100.0D;
/*  54:    */     
/*  55: 79 */     this.ah = true;
/*  56:    */   }
/*  57:    */   
/*  58:    */   protected void aW()
/*  59:    */   {
/*  60: 84 */     super.aW();
/*  61:    */     
/*  62: 86 */     a(afs.a).a(200.0D);
/*  63:    */   }
/*  64:    */   
/*  65:    */   protected void h()
/*  66:    */   {
/*  67: 91 */     super.h();
/*  68:    */   }
/*  69:    */   
/*  70:    */   public double[] b(int paramInt, float paramFloat)
/*  71:    */   {
/*  72: 95 */     if (getHealth() <= 0.0F) {
/*  73: 96 */       paramFloat = 0.0F;
/*  74:    */     }
/*  75: 99 */     paramFloat = 1.0F - paramFloat;
/*  76:    */     
/*  77:101 */     int i = this.bj - paramInt * 1 & 0x3F;
/*  78:102 */     int j = this.bj - paramInt * 1 - 1 & 0x3F;
/*  79:103 */     double[] arrayOfDouble = new double[3];
/*  80:104 */     double d1 = this.bi[i][0];
/*  81:105 */     double d2 = MathUtils.wrapDegrees(this.bi[j][0] - d1);
/*  82:106 */     arrayOfDouble[0] = (d1 + d2 * paramFloat);
/*  83:    */     
/*  84:108 */     d1 = this.bi[i][1];
/*  85:109 */     d2 = this.bi[j][1] - d1;
/*  86:    */     
/*  87:111 */     arrayOfDouble[1] = (d1 + d2 * paramFloat);
/*  88:112 */     arrayOfDouble[2] = (this.bi[i][2] + (this.bi[j][2] - this.bi[i][2]) * paramFloat);
/*  89:113 */     return arrayOfDouble;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void m()
/*  93:    */   {
/*  94:    */     float f2;
/*  95:118 */     if (this.world.isClient)
/*  96:    */     {
/*  97:119 */       float f1 = MathUtils.cos(this.bt * 3.141593F * 2.0F);
/*  98:120 */       f2 = MathUtils.cos(this.bs * 3.141593F * 2.0F);
/*  99:121 */       if ((f2 <= -0.3F) && (f1 >= -0.3F) && (!R())) {
/* 100:122 */         this.world.a(this.xPos, this.yPos, this.zPos, "mob.enderdragon.wings", 5.0F, 0.8F + this.rng.nextFloat() * 0.3F, false);
/* 101:    */       }
/* 102:    */     }
/* 103:126 */     this.bs = this.bt;
/* 104:128 */     if (getHealth() <= 0.0F)
/* 105:    */     {
/* 106:129 */       float f1 = (this.rng.nextFloat() - 0.5F) * 8.0F;
/* 107:130 */       f2 = (this.rng.nextFloat() - 0.5F) * 4.0F;
/* 108:131 */       float f4 = (this.rng.nextFloat() - 0.5F) * 8.0F;
/* 109:132 */       this.world.a(EnumParticleEffect.EXPLOSION_LARGE, this.xPos + f1, this.yPos + 2.0D + f2, this.zPos + f4, 0.0D, 0.0D, 0.0D, new int[0]);
/* 110:133 */       return;
/* 111:    */     }
/* 112:136 */     n();
/* 113:    */     
/* 114:138 */     float f1 = 0.2F / (MathUtils.a(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity) * 10.0F + 1.0F);
/* 115:139 */     f1 *= (float)Math.pow(2.0D, this.yVelocity);
/* 116:140 */     if (this.bv) {
/* 117:141 */       this.bt += f1 * 0.5F;
/* 118:    */     } else {
/* 119:143 */       this.bt += f1;
/* 120:    */     }
/* 121:146 */     this.yaw = MathUtils.wrapDegrees(this.yaw);
/* 122:148 */     if (this.bj < 0) {
/* 123:149 */       for (int i = 0; i < this.bi.length; i++)
/* 124:    */       {
/* 125:150 */         this.bi[i][0] = this.yaw;
/* 126:151 */         this.bi[i][1] = this.yPos;
/* 127:    */       }
/* 128:    */     }
/* 129:155 */     if (++this.bj == this.bi.length) {
/* 130:156 */       this.bj = 0;
/* 131:    */     }
/* 132:158 */     this.bi[this.bj][0] = this.yaw;
/* 133:159 */     this.bi[this.bj][1] = this.yPos;
/* 134:    */     double d1;
/* 135:    */     double d2;
/* 136:    */     double d3;
/* 137:    */     double d4;
/* 138:161 */     if (this.world.isClient)
/* 139:    */     {
/* 140:162 */       if (this.ba > 0)
/* 141:    */       {
/* 142:163 */         d1 = this.xPos + (this.bb - this.xPos) / this.ba;
/* 143:164 */         d2 = this.yPos + (this.bc - this.yPos) / this.ba;
/* 144:165 */         d3 = this.zPos + (this.bd - this.zPos) / this.ba;
/* 145:    */         
/* 146:167 */         d4 = MathUtils.wrapDegrees(this.be - this.yaw);
/* 147:    */         
/* 148:169 */         this.yaw = ((float)(this.yaw + d4 / this.ba));
/* 149:170 */         this.pitch = ((float)(this.pitch + (this.bf - this.pitch) / this.ba));
/* 150:    */         
/* 151:172 */         this.ba -= 1;
/* 152:173 */         setPos(d1, d2, d3);
/* 153:174 */         b(this.yaw, this.pitch);
/* 154:    */       }
/* 155:    */     }
/* 156:    */     else
/* 157:    */     {
/* 158:177 */       d1 = this.a - this.xPos;
/* 159:178 */       d2 = this.b - this.yPos;
/* 160:179 */       d3 = this.c - this.zPos;
/* 161:    */       
/* 162:181 */       d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 163:182 */       if (this.by != null)
/* 164:    */       {
/* 165:183 */         this.a = this.by.xPos;
/* 166:184 */         this.c = this.by.zPos;
/* 167:    */         
/* 168:186 */         double d5 = this.a - this.xPos;
/* 169:187 */         double d7 = this.c - this.zPos;
/* 170:188 */         double d9 = Math.sqrt(d5 * d5 + d7 * d7);
/* 171:189 */         double d10 = 0.4000000059604645D + d9 / 80.0D - 1.0D;
/* 172:190 */         if (d10 > 10.0D) {
/* 173:191 */           d10 = 10.0D;
/* 174:    */         }
/* 175:193 */         this.b = (this.by.getAABB().minY + d10);
/* 176:    */       }
/* 177:    */       else
/* 178:    */       {
/* 179:195 */         this.a += this.rng.nextGaussian() * 2.0D;
/* 180:196 */         this.c += this.rng.nextGaussian() * 2.0D;
/* 181:    */       }
/* 182:198 */       if ((this.bu) || (d4 < 100.0D) || (d4 > 22500.0D) || (this.D) || (this.E)) {
/* 183:199 */         cd();
/* 184:    */       }
/* 185:201 */       d2 /= MathUtils.a(d1 * d1 + d3 * d3);
/* 186:202 */       float f9 = 0.6F;
/* 187:203 */       d2 = MathUtils.clamp(d2, -f9, f9);
/* 188:204 */       this.yVelocity += d2 * 0.1000000014901161D;
/* 189:205 */       this.yaw = MathUtils.wrapDegrees(this.yaw);
/* 190:    */       
/* 191:207 */       double d6 = 180.0D - Math.atan2(d1, d3) * 180.0D / 3.141592741012573D;
/* 192:208 */       double d8 = MathUtils.wrapDegrees(d6 - this.yaw);
/* 193:210 */       if (d8 > 50.0D) {
/* 194:211 */         d8 = 50.0D;
/* 195:    */       }
/* 196:213 */       if (d8 < -50.0D) {
/* 197:214 */         d8 = -50.0D;
/* 198:    */       }
/* 199:217 */       Vec3 localbrw1 = new Vec3(this.a - this.xPos, this.b - this.yPos, this.c - this.zPos).normalize();
/* 200:218 */       double d10 = -MathUtils.cos(this.yaw * 3.141593F / 180.0F);
/* 201:219 */       Vec3 localbrw2 = new Vec3(MathUtils.sin(this.yaw * 3.141593F / 180.0F), this.yVelocity, d10).normalize();
/* 202:220 */       float f16 = ((float)localbrw2.dot(localbrw1) + 0.5F) / 1.5F;
/* 203:221 */       if (f16 < 0.0F) {
/* 204:222 */         f16 = 0.0F;
/* 205:    */       }
/* 206:225 */       this.aZ *= 0.8F;
/* 207:    */       
/* 208:227 */       float f17 = MathUtils.a(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity) * 1.0F + 1.0F;
/* 209:228 */       double d11 = Math.sqrt(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity) * 1.0D + 1.0D;
/* 210:229 */       if (d11 > 40.0D) {
/* 211:230 */         d11 = 40.0D;
/* 212:    */       }
/* 213:232 */       this.aZ = ((float)(this.aZ + d8 * (0.699999988079071D / d11 / f17)));
/* 214:233 */       this.yaw += this.aZ * 0.1F;
/* 215:    */       
/* 216:235 */       float f18 = (float)(2.0D / (d11 + 1.0D));
/* 217:236 */       float f19 = 0.06F;
/* 218:237 */       a(0.0F, -1.0F, f19 * (f16 * f18 + (1.0F - f18)));
/* 219:238 */       if (this.bv) {
/* 220:239 */         d(this.xVelocity * 0.800000011920929D, this.yVelocity * 0.800000011920929D, this.zVelocity * 0.800000011920929D);
/* 221:    */       } else {
/* 222:241 */         d(this.xVelocity, this.yVelocity, this.zVelocity);
/* 223:    */       }
/* 224:244 */       Vec3 localbrw3 = new Vec3(this.xVelocity, this.yVelocity, this.zVelocity).normalize();
/* 225:245 */       float f20 = ((float)localbrw3.dot(localbrw2) + 1.0F) / 2.0F;
/* 226:246 */       f20 = 0.8F + 0.15F * f20;
/* 227:    */       
/* 228:248 */       this.xVelocity *= f20;
/* 229:249 */       this.zVelocity *= f20;
/* 230:250 */       this.yVelocity *= 0.910000026226044D;
/* 231:    */     }
/* 232:253 */     this.aG = this.yaw;
/* 233:    */     
/* 234:255 */     this.bl.width = (this.bl.height = 3.0F);
/* 235:256 */     this.bn.width = (this.bn.height = 2.0F);
/* 236:257 */     this.bo.width = (this.bo.height = 2.0F);
/* 237:258 */     this.bp.width = (this.bp.height = 2.0F);
/* 238:259 */     this.bm.height = 3.0F;
/* 239:260 */     this.bm.width = 5.0F;
/* 240:261 */     this.bq.height = 2.0F;
/* 241:262 */     this.bq.width = 4.0F;
/* 242:263 */     this.br.height = 3.0F;
/* 243:264 */     this.br.width = 4.0F;
/* 244:    */     
/* 245:266 */     float f3 = (float)(b(5, 1.0F)[1] - b(10, 1.0F)[1]) * 10.0F / 180.0F * 3.141593F;
/* 246:267 */     float f4 = MathUtils.cos(f3);
/* 247:268 */     float f5 = -MathUtils.sin(f3);
/* 248:    */     
/* 249:270 */     float f6 = this.yaw * 3.141593F / 180.0F;
/* 250:271 */     float f7 = MathUtils.sin(f6);
/* 251:272 */     float f8 = MathUtils.cos(f6);
/* 252:    */     
/* 253:274 */     this.bm.onUpdate();
/* 254:275 */     this.bm.setPositionAndAngles(this.xPos + f7 * 0.5F, this.yPos, this.zPos - f8 * 0.5F, 0.0F, 0.0F);
/* 255:276 */     this.bq.onUpdate();
/* 256:277 */     this.bq.setPositionAndAngles(this.xPos + f8 * 4.5F, this.yPos + 2.0D, this.zPos + f7 * 4.5F, 0.0F, 0.0F);
/* 257:278 */     this.br.onUpdate();
/* 258:279 */     this.br.setPositionAndAngles(this.xPos - f8 * 4.5F, this.yPos + 2.0D, this.zPos - f7 * 4.5F, 0.0F, 0.0F);
/* 259:281 */     if ((!this.world.isClient) && (this.hurtTime == 0))
/* 260:    */     {
/* 261:282 */       a(this.world.b(this, this.bq.getAABB().expand(4.0D, 2.0D, 4.0D).offset(0.0D, -2.0D, 0.0D)));
/* 262:283 */       a(this.world.b(this, this.br.getAABB().expand(4.0D, 2.0D, 4.0D).offset(0.0D, -2.0D, 0.0D)));
/* 263:284 */       b(this.world.b(this, this.bl.getAABB().expand(1.0D, 1.0D, 1.0D)));
/* 264:    */     }
/* 265:287 */     double[] arrayOfDouble1 = b(5, 1.0F);
/* 266:    */     
/* 267:289 */     double[] arrayOfDouble2 = b(0, 1.0F);
/* 268:290 */     float f9 = MathUtils.sin(this.yaw * 3.141593F / 180.0F - this.aZ * 0.01F);
/* 269:291 */     float f10 = MathUtils.cos(this.yaw * 3.141593F / 180.0F - this.aZ * 0.01F);
/* 270:292 */     this.bl.onUpdate();
/* 271:293 */     this.bl.setPositionAndAngles(this.xPos + f9 * 5.5F * f4, this.yPos + (arrayOfDouble2[1] - arrayOfDouble1[1]) * 1.0D + f5 * 5.5F, this.zPos - f10 * 5.5F * f4, 0.0F, 0.0F);
/* 272:296 */     for (int j = 0; j < 3; j++)
/* 273:    */     {
/* 274:297 */       acz localacz = null;
/* 275:299 */       if (j == 0) {
/* 276:300 */         localacz = this.bn;
/* 277:    */       }
/* 278:302 */       if (j == 1) {
/* 279:303 */         localacz = this.bo;
/* 280:    */       }
/* 281:305 */       if (j == 2) {
/* 282:306 */         localacz = this.bp;
/* 283:    */       }
/* 284:309 */       double[] arrayOfDouble3 = b(12 + j * 2, 1.0F);
/* 285:    */       
/* 286:311 */       float f11 = this.yaw * 3.141593F / 180.0F + b(arrayOfDouble3[0] - arrayOfDouble1[0]) * 3.141593F / 180.0F * 1.0F;
/* 287:312 */       float f12 = MathUtils.sin(f11);
/* 288:313 */       float f13 = MathUtils.cos(f11);
/* 289:    */       
/* 290:315 */       float f14 = 1.5F;
/* 291:316 */       float f15 = (j + 1) * 2.0F;
/* 292:317 */       localacz.onUpdate();
/* 293:318 */       localacz.setPositionAndAngles(this.xPos - (f7 * f14 + f12 * f15) * f4, this.yPos + (arrayOfDouble3[1] - arrayOfDouble1[1]) * 1.0D - (f15 + f14) * f5 + 1.5D, this.zPos + (f8 * f14 + f13 * f15) * f4, 0.0F, 0.0F);
/* 294:    */     }
/* 295:321 */     if (!this.world.isClient) {
/* 296:322 */       this.bv = (b(this.bl.getAABB()) | b(this.bm.getAABB()));
/* 297:    */     }
/* 298:    */   }
/* 299:    */   
/* 300:    */   private void n()
/* 301:    */   {
/* 302:327 */     if (this.bx != null) {
/* 303:328 */       if (this.bx.isDead)
/* 304:    */       {
/* 305:329 */         if (!this.world.isClient) {
/* 306:330 */           a(this.bl, DamageSource.a((aqo)null), 10.0F);
/* 307:    */         }
/* 308:333 */         this.bx = null;
/* 309:    */       }
/* 310:334 */       else if ((this.W % 10 == 0) && 
/* 311:335 */         (getHealth() < bt()))
/* 312:    */       {
/* 313:336 */         h(getHealth() + 1.0F);
/* 314:    */       }
/* 315:    */     }
/* 316:341 */     if (this.rng.nextInt(10) == 0)
/* 317:    */     {
/* 318:342 */       float f = 32.0F;
/* 319:343 */       List<ada> localList = this.world.getEntityList(ada.class, getAABB().expand(f, f, f));
/* 320:    */       
/* 321:345 */       ada localObject = null;
/* 322:346 */       double d1 = 1.7976931348623157E+308D;
/* 323:347 */       for (ada localada : localList)
/* 324:    */       {
/* 325:348 */         double d2 = localada.h(this);
/* 326:349 */         if (d2 < d1)
/* 327:    */         {
/* 328:350 */           d1 = d2;
/* 329:351 */           localObject = localada;
/* 330:    */         }
/* 331:    */       }
/* 332:355 */       this.bx = localObject;
/* 333:    */     }
/* 334:    */   }
/* 335:    */   
/* 336:    */   private void a(List<Entity> paramList)
/* 337:    */   {
/* 338:360 */     double d1 = (this.bm.getAABB().minX + this.bm.getAABB().maxX) / 2.0D;
/* 339:361 */     double d2 = (this.bm.getAABB().minZ + this.bm.getAABB().maxZ) / 2.0D;
/* 340:363 */     for (Entity localwv : paramList) {
/* 341:364 */       if ((localwv instanceof EntityLiving))
/* 342:    */       {
/* 343:365 */         double d3 = localwv.xPos - d1;
/* 344:366 */         double d4 = localwv.zPos - d2;
/* 345:367 */         double d5 = d3 * d3 + d4 * d4;
/* 346:368 */         localwv.g(d3 / d5 * 4.0D, 0.2000000029802322D, d4 / d5 * 4.0D);
/* 347:    */       }
/* 348:    */     }
/* 349:    */   }
/* 350:    */   
/* 351:    */   private void b(List<Entity> paramList)
/* 352:    */   {
/* 353:374 */     for (int i = 0; i < paramList.size(); i++)
/* 354:    */     {
/* 355:375 */       Entity localwv = paramList.get(i);
/* 356:376 */       if ((localwv instanceof EntityLiving))
/* 357:    */       {
/* 358:377 */         localwv.a(DamageSource.a(this), 10.0F);
/* 359:378 */         a(this, localwv);
/* 360:    */       }
/* 361:    */     }
/* 362:    */   }
/* 363:    */   
/* 364:    */   private void cd()
/* 365:    */   {
/* 366:384 */     this.bu = false;
/* 367:385 */     ArrayList<EntityPlayer> localArrayList = Lists.newArrayList(this.world.playerList);
/* 368:386 */     Iterator<EntityPlayer> localIterator = localArrayList.iterator();
/* 369:387 */     while (localIterator.hasNext()) {
/* 370:388 */       if (localIterator.next().v()) {
/* 371:389 */         localIterator.remove();
/* 372:    */       }
/* 373:    */     }
/* 374:393 */     if ((this.rng.nextInt(2) == 0) && (!localArrayList.isEmpty()))
/* 375:    */     {
/* 376:394 */       this.by = ((Entity)localArrayList.get(this.rng.nextInt(localArrayList.size())));
/* 377:    */     }
/* 378:    */     else
/* 379:    */     {
/* 380:    */       int i;
/* 381:    */       do
/* 382:    */       {
/* 383:398 */         this.a = 0.0D;
/* 384:399 */         this.b = (70.0F + this.rng.nextFloat() * 50.0F);
/* 385:400 */         this.c = 0.0D;
/* 386:401 */         this.a += this.rng.nextFloat() * 120.0F - 60.0F;
/* 387:402 */         this.c += this.rng.nextFloat() * 120.0F - 60.0F;
/* 388:403 */         double d1 = this.xPos - this.a;
/* 389:404 */         double d2 = this.yPos - this.b;
/* 390:405 */         double d3 = this.zPos - this.c;
/* 391:406 */         i = d1 * d1 + d2 * d2 + d3 * d3 > 100.0D ? 1 : 0;
/* 392:407 */       } while (i == 0);
/* 393:408 */       this.by = null;
/* 394:    */     }
/* 395:    */   }
/* 396:    */   
/* 397:    */   private float b(double paramDouble)
/* 398:    */   {
/* 399:413 */     return (float)MathUtils.wrapDegrees(paramDouble);
/* 400:    */   }
/* 401:    */   
/* 402:    */   private boolean b(AABB parambrt)
/* 403:    */   {
/* 404:417 */     int i = MathUtils.floor(parambrt.minX);
/* 405:418 */     int j = MathUtils.floor(parambrt.minY);
/* 406:419 */     int k = MathUtils.floor(parambrt.minZ);
/* 407:420 */     int m = MathUtils.floor(parambrt.maxX);
/* 408:421 */     int n = MathUtils.floor(parambrt.maxY);
/* 409:422 */     int i1 = MathUtils.floor(parambrt.maxZ);
/* 410:423 */     boolean bool = false;
/* 411:424 */     int i2 = 0;
/* 412:425 */     for (int i3 = i; i3 <= m; i3++) {
/* 413:426 */       for (int i4 = j; i4 <= n; i4++) {
/* 414:427 */         for (int i5 = k; i5 <= i1; i5++)
/* 415:    */         {
/* 416:428 */           ProtoBlock localatr = this.world.getBlock(new BlockPosition(i3, i4, i5)).getProto();
/* 417:429 */           if (localatr.getMaterial() != Material.air) {
/* 418:431 */             if ((localatr == BlockList.barrier) || (localatr == BlockList.obsidian) || (localatr == BlockList.endStone) || (localatr == BlockList.bedrock) || (localatr == BlockList.bX) || (!this.world.getGameRules().getBoolean("mobGriefing"))) {
/* 419:432 */               bool = true;
/* 420:    */             } else {
/* 421:434 */               i2 = (this.world.g(new BlockPosition(i3, i4, i5))) || (i2 != 0) ? 1 : 0;
/* 422:    */             }
/* 423:    */           }
/* 424:    */         }
/* 425:    */       }
/* 426:    */     }
/* 427:440 */     if (i2 != 0)
/* 428:    */     {
/* 429:441 */       double d1 = parambrt.minX + (parambrt.maxX - parambrt.minX) * this.rng.nextFloat();
/* 430:442 */       double d2 = parambrt.minY + (parambrt.maxY - parambrt.minY) * this.rng.nextFloat();
/* 431:443 */       double d3 = parambrt.minZ + (parambrt.maxZ - parambrt.minZ) * this.rng.nextFloat();
/* 432:444 */       this.world.a(EnumParticleEffect.EXPLOSION_LARGE, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 433:    */     }
/* 434:447 */     return bool;
/* 435:    */   }
/* 436:    */   
/* 437:    */   public boolean a(acz paramacz, DamageSource paramwh, float paramFloat)
/* 438:    */   {
/* 439:452 */     if (paramacz != this.bl) {
/* 440:453 */       paramFloat = paramFloat / 4.0F + 1.0F;
/* 441:    */     }
/* 442:456 */     float f1 = this.yaw * 3.141593F / 180.0F;
/* 443:457 */     float f2 = MathUtils.sin(f1);
/* 444:458 */     float f3 = MathUtils.cos(f1);
/* 445:    */     
/* 446:460 */     this.a = (this.xPos + f2 * 5.0F + (this.rng.nextFloat() - 0.5F) * 2.0F);
/* 447:461 */     this.b = (this.yPos + this.rng.nextFloat() * 3.0F + 1.0D);
/* 448:462 */     this.c = (this.zPos - f3 * 5.0F + (this.rng.nextFloat() - 0.5F) * 2.0F);
/* 449:463 */     this.by = null;
/* 450:464 */     if (((paramwh.j() instanceof EntityPlayer)) || (paramwh.c())) {
/* 451:465 */       e(paramwh, paramFloat);
/* 452:    */     }
/* 453:467 */     return true;
/* 454:    */   }
/* 455:    */   
/* 456:    */   public boolean a(DamageSource paramwh, float paramFloat)
/* 457:    */   {
/* 458:472 */     if (((paramwh instanceof wi)) && (((wi)paramwh).w())) {
/* 459:473 */       e(paramwh, paramFloat);
/* 460:    */     }
/* 461:475 */     return false;
/* 462:    */   }
/* 463:    */   
/* 464:    */   protected boolean e(DamageSource paramwh, float paramFloat)
/* 465:    */   {
/* 466:479 */     return super.a(paramwh, paramFloat);
/* 467:    */   }
/* 468:    */   
/* 469:    */   public void G()
/* 470:    */   {
/* 471:484 */     setDead();
/* 472:    */   }
/* 473:    */   
/* 474:    */   protected void aY()
/* 475:    */   {
/* 476:489 */     this.bw += 1;
/* 477:490 */     if ((this.bw >= 180) && (this.bw <= 200))
/* 478:    */     {
/* 479:491 */       float f1 = (this.rng.nextFloat() - 0.5F) * 8.0F;
/* 480:492 */       float f2 = (this.rng.nextFloat() - 0.5F) * 4.0F;
/* 481:493 */       float f3 = (this.rng.nextFloat() - 0.5F) * 8.0F;
/* 482:494 */       this.world.a(EnumParticleEffect.EXPLOSION_HUGE, this.xPos + f1, this.yPos + 2.0D + f2, this.zPos + f3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 483:    */     }
/* 484:    */     int i;
/* 485:    */     int j;
/* 486:496 */     if (!this.world.isClient)
/* 487:    */     {
/* 488:497 */       if ((this.bw > 150) && (this.bw % 5 == 0) && (this.world.getGameRules().getBoolean("doMobLoot")))
/* 489:    */       {
/* 490:498 */         i = 1000;
/* 491:499 */         while (i > 0)
/* 492:    */         {
/* 493:500 */           j = EntityExperienceOrb.a(i);
/* 494:501 */           i -= j;
/* 495:502 */           this.world.spawnEntity(new EntityExperienceOrb(this.world, this.xPos, this.yPos, this.zPos, j));
/* 496:    */         }
/* 497:    */       }
/* 498:505 */       if (this.bw == 1) {
/* 499:506 */         this.world.a(1018, new BlockPosition(this), 0);
/* 500:    */       }
/* 501:    */     }
/* 502:509 */     d(0.0D, 0.1000000014901161D, 0.0D);
/* 503:510 */     this.aG = (this.yaw += 20.0F);
/* 504:512 */     if ((this.bw == 200) && (!this.world.isClient))
/* 505:    */     {
/* 506:513 */       i = 2000;
/* 507:514 */       while (i > 0)
/* 508:    */       {
/* 509:515 */         j = EntityExperienceOrb.a(i);
/* 510:516 */         i -= j;
/* 511:517 */         this.world.spawnEntity(new EntityExperienceOrb(this.world, this.xPos, this.yPos, this.zPos, j));
/* 512:    */       }
/* 513:519 */       spawnPortal(new BlockPosition(this.xPos, 64.0D, this.zPos));
/* 514:520 */       setDead();
/* 515:    */     }
/* 516:    */   }
/* 517:    */   
/* 518:    */   private void spawnPortal(BlockPosition paramdt)
/* 519:    */   {
/* 520:525 */     //int i = 4;
/* 521:526 */     //double d1 = 12.25D;
/* 522:527 */     //double d2 = 6.25D;
/* 523:529 */     for (int dy = -1; dy <= 32; dy++) {
/* 524:530 */       for (int dx = -4; dx <= 4; dx++) {
/* 525:531 */         for (int dz = -4; dz <= 4; dz++)
/* 526:    */         {
/* 527:532 */           double dist = dx * dx + dz * dz;
/* 528:533 */           if (dist <= 12.25D)
/* 529:    */           {
/* 530:537 */             BlockPosition localdt2 = paramdt.offset(dx, dy, dz);
/* 531:538 */             if (dy < 0)
/* 532:    */             {
/* 533:539 */               if (dist <= 6.25D) {
/* 534:540 */                 this.world.setBlock(localdt2, BlockList.bedrock.instance());
/* 535:    */               }
/* 536:    */             }
/* 537:542 */             else if (dy > 0) {
/* 538:543 */               this.world.setBlock(localdt2, BlockList.air.instance());
/* 539:545 */             } else if (dist > 6.25D) {
/* 540:546 */               this.world.setBlock(localdt2, BlockList.bedrock.instance());
/* 541:    */             } else {
/* 542:548 */               this.world.setBlock(localdt2, BlockList.endPortal.instance());
/* 543:    */             }
/* 544:    */           }
/* 545:    */         }
/* 546:    */       }
/* 547:    */     }
/* 548:555 */     this.world.setBlock(paramdt, BlockList.bedrock.instance());
/* 549:556 */     this.world.setBlock(paramdt.up(), BlockList.bedrock.instance());
/* 550:557 */     BlockPosition localdt1 = paramdt.up(2);
/* 551:558 */     this.world.setBlock(localdt1, BlockList.bedrock.instance());
/* 552:559 */     this.world.setBlock(localdt1.west(), BlockList.torch.instance().a(bbl.a, EnumDirection.EAST));
/* 553:560 */     this.world.setBlock(localdt1.east(), BlockList.torch.instance().a(bbl.a, EnumDirection.WEST));
/* 554:561 */     this.world.setBlock(localdt1.north(), BlockList.torch.instance().a(bbl.a, EnumDirection.SOUTH));
/* 555:562 */     this.world.setBlock(localdt1.south(), BlockList.torch.instance().a(bbl.a, EnumDirection.NORTH));
/* 556:563 */     this.world.setBlock(paramdt.up(3), BlockList.bedrock.instance());
/* 557:564 */     this.world.setBlock(paramdt.up(4), BlockList.dragonEgg.instance());
/* 558:    */   }
/* 559:    */   
/* 560:    */   protected void D() {}
/* 561:    */   
/* 562:    */   public Entity[] aC()
/* 563:    */   {
/* 564:573 */     return this.bk;
/* 565:    */   }
/* 566:    */   
/* 567:    */   public boolean ad()
/* 568:    */   {
/* 569:578 */     return false;
/* 570:    */   }
/* 571:    */   
/* 572:    */   public World a()
/* 573:    */   {
/* 574:583 */     return this.world;
/* 575:    */   }
/* 576:    */   
/* 577:    */   protected String z()
/* 578:    */   {
/* 579:588 */     return "mob.enderdragon.growl";
/* 580:    */   }
/* 581:    */   
/* 582:    */   protected String bn()
/* 583:    */   {
/* 584:593 */     return "mob.enderdragon.hit";
/* 585:    */   }
/* 586:    */   
/* 587:    */   protected float bA()
/* 588:    */   {
/* 589:598 */     return 5.0F;
/* 590:    */   }
/* 591:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     adb
 * JD-Core Version:    0.7.0.1
 */
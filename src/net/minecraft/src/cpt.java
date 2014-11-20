package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ 
/*   4:    */ public class cpt
/*   5:    */ {
/*   6: 52 */   private Map<Class,cpu> k = Maps.newHashMap();
/*   7: 53 */   private Map l = Maps.newHashMap();
/*   8:    */   private ctc m;
/*   9:    */   private bty n;
/*  10:    */   private double o;
/*  11:    */   private double p;
/*  12:    */   private double q;
/*  13:    */   public cug a;
/*  14:    */   public World b;
/*  15:    */   public Entity c;
/*  16:    */   public Entity d;
/*  17:    */   public float e;
/*  18:    */   public float f;
/*  19:    */   public bto g;
/*  20:    */   public double h;
/*  21:    */   public double i;
/*  22:    */   public double j;
/*  23: 69 */   private boolean r = false;
/*  24: 70 */   private boolean s = true;
/*  25:    */   
/*  26:    */   public cpt(cug paramcug, cqh paramcqh)
/*  27:    */   {
/*  28: 73 */     this.a = paramcug;
/*  29:    */     
/*  30: 75 */     this.k.put(aeo.class, new cpk(this));
/*  31: 76 */     this.k.put(EntitySpider.class, new crn(this));
/*  32: 77 */     this.k.put(EntityPig.class, new crd(this, new ccs(), 0.7F));
/*  33: 78 */     this.k.put(EntitySheep.class, new crh(this, new ccy(), 0.7F));
/*  34: 79 */     this.k.put(EntityCow.class, new cpm(this, new ccd(), 0.7F));
/*  35: 80 */     this.k.put(EntityMooshroom.class, new cra(this, new ccd(), 0.7F));
/*  36: 81 */     this.k.put(EntityWolf.class, new cry(this, new cdo(), 0.5F));
/*  37: 82 */     this.k.put(EntityChicken.class, new cpl(this, new ccc(), 0.3F));
/*  38: 83 */     this.k.put(EntityOcelot.class, new crb(this, new ccr(), 0.4F));
/*  39: 84 */     this.k.put(EntityRabbit.class, new crg(this, new ccw(), 0.3F));
/*  40: 85 */     this.k.put(EntitySilverfish.class, new cri(this));
/*  41: 86 */     this.k.put(EntityEndermite.class, new cps(this));
/*  42: 87 */     this.k.put(EntityCreeper.class, new cpn(this));
/*  43: 88 */     this.k.put(EntityEnderman.class, new cpr(this));
/*  44: 89 */     this.k.put(EntitySnowGolem.class, new crm(this));
/*  45: 90 */     this.k.put(EntitySkeleton.class, new crj(this));
/*  46: 91 */     this.k.put(EntityWitch.class, new crv(this));
/*  47: 92 */     this.k.put(EntityBlaze.class, new cpi(this));
/*  48: 93 */     this.k.put(EntityZombiePigman.class, new cre(this));
/*  49: 94 */     this.k.put(EntityZombie.class, new crz(this));
/*  50: 95 */     this.k.put(EntitySlime.class, new crl(this, new cde(16), 0.25F));
/*  51: 96 */     this.k.put(EntityLavaSlime.class, new cqs(this));
/*  52: 97 */     this.k.put(EntityGiant.class, new cqa(this, new cdp(), 0.5F, 6.0F));
/*  53: 98 */     this.k.put(EntityGhast.class, new cpz(this));
/*  54: 99 */     this.k.put(EntitySquid.class, new cro(this, new cdh(), 0.7F));
/*  55:100 */     this.k.put(EntityVillager.class, new cru(this));
/*  56:101 */     this.k.put(EntityIronGolem.class, new crt(this));
/*  57:102 */     this.k.put(EntityBat.class, new cph(this));
/*  58:103 */     this.k.put(EntityGuardian.class, new cqc(this));
/*  59:    */     
/*  60:105 */     this.k.put(EntityEnderDragon.class, new cpq(this));
/*  61:106 */     this.k.put(ada.class, new cpp(this));
/*  62:    */     
/*  63:108 */     this.k.put(EntityWither.class, new crw(this));
/*  64:    */     
/*  65:110 */     this.k.put(Entity.class, new cpo(this));
/*  66:    */     
/*  67:112 */     this.k.put(adm.class, new crc(this));
/*  68:113 */     this.k.put(EntityItemFrame.class, new cqg(this, paramcqh));
/*  69:114 */     this.k.put(adl.class, new cqt(this));
/*  70:115 */     this.k.put(ahj.class, new cpg(this));
/*  71:116 */     this.k.put(ahq.class, new crp(this, ItemList.aD, paramcqh));
/*  72:117 */     this.k.put(aht.class, new crp(this, ItemList.bu, paramcqh));
/*  73:118 */     this.k.put(EntityEnderEye.class, new crp(this, ItemList.bH, paramcqh));
/*  74:119 */     this.k.put(ahs.class, new crp(this, ItemList.aP, paramcqh));
/*  75:120 */     this.k.put(ahv.class, new crq(this, paramcqh));
/*  76:121 */     this.k.put(ahu.class, new crp(this, ItemList.bK, paramcqh));
/*  77:122 */     this.k.put(ahm.class, new crp(this, ItemList.cb, paramcqh));
/*  78:123 */     this.k.put(ahn.class, new cpx(this, 2.0F));
/*  79:124 */     this.k.put(ahp.class, new cpx(this, 0.5F));
/*  80:125 */     this.k.put(ahw.class, new crx(this));
/*  81:126 */     this.k.put(EntityItem.class, new cqf(this, paramcqh));
/*  82:127 */     this.k.put(EntityExperienceOrb.class, new cpv(this));
/*  83:128 */     this.k.put(aek.class, new crs(this));
/*  84:129 */     this.k.put(adv.class, new cpw(this));
/*  85:130 */     this.k.put(EntityArmorStand.class, new cpe(this));
/*  86:    */     
/*  87:132 */     this.k.put(aej.class, new crr(this));
/*  88:133 */     this.k.put(aeh.class, new cqy(this));
/*  89:134 */     this.k.put(adx.class, new cqx(this));
/*  90:135 */     this.k.put(adu.class, new cpj(this));
/*  91:136 */     this.k.put(EntityFishHook.class, new cpy(this));
/*  92:    */     
/*  93:138 */     this.k.put(EntityHorse.class, new cqd(this, new ccj(), 0.75F));
/*  94:    */     
/*  95:140 */     this.k.put(ads.class, new cqu(this));
/*  96:    */     
/*  97:142 */     this.m = new ctc(this);
/*  98:143 */     this.l.put("default", this.m);
/*  99:144 */     this.l.put("slim", new ctc(this, true));
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3)
/* 103:    */   {
/* 104:148 */     this.o = paramDouble1;
/* 105:149 */     this.p = paramDouble2;
/* 106:150 */     this.q = paramDouble3;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public cpu a(Class paramClass)
/* 110:    */   {
/* 111:155 */     cpu localcpu = (cpu)this.k.get(paramClass);
/* 112:156 */     if ((localcpu == null) && (paramClass != Entity.class))
/* 113:    */     {
/* 114:157 */       localcpu = a(paramClass.getSuperclass());
/* 115:158 */       this.k.put(paramClass, localcpu);
/* 116:    */     }
/* 117:160 */     return localcpu;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public cpu a(Entity paramwv)
/* 121:    */   {
/* 122:165 */     if ((paramwv instanceof cil))
/* 123:    */     {
/* 124:166 */       String str = ((cil)paramwv).l();
/* 125:167 */       ctc localctc = (ctc)this.l.get(str);
/* 126:168 */       if (localctc != null) {
/* 127:169 */         return localctc;
/* 128:    */       }
/* 129:171 */       return this.m;
/* 130:    */     }
/* 131:173 */     return a(paramwv.getClass());
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void a(World paramaqu, bty parambty, Entity paramwv1, Entity paramwv2, bto parambto, float paramFloat)
/* 135:    */   {
/* 136:177 */     this.b = paramaqu;
/* 137:178 */     this.g = parambto;
/* 138:179 */     this.c = paramwv1;
/* 139:180 */     this.d = paramwv2;
/* 140:181 */     this.n = parambty;
/* 141:183 */     if (((paramwv1 instanceof EntityLiving)) && (((EntityLiving)paramwv1).bI()))
/* 142:    */     {
/* 143:184 */       Block localbec = paramaqu.getBlock(new BlockPosition(paramwv1));
/* 144:185 */       ProtoBlock localatr = localbec.getProto();
/* 145:186 */       if (localatr == BlockList.C)
/* 146:    */       {
/* 147:187 */         int i1 = ((EnumDirection)localbec.getProperty(atp.N)).b();
/* 148:188 */         this.e = (i1 * 90 + 180);
/* 149:189 */         this.f = 0.0F;
/* 150:    */       }
/* 151:    */     }
/* 152:    */     else
/* 153:    */     {
/* 154:192 */       this.e = (paramwv1.lastYaw + (paramwv1.yaw - paramwv1.lastYaw) * paramFloat);
/* 155:193 */       this.f = (paramwv1.lastPitch + (paramwv1.pitch - paramwv1.lastPitch) * paramFloat);
/* 156:    */     }
/* 157:196 */     if (parambto.ax == 2) {
/* 158:197 */       this.e += 180.0F;
/* 159:    */     }
/* 160:200 */     this.h = (paramwv1.P + (paramwv1.xPos - paramwv1.P) * paramFloat);
/* 161:201 */     this.i = (paramwv1.Q + (paramwv1.yPos - paramwv1.Q) * paramFloat);
/* 162:202 */     this.j = (paramwv1.R + (paramwv1.zPos - paramwv1.R) * paramFloat);
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void a(float paramFloat)
/* 166:    */   {
/* 167:206 */     this.e = paramFloat;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public boolean a()
/* 171:    */   {
/* 172:210 */     return this.s;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void a(boolean paramBoolean)
/* 176:    */   {
/* 177:214 */     this.s = paramBoolean;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void b(boolean paramBoolean)
/* 181:    */   {
/* 182:218 */     this.t = paramBoolean;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public boolean b()
/* 186:    */   {
/* 187:222 */     return this.t;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public boolean a(Entity paramwv, float paramFloat)
/* 191:    */   {
/* 192:226 */     return a(paramwv, paramFloat, false);
/* 193:    */   }
/* 194:    */   
/* 195:    */   public boolean a(Entity paramwv, cox paramcox, double paramDouble1, double paramDouble2, double paramDouble3)
/* 196:    */   {
/* 197:230 */     cpu localcpu = a(paramwv);
/* 198:231 */     if ((localcpu != null) && 
/* 199:232 */       (localcpu.a(paramwv, paramcox, paramDouble1, paramDouble2, paramDouble3))) {
/* 200:233 */       return true;
/* 201:    */     }
/* 202:236 */     return false;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public boolean a(Entity paramwv, float paramFloat, boolean paramBoolean)
/* 206:    */   {
/* 207:240 */     if (paramwv.W == 0)
/* 208:    */     {
/* 209:241 */       paramwv.P = paramwv.xPos;
/* 210:242 */       paramwv.Q = paramwv.yPos;
/* 211:243 */       paramwv.R = paramwv.zPos;
/* 212:    */     }
/* 213:245 */     double d1 = paramwv.P + (paramwv.xPos - paramwv.P) * paramFloat;
/* 214:246 */     double d2 = paramwv.Q + (paramwv.yPos - paramwv.Q) * paramFloat;
/* 215:247 */     double d3 = paramwv.R + (paramwv.zPos - paramwv.R) * paramFloat;
/* 216:248 */     float f1 = paramwv.lastYaw + (paramwv.yaw - paramwv.lastYaw) * paramFloat;
/* 217:    */     
/* 218:250 */     int i1 = paramwv.b(paramFloat);
/* 219:251 */     if (paramwv.au()) {
/* 220:252 */       i1 = 15728880;
/* 221:    */     }
/* 222:254 */     int i2 = i1 % 65536;
/* 223:255 */     int i3 = i1 / 65536;
/* 224:256 */     dax.glMultiTexCoord2f(dax.q, i2 / 1.0F, i3 / 1.0F);
/* 225:257 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 226:    */     
/* 227:259 */     return a(paramwv, d1 - this.o, d2 - this.p, d3 - this.q, f1, paramFloat, paramBoolean);
/* 228:    */   }
/* 229:    */   
/* 230:262 */   private boolean t = false;
/* 231:    */   
/* 232:    */   public void b(Entity paramwv, float paramFloat)
/* 233:    */   {
/* 234:265 */     double d1 = paramwv.P + (paramwv.xPos - paramwv.P) * paramFloat;
/* 235:266 */     double d2 = paramwv.Q + (paramwv.yPos - paramwv.Q) * paramFloat;
/* 236:267 */     double d3 = paramwv.R + (paramwv.zPos - paramwv.R) * paramFloat;
/* 237:    */     
/* 238:269 */     cpu localcpu = a(paramwv);
/* 239:270 */     if ((localcpu != null) && (this.a != null))
/* 240:    */     {
/* 241:271 */       int i1 = paramwv.b(paramFloat);
/* 242:272 */       int i2 = i1 % 65536;
/* 243:273 */       int i3 = i1 / 65536;
/* 244:274 */       dax.glMultiTexCoord2f(dax.q, i2 / 1.0F, i3 / 1.0F);
/* 245:275 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 246:276 */       localcpu.a(paramwv, d1 - this.o, d2 - this.p, d3 - this.q);
/* 247:    */     }
/* 248:    */   }
/* 249:    */   
/* 250:    */   public boolean a(Entity paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 251:    */   {
/* 252:281 */     return a(paramwv, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2, false);
/* 253:    */   }
/* 254:    */   
/* 255:    */   public boolean a(Entity paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, boolean paramBoolean)
/* 256:    */   {
/* 257:285 */     cpu localcpu = null;
/* 258:    */     try
/* 259:    */     {
/* 260:288 */       localcpu = a(paramwv);
/* 261:289 */       if ((localcpu != null) && (this.a != null))
/* 262:    */       {
/* 263:    */         try
/* 264:    */         {
/* 265:291 */           if ((localcpu instanceof cqv)) {
/* 266:292 */             ((cqv)localcpu).a(this.r);
/* 267:    */           }
/* 268:294 */           localcpu.a(paramwv, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 269:    */         }
/* 270:    */         catch (Throwable localThrowable1)
/* 271:    */         {
/* 272:296 */           throw new u(net.minecraft.src.b.a(localThrowable1, "Rendering entity in world"));
/* 273:    */         }
/* 274:    */         try
/* 275:    */         {
/* 276:300 */           if (!this.r) {
/* 277:301 */             localcpu.b(paramwv, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 278:    */           }
/* 279:    */         }
/* 280:    */         catch (Throwable localThrowable2)
/* 281:    */         {
/* 282:304 */           throw new u(net.minecraft.src.b.a(localThrowable2, "Post-rendering entity in world"));
/* 283:    */         }
/* 284:307 */         if ((this.t) && (!paramwv.ay()) && (!paramBoolean)) {
/* 285:    */           try
/* 286:    */           {
/* 287:309 */             b(paramwv, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 288:    */           }
/* 289:    */           catch (Throwable localThrowable3)
/* 290:    */           {
/* 291:311 */             throw new u(net.minecraft.src.b.a(localThrowable3, "Rendering entity hitbox in world"));
/* 292:    */           }
/* 293:    */         }
/* 294:    */       }
/* 295:314 */       else if (this.a != null)
/* 296:    */       {
/* 297:315 */         return false;
/* 298:    */       }
/* 299:    */     }
/* 300:    */     catch (Throwable localThrowable4)
/* 301:    */     {
/* 302:318 */       b localb = net.minecraft.src.b.a(localThrowable4, "Rendering entity in world");
/* 303:319 */       j localj1 = localb.a("Entity being rendered");
/* 304:320 */       paramwv.a(localj1);
/* 305:    */       
/* 306:322 */       j localj2 = localb.a("Renderer details");
/* 307:323 */       localj2.a("Assigned renderer", localcpu);
/* 308:324 */       localj2.a("Location", net.minecraft.src.j.a(paramDouble1, paramDouble2, paramDouble3));
/* 309:325 */       localj2.a("Rotation", Float.valueOf(paramFloat1));
/* 310:326 */       localj2.a("Delta", Float.valueOf(paramFloat2));
/* 311:    */       
/* 312:328 */       throw new u(localb);
/* 313:    */     }
/* 314:330 */     return true;
/* 315:    */   }
/* 316:    */   
/* 317:    */   private void b(Entity paramwv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 318:    */   {
/* 319:334 */     cjm.a(false);
/* 320:335 */     cjm.x();
/* 321:336 */     cjm.disableLighting();
/* 322:337 */     cjm.p();
/* 323:338 */     cjm.disableBlend();
/* 324:    */     
/* 325:340 */     float f1 = paramwv.J / 2.0F;
/* 326:341 */     AABB localbrt1 = paramwv.getAABB();
/* 327:342 */     AABB localbrt2 = new AABB(localbrt1.minX - paramwv.xPos + paramDouble1, localbrt1.minY - paramwv.yPos + paramDouble2, localbrt1.minZ - paramwv.zPos + paramDouble3, localbrt1.maxX - paramwv.xPos + paramDouble1, localbrt1.maxY - paramwv.yPos + paramDouble2, localbrt1.maxZ - paramwv.zPos + paramDouble3);
/* 328:343 */     ckn.a(localbrt2, 16777215);
/* 329:344 */     if ((paramwv instanceof EntityLiving))
/* 330:    */     {
/* 331:345 */       float f2 = 0.01F;
/* 332:346 */       ckn.a(new AABB(paramDouble1 - f1, paramDouble2 + paramwv.aR() - 0.009999999776482582D, paramDouble3 - f1, paramDouble1 + f1, paramDouble2 + paramwv.aR() + 0.009999999776482582D, paramDouble3 + f1), 16711680);
/* 333:    */     }
/* 334:349 */     ckx localckx = ckx.getInstance();
/* 335:350 */     VertexBuffer localciv = localckx.getBuffer();
/* 336:    */     
/* 337:352 */     Vec3 localbrw = paramwv.d(paramFloat2);
/* 338:353 */     localciv.a(3);
/* 339:354 */     localciv.setColor(255);
/* 340:355 */     localciv.addVertex(paramDouble1, paramDouble2 + paramwv.aR(), paramDouble3);
/* 341:356 */     localciv.addVertex(paramDouble1 + localbrw.x * 2.0D, paramDouble2 + paramwv.aR() + localbrw.y * 2.0D, paramDouble3 + localbrw.z * 2.0D);
/* 342:357 */     localckx.draw();
/* 343:    */     
/* 344:359 */     cjm.w();
/* 345:360 */     cjm.enableLighting();
/* 346:361 */     cjm.o();
/* 347:362 */     cjm.disableBlend();
/* 348:363 */     cjm.a(true);
/* 349:    */   }
/* 350:    */   
/* 351:    */   public void a(World paramaqu)
/* 352:    */   {
/* 353:367 */     this.b = paramaqu;
/* 354:    */   }
/* 355:    */   
/* 356:    */   public double b(double paramDouble1, double paramDouble2, double paramDouble3)
/* 357:    */   {
/* 358:371 */     double d1 = paramDouble1 - this.h;
/* 359:372 */     double d2 = paramDouble2 - this.i;
/* 360:373 */     double d3 = paramDouble3 - this.j;
/* 361:374 */     return d1 * d1 + d2 * d2 + d3 * d3;
/* 362:    */   }
/* 363:    */   
/* 364:    */   public bty c()
/* 365:    */   {
/* 366:378 */     return this.n;
/* 367:    */   }
/* 368:    */   
/* 369:    */   public void c(boolean paramBoolean)
/* 370:    */   {
/* 371:382 */     this.r = paramBoolean;
/* 372:    */   }
/* 373:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cpt
 * JD-Core Version:    0.7.0.1
 */
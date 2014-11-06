package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.nio.FloatBuffer;
/*   3:    */ import java.util.List;
/*   4:    */ import org.apache.logging.log4j.LogManager;
/*   5:    */ import org.apache.logging.log4j.Logger;
/*   6:    */ import org.lwjgl.opengl.GL11;
/*   7:    */ 
/*   8:    */ public abstract class cqv<T extends EntityLiving>
/*   9:    */   extends cpu<T>
/*  10:    */ {
/*  11: 31 */   private static final Logger a = LogManager.getLogger();
/*  12: 34 */   private static final ctp e = new ctp(16, 16);
/*  13:    */   protected ccq f;
/*  14: 37 */   protected FloatBuffer g = bst.h(4);
/*  15: 39 */   protected List<csq> h = Lists.newArrayList();
/*  16: 41 */   protected boolean i = false;
/*  17:    */   
/*  18:    */   static
/*  19:    */   {
/*  20: 44 */     int[] arrayOfInt = e.e();
/*  21: 45 */     for (int j = 0; j < 256; j++) {
/*  22: 46 */       arrayOfInt[j] = -1;
/*  23:    */     }
/*  24: 48 */     e.d();
/*  25:    */   }
/*  26:    */   
/*  27:    */   public cqv(cpt paramcpt, ccq paramccq, float paramFloat)
/*  28:    */   {
/*  29: 52 */     super(paramcpt);
/*  30: 53 */     this.f = paramccq;
/*  31: 54 */     this.c = paramFloat;
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected boolean a(csq paramcsq)
/*  35:    */   {
/*  36: 60 */     return this.h.add(paramcsq);
/*  37:    */   }
/*  38:    */   
/*  39:    */   protected boolean b(csq paramcsq)
/*  40:    */   {
/*  41: 66 */     return this.h.remove(paramcsq);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public ccq b()
/*  45:    */   {
/*  46: 70 */     return this.f;
/*  47:    */   }
/*  48:    */   
/*  49:    */   protected float a(float paramFloat1, float paramFloat2, float paramFloat3)
/*  50:    */   {
/*  51: 74 */     float f1 = paramFloat2 - paramFloat1;
/*  52: 75 */     while (f1 < -180.0F) {
/*  53: 76 */       f1 += 360.0F;
/*  54:    */     }
/*  55: 78 */     while (f1 >= 180.0F) {
/*  56: 79 */       f1 -= 360.0F;
/*  57:    */     }
/*  58: 81 */     return paramFloat1 + paramFloat3 * f1;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void a(T paramxm, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  62:    */   {
/*  63: 89 */     cjm.glPushMatrix();
/*  64: 90 */     cjm.p();
/*  65:    */     
/*  66:    */ 
/*  67: 93 */     this.f.p = d(paramxm, paramFloat2);
/*  68: 94 */     this.f.q = paramxm.av();
/*  69: 95 */     this.f.r = paramxm.i_();
/*  70:    */     try
/*  71:    */     {
/*  72: 98 */       float f1 = a(paramxm.aH, paramxm.aG, paramFloat2);
/*  73: 99 */       float f2 = a(paramxm.aJ, paramxm.aI, paramFloat2);
/*  74:100 */       float f3 = f2 - f1;
/*  75:103 */       if ((paramxm.av()) && ((paramxm.vehicle instanceof EntityLiving)))
/*  76:    */       {
/*  77:104 */         EntityLiving localxm = (EntityLiving)paramxm.vehicle;
/*  78:105 */         f1 = a(localxm.aH, localxm.aG, paramFloat2);
/*  79:    */         
/*  80:107 */         f3 = f2 - f1;
/*  81:108 */         float f5 = MathUtils.wrapDegrees(f3);
/*  82:109 */         if (f5 < -85.0F) {
/*  83:110 */           f5 = -85.0F;
/*  84:    */         }
/*  85:112 */         if (f5 >= 85.0F) {
/*  86:113 */           f5 = 85.0F;
/*  87:    */         }
/*  88:115 */         f1 = f2 - f5;
/*  89:116 */         if (f5 * f5 > 2500.0F) {
/*  90:117 */           f1 += f5 * 0.2F;
/*  91:    */         }
/*  92:    */       }
/*  93:121 */       float f4 = paramxm.lastPitch + (paramxm.pitch - paramxm.lastPitch) * paramFloat2;
/*  94:    */       
/*  95:123 */       cqv_a(paramxm, paramDouble1, paramDouble2, paramDouble3);
/*  96:    */       
/*  97:125 */       float f5 = b(paramxm, paramFloat2);
/*  98:126 */       a(paramxm, f5, f1, paramFloat2);
/*  99:    */       
/* 100:    */ 
/* 101:    */ 
/* 102:130 */       cjm.B();
/* 103:131 */       cjm.glScalef(-1.0F, -1.0F, 1.0F);
/* 104:132 */       a(paramxm, paramFloat2);
/* 105:    */       
/* 106:134 */       float f6 = 0.0625F;
/* 107:    */       
/* 108:136 */       cjm.glTranslatef(0.0F, -1.507813F, 0.0F);
/* 109:    */       
/* 110:    */ 
/* 111:139 */       float f7 = paramxm.ay + (paramxm.az - paramxm.ay) * paramFloat2;
/* 112:140 */       float f8 = paramxm.aA - paramxm.az * (1.0F - paramFloat2);
/* 113:141 */       if (paramxm.i_()) {
/* 114:142 */         f8 *= 3.0F;
/* 115:    */       }
/* 116:145 */       if (f7 > 1.0F) {
/* 117:146 */         f7 = 1.0F;
/* 118:    */       }
/* 119:149 */       cjm.enableAlphaTest();
/* 120:    */       
/* 121:151 */       this.f.a(paramxm, f8, f7, paramFloat2);
/* 122:152 */       this.f.a(f8, f7, f5, f3, f4, 0.0625F, paramxm);
/* 123:    */       boolean bool;
/* 124:154 */       if (this.i)
/* 125:    */       {
/* 126:155 */         bool = c(paramxm);
/* 127:156 */         a(paramxm, f8, f7, f5, f3, f4, 0.0625F);
/* 128:157 */         if (bool) {
/* 129:158 */           e();
/* 130:    */         }
/* 131:    */       }
/* 132:    */       else
/* 133:    */       {
/* 134:161 */         bool = c(paramxm, paramFloat2);
/* 135:162 */         a(paramxm, f8, f7, f5, f3, f4, 0.0625F);
/* 136:163 */         if (bool) {
/* 137:164 */           f();
/* 138:    */         }
/* 139:167 */         cjm.a(true);
/* 140:169 */         if ((!(paramxm instanceof EntityPlayer)) || (!((EntityPlayer)paramxm).v())) {
/* 141:170 */           a(paramxm, f8, f7, paramFloat2, f5, f3, f4, 0.0625F);
/* 142:    */         }
/* 143:    */       }
/* 144:174 */       cjm.C();
/* 145:    */     }
/* 146:    */     catch (Exception localException)
/* 147:    */     {
/* 148:176 */       a.error("Couldn't render entity", localException);
/* 149:    */     }
/* 150:178 */     cjm.g(dax.q);
/* 151:179 */     cjm.w();
/* 152:180 */     cjm.g(dax.p);
/* 153:181 */     cjm.o();
/* 154:    */     
/* 155:183 */     cjm.glPopMatrix();
/* 156:185 */     if (!this.i) {
/* 157:186 */       super.a(paramxm, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 158:    */     }
/* 159:    */   }
/* 160:    */   
/* 161:    */   protected boolean c(T paramxm)
/* 162:    */   {
/* 163:191 */     int j = 16777215;
/* 164:192 */     if ((paramxm instanceof EntityPlayer))
/* 165:    */     {
/* 166:193 */       brz localbrz = (brz)paramxm.bN();
/* 167:194 */       if (localbrz != null)
/* 168:    */       {
/* 169:195 */         String str = bty.b(localbrz.e());
/* 170:196 */         if (str.length() >= 2) {
/* 171:197 */           j = c().b(str.charAt(1));
/* 172:    */         }
/* 173:    */       }
/* 174:    */     }
/* 175:201 */     float f1 = (j >> 16 & 0xFF) / 255.0F;
/* 176:202 */     float f2 = (j >> 8 & 0xFF) / 255.0F;
/* 177:203 */     float f3 = (j & 0xFF) / 255.0F;
/* 178:204 */     cjm.disableLighting();
/* 179:205 */     cjm.g(dax.p);
/* 180:206 */     cjm.c(f1, f2, f3, 1.0F);
/* 181:207 */     cjm.x();
/* 182:208 */     cjm.g(dax.q);
/* 183:209 */     cjm.x();
/* 184:210 */     cjm.g(dax.p);
/* 185:211 */     return true;
/* 186:    */   }
/* 187:    */   
/* 188:    */   protected void e()
/* 189:    */   {
/* 190:215 */     cjm.enableLighting();
/* 191:216 */     cjm.g(dax.p);
/* 192:217 */     cjm.w();
/* 193:218 */     cjm.g(dax.q);
/* 194:219 */     cjm.w();
/* 195:220 */     cjm.g(dax.p);
/* 196:    */   }
/* 197:    */   
/* 198:    */   protected void a(T paramxm, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 199:    */   {
/* 200:224 */     int j = !paramxm.ay() ? 1 : 0;
/* 201:225 */     int k = (j == 0) && (!paramxm.f(bsu.z().h)) ? 1 : 0;
/* 202:227 */     if ((j != 0) || (k != 0))
/* 203:    */     {
/* 204:228 */       if (!c(paramxm)) {
/* 205:229 */         return;
/* 206:    */       }
/* 207:231 */       if (k != 0)
/* 208:    */       {
/* 209:232 */         cjm.glPushMatrix();
/* 210:233 */         cjm.c(1.0F, 1.0F, 1.0F, 0.15F);
/* 211:234 */         cjm.a(false);
/* 212:235 */         cjm.enableBlend();
/* 213:236 */         cjm.glBlendFunc(770, 771);
/* 214:237 */         cjm.glAlphaFunc(516, 0.003921569F);
/* 215:    */       }
/* 216:239 */       this.f.a(paramxm, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 217:241 */       if (k != 0)
/* 218:    */       {
/* 219:242 */         cjm.disableBlend();
/* 220:243 */         cjm.glAlphaFunc(516, 0.1F);
/* 221:244 */         cjm.glPopMatrix();
/* 222:245 */         cjm.a(true);
/* 223:    */       }
/* 224:    */     }
/* 225:    */   }
/* 226:    */   
/* 227:    */   protected boolean c(T paramxm, float paramFloat)
/* 228:    */   {
/* 229:251 */     return a(paramxm, paramFloat, true);
/* 230:    */   }
/* 231:    */   
/* 232:    */   protected boolean a(T paramxm, float paramFloat, boolean paramBoolean)
/* 233:    */   {
/* 234:255 */     float f1 = paramxm.c(paramFloat);
/* 235:256 */     int j = a(paramxm, f1, paramFloat);
/* 236:257 */     int k = (j >> 24 & 0xFF) > 0 ? 1 : 0;
/* 237:258 */     int m = (paramxm.hurtTime > 0) || (paramxm.deathTime > 0) ? 1 : 0;
/* 238:260 */     if ((k != 0) || (m != 0))
/* 239:    */     {
/* 240:261 */       if ((k == 0) && (!paramBoolean)) {
/* 241:262 */         return false;
/* 242:    */       }
/* 243:265 */       cjm.g(dax.p);
/* 244:266 */       cjm.w();
/* 245:267 */       GL11.glTexEnvi(8960, 8704, dax.s);
/* 246:268 */       GL11.glTexEnvi(8960, dax.x, 8448);
/* 247:269 */       GL11.glTexEnvi(8960, dax.y, dax.p);
/* 248:270 */       GL11.glTexEnvi(8960, dax.z, dax.u);
/* 249:271 */       GL11.glTexEnvi(8960, dax.B, 768);
/* 250:272 */       GL11.glTexEnvi(8960, dax.C, 768);
/* 251:    */       
/* 252:274 */       GL11.glTexEnvi(8960, dax.E, 7681);
/* 253:275 */       GL11.glTexEnvi(8960, dax.F, dax.p);
/* 254:276 */       GL11.glTexEnvi(8960, dax.I, 770);
/* 255:    */       
/* 256:278 */       cjm.g(dax.q);
/* 257:279 */       cjm.w();
/* 258:280 */       GL11.glTexEnvi(8960, 8704, dax.s);
/* 259:281 */       GL11.glTexEnvi(8960, dax.x, dax.t);
/* 260:282 */       GL11.glTexEnvi(8960, dax.y, dax.v);
/* 261:283 */       GL11.glTexEnvi(8960, dax.z, dax.w);
/* 262:284 */       GL11.glTexEnvi(8960, dax.A, dax.v);
/* 263:285 */       GL11.glTexEnvi(8960, dax.B, 768);
/* 264:286 */       GL11.glTexEnvi(8960, dax.C, 768);
/* 265:287 */       GL11.glTexEnvi(8960, dax.D, 770);
/* 266:    */       
/* 267:289 */       GL11.glTexEnvi(8960, dax.E, 7681);
/* 268:290 */       GL11.glTexEnvi(8960, dax.F, dax.w);
/* 269:291 */       GL11.glTexEnvi(8960, dax.I, 770);
/* 270:    */       
/* 271:293 */       this.g.position(0);
/* 272:294 */       if (m != 0)
/* 273:    */       {
/* 274:295 */         this.g.put(1.0F);
/* 275:296 */         this.g.put(0.0F);
/* 276:297 */         this.g.put(0.0F);
/* 277:298 */         this.g.put(0.3F);
/* 278:    */       }
/* 279:    */       else
/* 280:    */       {
/* 281:300 */         float f2 = (j >> 24 & 0xFF) / 255.0F;
/* 282:301 */         float f3 = (j >> 16 & 0xFF) / 255.0F;
/* 283:302 */         float f4 = (j >> 8 & 0xFF) / 255.0F;
/* 284:303 */         float f5 = (j & 0xFF) / 255.0F;
/* 285:    */         
/* 286:305 */         this.g.put(f3);
/* 287:306 */         this.g.put(f4);
/* 288:307 */         this.g.put(f5);
/* 289:308 */         this.g.put(1.0F - f2);
/* 290:    */       }
/* 291:310 */       this.g.flip();
/* 292:311 */       GL11.glTexEnv(8960, 8705, this.g);
/* 293:    */       
/* 294:313 */       cjm.g(dax.r);
/* 295:314 */       cjm.w();
/* 296:315 */       cjm.i(e.b());
/* 297:316 */       GL11.glTexEnvi(8960, 8704, dax.s);
/* 298:317 */       GL11.glTexEnvi(8960, dax.x, 8448);
/* 299:318 */       GL11.glTexEnvi(8960, dax.y, dax.w);
/* 300:319 */       GL11.glTexEnvi(8960, dax.z, dax.q);
/* 301:320 */       GL11.glTexEnvi(8960, dax.B, 768);
/* 302:321 */       GL11.glTexEnvi(8960, dax.C, 768);
/* 303:    */       
/* 304:323 */       GL11.glTexEnvi(8960, dax.E, 7681);
/* 305:324 */       GL11.glTexEnvi(8960, dax.F, dax.w);
/* 306:325 */       GL11.glTexEnvi(8960, dax.I, 770);
/* 307:    */       
/* 308:327 */       cjm.g(dax.p);
/* 309:328 */       return true;
/* 310:    */     }
/* 311:330 */     return false;
/* 312:    */   }
/* 313:    */   
/* 314:    */   protected void f()
/* 315:    */   {
/* 316:334 */     cjm.g(dax.p);
/* 317:335 */     cjm.w();
/* 318:336 */     GL11.glTexEnvi(8960, 8704, dax.s);
/* 319:337 */     GL11.glTexEnvi(8960, dax.x, 8448);
/* 320:338 */     GL11.glTexEnvi(8960, dax.y, dax.p);
/* 321:339 */     GL11.glTexEnvi(8960, dax.z, dax.u);
/* 322:340 */     GL11.glTexEnvi(8960, dax.B, 768);
/* 323:341 */     GL11.glTexEnvi(8960, dax.C, 768);
/* 324:    */     
/* 325:343 */     GL11.glTexEnvi(8960, dax.E, 8448);
/* 326:344 */     GL11.glTexEnvi(8960, dax.F, dax.p);
/* 327:345 */     GL11.glTexEnvi(8960, dax.G, dax.u);
/* 328:346 */     GL11.glTexEnvi(8960, dax.I, 770);
/* 329:347 */     GL11.glTexEnvi(8960, dax.J, 770);
/* 330:    */     
/* 331:349 */     cjm.g(dax.q);
/* 332:350 */     GL11.glTexEnvi(8960, 8704, dax.s);
/* 333:351 */     GL11.glTexEnvi(8960, dax.x, 8448);
/* 334:352 */     GL11.glTexEnvi(8960, dax.B, 768);
/* 335:353 */     GL11.glTexEnvi(8960, dax.C, 768);
/* 336:354 */     GL11.glTexEnvi(8960, dax.y, 5890);
/* 337:355 */     GL11.glTexEnvi(8960, dax.z, dax.w);
/* 338:356 */     GL11.glTexEnvi(8960, dax.E, 8448);
/* 339:357 */     GL11.glTexEnvi(8960, dax.I, 770);
/* 340:358 */     GL11.glTexEnvi(8960, dax.F, 5890);
/* 341:359 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 342:    */     
/* 343:361 */     cjm.g(dax.r);
/* 344:362 */     cjm.x();
/* 345:363 */     cjm.i(0);
/* 346:364 */     GL11.glTexEnvi(8960, 8704, dax.s);
/* 347:365 */     GL11.glTexEnvi(8960, dax.x, 8448);
/* 348:366 */     GL11.glTexEnvi(8960, dax.B, 768);
/* 349:367 */     GL11.glTexEnvi(8960, dax.C, 768);
/* 350:368 */     GL11.glTexEnvi(8960, dax.y, 5890);
/* 351:369 */     GL11.glTexEnvi(8960, dax.z, dax.w);
/* 352:370 */     GL11.glTexEnvi(8960, dax.E, 8448);
/* 353:371 */     GL11.glTexEnvi(8960, dax.I, 770);
/* 354:372 */     GL11.glTexEnvi(8960, dax.F, 5890);
/* 355:373 */     cjm.g(dax.p);
/* 356:    */   }
/* 357:    */   
/* 358:    */   protected void cqv_a(T paramxm, double paramDouble1, double paramDouble2, double paramDouble3)
/* 359:    */   {
/* 360:377 */     cjm.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 361:    */   }
/* 362:    */   
/* 363:    */   protected void a(T paramxm, float paramFloat1, float paramFloat2, float paramFloat3)
/* 364:    */   {
/* 365:381 */     cjm.glRotatef(180.0F - paramFloat2, 0.0F, 1.0F, 0.0F);
/* 366:382 */     if (paramxm.deathTime > 0)
/* 367:    */     {
/* 368:383 */       float f1 = (paramxm.deathTime + paramFloat3 - 1.0F) / 20.0F * 1.6F;
/* 369:384 */       f1 = MathUtils.sqrt(f1);
/* 370:385 */       if (f1 > 1.0F) {
/* 371:386 */         f1 = 1.0F;
/* 372:    */       }
/* 373:388 */       cjm.glRotatef(f1 * cqv_b(paramxm), 0.0F, 0.0F, 1.0F);
/* 374:    */     }
/* 375:    */     else
/* 376:    */     {
/* 377:390 */       String str = net.minecraft.src.a.a(paramxm.getName());
/* 378:391 */       if ((str != null) && ((str.equals("Dinnerbone")) || (str.equals("Grumm"))) && (
/* 379:392 */         (!(paramxm instanceof EntityPlayer)) || (((EntityPlayer)paramxm).a(ahh.a))))
/* 380:    */       {
/* 381:393 */         cjm.glTranslatef(0.0F, paramxm.K + 0.1F, 0.0F);
/* 382:394 */         cjm.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/* 383:    */       }
/* 384:    */     }
/* 385:    */   }
/* 386:    */   
/* 387:    */   protected float d(T paramxm, float paramFloat)
/* 388:    */   {
/* 389:401 */     return paramxm.k(paramFloat);
/* 390:    */   }
/* 391:    */   
/* 392:    */   protected float b(T paramxm, float paramFloat)
/* 393:    */   {
/* 394:405 */     return paramxm.W + paramFloat;
/* 395:    */   }
/* 396:    */   
/* 397:    */   protected void a(T paramxm, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 398:    */   {
/* 399:409 */     for (csq localcsq : this.h)
/* 400:    */     {
/* 401:410 */       boolean bool = a(paramxm, paramFloat3, localcsq.b());
/* 402:411 */       localcsq.a(paramxm, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
/* 403:412 */       if (bool) {
/* 404:413 */         f();
/* 405:    */       }
/* 406:    */     }
/* 407:    */   }
/* 408:    */   
/* 409:    */   protected float cqv_b(T paramxm)
/* 410:    */   {
/* 411:419 */     return 90.0F;
/* 412:    */   }
/* 413:    */   
/* 414:    */   protected int a(T paramxm, float paramFloat1, float paramFloat2)
/* 415:    */   {
/* 416:423 */     return 0;
/* 417:    */   }
/* 418:    */   
/* 419:    */   public void a(T paramxm, double paramDouble1, double paramDouble2, double paramDouble3)
/* 420:    */   {
/* 421:431 */     if (!b(paramxm)) {
/* 422:432 */       return;
/* 423:    */     }
/* 424:435 */     double d = paramxm.h(this.b.c);
/* 425:436 */     float f1 = paramxm.aw() ? 32.0F : 64.0F;
/* 426:437 */     if (d >= f1 * f1) {
/* 427:438 */       return;
/* 428:    */     }
/* 429:441 */     String str = paramxm.e_().d();
/* 430:442 */     float f2 = 0.02666667F;
/* 431:    */     
/* 432:444 */     cjm.glAlphaFunc(516, 0.1F);
/* 433:445 */     if (paramxm.aw())
/* 434:    */     {
/* 435:446 */       bty localbty = c();
/* 436:447 */       cjm.glPushMatrix();
/* 437:    */       
/* 438:449 */       cjm.glTranslatef((float)paramDouble1, (float)paramDouble2 + paramxm.K + 0.5F - (paramxm.i_() ? paramxm.K / 2.0F : 0.0F), (float)paramDouble3);
/* 439:450 */       GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/* 440:    */       
/* 441:452 */       cjm.glRotatef(-this.b.e, 0.0F, 1.0F, 0.0F);
/* 442:453 */       cjm.glRotatef(this.b.f, 1.0F, 0.0F, 0.0F);
/* 443:    */       
/* 444:455 */       cjm.glScalef(-0.02666667F, -0.02666667F, 0.02666667F);
/* 445:456 */       cjm.glTranslatef(0.0F, 9.374999F, 0.0F);
/* 446:    */       
/* 447:458 */       cjm.disableLighting();
/* 448:459 */       cjm.a(false);
/* 449:460 */       cjm.enableBlend();
/* 450:461 */       cjm.x();
/* 451:    */       
/* 452:463 */       cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 453:    */       
/* 454:465 */       ckx localckx = ckx.getInstance();
/* 455:466 */       VertexBuffer localciv = localckx.getBuffer();
/* 456:467 */       localciv.begin();
/* 457:468 */       int j = localbty.a(str) / 2;
/* 458:469 */       localciv.setColor(0.0F, 0.0F, 0.0F, 0.25F);
/* 459:470 */       localciv.addVertex(-j - 1, -1.0D, 0.0D);
/* 460:471 */       localciv.addVertex(-j - 1, 8.0D, 0.0D);
/* 461:472 */       localciv.addVertex(j + 1, 8.0D, 0.0D);
/* 462:473 */       localciv.addVertex(j + 1, -1.0D, 0.0D);
/* 463:474 */       localckx.draw();
/* 464:    */       
/* 465:476 */       cjm.w();
/* 466:477 */       cjm.a(true);
/* 467:478 */       localbty.a(str, -localbty.a(str) / 2, 0, 553648127);
/* 468:479 */       cjm.enableLighting();
/* 469:480 */       cjm.disableBlend();
/* 470:    */       
/* 471:482 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 472:    */       
/* 473:484 */       cjm.glPopMatrix();
/* 474:    */     }
/* 475:    */     else
/* 476:    */     {
/* 477:486 */       a(paramxm, paramDouble1, paramDouble2 - (paramxm.i_() ? paramxm.K / 2.0F : 0.0D), paramDouble3, str, 0.02666667F, d);
/* 478:    */     }
/* 479:    */   }
/* 480:    */   
/* 481:    */   protected boolean b(T paramxm)
/* 482:    */   {
/* 483:492 */     cio localcio = bsu.z().h;
/* 484:493 */     if (((paramxm instanceof EntityPlayer)) && (paramxm != localcio))
/* 485:    */     {
/* 486:494 */       bsf localbsf1 = paramxm.bN();
/* 487:495 */       bsf localbsf2 = localcio.bN();
/* 488:496 */       if (localbsf1 != null)
/* 489:    */       {
/* 490:497 */         bsg localbsg = localbsf1.i();
/* 491:498 */         switch (cqw.a[localbsg.ordinal()])
/* 492:    */         {
/* 493:    */         case 1: 
/* 494:500 */           return true;
/* 495:    */         case 2: 
/* 496:502 */           return false;
/* 497:    */         case 3: 
/* 498:504 */           return (localbsf2 == null) || (localbsf1.a(localbsf2));
/* 499:    */         case 4: 
/* 500:506 */           return (localbsf2 == null) || (!localbsf1.a(localbsf2));
/* 501:    */         }
/* 502:510 */         return true;
/* 503:    */       }
/* 504:    */     }
/* 505:513 */     return (bsu.u()) && (paramxm != this.b.c) && (!paramxm.f(localcio)) && (paramxm.rider == null);
/* 506:    */   }
/* 507:    */   
/* 508:    */   public void a(boolean paramBoolean)
/* 509:    */   {
/* 510:517 */     this.i = paramBoolean;
/* 511:    */   }
/* 512:    */   
/* 513:    */   public void B_() {}
/* 514:    */   
/* 515:    */   protected void a(T paramxm, float paramFloat) {}
/* 516:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cqv
 * JD-Core Version:    0.7.0.1
 */
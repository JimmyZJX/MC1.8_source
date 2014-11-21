package net.minecraft.src;
/*   1:    */ import org.lwjgl.opengl.GL11;
/*   2:    */ 
/*   3:    */ public class cki
/*   4:    */ {
/*   5: 29 */   private static final oa a = new oa("textures/map/map_background.png");
/*   6: 30 */   private static final oa b = new oa("textures/misc/underwater.png");
/*   7:    */   private final bsu c;
/*   8:    */   private ItemStack d;
/*   9:    */   private float e;
/*  10:    */   private float f;
/*  11:    */   private final cpt g;
/*  12:    */   private final cqh h;
/*  13:    */   
/*  14:    */   public cki(bsu parambsu)
/*  15:    */   {
/*  16:216 */     this.c = parambsu;
/*  17:217 */     this.g = parambsu.ae();
/*  18:218 */     this.h = parambsu.af();
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(EntityLiving paramxm, ItemStack paramamj, cmz paramcmz)
/*  22:    */   {
/*  23:222 */     if (paramamj == null) {
/*  24:223 */       return;
/*  25:    */     }
/*  26:226 */     Item localalq = paramamj.getItem();
/*  27:227 */     ProtoBlock localatr = ProtoBlock.a(localalq);
/*  28:    */     
/*  29:229 */     cjm.glPushMatrix();
/*  30:231 */     if (this.h.a(paramamj))
/*  31:    */     {
/*  32:232 */       cjm.glScalef(2.0F, 2.0F, 2.0F);
/*  33:234 */       if (a(localatr)) {
/*  34:235 */         cjm.a(false);
/*  35:    */       }
/*  36:    */     }
/*  37:240 */     this.h.a(paramamj, paramxm, paramcmz);
/*  38:242 */     if (a(localatr)) {
/*  39:243 */       cjm.a(true);
/*  40:    */     }
/*  41:246 */     cjm.glPopMatrix();
/*  42:    */   }
/*  43:    */   
/*  44:    */   private boolean a(ProtoBlock paramatr)
/*  45:    */   {
/*  46:250 */     return (paramatr != null) && (paramatr.k() == aql.d);
/*  47:    */   }
/*  48:    */   
/*  49:    */   private void a(float paramFloat1, float paramFloat2)
/*  50:    */   {
/*  51:254 */     cjm.glPushMatrix();
/*  52:255 */     cjm.glRotatef(paramFloat1, 1.0F, 0.0F, 0.0F);
/*  53:256 */     cjm.glRotatef(paramFloat2, 0.0F, 1.0F, 0.0F);
/*  54:257 */     bss.b();
/*  55:258 */     cjm.glPopMatrix();
/*  56:    */   }
/*  57:    */   
/*  58:    */   private void a(cil paramcil)
/*  59:    */   {
/*  60:262 */     int j = this.c.f.b(new BlockPosition(paramcil.xPos, paramcil.yPos + paramcil.aR(), paramcil.zPos), 0);
/*  61:263 */     float f1 = j & 0xFFFF;
/*  62:264 */     float f2 = j >> 16;
/*  63:265 */     dax.glMultiTexCoord2f(dax.q, f1, f2);
/*  64:    */   }
/*  65:    */   
/*  66:    */   private void a(cio paramcio, float paramFloat)
/*  67:    */   {
/*  68:269 */     float f1 = paramcio.i + (paramcio.g - paramcio.i) * paramFloat;
/*  69:270 */     float f2 = paramcio.h + (paramcio.f - paramcio.h) * paramFloat;
/*  70:271 */     cjm.glRotatef((paramcio.pitch - f1) * 0.1F, 1.0F, 0.0F, 0.0F);
/*  71:272 */     cjm.glRotatef((paramcio.yaw - f2) * 0.1F, 0.0F, 1.0F, 0.0F);
/*  72:    */   }
/*  73:    */   
/*  74:    */   private float c(float paramFloat)
/*  75:    */   {
/*  76:276 */     float f1 = 1.0F - paramFloat / 45.0F + 0.1F;
/*  77:277 */     f1 = MathUtils.clamp(f1, 0.0F, 1.0F);
/*  78:278 */     f1 = -MathUtils.cos(f1 * 3.141593F) * 0.5F + 0.5F;
/*  79:279 */     return f1;
/*  80:    */   }
/*  81:    */   
/*  82:    */   private void a(ctc paramctc)
/*  83:    */   {
/*  84:283 */     cjm.glPushMatrix();
/*  85:284 */     cjm.glRotatef(54.0F, 0.0F, 1.0F, 0.0F);
/*  86:285 */     cjm.glRotatef(64.0F, 1.0F, 0.0F, 0.0F);
/*  87:286 */     cjm.glRotatef(-62.0F, 0.0F, 0.0F, 1.0F);
/*  88:287 */     cjm.glTranslatef(0.25F, -0.85F, 0.75F);
/*  89:288 */     paramctc.b(this.c.h);
/*  90:289 */     cjm.glPopMatrix();
/*  91:    */   }
/*  92:    */   
/*  93:    */   private void b(ctc paramctc)
/*  94:    */   {
/*  95:293 */     cjm.glPushMatrix();
/*  96:294 */     cjm.glRotatef(92.0F, 0.0F, 1.0F, 0.0F);
/*  97:295 */     cjm.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
/*  98:296 */     cjm.glRotatef(41.0F, 0.0F, 0.0F, 1.0F);
/*  99:297 */     cjm.glTranslatef(-0.3F, -1.1F, 0.45F);
/* 100:298 */     paramctc.c(this.c.h);
/* 101:299 */     cjm.glPopMatrix();
/* 102:    */   }
/* 103:    */   
/* 104:    */   private void b(cil paramcil)
/* 105:    */   {
/* 106:304 */     this.c.N().a(paramcil.i());
/* 107:305 */     cpu localcpu = this.g.a(this.c.h);
/* 108:306 */     ctc localctc = (ctc)localcpu;
/* 109:309 */     if (!paramcil.ay())
/* 110:    */     {
/* 111:310 */       a(localctc);
/* 112:311 */       b(localctc);
/* 113:    */     }
/* 114:    */   }
/* 115:    */   
/* 116:    */   private void a(cil paramcil, float paramFloat1, float paramFloat2, float paramFloat3)
/* 117:    */   {
/* 118:316 */     float f1 = -0.4F * MathUtils.sin(MathUtils.sqrt(paramFloat3) * 3.141593F);
/* 119:317 */     float f2 = 0.2F * MathUtils.sin(MathUtils.sqrt(paramFloat3) * 3.141593F * 2.0F);
/* 120:318 */     float f3 = -0.2F * MathUtils.sin(paramFloat3 * 3.141593F);
/* 121:319 */     cjm.glTranslatef(f1, f2, f3);
/* 122:    */     
/* 123:321 */     float f4 = c(paramFloat1);
/* 124:    */     
/* 125:323 */     cjm.glTranslatef(0.0F, 0.04F, -0.72F);
/* 126:324 */     cjm.glTranslatef(0.0F, paramFloat2 * -1.2F, 0.0F);
/* 127:325 */     cjm.glTranslatef(0.0F, f4 * -0.5F, 0.0F);
/* 128:    */     
/* 129:327 */     cjm.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 130:328 */     cjm.glRotatef(f4 * -85.0F, 0.0F, 0.0F, 1.0F);
/* 131:329 */     cjm.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
/* 132:    */     
/* 133:331 */     b(paramcil);
/* 134:    */     
/* 135:333 */     float f5 = MathUtils.sin(paramFloat3 * paramFloat3 * 3.141593F);
/* 136:334 */     float f6 = MathUtils.sin(MathUtils.sqrt(paramFloat3) * 3.141593F);
/* 137:335 */     cjm.glRotatef(f5 * -20.0F, 0.0F, 1.0F, 0.0F);
/* 138:336 */     cjm.glRotatef(f6 * -20.0F, 0.0F, 0.0F, 1.0F);
/* 139:337 */     cjm.glRotatef(f6 * -80.0F, 1.0F, 0.0F, 0.0F);
/* 140:    */     
/* 141:339 */     cjm.glScalef(0.38F, 0.38F, 0.38F);
/* 142:    */     
/* 143:341 */     cjm.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 144:342 */     cjm.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/* 145:343 */     cjm.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
/* 146:    */     
/* 147:345 */     cjm.glTranslatef(-1.0F, -1.0F, 0.0F);
/* 148:    */     
/* 149:347 */     cjm.glScalef(0.015625F, 0.015625F, 0.015625F);
/* 150:    */     
/* 151:349 */     this.c.N().a(a);
/* 152:350 */     ckx localckx = ckx.getInstance();
/* 153:351 */     VertexBuffer localciv = localckx.getBuffer();
/* 154:    */     
/* 155:353 */     GL11.glNormal3f(0.0F, 0.0F, -1.0F);
/* 156:    */     
/* 157:    */ 
/* 158:356 */     localciv.begin();
/* 159:357 */     localciv.addVertexWithUV(-7.0D, 135.0D, 0.0D, 0.0D, 1.0D);
/* 160:358 */     localciv.addVertexWithUV(135.0D, 135.0D, 0.0D, 1.0D, 1.0D);
/* 161:359 */     localciv.addVertexWithUV(135.0D, -7.0D, 0.0D, 1.0D, 0.0D);
/* 162:360 */     localciv.addVertexWithUV(-7.0D, -7.0D, 0.0D, 0.0D, 0.0D);
/* 163:361 */     localckx.draw();
/* 164:    */     
/* 165:363 */     MapInfo localbqe = ItemList.filledMap.a(this.d, this.c.f);
/* 166:364 */     if (localbqe != null) {
/* 167:365 */       this.c.o.k().a(localbqe, false);
/* 168:    */     }
/* 169:    */   }
/* 170:    */   
/* 171:    */   private void a(cil paramcil, float paramFloat1, float paramFloat2)
/* 172:    */   {
/* 173:370 */     float f1 = -0.3F * MathUtils.sin(MathUtils.sqrt(paramFloat2) * 3.141593F);
/* 174:371 */     float f2 = 0.4F * MathUtils.sin(MathUtils.sqrt(paramFloat2) * 3.141593F * 2.0F);
/* 175:372 */     float f3 = -0.4F * MathUtils.sin(paramFloat2 * 3.141593F);
/* 176:373 */     cjm.glTranslatef(f1, f2, f3);
/* 177:374 */     cjm.glTranslatef(0.6400001F, -0.6F, -0.72F);
/* 178:375 */     cjm.glTranslatef(0.0F, paramFloat1 * -0.6F, 0.0F);
/* 179:    */     
/* 180:377 */     cjm.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 181:    */     
/* 182:379 */     float f4 = MathUtils.sin(paramFloat2 * paramFloat2 * 3.141593F);
/* 183:380 */     float f5 = MathUtils.sin(MathUtils.sqrt(paramFloat2) * 3.141593F);
/* 184:381 */     cjm.glRotatef(f5 * 70.0F, 0.0F, 1.0F, 0.0F);
/* 185:382 */     cjm.glRotatef(f4 * -20.0F, 0.0F, 0.0F, 1.0F);
/* 186:    */     
/* 187:    */ 
/* 188:385 */     this.c.N().a(paramcil.i());
/* 189:386 */     cjm.glTranslatef(-1.0F, 3.6F, 3.5F);
/* 190:387 */     cjm.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
/* 191:388 */     cjm.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
/* 192:389 */     cjm.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
/* 193:390 */     cjm.glScalef(1.0F, 1.0F, 1.0F);
/* 194:391 */     cjm.glTranslatef(5.6F, 0.0F, 0.0F);
/* 195:    */     
/* 196:393 */     cpu localcpu = this.g.a(this.c.h);
/* 197:394 */     ctc localctc = (ctc)localcpu;
/* 198:395 */     localctc.b(this.c.h);
/* 199:    */   }
/* 200:    */   
/* 201:    */   private void d(float paramFloat)
/* 202:    */   {
/* 203:399 */     float f1 = -0.4F * MathUtils.sin(MathUtils.sqrt(paramFloat) * 3.141593F);
/* 204:400 */     float f2 = 0.2F * MathUtils.sin(MathUtils.sqrt(paramFloat) * 3.141593F * 2.0F);
/* 205:401 */     float f3 = -0.2F * MathUtils.sin(paramFloat * 3.141593F);
/* 206:402 */     cjm.glTranslatef(f1, f2, f3);
/* 207:    */   }
/* 208:    */   
/* 209:    */   private void a(cil paramcil, float paramFloat)
/* 210:    */   {
/* 211:406 */     float f1 = paramcil.bQ() - paramFloat + 1.0F;
/* 212:407 */     float f2 = f1 / this.d.l();
/* 213:    */     
/* 214:409 */     float f3 = MathUtils.abs(MathUtils.cos(f1 / 4.0F * 3.141593F) * 0.1F);
/* 215:410 */     if (f2 >= 0.8F) {
/* 216:411 */       f3 = 0.0F;
/* 217:    */     }
/* 218:413 */     cjm.glTranslatef(0.0F, f3, 0.0F);
/* 219:    */     
/* 220:415 */     float f4 = 1.0F - (float)Math.pow(f2, 27.0D);
/* 221:    */     
/* 222:417 */     cjm.glTranslatef(f4 * 0.6F, f4 * -0.5F, f4 * 0.0F);
/* 223:    */     
/* 224:419 */     cjm.glRotatef(f4 * 90.0F, 0.0F, 1.0F, 0.0F);
/* 225:420 */     cjm.glRotatef(f4 * 10.0F, 1.0F, 0.0F, 0.0F);
/* 226:421 */     cjm.glRotatef(f4 * 30.0F, 0.0F, 0.0F, 1.0F);
/* 227:    */   }
/* 228:    */   
/* 229:    */   private void b(float paramFloat1, float paramFloat2)
/* 230:    */   {
/* 231:425 */     cjm.glTranslatef(0.56F, -0.52F, -0.72F);
/* 232:426 */     cjm.glTranslatef(0.0F, paramFloat1 * -0.6F, 0.0F);
/* 233:    */     
/* 234:428 */     cjm.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 235:    */     
/* 236:430 */     float f1 = MathUtils.sin(paramFloat2 * paramFloat2 * 3.141593F);
/* 237:431 */     float f2 = MathUtils.sin(MathUtils.sqrt(paramFloat2) * 3.141593F);
/* 238:432 */     cjm.glRotatef(f1 * -20.0F, 0.0F, 1.0F, 0.0F);
/* 239:433 */     cjm.glRotatef(f2 * -20.0F, 0.0F, 0.0F, 1.0F);
/* 240:434 */     cjm.glRotatef(f2 * -80.0F, 1.0F, 0.0F, 0.0F);
/* 241:    */     
/* 242:436 */     cjm.glScalef(0.4F, 0.4F, 0.4F);
/* 243:    */   }
/* 244:    */   
/* 245:    */   private void a(float paramFloat, cil paramcil)
/* 246:    */   {
/* 247:440 */     cjm.glRotatef(-18.0F, 0.0F, 0.0F, 1.0F);
/* 248:441 */     cjm.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
/* 249:442 */     cjm.glRotatef(-8.0F, 1.0F, 0.0F, 0.0F);
/* 250:443 */     cjm.glTranslatef(-0.9F, 0.2F, 0.0F);
/* 251:    */     
/* 252:445 */     float f1 = this.d.l() - (paramcil.bQ() - paramFloat + 1.0F);
/* 253:446 */     float f2 = f1 / 20.0F;
/* 254:447 */     f2 = (f2 * f2 + f2 * 2.0F) / 3.0F;
/* 255:448 */     if (f2 > 1.0F) {
/* 256:449 */       f2 = 1.0F;
/* 257:    */     }
/* 258:451 */     if (f2 > 0.1F)
/* 259:    */     {
/* 260:452 */       float f3 = MathUtils.sin((f1 - 0.1F) * 1.3F);
/* 261:453 */       float f4 = f2 - 0.1F;
/* 262:454 */       float f5 = f3 * f4;
/* 263:455 */       cjm.glTranslatef(f5 * 0.0F, f5 * 0.01F, f5 * 0.0F);
/* 264:    */     }
/* 265:457 */     cjm.glTranslatef(f2 * 0.0F, f2 * 0.0F, f2 * 0.1F);
/* 266:    */     
/* 267:459 */     cjm.glScalef(1.0F, 1.0F, 1.0F + f2 * 0.2F);
/* 268:    */   }
/* 269:    */   
/* 270:    */   private void d()
/* 271:    */   {
/* 272:463 */     cjm.glTranslatef(-0.5F, 0.2F, 0.0F);
/* 273:464 */     cjm.glRotatef(30.0F, 0.0F, 1.0F, 0.0F);
/* 274:465 */     cjm.glRotatef(-80.0F, 1.0F, 0.0F, 0.0F);
/* 275:466 */     cjm.glRotatef(60.0F, 0.0F, 1.0F, 0.0F);
/* 276:    */   }
/* 277:    */   
/* 278:    */   public void a(float paramFloat)
/* 279:    */   {
/* 280:470 */     float f1 = 1.0F - (this.f + (this.e - this.f) * paramFloat);
/* 281:471 */     cio localcio = this.c.h;
/* 282:    */     
/* 283:473 */     float f2 = localcio.k(paramFloat);
/* 284:474 */     float f3 = localcio.lastPitch + (localcio.pitch - localcio.lastPitch) * paramFloat;
/* 285:475 */     float f4 = localcio.lastYaw + (localcio.yaw - localcio.lastYaw) * paramFloat;
/* 286:    */     
/* 287:477 */     a(f3, f4);
/* 288:478 */     a(localcio);
/* 289:    */     
/* 290:480 */     a((cio)localcio, paramFloat);
/* 291:    */     
/* 292:482 */     cjm.B();
/* 293:    */     
/* 294:484 */     cjm.glPushMatrix();
/* 295:486 */     if (this.d != null)
/* 296:    */     {
/* 297:487 */       if (this.d.getItem() == ItemList.filledMap)
/* 298:    */       {
/* 299:488 */         a(localcio, f3, f1, f2);
/* 300:    */       }
/* 301:489 */       else if (localcio.bQ() > 0)
/* 302:    */       {
/* 303:490 */         ano localano = this.d.m();
/* 304:491 */         switch (ckj.a[localano.ordinal()])
/* 305:    */         {
/* 306:    */         case 1: 
/* 307:493 */           b(f1, 0.0F);
/* 308:494 */           break;
/* 309:    */         case 2: 
/* 310:    */         case 3: 
/* 311:497 */           a(localcio, paramFloat);
/* 312:498 */           b(f1, 0.0F);
/* 313:499 */           break;
/* 314:    */         case 4: 
/* 315:501 */           b(f1, 0.0F);
/* 316:502 */           d();
/* 317:503 */           break;
/* 318:    */         case 5: 
/* 319:505 */           b(f1, 0.0F);
/* 320:506 */           a(paramFloat, localcio);
/* 321:    */         }
/* 322:    */       }
/* 323:    */       else
/* 324:    */       {
/* 325:510 */         d(f2);
/* 326:511 */         b(f1, f2);
/* 327:    */       }
/* 328:514 */       a(localcio, this.d, cmz.FIRST_PERSON);
/* 329:    */     }
/* 330:515 */     else if (!localcio.ay())
/* 331:    */     {
/* 332:516 */       a(localcio, f1, f2);
/* 333:    */     }
/* 334:518 */     cjm.glPopMatrix();
/* 335:    */     
/* 336:520 */     cjm.C();
/* 337:521 */     bss.a();
/* 338:    */   }
/* 339:    */   
/* 340:    */   public void b(float paramFloat)
/* 341:    */   {
/* 342:    */     
/* 343:527 */     if (this.c.h.aj())
/* 344:    */     {
/* 345:528 */       Object localObject = this.c.f.getBlock(new BlockPosition(this.c.h));
/* 346:    */       
/* 347:530 */       cio localcio = this.c.h;
/* 348:531 */       for (int j = 0; j < 8; j++)
/* 349:    */       {
/* 350:532 */         double d1 = localcio.xPos + ((j >> 0) % 2 - 0.5F) * localcio.width * 0.8F;
/* 351:533 */         double d2 = localcio.yPos + ((j >> 1) % 2 - 0.5F) * 0.1F;
/* 352:534 */         double d3 = localcio.zPos + ((j >> 2) % 2 - 0.5F) * localcio.width * 0.8F;
/* 353:    */         
/* 354:536 */         BlockPosition localdt = new BlockPosition(d1, d2 + localcio.aR(), d3);
/* 355:537 */         Block localbec = this.c.f.getBlock(localdt);
/* 356:539 */         if (localbec.getProto().u()) {
/* 357:540 */           localObject = localbec;
/* 358:    */         }
/* 359:    */       }
/* 360:544 */       if (((Block)localObject).getProto().b() != -1) {
/* 361:545 */         a(paramFloat, this.c.ab().a().a((Block)localObject));
/* 362:    */       }
/* 363:    */     }
/* 364:549 */     if (!this.c.h.v())
/* 365:    */     {
/* 366:550 */       if (this.c.h.a(Material.water)) {
/* 367:551 */         e(paramFloat);
/* 368:    */       }
/* 369:554 */       if (this.c.h.au()) {
/* 370:555 */         f(paramFloat);
/* 371:    */       }
/* 372:    */     }
/* 373:559 */     cjm.enableAlphaTest();
/* 374:    */   }
/* 375:    */   
/* 376:    */   private void a(float paramFloat, cue paramcue)
/* 377:    */   {
/* 378:563 */     this.c.N().a(cua.g);
/* 379:    */     
/* 380:565 */     ckx localckx = ckx.getInstance();
/* 381:566 */     VertexBuffer localciv = localckx.getBuffer();
/* 382:    */     
/* 383:568 */     float f1 = 0.1F;
/* 384:569 */     cjm.c(f1, f1, f1, 0.5F);
/* 385:    */     
/* 386:571 */     cjm.glPushMatrix();
/* 387:    */     
/* 388:573 */     float f2 = -1.0F;
/* 389:574 */     float f3 = 1.0F;
/* 390:575 */     float f4 = -1.0F;
/* 391:576 */     float f5 = 1.0F;
/* 392:577 */     float f6 = -0.5F;
/* 393:    */     
/* 394:579 */     float f7 = paramcue.e();
/* 395:580 */     float f8 = paramcue.f();
/* 396:581 */     float f9 = paramcue.g();
/* 397:582 */     float f10 = paramcue.h();
/* 398:    */     
/* 399:584 */     localciv.begin();
/* 400:585 */     localciv.addVertexWithUV(f2, f4, f6, f8, f10);
/* 401:586 */     localciv.addVertexWithUV(f3, f4, f6, f7, f10);
/* 402:587 */     localciv.addVertexWithUV(f3, f5, f6, f7, f9);
/* 403:588 */     localciv.addVertexWithUV(f2, f5, f6, f8, f9);
/* 404:589 */     localckx.draw();
/* 405:590 */     cjm.glPopMatrix();
/* 406:    */     
/* 407:592 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 408:    */   }
/* 409:    */   
/* 410:    */   private void e(float paramFloat)
/* 411:    */   {
/* 412:596 */     this.c.N().a(b);
/* 413:    */     
/* 414:598 */     ckx localckx = ckx.getInstance();
/* 415:599 */     VertexBuffer localciv = localckx.getBuffer();
/* 416:    */     
/* 417:601 */     float f1 = this.c.h.c(paramFloat);
/* 418:602 */     cjm.c(f1, f1, f1, 0.5F);
/* 419:603 */     cjm.enableBlend();
/* 420:604 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 421:    */     
/* 422:606 */     cjm.glPushMatrix();
/* 423:    */     
/* 424:608 */     float f2 = 4.0F;
/* 425:    */     
/* 426:610 */     float f3 = -1.0F;
/* 427:611 */     float f4 = 1.0F;
/* 428:612 */     float f5 = -1.0F;
/* 429:613 */     float f6 = 1.0F;
/* 430:614 */     float f7 = -0.5F;
/* 431:    */     
/* 432:616 */     float f8 = -this.c.h.yaw / 64.0F;
/* 433:617 */     float f9 = this.c.h.pitch / 64.0F;
/* 434:    */     
/* 435:619 */     localciv.begin();
/* 436:620 */     localciv.addVertexWithUV(f3, f5, f7, f2 + f8, f2 + f9);
/* 437:621 */     localciv.addVertexWithUV(f4, f5, f7, 0.0F + f8, f2 + f9);
/* 438:622 */     localciv.addVertexWithUV(f4, f6, f7, 0.0F + f8, 0.0F + f9);
/* 439:623 */     localciv.addVertexWithUV(f3, f6, f7, f2 + f8, 0.0F + f9);
/* 440:624 */     localckx.draw();
/* 441:625 */     cjm.glPopMatrix();
/* 442:    */     
/* 443:627 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 444:628 */     cjm.disableBlend();
/* 445:    */   }
/* 446:    */   
/* 447:    */   private void f(float paramFloat)
/* 448:    */   {
/* 449:632 */     ckx localckx = ckx.getInstance();
/* 450:633 */     VertexBuffer localciv = localckx.getBuffer();
/* 451:634 */     cjm.c(1.0F, 1.0F, 1.0F, 0.9F);
/* 452:635 */     cjm.c(519);
/* 453:636 */     cjm.a(false);
/* 454:637 */     cjm.enableBlend();
/* 455:638 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 456:    */     
/* 457:640 */     float f1 = 1.0F;
/* 458:641 */     for (int j = 0; j < 2; j++)
/* 459:    */     {
/* 460:642 */       cjm.glPushMatrix();
/* 461:    */       
/* 462:644 */       cue localcue = this.c.R().a("minecraft:blocks/fire_layer_1");
/* 463:645 */       this.c.N().a(cua.g);
/* 464:    */       
/* 465:647 */       float f2 = localcue.e();
/* 466:648 */       float f3 = localcue.f();
/* 467:649 */       float f4 = localcue.g();
/* 468:650 */       float f5 = localcue.h();
/* 469:    */       
/* 470:652 */       float f6 = (0.0F - f1) / 2.0F;
/* 471:653 */       float f7 = f6 + f1;
/* 472:654 */       float f8 = 0.0F - f1 / 2.0F;
/* 473:655 */       float f9 = f8 + f1;
/* 474:656 */       float f10 = -0.5F;
/* 475:657 */       cjm.glTranslatef(-(j * 2 - 1) * 0.24F, -0.3F, 0.0F);
/* 476:658 */       cjm.glRotatef((j * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
/* 477:    */       
/* 478:660 */       localciv.begin();
/* 479:661 */       localciv.addVertexWithUV(f6, f8, f10, f3, f5);
/* 480:662 */       localciv.addVertexWithUV(f7, f8, f10, f2, f5);
/* 481:663 */       localciv.addVertexWithUV(f7, f9, f10, f2, f4);
/* 482:664 */       localciv.addVertexWithUV(f6, f9, f10, f3, f4);
/* 483:665 */       localckx.draw();
/* 484:666 */       cjm.glPopMatrix();
/* 485:    */     }
/* 486:668 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 487:669 */     cjm.disableBlend();
/* 488:670 */     cjm.a(true);
/* 489:671 */     cjm.c(515);
/* 490:    */   }
/* 491:    */   
/* 492:674 */   private int i = -1;
/* 493:    */   
/* 494:    */   public void a()
/* 495:    */   {
/* 496:678 */     this.f = this.e;
/* 497:    */     
/* 498:680 */     cio localcio = this.c.h;
/* 499:681 */     ItemStack localamj = localcio.bg.h();
/* 500:    */     
/* 501:683 */     int j = 0;
/* 502:684 */     if ((this.d != null) && (localamj != null))
/* 503:    */     {
/* 504:685 */       if (!this.d.c(localamj)) {
/* 505:686 */         j = 1;
/* 506:    */       }
/* 507:    */     }
/* 508:688 */     else if ((this.d == null) && (localamj == null)) {
/* 509:689 */       j = 0;
/* 510:    */     } else {
/* 511:691 */       j = 1;
/* 512:    */     }
/* 513:694 */     float f1 = 0.4F;
/* 514:695 */     float f2 = j != 0 ? 0.0F : 1.0F;
/* 515:696 */     float f3 = MathUtils.clamp(f2 - this.e, -f1, f1);
/* 516:    */     
/* 517:698 */     this.e += f3;
/* 518:700 */     if (this.e < 0.1F)
/* 519:    */     {
/* 520:701 */       this.d = localamj;
/* 521:702 */       this.i = localcio.bg.c;
/* 522:    */     }
/* 523:    */   }
/* 524:    */   
/* 525:    */   public void b()
/* 526:    */   {
/* 527:707 */     this.e = 0.0F;
/* 528:    */   }
/* 529:    */   
/* 530:    */   public void c()
/* 531:    */   {
/* 532:711 */     this.e = 0.0F;
/* 533:    */   }
/* 534:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cki
 * JD-Core Version:    0.7.0.1
 */
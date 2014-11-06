package net.minecraft.src;
/*   1:    */ import java.nio.FloatBuffer;
/*   2:    */ import org.lwjgl.opengl.GL11;
/*   3:    */ 
/*   4:    */ public class cjm
/*   5:    */ {
/*   6: 14 */   private static cjo a = new cjo(null);
/*   7: 16 */   private static GLOption optionLighting = new GLOption(GL11.GL_LIGHTING);
/*   8: 17 */   private static GLOption[] c = new GLOption[8];
/*   9: 19 */   private static cjv d = new cjv(null);
/*  10: 21 */   private static cjp e = new cjp(null);
/*  11: 22 */   private static cjx f = new cjx(null);
/*  12: 23 */   private static cjy g = new cjy(null);
/*  13: 24 */   private static cjw h = new cjw(null);
/*  14: 25 */   private static cjz i = new cjz(null);
/*  15: 26 */   private static cjt j = new cjt(null);
/*  16: 27 */   private static cke k = new cke(null);
/*  17: 28 */   private static cjr l = new cjr(null);
/*  18: 29 */   private static ckb m = new ckb(null);
/*  19: 31 */   private static GLOption n = new GLOption(GL11.GL_NORMALIZE);
/*  20: 33 */   private static int o = 0;
/*  21: 34 */   private static ckf[] p = new ckf[8];
/*  22: 36 */   private static int q = 7425;
/*  23: 37 */   private static GLOption r = new GLOption(32826);
/*  24: 39 */   private static cju s = new cju(null);
/*  25: 41 */   private static cjs t = new cjs();
/*  26: 43 */   private static ckg u = new ckg(null);
/*  27:    */   
/*  28:    */   public static void a()
/*  29:    */   {
/*  30: 48 */     GL11.glPushAttrib(8256);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public static void b() {GL11.glPopAttrib();}
/*  34:    */   
/*  35:    */   public static void disableAlphaTest()
/*  36:    */   {
/*  37: 60 */     a.optionAlphaTest.disable();
/*  38:    */   }
/*  39:    */   
/*  40:    */   public static void enableAlphaTest()
/*  41:    */   {
/*  42: 64 */     a.optionAlphaTest.enable();
/*  43:    */   }
/*  44:    */   
/*  45:    */   public static void glAlphaFunc(int paramInt, float paramFloat)
/*  46:    */   {
/*  47: 68 */     if ((paramInt != a.b) || (paramFloat != a.c))
/*  48:    */     {
/*  49: 69 */       a.b = paramInt;
/*  50: 70 */       a.c = paramFloat;
/*  51: 71 */       GL11.glAlphaFunc(paramInt, paramFloat);
/*  52:    */     }
/*  53:    */   }
/*  54:    */   
/*  55:    */   public static void enableLighting()
/*  56:    */   {
/*  57: 80 */     optionLighting.enable();
/*  58:    */   }
/*  59:    */   
/*  60:    */   public static void disableLighting()
/*  61:    */   {
/*  62: 84 */     optionLighting.disable();
/*  63:    */   }
/*  64:    */   
/*  65:    */   public static void a(int paramInt)
/*  66:    */   {
/*  67: 88 */     c[paramInt].enable();
/*  68:    */   }
/*  69:    */   
/*  70:    */   public static void b(int paramInt)
/*  71:    */   {
/*  72: 92 */     c[paramInt].disable();
/*  73:    */   }
/*  74:    */   
/*  75:    */   public static void g()
/*  76:    */   {
/*  77:100 */     d.a.enable();
/*  78:    */   }
/*  79:    */   
/*  80:    */   public static void h()
/*  81:    */   {
/*  82:104 */     d.a.disable();
/*  83:    */   }
/*  84:    */   
/*  85:    */   public static void a(int paramInt1, int paramInt2)
/*  86:    */   {
/*  87:108 */     if ((paramInt1 != d.b) || (paramInt2 != d.c))
/*  88:    */     {
/*  89:109 */       d.b = paramInt1;
/*  90:110 */       d.c = paramInt2;
/*  91:111 */       GL11.glColorMaterial(paramInt1, paramInt2);
/*  92:    */     }
/*  93:    */   }
/*  94:    */   
/*  95:    */   public static void i()
/*  96:    */   {
/*  97:120 */     f.a.disable();
/*  98:    */   }
/*  99:    */   
/* 100:    */   public static void j()
/* 101:    */   {
/* 102:124 */     f.a.enable();
/* 103:    */   }
/* 104:    */   
/* 105:    */   public static void c(int paramInt)
/* 106:    */   {
/* 107:128 */     if (paramInt != f.c)
/* 108:    */     {
/* 109:129 */       f.c = paramInt;
/* 110:130 */       GL11.glDepthFunc(paramInt);
/* 111:    */     }
/* 112:    */   }
/* 113:    */   
/* 114:    */   public static void a(boolean paramBoolean)
/* 115:    */   {
/* 116:135 */     if (paramBoolean != f.b)
/* 117:    */     {
/* 118:136 */       f.b = paramBoolean;
/* 119:137 */       GL11.glDepthMask(paramBoolean);
/* 120:    */     }
/* 121:    */   }
/* 122:    */   
/* 123:    */   public static void disableBlend()
/* 124:    */   {
/* 125:146 */     e.optionBlend.disable();
/* 126:    */   }
/* 127:    */   
/* 128:    */   public static void enableBlend()
/* 129:    */   {
/* 130:150 */     e.optionBlend.enable();
/* 131:    */   }
/* 132:    */   
/* 133:    */   public static void glBlendFunc(int paramInt1, int paramInt2)
/* 134:    */   {
/* 135:154 */     if ((paramInt1 != e.b) || (paramInt2 != e.c))
/* 136:    */     {
/* 137:155 */       e.b = paramInt1;
/* 138:156 */       e.c = paramInt2;
/* 139:157 */       GL11.glBlendFunc(paramInt1, paramInt2);
/* 140:    */     }
/* 141:    */   }
/* 142:    */   
/* 143:    */   public static void glBlendFuncSeparate(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 144:    */   {
/* 145:162 */     if ((paramInt1 != e.b) || (paramInt2 != e.c) || (paramInt3 != e.d) || (paramInt4 != e.e))
/* 146:    */     {
/* 147:163 */       e.b = paramInt1;
/* 148:164 */       e.c = paramInt2;
/* 149:165 */       e.d = paramInt3;
/* 150:166 */       e.e = paramInt4;
/* 151:167 */       dax.glBlendFuncSeparate(paramInt1, paramInt2, paramInt3, paramInt4);
/* 152:    */     }
/* 153:    */   }
/* 154:    */   
/* 155:    */   public static void m()
/* 156:    */   {
/* 157:176 */     g.a.enable();
/* 158:    */   }
/* 159:    */   
/* 160:    */   public static void n()
/* 161:    */   {
/* 162:180 */     g.a.disable();
/* 163:    */   }
/* 164:    */   
/* 165:    */   public static void d(int paramInt)
/* 166:    */   {
/* 167:184 */     if (paramInt != g.b)
/* 168:    */     {
/* 169:185 */       g.b = paramInt;
/* 170:186 */       GL11.glFogi(2917, paramInt);
/* 171:    */     }
/* 172:    */   }
/* 173:    */   
/* 174:    */   public static void a(float paramFloat)
/* 175:    */   {
/* 176:191 */     if (paramFloat != g.c)
/* 177:    */     {
/* 178:192 */       g.c = paramFloat;
/* 179:193 */       GL11.glFogf(2914, paramFloat);
/* 180:    */     }
/* 181:    */   }
/* 182:    */   
/* 183:    */   public static void b(float paramFloat)
/* 184:    */   {
/* 185:198 */     if (paramFloat != g.d)
/* 186:    */     {
/* 187:199 */       g.d = paramFloat;
/* 188:200 */       GL11.glFogf(2915, paramFloat);
/* 189:    */     }
/* 190:    */   }
/* 191:    */   
/* 192:    */   public static void c(float paramFloat)
/* 193:    */   {
/* 194:205 */     if (paramFloat != g.e)
/* 195:    */     {
/* 196:206 */       g.e = paramFloat;
/* 197:207 */       GL11.glFogf(2916, paramFloat);
/* 198:    */     }
/* 199:    */   }
/* 200:    */   
/* 201:    */   public static void o()
/* 202:    */   {
/* 203:216 */     h.a.enable();
/* 204:    */   }
/* 205:    */   
/* 206:    */   public static void p()
/* 207:    */   {
/* 208:220 */     h.a.disable();
/* 209:    */   }
/* 210:    */   
/* 211:    */   public static void e(int paramInt)
/* 212:    */   {
/* 213:224 */     if (paramInt != h.b)
/* 214:    */     {
/* 215:225 */       h.b = paramInt;
/* 216:226 */       GL11.glCullFace(paramInt);
/* 217:    */     }
/* 218:    */   }
/* 219:    */   
/* 220:    */   public static void q()
/* 221:    */   {
/* 222:235 */     i.a.enable();
/* 223:    */   }
/* 224:    */   
/* 225:    */   public static void r()
/* 226:    */   {
/* 227:239 */     i.a.disable();
/* 228:    */   }
/* 229:    */   
/* 230:    */   public static void a(float paramFloat1, float paramFloat2)
/* 231:    */   {
/* 232:251 */     if ((paramFloat1 != i.c) || (paramFloat2 != i.d))
/* 233:    */     {
/* 234:252 */       i.c = paramFloat1;
/* 235:253 */       i.d = paramFloat2;
/* 236:254 */       GL11.glPolygonOffset(paramFloat1, paramFloat2);
/* 237:    */     }
/* 238:    */   }
/* 239:    */   
/* 240:    */   public static void u()
/* 241:    */   {
/* 242:263 */     j.a.enable();
/* 243:    */   }
/* 244:    */   
/* 245:    */   public static void v()
/* 246:    */   {
/* 247:267 */     j.a.disable();
/* 248:    */   }
/* 249:    */   
/* 250:    */   public static void f(int paramInt)
/* 251:    */   {
/* 252:271 */     if (paramInt != j.b)
/* 253:    */     {
/* 254:272 */       j.b = paramInt;
/* 255:273 */       GL11.glLogicOp(paramInt);
/* 256:    */     }
/* 257:    */   }
/* 258:    */   
/* 259:    */   public static void a(ckc paramckc)
/* 260:    */   {
/* 261:282 */     c(paramckc).a.enable();
/* 262:    */   }
/* 263:    */   
/* 264:    */   public static void b(ckc paramckc)
/* 265:    */   {
/* 266:286 */     c(paramckc).a.disable();
/* 267:    */   }
/* 268:    */   
/* 269:    */   public static void a(ckc paramckc, int paramInt)
/* 270:    */   {
/* 271:290 */     ckd localckd = c(paramckc);
/* 272:291 */     if (paramInt != localckd.c)
/* 273:    */     {
/* 274:292 */       localckd.c = paramInt;
/* 275:293 */       GL11.glTexGeni(localckd.b, 9472, paramInt);
/* 276:    */     }
/* 277:    */   }
/* 278:    */   
/* 279:    */   public static void a(ckc paramckc, int paramInt, FloatBuffer paramFloatBuffer)
/* 280:    */   {
/* 281:298 */     GL11.glTexGen(c(paramckc).b, paramInt, paramFloatBuffer);
/* 282:    */   }
/* 283:    */   
/* 284:    */   private static ckd c(ckc paramckc)
/* 285:    */   {
/* 286:302 */     switch (cjn.a[paramckc.ordinal()])
/* 287:    */     {
/* 288:    */     case 1: 
/* 289:304 */       return k.a;
/* 290:    */     case 2: 
/* 291:306 */       return k.b;
/* 292:    */     case 3: 
/* 293:308 */       return k.c;
/* 294:    */     case 4: 
/* 295:310 */       return k.d;
/* 296:    */     }
/* 297:312 */     return k.a;
/* 298:    */   }
/* 299:    */   
/* 300:    */   public static void g(int paramInt)
/* 301:    */   {
/* 302:320 */     if (o != paramInt - dax.p)
/* 303:    */     {
/* 304:321 */       o = paramInt - dax.p;
/* 305:322 */       dax.k(paramInt);
/* 306:    */     }
/* 307:    */   }
/* 308:    */   
/* 309:    */   public static void w()
/* 310:    */   {
/* 311:327 */     p[o].a.enable();
/* 312:    */   }
/* 313:    */   
/* 314:    */   public static void x()
/* 315:    */   {
/* 316:331 */     p[o].a.disable();
/* 317:    */   }
/* 318:    */   
/* 319:    */   public static int y()
/* 320:    */   {
/* 321:335 */     return GL11.glGenTextures();
/* 322:    */   }
/* 323:    */   
/* 324:    */   public static void h(int paramInt)
/* 325:    */   {
/* 326:339 */     GL11.glDeleteTextures(paramInt);
/* 327:340 */     for (ckf localckf : p) {
/* 328:341 */       if (localckf.b == paramInt) {
/* 329:342 */         localckf.b = -1;
/* 330:    */       }
/* 331:    */     }
/* 332:    */   }
/* 333:    */   
/* 334:    */   public static void i(int paramInt)
/* 335:    */   {
/* 336:348 */     if (paramInt != p[o].b)
/* 337:    */     {
/* 338:349 */       p[o].b = paramInt;
/* 339:350 */       GL11.glBindTexture(3553, paramInt);
/* 340:    */     }
/* 341:    */   }
/* 342:    */   
/* 343:    */   public static void z()
/* 344:    */   {
/* 345:359 */     n.enable();
/* 346:    */   }
/* 347:    */   
/* 348:    */   public static void A()
/* 349:    */   {
/* 350:363 */     n.disable();
/* 351:    */   }
/* 352:    */   
/* 353:    */   public static void j(int paramInt)
/* 354:    */   {
/* 355:367 */     if (paramInt != q)
/* 356:    */     {
/* 357:368 */       q = paramInt;
/* 358:369 */       GL11.glShadeModel(paramInt);
/* 359:    */     }
/* 360:    */   }
/* 361:    */   
/* 362:    */   public static void B()
/* 363:    */   {
/* 364:374 */     r.enable();
/* 365:    */   }
/* 366:    */   
/* 367:    */   public static void C()
/* 368:    */   {
/* 369:378 */     r.disable();
/* 370:    */   }
/* 371:    */   
/* 372:    */   public static void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 373:    */   {
/* 374:382 */     if ((paramInt1 != u.a) || (paramInt2 != u.b) || (paramInt3 != u.c) || (paramInt4 != u.d))
/* 375:    */     {
/* 376:383 */       u.a = paramInt1;
/* 377:384 */       u.b = paramInt2;
/* 378:385 */       u.c = paramInt3;
/* 379:386 */       u.d = paramInt4;
/* 380:387 */       GL11.glViewport(paramInt1, paramInt2, paramInt3, paramInt4);
/* 381:    */     }
/* 382:    */   }
/* 383:    */   
/* 384:    */   public static void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
/* 385:    */   {
/* 386:396 */     if ((paramBoolean1 != s.a) || (paramBoolean2 != s.b) || (paramBoolean3 != s.c) || (paramBoolean4 != s.d))
/* 387:    */     {
/* 388:397 */       s.a = paramBoolean1;
/* 389:398 */       s.b = paramBoolean2;
/* 390:399 */       s.c = paramBoolean3;
/* 391:400 */       s.d = paramBoolean4;
/* 392:401 */       GL11.glColorMask(paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4);
/* 393:    */     }
/* 394:    */   }
/* 395:    */   
/* 396:    */   public static void a(double paramDouble)
/* 397:    */   {
/* 398:439 */     if (paramDouble != l.a)
/* 399:    */     {
/* 400:440 */       l.a = paramDouble;
/* 401:441 */       GL11.glClearDepth(paramDouble);
/* 402:    */     }
/* 403:    */   }
/* 404:    */   
/* 405:    */   public static void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/* 406:    */   {
/* 407:446 */     if ((paramFloat1 != l.b.a) || (paramFloat2 != l.b.b) || (paramFloat3 != l.b.c) || (paramFloat4 != l.b.d))
/* 408:    */     {
/* 409:447 */       l.b.a = paramFloat1;
/* 410:448 */       l.b.b = paramFloat2;
/* 411:449 */       l.b.c = paramFloat3;
/* 412:450 */       l.b.d = paramFloat4;
/* 413:451 */       GL11.glClearColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/* 414:    */     }
/* 415:    */   }
/* 416:    */   
/* 417:    */   public static void glClear(int paramInt)
/* 418:    */   {
/* 419:463 */     GL11.glClear(paramInt);
/* 420:    */   }
/* 421:    */   
/* 422:    */   public static void glMatrixMode(int paramInt)
/* 423:    */   {
/* 424:471 */     GL11.glMatrixMode(paramInt);
/* 425:    */   }
/* 426:    */   
/* 427:    */   public static void glLoadIdentity() {GL11.glLoadIdentity();}
/* 428:    */   
/* 429:    */   public static void glPushMatrix() {GL11.glPushMatrix();}
/* 430:    */   
/* 431:    */   public static void glPopMatrix() {GL11.glPopMatrix();}
/* 432:    */   
/* 433:    */   public static void glGetFloat(int paramInt, FloatBuffer paramFloatBuffer)
/* 434:    */   {
/* 435:487 */     GL11.glGetFloat(paramInt, paramFloatBuffer);
/* 436:    */   }
/* 437:    */   
/* 438:    */   public static void glOrtho(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/* 439:    */   {
/* 440:491 */     GL11.glOrtho(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 441:    */   }
/* 442:    */   
/* 443:    */   public static void glRotatef(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/* 444:    */   {
/* 445:495 */     GL11.glRotatef(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/* 446:    */   }
/* 447:    */   
/* 448:    */   public static void glScalef(float paramFloat1, float paramFloat2, float paramFloat3)
/* 449:    */   {
/* 450:503 */     GL11.glScalef(paramFloat1, paramFloat2, paramFloat3);
/* 451:    */   }
/* 452:    */   
/* 453:    */   public static void glScaled(double paramDouble1, double paramDouble2, double paramDouble3)
/* 454:    */   {
/* 455:507 */     GL11.glScaled(paramDouble1, paramDouble2, paramDouble3);
/* 456:    */   }
/* 457:    */   
/* 458:    */   public static void glTranslatef(float paramFloat1, float paramFloat2, float paramFloat3)
/* 459:    */   {
/* 460:511 */     GL11.glTranslatef(paramFloat1, paramFloat2, paramFloat3);
/* 461:    */   }
/* 462:    */   
/* 463:    */   public static void glTranslated(double paramDouble1, double paramDouble2, double paramDouble3)
/* 464:    */   {
/* 465:515 */     GL11.glTranslated(paramDouble1, paramDouble2, paramDouble3);
/* 466:    */   }
/* 467:    */   
/* 468:    */   public static void glMultMatrix(FloatBuffer paramFloatBuffer)
/* 469:    */   {
/* 470:519 */     GL11.glMultMatrix(paramFloatBuffer);
/* 471:    */   }
/* 472:    */   
/* 473:    */   public static void c(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/* 474:    */   {
/* 475:527 */     if ((paramFloat1 != t.a) || (paramFloat2 != t.b) || (paramFloat3 != t.c) || (paramFloat4 != t.d))
/* 476:    */     {
/* 477:528 */       t.a = paramFloat1;
/* 478:529 */       t.b = paramFloat2;
/* 479:530 */       t.c = paramFloat3;
/* 480:531 */       t.d = paramFloat4;
/* 481:532 */       GL11.glColor4f(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/* 482:    */     }
/* 483:    */   }
/* 484:    */   
/* 485:    */   public static void c(float paramFloat1, float paramFloat2, float paramFloat3)
/* 486:    */   {
/* 487:537 */     c(paramFloat1, paramFloat2, paramFloat3, 1.0F);
/* 488:    */   }
/* 489:    */   
/* 490:    */   public static void G()
/* 491:    */   {
/* 492:546 */     t.a = (t.b = t.c = t.d = -1.0F);
/* 493:    */   }
/* 494:    */   
/* 495:    */   public static void o(int paramInt)
/* 496:    */   {
/* 497:550 */     GL11.glCallList(paramInt);
/* 498:    */   }
/* 499:    */   
/* 500:    */   static
/* 501:    */   {
/* 502:558 */     for (int i1 = 0; i1 < 8; i1++) {
/* 503:559 */       c[i1] = new GLOption(16384 + i1);
/* 504:    */     }
/* 505:561 */     for (int i1 = 0; i1 < 8; i1++) {
/* 506:562 */       p[i1] = new ckf(null);
/* 507:    */     }
/* 508:    */   }
/* 509:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cjm
 * JD-Core Version:    0.7.0.1
 */
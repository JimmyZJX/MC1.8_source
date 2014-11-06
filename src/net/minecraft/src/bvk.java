package net.minecraft.src;
/*   1:    */ import org.lwjgl.input.Mouse;
/*   2:    */ 
/*   3:    */ public abstract class bvk
/*   4:    */ {
/*   5:    */   protected final bsu a;
/*   6:    */   protected int b;
/*   7:    */   protected int c;
/*   8:    */   protected int d;
/*   9:    */   protected int e;
/*  10:    */   protected int f;
/*  11:    */   protected int g;
/*  12:    */   protected final int h;
/*  13:    */   private int u;
/*  14:    */   private int v;
/*  15:    */   protected int i;
/*  16:    */   protected int j;
/*  17: 28 */   protected boolean k = true;
/*  18: 30 */   protected float l = -2.0F;
/*  19:    */   protected float m;
/*  20:    */   protected float n;
/*  21: 34 */   protected int o = -1;
/*  22:    */   protected long p;
/*  23: 37 */   protected boolean q = true;
/*  24: 38 */   protected boolean r = true;
/*  25:    */   protected boolean s;
/*  26:    */   protected int t;
/*  27: 41 */   private boolean w = true;
/*  28:    */   
/*  29:    */   public bvk(bsu parambsu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*  30:    */   {
/*  31: 44 */     this.a = parambsu;
/*  32: 45 */     this.b = paramInt1;
/*  33: 46 */     this.c = paramInt2;
/*  34: 47 */     this.d = paramInt3;
/*  35: 48 */     this.e = paramInt4;
/*  36: 49 */     this.h = paramInt5;
/*  37: 50 */     this.g = 0;
/*  38: 51 */     this.f = paramInt1;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  42:    */   {
/*  43: 55 */     this.b = paramInt1;
/*  44: 56 */     this.c = paramInt2;
/*  45: 57 */     this.d = paramInt3;
/*  46: 58 */     this.e = paramInt4;
/*  47: 59 */     this.g = 0;
/*  48: 60 */     this.f = paramInt1;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(boolean paramBoolean)
/*  52:    */   {
/*  53: 64 */     this.r = paramBoolean;
/*  54:    */   }
/*  55:    */   
/*  56:    */   protected void a(boolean paramBoolean, int paramInt)
/*  57:    */   {
/*  58: 68 */     this.s = paramBoolean;
/*  59: 69 */     this.t = paramInt;
/*  60: 71 */     if (!paramBoolean) {
/*  61: 72 */       this.t = 0;
/*  62:    */     }
/*  63:    */   }
/*  64:    */   
/*  65:    */   protected abstract int b();
/*  66:    */   
/*  67:    */   protected abstract void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3);
/*  68:    */   
/*  69:    */   protected abstract boolean a(int paramInt);
/*  70:    */   
/*  71:    */   protected int k()
/*  72:    */   {
/*  73: 95 */     return b() * this.h + this.t;
/*  74:    */   }
/*  75:    */   
/*  76:    */   protected abstract void a();
/*  77:    */   
/*  78:    */   protected void a(int paramInt1, int paramInt2, int paramInt3) {}
/*  79:    */   
/*  80:    */   protected abstract void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/*  81:    */   
/*  82:    */   protected void a(int paramInt1, int paramInt2, ckx paramckx) {}
/*  83:    */   
/*  84:    */   protected void a(int paramInt1, int paramInt2) {}
/*  85:    */   
/*  86:    */   protected void b(int paramInt1, int paramInt2) {}
/*  87:    */   
/*  88:    */   public int c(int paramInt1, int paramInt2)
/*  89:    */   {
/*  90:115 */     int i1 = this.g + this.b / 2 - c() / 2;
/*  91:116 */     int i2 = this.g + this.b / 2 + c() / 2;
/*  92:    */     
/*  93:118 */     int i3 = paramInt2 - this.d - this.t + (int)this.n - 4;
/*  94:119 */     int i4 = i3 / this.h;
/*  95:120 */     if ((paramInt1 < d()) && (paramInt1 >= i1) && (paramInt1 <= i2) && (i4 >= 0) && (i3 >= 0) && (i4 < b())) {
/*  96:121 */       return i4;
/*  97:    */     }
/*  98:123 */     return -1;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void d(int paramInt1, int paramInt2)
/* 102:    */   {
/* 103:127 */     this.u = paramInt1;
/* 104:128 */     this.v = paramInt2;
/* 105:    */   }
/* 106:    */   
/* 107:    */   protected void l()
/* 108:    */   {
/* 109:132 */     int i1 = m();
/* 110:133 */     if (i1 < 0) {
/* 111:134 */       i1 /= 2;
/* 112:    */     }
/* 113:136 */     if ((!this.k) && (i1 < 0)) {
/* 114:137 */       i1 = 0;
/* 115:    */     }
/* 116:139 */     this.n = MathUtils.clamp(this.n, 0.0F, i1);
/* 117:    */   }
/* 118:    */   
/* 119:    */   public int m()
/* 120:    */   {
/* 121:143 */     return Math.max(0, k() - (this.e - this.d - 4));
/* 122:    */   }
/* 123:    */   
/* 124:    */   public int n()
/* 125:    */   {
/* 126:147 */     return (int)this.n;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public boolean f(int paramInt)
/* 130:    */   {
/* 131:151 */     return (paramInt >= this.d) && (paramInt <= this.e) && (this.i >= this.g) && (this.i <= this.f);
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void g(int paramInt)
/* 135:    */   {
/* 136:159 */     this.n += paramInt;
/* 137:160 */     l();
/* 138:161 */     this.l = -2.0F;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void a(bug parambug)
/* 142:    */   {
/* 143:165 */     if (!parambug.l) {
/* 144:166 */       return;
/* 145:    */     }
/* 146:169 */     if (parambug.k == this.u)
/* 147:    */     {
/* 148:170 */       this.n -= this.h * 2 / 3;
/* 149:171 */       this.l = -2.0F;
/* 150:172 */       l();
/* 151:    */     }
/* 152:173 */     else if (parambug.k == this.v)
/* 153:    */     {
/* 154:174 */       this.n += this.h * 2 / 3;
/* 155:175 */       this.l = -2.0F;
/* 156:176 */       l();
/* 157:    */     }
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 161:    */   {
/* 162:181 */     if (!this.q) {
/* 163:182 */       return;
/* 164:    */     }
/* 165:185 */     this.i = paramInt1;
/* 166:186 */     this.j = paramInt2;
/* 167:187 */     a();
/* 168:    */     
/* 169:189 */     int i1 = d();
/* 170:190 */     int i2 = i1 + 6;
/* 171:    */     
/* 172:192 */     l();
/* 173:    */     
/* 174:194 */     cjm.disableLighting();
/* 175:195 */     cjm.n();
/* 176:196 */     ckx localckx = ckx.getInstance();
/* 177:197 */     VertexBuffer localciv = localckx.getBuffer();
/* 178:    */     
/* 179:199 */     this.a.N().a(bub.b);
/* 180:200 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 181:201 */     float f1 = 32.0F;
/* 182:202 */     localciv.begin();
/* 183:203 */     localciv.setColor(2105376);
/* 184:204 */     localciv.addVertexWithUV(this.g, this.e, 0.0D, this.g / f1, (this.e + (int)this.n) / f1);
/* 185:205 */     localciv.addVertexWithUV(this.f, this.e, 0.0D, this.f / f1, (this.e + (int)this.n) / f1);
/* 186:206 */     localciv.addVertexWithUV(this.f, this.d, 0.0D, this.f / f1, (this.d + (int)this.n) / f1);
/* 187:207 */     localciv.addVertexWithUV(this.g, this.d, 0.0D, this.g / f1, (this.d + (int)this.n) / f1);
/* 188:208 */     localckx.draw();
/* 189:    */     
/* 190:210 */     int i3 = this.g + (this.b / 2 - c() / 2 + 2);
/* 191:211 */     int i4 = this.d + 4 - (int)this.n;
/* 192:213 */     if (this.s) {
/* 193:214 */       a(i3, i4, localckx);
/* 194:    */     }
/* 195:217 */     b(i3, i4, paramInt1, paramInt2);
/* 196:    */     
/* 197:219 */     cjm.i();
/* 198:    */     
/* 199:221 */     int i5 = 4;
/* 200:    */     
/* 201:223 */     c(0, this.d, 255, 255);
/* 202:224 */     c(this.e, this.c, 255, 255);
/* 203:    */     
/* 204:226 */     cjm.enableBlend();
/* 205:227 */     cjm.glBlendFuncSeparate(770, 771, 0, 1);
/* 206:228 */     cjm.disableAlphaTest();
/* 207:229 */     cjm.j(7425);
/* 208:    */     
/* 209:231 */     cjm.x();
/* 210:    */     
/* 211:233 */     localciv.begin();
/* 212:234 */     localciv.setColor(0, 0);
/* 213:235 */     localciv.addVertexWithUV(this.g, this.d + i5, 0.0D, 0.0D, 1.0D);
/* 214:236 */     localciv.addVertexWithUV(this.f, this.d + i5, 0.0D, 1.0D, 1.0D);
/* 215:237 */     localciv.setColor(0, 255);
/* 216:238 */     localciv.addVertexWithUV(this.f, this.d, 0.0D, 1.0D, 0.0D);
/* 217:239 */     localciv.addVertexWithUV(this.g, this.d, 0.0D, 0.0D, 0.0D);
/* 218:240 */     localckx.draw();
/* 219:    */     
/* 220:242 */     localciv.begin();
/* 221:243 */     localciv.setColor(0, 255);
/* 222:244 */     localciv.addVertexWithUV(this.g, this.e, 0.0D, 0.0D, 1.0D);
/* 223:245 */     localciv.addVertexWithUV(this.f, this.e, 0.0D, 1.0D, 1.0D);
/* 224:246 */     localciv.setColor(0, 0);
/* 225:247 */     localciv.addVertexWithUV(this.f, this.e - i5, 0.0D, 1.0D, 0.0D);
/* 226:248 */     localciv.addVertexWithUV(this.g, this.e - i5, 0.0D, 0.0D, 0.0D);
/* 227:249 */     localckx.draw();
/* 228:    */     
/* 229:251 */     int i6 = m();
/* 230:252 */     if (i6 > 0)
/* 231:    */     {
/* 232:253 */       int i7 = (this.e - this.d) * (this.e - this.d) / k();
/* 233:254 */       i7 = MathUtils.clamp(i7, 32, this.e - this.d - 8);
/* 234:    */       
/* 235:256 */       int i8 = (int)this.n * (this.e - this.d - i7) / i6 + this.d;
/* 236:257 */       if (i8 < this.d) {
/* 237:258 */         i8 = this.d;
/* 238:    */       }
/* 239:261 */       localciv.begin();
/* 240:262 */       localciv.setColor(0, 255);
/* 241:263 */       localciv.addVertexWithUV(i1, this.e, 0.0D, 0.0D, 1.0D);
/* 242:264 */       localciv.addVertexWithUV(i2, this.e, 0.0D, 1.0D, 1.0D);
/* 243:265 */       localciv.addVertexWithUV(i2, this.d, 0.0D, 1.0D, 0.0D);
/* 244:266 */       localciv.addVertexWithUV(i1, this.d, 0.0D, 0.0D, 0.0D);
/* 245:267 */       localckx.draw();
/* 246:    */       
/* 247:269 */       localciv.begin();
/* 248:270 */       localciv.setColor(8421504, 255);
/* 249:271 */       localciv.addVertexWithUV(i1, i8 + i7, 0.0D, 0.0D, 1.0D);
/* 250:272 */       localciv.addVertexWithUV(i2, i8 + i7, 0.0D, 1.0D, 1.0D);
/* 251:273 */       localciv.addVertexWithUV(i2, i8, 0.0D, 1.0D, 0.0D);
/* 252:274 */       localciv.addVertexWithUV(i1, i8, 0.0D, 0.0D, 0.0D);
/* 253:275 */       localckx.draw();
/* 254:    */       
/* 255:277 */       localciv.begin();
/* 256:278 */       localciv.setColor(12632256, 255);
/* 257:279 */       localciv.addVertexWithUV(i1, i8 + i7 - 1, 0.0D, 0.0D, 1.0D);
/* 258:280 */       localciv.addVertexWithUV(i2 - 1, i8 + i7 - 1, 0.0D, 1.0D, 1.0D);
/* 259:281 */       localciv.addVertexWithUV(i2 - 1, i8, 0.0D, 1.0D, 0.0D);
/* 260:282 */       localciv.addVertexWithUV(i1, i8, 0.0D, 0.0D, 0.0D);
/* 261:283 */       localckx.draw();
/* 262:    */     }
/* 263:286 */     b(paramInt1, paramInt2);
/* 264:    */     
/* 265:288 */     cjm.w();
/* 266:    */     
/* 267:290 */     cjm.j(7424);
/* 268:291 */     cjm.enableAlphaTest();
/* 269:292 */     cjm.disableBlend();
/* 270:    */   }
/* 271:    */   
/* 272:    */   public void p()
/* 273:    */   {
/* 274:296 */     if (f(this.j))
/* 275:    */     {
/* 276:297 */       if ((Mouse.isButtonDown(0)) && (q()))
/* 277:    */       {
/* 278:298 */         if (this.l == -1.0F)
/* 279:    */         {
/* 280:299 */           int i1 = 1;
/* 281:300 */           if ((this.j >= this.d) && (this.j <= this.e))
/* 282:    */           {
/* 283:301 */             int i2 = this.b / 2 - c() / 2;
/* 284:302 */             int i3 = this.b / 2 + c() / 2;
/* 285:    */             
/* 286:304 */             int i4 = this.j - this.d - this.t + (int)this.n - 4;
/* 287:305 */             int i5 = i4 / this.h;
/* 288:306 */             if ((this.i >= i2) && (this.i <= i3) && (i5 >= 0) && (i4 >= 0) && (i5 < b()))
/* 289:    */             {
/* 290:307 */               boolean bool = (i5 == this.o) && (bsu.I() - this.p < 250L);
/* 291:    */               
/* 292:309 */               a(i5, bool, this.i, this.j);
/* 293:310 */               this.o = i5;
/* 294:311 */               this.p = bsu.I();
/* 295:    */             }
/* 296:312 */             else if ((this.i >= i2) && (this.i <= i3) && (i4 < 0))
/* 297:    */             {
/* 298:313 */               a(this.i - i2, this.j - this.d + (int)this.n - 4);
/* 299:314 */               i1 = 0;
/* 300:    */             }
/* 301:317 */             int i6 = d();
/* 302:318 */             int i7 = i6 + 6;
/* 303:319 */             if ((this.i >= i6) && (this.i <= i7))
/* 304:    */             {
/* 305:320 */               this.m = -1.0F;
/* 306:    */               
/* 307:322 */               int i8 = m();
/* 308:323 */               if (i8 < 1) {
/* 309:324 */                 i8 = 1;
/* 310:    */               }
/* 311:326 */               int i9 = (int)((this.e - this.d) * (this.e - this.d) / k());
/* 312:327 */               i9 = MathUtils.clamp(i9, 32, this.e - this.d - 8);
/* 313:    */               
/* 314:329 */               this.m /= (this.e - this.d - i9) / i8;
/* 315:    */             }
/* 316:    */             else
/* 317:    */             {
/* 318:332 */               this.m = 1.0F;
/* 319:    */             }
/* 320:334 */             if (i1 != 0) {
/* 321:335 */               this.l = this.j;
/* 322:    */             } else {
/* 323:337 */               this.l = -2.0F;
/* 324:    */             }
/* 325:    */           }
/* 326:    */           else
/* 327:    */           {
/* 328:340 */             this.l = -2.0F;
/* 329:    */           }
/* 330:    */         }
/* 331:342 */         else if (this.l >= 0.0F)
/* 332:    */         {
/* 333:343 */           this.n -= (this.j - this.l) * this.m;
/* 334:344 */           this.l = this.j;
/* 335:    */         }
/* 336:    */       }
/* 337:    */       else {
/* 338:347 */         this.l = -1.0F;
/* 339:    */       }
/* 340:350 */       int i1 = Mouse.getEventDWheel();
/* 341:351 */       if (i1 != 0)
/* 342:    */       {
/* 343:352 */         if (i1 > 0) {
/* 344:353 */           i1 = -1;
/* 345:354 */         } else if (i1 < 0) {
/* 346:355 */           i1 = 1;
/* 347:    */         }
/* 348:357 */         this.n += i1 * this.h / 2;
/* 349:    */       }
/* 350:    */     }
/* 351:    */   }
/* 352:    */   
/* 353:    */   public void c(boolean paramBoolean)
/* 354:    */   {
/* 355:363 */     this.w = paramBoolean;
/* 356:    */   }
/* 357:    */   
/* 358:    */   public boolean q()
/* 359:    */   {
/* 360:367 */     return this.w;
/* 361:    */   }
/* 362:    */   
/* 363:    */   public int c()
/* 364:    */   {
/* 365:371 */     return 220;
/* 366:    */   }
/* 367:    */   
/* 368:    */   protected void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 369:    */   {
/* 370:375 */     int i1 = b();
/* 371:376 */     ckx localckx = ckx.getInstance();
/* 372:377 */     VertexBuffer localciv = localckx.getBuffer();
/* 373:379 */     for (int i2 = 0; i2 < i1; i2++)
/* 374:    */     {
/* 375:380 */       int i3 = paramInt2 + i2 * this.h + this.t;
/* 376:381 */       int i4 = this.h - 4;
/* 377:383 */       if ((i3 > this.e) || (i3 + i4 < this.d)) {
/* 378:384 */         a(i2, paramInt1, i3);
/* 379:    */       }
/* 380:387 */       if ((this.r) && (a(i2)))
/* 381:    */       {
/* 382:388 */         int i5 = this.g + (this.b / 2 - c() / 2);
/* 383:389 */         int i6 = this.g + (this.b / 2 + c() / 2);
/* 384:390 */         cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 385:391 */         cjm.x();
/* 386:392 */         localciv.begin();
/* 387:393 */         localciv.setColor(8421504);
/* 388:394 */         localciv.addVertexWithUV(i5, i3 + i4 + 2, 0.0D, 0.0D, 1.0D);
/* 389:395 */         localciv.addVertexWithUV(i6, i3 + i4 + 2, 0.0D, 1.0D, 1.0D);
/* 390:396 */         localciv.addVertexWithUV(i6, i3 - 2, 0.0D, 1.0D, 0.0D);
/* 391:397 */         localciv.addVertexWithUV(i5, i3 - 2, 0.0D, 0.0D, 0.0D);
/* 392:    */         
/* 393:399 */         localciv.setColor(0);
/* 394:400 */         localciv.addVertexWithUV(i5 + 1, i3 + i4 + 1, 0.0D, 0.0D, 1.0D);
/* 395:401 */         localciv.addVertexWithUV(i6 - 1, i3 + i4 + 1, 0.0D, 1.0D, 1.0D);
/* 396:402 */         localciv.addVertexWithUV(i6 - 1, i3 - 1, 0.0D, 1.0D, 0.0D);
/* 397:403 */         localciv.addVertexWithUV(i5 + 1, i3 - 1, 0.0D, 0.0D, 0.0D);
/* 398:    */         
/* 399:405 */         localckx.draw();
/* 400:406 */         cjm.w();
/* 401:    */       }
/* 402:409 */       a(i2, paramInt1, i3, i4, paramInt3, paramInt4);
/* 403:    */     }
/* 404:    */   }
/* 405:    */   
/* 406:    */   protected int d()
/* 407:    */   {
/* 408:414 */     return this.b / 2 + 124;
/* 409:    */   }
/* 410:    */   
/* 411:    */   protected void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 412:    */   {
/* 413:418 */     ckx localckx = ckx.getInstance();
/* 414:419 */     VertexBuffer localciv = localckx.getBuffer();
/* 415:420 */     this.a.N().a(bub.b);
/* 416:421 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 417:422 */     float f1 = 32.0F;
/* 418:423 */     localciv.begin();
/* 419:424 */     localciv.setColor(4210752, paramInt4);
/* 420:425 */     localciv.addVertexWithUV(this.g, paramInt2, 0.0D, 0.0D, paramInt2 / f1);
/* 421:426 */     localciv.addVertexWithUV(this.g + this.b, paramInt2, 0.0D, this.b / f1, paramInt2 / f1);
/* 422:427 */     localciv.setColor(4210752, paramInt3);
/* 423:428 */     localciv.addVertexWithUV(this.g + this.b, paramInt1, 0.0D, this.b / f1, paramInt1 / f1);
/* 424:429 */     localciv.addVertexWithUV(this.g, paramInt1, 0.0D, 0.0D, paramInt1 / f1);
/* 425:430 */     localckx.draw();
/* 426:    */   }
/* 427:    */   
/* 428:    */   public void h(int paramInt)
/* 429:    */   {
/* 430:434 */     this.g = paramInt;
/* 431:435 */     this.f = (paramInt + this.b);
/* 432:    */   }
/* 433:    */   
/* 434:    */   public int r()
/* 435:    */   {
/* 436:439 */     return this.h;
/* 437:    */   }
/* 438:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvk
 * JD-Core Version:    0.7.0.1
 */
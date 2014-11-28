package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.gson.JsonParseException;
/*   3:    */ import io.netty.buffer.Unpooled;
/*   4:    */ import java.util.List;
/*   5:    */ import org.apache.logging.log4j.LogManager;
/*   6:    */ import org.apache.logging.log4j.Logger;
/*   7:    */ import org.lwjgl.input.Keyboard;
/*   8:    */ 
/*   9:    */ public class bys
/*  10:    */   extends bxf
/*  11:    */ {
/*  12: 35 */   private static final Logger a = LogManager.getLogger();
/*  13: 46 */   private static final oa f = new oa("textures/gui/book.png");
/*  14:    */   private final EntityPlayer g;
/*  15:    */   private final ItemStack h;
/*  16:    */   private final boolean i;
/*  17:    */   private boolean r;
/*  18:    */   private boolean s;
/*  19:    */   private int t;
/*  20: 56 */   private int u = 192;
/*  21: 57 */   private int v = 192;
/*  22: 59 */   private int w = 1;
/*  23:    */   private int x;
/*  24:    */   private fv y;
/*  25: 62 */   private String z = "";
/*  26:    */   private List<ho> A;
/*  27: 64 */   private int B = -1;
/*  28:    */   private byt C;
/*  29:    */   private byt D;
/*  30:    */   private bug E;
/*  31:    */   private bug F;
/*  32:    */   private bug G;
/*  33:    */   private bug H;
/*  34:    */   
/*  35:    */   public bys(EntityPlayer paramahd, ItemStack paramamj, boolean paramBoolean)
/*  36:    */   {
/*  37: 75 */     this.g = paramahd;
/*  38: 76 */     this.h = paramamj;
/*  39: 77 */     this.i = paramBoolean;
/*  40: 79 */     if (paramamj.hasTagCompound())
/*  41:    */     {
/*  42: 80 */       NBTTagCompound localfn = paramamj.getTagCompound();
/*  43: 81 */       this.y = localfn.c("pages", 8);
/*  44: 82 */       if (this.y != null)
/*  45:    */       {
/*  46: 83 */         this.y = ((fv)this.y.b());
/*  47: 84 */         this.w = this.y.c();
/*  48: 85 */         if (this.w < 1) {
/*  49: 86 */           this.w = 1;
/*  50:    */         }
/*  51:    */       }
/*  52:    */     }
/*  53: 91 */     if ((this.y == null) && (paramBoolean))
/*  54:    */     {
/*  55: 92 */       this.y = new fv();
/*  56: 93 */       this.y.a(new gc(""));
/*  57:    */       
/*  58: 95 */       this.w = 1;
/*  59:    */     }
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void e()
/*  63:    */   {
/*  64:101 */     super.e();
/*  65:102 */     this.t += 1;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void b()
/*  69:    */   {
/*  70:107 */     this.n.clear();
/*  71:108 */     Keyboard.enableRepeatEvents(true);
/*  72:110 */     if (this.i)
/*  73:    */     {
/*  74:111 */       this.n.add(this.F = new bug(3, this.l / 2 - 100, 4 + this.v, 98, 20, cwc.a("book.signButton", new Object[0])));
/*  75:112 */       this.n.add(this.E = new bug(0, this.l / 2 + 2, 4 + this.v, 98, 20, cwc.a("gui.done", new Object[0])));
/*  76:    */       
/*  77:114 */       this.n.add(this.G = new bug(5, this.l / 2 - 100, 4 + this.v, 98, 20, cwc.a("book.finalizeButton", new Object[0])));
/*  78:115 */       this.n.add(this.H = new bug(4, this.l / 2 + 2, 4 + this.v, 98, 20, cwc.a("gui.cancel", new Object[0])));
/*  79:    */     }
/*  80:    */     else
/*  81:    */     {
/*  82:117 */       this.n.add(this.E = new bug(0, this.l / 2 - 100, 4 + this.v, 200, 20, cwc.a("gui.done", new Object[0])));
/*  83:    */     }
/*  84:120 */     int j = (this.l - this.u) / 2;
/*  85:121 */     int k = 2;
/*  86:    */     
/*  87:123 */     this.n.add(this.C = new byt(1, j + 120, k + 154, true));
/*  88:124 */     this.n.add(this.D = new byt(2, j + 38, k + 154, false));
/*  89:    */     
/*  90:126 */     f();
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void m()
/*  94:    */   {
/*  95:131 */     Keyboard.enableRepeatEvents(false);
/*  96:    */   }
/*  97:    */   
/*  98:    */   private void f()
/*  99:    */   {
/* 100:135 */     this.C.m = ((!this.s) && ((this.x < this.w - 1) || (this.i)));
/* 101:136 */     this.D.m = ((!this.s) && (this.x > 0));
/* 102:    */     
/* 103:138 */     this.E.m = ((!this.i) || (!this.s));
/* 104:139 */     if (this.i)
/* 105:    */     {
/* 106:140 */       this.F.m = (!this.s);
/* 107:141 */       this.H.m = this.s;
/* 108:142 */       this.G.m = this.s;
/* 109:143 */       this.G.l = (this.z.trim().length() > 0);
/* 110:    */     }
/* 111:    */   }
/* 112:    */   
/* 113:    */   private void a(boolean paramBoolean)
/* 114:    */   {
/* 115:148 */     if ((!this.i) || (!this.r)) {
/* 116:149 */       return;
/* 117:    */     }
/* 118:152 */     if (this.y != null)
/* 119:    */     {
/* 120:154 */       while (this.y.c() > 1)
/* 121:    */       {
/* 122:155 */         String localObject = this.y.f(this.y.c() - 1);
/* 123:156 */         if (((String)localObject).length() != 0) {
/* 124:    */           break;
/* 125:    */         }
/* 126:157 */         this.y.a(this.y.c() - 1);
/* 127:    */       }
/* 128:164 */       if (this.h.hasTagCompound())
/* 129:    */       {
/* 130:165 */         NBTTagCompound localObject = this.h.getTagCompound();
/* 131:166 */         ((NBTTagCompound)localObject).setNBT("pages", this.y);
/* 132:    */       }
/* 133:    */       else
/* 134:    */       {
/* 135:168 */         this.h.a("pages", this.y);
/* 136:    */       }
/* 137:171 */       Object localObject = "MC|BEdit";
/* 138:172 */       if (paramBoolean)
/* 139:    */       {
/* 140:173 */         localObject = "MC|BSign";
/* 141:174 */         this.h.a("author", new gc(this.g.getName()));
/* 142:175 */         this.h.a("title", new gc(this.z.trim()));
/* 143:177 */         for (int j = 0; j < this.y.c(); j++)
/* 144:    */         {
/* 145:178 */           String str = this.y.f(j);
/* 146:179 */           hy localhy = new hy(str);
/* 147:180 */           str = hp.a(localhy);
/* 148:181 */           this.y.a(j, new gc(str));
/* 149:    */         }
/* 150:185 */         this.h.a(ItemList.writtenBook);
/* 151:    */       }
/* 152:188 */       ByteBufWrapper localhd = new ByteBufWrapper(Unpooled.buffer());
/* 153:    */       
/* 154:190 */       localhd.a(this.h);
/* 155:191 */       this.j.t().a(new mc((String)localObject, localhd));
/* 156:    */     }
/* 157:    */   }
/* 158:    */   
/* 159:    */   protected void a(bug parambug)
/* 160:    */   {
/* 161:197 */     if (!parambug.l) {
/* 162:198 */       return;
/* 163:    */     }
/* 164:201 */     if (parambug.k == 0)
/* 165:    */     {
/* 166:202 */       this.j.a((bxf)null);
/* 167:203 */       a(false);
/* 168:    */     }
/* 169:205 */     else if ((parambug.k == 3) && (this.i))
/* 170:    */     {
/* 171:206 */       this.s = true;
/* 172:    */     }
/* 173:207 */     else if (parambug.k == 1)
/* 174:    */     {
/* 175:208 */       if (this.x < this.w - 1)
/* 176:    */       {
/* 177:209 */         this.x += 1;
/* 178:    */       }
/* 179:210 */       else if (this.i)
/* 180:    */       {
/* 181:211 */         g();
/* 182:213 */         if (this.x < this.w - 1) {
/* 183:214 */           this.x += 1;
/* 184:    */         }
/* 185:    */       }
/* 186:    */     }
/* 187:217 */     else if (parambug.k == 2)
/* 188:    */     {
/* 189:218 */       if (this.x > 0) {
/* 190:219 */         this.x -= 1;
/* 191:    */       }
/* 192:    */     }
/* 193:221 */     else if ((parambug.k == 5) && (this.s))
/* 194:    */     {
/* 195:222 */       a(true);
/* 196:223 */       this.j.a((bxf)null);
/* 197:    */     }
/* 198:224 */     else if ((parambug.k == 4) && (this.s))
/* 199:    */     {
/* 200:225 */       this.s = false;
/* 201:    */     }
/* 202:227 */     f();
/* 203:    */   }
/* 204:    */   
/* 205:    */   private void g()
/* 206:    */   {
/* 207:231 */     if ((this.y == null) || (this.y.c() >= 50)) {
/* 208:232 */       return;
/* 209:    */     }
/* 210:234 */     this.y.a(new gc(""));
/* 211:235 */     this.w += 1;
/* 212:    */     
/* 213:237 */     this.r = true;
/* 214:    */   }
/* 215:    */   
/* 216:    */   protected void a(char paramChar, int paramInt)
/* 217:    */   {
/* 218:242 */     super.a(paramChar, paramInt);
/* 219:244 */     if (!this.i) {
/* 220:245 */       return;
/* 221:    */     }
/* 222:248 */     if (this.s) {
/* 223:249 */       c(paramChar, paramInt);
/* 224:    */     } else {
/* 225:251 */       b(paramChar, paramInt);
/* 226:    */     }
/* 227:    */   }
/* 228:    */   
/* 229:    */   private void b(char paramChar, int paramInt)
/* 230:    */   {
/* 231:257 */     if (bxf.e(paramInt))
/* 232:    */     {
/* 233:258 */       b(bxf.o());
/* 234:259 */       return;
/* 235:    */     }
/* 236:262 */     switch (paramInt)
/* 237:    */     {
/* 238:    */     case 14: 
/* 239:264 */       String str = h();
/* 240:265 */       if (str.length() > 0) {
/* 241:266 */         a(str.substring(0, str.length() - 1));
/* 242:    */       }
/* 243:268 */       return;
/* 244:    */     case 28: 
/* 245:    */     case 156: 
/* 246:271 */       b("\n");
/* 247:272 */       return;
/* 248:    */     }
/* 249:275 */     if (net.minecraft.src.v.a(paramChar))
/* 250:    */     {
/* 251:276 */       b(Character.toString(paramChar));
/* 252:277 */       return;
/* 253:    */     }
/* 254:    */   }
/* 255:    */   
/* 256:    */   private void c(char paramChar, int paramInt)
/* 257:    */   {
/* 258:282 */     switch (paramInt)
/* 259:    */     {
/* 260:    */     case 14: 
/* 261:284 */       if (!this.z.isEmpty())
/* 262:    */       {
/* 263:285 */         this.z = this.z.substring(0, this.z.length() - 1);
/* 264:286 */         f();
/* 265:    */       }
/* 266:288 */       return;
/* 267:    */     case 28: 
/* 268:    */     case 156: 
/* 269:291 */       if (!this.z.isEmpty())
/* 270:    */       {
/* 271:292 */         a(true);
/* 272:293 */         this.j.a((bxf)null);
/* 273:    */       }
/* 274:295 */       return;
/* 275:    */     }
/* 276:298 */     if ((this.z.length() < 16) && (net.minecraft.src.v.a(paramChar)))
/* 277:    */     {
/* 278:299 */       this.z += Character.toString(paramChar);
/* 279:300 */       f();
/* 280:301 */       this.r = true;
/* 281:    */     }
/* 282:    */   }
/* 283:    */   
/* 284:    */   private String h()
/* 285:    */   {
/* 286:306 */     if ((this.y != null) && (this.x >= 0) && (this.x < this.y.c())) {
/* 287:307 */       return this.y.f(this.x);
/* 288:    */     }
/* 289:309 */     return "";
/* 290:    */   }
/* 291:    */   
/* 292:    */   private void a(String paramString)
/* 293:    */   {
/* 294:313 */     if ((this.y != null) && (this.x >= 0) && (this.x < this.y.c()))
/* 295:    */     {
/* 296:314 */       this.y.a(this.x, new gc(paramString));
/* 297:    */       
/* 298:316 */       this.r = true;
/* 299:    */     }
/* 300:    */   }
/* 301:    */   
/* 302:    */   private void b(String paramString)
/* 303:    */   {
/* 304:323 */     String str1 = h();
/* 305:324 */     String str2 = str1 + paramString;
/* 306:    */     
/* 307:326 */     int j = this.q.b(str2 + "" + net.minecraft.src.a.a + "_", 118);
/* 308:327 */     if ((j <= 128) && (str2.length() < 256)) {
/* 309:328 */       a(str2);
/* 310:    */     }
/* 311:    */   }
/* 312:    */   
/* 313:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 314:    */   {
/* 315:334 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 316:335 */     this.j.N().a(f);
/* 317:336 */     int j = (this.l - this.u) / 2;
/* 318:337 */     int k = 2;
/* 319:338 */     b(j, k, 0, 0, this.u, this.v);
/* 320:    */     String str1;
/* 321:    */     String str2;
/* 322:    */     int i1;
/* 323:340 */     if (this.s)
/* 324:    */     {
/* 325:341 */       str1 = this.z;
/* 326:343 */       if (this.i) {
/* 327:344 */         if (this.t / 6 % 2 == 0) {
/* 328:345 */           str1 = str1 + "" + net.minecraft.src.a.a + "_";
/* 329:    */         } else {
/* 330:347 */           str1 = str1 + "" + net.minecraft.src.a.h + "_";
/* 331:    */         }
/* 332:    */       }
/* 333:351 */       str2 = cwc.a("book.editTitle", new Object[0]);
/* 334:352 */       int m = this.q.a(str2);
/* 335:353 */       this.q.a(str2, j + 36 + (116 - m) / 2, k + 16 + 16, 0);
/* 336:    */       
/* 337:355 */       i1 = this.q.a(str1);
/* 338:356 */       this.q.a(str1, j + 36 + (116 - i1) / 2, k + 48, 0);
/* 339:357 */       String str3 = cwc.a("book.byAuthor", new Object[] { this.g.getName() });
/* 340:358 */       int i3 = this.q.a(str3);
/* 341:359 */       this.q.a(net.minecraft.src.a.i + str3, j + 36 + (116 - i3) / 2, k + 48 + 10, 0);
/* 342:    */       
/* 343:361 */       String str4 = cwc.a("book.finalizeWarning", new Object[0]);
/* 344:362 */       this.q.a(str4, j + 36, k + 80, 116, 0);
/* 345:    */     }
/* 346:    */     else
/* 347:    */     {
/* 348:364 */       str1 = cwc.a("book.pageIndicator", new Object[] { Integer.valueOf(this.x + 1), Integer.valueOf(this.w) });
/* 349:365 */       str2 = "";
/* 350:367 */       if ((this.y != null) && (this.x >= 0) && (this.x < this.y.c())) {
/* 351:368 */         str2 = this.y.f(this.x);
/* 352:    */       }
/* 353:371 */       if (this.i)
/* 354:    */       {
/* 355:372 */         if (this.q.b()) {
/* 356:373 */           str2 = str2 + "_";
/* 357:375 */         } else if (this.t / 6 % 2 == 0) {
/* 358:376 */           str2 = str2 + "" + net.minecraft.src.a.a + "_";
/* 359:    */         } else {
/* 360:378 */           str2 = str2 + "" + net.minecraft.src.a.h + "_";
/* 361:    */         }
/* 362:    */       }
/* 363:382 */       else if (this.B != this.x)
/* 364:    */       {
/* 365:383 */         if (anr.b(this.h.getTagCompound()))
/* 366:    */         {
/* 367:    */           try
/* 368:    */           {
/* 369:385 */             ho localho1 = hp.a(str2);
/* 370:386 */             this.A = (localho1 != null ? bui.a(localho1, 116, this.q, true, true) : null);
/* 371:    */           }
/* 372:    */           catch (JsonParseException localJsonParseException)
/* 373:    */           {
/* 374:388 */             this.A = null;
/* 375:    */           }
/* 376:    */         }
/* 377:    */         else
/* 378:    */         {
/* 379:391 */           hy localhy = new hy(net.minecraft.src.a.e.toString() + "* Invalid book tag *");
/* 380:392 */           this.A = Lists.newArrayList(localhy);
/* 381:    */         }
/* 382:394 */         this.B = this.x;
/* 383:    */       }
/* 384:398 */       int n = this.q.a(str1);
/* 385:399 */       this.q.a(str1, j - n + this.u - 44, k + 16, 0);
/* 386:400 */       if (this.A == null)
/* 387:    */       {
/* 388:401 */         this.q.a(str2, j + 36, k + 16 + 16, 116, 0);
/* 389:    */       }
/* 390:    */       else
/* 391:    */       {
/* 392:403 */         i1 = Math.min(128 / this.q.a, this.A.size());
/* 393:404 */         for (int i2 = 0; i2 < i1; i2++)
/* 394:    */         {
/* 395:405 */           ho localho3 = (ho)this.A.get(i2);
/* 396:406 */           this.q.a(localho3.c(), j + 36, k + 16 + 16 + i2 * this.q.a, 0);
/* 397:    */         }
/* 398:409 */         ho localho2 = b(paramInt1, paramInt2);
/* 399:410 */         if (localho2 != null) {
/* 400:411 */           a(localho2, paramInt1, paramInt2);
/* 401:    */         }
/* 402:    */       }
/* 403:    */     }
/* 404:416 */     super.a(paramInt1, paramInt2, paramFloat);
/* 405:    */   }
/* 406:    */   
/* 407:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 408:    */   {
/* 409:421 */     if (paramInt3 == 0)
/* 410:    */     {
/* 411:422 */       ho localho = b(paramInt1, paramInt2);
/* 412:423 */       if (a(localho)) {
/* 413:424 */         return;
/* 414:    */       }
/* 415:    */     }
/* 416:428 */     super.a(paramInt1, paramInt2, paramInt3);
/* 417:    */   }
/* 418:    */   
/* 419:    */   protected boolean a(ho paramho)
/* 420:    */   {
/* 421:433 */     hm localhm = paramho == null ? null : paramho.b().h();
/* 422:434 */     if (localhm == null) {
/* 423:435 */       return false;
/* 424:    */     }
/* 425:438 */     if (localhm.a() == hn.f)
/* 426:    */     {
/* 427:439 */       String str = localhm.b();
/* 428:    */       try
/* 429:    */       {
/* 430:441 */         int j = Integer.parseInt(str) - 1;
/* 431:442 */         if ((j >= 0) && (j < this.w) && (j != this.x))
/* 432:    */         {
/* 433:443 */           this.x = j;
/* 434:444 */           f();
/* 435:445 */           return true;
/* 436:    */         }
/* 437:    */       }
/* 438:    */       catch (Throwable localThrowable) {}
/* 439:450 */       return false;
/* 440:    */     }
/* 441:453 */     boolean bool = super.a(paramho);
/* 442:454 */     if ((bool == true) && (localhm.a() == hn.c)) {
/* 443:455 */       this.j.a((bxf)null);
/* 444:    */     }
/* 445:457 */     return bool;
/* 446:    */   }
/* 447:    */   
/* 448:    */   public ho b(int paramInt1, int paramInt2)
/* 449:    */   {
/* 450:461 */     if (this.A == null) {
/* 451:462 */       return null;
/* 452:    */     }
/* 453:465 */     int j = paramInt1 - (this.l - this.u) / 2 - 36;
/* 454:466 */     int k = paramInt2 - 2 - 16 - 16;
/* 455:468 */     if ((j < 0) || (k < 0)) {
/* 456:469 */       return null;
/* 457:    */     }
/* 458:471 */     int m = Math.min(128 / this.q.a, this.A.size());
/* 459:473 */     if ((j <= 116) && (k < this.j.k.a * m + m))
/* 460:    */     {
/* 461:474 */       int n = k / this.j.k.a;
/* 462:    */       int i1;
/* 463:475 */       if ((n >= 0) && (n < this.A.size()))
/* 464:    */       {
/* 465:476 */         ho localho1 = (ho)this.A.get(n);
/* 466:477 */         i1 = 0;
/* 467:479 */         for (ho localho2 : localho1) {
/* 468:480 */           if ((localho2 instanceof hy))
/* 469:    */           {
/* 470:481 */             i1 += this.j.k.a(((hy)localho2).g());
/* 471:483 */             if (i1 > j) {
/* 472:484 */               return localho2;
/* 473:    */             }
/* 474:    */           }
/* 475:    */         }
/* 476:    */       }
/* 477:490 */       return null;
/* 478:    */     }
/* 479:493 */     return null;
/* 480:    */   }
				static oa a() {return f;}
/* 481:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bys
 * JD-Core Version:    0.7.0.1
 */
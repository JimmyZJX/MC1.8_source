package net.minecraft.src;
/*   1:    */ import com.google.common.base.Splitter;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import com.google.common.collect.Sets;
/*   4:    */ import java.awt.Toolkit;
/*   5:    */ import java.awt.datatransfer.Clipboard;
/*   6:    */ import java.awt.datatransfer.DataFlavor;
/*   7:    */ import java.awt.datatransfer.StringSelection;
/*   8:    */ import java.awt.datatransfer.Transferable;
/*   9:    */ import java.io.File;
/*  10:    */ import java.lang.reflect.Method;
/*  11:    */ import java.net.URI;
/*  12:    */ import java.net.URISyntaxException;
/*  13:    */ import java.util.ArrayList;
/*  14:    */ import java.util.Arrays;
/*  15:    */ import java.util.List;
/*  16:    */ import java.util.Set;
/*  17:    */ import org.apache.commons.lang3.StringUtils;
/*  18:    */ import org.apache.logging.log4j.LogManager;
/*  19:    */ import org.apache.logging.log4j.Logger;
/*  20:    */ import org.lwjgl.input.Keyboard;
/*  21:    */ import org.lwjgl.input.Mouse;
/*  22:    */ import tv.twitch.chat.ChatUserInfo;
/*  23:    */ 
/*  24:    */ public abstract class bxf
/*  25:    */   extends bub
/*  26:    */   implements bvz
/*  27:    */ {
/*  28: 49 */   private static final Logger a = LogManager.getLogger();
/*  29: 50 */   private static final Set f = Sets.newHashSet(new String[] { "http", "https" });
/*  30: 52 */   private static final Splitter g = Splitter.on('\n');
/*  31:    */   protected bsu j;
/*  32:    */   protected cqh k;
/*  33:    */   public int l;
/*  34:    */   public int m;
/*  35: 57 */   protected List<bug> n = Lists.newArrayList();
/*  36: 58 */   protected List o = Lists.newArrayList();
/*  37:    */   public boolean p;
/*  38:    */   protected bty q;
/*  39:    */   private bug h;
/*  40:    */   private int i;
/*  41:    */   private long r;
/*  42:    */   private int s;
/*  43:    */   private URI t;
/*  44:    */   
/*  45:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*  46:    */   {
/*  47: 68 */     for (int i1 = 0; i1 < this.n.size(); i1++) {
/*  48: 69 */       ((bug)this.n.get(i1)).a(this.j, paramInt1, paramInt2);
/*  49:    */     }
/*  50: 71 */     for (int i1 = 0; i1 < this.o.size(); i1++) {
/*  51: 72 */       ((buo)this.o.get(i1)).a(this.j, paramInt1, paramInt2);
/*  52:    */     }
/*  53:    */   }
/*  54:    */   
/*  55:    */   protected void a(char paramChar, int paramInt)
/*  56:    */   {
/*  57: 77 */     if (paramInt == 1)
/*  58:    */     {
/*  59: 78 */       this.j.a((bxf)null);
/*  60: 79 */       if (this.j.m == null) {
/*  61: 80 */         this.j.n();
/*  62:    */       }
/*  63:    */     }
/*  64:    */   }
/*  65:    */   
/*  66:    */   public static String o()
/*  67:    */   {
/*  68:    */     try
/*  69:    */     {
/*  70: 87 */       Transferable localTransferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
/*  71: 88 */       if ((localTransferable != null) && (localTransferable.isDataFlavorSupported(DataFlavor.stringFlavor))) {
/*  72: 89 */         return (String)localTransferable.getTransferData(DataFlavor.stringFlavor);
/*  73:    */       }
/*  74:    */     }
/*  75:    */     catch (Exception localException) {}
/*  76: 93 */     return "";
/*  77:    */   }
/*  78:    */   
/*  79:    */   public static void e(String paramString)
/*  80:    */   {
/*  81: 97 */     if (StringUtils.isEmpty(paramString)) {
/*  82: 98 */       return;
/*  83:    */     }
/*  84:    */     try
/*  85:    */     {
/*  86:101 */       StringSelection localStringSelection = new StringSelection(paramString);
/*  87:102 */       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(localStringSelection, null);
/*  88:    */     }
/*  89:    */     catch (Exception localException) {}
/*  90:    */   }
/*  91:    */   
/*  92:    */   protected void a(ItemStack paramamj, int paramInt1, int paramInt2)
/*  93:    */   {
/*  94:108 */     List localList = paramamj.a(this.j.h, this.j.t.x);
/*  95:110 */     for (int i1 = 0; i1 < localList.size(); i1++) {
/*  96:111 */       if (i1 == 0) {
/*  97:112 */         localList.set(i1, paramamj.u().e + (String)localList.get(i1));
/*  98:    */       } else {
/*  99:114 */         localList.set(i1, net.minecraft.src.a.h + (String)localList.get(i1));
/* 100:    */       }
/* 101:    */     }
/* 102:118 */     a(localList, paramInt1, paramInt2);
/* 103:    */   }
/* 104:    */   
/* 105:    */   protected void a(String paramString, int paramInt1, int paramInt2)
/* 106:    */   {
/* 107:122 */     a(Arrays.asList(new String[] { paramString }), paramInt1, paramInt2);
/* 108:    */   }
/* 109:    */   
/* 110:    */   protected void a(List<String> paramList, int paramInt1, int paramInt2)
/* 111:    */   {
/* 112:126 */     if (paramList.isEmpty()) {
/* 113:127 */       return;
/* 114:    */     }
/* 115:130 */     cjm.C();
/* 116:131 */     bss.a();
/* 117:132 */     cjm.disableLighting();
/* 118:133 */     cjm.i();
/* 119:    */     
/* 120:135 */     int i1 = 0;
/* 121:136 */     for (String str1 : paramList)
/* 122:    */     {
/* 123:137 */       int i4 = this.q.a(str1);
/* 124:138 */       if (i4 > i1) {
/* 125:139 */         i1 = i4;
/* 126:    */       }
/* 127:    */     }
/* 128:143 */     int i2 = paramInt1 + 12;
/* 129:144 */     int i3 = paramInt2 - 12;
/* 130:    */     
/* 131:146 */     int i4 = i1;
/* 132:147 */     int i5 = 8;
/* 133:149 */     if (paramList.size() > 1) {
/* 134:150 */       i5 += 2 + (paramList.size() - 1) * 10;
/* 135:    */     }
/* 136:154 */     if (i2 + i1 > this.l) {
/* 137:155 */       i2 -= 28 + i1;
/* 138:    */     }
/* 139:159 */     if (i3 + i5 + 6 > this.m) {
/* 140:160 */       i3 = this.m - i5 - 6;
/* 141:    */     }
/* 142:163 */     this.e = 300.0F;
/* 143:164 */     this.k.a = 300.0F;
/* 144:    */     
/* 145:166 */     int i6 = -267386864;
/* 146:167 */     a(i2 - 3, i3 - 4, i2 + i4 + 3, i3 - 3, i6, i6);
/* 147:168 */     a(i2 - 3, i3 + i5 + 3, i2 + i4 + 3, i3 + i5 + 4, i6, i6);
/* 148:    */     
/* 149:170 */     a(i2 - 3, i3 - 3, i2 + i4 + 3, i3 + i5 + 3, i6, i6);
/* 150:171 */     a(i2 - 4, i3 - 3, i2 - 3, i3 + i5 + 3, i6, i6);
/* 151:172 */     a(i2 + i4 + 3, i3 - 3, i2 + i4 + 4, i3 + i5 + 3, i6, i6);
/* 152:    */     
/* 153:174 */     int i7 = 1347420415;
/* 154:175 */     int i8 = (i7 & 0xFEFEFE) >> 1 | i7 & 0xFF000000;
/* 155:    */     
/* 156:177 */     a(i2 - 3, i3 - 3 + 1, i2 - 3 + 1, i3 + i5 + 3 - 1, i7, i8);
/* 157:178 */     a(i2 + i4 + 2, i3 - 3 + 1, i2 + i4 + 3, i3 + i5 + 3 - 1, i7, i8);
/* 158:    */     
/* 159:180 */     a(i2 - 3, i3 - 3, i2 + i4 + 3, i3 - 3 + 1, i7, i7);
/* 160:181 */     a(i2 - 3, i3 + i5 + 2, i2 + i4 + 3, i3 + i5 + 3, i8, i8);
/* 161:183 */     for (int i9 = 0; i9 < paramList.size(); i9++)
/* 162:    */     {
/* 163:184 */       String str2 = (String)paramList.get(i9);
/* 164:    */       
/* 165:186 */       this.q.a(str2, i2, i3, -1);
/* 166:188 */       if (i9 == 0) {
/* 167:189 */         i3 += 2;
/* 168:    */       }
/* 169:191 */       i3 += 10;
/* 170:    */     }
/* 171:194 */     this.e = 0.0F;
/* 172:195 */     this.k.a = 0.0F;
/* 173:    */     
/* 174:197 */     cjm.enableLighting();
/* 175:198 */     cjm.j();
/* 176:199 */     bss.b();
/* 177:200 */     cjm.B();
/* 178:    */   }
/* 179:    */   
/* 180:    */   protected void a(ho paramho, int paramInt1, int paramInt2)
/* 181:    */   {
/* 182:204 */     if ((paramho == null) || (paramho.b().i() == null)) {
/* 183:205 */       return;
/* 184:    */     }
/* 185:208 */     hr localhr = paramho.b().i();
/* 186:    */     Object localObject1;
/* 187:209 */     if (localhr.a() == hs.c)
/* 188:    */     {
/* 189:210 */       localObject1 = null;
/* 190:    */       try
/* 191:    */       {
/* 192:213 */         NBTTagCompound localfn = gg.a(localhr.b().c());
/* 193:214 */         if ((localfn instanceof NBTTagCompound)) {
/* 194:215 */           localObject1 = ItemStack.loadItemStackFromNBT((NBTTagCompound)localfn);
/* 195:    */         }
/* 196:    */       }
/* 197:    */       catch (gf localgf2) {}
/* 198:219 */       if (localObject1 != null) {
/* 199:220 */         a((ItemStack)localObject1, paramInt1, paramInt2);
/* 200:    */       } else {
/* 201:222 */         a(net.minecraft.src.a.m + "Invalid Item!", paramInt1, paramInt2);
/* 202:    */       }
/* 203:    */     }
/* 204:    */     else
/* 205:    */     {
/* 206:    */       Object localObject2;
/* 207:    */       Object localObject3;
/* 208:    */       String str;
/* 209:224 */       if (localhr.a() == hs.d)
/* 210:    */       {
/* 211:225 */         if (this.j.t.x) {
/* 212:    */           try
/* 213:    */           {
/* 214:227 */             localObject1 = gg.a(localhr.b().c());
/* 215:228 */             if ((localObject1 instanceof NBTTagCompound))
/* 216:    */             {
/* 217:229 */               localObject2 = Lists.newArrayList();
/* 218:230 */               localObject3 = (NBTTagCompound)localObject1;
/* 219:231 */               ((List)localObject2).add(((NBTTagCompound)localObject3).getString("name"));
/* 220:232 */               if (((NBTTagCompound)localObject3).hasKey("type", 8))
/* 221:    */               {
/* 222:233 */                 str = ((NBTTagCompound)localObject3).getString("type");
/* 223:234 */                 ((List)localObject2).add("Type: " + str + " (" + EntityList.a(str) + ")");
/* 224:    */               }
/* 225:236 */               ((List)localObject2).add(((NBTTagCompound)localObject3).getString("id"));
/* 226:237 */               a((List)localObject2, paramInt1, paramInt2);
/* 227:    */             }
/* 228:    */             else
/* 229:    */             {
/* 230:239 */               a(net.minecraft.src.a.m + "Invalid Entity!", paramInt1, paramInt2);
/* 231:    */             }
/* 232:    */           }
/* 233:    */           catch (gf localgf1)
/* 234:    */           {
/* 235:242 */             a(net.minecraft.src.a.m + "Invalid Entity!", paramInt1, paramInt2);
/* 236:    */           }
/* 237:    */         }
/* 238:    */       }
/* 239:245 */       else if (localhr.a() == hs.a)
/* 240:    */       {
/* 241:246 */         a(g.splitToList(localhr.b().d()), paramInt1, paramInt2);
/* 242:    */       }
/* 243:247 */       else if (localhr.a() == hs.b)
/* 244:    */       {
/* 245:248 */         tq localtq = StatList.a(localhr.b().c());
/* 246:250 */         if (localtq != null)
/* 247:    */         {
/* 248:251 */           localObject2 = localtq.e();
/* 249:252 */           localObject3 = new hz("stats.tooltip.type." + (localtq.d() ? "achievement" : "statistic"), new Object[0]);
/* 250:253 */           ((ho)localObject3).b().b(Boolean.valueOf(true));
/* 251:254 */           str = (localtq instanceof tk) ? ((tk)localtq).f() : null;
/* 252:255 */           ArrayList localArrayList = Lists.newArrayList(new String[] { ((ho)localObject2).d(), ((ho)localObject3).d() });
/* 253:256 */           if (str != null) {
/* 254:257 */             localArrayList.addAll(this.q.c(str, 150));
/* 255:    */           }
/* 256:259 */           a(localArrayList, paramInt1, paramInt2);
/* 257:    */         }
/* 258:    */         else
/* 259:    */         {
/* 260:261 */           a(net.minecraft.src.a.m + "Invalid statistic/achievement!", paramInt1, paramInt2);
/* 261:    */         }
/* 262:    */       }
/* 263:    */     }
/* 264:264 */     cjm.disableLighting();
/* 265:    */   }
/* 266:    */   
/* 267:    */   protected void a(String paramString, boolean paramBoolean) {}
/* 268:    */   
/* 269:    */   protected boolean a(ho paramho)
/* 270:    */   {
/* 271:271 */     if (paramho == null) {
/* 272:272 */       return false;
/* 273:    */     }
/* 274:275 */     hm localhm = paramho.b().h();
/* 275:276 */     if (r())
/* 276:    */     {
/* 277:277 */       if (paramho.b().j() != null) {
/* 278:278 */         a(paramho.b().j(), false);
/* 279:    */       }
/* 280:    */     }
/* 281:280 */     else if (localhm != null)
/* 282:    */     {
/* 283:281 */       if (localhm.a() == hn.a)
/* 284:    */       {
/* 285:282 */         if (!this.j.t.n) {
/* 286:283 */           return false;
/* 287:    */         }
/* 288:    */         try
/* 289:    */         {
/* 290:286 */           URI localURI = new URI(localhm.b());
/* 291:288 */           if (!f.contains(localURI.getScheme().toLowerCase())) {
/* 292:289 */             throw new URISyntaxException(localhm.b(), "Unsupported protocol: " + localURI.getScheme().toLowerCase());
/* 293:    */           }
/* 294:292 */           if (this.j.t.o)
/* 295:    */           {
/* 296:293 */             this.t = localURI;
/* 297:294 */             this.j.a(new bvy(this, localhm.b(), 31102009, false));
/* 298:    */           }
/* 299:    */           else
/* 300:    */           {
/* 301:296 */             a(localURI);
/* 302:    */           }
/* 303:    */         }
/* 304:    */         catch (URISyntaxException localURISyntaxException)
/* 305:    */         {
/* 306:299 */           a.error("Can't open url for " + localhm, localURISyntaxException);
/* 307:    */         }
/* 308:    */       }
/* 309:    */       else
/* 310:    */       {
/* 311:    */         Object localObject;
/* 312:301 */         if (localhm.a() == hn.b)
/* 313:    */         {
/* 314:302 */           localObject = new File(localhm.b()).toURI();
/* 315:303 */           a((URI)localObject);
/* 316:    */         }
/* 317:304 */         else if (localhm.a() == hn.e)
/* 318:    */         {
/* 319:305 */           a(localhm.b(), true);
/* 320:    */         }
/* 321:306 */         else if (localhm.a() == hn.c)
/* 322:    */         {
/* 323:307 */           b(localhm.b(), false);
/* 324:    */         }
/* 325:308 */         else if (localhm.a() == hn.d)
/* 326:    */         {
/* 327:309 */           localObject = this.j.W().e(localhm.b());
/* 328:310 */           if (localObject != null) {
/* 329:311 */             this.j.a(new can(this.j.W(), (ChatUserInfo)localObject));
/* 330:    */           } else {
/* 331:313 */             a.error("Tried to handle twitch user but couldn't find them!");
/* 332:    */           }
/* 333:    */         }
/* 334:    */         else
/* 335:    */         {
/* 336:316 */           a.error("Don't know how to handle " + localhm);
/* 337:    */         }
/* 338:    */       }
/* 339:319 */       return true;
/* 340:    */     }
/* 341:321 */     return false;
/* 342:    */   }
/* 343:    */   
/* 344:    */   public void f(String paramString)
/* 345:    */   {
/* 346:325 */     b(paramString, true);
/* 347:    */   }
/* 348:    */   
/* 349:    */   public void b(String paramString, boolean paramBoolean)
/* 350:    */   {
/* 351:329 */     if (paramBoolean) {
/* 352:330 */       this.j.q.d().a(paramString);
/* 353:    */     }
/* 354:332 */     this.j.h.e(paramString);
/* 355:    */   }
/* 356:    */   
/* 357:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 358:    */   {
/* 359:336 */     if (paramInt3 == 0) {
/* 360:337 */       for (int i1 = 0; i1 < this.n.size(); i1++)
/* 361:    */       {
/* 362:338 */         bug localbug = (bug)this.n.get(i1);
/* 363:339 */         if (localbug.c(this.j, paramInt1, paramInt2))
/* 364:    */         {
/* 365:340 */           this.h = localbug;
/* 366:341 */           localbug.a(this.j.U());
/* 367:342 */           a(localbug);
/* 368:    */         }
/* 369:    */       }
/* 370:    */     }
/* 371:    */   }
/* 372:    */   
/* 373:    */   protected void b(int paramInt1, int paramInt2, int paramInt3)
/* 374:    */   {
/* 375:349 */     if ((this.h != null) && (paramInt3 == 0))
/* 376:    */     {
/* 377:350 */       this.h.a(paramInt1, paramInt2);
/* 378:351 */       this.h = null;
/* 379:    */     }
/* 380:    */   }
/* 381:    */   
/* 382:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, long paramLong) {}
/* 383:    */   
/* 384:    */   protected void a(bug parambug) {}
/* 385:    */   
/* 386:    */   public void a(bsu parambsu, int paramInt1, int paramInt2)
/* 387:    */   {
/* 388:362 */     this.j = parambsu;
/* 389:363 */     this.k = parambsu.af();
/* 390:364 */     this.q = parambsu.k;
/* 391:365 */     this.l = paramInt1;
/* 392:366 */     this.m = paramInt2;
/* 393:367 */     this.n.clear();
/* 394:368 */     b();
/* 395:    */   }
/* 396:    */   
/* 397:    */   public void b() {}
/* 398:    */   
/* 399:    */   public void p()
/* 400:    */   {
/* 401:380 */     if (Mouse.isCreated()) {
/* 402:381 */       while (Mouse.next()) {
/* 403:382 */         k();
/* 404:    */       }
/* 405:    */     }
/* 406:386 */     if (Keyboard.isCreated()) {
/* 407:387 */       while (Keyboard.next()) {
/* 408:388 */         l();
/* 409:    */       }
/* 410:    */     }
/* 411:    */   }
/* 412:    */   
/* 413:    */   public void k()
/* 414:    */   {
/* 415:394 */     int i1 = Mouse.getEventX() * this.l / this.j.d;
/* 416:395 */     int i2 = this.m - Mouse.getEventY() * this.m / this.j.e - 1;
/* 417:    */     
/* 418:397 */     int i3 = Mouse.getEventButton();
/* 419:399 */     if (Mouse.getEventButtonState())
/* 420:    */     {
/* 421:400 */       if ((this.j.t.z) && (this.s++ > 0)) {
/* 422:401 */         return;
/* 423:    */       }
/* 424:403 */       this.i = i3;
/* 425:404 */       this.r = bsu.I();
/* 426:405 */       a(i1, i2, this.i);
/* 427:    */     }
/* 428:406 */     else if (i3 != -1)
/* 429:    */     {
/* 430:407 */       if ((this.j.t.z) && (--this.s > 0)) {
/* 431:408 */         return;
/* 432:    */       }
/* 433:410 */       this.i = -1;
/* 434:411 */       b(i1, i2, i3);
/* 435:    */     }
/* 436:412 */     else if ((this.i != -1) && (this.r > 0L))
/* 437:    */     {
/* 438:413 */       long l1 = bsu.I() - this.r;
/* 439:414 */       a(i1, i2, this.i, l1);
/* 440:    */     }
/* 441:    */   }
/* 442:    */   
/* 443:    */   public void l()
/* 444:    */   {
/* 445:419 */     if (Keyboard.getEventKeyState()) {
/* 446:420 */       a(Keyboard.getEventCharacter(), Keyboard.getEventKey());
/* 447:    */     }
/* 448:423 */     this.j.X();
/* 449:    */   }
/* 450:    */   
/* 451:    */   public void e() {}
/* 452:    */   
/* 453:    */   public void m() {}
/* 454:    */   
/* 455:    */   public void c()
/* 456:    */   {
/* 457:433 */     b_(0);
/* 458:    */   }
/* 459:    */   
/* 460:    */   public void b_(int paramInt)
/* 461:    */   {
/* 462:437 */     if (this.j.f != null) {
/* 463:438 */       a(0, 0, this.l, this.m, -1072689136, -804253680);
/* 464:    */     } else {
/* 465:440 */       c(paramInt);
/* 466:    */     }
/* 467:    */   }
/* 468:    */   
/* 469:    */   public void c(int paramInt)
/* 470:    */   {
/* 471:445 */     cjm.disableLighting();
/* 472:446 */     cjm.n();
/* 473:447 */     ckx localckx = ckx.getInstance();
/* 474:448 */     VertexBuffer localciv = localckx.getBuffer();
/* 475:449 */     this.j.N().a(b);
/* 476:450 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 477:451 */     float f1 = 32.0F;
/* 478:452 */     localciv.begin();
/* 479:453 */     localciv.setColor(4210752);
/* 480:454 */     localciv.addVertexWithUV(0.0D, this.m, 0.0D, 0.0D, this.m / f1 + paramInt);
/* 481:455 */     localciv.addVertexWithUV(this.l, this.m, 0.0D, this.l / f1, this.m / f1 + paramInt);
/* 482:456 */     localciv.addVertexWithUV(this.l, 0.0D, 0.0D, this.l / f1, paramInt);
/* 483:457 */     localciv.addVertexWithUV(0.0D, 0.0D, 0.0D, 0.0D, paramInt);
/* 484:458 */     localckx.draw();
/* 485:    */   }
/* 486:    */   
/* 487:    */   public boolean d()
/* 488:    */   {
/* 489:462 */     return true;
/* 490:    */   }
/* 491:    */   
/* 492:    */   public void a(boolean paramBoolean, int paramInt)
/* 493:    */   {
/* 494:467 */     if (paramInt == 31102009)
/* 495:    */     {
/* 496:468 */       if (paramBoolean) {
/* 497:469 */         a(this.t);
/* 498:    */       }
/* 499:472 */       this.t = null;
/* 500:473 */       this.j.a(this);
/* 501:    */     }
/* 502:    */   }
/* 503:    */   
/* 504:    */   private void a(URI paramURI)
/* 505:    */   {
/* 506:    */     try
/* 507:    */     {
/* 508:479 */       Class localClass = Class.forName("java.awt.Desktop");
/* 509:480 */       Object localObject = localClass.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
/* 510:481 */       localClass.getMethod("browse", new Class[] { URI.class }).invoke(localObject, new Object[] { paramURI });
/* 511:    */     }
/* 512:    */     catch (Throwable localThrowable)
/* 513:    */     {
/* 514:483 */       a.error("Couldn't open link", localThrowable);
/* 515:    */     }
/* 516:    */   }
/* 517:    */   
/* 518:    */   public static boolean q()
/* 519:    */   {
/* 520:488 */     if (bsu.a) {
/* 521:489 */       return (Keyboard.isKeyDown(219)) || (Keyboard.isKeyDown(220));
/* 522:    */     }
/* 523:492 */     return (Keyboard.isKeyDown(29)) || (Keyboard.isKeyDown(157));
/* 524:    */   }
/* 525:    */   
/* 526:    */   public static boolean r()
/* 527:    */   {
/* 528:496 */     return (Keyboard.isKeyDown(42)) || (Keyboard.isKeyDown(54));
/* 529:    */   }
/* 530:    */   
/* 531:    */   public static boolean s()
/* 532:    */   {
/* 533:500 */     return (Keyboard.isKeyDown(56)) || (Keyboard.isKeyDown(184));
/* 534:    */   }
/* 535:    */   
/* 536:    */   public static boolean d(int paramInt)
/* 537:    */   {
/* 538:504 */     return (paramInt == 45) && (q());
/* 539:    */   }
/* 540:    */   
/* 541:    */   public static boolean e(int paramInt)
/* 542:    */   {
/* 543:508 */     return (paramInt == 47) && (q());
/* 544:    */   }
/* 545:    */   
/* 546:    */   public static boolean f(int paramInt)
/* 547:    */   {
/* 548:512 */     return (paramInt == 46) && (q());
/* 549:    */   }
/* 550:    */   
/* 551:    */   public static boolean g(int paramInt)
/* 552:    */   {
/* 553:516 */     return (paramInt == 30) && (q());
/* 554:    */   }
/* 555:    */   
/* 556:    */   public void b(bsu parambsu, int paramInt1, int paramInt2)
/* 557:    */   {
/* 558:520 */     a(parambsu, paramInt1, paramInt2);
/* 559:    */   }
/* 560:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxf
 * JD-Core Version:    0.7.0.1
 */
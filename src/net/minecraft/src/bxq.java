package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.io.BufferedReader;
/*   3:    */ import java.io.IOException;
/*   4:    */ import java.io.InputStreamReader;
/*   5:    */ import java.lang.reflect.Method;
/*   6:    */ import java.net.URI;
/*   7:    */ import java.util.ArrayList;
/*   8:    */ import java.util.Calendar;
/*   9:    */ import java.util.Date;
/*  10:    */ import java.util.List;
/*  11:    */ import java.util.Random;
/*  12:    */ import java.util.concurrent.atomic.AtomicInteger;
/*  13:    */ import net.minecraft.realms.RealmsBridge;
/*  14:    */ import org.apache.commons.io.Charsets;
/*  15:    */ import org.apache.logging.log4j.LogManager;
/*  16:    */ import org.apache.logging.log4j.Logger;
/*  17:    */ import org.lwjgl.opengl.ContextCapabilities;
/*  18:    */ import org.lwjgl.opengl.GL11;
/*  19:    */ import org.lwjgl.opengl.GLContext;
/*  20:    */ import org.lwjgl.util.glu.Project;
/*  21:    */ 
/*  22:    */ public class bxq
/*  23:    */   extends bxf
/*  24:    */   implements bvz
/*  25:    */ {
/*  26: 40 */   private static final AtomicInteger f = new AtomicInteger(0);
/*  27: 41 */   private static final Logger g = LogManager.getLogger();
/*  28: 42 */   private static final Random h = new Random();
/*  29:    */   private float i;
/*  30:    */   private String r;
/*  31:    */   private bug s;
/*  32:    */   private int t;
/*  33:    */   private ctp u;
/*  34: 60 */   private boolean v = true;
/*  35: 64 */   private final Object w = new Object();
/*  36:    */   private String x;
/*  37: 66 */   private String y = a;
/*  38:    */   private String z;
/*  39: 69 */   private static final oa A = new oa("texts/splashes.txt");
/*  40: 70 */   private static final oa B = new oa("textures/gui/title/minecraft.png");
/*  41: 71 */   private static final oa[] C = { new oa("textures/gui/title/background/panorama_0.png"), new oa("textures/gui/title/background/panorama_1.png"), new oa("textures/gui/title/background/panorama_2.png"), new oa("textures/gui/title/background/panorama_3.png"), new oa("textures/gui/title/background/panorama_4.png"), new oa("textures/gui/title/background/panorama_5.png") };
/*  42: 79 */   public static final String a = "Please click " + net.minecraft.src.a.t + "here" + net.minecraft.src.a.v + " for more information.";
/*  43:    */   private int D;
/*  44:    */   private int E;
/*  45:    */   private int F;
/*  46:    */   private int G;
/*  47:    */   private int H;
/*  48:    */   private int I;
/*  49:    */   private oa J;
/*  50:    */   private bug K;
/*  51:    */   
/*  52:    */   public bxq()
/*  53:    */   {
/*  54: 90 */     this.r = "missingno";
/*  55:    */     
/*  56: 92 */     BufferedReader localBufferedReader = null;
/*  57:    */     try
/*  58:    */     {
/*  59: 94 */       ArrayList localArrayList = Lists.newArrayList();
/*  60: 95 */       localBufferedReader = new BufferedReader(new InputStreamReader(bsu.z().O().a(A).b(), Charsets.UTF_8));
/*  61:    */       String str;
/*  62: 97 */       while ((str = localBufferedReader.readLine()) != null)
/*  63:    */       {
/*  64: 98 */         str = str.trim();
/*  65: 99 */         if (!str.isEmpty()) {
/*  66:100 */           localArrayList.add(str);
/*  67:    */         }
/*  68:    */       }
/*  69:104 */       if (!localArrayList.isEmpty()) {
/*  70:    */         do
/*  71:    */         {
/*  72:108 */           this.r = ((String)localArrayList.get(h.nextInt(localArrayList.size())));
/*  73:109 */         } while (this.r.hashCode() == 125780783);
/*  74:    */       }
/*  75:113 */       if (localBufferedReader != null) {
/*  76:    */         try
/*  77:    */         {
/*  78:115 */           localBufferedReader.close();
/*  79:    */         }
/*  80:    */         catch (IOException localIOException1) {}
/*  81:    */       }
/*  82:121 */       this.i = h.nextFloat();
/*  83:    */     }
/*  84:    */     catch (IOException localIOException2) {}finally
/*  85:    */     {
/*  86:113 */       if (localBufferedReader != null) {
/*  87:    */         try
/*  88:    */         {
/*  89:115 */           localBufferedReader.close();
/*  90:    */         }
/*  91:    */         catch (IOException localIOException4) {}
/*  92:    */       }
/*  93:    */     }
/*  94:123 */     this.x = "";
/*  95:124 */     if ((!GLContext.getCapabilities().OpenGL20) && (!dax.b()))
/*  96:    */     {
/*  97:125 */       this.x = cwc.a("title.oldgl1", new Object[0]);
/*  98:126 */       this.y = cwc.a("title.oldgl2", new Object[0]);
/*  99:127 */       this.z = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
/* 100:    */     }
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void e()
/* 104:    */   {
/* 105:133 */     this.t += 1;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public boolean d()
/* 109:    */   {
/* 110:138 */     return false;
/* 111:    */   }
/* 112:    */   
/* 113:    */   protected void a(char paramChar, int paramInt) {}
/* 114:    */   
/* 115:    */   public void b()
/* 116:    */   {
/* 117:147 */     this.u = new ctp(256, 256);
/* 118:148 */     this.J = this.j.N().a("background", this.u);
/* 119:    */     
/* 120:150 */     Calendar localCalendar = Calendar.getInstance();
/* 121:151 */     localCalendar.setTime(new Date());
/* 122:153 */     if ((localCalendar.get(2) + 1 == 11) && (localCalendar.get(5) == 9)) {
/* 123:154 */       this.r = "Happy birthday, ez!";
/* 124:155 */     } else if ((localCalendar.get(2) + 1 == 6) && (localCalendar.get(5) == 1)) {
/* 125:156 */       this.r = "Happy birthday, Notch!";
/* 126:157 */     } else if ((localCalendar.get(2) + 1 == 12) && (localCalendar.get(5) == 24)) {
/* 127:158 */       this.r = "Merry X-mas!";
/* 128:159 */     } else if ((localCalendar.get(2) + 1 == 1) && (localCalendar.get(5) == 1)) {
/* 129:160 */       this.r = "Happy new year!";
/* 130:161 */     } else if ((localCalendar.get(2) + 1 == 10) && (localCalendar.get(5) == 31)) {
/* 131:162 */       this.r = "OOoooOOOoooo! Spooky!";
/* 132:    */     }
/* 133:165 */     int j = 24;
/* 134:166 */     int k = this.m / 4 + 48;
/* 135:168 */     if (this.j.s()) {
/* 136:169 */       c(k, 24);
/* 137:    */     } else {
/* 138:171 */       b(k, 24);
/* 139:    */     }
/* 140:174 */     this.n.add(new bug(0, this.l / 2 - 100, k + 72 + 12, 98, 20, cwc.a("menu.options", new Object[0])));
/* 141:175 */     this.n.add(new bug(4, this.l / 2 + 2, k + 72 + 12, 98, 20, cwc.a("menu.quit", new Object[0])));
/* 142:176 */     this.n.add(new bup(5, this.l / 2 - 124, k + 72 + 12));
/* 143:178 */     synchronized (this.w)
/* 144:    */     {
/* 145:179 */       this.E = this.q.a(this.x);
/* 146:180 */       this.D = this.q.a(this.y);
/* 147:    */       
/* 148:182 */       int m = Math.max(this.E, this.D);
/* 149:183 */       this.F = ((this.l - m) / 2);
/* 150:184 */       this.G = (((bug)this.n.get(0)).i - 24);
/* 151:185 */       this.H = (this.F + m);
/* 152:186 */       this.I = (this.G + 24);
/* 153:    */     }
/* 154:    */   }
/* 155:    */   
/* 156:    */   private void b(int paramInt1, int paramInt2)
/* 157:    */   {
/* 158:191 */     this.n.add(new bug(1, this.l / 2 - 100, paramInt1, cwc.a("menu.singleplayer", new Object[0])));
/* 159:192 */     this.n.add(new bug(2, this.l / 2 - 100, paramInt1 + paramInt2 * 1, cwc.a("menu.multiplayer", new Object[0])));
/* 160:193 */     this.n.add(this.K = new bug(14, this.l / 2 - 100, paramInt1 + paramInt2 * 2, cwc.a("menu.online", new Object[0])));
/* 161:    */   }
/* 162:    */   
/* 163:    */   private void c(int paramInt1, int paramInt2)
/* 164:    */   {
/* 165:197 */     this.n.add(new bug(11, this.l / 2 - 100, paramInt1, cwc.a("menu.playdemo", new Object[0])));
/* 166:198 */     this.n.add(this.s = new bug(12, this.l / 2 - 100, paramInt1 + paramInt2 * 1, cwc.a("menu.resetdemo", new Object[0])));
/* 167:    */     
/* 168:200 */     bra localbra = this.j.f();
/* 169:201 */     WorldInfo localbqo = localbra.c("Demo_World");
/* 170:202 */     if (localbqo == null) {
/* 171:203 */       this.s.l = false;
/* 172:    */     }
/* 173:    */   }
/* 174:    */   
/* 175:    */   protected void a(bug parambug)
/* 176:    */   {
/* 177:209 */     if (parambug.k == 0) {
/* 178:210 */       this.j.a(new bwv(this, this.j.t));
/* 179:    */     }
/* 180:212 */     if (parambug.k == 5) {
/* 181:213 */       this.j.a(new bws(this, this.j.t, this.j.Q()));
/* 182:    */     }
/* 183:215 */     if (parambug.k == 1) {
/* 184:216 */       this.j.a(new bxg(this));
/* 185:    */     }
/* 186:218 */     if (parambug.k == 2) {
/* 187:219 */       this.j.a(new bzp(this));
/* 188:    */     }
/* 189:221 */     if ((parambug.k == 14) && (this.K.m)) {
/* 190:222 */       a();
/* 191:    */     }
/* 192:224 */     if (parambug.k == 4) {
/* 193:225 */       this.j.m();
/* 194:    */     }
/* 195:227 */     if (parambug.k == 11) {
/* 196:228 */       this.j.a("Demo_World", "Demo_World", qj.a);
/* 197:    */     }
/* 198:230 */     if (parambug.k == 12)
/* 199:    */     {
/* 200:231 */       bra localbra = this.j.f();
/* 201:232 */       WorldInfo localbqo = localbra.c("Demo_World");
/* 202:233 */       if (localbqo != null)
/* 203:    */       {
/* 204:234 */         bwa localbwa = bxg.a(this, localbqo.k(), 12);
/* 205:235 */         this.j.a(localbwa);
/* 206:    */       }
/* 207:    */     }
/* 208:    */   }
/* 209:    */   
/* 210:    */   private void a()
/* 211:    */   {
/* 212:241 */     RealmsBridge localRealmsBridge = new RealmsBridge();
/* 213:242 */     localRealmsBridge.switchToRealms(this);
/* 214:    */   }
/* 215:    */   
/* 216:    */   public void a(boolean paramBoolean, int paramInt)
/* 217:    */   {
/* 218:    */     Object localObject1;
/* 219:247 */     if ((paramBoolean) && (paramInt == 12))
/* 220:    */     {
/* 221:248 */       localObject1 = this.j.f();
/* 222:249 */       ((bra)localObject1).d();
/* 223:250 */       ((bra)localObject1).e("Demo_World");
/* 224:    */       
/* 225:252 */       this.j.a(this);
/* 226:    */     }
/* 227:253 */     else if (paramInt == 13)
/* 228:    */     {
/* 229:254 */       if (paramBoolean) {
/* 230:    */         try
/* 231:    */         {
/* 232:256 */           localObject1 = Class.forName("java.awt.Desktop");
/* 233:257 */           Object localObject2 = ((Class)localObject1).getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
/* 234:258 */           ((Class)localObject1).getMethod("browse", new Class[] { URI.class }).invoke(localObject2, new Object[] { new URI(this.z) });
/* 235:    */         }
/* 236:    */         catch (Throwable localThrowable)
/* 237:    */         {
/* 238:260 */           g.error("Couldn't open link", localThrowable);
/* 239:    */         }
/* 240:    */       }
/* 241:264 */       this.j.a(this);
/* 242:    */     }
/* 243:    */   }
/* 244:    */   
/* 245:    */   private void b(int paramInt1, int paramInt2, float paramFloat)
/* 246:    */   {
/* 247:269 */     ckx localckx = ckx.getInstance();
/* 248:270 */     VertexBuffer localciv = localckx.getBuffer();
/* 249:    */     
/* 250:272 */     cjm.glMatrixMode(5889);
/* 251:273 */     cjm.glPushMatrix();
/* 252:274 */     cjm.glLoadIdentity();
/* 253:    */     
/* 254:276 */     Project.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
/* 255:    */     
/* 256:278 */     cjm.glMatrixMode(5888);
/* 257:279 */     cjm.glPushMatrix();
/* 258:280 */     cjm.glLoadIdentity();
/* 259:281 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 260:    */     
/* 261:283 */     cjm.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
/* 262:284 */     cjm.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
/* 263:285 */     cjm.enableBlend();
/* 264:286 */     cjm.disableAlphaTest();
/* 265:287 */     cjm.p();
/* 266:288 */     cjm.a(false);
/* 267:289 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 268:290 */     int j = 8;
/* 269:292 */     for (int k = 0; k < j * j; k++)
/* 270:    */     {
/* 271:293 */       cjm.glPushMatrix();
/* 272:294 */       float f1 = (k % j / j - 0.5F) / 64.0F;
/* 273:295 */       float f2 = (k / j / j - 0.5F) / 64.0F;
/* 274:296 */       float f3 = 0.0F;
/* 275:297 */       cjm.glTranslatef(f1, f2, f3);
/* 276:    */       
/* 277:299 */       cjm.glRotatef(MathUtils.sin((this.t + paramFloat) / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
/* 278:300 */       cjm.glRotatef(-(this.t + paramFloat) * 0.1F, 0.0F, 1.0F, 0.0F);
/* 279:302 */       for (int m = 0; m < 6; m++)
/* 280:    */       {
/* 281:303 */         cjm.glPushMatrix();
/* 282:304 */         if (m == 1) {
/* 283:305 */           cjm.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 284:    */         }
/* 285:307 */         if (m == 2) {
/* 286:308 */           cjm.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/* 287:    */         }
/* 288:310 */         if (m == 3) {
/* 289:311 */           cjm.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
/* 290:    */         }
/* 291:313 */         if (m == 4) {
/* 292:314 */           cjm.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/* 293:    */         }
/* 294:316 */         if (m == 5) {
/* 295:317 */           cjm.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/* 296:    */         }
/* 297:319 */         this.j.N().a(C[m]);
/* 298:320 */         localciv.begin();
/* 299:321 */         localciv.setColor(16777215, 255 / (k + 1));
/* 300:322 */         float f4 = 0.0F;
/* 301:323 */         localciv.addVertexWithUV(-1.0D, -1.0D, 1.0D, 0.0F + f4, 0.0F + f4);
/* 302:324 */         localciv.addVertexWithUV(1.0D, -1.0D, 1.0D, 1.0F - f4, 0.0F + f4);
/* 303:325 */         localciv.addVertexWithUV(1.0D, 1.0D, 1.0D, 1.0F - f4, 1.0F - f4);
/* 304:326 */         localciv.addVertexWithUV(-1.0D, 1.0D, 1.0D, 0.0F + f4, 1.0F - f4);
/* 305:327 */         localckx.draw();
/* 306:328 */         cjm.glPopMatrix();
/* 307:    */       }
/* 308:330 */       cjm.glPopMatrix();
/* 309:331 */       cjm.a(true, true, true, false);
/* 310:    */     }
/* 311:333 */     localciv.c(0.0D, 0.0D, 0.0D);
/* 312:334 */     cjm.a(true, true, true, true);
/* 313:    */     
/* 314:336 */     cjm.glMatrixMode(5889);
/* 315:337 */     cjm.glPopMatrix();
/* 316:338 */     cjm.glMatrixMode(5888);
/* 317:339 */     cjm.glPopMatrix();
/* 318:340 */     cjm.a(true);
/* 319:341 */     cjm.o();
/* 320:    */     
/* 321:343 */     cjm.j();
/* 322:    */   }
/* 323:    */   
/* 324:    */   private void a(float paramFloat)
/* 325:    */   {
/* 326:347 */     this.j.N().a(this.J);
/* 327:348 */     GL11.glTexParameteri(3553, 10241, 9729);
/* 328:349 */     GL11.glTexParameteri(3553, 10240, 9729);
/* 329:350 */     GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);
/* 330:    */     
/* 331:352 */     cjm.enableBlend();
/* 332:353 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 333:354 */     cjm.a(true, true, true, false);
/* 334:355 */     ckx localckx = ckx.getInstance();
/* 335:356 */     VertexBuffer localciv = localckx.getBuffer();
/* 336:357 */     localciv.begin();
/* 337:    */     
/* 338:359 */     cjm.disableAlphaTest();
/* 339:360 */     int j = 3;
/* 340:361 */     for (int k = 0; k < j; k++)
/* 341:    */     {
/* 342:362 */       localciv.setColor(1.0F, 1.0F, 1.0F, 1.0F / (k + 1));
/* 343:363 */       int m = this.l;
/* 344:364 */       int n = this.m;
/* 345:365 */       float f1 = (k - j / 2) / 256.0F;
/* 346:366 */       localciv.addVertexWithUV(m, n, this.e, 0.0F + f1, 1.0D);
/* 347:367 */       localciv.addVertexWithUV(m, 0.0D, this.e, 1.0F + f1, 1.0D);
/* 348:368 */       localciv.addVertexWithUV(0.0D, 0.0D, this.e, 1.0F + f1, 0.0D);
/* 349:369 */       localciv.addVertexWithUV(0.0D, n, this.e, 0.0F + f1, 0.0D);
/* 350:    */     }
/* 351:371 */     localckx.draw();
/* 352:372 */     cjm.enableAlphaTest();
/* 353:    */     
/* 354:374 */     cjm.a(true, true, true, true);
/* 355:    */   }
/* 356:    */   
/* 357:    */   private void c(int paramInt1, int paramInt2, float paramFloat)
/* 358:    */   {
/* 359:378 */     this.j.b().e();
/* 360:379 */     cjm.b(0, 0, 256, 256);
/* 361:380 */     b(paramInt1, paramInt2, paramFloat);
/* 362:    */     
/* 363:382 */     a(paramFloat);
/* 364:383 */     a(paramFloat);
/* 365:384 */     a(paramFloat);
/* 366:385 */     a(paramFloat);
/* 367:386 */     a(paramFloat);
/* 368:387 */     a(paramFloat);
/* 369:388 */     a(paramFloat);
/* 370:389 */     this.j.b().a(true);
/* 371:390 */     cjm.b(0, 0, this.j.d, this.j.e);
/* 372:    */     
/* 373:392 */     ckx localckx = ckx.getInstance();
/* 374:393 */     VertexBuffer localciv = localckx.getBuffer();
/* 375:394 */     localciv.begin();
/* 376:    */     
/* 377:396 */     float f1 = this.l > this.m ? 120.0F / this.l : 120.0F / this.m;
/* 378:397 */     float f2 = this.m * f1 / 256.0F;
/* 379:398 */     float f3 = this.l * f1 / 256.0F;
/* 380:399 */     localciv.setColor(1.0F, 1.0F, 1.0F, 1.0F);
/* 381:400 */     int j = this.l;
/* 382:401 */     int k = this.m;
/* 383:402 */     localciv.addVertexWithUV(0.0D, k, this.e, 0.5F - f2, 0.5F + f3);
/* 384:403 */     localciv.addVertexWithUV(j, k, this.e, 0.5F - f2, 0.5F - f3);
/* 385:404 */     localciv.addVertexWithUV(j, 0.0D, this.e, 0.5F + f2, 0.5F - f3);
/* 386:405 */     localciv.addVertexWithUV(0.0D, 0.0D, this.e, 0.5F + f2, 0.5F + f3);
/* 387:406 */     localckx.draw();
/* 388:    */   }
/* 389:    */   
/* 390:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 391:    */   {
/* 392:411 */     cjm.disableAlphaTest();
/* 393:412 */     c(paramInt1, paramInt2, paramFloat);
/* 394:413 */     cjm.enableAlphaTest();
/* 395:414 */     ckx localckx = ckx.getInstance();
/* 396:415 */     VertexBuffer localciv = localckx.getBuffer();
/* 397:    */     
/* 398:417 */     int j = 274;
/* 399:418 */     int k = this.l / 2 - j / 2;
/* 400:419 */     int m = 30;
/* 401:    */     
/* 402:421 */     a(0, 0, this.l, this.m, -2130706433, 16777215);
/* 403:422 */     a(0, 0, this.l, this.m, 0, -2147483648);
/* 404:    */     
/* 405:424 */     this.j.N().a(B);
/* 406:425 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 407:427 */     if (this.i < 0.0001D)
/* 408:    */     {
/* 409:428 */       b(k + 0, m + 0, 0, 0, 99, 44);
/* 410:429 */       b(k + 99, m + 0, 129, 0, 27, 44);
/* 411:430 */       b(k + 99 + 26, m + 0, 126, 0, 3, 44);
/* 412:431 */       b(k + 99 + 26 + 3, m + 0, 99, 0, 26, 44);
/* 413:432 */       b(k + 155, m + 0, 0, 45, 155, 44);
/* 414:    */     }
/* 415:    */     else
/* 416:    */     {
/* 417:434 */       b(k + 0, m + 0, 0, 0, 155, 44);
/* 418:435 */       b(k + 155, m + 0, 0, 45, 155, 44);
/* 419:    */     }
/* 420:438 */     localciv.setColor(-1);
/* 421:439 */     cjm.glPushMatrix();
/* 422:440 */     cjm.glTranslatef(this.l / 2 + 90, 70.0F, 0.0F);
/* 423:    */     
/* 424:442 */     cjm.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
/* 425:443 */     float f1 = 1.8F - MathUtils.abs(MathUtils.sin((float)(bsu.I() % 1000L) / 1000.0F * 3.141593F * 2.0F) * 0.1F);
/* 426:    */     
/* 427:445 */     f1 = f1 * 100.0F / (this.q.a(this.r) + 32);
/* 428:446 */     cjm.glScalef(f1, f1, f1);
/* 429:447 */     a(this.q, this.r, 0, -8, -256);
/* 430:448 */     cjm.glPopMatrix();
/* 431:    */     
/* 432:450 */     String str1 = "Minecraft 1.8";
/* 433:451 */     if (this.j.s()) {
/* 434:452 */       str1 = str1 + " Demo";
/* 435:    */     }
/* 436:455 */     c(this.q, str1, 2, this.m - 10, -1);
/* 437:456 */     String str2 = "Copyright Mojang AB. Do not distribute!";
/* 438:457 */     c(this.q, str2, this.l - this.q.a(str2) - 2, this.m - 10, -1);
/* 439:459 */     if ((this.x != null) && (this.x.length() > 0))
/* 440:    */     {
/* 441:460 */       a(this.F - 2, this.G - 2, this.H + 2, this.I - 1, 1428160512);
/* 442:    */       
/* 443:462 */       c(this.q, this.x, this.F, this.G, -1);
/* 444:463 */       c(this.q, this.y, (this.l - this.D) / 2, ((bug)this.n.get(0)).i - 12, -1);
/* 445:    */     }
/* 446:466 */     super.a(paramInt1, paramInt2, paramFloat);
/* 447:    */   }
/* 448:    */   
/* 449:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 450:    */   {
/* 451:471 */     super.a(paramInt1, paramInt2, paramInt3);
/* 452:473 */     synchronized (this.w)
/* 453:    */     {
/* 454:474 */       if ((this.x.length() > 0) && (paramInt1 >= this.F) && (paramInt1 <= this.H) && (paramInt2 >= this.G) && (paramInt2 <= this.I))
/* 455:    */       {
/* 456:475 */         bvy localbvy = new bvy(this, this.z, 13, true);
/* 457:476 */         localbvy.f();
/* 458:477 */         this.j.a(localbvy);
/* 459:    */       }
/* 460:    */     }
/* 461:    */   }
/* 462:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxq
 * JD-Core Version:    0.7.0.1
 */
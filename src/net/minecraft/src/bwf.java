package net.minecraft.src;
/*   2:    */ import java.util.Random;
/*   3:    */ import org.apache.commons.lang3.StringUtils;
/*   4:    */ import org.lwjgl.input.Keyboard;
/*   5:    */ 
/*   6:    */ public class bwf
/*   7:    */   extends bxf
/*   8:    */ {
/*   9:    */   private bxf f;
/*  10:    */   private bul g;
/*  11:    */   private bul h;
/*  12:    */   private String i;
/*  13: 22 */   private String r = "survival";
/*  14:    */   private String s;
/*  15: 24 */   private boolean t = true;
/*  16:    */   private boolean u;
/*  17:    */   private boolean v;
/*  18:    */   private boolean w;
/*  19:    */   private boolean x;
/*  20:    */   private boolean y;
/*  21:    */   private boolean z;
/*  22:    */   private bug A;
/*  23:    */   private bug B;
/*  24:    */   private bug C;
/*  25:    */   private bug D;
/*  26:    */   private bug E;
/*  27:    */   private bug F;
/*  28:    */   private bug G;
/*  29:    */   private String H;
/*  30:    */   private String I;
/*  31:    */   private String J;
/*  32:    */   private String K;
/*  33:    */   private int L;
/*  34: 58 */   public String a = "";
/*  35:    */   
/*  36:    */   public bwf(bxf parambxf)
/*  37:    */   {
/*  38: 61 */     this.f = parambxf;
/*  39:    */     
/*  40: 63 */     this.J = "";
/*  41: 64 */     this.K = cwc.a("selectWorld.newWorld", new Object[0]);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void e()
/*  45:    */   {
/*  46: 69 */     this.g.a();
/*  47: 70 */     this.h.a();
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void b()
/*  51:    */   {
/*  52: 75 */     Keyboard.enableRepeatEvents(true);
/*  53: 76 */     this.n.clear();
/*  54: 77 */     this.n.add(new bug(0, this.l / 2 - 155, this.m - 28, 150, 20, cwc.a("selectWorld.create", new Object[0])));
/*  55: 78 */     this.n.add(new bug(1, this.l / 2 + 5, this.m - 28, 150, 20, cwc.a("gui.cancel", new Object[0])));
/*  56:    */     
/*  57: 80 */     this.n.add(this.A = new bug(2, this.l / 2 - 75, 115, 150, 20, cwc.a("selectWorld.gameMode", new Object[0])));
/*  58: 81 */     this.n.add(this.B = new bug(3, this.l / 2 - 75, 187, 150, 20, cwc.a("selectWorld.moreWorldOptions", new Object[0])));
/*  59:    */     
/*  60: 83 */     this.n.add(this.C = new bug(4, this.l / 2 - 155, 100, 150, 20, cwc.a("selectWorld.mapFeatures", new Object[0])));
/*  61: 84 */     this.C.m = false;
/*  62: 85 */     this.n.add(this.D = new bug(7, this.l / 2 + 5, 151, 150, 20, cwc.a("selectWorld.bonusItems", new Object[0])));
/*  63: 86 */     this.D.m = false;
/*  64: 87 */     this.n.add(this.E = new bug(5, this.l / 2 + 5, 100, 150, 20, cwc.a("selectWorld.mapType", new Object[0])));
/*  65: 88 */     this.E.m = false;
/*  66: 89 */     this.n.add(this.F = new bug(6, this.l / 2 - 155, 151, 150, 20, cwc.a("selectWorld.allowCommands", new Object[0])));
/*  67: 90 */     this.F.m = false;
/*  68: 91 */     this.n.add(this.G = new bug(8, this.l / 2 + 5, 120, 150, 20, cwc.a("selectWorld.customizeType", new Object[0])));
/*  69: 92 */     this.G.m = false;
/*  70:    */     
/*  71: 94 */     this.g = new bul(9, this.q, this.l / 2 - 100, 60, 200, 20);
/*  72: 95 */     this.g.b(true);
/*  73: 96 */     this.g.a(this.K);
/*  74:    */     
/*  75: 98 */     this.h = new bul(10, this.q, this.l / 2 - 100, 60, 200, 20);
/*  76: 99 */     this.h.a(this.J);
/*  77:    */     
/*  78:101 */     a(this.z);
/*  79:    */     
/*  80:103 */     a();
/*  81:104 */     f();
/*  82:    */   }
/*  83:    */   
/*  84:    */   private void a()
/*  85:    */   {
/*  86:108 */     this.i = this.g.b().trim();
/*  87:110 */     for (char c : net.minecraft.src.v.a) {
/*  88:111 */       this.i = this.i.replace(c, '_');
/*  89:    */     }
/*  90:114 */     if (StringUtils.isEmpty(this.i)) {
/*  91:115 */       this.i = "World";
/*  92:    */     }
/*  93:117 */     this.i = a(this.j.f(), this.i);
/*  94:    */   }
/*  95:    */   
/*  96:    */   private void f()
/*  97:    */   {
/*  98:121 */     this.A.j = (cwc.a("selectWorld.gameMode", new Object[0]) + ": " + cwc.a(new StringBuilder().append("selectWorld.gameMode.").append(this.r).toString(), new Object[0]));
/*  99:122 */     this.H = cwc.a("selectWorld.gameMode." + this.r + ".line1", new Object[0]);
/* 100:123 */     this.I = cwc.a("selectWorld.gameMode." + this.r + ".line2", new Object[0]);
/* 101:    */     
/* 102:125 */     this.C.j = (cwc.a("selectWorld.mapFeatures", new Object[0]) + " ");
/* 103:126 */     if (this.t) {
/* 104:127 */       this.C.j += cwc.a("options.on", new Object[0]);
/* 105:    */     } else {
/* 106:129 */       this.C.j += cwc.a("options.off", new Object[0]);
/* 107:    */     }
/* 108:131 */     this.D.j = (cwc.a("selectWorld.bonusItems", new Object[0]) + " ");
/* 109:132 */     if ((this.w) && (!this.x)) {
/* 110:133 */       this.D.j += cwc.a("options.on", new Object[0]);
/* 111:    */     } else {
/* 112:135 */       this.D.j += cwc.a("options.off", new Object[0]);
/* 113:    */     }
/* 114:137 */     this.E.j = (cwc.a("selectWorld.mapType", new Object[0]) + " " + cwc.a(WorldType.a[this.L].b(), new Object[0]));
/* 115:    */     
/* 116:139 */     this.F.j = (cwc.a("selectWorld.allowCommands", new Object[0]) + " ");
/* 117:140 */     if ((this.u) && (!this.x)) {
/* 118:141 */       this.F.j += cwc.a("options.on", new Object[0]);
/* 119:    */     } else {
/* 120:143 */       this.F.j += cwc.a("options.off", new Object[0]);
/* 121:    */     }
/* 122:    */   }
/* 123:    */   
/* 124:147 */   private static final String[] M = { "CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9" };
/* 125:    */   
/* 126:    */   public static String a(bra parambra, String paramString)
/* 127:    */   {
/* 128:152 */     paramString = paramString.replaceAll("[\\./\"]", "_");
/* 129:153 */     for (String str : M) {
/* 130:154 */       if (paramString.equalsIgnoreCase(str)) {
/* 131:155 */         paramString = "_" + paramString + "_";
/* 132:    */       }
/* 133:    */     }
/* 134:158 */     while (parambra.c(paramString) != null) {
/* 135:159 */       paramString = paramString + "-";
/* 136:    */     }
/* 137:161 */     return paramString;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void m()
/* 141:    */   {
/* 142:166 */     Keyboard.enableRepeatEvents(false);
/* 143:    */   }
/* 144:    */   
/* 145:    */   protected void a(bug parambug)
/* 146:    */   {
/* 147:171 */     if (!parambug.l) {
/* 148:172 */       return;
/* 149:    */     }
/* 150:175 */     if (parambug.k == 1)
/* 151:    */     {
/* 152:176 */       this.j.a(this.f);
/* 153:    */     }
/* 154:177 */     else if (parambug.k == 0)
/* 155:    */     {
/* 156:179 */       this.j.a((bxf)null);
/* 157:180 */       if (this.y) {
/* 158:181 */         return;
/* 159:    */       }
/* 160:183 */       this.y = true;
/* 161:    */       
/* 162:185 */       long l1 = new Random().nextLong();
/* 163:186 */       String str = this.h.b();
/* 164:188 */       if (!StringUtils.isEmpty(str)) {
/* 165:    */         try
/* 166:    */         {
/* 167:191 */           long l2 = Long.parseLong(str);
/* 168:192 */           if (l2 != 0L) {
/* 169:193 */             l1 = l2;
/* 170:    */           }
/* 171:    */         }
/* 172:    */         catch (NumberFormatException localNumberFormatException)
/* 173:    */         {
/* 174:197 */           l1 = str.hashCode();
/* 175:    */         }
/* 176:    */       }
/* 177:201 */       EnumGameMode localarc = EnumGameMode.a(this.r);
/* 178:202 */       WorldSettings localarb = new WorldSettings(l1, localarc, this.t, this.x, WorldType.a[this.L]);
/* 179:203 */       localarb.a(this.a);
/* 180:204 */       if ((this.w) && (!this.x)) {
/* 181:205 */         localarb.a();
/* 182:    */       }
/* 183:207 */       if ((this.u) && (!this.x)) {
/* 184:208 */         localarb.b();
/* 185:    */       }
/* 186:210 */       this.j.a(this.i, this.g.b().trim(), localarb);
/* 187:    */     }
/* 188:211 */     else if (parambug.k == 3)
/* 189:    */     {
/* 190:212 */       h();
/* 191:    */     }
/* 192:213 */     else if (parambug.k == 2)
/* 193:    */     {
/* 194:214 */       if (this.r.equals("survival"))
/* 195:    */       {
/* 196:215 */         if (!this.v) {
/* 197:216 */           this.u = false;
/* 198:    */         }
/* 199:218 */         this.x = false;
/* 200:219 */         this.r = "hardcore";
/* 201:220 */         this.x = true;
/* 202:221 */         this.F.l = false;
/* 203:222 */         this.D.l = false;
/* 204:223 */         f();
/* 205:    */       }
/* 206:224 */       else if (this.r.equals("hardcore"))
/* 207:    */       {
/* 208:225 */         if (!this.v) {
/* 209:226 */           this.u = true;
/* 210:    */         }
/* 211:228 */         this.x = false;
/* 212:229 */         this.r = "creative";
/* 213:230 */         f();
/* 214:231 */         this.x = false;
/* 215:232 */         this.F.l = true;
/* 216:233 */         this.D.l = true;
/* 217:    */       }
/* 218:    */       else
/* 219:    */       {
/* 220:235 */         if (!this.v) {
/* 221:236 */           this.u = false;
/* 222:    */         }
/* 223:238 */         this.r = "survival";
/* 224:239 */         f();
/* 225:240 */         this.F.l = true;
/* 226:241 */         this.D.l = true;
/* 227:242 */         this.x = false;
/* 228:    */       }
/* 229:244 */       f();
/* 230:    */     }
/* 231:245 */     else if (parambug.k == 4)
/* 232:    */     {
/* 233:246 */       this.t = (!this.t);
/* 234:247 */       f();
/* 235:    */     }
/* 236:248 */     else if (parambug.k == 7)
/* 237:    */     {
/* 238:249 */       this.w = (!this.w);
/* 239:250 */       f();
/* 240:    */     }
/* 241:251 */     else if (parambug.k == 5)
/* 242:    */     {
/* 243:252 */       this.L += 1;
/* 244:253 */       if (this.L >= WorldType.a.length) {
/* 245:254 */         this.L = 0;
/* 246:    */       }
/* 247:256 */       while (!g())
/* 248:    */       {
/* 249:257 */         this.L += 1;
/* 250:258 */         if (this.L >= WorldType.a.length) {
/* 251:259 */           this.L = 0;
/* 252:    */         }
/* 253:    */       }
/* 254:262 */       this.a = "";
/* 255:263 */       f();
/* 256:264 */       a(this.z);
/* 257:    */     }
/* 258:265 */     else if (parambug.k == 6)
/* 259:    */     {
/* 260:266 */       this.v = true;
/* 261:267 */       this.u = (!this.u);
/* 262:268 */       f();
/* 263:    */     }
/* 264:269 */     else if (parambug.k == 8)
/* 265:    */     {
/* 266:270 */       if (WorldType.a[this.L] == WorldType.FLAT) {
/* 267:271 */         this.j.a(new bwd(this, this.a));
/* 268:    */       } else {
/* 269:273 */         this.j.a(new bwj(this, this.a));
/* 270:    */       }
/* 271:    */     }
/* 272:    */   }
/* 273:    */   
/* 274:    */   private boolean g()
/* 275:    */   {
/* 276:279 */     WorldType localare = WorldType.a[this.L];
/* 277:280 */     if ((localare == null) || (!localare.e())) {
/* 278:281 */       return false;
/* 279:    */     }
/* 280:283 */     if (localare == WorldType.DEBUG_ALL_BLOCK_STATES) {
/* 281:284 */       return r();
/* 282:    */     }
/* 283:286 */     return true;
/* 284:    */   }
/* 285:    */   
/* 286:    */   private void h()
/* 287:    */   {
/* 288:290 */     a(!this.z);
/* 289:    */   }
/* 290:    */   
/* 291:    */   private void a(boolean paramBoolean)
/* 292:    */   {
/* 293:294 */     this.z = paramBoolean;
/* 294:296 */     if (WorldType.a[this.L] == WorldType.DEBUG_ALL_BLOCK_STATES)
/* 295:    */     {
/* 296:297 */       this.A.m = (!this.z);
/* 297:298 */       this.A.l = false;
/* 298:299 */       if (this.s == null) {
/* 299:300 */         this.s = this.r;
/* 300:    */       }
/* 301:302 */       this.r = "spectator";
/* 302:303 */       this.C.m = false;
/* 303:304 */       this.D.m = false;
/* 304:305 */       this.E.m = this.z;
/* 305:306 */       this.F.m = false;
/* 306:307 */       this.G.m = false;
/* 307:    */     }
/* 308:    */     else
/* 309:    */     {
/* 310:309 */       this.A.m = (!this.z);
/* 311:310 */       this.A.l = true;
/* 312:311 */       if (this.s != null)
/* 313:    */       {
/* 314:312 */         this.r = this.s;
/* 315:313 */         this.s = null;
/* 316:    */       }
/* 317:315 */       this.C.m = ((this.z) && (WorldType.a[this.L] != WorldType.f));
/* 318:316 */       this.D.m = this.z;
/* 319:317 */       this.E.m = this.z;
/* 320:318 */       this.F.m = this.z;
/* 321:319 */       this.G.m = ((this.z) && ((WorldType.a[this.L] == WorldType.FLAT) || (WorldType.a[this.L] == WorldType.f)));
/* 322:    */     }
/* 323:321 */     f();
/* 324:323 */     if (this.z) {
/* 325:324 */       this.B.j = cwc.a("gui.done", new Object[0]);
/* 326:    */     } else {
/* 327:326 */       this.B.j = cwc.a("selectWorld.moreWorldOptions", new Object[0]);
/* 328:    */     }
/* 329:    */   }
/* 330:    */   
/* 331:    */   protected void a(char paramChar, int paramInt)
/* 332:    */   {
/* 333:332 */     if ((this.g.m()) && (!this.z))
/* 334:    */     {
/* 335:333 */       this.g.a(paramChar, paramInt);
/* 336:334 */       this.K = this.g.b();
/* 337:    */     }
/* 338:335 */     else if ((this.h.m()) && (this.z))
/* 339:    */     {
/* 340:336 */       this.h.a(paramChar, paramInt);
/* 341:337 */       this.J = this.h.b();
/* 342:    */     }
/* 343:340 */     if ((paramInt == 28) || (paramInt == 156)) {
/* 344:341 */       a((bug)this.n.get(0));
/* 345:    */     }
/* 346:343 */     ((bug)this.n.get(0)).l = (this.g.b().length() > 0);
/* 347:    */     
/* 348:345 */     a();
/* 349:    */   }
/* 350:    */   
/* 351:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 352:    */   {
/* 353:350 */     super.a(paramInt1, paramInt2, paramInt3);
/* 354:352 */     if (this.z) {
/* 355:353 */       this.h.a(paramInt1, paramInt2, paramInt3);
/* 356:    */     } else {
/* 357:355 */       this.g.a(paramInt1, paramInt2, paramInt3);
/* 358:    */     }
/* 359:    */   }
/* 360:    */   
/* 361:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 362:    */   {
/* 363:361 */     c();
/* 364:    */     
/* 365:363 */     a(this.q, cwc.a("selectWorld.create", new Object[0]), this.l / 2, 20, -1);
/* 366:364 */     if (this.z)
/* 367:    */     {
/* 368:365 */       c(this.q, cwc.a("selectWorld.enterSeed", new Object[0]), this.l / 2 - 100, 47, -6250336);
/* 369:366 */       c(this.q, cwc.a("selectWorld.seedInfo", new Object[0]), this.l / 2 - 100, 85, -6250336);
/* 370:367 */       if (this.C.m) {
/* 371:368 */         c(this.q, cwc.a("selectWorld.mapFeatures.info", new Object[0]), this.l / 2 - 150, 122, -6250336);
/* 372:    */       }
/* 373:370 */       if (this.F.m) {
/* 374:371 */         c(this.q, cwc.a("selectWorld.allowCommands.info", new Object[0]), this.l / 2 - 150, 172, -6250336);
/* 375:    */       }
/* 376:373 */       this.h.g();
/* 377:375 */       if (WorldType.a[this.L].h()) {
/* 378:376 */         this.q.a(cwc.a(WorldType.a[this.L].c(), new Object[0]), this.E.h + 2, this.E.i + 22, this.E.b(), 10526880);
/* 379:    */       }
/* 380:    */     }
/* 381:    */     else
/* 382:    */     {
/* 383:379 */       c(this.q, cwc.a("selectWorld.enterName", new Object[0]), this.l / 2 - 100, 47, -6250336);
/* 384:380 */       c(this.q, cwc.a("selectWorld.resultFolder", new Object[0]) + " " + this.i, this.l / 2 - 100, 85, -6250336);
/* 385:381 */       this.g.g();
/* 386:    */       
/* 387:383 */       c(this.q, this.H, this.l / 2 - 100, 137, -6250336);
/* 388:384 */       c(this.q, this.I, this.l / 2 - 100, 149, -6250336);
/* 389:    */     }
/* 390:387 */     super.a(paramInt1, paramInt2, paramFloat);
/* 391:    */   }
/* 392:    */   
/* 393:    */   public void a(WorldInfo parambqo)
/* 394:    */   {
/* 395:391 */     this.K = cwc.a("selectWorld.newWorld.copyOf", new Object[] { parambqo.k() });
/* 396:392 */     this.J = (parambqo.b() + "");
/* 397:393 */     this.L = parambqo.u().g();
/* 398:394 */     this.a = parambqo.B();
/* 399:395 */     this.t = parambqo.s();
/* 400:396 */     this.u = parambqo.v();
/* 401:398 */     if (parambqo.isHardcore()) {
/* 402:399 */       this.r = "hardcore";
/* 403:400 */     } else if (parambqo.r().e()) {
/* 404:401 */       this.r = "survival";
/* 405:402 */     } else if (parambqo.r().d()) {
/* 406:403 */       this.r = "creative";
/* 407:    */     }
/* 408:    */   }
/* 409:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwf
 * JD-Core Version:    0.7.0.1
 */
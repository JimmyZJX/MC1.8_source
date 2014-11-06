package net.minecraft.src;
/*   1:    */ import com.google.common.base.Strings;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import com.mojang.authlib.properties.Property;
/*   4:    */ import java.util.Map;
/*   5:    */ import java.util.Set;
/*   6:    */ import org.apache.logging.log4j.LogManager;
/*   7:    */ import org.apache.logging.log4j.Logger;
/*   8:    */ import org.apache.logging.log4j.Marker;
/*   9:    */ import org.apache.logging.log4j.MarkerManager;
/*  10:    */ import org.lwjgl.opengl.GL11;
/*  11:    */ import tv.twitch.AuthToken;
/*  12:    */ import tv.twitch.ErrorCode;
/*  13:    */ import tv.twitch.broadcast.ChannelInfo;
/*  14:    */ import tv.twitch.broadcast.EncodingCpuUsage;
/*  15:    */ import tv.twitch.broadcast.FrameBuffer;
/*  16:    */ import tv.twitch.broadcast.GameInfo;
/*  17:    */ import tv.twitch.broadcast.IngestList;
/*  18:    */ import tv.twitch.broadcast.IngestServer;
/*  19:    */ import tv.twitch.broadcast.StreamInfo;
/*  20:    */ import tv.twitch.broadcast.VideoParams;
/*  21:    */ import tv.twitch.chat.ChatRawMessage;
/*  22:    */ import tv.twitch.chat.ChatTokenizedMessage;
/*  23:    */ import tv.twitch.chat.ChatUserInfo;
/*  24:    */ import tv.twitch.chat.ChatUserMode;
/*  25:    */ import tv.twitch.chat.ChatUserSubscription;
/*  26:    */ 
/*  27:    */ public class daq
/*  28:    */   implements czz, dah, dam, dao
/*  29:    */ {
/*  30: 44 */   private static final Logger b = LogManager.getLogger();
/*  31: 45 */   public static final Marker a = MarkerManager.getMarker("STREAM");
/*  32:    */   private final czu c;
/*  33:    */   private final daa d;
/*  34:    */   private String e;
/*  35:    */   private final bsu f;
/*  36: 54 */   private final ho g = new hy("Twitch");
/*  37: 55 */   private final Map<String,ChatUserInfo> h = Maps.newHashMap();
/*  38:    */   private ckw i;
/*  39:    */   private boolean j;
/*  40: 58 */   private int k = 30;
/*  41: 59 */   private long l = 0L;
/*  42: 60 */   private boolean m = false;
/*  43:    */   private boolean n;
/*  44:    */   private boolean o;
/*  45:    */   private boolean p;
/*  46: 64 */   private dap q = dap.a;
/*  47:    */   private static boolean r;
/*  48:    */   
/*  49:    */   public daq(bsu parambsu, Property paramProperty)
/*  50:    */   {
/*  51: 67 */     this.f = parambsu;
/*  52: 68 */     this.c = new czu();
/*  53: 69 */     this.d = new daa();
/*  54:    */     
/*  55: 71 */     this.c.a(this);
/*  56: 72 */     this.d.a(this);
/*  57:    */     
/*  58: 74 */     this.c.a("nmt37qblda36pvonovdkbopzfzw3wlq");
/*  59: 75 */     this.d.a("nmt37qblda36pvonovdkbopzfzw3wlq");
/*  60:    */     
/*  61: 77 */     this.g.b().a(net.minecraft.src.a.f);
/*  62: 79 */     if ((paramProperty != null) && (!Strings.isNullOrEmpty(paramProperty.getValue())) && (dax.k))
/*  63:    */     {
/*  64: 80 */       dar localdar = new dar(this, "Twitch authenticator", paramProperty);
/*  65:    */       
/*  66:    */ 
/*  67:    */ 
/*  68:    */ 
/*  69:    */ 
/*  70:    */ 
/*  71:    */ 
/*  72:    */ 
/*  73:    */ 
/*  74:    */ 
/*  75:    */ 
/*  76:    */ 
/*  77:    */ 
/*  78:    */ 
/*  79:    */ 
/*  80:    */ 
/*  81:    */ 
/*  82:    */ 
/*  83:    */ 
/*  84:    */ 
/*  85:    */ 
/*  86:    */ 
/*  87:    */ 
/*  88:    */ 
/*  89:    */ 
/*  90:    */ 
/*  91:    */ 
/*  92:    */ 
/*  93:    */ 
/*  94:    */ 
/*  95:    */ 
/*  96:    */ 
/*  97:    */ 
/*  98:    */ 
/*  99:    */ 
/* 100:    */ 
/* 101:    */ 
/* 102:    */ 
/* 103:119 */       localdar.setDaemon(true);
/* 104:120 */       localdar.start();
/* 105:    */     }
/* 106:    */   }
/* 107:    */   
/* 108:    */   static
/* 109:    */   {
/* 110:    */     try
/* 111:    */     {
/* 112:131 */       if (w.a() == x.c)
/* 113:    */       {
/* 114:132 */         System.loadLibrary("avutil-ttv-51");
/* 115:133 */         System.loadLibrary("swresample-ttv-0");
/* 116:134 */         System.loadLibrary("libmp3lame-ttv");
/* 117:136 */         if (System.getProperty("os.arch").contains("64")) {
/* 118:137 */           System.loadLibrary("libmfxsw64");
/* 119:    */         } else {
/* 120:139 */           System.loadLibrary("libmfxsw32");
/* 121:    */         }
/* 122:    */       }
/* 123:142 */       r = true;
/* 124:    */     }
/* 125:    */     catch (Throwable localThrowable)
/* 126:    */     {
/* 127:144 */       r = false;
/* 128:    */     }
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void f()
/* 132:    */   {
/* 133:150 */     b.debug(a, "Shutdown streaming");
/* 134:    */     
/* 135:152 */     this.c.E();
/* 136:    */     
/* 137:    */ 
/* 138:    */ 
/* 139:156 */     this.d.p();
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void g()
/* 143:    */   {
/* 144:161 */     int i1 = this.f.t.R;
/* 145:162 */     int i2 = (this.e != null) && (this.d.d(this.e)) ? 1 : 0;
/* 146:163 */     int i3 = (this.d.h() == daf.c) && ((this.e == null) || (this.d.e(this.e) == dad.e)) ? 1 : 0;
/* 147:165 */     if (i1 == 2)
/* 148:    */     {
/* 149:166 */       if (i2 != 0)
/* 150:    */       {
/* 151:167 */         b.debug(a, "Disconnecting from twitch chat per user options");
/* 152:168 */         this.d.l(this.e);
/* 153:    */       }
/* 154:    */     }
/* 155:170 */     else if (i1 == 1)
/* 156:    */     {
/* 157:171 */       if ((i3 != 0) && (this.c.q()))
/* 158:    */       {
/* 159:172 */         b.debug(a, "Connecting to twitch chat per user options");
/* 160:173 */         F();
/* 161:    */       }
/* 162:    */     }
/* 163:175 */     else if (i1 == 0) {
/* 164:176 */       if ((i2 != 0) && (!k()))
/* 165:    */       {
/* 166:177 */         b.debug(a, "Disconnecting from twitch chat as user is no longer streaming");
/* 167:178 */         this.d.l(this.e);
/* 168:    */       }
/* 169:179 */       else if ((i3 != 0) && (k()))
/* 170:    */       {
/* 171:180 */         b.debug(a, "Connecting to twitch chat as user is streaming");
/* 172:181 */         F();
/* 173:    */       }
/* 174:    */     }
/* 175:185 */     this.c.K();
/* 176:186 */     this.d.q();
/* 177:    */   }
/* 178:    */   
/* 179:    */   protected void F()
/* 180:    */   {
/* 181:190 */     daf localdaf = this.d.h();
/* 182:191 */     String str = this.c.l().name;
/* 183:192 */     this.e = str;
/* 184:194 */     if (localdaf != daf.c) {
/* 185:195 */       b.warn("Invalid twitch chat state {}", new Object[] { localdaf });
/* 186:196 */     } else if (this.d.e(this.e) == dad.e) {
/* 187:197 */       this.d.j(str);
/* 188:    */     } else {
/* 189:199 */       b.warn("Invalid twitch chat state {}", new Object[] { localdaf });
/* 190:    */     }
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void h()
/* 194:    */   {
/* 195:205 */     if ((!this.c.m()) || (this.c.p())) {
/* 196:206 */       return;
/* 197:    */     }
/* 198:209 */     long l1 = System.nanoTime();
/* 199:210 */     long l2 = 1000000000 / this.k;
/* 200:    */     
/* 201:212 */     long l3 = l1 - this.l;
/* 202:213 */     int i1 = l3 >= l2 ? 1 : 0;
/* 203:215 */     if (i1 != 0)
/* 204:    */     {
/* 205:216 */       FrameBuffer localFrameBuffer = this.c.Q();
/* 206:    */       
/* 207:218 */       ckw localckw = this.f.b();
/* 208:    */       
/* 209:220 */       this.i.a(true);
/* 210:    */       
/* 211:222 */       cjm.glMatrixMode(5889);
/* 212:223 */       cjm.glPushMatrix();
/* 213:224 */       cjm.glLoadIdentity();
/* 214:    */       
/* 215:226 */       cjm.glOrtho(0.0D, this.i.c, this.i.d, 0.0D, 1000.0D, 3000.0D);
/* 216:227 */       cjm.glMatrixMode(5888);
/* 217:228 */       cjm.glPushMatrix();
/* 218:229 */       cjm.glLoadIdentity();
/* 219:    */       
/* 220:231 */       cjm.glTranslatef(0.0F, 0.0F, -2000.0F);
/* 221:232 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 222:    */       
/* 223:234 */       cjm.b(0, 0, this.i.c, this.i.d);
/* 224:    */       
/* 225:236 */       cjm.w();
/* 226:237 */       cjm.disableAlphaTest();
/* 227:238 */       cjm.disableBlend();
/* 228:    */       
/* 229:240 */       float f1 = this.i.c;
/* 230:241 */       float f2 = this.i.d;
/* 231:242 */       float f3 = localckw.c / localckw.a;
/* 232:243 */       float f4 = localckw.d / localckw.b;
/* 233:    */       
/* 234:245 */       localckw.c();
/* 235:246 */       GL11.glTexParameterf(3553, 10241, 9729.0F);
/* 236:247 */       GL11.glTexParameterf(3553, 10240, 9729.0F);
/* 237:    */       
/* 238:249 */       ckx localckx = ckx.getInstance();
/* 239:250 */       VertexBuffer localciv = localckx.getBuffer();
/* 240:251 */       localciv.begin();
/* 241:252 */       localciv.addVertexWithUV(0.0D, f2, 0.0D, 0.0D, f4);
/* 242:253 */       localciv.addVertexWithUV(f1, f2, 0.0D, f3, f4);
/* 243:254 */       localciv.addVertexWithUV(f1, 0.0D, 0.0D, f3, 0.0D);
/* 244:255 */       localciv.addVertexWithUV(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/* 245:256 */       localckx.draw();
/* 246:    */       
/* 247:258 */       localckw.d();
/* 248:    */       
/* 249:260 */       cjm.glPopMatrix();
/* 250:261 */       cjm.glMatrixMode(5889);
/* 251:262 */       cjm.glPopMatrix();
/* 252:263 */       cjm.glMatrixMode(5888);
/* 253:    */       
/* 254:265 */       this.c.a(localFrameBuffer);
/* 255:266 */       this.i.e();
/* 256:    */       
/* 257:268 */       this.c.b(localFrameBuffer);
/* 258:269 */       this.l = l1;
/* 259:    */     }
/* 260:    */   }
/* 261:    */   
/* 262:    */   public boolean i()
/* 263:    */   {
/* 264:275 */     return this.c.q();
/* 265:    */   }
/* 266:    */   
/* 267:    */   public boolean j()
/* 268:    */   {
/* 269:280 */     return this.c.n();
/* 270:    */   }
/* 271:    */   
/* 272:    */   public boolean k()
/* 273:    */   {
/* 274:285 */     return this.c.m();
/* 275:    */   }
/* 276:    */   
/* 277:    */   public void a(czs paramczs, long paramLong)
/* 278:    */   {
/* 279:290 */     if ((!k()) || (!this.j)) {
/* 280:291 */       return;
/* 281:    */     }
/* 282:293 */     long l1 = this.c.x();
/* 283:295 */     if (!this.c.a(paramczs.c(), l1 + paramLong, paramczs.a(), paramczs.b())) {
/* 284:296 */       b.warn(a, "Couldn't send stream metadata action at {}: {}", new Object[] { Long.valueOf(l1 + paramLong), paramczs });
/* 285:    */     } else {
/* 286:298 */       b.debug(a, "Sent stream metadata action at {}: {}", new Object[] { Long.valueOf(l1 + paramLong), paramczs });
/* 287:    */     }
/* 288:    */   }
/* 289:    */   
/* 290:    */   public void a(czs paramczs, long paramLong1, long paramLong2)
/* 291:    */   {
/* 292:304 */     if ((!k()) || (!this.j)) {
/* 293:305 */       return;
/* 294:    */     }
/* 295:307 */     long l1 = this.c.x();
/* 296:308 */     String str1 = paramczs.a();
/* 297:309 */     String str2 = paramczs.b();
/* 298:    */     
/* 299:311 */     long l2 = this.c.b(paramczs.c(), l1 + paramLong1, str1, str2);
/* 300:312 */     if (l2 < 0L) {
/* 301:313 */       b.warn(a, "Could not send stream metadata sequence from {} to {}: {}", new Object[] { Long.valueOf(l1 + paramLong1), Long.valueOf(l1 + paramLong2), paramczs });
/* 302:315 */     } else if (this.c.a(paramczs.c(), l1 + paramLong2, l2, str1, str2)) {
/* 303:316 */       b.debug(a, "Sent stream metadata sequence from {} to {}: {}", new Object[] { Long.valueOf(l1 + paramLong1), Long.valueOf(l1 + paramLong2), paramczs });
/* 304:    */     } else {
/* 305:318 */       b.warn(a, "Half-sent stream metadata sequence from {} to {}: {}", new Object[] { Long.valueOf(l1 + paramLong1), Long.valueOf(l1 + paramLong2), paramczs });
/* 306:    */     }
/* 307:    */   }
/* 308:    */   
/* 309:    */   public boolean l()
/* 310:    */   {
/* 311:325 */     return this.c.p();
/* 312:    */   }
/* 313:    */   
/* 314:    */   public void m()
/* 315:    */   {
/* 316:330 */     if (this.c.G()) {
/* 317:331 */       b.debug(a, "Requested commercial from Twitch");
/* 318:    */     } else {
/* 319:333 */       b.warn(a, "Could not request commercial from Twitch");
/* 320:    */     }
/* 321:    */   }
/* 322:    */   
/* 323:    */   public void n()
/* 324:    */   {
/* 325:339 */     this.c.I();
/* 326:340 */     this.o = true;
/* 327:    */     
/* 328:342 */     p();
/* 329:    */   }
/* 330:    */   
/* 331:    */   public void o()
/* 332:    */   {
/* 333:347 */     this.c.J();
/* 334:348 */     this.o = false;
/* 335:    */     
/* 336:350 */     p();
/* 337:    */   }
/* 338:    */   
/* 339:    */   public void p()
/* 340:    */   {
/* 341:355 */     if (k())
/* 342:    */     {
/* 343:356 */       float f1 = this.f.t.L;
/* 344:357 */       int i1 = (this.o) || (f1 <= 0.0F) ? 1 : 0;
/* 345:358 */       this.c.b(i1 != 0 ? 0.0F : f1);
/* 346:    */       
/* 347:360 */       this.c.a(D() ? 0.0F : this.f.t.K);
/* 348:    */     }
/* 349:    */   }
/* 350:    */   
/* 351:    */   public void q()
/* 352:    */   {
/* 353:366 */     bto localbto = this.f.t;
/* 354:367 */     VideoParams localVideoParams = this.c.a(b(localbto.M), a(localbto.N), c(localbto.J), this.f.d / this.f.e);
/* 355:369 */     switch (localbto.O)
/* 356:    */     {
/* 357:    */     case 2: 
/* 358:371 */       localVideoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
/* 359:372 */       break;
/* 360:    */     case 1: 
/* 361:374 */       localVideoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_MEDIUM;
/* 362:375 */       break;
/* 363:    */     case 0: 
/* 364:377 */       localVideoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_LOW;
/* 365:    */     }
/* 366:381 */     if (this.i == null) {
/* 367:382 */       this.i = new ckw(localVideoParams.outputWidth, localVideoParams.outputHeight, false);
/* 368:    */     } else {
/* 369:384 */       this.i.a(localVideoParams.outputWidth, localVideoParams.outputHeight);
/* 370:    */     }
/* 371:387 */     if ((localbto.Q != null) && (localbto.Q.length() > 0)) {
/* 372:388 */       for (IngestServer localIngestServer : s()) {
/* 373:389 */         if (localIngestServer.serverUrl.equals(localbto.Q))
/* 374:    */         {
/* 375:390 */           this.c.a(localIngestServer);
/* 376:391 */           break;
/* 377:    */         }
/* 378:    */       }
/* 379:    */     }
/* 380:396 */     this.k = localVideoParams.targetFps;
/* 381:397 */     this.j = localbto.P;
/* 382:398 */     this.c.a(localVideoParams);
/* 383:    */     
/* 384:400 */     b.info(a, "Streaming at {}/{} at {} kbps to {}", new Object[] { Integer.valueOf(localVideoParams.outputWidth), Integer.valueOf(localVideoParams.outputHeight), Integer.valueOf(localVideoParams.maxKbps), this.c.s().serverUrl });
/* 385:401 */     this.c.a(null, "Minecraft", null);
/* 386:    */   }
/* 387:    */   
/* 388:    */   public void r()
/* 389:    */   {
/* 390:406 */     if (this.c.H()) {
/* 391:407 */       b.info(a, "Stopped streaming to Twitch");
/* 392:    */     } else {
/* 393:409 */       b.warn(a, "Could not stop streaming to Twitch");
/* 394:    */     }
/* 395:    */   }
/* 396:    */   
/* 397:    */   public void a(ErrorCode paramErrorCode)
/* 398:    */   {
/* 399:419 */     if (ErrorCode.succeeded(paramErrorCode))
/* 400:    */     {
/* 401:420 */       b.debug(a, "Login attempt successful");
/* 402:421 */       this.n = true;
/* 403:    */     }
/* 404:    */     else
/* 405:    */     {
/* 406:423 */       b.warn(a, "Login attempt unsuccessful: {} (error code {})", new Object[] { ErrorCode.getString(paramErrorCode), Integer.valueOf(paramErrorCode.getValue()) });
/* 407:424 */       this.n = false;
/* 408:    */     }
/* 409:    */   }
/* 410:    */   
/* 411:    */   public void a(czy paramczy)
/* 412:    */   {
/* 413:434 */     b.debug(a, "Broadcast state changed to {}", new Object[] { paramczy });
/* 414:436 */     if (paramczy == czy.b) {
/* 415:437 */       this.c.a(czy.d);
/* 416:    */     }
/* 417:    */   }
/* 418:    */   
/* 419:    */   public void a()
/* 420:    */   {
/* 421:443 */     b.info(a, "Logged out of twitch");
/* 422:    */   }
/* 423:    */   
/* 424:    */   public void a(StreamInfo paramStreamInfo)
/* 425:    */   {
/* 426:448 */     b.debug(a, "Stream info updated; {} viewers on stream ID {}", new Object[] { Integer.valueOf(paramStreamInfo.viewers), Long.valueOf(paramStreamInfo.streamId) });
/* 427:    */   }
/* 428:    */   
/* 429:    */   public void b(ErrorCode paramErrorCode)
/* 430:    */   {
/* 431:457 */     b.warn(a, "Issue submitting frame: {} (Error code {})", new Object[] { ErrorCode.getString(paramErrorCode), Integer.valueOf(paramErrorCode.getValue()) });
/* 432:458 */     this.f.q.d().a(new hy("Issue streaming frame: " + paramErrorCode + " (" + ErrorCode.getString(paramErrorCode) + ")"), 2);
/* 433:    */   }
/* 434:    */   
/* 435:    */   public void b()
/* 436:    */   {
/* 437:463 */     p();
/* 438:464 */     b.info(a, "Broadcast to Twitch has started");
/* 439:    */   }
/* 440:    */   
/* 441:    */   public void c()
/* 442:    */   {
/* 443:469 */     b.info(a, "Broadcast to Twitch has stopped");
/* 444:    */   }
/* 445:    */   
/* 446:    */   public void c(ErrorCode paramErrorCode)
/* 447:    */   {
/* 448:    */     hz localhz1;
/* 449:474 */     if (paramErrorCode == ErrorCode.TTV_EC_SOUNDFLOWER_NOT_INSTALLED)
/* 450:    */     {
/* 451:475 */       localhz1 = new hz("stream.unavailable.soundflower.chat.link", new Object[0]);
/* 452:476 */       localhz1.b().a(new hm(hn.a, "https://help.mojang.com/customer/portal/articles/1374877-configuring-soundflower-for-streaming-on-apple-computers"));
/* 453:477 */       localhz1.b().d(Boolean.valueOf(true));
/* 454:478 */       hz localhz2 = new hz("stream.unavailable.soundflower.chat", new Object[] { localhz1 });
/* 455:479 */       localhz2.b().a(net.minecraft.src.a.e);
/* 456:480 */       this.f.q.d().a(localhz2);
/* 457:    */     }
/* 458:    */     else
/* 459:    */     {
/* 460:482 */       localhz1 = new hz("stream.unavailable.unknown.chat", new Object[] { ErrorCode.getString(paramErrorCode) });
/* 461:483 */       localhz1.b().a(net.minecraft.src.a.e);
/* 462:484 */       this.f.q.d().a(localhz1);
/* 463:    */     }
/* 464:    */   }
/* 465:    */   
/* 466:    */   public void a(dai paramdai, dan paramdan)
/* 467:    */   {
/* 468:490 */     b.debug(a, "Ingest test state changed to {}", new Object[] { paramdan });
/* 469:491 */     if (paramdan == dan.f) {
/* 470:492 */       this.m = true;
/* 471:    */     }
/* 472:    */   }
/* 473:    */   
/* 474:    */   public static int a(float paramFloat)
/* 475:    */   {
/* 476:497 */     return MathUtils.floor(10.0F + paramFloat * 50.0F);
/* 477:    */   }
/* 478:    */   
/* 479:    */   public static int b(float paramFloat)
/* 480:    */   {
/* 481:501 */     return MathUtils.floor(230.0F + paramFloat * 3270.0F);
/* 482:    */   }
/* 483:    */   
/* 484:    */   public static float c(float paramFloat)
/* 485:    */   {
/* 486:505 */     return 0.1F + paramFloat * 0.1F;
/* 487:    */   }
/* 488:    */   
/* 489:    */   public IngestServer[] s()
/* 490:    */   {
/* 491:510 */     return this.c.t().getServers();
/* 492:    */   }
/* 493:    */   
/* 494:    */   public void u()
/* 495:    */   {
/* 496:520 */     dai localdai = this.c.M();
/* 497:521 */     if (localdai != null) {
/* 498:522 */       localdai.a(this);
/* 499:    */     }
/* 500:    */   }
/* 501:    */   
/* 502:    */   public dai v()
/* 503:    */   {
/* 504:528 */     return this.c.w();
/* 505:    */   }
/* 506:    */   
/* 507:    */   public boolean w()
/* 508:    */   {
/* 509:533 */     return this.c.o();
/* 510:    */   }
/* 511:    */   
/* 512:    */   public int x()
/* 513:    */   {
/* 514:538 */     return k() ? this.c.j().viewers : 0;
/* 515:    */   }
/* 516:    */   
/* 517:    */   public void d(ErrorCode paramErrorCode)
/* 518:    */   {
/* 519:543 */     if (ErrorCode.failed(paramErrorCode)) {
/* 520:545 */       b.error(a, "Chat failed to initialize");
/* 521:    */     }
/* 522:    */   }
/* 523:    */   
/* 524:    */   public void e(ErrorCode paramErrorCode)
/* 525:    */   {
/* 526:551 */     if (ErrorCode.failed(paramErrorCode)) {
/* 527:553 */       b.error(a, "Chat failed to shutdown");
/* 528:    */     }
/* 529:    */   }
/* 530:    */   
/* 531:    */   public void a(String paramString, ChatRawMessage[] paramArrayOfChatRawMessage)
/* 532:    */   {
/* 533:563 */     for (ChatRawMessage localChatRawMessage : paramArrayOfChatRawMessage)
/* 534:    */     {
/* 535:564 */       a(localChatRawMessage.userName, localChatRawMessage);
/* 536:566 */       if (a(localChatRawMessage.modes, localChatRawMessage.subscriptions, this.f.t.S))
/* 537:    */       {
/* 538:567 */         hy localhy1 = new hy(localChatRawMessage.userName);
/* 539:568 */         hz localhz = new hz("chat.stream." + (localChatRawMessage.action ? "emote" : "text"), new Object[] { this.g, localhy1, net.minecraft.src.a.a(localChatRawMessage.message) });
/* 540:570 */         if (localChatRawMessage.action) {
/* 541:571 */           localhz.b().b(Boolean.valueOf(true));
/* 542:    */         }
/* 543:574 */         hy localhy2 = new hy("");
/* 544:575 */         localhy2.a(new hz("stream.userinfo.chatTooltip", new Object[0]));
/* 545:577 */         for (ho localho : can.a(localChatRawMessage.modes, localChatRawMessage.subscriptions, null))
/* 546:    */         {
/* 547:578 */           localhy2.a("\n");
/* 548:579 */           localhy2.a(localho);
/* 549:    */         }
/* 550:582 */         localhy1.b().a(new hr(hs.a, localhy2));
/* 551:583 */         localhy1.b().a(new hm(hn.d, localChatRawMessage.userName));
/* 552:    */         
/* 553:585 */         this.f.q.d().a(localhz);
/* 554:    */       }
/* 555:    */     }
/* 556:    */   }
/* 557:    */   
/* 558:    */   private void a(String paramString, ChatRawMessage paramChatRawMessage)
/* 559:    */   {
/* 560:596 */     ChatUserInfo localChatUserInfo = (ChatUserInfo)this.h.get(paramString);
/* 561:598 */     if (localChatUserInfo == null)
/* 562:    */     {
/* 563:599 */       localChatUserInfo = new ChatUserInfo();
/* 564:600 */       localChatUserInfo.displayName = paramString;
/* 565:601 */       this.h.put(paramString, localChatUserInfo);
/* 566:    */     }
/* 567:604 */     localChatUserInfo.subscriptions = paramChatRawMessage.subscriptions;
/* 568:605 */     localChatUserInfo.modes = paramChatRawMessage.modes;
/* 569:606 */     localChatUserInfo.nameColorARGB = paramChatRawMessage.nameColorARGB;
/* 570:    */   }
/* 571:    */   
/* 572:    */   private boolean a(Set<ChatUserMode> paramSet1, Set<ChatUserSubscription> paramSet2, int paramInt)
/* 573:    */   {
/* 574:610 */     if (paramSet1.contains(ChatUserMode.TTV_CHAT_USERMODE_BANNED)) {
/* 575:611 */       return false;
/* 576:    */     }
/* 577:613 */     if (paramSet1.contains(ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR)) {
/* 578:614 */       return true;
/* 579:    */     }
/* 580:616 */     if (paramSet1.contains(ChatUserMode.TTV_CHAT_USERMODE_MODERATOR)) {
/* 581:617 */       return true;
/* 582:    */     }
/* 583:619 */     if (paramSet1.contains(ChatUserMode.TTV_CHAT_USERMODE_STAFF)) {
/* 584:620 */       return true;
/* 585:    */     }
/* 586:623 */     if (paramInt == 0) {
/* 587:624 */       return true;
/* 588:    */     }
/* 589:625 */     if (paramInt == 1) {
/* 590:626 */       return paramSet2.contains(ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER);
/* 591:    */     }
/* 592:629 */     return false;
/* 593:    */   }
/* 594:    */   
/* 595:    */   public void a(String paramString, ChatUserInfo[] paramArrayOfChatUserInfo1, ChatUserInfo[] paramArrayOfChatUserInfo2, ChatUserInfo[] paramArrayOfChatUserInfo3)
/* 596:    */   {
/* 598:634 */     for (ChatUserInfo localChatUserInfo : paramArrayOfChatUserInfo2) {
/* 599:635 */       this.h.remove(localChatUserInfo.displayName);
/* 600:    */     }
/* 601:638 */     for (ChatUserInfo localChatUserInfo : paramArrayOfChatUserInfo3) {
/* 602:639 */       this.h.put(localChatUserInfo.displayName, localChatUserInfo);
/* 603:    */     }
/* 604:642 */     for (ChatUserInfo localChatUserInfo : paramArrayOfChatUserInfo1) {
/* 605:643 */       this.h.put(localChatUserInfo.displayName, localChatUserInfo);
/* 606:    */     }
/* 607:    */   }
/* 608:    */   
/* 609:    */   public void a(String paramString)
/* 610:    */   {
/* 611:649 */     b.debug(a, "Chat connected");
/* 612:    */   }
/* 613:    */   
/* 614:    */   public void b(String paramString)
/* 615:    */   {
/* 616:654 */     b.debug(a, "Chat disconnected");
/* 617:655 */     this.h.clear();
/* 618:    */   }
/* 619:    */   
/* 620:    */   public boolean y()
/* 621:    */   {
/* 622:680 */     return (this.e != null) && (this.e.equals(this.c.l().name));
/* 623:    */   }
/* 624:    */   
/* 625:    */   public String z()
/* 626:    */   {
/* 627:685 */     return this.e;
/* 628:    */   }
/* 629:    */   
/* 630:    */   public ChatUserInfo e(String paramString)
/* 631:    */   {
/* 632:690 */     return (ChatUserInfo)this.h.get(paramString);
/* 633:    */   }
/* 634:    */   
/* 635:    */   public void f(String paramString)
/* 636:    */   {
/* 637:695 */     this.d.a(this.e, paramString);
/* 638:    */   }
/* 639:    */   
/* 640:    */   public boolean A()
/* 641:    */   {
/* 642:700 */     return (r) && (this.c.b());
/* 643:    */   }
/* 644:    */   
/* 645:    */   public ErrorCode B()
/* 646:    */   {
/* 647:705 */     if (!r) {
/* 648:706 */       return ErrorCode.TTV_EC_OS_TOO_OLD;
/* 649:    */     }
/* 650:709 */     return this.c.A();
/* 651:    */   }
/* 652:    */   
/* 653:    */   public boolean C()
/* 654:    */   {
/* 655:714 */     return this.n;
/* 656:    */   }
/* 657:    */   
/* 658:    */   public void a(boolean paramBoolean)
/* 659:    */   {
/* 660:719 */     this.p = paramBoolean;
/* 661:720 */     p();
/* 662:    */   }
/* 663:    */   
/* 664:    */   public boolean D()
/* 665:    */   {
/* 666:725 */     boolean i1 = this.f.t.T == 1;
/* 667:    */     
/* 668:727 */     return (this.o) || (this.f.t.K <= 0.0F) || (i1 != this.p);
/* 669:    */   }
/* 670:    */   
/* 671:    */   public dap E()
/* 672:    */   {
/* 673:732 */     return this.q;
/* 674:    */   }
/* 675:    */   
/* 676:    */   public void a(ErrorCode paramErrorCode, AuthToken paramAuthToken) {}
/* 677:    */   
/* 678:    */   public void a(ErrorCode paramErrorCode, GameInfo[] paramArrayOfGameInfo) {}
/* 679:    */   
/* 680:    */   public void a(IngestList paramIngestList) {}
/* 681:    */   
/* 682:    */   public void a(daf paramdaf) {}
/* 683:    */   
/* 684:    */   public void a(String paramString, ChatTokenizedMessage[] paramArrayOfChatTokenizedMessage) {}
/* 685:    */   
/* 686:    */   public void a(String paramString1, String paramString2) {}
/* 687:    */   
/* 688:    */   public void d() {}
/* 689:    */   
/* 690:    */   public void e() {}
/* 691:    */   
/* 692:    */   public void c(String paramString) {}
/* 693:    */   
/* 694:    */   public void d(String paramString) {}
				static Logger G() {return b;}
				static czu a(daq arg0) {return arg0.c;}
				static daa b(daq arg0) {return arg0.d;}
				static dap a(daq arg0, dap arg1) {return arg0.q=arg1;}
/* 695:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     daq
 * JD-Core Version:    0.7.0.1
 */
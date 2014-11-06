package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   3:    */ import java.util.List;
/*   4:    */ import tv.twitch.ErrorCode;
/*   5:    */ import tv.twitch.broadcast.AudioParams;
/*   6:    */ import tv.twitch.broadcast.EncodingCpuUsage;
/*   7:    */ import tv.twitch.broadcast.FrameBuffer;
/*   8:    */ import tv.twitch.broadcast.IStatCallbacks;
/*   9:    */ import tv.twitch.broadcast.IStreamCallbacks;
/*  10:    */ import tv.twitch.broadcast.IngestList;
/*  11:    */ import tv.twitch.broadcast.IngestServer;
/*  12:    */ import tv.twitch.broadcast.PixelFormat;
/*  13:    */ import tv.twitch.broadcast.RTMPState;
/*  14:    */ import tv.twitch.broadcast.StartFlags;
/*  15:    */ import tv.twitch.broadcast.Stream;
/*  16:    */ import tv.twitch.broadcast.VideoParams;
/*  17:    */ 
/*  18:    */ public class dai
/*  19:    */ {
/*  20: 40 */   protected dam a = null;
/*  21: 42 */   protected Stream b = null;
/*  22: 43 */   protected IngestList c = null;
/*  23: 45 */   protected dan d = dan.a;
/*  24: 46 */   protected long e = 8000L;
/*  25: 47 */   protected long f = 2000L;
/*  26: 48 */   protected long g = 0L;
/*  27: 49 */   protected RTMPState h = RTMPState.Invalid;
/*  28: 50 */   protected VideoParams i = null;
/*  29: 51 */   protected AudioParams j = null;
/*  30: 52 */   protected long k = 0L;
/*  31: 53 */   protected List<FrameBuffer> l = null;
/*  32: 54 */   protected boolean m = false;
/*  33: 55 */   protected IStreamCallbacks n = null;
/*  34: 56 */   protected IStatCallbacks o = null;
/*  35: 57 */   protected IngestServer p = null;
/*  36: 58 */   protected boolean q = false;
/*  37: 59 */   protected boolean r = false;
/*  38: 60 */   protected int s = -1;
/*  39: 61 */   protected int t = 0;
/*  40: 62 */   protected long u = 0L;
/*  41: 63 */   protected float v = 0.0F;
/*  42: 64 */   protected float w = 0.0F;
/*  43: 65 */   protected boolean x = false;
/*  44: 66 */   protected boolean y = false;
/*  45: 67 */   protected boolean z = false;
/*  46:    */   
/*  47:    */   public void a(dam paramdam)
/*  48:    */   {
/*  49: 71 */     this.a = paramdam;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public IngestServer c()
/*  53:    */   {
/*  54: 85 */     return this.p;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public int d()
/*  58:    */   {
/*  59: 90 */     return this.s;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public boolean f()
/*  63:    */   {
/*  64:100 */     return (this.d == dan.f) || (this.d == dan.h) || (this.d == dan.i);
/*  65:    */   }
/*  66:    */   
/*  67:    */   public float i()
/*  68:    */   {
/*  69:127 */     return this.w;
/*  70:    */   }
/*  71:    */   
/*  72:130 */   protected IStreamCallbacks A = new daj(this);
/*  73:245 */   protected IStatCallbacks B = new dak(this);
/*  74:    */   
/*  75:    */   public dai(Stream paramStream, IngestList paramIngestList)
/*  76:    */   {
/*  77:265 */     this.b = paramStream;
/*  78:266 */     this.c = paramIngestList;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void j()
/*  82:    */   {
/*  83:275 */     if (this.d != dan.a) {
/*  84:277 */       return;
/*  85:    */     }
/*  86:280 */     this.s = 0;
/*  87:281 */     this.q = false;
/*  88:282 */     this.r = false;
/*  89:283 */     this.x = false;
/*  90:284 */     this.y = false;
/*  91:285 */     this.z = false;
/*  92:    */     
/*  93:287 */     this.o = this.b.getStatCallbacks();
/*  94:288 */     this.b.setStatCallbacks(this.B);
/*  95:    */     
/*  96:290 */     this.n = this.b.getStreamCallbacks();
/*  97:291 */     this.b.setStreamCallbacks(this.A);
/*  98:    */     
/*  99:293 */     this.i = new VideoParams();
/* 100:294 */     this.i.targetFps = 60;
/* 101:295 */     this.i.maxKbps = 3500;
/* 102:296 */     this.i.outputWidth = 1280;
/* 103:297 */     this.i.outputHeight = 720;
/* 104:298 */     this.i.pixelFormat = PixelFormat.TTV_PF_BGRA;
/* 105:299 */     this.i.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
/* 106:300 */     this.i.disableAdaptiveBitrate = true;
/* 107:301 */     this.i.verticalFlip = false;
/* 108:    */     
/* 109:303 */     this.b.getDefaultParams(this.i);
/* 110:    */     
/* 111:305 */     this.j = new AudioParams();
/* 112:306 */     this.j.audioEnabled = false;
/* 113:307 */     this.j.enableMicCapture = false;
/* 114:308 */     this.j.enablePlaybackCapture = false;
/* 115:309 */     this.j.enablePassthroughAudio = false;
/* 116:    */     
/* 117:311 */     this.l = Lists.newArrayList();
/* 118:    */     
/* 119:    */ 
/* 120:314 */     int i1 = 3;
/* 121:316 */     for (int i2 = 0; i2 < i1; i2++)
/* 122:    */     {
/* 123:318 */       FrameBuffer localFrameBuffer = this.b.allocateFrameBuffer(this.i.outputWidth * this.i.outputHeight * 4);
/* 124:319 */       if (!localFrameBuffer.getIsValid())
/* 125:    */       {
/* 126:321 */         p();
/* 127:322 */         a(dan.i);
/* 128:323 */         return;
/* 129:    */       }
/* 130:326 */       this.l.add(localFrameBuffer);
/* 131:    */       
/* 132:328 */       this.b.randomizeFrameBuffer(localFrameBuffer);
/* 133:    */     }
/* 134:331 */     a(dan.b);
/* 135:    */     
/* 136:333 */     this.k = System.currentTimeMillis();
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void k()
/* 140:    */   {
/* 141:341 */     if ((f()) || (this.d == dan.a)) {
/* 142:343 */       return;
/* 143:    */     }
/* 144:347 */     if ((this.y) || (this.z)) {
/* 145:349 */       return;
/* 146:    */     }
/* 147:352 */     switch (dal.b[this.d.ordinal()])
/* 148:    */     {
/* 149:    */     case 1: 
/* 150:    */     case 2: 
/* 151:358 */       if (this.p != null)
/* 152:    */       {
/* 153:360 */         if ((this.r) || (!this.m)) {
/* 154:362 */           this.p.bitrateKbps = 0.0F;
/* 155:    */         }
/* 156:365 */         b(this.p);
/* 157:    */       }
/* 158:    */       else
/* 159:    */       {
/* 160:370 */         this.k = 0L;
/* 161:371 */         this.r = false;
/* 162:372 */         this.m = true;
/* 163:374 */         if (this.d != dan.b) {
/* 164:376 */           this.s += 1;
/* 165:    */         }
/* 166:380 */         if (this.s < this.c.getServers().length)
/* 167:    */         {
/* 168:382 */           this.p = this.c.getServers()[this.s];
/* 169:383 */           a(this.p);
/* 170:    */         }
/* 171:    */         else
/* 172:    */         {
/* 173:388 */           a(dan.f);
/* 174:    */         }
/* 175:    */       }
/* 176:392 */       break;
/* 177:    */     case 3: 
/* 178:    */     case 4: 
/* 179:397 */       c(this.p);
/* 180:398 */       break;
/* 181:    */     case 5: 
/* 182:402 */       a(dan.h);
/* 183:403 */       break;
/* 184:    */     }
/* 185:411 */     o();
/* 186:414 */     if ((this.d == dan.h) || (this.d == dan.f)) {
/* 187:416 */       p();
/* 188:    */     }
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void m()
/* 192:    */   {
/* 193:446 */     if ((f()) || (this.q)) {
/* 194:448 */       return;
/* 195:    */     }
/* 196:451 */     this.q = true;
/* 197:453 */     if (this.p != null) {
/* 198:455 */       this.p.bitrateKbps = 0.0F;
/* 199:    */     }
/* 200:    */   }
/* 201:    */   
/* 202:    */   protected boolean a(IngestServer paramIngestServer)
/* 203:    */   {
/* 204:462 */     this.m = true;
/* 205:463 */     this.g = 0L;
/* 206:464 */     this.h = RTMPState.Idle;
/* 207:465 */     this.p = paramIngestServer;
/* 208:    */     
/* 209:    */ 
/* 210:468 */     this.y = true;
/* 211:469 */     a(dan.c);
/* 212:    */     
/* 213:471 */     ErrorCode localErrorCode = this.b.start(this.i, this.j, paramIngestServer, StartFlags.TTV_Start_BandwidthTest, true);
/* 214:472 */     if (ErrorCode.failed(localErrorCode))
/* 215:    */     {
/* 216:474 */       this.y = false;
/* 217:475 */       this.m = false;
/* 218:476 */       a(dan.e);
/* 219:477 */       return false;
/* 220:    */     }
/* 221:481 */     this.u = this.g;
/* 222:    */     
/* 223:483 */     paramIngestServer.bitrateKbps = 0.0F;
/* 224:484 */     this.t = 0;
/* 225:    */     
/* 226:486 */     return true;
/* 227:    */   }
/* 228:    */   
/* 229:    */   protected void b(IngestServer paramIngestServer)
/* 230:    */   {
/* 231:493 */     if (this.y)
/* 232:    */     {
/* 233:496 */       this.r = true;
/* 234:    */     }
/* 235:498 */     else if (this.x)
/* 236:    */     {
/* 237:500 */       this.z = true;
/* 238:    */       
/* 239:502 */       ErrorCode localErrorCode = this.b.stop(true);
/* 240:503 */       if (ErrorCode.failed(localErrorCode))
/* 241:    */       {
/* 242:506 */         this.A.stopCallback(ErrorCode.TTV_EC_SUCCESS);
/* 243:    */         
/* 244:508 */         System.out.println("Stop failed: " + localErrorCode.toString());
/* 245:    */       }
/* 246:511 */       this.b.pollStats();
/* 247:    */     }
/* 248:    */     else
/* 249:    */     {
/* 250:516 */       this.A.stopCallback(ErrorCode.TTV_EC_SUCCESS);
/* 251:    */     }
/* 252:    */   }
/* 253:    */   
/* 254:    */   protected long n()
/* 255:    */   {
/* 256:522 */     return System.currentTimeMillis() - this.k;
/* 257:    */   }
/* 258:    */   
/* 259:    */   protected void o()
/* 260:    */   {
/* 261:527 */     float f1 = (float)n();
/* 262:529 */     switch (dal.b[this.d.ordinal()])
/* 263:    */     {
/* 264:    */     case 1: 
/* 265:    */     case 3: 
/* 266:    */     case 6: 
/* 267:    */     case 7: 
/* 268:    */     case 8: 
/* 269:    */     case 9: 
/* 270:538 */       this.w = 0.0F;
/* 271:539 */       break;
/* 272:    */     case 2: 
/* 273:543 */       this.w = 1.0F;
/* 274:544 */       break;
/* 275:    */     case 4: 
/* 276:    */     case 5: 
/* 277:    */     default: 
/* 278:548 */       this.w = (f1 / (float)this.e);
/* 279:    */     }
/* 280:553 */     switch (dal.b[this.d.ordinal()])
/* 281:    */     {
/* 282:    */     case 7: 
/* 283:    */     case 8: 
/* 284:    */     case 9: 
/* 285:559 */       this.v = 1.0F;
/* 286:560 */       break;
/* 287:    */     default: 
/* 288:564 */       this.v = (this.s / this.c.getServers().length);
/* 289:565 */       this.v += this.w / this.c.getServers().length;
/* 290:    */     }
/* 291:    */   }
/* 292:    */   
/* 293:    */   protected boolean c(IngestServer paramIngestServer)
/* 294:    */   {
/* 295:573 */     if ((this.r) || (this.q) || (n() >= this.e))
/* 296:    */     {
/* 297:575 */       a(dan.e);
/* 298:576 */       return true;
/* 299:    */     }
/* 300:579 */     if ((this.y) || (this.z)) {
/* 301:581 */       return true;
/* 302:    */     }
/* 303:584 */     ErrorCode localErrorCode = this.b.submitVideoFrame((FrameBuffer)this.l.get(this.t));
/* 304:585 */     if (ErrorCode.failed(localErrorCode))
/* 305:    */     {
/* 306:587 */       this.m = false;
/* 307:588 */       a(dan.e);
/* 308:589 */       return false;
/* 309:    */     }
/* 310:592 */     this.t = ((this.t + 1) % this.l.size());
/* 311:    */     
/* 312:594 */     this.b.pollStats();
/* 313:597 */     if (this.h == RTMPState.SendVideo)
/* 314:    */     {
/* 315:599 */       a(dan.d);
/* 316:    */       
/* 317:601 */       long l1 = n();
/* 318:602 */       if ((l1 > 0L) && (this.g > this.u))
/* 319:    */       {
/* 320:604 */         paramIngestServer.bitrateKbps = ((float)(this.g * 8L) / (float)n());
/* 321:605 */         this.u = this.g;
/* 322:    */       }
/* 323:    */     }
/* 324:609 */     return true;
/* 325:    */   }
/* 326:    */   
/* 327:    */   protected void p()
/* 328:    */   {
/* 329:614 */     this.p = null;
/* 330:617 */     if (this.l != null)
/* 331:    */     {
/* 332:619 */       for (int i1 = 0; i1 < this.l.size(); i1++) {
/* 333:621 */         ((FrameBuffer)this.l.get(i1)).free();
/* 334:    */       }
/* 335:624 */       this.l = null;
/* 336:    */     }
/* 337:627 */     if (this.b.getStatCallbacks() == this.B)
/* 338:    */     {
/* 339:629 */       this.b.setStatCallbacks(this.o);
/* 340:630 */       this.o = null;
/* 341:    */     }
/* 342:633 */     if (this.b.getStreamCallbacks() == this.A)
/* 343:    */     {
/* 344:635 */       this.b.setStreamCallbacks(this.n);
/* 345:636 */       this.n = null;
/* 346:    */     }
/* 347:    */   }
/* 348:    */   
/* 349:    */   protected void a(dan paramdan)
/* 350:    */   {
/* 351:642 */     if (paramdan == this.d) {
/* 352:644 */       return;
/* 353:    */     }
/* 354:647 */     this.d = paramdan;
/* 355:649 */     if (this.a != null) {
/* 356:651 */       this.a.a(this, paramdan);
/* 357:    */     }
/* 358:    */   }
/* 359:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dai
 * JD-Core Version:    0.7.0.1
 */
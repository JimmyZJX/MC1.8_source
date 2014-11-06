package net.minecraft.src;
/*   1:    */ import com.google.common.collect.BiMap;
/*   2:    */ import com.google.common.collect.HashBiMap;
/*   3:    */ import com.google.common.collect.HashMultimap;
/*   4:    */ import com.google.common.collect.Lists;
/*   5:    */ import com.google.common.collect.Maps;
/*   6:    */ import com.google.common.collect.Multimap;

/*   7:    */ import io.netty.util.internal.ThreadLocalRandom;

/*   8:    */ import java.net.MalformedURLException;
/*   9:    */ import java.net.URL;
/*  10:    */ import java.util.Iterator;
/*  11:    */ import java.util.List;
/*  12:    */ import java.util.Map;
/*  16:    */ import org.apache.logging.log4j.LogManager;
/*  17:    */ import org.apache.logging.log4j.Logger;
/*  18:    */ import org.apache.logging.log4j.Marker;
/*  19:    */ import org.apache.logging.log4j.MarkerManager;

/*  20:    */ import paulscode.sound.SoundSystemConfig;
/*  21:    */ import paulscode.sound.SoundSystemException;
/*  22:    */ import paulscode.sound.codecs.CodecJOrbis;
/*  23:    */ import paulscode.sound.libraries.LibraryLWJGLOpenAL;
/*  24:    */ 
/*  25:    */ public class cza
/*  26:    */ {
/*  27: 36 */   private static final Marker a = MarkerManager.getMarker("SOUNDS");
/*  28: 37 */   private static final Logger b = LogManager.getLogger();
/*  29:    */   private final czh c;
/*  30:    */   private final bto d;
/*  31:    */   private czf e;
/*  32:    */   private boolean f;
/*  33: 50 */   private int g = 0;
/*  34: 52 */   private final Map<String,cye> h = HashBiMap.create();
/*  35: 53 */   private final Map<cye, String> i = ((BiMap<String,cye>)this.h).inverse();
/*  36: 54 */   private Map<cye, cyz> j = Maps.newHashMap();
/*  37: 55 */   private final Multimap<cxz,String> k = HashMultimap.create();
/*  38: 57 */   private final List<cyg> l = Lists.newArrayList();
/*  39: 58 */   private final Map<cye, Integer> m = Maps.newHashMap();
/*  40: 59 */   private final Map<String, Integer> n = Maps.newHashMap();
/*  41:    */   
/*  42:    */   public cza(czh paramczh, bto parambto)
/*  43:    */   {
/*  44: 62 */     this.c = paramczh;
/*  45: 63 */     this.d = parambto;
/*  46:    */     try
/*  47:    */     {
/*  48: 67 */       SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
/*  49: 68 */       SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
/*  50:    */     }
/*  51:    */     catch (SoundSystemException localSoundSystemException)
/*  52:    */     {
/*  53: 70 */       b.error(a, "Error linking with the LibraryJavaSound plug-in", localSoundSystemException);
/*  54:    */     }
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void a()
/*  58:    */   {
/*  59: 75 */     b();
/*  60: 76 */     i();
/*  61:    */   }
/*  62:    */   
/*  63:    */   private synchronized void i()
/*  64:    */   {
/*  65: 80 */     if (this.f) {
/*  66: 81 */       return;
/*  67:    */     }
/*  68:    */     try
/*  69:    */     {
/*  70: 85 */       new Thread(new czb(this), "Sound Library Loader").start();
/*  71:    */     }
/*  72:    */     catch (RuntimeException localRuntimeException)
/*  73:    */     {
/*  74:118 */       b.error(a, "Error starting SoundSystem. Turning off sounds & music", localRuntimeException);
/*  75:    */       
/*  76:120 */       this.d.a(cxz.a, 0.0F);
/*  77:121 */       this.d.b();
/*  78:    */     }
/*  79:    */   }
/*  80:    */   
/*  81:    */   private float a(cxz paramcxz)
/*  82:    */   {
/*  83:126 */     if ((paramcxz == null) || (paramcxz == cxz.a)) {
/*  84:127 */       return 1.0F;
/*  85:    */     }
/*  86:130 */     return this.d.a(paramcxz);
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void a(cxz paramcxz, float paramFloat)
/*  90:    */   {
/*  91:134 */     if (!this.f) {
/*  92:135 */       return;
/*  93:    */     }
/*  94:138 */     if (paramcxz == cxz.a)
/*  95:    */     {
/*  96:139 */       this.e.setMasterVolume(paramFloat);
/*  97:140 */       return;
/*  98:    */     }
/*  99:143 */     for (String str : this.k.get(paramcxz))
/* 100:    */     {
/* 101:144 */       cye localcye = this.h.get(str);
/* 102:145 */       float f1 = a(localcye, this.j.get(localcye), paramcxz);
/* 103:146 */       if (f1 <= 0.0F) {
/* 104:147 */         b(localcye);
/* 105:    */       } else {
/* 106:149 */         this.e.setVolume(str, f1);
/* 107:    */       }
/* 108:    */     }
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void b()
/* 112:    */   {
/* 113:155 */     if (this.f)
/* 114:    */     {
/* 115:156 */       c();
/* 116:    */       
/* 117:158 */       this.e.cleanup();
/* 118:159 */       this.f = false;
/* 119:    */     }
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void c()
/* 123:    */   {
/* 124:164 */     if (this.f)
/* 125:    */     {
/* 126:165 */       for (String str : this.h.keySet()) {
/* 127:166 */         this.e.stop(str);
/* 128:    */       }
/* 129:168 */       this.h.clear();
/* 130:169 */       this.m.clear();
/* 131:170 */       this.l.clear();
/* 132:171 */       this.k.clear();
/* 133:172 */       this.j.clear();
/* 134:173 */       this.n.clear();
/* 135:    */     }
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void d()
/* 139:    */   {
/* 140:178 */     this.g += 1;
/* 141:181 */     for (Iterator<cyg> localIterator = this.l.iterator(); localIterator.hasNext();)
/* 142:    */     {
/* 143:181 */       cyg localObject1 = localIterator.next();
/* 144:182 */       ((cyg)localObject1).c();
/* 145:184 */       if (((cyg)localObject1).k())
/* 146:    */       {
/* 147:185 */         b((cye)localObject1);
/* 148:    */       }
/* 149:    */       else
/* 150:    */       {
/* 151:187 */         String localObject2 = this.i.get(localObject1);
/* 152:    */         
/* 153:189 */         this.e.setVolume((String)localObject2, a((cye)localObject1, this.j.get(localObject1), this.c.a(((cyg)localObject1).a()).d()));
/* 154:190 */         this.e.setPitch((String)localObject2, a((cye)localObject1, this.j.get(localObject1)));
/* 155:191 */         this.e.setPosition((String)localObject2, ((cyg)localObject1).g(), ((cyg)localObject1).h(), ((cyg)localObject1).i());
/* 156:    */       }
/* 157:    */     }
/* 158:    */     Object localObject2;
/* 159:196 */     Iterator<Map.Entry<String,cye>> localIterator = this.h.entrySet().iterator();
/* 160:    */     cye localcye;
/* 161:197 */     while (localIterator.hasNext())
/* 162:    */     {
/* 163:198 */       Map.Entry<String,cye> localObject1 = localIterator.next();
/* 164:    */       
/* 165:200 */       localObject2 = localObject1.getKey();
/* 166:201 */       localcye = localObject1.getValue();
/* 167:203 */       if (!this.e.playing((String)localObject2))
/* 168:    */       {
/* 169:204 */         int i1 = this.n.get(localObject2).intValue();
/* 170:205 */         if (i1 <= this.g)
/* 171:    */         {
/* 172:206 */           int i2 = localcye.d();
/* 173:207 */           if ((localcye.b()) && (i2 > 0)) {
/* 174:208 */             this.m.put(localcye, Integer.valueOf(this.g + i2));
/* 175:    */           }
/* 176:210 */           localIterator.remove();
/* 177:211 */           b.debug(a, "Removed channel {} because it's not playing anymore", new Object[] { localObject2 });
/* 178:212 */           this.e.removeSource((String)localObject2);
/* 179:213 */           this.n.remove(localObject2);
/* 180:    */           
/* 181:215 */           this.j.remove(localcye);
/* 182:    */           try
/* 183:    */           {
/* 184:217 */             this.k.remove(this.c.a(localcye.a()).d(), localObject2);
/* 185:    */           }
/* 186:    */           catch (RuntimeException localRuntimeException) {}
/* 187:222 */           if ((localcye instanceof cyg)) {
/* 188:223 */             this.l.remove(localcye);
/* 189:    */           }
/* 190:    */         }
/* 191:    */       }
/* 192:    */     }
/* 193:229 */     Iterator<Map.Entry<cye,Integer>> localObject1 = this.m.entrySet().iterator();
/* 194:230 */     while (localObject1.hasNext())
/* 195:    */     {
/* 196:231 */       Map.Entry<cye,Integer> localObject21 = localObject1.next();
/* 197:233 */       if (this.g >= localObject21.getValue().intValue())
/* 198:    */       {
/* 199:234 */         localcye = localObject21.getKey();
/* 200:237 */         if ((localcye instanceof cyg)) {
/* 201:238 */           ((cyg)localcye).c();
/* 202:    */         }
/* 203:241 */         c(localcye);
/* 204:242 */         localObject1.remove();
/* 205:    */       }
/* 206:    */     }
/* 207:    */   }
/* 208:    */   
/* 209:    */   public boolean a(cye paramcye)
/* 210:    */   {
/* 211:248 */     if (!this.f) {
/* 212:249 */       return false;
/* 213:    */     }
/* 214:252 */     String str = this.i.get(paramcye);
/* 215:253 */     if (str == null) {
/* 216:254 */       return false;
/* 217:    */     }
/* 218:257 */     return (this.e.playing(str)) || ((this.n.containsKey(str)) && (this.n.get(str).intValue() <= this.g));
/* 219:    */   }
/* 220:    */   
/* 221:    */   public void b(cye paramcye)
/* 222:    */   {
/* 223:261 */     if (!this.f) {
/* 224:262 */       return;
/* 225:    */     }
/* 226:265 */     String str = this.i.get(paramcye);
/* 227:266 */     if (str != null) {
/* 228:267 */       this.e.stop(str);
/* 229:    */     }
/* 230:    */   }
/* 231:    */   
/* 232:    */   public void c(cye paramcye)
/* 233:    */   {
/* 234:272 */     if (!this.f) {
/* 235:273 */       return;
/* 236:    */     }
/* 237:276 */     if (this.e.getMasterVolume() <= 0.0F)
/* 238:    */     {
/* 239:277 */       b.debug(a, "Skipped playing soundEvent: {}, master volume was zero", new Object[] { paramcye.a() });
/* 240:278 */       return;
/* 241:    */     }
/* 242:281 */     czg localczg = this.c.a(paramcye.a());
/* 243:282 */     if (localczg == null)
/* 244:    */     {
/* 245:283 */       b.warn(a, "Unable to play unknown soundEvent: {}", new Object[] { paramcye.a() });
/* 246:284 */       return;
/* 247:    */     }
/* 248:287 */     cyz localcyz = localczg.g();
/* 249:288 */     if (localcyz == czh.a)
/* 250:    */     {
/* 251:289 */       b.warn(a, "Unable to play empty soundEvent: {}", new Object[] { localczg.c() });
/* 252:290 */       return;
/* 253:    */     }
/* 254:293 */     float f1 = paramcye.e();
/* 255:294 */     float f2 = 16.0F;
/* 256:295 */     if (f1 > 1.0F) {
/* 257:296 */       f2 *= f1;
/* 258:    */     }
/* 259:299 */     cxz localcxz = localczg.d();
/* 260:300 */     float f3 = a(paramcye, localcyz, localcxz);
/* 261:301 */     double d1 = a(paramcye, localcyz);
/* 262:    */     
/* 263:303 */     oa localoa = localcyz.a();
/* 264:304 */     if (f3 == 0.0F)
/* 265:    */     {
/* 266:305 */       b.debug(a, "Skipped playing sound {}, volume was zero.", new Object[] { localoa });
/* 267:306 */       return;
/* 268:    */     }
/* 269:309 */     boolean bool = (paramcye.b()) && (paramcye.d() == 0);
/* 270:    */     
/* 271:311 */     String str = MathUtils.a(ThreadLocalRandom.current()).toString();
/* 272:313 */     if (localcyz.d()) {
/* 273:314 */       this.e.newStreamingSource(false, str, a(localoa), localoa.toString(), bool, paramcye.g(), paramcye.h(), paramcye.i(), paramcye.j().a(), f2);
/* 274:    */     } else {
/* 275:327 */       this.e.newSource(false, str, a(localoa), localoa.toString(), bool, paramcye.g(), paramcye.h(), paramcye.i(), paramcye.j().a(), f2);
/* 276:    */     }
/* 277:341 */     b.debug(a, "Playing sound {} for event {} as channel {}", new Object[] { localcyz.a(), localczg.c(), str });
/* 278:    */     
/* 279:343 */     this.e.setPitch(str, (float)d1);
/* 280:344 */     this.e.setVolume(str, f3);
/* 281:345 */     this.e.play(str);
/* 282:    */     
/* 283:347 */     this.n.put(str, Integer.valueOf(this.g + 20));
/* 284:348 */     this.h.put(str, paramcye);
/* 285:349 */     this.j.put(paramcye, localcyz);
/* 286:351 */     if (localcxz != cxz.a) {
/* 287:352 */       this.k.put(localcxz, str);
/* 288:    */     }
/* 289:355 */     if ((paramcye instanceof cyg)) {
/* 290:356 */       this.l.add((cyg)paramcye);
/* 291:    */     }
/* 292:    */   }
/* 293:    */   
/* 294:    */   private float a(cye paramcye, cyz paramcyz)
/* 295:    */   {
/* 296:361 */     return (float)MathUtils.clamp(paramcye.f() * paramcyz.b(), 0.5D, 2.0D);
/* 297:    */   }
/* 298:    */   
/* 299:    */   private float a(cye paramcye, cyz paramcyz, cxz paramcxz)
/* 300:    */   {
/* 301:365 */     return (float)MathUtils.clamp(paramcye.e() * paramcyz.c(), 0.0D, 1.0D) * a(paramcxz);
/* 302:    */   }
/* 303:    */   
/* 304:    */   public void e()
/* 305:    */   {
/* 306:369 */     for (String str : this.h.keySet())
/* 307:    */     {
/* 308:370 */       b.debug(a, "Pausing channel {}", new Object[] { str });
/* 309:371 */       this.e.pause(str);
/* 310:    */     }
/* 311:    */   }
/* 312:    */   
/* 313:    */   public void f()
/* 314:    */   {
/* 315:376 */     for (String str : this.h.keySet())
/* 316:    */     {
/* 317:377 */       b.debug(a, "Resuming channel {}", new Object[] { str });
/* 318:378 */       this.e.play(str);
/* 319:    */     }
/* 320:    */   }
/* 321:    */   
/* 322:    */   public void a(cye paramcye, int paramInt)
/* 323:    */   {
/* 324:383 */     this.m.put(paramcye, Integer.valueOf(this.g + paramInt));
/* 325:    */   }
/* 326:    */   
/* 327:    */   private static URL a(oa paramoa)
/* 328:    */   {
/* 329:387 */     String str = String.format("%s:%s:%s", new Object[] { "mcsounddomain", paramoa.b(), paramoa.a() });
/* 330:    */     
/* 331:    */ 
/* 332:    */ 
/* 333:    */ 
/* 334:    */ 
/* 335:    */ 
/* 336:394 */     czd localczd = new czd(paramoa);
/* 337:    */     try
/* 338:    */     {
/* 339:412 */       return new URL(null, str, localczd);
/* 340:    */     }
/* 341:    */     catch (MalformedURLException localMalformedURLException)
/* 342:    */     {
/* 343:414 */       throw new Error("TODO: Sanely handle url exception! :D");
/* 344:    */     }
/* 345:    */   }
/* 346:    */   
/* 347:    */   public void a(EntityPlayer paramahd, float paramFloat)
/* 348:    */   {
/* 349:419 */     if ((!this.f) || (paramahd == null)) {
/* 350:420 */       return;
/* 351:    */     }
/* 352:423 */     float f1 = paramahd.lastPitch + (paramahd.pitch - paramahd.lastPitch) * paramFloat;
/* 353:424 */     float f2 = paramahd.lastYaw + (paramahd.yaw - paramahd.lastYaw) * paramFloat;
/* 354:    */     
/* 355:426 */     double d1 = paramahd.lastX + (paramahd.xPos - paramahd.lastX) * paramFloat;
/* 356:427 */     double d2 = paramahd.lastY + (paramahd.yPos - paramahd.lastY) * paramFloat + paramahd.aR();
/* 357:428 */     double d3 = paramahd.lastZ + (paramahd.zPos - paramahd.lastZ) * paramFloat;
/* 358:    */     
/* 359:430 */     float f3 = MathUtils.cos((f2 + 90.0F) * 0.01745329F);
/* 360:431 */     float f4 = MathUtils.sin((f2 + 90.0F) * 0.01745329F);
/* 361:    */     
/* 362:433 */     float f5 = MathUtils.cos(-f1 * 0.01745329F);
/* 363:434 */     float f6 = MathUtils.sin(-f1 * 0.01745329F);
/* 364:    */     
/* 365:436 */     float f7 = MathUtils.cos((-f1 + 90.0F) * 0.01745329F);
/* 366:437 */     float f8 = MathUtils.sin((-f1 + 90.0F) * 0.01745329F);
/* 367:    */     
/* 368:439 */     float f9 = f3 * f5;
/* 369:440 */     float f10 = f6;
/* 370:441 */     float f11 = f4 * f5;
/* 371:    */     
/* 372:443 */     float f12 = f3 * f7;
/* 373:444 */     float f13 = f8;
/* 374:445 */     float f14 = f4 * f7;
/* 375:    */     
/* 376:447 */     this.e.setListenerPosition((float)d1, (float)d2, (float)d3);
/* 377:448 */     this.e.setListenerOrientation(f9, f10, f11, f12, f13, f14);
/* 378:    */   }
				static Logger g() {return b;}
				static czf a(cza arg0, czf arg1) {return arg0.e=arg1;}
				static boolean a(cza arg0, boolean arg1) {return arg0.f=arg1;}
				static bto a(cza arg0) {return arg0.d;}
				static czf b(cza arg0) {return arg0.e;}
				static Marker h() {return a;}
/* 379:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cza
 * JD-Core Version:    0.7.0.1
 */
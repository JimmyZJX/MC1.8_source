package net.minecraft.src;
/*   1:    */ import com.ibm.icu.text.ArabicShaping;
/*   2:    */ import com.ibm.icu.text.ArabicShapingException;
/*   3:    */ import com.ibm.icu.text.Bidi;
/*   4:    */ import java.awt.image.BufferedImage;
/*   5:    */ import java.io.IOException;
/*   6:    */ import java.io.InputStream;
/*   7:    */ import java.util.Arrays;
/*   8:    */ import java.util.List;
/*   9:    */ import java.util.Random;
/*  10:    */ import org.apache.commons.io.IOUtils;
/*  11:    */ import org.lwjgl.opengl.GL11;
/*  12:    */ 
/*  13:    */ public class bty
/*  14:    */   implements cvl
/*  15:    */ {
/*  16: 28 */   private static final oa[] c = new oa[256];
/*  17: 32 */   private int[] d = new int[256];
/*  18: 33 */   public int a = 9;
/*  19: 34 */   public Random b = new Random();
/*  20: 36 */   private byte[] e = new byte[65536];
/*  21: 38 */   private int[] f = new int[32];
/*  22:    */   private final oa g;
/*  23:    */   private final cug h;
/*  24:    */   private float i;
/*  25:    */   private float j;
/*  26:    */   private boolean k;
/*  27:    */   private boolean l;
/*  28:    */   private float m;
/*  29:    */   private float n;
/*  30:    */   private float o;
/*  31:    */   private float p;
/*  32:    */   private int q;
/*  33:    */   private boolean r;
/*  34:    */   private boolean s;
/*  35:    */   private boolean t;
/*  36:    */   private boolean u;
/*  37:    */   private boolean v;
/*  38:    */   
/*  39:    */   public bty(bto parambto, oa paramoa, cug paramcug, boolean paramBoolean)
/*  40:    */   {
/*  41: 55 */     this.g = paramoa;
/*  42: 56 */     this.h = paramcug;
/*  43: 57 */     this.k = paramBoolean;
/*  44:    */     
/*  45: 59 */     paramcug.a(this.g);
/*  46: 62 */     for (int i1 = 0; i1 < 32; i1++)
/*  47:    */     {
/*  48: 63 */       int i2 = (i1 >> 3 & 0x1) * 85;
/*  49: 64 */       int i3 = (i1 >> 2 & 0x1) * 170 + i2;
/*  50: 65 */       int i4 = (i1 >> 1 & 0x1) * 170 + i2;
/*  51: 66 */       int i5 = (i1 >> 0 & 0x1) * 170 + i2;
/*  52: 68 */       if (i1 == 6) {
/*  53: 69 */         i3 += 85;
/*  54:    */       }
/*  55: 72 */       if (parambto.e)
/*  56:    */       {
/*  57: 73 */         int i6 = (i3 * 30 + i4 * 59 + i5 * 11) / 100;
/*  58: 74 */         int i7 = (i3 * 30 + i4 * 70) / 100;
/*  59: 75 */         int i8 = (i3 * 30 + i5 * 70) / 100;
/*  60: 76 */         i3 = i6;
/*  61: 77 */         i4 = i7;
/*  62: 78 */         i5 = i8;
/*  63:    */       }
/*  64: 81 */       if (i1 >= 16)
/*  65:    */       {
/*  66: 82 */         i3 /= 4;
/*  67: 83 */         i4 /= 4;
/*  68: 84 */         i5 /= 4;
/*  69:    */       }
/*  70: 87 */       this.f[i1] = ((i3 & 0xFF) << 16 | (i4 & 0xFF) << 8 | i5 & 0xFF);
/*  71:    */     }
/*  72: 90 */     d();
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void a(cvk paramcvk)
/*  76:    */   {
/*  77: 95 */     c();
/*  78:    */   }
/*  79:    */   
/*  80:    */   private void c()
/*  81:    */   {
/*  82:    */     BufferedImage localBufferedImage;
/*  83:    */     try
/*  84:    */     {
/*  85:102 */       localBufferedImage = cuj.a(bsu.z().O().a(this.g).b());
/*  86:    */     }
/*  87:    */     catch (IOException localIOException)
/*  88:    */     {
/*  89:104 */       throw new RuntimeException(localIOException);
/*  90:    */     }
/*  91:107 */     int i1 = localBufferedImage.getWidth();
/*  92:108 */     int i2 = localBufferedImage.getHeight();
/*  93:109 */     int[] arrayOfInt = new int[i1 * i2];
/*  94:110 */     localBufferedImage.getRGB(0, 0, i1, i2, arrayOfInt, 0, i1);
/*  95:    */     
/*  96:112 */     int i3 = i2 / 16;
/*  97:113 */     int i4 = i1 / 16;
/*  98:    */     
/*  99:115 */     int i5 = 1;
/* 100:    */     
/* 101:117 */     float f1 = 8.0F / i4;
/* 102:119 */     for (int i6 = 0; i6 < 256; i6++)
/* 103:    */     {
/* 104:120 */       int i7 = i6 % 16;
/* 105:121 */       int i8 = i6 / 16;
/* 106:123 */       if (i6 == 32) {
/* 107:124 */         this.d[i6] = (3 + i5);
/* 108:    */       }
					int i9;
/* 109:127 */       for (i9 = i4 - 1; i9 >= 0; i9--)
/* 110:    */       {
/* 111:129 */         int i10 = i7 * i4 + i9;
/* 112:130 */         int i11 = 1;
/* 113:131 */         for (int i12 = 0; (i12 < i3) && (i11 != 0); i12++)
/* 114:    */         {
/* 115:132 */           int i13 = (i8 * i4 + i12) * i1;
/* 116:134 */           if ((arrayOfInt[(i10 + i13)] >> 24 & 0xFF) != 0) {
/* 117:135 */             i11 = 0;
/* 118:    */           }
/* 119:    */         }
/* 120:138 */         if (i11 == 0) {
/* 121:    */           break;
/* 122:    */         }
/* 123:    */       }
/* 124:142 */       i9++;
/* 125:    */       
/* 126:    */ 
/* 127:145 */       this.d[i6] = ((int)(0.5D + i9 * f1) + i5);
/* 128:    */     }
/* 129:    */   }
/* 130:    */   
/* 131:    */   private void d()
/* 132:    */   {
/* 133:150 */     InputStream localInputStream = null;
/* 134:    */     try
/* 135:    */     {
/* 136:152 */       localInputStream = bsu.z().O().a(new oa("font/glyph_sizes.bin")).b();
/* 137:153 */       localInputStream.read(this.e);
/* 138:    */     }
/* 139:    */     catch (IOException localIOException)
/* 140:    */     {
/* 141:155 */       throw new RuntimeException(localIOException);
/* 142:    */     }
/* 143:    */     finally
/* 144:    */     {
/* 145:157 */       IOUtils.closeQuietly(localInputStream);
/* 146:    */     }
/* 147:    */   }
/* 148:    */   
/* 149:    */   private float a(int paramInt, char paramChar, boolean paramBoolean)
/* 150:    */   {
/* 151:162 */     if (paramChar == ' ') {
/* 152:163 */       return 4.0F;
/* 153:    */     }
/* 154:164 */     if (("".indexOf(paramChar) != -1) && (!this.k)) {
/* 155:165 */       return a(paramInt, paramBoolean);
/* 156:    */     }
/* 157:167 */     return a(paramChar, paramBoolean);
/* 158:    */   }
/* 159:    */   
/* 160:    */   private float a(int paramInt, boolean paramBoolean)
/* 161:    */   {
/* 162:172 */     float f1 = paramInt % 16 * 8;
/* 163:173 */     float f2 = paramInt / 16 * 8;
/* 164:174 */     float f3 = paramBoolean ? 1.0F : 0.0F;
/* 165:    */     
/* 166:176 */     this.h.a(this.g);
/* 167:    */     
/* 168:178 */     float f4 = this.d[paramInt] - 0.01F;
/* 169:    */     
/* 170:180 */     GL11.glBegin(5);
/* 171:181 */     GL11.glTexCoord2f(f1 / 128.0F, f2 / 128.0F);
/* 172:182 */     GL11.glVertex3f(this.i + f3, this.j, 0.0F);
/* 173:183 */     GL11.glTexCoord2f(f1 / 128.0F, (f2 + 7.99F) / 128.0F);
/* 174:184 */     GL11.glVertex3f(this.i - f3, this.j + 7.99F, 0.0F);
/* 175:185 */     GL11.glTexCoord2f((f1 + f4 - 1.0F) / 128.0F, f2 / 128.0F);
/* 176:186 */     GL11.glVertex3f(this.i + f4 - 1.0F + f3, this.j, 0.0F);
/* 177:187 */     GL11.glTexCoord2f((f1 + f4 - 1.0F) / 128.0F, (f2 + 7.99F) / 128.0F);
/* 178:188 */     GL11.glVertex3f(this.i + f4 - 1.0F - f3, this.j + 7.99F, 0.0F);
/* 179:189 */     GL11.glEnd();
/* 180:    */     
/* 181:191 */     return this.d[paramInt];
/* 182:    */   }
/* 183:    */   
/* 184:    */   private oa a(int paramInt)
/* 185:    */   {
/* 186:195 */     if (c[paramInt] == null) {
/* 187:196 */       c[paramInt] = new oa(String.format("textures/font/unicode_page_%02x.png", new Object[] { Integer.valueOf(paramInt) }));
/* 188:    */     }
/* 189:199 */     return c[paramInt];
/* 190:    */   }
/* 191:    */   
/* 192:    */   private void b(int paramInt)
/* 193:    */   {
/* 194:203 */     this.h.a(a(paramInt));
/* 195:    */   }
/* 196:    */   
/* 197:    */   private float a(char paramChar, boolean paramBoolean)
/* 198:    */   {
/* 199:207 */     if (this.e[paramChar] == 0) {
/* 200:208 */       return 0.0F;
/* 201:    */     }
/* 202:211 */     int i1 = paramChar / 'Ā';
/* 203:    */     
/* 204:213 */     b(i1);
/* 205:    */     
/* 206:    */ 
/* 207:216 */     int i2 = this.e[paramChar] >>> 4;
/* 208:    */     
/* 209:218 */     int i3 = this.e[paramChar] & 0xF;
/* 210:    */     
/* 211:220 */     float f1 = i2;
/* 212:221 */     float f2 = i3 + 1;
/* 213:    */     
/* 214:223 */     float f3 = paramChar % '\020' * 16 + f1;
/* 215:224 */     float f4 = (paramChar & 0xFF) / '\020' * 16;
/* 216:225 */     float f5 = f2 - f1 - 0.02F;
/* 217:226 */     float f6 = paramBoolean ? 1.0F : 0.0F;
/* 218:    */     
/* 219:228 */     GL11.glBegin(5);
/* 220:229 */     GL11.glTexCoord2f(f3 / 256.0F, f4 / 256.0F);
/* 221:230 */     GL11.glVertex3f(this.i + f6, this.j, 0.0F);
/* 222:231 */     GL11.glTexCoord2f(f3 / 256.0F, (f4 + 15.98F) / 256.0F);
/* 223:232 */     GL11.glVertex3f(this.i - f6, this.j + 7.99F, 0.0F);
/* 224:233 */     GL11.glTexCoord2f((f3 + f5) / 256.0F, f4 / 256.0F);
/* 225:234 */     GL11.glVertex3f(this.i + f5 / 2.0F + f6, this.j, 0.0F);
/* 226:235 */     GL11.glTexCoord2f((f3 + f5) / 256.0F, (f4 + 15.98F) / 256.0F);
/* 227:236 */     GL11.glVertex3f(this.i + f5 / 2.0F - f6, this.j + 7.99F, 0.0F);
/* 228:237 */     GL11.glEnd();
/* 229:    */     
/* 230:239 */     return (f2 - f1) / 2.0F + 1.0F;
/* 231:    */   }
/* 232:    */   
/* 233:    */   public int a(String paramString, float paramFloat1, float paramFloat2, int paramInt)
/* 234:    */   {
/* 235:243 */     return a(paramString, paramFloat1, paramFloat2, paramInt, true);
/* 236:    */   }
/* 237:    */   
/* 238:    */   public int a(String paramString, int paramInt1, int paramInt2, int paramInt3)
/* 239:    */   {
/* 240:247 */     return a(paramString, (float)paramInt1, (float)paramInt2, paramInt3, false);
/* 241:    */   }
/* 242:    */   
/* 243:    */   public int a(String paramString, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
/* 244:    */   {
/* 245:251 */     cjm.enableAlphaTest();
/* 246:252 */     e();
/* 247:    */     int i1;
/* 248:256 */     if (paramBoolean)
/* 249:    */     {
/* 250:257 */       i1 = b(paramString, paramFloat1 + 1.0F, paramFloat2 + 1.0F, paramInt, true);
/* 251:258 */       i1 = Math.max(i1, b(paramString, paramFloat1, paramFloat2, paramInt, false));
/* 252:    */     }
/* 253:    */     else
/* 254:    */     {
/* 255:260 */       i1 = b(paramString, paramFloat1, paramFloat2, paramInt, false);
/* 256:    */     }
/* 257:263 */     return i1;
/* 258:    */   }
/* 259:    */   
/* 260:    */   private String c(String paramString)
/* 261:    */   {
/* 262:    */     try
/* 263:    */     {
/* 264:268 */       Bidi localBidi = new Bidi(new ArabicShaping(8).shape(paramString), 127);
/* 265:269 */       localBidi.setReorderingMode(0);
/* 266:270 */       return localBidi.writeReordered(2);
/* 267:    */     }
/* 268:    */     catch (ArabicShapingException localArabicShapingException) {}
/* 269:274 */     return paramString;
/* 270:    */   }
/* 271:    */   
/* 272:    */   private void e()
/* 273:    */   {
/* 274:278 */     this.r = false;
/* 275:279 */     this.s = false;
/* 276:280 */     this.t = false;
/* 277:281 */     this.u = false;
/* 278:282 */     this.v = false;
/* 279:    */   }
/* 280:    */   
/* 281:    */   private void a(String paramString, boolean paramBoolean)
/* 282:    */   {
/* 283:293 */     for (int i1 = 0; i1 < paramString.length(); i1++)
/* 284:    */     {
/* 285:294 */       char c1 = paramString.charAt(i1);
/* 286:    */       int i2;
/* 287:    */       int i3;
/* 288:296 */       if ((c1 == '§') && (i1 + 1 < paramString.length()))
/* 289:    */       {
/* 290:297 */         i2 = "0123456789abcdefklmnor".indexOf(paramString.toLowerCase().charAt(i1 + 1));
/* 291:299 */         if (i2 < 16)
/* 292:    */         {
/* 293:300 */           this.r = false;
/* 294:301 */           this.s = false;
/* 295:302 */           this.v = false;
/* 296:303 */           this.u = false;
/* 297:304 */           this.t = false;
/* 298:305 */           if ((i2 < 0) || (i2 > 15)) {
/* 299:306 */             i2 = 15;
/* 300:    */           }
/* 301:309 */           if (paramBoolean) {
/* 302:310 */             i2 += 16;
/* 303:    */           }
/* 304:313 */           i3 = this.f[i2];
/* 305:314 */           this.q = i3;
/* 306:315 */           cjm.c((i3 >> 16) / 255.0F, (i3 >> 8 & 0xFF) / 255.0F, (i3 & 0xFF) / 255.0F, this.p);
/* 307:    */         }
/* 308:316 */         else if (i2 == 16)
/* 309:    */         {
/* 310:317 */           this.r = true;
/* 311:    */         }
/* 312:318 */         else if (i2 == 17)
/* 313:    */         {
/* 314:319 */           this.s = true;
/* 315:    */         }
/* 316:320 */         else if (i2 == 18)
/* 317:    */         {
/* 318:321 */           this.v = true;
/* 319:    */         }
/* 320:322 */         else if (i2 == 19)
/* 321:    */         {
/* 322:323 */           this.u = true;
/* 323:    */         }
/* 324:324 */         else if (i2 == 20)
/* 325:    */         {
/* 326:325 */           this.t = true;
/* 327:    */         }
/* 328:326 */         else if (i2 == 21)
/* 329:    */         {
/* 330:327 */           this.r = false;
/* 331:328 */           this.s = false;
/* 332:329 */           this.v = false;
/* 333:330 */           this.u = false;
/* 334:331 */           this.t = false;
/* 335:    */           
/* 336:333 */           cjm.c(this.m, this.n, this.o, this.p);
/* 337:    */         }
/* 338:336 */         i1++;
/* 339:    */       }
/* 340:    */       else
/* 341:    */       {
/* 342:340 */         i2 = "".indexOf(c1);
/* 343:342 */         if ((this.r) && (i2 != -1))
/* 344:    */         {
/* 345:    */           do
/* 346:    */           {
/* 347:345 */             i3 = this.b.nextInt(this.d.length);
/* 348:346 */           } while (this.d[i2] != this.d[i3]);
/* 349:347 */           i2 = i3;
/* 350:    */         }
/* 351:353 */         float f1 = this.k ? 0.5F : 1.0F;
/* 352:354 */         int i4 = ((c1 == 0) || (i2 == -1) || (this.k)) && (paramBoolean) ? 1 : 0;
/* 353:356 */         if (i4 != 0)
/* 354:    */         {
/* 355:357 */           this.i -= f1;
/* 356:358 */           this.j -= f1;
/* 357:    */         }
/* 358:360 */         float f2 = a(i2, c1, this.t);
/* 359:361 */         if (i4 != 0)
/* 360:    */         {
/* 361:362 */           this.i += f1;
/* 362:363 */           this.j += f1;
/* 363:    */         }
/* 364:366 */         if (this.s)
/* 365:    */         {
/* 366:367 */           this.i += f1;
/* 367:368 */           if (i4 != 0)
/* 368:    */           {
/* 369:369 */             this.i -= f1;
/* 370:370 */             this.j -= f1;
/* 371:    */           }
/* 372:372 */           a(i2, c1, this.t);
/* 373:373 */           this.i -= f1;
/* 374:374 */           if (i4 != 0)
/* 375:    */           {
/* 376:375 */             this.i += f1;
/* 377:376 */             this.j += f1;
/* 378:    */           }
/* 379:378 */           f2 += 1.0F;
/* 380:    */         }
/* 381:    */         ckx localckx;
/* 382:    */         VertexBuffer localciv;
/* 383:381 */         if (this.v)
/* 384:    */         {
/* 385:382 */           localckx = ckx.getInstance();
/* 386:383 */           localciv = localckx.getBuffer();
/* 387:384 */           cjm.x();
/* 388:385 */           localciv.begin();
/* 389:386 */           localciv.addVertex(this.i, this.j + this.a / 2, 0.0D);
/* 390:387 */           localciv.addVertex(this.i + f2, this.j + this.a / 2, 0.0D);
/* 391:388 */           localciv.addVertex(this.i + f2, this.j + this.a / 2 - 1.0F, 0.0D);
/* 392:389 */           localciv.addVertex(this.i, this.j + this.a / 2 - 1.0F, 0.0D);
/* 393:390 */           localckx.draw();
/* 394:391 */           cjm.w();
/* 395:    */         }
/* 396:394 */         if (this.u)
/* 397:    */         {
/* 398:395 */           localckx = ckx.getInstance();
/* 399:396 */           localciv = localckx.getBuffer();
/* 400:397 */           cjm.x();
/* 401:398 */           localciv.begin();
/* 402:399 */           int i5 = this.u ? -1 : 0;
/* 403:400 */           localciv.addVertex(this.i + i5, this.j + this.a, 0.0D);
/* 404:401 */           localciv.addVertex(this.i + f2, this.j + this.a, 0.0D);
/* 405:402 */           localciv.addVertex(this.i + f2, this.j + this.a - 1.0F, 0.0D);
/* 406:403 */           localciv.addVertex(this.i + i5, this.j + this.a - 1.0F, 0.0D);
/* 407:404 */           localckx.draw();
/* 408:405 */           cjm.w();
/* 409:    */         }
/* 410:408 */         this.i += (int)f2;
/* 411:    */       }
/* 412:    */     }
/* 413:    */   }
/* 414:    */   
/* 415:    */   private int a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
/* 416:    */   {
/* 417:413 */     if (this.l)
/* 418:    */     {
/* 419:414 */       int i1 = a(c(paramString));
/* 420:415 */       paramInt1 = paramInt1 + paramInt3 - i1;
/* 421:    */     }
/* 422:417 */     return b(paramString, paramInt1, paramInt2, paramInt4, paramBoolean);
/* 423:    */   }
/* 424:    */   
/* 425:    */   private int b(String paramString, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
/* 426:    */   {
/* 427:421 */     if (paramString == null) {
/* 428:422 */       return 0;
/* 429:    */     }
/* 430:424 */     if (this.l) {
/* 431:425 */       paramString = c(paramString);
/* 432:    */     }
/* 433:428 */     if ((paramInt & 0xFC000000) == 0) {
/* 434:429 */       paramInt |= 0xFF000000;
/* 435:    */     }
/* 436:432 */     if (paramBoolean) {
/* 437:433 */       paramInt = (paramInt & 0xFCFCFC) >> 2 | paramInt & 0xFF000000;
/* 438:    */     }
/* 439:436 */     this.m = ((paramInt >> 16 & 0xFF) / 255.0F);
/* 440:437 */     this.n = ((paramInt >> 8 & 0xFF) / 255.0F);
/* 441:438 */     this.o = ((paramInt & 0xFF) / 255.0F);
/* 442:439 */     this.p = ((paramInt >> 24 & 0xFF) / 255.0F);
/* 443:    */     
/* 444:441 */     cjm.c(this.m, this.n, this.o, this.p);
/* 445:    */     
/* 446:443 */     this.i = paramFloat1;
/* 447:444 */     this.j = paramFloat2;
/* 448:445 */     a(paramString, paramBoolean);
/* 449:    */     
/* 450:447 */     return (int)this.i;
/* 451:    */   }
/* 452:    */   
/* 453:    */   public int a(String paramString)
/* 454:    */   {
/* 455:451 */     if (paramString == null) {
/* 456:452 */       return 0;
/* 457:    */     }
/* 458:454 */     int i1 = 0;
/* 459:455 */     int i2 = 0;
/* 460:457 */     for (int i3 = 0; i3 < paramString.length(); i3++)
/* 461:    */     {
/* 462:458 */       char c1 = paramString.charAt(i3);
/* 463:    */       
/* 464:460 */       int i4 = a(c1);
/* 465:461 */       if ((i4 < 0) && (i3 < paramString.length() - 1))
/* 466:    */       {
/* 467:462 */         c1 = paramString.charAt(++i3);
/* 468:464 */         if ((c1 == 'l') || (c1 == 'L')) {
/* 469:465 */           i2 = 1;
/* 470:466 */         } else if ((c1 == 'r') || (c1 == 'R')) {
/* 471:467 */           i2 = 0;
/* 472:    */         }
/* 473:469 */         i4 = 0;
/* 474:    */       }
/* 475:471 */       i1 += i4;
/* 476:472 */       if ((i2 != 0) && (i4 > 0)) {
/* 477:473 */         i1++;
/* 478:    */       }
/* 479:    */     }
/* 480:477 */     return i1;
/* 481:    */   }
/* 482:    */   
/* 483:    */   public int a(char paramChar)
/* 484:    */   {
/* 485:481 */     if (paramChar == '§') {
/* 486:482 */       return -1;
/* 487:    */     }
/* 488:485 */     if (paramChar == ' ') {
/* 489:486 */       return 4;
/* 490:    */     }
/* 491:489 */     int i1 = "".indexOf(paramChar);
/* 492:490 */     if ((paramChar > 0) && (i1 != -1) && (!this.k)) {
/* 493:491 */       return this.d[i1];
/* 494:    */     }
/* 495:495 */     if (this.e[paramChar] != 0)
/* 496:    */     {
/* 497:496 */       int i2 = this.e[paramChar] >>> 4;
/* 498:497 */       int i3 = this.e[paramChar] & 0xF;
/* 499:499 */       if (i3 > 7)
/* 500:    */       {
/* 501:500 */         i3 = 15;
/* 502:501 */         i2 = 0;
/* 503:    */       }
/* 504:503 */       i3++;
/* 505:    */       
/* 506:505 */       return (i3 - i2) / 2 + 1;
/* 507:    */     }
/* 508:508 */     return 0;
/* 509:    */   }
/* 510:    */   
/* 511:    */   public String a(String paramString, int paramInt)
/* 512:    */   {
/* 513:512 */     return a(paramString, paramInt, false);
/* 514:    */   }
/* 515:    */   
/* 516:    */   public String a(String paramString, int paramInt, boolean paramBoolean)
/* 517:    */   {
/* 518:516 */     StringBuilder localStringBuilder = new StringBuilder();
/* 519:517 */     int i1 = 0;
/* 520:518 */     int i2 = paramBoolean ? paramString.length() - 1 : 0;
/* 521:519 */     int i3 = paramBoolean ? -1 : 1;
/* 522:520 */     int i4 = 0;
/* 523:521 */     int i5 = 0;
/* 524:523 */     for (int i6 = i2; (i6 >= 0) && (i6 < paramString.length()) && (i1 < paramInt); i6 += i3)
/* 525:    */     {
/* 526:524 */       char c1 = paramString.charAt(i6);
/* 527:525 */       int i7 = a(c1);
/* 528:527 */       if (i4 != 0)
/* 529:    */       {
/* 530:528 */         i4 = 0;
/* 531:530 */         if ((c1 == 'l') || (c1 == 'L')) {
/* 532:531 */           i5 = 1;
/* 533:532 */         } else if ((c1 == 'r') || (c1 == 'R')) {
/* 534:533 */           i5 = 0;
/* 535:    */         }
/* 536:    */       }
/* 537:535 */       else if (i7 < 0)
/* 538:    */       {
/* 539:536 */         i4 = 1;
/* 540:    */       }
/* 541:    */       else
/* 542:    */       {
/* 543:538 */         i1 += i7;
/* 544:539 */         if (i5 != 0) {
/* 545:540 */           i1++;
/* 546:    */         }
/* 547:    */       }
/* 548:544 */       if (i1 > paramInt) {
/* 549:    */         break;
/* 550:    */       }
/* 551:548 */       if (paramBoolean) {
/* 552:549 */         localStringBuilder.insert(0, c1);
/* 553:    */       } else {
/* 554:551 */         localStringBuilder.append(c1);
/* 555:    */       }
/* 556:    */     }
/* 557:555 */     return localStringBuilder.toString();
/* 558:    */   }
/* 559:    */   
/* 560:    */   private String d(String paramString)
/* 561:    */   {
/* 562:566 */     while ((paramString != null) && (paramString.endsWith("\n"))) {
/* 563:567 */       paramString = paramString.substring(0, paramString.length() - 1);
/* 564:    */     }
/* 565:569 */     return paramString;
/* 566:    */   }
/* 567:    */   
/* 568:    */   public void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 569:    */   {
/* 570:573 */     e();
/* 571:574 */     this.q = paramInt4;
/* 572:575 */     paramString = d(paramString);
/* 573:    */     
/* 574:577 */     a(paramString, paramInt1, paramInt2, paramInt3, false);
/* 575:    */   }
/* 576:    */   
/* 577:    */   private void a(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/* 578:    */   {
/* 579:581 */     List<String> localList = c(paramString, paramInt3);
/* 580:582 */     for (String str : localList)
/* 581:    */     {
/* 582:583 */       a(str, paramInt1, paramInt2, paramInt3, this.q, paramBoolean);
/* 583:584 */       paramInt2 += this.a;
/* 584:    */     }
/* 585:    */   }
/* 586:    */   
/* 587:    */   public int b(String paramString, int paramInt)
/* 588:    */   {
/* 589:589 */     return this.a * c(paramString, paramInt).size();
/* 590:    */   }
/* 591:    */   
/* 592:    */   public void a(boolean paramBoolean)
/* 593:    */   {
/* 594:593 */     this.k = paramBoolean;
/* 595:    */   }
/* 596:    */   
/* 597:    */   public boolean a()
/* 598:    */   {
/* 599:597 */     return this.k;
/* 600:    */   }
/* 601:    */   
/* 602:    */   public void b(boolean paramBoolean)
/* 603:    */   {
/* 604:601 */     this.l = paramBoolean;
/* 605:    */   }
/* 606:    */   
/* 607:    */   public List<String> c(String paramString, int paramInt)
/* 608:    */   {
/* 609:605 */     return Arrays.asList(d(paramString, paramInt).split("\n"));
/* 610:    */   }
/* 611:    */   
/* 612:    */   String d(String paramString, int paramInt)
/* 613:    */   {
/* 614:609 */     int i1 = e(paramString, paramInt);
/* 615:610 */     if (paramString.length() <= i1) {
/* 616:611 */       return paramString;
/* 617:    */     }
/* 618:614 */     String str1 = paramString.substring(0, i1);
/* 619:    */     
/* 620:616 */     int i2 = paramString.charAt(i1);
/* 621:617 */     int i3 = (i2 == 32) || (i2 == 10) ? 1 : 0;
/* 622:618 */     String str2 = b(str1) + paramString.substring(i1 + (i3 != 0 ? 1 : 0));
/* 623:    */     
/* 624:620 */     return str1 + "\n" + d(str2, paramInt);
/* 625:    */   }
/* 626:    */   
/* 627:    */   private int e(String paramString, int paramInt)
/* 628:    */   {
/* 629:624 */     int i1 = paramString.length();
/* 630:625 */     int i2 = 0;
/* 631:626 */     int i3 = 0;
/* 632:627 */     int i4 = -1;
/* 633:628 */     int i5 = 0;
/* 634:631 */     for (; i3 < i1; i3++)
/* 635:    */     {
/* 636:632 */       char c1 = paramString.charAt(i3);
/* 637:634 */       switch (c1)
/* 638:    */       {
/* 639:    */       case '§': 
/* 640:636 */         if (i3 < i1 - 1)
/* 641:    */         {
/* 642:637 */           char c2 = paramString.charAt(++i3);
/* 643:638 */           if ((c2 == 'l') || (c2 == 'L')) {
/* 644:639 */             i5 = 1;
/* 645:640 */           } else if ((c2 == 'r') || (c2 == 'R') || (c(c2))) {
/* 646:641 */             i5 = 0;
/* 647:    */           }
/* 648:    */         }
/* 649:643 */         break;
/* 650:    */       case '\n': 
/* 651:646 */         i3--;
/* 652:647 */         break;
/* 653:    */       case ' ': 
/* 654:649 */         i4 = i3;
/* 655:    */       default: 
/* 656:651 */         i2 += a(c1);
/* 657:652 */         if (i5 != 0) {
/* 658:653 */           i2++;
/* 659:    */         }
/* 660:    */         break;
/* 661:    */       }
/* 662:657 */       if (c1 == '\n')
/* 663:    */       {
/* 664:658 */         i3++;i4 = i3;
/* 665:    */       }
/* 666:    */       else
/* 667:    */       {
/* 668:662 */         if (i2 > paramInt) {
/* 669:    */           break;
/* 670:    */         }
/* 671:    */       }
/* 672:    */     }
/* 673:667 */     if ((i3 != i1) && (i4 != -1) && (i4 < i3)) {
/* 674:668 */       return i4;
/* 675:    */     }
/* 676:670 */     return i3;
/* 677:    */   }
/* 678:    */   
/* 679:    */   private static boolean c(char paramChar)
/* 680:    */   {
/* 681:674 */     return ((paramChar >= '0') && (paramChar <= '9')) || ((paramChar >= 'a') && (paramChar <= 'f')) || ((paramChar >= 'A') && (paramChar <= 'F'));
/* 682:    */   }
/* 683:    */   
/* 684:    */   private static boolean d(char paramChar)
/* 685:    */   {
/* 686:678 */     return ((paramChar >= 'k') && (paramChar <= 'o')) || ((paramChar >= 'K') && (paramChar <= 'O')) || (paramChar == 'r') || (paramChar == 'R');
/* 687:    */   }
/* 688:    */   
/* 689:    */   public static String b(String paramString)
/* 690:    */   {
/* 691:682 */     String str = "";
/* 692:683 */     int i1 = -1;
/* 693:684 */     int i2 = paramString.length();
/* 694:686 */     while ((i1 = paramString.indexOf('§', i1 + 1)) != -1) {
/* 695:687 */       if (i1 < i2 - 1)
/* 696:    */       {
/* 697:688 */         char c1 = paramString.charAt(i1 + 1);
/* 698:690 */         if (c(c1)) {
/* 699:691 */           str = "§" + c1;
/* 700:692 */         } else if (d(c1)) {
/* 701:693 */           str = str + "§" + c1;
/* 702:    */         }
/* 703:    */       }
/* 704:    */     }
/* 705:698 */     return str;
/* 706:    */   }
/* 707:    */   
/* 708:    */   public boolean b()
/* 709:    */   {
/* 710:702 */     return this.l;
/* 711:    */   }
/* 712:    */   
/* 713:    */   public int b(char paramChar)
/* 714:    */   {
/* 715:706 */     return this.f["0123456789abcdef".indexOf(paramChar)];
/* 716:    */   }
/* 717:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bty
 * JD-Core Version:    0.7.0.1
 */
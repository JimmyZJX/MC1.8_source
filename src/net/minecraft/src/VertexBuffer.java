package net.minecraft.src;
/*   1:    */ import java.nio.ByteBuffer;
/*   2:    */ import java.nio.ByteOrder;
/*   3:    */ import java.nio.FloatBuffer;
/*   4:    */ import java.nio.IntBuffer;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.PriorityQueue;
/*   7:    */ import org.apache.logging.log4j.LogManager;
/*   9:    */ 
/*  10:    */ public class VertexBuffer
/*  11:    */ {
/*  12:    */   private ByteBuffer byteBuffer;
/*  13:    */   private IntBuffer intBuffer;
/*  14:    */   private FloatBuffer floatBuffer;
/*  15:    */   private int count;
/*  16:    */   private double u;
/*  17:    */   private double v;
/*  18:    */   private int g;
/*  19:    */   private int color;
/*  20:    */   private int pointer;
/*  21:    */   private boolean j;
/*  22:    */   private int k;
/*  23:    */   private double l;
/*  24:    */   private double m;
/*  25:    */   private double n;
/*  26:    */   private int o;
/*  27:    */   private int p;
/*  28:    */   private VertexFormat format;
/*  29:    */   private boolean r;
/*  30:    */   private int size;
/*  31:    */   
/*  32:    */   public VertexBuffer(int size)
/*  33:    */   {
/*  34: 42 */     this.size = size;
/*  35:    */     
/*  36: 44 */     this.byteBuffer = bst.c(size * 4);
/*  37: 45 */     this.intBuffer = this.byteBuffer.asIntBuffer();
/*  38: 46 */     this.floatBuffer = this.byteBuffer.asFloatBuffer();
/*  39:    */     
/*  40: 48 */     this.format = new VertexFormat();
/*  41: 49 */     this.format.addElement(new VertexElement(0, cuv.FLOAT, EnumVertexElementType.POSITION, 3));
/*  42:    */   }
/*  43:    */   
/*  44:    */   private void grow(int paramInt)
/*  45:    */   {
/*  46: 53 */     LogManager.getLogger().warn("Needed to grow BufferBuilder buffer: Old size " + this.size * 4 + " bytes, new size " + (this.size * 4 + paramInt) + " bytes.");
/*  47:    */     
/*  48: 55 */     this.size += paramInt / 4;
/*  49:    */     
/*  50: 57 */     ByteBuffer newBuffer = bst.c(this.size * 4);
/*  51: 58 */     this.intBuffer.position(0);
/*  52: 59 */     newBuffer.asIntBuffer().put(this.intBuffer);
/*  53:    */     
/*  54: 61 */     this.byteBuffer = newBuffer;
/*  55: 62 */     this.intBuffer = this.byteBuffer.asIntBuffer();
/*  56: 63 */     this.floatBuffer = this.byteBuffer.asFloatBuffer();
/*  57:    */   }
/*  58:    */   
/*  59:    */   public cix a(float paramFloat1, float paramFloat2, float paramFloat3)
/*  60:    */   {
/*  61: 67 */     int[] arrayOfInt = new int[this.pointer];
/*  62: 68 */     PriorityQueue<Integer> localPriorityQueue = new PriorityQueue<Integer>(this.pointer, new ckt(this.floatBuffer, (float)(paramFloat1 + this.l), (float)(paramFloat2 + this.m), (float)(paramFloat3 + this.n), this.format.getSize() / 4));
/*  63:    */     
/*  64: 70 */     int i1 = this.format.getSize();
/*  65: 72 */     for (int i2 = 0; i2 < this.pointer; i2 += i1) {
/*  66: 73 */       localPriorityQueue.add(Integer.valueOf(i2));
/*  67:    */     }
/*  68: 76 */     int i2 = 0;
/*  69: 77 */     while (!localPriorityQueue.isEmpty())
/*  70:    */     {
/*  71: 78 */       int i3 = ((Integer)localPriorityQueue.remove()).intValue();
/*  72: 79 */       for (int i4 = 0; i4 < i1; i4++) {
/*  73: 80 */         arrayOfInt[(i2 + i4)] = this.intBuffer.get(i3 + i4);
/*  74:    */       }
/*  75: 82 */       i2 += i1;
/*  76:    */     }
/*  77: 85 */     this.intBuffer.clear();
/*  78: 86 */     this.intBuffer.put(arrayOfInt);
/*  79:    */     
/*  80: 88 */     return new cix(this, arrayOfInt, this.pointer, this.count, new VertexFormat(this.format));
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void a(cix paramcix)
/*  84:    */   {
/*  85: 92 */     this.intBuffer.clear();
/*  86: 93 */     this.intBuffer.put(paramcix.a());
/*  87:    */     
/*  88: 95 */     this.pointer = paramcix.b();
/*  89: 96 */     this.count = paramcix.c();
/*  90: 97 */     this.format = new VertexFormat(paramcix.d());
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void clear()
/*  94:    */   {
/*  95:101 */     this.count = 0;
/*  96:    */     
/*  97:103 */     this.pointer = 0;
/*  98:104 */     this.format.clear();
/*  99:105 */     this.format.addElement(new VertexElement(0, cuv.FLOAT, EnumVertexElementType.POSITION, 3));
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void begin()
/* 103:    */   {
/* 104:109 */     a(7);
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void a(int paramInt)
/* 108:    */   {
/* 109:113 */     if (this.r) {
/* 110:114 */       throw new IllegalStateException("Already building!");
/* 111:    */     }
/* 112:116 */     this.r = true;
/* 113:    */     
/* 114:118 */     clear();
/* 115:119 */     this.k = paramInt;
/* 116:120 */     this.j = false;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setUV(double u, double v)
/* 120:    */   {
/* 121:124 */     if ((!this.format.hasUV(0)) && (!this.format.hasUV(1)))
/* 122:    */     {
/* 123:125 */       VertexElement element = new VertexElement(0, cuv.FLOAT, EnumVertexElementType.UV, 2);
/* 124:126 */       this.format.addElement(element);
/* 125:    */     }
/* 126:128 */     this.u = u;
/* 127:129 */     this.v = v;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void b(int paramInt)
/* 131:    */   {
/* 132:133 */     if (!this.format.hasUV(1))
/* 133:    */     {
/* 134:134 */       if (!this.format.hasUV(0)) {
/* 135:135 */         this.format.addElement(new VertexElement(0, cuv.FLOAT, EnumVertexElementType.UV, 2));
/* 136:    */       }
/* 137:137 */       VertexElement localcuu = new VertexElement(1, cuv.SHORT, EnumVertexElementType.UV, 2);
/* 138:138 */       this.format.addElement(localcuu);
/* 139:    */     }
/* 140:140 */     this.g = paramInt;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setColor(float r, float g, float b)
/* 144:    */   {
/* 145:144 */     setColor((int)(r * 255.0F), (int)(g * 255.0F), (int)(b * 255.0F));
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void setColor(float r, float g, float b, float a)
/* 149:    */   {
/* 150:148 */     setColor((int)(r * 255.0F), (int)(g * 255.0F), (int)(b * 255.0F), (int)(a * 255.0F));
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setColor(int r, int g, int b)
/* 154:    */   {
/* 155:152 */     setColor(r, g, b, 255);
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 159:    */   {
/* 160:156 */     int i1 = (this.count - 4) * (this.format.getSize() / 4) + this.format.getUVPointer(1) / 4;
/* 161:157 */     int i2 = this.format.getSize() >> 2;
/* 162:158 */     this.intBuffer.put(i1, paramInt1);
/* 163:159 */     this.intBuffer.put(i1 + i2, paramInt2);
/* 164:160 */     this.intBuffer.put(i1 + i2 * 2, paramInt3);
/* 165:161 */     this.intBuffer.put(i1 + i2 * 3, paramInt4);
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3)
/* 169:    */   {
/* 170:165 */     if (this.pointer >= this.size - this.format.getSize()) {
/* 171:166 */       grow(2097152);
/* 172:    */     }
/* 173:169 */     int i1 = this.format.getSize() / 4;
/* 174:170 */     int i2 = (this.count - 4) * i1;
/* 175:171 */     for (int i3 = 0; i3 < 4; i3++)
/* 176:    */     {
/* 177:172 */       int i4 = i2 + i3 * i1;
/* 178:173 */       int i5 = i4 + 1;
/* 179:174 */       int i6 = i5 + 1;
/* 180:175 */       this.intBuffer.put(i4, Float.floatToRawIntBits((float)(paramDouble1 + this.l) + Float.intBitsToFloat(this.intBuffer.get(i4))));
/* 181:176 */       this.intBuffer.put(i5, Float.floatToRawIntBits((float)(paramDouble2 + this.m) + Float.intBitsToFloat(this.intBuffer.get(i5))));
/* 182:177 */       this.intBuffer.put(i6, Float.floatToRawIntBits((float)(paramDouble3 + this.n) + Float.intBitsToFloat(this.intBuffer.get(i6))));
/* 183:    */     }
/* 184:    */   }
/* 185:    */   
/* 186:    */   private int f(int paramInt)
/* 187:    */   {
/* 188:182 */     return ((this.count - paramInt) * this.format.getSize() + this.format.getColorPointer()) / 4;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
/* 192:    */   {
/* 193:186 */     int i1 = f(paramInt);
/* 194:187 */     int i2 = this.intBuffer.get(i1);
/* 195:    */     int i3;
/* 196:    */     int i4;
/* 197:    */     int i5;
/* 198:188 */     if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN)
/* 199:    */     {
/* 200:189 */       i3 = (int)((i2 & 0xFF) * paramFloat1);
/* 201:190 */       i4 = (int)((i2 >> 8 & 0xFF) * paramFloat2);
/* 202:191 */       i5 = (int)((i2 >> 16 & 0xFF) * paramFloat3);
/* 203:192 */       i2 &= 0xFF000000;
/* 204:193 */       i2 |= i5 << 16 | i4 << 8 | i3;
/* 205:    */     }
/* 206:    */     else
/* 207:    */     {
/* 208:195 */       i3 = (int)((this.color >> 24 & 0xFF) * paramFloat1);
/* 209:196 */       i4 = (int)((this.color >> 16 & 0xFF) * paramFloat2);
/* 210:197 */       i5 = (int)((this.color >> 8 & 0xFF) * paramFloat3);
/* 211:198 */       i2 &= 0xFF;
/* 212:199 */       i2 |= i3 << 24 | i4 << 16 | i5 << 8;
/* 213:    */     }
/* 214:201 */     if (this.j) {
/* 215:202 */       i2 = -1;
/* 216:    */     }
/* 217:204 */     this.intBuffer.put(i1, i2);
/* 218:    */   }
/* 219:    */   
/* 220:    */   private void b(int paramInt1, int paramInt2)
/* 221:    */   {
/* 222:208 */     int i1 = f(paramInt2);
/* 223:209 */     int i2 = paramInt1 >> 16 & 0xFF;
/* 224:210 */     int i3 = paramInt1 >> 8 & 0xFF;
/* 225:211 */     int i4 = paramInt1 & 0xFF;
/* 226:212 */     int i5 = paramInt1 >> 24 & 0xFF;
/* 227:213 */     a(i1, i2, i3, i4, i5);
/* 228:    */   }
/* 229:    */   
/* 230:    */   public void b(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
/* 231:    */   {
/* 232:217 */     int i1 = f(paramInt);
/* 233:218 */     int i2 = MathUtils.clamp((int)(paramFloat1 * 255.0F), 0, 255);
/* 234:219 */     int i3 = MathUtils.clamp((int)(paramFloat2 * 255.0F), 0, 255);
/* 235:220 */     int i4 = MathUtils.clamp((int)(paramFloat3 * 255.0F), 0, 255);
/* 236:221 */     a(i1, i2, i3, i4, 255);
/* 237:    */   }
/* 238:    */   
/* 239:    */   private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/* 240:    */   {
/* 241:225 */     if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
/* 242:226 */       this.intBuffer.put(paramInt1, paramInt5 << 24 | paramInt4 << 16 | paramInt3 << 8 | paramInt2);
/* 243:    */     } else {
/* 244:228 */       this.intBuffer.put(paramInt1, paramInt2 << 24 | paramInt3 << 16 | paramInt4 << 8 | paramInt5);
/* 245:    */     }
/* 246:    */   }
/* 247:    */   
/* 248:    */   public void setColor(int r, int g, int b, int a)
/* 249:    */   {
/* 250:233 */     if (this.j) {
/* 251:234 */       return;
/* 252:    */     }
/* 253:237 */     if (r > 255) {
/* 254:238 */       r = 255;
/* 255:    */     }
/* 256:240 */     if (g > 255) {
/* 257:241 */       g = 255;
/* 258:    */     }
/* 259:243 */     if (b > 255) {
/* 260:244 */       b = 255;
/* 261:    */     }
/* 262:246 */     if (a > 255) {
/* 263:247 */       a = 255;
/* 264:    */     }
/* 265:249 */     if (r < 0) {
/* 266:250 */       r = 0;
/* 267:    */     }
/* 268:252 */     if (g < 0) {
/* 269:253 */       g = 0;
/* 270:    */     }
/* 271:255 */     if (b < 0) {
/* 272:256 */       b = 0;
/* 273:    */     }
/* 274:258 */     if (a < 0) {
/* 275:259 */       a = 0;
/* 276:    */     }
/* 277:262 */     if (!this.format.hasColor())
/* 278:    */     {
/* 279:263 */       VertexElement localcuu = new VertexElement(0, cuv.UBYTE, EnumVertexElementType.COLOR, 4);
/* 280:264 */       this.format.addElement(localcuu);
/* 281:    */     }
/* 282:266 */     if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
/* 283:267 */       this.color = (a << 24 | b << 16 | g << 8 | r);
/* 284:    */     } else {
/* 285:269 */       this.color = (r << 24 | g << 16 | b << 8 | a);
/* 286:    */     }
/* 287:    */   }
/* 288:    */   
/* 289:    */   public void setColor(byte paramByte1, byte paramByte2, byte paramByte3)
/* 290:    */   {
/* 291:274 */     setColor(paramByte1 & 0xFF, paramByte2 & 0xFF, paramByte3 & 0xFF);
/* 292:    */   }
/* 293:    */   
/* 294:    */   public void addVertexWithUV(double x, double y, double z, double u, double v)
/* 295:    */   {
/* 296:296 */     setUV(u, v);
/* 297:297 */     addVertex(x, y, z);
/* 298:    */   }
/* 299:    */   
/* 300:    */   public void setFormat(VertexFormat paramcus)
/* 301:    */   {
/* 302:301 */     this.format = new VertexFormat(paramcus);
/* 303:    */   }
/* 304:    */   
/* 305:    */   public void a(int[] paramArrayOfInt)
/* 306:    */   {
/* 307:305 */     int i1 = this.format.getSize() / 4;
/* 308:306 */     this.count += paramArrayOfInt.length / i1;
/* 309:307 */     this.intBuffer.position(this.pointer);
/* 310:308 */     this.intBuffer.put(paramArrayOfInt);
/* 311:309 */     this.pointer += paramArrayOfInt.length;
/* 312:    */   }
/* 313:    */   
/* 314:    */   public void addVertex(double paramDouble1, double paramDouble2, double paramDouble3)
/* 315:    */   {
/* 316:313 */     if (this.pointer >= this.size - this.format.getSize()) {
/* 317:314 */       grow(2097152);
/* 318:    */     }
/* 319:317 */     List<VertexElement> elements = this.format.getElements();
/* 320:318 */     for (VertexElement localcuu : elements)
/* 321:    */     {
/* 322:319 */       int i1 = localcuu.getPointer() >> 2;
/* 323:320 */       int i2 = this.pointer + i1;
/* 324:321 */       switch (ciw.a[localcuu.getType().ordinal()])
/* 325:    */       {
/* 326:    */       case 1: 
/* 327:323 */         this.intBuffer.put(i2, Float.floatToRawIntBits((float)(paramDouble1 + this.l)));
/* 328:324 */         this.intBuffer.put(i2 + 1, Float.floatToRawIntBits((float)(paramDouble2 + this.m)));
/* 329:325 */         this.intBuffer.put(i2 + 2, Float.floatToRawIntBits((float)(paramDouble3 + this.n)));
/* 330:326 */         break;
/* 331:    */       case 2: 
/* 332:328 */         this.intBuffer.put(i2, this.color);
/* 333:329 */         break;
/* 334:    */       case 3: 
/* 335:331 */         if (localcuu.e() == 0)
/* 336:    */         {
/* 337:332 */           this.intBuffer.put(i2, Float.floatToRawIntBits((float)this.u));
/* 338:333 */           this.intBuffer.put(i2 + 1, Float.floatToRawIntBits((float)this.v));
/* 339:    */         }
/* 340:    */         else
/* 341:    */         {
/* 342:335 */           this.intBuffer.put(i2, this.g);
/* 343:    */         }
/* 344:337 */         break;
/* 345:    */       case 4: 
/* 346:339 */         this.intBuffer.put(i2, this.o);
/* 347:    */       }
/* 348:    */     }
/* 349:344 */     this.pointer += (this.format.getSize() >> 2);
/* 350:    */     
/* 351:346 */     this.count += 1;
/* 352:    */   }
/* 353:    */   
/* 354:    */   public void setColor(int rgb)
/* 355:    */   {
/* 356:350 */     int i1 = rgb >> 16 & 0xFF;
/* 357:351 */     int i2 = rgb >> 8 & 0xFF;
/* 358:352 */     int i3 = rgb & 0xFF;
/* 359:353 */     setColor(i1, i2, i3);
/* 360:    */   }
/* 361:    */   
/* 362:    */   public void setColor(int rgb, int a)
/* 363:    */   {
/* 364:357 */     int i1 = rgb >> 16 & 0xFF;
/* 365:358 */     int i2 = rgb >> 8 & 0xFF;
/* 366:359 */     int i3 = rgb & 0xFF;
/* 367:360 */     setColor(i1, i2, i3, a);
/* 368:    */   }
/* 369:    */   
/* 370:    */   public void c()
/* 371:    */   {
/* 372:364 */     this.j = true;
/* 373:    */   }
/* 374:    */   
/* 375:    */   public void d(float paramFloat1, float paramFloat2, float paramFloat3)
/* 376:    */   {
/* 377:368 */     if (!this.format.hasNormal())
/* 378:    */     {
/* 379:369 */       VertexElement localcuu = new VertexElement(0, cuv.BYTE, EnumVertexElementType.NORMAL, 3);
/* 380:370 */       this.format.addElement(localcuu);
/* 381:    */       
/* 382:372 */       this.format.addElement(new VertexElement(0, cuv.UBYTE, EnumVertexElementType.PADDING, 1));
/* 383:    */     }
/* 384:374 */     int i1 = (byte)(int)(paramFloat1 * 127.0F);
/* 385:375 */     int i2 = (byte)(int)(paramFloat2 * 127.0F);
/* 386:376 */     int i3 = (byte)(int)(paramFloat3 * 127.0F);
/* 387:    */     
/* 388:378 */     this.o = (i1 & 0xFF | (i2 & 0xFF) << 8 | (i3 & 0xFF) << 16);
/* 389:    */   }
/* 390:    */   
/* 391:    */   public void e(float paramFloat1, float paramFloat2, float paramFloat3)
/* 392:    */   {
/* 393:382 */     int i1 = (byte)(int)(paramFloat1 * 127.0F);
/* 394:383 */     int i2 = (byte)(int)(paramFloat2 * 127.0F);
/* 395:384 */     int i3 = (byte)(int)(paramFloat3 * 127.0F);
/* 396:    */     
/* 397:386 */     int i4 = this.format.getSize() >> 2;
/* 398:387 */     int i5 = (this.count - 4) * i4 + this.format.getNormalPointer() / 4;
/* 399:388 */     this.o = (i1 & 0xFF | (i2 & 0xFF) << 8 | (i3 & 0xFF) << 16);
/* 400:389 */     this.intBuffer.put(i5, this.o);
/* 401:390 */     this.intBuffer.put(i5 + i4, this.o);
/* 402:391 */     this.intBuffer.put(i5 + i4 * 2, this.o);
/* 403:392 */     this.intBuffer.put(i5 + i4 * 3, this.o);
/* 404:    */   }
/* 405:    */   
/* 406:    */   public void c(double paramDouble1, double paramDouble2, double paramDouble3)
/* 407:    */   {
/* 408:396 */     this.l = paramDouble1;
/* 409:397 */     this.m = paramDouble2;
/* 410:398 */     this.n = paramDouble3;
/* 411:    */   }
/* 412:    */   
/* 413:    */   public int d()
/* 414:    */   {
/* 415:402 */     if (!this.r) {
/* 416:403 */       throw new IllegalStateException("Not building!");
/* 417:    */     }
/* 418:405 */     this.r = false;
/* 419:407 */     if (this.count > 0)
/* 420:    */     {
/* 421:408 */       this.byteBuffer.position(0);
/* 422:409 */       this.byteBuffer.limit(this.pointer * 4);
/* 423:    */     }
/* 424:412 */     this.p = (this.pointer * 4);
/* 425:413 */     return this.p;
/* 426:    */   }
/* 427:    */   
/* 428:    */   public int e()
/* 429:    */   {
/* 430:417 */     return this.p;
/* 431:    */   }
/* 432:    */   
/* 433:    */   public ByteBuffer f()
/* 434:    */   {
/* 435:421 */     return this.byteBuffer;
/* 436:    */   }
/* 437:    */   
/* 438:    */   public VertexFormat g()
/* 439:    */   {
/* 440:425 */     return this.format;
/* 441:    */   }
/* 442:    */   
/* 443:    */   public int h()
/* 444:    */   {
/* 445:429 */     return this.count;
/* 446:    */   }
/* 447:    */   
/* 448:    */   public int i()
/* 449:    */   {
/* 450:433 */     return this.k;
/* 451:    */   }
/* 452:    */   
/* 453:    */   public void d(int paramInt)
/* 454:    */   {
/* 455:437 */     for (int i1 = 0; i1 < 4; i1++) {
/* 456:438 */       b(paramInt, i1 + 1);
/* 457:    */     }
/* 458:    */   }
/* 459:    */   
/* 460:    */   public void f(float paramFloat1, float paramFloat2, float paramFloat3)
/* 461:    */   {
/* 462:443 */     for (int i1 = 0; i1 < 4; i1++) {
/* 463:444 */       b(paramFloat1, paramFloat2, paramFloat3, i1 + 1);
/* 464:    */     }
/* 465:    */   }
/* 466:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     civ
 * JD-Core Version:    0.7.0.1
 */
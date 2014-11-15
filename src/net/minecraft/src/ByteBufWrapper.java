package net.minecraft.src;
/*   1:    */ import com.google.common.base.Charsets;

/*   2:    */ import io.netty.buffer.ByteBuf;
/*   3:    */ import io.netty.buffer.ByteBufAllocator;
/*   4:    */ import io.netty.buffer.ByteBufInputStream;
/*   5:    */ import io.netty.buffer.ByteBufOutputStream;
/*   6:    */ import io.netty.buffer.ByteBufProcessor;
/*   7:    */ import io.netty.handler.codec.DecoderException;
/*   8:    */ import io.netty.handler.codec.EncoderException;

import java.io.DataOutput;
/*   9:    */ import java.io.IOException;
/*  10:    */ import java.io.InputStream;
/*  11:    */ import java.io.OutputStream;
/*  12:    */ import java.nio.ByteBuffer;
/*  13:    */ import java.nio.ByteOrder;
/*  14:    */ import java.nio.channels.GatheringByteChannel;
/*  15:    */ import java.nio.channels.ScatteringByteChannel;
/*  16:    */ import java.nio.charset.Charset;
/*  17:    */ import java.util.UUID;
/*  18:    */ 
/*  19:    */ public class ByteBufWrapper
/*  20:    */   extends ByteBuf
/*  21:    */ {
/*  22:    */   private final ByteBuf a;
/*  23:    */   
/*  24:    */   public ByteBufWrapper(ByteBuf paramByteBuf)
/*  25:    */   {
/*  26: 36 */     this.a = paramByteBuf;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public static int a(int paramInt)
/*  30:    */   {
/*  31: 40 */     for (int i = 1; i < 5; i++) {
/*  32: 41 */       if ((paramInt & -1 << i * 7) == 0) {
/*  33: 42 */         return i;
/*  34:    */       }
/*  35:    */     }
/*  36: 45 */     return 5;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void writeByteArray(byte[] paramArrayOfByte)
/*  40:    */   {
/*  41: 58 */     b(paramArrayOfByte.length);
/*  42: 59 */     writeBytes(paramArrayOfByte);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public byte[] readByteArray()
/*  46:    */   {
/*  47: 63 */     byte[] arrayOfByte = new byte[e()];
/*  48: 64 */     readBytes(arrayOfByte);
/*  49:    */     
/*  50: 66 */     return arrayOfByte;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public BlockPosition readBlockPosition()
/*  54:    */   {
/*  55: 81 */     return BlockPosition.a(readLong());
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void writeBlockPosition(BlockPosition paramdt)
/*  59:    */   {
/*  60: 85 */     writeLong(paramdt.g());
/*  61:    */   }
/*  62:    */   
/*  63:    */   public ho d()
/*  64:    */   {
/*  65: 89 */     return hp.a(c(32767));
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void a(ho paramho)
/*  69:    */   {
/*  70: 93 */     a(hp.a(paramho));
/*  71:    */   }
/*  72:    */   
/*  73:    */   public Enum a(Class paramClass)
/*  74:    */   {
/*  75: 97 */     return ((Enum[])paramClass.getEnumConstants())[e()];
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void a(Enum paramEnum)
/*  79:    */   {
/*  80:101 */     b(paramEnum.ordinal());
/*  81:    */   }
/*  82:    */   
/*  83:    */   public int e()
/*  84:    */   {
/*  85:105 */     int i = 0;
/*  86:106 */     int j = 0;
/*  87:    */     for (;;)
/*  88:    */     {
/*  89:109 */       int k = readByte();
/*  90:    */       
/*  91:111 */       i |= (k & 0x7F) << j++ * 7;
/*  92:113 */       if (j > 5) {
/*  93:114 */         throw new RuntimeException("VarInt too big");
/*  94:    */       }
/*  95:117 */       if ((k & 0x80) != 128) {
/*  96:    */         break;
/*  97:    */       }
/*  98:    */     }
/*  99:122 */     return i;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public long f()
/* 103:    */   {
/* 104:126 */     long l = 0L;
/* 105:127 */     int i = 0;
/* 106:    */     for (;;)
/* 107:    */     {
/* 108:130 */       int j = readByte();
/* 109:    */       
/* 110:132 */       l |= (j & 0x7F) << i++ * 7;
/* 111:134 */       if (i > 10) {
/* 112:135 */         throw new RuntimeException("VarLong too big");
/* 113:    */       }
/* 114:138 */       if ((j & 0x80) != 128) {
/* 115:    */         break;
/* 116:    */       }
/* 117:    */     }
/* 118:143 */     return l;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void a(UUID paramUUID)
/* 122:    */   {
/* 123:147 */     writeLong(paramUUID.getMostSignificantBits());
/* 124:148 */     writeLong(paramUUID.getLeastSignificantBits());
/* 125:    */   }
/* 126:    */   
/* 127:    */   public UUID g()
/* 128:    */   {
/* 129:152 */     return new UUID(readLong(), readLong());
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void b(int paramInt)
/* 133:    */   {
/* 134:    */     for (;;)
/* 135:    */     {
/* 136:157 */       if ((paramInt & 0xFFFFFF80) == 0)
/* 137:    */       {
/* 138:158 */         writeByte(paramInt);
/* 139:159 */         return;
/* 140:    */       }
/* 141:162 */       writeByte(paramInt & 0x7F | 0x80);
/* 142:163 */       paramInt >>>= 7;
/* 143:    */     }
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void b(long paramLong)
/* 147:    */   {
/* 148:    */     for (;;)
/* 149:    */     {
/* 150:169 */       if ((paramLong & 0xFFFFFF80) == 0L)
/* 151:    */       {
/* 152:170 */         writeByte((int)paramLong);
/* 153:171 */         return;
/* 154:    */       }
/* 155:174 */       writeByte((int)(paramLong & 0x7F) | 0x80);
/* 156:175 */       paramLong >>>= 7;
/* 157:    */     }
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void a(NBTTagCompound paramfn)
/* 161:    */   {
/* 162:180 */     if (paramfn == null) {
/* 163:181 */       writeByte(0);
/* 164:    */     } else {
/* 165:    */       try
/* 166:    */       {
/* 167:184 */         fz.a(paramfn, (DataOutput)new ByteBufOutputStream(this));
/* 168:    */       }
/* 169:    */       catch (IOException localIOException)
/* 170:    */       {
/* 171:186 */         throw new EncoderException(localIOException);
/* 172:    */       }
/* 173:    */     }
/* 174:    */   }
/* 175:    */   
/* 176:    */   public NBTTagCompound h() throws IOException
/* 177:    */   {
/* 178:193 */     int i = readerIndex();
/* 179:194 */     int j = readByte();
/* 180:196 */     if (j == 0) {
/* 181:197 */       return null;
/* 182:    */     }
/* 183:199 */     readerIndex(i);
/* 184:200 */     return fz.a(new ByteBufInputStream(this), new fx(2097152L));
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void a(ItemStack paramamj)
/* 188:    */   {
/* 189:205 */     if (paramamj == null)
/* 190:    */     {
/* 191:206 */       writeShort(-1);
/* 192:    */     }
/* 193:    */     else
/* 194:    */     {
/* 195:208 */       writeShort(Item.b(paramamj.getItem()));
/* 196:209 */       writeByte(paramamj.stackSize);
/* 197:210 */       writeShort(paramamj.getDamage2());
/* 198:    */       
/* 199:212 */       NBTTagCompound localfn = null;
/* 200:213 */       if ((paramamj.getItem().m()) || (paramamj.getItem().p())) {
/* 201:214 */         localfn = paramamj.getTagCompound();
/* 202:    */       }
/* 203:216 */       a(localfn);
/* 204:    */     }
/* 205:    */   }
/* 206:    */   
/* 207:    */   public ItemStack i() throws IOException
/* 208:    */   {
/* 209:221 */     ItemStack localamj = null;
/* 210:222 */     int i = readShort();
/* 211:223 */     if (i >= 0)
/* 212:    */     {
/* 213:224 */       int j = readByte();
/* 214:225 */       int k = readShort();
/* 215:    */       
/* 216:227 */       localamj = new ItemStack(Item.b(i), j, k);
/* 217:228 */       localamj.setTagCompound(h());
/* 218:    */     }
/* 219:231 */     return localamj;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public String c(int paramInt)
/* 223:    */   {
/* 224:235 */     int i = e();
/* 225:236 */     if (i > paramInt * 4) {
/* 226:237 */       throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + i + " > " + paramInt * 4 + ")");
/* 227:    */     }
/* 228:239 */     if (i < 0) {
/* 229:240 */       throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
/* 230:    */     }
/* 231:243 */     String str = new String(readBytes(i).array(), Charsets.UTF_8);
/* 232:245 */     if (str.length() > paramInt) {
/* 233:246 */       throw new DecoderException("The received string length is longer than maximum allowed (" + i + " > " + paramInt + ")");
/* 234:    */     }
/* 235:249 */     return str;
/* 236:    */   }
/* 237:    */   
/* 238:    */   public ByteBufWrapper a(String paramString)
/* 239:    */   {
/* 240:253 */     byte[] arrayOfByte = paramString.getBytes(Charsets.UTF_8);
/* 241:254 */     if (arrayOfByte.length > 32767) {
/* 242:255 */       throw new EncoderException("String too big (was " + paramString.length() + " bytes encoded, max " + 32767 + ")");
/* 243:    */     }
/* 244:257 */     b(arrayOfByte.length);
/* 245:258 */     writeBytes(arrayOfByte);
/* 246:259 */     return this;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public int capacity()
/* 250:    */   {
/* 251:264 */     return this.a.capacity();
/* 252:    */   }
/* 253:    */   
/* 254:    */   public ByteBuf capacity(int paramInt)
/* 255:    */   {
/* 256:269 */     return this.a.capacity(paramInt);
/* 257:    */   }
/* 258:    */   
/* 259:    */   public int maxCapacity()
/* 260:    */   {
/* 261:274 */     return this.a.maxCapacity();
/* 262:    */   }
/* 263:    */   
/* 264:    */   public ByteBufAllocator alloc()
/* 265:    */   {
/* 266:279 */     return this.a.alloc();
/* 267:    */   }
/* 268:    */   
/* 269:    */   public ByteOrder order()
/* 270:    */   {
/* 271:284 */     return this.a.order();
/* 272:    */   }
/* 273:    */   
/* 274:    */   public ByteBuf order(ByteOrder paramByteOrder)
/* 275:    */   {
/* 276:289 */     return this.a.order(paramByteOrder);
/* 277:    */   }
/* 278:    */   
/* 279:    */   public ByteBuf unwrap()
/* 280:    */   {
/* 281:294 */     return this.a.unwrap();
/* 282:    */   }
/* 283:    */   
/* 284:    */   public boolean isDirect()
/* 285:    */   {
/* 286:299 */     return this.a.isDirect();
/* 287:    */   }
/* 288:    */   
/* 289:    */   public int readerIndex()
/* 290:    */   {
/* 291:304 */     return this.a.readerIndex();
/* 292:    */   }
/* 293:    */   
/* 294:    */   public ByteBuf readerIndex(int paramInt)
/* 295:    */   {
/* 296:309 */     return this.a.readerIndex(paramInt);
/* 297:    */   }
/* 298:    */   
/* 299:    */   public int writerIndex()
/* 300:    */   {
/* 301:314 */     return this.a.writerIndex();
/* 302:    */   }
/* 303:    */   
/* 304:    */   public ByteBuf writerIndex(int paramInt)
/* 305:    */   {
/* 306:319 */     return this.a.writerIndex(paramInt);
/* 307:    */   }
/* 308:    */   
/* 309:    */   public ByteBuf setIndex(int paramInt1, int paramInt2)
/* 310:    */   {
/* 311:324 */     return this.a.setIndex(paramInt1, paramInt2);
/* 312:    */   }
/* 313:    */   
/* 314:    */   public int readableBytes()
/* 315:    */   {
/* 316:329 */     return this.a.readableBytes();
/* 317:    */   }
/* 318:    */   
/* 319:    */   public int writableBytes()
/* 320:    */   {
/* 321:334 */     return this.a.writableBytes();
/* 322:    */   }
/* 323:    */   
/* 324:    */   public int maxWritableBytes()
/* 325:    */   {
/* 326:339 */     return this.a.maxWritableBytes();
/* 327:    */   }
/* 328:    */   
/* 329:    */   public boolean isReadable()
/* 330:    */   {
/* 331:344 */     return this.a.isReadable();
/* 332:    */   }
/* 333:    */   
/* 334:    */   public boolean isReadable(int paramInt)
/* 335:    */   {
/* 336:349 */     return this.a.isReadable(paramInt);
/* 337:    */   }
/* 338:    */   
/* 339:    */   public boolean isWritable()
/* 340:    */   {
/* 341:354 */     return this.a.isWritable();
/* 342:    */   }
/* 343:    */   
/* 344:    */   public boolean isWritable(int paramInt)
/* 345:    */   {
/* 346:359 */     return this.a.isWritable(paramInt);
/* 347:    */   }
/* 348:    */   
/* 349:    */   public ByteBuf clear()
/* 350:    */   {
/* 351:364 */     return this.a.clear();
/* 352:    */   }
/* 353:    */   
/* 354:    */   public ByteBuf markReaderIndex()
/* 355:    */   {
/* 356:369 */     return this.a.markReaderIndex();
/* 357:    */   }
/* 358:    */   
/* 359:    */   public ByteBuf resetReaderIndex()
/* 360:    */   {
/* 361:374 */     return this.a.resetReaderIndex();
/* 362:    */   }
/* 363:    */   
/* 364:    */   public ByteBuf markWriterIndex()
/* 365:    */   {
/* 366:379 */     return this.a.markWriterIndex();
/* 367:    */   }
/* 368:    */   
/* 369:    */   public ByteBuf resetWriterIndex()
/* 370:    */   {
/* 371:384 */     return this.a.resetWriterIndex();
/* 372:    */   }
/* 373:    */   
/* 374:    */   public ByteBuf discardReadBytes()
/* 375:    */   {
/* 376:389 */     return this.a.discardReadBytes();
/* 377:    */   }
/* 378:    */   
/* 379:    */   public ByteBuf discardSomeReadBytes()
/* 380:    */   {
/* 381:394 */     return this.a.discardSomeReadBytes();
/* 382:    */   }
/* 383:    */   
/* 384:    */   public ByteBuf ensureWritable(int paramInt)
/* 385:    */   {
/* 386:399 */     return this.a.ensureWritable(paramInt);
/* 387:    */   }
/* 388:    */   
/* 389:    */   public int ensureWritable(int paramInt, boolean paramBoolean)
/* 390:    */   {
/* 391:404 */     return this.a.ensureWritable(paramInt, paramBoolean);
/* 392:    */   }
/* 393:    */   
/* 394:    */   public boolean getBoolean(int paramInt)
/* 395:    */   {
/* 396:409 */     return this.a.getBoolean(paramInt);
/* 397:    */   }
/* 398:    */   
/* 399:    */   public byte getByte(int paramInt)
/* 400:    */   {
/* 401:414 */     return this.a.getByte(paramInt);
/* 402:    */   }
/* 403:    */   
/* 404:    */   public short getUnsignedByte(int paramInt)
/* 405:    */   {
/* 406:419 */     return this.a.getUnsignedByte(paramInt);
/* 407:    */   }
/* 408:    */   
/* 409:    */   public short getShort(int paramInt)
/* 410:    */   {
/* 411:424 */     return this.a.getShort(paramInt);
/* 412:    */   }
/* 413:    */   
/* 414:    */   public int getUnsignedShort(int paramInt)
/* 415:    */   {
/* 416:429 */     return this.a.getUnsignedShort(paramInt);
/* 417:    */   }
/* 418:    */   
/* 419:    */   public int getMedium(int paramInt)
/* 420:    */   {
/* 421:434 */     return this.a.getMedium(paramInt);
/* 422:    */   }
/* 423:    */   
/* 424:    */   public int getUnsignedMedium(int paramInt)
/* 425:    */   {
/* 426:439 */     return this.a.getUnsignedMedium(paramInt);
/* 427:    */   }
/* 428:    */   
/* 429:    */   public int getInt(int paramInt)
/* 430:    */   {
/* 431:444 */     return this.a.getInt(paramInt);
/* 432:    */   }
/* 433:    */   
/* 434:    */   public long getUnsignedInt(int paramInt)
/* 435:    */   {
/* 436:449 */     return this.a.getUnsignedInt(paramInt);
/* 437:    */   }
/* 438:    */   
/* 439:    */   public long getLong(int paramInt)
/* 440:    */   {
/* 441:454 */     return this.a.getLong(paramInt);
/* 442:    */   }
/* 443:    */   
/* 444:    */   public char getChar(int paramInt)
/* 445:    */   {
/* 446:459 */     return this.a.getChar(paramInt);
/* 447:    */   }
/* 448:    */   
/* 449:    */   public float getFloat(int paramInt)
/* 450:    */   {
/* 451:464 */     return this.a.getFloat(paramInt);
/* 452:    */   }
/* 453:    */   
/* 454:    */   public double getDouble(int paramInt)
/* 455:    */   {
/* 456:469 */     return this.a.getDouble(paramInt);
/* 457:    */   }
/* 458:    */   
/* 459:    */   public ByteBuf getBytes(int paramInt, ByteBuf paramByteBuf)
/* 460:    */   {
/* 461:474 */     return this.a.getBytes(paramInt, paramByteBuf);
/* 462:    */   }
/* 463:    */   
/* 464:    */   public ByteBuf getBytes(int paramInt1, ByteBuf paramByteBuf, int paramInt2)
/* 465:    */   {
/* 466:479 */     return this.a.getBytes(paramInt1, paramByteBuf, paramInt2);
/* 467:    */   }
/* 468:    */   
/* 469:    */   public ByteBuf getBytes(int paramInt1, ByteBuf paramByteBuf, int paramInt2, int paramInt3)
/* 470:    */   {
/* 471:484 */     return this.a.getBytes(paramInt1, paramByteBuf, paramInt2, paramInt3);
/* 472:    */   }
/* 473:    */   
/* 474:    */   public ByteBuf getBytes(int paramInt, byte[] paramArrayOfByte)
/* 475:    */   {
/* 476:489 */     return this.a.getBytes(paramInt, paramArrayOfByte);
/* 477:    */   }
/* 478:    */   
/* 479:    */   public ByteBuf getBytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
/* 480:    */   {
/* 481:494 */     return this.a.getBytes(paramInt1, paramArrayOfByte, paramInt2, paramInt3);
/* 482:    */   }
/* 483:    */   
/* 484:    */   public ByteBuf getBytes(int paramInt, ByteBuffer paramByteBuffer)
/* 485:    */   {
/* 486:499 */     return this.a.getBytes(paramInt, paramByteBuffer);
/* 487:    */   }
/* 488:    */   
/* 489:    */   public ByteBuf getBytes(int paramInt1, OutputStream paramOutputStream, int paramInt2) throws IOException
/* 490:    */   {
/* 491:504 */     return this.a.getBytes(paramInt1, paramOutputStream, paramInt2);
/* 492:    */   }
/* 493:    */   
/* 494:    */   public int getBytes(int paramInt1, GatheringByteChannel paramGatheringByteChannel, int paramInt2) throws IOException
/* 495:    */   {
/* 496:509 */     return this.a.getBytes(paramInt1, paramGatheringByteChannel, paramInt2);
/* 497:    */   }
/* 498:    */   
/* 499:    */   public ByteBuf setBoolean(int paramInt, boolean paramBoolean)
/* 500:    */   {
/* 501:514 */     return this.a.setBoolean(paramInt, paramBoolean);
/* 502:    */   }
/* 503:    */   
/* 504:    */   public ByteBuf setByte(int paramInt1, int paramInt2)
/* 505:    */   {
/* 506:519 */     return this.a.setByte(paramInt1, paramInt2);
/* 507:    */   }
/* 508:    */   
/* 509:    */   public ByteBuf setShort(int paramInt1, int paramInt2)
/* 510:    */   {
/* 511:524 */     return this.a.setShort(paramInt1, paramInt2);
/* 512:    */   }
/* 513:    */   
/* 514:    */   public ByteBuf setMedium(int paramInt1, int paramInt2)
/* 515:    */   {
/* 516:529 */     return this.a.setMedium(paramInt1, paramInt2);
/* 517:    */   }
/* 518:    */   
/* 519:    */   public ByteBuf setInt(int paramInt1, int paramInt2)
/* 520:    */   {
/* 521:534 */     return this.a.setInt(paramInt1, paramInt2);
/* 522:    */   }
/* 523:    */   
/* 524:    */   public ByteBuf setLong(int paramInt, long paramLong)
/* 525:    */   {
/* 526:539 */     return this.a.setLong(paramInt, paramLong);
/* 527:    */   }
/* 528:    */   
/* 529:    */   public ByteBuf setChar(int paramInt1, int paramInt2)
/* 530:    */   {
/* 531:544 */     return this.a.setChar(paramInt1, paramInt2);
/* 532:    */   }
/* 533:    */   
/* 534:    */   public ByteBuf setFloat(int paramInt, float paramFloat)
/* 535:    */   {
/* 536:549 */     return this.a.setFloat(paramInt, paramFloat);
/* 537:    */   }
/* 538:    */   
/* 539:    */   public ByteBuf setDouble(int paramInt, double paramDouble)
/* 540:    */   {
/* 541:554 */     return this.a.setDouble(paramInt, paramDouble);
/* 542:    */   }
/* 543:    */   
/* 544:    */   public ByteBuf setBytes(int paramInt, ByteBuf paramByteBuf)
/* 545:    */   {
/* 546:559 */     return this.a.setBytes(paramInt, paramByteBuf);
/* 547:    */   }
/* 548:    */   
/* 549:    */   public ByteBuf setBytes(int paramInt1, ByteBuf paramByteBuf, int paramInt2)
/* 550:    */   {
/* 551:564 */     return this.a.setBytes(paramInt1, paramByteBuf, paramInt2);
/* 552:    */   }
/* 553:    */   
/* 554:    */   public ByteBuf setBytes(int paramInt1, ByteBuf paramByteBuf, int paramInt2, int paramInt3)
/* 555:    */   {
/* 556:569 */     return this.a.setBytes(paramInt1, paramByteBuf, paramInt2, paramInt3);
/* 557:    */   }
/* 558:    */   
/* 559:    */   public ByteBuf setBytes(int paramInt, byte[] paramArrayOfByte)
/* 560:    */   {
/* 561:574 */     return this.a.setBytes(paramInt, paramArrayOfByte);
/* 562:    */   }
/* 563:    */   
/* 564:    */   public ByteBuf setBytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
/* 565:    */   {
/* 566:579 */     return this.a.setBytes(paramInt1, paramArrayOfByte, paramInt2, paramInt3);
/* 567:    */   }
/* 568:    */   
/* 569:    */   public ByteBuf setBytes(int paramInt, ByteBuffer paramByteBuffer)
/* 570:    */   {
/* 571:584 */     return this.a.setBytes(paramInt, paramByteBuffer);
/* 572:    */   }
/* 573:    */   
/* 574:    */   public int setBytes(int paramInt1, InputStream paramInputStream, int paramInt2) throws IOException
/* 575:    */   {
/* 576:589 */     return this.a.setBytes(paramInt1, paramInputStream, paramInt2);
/* 577:    */   }
/* 578:    */   
/* 579:    */   public int setBytes(int paramInt1, ScatteringByteChannel paramScatteringByteChannel, int paramInt2) throws IOException
/* 580:    */   {
/* 581:594 */     return this.a.setBytes(paramInt1, paramScatteringByteChannel, paramInt2);
/* 582:    */   }
/* 583:    */   
/* 584:    */   public ByteBuf setZero(int paramInt1, int paramInt2)
/* 585:    */   {
/* 586:599 */     return this.a.setZero(paramInt1, paramInt2);
/* 587:    */   }
/* 588:    */   
/* 589:    */   public boolean readBoolean()
/* 590:    */   {
/* 591:604 */     return this.a.readBoolean();
/* 592:    */   }
/* 593:    */   
/* 594:    */   public byte readByte()
/* 595:    */   {
/* 596:609 */     return this.a.readByte();
/* 597:    */   }
/* 598:    */   
/* 599:    */   public short readUnsignedByte()
/* 600:    */   {
/* 601:614 */     return this.a.readUnsignedByte();
/* 602:    */   }
/* 603:    */   
/* 604:    */   public short readShort()
/* 605:    */   {
/* 606:619 */     return this.a.readShort();
/* 607:    */   }
/* 608:    */   
/* 609:    */   public int readUnsignedShort()
/* 610:    */   {
/* 611:624 */     return this.a.readUnsignedShort();
/* 612:    */   }
/* 613:    */   
/* 614:    */   public int readMedium()
/* 615:    */   {
/* 616:629 */     return this.a.readMedium();
/* 617:    */   }
/* 618:    */   
/* 619:    */   public int readUnsignedMedium()
/* 620:    */   {
/* 621:634 */     return this.a.readUnsignedMedium();
/* 622:    */   }
/* 623:    */   
/* 624:    */   public int readInt()
/* 625:    */   {
/* 626:639 */     return this.a.readInt();
/* 627:    */   }
/* 628:    */   
/* 629:    */   public long readUnsignedInt()
/* 630:    */   {
/* 631:644 */     return this.a.readUnsignedInt();
/* 632:    */   }
/* 633:    */   
/* 634:    */   public long readLong()
/* 635:    */   {
/* 636:649 */     return this.a.readLong();
/* 637:    */   }
/* 638:    */   
/* 639:    */   public char readChar()
/* 640:    */   {
/* 641:654 */     return this.a.readChar();
/* 642:    */   }
/* 643:    */   
/* 644:    */   public float readFloat()
/* 645:    */   {
/* 646:659 */     return this.a.readFloat();
/* 647:    */   }
/* 648:    */   
/* 649:    */   public double readDouble()
/* 650:    */   {
/* 651:664 */     return this.a.readDouble();
/* 652:    */   }
/* 653:    */   
/* 654:    */   public ByteBuf readBytes(int paramInt)
/* 655:    */   {
/* 656:669 */     return this.a.readBytes(paramInt);
/* 657:    */   }
/* 658:    */   
/* 659:    */   public ByteBuf readSlice(int paramInt)
/* 660:    */   {
/* 661:674 */     return this.a.readSlice(paramInt);
/* 662:    */   }
/* 663:    */   
/* 664:    */   public ByteBuf readBytes(ByteBuf paramByteBuf)
/* 665:    */   {
/* 666:679 */     return this.a.readBytes(paramByteBuf);
/* 667:    */   }
/* 668:    */   
/* 669:    */   public ByteBuf readBytes(ByteBuf paramByteBuf, int paramInt)
/* 670:    */   {
/* 671:684 */     return this.a.readBytes(paramByteBuf, paramInt);
/* 672:    */   }
/* 673:    */   
/* 674:    */   public ByteBuf readBytes(ByteBuf paramByteBuf, int paramInt1, int paramInt2)
/* 675:    */   {
/* 676:689 */     return this.a.readBytes(paramByteBuf, paramInt1, paramInt2);
/* 677:    */   }
/* 678:    */   
/* 679:    */   public ByteBuf readBytes(byte[] paramArrayOfByte)
/* 680:    */   {
/* 681:694 */     return this.a.readBytes(paramArrayOfByte);
/* 682:    */   }
/* 683:    */   
/* 684:    */   public ByteBuf readBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/* 685:    */   {
/* 686:699 */     return this.a.readBytes(paramArrayOfByte, paramInt1, paramInt2);
/* 687:    */   }
/* 688:    */   
/* 689:    */   public ByteBuf readBytes(ByteBuffer paramByteBuffer)
/* 690:    */   {
/* 691:704 */     return this.a.readBytes(paramByteBuffer);
/* 692:    */   }
/* 693:    */   
/* 694:    */   public ByteBuf readBytes(OutputStream paramOutputStream, int paramInt) throws IOException
/* 695:    */   {
/* 696:709 */     return this.a.readBytes(paramOutputStream, paramInt);
/* 697:    */   }
/* 698:    */   
/* 699:    */   public int readBytes(GatheringByteChannel paramGatheringByteChannel, int paramInt) throws IOException
/* 700:    */   {
/* 701:714 */     return this.a.readBytes(paramGatheringByteChannel, paramInt);
/* 702:    */   }
/* 703:    */   
/* 704:    */   public ByteBuf skipBytes(int paramInt)
/* 705:    */   {
/* 706:719 */     return this.a.skipBytes(paramInt);
/* 707:    */   }
/* 708:    */   
/* 709:    */   public ByteBuf writeBoolean(boolean paramBoolean)
/* 710:    */   {
/* 711:724 */     return this.a.writeBoolean(paramBoolean);
/* 712:    */   }
/* 713:    */   
/* 714:    */   public ByteBuf writeByte(int paramInt)
/* 715:    */   {
/* 716:729 */     return this.a.writeByte(paramInt);
/* 717:    */   }
/* 718:    */   
/* 719:    */   public ByteBuf writeShort(int paramInt)
/* 720:    */   {
/* 721:734 */     return this.a.writeShort(paramInt);
/* 722:    */   }
/* 723:    */   
/* 724:    */   public ByteBuf writeMedium(int paramInt)
/* 725:    */   {
/* 726:739 */     return this.a.writeMedium(paramInt);
/* 727:    */   }
/* 728:    */   
/* 729:    */   public ByteBuf writeInt(int paramInt)
/* 730:    */   {
/* 731:744 */     return this.a.writeInt(paramInt);
/* 732:    */   }
/* 733:    */   
/* 734:    */   public ByteBuf writeLong(long paramLong)
/* 735:    */   {
/* 736:749 */     return this.a.writeLong(paramLong);
/* 737:    */   }
/* 738:    */   
/* 739:    */   public ByteBuf writeChar(int paramInt)
/* 740:    */   {
/* 741:754 */     return this.a.writeChar(paramInt);
/* 742:    */   }
/* 743:    */   
/* 744:    */   public ByteBuf writeFloat(float paramFloat)
/* 745:    */   {
/* 746:759 */     return this.a.writeFloat(paramFloat);
/* 747:    */   }
/* 748:    */   
/* 749:    */   public ByteBuf writeDouble(double paramDouble)
/* 750:    */   {
/* 751:764 */     return this.a.writeDouble(paramDouble);
/* 752:    */   }
/* 753:    */   
/* 754:    */   public ByteBuf writeBytes(ByteBuf paramByteBuf)
/* 755:    */   {
/* 756:769 */     return this.a.writeBytes(paramByteBuf);
/* 757:    */   }
/* 758:    */   
/* 759:    */   public ByteBuf writeBytes(ByteBuf paramByteBuf, int paramInt)
/* 760:    */   {
/* 761:774 */     return this.a.writeBytes(paramByteBuf, paramInt);
/* 762:    */   }
/* 763:    */   
/* 764:    */   public ByteBuf writeBytes(ByteBuf paramByteBuf, int paramInt1, int paramInt2)
/* 765:    */   {
/* 766:779 */     return this.a.writeBytes(paramByteBuf, paramInt1, paramInt2);
/* 767:    */   }
/* 768:    */   
/* 769:    */   public ByteBuf writeBytes(byte[] paramArrayOfByte)
/* 770:    */   {
/* 771:784 */     return this.a.writeBytes(paramArrayOfByte);
/* 772:    */   }
/* 773:    */   
/* 774:    */   public ByteBuf writeBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/* 775:    */   {
/* 776:789 */     return this.a.writeBytes(paramArrayOfByte, paramInt1, paramInt2);
/* 777:    */   }
/* 778:    */   
/* 779:    */   public ByteBuf writeBytes(ByteBuffer paramByteBuffer)
/* 780:    */   {
/* 781:794 */     return this.a.writeBytes(paramByteBuffer);
/* 782:    */   }
/* 783:    */   
/* 784:    */   public int writeBytes(InputStream paramInputStream, int paramInt) throws IOException
/* 785:    */   {
/* 786:799 */     return this.a.writeBytes(paramInputStream, paramInt);
/* 787:    */   }
/* 788:    */   
/* 789:    */   public int writeBytes(ScatteringByteChannel paramScatteringByteChannel, int paramInt) throws IOException
/* 790:    */   {
/* 791:804 */     return this.a.writeBytes(paramScatteringByteChannel, paramInt);
/* 792:    */   }
/* 793:    */   
/* 794:    */   public ByteBuf writeZero(int paramInt)
/* 795:    */   {
/* 796:809 */     return this.a.writeZero(paramInt);
/* 797:    */   }
/* 798:    */   
/* 799:    */   public int indexOf(int paramInt1, int paramInt2, byte paramByte)
/* 800:    */   {
/* 801:814 */     return this.a.indexOf(paramInt1, paramInt2, paramByte);
/* 802:    */   }
/* 803:    */   
/* 804:    */   public int bytesBefore(byte paramByte)
/* 805:    */   {
/* 806:819 */     return this.a.bytesBefore(paramByte);
/* 807:    */   }
/* 808:    */   
/* 809:    */   public int bytesBefore(int paramInt, byte paramByte)
/* 810:    */   {
/* 811:824 */     return this.a.bytesBefore(paramInt, paramByte);
/* 812:    */   }
/* 813:    */   
/* 814:    */   public int bytesBefore(int paramInt1, int paramInt2, byte paramByte)
/* 815:    */   {
/* 816:829 */     return this.a.bytesBefore(paramInt1, paramInt2, paramByte);
/* 817:    */   }
/* 818:    */   
/* 819:    */   public int forEachByte(ByteBufProcessor paramByteBufProcessor)
/* 820:    */   {
/* 821:834 */     return this.a.forEachByte(paramByteBufProcessor);
/* 822:    */   }
/* 823:    */   
/* 824:    */   public int forEachByte(int paramInt1, int paramInt2, ByteBufProcessor paramByteBufProcessor)
/* 825:    */   {
/* 826:839 */     return this.a.forEachByte(paramInt1, paramInt2, paramByteBufProcessor);
/* 827:    */   }
/* 828:    */   
/* 829:    */   public int forEachByteDesc(ByteBufProcessor paramByteBufProcessor)
/* 830:    */   {
/* 831:844 */     return this.a.forEachByteDesc(paramByteBufProcessor);
/* 832:    */   }
/* 833:    */   
/* 834:    */   public int forEachByteDesc(int paramInt1, int paramInt2, ByteBufProcessor paramByteBufProcessor)
/* 835:    */   {
/* 836:849 */     return this.a.forEachByteDesc(paramInt1, paramInt2, paramByteBufProcessor);
/* 837:    */   }
/* 838:    */   
/* 839:    */   public ByteBuf copy()
/* 840:    */   {
/* 841:854 */     return this.a.copy();
/* 842:    */   }
/* 843:    */   
/* 844:    */   public ByteBuf copy(int paramInt1, int paramInt2)
/* 845:    */   {
/* 846:859 */     return this.a.copy(paramInt1, paramInt2);
/* 847:    */   }
/* 848:    */   
/* 849:    */   public ByteBuf slice()
/* 850:    */   {
/* 851:864 */     return this.a.slice();
/* 852:    */   }
/* 853:    */   
/* 854:    */   public ByteBuf slice(int paramInt1, int paramInt2)
/* 855:    */   {
/* 856:869 */     return this.a.slice(paramInt1, paramInt2);
/* 857:    */   }
/* 858:    */   
/* 859:    */   public ByteBuf duplicate()
/* 860:    */   {
/* 861:874 */     return this.a.duplicate();
/* 862:    */   }
/* 863:    */   
/* 864:    */   public int nioBufferCount()
/* 865:    */   {
/* 866:879 */     return this.a.nioBufferCount();
/* 867:    */   }
/* 868:    */   
/* 869:    */   public ByteBuffer nioBuffer()
/* 870:    */   {
/* 871:884 */     return this.a.nioBuffer();
/* 872:    */   }
/* 873:    */   
/* 874:    */   public ByteBuffer nioBuffer(int paramInt1, int paramInt2)
/* 875:    */   {
/* 876:889 */     return this.a.nioBuffer(paramInt1, paramInt2);
/* 877:    */   }
/* 878:    */   
/* 879:    */   public ByteBuffer internalNioBuffer(int paramInt1, int paramInt2)
/* 880:    */   {
/* 881:894 */     return this.a.internalNioBuffer(paramInt1, paramInt2);
/* 882:    */   }
/* 883:    */   
/* 884:    */   public ByteBuffer[] nioBuffers()
/* 885:    */   {
/* 886:899 */     return this.a.nioBuffers();
/* 887:    */   }
/* 888:    */   
/* 889:    */   public ByteBuffer[] nioBuffers(int paramInt1, int paramInt2)
/* 890:    */   {
/* 891:904 */     return this.a.nioBuffers(paramInt1, paramInt2);
/* 892:    */   }
/* 893:    */   
/* 894:    */   public boolean hasArray()
/* 895:    */   {
/* 896:909 */     return this.a.hasArray();
/* 897:    */   }
/* 898:    */   
/* 899:    */   public byte[] array()
/* 900:    */   {
/* 901:914 */     return this.a.array();
/* 902:    */   }
/* 903:    */   
/* 904:    */   public int arrayOffset()
/* 905:    */   {
/* 906:919 */     return this.a.arrayOffset();
/* 907:    */   }
/* 908:    */   
/* 909:    */   public boolean hasMemoryAddress()
/* 910:    */   {
/* 911:924 */     return this.a.hasMemoryAddress();
/* 912:    */   }
/* 913:    */   
/* 914:    */   public long memoryAddress()
/* 915:    */   {
/* 916:929 */     return this.a.memoryAddress();
/* 917:    */   }
/* 918:    */   
/* 919:    */   public String toString(Charset paramCharset)
/* 920:    */   {
/* 921:934 */     return this.a.toString(paramCharset);
/* 922:    */   }
/* 923:    */   
/* 924:    */   public String toString(int paramInt1, int paramInt2, Charset paramCharset)
/* 925:    */   {
/* 926:939 */     return this.a.toString(paramInt1, paramInt2, paramCharset);
/* 927:    */   }
/* 928:    */   
/* 929:    */   public int hashCode()
/* 930:    */   {
/* 931:944 */     return this.a.hashCode();
/* 932:    */   }
/* 933:    */   
/* 934:    */   public boolean equals(Object paramObject)
/* 935:    */   {
/* 936:949 */     return this.a.equals(paramObject);
/* 937:    */   }
/* 938:    */   
/* 939:    */   public int compareTo(ByteBuf paramByteBuf)
/* 940:    */   {
/* 941:954 */     return this.a.compareTo(paramByteBuf);
/* 942:    */   }
/* 943:    */   
/* 944:    */   public String toString()
/* 945:    */   {
/* 946:959 */     return this.a.toString();
/* 947:    */   }
/* 948:    */   
/* 949:    */   public ByteBuf retain(int paramInt)
/* 950:    */   {
/* 951:964 */     return this.a.retain(paramInt);
/* 952:    */   }
/* 953:    */   
/* 954:    */   public ByteBuf retain()
/* 955:    */   {
/* 956:969 */     return this.a.retain();
/* 957:    */   }
/* 958:    */   
/* 959:    */   public int refCnt()
/* 960:    */   {
/* 961:974 */     return this.a.refCnt();
/* 962:    */   }
/* 963:    */   
/* 964:    */   public boolean release()
/* 965:    */   {
/* 966:979 */     return this.a.release();
/* 967:    */   }
/* 968:    */   
/* 969:    */   public boolean release(int paramInt)
/* 970:    */   {
/* 971:984 */     return this.a.release(paramInt);
/* 972:    */   }
/* 973:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hd
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*   1:    */ import java.awt.image.BufferedImage;
/*   2:    */ import java.io.File;
/*   3:    */ import java.io.IOException;
/*   4:    */ import java.io.InputStream;
/*   6:    */ import java.nio.IntBuffer;

/*   7:    */ import javax.imageio.ImageIO;

/*   8:    */ import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
/*  10:    */ import org.apache.logging.log4j.Logger;
/*  11:    */ import org.lwjgl.BufferUtils;
/*  12:    */ import org.lwjgl.opengl.GL11;
/*  13:    */ 
/*  14:    */ public class cuj
/*  15:    */ {
/*  16: 26 */   private static final Logger c = LogManager.getLogger();
/*  17: 28 */   private static final IntBuffer d = bst.f(4194304);
/*  18: 32 */   public static final ctp a = new ctp(16, 16);
/*  19: 33 */   public static final int[] b = a.e();
/*  20:    */   
/*  21:    */   static
/*  22:    */   {
/*  25: 42 */     int[] arrayOfInt1 = { -524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040 };
/*  26: 43 */     int[] arrayOfInt2 = { -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216 };
/*  27: 44 */     int k = arrayOfInt1.length;
/*  28: 45 */     for (int m = 0; m < 16; m++)
/*  29:    */     {
/*  30: 46 */       System.arraycopy(m < k ? arrayOfInt1 : arrayOfInt2, 0, b, 16 * m, k);
/*  31: 47 */       System.arraycopy(m < k ? arrayOfInt2 : arrayOfInt1, 0, b, 16 * m + k, k);
/*  32:    */     }
/*  33: 49 */     a.d();
/*  34:    */   }
/*  35:    */   
/*  36:    */   public static int a()
/*  37:    */   {
/*  38: 53 */     return cjm.y();
/*  39:    */   }
/*  40:    */   
/*  41:    */   public static void a(int paramInt)
/*  42:    */   {
/*  43: 57 */     cjm.h(paramInt);
/*  44:    */   }
/*  45:    */   
/*  46:    */   public static int a(int paramInt, BufferedImage paramBufferedImage)
/*  47:    */   {
/*  48: 61 */     return a(paramInt, paramBufferedImage, false, false);
/*  49:    */   }
/*  50:    */   
/*  51:    */   public static void a(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3)
/*  52:    */   {
/*  53: 65 */     b(paramInt1);
/*  54:    */     
/*  55: 67 */     a(0, paramArrayOfInt, paramInt2, paramInt3, 0, 0, false, false, false);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public static int[][] a(int paramInt1, int paramInt2, int[][] paramArrayOfInt)
/*  59:    */   {
/*  60: 71 */     int[][] arrayOfInt = new int[paramInt1 + 1][];
/*  61: 72 */     arrayOfInt[0] = paramArrayOfInt[0];
/*  62: 74 */     if (paramInt1 > 0)
/*  63:    */     {
/*  64: 76 */       boolean bool = false;
/*  65: 77 */       for (int i = 0; i < paramArrayOfInt.length; i++) {
/*  66: 78 */         if (paramArrayOfInt[0][i] >> 24 == 0)
/*  67:    */         {
/*  68: 79 */           bool = true;
/*  69: 80 */           break;
/*  70:    */         }
/*  71:    */       }
/*  72: 84 */       for (int i = 1; i <= paramInt1; i++) {
/*  73: 86 */         if (paramArrayOfInt[i] != null)
/*  74:    */         {
/*  75: 87 */           arrayOfInt[i] = paramArrayOfInt[i];
/*  76:    */         }
/*  77:    */         else
/*  78:    */         {
/*  79: 91 */           int[] localArrayOfInt = arrayOfInt[(i - 1)];
/*  80: 92 */           int[] arrayOfInt1 = new int[localArrayOfInt.length >> 2];
/*  81:    */           
/*  82: 94 */           int j = paramInt2 >> i;
/*  83: 95 */           int k = arrayOfInt1.length / j;
/*  84: 96 */           int m = j << 1;
/*  85: 98 */           for (int n = 0; n < j; n++) {
/*  86: 99 */             for (int i1 = 0; i1 < k; i1++)
/*  87:    */             {
/*  88:100 */               int i2 = 2 * (n + i1 * m);
/*  89:101 */               arrayOfInt1[(n + i1 * j)] = a(localArrayOfInt[(i2 + 0)], localArrayOfInt[(i2 + 1)], localArrayOfInt[(i2 + 0 + m)], localArrayOfInt[(i2 + 1 + m)], bool);
/*  90:    */             }
/*  91:    */           }
/*  92:111 */           arrayOfInt[i] = arrayOfInt1;
/*  93:    */         }
/*  94:    */       }
/*  95:    */     }
/*  96:115 */     return arrayOfInt;
/*  97:    */   }
/*  98:    */   
/*  99:118 */   private static final int[] e = new int[4];
/* 100:    */   
/* 101:    */   private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
/* 102:    */   {
/* 103:120 */     if (!paramBoolean)
/* 104:    */     {
/* 105:121 */       int i = a(paramInt1, paramInt2, paramInt3, paramInt4, 24);
/* 106:122 */       int j = a(paramInt1, paramInt2, paramInt3, paramInt4, 16);
/* 107:123 */       int k = a(paramInt1, paramInt2, paramInt3, paramInt4, 8);
/* 108:124 */       int m = a(paramInt1, paramInt2, paramInt3, paramInt4, 0);
/* 109:    */       
/* 110:126 */       return i << 24 | j << 16 | k << 8 | m;
/* 111:    */     }
/* 112:128 */     e[0] = paramInt1;
/* 113:129 */     e[1] = paramInt2;
/* 114:130 */     e[2] = paramInt3;
/* 115:131 */     e[3] = paramInt4;
/* 116:    */     
/* 117:133 */     float f1 = 0.0F;
/* 118:134 */     float f2 = 0.0F;
/* 119:135 */     float f3 = 0.0F;
/* 120:136 */     float f4 = 0.0F;
/* 121:138 */     for (int n = 0; n < 4; n++) {
/* 122:139 */       if (e[n] >> 24 != 0)
/* 123:    */       {
/* 124:140 */         f1 += (float)Math.pow((e[n] >> 24 & 0xFF) / 255.0F, 2.2D);
/* 125:141 */         f2 += (float)Math.pow((e[n] >> 16 & 0xFF) / 255.0F, 2.2D);
/* 126:142 */         f3 += (float)Math.pow((e[n] >> 8 & 0xFF) / 255.0F, 2.2D);
/* 127:143 */         f4 += (float)Math.pow((e[n] >> 0 & 0xFF) / 255.0F, 2.2D);
/* 128:    */       }
/* 129:    */     }
/* 130:147 */     f1 /= 4.0F;
/* 131:148 */     f2 /= 4.0F;
/* 132:149 */     f3 /= 4.0F;
/* 133:150 */     f4 /= 4.0F;
/* 134:    */     
/* 135:152 */     int n = (int)(Math.pow(f1, 0.4545454545454545D) * 255.0D);
/* 136:153 */     int i1 = (int)(Math.pow(f2, 0.4545454545454545D) * 255.0D);
/* 137:154 */     int i2 = (int)(Math.pow(f3, 0.4545454545454545D) * 255.0D);
/* 138:155 */     int i3 = (int)(Math.pow(f4, 0.4545454545454545D) * 255.0D);
/* 139:157 */     if (n < 96) {
/* 140:158 */       n = 0;
/* 141:    */     }
/* 142:160 */     return n << 24 | i1 << 16 | i2 << 8 | i3;
/* 143:    */   }
/* 144:    */   
/* 145:    */   private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/* 146:    */   {
/* 147:165 */     float f1 = (float)Math.pow((paramInt1 >> paramInt5 & 0xFF) / 255.0F, 2.2D);
/* 148:166 */     float f2 = (float)Math.pow((paramInt2 >> paramInt5 & 0xFF) / 255.0F, 2.2D);
/* 149:167 */     float f3 = (float)Math.pow((paramInt3 >> paramInt5 & 0xFF) / 255.0F, 2.2D);
/* 150:168 */     float f4 = (float)Math.pow((paramInt4 >> paramInt5 & 0xFF) / 255.0F, 2.2D);
/* 151:169 */     float f5 = (float)Math.pow((f1 + f2 + f3 + f4) * 0.25D, 0.4545454545454545D);
/* 152:    */     
/* 153:171 */     return (int)(f5 * 255.0D);
/* 154:    */   }
/* 155:    */   
/* 156:    */   public static void a(int[][] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
/* 157:    */   {
/* 158:175 */     for (int i = 0; i < paramArrayOfInt.length; i++)
/* 159:    */     {
/* 160:176 */       int[] arrayOfInt = paramArrayOfInt[i];
/* 161:    */       
/* 162:178 */       a(i, arrayOfInt, paramInt1 >> i, paramInt2 >> i, paramInt3 >> i, paramInt4 >> i, paramBoolean1, paramBoolean2, paramArrayOfInt.length > 1);
/* 163:    */     }
/* 164:    */   }
/* 165:    */   
/* 166:    */   private static void a(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/* 167:    */   {
/* 168:183 */     int i = 4194304 / paramInt2;
/* 169:    */     
/* 170:185 */     a(paramBoolean1, paramBoolean3);
/* 171:186 */     a(paramBoolean2);
/* 172:    */     
/* 173:188 */     int j = 0;
/* 174:189 */     while (j < paramInt2 * paramInt3)
/* 175:    */     {
/* 176:190 */       int k = j / paramInt2;
/* 177:191 */       int m = Math.min(i, paramInt3 - k);
/* 178:192 */       int n = paramInt2 * m;
/* 179:    */       
/* 180:194 */       b(paramArrayOfInt, j, n);
/* 181:    */       
/* 182:196 */       GL11.glTexSubImage2D(3553, paramInt1, paramInt4, paramInt5 + k, paramInt2, m, 32993, 33639, d);
/* 183:    */       
/* 184:198 */       j += paramInt2 * m;
/* 185:    */     }
/* 186:    */   }
/* 187:    */   
/* 188:    */   public static int a(int paramInt, BufferedImage paramBufferedImage, boolean paramBoolean1, boolean paramBoolean2)
/* 189:    */   {
/* 190:203 */     a(paramInt, paramBufferedImage.getWidth(), paramBufferedImage.getHeight());
/* 191:    */     
/* 192:205 */     return a(paramInt, paramBufferedImage, 0, 0, paramBoolean1, paramBoolean2);
/* 193:    */   }
/* 194:    */   
/* 195:    */   public static void a(int paramInt1, int paramInt2, int paramInt3)
/* 196:    */   {
/* 197:209 */     a(paramInt1, 0, paramInt2, paramInt3);
/* 198:    */   }
/* 199:    */   
/* 200:    */   public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 201:    */   {
/* 202:214 */     a(paramInt1);
/* 203:    */     
/* 204:216 */     b(paramInt1);
/* 205:218 */     if (paramInt2 >= 0)
/* 206:    */     {
/* 207:219 */       GL11.glTexParameteri(3553, 33085, paramInt2);
/* 208:220 */       GL11.glTexParameterf(3553, 33082, 0.0F);
/* 209:221 */       GL11.glTexParameterf(3553, 33083, paramInt2);
/* 210:222 */       GL11.glTexParameterf(3553, 34049, 0.0F);
/* 211:    */     }
/* 212:225 */     for (int i = 0; i <= paramInt2; i++) {
/* 213:226 */       GL11.glTexImage2D(3553, i, 6408, paramInt3 >> i, paramInt4 >> i, 0, 32993, 33639, (IntBuffer)null);
/* 214:    */     }
/* 215:    */   }
/* 216:    */   
/* 217:    */   public static int a(int paramInt1, BufferedImage paramBufferedImage, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
/* 218:    */   {
/* 219:269 */     b(paramInt1);
/* 220:    */     
/* 221:271 */     a(paramBufferedImage, paramInt2, paramInt3, paramBoolean1, paramBoolean2);
/* 222:    */     
/* 223:273 */     return paramInt1;
/* 224:    */   }
/* 225:    */   
/* 226:    */   private static void a(BufferedImage paramBufferedImage, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
/* 227:    */   {
/* 228:277 */     int i = paramBufferedImage.getWidth();
/* 229:278 */     int j = paramBufferedImage.getHeight();
/* 230:    */     
/* 231:280 */     int k = 4194304 / i;
/* 232:281 */     int[] arrayOfInt = new int[k * i];
/* 233:    */     
/* 234:283 */     b(paramBoolean1);
/* 235:284 */     a(paramBoolean2);
/* 236:    */     
/* 237:286 */     int m = 0;
/* 238:287 */     while (m < i * j)
/* 239:    */     {
/* 240:288 */       int n = m / i;
/* 241:289 */       int i1 = Math.min(k, j - n);
/* 242:290 */       int i2 = i * i1;
/* 243:    */       
/* 244:292 */       paramBufferedImage.getRGB(0, n, i, i1, arrayOfInt, 0, i);
/* 245:    */       
/* 246:294 */       a(arrayOfInt, i2);
/* 247:    */       
/* 248:296 */       GL11.glTexSubImage2D(3553, 0, paramInt1, paramInt2 + n, i, i1, 32993, 33639, d);
/* 249:    */       
/* 250:298 */       m += i * k;
/* 251:    */     }
/* 252:    */   }
/* 253:    */   
/* 254:    */   private static void a(boolean paramBoolean)
/* 255:    */   {
/* 256:303 */     if (paramBoolean)
/* 257:    */     {
/* 258:304 */       GL11.glTexParameteri(3553, 10242, 10496);
/* 259:305 */       GL11.glTexParameteri(3553, 10243, 10496);
/* 260:    */     }
/* 261:    */     else
/* 262:    */     {
/* 263:307 */       GL11.glTexParameteri(3553, 10242, 10497);
/* 264:308 */       GL11.glTexParameteri(3553, 10243, 10497);
/* 265:    */     }
/* 266:    */   }
/* 267:    */   
/* 268:    */   private static void b(boolean paramBoolean)
/* 269:    */   {
/* 270:313 */     a(paramBoolean, false);
/* 271:    */   }
/* 272:    */   
/* 273:    */   private static void a(boolean paramBoolean1, boolean paramBoolean2)
/* 274:    */   {
/* 275:317 */     if (paramBoolean1)
/* 276:    */     {
/* 277:318 */       GL11.glTexParameteri(3553, 10241, paramBoolean2 ? 9987 : 9729);
/* 278:319 */       GL11.glTexParameteri(3553, 10240, 9729);
/* 279:    */     }
/* 280:    */     else
/* 281:    */     {
/* 282:321 */       GL11.glTexParameteri(3553, 10241, paramBoolean2 ? 9986 : 9728);
/* 283:322 */       GL11.glTexParameteri(3553, 10240, 9728);
/* 284:    */     }
/* 285:    */   }
/* 286:    */   
/* 287:    */   private static void a(int[] paramArrayOfInt, int paramInt)
/* 288:    */   {
/* 289:327 */     b(paramArrayOfInt, 0, paramInt);
/* 290:    */   }
/* 291:    */   
/* 292:    */   private static void b(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/* 293:    */   {
/* 294:331 */     int[] arrayOfInt = paramArrayOfInt;
/* 295:333 */     if (bsu.z().t.e) {
/* 296:334 */       arrayOfInt = a(paramArrayOfInt);
/* 297:    */     }
/* 298:337 */     d.clear();
/* 299:338 */     d.put(arrayOfInt, paramInt1, paramInt2);
/* 300:339 */     d.position(0).limit(paramInt2);
/* 301:    */   }
/* 302:    */   
/* 303:    */   static void b(int paramInt)
/* 304:    */   {
/* 305:343 */     cjm.i(paramInt);
/* 306:    */   }
/* 307:    */   
/* 308:    */   public static int[] a(cvk paramcvk, oa paramoa) throws IOException
/* 309:    */   {
/* 310:347 */     BufferedImage localBufferedImage = a(paramcvk.a(paramoa).b());
/* 311:    */     
/* 312:349 */     int i = localBufferedImage.getWidth();
/* 313:350 */     int j = localBufferedImage.getHeight();
/* 314:    */     
/* 315:352 */     int[] arrayOfInt = new int[i * j];
/* 316:353 */     localBufferedImage.getRGB(0, 0, i, j, arrayOfInt, 0, i);
/* 317:    */     
/* 318:355 */     return arrayOfInt;
/* 319:    */   }
/* 320:    */   
/* 321:    */   public static BufferedImage a(InputStream paramInputStream) throws IOException
/* 322:    */   {
/* 323:    */     try
/* 324:    */     {
/* 325:360 */       return ImageIO.read(paramInputStream);
/* 326:    */     }
/* 327:    */     finally
/* 328:    */     {
/* 329:362 */       IOUtils.closeQuietly(paramInputStream);
/* 330:    */     }
/* 331:    */   }
/* 332:    */   
/* 333:    */   public static int[] a(int[] paramArrayOfInt)
/* 334:    */   {
/* 335:367 */     int[] arrayOfInt = new int[paramArrayOfInt.length];
/* 336:368 */     for (int i = 0; i < paramArrayOfInt.length; i++) {
/* 337:369 */       arrayOfInt[i] = c(paramArrayOfInt[i]);
/* 338:    */     }
/* 339:372 */     return arrayOfInt;
/* 340:    */   }
/* 341:    */   
/* 342:    */   public static int c(int paramInt)
/* 343:    */   {
/* 344:376 */     int i = paramInt >> 24 & 0xFF;
/* 345:377 */     int j = paramInt >> 16 & 0xFF;
/* 346:378 */     int k = paramInt >> 8 & 0xFF;
/* 347:379 */     int m = paramInt & 0xFF;
/* 348:    */     
/* 349:381 */     int n = (j * 30 + k * 59 + m * 11) / 100;
/* 350:382 */     int i1 = (j * 30 + k * 70) / 100;
/* 351:383 */     int i2 = (j * 30 + m * 70) / 100;
/* 352:    */     
/* 353:385 */     return i << 24 | n << 16 | i1 << 8 | i2;
/* 354:    */   }
/* 355:    */   
/* 356:    */   public static void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 357:    */   {
/* 358:389 */     b(paramInt1);
/* 359:    */     
/* 360:391 */     GL11.glPixelStorei(3333, 1);
/* 361:392 */     GL11.glPixelStorei(3317, 1);
/* 362:394 */     for (int i = 0; i <= paramInt2; i++)
/* 363:    */     {
/* 364:395 */       File localFile = new File(paramString + "_" + i + ".png");
/* 365:    */       
/* 366:397 */       int j = paramInt3 >> i;
/* 367:398 */       int k = paramInt4 >> i;
/* 368:    */       
/* 369:400 */       int m = j * k;
/* 370:401 */       IntBuffer localIntBuffer = BufferUtils.createIntBuffer(m);
/* 371:402 */       int[] arrayOfInt = new int[m];
/* 372:    */       
/* 373:404 */       GL11.glGetTexImage(3553, i, 32993, 33639, localIntBuffer);
/* 374:405 */       localIntBuffer.get(arrayOfInt);
/* 375:    */       
/* 376:407 */       BufferedImage localBufferedImage = new BufferedImage(j, k, 2);
/* 377:408 */       localBufferedImage.setRGB(0, 0, j, k, arrayOfInt, 0, j);
/* 378:    */       try
/* 379:    */       {
/* 380:411 */         ImageIO.write(localBufferedImage, "png", localFile);
/* 381:412 */         c.debug("Exported png to: {}", new Object[] { localFile.getAbsolutePath() });
/* 382:    */       }
/* 383:    */       catch (IOException localIOException)
/* 384:    */       {
/* 385:414 */         c.debug("Unable to write: ", localIOException);
/* 386:    */       }
/* 387:    */     }
/* 388:    */   }
/* 389:    */   
/* 390:    */   public static void a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/* 391:    */   {
/* 392:420 */     int[] arrayOfInt = new int[paramInt1];
/* 393:421 */     int i = paramInt2 / 2;
/* 394:422 */     for (int j = 0; j < i; j++)
/* 395:    */     {
/* 396:423 */       System.arraycopy(paramArrayOfInt, j * paramInt1, arrayOfInt, 0, paramInt1);
/* 397:424 */       System.arraycopy(paramArrayOfInt, (paramInt2 - 1 - j) * paramInt1, paramArrayOfInt, j * paramInt1, paramInt1);
/* 398:425 */       System.arraycopy(arrayOfInt, 0, paramArrayOfInt, (paramInt2 - 1 - j) * paramInt1, paramInt1);
/* 399:    */     }
/* 400:    */   }
/* 401:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cuj
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.awt.image.BufferedImage;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.Iterator;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Set;
/*   7:    */ 
/*   8:    */ public class cue
/*   9:    */ {
/*  10:    */   private final String j;
/*  11: 22 */   protected List a = Lists.newArrayList();
/*  12:    */   protected int[][] b;
/*  13:    */   private cwo k;
/*  14:    */   protected boolean c;
/*  15:    */   protected int d;
/*  16:    */   protected int e;
/*  17:    */   protected int f;
/*  18:    */   protected int g;
/*  19:    */   private float l;
/*  20:    */   private float m;
/*  21:    */   private float n;
/*  22:    */   private float o;
/*  23:    */   protected int h;
/*  24:    */   protected int i;
/*  25: 40 */   private static String p = "builtin/clock";
/*  26: 41 */   private static String q = "builtin/compass";
/*  27:    */   
/*  28:    */   protected cue(String paramString)
/*  29:    */   {
/*  30: 44 */     this.j = paramString;
/*  31:    */   }
/*  32:    */   
/*  33:    */   protected static cue a(oa paramoa)
/*  34:    */   {
/*  35: 48 */     String str = paramoa.toString();
/*  36: 49 */     if (p.equals(str)) {
/*  37: 50 */       return new cum(str);
/*  38:    */     }
/*  39: 51 */     if (q.equals(str)) {
/*  40: 52 */       return new cun(str);
/*  41:    */     }
/*  42: 54 */     return new cue(str);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public static void a(String paramString)
/*  46:    */   {
/*  47: 58 */     p = paramString;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public static void b(String paramString)
/*  51:    */   {
/*  52: 62 */     q = paramString;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
/*  56:    */   {
/*  57: 66 */     this.d = paramInt3;
/*  58: 67 */     this.e = paramInt4;
/*  59: 68 */     this.c = paramBoolean;
/*  60:    */     
/*  61: 70 */     float f1 = (float)(0.009999999776482582D / paramInt1);
/*  62: 71 */     float f2 = (float)(0.009999999776482582D / paramInt2);
/*  63:    */     
/*  64: 73 */     this.l = (paramInt3 / (float)paramInt1 + f1);
/*  65: 74 */     this.m = ((paramInt3 + this.f) / (float)paramInt1 - f1);
/*  66: 75 */     this.n = (paramInt4 / paramInt2 + f2);
/*  67: 76 */     this.o = ((paramInt4 + this.g) / paramInt2 - f2);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void a(cue paramcue)
/*  71:    */   {
/*  72: 80 */     this.d = paramcue.d;
/*  73: 81 */     this.e = paramcue.e;
/*  74:    */     
/*  75: 83 */     this.f = paramcue.f;
/*  76: 84 */     this.g = paramcue.g;
/*  77:    */     
/*  78: 86 */     this.c = paramcue.c;
/*  79:    */     
/*  80: 88 */     this.l = paramcue.l;
/*  81: 89 */     this.m = paramcue.m;
/*  82: 90 */     this.n = paramcue.n;
/*  83: 91 */     this.o = paramcue.o;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public int a()
/*  87:    */   {
/*  88: 95 */     return this.d;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public int b()
/*  92:    */   {
/*  93: 99 */     return this.e;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public int c()
/*  97:    */   {
/*  98:103 */     return this.f;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public int d()
/* 102:    */   {
/* 103:107 */     return this.g;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public float e()
/* 107:    */   {
/* 108:111 */     return this.l;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public float f()
/* 112:    */   {
/* 113:115 */     return this.m;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public float a(double paramDouble)
/* 117:    */   {
/* 118:119 */     float f1 = this.m - this.l;
/* 119:120 */     return this.l + f1 * (float)paramDouble / 16.0F;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public float g()
/* 123:    */   {
/* 124:124 */     return this.n;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public float h()
/* 128:    */   {
/* 129:128 */     return this.o;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public float b(double paramDouble)
/* 133:    */   {
/* 134:132 */     float f1 = this.o - this.n;
/* 135:133 */     return this.n + f1 * ((float)paramDouble / 16.0F);
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String i()
/* 139:    */   {
/* 140:137 */     return this.j;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void j()
/* 144:    */   {
/* 145:141 */     this.i += 1;
/* 146:142 */     if (this.i >= this.k.a(this.h))
/* 147:    */     {
/* 148:143 */       int i1 = this.k.c(this.h);
/* 149:144 */       int i2 = this.k.c() == 0 ? this.a.size() : this.k.c();
/* 150:145 */       this.h = ((this.h + 1) % i2);
/* 151:146 */       this.i = 0;
/* 152:    */       
/* 153:148 */       int i3 = this.k.c(this.h);
/* 154:149 */       if ((i1 != i3) && (i3 >= 0) && (i3 < this.a.size())) {
/* 155:150 */         cuj.a((int[][])this.a.get(i3), this.f, this.g, this.d, this.e, false, false);
/* 156:    */       }
/* 157:    */     }
/* 158:152 */     else if (this.k.e())
/* 159:    */     {
/* 160:153 */       n();
/* 161:    */     }
/* 162:    */   }
/* 163:    */   
/* 164:    */   private void n()
/* 165:    */   {
/* 166:158 */     double d1 = 1.0D - this.i / this.k.a(this.h);
/* 167:    */     
/* 168:160 */     int i1 = this.k.c(this.h);
/* 169:161 */     int i2 = this.k.c() == 0 ? this.a.size() : this.k.c();
/* 170:162 */     int i3 = this.k.c((this.h + 1) % i2);
/* 171:163 */     if ((i1 != i3) && (i3 >= 0) && (i3 < this.a.size()))
/* 172:    */     {
/* 173:164 */       int[][] arrayOfInt1 = (int[][])this.a.get(i1);
/* 174:165 */       int[][] arrayOfInt2 = (int[][])this.a.get(i3);
/* 175:167 */       if ((this.b == null) || (this.b.length != arrayOfInt1.length)) {
/* 176:168 */         this.b = new int[arrayOfInt1.length][];
/* 177:    */       }
/* 178:170 */       for (int i4 = 0; i4 < arrayOfInt1.length; i4++)
/* 179:    */       {
/* 180:171 */         if (this.b[i4] == null) {
/* 181:172 */           this.b[i4] = new int[arrayOfInt1[i4].length];
/* 182:    */         }
/* 183:174 */         if ((i4 < arrayOfInt2.length) && (arrayOfInt2[i4].length == arrayOfInt1[i4].length)) {
/* 184:177 */           for (int i5 = 0; i5 < arrayOfInt1[i4].length; i5++)
/* 185:    */           {
/* 186:178 */             int i6 = arrayOfInt1[i4][i5];
/* 187:179 */             int i7 = arrayOfInt2[i4][i5];
/* 188:180 */             int i8 = (int)(((i6 & 0xFF0000) >> 16) * d1 + ((i7 & 0xFF0000) >> 16) * (1.0D - d1));
/* 189:181 */             int i9 = (int)(((i6 & 0xFF00) >> 8) * d1 + ((i7 & 0xFF00) >> 8) * (1.0D - d1));
/* 190:182 */             int i10 = (int)((i6 & 0xFF) * d1 + (i7 & 0xFF) * (1.0D - d1));
/* 191:    */             
/* 192:184 */             this.b[i4][i5] = (i6 & 0xFF000000 | i8 << 16 | i9 << 8 | i10);
/* 193:    */           }
/* 194:    */         }
/* 195:    */       }
/* 196:187 */       cuj.a(this.b, this.f, this.g, this.d, this.e, false, false);
/* 197:    */     }
/* 198:    */   }
/* 199:    */   
/* 200:    */   public int[][] a(int paramInt)
/* 201:    */   {
/* 202:192 */     return (int[][])this.a.get(paramInt);
/* 203:    */   }
/* 204:    */   
/* 205:    */   public int k()
/* 206:    */   {
/* 207:196 */     return this.a.size();
/* 208:    */   }
/* 209:    */   
/* 210:    */   public void b(int paramInt)
/* 211:    */   {
/* 212:200 */     this.f = paramInt;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public void c(int paramInt)
/* 216:    */   {
/* 217:204 */     this.g = paramInt;
/* 218:    */   }
/* 219:    */   
/* 220:    */   public void a(BufferedImage[] paramArrayOfBufferedImage, cwo paramcwo)
/* 221:    */   {
/* 222:208 */     o();
/* 223:    */     
/* 224:210 */     int width = paramArrayOfBufferedImage[0].getWidth();
/* 225:211 */     int height = paramArrayOfBufferedImage[0].getHeight();
/* 226:    */     
/* 227:213 */     this.f = width;
/* 228:214 */     this.g = height;
/* 229:    */     
/* 230:    */ 
/* 231:217 */     int[][] arrayOfInt = new int[paramArrayOfBufferedImage.length][];
/* 232:    */     BufferedImage localBufferedImage2;
/* 233:218 */     for (int i2 = 0; i2 < paramArrayOfBufferedImage.length; i2++)
/* 234:    */     {
/* 235:219 */       localBufferedImage2 = paramArrayOfBufferedImage[i2];
/* 236:222 */       if (localBufferedImage2 != null)
/* 237:    */       {
/* 238:226 */         if ((i2 > 0) && ((localBufferedImage2.getWidth() != width >> i2) || (localBufferedImage2.getHeight() != height >> i2))) {
/* 239:227 */           throw new RuntimeException(String.format("Unable to load miplevel: %d, image is size: %dx%d, expected %dx%d", new Object[] { Integer.valueOf(i2), Integer.valueOf(localBufferedImage2.getWidth()), Integer.valueOf(localBufferedImage2.getHeight()), Integer.valueOf(width >> i2), Integer.valueOf(height >> i2) }));
/* 240:    */         }
/* 241:230 */         arrayOfInt[i2] = new int[localBufferedImage2.getWidth() * localBufferedImage2.getHeight()];
/* 242:231 */         localBufferedImage2.getRGB(0, 0, localBufferedImage2.getWidth(), localBufferedImage2.getHeight(), arrayOfInt[i2], 0, localBufferedImage2.getWidth());
/* 243:    */       }
/* 244:    */     }
/* 245:234 */     if (paramcwo == null)
/* 246:    */     {
/* 247:235 */       if (height != width) {
/* 248:236 */         throw new RuntimeException("broken aspect ratio and not an animation");
/* 249:    */       }
/* 250:241 */       this.a.add(arrayOfInt);
/* 251:    */     }
/* 252:    */     else
/* 253:    */     {
/* 254:243 */       int i2 = height / width;
/* 255:244 */       int localBufferedImage21 = width;
/* 256:245 */       int i3 = width;
/* 257:246 */       this.g = this.f;
/* 258:    */       Object localObject;
/* 259:    */       int i4;
/* 260:248 */       if (paramcwo.c() > 0)
/* 261:    */       {
/* 262:250 */         for (localObject = paramcwo.f().iterator(); ((Iterator)localObject).hasNext();)
/* 263:    */         {
/* 264:250 */           i4 = ((Integer)((Iterator)localObject).next()).intValue();
/* 265:251 */           if (i4 >= i2) {
/* 266:252 */             throw new RuntimeException("invalid frameindex " + i4);
/* 267:    */           }
/* 268:254 */           e(i4);
/* 269:255 */           this.a.set(i4, a(arrayOfInt, localBufferedImage21, i3, i4));
/* 270:    */         }
/* 271:257 */         this.k = paramcwo;
/* 272:    */       }
/* 273:    */       else
/* 274:    */       {
/* 275:260 */         localObject = Lists.newArrayList();
/* 276:262 */         for (int i41 = 0; i41 < i2; i41++)
/* 277:    */         {
/* 278:263 */           this.a.add(a(arrayOfInt, localBufferedImage21, i3, i41));
/* 279:    */           
/* 280:265 */           ((List)localObject).add(new cwn(i41, -1));
/* 281:    */         }
/* 282:268 */         this.k = new cwo((List)localObject, this.f, this.g, paramcwo.d(), paramcwo.e());
/* 283:    */       }
/* 284:    */     }
/* 285:    */   }
/* 286:    */   
/* 287:    */   public void d(int paramInt)
/* 288:    */   {
/* 289:274 */     ArrayList localArrayList = Lists.newArrayList();
/* 290:276 */     for (int i1 = 0; i1 < this.a.size(); i1++)
/* 291:    */     {
/* 292:277 */       int[][] arrayOfInt = (int[][])this.a.get(i1);
/* 293:279 */       if (arrayOfInt != null) {
/* 294:    */         try
/* 295:    */         {
/* 296:284 */           localArrayList.add(cuj.a(paramInt, this.f, arrayOfInt));
/* 297:    */         }
/* 298:    */         catch (Throwable localThrowable)
/* 299:    */         {
/* 300:286 */           b localb = net.minecraft.src.b.a(localThrowable, "Generating mipmaps for frame");
/* 301:287 */           j localj = localb.a("Frame being iterated");
/* 302:    */           
/* 303:289 */           localj.a("Frame index", Integer.valueOf(i1));
/* 304:290 */           localj.a("Frame sizes", new cuf(this, arrayOfInt));
/* 305:    */           
/* 306:    */ 
/* 307:    */ 
/* 308:    */ 
/* 309:    */ 
/* 310:    */ 
/* 311:    */ 
/* 312:    */ 
/* 313:    */ 
/* 314:    */ 
/* 315:    */ 
/* 316:    */ 
/* 317:    */ 
/* 318:    */ 
/* 319:    */ 
/* 320:306 */           throw new u(localb);
/* 321:    */         }
/* 322:    */       }
/* 323:    */     }
/* 324:310 */     a(localArrayList);
/* 325:    */   }
/* 326:    */   
/* 327:    */   private void e(int paramInt)
/* 328:    */   {
/* 329:343 */     if (this.a.size() > paramInt) {
/* 330:344 */       return;
/* 331:    */     }
/* 332:347 */     for (int i1 = this.a.size(); i1 <= paramInt; i1++) {
/* 333:348 */       this.a.add(null);
/* 334:    */     }
/* 335:    */   }
/* 336:    */   
/* 337:    */   private static int[][] a(int[][] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
/* 338:    */   {
/* 339:353 */     int[][] arrayOfInt = new int[paramArrayOfInt.length][];
/* 340:355 */     for (int i1 = 0; i1 < paramArrayOfInt.length; i1++)
/* 341:    */     {
/* 342:356 */       int[] arrayOfInt1 = paramArrayOfInt[i1];
/* 343:359 */       if (arrayOfInt1 != null)
/* 344:    */       {
/* 345:363 */         arrayOfInt[i1] = new int[(paramInt1 >> i1) * (paramInt2 >> i1)];
/* 346:364 */         System.arraycopy(arrayOfInt1, paramInt3 * arrayOfInt[i1].length, arrayOfInt[i1], 0, arrayOfInt[i1].length);
/* 347:    */       }
/* 348:    */     }
/* 349:367 */     return arrayOfInt;
/* 350:    */   }
/* 351:    */   
/* 352:    */   public void l()
/* 353:    */   {
/* 354:371 */     this.a.clear();
/* 355:    */   }
/* 356:    */   
/* 357:    */   public boolean m()
/* 358:    */   {
/* 359:375 */     return this.k != null;
/* 360:    */   }
/* 361:    */   
/* 362:    */   public void a(List paramList)
/* 363:    */   {
/* 364:379 */     this.a = paramList;
/* 365:    */   }
/* 366:    */   
/* 367:    */   private void o()
/* 368:    */   {
/* 369:383 */     this.k = null;
/* 370:384 */     a(Lists.newArrayList());
/* 371:385 */     this.h = 0;
/* 372:386 */     this.i = 0;
/* 373:    */   }
/* 374:    */   
/* 375:    */   public String toString()
/* 376:    */   {
/* 377:391 */     return "TextureAtlasSprite{name='" + this.j + '\'' + ", frameCount=" + this.a.size() + ", rotated=" + this.c + ", x=" + this.d + ", y=" + this.e + ", height=" + this.g + ", width=" + this.f + ", u0=" + this.l + ", u1=" + this.m + ", v0=" + this.n + ", v1=" + this.o + '}';
/* 378:    */   }
/* 379:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cue
 * JD-Core Version:    0.7.0.1
 */
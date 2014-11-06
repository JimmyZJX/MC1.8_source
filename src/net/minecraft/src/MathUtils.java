package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ import java.util.UUID;
/*   3:    */ 
/*   4:    */ public class MathUtils
/*   5:    */ {
/*   6: 29 */   public static final float a = sqrt(2.0F);
/*   7: 35 */   private static final float[] b = new float[65536];
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11: 36 */     for (int i = 0; i < 65536; i++) {
/*  12: 37 */       b[i] = ((float)Math.sin(i * 3.141592653589793D * 2.0D / 65536.0D));
/*  13:    */     }
/*  14:    */   }
/*  15:    */   
/*  16:    */   public static float sin(float paramFloat)
/*  17:    */   {
/*  18: 42 */     return b[((int)(paramFloat * 10430.378F) & 0xFFFF)];
/*  19:    */   }
/*  20:    */   
/*  21:    */   public static float cos(float paramFloat)
/*  22:    */   {
/*  23: 46 */     return b[((int)(paramFloat * 10430.378F + 16384.0F) & 0xFFFF)];
/*  24:    */   }
/*  25:    */   
/*  26:    */   public static float sqrt(float paramFloat)
/*  27:    */   {
/*  28: 50 */     return (float)Math.sqrt(paramFloat);
/*  29:    */   }
/*  30:    */   
/*  31:    */   public static float a(double paramDouble)
/*  32:    */   {
/*  33: 54 */     return (float)Math.sqrt(paramDouble);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public static int floor(float paramFloat)
/*  37:    */   {
/*  38: 58 */     int i = (int)paramFloat;
/*  39: 59 */     return paramFloat < i ? i - 1 : i;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public static int fastFloor(double paramDouble)
/*  43:    */   {
/*  44: 63 */     return (int)(paramDouble + 1024.0D) - 1024;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public static int floor(double paramDouble)
/*  48:    */   {
/*  49: 67 */     int i = (int)paramDouble;
/*  50: 68 */     return paramDouble < i ? i - 1 : i;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public static long lfloor(double paramDouble)
/*  54:    */   {
/*  55: 72 */     long l = (long)paramDouble;
/*  56: 73 */     return paramDouble < l ? l - 1L : l;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public static int absFloor(double paramDouble)
/*  60:    */   {
/*  61: 77 */     return (int)(paramDouble >= 0.0D ? paramDouble : -paramDouble + 1.0D);
/*  62:    */   }
/*  63:    */   
/*  64:    */   public static float abs(float paramFloat)
/*  65:    */   {
/*  66: 81 */     return paramFloat >= 0.0F ? paramFloat : -paramFloat;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public static int abs(int paramInt)
/*  70:    */   {
/*  71: 85 */     return paramInt >= 0 ? paramInt : -paramInt;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public static int ceil(float paramFloat)
/*  75:    */   {
/*  76: 89 */     int i = (int)paramFloat;
/*  77: 90 */     return paramFloat > i ? i + 1 : i;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public static int ceil(double paramDouble)
/*  81:    */   {
/*  82: 94 */     int i = (int)paramDouble;
/*  83: 95 */     return paramDouble > i ? i + 1 : i;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public static int clamp(int value, int min, int max)
/*  87:    */   {
/*  88:109 */     if (value < min) {
/*  89:110 */       return min;
/*  90:    */     }
/*  91:112 */     if (value > max) {
/*  92:113 */       return max;
/*  93:    */     }
/*  94:115 */     return value;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public static float clamp(float value, float min, float max)
/*  98:    */   {
/*  99:119 */     if (value < min) {
/* 100:120 */       return min;
/* 101:    */     }
/* 102:122 */     if (value > max) {
/* 103:123 */       return max;
/* 104:    */     }
/* 105:125 */     return value;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public static double clamp(double value, double min, double max)
/* 109:    */   {
/* 110:129 */     if (value < min) {
/* 111:130 */       return min;
/* 112:    */     }
/* 113:132 */     if (value > max) {
/* 114:133 */       return max;
/* 115:    */     }
/* 116:135 */     return value;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public static double clampedLerp(double paramDouble1, double paramDouble2, double paramDouble3)
/* 120:    */   {
/* 121:139 */     if (paramDouble3 < 0.0D) {
/* 122:140 */       return paramDouble1;
/* 123:    */     }
/* 124:142 */     if (paramDouble3 > 1.0D) {
/* 125:143 */       return paramDouble2;
/* 126:    */     }
/* 127:145 */     return paramDouble1 + (paramDouble2 - paramDouble1) * paramDouble3;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public static double absMax(double paramDouble1, double paramDouble2)
/* 131:    */   {
/* 132:149 */     if (paramDouble1 < 0.0D) {
/* 133:150 */       paramDouble1 = -paramDouble1;
/* 134:    */     }
/* 135:152 */     if (paramDouble2 < 0.0D) {
/* 136:153 */       paramDouble2 = -paramDouble2;
/* 137:    */     }
/* 138:155 */     return paramDouble1 > paramDouble2 ? paramDouble1 : paramDouble2;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public static int intFloorDiv(int paramInt1, int paramInt2)
/* 142:    */   {
/* 143:159 */     if (paramInt1 < 0) {
/* 144:160 */       return -((-paramInt1 - 1) / paramInt2) - 1;
/* 145:    */     }
/* 146:162 */     return paramInt1 / paramInt2;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public static int nextInt(Random paramRandom, int paramInt1, int paramInt2)
/* 150:    */   {
/* 151:166 */     if (paramInt1 >= paramInt2) {
/* 152:167 */       return paramInt1;
/* 153:    */     }
/* 154:169 */     return paramRandom.nextInt(paramInt2 - paramInt1 + 1) + paramInt1;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public static float nextFloat(Random paramRandom, float paramFloat1, float paramFloat2)
/* 158:    */   {
/* 159:173 */     if (paramFloat1 >= paramFloat2) {
/* 160:174 */       return paramFloat1;
/* 161:    */     }
/* 162:176 */     return paramRandom.nextFloat() * (paramFloat2 - paramFloat1) + paramFloat1;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public static double nextDouble(Random paramRandom, double paramDouble1, double paramDouble2)
/* 166:    */   {
/* 167:180 */     if (paramDouble1 >= paramDouble2) {
/* 168:181 */       return paramDouble1;
/* 169:    */     }
/* 170:183 */     return paramRandom.nextDouble() * (paramDouble2 - paramDouble1) + paramDouble1;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public static double average(long[] paramArrayOfLong)
/* 174:    */   {
/* 175:187 */     long l1 = 0L;
/* 176:189 */     for (long l2 : paramArrayOfLong) {
/* 177:190 */       l1 += l2;
/* 178:    */     }
/* 179:193 */     return l1 / paramArrayOfLong.length;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public static boolean a(float paramFloat1, float paramFloat2)
/* 183:    */   {
/* 184:197 */     return abs(paramFloat2 - paramFloat1) < 1.0E-005F;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public static int b(int paramInt1, int paramInt2)
/* 188:    */   {
/* 189:201 */     return (paramInt1 % paramInt2 + paramInt2) % paramInt2;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public static float wrapDegrees(float paramFloat)
/* 193:    */   {
/* 194:205 */     paramFloat %= 360.0F;
/* 195:206 */     if (paramFloat >= 180.0F) {
/* 196:207 */       paramFloat -= 360.0F;
/* 197:    */     }
/* 198:209 */     if (paramFloat < -180.0F) {
/* 199:210 */       paramFloat += 360.0F;
/* 200:    */     }
/* 201:212 */     return paramFloat;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public static double wrapDegrees(double paramDouble)
/* 205:    */   {
/* 206:216 */     paramDouble %= 360.0D;
/* 207:217 */     if (paramDouble >= 180.0D) {
/* 208:218 */       paramDouble -= 360.0D;
/* 209:    */     }
/* 210:220 */     if (paramDouble < -180.0D) {
/* 211:221 */       paramDouble += 360.0D;
/* 212:    */     }
/* 213:223 */     return paramDouble;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public static int getInt(String paramString, int paramInt)
/* 217:    */   {
/* 218:    */     try
/* 219:    */     {
/* 220:228 */       return Integer.parseInt(paramString);
/* 221:    */     }
/* 222:    */     catch (Throwable localThrowable) {}
/* 223:230 */     return paramInt;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public static int getInt(String paramString, int paramInt1, int paramInt2)
/* 227:    */   {
/* 228:235 */     return Math.max(paramInt2, getInt(paramString, paramInt1));
/* 229:    */   }
/* 230:    */   
/* 231:    */   public static double getDouble(String paramString, double paramDouble)
/* 232:    */   {
/* 233:    */     try
/* 234:    */     {
/* 235:240 */       return Double.parseDouble(paramString);
/* 236:    */     }
/* 237:    */     catch (Throwable localThrowable) {}
/* 238:242 */     return paramDouble;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public static double getDouble(String paramString, double paramDouble1, double paramDouble2)
/* 242:    */   {
/* 243:247 */     return Math.max(paramDouble2, getDouble(paramString, paramDouble1));
/* 244:    */   }
/* 245:    */   
/* 246:    */   public static int smallestEncompassingPowerOfTwo(int paramInt)
/* 247:    */   {
/* 248:252 */     int i = paramInt - 1;
/* 249:253 */     i |= i >> 1;
/* 250:254 */     i |= i >> 2;
/* 251:255 */     i |= i >> 4;
/* 252:256 */     i |= i >> 8;
/* 253:257 */     i |= i >> 16;
/* 254:258 */     return i + 1;
/* 255:    */   }
/* 256:    */   
/* 257:    */   private static boolean isPowerOfTwo(int x)
/* 258:    */   {
/* 259:263 */     return (x != 0) && ((x & x - 1) == 0);
/* 260:    */   }
/* 261:    */   
/* 262:267 */   private static final int[] c = { 0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9 };
/* 263:    */   
/* 264:    */   private static int e(int x)
/* 265:    */   {
/* 266:272 */     x = isPowerOfTwo(x) ? x : smallestEncompassingPowerOfTwo(x);
/* 267:273 */     return c[((int)(x * 125613361L >> 27) & 0x1F)];
/* 268:    */   }
/* 269:    */   
/* 270:    */   public static int log2(int paramInt)
/* 271:    */   {
/* 272:277 */     return e(paramInt) - (isPowerOfTwo(paramInt) ? 0 : 1);
/* 273:    */   }
/* 274:    */   
/* 275:    */   public static int roundUp(int paramInt1, int paramInt2)
/* 276:    */   {
/* 277:281 */     if (paramInt2 == 0) {
/* 278:282 */       return 0;
/* 279:    */     }
/* 280:284 */     if (paramInt1 == 0) {
/* 281:285 */       return paramInt2;
/* 282:    */     }
/* 283:288 */     if (paramInt1 < 0) {
/* 284:289 */       paramInt2 *= -1;
/* 285:    */     }
/* 286:292 */     int i = paramInt1 % paramInt2;
/* 287:293 */     if (i == 0) {
/* 288:294 */       return paramInt1;
/* 289:    */     }
/* 290:296 */     return paramInt1 + paramInt2 - i;
/* 291:    */   }
/* 292:    */   
/* 293:    */   public static int b(float paramFloat1, float paramFloat2, float paramFloat3)
/* 294:    */   {
/* 295:300 */     return b(floor(paramFloat1 * 255.0F), floor(paramFloat2 * 255.0F), floor(paramFloat3 * 255.0F));
/* 296:    */   }
/* 297:    */   
/* 298:    */   public static int b(int paramInt1, int paramInt2, int paramInt3)
/* 299:    */   {
/* 300:304 */     int i = paramInt1;
/* 301:305 */     i = (i << 8) + paramInt2;
/* 302:306 */     i = (i << 8) + paramInt3;
/* 303:307 */     return i;
/* 304:    */   }
/* 305:    */   
/* 306:    */   public static int d(int paramInt1, int paramInt2)
/* 307:    */   {
/* 308:311 */     int i = (paramInt1 & 0xFF0000) >> 16;
/* 309:312 */     int j = (paramInt2 & 0xFF0000) >> 16;
/* 310:313 */     int k = (paramInt1 & 0xFF00) >> 8;
/* 311:314 */     int m = (paramInt2 & 0xFF00) >> 8;
/* 312:315 */     int n = (paramInt1 & 0xFF) >> 0;
/* 313:316 */     int i1 = (paramInt2 & 0xFF) >> 0;
/* 314:    */     
/* 315:318 */     int i2 = (int)(i * j / 255.0F);
/* 316:319 */     int i3 = (int)(k * m / 255.0F);
/* 317:320 */     int i4 = (int)(n * i1 / 255.0F);
/* 318:    */     
/* 319:322 */     return paramInt1 & 0xFF000000 | i2 << 16 | i3 << 8 | i4;
/* 320:    */   }
/* 321:    */   
/* 322:    */   public static long a(fd paramfd)
/* 323:    */   {
/* 324:355 */     return c(paramfd.getX(), paramfd.getY(), paramfd.getZ());
/* 325:    */   }
/* 326:    */   
/* 327:    */   public static long c(int paramInt1, int paramInt2, int paramInt3)
/* 328:    */   {
/* 329:359 */     long l = paramInt1 * 3129871 ^ paramInt3 * 116129781L ^ paramInt2;
/* 330:360 */     l = l * l * 42317861L + l * 11L;
/* 331:361 */     return l;
/* 332:    */   }
/* 333:    */   
/* 334:    */   public static UUID a(Random paramRandom)
/* 335:    */   {
/* 336:365 */     long l1 = paramRandom.nextLong() & 0xFFFF0FFF | 0x4000;
/* 337:366 */     long l2 = paramRandom.nextLong() & 0xFFFFFFFF | 0x0;
/* 338:367 */     return new UUID(l1, l2);
/* 339:    */   }
/* 340:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     uv
 * JD-Core Version:    0.7.0.1
 */
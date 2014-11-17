package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.Collection;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class PotionHelper
/*   9:    */ {
/*  10: 54 */   private static final Map<Integer,String> potionTimeExp = Maps.newHashMap();
/*  11: 55 */   private static final Map<Integer,String> potionLevelExp = Maps.newHashMap();
/*  12:    */   
/*  13:    */   static
/*  14:    */   {
/*  15: 59 */     a = null;
/*  16:    */     
/*  17:    */ 
/*  18:    */ 
/*  19:    */ 
/*  20:    */ 
/*  21:    */ 
/*  22:    */ 
/*  23:    */ 
/*  24:    */ 
/*  25:    */ 
/*  26:    */ 
/*  27:    */ 
/*  28:    */ 
/*  29:    */ 
/*  30:    */ 
/*  31:    */ 
/*  32:    */ 
/*  33:    */ 
/*  34:    */ 
/*  35:    */ 
/*  36:    */ 
/*  37: 81 */     ghastTearEffect = "+0-1-2-3&4-4+13";
/*  38: 82 */     potionTimeExp.put(Integer.valueOf(Potion.regeneration.getID()), "0 & !1 & !2 & !3 & 0+6");
/*  39:    */     
/*  40: 84 */     sugarEffect = "-0+1-2-3&4-4+13";
/*  41: 85 */     potionTimeExp.put(Integer.valueOf(Potion.speed.getID()), "!0 & 1 & !2 & !3 & 1+6");
/*  42:    */     
/*  43: 87 */     magmaCreamEffect = "+0+1-2-3&4-4+13";
/*  44: 88 */     potionTimeExp.put(Integer.valueOf(Potion.fireResistance.getID()), "0 & 1 & !2 & !3 & 0+6");
/*  45:    */     
/*  46: 90 */     speckledMelonEffect = "+0-1+2-3&4-4+13";
/*  47: 91 */     potionTimeExp.put(Integer.valueOf(Potion.instantHealth.getID()), "0 & !1 & 2 & !3");
/*  48:    */     
/*  49: 93 */     spiderEyeEffect = "-0-1+2-3&4-4+13";
/*  50: 94 */     potionTimeExp.put(Integer.valueOf(Potion.poison.getID()), "!0 & !1 & 2 & !3 & 2+6");
/*  51:    */     
/*  52: 96 */     fermentedSpiderEyeEffect = "-0+3-4+13";
/*  53: 97 */     potionTimeExp.put(Integer.valueOf(Potion.weakness.getID()), "!0 & !1 & !2 & 3 & 3+6");
/*  54: 98 */     potionTimeExp.put(Integer.valueOf(Potion.instantDamage.getID()), "!0 & !1 & 2 & 3");
/*  55: 99 */     potionTimeExp.put(Integer.valueOf(Potion.slowness.getID()), "!0 & 1 & !2 & 3 & 3+6");
/*  56:    */     
/*  57:101 */     blazePowderEffect = "+0-1-2+3&4-4+13";
/*  58:102 */     potionTimeExp.put(Integer.valueOf(Potion.strength.getID()), "0 & !1 & !2 & 3 & 3+6");
/*  59:    */     
/*  60:104 */     goldenCarrotEffect = "-0+1+2-3+13&4-4";
/*  61:105 */     potionTimeExp.put(Integer.valueOf(Potion.nightVision.getID()), "!0 & 1 & 2 & !3 & 2+6");
/*  62:    */     
/*  63:    */ 
/*  64:108 */     potionTimeExp.put(Integer.valueOf(Potion.invisibility.getID()), "!0 & 1 & 2 & 3 & 2+6");
/*  65:    */     
/*  66:110 */     pufferfishEffect = "+0-1+2+3+13&4-4";
/*  67:111 */     potionTimeExp.put(Integer.valueOf(Potion.waterBreathing.getID()), "0 & !1 & 2 & 3 & 2+6");
/*  68:    */     
/*  69:113 */     rabbitFootEffect = "+0+1-2+3&4-4+13";
/*  70:114 */     potionTimeExp.put(Integer.valueOf(Potion.jumpBoost.getID()), "0 & 1 & !2 & 3");
/*  71:    */     
/*  72:    */ 
/*  73:117 */     glowstoneEffect = "+5-6-7";
/*  74:118 */     potionLevelExp.put(Integer.valueOf(Potion.speed.getID()), "5");
/*  75:119 */     potionLevelExp.put(Integer.valueOf(Potion.haste.getID()), "5");
/*  76:120 */     potionLevelExp.put(Integer.valueOf(Potion.strength.getID()), "5");
/*  77:121 */     potionLevelExp.put(Integer.valueOf(Potion.regeneration.getID()), "5");
/*  78:122 */     potionLevelExp.put(Integer.valueOf(Potion.instantDamage.getID()), "5");
/*  79:123 */     potionLevelExp.put(Integer.valueOf(Potion.instantHealth.getID()), "5");
/*  80:124 */     potionLevelExp.put(Integer.valueOf(Potion.resistance.getID()), "5");
/*  81:125 */     potionLevelExp.put(Integer.valueOf(Potion.poison.getID()), "5");
/*  82:126 */     potionLevelExp.put(Integer.valueOf(Potion.jumpBoost.getID()), "5");
/*  83:    */   }
/*  84:    */   
/*  85:129 */   public static final String redStoneEffect = "-5+6-7";
/*  86:133 */   public static final String gunPowderEffect = "+14&13-13";
/*  87:    */   
/*  88:    */   public static boolean checkFlag(int paramInt1, int paramInt2)
/*  89:    */   {
/*  90:185 */     return (paramInt1 & 1 << paramInt2) != 0;
/*  91:    */   }
/*  92:    */   
/*  93:    */   private static int isFlagSet(int paramInt1, int paramInt2)
/*  94:    */   {
/*  95:189 */     return checkFlag(paramInt1, paramInt2) ? 1 : 0;
/*  96:    */   }
/*  97:    */   
/*  98:    */   private static int isFlagUnset(int paramInt1, int paramInt2)
/*  99:    */   {
/* 100:193 */     return checkFlag(paramInt1, paramInt2) ? 0 : 1;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public static int checkFlags(int paramInt)
/* 104:    */   {
/* 105:197 */     return checkFlags(paramInt, 5, 4, 3, 2, 1);
/* 106:    */   }
/* 107:    */   
/* 108:    */   public static int calcPotionColor(Collection<PotionEffect> paramCollection)
/* 109:    */   {
/* 110:201 */     int i1 = 3694022;
/* 111:203 */     if ((paramCollection == null) || (paramCollection.isEmpty())) {
/* 112:204 */       return i1;
/* 113:    */     }
/* 114:207 */     float f1 = 0.0F;
/* 115:208 */     float f2 = 0.0F;
/* 116:209 */     float f3 = 0.0F;
/* 117:210 */     float f4 = 0.0F;
/* 118:212 */     for (PotionEffect localwq : paramCollection) {
/* 119:213 */       if (localwq.getShowParticles())
/* 120:    */       {
/* 121:216 */         int i2 = Potion.potionList[localwq.getID()].k();
/* 122:218 */         for (int i3 = 0; i3 <= localwq.getAmplifier(); i3++)
/* 123:    */         {
/* 124:219 */           f1 += (i2 >> 16 & 0xFF) / 255.0F;
/* 125:220 */           f2 += (i2 >> 8 & 0xFF) / 255.0F;
/* 126:221 */           f3 += (i2 >> 0 & 0xFF) / 255.0F;
/* 127:222 */           f4 += 1.0F;
/* 128:    */         }
/* 129:    */       }
/* 130:    */     }
/* 131:226 */     if (f4 == 0.0F) {
/* 132:227 */       return 0;
/* 133:    */     }
/* 134:230 */     f1 = f1 / f4 * 255.0F;
/* 135:231 */     f2 = f2 / f4 * 255.0F;
/* 136:232 */     f3 = f3 / f4 * 255.0F;
/* 137:    */     
/* 138:234 */     return (int)f1 << 16 | (int)f2 << 8 | (int)f3;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public static boolean isAmbient(Collection<PotionEffect> paramCollection)
/* 142:    */   {
/* 143:238 */     for (PotionEffect localwq : paramCollection) {
/* 144:239 */       if (!localwq.getAmbient()) {
/* 145:240 */         return false;
/* 146:    */       }
/* 147:    */     }
/* 148:244 */     return true;
/* 149:    */   }
/* 150:    */   
/* 151:247 */   private static final Map<Integer,Integer> q = Maps.newHashMap();
/* 152:    */   
/* 153:    */   public static int a(int paramInt, boolean paramBoolean)
/* 154:    */   {
/* 155:250 */     if (!paramBoolean)
/* 156:    */     {
/* 157:251 */       if (q.containsKey(Integer.valueOf(paramInt))) {
/* 158:252 */         return ((Integer)q.get(Integer.valueOf(paramInt))).intValue();
/* 159:    */       }
/* 160:254 */       int i1 = calcPotionColor(getPotionEffects(paramInt, false));
/* 161:255 */       q.put(Integer.valueOf(paramInt), Integer.valueOf(i1));
/* 162:256 */       return i1;
/* 163:    */     }
/* 164:259 */     return calcPotionColor(getPotionEffects(paramInt, true));
/* 165:    */   }
/* 166:    */   
/* 167:267 */   private static final String[] potionPrefixes = { "potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", "potion.prefix.gross", "potion.prefix.stinky" };
/* 168:    */   public static final String a;
/* 169:    */   public static final String sugarEffect;
/* 170:    */   public static final String ghastTearEffect;
/* 171:    */   public static final String spiderEyeEffect;
/* 172:    */   public static final String fermentedSpiderEyeEffect;
/* 173:    */   public static final String speckledMelonEffect;
/* 174:    */   public static final String blazePowderEffect;
/* 175:    */   public static final String magmaCreamEffect;
/* 176:    */   public static final String glowstoneEffect;
/* 177:    */   public static final String goldenCarrotEffect;
/* 178:    */   public static final String pufferfishEffect;
/* 179:    */   public static final String rabbitFootEffect;
/* 180:    */   
/* 181:    */   public static String c(int paramInt)
/* 182:    */   {
/* 183:304 */     int i1 = checkFlags(paramInt);
/* 184:305 */     return potionPrefixes[i1];
/* 185:    */   }
/* 186:    */   
/* 187:    */   private static int testFlag(boolean testForUnset, boolean hasMultiplier, boolean negative, int testCount, int bit, int multiplier, int num)
/* 188:    */   {
/* 189:314 */     int res = 0;
/* 190:315 */     if (testForUnset) {
/* 191:316 */       res = isFlagUnset(num, bit);
/* 192:317 */     } else if (testCount != -1)
/* 193:    */     {
/* 194:318 */       if ((testCount == 0) && (countSetFlags(num) == bit)) {
/* 195:319 */         res = 1;
/* 196:320 */       } else if ((testCount == 1) && (countSetFlags(num) > bit)) {
/* 197:321 */         res = 1;
/* 198:322 */       } else if ((testCount == 2) && (countSetFlags(num) < bit)) {
/* 199:323 */         res = 1;
/* 200:    */       }
/* 201:    */     }
/* 202:    */     else {
/* 203:326 */       res = isFlagSet(num, bit);
/* 204:    */     }
/* 205:328 */     if (hasMultiplier) {
/* 206:329 */       res *= multiplier;
/* 207:    */     }
/* 208:331 */     if (negative) {
/* 209:332 */       res *= -1;
/* 210:    */     }
/* 211:334 */     return res;
/* 212:    */   }
/* 213:    */   
/* 214:    */   private static int countSetFlags(int paramInt)
/* 215:    */   {
				  int i1;
/* 216:338 */     for (i1 = 0; paramInt > 0; i1++) {
/* 217:340 */       paramInt &= paramInt - 1;
/* 218:    */     }
/* 219:342 */     return i1;
/* 220:    */   }
/* 221:    */   
/* 222:    */   private static int parsePotionExpression(String expression, int start, int end, int num)
/* 223:    */   {
/* 224:346 */     if ((start >= expression.length()) || (end < 0) || (start >= end)) {
/* 225:347 */       return 0;
/* 226:    */     }
/* 227:351 */     int i1 = expression.indexOf('|', start);
/* 228:352 */     if ((i1 >= 0) && (i1 < end))
/* 229:    */     {
/* 230:353 */       int i2 = parsePotionExpression(expression, start, i1 - 1, num);
/* 231:354 */       if (i2 > 0) {
/* 232:355 */         return i2;
/* 233:    */       }
/* 234:358 */       int i3 = parsePotionExpression(expression, i1 + 1, end, num);
/* 235:359 */       if (i3 > 0) {
/* 236:360 */         return i3;
/* 237:    */       }
/* 238:362 */       return 0;
/* 239:    */     }
/* 240:365 */     int i2 = expression.indexOf('&', start);
/* 241:366 */     if ((i2 >= 0) && (i2 < end))
/* 242:    */     {
/* 243:367 */       int i3 = parsePotionExpression(expression, start, i2 - 1, num);
/* 244:368 */       if (i3 <= 0) {
/* 245:369 */         return 0;
/* 246:    */       }
/* 247:372 */       int i4 = parsePotionExpression(expression, i2 + 1, end, num);
/* 248:373 */       if (i4 <= 0) {
/* 249:374 */         return 0;
/* 250:    */       }
/* 251:377 */       if (i3 > i4) {
/* 252:378 */         return i3;
/* 253:    */       }
/* 254:380 */       return i4;
/* 255:    */     }
/* 256:383 */     boolean multiplierComing = false;
/* 257:384 */     boolean hasMultiplier = false;
/* 258:385 */     boolean bitRead = false;
/* 259:386 */     boolean testForUnset = false;
/* 260:387 */     boolean negative = false;
/* 261:388 */     int testCount = -1;
/* 262:389 */     int bit = 0;
/* 263:390 */     int multiplier = 0;
/* 264:391 */     int res = 0;
/* 265:    */     //boolean bool1 = false;
/* 266:392 */     for (int i = start; i < end; i++)
/* 267:    */     {
/* 268:393 */       char c = expression.charAt(i);
/* 269:394 */       if ((c >= '0') && (c <= '9'))
/* 270:    */       {
/* 271:395 */         if (multiplierComing)
/* 272:    */         {
/* 273:396 */           multiplier = c - '0';
/* 274:397 */           hasMultiplier = true;
/* 275:    */         }
/* 276:    */         else
/* 277:    */         {
/* 278:399 */           bit *= 10;
/* 279:400 */           bit += c - '0';
/* 280:401 */           bitRead = true;
/* 281:    */         }
/* 282:    */       }
/* 283:403 */       else if (c == '*')
/* 284:    */       {
/* 285:404 */         multiplierComing = true;
/* 286:    */       }
/* 287:405 */       else if (c == '!')
/* 288:    */       {
/* 289:406 */         if (bitRead)
/* 290:    */         {
/* 291:407 */           res += testFlag(testForUnset, hasMultiplier, negative, testCount, bit, multiplier, num);
/* 292:408 */           //i5 = bool1 = i3 = bool3 = bool2 = 0;
						bitRead = hasMultiplier = multiplierComing = negative = testForUnset = false;
/* 293:409 */           bit = multiplier = 0;
/* 294:410 */           testCount = -1;
/* 295:    */         }
/* 296:413 */         testForUnset = true;
/* 297:    */       }
/* 298:414 */       else if (c == '-')
/* 299:    */       {
/* 300:415 */         if (bitRead)
/* 301:    */         {
/* 302:416 */           res += testFlag(testForUnset, hasMultiplier, negative, testCount, bit, multiplier, num);
/* 303:417 */           //i5 = bool1 = i3 = bool3 = bool2 = 0;
						bitRead = hasMultiplier = multiplierComing = negative = testForUnset = false;
/* 304:418 */           bit = multiplier = 0;
/* 305:419 */           testCount = -1;
/* 306:    */         }
/* 307:422 */         negative = true;
/* 308:    */       }
/* 309:423 */       else if ((c == '=') || (c == '<') || (c == '>'))
/* 310:    */       {
/* 311:424 */         if (bitRead)
/* 312:    */         {
/* 313:425 */           res += testFlag(testForUnset, hasMultiplier, negative, testCount, bit, multiplier, num);
/* 314:426 */           //i5 = bool1 = i3 = bool3 = bool2 = 0;
						bitRead = hasMultiplier = multiplierComing = negative = testForUnset = false;
/* 315:427 */           bit = multiplier = 0;
/* 316:428 */           testCount = -1;
/* 317:    */         }
/* 318:431 */         if (c == '=') {
/* 319:432 */           testCount = 0;
/* 320:433 */         } else if (c == '<') {
/* 321:434 */           testCount = 2;
/* 322:435 */         } else if (c == '>') {
/* 323:436 */           testCount = 1;
/* 324:    */         }
/* 325:    */       }
/* 326:438 */       else if ((c == '+') && 
/* 327:439 */         (bitRead))
/* 328:    */       {
/* 329:440 */         res += testFlag(testForUnset, hasMultiplier, negative, testCount, bit, multiplier, num);
/* 330:441 */         //i5 = bool1 = i3 = bool3 = bool2 = 0;
					  bitRead = hasMultiplier = multiplierComing = negative = testForUnset = false;
/* 331:442 */         bit = multiplier = 0;
/* 332:443 */         testCount = -1;
/* 333:    */       }
/* 334:    */     }
/* 335:447 */     if (bitRead) {
/* 336:448 */       res += testFlag(testForUnset, hasMultiplier, negative, testCount, bit, multiplier, num);
/* 337:    */     }
/* 338:451 */     return res;
/* 339:    */   }
/* 340:    */   
/* 341:    */   public static List<PotionEffect> getPotionEffects(int damageValue, boolean paramBoolean)
/* 342:    */   {
/* 343:455 */     ArrayList<PotionEffect> res = null;
/* 344:457 */     for (Potion potion : Potion.potionList) {
/* 345:458 */       if ((potion != null) && ((!potion.j()) || (paramBoolean)))
/* 346:    */       {
/* 347:461 */         String timeExp = potionTimeExp.get(Integer.valueOf(potion.getID()));
/* 348:462 */         if (timeExp != null)
/* 349:    */         {
/* 350:466 */           int time = parsePotionExpression(timeExp, 0, timeExp.length(), damageValue);
/* 351:467 */           if (time > 0)
/* 352:    */           {
/* 353:468 */             int level = 0;
/* 354:469 */             String levelExp = potionLevelExp.get(Integer.valueOf(potion.getID()));
/* 355:470 */             if (levelExp != null)
/* 356:    */             {
/* 357:471 */               level = parsePotionExpression(levelExp, 0, levelExp.length(), damageValue);
/* 358:472 */               if (level < 0) {
/* 359:473 */                 level = 0;
/* 360:    */               }
/* 361:    */             }
/* 362:477 */             if (potion.isInstant())
/* 363:    */             {
/* 364:478 */               time = 1;
/* 365:    */             }
/* 366:    */             else
/* 367:    */             {
/* 368:481 */               time = 1200 * (time * 3 + (time - 1) * 2);
/* 369:482 */               time >>= level;
/* 370:483 */               time = (int)Math.round(time * potion.h());
/* 371:485 */               if ((damageValue & 0x4000) != 0) {
/* 372:486 */                 time = (int)Math.round(time * 0.75D + 0.5D);
/* 373:    */               }
/* 374:    */             }
/* 375:490 */             if (res == null) {
/* 376:491 */               res = Lists.newArrayList();
/* 377:    */             }
/* 378:493 */             PotionEffect localwq = new PotionEffect(potion.getID(), time, level);
/* 379:494 */             if ((damageValue & 0x4000) != 0) {
/* 380:495 */               localwq.a(true);
/* 381:    */             }
/* 382:497 */             res.add(localwq);
/* 383:    */           }
/* 384:    */         }
/* 385:    */       }
/* 386:    */     }
/* 387:501 */     return res;
/* 388:    */   }
/* 389:    */   
/* 390:    */   private static int brewBitOperations(int num, int bit, boolean clear, boolean toggle, boolean require)
/* 391:    */   {
/* 392:584 */     if (require)
/* 393:    */     {
/* 394:585 */       if (!checkFlag(num, bit)) {
/* 395:586 */         return 0;
/* 396:    */       }
/* 397:    */     }
/* 398:588 */     else if (clear) {
/* 399:589 */       num &= (1 << bit ^ 0xFFFFFFFF);
/* 400:590 */     } else if (toggle)
/* 401:    */     {
/* 402:591 */       if ((num & 1 << bit) == 0) {
/* 403:592 */         num |= 1 << bit;
/* 404:    */       } else {
/* 405:594 */         num &= (1 << bit ^ 0xFFFFFFFF);
/* 406:    */       }
/* 407:    */     }
/* 408:    */     else {
/* 409:597 */       num |= 1 << bit;
/* 410:    */     }
/* 411:599 */     return num;
/* 412:    */   }
/* 413:    */   
/* 414:    */   public static int parsePotionOperation(int num, String operation)
/* 415:    */   {
/* 416:603 */     int start = 0;
/* 417:604 */     int end = operation.length();
/* 418:    */     
/* 419:606 */     boolean bitRead = false;
/* 420:607 */     boolean toggle = false;
/* 421:608 */     boolean clear = false;
/* 422:609 */     boolean require = false;
/* 423:610 */     int bit = 0;
/* 424:611 */     for (int i = start; i < end; i++)
/* 425:    */     {
/* 426:612 */       char c = operation.charAt(i);
/* 427:613 */       if ((c >= '0') && (c <= '9'))
/* 428:    */       {
/* 429:614 */         bit *= 10;
/* 430:615 */         bit += c - '0';
/* 431:616 */         bitRead = true;
/* 432:    */       }
/* 433:617 */       else if (c == '!')
/* 434:    */       {
/* 435:618 */         if (bitRead)
/* 436:    */         {
/* 437:619 */           num = brewBitOperations(num, bit, clear, toggle, require);
/* 438:620 */           //i3 = bool2 = bool1 = bool3 = 0;
						bitRead = clear = toggle = require = false;
/* 439:621 */           bit = 0;
/* 440:    */         }
/* 441:624 */         toggle = true;
/* 442:    */       }
/* 443:625 */       else if (c == '-')
/* 444:    */       {
/* 445:626 */         if (bitRead)
/* 446:    */         {
/* 447:627 */           num = brewBitOperations(num, bit, clear, toggle, require);
/* 448:628 */           //i3 = bool2 = bool1 = bool3 = 0;
						bitRead = clear = toggle = require = false;
/* 449:629 */           bit = 0;
/* 450:    */         }
/* 451:632 */         clear = true;
/* 452:    */       }
/* 453:633 */       else if (c == '+')
/* 454:    */       {
/* 455:634 */         if (bitRead)
/* 456:    */         {
/* 457:635 */           num = brewBitOperations(num, bit, clear, toggle, require);
/* 458:636 */           //i3 = bool2 = bool1 = bool3 = 0;
						bitRead = clear = toggle = require = false;
/* 459:637 */           bit = 0;
/* 460:    */         }
/* 461:    */       }
/* 462:639 */       else if (c == '&')
/* 463:    */       {
/* 464:640 */         if (bitRead)
/* 465:    */         {
/* 466:641 */           num = brewBitOperations(num, bit, clear, toggle, require);
/* 467:642 */           //i3 = bool2 = bool1 = bool3 = 0;
						bitRead = clear = toggle = require = false;
/* 468:643 */           bit = 0;
/* 469:    */         }
/* 470:645 */         require = true;
/* 471:    */       }
/* 472:    */     }
/* 473:648 */     if (bitRead) {
/* 474:649 */       num = brewBitOperations(num, bit, clear, toggle, require);
/* 475:    */     }
/* 476:652 */     return num & 0x7FFF;
/* 477:    */   }
/* 478:    */   
/* 479:    */   public static int checkFlags(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 480:    */   {
/* 481:667 */     return (checkFlag(paramInt1, paramInt2) ? 16 : 0) | (checkFlag(paramInt1, paramInt3) ? 8 : 0) | (checkFlag(paramInt1, paramInt4) ? 4 : 0) | (checkFlag(paramInt1, paramInt5) ? 2 : 0) | (checkFlag(paramInt1, paramInt6) ? 1 : 0);
/* 482:    */   }
/* 483:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ans
 * JD-Core Version:    0.7.0.1
 */
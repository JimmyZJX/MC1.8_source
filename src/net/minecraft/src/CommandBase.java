package net.minecraft.src;
/*   1:    */ import com.google.common.base.Functions;
/*   2:    */ import com.google.common.collect.Iterables;
/*   3:    */ import com.google.common.collect.Lists;
/*   4:    */ import com.google.common.primitives.Doubles;

/*   5:    */ import java.util.ArrayList;
/*   6:    */ import java.util.Arrays;
/*   7:    */ import java.util.Collection;
/*   8:    */ import java.util.Collections;
/*   9:    */ import java.util.Iterator;
/*  10:    */ import java.util.List;
/*  11:    */ import java.util.UUID;

/*  12:    */ import net.minecraft.server.MinecraftServer;
/*  13:    */ 
/*  14:    */ public abstract class CommandBase
/*  15:    */   implements ICommand
/*  16:    */ {
/*  17:    */   private static IAdminCommand theAdmin;
/*  18:    */   
/*  19:    */   public int a()
/*  20:    */   {
/*  21: 30 */     return 4;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public List b()
/*  25:    */   {
/*  26: 35 */     return Collections.emptyList();
/*  27:    */   }
/*  28:    */   
/*  29:    */   public boolean a(ICommandSender paramae)
/*  30:    */   {
/*  31: 40 */     return paramae.a(a(), c());
/*  32:    */   }
/*  33:    */   
/*  34:    */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/*  35:    */   {
/*  36: 46 */     return null;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static int a(String paramString) throws NumberInvalidException
/*  40:    */   {
/*  41:    */     try
/*  42:    */     {
/*  43: 51 */       return Integer.parseInt(paramString);
/*  44:    */     }
/*  45:    */     catch (NumberFormatException localNumberFormatException)
/*  46:    */     {
/*  47: 53 */       throw new NumberInvalidException("commands.generic.num.invalid", new Object[] { paramString });
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   public static int a(String paramString, int paramInt) throws NumberInvalidException
/*  52:    */   {
/*  53: 58 */     return a(paramString, paramInt, 2147483647);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public static int a(String paramString, int paramInt1, int paramInt2) throws NumberInvalidException
/*  57:    */   {
/*  58: 62 */     int i = a(paramString);
/*  59: 63 */     if (i < paramInt1) {
/*  60: 64 */       throw new NumberInvalidException("commands.generic.num.tooSmall", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) });
/*  61:    */     }
/*  62: 65 */     if (i > paramInt2) {
/*  63: 66 */       throw new NumberInvalidException("commands.generic.num.tooBig", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) });
/*  64:    */     }
/*  65: 68 */     return i;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public static long b(String paramString) throws NumberInvalidException
/*  69:    */   {
/*  70:    */     try
/*  71:    */     {
/*  72: 73 */       return Long.parseLong(paramString);
/*  73:    */     }
/*  74:    */     catch (NumberFormatException localNumberFormatException)
/*  75:    */     {
/*  76: 75 */       throw new NumberInvalidException("commands.generic.num.invalid", new Object[] { paramString });
/*  77:    */     }
/*  78:    */   }
/*  79:    */   
/*  80:    */   public static long a(String paramString, long paramLong1, long paramLong2) throws NumberInvalidException
/*  81:    */   {
/*  82: 84 */     long l = b(paramString);
/*  83: 85 */     if (l < paramLong1) {
/*  84: 86 */       throw new NumberInvalidException("commands.generic.num.tooSmall", new Object[] { Long.valueOf(l), Long.valueOf(paramLong1) });
/*  85:    */     }
/*  86: 87 */     if (l > paramLong2) {
/*  87: 88 */       throw new NumberInvalidException("commands.generic.num.tooBig", new Object[] { Long.valueOf(l), Long.valueOf(paramLong2) });
/*  88:    */     }
/*  89: 90 */     return l;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public static BlockPosition a(ICommandSender paramae, String[] paramArrayOfString, int paramInt, boolean paramBoolean) throws NumberInvalidException
/*  93:    */   {
/*  94: 94 */     BlockPosition localdt = paramae.c();
/*  95: 95 */     return new BlockPosition(b(localdt.getX(), paramArrayOfString[paramInt], -30000000, 30000000, paramBoolean), b(localdt.getY(), paramArrayOfString[(paramInt + 1)], 0, 256, false), b(localdt.getZ(), paramArrayOfString[(paramInt + 2)], -30000000, 30000000, paramBoolean));
/*  96:    */   }
/*  97:    */   
/*  98:    */   public static double parseDouble(String paramString) throws NumberInvalidException
/*  99:    */   {
/* 100:    */     try
/* 101:    */     {
/* 102:104 */       double d = Double.parseDouble(paramString);
/* 103:105 */       if (!Doubles.isFinite(d)) {
/* 104:106 */         throw new NumberInvalidException("commands.generic.num.invalid", new Object[] { paramString });
/* 105:    */       }
/* 106:108 */       return d;
/* 107:    */     }
/* 108:    */     catch (NumberFormatException localNumberFormatException)
/* 109:    */     {
/* 110:110 */       throw new NumberInvalidException("commands.generic.num.invalid", new Object[] { paramString });
/* 111:    */     }
/* 112:    */   }
/* 113:    */   
/* 114:    */   public static double a(String paramString, double paramDouble) throws NumberInvalidException
/* 115:    */   {
/* 116:115 */     return a(paramString, paramDouble, 1.7976931348623157E+308D);
/* 117:    */   }
/* 118:    */   
/* 119:    */   public static double a(String paramString, double paramDouble1, double paramDouble2) throws NumberInvalidException
/* 120:    */   {
/* 121:119 */     double d = parseDouble(paramString);
/* 122:120 */     if (d < paramDouble1) {
/* 123:121 */       throw new NumberInvalidException("commands.generic.double.tooSmall", new Object[] { Double.valueOf(d), Double.valueOf(paramDouble1) });
/* 124:    */     }
/* 125:122 */     if (d > paramDouble2) {
/* 126:123 */       throw new NumberInvalidException("commands.generic.double.tooBig", new Object[] { Double.valueOf(d), Double.valueOf(paramDouble2) });
/* 127:    */     }
/* 128:125 */     return d;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public static boolean d(String paramString) throws CommandException
/* 132:    */   {
/* 133:129 */     if ((paramString.equals("true")) || (paramString.equals("1"))) {
/* 134:130 */       return true;
/* 135:    */     }
/* 136:131 */     if ((paramString.equals("false")) || (paramString.equals("0"))) {
/* 137:132 */       return false;
/* 138:    */     }
/* 139:134 */     throw new CommandException("commands.generic.boolean.invalid", new Object[] { paramString });
/* 140:    */   }
/* 141:    */   
/* 142:    */   public static qw b(ICommandSender paramae) throws dm
/* 143:    */   {
/* 144:139 */     if ((paramae instanceof qw)) {
/* 145:140 */       return (qw)paramae;
/* 146:    */     }
/* 147:142 */     throw new dm("You must specify which player you wish to perform this action on.", new Object[0]);
/* 148:    */   }
/* 149:    */   
/* 150:    */   public static qw a(ICommandSender paramae, String paramString) throws dm
/* 151:    */   {
/* 152:147 */     qw localqw = ah.a(paramae, paramString);
/* 153:149 */     if (localqw == null) {
/* 154:    */       try
/* 155:    */       {
/* 156:151 */         localqw = MinecraftServer.M().an().a(UUID.fromString(paramString));
/* 157:    */       }
/* 158:    */       catch (IllegalArgumentException localIllegalArgumentException) {}
/* 159:    */     }
/* 160:155 */     if (localqw == null) {
/* 161:156 */       localqw = MinecraftServer.M().an().a(paramString);
/* 162:    */     }
/* 163:159 */     if (localqw == null) {
/* 164:160 */       throw new dm();
/* 165:    */     }
/* 166:163 */     return localqw;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public static Entity b(ICommandSender paramae, String paramString) throws dj
/* 170:    */   {
/* 171:167 */     return a(paramae, paramString, Entity.class);
/* 172:    */   }
/* 173:    */   
/* 174:    */   public static Entity a(ICommandSender paramae, String paramString, Class<? extends Entity> paramClass) throws dj
/* 175:    */   {
/* 176:172 */     Entity localObject = ah.a(paramae, paramString, paramClass);
/* 177:    */     
/* 178:174 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/* 179:175 */     if (localObject == null) {
/* 180:176 */       localObject = localMinecraftServer.an().a(paramString);
/* 181:    */     }
/* 182:179 */     if (localObject == null) {
/* 183:    */       try
/* 184:    */       {
/* 185:181 */         UUID localUUID = UUID.fromString(paramString);
/* 186:182 */         localObject = localMinecraftServer.a(localUUID);
/* 187:183 */         if (localObject == null) {
/* 188:184 */           localObject = localMinecraftServer.an().a(localUUID);
/* 189:    */         }
/* 190:    */       }
/* 191:    */       catch (IllegalArgumentException localIllegalArgumentException)
/* 192:    */       {
/* 193:187 */         throw new dj("commands.generic.entity.invalidUuid", new Object[0]);
/* 194:    */       }
/* 195:    */     }
/* 196:191 */     if ((localObject == null) || (!paramClass.isAssignableFrom(localObject.getClass()))) {
/* 197:192 */       throw new dj();
/* 198:    */     }
/* 199:195 */     return localObject;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public static List<Entity> c(ICommandSender paramae, String paramString) throws dj
/* 203:    */   {
/* 204:199 */     if (ah.b(paramString)) {
/* 205:200 */       return ah.b(paramae, paramString, Entity.class);
/* 206:    */     }
/* 207:202 */     return Lists.newArrayList(new Entity[] { b(paramae, paramString) });
/* 208:    */   }
/* 209:    */   
/* 210:    */   public static String d(ICommandSender paramae, String paramString) throws dm
/* 211:    */   {
/* 212:    */     try
/* 213:    */     {
/* 214:207 */       return a(paramae, paramString).getName();
/* 215:    */     }
/* 216:    */     catch (dm localdm)
/* 217:    */     {
/* 218:209 */       if (ah.b(paramString)) {
/* 219:210 */         throw localdm;
/* 220:    */       }
/* 221:    */     }
/* 222:214 */     return paramString;
/* 223:    */   }
/* 224:    */   
/* 225:    */   public static String e(ICommandSender paramae, String paramString) throws dj
/* 226:    */   {
/* 227:    */     try
/* 228:    */     {
/* 229:219 */       return a(paramae, paramString).getName();
/* 230:    */     }
/* 231:    */     catch (dm localdm)
/* 232:    */     {
/* 233:    */       try
/* 234:    */       {
/* 235:222 */         return b(paramae, paramString).getUUID().toString();
/* 236:    */       }
/* 237:    */       catch (dj localdj)
/* 238:    */       {
/* 239:224 */         if (ah.b(paramString)) {
/* 240:225 */           throw localdj;
/* 241:    */         }
/* 242:    */       }
/* 243:    */     }
/* 244:230 */     return paramString;
/* 245:    */   }
/* 246:    */   
/* 247:    */   public static ho a(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws dm
/* 248:    */   {
/* 249:234 */     return b(paramae, paramArrayOfString, paramInt, false);
/* 250:    */   }
/* 251:    */   
/* 252:    */   public static ho b(ICommandSender paramae, String[] paramArrayOfString, int paramInt, boolean paramBoolean) throws dm
/* 253:    */   {
/* 254:238 */     hy localhy = new hy("");
/* 255:240 */     for (int i = paramInt; i < paramArrayOfString.length; i++)
/* 256:    */     {
/* 257:241 */       if (i > paramInt) {
/* 258:242 */         localhy.a(" ");
/* 259:    */       }
/* 260:244 */       Object localObject = new hy(paramArrayOfString[i]);
/* 261:246 */       if (paramBoolean)
/* 262:    */       {
/* 263:247 */         ho localho = ah.b(paramae, paramArrayOfString[i]);
/* 264:249 */         if (localho == null)
/* 265:    */         {
/* 266:250 */           if (ah.b(paramArrayOfString[i])) {
/* 267:251 */             throw new dm();
/* 268:    */           }
/* 269:    */         }
/* 270:    */         else {
/* 271:254 */           localObject = localho;
/* 272:    */         }
/* 273:    */       }
/* 274:258 */       localhy.a((ho)localObject);
/* 275:    */     }
/* 276:261 */     return localhy;
/* 277:    */   }
/* 278:    */   
/* 279:    */   public static String a(String[] paramArrayOfString, int paramInt)
/* 280:    */   {
/* 281:265 */     StringBuilder localStringBuilder = new StringBuilder();
/* 282:267 */     for (int i = paramInt; i < paramArrayOfString.length; i++)
/* 283:    */     {
/* 284:268 */       if (i > paramInt) {
/* 285:269 */         localStringBuilder.append(" ");
/* 286:    */       }
/* 287:271 */       String str = paramArrayOfString[i];
/* 288:    */       
/* 289:273 */       localStringBuilder.append(str);
/* 290:    */     }
/* 291:276 */     return localStringBuilder.toString();
/* 292:    */   }
/* 293:    */   
/* 294:    */   public static aa a(double baseNumber, String paramString, boolean paramBoolean) throws NumberInvalidException
/* 295:    */   {
/* 296:280 */     return a(baseNumber, paramString, -30000000, 30000000, paramBoolean);
/* 297:    */   }
/* 298:    */   
/* 299:    */   public static aa a(double baseNumber, String paramString, int min, int max, boolean paramBoolean) throws NumberInvalidException
/* 300:    */   {
/* 301:284 */     boolean relative = paramString.startsWith("~");
/* 302:285 */     if ((relative) && (Double.isNaN(baseNumber))) {
/* 303:286 */       throw new NumberInvalidException("commands.generic.num.invalid", new Object[] { Double.valueOf(baseNumber) });
/* 304:    */     }
/* 305:288 */     double d = 0.0D;
/* 306:290 */     if ((!relative) || (paramString.length() > 1))
/* 307:    */     {
/* 308:291 */       boolean hasFraction = paramString.contains(".");
/* 309:292 */       if (relative) {
/* 310:293 */         paramString = paramString.substring(1);
/* 311:    */       }
/* 312:296 */       d += parseDouble(paramString);
/* 313:298 */       if ((!hasFraction) && (!relative) && (paramBoolean)) {
/* 314:299 */         d += 0.5D;
/* 315:    */       }
/* 316:    */     }
/* 317:303 */     if ((min != 0) || (max != 0))
/* 318:    */     {
/* 319:304 */       if (d < min) {
/* 320:305 */         throw new NumberInvalidException("commands.generic.double.tooSmall", new Object[] { Double.valueOf(d), Integer.valueOf(min) });
/* 321:    */       }
/* 322:306 */       if (d > max) {
/* 323:307 */         throw new NumberInvalidException("commands.generic.double.tooBig", new Object[] { Double.valueOf(d), Integer.valueOf(max) });
/* 324:    */       }
/* 325:    */     }
/* 326:311 */     return new aa(d + (relative ? baseNumber : 0.0D), d, relative);
/* 327:    */   }
/* 328:    */   
/* 329:    */   public static double b(double paramDouble, String paramString, boolean paramBoolean) throws NumberInvalidException
/* 330:    */   {
/* 331:315 */     return b(paramDouble, paramString, -30000000, 30000000, paramBoolean);
/* 332:    */   }
/* 333:    */   
/* 334:    */   public static double b(double paramDouble, String paramString, int paramInt1, int paramInt2, boolean paramBoolean) throws NumberInvalidException
/* 335:    */   {
/* 336:319 */     boolean bool1 = paramString.startsWith("~");
/* 337:320 */     if ((bool1) && (Double.isNaN(paramDouble))) {
/* 338:321 */       throw new NumberInvalidException("commands.generic.num.invalid", new Object[] { Double.valueOf(paramDouble) });
/* 339:    */     }
/* 340:323 */     double d = bool1 ? paramDouble : 0.0D;
/* 341:325 */     if ((!bool1) || (paramString.length() > 1))
/* 342:    */     {
/* 343:326 */       boolean bool2 = paramString.contains(".");
/* 344:327 */       if (bool1) {
/* 345:328 */         paramString = paramString.substring(1);
/* 346:    */       }
/* 347:331 */       d += parseDouble(paramString);
/* 348:333 */       if ((!bool2) && (!bool1) && (paramBoolean)) {
/* 349:334 */         d += 0.5D;
/* 350:    */       }
/* 351:    */     }
/* 352:338 */     if ((paramInt1 != 0) || (paramInt2 != 0))
/* 353:    */     {
/* 354:339 */       if (d < paramInt1) {
/* 355:340 */         throw new NumberInvalidException("commands.generic.double.tooSmall", new Object[] { Double.valueOf(d), Integer.valueOf(paramInt1) });
/* 356:    */       }
/* 357:341 */       if (d > paramInt2) {
/* 358:342 */         throw new NumberInvalidException("commands.generic.double.tooBig", new Object[] { Double.valueOf(d), Integer.valueOf(paramInt2) });
/* 359:    */       }
/* 360:    */     }
/* 361:346 */     return d;
/* 362:    */   }
/* 363:    */   
/* 364:    */   public static Item f(ICommandSender paramae, String paramString) throws NumberInvalidException
/* 365:    */   {
/* 366:374 */     oa localoa = new oa(paramString);
/* 367:375 */     Item localalq = (Item)Item.e.a(localoa);
/* 368:377 */     if (localalq == null) {
/* 369:378 */       throw new NumberInvalidException("commands.give.notFound", new Object[] { localoa });
/* 370:    */     }
/* 371:381 */     return localalq;
/* 372:    */   }
/* 373:    */   
/* 374:    */   public static BlockType g(ICommandSender paramae, String paramString) throws NumberInvalidException
/* 375:    */   {
/* 376:385 */     oa localoa = new oa(paramString);
/* 377:386 */     if (!BlockType.c.d(localoa)) {
/* 378:387 */       throw new NumberInvalidException("commands.give.notFound", new Object[] { localoa });
/* 379:    */     }
/* 380:390 */     BlockType localatr = (BlockType)BlockType.c.a(localoa);
/* 381:391 */     if (localatr == null) {
/* 382:392 */       throw new NumberInvalidException("commands.give.notFound", new Object[] { localoa });
/* 383:    */     }
/* 384:395 */     return localatr;
/* 385:    */   }
/* 386:    */   
/* 387:    */   public static String a(Object[] paramArrayOfObject)
/* 388:    */   {
/* 389:399 */     StringBuilder localStringBuilder = new StringBuilder();
/* 390:401 */     for (int i = 0; i < paramArrayOfObject.length; i++)
/* 391:    */     {
/* 392:402 */       String str = paramArrayOfObject[i].toString();
/* 393:404 */       if (i > 0) {
/* 394:405 */         if (i == paramArrayOfObject.length - 1) {
/* 395:406 */           localStringBuilder.append(" and ");
/* 396:    */         } else {
/* 397:408 */           localStringBuilder.append(", ");
/* 398:    */         }
/* 399:    */       }
/* 400:412 */       localStringBuilder.append(str);
/* 401:    */     }
/* 402:415 */     return localStringBuilder.toString();
/* 403:    */   }
/* 404:    */   
/* 405:    */   public static ho a(List paramList)
/* 406:    */   {
/* 407:419 */     hy localhy = new hy("");
/* 408:421 */     for (int i = 0; i < paramList.size(); i++)
/* 409:    */     {
/* 410:422 */       if (i > 0) {
/* 411:423 */         if (i == paramList.size() - 1) {
/* 412:424 */           localhy.a(" and ");
/* 413:425 */         } else if (i > 0) {
/* 414:426 */           localhy.a(", ");
/* 415:    */         }
/* 416:    */       }
/* 417:430 */       localhy.a((ho)paramList.get(i));
/* 418:    */     }
/* 419:433 */     return localhy;
/* 420:    */   }
/* 421:    */   
/* 422:    */   public static String a(Collection paramCollection)
/* 423:    */   {
/* 424:437 */     return a(paramCollection.toArray(new String[paramCollection.size()]));
/* 425:    */   }
/* 426:    */   
/* 427:    */   public static List<String> a(String[] paramArrayOfString, int paramInt, BlockPosition paramdt)
/* 428:    */   {
/* 429:441 */     if (paramdt == null) {
/* 430:442 */       return null;
/* 431:    */     }
/* 432:    */     String str;
/* 433:446 */     if (paramArrayOfString.length - 1 == paramInt) {
/* 434:447 */       str = Integer.toString(paramdt.getX());
/* 435:448 */     } else if (paramArrayOfString.length - 1 == paramInt + 1) {
/* 436:449 */       str = Integer.toString(paramdt.getY());
/* 437:450 */     } else if (paramArrayOfString.length - 1 == paramInt + 2) {
/* 438:451 */       str = Integer.toString(paramdt.getZ());
/* 439:    */     } else {
/* 440:453 */       return null;
/* 441:    */     }
/* 442:455 */     return Lists.newArrayList(new String[] { str });
/* 443:    */   }
/* 444:    */   
/* 445:    */   public static boolean a(String paramString1, String paramString2)
/* 446:    */   {
/* 447:459 */     return paramString2.regionMatches(true, 0, paramString1, 0, paramString1.length());
/* 448:    */   }
/* 449:    */   
/* 450:    */   public static List<String> a(String[] paramArrayOfString1, String... paramVarArgs)
/* 451:    */   {
/* 452:463 */     return a(paramArrayOfString1, Arrays.asList(paramVarArgs));
/* 453:    */   }
/* 454:    */   
/* 455:    */   public static List<String> a(String[] paramArrayOfString, Collection<?> paramCollection)
/* 456:    */   {
/* 457:467 */     String str = paramArrayOfString[(paramArrayOfString.length - 1)];
/* 458:468 */     ArrayList<String> localArrayList = Lists.newArrayList();
/* 459:    */     
/* 460:    */     Object localObject;
/* 461:470 */     if (!paramCollection.isEmpty())
/* 462:    */     {
/* 463:471 */       for (Iterator<String> localIterator = Iterables.transform(paramCollection, Functions.toStringFunction()).iterator(); localIterator.hasNext();)
/* 464:    */       {
/* 465:471 */         String localObject1 = localIterator.next();
/* 466:472 */         if (a(str, localObject1)) {
/* 467:473 */           localArrayList.add(localObject1);
/* 468:    */         }
/* 469:    */       }
/* 470:477 */       if (localArrayList.isEmpty()) {
/* 471:478 */         for (Iterator<?> localIterator = paramCollection.iterator(); localIterator.hasNext();)
/* 472:    */         {
/* 473:478 */           localObject = localIterator.next();
/* 474:479 */           if (((localObject instanceof oa)) && 
/* 475:480 */             (a(str, ((oa)localObject).a()))) {
/* 476:481 */             localArrayList.add(String.valueOf(localObject));
/* 477:    */           }
/* 478:    */         }
/* 479:    */       }
/* 480:    */     }
/* 481:488 */     return localArrayList;
/* 482:    */   }
/* 483:    */   
/* 484:    */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 485:    */   {
/* 486:493 */     return false;
/* 487:    */   }
/* 488:    */   
/* 489:    */   public static void a(ICommandSender paramae, ICommand paramac, String paramString, Object... paramVarArgs)
/* 490:    */   {
/* 491:497 */     a(paramae, paramac, 0, paramString, paramVarArgs);
/* 492:    */   }
/* 493:    */   
/* 494:    */   public static void a(ICommandSender paramae, ICommand paramac, int paramInt, String paramString, Object... paramVarArgs)
/* 495:    */   {
/* 496:501 */     if (theAdmin != null) {
/* 497:502 */       theAdmin.a(paramae, paramac, paramInt, paramString, paramVarArgs);
/* 498:    */     }
/* 499:    */   }
/* 500:    */   
/* 501:    */   public static void a(IAdminCommand paramy)
/* 502:    */   {
/* 503:507 */     theAdmin = paramy;
/* 504:    */   }
/* 505:    */   
/* 506:    */   public int compareTo(ICommand paramac)
/* 507:    */   {
/* 508:512 */     return c().compareTo(paramac.c());
/* 509:    */   }
/* 510:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     z
 * JD-Core Version:    0.7.0.1
 */
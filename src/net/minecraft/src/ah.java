package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import com.google.common.base.Predicates;
/*   3:    */ import com.google.common.collect.Lists;
/*   4:    */ import com.google.common.collect.Maps;
/*   5:    */ import com.google.common.collect.Sets;
/*   6:    */ import java.util.ArrayList;
/*   7:    */ import java.util.Collections;
/*   8:    */ import java.util.HashMap;
/*   9:    */ import java.util.List;
/*  10:    */ import java.util.Map;
/*  11:    */ import java.util.Set;
/*  12:    */ import java.util.regex.Matcher;
/*  13:    */ import java.util.regex.Pattern;
/*  14:    */ import net.minecraft.server.MinecraftServer;
/*  15:    */ 
/*  16:    */ public class ah
/*  17:    */ {
/*  18: 37 */   private static final Pattern a = Pattern.compile("^@([pare])(?:\\[([\\w=,!-]*)\\])?$");
/*  19: 46 */   private static final Pattern b = Pattern.compile("\\G([-!]?[\\w-]*)(?:$|,)");
/*  20: 47 */   private static final Pattern c = Pattern.compile("\\G(\\w+)=([-!]?[\\w-]*)(?:$|,)");
/*  21: 70 */   private static final Set<String> d = Sets.newHashSet(new String[] { "x", "y", "z", "dx", "dy", "dz", "rm", "r" });
/*  22:    */   
/*  23:    */   public static qw a(ICommandSender paramae, String paramString)
/*  24:    */   {
/*  25: 83 */     return (qw)a(paramae, paramString, qw.class);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public static Entity a(ICommandSender paramae, String paramString, Class paramClass)
/*  29:    */   {
/*  30: 88 */     List localList = b(paramae, paramString, paramClass);
/*  31: 89 */     return localList.size() == 1 ? (Entity)localList.get(0) : null;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public static ho b(ICommandSender paramae, String paramString)
/*  35:    */   {
/*  36: 94 */     List<Entity> localList = b(paramae, paramString, Entity.class);
/*  37: 95 */     if (localList.isEmpty()) {
/*  38: 96 */       return null;
/*  39:    */     }
/*  40: 99 */     ArrayList<ho> localArrayList = Lists.newArrayList();
/*  41:100 */     for (Entity localwv : localList) {
/*  42:101 */       localArrayList.add(localwv.e_());
/*  43:    */     }
/*  44:104 */     return CommandBase.a(localArrayList);
/*  45:    */   }
/*  46:    */   
/*  47:    */   public static List b(ICommandSender paramae, String paramString, Class paramClass)
/*  48:    */   {
/*  49:108 */     Matcher localMatcher = a.matcher(paramString);
/*  50:110 */     if ((localMatcher.matches()) && (paramae.a(1, "@")))
/*  51:    */     {
/*  52:111 */       Map localMap = c(localMatcher.group(2));
/*  53:112 */       if (!b(paramae, localMap)) {
/*  54:113 */         return Collections.emptyList();
/*  55:    */       }
/*  56:116 */       String str = localMatcher.group(1);
/*  57:117 */       BlockPosition localdt = b(localMap, paramae.c());
/*  58:118 */       List<World> localList = a(paramae, localMap);
/*  59:119 */       ArrayList localArrayList1 = Lists.newArrayList();
/*  60:121 */       for (World localaqu : localList) {
/*  61:122 */         if (localaqu != null)
/*  62:    */         {
/*  63:126 */           ArrayList<Predicate<Entity>> localArrayList2 = Lists.newArrayList();
/*  64:127 */           localArrayList2.addAll(a(localMap, str));
/*  65:128 */           localArrayList2.addAll(b(localMap));
/*  66:129 */           localArrayList2.addAll(c(localMap));
/*  67:130 */           localArrayList2.addAll(d(localMap));
/*  68:131 */           localArrayList2.addAll(e(localMap));
/*  69:132 */           localArrayList2.addAll(f(localMap));
/*  70:133 */           localArrayList2.addAll(a(localMap, localdt));
/*  71:134 */           localArrayList2.addAll(g(localMap));
/*  72:    */           
/*  73:136 */           localArrayList1.addAll(a(localMap, paramClass, localArrayList2, str, localaqu, localdt));
/*  74:    */         }
/*  75:    */       }
/*  76:138 */       return a(localArrayList1, localMap, paramae, paramClass, str, localdt);
/*  77:    */     }
/*  78:141 */     return Collections.emptyList();
/*  79:    */   }
/*  80:    */   
/*  81:    */   private static List a(ICommandSender paramae, Map paramMap)
/*  82:    */   {
/*  83:145 */     ArrayList localArrayList = Lists.newArrayList();
/*  84:146 */     if (h(paramMap)) {
/*  85:147 */       localArrayList.add(paramae.e());
/*  86:    */     } else {
/*  87:149 */       Collections.addAll(localArrayList, MinecraftServer.M().c);
/*  88:    */     }
/*  89:151 */     return localArrayList;
/*  90:    */   }
/*  91:    */   
/*  92:    */   private static boolean b(ICommandSender paramae, Map paramMap)
/*  93:    */   {
/*  94:155 */     String str = b(paramMap, "type");
/*  95:156 */     str = (str != null) && (str.startsWith("!")) ? str.substring(1) : str;
/*  96:157 */     if ((str != null) && (!EntityList.b(str)))
/*  97:    */     {
/*  98:158 */       hz localhz = new hz("commands.generic.entity.invalidType", new Object[] { str });
/*  99:159 */       localhz.b().a(net.minecraft.src.a.m);
/* 100:160 */       paramae.a(localhz);
/* 101:161 */       return false;
/* 102:    */     }
/* 103:163 */     return true;
/* 104:    */   }
/* 105:    */   
/* 106:    */   private static List<Predicate<Entity>> a(Map paramMap, String paramString)
/* 107:    */   {
/* 108:167 */     ArrayList<Predicate<Entity>> localArrayList = Lists.newArrayList();
/* 109:168 */     String str1 = b(paramMap, "type");
/* 110:169 */     boolean bool = (str1 != null) && (str1.startsWith("!"));
/* 111:170 */     if (bool) {
/* 112:171 */       str1 = str1.substring(1);
/* 113:    */     }
/* 114:173 */     String str2 = str1;
/* 115:    */     
/* 116:175 */     int i = !paramString.equals("e") ? 1 : 0;
/* 117:176 */     int j = (paramString.equals("r")) && (str1 != null) ? 1 : 0;
/* 118:177 */     if (((str1 != null) && (paramString.equals("e"))) || (j != 0)) {
/* 119:178 */       localArrayList.add(new ai(str2, bool));
/* 120:184 */     } else if (i != 0) {
/* 121:185 */       localArrayList.add(new am());
/* 122:    */     }
/* 123:192 */     return localArrayList;
/* 124:    */   }
/* 125:    */   
/* 126:    */   private static List<Predicate<Entity>> b(Map paramMap)
/* 127:    */   {
/* 128:196 */     ArrayList<Predicate<Entity>> localArrayList = Lists.newArrayList();
/* 129:197 */     int i = a(paramMap, "lm", -1);
/* 130:198 */     int j = a(paramMap, "l", -1);
/* 131:200 */     if ((i > -1) || (j > -1)) {
/* 132:201 */       localArrayList.add(new an(i, j));
/* 133:    */     }
/* 134:213 */     return localArrayList;
/* 135:    */   }
/* 136:    */   
/* 137:    */   private static List<Predicate<Entity>> c(Map paramMap)
/* 138:    */   {
/* 139:217 */     ArrayList<Predicate<Entity>> localArrayList = Lists.newArrayList();
/* 140:218 */     int i = a(paramMap, "m", EnumGameType.a.a());
/* 141:220 */     if (i != EnumGameType.a.a()) {
/* 142:221 */       localArrayList.add(new ao(i));
/* 143:    */     }
/* 144:233 */     return localArrayList;
/* 145:    */   }
/* 146:    */   
/* 147:    */   private static List<Predicate<Entity>> d(Map paramMap)
/* 148:    */   {
/* 149:237 */     ArrayList<Predicate<Entity>> localArrayList = Lists.newArrayList();
/* 150:238 */     String str1 = b(paramMap, "team");
/* 151:239 */     boolean bool = (str1 != null) && (str1.startsWith("!"));
/* 152:240 */     if (bool) {
/* 153:241 */       str1 = str1.substring(1);
/* 154:    */     }
/* 155:243 */     String str2 = str1;
/* 156:245 */     if (str1 != null) {
/* 157:246 */       localArrayList.add(new ap(str2, bool));
/* 158:    */     }
/* 159:260 */     return localArrayList;
/* 160:    */   }
/* 161:    */   
/* 162:    */   private static List<Predicate<Entity>> e(Map paramMap)
/* 163:    */   {
/* 164:264 */     ArrayList<Predicate<Entity>> localArrayList = Lists.newArrayList();
/* 165:265 */     Map localMap = a(paramMap);
/* 166:267 */     if ((localMap != null) && (localMap.size() > 0)) {
/* 167:268 */       localArrayList.add(new aq(localMap));
/* 168:    */     }
/* 169:303 */     return localArrayList;
/* 170:    */   }
/* 171:    */   
/* 172:    */   private static List<Predicate<Entity>> f(Map paramMap)
/* 173:    */   {
/* 174:307 */     ArrayList<Predicate<Entity>> localArrayList = Lists.newArrayList();
/* 175:308 */     String str1 = b(paramMap, "name");
/* 176:309 */     boolean bool = (str1 != null) && (str1.startsWith("!"));
/* 177:310 */     if (bool) {
/* 178:311 */       str1 = str1.substring(1);
/* 179:    */     }
/* 180:313 */     String str2 = str1;
/* 181:315 */     if (str1 != null) {
/* 182:316 */       localArrayList.add(new ar(str2, bool));
/* 183:    */     }
/* 184:323 */     return localArrayList;
/* 185:    */   }
/* 186:    */   
/* 187:    */   private static List<Predicate<Entity>> a(Map paramMap, BlockPosition paramdt)
/* 188:    */   {
/* 189:327 */     ArrayList<Predicate<Entity>> localArrayList = Lists.newArrayList();
/* 190:328 */     int i = a(paramMap, "rm", -1);
/* 191:329 */     int j = a(paramMap, "r", -1);
/* 192:331 */     if ((paramdt != null) && ((i >= 0) || (j >= 0)))
/* 193:    */     {
/* 194:332 */       int k = i * i;
/* 195:333 */       int m = j * j;
/* 196:    */       
/* 197:335 */       localArrayList.add(new as(paramdt, i, k, j, m));
/* 198:    */     }
/* 199:343 */     return localArrayList;
/* 200:    */   }
/* 201:    */   
/* 202:    */   private static List<Predicate<Entity>> g(Map paramMap)
/* 203:    */   {
/* 204:347 */     ArrayList<Predicate<Entity>> localArrayList = Lists.newArrayList();
/* 205:    */     int i;
/* 206:    */     int j;
/* 207:348 */     if ((paramMap.containsKey("rym")) || (paramMap.containsKey("ry")))
/* 208:    */     {
/* 209:349 */       i = a(a(paramMap, "rym", 0));
/* 210:350 */       j = a(a(paramMap, "ry", 359));
/* 211:    */       
/* 212:352 */       localArrayList.add(new at(i, j));
/* 213:    */     }
/* 214:363 */     if ((paramMap.containsKey("rxm")) || (paramMap.containsKey("rx")))
/* 215:    */     {
/* 216:364 */       i = a(a(paramMap, "rxm", 0));
/* 217:365 */       j = a(a(paramMap, "rx", 359));
/* 218:    */       
/* 219:367 */       localArrayList.add(new aj(i, j));
/* 220:    */     }
/* 221:378 */     return localArrayList;
/* 222:    */   }
/* 223:    */   
/* 224:    */   private static <E extends Entity> List<Entity> a(Map paramMap, Class<E> paramClass, List paramList, String paramString, World paramaqu, BlockPosition paramdt)
/* 225:    */   {
/* 226:382 */     ArrayList<Entity> localArrayList = Lists.newArrayList();
/* 227:383 */     String str = b(paramMap, "type");
/* 228:384 */     str = (str != null) && (str.startsWith("!")) ? str.substring(1) : str;
/* 229:    */     
/* 230:386 */     int i = !paramString.equals("e") ? 1 : 0;
/* 231:387 */     int j = (paramString.equals("r")) && (str != null) ? 1 : 0;
/* 232:    */     
/* 233:389 */     int k = a(paramMap, "dx", 0);
/* 234:390 */     int m = a(paramMap, "dy", 0);
/* 235:391 */     int n = a(paramMap, "dz", 0);
/* 236:    */     
/* 237:393 */     int i1 = a(paramMap, "r", -1);
/* 238:    */     
/* 239:395 */     Predicate localPredicate1 = Predicates.and(paramList);
/* 240:396 */     Predicate localPredicate2 = Predicates.and(xe.a, localPredicate1);
/* 241:397 */     if (paramdt != null)
/* 242:    */     {
/* 243:398 */       int i2 = paramaqu.playerList.size();
/* 244:399 */       int i3 = paramaqu.entityList.size();
/* 245:400 */       int i4 = i2 < i3 / 16 ? 1 : 0;
/* 246:    */       AABB localbrt;
/* 247:401 */       if ((paramMap.containsKey("dx")) || (paramMap.containsKey("dy")) || (paramMap.containsKey("dz")))
/* 248:    */       {
/* 249:402 */         localbrt = a(paramdt, k, m, n);
/* 250:403 */         if ((i != 0) && (i4 != 0) && (j == 0))
/* 251:    */         {
/* 252:404 */           ak localak = new ak(localbrt);
/* 253:    */           
/* 254:    */ 
/* 255:    */ 
/* 256:    */ 
/* 257:    */ 
/* 258:    */ 
/* 259:    */ 
/* 260:    */ 
/* 261:    */ 
/* 262:    */ 
/* 263:    */ 
/* 264:416 */           localArrayList.addAll(paramaqu.b(paramClass, Predicates.and(localPredicate2, localak)));
/* 265:    */         }
/* 266:    */         else
/* 267:    */         {
/* 268:418 */           localArrayList.addAll(paramaqu.a(paramClass, localbrt, localPredicate2));
/* 269:    */         }
/* 270:    */       }
/* 271:420 */       else if (i1 >= 0)
/* 272:    */       {
/* 273:421 */         localbrt = new AABB(paramdt.getX() - i1, paramdt.getY() - i1, paramdt.getZ() - i1, paramdt.getX() + i1 + 1, paramdt.getY() + i1 + 1, paramdt.getZ() + i1 + 1);
/* 274:422 */         if ((i != 0) && (i4 != 0) && (j == 0)) {
/* 275:423 */           localArrayList.addAll(paramaqu.b(paramClass, localPredicate2));
/* 276:    */         } else {
/* 277:425 */           localArrayList.addAll(paramaqu.a(paramClass, localbrt, localPredicate2));
/* 278:    */         }
/* 279:    */       }
/* 280:428 */       else if (paramString.equals("a"))
/* 281:    */       {
/* 282:429 */         localArrayList.addAll(paramaqu.b(paramClass, localPredicate1));
/* 283:    */       }
/* 284:430 */       else if ((paramString.equals("p")) || ((paramString.equals("r")) && (j == 0)))
/* 285:    */       {
/* 286:431 */         localArrayList.addAll(paramaqu.b(paramClass, localPredicate2));
/* 287:    */       }
/* 288:    */       else
/* 289:    */       {
/* 290:433 */         localArrayList.addAll(paramaqu.a(paramClass, localPredicate2));
/* 291:    */       }
/* 292:    */     }
/* 293:437 */     else if (paramString.equals("a"))
/* 294:    */     {
/* 295:438 */       localArrayList.addAll(paramaqu.b(paramClass, localPredicate1));
/* 296:    */     }
/* 297:439 */     else if ((paramString.equals("p")) || ((paramString.equals("r")) && (j == 0)))
/* 298:    */     {
/* 299:440 */       localArrayList.addAll(paramaqu.b(paramClass, localPredicate2));
/* 300:    */     }
/* 301:    */     else
/* 302:    */     {
/* 303:442 */       localArrayList.addAll(paramaqu.a(paramClass, localPredicate2));
/* 304:    */     }
/* 305:445 */     return localArrayList;
/* 306:    */   }
/* 307:    */   
/* 308:    */   private static List a(List paramList, Map paramMap, ICommandSender paramae, Class paramClass, String paramString, BlockPosition paramdt)
/* 309:    */   {
/* 310:449 */     int i = a(paramMap, "c", (paramString.equals("a")) || (paramString.equals("e")) ? 0 : 1);
/* 311:451 */     if ((paramString.equals("p")) || (paramString.equals("a")) || (paramString.equals("e")))
/* 312:    */     {
/* 313:452 */       if (paramdt != null) {
/* 314:453 */         Collections.sort(paramList, new al(paramdt));
/* 315:    */       }
/* 316:    */     }
/* 317:460 */     else if (paramString.equals("r")) {
/* 318:461 */       Collections.shuffle(paramList);
/* 319:    */     }
/* 320:464 */     Entity localwv = paramae.f();
/* 321:465 */     if ((localwv != null) && (paramClass.isAssignableFrom(localwv.getClass())) && (i == 1) && (paramList.contains(localwv)) && (!"r".equals(paramString))) {
/* 322:466 */       paramList = Lists.newArrayList(new Entity[] { localwv });
/* 323:    */     }
/* 324:469 */     if (i != 0)
/* 325:    */     {
/* 326:470 */       if (i < 0) {
/* 327:471 */         Collections.reverse(paramList);
/* 328:    */       }
/* 329:473 */       paramList = paramList.subList(0, Math.min(Math.abs(i), paramList.size()));
/* 330:    */     }
/* 331:475 */     return paramList;
/* 332:    */   }
/* 333:    */   
/* 334:    */   private static AABB a(BlockPosition paramdt, int paramInt1, int paramInt2, int paramInt3)
/* 335:    */   {
/* 336:479 */     int i = paramInt1 < 0 ? 1 : 0;
/* 337:480 */     int j = paramInt2 < 0 ? 1 : 0;
/* 338:481 */     int k = paramInt3 < 0 ? 1 : 0;
/* 339:482 */     int m = paramdt.getX() + (i != 0 ? paramInt1 : 0);
/* 340:483 */     int n = paramdt.getY() + (j != 0 ? paramInt2 : 0);
/* 341:484 */     int i1 = paramdt.getZ() + (k != 0 ? paramInt3 : 0);
/* 342:485 */     int i2 = paramdt.getX() + (i != 0 ? 0 : paramInt1) + 1;
/* 343:486 */     int i3 = paramdt.getY() + (j != 0 ? 0 : paramInt2) + 1;
/* 344:487 */     int i4 = paramdt.getZ() + (k != 0 ? 0 : paramInt3) + 1;
/* 345:488 */     return new AABB(m, n, i1, i2, i3, i4);
/* 346:    */   }
/* 347:    */   
/* 348:    */   public static int a(int paramInt)
/* 349:    */   {
/* 350:492 */     paramInt %= 360;
/* 351:493 */     if (paramInt >= 160) {
/* 352:494 */       paramInt -= 360;
/* 353:    */     }
/* 354:496 */     if (paramInt < 0) {
/* 355:497 */       paramInt += 360;
/* 356:    */     }
/* 357:499 */     return paramInt;
/* 358:    */   }
/* 359:    */   
/* 360:    */   private static BlockPosition b(Map paramMap, BlockPosition paramdt)
/* 361:    */   {
/* 362:503 */     return new BlockPosition(a(paramMap, "x", paramdt.getX()), a(paramMap, "y", paramdt.getY()), a(paramMap, "z", paramdt.getZ()));
/* 363:    */   }
/* 364:    */   
/* 365:    */   private static boolean h(Map paramMap)
/* 366:    */   {
/* 367:511 */     for (String str : d) {
/* 368:512 */       if (paramMap.containsKey(str)) {
/* 369:513 */         return true;
/* 370:    */       }
/* 371:    */     }
/* 372:516 */     return false;
/* 373:    */   }
/* 374:    */   
/* 375:    */   private static int a(Map paramMap, String paramString, int paramInt)
/* 376:    */   {
/* 377:520 */     return paramMap.containsKey(paramString) ? MathUtils.getInt((String)paramMap.get(paramString), paramInt) : paramInt;
/* 378:    */   }
/* 379:    */   
/* 380:    */   private static String b(Map paramMap, String paramString)
/* 381:    */   {
/* 382:524 */     return (String)paramMap.get(paramString);
/* 383:    */   }
/* 384:    */   
/* 385:    */   public static Map<String,Integer> a(Map<String,String> paramMap)
/* 386:    */   {
/* 387:528 */     HashMap<String,Integer> localHashMap = Maps.newHashMap();
/* 388:530 */     for (String str : paramMap.keySet()) {
/* 389:531 */       if ((str.startsWith("score_")) && (str.length() > "score_".length())) {
/* 390:532 */         localHashMap.put(str.substring("score_".length()), Integer.valueOf(MathUtils.getInt((String)paramMap.get(str), 1)));
/* 391:    */       }
/* 392:    */     }
/* 393:536 */     return localHashMap;
/* 394:    */   }
/* 395:    */   
/* 396:    */   public static boolean a(String paramString)
/* 397:    */   {
/* 398:540 */     Matcher localMatcher = a.matcher(paramString);
/* 399:542 */     if (localMatcher.matches())
/* 400:    */     {
/* 401:543 */       Map localMap = c(localMatcher.group(2));
/* 402:544 */       String str = localMatcher.group(1);
/* 403:545 */       int i = ("a".equals(str)) || ("e".equals(str)) ? 0 : 1;
/* 404:546 */       return a(localMap, "c", i) != 1;
/* 405:    */     }
/* 406:549 */     return false;
/* 407:    */   }
/* 408:    */   
/* 409:    */   public static boolean b(String paramString)
/* 410:    */   {
/* 411:553 */     return a.matcher(paramString).matches();
/* 412:    */   }
/* 413:    */   
/* 414:    */   private static Map c(String paramString)
/* 415:    */   {
/* 416:557 */     HashMap localHashMap = Maps.newHashMap();
/* 417:559 */     if (paramString == null) {
/* 418:560 */       return localHashMap;
/* 419:    */     }
/* 420:563 */     int i = 0;
/* 421:564 */     int j = -1;
/* 422:    */     
/* 423:566 */     Matcher localMatcher = b.matcher(paramString);
/* 424:    */     Object localObject;
/* 425:567 */     while (localMatcher.find())
/* 426:    */     {
/* 427:568 */       localObject = null;
/* 428:570 */       switch (i++)
/* 429:    */       {
/* 430:    */       case 0: 
/* 431:572 */         localObject = "x";
/* 432:573 */         break;
/* 433:    */       case 1: 
/* 434:575 */         localObject = "y";
/* 435:576 */         break;
/* 436:    */       case 2: 
/* 437:578 */         localObject = "z";
/* 438:579 */         break;
/* 439:    */       case 3: 
/* 440:581 */         localObject = "r";
/* 441:    */       }
/* 442:585 */       if ((localObject != null) && (localMatcher.group(1).length() > 0)) {
/* 443:586 */         localHashMap.put(localObject, localMatcher.group(1));
/* 444:    */       }
/* 445:588 */       j = localMatcher.end();
/* 446:    */     }
/* 447:591 */     if (j < paramString.length())
/* 448:    */     {
/* 449:592 */       localObject = c.matcher(j == -1 ? paramString : paramString.substring(j));
/* 450:593 */       while (((Matcher)localObject).find()) {
/* 451:594 */         localHashMap.put(((Matcher)localObject).group(1), ((Matcher)localObject).group(2));
/* 452:    */       }
/* 453:    */     }
/* 454:598 */     return localHashMap;
/* 455:    */   }
/* 456:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ah
 * JD-Core Version:    0.7.0.1
 */
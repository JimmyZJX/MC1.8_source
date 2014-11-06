package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Sets;

/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.Arrays;
/*   5:    */ import java.util.Collection;
/*   6:    */ import java.util.HashSet;
/*   7:    */ import java.util.Iterator;
/*   8:    */ import java.util.List;
/*   9:    */ import java.util.Map;
/*  10:    */ import java.util.Set;
/*  11:    */ import java.util.UUID;

import net.minecraft.server.MinecraftServer;
/*  13:    */ 
/*  14:    */ public class ck
/*  15:    */   extends CommandBase
/*  16:    */ {
/*  17:    */   public String c()
/*  18:    */   {
/*  19: 33 */     return "scoreboard";
/*  20:    */   }
/*  21:    */   
/*  22:    */   public int a()
/*  23:    */   {
/*  24: 38 */     return 2;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String c(ICommandSender paramae)
/*  28:    */   {
/*  29: 43 */     return "commands.scoreboard.usage";
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  33:    */   {
/*  34: 48 */     if (b(paramae, paramArrayOfString)) {
/*  35: 49 */       return;
/*  36:    */     }
/*  37: 52 */     if (paramArrayOfString.length < 1) {
/*  38: 53 */       throw new WrongUsageException("commands.scoreboard.usage", new Object[0]);
/*  39:    */     }
/*  40: 56 */     if (paramArrayOfString[0].equalsIgnoreCase("objectives"))
/*  41:    */     {
/*  42: 57 */       if (paramArrayOfString.length == 1) {
/*  43: 58 */         throw new WrongUsageException("commands.scoreboard.objectives.usage", new Object[0]);
/*  44:    */       }
/*  45: 59 */       if (paramArrayOfString[1].equalsIgnoreCase("list")) {
/*  46: 60 */         d(paramae);
/*  47: 61 */       } else if (paramArrayOfString[1].equalsIgnoreCase("add"))
/*  48:    */       {
/*  49: 62 */         if (paramArrayOfString.length >= 4) {
/*  50: 63 */           b(paramae, paramArrayOfString, 2);
/*  51:    */         } else {
/*  52: 65 */           throw new WrongUsageException("commands.scoreboard.objectives.add.usage", new Object[0]);
/*  53:    */         }
/*  54:    */       }
/*  55: 67 */       else if (paramArrayOfString[1].equalsIgnoreCase("remove"))
/*  56:    */       {
/*  57: 68 */         if (paramArrayOfString.length == 3) {
/*  58: 69 */           h(paramae, paramArrayOfString[2]);
/*  59:    */         } else {
/*  60: 71 */           throw new WrongUsageException("commands.scoreboard.objectives.remove.usage", new Object[0]);
/*  61:    */         }
/*  62:    */       }
/*  63: 73 */       else if (paramArrayOfString[1].equalsIgnoreCase("setdisplay"))
/*  64:    */       {
/*  65: 74 */         if ((paramArrayOfString.length == 3) || (paramArrayOfString.length == 4)) {
/*  66: 75 */           j(paramae, paramArrayOfString, 2);
/*  67:    */         } else {
/*  68: 77 */           throw new WrongUsageException("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
/*  69:    */         }
/*  70:    */       }
/*  71:    */       else {
/*  72: 80 */         throw new WrongUsageException("commands.scoreboard.objectives.usage", new Object[0]);
/*  73:    */       }
/*  74:    */     }
/*  75: 82 */     else if (paramArrayOfString[0].equalsIgnoreCase("players"))
/*  76:    */     {
/*  77: 83 */       if (paramArrayOfString.length == 1) {
/*  78: 84 */         throw new WrongUsageException("commands.scoreboard.players.usage", new Object[0]);
/*  79:    */       }
/*  80: 85 */       if (paramArrayOfString[1].equalsIgnoreCase("list"))
/*  81:    */       {
/*  82: 86 */         if (paramArrayOfString.length <= 3) {
/*  83: 87 */           k(paramae, paramArrayOfString, 2);
/*  84:    */         } else {
/*  85: 89 */           throw new WrongUsageException("commands.scoreboard.players.list.usage", new Object[0]);
/*  86:    */         }
/*  87:    */       }
/*  88: 91 */       else if (paramArrayOfString[1].equalsIgnoreCase("add"))
/*  89:    */       {
/*  90: 92 */         if (paramArrayOfString.length >= 5) {
/*  91: 93 */           l(paramae, paramArrayOfString, 2);
/*  92:    */         } else {
/*  93: 95 */           throw new WrongUsageException("commands.scoreboard.players.add.usage", new Object[0]);
/*  94:    */         }
/*  95:    */       }
/*  96: 97 */       else if (paramArrayOfString[1].equalsIgnoreCase("remove"))
/*  97:    */       {
/*  98: 98 */         if (paramArrayOfString.length >= 5) {
/*  99: 99 */           l(paramae, paramArrayOfString, 2);
/* 100:    */         } else {
/* 101:101 */           throw new WrongUsageException("commands.scoreboard.players.remove.usage", new Object[0]);
/* 102:    */         }
/* 103:    */       }
/* 104:103 */       else if (paramArrayOfString[1].equalsIgnoreCase("set"))
/* 105:    */       {
/* 106:104 */         if (paramArrayOfString.length >= 5) {
/* 107:105 */           l(paramae, paramArrayOfString, 2);
/* 108:    */         } else {
/* 109:107 */           throw new WrongUsageException("commands.scoreboard.players.set.usage", new Object[0]);
/* 110:    */         }
/* 111:    */       }
/* 112:109 */       else if (paramArrayOfString[1].equalsIgnoreCase("reset"))
/* 113:    */       {
/* 114:110 */         if ((paramArrayOfString.length == 3) || (paramArrayOfString.length == 4)) {
/* 115:111 */           m(paramae, paramArrayOfString, 2);
/* 116:    */         } else {
/* 117:113 */           throw new WrongUsageException("commands.scoreboard.players.reset.usage", new Object[0]);
/* 118:    */         }
/* 119:    */       }
/* 120:115 */       else if (paramArrayOfString[1].equalsIgnoreCase("enable"))
/* 121:    */       {
/* 122:116 */         if (paramArrayOfString.length == 4) {
/* 123:117 */           n(paramae, paramArrayOfString, 2);
/* 124:    */         } else {
/* 125:119 */           throw new WrongUsageException("commands.scoreboard.players.enable.usage", new Object[0]);
/* 126:    */         }
/* 127:    */       }
/* 128:121 */       else if (paramArrayOfString[1].equalsIgnoreCase("test"))
/* 129:    */       {
/* 130:122 */         if ((paramArrayOfString.length == 5) || (paramArrayOfString.length == 6)) {
/* 131:123 */           o(paramae, paramArrayOfString, 2);
/* 132:    */         } else {
/* 133:125 */           throw new WrongUsageException("commands.scoreboard.players.test.usage", new Object[0]);
/* 134:    */         }
/* 135:    */       }
/* 136:127 */       else if (paramArrayOfString[1].equalsIgnoreCase("operation"))
/* 137:    */       {
/* 138:128 */         if (paramArrayOfString.length == 7) {
/* 139:129 */           p(paramae, paramArrayOfString, 2);
/* 140:    */         } else {
/* 141:131 */           throw new WrongUsageException("commands.scoreboard.players.operation.usage", new Object[0]);
/* 142:    */         }
/* 143:    */       }
/* 144:    */       else {
/* 145:134 */         throw new WrongUsageException("commands.scoreboard.players.usage", new Object[0]);
/* 146:    */       }
/* 147:    */     }
/* 148:136 */     else if (paramArrayOfString[0].equalsIgnoreCase("teams"))
/* 149:    */     {
/* 150:137 */       if (paramArrayOfString.length == 1) {
/* 151:138 */         throw new WrongUsageException("commands.scoreboard.teams.usage", new Object[0]);
/* 152:    */       }
/* 153:139 */       if (paramArrayOfString[1].equalsIgnoreCase("list"))
/* 154:    */       {
/* 155:140 */         if (paramArrayOfString.length <= 3) {
/* 156:141 */           f(paramae, paramArrayOfString, 2);
/* 157:    */         } else {
/* 158:143 */           throw new WrongUsageException("commands.scoreboard.teams.list.usage", new Object[0]);
/* 159:    */         }
/* 160:    */       }
/* 161:145 */       else if (paramArrayOfString[1].equalsIgnoreCase("add"))
/* 162:    */       {
/* 163:146 */         if (paramArrayOfString.length >= 3) {
/* 164:147 */           c(paramae, paramArrayOfString, 2);
/* 165:    */         } else {
/* 166:149 */           throw new WrongUsageException("commands.scoreboard.teams.add.usage", new Object[0]);
/* 167:    */         }
/* 168:    */       }
/* 169:151 */       else if (paramArrayOfString[1].equalsIgnoreCase("remove"))
/* 170:    */       {
/* 171:152 */         if (paramArrayOfString.length == 3) {
/* 172:153 */           e(paramae, paramArrayOfString, 2);
/* 173:    */         } else {
/* 174:155 */           throw new WrongUsageException("commands.scoreboard.teams.remove.usage", new Object[0]);
/* 175:    */         }
/* 176:    */       }
/* 177:157 */       else if (paramArrayOfString[1].equalsIgnoreCase("empty"))
/* 178:    */       {
/* 179:158 */         if (paramArrayOfString.length == 3) {
/* 180:159 */           i(paramae, paramArrayOfString, 2);
/* 181:    */         } else {
/* 182:161 */           throw new WrongUsageException("commands.scoreboard.teams.empty.usage", new Object[0]);
/* 183:    */         }
/* 184:    */       }
/* 185:163 */       else if (paramArrayOfString[1].equalsIgnoreCase("join"))
/* 186:    */       {
/* 187:164 */         if ((paramArrayOfString.length >= 4) || ((paramArrayOfString.length == 3) && ((paramae instanceof EntityPlayer)))) {
/* 188:165 */           g(paramae, paramArrayOfString, 2);
/* 189:    */         } else {
/* 190:167 */           throw new WrongUsageException("commands.scoreboard.teams.join.usage", new Object[0]);
/* 191:    */         }
/* 192:    */       }
/* 193:169 */       else if (paramArrayOfString[1].equalsIgnoreCase("leave"))
/* 194:    */       {
/* 195:170 */         if ((paramArrayOfString.length >= 3) || ((paramae instanceof EntityPlayer))) {
/* 196:171 */           h(paramae, paramArrayOfString, 2);
/* 197:    */         } else {
/* 198:173 */           throw new WrongUsageException("commands.scoreboard.teams.leave.usage", new Object[0]);
/* 199:    */         }
/* 200:    */       }
/* 201:175 */       else if (paramArrayOfString[1].equalsIgnoreCase("option"))
/* 202:    */       {
/* 203:176 */         if ((paramArrayOfString.length == 4) || (paramArrayOfString.length == 5)) {
/* 204:177 */           d(paramae, paramArrayOfString, 2);
/* 205:    */         } else {
/* 206:179 */           throw new WrongUsageException("commands.scoreboard.teams.option.usage", new Object[0]);
/* 207:    */         }
/* 208:    */       }
/* 209:    */       else {
/* 210:182 */         throw new WrongUsageException("commands.scoreboard.teams.usage", new Object[0]);
/* 211:    */       }
/* 212:    */     }
/* 213:    */   }
/* 214:    */   
/* 215:    */   private boolean b(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 216:    */   {
/* 217:188 */     int i = -1;
/* 218:189 */     for (int j = 0; j < paramArrayOfString.length; j++) {
/* 219:190 */       if (b(paramArrayOfString, j)) {
/* 220:193 */         if ("*".equals(paramArrayOfString[j])) {
/* 221:194 */           if (i < 0) {
/* 222:195 */             i = j;
/* 223:    */           } else {
/* 224:197 */             throw new CommandException("commands.scoreboard.noMultiWildcard", new Object[0]);
/* 225:    */           }
/* 226:    */         }
/* 227:    */       }
/* 228:    */     }
/* 229:201 */     if (i < 0) {
/* 230:202 */       return false;
/* 231:    */     }
/* 232:204 */     ArrayList<String> localArrayList1 = Lists.newArrayList(d().d());
/* 233:205 */     String str1 = paramArrayOfString[i];
/* 234:206 */     ArrayList<String> localArrayList2 = Lists.newArrayList();
/* 235:208 */     for (String str2 : localArrayList1)
/* 236:    */     {
/* 237:209 */       paramArrayOfString[i] = str2;
/* 238:    */       try
/* 239:    */       {
/* 240:212 */         a(paramae, paramArrayOfString);
/* 241:213 */         localArrayList2.add(str2);
/* 242:    */       }
/* 243:    */       catch (CommandException localdi)
/* 244:    */       {
/* 245:215 */         hz localhz = new hz(localdi.getMessage(), localdi.a());
/* 246:216 */         localhz.b().a(a.m);
/* 247:217 */         paramae.a(localhz);
/* 248:    */       }
/* 249:    */     }
/* 250:220 */     paramArrayOfString[i] = str1;
/* 251:    */     
/* 252:222 */     paramae.a(ag.c, localArrayList2.size());
/* 253:223 */     if (localArrayList2.size() == 0) {
/* 254:224 */       throw new WrongUsageException("commands.scoreboard.allMatchesFailed", new Object[0]);
/* 255:    */     }
/* 256:226 */     return true;
/* 257:    */   }
/* 258:    */   
/* 259:    */   protected bsd d()
/* 260:    */   {
/* 261:230 */     return MinecraftServer.M().a(0).Z();
/* 262:    */   }
/* 263:    */   
/* 264:    */   protected bry a(String paramString, boolean paramBoolean) throws CommandException
/* 265:    */   {
/* 266:234 */     bsd localbsd = d();
/* 267:235 */     bry localbry = localbsd.b(paramString);
/* 268:237 */     if (localbry == null) {
/* 269:238 */       throw new CommandException("commands.scoreboard.objectiveNotFound", new Object[] { paramString });
/* 270:    */     }
/* 271:239 */     if ((paramBoolean) && (localbry.c().b())) {
/* 272:240 */       throw new CommandException("commands.scoreboard.objectiveReadOnly", new Object[] { paramString });
/* 273:    */     }
/* 274:243 */     return localbry;
/* 275:    */   }
/* 276:    */   
/* 277:    */   protected brz e(String paramString) throws CommandException
/* 278:    */   {
/* 279:247 */     bsd localbsd = d();
/* 280:248 */     brz localbrz = localbsd.d(paramString);
/* 281:250 */     if (localbrz == null) {
/* 282:251 */       throw new CommandException("commands.scoreboard.teamNotFound", new Object[] { paramString });
/* 283:    */     }
/* 284:254 */     return localbrz;
/* 285:    */   }
/* 286:    */   
/* 287:    */   protected void b(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 288:    */   {
/* 289:258 */     String str1 = paramArrayOfString[(paramInt++)];
/* 290:259 */     String str2 = paramArrayOfString[(paramInt++)];
/* 291:260 */     bsd localbsd = d();
/* 292:261 */     bsk localbsk = (bsk)bsk.a.get(str2);
/* 293:263 */     if (localbsk == null) {
/* 294:264 */       throw new WrongUsageException("commands.scoreboard.objectives.add.wrongType", new Object[] { str2 });
/* 295:    */     }
/* 296:266 */     if (localbsd.b(str1) != null) {
/* 297:267 */       throw new CommandException("commands.scoreboard.objectives.add.alreadyExists", new Object[] { str1 });
/* 298:    */     }
/* 299:269 */     if (str1.length() > 16) {
/* 300:270 */       throw new SyntaxErrorException("commands.scoreboard.objectives.add.tooLong", new Object[] { str1, Integer.valueOf(16) });
/* 301:    */     }
/* 302:272 */     if (str1.length() == 0) {
/* 303:273 */       throw new WrongUsageException("commands.scoreboard.objectives.add.usage", new Object[0]);
/* 304:    */     }
/* 305:276 */     if (paramArrayOfString.length > paramInt)
/* 306:    */     {
/* 307:277 */       String str3 = a(paramae, paramArrayOfString, paramInt).c();
/* 308:279 */       if (str3.length() > 32) {
/* 309:280 */         throw new SyntaxErrorException("commands.scoreboard.objectives.add.displayTooLong", new Object[] { str3, Integer.valueOf(32) });
/* 310:    */       }
/* 311:282 */       if (str3.length() > 0) {
/* 312:283 */         localbsd.a(str1, localbsk).a(str3);
/* 313:    */       } else {
/* 314:285 */         localbsd.a(str1, localbsk);
/* 315:    */       }
/* 316:    */     }
/* 317:    */     else
/* 318:    */     {
/* 319:288 */       localbsd.a(str1, localbsk);
/* 320:    */     }
/* 321:291 */     a(paramae, this, "commands.scoreboard.objectives.add.success", new Object[] { str1 });
/* 322:    */   }
/* 323:    */   
/* 324:    */   protected void c(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 325:    */   {
/* 326:295 */     String str1 = paramArrayOfString[(paramInt++)];
/* 327:296 */     bsd localbsd = d();
/* 328:298 */     if (localbsd.d(str1) != null) {
/* 329:299 */       throw new CommandException("commands.scoreboard.teams.add.alreadyExists", new Object[] { str1 });
/* 330:    */     }
/* 331:301 */     if (str1.length() > 16) {
/* 332:302 */       throw new SyntaxErrorException("commands.scoreboard.teams.add.tooLong", new Object[] { str1, Integer.valueOf(16) });
/* 333:    */     }
/* 334:304 */     if (str1.length() == 0) {
/* 335:305 */       throw new WrongUsageException("commands.scoreboard.teams.add.usage", new Object[0]);
/* 336:    */     }
/* 337:308 */     if (paramArrayOfString.length > paramInt)
/* 338:    */     {
/* 339:309 */       String str2 = a(paramae, paramArrayOfString, paramInt).c();
/* 340:310 */       if (str2.length() > 32) {
/* 341:311 */         throw new SyntaxErrorException("commands.scoreboard.teams.add.displayTooLong", new Object[] { str2, Integer.valueOf(32) });
/* 342:    */       }
/* 343:313 */       if (str2.length() > 0) {
/* 344:314 */         localbsd.e(str1).a(str2);
/* 345:    */       } else {
/* 346:316 */         localbsd.e(str1);
/* 347:    */       }
/* 348:    */     }
/* 349:    */     else
/* 350:    */     {
/* 351:319 */       localbsd.e(str1);
/* 352:    */     }
/* 353:322 */     a(paramae, this, "commands.scoreboard.teams.add.success", new Object[] { str1 });
/* 354:    */   }
/* 355:    */   
/* 356:    */   protected void d(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 357:    */   {
/* 358:326 */     brz localbrz = e(paramArrayOfString[(paramInt++)]);
/* 359:327 */     if (localbrz == null) {
/* 360:328 */       return;
/* 361:    */     }
/* 362:330 */     String str1 = paramArrayOfString[(paramInt++)].toLowerCase();
/* 363:332 */     if ((!str1.equalsIgnoreCase("color")) && (!str1.equalsIgnoreCase("friendlyfire")) && (!str1.equalsIgnoreCase("seeFriendlyInvisibles")) && (!str1.equalsIgnoreCase("nametagVisibility")) && (!str1.equalsIgnoreCase("deathMessageVisibility"))) {
/* 364:333 */       throw new WrongUsageException("commands.scoreboard.teams.option.usage", new Object[0]);
/* 365:    */     }
/* 366:336 */     if (paramArrayOfString.length == 4)
/* 367:    */     {
/* 368:337 */       if (str1.equalsIgnoreCase("color")) {
/* 369:338 */         throw new WrongUsageException("commands.scoreboard.teams.option.noValue", new Object[] { str1, a(a.a(true, false)) });
/* 370:    */       }
/* 371:339 */       if ((str1.equalsIgnoreCase("friendlyfire")) || (str1.equalsIgnoreCase("seeFriendlyInvisibles"))) {
/* 372:340 */         throw new WrongUsageException("commands.scoreboard.teams.option.noValue", new Object[] { str1, a(Arrays.asList(new String[] { "true", "false" })) });
/* 373:    */       }
/* 374:341 */       if ((str1.equalsIgnoreCase("nametagVisibility")) || (str1.equalsIgnoreCase("deathMessageVisibility"))) {
/* 375:342 */         throw new WrongUsageException("commands.scoreboard.teams.option.noValue", new Object[] { str1, a(bsg.a()) });
/* 376:    */       }
/* 377:345 */       throw new WrongUsageException("commands.scoreboard.teams.option.usage", new Object[0]);
/* 378:    */     }
/* 379:348 */     String str2 = paramArrayOfString[paramInt];
/* 380:    */     Object localObject;
/* 381:350 */     if (str1.equalsIgnoreCase("color"))
/* 382:    */     {
/* 383:351 */       localObject = a.b(str2);
/* 384:352 */       if ((localObject == null) || (((a)localObject).c())) {
/* 385:353 */         throw new WrongUsageException("commands.scoreboard.teams.option.noValue", new Object[] { str1, a(a.a(true, false)) });
/* 386:    */       }
/* 387:355 */       localbrz.a((a)localObject);
/* 388:356 */       localbrz.b(((a)localObject).toString());
/* 389:357 */       localbrz.c(a.v.toString());
/* 390:    */     }
/* 391:358 */     else if (str1.equalsIgnoreCase("friendlyfire"))
/* 392:    */     {
/* 393:359 */       if ((!str2.equalsIgnoreCase("true")) && (!str2.equalsIgnoreCase("false"))) {
/* 394:360 */         throw new WrongUsageException("commands.scoreboard.teams.option.noValue", new Object[] { str1, a(Arrays.asList(new String[] { "true", "false" })) });
/* 395:    */       }
/* 396:362 */       localbrz.a(str2.equalsIgnoreCase("true"));
/* 397:    */     }
/* 398:363 */     else if (str1.equalsIgnoreCase("seeFriendlyInvisibles"))
/* 399:    */     {
/* 400:364 */       if ((!str2.equalsIgnoreCase("true")) && (!str2.equalsIgnoreCase("false"))) {
/* 401:365 */         throw new WrongUsageException("commands.scoreboard.teams.option.noValue", new Object[] { str1, a(Arrays.asList(new String[] { "true", "false" })) });
/* 402:    */       }
/* 403:367 */       localbrz.b(str2.equalsIgnoreCase("true"));
/* 404:    */     }
/* 405:368 */     else if (str1.equalsIgnoreCase("nametagVisibility"))
/* 406:    */     {
/* 407:369 */       localObject = bsg.a(str2);
/* 408:370 */       if (localObject == null) {
/* 409:371 */         throw new WrongUsageException("commands.scoreboard.teams.option.noValue", new Object[] { str1, a(bsg.a()) });
/* 410:    */       }
/* 411:373 */       localbrz.a((bsg)localObject);
/* 412:    */     }
/* 413:374 */     else if (str1.equalsIgnoreCase("deathMessageVisibility"))
/* 414:    */     {
/* 415:375 */       localObject = bsg.a(str2);
/* 416:376 */       if (localObject == null) {
/* 417:377 */         throw new WrongUsageException("commands.scoreboard.teams.option.noValue", new Object[] { str1, a(bsg.a()) });
/* 418:    */       }
/* 419:379 */       localbrz.b((bsg)localObject);
/* 420:    */     }
/* 421:382 */     a(paramae, this, "commands.scoreboard.teams.option.success", new Object[] { str1, localbrz.b(), str2 });
/* 422:    */   }
/* 423:    */   
/* 424:    */   protected void e(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 425:    */   {
/* 426:386 */     bsd localbsd = d();
/* 427:387 */     brz localbrz = e(paramArrayOfString[paramInt]);
/* 428:388 */     if (localbrz == null) {
/* 429:389 */       return;
/* 430:    */     }
/* 431:392 */     localbsd.d(localbrz);
/* 432:393 */     a(paramae, this, "commands.scoreboard.teams.remove.success", new Object[] { localbrz.b() });
/* 433:    */   }
/* 434:    */   
/* 435:    */   protected void f(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 436:    */   {
/* 437:397 */     bsd localbsd = d();
/* 438:    */     Object localObject1;
/* 439:    */     Object localObject2;
/* 440:    */     Object localObject3;
/* 441:399 */     if (paramArrayOfString.length > paramInt)
/* 442:    */     {
/* 443:400 */       localObject1 = e(paramArrayOfString[paramInt]);
/* 444:401 */       if (localObject1 == null) {
/* 445:402 */         return;
/* 446:    */       }
/* 447:405 */       localObject2 = ((brz)localObject1).d();
/* 448:406 */       paramae.a(ag.e, ((Collection)localObject2).size());
/* 449:407 */       if (((Collection)localObject2).size() > 0)
/* 450:    */       {
/* 451:408 */         localObject3 = new hz("commands.scoreboard.teams.list.player.count", new Object[] { Integer.valueOf(((Collection)localObject2).size()), ((brz)localObject1).b() });
/* 452:409 */         ((hz)localObject3).b().a(a.c);
/* 453:410 */         paramae.a((ho)localObject3);
/* 454:411 */         paramae.a(new hy(a(((Collection)localObject2).toArray())));
/* 455:    */       }
/* 456:    */       else
/* 457:    */       {
/* 458:413 */         throw new CommandException("commands.scoreboard.teams.list.player.empty", new Object[] { ((brz)localObject1).b() });
/* 459:    */       }
/* 460:    */     }
/* 461:    */     else
/* 462:    */     {
/* 463:416 */       localObject1 = localbsd.g();
/* 464:    */       
/* 465:418 */       paramae.a(ag.e, ((Collection)localObject1).size());
/* 466:419 */       if (((Collection)localObject1).size() > 0)
/* 467:    */       {
/* 468:420 */         localObject2 = new hz("commands.scoreboard.teams.list.count", new Object[] { Integer.valueOf(((Collection)localObject1).size()) });
/* 469:421 */         ((hz)localObject2).b().a(a.c);
/* 470:422 */         paramae.a((ho)localObject2);
/* 471:424 */         for (localObject3 = ((Collection)localObject1).iterator(); ((Iterator)localObject3).hasNext();)
/* 472:    */         {
/* 473:424 */           brz localbrz = (brz)((Iterator)localObject3).next();
/* 474:425 */           paramae.a(new hz("commands.scoreboard.teams.list.entry", new Object[] { localbrz.b(), localbrz.c(), Integer.valueOf(localbrz.d().size()) }));
/* 475:    */         }
/* 476:    */       }
/* 477:    */       else
/* 478:    */       {
/* 479:428 */         throw new CommandException("commands.scoreboard.teams.list.empty", new Object[0]);
/* 480:    */       }
/* 481:    */     }
/* 482:    */   }
/* 483:    */   
/* 484:    */   protected void g(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 485:    */   {
/* 486:434 */     bsd localbsd = d();
/* 487:435 */     String str1 = paramArrayOfString[(paramInt++)];
/* 488:436 */     HashSet localHashSet1 = Sets.newHashSet();
/* 489:437 */     HashSet localHashSet2 = Sets.newHashSet();
/* 490:    */     String str2;
/* 491:439 */     if (((paramae instanceof EntityPlayer)) && (paramInt == paramArrayOfString.length))
/* 492:    */     {
/* 493:440 */       str2 = b(paramae).getName();
/* 494:442 */       if (localbsd.a(str2, str1)) {
/* 495:443 */         localHashSet1.add(str2);
/* 496:    */       } else {
/* 497:445 */         localHashSet2.add(str2);
/* 498:    */       }
/* 499:    */     }
/* 500:    */     else
/* 501:    */     {
/* 502:448 */       while (paramInt < paramArrayOfString.length)
/* 503:    */       {
/* 504:449 */         str2 = paramArrayOfString[(paramInt++)];
/* 505:    */         Object localObject;
/* 506:450 */         if (str2.startsWith("@"))
/* 507:    */         {
/* 508:451 */           List<Entity> localObject1 = c(paramae, str2);
/* 509:452 */           for (Entity localwv : localObject1)
/* 510:    */           {
/* 511:453 */             String str3 = e(paramae, localwv.getUUID().toString());
/* 512:454 */             if (localbsd.a(str3, str1)) {
/* 513:455 */               localHashSet1.add(str3);
/* 514:    */             } else {
/* 515:457 */               localHashSet2.add(str3);
/* 516:    */             }
/* 517:    */           }
/* 518:    */         }
/* 519:    */         else
/* 520:    */         {
/* 521:461 */           localObject = e(paramae, str2);
/* 522:462 */           if (localbsd.a((String)localObject, str1)) {
/* 523:463 */             localHashSet1.add(localObject);
/* 524:    */           } else {
/* 525:465 */             localHashSet2.add(localObject);
/* 526:    */           }
/* 527:    */         }
/* 528:    */       }
/* 529:    */     }
/* 530:471 */     if (!localHashSet1.isEmpty())
/* 531:    */     {
/* 532:472 */       paramae.a(ag.c, localHashSet1.size());
/* 533:473 */       a(paramae, this, "commands.scoreboard.teams.join.success", new Object[] { Integer.valueOf(localHashSet1.size()), str1, a(localHashSet1.toArray(new String[0])) });
/* 534:    */     }
/* 535:475 */     if (!localHashSet2.isEmpty()) {
/* 536:476 */       throw new CommandException("commands.scoreboard.teams.join.failure", new Object[] { Integer.valueOf(localHashSet2.size()), str1, a(localHashSet2.toArray(new String[0])) });
/* 537:    */     }
/* 538:    */   }
/* 539:    */   
/* 540:    */   protected void h(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 541:    */   {
/* 542:481 */     bsd localbsd = d();
/* 543:482 */     HashSet localHashSet1 = Sets.newHashSet();
/* 544:483 */     HashSet localHashSet2 = Sets.newHashSet();
/* 545:    */     String str1;
/* 546:485 */     if (((paramae instanceof EntityPlayer)) && (paramInt == paramArrayOfString.length))
/* 547:    */     {
/* 548:486 */       str1 = b(paramae).getName();
/* 549:488 */       if (localbsd.f(str1)) {
/* 550:489 */         localHashSet1.add(str1);
/* 551:    */       } else {
/* 552:491 */         localHashSet2.add(str1);
/* 553:    */       }
/* 554:    */     }
/* 555:    */     else
/* 556:    */     {
/* 557:494 */       while (paramInt < paramArrayOfString.length)
/* 558:    */       {
/* 559:495 */         str1 = paramArrayOfString[(paramInt++)];
/* 560:    */         
/* 561:496 */         if (str1.startsWith("@"))
/* 562:    */         {
/* 563:497 */           List<Entity> localObject = c(paramae, str1);
/* 564:498 */           for (Entity localwv : localObject)
/* 565:    */           {
/* 566:499 */             String str2 = e(paramae, localwv.getUUID().toString());
/* 567:500 */             if (localbsd.f(str2)) {
/* 568:501 */               localHashSet1.add(str2);
/* 569:    */             } else {
/* 570:503 */               localHashSet2.add(str2);
/* 571:    */             }
/* 572:    */           }
/* 573:    */         }
/* 574:    */         else
/* 575:    */         {
/* 576:507 */           String localObject = e(paramae, str1);
/* 577:508 */           if (localbsd.f((String)localObject)) {
/* 578:509 */             localHashSet1.add(localObject);
/* 579:    */           } else {
/* 580:511 */             localHashSet2.add(localObject);
/* 581:    */           }
/* 582:    */         }
/* 583:    */       }
/* 584:    */     }
/* 585:517 */     if (!localHashSet1.isEmpty())
/* 586:    */     {
/* 587:518 */       paramae.a(ag.c, localHashSet1.size());
/* 588:519 */       a(paramae, this, "commands.scoreboard.teams.leave.success", new Object[] { Integer.valueOf(localHashSet1.size()), a(localHashSet1.toArray(new String[0])) });
/* 589:    */     }
/* 590:521 */     if (!localHashSet2.isEmpty()) {
/* 591:522 */       throw new CommandException("commands.scoreboard.teams.leave.failure", new Object[] { Integer.valueOf(localHashSet2.size()), a(localHashSet2.toArray(new String[0])) });
/* 592:    */     }
/* 593:    */   }
/* 594:    */   
/* 595:    */   protected void i(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 596:    */   {
/* 597:527 */     bsd localbsd = d();
/* 598:528 */     brz localbrz = e(paramArrayOfString[paramInt]);
/* 599:529 */     if (localbrz == null) {
/* 600:530 */       return;
/* 601:    */     }
/* 602:533 */     ArrayList<String> localArrayList = Lists.newArrayList(localbrz.d());
/* 603:534 */     paramae.a(ag.c, localArrayList.size());
/* 604:535 */     if (localArrayList.isEmpty()) {
/* 605:536 */       throw new CommandException("commands.scoreboard.teams.empty.alreadyEmpty", new Object[] { localbrz.b() });
/* 606:    */     }
/* 607:539 */     for (String str : localArrayList) {
/* 608:540 */       localbsd.a(str, localbrz);
/* 609:    */     }
/* 610:543 */     a(paramae, this, "commands.scoreboard.teams.empty.success", new Object[] { Integer.valueOf(localArrayList.size()), localbrz.b() });
/* 611:    */   }
/* 612:    */   
/* 613:    */   protected void h(ICommandSender paramae, String paramString) throws CommandException
/* 614:    */   {
/* 615:547 */     bsd localbsd = d();
/* 616:548 */     bry localbry = a(paramString, false);
/* 617:    */     
/* 618:550 */     localbsd.k(localbry);
/* 619:    */     
/* 620:552 */     a(paramae, this, "commands.scoreboard.objectives.remove.success", new Object[] { paramString });
/* 621:    */   }
/* 622:    */   
/* 623:    */   protected void d(ICommandSender paramae) throws CommandException
/* 624:    */   {
/* 625:556 */     bsd localbsd = d();
/* 626:557 */     Collection<bry> localCollection = localbsd.c();
/* 627:559 */     if (localCollection.size() > 0)
/* 628:    */     {
/* 629:560 */       hz localhz = new hz("commands.scoreboard.objectives.list.count", new Object[] { Integer.valueOf(localCollection.size()) });
/* 630:561 */       localhz.b().a(a.c);
/* 631:562 */       paramae.a(localhz);
/* 632:564 */       for (bry localbry : localCollection) {
/* 633:565 */         paramae.a(new hz("commands.scoreboard.objectives.list.entry", new Object[] { localbry.b(), localbry.d(), localbry.c().a() }));
/* 634:    */       }
/* 635:    */     }
/* 636:    */     else
/* 637:    */     {
/* 638:568 */       throw new CommandException("commands.scoreboard.objectives.list.empty", new Object[0]);
/* 639:    */     }
/* 640:    */   }
/* 641:    */   
/* 642:    */   protected void j(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 643:    */   {
/* 644:573 */     bsd localbsd = d();
/* 645:574 */     String str = paramArrayOfString[(paramInt++)];
/* 646:575 */     int i = bsd.i(str);
/* 647:576 */     bry localbry = null;
/* 648:578 */     if (paramArrayOfString.length == 4) {
/* 649:579 */       localbry = a(paramArrayOfString[paramInt], false);
/* 650:    */     }
/* 651:582 */     if (i < 0) {
/* 652:583 */       throw new CommandException("commands.scoreboard.objectives.setdisplay.invalidSlot", new Object[] { str });
/* 653:    */     }
/* 654:586 */     localbsd.a(i, localbry);
/* 655:588 */     if (localbry != null) {
/* 656:589 */       a(paramae, this, "commands.scoreboard.objectives.setdisplay.successSet", new Object[] { bsd.b(i), localbry.b() });
/* 657:    */     } else {
/* 658:591 */       a(paramae, this, "commands.scoreboard.objectives.setdisplay.successCleared", new Object[] { bsd.b(i) });
/* 659:    */     }
/* 660:    */   }
/* 661:    */   
/* 662:    */   protected void k(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 663:    */   {
/* 664:596 */     bsd localbsd = d();
/* 665:    */     Object localObject1;
/* 666:    */     
/* 667:598 */     if (paramArrayOfString.length > paramInt)
/* 668:    */     {
/* 669:599 */       localObject1 = e(paramae, paramArrayOfString[paramInt]);
/* 670:600 */       Map<bry,bsa> localObject2 = localbsd.c((String)localObject1);
/* 671:    */       
/* 672:602 */       paramae.a(ag.e, (localObject2).size());
/* 673:603 */       if ((localObject2).size() > 0)
/* 674:    */       {
/* 675:604 */         hz localhz = new hz("commands.scoreboard.players.list.player.count", new Object[] { Integer.valueOf(((Map)localObject2).size()), localObject1 });
/* 676:605 */         localhz.b().a(a.c);
/* 677:606 */         paramae.a(localhz);
/* 678:608 */         for (bsa localbsa : (localObject2).values()) {
/* 679:609 */           paramae.a(new hz("commands.scoreboard.players.list.player.entry", new Object[] { Integer.valueOf(localbsa.c()), localbsa.d().d(), localbsa.d().b() }));
/* 680:    */         }
/* 681:    */       }
/* 682:    */       else
/* 683:    */       {
/* 684:612 */         throw new CommandException("commands.scoreboard.players.list.player.empty", new Object[] { localObject1 });
/* 685:    */       }
/* 686:    */     }
/* 687:    */     else
/* 688:    */     {
/* 689:615 */       localObject1 = localbsd.d();
/* 690:    */       
/* 691:617 */       paramae.a(ag.e, ((Collection)localObject1).size());
/* 692:618 */       if (((Collection)localObject1).size() > 0)
/* 693:    */       {
/* 694:619 */         ho localObject2 = new hz("commands.scoreboard.players.list.count", new Object[] { Integer.valueOf(((Collection)localObject1).size()) });
/* 695:620 */         ((hz)localObject2).b().a(a.c);
/* 696:621 */         paramae.a((ho)localObject2);
/* 697:622 */         paramae.a(new hy(a(((Collection)localObject1).toArray())));
/* 698:    */       }
/* 699:    */       else
/* 700:    */       {
/* 701:624 */         throw new CommandException("commands.scoreboard.players.list.empty", new Object[0]);
/* 702:    */       }
/* 703:    */     }
/* 704:    */   }
/* 705:    */   
/* 706:    */   protected void l(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 707:    */   {
/* 708:630 */     String str1 = paramArrayOfString[(paramInt - 1)];
/* 709:631 */     int i = paramInt;
/* 710:632 */     String str2 = e(paramae, paramArrayOfString[(paramInt++)]);
/* 711:633 */     bry localbry = a(paramArrayOfString[(paramInt++)], true);
/* 712:634 */     int j = str1.equalsIgnoreCase("set") ? a(paramArrayOfString[(paramInt++)]) : a(paramArrayOfString[(paramInt++)], 0);
/* 713:636 */     if (paramArrayOfString.length > paramInt)
/* 714:    */     {
/* 715:637 */       Entity localObject = b(paramae, paramArrayOfString[i]);
/* 716:    */       try
/* 717:    */       {
/* 718:639 */         NBTTagCompound localfn1 = gg.a(a(paramArrayOfString, paramInt));
/* 719:640 */         NBTTagCompound localfn2 = new NBTTagCompound();
/* 720:641 */         ((Entity)localObject).e(localfn2);
/* 721:642 */         if (!cy.a(localfn1, localfn2, true)) {
/* 722:643 */           throw new CommandException("commands.scoreboard.players.set.tagMismatch", new Object[] { str2 });
/* 723:    */         }
/* 724:    */       }
/* 725:    */       catch (gf localgf)
/* 726:    */       {
/* 727:646 */         throw new CommandException("commands.scoreboard.players.set.tagError", new Object[] { localgf.getMessage() });
/* 728:    */       }
/* 729:    */     }
/* 730:650 */     Object localObject = d();
/* 731:651 */     bsa localbsa = ((bsd)localObject).c(str2, localbry);
/* 732:652 */     if (str1.equalsIgnoreCase("set")) {
/* 733:653 */       localbsa.c(j);
/* 734:654 */     } else if (str1.equalsIgnoreCase("add")) {
/* 735:655 */       localbsa.a(j);
/* 736:    */     } else {
/* 737:657 */       localbsa.b(j);
/* 738:    */     }
/* 739:660 */     a(paramae, this, "commands.scoreboard.players.set.success", new Object[] { localbry.b(), str2, Integer.valueOf(localbsa.c()) });
/* 740:    */   }
/* 741:    */   
/* 742:    */   protected void m(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 743:    */   {
/* 744:664 */     bsd localbsd = d();
/* 745:665 */     String str = e(paramae, paramArrayOfString[(paramInt++)]);
/* 746:667 */     if (paramArrayOfString.length > paramInt)
/* 747:    */     {
/* 748:668 */       bry localbry = a(paramArrayOfString[(paramInt++)], false);
/* 749:669 */       localbsd.d(str, localbry);
/* 750:670 */       a(paramae, this, "commands.scoreboard.players.resetscore.success", new Object[] { localbry.b(), str });
/* 751:    */     }
/* 752:    */     else
/* 753:    */     {
/* 754:672 */       localbsd.d(str, null);
/* 755:673 */       a(paramae, this, "commands.scoreboard.players.reset.success", new Object[] { str });
/* 756:    */     }
/* 757:    */   }
/* 758:    */   
/* 759:    */   protected void n(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 760:    */   {
/* 761:678 */     bsd localbsd = d();
/* 762:679 */     String str = d(paramae, paramArrayOfString[(paramInt++)]);
/* 763:680 */     bry localbry = a(paramArrayOfString[paramInt], false);
/* 764:681 */     if (localbry.c() != bsk.c) {
/* 765:682 */       throw new CommandException("commands.scoreboard.players.enable.noTrigger", new Object[] { localbry.b() });
/* 766:    */     }
/* 767:684 */     bsa localbsa = localbsd.c(str, localbry);
/* 768:685 */     localbsa.a(false);
/* 769:686 */     a(paramae, this, "commands.scoreboard.players.enable.success", new Object[] { localbry.b(), str });
/* 770:    */   }
/* 771:    */   
/* 772:    */   protected void o(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 773:    */   {
/* 774:690 */     bsd localbsd = d();
/* 775:691 */     String str = e(paramae, paramArrayOfString[(paramInt++)]);
/* 776:692 */     bry localbry = a(paramArrayOfString[(paramInt++)], false);
/* 777:693 */     if (!localbsd.b(str, localbry)) {
/* 778:694 */       throw new CommandException("commands.scoreboard.players.test.notFound", new Object[] { localbry.b(), str });
/* 779:    */     }
/* 780:697 */     int i = paramArrayOfString[paramInt].equals("*") ? -2147483648 : a(paramArrayOfString[paramInt]);
/* 781:698 */     paramInt++;
/* 782:699 */     int j = (paramInt >= paramArrayOfString.length) || (paramArrayOfString[paramInt].equals("*")) ? 2147483647 : a(paramArrayOfString[paramInt], i);
/* 783:    */     
/* 784:701 */     bsa localbsa = localbsd.c(str, localbry);
/* 785:702 */     if ((localbsa.c() < i) || (localbsa.c() > j)) {
/* 786:703 */       throw new CommandException("commands.scoreboard.players.test.failed", new Object[] { Integer.valueOf(localbsa.c()), Integer.valueOf(i), Integer.valueOf(j) });
/* 787:    */     }
/* 788:705 */     a(paramae, this, "commands.scoreboard.players.test.success", new Object[] { Integer.valueOf(localbsa.c()), Integer.valueOf(i), Integer.valueOf(j) });
/* 789:    */   }
/* 790:    */   
/* 791:    */   protected void p(ICommandSender paramae, String[] paramArrayOfString, int paramInt) throws CommandException
/* 792:    */   {
/* 793:709 */     bsd localbsd = d();
/* 794:710 */     String str1 = e(paramae, paramArrayOfString[(paramInt++)]);
/* 795:711 */     bry localbry1 = a(paramArrayOfString[(paramInt++)], true);
/* 796:    */     
/* 797:713 */     String str2 = paramArrayOfString[(paramInt++)];
/* 798:714 */     String str3 = e(paramae, paramArrayOfString[(paramInt++)]);
/* 799:715 */     bry localbry2 = a(paramArrayOfString[paramInt], false);
/* 800:    */     
/* 801:717 */     bsa localbsa1 = localbsd.c(str1, localbry1);
/* 802:718 */     if (!localbsd.b(str3, localbry2)) {
/* 803:719 */       throw new CommandException("commands.scoreboard.players.operation.notFound", new Object[] { localbry2.b(), str3 });
/* 804:    */     }
/* 805:721 */     bsa localbsa2 = localbsd.c(str3, localbry2);
/* 806:723 */     if (str2.equals("+="))
/* 807:    */     {
/* 808:724 */       localbsa1.c(localbsa1.c() + localbsa2.c());
/* 809:    */     }
/* 810:725 */     else if (str2.equals("-="))
/* 811:    */     {
/* 812:726 */       localbsa1.c(localbsa1.c() - localbsa2.c());
/* 813:    */     }
/* 814:727 */     else if (str2.equals("*="))
/* 815:    */     {
/* 816:728 */       localbsa1.c(localbsa1.c() * localbsa2.c());
/* 817:    */     }
/* 818:729 */     else if (str2.equals("/="))
/* 819:    */     {
/* 820:730 */       if (localbsa2.c() != 0) {
/* 821:731 */         localbsa1.c(localbsa1.c() / localbsa2.c());
/* 822:    */       }
/* 823:    */     }
/* 824:733 */     else if (str2.equals("%="))
/* 825:    */     {
/* 826:734 */       if (localbsa2.c() != 0) {
/* 827:735 */         localbsa1.c(localbsa1.c() % localbsa2.c());
/* 828:    */       }
/* 829:    */     }
/* 830:737 */     else if (str2.equals("="))
/* 831:    */     {
/* 832:738 */       localbsa1.c(localbsa2.c());
/* 833:    */     }
/* 834:739 */     else if (str2.equals("<"))
/* 835:    */     {
/* 836:740 */       localbsa1.c(Math.min(localbsa1.c(), localbsa2.c()));
/* 837:    */     }
/* 838:741 */     else if (str2.equals(">"))
/* 839:    */     {
/* 840:742 */       localbsa1.c(Math.max(localbsa1.c(), localbsa2.c()));
/* 841:    */     }
/* 842:743 */     else if (str2.equals("><"))
/* 843:    */     {
/* 844:744 */       int i = localbsa1.c();
/* 845:745 */       localbsa1.c(localbsa2.c());
/* 846:746 */       localbsa2.c(i);
/* 847:    */     }
/* 848:    */     else
/* 849:    */     {
/* 850:748 */       throw new CommandException("commands.scoreboard.players.operation.invalidOperation", new Object[] { str2 });
/* 851:    */     }
/* 852:750 */     a(paramae, this, "commands.scoreboard.players.operation.success", new Object[0]);
/* 853:    */   }
/* 854:    */   
/* 855:    */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 856:    */   {
/* 857:756 */     if (paramArrayOfString.length == 1) {
/* 858:757 */       return a(paramArrayOfString, new String[] { "objectives", "players", "teams" });
/* 859:    */     }
/* 860:760 */     if (paramArrayOfString[0].equalsIgnoreCase("objectives"))
/* 861:    */     {
/* 862:761 */       if (paramArrayOfString.length == 2) {
/* 863:762 */         return a(paramArrayOfString, new String[] { "list", "add", "remove", "setdisplay" });
/* 864:    */       }
/* 865:765 */       if (paramArrayOfString[1].equalsIgnoreCase("add"))
/* 866:    */       {
/* 867:766 */         if (paramArrayOfString.length == 4)
/* 868:    */         {
/* 869:767 */           Set localSet = bsk.a.keySet();
/* 870:768 */           return a(paramArrayOfString, localSet);
/* 871:    */         }
/* 872:    */       }
/* 873:770 */       else if (paramArrayOfString[1].equalsIgnoreCase("remove"))
/* 874:    */       {
/* 875:771 */         if (paramArrayOfString.length == 3) {
/* 876:772 */           return a(paramArrayOfString, a(false));
/* 877:    */         }
/* 878:    */       }
/* 879:774 */       else if (paramArrayOfString[1].equalsIgnoreCase("setdisplay"))
/* 880:    */       {
/* 881:775 */         if (paramArrayOfString.length == 3) {
/* 882:776 */           return a(paramArrayOfString, bsd.h());
/* 883:    */         }
/* 884:777 */         if (paramArrayOfString.length == 4) {
/* 885:778 */           return a(paramArrayOfString, a(false));
/* 886:    */         }
/* 887:    */       }
/* 888:    */     }
/* 889:781 */     else if (paramArrayOfString[0].equalsIgnoreCase("players"))
/* 890:    */     {
/* 891:782 */       if (paramArrayOfString.length == 2) {
/* 892:783 */         return a(paramArrayOfString, new String[] { "set", "add", "remove", "reset", "list", "enable", "test", "operation" });
/* 893:    */       }
/* 894:786 */       if ((paramArrayOfString[1].equalsIgnoreCase("set")) || (paramArrayOfString[1].equalsIgnoreCase("add")) || (paramArrayOfString[1].equalsIgnoreCase("remove")) || (paramArrayOfString[1].equalsIgnoreCase("reset")))
/* 895:    */       {
/* 896:787 */         if (paramArrayOfString.length == 3) {
/* 897:788 */           return a(paramArrayOfString, MinecraftServer.M().I());
/* 898:    */         }
/* 899:789 */         if (paramArrayOfString.length == 4) {
/* 900:790 */           return a(paramArrayOfString, a(true));
/* 901:    */         }
/* 902:    */       }
/* 903:792 */       else if (paramArrayOfString[1].equalsIgnoreCase("enable"))
/* 904:    */       {
/* 905:793 */         if (paramArrayOfString.length == 3) {
/* 906:794 */           return a(paramArrayOfString, MinecraftServer.M().I());
/* 907:    */         }
/* 908:795 */         if (paramArrayOfString.length == 4) {
/* 909:796 */           return a(paramArrayOfString, e());
/* 910:    */         }
/* 911:    */       }
/* 912:798 */       else if ((paramArrayOfString[1].equalsIgnoreCase("list")) || (paramArrayOfString[1].equalsIgnoreCase("test")))
/* 913:    */       {
/* 914:799 */         if (paramArrayOfString.length == 3) {
/* 915:800 */           return a(paramArrayOfString, d().d());
/* 916:    */         }
/* 917:801 */         if ((paramArrayOfString.length == 4) && (paramArrayOfString[1].equalsIgnoreCase("test"))) {
/* 918:802 */           return a(paramArrayOfString, a(false));
/* 919:    */         }
/* 920:    */       }
/* 921:804 */       else if (paramArrayOfString[1].equalsIgnoreCase("operation"))
/* 922:    */       {
/* 923:805 */         if (paramArrayOfString.length == 3) {
/* 924:806 */           return a(paramArrayOfString, d().d());
/* 925:    */         }
/* 926:807 */         if (paramArrayOfString.length == 4) {
/* 927:808 */           return a(paramArrayOfString, a(true));
/* 928:    */         }
/* 929:809 */         if (paramArrayOfString.length == 5) {
/* 930:810 */           return a(paramArrayOfString, new String[] { "+=", "-=", "*=", "/=", "%=", "=", "<", ">", "><" });
/* 931:    */         }
/* 932:811 */         if (paramArrayOfString.length == 6) {
/* 933:812 */           return a(paramArrayOfString, MinecraftServer.M().I());
/* 934:    */         }
/* 935:813 */         if (paramArrayOfString.length == 7) {
/* 936:814 */           return a(paramArrayOfString, a(false));
/* 937:    */         }
/* 938:    */       }
/* 939:    */     }
/* 940:817 */     else if (paramArrayOfString[0].equalsIgnoreCase("teams"))
/* 941:    */     {
/* 942:818 */       if (paramArrayOfString.length == 2) {
/* 943:819 */         return a(paramArrayOfString, new String[] { "add", "remove", "join", "leave", "empty", "list", "option" });
/* 944:    */       }
/* 945:822 */       if (paramArrayOfString[1].equalsIgnoreCase("join"))
/* 946:    */       {
/* 947:823 */         if (paramArrayOfString.length == 3) {
/* 948:824 */           return a(paramArrayOfString, d().f());
/* 949:    */         }
/* 950:825 */         if (paramArrayOfString.length >= 4) {
/* 951:826 */           return a(paramArrayOfString, MinecraftServer.M().I());
/* 952:    */         }
/* 953:    */       }
/* 954:    */       else
/* 955:    */       {
/* 956:828 */         if (paramArrayOfString[1].equalsIgnoreCase("leave")) {
/* 957:829 */           return a(paramArrayOfString, MinecraftServer.M().I());
/* 958:    */         }
/* 959:830 */         if ((paramArrayOfString[1].equalsIgnoreCase("empty")) || (paramArrayOfString[1].equalsIgnoreCase("list")) || (paramArrayOfString[1].equalsIgnoreCase("remove")))
/* 960:    */         {
/* 961:831 */           if (paramArrayOfString.length == 3) {
/* 962:832 */             return a(paramArrayOfString, d().f());
/* 963:    */           }
/* 964:    */         }
/* 965:834 */         else if (paramArrayOfString[1].equalsIgnoreCase("option"))
/* 966:    */         {
/* 967:835 */           if (paramArrayOfString.length == 3) {
/* 968:836 */             return a(paramArrayOfString, d().f());
/* 969:    */           }
/* 970:837 */           if (paramArrayOfString.length == 4) {
/* 971:838 */             return a(paramArrayOfString, new String[] { "color", "friendlyfire", "seeFriendlyInvisibles", "nametagVisibility", "deathMessageVisibility" });
/* 972:    */           }
/* 973:839 */           if (paramArrayOfString.length == 5)
/* 974:    */           {
/* 975:840 */             if (paramArrayOfString[3].equalsIgnoreCase("color")) {
/* 976:841 */               return a(paramArrayOfString, a.a(true, false));
/* 977:    */             }
/* 978:842 */             if ((paramArrayOfString[3].equalsIgnoreCase("nametagVisibility")) || (paramArrayOfString[3].equalsIgnoreCase("deathMessageVisibility"))) {
/* 979:843 */               return a(paramArrayOfString, bsg.a());
/* 980:    */             }
/* 981:844 */             if ((paramArrayOfString[3].equalsIgnoreCase("friendlyfire")) || (paramArrayOfString[3].equalsIgnoreCase("seeFriendlyInvisibles"))) {
/* 982:845 */               return a(paramArrayOfString, new String[] { "true", "false" });
/* 983:    */             }
/* 984:    */           }
/* 985:    */         }
/* 986:    */       }
/* 987:    */     }
/* 988:851 */     return null;
/* 989:    */   }
/* 990:    */   
/* 991:    */   protected List a(boolean paramBoolean)
/* 992:    */   {
/* 993:855 */     Collection<bry> localCollection = d().c();
/* 994:856 */     ArrayList localArrayList = Lists.newArrayList();
/* 995:858 */     for (bry localbry : localCollection) {
/* 996:859 */       if ((!paramBoolean) || (!localbry.c().b())) {
/* 997:860 */         localArrayList.add(localbry.b());
/* 998:    */       }
/* 999:    */     }
/* :00:864 */     return localArrayList;
/* :01:    */   }
/* :02:    */   
/* :03:    */   protected List e()
/* :04:    */   {
/* :05:868 */     Collection<bry> localCollection = d().c();
/* :06:869 */     ArrayList localArrayList = Lists.newArrayList();
/* :07:871 */     for (bry localbry : localCollection) {
/* :08:872 */       if (localbry.c() == bsk.c) {
/* :09:873 */         localArrayList.add(localbry.b());
/* :10:    */       }
/* :11:    */     }
/* :12:877 */     return localArrayList;
/* :13:    */   }
/* :14:    */   
/* :15:    */   public boolean b(String[] paramArrayOfString, int paramInt)
/* :16:    */   {
/* :17:882 */     if (paramArrayOfString[0].equalsIgnoreCase("players"))
/* :18:    */     {
/* :19:883 */       if ((paramArrayOfString.length > 1) && (paramArrayOfString[1].equalsIgnoreCase("operation"))) {
/* :20:884 */         return (paramInt == 2) || (paramInt == 5);
/* :21:    */       }
/* :22:886 */       return paramInt == 2;
/* :23:    */     }
/* :24:887 */     if (paramArrayOfString[0].equalsIgnoreCase("teams")) {
/* :25:888 */       return paramInt == 2;
/* :26:    */     }
/* :27:891 */     return false;
/* :28:    */   }
/* :29:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ck
 * JD-Core Version:    0.7.0.1
 */
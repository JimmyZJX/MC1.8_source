package net.minecraft.src;
/*   1:    */ import net.minecraft.server.MinecraftServer;
/*   2:    */ 
/*   3:    */ public class WorldInfo
/*   4:    */ {
/*   5: 17 */   public static final EnumDifficulty a = EnumDifficulty.NORMAL;
/*   6:    */   private long randomSeed;
/*   7: 19 */   private WorldType terrainType = WorldType.DEFAULT;
/*   8: 20 */   private String generatorOptions = "";
/*   9:    */   private int spawnX;
/*  10:    */   private int spawnY;
/*  11:    */   private int spawnZ;
/*  12:    */   private long worldTime;
/*  13:    */   private long dayTime;
/*  14:    */   private long lastTimePlayed;
/*  15:    */   private long sizeOnDisk;
/*  16:    */   private NBTTagCompound playerTag;
/*  17:    */   private int dimension;
/*  18:    */   private String levelName;
/*  19:    */   private int saveVersion;
/*  20:    */   private int clearWeatherTime;
/*  21:    */   private boolean raining;
/*  22:    */   private int rainTime;
/*  23:    */   private boolean thundering;
/*  24:    */   private int thunderTime;
/*  25:    */   private EnumGameType gameType;
/*  26:    */   private boolean mapFeaturesEnabled;
/*  27:    */   private boolean hardcore;
/*  28:    */   private boolean allowCommands;
/*  29:    */   private boolean initialized;
/*  30:    */   private EnumDifficulty difficulty;
/*  31:    */   private boolean difficultyLocked;
/*  32: 46 */   private double borderCenterX = 0.0D;
/*  33: 47 */   private double borderCenterZ = 0.0D;
/*  34: 48 */   private double borderSize = 60000000.0D;
/*  35: 49 */   private long borderSizeLerpTime = 0L;
/*  36: 50 */   private double borderSizeLerpTarget = 0.0D;
/*  37: 51 */   private double borderSafeZone = 5.0D;
/*  38: 52 */   private double borderDamagePerBlock = 0.2D;
/*  39: 53 */   private int borderWarningBlocks = 5;
/*  40: 54 */   private int borderWarningTime = 15;
/*  41: 56 */   private GameRules gameRules = new GameRules();
/*  42:    */   
/*  43:    */   protected WorldInfo() {}
/*  44:    */   
/*  45:    */   public WorldInfo(NBTTagCompound tag)
/*  46:    */   {
/*  47: 62 */     this.randomSeed = tag.getLong("RandomSeed");
/*  48: 63 */     if (tag.hasKey("generatorName", 8))
/*  49:    */     {
/*  50: 64 */       String str = tag.getString("generatorName");
/*  51: 65 */       this.terrainType = WorldType.parseWorldType(str);
/*  52: 66 */       if (this.terrainType == null)
/*  53:    */       {
/*  54: 67 */         this.terrainType = WorldType.DEFAULT;
/*  55:    */       }
/*  56: 68 */       else if (this.terrainType.isVersioned())
/*  57:    */       {
/*  58: 69 */         int version = 0;
/*  59: 70 */         if (tag.hasKey("generatorVersion", 99)) {
/*  60: 71 */           version = tag.getInteger("generatorVersion");
/*  61:    */         }
/*  62: 73 */         this.terrainType = this.terrainType.a(version);
/*  63:    */       }
/*  64: 76 */       if (tag.hasKey("generatorOptions", 8)) {
/*  65: 77 */         this.generatorOptions = tag.getString("generatorOptions");
/*  66:    */       }
/*  67:    */     }
/*  68: 80 */     this.gameType = EnumGameType.a(tag.getInteger("GameType"));
/*  69: 81 */     if (tag.hasKey("MapFeatures", 99)) {
/*  70: 82 */       this.mapFeaturesEnabled = tag.getBoolean("MapFeatures");
/*  71:    */     } else {
/*  72: 84 */       this.mapFeaturesEnabled = true;
/*  73:    */     }
/*  74: 86 */     this.spawnX = tag.getInteger("SpawnX");
/*  75: 87 */     this.spawnY = tag.getInteger("SpawnY");
/*  76: 88 */     this.spawnZ = tag.getInteger("SpawnZ");
/*  77: 89 */     this.worldTime = tag.getLong("Time");
/*  78: 90 */     if (tag.hasKey("DayTime", 99)) {
/*  79: 91 */       this.dayTime = tag.getLong("DayTime");
/*  80:    */     } else {
/*  81: 93 */       this.dayTime = this.worldTime;
/*  82:    */     }
/*  83: 95 */     this.lastTimePlayed = tag.getLong("LastPlayed");
/*  84: 96 */     this.sizeOnDisk = tag.getLong("SizeOnDisk");
/*  85: 97 */     this.levelName = tag.getString("LevelName");
/*  86: 98 */     this.saveVersion = tag.getInteger("version");
/*  87: 99 */     this.clearWeatherTime = tag.getInteger("clearWeatherTime");
/*  88:100 */     this.rainTime = tag.getInteger("rainTime");
/*  89:101 */     this.raining = tag.getBoolean("raining");
/*  90:102 */     this.thunderTime = tag.getInteger("thunderTime");
/*  91:103 */     this.thundering = tag.getBoolean("thundering");
/*  92:104 */     this.hardcore = tag.getBoolean("hardcore");
/*  93:106 */     if (tag.hasKey("initialized", 99)) {
/*  94:107 */       this.initialized = tag.getBoolean("initialized");
/*  95:    */     } else {
/*  96:109 */       this.initialized = true;
/*  97:    */     }
/*  98:112 */     if (tag.hasKey("allowCommands", 99)) {
/*  99:113 */       this.allowCommands = tag.getBoolean("allowCommands");
/* 100:    */     } else {
/* 101:115 */       this.allowCommands = (this.gameType == EnumGameType.CREATIVE);
/* 102:    */     }
/* 103:118 */     if (tag.hasKey("Player", 10))
/* 104:    */     {
/* 105:119 */       this.playerTag = tag.getCompoundTag("Player");
/* 106:120 */       this.dimension = this.playerTag.getInteger("Dimension");
/* 107:    */     }
/* 108:123 */     if (tag.hasKey("GameRules", 10)) {
/* 109:124 */       this.gameRules.a(tag.getCompoundTag("GameRules"));
/* 110:    */     }
/* 111:127 */     if (tag.hasKey("Difficulty", 99)) {
/* 112:128 */       this.difficulty = EnumDifficulty.a(tag.d("Difficulty"));
/* 113:    */     }
/* 114:131 */     if (tag.hasKey("DifficultyLocked", 1)) {
/* 115:132 */       this.difficultyLocked = tag.getBoolean("DifficultyLocked");
/* 116:    */     }
/* 117:135 */     if (tag.hasKey("BorderCenterX", 99)) {
/* 118:136 */       this.borderCenterX = tag.i("BorderCenterX");
/* 119:    */     }
/* 120:139 */     if (tag.hasKey("BorderCenterZ", 99)) {
/* 121:140 */       this.borderCenterZ = tag.i("BorderCenterZ");
/* 122:    */     }
/* 123:143 */     if (tag.hasKey("BorderSize", 99)) {
/* 124:144 */       this.borderSize = tag.i("BorderSize");
/* 125:    */     }
/* 126:147 */     if (tag.hasKey("BorderSizeLerpTime", 99)) {
/* 127:148 */       this.borderSizeLerpTime = tag.getLong("BorderSizeLerpTime");
/* 128:    */     }
/* 129:151 */     if (tag.hasKey("BorderSizeLerpTarget", 99)) {
/* 130:152 */       this.borderSizeLerpTarget = tag.i("BorderSizeLerpTarget");
/* 131:    */     }
/* 132:155 */     if (tag.hasKey("BorderSafeZone", 99)) {
/* 133:156 */       this.borderSafeZone = tag.i("BorderSafeZone");
/* 134:    */     }
/* 135:159 */     if (tag.hasKey("BorderDamagePerBlock", 99)) {
/* 136:160 */       this.borderDamagePerBlock = tag.i("BorderDamagePerBlock");
/* 137:    */     }
/* 138:163 */     if (tag.hasKey("BorderWarningBlocks", 99)) {
/* 139:164 */       this.borderWarningBlocks = tag.getInteger("BorderWarningBlocks");
/* 140:    */     }
/* 141:167 */     if (tag.hasKey("BorderWarningTime", 99)) {
/* 142:168 */       this.borderWarningTime = tag.getInteger("BorderWarningTime");
/* 143:    */     }
/* 144:    */   }
/* 145:    */   
/* 146:    */   public WorldInfo(WorldSettings paramarb, String paramString)
/* 147:    */   {
/* 148:173 */     a(paramarb);
/* 149:174 */     this.levelName = paramString;
/* 150:175 */     this.difficulty = a;
/* 151:176 */     this.initialized = false;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void a(WorldSettings paramarb)
/* 155:    */   {
/* 156:180 */     this.randomSeed = paramarb.getSeed();
/* 157:181 */     this.gameType = paramarb.getGameType();
/* 158:182 */     this.mapFeaturesEnabled = paramarb.g();
/* 159:183 */     this.hardcore = paramarb.f();
/* 160:184 */     this.terrainType = paramarb.h();
/* 161:185 */     this.generatorOptions = paramarb.j();
/* 162:186 */     this.allowCommands = paramarb.i();
/* 163:    */   }
/* 164:    */   
/* 165:    */   public WorldInfo(WorldInfo parambqo)
/* 166:    */   {
/* 167:190 */     this.randomSeed = parambqo.randomSeed;
/* 168:191 */     this.terrainType = parambqo.terrainType;
/* 169:192 */     this.generatorOptions = parambqo.generatorOptions;
/* 170:193 */     this.gameType = parambqo.gameType;
/* 171:194 */     this.mapFeaturesEnabled = parambqo.mapFeaturesEnabled;
/* 172:195 */     this.spawnX = parambqo.spawnX;
/* 173:196 */     this.spawnY = parambqo.spawnY;
/* 174:197 */     this.spawnZ = parambqo.spawnZ;
/* 175:198 */     this.worldTime = parambqo.worldTime;
/* 176:199 */     this.dayTime = parambqo.dayTime;
/* 177:200 */     this.lastTimePlayed = parambqo.lastTimePlayed;
/* 178:201 */     this.sizeOnDisk = parambqo.sizeOnDisk;
/* 179:202 */     this.playerTag = parambqo.playerTag;
/* 180:203 */     this.dimension = parambqo.dimension;
/* 181:204 */     this.levelName = parambqo.levelName;
/* 182:205 */     this.saveVersion = parambqo.saveVersion;
/* 183:206 */     this.rainTime = parambqo.rainTime;
/* 184:207 */     this.raining = parambqo.raining;
/* 185:208 */     this.thunderTime = parambqo.thunderTime;
/* 186:209 */     this.thundering = parambqo.thundering;
/* 187:210 */     this.hardcore = parambqo.hardcore;
/* 188:211 */     this.allowCommands = parambqo.allowCommands;
/* 189:212 */     this.initialized = parambqo.initialized;
/* 190:213 */     this.gameRules = parambqo.gameRules;
/* 191:214 */     this.difficulty = parambqo.difficulty;
/* 192:215 */     this.difficultyLocked = parambqo.difficultyLocked;
/* 193:216 */     this.borderCenterX = parambqo.borderCenterX;
/* 194:217 */     this.borderCenterZ = parambqo.borderCenterZ;
/* 195:218 */     this.borderSize = parambqo.borderSize;
/* 196:219 */     this.borderSizeLerpTime = parambqo.borderSizeLerpTime;
/* 197:220 */     this.borderSizeLerpTarget = parambqo.borderSizeLerpTarget;
/* 198:221 */     this.borderSafeZone = parambqo.borderSafeZone;
/* 199:222 */     this.borderDamagePerBlock = parambqo.borderDamagePerBlock;
/* 200:223 */     this.borderWarningTime = parambqo.borderWarningTime;
/* 201:224 */     this.borderWarningBlocks = parambqo.borderWarningBlocks;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public NBTTagCompound a()
/* 205:    */   {
/* 206:228 */     NBTTagCompound localfn = new NBTTagCompound();
/* 207:    */     
/* 208:230 */     a(localfn, this.playerTag);
/* 209:    */     
/* 210:232 */     return localfn;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public NBTTagCompound a(NBTTagCompound paramfn)
/* 214:    */   {
/* 215:236 */     NBTTagCompound localfn = new NBTTagCompound();
/* 216:237 */     a(localfn, paramfn);
/* 217:    */     
/* 218:239 */     return localfn;
/* 219:    */   }
/* 220:    */   
/* 221:    */   private void a(NBTTagCompound paramfn1, NBTTagCompound paramfn2)
/* 222:    */   {
/* 223:243 */     paramfn1.a("RandomSeed", this.randomSeed);
/* 224:244 */     paramfn1.setString("generatorName", this.terrainType.a());
/* 225:245 */     paramfn1.setInt("generatorVersion", this.terrainType.d());
/* 226:246 */     paramfn1.setString("generatorOptions", this.generatorOptions);
/* 227:247 */     paramfn1.setInt("GameType", this.gameType.a());
/* 228:248 */     paramfn1.setBoolean("MapFeatures", this.mapFeaturesEnabled);
/* 229:249 */     paramfn1.setInt("SpawnX", this.spawnX);
/* 230:250 */     paramfn1.setInt("SpawnY", this.spawnY);
/* 231:251 */     paramfn1.setInt("SpawnZ", this.spawnZ);
/* 232:252 */     paramfn1.a("Time", this.worldTime);
/* 233:253 */     paramfn1.a("DayTime", this.dayTime);
/* 234:254 */     paramfn1.a("SizeOnDisk", this.sizeOnDisk);
/* 235:255 */     paramfn1.a("LastPlayed", MinecraftServer.ax());
/* 236:256 */     paramfn1.setString("LevelName", this.levelName);
/* 237:257 */     paramfn1.setInt("version", this.saveVersion);
/* 238:258 */     paramfn1.setInt("clearWeatherTime", this.clearWeatherTime);
/* 239:259 */     paramfn1.setInt("rainTime", this.rainTime);
/* 240:260 */     paramfn1.setBoolean("raining", this.raining);
/* 241:261 */     paramfn1.setInt("thunderTime", this.thunderTime);
/* 242:262 */     paramfn1.setBoolean("thundering", this.thundering);
/* 243:263 */     paramfn1.setBoolean("hardcore", this.hardcore);
/* 244:264 */     paramfn1.setBoolean("allowCommands", this.allowCommands);
/* 245:265 */     paramfn1.setBoolean("initialized", this.initialized);
/* 246:266 */     paramfn1.setDouble("BorderCenterX", this.borderCenterX);
/* 247:267 */     paramfn1.setDouble("BorderCenterZ", this.borderCenterZ);
/* 248:268 */     paramfn1.setDouble("BorderSize", this.borderSize);
/* 249:269 */     paramfn1.a("BorderSizeLerpTime", this.borderSizeLerpTime);
/* 250:270 */     paramfn1.setDouble("BorderSafeZone", this.borderSafeZone);
/* 251:271 */     paramfn1.setDouble("BorderDamagePerBlock", this.borderDamagePerBlock);
/* 252:272 */     paramfn1.setDouble("BorderSizeLerpTarget", this.borderSizeLerpTarget);
/* 253:273 */     paramfn1.setInt("BorderWarningBlocks", this.borderWarningBlocks);
/* 254:274 */     paramfn1.setInt("BorderWarningTime", this.borderWarningTime);
/* 255:275 */     if (this.difficulty != null) {
/* 256:276 */       paramfn1.setByte("Difficulty", (byte)this.difficulty.a());
/* 257:    */     }
/* 258:278 */     paramfn1.setBoolean("DifficultyLocked", this.difficultyLocked);
/* 259:279 */     paramfn1.setNBT("GameRules", this.gameRules.a());
/* 260:281 */     if (paramfn2 != null) {
/* 261:282 */       paramfn1.setNBT("Player", paramfn2);
/* 262:    */     }
/* 263:    */   }
/* 264:    */   
/* 265:    */   public long b()
/* 266:    */   {
/* 267:287 */     return this.randomSeed;
/* 268:    */   }
/* 269:    */   
/* 270:    */   public int c()
/* 271:    */   {
/* 272:291 */     return this.spawnX;
/* 273:    */   }
/* 274:    */   
/* 275:    */   public int d()
/* 276:    */   {
/* 277:295 */     return this.spawnY;
/* 278:    */   }
/* 279:    */   
/* 280:    */   public int e()
/* 281:    */   {
/* 282:299 */     return this.spawnZ;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public long getRealTime()
/* 286:    */   {
/* 287:303 */     return this.worldTime;
/* 288:    */   }
/* 289:    */   
/* 290:    */   public long getTime()
/* 291:    */   {
/* 292:307 */     return this.dayTime;
/* 293:    */   }
/* 294:    */   
/* 295:    */   public long h()
/* 296:    */   {
/* 297:311 */     return this.sizeOnDisk;
/* 298:    */   }
/* 299:    */   
/* 300:    */   public NBTTagCompound i()
/* 301:    */   {
/* 302:315 */     return this.playerTag;
/* 303:    */   }
/* 304:    */   
/* 305:    */   public void a(int paramInt)
/* 306:    */   {
/* 307:327 */     this.spawnX = paramInt;
/* 308:    */   }
/* 309:    */   
/* 310:    */   public void b(int paramInt)
/* 311:    */   {
/* 312:331 */     this.spawnY = paramInt;
/* 313:    */   }
/* 314:    */   
/* 315:    */   public void c(int paramInt)
/* 316:    */   {
/* 317:335 */     this.spawnZ = paramInt;
/* 318:    */   }
/* 319:    */   
/* 320:    */   public void setRealTime(long paramLong)
/* 321:    */   {
/* 322:339 */     this.worldTime = paramLong;
/* 323:    */   }
/* 324:    */   
/* 325:    */   public void setTime(long paramLong)
/* 326:    */   {
/* 327:343 */     this.dayTime = paramLong;
/* 328:    */   }
/* 329:    */   
/* 330:    */   public void a(BlockPosition paramdt)
/* 331:    */   {
/* 332:359 */     this.spawnX = paramdt.getX();
/* 333:360 */     this.spawnY = paramdt.getY();
/* 334:361 */     this.spawnZ = paramdt.getZ();
/* 335:    */   }
/* 336:    */   
/* 337:    */   public String k()
/* 338:    */   {
/* 339:365 */     return this.levelName;
/* 340:    */   }
/* 341:    */   
/* 342:    */   public void a(String paramString)
/* 343:    */   {
/* 344:369 */     this.levelName = paramString;
/* 345:    */   }
/* 346:    */   
/* 347:    */   public int l()
/* 348:    */   {
/* 349:373 */     return this.saveVersion;
/* 350:    */   }
/* 351:    */   
/* 352:    */   public void e(int paramInt)
/* 353:    */   {
/* 354:377 */     this.saveVersion = paramInt;
/* 355:    */   }
/* 356:    */   
/* 357:    */   public long m()
/* 358:    */   {
/* 359:381 */     return this.lastTimePlayed;
/* 360:    */   }
/* 361:    */   
/* 362:    */   public int A()
/* 363:    */   {
/* 364:385 */     return this.clearWeatherTime;
/* 365:    */   }
/* 366:    */   
/* 367:    */   public void i(int paramInt)
/* 368:    */   {
/* 369:389 */     this.clearWeatherTime = paramInt;
/* 370:    */   }
/* 371:    */   
/* 372:    */   public boolean n()
/* 373:    */   {
/* 374:393 */     return this.thundering;
/* 375:    */   }
/* 376:    */   
/* 377:    */   public void a(boolean paramBoolean)
/* 378:    */   {
/* 379:397 */     this.thundering = paramBoolean;
/* 380:    */   }
/* 381:    */   
/* 382:    */   public int o()
/* 383:    */   {
/* 384:401 */     return this.thunderTime;
/* 385:    */   }
/* 386:    */   
/* 387:    */   public void f(int paramInt)
/* 388:    */   {
/* 389:405 */     this.thunderTime = paramInt;
/* 390:    */   }
/* 391:    */   
/* 392:    */   public boolean p()
/* 393:    */   {
/* 394:409 */     return this.raining;
/* 395:    */   }
/* 396:    */   
/* 397:    */   public void b(boolean paramBoolean)
/* 398:    */   {
/* 399:413 */     this.raining = paramBoolean;
/* 400:    */   }
/* 401:    */   
/* 402:    */   public int q()
/* 403:    */   {
/* 404:417 */     return this.rainTime;
/* 405:    */   }
/* 406:    */   
/* 407:    */   public void g(int paramInt)
/* 408:    */   {
/* 409:421 */     this.rainTime = paramInt;
/* 410:    */   }
/* 411:    */   
/* 412:    */   public EnumGameType r()
/* 413:    */   {
/* 414:425 */     return this.gameType;
/* 415:    */   }
/* 416:    */   
/* 417:    */   public boolean s()
/* 418:    */   {
/* 419:429 */     return this.mapFeaturesEnabled;
/* 420:    */   }
/* 421:    */   
/* 422:    */   public void f(boolean paramBoolean)
/* 423:    */   {
/* 424:433 */     this.mapFeaturesEnabled = paramBoolean;
/* 425:    */   }
/* 426:    */   
/* 427:    */   public void a(EnumGameType paramarc)
/* 428:    */   {
/* 429:437 */     this.gameType = paramarc;
/* 430:    */   }
/* 431:    */   
/* 432:    */   public boolean isHardcore()
/* 433:    */   {
/* 434:441 */     return this.hardcore;
/* 435:    */   }
/* 436:    */   
/* 437:    */   public void g(boolean paramBoolean)
/* 438:    */   {
/* 439:445 */     this.hardcore = paramBoolean;
/* 440:    */   }
/* 441:    */   
/* 442:    */   public WorldType u()
/* 443:    */   {
/* 444:449 */     return this.terrainType;
/* 445:    */   }
/* 446:    */   
/* 447:    */   public void a(WorldType paramare)
/* 448:    */   {
/* 449:453 */     this.terrainType = paramare;
/* 450:    */   }
/* 451:    */   
/* 452:    */   public String B()
/* 453:    */   {
/* 454:457 */     return this.generatorOptions;
/* 455:    */   }
/* 456:    */   
/* 457:    */   public boolean v()
/* 458:    */   {
/* 459:465 */     return this.allowCommands;
/* 460:    */   }
/* 461:    */   
/* 462:    */   public void c(boolean paramBoolean)
/* 463:    */   {
/* 464:469 */     this.allowCommands = paramBoolean;
/* 465:    */   }
/* 466:    */   
/* 467:    */   public boolean w()
/* 468:    */   {
/* 469:473 */     return this.initialized;
/* 470:    */   }
/* 471:    */   
/* 472:    */   public void d(boolean paramBoolean)
/* 473:    */   {
/* 474:477 */     this.initialized = paramBoolean;
/* 475:    */   }
/* 476:    */   
/* 477:    */   public GameRules getGameRules()
/* 478:    */   {
/* 479:481 */     return this.gameRules;
/* 480:    */   }
/* 481:    */   
/* 482:    */   public double C()
/* 483:    */   {
/* 484:485 */     return this.borderCenterX;
/* 485:    */   }
/* 486:    */   
/* 487:    */   public double D()
/* 488:    */   {
/* 489:489 */     return this.borderCenterZ;
/* 490:    */   }
/* 491:    */   
/* 492:    */   public double E()
/* 493:    */   {
/* 494:493 */     return this.borderSize;
/* 495:    */   }
/* 496:    */   
/* 497:    */   public void a(double paramDouble)
/* 498:    */   {
/* 499:497 */     this.borderSize = paramDouble;
/* 500:    */   }
/* 501:    */   
/* 502:    */   public long F()
/* 503:    */   {
/* 504:501 */     return this.borderSizeLerpTime;
/* 505:    */   }
/* 506:    */   
/* 507:    */   public void e(long paramLong)
/* 508:    */   {
/* 509:505 */     this.borderSizeLerpTime = paramLong;
/* 510:    */   }
/* 511:    */   
/* 512:    */   public double G()
/* 513:    */   {
/* 514:509 */     return this.borderSizeLerpTarget;
/* 515:    */   }
/* 516:    */   
/* 517:    */   public void b(double paramDouble)
/* 518:    */   {
/* 519:513 */     this.borderSizeLerpTarget = paramDouble;
/* 520:    */   }
/* 521:    */   
/* 522:    */   public void c(double paramDouble)
/* 523:    */   {
/* 524:517 */     this.borderCenterZ = paramDouble;
/* 525:    */   }
/* 526:    */   
/* 527:    */   public void d(double paramDouble)
/* 528:    */   {
/* 529:521 */     this.borderCenterX = paramDouble;
/* 530:    */   }
/* 531:    */   
/* 532:    */   public double H()
/* 533:    */   {
/* 534:525 */     return this.borderSafeZone;
/* 535:    */   }
/* 536:    */   
/* 537:    */   public void e(double paramDouble)
/* 538:    */   {
/* 539:529 */     this.borderSafeZone = paramDouble;
/* 540:    */   }
/* 541:    */   
/* 542:    */   public double I()
/* 543:    */   {
/* 544:533 */     return this.borderDamagePerBlock;
/* 545:    */   }
/* 546:    */   
/* 547:    */   public void f(double paramDouble)
/* 548:    */   {
/* 549:537 */     this.borderDamagePerBlock = paramDouble;
/* 550:    */   }
/* 551:    */   
/* 552:    */   public int J()
/* 553:    */   {
/* 554:541 */     return this.borderWarningBlocks;
/* 555:    */   }
/* 556:    */   
/* 557:    */   public int K()
/* 558:    */   {
/* 559:545 */     return this.borderWarningTime;
/* 560:    */   }
/* 561:    */   
/* 562:    */   public void j(int paramInt)
/* 563:    */   {
/* 564:549 */     this.borderWarningBlocks = paramInt;
/* 565:    */   }
/* 566:    */   
/* 567:    */   public void k(int paramInt)
/* 568:    */   {
/* 569:553 */     this.borderWarningTime = paramInt;
/* 570:    */   }
/* 571:    */   
/* 572:    */   public EnumDifficulty y()
/* 573:    */   {
/* 574:557 */     return this.difficulty;
/* 575:    */   }
/* 576:    */   
/* 577:    */   public void setDifficulty(EnumDifficulty paramvt)
/* 578:    */   {
/* 579:561 */     this.difficulty = paramvt;
/* 580:    */   }
/* 581:    */   
/* 582:    */   public boolean z()
/* 583:    */   {
/* 584:565 */     return this.difficultyLocked;
/* 585:    */   }
/* 586:    */   
/* 587:    */   public void e(boolean paramBoolean)
/* 588:    */   {
/* 589:569 */     this.difficultyLocked = paramBoolean;
/* 590:    */   }
/* 591:    */   
/* 592:    */   public void a(j paramj)
/* 593:    */   {
/* 594:573 */     paramj.a("Level seed", new bqp(this));
/* 595:    */     
/* 596:    */ 
/* 597:    */ 
/* 598:    */ 
/* 599:    */ 
/* 600:    */ 
/* 601:580 */     paramj.a("Level generator", new bqq(this));
/* 602:    */     
/* 603:    */ 
/* 604:    */ 
/* 605:    */ 
/* 606:    */ 
/* 607:    */ 
/* 608:587 */     paramj.a("Level generator options", new bqr(this));
/* 609:    */     
/* 610:    */ 
/* 611:    */ 
/* 612:    */ 
/* 613:    */ 
/* 614:    */ 
/* 615:594 */     paramj.a("Level spawn location", new bqs(this));
/* 616:    */     
/* 617:    */ 
/* 618:    */ 
/* 619:    */ 
/* 620:    */ 
/* 621:    */ 
/* 622:601 */     paramj.a("Level time", new bqt(this));
/* 623:    */     
/* 624:    */ 
/* 625:    */ 
/* 626:    */ 
/* 627:    */ 
/* 628:    */ 
/* 629:608 */     paramj.a("Level dimension", new bqu(this));
/* 630:    */     
/* 631:    */ 
/* 632:    */ 
/* 633:    */ 
/* 634:    */ 
/* 635:    */ 
/* 636:615 */     paramj.a("Level storage version", new bqv(this));
/* 637:    */     
/* 638:    */ 
/* 639:    */ 
/* 640:    */ 
/* 641:    */ 
/* 642:    */ 
/* 643:    */ 
/* 644:    */ 
/* 645:    */ 
/* 646:    */ 
/* 647:    */ 
/* 648:    */ 
/* 649:    */ 
/* 650:    */ 
/* 651:    */ 
/* 652:    */ 
/* 653:    */ 
/* 654:    */ 
/* 655:    */ 
/* 656:    */ 
/* 657:636 */     paramj.a("Level weather", new bqw(this));
/* 658:    */     
/* 659:    */ 
/* 660:    */ 
/* 661:    */ 
/* 662:    */ 
/* 663:    */ 
/* 664:643 */     paramj.a("Level game mode", new bqx(this));
/* 665:    */   }
				static WorldType a(WorldInfo arg0) {return arg0.terrainType;}
				static boolean b(WorldInfo arg0) {return arg0.mapFeaturesEnabled;}
				static java.lang.String c(WorldInfo arg0) {return arg0.generatorOptions;}
				static int d(WorldInfo arg0) {return arg0.spawnX;}
				static int e(WorldInfo arg0) {return arg0.spawnY;}
				static int f(WorldInfo arg0) {return arg0.spawnZ;}
				static long g(WorldInfo arg0) {return arg0.worldTime;}
				static long h(WorldInfo arg0) {return arg0.dayTime;}
				static int i(WorldInfo arg0) {return arg0.dimension;}
				static int j(WorldInfo arg0) {return arg0.saveVersion;}
				static int k(WorldInfo arg0) {return arg0.rainTime;}
				static boolean l(WorldInfo arg0) {return arg0.raining;}
				static int m(WorldInfo arg0) {return arg0.thunderTime;}
				static boolean n(WorldInfo arg0) {return arg0.thundering;}
				static EnumGameType o(WorldInfo arg0) {return arg0.gameType;}
				static boolean p(WorldInfo arg0) {return arg0.hardcore;}
				static boolean q(WorldInfo arg0) {return arg0.allowCommands;}
/* 666:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqo
 * JD-Core Version:    0.7.0.1
 */
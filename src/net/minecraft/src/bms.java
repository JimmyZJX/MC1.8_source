package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public abstract class bms
/*   5:    */ {
/*   6:    */   protected bjb l;
/*   7:    */   protected EnumDirection m;
/*   8:    */   protected int n;
/*   9:    */   
/*  10:    */   public bms() {}
/*  11:    */   
/*  12:    */   protected bms(int paramInt)
/*  13:    */   {
/*  14: 59 */     this.n = paramInt;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public NBTTagCompound b()
/*  18:    */   {
/*  19: 63 */     NBTTagCompound localfn = new NBTTagCompound();
/*  20:    */     
/*  21: 65 */     localfn.setString("id", bmq.a(this));
/*  22: 66 */     localfn.setNBT("BB", this.l.g());
/*  23: 67 */     localfn.setInt("O", this.m == null ? -1 : this.m.b());
/*  24: 68 */     localfn.setInt("GD", this.n);
/*  25:    */     
/*  26: 70 */     a(localfn);
/*  27:    */     
/*  28: 72 */     return localfn;
/*  29:    */   }
/*  30:    */   
/*  31:    */   protected abstract void a(NBTTagCompound paramfn);
/*  32:    */   
/*  33:    */   public void a(World paramaqu, NBTTagCompound paramfn)
/*  34:    */   {
/*  35: 78 */     if (paramfn.c("BB")) {
/*  36: 79 */       this.l = new bjb(paramfn.l("BB"));
/*  37:    */     }
/*  38: 81 */     int i = paramfn.getInteger("O");
/*  39: 82 */     this.m = (i == -1 ? null : EnumDirection.b(i));
/*  40: 83 */     this.n = paramfn.getInteger("GD");
/*  41:    */     
/*  42: 85 */     b(paramfn);
/*  43:    */   }
/*  44:    */   
/*  45:    */   protected abstract void b(NBTTagCompound paramfn);
/*  46:    */   
/*  47:    */   public void a(bms parambms, List<bms> paramList, Random paramRandom) {}
/*  48:    */   
/*  49:    */   public abstract boolean a(World paramaqu, Random paramRandom, bjb parambjb);
/*  50:    */   
/*  51:    */   public bjb c()
/*  52:    */   {
/*  53: 96 */     return this.l;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public int d()
/*  57:    */   {
/*  58:100 */     return this.n;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public static bms a(List<bms> paramList, bjb parambjb)
/*  62:    */   {
/*  63:111 */     for (bms localbms : paramList) {
/*  64:112 */       if ((localbms.c() != null) && (localbms.c().a(parambjb))) {
/*  65:113 */         return localbms;
/*  66:    */       }
/*  67:    */     }
/*  68:116 */     return null;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public BlockPosition a()
/*  72:    */   {
/*  73:120 */     return new BlockPosition(this.l.f());
/*  74:    */   }
/*  75:    */   
/*  76:    */   protected boolean a(World paramaqu, bjb parambjb)
/*  77:    */   {
/*  78:124 */     int i = Math.max(this.l.a - 1, parambjb.a);
/*  79:125 */     int j = Math.max(this.l.b - 1, parambjb.b);
/*  80:126 */     int k = Math.max(this.l.c - 1, parambjb.c);
/*  81:127 */     int i1 = Math.min(this.l.d + 1, parambjb.d);
/*  82:128 */     int i2 = Math.min(this.l.e + 1, parambjb.e);
/*  83:129 */     int i3 = Math.min(this.l.f + 1, parambjb.f);
/*  84:    */     int i5;
/*  85:132 */     for (int i4 = i; i4 <= i1; i4++) {
/*  86:133 */       for (i5 = k; i5 <= i3; i5++)
/*  87:    */       {
/*  88:134 */         if (paramaqu.getBlock(new BlockPosition(i4, j, i5)).getProto().getMaterial().isLiquid()) {
/*  89:135 */           return true;
/*  90:    */         }
/*  91:137 */         if (paramaqu.getBlock(new BlockPosition(i4, i2, i5)).getProto().getMaterial().isLiquid()) {
/*  92:138 */           return true;
/*  93:    */         }
/*  94:    */       }
/*  95:    */     }
/*  96:143 */     for (int i4 = i; i4 <= i1; i4++) {
/*  97:144 */       for (i5 = j; i5 <= i2; i5++)
/*  98:    */       {
/*  99:145 */         if (paramaqu.getBlock(new BlockPosition(i4, i5, k)).getProto().getMaterial().isLiquid()) {
/* 100:146 */           return true;
/* 101:    */         }
/* 102:148 */         if (paramaqu.getBlock(new BlockPosition(i4, i5, i3)).getProto().getMaterial().isLiquid()) {
/* 103:149 */           return true;
/* 104:    */         }
/* 105:    */       }
/* 106:    */     }
/* 107:154 */     for (int i4 = k; i4 <= i3; i4++) {
/* 108:155 */       for (i5 = j; i5 <= i2; i5++)
/* 109:    */       {
/* 110:156 */         if (paramaqu.getBlock(new BlockPosition(i, i5, i4)).getProto().getMaterial().isLiquid()) {
/* 111:157 */           return true;
/* 112:    */         }
/* 113:159 */         if (paramaqu.getBlock(new BlockPosition(i1, i5, i4)).getProto().getMaterial().isLiquid()) {
/* 114:160 */           return true;
/* 115:    */         }
/* 116:    */       }
/* 117:    */     }
/* 118:164 */     return false;
/* 119:    */   }
/* 120:    */   
/* 121:    */   protected int a(int paramInt1, int paramInt2)
/* 122:    */   {
/* 123:168 */     if (this.m == null) {
/* 124:169 */       return paramInt1;
/* 125:    */     }
/* 126:172 */     switch (bmt.a[this.m.ordinal()])
/* 127:    */     {
/* 128:    */     case 1: 
/* 129:    */     case 2: 
/* 130:175 */       return this.l.a + paramInt1;
/* 131:    */     case 3: 
/* 132:177 */       return this.l.d - paramInt2;
/* 133:    */     case 4: 
/* 134:179 */       return this.l.a + paramInt2;
/* 135:    */     }
/* 136:181 */     return paramInt1;
/* 137:    */   }
/* 138:    */   
/* 139:    */   protected int d(int paramInt)
/* 140:    */   {
/* 141:186 */     if (this.m == null) {
/* 142:187 */       return paramInt;
/* 143:    */     }
/* 144:189 */     return paramInt + this.l.b;
/* 145:    */   }
/* 146:    */   
/* 147:    */   protected int b(int paramInt1, int paramInt2)
/* 148:    */   {
/* 149:193 */     if (this.m == null) {
/* 150:194 */       return paramInt2;
/* 151:    */     }
/* 152:197 */     switch (bmt.a[this.m.ordinal()])
/* 153:    */     {
/* 154:    */     case 1: 
/* 155:199 */       return this.l.f - paramInt2;
/* 156:    */     case 2: 
/* 157:201 */       return this.l.c + paramInt2;
/* 158:    */     case 3: 
/* 159:    */     case 4: 
/* 160:204 */       return this.l.c + paramInt1;
/* 161:    */     }
/* 162:206 */     return paramInt2;
/* 163:    */   }
/* 164:    */   
/* 165:    */   protected int a(ProtoBlock paramatr, int paramInt)
/* 166:    */   {
/* 167:212 */     if (paramatr == BlockList.av)
/* 168:    */     {
/* 169:213 */       if ((this.m == EnumDirection.WEST) || (this.m == EnumDirection.EAST))
/* 170:    */       {
/* 171:214 */         if (paramInt == 1) {
/* 172:215 */           return 0;
/* 173:    */         }
/* 174:217 */         return 1;
/* 175:    */       }
/* 176:    */     }
/* 177:220 */     else if ((paramatr instanceof BlockDoor))
/* 178:    */     {
/* 179:221 */       if (this.m == EnumDirection.SOUTH)
/* 180:    */       {
/* 181:222 */         if (paramInt == 0) {
/* 182:223 */           return 2;
/* 183:    */         }
/* 184:225 */         if (paramInt == 2) {
/* 185:226 */           return 0;
/* 186:    */         }
/* 187:    */       }
/* 188:    */       else
/* 189:    */       {
/* 190:228 */         if (this.m == EnumDirection.WEST) {
/* 191:233 */           return paramInt + 1 & 0x3;
/* 192:    */         }
/* 193:234 */         if (this.m == EnumDirection.EAST) {
/* 194:239 */           return paramInt + 3 & 0x3;
/* 195:    */         }
/* 196:    */       }
/* 197:    */     }
/* 198:241 */     else if ((paramatr == BlockList.aw) || (paramatr == BlockList.ad) || (paramatr == BlockList.bA) || (paramatr == BlockList.bv) || (paramatr == BlockList.bO))
/* 199:    */     {
/* 200:242 */       if (this.m == EnumDirection.SOUTH)
/* 201:    */       {
/* 202:243 */         if (paramInt == 2) {
/* 203:244 */           return 3;
/* 204:    */         }
/* 205:246 */         if (paramInt == 3) {
/* 206:247 */           return 2;
/* 207:    */         }
/* 208:    */       }
/* 209:249 */       else if (this.m == EnumDirection.WEST)
/* 210:    */       {
/* 211:250 */         if (paramInt == 0) {
/* 212:251 */           return 2;
/* 213:    */         }
/* 214:253 */         if (paramInt == 1) {
/* 215:254 */           return 3;
/* 216:    */         }
/* 217:256 */         if (paramInt == 2) {
/* 218:257 */           return 0;
/* 219:    */         }
/* 220:259 */         if (paramInt == 3) {
/* 221:260 */           return 1;
/* 222:    */         }
/* 223:    */       }
/* 224:262 */       else if (this.m == EnumDirection.EAST)
/* 225:    */       {
/* 226:263 */         if (paramInt == 0) {
/* 227:264 */           return 2;
/* 228:    */         }
/* 229:266 */         if (paramInt == 1) {
/* 230:267 */           return 3;
/* 231:    */         }
/* 232:269 */         if (paramInt == 2) {
/* 233:270 */           return 1;
/* 234:    */         }
/* 235:272 */         if (paramInt == 3) {
/* 236:273 */           return 0;
/* 237:    */         }
/* 238:    */       }
/* 239:    */     }
/* 240:276 */     else if (paramatr == BlockList.au)
/* 241:    */     {
/* 242:277 */       if (this.m == EnumDirection.SOUTH)
/* 243:    */       {
/* 244:278 */         if (paramInt == EnumDirection.NORTH.a()) {
/* 245:279 */           return EnumDirection.SOUTH.a();
/* 246:    */         }
/* 247:281 */         if (paramInt == EnumDirection.SOUTH.a()) {
/* 248:282 */           return EnumDirection.NORTH.a();
/* 249:    */         }
/* 250:    */       }
/* 251:284 */       else if (this.m == EnumDirection.WEST)
/* 252:    */       {
/* 253:285 */         if (paramInt == EnumDirection.NORTH.a()) {
/* 254:286 */           return EnumDirection.WEST.a();
/* 255:    */         }
/* 256:288 */         if (paramInt == EnumDirection.SOUTH.a()) {
/* 257:289 */           return EnumDirection.EAST.a();
/* 258:    */         }
/* 259:291 */         if (paramInt == EnumDirection.WEST.a()) {
/* 260:292 */           return EnumDirection.NORTH.a();
/* 261:    */         }
/* 262:294 */         if (paramInt == EnumDirection.EAST.a()) {
/* 263:295 */           return EnumDirection.SOUTH.a();
/* 264:    */         }
/* 265:    */       }
/* 266:297 */       else if (this.m == EnumDirection.EAST)
/* 267:    */       {
/* 268:299 */         if (paramInt == EnumDirection.NORTH.a()) {
/* 269:300 */           return EnumDirection.EAST.a();
/* 270:    */         }
/* 271:302 */         if (paramInt == EnumDirection.SOUTH.a()) {
/* 272:303 */           return EnumDirection.WEST.a();
/* 273:    */         }
/* 274:305 */         if (paramInt == EnumDirection.WEST.a()) {
/* 275:306 */           return EnumDirection.NORTH.a();
/* 276:    */         }
/* 277:308 */         if (paramInt == EnumDirection.EAST.a()) {
/* 278:309 */           return EnumDirection.SOUTH.a();
/* 279:    */         }
/* 280:    */       }
/* 281:    */     }
/* 282:312 */     else if (paramatr == BlockList.aG)
/* 283:    */     {
/* 284:313 */       if (this.m == EnumDirection.SOUTH)
/* 285:    */       {
/* 286:314 */         if (paramInt == 3) {
/* 287:315 */           return 4;
/* 288:    */         }
/* 289:317 */         if (paramInt == 4) {
/* 290:318 */           return 3;
/* 291:    */         }
/* 292:    */       }
/* 293:320 */       else if (this.m == EnumDirection.WEST)
/* 294:    */       {
/* 295:321 */         if (paramInt == 3) {
/* 296:322 */           return 1;
/* 297:    */         }
/* 298:324 */         if (paramInt == 4) {
/* 299:325 */           return 2;
/* 300:    */         }
/* 301:327 */         if (paramInt == 2) {
/* 302:328 */           return 3;
/* 303:    */         }
/* 304:330 */         if (paramInt == 1) {
/* 305:331 */           return 4;
/* 306:    */         }
/* 307:    */       }
/* 308:333 */       else if (this.m == EnumDirection.EAST)
/* 309:    */       {
/* 310:334 */         if (paramInt == 3) {
/* 311:335 */           return 2;
/* 312:    */         }
/* 313:337 */         if (paramInt == 4) {
/* 314:338 */           return 1;
/* 315:    */         }
/* 316:340 */         if (paramInt == 2) {
/* 317:341 */           return 3;
/* 318:    */         }
/* 319:343 */         if (paramInt == 1) {
/* 320:344 */           return 4;
/* 321:    */         }
/* 322:    */       }
/* 323:    */     }
/* 324:347 */     else if ((paramatr == BlockList.bR) || ((paramatr instanceof avb)))
/* 325:    */     {
/* 326:348 */       EnumDirection localej = EnumDirection.b(paramInt);
/* 327:349 */       if (this.m == EnumDirection.SOUTH)
/* 328:    */       {
/* 329:350 */         if ((localej == EnumDirection.SOUTH) || (localej == EnumDirection.NORTH)) {
/* 330:351 */           return localej.d().b();
/* 331:    */         }
/* 332:    */       }
/* 333:353 */       else if (this.m == EnumDirection.WEST)
/* 334:    */       {
/* 335:354 */         if (localej == EnumDirection.NORTH) {
/* 336:355 */           return EnumDirection.WEST.b();
/* 337:    */         }
/* 338:357 */         if (localej == EnumDirection.SOUTH) {
/* 339:358 */           return EnumDirection.EAST.b();
/* 340:    */         }
/* 341:360 */         if (localej == EnumDirection.WEST) {
/* 342:361 */           return EnumDirection.NORTH.b();
/* 343:    */         }
/* 344:363 */         if (localej == EnumDirection.EAST) {
/* 345:364 */           return EnumDirection.SOUTH.b();
/* 346:    */         }
/* 347:    */       }
/* 348:366 */       else if (this.m == EnumDirection.EAST)
/* 349:    */       {
/* 350:368 */         if (localej == EnumDirection.NORTH) {
/* 351:369 */           return EnumDirection.EAST.b();
/* 352:    */         }
/* 353:371 */         if (localej == EnumDirection.SOUTH) {
/* 354:372 */           return EnumDirection.WEST.b();
/* 355:    */         }
/* 356:374 */         if (localej == EnumDirection.WEST) {
/* 357:375 */           return EnumDirection.NORTH.b();
/* 358:    */         }
/* 359:377 */         if (localej == EnumDirection.EAST) {
/* 360:378 */           return EnumDirection.SOUTH.b();
/* 361:    */         }
/* 362:    */       }
/* 363:    */     }
/* 364:381 */     else if ((paramatr == BlockList.J) || (paramatr == BlockList.F) || (paramatr == BlockList.ay) || (paramatr == BlockList.z))
/* 365:    */     {
/* 366:382 */       if (this.m == EnumDirection.SOUTH)
/* 367:    */       {
/* 368:383 */         if ((paramInt == EnumDirection.NORTH.a()) || (paramInt == EnumDirection.SOUTH.a())) {
/* 369:384 */           return EnumDirection.a(paramInt).d().a();
/* 370:    */         }
/* 371:    */       }
/* 372:386 */       else if (this.m == EnumDirection.WEST)
/* 373:    */       {
/* 374:387 */         if (paramInt == EnumDirection.NORTH.a()) {
/* 375:388 */           return EnumDirection.WEST.a();
/* 376:    */         }
/* 377:390 */         if (paramInt == EnumDirection.SOUTH.a()) {
/* 378:391 */           return EnumDirection.EAST.a();
/* 379:    */         }
/* 380:393 */         if (paramInt == EnumDirection.WEST.a()) {
/* 381:394 */           return EnumDirection.NORTH.a();
/* 382:    */         }
/* 383:396 */         if (paramInt == EnumDirection.EAST.a()) {
/* 384:397 */           return EnumDirection.SOUTH.a();
/* 385:    */         }
/* 386:    */       }
/* 387:399 */       else if (this.m == EnumDirection.EAST)
/* 388:    */       {
/* 389:400 */         if (paramInt == EnumDirection.NORTH.a()) {
/* 390:401 */           return EnumDirection.EAST.a();
/* 391:    */         }
/* 392:403 */         if (paramInt == EnumDirection.SOUTH.a()) {
/* 393:404 */           return EnumDirection.WEST.a();
/* 394:    */         }
/* 395:406 */         if (paramInt == EnumDirection.WEST.a()) {
/* 396:407 */           return EnumDirection.NORTH.a();
/* 397:    */         }
/* 398:409 */         if (paramInt == EnumDirection.EAST.a()) {
/* 399:410 */           return EnumDirection.SOUTH.a();
/* 400:    */         }
/* 401:    */       }
/* 402:    */     }
/* 403:414 */     return paramInt;
/* 404:    */   }
/* 405:    */   
/* 406:    */   protected void a(World paramaqu, Block parambec, int paramInt1, int paramInt2, int paramInt3, bjb parambjb)
/* 407:    */   {
/* 408:418 */     BlockPosition localdt = new BlockPosition(a(paramInt1, paramInt3), d(paramInt2), b(paramInt1, paramInt3));
/* 409:420 */     if (!parambjb.b(localdt)) {
/* 410:421 */       return;
/* 411:    */     }
/* 412:424 */     paramaqu.setBlock(localdt, parambec, 2);
/* 413:    */   }
/* 414:    */   
/* 415:    */   protected Block a(World paramaqu, int paramInt1, int paramInt2, int paramInt3, bjb parambjb)
/* 416:    */   {
/* 417:440 */     int i = a(paramInt1, paramInt3);
/* 418:441 */     int j = d(paramInt2);
/* 419:442 */     int k = b(paramInt1, paramInt3);
/* 420:444 */     if (!parambjb.b(new BlockPosition(i, j, k))) {
/* 421:445 */       return BlockList.air.instance();
/* 422:    */     }
/* 423:448 */     return paramaqu.getBlock(new BlockPosition(i, j, k));
/* 424:    */   }
/* 425:    */   
/* 426:    */   protected void a(World paramaqu, bjb parambjb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 427:    */   {
/* 428:452 */     for (int i = paramInt2; i <= paramInt5; i++) {
/* 429:453 */       for (int j = paramInt1; j <= paramInt4; j++) {
/* 430:454 */         for (int k = paramInt3; k <= paramInt6; k++) {
/* 431:455 */           a(paramaqu, BlockList.air.instance(), j, i, k, parambjb);
/* 432:    */         }
/* 433:    */       }
/* 434:    */     }
/* 435:    */   }
/* 436:    */   
/* 437:    */   protected void a(World paramaqu, bjb parambjb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Block parambec1, Block parambec2, boolean paramBoolean)
/* 438:    */   {
/* 439:462 */     for (int i = paramInt2; i <= paramInt5; i++) {
/* 440:463 */       for (int j = paramInt1; j <= paramInt4; j++) {
/* 441:464 */         for (int k = paramInt3; k <= paramInt6; k++) {
/* 442:465 */           if ((!paramBoolean) || (a(paramaqu, j, i, k, parambjb).getProto().getMaterial() != Material.air)) {
/* 443:468 */             if ((i == paramInt2) || (i == paramInt5) || (j == paramInt1) || (j == paramInt4) || (k == paramInt3) || (k == paramInt6)) {
/* 444:469 */               a(paramaqu, parambec1, j, i, k, parambjb);
/* 445:    */             } else {
/* 446:471 */               a(paramaqu, parambec2, j, i, k, parambjb);
/* 447:    */             }
/* 448:    */           }
/* 449:    */         }
/* 450:    */       }
/* 451:    */     }
/* 452:    */   }
/* 453:    */   
/* 454:    */   protected void a(World paramaqu, bjb parambjb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, Random paramRandom, bmu parambmu)
/* 455:    */   {
/* 456:483 */     for (int i = paramInt2; i <= paramInt5; i++) {
/* 457:484 */       for (int j = paramInt1; j <= paramInt4; j++) {
/* 458:485 */         for (int k = paramInt3; k <= paramInt6; k++) {
/* 459:486 */           if ((!paramBoolean) || (a(paramaqu, j, i, k, parambjb).getProto().getMaterial() != Material.air))
/* 460:    */           {
/* 461:489 */             parambmu.a(paramRandom, j, i, k, (i == paramInt2) || (i == paramInt5) || (j == paramInt1) || (j == paramInt4) || (k == paramInt3) || (k == paramInt6));
/* 462:490 */             a(paramaqu, parambmu.a(), j, i, k, parambjb);
/* 463:    */           }
/* 464:    */         }
/* 465:    */       }
/* 466:    */     }
/* 467:    */   }
/* 468:    */   
/* 469:    */   protected void a(World paramaqu, bjb parambjb, Random paramRandom, float paramFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Block parambec1, Block parambec2, boolean paramBoolean)
/* 470:    */   {
/* 471:501 */     for (int i = paramInt2; i <= paramInt5; i++) {
/* 472:502 */       for (int j = paramInt1; j <= paramInt4; j++) {
/* 473:503 */         for (int k = paramInt3; k <= paramInt6; k++) {
/* 474:504 */           if (paramRandom.nextFloat() <= paramFloat) {
/* 475:507 */             if ((!paramBoolean) || (a(paramaqu, j, i, k, parambjb).getProto().getMaterial() != Material.air)) {
/* 476:510 */               if ((i == paramInt2) || (i == paramInt5) || (j == paramInt1) || (j == paramInt4) || (k == paramInt3) || (k == paramInt6)) {
/* 477:511 */                 a(paramaqu, parambec1, j, i, k, parambjb);
/* 478:    */               } else {
/* 479:513 */                 a(paramaqu, parambec2, j, i, k, parambjb);
/* 480:    */               }
/* 481:    */             }
/* 482:    */           }
/* 483:    */         }
/* 484:    */       }
/* 485:    */     }
/* 486:    */   }
/* 487:    */   
/* 488:    */   protected void a(World paramaqu, bjb parambjb, Random paramRandom, float paramFloat, int paramInt1, int paramInt2, int paramInt3, Block parambec)
/* 489:    */   {
/* 490:521 */     if (paramRandom.nextFloat() < paramFloat) {
/* 491:522 */       a(paramaqu, parambec, paramInt1, paramInt2, paramInt3, parambjb);
/* 492:    */     }
/* 493:    */   }
/* 494:    */   
/* 495:    */   protected void a(World paramaqu, bjb parambjb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Block parambec, boolean paramBoolean)
/* 496:    */   {
/* 497:527 */     float f1 = paramInt4 - paramInt1 + 1;
/* 498:528 */     float f2 = paramInt5 - paramInt2 + 1;
/* 499:529 */     float f3 = paramInt6 - paramInt3 + 1;
/* 500:530 */     float f4 = paramInt1 + f1 / 2.0F;
/* 501:531 */     float f5 = paramInt3 + f3 / 2.0F;
/* 502:533 */     for (int i = paramInt2; i <= paramInt5; i++)
/* 503:    */     {
/* 504:534 */       float f6 = (i - paramInt2) / f2;
/* 505:536 */       for (int j = paramInt1; j <= paramInt4; j++)
/* 506:    */       {
/* 507:537 */         float f7 = (j - f4) / (f1 * 0.5F);
/* 508:539 */         for (int k = paramInt3; k <= paramInt6; k++)
/* 509:    */         {
/* 510:540 */           float f8 = (k - f5) / (f3 * 0.5F);
/* 511:542 */           if ((!paramBoolean) || (a(paramaqu, j, i, k, parambjb).getProto().getMaterial() != Material.air))
/* 512:    */           {
/* 513:546 */             float f9 = f7 * f7 + f6 * f6 + f8 * f8;
/* 514:548 */             if (f9 <= 1.05F) {
/* 515:549 */               a(paramaqu, parambec, j, i, k, parambjb);
/* 516:    */             }
/* 517:    */           }
/* 518:    */         }
/* 519:    */       }
/* 520:    */     }
/* 521:    */   }
/* 522:    */   
/* 523:    */   protected void b(World paramaqu, int paramInt1, int paramInt2, int paramInt3, bjb parambjb)
/* 524:    */   {
/* 525:557 */     BlockPosition localdt = new BlockPosition(a(paramInt1, paramInt3), d(paramInt2), b(paramInt1, paramInt3));
/* 526:559 */     if (!parambjb.b(localdt)) {
/* 527:560 */       return;
/* 528:    */     }
/* 529:563 */     while ((!paramaqu.isEmpty(localdt)) && (localdt.getY() < 255))
/* 530:    */     {
/* 531:564 */       paramaqu.setBlock(localdt, BlockList.air.instance(), 2);
/* 532:565 */       localdt = localdt.up();
/* 533:    */     }
/* 534:    */   }
/* 535:    */   
/* 536:    */   protected void b(World paramaqu, Block parambec, int paramInt1, int paramInt2, int paramInt3, bjb parambjb)
/* 537:    */   {
/* 538:570 */     int i = a(paramInt1, paramInt3);
/* 539:571 */     int j = d(paramInt2);
/* 540:572 */     int k = b(paramInt1, paramInt3);
/* 541:574 */     if (!parambjb.b(new BlockPosition(i, j, k))) {
/* 542:575 */       return;
/* 543:    */     }
/* 544:578 */     while (((paramaqu.isEmpty(new BlockPosition(i, j, k))) || (paramaqu.getBlock(new BlockPosition(i, j, k)).getProto().getMaterial().isLiquid())) && (j > 1))
/* 545:    */     {
/* 546:579 */       paramaqu.setBlock(new BlockPosition(i, j, k), parambec, 2);
/* 547:580 */       j--;
/* 548:    */     }
/* 549:    */   }
/* 550:    */   
/* 551:    */   protected boolean a(World paramaqu, bjb parambjb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, List paramList, int paramInt4)
/* 552:    */   {
/* 553:585 */     BlockPosition localdt = new BlockPosition(a(paramInt1, paramInt3), d(paramInt2), b(paramInt1, paramInt3));
/* 554:587 */     if ((parambjb.b(localdt)) && 
/* 555:588 */       (paramaqu.getBlock(localdt).getProto() != BlockList.ae))
/* 556:    */     {
/* 557:589 */       Block localbec = BlockList.ae.instance();
/* 558:590 */       paramaqu.setBlock(localdt, BlockList.ae.f(paramaqu, localdt, localbec), 2);
/* 559:    */       
/* 560:592 */       bcm localbcm = paramaqu.s(localdt);
/* 561:593 */       if ((localbcm instanceof bcr)) {
/* 562:594 */         vl.a(paramRandom, paramList, (bcr)localbcm, paramInt4);
/* 563:    */       }
/* 564:596 */       return true;
/* 565:    */     }
/* 566:599 */     return false;
/* 567:    */   }
/* 568:    */   
/* 569:    */   protected boolean a(World paramaqu, bjb parambjb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List paramList, int paramInt5)
/* 570:    */   {
/* 571:603 */     BlockPosition localdt = new BlockPosition(a(paramInt1, paramInt3), d(paramInt2), b(paramInt1, paramInt3));
/* 572:605 */     if ((parambjb.b(localdt)) && 
/* 573:606 */       (paramaqu.getBlock(localdt).getProto() != BlockList.z))
/* 574:    */     {
/* 575:607 */       paramaqu.setBlock(localdt, BlockList.z.a(a(BlockList.z, paramInt4)), 2);
/* 576:    */       
/* 577:609 */       bcm localbcm = paramaqu.s(localdt);
/* 578:610 */       if ((localbcm instanceof bcx)) {
/* 579:611 */         vl.a(paramRandom, paramList, (bcx)localbcm, paramInt5);
/* 580:    */       }
/* 581:613 */       return true;
/* 582:    */     }
/* 583:616 */     return false;
/* 584:    */   }
/* 585:    */   
/* 586:    */   protected void a(World paramaqu, bjb parambjb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej)
/* 587:    */   {
/* 588:620 */     BlockPosition localdt = new BlockPosition(a(paramInt1, paramInt3), d(paramInt2), b(paramInt1, paramInt3));
/* 589:622 */     if (parambjb.b(localdt)) {
/* 590:623 */       akt.a(paramaqu, localdt, paramej.f(), BlockList.ao);
/* 591:    */     }
/* 592:    */   }
/* 593:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bms
 * JD-Core Version:    0.7.0.1
 */
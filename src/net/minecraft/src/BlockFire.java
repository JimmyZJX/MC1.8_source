package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class BlockFire
/*   6:    */   extends ProtoBlock
/*   7:    */ {
/*   8: 25 */   public static final BlockDataInteger age = BlockDataInteger.getInstance("age", 0, 15);
/*   9: 26 */   public static final BlockDataBoolean flip = BlockDataBoolean.getInstance("flip");
/*  10: 27 */   public static final BlockDataBoolean alt = BlockDataBoolean.getInstance("alt");
/*  11: 28 */   public static final BlockDataBoolean north = BlockDataBoolean.getInstance("north");
/*  12: 29 */   public static final BlockDataBoolean east = BlockDataBoolean.getInstance("east");
/*  13: 30 */   public static final BlockDataBoolean south = BlockDataBoolean.getInstance("south");
/*  14: 31 */   public static final BlockDataBoolean west = BlockDataBoolean.getInstance("west");
/*  15: 32 */   public static final BlockDataInteger upper = BlockDataInteger.getInstance("upper", 0, 2);
/*  16:    */   
/*  17:    */   public Block a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/*  18:    */   {
/*  19: 36 */     int i = paramdt.getX();
/*  20: 37 */     int j = paramdt.getY();
/*  21: 38 */     int k = paramdt.getZ();
/*  22: 40 */     if ((World.isFlatSurface(paramard, paramdt.down())) || (BlockList.fire.e(paramard, paramdt.down()))) {
/*  23: 41 */       return instance();
/*  24:    */     }
/*  25: 44 */     boolean bool1 = (i + j + k & 0x1) == 1;
/*  26: 45 */     boolean bool2 = (i / 2 + j / 2 + k / 2 & 0x1) == 1;
/*  27:    */     
/*  28: 47 */     int m = 0;
/*  29: 48 */     if (e(paramard, paramdt.up())) {
/*  30: 49 */       m = bool1 ? 1 : 2;
/*  31:    */     }
/*  32: 52 */     return parambec.a(north, Boolean.valueOf(e(paramard, paramdt.north()))).a(east, Boolean.valueOf(e(paramard, paramdt.east()))).a(south, Boolean.valueOf(e(paramard, paramdt.south()))).a(west, Boolean.valueOf(e(paramard, paramdt.west()))).a(upper, Integer.valueOf(m)).a(flip, Boolean.valueOf(bool2)).a(alt, Boolean.valueOf(bool1));
/*  33:    */   }
/*  34:    */   
/*  35: 72 */   private final Map S = Maps.newIdentityHashMap();
/*  36: 73 */   private final Map T = Maps.newIdentityHashMap();
/*  37:    */   
/*  38:    */   protected BlockFire()
/*  39:    */   {
/*  40: 76 */     super(Material.o);
/*  41: 77 */     j(this.L.b().a(age, Integer.valueOf(0)).a(flip, Boolean.valueOf(false)).a(alt, Boolean.valueOf(false)).a(north, Boolean.valueOf(false)).a(east, Boolean.valueOf(false)).a(south, Boolean.valueOf(false)).a(west, Boolean.valueOf(false)).a(upper, Integer.valueOf(0)));
/*  42: 78 */     a(true);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public static void j()
/*  46:    */   {
/*  47: 82 */     BlockList.fire.a(BlockList.planks, 5, 20);
/*  48: 83 */     BlockList.fire.a(BlockList.bL, 5, 20);
/*  49: 84 */     BlockList.fire.a(BlockList.bM, 5, 20);
/*  50: 85 */     BlockList.fire.a(BlockList.bo, 5, 20);
/*  51: 86 */     BlockList.fire.a(BlockList.bp, 5, 20);
/*  52: 87 */     BlockList.fire.a(BlockList.bq, 5, 20);
/*  53: 88 */     BlockList.fire.a(BlockList.br, 5, 20);
/*  54: 89 */     BlockList.fire.a(BlockList.bs, 5, 20);
/*  55: 90 */     BlockList.fire.a(BlockList.bt, 5, 20);
/*  56: 91 */     BlockList.fire.a(BlockList.fence, 5, 20);
/*  57: 92 */     BlockList.fire.a(BlockList.aP, 5, 20);
/*  58: 93 */     BlockList.fire.a(BlockList.aQ, 5, 20);
/*  59: 94 */     BlockList.fire.a(BlockList.aR, 5, 20);
/*  60: 95 */     BlockList.fire.a(BlockList.darkOakFence, 5, 20);
/*  61: 96 */     BlockList.fire.a(BlockList.aT, 5, 20);
/*  62: 97 */     BlockList.fire.a(BlockList.ad, 5, 20);
/*  63: 98 */     BlockList.fire.a(BlockList.bV, 5, 20);
/*  64: 99 */     BlockList.fire.a(BlockList.bU, 5, 20);
/*  65:100 */     BlockList.fire.a(BlockList.bW, 5, 20);
/*  66:101 */     BlockList.fire.a(BlockList.log, 5, 5);
/*  67:102 */     BlockList.fire.a(BlockList.log2, 5, 5);
/*  68:103 */     BlockList.fire.a(BlockList.leaves, 30, 60);
/*  69:104 */     BlockList.fire.a(BlockList.leaves2, 30, 60);
/*  70:105 */     BlockList.fire.a(BlockList.bookshelf, 30, 20);
/*  71:106 */     BlockList.fire.a(BlockList.W, 15, 100);
/*  72:107 */     BlockList.fire.a(BlockList.tallgrass, 60, 100);
/*  73:108 */     BlockList.fire.a(BlockList.cF, 60, 100);
/*  74:109 */     BlockList.fire.a(BlockList.yellowFlower, 60, 100);
/*  75:110 */     BlockList.fire.a(BlockList.redFlower, 60, 100);
/*  76:111 */     BlockList.fire.a(BlockList.deadbush, 60, 100);
/*  77:112 */     BlockList.fire.a(BlockList.wool, 30, 60);
/*  78:113 */     BlockList.fire.a(BlockList.vine, 15, 100);
/*  79:114 */     BlockList.fire.a(BlockList.cA, 5, 5);
/*  80:115 */     BlockList.fire.a(BlockList.cx, 60, 20);
/*  81:116 */     BlockList.fire.a(BlockList.cy, 60, 20);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void a(ProtoBlock paramatr, int paramInt1, int paramInt2)
/*  85:    */   {
/*  86:120 */     this.S.put(paramatr, Integer.valueOf(paramInt1));
/*  87:121 */     this.T.put(paramatr, Integer.valueOf(paramInt2));
/*  88:    */   }
/*  89:    */   
/*  90:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  91:    */   {
/*  92:127 */     return null;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public boolean c()
/*  96:    */   {
/*  97:132 */     return false;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public boolean isOpaqueCube()
/* 101:    */   {
/* 102:137 */     return false;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public int a(Random paramRandom)
/* 106:    */   {
/* 107:142 */     return 0;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public int a(World paramaqu)
/* 111:    */   {
/* 112:147 */     return 30;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 116:    */   {
/* 117:152 */     if (!paramaqu.getGameRules().getBoolean("doFireTick")) {
/* 118:153 */       return;
/* 119:    */     }
/* 120:156 */     if (!c(paramaqu, paramdt)) {
/* 121:157 */       paramaqu.g(paramdt);
/* 122:    */     }
/* 123:160 */     ProtoBlock localatr = paramaqu.getBlock(paramdt.down()).getProto();
/* 124:161 */     int i = localatr == BlockList.netherrack ? 1 : 0;
/* 125:162 */     if (((paramaqu.t instanceof bgh)) && (localatr == BlockList.bedrock)) {
/* 126:163 */       i = 1;
/* 127:    */     }
/* 128:166 */     if ((i == 0) && (paramaqu.S()) && (d(paramaqu, paramdt)))
/* 129:    */     {
/* 130:167 */       paramaqu.g(paramdt);
/* 131:168 */       return;
/* 132:    */     }
/* 133:171 */     int j = ((Integer)parambec.getProperty(age)).intValue();
/* 134:172 */     if (j < 15)
/* 135:    */     {
/* 136:173 */       parambec = parambec.a(age, Integer.valueOf(j + paramRandom.nextInt(3) / 2));
/* 137:174 */       paramaqu.setBlock(paramdt, parambec, 4);
/* 138:    */     }
/* 139:177 */     paramaqu.a(paramdt, this, a(paramaqu) + paramRandom.nextInt(10));
/* 140:179 */     if (i == 0)
/* 141:    */     {
/* 142:180 */       if (!e(paramaqu, paramdt))
/* 143:    */       {
/* 144:181 */         if ((!World.isFlatSurface(paramaqu, paramdt.down())) || (j > 3)) {
/* 145:182 */           paramaqu.g(paramdt);
/* 146:    */         }
/* 147:184 */         return;
/* 148:    */       }
/* 149:187 */       if ((!e(paramaqu, paramdt.down())) && (j == 15) && (paramRandom.nextInt(4) == 0))
/* 150:    */       {
/* 151:188 */         paramaqu.g(paramdt);
/* 152:189 */         return;
/* 153:    */       }
/* 154:    */     }
/* 155:193 */     boolean bool = paramaqu.D(paramdt);
/* 156:194 */     int k = 0;
/* 157:195 */     if (bool) {
/* 158:196 */       k = -50;
/* 159:    */     }
/* 160:198 */     a(paramaqu, paramdt.east(), 300 + k, paramRandom, j);
/* 161:199 */     a(paramaqu, paramdt.west(), 300 + k, paramRandom, j);
/* 162:200 */     a(paramaqu, paramdt.down(), 250 + k, paramRandom, j);
/* 163:201 */     a(paramaqu, paramdt.up(), 250 + k, paramRandom, j);
/* 164:202 */     a(paramaqu, paramdt.north(), 300 + k, paramRandom, j);
/* 165:203 */     a(paramaqu, paramdt.south(), 300 + k, paramRandom, j);
/* 166:205 */     for (int m = -1; m <= 1; m++) {
/* 167:206 */       for (int n = -1; n <= 1; n++) {
/* 168:207 */         for (int i1 = -1; i1 <= 4; i1++) {
/* 169:208 */           if ((m != 0) || (i1 != 0) || (n != 0))
/* 170:    */           {
/* 171:212 */             int i2 = 100;
/* 172:213 */             if (i1 > 1) {
/* 173:214 */               i2 += (i1 - 1) * 100;
/* 174:    */             }
/* 175:217 */             BlockPosition localdt = paramdt.offset(m, i1, n);
/* 176:218 */             int i3 = m(paramaqu, localdt);
/* 177:219 */             if (i3 > 0)
/* 178:    */             {
/* 179:223 */               int i4 = (i3 + 40 + paramaqu.getDifficulty().a() * 7) / (j + 30);
/* 180:224 */               if (bool) {
/* 181:225 */                 i4 /= 2;
/* 182:    */               }
/* 183:227 */               if ((i4 > 0) && (paramRandom.nextInt(i2) <= i4) && (
/* 184:228 */                 (!paramaqu.S()) || (!d(paramaqu, localdt))))
/* 185:    */               {
/* 186:232 */                 int i5 = j + paramRandom.nextInt(5) / 4;
/* 187:233 */                 if (i5 > 15) {
/* 188:234 */                   i5 = 15;
/* 189:    */                 }
/* 190:236 */                 paramaqu.setBlock(localdt, parambec.a(age, Integer.valueOf(i5)), 3);
/* 191:    */               }
/* 192:    */             }
/* 193:    */           }
/* 194:    */         }
/* 195:    */       }
/* 196:    */     }
/* 197:    */   }
/* 198:    */   
/* 199:    */   protected boolean d(World paramaqu, BlockPosition paramdt)
/* 200:    */   {
/* 201:244 */     return (paramaqu.C(paramdt)) || (paramaqu.C(paramdt.west())) || (paramaqu.C(paramdt.east())) || (paramaqu.C(paramdt.north())) || (paramaqu.C(paramdt.south()));
/* 202:    */   }
/* 203:    */   
/* 204:    */   public boolean M()
/* 205:    */   {
/* 206:249 */     return false;
/* 207:    */   }
/* 208:    */   
/* 209:    */   private int c(ProtoBlock paramatr)
/* 210:    */   {
/* 211:253 */     Integer localInteger = (Integer)this.T.get(paramatr);
/* 212:254 */     return localInteger == null ? 0 : localInteger.intValue();
/* 213:    */   }
/* 214:    */   
/* 215:    */   private int d(ProtoBlock paramatr)
/* 216:    */   {
/* 217:258 */     Integer localInteger = (Integer)this.S.get(paramatr);
/* 218:259 */     return localInteger == null ? 0 : localInteger.intValue();
/* 219:    */   }
/* 220:    */   
/* 221:    */   private void a(World paramaqu, BlockPosition paramdt, int paramInt1, Random paramRandom, int paramInt2)
/* 222:    */   {
/* 223:263 */     int i = c(paramaqu.getBlock(paramdt).getProto());
/* 224:264 */     if (paramRandom.nextInt(paramInt1) < i)
/* 225:    */     {
/* 226:265 */       Block localbec = paramaqu.getBlock(paramdt);
/* 227:267 */       if ((paramRandom.nextInt(paramInt2 + 10) < 5) && (!paramaqu.C(paramdt)))
/* 228:    */       {
/* 229:268 */         int j = paramInt2 + paramRandom.nextInt(5) / 4;
/* 230:269 */         if (j > 15) {
/* 231:270 */           j = 15;
/* 232:    */         }
/* 233:272 */         paramaqu.setBlock(paramdt, instance().a(age, Integer.valueOf(j)), 3);
/* 234:    */       }
/* 235:    */       else
/* 236:    */       {
/* 237:274 */         paramaqu.g(paramdt);
/* 238:    */       }
/* 239:277 */       if (localbec.getProto() == BlockList.W) {
/* 240:278 */         BlockList.W.d(paramaqu, paramdt, localbec.a(bbk.a, Boolean.valueOf(true)));
/* 241:    */       }
/* 242:    */     }
/* 243:    */   }
/* 244:    */   
/* 245:    */   private boolean e(World paramaqu, BlockPosition paramdt)
/* 246:    */   {
/* 247:284 */     for (EnumDirection localej : EnumDirection.values()) {
/* 248:285 */       if (e(paramaqu, paramdt.a(localej))) {
/* 249:286 */         return true;
/* 250:    */       }
/* 251:    */     }
/* 252:290 */     return false;
/* 253:    */   }
/* 254:    */   
/* 255:    */   private int m(World paramaqu, BlockPosition paramdt)
/* 256:    */   {
/* 257:294 */     if (!paramaqu.isEmpty(paramdt)) {
/* 258:295 */       return 0;
/* 259:    */     }
/* 260:298 */     int i = 0;
/* 261:299 */     for (EnumDirection localej : EnumDirection.values()) {
/* 262:300 */       i = Math.max(d(paramaqu.getBlock(paramdt.a(localej)).getProto()), i);
/* 263:    */     }
/* 264:303 */     return i;
/* 265:    */   }
/* 266:    */   
/* 267:    */   public boolean y()
/* 268:    */   {
/* 269:308 */     return false;
/* 270:    */   }
/* 271:    */   
/* 272:    */   public boolean e(IBlockAccess paramard, BlockPosition paramdt)
/* 273:    */   {
/* 274:312 */     return d(paramard.getBlock(paramdt).getProto()) > 0;
/* 275:    */   }
/* 276:    */   
/* 277:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/* 278:    */   {
/* 279:317 */     return (World.isFlatSurface(paramaqu, paramdt.down())) || (e(paramaqu, paramdt));
/* 280:    */   }
/* 281:    */   
/* 282:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/* 283:    */   {
/* 284:322 */     if ((!World.isFlatSurface(paramaqu, paramdt.down())) && (!e(paramaqu, paramdt))) {
/* 285:323 */       paramaqu.g(paramdt);
/* 286:    */     }
/* 287:    */   }
/* 288:    */   
/* 289:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/* 290:    */   {
/* 291:329 */     if ((paramaqu.t.q() <= 0) && 
/* 292:330 */       (BlockList.aY.d(paramaqu, paramdt))) {
/* 293:331 */       return;
/* 294:    */     }
/* 295:334 */     if ((!World.isFlatSurface(paramaqu, paramdt.down())) && (!e(paramaqu, paramdt)))
/* 296:    */     {
/* 297:335 */       paramaqu.g(paramdt);
/* 298:336 */       return;
/* 299:    */     }
/* 300:339 */     paramaqu.a(paramdt, this, a(paramaqu) + paramaqu.rng.nextInt(10));
/* 301:    */   }
/* 302:    */   
/* 303:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 304:    */   {
/* 305:344 */     if (paramRandom.nextInt(24) == 0) {
/* 306:345 */       paramaqu.a(paramdt.getX() + 0.5F, paramdt.getY() + 0.5F, paramdt.getZ() + 0.5F, "fire.fire", 1.0F + paramRandom.nextFloat(), paramRandom.nextFloat() * 0.7F + 0.3F, false);
/* 307:    */     }
/* 308:    */     int i;
/* 309:    */     double d1;
/* 310:    */     double d2;
/* 311:    */     double d3;
/* 312:348 */     if ((World.isFlatSurface(paramaqu, paramdt.down())) || (BlockList.fire.e(paramaqu, paramdt.down())))
/* 313:    */     {
/* 314:349 */       for (i = 0; i < 3; i++)
/* 315:    */       {
/* 316:350 */         d1 = paramdt.getX() + paramRandom.nextDouble();
/* 317:351 */         d2 = paramdt.getY() + paramRandom.nextDouble() * 0.5D + 0.5D;
/* 318:352 */         d3 = paramdt.getZ() + paramRandom.nextDouble();
/* 319:353 */         paramaqu.a(EnumParticleEffect.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 320:    */       }
/* 321:    */     }
/* 322:    */     else
/* 323:    */     {
/* 324:356 */       if (BlockList.fire.e(paramaqu, paramdt.west())) {
/* 325:357 */         for (i = 0; i < 2; i++)
/* 326:    */         {
/* 327:358 */           d1 = paramdt.getX() + paramRandom.nextDouble() * 0.1000000014901161D;
/* 328:359 */           d2 = paramdt.getY() + paramRandom.nextDouble();
/* 329:360 */           d3 = paramdt.getZ() + paramRandom.nextDouble();
/* 330:361 */           paramaqu.a(EnumParticleEffect.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 331:    */         }
/* 332:    */       }
/* 333:364 */       if (BlockList.fire.e(paramaqu, paramdt.east())) {
/* 334:365 */         for (i = 0; i < 2; i++)
/* 335:    */         {
/* 336:366 */           d1 = paramdt.getX() + 1 - paramRandom.nextDouble() * 0.1000000014901161D;
/* 337:367 */           d2 = paramdt.getY() + paramRandom.nextDouble();
/* 338:368 */           d3 = paramdt.getZ() + paramRandom.nextDouble();
/* 339:369 */           paramaqu.a(EnumParticleEffect.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 340:    */         }
/* 341:    */       }
/* 342:372 */       if (BlockList.fire.e(paramaqu, paramdt.north())) {
/* 343:373 */         for (i = 0; i < 2; i++)
/* 344:    */         {
/* 345:374 */           d1 = paramdt.getX() + paramRandom.nextDouble();
/* 346:375 */           d2 = paramdt.getY() + paramRandom.nextDouble();
/* 347:376 */           d3 = paramdt.getZ() + paramRandom.nextDouble() * 0.1000000014901161D;
/* 348:377 */           paramaqu.a(EnumParticleEffect.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 349:    */         }
/* 350:    */       }
/* 351:380 */       if (BlockList.fire.e(paramaqu, paramdt.south())) {
/* 352:381 */         for (i = 0; i < 2; i++)
/* 353:    */         {
/* 354:382 */           d1 = paramdt.getX() + paramRandom.nextDouble();
/* 355:383 */           d2 = paramdt.getY() + paramRandom.nextDouble();
/* 356:384 */           d3 = paramdt.getZ() + 1 - paramRandom.nextDouble() * 0.1000000014901161D;
/* 357:385 */           paramaqu.a(EnumParticleEffect.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 358:    */         }
/* 359:    */       }
/* 360:388 */       if (BlockList.fire.e(paramaqu, paramdt.up())) {
/* 361:389 */         for (i = 0; i < 2; i++)
/* 362:    */         {
/* 363:390 */           d1 = paramdt.getX() + paramRandom.nextDouble();
/* 364:391 */           d2 = paramdt.getY() + 1 - paramRandom.nextDouble() * 0.1000000014901161D;
/* 365:392 */           d3 = paramdt.getZ() + paramRandom.nextDouble();
/* 366:393 */           paramaqu.a(EnumParticleEffect.m, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 367:    */         }
/* 368:    */       }
/* 369:    */     }
/* 370:    */   }
/* 371:    */   
/* 372:    */   public MapColor g(Block parambec)
/* 373:    */   {
/* 374:401 */     return MapColor.f;
/* 375:    */   }
/* 376:    */   
/* 377:    */   public aql k()
/* 378:    */   {
/* 379:406 */     return aql.c;
/* 380:    */   }
/* 381:    */   
/* 382:    */   public Block a(int paramInt)
/* 383:    */   {
/* 384:411 */     return instance().a(age, Integer.valueOf(paramInt));
/* 385:    */   }
/* 386:    */   
/* 387:    */   public int c(Block parambec)
/* 388:    */   {
/* 389:417 */     return ((Integer)parambec.getProperty(age)).intValue();
/* 390:    */   }
/* 391:    */   
/* 392:    */   protected bed e()
/* 393:    */   {
/* 394:422 */     return new bed(this, new IBlockData[] { age, north, east, south, west, upper, flip, alt });
/* 395:    */   }
/* 396:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avx
 * JD-Core Version:    0.7.0.1
 */
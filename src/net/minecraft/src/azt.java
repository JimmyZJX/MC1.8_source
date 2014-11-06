package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Sets;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.EnumSet;
/*   5:    */ import java.util.Iterator;
/*   6:    */ import java.util.Random;
/*   7:    */ import java.util.Set;
/*   8:    */ 
/*   9:    */ public class azt
/*  10:    */   extends ProtoBlock
/*  11:    */ {
/*  12: 30 */   public static final bev a = bev.a("north", azu.class);
/*  13: 31 */   public static final bev b = bev.a("east", azu.class);
/*  14: 32 */   public static final bev M = bev.a("south", azu.class);
/*  15: 33 */   public static final bev N = bev.a("west", azu.class);
/*  16: 34 */   public static final bew O = bew.a("power", 0, 15);
/*  17: 36 */   private boolean P = true;
/*  18: 37 */   private final Set<BlockPosition> Q = Sets.newHashSet();
/*  19:    */   
/*  20:    */   public azt()
/*  21:    */   {
/*  22: 40 */     super(Material.q);
/*  23: 41 */     j(this.L.b().a(a, azu.c).a(b, azu.c).a(M, azu.c).a(N, azu.c).a(O, Integer.valueOf(0)));
/*  24: 42 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
/*  25:    */   }
/*  26:    */   
/*  27:    */   public Block a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/*  28:    */   {
/*  29: 47 */     parambec = parambec.a(N, c(paramard, paramdt, EnumDirection.WEST));
/*  30: 48 */     parambec = parambec.a(b, c(paramard, paramdt, EnumDirection.EAST));
/*  31: 49 */     parambec = parambec.a(a, c(paramard, paramdt, EnumDirection.NORTH));
/*  32: 50 */     parambec = parambec.a(M, c(paramard, paramdt, EnumDirection.SOUTH));
/*  33:    */     
/*  34: 52 */     return parambec;
/*  35:    */   }
/*  36:    */   
/*  37:    */   private azu c(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/*  38:    */   {
/*  39: 56 */     BlockPosition localdt = paramdt.a(paramej);
/*  40: 57 */     ProtoBlock localatr1 = paramard.getBlock(paramdt.a(paramej)).getProto();
/*  41: 59 */     if ((a(paramard.getBlock(localdt), paramej)) || ((!localatr1.s()) && (d(paramard.getBlock(localdt.down()))))) {
/*  42: 60 */       return azu.b;
/*  43:    */     }
/*  44: 63 */     ProtoBlock localatr2 = paramard.getBlock(paramdt.up()).getProto();
/*  45: 64 */     if ((!localatr2.s()) && (localatr1.s()) && (d(paramard.getBlock(localdt.up())))) {
/*  46: 65 */       return azu.a;
/*  47:    */     }
/*  48: 68 */     return azu.c;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  52:    */   {
/*  53: 74 */     return null;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean c()
/*  57:    */   {
/*  58: 79 */     return false;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public boolean isOpaqueCube()
/*  62:    */   {
/*  63: 84 */     return false;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public int a(IBlockAccess paramard, BlockPosition paramdt, int paramInt)
/*  67:    */   {
/*  68: 89 */     Block localbec = paramard.getBlock(paramdt);
/*  69: 91 */     if (localbec.getProto() != this) {
/*  70: 92 */       return super.a(paramard, paramdt, paramInt);
/*  71:    */     }
/*  72: 95 */     return b(((Integer)localbec.getProperty(O)).intValue());
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/*  76:    */   {
/*  77:100 */     return (World.isFlatSurface(paramaqu, paramdt.down())) || (paramaqu.getBlock(paramdt.down()).getProto() == BlockList.aX);
/*  78:    */   }
/*  79:    */   
/*  80:    */   private Block e(World paramaqu, BlockPosition paramdt, Block parambec)
/*  81:    */   {
/*  82:104 */     parambec = a(paramaqu, paramdt, paramdt, parambec);
/*  83:    */     
/*  84:106 */     ArrayList<BlockPosition> localArrayList = Lists.newArrayList(this.Q);
/*  85:107 */     this.Q.clear();
/*  86:108 */     for (BlockPosition localdt : localArrayList) {
/*  87:109 */       paramaqu.c(localdt, this);
/*  88:    */     }
/*  89:112 */     return parambec;
/*  90:    */   }
/*  91:    */   
/*  92:    */   private Block a(World paramaqu, BlockPosition paramdt1, BlockPosition paramdt2, Block parambec)
/*  93:    */   {
/*  94:116 */     Block localbec = parambec;
/*  95:117 */     int i = ((Integer)localbec.getProperty(O)).intValue();
/*  96:118 */     int j = 0;
/*  97:    */     
/*  98:120 */     j = a(paramaqu, paramdt2, j);
/*  99:    */     
/* 100:122 */     this.P = false;
/* 101:123 */     int k = paramaqu.A(paramdt1);
/* 102:124 */     this.P = true;
/* 103:126 */     if ((k > 0) && (k > j - 1)) {
/* 104:127 */       j = k;
/* 105:    */     }
/* 106:130 */     int m = 0;
/* 107:131 */     for (Iterator<EnumDirection> localObject = en.HORIZONTAL.iterator(); (localObject).hasNext();)
/* 108:    */     {
/* 109:131 */       EnumDirection localej1 = (EnumDirection)(localObject).next();
/* 110:132 */       BlockPosition localdt = paramdt1.a(localej1);
/* 111:133 */       int i2 = (localdt.getX() != paramdt2.getX()) || (localdt.getZ() != paramdt2.getZ()) ? 1 : 0;
/* 112:135 */       if (i2 != 0) {
/* 113:136 */         m = a(paramaqu, localdt, m);
/* 114:    */       }
/* 115:138 */       if ((paramaqu.getBlock(localdt).getProto().blocksMovement()) && (!paramaqu.getBlock(paramdt1.up()).getProto().blocksMovement()))
/* 116:    */       {
/* 117:139 */         if ((i2 != 0) && (paramdt1.getY() >= paramdt2.getY())) {
/* 118:140 */           m = a(paramaqu, localdt.up(), m);
/* 119:    */         }
/* 120:    */       }
/* 121:142 */       else if ((!paramaqu.getBlock(localdt).getProto().blocksMovement()) && 
/* 122:143 */         (i2 != 0) && (paramdt1.getY() <= paramdt2.getY())) {
/* 123:144 */         m = a(paramaqu, localdt.down(), m);
/* 124:    */       }
/* 125:    */     }
/* 126:148 */     if (m > j) {
/* 127:149 */       j = m - 1;
/* 128:150 */     } else if (j > 0) {
/* 129:151 */       j--;
/* 130:    */     } else {
/* 131:153 */       j = 0;
/* 132:    */     }
/* 133:156 */     if (k > j - 1) {
/* 134:157 */       j = k;
/* 135:    */     }
/* 136:160 */     if (i != j)
/* 137:    */     {
/* 138:161 */       parambec = parambec.a(O, Integer.valueOf(j));
/* 139:163 */       if (paramaqu.getBlock(paramdt1) == localbec) {
/* 140:164 */         paramaqu.setBlock(paramdt1, parambec, 2);
/* 141:    */       }
/* 142:167 */       this.Q.add(paramdt1);
/* 143:168 */       for (EnumDirection localej2 : EnumDirection.values()) {
/* 144:169 */         this.Q.add(paramdt1.a(localej2));
/* 145:    */       }
/* 146:    */     }
/* 147:173 */     return parambec;
/* 148:    */   }
/* 149:    */   
/* 150:    */   private void d(World paramaqu, BlockPosition paramdt)
/* 151:    */   {
/* 152:177 */     if (paramaqu.getBlock(paramdt).getProto() != this) {
/* 153:178 */       return;
/* 154:    */     }
/* 155:181 */     paramaqu.c(paramdt, this);
/* 156:182 */     for (EnumDirection localej : EnumDirection.values()) {
/* 157:183 */       paramaqu.c(paramdt.a(localej), this);
/* 158:    */     }
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/* 162:    */   {
/* 163:189 */     if (paramaqu.isClient) {
/* 164:190 */       return;
/* 165:    */     }
/* 166:193 */     e(paramaqu, paramdt, parambec);
				  Iterator<EnumDirection> localIterator;
/* 172:    */     EnumDirection localej;
/* 167:195 */     for (localIterator = en.VERTICAL.iterator(); localIterator.hasNext();)
/* 168:    */     {
/* 169:195 */       localej = localIterator.next();
/* 170:196 */       paramaqu.c(paramdt.a(localej), this);
/* 171:    */     }
/* 173:199 */     for (localIterator = en.HORIZONTAL.iterator(); localIterator.hasNext();)
/* 174:    */     {
/* 175:199 */       localej = localIterator.next();
/* 176:200 */       d(paramaqu, paramdt.a(localej));
/* 177:    */     }
/* 178:203 */     for (localIterator = en.HORIZONTAL.iterator(); localIterator.hasNext();)
/* 179:    */     {
/* 180:203 */       localej = localIterator.next();
/* 181:204 */       BlockPosition localdt = paramdt.a(localej);
/* 182:206 */       if (paramaqu.getBlock(localdt).getProto().blocksMovement()) {
/* 183:207 */         d(paramaqu, localdt.up());
/* 184:    */       } else {
/* 185:209 */         d(paramaqu, localdt.down());
/* 186:    */       }
/* 187:    */     }
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/* 191:    */   {
/* 192:216 */     super.b(paramaqu, paramdt, parambec);
/* 193:217 */     if (paramaqu.isClient) {
/* 194:218 */       return;
/* 195:    */     }
/* 196:221 */     for (EnumDirection localej2 : EnumDirection.values()) {
/* 197:222 */       paramaqu.c(paramdt.a(localej2), this);
/* 198:    */     }
/* 199:224 */     e(paramaqu, paramdt, parambec);
				  Iterator<EnumDirection> localIterator;
/* 205:    */     EnumDirection localej1;
/* 200:226 */     for (localIterator = en.HORIZONTAL.iterator(); localIterator.hasNext();)
/* 201:    */     {
/* 202:226 */       localej1 = localIterator.next();
/* 203:227 */       d(paramaqu, paramdt.a(localej1));
/* 204:    */     }
/* 206:230 */     for (localIterator = en.HORIZONTAL.iterator(); localIterator.hasNext();)
/* 207:    */     {
/* 208:230 */       localej1 = localIterator.next();
/* 209:231 */       BlockPosition localdt = paramdt.a(localej1);
/* 210:233 */       if (paramaqu.getBlock(localdt).getProto().blocksMovement()) {
/* 211:234 */         d(paramaqu, localdt.up());
/* 212:    */       } else {
/* 213:236 */         d(paramaqu, localdt.down());
/* 214:    */       }
/* 215:    */     }
/* 216:    */   }
/* 217:    */   
/* 218:    */   private int a(World paramaqu, BlockPosition paramdt, int paramInt)
/* 219:    */   {
/* 220:242 */     if (paramaqu.getBlock(paramdt).getProto() != this) {
/* 221:243 */       return paramInt;
/* 222:    */     }
/* 223:245 */     int i = ((Integer)paramaqu.getBlock(paramdt).getProperty(O)).intValue();
/* 224:246 */     if (i > paramInt) {
/* 225:247 */       return i;
/* 226:    */     }
/* 227:249 */     return paramInt;
/* 228:    */   }
/* 229:    */   
/* 230:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/* 231:    */   {
/* 232:254 */     if (paramaqu.isClient) {
/* 233:255 */       return;
/* 234:    */     }
/* 235:258 */     if (c(paramaqu, paramdt))
/* 236:    */     {
/* 237:259 */       e(paramaqu, paramdt, parambec);
/* 238:    */     }
/* 239:    */     else
/* 240:    */     {
/* 241:261 */       b(paramaqu, paramdt, parambec, 0);
/* 242:262 */       paramaqu.g(paramdt);
/* 243:    */     }
/* 244:    */   }
/* 245:    */   
/* 246:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 247:    */   {
/* 248:269 */     return ItemList.aC;
/* 249:    */   }
/* 250:    */   
/* 251:    */   public int b(IBlockAccess paramard, BlockPosition paramdt, Block parambec, EnumDirection paramej)
/* 252:    */   {
/* 253:274 */     if (!this.P) {
/* 254:275 */       return 0;
/* 255:    */     }
/* 256:277 */     return a(paramard, paramdt, parambec, paramej);
/* 257:    */   }
/* 258:    */   
/* 259:    */   public int a(IBlockAccess paramard, BlockPosition paramdt, Block parambec, EnumDirection paramej)
/* 260:    */   {
/* 261:282 */     if (!this.P) {
/* 262:283 */       return 0;
/* 263:    */     }
/* 264:286 */     int i = ((Integer)parambec.getProperty(O)).intValue();
/* 265:287 */     if (i == 0) {
/* 266:288 */       return 0;
/* 267:    */     }
/* 268:291 */     if (paramej == EnumDirection.UP) {
/* 269:292 */       return i;
/* 270:    */     }
/* 271:295 */     EnumSet<EnumDirection> localEnumSet = EnumSet.noneOf(EnumDirection.class);
/* 272:296 */     for (EnumDirection localej : en.HORIZONTAL) {
/* 273:297 */       if (d(paramard, paramdt, localej)) {
/* 274:298 */         localEnumSet.add(localej);
/* 275:    */       }
/* 276:    */     }
/* 277:302 */     if ((paramej.k().c()) && (localEnumSet.isEmpty())) {
/* 278:303 */       return i;
/* 279:    */     }
/* 280:306 */     if ((localEnumSet.contains(paramej)) && (!localEnumSet.contains(paramej.f())) && (!localEnumSet.contains(paramej.e()))) {
/* 281:307 */       return i;
/* 282:    */     }
/* 283:310 */     return 0;
/* 284:    */   }
/* 285:    */   
/* 286:    */   private boolean d(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/* 287:    */   {
/* 288:314 */     BlockPosition localdt = paramdt.a(paramej);
/* 289:315 */     Block localbec = paramard.getBlock(localdt);
/* 290:316 */     ProtoBlock localatr = localbec.getProto();
/* 291:317 */     boolean bool1 = localatr.blocksMovement();
/* 292:    */     
/* 293:319 */     boolean bool2 = paramard.getBlock(paramdt.up()).getProto().blocksMovement();
/* 294:320 */     if ((!bool2) && (bool1) && (e(paramard, localdt.up()))) {
/* 295:321 */       return true;
/* 296:    */     }
/* 297:323 */     if (a(localbec, paramej)) {
/* 298:324 */       return true;
/* 299:    */     }
/* 300:326 */     if ((localatr == BlockList.bc) && (localbec.getProperty(ava.N) == paramej)) {
/* 301:327 */       return true;
/* 302:    */     }
/* 303:329 */     if ((!bool1) && (e(paramard, localdt.down()))) {
/* 304:330 */       return true;
/* 305:    */     }
/* 306:333 */     return false;
/* 307:    */   }
/* 308:    */   
/* 309:    */   protected static boolean e(IBlockAccess paramard, BlockPosition paramdt)
/* 310:    */   {
/* 311:337 */     return d(paramard.getBlock(paramdt));
/* 312:    */   }
/* 313:    */   
/* 314:    */   protected static boolean d(Block parambec)
/* 315:    */   {
/* 316:341 */     return a(parambec, null);
/* 317:    */   }
/* 318:    */   
/* 319:    */   protected static boolean a(Block parambec, EnumDirection paramej)
/* 320:    */   {
/* 321:345 */     ProtoBlock localatr = parambec.getProto();
/* 322:346 */     if (localatr == BlockList.af) {
/* 323:347 */       return true;
/* 324:    */     }
/* 325:350 */     if (BlockList.bb.e(localatr))
/* 326:    */     {
/* 327:351 */       EnumDirection localej = (EnumDirection)parambec.getProperty(azz.N);
/* 328:352 */       return (localej == paramej) || (localej.d() == paramej);
/* 329:    */     }
/* 330:355 */     return (localatr.protoBlock_g()) && (paramej != null);
/* 331:    */   }
/* 332:    */   
/* 333:    */   public boolean protoBlock_g()
/* 334:    */   {
/* 335:360 */     return this.P;
/* 336:    */   }
/* 337:    */   
/* 338:    */   private int b(int paramInt)
/* 339:    */   {
/* 340:364 */     float f1 = paramInt / 15.0F;
/* 341:365 */     float f2 = f1 * 0.6F + 0.4F;
/* 342:366 */     if (paramInt == 0) {
/* 343:367 */       f2 = 0.3F;
/* 344:    */     }
/* 345:370 */     float f3 = f1 * f1 * 0.7F - 0.5F;
/* 346:371 */     float f4 = f1 * f1 * 0.6F - 0.7F;
/* 347:372 */     if (f3 < 0.0F) {
/* 348:373 */       f3 = 0.0F;
/* 349:    */     }
/* 350:375 */     if (f4 < 0.0F) {
/* 351:376 */       f4 = 0.0F;
/* 352:    */     }
/* 353:379 */     int i = MathUtils.clamp((int)(f2 * 255.0F), 0, 255);
/* 354:380 */     int j = MathUtils.clamp((int)(f3 * 255.0F), 0, 255);
/* 355:381 */     int k = MathUtils.clamp((int)(f4 * 255.0F), 0, 255);
/* 356:382 */     return 0xFF000000 | i << 16 | j << 8 | k;
/* 357:    */   }
/* 358:    */   
/* 359:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 360:    */   {
/* 361:387 */     int i = ((Integer)parambec.getProperty(O)).intValue();
/* 362:388 */     if (i == 0) {
/* 363:389 */       return;
/* 364:    */     }
/* 365:392 */     double d1 = paramdt.getX() + 0.5D + (paramRandom.nextFloat() - 0.5D) * 0.2D;
/* 366:393 */     double d2 = paramdt.getY() + 0.0625F;
/* 367:394 */     double d3 = paramdt.getZ() + 0.5D + (paramRandom.nextFloat() - 0.5D) * 0.2D;
/* 368:    */     
/* 369:    */ 
/* 370:397 */     float f1 = i / 15.0F;
/* 371:398 */     float f2 = f1 * 0.6F + 0.4F;
/* 372:399 */     float f3 = Math.max(0.0F, f1 * f1 * 0.7F - 0.5F);
/* 373:400 */     float f4 = Math.max(0.0F, f1 * f1 * 0.6F - 0.7F);
/* 374:    */     
/* 375:402 */     paramaqu.a(ew.E, d1, d2, d3, f2, f3, f4, new int[0]);
/* 376:    */   }
/* 377:    */   
/* 378:    */   public Item b(World paramaqu, BlockPosition paramdt)
/* 379:    */   {
/* 380:407 */     return ItemList.aC;
/* 381:    */   }
/* 382:    */   
/* 383:    */   public aql k()
/* 384:    */   {
/* 385:412 */     return aql.c;
/* 386:    */   }
/* 387:    */   
/* 388:    */   public Block a(int paramInt)
/* 389:    */   {
/* 390:417 */     return instance().a(O, Integer.valueOf(paramInt));
/* 391:    */   }
/* 392:    */   
/* 393:    */   public int c(Block parambec)
/* 394:    */   {
/* 395:423 */     return ((Integer)parambec.getProperty(O)).intValue();
/* 396:    */   }
/* 397:    */   
/* 398:    */   protected bed e()
/* 399:    */   {
/* 400:428 */     return new bed(this, new bex[] { a, b, M, N, O });
/* 401:    */   }
/* 402:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azt
 * JD-Core Version:    0.7.0.1
 */
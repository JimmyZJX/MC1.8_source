package net.minecraft.src;
/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bbv
/*   5:    */   extends ProtoBlock
/*   6:    */ {
/*   7: 27 */   public static final BlockDataBoolean a = BlockDataBoolean.getInstance("up");
/*   8: 28 */   public static final BlockDataBoolean b = BlockDataBoolean.getInstance("north");
/*   9: 29 */   public static final BlockDataBoolean M = BlockDataBoolean.getInstance("east");
/*  10: 30 */   public static final BlockDataBoolean N = BlockDataBoolean.getInstance("south");
/*  11: 31 */   public static final BlockDataBoolean O = BlockDataBoolean.getInstance("west");
/*  12: 32 */   public static final BlockDataBoolean[] P = { a, b, N, O, M };
/*  13: 34 */   public static final int Q = b(EnumDirection.SOUTH);
/*  14: 35 */   public static final int R = b(EnumDirection.NORTH);
/*  15: 36 */   public static final int S = b(EnumDirection.EAST);
/*  16: 37 */   public static final int T = b(EnumDirection.WEST);
/*  17:    */   
/*  18:    */   public bbv()
/*  19:    */   {
/*  20: 40 */     super(Material.l);
/*  21: 41 */     j(this.L.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)));
/*  22: 42 */     a(true);
/*  23: 43 */     setCreativeTab(CreativeTabs.tabDeco);
/*  24:    */   }
/*  25:    */   
/*  26:    */   public Block a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/*  27:    */   {
/*  28: 48 */     return parambec.a(a, Boolean.valueOf(paramard.getBlock(paramdt.up()).getProto().s()));
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void h()
/*  32:    */   {
/*  33: 53 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public boolean c()
/*  37:    */   {
/*  38: 58 */     return false;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public boolean isOpaqueCube()
/*  42:    */   {
/*  43: 63 */     return false;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public boolean f(World paramaqu, BlockPosition paramdt)
/*  47:    */   {
/*  48: 68 */     return true;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  52:    */   {
/*  53: 73 */     float f1 = 0.0625F;
/*  54:    */     
/*  55: 75 */     float f2 = 1.0F;
/*  56: 76 */     float f3 = 1.0F;
/*  57: 77 */     float f4 = 1.0F;
/*  58: 78 */     float f5 = 0.0F;
/*  59: 79 */     float f6 = 0.0F;
/*  60: 80 */     float f7 = 0.0F;
/*  61: 81 */     int i = 0;
/*  62: 83 */     if (((Boolean)paramard.getBlock(paramdt).getProperty(O)).booleanValue())
/*  63:    */     {
/*  64: 84 */       f5 = Math.max(f5, 0.0625F);
/*  65: 85 */       f2 = 0.0F;
/*  66: 86 */       f3 = 0.0F;
/*  67: 87 */       f6 = 1.0F;
/*  68: 88 */       f4 = 0.0F;
/*  69: 89 */       f7 = 1.0F;
/*  70: 90 */       i = 1;
/*  71:    */     }
/*  72: 92 */     if (((Boolean)paramard.getBlock(paramdt).getProperty(M)).booleanValue())
/*  73:    */     {
/*  74: 93 */       f2 = Math.min(f2, 0.9375F);
/*  75: 94 */       f5 = 1.0F;
/*  76: 95 */       f3 = 0.0F;
/*  77: 96 */       f6 = 1.0F;
/*  78: 97 */       f4 = 0.0F;
/*  79: 98 */       f7 = 1.0F;
/*  80: 99 */       i = 1;
/*  81:    */     }
/*  82:101 */     if (((Boolean)paramard.getBlock(paramdt).getProperty(b)).booleanValue())
/*  83:    */     {
/*  84:102 */       f7 = Math.max(f7, 0.0625F);
/*  85:103 */       f4 = 0.0F;
/*  86:104 */       f2 = 0.0F;
/*  87:105 */       f5 = 1.0F;
/*  88:106 */       f3 = 0.0F;
/*  89:107 */       f6 = 1.0F;
/*  90:108 */       i = 1;
/*  91:    */     }
/*  92:110 */     if (((Boolean)paramard.getBlock(paramdt).getProperty(N)).booleanValue())
/*  93:    */     {
/*  94:111 */       f4 = Math.min(f4, 0.9375F);
/*  95:112 */       f7 = 1.0F;
/*  96:113 */       f2 = 0.0F;
/*  97:114 */       f5 = 1.0F;
/*  98:115 */       f3 = 0.0F;
/*  99:116 */       f6 = 1.0F;
/* 100:117 */       i = 1;
/* 101:    */     }
/* 102:119 */     if ((i == 0) && (c(paramard.getBlock(paramdt.up()).getProto())))
/* 103:    */     {
/* 104:120 */       f3 = Math.min(f3, 0.9375F);
/* 105:121 */       f6 = 1.0F;
/* 106:122 */       f2 = 0.0F;
/* 107:123 */       f5 = 1.0F;
/* 108:124 */       f4 = 0.0F;
/* 109:125 */       f7 = 1.0F;
/* 110:    */     }
/* 111:127 */     a(f2, f3, f4, f5, f6, f7);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/* 115:    */   {
/* 116:133 */     return null;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public boolean a(World paramaqu, BlockPosition paramdt, EnumDirection paramej)
/* 120:    */   {
/* 121:138 */     switch (bbw.a[paramej.ordinal()])
/* 122:    */     {
/* 123:    */     default: 
/* 124:140 */       return false;
/* 125:    */     case 1: 
/* 126:142 */       return c(paramaqu.getBlock(paramdt.up()).getProto());
/* 127:    */     }
/* 128:147 */     return c(paramaqu.getBlock(paramdt.a(paramej.d())).getProto());
/* 129:    */   }
/* 130:    */   
/* 131:    */   private boolean c(ProtoBlock paramatr)
/* 132:    */   {
/* 133:152 */     return (paramatr.isOpaqueCube()) && (paramatr.material.c());
/* 134:    */   }
/* 135:    */   
/* 136:    */   private boolean e(World paramaqu, BlockPosition paramdt, Block parambec)
/* 137:    */   {
/* 138:156 */     Block localbec1 = parambec;
/* 139:158 */     for (EnumDirection localej : en.HORIZONTAL)
/* 140:    */     {
/* 141:159 */       BlockDataBoolean localbet = a(localej);
/* 142:161 */       if ((((Boolean)parambec.getProperty(localbet)).booleanValue()) && 
/* 143:162 */         (!c(paramaqu.getBlock(paramdt.a(localej)).getProto())))
/* 144:    */       {
/* 145:164 */         Block localbec2 = paramaqu.getBlock(paramdt.up());
/* 146:165 */         if ((localbec2.getProto() != this) || (!((Boolean)localbec2.getProperty(localbet)).booleanValue())) {
/* 147:166 */           parambec = parambec.a(localbet, Boolean.valueOf(false));
/* 148:    */         }
/* 149:    */       }
/* 150:    */     }
/* 151:172 */     if (d(parambec) == 0) {
/* 152:174 */       return false;
/* 153:    */     }
/* 154:177 */     if (localbec1 != parambec) {
/* 155:178 */       paramaqu.setBlock(paramdt, parambec, 2);
/* 156:    */     }
/* 157:181 */     return true;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public int F()
/* 161:    */   {
/* 162:186 */     return aqp.c();
/* 163:    */   }
/* 164:    */   
/* 165:    */   public int h(Block parambec)
/* 166:    */   {
/* 167:191 */     return aqp.c();
/* 168:    */   }
/* 169:    */   
/* 170:    */   public int a(IBlockAccess paramard, BlockPosition paramdt, int paramInt)
/* 171:    */   {
/* 172:196 */     return paramard.b(paramdt).c(paramdt);
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/* 176:    */   {
/* 177:201 */     if ((!paramaqu.isClient) && (!e(paramaqu, paramdt, parambec)))
/* 178:    */     {
/* 179:202 */       b(paramaqu, paramdt, parambec, 0);
/* 180:203 */       paramaqu.g(paramdt);
/* 181:    */     }
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 185:    */   {
/* 186:209 */     if (paramaqu.isClient) {
/* 187:210 */       return;
/* 188:    */     }
/* 189:212 */     if (paramaqu.rng.nextInt(4) != 0) {
/* 190:213 */       return;
/* 191:    */     }
/* 192:216 */     int i = 4;
/* 193:217 */     int j = 5;
/* 194:218 */     int k = 0;
				  boolean flag = false;
/* 195:219 */     for (int m = -i; m <= i; m++) {
/* 196:220 */       for (int n = -i; n <= i; n++) {
/* 197:221 */         for (int i1 = -1; i1 <= 1; i1++) {
/* 198:222 */           if (paramaqu.getBlock(paramdt.offset(m, i1, n)).getProto() == this)
/* 199:    */           {
/* 200:222 */             j--;
/* 201:222 */             if (j <= 0)
/* 202:    */             {
/* 203:223 */               k = 1;
							flag = true;
/* 204:    */               break;
/* 205:    */             }
/* 206:    */           }
/* 207:    */         }
					  if(flag) break;
/* 208:    */       }
					if(flag) break;
/* 209:    */     }
/* 211:230 */     EnumDirection localej1 = EnumDirection.a(paramRandom);
/* 212:    */     Object localObject1;
/* 213:    */     Object localObject2;
/* 214:    */     Object localObject3;
/* 215:232 */     if ((localej1 == EnumDirection.UP) && (paramdt.getY() < 255) && (paramaqu.isEmpty(paramdt.up())))
/* 216:    */     {
/* 217:233 */       if (k != 0) {
/* 218:234 */         return;
/* 219:    */       }
/* 220:238 */       localObject1 = parambec;
/* 221:239 */       for (localObject2 = en.HORIZONTAL.iterator(); ((Iterator)localObject2).hasNext();)
/* 222:    */       {
/* 223:239 */         localObject3 = (EnumDirection)((Iterator)localObject2).next();
/* 224:240 */         if ((paramRandom.nextBoolean()) || (!c(paramaqu.getBlock(paramdt.a((EnumDirection)localObject3).up()).getProto()))) {
/* 225:241 */           localObject1 = ((Block)localObject1).a(a((EnumDirection)localObject3), Boolean.valueOf(false));
/* 226:    */         }
/* 227:    */       }
/* 228:244 */       if ((((Boolean)((Block)localObject1).getProperty(b)).booleanValue()) || (((Boolean)((Block)localObject1).getProperty(M)).booleanValue()) || (((Boolean)((Block)localObject1).getProperty(N)).booleanValue()) || (((Boolean)((Block)localObject1).getProperty(O)).booleanValue())) {
/* 229:245 */         paramaqu.setBlock(paramdt.up(), (Block)localObject1, 2);
/* 230:    */       }
/* 231:    */       return;
/* 232:    */     }
/* 233:    */     Object localObject4;
/* 234:    */     Object localObject5;
/* 235:250 */     if ((localej1.k().c()) && (!((Boolean)parambec.getProperty(a(localej1))).booleanValue()))
/* 236:    */     {
/* 237:251 */       if (k != 0) {
/* 238:252 */         return;
/* 239:    */       }
/* 240:255 */       localObject1 = paramdt.a(localej1);
/* 241:    */       
/* 242:257 */       localObject2 = paramaqu.getBlock((BlockPosition)localObject1).getProto();
/* 243:258 */       if (((ProtoBlock)localObject2).material == Material.air)
/* 244:    */       {
/* 245:261 */         localObject3 = localej1.e();
/* 246:262 */         localObject4 = localej1.f();
/* 247:    */         
/* 248:    */ 
/* 249:265 */         boolean bool1 = ((Boolean)parambec.getProperty(a((EnumDirection)localObject3))).booleanValue();
/* 250:266 */         boolean bool2 = ((Boolean)parambec.getProperty(a((EnumDirection)localObject4))).booleanValue();
/* 251:    */         
/* 252:268 */         localObject5 = ((BlockPosition)localObject1).a((EnumDirection)localObject3);
/* 253:269 */         BlockPosition localdt = ((BlockPosition)localObject1).a((EnumDirection)localObject4);
/* 254:271 */         if ((bool1) && (c(paramaqu.getBlock((BlockPosition)localObject5).getProto()))) {
/* 255:272 */           paramaqu.setBlock((BlockPosition)localObject1, instance().a(a((EnumDirection)localObject3), Boolean.valueOf(true)), 2);
/* 256:273 */         } else if ((bool2) && (c(paramaqu.getBlock(localdt).getProto()))) {
/* 257:274 */           paramaqu.setBlock((BlockPosition)localObject1, instance().a(a((EnumDirection)localObject4), Boolean.valueOf(true)), 2);
/* 258:277 */         } else if ((bool1) && (paramaqu.isEmpty((BlockPosition)localObject5)) && (c(paramaqu.getBlock(paramdt.a((EnumDirection)localObject3)).getProto()))) {
/* 259:278 */           paramaqu.setBlock((BlockPosition)localObject5, instance().a(a(localej1.d()), Boolean.valueOf(true)), 2);
/* 260:279 */         } else if ((bool2) && (paramaqu.isEmpty(localdt)) && (c(paramaqu.getBlock(paramdt.a((EnumDirection)localObject4)).getProto()))) {
/* 261:280 */           paramaqu.setBlock(localdt, instance().a(a(localej1.d()), Boolean.valueOf(true)), 2);
/* 262:283 */         } else if (c(paramaqu.getBlock(((BlockPosition)localObject1).up()).getProto())) {
/* 263:284 */           paramaqu.setBlock((BlockPosition)localObject1, instance(), 2);
/* 264:    */         }
/* 265:    */       }
/* 266:287 */       else if ((((ProtoBlock)localObject2).material.isOpaque()) && (((ProtoBlock)localObject2).isOpaqueCube()))
/* 267:    */       {
/* 268:289 */         paramaqu.setBlock(paramdt, parambec.a(a(localej1), Boolean.valueOf(true)), 2);
/* 269:    */       }
/* 270:291 */       return;
/* 271:    */     }
/* 272:293 */     if (paramdt.getY() > 1)
/* 273:    */     {
/* 274:295 */       localObject1 = paramdt.down();
/* 275:296 */       localObject2 = paramaqu.getBlock((BlockPosition)localObject1);
/* 276:297 */       localObject3 = ((Block)localObject2).getProto();
/* 277:    */       Iterator localIterator;
/* 278:    */       EnumDirection localej2;
/* 279:299 */       if (((ProtoBlock)localObject3).material == Material.air)
/* 280:    */       {
/* 281:300 */         localObject4 = parambec;
/* 282:301 */         for (localIterator = en.HORIZONTAL.iterator(); localIterator.hasNext();)
/* 283:    */         {
/* 284:301 */           localej2 = (EnumDirection)localIterator.next();
/* 285:302 */           if (paramRandom.nextBoolean()) {
/* 286:303 */             localObject4 = ((Block)localObject4).a(a(localej2), Boolean.valueOf(false));
/* 287:    */           }
/* 288:    */         }
/* 289:306 */         if ((((Boolean)((Block)localObject4).getProperty(b)).booleanValue()) || (((Boolean)((Block)localObject4).getProperty(M)).booleanValue()) || (((Boolean)((Block)localObject4).getProperty(N)).booleanValue()) || (((Boolean)((Block)localObject4).getProperty(O)).booleanValue())) {
/* 290:307 */           paramaqu.setBlock((BlockPosition)localObject1, (Block)localObject4, 2);
/* 291:    */         }
/* 292:    */       }
/* 293:309 */       else if (localObject3 == this)
/* 294:    */       {
/* 295:310 */         localObject4 = localObject2;
/* 296:311 */         for (localIterator = en.HORIZONTAL.iterator(); localIterator.hasNext();)
/* 297:    */         {
/* 298:311 */           localej2 = (EnumDirection)localIterator.next();
/* 299:312 */           localObject5 = a(localej2);
/* 300:313 */           if ((paramRandom.nextBoolean()) || (!((Boolean)parambec.getProperty((IBlockData)localObject5)).booleanValue())) {
/* 301:314 */             localObject4 = ((Block)localObject4).a((IBlockData)localObject5, Boolean.valueOf(false));
/* 302:    */           }
/* 303:    */         }
/* 304:317 */         if ((((Boolean)((Block)localObject4).getProperty(b)).booleanValue()) || (((Boolean)((Block)localObject4).getProperty(M)).booleanValue()) || (((Boolean)((Block)localObject4).getProperty(N)).booleanValue()) || (((Boolean)((Block)localObject4).getProperty(O)).booleanValue())) {
/* 305:318 */           paramaqu.setBlock((BlockPosition)localObject1, (Block)localObject4, 2);
/* 306:    */         }
/* 307:    */       }
/* 308:    */     }
/* 309:    */   }
/* 310:    */   
/* 311:    */   private static int b(EnumDirection paramej)
/* 312:    */   {
/* 313:325 */     return 1 << paramej.b();
/* 314:    */   }
/* 315:    */   
/* 316:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/* 317:    */   {
/* 318:330 */     Block localbec = instance().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false));
/* 319:331 */     if (paramej.k().c()) {
/* 320:332 */       return localbec.a(a(paramej.d()), Boolean.valueOf(true));
/* 321:    */     }
/* 322:335 */     return localbec;
/* 323:    */   }
/* 324:    */   
/* 325:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 326:    */   {
/* 327:341 */     return null;
/* 328:    */   }
/* 329:    */   
/* 330:    */   public int a(Random paramRandom)
/* 331:    */   {
/* 332:346 */     return 0;
/* 333:    */   }
/* 334:    */   
/* 335:    */   public void a(World paramaqu, EntityPlayer paramahd, BlockPosition paramdt, Block parambec, bcm parambcm)
/* 336:    */   {
/* 337:351 */     if ((!paramaqu.isClient) && (paramahd.bY() != null) && (paramahd.bY().getItem() == ItemList.be))
/* 338:    */     {
/* 339:352 */       paramahd.b(StatList.H[ProtoBlock.a(this)]);
/* 340:    */       
/* 341:    */ 
/* 342:355 */       a(paramaqu, paramdt, new ItemStack(BlockList.vine, 1, 0));
/* 343:    */     }
/* 344:    */     else
/* 345:    */     {
/* 346:357 */       super.a(paramaqu, paramahd, paramdt, parambec, parambcm);
/* 347:    */     }
/* 348:    */   }
/* 349:    */   
/* 350:    */   public aql k()
/* 351:    */   {
/* 352:363 */     return aql.c;
/* 353:    */   }
/* 354:    */   
/* 355:    */   public Block instance(int paramInt)
/* 356:    */   {
/* 357:368 */     return instance().a(b, Boolean.valueOf((paramInt & R) > 0)).a(M, Boolean.valueOf((paramInt & S) > 0)).a(N, Boolean.valueOf((paramInt & Q) > 0)).a(O, Boolean.valueOf((paramInt & T) > 0));
/* 358:    */   }
/* 359:    */   
/* 360:    */   public int c(Block parambec)
/* 361:    */   {
/* 362:377 */     int i = 0;
/* 363:379 */     if (((Boolean)parambec.getProperty(b)).booleanValue()) {
/* 364:380 */       i |= R;
/* 365:    */     }
/* 366:383 */     if (((Boolean)parambec.getProperty(M)).booleanValue()) {
/* 367:384 */       i |= S;
/* 368:    */     }
/* 369:387 */     if (((Boolean)parambec.getProperty(N)).booleanValue()) {
/* 370:388 */       i |= Q;
/* 371:    */     }
/* 372:391 */     if (((Boolean)parambec.getProperty(O)).booleanValue()) {
/* 373:392 */       i |= T;
/* 374:    */     }
/* 375:395 */     return i;
/* 376:    */   }
/* 377:    */   
/* 378:    */   protected bed e()
/* 379:    */   {
/* 380:400 */     return new bed(this, new IBlockData[] { a, b, M, N, O });
/* 381:    */   }
/* 382:    */   
/* 383:    */   public static BlockDataBoolean a(EnumDirection paramej)
/* 384:    */   {
/* 385:404 */     switch (bbw.a[paramej.ordinal()])
/* 386:    */     {
/* 387:    */     case 1: 
/* 388:406 */       return a;
/* 389:    */     case 2: 
/* 390:408 */       return b;
/* 391:    */     case 3: 
/* 392:410 */       return N;
/* 393:    */     case 5: 
/* 394:412 */       return O;
/* 395:    */     case 4: 
/* 396:414 */       return M;
/* 397:    */     }
/* 398:417 */     throw new IllegalArgumentException(paramej + " is an invalid choice");
/* 399:    */   }
/* 400:    */   
/* 401:    */   public static int d(Block parambec)
/* 402:    */   {
/* 403:421 */     int i = 0;
/* 404:423 */     for (BlockDataBoolean localbet : P) {
/* 405:424 */       if (((Boolean)parambec.getProperty(localbet)).booleanValue()) {
/* 406:425 */         i++;
/* 407:    */       }
/* 408:    */     }
/* 409:429 */     return i;
/* 410:    */   }
/* 411:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bbv
 * JD-Core Version:    0.7.0.1
 */
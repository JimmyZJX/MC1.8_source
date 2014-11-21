package net.minecraft.src;
/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class auj
/*   5:    */   extends atg
/*   6:    */ {
/*   7: 32 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing", en.HORIZONTAL);
/*   8: 38 */   private final Random M = new Random();
/*   9:    */   public final int b;
/*  10:    */   
/*  11:    */   protected auj(int paramInt)
/*  12:    */   {
/*  13: 42 */     super(Material.wood);
/*  14: 43 */     j(this.L.b().a(a, EnumDirection.NORTH));
/*  15: 44 */     this.b = paramInt;
/*  16: 45 */     setCreativeTab(CreativeTabs.tabDeco);
/*  17: 46 */     a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public boolean c()
/*  21:    */   {
/*  22: 51 */     return false;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public boolean isOpaqueCube()
/*  26:    */   {
/*  27: 56 */     return false;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public int b()
/*  31:    */   {
/*  32: 61 */     return 2;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  36:    */   {
/*  37: 66 */     if (paramard.getBlock(paramdt.north()).getProto() == this) {
/*  38: 67 */       a(0.0625F, 0.0F, 0.0F, 0.9375F, 0.875F, 0.9375F);
/*  39: 68 */     } else if (paramard.getBlock(paramdt.south()).getProto() == this) {
/*  40: 69 */       a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 1.0F);
/*  41: 70 */     } else if (paramard.getBlock(paramdt.west()).getProto() == this) {
/*  42: 71 */       a(0.0F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
/*  43: 72 */     } else if (paramard.getBlock(paramdt.east()).getProto() == this) {
/*  44: 73 */       a(0.0625F, 0.0F, 0.0625F, 1.0F, 0.875F, 0.9375F);
/*  45:    */     } else {
/*  46: 75 */       a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
/*  47:    */     }
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/*  51:    */   {
/*  52: 81 */     e(paramaqu, paramdt, parambec);
/*  53: 83 */     for (EnumDirection localej : en.HORIZONTAL)
/*  54:    */     {
/*  55: 84 */       BlockPosition localdt = paramdt.a(localej);
/*  56: 85 */       Block localbec = paramaqu.getBlock(localdt);
/*  57: 86 */       if (localbec.getProto() == this) {
/*  58: 87 */         e(paramaqu, localdt, localbec);
/*  59:    */       }
/*  60:    */     }
/*  61:    */   }
/*  62:    */   
/*  63:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/*  64:    */   {
/*  65: 94 */     return instance().a(a, paramxm.aO());
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityLiving paramxm, ItemStack paramamj)
/*  69:    */   {
/*  70: 99 */     EnumDirection localej = EnumDirection.b(MathUtils.floor(paramxm.yaw * 4.0F / 360.0F + 0.5D) & 0x3).d();
/*  71:100 */     parambec = parambec.a(a, localej);
/*  72:    */     
/*  73:102 */     BlockPosition localdt1 = paramdt.north();
/*  74:103 */     BlockPosition localdt2 = paramdt.south();
/*  75:104 */     BlockPosition localdt3 = paramdt.west();
/*  76:105 */     BlockPosition localdt4 = paramdt.east();
/*  77:    */     
/*  78:107 */     int i = this == paramaqu.getBlock(localdt1).getProto() ? 1 : 0;
/*  79:108 */     int j = this == paramaqu.getBlock(localdt2).getProto() ? 1 : 0;
/*  80:109 */     int k = this == paramaqu.getBlock(localdt3).getProto() ? 1 : 0;
/*  81:110 */     int m = this == paramaqu.getBlock(localdt4).getProto() ? 1 : 0;
/*  82:112 */     if ((i != 0) || (j != 0) || (k != 0) || (m != 0))
/*  83:    */     {
/*  84:113 */       if ((localej.k() == EnumAxis.X) && ((i != 0) || (j != 0)))
/*  85:    */       {
/*  86:114 */         if (i != 0) {
/*  87:115 */           paramaqu.setBlock(localdt1, parambec, 3);
/*  88:    */         } else {
/*  89:117 */           paramaqu.setBlock(localdt2, parambec, 3);
/*  90:    */         }
/*  91:119 */         paramaqu.setBlock(paramdt, parambec, 3);
/*  92:    */       }
/*  93:120 */       else if ((localej.k() == EnumAxis.Z) && ((k != 0) || (m != 0)))
/*  94:    */       {
/*  95:121 */         if (k != 0) {
/*  96:122 */           paramaqu.setBlock(localdt3, parambec, 3);
/*  97:    */         } else {
/*  98:124 */           paramaqu.setBlock(localdt4, parambec, 3);
/*  99:    */         }
/* 100:126 */         paramaqu.setBlock(paramdt, parambec, 3);
/* 101:    */       }
/* 102:    */     }
/* 103:    */     else {
/* 104:129 */       paramaqu.setBlock(paramdt, parambec, 3);
/* 105:    */     }
/* 106:132 */     if (paramamj.s())
/* 107:    */     {
/* 108:133 */       bcm localbcm = paramaqu.s(paramdt);
/* 109:134 */       if ((localbcm instanceof bcr)) {
/* 110:135 */         ((bcr)localbcm).a(paramamj.q());
/* 111:    */       }
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   public Block e(World paramaqu, BlockPosition paramdt, Block parambec)
/* 116:    */   {
/* 117:142 */     if (paramaqu.isClient) {
/* 118:143 */       return parambec;
/* 119:    */     }
/* 120:146 */     Block localbec1 = paramaqu.getBlock(paramdt.north());
/* 121:147 */     Block localbec2 = paramaqu.getBlock(paramdt.south());
/* 122:148 */     Block localbec3 = paramaqu.getBlock(paramdt.west());
/* 123:149 */     Block localbec4 = paramaqu.getBlock(paramdt.east());
/* 124:    */     
/* 125:    */ 
/* 126:152 */     EnumDirection localej = (EnumDirection)parambec.getProperty(a);
/* 127:    */     
/* 128:154 */     ProtoBlock localatr1 = localbec1.getProto();
/* 129:155 */     ProtoBlock localatr2 = localbec2.getProto();
/* 130:156 */     ProtoBlock localatr3 = localbec3.getProto();
/* 131:157 */     ProtoBlock localatr4 = localbec4.getProto();
/* 132:    */     Object localObject1;
/* 133:    */     Object localObject2;
/* 134:    */     Object localObject3;
/* 135:    */     Object localObject4;
/* 136:158 */     if ((localatr1 == this) || (localatr2 == this))
/* 137:    */     {
/* 138:159 */       BlockPosition localdt = localatr1 == this ? paramdt.north() : paramdt.south();
/* 139:160 */       Block localbec5 = paramaqu.getBlock(localdt.west());
/* 140:161 */       localObject1 = paramaqu.getBlock(localdt.east());
/* 141:    */       
/* 142:163 */       localej = EnumDirection.EAST;
/* 143:166 */       if (localatr1 == this) {
/* 144:167 */         localObject2 = (EnumDirection)localbec1.getProperty(a);
/* 145:    */       } else {
/* 146:169 */         localObject2 = (EnumDirection)localbec2.getProperty(a);
/* 147:    */       }
/* 148:171 */       if (localObject2 == EnumDirection.WEST) {
/* 149:172 */         localej = EnumDirection.WEST;
/* 150:    */       }
/* 151:175 */       localObject3 = localbec5.getProto();
/* 152:176 */       localObject4 = ((Block)localObject1).getProto();
/* 153:177 */       if (((localatr3.m()) || (((ProtoBlock)localObject3).m())) && (!localatr4.m()) && (!((ProtoBlock)localObject4).m())) {
/* 154:178 */         localej = EnumDirection.EAST;
/* 155:    */       }
/* 156:180 */       if (((localatr4.m()) || (((ProtoBlock)localObject4).m())) && (!localatr3.m()) && (!((ProtoBlock)localObject3).m())) {
/* 157:181 */         localej = EnumDirection.WEST;
/* 158:    */       }
/* 159:    */     }
/* 160:    */     else
/* 161:    */     {
/* 162:184 */       boolean bool1 = localatr1.m();
/* 163:185 */       boolean bool2 = localatr2.m();
/* 164:186 */       if ((localatr3 == this) || (localatr4 == this))
/* 165:    */       {
/* 166:187 */         localObject1 = localatr3 == this ? paramdt.west() : paramdt.east();
/* 167:188 */         localObject2 = paramaqu.getBlock(((BlockPosition)localObject1).north());
/* 168:189 */         localObject3 = paramaqu.getBlock(((BlockPosition)localObject1).south());
/* 169:    */         
/* 170:191 */         localej = EnumDirection.SOUTH;
/* 171:193 */         if (localatr3 == this) {
/* 172:194 */           localObject4 = (EnumDirection)localbec3.getProperty(a);
/* 173:    */         } else {
/* 174:196 */           localObject4 = (EnumDirection)localbec4.getProperty(a);
/* 175:    */         }
/* 176:198 */         if (localObject4 == EnumDirection.NORTH) {
/* 177:199 */           localej = EnumDirection.NORTH;
/* 178:    */         }
/* 179:202 */         ProtoBlock localatr5 = ((Block)localObject2).getProto();
/* 180:203 */         ProtoBlock localatr6 = ((Block)localObject3).getProto();
/* 181:204 */         if (((bool1) || (localatr5.m())) && (!bool2) && (!localatr6.m())) {
/* 182:205 */           localej = EnumDirection.SOUTH;
/* 183:    */         }
/* 184:207 */         if (((bool2) || (localatr6.m())) && (!bool1) && (!localatr5.m())) {
/* 185:208 */           localej = EnumDirection.NORTH;
/* 186:    */         }
/* 187:    */       }
/* 188:    */     }
/* 189:213 */     parambec = parambec.a(a, localej);
/* 190:214 */     paramaqu.setBlock(paramdt, parambec, 3);
/* 191:215 */     return parambec;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public Block f(World paramaqu, BlockPosition paramdt, Block parambec)
/* 195:    */   {
/* 196:220 */     EnumDirection localObject1 = null;
/* 197:221 */     for (Iterator<EnumDirection> localObject2 = en.HORIZONTAL.iterator(); localObject2.hasNext();)
/* 198:    */     {
/* 199:221 */       EnumDirection localej = localObject2.next();
/* 200:222 */       Block localbec = paramaqu.getBlock(paramdt.a(localej));
/* 201:223 */       if (localbec.getProto() == this) {
/* 202:224 */         return parambec;
/* 203:    */       }
/* 204:226 */       if (localbec.getProto().m()) {
/* 205:227 */         if (localObject1 == null)
/* 206:    */         {
/* 207:228 */           localObject1 = localej;
/* 208:    */         }
/* 209:    */         else
/* 210:    */         {
/* 211:230 */           localObject1 = null;
/* 212:231 */           break;
/* 213:    */         }
/* 214:    */       }
/* 215:    */     }
/* 216:235 */     if (localObject1 != null) {
/* 217:236 */       return parambec.a(a, localObject1.d());
/* 218:    */     }
/* 219:240 */     EnumDirection localObject2 = (EnumDirection)parambec.getProperty(a);
/* 220:241 */     if (paramaqu.getBlock(paramdt.a((EnumDirection)localObject2)).getProto().m()) {
/* 221:242 */       localObject2 = ((EnumDirection)localObject2).d();
/* 222:    */     }
/* 223:244 */     if (paramaqu.getBlock(paramdt.a((EnumDirection)localObject2)).getProto().m()) {
/* 224:245 */       localObject2 = ((EnumDirection)localObject2).e();
/* 225:    */     }
/* 226:247 */     if (paramaqu.getBlock(paramdt.a((EnumDirection)localObject2)).getProto().m()) {
/* 227:248 */       localObject2 = ((EnumDirection)localObject2).d();
/* 228:    */     }
/* 229:251 */     return parambec.a(a, (Comparable)localObject2);
/* 230:    */   }
/* 231:    */   
/* 232:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/* 233:    */   {
/* 234:257 */     int i = 0;
/* 235:    */     
/* 236:259 */     BlockPosition localdt1 = paramdt.west();
/* 237:260 */     BlockPosition localdt2 = paramdt.east();
/* 238:261 */     BlockPosition localdt3 = paramdt.north();
/* 239:262 */     BlockPosition localdt4 = paramdt.south();
/* 240:264 */     if (paramaqu.getBlock(localdt1).getProto() == this)
/* 241:    */     {
/* 242:265 */       if (e(paramaqu, localdt1)) {
/* 243:266 */         return false;
/* 244:    */       }
/* 245:268 */       i++;
/* 246:    */     }
/* 247:270 */     if (paramaqu.getBlock(localdt2).getProto() == this)
/* 248:    */     {
/* 249:271 */       if (e(paramaqu, localdt2)) {
/* 250:272 */         return false;
/* 251:    */       }
/* 252:274 */       i++;
/* 253:    */     }
/* 254:276 */     if (paramaqu.getBlock(localdt3).getProto() == this)
/* 255:    */     {
/* 256:277 */       if (e(paramaqu, localdt3)) {
/* 257:278 */         return false;
/* 258:    */       }
/* 259:280 */       i++;
/* 260:    */     }
/* 261:282 */     if (paramaqu.getBlock(localdt4).getProto() == this)
/* 262:    */     {
/* 263:283 */       if (e(paramaqu, localdt4)) {
/* 264:284 */         return false;
/* 265:    */       }
/* 266:286 */       i++;
/* 267:    */     }
/* 268:289 */     if (i > 1) {
/* 269:290 */       return false;
/* 270:    */     }
/* 271:293 */     return true;
/* 272:    */   }
/* 273:    */   
/* 274:    */   private boolean e(World paramaqu, BlockPosition paramdt)
/* 275:    */   {
/* 276:297 */     if (paramaqu.getBlock(paramdt).getProto() != this) {
/* 277:298 */       return false;
/* 278:    */     }
/* 279:301 */     for (EnumDirection localej : en.HORIZONTAL) {
/* 280:302 */       if (paramaqu.getBlock(paramdt.a(localej)).getProto() == this) {
/* 281:303 */         return true;
/* 282:    */       }
/* 283:    */     }
/* 284:307 */     return false;
/* 285:    */   }
/* 286:    */   
/* 287:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/* 288:    */   {
/* 289:312 */     super.a(paramaqu, paramdt, parambec, paramatr);
/* 290:    */     
/* 291:314 */     bcm localbcm = paramaqu.s(paramdt);
/* 292:315 */     if ((localbcm instanceof bcr)) {
/* 293:316 */       localbcm.E();
/* 294:    */     }
/* 295:    */   }
/* 296:    */   
/* 297:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/* 298:    */   {
/* 299:322 */     bcm localbcm = paramaqu.s(paramdt);
/* 300:323 */     if ((localbcm instanceof vq))
/* 301:    */     {
/* 302:324 */       vs.a(paramaqu, paramdt, (vq)localbcm);
/* 303:    */       
/* 304:326 */       paramaqu.e(paramdt, this);
/* 305:    */     }
/* 306:328 */     super.b(paramaqu, paramdt, parambec);
/* 307:    */   }
/* 308:    */   
/* 309:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 310:    */   {
/* 311:333 */     if (paramaqu.isClient) {
/* 312:334 */       return true;
/* 313:    */     }
/* 314:336 */     vy localvy = d(paramaqu, paramdt);
/* 315:338 */     if (localvy != null) {
/* 316:339 */       paramahd.a((vq)localvy);
/* 317:    */     }
/* 318:342 */     return true;
/* 319:    */   }
/* 320:    */   
/* 321:    */   public vy d(World paramaqu, BlockPosition paramdt)
/* 322:    */   {
/* 323:347 */     bcm localbcm1 = paramaqu.s(paramdt);
/* 324:348 */     if (!(localbcm1 instanceof bcr)) {
/* 325:349 */       return null;
/* 326:    */     }
/* 327:352 */     vy localObject = (bcr)localbcm1;
/* 328:354 */     if (m(paramaqu, paramdt)) {
/* 329:355 */       return null;
/* 330:    */     }
/* 331:358 */     for (EnumDirection localej : en.HORIZONTAL)
/* 332:    */     {
/* 333:359 */       BlockPosition localdt = paramdt.a(localej);
/* 334:360 */       ProtoBlock localatr = paramaqu.getBlock(localdt).getProto();
/* 335:362 */       if (localatr == this)
/* 336:    */       {
/* 337:363 */         if (m(paramaqu, localdt)) {
/* 338:364 */           return null;
/* 339:    */         }
/* 340:367 */         bcm localbcm2 = paramaqu.s(localdt);
/* 341:368 */         if ((localbcm2 instanceof bcr)) {
/* 342:370 */           if ((localej == EnumDirection.WEST) || (localej == EnumDirection.NORTH)) {
/* 343:371 */             localObject = new vp("container.chestDouble", (bcr)localbcm2, (vy)localObject);
/* 344:    */           } else {
/* 345:373 */             localObject = new vp("container.chestDouble", (vy)localObject, (bcr)localbcm2);
/* 346:    */           }
/* 347:    */         }
/* 348:    */       }
/* 349:    */     }
/* 350:378 */     return localObject;
/* 351:    */   }
/* 352:    */   
/* 353:    */   public bcm a(World paramaqu, int paramInt)
/* 354:    */   {
/* 355:383 */     return new bcr();
/* 356:    */   }
/* 357:    */   
/* 358:    */   public boolean protoBlock_g()
/* 359:    */   {
/* 360:388 */     return this.b == 1;
/* 361:    */   }
/* 362:    */   
/* 363:    */   public int a(IBlockAccess paramard, BlockPosition paramdt, Block parambec, EnumDirection paramej)
/* 364:    */   {
/* 365:393 */     if (!protoBlock_g()) {
/* 366:394 */       return 0;
/* 367:    */     }
/* 368:397 */     int i = 0;
/* 369:398 */     bcm localbcm = paramard.s(paramdt);
/* 370:399 */     if ((localbcm instanceof bcr)) {
/* 371:400 */       i = ((bcr)localbcm).l;
/* 372:    */     }
/* 373:402 */     return MathUtils.clamp(i, 0, 15);
/* 374:    */   }
/* 375:    */   
/* 376:    */   public int b(IBlockAccess paramard, BlockPosition paramdt, Block parambec, EnumDirection paramej)
/* 377:    */   {
/* 378:407 */     if (paramej == EnumDirection.UP) {
/* 379:408 */       return a(paramard, paramdt, parambec, paramej);
/* 380:    */     }
/* 381:410 */     return 0;
/* 382:    */   }
/* 383:    */   
/* 384:    */   private boolean m(World paramaqu, BlockPosition paramdt)
/* 385:    */   {
/* 386:415 */     return (n(paramaqu, paramdt)) || (o(paramaqu, paramdt));
/* 387:    */   }
/* 388:    */   
/* 389:    */   private boolean n(World paramaqu, BlockPosition paramdt)
/* 390:    */   {
/* 391:419 */     return paramaqu.getBlock(paramdt.up()).getProto().blocksMovement();
/* 392:    */   }
/* 393:    */   
/* 394:    */   private boolean o(World paramaqu, BlockPosition paramdt)
/* 395:    */   {
/* 396:423 */     for (Entity localwv : paramaqu.getEntityList(EntityOcelot.class, new AABB(paramdt.getX(), paramdt.getY() + 1, paramdt.getZ(), paramdt.getX() + 1, paramdt.getY() + 2, paramdt.getZ() + 1)))
/* 397:    */     {
/* 398:424 */       EntityOcelot localaby = (EntityOcelot)localwv;
/* 399:425 */       if (localaby.cl()) {
/* 400:426 */         return true;
/* 401:    */       }
/* 402:    */     }
/* 403:429 */     return false;
/* 404:    */   }
/* 405:    */   
/* 406:    */   public boolean N()
/* 407:    */   {
/* 408:434 */     return true;
/* 409:    */   }
/* 410:    */   
/* 411:    */   public int l(World paramaqu, BlockPosition paramdt)
/* 412:    */   {
/* 413:439 */     return aib.b(d(paramaqu, paramdt));
/* 414:    */   }
/* 415:    */   
/* 416:    */   public Block a(int paramInt)
/* 417:    */   {
/* 418:444 */     EnumDirection localej = EnumDirection.a(paramInt);
/* 419:445 */     if (localej.k() == EnumAxis.Y) {
/* 420:446 */       localej = EnumDirection.NORTH;
/* 421:    */     }
/* 422:448 */     return instance().a(a, localej);
/* 423:    */   }
/* 424:    */   
/* 425:    */   public int c(Block parambec)
/* 426:    */   {
/* 427:454 */     return ((EnumDirection)parambec.getProperty(a)).a();
/* 428:    */   }
/* 429:    */   
/* 430:    */   protected bed e()
/* 431:    */   {
/* 432:459 */     return new bed(this, new IBlockData[] { a });
/* 433:    */   }
/* 434:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     auj
 * JD-Core Version:    0.7.0.1
 */
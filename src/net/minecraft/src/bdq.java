package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bdq
/*   5:    */   extends ProtoBlock
/*   6:    */ {
/*   7: 27 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing");
/*   8: 28 */   public static final BlockDataBoolean b = BlockDataBoolean.getInstance("extended");
/*   9:    */   private final boolean M;
/*  10:    */   
/*  11:    */   public bdq(boolean paramBoolean)
/*  12:    */   {
/*  13: 40 */     super(Material.H);
/*  14: 41 */     j(this.L.b().setData(a, EnumDirection.NORTH).setData(b, Boolean.valueOf(false)));
/*  15: 42 */     this.M = paramBoolean;
/*  16: 43 */     a(i);
/*  17: 44 */     c(0.5F);
/*  18: 45 */     setCreativeTab(CreativeTabs.tabRedstone);
/*  19:    */   }
/*  20:    */   
/*  21:    */   public boolean c()
/*  22:    */   {
/*  23: 54 */     return false;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityLiving paramxm, ItemStack paramamj)
/*  27:    */   {
/*  28: 59 */     paramaqu.setBlock(paramdt, parambec.setData(a, a(paramaqu, paramdt, paramxm)), 2);
/*  29: 60 */     if (!paramaqu.isClient) {
/*  30: 61 */       e(paramaqu, paramdt, parambec);
/*  31:    */     }
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  35:    */   {
/*  36: 67 */     if (!paramaqu.isClient) {
/*  37: 68 */       e(paramaqu, paramdt, parambec);
/*  38:    */     }
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/*  42:    */   {
/*  43: 74 */     if ((!paramaqu.isClient) && (paramaqu.s(paramdt) == null)) {
/*  44: 75 */       e(paramaqu, paramdt, parambec);
/*  45:    */     }
/*  46:    */   }
/*  47:    */   
/*  48:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/*  49:    */   {
/*  50: 81 */     return instance().setData(a, a(paramaqu, paramdt, paramxm)).setData(b, Boolean.valueOf(false));
/*  51:    */   }
/*  52:    */   
/*  53:    */   private void e(World paramaqu, BlockPosition paramdt, Block parambec)
/*  54:    */   {
/*  55: 85 */     EnumDirection localej = (EnumDirection)parambec.getData(a);
/*  56:    */     
/*  57: 87 */     boolean bool = b(paramaqu, paramdt, localej);
/*  58: 89 */     if ((bool) && (!((Boolean)parambec.getData(b)).booleanValue()))
/*  59:    */     {
/*  60: 90 */       if (new bdy(paramaqu, paramdt, localej, true).a()) {
/*  61: 91 */         paramaqu.c(paramdt, this, 0, localej.a());
/*  62:    */       }
/*  63:    */     }
/*  64: 93 */     else if ((!bool) && (((Boolean)parambec.getData(b)).booleanValue()))
/*  65:    */     {
/*  66: 94 */       paramaqu.setBlock(paramdt, parambec.setData(b, Boolean.valueOf(false)), 2);
/*  67: 95 */       paramaqu.c(paramdt, this, 1, localej.a());
/*  68:    */     }
/*  69:    */   }
/*  70:    */   
/*  71:    */   private boolean b(World paramaqu, BlockPosition paramdt, EnumDirection paramej)
/*  72:    */   {
/*  73:111 */     for (EnumDirection localej1 : EnumDirection.values()) {
/*  74:112 */       if ((localej1 != paramej) && (paramaqu.b(paramdt.offset(localej1), localej1))) {
/*  75:113 */         return true;
/*  76:    */       }
/*  77:    */     }
/*  78:118 */     if (paramaqu.b(paramdt, EnumDirection.NORTH)) {
/*  79:119 */       return true;
/*  80:    */     }
/*  81:122 */     BlockPosition localdt = paramdt.up();
/*  82:123 */     for (EnumDirection localej2 : EnumDirection.values()) {
/*  83:124 */       if ((localej2 != EnumDirection.DOWN) && (paramaqu.b(localdt.offset(localej2), localej2))) {
/*  84:125 */         return true;
/*  85:    */       }
/*  86:    */     }
/*  87:129 */     return false;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, int paramInt1, int paramInt2)
/*  91:    */   {
/*  92:134 */     EnumDirection localej = (EnumDirection)parambec.getData(a);
/*  93:135 */     if (!paramaqu.isClient)
/*  94:    */     {
/*  95:136 */       boolean bool = b(paramaqu, paramdt, localej);
/*  96:138 */       if ((bool) && (paramInt1 == 1))
/*  97:    */       {
/*  98:139 */         paramaqu.setBlock(paramdt, parambec.setData(b, Boolean.valueOf(true)), 2);
/*  99:140 */         return false;
/* 100:    */       }
/* 101:141 */       if ((!bool) && (paramInt1 == 0)) {
/* 102:142 */         return false;
/* 103:    */       }
/* 104:    */     }
/* 105:146 */     if (paramInt1 == 0)
/* 106:    */     {
/* 107:147 */       if (a(paramaqu, paramdt, localej, true))
/* 108:    */       {
/* 109:148 */         paramaqu.setBlock(paramdt, parambec.setData(b, Boolean.valueOf(true)), 2);
/* 110:149 */         paramaqu.a(paramdt.getX() + 0.5D, paramdt.getY() + 0.5D, paramdt.getZ() + 0.5D, "tile.piston.out", 0.5F, paramaqu.rng.nextFloat() * 0.25F + 0.6F);
/* 111:    */       }
/* 112:    */       else
/* 113:    */       {
/* 114:151 */         return false;
/* 115:    */       }
/* 116:    */     }
/* 117:153 */     else if (paramInt1 == 1)
/* 118:    */     {
/* 119:154 */       bcm localbcm1 = paramaqu.s(paramdt.offset(localej));
/* 120:155 */       if ((localbcm1 instanceof bdv)) {
/* 121:156 */         ((bdv)localbcm1).h();
/* 122:    */       }
/* 123:159 */       paramaqu.setBlock(paramdt, BlockList.M.instance().setData(bdx.a, localej).setData(bdx.b, this.M ? bdu.b : bdu.a), 3);
/* 124:160 */       paramaqu.a(paramdt, bdx.a(instance(paramInt2), localej, false, true));
/* 125:163 */       if (this.M)
/* 126:    */       {
/* 127:164 */         BlockPosition localdt = paramdt.offset(localej.g() * 2, localej.h() * 2, localej.i() * 2);
/* 128:165 */         ProtoBlock localatr = paramaqu.getBlock(localdt).getProto();
/* 129:166 */         int i = 0;
/* 130:168 */         if (localatr == BlockList.M)
/* 131:    */         {
/* 132:171 */           bcm localbcm2 = paramaqu.s(localdt);
/* 133:172 */           if ((localbcm2 instanceof bdv))
/* 134:    */           {
/* 135:173 */             bdv localbdv = (bdv)localbcm2;
/* 136:175 */             if ((localbdv.e() == localej) && (localbdv.d()))
/* 137:    */             {
/* 138:177 */               localbdv.h();
/* 139:178 */               i = 1;
/* 140:    */             }
/* 141:    */           }
/* 142:    */         }
/* 143:183 */         if ((i == 0) && (localatr.getMaterial() != Material.air) && (a(localatr, paramaqu, localdt, localej.opposite(), false)) && ((localatr.i() == 0) || (localatr == BlockList.J) || (localatr == BlockList.F))) {
/* 144:184 */           a(paramaqu, paramdt, localej, false);
/* 145:    */         }
/* 146:    */       }
/* 147:    */       else
/* 148:    */       {
/* 149:187 */         paramaqu.g(paramdt.offset(localej));
/* 150:    */       }
/* 151:190 */       paramaqu.a(paramdt.getX() + 0.5D, paramdt.getY() + 0.5D, paramdt.getZ() + 0.5D, "tile.piston.in", 0.5F, paramaqu.rng.nextFloat() * 0.15F + 0.6F);
/* 152:    */     }
/* 153:192 */     return true;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/* 157:    */   {
/* 158:197 */     Block localbec = paramard.getBlock(paramdt);
/* 159:198 */     if ((localbec.getProto() == this) && (((Boolean)localbec.getData(b)).booleanValue()))
/* 160:    */     {
/* 161:199 */       float f = 0.25F;
/* 162:200 */       EnumDirection localej = (EnumDirection)localbec.getData(a);
/* 163:201 */       if (localej != null) {
/* 164:202 */         switch (bdr.a[localej.ordinal()])
/* 165:    */         {
/* 166:    */         case 1: 
/* 167:204 */           a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 168:205 */           break;
/* 169:    */         case 2: 
/* 170:207 */           a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
/* 171:208 */           break;
/* 172:    */         case 3: 
/* 173:210 */           a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
/* 174:211 */           break;
/* 175:    */         case 4: 
/* 176:213 */           a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
/* 177:214 */           break;
/* 178:    */         case 5: 
/* 179:216 */           a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 180:217 */           break;
/* 181:    */         case 6: 
/* 182:219 */           a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
/* 183:    */         }
/* 184:    */       }
/* 185:    */     }
/* 186:    */     else
/* 187:    */     {
/* 188:224 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 189:    */     }
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void h()
/* 193:    */   {
/* 194:230 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, AABB parambrt, List paramList, Entity paramwv)
/* 198:    */   {
/* 199:235 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 200:236 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/* 201:    */   }
/* 202:    */   
/* 203:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/* 204:    */   {
/* 205:242 */     a(paramaqu, paramdt);
/* 206:243 */     return super.a(paramaqu, paramdt, parambec);
/* 207:    */   }
/* 208:    */   
/* 209:    */   public boolean isOpaqueCube()
/* 210:    */   {
/* 211:248 */     return false;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public static EnumDirection b(int paramInt)
/* 215:    */   {
/* 216:253 */     int i = paramInt & 0x7;
/* 217:254 */     if (i > 5) {
/* 218:255 */       return null;
/* 219:    */     }
/* 220:257 */     return EnumDirection.a(i);
/* 221:    */   }
/* 222:    */   
/* 223:    */   public static EnumDirection a(World paramaqu, BlockPosition paramdt, EntityLiving paramxm)
/* 224:    */   {
/* 225:265 */     if ((MathUtils.abs((float)paramxm.xPos - paramdt.getX()) < 2.0F) && (MathUtils.abs((float)paramxm.zPos - paramdt.getZ()) < 2.0F))
/* 226:    */     {
/* 227:267 */       double d = paramxm.yPos + paramxm.getEyeHeight();
/* 228:268 */       if (d - paramdt.getY() > 2.0D) {
/* 229:269 */         return EnumDirection.UP;
/* 230:    */       }
/* 231:272 */       if (paramdt.getY() - d > 0.0D) {
/* 232:273 */         return EnumDirection.DOWN;
/* 233:    */       }
/* 234:    */     }
/* 235:277 */     return paramxm.aO().opposite();
/* 236:    */   }
/* 237:    */   
/* 238:    */   public static boolean a(ProtoBlock paramatr, World paramaqu, BlockPosition paramdt, EnumDirection paramej, boolean paramBoolean)
/* 239:    */   {
/* 240:282 */     if (paramatr == BlockList.obsidian) {
/* 241:283 */       return false;
/* 242:    */     }
/* 243:286 */     if (!paramaqu.af().a(paramdt)) {
/* 244:287 */       return false;
/* 245:    */     }
/* 246:288 */     if ((paramdt.getY() < 0) || ((paramej == EnumDirection.DOWN) && (paramdt.getY() == 0))) {
/* 247:289 */       return false;
/* 248:    */     }
/* 249:290 */     if ((paramdt.getY() > paramaqu.U() - 1) || ((paramej == EnumDirection.UP) && (paramdt.getY() == paramaqu.U() - 1))) {
/* 250:291 */       return false;
/* 251:    */     }
/* 252:294 */     if ((paramatr == BlockList.J) || (paramatr == BlockList.F))
/* 253:    */     {
/* 254:296 */       if (((Boolean)paramaqu.getBlock(paramdt).getData(b)).booleanValue()) {
/* 255:297 */         return false;
/* 256:    */       }
/* 257:    */     }
/* 258:    */     else
/* 259:    */     {
/* 260:300 */       if (paramatr.g(paramaqu, paramdt) == -1.0F) {
/* 261:301 */         return false;
/* 262:    */       }
/* 263:304 */       if (paramatr.i() == 2) {
/* 264:305 */         return false;
/* 265:    */       }
/* 266:308 */       if (paramatr.i() == 1)
/* 267:    */       {
/* 268:309 */         if (!paramBoolean) {
/* 269:310 */           return false;
/* 270:    */         }
/* 271:312 */         return true;
/* 272:    */       }
/* 273:    */     }
/* 274:316 */     if ((paramatr instanceof avs)) {
/* 275:318 */       return false;
/* 276:    */     }
/* 277:321 */     return true;
/* 278:    */   }
/* 279:    */   
/* 280:    */   private boolean a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, boolean paramBoolean)
/* 281:    */   {
/* 282:325 */     if (!paramBoolean) {
/* 283:328 */       paramaqu.g(paramdt.offset(paramej));
/* 284:    */     }
/* 285:331 */     bdy localbdy = new bdy(paramaqu, paramdt, paramej, paramBoolean);
/* 286:332 */     List localList1 = localbdy.c();
/* 287:333 */     List<BlockPosition> localList2 = localbdy.d();
/* 288:335 */     if (!localbdy.a()) {
/* 289:336 */       return false;
/* 290:    */     }
/* 291:339 */     int i = localList1.size() + localList2.size();
/* 292:340 */     ProtoBlock[] arrayOfatr = new ProtoBlock[i];
/* 293:341 */     EnumDirection localej = paramBoolean ? paramej : paramej.opposite();
/* 294:    */     BlockPosition localObject1;
/* 295:    */     
/* 296:344 */     for (int j = localList2.size() - 1; j >= 0; j--)
/* 297:    */     {
/* 298:345 */       localObject1 = (BlockPosition)localList2.get(j);
/* 299:346 */       ProtoBlock localObject21 = paramaqu.getBlock((BlockPosition)localObject1).getProto();
/* 300:    */       
/* 301:348 */       localObject21.b(paramaqu, (BlockPosition)localObject1, paramaqu.getBlock((BlockPosition)localObject1), 0);
/* 302:349 */       paramaqu.g((BlockPosition)localObject1);
/* 303:    */       
/* 304:351 */       arrayOfatr[(--i)] = localObject21;
/* 305:    */     }
/* 306:    */     Object localObject3;
/* 307:355 */     for (int j = localList1.size() - 1; j >= 0; j--)
/* 308:    */     {
/* 309:356 */       localObject1 = (BlockPosition)localList1.get(j);
/* 310:357 */       Block localObject2 = paramaqu.getBlock((BlockPosition)localObject1);
/* 311:358 */       ProtoBlock localObject31 = ((Block)localObject2).getProto();
/* 312:359 */       int m = localObject31.c((Block)localObject2);
/* 313:    */       
/* 314:361 */       paramaqu.g((BlockPosition)localObject1);
/* 315:362 */       localObject1 = ((BlockPosition)localObject1).offset(localej);
/* 316:    */       
/* 317:364 */       paramaqu.setBlock((BlockPosition)localObject1, BlockList.M.instance().setData(a, paramej), 4);
/* 318:365 */       paramaqu.a((BlockPosition)localObject1, bdx.a((Block)localObject2, paramej, paramBoolean, false));
/* 319:    */       
/* 320:367 */       arrayOfatr[(--i)] = localObject31;
/* 321:    */     }
/* 322:370 */     BlockPosition localdt = paramdt.offset(paramej);
/* 323:372 */     if (paramBoolean)
/* 324:    */     {
/* 325:373 */       bdu localObject11 = this.M ? bdu.b : bdu.a;
/* 326:374 */       Block localObject2 = BlockList.K.instance().setData(bds.a, paramej).setData(bds.b, (Comparable)localObject11);
/* 327:    */       
/* 328:376 */       localObject3 = BlockList.M.instance().setData(bdx.a, paramej).setData(bdx.b, this.M ? bdu.b : bdu.a);
/* 329:    */       
/* 330:    */ 
/* 331:379 */       paramaqu.setBlock(localdt, (Block)localObject3, 4);
/* 332:380 */       paramaqu.a(localdt, bdx.a((Block)localObject2, paramej, true, false));
/* 333:    */     }
/* 334:384 */     for (int k = localList2.size() - 1; k >= 0; k--) {
/* 335:385 */       paramaqu.c((BlockPosition)localList2.get(k), arrayOfatr[(i++)]);
/* 336:    */     }
/* 337:389 */     for (int k = localList1.size() - 1; k >= 0; k--) {
/* 338:390 */       paramaqu.c((BlockPosition)localList1.get(k), arrayOfatr[(i++)]);
/* 339:    */     }
/* 340:393 */     if (paramBoolean)
/* 341:    */     {
/* 342:395 */       paramaqu.c(localdt, BlockList.K);
/* 343:396 */       paramaqu.c(paramdt, this);
/* 344:    */     }
/* 345:399 */     return true;
/* 346:    */   }
/* 347:    */   
/* 348:    */   public Block b(Block parambec)
/* 349:    */   {
/* 350:404 */     return instance().setData(a, EnumDirection.UP);
/* 351:    */   }
/* 352:    */   
/* 353:    */   public Block instance(int paramInt)
/* 354:    */   {
/* 355:409 */     return instance().setData(a, b(paramInt)).setData(b, Boolean.valueOf((paramInt & 0x8) > 0));
/* 356:    */   }
/* 357:    */   
/* 358:    */   public int c(Block parambec)
/* 359:    */   {
/* 360:416 */     int i = 0;
/* 361:    */     
/* 362:418 */     i |= ((EnumDirection)parambec.getData(a)).a();
/* 363:420 */     if (((Boolean)parambec.getData(b)).booleanValue()) {
/* 364:421 */       i |= 0x8;
/* 365:    */     }
/* 366:424 */     return i;
/* 367:    */   }
/* 368:    */   
/* 369:    */   protected bed e()
/* 370:    */   {
/* 371:429 */     return new bed(this, new IBlockData[] { a, b });
/* 372:    */   }
/* 373:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bdq
 * JD-Core Version:    0.7.0.1
 */
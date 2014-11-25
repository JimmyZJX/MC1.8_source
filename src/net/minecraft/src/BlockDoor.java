package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class BlockDoor
/*   4:    */   extends ProtoBlock
/*   5:    */ {
/*   6: 26 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing", en.HORIZONTAL);
/*   7: 27 */   public static final BlockDataBoolean b = BlockDataBoolean.getInstance("open");
/*   8: 28 */   public static final BlockDataEnum<avh> M = BlockDataEnum.getInstance("hinge", avh.class);
/*   9: 29 */   public static final BlockDataBoolean N = BlockDataBoolean.getInstance("powered");
/*  10: 30 */   public static final BlockDataEnum<avg> O = BlockDataEnum.getInstance("half", avg.class);
/*  11:    */   
/*  12:    */   protected BlockDoor(Material parambof)
/*  13:    */   {
/*  14: 42 */     super(parambof);
/*  15: 43 */     j(this.L.b().a(a, EnumDirection.NORTH).a(b, Boolean.valueOf(false)).a(M, avh.a).a(N, Boolean.valueOf(false)).a(O, avg.b));
/*  16:    */   }
/*  17:    */   
/*  18:    */   public boolean c()
/*  19:    */   {
/*  20: 48 */     return false;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public boolean b(IBlockAccess paramard, BlockPosition paramdt)
/*  24:    */   {
/*  25: 53 */     return g(e(paramard, paramdt));
/*  26:    */   }
/*  27:    */   
/*  28:    */   public boolean isOpaqueCube()
/*  29:    */   {
/*  30: 58 */     return false;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public AABB a(World paramaqu, BlockPosition paramdt)
/*  34:    */   {
/*  35: 63 */     a(paramaqu, paramdt);
/*  36: 64 */     return super.a(paramaqu, paramdt);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  40:    */   {
/*  41: 70 */     a(paramaqu, paramdt);
/*  42: 71 */     return super.a(paramaqu, paramdt, parambec);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  46:    */   {
/*  47: 76 */     k(e(paramard, paramdt));
/*  48:    */   }
/*  49:    */   
/*  50:    */   private void k(int paramInt)
/*  51:    */   {
/*  52: 80 */     float f = 0.1875F;
/*  53: 81 */     a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
/*  54: 82 */     EnumDirection localej = f(paramInt);
/*  55: 83 */     boolean bool1 = g(paramInt);
/*  56: 84 */     boolean bool2 = j(paramInt);
/*  57: 85 */     if (bool1)
/*  58:    */     {
/*  59: 86 */       if (localej == EnumDirection.EAST)
/*  60:    */       {
/*  61: 87 */         if (!bool2) {
/*  62: 88 */           a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*  63:    */         } else {
/*  64: 90 */           a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*  65:    */         }
/*  66:    */       }
/*  67: 92 */       else if (localej == EnumDirection.SOUTH)
/*  68:    */       {
/*  69: 93 */         if (!bool2) {
/*  70: 94 */           a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  71:    */         } else {
/*  72: 96 */           a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*  73:    */         }
/*  74:    */       }
/*  75: 98 */       else if (localej == EnumDirection.WEST)
/*  76:    */       {
/*  77: 99 */         if (!bool2) {
/*  78:100 */           a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*  79:    */         } else {
/*  80:102 */           a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*  81:    */         }
/*  82:    */       }
/*  83:104 */       else if (localej == EnumDirection.NORTH) {
/*  84:105 */         if (!bool2) {
/*  85:106 */           a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*  86:    */         } else {
/*  87:108 */           a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  88:    */         }
/*  89:    */       }
/*  90:    */     }
/*  91:112 */     else if (localej == EnumDirection.EAST) {
/*  92:113 */       a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*  93:114 */     } else if (localej == EnumDirection.SOUTH) {
/*  94:115 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*  95:116 */     } else if (localej == EnumDirection.WEST) {
/*  96:117 */       a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  97:118 */     } else if (localej == EnumDirection.NORTH) {
/*  98:119 */       a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*  99:    */     }
/* 100:    */   }
/* 101:    */   
/* 102:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 103:    */   {
/* 104:126 */     if (this.material == Material.f) {
/* 105:127 */       return true;
/* 106:    */     }
/* 107:130 */     BlockPosition localdt = parambec.getProperty(O) == avg.b ? paramdt : paramdt.down();
/* 108:131 */     Block localbec = paramdt.equals(localdt) ? parambec : paramaqu.getBlock(localdt);
/* 109:132 */     if (localbec.getProto() != this) {
/* 110:133 */       return false;
/* 111:    */     }
/* 112:136 */     parambec = localbec.a(b);
/* 113:137 */     paramaqu.setBlock(localdt, parambec, 2);
/* 114:138 */     paramaqu.b(localdt, paramdt);
/* 115:    */     
/* 116:140 */     paramaqu.playLevelEvent(paramahd, ((Boolean)parambec.getProperty(b)).booleanValue() ? 1003 : 1006, paramdt, 0);
/* 117:141 */     return true;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void a(World paramaqu, BlockPosition paramdt, boolean paramBoolean)
/* 121:    */   {
/* 122:145 */     Block localbec1 = paramaqu.getBlock(paramdt);
/* 123:146 */     if (localbec1.getProto() != this) {
/* 124:147 */       return;
/* 125:    */     }
/* 126:149 */     BlockPosition localdt = localbec1.getProperty(O) == avg.b ? paramdt : paramdt.down();
/* 127:150 */     Block localbec2 = paramdt == localdt ? localbec1 : paramaqu.getBlock(localdt);
/* 128:152 */     if ((localbec2.getProto() == this) && (((Boolean)localbec2.getProperty(b)).booleanValue() != paramBoolean))
/* 129:    */     {
/* 130:153 */       paramaqu.setBlock(localdt, localbec2.a(b, Boolean.valueOf(paramBoolean)), 2);
/* 131:154 */       paramaqu.b(localdt, paramdt);
/* 132:    */       
/* 133:156 */       paramaqu.playLevelEvent(null, paramBoolean ? 1003 : 1006, paramdt, 0);
/* 134:    */     }
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/* 138:    */   {
/* 139:    */     Object localObject;
/* 140:162 */     if (parambec.getProperty(O) == avg.a)
/* 141:    */     {
/* 142:163 */       BlockPosition localdt = paramdt.down();
/* 143:164 */       localObject = paramaqu.getBlock(localdt);
/* 144:165 */       if (((Block)localObject).getProto() != this) {
/* 145:166 */         paramaqu.g(paramdt);
/* 146:167 */       } else if (paramatr != this) {
/* 147:168 */         a(paramaqu, localdt, (Block)localObject, paramatr);
/* 148:    */       }
/* 149:    */     }
/* 150:    */     else
/* 151:    */     {
/* 152:171 */       int i = 0;
/* 153:172 */       localObject = paramdt.up();
/* 154:173 */       Block localbec = paramaqu.getBlock((BlockPosition)localObject);
/* 155:175 */       if (localbec.getProto() != this)
/* 156:    */       {
/* 157:176 */         paramaqu.g(paramdt);
/* 158:177 */         i = 1;
/* 159:    */       }
/* 160:180 */       if (!World.isFlatSurface(paramaqu, paramdt.down()))
/* 161:    */       {
/* 162:181 */         paramaqu.g(paramdt);
/* 163:182 */         i = 1;
/* 164:183 */         if (localbec.getProto() == this) {
/* 165:184 */           paramaqu.g((BlockPosition)localObject);
/* 166:    */         }
/* 167:    */       }
/* 168:188 */       if (i != 0)
/* 169:    */       {
/* 170:189 */         if (!paramaqu.isClient) {
/* 171:190 */           b(paramaqu, paramdt, parambec, 0);
/* 172:    */         }
/* 173:    */       }
/* 174:    */       else
/* 175:    */       {
/* 176:193 */         boolean bool = (paramaqu.z(paramdt)) || (paramaqu.z((BlockPosition)localObject));
/* 177:194 */         if (((bool) || (paramatr.protoBlock_g())) && (paramatr != this) && 
/* 178:195 */           (bool != ((Boolean)localbec.getProperty(N)).booleanValue()))
/* 179:    */         {
/* 180:196 */           paramaqu.setBlock((BlockPosition)localObject, localbec.a(N, Boolean.valueOf(bool)), 2);
/* 181:198 */           if (bool != ((Boolean)parambec.getProperty(b)).booleanValue())
/* 182:    */           {
/* 183:199 */             paramaqu.setBlock(paramdt, parambec.a(b, Boolean.valueOf(bool)), 2);
/* 184:200 */             paramaqu.b(paramdt, paramdt);
/* 185:201 */             paramaqu.playLevelEvent(null, bool ? 1003 : 1006, paramdt, 0);
/* 186:    */           }
/* 187:    */         }
/* 188:    */       }
/* 189:    */     }
/* 190:    */   }
/* 191:    */   
/* 192:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 193:    */   {
/* 194:212 */     if (parambec.getProperty(O) == avg.a) {
/* 195:213 */       return null;
/* 196:    */     }
/* 197:216 */     return j();
/* 198:    */   }
/* 199:    */   
/* 200:    */   public HitResult a(World paramaqu, BlockPosition paramdt, Vec3 parambrw1, Vec3 parambrw2)
/* 201:    */   {
/* 202:221 */     a(paramaqu, paramdt);
/* 203:222 */     return super.a(paramaqu, paramdt, parambrw1, parambrw2);
/* 204:    */   }
/* 205:    */   
/* 206:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/* 207:    */   {
/* 208:227 */     if (paramdt.getY() >= 255) {
/* 209:228 */       return false;
/* 210:    */     }
/* 211:231 */     return (World.isFlatSurface(paramaqu, paramdt.down())) && (super.c(paramaqu, paramdt)) && (super.c(paramaqu, paramdt.up()));
/* 212:    */   }
/* 213:    */   
/* 214:    */   public int i()
/* 215:    */   {
/* 216:236 */     return 1;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public static int e(IBlockAccess paramard, BlockPosition paramdt)
/* 220:    */   {
/* 221:240 */     Block localbec1 = paramard.getBlock(paramdt);
/* 222:241 */     int i = localbec1.getProto().c(localbec1);
/* 223:242 */     boolean bool = i(i);
/* 224:    */     
/* 225:244 */     Block localbec2 = paramard.getBlock(paramdt.down());
/* 226:245 */     int j = localbec2.getProto().c(localbec2);
/* 227:246 */     int k = bool ? j : i;
/* 228:247 */     Block localbec3 = paramard.getBlock(paramdt.up());
/* 229:248 */     int m = localbec3.getProto().c(localbec3);
/* 230:249 */     int n = bool ? i : m;
/* 231:    */     
/* 232:    */ 
/* 233:252 */     int i1 = (n & 0x1) != 0 ? 1 : 0;
/* 234:253 */     int i2 = (n & 0x2) != 0 ? 1 : 0;
/* 235:254 */     return b(k) | (bool ? 8 : 0) | (i1 != 0 ? 16 : 0) | (i2 != 0 ? 32 : 0);
/* 236:    */   }
/* 237:    */   
/* 238:    */   public Item b(World paramaqu, BlockPosition paramdt)
/* 239:    */   {
/* 240:259 */     return j();
/* 241:    */   }
/* 242:    */   
/* 243:    */   private Item j()
/* 244:    */   {
/* 245:263 */     if (this == BlockList.ironDoor) {
/* 246:264 */       return ItemList.aB;
/* 247:    */     }
/* 248:265 */     if (this == BlockList.ap) {
/* 249:266 */       return ItemList.ar;
/* 250:    */     }
/* 251:267 */     if (this == BlockList.aq) {
/* 252:268 */       return ItemList.as;
/* 253:    */     }
/* 254:269 */     if (this == BlockList.ar) {
/* 255:270 */       return ItemList.at;
/* 256:    */     }
/* 257:271 */     if (this == BlockList.as) {
/* 258:272 */       return ItemList.au;
/* 259:    */     }
/* 260:273 */     if (this == BlockList.at) {
/* 261:274 */       return ItemList.av;
/* 262:    */     }
/* 263:276 */     return ItemList.aq;
/* 264:    */   }
/* 265:    */   
/* 266:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd)
/* 267:    */   {
/* 268:282 */     BlockPosition localdt = paramdt.down();
/* 269:283 */     if ((paramahd.by.d) && (parambec.getProperty(O) == avg.a) && (paramaqu.getBlock(localdt).getProto() == this)) {
/* 270:284 */       paramaqu.g(localdt);
/* 271:    */     }
/* 272:    */   }
/* 273:    */   
/* 274:    */   public aql k()
/* 275:    */   {
/* 276:290 */     return aql.c;
/* 277:    */   }
/* 278:    */   
/* 279:    */   public Block a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/* 280:    */   {
/* 281:    */     Block localbec;
/* 282:295 */     if (parambec.getProperty(O) == avg.b)
/* 283:    */     {
/* 284:296 */       localbec = paramard.getBlock(paramdt.up());
/* 285:297 */       if (localbec.getProto() == this) {
/* 286:298 */         parambec = parambec.a(M, localbec.getProperty(M)).a(N, localbec.getProperty(N));
/* 287:    */       }
/* 288:    */     }
/* 289:    */     else
/* 290:    */     {
/* 291:303 */       localbec = paramard.getBlock(paramdt.down());
/* 292:304 */       if (localbec.getProto() == this) {
/* 293:305 */         parambec = parambec.a(a, localbec.getProperty(a)).a(b, localbec.getProperty(b));
/* 294:    */       }
/* 295:    */     }
/* 296:311 */     return parambec;
/* 297:    */   }
/* 298:    */   
/* 299:    */   public Block instance(int paramInt)
/* 300:    */   {
/* 301:316 */     if ((paramInt & 0x8) > 0) {
/* 302:317 */       return instance().a(O, avg.a).a(M, (paramInt & 0x1) > 0 ? avh.b : avh.a).a(N, Boolean.valueOf((paramInt & 0x2) > 0));
/* 303:    */     }
/* 304:322 */     return instance().a(O, avg.b).a(a, EnumDirection.b(paramInt & 0x3).f()).a(b, Boolean.valueOf((paramInt & 0x4) > 0));
/* 305:    */   }
/* 306:    */   
/* 307:    */   public int c(Block parambec)
/* 308:    */   {
/* 309:331 */     int i = 0;
/* 310:333 */     if (parambec.getProperty(O) == avg.a)
/* 311:    */     {
/* 312:334 */       i |= 0x8;
/* 313:336 */       if (parambec.getProperty(M) == avh.b) {
/* 314:337 */         i |= 0x1;
/* 315:    */       }
/* 316:339 */       if (((Boolean)parambec.getProperty(N)).booleanValue()) {
/* 317:340 */         i |= 0x2;
/* 318:    */       }
/* 319:    */     }
/* 320:    */     else
/* 321:    */     {
/* 322:343 */       i |= ((EnumDirection)parambec.getProperty(a)).e().b();
/* 323:345 */       if (((Boolean)parambec.getProperty(b)).booleanValue()) {
/* 324:346 */         i |= 0x4;
/* 325:    */       }
/* 326:    */     }
/* 327:350 */     return i;
/* 328:    */   }
/* 329:    */   
/* 330:    */   protected static int b(int paramInt)
/* 331:    */   {
/* 332:386 */     return paramInt & 0x7;
/* 333:    */   }
/* 334:    */   
/* 335:    */   public static boolean f(IBlockAccess paramard, BlockPosition paramdt)
/* 336:    */   {
/* 337:390 */     return g(e(paramard, paramdt));
/* 338:    */   }
/* 339:    */   
/* 340:    */   public static EnumDirection h(IBlockAccess paramard, BlockPosition paramdt)
/* 341:    */   {
/* 342:398 */     return f(e(paramard, paramdt));
/* 343:    */   }
/* 344:    */   
/* 345:    */   public static EnumDirection f(int paramInt)
/* 346:    */   {
/* 347:402 */     return EnumDirection.b(paramInt & 0x3).f();
/* 348:    */   }
/* 349:    */   
/* 350:    */   protected static boolean g(int paramInt)
/* 351:    */   {
/* 352:406 */     return (paramInt & 0x4) != 0;
/* 353:    */   }
/* 354:    */   
/* 355:    */   protected static boolean i(int paramInt)
/* 356:    */   {
/* 357:414 */     return (paramInt & 0x8) != 0;
/* 358:    */   }
/* 359:    */   
/* 360:    */   protected static boolean j(int paramInt)
/* 361:    */   {
/* 362:418 */     return (paramInt & 0x10) != 0;
/* 363:    */   }
/* 364:    */   
/* 365:    */   protected bed e()
/* 366:    */   {
/* 367:423 */     return new bed(this, new IBlockData[] { O, a, b, M, N });
/* 368:    */   }
/* 369:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avf
 * JD-Core Version:    0.7.0.1
 */
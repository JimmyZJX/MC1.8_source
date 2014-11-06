package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class awd
/*   4:    */   extends atg
/*   5:    */ {
/*   6: 26 */   public static final bew a = bew.a("legacy_data", 0, 15);
/*   7: 27 */   public static final bev<awf> b = bev.a("contents", awf.class);
/*   8:    */   
/*   9:    */   public awd()
/*  10:    */   {
/*  11: 30 */     super(Material.q);
/*  12: 31 */     j(this.L.b().a(b, awf.EMPTY).a(a, Integer.valueOf(0)));
/*  13: 32 */     h();
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void h()
/*  17:    */   {
/*  18: 37 */     float f1 = 0.375F;
/*  19: 38 */     float f2 = f1 / 2.0F;
/*  20: 39 */     a(0.5F - f2, 0.0F, 0.5F - f2, 0.5F + f2, f1, 0.5F + f2);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public boolean c()
/*  24:    */   {
/*  25: 44 */     return false;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public int b()
/*  29:    */   {
/*  30: 49 */     return 3;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public boolean isOpaqueCube()
/*  34:    */   {
/*  35: 54 */     return false;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public int a(IBlockAccess paramard, BlockPosition paramdt, int paramInt)
/*  39:    */   {
/*  40: 59 */     bcm localbcm = paramard.s(paramdt);
/*  41: 60 */     if ((localbcm instanceof bdb))
/*  42:    */     {
/*  43: 61 */       Item localalq = ((bdb)localbcm).b();
/*  44: 63 */       if ((localalq instanceof aju)) {
/*  45: 64 */         return ProtoBlock.a(localalq).a(paramard, paramdt, paramInt);
/*  46:    */       }
/*  47:    */     }
/*  48: 68 */     return 16777215;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  52:    */   {
/*  53: 73 */     ItemStack localamj = paramahd.bg.h();
/*  54: 74 */     if ((localamj == null) || (!(localamj.getItem() instanceof aju))) {
/*  55: 75 */       return false;
/*  56:    */     }
/*  57: 78 */     bdb localbdb = d(paramaqu, paramdt);
/*  58: 79 */     if (localbdb == null) {
/*  59: 80 */       return false;
/*  60:    */     }
/*  61: 83 */     if (localbdb.b() != null) {
/*  62: 84 */       return false;
/*  63:    */     }
/*  64: 87 */     ProtoBlock localatr = ProtoBlock.a(localamj.getItem());
/*  65: 88 */     if (!a(localatr, localamj.i())) {
/*  66: 89 */       return false;
/*  67:    */     }
/*  68: 91 */     localbdb.a(localamj.getItem(), localamj.i());
/*  69: 92 */     localbdb.o_();
/*  70: 93 */     paramaqu.h(paramdt);
/*  71: 95 */     if (!paramahd.by.d) {
/*  72: 96 */       if (--localamj.stackSize <= 0) {
/*  73: 97 */         paramahd.bg.a(paramahd.bg.c, null);
/*  74:    */       }
/*  75:    */     }
/*  76:101 */     return true;
/*  77:    */   }
/*  78:    */   
/*  79:    */   private boolean a(ProtoBlock paramatr, int paramInt)
/*  80:    */   {
/*  81:105 */     if ((paramatr == BlockList.yellowFlower) || (paramatr == BlockList.redFlower) || (paramatr == BlockList.cactus) || (paramatr == BlockList.brownMushroom) || (paramatr == BlockList.redMushroom) || (paramatr == BlockList.sapling) || (paramatr == BlockList.deadbush)) {
/*  82:106 */       return true;
/*  83:    */     }
/*  84:108 */     if ((paramatr == BlockList.tallgrass) && (paramInt == bbi.c.a())) {
/*  85:109 */       return true;
/*  86:    */     }
/*  87:111 */     return false;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public Item b(World paramaqu, BlockPosition paramdt)
/*  91:    */   {
/*  92:116 */     bdb localbdb = d(paramaqu, paramdt);
/*  93:117 */     if ((localbdb != null) && (localbdb.b() != null)) {
/*  94:118 */       return localbdb.b();
/*  95:    */     }
/*  96:121 */     return ItemList.bQ;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public int j(World paramaqu, BlockPosition paramdt)
/* 100:    */   {
/* 101:126 */     bdb localbdb = d(paramaqu, paramdt);
/* 102:127 */     if ((localbdb != null) && (localbdb.b() != null)) {
/* 103:128 */       return localbdb.c();
/* 104:    */     }
/* 105:131 */     return 0;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public boolean L()
/* 109:    */   {
/* 110:136 */     return true;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/* 114:    */   {
/* 115:141 */     return (super.c(paramaqu, paramdt)) && (World.isFlatSurface(paramaqu, paramdt.down()));
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/* 119:    */   {
/* 120:146 */     if (!World.isFlatSurface(paramaqu, paramdt.down()))
/* 121:    */     {
/* 122:147 */       b(paramaqu, paramdt, parambec, 0);
/* 123:    */       
/* 124:149 */       paramaqu.g(paramdt);
/* 125:    */     }
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/* 129:    */   {
/* 130:157 */     bdb localbdb = d(paramaqu, paramdt);
/* 131:158 */     if ((localbdb != null) && (localbdb.b() != null)) {
/* 132:159 */       a(paramaqu, paramdt, new ItemStack(localbdb.b(), 1, localbdb.c()));
/* 133:    */     }
/* 134:161 */     super.b(paramaqu, paramdt, parambec);
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd)
/* 138:    */   {
/* 139:166 */     super.a(paramaqu, paramdt, parambec, paramahd);
/* 140:168 */     if (paramahd.by.d)
/* 141:    */     {
/* 142:169 */       bdb localbdb = d(paramaqu, paramdt);
/* 143:170 */       if (localbdb != null) {
/* 144:172 */         localbdb.a(null, 0);
/* 145:    */       }
/* 146:    */     }
/* 147:    */   }
/* 148:    */   
/* 149:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 150:    */   {
/* 151:180 */     return ItemList.bQ;
/* 152:    */   }
/* 153:    */   
/* 154:    */   private bdb d(World paramaqu, BlockPosition paramdt)
/* 155:    */   {
/* 156:185 */     bcm localbcm = paramaqu.s(paramdt);
/* 157:186 */     if ((localbcm instanceof bdb)) {
/* 158:187 */       return (bdb)localbcm;
/* 159:    */     }
/* 160:190 */     return null;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public bcm a(World paramaqu, int paramInt)
/* 164:    */   {
/* 165:196 */     ProtoBlock block = null;
/* 166:197 */     int variant = 0;
/* 167:198 */     switch (paramInt)
/* 168:    */     {
/* 169:    */     default: 
/* 170:    */       break;
/* 171:    */     case 1: 
/* 172:202 */       block = BlockList.redFlower;
/* 173:203 */       variant = EnumFlowerVariant.b.b();
/* 174:204 */       break;
/* 175:    */     case 2: 
/* 176:206 */       block = BlockList.yellowFlower;
/* 177:207 */       break;
/* 178:    */     case 3: 
/* 179:209 */       block = BlockList.sapling;
/* 180:210 */       variant = EnumWoodVariant.OAK.getIndex();
/* 181:211 */       break;
/* 182:    */     case 4: 
/* 183:213 */       block = BlockList.sapling;
/* 184:214 */       variant = EnumWoodVariant.SPRUCE.getIndex();
/* 185:215 */       break;
/* 186:    */     case 5: 
/* 187:217 */       block = BlockList.sapling;
/* 188:218 */       variant = EnumWoodVariant.BIRCH.getIndex();
/* 189:219 */       break;
/* 190:    */     case 6: 
/* 191:221 */       block = BlockList.sapling;
/* 192:222 */       variant = EnumWoodVariant.JUNGLE.getIndex();
/* 193:223 */       break;
/* 194:    */     case 12: 
/* 195:225 */       block = BlockList.sapling;
/* 196:226 */       variant = EnumWoodVariant.ACACIA.getIndex();
/* 197:227 */       break;
/* 198:    */     case 13: 
/* 199:229 */       block = BlockList.sapling;
/* 200:230 */       variant = EnumWoodVariant.DARK_OAK.getIndex();
/* 201:231 */       break;
/* 202:    */     case 7: 
/* 203:233 */       block = BlockList.redMushroom;
/* 204:234 */       break;
/* 205:    */     case 8: 
/* 206:236 */       block = BlockList.brownMushroom;
/* 207:237 */       break;
/* 208:    */     case 9: 
/* 209:239 */       block = BlockList.cactus;
/* 210:240 */       break;
/* 211:    */     case 10: 
/* 212:242 */       block = BlockList.deadbush;
/* 213:243 */       break;
/* 214:    */     case 11: 
/* 215:245 */       block = BlockList.tallgrass;
/* 216:246 */       variant = bbi.c.a();
/* 217:    */     }
/* 218:249 */     return new bdb(Item.fromProtoBlock(block), variant);
/* 219:    */   }
/* 220:    */   
/* 221:    */   protected bed e()
/* 222:    */   {
/* 223:254 */     return new bed(this, new bex[] { b, a });
/* 224:    */   }
/* 225:    */   
/* 226:    */   public int c(Block parambec)
/* 227:    */   {
/* 228:259 */     return ((Integer)parambec.getProperty(a)).intValue();
/* 229:    */   }
/* 230:    */   
/* 231:    */   public Block a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/* 232:    */   {
/* 233:264 */     awf localawf = awf.EMPTY;
/* 234:    */     
/* 235:266 */     bcm localbcm = paramard.s(paramdt);
/* 236:267 */     if ((localbcm instanceof bdb))
/* 237:    */     {
/* 238:268 */       bdb localbdb = (bdb)localbcm;
/* 239:269 */       Item localalq = localbdb.b();
/* 240:271 */       if ((localalq instanceof aju))
/* 241:    */       {
/* 242:272 */         int i = localbdb.c();
/* 243:273 */         ProtoBlock localatr = ProtoBlock.a(localalq);
/* 244:274 */         if (localatr == BlockList.sapling) {
/* 245:275 */           switch (awe.a[EnumWoodVariant.fromIndex(i).ordinal()])
/* 246:    */           {
/* 247:    */           case 1: 
/* 248:277 */             localawf = awf.OAK_SAPLING;
/* 249:278 */             break;
/* 250:    */           case 2: 
/* 251:280 */             localawf = awf.SPRUCE_SAPLING;
/* 252:281 */             break;
/* 253:    */           case 3: 
/* 254:283 */             localawf = awf.BIRCH_SAPLING;
/* 255:284 */             break;
/* 256:    */           case 4: 
/* 257:286 */             localawf = awf.JUNGLE_SAPLING;
/* 258:287 */             break;
/* 259:    */           case 5: 
/* 260:289 */             localawf = awf.ACACIA_SAPLING;
/* 261:290 */             break;
/* 262:    */           case 6: 
/* 263:292 */             localawf = awf.DARK_OAK_SAPLING;
/* 264:293 */             break;
/* 265:    */           default: 
/* 266:295 */             localawf = awf.EMPTY; break;
/* 267:    */           }
/* 268:297 */         } else if (localatr == BlockList.tallgrass) {
/* 269:298 */           switch (i)
/* 270:    */           {
/* 271:    */           case 0: 
/* 272:300 */             localawf = awf.DEAD_BUSH;
/* 273:301 */             break;
/* 274:    */           case 2: 
/* 275:303 */             localawf = awf.FERN;
/* 276:304 */             break;
/* 277:    */           default: 
/* 278:306 */             localawf = awf.EMPTY; break;
/* 279:    */           }
/* 280:308 */         } else if (localatr == BlockList.yellowFlower) {
/* 281:309 */           localawf = awf.DANDELION;
/* 282:310 */         } else if (localatr == BlockList.redFlower) {
/* 283:311 */           switch (awe.b[EnumFlowerVariant.a(awc.b, i).ordinal()])
/* 284:    */           {
/* 285:    */           case 1: 
/* 286:313 */             localawf = awf.POPPY;
/* 287:314 */             break;
/* 288:    */           case 2: 
/* 289:316 */             localawf = awf.BLUE_ORCHID;
/* 290:317 */             break;
/* 291:    */           case 3: 
/* 292:319 */             localawf = awf.ALLIUM;
/* 293:320 */             break;
/* 294:    */           case 4: 
/* 295:322 */             localawf = awf.HOUSTONIA;
/* 296:323 */             break;
/* 297:    */           case 5: 
/* 298:325 */             localawf = awf.RED_TULIP;
/* 299:326 */             break;
/* 300:    */           case 6: 
/* 301:328 */             localawf = awf.ORANGE_TULIP;
/* 302:329 */             break;
/* 303:    */           case 7: 
/* 304:331 */             localawf = awf.WHITE_TULIP;
/* 305:332 */             break;
/* 306:    */           case 8: 
/* 307:334 */             localawf = awf.PINK_TULIP;
/* 308:335 */             break;
/* 309:    */           case 9: 
/* 310:337 */             localawf = awf.OXEYE_DAISY;
/* 311:338 */             break;
/* 312:    */           default: 
/* 313:340 */             localawf = awf.EMPTY; break;
/* 314:    */           }
/* 315:342 */         } else if (localatr == BlockList.redMushroom) {
/* 316:343 */           localawf = awf.MUSHROOM_RED;
/* 317:344 */         } else if (localatr == BlockList.brownMushroom) {
/* 318:345 */           localawf = awf.MUSHROOM_BROWN;
/* 319:346 */         } else if (localatr == BlockList.deadbush) {
/* 320:347 */           localawf = awf.DEAD_BUSH;
/* 321:348 */         } else if (localatr == BlockList.cactus) {
/* 322:349 */           localawf = awf.CACTUS;
/* 323:    */         }
/* 324:    */       }
/* 325:    */     }
/* 326:354 */     return parambec.a(b, localawf);
/* 327:    */   }
/* 328:    */   
/* 329:    */   public aql k()
/* 330:    */   {
/* 331:401 */     return aql.c;
/* 332:    */   }
/* 333:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     awd
 * JD-Core Version:    0.7.0.1
 */
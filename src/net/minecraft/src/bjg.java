package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bjg
/*   5:    */   extends bms
/*   6:    */ {
/*   7:    */   private boolean a;
/*   8:    */   private boolean b;
/*   9:    */   private boolean c;
/*  10:    */   private int d;
/*  11:    */   
/*  12:    */   public bjg() {}
/*  13:    */   
/*  14:    */   protected void a(NBTTagCompound paramfn)
/*  15:    */   {
/*  16:212 */     paramfn.setBoolean("hr", this.a);
/*  17:213 */     paramfn.setBoolean("sc", this.b);
/*  18:214 */     paramfn.setBoolean("hps", this.c);
/*  19:215 */     paramfn.setInt("Num", this.d);
/*  20:    */   }
/*  21:    */   
/*  22:    */   protected void b(NBTTagCompound paramfn)
/*  23:    */   {
/*  24:220 */     this.a = paramfn.getBoolean("hr");
/*  25:221 */     this.b = paramfn.getBoolean("sc");
/*  26:222 */     this.c = paramfn.getBoolean("hps");
/*  27:223 */     this.d = paramfn.getInteger("Num");
/*  28:    */   }
/*  29:    */   
/*  30:    */   public bjg(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*  31:    */   {
/*  32:227 */     super(paramInt);
/*  33:228 */     this.m = paramej;
/*  34:229 */     this.l = parambjb;
/*  35:230 */     this.a = (paramRandom.nextInt(3) == 0);
/*  36:231 */     this.b = ((!this.a) && (paramRandom.nextInt(23) == 0));
/*  37:233 */     if ((this.m == EnumDirection.NORTH) || (this.m == EnumDirection.SOUTH)) {
/*  38:234 */       this.d = (parambjb.e() / 5);
/*  39:    */     } else {
/*  40:236 */       this.d = (parambjb.c() / 5);
/*  41:    */     }
/*  42:    */   }
/*  43:    */   
/*  44:    */   public static bjb a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej)
/*  45:    */   {
/*  46:241 */     bjb localbjb = new bjb(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2 + 2, paramInt3);
/*  47:    */     
/*  48:243 */     int i = paramRandom.nextInt(3) + 2;
/*  49:244 */     while (i > 0)
/*  50:    */     {
/*  51:245 */       int j = i * 5;
/*  52:247 */       switch (bjf.a[paramej.ordinal()])
/*  53:    */       {
/*  54:    */       case 1: 
/*  55:249 */         localbjb.d = (paramInt1 + 2);
/*  56:250 */         localbjb.c = (paramInt3 - (j - 1));
/*  57:251 */         break;
/*  58:    */       case 2: 
/*  59:253 */         localbjb.d = (paramInt1 + 2);
/*  60:254 */         localbjb.f = (paramInt3 + (j - 1));
/*  61:255 */         break;
/*  62:    */       case 3: 
/*  63:257 */         localbjb.a = (paramInt1 - (j - 1));
/*  64:258 */         localbjb.f = (paramInt3 + 2);
/*  65:259 */         break;
/*  66:    */       case 4: 
/*  67:261 */         localbjb.d = (paramInt1 + (j - 1));
/*  68:262 */         localbjb.f = (paramInt3 + 2);
/*  69:    */       }
/*  70:266 */       if (bms.a(paramList, localbjb) == null) {
/*  71:    */         break;
/*  72:    */       }
/*  73:267 */       i--;
/*  74:    */     }
/*  75:273 */     if (i > 0) {
/*  76:274 */       return localbjb;
/*  77:    */     }
/*  78:277 */     return null;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void a(bms parambms, List<bms> paramList, Random paramRandom)
/*  82:    */   {
/*  83:282 */     int i = d();
/*  84:283 */     int j = paramRandom.nextInt(4);
/*  85:284 */     if (this.m != null) {
/*  86:285 */       switch (bjf.a[this.m.ordinal()])
/*  87:    */       {
/*  88:    */       case 1: 
/*  89:287 */         if (j <= 1) {
/*  90:288 */           bje.a(parambms, paramList, paramRandom, this.l.a, this.l.b - 1 + paramRandom.nextInt(3), this.l.c - 1, this.m, i);
/*  91:289 */         } else if (j == 2) {
/*  92:290 */           bje.a(parambms, paramList, paramRandom, this.l.a - 1, this.l.b - 1 + paramRandom.nextInt(3), this.l.c, EnumDirection.WEST, i);
/*  93:    */         } else {
/*  94:292 */           bje.a(parambms, paramList, paramRandom, this.l.d + 1, this.l.b - 1 + paramRandom.nextInt(3), this.l.c, EnumDirection.EAST, i);
/*  95:    */         }
/*  96:294 */         break;
/*  97:    */       case 2: 
/*  98:296 */         if (j <= 1) {
/*  99:297 */           bje.a(parambms, paramList, paramRandom, this.l.a, this.l.b - 1 + paramRandom.nextInt(3), this.l.f + 1, this.m, i);
/* 100:298 */         } else if (j == 2) {
/* 101:299 */           bje.a(parambms, paramList, paramRandom, this.l.a - 1, this.l.b - 1 + paramRandom.nextInt(3), this.l.f - 3, EnumDirection.WEST, i);
/* 102:    */         } else {
/* 103:301 */           bje.a(parambms, paramList, paramRandom, this.l.d + 1, this.l.b - 1 + paramRandom.nextInt(3), this.l.f - 3, EnumDirection.EAST, i);
/* 104:    */         }
/* 105:303 */         break;
/* 106:    */       case 3: 
/* 107:305 */         if (j <= 1) {
/* 108:306 */           bje.a(parambms, paramList, paramRandom, this.l.a - 1, this.l.b - 1 + paramRandom.nextInt(3), this.l.c, this.m, i);
/* 109:307 */         } else if (j == 2) {
/* 110:308 */           bje.a(parambms, paramList, paramRandom, this.l.a, this.l.b - 1 + paramRandom.nextInt(3), this.l.c - 1, EnumDirection.NORTH, i);
/* 111:    */         } else {
/* 112:310 */           bje.a(parambms, paramList, paramRandom, this.l.a, this.l.b - 1 + paramRandom.nextInt(3), this.l.f + 1, EnumDirection.SOUTH, i);
/* 113:    */         }
/* 114:312 */         break;
/* 115:    */       case 4: 
/* 116:314 */         if (j <= 1) {
/* 117:315 */           bje.a(parambms, paramList, paramRandom, this.l.d + 1, this.l.b - 1 + paramRandom.nextInt(3), this.l.c, this.m, i);
/* 118:316 */         } else if (j == 2) {
/* 119:317 */           bje.a(parambms, paramList, paramRandom, this.l.d - 3, this.l.b - 1 + paramRandom.nextInt(3), this.l.c - 1, EnumDirection.NORTH, i);
/* 120:    */         } else {
/* 121:319 */           bje.a(parambms, paramList, paramRandom, this.l.d - 3, this.l.b - 1 + paramRandom.nextInt(3), this.l.f + 1, EnumDirection.SOUTH, i);
/* 122:    */         }
/* 123:    */         break;
/* 124:    */       }
/* 125:    */     }
/* 126:326 */     if (i < 8)
/* 127:    */     {
/* 128:    */       int k;
/* 129:    */       int m;
/* 130:327 */       if ((this.m == EnumDirection.NORTH) || (this.m == EnumDirection.SOUTH)) {
/* 131:328 */         for (k = this.l.c + 3; k + 3 <= this.l.f; k += 5)
/* 132:    */         {
/* 133:329 */           m = paramRandom.nextInt(5);
/* 134:330 */           if (m == 0) {
/* 135:331 */             bje.a(parambms, paramList, paramRandom, this.l.a - 1, this.l.b, k, EnumDirection.WEST, i + 1);
/* 136:332 */           } else if (m == 1) {
/* 137:333 */             bje.a(parambms, paramList, paramRandom, this.l.d + 1, this.l.b, k, EnumDirection.EAST, i + 1);
/* 138:    */           }
/* 139:    */         }
/* 140:    */       } else {
/* 141:337 */         for (k = this.l.a + 3; k + 3 <= this.l.d; k += 5)
/* 142:    */         {
/* 143:338 */           m = paramRandom.nextInt(5);
/* 144:339 */           if (m == 0) {
/* 145:340 */             bje.a(parambms, paramList, paramRandom, k, this.l.b, this.l.c - 1, EnumDirection.NORTH, i + 1);
/* 146:341 */           } else if (m == 1) {
/* 147:342 */             bje.a(parambms, paramList, paramRandom, k, this.l.b, this.l.f + 1, EnumDirection.SOUTH, i + 1);
/* 148:    */           }
/* 149:    */         }
/* 150:    */       }
/* 151:    */     }
/* 152:    */   }
/* 153:    */   
/* 154:    */   protected boolean a(World paramaqu, bjb parambjb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, List paramList, int paramInt4)
/* 155:    */   {
/* 156:351 */     BlockPosition localdt = new BlockPosition(a(paramInt1, paramInt3), d(paramInt2), b(paramInt1, paramInt3));
/* 157:352 */     if ((parambjb.b(localdt)) && 
/* 158:353 */       (paramaqu.getBlock(localdt).getType().getMaterial() == Material.air))
/* 159:    */     {
/* 160:354 */       int i = paramRandom.nextBoolean() ? 1 : 0;
/* 161:355 */       paramaqu.setBlock(localdt, BlockList.av.instance(a(BlockList.av, i)), 2);
/* 162:356 */       aea localaea = new aea(paramaqu, localdt.getX() + 0.5F, localdt.getY() + 0.5F, localdt.getZ() + 0.5F);
/* 163:357 */       vl.a(paramRandom, paramList, localaea, paramInt4);
/* 164:358 */       paramaqu.spawnEntity(localaea);
/* 165:359 */       return true;
/* 166:    */     }
/* 167:363 */     return false;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/* 171:    */   {
/* 172:368 */     if (a(paramaqu, parambjb)) {
/* 173:369 */       return false;
/* 174:    */     }
/* 175:372 */     int i = 0;
/* 176:373 */     int j = 2;
/* 177:374 */     int k = 0;
/* 178:375 */     int m = 2;
/* 179:376 */     int n = this.d * 5 - 1;
/* 180:    */     
/* 181:    */ 
/* 182:379 */     a(paramaqu, parambjb, 0, 0, 0, 2, 1, n, BlockList.air.instance(), BlockList.air.instance(), false);
/* 183:380 */     a(paramaqu, parambjb, paramRandom, 0.8F, 0, 2, 0, 2, 2, n, BlockList.air.instance(), BlockList.air.instance(), false);
/* 184:382 */     if (this.b) {
/* 185:383 */       a(paramaqu, parambjb, paramRandom, 0.6F, 0, 0, 0, 2, 1, n, BlockList.web.instance(), BlockList.air.instance(), false);
/* 186:    */     }
/* 187:    */     int i2;
/* 188:    */     int i3;
/* 189:    */     int i5;
/* 190:387 */     for (int i1 = 0; i1 < this.d; i1++)
/* 191:    */     {
/* 192:388 */       i2 = 2 + i1 * 5;
/* 193:    */       
/* 194:390 */       a(paramaqu, parambjb, 0, 0, i2, 0, 1, i2, BlockList.fence.instance(), BlockList.air.instance(), false);
/* 195:391 */       a(paramaqu, parambjb, 2, 0, i2, 2, 1, i2, BlockList.fence.instance(), BlockList.air.instance(), false);
/* 196:392 */       if (paramRandom.nextInt(4) == 0)
/* 197:    */       {
/* 198:393 */         a(paramaqu, parambjb, 0, 2, i2, 0, 2, i2, BlockList.planks.instance(), BlockList.air.instance(), false);
/* 199:394 */         a(paramaqu, parambjb, 2, 2, i2, 2, 2, i2, BlockList.planks.instance(), BlockList.air.instance(), false);
/* 200:    */       }
/* 201:    */       else
/* 202:    */       {
/* 203:396 */         a(paramaqu, parambjb, 0, 2, i2, 2, 2, i2, BlockList.planks.instance(), BlockList.air.instance(), false);
/* 204:    */       }
/* 205:398 */       a(paramaqu, parambjb, paramRandom, 0.1F, 0, 2, i2 - 1, BlockList.web.instance());
/* 206:399 */       a(paramaqu, parambjb, paramRandom, 0.1F, 2, 2, i2 - 1, BlockList.web.instance());
/* 207:400 */       a(paramaqu, parambjb, paramRandom, 0.1F, 0, 2, i2 + 1, BlockList.web.instance());
/* 208:401 */       a(paramaqu, parambjb, paramRandom, 0.1F, 2, 2, i2 + 1, BlockList.web.instance());
/* 209:402 */       a(paramaqu, parambjb, paramRandom, 0.05F, 0, 2, i2 - 2, BlockList.web.instance());
/* 210:403 */       a(paramaqu, parambjb, paramRandom, 0.05F, 2, 2, i2 - 2, BlockList.web.instance());
/* 211:404 */       a(paramaqu, parambjb, paramRandom, 0.05F, 0, 2, i2 + 2, BlockList.web.instance());
/* 212:405 */       a(paramaqu, parambjb, paramRandom, 0.05F, 2, 2, i2 + 2, BlockList.web.instance());
/* 213:    */       
/* 214:407 */       a(paramaqu, parambjb, paramRandom, 0.05F, 1, 2, i2 - 1, BlockList.torch.instance(EnumDirection.UP.a()));
/* 215:408 */       a(paramaqu, parambjb, paramRandom, 0.05F, 1, 2, i2 + 1, BlockList.torch.instance(EnumDirection.UP.a()));
/* 216:410 */       if (paramRandom.nextInt(100) == 0) {
/* 217:411 */         a(paramaqu, parambjb, paramRandom, 2, 0, i2 - 1, vl.a(bje.b(), new vl[] { ItemList.enchantedBook.b(paramRandom) }), 3 + paramRandom.nextInt(4));
/* 218:    */       }
/* 219:413 */       if (paramRandom.nextInt(100) == 0) {
/* 220:414 */         a(paramaqu, parambjb, paramRandom, 0, 0, i2 + 1, vl.a(bje.b(), new vl[] { ItemList.enchantedBook.b(paramRandom) }), 3 + paramRandom.nextInt(4));
/* 221:    */       }
/* 222:416 */       if ((this.b) && (!this.c))
/* 223:    */       {
/* 224:417 */         i3 = d(0);int i4 = i2 - 1 + paramRandom.nextInt(3);
/* 225:418 */         i5 = a(1, i4);
/* 226:419 */         i4 = b(1, i4);
/* 227:420 */         BlockPosition localdt = new BlockPosition(i5, i3, i4);
/* 228:421 */         if (parambjb.b(localdt))
/* 229:    */         {
/* 230:422 */           this.c = true;
/* 231:423 */           paramaqu.setBlock(localdt, BlockList.mobSpawner.instance(), 2);
/* 232:    */           
/* 233:425 */           bcm localbcm = paramaqu.s(localdt);
/* 234:426 */           if ((localbcm instanceof bdg)) {
/* 235:427 */             ((bdg)localbcm).b().a("CaveSpider");
/* 236:    */           }
/* 237:    */         }
/* 238:    */       }
/* 239:    */     }
/* 240:434 */     for (int i1 = 0; i1 <= 2; i1++) {
/* 241:435 */       for (i2 = 0; i2 <= n; i2++)
/* 242:    */       {
/* 243:436 */         i3 = -1;
/* 244:437 */         Block localbec2 = a(paramaqu, i1, i3, i2, parambjb);
/* 245:438 */         if (localbec2.getType().getMaterial() == Material.air)
/* 246:    */         {
/* 247:439 */           i5 = -1;
/* 248:440 */           a(paramaqu, BlockList.planks.instance(), i1, i5, i2, parambjb);
/* 249:    */         }
/* 250:    */       }
/* 251:    */     }
/* 252:445 */     if (this.a) {
/* 253:446 */       for (int i1 = 0; i1 <= n; i1++)
/* 254:    */       {
/* 255:447 */         Block localbec1 = a(paramaqu, 1, -1, i1, parambjb);
/* 256:448 */         if ((localbec1.getType().getMaterial() != Material.air) && (localbec1.getType().m())) {
/* 257:449 */           a(paramaqu, parambjb, paramRandom, 0.7F, 1, 0, i1, BlockList.av.instance(a(BlockList.av, 0)));
/* 258:    */         }
/* 259:    */       }
/* 260:    */     }
/* 261:454 */     return true;
/* 262:    */   }
/* 263:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjg
 * JD-Core Version:    0.7.0.1
 */
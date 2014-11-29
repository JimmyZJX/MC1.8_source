package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class qx
/*   4:    */ {
/*   5:    */   public World a;
/*   6:    */   public qw b;
/*   7: 26 */   private EnumGameMode c = EnumGameMode.NOT_SET;
/*   8:    */   private boolean d;
/*   9:    */   private int e;
/*  10: 30 */   private BlockPosition f = BlockPosition.zero;
/*  11:    */   private int g;
/*  12:    */   private boolean h;
/*  13: 34 */   private BlockPosition i = BlockPosition.zero;
/*  14:    */   private int j;
/*  15: 36 */   private int k = -1;
/*  16:    */   
/*  17:    */   public qx(World paramaqu)
/*  18:    */   {
/*  19: 39 */     this.a = paramaqu;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void a(EnumGameMode paramarc)
/*  23:    */   {
/*  24: 43 */     this.c = paramarc;
/*  25:    */     
/*  26: 45 */     paramarc.setPlayerAbilities(this.b.abilities);
/*  27:    */     
/*  28: 47 */     this.b.t();
/*  29: 48 */     this.b.b.an().a(new kh(kj.b, new qw[] { this.b }));
/*  30:    */   }
/*  31:    */   
/*  32:    */   public EnumGameMode b()
/*  33:    */   {
/*  34: 52 */     return this.c;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public boolean c()
/*  38:    */   {
/*  39: 56 */     return this.c.e();
/*  40:    */   }
/*  41:    */   
/*  42:    */   public boolean d()
/*  43:    */   {
/*  44: 60 */     return this.c.d();
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void b(EnumGameMode paramarc)
/*  48:    */   {
/*  49: 64 */     if (this.c == EnumGameMode.NOT_SET) {
/*  50: 65 */       this.c = paramarc;
/*  51:    */     }
/*  52: 67 */     a(this.c);
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void a()
/*  56:    */   {
/*  57: 71 */     this.g += 1;
/*  58:    */     float f1;
/*  59:    */     int i1;
/*  60: 73 */     if (this.h)
/*  61:    */     {
/*  62: 74 */       int m = this.g - this.j;
/*  63: 75 */       BlockType localatr2 = this.a.getBlock(this.i).getType();
/*  64: 76 */       if (localatr2.getMaterial() == Material.air)
/*  65:    */       {
/*  66: 77 */         this.h = false;
/*  67:    */       }
/*  68:    */       else
/*  69:    */       {
/*  70: 79 */         f1 = localatr2.a(this.b, this.b.world, this.i) * (m + 1);
/*  71: 80 */         i1 = (int)(f1 * 10.0F);
/*  72: 82 */         if (i1 != this.k)
/*  73:    */         {
/*  74: 83 */           this.a.c(this.b.getID(), this.i, i1);
/*  75: 84 */           this.k = i1;
/*  76:    */         }
/*  77: 87 */         if (f1 >= 1.0F)
/*  78:    */         {
/*  79: 88 */           this.h = false;
/*  80: 89 */           b(this.i);
/*  81:    */         }
/*  82:    */       }
/*  83:    */     }
/*  84: 92 */     else if (this.d)
/*  85:    */     {
/*  86: 93 */       BlockType localatr1 = this.a.getBlock(this.f).getType();
/*  87: 95 */       if (localatr1.getMaterial() == Material.air)
/*  88:    */       {
/*  89: 96 */         this.a.c(this.b.getID(), this.f, -1);
/*  90: 97 */         this.k = -1;
/*  91: 98 */         this.d = false;
/*  92:    */       }
/*  93:    */       else
/*  94:    */       {
/*  95:100 */         int n = this.g - this.e;
/*  96:101 */         f1 = localatr1.a(this.b, this.b.world, this.i) * (n + 1);
/*  97:102 */         i1 = (int)(f1 * 10.0F);
/*  98:104 */         if (i1 != this.k)
/*  99:    */         {
/* 100:105 */           this.a.c(this.b.getID(), this.f, i1);
/* 101:106 */           this.k = i1;
/* 102:    */         }
/* 103:    */       }
/* 104:    */     }
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void a(BlockPosition paramdt, EnumDirection paramej)
/* 108:    */   {
/* 109:113 */     if (d())
/* 110:    */     {
/* 111:114 */       if (!this.a.a(null, paramdt, paramej)) {
/* 112:115 */         b(paramdt);
/* 113:    */       }
/* 114:117 */       return;
/* 115:    */     }
/* 116:120 */     BlockType localatr = this.a.getBlock(paramdt).getType();
/* 117:121 */     if (this.c.noBuild())
/* 118:    */     {
/* 119:122 */       if (this.c == EnumGameMode.SPECTATOR) {
/* 120:123 */         return;
/* 121:    */       }
/* 122:125 */       if (!this.b.cm())
/* 123:    */       {
/* 124:126 */         ItemStack localamj = this.b.bY();
/* 125:127 */         if (localamj == null) {
/* 126:128 */           return;
/* 127:    */         }
/* 128:130 */         if (!localamj.c(localatr)) {
/* 129:131 */           return;
/* 130:    */         }
/* 131:    */       }
/* 132:    */     }
/* 133:136 */     this.a.a(null, paramdt, paramej);
/* 134:137 */     this.e = this.g;
/* 135:138 */     float f1 = 1.0F;
/* 136:139 */     if (localatr.getMaterial() != Material.air)
/* 137:    */     {
/* 138:140 */       localatr.a(this.a, paramdt, this.b);
/* 139:141 */       f1 = localatr.a(this.b, this.b.world, paramdt);
/* 140:    */     }
/* 141:144 */     if ((localatr.getMaterial() != Material.air) && (f1 >= 1.0F))
/* 142:    */     {
/* 143:145 */       b(paramdt);
/* 144:    */     }
/* 145:    */     else
/* 146:    */     {
/* 147:147 */       this.d = true;
/* 148:148 */       this.f = paramdt;
/* 149:    */       
/* 150:150 */       int m = (int)(f1 * 10.0F);
/* 151:151 */       this.a.c(this.b.getID(), paramdt, m);
/* 152:152 */       this.k = m;
/* 153:    */     }
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void a(BlockPosition paramdt)
/* 157:    */   {
/* 158:157 */     if (paramdt.equals(this.f))
/* 159:    */     {
/* 160:158 */       int m = this.g - this.e;
/* 161:    */       
/* 162:160 */       BlockType localatr = this.a.getBlock(paramdt).getType();
/* 163:161 */       if (localatr.getMaterial() != Material.air)
/* 164:    */       {
/* 165:162 */         float f1 = localatr.a(this.b, this.b.world, paramdt) * (m + 1);
/* 166:163 */         if (f1 >= 0.7F)
/* 167:    */         {
/* 168:164 */           this.d = false;
/* 169:165 */           this.a.c(this.b.getID(), paramdt, -1);
/* 170:166 */           b(paramdt);
/* 171:    */         }
/* 172:167 */         else if (!this.h)
/* 173:    */         {
/* 174:168 */           this.d = false;
/* 175:169 */           this.h = true;
/* 176:170 */           this.i = paramdt;
/* 177:171 */           this.j = this.e;
/* 178:    */         }
/* 179:    */       }
/* 180:    */     }
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void e()
/* 184:    */   {
/* 185:178 */     this.d = false;
/* 186:    */     
/* 187:180 */     this.a.c(this.b.getID(), this.f, -1);
/* 188:    */   }
/* 189:    */   
/* 190:    */   private boolean c(BlockPosition paramdt)
/* 191:    */   {
/* 192:184 */     Block localbec = this.a.getBlock(paramdt);
/* 193:    */     
/* 194:186 */     localbec.getType().a(this.a, paramdt, localbec, this.b);
/* 195:    */     
/* 196:188 */     boolean bool = this.a.g(paramdt);
/* 197:189 */     if (bool) {
/* 198:190 */       localbec.getType().d(this.a, paramdt, localbec);
/* 199:    */     }
/* 200:192 */     return bool;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public boolean b(BlockPosition paramdt)
/* 204:    */   {
/* 205:196 */     if ((this.c.d()) && 
/* 206:197 */       (this.b.getHeldItemStack() != null) && ((this.b.getHeldItemStack().getItem() instanceof ItemSword))) {
/* 207:198 */       return false;
/* 208:    */     }
/* 209:202 */     Block localbec = this.a.getBlock(paramdt);
/* 210:203 */     bcm localbcm = this.a.s(paramdt);
/* 211:205 */     if (this.c.noBuild())
/* 212:    */     {
/* 213:206 */       if (this.c == EnumGameMode.SPECTATOR) {
/* 214:207 */         return false;
/* 215:    */       }
/* 216:209 */       if (!this.b.cm())
/* 217:    */       {
/* 218:210 */         ItemStack localamj1 = this.b.bY();
/* 219:211 */         if (localamj1 == null) {
/* 220:212 */           return false;
/* 221:    */         }
/* 222:214 */         if (!localamj1.c(localbec.getType())) {
/* 223:215 */           return false;
/* 224:    */         }
/* 225:    */       }
/* 226:    */     }
/* 227:220 */     this.a.playLevelEvent(this.b, 2001, paramdt, BlockType.f(localbec));
/* 228:    */     
/* 229:222 */     boolean bool1 = c(paramdt);
/* 230:224 */     if (d())
/* 231:    */     {
/* 232:225 */       this.b.a.a(new iw(this.a, paramdt));
/* 233:    */     }
/* 234:    */     else
/* 235:    */     {
/* 236:227 */       ItemStack localamj2 = this.b.bY();
/* 237:228 */       boolean bool2 = this.b.canHarvestBlock(localbec.getType());
/* 238:229 */       if (localamj2 != null)
/* 239:    */       {
/* 240:230 */         localamj2.a(this.a, localbec.getType(), paramdt, this.b);
/* 241:231 */         if (localamj2.stackSize == 0) {
/* 242:232 */           this.b.bZ();
/* 243:    */         }
/* 244:    */       }
/* 245:235 */       if ((bool1) && (bool2)) {
/* 246:236 */         localbec.getType().a(this.a, this.b, paramdt, localbec, localbcm);
/* 247:    */       }
/* 248:    */     }
/* 249:239 */     return bool1;
/* 250:    */   }
/* 251:    */   
/* 252:    */   public boolean a(EntityPlayer paramahd, World paramaqu, ItemStack paramamj)
/* 253:    */   {
/* 254:243 */     if (this.c == EnumGameMode.SPECTATOR) {
/* 255:244 */       return false;
/* 256:    */     }
/* 257:246 */     int m = paramamj.stackSize;
/* 258:247 */     int n = paramamj.getDamage2();
/* 259:248 */     ItemStack localamj = paramamj.a(paramaqu, paramahd);
/* 260:249 */     if ((localamj != paramamj) || ((localamj != null) && ((localamj.stackSize != m) || (localamj.l() > 0) || (localamj.getDamage2() != n))))
/* 261:    */     {
/* 262:250 */       paramahd.inventory.items[paramahd.inventory.c] = localamj;
/* 263:251 */       if (d())
/* 264:    */       {
/* 265:252 */         localamj.stackSize = m;
/* 266:253 */         if (localamj.e()) {
/* 267:254 */           localamj.b(n);
/* 268:    */         }
/* 269:    */       }
/* 270:257 */       if (localamj.stackSize == 0) {
/* 271:258 */         paramahd.inventory.items[paramahd.inventory.c] = null;
/* 272:    */       }
/* 273:260 */       if (!paramahd.bR()) {
/* 274:261 */         ((qw)paramahd).a(paramahd.bh);
/* 275:    */       }
/* 276:263 */       return true;
/* 277:    */     }
/* 278:265 */     return false;
/* 279:    */   }
/* 280:    */   
/* 281:    */   public boolean a(EntityPlayer paramahd, World paramaqu, ItemStack paramamj, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 282:    */   {
/* 283:    */     Object localObject;
/* 284:269 */     if (this.c == EnumGameMode.SPECTATOR)
/* 285:    */     {
/* 286:270 */       localObject = paramaqu.s(paramdt);
/* 287:271 */       if ((localObject instanceof vy))
/* 288:    */       {
/* 289:272 */         BlockType localatr = paramaqu.getBlock(paramdt).getType();
/* 290:273 */         vy localvy = (vy)localObject;
/* 291:275 */         if (((localvy instanceof bcr)) && ((localatr instanceof BlockChest))) {
/* 292:276 */           localvy = ((BlockChest)localatr).d(paramaqu, paramdt);
/* 293:    */         }
/* 294:279 */         if (localvy != null)
/* 295:    */         {
/* 296:280 */           paramahd.a((vq)localvy);
/* 297:281 */           return true;
/* 298:    */         }
/* 299:    */       }
/* 300:283 */       else if ((localObject instanceof vq))
/* 301:    */       {
/* 302:284 */         paramahd.a((vq)localObject);
/* 303:285 */         return true;
/* 304:    */       }
/* 305:287 */       return false;
/* 306:    */     }
/* 307:290 */     if ((!paramahd.aw()) || (paramahd.getHeldItemStack() == null))
/* 308:    */     {
/* 309:291 */       localObject = paramaqu.getBlock(paramdt);
/* 310:292 */       if (((Block)localObject).getType().a(paramaqu, paramdt, (Block)localObject, paramahd, paramej, paramFloat1, paramFloat2, paramFloat3)) {
/* 311:293 */         return true;
/* 312:    */       }
/* 313:    */     }
/* 314:297 */     if (paramamj == null) {
/* 315:298 */       return false;
/* 316:    */     }
/* 317:301 */     if (d())
/* 318:    */     {
/* 319:302 */       int m = paramamj.getDamage2();
/* 320:303 */       int n = paramamj.stackSize;
/* 321:304 */       boolean bool = paramamj.a(paramahd, paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3);
/* 322:305 */       paramamj.b(m);
/* 323:306 */       paramamj.stackSize = n;
/* 324:307 */       return bool;
/* 325:    */     }
/* 326:309 */     return paramamj.a(paramahd, paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3);
/* 327:    */   }
/* 328:    */   
/* 329:    */   public void a(WorldServer paramqt)
/* 330:    */   {
/* 331:314 */     this.a = paramqt;
/* 332:    */   }
/* 333:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     qx
 * JD-Core Version:    0.7.0.1
 */
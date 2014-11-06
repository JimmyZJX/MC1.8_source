package net.minecraft.src;
/*   1:    */ public class cem
/*   2:    */ {
/*   3:    */   private final bsu a;
/*   4:    */   private final cee b;
/*   5: 33 */   private BlockPosition c = new BlockPosition(-1, -1, -1);
/*   6:    */   private ItemStack d;
/*   7:    */   private float e;
/*   8:    */   private float f;
/*   9:    */   private int g;
/*  10:    */   private boolean h;
/*  11: 39 */   private EnumGameType i = EnumGameType.b;
/*  12:    */   private int j;
/*  13:    */   
/*  14:    */   public cem(bsu parambsu, cee paramcee)
/*  15:    */   {
/*  16: 42 */     this.a = parambsu;
/*  17: 43 */     this.b = paramcee;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public static void a(bsu parambsu, cem paramcem, BlockPosition paramdt, EnumDirection paramej)
/*  21:    */   {
/*  22: 47 */     if (!parambsu.f.a(parambsu.h, paramdt, paramej)) {
/*  23: 48 */       paramcem.a(paramdt, paramej);
/*  24:    */     }
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void a(EntityPlayer paramahd)
/*  28:    */   {
/*  29: 53 */     this.i.a(paramahd.by);
/*  30:    */   }
/*  31:    */   
/*  32:    */   public boolean a()
/*  33:    */   {
/*  34: 57 */     return this.i == EnumGameType.e;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void a(EnumGameType paramarc)
/*  38:    */   {
/*  39: 61 */     this.i = paramarc;
/*  40: 62 */     this.i.a(this.a.h.by);
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void b(EntityPlayer paramahd)
/*  44:    */   {
/*  45: 66 */     paramahd.yaw = -180.0F;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public boolean b()
/*  49:    */   {
/*  50: 70 */     return this.i.e();
/*  51:    */   }
/*  52:    */   
/*  53:    */   public boolean a(BlockPosition paramdt, EnumDirection paramej)
/*  54:    */   {
/*  55: 74 */     if (this.i.c())
/*  56:    */     {
/*  57: 75 */       if (this.i == EnumGameType.e) {
/*  58: 76 */         return false;
/*  59:    */       }
/*  60: 78 */       if (!this.a.h.cm())
/*  61:    */       {
/*  62: 79 */         ProtoBlock localObject1 = this.a.f.getBlock(paramdt).getProto();
/*  63: 80 */         ItemStack localObject2 = this.a.h.bY();
/*  64: 81 */         if (localObject2 == null) {
/*  65: 82 */           return false;
/*  66:    */         }
/*  67: 84 */         if (!((ItemStack)localObject2).c((ProtoBlock)localObject1)) {
/*  68: 85 */           return false;
/*  69:    */         }
/*  70:    */       }
/*  71:    */     }
/*  72: 90 */     if ((this.i.d()) && 
/*  73: 91 */       (this.a.h.bz() != null) && ((this.a.h.bz().getItem() instanceof ItemSword))) {
/*  74: 92 */       return false;
/*  75:    */     }
/*  76: 96 */     Object localObject1 = this.a.f;
/*  77: 97 */     Object localObject2 = ((World)localObject1).getBlock(paramdt);
/*  78: 98 */     ProtoBlock localatr = ((Block)localObject2).getProto();
/*  79:101 */     if (localatr.getMaterial() == Material.air) {
/*  80:102 */       return false;
/*  81:    */     }
/*  82:105 */     ((World)localObject1).playLevelEvent(2001, paramdt, ProtoBlock.f((Block)localObject2));
/*  83:    */     
/*  84:107 */     boolean bool = ((World)localObject1).g(paramdt);
/*  85:108 */     if (bool) {
/*  86:109 */       localatr.d((World)localObject1, paramdt, (Block)localObject2);
/*  87:    */     }
/*  88:111 */     this.c = new BlockPosition(this.c.getX(), -1, this.c.getZ());
/*  89:113 */     if (!this.i.d())
/*  90:    */     {
/*  91:114 */       ItemStack localamj = this.a.h.bY();
/*  92:115 */       if (localamj != null)
/*  93:    */       {
/*  94:116 */         localamj.a((World)localObject1, localatr, paramdt, this.a.h);
/*  95:117 */         if (localamj.stackSize == 0) {
/*  96:118 */           this.a.h.bZ();
/*  97:    */         }
/*  98:    */       }
/*  99:    */     }
/* 100:123 */     return bool;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public boolean b(BlockPosition paramdt, EnumDirection paramej)
/* 104:    */   {
/* 105:    */     ProtoBlock localatr;
/* 106:127 */     if (this.i.c())
/* 107:    */     {
/* 108:128 */       if (this.i == EnumGameType.e) {
/* 109:129 */         return false;
/* 110:    */       }
/* 111:131 */       if (!this.a.h.cm())
/* 112:    */       {
/* 113:132 */         localatr = this.a.f.getBlock(paramdt).getProto();
/* 114:133 */         ItemStack localamj = this.a.h.bY();
/* 115:134 */         if (localamj == null) {
/* 116:135 */           return false;
/* 117:    */         }
/* 118:137 */         if (!localamj.c(localatr)) {
/* 119:138 */           return false;
/* 120:    */         }
/* 121:    */       }
/* 122:    */     }
/* 123:143 */     if (!this.a.f.af().a(paramdt)) {
/* 124:144 */       return false;
/* 125:    */     }
/* 126:147 */     if (this.i.d())
/* 127:    */     {
/* 128:148 */       this.b.a(new ml(mm.a, paramdt, paramej));
/* 129:149 */       a(this.a, this, paramdt, paramej);
/* 130:150 */       this.g = 5;
/* 131:    */     }
/* 132:151 */     else if ((!this.h) || (!a(paramdt)))
/* 133:    */     {
/* 134:152 */       if (this.h) {
/* 135:153 */         this.b.a(new ml(mm.b, this.c, paramej));
/* 136:    */       }
/* 137:155 */       this.b.a(new ml(mm.a, paramdt, paramej));
/* 138:    */       
/* 139:157 */       localatr = this.a.f.getBlock(paramdt).getProto();
/* 140:158 */       int k = localatr.getMaterial() != Material.air ? 1 : 0;
/* 141:159 */       if ((k != 0) && (this.e == 0.0F)) {
/* 142:160 */         localatr.a(this.a.f, paramdt, this.a.h);
/* 143:    */       }
/* 144:162 */       if ((k != 0) && (localatr.a(this.a.h, this.a.h.world, paramdt) >= 1.0F))
/* 145:    */       {
/* 146:163 */         a(paramdt, paramej);
/* 147:    */       }
/* 148:    */       else
/* 149:    */       {
/* 150:165 */         this.h = true;
/* 151:166 */         this.c = paramdt;
/* 152:167 */         this.d = this.a.h.bz();
/* 153:168 */         this.e = 0.0F;
/* 154:169 */         this.f = 0.0F;
/* 155:170 */         this.a.f.c(this.a.h.getID(), this.c, (int)(this.e * 10.0F) - 1);
/* 156:    */       }
/* 157:    */     }
/* 158:173 */     return true;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void c()
/* 162:    */   {
/* 163:177 */     if (this.h)
/* 164:    */     {
/* 165:178 */       this.b.a(new ml(mm.b, this.c, EnumDirection.DOWN));
/* 166:179 */       this.h = false;
/* 167:180 */       this.e = 0.0F;
/* 168:181 */       this.a.f.c(this.a.h.getID(), this.c, -1);
/* 169:    */     }
/* 170:    */   }
/* 171:    */   
/* 172:    */   public boolean c(BlockPosition paramdt, EnumDirection paramej)
/* 173:    */   {
/* 174:186 */     m();
/* 175:188 */     if (this.g > 0)
/* 176:    */     {
/* 177:189 */       this.g -= 1;
/* 178:190 */       return true;
/* 179:    */     }
/* 180:193 */     if ((this.i.d()) && (this.a.f.af().a(paramdt)))
/* 181:    */     {
/* 182:194 */       this.g = 5;
/* 183:195 */       this.b.a(new ml(mm.a, paramdt, paramej));
/* 184:196 */       a(this.a, this, paramdt, paramej);
/* 185:197 */       return true;
/* 186:    */     }
/* 187:200 */     if (a(paramdt))
/* 188:    */     {
/* 189:201 */       ProtoBlock localatr = this.a.f.getBlock(paramdt).getProto();
/* 190:203 */       if (localatr.getMaterial() == Material.air)
/* 191:    */       {
/* 192:204 */         this.h = false;
/* 193:205 */         return false;
/* 194:    */       }
/* 195:208 */       this.e += localatr.a(this.a.h, this.a.h.world, paramdt);
/* 196:210 */       if (this.f % 4.0F == 0.0F) {
/* 197:211 */         this.a.U().a(new cxy(new oa(localatr.H.c()), (localatr.H.d() + 1.0F) / 8.0F, localatr.H.e() * 0.5F, paramdt.getX() + 0.5F, paramdt.getY() + 0.5F, paramdt.getZ() + 0.5F));
/* 198:    */       }
/* 199:216 */       this.f += 1.0F;
/* 200:218 */       if (this.e >= 1.0F)
/* 201:    */       {
/* 202:219 */         this.h = false;
/* 203:220 */         this.b.a(new ml(mm.c, paramdt, paramej));
/* 204:221 */         a(paramdt, paramej);
/* 205:222 */         this.e = 0.0F;
/* 206:223 */         this.f = 0.0F;
/* 207:224 */         this.g = 5;
/* 208:    */       }
/* 209:227 */       this.a.f.c(this.a.h.getID(), this.c, (int)(this.e * 10.0F) - 1);
/* 210:    */     }
/* 211:    */     else
/* 212:    */     {
/* 213:229 */       return b(paramdt, paramej);
/* 214:    */     }
/* 215:231 */     return true;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public float d()
/* 219:    */   {
/* 220:235 */     if (this.i.d()) {
/* 221:236 */       return 5.0F;
/* 222:    */     }
/* 223:238 */     return 4.5F;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public void e()
/* 227:    */   {
/* 228:242 */     m();
/* 229:244 */     if (this.b.a().g()) {
/* 230:245 */       this.b.a().a();
/* 231:    */     } else {
/* 232:247 */       this.b.a().l();
/* 233:    */     }
/* 234:    */   }
/* 235:    */   
/* 236:    */   private boolean a(BlockPosition paramdt)
/* 237:    */   {
/* 238:254 */     ItemStack localamj = this.a.h.bz();
/* 239:255 */     int k = (this.d == null) && (localamj == null) ? 1 : 0;
/* 240:256 */     if ((this.d != null) && (localamj != null)) {
/* 241:257 */       k = (localamj.getItem() == this.d.getItem()) && (ItemStack.a(localamj, this.d)) && ((localamj.e()) || (localamj.i() == this.d.i())) ? 1 : 0;
/* 242:    */     }
/* 243:259 */     return (paramdt.equals(this.c)) && (k != 0);
/* 244:    */   }
/* 245:    */   
/* 246:    */   private void m()
/* 247:    */   {
/* 248:263 */     int k = this.a.h.bg.c;
/* 249:264 */     if (k != this.j)
/* 250:    */     {
/* 251:265 */       this.j = k;
/* 252:266 */       this.b.a(new ms(this.j));
/* 253:    */     }
/* 254:    */   }
/* 255:    */   
/* 256:    */   public boolean a(cio paramcio, cen paramcen, ItemStack paramamj, BlockPosition paramdt, EnumDirection paramej, Vec3 parambrw)
/* 257:    */   {
/* 258:271 */     m();
/* 259:    */     
/* 260:273 */     float f1 = (float)(parambrw.x - paramdt.getX());
/* 261:274 */     float f2 = (float)(parambrw.y - paramdt.getY());
/* 262:275 */     float f3 = (float)(parambrw.z - paramdt.getZ());
/* 263:276 */     int k = 0;
/* 264:278 */     if (!this.a.f.af().a(paramdt)) {
/* 265:279 */       return false;
/* 266:    */     }
/* 267:282 */     if (this.i != EnumGameType.e)
/* 268:    */     {
/* 269:283 */       Block localbec = paramcen.getBlock(paramdt);
/* 270:284 */       if (((!paramcio.aw()) || (paramcio.bz() == null)) && 
/* 271:285 */         (localbec.getProto().a(paramcen, paramdt, localbec, paramcio, paramej, f1, f2, f3))) {
/* 272:286 */         k = 1;
/* 273:    */       }
/* 274:290 */       if ((k == 0) && (paramamj != null) && ((paramamj.getItem() instanceof aju)))
/* 275:    */       {
/* 276:291 */         aju localaju = (aju)paramamj.getItem();
/* 277:292 */         if (!localaju.a(paramcen, paramdt, paramej, paramcio, paramamj)) {
/* 278:293 */           return false;
/* 279:    */         }
/* 280:    */       }
/* 281:    */     }
/* 282:298 */     this.b.a(new mx(paramdt, paramej.a(), paramcio.bg.h(), f1, f2, f3));
/* 283:299 */     if ((k != 0) || (this.i == EnumGameType.e)) {
/* 284:300 */       return true;
/* 285:    */     }
/* 286:303 */     if (paramamj == null) {
/* 287:304 */       return false;
/* 288:    */     }
/* 289:307 */     if (this.i.d())
/* 290:    */     {
/* 291:308 */       int m = paramamj.i();
/* 292:309 */       int n = paramamj.stackSize;
/* 293:310 */       boolean bool = paramamj.a(paramcio, paramcen, paramdt, paramej, f1, f2, f3);
/* 294:311 */       paramamj.b(m);
/* 295:312 */       paramamj.stackSize = n;
/* 296:313 */       return bool;
/* 297:    */     }
/* 298:315 */     return paramamj.a(paramcio, paramcen, paramdt, paramej, f1, f2, f3);
/* 299:    */   }
/* 300:    */   
/* 301:    */   public boolean a(EntityPlayer paramahd, World paramaqu, ItemStack paramamj)
/* 302:    */   {
/* 303:320 */     if (this.i == EnumGameType.e) {
/* 304:321 */       return false;
/* 305:    */     }
/* 306:323 */     m();
/* 307:324 */     this.b.a(new mx(paramahd.bg.h()));
/* 308:325 */     int k = paramamj.stackSize;
/* 309:326 */     ItemStack localamj = paramamj.a(paramaqu, paramahd);
/* 310:328 */     if ((localamj != paramamj) || ((localamj != null) && (localamj.stackSize != k)))
/* 311:    */     {
/* 312:329 */       paramahd.bg.a[paramahd.bg.c] = localamj;
/* 313:331 */       if (localamj.stackSize == 0) {
/* 314:332 */         paramahd.bg.a[paramahd.bg.c] = null;
/* 315:    */       }
/* 316:334 */       return true;
/* 317:    */     }
/* 318:337 */     return false;
/* 319:    */   }
/* 320:    */   
/* 321:    */   public cio a(World paramaqu, tz paramtz)
/* 322:    */   {
/* 323:341 */     return new cio(this.a, paramaqu, this.b, paramtz);
/* 324:    */   }
/* 325:    */   
/* 326:    */   public void a(EntityPlayer paramahd, Entity paramwv)
/* 327:    */   {
/* 328:345 */     m();
/* 329:346 */     this.b.a(new md(paramwv, me.b));
/* 330:347 */     if (this.i != EnumGameType.e) {
/* 331:348 */       paramahd.f(paramwv);
/* 332:    */     }
/* 333:    */   }
/* 334:    */   
/* 335:    */   public boolean b(EntityPlayer paramahd, Entity paramwv)
/* 336:    */   {
/* 337:353 */     m();
/* 338:354 */     this.b.a(new md(paramwv, me.a));
/* 339:355 */     return (this.i != EnumGameType.e) && (paramahd.u(paramwv));
/* 340:    */   }
/* 341:    */   
/* 342:    */   public boolean a(EntityPlayer paramahd, Entity paramwv, HitResult parambru)
/* 343:    */   {
/* 344:359 */     m();
/* 345:360 */     Vec3 localbrw = new Vec3(parambru.c.x - paramwv.xPos, parambru.c.y - paramwv.yPos, parambru.c.z - paramwv.zPos);
/* 346:361 */     this.b.a(new md(paramwv, localbrw));
/* 347:362 */     return (this.i != EnumGameType.e) && (paramwv.a(paramahd, localbrw));
/* 348:    */   }
/* 349:    */   
/* 350:    */   public ItemStack a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, EntityPlayer paramahd)
/* 351:    */   {
/* 352:366 */     short s = paramahd.bi.a(paramahd.bg);
/* 353:    */     
/* 354:368 */     ItemStack localamj = paramahd.bi.a(paramInt2, paramInt3, paramInt4, paramahd);
/* 355:369 */     this.b.a(new ma(paramInt1, paramInt2, paramInt3, paramInt4, localamj, s));
/* 356:    */     
/* 357:371 */     return localamj;
/* 358:    */   }
/* 359:    */   
/* 360:    */   public void a(int paramInt1, int paramInt2)
/* 361:    */   {
/* 362:375 */     this.b.a(new lz(paramInt1, paramInt2));
/* 363:    */   }
/* 364:    */   
/* 365:    */   public void a(ItemStack paramamj, int paramInt)
/* 366:    */   {
/* 367:379 */     if (this.i.d()) {
/* 368:380 */       this.b.a(new mt(paramInt, paramamj));
/* 369:    */     }
/* 370:    */   }
/* 371:    */   
/* 372:    */   public void a(ItemStack paramamj)
/* 373:    */   {
/* 374:385 */     if ((this.i.d()) && (paramamj != null)) {
/* 375:386 */       this.b.a(new mt(-1, paramamj));
/* 376:    */     }
/* 377:    */   }
/* 378:    */   
/* 379:    */   public void c(EntityPlayer paramahd)
/* 380:    */   {
/* 381:391 */     m();
/* 382:392 */     this.b.a(new ml(mm.f, BlockPosition.a, EnumDirection.DOWN));
/* 383:393 */     paramahd.bT();
/* 384:    */   }
/* 385:    */   
/* 386:    */   public boolean f()
/* 387:    */   {
/* 388:397 */     return this.i.e();
/* 389:    */   }
/* 390:    */   
/* 391:    */   public boolean g()
/* 392:    */   {
/* 393:401 */     return !this.i.d();
/* 394:    */   }
/* 395:    */   
/* 396:    */   public boolean h()
/* 397:    */   {
/* 398:405 */     return this.i.d();
/* 399:    */   }
/* 400:    */   
/* 401:    */   public boolean i()
/* 402:    */   {
/* 403:409 */     return this.i.d();
/* 404:    */   }
/* 405:    */   
/* 406:    */   public boolean j()
/* 407:    */   {
/* 408:419 */     return (this.a.h.av()) && ((this.a.h.vehicle instanceof EntityHorse));
/* 409:    */   }
/* 410:    */   
/* 411:    */   public boolean k()
/* 412:    */   {
/* 413:423 */     return this.i == EnumGameType.e;
/* 414:    */   }
/* 415:    */   
/* 416:    */   public EnumGameType l()
/* 417:    */   {
/* 418:427 */     return this.i;
/* 419:    */   }
/* 420:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cem
 * JD-Core Version:    0.7.0.1
 */
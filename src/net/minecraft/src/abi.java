package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   6:    */ import java.util.TreeMap;
/*   7:    */ 
/*   8:    */ public class abi
/*   9:    */ {
/*  10:    */   private World a;
/*  11: 31 */   private final List<abh> b = Lists.newArrayList();
/*  12: 33 */   private BlockPosition c = BlockPosition.zero;
/*  13: 34 */   private BlockPosition d = BlockPosition.zero;
/*  14:    */   private int e;
/*  15:    */   private int f;
/*  16:    */   private int g;
/*  17:    */   private int h;
/*  18:    */   private int i;
/*  19: 41 */   private TreeMap<String,Integer> j = new TreeMap<String,Integer>();
/*  20: 53 */   private List<abj> k = Lists.newArrayList();
/*  21:    */   private int l;
/*  22:    */   
/*  23:    */   public abi() {}
/*  24:    */   
/*  25:    */   public abi(World paramaqu)
/*  26:    */   {
/*  27: 60 */     this.a = paramaqu;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void a(World paramaqu)
/*  31:    */   {
/*  32: 64 */     this.a = paramaqu;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void a(int paramInt)
/*  36:    */   {
/*  37: 68 */     this.g = paramInt;
/*  38: 69 */     m();
/*  39: 70 */     l();
/*  40: 72 */     if (paramInt % 20 == 0) {
/*  41: 73 */       k();
/*  42:    */     }
/*  43: 76 */     if (paramInt % 30 == 0) {
/*  44: 77 */       j();
/*  45:    */     }
/*  46: 80 */     int m = this.h / 10;
/*  47: 81 */     if ((this.l < m) && (this.b.size() > 20) && (this.a.rng.nextInt(7000) == 0))
/*  48:    */     {
/*  49: 82 */       Vec3 localbrw = a(this.d, 2, 4, 2);
/*  50: 83 */       if (localbrw != null)
/*  51:    */       {
/*  52: 84 */         EntityIronGolem golem = new EntityIronGolem(this.a);
/*  53: 85 */         golem.b(localbrw.x, localbrw.y, localbrw.z);
/*  54: 86 */         this.a.spawnEntity(golem);
/*  55: 87 */         this.l += 1;
/*  56:    */       }
/*  57:    */     }
/*  58:    */   }
/*  59:    */   
/*  60:    */   private Vec3 a(BlockPosition paramdt, int paramInt1, int paramInt2, int paramInt3)
/*  61:    */   {
/*  62:113 */     for (int m = 0; m < 10; m++)
/*  63:    */     {
/*  64:114 */       BlockPosition localdt = paramdt.offset(this.a.rng.nextInt(16) - 8, this.a.rng.nextInt(6) - 3, this.a.rng.nextInt(16) - 8);
/*  65:115 */       if (a(localdt)) {
/*  66:118 */         if (a(new BlockPosition(paramInt1, paramInt2, paramInt3), localdt)) {
/*  67:119 */           return new Vec3(localdt.getX(), localdt.getY(), localdt.getZ());
/*  68:    */         }
/*  69:    */       }
/*  70:    */     }
/*  71:122 */     return null;
/*  72:    */   }
/*  73:    */   
/*  74:    */   private boolean a(BlockPosition paramdt1, BlockPosition paramdt2)
/*  75:    */   {
/*  76:126 */     if (!World.isFlatSurface(this.a, paramdt2.down())) {
/*  77:127 */       return false;
/*  78:    */     }
/*  79:130 */     int m = paramdt2.getX() - paramdt1.getX() / 2;
/*  80:131 */     int n = paramdt2.getZ() - paramdt1.getZ() / 2;
/*  81:132 */     for (int i1 = m; i1 < m + paramdt1.getX(); i1++) {
/*  82:133 */       for (int i2 = paramdt2.getY(); i2 < paramdt2.getY() + paramdt1.getY(); i2++) {
/*  83:134 */         for (int i3 = n; i3 < n + paramdt1.getZ(); i3++) {
/*  84:135 */           if (this.a.getBlock(new BlockPosition(i1, i2, i3)).getProto().blocksMovement()) {
/*  85:136 */             return false;
/*  86:    */           }
/*  87:    */         }
/*  88:    */       }
/*  89:    */     }
/*  90:142 */     return true;
/*  91:    */   }
/*  92:    */   
/*  93:    */   private void j()
/*  94:    */   {
/*  95:147 */     List<EntityIronGolem> localList = this.a.a(EntityIronGolem.class, new AABB(this.d.getX() - this.e, this.d.getY() - 4, this.d.getZ() - this.e, this.d.getX() + this.e, this.d.getY() + 4, this.d.getZ() + this.e));
/*  96:148 */     this.l = localList.size();
/*  97:    */   }
/*  98:    */   
/*  99:    */   private void k()
/* 100:    */   {
/* 101:152 */     List<EntityVillager> localList = this.a.a(EntityVillager.class, new AABB(this.d.getX() - this.e, this.d.getY() - 4, this.d.getZ() - this.e, this.d.getX() + this.e, this.d.getY() + 4, this.d.getZ() + this.e));
/* 102:153 */     this.h = localList.size();
/* 103:155 */     if (this.h == 0) {
/* 104:157 */       this.j.clear();
/* 105:    */     }
/* 106:    */   }
/* 107:    */   
/* 108:    */   public BlockPosition a()
/* 109:    */   {
/* 110:162 */     return this.d;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public int b()
/* 114:    */   {
/* 115:166 */     return this.e;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public int c()
/* 119:    */   {
/* 120:170 */     return this.b.size();
/* 121:    */   }
/* 122:    */   
/* 123:    */   public int d()
/* 124:    */   {
/* 125:174 */     return this.g - this.f;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public int e()
/* 129:    */   {
/* 130:178 */     return this.h;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public boolean a(BlockPosition paramdt)
/* 134:    */   {
/* 135:182 */     return this.d.i(paramdt) < this.e * this.e;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public List<abh> f()
/* 139:    */   {
/* 140:186 */     return this.b;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public abh b(BlockPosition paramdt)
/* 144:    */   {
/* 145:190 */     abh localObject = null;
/* 146:191 */     int m = 2147483647;
/* 147:192 */     for (abh localabh : this.b)
/* 148:    */     {
/* 149:193 */       int n = localabh.a(paramdt);
/* 150:194 */       if (n < m)
/* 151:    */       {
/* 152:195 */         localObject = localabh;
/* 153:196 */         m = n;
/* 154:    */       }
/* 155:    */     }
/* 156:199 */     return localObject;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public abh c(BlockPosition paramdt)
/* 160:    */   {
/* 161:203 */     abh localObject = null;
/* 162:204 */     int m = 2147483647;
/* 163:205 */     for (abh localabh : this.b)
/* 164:    */     {
/* 165:206 */       int n = localabh.a(paramdt);
/* 166:207 */       if (n > 256) {
/* 167:208 */         n *= 1000;
/* 168:    */       } else {
/* 169:210 */         n = localabh.c();
/* 170:    */       }
/* 171:213 */       if (n < m)
/* 172:    */       {
/* 173:214 */         localObject = localabh;
/* 174:215 */         m = n;
/* 175:    */       }
/* 176:    */     }
/* 177:218 */     return localObject;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public abh e(BlockPosition paramdt)
/* 181:    */   {
/* 182:226 */     if (this.d.i(paramdt) > this.e * this.e) {
/* 183:227 */       return null;
/* 184:    */     }
/* 185:229 */     for (abh localabh : this.b) {
/* 186:230 */       if ((localabh.d().getX() == paramdt.getX()) && (localabh.d().getZ() == paramdt.getZ()) && (Math.abs(localabh.d().getY() - paramdt.getY()) <= 1)) {
/* 187:231 */         return localabh;
/* 188:    */       }
/* 189:    */     }
/* 190:234 */     return null;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void a(abh paramabh)
/* 194:    */   {
/* 195:238 */     this.b.add(paramabh);
/* 196:239 */     this.c = this.c.offset(paramabh.d());
/* 197:240 */     n();
/* 198:241 */     this.f = paramabh.h();
/* 199:    */   }
/* 200:    */   
/* 201:    */   public boolean g()
/* 202:    */   {
/* 203:245 */     return this.b.isEmpty();
/* 204:    */   }
/* 205:    */   
/* 206:    */   public void a(EntityLiving paramxm)
/* 207:    */   {
/* 208:249 */     for (abj localabj : this.k) {
/* 209:250 */       if (localabj.a == paramxm)
/* 210:    */       {
/* 211:251 */         localabj.b = this.g;
/* 212:252 */         return;
/* 213:    */       }
/* 214:    */     }
/* 215:255 */     this.k.add(new abj(this, paramxm, this.g));
/* 216:    */   }
/* 217:    */   
/* 218:    */   public EntityLiving b(EntityLiving paramxm)
/* 219:    */   {
/* 220:259 */     double d1 = 1.7976931348623157E+308D;
/* 221:260 */     abj localObject = null;
/* 222:261 */     for (int m = 0; m < this.k.size(); m++)
/* 223:    */     {
/* 224:262 */       abj localabj = (abj)this.k.get(m);
/* 225:263 */       double d2 = localabj.a.h(paramxm);
/* 226:264 */       if (d2 <= d1)
/* 227:    */       {
/* 228:267 */         localObject = localabj;
/* 229:268 */         d1 = d2;
/* 230:    */       }
/* 231:    */     }
/* 232:270 */     return localObject != null ? localObject.a : null;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public EntityPlayer c(EntityLiving paramxm)
/* 236:    */   {
/* 237:274 */     double d1 = 1.7976931348623157E+308D;
/* 238:275 */     EntityPlayer localObject = null;
/* 239:277 */     for (String str : this.j.keySet()) {
/* 240:278 */       if (d(str))
/* 241:    */       {
/* 242:279 */         EntityPlayer localahd = this.a.a(str);
/* 243:280 */         if (localahd != null)
/* 244:    */         {
/* 245:281 */           double d2 = localahd.h(paramxm);
/* 246:282 */           if (d2 <= d1)
/* 247:    */           {
/* 248:285 */             localObject = localahd;
/* 249:286 */             d1 = d2;
/* 250:    */           }
/* 251:    */         }
/* 252:    */       }
/* 253:    */     }
/* 254:291 */     return localObject;
/* 255:    */   }
/* 256:    */   
/* 257:    */   private void l()
/* 258:    */   {
/* 259:295 */     for (Iterator<abj> localIterator = this.k.iterator(); localIterator.hasNext();)
/* 260:    */     {
/* 261:296 */       abj localabj = (abj)localIterator.next();
/* 262:297 */       if ((!localabj.a.ai()) || (Math.abs(this.g - localabj.b) > 300)) {
/* 263:298 */         localIterator.remove();
/* 264:    */       }
/* 265:    */     }
/* 266:    */   }
/* 267:    */   
/* 268:    */   private void m()
/* 269:    */   {
/* 270:304 */     int m = 0;
/* 271:305 */     int n = this.a.rng.nextInt(50) == 0 ? 1 : 0;
/* 272:307 */     for (Iterator<abh> localIterator = this.b.iterator(); localIterator.hasNext();)
/* 273:    */     {
/* 274:308 */       abh localabh = (abh)localIterator.next();
/* 275:309 */       if (n != 0) {
/* 276:310 */         localabh.a();
/* 277:    */       }
/* 278:312 */       if ((!f(localabh.d())) || (Math.abs(this.g - localabh.h()) > 1200))
/* 279:    */       {
/* 280:313 */         this.c = this.c.offset(localabh.d().a(-1));
/* 281:314 */         m = 1;
/* 282:315 */         localabh.a(true);
/* 283:316 */         localIterator.remove();
/* 284:    */       }
/* 285:    */     }
/* 286:320 */     if (m != 0) {
/* 287:321 */       n();
/* 288:    */     }
/* 289:    */   }
/* 290:    */   
/* 291:    */   private boolean f(BlockPosition paramdt)
/* 292:    */   {
/* 293:326 */     ProtoBlock localatr = this.a.getBlock(paramdt).getProto();
/* 294:327 */     if ((localatr instanceof avf)) {
/* 295:328 */       return localatr.getMaterial() == Material.d;
/* 296:    */     }
/* 297:330 */     return false;
/* 298:    */   }
/* 299:    */   
/* 300:    */   private void n()
/* 301:    */   {
/* 302:334 */     int m = this.b.size();
/* 303:335 */     if (m == 0)
/* 304:    */     {
/* 305:336 */       this.d = new BlockPosition(0, 0, 0);
/* 306:337 */       this.e = 0;
/* 307:338 */       return;
/* 308:    */     }
/* 309:340 */     this.d = new BlockPosition(this.c.getX() / m, this.c.getY() / m, this.c.getZ() / m);
/* 310:341 */     int n = 0;
/* 311:342 */     for (abh localabh : this.b) {
/* 312:343 */       n = Math.max(localabh.a(this.d), n);
/* 313:    */     }
/* 314:345 */     this.e = Math.max(32, (int)Math.sqrt(n) + 1);
/* 315:    */   }
/* 316:    */   
/* 317:    */   public int a(String paramString)
/* 318:    */   {
/* 319:349 */     Integer localInteger = (Integer)this.j.get(paramString);
/* 320:350 */     if (localInteger != null) {
/* 321:351 */       return localInteger.intValue();
/* 322:    */     }
/* 323:353 */     return 0;
/* 324:    */   }
/* 325:    */   
/* 326:    */   public int a(String paramString, int paramInt)
/* 327:    */   {
/* 328:357 */     int m = a(paramString);
/* 329:358 */     int n = MathUtils.clamp(m + paramInt, -30, 10);
/* 330:359 */     this.j.put(paramString, Integer.valueOf(n));
/* 331:360 */     return n;
/* 332:    */   }
/* 333:    */   
/* 334:    */   public boolean d(String paramString)
/* 335:    */   {
/* 336:372 */     return a(paramString) <= -15;
/* 337:    */   }
/* 338:    */   
/* 339:    */   public void a(NBTTagCompound paramfn)
/* 340:    */   {
/* 341:376 */     this.h = paramfn.getInteger("PopSize");
/* 342:377 */     this.e = paramfn.getInteger("Radius");
/* 343:378 */     this.l = paramfn.getInteger("Golems");
/* 344:379 */     this.f = paramfn.getInteger("Stable");
/* 345:380 */     this.g = paramfn.getInteger("Tick");
/* 346:381 */     this.i = paramfn.getInteger("MTick");
/* 347:382 */     this.d = new BlockPosition(paramfn.getInteger("CX"), paramfn.getInteger("CY"), paramfn.getInteger("CZ"));
/* 348:383 */     this.c = new BlockPosition(paramfn.getInteger("ACX"), paramfn.getInteger("ACY"), paramfn.getInteger("ACZ"));
/* 349:    */     
/* 350:385 */     fv localfv1 = paramfn.c("Doors", 10);
/* 351:    */     
/* 352:386 */     for (int m = 0; m < localfv1.c(); m++)
/* 353:    */     {
/* 354:387 */       NBTTagCompound localfn = localfv1.b(m);
/* 355:    */       
/* 356:389 */       abh localObject = new abh(new BlockPosition(localfn.getInteger("X"), localfn.getInteger("Y"), localfn.getInteger("Z")), localfn.getInteger("IDX"), localfn.getInteger("IDZ"), localfn.getInteger("TS"));
/* 357:390 */       this.b.add(localObject);
/* 358:    */     }
/* 359:393 */     fv localfv2 = paramfn.c("Players", 10);
/* 360:394 */     for (int n = 0; n < localfv2.c(); n++)
/* 361:    */     {
/* 362:395 */       NBTTagCompound localObject = localfv2.b(n);
/* 363:396 */       this.j.put(((NBTTagCompound)localObject).getString("Name"), Integer.valueOf(((NBTTagCompound)localObject).getInteger("S")));
/* 364:    */     }
/* 365:    */   }
/* 366:    */   
/* 367:    */   public void b(NBTTagCompound paramfn)
/* 368:    */   {
/* 369:401 */     paramfn.setInt("PopSize", this.h);
/* 370:402 */     paramfn.setInt("Radius", this.e);
/* 371:403 */     paramfn.setInt("Golems", this.l);
/* 372:404 */     paramfn.setInt("Stable", this.f);
/* 373:405 */     paramfn.setInt("Tick", this.g);
/* 374:406 */     paramfn.setInt("MTick", this.i);
/* 375:407 */     paramfn.setInt("CX", this.d.getX());
/* 376:408 */     paramfn.setInt("CY", this.d.getY());
/* 377:409 */     paramfn.setInt("CZ", this.d.getZ());
/* 378:410 */     paramfn.setInt("ACX", this.c.getX());
/* 379:411 */     paramfn.setInt("ACY", this.c.getY());
/* 380:412 */     paramfn.setInt("ACZ", this.c.getZ());
/* 381:    */     
/* 382:414 */     fv localfv = new fv();
/* 383:415 */     for (Iterator<abh> localObject1 = this.b.iterator(); localObject1.hasNext();)
/* 384:    */     {
/* 385:415 */       abh localObject2 = localObject1.next();
/* 386:416 */       NBTTagCompound localObject3 = new NBTTagCompound();
/* 387:417 */       (localObject3).setInt("X", ((abh)localObject2).d().getX());
/* 388:418 */       (localObject3).setInt("Y", ((abh)localObject2).d().getY());
/* 389:419 */       (localObject3).setInt("Z", ((abh)localObject2).d().getZ());
/* 390:420 */       (localObject3).setInt("IDX", ((abh)localObject2).f());
/* 391:421 */       (localObject3).setInt("IDZ", ((abh)localObject2).g());
/* 392:422 */       (localObject3).setInt("TS", ((abh)localObject2).h());
/* 393:423 */       localfv.a((NBTBase)localObject3);
/* 394:    */     }
/* 395:    */     Object localObject3;
/* 396:425 */     paramfn.setNBT("Doors", localfv);
/* 397:    */     
/* 398:427 */     fv localObject1 = new fv();
/* 399:428 */     for (Iterator<String> localObject2 = this.j.keySet().iterator(); localObject2.hasNext();)
/* 400:    */     {
/* 401:428 */       localObject3 = localObject2.next();
/* 402:429 */       NBTTagCompound localfn = new NBTTagCompound();
/* 403:430 */       localfn.setString("Name", (String)localObject3);
/* 404:431 */       localfn.setInt("S", ((Integer)this.j.get(localObject3)).intValue());
/* 405:432 */       ((fv)localObject1).a(localfn);
/* 406:    */     }
/* 407:434 */     paramfn.setNBT("Players", (NBTBase)localObject1);
/* 408:    */   }
/* 409:    */   
/* 410:    */   public void h()
/* 411:    */   {
/* 412:438 */     this.i = this.g;
/* 413:    */   }
/* 414:    */   
/* 415:    */   public boolean i()
/* 416:    */   {
/* 417:443 */     return (this.i == 0) || (this.g - this.i >= 3600);
/* 418:    */   }
/* 419:    */   
/* 420:    */   public void b(int paramInt)
/* 421:    */   {
/* 422:447 */     for (String str : this.j.keySet()) {
/* 423:448 */       a(str, paramInt);
/* 424:    */     }
/* 425:    */   }
/* 426:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abi
 * JD-Core Version:    0.7.0.1
 */
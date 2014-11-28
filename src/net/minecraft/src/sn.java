package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import com.google.common.collect.Sets;
/*   4:    */ import com.mojang.authlib.GameProfile;

/*   5:    */ import io.netty.buffer.Unpooled;

/*   6:    */ import java.io.File;
/*   7:    */ import java.net.SocketAddress;
/*   8:    */ import java.text.SimpleDateFormat;
/*   9:    */ import java.util.ArrayList;
/*  10:    */ import java.util.Collection;
/*  11:    */ import java.util.HashSet;
/*  12:    */ import java.util.Iterator;
/*  13:    */ import java.util.List;
/*  14:    */ import java.util.Map;
/*  15:    */ import java.util.Set;
/*  16:    */ import java.util.UUID;

/*  17:    */ import net.minecraft.server.MinecraftServer;

/*  18:    */ import org.apache.logging.log4j.LogManager;
/*  19:    */ import org.apache.logging.log4j.Logger;
/*  20:    */ 
/*  21:    */ public abstract class sn
/*  22:    */ {
/*  23: 50 */   public static final File a = new File("banned-players.json");
/*  24: 51 */   public static final File b = new File("banned-ips.json");
/*  25: 52 */   public static final File c = new File("ops.json");
/*  26: 53 */   public static final File d = new File("whitelist.json");
/*  27: 54 */   private static final Logger h = LogManager.getLogger();
/*  28: 56 */   private static final SimpleDateFormat i = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
/*  29:    */   private final MinecraftServer j;
/*  30: 59 */   public final List<qw> e = Lists.newArrayList();
/*  31: 60 */   public final Map f = Maps.newHashMap();
/*  32: 61 */   private final sv k = new sv(a);
/*  33: 62 */   private final sd l = new sd(b);
/*  34: 63 */   private final sp m = new sp(c);
/*  35: 64 */   private final sx n = new sx(d);
/*  36: 65 */   private final Map o = Maps.newHashMap();
/*  37:    */   private brl p;
/*  38:    */   private boolean q;
/*  39:    */   protected int g;
/*  40:    */   private int r;
/*  41:    */   private EnumGameMode s;
/*  42:    */   private boolean t;
/*  43:    */   private int u;
/*  44:    */   
/*  45:    */   public sn(MinecraftServer paramMinecraftServer)
/*  46:    */   {
/*  47: 75 */     this.j = paramMinecraftServer;
/*  48:    */     
/*  49: 77 */     this.k.a(false);
/*  50: 78 */     this.l.a(false);
/*  51:    */     
/*  52: 80 */     this.g = 8;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void a(gr paramgr, qw paramqw)
/*  56:    */   {
/*  57: 84 */     GameProfile localGameProfile1 = paramqw.cc();
/*  58:    */     
/*  59: 86 */     ry localry = this.j.aD();
/*  60: 87 */     GameProfile localGameProfile2 = localry.a(localGameProfile1.getId());
/*  61: 88 */     String str1 = localGameProfile2 == null ? localGameProfile1.getName() : localGameProfile2.getName();
/*  62: 89 */     localry.a(localGameProfile1);
/*  63:    */     
/*  64: 91 */     NBTTagCompound localfn = a(paramqw);
/*  65: 92 */     paramqw.a(this.j.a(paramqw.dimension));
/*  66: 93 */     paramqw.c.a((WorldServer)paramqw.world);
/*  67:    */     
/*  68: 95 */     String str2 = "local";
/*  69: 97 */     if (paramgr.b() != null) {
/*  70: 98 */       str2 = paramgr.b().toString();
/*  71:    */     }
/*  72:101 */     h.info(paramqw.getName() + "[" + str2 + "] logged in with entity id " + paramqw.getID() + " at (" + paramqw.xPos + ", " + paramqw.yPos + ", " + paramqw.zPos + ")");
/*  73:    */     
/*  74:103 */     WorldServer localqt = this.j.a(paramqw.dimension);
/*  75:104 */     WorldInfo localbqo = localqt.getWorldInfo();
/*  76:    */     
/*  77:106 */     BlockPosition localdt = localqt.getWorldSpawn();
/*  78:    */     
/*  79:108 */     a(paramqw, null, localqt);
/*  80:    */     
/*  81:110 */     rj localrj = new rj(this.j, paramgr, paramqw);
/*  82:111 */     localrj.a(new jw(paramqw.getID(), paramqw.c.b(), localbqo.isHardcore(), localqt.t.q(), localqt.getDifficulty(), q(), localbqo.u(), localqt.getGameRules().getBoolean("reducedDebugInfo")));
/*  83:112 */     localrj.a(new ji("MC|Brand", new ByteBufWrapper(Unpooled.buffer()).a(c().getServerModName())));
/*  84:113 */     localrj.a(new ix(localbqo.y(), localbqo.z()));
/*  85:114 */     localrj.a(new lh(localdt));
/*  86:115 */     localrj.a(new kd(paramqw.abilities));
/*  87:116 */     localrj.a(new kv(paramqw.bg.c));
/*  88:    */     
/*  89:118 */     paramqw.A().d();
/*  90:119 */     paramqw.A().b(paramqw);
/*  91:    */     
/*  92:121 */     a((pk)localqt.Z(), paramqw);
/*  93:    */     
/*  94:123 */     this.j.aF();
/*  95:    */     hz localhz;
/*  96:125 */     if (!paramqw.getName().equalsIgnoreCase(str1)) {
/*  97:126 */       localhz = new hz("multiplayer.player.joined.renamed", new Object[] { paramqw.e_(), str1 });
/*  98:    */     } else {
/*  99:128 */       localhz = new hz("multiplayer.player.joined", new Object[] { paramqw.e_() });
/* 100:    */     }
/* 101:130 */     localhz.b().a(net.minecraft.src.a.o);
/* 102:131 */     a(localhz);
/* 103:132 */     c(paramqw);
/* 104:    */     
/* 105:134 */     localrj.a(paramqw.xPos, paramqw.yPos, paramqw.zPos, paramqw.yaw, paramqw.pitch);
/* 106:135 */     b(paramqw, localqt);
/* 107:137 */     if (this.j.aa().length() > 0) {
/* 108:138 */       paramqw.a(this.j.aa(), this.j.ab());
/* 109:    */     }
/* 110:141 */     for (Object localObject = paramqw.bk().iterator(); ((Iterator)localObject).hasNext();)
/* 111:    */     {
/* 112:141 */       PotionEffect localwq = (PotionEffect)((Iterator)localObject).next();
/* 113:142 */       localrj.a(new lr(paramqw.getID(), localwq));
/* 114:    */     }
/* 115:145 */     paramqw.f_();
/* 116:147 */     if ((localfn != null) && (localfn.hasKey("Riding", 10)))
/* 117:    */     {
/* 118:149 */       Entity localObject = EntityList.a(localfn.getCompoundTag("Riding"), localqt);
/* 119:150 */       if (localObject != null)
/* 120:    */       {
/* 121:151 */         ((Entity)localObject).n = true;
/* 122:152 */         localqt.spawnEntity((Entity)localObject);
/* 123:153 */         paramqw.mount((Entity)localObject);
/* 124:154 */         ((Entity)localObject).n = false;
/* 125:    */       }
/* 126:    */     }
/* 127:    */   }
/* 128:    */   
/* 129:    */   protected void a(pk parampk, qw paramqw)
/* 130:    */   {
/* 131:160 */     HashSet localHashSet = Sets.newHashSet();
/* 132:162 */     for (Iterator localIterator1 = parampk.g().iterator(); localIterator1.hasNext();)
/* 133:    */     {
/* 134:162 */       brz localObject = (brz)localIterator1.next();
/* 135:163 */       paramqw.a.a(new le((brz)localObject, 0));
/* 136:    */     }
/* 137:    */     Object localObject;
/* 138:166 */     for (int i1 = 0; i1 < 19; i1++)
/* 139:    */     {
/* 140:167 */       localObject = parampk.a(i1);
/* 141:169 */       if ((localObject != null) && (!localHashSet.contains(localObject)))
/* 142:    */       {
/* 143:170 */         List<id> localList = parampk.d((bry)localObject);
/* 144:172 */         for (id localid : localList) {
/* 145:173 */           paramqw.a.a(localid);
/* 146:    */         }
/* 147:176 */         localHashSet.add(localObject);
/* 148:    */       }
/* 149:    */     }
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void a(WorldServer[] paramArrayOfqt)
/* 153:    */   {
/* 154:182 */     this.p = paramArrayOfqt[0].O().e();
/* 155:183 */     paramArrayOfqt[0].af().a(new so(this));
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void a(qw paramqw, WorldServer paramqt)
/* 159:    */   {
/* 160:220 */     WorldServer localqt = paramqw.u();
/* 161:222 */     if (paramqt != null) {
/* 162:223 */       paramqt.t().c(paramqw);
/* 163:    */     }
/* 164:225 */     localqt.t().a(paramqw);
/* 165:    */     
/* 166:227 */     localqt.b.c((int)paramqw.xPos >> 4, (int)paramqw.zPos >> 4);
/* 167:    */   }
/* 168:    */   
/* 169:    */   public int d()
/* 170:    */   {
/* 171:231 */     return qq.b(t());
/* 172:    */   }
/* 173:    */   
/* 174:    */   public NBTTagCompound a(qw paramqw)
/* 175:    */   {
/* 176:235 */     NBTTagCompound localfn1 = this.j.c[0].getWorldInfo().i();
/* 177:    */     NBTTagCompound localfn2;
/* 178:238 */     if ((paramqw.getName().equals(this.j.R())) && (localfn1 != null))
/* 179:    */     {
/* 180:239 */       paramqw.f(localfn1);
/* 181:240 */       localfn2 = localfn1;
/* 182:241 */       h.debug("loading single player");
/* 183:    */     }
/* 184:    */     else
/* 185:    */     {
/* 186:243 */       localfn2 = this.p.b(paramqw);
/* 187:    */     }
/* 188:245 */     return localfn2;
/* 189:    */   }
/* 190:    */   
/* 191:    */   protected void b(qw paramqw)
/* 192:    */   {
/* 193:249 */     this.p.a(paramqw);
/* 194:250 */     tp localtp = (tp)this.o.get(paramqw.getUUID());
/* 195:251 */     if (localtp != null) {
/* 196:252 */       localtp.b();
/* 197:    */     }
/* 198:    */   }
/* 199:    */   
/* 200:    */   public void c(qw paramqw)
/* 201:    */   {
/* 202:262 */     this.e.add(paramqw);
/* 203:263 */     this.f.put(paramqw.getUUID(), paramqw);
/* 204:    */     
/* 205:265 */     a(new kh(kj.a, new qw[] { paramqw }));
/* 206:    */     
/* 207:    */ 
/* 208:268 */     WorldServer localqt = this.j.a(paramqw.dimension);
/* 209:    */     
/* 210:    */ 
/* 211:    */ 
/* 212:    */ 
/* 213:    */ 
/* 214:    */ 
/* 215:    */ 
/* 216:276 */     localqt.spawnEntity(paramqw);
/* 217:277 */     a(paramqw, (WorldServer)null);
/* 218:279 */     for (int i1 = 0; i1 < this.e.size(); i1++)
/* 219:    */     {
/* 220:280 */       qw localqw = (qw)this.e.get(i1);
/* 221:281 */       paramqw.a.a(new kh(kj.a, new qw[] { localqw }));
/* 222:    */     }
/* 223:    */   }
/* 224:    */   
/* 225:    */   public void d(qw paramqw)
/* 226:    */   {
/* 227:286 */     paramqw.u().t().d(paramqw);
/* 228:    */   }
/* 229:    */   
/* 230:    */   public void e(qw paramqw)
/* 231:    */   {
/* 232:290 */     paramqw.increaseStat(StatList.f);
/* 233:291 */     b(paramqw);
/* 234:292 */     WorldServer localqt = paramqw.u();
/* 235:293 */     if (paramqw.vehicle != null)
/* 236:    */     {
/* 237:297 */       localqt.removeEntity(paramqw.vehicle);
/* 238:298 */       h.debug("removing player mount");
/* 239:    */     }
/* 240:300 */     localqt.setEntityDead(paramqw);
/* 241:301 */     localqt.t().c(paramqw);
/* 242:302 */     this.e.remove(paramqw);
/* 243:303 */     this.f.remove(paramqw.getUUID());
/* 244:304 */     this.o.remove(paramqw.getUUID());
/* 245:305 */     a(new kh(kj.e, new qw[] { paramqw }));
/* 246:    */   }
/* 247:    */   
/* 248:    */   public String a(SocketAddress paramSocketAddress, GameProfile paramGameProfile)
/* 249:    */   {
/* 250:    */     Object localObject;
/* 251:    */     String str;
/* 252:309 */     if (this.k.a(paramGameProfile))
/* 253:    */     {
/* 254:310 */       localObject = (sw)this.k.b((Object)paramGameProfile);
/* 255:311 */       str = "You are banned from this server!\nReason: " + ((sw)localObject).d();
/* 256:313 */       if (((sw)localObject).c() != null) {
/* 257:314 */         str = str + "\nYour ban will be removed on " + i.format(((sw)localObject).c());
/* 258:    */       }
/* 259:317 */       return str;
/* 260:    */     }
/* 261:320 */     if (!e(paramGameProfile)) {
/* 262:321 */       return "You are not white-listed on this server!";
/* 263:    */     }
/* 264:324 */     if (this.l.a(paramSocketAddress))
/* 265:    */     {
/* 266:325 */       localObject = this.l.b(paramSocketAddress);
/* 267:326 */       str = "Your IP address is banned from this server!\nReason: " + ((se)localObject).d();
/* 268:328 */       if (((se)localObject).c() != null) {
/* 269:329 */         str = str + "\nYour ban will be removed on " + i.format(((se)localObject).c());
/* 270:    */       }
/* 271:332 */       return str;
/* 272:    */     }
/* 273:335 */     if (this.e.size() >= this.g) {
/* 274:336 */       return "The server is full!";
/* 275:    */     }
/* 276:339 */     return null;
/* 277:    */   }
/* 278:    */   
/* 279:    */   public qw f(GameProfile paramGameProfile)
/* 280:    */   {
/* 281:343 */     UUID localUUID = EntityPlayer.a(paramGameProfile);
/* 282:344 */     ArrayList<qw> localArrayList = Lists.newArrayList();
/* 283:    */     qw localqw;
/* 284:345 */     for (int i1 = 0; i1 < this.e.size(); i1++)
/* 285:    */     {
/* 286:346 */       localqw = this.e.get(i1);
/* 287:347 */       if (localqw.getUUID().equals(localUUID)) {
/* 288:348 */         localArrayList.add(localqw);
/* 289:    */       }
/* 290:    */     }
/* 291:351 */     for (Iterator<qw> it = localArrayList.iterator(); it.hasNext();)
/* 292:    */     {
/* 293:351 */       localqw = it.next();
/* 294:352 */       localqw.a.c("You logged in from another location");
/* 295:    */     }
				  qx localObject;
/* 296:357 */     if (this.j.W()) {
/* 297:358 */       localObject = new qk(this.j.a(0));
/* 298:    */     } else {
/* 299:360 */       localObject = new qx(this.j.a(0));
/* 300:    */     }
/* 301:363 */     return new qw(this.j, this.j.a(0), paramGameProfile, localObject);
/* 302:    */   }
/* 303:    */   
/* 304:    */   public qw a(qw paramqw, int paramInt, boolean paramBoolean)
/* 305:    */   {
/* 306:367 */     paramqw.u().s().b(paramqw);
/* 307:368 */     paramqw.u().s().b(paramqw);
/* 308:369 */     paramqw.u().t().c(paramqw);
/* 309:370 */     this.e.remove(paramqw);
/* 310:371 */     this.j.a(paramqw.dimension).removeEntity(paramqw);
/* 311:    */     
/* 312:373 */     BlockPosition localdt1 = paramqw.cg();
/* 313:374 */     boolean bool = paramqw.ch();
/* 314:    */     
/* 315:376 */     paramqw.dimension = paramInt;
/* 316:    */     Object localObject;
/* 317:380 */     if (this.j.W()) {
/* 318:381 */       localObject = new qk(this.j.a(paramqw.dimension));
/* 319:    */     } else {
/* 320:383 */       localObject = new qx(this.j.a(paramqw.dimension));
/* 321:    */     }
/* 322:386 */     qw localqw = new qw(this.j, this.j.a(paramqw.dimension), paramqw.cc(), (qx)localObject);
/* 323:387 */     localqw.a = paramqw.a;
/* 324:388 */     localqw.a(paramqw, paramBoolean);
/* 325:389 */     localqw.setID(paramqw.getID());
/* 326:390 */     localqw.o(paramqw);
/* 327:    */     
/* 328:392 */     WorldServer localqt = this.j.a(paramqw.dimension);
/* 329:393 */     a(localqw, paramqw, localqt);
/* 330:395 */     if (localdt1 != null)
/* 331:    */     {
/* 332:396 */       BlockPosition localdt2 = EntityPlayer.a(this.j.a(paramqw.dimension), localdt1, bool);
/* 333:397 */       if (localdt2 != null)
/* 334:    */       {
/* 335:398 */         localqw.setPositionAndAngles(localdt2.getX() + 0.5F, localdt2.getY() + 0.1F, localdt2.getZ() + 0.5F, 0.0F, 0.0F);
/* 336:399 */         localqw.a(localdt1, bool);
/* 337:    */       }
/* 338:    */       else
/* 339:    */       {
/* 340:401 */         localqw.a.a(new jo(0, 0.0F));
/* 341:    */       }
/* 342:    */     }
/* 343:406 */     localqt.b.c((int)localqw.xPos >> 4, (int)localqw.zPos >> 4);
/* 344:408 */     while ((!localqt.getCollidingAABBs(localqw, localqw.getAABB()).isEmpty()) && (localqw.yPos < 256.0D)) {
/* 345:409 */       localqw.setPos(localqw.xPos, localqw.yPos + 1.0D, localqw.zPos);
/* 346:    */     }
/* 347:412 */     localqw.a.a(new kp(localqw.dimension, localqw.world.getDifficulty(), localqw.world.getWorldInfo().u(), localqw.c.b()));
/* 348:413 */     BlockPosition localdt2 = localqt.getWorldSpawn();
/* 349:414 */     localqw.a.a(localqw.xPos, localqw.yPos, localqw.zPos, localqw.yaw, localqw.pitch);
/* 350:415 */     localqw.a.a(new lh(localdt2));
/* 351:416 */     localqw.a.a(new lb(localqw.bB, localqw.bA, localqw.bz));
/* 352:417 */     b(localqw, localqt);
/* 353:    */     
/* 354:419 */     localqt.t().a(localqw);
/* 355:420 */     localqt.spawnEntity(localqw);
/* 356:421 */     this.e.add(localqw);
/* 357:422 */     this.f.put(localqw.getUUID(), localqw);
/* 358:    */     
/* 359:424 */     localqw.f_();
/* 360:425 */     localqw.h(localqw.getHealth());
/* 361:426 */     return localqw;
/* 362:    */   }
/* 363:    */   
/* 364:    */   public void a(qw paramqw, int paramInt)
/* 365:    */   {
/* 366:430 */     int i1 = paramqw.dimension;
/* 367:431 */     WorldServer localqt1 = this.j.a(paramqw.dimension);
/* 368:432 */     paramqw.dimension = paramInt;
/* 369:    */     
/* 370:434 */     WorldServer localqt2 = this.j.a(paramqw.dimension);
/* 371:    */     
/* 372:436 */     paramqw.a.a(new kp(paramqw.dimension, paramqw.world.getDifficulty(), paramqw.world.getWorldInfo().u(), paramqw.c.b()));
/* 373:    */     
/* 374:438 */     localqt1.removeEntity(paramqw);
/* 375:439 */     paramqw.isDead = false;
/* 376:    */     
/* 377:441 */     a(paramqw, i1, localqt1, localqt2);
/* 378:442 */     a(paramqw, localqt1);
/* 379:    */     
/* 380:444 */     paramqw.a.a(paramqw.xPos, paramqw.yPos, paramqw.zPos, paramqw.yaw, paramqw.pitch);
/* 381:445 */     paramqw.c.a(localqt2);
/* 382:446 */     b(paramqw, localqt2);
/* 383:447 */     f(paramqw);
/* 384:449 */     for (PotionEffect localwq : paramqw.bk()) {
/* 385:450 */       paramqw.a.a(new lr(paramqw.getID(), localwq));
/* 386:    */     }
/* 387:    */   }
/* 388:    */   
/* 389:    */   public void a(Entity paramwv, int paramInt, WorldServer paramqt1, WorldServer paramqt2)
/* 390:    */   {
/* 391:455 */     double d1 = paramwv.xPos;
/* 392:456 */     double d2 = paramwv.zPos;
/* 393:457 */     double d3 = 8.0D;
/* 394:458 */     float f1 = paramwv.yaw;
/* 395:    */     
/* 396:460 */     paramqt1.profiler.a("moving");
/* 397:461 */     if (paramwv.dimension == -1)
/* 398:    */     {
/* 399:463 */       d1 = MathUtils.clamp(d1 / d3, paramqt2.af().b() + 16.0D, paramqt2.af().d() - 16.0D);
/* 400:464 */       d2 = MathUtils.clamp(d2 / d3, paramqt2.af().c() + 16.0D, paramqt2.af().e() - 16.0D);
/* 401:465 */       paramwv.setPositionAndAngles(d1, paramwv.yPos, d2, paramwv.yaw, paramwv.pitch);
/* 402:466 */       if (paramwv.ai()) {
/* 403:467 */         paramqt1.a(paramwv, false);
/* 404:    */       }
/* 405:    */     }
/* 406:469 */     else if (paramwv.dimension == 0)
/* 407:    */     {
/* 408:471 */       d1 = MathUtils.clamp(d1 * d3, paramqt2.af().b() + 16.0D, paramqt2.af().d() - 16.0D);
/* 409:472 */       d2 = MathUtils.clamp(d2 * d3, paramqt2.af().c() + 16.0D, paramqt2.af().e() - 16.0D);
/* 410:473 */       paramwv.setPositionAndAngles(d1, paramwv.yPos, d2, paramwv.yaw, paramwv.pitch);
/* 411:474 */       if (paramwv.ai()) {
/* 412:475 */         paramqt1.a(paramwv, false);
/* 413:    */       }
/* 414:    */     }
/* 415:    */     else
/* 416:    */     {
/* 417:    */       BlockPosition localdt;
/* 418:480 */       if (paramInt == 1) {
/* 419:482 */         localdt = paramqt2.getWorldSpawn();
/* 420:    */       } else {
/* 421:485 */         localdt = paramqt2.m();
/* 422:    */       }
/* 423:488 */       d1 = localdt.getX();
/* 424:489 */       paramwv.yPos = localdt.getY();
/* 425:490 */       d2 = localdt.getZ();
/* 426:    */       
/* 427:492 */       paramwv.setPositionAndAngles(d1, paramwv.yPos, d2, 90.0F, 0.0F);
/* 428:493 */       if (paramwv.ai()) {
/* 429:494 */         paramqt1.a(paramwv, false);
/* 430:    */       }
/* 431:    */     }
/* 432:497 */     paramqt1.profiler.b();
/* 433:499 */     if (paramInt != 1)
/* 434:    */     {
/* 435:500 */       paramqt1.profiler.a("placing");
/* 436:    */       
/* 437:502 */       d1 = MathUtils.clamp((int)d1, -29999872, 29999872);
/* 438:503 */       d2 = MathUtils.clamp((int)d2, -29999872, 29999872);
/* 439:504 */       if (paramwv.ai())
/* 440:    */       {
/* 441:505 */         paramwv.setPositionAndAngles(d1, paramwv.yPos, d2, paramwv.yaw, paramwv.pitch);
/* 442:506 */         paramqt2.u().a(paramwv, f1);
/* 443:507 */         paramqt2.spawnEntity(paramwv);
/* 444:508 */         paramqt2.a(paramwv, false);
/* 445:    */       }
/* 446:510 */       paramqt1.profiler.b();
/* 447:    */     }
/* 448:513 */     paramwv.a(paramqt2);
/* 449:    */   }
/* 450:    */   
/* 451:    */   public void e()
/* 452:    */   {
/* 453:519 */     if (++this.u > 600)
/* 454:    */     {
/* 455:520 */       a(new kh(kj.c, this.e));
/* 456:521 */       this.u = 0;
/* 457:    */     }
/* 458:    */   }
/* 459:    */   
/* 460:    */   public void a(id paramid)
/* 461:    */   {
/* 462:526 */     for (int i1 = 0; i1 < this.e.size(); i1++) {
/* 463:527 */       ((qw)this.e.get(i1)).a.a(paramid);
/* 464:    */     }
/* 465:    */   }
/* 466:    */   
/* 467:    */   public void a(id paramid, int paramInt)
/* 468:    */   {
/* 469:532 */     for (int i1 = 0; i1 < this.e.size(); i1++)
/* 470:    */     {
/* 471:533 */       qw localqw = (qw)this.e.get(i1);
/* 472:534 */       if (localqw.dimension == paramInt) {
/* 473:535 */         localqw.a.a(paramid);
/* 474:    */       }
/* 475:    */     }
/* 476:    */   }
/* 477:    */   
/* 478:    */   public void a(EntityPlayer paramahd, ho paramho)
/* 479:    */   {
/* 480:541 */     bsf localbsf = paramahd.bN();
/* 481:542 */     if (localbsf == null) {
/* 482:543 */       return;
/* 483:    */     }
/* 484:545 */     Collection<String> localCollection = localbsf.d();
/* 485:546 */     for (String str : localCollection)
/* 486:    */     {
/* 487:547 */       qw localqw = a(str);
/* 488:548 */       if ((localqw != null) && (localqw != paramahd)) {
/* 489:551 */         localqw.a(paramho);
/* 490:    */       }
/* 491:    */     }
/* 492:    */   }
/* 493:    */   
/* 494:    */   public void b(EntityPlayer paramahd, ho paramho)
/* 495:    */   {
/* 496:556 */     bsf localbsf = paramahd.bN();
/* 497:557 */     if (localbsf == null)
/* 498:    */     {
/* 499:558 */       a(paramho);
/* 500:559 */       return;
/* 501:    */     }
/* 502:561 */     for (int i1 = 0; i1 < this.e.size(); i1++)
/* 503:    */     {
/* 504:562 */       qw localqw = (qw)this.e.get(i1);
/* 505:563 */       if (localqw.bN() != localbsf) {
/* 506:564 */         localqw.a(paramho);
/* 507:    */       }
/* 508:    */     }
/* 509:    */   }
/* 510:    */   
/* 511:    */   public String f()
/* 512:    */   {
/* 513:570 */     String str = "";
/* 514:571 */     for (int i1 = 0; i1 < this.e.size(); i1++)
/* 515:    */     {
/* 516:572 */       if (i1 > 0) {
/* 517:573 */         str = str + ", ";
/* 518:    */       }
/* 519:575 */       str = str + ((qw)this.e.get(i1)).getName();
/* 520:    */     }
/* 521:577 */     return str;
/* 522:    */   }
/* 523:    */   
/* 524:    */   public String[] g()
/* 525:    */   {
/* 526:581 */     String[] arrayOfString = new String[this.e.size()];
/* 527:582 */     for (int i1 = 0; i1 < this.e.size(); i1++) {
/* 528:583 */       arrayOfString[i1] = ((qw)this.e.get(i1)).getName();
/* 529:    */     }
/* 530:585 */     return arrayOfString;
/* 531:    */   }
/* 532:    */   
/* 533:    */   public GameProfile[] h()
/* 534:    */   {
/* 535:589 */     GameProfile[] arrayOfGameProfile = new GameProfile[this.e.size()];
/* 536:590 */     for (int i1 = 0; i1 < this.e.size(); i1++) {
/* 537:591 */       arrayOfGameProfile[i1] = ((qw)this.e.get(i1)).cc();
/* 538:    */     }
/* 539:593 */     return arrayOfGameProfile;
/* 540:    */   }
/* 541:    */   
/* 542:    */   public sv i()
/* 543:    */   {
/* 544:597 */     return this.k;
/* 545:    */   }
/* 546:    */   
/* 547:    */   public sd j()
/* 548:    */   {
/* 549:601 */     return this.l;
/* 550:    */   }
/* 551:    */   
/* 552:    */   public void a(GameProfile paramGameProfile)
/* 553:    */   {
/* 554:605 */     this.m.a(new sq(paramGameProfile, this.j.p()));
/* 555:    */   }
/* 556:    */   
/* 557:    */   public void b(GameProfile paramGameProfile)
/* 558:    */   {
/* 559:609 */     this.m.c(paramGameProfile);
/* 560:    */   }
/* 561:    */   
/* 562:    */   public boolean e(GameProfile paramGameProfile)
/* 563:    */   {
/* 564:613 */     return (!this.q) || (this.m.d(paramGameProfile)) || (this.n.d(paramGameProfile));
/* 565:    */   }
/* 566:    */   
/* 567:    */   public boolean g(GameProfile paramGameProfile)
/* 568:    */   {
/* 569:617 */     return (this.m.d(paramGameProfile)) || ((this.j.S()) && (this.j.c[0].getWorldInfo().v()) && (this.j.R().equalsIgnoreCase(paramGameProfile.getName()))) || (this.t);
/* 570:    */   }
/* 571:    */   
/* 572:    */   public qw a(String paramString)
/* 573:    */   {
/* 574:621 */     for (qw localqw : this.e) {
/* 575:622 */       if (localqw.getName().equalsIgnoreCase(paramString)) {
/* 576:623 */         return localqw;
/* 577:    */       }
/* 578:    */     }
/* 579:626 */     return null;
/* 580:    */   }
/* 581:    */   
/* 582:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt, id paramid)
/* 583:    */   {
/* 584:630 */     a(null, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramInt, paramid);
/* 585:    */   }
/* 586:    */   
/* 587:    */   public void a(EntityPlayer paramahd, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt, id paramid)
/* 588:    */   {
/* 589:634 */     for (int i1 = 0; i1 < this.e.size(); i1++)
/* 590:    */     {
/* 591:635 */       qw localqw = this.e.get(i1);
/* 592:636 */       if (localqw != paramahd) {
/* 593:639 */         if (localqw.dimension == paramInt)
/* 594:    */         {
/* 595:642 */           double d1 = paramDouble1 - localqw.xPos;
/* 596:643 */           double d2 = paramDouble2 - localqw.yPos;
/* 597:644 */           double d3 = paramDouble3 - localqw.zPos;
/* 598:645 */           if (d1 * d1 + d2 * d2 + d3 * d3 < paramDouble4 * paramDouble4) {
/* 599:646 */             localqw.a.a(paramid);
/* 600:    */           }
/* 601:    */         }
/* 602:    */       }
/* 603:    */     }
/* 604:    */   }
/* 605:    */   
/* 606:    */   public void k()
/* 607:    */   {
/* 608:652 */     for (int i1 = 0; i1 < this.e.size(); i1++) {
/* 609:653 */       b(this.e.get(i1));
/* 610:    */     }
/* 611:    */   }
/* 612:    */   
/* 613:    */   public void d(GameProfile paramGameProfile)
/* 614:    */   {
/* 615:658 */     this.n.a(new sy(paramGameProfile));
/* 616:    */   }
/* 617:    */   
/* 618:    */   public void c(GameProfile paramGameProfile)
/* 619:    */   {
/* 620:662 */     this.n.c(paramGameProfile);
/* 621:    */   }
/* 622:    */   
/* 623:    */   public sx l()
/* 624:    */   {
/* 625:666 */     return this.n;
/* 626:    */   }
/* 627:    */   
/* 628:    */   public String[] m()
/* 629:    */   {
/* 630:670 */     return this.n.a();
/* 631:    */   }
/* 632:    */   
/* 633:    */   public sp n()
/* 634:    */   {
/* 635:674 */     return this.m;
/* 636:    */   }
/* 637:    */   
/* 638:    */   public String[] o()
/* 639:    */   {
/* 640:678 */     return this.m.a();
/* 641:    */   }
/* 642:    */   
/* 643:    */   public void a() {}
/* 644:    */   
/* 645:    */   public void b(qw paramqw, WorldServer paramqt)
/* 646:    */   {
/* 647:685 */     bfb localbfb = this.j.c[0].af();
/* 648:686 */     paramqw.a.a(new kr(localbfb, kt.d));
/* 649:687 */     paramqw.a.a(new li(paramqt.K(), paramqt.L(), paramqt.getGameRules().getBoolean("doDaylightCycle")));
/* 650:689 */     if (paramqt.S())
/* 651:    */     {
/* 652:690 */       paramqw.a.a(new jo(1, 0.0F));
/* 653:691 */       paramqw.a.a(new jo(7, paramqt.j(1.0F)));
/* 654:692 */       paramqw.a.a(new jo(8, paramqt.h(1.0F)));
/* 655:    */     }
/* 656:    */   }
/* 657:    */   
/* 658:    */   public void f(qw paramqw)
/* 659:    */   {
/* 660:697 */     paramqw.a(paramqw.bh);
/* 661:698 */     paramqw.r();
/* 662:699 */     paramqw.a.a(new kv(paramqw.bg.c));
/* 663:    */   }
/* 664:    */   
/* 665:    */   public int p()
/* 666:    */   {
/* 667:703 */     return this.e.size();
/* 668:    */   }
/* 669:    */   
/* 670:    */   public int q()
/* 671:    */   {
/* 672:707 */     return this.g;
/* 673:    */   }
/* 674:    */   
/* 675:    */   public String[] r()
/* 676:    */   {
/* 677:711 */     return this.j.c[0].O().e().f();
/* 678:    */   }
/* 679:    */   
/* 680:    */   public void a(boolean paramBoolean)
/* 681:    */   {
/* 682:719 */     this.q = paramBoolean;
/* 683:    */   }
/* 684:    */   
/* 685:    */   public List b(String paramString)
/* 686:    */   {
/* 687:723 */     ArrayList localArrayList = Lists.newArrayList();
/* 688:725 */     for (qw localqw : this.e) {
/* 689:726 */       if (localqw.w().equals(paramString)) {
/* 690:727 */         localArrayList.add(localqw);
/* 691:    */       }
/* 692:    */     }
/* 693:731 */     return localArrayList;
/* 694:    */   }
/* 695:    */   
/* 696:    */   public int t()
/* 697:    */   {
/* 698:735 */     return this.r;
/* 699:    */   }
/* 700:    */   
/* 701:    */   public MinecraftServer c()
/* 702:    */   {
/* 703:739 */     return this.j;
/* 704:    */   }
/* 705:    */   
/* 706:    */   public NBTTagCompound u()
/* 707:    */   {
/* 708:743 */     return null;
/* 709:    */   }
/* 710:    */   
/* 711:    */   public void a(EnumGameMode paramarc)
/* 712:    */   {
/* 713:747 */     this.s = paramarc;
/* 714:    */   }
/* 715:    */   
/* 716:    */   private void a(qw paramqw1, qw paramqw2, World paramaqu)
/* 717:    */   {
/* 718:753 */     if (paramqw2 != null) {
/* 719:754 */       paramqw1.c.a(paramqw2.c.b());
/* 720:755 */     } else if (this.s != null) {
/* 721:756 */       paramqw1.c.a(this.s);
/* 722:    */     }
/* 723:758 */     paramqw1.c.b(paramaqu.getWorldInfo().r());
/* 724:    */   }
/* 725:    */   
/* 726:    */   public void b(boolean paramBoolean)
/* 727:    */   {
/* 728:762 */     this.t = paramBoolean;
/* 729:    */   }
/* 730:    */   
/* 731:    */   public void v()
/* 732:    */   {
/* 733:766 */     for (int i1 = 0; i1 < this.e.size(); i1++) {
/* 734:767 */       ((qw)this.e.get(i1)).a.c("Server closed");
/* 735:    */     }
/* 736:    */   }
/* 737:    */   
/* 738:    */   public void a(ho paramho, boolean paramBoolean)
/* 739:    */   {
/* 740:772 */     this.j.a(paramho);
/* 741:773 */     byte b1 = (byte) (paramBoolean ? 1 : 0);
/* 742:774 */     a(new iz(paramho, b1));
/* 743:    */   }
/* 744:    */   
/* 745:    */   public void a(ho paramho)
/* 746:    */   {
/* 747:778 */     a(paramho, true);
/* 748:    */   }
/* 749:    */   
/* 750:    */   public tp a(EntityPlayer paramahd)
/* 751:    */   {
/* 752:782 */     UUID localUUID = paramahd.getUUID();
/* 753:783 */     tp localtp = localUUID == null ? null : (tp)this.o.get(localUUID);
/* 754:785 */     if (localtp == null)
/* 755:    */     {
/* 756:786 */       File localFile1 = new File(this.j.a(0).O().b(), "stats");
/* 757:787 */       File localFile2 = new File(localFile1, localUUID.toString() + ".json");
/* 758:789 */       if (!localFile2.exists())
/* 759:    */       {
/* 760:791 */         File localFile3 = new File(localFile1, paramahd.getName() + ".json");
/* 761:792 */         if ((localFile3.exists()) && (localFile3.isFile())) {
/* 762:793 */           localFile3.renameTo(localFile2);
/* 763:    */         }
/* 764:    */       }
/* 765:797 */       localtp = new tp(this.j, localFile2);
/* 766:798 */       localtp.a();
/* 767:799 */       this.o.put(localUUID, localtp);
/* 768:    */     }
/* 769:802 */     return localtp;
/* 770:    */   }
/* 771:    */   
/* 772:    */   public void a(int paramInt)
/* 773:    */   {
/* 774:806 */     this.r = paramInt;
/* 775:807 */     if (this.j.c == null) {
/* 776:808 */       return;
/* 777:    */     }
/* 778:811 */     for (WorldServer localqt : this.j.c) {
/* 779:812 */       if (localqt != null) {
/* 780:813 */         localqt.t().a(paramInt);
/* 781:    */       }
/* 782:    */     }
/* 783:    */   }
/* 784:    */   
/* 785:    */   public qw a(UUID paramUUID)
/* 786:    */   {
/* 787:819 */     return (qw)this.f.get(paramUUID);
/* 788:    */   }
/* 789:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     sn
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*    1:     */ import com.google.common.collect.Maps;
/*    2:     */ import com.google.common.util.concurrent.Futures;
/*    3:     */ import com.mojang.authlib.GameProfile;
/*    4:     */ import io.netty.buffer.Unpooled;
/*    5:     */ import java.io.File;
/*    6:     */ import java.io.IOException;
/*    7:     */ import java.util.Collection;
/*    8:     */ import java.util.Iterator;
/*    9:     */ import java.util.List;
/*   10:     */ import java.util.Map;
/*   11:     */ import java.util.Map.Entry;
/*   12:     */ import java.util.Random;
/*   13:     */ import java.util.Set;
/*   14:     */ import java.util.UUID;
/*   15:     */ import net.minecraft.client.ClientBrandRetriever;
/*   16:     */ import net.minecraft.realms.DisconnectedRealmsScreen;
/*   17:     */ import org.apache.logging.log4j.LogManager;
/*   18:     */ import org.apache.logging.log4j.Logger;
/*   19:     */ 
/*   20:     */ public class cee
/*   21:     */   implements ik
/*   22:     */ {
/*   23:  96 */   private static final Logger b = LogManager.getLogger();
/*   24:     */   private final gr c;
/*   25:     */   private final GameProfile d;
/*   26:     */   private final bxf e;
/*   27:     */   private bsu f;
/*   28:     */   private cen g;
/*   29:     */   private boolean h;
/*   30: 106 */   private final Map<UUID,ces> i = Maps.newHashMap();
/*   31: 107 */   public int a = 20;
/*   32: 108 */   private boolean j = false;
/*   33: 110 */   private final Random k = new Random();
/*   34:     */   
/*   35:     */   public cee(bsu parambsu, bxf parambxf, gr paramgr, GameProfile paramGameProfile)
/*   36:     */   {
/*   37: 113 */     this.f = parambsu;
/*   38: 114 */     this.e = parambxf;
/*   39: 115 */     this.c = paramgr;
/*   40: 116 */     this.d = paramGameProfile;
/*   41:     */   }
/*   42:     */   
/*   43:     */   public void b()
/*   44:     */   {
/*   45: 120 */     this.g = null;
/*   46:     */   }
/*   47:     */   
/*   48:     */   public void a(jw paramjw)
/*   49:     */   {
/*   50: 125 */     ig.a(paramjw, this, this.f);
/*   51: 126 */     this.f.c = new cem(this.f, this);
/*   52:     */     
/*   53: 128 */     this.g = new cen(this, new WorldSettings(0L, paramjw.c(), false, paramjw.b(), paramjw.g()), paramjw.d(), paramjw.e(), this.f.y);
/*   54: 129 */     this.f.t.av = paramjw.e();
/*   55: 130 */     this.f.a(this.g);
/*   56: 131 */     this.f.h.dimension = paramjw.d();
/*   57: 132 */     this.f.a(new bxd(this));
/*   58: 133 */     this.f.h.setID(paramjw.a());
/*   59: 134 */     this.a = paramjw.f();
/*   60: 135 */     this.f.h.k(paramjw.h());
/*   61:     */     
/*   62: 137 */     this.f.c.a(paramjw.c());
/*   63: 138 */     this.f.t.c();
/*   64: 139 */     this.c.a(new mc("MC|Brand", new ByteBufWrapper(Unpooled.buffer()).a(ClientBrandRetriever.getClientModName())));
/*   65:     */   }
/*   66:     */   
/*   67:     */   public void a(il paramil)
/*   68:     */   {
/*   69: 144 */     ig.a(paramil, this, this.f);
/*   70: 145 */     double d1 = paramil.b() / 32.0D;
/*   71: 146 */     double d2 = paramil.c() / 32.0D;
/*   72: 147 */     double d3 = paramil.d() / 32.0D;
/*   73: 148 */     Object localObject1 = null;
/*   74:     */     Object localObject2;
/*   75: 149 */     if (paramil.j() == 10)
/*   76:     */     {
/*   77: 150 */       localObject1 = adx.a(this.g, d1, d2, d3, EnumMinecartVariant.a(paramil.k()));
/*   78:     */     }
/*   79: 151 */     else if (paramil.j() == 90)
/*   80:     */     {
/*   81: 152 */       localObject2 = this.g.a(paramil.k());
/*   82: 153 */       if ((localObject2 instanceof EntityPlayer)) {
/*   83: 154 */         localObject1 = new EntityFishHook(this.g, d1, d2, d3, (EntityPlayer)localObject2);
/*   84:     */       }
/*   85: 156 */       paramil.g(0);
/*   86:     */     }
/*   87: 157 */     else if (paramil.j() == 60)
/*   88:     */     {
/*   89: 158 */       localObject1 = new ahj(this.g, d1, d2, d3);
/*   90:     */     }
/*   91: 159 */     else if (paramil.j() == 61)
/*   92:     */     {
/*   93: 160 */       localObject1 = new ahq(this.g, d1, d2, d3);
/*   94:     */     }
/*   95: 161 */     else if (paramil.j() == 71)
/*   96:     */     {
/*   97: 162 */       localObject1 = new EntityItemFrame(this.g, new BlockPosition(MathUtils.floor(d1), MathUtils.floor(d2), MathUtils.floor(d3)), EnumDirection.b(paramil.k()));
/*   98: 163 */       paramil.g(0);
/*   99:     */     }
/*  100: 164 */     else if (paramil.j() == 77)
/*  101:     */     {
/*  102: 165 */       localObject1 = new adl(this.g, new BlockPosition(MathUtils.floor(d1), MathUtils.floor(d2), MathUtils.floor(d3)));
/*  103: 166 */       paramil.g(0);
/*  104:     */     }
/*  105: 167 */     else if (paramil.j() == 65)
/*  106:     */     {
/*  107: 168 */       localObject1 = new aht(this.g, d1, d2, d3);
/*  108:     */     }
/*  109: 169 */     else if (paramil.j() == 72)
/*  110:     */     {
/*  111: 170 */       localObject1 = new EntityEnderEye(this.g, d1, d2, d3);
/*  112:     */     }
/*  113: 171 */     else if (paramil.j() == 76)
/*  114:     */     {
/*  115: 172 */       localObject1 = new ahm(this.g, d1, d2, d3, null);
/*  116:     */     }
/*  117: 173 */     else if (paramil.j() == 63)
/*  118:     */     {
/*  119: 174 */       localObject1 = new ahn(this.g, d1, d2, d3, paramil.e() / 8000.0D, paramil.f() / 8000.0D, paramil.g() / 8000.0D);
/*  120: 175 */       paramil.g(0);
/*  121:     */     }
/*  122: 176 */     else if (paramil.j() == 64)
/*  123:     */     {
/*  124: 177 */       localObject1 = new ahp(this.g, d1, d2, d3, paramil.e() / 8000.0D, paramil.f() / 8000.0D, paramil.g() / 8000.0D);
/*  125: 178 */       paramil.g(0);
/*  126:     */     }
/*  127: 179 */     else if (paramil.j() == 66)
/*  128:     */     {
/*  129: 180 */       localObject1 = new ahw(this.g, d1, d2, d3, paramil.e() / 8000.0D, paramil.f() / 8000.0D, paramil.g() / 8000.0D);
/*  130: 181 */       paramil.g(0);
/*  131:     */     }
/*  132: 182 */     else if (paramil.j() == 62)
/*  133:     */     {
/*  134: 183 */       localObject1 = new ahs(this.g, d1, d2, d3);
/*  135:     */     }
/*  136: 184 */     else if (paramil.j() == 73)
/*  137:     */     {
/*  138: 185 */       localObject1 = new ahv(this.g, d1, d2, d3, paramil.k());
/*  139: 186 */       paramil.g(0);
/*  140:     */     }
/*  141: 187 */     else if (paramil.j() == 75)
/*  142:     */     {
/*  143: 188 */       localObject1 = new ahu(this.g, d1, d2, d3);
/*  144: 189 */       paramil.g(0);
/*  145:     */     }
/*  146: 190 */     else if (paramil.j() == 1)
/*  147:     */     {
/*  148: 191 */       localObject1 = new adu(this.g, d1, d2, d3);
/*  149:     */     }
/*  150: 192 */     else if (paramil.j() == 50)
/*  151:     */     {
/*  152: 193 */       localObject1 = new aek(this.g, d1, d2, d3, null);
/*  153:     */     }
/*  154: 194 */     else if (paramil.j() == 78)
/*  155:     */     {
/*  156: 195 */       localObject1 = new EntityArmorStand(this.g, d1, d2, d3);
/*  157:     */     }
/*  158: 196 */     else if (paramil.j() == 51)
/*  159:     */     {
/*  160: 197 */       localObject1 = new ada(this.g, d1, d2, d3);
/*  161:     */     }
/*  162: 198 */     else if (paramil.j() == 2)
/*  163:     */     {
/*  164: 199 */       localObject1 = new EntityItem(this.g, d1, d2, d3);
/*  165:     */     }
/*  166: 200 */     else if (paramil.j() == 70)
/*  167:     */     {
/*  168: 201 */       localObject1 = new adv(this.g, d1, d2, d3, ProtoBlock.d(paramil.k() & 0xFFFF));
/*  169: 202 */       paramil.g(0);
/*  170:     */     }
/*  171: 205 */     if (localObject1 != null)
/*  172:     */     {
/*  173: 206 */       ((Entity)localObject1).bU = paramil.b();
/*  174: 207 */       ((Entity)localObject1).bV = paramil.c();
/*  175: 208 */       ((Entity)localObject1).bW = paramil.d();
/*  176: 209 */       ((Entity)localObject1).pitch = (paramil.h() * 360 / 256.0F);
/*  177: 210 */       ((Entity)localObject1).yaw = (paramil.i() * 360 / 256.0F);
/*  178: 211 */       Entity[] localObject21 = ((Entity)localObject1).aC();
/*  179: 212 */       if (localObject21 != null)
/*  180:     */       {
/*  181: 213 */         int m = paramil.a() - ((Entity)localObject1).getID();
/*  182: 214 */         for (int n = 0; n < localObject21.length; n++) {
/*  183: 215 */           localObject21[n].setID(localObject21[n].getID() + m);
/*  184:     */         }
/*  185:     */       }
/*  186: 218 */       ((Entity)localObject1).setID(paramil.a());
/*  187: 219 */       this.g.a(paramil.a(), (Entity)localObject1);
/*  188: 220 */       if (paramil.k() > 0)
/*  189:     */       {
/*  190: 221 */         if (paramil.j() == 60)
/*  191:     */         {
/*  192: 222 */           Entity localwv = this.g.a(paramil.k());
/*  193: 223 */           if (((localwv instanceof EntityLiving)) && ((localObject1 instanceof ahj))) {
/*  194: 224 */             ((ahj)localObject1).c = localwv;
/*  195:     */           }
/*  196:     */         }
/*  197: 228 */         ((Entity)localObject1).i(paramil.e() / 8000.0D, paramil.f() / 8000.0D, paramil.g() / 8000.0D);
/*  198:     */       }
/*  199:     */     }
/*  200:     */   }
/*  201:     */   
/*  202:     */   public void a(im paramim)
/*  203:     */   {
/*  204: 235 */     ig.a(paramim, this, this.f);
/*  205: 236 */     EntityExperienceOrb localxk = new EntityExperienceOrb(this.g, paramim.b(), paramim.c(), paramim.d(), paramim.e());
/*  206: 237 */     localxk.bU = paramim.b();
/*  207: 238 */     localxk.bV = paramim.c();
/*  208: 239 */     localxk.bW = paramim.d();
/*  209: 240 */     localxk.yaw = 0.0F;
/*  210: 241 */     localxk.pitch = 0.0F;
/*  211: 242 */     localxk.setID(paramim.a());
/*  212: 243 */     this.g.a(paramim.a(), localxk);
/*  213:     */   }
/*  214:     */   
/*  215:     */   public void a(in paramin)
/*  216:     */   {
/*  217: 248 */     ig.a(paramin, this, this.f);
/*  218: 249 */     double d1 = paramin.b() / 32.0D;
/*  219: 250 */     double d2 = paramin.c() / 32.0D;
/*  220: 251 */     double d3 = paramin.d() / 32.0D;
/*  221: 252 */     ads localads = null;
/*  222: 253 */     if (paramin.e() == 1) {
/*  223: 254 */       localads = new ads(this.g, d1, d2, d3);
/*  224:     */     }
/*  225: 256 */     if (localads != null)
/*  226:     */     {
/*  227: 257 */       localads.bU = paramin.b();
/*  228: 258 */       localads.bV = paramin.c();
/*  229: 259 */       localads.bW = paramin.d();
/*  230: 260 */       localads.yaw = 0.0F;
/*  231: 261 */       localads.pitch = 0.0F;
/*  232: 262 */       localads.setID(paramin.a());
/*  233: 263 */       this.g.c(localads);
/*  234:     */     }
/*  235:     */   }
/*  236:     */   
/*  237:     */   public void a(ip paramip)
/*  238:     */   {
/*  239: 269 */     ig.a(paramip, this, this.f);
/*  240: 270 */     adm localadm = new adm(this.g, paramip.b(), paramip.c(), paramip.d());
/*  241: 271 */     this.g.a(paramip.a(), localadm);
/*  242:     */   }
/*  243:     */   
/*  244:     */   public void a(kz paramkz)
/*  245:     */   {
/*  246: 276 */     ig.a(paramkz, this, this.f);
/*  247: 277 */     Entity localwv = this.g.a(paramkz.a());
/*  248: 278 */     if (localwv == null) {
/*  249: 279 */       return;
/*  250:     */     }
/*  251: 281 */     localwv.i(paramkz.b() / 8000.0D, paramkz.c() / 8000.0D, paramkz.d() / 8000.0D);
/*  252:     */   }
/*  253:     */   
/*  254:     */   public void a(kx paramkx)
/*  255:     */   {
/*  256: 286 */     ig.a(paramkx, this, this.f);
/*  257: 287 */     Entity localwv = this.g.a(paramkx.b());
/*  258: 288 */     if ((localwv != null) && (paramkx.a() != null)) {
/*  259: 289 */       localwv.H().a(paramkx.a());
/*  260:     */     }
/*  261:     */   }
/*  262:     */   
/*  263:     */   public void a(iq paramiq)
/*  264:     */   {
/*  265: 295 */     ig.a(paramiq, this, this.f);
/*  266: 296 */     double d1 = paramiq.d() / 32.0D;
/*  267: 297 */     double d2 = paramiq.e() / 32.0D;
/*  268: 298 */     double d3 = paramiq.f() / 32.0D;
/*  269: 299 */     float f1 = paramiq.g() * 360 / 256.0F;
/*  270: 300 */     float f2 = paramiq.h() * 360 / 256.0F;
/*  271: 301 */     cip localcip = new cip(this.f.f, a(paramiq.c()).a());
/*  272: 302 */     localcip.lastX = (localcip.P = localcip.bU = paramiq.d());
/*  273: 303 */     localcip.lastY = (localcip.Q = localcip.bV = paramiq.e());
/*  274: 304 */     localcip.lastZ = (localcip.R = localcip.bW = paramiq.f());
/*  275:     */     
/*  276: 306 */     int m = paramiq.i();
/*  277: 307 */     if (m == 0) {
/*  278: 308 */       localcip.bg.a[localcip.bg.c] = null;
/*  279:     */     } else {
/*  280: 310 */       localcip.bg.a[localcip.bg.c] = new ItemStack(Item.b(m), 1, 0);
/*  281:     */     }
/*  282: 312 */     localcip.a(d1, d2, d3, f1, f2);
/*  283: 313 */     this.g.a(paramiq.b(), localcip);
/*  284:     */     
/*  285: 315 */     List localList = paramiq.a();
/*  286: 316 */     if (localList != null) {
/*  287: 317 */       localcip.H().a(localList);
/*  288:     */     }
/*  289:     */   }
/*  290:     */   
/*  291:     */   public void a(lo paramlo)
/*  292:     */   {
/*  293: 323 */     ig.a(paramlo, this, this.f);
/*  294: 324 */     Entity localwv = this.g.a(paramlo.a());
/*  295: 325 */     if (localwv == null) {
/*  296: 326 */       return;
/*  297:     */     }
/*  298: 328 */     localwv.bU = paramlo.b();
/*  299: 329 */     localwv.bV = paramlo.c();
/*  300: 330 */     localwv.bW = paramlo.d();
/*  301: 331 */     double d1 = localwv.bU / 32.0D;
/*  302: 332 */     double d2 = localwv.bV / 32.0D + 0.015625D;
/*  303: 333 */     double d3 = localwv.bW / 32.0D;
/*  304: 334 */     float f1 = paramlo.e() * 360 / 256.0F;
/*  305: 335 */     float f2 = paramlo.f() * 360 / 256.0F;
/*  306: 336 */     if ((Math.abs(localwv.xPos - d1) >= 0.03125D) || (Math.abs(localwv.yPos - d2) >= 0.015625D) || (Math.abs(localwv.zPos - d3) >= 0.03125D)) {
/*  307: 337 */       localwv.a(d1, d2, d3, f1, f2, 3, true);
/*  308:     */     } else {
/*  309: 339 */       localwv.a(localwv.xPos, localwv.yPos, localwv.zPos, f1, f2, 3, true);
/*  310:     */     }
/*  311: 341 */     localwv.C = paramlo.g();
/*  312:     */   }
/*  313:     */   
/*  314:     */   public void a(kv paramkv)
/*  315:     */   {
/*  316: 346 */     ig.a(paramkv, this, this.f);
/*  317: 347 */     if ((paramkv.a() >= 0) && (paramkv.a() < ahb.i())) {
/*  318: 348 */       this.f.h.bg.c = paramkv.a();
/*  319:     */     }
/*  320:     */   }
/*  321:     */   
/*  322:     */   public void a(jy paramjy)
/*  323:     */   {
/*  324: 354 */     ig.a(paramjy, this, this.f);
/*  325: 355 */     Entity localwv = paramjy.a(this.g);
/*  326: 356 */     if (localwv == null) {
/*  327: 357 */       return;
/*  328:     */     }
/*  329: 359 */     localwv.bU += paramjy.a();
/*  330: 360 */     localwv.bV += paramjy.b();
/*  331: 361 */     localwv.bW += paramjy.c();
/*  332: 362 */     double d1 = localwv.bU / 32.0D;
/*  333: 363 */     double d2 = localwv.bV / 32.0D;
/*  334: 364 */     double d3 = localwv.bW / 32.0D;
/*  335: 365 */     float f1 = paramjy.f() ? paramjy.d() * 360 / 256.0F : localwv.yaw;
/*  336: 366 */     float f2 = paramjy.f() ? paramjy.e() * 360 / 256.0F : localwv.pitch;
/*  337: 367 */     localwv.a(d1, d2, d3, f1, f2, 3, false);
/*  338: 368 */     localwv.C = paramjy.g();
/*  339:     */   }
/*  340:     */   
/*  341:     */   public void a(kq paramkq)
/*  342:     */   {
/*  343: 373 */     ig.a(paramkq, this, this.f);
/*  344: 374 */     Entity localwv = paramkq.a(this.g);
/*  345: 375 */     if (localwv == null) {
/*  346: 376 */       return;
/*  347:     */     }
/*  348: 378 */     float f1 = paramkq.a() * 360 / 256.0F;
/*  349: 379 */     localwv.f(f1);
/*  350:     */   }
/*  351:     */   
/*  352:     */   public void a(km paramkm)
/*  353:     */   {
/*  354: 384 */     ig.a(paramkm, this, this.f);
/*  355: 385 */     for (int m = 0; m < paramkm.a().length; m++) {
/*  356: 386 */       this.g.d(paramkm.a()[m]);
/*  357:     */     }
/*  358:     */   }
/*  359:     */   
/*  360:     */   public void a(ii paramii)
/*  361:     */   {
/*  362: 392 */     ig.a(paramii, this, this.f);
/*  363: 393 */     cio localcio = this.f.h;
/*  364:     */     
/*  365: 395 */     double d1 = paramii.a();
/*  366: 396 */     double d2 = paramii.b();
/*  367: 397 */     double d3 = paramii.c();
/*  368: 398 */     float f1 = paramii.d();
/*  369: 399 */     float f2 = paramii.e();
/*  370: 401 */     if (paramii.f().contains(ij.a)) {
/*  371: 402 */       d1 += localcio.xPos;
/*  372:     */     } else {
/*  373: 404 */       localcio.xVelocity = 0.0D;
/*  374:     */     }
/*  375: 407 */     if (paramii.f().contains(ij.b)) {
/*  376: 408 */       d2 += localcio.yPos;
/*  377:     */     } else {
/*  378: 410 */       localcio.yVelocity = 0.0D;
/*  379:     */     }
/*  380: 413 */     if (paramii.f().contains(ij.c)) {
/*  381: 414 */       d3 += localcio.zPos;
/*  382:     */     } else {
/*  383: 416 */       localcio.zVelocity = 0.0D;
/*  384:     */     }
/*  385: 419 */     if (paramii.f().contains(ij.e)) {
/*  386: 420 */       f2 += localcio.pitch;
/*  387:     */     }
/*  388: 422 */     if (paramii.f().contains(ij.d)) {
/*  389: 423 */       f1 += localcio.yaw;
/*  390:     */     }
/*  391: 426 */     localcio.a(d1, d2, d3, f1, f2);
/*  392:     */     
/*  393: 428 */     this.c.a(new mi(localcio.xPos, localcio.getAABB().minY, localcio.zPos, localcio.yaw, localcio.pitch, false));
/*  394: 430 */     if (!this.h)
/*  395:     */     {
/*  396: 431 */       this.f.h.lastX = this.f.h.xPos;
/*  397: 432 */       this.f.h.lastY = this.f.h.yPos;
/*  398: 433 */       this.f.h.lastZ = this.f.h.zPos;
/*  399: 434 */       this.h = true;
/*  400: 435 */       this.f.a((bxf)null);
/*  401:     */     }
/*  402:     */   }
/*  403:     */   
/*  404:     */   public void a(ja paramja)
/*  405:     */   {
/*  406: 441 */     ig.a(paramja, this, this.f);
/*  407: 443 */     for (jb localjb : paramja.a()) {
/*  408: 444 */       this.g.b(localjb.a(), localjb.c());
/*  409:     */     }
/*  410:     */   }
/*  411:     */   
/*  412:     */   public void a(jq paramjq)
/*  413:     */   {
/*  414: 450 */     ig.a(paramjq, this, this.f);
/*  415: 451 */     if (paramjq.e()) {
/*  416: 452 */       if (paramjq.d() != 0)
/*  417:     */       {
/*  418: 453 */         this.g.b(paramjq.b(), paramjq.c(), true);
/*  419:     */       }
/*  420:     */       else
/*  421:     */       {
/*  422: 455 */         this.g.b(paramjq.b(), paramjq.c(), false);
/*  423: 456 */         return;
/*  424:     */       }
/*  425:     */     }
/*  426: 460 */     this.g.a(paramjq.b() << 4, 0, paramjq.c() << 4, (paramjq.b() << 4) + 15, 256, (paramjq.c() << 4) + 15);
/*  427:     */     
/*  428: 462 */     Chunk localbfh = this.g.getChunk(paramjq.b(), paramjq.c());
/*  429:     */     
/*  430: 464 */     localbfh.a(paramjq.a(), paramjq.d(), paramjq.e());
/*  431: 465 */     this.g.b(paramjq.b() << 4, 0, paramjq.c() << 4, (paramjq.b() << 4) + 15, 256, (paramjq.c() << 4) + 15);
/*  432: 467 */     if ((!paramjq.e()) || (!(this.g.t instanceof bgg))) {
/*  433: 468 */       localbfh.l();
/*  434:     */     }
/*  435:     */   }
/*  436:     */   
/*  437:     */   public void a(iw paramiw)
/*  438:     */   {
/*  439: 474 */     ig.a(paramiw, this, this.f);
/*  440: 475 */     this.g.b(paramiw.b(), paramiw.a());
/*  441:     */   }
/*  442:     */   
/*  443:     */   public void a(jj paramjj)
/*  444:     */   {
/*  445: 480 */     this.c.a(paramjj.a());
/*  446:     */   }
/*  447:     */   
/*  448:     */   public void a(ho paramho)
/*  449:     */   {
/*  450: 485 */     this.f.a((cen)null);
/*  451: 486 */     if (this.e != null)
/*  452:     */     {
/*  453: 487 */       if ((this.e instanceof bvt)) {
/*  454: 488 */         this.f.a(new DisconnectedRealmsScreen(((bvt)this.e).a(), "disconnect.lost", paramho).getProxy());
/*  455:     */       } else {
/*  456: 490 */         this.f.a(new bwo(this.e, "disconnect.lost", paramho));
/*  457:     */       }
/*  458:     */     }
/*  459:     */     else {
/*  460: 493 */       this.f.a(new bwo(new bzp(new bxq()), "disconnect.lost", paramho));
/*  461:     */     }
/*  462:     */   }
/*  463:     */   
/*  464:     */   public void a(id paramid)
/*  465:     */   {
/*  466: 498 */     this.c.a(paramid);
/*  467:     */   }
/*  468:     */   
/*  469:     */   public void a(ln paramln)
/*  470:     */   {
/*  471: 503 */     ig.a(paramln, this, this.f);
/*  472: 504 */     Entity localwv = this.g.a(paramln.a());
/*  473: 505 */     Object localObject = (EntityLiving)this.g.a(paramln.b());
/*  474: 506 */     if (localObject == null) {
/*  475: 507 */       localObject = this.f.h;
/*  476:     */     }
/*  477: 509 */     if (localwv != null)
/*  478:     */     {
/*  479: 510 */       if ((localwv instanceof EntityExperienceOrb)) {
/*  480: 511 */         this.g.a(localwv, "random.orb", 0.2F, ((this.k.nextFloat() - this.k.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/*  481:     */       } else {
/*  482: 513 */         this.g.a(localwv, "random.pop", 0.2F, ((this.k.nextFloat() - this.k.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/*  483:     */       }
/*  484: 516 */       this.f.j.a(new cgn(this.g, localwv, (Entity)localObject, 0.5F));
/*  485: 517 */       this.g.d(paramln.a());
/*  486:     */     }
/*  487:     */   }
/*  488:     */   
/*  489:     */   public void a(iz paramiz)
/*  490:     */   {
/*  491: 523 */     ig.a(paramiz, this, this.f);
/*  492: 524 */     if (paramiz.c() == 2) {
/*  493: 525 */       this.f.q.a(paramiz.a(), false);
/*  494:     */     } else {
/*  495: 527 */       this.f.q.d().a(paramiz.a());
/*  496:     */     }
/*  497:     */   }
/*  498:     */   
/*  499:     */   public void a(ir paramir)
/*  500:     */   {
/*  501: 533 */     ig.a(paramir, this, this.f);
/*  502: 534 */     Entity localwv = this.g.a(paramir.a());
/*  503: 535 */     if (localwv == null) {
/*  504:     */       return;
/*  505:     */     }
/*  506:     */     Object localObject;
/*  507: 538 */     if (paramir.b() == 0)
/*  508:     */     {
/*  509: 539 */       localObject = (EntityLiving)localwv;
/*  510: 540 */       ((EntityLiving)localObject).bv();
/*  511:     */     }
/*  512: 541 */     else if (paramir.b() == 1)
/*  513:     */     {
/*  514: 542 */       localwv.as();
/*  515:     */     }
/*  516: 543 */     else if (paramir.b() == 2)
/*  517:     */     {
/*  518: 544 */       localObject = (EntityPlayer)localwv;
/*  519: 545 */       ((EntityPlayer)localObject).a(false, false, false);
/*  520:     */     }
/*  521: 546 */     else if (paramir.b() == 4)
/*  522:     */     {
/*  523: 547 */       this.f.j.a(localwv, EnumParticleEffect.j);
/*  524:     */     }
/*  525: 548 */     else if (paramir.b() == 5)
/*  526:     */     {
/*  527: 549 */       this.f.j.a(localwv, EnumParticleEffect.k);
/*  528:     */     }
/*  529:     */   }
/*  530:     */   
/*  531:     */   public void a(kl paramkl)
/*  532:     */   {
/*  533: 555 */     ig.a(paramkl, this, this.f);
/*  534: 556 */     paramkl.a(this.g).a(paramkl.a());
/*  535:     */   }
/*  536:     */   
/*  537:     */   public void a(io paramio)
/*  538:     */   {
/*  539: 565 */     ig.a(paramio, this, this.f);
/*  540: 566 */     double d1 = paramio.d() / 32.0D;
/*  541: 567 */     double d2 = paramio.e() / 32.0D;
/*  542: 568 */     double d3 = paramio.f() / 32.0D;
/*  543: 569 */     float f1 = paramio.j() * 360 / 256.0F;
/*  544: 570 */     float f2 = paramio.k() * 360 / 256.0F;
/*  545: 571 */     EntityLiving localxm = (EntityLiving)EntityList.a(paramio.c(), this.f.f);
/*  546: 572 */     localxm.bU = paramio.d();
/*  547: 573 */     localxm.bV = paramio.e();
/*  548: 574 */     localxm.bW = paramio.f();
/*  549: 575 */     localxm.aI = (paramio.l() * 360 / 256.0F);
/*  550: 576 */     Entity[] arrayOfwv = localxm.aC();
/*  551: 577 */     if (arrayOfwv != null)
/*  552:     */     {
/*  553: 578 */       int m = paramio.b() - localxm.getID();
/*  554: 579 */       for (int n = 0; n < arrayOfwv.length; n++) {
/*  555: 580 */         arrayOfwv[n].setID(arrayOfwv[n].getID() + m);
/*  556:     */       }
/*  557:     */     }
/*  558: 584 */     localxm.setID(paramio.b());
/*  559: 585 */     localxm.a(d1, d2, d3, f1, f2);
/*  560: 586 */     localxm.xVelocity = (paramio.g() / 8000.0F);
/*  561: 587 */     localxm.yVelocity = (paramio.h() / 8000.0F);
/*  562: 588 */     localxm.zVelocity = (paramio.i() / 8000.0F);
/*  563: 589 */     this.g.a(paramio.b(), localxm);
/*  564:     */     
/*  565: 591 */     List<xw> localList = paramio.a();
/*  566: 592 */     if (localList != null) {
/*  567: 593 */       localxm.H().a(localList);
/*  568:     */     }
/*  569:     */   }
/*  570:     */   
/*  571:     */   public void a(li paramli)
/*  572:     */   {
/*  573: 599 */     ig.a(paramli, this, this.f);
/*  574: 600 */     this.f.f.a(paramli.a());
/*  575: 601 */     this.f.f.b(paramli.b());
/*  576:     */   }
/*  577:     */   
/*  578:     */   public void a(lh paramlh)
/*  579:     */   {
/*  580: 606 */     ig.a(paramlh, this, this.f);
/*  581: 607 */     this.f.h.a(paramlh.a(), true);
/*  582: 608 */     this.f.f.getWorldInfo().a(paramlh.a());
/*  583:     */   }
/*  584:     */   
/*  585:     */   public void a(ky paramky)
/*  586:     */   {
/*  587: 613 */     ig.a(paramky, this, this.f);
/*  588: 614 */     Object localObject = this.g.a(paramky.b());
/*  589: 615 */     Entity localwv = this.g.a(paramky.c());
/*  590: 617 */     if (paramky.a() == 0)
/*  591:     */     {
/*  592: 618 */       int m = 0;
/*  593: 619 */       if (paramky.b() == this.f.h.getID())
/*  594:     */       {
/*  595: 620 */         localObject = this.f.h;
/*  596: 622 */         if ((localwv instanceof adu)) {
/*  597: 623 */           ((adu)localwv).a(false);
/*  598:     */         }
/*  599: 626 */         m = (((Entity)localObject).vehicle == null) && (localwv != null) ? 1 : 0;
/*  600:     */       }
/*  601: 627 */       else if ((localwv instanceof adu))
/*  602:     */       {
/*  603: 628 */         ((adu)localwv).a(true);
/*  604:     */       }
/*  605: 631 */       if (localObject == null) {
/*  606: 632 */         return;
/*  607:     */       }
/*  608: 635 */       ((Entity)localObject).mount(localwv);
/*  609: 637 */       if (m != 0)
/*  610:     */       {
/*  611: 638 */         bto localbto = this.f.t;
/*  612: 639 */         this.f.q.a(cwc.a("mount.onboard", new Object[] { bto.c(localbto.Z.i()) }), false);
/*  613:     */       }
/*  614:     */     }
/*  615: 641 */     else if ((paramky.a() == 1) && 
/*  616: 642 */       ((localObject instanceof EntityMob)))
/*  617:     */     {
/*  618: 643 */       if (localwv != null) {
/*  619: 644 */         ((EntityMob)localObject).a(localwv, false);
/*  620:     */       } else {
/*  621: 646 */         ((EntityMob)localObject).a(false, false);
/*  622:     */       }
/*  623:     */     }
/*  624:     */   }
/*  625:     */   
/*  626:     */   public void a(jk paramjk)
/*  627:     */   {
/*  628: 654 */     ig.a(paramjk, this, this.f);
/*  629: 655 */     Entity localwv = paramjk.a(this.g);
/*  630: 656 */     if (localwv != null) {
/*  631: 658 */       if (paramjk.a() == 21) {
/*  632: 659 */         this.f.U().a(new cxv((EntityGuardian)localwv));
/*  633:     */       } else {
/*  634: 661 */         localwv.onSignal(paramjk.a());
/*  635:     */       }
/*  636:     */     }
/*  637:     */   }
/*  638:     */   
/*  639:     */   public void a(lc paramlc)
/*  640:     */   {
/*  641: 668 */     ig.a(paramlc, this, this.f);
/*  642: 669 */     this.f.h.m(paramlc.a());
/*  643: 670 */     this.f.h.ck().a(paramlc.b());
/*  644: 671 */     this.f.h.ck().b(paramlc.c());
/*  645:     */   }
/*  646:     */   
/*  647:     */   public void a(lb paramlb)
/*  648:     */   {
/*  649: 676 */     ig.a(paramlb, this, this.f);
/*  650: 677 */     this.f.h.a(paramlb.a(), paramlb.b(), paramlb.c());
/*  651:     */   }
/*  652:     */   
/*  653:     */   public void a(kp paramkp)
/*  654:     */   {
/*  655: 682 */     ig.a(paramkp, this, this.f);
/*  656: 683 */     if (paramkp.a() != this.f.h.dimension)
/*  657:     */     {
/*  658: 684 */       this.h = false;
/*  659: 685 */       bsd localbsd = this.g.Z();
/*  660: 686 */       this.g = new cen(this, new WorldSettings(0L, paramkp.c(), false, this.f.f.getWorldInfo().isHardcore(), paramkp.d()), paramkp.a(), paramkp.b(), this.f.y);
/*  661: 687 */       this.g.a(localbsd);
/*  662: 688 */       this.f.a(this.g);
/*  663: 689 */       this.f.h.dimension = paramkp.a();
/*  664: 690 */       this.f.a(new bxd(this));
/*  665:     */     }
/*  666: 693 */     this.f.a(paramkp.a());
/*  667: 694 */     this.f.c.a(paramkp.c());
/*  668:     */   }
/*  669:     */   
/*  670:     */   public void a(jm paramjm)
/*  671:     */   {
/*  672: 699 */     ig.a(paramjm, this, this.f);
/*  673: 700 */     aqo localaqo = new aqo(this.f.f, null, paramjm.d(), paramjm.e(), paramjm.f(), paramjm.g(), paramjm.h());
/*  674: 701 */     localaqo.a(true);
/*  675:     */     
/*  676: 703 */     this.f.h.xVelocity += paramjm.a();
/*  677: 704 */     this.f.h.yVelocity += paramjm.b();
/*  678: 705 */     this.f.h.zVelocity += paramjm.c();
/*  679:     */   }
/*  680:     */   
/*  681:     */   public void a(je paramje)
/*  682:     */   {
/*  683: 710 */     ig.a(paramje, this, this.f);
/*  684: 711 */     cio localcio = this.f.h;
/*  685: 713 */     if ("minecraft:container".equals(paramje.b()))
/*  686:     */     {
/*  687: 714 */       localcio.a(new wa(paramje.c(), paramje.d()));
/*  688: 715 */       localcio.bi.d = paramje.a();
/*  689:     */     }
/*  690: 716 */     else if ("minecraft:villager".equals(paramje.b()))
/*  691:     */     {
/*  692: 717 */       localcio.a(new agn(localcio, paramje.c()));
/*  693: 718 */       localcio.bi.d = paramje.a();
/*  694:     */     }
/*  695:     */     else
/*  696:     */     {
/*  697:     */       Object localObject;
/*  698: 719 */       if ("EntityHorse".equals(paramje.b()))
/*  699:     */       {
/*  700: 720 */         localObject = this.g.a(paramje.e());
/*  701: 721 */         if ((localObject instanceof EntityHorse))
/*  702:     */         {
/*  703: 722 */           localcio.a((EntityHorse)localObject, new aic(paramje.c(), paramje.d()));
/*  704: 723 */           localcio.bi.d = paramje.a();
/*  705:     */         }
/*  706:     */       }
/*  707: 725 */       else if (!paramje.f())
/*  708:     */       {
/*  709: 726 */         localcio.a(new ciq(paramje.b(), paramje.c()));
/*  710: 727 */         localcio.bi.d = paramje.a();
/*  711:     */       }
/*  712:     */       else
/*  713:     */       {
/*  714: 730 */         localObject = new cir(paramje.b(), paramje.c(), paramje.d());
/*  715: 731 */         localcio.a((vq)localObject);
/*  716: 732 */         localcio.bi.d = paramje.a();
/*  717:     */       }
/*  718:     */     }
/*  719:     */   }
/*  720:     */   
/*  721:     */   public void a(jh paramjh)
/*  722:     */   {
/*  723: 738 */     ig.a(paramjh, this, this.f);
/*  724: 739 */     cio localcio = this.f.h;
/*  725: 740 */     if (paramjh.a() == -1)
/*  726:     */     {
/*  727: 741 */       localcio.bg.b(paramjh.c());
/*  728:     */     }
/*  729:     */     else
/*  730:     */     {
/*  731: 743 */       int m = 0;
/*  732:     */       Object localObject;
/*  733: 745 */       if ((this.f.m instanceof byz))
/*  734:     */       {
/*  735: 746 */         localObject = (byz)this.f.m;
/*  736:     */         
/*  737: 748 */         m = ((byz)localObject).a() != CreativeTabs.tabInventory.a() ? 1 : 0;
/*  738:     */       }
/*  739: 751 */       if ((paramjh.a() == 0) && (paramjh.b() >= 36) && (paramjh.b() < 45))
/*  740:     */       {
/*  741: 752 */         localObject = localcio.bh.a(paramjh.b()).d();
/*  742: 753 */         if ((paramjh.c() != null) && (
/*  743: 754 */           (localObject == null) || (((ItemStack)localObject).stackSize < paramjh.c().stackSize))) {
/*  744: 755 */           paramjh.c().c = 5;
/*  745:     */         }
/*  746: 758 */         localcio.bh.a(paramjh.b(), paramjh.c());
/*  747:     */       }
/*  748: 759 */       else if ((paramjh.a() == localcio.bi.d) && ((paramjh.a() != 0) || (m == 0)))
/*  749:     */       {
/*  750: 760 */         localcio.bi.a(paramjh.b(), paramjh.c());
/*  751:     */       }
/*  752:     */     }
/*  753:     */   }
/*  754:     */   
/*  755:     */   public void a(jc paramjc)
/*  756:     */   {
/*  757: 767 */     ig.a(paramjc, this, this.f);
/*  758: 768 */     aib localaib = null;
/*  759: 769 */     cio localcio = this.f.h;
/*  760: 770 */     if (paramjc.a() == 0) {
/*  761: 771 */       localaib = localcio.bh;
/*  762: 772 */     } else if (paramjc.a() == localcio.bi.d) {
/*  763: 773 */       localaib = localcio.bi;
/*  764:     */     }
/*  765: 775 */     if ((localaib != null) && 
/*  766: 776 */       (!paramjc.c())) {
/*  767: 777 */       a(new ly(paramjc.a(), paramjc.b(), true));
/*  768:     */     }
/*  769:     */   }
/*  770:     */   
/*  771:     */   public void a(jf paramjf)
/*  772:     */   {
/*  773: 784 */     ig.a(paramjf, this, this.f);
/*  774: 785 */     cio localcio = this.f.h;
/*  775: 786 */     if (paramjf.a() == 0) {
/*  776: 787 */       localcio.bh.a(paramjf.b());
/*  777: 788 */     } else if (paramjf.a() == localcio.bi.d) {
/*  778: 789 */       localcio.bi.a(paramjf.b());
/*  779:     */     }
/*  780:     */   }
/*  781:     */   
/*  782:     */   public void a(kc paramkc)
/*  783:     */   {
/*  784: 795 */     ig.a(paramkc, this, this.f);
/*  785: 796 */     Object localObject = this.g.s(paramkc.a());
/*  786: 798 */     if (!(localObject instanceof bdj))
/*  787:     */     {
/*  788: 799 */       localObject = new bdj();
/*  789: 800 */       ((bcm)localObject).a(this.g);
/*  790: 801 */       ((bcm)localObject).setPos(paramkc.a());
/*  791:     */     }
/*  792: 804 */     this.f.h.a((bdj)localObject);
/*  793:     */   }
/*  794:     */   
/*  795:     */   public void a(ll paramll)
/*  796:     */   {
/*  797: 809 */     ig.a(paramll, this, this.f);
/*  798: 810 */     int m = 0;
/*  799: 811 */     if (this.f.f.e(paramll.a()))
/*  800:     */     {
/*  801: 812 */       bcm localbcm = this.f.f.s(paramll.a());
/*  802: 813 */       if ((localbcm instanceof bdj))
/*  803:     */       {
/*  804: 814 */         bdj localbdj = (bdj)localbcm;
/*  805: 815 */         if (localbdj.b())
/*  806:     */         {
/*  807: 816 */           System.arraycopy(paramll.b(), 0, localbdj.a, 0, 4);
/*  808: 817 */           localbdj.o_();
/*  809:     */         }
/*  810: 820 */         m = 1;
/*  811:     */       }
/*  812:     */     }
/*  813: 823 */     if ((m == 0) && (this.f.h != null)) {
/*  814: 824 */       this.f.h.a(new hy("Unable to locate sign at " + paramll.a().getX() + ", " + paramll.a().getY() + ", " + paramll.a().getZ()));
/*  815:     */     }
/*  816:     */   }
/*  817:     */   
/*  818:     */   public void a(iu paramiu)
/*  819:     */   {
/*  820: 830 */     ig.a(paramiu, this, this.f);
/*  821: 831 */     if (this.f.f.e(paramiu.a()))
/*  822:     */     {
/*  823: 832 */       bcm localbcm = this.f.f.s(paramiu.a());
/*  824: 833 */       int m = paramiu.b();
/*  825: 835 */       if (((m == 1) && ((localbcm instanceof bdg))) || ((m == 2) && ((localbcm instanceof bct))) || ((m == 3) && ((localbcm instanceof bck))) || ((m == 4) && ((localbcm instanceof bdm))) || ((m == 5) && ((localbcm instanceof bdb))) || ((m == 6) && ((localbcm instanceof bci)))) {
/*  826: 842 */         localbcm.readFromNBT(paramiu.c());
/*  827:     */       }
/*  828:     */     }
/*  829:     */   }
/*  830:     */   
/*  831:     */   public void a(jg paramjg)
/*  832:     */   {
/*  833: 849 */     ig.a(paramjg, this, this.f);
/*  834: 850 */     cio localcio = this.f.h;
/*  835: 851 */     if ((localcio.bi != null) && (localcio.bi.d == paramjg.a())) {
/*  836: 852 */       localcio.bi.b(paramjg.b(), paramjg.c());
/*  837:     */     }
/*  838:     */   }
/*  839:     */   
/*  840:     */   public void a(la paramla)
/*  841:     */   {
/*  842: 858 */     ig.a(paramla, this, this.f);
/*  843: 859 */     Entity localwv = this.g.a(paramla.b());
/*  844: 860 */     if (localwv != null) {
/*  845: 861 */       localwv.c(paramla.c(), paramla.a());
/*  846:     */     }
/*  847:     */   }
/*  848:     */   
/*  849:     */   public void a(jd paramjd)
/*  850:     */   {
/*  851: 867 */     ig.a(paramjd, this, this.f);
/*  852: 868 */     this.f.h.q();
/*  853:     */   }
/*  854:     */   
/*  855:     */   public void a(iv paramiv)
/*  856:     */   {
/*  857: 873 */     ig.a(paramiv, this, this.f);
/*  858: 874 */     this.f.f.c(paramiv.a(), paramiv.d(), paramiv.b(), paramiv.c());
/*  859:     */   }
/*  860:     */   
/*  861:     */   public void a(it paramit)
/*  862:     */   {
/*  863: 879 */     ig.a(paramit, this, this.f);
/*  864: 880 */     this.f.f.c(paramit.a(), paramit.b(), paramit.c());
/*  865:     */   }
/*  866:     */   
/*  867:     */   public void a(js paramjs)
/*  868:     */   {
/*  869: 885 */     ig.a(paramjs, this, this.f);
/*  870: 886 */     for (int m = 0; m < paramjs.a(); m++)
/*  871:     */     {
/*  872: 887 */       int n = paramjs.a(m);
/*  873: 888 */       int i1 = paramjs.b(m);
/*  874:     */       
/*  875: 890 */       this.g.b(n, i1, true);
/*  876:     */       
/*  877: 892 */       this.g.a(n << 4, 0, i1 << 4, (n << 4) + 15, 256, (i1 << 4) + 15);
/*  878:     */       
/*  879: 894 */       Chunk localbfh = this.g.getChunk(n, i1);
/*  880:     */       
/*  881: 896 */       localbfh.a(paramjs.c(m), paramjs.d(m), true);
/*  882: 897 */       this.g.b(n << 4, 0, i1 << 4, (n << 4) + 15, 256, (i1 << 4) + 15);
/*  883: 899 */       if (!(this.g.t instanceof bgg)) {
/*  884: 900 */         localbfh.l();
/*  885:     */       }
/*  886:     */     }
/*  887:     */   }
/*  888:     */   
/*  889:     */   public void a(jo paramjo)
/*  890:     */   {
/*  891: 907 */     ig.a(paramjo, this, this.f);
/*  892: 908 */     cio localcio = this.f.h;
/*  893: 909 */     int m = paramjo.a();
/*  894: 910 */     float f1 = paramjo.b();
/*  895: 911 */     int n = MathUtils.floor(f1 + 0.5F);
/*  896: 912 */     if ((m >= 0) && (m < jo.a.length) && 
/*  897: 913 */       (jo.a[m] != null)) {
/*  898: 914 */       localcio.b(new hz(jo.a[m], new Object[0]));
/*  899:     */     }
/*  900: 917 */     if (m == 1)
/*  901:     */     {
/*  902: 918 */       this.g.getWorldInfo().b(true);
/*  903: 919 */       this.g.k(0.0F);
/*  904:     */     }
/*  905: 920 */     else if (m == 2)
/*  906:     */     {
/*  907: 921 */       this.g.getWorldInfo().b(false);
/*  908: 922 */       this.g.k(1.0F);
/*  909:     */     }
/*  910: 923 */     else if (m == 3)
/*  911:     */     {
/*  912: 924 */       this.f.c.a(EnumGameType.a(n));
/*  913:     */     }
/*  914: 925 */     else if (m == 4)
/*  915:     */     {
/*  916: 926 */       this.f.a(new bxs());
/*  917:     */     }
/*  918: 927 */     else if (m == 5)
/*  919:     */     {
/*  920: 928 */       bto localbto = this.f.t;
/*  921: 929 */       if (f1 == 0.0F) {
/*  922: 930 */         this.f.a(new bwm());
/*  923: 931 */       } else if (f1 == 101.0F) {
/*  924: 932 */         this.f.q.d().a(new hz("demo.help.movement", new Object[] { bto.c(localbto.U.i()), bto.c(localbto.V.i()), bto.c(localbto.W.i()), bto.c(localbto.X.i()) }));
/*  925: 933 */       } else if (f1 == 102.0F) {
/*  926: 934 */         this.f.q.d().a(new hz("demo.help.jump", new Object[] { bto.c(localbto.Y.i()) }));
/*  927: 935 */       } else if (f1 == 103.0F) {
/*  928: 936 */         this.f.q.d().a(new hz("demo.help.inventory", new Object[] { bto.c(localbto.aa.i()) }));
/*  929:     */       }
/*  930:     */     }
/*  931: 938 */     else if (m == 6)
/*  932:     */     {
/*  933: 939 */       this.g.a(localcio.xPos, localcio.yPos + localcio.aR(), localcio.zPos, "random.successful_hit", 0.18F, 0.45F, false);
/*  934:     */     }
/*  935: 940 */     else if (m == 7)
/*  936:     */     {
/*  937: 941 */       this.g.k(f1);
/*  938:     */     }
/*  939: 942 */     else if (m == 8)
/*  940:     */     {
/*  941: 943 */       this.g.i(f1);
/*  942:     */     }
/*  943: 944 */     else if (m == 10)
/*  944:     */     {
/*  945: 945 */       this.g.a(EnumParticleEffect.P, localcio.xPos, localcio.yPos, localcio.zPos, 0.0D, 0.0D, 0.0D, new int[0]);
/*  946: 946 */       this.g.a(localcio.xPos, localcio.yPos, localcio.zPos, "mob.guardian.curse", 1.0F, 1.0F, false);
/*  947:     */     }
/*  948:     */   }
/*  949:     */   
/*  950:     */   public void a(jx paramjx)
/*  951:     */   {
/*  952: 952 */     ig.a(paramjx, this, this.f);
/*  953: 953 */     MapInfo localbqe = ItemFilledMap.a(paramjx.a(), this.f.f);
/*  954: 954 */     paramjx.pushInfo(localbqe);
/*  955: 955 */     this.f.o.k().a(localbqe);
/*  956:     */   }
/*  957:     */   
/*  958:     */   public void a(jt paramjt)
/*  959:     */   {
/*  960: 960 */     ig.a(paramjt, this, this.f);
/*  961: 961 */     if (paramjt.a()) {
/*  962: 962 */       this.f.f.a(paramjt.b(), paramjt.d(), paramjt.c());
/*  963:     */     } else {
/*  964: 964 */       this.f.f.playLevelEvent(paramjt.b(), paramjt.d(), paramjt.c());
/*  965:     */     }
/*  966:     */   }
/*  967:     */   
/*  968:     */   public void a(is paramis)
/*  969:     */   {
/*  970: 970 */     ig.a(paramis, this, this.f);
/*  971: 971 */     int m = 0;
/*  972: 973 */     for (Map.Entry localEntry : paramis.a().entrySet())
/*  973:     */     {
/*  974: 974 */       tq localtq = (tq)localEntry.getKey();
/*  975: 975 */       int n = ((Integer)localEntry.getValue()).intValue();
/*  976: 977 */       if ((localtq.d()) && (n > 0))
/*  977:     */       {
/*  978: 978 */         if ((this.j) && (this.f.h.x().a(localtq) == 0))
/*  979:     */         {
/*  980: 979 */           tk localtk = (tk)localtq;
/*  981: 980 */           this.f.p.a(localtk);
/*  982: 981 */           this.f.W().a(new czp(localtk), 0L);
/*  983: 983 */           if (localtq == AchievementList.f)
/*  984:     */           {
/*  985: 984 */             this.f.t.H = false;
/*  986: 985 */             this.f.t.b();
/*  987:     */           }
/*  988:     */         }
/*  989: 988 */         m = 1;
/*  990:     */       }
/*  991: 991 */       this.f.h.x().a(this.f.h, localtq, n);
/*  992:     */     }
/*  993: 994 */     if ((!this.j) && (m == 0) && (this.f.t.H)) {
/*  994: 995 */       this.f.p.b(AchievementList.f);
/*  995:     */     }
/*  996: 998 */     this.j = true;
/*  997:1000 */     if ((this.f.m instanceof byd)) {
/*  998:1001 */       ((byd)this.f.m).a();
/*  999:     */     }
/* 1000:     */   }
/* 1001:     */   
/* 1002:     */   public void a(lr paramlr)
/* 1003:     */   {
/* 1004:1007 */     ig.a(paramlr, this, this.f);
/* 1005:1008 */     Entity localwv = this.g.a(paramlr.b());
/* 1006:1009 */     if (!(localwv instanceof EntityLiving)) {
/* 1007:1010 */       return;
/* 1008:     */     }
/* 1009:1013 */     PotionEffect localwq = new PotionEffect(paramlr.c(), paramlr.e(), paramlr.d(), false, paramlr.f());
/* 1010:1014 */     localwq.b(paramlr.a());
/* 1011:1015 */     ((EntityLiving)localwv).c(localwq);
/* 1012:     */   }
/* 1013:     */   
/* 1014:     */   public void a(ke paramke)
/* 1015:     */   {
/* 1016:1020 */     ig.a(paramke, this, this.f);
/* 1017:1021 */     Entity localwv1 = this.g.a(paramke.c);
/* 1018:1022 */     EntityLiving localxm = (localwv1 instanceof EntityLiving) ? (EntityLiving)localwv1 : null;
/* 1019:1024 */     if (paramke.a == kg.b)
/* 1020:     */     {
/* 1021:1025 */       long l = 1000 * paramke.d / 20;
/* 1022:1026 */       czq localczq = new czq(this.f.h, localxm);
/* 1023:1027 */       this.f.W().a(localczq, 0L - l, 0L);
/* 1024:     */     }
/* 1025:1028 */     else if (paramke.a == kg.c)
/* 1026:     */     {
/* 1027:1029 */       Entity localwv2 = this.g.a(paramke.b);
/* 1028:1030 */       if ((localwv2 instanceof EntityPlayer))
/* 1029:     */       {
/* 1030:1031 */         czr localczr = new czr((EntityPlayer)localwv2, localxm);
/* 1031:1032 */         localczr.a(paramke.e);
/* 1032:1033 */         this.f.W().a(localczr, 0L);
/* 1033:     */       }
/* 1034:     */     }
/* 1035:     */   }
/* 1036:     */   
/* 1037:     */   public void a(ix paramix)
/* 1038:     */   {
/* 1039:1040 */     ig.a(paramix, this, this.f);
/* 1040:1041 */     this.f.f.getWorldInfo().setDifficulty(paramix.b());
/* 1041:1042 */     this.f.f.getWorldInfo().e(paramix.a());
/* 1042:     */   }
/* 1043:     */   
/* 1044:     */   public void a(ku paramku)
/* 1045:     */   {
/* 1046:1047 */     ig.a(paramku, this, this.f);
/* 1047:1048 */     Entity localwv = paramku.a(this.g);
/* 1048:1049 */     if (localwv != null) {
/* 1049:1050 */       this.f.a(localwv);
/* 1050:     */     }
/* 1051:     */   }
/* 1052:     */   
/* 1053:     */   public void a(kr paramkr)
/* 1054:     */   {
/* 1055:1056 */     ig.a(paramkr, this, this.f);
/* 1056:1057 */     paramkr.a(this.g.af());
/* 1057:     */   }
/* 1058:     */   
/* 1059:     */   public void a(lj paramlj)
/* 1060:     */   {
/* 1061:1062 */     ig.a(paramlj, this, this.f);
/* 1062:1063 */     lk locallk = paramlj.a();
/* 1063:1064 */     String localObject1 = null;
/* 1064:1065 */     String localObject2 = null;
/* 1065:1066 */     String str = paramlj.b() != null ? paramlj.b().d() : "";
/* 1066:1067 */     switch (cek.a[locallk.ordinal()])
/* 1067:     */     {
/* 1068:     */     case 1: 
/* 1069:1069 */       localObject1 = str;
/* 1070:1070 */       break;
/* 1071:     */     case 2: 
/* 1072:1072 */       localObject2 = str;
/* 1073:1073 */       break;
/* 1074:     */     case 3: 
/* 1075:1075 */       this.f.q.a("", "", -1, -1, -1);
/* 1076:1076 */       this.f.q.a();
/* 1077:1077 */       return;
/* 1078:     */     }
/* 1079:1081 */     this.f.q.a(localObject1, localObject2, paramlj.c(), paramlj.d(), paramlj.e());
/* 1080:     */   }
/* 1081:     */   
/* 1082:     */   public void a(jn paramjn)
/* 1083:     */   {
/* 1084:1086 */     if (!this.c.c()) {
/* 1085:1087 */       this.c.a(paramjn.a());
/* 1086:     */     }
/* 1087:     */   }
/* 1088:     */   
/* 1089:     */   public void a(lm paramlm)
/* 1090:     */   {
/* 1091:1093 */     this.f.q.h().b(paramlm.a().d().length() == 0 ? null : paramlm.a());
/* 1092:1094 */     this.f.q.h().a(paramlm.b().d().length() == 0 ? null : paramlm.b());
/* 1093:     */   }
/* 1094:     */   
/* 1095:     */   public void a(kn paramkn)
/* 1096:     */   {
/* 1097:1099 */     ig.a(paramkn, this, this.f);
/* 1098:1100 */     Entity localwv = this.g.a(paramkn.a());
/* 1099:1101 */     if ((localwv instanceof EntityLiving)) {
/* 1100:1102 */       ((EntityLiving)localwv).l(paramkn.b());
/* 1101:     */     }
/* 1102:     */   }
/* 1103:     */   
/* 1104:     */   public void a(kh paramkh)
/* 1105:     */   {
/* 1106:1108 */     ig.a(paramkh, this, this.f);
/* 1107:1110 */     for (kk localkk : paramkh.a()) {
/* 1108:1111 */       if (paramkh.b() == kj.e)
/* 1109:     */       {
/* 1110:1112 */         this.i.remove(localkk.a().getId());
/* 1111:     */       }
/* 1112:     */       else
/* 1113:     */       {
/* 1114:1114 */         ces localces = this.i.get(localkk.a().getId());
/* 1115:1116 */         if (paramkh.b() == kj.a)
/* 1116:     */         {
/* 1117:1117 */           localces = new ces(localkk);
/* 1118:1118 */           this.i.put(localces.a().getId(), localces);
/* 1119:     */         }
/* 1120:1121 */         if (localces != null) {
/* 1121:1122 */           switch (cek.b[paramkh.b().ordinal()])
/* 1122:     */           {
/* 1123:     */           case 1: 
/* 1124:1124 */             localces.a(localkk.c());
/* 1125:1125 */             localces.a(localkk.b());
/* 1126:1126 */             break;
/* 1127:     */           case 2: 
/* 1128:1128 */             localces.a(localkk.c());
/* 1129:1129 */             break;
/* 1130:     */           case 3: 
/* 1131:1131 */             localces.a(localkk.b());
/* 1132:1132 */             break;
/* 1133:     */           case 4: 
/* 1134:1134 */             localces.a(localkk.d());
/* 1135:     */           }
/* 1136:     */         }
/* 1137:     */       }
/* 1138:     */     }
/* 1139:     */   }
/* 1140:     */   
/* 1141:     */   public void a(jp paramjp)
/* 1142:     */   {
/* 1143:1144 */     a(new mf(paramjp.a()));
/* 1144:     */   }
/* 1145:     */   
/* 1146:     */   public void a(kd paramkd)
/* 1147:     */   {
/* 1148:1149 */     ig.a(paramkd, this, this.f);
/* 1149:1150 */     cio localcio = this.f.h;
/* 1150:1151 */     localcio.by.b = paramkd.b();
/* 1151:1152 */     localcio.by.d = paramkd.d();
/* 1152:1153 */     localcio.by.a = paramkd.a();
/* 1153:1154 */     localcio.by.c = paramkd.c();
/* 1154:1155 */     localcio.by.a(paramkd.e());
/* 1155:1156 */     localcio.by.b(paramkd.f());
/* 1156:     */   }
/* 1157:     */   
/* 1158:     */   public void a(iy paramiy)
/* 1159:     */   {
/* 1160:1161 */     ig.a(paramiy, this, this.f);
/* 1161:1162 */     String[] arrayOfString = paramiy.a();
/* 1162:1164 */     if ((this.f.m instanceof bvx))
/* 1163:     */     {
/* 1164:1165 */       bvx localbvx = (bvx)this.f.m;
/* 1165:     */       
/* 1166:1167 */       localbvx.a(arrayOfString);
/* 1167:     */     }
/* 1168:     */   }
/* 1169:     */   
/* 1170:     */   public void a(jv paramjv)
/* 1171:     */   {
/* 1172:1173 */     ig.a(paramjv, this, this.f);
/* 1173:1174 */     this.f.f.a(paramjv.b(), paramjv.c(), paramjv.d(), paramjv.a(), paramjv.e(), paramjv.f(), false);
/* 1174:     */   }
/* 1175:     */   
/* 1176:     */   public void a(ko paramko)
/* 1177:     */   {
/* 1178:1179 */     String str1 = paramko.a();
/* 1179:1180 */     String str2 = paramko.b();
/* 1180:1182 */     if (str1.startsWith("level://"))
/* 1181:     */     {
/* 1182:1183 */       String str3 = str1.substring("level://".length());
/* 1183:1184 */       File localFile1 = new File(this.f.v, "saves");
/* 1184:1185 */       File localFile2 = new File(localFile1, str3);
/* 1185:1186 */       if (localFile2.isFile())
/* 1186:     */       {
/* 1187:1187 */         this.c.a(new mq(str2, mr.d));
/* 1188:1188 */         Futures.addCallback(this.f.P().a(localFile2), new cef(this, str2));
/* 1189:     */       }
/* 1190:     */       else
/* 1191:     */       {
/* 1192:1200 */         this.c.a(new mq(str2, mr.c));
/* 1193:     */       }
/* 1194:1202 */       return;
/* 1195:     */     }
/* 1196:1205 */     if ((this.f.C() != null) && (this.f.C().b() == cex.a))
/* 1197:     */     {
/* 1198:1206 */       this.c.a(new mq(str2, mr.d));
/* 1199:1207 */       Futures.addCallback(this.f.P().a(str1, str2), new ceg(this, str2));
/* 1200:     */     }
/* 1201:1218 */     else if ((this.f.C() == null) || (this.f.C().b() == cex.c))
/* 1202:     */     {
/* 1203:1219 */       this.f.a(new ceh(this, str2, str1));
/* 1204:     */     }
/* 1205:     */     else
/* 1206:     */     {
/* 1207:1259 */       this.c.a(new mq(str2, mr.b));
/* 1208:     */     }
/* 1209:     */   }
/* 1210:     */   
/* 1211:     */   public void a(jl paramjl)
/* 1212:     */   {
/* 1213:1265 */     ig.a(paramjl, this, this.f);
/* 1214:1266 */     Entity localwv = paramjl.a(this.g);
/* 1215:1267 */     if (localwv != null) {
/* 1216:1268 */       localwv.g(paramjl.a());
/* 1217:     */     }
/* 1218:     */   }
/* 1219:     */   
/* 1220:     */   public void a(ji paramji)
/* 1221:     */   {
/* 1222:1274 */     ig.a(paramji, this, this.f);
/* 1223:     */     Object localObject1;
/* 1224:1275 */     if ("MC|TrList".equals(paramji.a()))
/* 1225:     */     {
/* 1226:1276 */       localObject1 = paramji.b();
/* 1227:     */       try
/* 1228:     */       {
/* 1229:1278 */         int m = ((ByteBufWrapper)localObject1).readInt();
/* 1230:1279 */         bxf localbxf = this.f.m;
/* 1231:1280 */         if ((localbxf != null) && ((localbxf instanceof bzk)) && (m == this.f.h.bi.d))
/* 1232:     */         {
/* 1233:1281 */           aqb localaqb = ((bzk)localbxf).a();
/* 1234:1282 */           aqd localaqd = aqd.b((ByteBufWrapper)localObject1);
/* 1235:1283 */           localaqb.a(localaqd);
/* 1236:     */         }
/* 1237:     */       }
/* 1238:     */       catch (IOException localIOException)
/* 1239:     */       {
/* 1240:1286 */         b.error("Couldn't load trade info", localIOException);
/* 1241:     */       }
/* 1242:     */       finally
/* 1243:     */       {
/* 1244:1288 */         ((ByteBufWrapper)localObject1).release();
/* 1245:     */       }
/* 1246:     */     }
/* 1247:1290 */     else if ("MC|Brand".equals(paramji.a()))
/* 1248:     */     {
/* 1249:1291 */       this.f.h.f(paramji.b().c(32767));
/* 1250:     */     }
/* 1251:1292 */     else if ("MC|BOpen".equals(paramji.a()))
/* 1252:     */     {
/* 1253:1293 */       localObject1 = this.f.h.bY();
/* 1254:1294 */       if ((localObject1 != null) && (((ItemStack)localObject1).getItem() == ItemList.bN)) {
/* 1255:1295 */         this.f.a(new bys(this.f.h, (ItemStack)localObject1, false));
/* 1256:     */       }
/* 1257:     */     }
/* 1258:     */   }
/* 1259:     */   
/* 1260:     */   public void a(ld paramld)
/* 1261:     */   {
/* 1262:1302 */     ig.a(paramld, this, this.f);
/* 1263:1303 */     bsd localbsd = this.g.Z();
/* 1264:     */     bry localbry;
/* 1265:1305 */     if (paramld.c() == 0)
/* 1266:     */     {
/* 1267:1306 */       localbry = localbsd.a(paramld.a(), bsk.b);
/* 1268:1307 */       localbry.a(paramld.b());
/* 1269:1308 */       localbry.a(paramld.d());
/* 1270:     */     }
/* 1271:     */     else
/* 1272:     */     {
/* 1273:1310 */       localbry = localbsd.b(paramld.a());
/* 1274:1312 */       if (paramld.c() == 1)
/* 1275:     */       {
/* 1276:1313 */         localbsd.k(localbry);
/* 1277:     */       }
/* 1278:1314 */       else if (paramld.c() == 2)
/* 1279:     */       {
/* 1280:1315 */         localbry.a(paramld.b());
/* 1281:1316 */         localbry.a(paramld.d());
/* 1282:     */       }
/* 1283:     */     }
/* 1284:     */   }
/* 1285:     */   
/* 1286:     */   public void a(lf paramlf)
/* 1287:     */   {
/* 1288:1323 */     ig.a(paramlf, this, this.f);
/* 1289:1324 */     bsd localbsd = this.g.Z();
/* 1290:1325 */     bry localbry = localbsd.b(paramlf.b());
/* 1291:1327 */     if (paramlf.d() == lg.a)
/* 1292:     */     {
/* 1293:1328 */       bsa localbsa = localbsd.c(paramlf.a(), localbry);
/* 1294:     */       
/* 1295:1330 */       localbsa.c(paramlf.c());
/* 1296:     */     }
/* 1297:1331 */     else if (paramlf.d() == lg.b)
/* 1298:     */     {
/* 1299:1332 */       if (vb.b(paramlf.b())) {
/* 1300:1333 */         localbsd.d(paramlf.a(), null);
/* 1301:1335 */       } else if (localbry != null) {
/* 1302:1336 */         localbsd.d(paramlf.a(), localbry);
/* 1303:     */       }
/* 1304:     */     }
/* 1305:     */   }
/* 1306:     */   
/* 1307:     */   public void a(kw paramkw)
/* 1308:     */   {
/* 1309:1344 */     ig.a(paramkw, this, this.f);
/* 1310:1345 */     bsd localbsd = this.g.Z();
/* 1311:1347 */     if (paramkw.b().length() == 0)
/* 1312:     */     {
/* 1313:1348 */       localbsd.a(paramkw.a(), null);
/* 1314:     */     }
/* 1315:     */     else
/* 1316:     */     {
/* 1317:1350 */       bry localbry = localbsd.b(paramkw.b());
/* 1318:1351 */       localbsd.a(paramkw.a(), localbry);
/* 1319:     */     }
/* 1320:     */   }
/* 1321:     */   
/* 1322:     */   public void a(le paramle)
/* 1323:     */   {
/* 1324:1357 */     ig.a(paramle, this, this.f);
/* 1325:1358 */     bsd localbsd = this.g.Z();
/* 1326:     */     brz localbrz;
/* 1327:1361 */     if (paramle.f() == 0) {
/* 1328:1362 */       localbrz = localbsd.e(paramle.a());
/* 1329:     */     } else {
/* 1330:1364 */       localbrz = localbsd.d(paramle.a());
/* 1331:     */     }
/* 1332:     */     Object localObject;
/* 1333:1367 */     if ((paramle.f() == 0) || (paramle.f() == 2))
/* 1334:     */     {
/* 1335:1368 */       localbrz.a(paramle.b());
/* 1336:1369 */       localbrz.b(paramle.c());
/* 1337:1370 */       localbrz.c(paramle.d());
/* 1338:1371 */       localbrz.a(net.minecraft.src.a.a(paramle.h()));
/* 1339:1372 */       localbrz.a(paramle.g());
/* 1340:1373 */       localObject = bsg.a(paramle.i());
/* 1341:1374 */       if (localObject != null) {
/* 1342:1375 */         localbrz.a((bsg)localObject);
/* 1343:     */       }
/* 1344:     */     }
/* 1345:1379 */     if ((paramle.f() == 0) || (paramle.f() == 3)) {
/* 1346:1380 */       for (localObject = paramle.e().iterator(); ((Iterator)localObject).hasNext();)
/* 1347:     */       {
/* 1348:1380 */         String str = (String)((Iterator)localObject).next();
/* 1349:1381 */         localbsd.a(str, paramle.a());
/* 1350:     */       }
/* 1351:     */     }
/* 1352:     */     String str;
/* 1353:1385 */     if (paramle.f() == 4) {
/* 1354:1386 */       for (localObject = paramle.e().iterator(); ((Iterator)localObject).hasNext();)
/* 1355:     */       {
/* 1356:1386 */         str = (String)((Iterator)localObject).next();
/* 1357:1387 */         localbsd.a(str, localbrz);
/* 1358:     */       }
/* 1359:     */     }
/* 1360:1391 */     if (paramle.f() == 1) {
/* 1361:1392 */       localbsd.d(localbrz);
/* 1362:     */     }
/* 1363:     */   }
/* 1364:     */   
/* 1365:     */   public void a(ju paramju)
/* 1366:     */   {
/* 1367:1398 */     ig.a(paramju, this, this.f);
/* 1368:1399 */     if (paramju.j() == 0)
/* 1369:     */     {
/* 1370:1400 */       double d1 = paramju.i() * paramju.f();
/* 1371:1401 */       double d3 = paramju.i() * paramju.g();
/* 1372:1402 */       double d5 = paramju.i() * paramju.h();
/* 1373:     */       try
/* 1374:     */       {
/* 1375:1404 */         this.g.a(paramju.a(), paramju.b(), paramju.c(), paramju.d(), paramju.e(), d1, d3, d5, paramju.k());
/* 1376:     */       }
/* 1377:     */       catch (Throwable localThrowable1)
/* 1378:     */       {
/* 1379:1406 */         b.warn("Could not spawn particle effect " + paramju.a());
/* 1380:     */       }
/* 1381:     */     }
/* 1382:     */     else
/* 1383:     */     {
/* 1384:1409 */       for (int m = 0; m < paramju.j(); m++)
/* 1385:     */       {
/* 1386:1410 */         double d2 = this.k.nextGaussian() * paramju.f();
/* 1387:1411 */         double d4 = this.k.nextGaussian() * paramju.g();
/* 1388:1412 */         double d6 = this.k.nextGaussian() * paramju.h();
/* 1389:1413 */         double d7 = this.k.nextGaussian() * paramju.i();
/* 1390:1414 */         double d8 = this.k.nextGaussian() * paramju.i();
/* 1391:1415 */         double d9 = this.k.nextGaussian() * paramju.i();
/* 1392:     */         try
/* 1393:     */         {
/* 1394:1417 */           this.g.a(paramju.a(), paramju.b(), paramju.c() + d2, paramju.d() + d4, paramju.e() + d6, d7, d8, d9, paramju.k());
/* 1395:     */         }
/* 1396:     */         catch (Throwable localThrowable2)
/* 1397:     */         {
/* 1398:1419 */           b.warn("Could not spawn particle effect " + paramju.a());
/* 1399:1420 */           return;
/* 1400:     */         }
/* 1401:     */       }
/* 1402:     */     }
/* 1403:     */   }
/* 1404:     */   
/* 1405:     */   public void a(lp paramlp)
/* 1406:     */   {
/* 1407:1428 */     ig.a(paramlp, this, this.f);
/* 1408:1429 */     Entity localwv = this.g.a(paramlp.a());
/* 1409:1430 */     if (localwv == null) {
/* 1410:1431 */       return;
/* 1411:     */     }
/* 1412:1433 */     if (!(localwv instanceof EntityLiving)) {
/* 1413:1434 */       throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + localwv + ")");
/* 1414:     */     }
/* 1415:1437 */     yc localyc = ((EntityLiving)localwv).bx();
/* 1428:     */     xz localxz;
/* 1416:1438 */     for (lq locallq : paramlp.b())
/* 1417:     */     {
/* 1418:1439 */       localxz = localyc.a(locallq.a());
/* 1419:1441 */       if (localxz == null) {
/* 1420:1442 */         localxz = localyc.b(new yg(null, locallq.a(), 0.0D, 2.225073858507201E-308D, 1.7976931348623157E+308D));
/* 1421:     */       }
/* 1422:1445 */       localxz.a(locallq.b());
/* 1423:1446 */       localxz.d();
/* 1424:1448 */       for (ya localya : locallq.c()) {
/* 1425:1449 */         localxz.b(localya);
/* 1426:     */       }
/* 1427:     */     }
/* 1429:     */   }
/* 1430:     */   
/* 1431:     */   public gr a()
/* 1432:     */   {
/* 1433:1456 */     return this.c;
/* 1434:     */   }
/* 1435:     */   
/* 1436:     */   public Collection<ces> d()
/* 1437:     */   {
/* 1438:1460 */     return this.i.values();
/* 1439:     */   }
/* 1440:     */   
/* 1441:     */   public ces a(UUID paramUUID)
/* 1442:     */   {
/* 1443:1464 */     return this.i.get(paramUUID);
/* 1444:     */   }
/* 1445:     */   
/* 1446:     */   public ces a(String paramString)
/* 1447:     */   {
/* 1448:1469 */     for (ces localces : this.i.values()) {
/* 1449:1470 */       if (localces.a().getName().equals(paramString)) {
/* 1450:1471 */         return localces;
/* 1451:     */       }
/* 1452:     */     }
/* 1453:1475 */     return null;
/* 1454:     */   }
/* 1455:     */   
/* 1456:     */   public GameProfile e()
/* 1457:     */   {
/* 1458:1479 */     return this.d;
/* 1459:     */   }
				  static gr a(cee paramcee) {return paramcee.c;}
				  static bsu a(cee paramcee, bsu parambsu) {return paramcee.f=parambsu;}
				  static bsu b(cee paramcee) {return paramcee.f;}
/* 1460:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cee
 * JD-Core Version:    0.7.0.1
 */
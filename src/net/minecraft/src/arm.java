package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import com.google.common.collect.Sets;
/*   4:    */ import java.awt.Color;
/*   5:    */ import java.util.Collections;
/*   6:    */ import java.util.List;
/*   7:    */ import java.util.Map;
/*   8:    */ import java.util.Random;
/*   9:    */ import java.util.Set;
/*  10:    */ import org.apache.logging.log4j.LogManager;
/*  11:    */ import org.apache.logging.log4j.Logger;
/*  12:    */ 
/*  13:    */ public abstract class arm
/*  14:    */ {
/*  15: 34 */   private static final Logger aD = LogManager.getLogger();
/*  16: 59 */   protected static final aro a = new aro(0.1F, 0.2F);
/*  17: 60 */   protected static final aro b = new aro(-0.5F, 0.0F);
/*  18: 61 */   protected static final aro c = new aro(-1.0F, 0.1F);
/*  19: 62 */   protected static final aro d = new aro(-1.8F, 0.1F);
/*  20: 63 */   protected static final aro e = new aro(0.125F, 0.05F);
/*  21: 64 */   protected static final aro f = new aro(0.2F, 0.2F);
/*  22: 65 */   protected static final aro g = new aro(0.45F, 0.3F);
/*  23: 66 */   protected static final aro h = new aro(1.5F, 0.025F);
/*  24: 67 */   protected static final aro i = new aro(1.0F, 0.5F);
/*  25: 68 */   protected static final aro j = new aro(0.0F, 0.025F);
/*  26: 69 */   protected static final aro k = new aro(0.1F, 0.8F);
/*  27: 70 */   protected static final aro l = new aro(0.2F, 0.3F);
/*  28: 71 */   protected static final aro m = new aro(-0.2F, 0.1F);
/*  29: 73 */   private static final arm[] aE = new arm[256];
/*  30: 74 */   public static final Set n = Sets.newHashSet();
/*  31: 75 */   public static final Map o = Maps.newHashMap();
/*  32: 77 */   public static final arm p = new asm(0).b(112).a("Ocean").a(c);
/*  33: 78 */   public static final arm q = new asn(1).b(9286496).a("Plains");
/*  34: 79 */   public static final arm r = new asa(2).b(16421912).a("Desert").b().a(2.0F, 0.0F).a(e);
/*  35: 81 */   public static final arm s = new asb(3, false).b(6316128).a("Extreme Hills").a(i).a(0.2F, 0.3F);
/*  36: 82 */   public static final arm t = new asd(4, 0).b(353825).a("Forest");
/*  37: 83 */   public static final arm u = new asu(5, 0).b(747097).a("Taiga").a(5159473).a(0.25F, 0.8F).a(f);
/*  38: 85 */   public static final arm v = new ast(6).b(522674).a("Swampland").a(9154376).a(m).a(0.8F, 0.9F);
/*  39: 86 */   public static final arm w = new asp(7).b(255).a("River").a(b);
/*  40: 88 */   public static final arm x = new asg(8).b(16711680).a("Hell").b().a(2.0F, 0.0F);
/*  41: 89 */   public static final arm y = new asv(9).b(8421631).a("The End").b();
/*  42: 91 */   public static final arm z = new asm(10).b(9474208).a("FrozenOcean").c().a(c).a(0.0F, 0.5F);
/*  43: 92 */   public static final arm A = new asp(11).b(10526975).a("FrozenRiver").c().a(b).a(0.0F, 0.5F);
/*  44: 93 */   public static final arm B = new ash(12, false).b(16777215).a("Ice Plains").c().a(0.0F, 0.5F).a(e);
/*  45: 94 */   public static final arm C = new ash(13, false).b(10526880).a("Ice Mountains").c().a(g).a(0.0F, 0.5F);
/*  46: 96 */   public static final arm D = new ask(14).b(16711935).a("MushroomIsland").a(0.9F, 1.0F).a(l);
/*  47: 97 */   public static final arm E = new ask(15).b(10486015).a("MushroomIslandShore").a(0.9F, 1.0F).a(j);
/*  48: 99 */   public static final arm F = new arl(16).b(16440917).a("Beach").a(0.8F, 0.4F).a(j);
/*  49:100 */   public static final arm G = new asa(17).b(13786898).a("DesertHills").b().a(2.0F, 0.0F).a(g);
/*  50:101 */   public static final arm H = new asd(18, 0).b(2250012).a("ForestHills").a(g);
/*  51:102 */   public static final arm I = new asu(19, 0).b(1456435).a("TaigaHills").a(5159473).a(0.25F, 0.8F).a(g);
/*  52:103 */   public static final arm J = new asb(20, true).b(7501978).a("Extreme Hills Edge").a(i.a()).a(0.2F, 0.3F);
/*  53:105 */   public static final arm K = new asi(21, false).b(5470985).a("Jungle").a(5470985).a(0.95F, 0.9F);
/*  54:106 */   public static final arm L = new asi(22, false).b(2900485).a("JungleHills").a(5470985).a(0.95F, 0.9F).a(g);
/*  55:107 */   public static final arm M = new asi(23, true).b(6458135).a("JungleEdge").a(5470985).a(0.95F, 0.8F);
/*  56:109 */   public static final arm N = new asm(24).b(48).a("Deep Ocean").a(d);
/*  57:110 */   public static final arm O = new ass(25).b(10658436).a("Stone Beach").a(0.2F, 0.3F).a(k);
/*  58:111 */   public static final arm P = new arl(26).b(16445632).a("Cold Beach").a(0.05F, 0.3F).a(j).c();
/*  59:113 */   public static final arm Q = new asd(27, 2).a("Birch Forest").b(3175492);
/*  60:114 */   public static final arm R = new asd(28, 2).a("Birch Forest Hills").b(2055986).a(g);
/*  61:115 */   public static final arm S = new asd(29, 3).b(4215066).a("Roofed Forest");
/*  62:117 */   public static final arm T = new asu(30, 0).b(3233098).a("Cold Taiga").a(5159473).c().a(-0.5F, 0.4F).a(f).c(16777215);
/*  63:118 */   public static final arm U = new asu(31, 0).b(2375478).a("Cold Taiga Hills").a(5159473).c().a(-0.5F, 0.4F).a(g).c(16777215);
/*  64:119 */   public static final arm V = new asu(32, 1).b(5858897).a("Mega Taiga").a(5159473).a(0.3F, 0.8F).a(f);
/*  65:120 */   public static final arm W = new asu(33, 1).b(4542270).a("Mega Taiga Hills").a(5159473).a(0.3F, 0.8F).a(g);
/*  66:122 */   public static final arm X = new asb(34, true).b(5271632).a("Extreme Hills+").a(i).a(0.2F, 0.3F);
/*  67:124 */   public static final arm Y = new asq(35).b(12431967).a("Savanna").a(1.2F, 0.0F).b().a(e);
/*  68:125 */   public static final arm Z = new asq(36).b(10984804).a("Savanna Plateau").a(1.0F, 0.0F).b().a(h);
/*  69:127 */   public static final arm aa = new asj(37, false, false).b(14238997).a("Mesa");
/*  70:128 */   public static final arm ab = new asj(38, false, true).b(11573093).a("Mesa Plateau F").a(h);
/*  71:129 */   public static final arm ac = new asj(39, false, false).b(13274213).a("Mesa Plateau").a(h);
/*  72:131 */   public static final arm ad = p;
/*  73:    */   
/*  74:    */   static
/*  75:    */   {
/*  76:137 */     q.k();
/*  77:138 */     r.k();
/*  78:139 */     t.k();
/*  79:140 */     u.k();
/*  80:141 */     v.k();
/*  81:142 */     B.k();
/*  82:143 */     K.k();
/*  83:144 */     M.k();
/*  84:145 */     T.k();
/*  85:146 */     Y.k();
/*  86:147 */     Z.k();
/*  87:148 */     aa.k();
/*  88:149 */     ab.k();
/*  89:150 */     ac.k();
/*  90:151 */     Q.k();
/*  91:152 */     R.k();
/*  92:153 */     S.k();
/*  93:154 */     V.k();
/*  94:155 */     s.k();
/*  95:156 */     X.k();
/*  96:    */     
/*  97:    */ 
/*  98:159 */     V.d(W.az + 128).a("Redwood Taiga Hills M");
/*  99:161 */     for (arm localarm : aE) {
/* 100:162 */       if (localarm != null)
/* 101:    */       {
/* 102:163 */         if (o.containsKey(localarm.ah)) {
/* 103:164 */           throw new Error("Biome \"" + localarm.ah + "\" is defined as both ID " + ((arm)o.get(localarm.ah)).az + " and " + localarm.az);
/* 104:    */         }
/* 105:167 */         o.put(localarm.ah, localarm);
/* 106:169 */         if (localarm.az < 128) {
/* 107:170 */           n.add(localarm);
/* 108:    */         }
/* 109:    */       }
/* 110:    */     }
/* 111:175 */     n.remove(x);
/* 112:176 */     n.remove(y);
/* 113:177 */     n.remove(z);
/* 114:178 */     n.remove(J);
/* 115:    */   }
/* 116:    */   
/* 117:181 */   protected static final bnw ae = new bnw(new Random(1234L), 1);
/* 118:182 */   protected static final bnw af = new bnw(new Random(2345L), 1);
/* 119:183 */   protected static final bho ag = new bho();
/* 120:    */   public String ah;
/* 121:    */   public int ai;
/* 122:    */   public int aj;
/* 123:187 */   public Block ak = BlockList.grass.instance();
/* 124:188 */   public Block al = BlockList.dirt.instance();
/* 125:189 */   public int am = 5169201;
/* 126:190 */   public float an = a.a;
/* 127:191 */   public float ao = a.b;
/* 128:192 */   public float ap = 0.5F;
/* 129:193 */   public float aq = 0.5F;
/* 130:194 */   public int ar = 16777215;
/* 131:    */   public ary as;
/* 132:198 */   protected List<SpawnListEntry> at = Lists.newArrayList();
/* 133:199 */   protected List<SpawnListEntry> au = Lists.newArrayList();
/* 134:200 */   protected List<SpawnListEntry> av = Lists.newArrayList();
/* 135:201 */   protected List<SpawnListEntry> aw = Lists.newArrayList();
/* 136:    */   protected boolean ax;
/* 137:203 */   protected boolean ay = true;
/* 138:    */   public final int az;
/* 139:    */   
/* 140:    */   protected arm(int paramInt)
/* 141:    */   {
/* 142:208 */     this.az = paramInt;
/* 143:209 */     aE[paramInt] = this;
/* 144:210 */     this.as = a();
/* 145:    */     
/* 146:212 */     this.au.add(new SpawnListEntry(EntitySheep.class, 12, 4, 4));
/* 147:213 */     this.au.add(new SpawnListEntry(EntityRabbit.class, 10, 3, 3));
/* 148:214 */     this.au.add(new SpawnListEntry(EntityPig.class, 10, 4, 4));
/* 149:215 */     this.au.add(new SpawnListEntry(EntityChicken.class, 10, 4, 4));
/* 150:216 */     this.au.add(new SpawnListEntry(EntityCow.class, 8, 4, 4));
/* 151:    */     
/* 152:218 */     this.at.add(new SpawnListEntry(EntitySpider.class, 100, 4, 4));
/* 153:219 */     this.at.add(new SpawnListEntry(EntityZombie.class, 100, 4, 4));
/* 154:220 */     this.at.add(new SpawnListEntry(EntitySkeleton.class, 100, 4, 4));
/* 155:221 */     this.at.add(new SpawnListEntry(EntityCreeper.class, 100, 4, 4));
/* 156:222 */     this.at.add(new SpawnListEntry(EntitySlime.class, 100, 4, 4));
/* 157:223 */     this.at.add(new SpawnListEntry(EntityEnderman.class, 10, 1, 4));
/* 158:224 */     this.at.add(new SpawnListEntry(EntityWitch.class, 5, 1, 1));
/* 159:    */     
/* 160:    */ 
/* 161:    */ 
/* 162:228 */     this.av.add(new SpawnListEntry(EntitySquid.class, 10, 4, 4));
/* 163:    */     
/* 164:230 */     this.aw.add(new SpawnListEntry(EntityBat.class, 10, 8, 8));
/* 165:    */   }
/* 166:    */   
/* 167:    */   protected ary a()
/* 168:    */   {
/* 169:234 */     return new ary();
/* 170:    */   }
/* 171:    */   
/* 172:    */   protected arm a(float paramFloat1, float paramFloat2)
/* 173:    */   {
/* 174:238 */     if ((paramFloat1 > 0.1F) && (paramFloat1 < 0.2F)) {
/* 175:239 */       throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
/* 176:    */     }
/* 177:242 */     this.ap = paramFloat1;
/* 178:243 */     this.aq = paramFloat2;
/* 179:244 */     return this;
/* 180:    */   }
/* 181:    */   
/* 182:    */   protected final arm a(aro paramaro)
/* 183:    */   {
/* 184:248 */     this.an = paramaro.a;
/* 185:249 */     this.ao = paramaro.b;
/* 186:250 */     return this;
/* 187:    */   }
/* 188:    */   
/* 189:    */   protected arm b()
/* 190:    */   {
/* 191:254 */     this.ay = false;
/* 192:255 */     return this;
/* 193:    */   }
/* 194:    */   
/* 195:258 */   protected bir aA = new bir(false);
/* 196:259 */   protected bhd aB = new bhd(false);
/* 197:260 */   protected bip aC = new bip();
/* 198:    */   
/* 199:    */   public bhc a(Random paramRandom)
/* 200:    */   {
/* 201:263 */     if (paramRandom.nextInt(10) == 0) {
/* 202:264 */       return this.aB;
/* 203:    */     }
/* 204:266 */     return this.aA;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public bhp b(Random paramRandom)
/* 208:    */   {
/* 209:270 */     return new biq(bbi.b);
/* 210:    */   }
/* 211:    */   
/* 212:    */   public EnumFlowerVariant a(Random paramRandom, BlockPosition paramdt)
/* 213:    */   {
/* 214:274 */     if (paramRandom.nextInt(3) > 0) {
/* 215:275 */       return EnumFlowerVariant.a;
/* 216:    */     }
/* 217:277 */     return EnumFlowerVariant.b;
/* 218:    */   }
/* 219:    */   
/* 220:    */   protected arm c()
/* 221:    */   {
/* 222:281 */     this.ax = true;
/* 223:282 */     return this;
/* 224:    */   }
/* 225:    */   
/* 226:    */   protected arm a(String paramString)
/* 227:    */   {
/* 228:286 */     this.ah = paramString;
/* 229:287 */     return this;
/* 230:    */   }
/* 231:    */   
/* 232:    */   protected arm a(int paramInt)
/* 233:    */   {
/* 234:291 */     this.am = paramInt;
/* 235:292 */     return this;
/* 236:    */   }
/* 237:    */   
/* 238:    */   protected arm b(int paramInt)
/* 239:    */   {
/* 240:296 */     a(paramInt, false);
/* 241:297 */     return this;
/* 242:    */   }
/* 243:    */   
/* 244:    */   protected arm c(int paramInt)
/* 245:    */   {
/* 246:301 */     this.aj = paramInt;
/* 247:302 */     return this;
/* 248:    */   }
/* 249:    */   
/* 250:    */   protected arm a(int paramInt, boolean paramBoolean)
/* 251:    */   {
/* 252:306 */     this.ai = paramInt;
/* 253:307 */     if (paramBoolean) {
/* 254:308 */       this.aj = ((paramInt & 0xFEFEFE) >> 1);
/* 255:    */     } else {
/* 256:310 */       this.aj = paramInt;
/* 257:    */     }
/* 258:312 */     return this;
/* 259:    */   }
/* 260:    */   
/* 261:    */   public int a(float paramFloat)
/* 262:    */   {
/* 263:316 */     paramFloat /= 3.0F;
/* 264:317 */     paramFloat = MathUtils.clamp(paramFloat, -1.0F, 1.0F);
/* 265:318 */     return Color.getHSBColor(0.6222222F - paramFloat * 0.05F, 0.5F + paramFloat * 0.1F, 1.0F).getRGB();
/* 266:    */   }
/* 267:    */   
/* 268:    */   public List<SpawnListEntry> a(EnumCreatureType paramxp)
/* 269:    */   {
/* 270:322 */     switch (arn.a[paramxp.ordinal()])
/* 271:    */     {
/* 272:    */     case 1: 
/* 273:324 */       return this.at;
/* 274:    */     case 2: 
/* 275:326 */       return this.au;
/* 276:    */     case 3: 
/* 277:328 */       return this.av;
/* 278:    */     case 4: 
/* 279:330 */       return this.aw;
/* 280:    */     }
/* 281:332 */     return Collections.emptyList();
/* 282:    */   }
/* 283:    */   
/* 284:    */   public boolean d()
/* 285:    */   {
/* 286:354 */     return j();
/* 287:    */   }
/* 288:    */   
/* 289:    */   public boolean e()
/* 290:    */   {
/* 291:358 */     if (j()) {
/* 292:359 */       return false;
/* 293:    */     }
/* 294:361 */     return this.ay;
/* 295:    */   }
/* 296:    */   
/* 297:    */   public boolean f()
/* 298:    */   {
/* 299:365 */     return this.aq > 0.85F;
/* 300:    */   }
/* 301:    */   
/* 302:    */   public float g()
/* 303:    */   {
/* 304:369 */     return 0.1F;
/* 305:    */   }
/* 306:    */   
/* 307:    */   public final int h()
/* 308:    */   {
/* 309:373 */     return (int)(this.aq * 65536.0F);
/* 310:    */   }
/* 311:    */   
/* 312:    */   public final float i()
/* 313:    */   {
/* 314:377 */     return this.aq;
/* 315:    */   }
/* 316:    */   
/* 317:    */   public final float a(BlockPosition paramdt)
/* 318:    */   {
/* 319:381 */     if (paramdt.getY() > 64)
/* 320:    */     {
/* 321:382 */       float f1 = (float)(ae.a(paramdt.getX() * 1.0D / 8.0D, paramdt.getZ() * 1.0D / 8.0D) * 4.0D);
/* 322:383 */       return this.ap - (f1 + paramdt.getY() - 64.0F) * 0.05F / 30.0F;
/* 323:    */     }
/* 324:385 */     return this.ap;
/* 325:    */   }
/* 326:    */   
/* 327:    */   public void a(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 328:    */   {
/* 329:389 */     this.as.a(paramaqu, paramRandom, this, paramdt);
/* 330:    */   }
/* 331:    */   
/* 332:    */   public int b(BlockPosition paramdt)
/* 333:    */   {
/* 334:393 */     double d1 = MathUtils.clamp(a(paramdt), 0.0F, 1.0F);
/* 335:394 */     double d2 = MathUtils.clamp(i(), 0.0F, 1.0F);
/* 336:    */     
/* 337:396 */     return aqt.a(d1, d2);
/* 338:    */   }
/* 339:    */   
/* 340:    */   public int c(BlockPosition paramdt)
/* 341:    */   {
/* 342:400 */     double d1 = MathUtils.clamp(a(paramdt), 0.0F, 1.0F);
/* 343:401 */     double d2 = MathUtils.clamp(i(), 0.0F, 1.0F);
/* 344:    */     
/* 345:403 */     return aqp.a(d1, d2);
/* 346:    */   }
/* 347:    */   
/* 348:    */   public boolean j()
/* 349:    */   {
/* 350:407 */     return this.ax;
/* 351:    */   }
/* 352:    */   
/* 353:    */   public void a(World paramaqu, Random paramRandom, bgk parambgk, int paramInt1, int paramInt2, double paramDouble)
/* 354:    */   {
/* 355:411 */     b(paramaqu, paramRandom, parambgk, paramInt1, paramInt2, paramDouble);
/* 356:    */   }
/* 357:    */   
/* 358:    */   public final void b(World paramaqu, Random paramRandom, bgk parambgk, int paramInt1, int paramInt2, double paramDouble)
/* 359:    */   {
/* 360:415 */     int i1 = 63;
/* 361:416 */     Block localbec1 = this.ak;
/* 362:417 */     Block localbec2 = this.al;
/* 363:418 */     int i2 = -1;
/* 364:419 */     int i3 = (int)(paramDouble / 3.0D + 3.0D + paramRandom.nextDouble() * 0.25D);
/* 365:    */     
/* 366:421 */     int i4 = paramInt1 & 0xF;
/* 367:422 */     int i5 = paramInt2 & 0xF;
/* 368:423 */     for (int i6 = 255; i6 >= 0; i6--) {
/* 369:424 */       if (i6 <= paramRandom.nextInt(5))
/* 370:    */       {
/* 371:425 */         parambgk.a(i5, i6, i4, BlockList.bedrock.instance());
/* 372:    */       }
/* 373:    */       else
/* 374:    */       {
/* 375:427 */         Block localbec3 = parambgk.a(i5, i6, i4);
/* 376:429 */         if (localbec3.getProto().getMaterial() == Material.air) {
/* 377:430 */           i2 = -1;
/* 378:431 */         } else if (localbec3.getProto() == BlockList.stone) {
/* 379:432 */           if (i2 == -1)
/* 380:    */           {
/* 381:433 */             if (i3 <= 0)
/* 382:    */             {
/* 383:434 */               localbec1 = null;
/* 384:435 */               localbec2 = BlockList.stone.instance();
/* 385:    */             }
/* 386:436 */             else if ((i6 >= 59) && (i6 <= 64))
/* 387:    */             {
/* 388:437 */               localbec1 = this.ak;
/* 389:438 */               localbec2 = this.al;
/* 390:    */             }
/* 391:441 */             if ((i6 < 63) && ((localbec1 == null) || (localbec1.getProto().getMaterial() == Material.air))) {
/* 392:442 */               if (a(new BlockPosition(paramInt1, i6, paramInt2)) < 0.15F) {
/* 393:443 */                 localbec1 = BlockList.aI.instance();
/* 394:    */               } else {
/* 395:445 */                 localbec1 = BlockList.water.instance();
/* 396:    */               }
/* 397:    */             }
/* 398:449 */             i2 = i3;
/* 399:450 */             if (i6 >= 62)
/* 400:    */             {
/* 401:451 */               parambgk.a(i5, i6, i4, localbec1);
/* 402:    */             }
/* 403:452 */             else if (i6 < 56 - i3)
/* 404:    */             {
/* 405:453 */               localbec1 = null;
/* 406:454 */               localbec2 = BlockList.stone.instance();
/* 407:455 */               parambgk.a(i5, i6, i4, BlockList.gravel.instance());
/* 408:    */             }
/* 409:    */             else
/* 410:    */             {
/* 411:457 */               parambgk.a(i5, i6, i4, localbec2);
/* 412:    */             }
/* 413:    */           }
/* 414:459 */           else if (i2 > 0)
/* 415:    */           {
/* 416:460 */             i2--;
/* 417:461 */             parambgk.a(i5, i6, i4, localbec2);
/* 418:464 */             if ((i2 == 0) && (localbec2.getProto() == BlockList.sand))
/* 419:    */             {
/* 420:465 */               i2 = paramRandom.nextInt(4) + Math.max(0, i6 - 63);
/* 421:466 */               localbec2 = localbec2.getProperty(BlockSand.a) == bac.b ? BlockList.cM.instance() : BlockList.A.instance();
/* 422:    */             }
/* 423:    */           }
/* 424:    */         }
/* 425:    */       }
/* 426:    */     }
/* 427:    */   }
/* 428:    */   
/* 429:    */   protected arm k()
/* 430:    */   {
/* 431:475 */     return d(this.az + 128);
/* 432:    */   }
/* 433:    */   
/* 434:    */   protected arm d(int paramInt)
/* 435:    */   {
/* 436:479 */     return new asl(paramInt, this);
/* 437:    */   }
/* 438:    */   
/* 439:    */   public Class l()
/* 440:    */   {
/* 441:483 */     return getClass();
/* 442:    */   }
/* 443:    */   
/* 444:    */   public boolean a(arm paramarm)
/* 445:    */   {
/* 446:487 */     if (paramarm == this) {
/* 447:488 */       return true;
/* 448:    */     }
/* 449:490 */     if (paramarm == null) {
/* 450:491 */       return false;
/* 451:    */     }
/* 452:493 */     return l() == paramarm.l();
/* 453:    */   }
/* 454:    */   
/* 455:    */   public arp m()
/* 456:    */   {
/* 457:497 */     if (this.ap < 0.2D) {
/* 458:498 */       return arp.b;
/* 459:    */     }
/* 460:500 */     if (this.ap < 1.0D) {
/* 461:501 */       return arp.c;
/* 462:    */     }
/* 463:503 */     return arp.d;
/* 464:    */   }
/* 465:    */   
/* 466:    */   public static arm[] n()
/* 467:    */   {
/* 468:507 */     return aE;
/* 469:    */   }
/* 470:    */   
/* 471:    */   public static arm e(int paramInt)
/* 472:    */   {
/* 473:511 */     return a(paramInt, null);
/* 474:    */   }
/* 475:    */   
/* 476:    */   public static arm a(int paramInt, arm paramarm)
/* 477:    */   {
/* 478:515 */     if ((paramInt < 0) || (paramInt > aE.length))
/* 479:    */     {
/* 480:516 */       aD.warn("Biome ID is out of bounds: " + paramInt + ", defaulting to 0 (Ocean)");
/* 481:517 */       return p;
/* 482:    */     }
/* 483:519 */     arm localarm = aE[paramInt];
/* 484:520 */     if (localarm == null) {
/* 485:521 */       return paramarm;
/* 486:    */     }
/* 487:523 */     return localarm;
/* 488:    */   }
/* 489:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     arm
 * JD-Core Version:    0.7.0.1
 */
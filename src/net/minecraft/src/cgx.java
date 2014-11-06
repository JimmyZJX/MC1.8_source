package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Map;
/*   6:    */ import java.util.Random;
/*   7:    */ 
/*   8:    */ public class cgx
/*   9:    */ {
/*  10: 36 */   private static final oa b = new oa("textures/particle/particles.png");
/*  11:    */   protected World a;
/*  12: 49 */   private List<cgw>[][] c = new List[4][];
/*  13: 50 */   private List<cif> d = Lists.newArrayList();
/*  14:    */   private cug e;
/*  15: 52 */   private Random f = new Random();
/*  16: 53 */   private Map g = Maps.newHashMap();
/*  17:    */   
/*  18:    */   public cgx(World paramaqu, cug paramcug)
/*  19:    */   {
/*  20: 56 */     this.a = paramaqu;
/*  21: 57 */     this.e = paramcug;
/*  22: 58 */     for (int i = 0; i < 4; i++)
/*  23:    */     {
/*  24: 59 */       this.c[i] = new List[2];
/*  25: 60 */       for (int j = 0; j < 2; j++) {
/*  26: 61 */         this.c[i][j] = Lists.newArrayList();
/*  27:    */       }
/*  28:    */     }
/*  29: 65 */     c();
/*  30:    */   }
/*  31:    */   
/*  32:    */   private void c()
/*  33:    */   {
/*  34: 69 */     a(ew.a.c(), new cfw());
/*  35: 70 */     a(ew.e.c(), new cfm());
/*  36: 71 */     a(ew.f.c(), new chv());
/*  37: 72 */     a(ew.g.c(), new cih());
/*  38: 73 */     a(ew.N.c(), new cij());
/*  39: 74 */     a(ew.h.c(), new chx());
/*  40: 75 */     a(ew.i.c(), new cia());
/*  41: 76 */     a(ew.j.c(), new cfp());
/*  42: 77 */     a(ew.k.c(), new cfo());
/*  43: 78 */     a(ew.l.c(), new chl());
/*  44: 79 */     a(ew.m.c(), new cgp());
/*  45: 80 */     a(ew.n.c(), new chs());
/*  46: 81 */     a(ew.o.c(), new chq());
/*  47: 82 */     a(ew.p.c(), new chr());
/*  48: 83 */     a(ew.q.c(), new chp());
/*  49: 84 */     a(ew.r.c(), new cht());
/*  50: 85 */     a(ew.s.c(), new cfs());
/*  51: 86 */     a(ew.t.c(), new cfr());
/*  52: 87 */     a(ew.u.c(), new cgh());
/*  53: 88 */     a(ew.VILLAGER_HAPPY.c(), new chz());
/*  54: 89 */     a(ew.w.c(), new cia());
/*  55: 90 */     a(ew.x.c(), new cgv());
/*  56: 91 */     a(ew.y.c(), new chg());
/*  57: 92 */     a(ew.z.c(), new cfu());
/*  58: 93 */     a(ew.A.c(), new cgd());
/*  59: 94 */     a(ew.B.c(), new cgr());
/*  60: 95 */     a(ew.C.c(), new cgf());
/*  61: 96 */     a(ew.D.c(), new che());
/*  62: 97 */     a(ew.E.c(), new chi());
/*  63: 98 */     a(ew.F.c(), new cfk());
/*  64: 99 */     a(ew.G.c(), new chn());
/*  65:100 */     a(ew.H.c(), new cfj());
/*  66:101 */     a(ew.I.c(), new cgi());
/*  67:102 */     a(ew.J.c(), new cfg());
/*  68:103 */     a(ew.K.c(), new cfi());
/*  69:104 */     a(ew.L.c(), new cie());
/*  70:105 */     a(ew.M.c(), new cic());
/*  71:106 */     a(ew.c.c(), new cgm());
/*  72:107 */     a(ew.b.c(), new cgk());
/*  73:108 */     a(ew.d.c(), new cgb());
/*  74:109 */     a(ew.P.c(), new cgt());
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void a(int paramInt, chc paramchc)
/*  78:    */   {
/*  79:113 */     this.g.put(Integer.valueOf(paramInt), paramchc);
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void a(Entity paramwv, ew paramew)
/*  83:    */   {
/*  84:117 */     this.d.add(new cif(this.a, paramwv, paramew));
/*  85:    */   }
/*  86:    */   
/*  87:    */   public cgw a(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int... paramVarArgs)
/*  88:    */   {
/*  89:122 */     chc localchc = (chc)this.g.get(Integer.valueOf(paramInt));
/*  90:123 */     if (localchc != null)
/*  91:    */     {
/*  92:124 */       cgw localcgw = localchc.a(paramInt, this.a, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramVarArgs);
/*  93:125 */       if (localcgw != null)
/*  94:    */       {
/*  95:126 */         a(localcgw);
/*  96:127 */         return localcgw;
/*  97:    */       }
/*  98:    */     }
/*  99:130 */     return null;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void a(cgw paramcgw)
/* 103:    */   {
/* 104:134 */     int i = paramcgw.a();
/* 105:135 */     int j = paramcgw.j() != 1.0F ? 0 : 1;
/* 106:136 */     if (this.c[i][j].size() >= 4000) {
/* 107:137 */       this.c[i][j].remove(0);
/* 108:    */     }
/* 109:139 */     this.c[i][j].add(paramcgw);
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void a()
/* 113:    */   {
/* 114:143 */     for (int i = 0; i < 4; i++) {
/* 115:144 */       a(i);
/* 116:    */     }
/* 117:147 */     ArrayList<cif> localArrayList = Lists.newArrayList();
/* 118:148 */     for (cif localcif : this.d)
/* 119:    */     {
/* 120:149 */       localcif.onUpdate();
/* 121:150 */       if (localcif.isDead) {
/* 122:151 */         localArrayList.add(localcif);
/* 123:    */       }
/* 124:    */     }
/* 125:154 */     this.d.removeAll(localArrayList);
/* 126:    */   }
/* 127:    */   
/* 128:    */   private void a(int paramInt)
/* 129:    */   {
/* 130:158 */     for (int i = 0; i < 2; i++) {
/* 131:159 */       a(this.c[paramInt][i]);
/* 132:    */     }
/* 133:    */   }
/* 134:    */   
/* 135:    */   private void a(List<cgw> paramList)
/* 136:    */   {
/* 137:164 */     ArrayList<cgw> localArrayList = Lists.newArrayList();
/* 138:165 */     for (int i = 0; i < paramList.size(); i++)
/* 139:    */     {
/* 140:166 */       cgw localcgw = (cgw)paramList.get(i);
/* 141:167 */       d(localcgw);
/* 142:169 */       if (localcgw.isDead) {
/* 143:170 */         localArrayList.add(localcgw);
/* 144:    */       }
/* 145:    */     }
/* 146:173 */     paramList.removeAll(localArrayList);
/* 147:    */   }
/* 148:    */   
/* 149:    */   private void d(cgw paramcgw)
/* 150:    */   {
/* 151:    */     try
/* 152:    */     {
/* 153:178 */       paramcgw.onUpdate();
/* 154:    */     }
/* 155:    */     catch (Throwable localThrowable)
/* 156:    */     {
/* 157:180 */       b localb = net.minecraft.src.b.a(localThrowable, "Ticking Particle");
/* 158:181 */       j localj = localb.a("Particle being ticked");
/* 159:182 */       int i = paramcgw.a();
/* 160:    */       
/* 161:184 */       localj.a("Particle", new cgy(this, paramcgw));
/* 162:    */       
/* 163:    */ 
/* 164:    */ 
/* 165:    */ 
/* 166:    */ 
/* 167:    */ 
/* 168:191 */       localj.a("Particle Type", new cgz(this, i));
/* 169:    */       
/* 170:    */ 
/* 171:    */ 
/* 172:    */ 
/* 173:    */ 
/* 174:    */ 
/* 175:    */ 
/* 176:    */ 
/* 177:    */ 
/* 178:    */ 
/* 179:    */ 
/* 180:    */ 
/* 181:    */ 
/* 182:    */ 
/* 183:206 */       throw new u(localb);
/* 184:    */     }
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void a(Entity paramwv, float paramFloat)
/* 188:    */   {
/* 189:211 */     float f1 = bsp.b();
/* 190:212 */     float f2 = bsp.d();
/* 191:    */     
/* 192:214 */     float f3 = bsp.e();
/* 193:215 */     float f4 = bsp.f();
/* 194:216 */     float f5 = bsp.c();
/* 195:    */     
/* 196:218 */     cgw.au = paramwv.P + (paramwv.xPos - paramwv.P) * paramFloat;
/* 197:219 */     cgw.av = paramwv.Q + (paramwv.yPos - paramwv.Q) * paramFloat;
/* 198:220 */     cgw.aw = paramwv.R + (paramwv.zPos - paramwv.R) * paramFloat;
/* 199:    */     
/* 200:222 */     cjm.enableBlend();
/* 201:223 */     cjm.glBlendFunc(770, 771);
/* 202:224 */     cjm.glAlphaFunc(516, 0.003921569F);
/* 203:226 */     for (int i = 0; i < 3; i++) {
/* 204:227 */       for (int j = 0; j < 2; j++) {
/* 205:228 */         if (!this.c[i][j].isEmpty())
/* 206:    */         {
/* 207:232 */           switch (j)
/* 208:    */           {
/* 209:    */           case 0: 
/* 210:234 */             cjm.a(false);
/* 211:235 */             break;
/* 212:    */           case 1: 
/* 213:237 */             cjm.a(true);
/* 214:    */           }
/* 215:241 */           switch (i)
/* 216:    */           {
/* 217:    */           case 0: 
/* 218:    */           default: 
/* 219:244 */             this.e.a(b);
/* 220:245 */             break;
/* 221:    */           case 1: 
/* 222:247 */             this.e.a(cua.g);
/* 223:    */           }
/* 224:250 */           cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 225:    */           
/* 226:252 */           ckx localckx = ckx.getInstance();
/* 227:253 */           VertexBuffer localciv = localckx.getBuffer();
/* 228:254 */           localciv.begin();
/* 229:255 */           for (int k = 0; k < this.c[i][j].size(); k++)
/* 230:    */           {
/* 231:256 */             cgw localcgw = (cgw)this.c[i][j].get(k);
/* 232:    */             
/* 233:258 */             localciv.b(localcgw.b(paramFloat));
/* 234:    */             try
/* 235:    */             {
/* 236:261 */               localcgw.a(localciv, paramwv, paramFloat, f1, f5, f2, f3, f4);
/* 237:    */             }
/* 238:    */             catch (Throwable localThrowable)
/* 239:    */             {
/* 240:263 */               b localb = net.minecraft.src.b.a(localThrowable, "Rendering Particle");
/* 241:264 */               j localj = localb.a("Particle being rendered");
/* 242:265 */               int m = i;
/* 243:    */               
/* 244:267 */               localj.a("Particle", new cha(this, localcgw));
/* 245:    */               
/* 246:    */ 
/* 247:    */ 
/* 248:    */ 
/* 249:    */ 
/* 250:    */ 
/* 251:274 */               localj.a("Particle Type", new chb(this, m));
/* 252:    */               
/* 253:    */ 
/* 254:    */ 
/* 255:    */ 
/* 256:    */ 
/* 257:    */ 
/* 258:    */ 
/* 259:    */ 
/* 260:    */ 
/* 261:    */ 
/* 262:    */ 
/* 263:    */ 
/* 264:    */ 
/* 265:    */ 
/* 266:289 */               throw new u(localb);
/* 267:    */             }
/* 268:    */           }
/* 269:292 */           localckx.draw();
/* 270:    */         }
/* 271:    */       }
/* 272:    */     }
/* 273:296 */     cjm.a(true);
/* 274:297 */     cjm.disableBlend();
/* 275:298 */     cjm.glAlphaFunc(516, 0.1F);
/* 276:    */   }
/* 277:    */   
/* 278:    */   public void b(Entity paramwv, float paramFloat)
/* 279:    */   {
/* 280:302 */     float f1 = 0.01745329F;
/* 281:303 */     float f2 = MathUtils.cos(paramwv.yaw * 0.01745329F);
/* 282:304 */     float f3 = MathUtils.sin(paramwv.yaw * 0.01745329F);
/* 283:    */     
/* 284:306 */     float f4 = -f3 * MathUtils.sin(paramwv.pitch * 0.01745329F);
/* 285:307 */     float f5 = f2 * MathUtils.sin(paramwv.pitch * 0.01745329F);
/* 286:308 */     float f6 = MathUtils.cos(paramwv.pitch * 0.01745329F);
/* 287:310 */     for (int i = 0; i < 2; i++)
/* 288:    */     {
/* 289:311 */       List localList = this.c[3][i];
/* 290:312 */       if (!localList.isEmpty())
/* 291:    */       {
/* 292:316 */         ckx localckx = ckx.getInstance();
/* 293:317 */         VertexBuffer localciv = localckx.getBuffer();
/* 294:318 */         for (int j = 0; j < localList.size(); j++)
/* 295:    */         {
/* 296:319 */           cgw localcgw = (cgw)localList.get(j);
/* 297:320 */           localciv.b(localcgw.b(paramFloat));
/* 298:321 */           localcgw.a(localciv, paramwv, paramFloat, f2, f6, f3, f4, f5);
/* 299:    */         }
/* 300:    */       }
/* 301:    */     }
/* 302:    */   }
/* 303:    */   
/* 304:    */   public void a(World paramaqu)
/* 305:    */   {
/* 306:327 */     this.a = paramaqu;
/* 307:328 */     for (int i = 0; i < 4; i++) {
/* 308:329 */       for (int j = 0; j < 2; j++) {
/* 309:330 */         this.c[i][j].clear();
/* 310:    */       }
/* 311:    */     }
/* 312:333 */     this.d.clear();
/* 313:    */   }
/* 314:    */   
/* 315:    */   public void a(BlockPosition paramdt, Block parambec)
/* 316:    */   {
/* 317:337 */     if (parambec.getProto().getMaterial() == Material.air) {
/* 318:338 */       return;
/* 319:    */     }
/* 320:341 */     parambec = parambec.getProto().a(parambec, this.a, paramdt);
/* 321:    */     
/* 322:343 */     int i = 4;
/* 323:344 */     for (int j = 0; j < i; j++) {
/* 324:345 */       for (int k = 0; k < i; k++) {
/* 325:346 */         for (int m = 0; m < i; m++)
/* 326:    */         {
/* 327:347 */           double d1 = paramdt.getX() + (j + 0.5D) / i;
/* 328:348 */           double d2 = paramdt.getY() + (k + 0.5D) / i;
/* 329:349 */           double d3 = paramdt.getZ() + (m + 0.5D) / i;
/* 330:350 */           a(new cid(this.a, d1, d2, d3, d1 - paramdt.getX() - 0.5D, d2 - paramdt.getY() - 0.5D, d3 - paramdt.getZ() - 0.5D, parambec).a(paramdt));
/* 331:    */         }
/* 332:    */       }
/* 333:    */     }
/* 334:    */   }
/* 335:    */   
/* 336:    */   public void a(BlockPosition paramdt, EnumDirection paramej)
/* 337:    */   {
/* 338:357 */     Block localbec = this.a.getBlock(paramdt);
/* 339:358 */     ProtoBlock localatr = localbec.getProto();
/* 340:359 */     if (localatr.b() == -1) {
/* 341:360 */       return;
/* 342:    */     }
/* 343:363 */     int i = paramdt.getX();
/* 344:364 */     int j = paramdt.getY();
/* 345:365 */     int k = paramdt.getZ();
/* 346:    */     
/* 347:367 */     float f1 = 0.1F;
/* 348:368 */     double d1 = i + this.f.nextDouble() * (localatr.A() - localatr.z() - f1 * 2.0F) + f1 + localatr.z();
/* 349:369 */     double d2 = j + this.f.nextDouble() * (localatr.C() - localatr.B() - f1 * 2.0F) + f1 + localatr.B();
/* 350:370 */     double d3 = k + this.f.nextDouble() * (localatr.E() - localatr.D() - f1 * 2.0F) + f1 + localatr.D();
/* 351:373 */     if (paramej == EnumDirection.DOWN) {
/* 352:374 */       d2 = j + localatr.B() - f1;
/* 353:    */     }
/* 354:376 */     if (paramej == EnumDirection.UP) {
/* 355:377 */       d2 = j + localatr.C() + f1;
/* 356:    */     }
/* 357:379 */     if (paramej == EnumDirection.NORTH) {
/* 358:380 */       d3 = k + localatr.D() - f1;
/* 359:    */     }
/* 360:382 */     if (paramej == EnumDirection.SOUTH) {
/* 361:383 */       d3 = k + localatr.E() + f1;
/* 362:    */     }
/* 363:385 */     if (paramej == EnumDirection.WEST) {
/* 364:386 */       d1 = i + localatr.z() - f1;
/* 365:    */     }
/* 366:388 */     if (paramej == EnumDirection.EAST) {
/* 367:389 */       d1 = i + localatr.A() + f1;
/* 368:    */     }
/* 369:392 */     a(new cid(this.a, d1, d2, d3, 0.0D, 0.0D, 0.0D, localbec).a(paramdt).a(0.2F).g(0.6F));
/* 370:    */   }
/* 371:    */   
/* 372:    */   public void b(cgw paramcgw)
/* 373:    */   {
/* 374:396 */     a(paramcgw, 1, 0);
/* 375:    */   }
/* 376:    */   
/* 377:    */   public void c(cgw paramcgw)
/* 378:    */   {
/* 379:400 */     a(paramcgw, 0, 1);
/* 380:    */   }
/* 381:    */   
/* 382:    */   private void a(cgw paramcgw, int paramInt1, int paramInt2)
/* 383:    */   {
/* 384:404 */     for (int i = 0; i < 4; i++) {
/* 385:405 */       if (this.c[i][paramInt1].contains(paramcgw))
/* 386:    */       {
/* 387:406 */         this.c[i][paramInt1].remove(paramcgw);
/* 388:407 */         this.c[i][paramInt2].add(paramcgw);
/* 389:    */       }
/* 390:    */     }
/* 391:    */   }
/* 392:    */   
/* 393:    */   public String b()
/* 394:    */   {
/* 395:413 */     int i = 0;
/* 396:414 */     for (int j = 0; j < 4; j++) {
/* 397:415 */       for (int k = 0; k < 2; k++) {
/* 398:416 */         i += this.c[j][k].size();
/* 399:    */       }
/* 400:    */     }
/* 401:419 */     return "" + i;
/* 402:    */   }
/* 403:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cgx
 * JD-Core Version:    0.7.0.1
 */
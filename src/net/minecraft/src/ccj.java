package net.minecraft.src;
/*   1:    */ public class ccj
/*   2:    */   extends ccq
/*   3:    */ {
/*   4:    */   private cdy a;
/*   5:    */   private cdy b;
/*   6:    */   private cdy c;
/*   7:    */   private cdy d;
/*   8:    */   private cdy e;
/*   9:    */   private cdy f;
/*  10:    */   private cdy g;
/*  11:    */   private cdy h;
/*  12:    */   private cdy i;
/*  13:    */   private cdy j;
/*  14:    */   private cdy k;
/*  15:    */   private cdy l;
/*  16:    */   private cdy m;
/*  17:    */   private cdy n;
/*  18:    */   private cdy o;
/*  19:    */   private cdy v;
/*  20:    */   private cdy w;
/*  21:    */   private cdy x;
/*  22:    */   private cdy y;
/*  23:    */   private cdy z;
/*  24:    */   private cdy A;
/*  25:    */   private cdy B;
/*  26:    */   private cdy C;
/*  27:    */   private cdy D;
/*  28:    */   private cdy E;
/*  29:    */   private cdy F;
/*  30:    */   private cdy G;
/*  31:    */   private cdy H;
/*  32:    */   private cdy I;
/*  33:    */   private cdy J;
/*  34:    */   private cdy K;
/*  35:    */   private cdy L;
/*  36:    */   private cdy M;
/*  37:    */   private cdy N;
/*  38:    */   private cdy O;
/*  39:    */   private cdy P;
/*  40:    */   private cdy Q;
/*  41:    */   private cdy R;
/*  42:    */   private cdy S;
/*  43:    */   
/*  44:    */   public ccj()
/*  45:    */   {
/*  46: 67 */     this.t = 128;
/*  47: 68 */     this.u = 128;
/*  48:    */     
/*  49:    */ 
/*  50: 71 */     this.k = new cdy(this, 0, 34);
/*  51: 72 */     this.k.a(-5.0F, -8.0F, -19.0F, 10, 10, 24);
/*  52: 73 */     this.k.a(0.0F, 11.0F, 9.0F);
/*  53:    */     
/*  54: 75 */     this.l = new cdy(this, 44, 0);
/*  55: 76 */     this.l.a(-1.0F, -1.0F, 0.0F, 2, 2, 3);
/*  56: 77 */     this.l.a(0.0F, 3.0F, 14.0F);
/*  57: 78 */     a(this.l, -1.134464F, 0.0F, 0.0F);
/*  58:    */     
/*  59: 80 */     this.m = new cdy(this, 38, 7);
/*  60: 81 */     this.m.a(-1.5F, -2.0F, 3.0F, 3, 4, 7);
/*  61: 82 */     this.m.a(0.0F, 3.0F, 14.0F);
/*  62: 83 */     a(this.m, -1.134464F, 0.0F, 0.0F);
/*  63:    */     
/*  64: 85 */     this.n = new cdy(this, 24, 3);
/*  65: 86 */     this.n.a(-1.5F, -4.5F, 9.0F, 3, 4, 7);
/*  66: 87 */     this.n.a(0.0F, 3.0F, 14.0F);
/*  67: 88 */     a(this.n, -1.40215F, 0.0F, 0.0F);
/*  68:    */     
/*  69: 90 */     this.o = new cdy(this, 78, 29);
/*  70: 91 */     this.o.a(-2.5F, -2.0F, -2.5F, 4, 9, 5);
/*  71: 92 */     this.o.a(4.0F, 9.0F, 11.0F);
/*  72:    */     
/*  73: 94 */     this.v = new cdy(this, 78, 43);
/*  74: 95 */     this.v.a(-2.0F, 0.0F, -1.5F, 3, 5, 3);
/*  75: 96 */     this.v.a(4.0F, 16.0F, 11.0F);
/*  76:    */     
/*  77: 98 */     this.w = new cdy(this, 78, 51);
/*  78: 99 */     this.w.a(-2.5F, 5.1F, -2.0F, 4, 3, 4);
/*  79:100 */     this.w.a(4.0F, 16.0F, 11.0F);
/*  80:    */     
/*  81:102 */     this.x = new cdy(this, 96, 29);
/*  82:103 */     this.x.a(-1.5F, -2.0F, -2.5F, 4, 9, 5);
/*  83:104 */     this.x.a(-4.0F, 9.0F, 11.0F);
/*  84:    */     
/*  85:106 */     this.y = new cdy(this, 96, 43);
/*  86:107 */     this.y.a(-1.0F, 0.0F, -1.5F, 3, 5, 3);
/*  87:108 */     this.y.a(-4.0F, 16.0F, 11.0F);
/*  88:    */     
/*  89:110 */     this.z = new cdy(this, 96, 51);
/*  90:111 */     this.z.a(-1.5F, 5.1F, -2.0F, 4, 3, 4);
/*  91:112 */     this.z.a(-4.0F, 16.0F, 11.0F);
/*  92:    */     
/*  93:114 */     this.A = new cdy(this, 44, 29);
/*  94:115 */     this.A.a(-1.9F, -1.0F, -2.1F, 3, 8, 4);
/*  95:116 */     this.A.a(4.0F, 9.0F, -8.0F);
/*  96:    */     
/*  97:118 */     this.B = new cdy(this, 44, 41);
/*  98:119 */     this.B.a(-1.9F, 0.0F, -1.6F, 3, 5, 3);
/*  99:120 */     this.B.a(4.0F, 16.0F, -8.0F);
/* 100:    */     
/* 101:122 */     this.C = new cdy(this, 44, 51);
/* 102:123 */     this.C.a(-2.4F, 5.1F, -2.1F, 4, 3, 4);
/* 103:124 */     this.C.a(4.0F, 16.0F, -8.0F);
/* 104:    */     
/* 105:126 */     this.D = new cdy(this, 60, 29);
/* 106:127 */     this.D.a(-1.1F, -1.0F, -2.1F, 3, 8, 4);
/* 107:128 */     this.D.a(-4.0F, 9.0F, -8.0F);
/* 108:    */     
/* 109:130 */     this.E = new cdy(this, 60, 41);
/* 110:131 */     this.E.a(-1.1F, 0.0F, -1.6F, 3, 5, 3);
/* 111:132 */     this.E.a(-4.0F, 16.0F, -8.0F);
/* 112:    */     
/* 113:134 */     this.F = new cdy(this, 60, 51);
/* 114:135 */     this.F.a(-1.6F, 5.1F, -2.1F, 4, 3, 4);
/* 115:136 */     this.F.a(-4.0F, 16.0F, -8.0F);
/* 116:    */     
/* 117:138 */     this.a = new cdy(this, 0, 0);
/* 118:139 */     this.a.a(-2.5F, -10.0F, -1.5F, 5, 5, 7);
/* 119:140 */     this.a.a(0.0F, 4.0F, -10.0F);
/* 120:141 */     a(this.a, 0.5235988F, 0.0F, 0.0F);
/* 121:    */     
/* 122:143 */     this.b = new cdy(this, 24, 18);
/* 123:144 */     this.b.a(-2.0F, -10.0F, -7.0F, 4, 3, 6);
/* 124:145 */     this.b.a(0.0F, 3.95F, -10.0F);
/* 125:146 */     a(this.b, 0.5235988F, 0.0F, 0.0F);
/* 126:    */     
/* 127:148 */     this.c = new cdy(this, 24, 27);
/* 128:149 */     this.c.a(-2.0F, -7.0F, -6.5F, 4, 2, 5);
/* 129:150 */     this.c.a(0.0F, 4.0F, -10.0F);
/* 130:151 */     a(this.c, 0.5235988F, 0.0F, 0.0F);
/* 131:    */     
/* 132:153 */     this.a.a(this.b);
/* 133:154 */     this.a.a(this.c);
/* 134:    */     
/* 135:156 */     this.d = new cdy(this, 0, 0);
/* 136:157 */     this.d.a(0.45F, -12.0F, 4.0F, 2, 3, 1);
/* 137:158 */     this.d.a(0.0F, 4.0F, -10.0F);
/* 138:159 */     a(this.d, 0.5235988F, 0.0F, 0.0F);
/* 139:    */     
/* 140:161 */     this.e = new cdy(this, 0, 0);
/* 141:162 */     this.e.a(-2.45F, -12.0F, 4.0F, 2, 3, 1);
/* 142:163 */     this.e.a(0.0F, 4.0F, -10.0F);
/* 143:164 */     a(this.e, 0.5235988F, 0.0F, 0.0F);
/* 144:    */     
/* 145:166 */     this.f = new cdy(this, 0, 12);
/* 146:167 */     this.f.a(-2.0F, -16.0F, 4.0F, 2, 7, 1);
/* 147:168 */     this.f.a(0.0F, 4.0F, -10.0F);
/* 148:169 */     a(this.f, 0.5235988F, 0.0F, 0.261799F);
/* 149:    */     
/* 150:171 */     this.g = new cdy(this, 0, 12);
/* 151:172 */     this.g.a(0.0F, -16.0F, 4.0F, 2, 7, 1);
/* 152:173 */     this.g.a(0.0F, 4.0F, -10.0F);
/* 153:174 */     a(this.g, 0.5235988F, 0.0F, -0.261799F);
/* 154:    */     
/* 155:176 */     this.h = new cdy(this, 0, 12);
/* 156:177 */     this.h.a(-2.05F, -9.8F, -2.0F, 4, 14, 8);
/* 157:178 */     this.h.a(0.0F, 4.0F, -10.0F);
/* 158:179 */     a(this.h, 0.5235988F, 0.0F, 0.0F);
/* 159:    */     
/* 160:181 */     this.G = new cdy(this, 0, 34);
/* 161:182 */     this.G.a(-3.0F, 0.0F, 0.0F, 8, 8, 3);
/* 162:183 */     this.G.a(-7.5F, 3.0F, 10.0F);
/* 163:184 */     a(this.G, 0.0F, 1.570796F, 0.0F);
/* 164:    */     
/* 165:186 */     this.H = new cdy(this, 0, 47);
/* 166:187 */     this.H.a(-3.0F, 0.0F, 0.0F, 8, 8, 3);
/* 167:188 */     this.H.a(4.5F, 3.0F, 10.0F);
/* 168:189 */     a(this.H, 0.0F, 1.570796F, 0.0F);
/* 169:    */     
/* 170:191 */     this.I = new cdy(this, 80, 0);
/* 171:192 */     this.I.a(-5.0F, 0.0F, -3.0F, 10, 1, 8);
/* 172:193 */     this.I.a(0.0F, 2.0F, 2.0F);
/* 173:    */     
/* 174:195 */     this.J = new cdy(this, 106, 9);
/* 175:196 */     this.J.a(-1.5F, -1.0F, -3.0F, 3, 1, 2);
/* 176:197 */     this.J.a(0.0F, 2.0F, 2.0F);
/* 177:    */     
/* 178:199 */     this.K = new cdy(this, 80, 9);
/* 179:200 */     this.K.a(-4.0F, -1.0F, 3.0F, 8, 1, 2);
/* 180:201 */     this.K.a(0.0F, 2.0F, 2.0F);
/* 181:    */     
/* 182:203 */     this.M = new cdy(this, 74, 0);
/* 183:204 */     this.M.a(-0.5F, 6.0F, -1.0F, 1, 2, 2);
/* 184:205 */     this.M.a(5.0F, 3.0F, 2.0F);
/* 185:    */     
/* 186:207 */     this.L = new cdy(this, 70, 0);
/* 187:208 */     this.L.a(-0.5F, 0.0F, -0.5F, 1, 6, 1);
/* 188:209 */     this.L.a(5.0F, 3.0F, 2.0F);
/* 189:    */     
/* 190:211 */     this.O = new cdy(this, 74, 4);
/* 191:212 */     this.O.a(-0.5F, 6.0F, -1.0F, 1, 2, 2);
/* 192:213 */     this.O.a(-5.0F, 3.0F, 2.0F);
/* 193:    */     
/* 194:215 */     this.N = new cdy(this, 80, 0);
/* 195:216 */     this.N.a(-0.5F, 0.0F, -0.5F, 1, 6, 1);
/* 196:217 */     this.N.a(-5.0F, 3.0F, 2.0F);
/* 197:    */     
/* 198:219 */     this.P = new cdy(this, 74, 13);
/* 199:220 */     this.P.a(1.5F, -8.0F, -4.0F, 1, 2, 2);
/* 200:221 */     this.P.a(0.0F, 4.0F, -10.0F);
/* 201:222 */     a(this.P, 0.5235988F, 0.0F, 0.0F);
/* 202:    */     
/* 203:224 */     this.Q = new cdy(this, 74, 13);
/* 204:225 */     this.Q.a(-2.5F, -8.0F, -4.0F, 1, 2, 2);
/* 205:226 */     this.Q.a(0.0F, 4.0F, -10.0F);
/* 206:227 */     a(this.Q, 0.5235988F, 0.0F, 0.0F);
/* 207:    */     
/* 208:229 */     this.R = new cdy(this, 44, 10);
/* 209:230 */     this.R.a(2.6F, -6.0F, -6.0F, 0, 3, 16);
/* 210:231 */     this.R.a(0.0F, 4.0F, -10.0F);
/* 211:    */     
/* 212:233 */     this.S = new cdy(this, 44, 5);
/* 213:234 */     this.S.a(-2.6F, -6.0F, -6.0F, 0, 3, 16);
/* 214:235 */     this.S.a(0.0F, 4.0F, -10.0F);
/* 215:    */     
/* 216:237 */     this.j = new cdy(this, 58, 0);
/* 217:238 */     this.j.a(-1.0F, -11.5F, 5.0F, 2, 16, 4);
/* 218:239 */     this.j.a(0.0F, 4.0F, -10.0F);
/* 219:240 */     a(this.j, 0.5235988F, 0.0F, 0.0F);
/* 220:    */     
/* 221:242 */     this.i = new cdy(this, 80, 12);
/* 222:243 */     this.i.a(-2.5F, -10.1F, -7.0F, 5, 5, 12, 0.2F);
/* 223:244 */     this.i.a(0.0F, 4.0F, -10.0F);
/* 224:245 */     a(this.i, 0.5235988F, 0.0F, 0.0F);
/* 225:    */   }
/* 226:    */   
/* 227:    */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 228:    */   {
/* 229:250 */     EntityHorse localabt = (EntityHorse)paramwv;
/* 230:    */     
/* 231:252 */     int i1 = localabt.cj();
/* 232:253 */     float f1 = localabt.o(0.0F);
/* 233:254 */     boolean bool = localabt.cl();
/* 234:255 */     int i2 = (bool) && (localabt.cE()) ? 1 : 0;
/* 235:256 */     int i3 = (bool) && (localabt.cu()) ? 1 : 0;
/* 236:257 */     int i4 = (i1 == 1) || (i1 == 2) ? 1 : 0;
/* 237:258 */     float f2 = localabt.cs();
/* 238:    */     
/* 239:260 */     int i5 = localabt.rider != null ? 1 : 0;
/* 240:262 */     if (i2 != 0)
/* 241:    */     {
/* 242:263 */       this.i.a(paramFloat6);
/* 243:264 */       this.I.a(paramFloat6);
/* 244:265 */       this.J.a(paramFloat6);
/* 245:266 */       this.K.a(paramFloat6);
/* 246:267 */       this.L.a(paramFloat6);
/* 247:268 */       this.M.a(paramFloat6);
/* 248:269 */       this.N.a(paramFloat6);
/* 249:270 */       this.O.a(paramFloat6);
/* 250:271 */       this.P.a(paramFloat6);
/* 251:272 */       this.Q.a(paramFloat6);
/* 252:273 */       if (i5 != 0)
/* 253:    */       {
/* 254:274 */         this.R.a(paramFloat6);
/* 255:275 */         this.S.a(paramFloat6);
/* 256:    */       }
/* 257:    */     }
/* 258:280 */     if (!bool)
/* 259:    */     {
/* 260:281 */       cjm.glPushMatrix();
/* 261:282 */       cjm.glScalef(f2, 0.5F + f2 * 0.5F, f2);
/* 262:283 */       cjm.glTranslatef(0.0F, 0.95F * (1.0F - f2), 0.0F);
/* 263:    */     }
/* 264:285 */     this.o.a(paramFloat6);
/* 265:286 */     this.v.a(paramFloat6);
/* 266:287 */     this.w.a(paramFloat6);
/* 267:    */     
/* 268:289 */     this.x.a(paramFloat6);
/* 269:290 */     this.y.a(paramFloat6);
/* 270:291 */     this.z.a(paramFloat6);
/* 271:    */     
/* 272:293 */     this.A.a(paramFloat6);
/* 273:294 */     this.B.a(paramFloat6);
/* 274:295 */     this.C.a(paramFloat6);
/* 275:    */     
/* 276:297 */     this.D.a(paramFloat6);
/* 277:298 */     this.E.a(paramFloat6);
/* 278:299 */     this.F.a(paramFloat6);
/* 279:300 */     if (!bool)
/* 280:    */     {
/* 281:301 */       cjm.glPopMatrix();
/* 282:    */       
/* 283:303 */       cjm.glPushMatrix();
/* 284:304 */       cjm.glScalef(f2, f2, f2);
/* 285:305 */       cjm.glTranslatef(0.0F, 1.35F * (1.0F - f2), 0.0F);
/* 286:    */     }
/* 287:308 */     this.k.a(paramFloat6);
/* 288:309 */     this.l.a(paramFloat6);
/* 289:310 */     this.m.a(paramFloat6);
/* 290:311 */     this.n.a(paramFloat6);
/* 291:312 */     this.h.a(paramFloat6);
/* 292:313 */     this.j.a(paramFloat6);
/* 293:314 */     if (!bool)
/* 294:    */     {
/* 295:315 */       cjm.glPopMatrix();
/* 296:    */       
/* 297:317 */       cjm.glPushMatrix();
/* 298:318 */       float f3 = 0.5F + f2 * f2 * 0.5F;
/* 299:319 */       cjm.glScalef(f3, f3, f3);
/* 300:320 */       if (f1 <= 0.0F) {
/* 301:321 */         cjm.glTranslatef(0.0F, 1.35F * (1.0F - f2), 0.0F);
/* 302:    */       } else {
/* 303:323 */         cjm.glTranslatef(0.0F, 0.9F * (1.0F - f2) * f1 + 1.35F * (1.0F - f2) * (1.0F - f1), 0.15F * (1.0F - f2) * f1);
/* 304:    */       }
/* 305:    */     }
/* 306:327 */     if (i4 != 0)
/* 307:    */     {
/* 308:328 */       this.f.a(paramFloat6);
/* 309:329 */       this.g.a(paramFloat6);
/* 310:    */     }
/* 311:    */     else
/* 312:    */     {
/* 313:331 */       this.d.a(paramFloat6);
/* 314:332 */       this.e.a(paramFloat6);
/* 315:    */     }
/* 316:334 */     this.a.a(paramFloat6);
/* 317:335 */     if (!bool) {
/* 318:336 */       cjm.glPopMatrix();
/* 319:    */     }
/* 320:338 */     if (i3 != 0)
/* 321:    */     {
/* 322:339 */       this.G.a(paramFloat6);
/* 323:340 */       this.H.a(paramFloat6);
/* 324:    */     }
/* 325:    */   }
/* 326:    */   
/* 327:    */   private void a(cdy paramcdy, float paramFloat1, float paramFloat2, float paramFloat3)
/* 328:    */   {
/* 329:345 */     paramcdy.f = paramFloat1;
/* 330:346 */     paramcdy.g = paramFloat2;
/* 331:347 */     paramcdy.h = paramFloat3;
/* 332:    */   }
/* 333:    */   
/* 334:    */   private float a(float paramFloat1, float paramFloat2, float paramFloat3)
/* 335:    */   {
/* 336:351 */     float f1 = paramFloat2 - paramFloat1;
/* 337:352 */     while (f1 < -180.0F) {
/* 338:353 */       f1 += 360.0F;
/* 339:    */     }
/* 340:355 */     while (f1 >= 180.0F) {
/* 341:356 */       f1 -= 360.0F;
/* 342:    */     }
/* 343:358 */     return paramFloat1 + paramFloat3 * f1;
/* 344:    */   }
/* 345:    */   
/* 346:    */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3)
/* 347:    */   {
/* 348:363 */     super.a(paramxm, paramFloat1, paramFloat2, paramFloat3);
/* 349:    */     
/* 350:365 */     float f1 = a(paramxm.aH, paramxm.aG, paramFloat3);
/* 351:366 */     float f2 = a(paramxm.aJ, paramxm.aI, paramFloat3);
/* 352:367 */     float f3 = paramxm.lastPitch + (paramxm.pitch - paramxm.lastPitch) * paramFloat3;
/* 353:368 */     float f4 = f2 - f1;
/* 354:    */     
/* 355:    */ 
/* 356:371 */     float f5 = f3 / 57.295776F;
/* 357:372 */     if (f4 > 20.0F) {
/* 358:373 */       f4 = 20.0F;
/* 359:    */     }
/* 360:375 */     if (f4 < -20.0F) {
/* 361:376 */       f4 = -20.0F;
/* 362:    */     }
/* 363:379 */     if (paramFloat2 > 0.2F) {
/* 364:380 */       f5 += MathUtils.cos(paramFloat1 * 0.4F) * 0.15F * paramFloat2;
/* 365:    */     }
/* 366:383 */     EntityHorse localabt = (EntityHorse)paramxm;
/* 367:384 */     float f6 = localabt.o(paramFloat3);
/* 368:385 */     float f7 = localabt.p(paramFloat3);
/* 369:386 */     float f8 = 1.0F - f7;
/* 370:387 */     float f9 = localabt.q(paramFloat3);
/* 371:388 */     int i1 = localabt.bk != 0 ? 1 : 0;
/* 372:389 */     boolean bool = localabt.cE();
/* 373:390 */     int i2 = localabt.rider != null ? 1 : 0;
/* 374:391 */     float f10 = paramxm.W + paramFloat3;
/* 375:    */     
/* 376:393 */     float f11 = MathUtils.cos(paramFloat1 * 0.6662F + 3.141593F);
/* 377:394 */     float f12 = f11 * 0.8F * paramFloat2;
/* 378:    */     
/* 379:396 */     this.a.d = 4.0F;
/* 380:397 */     this.a.e = -10.0F;
/* 381:398 */     this.l.d = 3.0F;
/* 382:399 */     this.m.e = 14.0F;
/* 383:400 */     this.H.d = 3.0F;
/* 384:401 */     this.H.e = 10.0F;
/* 385:402 */     this.k.f = 0.0F;
/* 386:    */     
/* 387:    */ 
/* 388:405 */     this.a.f = (0.5235988F + f5);
/* 389:406 */     this.a.g = (f4 / 57.295776F);
/* 390:    */     
/* 391:    */ 
/* 392:    */ 
/* 393:    */ 
/* 394:411 */     this.a.f = (f7 * (0.261799F + f5) + f6 * 2.18166F + (1.0F - Math.max(f7, f6)) * this.a.f);
/* 395:412 */     this.a.g = (f7 * f4 / 57.295776F + (1.0F - Math.max(f7, f6)) * this.a.g);
/* 396:    */     
/* 397:414 */     this.a.d = (f7 * -6.0F + f6 * 11.0F + (1.0F - Math.max(f7, f6)) * this.a.d);
/* 398:415 */     this.a.e = (f7 * -1.0F + f6 * -10.0F + (1.0F - Math.max(f7, f6)) * this.a.e);
/* 399:    */     
/* 400:417 */     this.l.d = (f7 * 9.0F + f8 * this.l.d);
/* 401:418 */     this.m.e = (f7 * 18.0F + f8 * this.m.e);
/* 402:419 */     this.H.d = (f7 * 5.5F + f8 * this.H.d);
/* 403:420 */     this.H.e = (f7 * 15.0F + f8 * this.H.e);
/* 404:421 */     this.k.f = (f7 * -45.0F / 57.295776F + f8 * this.k.f);
/* 405:    */     
/* 406:    */ 
/* 407:424 */     this.d.d = this.a.d;
/* 408:425 */     this.e.d = this.a.d;
/* 409:426 */     this.f.d = this.a.d;
/* 410:427 */     this.g.d = this.a.d;
/* 411:428 */     this.h.d = this.a.d;
/* 412:429 */     this.b.d = 0.02F;
/* 413:430 */     this.c.d = 0.0F;
/* 414:431 */     this.j.d = this.a.d;
/* 415:    */     
/* 416:433 */     this.d.e = this.a.e;
/* 417:434 */     this.e.e = this.a.e;
/* 418:435 */     this.f.e = this.a.e;
/* 419:436 */     this.g.e = this.a.e;
/* 420:437 */     this.h.e = this.a.e;
/* 421:438 */     this.b.e = (0.02F - f9 * 1.0F);
/* 422:439 */     this.c.e = (0.0F + f9 * 1.0F);
/* 423:440 */     this.j.e = this.a.e;
/* 424:    */     
/* 425:442 */     this.d.f = this.a.f;
/* 426:443 */     this.e.f = this.a.f;
/* 427:444 */     this.f.f = this.a.f;
/* 428:445 */     this.g.f = this.a.f;
/* 429:446 */     this.h.f = this.a.f;
/* 430:447 */     this.b.f = (0.0F - 0.09424778F * f9);
/* 431:448 */     this.c.f = (0.0F + 0.1570796F * f9);
/* 432:    */     
/* 433:450 */     this.j.f = this.a.f;
/* 434:    */     
/* 435:452 */     this.d.g = this.a.g;
/* 436:453 */     this.e.g = this.a.g;
/* 437:454 */     this.f.g = this.a.g;
/* 438:455 */     this.g.g = this.a.g;
/* 439:456 */     this.h.g = this.a.g;
/* 440:457 */     this.b.g = 0.0F;
/* 441:458 */     this.c.g = 0.0F;
/* 442:459 */     this.j.g = this.a.g;
/* 443:    */     
/* 444:    */ 
/* 445:462 */     this.G.f = (f12 / 5.0F);
/* 446:463 */     this.H.f = (-f12 / 5.0F);
/* 447:    */     
/* 448:    */ 
/* 449:    */ 
/* 450:    */ 
/* 451:    */ 
/* 452:469 */     float f13 = 1.570796F;
/* 453:470 */     float f14 = 4.712389F;
/* 454:471 */     float f15 = -1.047198F;
/* 455:472 */     float f16 = 0.261799F * f7;
/* 456:473 */     float f17 = MathUtils.cos(f10 * 0.6F + 3.141593F);
/* 457:    */     
/* 458:475 */     this.A.d = (-2.0F * f7 + 9.0F * f8);
/* 459:476 */     this.A.e = (-2.0F * f7 + -8.0F * f8);
/* 460:477 */     this.D.d = this.A.d;
/* 461:478 */     this.D.e = this.A.e;
/* 462:    */     
/* 463:480 */     this.v.d = (this.o.d + MathUtils.sin(1.570796F + f16 + f8 * -f11 * 0.5F * paramFloat2) * 7.0F);
/* 464:481 */     this.v.e = (this.o.e + MathUtils.cos(4.712389F + f16 + f8 * -f11 * 0.5F * paramFloat2) * 7.0F);
/* 465:    */     
/* 466:483 */     this.y.d = (this.x.d + MathUtils.sin(1.570796F + f16 + f8 * f11 * 0.5F * paramFloat2) * 7.0F);
/* 467:484 */     this.y.e = (this.x.e + MathUtils.cos(4.712389F + f16 + f8 * f11 * 0.5F * paramFloat2) * 7.0F);
/* 468:    */     
/* 469:486 */     float f18 = (-1.047198F + f17) * f7 + f12 * f8;
/* 470:487 */     float f19 = (-1.047198F + -f17) * f7 + -f12 * f8;
/* 471:488 */     this.B.d = (this.A.d + MathUtils.sin(1.570796F + f18) * 7.0F);
/* 472:489 */     this.B.e = (this.A.e + MathUtils.cos(4.712389F + f18) * 7.0F);
/* 473:    */     
/* 474:491 */     this.E.d = (this.D.d + MathUtils.sin(1.570796F + f19) * 7.0F);
/* 475:492 */     this.E.e = (this.D.e + MathUtils.cos(4.712389F + f19) * 7.0F);
/* 476:    */     
/* 477:494 */     this.o.f = (f16 + -f11 * 0.5F * paramFloat2 * f8);
/* 478:495 */     this.v.f = (-0.0872665F * f7 + (-f11 * 0.5F * paramFloat2 - Math.max(0.0F, f11 * 0.5F * paramFloat2)) * f8);
/* 479:496 */     this.w.f = this.v.f;
/* 480:    */     
/* 481:498 */     this.x.f = (f16 + f11 * 0.5F * paramFloat2 * f8);
/* 482:499 */     this.y.f = (-0.0872665F * f7 + (f11 * 0.5F * paramFloat2 - Math.max(0.0F, -f11 * 0.5F * paramFloat2)) * f8);
/* 483:500 */     this.z.f = this.y.f;
/* 484:    */     
/* 485:502 */     this.A.f = f18;
/* 486:503 */     this.B.f = ((this.A.f + 3.141593F * Math.max(0.0F, 0.2F + f17 * 0.2F)) * f7 + (f12 + Math.max(0.0F, f11 * 0.5F * paramFloat2)) * f8);
/* 487:504 */     this.C.f = this.B.f;
/* 488:    */     
/* 489:506 */     this.D.f = f19;
/* 490:507 */     this.E.f = ((this.D.f + 3.141593F * Math.max(0.0F, 0.2F - f17 * 0.2F)) * f7 + (-f12 + Math.max(0.0F, -f11 * 0.5F * paramFloat2)) * f8);
/* 491:508 */     this.F.f = this.E.f;
/* 492:    */     
/* 493:    */ 
/* 494:511 */     this.w.d = this.v.d;
/* 495:512 */     this.w.e = this.v.e;
/* 496:513 */     this.z.d = this.y.d;
/* 497:514 */     this.z.e = this.y.e;
/* 498:515 */     this.C.d = this.B.d;
/* 499:516 */     this.C.e = this.B.e;
/* 500:517 */     this.F.d = this.E.d;
/* 501:518 */     this.F.e = this.E.e;
/* 502:520 */     if (bool)
/* 503:    */     {
/* 504:521 */       this.I.d = (f7 * 0.5F + f8 * 2.0F);
/* 505:522 */       this.I.e = (f7 * 11.0F + f8 * 2.0F);
/* 506:    */       
/* 507:524 */       this.J.d = this.I.d;
/* 508:525 */       this.K.d = this.I.d;
/* 509:526 */       this.L.d = this.I.d;
/* 510:527 */       this.N.d = this.I.d;
/* 511:528 */       this.M.d = this.I.d;
/* 512:529 */       this.O.d = this.I.d;
/* 513:530 */       this.G.d = this.H.d;
/* 514:    */       
/* 515:532 */       this.J.e = this.I.e;
/* 516:533 */       this.K.e = this.I.e;
/* 517:534 */       this.L.e = this.I.e;
/* 518:535 */       this.N.e = this.I.e;
/* 519:536 */       this.M.e = this.I.e;
/* 520:537 */       this.O.e = this.I.e;
/* 521:538 */       this.G.e = this.H.e;
/* 522:    */       
/* 523:540 */       this.I.f = this.k.f;
/* 524:541 */       this.J.f = this.k.f;
/* 525:542 */       this.K.f = this.k.f;
/* 526:    */       
/* 527:544 */       this.R.d = this.a.d;
/* 528:545 */       this.S.d = this.a.d;
/* 529:546 */       this.i.d = this.a.d;
/* 530:547 */       this.P.d = this.a.d;
/* 531:548 */       this.Q.d = this.a.d;
/* 532:    */       
/* 533:550 */       this.R.e = this.a.e;
/* 534:551 */       this.S.e = this.a.e;
/* 535:552 */       this.i.e = this.a.e;
/* 536:553 */       this.P.e = this.a.e;
/* 537:554 */       this.Q.e = this.a.e;
/* 538:    */       
/* 539:556 */       this.R.f = f5;
/* 540:557 */       this.S.f = f5;
/* 541:558 */       this.i.f = this.a.f;
/* 542:559 */       this.P.f = this.a.f;
/* 543:560 */       this.Q.f = this.a.f;
/* 544:561 */       this.i.g = this.a.g;
/* 545:562 */       this.P.g = this.a.g;
/* 546:563 */       this.R.g = this.a.g;
/* 547:564 */       this.Q.g = this.a.g;
/* 548:565 */       this.S.g = this.a.g;
/* 549:567 */       if (i2 != 0)
/* 550:    */       {
/* 551:568 */         this.L.f = -1.047198F;
/* 552:569 */         this.M.f = -1.047198F;
/* 553:570 */         this.N.f = -1.047198F;
/* 554:571 */         this.O.f = -1.047198F;
/* 555:    */         
/* 556:573 */         this.L.h = 0.0F;
/* 557:574 */         this.M.h = 0.0F;
/* 558:575 */         this.N.h = 0.0F;
/* 559:576 */         this.O.h = 0.0F;
/* 560:    */       }
/* 561:    */       else
/* 562:    */       {
/* 563:578 */         this.L.f = (f12 / 3.0F);
/* 564:579 */         this.M.f = (f12 / 3.0F);
/* 565:580 */         this.N.f = (f12 / 3.0F);
/* 566:581 */         this.O.f = (f12 / 3.0F);
/* 567:    */         
/* 568:583 */         this.L.h = (f12 / 5.0F);
/* 569:584 */         this.M.h = (f12 / 5.0F);
/* 570:585 */         this.N.h = (-f12 / 5.0F);
/* 571:586 */         this.O.h = (-f12 / 5.0F);
/* 572:    */       }
/* 573:    */     }
/* 574:591 */     f13 = -1.3089F + paramFloat2 * 1.5F;
/* 575:592 */     if (f13 > 0.0F) {
/* 576:593 */       f13 = 0.0F;
/* 577:    */     }
/* 578:596 */     if (i1 != 0)
/* 579:    */     {
/* 580:597 */       this.l.g = MathUtils.cos(f10 * 0.7F);
/* 581:598 */       f13 = 0.0F;
/* 582:    */     }
/* 583:    */     else
/* 584:    */     {
/* 585:600 */       this.l.g = 0.0F;
/* 586:    */     }
/* 587:602 */     this.m.g = this.l.g;
/* 588:603 */     this.n.g = this.l.g;
/* 589:    */     
/* 590:605 */     this.m.d = this.l.d;
/* 591:606 */     this.n.d = this.l.d;
/* 592:607 */     this.m.e = this.l.e;
/* 593:608 */     this.n.e = this.l.e;
/* 594:    */     
/* 595:    */ 
/* 596:611 */     this.l.f = f13;
/* 597:612 */     this.m.f = f13;
/* 598:613 */     this.n.f = (-0.2618F + f13);
/* 599:    */   }
/* 600:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccj
 * JD-Core Version:    0.7.0.1
 */
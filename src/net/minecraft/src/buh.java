package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   4:    */ import org.apache.logging.log4j.LogManager;
/*   5:    */ import org.apache.logging.log4j.Logger;
/*   6:    */ 
/*   7:    */ public class buh
/*   8:    */   extends bub
/*   9:    */ {
/*  10: 21 */   private static final Logger a = LogManager.getLogger();
/*  11:    */   private final bsu f;
/*  12: 25 */   private final List<String> g = Lists.newArrayList();
/*  13: 26 */   private final List<bsq> h = Lists.newArrayList();
/*  14: 27 */   private final List<bsq> i = Lists.newArrayList();
/*  15:    */   private int j;
/*  16:    */   private boolean k;
/*  17:    */   
/*  18:    */   public buh(bsu parambsu)
/*  19:    */   {
/*  20: 32 */     this.f = parambsu;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void a(int paramInt)
/*  24:    */   {
/*  25: 36 */     if (this.f.t.l == ahg.HIDDEN) {
/*  26: 37 */       return;
/*  27:    */     }
/*  28: 40 */     int m = i();
/*  29: 41 */     int n = 0;
/*  30: 42 */     int i1 = 0;
/*  31: 43 */     int i2 = this.i.size();
/*  32: 44 */     float f1 = this.f.t.p * 0.9F + 0.1F;
/*  33: 46 */     if (i2 <= 0) {
/*  34: 47 */       return;
/*  35:    */     }
/*  36: 50 */     if (e()) {
/*  37: 51 */       n = 1;
/*  38:    */     }
/*  39: 54 */     float f2 = h();
/*  40: 55 */     int i3 = MathUtils.ceil(f() / f2);
/*  41:    */     
/*  42: 57 */     cjm.glPushMatrix();
/*  43: 58 */     cjm.glTranslatef(2.0F, 20.0F, 0.0F);
/*  44: 59 */     cjm.glScalef(f2, f2, 1.0F);
/*  45:    */     int i6;
/*  46:    */     int i9;
/*  47:    */     int i10;
/*  48: 61 */     for (int i4 = 0; (i4 + this.j < this.i.size()) && (i4 < m); i4++)
/*  49:    */     {
/*  50: 62 */       bsq localbsq = (bsq)this.i.get(i4 + this.j);
/*  51: 63 */       if (localbsq != null)
/*  52:    */       {
/*  53: 66 */         i6 = paramInt - localbsq.b();
/*  54: 68 */         if ((i6 < 200) || (n != 0))
/*  55:    */         {
/*  56: 69 */           double d = i6 / 200.0D;
/*  57: 70 */           d = 1.0D - d;
/*  58: 71 */           d *= 10.0D;
/*  59: 72 */           d = MathUtils.clamp(d, 0.0D, 1.0D);
/*  60: 73 */           d *= d;
/*  61: 74 */           i9 = (int)(255.0D * d);
/*  62: 75 */           if (n != 0) {
/*  63: 76 */             i9 = 255;
/*  64:    */           }
/*  65: 78 */           i9 = (int)(i9 * f1);
/*  66:    */           
/*  67: 80 */           i1++;
/*  68: 82 */           if (i9 > 3)
/*  69:    */           {
/*  70: 83 */             i10 = 0;
/*  71: 84 */             int i11 = -i4 * 9;
/*  72: 85 */             a(i10, i11 - 9, i10 + i3 + 4, i11, i9 / 2 << 24);
/*  73:    */             
/*  74: 87 */             String str = localbsq.a().d();
/*  75:    */             
/*  76: 89 */             cjm.enableBlend();
/*  77: 90 */             this.f.k.a(str, i10, i11 - 8, 16777215 + (i9 << 24));
/*  78: 91 */             cjm.disableAlphaTest();
/*  79: 92 */             cjm.disableBlend();
/*  80:    */           }
/*  81:    */         }
/*  82:    */       }
/*  83:    */     }
/*  84: 97 */     if (n != 0)
/*  85:    */     {
/*  86: 98 */       int i4 = this.f.k.a;
/*  87: 99 */       cjm.glTranslatef(-3.0F, 0.0F, 0.0F);
/*  88:    */       
/*  89:101 */       int i5 = i2 * i4 + i2;
/*  90:102 */       i6 = i1 * i4 + i1;
/*  91:103 */       int i7 = this.j * i6 / i2;
/*  92:104 */       int i8 = i6 * i6 / i5;
/*  93:106 */       if (i5 != i6)
/*  94:    */       {
/*  95:107 */         i9 = i7 > 0 ? 170 : 96;
/*  96:108 */         i10 = this.k ? 13382451 : 3355562;
/*  97:    */         
/*  98:110 */         a(0, -i7, 2, -i7 - i8, i10 + (i9 << 24));
/*  99:111 */         a(2, -i7, 1, -i7 - i8, 13421772 + (i9 << 24));
/* 100:    */       }
/* 101:    */     }
/* 102:115 */     cjm.glPopMatrix();
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void a()
/* 106:    */   {
/* 107:119 */     this.i.clear();
/* 108:120 */     this.h.clear();
/* 109:121 */     this.g.clear();
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void a(ho paramho)
/* 113:    */   {
/* 114:125 */     a(paramho, 0);
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void a(ho paramho, int paramInt)
/* 118:    */   {
/* 119:129 */     a(paramho, paramInt, this.f.q.e(), false);
/* 120:130 */     a.info("[CHAT] " + paramho.c());
/* 121:    */   }
/* 122:    */   
/* 123:    */   private void a(ho paramho, int paramInt1, int paramInt2, boolean paramBoolean)
/* 124:    */   {
/* 125:134 */     if (paramInt1 != 0) {
/* 126:135 */       c(paramInt1);
/* 127:    */     }
/* 128:138 */     int m = MathUtils.floor(f() / h());
/* 129:139 */     List<ho> localList = bui.a(paramho, m, this.f.k, false, false);
/* 130:    */     
/* 131:141 */     boolean bool = e();
/* 132:142 */     for (ho localho : localList)
/* 133:    */     {
/* 134:143 */       if ((bool) && (this.j > 0))
/* 135:    */       {
/* 136:144 */         this.k = true;
/* 137:145 */         b(1);
/* 138:    */       }
/* 139:148 */       this.i.add(0, new bsq(paramInt2, localho, paramInt1));
/* 140:    */     }
/* 141:151 */     while (this.i.size() > 100) {
/* 142:152 */       this.i.remove(this.i.size() - 1);
/* 143:    */     }
/* 144:155 */     if (!paramBoolean)
/* 145:    */     {
/* 146:156 */       this.h.add(0, new bsq(paramInt2, paramho, paramInt1));
/* 147:158 */       while (this.h.size() > 100) {
/* 148:159 */         this.h.remove(this.h.size() - 1);
/* 149:    */       }
/* 150:    */     }
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void b()
/* 154:    */   {
/* 155:165 */     this.i.clear();
/* 156:166 */     d();
/* 157:168 */     for (int m = this.h.size() - 1; m >= 0; m--)
/* 158:    */     {
/* 159:169 */       bsq localbsq = (bsq)this.h.get(m);
/* 160:170 */       a(localbsq.a(), localbsq.c(), localbsq.b(), true);
/* 161:    */     }
/* 162:    */   }
/* 163:    */   
/* 164:    */   public List<String> c()
/* 165:    */   {
/* 166:175 */     return this.g;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void a(String paramString)
/* 170:    */   {
/* 171:179 */     if ((this.g.isEmpty()) || (!((String)this.g.get(this.g.size() - 1)).equals(paramString))) {
/* 172:180 */       this.g.add(paramString);
/* 173:    */     }
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void d()
/* 177:    */   {
/* 178:185 */     this.j = 0;
/* 179:186 */     this.k = false;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void b(int paramInt)
/* 183:    */   {
/* 184:190 */     this.j += paramInt;
/* 185:191 */     int m = this.i.size();
/* 186:193 */     if (this.j > m - i()) {
/* 187:194 */       this.j = (m - i());
/* 188:    */     }
/* 189:197 */     if (this.j <= 0)
/* 190:    */     {
/* 191:198 */       this.j = 0;
/* 192:199 */       this.k = false;
/* 193:    */     }
/* 194:    */   }
/* 195:    */   
/* 196:    */   public ho a(int paramInt1, int paramInt2)
/* 197:    */   {
/* 198:204 */     if (!e()) {
/* 199:205 */       return null;
/* 200:    */     }
/* 201:207 */     buf localbuf = new buf(this.f, this.f.d, this.f.e);
/* 202:    */     
/* 203:209 */     int m = localbuf.e();
/* 204:210 */     float f1 = h();
/* 205:211 */     int n = paramInt1 / m - 3;
/* 206:212 */     int i1 = paramInt2 / m - 27;
/* 207:213 */     n = MathUtils.floor(n / f1);
/* 208:214 */     i1 = MathUtils.floor(i1 / f1);
/* 209:216 */     if ((n < 0) || (i1 < 0)) {
/* 210:217 */       return null;
/* 211:    */     }
/* 212:219 */     int i2 = Math.min(i(), this.i.size());
/* 213:221 */     if ((n <= MathUtils.floor(f() / h())) && (i1 < this.f.k.a * i2 + i2))
/* 214:    */     {
/* 215:222 */       int i3 = i1 / this.f.k.a + this.j;
/* 216:    */       int i4;
/* 217:223 */       if ((i3 >= 0) && (i3 < this.i.size()))
/* 218:    */       {
/* 219:224 */         bsq localbsq = (bsq)this.i.get(i3);
/* 220:225 */         i4 = 0;
/* 221:227 */         for (ho localho : localbsq.a()) {
/* 222:228 */           if ((localho instanceof hy))
/* 223:    */           {
/* 224:229 */             i4 += this.f.k.a(bui.a(((hy)localho).g(), false));
/* 225:231 */             if (i4 > n) {
/* 226:232 */               return localho;
/* 227:    */             }
/* 228:    */           }
/* 229:    */         }
/* 230:    */       }
/* 231:238 */       return null;
/* 232:    */     }
/* 233:241 */     return null;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public boolean e()
/* 237:    */   {
/* 238:245 */     return this.f.m instanceof bvx;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public void c(int paramInt)
/* 242:    */   {
/* 243:249 */     Iterator<bsq> localIterator = this.i.iterator();
/* 244:    */     bsq localbsq;
/* 245:251 */     while (localIterator.hasNext())
/* 246:    */     {
/* 247:252 */       localbsq = (bsq)localIterator.next();
/* 248:254 */       if (localbsq.c() == paramInt) {
/* 249:255 */         localIterator.remove();
/* 250:    */       }
/* 251:    */     }
/* 252:259 */     localIterator = this.h.iterator();
/* 253:261 */     while (localIterator.hasNext())
/* 254:    */     {
/* 255:262 */       localbsq = (bsq)localIterator.next();
/* 256:264 */       if (localbsq.c() == paramInt)
/* 257:    */       {
/* 258:265 */         localIterator.remove();
/* 259:266 */         break;
/* 260:    */       }
/* 261:    */     }
/* 262:    */   }
/* 263:    */   
/* 264:    */   public int f()
/* 265:    */   {
/* 266:272 */     return a(this.f.t.E);
/* 267:    */   }
/* 268:    */   
/* 269:    */   public int g()
/* 270:    */   {
/* 271:276 */     return b(e() ? this.f.t.G : this.f.t.F);
/* 272:    */   }
/* 273:    */   
/* 274:    */   public float h()
/* 275:    */   {
/* 276:280 */     return this.f.t.D;
/* 277:    */   }
/* 278:    */   
/* 279:    */   public static int a(float paramFloat)
/* 280:    */   {
/* 281:284 */     int m = 320;
/* 282:285 */     int n = 40;
/* 283:286 */     return MathUtils.floor(paramFloat * (m - n) + n);
/* 284:    */   }
/* 285:    */   
/* 286:    */   public static int b(float paramFloat)
/* 287:    */   {
/* 288:290 */     int m = 180;
/* 289:291 */     int n = 20;
/* 290:292 */     return MathUtils.floor(paramFloat * (m - n) + n);
/* 291:    */   }
/* 292:    */   
/* 293:    */   public int i()
/* 294:    */   {
/* 295:296 */     return g() / 9;
/* 296:    */   }
/* 297:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     buh
 * JD-Core Version:    0.7.0.1
 */
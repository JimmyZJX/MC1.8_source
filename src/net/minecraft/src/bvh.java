package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Ordering;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.List;
/*   5:    */ 
/*   6:    */ public class bvh
/*   7:    */   extends bub
/*   8:    */ {
/*   9: 30 */   private static final Ordering<ces> a = Ordering.from(new bvj(null));
/*  10:    */   private final bsu f;
/*  11:    */   private final btz g;
/*  12:    */   private ho h;
/*  13:    */   private ho i;
/*  14:    */   private long j;
/*  15:    */   private boolean k;
/*  16:    */   
/*  17:    */   public bvh(bsu parambsu, btz parambtz)
/*  18:    */   {
/*  19: 49 */     this.f = parambsu;
/*  20: 50 */     this.g = parambtz;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public String a(ces paramces)
/*  24:    */   {
/*  25: 54 */     if (paramces.k() != null) {
/*  26: 55 */       return paramces.k().d();
/*  27:    */     }
/*  28: 57 */     return brz.a(paramces.i(), paramces.a().getName());
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void a(boolean paramBoolean)
/*  32:    */   {
/*  33: 62 */     if ((paramBoolean) && (!this.k)) {
/*  34: 63 */       this.j = bsu.I();
/*  35:    */     }
/*  36: 65 */     this.k = paramBoolean;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void a(int paramInt, bsd parambsd, bry parambry)
/*  40:    */   {
/*  41: 69 */     cee localcee = this.f.h.a;
/*  42: 70 */     List<ces> localList1 = a.sortedCopy(localcee.d());
/*  43:    */     
/*  44: 72 */     int m = 0;
/*  45: 73 */     int n = 0;
/*  46: 74 */     for (Iterator<ces> localIterator1 = localList1.iterator(); localIterator1.hasNext();)
/*  47:    */     {
/*  48: 74 */       ces localces2 = localIterator1.next();
/*  49: 75 */       int i2 = this.f.k.a(a(localces2));
/*  50: 76 */       m = Math.max(m, i2);
/*  51: 78 */       if ((parambry != null) && (parambry.e() != bsl.b))
/*  52:    */       {
/*  53: 79 */         i2 = this.f.k.a(" " + parambsd.c(localces2.a().getName(), parambry).c());
/*  54: 80 */         n = Math.max(n, i2);
/*  55:    */       }
/*  56:    */     }
/*  57: 84 */     localList1 = localList1.subList(0, Math.min(localList1.size(), 80));
/*  58:    */     
/*  59: 86 */     int i_8 = localList1.size();
/*  60: 87 */     int i1 = i_8;
/*  61: 88 */     int i2 = 1;
/*  62:    */     
/*  63: 89 */     while (i1 > 20)
/*  64:    */     {
/*  65: 90 */       i2++;
/*  66: 91 */       i1 = (i_8 + i2 - 1) / i2;
/*  67:    */     }
/*  68: 94 */     int i3 = (this.f.D()) || (this.f.t().a().f()) ? 1 : 0;
/*  69:    */     int i4;
/*  70: 97 */     if (parambry != null)
/*  71:    */     {
/*  72: 98 */       if (parambry.e() == bsl.b) {
/*  73: 99 */         i4 = 90;
/*  74:    */       } else {
/*  75:101 */         i4 = n;
/*  76:    */       }
/*  77:    */     }
/*  78:    */     else {
/*  79:104 */       i4 = 0;
/*  80:    */     }
/*  81:107 */     int i5 = Math.min(i2 * ((i3 != 0 ? 9 : 0) + m + i4 + 13), paramInt - 50) / i2;
/*  82:    */     
/*  83:109 */     int i6 = paramInt / 2 - (i5 * i2 + (i2 - 1) * 5) / 2;
/*  84:110 */     int i7 = 10;
/*  85:    */     
/*  86:112 */     int i8 = i5 * i2 + (i2 - 1) * 5;
/*  87:113 */     List<String> localList2 = null;
/*  88:114 */     List<String> localList3 = null;
/*  89:    */     Iterator<String> localIterator2;
/*  90:116 */     if (this.i != null)
/*  91:    */     {
/*  92:117 */       localList2 = this.f.k.c(this.i.d(), paramInt - 50);
/*  93:118 */       for (localIterator2 = localList2.iterator(); localIterator2.hasNext();)
/*  94:    */       {
/*  95:118 */         String str1 = (String)localIterator2.next();
/*  96:119 */         i8 = Math.max(i8, this.f.k.a(str1));
/*  97:    */       }
/*  98:    */     }
/*  99:    */     String str1;
/* 100:123 */     if (this.h != null)
/* 101:    */     {
/* 102:124 */       localList3 = this.f.k.c(this.h.d(), paramInt - 50);
/* 103:125 */       for (localIterator2 = localList3.iterator(); localIterator2.hasNext();)
/* 104:    */       {
/* 105:125 */         str1 = (String)localIterator2.next();
/* 106:126 */         i8 = Math.max(i8, this.f.k.a(str1));
/* 107:    */       }
/* 108:    */     }
/* 109:    */     int i11;
/* 110:130 */     if (localList2 != null)
/* 111:    */     {
/* 112:131 */       a(paramInt / 2 - i8 / 2 - 1, i7 - 1, paramInt / 2 + i8 / 2 + 1, i7 + localList2.size() * this.f.k.a, -2147483648);
/* 113:132 */       for (localIterator2 = localList2.iterator(); localIterator2.hasNext();)
/* 114:    */       {
/* 115:132 */         str1 = (String)localIterator2.next();
/* 116:133 */         i11 = this.f.k.a(str1);
/* 117:134 */         this.f.k.a(str1, paramInt / 2 - i11 / 2, i7, -1);
/* 118:135 */         i7 += this.f.k.a;
/* 119:    */       }
/* 120:137 */       i7++;
/* 121:    */     }
/* 122:140 */     a(paramInt / 2 - i8 / 2 - 1, i7 - 1, paramInt / 2 + i8 / 2 + 1, i7 + i1 * 9, -2147483648);
/* 123:142 */     for (int i9 = 0; i9 < i_8; i9++)
/* 124:    */     {
/* 125:143 */       int i10 = i9 / i1;
/* 126:144 */       i11 = i9 % i1;
/* 127:145 */       int i12 = i6 + i10 * i5 + i10 * 5;
/* 128:146 */       int i13 = i7 + i11 * 9;
/* 129:    */       
/* 130:148 */       a(i12, i13, i12 + i5, i13 + 8, 553648127);
/* 131:149 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 132:150 */       cjm.enableAlphaTest();
/* 133:151 */       cjm.enableBlend();
/* 134:152 */       cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 135:154 */       if (i9 < localList1.size())
/* 136:    */       {
/* 137:155 */         ces localces3 = (ces)localList1.get(i9);
/* 138:156 */         String str3 = a(localces3);
/* 139:158 */         if (i3 != 0)
/* 140:    */         {
/* 141:159 */           this.f.N().a(localces3.g());
/* 142:160 */           bub.a(i12, i13, 8.0F, 8.0F, 8, 8, 8, 8, 64.0F, 64.0F);
/* 143:161 */           EntityPlayer localahd = this.f.f.b(localces3.a().getId());
/* 144:162 */           if ((localahd != null) && (localahd.a(ahh.g))) {
/* 145:163 */             bub.a(i12, i13, 40.0F, 8.0F, 8, 8, 8, 8, 64.0F, 64.0F);
/* 146:    */           }
/* 147:165 */           i12 += 9;
/* 148:    */         }
/* 149:168 */         if (localces3.b() == EnumGameMode.SPECTATOR)
/* 150:    */         {
/* 151:169 */           str3 = net.minecraft.src.a.u + str3;
/* 152:170 */           this.f.k.a(str3, i12, i13, -1862270977);
/* 153:    */         }
/* 154:    */         else
/* 155:    */         {
/* 156:172 */           this.f.k.a(str3, i12, i13, -1);
/* 157:    */         }
/* 158:175 */         if ((parambry != null) && (localces3.b() != EnumGameMode.SPECTATOR))
/* 159:    */         {
/* 160:176 */           int i14 = i12 + m + 1;
/* 161:177 */           int i15 = i14 + i4;
/* 162:179 */           if (i15 - i14 > 5) {
/* 163:180 */             a(parambry, i13, localces3.a().getName(), i14, i15, localces3);
/* 164:    */           }
/* 165:    */         }
/* 166:184 */         a(i5, i12 - (i3 != 0 ? 9 : 0), i13, localces3);
/* 167:    */       }
/* 168:    */     }
/* 169:188 */     if (localList3 != null)
/* 170:    */     {
/* 171:189 */       i7 += i1 * 9 + 1;
/* 172:190 */       a(paramInt / 2 - i8 / 2 - 1, i7 - 1, paramInt / 2 + i8 / 2 + 1, i7 + localList3.size() * this.f.k.a, -2147483648);
/* 173:191 */       for (String str2 : localList3)
/* 174:    */       {
/* 175:192 */         i11 = this.f.k.a(str2);
/* 176:193 */         this.f.k.a(str2, paramInt / 2 - i11 / 2, i7, -1);
/* 177:194 */         i7 += this.f.k.a;
/* 178:    */       }
/* 179:    */     }
/* 180:    */   }
/* 181:    */   
/* 182:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, ces paramces)
/* 183:    */   {
/* 184:200 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 185:201 */     this.f.N().a(d);
/* 186:202 */     int m = 0;
/* 187:203 */     int n = 0;
/* 188:205 */     if (paramces.c() < 0) {
/* 189:206 */       n = 5;
/* 190:207 */     } else if (paramces.c() < 150) {
/* 191:208 */       n = 0;
/* 192:209 */     } else if (paramces.c() < 300) {
/* 193:210 */       n = 1;
/* 194:211 */     } else if (paramces.c() < 600) {
/* 195:212 */       n = 2;
/* 196:213 */     } else if (paramces.c() < 1000) {
/* 197:214 */       n = 3;
/* 198:    */     } else {
/* 199:216 */       n = 4;
/* 200:    */     }
/* 201:219 */     this.e += 100.0F;
/* 202:220 */     b(paramInt2 + paramInt1 - 11, paramInt3, 0 + m * 10, 176 + n * 8, 10, 8);
/* 203:221 */     this.e -= 100.0F;
/* 204:    */   }
/* 205:    */   
/* 206:    */   private void a(bry parambry, int paramInt1, String paramString, int paramInt2, int paramInt3, ces paramces)
/* 207:    */   {
/* 208:225 */     int m = parambry.a().c(paramString, parambry).c();
/* 209:227 */     if (parambry.e() == bsl.b)
/* 210:    */     {
/* 211:228 */       this.f.N().a(d);
/* 212:230 */       if (this.j == paramces.p()) {
/* 213:231 */         if (m < paramces.l())
/* 214:    */         {
/* 215:232 */           paramces.a(bsu.I());
/* 216:233 */           paramces.b(this.g.e() + 20);
/* 217:    */         }
/* 218:234 */         else if (m > paramces.l())
/* 219:    */         {
/* 220:235 */           paramces.a(bsu.I());
/* 221:236 */           paramces.b(this.g.e() + 10);
/* 222:    */         }
/* 223:    */       }
/* 224:240 */       if ((bsu.I() - paramces.n() > 1000L) || (this.j != paramces.p()))
/* 225:    */       {
/* 226:241 */         paramces.b(m);
/* 227:242 */         paramces.c(m);
/* 228:243 */         paramces.a(bsu.I());
/* 229:    */       }
/* 230:245 */       paramces.c(this.j);
/* 231:246 */       paramces.b(m);
/* 232:    */       
/* 233:248 */       int n = MathUtils.ceil(Math.max(m, paramces.m()) / 2.0F);
/* 234:249 */       int i1 = Math.max(MathUtils.ceil(m / 2), Math.max(MathUtils.ceil(paramces.m() / 2), 10));
/* 235:250 */       int i2 = (paramces.o() > this.g.e()) && ((paramces.o() - this.g.e()) / 3L % 2L == 1L) ? 1 : 0;
/* 236:252 */       if (n > 0)
/* 237:    */       {
/* 238:253 */         float f1 = Math.min((paramInt3 - paramInt2 - 4) / i1, 9.0F);
/* 239:254 */         if (f1 > 3.0F)
/* 240:    */         {
/* 241:256 */           for (int i3 = n; i3 < i1; i3++) {
/* 242:257 */             a(paramInt2 + i3 * f1, paramInt1, i2 != 0 ? 25 : 16, 0, 9, 9);
/* 243:    */           }
/* 244:261 */           for (int i3 = 0; i3 < n; i3++)
/* 245:    */           {
/* 246:262 */             a(paramInt2 + i3 * f1, paramInt1, i2 != 0 ? 25 : 16, 0, 9, 9);
/* 247:264 */             if (i2 != 0)
/* 248:    */             {
/* 249:265 */               if (i3 * 2 + 1 < paramces.m()) {
/* 250:266 */                 a(paramInt2 + i3 * f1, paramInt1, 70, 0, 9, 9);
/* 251:    */               }
/* 252:268 */               if (i3 * 2 + 1 == paramces.m()) {
/* 253:269 */                 a(paramInt2 + i3 * f1, paramInt1, 79, 0, 9, 9);
/* 254:    */               }
/* 255:    */             }
/* 256:273 */             if (i3 * 2 + 1 < m) {
/* 257:274 */               a(paramInt2 + i3 * f1, paramInt1, i3 >= 10 ? 160 : 52, 0, 9, 9);
/* 258:    */             }
/* 259:276 */             if (i3 * 2 + 1 == m) {
/* 260:277 */               a(paramInt2 + i3 * f1, paramInt1, i3 >= 10 ? 169 : 61, 0, 9, 9);
/* 261:    */             }
/* 262:    */           }
/* 263:    */         }
/* 264:    */         else
/* 265:    */         {
/* 266:281 */           float f2 = MathUtils.clamp(m / 20.0F, 0.0F, 1.0F);
/* 267:282 */           int i4 = (int)((1.0F - f2) * 255.0F) << 16 | (int)(f2 * 255.0F) << 8;
/* 268:283 */           String str2 = "" + m / 2.0F;
/* 269:284 */           if (paramInt3 - this.f.k.a(str2 + "hp") >= paramInt2) {
/* 270:285 */             str2 = str2 + "hp";
/* 271:    */           }
/* 272:288 */           this.f.k.a(str2, (paramInt3 + paramInt2) / 2 - this.f.k.a(str2) / 2, paramInt1, i4);
/* 273:    */         }
/* 274:    */       }
/* 275:    */     }
/* 276:    */     else
/* 277:    */     {
/* 278:292 */       String str1 = net.minecraft.src.a.o + "" + m;
/* 279:    */       
/* 280:294 */       this.f.k.a(str1, paramInt3 - this.f.k.a(str1), paramInt1, 16777215);
/* 281:    */     }
/* 282:    */   }
/* 283:    */   
/* 284:    */   public void a(ho paramho)
/* 285:    */   {
/* 286:299 */     this.h = paramho;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public void b(ho paramho)
/* 290:    */   {
/* 291:303 */     this.i = paramho;
/* 292:    */   }
/* 293:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvh
 * JD-Core Version:    0.7.0.1
 */
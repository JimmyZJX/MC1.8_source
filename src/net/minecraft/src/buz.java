package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class buz
/*   5:    */   extends buu<bvd>
/*   6:    */ {
/*   7: 17 */   private final List<bvd> u = Lists.newArrayList();
/*   8: 18 */   private final um v = new um();
/*   9: 19 */   private final List<bul> w = Lists.newArrayList();
/*  10:    */   private final bvf[][] x;
/*  11:    */   private int y;
/*  12:    */   private bvb z;
/*  13:    */   private bub A;
/*  14:    */   
/*  15:    */   public buz(bsu parambsu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, bvb parambvb, bvf[]... paramVarArgs)
/*  16:    */   {
/*  17: 26 */     super(parambsu, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  18: 27 */     this.z = parambvb;
/*  19: 28 */     this.x = paramVarArgs;
/*  20: 29 */     this.k = false;
/*  21:    */     
/*  22: 31 */     s();
/*  23: 32 */     t();
/*  24:    */   }
/*  25:    */   
/*  26:    */   private void s()
/*  27:    */   {
/*  28: 36 */     for (bvf[] arrayOfbvf1 : this.x) {
/*  29: 37 */       for (int k = 0; k < arrayOfbvf1.length; k += 2)
/*  30:    */       {
/*  31: 38 */         bvf localbvf1 = arrayOfbvf1[k];
/*  32: 39 */         bvf localbvf2 = k < arrayOfbvf1.length - 1 ? arrayOfbvf1[(k + 1)] : null;
/*  33: 40 */         bub localbub1 = a(localbvf1, 0, localbvf2 == null);
/*  34: 41 */         bub localbub2 = a(localbvf2, 160, localbvf1 == null);
/*  35: 42 */         bvd localbvd = new bvd(localbub1, localbub2);
/*  36: 43 */         this.u.add(localbvd);
/*  37: 44 */         if ((localbvf1 != null) && (localbub1 != null))
/*  38:    */         {
/*  39: 45 */           this.v.a(localbvf1.b(), localbub1);
/*  40: 46 */           if ((localbub1 instanceof bul)) {
/*  41: 47 */             this.w.add((bul)localbub1);
/*  42:    */           }
/*  43:    */         }
/*  44: 50 */         if ((localbvf2 != null) && (localbub2 != null))
/*  45:    */         {
/*  46: 51 */           this.v.a(localbvf2.b(), localbub2);
/*  47: 52 */           if ((localbub2 instanceof bul)) {
/*  48: 53 */             this.w.add((bul)localbub2);
/*  49:    */           }
/*  50:    */         }
/*  51:    */       }
/*  52:    */     }
/*  53:    */   }
/*  54:    */   
/*  55:    */   private void t()
/*  56:    */   {
/*  57: 61 */     this.u.clear();
/*  58: 62 */     for (int i = 0; i < this.x[this.y].length; i += 2)
/*  59:    */     {
/*  60: 63 */       bvf localbvf = this.x[this.y][i];
/*  61: 64 */       bvf localObject = i < this.x[this.y].length - 1 ? this.x[this.y][(i + 1)] : null;
/*  62: 65 */       bub localbub1 = (bub)this.v.a(localbvf.b());
/*  63: 66 */       bub localbub2 = localObject != null ? (bub)this.v.a(localObject.b()) : null;
/*  64: 67 */       bvd localbvd = new bvd(localbub1, localbub2);
/*  65: 68 */       this.u.add(localbvd);
/*  66:    */     }
/*  67:    */   }
/*  68:    */   
/*  69:    */   public int e()
/*  70:    */   {
/*  71: 73 */     return this.y;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public int f()
/*  75:    */   {
/*  76: 77 */     return this.x.length;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public bub g()
/*  80:    */   {
/*  81: 81 */     return this.A;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void h()
/*  85:    */   {
/*  86: 85 */     if (this.y > 0)
/*  87:    */     {
/*  88: 86 */       int i = this.y;
/*  89: 87 */       this.y -= 1;
/*  90: 88 */       t();
/*  91: 89 */       e(i, this.y);
/*  92: 90 */       this.n = 0.0F;
/*  93:    */     }
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void i()
/*  97:    */   {
/*  98: 95 */     if (this.y < this.x.length - 1)
/*  99:    */     {
/* 100: 96 */       int i = this.y;
/* 101: 97 */       this.y += 1;
/* 102: 98 */       t();
/* 103: 99 */       e(i, this.y);
/* 104:100 */       this.n = 0.0F;
/* 105:    */     }
/* 106:    */   }
/* 107:    */   
/* 108:    */   public bub c(int paramInt)
/* 109:    */   {
/* 110:105 */     return (bub)this.v.a(paramInt);
/* 111:    */   }
/* 112:    */   
/* 113:    */   private void e(int paramInt1, int paramInt2)
/* 114:    */   {
/* 115:    */     
/* 116:109 */     for (bvf localbvf : this.x[paramInt1]) {
/* 117:110 */       if (localbvf != null) {
/* 118:113 */         a((bub)this.v.a(localbvf.b()), false);
/* 119:    */       }
/* 120:    */     }
/* 121:115 */     for (bvf localbvf : this.x[paramInt2]) {
/* 122:116 */       if (localbvf != null) {
/* 123:119 */         a((bub)this.v.a(localbvf.b()), true);
/* 124:    */       }
/* 125:    */     }
/* 126:    */   }
/* 127:    */   
/* 128:    */   private void a(bub parambub, boolean paramBoolean)
/* 129:    */   {
/* 130:124 */     if ((parambub instanceof bug)) {
/* 131:125 */       ((bug)parambub).m = paramBoolean;
/* 132:126 */     } else if ((parambub instanceof bul)) {
/* 133:127 */       ((bul)parambub).e(paramBoolean);
/* 134:128 */     } else if ((parambub instanceof buo)) {
/* 135:129 */       ((buo)parambub).j = paramBoolean;
/* 136:    */     }
/* 137:    */   }
/* 138:    */   
/* 139:    */   private bub a(bvf parambvf, int paramInt, boolean paramBoolean)
/* 140:    */   {
/* 141:135 */     if ((parambvf instanceof bvg)) {
/* 142:136 */       return a(this.b / 2 - 155 + paramInt, 0, (bvg)parambvf);
/* 143:    */     }
/* 144:137 */     if ((parambvf instanceof bva)) {
/* 145:138 */       return a(this.b / 2 - 155 + paramInt, 0, (bva)parambvf);
/* 146:    */     }
/* 147:139 */     if ((parambvf instanceof bvc)) {
/* 148:140 */       return a(this.b / 2 - 155 + paramInt, 0, (bvc)parambvf);
/* 149:    */     }
/* 150:141 */     if ((parambvf instanceof bve)) {
/* 151:142 */       return a(this.b / 2 - 155 + paramInt, 0, (bve)parambvf, paramBoolean);
/* 152:    */     }
/* 153:144 */     return null;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public boolean b(int paramInt1, int paramInt2, int paramInt3)
/* 157:    */   {
/* 158:149 */     boolean bool = super.b(paramInt1, paramInt2, paramInt3);
/* 159:150 */     int i = c(paramInt1, paramInt2);
/* 160:151 */     if (i >= 0)
/* 161:    */     {
/* 162:152 */       bvd localbvd = b(i);
/* 163:153 */       if ((this.A != bvd.a(localbvd)) && (this.A != null) && ((this.A instanceof bul))) {
/* 164:154 */         ((bul)this.A).b(false);
/* 165:    */       }
/* 166:156 */       this.A = bvd.a(localbvd);
/* 167:    */     }
/* 168:158 */     return bool;
/* 169:    */   }
/* 170:    */   
/* 171:    */   private bum a(int paramInt1, int paramInt2, bvg parambvg)
/* 172:    */   {
/* 173:162 */     bum localbum = new bum(this.z, parambvg.b(), paramInt1, paramInt2, parambvg.c(), parambvg.e(), parambvg.f(), parambvg.g(), parambvg.a());
/* 174:163 */     localbum.m = parambvg.d();
/* 175:164 */     return localbum;
/* 176:    */   }
/* 177:    */   
/* 178:    */   private bur a(int paramInt1, int paramInt2, bva parambva)
/* 179:    */   {
/* 180:168 */     bur localbur = new bur(this.z, parambva.b(), paramInt1, paramInt2, parambva.c(), parambva.a());
/* 181:169 */     localbur.m = parambva.d();
/* 182:170 */     return localbur;
/* 183:    */   }
/* 184:    */   
/* 185:    */   private bul a(int paramInt1, int paramInt2, bvc parambvc)
/* 186:    */   {
/* 187:174 */     bul localbul = new bul(parambvc.b(), this.a.k, paramInt1, paramInt2, 150, 20);
/* 188:175 */     localbul.a(parambvc.c());
/* 189:176 */     localbul.a(this.z);
/* 190:177 */     localbul.e(parambvc.d());
/* 191:178 */     localbul.a(parambvc.a());
/* 192:179 */     return localbul;
/* 193:    */   }
/* 194:    */   
/* 195:    */   private buo a(int paramInt1, int paramInt2, bve parambve, boolean paramBoolean)
/* 196:    */   {
/* 197:    */     buo localbuo;
/* 198:184 */     if (paramBoolean) {
/* 199:185 */       localbuo = new buo(this.a.k, parambve.b(), paramInt1, paramInt2, this.b - paramInt1 * 2, 20, -1);
/* 200:    */     } else {
/* 201:187 */       localbuo = new buo(this.a.k, parambve.b(), paramInt1, paramInt2, 150, 20, -1);
/* 202:    */     }
/* 203:189 */     localbuo.j = parambve.d();
/* 204:190 */     localbuo.a(parambve.c());
/* 205:191 */     localbuo.a();
/* 206:192 */     return localbuo;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void a(char paramChar, int paramInt)
/* 210:    */   {
/* 211:196 */     if (!(this.A instanceof bul)) {
/* 212:197 */       return;
/* 213:    */     }
/* 214:200 */     bul localbul = (bul)this.A;
/* 215:    */     int k;
/* 216:202 */     if (bxf.e(paramInt))
/* 217:    */     {
/* 218:203 */       String str1 = bxf.o();
/* 219:204 */       String[] arrayOfString1 = str1.split(";");
/* 220:205 */       k = this.w.indexOf(this.A);
/* 221:206 */       int m = k;
/* 222:207 */       for (String str2 : arrayOfString1)
/* 223:    */       {
/* 224:208 */         ((bul)this.w.get(m)).a(str2);
/* 225:209 */         if (m == this.w.size() - 1) {
/* 226:210 */           m = 0;
/* 227:    */         } else {
/* 228:212 */           m++;
/* 229:    */         }
/* 230:214 */         if (m == k) {
/* 231:    */           break;
/* 232:    */         }
/* 233:    */       }
/* 234:218 */       return;
/* 235:    */     }
/* 236:221 */     if (paramInt == 15)
/* 237:    */     {
/* 238:222 */       localbul.b(false);
/* 239:223 */       int i = this.w.indexOf(this.A);
/* 240:224 */       if (bxf.r())
/* 241:    */       {
/* 242:225 */         if (i == 0) {
/* 243:226 */           i = this.w.size() - 1;
/* 244:    */         } else {
/* 245:228 */           i--;
/* 246:    */         }
/* 247:    */       }
/* 248:231 */       else if (i == this.w.size() - 1) {
/* 249:232 */         i = 0;
/* 250:    */       } else {
/* 251:234 */         i++;
/* 252:    */       }
/* 253:237 */       this.A = ((bub)this.w.get(i));
/* 254:238 */       localbul = (bul)this.A;
/* 255:239 */       localbul.b(true);
/* 256:240 */       int j = localbul.f + this.h;
/* 257:241 */       k = localbul.f;
/* 258:242 */       if (j > this.e) {
/* 259:243 */         this.n += j - this.e;
/* 260:244 */       } else if (k < this.d) {
/* 261:245 */         this.n = k;
/* 262:    */       }
/* 263:    */     }
/* 264:    */     else
/* 265:    */     {
/* 266:248 */       localbul.a(paramChar, paramInt);
/* 267:    */     }
/* 268:    */   }
/* 269:    */   
/* 270:    */   public bvd b(int paramInt)
/* 271:    */   {
/* 272:254 */     return (bvd)this.u.get(paramInt);
/* 273:    */   }
/* 274:    */   
/* 275:    */   public int b()
/* 276:    */   {
/* 277:259 */     return this.u.size();
/* 278:    */   }
/* 279:    */   
/* 280:    */   public int c()
/* 281:    */   {
/* 282:264 */     return 400;
/* 283:    */   }
/* 284:    */   
/* 285:    */   protected int d()
/* 286:    */   {
/* 287:269 */     return super.d() + 32;
/* 288:    */   }
/* 289:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     buz
 * JD-Core Version:    0.7.0.1
 */
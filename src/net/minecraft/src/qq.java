package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.List;
/*   4:    */ import net.minecraft.server.MinecraftServer;
/*   5:    */ import org.apache.logging.log4j.LogManager;
/*   6:    */ import org.apache.logging.log4j.Logger;
/*   7:    */ 
/*   8:    */ public class qq
/*   9:    */ {
/*  10: 22 */   private static final Logger a = LogManager.getLogger();
/*  11:    */   private final WorldServer b;
/*  12:177 */   private final List c = Lists.newArrayList();
/*  13:178 */   private final LongHashMap d = new LongHashMap();
/*  14:179 */   private final List e = Lists.newArrayList();
/*  15:180 */   private final List f = Lists.newArrayList();
/*  16:    */   private int g;
/*  17:    */   private long h;
/*  18:    */   
/*  19:    */   public qq(WorldServer paramqt)
/*  20:    */   {
/*  21:185 */     this.b = paramqt;
/*  22:    */     
/*  23:187 */     a(paramqt.r().an().t());
/*  24:    */   }
/*  25:    */   
/*  26:    */   public WorldServer a()
/*  27:    */   {
/*  28:191 */     return this.b;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void b()
/*  32:    */   {
/*  33:195 */     long l = this.b.K();
/*  34:    */     int j;
/*  35:    */     qr localqr;
/*  36:197 */     if (l - this.h > 8000L)
/*  37:    */     {
/*  38:198 */       this.h = l;
/*  39:200 */       for (j = 0; j < this.f.size(); j++)
/*  40:    */       {
/*  41:201 */         localqr = (qr)this.f.get(j);
/*  42:202 */         localqr.b();
/*  43:203 */         localqr.a();
/*  44:    */       }
/*  45:    */     }
/*  46:    */     else
/*  47:    */     {
/*  48:206 */       for (j = 0; j < this.e.size(); j++)
/*  49:    */       {
/*  50:207 */         localqr = (qr)this.e.get(j);
/*  51:208 */         localqr.b();
/*  52:    */       }
/*  53:    */     }
/*  54:212 */     this.e.clear();
/*  55:214 */     if (this.c.isEmpty())
/*  56:    */     {
/*  57:215 */       bgd localbgd = this.b.t;
/*  58:216 */       if (!localbgd.e()) {
/*  59:217 */         this.b.b.b();
/*  60:    */       }
/*  61:    */     }
/*  62:    */   }
/*  63:    */   
/*  64:    */   public boolean a(int paramInt1, int paramInt2)
/*  65:    */   {
/*  66:223 */     long l = paramInt1 + 2147483647L | paramInt2 + 2147483647L << 32;
/*  67:224 */     return this.d.getValueByKey(l) != null;
/*  68:    */   }
/*  69:    */   
/*  70:    */   private qr a(int paramInt1, int paramInt2, boolean paramBoolean)
/*  71:    */   {
/*  72:228 */     long l = paramInt1 + 2147483647L | paramInt2 + 2147483647L << 32;
/*  73:229 */     qr localqr = (qr)this.d.getValueByKey(l);
/*  74:230 */     if ((localqr == null) && (paramBoolean))
/*  75:    */     {
/*  76:231 */       localqr = new qr(this, paramInt1, paramInt2);
/*  77:232 */       this.d.add(l, localqr);
/*  78:233 */       this.f.add(localqr);
/*  79:    */     }
/*  80:235 */     return localqr;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void a(BlockPosition paramdt)
/*  84:    */   {
/*  85:239 */     int j = paramdt.getX() >> 4;
/*  86:240 */     int k = paramdt.getZ() >> 4;
/*  87:241 */     qr localqr = a(j, k, false);
/*  88:242 */     if (localqr != null) {
/*  89:243 */       localqr.a(paramdt.getX() & 0xF, paramdt.getY(), paramdt.getZ() & 0xF);
/*  90:    */     }
/*  91:    */   }
/*  92:    */   
/*  93:247 */   private final int[][] i = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
/*  94:    */   
/*  95:    */   public void a(qw paramqw)
/*  96:    */   {
/*  97:255 */     int j = (int)paramqw.xPos >> 4;
/*  98:256 */     int k = (int)paramqw.zPos >> 4;
/*  99:    */     
/* 100:258 */     paramqw.d = paramqw.xPos;
/* 101:259 */     paramqw.e = paramqw.zPos;
/* 102:261 */     for (int m = j - this.g; m <= j + this.g; m++) {
/* 103:262 */       for (int n = k - this.g; n <= k + this.g; n++) {
/* 104:263 */         a(m, n, true).a(paramqw);
/* 105:    */       }
/* 106:    */     }
/* 107:267 */     this.c.add(paramqw);
/* 108:268 */     b(paramqw);
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void b(qw paramqw)
/* 112:    */   {
/* 113:272 */     ArrayList localArrayList = Lists.newArrayList(paramqw.f);
/* 114:273 */     int j = 0;
/* 115:274 */     int k = this.g;
/* 116:275 */     int m = (int)paramqw.xPos >> 4;
/* 117:276 */     int n = (int)paramqw.zPos >> 4;
/* 118:277 */     int i1 = 0;
/* 119:278 */     int i2 = 0;
/* 120:279 */     ChunkID localaqm = qr.a(a(m, n, true));
/* 121:    */     
/* 122:281 */     paramqw.f.clear();
/* 123:284 */     if (localArrayList.contains(localaqm)) {
/* 124:285 */       paramqw.f.add(localaqm);
/* 125:    */     }
/* 126:289 */     for (int i3 = 1; i3 <= k * 2; i3++) {
/* 127:290 */       for (int i4 = 0; i4 < 2; i4++)
/* 128:    */       {
/* 129:291 */         int[] arrayOfInt = this.i[(j++ % 4)];
/* 130:293 */         for (int i5 = 0; i5 < i3; i5++)
/* 131:    */         {
/* 132:294 */           i1 += arrayOfInt[0];
/* 133:295 */           i2 += arrayOfInt[1];
/* 134:    */           
/* 135:297 */           localaqm = qr.a(a(m + i1, n + i2, true));
/* 136:298 */           if (localArrayList.contains(localaqm)) {
/* 137:299 */             paramqw.f.add(localaqm);
/* 138:    */           }
/* 139:    */         }
/* 140:    */       }
/* 141:    */     }
/* 142:306 */     j %= 4;
/* 143:307 */     for (int i3 = 0; i3 < k * 2; i3++)
/* 144:    */     {
/* 145:308 */       i1 += this.i[j][0];
/* 146:309 */       i2 += this.i[j][1];
/* 147:    */       
/* 148:311 */       localaqm = qr.a(a(m + i1, n + i2, true));
/* 149:312 */       if (localArrayList.contains(localaqm)) {
/* 150:313 */         paramqw.f.add(localaqm);
/* 151:    */       }
/* 152:    */     }
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void c(qw paramqw)
/* 156:    */   {
/* 157:319 */     int j = (int)paramqw.d >> 4;
/* 158:320 */     int k = (int)paramqw.e >> 4;
/* 159:322 */     for (int m = j - this.g; m <= j + this.g; m++) {
/* 160:323 */       for (int n = k - this.g; n <= k + this.g; n++)
/* 161:    */       {
/* 162:324 */         qr localqr = a(m, n, false);
/* 163:325 */         if (localqr != null) {
/* 164:326 */           localqr.b(paramqw);
/* 165:    */         }
/* 166:    */       }
/* 167:    */     }
/* 168:331 */     this.c.remove(paramqw);
/* 169:    */   }
/* 170:    */   
/* 171:    */   private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/* 172:    */   {
/* 173:335 */     int j = paramInt1 - paramInt3;
/* 174:336 */     int k = paramInt2 - paramInt4;
/* 175:337 */     if ((j < -paramInt5) || (j > paramInt5)) {
/* 176:338 */       return false;
/* 177:    */     }
/* 178:340 */     if ((k < -paramInt5) || (k > paramInt5)) {
/* 179:341 */       return false;
/* 180:    */     }
/* 181:343 */     return true;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void d(qw paramqw)
/* 185:    */   {
/* 186:347 */     int j = (int)paramqw.xPos >> 4;
/* 187:348 */     int k = (int)paramqw.zPos >> 4;
/* 188:    */     
/* 189:350 */     double d1 = paramqw.d - paramqw.xPos;
/* 190:351 */     double d2 = paramqw.e - paramqw.zPos;
/* 191:352 */     double d3 = d1 * d1 + d2 * d2;
/* 192:353 */     if (d3 < 64.0D) {
/* 193:354 */       return;
/* 194:    */     }
/* 195:357 */     int m = (int)paramqw.d >> 4;
/* 196:358 */     int n = (int)paramqw.e >> 4;
/* 197:359 */     int i1 = this.g;
/* 198:    */     
/* 199:361 */     int i2 = j - m;
/* 200:362 */     int i3 = k - n;
/* 201:363 */     if ((i2 == 0) && (i3 == 0)) {
/* 202:364 */       return;
/* 203:    */     }
/* 204:367 */     for (int i4 = j - i1; i4 <= j + i1; i4++) {
/* 205:368 */       for (int i5 = k - i1; i5 <= k + i1; i5++)
/* 206:    */       {
/* 207:369 */         if (!a(i4, i5, m, n, i1)) {
/* 208:370 */           a(i4, i5, true).a(paramqw);
/* 209:    */         }
/* 210:372 */         if (!a(i4 - i2, i5 - i3, j, k, i1))
/* 211:    */         {
/* 212:373 */           qr localqr = a(i4 - i2, i5 - i3, false);
/* 213:374 */           if (localqr != null) {
/* 214:375 */             localqr.b(paramqw);
/* 215:    */           }
/* 216:    */         }
/* 217:    */       }
/* 218:    */     }
/* 219:381 */     b(paramqw);
/* 220:    */     
/* 221:383 */     paramqw.d = paramqw.xPos;
/* 222:384 */     paramqw.e = paramqw.zPos;
/* 223:    */   }
/* 224:    */   
/* 225:    */   public boolean a(qw paramqw, int paramInt1, int paramInt2)
/* 226:    */   {
/* 227:388 */     qr localqr = a(paramInt1, paramInt2, false);
/* 228:    */     
/* 229:390 */     return (localqr != null) && (qr.b(localqr).contains(paramqw)) && (!paramqw.f.contains(qr.a(localqr)));
/* 230:    */   }
/* 231:    */   
/* 232:    */   public void a(int paramInt)
/* 233:    */   {
/* 234:394 */     paramInt = MathUtils.clamp(paramInt, 3, 32);
/* 235:395 */     if (paramInt == this.g) {
/* 236:396 */       return;
/* 237:    */     }
/* 238:398 */     int j = paramInt - this.g;
/* 239:    */     
/* 240:400 */     ArrayList<qw> localArrayList = Lists.newArrayList(this.c);
/* 241:401 */     for (qw localqw : localArrayList)
/* 242:    */     {
/* 243:402 */       int k = (int)localqw.xPos >> 4;
/* 244:403 */       int m = (int)localqw.zPos >> 4;
/* 245:    */       int n;
/* 246:    */       int i1;
/* 247:405 */       if (j > 0) {
/* 248:406 */         for (n = k - paramInt; n <= k + paramInt; n++) {
/* 249:407 */           for (i1 = m - paramInt; i1 <= m + paramInt; i1++)
/* 250:    */           {
/* 251:408 */             qr localqr = a(n, i1, true);
/* 252:410 */             if (!qr.b(localqr).contains(localqw)) {
/* 253:411 */               localqr.a(localqw);
/* 254:    */             }
/* 255:    */           }
/* 256:    */         }
/* 257:    */       } else {
/* 258:416 */         for (n = k - this.g; n <= k + this.g; n++) {
/* 259:417 */           for (i1 = m - this.g; i1 <= m + this.g; i1++) {
/* 260:418 */             if (!a(n, i1, k, m, paramInt)) {
/* 261:419 */               a(n, i1, true).b(localqw);
/* 262:    */             }
/* 263:    */           }
/* 264:    */         }
/* 265:    */       }
/* 266:    */     }
/* 267:426 */     this.g = paramInt;
/* 268:    */   }
/* 269:    */   
/* 270:    */   public static int b(int paramInt)
/* 271:    */   {
/* 272:430 */     return paramInt * 16 - 16;
/* 273:    */   }
				static Logger c() {return a;}
				static WorldServer a(qq arg0) {return arg0.b;}
				static LongHashMap b(qq arg0) {return arg0.d;}
				static List c(qq arg0) {return arg0.f;}
				static List d(qq arg0) {return arg0.e;}
/* 274:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     qq
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class aiq
/*   5:    */   extends aib
/*   6:    */ {
/*   7: 21 */   public vq a = new air(this, "Enchant", true, 2);
/*   8:    */   private World i;
/*   9:    */   private BlockPosition j;
/*  10: 38 */   private Random k = new Random();
/*  11:    */   public int f;
/*  12: 41 */   public int[] g = new int[3];
/*  13: 42 */   public int[] h = { -1, -1, -1 };
/*  14:    */   
/*  15:    */   public aiq(ahb paramahb, World paramaqu)
/*  16:    */   {
/*  17: 46 */     this(paramahb, paramaqu, BlockPosition.zero);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public aiq(ahb paramahb, World paramaqu, BlockPosition paramdt)
/*  21:    */   {
/*  22: 50 */     this.i = paramaqu;
/*  23: 51 */     this.j = paramdt;
/*  24: 52 */     this.f = paramahb.d.ci();
/*  25: 53 */     a(new ais(this, this.a, 0, 15, 47));
/*  26:    */     
/*  27:    */ 
/*  28:    */ 
/*  29:    */ 
/*  30:    */ 
/*  31:    */ 
/*  32:    */ 
/*  33:    */ 
/*  34:    */ 
/*  35:    */ 
/*  36:    */ 
/*  37: 65 */     a(new ait(this, this.a, 1, 35, 47));
/*  38: 72 */     for (int m = 0; m < 3; m++) {
/*  39: 73 */       for (int n = 0; n < 9; n++) {
/*  40: 74 */         a(new ajk(paramahb, n + m * 9 + 9, 8 + n * 18, 84 + m * 18));
/*  41:    */       }
/*  42:    */     }
/*  43: 77 */     for (int m = 0; m < 9; m++) {
/*  44: 78 */       a(new ajk(paramahb, m, 8 + m * 18, 142));
/*  45:    */     }
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void a(ail paramail)
/*  49:    */   {
/*  50: 84 */     super.a(paramail);
/*  51:    */     
/*  52: 86 */     paramail.a(this, 0, this.g[0]);
/*  53: 87 */     paramail.a(this, 1, this.g[1]);
/*  54: 88 */     paramail.a(this, 2, this.g[2]);
/*  55: 89 */     paramail.a(this, 3, this.f & 0xFFFFFFF0);
/*  56: 90 */     paramail.a(this, 4, this.h[0]);
/*  57: 91 */     paramail.a(this, 5, this.h[1]);
/*  58: 92 */     paramail.a(this, 6, this.h[2]);
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void b()
/*  62:    */   {
/*  63: 97 */     super.b();
/*  64: 99 */     for (int m = 0; m < this.e.size(); m++)
/*  65:    */     {
/*  66:100 */       ail localail = (ail)this.e.get(m);
/*  67:101 */       localail.a(this, 0, this.g[0]);
/*  68:102 */       localail.a(this, 1, this.g[1]);
/*  69:103 */       localail.a(this, 2, this.g[2]);
/*  70:104 */       localail.a(this, 3, this.f & 0xFFFFFFF0);
/*  71:105 */       localail.a(this, 4, this.h[0]);
/*  72:106 */       localail.a(this, 5, this.h[1]);
/*  73:107 */       localail.a(this, 6, this.h[2]);
/*  74:    */     }
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void b(int paramInt1, int paramInt2)
/*  78:    */   {
/*  79:113 */     if ((paramInt1 >= 0) && (paramInt1 <= 2)) {
/*  80:114 */       this.g[paramInt1] = paramInt2;
/*  81:115 */     } else if (paramInt1 == 3) {
/*  82:116 */       this.f = paramInt2;
/*  83:117 */     } else if ((paramInt1 >= 4) && (paramInt1 <= 6)) {
/*  84:118 */       this.h[(paramInt1 - 4)] = paramInt2;
/*  85:    */     } else {
/*  86:120 */       super.b(paramInt1, paramInt2);
/*  87:    */     }
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void a(vq paramvq)
/*  91:    */   {
/*  92:126 */     if (paramvq == this.a)
/*  93:    */     {
/*  94:127 */       ItemStack localamj = paramvq.a(0);
/*  95:    */       int m;
/*  96:129 */       if ((localamj == null) || (!localamj.v()))
/*  97:    */       {
/*  98:130 */         for (m = 0; m < 3; m++)
/*  99:    */         {
/* 100:131 */           this.g[m] = 0;
/* 101:132 */           this.h[m] = -1;
/* 102:    */         }
/* 103:    */       }
/* 104:135 */       else if (!this.i.isClient)
/* 105:    */       {
/* 106:137 */         m = 0;
/* 107:139 */         for (int n = -1; n <= 1; n++) {
/* 108:140 */           for (int i1 = -1; i1 <= 1; i1++) {
/* 109:141 */             if ((n != 0) || (i1 != 0)) {
/* 110:145 */               if ((this.i.isEmpty(this.j.offset(i1, 0, n))) && (this.i.isEmpty(this.j.offset(i1, 1, n))))
/* 111:    */               {
/* 112:146 */                 if (this.i.getBlock(this.j.offset(i1 * 2, 0, n * 2)).getProto() == BlockList.bookshelf) {
/* 113:147 */                   m++;
/* 114:    */                 }
/* 115:149 */                 if (this.i.getBlock(this.j.offset(i1 * 2, 1, n * 2)).getProto() == BlockList.bookshelf) {
/* 116:150 */                   m++;
/* 117:    */                 }
/* 118:153 */                 if ((i1 != 0) && (n != 0))
/* 119:    */                 {
/* 120:154 */                   if (this.i.getBlock(this.j.offset(i1 * 2, 0, n)).getProto() == BlockList.bookshelf) {
/* 121:155 */                     m++;
/* 122:    */                   }
/* 123:157 */                   if (this.i.getBlock(this.j.offset(i1 * 2, 1, n)).getProto() == BlockList.bookshelf) {
/* 124:158 */                     m++;
/* 125:    */                   }
/* 126:160 */                   if (this.i.getBlock(this.j.offset(i1, 0, n * 2)).getProto() == BlockList.bookshelf) {
/* 127:161 */                     m++;
/* 128:    */                   }
/* 129:163 */                   if (this.i.getBlock(this.j.offset(i1, 1, n * 2)).getProto() == BlockList.bookshelf) {
/* 130:164 */                     m++;
/* 131:    */                   }
/* 132:    */                 }
/* 133:    */               }
/* 134:    */             }
/* 135:    */           }
/* 136:    */         }
/* 137:170 */         this.k.setSeed(this.f);
/* 138:171 */         for (int n = 0; n < 3; n++)
/* 139:    */         {
/* 140:172 */           this.g[n] = aph.a(this.k, n, m, localamj);
/* 141:173 */           this.h[n] = -1;
/* 142:175 */           if (this.g[n] < n + 1) {
/* 143:176 */             this.g[n] = 0;
/* 144:    */           }
/* 145:    */         }
/* 146:179 */         for (int n = 0; n < 3; n++) {
/* 147:180 */           if (this.g[n] > 0)
/* 148:    */           {
/* 149:181 */             List localList = a(localamj, n, this.g[n]);
/* 150:182 */             if ((localList != null) && (!localList.isEmpty()))
/* 151:    */             {
/* 152:183 */               apo localapo = (apo)localList.get(this.k.nextInt(localList.size()));
/* 153:184 */               this.h[n] = (localapo.b.B | localapo.c << 8);
/* 154:    */             }
/* 155:    */           }
/* 156:    */         }
/* 157:189 */         b();
/* 158:    */       }
/* 159:    */     }
/* 160:    */   }
/* 161:    */   
/* 162:    */   public boolean a(EntityPlayer paramahd, int paramInt)
/* 163:    */   {
/* 164:197 */     ItemStack localamj1 = this.a.a(0);
/* 165:198 */     ItemStack localamj2 = this.a.a(1);
/* 166:    */     
/* 167:200 */     int m = paramInt + 1;
/* 168:202 */     if (((localamj2 == null) || (localamj2.stackSize < m)) && (!paramahd.by.d)) {
/* 169:203 */       return false;
/* 170:    */     }
/* 171:205 */     if ((this.g[paramInt] > 0) && (localamj1 != null) && (((paramahd.bz >= m) && (paramahd.bz >= this.g[paramInt])) || (paramahd.by.d)))
/* 172:    */     {
/* 173:206 */       if (!this.i.isClient)
/* 174:    */       {
/* 175:207 */         List localList = a(localamj1, paramInt, this.g[paramInt]);
/* 176:208 */         int n = localamj1.getItem() == ItemList.book ? 1 : 0;
/* 177:210 */         if (localList != null)
/* 178:    */         {
/* 179:211 */           paramahd.b(m);
/* 180:212 */           if (n != 0) {
/* 181:213 */             localamj1.a(ItemList.cd);
/* 182:    */           }
/* 183:216 */           for (int i1 = 0; i1 < localList.size(); i1++)
/* 184:    */           {
/* 185:217 */             apo localapo = (apo)localList.get(i1);
/* 186:219 */             if (n != 0) {
/* 187:220 */               ItemList.cd.a(localamj1, localapo);
/* 188:    */             } else {
/* 189:222 */               localamj1.a(localapo.b, localapo.c);
/* 190:    */             }
/* 191:    */           }
/* 192:227 */           if (!paramahd.by.d)
/* 193:    */           {
/* 194:228 */             localamj2.stackSize -= m;
/* 195:229 */             if (localamj2.stackSize <= 0) {
/* 196:230 */               this.a.a(1, null);
/* 197:    */             }
/* 198:    */           }
/* 199:233 */           this.a.o_();
/* 200:234 */           this.f = paramahd.ci();
/* 201:235 */           a(this.a);
/* 202:    */         }
/* 203:    */       }
/* 204:238 */       return true;
/* 205:    */     }
/* 206:240 */     return false;
/* 207:    */   }
/* 208:    */   
/* 209:    */   private List a(ItemStack paramamj, int paramInt1, int paramInt2)
/* 210:    */   {
/* 211:244 */     this.k.setSeed(this.f + paramInt1);
/* 212:    */     
/* 213:246 */     List localList = aph.b(this.k, paramamj, paramInt2);
/* 214:248 */     if ((paramamj.getItem() == ItemList.book) && (localList != null) && (localList.size() > 1)) {
/* 215:250 */       localList.remove(this.k.nextInt(localList.size()));
/* 216:    */     }
/* 217:252 */     return localList;
/* 218:    */   }
/* 219:    */   
/* 220:    */   public int e()
/* 221:    */   {
/* 222:256 */     ItemStack localamj = this.a.a(1);
/* 223:257 */     if (localamj == null) {
/* 224:258 */       return 0;
/* 225:    */     }
/* 226:260 */     return localamj.stackSize;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void b(EntityPlayer paramahd)
/* 230:    */   {
/* 231:265 */     super.b(paramahd);
/* 232:266 */     if (this.i.isClient) {
/* 233:267 */       return;
/* 234:    */     }
/* 235:270 */     for (int m = 0; m < this.a.n_(); m++)
/* 236:    */     {
/* 237:271 */       ItemStack localamj = this.a.b(m);
/* 238:272 */       if (localamj != null) {
/* 239:273 */         paramahd.a(localamj, false);
/* 240:    */       }
/* 241:    */     }
/* 242:    */   }
/* 243:    */   
/* 244:    */   public boolean a(EntityPlayer paramahd)
/* 245:    */   {
/* 246:280 */     if (this.i.getBlock(this.j).getProto() != BlockList.bC) {
/* 247:281 */       return false;
/* 248:    */     }
/* 249:283 */     if (paramahd.e(this.j.getX() + 0.5D, this.j.getY() + 0.5D, this.j.getZ() + 0.5D) > 64.0D) {
/* 250:284 */       return false;
/* 251:    */     }
/* 252:286 */     return true;
/* 253:    */   }
/* 254:    */   
/* 255:    */   public ItemStack b(EntityPlayer paramahd, int paramInt)
/* 256:    */   {
/* 257:292 */     ItemStack localamj1 = null;
/* 258:293 */     ajk localajk = (ajk)this.c.get(paramInt);
/* 259:294 */     if ((localajk != null) && (localajk.e()))
/* 260:    */     {
/* 261:295 */       ItemStack localamj2 = localajk.d();
/* 262:296 */       localamj1 = localamj2.k();
/* 263:298 */       if (paramInt == 0)
/* 264:    */       {
/* 265:299 */         if (!a(localamj2, 2, 38, true)) {
/* 266:300 */           return null;
/* 267:    */         }
/* 268:    */       }
/* 269:302 */       else if (paramInt == 1)
/* 270:    */       {
/* 271:303 */         if (!a(localamj2, 2, 38, true)) {
/* 272:304 */           return null;
/* 273:    */         }
/* 274:    */       }
/* 275:306 */       else if ((localamj2.getItem() == ItemList.dye) && (EnumDyeColor.fromIndex(localamj2.getDamage2()) == EnumDyeColor.BLUE))
/* 276:    */       {
/* 277:307 */         if (!a(localamj2, 1, 2, true)) {
/* 278:308 */           return null;
/* 279:    */         }
/* 280:    */       }
/* 281:310 */       else if ((!((ajk)this.c.get(0)).e()) && (((ajk)this.c.get(0)).a(localamj2)))
/* 282:    */       {
/* 283:311 */         if ((localamj2.hasTagCompound()) && (localamj2.stackSize == 1))
/* 284:    */         {
/* 285:312 */           ((ajk)this.c.get(0)).d(localamj2.k());
/* 286:313 */           localamj2.stackSize = 0;
/* 287:    */         }
/* 288:314 */         else if (localamj2.stackSize >= 1)
/* 289:    */         {
/* 290:315 */           ((ajk)this.c.get(0)).d(new ItemStack(localamj2.getItem(), 1, localamj2.getDamage2()));
/* 291:316 */           localamj2.stackSize -= 1;
/* 292:    */         }
/* 293:    */       }
/* 294:    */       else {
/* 295:319 */         return null;
/* 296:    */       }
/* 297:321 */       if (localamj2.stackSize == 0) {
/* 298:322 */         localajk.d(null);
/* 299:    */       } else {
/* 300:324 */         localajk.f();
/* 301:    */       }
/* 302:326 */       if (localamj2.stackSize == localamj1.stackSize) {
/* 303:327 */         return null;
/* 304:    */       }
/* 305:329 */       localajk.a(paramahd, localamj2);
/* 306:    */     }
/* 307:332 */     return localamj1;
/* 308:    */   }
/* 309:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aiq
 * JD-Core Version:    0.7.0.1
 */
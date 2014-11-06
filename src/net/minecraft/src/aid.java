package net.minecraft.src;
/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Map;
/*   4:    */ import java.util.Set;
/*   5:    */ import org.apache.commons.lang3.StringUtils;
/*   6:    */ import org.apache.logging.log4j.LogManager;
/*   7:    */ import org.apache.logging.log4j.Logger;
/*   8:    */ 
/*   9:    */ public class aid
/*  10:    */   extends aib
/*  11:    */ {
/*  12: 26 */   private static final Logger f = LogManager.getLogger();
/*  13: 39 */   private vq g = new aji();
/*  14: 40 */   private vq h = new aie(this, "Repair", true, 2);
/*  15:    */   private World i;
/*  16:    */   private BlockPosition j;
/*  17:    */   public int a;
/*  18:    */   private int k;
/*  19:    */   private String l;
/*  20:    */   private final EntityPlayer m;
/*  21:    */   
/*  22:    */   public aid(ahb paramahb, World paramaqu, EntityPlayer paramahd)
/*  23:    */   {
/*  24: 57 */     this(paramahb, paramaqu, BlockPosition.a, paramahd);
/*  25:    */   }
/*  26:    */   
/*  27:    */   public aid(ahb paramahb, World paramaqu, BlockPosition paramdt, EntityPlayer paramahd)
/*  28:    */   {
/*  29: 61 */     this.j = paramdt;
/*  30: 62 */     this.i = paramaqu;
/*  31: 63 */     this.m = paramahd;
/*  32:    */     
/*  33: 65 */     a(new ajk(this.h, 0, 27, 47));
/*  34: 66 */     a(new ajk(this.h, 1, 76, 47));
/*  35: 67 */     a(new aif(this, this.g, 2, 134, 47, paramaqu, paramdt));
/*  36:113 */     for (int n = 0; n < 3; n++) {
/*  37:114 */       for (int i1 = 0; i1 < 9; i1++) {
/*  38:115 */         a(new ajk(paramahb, i1 + n * 9 + 9, 8 + i1 * 18, 84 + n * 18));
/*  39:    */       }
/*  40:    */     }
/*  41:118 */     for (int n = 0; n < 9; n++) {
/*  42:119 */       a(new ajk(paramahb, n, 8 + n * 18, 142));
/*  43:    */     }
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void a(vq paramvq)
/*  47:    */   {
/*  48:125 */     super.a(paramvq);
/*  49:127 */     if (paramvq == this.h) {
/*  50:128 */       e();
/*  51:    */     }
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void e()
/*  55:    */   {
/*  56:143 */     int n = 0;
/*  57:144 */     int i1 = 1;
/*  58:145 */     int i2 = 1;
/*  59:146 */     int i3 = 1;
/*  60:147 */     int i4 = 2;
/*  61:148 */     int i5 = 1;
/*  62:149 */     int i6 = 1;
/*  63:    */     
/*  64:151 */     ItemStack localamj1 = this.h.a(0);
/*  65:152 */     this.a = 1;
/*  66:153 */     int i7 = 0;
/*  67:154 */     int i8 = 0;
/*  68:155 */     int i9 = 0;
/*  69:161 */     if (localamj1 == null)
/*  70:    */     {
/*  71:162 */       this.g.a(0, null);
/*  72:163 */       this.a = 0;
/*  73:164 */       return;
/*  74:    */     }
/*  75:166 */     ItemStack localamj2 = localamj1.k();
/*  76:167 */     ItemStack localamj3 = this.h.a(1);
/*  77:168 */     Map localMap1 = aph.a(localamj2);
/*  78:169 */     int i10 = 0;
/*  79:    */     
/*  80:171 */     i8 += localamj1.getRepairCost() + (localamj3 == null ? 0 : localamj3.getRepairCost());
/*  81:    */     
/*  82:    */ 
/*  83:    */ 
/*  84:    */ 
/*  85:176 */     this.k = 0;
/*  86:    */     int i14;
/*  87:    */     int i16;
/*  88:    */     Map localMap2;
/*  89:    */     Iterator localIterator1;
/*  90:178 */     if (localamj3 != null)
/*  91:    */     {
/*  92:179 */       i10 = (localamj3.getItem() == ItemList.cd) && (ItemList.cd.h(localamj3).c() > 0) ? 1 : 0;
/*  93:    */       int i11;
/*  94:    */       int i13;
/*  95:181 */       if ((localamj2.e()) && (localamj2.getItem().a(localamj1, localamj3)))
/*  96:    */       {
/*  97:182 */         i11 = Math.min(localamj2.h(), localamj2.j() / 4);
/*  98:183 */         if (i11 <= 0)
/*  99:    */         {
/* 100:184 */           this.g.a(0, null);
/* 101:185 */           this.a = 0;
/* 102:186 */           return;
/* 103:    */         }
/* 104:188 */         i13 = 0;
/* 105:189 */         while ((i11 > 0) && (i13 < localamj3.stackSize))
/* 106:    */         {
/* 107:190 */           i14 = localamj2.h() - i11;
/* 108:191 */           localamj2.b(i14);
/* 109:192 */           i7++;
/* 110:    */           
/* 111:194 */           i11 = Math.min(localamj2.h(), localamj2.j() / 4);
/* 112:195 */           i13++;
/* 113:    */         }
/* 114:197 */         this.k = i13;
/* 115:    */       }
/* 116:    */       else
/* 117:    */       {
/* 118:199 */         if ((i10 == 0) && ((localamj2.getItem() != localamj3.getItem()) || (!localamj2.e())))
/* 119:    */         {
/* 120:200 */           this.g.a(0, null);
/* 121:201 */           this.a = 0;
/* 122:202 */           return;
/* 123:    */         }
/* 124:204 */         if ((localamj2.e()) && (i10 == 0))
/* 125:    */         {
/* 126:205 */           i11 = localamj1.j() - localamj1.h();
/* 127:206 */           i13 = localamj3.j() - localamj3.h();
/* 128:207 */           i14 = i13 + localamj2.j() * 12 / 100;
/* 129:208 */           int i15 = i11 + i14;
/* 130:209 */           i16 = localamj2.j() - i15;
/* 131:210 */           if (i16 < 0) {
/* 132:211 */             i16 = 0;
/* 133:    */           }
/* 134:214 */           if (i16 < localamj2.i())
/* 135:    */           {
/* 136:215 */             localamj2.b(i16);
/* 137:216 */             i7 += 2;
/* 138:    */           }
/* 139:    */         }
/* 140:223 */         localMap2 = aph.a(localamj3);
/* 141:225 */         for (localIterator1 = localMap2.keySet().iterator(); localIterator1.hasNext();)
/* 142:    */         {
/* 143:225 */           i14 = ((Integer)localIterator1.next()).intValue();
/* 144:226 */           Enchantment localapf = Enchantment.c(i14);
/* 145:227 */           if (localapf != null)
/* 146:    */           {
/* 147:230 */             i16 = localMap1.containsKey(Integer.valueOf(i14)) ? ((Integer)localMap1.get(Integer.valueOf(i14))).intValue() : 0;
/* 148:231 */             int i17 = ((Integer)localMap2.get(Integer.valueOf(i14))).intValue();
/* 149:232 */             i17++;i17 = i16 == i17 ? i17 : Math.max(i17, i16);
/* 150:233 */             boolean bool = localapf.a(localamj1);
/* 151:235 */             if ((this.m.by.d) || (localamj1.getItem() == ItemList.cd)) {
/* 152:236 */               bool = true;
/* 153:    */             }
/* 154:239 */             for (Iterator localIterator2 = localMap1.keySet().iterator(); localIterator2.hasNext();)
/* 155:    */             {
/* 156:239 */               int i19 = ((Integer)localIterator2.next()).intValue();
/* 157:240 */               if ((i19 != i14) && (!localapf.a(Enchantment.c(i19))))
/* 158:    */               {
/* 159:241 */                 bool = false;
/* 160:242 */                 i7++;
/* 161:    */               }
/* 162:    */             }
/* 163:249 */             if (bool)
/* 164:    */             {
/* 165:252 */               if (i17 > localapf.b()) {
/* 166:253 */                 i17 = localapf.b();
/* 167:    */               }
/* 168:255 */               localMap1.put(Integer.valueOf(i14), Integer.valueOf(i17));
/* 169:256 */               int i18 = 0;
/* 170:258 */               switch (localapf.d())
/* 171:    */               {
/* 172:    */               case 10: 
/* 173:260 */                 i18 = 1;
/* 174:261 */                 break;
/* 175:    */               case 5: 
/* 176:263 */                 i18 = 2;
/* 177:264 */                 break;
/* 178:    */               case 2: 
/* 179:266 */                 i18 = 4;
/* 180:267 */                 break;
/* 181:    */               case 1: 
/* 182:269 */                 i18 = 8;
/* 183:    */               }
/* 184:273 */               if (i10 != 0) {
/* 185:274 */                 i18 = Math.max(1, i18 / 2);
/* 186:    */               }
/* 187:277 */               i7 += i18 * i17;
/* 188:    */             }
/* 189:    */           }
/* 190:    */         }
/* 191:    */       }
/* 192:    */     }
/* 193:285 */     if (StringUtils.isBlank(this.l))
/* 194:    */     {
/* 195:286 */       if (localamj1.s())
/* 196:    */       {
/* 197:287 */         i9 = 1;
/* 198:    */         
/* 199:289 */         i7 += i9;
/* 200:    */         
/* 201:    */ 
/* 202:    */ 
/* 203:    */ 
/* 204:294 */         localamj2.r();
/* 205:    */       }
/* 206:    */     }
/* 207:296 */     else if (!this.l.equals(localamj1.q()))
/* 208:    */     {
/* 209:297 */       i9 = 1;
/* 210:    */       
/* 211:299 */       i7 += i9;
/* 212:    */       
/* 213:    */ 
/* 214:    */ 
/* 215:    */ 
/* 216:304 */       localamj2.c(this.l);
/* 217:    */     }
/* 218:307 */     this.a = (i8 + i7);
/* 219:308 */     if (i7 <= 0) {
/* 220:312 */       localamj2 = null;
/* 221:    */     }
/* 222:314 */     if ((i9 == i7) && (i9 > 0) && (this.a >= 40)) {
/* 223:318 */       this.a = 39;
/* 224:    */     }
/* 225:320 */     if ((this.a >= 40) && (!this.m.by.d)) {
/* 226:324 */       localamj2 = null;
/* 227:    */     }
/* 228:327 */     if (localamj2 != null)
/* 229:    */     {
/* 230:328 */       int i12 = localamj2.getRepairCost();
/* 231:329 */       if ((localamj3 != null) && (i12 < localamj3.getRepairCost())) {
/* 232:330 */         i12 = localamj3.getRepairCost();
/* 233:    */       }
/* 234:332 */       i12 = i12 * 2 + 1;
/* 235:    */       
/* 236:334 */       localamj2.c(i12);
/* 237:335 */       aph.a(localMap1, localamj2);
/* 238:    */     }
/* 239:338 */     this.g.a(0, localamj2);
/* 240:    */     
/* 241:    */ 
/* 242:341 */     b();
/* 243:    */   }
/* 244:    */   
/* 245:    */   public void a(ail paramail)
/* 246:    */   {
/* 247:359 */     super.a(paramail);
/* 248:360 */     paramail.a(this, 0, this.a);
/* 249:    */   }
/* 250:    */   
/* 251:    */   public void b(int paramInt1, int paramInt2)
/* 252:    */   {
/* 253:365 */     if (paramInt1 == 0) {
/* 254:366 */       this.a = paramInt2;
/* 255:    */     }
/* 256:    */   }
/* 257:    */   
/* 258:    */   public void b(EntityPlayer paramahd)
/* 259:    */   {
/* 260:372 */     super.b(paramahd);
/* 261:373 */     if (this.i.isClient) {
/* 262:374 */       return;
/* 263:    */     }
/* 264:377 */     for (int n = 0; n < this.h.n_(); n++)
/* 265:    */     {
/* 266:378 */       ItemStack localamj = this.h.b(n);
/* 267:379 */       if (localamj != null) {
/* 268:380 */         paramahd.a(localamj, false);
/* 269:    */       }
/* 270:    */     }
/* 271:    */   }
/* 272:    */   
/* 273:    */   public boolean a(EntityPlayer paramahd)
/* 274:    */   {
/* 275:387 */     if (this.i.getBlock(this.j).getProto() != BlockList.cf) {
/* 276:388 */       return false;
/* 277:    */     }
/* 278:390 */     if (paramahd.e(this.j.getX() + 0.5D, this.j.getY() + 0.5D, this.j.getZ() + 0.5D) > 64.0D) {
/* 279:391 */       return false;
/* 280:    */     }
/* 281:393 */     return true;
/* 282:    */   }
/* 283:    */   
/* 284:    */   public ItemStack b(EntityPlayer paramahd, int paramInt)
/* 285:    */   {
/* 286:399 */     ItemStack localamj1 = null;
/* 287:400 */     ajk localajk = (ajk)this.c.get(paramInt);
/* 288:401 */     if ((localajk != null) && (localajk.e()))
/* 289:    */     {
/* 290:402 */       ItemStack localamj2 = localajk.d();
/* 291:403 */       localamj1 = localamj2.k();
/* 292:405 */       if (paramInt == 2)
/* 293:    */       {
/* 294:406 */         if (!a(localamj2, 3, 39, true)) {
/* 295:407 */           return null;
/* 296:    */         }
/* 297:409 */         localajk.a(localamj2, localamj1);
/* 298:    */       }
/* 299:410 */       else if ((paramInt == 0) || (paramInt == 1))
/* 300:    */       {
/* 301:411 */         if (!a(localamj2, 3, 39, false)) {
/* 302:412 */           return null;
/* 303:    */         }
/* 304:    */       }
/* 305:414 */       else if ((paramInt >= 3) && (paramInt < 39) && 
/* 306:415 */         (!a(localamj2, 0, 2, false)))
/* 307:    */       {
/* 308:416 */         return null;
/* 309:    */       }
/* 310:419 */       if (localamj2.stackSize == 0) {
/* 311:420 */         localajk.d(null);
/* 312:    */       } else {
/* 313:422 */         localajk.f();
/* 314:    */       }
/* 315:424 */       if (localamj2.stackSize == localamj1.stackSize) {
/* 316:425 */         return null;
/* 317:    */       }
/* 318:427 */       localajk.a(paramahd, localamj2);
/* 319:    */     }
/* 320:430 */     return localamj1;
/* 321:    */   }
/* 322:    */   
/* 323:    */   public void a(String paramString)
/* 324:    */   {
/* 325:434 */     this.l = paramString;
/* 326:436 */     if (a(2).e())
/* 327:    */     {
/* 328:437 */       ItemStack localamj = a(2).d();
/* 329:439 */       if (StringUtils.isBlank(paramString)) {
/* 330:440 */         localamj.r();
/* 331:    */       } else {
/* 332:442 */         localamj.c(this.l);
/* 333:    */       }
/* 334:    */     }
/* 335:446 */     e();
/* 336:    */   }
				static vq a(aid arg0) {return arg0.h;}
				static int b(aid arg0) {return arg0.k;}
/* 337:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aid
 * JD-Core Version:    0.7.0.1
 */
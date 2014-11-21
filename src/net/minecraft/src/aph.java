package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;

/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.HashMap;
/*   5:    */ import java.util.Iterator;
/*   6:    */ import java.util.LinkedHashMap;
/*   7:    */ import java.util.List;
/*   8:    */ import java.util.Map;
/*   9:    */ import java.util.Random;
/*  11:    */ 
/*  12:    */ public class aph
/*  13:    */ {
/*  14: 23 */   private static final Random a = new Random();
/*  15:    */   
/*  16:    */   public static int a(int paramInt, ItemStack stack)
/*  17:    */   {
/*  18: 26 */     if (stack == null) {
/*  19: 27 */       return 0;
/*  20:    */     }
/*  21: 29 */     fv localfv = stack.p();
/*  22: 30 */     if (localfv == null) {
/*  23: 31 */       return 0;
/*  24:    */     }
/*  25: 33 */     for (int i = 0; i < localfv.c(); i++)
/*  26:    */     {
/*  27: 34 */       int id = localfv.b(i).e("id");
/*  28: 35 */       int level = localfv.b(i).e("lvl");
/*  29: 37 */       if (id == paramInt) {
/*  30: 38 */         return level;
/*  31:    */       }
/*  32:    */     }
/*  33: 41 */     return 0;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public static Map<Integer,Integer> a(ItemStack paramamj)
/*  37:    */   {
/*  38: 45 */     LinkedHashMap<Integer,Integer> localLinkedHashMap = Maps.newLinkedHashMap();
/*  39: 46 */     fv localfv = paramamj.getItem() == ItemList.cd ? ItemList.cd.h(paramamj) : paramamj.p();
/*  40: 48 */     if (localfv != null) {
/*  41: 49 */       for (int i = 0; i < localfv.c(); i++)
/*  42:    */       {
/*  43: 50 */         int j = localfv.b(i).e("id");
/*  44: 51 */         int k = localfv.b(i).e("lvl");
/*  45:    */         
/*  46: 53 */         localLinkedHashMap.put(Integer.valueOf(j), Integer.valueOf(k));
/*  47:    */       }
/*  48:    */     }
/*  49: 57 */     return localLinkedHashMap;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public static void a(Map<Integer, Integer> paramMap, ItemStack paramamj)
/*  53:    */   {
/*  54: 61 */     fv localfv = new fv();
/*  55: 63 */     for (Iterator<Integer> localIterator = paramMap.keySet().iterator(); localIterator.hasNext();)
/*  56:    */     {
/*  57: 63 */       int i = localIterator.next().intValue();
/*  58: 64 */       Enchantment localapf = Enchantment.c(i);
/*  59: 65 */       if (localapf != null)
/*  60:    */       {
/*  61: 69 */         NBTTagCompound localfn = new NBTTagCompound();
/*  62:    */         
/*  63: 71 */         localfn.setShort("id", (short)i);
/*  64: 72 */         localfn.setShort("lvl", (short)paramMap.get(Integer.valueOf(i)).intValue());
/*  65:    */         
/*  66: 74 */         localfv.a(localfn);
/*  67: 76 */         if (paramamj.getItem() == ItemList.cd) {
/*  68: 77 */           ItemList.cd.a(paramamj, new apo(localapf, paramMap.get(Integer.valueOf(i)).intValue()));
/*  69:    */         }
/*  70:    */       }
/*  71:    */     }
/*  72: 81 */     if (localfv.c() > 0)
/*  73:    */     {
/*  74: 82 */       if (paramamj.getItem() != ItemList.cd) {
/*  75: 83 */         paramamj.a("ench", localfv);
/*  76:    */       }
/*  77:    */     }
/*  78: 85 */     else if (paramamj.hasTagCompound()) {
/*  79: 86 */       paramamj.getTagCompound().o("ench");
/*  80:    */     }
/*  81:    */   }
/*  82:    */   
/*  83:    */   public static int a(int paramInt, ItemStack[] paramArrayOfamj)
/*  84:    */   {
/*  85: 91 */     if (paramArrayOfamj == null) {
/*  86: 92 */       return 0;
/*  87:    */     }
/*  88: 94 */     int i = 0;
/*  89: 95 */     for (ItemStack localamj : paramArrayOfamj)
/*  90:    */     {
/*  91: 96 */       int m = a(paramInt, localamj);
/*  92: 97 */       if (m > i) {
/*  93: 98 */         i = m;
/*  94:    */       }
/*  95:    */     }
/*  96:101 */     return i;
/*  97:    */   }
/*  98:    */   
/*  99:    */   private static void a(apl paramapl, ItemStack paramamj)
/* 100:    */   {
/* 101:109 */     if (paramamj == null) {
/* 102:110 */       return;
/* 103:    */     }
/* 104:112 */     fv localfv = paramamj.p();
/* 105:113 */     if (localfv == null) {
/* 106:114 */       return;
/* 107:    */     }
/* 108:116 */     for (int i = 0; i < localfv.c(); i++)
/* 109:    */     {
/* 110:117 */       int j = localfv.b(i).e("id");
/* 111:118 */       int k = localfv.b(i).e("lvl");
/* 112:120 */       if (Enchantment.c(j) != null) {
/* 113:121 */         paramapl.a(Enchantment.c(j), k);
/* 114:    */       }
/* 115:    */     }
/* 116:    */   }
/* 117:    */   
/* 118:    */   private static void a(apl paramapl, ItemStack[] paramArrayOfamj)
/* 119:    */   {
/* 120:127 */     for (ItemStack localamj : paramArrayOfamj) {
/* 121:128 */       a(paramapl, localamj);
/* 122:    */     }
/* 123:    */   }
/* 124:    */   
/* 125:142 */   private static final apn b = new apn();
/* 126:    */   
/* 127:    */   public static int a(ItemStack[] paramArrayOfamj, DamageSource paramwh)
/* 128:    */   {
/* 129:152 */     b.a = 0;
/* 130:153 */     b.b = paramwh;
/* 131:    */     
/* 132:155 */     a(b, paramArrayOfamj);
/* 133:157 */     if (b.a > 25) {
/* 134:158 */       b.a = 25;
/* 135:    */     }
/* 136:162 */     return (b.a + 1 >> 1) + a.nextInt((b.a >> 1) + 1);
/* 137:    */   }
/* 138:    */   
/* 139:175 */   private static final apm c = new apm();
/* 140:    */   
/* 141:    */   public static float a(ItemStack paramamj, xs paramxs)
/* 142:    */   {
/* 143:178 */     c.a = 0.0F;
/* 144:179 */     c.b = paramxs;
/* 145:    */     
/* 146:181 */     a(c, paramamj);
/* 147:    */     
/* 148:183 */     return c.a;
/* 149:    */   }
/* 150:    */   
/* 151:196 */   private static final apk d = new apk();
/* 152:    */   
/* 153:    */   public static void a(EntityLiving paramxm, Entity paramwv)
/* 154:    */   {
/* 155:199 */     d.b = paramwv;
/* 156:200 */     d.a = paramxm;
/* 157:201 */     if (paramxm != null) {
/* 158:202 */       a(d, paramxm.at());
/* 159:    */     }
/* 160:204 */     if ((paramwv instanceof EntityPlayer)) {
/* 161:205 */       a(d, paramxm.getHeldItemStack());
/* 162:    */     }
/* 163:    */   }
/* 164:    */   
/* 165:219 */   private static final apj e = new apj();
/* 166:    */   
/* 167:    */   public static void b(EntityLiving paramxm, Entity paramwv)
/* 168:    */   {
/* 169:222 */     e.a = paramxm;
/* 170:223 */     e.b = paramwv;
/* 171:224 */     if (paramxm != null) {
/* 172:225 */       a(e, paramxm.at());
/* 173:    */     }
/* 174:227 */     if ((paramxm instanceof EntityPlayer)) {
/* 175:228 */       a(e, paramxm.getHeldItemStack());
/* 176:    */     }
/* 177:    */   }
/* 178:    */   
/* 179:    */   public static int a(EntityLiving paramxm)
/* 180:    */   {
/* 181:233 */     return a(Enchantment.o.B, paramxm.getHeldItemStack());
/* 182:    */   }
/* 183:    */   
/* 184:    */   public static int b(EntityLiving paramxm)
/* 185:    */   {
/* 186:237 */     return a(Enchantment.p.B, paramxm.getHeldItemStack());
/* 187:    */   }
/* 188:    */   
/* 189:    */   public static int a(Entity paramwv)
/* 190:    */   {
/* 191:241 */     return a(Enchantment.h.B, paramwv.at());
/* 192:    */   }
/* 193:    */   
/* 194:    */   public static int b(Entity paramwv)
/* 195:    */   {
/* 196:245 */     return a(Enchantment.k.B, paramwv.at());
/* 197:    */   }
/* 198:    */   
/* 199:    */   public static int c(EntityLiving paramxm)
/* 200:    */   {
/* 201:249 */     return a(Enchantment.r.B, paramxm.getHeldItemStack());
/* 202:    */   }
/* 203:    */   
/* 204:    */   public static boolean e(EntityLiving paramxm)
/* 205:    */   {
/* 206:257 */     return a(Enchantment.s.B, paramxm.getHeldItemStack()) > 0;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public static int f(EntityLiving paramxm)
/* 210:    */   {
/* 211:261 */     return a(Enchantment.u.B, paramxm.getHeldItemStack());
/* 212:    */   }
/* 213:    */   
/* 214:    */   public static int g(EntityLiving paramxm)
/* 215:    */   {
/* 216:265 */     return a(Enchantment.z.B, paramxm.getHeldItemStack());
/* 217:    */   }
/* 218:    */   
/* 219:    */   public static int h(EntityLiving paramxm)
/* 220:    */   {
/* 221:269 */     return a(Enchantment.A.B, paramxm.getHeldItemStack());
/* 222:    */   }
/* 223:    */   
/* 224:    */   public static int i(EntityLiving paramxm)
/* 225:    */   {
/* 226:273 */     return a(Enchantment.q.B, paramxm.getHeldItemStack());
/* 227:    */   }
/* 228:    */   
/* 229:    */   public static boolean j(EntityLiving paramxm)
/* 230:    */   {
/* 231:277 */     return a(Enchantment.i.B, paramxm.at()) > 0;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public static ItemStack a(Enchantment paramapf, EntityLiving paramxm)
/* 235:    */   {
/* 236:285 */     for (ItemStack localamj : paramxm.at()) {
/* 237:286 */       if ((localamj != null) && (a(paramapf.B, localamj) > 0)) {
/* 238:287 */         return localamj;
/* 239:    */       }
/* 240:    */     }
/* 241:291 */     return null;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public static int a(Random paramRandom, int paramInt1, int paramInt2, ItemStack paramamj)
/* 245:    */   {
/* 246:305 */     Item localalq = paramamj.getItem();
/* 247:306 */     int i = localalq.getItemEnchantability();
/* 248:308 */     if (i <= 0) {
/* 249:310 */       return 0;
/* 250:    */     }
/* 251:313 */     if (paramInt2 > 15) {
/* 252:314 */       paramInt2 = 15;
/* 253:    */     }
/* 254:316 */     int j = paramRandom.nextInt(8) + 1 + (paramInt2 >> 1) + paramRandom.nextInt(paramInt2 + 1);
/* 255:317 */     if (paramInt1 == 0) {
/* 256:318 */       return Math.max(j / 3, 1);
/* 257:    */     }
/* 258:320 */     if (paramInt1 == 1) {
/* 259:321 */       return j * 2 / 3 + 1;
/* 260:    */     }
/* 261:323 */     return Math.max(j, paramInt2 * 2);
/* 262:    */   }
/* 263:    */   
/* 264:    */   public static ItemStack a(Random paramRandom, ItemStack paramamj, int paramInt)
/* 265:    */   {
/* 266:327 */     List<apo> localList = b(paramRandom, paramamj, paramInt);
/* 267:328 */     int i = paramamj.getItem() == ItemList.book ? 1 : 0;
/* 268:330 */     if (i != 0) {
/* 269:331 */       paramamj.a(ItemList.cd);
/* 270:    */     }
/* 271:334 */     if (localList != null) {
/* 272:335 */       for (apo localapo : localList) {
/* 273:336 */         if (i != 0) {
/* 274:337 */           ItemList.cd.a(paramamj, localapo);
/* 275:    */         } else {
/* 276:339 */           paramamj.a(localapo.b, localapo.c);
/* 277:    */         }
/* 278:    */       }
/* 279:    */     }
/* 280:344 */     return paramamj;
/* 281:    */   }
/* 282:    */   
/* 283:    */   public static List<apo> b(Random paramRandom, ItemStack paramamj, int paramInt)
/* 284:    */   {
/* 285:355 */     Item localalq = paramamj.getItem();
/* 286:356 */     int i = localalq.getItemEnchantability();
/* 287:358 */     if (i <= 0) {
/* 288:359 */       return null;
/* 289:    */     }
/* 290:361 */     i /= 2;
/* 291:362 */     i = 1 + paramRandom.nextInt((i >> 1) + 1) + paramRandom.nextInt((i >> 1) + 1);
/* 292:    */     
/* 293:364 */     int j = i + paramInt;
/* 294:    */     
/* 295:    */ 
/* 296:367 */     float f = (paramRandom.nextFloat() + paramRandom.nextFloat() - 1.0F) * 0.15F;
/* 297:368 */     int k = (int)(j * (1.0F + f) + 0.5F);
/* 298:369 */     if (k < 1) {
/* 299:370 */       k = 1;
/* 300:    */     }
/* 301:373 */     ArrayList<apo> localArrayList = null;
/* 302:    */     
/* 303:375 */     Map<Integer,apo> localMap = b(k, paramamj);
/* 304:376 */     if ((localMap != null) && (!localMap.isEmpty()))
/* 305:    */     {
/* 306:377 */       apo localapo1 = (apo)WeightedRandom.getRandomItem(paramRandom, localMap.values());
/* 307:379 */       if (localapo1 != null)
/* 308:    */       {
/* 309:380 */         localArrayList = Lists.newArrayList();
/* 310:381 */         localArrayList.add(localapo1);
/* 311:    */         
/* 312:383 */         int m = k;
/* 313:384 */         while (paramRandom.nextInt(50) <= m)
/* 314:    */         {
/* 315:386 */           Iterator<Integer> localIterator1 = localMap.keySet().iterator();
/* 316:    */           apo localObject;
/* 317:387 */           while (localIterator1.hasNext())
/* 318:    */           {
/* 319:388 */             Integer localInteger = localIterator1.next();
/* 320:389 */             int n = 1;
/* 321:390 */             for (apo localapo2 : localArrayList) {
/* 322:391 */               if (!localapo2.b.a(Enchantment.c(localInteger.intValue())))
/* 323:    */               {
/* 324:392 */                 n = 0;
/* 325:393 */                 break;
/* 326:    */               }
/* 327:    */             }
/* 328:396 */             if (n == 0) {
/* 329:397 */               localIterator1.remove();
/* 330:    */             }
/* 331:    */           }
/* 332:401 */           if (!localMap.isEmpty())
/* 333:    */           {
/* 334:402 */             localObject = (apo)WeightedRandom.getRandomItem(paramRandom, localMap.values());
/* 335:403 */             localArrayList.add(localObject);
/* 336:    */           }
/* 337:406 */           m >>= 1;
/* 338:    */         }
/* 339:    */       }
/* 340:    */     }
/* 341:411 */     return localArrayList;
/* 342:    */   }
/* 343:    */   
/* 344:    */   public static Map<Integer,apo> b(int paramInt, ItemStack paramamj)
/* 345:    */   {
/* 346:415 */     Item localalq = paramamj.getItem();
/* 347:416 */     HashMap<Integer,apo> localHashMap = null;
/* 348:417 */     int i = paramamj.getItem() == ItemList.book ? 1 : 0;
/* 349:419 */     for (Enchantment localapf : Enchantment.b) {
/* 350:420 */       if (localapf != null) {
/* 351:425 */         if ((localapf.C.a(localalq)) || (i != 0)) {
/* 352:429 */           for (int m = localapf.e(); m <= localapf.b(); m++) {
/* 353:430 */             if ((paramInt >= localapf.a(m)) && (paramInt <= localapf.b(m)))
/* 354:    */             {
/* 355:431 */               if (localHashMap == null) {
/* 356:432 */                 localHashMap = Maps.newHashMap();
/* 357:    */               }
/* 358:435 */               localHashMap.put(Integer.valueOf(localapf.B), new apo(localapf, m));
/* 359:    */             }
/* 360:    */           }
/* 361:    */         }
/* 362:    */       }
/* 363:    */     }
/* 364:440 */     return localHashMap;
/* 365:    */   }
/* 366:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aph
 * JD-Core Version:    0.7.0.1
 */
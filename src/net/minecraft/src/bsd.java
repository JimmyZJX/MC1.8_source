package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;

/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.Collection;
/*   5:    */ import java.util.Collections;
/*   6:    */ import java.util.List;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class bsd
/*  10:    */ {
/*  11: 24 */   private final Map<String, bry> a = Maps.newHashMap();
/*  12: 25 */   private final Map<bsk,List<bry>> b = Maps.newHashMap();
/*  13: 26 */   private final Map<String,Map<bry,bsa>> c = Maps.newHashMap();
/*  14: 27 */   private final bry[] d = new bry[19];
/*  15: 28 */   private final Map<String, brz> e = Maps.newHashMap();
/*  16: 29 */   private final Map<String, brz> f = Maps.newHashMap();
/*  17:    */   
/*  18:    */   public bry b(String paramString)
/*  19:    */   {
/*  20: 32 */     return this.a.get(paramString);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public bry a(String paramString, bsk parambsk)
/*  24:    */   {
/*  25: 36 */     bry localbry = b(paramString);
/*  26: 37 */     if (localbry != null) {
/*  27: 38 */       throw new IllegalArgumentException("An objective with the name '" + paramString + "' already exists!");
/*  28:    */     }
/*  29: 41 */     localbry = new bry(this, paramString, parambsk);
/*  30:    */     
/*  31: 43 */     List<bry> localObject = this.b.get(parambsk);
/*  32: 45 */     if (localObject == null)
/*  33:    */     {
/*  34: 46 */       localObject = Lists.newArrayList();
/*  35: 47 */       this.b.put(parambsk, localObject);
/*  36:    */     }
/*  37: 50 */     ((List<bry>)localObject).add(localbry);
/*  38: 51 */     this.a.put(paramString, localbry);
/*  39: 52 */     a(localbry);
/*  40:    */     
/*  41: 54 */     return localbry;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public Collection<bry> a(bsk parambsk)
/*  45:    */   {
/*  46: 58 */     Collection<bry> localCollection = this.b.get(parambsk);
/*  47:    */     
/*  48:    */ 
/*  49: 61 */     return localCollection == null ? Lists.<bry>newArrayList() : Lists.newArrayList(localCollection);
/*  50:    */   }
/*  51:    */   
/*  52:    */   public boolean b(String paramString, bry parambry)
/*  53:    */   {
/*  54: 65 */     Map<bry,bsa> localMap = this.c.get(paramString);
/*  55: 66 */     if (localMap == null) {
/*  56: 67 */       return false;
/*  57:    */     }
/*  58: 69 */     bsa localbsa = localMap.get(parambry);
/*  59: 70 */     if (localbsa == null) {
/*  60: 71 */       return false;
/*  61:    */     }
/*  62: 73 */     return true;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public bsa c(String paramString, bry parambry)
/*  66:    */   {
/*  67: 77 */     Map<bry, bsa> localObject = this.c.get(paramString);
/*  68: 79 */     if (localObject == null)
/*  69:    */     {
/*  70: 80 */       localObject = Maps.newHashMap();
/*  71: 81 */       this.c.put(paramString, localObject);
/*  72:    */     }
/*  73: 84 */     bsa localbsa = ((Map<bry, bsa>)localObject).get(parambry);
/*  74: 86 */     if (localbsa == null)
/*  75:    */     {
/*  76: 87 */       localbsa = new bsa(this, parambry, paramString);
/*  77: 88 */       ((Map<bry, bsa>)localObject).put(parambry, localbsa);
/*  78:    */     }
/*  79: 91 */     return localbsa;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public Collection<bsa> i(bry parambry)
/*  83:    */   {
/*  84: 95 */     ArrayList<bsa> localArrayList = Lists.newArrayList();
/*  85: 97 */     for (Map<bry,bsa> localMap : this.c.values())
/*  86:    */     {
/*  87: 98 */       bsa localbsa = (bsa)localMap.get(parambry);
/*  88: 99 */       if (localbsa != null) {
/*  89:100 */         localArrayList.add(localbsa);
/*  90:    */       }
/*  91:    */     }
/*  92:104 */     Collections.sort(localArrayList, bsa.a);
/*  93:    */     
/*  94:106 */     return localArrayList;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public Collection<bry> c()
/*  98:    */   {
/*  99:110 */     return this.a.values();
/* 100:    */   }
/* 101:    */   
/* 102:    */   public Collection<String> d()
/* 103:    */   {
/* 104:114 */     return this.c.keySet();
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void d(String paramString, bry parambry)
/* 108:    */   {
/* 109:    */     Map<bry,bsa> localMap1;
/* 110:118 */     if (parambry == null)
/* 111:    */     {
/* 112:119 */       localMap1 = this.c.remove(paramString);
/* 113:120 */       if (localMap1 != null) {
/* 114:121 */         a(paramString);
/* 115:    */       }
/* 116:    */     }
/* 117:    */     else
/* 118:    */     {
/* 119:124 */       localMap1 = this.c.get(paramString);
/* 120:125 */       if (localMap1 != null)
/* 121:    */       {
/* 122:126 */         bsa localbsa = (bsa)localMap1.remove(parambry);
/* 123:127 */         if (localMap1.size() < 1)
/* 124:    */         {
/* 125:128 */           Map<bry,bsa> localMap2 = this.c.remove(paramString);
/* 126:129 */           if (localMap2 != null) {
/* 127:130 */             a(paramString);
/* 128:    */           }
/* 129:    */         }
/* 130:132 */         else if (localbsa != null)
/* 131:    */         {
/* 132:133 */           a(paramString, parambry);
/* 133:    */         }
/* 134:    */       }
/* 135:    */     }
/* 136:    */   }
/* 137:    */   
/* 138:    */   public Collection<bsa> e()
/* 139:    */   {
/* 140:140 */     Collection<Map<bry, bsa>> localCollection = this.c.values();
/* 141:141 */     ArrayList<bsa> localArrayList = Lists.newArrayList();
/* 142:143 */     for (Map<bry, bsa> localMap : localCollection) {
/* 143:144 */       localArrayList.addAll(localMap.values());
/* 144:    */     }
/* 145:147 */     return localArrayList;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public Map<bry,bsa> c(String paramString)
/* 149:    */   {
/* 150:165 */     Map<bry,bsa> localObject = this.c.get(paramString);
/* 151:166 */     if (localObject == null) {
/* 152:167 */       localObject = Maps.newHashMap();
/* 153:    */     }
/* 154:169 */     return localObject;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void k(bry parambry)
/* 158:    */   {
/* 159:173 */     this.a.remove(parambry.b());
/* 160:175 */     for (int i = 0; i < 19; i++) {
/* 161:176 */       if (a(i) == parambry) {
/* 162:177 */         a(i, null);
/* 163:    */       }
/* 164:    */     }
/* 165:181 */     List<bry> localList = this.b.get(parambry.c());
/* 166:182 */     if (localList != null) {
/* 167:183 */       localList.remove(parambry);
/* 168:    */     }
/* 169:186 */     for (Map<bry,bsa> localMap : this.c.values()) {
/* 170:187 */       localMap.remove(parambry);
/* 171:    */     }
/* 172:190 */     c(parambry);
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void a(int paramInt, bry parambry)
/* 176:    */   {
/* 177:194 */     this.d[paramInt] = parambry;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public bry a(int paramInt)
/* 181:    */   {
/* 182:199 */     return this.d[paramInt];
/* 183:    */   }
/* 184:    */   
/* 185:    */   public brz d(String paramString)
/* 186:    */   {
/* 187:203 */     return this.e.get(paramString);
/* 188:    */   }
/* 189:    */   
/* 190:    */   public brz e(String paramString)
/* 191:    */   {
/* 192:207 */     brz localbrz = d(paramString);
/* 193:208 */     if (localbrz != null) {
/* 194:209 */       throw new IllegalArgumentException("A team with the name '" + paramString + "' already exists!");
/* 195:    */     }
/* 196:212 */     localbrz = new brz(this, paramString);
/* 197:213 */     this.e.put(paramString, localbrz);
/* 198:214 */     a(localbrz);
/* 199:    */     
/* 200:216 */     return localbrz;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void d(brz parambrz)
/* 204:    */   {
/* 205:220 */     this.e.remove(parambrz.b());
/* 206:224 */     for (String str : parambrz.d()) {
/* 207:225 */       this.f.remove(str);
/* 208:    */     }
/* 209:228 */     c(parambrz);
/* 210:    */   }
/* 211:    */   
/* 212:    */   public boolean a(String paramString1, String paramString2)
/* 213:    */   {
/* 214:232 */     if (!this.e.containsKey(paramString2)) {
/* 215:233 */       return false;
/* 216:    */     }
/* 217:235 */     brz localbrz = d(paramString2);
/* 218:237 */     if (h(paramString1) != null) {
/* 219:238 */       f(paramString1);
/* 220:    */     }
/* 221:241 */     this.f.put(paramString1, localbrz);
/* 222:242 */     localbrz.d().add(paramString1);
/* 223:243 */     return true;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public boolean f(String paramString)
/* 227:    */   {
/* 228:247 */     brz localbrz = h(paramString);
/* 229:249 */     if (localbrz != null)
/* 230:    */     {
/* 231:250 */       a(paramString, localbrz);
/* 232:251 */       return true;
/* 233:    */     }
/* 234:253 */     return false;
/* 235:    */   }
/* 236:    */   
/* 237:    */   public void a(String paramString, brz parambrz)
/* 238:    */   {
/* 239:258 */     if (h(paramString) != parambrz) {
/* 240:259 */       throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + parambrz.b() + "'.");
/* 241:    */     }
/* 242:262 */     this.f.remove(paramString);
/* 243:263 */     parambrz.d().remove(paramString);
/* 244:    */   }
/* 245:    */   
/* 246:    */   public Collection<String> f()
/* 247:    */   {
/* 248:267 */     return this.e.keySet();
/* 249:    */   }
/* 250:    */   
/* 251:    */   public Collection<brz> g()
/* 252:    */   {
/* 253:271 */     return this.e.values();
/* 254:    */   }
/* 255:    */   
/* 256:    */   public brz h(String paramString)
/* 257:    */   {
/* 258:279 */     return this.f.get(paramString);
/* 259:    */   }
/* 260:    */   
/* 261:    */   public void a(bry parambry) {}
/* 262:    */   
/* 263:    */   public void b(bry parambry) {}
/* 264:    */   
/* 265:    */   public void c(bry parambry) {}
/* 266:    */   
/* 267:    */   public void a(bsa parambsa) {}
/* 268:    */   
/* 269:    */   public void a(String paramString) {}
/* 270:    */   
/* 271:    */   public void a(String paramString, bry parambry) {}
/* 272:    */   
/* 273:    */   public void a(brz parambrz) {}
/* 274:    */   
/* 275:    */   public void b(brz parambrz) {}
/* 276:    */   
/* 277:    */   public void c(brz parambrz) {}
/* 278:    */   
/* 279:    */   public static String b(int paramInt)
/* 280:    */   {
/* 281:310 */     switch (paramInt)
/* 282:    */     {
/* 283:    */     case 0: 
/* 284:312 */       return "list";
/* 285:    */     case 1: 
/* 286:314 */       return "sidebar";
/* 287:    */     case 2: 
/* 288:316 */       return "belowName";
/* 289:    */     }
/* 290:318 */     if ((paramInt >= 3) && (paramInt <= 18))
/* 291:    */     {
/* 292:319 */       a locala = net.minecraft.src.a.a(paramInt - 3);
/* 293:320 */       if ((locala != null) && (locala != net.minecraft.src.a.v)) {
/* 294:321 */         return "sidebar.team." + locala.e();
/* 295:    */       }
/* 296:    */     }
/* 297:324 */     return null;
/* 298:    */   }
/* 299:    */   
/* 300:    */   public static int i(String paramString)
/* 301:    */   {
/* 302:329 */     if (paramString.equalsIgnoreCase("list")) {
/* 303:330 */       return 0;
/* 304:    */     }
/* 305:331 */     if (paramString.equalsIgnoreCase("sidebar")) {
/* 306:332 */       return 1;
/* 307:    */     }
/* 308:333 */     if (paramString.equalsIgnoreCase("belowName")) {
/* 309:334 */       return 2;
/* 310:    */     }
/* 311:336 */     if (paramString.startsWith("sidebar.team."))
/* 312:    */     {
/* 313:337 */       String str = paramString.substring("sidebar.team.".length());
/* 314:338 */       a locala = net.minecraft.src.a.b(str);
/* 315:339 */       if ((locala != null) && (locala.b() >= 0)) {
/* 316:340 */         return locala.b() + 3;
/* 317:    */       }
/* 318:    */     }
/* 319:343 */     return -1;
/* 320:    */   }
/* 321:    */   
/* 322:347 */   private static String[] g = null;
/* 323:    */   
/* 324:    */   public static String[] h()
/* 325:    */   {
/* 326:349 */     if (g == null)
/* 327:    */     {
/* 328:350 */       g = new String[19];
/* 329:351 */       for (int i = 0; i < 19; i++) {
/* 330:352 */         g[i] = b(i);
/* 331:    */       }
/* 332:    */     }
/* 333:355 */     return g;
/* 334:    */   }
/* 335:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsd
 * JD-Core Version:    0.7.0.1
 */
package net.minecraft.src;
/*   1:    */ import com.google.common.base.Charsets;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import com.google.common.collect.Maps;
/*   4:    */ import com.google.gson.JsonArray;
/*   5:    */ import com.google.gson.JsonElement;
/*   6:    */ import com.google.gson.JsonObject;
/*   7:    */ import com.google.gson.JsonParser;

/*   8:    */ import java.io.InputStream;
/*   9:    */ import java.util.Iterator;
/*  10:    */ import java.util.List;
/*  11:    */ import java.util.Map;

/*  12:    */ import org.apache.commons.io.IOUtils;
/*  13:    */ import org.apache.logging.log4j.LogManager;
/*  14:    */ import org.apache.logging.log4j.Logger;
/*  15:    */ 
/*  16:    */ public class ctf
/*  17:    */ {
/*  18: 28 */   private static final Logger a = LogManager.getLogger();
/*  19: 29 */   private static final cte b = new cte();
/*  20: 32 */   private static ctf c = null;
/*  21: 33 */   private static int d = -1;
/*  22: 34 */   private static boolean e = true;
/*  23: 37 */   private final Map<String,Object> f = Maps.newHashMap();
/*  24: 38 */   private final List<String> g = Lists.newArrayList();
/*  25: 39 */   private final List<Integer> h = Lists.newArrayList();
/*  26: 42 */   private final List<ctl> i = Lists.newArrayList();
/*  27: 43 */   private final List<Integer> j = Lists.newArrayList();
/*  28: 44 */   private final Map<String,ctl> k = Maps.newHashMap();
/*  29:    */   private final int l;
/*  30:    */   private final String m;
/*  31:    */   private final boolean n;
/*  32:    */   private boolean o;
/*  33:    */   private final ctd p;
/*  34:    */   private final List<Integer> q;
/*  35:    */   private final List<String> r;
/*  36:    */   private final cti s;
/*  37:    */   private final cti t;
/*  38:    */   
/*  39:    */   public ctf(cvk paramcvk, String paramString) throws ow
/*  40:    */   {
/*  41: 65 */     JsonParser localJsonParser = new JsonParser();
/*  42:    */     
/*  43: 67 */     oa localoa = new oa("shaders/program/" + paramString + ".json");
/*  44: 68 */     this.m = paramString;
/*  45:    */     
/*  46: 70 */     InputStream localInputStream = null;
/*  47:    */     try
/*  48:    */     {
/*  49: 73 */       localInputStream = paramcvk.a(localoa).b();
/*  50: 74 */       JsonObject localJsonObject = localJsonParser.parse(IOUtils.toString(localInputStream, Charsets.UTF_8)).getAsJsonObject();
/*  51:    */       
/*  52: 76 */       String str = uh.h(localJsonObject, "vertex");
/*  53: 77 */       String localObject1 = uh.h(localJsonObject, "fragment");
/*  54:    */       
/*  55: 79 */       JsonArray localJsonArray1 = uh.a(localJsonObject, "samplers", (JsonArray)null);
/*  56:    */       int i1;
/*  57:    */       Iterator<JsonElement> localIterator1;
/*  58: 80 */       if (localJsonArray1 != null)
/*  59:    */       {
/*  60: 81 */         i1 = 0;
/*  61: 82 */         for (localIterator1 = localJsonArray1.iterator(); localIterator1.hasNext();)
/*  62:    */         {
/*  63: 82 */           JsonElement localObject2 = localIterator1.next();
/*  64:    */           try
/*  65:    */           {
/*  66: 84 */             a(localObject2);
/*  67:    */           }
/*  68:    */           catch (Exception localException2)
/*  69:    */           {
/*  70: 86 */             ow localow1 = ow.a(localException2);
/*  71: 87 */             localow1.a("samplers[" + i1 + "]");
/*  72: 88 */             throw localow1;
/*  73:    */           }
/*  74: 90 */           i1++;
/*  75:    */         }
/*  76:    */       }
/*  77:    */       
/*  78: 94 */       JsonArray localJsonArray2 = uh.a(localJsonObject, "attributes", (JsonArray)null);
/*  79:    */       int i2;
/*  80: 95 */       if (localJsonArray2 != null)
/*  81:    */       {
/*  82: 96 */         i2 = 0;
/*  83: 97 */         this.q = Lists.newArrayListWithCapacity(localJsonArray2.size());
/*  84: 98 */         this.r = Lists.newArrayListWithCapacity(localJsonArray2.size());
/*  85: 99 */         for (Iterator<JsonElement> localObject2 = localJsonArray2.iterator(); localObject2.hasNext();)
/*  86:    */         {
/*  87: 99 */           JsonElement localObject3 = localObject2.next();
/*  88:    */           try
/*  89:    */           {
/*  90:101 */             this.r.add(uh.a(localObject3, "attribute"));
/*  91:    */           }
/*  92:    */           catch (Exception localException3)
/*  93:    */           {
/*  94:103 */             ow localow2 = ow.a(localException3);
/*  95:104 */             localow2.a("attributes[" + i2 + "]");
/*  96:105 */             throw localow2;
/*  97:    */           }
/*  98:107 */           i2++;
/*  99:    */         }
/* 100:    */       }
/* 101:    */       else
/* 102:    */       {
/* 103:110 */         this.q = null;
/* 104:111 */         this.r = null;
/* 105:    */       }
/* 106:114 */       JsonArray localJsonArray3 = uh.a(localJsonObject, "uniforms", (JsonArray)null);
/* 107:    */       int i3;
/* 108:115 */       if (localJsonArray3 != null)
/* 109:    */       {
/* 110:116 */         i3 = 0;
/* 111:117 */         for (Iterator<JsonElement> localObject3 = localJsonArray3.iterator(); localObject3.hasNext();)
/* 112:    */         {
/* 113:117 */           JsonElement localJsonElement = localObject3.next();
/* 114:    */           try
/* 115:    */           {
/* 116:119 */             b(localJsonElement);
/* 117:    */           }
/* 118:    */           catch (Exception localException4)
/* 119:    */           {
/* 120:121 */             ow localow3 = ow.a(localException4);
/* 121:122 */             localow3.a("uniforms[" + i3 + "]");
/* 122:123 */             throw localow3;
/* 123:    */           }
/* 124:125 */           i3++;
/* 125:    */         }
/* 126:    */       }
/* 127:129 */       this.p = ctd.a(uh.a(localJsonObject, "blend", (JsonObject)null));
/* 128:130 */       this.n = uh.a(localJsonObject, "cull", true);
/* 129:    */       
/* 130:132 */       this.s = cti.a(paramcvk, ctj.a, str);
/* 131:133 */       this.t = cti.a(paramcvk, ctj.b, (String)localObject1);
/* 132:    */       
/* 133:135 */       this.l = ctk.b().c();
/* 134:136 */       ctk.b().b(this);
/* 135:    */       
/* 136:138 */       i();
/* 137:140 */       if (this.r != null) {
/* 138:141 */         for (Iterator<String> localIterator2 = this.r.iterator(); localIterator2.hasNext();)
/* 139:    */         {
/* 140:141 */           String localObject3 = localIterator2.next();
/* 141:142 */           int i4 = dax.b(this.l, (CharSequence)localObject3);
/* 142:143 */           this.q.add(Integer.valueOf(i4));
/* 143:    */         }
/* 144:    */       }
/* 145:    */     }
/* 146:    */     catch (Exception localException1)
/* 147:    */     {
/* 148:    */       
/* 149:    */       
/* 150:147 */       ow localObject1 = ow.a(localException1);
/* 151:148 */       localObject1.b(localoa.a());
/* 152:149 */       throw localObject1;
/* 153:    */     }
/* 154:    */     finally
/* 155:    */     {
/* 156:151 */       IOUtils.closeQuietly(localInputStream);
/* 157:    */     }
/* 158:154 */     d();
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void a()
/* 162:    */   {
/* 163:158 */     ctk.b().a(this);
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void b()
/* 167:    */   {
/* 168:163 */     dax.d(0);
/* 169:164 */     d = -1;
/* 170:165 */     c = null;
/* 171:166 */     e = true;
/* 172:169 */     for (int i1 = 0; i1 < this.h.size(); i1++) {
/* 173:170 */       if (this.f.get(this.g.get(i1)) != null)
/* 174:    */       {
/* 175:174 */         cjm.g(dax.p + i1);
/* 176:175 */         cjm.i(0);
/* 177:    */       }
/* 178:    */     }
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void c()
/* 182:    */   {
/* 183:187 */     this.o = false;
/* 184:    */     
/* 185:189 */     c = this;
/* 186:    */     
/* 187:191 */     this.p.a();
/* 188:193 */     if (this.l != d)
/* 189:    */     {
/* 190:194 */       dax.d(this.l);
/* 191:195 */       d = this.l;
/* 192:    */     }
/* 193:198 */     if (this.n) {
/* 194:199 */       cjm.o();
/* 195:    */     } else {
/* 196:201 */       cjm.p();
/* 197:    */     }
/* 198:    */     Object localObject;
/* 199:204 */     for (int i1 = 0; i1 < this.h.size(); i1++) {
/* 200:205 */       if (this.f.get(this.g.get(i1)) != null)
/* 201:    */       {
/* 202:209 */         cjm.g(dax.p + i1);
/* 203:210 */         cjm.w();
/* 204:211 */         localObject = this.f.get(this.g.get(i1));
/* 205:212 */         int i2 = -1;
/* 206:213 */         if ((localObject instanceof ckw)) {
/* 207:214 */           i2 = ((ckw)localObject).g;
/* 208:215 */         } else if ((localObject instanceof cui)) {
/* 209:216 */           i2 = ((cui)localObject).b();
/* 210:217 */         } else if ((localObject instanceof Integer)) {
/* 211:218 */           i2 = ((Integer)localObject).intValue();
/* 212:    */         }
/* 213:220 */         if (i2 != -1)
/* 214:    */         {
/* 215:223 */           cjm.i(i2);
/* 216:    */           
/* 217:225 */           dax.f(dax.a(this.l, (CharSequence)this.g.get(i1)), i1);
/* 218:    */         }
/* 219:    */       }
/* 220:    */     }
/* 221:229 */     for (Iterator<ctl> localIterator = this.i.iterator(); localIterator.hasNext();)
/* 222:    */     {
/* 223:229 */       ctl localObject1 = localIterator.next();
/* 224:230 */       localObject1.b();
/* 225:    */     }
/* 226:    */   }
/* 227:    */   
/* 228:    */   public void d()
/* 229:    */   {
/* 230:235 */     this.o = true;
/* 231:    */   }
/* 232:    */   
/* 233:    */   public ctl a(String paramString)
/* 234:    */   {
/* 235:239 */     if (this.k.containsKey(paramString)) {
/* 236:240 */       return (ctl)this.k.get(paramString);
/* 237:    */     }
/* 238:243 */     return null;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public ctl b(String paramString)
/* 242:    */   {
/* 243:247 */     if (this.k.containsKey(paramString)) {
/* 244:248 */       return (ctl)this.k.get(paramString);
/* 245:    */     }
/* 246:251 */     return b;
/* 247:    */   }
/* 248:    */   
/* 249:    */   private void i()
/* 250:    */   {
/* 251:255 */     int i1 = 0;
/* 252:    */     String str;
/* 253:    */     int i3;
/* 254:255 */     for (int i2 = 0; i1 < this.g.size(); i2++)
/* 255:    */     {
/* 256:256 */       str = (String)this.g.get(i1);
/* 257:257 */       i3 = dax.a(this.l, str);
/* 258:258 */       if (i3 == -1)
/* 259:    */       {
/* 260:259 */         a.warn("Shader " + this.m + "could not find sampler named " + str + " in the specified shader program.");
/* 261:    */         
/* 262:261 */         this.f.remove(str);
/* 263:262 */         this.g.remove(i2);
/* 264:263 */         i2--;
/* 265:    */       }
/* 266:    */       else
/* 267:    */       {
/* 268:266 */         this.h.add(Integer.valueOf(i3));
/* 269:    */       }
/* 270:255 */       i1++;
/* 271:    */     }
/* 272:269 */     for (ctl localctl : this.i)
/* 273:    */     {
/* 274:270 */       str = localctl.a();
/* 275:271 */       i3 = dax.a(this.l, str);
/* 276:272 */       if (i3 == -1)
/* 277:    */       {
/* 278:273 */         a.warn("Could not find uniform named " + str + " in the specified" + " shader program.");
/* 279:    */       }
/* 280:    */       else
/* 281:    */       {
/* 282:276 */         this.j.add(Integer.valueOf(i3));
/* 283:277 */         localctl.b(i3);
/* 284:278 */         this.k.put(str, localctl);
/* 285:    */       }
/* 286:    */     }
/* 287:    */   }
/* 288:    */   
/* 289:    */   private void a(JsonElement paramJsonElement)
/* 290:    */   {
/* 291:283 */     JsonObject localJsonObject = uh.l(paramJsonElement, "sampler");
/* 292:284 */     String str = uh.h(localJsonObject, "name");
/* 293:286 */     if (!uh.a(localJsonObject, "file"))
/* 294:    */     {
/* 295:288 */       this.f.put(str, null);
/* 296:289 */       this.g.add(str);
/* 297:290 */       return;
/* 298:    */     }
/* 299:292 */     this.g.add(str);
/* 300:    */   }
/* 301:    */   
/* 302:    */   public void a(String paramString, Object paramObject)
/* 303:    */   {
/* 304:296 */     if (this.f.containsKey(paramString)) {
/* 305:297 */       this.f.remove(paramString);
/* 306:    */     }
/* 307:300 */     this.f.put(paramString, paramObject);
/* 308:301 */     d();
/* 309:    */   }
/* 310:    */   
/* 311:    */   private void b(JsonElement paramJsonElement) throws ow
/* 312:    */   {
/* 313:305 */     JsonObject localJsonObject = uh.l(paramJsonElement, "uniform");
/* 314:306 */     String str = uh.h(localJsonObject, "name");
/* 315:307 */     int i1 = ctl.a(uh.h(localJsonObject, "type"));
/* 316:308 */     int i2 = uh.m(localJsonObject, "count");
/* 317:309 */     float[] arrayOfFloat = new float[Math.max(i2, 16)];
/* 318:    */     
/* 319:311 */     JsonArray localJsonArray = uh.t(localJsonObject, "values");
/* 320:312 */     if ((localJsonArray.size() != i2) && (localJsonArray.size() > 1)) {
/* 321:313 */       throw new ow("Invalid amount of values specified (expected " + i2 + ", found " + localJsonArray.size() + ")");
/* 322:    */     }
/* 323:316 */     int i3 = 0;
/* 324:317 */     for (Iterator<JsonElement> localIterator = localJsonArray.iterator(); localIterator.hasNext();)
/* 325:    */     {
/* 326:317 */       JsonElement localObject = localIterator.next();
/* 327:    */       try
/* 328:    */       {
/* 329:319 */         arrayOfFloat[i3] = uh.d(localObject, "value");
/* 330:    */       }
/* 331:    */       catch (Exception localException)
/* 332:    */       {
/* 333:321 */         ow localow = ow.a(localException);
/* 334:322 */         localow.a("values[" + i3 + "]");
/* 335:323 */         throw localow;
/* 336:    */       }
/* 337:325 */       i3++;
/* 338:    */     }
/* 339:329 */     if ((i2 > 1) && (localJsonArray.size() == 1)) {
/* 340:330 */       for (; i3 < i2; i3++) {
/* 341:331 */         arrayOfFloat[i3] = arrayOfFloat[0];
/* 342:    */       }
/* 343:    */     }
/* 344:335 */     int i4 = (i2 > 1) && (i2 <= 4) && (i1 < 8) ? i2 - 1 : 0;
/* 345:336 */     ctl localObject = new ctl(str, i1 + i4, i2, this);
/* 346:338 */     if (i1 <= 3) {
/* 347:340 */       ((ctl)localObject).a((int)arrayOfFloat[0], (int)arrayOfFloat[1], (int)arrayOfFloat[2], (int)arrayOfFloat[3]);
/* 348:341 */     } else if (i1 <= 7) {
/* 349:343 */       ((ctl)localObject).b(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
/* 350:    */     } else {
/* 351:346 */       ((ctl)localObject).a(arrayOfFloat);
/* 352:    */     }
/* 353:349 */     this.i.add(localObject);
/* 354:    */   }
/* 355:    */   
/* 356:    */   public cti e()
/* 357:    */   {
/* 358:353 */     return this.s;
/* 359:    */   }
/* 360:    */   
/* 361:    */   public cti f()
/* 362:    */   {
/* 363:357 */     return this.t;
/* 364:    */   }
/* 365:    */   
/* 366:    */   public int h()
/* 367:    */   {
/* 368:365 */     return this.l;
/* 369:    */   }
/* 370:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctf
 * JD-Core Version:    0.7.0.1
 */
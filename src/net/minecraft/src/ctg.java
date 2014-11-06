package net.minecraft.src;
/*   1:    */ import com.google.common.base.Charsets;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import com.google.common.collect.Maps;
/*   4:    */ import com.google.gson.JsonArray;
/*   5:    */ import com.google.gson.JsonElement;
/*   6:    */ import com.google.gson.JsonObject;
/*   7:    */ import com.google.gson.JsonParser;

/*   8:    */ import java.io.FileNotFoundException;
/*   9:    */ import java.io.InputStream;
/*  11:    */ import java.util.Iterator;
/*  12:    */ import java.util.List;
/*  13:    */ import java.util.Map;

/*  14:    */ import javax.vecmath.Matrix4f;

/*  15:    */ import org.apache.commons.io.IOUtils;
/*  16:    */ import org.lwjgl.opengl.GL11;
/*  17:    */ 
/*  18:    */ public class ctg
/*  19:    */ {
/*  20:    */   private ckw a;
/*  21:    */   private cvk b;
/*  22:    */   private String c;
/*  23: 32 */   private final List<cth> d = Lists.newArrayList();
/*  24: 33 */   private final Map<String,ckw> e = Maps.newHashMap();
/*  25: 34 */   private final List<ckw> f = Lists.newArrayList();
/*  26:    */   private Matrix4f g;
/*  27:    */   private int h;
/*  28:    */   private int i;
/*  29:    */   private float j;
/*  30:    */   private float k;
/*  31:    */   
/*  32:    */   public ctg(cug paramcug, cvk paramcvk, ckw paramckw, oa paramoa) throws ow
/*  33:    */   {
/*  34: 43 */     this.b = paramcvk;
/*  35: 44 */     this.a = paramckw;
/*  36: 45 */     this.j = 0.0F;
/*  37: 46 */     this.k = 0.0F;
/*  38: 47 */     this.h = paramckw.c;
/*  39: 48 */     this.i = paramckw.d;
/*  40: 49 */     this.c = paramoa.toString();
/*  41: 50 */     c();
/*  42:    */     
/*  43: 52 */     a(paramcug, paramoa);
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void a(cug paramcug, oa paramoa) throws ow
/*  47:    */   {
/*  48: 56 */     JsonParser localJsonParser = new JsonParser();
/*  49: 57 */     InputStream localInputStream = null;
/*  50:    */     try
/*  51:    */     {
/*  52: 60 */       cvj localcvj = this.b.a(paramoa);
/*  53: 61 */       localInputStream = localcvj.b();
/*  54: 62 */       JsonElement localObject1 = localJsonParser.parse(IOUtils.toString(localInputStream, Charsets.UTF_8)).getAsJsonObject();
/*  55:    */       JsonArray localJsonArray;
/* 101:    */       JsonElement localJsonElement;
/*  99:    */       int m;
/* 100:    */       Iterator<JsonElement> localIterator;
/* 102:    */       ow localow;
/*  56: 64 */       if (uh.d((JsonObject)localObject1, "targets"))
/*  57:    */       {
/*  58: 65 */         localJsonArray = ((JsonObject)localObject1).getAsJsonArray("targets");
/*  59: 66 */         m = 0;
/*  60: 68 */         for (localIterator = localJsonArray.iterator(); localIterator.hasNext();)
/*  61:    */         {
/*  62: 68 */           localJsonElement = (JsonElement)localIterator.next();
/*  63:    */           try
/*  64:    */           {
/*  65: 70 */             a(localJsonElement);
/*  66:    */           }
/*  67:    */           catch (Exception localException2)
/*  68:    */           {
/*  69: 72 */             localow = ow.a(localException2);
/*  70: 73 */             localow.a("targets[" + m + "]");
/*  71: 74 */             throw localow;
/*  72:    */           }
/*  73: 76 */           m++;
/*  74:    */         }
/*  75:    */       }
/*  76: 80 */       if (uh.d((JsonObject)localObject1, "passes"))
/*  77:    */       {
/*  78: 81 */         localJsonArray = ((JsonObject)localObject1).getAsJsonArray("passes");
/*  79: 82 */         m = 0;
/*  80: 84 */         for (localIterator = localJsonArray.iterator(); localIterator.hasNext();)
/*  81:    */         {
/*  82: 84 */           localJsonElement = (JsonElement)localIterator.next();
/*  83:    */           try
/*  84:    */           {
/*  85: 86 */             a(paramcug, localJsonElement);
/*  86:    */           }
/*  87:    */           catch (Exception localException3)
/*  88:    */           {
/*  89: 88 */             localow = ow.a(localException3);
/*  90: 89 */             localow.a("passes[" + m + "]");
/*  91: 90 */             throw localow;
/*  92:    */           }
/*  93: 92 */           m++;
/*  94:    */         }
/*  95:    */       }
/*  96:    */     }
/*  97:    */     catch (Exception localException1)
/*  98:    */     {
/* 103: 96 */       ow localObject1 = ow.a(localException1);
/* 104: 97 */       (localObject1).b(paramoa.a());
/* 105: 98 */       throw localObject1;
/* 106:    */     }
/* 107:    */     finally
/* 108:    */     {
/* 109:100 */       IOUtils.closeQuietly(localInputStream);
/* 110:    */     }
/* 111:    */   }
/* 112:    */   
/* 113:    */   private void a(JsonElement paramJsonElement) throws ow
/* 114:    */   {
/* 115:105 */     if (uh.a(paramJsonElement))
/* 116:    */     {
/* 117:106 */       a(paramJsonElement.getAsString(), this.h, this.i);
/* 118:    */     }
/* 119:    */     else
/* 120:    */     {
/* 121:108 */       JsonObject localJsonObject = uh.l(paramJsonElement, "target");
/* 122:    */       
/* 123:110 */       String str = uh.h(localJsonObject, "name");
/* 124:111 */       int m = uh.a(localJsonObject, "width", this.h);
/* 125:112 */       int n = uh.a(localJsonObject, "height", this.i);
/* 126:114 */       if (this.e.containsKey(str)) {
/* 127:115 */         throw new ow(str + " is already defined");
/* 128:    */       }
/* 129:117 */       a(str, m, n);
/* 130:    */     }
/* 131:    */   }
/* 132:    */   
/* 133:    */   private void a(cug paramcug, JsonElement paramJsonElement) throws ow
/* 134:    */   {
/* 135:123 */     JsonObject localJsonObject1 = uh.l(paramJsonElement, "pass");
/* 136:    */     
/* 137:125 */     String str1 = uh.h(localJsonObject1, "name");
/* 138:126 */     String str2 = uh.h(localJsonObject1, "intarget");
/* 139:127 */     String str3 = uh.h(localJsonObject1, "outtarget");
/* 140:128 */     ckw localckw1 = b(str2);
/* 141:129 */     ckw localckw2 = b(str3);
/* 142:131 */     if (localckw1 == null) {
/* 143:132 */       throw new ow("Input target '" + str2 + "' does not exist");
/* 144:    */     }
/* 145:134 */     if (localckw2 == null) {
/* 146:135 */       throw new ow("Output target '" + str3 + "' does not exist");
/* 147:    */     }
/* 148:138 */     cth localcth = a(str1, localckw1, localckw2);
/* 149:    */     
/* 150:140 */     JsonArray localJsonArray1 = uh.a(localJsonObject1, "auxtargets", (JsonArray)null);
/* 151:    */     int m;
/* 152:    */     Iterator<JsonElement> localIterator;
/* 153:141 */     if (localJsonArray1 != null)
/* 154:    */     {
/* 155:142 */       m = 0;
/* 156:143 */       for (localIterator = localJsonArray1.iterator(); localIterator.hasNext();)
/* 157:    */       {
/* 158:143 */         JsonElement localObject1 = localIterator.next();
/* 159:    */         try
/* 160:    */         {
/* 161:145 */           JsonObject localJsonObject2 = uh.l(localObject1, "auxtarget");
/* 162:146 */           String localObject2 = uh.h(localJsonObject2, "name");
/* 163:147 */           String localObject3 = uh.h(localJsonObject2, "id");
/* 164:148 */           ckw localckw3 = b(localObject3);
/* 165:150 */           if (localckw3 == null)
/* 166:    */           {
/* 167:152 */             oa localoa = new oa("textures/effect/" + (String)localObject3 + ".png");
/* 168:    */             try
/* 169:    */             {
/* 170:154 */               this.b.a(localoa);
/* 171:    */             }
/* 172:    */             catch (FileNotFoundException localFileNotFoundException)
/* 173:    */             {
/* 174:156 */               throw new ow("Render target or texture '" + (String)localObject3 + "' does not exist");
/* 175:    */             }
/* 176:159 */             paramcug.a(localoa);
/* 177:160 */             cui localcui = paramcug.b(localoa);
/* 178:161 */             int i1 = uh.m(localJsonObject2, "width");
/* 179:162 */             int i2 = uh.m(localJsonObject2, "height");
/* 180:163 */             boolean bool = uh.i(localJsonObject2, "bilinear");
/* 181:164 */             if (bool)
/* 182:    */             {
/* 183:165 */               GL11.glTexParameteri(3553, 10241, 9729);
/* 184:166 */               GL11.glTexParameteri(3553, 10240, 9729);
/* 185:    */             }
/* 186:    */             else
/* 187:    */             {
/* 188:168 */               GL11.glTexParameteri(3553, 10241, 9728);
/* 189:169 */               GL11.glTexParameteri(3553, 10240, 9728);
/* 190:    */             }
/* 191:171 */             localcth.a((String)localObject2, Integer.valueOf(localcui.b()), i1, i2);
/* 192:    */           }
/* 193:    */           else
/* 194:    */           {
/* 195:173 */             localcth.a((String)localObject2, localckw3, localckw3.a, localckw3.b);
/* 196:    */           }
/* 197:    */         }
/* 198:    */         catch (Exception localException1)
/* 199:    */         {
/* 200:176 */           ow localObject2 = ow.a(localException1);
/* 201:177 */           localObject2.a("auxtargets[" + m + "]");
/* 202:178 */           throw localObject2;
/* 203:    */         }
/* 204:180 */         m++;
/* 205:    */       }
/* 206:    */     }
/* 207:    */     
/* 208:    */     
/* 209:184 */     JsonArray localJsonArray2 = uh.a(localJsonObject1, "uniforms", (JsonArray)null);
/* 210:    */     int n;
/* 211:185 */     if (localJsonArray2 != null)
/* 212:    */     {
/* 213:186 */       n = 0;
/* 214:187 */       for (Iterator<JsonElement> localObject1 = localJsonArray2.iterator(); localObject1.hasNext();)
/* 215:    */       {
/* 216:187 */         JsonElement localJsonElement = localObject1.next();
/* 217:    */         try
/* 218:    */         {
/* 219:189 */           b(localJsonElement);
/* 220:    */         }
/* 221:    */         catch (Exception localException2)
/* 222:    */         {
/* 223:191 */           ow localObject3 = ow.a(localException2);
/* 224:192 */           localObject3.a("uniforms[" + n + "]");
/* 225:193 */           throw localObject3;
/* 226:    */         }
/* 227:195 */         n++;
/* 228:    */       }
/* 229:    */     }
/* 230:    */   }
/* 231:    */   
/* 232:    */   private void b(JsonElement paramJsonElement) throws ow
/* 233:    */   {
/* 234:201 */     JsonObject localJsonObject = uh.l(paramJsonElement, "uniform");
/* 235:202 */     String str = uh.h(localJsonObject, "name");
/* 236:203 */     ctl localctl = ((cth)this.d.get(this.d.size() - 1)).c().a(str);
/* 237:205 */     if (localctl == null) {
/* 238:206 */       throw new ow("Uniform '" + str + "' does not exist");
/* 239:    */     }
/* 240:209 */     float[] arrayOfFloat = new float[4];
/* 241:210 */     int m = 0;
/* 242:211 */     JsonArray localJsonArray = uh.t(localJsonObject, "values");
/* 243:213 */     for (JsonElement localJsonElement : localJsonArray)
/* 244:    */     {
/* 245:    */       try
/* 246:    */       {
/* 247:215 */         arrayOfFloat[m] = uh.d(localJsonElement, "value");
/* 248:    */       }
/* 249:    */       catch (Exception localException)
/* 250:    */       {
/* 251:217 */         ow localow = ow.a(localException);
/* 252:218 */         localow.a("values[" + m + "]");
/* 253:219 */         throw localow;
/* 254:    */       }
/* 255:221 */       m++;
/* 256:    */     }
/* 257:224 */     switch (m)
/* 258:    */     {
/* 259:    */     case 0: 
/* 260:    */       break;
/* 261:    */     case 1: 
/* 262:229 */       localctl.a(arrayOfFloat[0]);
/* 263:230 */       break;
/* 264:    */     case 2: 
/* 265:232 */       localctl.a(arrayOfFloat[0], arrayOfFloat[1]);
/* 266:233 */       break;
/* 267:    */     case 3: 
/* 268:235 */       localctl.a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2]);
/* 269:236 */       break;
/* 270:    */     case 4: 
/* 271:238 */       localctl.a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
/* 272:    */     }
/* 273:    */   }
/* 274:    */   
/* 275:    */   public ckw a(String paramString)
/* 276:    */   {
/* 277:244 */     return (ckw)this.e.get(paramString);
/* 278:    */   }
/* 279:    */   
/* 280:    */   public void a(String paramString, int paramInt1, int paramInt2)
/* 281:    */   {
/* 282:248 */     ckw localckw = new ckw(paramInt1, paramInt2, true);
/* 283:249 */     localckw.a(0.0F, 0.0F, 0.0F, 0.0F);
/* 284:250 */     this.e.put(paramString, localckw);
/* 285:252 */     if ((paramInt1 == this.h) && (paramInt2 == this.i)) {
/* 286:253 */       this.f.add(localckw);
/* 287:    */     }
/* 288:    */   }
/* 289:    */   
/* 290:    */   public void a()
/* 291:    */   {
/* 292:258 */     for (Iterator<ckw> localIterator = this.e.values().iterator(); localIterator.hasNext();)
/* 293:    */     {
/* 294:258 */       ckw localObject = localIterator.next();
/* 295:259 */       ((ckw)localObject).a();
/* 296:    */     }
/* 297:    */     Object localObject;
/* 298:261 */     for (Iterator<cth> localIterator = this.d.iterator(); localIterator.hasNext();)
/* 299:    */     {
/* 300:261 */       localObject = (cth)localIterator.next();
/* 301:262 */       ((cth)localObject).b();
/* 302:    */     }
/* 303:264 */     this.d.clear();
/* 304:    */   }
/* 305:    */   
/* 306:    */   public cth a(String paramString, ckw paramckw1, ckw paramckw2) throws ow
/* 307:    */   {
/* 308:268 */     cth localcth = new cth(this.b, paramString, paramckw1, paramckw2);
/* 309:269 */     this.d.add(this.d.size(), localcth);
/* 310:270 */     return localcth;
/* 311:    */   }
/* 312:    */   
/* 313:    */   private void c()
/* 314:    */   {
/* 315:274 */     this.g = new Matrix4f();
/* 316:275 */     this.g.setIdentity();
/* 317:276 */     this.g.m00 = (2.0F / this.a.a);
/* 318:277 */     this.g.m11 = (2.0F / -this.a.b);
/* 319:278 */     this.g.m22 = -0.0020002F;
/* 320:279 */     this.g.m33 = 1.0F;
/* 321:280 */     this.g.m03 = -1.0F;
/* 322:281 */     this.g.m13 = 1.0F;
/* 323:282 */     this.g.m23 = -1.0002F;
/* 324:    */   }
/* 325:    */   
/* 326:    */   public void a(int paramInt1, int paramInt2)
/* 327:    */   {
/* 328:286 */     this.h = this.a.a;
/* 329:287 */     this.i = this.a.b;
/* 330:288 */     c();
/* 331:289 */     for (Iterator<cth> localIterator = this.d.iterator(); localIterator.hasNext();)
/* 332:    */     {
/* 333:289 */       cth localObject = (cth)localIterator.next();
/* 334:290 */       ((cth)localObject).a(this.g);
/* 335:    */     }
/* 336:    */     
/* 337:292 */     for (Iterator<ckw> localIterator = this.f.iterator(); localIterator.hasNext();)
/* 338:    */     {
/* 339:292 */       ckw localObject = (ckw)localIterator.next();
/* 340:293 */       ((ckw)localObject).a(paramInt1, paramInt2);
/* 341:    */     }
/* 342:    */   }
/* 343:    */   
/* 344:    */   public void a(float paramFloat)
/* 345:    */   {
/* 346:298 */     if (paramFloat < this.k)
/* 347:    */     {
/* 348:299 */       this.j += 1.0F - this.k;
/* 349:300 */       this.j += paramFloat;
/* 350:    */     }
/* 351:    */     else
/* 352:    */     {
/* 353:302 */       this.j += paramFloat - this.k;
/* 354:    */     }
/* 355:304 */     this.k = paramFloat;
/* 356:305 */     while (this.j > 20.0F) {
/* 357:306 */       this.j -= 20.0F;
/* 358:    */     }
/* 359:308 */     for (cth localcth : this.d) {
/* 360:309 */       localcth.a(this.j / 20.0F);
/* 361:    */     }
/* 362:    */   }
/* 363:    */   
/* 364:    */   public final String b()
/* 365:    */   {
/* 366:314 */     return this.c;
/* 367:    */   }
/* 368:    */   
/* 369:    */   private ckw b(String paramString)
/* 370:    */   {
/* 371:318 */     if (paramString == null) {
/* 372:319 */       return null;
/* 373:    */     }
/* 374:321 */     if (paramString.equals("minecraft:main")) {
/* 375:322 */       return this.a;
/* 376:    */     }
/* 377:324 */     return (ckw)this.e.get(paramString);
/* 378:    */   }
/* 379:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctg
 * JD-Core Version:    0.7.0.1
 */
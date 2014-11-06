package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.io.DataInput;
/*   3:    */ import java.io.DataOutput;
/*   4:    */ import java.io.IOException;
/*   5:    */ import java.util.Map;
/*   6:    */ import java.util.Set;
/*   7:    */ import org.apache.logging.log4j.LogManager;
/*   8:    */ import org.apache.logging.log4j.Logger;
/*   9:    */ 
/*  10:    */ public class NBTTagCompound
/*  11:    */   extends NBTBase
/*  12:    */ {
/*  13: 21 */   private static final Logger b = LogManager.getLogger();
/*  14: 23 */   private Map<String,NBTBase> c = Maps.newHashMap();
/*  15:    */   
/*  16:    */   void a(DataOutput paramDataOutput) throws IOException
/*  17:    */   {
/*  18: 30 */     for (String str : this.c.keySet())
/*  19:    */     {
/*  20: 31 */       NBTBase localgd = (NBTBase)this.c.get(str);
/*  21: 32 */       a(str, localgd, paramDataOutput);
/*  22:    */     }
/*  23: 34 */     paramDataOutput.writeByte(0);
/*  24:    */   }
/*  25:    */   
/*  26:    */   void a(DataInput paramDataInput, int paramInt, fx paramfx) throws IOException
/*  27:    */   {
/*  28: 39 */     if (paramInt > 512) {
/*  29: 40 */       throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
/*  30:    */     }
/*  31: 42 */     this.c.clear();
/*  32:    */     byte b1;
/*  33: 44 */     while ((b1 = a(paramDataInput, paramfx)) != 0)
/*  34:    */     {
/*  35: 45 */       String str = b(paramDataInput, paramfx);
/*  36:    */       
/*  37: 47 */       paramfx.a(16 * str.length());
/*  38: 48 */       NBTBase localgd = a(b1, str, paramDataInput, paramInt + 1, paramfx);
/*  39: 49 */       this.c.put(str, localgd);
/*  40:    */     }
/*  41:    */   }
/*  42:    */   
/*  43:    */   public Set<String> c()
/*  44:    */   {
/*  45: 54 */     return this.c.keySet();
/*  46:    */   }
/*  47:    */   
/*  48:    */   public byte a()
/*  49:    */   {
/*  50: 59 */     return 10;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setNBT(String paramString, NBTBase paramgd)
/*  54:    */   {
/*  55: 63 */     this.c.put(paramString, paramgd);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setByte(String paramString, byte paramByte)
/*  59:    */   {
/*  60: 67 */     this.c.put(paramString, new fm(paramByte));
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setShort(String paramString, short paramShort)
/*  64:    */   {
/*  65: 71 */     this.c.put(paramString, new gb(paramShort));
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setInt(String paramString, int paramInt)
/*  69:    */   {
/*  70: 75 */     this.c.put(paramString, new fu(paramInt));
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void a(String paramString, long paramLong)
/*  74:    */   {
/*  75: 79 */     this.c.put(paramString, new fw(paramLong));
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setFloat(String paramString, float paramFloat)
/*  79:    */   {
/*  80: 83 */     this.c.put(paramString, new fs(paramFloat));
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setDouble(String paramString, double paramDouble)
/*  84:    */   {
/*  85: 87 */     this.c.put(paramString, new fq(paramDouble));
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setString(String paramString1, String paramString2)
/*  89:    */   {
/*  90: 91 */     this.c.put(paramString1, new gc(paramString2));
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setByteArray(String paramString, byte[] paramArrayOfByte)
/*  94:    */   {
/*  95: 95 */     this.c.put(paramString, new fl(paramArrayOfByte));
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setIntArray(String paramString, int[] paramArrayOfInt)
/*  99:    */   {
/* 100: 99 */     this.c.put(paramString, new ft(paramArrayOfInt));
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setBoolean(String paramString, boolean paramBoolean)
/* 104:    */   {
/* 105:103 */     setByte(paramString, (byte)(paramBoolean ? 1 : 0));
/* 106:    */   }
/* 107:    */   
/* 108:    */   public NBTBase a(String paramString)
/* 109:    */   {
/* 110:107 */     return (NBTBase)this.c.get(paramString);
/* 111:    */   }
/* 112:    */   
/* 113:    */   public byte b(String paramString)
/* 114:    */   {
/* 115:111 */     NBTBase localgd = (NBTBase)this.c.get(paramString);
/* 116:112 */     if (localgd != null) {
/* 117:113 */       return localgd.a();
/* 118:    */     }
/* 119:115 */     return 0;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public boolean c(String paramString)
/* 123:    */   {
/* 124:119 */     return this.c.containsKey(paramString);
/* 125:    */   }
/* 126:    */   
/* 127:    */   public boolean hasKey(String paramString, int paramInt)
/* 128:    */   {
/* 129:123 */     int i = b(paramString);
/* 130:124 */     if (i == paramInt) {
/* 131:125 */       return true;
/* 132:    */     }
/* 133:127 */     if (paramInt == 99) {
/* 134:128 */       return (i == 1) || (i == 2) || (i == 3) || (i == 4) || (i == 5) || (i == 6);
/* 135:    */     }
/* 136:131 */     if (i > 0) {}
/* 137:135 */     return false;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public byte d(String paramString)
/* 141:    */   {
/* 142:    */     try
/* 143:    */     {
/* 144:140 */       if (!hasKey(paramString, 99)) {
/* 145:141 */         return 0;
/* 146:    */       }
/* 147:143 */       return ((ge)this.c.get(paramString)).f();
/* 148:    */     }
/* 149:    */     catch (ClassCastException localClassCastException) {}
/* 150:145 */     return 0;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public short e(String paramString)
/* 154:    */   {
/* 155:    */     try
/* 156:    */     {
/* 157:151 */       if (!hasKey(paramString, 99)) {
/* 158:152 */         return 0;
/* 159:    */       }
/* 160:154 */       return ((ge)this.c.get(paramString)).e();
/* 161:    */     }
/* 162:    */     catch (ClassCastException localClassCastException) {}
/* 163:156 */     return 0;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public int getInteger(String paramString)
/* 167:    */   {
/* 168:    */     try
/* 169:    */     {
/* 170:162 */       if (!hasKey(paramString, 99)) {
/* 171:163 */         return 0;
/* 172:    */       }
/* 173:165 */       return ((ge)this.c.get(paramString)).d();
/* 174:    */     }
/* 175:    */     catch (ClassCastException localClassCastException) {}
/* 176:167 */     return 0;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public long getLong(String paramString)
/* 180:    */   {
/* 181:    */     try
/* 182:    */     {
/* 183:173 */       if (!hasKey(paramString, 99)) {
/* 184:174 */         return 0L;
/* 185:    */       }
/* 186:176 */       return ((ge)this.c.get(paramString)).c();
/* 187:    */     }
/* 188:    */     catch (ClassCastException localClassCastException) {}
/* 189:178 */     return 0L;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public float getFloat(String paramString)
/* 193:    */   {
/* 194:    */     try
/* 195:    */     {
/* 196:184 */       if (!hasKey(paramString, 99)) {
/* 197:185 */         return 0.0F;
/* 198:    */       }
/* 199:187 */       return ((ge)this.c.get(paramString)).h();
/* 200:    */     }
/* 201:    */     catch (ClassCastException localClassCastException) {}
/* 202:189 */     return 0.0F;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public double i(String paramString)
/* 206:    */   {
/* 207:    */     try
/* 208:    */     {
/* 209:195 */       if (!hasKey(paramString, 99)) {
/* 210:196 */         return 0.0D;
/* 211:    */       }
/* 212:198 */       return ((ge)this.c.get(paramString)).g();
/* 213:    */     }
/* 214:    */     catch (ClassCastException localClassCastException) {}
/* 215:200 */     return 0.0D;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public String getString(String paramString)
/* 219:    */   {
/* 220:    */     try
/* 221:    */     {
/* 222:206 */       if (!hasKey(paramString, 8)) {
/* 223:207 */         return "";
/* 224:    */       }
/* 225:209 */       return ((NBTBase)this.c.get(paramString)).a_();
/* 226:    */     }
/* 227:    */     catch (ClassCastException localClassCastException) {}
/* 228:211 */     return "";
/* 229:    */   }
/* 230:    */   
/* 231:    */   public byte[] k(String paramString)
/* 232:    */   {
/* 233:    */     try
/* 234:    */     {
/* 235:217 */       if (!hasKey(paramString, 7)) {
/* 236:218 */         return new byte[0];
/* 237:    */       }
/* 238:220 */       return ((fl)this.c.get(paramString)).c();
/* 239:    */     }
/* 240:    */     catch (ClassCastException localClassCastException)
/* 241:    */     {
/* 242:222 */       throw new u(a(paramString, 7, localClassCastException));
/* 243:    */     }
/* 244:    */   }
/* 245:    */   
/* 246:    */   public int[] l(String paramString)
/* 247:    */   {
/* 248:    */     try
/* 249:    */     {
/* 250:228 */       if (!hasKey(paramString, 11)) {
/* 251:229 */         return new int[0];
/* 252:    */       }
/* 253:231 */       return ((ft)this.c.get(paramString)).c();
/* 254:    */     }
/* 255:    */     catch (ClassCastException localClassCastException)
/* 256:    */     {
/* 257:233 */       throw new u(a(paramString, 11, localClassCastException));
/* 258:    */     }
/* 259:    */   }
/* 260:    */   
/* 261:    */   public NBTTagCompound getCompoundTag(String paramString)
/* 262:    */   {
/* 263:    */     try
/* 264:    */     {
/* 265:239 */       if (!hasKey(paramString, 10)) {
/* 266:240 */         return new NBTTagCompound();
/* 267:    */       }
/* 268:242 */       return (NBTTagCompound)this.c.get(paramString);
/* 269:    */     }
/* 270:    */     catch (ClassCastException localClassCastException)
/* 271:    */     {
/* 272:244 */       throw new u(a(paramString, 10, localClassCastException));
/* 273:    */     }
/* 274:    */   }
/* 275:    */   
/* 276:    */   public fv c(String paramString, int paramInt)
/* 277:    */   {
/* 278:    */     try
/* 279:    */     {
/* 280:250 */       if (b(paramString) != 9) {
/* 281:251 */         return new fv();
/* 282:    */       }
/* 283:253 */       fv localfv = (fv)this.c.get(paramString);
/* 284:254 */       if ((localfv.c() > 0) && (localfv.f() != paramInt)) {
/* 285:255 */         return new fv();
/* 286:    */       }
/* 287:257 */       return localfv;
/* 288:    */     }
/* 289:    */     catch (ClassCastException localClassCastException)
/* 290:    */     {
/* 291:259 */       throw new u(a(paramString, 9, localClassCastException));
/* 292:    */     }
/* 293:    */   }
/* 294:    */   
/* 295:    */   public boolean getBoolean(String paramString)
/* 296:    */   {
/* 297:264 */     return d(paramString) != 0;
/* 298:    */   }
/* 299:    */   
/* 300:    */   public void o(String paramString)
/* 301:    */   {
/* 302:268 */     this.c.remove(paramString);
/* 303:    */   }
/* 304:    */   
/* 305:    */   public String toString()
/* 306:    */   {
/* 307:288 */     String str1 = "{";
/* 308:289 */     for (String str2 : this.c.keySet()) {
/* 309:290 */       str1 = str1 + str2 + ':' + this.c.get(str2) + ',';
/* 310:    */     }
/* 311:292 */     return str1 + "}";
/* 312:    */   }
/* 313:    */   
/* 314:    */   public boolean c_()
/* 315:    */   {
/* 316:310 */     return this.c.isEmpty();
/* 317:    */   }
/* 318:    */   
/* 319:    */   private b a(String paramString, int paramInt, ClassCastException paramClassCastException)
/* 320:    */   {
/* 321:314 */     b localb = net.minecraft.src.b.a(paramClassCastException, "Reading NBT data");
/* 322:315 */     j localj = localb.a("Corrupt NBT tag", 1);
/* 323:    */     
/* 324:317 */     localj.a("Tag type found", new fo(this, paramString));
/* 325:    */     
/* 326:    */ 
/* 327:    */ 
/* 328:    */ 
/* 329:    */ 
/* 330:323 */     localj.a("Tag type expected", new fp(this, paramInt));
/* 331:    */     
/* 332:    */ 
/* 333:    */ 
/* 334:    */ 
/* 335:    */ 
/* 336:329 */     localj.a("Tag name", paramString);
/* 337:    */     
/* 338:331 */     return localb;
/* 339:    */   }
/* 340:    */   
/* 341:    */   public NBTBase b()
/* 342:    */   {
/* 343:336 */     NBTTagCompound localfn = new NBTTagCompound();
/* 344:337 */     for (String str : this.c.keySet()) {
/* 345:338 */       localfn.setNBT(str, ((NBTBase)this.c.get(str)).b());
/* 346:    */     }
/* 347:340 */     return localfn;
/* 348:    */   }
/* 349:    */   
/* 350:    */   public boolean equals(Object paramObject)
/* 351:    */   {
/* 352:345 */     if (super.equals(paramObject))
/* 353:    */     {
/* 354:346 */       NBTTagCompound localfn = (NBTTagCompound)paramObject;
/* 355:347 */       return this.c.entrySet().equals(localfn.c.entrySet());
/* 356:    */     }
/* 357:349 */     return false;
/* 358:    */   }
/* 359:    */   
/* 360:    */   public int hashCode()
/* 361:    */   {
/* 362:354 */     return super.hashCode() ^ this.c.hashCode();
/* 363:    */   }
/* 364:    */   
/* 365:    */   private static void a(String paramString, NBTBase paramgd, DataOutput paramDataOutput) throws IOException
/* 366:    */   {
/* 367:358 */     paramDataOutput.writeByte(paramgd.a());
/* 368:359 */     if (paramgd.a() == 0) {
/* 369:360 */       return;
/* 370:    */     }
/* 371:363 */     paramDataOutput.writeUTF(paramString);
/* 372:    */     
/* 373:365 */     paramgd.a(paramDataOutput);
/* 374:    */   }
/* 375:    */   
/* 376:    */   private static byte a(DataInput paramDataInput, fx paramfx) throws IOException
/* 377:    */   {
/* 378:369 */     return paramDataInput.readByte();
/* 379:    */   }
/* 380:    */   
/* 381:    */   private static String b(DataInput paramDataInput, fx paramfx) throws IOException
/* 382:    */   {
/* 383:373 */     return paramDataInput.readUTF();
/* 384:    */   }
/* 385:    */   
/* 386:    */   static NBTBase a(byte paramByte, String paramString, DataInput paramDataInput, int paramInt, fx paramfx)
/* 387:    */   {
/* 388:377 */     NBTBase localgd = NBTBase.a(paramByte);
/* 389:    */     try
/* 390:    */     {
/* 391:380 */       localgd.a(paramDataInput, paramInt, paramfx);
/* 392:    */     }
/* 393:    */     catch (IOException localIOException)
/* 394:    */     {
/* 395:382 */       b localb = net.minecraft.src.b.a(localIOException, "Loading NBT data");
/* 396:383 */       j localj = localb.a("NBT Tag");
/* 397:384 */       localj.a("Tag name", paramString);
/* 398:385 */       localj.a("Tag type", Byte.valueOf(paramByte));
/* 399:386 */       throw new u(localb);
/* 400:    */     }
/* 401:389 */     return localgd;
/* 402:    */   }
/* 403:    */   
/* 404:    */   public void a(NBTTagCompound paramfn)
/* 405:    */   {
/* 406:406 */     for (String str : paramfn.c.keySet())
/* 407:    */     {
/* 408:407 */       NBTBase localgd = (NBTBase)paramfn.c.get(str);
/* 409:410 */       if (localgd.a() == 10)
/* 410:    */       {
/* 411:411 */         if (hasKey(str, 10))
/* 412:    */         {
/* 413:412 */           NBTTagCompound localfn = getCompoundTag(str);
/* 414:413 */           localfn.a((NBTTagCompound)localgd);
/* 415:    */         }
/* 416:    */         else
/* 417:    */         {
/* 418:415 */           setNBT(str, localgd.b());
/* 419:    */         }
/* 420:    */       }
/* 421:    */       else {
/* 422:418 */         setNBT(str, localgd.b());
/* 423:    */       }
/* 424:    */     }
/* 425:    */   }
				static Map<String,NBTBase> b(NBTTagCompound arg0) {return arg0.c;}
/* 426:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     fn
 * JD-Core Version:    0.7.0.1
 */
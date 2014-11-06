package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;

import java.io.IOException;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Map;
/*   7:    */ import java.util.concurrent.locks.ReadWriteLock;
/*   8:    */ import java.util.concurrent.locks.ReentrantReadWriteLock;

/*   9:    */ import org.apache.commons.lang3.ObjectUtils;
/*  10:    */ 
/*  11:    */ public class xv
/*  12:    */ {
/*  13:    */   private final Entity a;
/*  14: 34 */   private boolean b = true;
/*  15: 36 */   private static final Map<Class<?>,Integer> c = Maps.newHashMap();
/*  16:    */   
/*  17:    */   static
/*  18:    */   {
/*  19: 39 */     c.put(Byte.class, Integer.valueOf(0));
/*  20: 40 */     c.put(Short.class, Integer.valueOf(1));
/*  21: 41 */     c.put(Integer.class, Integer.valueOf(2));
/*  22: 42 */     c.put(Float.class, Integer.valueOf(3));
/*  23: 43 */     c.put(String.class, Integer.valueOf(4));
/*  24: 44 */     c.put(ItemStack.class, Integer.valueOf(5));
/*  25: 45 */     c.put(BlockPosition.class, Integer.valueOf(6));
/*  26: 46 */     c.put(fa.class, Integer.valueOf(7));
/*  27:    */   }
/*  28:    */   
/*  29: 56 */   private final Map<Integer,xw> d = Maps.newHashMap();
/*  30:    */   private boolean e;
/*  31: 58 */   private ReadWriteLock f = new ReentrantReadWriteLock();
/*  32:    */   
/*  33:    */   public xv(Entity entity)
/*  34:    */   {
/*  35: 61 */     this.a = entity;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void a(int paramInt, Object paramObject)
/*  39:    */   {
/*  40: 65 */     Integer localInteger = (Integer)c.get(paramObject.getClass());
/*  41: 66 */     if (localInteger == null) {
/*  42: 67 */       throw new IllegalArgumentException("Unknown data type: " + paramObject.getClass());
/*  43:    */     }
/*  44: 69 */     if (paramInt > 31) {
/*  45: 70 */       throw new IllegalArgumentException("Data value id is too big with " + paramInt + "! (Max is " + 31 + ")");
/*  46:    */     }
/*  47: 72 */     if (this.d.containsKey(Integer.valueOf(paramInt))) {
/*  48: 73 */       throw new IllegalArgumentException("Duplicate id value for " + paramInt + "!");
/*  49:    */     }
/*  50: 76 */     xw localxw = new xw(localInteger.intValue(), paramInt, paramObject);
/*  51: 77 */     this.f.writeLock().lock();
/*  52: 78 */     this.d.put(Integer.valueOf(paramInt), localxw);
/*  53: 79 */     this.f.writeLock().unlock();
/*  54: 80 */     this.b = false;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void a(int paramInt1, int paramInt2)
/*  58:    */   {
/*  59: 84 */     xw localxw = new xw(paramInt2, paramInt1, null);
/*  60: 85 */     this.f.writeLock().lock();
/*  61: 86 */     this.d.put(Integer.valueOf(paramInt1), localxw);
/*  62: 87 */     this.f.writeLock().unlock();
/*  63: 88 */     this.b = false;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public byte a(int paramInt)
/*  67:    */   {
/*  68: 92 */     return ((Byte)j(paramInt).b()).byteValue();
/*  69:    */   }
/*  70:    */   
/*  71:    */   public short b(int paramInt)
/*  72:    */   {
/*  73: 96 */     return ((Short)j(paramInt).b()).shortValue();
/*  74:    */   }
/*  75:    */   
/*  76:    */   public int c(int paramInt)
/*  77:    */   {
/*  78:100 */     return ((Integer)j(paramInt).b()).intValue();
/*  79:    */   }
/*  80:    */   
/*  81:    */   public float d(int paramInt)
/*  82:    */   {
/*  83:104 */     return ((Float)j(paramInt).b()).floatValue();
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String e(int paramInt)
/*  87:    */   {
/*  88:108 */     return (String)j(paramInt).b();
/*  89:    */   }
/*  90:    */   
/*  91:    */   public ItemStack f(int paramInt)
/*  92:    */   {
/*  93:112 */     return (ItemStack)j(paramInt).b();
/*  94:    */   }
/*  95:    */   
/*  96:    */   private xw j(int paramInt)
/*  97:    */   {
/*  98:117 */     this.f.readLock().lock();
/*  99:    */     xw localxw;
/* 100:    */     try
/* 101:    */     {
/* 102:120 */       localxw = (xw)this.d.get(Integer.valueOf(paramInt));
/* 103:    */     }
/* 104:    */     catch (Throwable localThrowable)
/* 105:    */     {
/* 106:122 */       b localb = net.minecraft.src.b.a(localThrowable, "Getting synched entity data");
/* 107:123 */       j localj = localb.a("Synched entity data");
/* 108:    */       
/* 109:125 */       localj.a("Data ID", Integer.valueOf(paramInt));
/* 110:126 */       throw new u(localb);
/* 111:    */     }
/* 112:129 */     this.f.readLock().unlock();
/* 113:130 */     return localxw;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public fa h(int paramInt)
/* 117:    */   {
/* 118:138 */     return (fa)j(paramInt).b();
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void b(int paramInt, Object paramObject)
/* 122:    */   {
/* 123:142 */     xw localxw = j(paramInt);
/* 124:145 */     if (ObjectUtils.notEqual(paramObject, localxw.b()))
/* 125:    */     {
/* 126:146 */       localxw.a(paramObject);
/* 127:147 */       this.a.i(paramInt);
/* 128:148 */       localxw.a(true);
/* 129:149 */       this.e = true;
/* 130:    */     }
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void i(int paramInt)
/* 134:    */   {
/* 135:154 */     xw.a(j(paramInt), true);
/* 136:155 */     this.e = true;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public boolean a()
/* 140:    */   {
/* 141:159 */     return this.e;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public static void a(List<xw> paramList, ByteBufWrapper paramhd)
/* 145:    */   {
/* 146:163 */     if (paramList != null) {
/* 147:164 */       for (xw localxw : paramList) {
/* 148:165 */         a(paramhd, localxw);
/* 149:    */       }
/* 150:    */     }
/* 151:170 */     paramhd.writeByte(127);
/* 152:    */   }
/* 153:    */   
/* 154:    */   public List<xw> b()
/* 155:    */   {
/* 156:174 */     ArrayList<xw> localArrayList = null;
/* 157:176 */     if (this.e)
/* 158:    */     {
/* 159:177 */       this.f.readLock().lock();
/* 160:178 */       for (xw localxw : this.d.values()) {
/* 161:179 */         if (localxw.d())
/* 162:    */         {
/* 163:180 */           localxw.a(false);
/* 164:182 */           if (localArrayList == null) {
/* 165:183 */             localArrayList = Lists.newArrayList();
/* 166:    */           }
/* 167:185 */           localArrayList.add(localxw);
/* 168:    */         }
/* 169:    */       }
/* 170:188 */       this.f.readLock().unlock();
/* 171:    */     }
/* 172:190 */     this.e = false;
/* 173:    */     
/* 174:192 */     return localArrayList;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public void a(ByteBufWrapper paramhd)
/* 178:    */   {
/* 179:196 */     this.f.readLock().lock();
/* 180:197 */     for (xw localxw : this.d.values()) {
/* 181:198 */       a(paramhd, localxw);
/* 182:    */     }
/* 183:200 */     this.f.readLock().unlock();
/* 184:    */     
/* 185:    */ 
/* 186:203 */     paramhd.writeByte(127);
/* 187:    */   }
/* 188:    */   
/* 189:    */   public List<xw> c()
/* 190:    */   {
/* 191:207 */     ArrayList<xw> localArrayList = null;
/* 192:    */     
/* 193:209 */     this.f.readLock().lock();
/* 194:210 */     for (xw localxw : this.d.values())
/* 195:    */     {
/* 196:211 */       if (localArrayList == null) {
/* 197:212 */         localArrayList = Lists.newArrayList();
/* 198:    */       }
/* 199:214 */       localArrayList.add(localxw);
/* 200:    */     }
/* 201:216 */     this.f.readLock().unlock();
/* 202:    */     
/* 203:218 */     return localArrayList;
/* 204:    */   }
/* 205:    */   
/* 206:    */   private static void a(ByteBufWrapper paramhd, xw paramxw)
/* 207:    */   {
/* 208:223 */     int i = (paramxw.c() << 5 | paramxw.a() & 0x1F) & 0xFF;
/* 209:224 */     paramhd.writeByte(i);
/* 210:227 */     switch (paramxw.c())
/* 211:    */     {
/* 212:    */     case 0: 
/* 213:229 */       paramhd.writeByte(((Byte)paramxw.b()).byteValue());
/* 214:230 */       break;
/* 215:    */     case 1: 
/* 216:232 */       paramhd.writeShort(((Short)paramxw.b()).shortValue());
/* 217:233 */       break;
/* 218:    */     case 2: 
/* 219:235 */       paramhd.writeInt(((Integer)paramxw.b()).intValue());
/* 220:236 */       break;
/* 221:    */     case 3: 
/* 222:238 */       paramhd.writeFloat(((Float)paramxw.b()).floatValue());
/* 223:239 */       break;
/* 224:    */     case 4: 
/* 225:241 */       paramhd.a((String)paramxw.b());
/* 226:242 */       break;
/* 227:    */     case 5: 
/* 228:244 */       ItemStack localamj = (ItemStack)paramxw.b();
/* 229:245 */       paramhd.a(localamj);
/* 230:246 */       break;
/* 231:    */     case 6: 
/* 232:248 */       BlockPosition localdt = (BlockPosition)paramxw.b();
/* 233:249 */       paramhd.writeInt(localdt.getX());
/* 234:250 */       paramhd.writeInt(localdt.getY());
/* 235:251 */       paramhd.writeInt(localdt.getZ());
/* 236:252 */       break;
/* 237:    */     case 7: 
/* 238:254 */       fa localfa = (fa)paramxw.b();
/* 239:255 */       paramhd.writeFloat(localfa.b());
/* 240:256 */       paramhd.writeFloat(localfa.c());
/* 241:257 */       paramhd.writeFloat(localfa.d());
/* 242:    */     }
/* 243:    */   }
/* 244:    */   
/* 245:    */   public static List<xw> b(ByteBufWrapper paramhd) throws IOException
/* 246:    */   {
/* 247:263 */     ArrayList<xw> localArrayList = null;
/* 248:    */     
/* 249:265 */     int i = paramhd.readByte();
/* 250:267 */     while (i != 127)
/* 251:    */     {
/* 252:268 */       if (localArrayList == null) {
/* 253:269 */         localArrayList = Lists.newArrayList();
/* 254:    */       }
/* 255:273 */       int j = (i & 0xE0) >> 5;
/* 256:274 */       int k = i & 0x1F;
/* 257:    */       
/* 258:276 */       xw localxw = null;
/* 259:277 */       switch (j)
/* 260:    */       {
/* 261:    */       case 0: 
/* 262:279 */         localxw = new xw(j, k, Byte.valueOf(paramhd.readByte()));
/* 263:280 */         break;
/* 264:    */       case 1: 
/* 265:282 */         localxw = new xw(j, k, Short.valueOf(paramhd.readShort()));
/* 266:283 */         break;
/* 267:    */       case 2: 
/* 268:285 */         localxw = new xw(j, k, Integer.valueOf(paramhd.readInt()));
/* 269:286 */         break;
/* 270:    */       case 3: 
/* 271:288 */         localxw = new xw(j, k, Float.valueOf(paramhd.readFloat()));
/* 272:289 */         break;
/* 273:    */       case 4: 
/* 274:291 */         localxw = new xw(j, k, paramhd.c(32767));
/* 275:292 */         break;
/* 276:    */       case 5: 
/* 277:294 */         localxw = new xw(j, k, paramhd.i());
/* 278:295 */         break;
/* 279:    */       case 6: 
/* 280:297 */         int m = paramhd.readInt();
/* 281:298 */         int n = paramhd.readInt();
/* 282:299 */         int i1 = paramhd.readInt();
/* 283:300 */         localxw = new xw(j, k, new BlockPosition(m, n, i1));
/* 284:301 */         break;
/* 285:    */       case 7: 
/* 286:303 */         float f1 = paramhd.readFloat();
/* 287:304 */         float f2 = paramhd.readFloat();
/* 288:305 */         float f3 = paramhd.readFloat();
/* 289:306 */         localxw = new xw(j, k, new fa(f1, f2, f3));
/* 290:    */       }
/* 291:309 */       localArrayList.add(localxw);
/* 292:    */       
/* 293:311 */       i = paramhd.readByte();
/* 294:    */     }
/* 295:314 */     return localArrayList;
/* 296:    */   }
/* 297:    */   
/* 298:    */   public void a(List<xw> paramList)
/* 299:    */   {
/* 300:323 */     this.f.writeLock().lock();
/* 301:324 */     for (xw localxw1 : paramList)
/* 302:    */     {
/* 303:325 */       xw localxw2 = (xw)this.d.get(Integer.valueOf(localxw1.a()));
/* 304:326 */       if (localxw2 != null)
/* 305:    */       {
/* 306:327 */         localxw2.a(localxw1.b());
/* 307:328 */         this.a.i(localxw1.a());
/* 308:    */       }
/* 309:    */     }
/* 310:331 */     this.f.writeLock().unlock();
/* 311:    */     
/* 312:    */ 
/* 313:334 */     this.e = true;
/* 314:    */   }
/* 315:    */   
/* 316:    */   public boolean d()
/* 317:    */   {
/* 318:338 */     return this.b;
/* 319:    */   }
/* 320:    */   
/* 321:    */   public void e()
/* 322:    */   {
/* 323:342 */     this.e = false;
/* 324:    */   }
/* 325:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     xv
 * JD-Core Version:    0.7.0.1
 */
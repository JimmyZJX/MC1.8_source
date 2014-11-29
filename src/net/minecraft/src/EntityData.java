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
/*  11:    */ public class EntityData
/*  12:    */ {
/*  13:    */   private final Entity entity;
/*  14: 34 */   private boolean clean = true;
/*  15: 36 */   private static final Map<Class<?>,Integer> dataTypeID = Maps.newHashMap();
/*  16:    */   
/*  17:    */   static
/*  18:    */   {
/*  19: 39 */     dataTypeID.put(Byte.class, Integer.valueOf(0));
/*  20: 40 */     dataTypeID.put(Short.class, Integer.valueOf(1));
/*  21: 41 */     dataTypeID.put(Integer.class, Integer.valueOf(2));
/*  22: 42 */     dataTypeID.put(Float.class, Integer.valueOf(3));
/*  23: 43 */     dataTypeID.put(String.class, Integer.valueOf(4));
/*  24: 44 */     dataTypeID.put(ItemStack.class, Integer.valueOf(5));
/*  25: 45 */     dataTypeID.put(BlockPosition.class, Integer.valueOf(6));
/*  26: 46 */     dataTypeID.put(fa.class, Integer.valueOf(7));
/*  27:    */   }
/*  28:    */   
/*  29: 56 */   private final Map<Integer,EntityDataEntry> entries = Maps.newHashMap();
/*  30:    */   private boolean e;
/*  31: 58 */   private ReadWriteLock lock = new ReentrantReadWriteLock();
/*  32:    */   
/*  33:    */   public EntityData(Entity entity)
/*  34:    */   {
/*  35: 61 */     this.entity = entity;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void addData(int id, Object value)
/*  39:    */   {
/*  40: 65 */     Integer typeID = (Integer)dataTypeID.get(value.getClass());
/*  41: 66 */     if (typeID == null) {
/*  42: 67 */       throw new IllegalArgumentException("Unknown data type: " + value.getClass());
/*  43:    */     }
/*  44: 69 */     if (id > 31) {
/*  45: 70 */       throw new IllegalArgumentException("Data value id is too big with " + id + "! (Max is " + 31 + ")");
/*  46:    */     }
/*  47: 72 */     if (this.entries.containsKey(Integer.valueOf(id))) {
/*  48: 73 */       throw new IllegalArgumentException("Duplicate id value for " + id + "!");
/*  49:    */     }
/*  50: 76 */     EntityDataEntry entry = new EntityDataEntry(typeID.intValue(), id, value);
/*  51: 77 */     this.lock.writeLock().lock();
/*  52: 78 */     this.entries.put(Integer.valueOf(id), entry);
/*  53: 79 */     this.lock.writeLock().unlock();
/*  54: 80 */     this.clean = false;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void addNullData(int id, int typeID)
/*  58:    */   {
/*  59: 84 */     EntityDataEntry entry = new EntityDataEntry(typeID, id, null);
/*  60: 85 */     this.lock.writeLock().lock();
/*  61: 86 */     this.entries.put(Integer.valueOf(id), entry);
/*  62: 87 */     this.lock.writeLock().unlock();
/*  63: 88 */     this.clean = false;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public byte getByte(int id)
/*  67:    */   {
/*  68: 92 */     return ((Byte)getData(id).getValue()).byteValue();
/*  69:    */   }
/*  70:    */   
/*  71:    */   public short getShort(int id)
/*  72:    */   {
/*  73: 96 */     return ((Short)getData(id).getValue()).shortValue();
/*  74:    */   }
/*  75:    */   
/*  76:    */   public int getInteger(int id)
/*  77:    */   {
/*  78:100 */     return ((Integer)getData(id).getValue()).intValue();
/*  79:    */   }
/*  80:    */   
/*  81:    */   public float getFloat(int id)
/*  82:    */   {
/*  83:104 */     return ((Float)getData(id).getValue()).floatValue();
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getString(int id)
/*  87:    */   {
/*  88:108 */     return (String)getData(id).getValue();
/*  89:    */   }
/*  90:    */   
/*  91:    */   public ItemStack getItemStack(int id)
/*  92:    */   {
/*  93:112 */     return (ItemStack)getData(id).getValue();
/*  94:    */   }
/*  95:    */   
/*  96:    */   private EntityDataEntry getData(int id)
/*  97:    */   {
/*  98:117 */     this.lock.readLock().lock();
/*  99:    */     EntityDataEntry entry;
/* 100:    */     try
/* 101:    */     {
/* 102:120 */       entry = this.entries.get(Integer.valueOf(id));
/* 103:    */     }
/* 104:    */     catch (Throwable localThrowable)
/* 105:    */     {
/* 106:122 */       b localb = net.minecraft.src.b.a(localThrowable, "Getting synched entity data");
/* 107:123 */       j localj = localb.a("Synched entity data");
/* 108:    */       
/* 109:125 */       localj.a("Data ID", Integer.valueOf(id));
/* 110:126 */       throw new u(localb);
/* 111:    */     }
/* 112:129 */     this.lock.readLock().unlock();
/* 113:130 */     return entry;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public fa h(int paramInt)
/* 117:    */   {
/* 118:138 */     return (fa)getData(paramInt).getValue();
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void b(int paramInt, Object paramObject)
/* 122:    */   {
/* 123:142 */     EntityDataEntry localxw = getData(paramInt);
/* 124:145 */     if (ObjectUtils.notEqual(paramObject, localxw.getValue()))
/* 125:    */     {
/* 126:146 */       localxw.setValue(paramObject);
/* 127:147 */       this.entity.i(paramInt);
/* 128:148 */       localxw.a(true);
/* 129:149 */       this.e = true;
/* 130:    */     }
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void i(int id)
/* 134:    */   {
/* 135:154 */     EntityDataEntry.a(getData(id), true);
/* 136:155 */     this.e = true;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public boolean a()
/* 140:    */   {
/* 141:159 */     return this.e;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public static void a(List<EntityDataEntry> paramList, ByteBufWrapper paramhd)
/* 145:    */   {
/* 146:163 */     if (paramList != null) {
/* 147:164 */       for (EntityDataEntry localxw : paramList) {
/* 148:165 */         writeEntry(paramhd, localxw);
/* 149:    */       }
/* 150:    */     }
/* 151:170 */     paramhd.writeByte(127);
/* 152:    */   }
/* 153:    */   
/* 154:    */   public List<EntityDataEntry> b()
/* 155:    */   {
/* 156:174 */     ArrayList<EntityDataEntry> localArrayList = null;
/* 157:176 */     if (this.e)
/* 158:    */     {
/* 159:177 */       this.lock.readLock().lock();
/* 160:178 */       for (EntityDataEntry localxw : this.entries.values()) {
/* 161:179 */         if (localxw.d())
/* 162:    */         {
/* 163:180 */           localxw.a(false);
/* 164:182 */           if (localArrayList == null) {
/* 165:183 */             localArrayList = Lists.newArrayList();
/* 166:    */           }
/* 167:185 */           localArrayList.add(localxw);
/* 168:    */         }
/* 169:    */       }
/* 170:188 */       this.lock.readLock().unlock();
/* 171:    */     }
/* 172:190 */     this.e = false;
/* 173:    */     
/* 174:192 */     return localArrayList;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public void a(ByteBufWrapper paramhd)
/* 178:    */   {
/* 179:196 */     this.lock.readLock().lock();
/* 180:197 */     for (EntityDataEntry localxw : this.entries.values()) {
/* 181:198 */       writeEntry(paramhd, localxw);
/* 182:    */     }
/* 183:200 */     this.lock.readLock().unlock();
/* 184:    */     
/* 185:    */ 
/* 186:203 */     paramhd.writeByte(127);
/* 187:    */   }
/* 188:    */   
/* 189:    */   public List<EntityDataEntry> c()
/* 190:    */   {
/* 191:207 */     ArrayList<EntityDataEntry> localArrayList = null;
/* 192:    */     
/* 193:209 */     this.lock.readLock().lock();
/* 194:210 */     for (EntityDataEntry localxw : this.entries.values())
/* 195:    */     {
/* 196:211 */       if (localArrayList == null) {
/* 197:212 */         localArrayList = Lists.newArrayList();
/* 198:    */       }
/* 199:214 */       localArrayList.add(localxw);
/* 200:    */     }
/* 201:216 */     this.lock.readLock().unlock();
/* 202:    */     
/* 203:218 */     return localArrayList;
/* 204:    */   }
/* 205:    */   
/* 206:    */   private static void writeEntry(ByteBufWrapper buf, EntityDataEntry entry)
/* 207:    */   {
/* 208:223 */     int i = (entry.getID() << 5 | entry.getType() & 0x1F) & 0xFF;
/* 209:224 */     buf.writeByte(i);
/* 210:227 */     switch (entry.getID())
/* 211:    */     {
/* 212:    */     case 0: 
/* 213:229 */       buf.writeByte(((Byte)entry.getValue()).byteValue());
/* 214:230 */       break;
/* 215:    */     case 1: 
/* 216:232 */       buf.writeShort(((Short)entry.getValue()).shortValue());
/* 217:233 */       break;
/* 218:    */     case 2: 
/* 219:235 */       buf.writeInt(((Integer)entry.getValue()).intValue());
/* 220:236 */       break;
/* 221:    */     case 3: 
/* 222:238 */       buf.writeFloat(((Float)entry.getValue()).floatValue());
/* 223:239 */       break;
/* 224:    */     case 4: 
/* 225:241 */       buf.a((String)entry.getValue());
/* 226:242 */       break;
/* 227:    */     case 5: 
/* 228:244 */       ItemStack localamj = (ItemStack)entry.getValue();
/* 229:245 */       buf.a(localamj);
/* 230:246 */       break;
/* 231:    */     case 6: 
/* 232:248 */       BlockPosition localdt = (BlockPosition)entry.getValue();
/* 233:249 */       buf.writeInt(localdt.getX());
/* 234:250 */       buf.writeInt(localdt.getY());
/* 235:251 */       buf.writeInt(localdt.getZ());
/* 236:252 */       break;
/* 237:    */     case 7: 
/* 238:254 */       fa localfa = (fa)entry.getValue();
/* 239:255 */       buf.writeFloat(localfa.b());
/* 240:256 */       buf.writeFloat(localfa.c());
/* 241:257 */       buf.writeFloat(localfa.d());
/* 242:    */     }
/* 243:    */   }
/* 244:    */   
/* 245:    */   public static List<EntityDataEntry> readEntries(ByteBufWrapper paramhd) throws IOException
/* 246:    */   {
/* 247:263 */     ArrayList<EntityDataEntry> localArrayList = null;
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
/* 258:276 */       EntityDataEntry localxw = null;
/* 259:277 */       switch (j)
/* 260:    */       {
/* 261:    */       case 0: 
/* 262:279 */         localxw = new EntityDataEntry(j, k, Byte.valueOf(paramhd.readByte()));
/* 263:280 */         break;
/* 264:    */       case 1: 
/* 265:282 */         localxw = new EntityDataEntry(j, k, Short.valueOf(paramhd.readShort()));
/* 266:283 */         break;
/* 267:    */       case 2: 
/* 268:285 */         localxw = new EntityDataEntry(j, k, Integer.valueOf(paramhd.readInt()));
/* 269:286 */         break;
/* 270:    */       case 3: 
/* 271:288 */         localxw = new EntityDataEntry(j, k, Float.valueOf(paramhd.readFloat()));
/* 272:289 */         break;
/* 273:    */       case 4: 
/* 274:291 */         localxw = new EntityDataEntry(j, k, paramhd.c(32767));
/* 275:292 */         break;
/* 276:    */       case 5: 
/* 277:294 */         localxw = new EntityDataEntry(j, k, paramhd.i());
/* 278:295 */         break;
/* 279:    */       case 6: 
/* 280:297 */         int m = paramhd.readInt();
/* 281:298 */         int n = paramhd.readInt();
/* 282:299 */         int i1 = paramhd.readInt();
/* 283:300 */         localxw = new EntityDataEntry(j, k, new BlockPosition(m, n, i1));
/* 284:301 */         break;
/* 285:    */       case 7: 
/* 286:303 */         float f1 = paramhd.readFloat();
/* 287:304 */         float f2 = paramhd.readFloat();
/* 288:305 */         float f3 = paramhd.readFloat();
/* 289:306 */         localxw = new EntityDataEntry(j, k, new fa(f1, f2, f3));
/* 290:    */       }
/* 291:309 */       localArrayList.add(localxw);
/* 292:    */       
/* 293:311 */       i = paramhd.readByte();
/* 294:    */     }
/* 295:314 */     return localArrayList;
/* 296:    */   }
/* 297:    */   
/* 298:    */   public void a(List<EntityDataEntry> paramList)
/* 299:    */   {
/* 300:323 */     this.lock.writeLock().lock();
/* 301:324 */     for (EntityDataEntry localxw1 : paramList)
/* 302:    */     {
/* 303:325 */       EntityDataEntry localxw2 = (EntityDataEntry)this.entries.get(Integer.valueOf(localxw1.getType()));
/* 304:326 */       if (localxw2 != null)
/* 305:    */       {
/* 306:327 */         localxw2.setValue(localxw1.getValue());
/* 307:328 */         this.entity.i(localxw1.getType());
/* 308:    */       }
/* 309:    */     }
/* 310:331 */     this.lock.writeLock().unlock();
/* 311:    */     
/* 312:    */ 
/* 313:334 */     this.e = true;
/* 314:    */   }
/* 315:    */   
/* 316:    */   public boolean isClean()
/* 317:    */   {
/* 318:338 */     return this.clean;
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
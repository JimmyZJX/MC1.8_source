package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Sets;

/*   3:    */ import java.io.DataInputStream;
import java.io.DataOutput;
/*   4:    */ import java.io.DataOutputStream;
/*   5:    */ import java.io.File;
import java.io.IOException;
/*   7:    */ import java.util.Iterator;
/*   8:    */ import java.util.List;
/*  10:    */ import java.util.Set;

/*  11:    */ import org.apache.logging.log4j.LogManager;
/*  12:    */ import org.apache.logging.log4j.Logger;
/*  13:    */ 
/*  14:    */ public class bfy
/*  15:    */   implements bfq, brq
/*  16:    */ {
/*  17: 35 */   private static final Logger a = LogManager.getLogger();
/*  18: 48 */   private List<bfz> b = Lists.newArrayList();
/*  19: 49 */   private Set<ChunkID> c = Sets.newHashSet();
/*  20: 50 */   private Object d = new Object();
/*  21:    */   private final File e;
/*  22:    */   
/*  23:    */   public bfy(File paramFile)
/*  24:    */   {
/*  25: 55 */     this.e = paramFile;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public Chunk a(World paramaqu, int paramInt1, int paramInt2) throws IOException
/*  29:    */   {
/*  30: 60 */     NBTTagCompound localfn = null;
/*  31: 61 */     ChunkID localaqm = new ChunkID(paramInt1, paramInt2);
/*  32: 63 */     synchronized (this.d)
/*  33:    */     {
/*  34: 64 */       if (this.c.contains(localaqm)) {
/*  35: 65 */         for (int i = 0; i < this.b.size(); i++) {
/*  36: 66 */           if (((bfz)this.b.get(i)).a.equals(localaqm))
/*  37:    */           {
/*  38: 67 */             localfn = ((bfz)this.b.get(i)).b;
/*  39: 68 */             break;
/*  40:    */           }
/*  41:    */         }
/*  42:    */       }
/*  43:    */     }
/*  44: 74 */     if (localfn == null)
/*  45:    */     {
/*  46: 75 */       DataInputStream localDataInputStream = bfx.c(this.e, paramInt1, paramInt2);
/*  47: 76 */       if (localDataInputStream != null) {
/*  48: 77 */         localfn = fz.a(localDataInputStream);
/*  49:    */       } else {
/*  50: 79 */         return null;
/*  51:    */       }
/*  52:    */     }
/*  53: 83 */     return a(paramaqu, paramInt1, paramInt2, localfn);
/*  54:    */   }
/*  55:    */   
/*  56:    */   protected Chunk a(World paramaqu, int paramInt1, int paramInt2, NBTTagCompound paramfn)
/*  57:    */   {
/*  58: 87 */     if (!paramfn.hasKey("Level", 10))
/*  59:    */     {
/*  60: 88 */       a.error("Chunk file at " + paramInt1 + "," + paramInt2 + " is missing level data, skipping");
/*  61: 89 */       return null;
/*  62:    */     }
/*  63: 91 */     if (!paramfn.getCompoundTag("Level").hasKey("Sections", 9))
/*  64:    */     {
/*  65: 92 */       a.error("Chunk file at " + paramInt1 + "," + paramInt2 + " is missing block data, skipping");
/*  66: 93 */       return null;
/*  67:    */     }
/*  68: 95 */     Chunk localbfh = a(paramaqu, paramfn.getCompoundTag("Level"));
/*  69: 96 */     if (!localbfh.isAtLocation(paramInt1, paramInt2))
/*  70:    */     {
/*  71: 97 */       a.error("Chunk file at " + paramInt1 + "," + paramInt2 + " is in the wrong location; relocating. (Expected " + paramInt1 + ", " + paramInt2 + ", got " + localbfh.x + ", " + localbfh.z + ")");
/*  72: 98 */       paramfn.setInt("xPos", paramInt1);
/*  73: 99 */       paramfn.setInt("zPos", paramInt2);
/*  74:100 */       localbfh = a(paramaqu, paramfn.getCompoundTag("Level"));
/*  75:    */     }
/*  76:102 */     return localbfh;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void a(World paramaqu, Chunk parambfh) throws aqz
/*  80:    */   {
/*  81:107 */     paramaqu.I();
/*  82:    */     try
/*  83:    */     {
/*  84:110 */       NBTTagCompound localfn1 = new NBTTagCompound();
/*  85:111 */       NBTTagCompound localfn2 = new NBTTagCompound();
/*  86:112 */       localfn1.setNBT("Level", localfn2);
/*  87:113 */       a(parambfh, paramaqu, localfn2);
/*  88:114 */       a(parambfh.j(), localfn1);
/*  89:    */     }
/*  90:    */     catch (Exception localException)
/*  91:    */     {
/*  92:116 */       localException.printStackTrace();
/*  93:    */     }
/*  94:    */   }
/*  95:    */   
/*  96:    */   protected void a(ChunkID paramaqm, NBTTagCompound paramfn)
/*  97:    */   {
/*  98:121 */     synchronized (this.d)
/*  99:    */     {
/* 100:122 */       if (this.c.contains(paramaqm)) {
/* 101:123 */         for (int i = 0; i < this.b.size(); i++) {
/* 102:124 */           if (((bfz)this.b.get(i)).a.equals(paramaqm))
/* 103:    */           {
/* 104:125 */             this.b.set(i, new bfz(paramaqm, paramfn));
/* 105:126 */             return;
/* 106:    */           }
/* 107:    */         }
/* 108:    */       }
/* 109:130 */       this.b.add(new bfz(paramaqm, paramfn));
/* 110:131 */       this.c.add(paramaqm);
/* 111:132 */       brp.a().a(this);
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   public boolean c()
/* 116:    */   {
/* 117:138 */     bfz localbfz = null;
/* 118:140 */     synchronized (this.d)
/* 119:    */     {
/* 120:141 */       if (!this.b.isEmpty())
/* 121:    */       {
/* 122:142 */         localbfz = (bfz)this.b.remove(0);
/* 123:143 */         this.c.remove(localbfz.a);
/* 124:    */       }
/* 125:    */       else
/* 126:    */       {
/* 127:145 */         return false;
/* 128:    */       }
/* 129:    */     }
/* 130:148 */     if (localbfz != null) {
/* 131:    */       try
/* 132:    */       {
/* 133:150 */         a(localbfz);
/* 134:    */       }
/* 135:    */       catch (Exception localException)
/* 136:    */       {
/* 137:152 */         localException.printStackTrace();
/* 138:    */       }
/* 139:    */     }
/* 140:156 */     return true;
/* 141:    */   }
/* 142:    */   
/* 143:    */   private void a(bfz parambfz) throws IOException
/* 144:    */   {
/* 145:160 */     DataOutputStream localDataOutputStream = bfx.d(this.e, parambfz.a.x, parambfz.a.z);
/* 146:161 */     fz.a(parambfz.b, (DataOutput)localDataOutputStream);
/* 147:162 */     localDataOutputStream.close();
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void b(World paramaqu, Chunk parambfh) {}
/* 151:    */   
/* 152:    */   public void a() {}
/* 153:    */   
/* 154:    */   public void b()
/* 155:    */   {
/* 156:175 */     while (c()) {}
/* 157:    */   }
/* 158:    */   
/* 159:    */   private void a(Chunk parambfh, World paramaqu, NBTTagCompound paramfn)
/* 160:    */   {
/* 161:180 */     paramfn.setByte("V", (byte)1);
/* 162:181 */     paramfn.setInt("xPos", parambfh.x);
/* 163:182 */     paramfn.setInt("zPos", parambfh.z);
/* 164:183 */     paramfn.a("LastUpdate", paramaqu.K());
/* 165:184 */     paramfn.setIntArray("HeightMap", parambfh.q());
/* 166:185 */     paramfn.setBoolean("TerrainPopulated", parambfh.t());
/* 167:186 */     paramfn.setBoolean("LightPopulated", parambfh.u());
/* 168:187 */     paramfn.a("InhabitedTime", parambfh.w());
/* 169:    */     
/* 170:189 */     ExtendedBlockStorage[] arrayOfbfm = parambfh.getBlockStorageArray();
/* 171:190 */     fv localfv1 = new fv();
/* 172:    */     
/* 173:192 */     int i = !paramaqu.t.o() ? 1 : 0;
/* 174:    */     Object localObject3;
/* 175:    */     NBTTagCompound localfn1;
/* 176:    */     
/* 177:    */     
/* 178:    */     Object localObject6;
/* 179:194 */     for (ExtendedBlockStorage localbfm : arrayOfbfm) {
/* 180:195 */       if (localbfm != null)
/* 181:    */       {
/* 182:198 */         localfn1 = new NBTTagCompound();
/* 183:    */         
/* 184:200 */         localfn1.setByte("Y", (byte)(((ExtendedBlockStorage)localbfm).getY() >> 4 & 0xFF));
/* 185:201 */         byte[] localObject4 = new byte[((ExtendedBlockStorage)localbfm).g().length];
/* 186:202 */         bff localObject5 = new bff();
/* 187:203 */         localObject6 = null;
/* 188:204 */         for (int m = 0; m < ((ExtendedBlockStorage)localbfm).g().length; m++)
/* 189:    */         {
/* 190:205 */           int n = localbfm.g()[m];
/* 191:206 */           int i1 = m & 0xF;
/* 192:207 */           int i2 = m >> 8 & 0xF;
/* 193:208 */           int i3 = m >> 4 & 0xF;
/* 194:210 */           if (n >> 12 != 0)
/* 195:    */           {
/* 196:211 */             if (localObject6 == null) {
/* 197:212 */               localObject6 = new bff();
/* 198:    */             }
/* 199:214 */             ((bff)localObject6).a(i1, i2, i3, n >> 12);
/* 200:    */           }
/* 201:216 */           localObject4[m] = ((byte)(n >> 4 & 0xFF));
/* 202:217 */           ((bff)localObject5).a(i1, i2, i3, n & 0xF);
/* 203:    */         }
/* 204:219 */         localfn1.setByteArray("Blocks", (byte[])localObject4);
/* 205:220 */         localfn1.setByteArray("Data", ((bff)localObject5).a());
/* 206:221 */         if (localObject6 != null) {
/* 207:222 */           localfn1.setByteArray("Add", ((bff)localObject6).a());
/* 208:    */         }
/* 209:224 */         localfn1.setByteArray("BlockLight", ((ExtendedBlockStorage)localbfm).h().a());
/* 210:225 */         if (i != 0) {
/* 211:226 */           localfn1.setByteArray("SkyLight", ((ExtendedBlockStorage)localbfm).i().a());
/* 212:    */         } else {
/* 213:229 */           localfn1.setByteArray("SkyLight", new byte[((ExtendedBlockStorage)localbfm).h().a().length]);
/* 214:    */         }
/* 215:232 */         localfv1.a(localfn1);
/* 216:    */       }
/* 217:    */     }
/* 218:234 */     paramfn.setNBT("Sections", localfv1);
/* 219:235 */     paramfn.setByteArray("Biomes", parambfh.k());
/* 220:    */     
/* 221:237 */     parambfh.g(false);
/* 222:238 */     fv localfv2 = new fv();
/* 223:239 */     for (int i1 = 0; i1 < parambfh.s().length; i1++) {
/* 224:240 */       for (Iterator<Entity> localObject2 = parambfh.s()[i1].iterator(); localObject2.hasNext();)
/* 225:    */       {
/* 226:240 */         localObject3 = localObject2.next();
/* 227:241 */         localfn1 = new NBTTagCompound();
/* 228:242 */         if (((Entity)localObject3).d(localfn1))
/* 229:    */         {
/* 230:243 */           parambfh.g(true);
/* 231:244 */           (localfv2).a(localfn1);
/* 232:    */         }
/* 233:    */       }
/* 234:    */     }
/* 235:248 */     paramfn.setNBT("Entities", localfv2);
/* 236:    */     
/* 237:250 */     localfv2 = new fv();
/* 238:251 */     for (Iterator<bcm> localObject2 = parambfh.r().values().iterator(); localObject2.hasNext();)
/* 239:    */     {
/* 240:251 */       localObject3 = localObject2.next();
/* 241:252 */       localfn1 = new NBTTagCompound();
/* 242:253 */       ((bcm)localObject3).writeToNBT(localfn1);
/* 243:254 */       localfv2.a(localfn1);
/* 244:    */     }
/* 245:256 */     paramfn.setNBT("TileEntities", localfv2);
/* 246:    */     
/* 247:258 */     List<TickListener> localObject2 = paramaqu.a(parambfh, false);
/* 248:259 */     if (localObject2 != null)
/* 249:    */     {
/* 250:260 */       long l = paramaqu.K();
/* 251:    */       
/* 252:262 */       fv localObject4 = new fv();
/* 253:263 */       for (Iterator<TickListener> localObject5 = localObject2.iterator(); localObject5.hasNext();)
/* 254:    */       {
/* 255:263 */         localObject6 = localObject5.next();
/* 256:264 */         NBTTagCompound localfn2 = new NBTTagCompound();
/* 257:265 */         oa localoa = (oa)BlockType.c.c(((TickListener)localObject6).a());
/* 258:266 */         localfn2.setString("i", localoa == null ? "" : localoa.toString());
/* 259:267 */         localfn2.setInt("x", ((TickListener)localObject6).a.getX());
/* 260:268 */         localfn2.setInt("y", ((TickListener)localObject6).a.getY());
/* 261:269 */         localfn2.setInt("z", ((TickListener)localObject6).a.getZ());
/* 262:270 */         localfn2.setInt("t", (int)(((TickListener)localObject6).time - l));
/* 263:271 */         localfn2.setInt("p", ((TickListener)localObject6).c);
/* 264:    */         
/* 265:273 */         ((fv)localObject4).a(localfn2);
/* 266:    */       }
/* 267:275 */       paramfn.setNBT("TileTicks", (NBTBase)localObject4);
/* 268:    */     }
/* 269:    */   }
/* 270:    */   
/* 271:    */   private Chunk a(World paramaqu, NBTTagCompound paramfn)
/* 272:    */   {
/* 273:281 */     int i = paramfn.getInteger("xPos");
/* 274:282 */     int j = paramfn.getInteger("zPos");
/* 275:    */     
/* 276:284 */     Chunk localbfh = new Chunk(paramaqu, i, j);
/* 277:285 */     localbfh.a(paramfn.l("HeightMap"));
/* 278:286 */     localbfh.d(paramfn.getBoolean("TerrainPopulated"));
/* 279:287 */     localbfh.e(paramfn.getBoolean("LightPopulated"));
/* 280:288 */     localbfh.c(paramfn.getLong("InhabitedTime"));
/* 281:    */     
/* 282:290 */     fv localfv1 = paramfn.c("Sections", 10);
/* 283:291 */     int k = 16;
/* 284:292 */     ExtendedBlockStorage[] arrayOfbfm = new ExtendedBlockStorage[k];
/* 285:    */     
/* 286:294 */     boolean bool = !paramaqu.t.o();
/* 287:    */     
/* 288:    */     
/* 289:    */     Object localObject3;
/* 290:    */     Entity localwv;
/* 291:296 */     for (int m = 0; m < localfv1.c(); m++)
/* 292:    */     {
/* 293:297 */       NBTTagCompound localfn1 = localfv1.b(m);
/* 294:    */       
/* 295:299 */       int i1 = localfn1.d("Y");
/* 296:300 */       ExtendedBlockStorage localObject1 = new ExtendedBlockStorage(i1 << 4, bool);
/* 297:301 */       byte[] localObject2 = localfn1.k("Blocks");
/* 298:302 */       localObject3 = new bff(localfn1.k("Data"));
/* 299:303 */       bff localwv1 = localfn1.hasKey("Add", 7) ? new bff(localfn1.k("Add")) : null;
/* 300:304 */       char[] arrayOfChar = new char[localObject2.length];
/* 301:305 */       for (int i4 = 0; i4 < arrayOfChar.length; i4++)
/* 302:    */       {
/* 303:306 */         int i5 = i4 & 0xF;
/* 304:307 */         int i6 = i4 >> 8 & 0xF;
/* 305:308 */         int i7 = i4 >> 4 & 0xF;
/* 306:309 */         int i8 = localwv1 != null ? localwv1.a(i5, i6, i7) : 0;
/* 307:310 */         arrayOfChar[i4] = ((char)(i8 << 12 | (localObject2[i4] & 0xFF) << 4 | ((bff)localObject3).a(i5, i6, i7)));
/* 308:    */       }
/* 309:312 */       ((ExtendedBlockStorage)localObject1).a(arrayOfChar);
/* 310:313 */       ((ExtendedBlockStorage)localObject1).a(new bff(localfn1.k("BlockLight")));
/* 311:314 */       if (bool) {
/* 312:315 */         ((ExtendedBlockStorage)localObject1).b(new bff(localfn1.k("SkyLight")));
/* 313:    */       }
/* 314:317 */       ((ExtendedBlockStorage)localObject1).e();
/* 315:    */       
/* 316:319 */       arrayOfbfm[i1] = localObject1;
/* 317:    */     }
/* 318:321 */     localbfh.a(arrayOfbfm);
/* 319:322 */     if (paramfn.hasKey("Biomes", 7)) {
/* 320:323 */       localbfh.a(paramfn.k("Biomes"));
/* 321:    */     }
/* 322:326 */     fv localfv2 = paramfn.c("Entities", 10);
/* 323:327 */     if (localfv2 != null) {
/* 324:328 */       for (int n = 0; n < localfv2.c(); n++)
/* 325:    */       {
/* 326:329 */         NBTTagCompound localfn2 = localfv2.b(n);
/* 327:330 */         Entity localObject1 = EntityList.a(localfn2, paramaqu);
/* 328:331 */         localbfh.g(true);
/* 329:332 */         if (localObject1 != null)
/* 330:    */         {
/* 331:333 */           localbfh.addEntity((Entity)localObject1);
/* 332:    */           
/* 333:    */ 
/* 334:336 */           Entity localObject2 = localObject1;
/* 335:337 */           localObject3 = localfn2;
/* 336:338 */           while (((NBTTagCompound)localObject3).hasKey("Riding", 10))
/* 337:    */           {
/* 338:339 */             localwv = EntityList.a(((NBTTagCompound)localObject3).getCompoundTag("Riding"), paramaqu);
/* 339:340 */             if (localwv != null)
/* 340:    */             {
/* 341:341 */               localbfh.addEntity(localwv);
/* 342:342 */               ((Entity)localObject2).mount(localwv);
/* 343:    */             }
/* 344:344 */             localObject2 = localwv;
/* 345:345 */             localObject3 = ((NBTTagCompound)localObject3).getCompoundTag("Riding");
/* 346:    */           }
/* 347:    */         }
/* 348:    */       }
/* 349:    */     }
/* 350:351 */     fv localfv3 = paramfn.c("TileEntities", 10);
/* 351:352 */     if (localfv3 != null) {
/* 352:353 */       for (int i2 = 0; i2 < localfv3.c(); i2++)
/* 353:    */       {
/* 354:354 */         NBTTagCompound localObject1 = localfv3.b(i2);
/* 355:355 */         bcm localObject2 = bcm.fromNBT((NBTTagCompound)localObject1);
/* 356:356 */         if (localObject2 != null) {
/* 357:357 */           localbfh.a((bcm)localObject2);
/* 358:    */         }
/* 359:    */       }
/* 360:    */     }
/* 361:362 */     if (paramfn.hasKey("TileTicks", 9))
/* 362:    */     {
/* 363:363 */       fv localfv4 = paramfn.c("TileTicks", 10);
/* 364:365 */       if (localfv4 != null) {
/* 365:366 */         for (int i3 = 0; i3 < localfv4.c(); i3++)
/* 366:    */         {
/* 367:367 */           NBTTagCompound localObject2 = localfv4.b(i3);
/* 368:370 */           if (((NBTTagCompound)localObject2).hasKey("i", 8)) {
/* 369:371 */             localObject3 = BlockType.b(((NBTTagCompound)localObject2).getString("i"));
/* 370:    */           } else {
/* 371:373 */             localObject3 = BlockType.c(((NBTTagCompound)localObject2).getInteger("i"));
/* 372:    */           }
/* 373:375 */           paramaqu.b(new BlockPosition(((NBTTagCompound)localObject2).getInteger("x"), ((NBTTagCompound)localObject2).getInteger("y"), ((NBTTagCompound)localObject2).getInteger("z")), (BlockType)localObject3, ((NBTTagCompound)localObject2).getInteger("t"), ((NBTTagCompound)localObject2).getInteger("p"));
/* 374:    */         }
/* 375:    */       }
/* 376:    */     }
/* 377:379 */     return localbfh;
/* 378:    */   }
/* 379:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bfy
 * JD-Core Version:    0.7.0.1
 */
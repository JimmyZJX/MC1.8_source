package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.io.IOException;
/*   3:    */ import java.util.Collections;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Set;
/*   7:    */ import java.util.concurrent.ConcurrentHashMap;
/*   8:    */ import org.apache.logging.log4j.LogManager;
/*   9:    */ import org.apache.logging.log4j.Logger;
/*  10:    */ 
/*  11:    */ public class qs
/*  12:    */   implements bfe
/*  13:    */ {
/*  14: 29 */   private static final Logger b = LogManager.getLogger();
/*  15: 31 */   private Set<Long> c = Collections.newSetFromMap(new ConcurrentHashMap<Long,Boolean>());
/*  16:    */   private Chunk d;
/*  17:    */   private bfe e;
/*  18:    */   private bfq f;
/*  19: 35 */   public boolean a = true;
/*  20: 37 */   private ur g = new ur();
/*  21: 38 */   private List<Chunk> h = Lists.newArrayList();
/*  22:    */   private WorldServer i;
/*  23:    */   
/*  24:    */   public qs(WorldServer paramqt, bfq parambfq, bfe parambfe)
/*  25:    */   {
/*  26: 42 */     this.d = new bfg(paramqt, 0, 0);
/*  27:    */     
/*  28: 44 */     this.i = paramqt;
/*  29: 45 */     this.f = parambfq;
/*  30: 46 */     this.e = parambfe;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public boolean a(int paramInt1, int paramInt2)
/*  34:    */   {
/*  35: 51 */     return this.g.b(ChunkID.toLong(paramInt1, paramInt2));
/*  36:    */   }
/*  37:    */   
/*  38:    */   public List<Chunk> a()
/*  39:    */   {
/*  40: 55 */     return this.h;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void b(int paramInt1, int paramInt2)
/*  44:    */   {
/*  45: 59 */     if (this.i.t.e())
/*  46:    */     {
/*  47: 60 */       if (!this.i.c(paramInt1, paramInt2)) {
/*  48: 61 */         this.c.add(Long.valueOf(ChunkID.toLong(paramInt1, paramInt2)));
/*  49:    */       }
/*  50:    */     }
/*  51:    */     else {
/*  52: 64 */       this.c.add(Long.valueOf(ChunkID.toLong(paramInt1, paramInt2)));
/*  53:    */     }
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void b()
/*  57:    */   {
/*  58: 69 */     for (Chunk localbfh : this.h) {
/*  59: 70 */       b(localbfh.x, localbfh.z);
/*  60:    */     }
/*  61:    */   }
/*  62:    */   
/*  63:    */   public Chunk c(int paramInt1, int paramInt2)
/*  64:    */   {
/*  65: 76 */     long l = ChunkID.toLong(paramInt1, paramInt2);
/*  66: 77 */     this.c.remove(Long.valueOf(l));
/*  67:    */     
/*  68: 79 */     Chunk localbfh = (Chunk)this.g.a(l);
/*  69: 80 */     if (localbfh == null)
/*  70:    */     {
/*  71: 81 */       localbfh = e(paramInt1, paramInt2);
/*  72: 82 */       if (localbfh == null) {
/*  73: 83 */         if (this.e == null) {
/*  74: 84 */           localbfh = this.d;
/*  75:    */         } else {
/*  76:    */           try
/*  77:    */           {
/*  78: 87 */             localbfh = this.e.getChunk(paramInt1, paramInt2);
/*  79:    */           }
/*  80:    */           catch (Throwable localThrowable)
/*  81:    */           {
/*  82: 89 */             b localb = net.minecraft.src.b.a(localThrowable, "Exception generating new chunk");
/*  83: 90 */             j localj = localb.a("Chunk to be generated");
/*  84:    */             
/*  85: 92 */             localj.a("Location", String.format("%d,%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
/*  86: 93 */             localj.a("Position hash", Long.valueOf(l));
/*  87: 94 */             localj.a("Generator", this.e.f());
/*  88:    */             
/*  89: 96 */             throw new u(localb);
/*  90:    */           }
/*  91:    */         }
/*  92:    */       }
/*  93:101 */       this.g.a(l, localbfh);
/*  94:102 */       this.h.add(localbfh);
/*  95:103 */       localbfh.c();
/*  96:104 */       localbfh.a(this, this, paramInt1, paramInt2);
/*  97:    */     }
/*  98:107 */     return localbfh;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public Chunk getChunk(int paramInt1, int paramInt2)
/* 102:    */   {
/* 103:112 */     Chunk localbfh = (Chunk)this.g.a(ChunkID.toLong(paramInt1, paramInt2));
/* 104:114 */     if (localbfh == null)
/* 105:    */     {
/* 106:115 */       if ((this.i.ad()) || (this.a)) {
/* 107:116 */         return c(paramInt1, paramInt2);
/* 108:    */       }
/* 109:118 */       return this.d;
/* 110:    */     }
/* 111:121 */     return localbfh;
/* 112:    */   }
/* 113:    */   
/* 114:    */   private Chunk e(int paramInt1, int paramInt2)
/* 115:    */   {
/* 116:125 */     if (this.f == null) {
/* 117:126 */       return null;
/* 118:    */     }
/* 119:    */     try
/* 120:    */     {
/* 121:129 */       Chunk localbfh = this.f.a(this.i, paramInt1, paramInt2);
/* 122:130 */       if (localbfh != null)
/* 123:    */       {
/* 124:131 */         localbfh.b(this.i.K());
/* 125:132 */         if (this.e != null) {
/* 126:133 */           this.e.a(localbfh, paramInt1, paramInt2);
/* 127:    */         }
/* 128:    */       }
/* 129:136 */       return localbfh;
/* 130:    */     }
/* 131:    */     catch (Exception localException)
/* 132:    */     {
/* 133:138 */       b.error("Couldn't load chunk", localException);
/* 134:    */     }
/* 135:139 */     return null;
/* 136:    */   }
/* 137:    */   
/* 138:    */   private void a(Chunk parambfh)
/* 139:    */   {
/* 140:144 */     if (this.f == null) {
/* 141:145 */       return;
/* 142:    */     }
/* 143:    */     try
/* 144:    */     {
/* 145:148 */       this.f.b(this.i, parambfh);
/* 146:    */     }
/* 147:    */     catch (Exception localException)
/* 148:    */     {
/* 149:150 */       b.error("Couldn't save entities", localException);
/* 150:    */     }
/* 151:    */   }
/* 152:    */   
/* 153:    */   private void b(Chunk parambfh)
/* 154:    */   {
/* 155:155 */     if (this.f == null) {
/* 156:156 */       return;
/* 157:    */     }
/* 158:    */     try
/* 159:    */     {
/* 160:159 */       parambfh.b(this.i.K());
/* 161:160 */       this.f.a(this.i, parambfh);
/* 162:    */     }
/* 163:    */     catch (IOException localIOException)
/* 164:    */     {
/* 165:162 */       b.error("Couldn't save chunk", localIOException);
/* 166:    */     }
/* 167:    */     catch (aqz localaqz)
/* 168:    */     {
/* 169:164 */       b.error("Couldn't save chunk; already in use by another instance of Minecraft?", localaqz);
/* 170:    */     }
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void a(bfe parambfe, int paramInt1, int paramInt2)
/* 174:    */   {
/* 175:170 */     Chunk localbfh = getChunk(paramInt1, paramInt2);
/* 176:171 */     if (!localbfh.t())
/* 177:    */     {
/* 178:172 */       localbfh.n();
/* 179:173 */       if (this.e != null)
/* 180:    */       {
/* 181:174 */         this.e.a(parambfe, paramInt1, paramInt2);
/* 182:175 */         localbfh.e();
/* 183:    */       }
/* 184:    */     }
/* 185:    */   }
/* 186:    */   
/* 187:    */   public boolean a(bfe parambfe, Chunk parambfh, int paramInt1, int paramInt2)
/* 188:    */   {
/* 189:182 */     if ((this.e != null) && 
/* 190:183 */       (this.e.a(parambfe, parambfh, paramInt1, paramInt2)))
/* 191:    */     {
/* 192:184 */       Chunk localbfh = getChunk(paramInt1, paramInt2);
/* 193:185 */       localbfh.e();
/* 194:186 */       return true;
/* 195:    */     }
/* 196:189 */     return false;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public boolean a(boolean paramBoolean, uy paramuy)
/* 200:    */   {
/* 201:196 */     int j = 0;
/* 202:197 */     for (int k = 0; k < this.h.size(); k++)
/* 203:    */     {
/* 204:198 */       Chunk localbfh = (Chunk)this.h.get(k);
/* 205:199 */       if (paramBoolean) {
/* 206:200 */         a(localbfh);
/* 207:    */       }
/* 208:202 */       if (localbfh.a(paramBoolean))
/* 209:    */       {
/* 210:203 */         b(localbfh);
/* 211:204 */         localbfh.f(false);
/* 212:205 */         j++;
/* 213:205 */         if ((j == 24) && (!paramBoolean)) {
/* 214:206 */           return false;
/* 215:    */         }
/* 216:    */       }
/* 217:    */     }
/* 218:211 */     return true;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public void c()
/* 222:    */   {
/* 223:216 */     if (this.f != null) {
/* 224:217 */       this.f.b();
/* 225:    */     }
/* 226:    */   }
/* 227:    */   
/* 228:    */   public boolean d()
/* 229:    */   {
/* 230:223 */     if (!this.i.c)
/* 231:    */     {
/* 232:224 */       for (int j = 0; j < 100; j++) {
/* 233:225 */         if (!this.c.isEmpty())
/* 234:    */         {
/* 235:226 */           Long localLong = (Long)this.c.iterator().next();
/* 236:    */           
/* 237:228 */           Chunk localbfh = (Chunk)this.g.a(localLong.longValue());
/* 238:229 */           if (localbfh != null)
/* 239:    */           {
/* 240:230 */             localbfh.d();
/* 241:231 */             b(localbfh);
/* 242:232 */             a(localbfh);
/* 243:233 */             this.g.d(localLong.longValue());
/* 244:234 */             this.h.remove(localbfh);
/* 245:    */           }
/* 246:236 */           this.c.remove(localLong);
/* 247:    */         }
/* 248:    */       }
/* 249:240 */       if (this.f != null) {
/* 250:241 */         this.f.a();
/* 251:    */       }
/* 252:    */     }
/* 253:245 */     return this.e.d();
/* 254:    */   }
/* 255:    */   
/* 256:    */   public boolean e()
/* 257:    */   {
/* 258:250 */     return !this.i.c;
/* 259:    */   }
/* 260:    */   
/* 261:    */   public String f()
/* 262:    */   {
/* 263:255 */     return "ServerChunkCache: " + this.g.a() + " Drop: " + this.c.size();
/* 264:    */   }
/* 265:    */   
/* 266:    */   public List<SpawnListEntry> a(EnumCreatureType paramxp, BlockPosition paramdt)
/* 267:    */   {
/* 268:260 */     return this.e.a(paramxp, paramdt);
/* 269:    */   }
/* 270:    */   
/* 271:    */   public BlockPosition a(World paramaqu, String paramString, BlockPosition paramdt)
/* 272:    */   {
/* 273:265 */     return this.e.a(paramaqu, paramString, paramdt);
/* 274:    */   }
/* 275:    */   
/* 276:    */   public int g()
/* 277:    */   {
/* 278:270 */     return this.g.a();
/* 279:    */   }
/* 280:    */   
/* 281:    */   public void a(Chunk parambfh, int paramInt1, int paramInt2) {}
/* 282:    */   
/* 283:    */   public Chunk a(BlockPosition paramdt)
/* 284:    */   {
/* 285:279 */     return getChunk(paramdt.getX() >> 4, paramdt.getZ() >> 4);
/* 286:    */   }
/* 287:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     qs
 * JD-Core Version:    0.7.0.1
 */
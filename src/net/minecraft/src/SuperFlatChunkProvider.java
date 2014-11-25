package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Map;
/*   5:    */ import java.util.Random;
/*   6:    */ 
/*   7:    */ public class SuperFlatChunkProvider
/*   8:    */   implements IChunkProvider
/*   9:    */ {
/*  10:    */   private World a;
/*  11:    */   private Random b;
/*  12: 31 */   private final Block[] c = new Block[256];
/*  13:    */   private final biv d;
/*  14: 33 */   private final List<bmm> e = Lists.newArrayList();
/*  15:    */   private final boolean f;
/*  16:    */   private final boolean g;
/*  17:    */   private bhy h;
/*  18:    */   private bhy i;
/*  19:    */   
/*  20:    */   public SuperFlatChunkProvider(World world, long paramLong, boolean paramBoolean, String paramString)
/*  21:    */   {
/*  22: 40 */     this.a = world;
/*  23: 41 */     this.b = new Random(paramLong);
/*  24: 42 */     this.d = biv.a(paramString);
/*  25: 44 */     if (paramBoolean)
/*  26:    */     {
/*  27: 45 */       Map<String,Map<String,String>> localMap = this.d.b();
/*  28: 47 */       if (localMap.containsKey("village"))
/*  29:    */       {
/*  30: 48 */         Map<String,String> localObject = localMap.get("village");
/*  31: 49 */         if (!(localObject).containsKey("size")) {
/*  32: 50 */           (localObject).put("size", "1");
/*  33:    */         }
/*  34: 52 */         this.e.add(new bmw(localObject));
/*  35:    */       }
/*  36: 55 */       if (localMap.containsKey("biome_1")) {
/*  37: 56 */         this.e.add(new blg(localMap.get("biome_1")));
/*  38:    */       }
/*  39: 58 */       if (localMap.containsKey("mineshaft")) {
/*  40: 59 */         this.e.add(new bjd(localMap.get("mineshaft")));
/*  41:    */       }
/*  42: 61 */       if (localMap.containsKey("stronghold")) {
/*  43: 62 */         this.e.add(new blp(localMap.get("stronghold")));
/*  44:    */       }
/*  45: 64 */       if (localMap.containsKey("oceanmonument")) {
/*  46: 65 */         this.e.add(new bkg(localMap.get("oceanmonument")));
/*  47:    */       }
/*  48:    */     }
/*  49: 69 */     if (this.d.b().containsKey("lake")) {
/*  50: 70 */       this.h = new bhy(BlockList.water);
/*  51:    */     }
/*  52: 72 */     if (this.d.b().containsKey("lava_lake")) {
/*  53: 73 */       this.i = new bhy(BlockList.lava);
/*  54:    */     }
/*  55: 75 */     this.g = this.d.b().containsKey("dungeon");
/*  56:    */     
/*  57: 77 */     int j = 1;
/*  58: 78 */     for (Iterator<biw> localObject = this.d.c().iterator(); localObject.hasNext();)
/*  59:    */     {
/*  60: 78 */       biw localbiw = localObject.next();
/*  61: 79 */       for (int k = localbiw.d(); k < localbiw.d() + localbiw.b(); k++)
/*  62:    */       {
/*  63: 80 */         Block localbec = localbiw.c();
/*  64: 81 */         if (localbec.getProto() != BlockList.air)
/*  65:    */         {
/*  66: 84 */           j = 0;
/*  67: 85 */           this.c[k] = localbec;
/*  68:    */         }
/*  69:    */       }
/*  70:    */     }
/*  71: 89 */     this.f = (j != 0 ? false : this.d.b().containsKey("decoration"));
/*  72:    */   }
/*  73:    */   
/*  74:    */   public Chunk getChunk(int paramInt1, int paramInt2)
/*  75:    */   {
/*  76: 99 */     bgk localbgk = new bgk();
/*  77:101 */     for (int j = 0; j < this.c.length; j++)
/*  78:    */     {
/*  79:102 */       Block localObject2 = this.c[j];
/*  80:103 */       if (localObject2 != null) {
/*  81:107 */         for (int k = 0; k < 16; k++) {
/*  82:108 */           for (int m = 0; m < 16; m++) {
/*  83:109 */             localbgk.a(k, j, m, (Block)localObject2);
/*  84:    */           }
/*  85:    */         }
/*  86:    */       }
/*  87:    */     }
/*  88:114 */     for (Iterator<bmm> localObject1 = this.e.iterator(); (localObject1).hasNext();)
/*  89:    */     {
/*  90:114 */       bgt localObject2 = localObject1.next();
/*  91:115 */       ((bgt)localObject2).a(this, this.a, paramInt1, paramInt2, localbgk);
/*  92:    */     }
/*  93:118 */     Chunk localObject1 = new Chunk(this.a, localbgk, paramInt1, paramInt2);
/*  94:119 */     arm[] localObject2 = this.a.v().b(null, paramInt1 * 16, paramInt2 * 16, 16, 16);
/*  95:120 */     byte[] arrayOfByte = ((Chunk)localObject1).k();
/*  96:122 */     for (int m = 0; m < arrayOfByte.length; m++) {
/*  97:123 */       arrayOfByte[m] = ((byte)localObject2[m].az);
/*  98:    */     }
/*  99:126 */     ((Chunk)localObject1).generateSkylightMap();
/* 100:    */     
/* 101:128 */     return localObject1;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public boolean chunkLoaded(int paramInt1, int paramInt2)
/* 105:    */   {
/* 106:133 */     return true;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void a(IChunkProvider parambfe, int paramInt1, int paramInt2)
/* 110:    */   {
/* 111:138 */     int j = paramInt1 * 16;
/* 112:139 */     int k = paramInt2 * 16;
/* 113:140 */     BlockPosition localdt = new BlockPosition(j, 0, k);
/* 114:141 */     arm localarm = this.a.b(new BlockPosition(j + 16, 0, k + 16));
/* 115:142 */     boolean bool1 = false;
/* 116:    */     
/* 117:144 */     this.b.setSeed(this.a.J());
/* 118:145 */     long l1 = this.b.nextLong() / 2L * 2L + 1L;
/* 119:146 */     long l2 = this.b.nextLong() / 2L * 2L + 1L;
/* 120:147 */     this.b.setSeed(paramInt1 * l1 + paramInt2 * l2 ^ this.a.J());
/* 121:    */     
/* 122:149 */     ChunkID localaqm = new ChunkID(paramInt1, paramInt2);
/* 123:151 */     for (Iterator<bmm> localObject = this.e.iterator(); localObject.hasNext();)
/* 124:    */     {
/* 125:151 */       bmm localbmm = localObject.next();
/* 126:152 */       boolean bool2 = localbmm.a(this.a, this.b, localaqm);
/* 127:153 */       if ((localbmm instanceof bmw)) {
/* 128:154 */         bool1 |= bool2;
/* 129:    */       }
/* 130:    */     }
/* 131:158 */     if ((this.h != null) && (!bool1) && (this.b.nextInt(4) == 0)) {
/* 132:159 */       this.h.generate(this.a, this.b, localdt.offset(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
/* 133:    */     }
/* 134:162 */     if ((this.i != null) && (!bool1) && (this.b.nextInt(8) == 0))
/* 135:    */     {
/* 136:163 */       BlockPosition localObject = localdt.offset(this.b.nextInt(16) + 8, this.b.nextInt(this.b.nextInt(248) + 8), this.b.nextInt(16) + 8);
/* 137:164 */       if ((localObject.getY() < 63) || (this.b.nextInt(10) == 0)) {
/* 138:165 */         this.i.generate(this.a, this.b, localObject);
/* 139:    */       }
/* 140:    */     }
/* 141:169 */     if (this.g) {
/* 142:170 */       for (int m = 0; m < 8; m++) {
/* 143:171 */         new DungeonGenerator().generate(this.a, this.b, localdt.offset(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
/* 144:    */       }
/* 145:    */     }
/* 146:175 */     if (this.f) {
/* 147:176 */       localarm.a(this.a, this.b, new BlockPosition(j, 0, k));
/* 148:    */     }
/* 149:    */   }
/* 150:    */   
/* 151:    */   public boolean a(IChunkProvider parambfe, Chunk parambfh, int paramInt1, int paramInt2)
/* 152:    */   {
/* 153:182 */     return false;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public boolean a(boolean paramBoolean, uy paramuy)
/* 157:    */   {
/* 158:187 */     return true;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void c() {}
/* 162:    */   
/* 163:    */   public boolean d()
/* 164:    */   {
/* 165:196 */     return false;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public boolean e()
/* 169:    */   {
/* 170:201 */     return true;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public String getName()
/* 174:    */   {
/* 175:206 */     return "FlatLevelSource";
/* 176:    */   }
/* 177:    */   
/* 178:    */   public List<SpawnListEntry> getSpawnList(EnumCreatureType paramxp, BlockPosition paramdt)
/* 179:    */   {
/* 180:211 */     arm localarm = this.a.b(paramdt);
/* 181:212 */     return localarm.a(paramxp);
/* 182:    */   }
/* 183:    */   
/* 184:    */   public BlockPosition a(World paramaqu, String paramString, BlockPosition paramdt)
/* 185:    */   {
/* 186:217 */     if ("Stronghold".equals(paramString)) {
/* 187:218 */       for (bmm localbmm : this.e) {
/* 188:219 */         if ((localbmm instanceof blp)) {
/* 189:220 */           return localbmm.b(paramaqu, paramdt);
/* 190:    */         }
/* 191:    */       }
/* 192:    */     }
/* 193:224 */     return null;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public int g()
/* 197:    */   {
/* 198:229 */     return 0;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public void a(Chunk parambfh, int paramInt1, int paramInt2)
/* 202:    */   {
/* 203:234 */     for (bmm localbmm : this.e) {
/* 204:235 */       localbmm.a(this, this.a, paramInt1, paramInt2, null);
/* 205:    */     }
/* 206:    */   }
/* 207:    */   
/* 208:    */   public Chunk getChunk(BlockPosition paramdt)
/* 209:    */   {
/* 210:241 */     return getChunk(paramdt.getX() >> 4, paramdt.getZ() >> 4);
/* 211:    */   }
/* 212:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bgq
 * JD-Core Version:    0.7.0.1
 */
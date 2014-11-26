package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class ary
/*   4:    */ {
/*   5:    */   protected World world;
/*   6:    */   protected Random random;
/*   7:    */   protected BlockPosition position;
/*   8:    */   protected bgl d;
/*   9:    */   
/*  10:    */   public void a(World w, Random r, arm paramarm, BlockPosition pos)
/*  11:    */   {
/*  12: 24 */     if (this.world != null) {
/*  13: 25 */       throw new RuntimeException("Already decorating");
/*  14:    */     }
/*  15: 27 */     this.world = w;
/*  16: 28 */     String str = w.getWorldInfo().B();
/*  17: 29 */     if (str != null) {
/*  18: 30 */       this.d = bgn.a(str).b();
/*  19:    */     } else {
/*  20: 32 */       this.d = bgn.a("").b();
/*  21:    */     }
/*  22: 34 */     this.random = r;
/*  23: 35 */     this.position = pos;
/*  24:    */     
/*  25: 37 */     this.dirtGenerator = new OreGenerator(BlockList.dirt.instance(), this.d.dirtRadius);
/*  26: 38 */     this.gravelGenerator = new OreGenerator(BlockList.gravel.instance(), this.d.gravelRadius);
/*  27: 39 */     this.graniteGenerator = new OreGenerator(BlockList.stone.instance().setData(bba.a, EnumStoneVariants.GRANITE), this.d.graniteRadius);
/*  28: 40 */     this.dioriteGenerator = new OreGenerator(BlockList.stone.instance().setData(bba.a, EnumStoneVariants.DIORITE), this.d.dioriteRadius);
/*  29: 41 */     this.andesiteGenerator = new OreGenerator(BlockList.stone.instance().setData(bba.a, EnumStoneVariants.ANDESITE), this.d.andesiteRadius);
/*  30: 42 */     this.coalGenerator = new OreGenerator(BlockList.coalOre.instance(), this.d.coalRadius);
/*  31: 43 */     this.ironGenerator = new OreGenerator(BlockList.ironOre.instance(), this.d.ironRadius);
/*  32: 44 */     this.goldGenerator = new OreGenerator(BlockList.goldOre.instance(), this.d.goldRadius);
/*  33: 45 */     this.redstoneGenerator = new OreGenerator(BlockList.redstoneOre.instance(), this.d.redStoneRadius);
/*  34: 46 */     this.diamondGenerator = new OreGenerator(BlockList.diamondOre.instance(), this.d.diamondRadius);
/*  35: 47 */     this.lapisGenerator = new OreGenerator(BlockList.lapisOre.instance(), this.d.lapisRadius);
/*  36:    */     
/*  37: 49 */     generate(paramarm);
/*  38:    */     
/*  39: 51 */     this.world = null;
/*  40: 52 */     this.random = null;
/*  41:    */   }
/*  42:    */   
/*  43: 55 */   protected TerrainGenerator e = new bhl(4);
/*  44: 56 */   protected TerrainGenerator f = new bik(BlockList.sand, 7);
/*  45: 57 */   protected TerrainGenerator g = new bik(BlockList.gravel, 6);
/*  46:    */   protected TerrainGenerator dirtGenerator;
/*  47:    */   protected TerrainGenerator gravelGenerator;
/*  48:    */   protected TerrainGenerator graniteGenerator;
/*  49:    */   protected TerrainGenerator dioriteGenerator;
/*  50:    */   protected TerrainGenerator andesiteGenerator;
/*  51:    */   protected TerrainGenerator coalGenerator;
/*  52:    */   protected TerrainGenerator ironGenerator;
/*  53:    */   protected TerrainGenerator goldGenerator;
/*  54:    */   protected TerrainGenerator redstoneGenerator;
/*  55:    */   protected TerrainGenerator diamondGenerator;
/*  56:    */   protected TerrainGenerator lapisGenerator;
/*  57: 69 */   protected bhq s = new bhq(BlockList.yellowFlower, EnumFlowerVariant.a);
/*  58: 70 */   protected TerrainGenerator t = new MushroomGenerator(BlockList.brownMushroom);
/*  59: 71 */   protected TerrainGenerator u = new MushroomGenerator(BlockList.redMushroom);
/*  60: 72 */   protected TerrainGenerator v = new bhv();
/*  61: 73 */   protected TerrainGenerator w = new bii();
/*  62: 74 */   protected TerrainGenerator x = new bhj();
/*  63: 75 */   protected TerrainGenerator y = new bit();
/*  64:    */   protected int z;
/*  65:    */   protected int A;
/*  66: 79 */   protected int B = 2;
/*  67: 80 */   protected int C = 1;
/*  68:    */   protected int D;
/*  69:    */   protected int E;
/*  70:    */   protected int F;
/*  71:    */   protected int G;
/*  72: 85 */   protected int H = 1;
/*  73: 86 */   protected int I = 3;
/*  74: 87 */   protected int J = 1;
/*  75:    */   protected int K;
/*  76: 89 */   public boolean L = true;
/*  77:    */   
/*  78:    */   protected void generate(arm paramarm)
/*  79:    */   {
/*  80: 92 */     generateOres();
/*  81:    */     int i3;
/*  82: 94 */     for (int i1 = 0; i1 < this.I; i1++)
/*  83:    */     {
/*  84: 95 */       int i2 = this.random.nextInt(16) + 8;
/*  85: 96 */       i3 = this.random.nextInt(16) + 8;
/*  86: 97 */       this.f.generate(this.world, this.random, this.world.r(this.position.offset(i2, 0, i3)));
/*  87:    */     }
/*  88:100 */     for (int i1 = 0; i1 < this.J; i1++)
/*  89:    */     {
/*  90:101 */       int i2 = this.random.nextInt(16) + 8;
/*  91:102 */       i3 = this.random.nextInt(16) + 8;
/*  92:103 */       this.e.generate(this.world, this.random, this.world.r(this.position.offset(i2, 0, i3)));
/*  93:    */     }
/*  94:106 */     for (int i1 = 0; i1 < this.H; i1++)
/*  95:    */     {
/*  96:107 */       int i2 = this.random.nextInt(16) + 8;
/*  97:108 */       i3 = this.random.nextInt(16) + 8;
/*  98:109 */       this.g.generate(this.world, this.random, this.world.r(this.position.offset(i2, 0, i3)));
/*  99:    */     }
/* 100:112 */     int i1 = this.A;
/* 101:113 */     if (this.random.nextInt(10) == 0) {
/* 102:114 */       i1++;
/* 103:    */     }
/* 104:    */     int i4;
/* 105:    */     
/* 106:117 */     for (int i2 = 0; i2 < i1; i2++)
/* 107:    */     {
/* 108:118 */       i3 = this.random.nextInt(16) + 8;
/* 109:119 */       i4 = this.random.nextInt(16) + 8;
/* 110:    */       
/* 111:121 */       bhc localbhc = paramarm.a(this.random);
/* 112:122 */       localbhc.e();
/* 113:    */       
/* 114:124 */       BlockPosition localObject1 = this.world.m(this.position.offset(i3, 0, i4));
/* 115:125 */       if (localbhc.generate(this.world, this.random, (BlockPosition)localObject1)) {
/* 116:126 */         localbhc.a(this.world, this.random, (BlockPosition)localObject1);
/* 117:    */       }
/* 118:    */     }
/* 119:130 */     for (int i2 = 0; i2 < this.K; i2++)
/* 120:    */     {
/* 121:131 */       i3 = this.random.nextInt(16) + 8;
/* 122:132 */       i4 = this.random.nextInt(16) + 8;
/* 123:133 */       this.v.generate(this.world, this.random, this.world.m(this.position.offset(i3, 0, i4)));
/* 124:    */     }
/* 125:    */     int i5;
/* 126:    */     
/* 127:136 */     for (int i2 = 0; i2 < this.B; i2++)
/* 128:    */     {
/* 129:137 */       i3 = this.random.nextInt(16) + 8;
/* 130:138 */       i4 = this.random.nextInt(16) + 8;
/* 131:139 */       i5 = this.random.nextInt(this.world.m(this.position.offset(i3, 0, i4)).getY() + 32);
/* 132:    */       
/* 133:141 */       BlockPosition localObject1 = this.position.offset(i3, i5, i4);
/* 134:142 */       EnumFlowerVariant localObject2 = paramarm.a(this.random, localObject1);
/* 135:143 */       avy localavy = localObject2.a().a();
/* 136:144 */       if (localavy.getMaterial() != Material.air)
/* 137:    */       {
/* 138:145 */         this.s.a(localavy, localObject2);
/* 139:146 */         this.s.generate(this.world, this.random, localObject1);
/* 140:    */       }
/* 141:    */     }
/* 142:150 */     for (int i2 = 0; i2 < this.C; i2++)
/* 143:    */     {
/* 144:151 */       i3 = this.random.nextInt(16) + 8;
/* 145:152 */       i4 = this.random.nextInt(16) + 8;
/* 146:153 */       i5 = this.random.nextInt(this.world.m(this.position.offset(i3, 0, i4)).getY() * 2);
/* 147:    */       
/* 148:155 */       paramarm.b(this.random).generate(this.world, this.random, this.position.offset(i3, i5, i4));
/* 149:    */     }
/* 150:158 */     for (int i2 = 0; i2 < this.D; i2++)
/* 151:    */     {
/* 152:159 */       i3 = this.random.nextInt(16) + 8;
/* 153:160 */       i4 = this.random.nextInt(16) + 8;
/* 154:161 */       i5 = this.random.nextInt(this.world.m(this.position.offset(i3, 0, i4)).getY() * 2);
/* 155:    */       
/* 156:163 */       new bhm().generate(this.world, this.random, this.position.offset(i3, i5, i4));
/* 157:    */     }
/* 158:166 */     for (int i2 = 0; i2 < this.z; i2++)
/* 159:    */     {
/* 160:167 */       i3 = this.random.nextInt(16) + 8;
/* 161:168 */       i4 = this.random.nextInt(16) + 8;
/* 162:169 */       i5 = this.random.nextInt(this.world.m(this.position.offset(i3, 0, i4)).getY() * 2);
/* 163:    */       
/* 164:171 */       BlockPosition localObject1 = this.position.offset(i3, i5, i4);
/* 165:172 */       while (localObject1.getY() > 0)
/* 166:    */       {
/* 167:173 */         BlockPosition localObject2 = ((BlockPosition)localObject1).down();
/* 168:174 */         if (!this.world.isEmpty((BlockPosition)localObject2)) {
/* 169:    */           break;
/* 170:    */         }
/* 171:178 */         localObject1 = localObject2;
/* 172:    */       }
/* 173:180 */       this.y.generate(this.world, this.random, (BlockPosition)localObject1);
/* 174:    */     }
/* 175:    */     int i6;
/* 176:183 */     for (int i2 = 0; i2 < this.E; i2++)
/* 177:    */     {
/* 178:184 */       if (this.random.nextInt(4) == 0)
/* 179:    */       {
/* 180:185 */         i3 = this.random.nextInt(16) + 8;
/* 181:186 */         i4 = this.random.nextInt(16) + 8;
/* 182:187 */         BlockPosition localdt2 = this.world.m(this.position.offset(i3, 0, i4));
/* 183:188 */         this.t.generate(this.world, this.random, localdt2);
/* 184:    */       }
/* 185:191 */       if (this.random.nextInt(8) == 0)
/* 186:    */       {
/* 187:192 */         i3 = this.random.nextInt(16) + 8;
/* 188:193 */         i4 = this.random.nextInt(16) + 8;
/* 189:194 */         i6 = this.random.nextInt(this.world.m(this.position.offset(i3, 0, i4)).getY() * 2);
/* 190:195 */         BlockPosition localObject1 = this.position.offset(i3, i6, i4);
/* 191:196 */         this.u.generate(this.world, this.random, localObject1);
/* 192:    */       }
/* 193:    */     }
/* 194:200 */     if (this.random.nextInt(4) == 0)
/* 195:    */     {
/* 196:201 */       int i2 = this.random.nextInt(16) + 8;
/* 197:202 */       i3 = this.random.nextInt(16) + 8;
/* 198:203 */       i4 = this.random.nextInt(this.world.m(this.position.offset(i2, 0, i3)).getY() * 2);
/* 199:204 */       this.t.generate(this.world, this.random, this.position.offset(i2, i4, i3));
/* 200:    */     }
/* 201:207 */     if (this.random.nextInt(8) == 0)
/* 202:    */     {
/* 203:208 */       int i2 = this.random.nextInt(16) + 8;
/* 204:209 */       i3 = this.random.nextInt(16) + 8;
/* 205:210 */       i4 = this.random.nextInt(this.world.m(this.position.offset(i2, 0, i3)).getY() * 2);
/* 206:211 */       this.u.generate(this.world, this.random, this.position.offset(i2, i4, i3));
/* 207:    */     }
/* 208:214 */     for (int i2 = 0; i2 < this.F; i2++)
/* 209:    */     {
/* 210:215 */       i3 = this.random.nextInt(16) + 8;
/* 211:216 */       i4 = this.random.nextInt(16) + 8;
/* 212:217 */       i6 = this.random.nextInt(this.world.m(this.position.offset(i3, 0, i4)).getY() * 2);
/* 213:218 */       this.w.generate(this.world, this.random, this.position.offset(i3, i6, i4));
/* 214:    */     }
/* 215:221 */     for (int i2 = 0; i2 < 10; i2++)
/* 216:    */     {
/* 217:222 */       i3 = this.random.nextInt(16) + 8;
/* 218:223 */       i4 = this.random.nextInt(16) + 8;
/* 219:224 */       i6 = this.random.nextInt(this.world.m(this.position.offset(i3, 0, i4)).getY() * 2);
/* 220:225 */       this.w.generate(this.world, this.random, this.position.offset(i3, i6, i4));
/* 221:    */     }
/* 222:228 */     if (this.random.nextInt(32) == 0)
/* 223:    */     {
/* 224:229 */       int i2 = this.random.nextInt(16) + 8;
/* 225:230 */       i3 = this.random.nextInt(16) + 8;
/* 226:231 */       i4 = this.random.nextInt(this.world.m(this.position.offset(i2, 0, i3)).getY() * 2);
/* 227:232 */       new bih().generate(this.world, this.random, this.position.offset(i2, i4, i3));
/* 228:    */     }
/* 229:235 */     for (int i2 = 0; i2 < this.G; i2++)
/* 230:    */     {
/* 231:236 */       i3 = this.random.nextInt(16) + 8;
/* 232:237 */       i4 = this.random.nextInt(16) + 8;
/* 233:238 */       i6 = this.random.nextInt(this.world.m(this.position.offset(i3, 0, i4)).getY() * 2);
/* 234:239 */       this.x.generate(this.world, this.random, this.position.offset(i3, i6, i4));
/* 235:    */     }
/* 236:242 */     if (this.L)
/* 237:    */     {
/* 238:    */       BlockPosition localdt1;
/* 239:243 */       for (int i2 = 0; i2 < 50; i2++)
/* 240:    */       {
/* 241:244 */         localdt1 = this.position.offset(this.random.nextInt(16) + 8, this.random.nextInt(this.random.nextInt(248) + 8), this.random.nextInt(16) + 8);
/* 242:245 */         new bin(BlockList.flowingWater).generate(this.world, this.random, localdt1);
/* 243:    */       }
/* 244:248 */       for (int i2 = 0; i2 < 20; i2++)
/* 245:    */       {
/* 246:249 */         localdt1 = this.position.offset(this.random.nextInt(16) + 8, this.random.nextInt(this.random.nextInt(this.random.nextInt(240) + 8) + 8), this.random.nextInt(16) + 8);
/* 247:    */         
/* 248:251 */         new bin(BlockList.flowingLava).generate(this.world, this.random, localdt1);
/* 249:    */       }
/* 250:    */     }
/* 251:    */   }
/* 252:    */   
/* 253:    */   protected void generateOre(int num, TerrainGenerator parambhp, int y1, int y2)
/* 254:    */   {
/* 255:261 */     if (y2 < y1)
/* 256:    */     {
/* 257:262 */       int t = y1;
/* 258:263 */       y1 = y2;
/* 259:264 */       y2 = t;
/* 260:    */     }
/* 261:265 */     else if (y2 == y1)
/* 262:    */     {
/* 263:266 */       if (y1 < 255) {
/* 264:267 */         y2++;
/* 265:    */       } else {
/* 266:269 */         y1--;
/* 267:    */       }
/* 268:    */     }
/* 269:273 */     for (int i1 = 0; i1 < num; i1++)
/* 270:    */     {
/* 271:274 */       BlockPosition localdt = this.position.offset(this.random.nextInt(16), this.random.nextInt(y2 - y1) + y1, this.random.nextInt(16));
/* 272:275 */       parambhp.generate(this.world, this.random, localdt);
/* 273:    */     }
/* 274:    */   }
/* 275:    */   
/* 276:    */   protected void generateLapis(int paramInt1, TerrainGenerator parambhp, int paramInt2, int paramInt3)
/* 277:    */   {
/* 278:280 */     for (int i1 = 0; i1 < paramInt1; i1++)
/* 279:    */     {
/* 280:281 */       BlockPosition localdt = this.position.offset(this.random.nextInt(16), this.random.nextInt(paramInt3) + this.random.nextInt(paramInt3) + paramInt2 - paramInt3, this.random.nextInt(16));
/* 281:282 */       parambhp.generate(this.world, this.random, localdt);
/* 282:    */     }
/* 283:    */   }
/* 284:    */   
/* 285:    */   protected void generateOres()
/* 286:    */   {
/* 287:287 */     generateOre(this.d.dirtPerChunk, this.dirtGenerator, this.d.K, this.d.L);
/* 288:288 */     generateOre(this.d.gravelPerChunk, this.gravelGenerator, this.d.O, this.d.P);
/* 289:289 */     generateOre(this.d.dioritePerChunk, this.dioriteGenerator, this.d.W, this.d.X);
/* 290:290 */     generateOre(this.d.granitePerChunk, this.graniteGenerator, this.d.S, this.d.T);
/* 291:291 */     generateOre(this.d.andesitePerChunk, this.andesiteGenerator, this.d.aa, this.d.ab);
/* 292:292 */     generateOre(this.d.coalPerChunk, this.coalGenerator, this.d.ae, this.d.af);
/* 293:293 */     generateOre(this.d.ironPerChunk, this.ironGenerator, this.d.ironY1, this.d.aj);
/* 294:294 */     generateOre(this.d.goldPerChunk, this.goldGenerator, this.d.goldY1, this.d.an);
/* 295:295 */     generateOre(this.d.redstonePerChunk, this.redstoneGenerator, this.d.redstoneY1, this.d.redstoneY2);
/* 296:296 */     generateOre(this.d.diamondPerChunk, this.diamondGenerator, this.d.diamondY1, this.d.diamondY2);
/* 297:297 */     generateLapis(this.d.lapisPerChunk, this.lapisGenerator, this.d.ay, this.d.az);
/* 298:    */   }
/* 299:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ary
 * JD-Core Version:    0.7.0.1
 */
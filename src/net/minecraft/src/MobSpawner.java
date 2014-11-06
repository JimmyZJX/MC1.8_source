package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Sets;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Random;
/*   6:    */ import java.util.Set;
/*   7:    */ 
/*   8:    */ public final class MobSpawner
/*   9:    */ {
/*  10: 28 */   private static final int maxChunkNum = (int)Math.pow(17.0D, 2.0D);
/*  11: 30 */   private final Set<ChunkID> eligibleChunks = Sets.newHashSet();
/*  12:    */   
/*  13:    */   public int work(WorldServer world, boolean spawnMonster, boolean spawnPeaceful, boolean spawnAnimal)
/*  14:    */   {
/*  15: 33 */     if ((!spawnMonster) && (!spawnPeaceful)) {
/*  16: 34 */       return 0;
/*  17:    */     }
/*  18: 37 */     this.eligibleChunks.clear();
/*  19: 38 */     int elegibleChunkNum = 0;
/*  44:    */     int chunkZ;
/*  45:    */     int chunkDist;
/*  46:    */     int dz;
/*  47:    */     int i3;
/*  20: 40 */     for (Iterator<EntityPlayer> localIterator = world.playerList.iterator(); localIterator.hasNext();)
/*  21:    */     {
/*  22: 40 */       EntityPlayer player = localIterator.next();
/*  23: 41 */       if (!player.v())
/*  24:    */       {
/*  25: 42 */         int chunkX = MathUtils.floor(player.xPos / 16.0D);
/*  26: 43 */         chunkZ = MathUtils.floor(player.zPos / 16.0D);
/*  27: 44 */         chunkDist = 8;
/*  28: 46 */         for (int dx = -chunkDist; dx <= chunkDist; dx++) {
/*  29: 47 */           for (dz = -chunkDist; dz <= chunkDist; dz++)
/*  30:    */           {
/*  31: 48 */             i3 = (dx == -chunkDist) || (dx == chunkDist) || (dz == -chunkDist) || (dz == chunkDist) ? 1 : 0;
/*  32: 49 */             ChunkID chunkID = new ChunkID(dx + chunkX, dz + chunkZ);
/*  33: 50 */             if (!this.eligibleChunks.contains(chunkID))
/*  34:    */             {
/*  35: 51 */               elegibleChunkNum++;
/*  36: 52 */               if ((i3 == 0) && (world.af().a(chunkID))) {
/*  37: 53 */                 this.eligibleChunks.add(chunkID);
/*  38:    */               }
/*  39:    */             }
/*  40:    */           }
/*  41:    */         }
/*  42:    */       }
/*  43:    */     }
/*  49: 61 */     int j = 0;
/*  50: 62 */     BlockPosition worldSpawn = world.getWorldSpawn();
/*  51:    */     
/*  52:    */     //label846:
/*  53:    */     //label852:
/*  54: 64 */     for (EnumCreatureType type : EnumCreatureType.values()) {
/*  55: 65 */       if ((!type.getIsPeaceful()) || (spawnPeaceful)) {
/*  56: 67 */         if ((type.getIsPeaceful()) || (spawnMonster)) {
/*  57: 69 */           if ((!type.getIsAnimal()) || (spawnAnimal))
/*  58:    */           {
/*  59: 73 */             int mobNum = world.countEntity(type.getCreatureClass());
/*  60: 74 */             int mobCap = type.getMobCap() * elegibleChunkNum / maxChunkNum;
/*  61: 75 */             if (mobNum <= mobCap) {
/*  62: 79 */               for (Iterator<ChunkID> iterator = this.eligibleChunks.iterator(); iterator.hasNext();)
/*  63:    */               {
/*  64: 79 */                 ChunkID chunkID = iterator.next();
/*  65: 80 */                 BlockPosition randPos = getRandomPointInChunk(world, chunkID.x, chunkID.z);
/*  66: 81 */                 int x = randPos.getX();
/*  67: 82 */                 int y = randPos.getY();
/*  68: 83 */                 int z = randPos.getZ();
/*  69:    */                 
/*  70: 85 */                 ProtoBlock block = world.getBlock(randPos).getProto();
/*  71: 86 */                 if (!block.blocksMovement())
/*  72:    */                 {
/*  73: 90 */                   int i7 = 0;
/*  74: 92 */                   //label852:
								for (int i8 = 0; i8 < 3; i8++)
/*  75:    */                   {
/*  76: 92 */                     //if (i8 >= 3) {
/*  77:    */                     //  break label852;
/*  78:    */                     //}
/*  79: 93 */                     int xx = x;
/*  80: 94 */                     int yy = y;
/*  81: 95 */                     int zz = z;
/*  82: 96 */                     int horizontalVariance = 6;
/*  83:    */                     
/*  84: 98 */                     SpawnListEntry spawnEntry = null;
/*  85: 99 */                     xq localxq = null;
/*  86:101 */                     //label846: 
								  for (int i13 = 0; i13 < 4; i13++)
/*  87:    */                     {
/*  88:101 */                       //if (i13 >= 4) {
/*  89:    */                       //  break label846;
/*  90:    */                       //}
/*  91:102 */                       xx += world.rng.nextInt(horizontalVariance) - world.rng.nextInt(horizontalVariance);
/*  92:103 */                       yy += world.rng.nextInt(1) - world.rng.nextInt(1);
/*  93:104 */                       zz += world.rng.nextInt(horizontalVariance) - world.rng.nextInt(horizontalVariance);
/*  94:105 */                       BlockPosition pos = new BlockPosition(xx, yy, zz);
/*  95:    */                       
/*  96:107 */                       float floatX = xx + 0.5F;
/*  97:108 */                       float floatZ = zz + 0.5F;
/*  98:110 */                       if (!world.isWithinRangeOfAnyPlayer(floatX, yy, floatZ, 24.0D)) {
/*  99:112 */                         if (worldSpawn.dist2(floatX, yy, floatZ) >= 576.0D)
/* 100:    */                         {
/* 101:116 */                           if (spawnEntry == null)
/* 102:    */                           {
/* 103:117 */                             spawnEntry = world.getSpawnEntry(type, pos);
/* 104:118 */                             if (spawnEntry == null) {
/* 105:    */                               break;
/* 106:    */                             }
/* 107:    */                           }
/* 108:122 */                           if (world.a(type, spawnEntry, pos)) {
/* 109:126 */                             if (canSpawnAt(xr.a(spawnEntry.mob), world, pos))
/* 110:    */                             {
/* 111:    */                               EntityMob mob;
/* 112:    */                               try
/* 113:    */                               {
/* 114:129 */                                 mob = (EntityMob)spawnEntry.mob.getConstructor(new Class[] { World.class }).newInstance(new Object[] { world });
/* 115:    */                               }
/* 116:    */                               catch (Exception e)
/* 117:    */                               {
/* 118:131 */                                 e.printStackTrace();
/* 119:132 */                                 return j;
/* 120:    */                               }
/* 121:135 */                               mob.setPositionAndAngles(floatX, yy, floatZ, world.rng.nextFloat() * 360.0F, 0.0F);
/* 122:137 */                               if ((mob.canSpawn()) && (mob.spawnAABBCheck()))
/* 123:    */                               {
/* 124:138 */                                 localxq = mob.beforeSpawn(world.E(new BlockPosition(mob)), localxq);
/* 125:140 */                                 if (mob.spawnAABBCheck())
/* 126:    */                                 {
/* 127:141 */                                   i7++;
/* 128:142 */                                   world.spawnEntity(mob);
/* 129:    */                                 }
/* 130:144 */                                 if (i7 >= mob.getMaxSpawnedInChunk()) {
/* 131:    */                                   break;
/* 132:    */                                 }
/* 133:    */                               }
/* 134:148 */                               j += i7;
/* 135:    */                             }
/* 136:    */                           }
/* 137:    */                         }
/* 138:    */                       }
/* 139:    */                     }
/* 140:    */                   }
/* 141:    */                 }
/* 142:    */               }
/* 143:    */             }
/* 144:    */           }
/* 145:    */         }
/* 146:    */       }
/* 147:    */     }
/* 148:155 */     return j;
/* 149:    */   }
/* 150:    */   
/* 151:    */   protected static BlockPosition getRandomPointInChunk(World world, int paramInt1, int paramInt2)
/* 152:    */   {
/* 153:159 */     Chunk chunk = world.getChunk(paramInt1, paramInt2);
/* 154:160 */     int x = paramInt1 * 16 + world.rng.nextInt(16);
/* 155:161 */     int z = paramInt2 * 16 + world.rng.nextInt(16);
/* 156:162 */     int k = MathUtils.roundUp(chunk.getHeight(new BlockPosition(x, 0, z)) + 1, 16);
/* 157:163 */     int y = world.rng.nextInt(k > 0 ? k : chunk.getTopFilledSegment() + 16 - 1);
/* 158:    */     
/* 159:165 */     return new BlockPosition(x, y, z);
/* 160:    */   }
/* 161:    */   
/* 162:    */   public static boolean canSpawnAt(xo paramxo, World world, BlockPosition pos)
/* 163:    */   {
/* 164:169 */     if (world.af().a(pos))
/* 165:    */     {
/* 166:170 */       ProtoBlock block = world.getBlock(pos).getProto();
/* 167:172 */       if (paramxo == xo.IN_WATER) {
/* 168:173 */         return (block.getMaterial().isLiquid()) && (world.getBlock(pos.down()).getProto().getMaterial().isLiquid()) && (!world.getBlock(pos.up()).getProto().blocksMovement());
/* 169:    */       }
/* 170:175 */       BlockPosition posUnder = pos.down();
/* 171:176 */       if (!World.isFlatSurface(world, posUnder)) {
/* 172:177 */         return false;
/* 173:    */       }
/* 174:179 */       ProtoBlock blockUnder = world.getBlock(posUnder).getProto();
/* 175:180 */       int i = (blockUnder != BlockList.bedrock) && (blockUnder != BlockList.barrier) ? 1 : 0;
/* 176:181 */       return (i != 0) && (!block.blocksMovement()) && (!block.getMaterial().isLiquid()) && (!world.getBlock(pos.up()).getProto().blocksMovement());
/* 177:    */     }
/* 178:185 */     return false;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public static void a(World world, arm paramarm, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom)
/* 182:    */   {
/* 183:189 */     List<SpawnListEntry> localList = paramarm.a(EnumCreatureType.CREATURE);
/* 184:190 */     if (localList.isEmpty()) {
/* 185:191 */       return;
/* 186:    */     }
/* 187:194 */     while (paramRandom.nextFloat() < paramarm.g())
/* 188:    */     {
/* 189:195 */       SpawnListEntry localarq = WeightedRandom.getRandomItem(world.rng, localList);
/* 190:196 */       int i = localarq.c + paramRandom.nextInt(1 + localarq.d - localarq.c);
/* 191:197 */       xq localxq = null;
/* 192:    */       
/* 193:199 */       int j = paramInt1 + paramRandom.nextInt(paramInt3);
/* 194:200 */       int k = paramInt2 + paramRandom.nextInt(paramInt4);
/* 195:201 */       int m = j;
/* 196:202 */       int n = k;
/* 197:204 */       for (int i1 = 0; i1 < i; i1++)
/* 198:    */       {
/* 199:205 */         int i2 = 0;
/* 200:206 */         for (int i3 = 0; (i2 == 0) && (i3 < 4); i3++)
/* 201:    */         {
/* 202:208 */           BlockPosition localdt = world.r(new BlockPosition(j, 0, k));
/* 203:210 */           if (canSpawnAt(xo.ON_GROUND, world, localdt))
/* 204:    */           {
/* 205:    */             EntityMob localxn;
/* 206:    */             try
/* 207:    */             {
/* 208:213 */               localxn = (EntityMob)localarq.mob.getConstructor(new Class[] { World.class }).newInstance(new Object[] { world });
/* 209:    */             }
/* 210:    */             catch (Exception localException)
/* 211:    */             {
/* 212:215 */               localException.printStackTrace();
/* 213:216 */               continue;
/* 214:    */             }
/* 215:219 */             localxn.setPositionAndAngles(j + 0.5F, localdt.getY(), k + 0.5F, paramRandom.nextFloat() * 360.0F, 0.0F);
/* 216:    */             
/* 217:221 */             world.spawnEntity(localxn);
/* 218:222 */             localxq = localxn.beforeSpawn(world.E(new BlockPosition(localxn)), localxq);
/* 219:223 */             i2 = 1;
/* 220:    */           }
/* 221:226 */           j += paramRandom.nextInt(5) - paramRandom.nextInt(5);
/* 222:227 */           k += paramRandom.nextInt(5) - paramRandom.nextInt(5);
/* 223:228 */           while ((j < paramInt1) || (j >= paramInt1 + paramInt3) || (k < paramInt2) || (k >= paramInt2 + paramInt3))
/* 224:    */           {
/* 225:229 */             j = m + paramRandom.nextInt(5) - paramRandom.nextInt(5);
/* 226:230 */             k = n + paramRandom.nextInt(5) - paramRandom.nextInt(5);
/* 227:    */           }
/* 228:    */         }
/* 229:    */       }
/* 230:    */     }
/* 231:    */   }
/* 232:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     arg
 * JD-Core Version:    0.7.0.1
 */
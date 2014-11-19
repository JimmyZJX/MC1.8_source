package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class OreGenerator
/*  5:   */   extends TerrainGenerator
/*  6:   */ {
/*  7:   */   private final Block block;
/*  8:   */   private final int radius;
/*  9:   */   private final Predicate<Block> overwriteCondition;
/* 10:   */   
/* 11:   */   public OreGenerator(Block b, int r)
/* 12:   */   {
/* 13:20 */     this(b, r, BlockIs.instance(BlockList.stone));
/* 14:   */   }
/* 15:   */   
/* 16:   */   public OreGenerator(Block b, int r, Predicate<Block> overwriteCond)
/* 17:   */   {
/* 18:24 */     this.block = b;
/* 19:25 */     this.radius = r;
/* 20:26 */     this.overwriteCondition = overwriteCond;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public boolean generate(World world, Random random, BlockPosition chunkPos)
/* 24:   */   {
/* 25:31 */     float angle = random.nextFloat() * 3.141593F;
/* 26:   */     
/* 27:33 */     double x1 = chunkPos.getX() + 8 + MathUtils.sin(angle) * this.radius / 8.0F;
/* 28:34 */     double x2 = chunkPos.getX() + 8 - MathUtils.sin(angle) * this.radius / 8.0F;
/* 29:35 */     double z1 = chunkPos.getZ() + 8 + MathUtils.cos(angle) * this.radius / 8.0F;
/* 30:36 */     double z2 = chunkPos.getZ() + 8 - MathUtils.cos(angle) * this.radius / 8.0F;
/* 31:   */     
/* 32:38 */     double y1 = chunkPos.getY() + random.nextInt(3) - 2;
/* 33:39 */     double y2 = chunkPos.getY() + random.nextInt(3) - 2;
/* 34:41 */     for (int i = 0; i < this.radius; i++)
/* 35:   */     {
/* 36:42 */       float t = i / this.radius;
/* 37:43 */       double centerX = x1 + (x2 - x1) * t;
/* 38:44 */       double centerY = y1 + (y2 - y1) * t;
/* 39:45 */       double centerZ = z1 + (z2 - z1) * t;
/* 40:   */       
/* 41:47 */       double s = random.nextDouble() * this.radius / 16.0D;
/* 42:48 */       double hSize = (MathUtils.sin(3.141593F * t) + 1.0F) * s + 1.0D;
/* 43:49 */       double vSize = (MathUtils.sin(3.141593F * t) + 1.0F) * s + 1.0D;
/* 44:   */       
/* 45:51 */       int xMin = MathUtils.floor(centerX - hSize / 2.0D);
/* 46:52 */       int yMin = MathUtils.floor(centerY - vSize / 2.0D);
/* 47:53 */       int zMin = MathUtils.floor(centerZ - hSize / 2.0D);
/* 48:   */       
/* 49:55 */       int xMax = MathUtils.floor(centerX + hSize / 2.0D);
/* 50:56 */       int yMax = MathUtils.floor(centerY + vSize / 2.0D);
/* 51:57 */       int zMax = MathUtils.floor(centerZ + hSize / 2.0D);
/* 52:59 */       for (int x = xMin; x <= xMax; x++)
/* 53:   */       {
/* 54:60 */         double dx = (x + 0.5D - centerX) / (hSize / 2.0D);
/* 55:61 */         if (dx * dx < 1.0D) {
/* 56:62 */           for (int y = yMin; y <= yMax; y++)
/* 57:   */           {
/* 58:63 */             double dy = (y + 0.5D - centerY) / (vSize / 2.0D);
/* 59:64 */             if (dx * dx + dy * dy < 1.0D) {
/* 60:65 */               for (int z = zMin; z <= zMax; z++)
/* 61:   */               {
/* 62:66 */                 double dz = (z + 0.5D - centerZ) / (hSize / 2.0D);
/* 63:67 */                 if (dx * dx + dy * dy + dz * dz < 1.0D)
/* 64:   */                 {
/* 65:68 */                   BlockPosition pos = new BlockPosition(x, y, z);
/* 66:69 */                   if (this.overwriteCondition.apply(world.getBlock(pos))) {
/* 67:70 */                     world.setBlock(pos, this.block, 2);
/* 68:   */                   }
/* 69:   */                 }
/* 70:   */               }
/* 71:   */             }
/* 72:   */           }
/* 73:   */         }
/* 74:   */       }
/* 75:   */     }
/* 76:80 */     return true;
/* 77:   */   }
/* 78:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bif
 * JD-Core Version:    0.7.0.1
 */
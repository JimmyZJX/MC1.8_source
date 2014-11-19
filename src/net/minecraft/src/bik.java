package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bik
/*  4:   */   extends TerrainGenerator
/*  5:   */ {
/*  6:   */   private ProtoBlock block;
/*  7:   */   private int size;
/*  8:   */   
/*  9:   */   public bik(ProtoBlock b, int s)
/* 10:   */   {
/* 11:16 */     this.block = b;
/* 12:17 */     this.size = s;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition position)
/* 16:   */   {
/* 17:22 */     if (paramaqu.getBlock(position).getProto().getMaterial() != Material.water) {
/* 18:23 */       return false;
/* 19:   */     }
/* 20:25 */     int hSize = paramRandom.nextInt(this.size - 2) + 2;
/* 21:26 */     int vSize = 2;
/* 22:27 */     for (int x = position.getX() - hSize; x <= position.getX() + hSize; x++) {
/* 23:28 */       for (int z = position.getZ() - hSize; z <= position.getZ() + hSize; z++)
/* 24:   */       {
/* 25:29 */         int dx = x - position.getX();
/* 26:30 */         int dz = z - position.getZ();
/* 27:31 */         if (dx * dx + dz * dz <= hSize * hSize) {
/* 28:34 */           for (int y = position.getY() - vSize; y <= position.getY() + vSize; y++)
/* 29:   */           {
/* 30:35 */             BlockPosition pos = new BlockPosition(x, y, z);
/* 31:36 */             ProtoBlock oldBlock = paramaqu.getBlock(pos).getProto();
/* 32:37 */             if ((oldBlock == BlockList.dirt) || (oldBlock == BlockList.grass)) {
/* 33:38 */               paramaqu.setBlock(pos, this.block.instance(), 2);
/* 34:   */             }
/* 35:   */           }
/* 36:   */         }
/* 37:   */       }
/* 38:   */     }
/* 39:44 */     return true;
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bik
 * JD-Core Version:    0.7.0.1
 */
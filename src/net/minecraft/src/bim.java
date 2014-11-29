package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bim
/*  4:   */   extends TerrainGenerator
/*  5:   */ {
/*  6:   */   private BlockType a;
/*  7:   */   
/*  8:   */   public bim(BlockType paramatr)
/*  9:   */   {
/* 10:16 */     this.a = paramatr;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 14:   */   {
/* 15:21 */     if ((!paramaqu.isEmpty(paramdt)) || (paramaqu.getBlock(paramdt.down()).getType() != this.a)) {
/* 16:22 */       return false;
/* 17:   */     }
/* 18:24 */     int i = paramRandom.nextInt(32) + 6;
/* 19:25 */     int j = paramRandom.nextInt(4) + 1;
/* 20:   */     int m;
/* 21:   */     int n;
/* 22:   */     int i1;
/* 23:26 */     for (int k = paramdt.getX() - j; k <= paramdt.getX() + j; k++) {
/* 24:27 */       for (m = paramdt.getZ() - j; m <= paramdt.getZ() + j; m++)
/* 25:   */       {
/* 26:28 */         n = k - paramdt.getX();
/* 27:29 */         i1 = m - paramdt.getZ();
/* 28:30 */         if ((n * n + i1 * i1 <= j * j + 1) && 
/* 29:31 */           (paramaqu.getBlock(new BlockPosition(k, paramdt.getY() - 1, m)).getType() != this.a)) {
/* 30:32 */           return false;
/* 31:   */         }
/* 32:   */       }
/* 33:   */     }
/* 34:37 */     for (int k = paramdt.getY(); k < paramdt.getY() + i; k++)
/* 35:   */     {
/* 36:38 */       if (k >= 256) {
/* 37:   */         break;
/* 38:   */       }
/* 39:39 */       for (m = paramdt.getX() - j; m <= paramdt.getX() + j; m++) {
/* 40:40 */         for (n = paramdt.getZ() - j; n <= paramdt.getZ() + j; n++)
/* 41:   */         {
/* 42:41 */           i1 = m - paramdt.getX();
/* 43:42 */           int i2 = n - paramdt.getZ();
/* 44:43 */           if (i1 * i1 + i2 * i2 <= j * j + 1) {
/* 45:44 */             paramaqu.setBlock(new BlockPosition(m, k, n), BlockList.obsidian.instance(), 2);
/* 46:   */           }
/* 47:   */         }
/* 48:   */       }
/* 49:   */     }
/* 50:53 */     ada localada = new ada(paramaqu);
/* 51:54 */     localada.setPositionAndAngles(paramdt.getX() + 0.5F, paramdt.getY() + i, paramdt.getZ() + 0.5F, paramRandom.nextFloat() * 360.0F, 0.0F);
/* 52:55 */     paramaqu.spawnEntity(localada);
/* 53:56 */     paramaqu.setBlock(paramdt.up(i), BlockList.bedrock.instance(), 2);
/* 54:   */     
/* 55:58 */     return true;
/* 56:   */   }
/* 57:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bim
 * JD-Core Version:    0.7.0.1
 */
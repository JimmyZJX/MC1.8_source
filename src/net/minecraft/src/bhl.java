package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhl
/*  4:   */   extends TerrainGenerator
/*  5:   */ {
/*  6:   */   private BlockType a;
/*  7:   */   private int b;
/*  8:   */   
/*  9:   */   public bhl(int paramInt)
/* 10:   */   {
/* 11:16 */     this.a = BlockList.aL;
/* 12:17 */     this.b = paramInt;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 16:   */   {
/* 17:22 */     if (paramaqu.getBlock(paramdt).getType().getMaterial() != Material.water) {
/* 18:23 */       return false;
/* 19:   */     }
/* 20:25 */     int i = paramRandom.nextInt(this.b - 2) + 2;
/* 21:26 */     int j = 1;
/* 22:27 */     for (int k = paramdt.getX() - i; k <= paramdt.getX() + i; k++) {
/* 23:28 */       for (int m = paramdt.getZ() - i; m <= paramdt.getZ() + i; m++)
/* 24:   */       {
/* 25:29 */         int n = k - paramdt.getX();
/* 26:30 */         int i1 = m - paramdt.getZ();
/* 27:31 */         if (n * n + i1 * i1 <= i * i) {
/* 28:34 */           for (int i2 = paramdt.getY() - j; i2 <= paramdt.getY() + j; i2++)
/* 29:   */           {
/* 30:35 */             BlockPosition localdt = new BlockPosition(k, i2, m);
/* 31:36 */             BlockType localatr = paramaqu.getBlock(localdt).getType();
/* 32:37 */             if ((localatr == BlockList.dirt) || (localatr == BlockList.aL)) {
/* 33:38 */               paramaqu.setBlock(localdt, this.a.instance(), 2);
/* 34:   */             }
/* 35:   */           }
/* 36:   */         }
/* 37:   */       }
/* 38:   */     }
/* 39:44 */     return true;
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhl
 * JD-Core Version:    0.7.0.1
 */
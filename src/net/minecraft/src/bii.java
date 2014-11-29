package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bii
/*  4:   */   extends TerrainGenerator
/*  5:   */ {
/*  6:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  7:   */   {
/*  8:14 */     for (int i = 0; i < 20; i++)
/*  9:   */     {
/* 10:15 */       BlockPosition localdt1 = paramdt.offset(paramRandom.nextInt(4) - paramRandom.nextInt(4), 0, paramRandom.nextInt(4) - paramRandom.nextInt(4));
/* 11:17 */       if (paramaqu.isEmpty(localdt1))
/* 12:   */       {
/* 13:18 */         BlockPosition localdt2 = localdt1.down();
/* 14:20 */         if ((paramaqu.getBlock(localdt2.west()).getType().getMaterial() == Material.water) || (paramaqu.getBlock(localdt2.east()).getType().getMaterial() == Material.water) || (paramaqu.getBlock(localdt2.north()).getType().getMaterial() == Material.water) || (paramaqu.getBlock(localdt2.south()).getType().getMaterial() == Material.water))
/* 15:   */         {
/* 16:21 */           int j = 2 + paramRandom.nextInt(paramRandom.nextInt(3) + 1);
/* 17:22 */           for (int k = 0; k < j; k++) {
/* 18:23 */             if (BlockList.reeds.d(paramaqu, localdt1)) {
/* 19:24 */               paramaqu.setBlock(localdt1.up(k), BlockList.reeds.instance(), 2);
/* 20:   */             }
/* 21:   */           }
/* 22:   */         }
/* 23:   */       }
/* 24:   */     }
/* 25:31 */     return true;
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bii
 * JD-Core Version:    0.7.0.1
 */
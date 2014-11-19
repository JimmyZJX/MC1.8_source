package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bit
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  7:   */   {
/*  8:13 */     for (int i = 0; i < 10; i++)
/*  9:   */     {
/* 10:14 */       int j = paramdt.getX() + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 11:15 */       int k = paramdt.getY() + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 12:16 */       int m = paramdt.getZ() + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 13:17 */       if ((paramaqu.isEmpty(new BlockPosition(j, k, m))) && 
/* 14:18 */         (BlockList.waterLily.c(paramaqu, new BlockPosition(j, k, m)))) {
/* 15:19 */         paramaqu.setBlock(new BlockPosition(j, k, m), BlockList.waterLily.instance(), 2);
/* 16:   */       }
/* 17:   */     }
/* 18:24 */     return true;
/* 19:   */   }
/* 20:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bit
 * JD-Core Version:    0.7.0.1
 */
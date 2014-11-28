package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bid
/*  4:   */   extends TerrainGenerator
/*  5:   */ {
/*  6:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  7:   */   {
/*  8:13 */     for (int i = 0; i < 64; i++)
/*  9:   */     {
/* 10:14 */       BlockPosition localdt = paramdt.offset(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 11:15 */       if ((BlockList.melonBlock.c(paramaqu, localdt)) && (paramaqu.getBlock(localdt.down()).getProto() == BlockList.grass)) {
/* 12:16 */         paramaqu.setBlock(localdt, BlockList.melonBlock.instance(), 2);
/* 13:   */       }
/* 14:   */     }
/* 15:20 */     return true;
/* 16:   */   }
/* 17:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bid
 * JD-Core Version:    0.7.0.1
 */
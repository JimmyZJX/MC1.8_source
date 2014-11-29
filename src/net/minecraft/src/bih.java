package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bih
/*  4:   */   extends TerrainGenerator
/*  5:   */ {
/*  6:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  7:   */   {
/*  8:15 */     for (int i = 0; i < 64; i++)
/*  9:   */     {
/* 10:16 */       BlockPosition localdt = paramdt.offset(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 11:18 */       if ((paramaqu.isEmpty(localdt)) && (paramaqu.getBlock(localdt.down()).getType() == BlockList.grass) && 
/* 12:19 */         (BlockList.pumpkin.c(paramaqu, localdt))) {
/* 13:20 */         paramaqu.setBlock(localdt, BlockList.pumpkin.instance().setData(azk.facing, EnumHorizontalVertical.HORIZONTAL.getRandomDirection(paramRandom)), 2);
/* 14:   */       }
/* 15:   */     }
/* 16:25 */     return true;
/* 17:   */   }
/* 18:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bih
 * JD-Core Version:    0.7.0.1
 */
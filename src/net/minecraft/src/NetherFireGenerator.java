package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class NetherFireGenerator
/*  4:   */   extends TerrainGenerator
/*  5:   */ {
/*  6:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  7:   */   {
/*  8:13 */     for (int i = 0; i < 64; i++)
/*  9:   */     {
/* 10:14 */       BlockPosition localdt = paramdt.offset(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 11:15 */       if (paramaqu.isEmpty(localdt)) {
/* 12:18 */         if (paramaqu.getBlock(localdt.down()).getType() == BlockList.netherrack) {
/* 13:21 */           paramaqu.setBlock(localdt, BlockList.fire.instance(), 2);
/* 14:   */         }
/* 15:   */       }
/* 16:   */     }
/* 17:24 */     return true;
/* 18:   */   }
/* 19:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhs
 * JD-Core Version:    0.7.0.1
 */
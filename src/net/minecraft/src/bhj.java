package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhj
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  7:   */   {
/*  8:13 */     for (int i = 0; i < 10; i++)
/*  9:   */     {
/* 10:14 */       BlockPosition localdt = paramdt.offset(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 11:16 */       if (paramaqu.d(localdt))
/* 12:   */       {
/* 13:17 */         int j = 1 + paramRandom.nextInt(paramRandom.nextInt(3) + 1);
/* 14:18 */         for (int k = 0; k < j; k++) {
/* 15:19 */           if (BlockList.cactus.d(paramaqu, localdt)) {
/* 16:20 */             paramaqu.setBlock(localdt.up(k), BlockList.cactus.instance(), 2);
/* 17:   */           }
/* 18:   */         }
/* 19:   */       }
/* 20:   */     }
/* 21:26 */     return true;
/* 22:   */   }
/* 23:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhj
 * JD-Core Version:    0.7.0.1
 */